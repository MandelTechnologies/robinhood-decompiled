package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.FrameInfo;
import androidx.media3.common.PreviewingVideoGraph;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.CompositingVideoSinkProvider;
import androidx.media3.exoplayer.video.VideoFrameRenderControl;
import androidx.media3.exoplayer.video.VideoSink;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class CompositingVideoSinkProvider implements VideoSinkProvider, VideoGraph.Listener {
    private static final Executor NO_OP_EXECUTOR = new Executor() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            CompositingVideoSinkProvider.$r8$lambda$lk3rHqsqCZNBfYhevuuRP0Dt9tM(runnable);
        }
    };
    private long bufferTimestampAdjustmentUs;
    private final Clock clock;
    private final Context context;
    private Pair<Surface, Size> currentSurfaceAndSize;
    private HandlerWrapper handler;
    private final CopyOnWriteArraySet<Listener> listeners;
    private Format outputFormat;
    private int pendingFlushCount;
    private final PreviewingVideoGraph.Factory previewingVideoGraphFactory;
    private int state;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameRenderControl videoFrameRenderControl;
    private PreviewingVideoGraph videoGraph;
    private final VideoSinkImpl videoSinkImpl;

    public interface Listener {
        void onFirstFrameRendered(CompositingVideoSinkProvider compositingVideoSinkProvider);

        void onFrameDropped(CompositingVideoSinkProvider compositingVideoSinkProvider);

        void onVideoSizeChanged(CompositingVideoSinkProvider compositingVideoSinkProvider, VideoSize videoSize);
    }

    public static /* synthetic */ void $r8$lambda$lk3rHqsqCZNBfYhevuuRP0Dt9tM(Runnable runnable) {
    }

    public static final class Builder {
        private boolean built;
        private Clock clock = Clock.DEFAULT;
        private final Context context;
        private PreviewingVideoGraph.Factory previewingVideoGraphFactory;
        private VideoFrameProcessor.Factory videoFrameProcessorFactory;
        private final VideoFrameReleaseControl videoFrameReleaseControl;

        public Builder(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
            this.context = context.getApplicationContext();
            this.videoFrameReleaseControl = videoFrameReleaseControl;
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public CompositingVideoSinkProvider build() {
            Assertions.checkState(!this.built);
            if (this.previewingVideoGraphFactory == null) {
                if (this.videoFrameProcessorFactory == null) {
                    this.videoFrameProcessorFactory = new ReflectiveDefaultVideoFrameProcessorFactory();
                }
                this.previewingVideoGraphFactory = new ReflectivePreviewingSingleInputVideoGraphFactory(this.videoFrameProcessorFactory);
            }
            CompositingVideoSinkProvider compositingVideoSinkProvider = new CompositingVideoSinkProvider(this);
            this.built = true;
            return compositingVideoSinkProvider;
        }
    }

    private CompositingVideoSinkProvider(Builder builder) {
        Context context = builder.context;
        this.context = context;
        VideoSinkImpl videoSinkImpl = new VideoSinkImpl(context);
        this.videoSinkImpl = videoSinkImpl;
        Clock clock = builder.clock;
        this.clock = clock;
        VideoFrameReleaseControl videoFrameReleaseControl = builder.videoFrameReleaseControl;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        videoFrameReleaseControl.setClock(clock);
        this.videoFrameRenderControl = new VideoFrameRenderControl(new FrameRendererImpl(), videoFrameReleaseControl);
        this.previewingVideoGraphFactory = (PreviewingVideoGraph.Factory) Assertions.checkStateNotNull(builder.previewingVideoGraphFactory);
        this.listeners = new CopyOnWriteArraySet<>();
        this.state = 0;
        addListener(videoSinkImpl);
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public VideoFrameReleaseControl getVideoFrameReleaseControl() {
        return this.videoFrameReleaseControl;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public VideoSink getSink() {
        return this.videoSinkImpl;
    }

    public void setOutputSurfaceInfo(Surface surface, Size size) {
        Pair<Surface, Size> pair = this.currentSurfaceAndSize;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) this.currentSurfaceAndSize.second).equals(size)) {
            return;
        }
        this.currentSurfaceAndSize = Pair.create(surface, size);
        maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
    }

    public void clearOutputSurfaceInfo() {
        Size size = Size.UNKNOWN;
        maybeSetOutputSurfaceInfo(null, size.getWidth(), size.getHeight());
        this.currentSurfaceAndSize = null;
    }

    public void release() {
        if (this.state == 2) {
            return;
        }
        HandlerWrapper handlerWrapper = this.handler;
        if (handlerWrapper != null) {
            handlerWrapper.removeCallbacksAndMessages(null);
        }
        PreviewingVideoGraph previewingVideoGraph = this.videoGraph;
        if (previewingVideoGraph != null) {
            previewingVideoGraph.release();
        }
        this.currentSurfaceAndSize = null;
        this.state = 2;
    }

    public void render(long j, long j2) throws ExoPlaybackException {
        if (this.pendingFlushCount == 0) {
            this.videoFrameRenderControl.render(j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VideoFrameProcessor initialize(Format format2) throws VideoSink.VideoSinkException {
        Assertions.checkState(this.state == 0);
        ColorInfo adjustedInputColorInfo = getAdjustedInputColorInfo(format2.colorInfo);
        if (adjustedInputColorInfo.colorTransfer == 7 && Util.SDK_INT < 34) {
            adjustedInputColorInfo = adjustedInputColorInfo.buildUpon().setColorTransfer(6).build();
        }
        ColorInfo colorInfo = adjustedInputColorInfo;
        final HandlerWrapper handlerWrapperCreateHandler = this.clock.createHandler((Looper) Assertions.checkStateNotNull(Looper.myLooper()), null);
        this.handler = handlerWrapperCreateHandler;
        try {
            PreviewingVideoGraph.Factory factory = this.previewingVideoGraphFactory;
            Context context = this.context;
            DebugViewProvider debugViewProvider = DebugViewProvider.NONE;
            Objects.requireNonNull(handlerWrapperCreateHandler);
            try {
                this.videoGraph = factory.create(context, colorInfo, debugViewProvider, this, new Executor() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handlerWrapperCreateHandler.post(runnable);
                    }
                }, ImmutableList.m999of(), 0L);
                Pair<Surface, Size> pair = this.currentSurfaceAndSize;
                if (pair != null) {
                    Surface surface = (Surface) pair.first;
                    Size size = (Size) pair.second;
                    maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
                }
                this.videoGraph.registerInput(0);
                this.state = 1;
                return this.videoGraph.getProcessor(0);
            } catch (VideoFrameProcessingException e) {
                e = e;
                throw new VideoSink.VideoSinkException(e, format2);
            }
        } catch (VideoFrameProcessingException e2) {
            e = e2;
        }
    }

    private boolean isInitialized() {
        return this.state == 1;
    }

    private void maybeSetOutputSurfaceInfo(Surface surface, int i, int i2) {
        if (this.videoGraph != null) {
            this.videoGraph.setOutputSurfaceInfo(surface != null ? new SurfaceInfo(surface, i, i2) : null);
            this.videoFrameReleaseControl.setOutputSurface(surface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReady() {
        return this.pendingFlushCount == 0 && this.videoFrameRenderControl.isReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasReleasedFrame(long j) {
        return this.pendingFlushCount == 0 && this.videoFrameRenderControl.hasReleasedFrame(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush() {
        if (isInitialized()) {
            this.pendingFlushCount++;
            this.videoFrameRenderControl.flush();
            ((HandlerWrapper) Assertions.checkStateNotNull(this.handler)).post(new Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.flushInternal();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flushInternal() {
        int i = this.pendingFlushCount - 1;
        this.pendingFlushCount = i;
        if (i > 0) {
            return;
        }
        if (i < 0) {
            throw new IllegalStateException(String.valueOf(this.pendingFlushCount));
        }
        this.videoFrameRenderControl.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        this.videoFrameRenderControl.setPlaybackSpeed(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStreamOffsetChange(long j, long j2, long j3) {
        this.bufferTimestampAdjustmentUs = j;
        this.videoFrameRenderControl.onStreamOffsetChange(j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ColorInfo getAdjustedInputColorInfo(ColorInfo colorInfo) {
        return (colorInfo == null || !colorInfo.isDataSpaceValid()) ? ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class VideoSinkImpl implements VideoSink, Listener {
        private final Context context;
        private boolean hasRegisteredFirstInputStream;
        private long inputBufferTimestampAdjustmentUs;
        private Format inputFormat;
        private long inputStreamOffsetUs;
        private int inputType;
        private long pendingInputStreamBufferPresentationTimeUs;
        private boolean pendingInputStreamOffsetChange;
        private Effect rotationEffect;
        private VideoFrameProcessor videoFrameProcessor;
        private final int videoFrameProcessorMaxPendingFrameCount;
        private final ArrayList<Effect> videoEffects = new ArrayList<>();
        private long finalBufferPresentationTimeUs = -9223372036854775807L;
        private long lastBufferPresentationTimeUs = -9223372036854775807L;
        private VideoSink.Listener listener = VideoSink.Listener.NO_OP;
        private Executor listenerExecutor = CompositingVideoSinkProvider.NO_OP_EXECUTOR;

        public VideoSinkImpl(Context context) {
            this.context = context;
            this.videoFrameProcessorMaxPendingFrameCount = Util.getMaxPendingFramesCountForMediaCodecDecoders(context);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererEnabled(boolean z) {
            CompositingVideoSinkProvider.this.videoFrameReleaseControl.onEnabled(z);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererDisabled() {
            CompositingVideoSinkProvider.this.videoFrameReleaseControl.onDisabled();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererStarted() {
            CompositingVideoSinkProvider.this.videoFrameReleaseControl.onStarted();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererStopped() {
            CompositingVideoSinkProvider.this.videoFrameReleaseControl.onStopped();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setListener(VideoSink.Listener listener, Executor executor) {
            this.listener = listener;
            this.listenerExecutor = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void initialize(Format format2) throws VideoSink.VideoSinkException {
            Assertions.checkState(!isInitialized());
            this.videoFrameProcessor = CompositingVideoSinkProvider.this.initialize(format2);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isInitialized() {
            return this.videoFrameProcessor != null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void flush(boolean z) {
            if (isInitialized()) {
                this.videoFrameProcessor.flush();
            }
            this.hasRegisteredFirstInputStream = false;
            this.finalBufferPresentationTimeUs = -9223372036854775807L;
            this.lastBufferPresentationTimeUs = -9223372036854775807L;
            CompositingVideoSinkProvider.this.flush();
            if (z) {
                CompositingVideoSinkProvider.this.videoFrameReleaseControl.reset();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isReady() {
            return isInitialized() && CompositingVideoSinkProvider.this.isReady();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isEnded() {
            if (!isInitialized()) {
                return false;
            }
            long j = this.finalBufferPresentationTimeUs;
            return j != -9223372036854775807L && CompositingVideoSinkProvider.this.hasReleasedFrame(j);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void registerInputStream(int i, Format format2) {
            int i2;
            Format format3;
            Assertions.checkState(isInitialized());
            if (i == 1 || i == 2) {
                CompositingVideoSinkProvider.this.videoFrameReleaseControl.setFrameRate(format2.frameRate);
                if (i == 1 && Util.SDK_INT < 21 && (i2 = format2.rotationDegrees) != -1 && i2 != 0) {
                    if (this.rotationEffect == null || (format3 = this.inputFormat) == null || format3.rotationDegrees != i2) {
                        this.rotationEffect = ScaleAndRotateAccessor.createRotationEffect(i2);
                    }
                } else {
                    this.rotationEffect = null;
                }
                this.inputType = i;
                this.inputFormat = format2;
                if (!this.hasRegisteredFirstInputStream) {
                    maybeRegisterInputStream();
                    this.hasRegisteredFirstInputStream = true;
                    this.pendingInputStreamBufferPresentationTimeUs = -9223372036854775807L;
                    return;
                } else {
                    Assertions.checkState(this.lastBufferPresentationTimeUs != -9223372036854775807L);
                    this.pendingInputStreamBufferPresentationTimeUs = this.lastBufferPresentationTimeUs;
                    return;
                }
            }
            throw new UnsupportedOperationException("Unsupported input type " + i);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isFrameDropAllowedOnInput() {
            return Util.isFrameDropAllowedOnSurfaceInput(this.context);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface getInputSurface() {
            Assertions.checkState(isInitialized());
            return ((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).getInputSurface();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
            CompositingVideoSinkProvider.this.setVideoFrameMetadataListener(videoFrameMetadataListener);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setPlaybackSpeed(float f) {
            CompositingVideoSinkProvider.this.setPlaybackSpeed(f);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoEffects(List<Effect> list) {
            if (this.videoEffects.equals(list)) {
                return;
            }
            setPendingVideoEffects(list);
            maybeRegisterInputStream();
        }

        public void setPendingVideoEffects(List<Effect> list) {
            this.videoEffects.clear();
            this.videoEffects.addAll(list);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setStreamOffsetAndAdjustmentUs(long j, long j2) {
            this.pendingInputStreamOffsetChange |= (this.inputStreamOffsetUs == j && this.inputBufferTimestampAdjustmentUs == j2) ? false : true;
            this.inputStreamOffsetUs = j;
            this.inputBufferTimestampAdjustmentUs = j2;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setOutputSurfaceInfo(Surface surface, Size size) {
            CompositingVideoSinkProvider.this.setOutputSurfaceInfo(surface, size);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void clearOutputSurfaceInfo() {
            CompositingVideoSinkProvider.this.clearOutputSurfaceInfo();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void enableMayRenderStartOfStream() {
            CompositingVideoSinkProvider.this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public long registerInputFrame(long j, boolean z) {
            Assertions.checkState(isInitialized());
            Assertions.checkState(this.videoFrameProcessorMaxPendingFrameCount != -1);
            long j2 = this.pendingInputStreamBufferPresentationTimeUs;
            if (j2 != -9223372036854775807L) {
                if (!CompositingVideoSinkProvider.this.hasReleasedFrame(j2)) {
                    return -9223372036854775807L;
                }
                maybeRegisterInputStream();
                this.pendingInputStreamBufferPresentationTimeUs = -9223372036854775807L;
            }
            if (((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).getPendingInputFrameCount() >= this.videoFrameProcessorMaxPendingFrameCount || !((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).registerInputFrame()) {
                return -9223372036854775807L;
            }
            long j3 = j - this.inputBufferTimestampAdjustmentUs;
            maybeSetStreamOffsetChange(j3);
            this.lastBufferPresentationTimeUs = j3;
            if (z) {
                this.finalBufferPresentationTimeUs = j3;
            }
            return j * 1000;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void render(long j, long j2) throws VideoSink.VideoSinkException {
            try {
                CompositingVideoSinkProvider.this.render(j, j2);
            } catch (ExoPlaybackException e) {
                Format formatBuild = this.inputFormat;
                if (formatBuild == null) {
                    formatBuild = new Format.Builder().build();
                }
                throw new VideoSink.VideoSinkException(e, formatBuild);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            CompositingVideoSinkProvider.this.release();
        }

        private void maybeSetStreamOffsetChange(long j) {
            if (this.pendingInputStreamOffsetChange) {
                CompositingVideoSinkProvider.this.onStreamOffsetChange(this.inputBufferTimestampAdjustmentUs, j, this.inputStreamOffsetUs);
                this.pendingInputStreamOffsetChange = false;
            }
        }

        private void maybeRegisterInputStream() {
            if (this.inputFormat == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Effect effect = this.rotationEffect;
            if (effect != null) {
                arrayList.add(effect);
            }
            arrayList.addAll(this.videoEffects);
            Format format2 = (Format) Assertions.checkNotNull(this.inputFormat);
            ((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).registerInputStream(this.inputType, arrayList, new FrameInfo.Builder(CompositingVideoSinkProvider.getAdjustedInputColorInfo(format2.colorInfo), format2.width, format2.height).setPixelWidthHeightRatio(format2.pixelWidthHeightRatio).build());
            this.finalBufferPresentationTimeUs = -9223372036854775807L;
        }

        @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
        public void onFirstFrameRendered(CompositingVideoSinkProvider compositingVideoSinkProvider) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$VideoSinkImpl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    CompositingVideoSinkProvider.VideoSinkImpl.$r8$lambda$VnvPPMG0KnsEldRmyuagtPn0pFg(this.f$0, listener);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$VnvPPMG0KnsEldRmyuagtPn0pFg(VideoSinkImpl videoSinkImpl, VideoSink.Listener listener) {
            videoSinkImpl.getClass();
            listener.onFirstFrameRendered(videoSinkImpl);
        }

        @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
        public void onFrameDropped(CompositingVideoSinkProvider compositingVideoSinkProvider) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$VideoSinkImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    CompositingVideoSinkProvider.VideoSinkImpl.$r8$lambda$CsXRAhqkc6uirvlMvje7d2SEMHA(this.f$0, listener);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$CsXRAhqkc6uirvlMvje7d2SEMHA(VideoSinkImpl videoSinkImpl, VideoSink.Listener listener) {
            videoSinkImpl.getClass();
            listener.onFrameDropped((VideoSink) Assertions.checkStateNotNull(videoSinkImpl));
        }

        @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
        public void onVideoSizeChanged(CompositingVideoSinkProvider compositingVideoSinkProvider, final VideoSize videoSize) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$VideoSinkImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CompositingVideoSinkProvider.VideoSinkImpl.m8298$r8$lambda$nVxTlzYyFz4dImDRyaP44zooqI(this.f$0, listener, videoSize);
                }
            });
        }

        /* renamed from: $r8$lambda$nVxTlzYyFz4dImDRya-P44zooqI, reason: not valid java name */
        public static /* synthetic */ void m8298$r8$lambda$nVxTlzYyFz4dImDRyaP44zooqI(VideoSinkImpl videoSinkImpl, VideoSink.Listener listener, VideoSize videoSize) {
            videoSinkImpl.getClass();
            listener.onVideoSizeChanged(videoSinkImpl, videoSize);
        }
    }

    private final class FrameRendererImpl implements VideoFrameRenderControl.FrameRenderer {
        private FrameRendererImpl() {
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void onVideoSizeChanged(VideoSize videoSize) {
            CompositingVideoSinkProvider.this.outputFormat = new Format.Builder().setWidth(videoSize.width).setHeight(videoSize.height).setSampleMimeType("video/raw").build();
            Iterator it = CompositingVideoSinkProvider.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onVideoSizeChanged(CompositingVideoSinkProvider.this, videoSize);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void renderFrame(long j, long j2, long j3, boolean z) {
            if (z && CompositingVideoSinkProvider.this.currentSurfaceAndSize != null) {
                Iterator it = CompositingVideoSinkProvider.this.listeners.iterator();
                while (it.hasNext()) {
                    ((Listener) it.next()).onFirstFrameRendered(CompositingVideoSinkProvider.this);
                }
            }
            if (CompositingVideoSinkProvider.this.videoFrameMetadataListener != null) {
                CompositingVideoSinkProvider.this.videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j2, CompositingVideoSinkProvider.this.clock.nanoTime(), CompositingVideoSinkProvider.this.outputFormat == null ? new Format.Builder().build() : CompositingVideoSinkProvider.this.outputFormat, null);
            }
            ((PreviewingVideoGraph) Assertions.checkStateNotNull(CompositingVideoSinkProvider.this.videoGraph)).renderOutputFrame(j);
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void dropFrame() {
            Iterator it = CompositingVideoSinkProvider.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onFrameDropped(CompositingVideoSinkProvider.this);
            }
            ((PreviewingVideoGraph) Assertions.checkStateNotNull(CompositingVideoSinkProvider.this.videoGraph)).renderOutputFrame(-2L);
        }
    }

    private static final class ReflectivePreviewingSingleInputVideoGraphFactory implements PreviewingVideoGraph.Factory {
        private final VideoFrameProcessor.Factory videoFrameProcessorFactory;

        public ReflectivePreviewingSingleInputVideoGraphFactory(VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
        }

        @Override // androidx.media3.common.PreviewingVideoGraph.Factory
        public PreviewingVideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, List<Effect> list, long j) throws VideoFrameProcessingException {
            try {
                return ((PreviewingVideoGraph.Factory) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class).newInstance(this.videoFrameProcessorFactory)).create(context, colorInfo, debugViewProvider, listener, executor, list, j);
            } catch (Exception e) {
                throw VideoFrameProcessingException.from(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ReflectiveDefaultVideoFrameProcessorFactory implements VideoFrameProcessor.Factory {
        private static final Supplier<VideoFrameProcessor.Factory> VIDEO_FRAME_PROCESSOR_FACTORY_SUPPLIER = Suppliers.memoize(new Supplier() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$ReflectiveDefaultVideoFrameProcessorFactory$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return CompositingVideoSinkProvider.ReflectiveDefaultVideoFrameProcessorFactory.$r8$lambda$TJ59_YgST3VJV61yINw6I4DUL8w();
            }
        });

        private ReflectiveDefaultVideoFrameProcessorFactory() {
        }

        public static /* synthetic */ VideoFrameProcessor.Factory $r8$lambda$TJ59_YgST3VJV61yINw6I4DUL8w() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (VideoFrameProcessor.Factory) Assertions.checkNotNull(cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null));
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    private static final class ScaleAndRotateAccessor {
        private static Method buildScaleAndRotateTransformationMethod;
        private static Constructor<?> scaleAndRotateTransformationBuilderConstructor;
        private static Method setRotationMethod;

        public static Effect createRotationEffect(float f) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            try {
                prepare();
                Object objNewInstance = scaleAndRotateTransformationBuilderConstructor.newInstance(null);
                setRotationMethod.invoke(objNewInstance, Float.valueOf(f));
                return (Effect) Assertions.checkNotNull(buildScaleAndRotateTransformationMethod.invoke(objNewInstance, null));
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }

        private static void prepare() throws NoSuchMethodException, ClassNotFoundException {
            if (scaleAndRotateTransformationBuilderConstructor == null || setRotationMethod == null || buildScaleAndRotateTransformationMethod == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                scaleAndRotateTransformationBuilderConstructor = cls.getConstructor(null);
                setRotationMethod = cls.getMethod("setRotationDegrees", Float.TYPE);
                buildScaleAndRotateTransformationMethod = cls.getMethod("build", null);
            }
        }
    }
}

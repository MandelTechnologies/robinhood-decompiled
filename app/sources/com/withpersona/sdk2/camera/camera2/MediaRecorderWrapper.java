package com.withpersona.sdk2.camera.camera2;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.view.Surface;
import com.withpersona.sdk2.camera.AudioConfiguration;
import com.withpersona.sdk2.camera.AudioUtils2;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: MediaRecorderWrapper.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 62\u00020\u0001:\u00016B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0086@¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R*\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010#R\u0011\u00105\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00067"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/MediaRecorderWrapper;", "", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/camera/camera2/CameraChoice;", "cameraChoice", "", "fps", "orientationHint", "", "isAudioRequired", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/camera2/CameraChoice;IIZ)V", "isInitialPrepare", "", "prepareMediaRecorder", "(Z)V", "newRecordSession", "Ljava/io/File;", "newFile", "()Ljava/io/File;", "Landroid/media/MediaRecorder;", "newMediaRecorder", "()Landroid/media/MediaRecorder;", "getBitrate", "()I", "startRecording", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopRecording", "destroy", "()V", "prepare", "Landroid/content/Context;", "Lcom/withpersona/sdk2/camera/camera2/CameraChoice;", "I", "Z", "Lkotlin/Function0;", "onSurfaceChanged", "Lkotlin/jvm/functions/Function0;", "getOnSurfaceChanged", "()Lkotlin/jvm/functions/Function0;", "setOnSurfaceChanged", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/Surface;", "_surface", "Landroid/view/Surface;", "currentFile", "Ljava/io/File;", "mediaRecorder", "Landroid/media/MediaRecorder;", "isPrepared", "getSurface", "()Landroid/view/Surface;", "surface", "Companion", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class MediaRecorderWrapper {
    private static final boolean USE_PERSISTENT_SURFACE = true;
    private final Surface _surface;
    private final CameraChoice cameraChoice;
    private final Context context;
    private File currentFile;
    private final int fps;
    private final boolean isAudioRequired;
    private boolean isPrepared;
    private MediaRecorder mediaRecorder;
    private Function0<Unit> onSurfaceChanged;
    private final int orientationHint;

    public MediaRecorderWrapper(Context context, CameraChoice cameraChoice, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraChoice, "cameraChoice");
        this.context = context;
        this.cameraChoice = cameraChoice;
        this.fps = i;
        this.orientationHint = i2;
        this.isAudioRequired = z;
        this._surface = USE_PERSISTENT_SURFACE ? MediaCodec.createPersistentInputSurface() : null;
        this.currentFile = newFile();
        this.mediaRecorder = newMediaRecorder();
    }

    public final void setOnSurfaceChanged(Function0<Unit> function0) {
        this.onSurfaceChanged = function0;
    }

    public final Surface getSurface() {
        Surface surface = this._surface;
        if (surface != null) {
            return surface;
        }
        Surface surface2 = this.mediaRecorder.getSurface();
        Intrinsics.checkNotNullExpressionValue(surface2, "getSurface(...)");
        return surface2;
    }

    /* compiled from: MediaRecorderWrapper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$startRecording$2", m3645f = "MediaRecorderWrapper.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$startRecording$2 */
    static final class C435572 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C435572(Continuation<? super C435572> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MediaRecorderWrapper.this.new C435572(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435572) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    MediaRecorderWrapper.this.mediaRecorder.start();
                } catch (IllegalStateException unused) {
                    MediaRecorderWrapper.this.mediaRecorder.reset();
                    MediaRecorderWrapper.this.newRecordSession(false);
                    MediaRecorderWrapper.this.mediaRecorder.start();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object startRecording(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getDefault(), new C435572(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* compiled from: MediaRecorderWrapper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$stopRecording$2", m3645f = "MediaRecorderWrapper.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$stopRecording$2 */
    static final class C435582 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super File>, Object> {
        int label;

        C435582(Continuation<? super C435582> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MediaRecorderWrapper.this.new C435582(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((C435582) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            File file;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    MediaRecorderWrapper.this.mediaRecorder.stop();
                    file = MediaRecorderWrapper.this.currentFile;
                } catch (RuntimeException unused) {
                    MediaRecorderWrapper.this.currentFile.delete();
                    file = null;
                }
                MediaRecorderWrapper.this.mediaRecorder.release();
                MediaRecorderWrapper mediaRecorderWrapper = MediaRecorderWrapper.this;
                mediaRecorderWrapper.mediaRecorder = mediaRecorderWrapper.newMediaRecorder();
                MediaRecorderWrapper.this.newRecordSession(false);
                return file;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object stopRecording(Continuation<? super File> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new C435582(null), continuation);
    }

    public final void destroy() {
        try {
            getSurface().release();
        } catch (RuntimeException unused) {
        }
        try {
            this.mediaRecorder.stop();
        } catch (RuntimeException unused2) {
        } catch (Throwable th) {
            this.currentFile.delete();
            throw th;
        }
        this.currentFile.delete();
    }

    private final void prepareMediaRecorder(boolean isInitialPrepare) throws Throwable {
        Function0<Unit> function0;
        boolean z = ContextUtils3.isMicPresent(this.context) && this.isAudioRequired;
        this.mediaRecorder.setVideoSource(2);
        if (z) {
            this.mediaRecorder.setAudioSource(1);
        }
        this.mediaRecorder.setOutputFormat(2);
        this.mediaRecorder.setVideoFrameRate(this.fps);
        this.mediaRecorder.setVideoSize(this.cameraChoice.getSize().getWidth(), this.cameraChoice.getSize().getHeight());
        this.mediaRecorder.setVideoEncoder(2);
        this.mediaRecorder.setVideoEncodingBitRate(getBitrate());
        if (z) {
            AudioConfiguration validAudioConfiguration = AudioUtils2.getValidAudioConfiguration();
            if (validAudioConfiguration != null) {
                this.mediaRecorder.setAudioSamplingRate(validAudioConfiguration.getSampleRateInHz());
                this.mediaRecorder.setAudioChannels(1);
            }
            this.mediaRecorder.setAudioEncoder(3);
        }
        this.mediaRecorder.setOrientationHint(this.orientationHint);
        boolean z2 = USE_PERSISTENT_SURFACE;
        if (z2) {
            this.mediaRecorder.setInputSurface(getSurface());
        }
        this.mediaRecorder.setOutputFile(this.currentFile.getAbsolutePath());
        this.mediaRecorder.prepare();
        if (z2 || isInitialPrepare || (function0 = this.onSurfaceChanged) == null) {
            return;
        }
        function0.invoke();
    }

    public final void prepare() {
        if (this.isPrepared) {
            return;
        }
        this.isPrepared = true;
        newRecordSession(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void newRecordSession(boolean isInitialPrepare) throws Throwable {
        if (!isInitialPrepare) {
            this.currentFile = newFile();
        }
        prepareMediaRecorder(isInitialPrepare);
    }

    private final File newFile() {
        return new File(this.context.getCacheDir(), "video_recording_" + System.currentTimeMillis() + ".mp4");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaRecorder newMediaRecorder() {
        if (Build.VERSION.SDK_INT >= 31) {
            MediaRecorderWrapper$$ExternalSyntheticApiModelOutline1.m3210m();
            return MediaRecorderWrapper$$ExternalSyntheticApiModelOutline0.m3209m(this.context);
        }
        return new MediaRecorder();
    }

    private final int getBitrate() {
        int width = this.cameraChoice.getSize().getWidth() * this.cameraChoice.getSize().getHeight();
        if (width <= 172800) {
            return 400000;
        }
        if (width <= 409920) {
            return 500000;
        }
        if (width <= 921600) {
            return 1500000;
        }
        if (width <= 2073600) {
            return 3000000;
        }
        return width <= 3686400 ? 6000000 : 10000000;
    }
}

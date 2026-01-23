package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.core.util.Preconditions;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class ImageAnalysis extends UseCase {
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final Boolean DEFAULT_ONE_PIXEL_SHIFT_ENABLED = null;
    private final Object mAnalysisLock;
    private SessionConfig.CloseableErrorListener mCloseableErrorListener;
    private DeferrableSurface mDeferrableSurface;
    final ImageAnalysisAbstractAnalyzer mImageAnalysisAbstractAnalyzer;
    SessionConfig.Builder mSessionConfigBuilder;
    private Analyzer mSubscribedAnalyzer;

    public interface Analyzer {
        void analyze(ImageProxy imageProxy);

        default Size getDefaultTargetResolution() {
            return null;
        }

        default int getTargetCoordinateSystem() {
            return 0;
        }

        default void updateTransform(Matrix matrix) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BackpressureStrategy {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputImageFormat {
    }

    ImageAnalysis(ImageAnalysisConfig imageAnalysisConfig) {
        super(imageAnalysisConfig);
        this.mAnalysisLock = new Object();
        if (((ImageAnalysisConfig) getCurrentConfig()).getBackpressureStrategy(0) == 1) {
            this.mImageAnalysisAbstractAnalyzer = new ImageAnalysisBlockingAnalyzer();
        } else {
            this.mImageAnalysisAbstractAnalyzer = new ImageAnalysisNonBlockingAnalyzer(imageAnalysisConfig.getBackgroundExecutor(CameraXExecutors.highPriorityExecutor()));
        }
        this.mImageAnalysisAbstractAnalyzer.setOutputImageFormat(getOutputImageFormat());
        this.mImageAnalysisAbstractAnalyzer.setOutputImageRotationEnabled(isOutputImageRotationEnabled());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.core.UseCase
    protected UseCaseConfig<?> onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) {
        final Size defaultTargetResolution;
        ResolutionSelector.Builder builderFromResolutionSelector;
        Boolean onePixelShiftEnabled = getOnePixelShiftEnabled();
        boolean zContains = cameraInfoInternal.getCameraQuirks().contains(OnePixelShiftQuirk.class);
        ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.mImageAnalysisAbstractAnalyzer;
        if (onePixelShiftEnabled != null) {
            zContains = onePixelShiftEnabled.booleanValue();
        }
        imageAnalysisAbstractAnalyzer.setOnePixelShiftEnabled(zContains);
        synchronized (this.mAnalysisLock) {
            try {
                Analyzer analyzer = this.mSubscribedAnalyzer;
                defaultTargetResolution = analyzer != null ? analyzer.getDefaultTargetResolution() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (defaultTargetResolution == null) {
            return builder.getUseCaseConfig();
        }
        if (cameraInfoInternal.getSensorRotationDegrees(((Integer) builder.getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION, 0)).intValue()) % EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE == 90) {
            defaultTargetResolution = new Size(defaultTargetResolution.getHeight(), defaultTargetResolution.getWidth());
        }
        UseCaseConfig useCaseConfig = builder.getUseCaseConfig();
        Config.Option<Size> option = ImageOutputConfig.OPTION_TARGET_RESOLUTION;
        if (!useCaseConfig.containsOption(option)) {
            builder.getMutableConfig().insertOption(option, defaultTargetResolution);
        }
        UseCaseConfig useCaseConfig2 = builder.getUseCaseConfig();
        Config.Option option2 = ImageOutputConfig.OPTION_RESOLUTION_SELECTOR;
        if (useCaseConfig2.containsOption(option2)) {
            ResolutionSelector resolutionSelector = (ResolutionSelector) getAppConfig().retrieveOption(option2, null);
            if (resolutionSelector == null) {
                builderFromResolutionSelector = new ResolutionSelector.Builder();
            } else {
                builderFromResolutionSelector = ResolutionSelector.Builder.fromResolutionSelector(resolutionSelector);
            }
            if (resolutionSelector == null || resolutionSelector.getResolutionStrategy() == null) {
                builderFromResolutionSelector.setResolutionStrategy(new ResolutionStrategy(defaultTargetResolution, 1));
            }
            if (resolutionSelector == null) {
                builderFromResolutionSelector.setResolutionFilter(new ResolutionFilter() { // from class: androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda3
                    @Override // androidx.camera.core.resolutionselector.ResolutionFilter
                    public final List filter(List list, int i) {
                        return ImageAnalysis.$r8$lambda$w6Q48e4yjMnHzk22tNvPV7OIPEg(defaultTargetResolution, list, i);
                    }
                });
            }
            builder.getMutableConfig().insertOption(option2, builderFromResolutionSelector.build());
        }
        return builder.getUseCaseConfig();
    }

    public static /* synthetic */ List $r8$lambda$w6Q48e4yjMnHzk22tNvPV7OIPEg(Size size, List list, int i) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    SessionConfig.Builder createPipeline(String str, ImageAnalysisConfig imageAnalysisConfig, StreamSpec streamSpec) {
        final SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        Threads.checkMainThread();
        Size resolution = streamSpec.getResolution();
        Executor executor = (Executor) Preconditions.checkNotNull(imageAnalysisConfig.getBackgroundExecutor(CameraXExecutors.highPriorityExecutor()));
        boolean z = true;
        int imageQueueDepth = getBackpressureStrategy() == 1 ? getImageQueueDepth() : 4;
        if (imageAnalysisConfig.getImageReaderProxyProvider() != null) {
            safeCloseImageReaderProxy = new SafeCloseImageReaderProxy(imageAnalysisConfig.getImageReaderProxyProvider().newInstance(resolution.getWidth(), resolution.getHeight(), getImageFormat(), imageQueueDepth, 0L));
        } else {
            safeCloseImageReaderProxy = new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(resolution.getWidth(), resolution.getHeight(), getImageFormat(), imageQueueDepth));
        }
        boolean zIsFlipWH = getCamera() != null ? isFlipWH(getCamera()) : false;
        int height = zIsFlipWH ? resolution.getHeight() : resolution.getWidth();
        int width = zIsFlipWH ? resolution.getWidth() : resolution.getHeight();
        int i = getOutputImageFormat() == 2 ? 1 : 35;
        boolean z2 = getImageFormat() == 35 && getOutputImageFormat() == 2;
        if (getImageFormat() != 35 || ((getCamera() == null || getRelativeRotation(getCamera()) == 0) && !Boolean.TRUE.equals(getOnePixelShiftEnabled()))) {
            z = false;
        }
        final SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = (z2 || z) ? new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(height, width, i, safeCloseImageReaderProxy.getMaxImages())) : null;
        if (safeCloseImageReaderProxy2 != null) {
            this.mImageAnalysisAbstractAnalyzer.setProcessedImageReaderProxy(safeCloseImageReaderProxy2);
        }
        tryUpdateRelativeRotation();
        safeCloseImageReaderProxy.setOnImageAvailableListener(this.mImageAnalysisAbstractAnalyzer, executor);
        SessionConfig.Builder builderCreateFrom = SessionConfig.Builder.createFrom(imageAnalysisConfig, streamSpec.getResolution());
        if (streamSpec.getImplementationOptions() != null) {
            builderCreateFrom.addImplementationOptions(streamSpec.getImplementationOptions());
        }
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        ImmediateSurface immediateSurface = new ImmediateSurface(safeCloseImageReaderProxy.getSurface(), resolution, getImageFormat());
        this.mDeferrableSurface = immediateSurface;
        immediateSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                ImageAnalysis.$r8$lambda$BPng2mZ4G15hJanonggu3umgduA(safeCloseImageReaderProxy, safeCloseImageReaderProxy2);
            }
        }, CameraXExecutors.mainThreadExecutor());
        builderCreateFrom.setExpectedFrameRateRange(streamSpec.getExpectedFrameRateRange());
        builderCreateFrom.addSurface(this.mDeferrableSurface, streamSpec.getDynamicRange(), null, -1);
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda5
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
                ImageAnalysis.$r8$lambda$1CJY_8IUAQO4APWxKL2WqzYKFcc(this.f$0, sessionConfig, sessionError);
            }
        });
        this.mCloseableErrorListener = closeableErrorListener2;
        builderCreateFrom.setErrorListener(closeableErrorListener2);
        return builderCreateFrom;
    }

    public static /* synthetic */ void $r8$lambda$BPng2mZ4G15hJanonggu3umgduA(SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2) {
        safeCloseImageReaderProxy.safeClose();
        if (safeCloseImageReaderProxy2 != null) {
            safeCloseImageReaderProxy2.safeClose();
        }
    }

    public static /* synthetic */ void $r8$lambda$1CJY_8IUAQO4APWxKL2WqzYKFcc(ImageAnalysis imageAnalysis, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        if (imageAnalysis.getCamera() == null) {
            return;
        }
        imageAnalysis.clearPipeline();
        imageAnalysis.mImageAnalysisAbstractAnalyzer.clearCache();
        SessionConfig.Builder builderCreatePipeline = imageAnalysis.createPipeline(imageAnalysis.getCameraId(), (ImageAnalysisConfig) imageAnalysis.getCurrentConfig(), (StreamSpec) Preconditions.checkNotNull(imageAnalysis.getAttachedStreamSpec()));
        imageAnalysis.mSessionConfigBuilder = builderCreatePipeline;
        imageAnalysis.updateSessionConfig(ImageAnalysis$$ExternalSyntheticBackport1.m44m(new Object[]{builderCreatePipeline.build()}));
        imageAnalysis.notifyReset();
    }

    void clearPipeline() {
        Threads.checkMainThread();
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.mDeferrableSurface = null;
        }
    }

    public void setAnalyzer(Executor executor, final Analyzer analyzer) {
        synchronized (this.mAnalysisLock) {
            try {
                this.mImageAnalysisAbstractAnalyzer.setAnalyzer(executor, new Analyzer() { // from class: androidx.camera.core.ImageAnalysis$$ExternalSyntheticLambda2
                    @Override // androidx.camera.core.ImageAnalysis.Analyzer
                    public final void analyze(ImageProxy imageProxy) {
                        analyzer.analyze(imageProxy);
                    }
                });
                if (this.mSubscribedAnalyzer == null) {
                    notifyActive();
                }
                this.mSubscribedAnalyzer = analyzer;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.UseCase
    public void setViewPortCropRect(Rect rect) {
        super.setViewPortCropRect(rect);
        this.mImageAnalysisAbstractAnalyzer.setViewPortCropRect(rect);
    }

    @Override // androidx.camera.core.UseCase
    public void setSensorToBufferTransformMatrix(Matrix matrix) {
        super.setSensorToBufferTransformMatrix(matrix);
        this.mImageAnalysisAbstractAnalyzer.setSensorToBufferTransformMatrix(matrix);
    }

    private boolean isFlipWH(CameraInternal cameraInternal) {
        return isOutputImageRotationEnabled() && getRelativeRotation(cameraInternal) % EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE != 0;
    }

    public int getBackpressureStrategy() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getBackpressureStrategy(0);
    }

    public int getImageQueueDepth() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getImageQueueDepth(6);
    }

    public int getOutputImageFormat() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getOutputImageFormat(1);
    }

    public boolean isOutputImageRotationEnabled() {
        return ((ImageAnalysisConfig) getCurrentConfig()).isOutputImageRotationEnabled(Boolean.FALSE).booleanValue();
    }

    public Boolean getOnePixelShiftEnabled() {
        return ((ImageAnalysisConfig) getCurrentConfig()).getOnePixelShiftEnabled(DEFAULT_ONE_PIXEL_SHIFT_ENABLED);
    }

    public String toString() {
        return "ImageAnalysis:" + getName();
    }

    @Override // androidx.camera.core.UseCase
    public void onUnbind() {
        clearPipeline();
        this.mImageAnalysisAbstractAnalyzer.detach();
    }

    @Override // androidx.camera.core.UseCase
    public UseCaseConfig<?> getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Defaults defaults = DEFAULT_CONFIG;
        Config config = useCaseConfigFactory.getConfig(defaults.getConfig().getCaptureType(), 1);
        if (z) {
            config = Config.mergeConfigs(config, defaults.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public void onBind() {
        this.mImageAnalysisAbstractAnalyzer.attach();
    }

    @Override // androidx.camera.core.UseCase
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    @Override // androidx.camera.core.UseCase
    protected StreamSpec onSuggestedStreamSpecUpdated(StreamSpec streamSpec, StreamSpec streamSpec2) {
        SessionConfig.Builder builderCreatePipeline = createPipeline(getCameraId(), (ImageAnalysisConfig) getCurrentConfig(), streamSpec);
        this.mSessionConfigBuilder = builderCreatePipeline;
        updateSessionConfig(ImageAnalysis$$ExternalSyntheticBackport1.m44m(new Object[]{builderCreatePipeline.build()}));
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    protected StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(Config config) {
        this.mSessionConfigBuilder.addImplementationOptions(config);
        updateSessionConfig(ImageAnalysis$$ExternalSyntheticBackport1.m44m(new Object[]{this.mSessionConfigBuilder.build()}));
        return getAttachedStreamSpec().toBuilder().setImplementationOptions(config).build();
    }

    private void tryUpdateRelativeRotation() {
        CameraInternal camera = getCamera();
        if (camera != null) {
            this.mImageAnalysisAbstractAnalyzer.setRelativeRotation(getRelativeRotation(camera));
        }
    }

    public static final class Defaults {
        private static final ImageAnalysisConfig DEFAULT_CONFIG;
        private static final DynamicRange DEFAULT_DYNAMIC_RANGE;
        private static final ResolutionSelector DEFAULT_RESOLUTION_SELECTOR;
        private static final Size DEFAULT_TARGET_RESOLUTION;

        static {
            Size size = new Size(OptionsSimulatedReturnUtils.SMALL_DEVICE_HEIGHT_FOR_OPTIONS_SIMULATED_RETURNS, 480);
            DEFAULT_TARGET_RESOLUTION = size;
            DynamicRange dynamicRange = DynamicRange.SDR;
            DEFAULT_DYNAMIC_RANGE = dynamicRange;
            ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setAspectRatioStrategy(AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY).setResolutionStrategy(new ResolutionStrategy(SizeUtil.RESOLUTION_VGA, 1)).build();
            DEFAULT_RESOLUTION_SELECTOR = resolutionSelectorBuild;
            DEFAULT_CONFIG = new Builder().setDefaultResolution(size).setSurfaceOccupancyPriority(1).setTargetAspectRatio(0).setResolutionSelector(resolutionSelectorBuild).setDynamicRange(dynamicRange).getUseCaseConfig();
        }

        public ImageAnalysisConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    public static final class Builder implements UseCaseConfig.Builder<ImageAnalysis, ImageAnalysisConfig, Builder> {
        private final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(ImageAnalysis.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            setCaptureType(UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
            setTargetClass(ImageAnalysis.class);
        }

        static Builder fromConfig(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        public Builder setBackpressureStrategy(int i) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_BACKPRESSURE_STRATEGY, Integer.valueOf(i));
            return this;
        }

        public Builder setImageQueueDepth(int i) {
            getMutableConfig().insertOption(ImageAnalysisConfig.OPTION_IMAGE_QUEUE_DEPTH, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public ImageAnalysisConfig getUseCaseConfig() {
            return new ImageAnalysisConfig(OptionsBundle.from(this.mMutableConfig));
        }

        public ImageAnalysis build() {
            ImageAnalysisConfig useCaseConfig = getUseCaseConfig();
            ImageOutputConfig.validateConfig(useCaseConfig);
            return new ImageAnalysis(useCaseConfig);
        }

        public Builder setTargetClass(Class<ImageAnalysis> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        @Deprecated
        public Builder setTargetAspectRatio(int i) {
            if (i == -1) {
                i = 0;
            }
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetRotation(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
            return this;
        }

        @Deprecated
        public Builder setTargetResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        public Builder setDefaultResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        public Builder setResolutionSelector(ResolutionSelector resolutionSelector) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            return this;
        }

        public Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        public Builder setCaptureType(UseCaseConfigFactory.CaptureType captureType) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
            return this;
        }

        public Builder setDynamicRange(DynamicRange dynamicRange) {
            if (!Objects.equals(DynamicRange.SDR, dynamicRange)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRange);
            return this;
        }
    }
}

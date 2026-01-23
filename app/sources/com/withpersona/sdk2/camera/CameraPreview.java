package com.withpersona.sdk2.camera;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Size;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DisplayOrientedMeteringPointFactory;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIterator2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Executors6;

/* compiled from: CameraPreview.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001$B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\u0015J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#H\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraPreview;", "", "<init>", "()V", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "currentCameraSession", "Lcom/withpersona/sdk2/camera/CameraSession;", "rebind", "", "previewView", "Landroidx/camera/view/PreviewView;", "cameraDirection", "Lcom/withpersona/sdk2/camera/CameraPreview$CameraDirection;", "imageAnalyzer", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "useCameraCapture", "", "onCameraError", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/camera/CameraError;", "enableTorch", "enable", "focus", "takePicture", "Lkotlin/Result;", "Ljava/io/File;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "takePicture-gIAlu-s", "(Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveCameraProperties", "camera", "Landroidx/camera/core/Camera;", "CameraDirection", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CameraPreview {
    private CameraSession currentCameraSession;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CameraPreview.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraPreview$CameraDirection;", "", "<init>", "(Ljava/lang/String;I)V", "FRONT", "BACK", "EXTERNAL", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class CameraDirection {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CameraDirection[] $VALUES;
        public static final CameraDirection FRONT = new CameraDirection("FRONT", 0);
        public static final CameraDirection BACK = new CameraDirection("BACK", 1);
        public static final CameraDirection EXTERNAL = new CameraDirection("EXTERNAL", 2);

        private static final /* synthetic */ CameraDirection[] $values() {
            return new CameraDirection[]{FRONT, BACK, EXTERNAL};
        }

        public static EnumEntries<CameraDirection> getEntries() {
            return $ENTRIES;
        }

        private CameraDirection(String str, int i) {
        }

        static {
            CameraDirection[] cameraDirectionArr$values = $values();
            $VALUES = cameraDirectionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cameraDirectionArr$values);
        }

        public static CameraDirection valueOf(String str) {
            return (CameraDirection) Enum.valueOf(CameraDirection.class, str);
        }

        public static CameraDirection[] values() {
            return (CameraDirection[]) $VALUES.clone();
        }
    }

    public final CameraProperties getCameraProperties() {
        CameraProperties cameraProperties;
        CameraSession cameraSession = this.currentCameraSession;
        return (cameraSession == null || (cameraProperties = cameraSession.getCameraProperties()) == null) ? new CameraProperties(null, null, null, 0, 15, null) : cameraProperties;
    }

    public final void rebind(final PreviewView previewView, CameraDirection cameraDirection, final ImageAnalysis.Analyzer imageAnalyzer, final boolean useCameraCapture, final Function1<? super CameraController3, Unit> onCameraError) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(cameraDirection, "cameraDirection");
        Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
        final CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(cameraDirection == CameraDirection.FRONT ? 0 : 1).build();
        Intrinsics.checkNotNullExpressionValue(cameraSelectorBuild, "build(...)");
        previewView.post(new Runnable() { // from class: com.withpersona.sdk2.camera.CameraPreview$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CameraPreview.rebind$lambda$1(previewView, useCameraCapture, imageAnalyzer, cameraSelectorBuild, this, onCameraError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rebind$lambda$1(final PreviewView previewView, final boolean z, final ImageAnalysis.Analyzer analyzer, final CameraSelector cameraSelector, final CameraPreview cameraPreview, final Function1 function1) {
        if (previewView.isAttachedToWindow()) {
            Context context = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ActionBar supportActionBar = ContextUtils2.requireActivity(context).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.hide();
            }
            final int rotation = previewView.getDisplay().getRotation();
            final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            ProcessCameraProvider.Companion companion = ProcessCameraProvider.INSTANCE;
            Context context2 = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            final ListenableFuture<ProcessCameraProvider> companion2 = companion.getInstance(context2);
            companion2.addListener(new Runnable() { // from class: com.withpersona.sdk2.camera.CameraPreview$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    CameraPreview.rebind$lambda$1$lambda$0(companion2, rotation, z, analyzer, executorServiceNewSingleThreadExecutor, previewView, cameraSelector, cameraPreview, function1);
                }
            }, ContextCompat.getMainExecutor(previewView.getContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void rebind$lambda$1$lambda$0(ListenableFuture listenableFuture, int i, boolean z, ImageAnalysis.Analyzer analyzer, final ExecutorService executorService, PreviewView previewView, CameraSelector cameraSelector, CameraPreview cameraPreview, Function1 function1) {
        ImageCapture imageCaptureBuild;
        ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) listenableFuture.get();
        Preview previewBuild = new Preview.Builder().setTargetRotation(i).build();
        Intrinsics.checkNotNullExpressionValue(previewBuild, "build(...)");
        UseCaseGroup.Builder builder = new UseCaseGroup.Builder();
        builder.addUseCase(previewBuild);
        if (z) {
            imageCaptureBuild = new ImageCapture.Builder().setCaptureMode(1).setTargetRotation(i).build();
            builder.addUseCase(imageCaptureBuild);
        } else {
            imageCaptureBuild = null;
        }
        if (analyzer != null) {
            ImageAnalysis imageAnalysisBuild = new ImageAnalysis.Builder().setImageQueueDepth(0).setTargetResolution(new Size(2000, 2000)).setTargetRotation(i).build();
            Intrinsics.checkNotNullExpressionValue(imageAnalysisBuild, "build(...)");
            imageAnalysisBuild.setAnalyzer(executorService, analyzer);
            builder.addUseCase(imageAnalysisBuild);
        }
        processCameraProvider.unbindAll();
        try {
            Context context = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AppCompatActivity appCompatActivityRequireActivity = ContextUtils2.requireActivity(context);
            UseCaseGroup useCaseGroupBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(useCaseGroupBuild, "build(...)");
            Camera cameraBindToLifecycle = processCameraProvider.bindToLifecycle(appCompatActivityRequireActivity, cameraSelector, useCaseGroupBuild);
            cameraPreview.currentCameraSession = new CameraSession(cameraBindToLifecycle, imageCaptureBuild, cameraPreview.retrieveCameraProperties(cameraBindToLifecycle));
            Context context2 = previewView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ContextUtils3.requireLifecycleOwner(context2).getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.withpersona.sdk2.camera.CameraPreview$rebind$1$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    executorService.shutdown();
                }
            });
            previewBuild.setSurfaceProvider(previewView.getSurfaceProvider());
        } catch (IllegalArgumentException unused) {
            function1.invoke(new CameraController6());
        }
    }

    public final void enableTorch(boolean enable) {
        Camera camera;
        CameraSession cameraSession = this.currentCameraSession;
        if (cameraSession == null || (camera = cameraSession.getCamera()) == null) {
            return;
        }
        camera.getCameraControl().enableTorch(enable);
    }

    public final void focus(PreviewView previewView) {
        Camera camera;
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        CameraSession cameraSession = this.currentCameraSession;
        if (cameraSession == null || (camera = cameraSession.getCamera()) == null) {
            return;
        }
        camera.getCameraControl().startFocusAndMetering(new FocusMeteringAction.Builder(new DisplayOrientedMeteringPointFactory(previewView.getDisplay(), camera.getCameraInfo(), previewView.getWidth(), previewView.getHeight()).createPoint(previewView.getWidth() / 2.0f, previewView.getHeight() / 2.0f), 1).build());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: takePicture-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m27260takePicturegIAlus(SdkFilesManager sdkFilesManager, Continuation<? super Result<? extends File>> continuation) {
        CameraPreview3 cameraPreview3;
        ImageCapture imageCapture;
        if (continuation instanceof CameraPreview3) {
            cameraPreview3 = (CameraPreview3) continuation;
            int i = cameraPreview3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cameraPreview3.label = i - Integer.MIN_VALUE;
            } else {
                cameraPreview3 = new CameraPreview3(this, continuation);
            }
        }
        Object orThrow = cameraPreview3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cameraPreview3.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(orThrow);
            cameraPreview3.L$0 = this;
            cameraPreview3.L$1 = sdkFilesManager;
            cameraPreview3.label = 1;
            final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(cameraPreview3));
            final File fileNewRandomSessionFile = sdkFilesManager.newRandomSessionFile("jpg");
            ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(fileNewRandomSessionFile).build();
            Intrinsics.checkNotNullExpressionValue(outputFileOptionsBuild, "build(...)");
            CameraSession cameraSession = this.currentCameraSession;
            if (cameraSession != null && (imageCapture = cameraSession.getImageCapture()) != null) {
                imageCapture.takePicture(outputFileOptionsBuild, Executors6.asExecutor(Dispatchers.getMain().getImmediate()), new ImageCapture.OnImageSavedCallback() { // from class: com.withpersona.sdk2.camera.CameraPreview$takePicture$2$1
                    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                    public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
                        Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
                        Continuation<Result<? extends File>> continuation2 = safeContinuationJvm;
                        Result.Companion companion = Result.INSTANCE;
                        continuation2.resumeWith(Result.m28550constructorimpl(Result.m28549boximpl(Result.m28550constructorimpl(fileNewRandomSessionFile))));
                    }

                    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                    public void onError(ImageCaptureException exception) {
                        Intrinsics.checkNotNullParameter(exception, "exception");
                        Continuation<Result<? extends File>> continuation2 = safeContinuationJvm;
                        Result.Companion companion = Result.INSTANCE;
                        continuation2.resumeWith(Result.m28550constructorimpl(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(exception)))));
                    }
                });
            }
            orThrow = safeContinuationJvm.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(cameraPreview3);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(orThrow);
        }
        return ((Result) orThrow).getValue();
    }

    private final CameraProperties retrieveCameraProperties(Camera camera) {
        CameraProperties.FacingMode facingMode;
        try {
            CameraInfo cameraInfo = camera.getCameraInfo();
            Intrinsics.checkNotNullExpressionValue(cameraInfo, "getCameraInfo(...)");
            Camera2CameraInfo camera2CameraInfoFrom = Camera2CameraInfo.from(cameraInfo);
            Intrinsics.checkNotNullExpressionValue(camera2CameraInfoFrom, "from(...)");
            String cameraId = camera2CameraInfoFrom.getCameraId();
            Intrinsics.checkNotNullExpressionValue(cameraId, "getCameraId(...)");
            Rect rect = (Rect) camera2CameraInfoFrom.getCameraCharacteristic(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect == null) {
                rect = new Rect();
            }
            Size size = new Size(rect.width(), rect.height());
            Integer num = (Integer) camera2CameraInfoFrom.getCameraCharacteristic(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 1) {
                facingMode = CameraProperties.FacingMode.Environment;
            } else {
                facingMode = (num != null && num.intValue() == 0) ? CameraProperties.FacingMode.User : CameraProperties.FacingMode.Unknown;
            }
            Range[] rangeArr = (Range[]) camera2CameraInfoFrom.getCameraCharacteristic(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            int iIntValue = 0;
            if (rangeArr != null && rangeArr.length != 0) {
                Iterator it = ArrayIterator2.iterator(rangeArr);
                while (it.hasNext()) {
                    Integer num2 = (Integer) ((Range) it.next()).getUpper();
                    if (num2.intValue() > iIntValue) {
                        iIntValue = num2.intValue();
                    }
                }
            }
            return new CameraProperties(cameraId, facingMode, size, iIntValue);
        } catch (IllegalArgumentException unused) {
            return new CameraProperties(null, null, null, 0, 15, null);
        }
    }
}

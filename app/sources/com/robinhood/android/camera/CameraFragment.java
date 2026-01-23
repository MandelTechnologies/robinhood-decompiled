package com.robinhood.android.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$RequestPermission;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.camera.util.Contexts4;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import dispatch.core.Launch;
import dispatch.core.Suspend;
import java.util.concurrent.Executors;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: CameraFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001'B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017H\u0087@¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010$R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/camera/CameraFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "layoutRes", "", "<init>", "(I)V", "previewView", "Landroidx/camera/view/PreviewView;", "getPreviewView", "()Landroidx/camera/view/PreviewView;", "onCameraPermissionEvent", "", "granted", "", "requestLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onDestroy", "startPreview", "Landroidx/camera/core/ImageCapture;", "selector", "Landroidx/camera/core/CameraSelector;", "(Landroidx/camera/core/CameraSelector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startPreviewAndAnalyze", "analyzer", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "(Landroidx/camera/core/CameraSelector;Landroidx/camera/core/ImageAnalysis$Analyzer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopPreview", "Lkotlinx/coroutines/Job;", "capturePhotoBytes", "Lcom/robinhood/android/camera/CapturePhotoResult;", "imageCapture", "(Landroidx/camera/core/ImageCapture;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "takePicture", "Landroidx/camera/core/ImageProxy;", "ImageParseException", "lib-camera_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class CameraFragment extends BaseFragment {
    public static final int $stable = 8;
    private ActivityResultLauncher<String> requestLauncher;

    /* compiled from: CameraFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.camera.CameraFragment", m3645f = "CameraFragment.kt", m3646l = {77}, m3647m = "startPreview")
    /* renamed from: com.robinhood.android.camera.CameraFragment$startPreview$1 */
    static final class C99271 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C99271(Continuation<? super C99271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CameraFragment.this.startPreview(null, this);
        }
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.camera.CameraFragment", m3645f = "CameraFragment.kt", m3646l = {104}, m3647m = "startPreviewAndAnalyze")
    /* renamed from: com.robinhood.android.camera.CameraFragment$startPreviewAndAnalyze$1 */
    static final class C99281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C99281(Continuation<? super C99281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CameraFragment.this.startPreviewAndAnalyze(null, null, this);
        }
    }

    public abstract PreviewView getPreviewView();

    public abstract void onCameraPermissionEvent(boolean granted);

    public CameraFragment(int i) {
        super(i);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestLauncher = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new C99261());
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.camera.CameraFragment$onCreate$1 */
    /* synthetic */ class C99261 implements ActivityResultCallback, FunctionAdapter {
        C99261() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, CameraFragment.this, CameraFragment.class, "onCameraPermissionEvent", "onCameraPermissionEvent(Z)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.view.result.ActivityResultCallback
        public /* bridge */ /* synthetic */ void onActivityResult(Object obj) {
            onActivityResult(((Boolean) obj).booleanValue());
        }

        public final void onActivityResult(boolean z) {
            CameraFragment.this.onCameraPermissionEvent(z);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (CameraPermission2.checkCameraPermission(contextRequireContext)) {
            onCameraPermissionEvent(true);
            return;
        }
        ActivityResultLauncher<String> activityResultLauncher = this.requestLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch("android.permission.CAMERA");
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.requestLauncher = null;
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startPreview(CameraSelector cameraSelector, Continuation<? super ImageCapture> continuation) {
        C99271 c99271;
        if (continuation instanceof C99271) {
            c99271 = (C99271) continuation;
            int i = c99271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c99271.label = i - Integer.MIN_VALUE;
            } else {
                c99271 = new C99271(continuation);
            }
        }
        Object objAwaitCameraProvider = c99271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c99271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitCameraProvider);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            c99271.L$0 = cameraSelector;
            c99271.label = 1;
            objAwaitCameraProvider = Contexts4.awaitCameraProvider(contextRequireContext, c99271);
            if (objAwaitCameraProvider == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cameraSelector = (CameraSelector) c99271.L$0;
            ResultKt.throwOnFailure(objAwaitCameraProvider);
        }
        ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) objAwaitCameraProvider;
        Preview previewBuild = new Preview.Builder().build();
        previewBuild.setSurfaceProvider(getPreviewView().getSurfaceProvider());
        Intrinsics.checkNotNullExpressionValue(previewBuild, "also(...)");
        ImageCapture imageCaptureBuild = new ImageCapture.Builder().build();
        Intrinsics.checkNotNullExpressionValue(imageCaptureBuild, "build(...)");
        processCameraProvider.unbindAll();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        processCameraProvider.bindToLifecycle(viewLifecycleOwner, cameraSelector, previewBuild, imageCaptureBuild);
        return imageCaptureBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startPreviewAndAnalyze(CameraSelector cameraSelector, ImageAnalysis.Analyzer analyzer, Continuation<? super Unit> continuation) {
        C99281 c99281;
        if (continuation instanceof C99281) {
            c99281 = (C99281) continuation;
            int i = c99281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c99281.label = i - Integer.MIN_VALUE;
            } else {
                c99281 = new C99281(continuation);
            }
        }
        Object objAwaitCameraProvider = c99281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c99281.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitCameraProvider);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            c99281.L$0 = cameraSelector;
            c99281.L$1 = analyzer;
            c99281.label = 1;
            objAwaitCameraProvider = Contexts4.awaitCameraProvider(contextRequireContext, c99281);
            if (objAwaitCameraProvider == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            analyzer = (ImageAnalysis.Analyzer) c99281.L$1;
            cameraSelector = (CameraSelector) c99281.L$0;
            ResultKt.throwOnFailure(objAwaitCameraProvider);
        }
        ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) objAwaitCameraProvider;
        Preview previewBuild = new Preview.Builder().build();
        previewBuild.setSurfaceProvider(getPreviewView().getSurfaceProvider());
        Intrinsics.checkNotNullExpressionValue(previewBuild, "also(...)");
        ImageAnalysis imageAnalysisBuild = new ImageAnalysis.Builder().setBackpressureStrategy(0).build();
        Intrinsics.checkNotNullExpressionValue(imageAnalysisBuild, "build(...)");
        imageAnalysisBuild.setAnalyzer(Executors.newSingleThreadExecutor(), analyzer);
        processCameraProvider.unbindAll();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        processCameraProvider.bindToLifecycle(viewLifecycleOwner, cameraSelector, previewBuild, imageAnalysisBuild);
        return Unit.INSTANCE;
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.camera.CameraFragment$stopPreview$1", m3645f = "CameraFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.camera.CameraFragment$stopPreview$1 */
    static final class C99291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C99291(Continuation<? super C99291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CameraFragment.this.new C99291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C99291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Context contextRequireContext = CameraFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                this.label = 1;
                obj = Contexts4.awaitCameraProvider(contextRequireContext, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ((ProcessCameraProvider) obj).unbindAll();
            return Unit.INSTANCE;
        }
    }

    public final Job stopPreview() {
        return Launch.launchMain$default(getLifecycleScope(), null, null, new C99291(null), 3, null);
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/camera/CapturePhotoResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.camera.CameraFragment$capturePhotoBytes$2", m3645f = "CameraFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.camera.CameraFragment$capturePhotoBytes$2 */
    static final class C99252 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super CapturePhotoResult>, Object> {
        final /* synthetic */ ImageCapture $imageCapture;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C99252(ImageCapture imageCapture, Continuation<? super C99252> continuation) {
            super(2, continuation);
            this.$imageCapture = imageCapture;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CameraFragment.this.new C99252(this.$imageCapture, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CapturePhotoResult> continuation) {
            return ((C99252) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws ImageParseException {
            byte[] byteArray;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CameraFragment cameraFragment = CameraFragment.this;
                ImageCapture imageCapture = this.$imageCapture;
                this.label = 1;
                obj = cameraFragment.takePicture(imageCapture, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ImageProxy imageProxy = (ImageProxy) obj;
            Image image = imageProxy.getImage();
            if (image == null || (byteArray = ImageExtensions.toByteArray(image)) == null) {
                throw ImageParseException.INSTANCE;
            }
            imageProxy.close();
            return new CapturePhotoResult(byteArray, imageProxy.getImageInfo().getRotationDegrees());
        }
    }

    @SuppressLint({"UnsafeOptInUsageError"})
    public final Object capturePhotoBytes(ImageCapture imageCapture, Continuation<? super CapturePhotoResult> continuation) {
        return Suspend.withDefault$default(null, new C99252(imageCapture, null), continuation, 1, null);
    }

    /* compiled from: CameraFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/camera/CameraFragment$ImageParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "lib-camera_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ImageParseException extends Exception {
        public static final ImageParseException INSTANCE = new ImageParseException();
        public static final int $stable = 8;

        private ImageParseException() {
            super("Error parsing image bytes");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object takePicture(ImageCapture imageCapture, Continuation<? super ImageProxy> continuation) {
        final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(continuation));
        ImageCapture.OnImageCapturedCallback onImageCapturedCallback = new ImageCapture.OnImageCapturedCallback() { // from class: com.robinhood.android.camera.CameraFragment$takePicture$2$listener$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(ImageProxy image) {
                Intrinsics.checkNotNullParameter(image, "image");
                super.onCaptureSuccess(image);
                IdlingResourceCounters2.setBusy(IdlingResourceType.CAPTURE_PHOTO, false);
                safeContinuationJvm.resumeWith(Result.m28550constructorimpl(image));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onError(ImageCaptureException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                super.onError(exception);
                IdlingResourceCounters2.setBusy(IdlingResourceType.CAPTURE_PHOTO, false);
                Continuation<ImageProxy> continuation2 = safeContinuationJvm;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(exception)));
            }
        };
        IdlingResourceCounters2.setBusy(IdlingResourceType.CAPTURE_PHOTO, true);
        imageCapture.takePicture(ContextCompat.getMainExecutor(requireContext()), onImageCapturedCallback);
        Object orThrow = safeContinuationJvm.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}

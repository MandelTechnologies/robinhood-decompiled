package com.robinhood.android.camera;

import android.content.Context;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.LifecycleOwner;
import com.robinhood.android.camera.util.Contexts4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CameraPreviewComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.camera.CameraPreviewComposableKt$CameraPreview$1$1", m3645f = "CameraPreviewComposable.kt", m3646l = {51}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.camera.CameraPreviewComposableKt$CameraPreview$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class CameraPreviewComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CameraSelector $cameraSelector;
    final /* synthetic */ Context $context;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ Preview $preview;
    final /* synthetic */ PreviewView $previewView;
    final /* synthetic */ UseCase $useCase;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraPreviewComposable2(Context context, LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, Preview preview, UseCase useCase, PreviewView previewView, Continuation<? super CameraPreviewComposable2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$lifecycleOwner = lifecycleOwner;
        this.$cameraSelector = cameraSelector;
        this.$preview = preview;
        this.$useCase = useCase;
        this.$previewView = previewView;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraPreviewComposable2(this.$context, this.$lifecycleOwner, this.$cameraSelector, this.$preview, this.$useCase, this.$previewView, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CameraPreviewComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.$context;
            this.label = 1;
            obj = Contexts4.awaitCameraProvider(context, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) obj;
        processCameraProvider.unbindAll();
        processCameraProvider.bindToLifecycle(this.$lifecycleOwner, this.$cameraSelector, this.$preview, this.$useCase);
        this.$preview.setSurfaceProvider(this.$previewView.getSurfaceProvider());
        return Unit.INSTANCE;
    }
}

package com.withpersona.sdk2.inquiry.governmentid;

import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraController5;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$showRendering$1$12", m3645f = "CameraScreenRunner.kt", m3646l = {363}, m3647m = "invokeSuspend")
/* loaded from: classes18.dex */
final class CameraScreenRunner$showRendering$1$12 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GovernmentIdScreen2.CameraScreen $rendering;
    int label;
    final /* synthetic */ CameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraScreenRunner$showRendering$1$12(CameraScreenRunner cameraScreenRunner, GovernmentIdScreen2.CameraScreen cameraScreen, Continuation<? super CameraScreenRunner$showRendering$1$12> continuation) {
        super(2, continuation);
        this.this$0 = cameraScreenRunner;
        this.$rendering = cameraScreen;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraScreenRunner$showRendering$1$12(this.this$0, this.$rendering, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CameraScreenRunner$showRendering$1$12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objMo27257stopVideoIoAF18A;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CameraController cameraController = this.this$0.cameraController;
            this.label = 1;
            objMo27257stopVideoIoAF18A = cameraController.mo27257stopVideoIoAF18A(this);
            if (objMo27257stopVideoIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo27257stopVideoIoAF18A = ((Result) obj).getValue();
        }
        GovernmentIdScreen2.CameraScreen cameraScreen = this.$rendering;
        CameraScreenRunner cameraScreenRunner = this.this$0;
        if (Result.m28556isSuccessimpl(objMo27257stopVideoIoAF18A)) {
            cameraScreen.getOnLocalVideoFinalized().invoke((File) objMo27257stopVideoIoAF18A, cameraScreenRunner.cameraController.getCameraProperties());
        }
        GovernmentIdScreen2.CameraScreen cameraScreen2 = this.$rendering;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objMo27257stopVideoIoAF18A);
        if (thM28553exceptionOrNullimpl != null && !(thM28553exceptionOrNullimpl instanceof CameraController5)) {
            cameraScreen2.getOnCameraError().invoke(thM28553exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}

package com.withpersona.sdk2.inquiry.selfie;

import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: CameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$5", m3645f = "CameraScreenRunner.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes18.dex */
final class CameraScreenRunner$showRendering$1$5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CameraController $cameraController;
    final /* synthetic */ SelfieWorkflow.Screen.CameraScreen.Mode $mode;
    int label;
    final /* synthetic */ CameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraScreenRunner$showRendering$1$5(CameraController cameraController, CameraScreenRunner cameraScreenRunner, SelfieWorkflow.Screen.CameraScreen.Mode mode, Continuation<? super CameraScreenRunner$showRendering$1$5> continuation) {
        super(2, continuation);
        this.$cameraController = cameraController;
        this.this$0 = cameraScreenRunner;
        this.$mode = mode;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraScreenRunner$showRendering$1$5(this.$cameraController, this.this$0, this.$mode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CameraScreenRunner$showRendering$1$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objMo27256startVideoIoAF18A;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CameraController cameraController = this.$cameraController;
            this.label = 1;
            objMo27256startVideoIoAF18A = cameraController.mo27256startVideoIoAF18A(this);
            if (objMo27256startVideoIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo27256startVideoIoAF18A = ((Result) obj).getValue();
        }
        CameraScreenRunner cameraScreenRunner = this.this$0;
        SelfieWorkflow.Screen.CameraScreen.Mode mode = this.$mode;
        CameraController cameraController2 = this.$cameraController;
        if (Result.m28556isSuccessimpl(objMo27256startVideoIoAF18A) && ((Boolean) objMo27256startVideoIoAF18A).booleanValue()) {
            Job job = cameraScreenRunner.maxRecordingLimitJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            cameraScreenRunner.maxRecordingLimitJob = BuildersKt__Builders_commonKt.launch$default(cameraScreenRunner.lifecycleScope, Dispatchers.getIO(), null, new CameraScreenRunner$showRendering$1$5$1$1(mode, cameraController2, cameraScreenRunner, null), 2, null);
        }
        SelfieWorkflow.Screen.CameraScreen.Mode mode2 = this.$mode;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objMo27256startVideoIoAF18A);
        if (thM28553exceptionOrNullimpl != null) {
            ((SelfieWorkflow.Screen.CameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded) mode2).getOnError().invoke(thM28553exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}

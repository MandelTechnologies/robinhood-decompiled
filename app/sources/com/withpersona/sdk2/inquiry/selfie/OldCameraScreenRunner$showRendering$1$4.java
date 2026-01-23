package com.withpersona.sdk2.inquiry.selfie;

import androidx.lifecycle.LifecycleCoroutineScope;
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

/* compiled from: OldCameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$4", m3645f = "OldCameraScreenRunner.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes18.dex */
final class OldCameraScreenRunner$showRendering$1$4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LifecycleCoroutineScope $lifecycleScope;
    final /* synthetic */ SelfieWorkflow.Screen.OldCameraScreen.Mode $mode;
    int label;
    final /* synthetic */ OldCameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OldCameraScreenRunner$showRendering$1$4(OldCameraScreenRunner oldCameraScreenRunner, LifecycleCoroutineScope lifecycleCoroutineScope, SelfieWorkflow.Screen.OldCameraScreen.Mode mode, Continuation<? super OldCameraScreenRunner$showRendering$1$4> continuation) {
        super(2, continuation);
        this.this$0 = oldCameraScreenRunner;
        this.$lifecycleScope = lifecycleCoroutineScope;
        this.$mode = mode;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OldCameraScreenRunner$showRendering$1$4(this.this$0, this.$lifecycleScope, this.$mode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OldCameraScreenRunner$showRendering$1$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objMo27256startVideoIoAF18A;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CameraController cameraController = this.this$0.cameraController;
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
        OldCameraScreenRunner oldCameraScreenRunner = this.this$0;
        LifecycleCoroutineScope lifecycleCoroutineScope = this.$lifecycleScope;
        SelfieWorkflow.Screen.OldCameraScreen.Mode mode = this.$mode;
        if (Result.m28556isSuccessimpl(objMo27256startVideoIoAF18A) && ((Boolean) objMo27256startVideoIoAF18A).booleanValue()) {
            Job job = oldCameraScreenRunner.maxRecordingLimitJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            oldCameraScreenRunner.maxRecordingLimitJob = BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, Dispatchers.getIO(), null, new OldCameraScreenRunner$showRendering$1$4$1$1(mode, oldCameraScreenRunner, null), 2, null);
        }
        SelfieWorkflow.Screen.OldCameraScreen.Mode mode2 = this.$mode;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objMo27256startVideoIoAF18A);
        if (thM28553exceptionOrNullimpl != null) {
            ((SelfieWorkflow.Screen.OldCameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded) mode2).getOnError().invoke(thM28553exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}

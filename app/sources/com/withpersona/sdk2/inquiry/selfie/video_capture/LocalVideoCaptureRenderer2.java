package com.withpersona.sdk2.inquiry.selfie.video_capture;

import com.plaid.internal.EnumC7081g;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowAction4;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: LocalVideoCaptureRenderer.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", m3645f = "LocalVideoCaptureRenderer.kt", m3646l = {37}, m3647m = "invokeSuspend")
/* renamed from: com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1, reason: use source file name */
/* loaded from: classes18.dex */
final class LocalVideoCaptureRenderer2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StatefulWorkflow<SelfieWorkflow.Input, SelfieState, SelfieWorkflow.Output, Object>.RenderContext $context;
    final /* synthetic */ SelfieState.FinalizeLocalVideoCapture $renderState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LocalVideoCaptureRenderer2(SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, StatefulWorkflow<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.Output, ? extends Object>.RenderContext renderContext, Continuation<? super LocalVideoCaptureRenderer2> continuation) {
        super(2, continuation);
        this.$renderState = finalizeLocalVideoCapture;
        this.$context = renderContext;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalVideoCaptureRenderer2(this.$renderState, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LocalVideoCaptureRenderer2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long minDurationMs = this.$renderState.getMinDurationMs();
            this.label = 1;
            if (DelayKt.delay(minDurationMs, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$context.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return LocalVideoCaptureRenderer2.invokeSuspend$lambda$0((WorkflowAction.Updater) obj2);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(WorkflowAction.Updater updater) {
        Object state = updater.getState();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = state instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) state : null;
        if (finalizeLocalVideoCapture == null) {
            return Unit.INSTANCE;
        }
        updater.setState(SelfieState.FinalizeLocalVideoCapture.copy$default(finalizeLocalVideoCapture, null, 0L, true, false, null, 0L, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null));
        return Unit.INSTANCE;
    }
}

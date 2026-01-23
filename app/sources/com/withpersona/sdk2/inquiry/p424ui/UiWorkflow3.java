package com.withpersona.sdk2.inquiry.p424ui;

import com.plaid.internal.EnumC7081g;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.StatefulWorkflow2;
import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.inquiry.p424ui.UiState;
import com.withpersona.sdk2.inquiry.p424ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: UiWorkflow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$4$1", m3645f = "UiWorkflow.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$4$1, reason: use source file name */
/* loaded from: classes18.dex */
final class UiWorkflow3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StatefulWorkflow<UiWorkflow.Input, UiState, UiWorkflow.Output, Object>.RenderContext $context;
    final /* synthetic */ UiState.Displaying.AutoSubmit $it;
    final /* synthetic */ UiState $renderState;
    int label;
    final /* synthetic */ UiWorkflow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UiWorkflow3(StatefulWorkflow<? super UiWorkflow.Input, UiState, ? extends UiWorkflow.Output, ? extends Object>.RenderContext renderContext, UiWorkflow uiWorkflow, UiState.Displaying.AutoSubmit autoSubmit, UiState uiState, Continuation<? super UiWorkflow3> continuation) {
        super(2, continuation);
        this.$context = renderContext;
        this.this$0 = uiWorkflow;
        this.$it = autoSubmit;
        this.$renderState = uiState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UiWorkflow3(this.$context, this.this$0, this.$it, this.$renderState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UiWorkflow3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Sink<WorkflowAction<? super UiWorkflow.Input, UiState, ? extends UiWorkflow.Output>> actionSink = this.$context.getActionSink();
        UiWorkflow uiWorkflow = this.this$0;
        final UiState.Displaying.AutoSubmit autoSubmit = this.$it;
        final UiState uiState = this.$renderState;
        actionSink.send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$4$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return UiWorkflow3.invokeSuspend$lambda$0(autoSubmit, uiState, (WorkflowAction.Updater) obj2);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(UiState.Displaying.AutoSubmit autoSubmit, UiState uiState, WorkflowAction.Updater updater) {
        int countdown = autoSubmit.getCountdown() - 1;
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        UiComponent2 component = autoSubmit.getComponent();
        String autoSubmitCountdownText = autoSubmit.getComponent().getAutoSubmitCountdownText();
        updater.setState(UiState.Displaying.copy$default(displaying, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(component, countdown, autoSubmitCountdownText != null ? StringsKt.replace$default(autoSubmitCountdownText, "{time}", String.valueOf(countdown), false, 4, (Object) null) : null), null, false, false, null, null, null, 8127, null));
        return Unit.INSTANCE;
    }
}

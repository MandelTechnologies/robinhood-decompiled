package com.withpersona.sdk2.inquiry.p424ui;

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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UiWorkflow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$3$1", m3645f = "UiWorkflow.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$3$1, reason: use source file name */
/* loaded from: classes18.dex */
final class UiWorkflow2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StatefulWorkflow<UiWorkflow.Input, UiState, UiWorkflow.Output, Object>.RenderContext $context;
    final /* synthetic */ UiComponent2 $it;
    final /* synthetic */ UiState $renderState;
    int label;
    final /* synthetic */ UiWorkflow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UiWorkflow2(StatefulWorkflow<? super UiWorkflow.Input, UiState, ? extends UiWorkflow.Output, ? extends Object>.RenderContext renderContext, UiWorkflow uiWorkflow, UiState uiState, UiComponent2 uiComponent2, Continuation<? super UiWorkflow2> continuation) {
        super(2, continuation);
        this.$context = renderContext;
        this.this$0 = uiWorkflow;
        this.$renderState = uiState;
        this.$it = uiComponent2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UiWorkflow2(this.$context, this.this$0, this.$renderState, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UiWorkflow2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Sink<WorkflowAction<? super UiWorkflow.Input, UiState, ? extends UiWorkflow.Output>> actionSink = this.$context.getActionSink();
        UiWorkflow uiWorkflow = this.this$0;
        final UiState uiState = this.$renderState;
        final UiComponent2 uiComponent2 = this.$it;
        actionSink.send(StatefulWorkflow2.action$default(uiWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.UiWorkflow$render$3$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return UiWorkflow2.invokeSuspend$lambda$0(uiState, uiComponent2, (WorkflowAction.Updater) obj2);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(UiState uiState, UiComponent2 uiComponent2, WorkflowAction.Updater updater) {
        String strReplace$default;
        UiState.Displaying displaying = (UiState.Displaying) uiState;
        Integer autoSubmitIntervalSeconds = uiComponent2.getAutoSubmitIntervalSeconds();
        Intrinsics.checkNotNull(autoSubmitIntervalSeconds);
        int iIntValue = autoSubmitIntervalSeconds.intValue();
        String autoSubmitCountdownText = uiComponent2.getAutoSubmitCountdownText();
        if (autoSubmitCountdownText != null) {
            Integer autoSubmitIntervalSeconds2 = uiComponent2.getAutoSubmitIntervalSeconds();
            Intrinsics.checkNotNull(autoSubmitIntervalSeconds2);
            strReplace$default = StringsKt.replace$default(autoSubmitCountdownText, "{time}", String.valueOf(autoSubmitIntervalSeconds2.intValue()), false, 4, (Object) null);
        } else {
            strReplace$default = null;
        }
        updater.setState(UiState.Displaying.copy$default(displaying, null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(uiComponent2, iIntValue, strReplace$default), null, false, false, null, null, null, 8127, null));
        return Unit.INSTANCE;
    }
}

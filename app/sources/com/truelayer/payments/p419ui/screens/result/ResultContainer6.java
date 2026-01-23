package com.truelayer.payments.p419ui.screens.result;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.utils.ErrorUtils2;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
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

/* compiled from: ResultContainer.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.result.ResultContainerKt$ResultContainer$4$5", m3645f = "ResultContainer.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.truelayer.payments.ui.screens.result.ResultContainerKt$ResultContainer$4$5, reason: use source file name */
/* loaded from: classes12.dex */
final class ResultContainer6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<ProcessorResult.Failure, Unit> $onFailure;
    final /* synthetic */ ResultContext $resultContext;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ResultContainer6(ResultContext resultContext, Function1<? super ProcessorResult.Failure, Unit> function1, Continuation<? super ResultContainer6> continuation) {
        super(2, continuation);
        this.$resultContext = resultContext;
        this.$onFailure = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResultContainer6(this.$resultContext, this.$onFailure, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResultContainer6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.BackgroundError(this.$resultContext.getId(), "Invalid resource used to launch result screen", ErrorUtils2.getLineNumber(), ErrorUtils2.getFileName(), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null));
        this.$onFailure.invoke(new ProcessorResult.Failure(ProcessorResult.FailureReason.InvalidResource));
        return Unit.INSTANCE;
    }
}

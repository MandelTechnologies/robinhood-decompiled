package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$unrealizedProfitAndLossFlow$2", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {280}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$unrealizedProfitAndLossFlow$2 */
/* loaded from: classes11.dex */
final class C23607xf2b9cfe2 extends ContinuationImpl7 implements Function2<FlowCollector<? super UnrealizedProfitAndLossData>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    C23607xf2b9cfe2(Continuation<? super C23607xf2b9cfe2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C23607xf2b9cfe2 c23607xf2b9cfe2 = new C23607xf2b9cfe2(continuation);
        c23607xf2b9cfe2.L$0 = obj;
        return c23607xf2b9cfe2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super UnrealizedProfitAndLossData> flowCollector, Continuation<? super Unit> continuation) {
        return ((C23607xf2b9cfe2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            this.label = 1;
            if (flowCollector.emit(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

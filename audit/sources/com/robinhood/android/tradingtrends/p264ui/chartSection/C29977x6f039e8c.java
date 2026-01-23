package com.robinhood.android.tradingtrends.p264ui.chartSection;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSectionDuxo;
import com.robinhood.libtradingtrends.contracts.TradingTrendsSection;
import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionDuxo$onCreate$1$invokeSuspend$lambda$1$$inlined$flatMapLatest$1", m3645f = "TradingTrendsChartSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionDuxo$onCreate$1$invokeSuspend$lambda$1$$inlined$flatMapLatest$1 */
/* loaded from: classes9.dex */
public final class C29977x6f039e8c extends ContinuationImpl7 implements Function3<FlowCollector<? super Result<? extends TradingTrendsSection>>, Instrument, Continuation<? super Unit>, Object> {
    final /* synthetic */ TradingTrendsChartSectionDuxo.Args $args$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ TradingTrendsChartSectionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29977x6f039e8c(Continuation continuation, TradingTrendsChartSectionDuxo tradingTrendsChartSectionDuxo, TradingTrendsChartSectionDuxo.Args args) {
        super(3, continuation);
        this.this$0 = tradingTrendsChartSectionDuxo;
        this.$args$inlined = args;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Result<? extends TradingTrendsSection>> flowCollector, Instrument instrument, Continuation<? super Unit> continuation) {
        C29977x6f039e8c c29977x6f039e8c = new C29977x6f039e8c(continuation, this.this$0, this.$args$inlined);
        c29977x6f039e8c.L$0 = flowCollector;
        c29977x6f039e8c.L$1 = instrument;
        return c29977x6f039e8c.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow<Result<TradingTrendsSection>> flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            if (((Instrument) this.L$1).isActive()) {
                flowFlowOf = this.this$0.tradingTrendsService.getSection(this.$args$inlined.getInstrumentId(), this.$args$inlined.getInitialSelectedType(), this.$args$inlined.isDetailPage());
            } else {
                flowFlowOf = FlowKt.flowOf(Result.m28549boximpl(Result.m28550constructorimpl(null)));
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
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

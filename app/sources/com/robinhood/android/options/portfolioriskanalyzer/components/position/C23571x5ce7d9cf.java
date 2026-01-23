package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getAggregatePositionRowFlow$optionInstrumentIdToQuoteMapFlow$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$getAggregatePositionRowFlow$optionInstrumentIdToQuoteMapFlow$1 */
/* loaded from: classes11.dex */
final class C23571x5ce7d9cf extends ContinuationImpl7 implements Function2<FlowCollector<? super Map<UUID, ? extends OptionInstrumentQuote>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    C23571x5ce7d9cf(Continuation<? super C23571x5ce7d9cf> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C23571x5ce7d9cf c23571x5ce7d9cf = new C23571x5ce7d9cf(continuation);
        c23571x5ce7d9cf.L$0 = obj;
        return c23571x5ce7d9cf;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Map<UUID, ? extends OptionInstrumentQuote>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Map<UUID, OptionInstrumentQuote>>) flowCollector, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Map<UUID, OptionInstrumentQuote>> flowCollector, Continuation<? super Unit> continuation) {
        return ((C23571x5ce7d9cf) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Map mapEmptyMap = MapsKt.emptyMap();
            this.label = 1;
            if (flowCollector.emit(mapEmptyMap, this) == coroutine_suspended) {
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

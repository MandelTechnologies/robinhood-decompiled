package com.robinhood.android.options.p208ui.detail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.ApiOptionSimulatedReturnRequestParams;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse2;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26$invokeSuspend$lambda$2$$inlined$flatMapLatest$1", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$26$invokeSuspend$lambda$2$$inlined$flatMapLatest$1 */
/* loaded from: classes11.dex */
public final class C23846xd70f7cf4 extends ContinuationImpl7 implements Function3<FlowCollector<? super ApiOptionTodayTotalReturnResponse2>, AggregateOptionStrategyQuote, Continuation<? super Unit>, Object> {
    final /* synthetic */ CuratedListItem $curatedListItem$inlined;
    final /* synthetic */ OrderDirection $direction$inlined;
    final /* synthetic */ Money $simulatedOpenPrice$inlined;
    final /* synthetic */ UiOptionStrategyInfo $uiStrategyInfo$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionsDetailPageDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23846xd70f7cf4(Continuation continuation, UiOptionStrategyInfo uiOptionStrategyInfo, CuratedListItem curatedListItem, Money money, OrderDirection orderDirection, OptionsDetailPageDuxo optionsDetailPageDuxo) {
        super(3, continuation);
        this.$uiStrategyInfo$inlined = uiOptionStrategyInfo;
        this.$curatedListItem$inlined = curatedListItem;
        this.$simulatedOpenPrice$inlined = money;
        this.$direction$inlined = orderDirection;
        this.this$0 = optionsDetailPageDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super ApiOptionTodayTotalReturnResponse2> flowCollector, AggregateOptionStrategyQuote aggregateOptionStrategyQuote, Continuation<? super Unit> continuation) {
        C23846xd70f7cf4 c23846xd70f7cf4 = new C23846xd70f7cf4(continuation, this.$uiStrategyInfo$inlined, this.$curatedListItem$inlined, this.$simulatedOpenPrice$inlined, this.$direction$inlined, this.this$0);
        c23846xd70f7cf4.L$0 = flowCollector;
        c23846xd70f7cf4.L$1 = aggregateOptionStrategyQuote;
        return c23846xd70f7cf4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            AggregateOptionStrategyQuote aggregateOptionStrategyQuote = (AggregateOptionStrategyQuote) this.L$1;
            int iIntValue = this.$uiStrategyInfo$inlined.getOptionChain().getTradeValueMultiplier().intValue();
            Instant createdAt = this.$curatedListItem$inlined.getCreatedAt();
            BigDecimal unsignedValue = aggregateOptionStrategyQuote.getAdjustedMarkPrice().getUnsignedValue();
            Currency currency = Currencies.USD;
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.optionStrategyDetailStore.getOptionsSimulatedReturn(new ApiOptionSimulatedReturnRequestParams(iIntValue, createdAt, Money3.toMoney(unsignedValue, currency), Money3.toMoney(aggregateOptionStrategyQuote.getPreviousClosePrice().getUnsignedValue(), currency), this.$simulatedOpenPrice$inlined, this.$direction$inlined))), Integer.MAX_VALUE, null, 2, null);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowBuffer$default, this) == coroutine_suspended) {
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

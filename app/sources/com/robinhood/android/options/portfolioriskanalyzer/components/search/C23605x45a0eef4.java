package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLoss;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLoss2;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AggregateOptionPositionQuote;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/PnLUiState;", "account", "Lcom/robinhood/models/db/Account;", "aggregateOptionPositions", "", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "aggregateOptionQuotes", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/AggregateOptionPositionQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$optionsPnLFlow$1", m3645f = "OptionsPortfolioRiskAnalyzerSearchDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo$getPnlFlow$optionsPnLFlow$1 */
/* loaded from: classes11.dex */
final class C23605x45a0eef4 extends ContinuationImpl7 implements Function4<Account, List<? extends UiAggregateOptionPositionFull>, Map<UUID, ? extends AggregateOptionPositionQuote>, Continuation<? super PnLUiState>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    C23605x45a0eef4(Continuation<? super C23605x45a0eef4> continuation) {
        super(4, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Account account, List<UiAggregateOptionPositionFull> list, Map<UUID, AggregateOptionPositionQuote> map, Continuation<? super PnLUiState> continuation) {
        C23605x45a0eef4 c23605x45a0eef4 = new C23605x45a0eef4(continuation);
        c23605x45a0eef4.L$0 = account;
        c23605x45a0eef4.L$1 = list;
        c23605x45a0eef4.L$2 = map;
        return c23605x45a0eef4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Account account, List<? extends UiAggregateOptionPositionFull> list, Map<UUID, ? extends AggregateOptionPositionQuote> map, Continuation<? super PnLUiState> continuation) {
        return invoke2(account, (List<UiAggregateOptionPositionFull>) list, (Map<UUID, AggregateOptionPositionQuote>) map, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        BigDecimal costForTotalReturn;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UnrealizedProfitAndLoss optionsUnrealizedProfitAndLoss = UnrealizedProfitAndLoss2.getOptionsUnrealizedProfitAndLoss((List) this.L$1, (Map) this.L$2, ((Account) this.L$0).getBrokerageAccountType(), false);
        BigDecimal bigDecimalAbs = null;
        BigDecimal totalReturn = optionsUnrealizedProfitAndLoss != null ? optionsUnrealizedProfitAndLoss.getTotalReturn() : null;
        BigDecimal totalReturn2 = optionsUnrealizedProfitAndLoss != null ? optionsUnrealizedProfitAndLoss.getTotalReturn() : null;
        if (optionsUnrealizedProfitAndLoss != null && (costForTotalReturn = optionsUnrealizedProfitAndLoss.getCostForTotalReturn()) != null) {
            bigDecimalAbs = costForTotalReturn.abs();
        }
        return new PnLUiState(totalReturn, BigDecimals7.safeDivide(totalReturn2, bigDecimalAbs));
    }
}

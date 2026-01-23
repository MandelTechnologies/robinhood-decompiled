package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.UiAggregateOptionPositionLeg;
import com.robinhood.models.p355ui.UiOptionChain;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/TradeActionUiState;", "<destruct>", "Lkotlin/Triple;", "Lcom/robinhood/models/db/Account;", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "Lcom/robinhood/models/db/OptionSettings;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$computeTradeActionUiState$tradeActionUiStateFlow$2", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$computeTradeActionUiState$tradeActionUiStateFlow$2 */
/* loaded from: classes11.dex */
final class C23568x29fb763d extends ContinuationImpl7 implements Function2<Tuples3<? extends Account, ? extends OptionCurrentOrNextMarketDates, ? extends OptionSettings>, Continuation<? super TradeActionUiState>, Object> {
    final /* synthetic */ List<UiAggregateOptionPositionLeg> $selectedLegs;
    final /* synthetic */ BigDecimal $simulatedQuantity;
    final /* synthetic */ UiOptionChain $uiOptionChain;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C23568x29fb763d(BigDecimal bigDecimal, List<UiAggregateOptionPositionLeg> list, OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, UiOptionChain uiOptionChain, Continuation<? super C23568x29fb763d> continuation) {
        super(2, continuation);
        this.$simulatedQuantity = bigDecimal;
        this.$selectedLegs = list;
        this.this$0 = optionsPortfolioRiskAnalyzerPositionDuxo;
        this.$uiOptionChain = uiOptionChain;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C23568x29fb763d c23568x29fb763d = new C23568x29fb763d(this.$simulatedQuantity, this.$selectedLegs, this.this$0, this.$uiOptionChain, continuation);
        c23568x29fb763d.L$0 = obj;
        return c23568x29fb763d;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples3<? extends Account, ? extends OptionCurrentOrNextMarketDates, ? extends OptionSettings> tuples3, Continuation<? super TradeActionUiState> continuation) {
        return invoke2((Tuples3<Account, OptionCurrentOrNextMarketDates, OptionSettings>) tuples3, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples3<Account, OptionCurrentOrNextMarketDates, OptionSettings> tuples3, Continuation<? super TradeActionUiState> continuation) {
        return ((C23568x29fb763d) create(tuples3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        boolean z;
        boolean z2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Tuples3 tuples3 = (Tuples3) this.L$0;
        Account account = (Account) tuples3.component1();
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = (OptionCurrentOrNextMarketDates) tuples3.component2();
        OptionSettings optionSettings = (OptionSettings) tuples3.component3();
        String accountNumber = account.getAccountNumber();
        BigDecimal bigDecimal3 = this.$simulatedQuantity;
        BigDecimal bigDecimal4 = BigDecimal.ZERO;
        boolean z3 = bigDecimal3.compareTo(bigDecimal4) >= 0;
        boolean z4 = this.$simulatedQuantity.compareTo(bigDecimal4) <= 0;
        Object obj2 = null;
        if (this.$simulatedQuantity.compareTo(bigDecimal4) == 0) {
            bigDecimal = null;
        } else {
            BigDecimal bigDecimalAbs = this.$simulatedQuantity.abs();
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            bigDecimal = (BigDecimal) RangesKt.coerceAtLeast(bigDecimalAbs, ONE);
        }
        List<UiAggregateOptionPositionLeg> list = this.$selectedLegs;
        BigDecimal bigDecimal5 = bigDecimal;
        OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo = this.this$0;
        UiOptionChain uiOptionChain = this.$uiOptionChain;
        if ((list instanceof Collection) && list.isEmpty()) {
            bigDecimal2 = bigDecimal5;
            z = true;
        } else {
            for (UiAggregateOptionPositionLeg uiAggregateOptionPositionLeg : list) {
                OptionInstrument optionInstrument = uiAggregateOptionPositionLeg.getOptionInstrument();
                OptionPositionType positionType = uiAggregateOptionPositionLeg.getPositionType();
                UiOptionChain uiOptionChain2 = uiOptionChain;
                bigDecimal2 = bigDecimal5;
                if (!OptionsPortfolioRiskAnalyzerPositionDuxo.canOpenOrCloseSingleLegPosition$default(optionsPortfolioRiskAnalyzerPositionDuxo, optionCurrentOrNextMarketDates, optionSettings, optionInstrument, uiOptionChain2, positionType, account.getOnlyPositionClosingTrades(), false, 64, null)) {
                    z = false;
                    break;
                }
                uiOptionChain = uiOptionChain2;
                bigDecimal5 = bigDecimal2;
                obj2 = null;
            }
            bigDecimal2 = bigDecimal5;
            z = true;
        }
        List<UiAggregateOptionPositionLeg> list2 = this.$selectedLegs;
        OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo2 = this.this$0;
        UiOptionChain uiOptionChain3 = this.$uiOptionChain;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z2 = true;
        } else {
            for (UiAggregateOptionPositionLeg uiAggregateOptionPositionLeg2 : list2) {
                OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo3 = optionsPortfolioRiskAnalyzerPositionDuxo2;
                if (!optionsPortfolioRiskAnalyzerPositionDuxo3.canOpenOrCloseSingleLegPosition(optionCurrentOrNextMarketDates, optionSettings, uiAggregateOptionPositionLeg2.getOptionInstrument(), uiOptionChain3, uiAggregateOptionPositionLeg2.getPositionType(), account.getOnlyPositionClosingTrades(), false)) {
                    z2 = false;
                    break;
                }
                optionsPortfolioRiskAnalyzerPositionDuxo2 = optionsPortfolioRiskAnalyzerPositionDuxo3;
            }
            z2 = true;
        }
        boolean z5 = z3 && z;
        boolean z6 = z4 && z2;
        List<UiAggregateOptionPositionLeg> list3 = this.$selectedLegs;
        OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo4 = this.this$0;
        UiOptionChain uiOptionChain4 = this.$uiOptionChain;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(OptionsPortfolioRiskAnalyzerPositionDuxo.getOpenOrClosePositionOptionLegBundle$default(optionsPortfolioRiskAnalyzerPositionDuxo4, (UiAggregateOptionPositionLeg) it.next(), uiOptionChain4, false, 4, null));
        }
        List<UiAggregateOptionPositionLeg> list4 = this.$selectedLegs;
        OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo5 = this.this$0;
        UiOptionChain uiOptionChain5 = this.$uiOptionChain;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(optionsPortfolioRiskAnalyzerPositionDuxo5.getOpenOrClosePositionOptionLegBundle((UiAggregateOptionPositionLeg) it2.next(), uiOptionChain5, false));
        }
        return new TradeActionUiState(new TradeButtonUiState(false, null, 3, null), new TradeButtonUiState(z5, new OptionOrderIntentKey.FromOptionOrderBundle(null, accountNumber, this.this$0.getOptionOrderBundle(this.$uiOptionChain, arrayList, bigDecimal2), null, null, null, null, false, false, false, null, null, null, null, 15865, null)), new TradeButtonUiState(z6, new OptionOrderIntentKey.FromOptionOrderBundle(null, accountNumber, this.this$0.getOptionOrderBundle(this.$uiOptionChain, arrayList2, bigDecimal2), null, null, null, null, false, false, false, null, null, null, null, 15865, null)));
    }
}

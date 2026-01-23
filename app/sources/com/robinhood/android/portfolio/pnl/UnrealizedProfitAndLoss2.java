package com.robinhood.android.portfolio.pnl;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.AggregateOptionPosition;
import com.robinhood.models.p320db.AggregateOptionQuote;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UnrealizedProfitAndLoss.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f\u001a*\u0010\r\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002\u001a,\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¨\u0006\u000e"}, m3636d2 = {"getOptionsUnrealizedProfitAndLoss", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLoss;", "aggregateOptionPositions", "", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "aggregateOptionQuotes", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/AggregateOptionQuote;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "inProfitAndLossAverageCostRetirement", "", "getOptionsUnrealizedProfitAndLossLegacy", "lib-profit-and-loss_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UnrealizedProfitAndLoss2 {
    public static final UnrealizedProfitAndLoss getOptionsUnrealizedProfitAndLoss(List<? extends UiAggregateOptionPosition> aggregateOptionPositions, Map<UUID, ? extends AggregateOptionQuote> aggregateOptionQuotes, BrokerageAccountType brokerageAccountType, boolean z) {
        Intrinsics.checkNotNullParameter(aggregateOptionPositions, "aggregateOptionPositions");
        Intrinsics.checkNotNullParameter(aggregateOptionQuotes, "aggregateOptionQuotes");
        if (PnlAverageCostExperimentUtil.shouldUseClearingCostBasis(brokerageAccountType, z)) {
            return getOptionsUnrealizedProfitAndLoss(aggregateOptionPositions, aggregateOptionQuotes);
        }
        return getOptionsUnrealizedProfitAndLossLegacy(aggregateOptionPositions, aggregateOptionQuotes);
    }

    private static final UnrealizedProfitAndLoss getOptionsUnrealizedProfitAndLossLegacy(List<? extends UiAggregateOptionPosition> list, Map<UUID, ? extends AggregateOptionQuote> map) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        BigDecimal element = bigDecimal;
        BigDecimal element2 = element;
        BigDecimal element3 = element2;
        BigDecimal element4 = element3;
        BigDecimal element5 = element4;
        for (UiAggregateOptionPosition uiAggregateOptionPosition : list) {
            AggregateOptionPosition aggregateOptionPosition = uiAggregateOptionPosition.getAggregateOptionPosition();
            OptionChain optionChain = uiAggregateOptionPosition.getOptionChain();
            BigDecimal displayQuantity = aggregateOptionPosition.getDisplayQuantity();
            AggregateOptionQuote aggregateOptionQuote = map.get(aggregateOptionPosition.getId());
            if (aggregateOptionQuote != null) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                BigDecimal bigDecimalMultiply = aggregateOptionPosition.getDeltaQuantity().multiply(aggregateOptionQuote.getAdjustedMarkPrice().getUnsignedValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(optionChain.getTradeValueMultiplier());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
                element = element.add(bigDecimalMultiply2);
                Intrinsics.checkNotNullExpressionValue(element, "add(...)");
                Intrinsics.checkNotNullExpressionValue(element2, "element");
                element2 = element2.add(aggregateOptionPosition.getTodaysReturnAmount(aggregateOptionQuote, optionChain));
                Intrinsics.checkNotNullExpressionValue(element2, "add(...)");
                Intrinsics.checkNotNullExpressionValue(element3, "element");
                element3 = element3.add(aggregateOptionPosition.getTotalReturnAmount(aggregateOptionQuote, optionChain));
                Intrinsics.checkNotNullExpressionValue(element3, "add(...)");
                Intrinsics.checkNotNullExpressionValue(element4, "element");
                BigDecimal bigDecimalAdd = element4.add(aggregateOptionPosition.getStartOfDayPlusIntradayCost(aggregateOptionQuote, optionChain));
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                Intrinsics.checkNotNullExpressionValue(element5, "element");
                BigDecimal bigDecimalMultiply3 = displayQuantity.multiply(aggregateOptionPosition.getAverageOpenPrice());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
                BigDecimal bigDecimalAdd2 = element5.add(bigDecimalMultiply3);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
                element4 = bigDecimalAdd;
                element5 = bigDecimalAdd2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(element, "element");
        Intrinsics.checkNotNullExpressionValue(element2, "element");
        Intrinsics.checkNotNullExpressionValue(element3, "element");
        Intrinsics.checkNotNullExpressionValue(element4, "element");
        Intrinsics.checkNotNullExpressionValue(element5, "element");
        return new UnrealizedProfitAndLoss(element, element2, element3, element4, element5);
    }

    private static final UnrealizedProfitAndLoss getOptionsUnrealizedProfitAndLoss(List<? extends UiAggregateOptionPosition> list, Map<UUID, ? extends AggregateOptionQuote> map) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        BigDecimal element = bigDecimal;
        BigDecimal element2 = element;
        BigDecimal element3 = element2;
        BigDecimal element4 = element3;
        BigDecimal element5 = element4;
        for (UiAggregateOptionPosition uiAggregateOptionPosition : list) {
            AggregateOptionPosition aggregateOptionPosition = uiAggregateOptionPosition.getAggregateOptionPosition();
            OptionChain optionChain = uiAggregateOptionPosition.getOptionChain();
            AggregateOptionQuote aggregateOptionQuote = map.get(aggregateOptionPosition.getId());
            if (aggregateOptionQuote != null) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                BigDecimal clearingDeltaQuantity = aggregateOptionPosition.getClearingDeltaQuantity();
                if (clearingDeltaQuantity == null) {
                    return null;
                }
                BigDecimal bigDecimalMultiply = clearingDeltaQuantity.multiply(aggregateOptionQuote.getAdjustedMarkPrice().getUnsignedValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(optionChain.getTradeValueMultiplier());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
                element = element.add(bigDecimalMultiply2);
                Intrinsics.checkNotNullExpressionValue(element, "add(...)");
                Intrinsics.checkNotNullExpressionValue(element2, "element");
                BigDecimal clearingTodaysReturnAmount = aggregateOptionPosition.getClearingTodaysReturnAmount(aggregateOptionQuote, optionChain);
                if (clearingTodaysReturnAmount == null) {
                    return null;
                }
                element2 = element2.add(clearingTodaysReturnAmount);
                Intrinsics.checkNotNullExpressionValue(element2, "add(...)");
                Intrinsics.checkNotNullExpressionValue(element3, "element");
                BigDecimal clearingTotalReturnAmount = aggregateOptionPosition.getClearingTotalReturnAmount(aggregateOptionQuote, optionChain);
                if (clearingTotalReturnAmount == null) {
                    return null;
                }
                element3 = element3.add(clearingTotalReturnAmount);
                Intrinsics.checkNotNullExpressionValue(element3, "add(...)");
                Intrinsics.checkNotNullExpressionValue(element4, "element");
                BigDecimal clearingStartOfDayPlusIntradayCost = aggregateOptionPosition.getClearingStartOfDayPlusIntradayCost(aggregateOptionQuote, optionChain);
                if (clearingStartOfDayPlusIntradayCost == null) {
                    return null;
                }
                BigDecimal bigDecimalAdd = element4.add(clearingStartOfDayPlusIntradayCost);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                Intrinsics.checkNotNullExpressionValue(element5, "element");
                BigDecimal clearingCostBasis = aggregateOptionPosition.getClearingCostBasis();
                if (clearingCostBasis == null) {
                    return null;
                }
                BigDecimal bigDecimalAdd2 = element5.add(clearingCostBasis);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
                element4 = bigDecimalAdd;
                element5 = bigDecimalAdd2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(element, "element");
        Intrinsics.checkNotNullExpressionValue(element2, "element");
        Intrinsics.checkNotNullExpressionValue(element3, "element");
        Intrinsics.checkNotNullExpressionValue(element4, "element");
        Intrinsics.checkNotNullExpressionValue(element5, "element");
        return new UnrealizedProfitAndLoss(element, element2, element3, element4, element5);
    }
}

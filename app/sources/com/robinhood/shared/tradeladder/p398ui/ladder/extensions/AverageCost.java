package com.robinhood.shared.tradeladder.p398ui.ladder.extensions;

import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderPriceLevels;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: AverageCost.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"generateAverageCostLine", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderState$LadderData$AverageCostLineData;", "Lcom/robinhood/shared/tradeladder/ui/ladder/models/LadderPriceLevels;", "averageCost", "Ljava/math/BigDecimal;", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.extensions.AverageCostKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class AverageCost {
    public static final LadderState.LadderData.AverageCostLineData generateAverageCostLine(LadderPriceLevels ladderPriceLevels, BigDecimal averageCost) {
        Intrinsics.checkNotNullParameter(ladderPriceLevels, "<this>");
        Intrinsics.checkNotNullParameter(averageCost, "averageCost");
        BigDecimal displayPriceIncrement = ladderPriceLevels.getDisplayPriceIncrement();
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        BigDecimal bigDecimalRoundToInterval = BigDecimals7.roundToInterval(averageCost, displayPriceIncrement, roundingMode);
        int intRounded = BigDecimals7.toIntRounded(ladderPriceLevels.calculateRowIndex(bigDecimalRoundToInterval));
        BigDecimal bigDecimalDivide = ladderPriceLevels.getDisplayPriceIncrement().divide(new BigDecimal(2));
        Intrinsics.checkNotNull(bigDecimalDivide);
        BigDecimal bigDecimalAdd = bigDecimalRoundToInterval.add(bigDecimalDivide);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        BigDecimal bigDecimalSubtract = bigDecimalAdd.subtract(averageCost);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return new LadderState.LadderData.AverageCostLineData(intRounded, RangesKt.coerceIn(bigDecimalSubtract.divide(ladderPriceLevels.getDisplayPriceIncrement(), roundingMode).floatValue(), 0.0f, 1.0f));
    }
}

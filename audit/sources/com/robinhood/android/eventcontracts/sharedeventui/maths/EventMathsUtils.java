package com.robinhood.android.eventcontracts.sharedeventui.maths;

import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventMathsUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u001a\u000e\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0003\"\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"getAvgPriceWithRounding", "Ljava/math/BigDecimal;", "positionData", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "getRawAvgPrice", "computeEventOpenPnl", "lastTradePrice", "position", "computeTotalCost", "computeTotalPotentialValue", "SINGLE_EVENT_UNIT", "getSINGLE_EVENT_UNIT", "()Ljava/math/BigDecimal;", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.maths.EventMathsUtilsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventMathsUtils {
    private static final BigDecimal SINGLE_EVENT_UNIT;

    public static final BigDecimal getAvgPriceWithRounding(UiEventContractPosition positionData) {
        Intrinsics.checkNotNullParameter(positionData, "positionData");
        if (BigDecimals7.isPositive(positionData.getQuantity())) {
            return positionData.getAveragePrice();
        }
        if (BigDecimals7.isNegative(positionData.getQuantity())) {
            BigDecimal bigDecimalSubtract = SINGLE_EVENT_UNIT.subtract(positionData.getAveragePrice());
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            BigDecimal scale = bigDecimalSubtract.setScale(2, RoundingMode.HALF_UP);
            Intrinsics.checkNotNull(scale);
            return scale;
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    public static final BigDecimal getRawAvgPrice(UiEventContractPosition positionData) {
        Intrinsics.checkNotNullParameter(positionData, "positionData");
        if (BigDecimals7.isPositive(positionData.getQuantity())) {
            return positionData.getAveragePrice();
        }
        if (BigDecimals7.isNegative(positionData.getQuantity())) {
            BigDecimal bigDecimalSubtract = SINGLE_EVENT_UNIT.subtract(positionData.getAveragePrice());
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            return bigDecimalSubtract;
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    public static final BigDecimal computeEventOpenPnl(BigDecimal bigDecimal, UiEventContractPosition uiEventContractPosition) {
        if (bigDecimal == null || uiEventContractPosition == null) {
            return null;
        }
        BigDecimal bigDecimalAbs = uiEventContractPosition.getQuantity().abs();
        BigDecimal rawAvgPrice = getRawAvgPrice(uiEventContractPosition);
        if (!BigDecimals7.isPositive(uiEventContractPosition.getQuantity())) {
            bigDecimal = SINGLE_EVENT_UNIT.subtract(bigDecimal);
        }
        return bigDecimal.subtract(rawAvgPrice).multiply(bigDecimalAbs);
    }

    public static final BigDecimal computeTotalCost(UiEventContractPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        BigDecimal bigDecimalMultiply = getRawAvgPrice(position).multiply(position.getQuantity().abs());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public static final BigDecimal computeTotalPotentialValue(UiEventContractPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        BigDecimal bigDecimalMultiply = position.getQuantity().abs().multiply(SINGLE_EVENT_UNIT);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    static {
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        SINGLE_EVENT_UNIT = ONE;
    }

    public static final BigDecimal getSINGLE_EVENT_UNIT() {
        return SINGLE_EVENT_UNIT;
    }
}

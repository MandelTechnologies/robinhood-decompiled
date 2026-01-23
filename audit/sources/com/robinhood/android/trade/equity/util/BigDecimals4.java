package com.robinhood.android.trade.equity.util;

import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.util.CurrencyContext2;
import com.robinhood.models.util.Money;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BigDecimals.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u001a\u001c\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"toDollarAmount", "Lcom/robinhood/models/util/Money;", "Ljava/math/BigDecimal;", "money", "roundedEstimatedAmount", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "isQuantityWhole", "", "feature-trade-equity_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.util.BigDecimalsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class BigDecimals4 {

    /* compiled from: BigDecimals.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.equity.util.BigDecimalsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityOrderSide.values().length];
            try {
                iArr[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Money toDollarAmount(BigDecimal bigDecimal, Money money) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        if (money == null) {
            return CurrencyContext2.getZero(Currencies.USD);
        }
        return money.times(bigDecimal);
    }

    public static final BigDecimal roundedEstimatedAmount(BigDecimal bigDecimal, EquityOrderSide equityOrderSide, boolean z) {
        RoundingMode roundingMode;
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        if (z) {
            roundingMode = RoundingMode.HALF_UP;
        } else {
            int i = equityOrderSide == null ? -1 : WhenMappings.$EnumSwitchMapping$0[equityOrderSide.ordinal()];
            if (i == -1) {
                roundingMode = RoundingMode.HALF_UP;
            } else if (i == 1) {
                roundingMode = RoundingMode.UP;
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                roundingMode = RoundingMode.DOWN;
            }
        }
        return BigDecimals7.scaleWithNonzeroMinimum$default(bigDecimal, Currencies.USD.getDefaultFractionDigits(), null, roundingMode, 2, null);
    }
}

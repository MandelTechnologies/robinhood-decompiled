package com.robinhood.android.trade.options.profitloss;

import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartData;
import com.robinhood.models.api.ApiOptionsProfitLossChart;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsProfitLossChartViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/ProfitLossDirection;", "", "<init>", "(Ljava/lang/String;I)V", "PROFIT", "LOSS", "BREAKEVEN", "Companion", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ProfitLossDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProfitLossDirection[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ProfitLossDirection PROFIT = new ProfitLossDirection("PROFIT", 0);
    public static final ProfitLossDirection LOSS = new ProfitLossDirection("LOSS", 1);
    public static final ProfitLossDirection BREAKEVEN = new ProfitLossDirection("BREAKEVEN", 2);

    private static final /* synthetic */ ProfitLossDirection[] $values() {
        return new ProfitLossDirection[]{PROFIT, LOSS, BREAKEVEN};
    }

    public static EnumEntries<ProfitLossDirection> getEntries() {
        return $ENTRIES;
    }

    private ProfitLossDirection(String str, int i) {
    }

    static {
        ProfitLossDirection[] profitLossDirectionArr$values = $values();
        $VALUES = profitLossDirectionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(profitLossDirectionArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: OptionsProfitLossChartViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\nR\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/ProfitLossDirection$Companion;", "", "<init>", "()V", "profitLossDirection", "Lcom/robinhood/android/trade/options/profitloss/ProfitLossDirection;", "Lcom/robinhood/models/util/Money;", "getProfitLossDirection$feature_options_pl_chart_externalDebug", "(Lcom/robinhood/models/util/Money;)Lcom/robinhood/android/trade/options/profitloss/ProfitLossDirection;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$Point;", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$Point;)Lcom/robinhood/android/trade/options/profitloss/ProfitLossDirection;", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart$ProfitLossLimit;", "(Lcom/robinhood/models/api/ApiOptionsProfitLossChart$ProfitLossLimit;)Lcom/robinhood/android/trade/options/profitloss/ProfitLossDirection;", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: OptionsProfitLossChartViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiOptionsProfitLossChart.LimitType.values().length];
                try {
                    iArr[ApiOptionsProfitLossChart.LimitType.FINITE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiOptionsProfitLossChart.LimitType.POSITIVE_INF.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiOptionsProfitLossChart.LimitType.NEGATIVE_INF.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ApiOptionsProfitLossChart.LimitType.UNAVAILABLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ProfitLossDirection getProfitLossDirection$feature_options_pl_chart_externalDebug(Money money) {
            Intrinsics.checkNotNullParameter(money, "<this>");
            if (money.isPositive()) {
                return ProfitLossDirection.PROFIT;
            }
            if (money.isNegative()) {
                return ProfitLossDirection.LOSS;
            }
            if (money.isZero()) {
                return ProfitLossDirection.BREAKEVEN;
            }
            throw new IllegalStateException("impossible case");
        }

        public final ProfitLossDirection getProfitLossDirection$feature_options_pl_chart_externalDebug(OptionsProfitLossChartData.Point point) {
            Intrinsics.checkNotNullParameter(point, "<this>");
            return getProfitLossDirection$feature_options_pl_chart_externalDebug(point.getPriceY());
        }

        public final ProfitLossDirection getProfitLossDirection$feature_options_pl_chart_externalDebug(ApiOptionsProfitLossChart.ProfitLossLimit profitLossLimit) {
            Intrinsics.checkNotNullParameter(profitLossLimit, "<this>");
            int i = WhenMappings.$EnumSwitchMapping$0[profitLossLimit.getType().ordinal()];
            if (i == 1) {
                Money profit_or_loss = profitLossLimit.getProfit_or_loss();
                Intrinsics.checkNotNull(profit_or_loss);
                return getProfitLossDirection$feature_options_pl_chart_externalDebug(profit_or_loss);
            }
            if (i == 2) {
                return ProfitLossDirection.PROFIT;
            }
            if (i == 3) {
                return ProfitLossDirection.LOSS;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return ProfitLossDirection.BREAKEVEN;
        }
    }

    public static ProfitLossDirection valueOf(String str) {
        return (ProfitLossDirection) Enum.valueOf(ProfitLossDirection.class, str);
    }

    public static ProfitLossDirection[] values() {
        return (ProfitLossDirection[]) $VALUES.clone();
    }
}

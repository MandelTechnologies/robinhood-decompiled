package com.robinhood.android.trade.options.profitloss;

import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartData;
import com.robinhood.models.api.ApiOptionsProfitLossChart;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossChartViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/EdgeProfitLossLimit;", "", "limit", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart$ProfitLossLimit;", "side", "Lcom/robinhood/android/trade/options/profitloss/EdgeProfitLossLimit$Side;", "visibleScrubBarUnderlyingPrice", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$UnderlyingPrice;", "<init>", "(Lcom/robinhood/models/api/ApiOptionsProfitLossChart$ProfitLossLimit;Lcom/robinhood/android/trade/options/profitloss/EdgeProfitLossLimit$Side;Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$UnderlyingPrice;)V", "getLimit", "()Lcom/robinhood/models/api/ApiOptionsProfitLossChart$ProfitLossLimit;", "getSide", "()Lcom/robinhood/android/trade/options/profitloss/EdgeProfitLossLimit$Side;", "getVisibleScrubBarUnderlyingPrice", "()Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartData$UnderlyingPrice;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Side", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class EdgeProfitLossLimit {
    public static final int $stable = 8;
    private final ApiOptionsProfitLossChart.ProfitLossLimit limit;
    private final Side side;
    private final OptionsProfitLossChartData.UnderlyingPrice visibleScrubBarUnderlyingPrice;

    public static /* synthetic */ EdgeProfitLossLimit copy$default(EdgeProfitLossLimit edgeProfitLossLimit, ApiOptionsProfitLossChart.ProfitLossLimit profitLossLimit, Side side, OptionsProfitLossChartData.UnderlyingPrice underlyingPrice, int i, Object obj) {
        if ((i & 1) != 0) {
            profitLossLimit = edgeProfitLossLimit.limit;
        }
        if ((i & 2) != 0) {
            side = edgeProfitLossLimit.side;
        }
        if ((i & 4) != 0) {
            underlyingPrice = edgeProfitLossLimit.visibleScrubBarUnderlyingPrice;
        }
        return edgeProfitLossLimit.copy(profitLossLimit, side, underlyingPrice);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiOptionsProfitLossChart.ProfitLossLimit getLimit() {
        return this.limit;
    }

    /* renamed from: component2, reason: from getter */
    public final Side getSide() {
        return this.side;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionsProfitLossChartData.UnderlyingPrice getVisibleScrubBarUnderlyingPrice() {
        return this.visibleScrubBarUnderlyingPrice;
    }

    public final EdgeProfitLossLimit copy(ApiOptionsProfitLossChart.ProfitLossLimit limit, Side side, OptionsProfitLossChartData.UnderlyingPrice visibleScrubBarUnderlyingPrice) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(visibleScrubBarUnderlyingPrice, "visibleScrubBarUnderlyingPrice");
        return new EdgeProfitLossLimit(limit, side, visibleScrubBarUnderlyingPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdgeProfitLossLimit)) {
            return false;
        }
        EdgeProfitLossLimit edgeProfitLossLimit = (EdgeProfitLossLimit) other;
        return Intrinsics.areEqual(this.limit, edgeProfitLossLimit.limit) && this.side == edgeProfitLossLimit.side && Intrinsics.areEqual(this.visibleScrubBarUnderlyingPrice, edgeProfitLossLimit.visibleScrubBarUnderlyingPrice);
    }

    public int hashCode() {
        return (((this.limit.hashCode() * 31) + this.side.hashCode()) * 31) + this.visibleScrubBarUnderlyingPrice.hashCode();
    }

    public String toString() {
        return "EdgeProfitLossLimit(limit=" + this.limit + ", side=" + this.side + ", visibleScrubBarUnderlyingPrice=" + this.visibleScrubBarUnderlyingPrice + ")";
    }

    public EdgeProfitLossLimit(ApiOptionsProfitLossChart.ProfitLossLimit limit, Side side, OptionsProfitLossChartData.UnderlyingPrice visibleScrubBarUnderlyingPrice) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(visibleScrubBarUnderlyingPrice, "visibleScrubBarUnderlyingPrice");
        this.limit = limit;
        this.side = side;
        this.visibleScrubBarUnderlyingPrice = visibleScrubBarUnderlyingPrice;
    }

    public final ApiOptionsProfitLossChart.ProfitLossLimit getLimit() {
        return this.limit;
    }

    public final Side getSide() {
        return this.side;
    }

    public final OptionsProfitLossChartData.UnderlyingPrice getVisibleScrubBarUnderlyingPrice() {
        return this.visibleScrubBarUnderlyingPrice;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionsProfitLossChartViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/EdgeProfitLossLimit$Side;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Side {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Side[] $VALUES;
        public static final Side LEFT = new Side("LEFT", 0);
        public static final Side RIGHT = new Side("RIGHT", 1);

        private static final /* synthetic */ Side[] $values() {
            return new Side[]{LEFT, RIGHT};
        }

        public static EnumEntries<Side> getEntries() {
            return $ENTRIES;
        }

        static {
            Side[] sideArr$values = $values();
            $VALUES = sideArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sideArr$values);
        }

        private Side(String str, int i) {
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }
}

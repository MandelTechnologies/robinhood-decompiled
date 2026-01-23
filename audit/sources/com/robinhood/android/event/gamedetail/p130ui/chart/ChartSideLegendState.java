package com.robinhood.android.event.gamedetail.p130ui.chart;

import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GameDetailChartSideLegend.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/chart/ChartSideLegendState;", "", "contractItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/event/gamedetail/ui/chart/ChartSideLegendState$ContractItem;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getContractItems", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ContractItem", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChartSideLegendState {
    public static final int $stable = 0;
    private final ImmutableList<ContractItem> contractItems;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChartSideLegendState copy$default(ChartSideLegendState chartSideLegendState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = chartSideLegendState.contractItems;
        }
        return chartSideLegendState.copy(immutableList);
    }

    public final ImmutableList<ContractItem> component1() {
        return this.contractItems;
    }

    public final ChartSideLegendState copy(ImmutableList<ContractItem> contractItems) {
        Intrinsics.checkNotNullParameter(contractItems, "contractItems");
        return new ChartSideLegendState(contractItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChartSideLegendState) && Intrinsics.areEqual(this.contractItems, ((ChartSideLegendState) other).contractItems);
    }

    public int hashCode() {
        return this.contractItems.hashCode();
    }

    public String toString() {
        return "ChartSideLegendState(contractItems=" + this.contractItems + ")";
    }

    public ChartSideLegendState(ImmutableList<ContractItem> contractItems) {
        Intrinsics.checkNotNullParameter(contractItems, "contractItems");
        this.contractItems = contractItems;
    }

    public final ImmutableList<ContractItem> getContractItems() {
        return this.contractItems;
    }

    /* compiled from: GameDetailChartSideLegend.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/chart/ChartSideLegendState$ContractItem;", "", "displayStr", "", ResourceTypes.COLOR, "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "yPosition", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;F)V", "getDisplayStr", "()Ljava/lang/String;", "getColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "getYPosition", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContractItem {
        public static final int $stable = 0;
        private final DayNightColor color;
        private final String displayStr;
        private final float yPosition;

        public static /* synthetic */ ContractItem copy$default(ContractItem contractItem, String str, DayNightColor dayNightColor, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contractItem.displayStr;
            }
            if ((i & 2) != 0) {
                dayNightColor = contractItem.color;
            }
            if ((i & 4) != 0) {
                f = contractItem.yPosition;
            }
            return contractItem.copy(str, dayNightColor, f);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisplayStr() {
            return this.displayStr;
        }

        /* renamed from: component2, reason: from getter */
        public final DayNightColor getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final float getYPosition() {
            return this.yPosition;
        }

        public final ContractItem copy(String displayStr, DayNightColor color, float yPosition) {
            Intrinsics.checkNotNullParameter(displayStr, "displayStr");
            Intrinsics.checkNotNullParameter(color, "color");
            return new ContractItem(displayStr, color, yPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContractItem)) {
                return false;
            }
            ContractItem contractItem = (ContractItem) other;
            return Intrinsics.areEqual(this.displayStr, contractItem.displayStr) && Intrinsics.areEqual(this.color, contractItem.color) && Float.compare(this.yPosition, contractItem.yPosition) == 0;
        }

        public int hashCode() {
            return (((this.displayStr.hashCode() * 31) + this.color.hashCode()) * 31) + Float.hashCode(this.yPosition);
        }

        public String toString() {
            return "ContractItem(displayStr=" + this.displayStr + ", color=" + this.color + ", yPosition=" + this.yPosition + ")";
        }

        public ContractItem(String displayStr, DayNightColor color, float f) {
            Intrinsics.checkNotNullParameter(displayStr, "displayStr");
            Intrinsics.checkNotNullParameter(color, "color");
            this.displayStr = displayStr;
            this.color = color;
            this.yPosition = f;
        }

        public final String getDisplayStr() {
            return this.displayStr;
        }

        public final DayNightColor getColor() {
            return this.color;
        }

        public final float getYPosition() {
            return this.yPosition;
        }
    }
}

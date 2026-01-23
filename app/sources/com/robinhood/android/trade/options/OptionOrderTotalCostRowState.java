package com.robinhood.android.trade.options;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderTotalCostRowComposeView.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTotalCostRowState;", "", "title", "", "totalCostDetailRowState", "Lcom/robinhood/android/trade/options/TotalCostDetailRowState;", "netValueText", "collapsed", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/trade/options/TotalCostDetailRowState;Ljava/lang/String;Ljava/lang/Boolean;)V", "getTitle", "()Ljava/lang/String;", "getTotalCostDetailRowState", "()Lcom/robinhood/android/trade/options/TotalCostDetailRowState;", "getNetValueText", "getCollapsed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/robinhood/android/trade/options/TotalCostDetailRowState;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/robinhood/android/trade/options/OptionOrderTotalCostRowState;", "equals", "other", "hashCode", "", "toString", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptionOrderTotalCostRowState {
    public static final int $stable = 8;
    private final Boolean collapsed;
    private final String netValueText;
    private final String title;
    private final TotalCostDetailRowState totalCostDetailRowState;

    public static /* synthetic */ OptionOrderTotalCostRowState copy$default(OptionOrderTotalCostRowState optionOrderTotalCostRowState, String str, TotalCostDetailRowState totalCostDetailRowState, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOrderTotalCostRowState.title;
        }
        if ((i & 2) != 0) {
            totalCostDetailRowState = optionOrderTotalCostRowState.totalCostDetailRowState;
        }
        if ((i & 4) != 0) {
            str2 = optionOrderTotalCostRowState.netValueText;
        }
        if ((i & 8) != 0) {
            bool = optionOrderTotalCostRowState.collapsed;
        }
        return optionOrderTotalCostRowState.copy(str, totalCostDetailRowState, str2, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TotalCostDetailRowState getTotalCostDetailRowState() {
        return this.totalCostDetailRowState;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNetValueText() {
        return this.netValueText;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getCollapsed() {
        return this.collapsed;
    }

    public final OptionOrderTotalCostRowState copy(String title, TotalCostDetailRowState totalCostDetailRowState, String netValueText, Boolean collapsed) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(totalCostDetailRowState, "totalCostDetailRowState");
        Intrinsics.checkNotNullParameter(netValueText, "netValueText");
        return new OptionOrderTotalCostRowState(title, totalCostDetailRowState, netValueText, collapsed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOrderTotalCostRowState)) {
            return false;
        }
        OptionOrderTotalCostRowState optionOrderTotalCostRowState = (OptionOrderTotalCostRowState) other;
        return Intrinsics.areEqual(this.title, optionOrderTotalCostRowState.title) && Intrinsics.areEqual(this.totalCostDetailRowState, optionOrderTotalCostRowState.totalCostDetailRowState) && Intrinsics.areEqual(this.netValueText, optionOrderTotalCostRowState.netValueText) && Intrinsics.areEqual(this.collapsed, optionOrderTotalCostRowState.collapsed);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.totalCostDetailRowState.hashCode()) * 31) + this.netValueText.hashCode()) * 31;
        Boolean bool = this.collapsed;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "OptionOrderTotalCostRowState(title=" + this.title + ", totalCostDetailRowState=" + this.totalCostDetailRowState + ", netValueText=" + this.netValueText + ", collapsed=" + this.collapsed + ")";
    }

    public OptionOrderTotalCostRowState(String title, TotalCostDetailRowState totalCostDetailRowState, String netValueText, Boolean bool) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(totalCostDetailRowState, "totalCostDetailRowState");
        Intrinsics.checkNotNullParameter(netValueText, "netValueText");
        this.title = title;
        this.totalCostDetailRowState = totalCostDetailRowState;
        this.netValueText = netValueText;
        this.collapsed = bool;
    }

    public final String getTitle() {
        return this.title;
    }

    public final TotalCostDetailRowState getTotalCostDetailRowState() {
        return this.totalCostDetailRowState;
    }

    public final String getNetValueText() {
        return this.netValueText;
    }

    public final Boolean getCollapsed() {
        return this.collapsed;
    }
}

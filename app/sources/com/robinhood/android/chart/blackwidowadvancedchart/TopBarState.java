package com.robinhood.android.chart.blackwidowadvancedchart;

import com.robinhood.android.chart.blackwidowadvancedchart.LowerTopBarState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlackWidowAdvancedChartViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/TopBarState;", "", "quoteState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/QuoteState;", "lowerTopBarDisplayStatus", "Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;", "<init>", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/QuoteState;Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;)V", "getQuoteState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/QuoteState;", "getLowerTopBarDisplayStatus", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TopBarState {
    public static final int $stable = StringResource.$stable;
    private final LowerTopBarState.DisplayStatus lowerTopBarDisplayStatus;
    private final QuoteState quoteState;

    public static /* synthetic */ TopBarState copy$default(TopBarState topBarState, QuoteState quoteState, LowerTopBarState.DisplayStatus displayStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            quoteState = topBarState.quoteState;
        }
        if ((i & 2) != 0) {
            displayStatus = topBarState.lowerTopBarDisplayStatus;
        }
        return topBarState.copy(quoteState, displayStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final QuoteState getQuoteState() {
        return this.quoteState;
    }

    /* renamed from: component2, reason: from getter */
    public final LowerTopBarState.DisplayStatus getLowerTopBarDisplayStatus() {
        return this.lowerTopBarDisplayStatus;
    }

    public final TopBarState copy(QuoteState quoteState, LowerTopBarState.DisplayStatus lowerTopBarDisplayStatus) {
        Intrinsics.checkNotNullParameter(lowerTopBarDisplayStatus, "lowerTopBarDisplayStatus");
        return new TopBarState(quoteState, lowerTopBarDisplayStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopBarState)) {
            return false;
        }
        TopBarState topBarState = (TopBarState) other;
        return Intrinsics.areEqual(this.quoteState, topBarState.quoteState) && Intrinsics.areEqual(this.lowerTopBarDisplayStatus, topBarState.lowerTopBarDisplayStatus);
    }

    public int hashCode() {
        QuoteState quoteState = this.quoteState;
        return ((quoteState == null ? 0 : quoteState.hashCode()) * 31) + this.lowerTopBarDisplayStatus.hashCode();
    }

    public String toString() {
        return "TopBarState(quoteState=" + this.quoteState + ", lowerTopBarDisplayStatus=" + this.lowerTopBarDisplayStatus + ")";
    }

    public TopBarState(QuoteState quoteState, LowerTopBarState.DisplayStatus lowerTopBarDisplayStatus) {
        Intrinsics.checkNotNullParameter(lowerTopBarDisplayStatus, "lowerTopBarDisplayStatus");
        this.quoteState = quoteState;
        this.lowerTopBarDisplayStatus = lowerTopBarDisplayStatus;
    }

    public final QuoteState getQuoteState() {
        return this.quoteState;
    }

    public final LowerTopBarState.DisplayStatus getLowerTopBarDisplayStatus() {
        return this.lowerTopBarDisplayStatus;
    }
}

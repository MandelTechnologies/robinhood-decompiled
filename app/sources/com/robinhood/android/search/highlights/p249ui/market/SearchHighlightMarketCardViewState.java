package com.robinhood.android.search.highlights.p249ui.market;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchHighlightMarketCardViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightMarketCardViewState;", "", "chartData", "Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightChartData;", "<init>", "(Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightChartData;)V", "getChartData", "()Lcom/robinhood/android/search/highlights/ui/market/SearchHighlightChartData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SearchHighlightMarketCardViewState {
    public static final int $stable = 8;
    private final SearchHighlightChartData chartData;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchHighlightMarketCardViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SearchHighlightMarketCardViewState copy$default(SearchHighlightMarketCardViewState searchHighlightMarketCardViewState, SearchHighlightChartData searchHighlightChartData, int i, Object obj) {
        if ((i & 1) != 0) {
            searchHighlightChartData = searchHighlightMarketCardViewState.chartData;
        }
        return searchHighlightMarketCardViewState.copy(searchHighlightChartData);
    }

    /* renamed from: component1, reason: from getter */
    public final SearchHighlightChartData getChartData() {
        return this.chartData;
    }

    public final SearchHighlightMarketCardViewState copy(SearchHighlightChartData chartData) {
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        return new SearchHighlightMarketCardViewState(chartData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SearchHighlightMarketCardViewState) && Intrinsics.areEqual(this.chartData, ((SearchHighlightMarketCardViewState) other).chartData);
    }

    public int hashCode() {
        return this.chartData.hashCode();
    }

    public String toString() {
        return "SearchHighlightMarketCardViewState(chartData=" + this.chartData + ")";
    }

    public SearchHighlightMarketCardViewState(SearchHighlightChartData chartData) {
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        this.chartData = chartData;
    }

    public /* synthetic */ SearchHighlightMarketCardViewState(SearchHighlightChartData searchHighlightChartData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SearchHighlightChartData(null, null, null, null, null, null, null, null, null, true, null, null, null, 7679, null) : searchHighlightChartData);
    }

    public final SearchHighlightChartData getChartData() {
        return this.chartData;
    }
}

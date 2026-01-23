package com.robinhood.android.tradingtrends.p264ui.chartSection;

import com.robinhood.libtradingtrends.contracts.TradingTrendsSection;
import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradingTrendsChartSectionState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionDataState;", "", "instrumentId", "", "isDetailPage", "", "loading", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Ljava/lang/String;ZZLcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;)V", "getInstrumentId", "()Ljava/lang/String;", "()Z", "getLoading", "getData", "()Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TradingTrendsChartSectionDataState {
    public static final int $stable = 8;
    private final ChartGroup<GenericAction> chart;
    private final TradingTrendsSection data;
    private final String instrumentId;
    private final boolean isDetailPage;
    private final boolean loading;

    public TradingTrendsChartSectionDataState() {
        this(null, false, false, null, null, 31, null);
    }

    public static /* synthetic */ TradingTrendsChartSectionDataState copy$default(TradingTrendsChartSectionDataState tradingTrendsChartSectionDataState, String str, boolean z, boolean z2, TradingTrendsSection tradingTrendsSection, ChartGroup chartGroup, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradingTrendsChartSectionDataState.instrumentId;
        }
        if ((i & 2) != 0) {
            z = tradingTrendsChartSectionDataState.isDetailPage;
        }
        if ((i & 4) != 0) {
            z2 = tradingTrendsChartSectionDataState.loading;
        }
        if ((i & 8) != 0) {
            tradingTrendsSection = tradingTrendsChartSectionDataState.data;
        }
        if ((i & 16) != 0) {
            chartGroup = tradingTrendsChartSectionDataState.chart;
        }
        ChartGroup chartGroup2 = chartGroup;
        boolean z3 = z2;
        return tradingTrendsChartSectionDataState.copy(str, z, z3, tradingTrendsSection, chartGroup2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDetailPage() {
        return this.isDetailPage;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component4, reason: from getter */
    public final TradingTrendsSection getData() {
        return this.data;
    }

    public final ChartGroup<GenericAction> component5() {
        return this.chart;
    }

    public final TradingTrendsChartSectionDataState copy(String instrumentId, boolean isDetailPage, boolean loading, TradingTrendsSection data, ChartGroup<? extends GenericAction> chart) {
        return new TradingTrendsChartSectionDataState(instrumentId, isDetailPage, loading, data, chart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradingTrendsChartSectionDataState)) {
            return false;
        }
        TradingTrendsChartSectionDataState tradingTrendsChartSectionDataState = (TradingTrendsChartSectionDataState) other;
        return Intrinsics.areEqual(this.instrumentId, tradingTrendsChartSectionDataState.instrumentId) && this.isDetailPage == tradingTrendsChartSectionDataState.isDetailPage && this.loading == tradingTrendsChartSectionDataState.loading && Intrinsics.areEqual(this.data, tradingTrendsChartSectionDataState.data) && Intrinsics.areEqual(this.chart, tradingTrendsChartSectionDataState.chart);
    }

    public int hashCode() {
        String str = this.instrumentId;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isDetailPage)) * 31) + Boolean.hashCode(this.loading)) * 31;
        TradingTrendsSection tradingTrendsSection = this.data;
        int iHashCode2 = (iHashCode + (tradingTrendsSection == null ? 0 : tradingTrendsSection.hashCode())) * 31;
        ChartGroup<GenericAction> chartGroup = this.chart;
        return iHashCode2 + (chartGroup != null ? chartGroup.hashCode() : 0);
    }

    public String toString() {
        return "TradingTrendsChartSectionDataState(instrumentId=" + this.instrumentId + ", isDetailPage=" + this.isDetailPage + ", loading=" + this.loading + ", data=" + this.data + ", chart=" + this.chart + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TradingTrendsChartSectionDataState(String str, boolean z, boolean z2, TradingTrendsSection tradingTrendsSection, ChartGroup<? extends GenericAction> chartGroup) {
        this.instrumentId = str;
        this.isDetailPage = z;
        this.loading = z2;
        this.data = tradingTrendsSection;
        this.chart = chartGroup;
    }

    public /* synthetic */ TradingTrendsChartSectionDataState(String str, boolean z, boolean z2, TradingTrendsSection tradingTrendsSection, ChartGroup chartGroup, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? null : tradingTrendsSection, (i & 16) != 0 ? null : chartGroup);
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final boolean isDetailPage() {
        return this.isDetailPage;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final TradingTrendsSection getData() {
        return this.data;
    }

    public final ChartGroup<GenericAction> getChart() {
        return this.chart;
    }
}

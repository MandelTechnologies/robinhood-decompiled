package com.robinhood.android.tradingtrends.p264ui.chartSection;

import com.robinhood.libtradingtrends.contracts.TradingTrendsSection;
import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradingTrendsChartSectionState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "", "Disabled", "Loading", "Ready", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState$Disabled;", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState$Loading;", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState$Ready;", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionViewState, reason: use source file name */
/* loaded from: classes9.dex */
public interface TradingTrendsChartSectionState3 {

    /* compiled from: TradingTrendsChartSectionState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState$Disabled;", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionViewState$Disabled */
    public static final /* data */ class Disabled implements TradingTrendsChartSectionState3 {
        public static final int $stable = 0;
        public static final Disabled INSTANCE = new Disabled();

        public boolean equals(Object other) {
            return this == other || (other instanceof Disabled);
        }

        public int hashCode() {
            return -155087100;
        }

        public String toString() {
            return "Disabled";
        }

        private Disabled() {
        }
    }

    /* compiled from: TradingTrendsChartSectionState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState$Loading;", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "isDetailPage", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionViewState$Loading, reason: from toString */
    public static final /* data */ class Loading implements TradingTrendsChartSectionState3 {
        public static final int $stable = 0;
        private final boolean isDetailPage;

        public static /* synthetic */ Loading copy$default(Loading loading, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loading.isDetailPage;
            }
            return loading.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsDetailPage() {
            return this.isDetailPage;
        }

        public final Loading copy(boolean isDetailPage) {
            return new Loading(isDetailPage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.isDetailPage == ((Loading) other).isDetailPage;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isDetailPage);
        }

        public String toString() {
            return "Loading(isDetailPage=" + this.isDetailPage + ")";
        }

        public Loading(boolean z) {
            this.isDetailPage = z;
        }

        public final boolean isDetailPage() {
            return this.isDetailPage;
        }
    }

    /* compiled from: TradingTrendsChartSectionState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState$Ready;", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "instrumentId", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "chart", "Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Ljava/lang/String;Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;)V", "getInstrumentId", "()Ljava/lang/String;", "getData", "()Lcom/robinhood/libtradingtrends/contracts/TradingTrendsSection;", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionViewState$Ready, reason: from toString */
    public static final /* data */ class Ready implements TradingTrendsChartSectionState3 {
        public static final int $stable = 8;
        private final ChartGroup<GenericAction> chart;
        private final TradingTrendsSection data;
        private final String instrumentId;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ready copy$default(Ready ready, String str, TradingTrendsSection tradingTrendsSection, ChartGroup chartGroup, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ready.instrumentId;
            }
            if ((i & 2) != 0) {
                tradingTrendsSection = ready.data;
            }
            if ((i & 4) != 0) {
                chartGroup = ready.chart;
            }
            return ready.copy(str, tradingTrendsSection, chartGroup);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final TradingTrendsSection getData() {
            return this.data;
        }

        public final ChartGroup<GenericAction> component3() {
            return this.chart;
        }

        public final Ready copy(String instrumentId, TradingTrendsSection data, ChartGroup<? extends GenericAction> chart) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(data, "data");
            return new Ready(instrumentId, data, chart);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.instrumentId, ready.instrumentId) && Intrinsics.areEqual(this.data, ready.data) && Intrinsics.areEqual(this.chart, ready.chart);
        }

        public int hashCode() {
            int iHashCode = ((this.instrumentId.hashCode() * 31) + this.data.hashCode()) * 31;
            ChartGroup<GenericAction> chartGroup = this.chart;
            return iHashCode + (chartGroup == null ? 0 : chartGroup.hashCode());
        }

        public String toString() {
            return "Ready(instrumentId=" + this.instrumentId + ", data=" + this.data + ", chart=" + this.chart + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Ready(String instrumentId, TradingTrendsSection data, ChartGroup<? extends GenericAction> chartGroup) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(data, "data");
            this.instrumentId = instrumentId;
            this.data = data;
            this.chart = chartGroup;
        }

        public final String getInstrumentId() {
            return this.instrumentId;
        }

        public final TradingTrendsSection getData() {
            return this.data;
        }

        public final ChartGroup<GenericAction> getChart() {
            return this.chart;
        }
    }
}

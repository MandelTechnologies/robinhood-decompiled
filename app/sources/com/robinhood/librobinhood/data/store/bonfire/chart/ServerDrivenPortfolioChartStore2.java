package com.robinhood.librobinhood.data.store.bonfire.chart;

import com.robinhood.android.charts.models.p080db.PortfolioChartModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServerDrivenPortfolioChartStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenChartState;", "", "Loading", "Error", "Success", "Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenChartState$Error;", "Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenChartState$Loading;", "Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenChartState$Success;", "lib-store-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenChartState, reason: use source file name */
/* loaded from: classes13.dex */
public interface ServerDrivenPortfolioChartStore2 {

    /* compiled from: ServerDrivenPortfolioChartStore.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenChartState$Loading;", "Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenChartState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenChartState$Loading */
    public static final /* data */ class Loading implements ServerDrivenPortfolioChartStore2 {
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 487470408;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: ServerDrivenPortfolioChartStore.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenChartState$Error;", "Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenChartState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenChartState$Error */
    public static final /* data */ class Error implements ServerDrivenPortfolioChartStore2 {
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -1444955884;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }

    /* compiled from: ServerDrivenPortfolioChartStore.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenChartState$Success;", "Lcom/robinhood/librobinhood/data/store/bonfire/chart/ServerDrivenChartState;", "chart", "Lcom/robinhood/android/charts/models/db/PortfolioChartModel;", "<init>", "(Lcom/robinhood/android/charts/models/db/PortfolioChartModel;)V", "getChart", "()Lcom/robinhood/android/charts/models/db/PortfolioChartModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.chart.ServerDrivenChartState$Success, reason: from toString */
    public static final /* data */ class Success implements ServerDrivenPortfolioChartStore2 {
        private final PortfolioChartModel chart;

        public static /* synthetic */ Success copy$default(Success success, PortfolioChartModel portfolioChartModel, int i, Object obj) {
            if ((i & 1) != 0) {
                portfolioChartModel = success.chart;
            }
            return success.copy(portfolioChartModel);
        }

        /* renamed from: component1, reason: from getter */
        public final PortfolioChartModel getChart() {
            return this.chart;
        }

        public final Success copy(PortfolioChartModel chart) {
            Intrinsics.checkNotNullParameter(chart, "chart");
            return new Success(chart);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.chart, ((Success) other).chart);
        }

        public int hashCode() {
            return this.chart.hashCode();
        }

        public String toString() {
            return "Success(chart=" + this.chart + ")";
        }

        public Success(PortfolioChartModel chart) {
            Intrinsics.checkNotNullParameter(chart, "chart");
            this.chart = chart;
        }

        public final PortfolioChartModel getChart() {
            return this.chart;
        }
    }
}

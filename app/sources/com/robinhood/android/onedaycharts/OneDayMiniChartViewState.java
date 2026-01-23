package com.robinhood.android.onedaycharts;

import com.robinhood.librobinhood.data.store.OneDayChartData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: OneDayMiniChartViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onedaycharts/OneDayMiniChartViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartViewState$Loaded;", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartViewState$Loading;", "lib-one-day-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface OneDayMiniChartViewState {

    /* compiled from: OneDayMiniChartViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/onedaycharts/OneDayMiniChartViewState$Loading;", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-one-day-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements OneDayMiniChartViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1573559912;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: OneDayMiniChartViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/onedaycharts/OneDayMiniChartViewState$Loaded;", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartViewState;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/android/onedaycharts/OneDayMiniChartDetails;", "chartData", "Lcom/robinhood/librobinhood/data/store/OneDayChartData;", "isStale", "", "<init>", "(Lcom/robinhood/android/onedaycharts/OneDayMiniChartDetails;Lcom/robinhood/librobinhood/data/store/OneDayChartData;Z)V", "getDetails", "()Lcom/robinhood/android/onedaycharts/OneDayMiniChartDetails;", "getChartData", "()Lcom/robinhood/librobinhood/data/store/OneDayChartData;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-one-day-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements OneDayMiniChartViewState {
        public static final int $stable = 8;
        private final OneDayChartData chartData;
        private final OneDayMiniChartDetails details;
        private final boolean isStale;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, OneDayMiniChartDetails oneDayMiniChartDetails, OneDayChartData oneDayChartData, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                oneDayMiniChartDetails = loaded.details;
            }
            if ((i & 2) != 0) {
                oneDayChartData = loaded.chartData;
            }
            if ((i & 4) != 0) {
                z = loaded.isStale;
            }
            return loaded.copy(oneDayMiniChartDetails, oneDayChartData, z);
        }

        /* renamed from: component1, reason: from getter */
        public final OneDayMiniChartDetails getDetails() {
            return this.details;
        }

        /* renamed from: component2, reason: from getter */
        public final OneDayChartData getChartData() {
            return this.chartData;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsStale() {
            return this.isStale;
        }

        public final Loaded copy(OneDayMiniChartDetails details, OneDayChartData chartData, boolean isStale) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(chartData, "chartData");
            return new Loaded(details, chartData, isStale);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.details, loaded.details) && Intrinsics.areEqual(this.chartData, loaded.chartData) && this.isStale == loaded.isStale;
        }

        public int hashCode() {
            return (((this.details.hashCode() * 31) + this.chartData.hashCode()) * 31) + Boolean.hashCode(this.isStale);
        }

        public String toString() {
            return "Loaded(details=" + this.details + ", chartData=" + this.chartData + ", isStale=" + this.isStale + ")";
        }

        public Loaded(OneDayMiniChartDetails details, OneDayChartData chartData, boolean z) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(chartData, "chartData");
            this.details = details;
            this.chartData = chartData;
            this.isStale = z;
        }

        public final OneDayMiniChartDetails getDetails() {
            return this.details;
        }

        public final OneDayChartData getChartData() {
            return this.chartData;
        }

        public final boolean isStale() {
            return this.isStale;
        }
    }
}

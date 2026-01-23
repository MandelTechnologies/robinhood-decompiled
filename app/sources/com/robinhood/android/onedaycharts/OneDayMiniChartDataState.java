package com.robinhood.android.onedaycharts;

import com.robinhood.librobinhood.data.store.OneDayChartData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneDayMiniChartDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/onedaycharts/OneDayMiniChartDataState;", "", "chartDetails", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartDetails;", "chartData", "Lcom/robinhood/librobinhood/data/store/OneDayChartData;", "isStale", "", "<init>", "(Lcom/robinhood/android/onedaycharts/OneDayMiniChartDetails;Lcom/robinhood/librobinhood/data/store/OneDayChartData;Ljava/lang/Boolean;)V", "getChartDetails", "()Lcom/robinhood/android/onedaycharts/OneDayMiniChartDetails;", "getChartData", "()Lcom/robinhood/librobinhood/data/store/OneDayChartData;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Lcom/robinhood/android/onedaycharts/OneDayMiniChartDetails;Lcom/robinhood/librobinhood/data/store/OneDayChartData;Ljava/lang/Boolean;)Lcom/robinhood/android/onedaycharts/OneDayMiniChartDataState;", "equals", "other", "hashCode", "", "toString", "", "lib-one-day-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OneDayMiniChartDataState {
    public static final int $stable = 8;
    private final OneDayChartData chartData;
    private final OneDayMiniChartDetails chartDetails;
    private final Boolean isStale;

    public OneDayMiniChartDataState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OneDayMiniChartDataState copy$default(OneDayMiniChartDataState oneDayMiniChartDataState, OneDayMiniChartDetails oneDayMiniChartDetails, OneDayChartData oneDayChartData, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            oneDayMiniChartDetails = oneDayMiniChartDataState.chartDetails;
        }
        if ((i & 2) != 0) {
            oneDayChartData = oneDayMiniChartDataState.chartData;
        }
        if ((i & 4) != 0) {
            bool = oneDayMiniChartDataState.isStale;
        }
        return oneDayMiniChartDataState.copy(oneDayMiniChartDetails, oneDayChartData, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final OneDayMiniChartDetails getChartDetails() {
        return this.chartDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final OneDayChartData getChartData() {
        return this.chartData;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsStale() {
        return this.isStale;
    }

    public final OneDayMiniChartDataState copy(OneDayMiniChartDetails chartDetails, OneDayChartData chartData, Boolean isStale) {
        return new OneDayMiniChartDataState(chartDetails, chartData, isStale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneDayMiniChartDataState)) {
            return false;
        }
        OneDayMiniChartDataState oneDayMiniChartDataState = (OneDayMiniChartDataState) other;
        return Intrinsics.areEqual(this.chartDetails, oneDayMiniChartDataState.chartDetails) && Intrinsics.areEqual(this.chartData, oneDayMiniChartDataState.chartData) && Intrinsics.areEqual(this.isStale, oneDayMiniChartDataState.isStale);
    }

    public int hashCode() {
        OneDayMiniChartDetails oneDayMiniChartDetails = this.chartDetails;
        int iHashCode = (oneDayMiniChartDetails == null ? 0 : oneDayMiniChartDetails.hashCode()) * 31;
        OneDayChartData oneDayChartData = this.chartData;
        int iHashCode2 = (iHashCode + (oneDayChartData == null ? 0 : oneDayChartData.hashCode())) * 31;
        Boolean bool = this.isStale;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "OneDayMiniChartDataState(chartDetails=" + this.chartDetails + ", chartData=" + this.chartData + ", isStale=" + this.isStale + ")";
    }

    public OneDayMiniChartDataState(OneDayMiniChartDetails oneDayMiniChartDetails, OneDayChartData oneDayChartData, Boolean bool) {
        this.chartDetails = oneDayMiniChartDetails;
        this.chartData = oneDayChartData;
        this.isStale = bool;
    }

    public /* synthetic */ OneDayMiniChartDataState(OneDayMiniChartDetails oneDayMiniChartDetails, OneDayChartData oneDayChartData, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : oneDayMiniChartDetails, (i & 2) != 0 ? null : oneDayChartData, (i & 4) != 0 ? null : bool);
    }

    public final OneDayMiniChartDetails getChartDetails() {
        return this.chartDetails;
    }

    public final OneDayChartData getChartData() {
        return this.chartData;
    }

    public final Boolean isStale() {
        return this.isStale;
    }
}

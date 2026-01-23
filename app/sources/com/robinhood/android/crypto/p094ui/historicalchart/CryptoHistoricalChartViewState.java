package com.robinhood.android.crypto.p094ui.historicalchart;

import com.robinhood.shared.crypto.charts.p374ui.HistoricalChartState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHistoricalChartViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartViewState;", "", "chartState", "Lcom/robinhood/shared/crypto/charts/ui/HistoricalChartState;", "headerString", "", "<init>", "(Lcom/robinhood/shared/crypto/charts/ui/HistoricalChartState;Ljava/lang/String;)V", "getChartState", "()Lcom/robinhood/shared/crypto/charts/ui/HistoricalChartState;", "getHeaderString", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHistoricalChartViewState {
    public static final int $stable = HistoricalChartState.$stable;
    private final HistoricalChartState chartState;
    private final String headerString;

    public static /* synthetic */ CryptoHistoricalChartViewState copy$default(CryptoHistoricalChartViewState cryptoHistoricalChartViewState, HistoricalChartState historicalChartComposable4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            historicalChartComposable4 = cryptoHistoricalChartViewState.chartState;
        }
        if ((i & 2) != 0) {
            str = cryptoHistoricalChartViewState.headerString;
        }
        return cryptoHistoricalChartViewState.copy(historicalChartComposable4, str);
    }

    /* renamed from: component1, reason: from getter */
    public final HistoricalChartState getChartState() {
        return this.chartState;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHeaderString() {
        return this.headerString;
    }

    public final CryptoHistoricalChartViewState copy(HistoricalChartState chartState, String headerString) {
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        return new CryptoHistoricalChartViewState(chartState, headerString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHistoricalChartViewState)) {
            return false;
        }
        CryptoHistoricalChartViewState cryptoHistoricalChartViewState = (CryptoHistoricalChartViewState) other;
        return Intrinsics.areEqual(this.chartState, cryptoHistoricalChartViewState.chartState) && Intrinsics.areEqual(this.headerString, cryptoHistoricalChartViewState.headerString);
    }

    public int hashCode() {
        int iHashCode = this.chartState.hashCode() * 31;
        String str = this.headerString;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CryptoHistoricalChartViewState(chartState=" + this.chartState + ", headerString=" + this.headerString + ")";
    }

    public CryptoHistoricalChartViewState(HistoricalChartState chartState, String str) {
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        this.chartState = chartState;
        this.headerString = str;
    }

    public final HistoricalChartState getChartState() {
        return this.chartState;
    }

    public final String getHeaderString() {
        return this.headerString;
    }
}

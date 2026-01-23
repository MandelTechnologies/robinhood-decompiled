package com.robinhood.android.futures.detail.p140ui;

import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartViewState;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesDetailScreen.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/PreviewOptions;", "", "state", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState;", "chartState", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState;", "<init>", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState;Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState;)V", "getState", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState;", "getChartState", "()Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
final /* data */ class PreviewOptions {
    private final FuturesDetailChartViewState chartState;
    private final FuturesDetailViewState state;

    public static /* synthetic */ PreviewOptions copy$default(PreviewOptions previewOptions, FuturesDetailViewState futuresDetailViewState, FuturesDetailChartViewState futuresDetailChartViewState, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresDetailViewState = previewOptions.state;
        }
        if ((i & 2) != 0) {
            futuresDetailChartViewState = previewOptions.chartState;
        }
        return previewOptions.copy(futuresDetailViewState, futuresDetailChartViewState);
    }

    /* renamed from: component1, reason: from getter */
    public final FuturesDetailViewState getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final FuturesDetailChartViewState getChartState() {
        return this.chartState;
    }

    public final PreviewOptions copy(FuturesDetailViewState state, FuturesDetailChartViewState chartState) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        return new PreviewOptions(state, chartState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewOptions)) {
            return false;
        }
        PreviewOptions previewOptions = (PreviewOptions) other;
        return Intrinsics.areEqual(this.state, previewOptions.state) && Intrinsics.areEqual(this.chartState, previewOptions.chartState);
    }

    public int hashCode() {
        return (this.state.hashCode() * 31) + this.chartState.hashCode();
    }

    public String toString() {
        return "PreviewOptions(state=" + this.state + ", chartState=" + this.chartState + ")";
    }

    public PreviewOptions(FuturesDetailViewState state, FuturesDetailChartViewState chartState) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        this.state = state;
        this.chartState = chartState;
    }

    public final FuturesDetailViewState getState() {
        return this.state;
    }

    public final FuturesDetailChartViewState getChartState() {
        return this.chartState;
    }
}

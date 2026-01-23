package com.robinhood.android.onedaycharts;

import com.robinhood.android.onedaycharts.OneDayMiniChartViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.librobinhood.data.store.OneDayChartData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneDayMiniChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/onedaycharts/OneDayMiniChartItemStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartDataState;", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartViewState;", "<init>", "()V", "reduce", "dataState", "lib-one-day-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onedaycharts.OneDayMiniChartItemStateProvider, reason: use source file name */
/* loaded from: classes10.dex */
public final class OneDayMiniChartDuxo4 implements StateProvider<OneDayMiniChartDataState, OneDayMiniChartViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public OneDayMiniChartViewState reduce(OneDayMiniChartDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getChartDetails() == null || dataState.getChartData() == null) {
            return OneDayMiniChartViewState.Loading.INSTANCE;
        }
        OneDayMiniChartDetails chartDetails = dataState.getChartDetails();
        OneDayChartData chartData = dataState.getChartData();
        Boolean boolIsStale = dataState.isStale();
        return new OneDayMiniChartViewState.Loaded(chartDetails, chartData, boolIsStale != null ? boolIsStale.booleanValue() : false);
    }
}

package com.robinhood.android.futures.assethome.sections;

import android.os.Parcelable;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAssetHomeChartStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartDataState;", "Lcom/robinhood/android/futures/assethome/sections/FuturesAssetHomeChartViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesAssetHomeChartStateProvider implements StateProvider<FuturesAssetHomeChartDataState, FuturesAssetHomeChartViewState> {
    public static final int $stable = 0;
    public static final FuturesAssetHomeChartStateProvider INSTANCE = new FuturesAssetHomeChartStateProvider();

    private FuturesAssetHomeChartStateProvider() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public FuturesAssetHomeChartViewState reduce(FuturesAssetHomeChartDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Chart<Parcelable> chart = dataState.getChart();
        String currentDisplaySpan = dataState.getCurrentDisplaySpan();
        CursorData scrubbedCursorData = dataState.getScrubbedCursorData();
        if (scrubbedCursorData == null) {
            scrubbedCursorData = dataState.getDefaultCursorData();
        }
        return new FuturesAssetHomeChartViewState(chart, currentDisplaySpan, scrubbedCursorData, dataState.getNetReturnBottomSheetViewState(), dataState.getSpanGrossReturn());
    }
}

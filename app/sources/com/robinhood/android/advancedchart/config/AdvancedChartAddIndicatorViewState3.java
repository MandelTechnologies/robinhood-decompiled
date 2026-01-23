package com.robinhood.android.advancedchart.config;

import com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartAddIndicatorViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorDataState;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState;", "<init>", "()V", "reduce", "dataState", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorProvider, reason: use source file name */
/* loaded from: classes24.dex */
public final class AdvancedChartAddIndicatorViewState3 implements StateProvider<AdvancedChartAddIndicatorDataState, AdvancedChartAddIndicatorViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AdvancedChartAddIndicatorViewState reduce(AdvancedChartAddIndicatorDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getFinalizedList().isEmpty()) {
            return AdvancedChartAddIndicatorViewState.Loading.INSTANCE;
        }
        if (dataState.getDialogErrorData() != null) {
            return new AdvancedChartAddIndicatorViewState.Error(dataState.getDialogErrorData().getFirst(), dataState.getDialogErrorData().getSecond());
        }
        if (dataState.getSelectedIndicatorType() != null) {
            return new AdvancedChartAddIndicatorViewState.SelectedType(dataState.getSelectedIndicatorType());
        }
        return new AdvancedChartAddIndicatorViewState.Loaded(dataState.getFinalizedList());
    }
}

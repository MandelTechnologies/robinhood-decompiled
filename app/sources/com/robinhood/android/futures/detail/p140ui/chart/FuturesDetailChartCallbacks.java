package com.robinhood.android.futures.detail.p140ui.chart;

import com.robinhood.android.udf.event.Event;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.store.futures.ChartType;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: FuturesDetailChartSection.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\fH&J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\fH&J\b\u0010\u0017\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartCallbacks;", "", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState;", "getStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "eventFlow", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/futures/detail/ui/chart/ChartEvent;", "getEventFlow", "onSpanSelected", "", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "onChartSettingsClicked", "onChartTypeSelected", "type", "Lcom/robinhood/store/futures/ChartType;", "onContinuousChartSelected", "isContinuousChart", "", "onChartSettingsDismissed", "onAdvancedChartOpened", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface FuturesDetailChartCallbacks {
    StateFlow<Event<FuturesDetailChartDuxo2>> getEventFlow();

    StateFlow<FuturesDetailChartViewState> getStateFlow();

    void onAdvancedChartOpened();

    void onChartSettingsClicked();

    void onChartSettingsDismissed();

    void onChartTypeSelected(ChartType type2);

    void onContinuousChartSelected(boolean isContinuousChart);

    void onSpanSelected(DisplaySpan span);
}

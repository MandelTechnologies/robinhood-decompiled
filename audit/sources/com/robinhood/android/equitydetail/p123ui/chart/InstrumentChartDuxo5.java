package com.robinhood.android.equitydetail.p123ui.chart;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewDataState;", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartViewState;", "<init>", "()V", "reduce", "dataState", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartViewStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class InstrumentChartDuxo5 implements StateProvider<InstrumentChartViewDataState, InstrumentChartViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public InstrumentChartViewState reduce(InstrumentChartViewDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Instrument instrument = dataState.getInstrument();
        SduiInstrumentChart sduiInstrumentChart = dataState.getSduiInstrumentChart();
        InstrumentChartSpans instrumentChartSpans = dataState.getInstrumentChartSpans();
        DisplaySpan displaySpanFromServerValue = DisplaySpan.INSTANCE.fromServerValue(dataState.getSpan());
        if (displaySpanFromServerValue == null) {
            displaySpanFromServerValue = DisplaySpan.UNKNOWN;
        }
        return new InstrumentChartViewState(instrument, sduiInstrumentChart, instrumentChartSpans, displaySpanFromServerValue, dataState.getShowAdtChip(), dataState.getMarginSubscription(), dataState.getGoldL2DataUpsellImprovements(), dataState.getGoldL2SdpEntrypointVariant(), dataState.getSelectedChartType(), dataState.getShowExtendedHours(), dataState.getHasVisitedBwChart(), dataState.isInBlackWidowAdvancedChartExperiment(), dataState.isInMcwRegionGate());
    }
}

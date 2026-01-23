package com.robinhood.android.chart.blackwidowadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartSetting;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TimeSpanDto;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartScreenState;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: BlackWidowAdvanceChartCallbacks.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0014\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\nH&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H&J\b\u0010&\u001a\u00020\u0003H&¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;", "", "setScreenState", "", "screenState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartScreenState;", "advance", "", "updateIndicator", "indicatorId", "", "action", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorAction;", "onToggleIndicatorsRow", "hideIndicatorsRow", "onSpanSelected", "timeSpan", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "onIntervalSelected", "interval", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;", "advanceScreenState", "onSetChartSetting", "setting", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSetting;", "renameTemplate", "name", "template", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "createTemplate", "templateName", "selectTemplate", "deleteTemplate", "onSearchItemSelected", "id", "Ljava/util/UUID;", "instrumentType", "Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "showAutoSendEnabledToast", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface BlackWidowAdvanceChartCallbacks {
    void advanceScreenState(ChartScreenState screenState);

    void createTemplate(String templateName);

    void deleteTemplate(TemplateDto template);

    void hideIndicatorsRow();

    void onIntervalSelected(IntervalDto interval);

    void onSearchItemSelected(UUID id, BlackWidowAdvancedChartFragmentKey2 instrumentType);

    void onSetChartSetting(SetChartSetting setting);

    void onSpanSelected(TimeSpanDto timeSpan);

    void onToggleIndicatorsRow();

    void renameTemplate(String name, TemplateDto template);

    void selectTemplate(TemplateDto template);

    void setScreenState(ChartScreenState screenState, boolean advance);

    void showAutoSendEnabledToast();

    void updateIndicator(String indicatorId, IndicatorAction action);

    /* compiled from: BlackWidowAdvanceChartCallbacks.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void setScreenState$default(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, ChartScreenState chartScreenState, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setScreenState");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            blackWidowAdvanceChartCallbacks.setScreenState(chartScreenState, z);
        }

        public static /* synthetic */ void advanceScreenState$default(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, ChartScreenState chartScreenState, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: advanceScreenState");
            }
            if ((i & 1) != 0) {
                chartScreenState = null;
            }
            blackWidowAdvanceChartCallbacks.advanceScreenState(chartScreenState);
        }
    }
}

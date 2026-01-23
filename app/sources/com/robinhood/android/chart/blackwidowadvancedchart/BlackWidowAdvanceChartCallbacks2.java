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
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlackWidowAdvanceChartCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"previewChartCallbacks", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;", "getPreviewChartCallbacks", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacksKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BlackWidowAdvanceChartCallbacks2 {
    private static final BlackWidowAdvanceChartCallbacks previewChartCallbacks = new BlackWidowAdvanceChartCallbacks() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacksKt$previewChartCallbacks$1
        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
        public void advanceScreenState(ChartScreenState screenState) {
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
        public void createTemplate(String templateName) {
            Intrinsics.checkNotNullParameter(templateName, "templateName");
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
        public void deleteTemplate(TemplateDto template) {
            Intrinsics.checkNotNullParameter(template, "template");
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
        public void hideIndicatorsRow() {
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
        public void onIntervalSelected(IntervalDto interval) {
            Intrinsics.checkNotNullParameter(interval, "interval");
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
        public void onSearchItemSelected(UUID id, BlackWidowAdvancedChartFragmentKey2 instrumentType) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
        public void onSetChartSetting(SetChartSetting setting) {
            Intrinsics.checkNotNullParameter(setting, "setting");
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
        public void onSpanSelected(TimeSpanDto timeSpan) {
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
        public void onToggleIndicatorsRow() {
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
        public void renameTemplate(String name, TemplateDto template) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(template, "template");
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
        public void selectTemplate(TemplateDto template) {
            Intrinsics.checkNotNullParameter(template, "template");
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
        public void setScreenState(ChartScreenState screenState, boolean advance) {
            Intrinsics.checkNotNullParameter(screenState, "screenState");
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
        public void showAutoSendEnabledToast() {
        }

        @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
        public void updateIndicator(String indicatorId, IndicatorAction action) {
            Intrinsics.checkNotNullParameter(indicatorId, "indicatorId");
            Intrinsics.checkNotNullParameter(action, "action");
        }
    };

    public static final BlackWidowAdvanceChartCallbacks getPreviewChartCallbacks() {
        return previewChartCallbacks;
    }
}

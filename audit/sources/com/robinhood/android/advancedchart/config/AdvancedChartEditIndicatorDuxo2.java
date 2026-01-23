package com.robinhood.android.advancedchart.config;

import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorLaunchMode;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartEditIndicatorDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0003¨\u0006\u0006"}, m3636d2 = {"getConfigAttributeList", "", "Lcom/robinhood/android/advancedchart/config/TechnicalIndicatorConfigAttribute;", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorLaunchMode;", "getIndicatorType", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator$Type;", "feature-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxoKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AdvancedChartEditIndicatorDuxo2 {
    public static final List<TechnicalIndicatorConfigAttribute> getConfigAttributeList(AdvancedChartEditIndicatorLaunchMode advancedChartEditIndicatorLaunchMode) {
        Intrinsics.checkNotNullParameter(advancedChartEditIndicatorLaunchMode, "<this>");
        if (advancedChartEditIndicatorLaunchMode instanceof AdvancedChartEditIndicatorLaunchMode.Adding) {
            return TechnicalIndicatorConfigAttribute2.toConfigAttributeList(((AdvancedChartEditIndicatorLaunchMode.Adding) advancedChartEditIndicatorLaunchMode).getApiTechnicalIndicatorType());
        }
        if (advancedChartEditIndicatorLaunchMode instanceof AdvancedChartEditIndicatorLaunchMode.Editing) {
            return TechnicalIndicatorConfigAttribute2.toConfigAttributeList(((AdvancedChartEditIndicatorLaunchMode.Editing) advancedChartEditIndicatorLaunchMode).getApiTechnicalIndicator());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ApiTechnicalIndicator.Type getIndicatorType(AdvancedChartEditIndicatorLaunchMode advancedChartEditIndicatorLaunchMode) {
        Intrinsics.checkNotNullParameter(advancedChartEditIndicatorLaunchMode, "<this>");
        if (advancedChartEditIndicatorLaunchMode instanceof AdvancedChartEditIndicatorLaunchMode.Adding) {
            return ((AdvancedChartEditIndicatorLaunchMode.Adding) advancedChartEditIndicatorLaunchMode).getApiTechnicalIndicatorType();
        }
        if (advancedChartEditIndicatorLaunchMode instanceof AdvancedChartEditIndicatorLaunchMode.Editing) {
            return ((AdvancedChartEditIndicatorLaunchMode.Editing) advancedChartEditIndicatorLaunchMode).getApiTechnicalIndicator().getType();
        }
        throw new NoWhenBranchMatchedException();
    }
}

package com.robinhood.android.portfolio.performanceChartSettings;

import com.robinhood.android.models.portfolio.api.PerformanceChartStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;

/* compiled from: ChartStyleSection.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/portfolio/performanceChartSettings/ChartStyleCallbacks;", "", "onShowFaq", "", "onStyleChanged", ResourceTypes.STYLE, "Lcom/robinhood/android/models/portfolio/api/PerformanceChartStyle;", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.performanceChartSettings.ChartStyleCallbacks, reason: use source file name */
/* loaded from: classes11.dex */
public interface ChartStyleSection {
    void onShowFaq();

    void onStyleChanged(PerformanceChartStyle style);
}

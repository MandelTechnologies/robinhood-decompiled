package com.robinhood.android.lib.performancechart;

import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.api.AccountMarketValuesType;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.shared.app.type.AppType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceChartStateProvider.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\t\u00108\u001a\u00020\u000bHÂ\u0003J\t\u00109\u001a\u00020\u000bHÂ\u0003J\t\u0010:\u001a\u00020\u000bHÂ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0016HÂ\u0003J¡\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u0010=\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020)HÖ\u0001J\t\u0010@\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\"R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010\"¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/lib/performancechart/PerformanceChartDataState;", "", "chartType", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "chartModel", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "activeSpan", "", "marketValuesType", "Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "showSettings", "", "chartSettings", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "benchmarksEnabled", "showBenchmarksTooltip", "showFxTooltipButton", "isStale", "isInCryptoRegionGate", "isInEtfRegionGate", "isInMcwRegionGate", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;Lcom/robinhood/android/models/portfolio/PerformanceChartModel;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;ZLcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;ZZZZZZZLcom/robinhood/shared/app/type/AppType;)V", "getChartType", "()Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "getChartModel", "()Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "getActiveSpan", "()Ljava/lang/String;", "getMarketValuesType", "()Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "getShowSettings", "()Z", "getChartSettings", "()Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "getBenchmarksEnabled", "getShowBenchmarksTooltip", "getShowFxTooltipButton", "settingsTooltipTextResId", "", "getSettingsTooltipTextResId", "()I", "showDisplayCurrencyLabel", "getShowDisplayCurrencyLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "lib-performance-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PerformanceChartDataState {
    public static final int $stable = 8;
    private final String activeSpan;
    private final AppType appType;
    private final boolean benchmarksEnabled;
    private final PerformanceChartModel chartModel;
    private final PerformanceChartSettingsV2 chartSettings;
    private final PerformanceChartType chartType;
    private final boolean isInCryptoRegionGate;
    private final boolean isInEtfRegionGate;
    private final boolean isInMcwRegionGate;
    private final boolean isStale;
    private final AccountMarketValuesType marketValuesType;
    private final int settingsTooltipTextResId;
    private final boolean showBenchmarksTooltip;
    private final boolean showFxTooltipButton;
    private final boolean showSettings;

    public PerformanceChartDataState() {
        this(null, null, null, null, false, null, false, false, false, false, false, false, false, null, 16383, null);
    }

    /* renamed from: component11, reason: from getter */
    private final boolean getIsInCryptoRegionGate() {
        return this.isInCryptoRegionGate;
    }

    /* renamed from: component12, reason: from getter */
    private final boolean getIsInEtfRegionGate() {
        return this.isInEtfRegionGate;
    }

    /* renamed from: component13, reason: from getter */
    private final boolean getIsInMcwRegionGate() {
        return this.isInMcwRegionGate;
    }

    /* renamed from: component14, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component1, reason: from getter */
    public final PerformanceChartType getChartType() {
        return this.chartType;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsStale() {
        return this.isStale;
    }

    /* renamed from: component2, reason: from getter */
    public final PerformanceChartModel getChartModel() {
        return this.chartModel;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActiveSpan() {
        return this.activeSpan;
    }

    /* renamed from: component4, reason: from getter */
    public final AccountMarketValuesType getMarketValuesType() {
        return this.marketValuesType;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowSettings() {
        return this.showSettings;
    }

    /* renamed from: component6, reason: from getter */
    public final PerformanceChartSettingsV2 getChartSettings() {
        return this.chartSettings;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getBenchmarksEnabled() {
        return this.benchmarksEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowBenchmarksTooltip() {
        return this.showBenchmarksTooltip;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowFxTooltipButton() {
        return this.showFxTooltipButton;
    }

    public final PerformanceChartDataState copy(PerformanceChartType chartType, PerformanceChartModel chartModel, String activeSpan, AccountMarketValuesType marketValuesType, boolean showSettings, PerformanceChartSettingsV2 chartSettings, boolean benchmarksEnabled, boolean showBenchmarksTooltip, boolean showFxTooltipButton, boolean isStale, boolean isInCryptoRegionGate, boolean isInEtfRegionGate, boolean isInMcwRegionGate, AppType appType) {
        return new PerformanceChartDataState(chartType, chartModel, activeSpan, marketValuesType, showSettings, chartSettings, benchmarksEnabled, showBenchmarksTooltip, showFxTooltipButton, isStale, isInCryptoRegionGate, isInEtfRegionGate, isInMcwRegionGate, appType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerformanceChartDataState)) {
            return false;
        }
        PerformanceChartDataState performanceChartDataState = (PerformanceChartDataState) other;
        return this.chartType == performanceChartDataState.chartType && Intrinsics.areEqual(this.chartModel, performanceChartDataState.chartModel) && Intrinsics.areEqual(this.activeSpan, performanceChartDataState.activeSpan) && this.marketValuesType == performanceChartDataState.marketValuesType && this.showSettings == performanceChartDataState.showSettings && Intrinsics.areEqual(this.chartSettings, performanceChartDataState.chartSettings) && this.benchmarksEnabled == performanceChartDataState.benchmarksEnabled && this.showBenchmarksTooltip == performanceChartDataState.showBenchmarksTooltip && this.showFxTooltipButton == performanceChartDataState.showFxTooltipButton && this.isStale == performanceChartDataState.isStale && this.isInCryptoRegionGate == performanceChartDataState.isInCryptoRegionGate && this.isInEtfRegionGate == performanceChartDataState.isInEtfRegionGate && this.isInMcwRegionGate == performanceChartDataState.isInMcwRegionGate && this.appType == performanceChartDataState.appType;
    }

    public int hashCode() {
        PerformanceChartType performanceChartType = this.chartType;
        int iHashCode = (performanceChartType == null ? 0 : performanceChartType.hashCode()) * 31;
        PerformanceChartModel performanceChartModel = this.chartModel;
        int iHashCode2 = (iHashCode + (performanceChartModel == null ? 0 : performanceChartModel.hashCode())) * 31;
        String str = this.activeSpan;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AccountMarketValuesType accountMarketValuesType = this.marketValuesType;
        int iHashCode4 = (((iHashCode3 + (accountMarketValuesType == null ? 0 : accountMarketValuesType.hashCode())) * 31) + Boolean.hashCode(this.showSettings)) * 31;
        PerformanceChartSettingsV2 performanceChartSettingsV2 = this.chartSettings;
        int iHashCode5 = (((((((((((((((iHashCode4 + (performanceChartSettingsV2 == null ? 0 : performanceChartSettingsV2.hashCode())) * 31) + Boolean.hashCode(this.benchmarksEnabled)) * 31) + Boolean.hashCode(this.showBenchmarksTooltip)) * 31) + Boolean.hashCode(this.showFxTooltipButton)) * 31) + Boolean.hashCode(this.isStale)) * 31) + Boolean.hashCode(this.isInCryptoRegionGate)) * 31) + Boolean.hashCode(this.isInEtfRegionGate)) * 31) + Boolean.hashCode(this.isInMcwRegionGate)) * 31;
        AppType appType = this.appType;
        return iHashCode5 + (appType != null ? appType.hashCode() : 0);
    }

    public String toString() {
        return "PerformanceChartDataState(chartType=" + this.chartType + ", chartModel=" + this.chartModel + ", activeSpan=" + this.activeSpan + ", marketValuesType=" + this.marketValuesType + ", showSettings=" + this.showSettings + ", chartSettings=" + this.chartSettings + ", benchmarksEnabled=" + this.benchmarksEnabled + ", showBenchmarksTooltip=" + this.showBenchmarksTooltip + ", showFxTooltipButton=" + this.showFxTooltipButton + ", isStale=" + this.isStale + ", isInCryptoRegionGate=" + this.isInCryptoRegionGate + ", isInEtfRegionGate=" + this.isInEtfRegionGate + ", isInMcwRegionGate=" + this.isInMcwRegionGate + ", appType=" + this.appType + ")";
    }

    public PerformanceChartDataState(PerformanceChartType performanceChartType, PerformanceChartModel performanceChartModel, String str, AccountMarketValuesType accountMarketValuesType, boolean z, PerformanceChartSettingsV2 performanceChartSettingsV2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, AppType appType) {
        int i;
        this.chartType = performanceChartType;
        this.chartModel = performanceChartModel;
        this.activeSpan = str;
        this.marketValuesType = accountMarketValuesType;
        this.showSettings = z;
        this.chartSettings = performanceChartSettingsV2;
        this.benchmarksEnabled = z2;
        this.showBenchmarksTooltip = z3;
        this.showFxTooltipButton = z4;
        this.isStale = z5;
        this.isInCryptoRegionGate = z6;
        this.isInEtfRegionGate = z7;
        this.isInMcwRegionGate = z8;
        this.appType = appType;
        if (appType == AppType.RHC || appType == AppType.NCW) {
            i = C20506R.string.chart_benchmarks_tooltip_with_crypto;
        } else if (z6 && z7) {
            i = C20506R.string.chart_benchmarks_tooltip_with_stock_etf_crypto;
        } else if (z6) {
            i = C20506R.string.chart_benchmarks_tooltip_with_stock_crypto;
        } else if (z7) {
            i = C20506R.string.chart_benchmarks_tooltip_with_stock_etf;
        } else {
            i = C20506R.string.chart_benchmarks_tooltip_with_stock;
        }
        this.settingsTooltipTextResId = i;
    }

    public /* synthetic */ PerformanceChartDataState(PerformanceChartType performanceChartType, PerformanceChartModel performanceChartModel, String str, AccountMarketValuesType accountMarketValuesType, boolean z, PerformanceChartSettingsV2 performanceChartSettingsV2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, AppType appType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : performanceChartType, (i & 2) != 0 ? null : performanceChartModel, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : accountMarketValuesType, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : performanceChartSettingsV2, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? false : z5, (i & 1024) != 0 ? false : z6, (i & 2048) != 0 ? false : z7, (i & 4096) == 0 ? z8 : false, (i & 8192) != 0 ? null : appType);
    }

    public final PerformanceChartType getChartType() {
        return this.chartType;
    }

    public final PerformanceChartModel getChartModel() {
        return this.chartModel;
    }

    public final String getActiveSpan() {
        return this.activeSpan;
    }

    public final AccountMarketValuesType getMarketValuesType() {
        return this.marketValuesType;
    }

    public final boolean getShowSettings() {
        return this.showSettings;
    }

    public final PerformanceChartSettingsV2 getChartSettings() {
        return this.chartSettings;
    }

    public final boolean getBenchmarksEnabled() {
        return this.benchmarksEnabled;
    }

    public final boolean getShowBenchmarksTooltip() {
        return this.showBenchmarksTooltip;
    }

    public final boolean getShowFxTooltipButton() {
        return this.showFxTooltipButton;
    }

    public final boolean isStale() {
        return this.isStale;
    }

    public final int getSettingsTooltipTextResId() {
        return this.settingsTooltipTextResId;
    }

    public final boolean getShowDisplayCurrencyLabel() {
        return this.isInMcwRegionGate && this.marketValuesType != null;
    }
}

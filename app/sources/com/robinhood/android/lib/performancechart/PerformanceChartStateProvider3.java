package com.robinhood.android.lib.performancechart;

import com.robinhood.android.autoeventlogging.LoggableViewState;
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.models.portfolio.PerformanceChartBenchmarkV2;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.models.portfolio.api.AccountMarketValuesType;
import com.robinhood.android.models.portfolio.api.PerformanceChartStyle;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PerformanceChartStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0005\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState;", "Lcom/robinhood/android/autoeventlogging/LoggableViewState;", "isStale", "", "()Z", "Loading", "Ready", "Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState$Loading;", "Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState$Ready;", "lib-performance-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartViewState, reason: use source file name */
/* loaded from: classes8.dex */
public interface PerformanceChartStateProvider3 extends LoggableViewState {
    boolean isStale();

    /* compiled from: PerformanceChartStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0016J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState$Loading;", "Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState;", "isStale", "", "<init>", "(Z)V", "()Z", "loadedState", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-performance-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartViewState$Loading, reason: from toString */
    public static final /* data */ class Loading implements PerformanceChartStateProvider3 {
        public static final int $stable = 0;
        private final boolean isStale;

        public static /* synthetic */ Loading copy$default(Loading loading, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loading.isStale;
            }
            return loading.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsStale() {
            return this.isStale;
        }

        public final Loading copy(boolean isStale) {
            return new Loading(isStale);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.isStale == ((Loading) other).isStale;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isStale);
        }

        public String toString() {
            return "Loading(isStale=" + this.isStale + ")";
        }

        public Loading(boolean z) {
            this.isStale = z;
        }

        @Override // com.robinhood.android.lib.performancechart.PerformanceChartStateProvider3
        public boolean isStale() {
            return this.isStale;
        }

        @Override // com.robinhood.android.autoeventlogging.LoggableViewState
        public LoggableViewState2 loadedState() {
            if (isStale()) {
                return new LoggableViewState2.Completed("DASHBOARD_CHART", null, 2, null);
            }
            return new LoggableViewState2.Loading("DASHBOARD_CHART");
        }
    }

    /* compiled from: PerformanceChartStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010,\u001a\u00020-H\u0016J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J\t\u00107\u001a\u00020\u0014HÆ\u0003J\t\u00108\u001a\u00020\rHÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003J\u008d\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\rHÆ\u0001J\u0013\u0010;\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\u0014HÖ\u0001J\t\u0010?\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0015\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0014\u0010\u0016\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010$¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState$Ready;", "Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState;", "chartType", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "chartStyle", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartStyle;", "chartModel", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "marketValuesType", "Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "activeSpan", "", "showSettings", "", "activeBenchmarks", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/portfolio/PerformanceChartBenchmarkV2;", "showBenchmarksTooltip", "showFxTooltipButton", "settingsTooltipTextResId", "", "showDisplayCurrencyLabel", "isStale", "<init>", "(Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;Lcom/robinhood/android/models/portfolio/api/PerformanceChartStyle;Lcom/robinhood/android/models/portfolio/PerformanceChartModel;Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;Ljava/lang/String;ZLkotlinx/collections/immutable/ImmutableList;ZZIZZ)V", "getChartType", "()Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "getChartStyle", "()Lcom/robinhood/android/models/portfolio/api/PerformanceChartStyle;", "getChartModel", "()Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "getMarketValuesType", "()Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "getActiveSpan", "()Ljava/lang/String;", "getShowSettings", "()Z", "getActiveBenchmarks", "()Lkotlinx/collections/immutable/ImmutableList;", "getShowBenchmarksTooltip", "getShowFxTooltipButton", "getSettingsTooltipTextResId", "()I", "getShowDisplayCurrencyLabel", "loadedState", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "", "hashCode", "toString", "lib-performance-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartViewState$Ready, reason: from toString */
    public static final /* data */ class Ready implements PerformanceChartStateProvider3 {
        public static final int $stable = 8;
        private final ImmutableList<PerformanceChartBenchmarkV2> activeBenchmarks;
        private final String activeSpan;
        private final PerformanceChartModel chartModel;
        private final PerformanceChartStyle chartStyle;
        private final PerformanceChartType chartType;
        private final boolean isStale;
        private final AccountMarketValuesType marketValuesType;
        private final int settingsTooltipTextResId;
        private final boolean showBenchmarksTooltip;
        private final boolean showDisplayCurrencyLabel;
        private final boolean showFxTooltipButton;
        private final boolean showSettings;

        public static /* synthetic */ Ready copy$default(Ready ready, PerformanceChartType performanceChartType, PerformanceChartStyle performanceChartStyle, PerformanceChartModel performanceChartModel, AccountMarketValuesType accountMarketValuesType, String str, boolean z, ImmutableList immutableList, boolean z2, boolean z3, int i, boolean z4, boolean z5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                performanceChartType = ready.chartType;
            }
            if ((i2 & 2) != 0) {
                performanceChartStyle = ready.chartStyle;
            }
            if ((i2 & 4) != 0) {
                performanceChartModel = ready.chartModel;
            }
            if ((i2 & 8) != 0) {
                accountMarketValuesType = ready.marketValuesType;
            }
            if ((i2 & 16) != 0) {
                str = ready.activeSpan;
            }
            if ((i2 & 32) != 0) {
                z = ready.showSettings;
            }
            if ((i2 & 64) != 0) {
                immutableList = ready.activeBenchmarks;
            }
            if ((i2 & 128) != 0) {
                z2 = ready.showBenchmarksTooltip;
            }
            if ((i2 & 256) != 0) {
                z3 = ready.showFxTooltipButton;
            }
            if ((i2 & 512) != 0) {
                i = ready.settingsTooltipTextResId;
            }
            if ((i2 & 1024) != 0) {
                z4 = ready.showDisplayCurrencyLabel;
            }
            if ((i2 & 2048) != 0) {
                z5 = ready.isStale;
            }
            boolean z6 = z4;
            boolean z7 = z5;
            boolean z8 = z3;
            int i3 = i;
            ImmutableList immutableList2 = immutableList;
            boolean z9 = z2;
            String str2 = str;
            boolean z10 = z;
            return ready.copy(performanceChartType, performanceChartStyle, performanceChartModel, accountMarketValuesType, str2, z10, immutableList2, z9, z8, i3, z6, z7);
        }

        /* renamed from: component1, reason: from getter */
        public final PerformanceChartType getChartType() {
            return this.chartType;
        }

        /* renamed from: component10, reason: from getter */
        public final int getSettingsTooltipTextResId() {
            return this.settingsTooltipTextResId;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getShowDisplayCurrencyLabel() {
            return this.showDisplayCurrencyLabel;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getIsStale() {
            return this.isStale;
        }

        /* renamed from: component2, reason: from getter */
        public final PerformanceChartStyle getChartStyle() {
            return this.chartStyle;
        }

        /* renamed from: component3, reason: from getter */
        public final PerformanceChartModel getChartModel() {
            return this.chartModel;
        }

        /* renamed from: component4, reason: from getter */
        public final AccountMarketValuesType getMarketValuesType() {
            return this.marketValuesType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getActiveSpan() {
            return this.activeSpan;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowSettings() {
            return this.showSettings;
        }

        public final ImmutableList<PerformanceChartBenchmarkV2> component7() {
            return this.activeBenchmarks;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShowBenchmarksTooltip() {
            return this.showBenchmarksTooltip;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getShowFxTooltipButton() {
            return this.showFxTooltipButton;
        }

        public final Ready copy(PerformanceChartType chartType, PerformanceChartStyle chartStyle, PerformanceChartModel chartModel, AccountMarketValuesType marketValuesType, String activeSpan, boolean showSettings, ImmutableList<PerformanceChartBenchmarkV2> activeBenchmarks, boolean showBenchmarksTooltip, boolean showFxTooltipButton, int settingsTooltipTextResId, boolean showDisplayCurrencyLabel, boolean isStale) {
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            Intrinsics.checkNotNullParameter(chartModel, "chartModel");
            Intrinsics.checkNotNullParameter(activeBenchmarks, "activeBenchmarks");
            return new Ready(chartType, chartStyle, chartModel, marketValuesType, activeSpan, showSettings, activeBenchmarks, showBenchmarksTooltip, showFxTooltipButton, settingsTooltipTextResId, showDisplayCurrencyLabel, isStale);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return this.chartType == ready.chartType && this.chartStyle == ready.chartStyle && Intrinsics.areEqual(this.chartModel, ready.chartModel) && this.marketValuesType == ready.marketValuesType && Intrinsics.areEqual(this.activeSpan, ready.activeSpan) && this.showSettings == ready.showSettings && Intrinsics.areEqual(this.activeBenchmarks, ready.activeBenchmarks) && this.showBenchmarksTooltip == ready.showBenchmarksTooltip && this.showFxTooltipButton == ready.showFxTooltipButton && this.settingsTooltipTextResId == ready.settingsTooltipTextResId && this.showDisplayCurrencyLabel == ready.showDisplayCurrencyLabel && this.isStale == ready.isStale;
        }

        public int hashCode() {
            int iHashCode = this.chartType.hashCode() * 31;
            PerformanceChartStyle performanceChartStyle = this.chartStyle;
            int iHashCode2 = (((iHashCode + (performanceChartStyle == null ? 0 : performanceChartStyle.hashCode())) * 31) + this.chartModel.hashCode()) * 31;
            AccountMarketValuesType accountMarketValuesType = this.marketValuesType;
            int iHashCode3 = (iHashCode2 + (accountMarketValuesType == null ? 0 : accountMarketValuesType.hashCode())) * 31;
            String str = this.activeSpan;
            return ((((((((((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.showSettings)) * 31) + this.activeBenchmarks.hashCode()) * 31) + Boolean.hashCode(this.showBenchmarksTooltip)) * 31) + Boolean.hashCode(this.showFxTooltipButton)) * 31) + Integer.hashCode(this.settingsTooltipTextResId)) * 31) + Boolean.hashCode(this.showDisplayCurrencyLabel)) * 31) + Boolean.hashCode(this.isStale);
        }

        public String toString() {
            return "Ready(chartType=" + this.chartType + ", chartStyle=" + this.chartStyle + ", chartModel=" + this.chartModel + ", marketValuesType=" + this.marketValuesType + ", activeSpan=" + this.activeSpan + ", showSettings=" + this.showSettings + ", activeBenchmarks=" + this.activeBenchmarks + ", showBenchmarksTooltip=" + this.showBenchmarksTooltip + ", showFxTooltipButton=" + this.showFxTooltipButton + ", settingsTooltipTextResId=" + this.settingsTooltipTextResId + ", showDisplayCurrencyLabel=" + this.showDisplayCurrencyLabel + ", isStale=" + this.isStale + ")";
        }

        public Ready(PerformanceChartType chartType, PerformanceChartStyle performanceChartStyle, PerformanceChartModel chartModel, AccountMarketValuesType accountMarketValuesType, String str, boolean z, ImmutableList<PerformanceChartBenchmarkV2> activeBenchmarks, boolean z2, boolean z3, int i, boolean z4, boolean z5) {
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            Intrinsics.checkNotNullParameter(chartModel, "chartModel");
            Intrinsics.checkNotNullParameter(activeBenchmarks, "activeBenchmarks");
            this.chartType = chartType;
            this.chartStyle = performanceChartStyle;
            this.chartModel = chartModel;
            this.marketValuesType = accountMarketValuesType;
            this.activeSpan = str;
            this.showSettings = z;
            this.activeBenchmarks = activeBenchmarks;
            this.showBenchmarksTooltip = z2;
            this.showFxTooltipButton = z3;
            this.settingsTooltipTextResId = i;
            this.showDisplayCurrencyLabel = z4;
            this.isStale = z5;
        }

        public final PerformanceChartType getChartType() {
            return this.chartType;
        }

        public final PerformanceChartStyle getChartStyle() {
            return this.chartStyle;
        }

        public final PerformanceChartModel getChartModel() {
            return this.chartModel;
        }

        public final AccountMarketValuesType getMarketValuesType() {
            return this.marketValuesType;
        }

        public final String getActiveSpan() {
            return this.activeSpan;
        }

        public final boolean getShowSettings() {
            return this.showSettings;
        }

        public final ImmutableList<PerformanceChartBenchmarkV2> getActiveBenchmarks() {
            return this.activeBenchmarks;
        }

        public final boolean getShowBenchmarksTooltip() {
            return this.showBenchmarksTooltip;
        }

        public final boolean getShowFxTooltipButton() {
            return this.showFxTooltipButton;
        }

        public final int getSettingsTooltipTextResId() {
            return this.settingsTooltipTextResId;
        }

        public final boolean getShowDisplayCurrencyLabel() {
            return this.showDisplayCurrencyLabel;
        }

        @Override // com.robinhood.android.lib.performancechart.PerformanceChartStateProvider3
        public boolean isStale() {
            return this.isStale;
        }

        @Override // com.robinhood.android.autoeventlogging.LoggableViewState
        public LoggableViewState2 loadedState() {
            return new LoggableViewState2.Completed("DASHBOARD_CHART", null, 2, null);
        }
    }
}

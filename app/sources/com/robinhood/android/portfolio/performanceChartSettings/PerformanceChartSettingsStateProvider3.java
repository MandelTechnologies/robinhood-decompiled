package com.robinhood.android.portfolio.performanceChartSettings;

import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.api.PerformanceChartStyle;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceChartSettingsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsViewState;", "", "Loading", "Ready", "Companion", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsViewState$Loading;", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsViewState$Ready;", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsViewState, reason: use source file name */
/* loaded from: classes11.dex */
public interface PerformanceChartSettingsStateProvider3 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: PerformanceChartSettingsStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsViewState$Loading;", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsViewState$Loading */
    public static final /* data */ class Loading implements PerformanceChartSettingsStateProvider3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1195155718;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: PerformanceChartSettingsStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsViewState$Ready;", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsViewState;", "settings", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "isChartStyleExperimentEnabled", "", "isChartHoursExperimentEnabled", "isChartHoursEnabled", "isBenchmarkingExperimentEnabled", "showBenchmarkFtux", "<init>", "(Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;ZZZZZ)V", "getSettings", "()Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "()Z", "getShowBenchmarkFtux", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsViewState$Ready, reason: from toString */
    public static final /* data */ class Ready implements PerformanceChartSettingsStateProvider3 {
        public static final int $stable = 8;
        private final boolean isBenchmarkingExperimentEnabled;
        private final boolean isChartHoursEnabled;
        private final boolean isChartHoursExperimentEnabled;
        private final boolean isChartStyleExperimentEnabled;
        private final PerformanceChartSettingsV2 settings;
        private final boolean showBenchmarkFtux;

        public static /* synthetic */ Ready copy$default(Ready ready, PerformanceChartSettingsV2 performanceChartSettingsV2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            if ((i & 1) != 0) {
                performanceChartSettingsV2 = ready.settings;
            }
            if ((i & 2) != 0) {
                z = ready.isChartStyleExperimentEnabled;
            }
            if ((i & 4) != 0) {
                z2 = ready.isChartHoursExperimentEnabled;
            }
            if ((i & 8) != 0) {
                z3 = ready.isChartHoursEnabled;
            }
            if ((i & 16) != 0) {
                z4 = ready.isBenchmarkingExperimentEnabled;
            }
            if ((i & 32) != 0) {
                z5 = ready.showBenchmarkFtux;
            }
            boolean z6 = z4;
            boolean z7 = z5;
            return ready.copy(performanceChartSettingsV2, z, z2, z3, z6, z7);
        }

        /* renamed from: component1, reason: from getter */
        public final PerformanceChartSettingsV2 getSettings() {
            return this.settings;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsChartStyleExperimentEnabled() {
            return this.isChartStyleExperimentEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsChartHoursExperimentEnabled() {
            return this.isChartHoursExperimentEnabled;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsChartHoursEnabled() {
            return this.isChartHoursEnabled;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsBenchmarkingExperimentEnabled() {
            return this.isBenchmarkingExperimentEnabled;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowBenchmarkFtux() {
            return this.showBenchmarkFtux;
        }

        public final Ready copy(PerformanceChartSettingsV2 settings, boolean isChartStyleExperimentEnabled, boolean isChartHoursExperimentEnabled, boolean isChartHoursEnabled, boolean isBenchmarkingExperimentEnabled, boolean showBenchmarkFtux) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            return new Ready(settings, isChartStyleExperimentEnabled, isChartHoursExperimentEnabled, isChartHoursEnabled, isBenchmarkingExperimentEnabled, showBenchmarkFtux);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.settings, ready.settings) && this.isChartStyleExperimentEnabled == ready.isChartStyleExperimentEnabled && this.isChartHoursExperimentEnabled == ready.isChartHoursExperimentEnabled && this.isChartHoursEnabled == ready.isChartHoursEnabled && this.isBenchmarkingExperimentEnabled == ready.isBenchmarkingExperimentEnabled && this.showBenchmarkFtux == ready.showBenchmarkFtux;
        }

        public int hashCode() {
            return (((((((((this.settings.hashCode() * 31) + Boolean.hashCode(this.isChartStyleExperimentEnabled)) * 31) + Boolean.hashCode(this.isChartHoursExperimentEnabled)) * 31) + Boolean.hashCode(this.isChartHoursEnabled)) * 31) + Boolean.hashCode(this.isBenchmarkingExperimentEnabled)) * 31) + Boolean.hashCode(this.showBenchmarkFtux);
        }

        public String toString() {
            return "Ready(settings=" + this.settings + ", isChartStyleExperimentEnabled=" + this.isChartStyleExperimentEnabled + ", isChartHoursExperimentEnabled=" + this.isChartHoursExperimentEnabled + ", isChartHoursEnabled=" + this.isChartHoursEnabled + ", isBenchmarkingExperimentEnabled=" + this.isBenchmarkingExperimentEnabled + ", showBenchmarkFtux=" + this.showBenchmarkFtux + ")";
        }

        public Ready(PerformanceChartSettingsV2 settings, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.settings = settings;
            this.isChartStyleExperimentEnabled = z;
            this.isChartHoursExperimentEnabled = z2;
            this.isChartHoursEnabled = z3;
            this.isBenchmarkingExperimentEnabled = z4;
            this.showBenchmarkFtux = z5;
        }

        public final PerformanceChartSettingsV2 getSettings() {
            return this.settings;
        }

        public final boolean isChartStyleExperimentEnabled() {
            return this.isChartStyleExperimentEnabled;
        }

        public final boolean isChartHoursExperimentEnabled() {
            return this.isChartHoursExperimentEnabled;
        }

        public final boolean isChartHoursEnabled() {
            return this.isChartHoursEnabled;
        }

        public final boolean isBenchmarkingExperimentEnabled() {
            return this.isBenchmarkingExperimentEnabled;
        }

        public final boolean getShowBenchmarkFtux() {
            return this.showBenchmarkFtux;
        }
    }

    /* compiled from: PerformanceChartSettingsStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsViewState$Ready;", "getLoadingMock", "()Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsViewState$Ready;", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsViewState$Companion, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Ready loadingMock = new Ready(new PerformanceChartSettingsV2("123", PerformanceChartType.EQUITY, CollectionsKt.emptyList(), PerformanceChartStyle.PERFORMANCE), false, true, true, false, false);

        private Companion() {
        }

        public final Ready getLoadingMock() {
            return loadingMock;
        }
    }
}

package com.robinhood.android.portfolio.performanceChartSettings;

import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceChartSettingsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003JG\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/portfolio/performanceChartSettings/PerformanceChartSettingsDataState;", "", "settings", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "isChartStyleConfigurable", "", "isChartHoursConfigurable", "isChartHoursEnabled", "isBenchmarkingConfigurable", "showBenchmarkFtux", "<init>", "(Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;ZZZZZ)V", "getSettings", "()Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "()Z", "getShowBenchmarkFtux", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PerformanceChartSettingsDataState {
    public static final int $stable = 8;
    private final boolean isBenchmarkingConfigurable;
    private final boolean isChartHoursConfigurable;
    private final boolean isChartHoursEnabled;
    private final boolean isChartStyleConfigurable;
    private final PerformanceChartSettingsV2 settings;
    private final boolean showBenchmarkFtux;

    public PerformanceChartSettingsDataState() {
        this(null, false, false, false, false, false, 63, null);
    }

    public static /* synthetic */ PerformanceChartSettingsDataState copy$default(PerformanceChartSettingsDataState performanceChartSettingsDataState, PerformanceChartSettingsV2 performanceChartSettingsV2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            performanceChartSettingsV2 = performanceChartSettingsDataState.settings;
        }
        if ((i & 2) != 0) {
            z = performanceChartSettingsDataState.isChartStyleConfigurable;
        }
        if ((i & 4) != 0) {
            z2 = performanceChartSettingsDataState.isChartHoursConfigurable;
        }
        if ((i & 8) != 0) {
            z3 = performanceChartSettingsDataState.isChartHoursEnabled;
        }
        if ((i & 16) != 0) {
            z4 = performanceChartSettingsDataState.isBenchmarkingConfigurable;
        }
        if ((i & 32) != 0) {
            z5 = performanceChartSettingsDataState.showBenchmarkFtux;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        return performanceChartSettingsDataState.copy(performanceChartSettingsV2, z, z2, z3, z6, z7);
    }

    /* renamed from: component1, reason: from getter */
    public final PerformanceChartSettingsV2 getSettings() {
        return this.settings;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsChartStyleConfigurable() {
        return this.isChartStyleConfigurable;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsChartHoursConfigurable() {
        return this.isChartHoursConfigurable;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsChartHoursEnabled() {
        return this.isChartHoursEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsBenchmarkingConfigurable() {
        return this.isBenchmarkingConfigurable;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowBenchmarkFtux() {
        return this.showBenchmarkFtux;
    }

    public final PerformanceChartSettingsDataState copy(PerformanceChartSettingsV2 settings, boolean isChartStyleConfigurable, boolean isChartHoursConfigurable, boolean isChartHoursEnabled, boolean isBenchmarkingConfigurable, boolean showBenchmarkFtux) {
        return new PerformanceChartSettingsDataState(settings, isChartStyleConfigurable, isChartHoursConfigurable, isChartHoursEnabled, isBenchmarkingConfigurable, showBenchmarkFtux);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerformanceChartSettingsDataState)) {
            return false;
        }
        PerformanceChartSettingsDataState performanceChartSettingsDataState = (PerformanceChartSettingsDataState) other;
        return Intrinsics.areEqual(this.settings, performanceChartSettingsDataState.settings) && this.isChartStyleConfigurable == performanceChartSettingsDataState.isChartStyleConfigurable && this.isChartHoursConfigurable == performanceChartSettingsDataState.isChartHoursConfigurable && this.isChartHoursEnabled == performanceChartSettingsDataState.isChartHoursEnabled && this.isBenchmarkingConfigurable == performanceChartSettingsDataState.isBenchmarkingConfigurable && this.showBenchmarkFtux == performanceChartSettingsDataState.showBenchmarkFtux;
    }

    public int hashCode() {
        PerformanceChartSettingsV2 performanceChartSettingsV2 = this.settings;
        return ((((((((((performanceChartSettingsV2 == null ? 0 : performanceChartSettingsV2.hashCode()) * 31) + Boolean.hashCode(this.isChartStyleConfigurable)) * 31) + Boolean.hashCode(this.isChartHoursConfigurable)) * 31) + Boolean.hashCode(this.isChartHoursEnabled)) * 31) + Boolean.hashCode(this.isBenchmarkingConfigurable)) * 31) + Boolean.hashCode(this.showBenchmarkFtux);
    }

    public String toString() {
        return "PerformanceChartSettingsDataState(settings=" + this.settings + ", isChartStyleConfigurable=" + this.isChartStyleConfigurable + ", isChartHoursConfigurable=" + this.isChartHoursConfigurable + ", isChartHoursEnabled=" + this.isChartHoursEnabled + ", isBenchmarkingConfigurable=" + this.isBenchmarkingConfigurable + ", showBenchmarkFtux=" + this.showBenchmarkFtux + ")";
    }

    public PerformanceChartSettingsDataState(PerformanceChartSettingsV2 performanceChartSettingsV2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.settings = performanceChartSettingsV2;
        this.isChartStyleConfigurable = z;
        this.isChartHoursConfigurable = z2;
        this.isChartHoursEnabled = z3;
        this.isBenchmarkingConfigurable = z4;
        this.showBenchmarkFtux = z5;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PerformanceChartSettingsDataState(com.robinhood.android.models.portfolio.PerformanceChartSettingsV2 r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = r0
        L15:
            r9 = r8 & 16
            if (r9 == 0) goto L1a
            r6 = r0
        L1a:
            r8 = r8 & 32
            if (r8 == 0) goto L26
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2d
        L26:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2d:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.portfolio.performanceChartSettings.PerformanceChartSettingsDataState.<init>(com.robinhood.android.models.portfolio.PerformanceChartSettingsV2, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final PerformanceChartSettingsV2 getSettings() {
        return this.settings;
    }

    public final boolean isChartStyleConfigurable() {
        return this.isChartStyleConfigurable;
    }

    public final boolean isChartHoursConfigurable() {
        return this.isChartHoursConfigurable;
    }

    public final boolean isChartHoursEnabled() {
        return this.isChartHoursEnabled;
    }

    public final boolean isBenchmarkingConfigurable() {
        return this.isBenchmarkingConfigurable;
    }

    public final boolean getShowBenchmarkFtux() {
        return this.showBenchmarkFtux;
    }
}

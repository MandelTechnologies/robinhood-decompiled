package com.robinhood.android.sdui.chartgroup;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartGroupState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/sdui/chartgroup/AdvancedChartGroupState;", "", "axisConfig", "Lcom/robinhood/android/sdui/chartgroup/AxisConfig;", "scrubConfig", "Lcom/robinhood/android/sdui/chartgroup/ScrubConfig;", "chartBottomDividerType", "Lcom/robinhood/android/sdui/chartgroup/ChartBottomDividerType;", "topIndicatorPadding", "", "useWeightsAsHeight", "", "<init>", "(Lcom/robinhood/android/sdui/chartgroup/AxisConfig;Lcom/robinhood/android/sdui/chartgroup/ScrubConfig;Lcom/robinhood/android/sdui/chartgroup/ChartBottomDividerType;IZ)V", "getAxisConfig", "()Lcom/robinhood/android/sdui/chartgroup/AxisConfig;", "getScrubConfig", "()Lcom/robinhood/android/sdui/chartgroup/ScrubConfig;", "getChartBottomDividerType", "()Lcom/robinhood/android/sdui/chartgroup/ChartBottomDividerType;", "getTopIndicatorPadding", "()I", "getUseWeightsAsHeight", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "lib-sdui-charts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AdvancedChartGroupState {
    public static final int $stable = 8;
    private final AxisConfig axisConfig;
    private final AdvancedChartGroupState5 chartBottomDividerType;
    private final ScrubConfig scrubConfig;
    private final int topIndicatorPadding;
    private final boolean useWeightsAsHeight;

    public AdvancedChartGroupState() {
        this(null, null, null, 0, false, 31, null);
    }

    public static /* synthetic */ AdvancedChartGroupState copy$default(AdvancedChartGroupState advancedChartGroupState, AxisConfig advancedChartGroupState4, ScrubConfig scrubConfig, AdvancedChartGroupState5 advancedChartGroupState5, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            advancedChartGroupState4 = advancedChartGroupState.axisConfig;
        }
        if ((i2 & 2) != 0) {
            scrubConfig = advancedChartGroupState.scrubConfig;
        }
        if ((i2 & 4) != 0) {
            advancedChartGroupState5 = advancedChartGroupState.chartBottomDividerType;
        }
        if ((i2 & 8) != 0) {
            i = advancedChartGroupState.topIndicatorPadding;
        }
        if ((i2 & 16) != 0) {
            z = advancedChartGroupState.useWeightsAsHeight;
        }
        boolean z2 = z;
        AdvancedChartGroupState5 advancedChartGroupState52 = advancedChartGroupState5;
        return advancedChartGroupState.copy(advancedChartGroupState4, scrubConfig, advancedChartGroupState52, i, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final AxisConfig getAxisConfig() {
        return this.axisConfig;
    }

    /* renamed from: component2, reason: from getter */
    public final ScrubConfig getScrubConfig() {
        return this.scrubConfig;
    }

    /* renamed from: component3, reason: from getter */
    public final AdvancedChartGroupState5 getChartBottomDividerType() {
        return this.chartBottomDividerType;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTopIndicatorPadding() {
        return this.topIndicatorPadding;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUseWeightsAsHeight() {
        return this.useWeightsAsHeight;
    }

    public final AdvancedChartGroupState copy(AxisConfig axisConfig, ScrubConfig scrubConfig, AdvancedChartGroupState5 chartBottomDividerType, int topIndicatorPadding, boolean useWeightsAsHeight) {
        Intrinsics.checkNotNullParameter(axisConfig, "axisConfig");
        Intrinsics.checkNotNullParameter(scrubConfig, "scrubConfig");
        Intrinsics.checkNotNullParameter(chartBottomDividerType, "chartBottomDividerType");
        return new AdvancedChartGroupState(axisConfig, scrubConfig, chartBottomDividerType, topIndicatorPadding, useWeightsAsHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedChartGroupState)) {
            return false;
        }
        AdvancedChartGroupState advancedChartGroupState = (AdvancedChartGroupState) other;
        return Intrinsics.areEqual(this.axisConfig, advancedChartGroupState.axisConfig) && Intrinsics.areEqual(this.scrubConfig, advancedChartGroupState.scrubConfig) && this.chartBottomDividerType == advancedChartGroupState.chartBottomDividerType && this.topIndicatorPadding == advancedChartGroupState.topIndicatorPadding && this.useWeightsAsHeight == advancedChartGroupState.useWeightsAsHeight;
    }

    public int hashCode() {
        return (((((((this.axisConfig.hashCode() * 31) + this.scrubConfig.hashCode()) * 31) + this.chartBottomDividerType.hashCode()) * 31) + Integer.hashCode(this.topIndicatorPadding)) * 31) + Boolean.hashCode(this.useWeightsAsHeight);
    }

    public String toString() {
        return "AdvancedChartGroupState(axisConfig=" + this.axisConfig + ", scrubConfig=" + this.scrubConfig + ", chartBottomDividerType=" + this.chartBottomDividerType + ", topIndicatorPadding=" + this.topIndicatorPadding + ", useWeightsAsHeight=" + this.useWeightsAsHeight + ")";
    }

    public AdvancedChartGroupState(AxisConfig axisConfig, ScrubConfig scrubConfig, AdvancedChartGroupState5 chartBottomDividerType, int i, boolean z) {
        Intrinsics.checkNotNullParameter(axisConfig, "axisConfig");
        Intrinsics.checkNotNullParameter(scrubConfig, "scrubConfig");
        Intrinsics.checkNotNullParameter(chartBottomDividerType, "chartBottomDividerType");
        this.axisConfig = axisConfig;
        this.scrubConfig = scrubConfig;
        this.chartBottomDividerType = chartBottomDividerType;
        this.topIndicatorPadding = i;
        this.useWeightsAsHeight = z;
    }

    public /* synthetic */ AdvancedChartGroupState(AxisConfig advancedChartGroupState4, ScrubConfig scrubConfig, AdvancedChartGroupState5 advancedChartGroupState5, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new AxisConfig(0.0f, 0.0f, null, null, false, null, false, null, 255, null) : advancedChartGroupState4, (i2 & 2) != 0 ? new ScrubConfig(false, false, null, false, false, false, false, null, false, 511, null) : scrubConfig, (i2 & 4) != 0 ? AdvancedChartGroupState5.DEFAULT : advancedChartGroupState5, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z);
    }

    public final AxisConfig getAxisConfig() {
        return this.axisConfig;
    }

    public final ScrubConfig getScrubConfig() {
        return this.scrubConfig;
    }

    public final AdvancedChartGroupState5 getChartBottomDividerType() {
        return this.chartBottomDividerType;
    }

    public final int getTopIndicatorPadding() {
        return this.topIndicatorPadding;
    }

    public final boolean getUseWeightsAsHeight() {
        return this.useWeightsAsHeight;
    }
}

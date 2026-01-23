package com.robinhood.android.sdui.chartgroup;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartGroupState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JM\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/sdui/chartgroup/ProtoAdvancedChartGroupState;", "", "axisConfig", "Lcom/robinhood/android/sdui/chartgroup/ProtoAxisConfig;", "scrubConfig", "Lcom/robinhood/android/sdui/chartgroup/ScrubConfig;", "chartBottomDividerType", "Lcom/robinhood/android/sdui/chartgroup/ChartBottomDividerType;", "topIndicatorPadding", "", "useWeightsAsHeight", "", "lineRevealAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "<init>", "(Lcom/robinhood/android/sdui/chartgroup/ProtoAxisConfig;Lcom/robinhood/android/sdui/chartgroup/ScrubConfig;Lcom/robinhood/android/sdui/chartgroup/ChartBottomDividerType;IZLandroidx/compose/animation/core/AnimationSpec;)V", "getAxisConfig", "()Lcom/robinhood/android/sdui/chartgroup/ProtoAxisConfig;", "getScrubConfig", "()Lcom/robinhood/android/sdui/chartgroup/ScrubConfig;", "getChartBottomDividerType", "()Lcom/robinhood/android/sdui/chartgroup/ChartBottomDividerType;", "getTopIndicatorPadding", "()I", "getUseWeightsAsHeight", "()Z", "getLineRevealAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "lib-sdui-charts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ProtoAdvancedChartGroupState {
    public static final int $stable = 8;
    private final ProtoAxisConfig axisConfig;
    private final AdvancedChartGroupState5 chartBottomDividerType;
    private final AnimationSpec<Float> lineRevealAnimationSpec;
    private final ScrubConfig scrubConfig;
    private final int topIndicatorPadding;
    private final boolean useWeightsAsHeight;

    public ProtoAdvancedChartGroupState() {
        this(null, null, null, 0, false, null, 63, null);
    }

    public static /* synthetic */ ProtoAdvancedChartGroupState copy$default(ProtoAdvancedChartGroupState protoAdvancedChartGroupState, ProtoAxisConfig advancedChartGroupState7, ScrubConfig scrubConfig, AdvancedChartGroupState5 advancedChartGroupState5, int i, boolean z, AnimationSpec animationSpec, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            advancedChartGroupState7 = protoAdvancedChartGroupState.axisConfig;
        }
        if ((i2 & 2) != 0) {
            scrubConfig = protoAdvancedChartGroupState.scrubConfig;
        }
        if ((i2 & 4) != 0) {
            advancedChartGroupState5 = protoAdvancedChartGroupState.chartBottomDividerType;
        }
        if ((i2 & 8) != 0) {
            i = protoAdvancedChartGroupState.topIndicatorPadding;
        }
        if ((i2 & 16) != 0) {
            z = protoAdvancedChartGroupState.useWeightsAsHeight;
        }
        if ((i2 & 32) != 0) {
            animationSpec = protoAdvancedChartGroupState.lineRevealAnimationSpec;
        }
        boolean z2 = z;
        AnimationSpec animationSpec2 = animationSpec;
        return protoAdvancedChartGroupState.copy(advancedChartGroupState7, scrubConfig, advancedChartGroupState5, i, z2, animationSpec2);
    }

    /* renamed from: component1, reason: from getter */
    public final ProtoAxisConfig getAxisConfig() {
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

    public final AnimationSpec<Float> component6() {
        return this.lineRevealAnimationSpec;
    }

    public final ProtoAdvancedChartGroupState copy(ProtoAxisConfig axisConfig, ScrubConfig scrubConfig, AdvancedChartGroupState5 chartBottomDividerType, int topIndicatorPadding, boolean useWeightsAsHeight, AnimationSpec<Float> lineRevealAnimationSpec) {
        Intrinsics.checkNotNullParameter(axisConfig, "axisConfig");
        Intrinsics.checkNotNullParameter(scrubConfig, "scrubConfig");
        Intrinsics.checkNotNullParameter(chartBottomDividerType, "chartBottomDividerType");
        return new ProtoAdvancedChartGroupState(axisConfig, scrubConfig, chartBottomDividerType, topIndicatorPadding, useWeightsAsHeight, lineRevealAnimationSpec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtoAdvancedChartGroupState)) {
            return false;
        }
        ProtoAdvancedChartGroupState protoAdvancedChartGroupState = (ProtoAdvancedChartGroupState) other;
        return Intrinsics.areEqual(this.axisConfig, protoAdvancedChartGroupState.axisConfig) && Intrinsics.areEqual(this.scrubConfig, protoAdvancedChartGroupState.scrubConfig) && this.chartBottomDividerType == protoAdvancedChartGroupState.chartBottomDividerType && this.topIndicatorPadding == protoAdvancedChartGroupState.topIndicatorPadding && this.useWeightsAsHeight == protoAdvancedChartGroupState.useWeightsAsHeight && Intrinsics.areEqual(this.lineRevealAnimationSpec, protoAdvancedChartGroupState.lineRevealAnimationSpec);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.axisConfig.hashCode() * 31) + this.scrubConfig.hashCode()) * 31) + this.chartBottomDividerType.hashCode()) * 31) + Integer.hashCode(this.topIndicatorPadding)) * 31) + Boolean.hashCode(this.useWeightsAsHeight)) * 31;
        AnimationSpec<Float> animationSpec = this.lineRevealAnimationSpec;
        return iHashCode + (animationSpec == null ? 0 : animationSpec.hashCode());
    }

    public String toString() {
        return "ProtoAdvancedChartGroupState(axisConfig=" + this.axisConfig + ", scrubConfig=" + this.scrubConfig + ", chartBottomDividerType=" + this.chartBottomDividerType + ", topIndicatorPadding=" + this.topIndicatorPadding + ", useWeightsAsHeight=" + this.useWeightsAsHeight + ", lineRevealAnimationSpec=" + this.lineRevealAnimationSpec + ")";
    }

    public ProtoAdvancedChartGroupState(ProtoAxisConfig axisConfig, ScrubConfig scrubConfig, AdvancedChartGroupState5 chartBottomDividerType, int i, boolean z, AnimationSpec<Float> animationSpec) {
        Intrinsics.checkNotNullParameter(axisConfig, "axisConfig");
        Intrinsics.checkNotNullParameter(scrubConfig, "scrubConfig");
        Intrinsics.checkNotNullParameter(chartBottomDividerType, "chartBottomDividerType");
        this.axisConfig = axisConfig;
        this.scrubConfig = scrubConfig;
        this.chartBottomDividerType = chartBottomDividerType;
        this.topIndicatorPadding = i;
        this.useWeightsAsHeight = z;
        this.lineRevealAnimationSpec = animationSpec;
    }

    public /* synthetic */ ProtoAdvancedChartGroupState(ProtoAxisConfig advancedChartGroupState7, ScrubConfig scrubConfig, AdvancedChartGroupState5 advancedChartGroupState5, int i, boolean z, AnimationSpec animationSpec, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ProtoAxisConfig(0.0f, 0.0f, null, null, null, null, false, null, null, false, null, 2047, null) : advancedChartGroupState7, (i2 & 2) != 0 ? new ScrubConfig(false, false, null, false, false, false, false, null, false, 511, null) : scrubConfig, (i2 & 4) != 0 ? AdvancedChartGroupState5.DEFAULT : advancedChartGroupState5, (i2 & 8) != 0 ? 0 : i, (i2 & 16) == 0 ? z : false, (i2 & 32) != 0 ? null : animationSpec);
    }

    public final ProtoAxisConfig getAxisConfig() {
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

    public final AnimationSpec<Float> getLineRevealAnimationSpec() {
        return this.lineRevealAnimationSpec;
    }
}

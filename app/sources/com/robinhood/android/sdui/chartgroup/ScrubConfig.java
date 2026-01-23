package com.robinhood.android.sdui.chartgroup;

import androidx.compose.p011ui.graphics.PathEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AdvancedChartGroupState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/sdui/chartgroup/ScrubConfig;", "", "xLineEnabled", "", "yLineEnabled", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "xLabelEnabled", "yLabelEnabled", "legendsEnabled", "clearOnScrubStop", "xAxisSnapPoints", "Lkotlinx/collections/immutable/ImmutableList;", "", "hapticFeedbackEnabled", "<init>", "(ZZLandroidx/compose/ui/graphics/PathEffect;ZZZZLkotlinx/collections/immutable/ImmutableList;Z)V", "getXLineEnabled", "()Z", "getYLineEnabled", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "getXLabelEnabled", "getYLabelEnabled", "getLegendsEnabled", "getClearOnScrubStop", "getXAxisSnapPoints", "()Lkotlinx/collections/immutable/ImmutableList;", "getHapticFeedbackEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-sdui-charts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ScrubConfig {
    public static final int $stable = 8;
    private final boolean clearOnScrubStop;
    private final boolean hapticFeedbackEnabled;
    private final boolean legendsEnabled;
    private final PathEffect pathEffect;
    private final ImmutableList<Float> xAxisSnapPoints;
    private final boolean xLabelEnabled;
    private final boolean xLineEnabled;
    private final boolean yLabelEnabled;
    private final boolean yLineEnabled;

    public ScrubConfig() {
        this(false, false, null, false, false, false, false, null, false, 511, null);
    }

    public static /* synthetic */ ScrubConfig copy$default(ScrubConfig scrubConfig, boolean z, boolean z2, PathEffect pathEffect, boolean z3, boolean z4, boolean z5, boolean z6, ImmutableList immutableList, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            z = scrubConfig.xLineEnabled;
        }
        if ((i & 2) != 0) {
            z2 = scrubConfig.yLineEnabled;
        }
        if ((i & 4) != 0) {
            pathEffect = scrubConfig.pathEffect;
        }
        if ((i & 8) != 0) {
            z3 = scrubConfig.xLabelEnabled;
        }
        if ((i & 16) != 0) {
            z4 = scrubConfig.yLabelEnabled;
        }
        if ((i & 32) != 0) {
            z5 = scrubConfig.legendsEnabled;
        }
        if ((i & 64) != 0) {
            z6 = scrubConfig.clearOnScrubStop;
        }
        if ((i & 128) != 0) {
            immutableList = scrubConfig.xAxisSnapPoints;
        }
        if ((i & 256) != 0) {
            z7 = scrubConfig.hapticFeedbackEnabled;
        }
        ImmutableList immutableList2 = immutableList;
        boolean z8 = z7;
        boolean z9 = z5;
        boolean z10 = z6;
        boolean z11 = z4;
        PathEffect pathEffect2 = pathEffect;
        return scrubConfig.copy(z, z2, pathEffect2, z3, z11, z9, z10, immutableList2, z8);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getXLineEnabled() {
        return this.xLineEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getYLineEnabled() {
        return this.yLineEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getXLabelEnabled() {
        return this.xLabelEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getYLabelEnabled() {
        return this.yLabelEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getLegendsEnabled() {
        return this.legendsEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getClearOnScrubStop() {
        return this.clearOnScrubStop;
    }

    public final ImmutableList<Float> component8() {
        return this.xAxisSnapPoints;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHapticFeedbackEnabled() {
        return this.hapticFeedbackEnabled;
    }

    public final ScrubConfig copy(boolean xLineEnabled, boolean yLineEnabled, PathEffect pathEffect, boolean xLabelEnabled, boolean yLabelEnabled, boolean legendsEnabled, boolean clearOnScrubStop, ImmutableList<Float> xAxisSnapPoints, boolean hapticFeedbackEnabled) {
        return new ScrubConfig(xLineEnabled, yLineEnabled, pathEffect, xLabelEnabled, yLabelEnabled, legendsEnabled, clearOnScrubStop, xAxisSnapPoints, hapticFeedbackEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrubConfig)) {
            return false;
        }
        ScrubConfig scrubConfig = (ScrubConfig) other;
        return this.xLineEnabled == scrubConfig.xLineEnabled && this.yLineEnabled == scrubConfig.yLineEnabled && Intrinsics.areEqual(this.pathEffect, scrubConfig.pathEffect) && this.xLabelEnabled == scrubConfig.xLabelEnabled && this.yLabelEnabled == scrubConfig.yLabelEnabled && this.legendsEnabled == scrubConfig.legendsEnabled && this.clearOnScrubStop == scrubConfig.clearOnScrubStop && Intrinsics.areEqual(this.xAxisSnapPoints, scrubConfig.xAxisSnapPoints) && this.hapticFeedbackEnabled == scrubConfig.hapticFeedbackEnabled;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.xLineEnabled) * 31) + Boolean.hashCode(this.yLineEnabled)) * 31;
        PathEffect pathEffect = this.pathEffect;
        int iHashCode2 = (((((((((iHashCode + (pathEffect == null ? 0 : pathEffect.hashCode())) * 31) + Boolean.hashCode(this.xLabelEnabled)) * 31) + Boolean.hashCode(this.yLabelEnabled)) * 31) + Boolean.hashCode(this.legendsEnabled)) * 31) + Boolean.hashCode(this.clearOnScrubStop)) * 31;
        ImmutableList<Float> immutableList = this.xAxisSnapPoints;
        return ((iHashCode2 + (immutableList != null ? immutableList.hashCode() : 0)) * 31) + Boolean.hashCode(this.hapticFeedbackEnabled);
    }

    public String toString() {
        return "ScrubConfig(xLineEnabled=" + this.xLineEnabled + ", yLineEnabled=" + this.yLineEnabled + ", pathEffect=" + this.pathEffect + ", xLabelEnabled=" + this.xLabelEnabled + ", yLabelEnabled=" + this.yLabelEnabled + ", legendsEnabled=" + this.legendsEnabled + ", clearOnScrubStop=" + this.clearOnScrubStop + ", xAxisSnapPoints=" + this.xAxisSnapPoints + ", hapticFeedbackEnabled=" + this.hapticFeedbackEnabled + ")";
    }

    public ScrubConfig(boolean z, boolean z2, PathEffect pathEffect, boolean z3, boolean z4, boolean z5, boolean z6, ImmutableList<Float> immutableList, boolean z7) {
        this.xLineEnabled = z;
        this.yLineEnabled = z2;
        this.pathEffect = pathEffect;
        this.xLabelEnabled = z3;
        this.yLabelEnabled = z4;
        this.legendsEnabled = z5;
        this.clearOnScrubStop = z6;
        this.xAxisSnapPoints = immutableList;
        this.hapticFeedbackEnabled = z7;
    }

    public final boolean getXLineEnabled() {
        return this.xLineEnabled;
    }

    public final boolean getYLineEnabled() {
        return this.yLineEnabled;
    }

    public /* synthetic */ ScrubConfig(boolean z, boolean z2, PathEffect pathEffect, boolean z3, boolean z4, boolean z5, boolean z6, ImmutableList immutableList, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? PathEffect.INSTANCE.dashPathEffect(new float[]{10.0f, 15.0f}, 0.0f) : pathEffect, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4, (i & 32) != 0 ? true : z5, (i & 64) != 0 ? false : z6, (i & 128) != 0 ? null : immutableList, (i & 256) != 0 ? true : z7);
    }

    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public final boolean getXLabelEnabled() {
        return this.xLabelEnabled;
    }

    public final boolean getYLabelEnabled() {
        return this.yLabelEnabled;
    }

    public final boolean getLegendsEnabled() {
        return this.legendsEnabled;
    }

    public final boolean getClearOnScrubStop() {
        return this.clearOnScrubStop;
    }

    public final ImmutableList<Float> getXAxisSnapPoints() {
        return this.xAxisSnapPoints;
    }

    public final boolean getHapticFeedbackEnabled() {
        return this.hapticFeedbackEnabled;
    }
}

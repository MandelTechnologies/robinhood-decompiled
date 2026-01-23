package com.robinhood.android.charts.model;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.models.serverdriven.experimental.api.GradientStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: Fill.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\rJ\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/charts/model/GradientChartFillStyle;", "", "startColor", "Landroidx/compose/ui/graphics/Color;", "endColor", "gradientStyle", "Lcom/robinhood/models/serverdriven/experimental/api/GradientStyle;", "colorStops", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/model/GradientChartFillStyle$ColorStop;", "<init>", "(JJLcom/robinhood/models/serverdriven/experimental/api/GradientStyle;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getStartColor-0d7_KjU", "()J", "J", "getEndColor-0d7_KjU", "getGradientStyle", "()Lcom/robinhood/models/serverdriven/experimental/api/GradientStyle;", "getColorStops", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component4", "copy", "copy-RFnl5yQ", "(JJLcom/robinhood/models/serverdriven/experimental/api/GradientStyle;Lkotlinx/collections/immutable/ImmutableList;)Lcom/robinhood/android/charts/model/GradientChartFillStyle;", "equals", "", "other", "hashCode", "", "toString", "", "ColorStop", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GradientChartFillStyle {
    public static final int $stable = 0;
    private final ImmutableList<ColorStop> colorStops;
    private final long endColor;
    private final GradientStyle gradientStyle;
    private final long startColor;

    public /* synthetic */ GradientChartFillStyle(long j, long j2, GradientStyle gradientStyle, ImmutableList immutableList, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, gradientStyle, immutableList);
    }

    /* renamed from: copy-RFnl5yQ$default, reason: not valid java name */
    public static /* synthetic */ GradientChartFillStyle m12050copyRFnl5yQ$default(GradientChartFillStyle gradientChartFillStyle, long j, long j2, GradientStyle gradientStyle, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            j = gradientChartFillStyle.startColor;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = gradientChartFillStyle.endColor;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            gradientStyle = gradientChartFillStyle.gradientStyle;
        }
        GradientStyle gradientStyle2 = gradientStyle;
        if ((i & 8) != 0) {
            immutableList = gradientChartFillStyle.colorStops;
        }
        return gradientChartFillStyle.m12053copyRFnl5yQ(j3, j4, gradientStyle2, immutableList);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getStartColor() {
        return this.startColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getEndColor() {
        return this.endColor;
    }

    /* renamed from: component3, reason: from getter */
    public final GradientStyle getGradientStyle() {
        return this.gradientStyle;
    }

    public final ImmutableList<ColorStop> component4() {
        return this.colorStops;
    }

    /* renamed from: copy-RFnl5yQ, reason: not valid java name */
    public final GradientChartFillStyle m12053copyRFnl5yQ(long startColor, long endColor, GradientStyle gradientStyle, ImmutableList<ColorStop> colorStops) {
        Intrinsics.checkNotNullParameter(gradientStyle, "gradientStyle");
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        return new GradientChartFillStyle(startColor, endColor, gradientStyle, colorStops, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientChartFillStyle)) {
            return false;
        }
        GradientChartFillStyle gradientChartFillStyle = (GradientChartFillStyle) other;
        return Color.m6707equalsimpl0(this.startColor, gradientChartFillStyle.startColor) && Color.m6707equalsimpl0(this.endColor, gradientChartFillStyle.endColor) && this.gradientStyle == gradientChartFillStyle.gradientStyle && Intrinsics.areEqual(this.colorStops, gradientChartFillStyle.colorStops);
    }

    public int hashCode() {
        return (((((Color.m6713hashCodeimpl(this.startColor) * 31) + Color.m6713hashCodeimpl(this.endColor)) * 31) + this.gradientStyle.hashCode()) * 31) + this.colorStops.hashCode();
    }

    public String toString() {
        return "GradientChartFillStyle(startColor=" + Color.m6714toStringimpl(this.startColor) + ", endColor=" + Color.m6714toStringimpl(this.endColor) + ", gradientStyle=" + this.gradientStyle + ", colorStops=" + this.colorStops + ")";
    }

    private GradientChartFillStyle(long j, long j2, GradientStyle gradientStyle, ImmutableList<ColorStop> colorStops) {
        Intrinsics.checkNotNullParameter(gradientStyle, "gradientStyle");
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        this.startColor = j;
        this.endColor = j2;
        this.gradientStyle = gradientStyle;
        this.colorStops = colorStops;
    }

    /* renamed from: getStartColor-0d7_KjU, reason: not valid java name */
    public final long m12055getStartColor0d7_KjU() {
        return this.startColor;
    }

    /* renamed from: getEndColor-0d7_KjU, reason: not valid java name */
    public final long m12054getEndColor0d7_KjU() {
        return this.endColor;
    }

    public final GradientStyle getGradientStyle() {
        return this.gradientStyle;
    }

    public final ImmutableList<ColorStop> getColorStops() {
        return this.colorStops;
    }

    /* compiled from: Fill.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/charts/model/GradientChartFillStyle$ColorStop;", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "stop", "", "<init>", "(JFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getStop", "()F", "component1", "component1-0d7_KjU", "component2", "copy", "copy-DxMtmZc", "(JF)Lcom/robinhood/android/charts/model/GradientChartFillStyle$ColorStop;", "equals", "", "other", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ColorStop {
        public static final int $stable = 0;
        private final long color;
        private final float stop;

        public /* synthetic */ ColorStop(long j, float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, f);
        }

        /* renamed from: copy-DxMtmZc$default, reason: not valid java name */
        public static /* synthetic */ ColorStop m12056copyDxMtmZc$default(ColorStop colorStop, long j, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                j = colorStop.color;
            }
            if ((i & 2) != 0) {
                f = colorStop.stop;
            }
            return colorStop.m12058copyDxMtmZc(j, f);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final float getStop() {
            return this.stop;
        }

        /* renamed from: copy-DxMtmZc, reason: not valid java name */
        public final ColorStop m12058copyDxMtmZc(long color, float stop) {
            return new ColorStop(color, stop, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ColorStop)) {
                return false;
            }
            ColorStop colorStop = (ColorStop) other;
            return Color.m6707equalsimpl0(this.color, colorStop.color) && Float.compare(this.stop, colorStop.stop) == 0;
        }

        public int hashCode() {
            return (Color.m6713hashCodeimpl(this.color) * 31) + Float.hashCode(this.stop);
        }

        public String toString() {
            return "ColorStop(color=" + Color.m6714toStringimpl(this.color) + ", stop=" + this.stop + ")";
        }

        private ColorStop(long j, float f) {
            this.color = j;
            this.stop = f;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m12059getColor0d7_KjU() {
            return this.color;
        }

        public final float getStop() {
            return this.stop;
        }
    }
}

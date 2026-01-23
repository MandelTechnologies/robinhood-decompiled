package com.robinhood.android.charts.segmented;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.charts.Interactions;
import com.robinhood.android.charts.Interactions2;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Dot;
import com.robinhood.android.charts.model.Line;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.shared.compose.color.LinearGradientColor;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

/* compiled from: SegmentedLine.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u001d\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012H'¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cR\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\f\u0082\u0001\u0002!\"¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/charts/segmented/SegmentedLine;", "", "<init>", "()V", "drawLayer", "", "getDrawLayer", "()Ljava/lang/Float;", "segments", "", "Lcom/robinhood/android/charts/segmented/SegmentedLine$Segment;", "getSegments", "()Ljava/util/List;", "toChartAnnotations", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "scrubPoint", "Lcom/robinhood/android/charts/model/Point;", "lineRevealAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Lcom/robinhood/android/charts/model/Point;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "connectedSegments", "getConnectedSegments$lib_charts_externalDebug", "allPoints", "getAllPoints$lib_charts_externalDebug", "allSegmentsShareStyle", "", "interactionState", "Lcom/robinhood/android/charts/InteractionState;", "allSegmentsShareStyle$lib_charts_externalDebug", "Style", "Segment", "Default", "Dotted", "Lcom/robinhood/android/charts/segmented/SegmentedLine$Default;", "Lcom/robinhood/android/charts/segmented/SegmentedLine$Dotted;", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class SegmentedLine {
    public static final int $stable = 0;

    public /* synthetic */ SegmentedLine(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Float getDrawLayer();

    public abstract List<Segment> getSegments();

    public abstract List<ChartAnnotation> toChartAnnotations(Point point, AnimationSpec<Float> animationSpec, Composer composer, int i);

    private SegmentedLine() {
    }

    /* compiled from: SegmentedLine.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\r\u000eJ\r\u0010\n\u001a\u00020\u000bH'¢\u0006\u0002\u0010\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/charts/segmented/SegmentedLine$Style;", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "gradientColor", "Lcom/robinhood/shared/compose/color/LinearGradientColor;", "getGradientColor", "()Lcom/robinhood/shared/compose/color/LinearGradientColor;", "getDrawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "Dotted", "Solid", "Lcom/robinhood/android/charts/segmented/SegmentedLine$Style$Dotted;", "Lcom/robinhood/android/charts/segmented/SegmentedLine$Style$Solid;", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Style {

        /* compiled from: SegmentedLine.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static LinearGradientColor getGradientColor(Style style) {
                return null;
            }
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        long mo12118getColor0d7_KjU();

        DrawScope2 getDrawStyle(Composer composer, int i);

        LinearGradientColor getGradientColor();

        /* compiled from: SegmentedLine.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\r\u001a\u00020\u000eH\u0017¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\tJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/charts/segmented/SegmentedLine$Style$Dotted;", "Lcom/robinhood/android/charts/segmented/SegmentedLine$Style;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "dashGap", "", "<init>", "(JFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getDashGap", "()F", "getDrawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "component1", "component1-0d7_KjU", "component2", "copy", "copy-DxMtmZc", "(JF)Lcom/robinhood/android/charts/segmented/SegmentedLine$Style$Dotted;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Dotted implements Style {
            public static final int $stable = 0;
            private final long color;
            private final float dashGap;

            public /* synthetic */ Dotted(long j, float f, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, f);
            }

            /* renamed from: copy-DxMtmZc$default, reason: not valid java name */
            public static /* synthetic */ Dotted m12119copyDxMtmZc$default(Dotted dotted, long j, float f, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = dotted.color;
                }
                if ((i & 2) != 0) {
                    f = dotted.dashGap;
                }
                return dotted.m12121copyDxMtmZc(j, f);
            }

            /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
            public final long getColor() {
                return this.color;
            }

            /* renamed from: component2, reason: from getter */
            public final float getDashGap() {
                return this.dashGap;
            }

            /* renamed from: copy-DxMtmZc, reason: not valid java name */
            public final Dotted m12121copyDxMtmZc(long color, float dashGap) {
                return new Dotted(color, dashGap, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dotted)) {
                    return false;
                }
                Dotted dotted = (Dotted) other;
                return Color.m6707equalsimpl0(this.color, dotted.color) && Float.compare(this.dashGap, dotted.dashGap) == 0;
            }

            public int hashCode() {
                return (Color.m6713hashCodeimpl(this.color) * 31) + Float.hashCode(this.dashGap);
            }

            public String toString() {
                return "Dotted(color=" + Color.m6714toStringimpl(this.color) + ", dashGap=" + this.dashGap + ")";
            }

            private Dotted(long j, float f) {
                this.color = j;
                this.dashGap = f;
            }

            @Override // com.robinhood.android.charts.segmented.SegmentedLine.Style
            public LinearGradientColor getGradientColor() {
                return DefaultImpls.getGradientColor(this);
            }

            @Override // com.robinhood.android.charts.segmented.SegmentedLine.Style
            /* renamed from: getColor-0d7_KjU */
            public long mo12118getColor0d7_KjU() {
                return this.color;
            }

            public final float getDashGap() {
                return this.dashGap;
            }

            @Override // com.robinhood.android.charts.segmented.SegmentedLine.Style
            public DrawScope2 getDrawStyle(Composer composer, int i) {
                composer.startReplaceGroup(1723832890);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1723832890, i, -1, "com.robinhood.android.charts.segmented.SegmentedLine.Style.Dotted.getDrawStyle (SegmentedLine.kt:49)");
                }
                Stroke strokeM12135defaultDottedDrawStylekHDZbjc = UtilKt.m12135defaultDottedDrawStylekHDZbjc(0.0f, composer, 0, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return strokeM12135defaultDottedDrawStylekHDZbjc;
            }
        }

        /* compiled from: SegmentedLine.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0017\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\rJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0012J\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010\u0015J:\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/charts/segmented/SegmentedLine$Style$Solid;", "Lcom/robinhood/android/charts/segmented/SegmentedLine$Style;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "gradientColor", "Lcom/robinhood/shared/compose/color/LinearGradientColor;", "width", "Landroidx/compose/ui/unit/Dp;", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "<init>", "(JLcom/robinhood/shared/compose/color/LinearGradientColor;FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getGradientColor", "()Lcom/robinhood/shared/compose/color/LinearGradientColor;", "getWidth-D9Ej5fM", "()F", "F", "getCap-KaPHkGw", "()I", "I", "getDrawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "component1", "component1-0d7_KjU", "component2", "component3", "component3-D9Ej5fM", "component4", "component4-KaPHkGw", "copy", "copy-H0ABY7g", "(JLcom/robinhood/shared/compose/color/LinearGradientColor;FI)Lcom/robinhood/android/charts/segmented/SegmentedLine$Style$Solid;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Solid implements Style {
            public static final int $stable = LinearGradientColor.$stable;
            private final int cap;
            private final long color;
            private final LinearGradientColor gradientColor;
            private final float width;

            public /* synthetic */ Solid(long j, LinearGradientColor linearGradientColor, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, linearGradientColor, f, i);
            }

            /* renamed from: copy-H0ABY7g$default, reason: not valid java name */
            public static /* synthetic */ Solid m12122copyH0ABY7g$default(Solid solid, long j, LinearGradientColor linearGradientColor, float f, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    j = solid.color;
                }
                long j2 = j;
                if ((i2 & 2) != 0) {
                    linearGradientColor = solid.gradientColor;
                }
                LinearGradientColor linearGradientColor2 = linearGradientColor;
                if ((i2 & 4) != 0) {
                    f = solid.width;
                }
                float f2 = f;
                if ((i2 & 8) != 0) {
                    i = solid.cap;
                }
                return solid.m12126copyH0ABY7g(j2, linearGradientColor2, f2, i);
            }

            /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
            public final long getColor() {
                return this.color;
            }

            /* renamed from: component2, reason: from getter */
            public final LinearGradientColor getGradientColor() {
                return this.gradientColor;
            }

            /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
            public final float getWidth() {
                return this.width;
            }

            /* renamed from: component4-KaPHkGw, reason: not valid java name and from getter */
            public final int getCap() {
                return this.cap;
            }

            /* renamed from: copy-H0ABY7g, reason: not valid java name */
            public final Solid m12126copyH0ABY7g(long color, LinearGradientColor gradientColor, float width, int cap) {
                return new Solid(color, gradientColor, width, cap, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Solid)) {
                    return false;
                }
                Solid solid = (Solid) other;
                return Color.m6707equalsimpl0(this.color, solid.color) && Intrinsics.areEqual(this.gradientColor, solid.gradientColor) && C2002Dp.m7997equalsimpl0(this.width, solid.width) && StrokeCap.m6845equalsimpl0(this.cap, solid.cap);
            }

            public int hashCode() {
                int iM6713hashCodeimpl = Color.m6713hashCodeimpl(this.color) * 31;
                LinearGradientColor linearGradientColor = this.gradientColor;
                return ((((iM6713hashCodeimpl + (linearGradientColor == null ? 0 : linearGradientColor.hashCode())) * 31) + C2002Dp.m7998hashCodeimpl(this.width)) * 31) + StrokeCap.m6846hashCodeimpl(this.cap);
            }

            public String toString() {
                return "Solid(color=" + Color.m6714toStringimpl(this.color) + ", gradientColor=" + this.gradientColor + ", width=" + C2002Dp.m7999toStringimpl(this.width) + ", cap=" + StrokeCap.m6847toStringimpl(this.cap) + ")";
            }

            private Solid(long j, LinearGradientColor linearGradientColor, float f, int i) {
                this.color = j;
                this.gradientColor = linearGradientColor;
                this.width = f;
                this.cap = i;
            }

            public /* synthetic */ Solid(long j, LinearGradientColor linearGradientColor, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i2 & 2) != 0 ? null : linearGradientColor, f, i, null);
            }

            @Override // com.robinhood.android.charts.segmented.SegmentedLine.Style
            /* renamed from: getColor-0d7_KjU */
            public long mo12118getColor0d7_KjU() {
                return this.color;
            }

            @Override // com.robinhood.android.charts.segmented.SegmentedLine.Style
            public LinearGradientColor getGradientColor() {
                return this.gradientColor;
            }

            /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
            public final float m12128getWidthD9Ej5fM() {
                return this.width;
            }

            /* renamed from: getCap-KaPHkGw, reason: not valid java name */
            public final int m12127getCapKaPHkGw() {
                return this.cap;
            }

            @Override // com.robinhood.android.charts.segmented.SegmentedLine.Style
            public DrawScope2 getDrawStyle(Composer composer, int i) {
                composer.startReplaceGroup(634596467);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(634596467, i, -1, "com.robinhood.android.charts.segmented.SegmentedLine.Style.Solid.getDrawStyle (SegmentedLine.kt:62)");
                }
                Stroke strokeM12136defaultSolidDrawStyleXjzXdws = UtilKt.m12136defaultSolidDrawStyleXjzXdws(this.width, this.cap, composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return strokeM12136defaultSolidDrawStyleXjzXdws;
            }
        }
    }

    public final List<Segment> getConnectedSegments$lib_charts_externalDebug() {
        List<Point> points;
        Point point;
        Segment segmentCopy$default;
        List<Segment> segments = getSegments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, 10));
        int i = 0;
        for (Object obj : segments) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Segment segment = (Segment) obj;
            Segment segment2 = (Segment) CollectionsKt.getOrNull(getSegments(), i2);
            if (segment2 != null && (points = segment2.getPoints()) != null && (point = (Point) CollectionsKt.firstOrNull((List) points)) != null && (segmentCopy$default = Segment.copy$default(segment, CollectionsKt.plus((Collection) segment.getPoints(), (Iterable) CollectionsKt.listOf(point)), null, 2, null)) != null) {
                segment = segmentCopy$default;
            }
            arrayList.add(segment);
            i = i2;
        }
        return arrayList;
    }

    public final List<Point> getAllPoints$lib_charts_externalDebug() {
        List<Segment> segments = getSegments();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = segments.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((Segment) it.next()).getPoints());
        }
        return arrayList;
    }

    public final boolean allSegmentsShareStyle$lib_charts_externalDebug(Interactions interactionState) {
        Intrinsics.checkNotNullParameter(interactionState, "interactionState");
        List<Segment> segments = getSegments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, 10));
        Iterator<T> it = segments.iterator();
        while (it.hasNext()) {
            arrayList.add((Style) Interactions2.getDefaulted(((Segment) it.next()).getStates(), interactionState));
        }
        return CollectionsKt.toSet(arrayList).size() == 1;
    }

    /* compiled from: SegmentedLine.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nB\u001f\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0007J\u0012\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0002J\u0017\u0010\u0018\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J/\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/charts/segmented/SegmentedLine$Segment;", "", "points", "", "Lcom/robinhood/android/charts/model/Point;", "states", "", "Lcom/robinhood/android/charts/InteractionState;", "Lcom/robinhood/android/charts/segmented/SegmentedLine$Style;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", ResourceTypes.STYLE, "(Ljava/util/List;Lcom/robinhood/android/charts/segmented/SegmentedLine$Style;)V", "getPoints", "()Ljava/util/List;", "getStates", "()Ljava/util/Map;", "contains", "", "point", "getInteractionState", "scrubPoint", "getDefaultedStyle", "interactionState", "getColor", "Landroidx/compose/ui/graphics/Color;", "getColor-vNxB06k", "(Lcom/robinhood/android/charts/model/Point;)J", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Segment {
        public static final int $stable = 8;
        private final List<Point> points;
        private final Map<Interactions, Style> states;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Segment copy$default(Segment segment, List list, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                list = segment.points;
            }
            if ((i & 2) != 0) {
                map = segment.states;
            }
            return segment.copy(list, map);
        }

        public final List<Point> component1() {
            return this.points;
        }

        public final Map<Interactions, Style> component2() {
            return this.states;
        }

        public final Segment copy(List<Point> points, Map<Interactions, ? extends Style> states) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(states, "states");
            return new Segment(points, states);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Segment)) {
                return false;
            }
            Segment segment = (Segment) other;
            return Intrinsics.areEqual(this.points, segment.points) && Intrinsics.areEqual(this.states, segment.states);
        }

        public int hashCode() {
            return (this.points.hashCode() * 31) + this.states.hashCode();
        }

        public String toString() {
            return "Segment(points=" + this.points + ", states=" + this.states + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Segment(List<Point> points, Map<Interactions, ? extends Style> states) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(states, "states");
            this.points = points;
            this.states = states;
        }

        public final List<Point> getPoints() {
            return this.points;
        }

        public final Map<Interactions, Style> getStates() {
            return this.states;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Segment(List<Point> points, Style style) {
            this(points, (Map<Interactions, ? extends Style>) MapsKt.mapOf(Tuples4.m3642to(Interactions.DEFAULT, style)));
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(style, "style");
        }

        public final boolean contains(Point point) {
            Intrinsics.checkNotNullParameter(point, "point");
            List<Point> list = this.points;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(((Point) it.next()).getX()));
            }
            Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) arrayList);
            if (fMinOrNull != null) {
                float fFloatValue = fMinOrNull.floatValue();
                Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) arrayList);
                if (fMaxOrNull != null) {
                    float fFloatValue2 = fMaxOrNull.floatValue();
                    float x = point.getX();
                    if (fFloatValue <= x && x <= fFloatValue2) {
                        return true;
                    }
                }
            }
            return false;
        }

        private final Interactions getInteractionState(Point scrubPoint) {
            if (scrubPoint == null) {
                return Interactions.DEFAULT;
            }
            return contains(scrubPoint) ? Interactions.ACTIVE : Interactions.INACTIVE;
        }

        public final Style getDefaultedStyle(Interactions interactionState) {
            Intrinsics.checkNotNullParameter(interactionState, "interactionState");
            return (Style) Interactions2.getDefaulted(this.states, interactionState);
        }

        private final Style getDefaultedStyle(Point scrubPoint) {
            return getDefaultedStyle(getInteractionState(scrubPoint));
        }

        /* renamed from: getColor-vNxB06k, reason: not valid java name */
        public final long m12117getColorvNxB06k(Point scrubPoint) {
            return getDefaultedStyle(scrubPoint).mo12118getColor0d7_KjU();
        }
    }

    /* compiled from: SegmentedLine.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013H\u0003¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0002\u0010\u0019J-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013H\u0017¢\u0006\u0002\u0010\u001bJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/charts/segmented/SegmentedLine$Default;", "Lcom/robinhood/android/charts/segmented/SegmentedLine;", "segments", "", "Lcom/robinhood/android/charts/segmented/SegmentedLine$Segment;", "drawLayer", "", "<init>", "(Ljava/util/List;Ljava/lang/Float;)V", "getSegments", "()Ljava/util/List;", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getConnectedSegments", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "interactionState", "Lcom/robinhood/android/charts/InteractionState;", "lineRevealAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Lcom/robinhood/android/charts/InteractionState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Ljava/util/List;", "getActiveSegment", "Lcom/robinhood/android/charts/model/Line;", "scrubPoint", "Lcom/robinhood/android/charts/model/Point;", "(Lcom/robinhood/android/charts/model/Point;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/model/Line;", "toChartAnnotations", "(Lcom/robinhood/android/charts/model/Point;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Float;)Lcom/robinhood/android/charts/segmented/SegmentedLine$Default;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Default extends SegmentedLine {
        public static final int $stable = 8;
        private final Float drawLayer;
        private final List<Segment> segments;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Default copy$default(Default r0, List list, Float f, int i, Object obj) {
            if ((i & 1) != 0) {
                list = r0.segments;
            }
            if ((i & 2) != 0) {
                f = r0.drawLayer;
            }
            return r0.copy(list, f);
        }

        public final List<Segment> component1() {
            return this.segments;
        }

        /* renamed from: component2, reason: from getter */
        public final Float getDrawLayer() {
            return this.drawLayer;
        }

        public final Default copy(List<Segment> segments, Float drawLayer) {
            Intrinsics.checkNotNullParameter(segments, "segments");
            return new Default(segments, drawLayer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Default)) {
                return false;
            }
            Default r5 = (Default) other;
            return Intrinsics.areEqual(this.segments, r5.segments) && Intrinsics.areEqual((Object) this.drawLayer, (Object) r5.drawLayer);
        }

        public int hashCode() {
            int iHashCode = this.segments.hashCode() * 31;
            Float f = this.drawLayer;
            return iHashCode + (f == null ? 0 : f.hashCode());
        }

        public String toString() {
            return "Default(segments=" + this.segments + ", drawLayer=" + this.drawLayer + ")";
        }

        public /* synthetic */ Default(List list, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : f);
        }

        @Override // com.robinhood.android.charts.segmented.SegmentedLine
        public List<Segment> getSegments() {
            return this.segments;
        }

        @Override // com.robinhood.android.charts.segmented.SegmentedLine
        public Float getDrawLayer() {
            return this.drawLayer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Default(List<Segment> segments, Float f) {
            super(null);
            Intrinsics.checkNotNullParameter(segments, "segments");
            this.segments = segments;
            this.drawLayer = f;
        }

        private final List<ChartAnnotation> getConnectedSegments(Interactions interactions, AnimationSpec<Float> animationSpec, Composer composer, int i, int i2) {
            List<ChartAnnotation> listListOf;
            composer.startReplaceGroup(1854785987);
            if ((i2 & 2) != 0) {
                animationSpec = null;
            }
            AnimationSpec<Float> animationSpec2 = animationSpec;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1854785987, i, -1, "com.robinhood.android.charts.segmented.SegmentedLine.Default.getConnectedSegments (SegmentedLine.kt:151)");
            }
            if (allSegmentsShareStyle$lib_charts_externalDebug(interactions)) {
                composer.startReplaceGroup(1175361406);
                Segment segment = (Segment) CollectionsKt.firstOrNull((List) getSegments());
                if (segment == null) {
                    List<ChartAnnotation> listEmptyList = CollectionsKt.emptyList();
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return listEmptyList;
                }
                Style defaultedStyle = segment.getDefaultedStyle(interactions);
                List<Segment> segments = getSegments();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = segments.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, ((Segment) it.next()).getPoints());
                }
                long jMo12118getColor0d7_KjU = defaultedStyle.mo12118getColor0d7_KjU();
                LinearGradientColor gradientColor = defaultedStyle.getGradientColor();
                DrawScope2 drawStyle = defaultedStyle.getDrawStyle(composer, 0);
                Float drawLayer = getDrawLayer();
                listListOf = CollectionsKt.listOf(new Line(arrayList, jMo12118getColor0d7_KjU, gradientColor, drawStyle, animationSpec2, Float.valueOf(drawLayer != null ? drawLayer.floatValue() : 3.0f), null));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1176001029);
                List<Segment> connectedSegments$lib_charts_externalDebug = getConnectedSegments$lib_charts_externalDebug();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(connectedSegments$lib_charts_externalDebug, 10));
                for (Segment segment2 : connectedSegments$lib_charts_externalDebug) {
                    Style defaultedStyle2 = segment2.getDefaultedStyle(interactions);
                    List<Point> points = segment2.getPoints();
                    long jMo12118getColor0d7_KjU2 = defaultedStyle2.mo12118getColor0d7_KjU();
                    LinearGradientColor gradientColor2 = defaultedStyle2.getGradientColor();
                    DrawScope2 drawStyle2 = defaultedStyle2.getDrawStyle(composer, 0);
                    Float drawLayer2 = getDrawLayer();
                    arrayList2.add(new Line(points, jMo12118getColor0d7_KjU2, gradientColor2, drawStyle2, animationSpec2, Float.valueOf(drawLayer2 != null ? drawLayer2.floatValue() : 3.0f), null));
                }
                composer.endReplaceGroup();
                listListOf = arrayList2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return listListOf;
        }

        private final Line getActiveSegment(Point point, Composer composer, int i) {
            Object next;
            composer.startReplaceGroup(1830386657);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1830386657, i, -1, "com.robinhood.android.charts.segmented.SegmentedLine.Default.getActiveSegment (SegmentedLine.kt:184)");
            }
            if (point == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return null;
            }
            Iterator<T> it = getSegments().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Segment) next).contains(point)) {
                    break;
                }
            }
            Segment segment = (Segment) next;
            if (segment == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return null;
            }
            Style defaultedStyle = segment.getDefaultedStyle(Interactions.ACTIVE);
            List<Point> points = segment.getPoints();
            long jMo12118getColor0d7_KjU = defaultedStyle.mo12118getColor0d7_KjU();
            LinearGradientColor gradientColor = defaultedStyle.getGradientColor();
            DrawScope2 drawStyle = defaultedStyle.getDrawStyle(composer, 0);
            Float drawLayer = getDrawLayer();
            Line line = new Line(points, jMo12118getColor0d7_KjU, gradientColor, drawStyle, null, Float.valueOf(drawLayer != null ? drawLayer.floatValue() : 3.0f), 16, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return line;
        }

        @Override // com.robinhood.android.charts.segmented.SegmentedLine
        public List<ChartAnnotation> toChartAnnotations(Point point, AnimationSpec<Float> animationSpec, Composer composer, int i) {
            composer.startReplaceGroup(912000692);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912000692, i, -1, "com.robinhood.android.charts.segmented.SegmentedLine.Default.toChartAnnotations (SegmentedLine.kt:206)");
            }
            Interactions interactions = point == null ? Interactions.DEFAULT : Interactions.INACTIVE;
            if (getAllPoints$lib_charts_externalDebug().size() == 2 && getAllPoints$lib_charts_externalDebug().get(0).getY() == getAllPoints$lib_charts_externalDebug().get(1).getY()) {
                animationSpec = null;
            }
            List<ChartAnnotation> listPlus = CollectionsKt.plus((Collection) getConnectedSegments(interactions, animationSpec, composer, i & 896, 0), (Iterable) CollectionsKt.listOfNotNull(getActiveSegment(point, composer, (i & 14) | ((i >> 3) & 112))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return listPlus;
        }
    }

    /* compiled from: SegmentedLine.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0003¢\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0003¢\u0006\u0002\u0010\u0015J-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001bH\u0017¢\u0006\u0002\u0010\u001cJ\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ4\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/charts/segmented/SegmentedLine$Dotted;", "Lcom/robinhood/android/charts/segmented/SegmentedLine;", "segments", "", "Lcom/robinhood/android/charts/segmented/SegmentedLine$Segment;", "dashGap", "", "drawLayer", "<init>", "(Ljava/util/List;FLjava/lang/Float;)V", "getSegments", "()Ljava/util/List;", "getDashGap", "()F", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "renderStraightHorizontalLine", "Lcom/robinhood/android/charts/model/Dot;", "scrubPoint", "Lcom/robinhood/android/charts/model/Point;", "(Lcom/robinhood/android/charts/model/Point;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "renderUnsupportedDottedLine", "Lcom/robinhood/android/charts/model/Line;", "toChartAnnotations", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "lineRevealAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Lcom/robinhood/android/charts/model/Point;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/util/List;FLjava/lang/Float;)Lcom/robinhood/android/charts/segmented/SegmentedLine$Dotted;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Dotted extends SegmentedLine {
        public static final int $stable = 8;
        private final float dashGap;
        private final Float drawLayer;
        private final List<Segment> segments;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Dotted copy$default(Dotted dotted, List list, float f, Float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = dotted.segments;
            }
            if ((i & 2) != 0) {
                f = dotted.dashGap;
            }
            if ((i & 4) != 0) {
                f2 = dotted.drawLayer;
            }
            return dotted.copy(list, f, f2);
        }

        public final List<Segment> component1() {
            return this.segments;
        }

        /* renamed from: component2, reason: from getter */
        public final float getDashGap() {
            return this.dashGap;
        }

        /* renamed from: component3, reason: from getter */
        public final Float getDrawLayer() {
            return this.drawLayer;
        }

        public final Dotted copy(List<Segment> segments, float dashGap, Float drawLayer) {
            Intrinsics.checkNotNullParameter(segments, "segments");
            return new Dotted(segments, dashGap, drawLayer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dotted)) {
                return false;
            }
            Dotted dotted = (Dotted) other;
            return Intrinsics.areEqual(this.segments, dotted.segments) && Float.compare(this.dashGap, dotted.dashGap) == 0 && Intrinsics.areEqual((Object) this.drawLayer, (Object) dotted.drawLayer);
        }

        public int hashCode() {
            int iHashCode = ((this.segments.hashCode() * 31) + Float.hashCode(this.dashGap)) * 31;
            Float f = this.drawLayer;
            return iHashCode + (f == null ? 0 : f.hashCode());
        }

        public String toString() {
            return "Dotted(segments=" + this.segments + ", dashGap=" + this.dashGap + ", drawLayer=" + this.drawLayer + ")";
        }

        public /* synthetic */ Dotted(List list, float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, f, (i & 4) != 0 ? null : f2);
        }

        @Override // com.robinhood.android.charts.segmented.SegmentedLine
        public List<Segment> getSegments() {
            return this.segments;
        }

        public final float getDashGap() {
            return this.dashGap;
        }

        @Override // com.robinhood.android.charts.segmented.SegmentedLine
        public Float getDrawLayer() {
            return this.drawLayer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dotted(List<Segment> segments, float f, Float f2) {
            super(null);
            Intrinsics.checkNotNullParameter(segments, "segments");
            this.segments = segments;
            this.dashGap = f;
            this.drawLayer = f2;
        }

        /* JADX WARN: Removed duplicated region for block: B:84:0x01b0 A[Catch: OutOfMemoryError -> 0x010c, PHI: r8
          0x01b0: PHI (r8v8 com.robinhood.android.charts.segmented.SegmentedLine$Segment) = 
          (r8v7 com.robinhood.android.charts.segmented.SegmentedLine$Segment)
          (r8v17 com.robinhood.android.charts.segmented.SegmentedLine$Segment)
         binds: [B:73:0x0189, B:82:0x01ac] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {OutOfMemoryError -> 0x010c, blocks: (B:50:0x00e6, B:52:0x0103, B:58:0x0117, B:59:0x0135, B:61:0x013b, B:62:0x0152, B:63:0x015b, B:65:0x0161, B:66:0x0172, B:68:0x0178, B:72:0x0187, B:74:0x018b, B:75:0x0195, B:77:0x019b, B:81:0x01aa, B:90:0x01d3, B:84:0x01b0, B:86:0x01be, B:88:0x01c5, B:91:0x01d7, B:93:0x01dd, B:94:0x01e0, B:57:0x010f), top: B:98:0x00e6 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final List<Dot> renderStraightHorizontalLine(Point point, Composer composer, int i) {
            Object next;
            Object next2;
            Object next3;
            Dot dot;
            Object next4;
            composer.startReplaceGroup(481197385);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(481197385, i, -1, "com.robinhood.android.charts.segmented.SegmentedLine.Dotted.renderStraightHorizontalLine (SegmentedLine.kt:228)");
            }
            Iterator<T> it = getAllPoints$lib_charts_externalDebug().iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    float x = ((Point) next).getX();
                    do {
                        Object next5 = it.next();
                        float x2 = ((Point) next5).getX();
                        if (Float.compare(x, x2) > 0) {
                            next = next5;
                            x = x2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Point point2 = (Point) next;
            if (point2 == null) {
                List<Dot> listEmptyList = CollectionsKt.emptyList();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return listEmptyList;
            }
            Iterator<T> it2 = getAllPoints$lib_charts_externalDebug().iterator();
            if (it2.hasNext()) {
                next2 = it2.next();
                if (it2.hasNext()) {
                    float x3 = ((Point) next2).getX();
                    do {
                        Object next6 = it2.next();
                        float x4 = ((Point) next6).getX();
                        if (Float.compare(x3, x4) < 0) {
                            next2 = next6;
                            x3 = x4;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next2 = null;
            }
            final Point point3 = (Point) next2;
            if (point3 == null) {
                List<Dot> listEmptyList2 = CollectionsKt.emptyList();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return listEmptyList2;
            }
            if (this.dashGap <= 0.0f) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new ZeroDashGapException("renderStraightHorizontalLine invoked with dashGap<=0, which will cause OOM."), false, null, 6, null);
                List<Dot> listEmptyList3 = CollectionsKt.emptyList();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return listEmptyList3;
            }
            try {
                Float fValueOf = Float.valueOf(point2.getX());
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(point3) | composer.changedInstance(this);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.segmented.SegmentedLine$Dotted$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SegmentedLine.Dotted.renderStraightHorizontalLine$lambda$3$lambda$2(point3, this, ((Float) obj).floatValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                List list = SequencesKt.toList(SequencesKt.generateSequence(fValueOf, (Function1<? super Float, ? extends Float>) objRememberedValue));
                ArrayList<Point> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new Point(((Number) it3.next()).floatValue(), point2.getY()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Point point4 : arrayList) {
                    Iterator<T> it4 = getSegments().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it4.next();
                        if (((Segment) next3).contains(point4)) {
                            break;
                        }
                    }
                    Segment segment = (Segment) next3;
                    if (segment == null) {
                        Iterator<T> it5 = getConnectedSegments$lib_charts_externalDebug().iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it5.next();
                            if (((Segment) next4).contains(point4)) {
                                break;
                            }
                        }
                        segment = (Segment) next4;
                        if (segment == null) {
                            dot = null;
                        } else {
                            long jM12117getColorvNxB06k = segment.m12117getColorvNxB06k(point);
                            Float drawLayer = getDrawLayer();
                            dot = new Dot(point4, 0.0f, jM12117getColorvNxB06k, Float.valueOf(drawLayer != null ? drawLayer.floatValue() : 1.0f), 2, null);
                        }
                    }
                    if (dot != null) {
                        arrayList2.add(dot);
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return arrayList2;
            } catch (OutOfMemoryError e) {
                CrashReporter.INSTANCE.log("renderStraightHorizontalLine OOM: start=" + point2 + ", end=" + point3 + ", dashGap=" + this.dashGap);
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Float renderStraightHorizontalLine$lambda$3$lambda$2(Point point, Dotted dotted, float f) {
            if (f > point.getX()) {
                return null;
            }
            return Float.valueOf(f + dotted.dashGap);
        }

        private final List<Line> renderUnsupportedDottedLine(Point point, Composer composer, int i) {
            composer.startReplaceGroup(982033008);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(982033008, i, -1, "com.robinhood.android.charts.segmented.SegmentedLine.Dotted.renderUnsupportedDottedLine (SegmentedLine.kt:272)");
            }
            List<Segment> connectedSegments$lib_charts_externalDebug = getConnectedSegments$lib_charts_externalDebug();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(connectedSegments$lib_charts_externalDebug, 10));
            for (Segment segment : connectedSegments$lib_charts_externalDebug) {
                List<Point> points = segment.getPoints();
                long jM12117getColorvNxB06k = segment.m12117getColorvNxB06k(point);
                Stroke strokeM12135defaultDottedDrawStylekHDZbjc = UtilKt.m12135defaultDottedDrawStylekHDZbjc(0.0f, composer, 0, 1);
                Float drawLayer = getDrawLayer();
                arrayList.add(new Line(points, jM12117getColorvNxB06k, null, strokeM12135defaultDottedDrawStylekHDZbjc, null, Float.valueOf(drawLayer != null ? drawLayer.floatValue() : 1.0f), 20, null));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return arrayList;
        }

        @Override // com.robinhood.android.charts.segmented.SegmentedLine
        public List<ChartAnnotation> toChartAnnotations(Point point, AnimationSpec<Float> animationSpec, Composer composer, int i) {
            List<ChartAnnotation> listRenderUnsupportedDottedLine;
            composer.startReplaceGroup(286958781);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(286958781, i, -1, "com.robinhood.android.charts.segmented.SegmentedLine.Dotted.toChartAnnotations (SegmentedLine.kt:287)");
            }
            List<Point> allPoints$lib_charts_externalDebug = getAllPoints$lib_charts_externalDebug();
            if ((allPoints$lib_charts_externalDebug instanceof Collection) && allPoints$lib_charts_externalDebug.isEmpty()) {
                composer.startReplaceGroup(889492421);
                listRenderUnsupportedDottedLine = renderStraightHorizontalLine(point, composer, (i & 14) | ((i >> 3) & 112));
                composer.endReplaceGroup();
            } else {
                Iterator<T> it = allPoints$lib_charts_externalDebug.iterator();
                while (it.hasNext()) {
                    if (((Point) it.next()).getY() != ((Point) CollectionsKt.first((List) ((Segment) CollectionsKt.first((List) getSegments())).getPoints())).getY()) {
                        composer.startReplaceGroup(889494500);
                        listRenderUnsupportedDottedLine = renderUnsupportedDottedLine(point, composer, (i & 14) | ((i >> 3) & 112));
                        composer.endReplaceGroup();
                        break;
                    }
                }
                composer.startReplaceGroup(889492421);
                listRenderUnsupportedDottedLine = renderStraightHorizontalLine(point, composer, (i & 14) | ((i >> 3) & 112));
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return listRenderUnsupportedDottedLine;
        }
    }
}

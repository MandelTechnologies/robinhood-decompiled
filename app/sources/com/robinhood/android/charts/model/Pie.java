package com.robinhood.android.charts.model;

import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.graphics.drawscope.DrawScope3;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.charts.RectExtensions;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Pie.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001<Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010%\u001a\u00020&*\u00020'H\u0017¢\u0006\u0002\u0010(J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#Jz\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/charts/model/Pie;", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "topLeft", "Lcom/robinhood/android/charts/model/Point;", "bottomRight", "slices", "", "Lcom/robinhood/android/charts/model/Pie$Slice;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "start", "", "gap", "progress", "useCenter", "", "stack", "drawLayer", "<init>", "(Lcom/robinhood/android/charts/model/Point;Lcom/robinhood/android/charts/model/Point;Ljava/util/List;Landroidx/compose/ui/graphics/drawscope/DrawStyle;FFFZZLjava/lang/Float;)V", "getTopLeft", "()Lcom/robinhood/android/charts/model/Point;", "getBottomRight", "getSlices", "()Ljava/util/List;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getStart", "()F", "getGap", "getProgress", "getUseCenter", "()Z", "getStack", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lcom/robinhood/android/charts/model/Point;Lcom/robinhood/android/charts/model/Point;Ljava/util/List;Landroidx/compose/ui/graphics/drawscope/DrawStyle;FFFZZLjava/lang/Float;)Lcom/robinhood/android/charts/model/Pie;", "equals", "other", "", "hashCode", "", "toString", "", "Slice", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class Pie implements ChartAnnotation {
    public static final int $stable = 8;
    private final Point bottomRight;
    private final Float drawLayer;
    private final DrawScope2 drawStyle;
    private final float gap;
    private final float progress;
    private final List<Slice> slices;
    private final boolean stack;
    private final float start;
    private final Point topLeft;
    private final boolean useCenter;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$4(Pie pie, BoxScope boxScope, int i, Composer composer, int i2) {
        pie.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Pie copy$default(Pie pie, Point point, Point point2, List list, DrawScope2 drawScope2, float f, float f2, float f3, boolean z, boolean z2, Float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            point = pie.topLeft;
        }
        if ((i & 2) != 0) {
            point2 = pie.bottomRight;
        }
        if ((i & 4) != 0) {
            list = pie.slices;
        }
        if ((i & 8) != 0) {
            drawScope2 = pie.drawStyle;
        }
        if ((i & 16) != 0) {
            f = pie.start;
        }
        if ((i & 32) != 0) {
            f2 = pie.gap;
        }
        if ((i & 64) != 0) {
            f3 = pie.progress;
        }
        if ((i & 128) != 0) {
            z = pie.useCenter;
        }
        if ((i & 256) != 0) {
            z2 = pie.stack;
        }
        if ((i & 512) != 0) {
            f4 = pie.drawLayer;
        }
        boolean z3 = z2;
        Float f5 = f4;
        float f6 = f3;
        boolean z4 = z;
        float f7 = f;
        float f8 = f2;
        return pie.copy(point, point2, list, drawScope2, f7, f8, f6, z4, z3, f5);
    }

    /* renamed from: component1, reason: from getter */
    public final Point getTopLeft() {
        return this.topLeft;
    }

    /* renamed from: component10, reason: from getter */
    public final Float getDrawLayer() {
        return this.drawLayer;
    }

    /* renamed from: component2, reason: from getter */
    public final Point getBottomRight() {
        return this.bottomRight;
    }

    public final List<Slice> component3() {
        return this.slices;
    }

    /* renamed from: component4, reason: from getter */
    public final DrawScope2 getDrawStyle() {
        return this.drawStyle;
    }

    /* renamed from: component5, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* renamed from: component6, reason: from getter */
    public final float getGap() {
        return this.gap;
    }

    /* renamed from: component7, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getUseCenter() {
        return this.useCenter;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getStack() {
        return this.stack;
    }

    public final Pie copy(Point topLeft, Point bottomRight, List<Slice> slices, DrawScope2 drawStyle, float start, float gap, float progress, boolean useCenter, boolean stack, Float drawLayer) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        Intrinsics.checkNotNullParameter(slices, "slices");
        Intrinsics.checkNotNullParameter(drawStyle, "drawStyle");
        return new Pie(topLeft, bottomRight, slices, drawStyle, start, gap, progress, useCenter, stack, drawLayer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pie)) {
            return false;
        }
        Pie pie = (Pie) other;
        return Intrinsics.areEqual(this.topLeft, pie.topLeft) && Intrinsics.areEqual(this.bottomRight, pie.bottomRight) && Intrinsics.areEqual(this.slices, pie.slices) && Intrinsics.areEqual(this.drawStyle, pie.drawStyle) && Float.compare(this.start, pie.start) == 0 && Float.compare(this.gap, pie.gap) == 0 && Float.compare(this.progress, pie.progress) == 0 && this.useCenter == pie.useCenter && this.stack == pie.stack && Intrinsics.areEqual((Object) this.drawLayer, (Object) pie.drawLayer);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.topLeft.hashCode() * 31) + this.bottomRight.hashCode()) * 31) + this.slices.hashCode()) * 31) + this.drawStyle.hashCode()) * 31) + Float.hashCode(this.start)) * 31) + Float.hashCode(this.gap)) * 31) + Float.hashCode(this.progress)) * 31) + Boolean.hashCode(this.useCenter)) * 31) + Boolean.hashCode(this.stack)) * 31;
        Float f = this.drawLayer;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }

    public String toString() {
        return "Pie(topLeft=" + this.topLeft + ", bottomRight=" + this.bottomRight + ", slices=" + this.slices + ", drawStyle=" + this.drawStyle + ", start=" + this.start + ", gap=" + this.gap + ", progress=" + this.progress + ", useCenter=" + this.useCenter + ", stack=" + this.stack + ", drawLayer=" + this.drawLayer + ")";
    }

    public Pie(Point topLeft, Point bottomRight, List<Slice> slices, DrawScope2 drawStyle, float f, float f2, float f3, boolean z, boolean z2, Float f4) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        Intrinsics.checkNotNullParameter(slices, "slices");
        Intrinsics.checkNotNullParameter(drawStyle, "drawStyle");
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.slices = slices;
        this.drawStyle = drawStyle;
        this.start = f;
        this.gap = f2;
        this.progress = f3;
        this.useCenter = z;
        this.stack = z2;
        this.drawLayer = f4;
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
        ChartAnnotation.DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
    }

    public /* synthetic */ Pie(Point point, Point point2, List list, DrawScope2 drawScope2, float f, float f2, float f3, boolean z, boolean z2, Float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Point(0.0f, 1.0f) : point, (i & 2) != 0 ? new Point(1.0f, 0.0f) : point2, list, (i & 8) != 0 ? DrawScope3.INSTANCE : drawScope2, (i & 16) != 0 ? 0.0f : f, (i & 32) != 0 ? 0.0f : f2, (i & 64) != 0 ? 1.0f : f3, z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : f4);
    }

    public final Point getTopLeft() {
        return this.topLeft;
    }

    public final Point getBottomRight() {
        return this.bottomRight;
    }

    public final List<Slice> getSlices() {
        return this.slices;
    }

    public final DrawScope2 getDrawStyle() {
        return this.drawStyle;
    }

    public final float getStart() {
        return this.start;
    }

    public final float getGap() {
        return this.gap;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final boolean getUseCenter() {
        return this.useCenter;
    }

    public final boolean getStack() {
        return this.stack;
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public Float getDrawLayer() {
        return this.drawLayer;
    }

    /* compiled from: Pie.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u0014J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Pie$Slice;", "", "value", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "hollowBackgroundColor", "<init>", "(FJLandroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getValue", "()F", "getColor-0d7_KjU", "()J", "J", "getHollowBackgroundColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component1", "component2", "component2-0d7_KjU", "component3", "component3-QN2ZGVo", "copy", "copy-KZA9ayg", "(FJLandroidx/compose/ui/graphics/Color;)Lcom/robinhood/android/charts/model/Pie$Slice;", "equals", "", "other", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Slice {
        public static final int $stable = 0;
        private final long color;
        private final Color hollowBackgroundColor;
        private final float value;

        public /* synthetic */ Slice(float f, long j, Color color, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, j, color);
        }

        /* renamed from: copy-KZA9ayg$default, reason: not valid java name */
        public static /* synthetic */ Slice m12077copyKZA9ayg$default(Slice slice, float f, long j, Color color, int i, Object obj) {
            if ((i & 1) != 0) {
                f = slice.value;
            }
            if ((i & 2) != 0) {
                j = slice.color;
            }
            if ((i & 4) != 0) {
                color = slice.hollowBackgroundColor;
            }
            return slice.m12080copyKZA9ayg(f, j, color);
        }

        /* renamed from: component1, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: component3-QN2ZGVo, reason: not valid java name and from getter */
        public final Color getHollowBackgroundColor() {
            return this.hollowBackgroundColor;
        }

        /* renamed from: copy-KZA9ayg, reason: not valid java name */
        public final Slice m12080copyKZA9ayg(float value, long color, Color hollowBackgroundColor) {
            return new Slice(value, color, hollowBackgroundColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Slice)) {
                return false;
            }
            Slice slice = (Slice) other;
            return Float.compare(this.value, slice.value) == 0 && Color.m6707equalsimpl0(this.color, slice.color) && Intrinsics.areEqual(this.hollowBackgroundColor, slice.hollowBackgroundColor);
        }

        public int hashCode() {
            int iHashCode = ((Float.hashCode(this.value) * 31) + Color.m6713hashCodeimpl(this.color)) * 31;
            Color color = this.hollowBackgroundColor;
            return iHashCode + (color == null ? 0 : Color.m6713hashCodeimpl(color.getValue()));
        }

        public String toString() {
            return "Slice(value=" + this.value + ", color=" + Color.m6714toStringimpl(this.color) + ", hollowBackgroundColor=" + this.hollowBackgroundColor + ")";
        }

        private Slice(float f, long j, Color color) {
            this.value = f;
            this.color = j;
            this.hollowBackgroundColor = color;
        }

        public /* synthetic */ Slice(float f, long j, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, j, (i & 4) != 0 ? null : color, null);
        }

        public final float getValue() {
            return this.value;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m12081getColor0d7_KjU() {
            return this.color;
        }

        /* renamed from: getHollowBackgroundColor-QN2ZGVo, reason: not valid java name */
        public final Color m12082getHollowBackgroundColorQN2ZGVo() {
            return this.hollowBackgroundColor;
        }
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public void Content(final BoxScope boxScope, Composer composer, final int i) {
        int i2;
        Modifier modifierZIndex;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-54041006);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-54041006, i2, -1, "com.robinhood.android.charts.model.Pie.Content (Pie.kt:48)");
            }
            Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
            Float drawLayer = getDrawLayer();
            if (drawLayer != null && (modifierZIndex = ZIndexModifier2.zIndex(modifierMatchParentSize, drawLayer.floatValue())) != null) {
                modifierMatchParentSize = modifierZIndex;
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.model.Pie$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Pie.Content$lambda$3$lambda$2(this.f$0, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Canvas2.Canvas(modifierMatchParentSize, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Pie$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Pie.Content$lambda$4(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$3$lambda$2(Pie pie, DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Rect rectM6592toRectuvyYCjk = SizeKt.m6592toRectuvyYCjk(Canvas.mo6963getSizeNHjbRc());
        float f = pie.slices.size() > 1 ? pie.gap * 360.0f : 0.0f;
        float size = f * pie.slices.size();
        float f2 = pie.start + (f / 2);
        float f3 = f2;
        for (Slice slice : pie.slices) {
            float f4 = f3 + 270.0f;
            float value = slice.getValue() * (360.0f - size);
            long translation = RectExtensions.getTranslation(rectM6592toRectuvyYCjk, pie.topLeft);
            long translatedSize = RectExtensions.getTranslatedSize(rectM6592toRectuvyYCjk, pie.topLeft, pie.bottomRight);
            DrawScope.m6945drawArcyD3GUKo$default(Canvas, slice.m12081getColor0d7_KjU(), f4, pie.progress * value, pie.useCenter, translation, translatedSize, 0.0f, pie.drawStyle, null, 0, 832, null);
            if ((pie.drawStyle instanceof Stroke) && slice.m12082getHollowBackgroundColorQN2ZGVo() != null) {
                DrawScope.m6945drawArcyD3GUKo$default(drawScope, slice.m12082getHollowBackgroundColorQN2ZGVo().getValue(), f4, value * pie.progress, pie.useCenter, translation, translatedSize, 0.0f, new Stroke(((Stroke) pie.drawStyle).getWidth() * 0.3f, ((Stroke) pie.drawStyle).getMiter(), ((Stroke) pie.drawStyle).getCap(), ((Stroke) pie.drawStyle).getJoin(), ((Stroke) pie.drawStyle).getPathEffect(), null), null, 0, 832, null);
            }
            if (!pie.stack) {
                f3 += value + f;
            }
            Canvas = drawScope;
        }
        return Unit.INSTANCE;
    }
}

package com.robinhood.android.charts.model;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.charts.Chart2;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.shared.compose.color.LinearGradientColor;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Line.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010#\u001a\u00020$*\u00020%H\u0017¢\u0006\u0002\u0010&J?\u0010'\u001a\u00020$*\u00020(2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010,\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b-\u0010\u0014J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ^\u00102\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b3\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/charts/model/Line;", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "points", "", "Lcom/robinhood/android/charts/model/Point;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "gradientColor", "Lcom/robinhood/shared/compose/color/LinearGradientColor;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "lineRevealAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "drawLayer", "<init>", "(Ljava/util/List;JLcom/robinhood/shared/compose/color/LinearGradientColor;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPoints", "()Ljava/util/List;", "getColor-0d7_KjU", "()J", "J", "getGradientColor", "()Lcom/robinhood/shared/compose/color/LinearGradientColor;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getLineRevealAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "left", "right", "top", "bottom", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "drawPath", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawPath-XO-JAsU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Ljava/util/List;JLcom/robinhood/shared/compose/color/LinearGradientColor;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "component1", "component2", "component2-0d7_KjU", "component3", "component4", "component5", "component6", "copy", "copy-3IgeMak", "(Ljava/util/List;JLcom/robinhood/shared/compose/color/LinearGradientColor;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Float;)Lcom/robinhood/android/charts/model/Line;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class Line implements ChartAnnotation {
    public static final int $stable = 8;
    private final float bottom;
    private final long color;
    private final Float drawLayer;
    private final DrawScope2 drawStyle;
    private final LinearGradientColor gradientColor;
    private final float left;
    private final AnimationSpec<Float> lineRevealAnimationSpec;
    private final List<Point> points;
    private final float right;
    private final float top;

    public /* synthetic */ Line(List list, long j, LinearGradientColor linearGradientColor, DrawScope2 drawScope2, AnimationSpec animationSpec, Float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, j, linearGradientColor, drawScope2, animationSpec, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$11(Line line, BoxScope boxScope, int i, Composer composer, int i2) {
        line.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: copy-3IgeMak$default, reason: not valid java name */
    public static /* synthetic */ Line m12071copy3IgeMak$default(Line line, List list, long j, LinearGradientColor linearGradientColor, DrawScope2 drawScope2, AnimationSpec animationSpec, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            list = line.points;
        }
        if ((i & 2) != 0) {
            j = line.color;
        }
        if ((i & 4) != 0) {
            linearGradientColor = line.gradientColor;
        }
        if ((i & 8) != 0) {
            drawScope2 = line.drawStyle;
        }
        if ((i & 16) != 0) {
            animationSpec = line.lineRevealAnimationSpec;
        }
        if ((i & 32) != 0) {
            f = line.drawLayer;
        }
        return line.m12075copy3IgeMak(list, j, linearGradientColor, drawScope2, animationSpec, f);
    }

    public final List<Point> component1() {
        return this.points;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final LinearGradientColor getGradientColor() {
        return this.gradientColor;
    }

    /* renamed from: component4, reason: from getter */
    public final DrawScope2 getDrawStyle() {
        return this.drawStyle;
    }

    public final AnimationSpec<Float> component5() {
        return this.lineRevealAnimationSpec;
    }

    /* renamed from: component6, reason: from getter */
    public final Float getDrawLayer() {
        return this.drawLayer;
    }

    /* renamed from: copy-3IgeMak, reason: not valid java name */
    public final Line m12075copy3IgeMak(List<Point> points, long color, LinearGradientColor gradientColor, DrawScope2 drawStyle, AnimationSpec<Float> lineRevealAnimationSpec, Float drawLayer) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(drawStyle, "drawStyle");
        return new Line(points, color, gradientColor, drawStyle, lineRevealAnimationSpec, drawLayer, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Line)) {
            return false;
        }
        Line line = (Line) other;
        return Intrinsics.areEqual(this.points, line.points) && Color.m6707equalsimpl0(this.color, line.color) && Intrinsics.areEqual(this.gradientColor, line.gradientColor) && Intrinsics.areEqual(this.drawStyle, line.drawStyle) && Intrinsics.areEqual(this.lineRevealAnimationSpec, line.lineRevealAnimationSpec) && Intrinsics.areEqual((Object) this.drawLayer, (Object) line.drawLayer);
    }

    public int hashCode() {
        int iHashCode = ((this.points.hashCode() * 31) + Color.m6713hashCodeimpl(this.color)) * 31;
        LinearGradientColor linearGradientColor = this.gradientColor;
        int iHashCode2 = (((iHashCode + (linearGradientColor == null ? 0 : linearGradientColor.hashCode())) * 31) + this.drawStyle.hashCode()) * 31;
        AnimationSpec<Float> animationSpec = this.lineRevealAnimationSpec;
        int iHashCode3 = (iHashCode2 + (animationSpec == null ? 0 : animationSpec.hashCode())) * 31;
        Float f = this.drawLayer;
        return iHashCode3 + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        return "Line(points=" + this.points + ", color=" + Color.m6714toStringimpl(this.color) + ", gradientColor=" + this.gradientColor + ", drawStyle=" + this.drawStyle + ", lineRevealAnimationSpec=" + this.lineRevealAnimationSpec + ", drawLayer=" + this.drawLayer + ")";
    }

    private Line(List<Point> points, long j, LinearGradientColor linearGradientColor, DrawScope2 drawStyle, AnimationSpec<Float> animationSpec, Float f) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(drawStyle, "drawStyle");
        this.points = points;
        this.color = j;
        this.gradientColor = linearGradientColor;
        this.drawStyle = drawStyle;
        this.lineRevealAnimationSpec = animationSpec;
        this.drawLayer = f;
        Iterator<T> it = points.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float x = ((Point) it.next()).getX();
        while (it.hasNext()) {
            x = Math.min(x, ((Point) it.next()).getX());
        }
        this.left = x;
        Iterator<T> it2 = this.points.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float x2 = ((Point) it2.next()).getX();
        while (it2.hasNext()) {
            x2 = Math.max(x2, ((Point) it2.next()).getX());
        }
        this.right = x2;
        float f2 = 1;
        Iterator<T> it3 = this.points.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float y = ((Point) it3.next()).getY();
        while (it3.hasNext()) {
            y = Math.max(y, ((Point) it3.next()).getY());
        }
        this.top = f2 - y;
        Iterator<T> it4 = this.points.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        float y2 = ((Point) it4.next()).getY();
        while (it4.hasNext()) {
            y2 = Math.min(y2, ((Point) it4.next()).getY());
        }
        this.bottom = f2 - y2;
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
        ChartAnnotation.DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
    }

    public final List<Point> getPoints() {
        return this.points;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m12076getColor0d7_KjU() {
        return this.color;
    }

    public final LinearGradientColor getGradientColor() {
        return this.gradientColor;
    }

    public /* synthetic */ Line(List list, long j, LinearGradientColor linearGradientColor, DrawScope2 drawScope2, AnimationSpec animationSpec, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, j, (i & 4) != 0 ? null : linearGradientColor, (i & 8) != 0 ? new Stroke(0.0f, 0.0f, 0, 0, null, 31, null) : drawScope2, (i & 16) != 0 ? null : animationSpec, (i & 32) != 0 ? null : f, null);
    }

    public final DrawScope2 getDrawStyle() {
        return this.drawStyle;
    }

    public final AnimationSpec<Float> getLineRevealAnimationSpec() {
        return this.lineRevealAnimationSpec;
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public Float getDrawLayer() {
        return this.drawLayer;
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public void Content(final BoxScope boxScope, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1209268482);
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
                ComposerKt.traceEventStart(-1209268482, i2, -1, "com.robinhood.android.charts.model.Line.Content (Line.kt:35)");
            }
            if (this.lineRevealAnimationSpec != null) {
                composerStartRestartGroup.startReplaceGroup(868448582);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final Animatable animatable = (Animatable) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                List<Point> list = this.points;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Line2(animatable, this, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(list, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
                Float drawLayer = getDrawLayer();
                Modifier modifierZIndex = ZIndexModifier2.zIndex(modifierMatchParentSize, drawLayer != null ? drawLayer.floatValue() : 3.0f);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.charts.model.Line$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Line.Content$lambda$8$lambda$7(animatable, this, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierZIndex, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(869171161);
                Modifier modifierMatchParentSize2 = boxScope.matchParentSize(Modifier.INSTANCE);
                Float drawLayer2 = getDrawLayer();
                Modifier modifierZIndex2 = ZIndexModifier2.zIndex(modifierMatchParentSize2, drawLayer2 != null ? drawLayer2.floatValue() : 3.0f);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.charts.model.Line$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Line.Content$lambda$10$lambda$9(this.f$0, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierZIndex2, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Line$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Line.Content$lambda$11(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$8$lambda$7(Animatable animatable, Line line, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) * ((Number) animatable.getValue()).floatValue();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L));
        int iM6700getIntersectrtfAjoo = ClipOp.INSTANCE.m6700getIntersectrtfAjoo();
        DrawContext drawContext = Canvas.getDrawContext();
        long jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6939clipRectN_I0leg(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, iM6700getIntersectrtfAjoo);
            line.m12072drawPathXOJAsU(Canvas, line.points, line.color, line.gradientColor, line.drawStyle);
            drawContext.getCanvas().restore();
            drawContext.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$10$lambda$9(Line line, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        line.m12072drawPathXOJAsU(Canvas, line.points, line.color, line.gradientColor, line.drawStyle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawPath-XO-JAsU, reason: not valid java name */
    public final void m12072drawPathXOJAsU(DrawScope drawScope, List<Point> list, long j, LinearGradientColor linearGradientColor, DrawScope2 drawScope2) {
        if (linearGradientColor != null) {
            DrawScope.m6954drawPathGBMwjPU$default(drawScope, Chart2.buildPath$default(drawScope, list, false, 2, null), linearGradientColor.getBrush(new Rect(this.left * Float.intBitsToFloat((int) (drawScope.mo6963getSizeNHjbRc() >> 32)), this.top * Float.intBitsToFloat((int) (drawScope.mo6963getSizeNHjbRc() & 4294967295L)), this.right * Float.intBitsToFloat((int) (drawScope.mo6963getSizeNHjbRc() >> 32)), this.bottom * Float.intBitsToFloat((int) (drawScope.mo6963getSizeNHjbRc() & 4294967295L)))), 0.0f, drawScope2, null, 0, 52, null);
        } else {
            DrawScope.m6955drawPathLG529CI$default(drawScope, Chart2.buildPath$default(drawScope, list, false, 2, null), j, 0.0f, drawScope2, null, 0, 52, null);
        }
    }
}

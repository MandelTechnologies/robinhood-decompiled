package com.robinhood.android.advisory.projection.chart;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Point;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChartComponents.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010)\u001a\u00020**\u00020+H\u0017¢\u0006\u0002\u0010,J\u001e\u0010-\u001a\u00020\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010/\u001a\u00020\u0007H\u0002J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u00103\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b4\u0010\u001cJ\u0010\u00105\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b6\u0010\u001cJ\t\u00107\u001a\u00020\rHÆ\u0003J\t\u00108\u001a\u00020\u000fHÆ\u0003J\u0010\u00109\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b:\u0010$J\u0010\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010'Jz\u0010<\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b=\u0010>J\u0013\u0010?\u001a\u00020\r2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\u000fHÖ\u0001J\t\u0010C\u001a\u00020DHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u00020\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u00020\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u00020\u0011¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/chart/GlowingDotFollowingLineAnnotation;", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "linePoints", "", "Lcom/robinhood/android/charts/model/Point;", "lineRevealAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "overrideCenter", "dotDiameter", "Landroidx/compose/ui/unit/Dp;", "glowDiameter", "enableHeartbeat", "", "heartbeatDuration", "", "dotColor", "Landroidx/compose/ui/graphics/Color;", "drawLayer", "<init>", "(Ljava/util/List;Landroidx/compose/animation/core/AnimationSpec;Lcom/robinhood/android/charts/model/Point;FFZIJLjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLinePoints", "()Ljava/util/List;", "getLineRevealAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getOverrideCenter", "()Lcom/robinhood/android/charts/model/Point;", "getDotDiameter-D9Ej5fM", "()F", "F", "getGlowDiameter-D9Ej5fM", "getEnableHeartbeat", "()Z", "getHeartbeatDuration", "()I", "getDotColor-0d7_KjU", "()J", "J", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "interpolateLineHead", "points", "fraction", "component1", "component2", "component3", "component4", "component4-D9Ej5fM", "component5", "component5-D9Ej5fM", "component6", "component7", "component8", "component8-0d7_KjU", "component9", "copy", "copy-MYwFc1s", "(Ljava/util/List;Landroidx/compose/animation/core/AnimationSpec;Lcom/robinhood/android/charts/model/Point;FFZIJLjava/lang/Float;)Lcom/robinhood/android/advisory/projection/chart/GlowingDotFollowingLineAnnotation;", "equals", "other", "", "hashCode", "toString", "", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class GlowingDotFollowingLineAnnotation implements ChartAnnotation {
    public static final int $stable = 8;
    private final long dotColor;
    private final float dotDiameter;
    private final Float drawLayer;
    private final boolean enableHeartbeat;
    private final float glowDiameter;
    private final int heartbeatDuration;
    private final List<Point> linePoints;
    private final AnimationSpec<Float> lineRevealAnimationSpec;
    private final Point overrideCenter;

    public /* synthetic */ GlowingDotFollowingLineAnnotation(List list, AnimationSpec animationSpec, Point point, float f, float f2, boolean z, int i, long j, Float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, animationSpec, point, f, f2, z, i, j, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$2(GlowingDotFollowingLineAnnotation glowingDotFollowingLineAnnotation, BoxScope boxScope, int i, Composer composer, int i2) {
        glowingDotFollowingLineAnnotation.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: copy-MYwFc1s$default, reason: not valid java name */
    public static /* synthetic */ GlowingDotFollowingLineAnnotation m11213copyMYwFc1s$default(GlowingDotFollowingLineAnnotation glowingDotFollowingLineAnnotation, List list, AnimationSpec animationSpec, Point point, float f, float f2, boolean z, int i, long j, Float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = glowingDotFollowingLineAnnotation.linePoints;
        }
        if ((i2 & 2) != 0) {
            animationSpec = glowingDotFollowingLineAnnotation.lineRevealAnimationSpec;
        }
        if ((i2 & 4) != 0) {
            point = glowingDotFollowingLineAnnotation.overrideCenter;
        }
        if ((i2 & 8) != 0) {
            f = glowingDotFollowingLineAnnotation.dotDiameter;
        }
        if ((i2 & 16) != 0) {
            f2 = glowingDotFollowingLineAnnotation.glowDiameter;
        }
        if ((i2 & 32) != 0) {
            z = glowingDotFollowingLineAnnotation.enableHeartbeat;
        }
        if ((i2 & 64) != 0) {
            i = glowingDotFollowingLineAnnotation.heartbeatDuration;
        }
        if ((i2 & 128) != 0) {
            j = glowingDotFollowingLineAnnotation.dotColor;
        }
        if ((i2 & 256) != 0) {
            f3 = glowingDotFollowingLineAnnotation.drawLayer;
        }
        Float f4 = f3;
        long j2 = j;
        boolean z2 = z;
        int i3 = i;
        float f5 = f2;
        Point point2 = point;
        return glowingDotFollowingLineAnnotation.m11217copyMYwFc1s(list, animationSpec, point2, f, f5, z2, i3, j2, f4);
    }

    public final List<Point> component1() {
        return this.linePoints;
    }

    public final AnimationSpec<Float> component2() {
        return this.lineRevealAnimationSpec;
    }

    /* renamed from: component3, reason: from getter */
    public final Point getOverrideCenter() {
        return this.overrideCenter;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getDotDiameter() {
        return this.dotDiameter;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getGlowDiameter() {
        return this.glowDiameter;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEnableHeartbeat() {
        return this.enableHeartbeat;
    }

    /* renamed from: component7, reason: from getter */
    public final int getHeartbeatDuration() {
        return this.heartbeatDuration;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getDotColor() {
        return this.dotColor;
    }

    /* renamed from: component9, reason: from getter */
    public final Float getDrawLayer() {
        return this.drawLayer;
    }

    /* renamed from: copy-MYwFc1s, reason: not valid java name */
    public final GlowingDotFollowingLineAnnotation m11217copyMYwFc1s(List<Point> linePoints, AnimationSpec<Float> lineRevealAnimationSpec, Point overrideCenter, float dotDiameter, float glowDiameter, boolean enableHeartbeat, int heartbeatDuration, long dotColor, Float drawLayer) {
        Intrinsics.checkNotNullParameter(linePoints, "linePoints");
        Intrinsics.checkNotNullParameter(lineRevealAnimationSpec, "lineRevealAnimationSpec");
        return new GlowingDotFollowingLineAnnotation(linePoints, lineRevealAnimationSpec, overrideCenter, dotDiameter, glowDiameter, enableHeartbeat, heartbeatDuration, dotColor, drawLayer, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlowingDotFollowingLineAnnotation)) {
            return false;
        }
        GlowingDotFollowingLineAnnotation glowingDotFollowingLineAnnotation = (GlowingDotFollowingLineAnnotation) other;
        return Intrinsics.areEqual(this.linePoints, glowingDotFollowingLineAnnotation.linePoints) && Intrinsics.areEqual(this.lineRevealAnimationSpec, glowingDotFollowingLineAnnotation.lineRevealAnimationSpec) && Intrinsics.areEqual(this.overrideCenter, glowingDotFollowingLineAnnotation.overrideCenter) && C2002Dp.m7997equalsimpl0(this.dotDiameter, glowingDotFollowingLineAnnotation.dotDiameter) && C2002Dp.m7997equalsimpl0(this.glowDiameter, glowingDotFollowingLineAnnotation.glowDiameter) && this.enableHeartbeat == glowingDotFollowingLineAnnotation.enableHeartbeat && this.heartbeatDuration == glowingDotFollowingLineAnnotation.heartbeatDuration && Color.m6707equalsimpl0(this.dotColor, glowingDotFollowingLineAnnotation.dotColor) && Intrinsics.areEqual((Object) this.drawLayer, (Object) glowingDotFollowingLineAnnotation.drawLayer);
    }

    public int hashCode() {
        int iHashCode = ((this.linePoints.hashCode() * 31) + this.lineRevealAnimationSpec.hashCode()) * 31;
        Point point = this.overrideCenter;
        int iHashCode2 = (((((((((((iHashCode + (point == null ? 0 : point.hashCode())) * 31) + C2002Dp.m7998hashCodeimpl(this.dotDiameter)) * 31) + C2002Dp.m7998hashCodeimpl(this.glowDiameter)) * 31) + Boolean.hashCode(this.enableHeartbeat)) * 31) + Integer.hashCode(this.heartbeatDuration)) * 31) + Color.m6713hashCodeimpl(this.dotColor)) * 31;
        Float f = this.drawLayer;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        return "GlowingDotFollowingLineAnnotation(linePoints=" + this.linePoints + ", lineRevealAnimationSpec=" + this.lineRevealAnimationSpec + ", overrideCenter=" + this.overrideCenter + ", dotDiameter=" + C2002Dp.m7999toStringimpl(this.dotDiameter) + ", glowDiameter=" + C2002Dp.m7999toStringimpl(this.glowDiameter) + ", enableHeartbeat=" + this.enableHeartbeat + ", heartbeatDuration=" + this.heartbeatDuration + ", dotColor=" + Color.m6714toStringimpl(this.dotColor) + ", drawLayer=" + this.drawLayer + ")";
    }

    private GlowingDotFollowingLineAnnotation(List<Point> linePoints, AnimationSpec<Float> lineRevealAnimationSpec, Point point, float f, float f2, boolean z, int i, long j, Float f3) {
        Intrinsics.checkNotNullParameter(linePoints, "linePoints");
        Intrinsics.checkNotNullParameter(lineRevealAnimationSpec, "lineRevealAnimationSpec");
        this.linePoints = linePoints;
        this.lineRevealAnimationSpec = lineRevealAnimationSpec;
        this.overrideCenter = point;
        this.dotDiameter = f;
        this.glowDiameter = f2;
        this.enableHeartbeat = z;
        this.heartbeatDuration = i;
        this.dotColor = j;
        this.drawLayer = f3;
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
        ChartAnnotation.DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
    }

    public /* synthetic */ GlowingDotFollowingLineAnnotation(List list, AnimationSpec animationSpec, Point point, float f, float f2, boolean z, int i, long j, Float f3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? AnimationSpecKt.tween$default(3000, 0, null, 6, null) : animationSpec, (i2 & 4) != 0 ? null : point, (i2 & 8) != 0 ? C2002Dp.m7995constructorimpl(7) : f, (i2 & 16) != 0 ? C2002Dp.m7995constructorimpl(36) : f2, (i2 & 32) == 0 ? z : false, (i2 & 64) != 0 ? 1200 : i, j, (i2 & 256) != 0 ? null : f3, null);
    }

    public final List<Point> getLinePoints() {
        return this.linePoints;
    }

    public final AnimationSpec<Float> getLineRevealAnimationSpec() {
        return this.lineRevealAnimationSpec;
    }

    public final Point getOverrideCenter() {
        return this.overrideCenter;
    }

    /* renamed from: getDotDiameter-D9Ej5fM, reason: not valid java name */
    public final float m11219getDotDiameterD9Ej5fM() {
        return this.dotDiameter;
    }

    /* renamed from: getGlowDiameter-D9Ej5fM, reason: not valid java name */
    public final float m11220getGlowDiameterD9Ej5fM() {
        return this.glowDiameter;
    }

    public final boolean getEnableHeartbeat() {
        return this.enableHeartbeat;
    }

    public final int getHeartbeatDuration() {
        return this.heartbeatDuration;
    }

    /* renamed from: getDotColor-0d7_KjU, reason: not valid java name */
    public final long m11218getDotColor0d7_KjU() {
        return this.dotColor;
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public Float getDrawLayer() {
        return this.drawLayer;
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public void Content(final BoxScope boxScope, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1413056952);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1413056952, i2, -1, "com.robinhood.android.advisory.projection.chart.GlowingDotFollowingLineAnnotation.Content (ChartComponents.kt:491)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Animatable animatable = (Animatable) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            List<Point> list = this.linePoints;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new GlowingDotFollowingLineAnnotation$Content$1$1(animatable, this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(list, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            float fFloatValue = ((Number) animatable.getValue()).floatValue();
            Point pointInterpolateLineHead = this.overrideCenter;
            if (pointInterpolateLineHead == null) {
                pointInterpolateLineHead = interpolateLineHead(this.linePoints, fFloatValue);
            }
            ChartComponentsKt.m11208GlowingDotNRI76As(pointInterpolateLineHead, boxScope.matchParentSize(Modifier.INSTANCE), this.dotColor, this.dotDiameter, this.glowDiameter, this.enableHeartbeat, this.heartbeatDuration, composerStartRestartGroup, Point.$stable, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.chart.GlowingDotFollowingLineAnnotation$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GlowingDotFollowingLineAnnotation.Content$lambda$2(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final Point interpolateLineHead(List<Point> points, float fraction) {
        if (points.isEmpty()) {
            return new Point(0.0f, 0.0f);
        }
        int i = 0;
        if (points.size() == 1) {
            return points.get(0);
        }
        if (fraction <= ((Point) CollectionsKt.first((List) points)).getX()) {
            return (Point) CollectionsKt.first((List) points);
        }
        if (fraction >= ((Point) CollectionsKt.last((List) points)).getX()) {
            return (Point) CollectionsKt.last((List) points);
        }
        int size = points.size() - 1;
        while (i < size) {
            Point point = points.get(i);
            i++;
            Point point2 = points.get(i);
            float x = point.getX();
            if (fraction <= point2.getX() && x <= fraction) {
                return new Point(fraction, point.getY() + (((fraction - point.getX()) / (point2.getX() - point.getX())) * (point2.getY() - point.getY())));
            }
        }
        return (Point) CollectionsKt.last((List) points);
    }
}

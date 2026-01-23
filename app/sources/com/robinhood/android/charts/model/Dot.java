package com.robinhood.android.charts.model;

import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.charts.RectExtensions;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Dot.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Dot;", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "point", "Lcom/robinhood/android/charts/model/Point;", "radius", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "drawLayer", "<init>", "(Lcom/robinhood/android/charts/model/Point;FJLjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPoint", "()Lcom/robinhood/android/charts/model/Point;", "getRadius", "()F", "getColor-0d7_KjU", "()J", "J", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "component3", "component3-0d7_KjU", "component4", "copy", "copy-9LQNqLg", "(Lcom/robinhood/android/charts/model/Point;FJLjava/lang/Float;)Lcom/robinhood/android/charts/model/Dot;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class Dot implements ChartAnnotation {
    public static final int $stable = 0;
    private final long color;
    private final Float drawLayer;
    private final Point point;
    private final float radius;

    public /* synthetic */ Dot(Point point, float f, long j, Float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(point, f, j, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$3(Dot dot, BoxScope boxScope, int i, Composer composer, int i2) {
        dot.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: copy-9LQNqLg$default, reason: not valid java name */
    public static /* synthetic */ Dot m12010copy9LQNqLg$default(Dot dot, Point point, float f, long j, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            point = dot.point;
        }
        if ((i & 2) != 0) {
            f = dot.radius;
        }
        if ((i & 4) != 0) {
            j = dot.color;
        }
        if ((i & 8) != 0) {
            f2 = dot.drawLayer;
        }
        Float f3 = f2;
        return dot.m12012copy9LQNqLg(point, f, j, f3);
    }

    /* renamed from: component1, reason: from getter */
    public final Point getPoint() {
        return this.point;
    }

    /* renamed from: component2, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: component4, reason: from getter */
    public final Float getDrawLayer() {
        return this.drawLayer;
    }

    /* renamed from: copy-9LQNqLg, reason: not valid java name */
    public final Dot m12012copy9LQNqLg(Point point, float radius, long color, Float drawLayer) {
        Intrinsics.checkNotNullParameter(point, "point");
        return new Dot(point, radius, color, drawLayer, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Dot)) {
            return false;
        }
        Dot dot = (Dot) other;
        return Intrinsics.areEqual(this.point, dot.point) && Float.compare(this.radius, dot.radius) == 0 && Color.m6707equalsimpl0(this.color, dot.color) && Intrinsics.areEqual((Object) this.drawLayer, (Object) dot.drawLayer);
    }

    public int hashCode() {
        int iHashCode = ((((this.point.hashCode() * 31) + Float.hashCode(this.radius)) * 31) + Color.m6713hashCodeimpl(this.color)) * 31;
        Float f = this.drawLayer;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }

    public String toString() {
        return "Dot(point=" + this.point + ", radius=" + this.radius + ", color=" + Color.m6714toStringimpl(this.color) + ", drawLayer=" + this.drawLayer + ")";
    }

    private Dot(Point point, float f, long j, Float f2) {
        Intrinsics.checkNotNullParameter(point, "point");
        this.point = point;
        this.radius = f;
        this.color = j;
        this.drawLayer = f2;
    }

    public /* synthetic */ Dot(Point point, float f, long j, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(point, (i & 2) != 0 ? 2.0f : f, j, (i & 8) != 0 ? null : f2, null);
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
        ChartAnnotation.DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
    }

    public final Point getPoint() {
        return this.point;
    }

    public final float getRadius() {
        return this.radius;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m12013getColor0d7_KjU() {
        return this.color;
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public Float getDrawLayer() {
        return this.drawLayer;
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public void Content(final BoxScope boxScope, Composer composer, final int i) {
        int i2;
        Modifier modifierZIndex;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1368399208);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1368399208, i2, -1, "com.robinhood.android.charts.model.Dot.Content (Dot.kt:20)");
            }
            Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
            Float drawLayer = getDrawLayer();
            if (drawLayer != null && (modifierZIndex = ZIndexModifier2.zIndex(modifierMatchParentSize, drawLayer.floatValue())) != null) {
                modifierMatchParentSize = modifierZIndex;
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.model.Dot$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Dot.Content$lambda$2$lambda$1(this.f$0, (DrawScope) obj);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Dot$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Dot.Content$lambda$3(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$2$lambda$1(Dot dot, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, dot.color, dot.radius, RectExtensions.getTranslation(SizeKt.m6592toRectuvyYCjk(Canvas.mo6963getSizeNHjbRc()), dot.point), 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }
}

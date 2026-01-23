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

/* compiled from: Bar.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0017¢\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0011J\t\u0010 \u001a\u00020\bHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016JD\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Bar;", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "topLeft", "Lcom/robinhood/android/charts/model/Point;", "bottomRight", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawLayer", "", "<init>", "(Lcom/robinhood/android/charts/model/Point;Lcom/robinhood/android/charts/model/Point;JLandroidx/compose/ui/graphics/drawscope/DrawStyle;Ljava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTopLeft", "()Lcom/robinhood/android/charts/model/Point;", "getBottomRight", "getColor-0d7_KjU", "()J", "J", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "component3", "component3-0d7_KjU", "component4", "component5", "copy", "copy-XO-JAsU", "(Lcom/robinhood/android/charts/model/Point;Lcom/robinhood/android/charts/model/Point;JLandroidx/compose/ui/graphics/drawscope/DrawStyle;Ljava/lang/Float;)Lcom/robinhood/android/charts/model/Bar;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class Bar implements ChartAnnotation {
    public static final int $stable = 8;
    private final Point bottomRight;
    private final long color;
    private final Float drawLayer;
    private final DrawScope2 drawStyle;
    private final Point topLeft;

    public /* synthetic */ Bar(Point point, Point point2, long j, DrawScope2 drawScope2, Float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(point, point2, j, drawScope2, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$3(Bar bar, BoxScope boxScope, int i, Composer composer, int i2) {
        bar.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: copy-XO-JAsU$default, reason: not valid java name */
    public static /* synthetic */ Bar m12005copyXOJAsU$default(Bar bar, Point point, Point point2, long j, DrawScope2 drawScope2, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            point = bar.topLeft;
        }
        if ((i & 2) != 0) {
            point2 = bar.bottomRight;
        }
        if ((i & 4) != 0) {
            j = bar.color;
        }
        if ((i & 8) != 0) {
            drawScope2 = bar.drawStyle;
        }
        if ((i & 16) != 0) {
            f = bar.drawLayer;
        }
        long j2 = j;
        return bar.m12007copyXOJAsU(point, point2, j2, drawScope2, f);
    }

    /* renamed from: component1, reason: from getter */
    public final Point getTopLeft() {
        return this.topLeft;
    }

    /* renamed from: component2, reason: from getter */
    public final Point getBottomRight() {
        return this.bottomRight;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: component4, reason: from getter */
    public final DrawScope2 getDrawStyle() {
        return this.drawStyle;
    }

    /* renamed from: component5, reason: from getter */
    public final Float getDrawLayer() {
        return this.drawLayer;
    }

    /* renamed from: copy-XO-JAsU, reason: not valid java name */
    public final Bar m12007copyXOJAsU(Point topLeft, Point bottomRight, long color, DrawScope2 drawStyle, Float drawLayer) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        Intrinsics.checkNotNullParameter(drawStyle, "drawStyle");
        return new Bar(topLeft, bottomRight, color, drawStyle, drawLayer, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bar)) {
            return false;
        }
        Bar bar = (Bar) other;
        return Intrinsics.areEqual(this.topLeft, bar.topLeft) && Intrinsics.areEqual(this.bottomRight, bar.bottomRight) && Color.m6707equalsimpl0(this.color, bar.color) && Intrinsics.areEqual(this.drawStyle, bar.drawStyle) && Intrinsics.areEqual((Object) this.drawLayer, (Object) bar.drawLayer);
    }

    public int hashCode() {
        int iHashCode = ((((((this.topLeft.hashCode() * 31) + this.bottomRight.hashCode()) * 31) + Color.m6713hashCodeimpl(this.color)) * 31) + this.drawStyle.hashCode()) * 31;
        Float f = this.drawLayer;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }

    public String toString() {
        return "Bar(topLeft=" + this.topLeft + ", bottomRight=" + this.bottomRight + ", color=" + Color.m6714toStringimpl(this.color) + ", drawStyle=" + this.drawStyle + ", drawLayer=" + this.drawLayer + ")";
    }

    private Bar(Point topLeft, Point bottomRight, long j, DrawScope2 drawStyle, Float f) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        Intrinsics.checkNotNullParameter(drawStyle, "drawStyle");
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.color = j;
        this.drawStyle = drawStyle;
        this.drawLayer = f;
    }

    public /* synthetic */ Bar(Point point, Point point2, long j, DrawScope2 drawScope2, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(point, point2, j, drawScope2, (i & 16) != 0 ? null : f, null);
    }

    @Override // com.robinhood.android.charts.model.ChartAnnotation
    public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
        ChartAnnotation.DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
    }

    public final Point getTopLeft() {
        return this.topLeft;
    }

    public final Point getBottomRight() {
        return this.bottomRight;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m12008getColor0d7_KjU() {
        return this.color;
    }

    public final DrawScope2 getDrawStyle() {
        return this.drawStyle;
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
        Composer composerStartRestartGroup = composer.startRestartGroup(1629624452);
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
                ComposerKt.traceEventStart(1629624452, i2, -1, "com.robinhood.android.charts.model.Bar.Content (Bar.kt:23)");
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
                objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.model.Bar$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Bar.Content$lambda$2$lambda$1(this.f$0, (DrawScope) obj);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Bar$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Bar.Content$lambda$3(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$2$lambda$1(Bar bar, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Rect rectM6592toRectuvyYCjk = SizeKt.m6592toRectuvyYCjk(Canvas.mo6963getSizeNHjbRc());
        DrawScope.m6958drawRectnJ9OG0$default(Canvas, bar.color, RectExtensions.getTranslation(rectM6592toRectuvyYCjk, bar.topLeft), RectExtensions.getTranslatedSize(rectM6592toRectuvyYCjk, bar.topLeft, bar.bottomRight), 0.0f, bar.drawStyle, null, 0, 104, null);
        return Unit.INSTANCE;
    }
}

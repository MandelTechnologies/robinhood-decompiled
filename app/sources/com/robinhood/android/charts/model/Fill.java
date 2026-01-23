package com.robinhood.android.charts.model;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.draw.Blur;
import androidx.compose.p011ui.draw.Blur3;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p011ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.p011ui.graphics.ImageBitmap3;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.Shader;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.TileMode;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.charts.Chart2;
import com.robinhood.android.charts.RectExtensions;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Fill;
import com.robinhood.android.charts.model.GradientChartFillStyle;
import com.robinhood.android.charts.model.ProtoGradientChartFillStyle;
import com.robinhood.models.serverdriven.experimental.api.CornerRadiusInfo;
import com.robinhood.models.serverdriven.experimental.api.GradientStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.CornerRadiusInfoDto;
import rh_server_driven_ui.p531v1.GradientStyleDto;

/* compiled from: Fill.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Fill;", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "DotFill", "DottedFill", "SolidFill", "RoundedSolidFill", "ProtoRoundedSolidFill", "GradientFill", "ProtoGradientFill", "RadialGradientFill", "GradientAnimationFill", "ProtoGradientAnimationFill", "Lcom/robinhood/android/charts/model/Fill$DotFill;", "Lcom/robinhood/android/charts/model/Fill$DottedFill;", "Lcom/robinhood/android/charts/model/Fill$GradientAnimationFill;", "Lcom/robinhood/android/charts/model/Fill$GradientFill;", "Lcom/robinhood/android/charts/model/Fill$ProtoGradientAnimationFill;", "Lcom/robinhood/android/charts/model/Fill$ProtoGradientFill;", "Lcom/robinhood/android/charts/model/Fill$ProtoRoundedSolidFill;", "Lcom/robinhood/android/charts/model/Fill$RadialGradientFill;", "Lcom/robinhood/android/charts/model/Fill$RoundedSolidFill;", "Lcom/robinhood/android/charts/model/Fill$SolidFill;", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface Fill extends ChartAnnotation {

    /* compiled from: Fill.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void BoxScopeContent(Fill fill, BoxScope boxScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "boxScope");
            ChartAnnotation.DefaultImpls.BoxScopeContent(fill, boxScope, composer, i);
        }
    }

    /* compiled from: Fill.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0017¢\u0006\u0002\u0010\u001bJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0010J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016JJ\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Fill$DotFill;", "Lcom/robinhood/android/charts/model/Fill;", "points", "", "Lcom/robinhood/android/charts/model/Point;", "dotColor", "Landroidx/compose/ui/graphics/Color;", "dotRadius", "", "opacity", "drawLayer", "<init>", "(Ljava/util/List;JFFLjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPoints", "()Ljava/util/List;", "getDotColor-0d7_KjU", "()J", "J", "getDotRadius", "()F", "getOpacity", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "component2-0d7_KjU", "component3", "component4", "component5", "copy", "copy-iJQMabo", "(Ljava/util/List;JFFLjava/lang/Float;)Lcom/robinhood/android/charts/model/Fill$DotFill;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class DotFill implements Fill {
        public static final int $stable = 8;
        private final long dotColor;
        private final float dotRadius;
        private final Float drawLayer;
        private final float opacity;
        private final List<Point> points;

        public /* synthetic */ DotFill(List list, long j, float f, float f2, Float f3, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j, f, f2, f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$3(DotFill dotFill, BoxScope boxScope, int i, Composer composer, int i2) {
            dotFill.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
            return Unit.INSTANCE;
        }

        /* renamed from: copy-iJQMabo$default, reason: not valid java name */
        public static /* synthetic */ DotFill m12014copyiJQMabo$default(DotFill dotFill, List list, long j, float f, float f2, Float f3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = dotFill.points;
            }
            if ((i & 2) != 0) {
                j = dotFill.dotColor;
            }
            if ((i & 4) != 0) {
                f = dotFill.dotRadius;
            }
            if ((i & 8) != 0) {
                f2 = dotFill.opacity;
            }
            if ((i & 16) != 0) {
                f3 = dotFill.drawLayer;
            }
            Float f4 = f3;
            float f5 = f;
            return dotFill.m12016copyiJQMabo(list, j, f5, f2, f4);
        }

        public final List<Point> component1() {
            return this.points;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getDotColor() {
            return this.dotColor;
        }

        /* renamed from: component3, reason: from getter */
        public final float getDotRadius() {
            return this.dotRadius;
        }

        /* renamed from: component4, reason: from getter */
        public final float getOpacity() {
            return this.opacity;
        }

        /* renamed from: component5, reason: from getter */
        public final Float getDrawLayer() {
            return this.drawLayer;
        }

        /* renamed from: copy-iJQMabo, reason: not valid java name */
        public final DotFill m12016copyiJQMabo(List<Point> points, long dotColor, float dotRadius, float opacity, Float drawLayer) {
            Intrinsics.checkNotNullParameter(points, "points");
            return new DotFill(points, dotColor, dotRadius, opacity, drawLayer, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DotFill)) {
                return false;
            }
            DotFill dotFill = (DotFill) other;
            return Intrinsics.areEqual(this.points, dotFill.points) && Color.m6707equalsimpl0(this.dotColor, dotFill.dotColor) && Float.compare(this.dotRadius, dotFill.dotRadius) == 0 && Float.compare(this.opacity, dotFill.opacity) == 0 && Intrinsics.areEqual((Object) this.drawLayer, (Object) dotFill.drawLayer);
        }

        public int hashCode() {
            int iHashCode = ((((((this.points.hashCode() * 31) + Color.m6713hashCodeimpl(this.dotColor)) * 31) + Float.hashCode(this.dotRadius)) * 31) + Float.hashCode(this.opacity)) * 31;
            Float f = this.drawLayer;
            return iHashCode + (f == null ? 0 : f.hashCode());
        }

        public String toString() {
            return "DotFill(points=" + this.points + ", dotColor=" + Color.m6714toStringimpl(this.dotColor) + ", dotRadius=" + this.dotRadius + ", opacity=" + this.opacity + ", drawLayer=" + this.drawLayer + ")";
        }

        private DotFill(List<Point> points, long j, float f, float f2, Float f3) {
            Intrinsics.checkNotNullParameter(points, "points");
            this.points = points;
            this.dotColor = j;
            this.dotRadius = f;
            this.opacity = f2;
            this.drawLayer = f3;
        }

        public /* synthetic */ DotFill(List list, long j, float f, float f2, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j, f, f2, (i & 16) != 0 ? null : f3, null);
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
            DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
        }

        public final List<Point> getPoints() {
            return this.points;
        }

        /* renamed from: getDotColor-0d7_KjU, reason: not valid java name */
        public final long m12017getDotColor0d7_KjU() {
            return this.dotColor;
        }

        public final float getDotRadius() {
            return this.dotRadius;
        }

        public final float getOpacity() {
            return this.opacity;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public Float getDrawLayer() {
            return this.drawLayer;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void Content(final BoxScope boxScope, Composer composer, final int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Composer composerStartRestartGroup = composer.startRestartGroup(1238439734);
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
                    ComposerKt.traceEventStart(1238439734, i2, -1, "com.robinhood.android.charts.model.Fill.DotFill.Content (Fill.kt:65)");
                }
                Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
                Float drawLayer = getDrawLayer();
                Modifier modifierZIndex = ZIndexModifier2.zIndex(modifierMatchParentSize, drawLayer != null ? drawLayer.floatValue() : 2.0f);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.model.Fill$DotFill$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Fill.DotFill.Content$lambda$2$lambda$1(this.f$0, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierZIndex, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Fill$DotFill$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Fill.DotFill.Content$lambda$3(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$2$lambda$1(DotFill dotFill, DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            Rect rectM6592toRectuvyYCjk = SizeKt.m6592toRectuvyYCjk(Canvas.mo6963getSizeNHjbRc());
            for (Point point : dotFill.points) {
                long j = dotFill.dotColor;
                float f = dotFill.dotRadius;
                float horizontalTranslation = RectExtensions.getHorizontalTranslation(rectM6592toRectuvyYCjk, point.getX());
                float verticalTranslation = RectExtensions.getVerticalTranslation(rectM6592toRectuvyYCjk, point.getY());
                DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j, f, Offset.m6535constructorimpl((Float.floatToRawIntBits(horizontalTranslation) << 32) | (Float.floatToRawIntBits(verticalTranslation) & 4294967295L)), dotFill.opacity, null, null, 0, 112, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Fill.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010*\u001a\u00020+*\u00020,H\u0017¢\u0006\u0002\u0010-J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\u0010\u00104\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b5\u0010\"J\t\u00106\u001a\u00020\rHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010(J\u0080\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b:\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u00020\u000f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(¨\u0006C²\u0006\n\u0010D\u001a\u00020EX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Fill$GradientAnimationFill;", "Lcom/robinhood/android/charts/model/Fill;", "id", "", "points", "", "Lcom/robinhood/android/charts/model/Point;", "gradientStyle", "Lcom/robinhood/models/serverdriven/experimental/api/GradientStyle;", "beforePivotGradient", "Lcom/robinhood/android/charts/model/GradientChartFillStyle;", "afterPivotGradient", "speed", "", "baseColor", "Landroidx/compose/ui/graphics/Color;", "baseColorOpacity", "cornerRadiusInfo", "Lcom/robinhood/models/serverdriven/experimental/api/CornerRadiusInfo;", "drawLayer", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/GradientStyle;Lcom/robinhood/android/charts/model/GradientChartFillStyle;Lcom/robinhood/android/charts/model/GradientChartFillStyle;FJFLcom/robinhood/models/serverdriven/experimental/api/CornerRadiusInfo;Ljava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getPoints", "()Ljava/util/List;", "getGradientStyle", "()Lcom/robinhood/models/serverdriven/experimental/api/GradientStyle;", "getBeforePivotGradient", "()Lcom/robinhood/android/charts/model/GradientChartFillStyle;", "getAfterPivotGradient", "getSpeed", "()F", "getBaseColor-0d7_KjU", "()J", "J", "getBaseColorOpacity", "getCornerRadiusInfo", "()Lcom/robinhood/models/serverdriven/experimental/api/CornerRadiusInfo;", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component7-0d7_KjU", "component8", "component9", "component10", "copy", "copy-RFMEUTM", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/GradientStyle;Lcom/robinhood/android/charts/model/GradientChartFillStyle;Lcom/robinhood/android/charts/model/GradientChartFillStyle;FJFLcom/robinhood/models/serverdriven/experimental/api/CornerRadiusInfo;Ljava/lang/Float;)Lcom/robinhood/android/charts/model/Fill$GradientAnimationFill;", "equals", "", "other", "", "hashCode", "", "toString", "lib-charts_externalDebug", "brush", "Landroidx/compose/ui/graphics/Brush;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class GradientAnimationFill implements Fill {
        public static final int $stable = 8;
        private final GradientChartFillStyle afterPivotGradient;
        private final long baseColor;
        private final float baseColorOpacity;
        private final GradientChartFillStyle beforePivotGradient;
        private final CornerRadiusInfo cornerRadiusInfo;
        private final Float drawLayer;
        private final GradientStyle gradientStyle;
        private final String id;
        private final List<Point> points;
        private final float speed;

        public /* synthetic */ GradientAnimationFill(String str, List list, GradientStyle gradientStyle, GradientChartFillStyle gradientChartFillStyle, GradientChartFillStyle gradientChartFillStyle2, float f, long j, float f2, CornerRadiusInfo cornerRadiusInfo, Float f3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, gradientStyle, gradientChartFillStyle, gradientChartFillStyle2, f, j, f2, cornerRadiusInfo, f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$7(GradientAnimationFill gradientAnimationFill, BoxScope boxScope, int i, Composer composer, int i2) {
            gradientAnimationFill.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
            return Unit.INSTANCE;
        }

        /* renamed from: copy-RFMEUTM$default, reason: not valid java name */
        public static /* synthetic */ GradientAnimationFill m12028copyRFMEUTM$default(GradientAnimationFill gradientAnimationFill, String str, List list, GradientStyle gradientStyle, GradientChartFillStyle gradientChartFillStyle, GradientChartFillStyle gradientChartFillStyle2, float f, long j, float f2, CornerRadiusInfo cornerRadiusInfo, Float f3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gradientAnimationFill.id;
            }
            if ((i & 2) != 0) {
                list = gradientAnimationFill.points;
            }
            if ((i & 4) != 0) {
                gradientStyle = gradientAnimationFill.gradientStyle;
            }
            if ((i & 8) != 0) {
                gradientChartFillStyle = gradientAnimationFill.beforePivotGradient;
            }
            if ((i & 16) != 0) {
                gradientChartFillStyle2 = gradientAnimationFill.afterPivotGradient;
            }
            if ((i & 32) != 0) {
                f = gradientAnimationFill.speed;
            }
            if ((i & 64) != 0) {
                j = gradientAnimationFill.baseColor;
            }
            if ((i & 128) != 0) {
                f2 = gradientAnimationFill.baseColorOpacity;
            }
            if ((i & 256) != 0) {
                cornerRadiusInfo = gradientAnimationFill.cornerRadiusInfo;
            }
            if ((i & 512) != 0) {
                f3 = gradientAnimationFill.drawLayer;
            }
            Float f4 = f3;
            float f5 = f2;
            long j2 = j;
            GradientChartFillStyle gradientChartFillStyle3 = gradientChartFillStyle2;
            float f6 = f;
            GradientStyle gradientStyle2 = gradientStyle;
            GradientChartFillStyle gradientChartFillStyle4 = gradientChartFillStyle;
            return gradientAnimationFill.m12030copyRFMEUTM(str, list, gradientStyle2, gradientChartFillStyle4, gradientChartFillStyle3, f6, j2, f5, cornerRadiusInfo, f4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final Float getDrawLayer() {
            return this.drawLayer;
        }

        public final List<Point> component2() {
            return this.points;
        }

        /* renamed from: component3, reason: from getter */
        public final GradientStyle getGradientStyle() {
            return this.gradientStyle;
        }

        /* renamed from: component4, reason: from getter */
        public final GradientChartFillStyle getBeforePivotGradient() {
            return this.beforePivotGradient;
        }

        /* renamed from: component5, reason: from getter */
        public final GradientChartFillStyle getAfterPivotGradient() {
            return this.afterPivotGradient;
        }

        /* renamed from: component6, reason: from getter */
        public final float getSpeed() {
            return this.speed;
        }

        /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
        public final long getBaseColor() {
            return this.baseColor;
        }

        /* renamed from: component8, reason: from getter */
        public final float getBaseColorOpacity() {
            return this.baseColorOpacity;
        }

        /* renamed from: component9, reason: from getter */
        public final CornerRadiusInfo getCornerRadiusInfo() {
            return this.cornerRadiusInfo;
        }

        /* renamed from: copy-RFMEUTM, reason: not valid java name */
        public final GradientAnimationFill m12030copyRFMEUTM(String id, List<Point> points, GradientStyle gradientStyle, GradientChartFillStyle beforePivotGradient, GradientChartFillStyle afterPivotGradient, float speed, long baseColor, float baseColorOpacity, CornerRadiusInfo cornerRadiusInfo, Float drawLayer) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(gradientStyle, "gradientStyle");
            Intrinsics.checkNotNullParameter(beforePivotGradient, "beforePivotGradient");
            Intrinsics.checkNotNullParameter(afterPivotGradient, "afterPivotGradient");
            return new GradientAnimationFill(id, points, gradientStyle, beforePivotGradient, afterPivotGradient, speed, baseColor, baseColorOpacity, cornerRadiusInfo, drawLayer, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GradientAnimationFill)) {
                return false;
            }
            GradientAnimationFill gradientAnimationFill = (GradientAnimationFill) other;
            return Intrinsics.areEqual(this.id, gradientAnimationFill.id) && Intrinsics.areEqual(this.points, gradientAnimationFill.points) && this.gradientStyle == gradientAnimationFill.gradientStyle && Intrinsics.areEqual(this.beforePivotGradient, gradientAnimationFill.beforePivotGradient) && Intrinsics.areEqual(this.afterPivotGradient, gradientAnimationFill.afterPivotGradient) && Float.compare(this.speed, gradientAnimationFill.speed) == 0 && Color.m6707equalsimpl0(this.baseColor, gradientAnimationFill.baseColor) && Float.compare(this.baseColorOpacity, gradientAnimationFill.baseColorOpacity) == 0 && Intrinsics.areEqual(this.cornerRadiusInfo, gradientAnimationFill.cornerRadiusInfo) && Intrinsics.areEqual((Object) this.drawLayer, (Object) gradientAnimationFill.drawLayer);
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.points.hashCode()) * 31) + this.gradientStyle.hashCode()) * 31) + this.beforePivotGradient.hashCode()) * 31) + this.afterPivotGradient.hashCode()) * 31) + Float.hashCode(this.speed)) * 31) + Color.m6713hashCodeimpl(this.baseColor)) * 31) + Float.hashCode(this.baseColorOpacity)) * 31;
            CornerRadiusInfo cornerRadiusInfo = this.cornerRadiusInfo;
            int iHashCode2 = (iHashCode + (cornerRadiusInfo == null ? 0 : cornerRadiusInfo.hashCode())) * 31;
            Float f = this.drawLayer;
            return iHashCode2 + (f != null ? f.hashCode() : 0);
        }

        public String toString() {
            return "GradientAnimationFill(id=" + this.id + ", points=" + this.points + ", gradientStyle=" + this.gradientStyle + ", beforePivotGradient=" + this.beforePivotGradient + ", afterPivotGradient=" + this.afterPivotGradient + ", speed=" + this.speed + ", baseColor=" + Color.m6714toStringimpl(this.baseColor) + ", baseColorOpacity=" + this.baseColorOpacity + ", cornerRadiusInfo=" + this.cornerRadiusInfo + ", drawLayer=" + this.drawLayer + ")";
        }

        private static final Brush Content$lambda$2(SnapshotState<Brush> snapshotState) {
            return snapshotState.getValue();
        }

        private GradientAnimationFill(String str, List<Point> points, GradientStyle gradientStyle, GradientChartFillStyle beforePivotGradient, GradientChartFillStyle afterPivotGradient, float f, long j, float f2, CornerRadiusInfo cornerRadiusInfo, Float f3) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(gradientStyle, "gradientStyle");
            Intrinsics.checkNotNullParameter(beforePivotGradient, "beforePivotGradient");
            Intrinsics.checkNotNullParameter(afterPivotGradient, "afterPivotGradient");
            this.id = str;
            this.points = points;
            this.gradientStyle = gradientStyle;
            this.beforePivotGradient = beforePivotGradient;
            this.afterPivotGradient = afterPivotGradient;
            this.speed = f;
            this.baseColor = j;
            this.baseColorOpacity = f2;
            this.cornerRadiusInfo = cornerRadiusInfo;
            this.drawLayer = f3;
        }

        public /* synthetic */ GradientAnimationFill(String str, List list, GradientStyle gradientStyle, GradientChartFillStyle gradientChartFillStyle, GradientChartFillStyle gradientChartFillStyle2, float f, long j, float f2, CornerRadiusInfo cornerRadiusInfo, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, gradientStyle, gradientChartFillStyle, gradientChartFillStyle2, f, j, f2, cornerRadiusInfo, (i & 512) != 0 ? null : f3, null);
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
            DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
        }

        public final String getId() {
            return this.id;
        }

        public final List<Point> getPoints() {
            return this.points;
        }

        public final GradientStyle getGradientStyle() {
            return this.gradientStyle;
        }

        public final GradientChartFillStyle getBeforePivotGradient() {
            return this.beforePivotGradient;
        }

        public final GradientChartFillStyle getAfterPivotGradient() {
            return this.afterPivotGradient;
        }

        public final float getSpeed() {
            return this.speed;
        }

        /* renamed from: getBaseColor-0d7_KjU, reason: not valid java name */
        public final long m12031getBaseColor0d7_KjU() {
            return this.baseColor;
        }

        public final float getBaseColorOpacity() {
            return this.baseColorOpacity;
        }

        public final CornerRadiusInfo getCornerRadiusInfo() {
            return this.cornerRadiusInfo;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public Float getDrawLayer() {
            return this.drawLayer;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void Content(final BoxScope boxScope, Composer composer, final int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Composer composerStartRestartGroup = composer.startRestartGroup(-1532577877);
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
                    ComposerKt.traceEventStart(-1532577877, i2, -1, "com.robinhood.android.charts.model.Fill.GradientAnimationFill.Content (Fill.kt:335)");
                }
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                CornerRadiusInfo cornerRadiusInfo = this.cornerRadiusInfo;
                final Float fValueOf = cornerRadiusInfo != null ? Float.valueOf(density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(cornerRadiusInfo.getRadius()))) : null;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(new SolidColor(Color.m6705copywmQWz5c$default(this.baseColor, this.baseColorOpacity, 0.0f, 0.0f, 0.0f, 14, null), null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Tuples2<Offset, Offset> offsets = Fill4.getOffsets(this.gradientStyle);
                long packedValue = offsets.component1().getPackedValue();
                long packedValue2 = offsets.component2().getPackedValue();
                String str = this.id;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(packedValue) | composerStartRestartGroup.changed(packedValue2);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    Fill2 fill2 = new Fill2(this, snapshotState, packedValue, packedValue2, null);
                    composerStartRestartGroup.updateRememberedValue(fill2);
                    objRememberedValue2 = fill2;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
                Float drawLayer = getDrawLayer();
                Modifier modifierZIndex = ZIndexModifier2.zIndex(modifierMatchParentSize, drawLayer != null ? drawLayer.floatValue() : 2.0f);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(fValueOf);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.charts.model.Fill$GradientAnimationFill$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Fill.GradientAnimationFill.Content$lambda$6$lambda$5(this.f$0, fValueOf, snapshotState, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierZIndex, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Fill$GradientAnimationFill$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Fill.GradientAnimationFill.Content$lambda$7(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Unit Content$lambda$6$lambda$5(GradientAnimationFill gradientAnimationFill, Float f, SnapshotState snapshotState, DrawScope Canvas) {
            Path path;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            Path pathBuildPath = Chart2.buildPath(Canvas, gradientAnimationFill.points, true);
            CornerRadiusInfo cornerRadiusInfo = gradientAnimationFill.cornerRadiusInfo;
            if (cornerRadiusInfo == null) {
                path = pathBuildPath;
            } else {
                Path path2 = Fill4.toPath(cornerRadiusInfo, pathBuildPath, f != null ? f.floatValue() : 0.0f);
                if (path2 != null) {
                    path = path2;
                }
            }
            DrawScope.m6954drawPathGBMwjPU$default(Canvas, path, Content$lambda$2(snapshotState), 0.0f, null, null, 0, 60, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Fill.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010*\u001a\u00020+*\u00020,H\u0017¢\u0006\u0002\u0010-J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\u0010\u00104\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b5\u0010\"J\t\u00106\u001a\u00020\rHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010(J\u0080\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b:\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u00020\u000f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(¨\u0006C²\u0006\n\u0010D\u001a\u00020EX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Fill$ProtoGradientAnimationFill;", "Lcom/robinhood/android/charts/model/Fill;", "id", "", "points", "", "Lcom/robinhood/android/charts/model/Point;", "gradientStyle", "Lrh_server_driven_ui/v1/GradientStyleDto;", "beforePivotGradient", "Lcom/robinhood/android/charts/model/ProtoGradientChartFillStyle;", "afterPivotGradient", "speed", "", "baseColor", "Landroidx/compose/ui/graphics/Color;", "baseColorOpacity", "cornerRadiusInfo", "Lrh_server_driven_ui/v1/CornerRadiusInfoDto;", "drawLayer", "<init>", "(Ljava/lang/String;Ljava/util/List;Lrh_server_driven_ui/v1/GradientStyleDto;Lcom/robinhood/android/charts/model/ProtoGradientChartFillStyle;Lcom/robinhood/android/charts/model/ProtoGradientChartFillStyle;FJFLrh_server_driven_ui/v1/CornerRadiusInfoDto;Ljava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getPoints", "()Ljava/util/List;", "getGradientStyle", "()Lrh_server_driven_ui/v1/GradientStyleDto;", "getBeforePivotGradient", "()Lcom/robinhood/android/charts/model/ProtoGradientChartFillStyle;", "getAfterPivotGradient", "getSpeed", "()F", "getBaseColor-0d7_KjU", "()J", "J", "getBaseColorOpacity", "getCornerRadiusInfo", "()Lrh_server_driven_ui/v1/CornerRadiusInfoDto;", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component7-0d7_KjU", "component8", "component9", "component10", "copy", "copy-RFMEUTM", "(Ljava/lang/String;Ljava/util/List;Lrh_server_driven_ui/v1/GradientStyleDto;Lcom/robinhood/android/charts/model/ProtoGradientChartFillStyle;Lcom/robinhood/android/charts/model/ProtoGradientChartFillStyle;FJFLrh_server_driven_ui/v1/CornerRadiusInfoDto;Ljava/lang/Float;)Lcom/robinhood/android/charts/model/Fill$ProtoGradientAnimationFill;", "equals", "", "other", "", "hashCode", "", "toString", "lib-charts_externalDebug", "brush", "Landroidx/compose/ui/graphics/Brush;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class ProtoGradientAnimationFill implements Fill {
        public static final int $stable = 8;
        private final ProtoGradientChartFillStyle afterPivotGradient;
        private final long baseColor;
        private final float baseColorOpacity;
        private final ProtoGradientChartFillStyle beforePivotGradient;
        private final CornerRadiusInfoDto cornerRadiusInfo;
        private final Float drawLayer;
        private final GradientStyleDto gradientStyle;
        private final String id;
        private final List<Point> points;
        private final float speed;

        public /* synthetic */ ProtoGradientAnimationFill(String str, List list, GradientStyleDto gradientStyleDto, ProtoGradientChartFillStyle protoGradientChartFillStyle, ProtoGradientChartFillStyle protoGradientChartFillStyle2, float f, long j, float f2, CornerRadiusInfoDto cornerRadiusInfoDto, Float f3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, gradientStyleDto, protoGradientChartFillStyle, protoGradientChartFillStyle2, f, j, f2, cornerRadiusInfoDto, f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$7(ProtoGradientAnimationFill protoGradientAnimationFill, BoxScope boxScope, int i, Composer composer, int i2) {
            protoGradientAnimationFill.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
            return Unit.INSTANCE;
        }

        /* renamed from: copy-RFMEUTM$default, reason: not valid java name */
        public static /* synthetic */ ProtoGradientAnimationFill m12033copyRFMEUTM$default(ProtoGradientAnimationFill protoGradientAnimationFill, String str, List list, GradientStyleDto gradientStyleDto, ProtoGradientChartFillStyle protoGradientChartFillStyle, ProtoGradientChartFillStyle protoGradientChartFillStyle2, float f, long j, float f2, CornerRadiusInfoDto cornerRadiusInfoDto, Float f3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = protoGradientAnimationFill.id;
            }
            if ((i & 2) != 0) {
                list = protoGradientAnimationFill.points;
            }
            if ((i & 4) != 0) {
                gradientStyleDto = protoGradientAnimationFill.gradientStyle;
            }
            if ((i & 8) != 0) {
                protoGradientChartFillStyle = protoGradientAnimationFill.beforePivotGradient;
            }
            if ((i & 16) != 0) {
                protoGradientChartFillStyle2 = protoGradientAnimationFill.afterPivotGradient;
            }
            if ((i & 32) != 0) {
                f = protoGradientAnimationFill.speed;
            }
            if ((i & 64) != 0) {
                j = protoGradientAnimationFill.baseColor;
            }
            if ((i & 128) != 0) {
                f2 = protoGradientAnimationFill.baseColorOpacity;
            }
            if ((i & 256) != 0) {
                cornerRadiusInfoDto = protoGradientAnimationFill.cornerRadiusInfo;
            }
            if ((i & 512) != 0) {
                f3 = protoGradientAnimationFill.drawLayer;
            }
            Float f4 = f3;
            float f5 = f2;
            long j2 = j;
            ProtoGradientChartFillStyle protoGradientChartFillStyle3 = protoGradientChartFillStyle2;
            float f6 = f;
            GradientStyleDto gradientStyleDto2 = gradientStyleDto;
            ProtoGradientChartFillStyle protoGradientChartFillStyle4 = protoGradientChartFillStyle;
            return protoGradientAnimationFill.m12035copyRFMEUTM(str, list, gradientStyleDto2, protoGradientChartFillStyle4, protoGradientChartFillStyle3, f6, j2, f5, cornerRadiusInfoDto, f4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final Float getDrawLayer() {
            return this.drawLayer;
        }

        public final List<Point> component2() {
            return this.points;
        }

        /* renamed from: component3, reason: from getter */
        public final GradientStyleDto getGradientStyle() {
            return this.gradientStyle;
        }

        /* renamed from: component4, reason: from getter */
        public final ProtoGradientChartFillStyle getBeforePivotGradient() {
            return this.beforePivotGradient;
        }

        /* renamed from: component5, reason: from getter */
        public final ProtoGradientChartFillStyle getAfterPivotGradient() {
            return this.afterPivotGradient;
        }

        /* renamed from: component6, reason: from getter */
        public final float getSpeed() {
            return this.speed;
        }

        /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
        public final long getBaseColor() {
            return this.baseColor;
        }

        /* renamed from: component8, reason: from getter */
        public final float getBaseColorOpacity() {
            return this.baseColorOpacity;
        }

        /* renamed from: component9, reason: from getter */
        public final CornerRadiusInfoDto getCornerRadiusInfo() {
            return this.cornerRadiusInfo;
        }

        /* renamed from: copy-RFMEUTM, reason: not valid java name */
        public final ProtoGradientAnimationFill m12035copyRFMEUTM(String id, List<Point> points, GradientStyleDto gradientStyle, ProtoGradientChartFillStyle beforePivotGradient, ProtoGradientChartFillStyle afterPivotGradient, float speed, long baseColor, float baseColorOpacity, CornerRadiusInfoDto cornerRadiusInfo, Float drawLayer) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(gradientStyle, "gradientStyle");
            Intrinsics.checkNotNullParameter(beforePivotGradient, "beforePivotGradient");
            Intrinsics.checkNotNullParameter(afterPivotGradient, "afterPivotGradient");
            return new ProtoGradientAnimationFill(id, points, gradientStyle, beforePivotGradient, afterPivotGradient, speed, baseColor, baseColorOpacity, cornerRadiusInfo, drawLayer, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProtoGradientAnimationFill)) {
                return false;
            }
            ProtoGradientAnimationFill protoGradientAnimationFill = (ProtoGradientAnimationFill) other;
            return Intrinsics.areEqual(this.id, protoGradientAnimationFill.id) && Intrinsics.areEqual(this.points, protoGradientAnimationFill.points) && this.gradientStyle == protoGradientAnimationFill.gradientStyle && Intrinsics.areEqual(this.beforePivotGradient, protoGradientAnimationFill.beforePivotGradient) && Intrinsics.areEqual(this.afterPivotGradient, protoGradientAnimationFill.afterPivotGradient) && Float.compare(this.speed, protoGradientAnimationFill.speed) == 0 && Color.m6707equalsimpl0(this.baseColor, protoGradientAnimationFill.baseColor) && Float.compare(this.baseColorOpacity, protoGradientAnimationFill.baseColorOpacity) == 0 && Intrinsics.areEqual(this.cornerRadiusInfo, protoGradientAnimationFill.cornerRadiusInfo) && Intrinsics.areEqual((Object) this.drawLayer, (Object) protoGradientAnimationFill.drawLayer);
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.points.hashCode()) * 31) + this.gradientStyle.hashCode()) * 31) + this.beforePivotGradient.hashCode()) * 31) + this.afterPivotGradient.hashCode()) * 31) + Float.hashCode(this.speed)) * 31) + Color.m6713hashCodeimpl(this.baseColor)) * 31) + Float.hashCode(this.baseColorOpacity)) * 31;
            CornerRadiusInfoDto cornerRadiusInfoDto = this.cornerRadiusInfo;
            int iHashCode2 = (iHashCode + (cornerRadiusInfoDto == null ? 0 : cornerRadiusInfoDto.hashCode())) * 31;
            Float f = this.drawLayer;
            return iHashCode2 + (f != null ? f.hashCode() : 0);
        }

        public String toString() {
            return "ProtoGradientAnimationFill(id=" + this.id + ", points=" + this.points + ", gradientStyle=" + this.gradientStyle + ", beforePivotGradient=" + this.beforePivotGradient + ", afterPivotGradient=" + this.afterPivotGradient + ", speed=" + this.speed + ", baseColor=" + Color.m6714toStringimpl(this.baseColor) + ", baseColorOpacity=" + this.baseColorOpacity + ", cornerRadiusInfo=" + this.cornerRadiusInfo + ", drawLayer=" + this.drawLayer + ")";
        }

        private static final Brush Content$lambda$2(SnapshotState<Brush> snapshotState) {
            return snapshotState.getValue();
        }

        private ProtoGradientAnimationFill(String str, List<Point> points, GradientStyleDto gradientStyle, ProtoGradientChartFillStyle beforePivotGradient, ProtoGradientChartFillStyle afterPivotGradient, float f, long j, float f2, CornerRadiusInfoDto cornerRadiusInfoDto, Float f3) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(gradientStyle, "gradientStyle");
            Intrinsics.checkNotNullParameter(beforePivotGradient, "beforePivotGradient");
            Intrinsics.checkNotNullParameter(afterPivotGradient, "afterPivotGradient");
            this.id = str;
            this.points = points;
            this.gradientStyle = gradientStyle;
            this.beforePivotGradient = beforePivotGradient;
            this.afterPivotGradient = afterPivotGradient;
            this.speed = f;
            this.baseColor = j;
            this.baseColorOpacity = f2;
            this.cornerRadiusInfo = cornerRadiusInfoDto;
            this.drawLayer = f3;
        }

        public /* synthetic */ ProtoGradientAnimationFill(String str, List list, GradientStyleDto gradientStyleDto, ProtoGradientChartFillStyle protoGradientChartFillStyle, ProtoGradientChartFillStyle protoGradientChartFillStyle2, float f, long j, float f2, CornerRadiusInfoDto cornerRadiusInfoDto, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, gradientStyleDto, protoGradientChartFillStyle, protoGradientChartFillStyle2, f, j, f2, cornerRadiusInfoDto, (i & 512) != 0 ? null : f3, null);
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
            DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
        }

        public final String getId() {
            return this.id;
        }

        public final List<Point> getPoints() {
            return this.points;
        }

        public final GradientStyleDto getGradientStyle() {
            return this.gradientStyle;
        }

        public final ProtoGradientChartFillStyle getBeforePivotGradient() {
            return this.beforePivotGradient;
        }

        public final ProtoGradientChartFillStyle getAfterPivotGradient() {
            return this.afterPivotGradient;
        }

        public final float getSpeed() {
            return this.speed;
        }

        /* renamed from: getBaseColor-0d7_KjU, reason: not valid java name */
        public final long m12036getBaseColor0d7_KjU() {
            return this.baseColor;
        }

        public final float getBaseColorOpacity() {
            return this.baseColorOpacity;
        }

        public final CornerRadiusInfoDto getCornerRadiusInfo() {
            return this.cornerRadiusInfo;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public Float getDrawLayer() {
            return this.drawLayer;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void Content(final BoxScope boxScope, Composer composer, final int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Composer composerStartRestartGroup = composer.startRestartGroup(534005529);
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
                    ComposerKt.traceEventStart(534005529, i2, -1, "com.robinhood.android.charts.model.Fill.ProtoGradientAnimationFill.Content (Fill.kt:409)");
                }
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                CornerRadiusInfoDto cornerRadiusInfoDto = this.cornerRadiusInfo;
                final Float fValueOf = cornerRadiusInfoDto != null ? Float.valueOf(density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(cornerRadiusInfoDto.getRadius()))) : null;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(new SolidColor(Color.m6705copywmQWz5c$default(this.baseColor, this.baseColorOpacity, 0.0f, 0.0f, 0.0f, 14, null), null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Tuples2<Offset, Offset> offsets = Fill4.getOffsets(this.gradientStyle);
                long packedValue = offsets.component1().getPackedValue();
                long packedValue2 = offsets.component2().getPackedValue();
                String str = this.id;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(packedValue) | composerStartRestartGroup.changed(packedValue2);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    Fill3 fill3 = new Fill3(this, snapshotState, packedValue, packedValue2, null);
                    composerStartRestartGroup.updateRememberedValue(fill3);
                    objRememberedValue2 = fill3;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
                Float drawLayer = getDrawLayer();
                Modifier modifierZIndex = ZIndexModifier2.zIndex(modifierMatchParentSize, drawLayer != null ? drawLayer.floatValue() : 2.0f);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(fValueOf);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.charts.model.Fill$ProtoGradientAnimationFill$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Fill.ProtoGradientAnimationFill.Content$lambda$6$lambda$5(this.f$0, fValueOf, snapshotState, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierZIndex, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Fill$ProtoGradientAnimationFill$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Fill.ProtoGradientAnimationFill.Content$lambda$7(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Unit Content$lambda$6$lambda$5(ProtoGradientAnimationFill protoGradientAnimationFill, Float f, SnapshotState snapshotState, DrawScope Canvas) {
            Path path;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            Path pathBuildPath = Chart2.buildPath(Canvas, protoGradientAnimationFill.points, true);
            CornerRadiusInfoDto cornerRadiusInfoDto = protoGradientAnimationFill.cornerRadiusInfo;
            if (cornerRadiusInfoDto == null) {
                path = pathBuildPath;
            } else {
                Path path2 = Fill4.toPath(cornerRadiusInfoDto, pathBuildPath, f != null ? f.floatValue() : 0.0f);
                if (path2 != null) {
                    path = path2;
                }
            }
            DrawScope.m6954drawPathGBMwjPU$default(Canvas, path, Content$lambda$2(snapshotState), 0.0f, null, null, 0, 60, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Fill.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u001e\u001a\u00020\u001f*\u00020 H\u0017¢\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH\u0002J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\u0012J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b)\u0010\u0015J\u0010\u0010*\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b+\u0010\u0015J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJT\u0010.\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b/\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Fill$DottedFill;", "Lcom/robinhood/android/charts/model/Fill;", "points", "", "Lcom/robinhood/android/charts/model/Point;", "dotColor", "Landroidx/compose/ui/graphics/Color;", "dotSizeDp", "Landroidx/compose/ui/unit/Dp;", "dotDistanceDp", "opacity", "", "drawLayer", "<init>", "(Ljava/util/List;JFFFLjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPoints", "()Ljava/util/List;", "getDotColor-0d7_KjU", "()J", "J", "getDotSizeDp-D9Ej5fM", "()F", "F", "getDotDistanceDp-D9Ej5fM", "getOpacity", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "tileImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "getTileImage", "dotSizePx", "dotDistancePx", "component1", "component2", "component2-0d7_KjU", "component3", "component3-D9Ej5fM", "component4", "component4-D9Ej5fM", "component5", "component6", "copy", "copy-n3ehzLE", "(Ljava/util/List;JFFFLjava/lang/Float;)Lcom/robinhood/android/charts/model/Fill$DottedFill;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class DottedFill implements Fill {
        public static final int $stable = 8;
        private final long dotColor;
        private final float dotDistanceDp;
        private final float dotSizeDp;
        private final Float drawLayer;
        private final float opacity;
        private final List<Point> points;
        private ImageBitmap tileImage;

        public /* synthetic */ DottedFill(List list, long j, float f, float f2, float f3, Float f4, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j, f, f2, f3, f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$5(DottedFill dottedFill, BoxScope boxScope, int i, Composer composer, int i2) {
            dottedFill.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
            return Unit.INSTANCE;
        }

        /* renamed from: copy-n3ehzLE$default, reason: not valid java name */
        public static /* synthetic */ DottedFill m12019copyn3ehzLE$default(DottedFill dottedFill, List list, long j, float f, float f2, float f3, Float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                list = dottedFill.points;
            }
            if ((i & 2) != 0) {
                j = dottedFill.dotColor;
            }
            if ((i & 4) != 0) {
                f = dottedFill.dotSizeDp;
            }
            if ((i & 8) != 0) {
                f2 = dottedFill.dotDistanceDp;
            }
            if ((i & 16) != 0) {
                f3 = dottedFill.opacity;
            }
            if ((i & 32) != 0) {
                f4 = dottedFill.drawLayer;
            }
            return dottedFill.m12023copyn3ehzLE(list, j, f, f2, f3, f4);
        }

        public final List<Point> component1() {
            return this.points;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getDotColor() {
            return this.dotColor;
        }

        /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
        public final float getDotSizeDp() {
            return this.dotSizeDp;
        }

        /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
        public final float getDotDistanceDp() {
            return this.dotDistanceDp;
        }

        /* renamed from: component5, reason: from getter */
        public final float getOpacity() {
            return this.opacity;
        }

        /* renamed from: component6, reason: from getter */
        public final Float getDrawLayer() {
            return this.drawLayer;
        }

        /* renamed from: copy-n3ehzLE, reason: not valid java name */
        public final DottedFill m12023copyn3ehzLE(List<Point> points, long dotColor, float dotSizeDp, float dotDistanceDp, float opacity, Float drawLayer) {
            Intrinsics.checkNotNullParameter(points, "points");
            return new DottedFill(points, dotColor, dotSizeDp, dotDistanceDp, opacity, drawLayer, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DottedFill)) {
                return false;
            }
            DottedFill dottedFill = (DottedFill) other;
            return Intrinsics.areEqual(this.points, dottedFill.points) && Color.m6707equalsimpl0(this.dotColor, dottedFill.dotColor) && C2002Dp.m7997equalsimpl0(this.dotSizeDp, dottedFill.dotSizeDp) && C2002Dp.m7997equalsimpl0(this.dotDistanceDp, dottedFill.dotDistanceDp) && Float.compare(this.opacity, dottedFill.opacity) == 0 && Intrinsics.areEqual((Object) this.drawLayer, (Object) dottedFill.drawLayer);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.points.hashCode() * 31) + Color.m6713hashCodeimpl(this.dotColor)) * 31) + C2002Dp.m7998hashCodeimpl(this.dotSizeDp)) * 31) + C2002Dp.m7998hashCodeimpl(this.dotDistanceDp)) * 31) + Float.hashCode(this.opacity)) * 31;
            Float f = this.drawLayer;
            return iHashCode + (f == null ? 0 : f.hashCode());
        }

        public String toString() {
            return "DottedFill(points=" + this.points + ", dotColor=" + Color.m6714toStringimpl(this.dotColor) + ", dotSizeDp=" + C2002Dp.m7999toStringimpl(this.dotSizeDp) + ", dotDistanceDp=" + C2002Dp.m7999toStringimpl(this.dotDistanceDp) + ", opacity=" + this.opacity + ", drawLayer=" + this.drawLayer + ")";
        }

        private DottedFill(List<Point> points, long j, float f, float f2, float f3, Float f4) {
            Intrinsics.checkNotNullParameter(points, "points");
            this.points = points;
            this.dotColor = j;
            this.dotSizeDp = f;
            this.dotDistanceDp = f2;
            this.opacity = f3;
            this.drawLayer = f4;
        }

        public /* synthetic */ DottedFill(List list, long j, float f, float f2, float f3, Float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j, f, f2, f3, (i & 32) != 0 ? null : f4, null);
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
            DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
        }

        public final List<Point> getPoints() {
            return this.points;
        }

        /* renamed from: getDotColor-0d7_KjU, reason: not valid java name */
        public final long m12024getDotColor0d7_KjU() {
            return this.dotColor;
        }

        /* renamed from: getDotSizeDp-D9Ej5fM, reason: not valid java name */
        public final float m12026getDotSizeDpD9Ej5fM() {
            return this.dotSizeDp;
        }

        /* renamed from: getDotDistanceDp-D9Ej5fM, reason: not valid java name */
        public final float m12025getDotDistanceDpD9Ej5fM() {
            return this.dotDistanceDp;
        }

        public final float getOpacity() {
            return this.opacity;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public Float getDrawLayer() {
            return this.drawLayer;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void Content(final BoxScope boxScope, Composer composer, final int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Composer composerStartRestartGroup = composer.startRestartGroup(-157767845);
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
                    ComposerKt.traceEventStart(-157767845, i2, -1, "com.robinhood.android.charts.model.Fill.DottedFill.Content (Fill.kt:97)");
                }
                Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
                Float drawLayer = getDrawLayer();
                Modifier modifierZIndex = ZIndexModifier2.zIndex(modifierMatchParentSize, drawLayer != null ? drawLayer.floatValue() : 2.0f);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.model.Fill$DottedFill$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Fill.DottedFill.Content$lambda$4$lambda$3(this.f$0, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierZIndex, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Fill$DottedFill$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Fill.DottedFill.Content$lambda$5(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$4$lambda$3(DottedFill dottedFill, DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            Path pathBuildPath = Chart2.buildPath(Canvas, dottedFill.points, true);
            int iM6700getIntersectrtfAjoo = ClipOp.INSTANCE.m6700getIntersectrtfAjoo();
            DrawContext drawContext = Canvas.getDrawContext();
            long jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo6938clipPathmtrdDE(pathBuildPath, iM6700getIntersectrtfAjoo);
                Paint internalPaint = AndroidPaint_androidKt.Paint().getInternalPaint();
                internalPaint.setAntiAlias(true);
                ImageBitmap tileImage = dottedFill.getTileImage(Canvas.mo5016toPx0680j_4(dottedFill.dotSizeDp), Canvas.mo5016toPx0680j_4(dottedFill.dotDistanceDp));
                TileMode.Companion companion = TileMode.INSTANCE;
                internalPaint.setShader(Shader.m6829ImageShaderF49vj9s(tileImage, companion.m6865getRepeated3opZhB0(), companion.m6865getRepeated3opZhB0()));
                internalPaint.setAlpha((int) (dottedFill.opacity * 255));
                AndroidCanvas_androidKt.getNativeCanvas(Canvas.getDrawContext().getCanvas()).drawPaint(internalPaint);
                internalPaint.reset();
                drawContext.getCanvas().restore();
                drawContext.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                drawContext.getCanvas().restore();
                drawContext.mo6937setSizeuvyYCjk(jMo6936getSizeNHjbRc);
                throw th;
            }
        }

        private final ImageBitmap getTileImage(float dotSizePx, float dotDistancePx) {
            ImageBitmap imageBitmap = this.tileImage;
            if (imageBitmap != null) {
                return imageBitmap;
            }
            float f = 2;
            float f2 = f * dotSizePx;
            int i = (int) ((f * dotDistancePx) + f2);
            ImageBitmap imageBitmapM6778ImageBitmapx__hDU$default = ImageBitmap3.m6778ImageBitmapx__hDU$default(i, i, 0, false, null, 28, null);
            Canvas canvas = new Canvas(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmapM6778ImageBitmapx__hDU$default));
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color2.m6735toArgb8_81llA(this.dotColor));
            canvas.drawCircle(dotSizePx, dotSizePx, dotSizePx, paint);
            float f3 = f2 + dotDistancePx;
            canvas.drawCircle(f3, f3, dotSizePx, paint);
            this.tileImage = imageBitmapM6778ImageBitmapx__hDU$default;
            return imageBitmapM6778ImageBitmapx__hDU$default;
        }
    }

    /* compiled from: Fill.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0016\u001a\u00020\u0017*\u00020\u0018H\u0017¢\u0006\u0002\u0010\u0019J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u000fJ\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J@\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Fill$SolidFill;", "Lcom/robinhood/android/charts/model/Fill;", "points", "", "Lcom/robinhood/android/charts/model/Point;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "opacity", "", "drawLayer", "<init>", "(Ljava/util/List;JFLjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPoints", "()Ljava/util/List;", "getColor-0d7_KjU", "()J", "J", "getOpacity", "()F", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "component2-0d7_KjU", "component3", "component4", "copy", "copy-RPmYEkk", "(Ljava/util/List;JFLjava/lang/Float;)Lcom/robinhood/android/charts/model/Fill$SolidFill;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class SolidFill implements Fill {
        public static final int $stable = 8;
        private final long color;
        private final Float drawLayer;
        private final float opacity;
        private final List<Point> points;

        public /* synthetic */ SolidFill(List list, long j, float f, Float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j, f, f2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$2(SolidFill solidFill, BoxScope boxScope, int i, Composer composer, int i2) {
            solidFill.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
            return Unit.INSTANCE;
        }

        /* renamed from: copy-RPmYEkk$default, reason: not valid java name */
        public static /* synthetic */ SolidFill m12046copyRPmYEkk$default(SolidFill solidFill, List list, long j, float f, Float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = solidFill.points;
            }
            if ((i & 2) != 0) {
                j = solidFill.color;
            }
            if ((i & 4) != 0) {
                f = solidFill.opacity;
            }
            if ((i & 8) != 0) {
                f2 = solidFill.drawLayer;
            }
            return solidFill.m12048copyRPmYEkk(list, j, f, f2);
        }

        public final List<Point> component1() {
            return this.points;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final float getOpacity() {
            return this.opacity;
        }

        /* renamed from: component4, reason: from getter */
        public final Float getDrawLayer() {
            return this.drawLayer;
        }

        /* renamed from: copy-RPmYEkk, reason: not valid java name */
        public final SolidFill m12048copyRPmYEkk(List<Point> points, long color, float opacity, Float drawLayer) {
            Intrinsics.checkNotNullParameter(points, "points");
            return new SolidFill(points, color, opacity, drawLayer, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SolidFill)) {
                return false;
            }
            SolidFill solidFill = (SolidFill) other;
            return Intrinsics.areEqual(this.points, solidFill.points) && Color.m6707equalsimpl0(this.color, solidFill.color) && Float.compare(this.opacity, solidFill.opacity) == 0 && Intrinsics.areEqual((Object) this.drawLayer, (Object) solidFill.drawLayer);
        }

        public int hashCode() {
            int iHashCode = ((((this.points.hashCode() * 31) + Color.m6713hashCodeimpl(this.color)) * 31) + Float.hashCode(this.opacity)) * 31;
            Float f = this.drawLayer;
            return iHashCode + (f == null ? 0 : f.hashCode());
        }

        public String toString() {
            return "SolidFill(points=" + this.points + ", color=" + Color.m6714toStringimpl(this.color) + ", opacity=" + this.opacity + ", drawLayer=" + this.drawLayer + ")";
        }

        private SolidFill(List<Point> points, long j, float f, Float f2) {
            Intrinsics.checkNotNullParameter(points, "points");
            this.points = points;
            this.color = j;
            this.opacity = f;
            this.drawLayer = f2;
        }

        public /* synthetic */ SolidFill(List list, long j, float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j, f, (i & 8) != 0 ? null : f2, null);
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
            DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
        }

        public final List<Point> getPoints() {
            return this.points;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m12049getColor0d7_KjU() {
            return this.color;
        }

        public final float getOpacity() {
            return this.opacity;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public Float getDrawLayer() {
            return this.drawLayer;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void Content(final BoxScope boxScope, Composer composer, final int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Composer composerStartRestartGroup = composer.startRestartGroup(1986010964);
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
                    ComposerKt.traceEventStart(1986010964, i2, -1, "com.robinhood.android.charts.model.Fill.SolidFill.Content (Fill.kt:166)");
                }
                Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
                Float drawLayer = getDrawLayer();
                Modifier modifierZIndex = ZIndexModifier2.zIndex(modifierMatchParentSize, drawLayer != null ? drawLayer.floatValue() : 2.0f);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.model.Fill$SolidFill$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Fill.SolidFill.Content$lambda$1$lambda$0(this.f$0, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierZIndex, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Fill$SolidFill$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Fill.SolidFill.Content$lambda$2(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$1$lambda$0(SolidFill solidFill, DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            DrawScope.m6955drawPathLG529CI$default(Canvas, Chart2.buildPath(Canvas, solidFill.points, true), solidFill.color, solidFill.opacity, null, null, 0, 56, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Fill.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0017¢\u0006\u0002\u0010\u001dJ\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u0011J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018JJ\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Fill$RoundedSolidFill;", "Lcom/robinhood/android/charts/model/Fill;", "points", "", "Lcom/robinhood/android/charts/model/Point;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "opacity", "", "cornerRadiusInfo", "Lcom/robinhood/models/serverdriven/experimental/api/CornerRadiusInfo;", "drawLayer", "<init>", "(Ljava/util/List;JFLcom/robinhood/models/serverdriven/experimental/api/CornerRadiusInfo;Ljava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPoints", "()Ljava/util/List;", "getColor-0d7_KjU", "()J", "J", "getOpacity", "()F", "getCornerRadiusInfo", "()Lcom/robinhood/models/serverdriven/experimental/api/CornerRadiusInfo;", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "component2-0d7_KjU", "component3", "component4", "component5", "copy", "copy-iJQMabo", "(Ljava/util/List;JFLcom/robinhood/models/serverdriven/experimental/api/CornerRadiusInfo;Ljava/lang/Float;)Lcom/robinhood/android/charts/model/Fill$RoundedSolidFill;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class RoundedSolidFill implements Fill {
        public static final int $stable = 8;
        private final long color;
        private final CornerRadiusInfo cornerRadiusInfo;
        private final Float drawLayer;
        private final float opacity;
        private final List<Point> points;

        public /* synthetic */ RoundedSolidFill(List list, long j, float f, CornerRadiusInfo cornerRadiusInfo, Float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j, f, cornerRadiusInfo, f2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$3(RoundedSolidFill roundedSolidFill, BoxScope boxScope, int i, Composer composer, int i2) {
            roundedSolidFill.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
            return Unit.INSTANCE;
        }

        /* renamed from: copy-iJQMabo$default, reason: not valid java name */
        public static /* synthetic */ RoundedSolidFill m12042copyiJQMabo$default(RoundedSolidFill roundedSolidFill, List list, long j, float f, CornerRadiusInfo cornerRadiusInfo, Float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = roundedSolidFill.points;
            }
            if ((i & 2) != 0) {
                j = roundedSolidFill.color;
            }
            if ((i & 4) != 0) {
                f = roundedSolidFill.opacity;
            }
            if ((i & 8) != 0) {
                cornerRadiusInfo = roundedSolidFill.cornerRadiusInfo;
            }
            if ((i & 16) != 0) {
                f2 = roundedSolidFill.drawLayer;
            }
            Float f3 = f2;
            float f4 = f;
            return roundedSolidFill.m12044copyiJQMabo(list, j, f4, cornerRadiusInfo, f3);
        }

        public final List<Point> component1() {
            return this.points;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final float getOpacity() {
            return this.opacity;
        }

        /* renamed from: component4, reason: from getter */
        public final CornerRadiusInfo getCornerRadiusInfo() {
            return this.cornerRadiusInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final Float getDrawLayer() {
            return this.drawLayer;
        }

        /* renamed from: copy-iJQMabo, reason: not valid java name */
        public final RoundedSolidFill m12044copyiJQMabo(List<Point> points, long color, float opacity, CornerRadiusInfo cornerRadiusInfo, Float drawLayer) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(cornerRadiusInfo, "cornerRadiusInfo");
            return new RoundedSolidFill(points, color, opacity, cornerRadiusInfo, drawLayer, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoundedSolidFill)) {
                return false;
            }
            RoundedSolidFill roundedSolidFill = (RoundedSolidFill) other;
            return Intrinsics.areEqual(this.points, roundedSolidFill.points) && Color.m6707equalsimpl0(this.color, roundedSolidFill.color) && Float.compare(this.opacity, roundedSolidFill.opacity) == 0 && Intrinsics.areEqual(this.cornerRadiusInfo, roundedSolidFill.cornerRadiusInfo) && Intrinsics.areEqual((Object) this.drawLayer, (Object) roundedSolidFill.drawLayer);
        }

        public int hashCode() {
            int iHashCode = ((((((this.points.hashCode() * 31) + Color.m6713hashCodeimpl(this.color)) * 31) + Float.hashCode(this.opacity)) * 31) + this.cornerRadiusInfo.hashCode()) * 31;
            Float f = this.drawLayer;
            return iHashCode + (f == null ? 0 : f.hashCode());
        }

        public String toString() {
            return "RoundedSolidFill(points=" + this.points + ", color=" + Color.m6714toStringimpl(this.color) + ", opacity=" + this.opacity + ", cornerRadiusInfo=" + this.cornerRadiusInfo + ", drawLayer=" + this.drawLayer + ")";
        }

        private RoundedSolidFill(List<Point> points, long j, float f, CornerRadiusInfo cornerRadiusInfo, Float f2) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(cornerRadiusInfo, "cornerRadiusInfo");
            this.points = points;
            this.color = j;
            this.opacity = f;
            this.cornerRadiusInfo = cornerRadiusInfo;
            this.drawLayer = f2;
        }

        public /* synthetic */ RoundedSolidFill(List list, long j, float f, CornerRadiusInfo cornerRadiusInfo, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j, f, cornerRadiusInfo, (i & 16) != 0 ? null : f2, null);
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
            DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
        }

        public final List<Point> getPoints() {
            return this.points;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m12045getColor0d7_KjU() {
            return this.color;
        }

        public final float getOpacity() {
            return this.opacity;
        }

        public final CornerRadiusInfo getCornerRadiusInfo() {
            return this.cornerRadiusInfo;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public Float getDrawLayer() {
            return this.drawLayer;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void Content(final BoxScope boxScope, Composer composer, final int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Composer composerStartRestartGroup = composer.startRestartGroup(1249995463);
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
                    ComposerKt.traceEventStart(1249995463, i2, -1, "com.robinhood.android.charts.model.Fill.RoundedSolidFill.Content (Fill.kt:188)");
                }
                final float fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(this.cornerRadiusInfo.getRadius()));
                Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
                Float drawLayer = getDrawLayer();
                Modifier modifierZIndex = ZIndexModifier2.zIndex(modifierMatchParentSize, drawLayer != null ? drawLayer.floatValue() : 2.0f);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(fMo5016toPx0680j_4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.model.Fill$RoundedSolidFill$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Fill.RoundedSolidFill.Content$lambda$2$lambda$1(this.f$0, fMo5016toPx0680j_4, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierZIndex, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Fill$RoundedSolidFill$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Fill.RoundedSolidFill.Content$lambda$3(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$2$lambda$1(RoundedSolidFill roundedSolidFill, float f, DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            DrawScope.m6955drawPathLG529CI$default(Canvas, Fill4.toPath(roundedSolidFill.cornerRadiusInfo, Chart2.buildPath(Canvas, roundedSolidFill.points, true), f), roundedSolidFill.color, roundedSolidFill.opacity, null, null, 0, 56, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Fill.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0017¢\u0006\u0002\u0010\u001dJ\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u0011J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018JL\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Fill$ProtoRoundedSolidFill;", "Lcom/robinhood/android/charts/model/Fill;", "points", "", "Lcom/robinhood/android/charts/model/Point;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "opacity", "", "cornerRadiusInfo", "Lrh_server_driven_ui/v1/CornerRadiusInfoDto;", "drawLayer", "<init>", "(Ljava/util/List;JFLrh_server_driven_ui/v1/CornerRadiusInfoDto;Ljava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPoints", "()Ljava/util/List;", "getColor-0d7_KjU", "()J", "J", "getOpacity", "()F", "getCornerRadiusInfo", "()Lrh_server_driven_ui/v1/CornerRadiusInfoDto;", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "component2-0d7_KjU", "component3", "component4", "component5", "copy", "copy-iJQMabo", "(Ljava/util/List;JFLrh_server_driven_ui/v1/CornerRadiusInfoDto;Ljava/lang/Float;)Lcom/robinhood/android/charts/model/Fill$ProtoRoundedSolidFill;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class ProtoRoundedSolidFill implements Fill {
        public static final int $stable = 8;
        private final long color;
        private final CornerRadiusInfoDto cornerRadiusInfo;
        private final Float drawLayer;
        private final float opacity;
        private final List<Point> points;

        public /* synthetic */ ProtoRoundedSolidFill(List list, long j, float f, CornerRadiusInfoDto cornerRadiusInfoDto, Float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j, f, cornerRadiusInfoDto, f2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$0(ProtoRoundedSolidFill protoRoundedSolidFill, BoxScope boxScope, int i, Composer composer, int i2) {
            protoRoundedSolidFill.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$4(ProtoRoundedSolidFill protoRoundedSolidFill, BoxScope boxScope, int i, Composer composer, int i2) {
            protoRoundedSolidFill.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
            return Unit.INSTANCE;
        }

        /* renamed from: copy-iJQMabo$default, reason: not valid java name */
        public static /* synthetic */ ProtoRoundedSolidFill m12037copyiJQMabo$default(ProtoRoundedSolidFill protoRoundedSolidFill, List list, long j, float f, CornerRadiusInfoDto cornerRadiusInfoDto, Float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = protoRoundedSolidFill.points;
            }
            if ((i & 2) != 0) {
                j = protoRoundedSolidFill.color;
            }
            if ((i & 4) != 0) {
                f = protoRoundedSolidFill.opacity;
            }
            if ((i & 8) != 0) {
                cornerRadiusInfoDto = protoRoundedSolidFill.cornerRadiusInfo;
            }
            if ((i & 16) != 0) {
                f2 = protoRoundedSolidFill.drawLayer;
            }
            Float f3 = f2;
            float f4 = f;
            return protoRoundedSolidFill.m12039copyiJQMabo(list, j, f4, cornerRadiusInfoDto, f3);
        }

        public final List<Point> component1() {
            return this.points;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final float getOpacity() {
            return this.opacity;
        }

        /* renamed from: component4, reason: from getter */
        public final CornerRadiusInfoDto getCornerRadiusInfo() {
            return this.cornerRadiusInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final Float getDrawLayer() {
            return this.drawLayer;
        }

        /* renamed from: copy-iJQMabo, reason: not valid java name */
        public final ProtoRoundedSolidFill m12039copyiJQMabo(List<Point> points, long color, float opacity, CornerRadiusInfoDto cornerRadiusInfo, Float drawLayer) {
            Intrinsics.checkNotNullParameter(points, "points");
            return new ProtoRoundedSolidFill(points, color, opacity, cornerRadiusInfo, drawLayer, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProtoRoundedSolidFill)) {
                return false;
            }
            ProtoRoundedSolidFill protoRoundedSolidFill = (ProtoRoundedSolidFill) other;
            return Intrinsics.areEqual(this.points, protoRoundedSolidFill.points) && Color.m6707equalsimpl0(this.color, protoRoundedSolidFill.color) && Float.compare(this.opacity, protoRoundedSolidFill.opacity) == 0 && Intrinsics.areEqual(this.cornerRadiusInfo, protoRoundedSolidFill.cornerRadiusInfo) && Intrinsics.areEqual((Object) this.drawLayer, (Object) protoRoundedSolidFill.drawLayer);
        }

        public int hashCode() {
            int iHashCode = ((((this.points.hashCode() * 31) + Color.m6713hashCodeimpl(this.color)) * 31) + Float.hashCode(this.opacity)) * 31;
            CornerRadiusInfoDto cornerRadiusInfoDto = this.cornerRadiusInfo;
            int iHashCode2 = (iHashCode + (cornerRadiusInfoDto == null ? 0 : cornerRadiusInfoDto.hashCode())) * 31;
            Float f = this.drawLayer;
            return iHashCode2 + (f != null ? f.hashCode() : 0);
        }

        public String toString() {
            return "ProtoRoundedSolidFill(points=" + this.points + ", color=" + Color.m6714toStringimpl(this.color) + ", opacity=" + this.opacity + ", cornerRadiusInfo=" + this.cornerRadiusInfo + ", drawLayer=" + this.drawLayer + ")";
        }

        private ProtoRoundedSolidFill(List<Point> points, long j, float f, CornerRadiusInfoDto cornerRadiusInfoDto, Float f2) {
            Intrinsics.checkNotNullParameter(points, "points");
            this.points = points;
            this.color = j;
            this.opacity = f;
            this.cornerRadiusInfo = cornerRadiusInfoDto;
            this.drawLayer = f2;
        }

        public /* synthetic */ ProtoRoundedSolidFill(List list, long j, float f, CornerRadiusInfoDto cornerRadiusInfoDto, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, j, f, cornerRadiusInfoDto, (i & 16) != 0 ? null : f2, null);
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
            DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
        }

        public final List<Point> getPoints() {
            return this.points;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m12040getColor0d7_KjU() {
            return this.color;
        }

        public final float getOpacity() {
            return this.opacity;
        }

        public final CornerRadiusInfoDto getCornerRadiusInfo() {
            return this.cornerRadiusInfo;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public Float getDrawLayer() {
            return this.drawLayer;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void Content(final BoxScope boxScope, Composer composer, final int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Composer composerStartRestartGroup = composer.startRestartGroup(234319513);
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
                    ComposerKt.traceEventStart(234319513, i2, -1, "com.robinhood.android.charts.model.Fill.ProtoRoundedSolidFill.Content (Fill.kt:212)");
                }
                if (this.cornerRadiusInfo == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Fill$ProtoRoundedSolidFill$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Fill.ProtoRoundedSolidFill.Content$lambda$0(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                final float fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(this.cornerRadiusInfo.getRadius()));
                Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
                Float drawLayer = getDrawLayer();
                Modifier modifierZIndex = ZIndexModifier2.zIndex(modifierMatchParentSize, drawLayer != null ? drawLayer.floatValue() : 2.0f);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(fMo5016toPx0680j_4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.model.Fill$ProtoRoundedSolidFill$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Fill.ProtoRoundedSolidFill.Content$lambda$3$lambda$2(this.f$0, fMo5016toPx0680j_4, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierZIndex, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 != null) {
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Fill$ProtoRoundedSolidFill$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Fill.ProtoRoundedSolidFill.Content$lambda$4(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$3$lambda$2(ProtoRoundedSolidFill protoRoundedSolidFill, float f, DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            DrawScope.m6955drawPathLG529CI$default(Canvas, Fill4.toPath(protoRoundedSolidFill.cornerRadiusInfo, Chart2.buildPath(Canvas, protoRoundedSolidFill.points, true), f), protoRoundedSolidFill.color, protoRoundedSolidFill.opacity, null, null, 0, 56, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Fill.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\u00020\u0013*\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J4\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Fill$GradientFill;", "Lcom/robinhood/android/charts/model/Fill;", "points", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/model/Point;", ResourceTypes.STYLE, "Lcom/robinhood/android/charts/model/GradientChartFillStyle;", "drawLayer", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/charts/model/GradientChartFillStyle;Ljava/lang/Float;)V", "getPoints", "()Lkotlinx/collections/immutable/ImmutableList;", "getStyle", "()Lcom/robinhood/android/charts/model/GradientChartFillStyle;", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "component3", "copy", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/charts/model/GradientChartFillStyle;Ljava/lang/Float;)Lcom/robinhood/android/charts/model/Fill$GradientFill;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class GradientFill implements Fill {
        public static final int $stable = 0;
        private final Float drawLayer;
        private final ImmutableList<Point> points;
        private final GradientChartFillStyle style;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$3(GradientFill gradientFill, BoxScope boxScope, int i, Composer composer, int i2) {
            gradientFill.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GradientFill copy$default(GradientFill gradientFill, ImmutableList immutableList, GradientChartFillStyle gradientChartFillStyle, Float f, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = gradientFill.points;
            }
            if ((i & 2) != 0) {
                gradientChartFillStyle = gradientFill.style;
            }
            if ((i & 4) != 0) {
                f = gradientFill.drawLayer;
            }
            return gradientFill.copy(immutableList, gradientChartFillStyle, f);
        }

        public final ImmutableList<Point> component1() {
            return this.points;
        }

        /* renamed from: component2, reason: from getter */
        public final GradientChartFillStyle getStyle() {
            return this.style;
        }

        /* renamed from: component3, reason: from getter */
        public final Float getDrawLayer() {
            return this.drawLayer;
        }

        public final GradientFill copy(ImmutableList<Point> points, GradientChartFillStyle style, Float drawLayer) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(style, "style");
            return new GradientFill(points, style, drawLayer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GradientFill)) {
                return false;
            }
            GradientFill gradientFill = (GradientFill) other;
            return Intrinsics.areEqual(this.points, gradientFill.points) && Intrinsics.areEqual(this.style, gradientFill.style) && Intrinsics.areEqual((Object) this.drawLayer, (Object) gradientFill.drawLayer);
        }

        public int hashCode() {
            int iHashCode = ((this.points.hashCode() * 31) + this.style.hashCode()) * 31;
            Float f = this.drawLayer;
            return iHashCode + (f == null ? 0 : f.hashCode());
        }

        public String toString() {
            return "GradientFill(points=" + this.points + ", style=" + this.style + ", drawLayer=" + this.drawLayer + ")";
        }

        public GradientFill(ImmutableList<Point> points, GradientChartFillStyle style, Float f) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(style, "style");
            this.points = points;
            this.style = style;
            this.drawLayer = f;
        }

        public /* synthetic */ GradientFill(ImmutableList immutableList, GradientChartFillStyle gradientChartFillStyle, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(immutableList, gradientChartFillStyle, (i & 4) != 0 ? null : f);
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
            DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
        }

        public final ImmutableList<Point> getPoints() {
            return this.points;
        }

        public final GradientChartFillStyle getStyle() {
            return this.style;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public Float getDrawLayer() {
            return this.drawLayer;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void Content(final BoxScope boxScope, Composer composer, final int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Composer composerStartRestartGroup = composer.startRestartGroup(1996316629);
            int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i : i;
            if ((i & 48) == 0) {
                i2 |= composerStartRestartGroup.changed(this) ? 32 : 16;
            }
            if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1996316629, i2, -1, "com.robinhood.android.charts.model.Fill.GradientFill.Content (Fill.kt:235)");
                }
                Tuples2<Offset, Offset> offsets = Fill4.getOffsets(this.style.getGradientStyle());
                final long packedValue = offsets.component1().getPackedValue();
                final long packedValue2 = offsets.component2().getPackedValue();
                ImmutableList<GradientChartFillStyle.ColorStop> colorStops = this.style.getColorStops();
                int i3 = i2;
                final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(colorStops, 10));
                for (GradientChartFillStyle.ColorStop colorStop : colorStops) {
                    arrayList.add(Tuples4.m3642to(Float.valueOf(colorStop.getStop()), Color.m6701boximpl(colorStop.m12059getColor0d7_KjU())));
                }
                Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
                Float drawLayer = getDrawLayer();
                Modifier modifierZIndex = ZIndexModifier2.zIndex(modifierMatchParentSize, drawLayer != null ? drawLayer.floatValue() : 2.0f);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(arrayList) | composerStartRestartGroup.changed(packedValue) | composerStartRestartGroup.changed(packedValue2);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.charts.model.Fill$GradientFill$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Fill.GradientFill.Content$lambda$2$lambda$1(this.f$0, arrayList, packedValue, packedValue2, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue = function1;
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierZIndex, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Fill$GradientFill$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Fill.GradientFill.Content$lambda$3(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$2$lambda$1(GradientFill gradientFill, List list, long j, long j2, DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            Path pathBuildPath = Chart2.buildPath(Canvas, gradientFill.points, true);
            Brush.Companion companion = Brush.INSTANCE;
            Tuples2[] tuples2Arr = (Tuples2[]) list.toArray(new Tuples2[0]);
            DrawScope.m6954drawPathGBMwjPU$default(Canvas, pathBuildPath, Brush.Companion.m6679linearGradientmHitzGk$default(companion, (Tuples2[]) Arrays.copyOf(tuples2Arr, tuples2Arr.length), j, j2, 0, 8, (Object) null), 0.0f, null, null, 0, 60, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Fill.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\u00020\u0013*\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J4\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Fill$ProtoGradientFill;", "Lcom/robinhood/android/charts/model/Fill;", "points", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/model/Point;", ResourceTypes.STYLE, "Lcom/robinhood/android/charts/model/ProtoGradientChartFillStyle;", "drawLayer", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/charts/model/ProtoGradientChartFillStyle;Ljava/lang/Float;)V", "getPoints", "()Lkotlinx/collections/immutable/ImmutableList;", "getStyle", "()Lcom/robinhood/android/charts/model/ProtoGradientChartFillStyle;", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "component3", "copy", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/charts/model/ProtoGradientChartFillStyle;Ljava/lang/Float;)Lcom/robinhood/android/charts/model/Fill$ProtoGradientFill;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class ProtoGradientFill implements Fill {
        public static final int $stable = 0;
        private final Float drawLayer;
        private final ImmutableList<Point> points;
        private final ProtoGradientChartFillStyle style;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$3(ProtoGradientFill protoGradientFill, BoxScope boxScope, int i, Composer composer, int i2) {
            protoGradientFill.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProtoGradientFill copy$default(ProtoGradientFill protoGradientFill, ImmutableList immutableList, ProtoGradientChartFillStyle protoGradientChartFillStyle, Float f, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = protoGradientFill.points;
            }
            if ((i & 2) != 0) {
                protoGradientChartFillStyle = protoGradientFill.style;
            }
            if ((i & 4) != 0) {
                f = protoGradientFill.drawLayer;
            }
            return protoGradientFill.copy(immutableList, protoGradientChartFillStyle, f);
        }

        public final ImmutableList<Point> component1() {
            return this.points;
        }

        /* renamed from: component2, reason: from getter */
        public final ProtoGradientChartFillStyle getStyle() {
            return this.style;
        }

        /* renamed from: component3, reason: from getter */
        public final Float getDrawLayer() {
            return this.drawLayer;
        }

        public final ProtoGradientFill copy(ImmutableList<Point> points, ProtoGradientChartFillStyle style, Float drawLayer) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(style, "style");
            return new ProtoGradientFill(points, style, drawLayer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProtoGradientFill)) {
                return false;
            }
            ProtoGradientFill protoGradientFill = (ProtoGradientFill) other;
            return Intrinsics.areEqual(this.points, protoGradientFill.points) && Intrinsics.areEqual(this.style, protoGradientFill.style) && Intrinsics.areEqual((Object) this.drawLayer, (Object) protoGradientFill.drawLayer);
        }

        public int hashCode() {
            int iHashCode = ((this.points.hashCode() * 31) + this.style.hashCode()) * 31;
            Float f = this.drawLayer;
            return iHashCode + (f == null ? 0 : f.hashCode());
        }

        public String toString() {
            return "ProtoGradientFill(points=" + this.points + ", style=" + this.style + ", drawLayer=" + this.drawLayer + ")";
        }

        public ProtoGradientFill(ImmutableList<Point> points, ProtoGradientChartFillStyle style, Float f) {
            Intrinsics.checkNotNullParameter(points, "points");
            Intrinsics.checkNotNullParameter(style, "style");
            this.points = points;
            this.style = style;
            this.drawLayer = f;
        }

        public /* synthetic */ ProtoGradientFill(ImmutableList immutableList, ProtoGradientChartFillStyle protoGradientChartFillStyle, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(immutableList, protoGradientChartFillStyle, (i & 4) != 0 ? null : f);
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
            DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
        }

        public final ImmutableList<Point> getPoints() {
            return this.points;
        }

        public final ProtoGradientChartFillStyle getStyle() {
            return this.style;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public Float getDrawLayer() {
            return this.drawLayer;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void Content(final BoxScope boxScope, Composer composer, final int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Composer composerStartRestartGroup = composer.startRestartGroup(-945677145);
            int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i : i;
            if ((i & 48) == 0) {
                i2 |= composerStartRestartGroup.changed(this) ? 32 : 16;
            }
            if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-945677145, i2, -1, "com.robinhood.android.charts.model.Fill.ProtoGradientFill.Content (Fill.kt:264)");
                }
                Tuples2<Offset, Offset> offsets = Fill4.getOffsets(this.style.getGradientStyle());
                final long packedValue = offsets.component1().getPackedValue();
                final long packedValue2 = offsets.component2().getPackedValue();
                ImmutableList<ProtoGradientChartFillStyle.ColorStop> colorStops = this.style.getColorStops();
                int i3 = i2;
                final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(colorStops, 10));
                for (ProtoGradientChartFillStyle.ColorStop colorStop : colorStops) {
                    arrayList.add(Tuples4.m3642to(Float.valueOf(colorStop.getStop()), Color.m6701boximpl(colorStop.m12092getColor0d7_KjU())));
                }
                Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
                Float drawLayer = getDrawLayer();
                Modifier modifierZIndex = ZIndexModifier2.zIndex(modifierMatchParentSize, drawLayer != null ? drawLayer.floatValue() : 2.0f);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(arrayList) | composerStartRestartGroup.changed(packedValue) | composerStartRestartGroup.changed(packedValue2);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.charts.model.Fill$ProtoGradientFill$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Fill.ProtoGradientFill.Content$lambda$2$lambda$1(this.f$0, arrayList, packedValue, packedValue2, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue = function1;
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierZIndex, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Fill$ProtoGradientFill$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Fill.ProtoGradientFill.Content$lambda$3(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$2$lambda$1(ProtoGradientFill protoGradientFill, List list, long j, long j2, DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            Path pathBuildPath = Chart2.buildPath(Canvas, protoGradientFill.points, true);
            Brush.Companion companion = Brush.INSTANCE;
            Tuples2[] tuples2Arr = (Tuples2[]) list.toArray(new Tuples2[0]);
            DrawScope.m6954drawPathGBMwjPU$default(Canvas, pathBuildPath, Brush.Companion.m6679linearGradientmHitzGk$default(companion, (Tuples2[]) Arrays.copyOf(tuples2Arr, tuples2Arr.length), j, j2, 0, 8, (Object) null), 0.0f, null, null, 0, 60, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Fill.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u001b\u001a\u00020\u001c*\u00020\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u001b\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019JV\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/charts/model/Fill$RadialGradientFill;", "Lcom/robinhood/android/charts/model/Fill;", "point", "Lcom/robinhood/android/charts/model/Point;", "radius", "", "colorStops", "", "Lkotlin/Pair;", "Landroidx/compose/ui/graphics/Color;", "blur", "", "drawLayer", "<init>", "(Lcom/robinhood/android/charts/model/Point;FLjava/util/List;Ljava/lang/Integer;Ljava/lang/Float;)V", "getPoint", "()Lcom/robinhood/android/charts/model/Point;", "getRadius", "()F", "getColorStops", "()Ljava/util/List;", "getBlur", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDrawLayer", "()Ljava/lang/Float;", "Ljava/lang/Float;", "Content", "", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/robinhood/android/charts/model/Point;FLjava/util/List;Ljava/lang/Integer;Ljava/lang/Float;)Lcom/robinhood/android/charts/model/Fill$RadialGradientFill;", "equals", "", "other", "", "hashCode", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class RadialGradientFill implements Fill {
        public static final int $stable = 8;
        private final Integer blur;
        private final List<Tuples2<Float, Color>> colorStops;
        private final Float drawLayer;
        private final Point point;
        private final float radius;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$3(RadialGradientFill radialGradientFill, BoxScope boxScope, int i, Composer composer, int i2) {
            radialGradientFill.Content(boxScope, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
            return Unit.INSTANCE;
        }

        public static /* synthetic */ RadialGradientFill copy$default(RadialGradientFill radialGradientFill, Point point, float f, List list, Integer num, Float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                point = radialGradientFill.point;
            }
            if ((i & 2) != 0) {
                f = radialGradientFill.radius;
            }
            if ((i & 4) != 0) {
                list = radialGradientFill.colorStops;
            }
            if ((i & 8) != 0) {
                num = radialGradientFill.blur;
            }
            if ((i & 16) != 0) {
                f2 = radialGradientFill.drawLayer;
            }
            Float f3 = f2;
            List list2 = list;
            return radialGradientFill.copy(point, f, list2, num, f3);
        }

        /* renamed from: component1, reason: from getter */
        public final Point getPoint() {
            return this.point;
        }

        /* renamed from: component2, reason: from getter */
        public final float getRadius() {
            return this.radius;
        }

        public final List<Tuples2<Float, Color>> component3() {
            return this.colorStops;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getBlur() {
            return this.blur;
        }

        /* renamed from: component5, reason: from getter */
        public final Float getDrawLayer() {
            return this.drawLayer;
        }

        public final RadialGradientFill copy(Point point, float radius, List<Tuples2<Float, Color>> colorStops, Integer blur, Float drawLayer) {
            Intrinsics.checkNotNullParameter(point, "point");
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            return new RadialGradientFill(point, radius, colorStops, blur, drawLayer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RadialGradientFill)) {
                return false;
            }
            RadialGradientFill radialGradientFill = (RadialGradientFill) other;
            return Intrinsics.areEqual(this.point, radialGradientFill.point) && Float.compare(this.radius, radialGradientFill.radius) == 0 && Intrinsics.areEqual(this.colorStops, radialGradientFill.colorStops) && Intrinsics.areEqual(this.blur, radialGradientFill.blur) && Intrinsics.areEqual((Object) this.drawLayer, (Object) radialGradientFill.drawLayer);
        }

        public int hashCode() {
            int iHashCode = ((((this.point.hashCode() * 31) + Float.hashCode(this.radius)) * 31) + this.colorStops.hashCode()) * 31;
            Integer num = this.blur;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Float f = this.drawLayer;
            return iHashCode2 + (f != null ? f.hashCode() : 0);
        }

        public String toString() {
            return "RadialGradientFill(point=" + this.point + ", radius=" + this.radius + ", colorStops=" + this.colorStops + ", blur=" + this.blur + ", drawLayer=" + this.drawLayer + ")";
        }

        public RadialGradientFill(Point point, float f, List<Tuples2<Float, Color>> colorStops, Integer num, Float f2) {
            Intrinsics.checkNotNullParameter(point, "point");
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            this.point = point;
            this.radius = f;
            this.colorStops = colorStops;
            this.blur = num;
            this.drawLayer = f2;
        }

        public /* synthetic */ RadialGradientFill(Point point, float f, List list, Integer num, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(point, f, list, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : f2);
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void BoxScopeContent(BoxScope boxScope, Composer composer, int i) {
            DefaultImpls.BoxScopeContent(this, boxScope, composer, i);
        }

        public final Point getPoint() {
            return this.point;
        }

        public final float getRadius() {
            return this.radius;
        }

        public final List<Tuples2<Float, Color>> getColorStops() {
            return this.colorStops;
        }

        public final Integer getBlur() {
            return this.blur;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public Float getDrawLayer() {
            return this.drawLayer;
        }

        @Override // com.robinhood.android.charts.model.ChartAnnotation
        public void Content(final BoxScope boxScope, Composer composer, final int i) {
            int i2;
            Modifier modifierM6448blurF8QBwvs;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Composer composerStartRestartGroup = composer.startRestartGroup(-43725322);
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
                    ComposerKt.traceEventStart(-43725322, i2, -1, "com.robinhood.android.charts.model.Fill.RadialGradientFill.Content (Fill.kt:295)");
                }
                Modifier modifierMatchParentSize = boxScope.matchParentSize(Modifier.INSTANCE);
                if (this.blur != null && (modifierM6448blurF8QBwvs = Blur.m6448blurF8QBwvs(modifierMatchParentSize, C2002Dp.m7995constructorimpl(r1.intValue()), Blur3.INSTANCE.m6457getUnboundedGoahg())) != null) {
                    modifierMatchParentSize = modifierM6448blurF8QBwvs;
                }
                Float drawLayer = getDrawLayer();
                Modifier modifierZIndex = ZIndexModifier2.zIndex(modifierMatchParentSize, drawLayer != null ? drawLayer.floatValue() : 2.0f);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.model.Fill$RadialGradientFill$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Fill.RadialGradientFill.Content$lambda$2$lambda$1(this.f$0, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierZIndex, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.model.Fill$RadialGradientFill$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Fill.RadialGradientFill.Content$lambda$3(this.f$0, boxScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Content$lambda$2$lambda$1(RadialGradientFill radialGradientFill, DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            Rect rectM6592toRectuvyYCjk = SizeKt.m6592toRectuvyYCjk(Canvas.mo6963getSizeNHjbRc());
            long translation = RectExtensions.getTranslation(rectM6592toRectuvyYCjk, radialGradientFill.point);
            float f = radialGradientFill.radius;
            Brush.Companion companion = Brush.INSTANCE;
            Tuples2[] tuples2Arr = (Tuples2[]) radialGradientFill.colorStops.toArray(new Tuples2[0]);
            DrawScope.m6946drawCircleV9BoPsw$default(Canvas, Brush.Companion.m6681radialGradientP_VxKs$default(companion, (Tuples2[]) Arrays.copyOf(tuples2Arr, tuples2Arr.length), RectExtensions.getTranslation(rectM6592toRectuvyYCjk, radialGradientFill.point), radialGradientFill.radius, 0, 8, (Object) null), f, translation, 0.0f, null, null, 0, 120, null);
            return Unit.INSTANCE;
        }
    }
}

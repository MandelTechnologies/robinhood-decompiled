package com.robinhood.android.charts.segmented;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Line;
import com.robinhood.android.charts.model.Point;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: util.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001aI\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001c\u001a\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\u0006\u0010\u000e\u001a\u00020\u000f\u001a=\u0010\u001e\u001a\u0004\u0018\u0001H\u001f\"\u0004\b\u0000\u0010\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001f0\u00122\u0006\u0010!\u001a\u00020\u001b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u00020\u001b0#¢\u0006\u0002\u0010$¨\u0006%"}, m3636d2 = {"defaultSolidDrawStyle", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "width", "Landroidx/compose/ui/unit/Dp;", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "defaultSolidDrawStyle-XjzXdws", "(FILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/drawscope/Stroke;", "defaultDottedDrawStyle", "strokeWidth", "defaultDottedDrawStyle-kHDZbjc", "(FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/drawscope/Stroke;", "buildScrubLine", "Lcom/robinhood/android/charts/model/Line;", "point", "Lcom/robinhood/android/charts/model/Point;", "(Lcom/robinhood/android/charts/model/Point;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/model/Line;", "mapSegmentedLinesWithScrubPoint", "", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "lines", "Lcom/robinhood/android/charts/segmented/SegmentedLine;", "scrubPoint", "scrubLineType", "Lcom/robinhood/android/charts/segmented/ScrubLineType;", "lineRevealAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Ljava/util/List;Lcom/robinhood/android/charts/model/Point;Lcom/robinhood/android/charts/segmented/ScrubLineType;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Ljava/util/List;", "getHorizontalScrubPoint", "getClosestItemByValue", "T", "list", "target", "valueTransformer", "Lkotlin/Function1;", "(Ljava/util/List;FLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UtilKt {
    /* renamed from: defaultSolidDrawStyle-XjzXdws, reason: not valid java name */
    public static final Stroke m12136defaultSolidDrawStyleXjzXdws(float f, int i, Composer composer, int i2, int i3) {
        composer.startReplaceGroup(-1213347478);
        if ((i3 & 2) != 0) {
            i = StrokeCap.INSTANCE.m6849getRoundKaPHkGw();
        }
        int i4 = i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1213347478, i2, -1, "com.robinhood.android.charts.segmented.defaultSolidDrawStyle (util.kt:20)");
        }
        Stroke stroke = new Stroke(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f), 0.0f, i4, StrokeJoin.INSTANCE.m6857getRoundLxFBmk8(), null, 18, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stroke;
    }

    public static final Line buildScrubLine(Point point, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(point, "point");
        composer.startReplaceGroup(507938120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(507938120, i, -1, "com.robinhood.android.charts.segmented.buildScrubLine (util.kt:53)");
        }
        Line line = new Line(CollectionsKt.listOf((Object[]) new Point[]{Point.copy$default(point, 0.0f, 0.0f, 1, null), Point.copy$default(point, 0.0f, 1.0f, 1, null)}), ((Styles) composer.consume(Styles2.getLocalStyles())).getChart(composer, 0).m21727getScrubLineColor0d7_KjU(), null, m12136defaultSolidDrawStyleXjzXdws(((Styles) composer.consume(Styles2.getLocalStyles())).getChart(composer, 0).m21728getScrubLineStrokeWidthD9Ej5fM(), 0, composer, 0, 2), null, null, 52, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return line;
    }

    public static final List<ChartAnnotation> mapSegmentedLinesWithScrubPoint(List<? extends SegmentedLine> lines, Point point, ScrubLineType scrubLineType, AnimationSpec<Float> animationSpec, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(lines, "lines");
        composer.startReplaceGroup(1901818033);
        Line lineBuildScrubLine = null;
        if ((i2 & 2) != 0) {
            point = null;
        }
        if ((i2 & 4) != 0) {
            scrubLineType = ScrubLineType.DEFAULT;
        }
        if ((i2 & 8) != 0) {
            animationSpec = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1901818033, i, -1, "com.robinhood.android.charts.segmented.mapSegmentedLinesWithScrubPoint (util.kt:70)");
        }
        composer.startReplaceGroup(-2008929145);
        if (point != null && scrubLineType == ScrubLineType.DEFAULT) {
            lineBuildScrubLine = buildScrubLine(point, composer, (i >> 3) & 14);
        }
        composer.endReplaceGroup();
        List<? extends SegmentedLine> list = lines;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SegmentedLine) it.next()).toChartAnnotations(point, animationSpec, composer, ((i >> 3) & 14) | ((i >> 6) & 112)));
        }
        List<ChartAnnotation> listPlus = CollectionsKt.plus((Collection) CollectionsKt.flatten(arrayList), (Iterable) CollectionsKt.listOfNotNull(lineBuildScrubLine));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listPlus;
    }

    public static final Point getHorizontalScrubPoint(List<? extends SegmentedLine> lines, Point point) {
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(point, "point");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = lines.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((SegmentedLine) it.next()).getAllPoints$lib_charts_externalDebug());
        }
        return (Point) getClosestItemByValue(arrayList, point.getX(), new Function1() { // from class: com.robinhood.android.charts.segmented.UtilKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(UtilKt.getHorizontalScrubPoint$lambda$4((Point) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHorizontalScrubPoint$lambda$4(Point it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getX();
    }

    public static final <T> T getClosestItemByValue(List<? extends T> list, final float f, final Function1<? super T, Float> valueTransformer) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(valueTransformer, "valueTransformer");
        List listDistinct = CollectionsKt.distinct(CollectionsKt.sortedWith(list, new Comparator() { // from class: com.robinhood.android.charts.segmented.UtilKt$getClosestItemByValue$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Function1 function1 = valueTransformer;
                return ComparisonsKt.compareValues((Comparable) function1.invoke(t), (Comparable) function1.invoke(t2));
            }
        }));
        int iBinarySearch$default = CollectionsKt.binarySearch$default(listDistinct, 0, 0, new Function1() { // from class: com.robinhood.android.charts.segmented.UtilKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(UtilKt.getClosestItemByValue$lambda$5(valueTransformer, f, obj));
            }
        }, 3, (Object) null);
        if (iBinarySearch$default >= 0) {
            return (T) listDistinct.get(iBinarySearch$default);
        }
        int i = (-1) - iBinarySearch$default;
        if (i == 0) {
            return (T) CollectionsKt.firstOrNull(listDistinct);
        }
        if (i == listDistinct.size()) {
            return (T) CollectionsKt.lastOrNull(listDistinct);
        }
        int i2 = (-2) - iBinarySearch$default;
        if (valueTransformer.invoke((Object) listDistinct.get(i)).floatValue() - f > f - valueTransformer.invoke((Object) listDistinct.get(i2)).floatValue()) {
            i = i2;
        }
        return (T) listDistinct.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getClosestItemByValue$lambda$5(Function1 function1, float f, Object obj) {
        return Float.compare(((Number) function1.invoke(obj)).floatValue(), f);
    }

    /* renamed from: defaultDottedDrawStyle-kHDZbjc, reason: not valid java name */
    public static final Stroke m12135defaultDottedDrawStylekHDZbjc(float f, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-28526221);
        if ((i2 & 1) != 0) {
            f = C2002Dp.m7995constructorimpl(1);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-28526221, i, -1, "com.robinhood.android.charts.segmented.defaultDottedDrawStyle (util.kt:29)");
        }
        Stroke stroke = new Stroke(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f), 0.0f, StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), StrokeJoin.INSTANCE.m6857getRoundLxFBmk8(), PathEffect.INSTANCE.dashPathEffect(new float[]{1.0f, 10.0f}, 0.0f), 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stroke;
    }
}

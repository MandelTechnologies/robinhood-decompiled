package com.robinhood.android.charts.candlestick;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.model.Fill;
import com.robinhood.android.charts.model.Line;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.segmented.ScrubLineType;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.models.serverdriven.experimental.api.ChartLegendItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: util.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0001\u001aE\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a,\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0003*\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u00132\u0006\u0010\b\u001a\u00020\u0015¨\u0006\u0016"}, m3636d2 = {"getHorizontalScrubPoint", "Lcom/robinhood/android/charts/model/Point;", "fills", "", "Lcom/robinhood/android/charts/model/Fill;", "filteredScrubPoints", "", "", "point", "mapFillsWithScrubPoint", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "lines", "Lcom/robinhood/android/charts/segmented/SegmentedLine;", "scrubPoint", "scrubLineType", "Lcom/robinhood/android/charts/segmented/ScrubLineType;", "(Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/charts/model/Point;Lcom/robinhood/android/charts/segmented/ScrubLineType;Landroidx/compose/runtime/Composer;II)Ljava/util/List;", "getLegendList", "Lcom/robinhood/models/serverdriven/experimental/api/ChartLegendItem;", "", "", "Lcom/robinhood/models/serverdriven/experimental/api/Point;", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UtilKt {
    public static final Point getHorizontalScrubPoint(List<? extends Fill> fills, Set<Float> filteredScrubPoints, Point point) {
        Intrinsics.checkNotNullParameter(fills, "fills");
        Intrinsics.checkNotNullParameter(filteredScrubPoints, "filteredScrubPoints");
        Intrinsics.checkNotNullParameter(point, "point");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fills) {
            if (obj instanceof Fill.SolidFill) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((Fill.SolidFill) it.next()).getPoints());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            Point point2 = (Point) obj2;
            if (filteredScrubPoints.isEmpty() || filteredScrubPoints.contains(Float.valueOf(point2.getX()))) {
                arrayList3.add(obj2);
            }
        }
        return (Point) com.robinhood.android.charts.segmented.UtilKt.getClosestItemByValue(arrayList3, point.getX(), new Function1() { // from class: com.robinhood.android.charts.candlestick.UtilKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return Float.valueOf(UtilKt.getHorizontalScrubPoint$lambda$2((Point) obj3));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHorizontalScrubPoint$lambda$2(Point it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getX();
    }

    public static final List<ChartAnnotation> mapFillsWithScrubPoint(List<? extends Fill> fills, List<? extends SegmentedLine> lines, Point point, ScrubLineType scrubLineType, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(fills, "fills");
        Intrinsics.checkNotNullParameter(lines, "lines");
        composer.startReplaceGroup(-1986802230);
        if ((i2 & 4) != 0) {
            point = null;
        }
        if ((i2 & 8) != 0) {
            scrubLineType = ScrubLineType.DEFAULT;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1986802230, i, -1, "com.robinhood.android.charts.candlestick.mapFillsWithScrubPoint (util.kt:30)");
        }
        composer.startReplaceGroup(1943511488);
        Line lineBuildScrubLine = (point == null || scrubLineType != ScrubLineType.DEFAULT) ? null : com.robinhood.android.charts.segmented.UtilKt.buildScrubLine(point, composer, (i >> 6) & 14);
        composer.endReplaceGroup();
        List<? extends SegmentedLine> list = lines;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SegmentedLine) it.next()).toChartAnnotations(point, null, composer, ((i >> 6) & 14) | 48));
        }
        List<ChartAnnotation> listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) fills, (Iterable) CollectionsKt.listOfNotNull(lineBuildScrubLine)), (Iterable) CollectionsKt.flatten(arrayList));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listPlus;
    }

    public static final List<ChartLegendItem> getLegendList(Map<String, ? extends List<ChartLegendItem>> map, com.robinhood.models.serverdriven.experimental.api.Point point) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(point, "point");
        String str = (String) com.robinhood.android.charts.segmented.UtilKt.getClosestItemByValue(CollectionsKt.toList(map.keySet()), point.getX(), new Function1() { // from class: com.robinhood.android.charts.candlestick.UtilKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Float.valueOf(UtilKt.getLegendList$lambda$4((String) obj));
            }
        });
        if (str != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getLegendList$lambda$4(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Float.parseFloat(it);
    }
}

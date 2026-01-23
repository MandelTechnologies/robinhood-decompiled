package com.robinhood.android.options.lib.simulatedreturn.chart;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsGridLine;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsLine;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsPoint;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsSegment;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionsSimulatedReturnChartViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aA\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"createOptionsSimulatedReturnChartXAxisLabels", "", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisLabel;", "gridlines", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;", "usePreTradeStyle", "", "(Lkotlinx/collections/immutable/ImmutableList;ZLandroidx/compose/runtime/Composer;I)Ljava/util/List;", "createOptionsSimulatedReturnChartYAxisLabels", "maxProfit", "maxLoss", "(Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;Landroidx/compose/runtime/Composer;II)Ljava/util/List;", "createOptionsSimulatedReturnChartSegmentedLine", "Lcom/robinhood/android/charts/segmented/SegmentedLine$Default;", "line", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLine;", "(Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsLine;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/segmented/SegmentedLine$Default;", "lib-options-simulated-return_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewStateKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnChartViewState4 {
    public static final List<OptionsSimulatedReturnChartAxisLabel> createOptionsSimulatedReturnChartXAxisLabels(ImmutableList<SimulatedReturnsGridLine> gridlines, boolean z, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(gridlines, "gridlines");
        composer.startReplaceGroup(-2024123819);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2024123819, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.createOptionsSimulatedReturnChartXAxisLabels (OptionsSimulatedReturnChartViewState.kt:355)");
        }
        List<OptionsSimulatedReturnChartAxisLabel> listM16931createOptionsSimulatedReturnChartAxisLabelscf5BqRc = OptionsSimulatedChartUtils.m16931createOptionsSimulatedReturnChartAxisLabelscf5BqRc(gridlines, z, 0L, false, composer, SimulatedReturnsGridLine.$stable | (i & 14) | (i & 112), 12);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        long jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        composer.startReplaceGroup(437211383);
        long jM6725getTransparent0d7_KjU = z ? Color.INSTANCE.m6725getTransparent0d7_KjU() : bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        composer.endReplaceGroup();
        float f = 1;
        OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel = new OptionsSimulatedReturnChartAxisLabel("", 0.0f, jM6725getTransparent0d7_KjU, OptionsSimulatedChartUtils.m16933solidDrawStylekHDZbjc(C2002Dp.m7995constructorimpl(f), composer, 6, 0), jM21373getBg30d7_KjU, null, false, 96, null);
        long jM21373getBg30d7_KjU2 = bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        composer.startReplaceGroup(437220631);
        long jM6725getTransparent0d7_KjU2 = z ? Color.INSTANCE.m6725getTransparent0d7_KjU() : bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        composer.endReplaceGroup();
        List<OptionsSimulatedReturnChartAxisLabel> listSortedWith = CollectionsKt.sortedWith(CollectionsKt.plus((Collection) listM16931createOptionsSimulatedReturnChartAxisLabelscf5BqRc, (Iterable) CollectionsKt.listOf((Object[]) new OptionsSimulatedReturnChartAxisLabel[]{optionsSimulatedReturnChartAxisLabel, new OptionsSimulatedReturnChartAxisLabel("", 1.0f, jM6725getTransparent0d7_KjU2, OptionsSimulatedChartUtils.m16933solidDrawStylekHDZbjc(C2002Dp.m7995constructorimpl(f), composer, 6, 0), jM21373getBg30d7_KjU2, null, false, 96, null)})), new Comparator() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewStateKt$createOptionsSimulatedReturnChartXAxisLabels$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Float.valueOf(((OptionsSimulatedReturnChartAxisLabel) t).getPosition()), Float.valueOf(((OptionsSimulatedReturnChartAxisLabel) t2).getPosition()));
            }
        });
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listSortedWith;
    }

    public static final List<OptionsSimulatedReturnChartAxisLabel> createOptionsSimulatedReturnChartYAxisLabels(ImmutableList<SimulatedReturnsGridLine> gridlines, boolean z, SimulatedReturnsGridLine simulatedReturnsGridLine, SimulatedReturnsGridLine simulatedReturnsGridLine2, Composer composer, int i, int i2) {
        long jM21427getFg30d7_KjU;
        OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel;
        Intrinsics.checkNotNullParameter(gridlines, "gridlines");
        composer.startReplaceGroup(272915446);
        OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel2 = null;
        SimulatedReturnsGridLine simulatedReturnsGridLine3 = (i2 & 4) != 0 ? null : simulatedReturnsGridLine;
        SimulatedReturnsGridLine simulatedReturnsGridLine4 = (i2 & 8) != 0 ? null : simulatedReturnsGridLine2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(272915446, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.createOptionsSimulatedReturnChartYAxisLabels (OptionsSimulatedReturnChartViewState.kt:383)");
        }
        if (z) {
            composer.startReplaceGroup(51442975);
            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(51493567);
            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
            composer.endReplaceGroup();
        }
        List<OptionsSimulatedReturnChartAxisLabel> listM16931createOptionsSimulatedReturnChartAxisLabelscf5BqRc = OptionsSimulatedChartUtils.m16931createOptionsSimulatedReturnChartAxisLabelscf5BqRc(gridlines, z, jM21427getFg30d7_KjU, false, composer, SimulatedReturnsGridLine.$stable | (i & 14) | (i & 112), 8);
        composer.startReplaceGroup(278758951);
        if (simulatedReturnsGridLine3 == null) {
            optionsSimulatedReturnChartAxisLabel = null;
        } else {
            String label = simulatedReturnsGridLine3.getLabel();
            float position = (float) simulatedReturnsGridLine3.getPosition();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            optionsSimulatedReturnChartAxisLabel = new OptionsSimulatedReturnChartAxisLabel(label, position, bentoTheme.getColors(composer, i3).m21456getPositive0d7_KjU(), OptionsSimulatedChartUtils.m16932dottedDrawStyleKz89ssw(C2002Dp.m7995constructorimpl(1), 3.0f, 0.0f, composer, 54, 4), bentoTheme.getColors(composer, i3).m21456getPositive0d7_KjU(), FontWeight.INSTANCE.getBold(), true, null);
        }
        composer.endReplaceGroup();
        if (simulatedReturnsGridLine4 != null) {
            String label2 = simulatedReturnsGridLine4.getLabel();
            float position2 = (float) simulatedReturnsGridLine4.getPosition();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            optionsSimulatedReturnChartAxisLabel2 = new OptionsSimulatedReturnChartAxisLabel(label2, position2, bentoTheme2.getColors(composer, i4).m21452getNegative0d7_KjU(), OptionsSimulatedChartUtils.m16932dottedDrawStyleKz89ssw(C2002Dp.m7995constructorimpl(1), 3.0f, 0.0f, composer, 54, 4), bentoTheme2.getColors(composer, i4).m21452getNegative0d7_KjU(), FontWeight.INSTANCE.getBold(), true, null);
        }
        List<OptionsSimulatedReturnChartAxisLabel> listSortedWith = CollectionsKt.sortedWith(CollectionsKt.plus((Collection) listM16931createOptionsSimulatedReturnChartAxisLabelscf5BqRc, (Iterable) CollectionsKt.listOfNotNull((Object[]) new OptionsSimulatedReturnChartAxisLabel[]{optionsSimulatedReturnChartAxisLabel, optionsSimulatedReturnChartAxisLabel2})), new Comparator() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartViewStateKt$createOptionsSimulatedReturnChartYAxisLabels$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Float.valueOf(((OptionsSimulatedReturnChartAxisLabel) t).getPosition()), Float.valueOf(((OptionsSimulatedReturnChartAxisLabel) t2).getPosition()));
            }
        });
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listSortedWith;
    }

    public static final SegmentedLine.Default createOptionsSimulatedReturnChartSegmentedLine(SimulatedReturnsLine line, Composer composer, int i) {
        long jM21452getNegative0d7_KjU;
        Intrinsics.checkNotNullParameter(line, "line");
        composer.startReplaceGroup(-1388592033);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1388592033, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.createOptionsSimulatedReturnChartSegmentedLine (OptionsSimulatedReturnChartViewState.kt:420)");
        }
        List<SimulatedReturnsSegment> segments = line.getSegments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, 10));
        for (SimulatedReturnsSegment simulatedReturnsSegment : segments) {
            List<SimulatedReturnsPoint> points = simulatedReturnsSegment.getPoints();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
            for (SimulatedReturnsPoint simulatedReturnsPoint : points) {
                arrayList2.add(new Point((float) simulatedReturnsPoint.getX(), (float) simulatedReturnsPoint.getY()));
            }
            if (simulatedReturnsSegment.isPositive()) {
                composer.startReplaceGroup(753908361);
                jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
            } else {
                composer.startReplaceGroup(753909385);
                jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
            }
            composer.endReplaceGroup();
            arrayList.add(new SegmentedLine.Segment(arrayList2, new SegmentedLine.Style.Solid(jM21452getNegative0d7_KjU, null, C2002Dp.m7995constructorimpl((float) 2.5d), StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), 2, null)));
        }
        SegmentedLine.Default r1 = new SegmentedLine.Default(arrayList, null, 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return r1;
    }
}

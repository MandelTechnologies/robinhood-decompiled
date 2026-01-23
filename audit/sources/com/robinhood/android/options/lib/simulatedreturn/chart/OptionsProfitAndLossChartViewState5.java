package com.robinhood.android.options.lib.simulatedreturn.chart;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossSegment;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsGridLine;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionsProfitAndLossChartViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\r\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\r¨\u0006\u000f"}, m3636d2 = {"createOptionsProfitLAndLossChartSegmentedLine", "Lcom/robinhood/android/charts/segmented/SegmentedLine$Default;", "segments", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossSegment;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/segmented/SegmentedLine$Default;", "createOptionsProfitAndLossChartXAxisLabels", "", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisLabel;", "gridLines", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;", "usePreTradeStyle", "", "(Lkotlinx/collections/immutable/ImmutableList;ZLandroidx/compose/runtime/Composer;I)Ljava/util/List;", "createOptionsProfitAndLossChartYAxisLabels", "lib-options-simulated-return_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewStateKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsProfitAndLossChartViewState5 {

    /* compiled from: OptionsProfitAndLossChartViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsProfitAndLossSegment.Sign.values().length];
            try {
                iArr[OptionsProfitAndLossSegment.Sign.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsProfitAndLossSegment.Sign.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionsProfitAndLossSegment.Sign.ZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<OptionsSimulatedReturnChartAxisLabel> createOptionsProfitAndLossChartXAxisLabels(ImmutableList<SimulatedReturnsGridLine> immutableList, boolean z, Composer composer, int i) {
        composer.startReplaceGroup(-259647595);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-259647595, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.createOptionsProfitAndLossChartXAxisLabels (OptionsProfitAndLossChartViewState.kt:459)");
        }
        List<OptionsSimulatedReturnChartAxisLabel> listM16931createOptionsSimulatedReturnChartAxisLabelscf5BqRc = OptionsSimulatedChartUtils.m16931createOptionsSimulatedReturnChartAxisLabelscf5BqRc(immutableList, z, 0L, false, composer, SimulatedReturnsGridLine.$stable | (i & 14) | (i & 112), 12);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        long jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        composer.startReplaceGroup(-413220745);
        long jM6725getTransparent0d7_KjU = z ? Color.INSTANCE.m6725getTransparent0d7_KjU() : bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        composer.endReplaceGroup();
        float f = 1;
        OptionsSimulatedReturnChartAxisLabel optionsSimulatedReturnChartAxisLabel = new OptionsSimulatedReturnChartAxisLabel("", 0.0f, jM6725getTransparent0d7_KjU, OptionsSimulatedChartUtils.m16933solidDrawStylekHDZbjc(C2002Dp.m7995constructorimpl(f), composer, 6, 0), jM21373getBg30d7_KjU, null, false, 96, null);
        long jM21373getBg30d7_KjU2 = bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        composer.startReplaceGroup(-413211433);
        long jM6725getTransparent0d7_KjU2 = z ? Color.INSTANCE.m6725getTransparent0d7_KjU() : bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        composer.endReplaceGroup();
        List<OptionsSimulatedReturnChartAxisLabel> listSortedWith = CollectionsKt.sortedWith(CollectionsKt.plus((Collection) listM16931createOptionsSimulatedReturnChartAxisLabelscf5BqRc, (Iterable) CollectionsKt.listOf((Object[]) new OptionsSimulatedReturnChartAxisLabel[]{optionsSimulatedReturnChartAxisLabel, new OptionsSimulatedReturnChartAxisLabel("", 1.0f, jM6725getTransparent0d7_KjU2, OptionsSimulatedChartUtils.m16933solidDrawStylekHDZbjc(C2002Dp.m7995constructorimpl(f), composer, 6, 0), jM21373getBg30d7_KjU2, null, false, 96, null)})), new Comparator() { // from class: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewStateKt$createOptionsProfitAndLossChartXAxisLabels$$inlined$sortedBy$1
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<OptionsSimulatedReturnChartAxisLabel> createOptionsProfitAndLossChartYAxisLabels(ImmutableList<SimulatedReturnsGridLine> immutableList, boolean z, Composer composer, int i) {
        composer.startReplaceGroup(-337637866);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-337637866, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.createOptionsProfitAndLossChartYAxisLabels (OptionsProfitAndLossChartViewState.kt:482)");
        }
        List<OptionsSimulatedReturnChartAxisLabel> listM16931createOptionsSimulatedReturnChartAxisLabelscf5BqRc = OptionsSimulatedChartUtils.m16931createOptionsSimulatedReturnChartAxisLabelscf5BqRc(immutableList, z, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), true, composer, SimulatedReturnsGridLine.$stable | 3072 | (i & 14) | (i & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listM16931createOptionsSimulatedReturnChartAxisLabelscf5BqRc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SegmentedLine.Default createOptionsProfitLAndLossChartSegmentedLine(ImmutableList<OptionsProfitAndLossSegment> segments, Composer composer, int i) {
        long jM21456getPositive0d7_KjU;
        Intrinsics.checkNotNullParameter(segments, "segments");
        composer.startReplaceGroup(-31252274);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-31252274, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.createOptionsProfitLAndLossChartSegmentedLine (OptionsProfitAndLossChartViewState.kt:431)");
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(segments, 10));
        Iterator<OptionsProfitAndLossSegment> it = segments.iterator();
        while (true) {
            int i2 = 2;
            if (!it.hasNext()) {
                SegmentedLine.Default r0 = new SegmentedLine.Default(arrayList, null, i2, 0 == true ? 1 : 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return r0;
            }
            OptionsProfitAndLossSegment next = it.next();
            List<OptionsSimulatedReturnChartPoint> points = next.getPoints();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
            for (OptionsSimulatedReturnChartPoint optionsSimulatedReturnChartPoint : points) {
                arrayList2.add(new Point(optionsSimulatedReturnChartPoint.getX(), optionsSimulatedReturnChartPoint.getY()));
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[next.getSign().ordinal()];
            if (i3 == 1) {
                composer.startReplaceGroup(-1184698205);
                jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
                composer.endReplaceGroup();
            } else if (i3 == 2) {
                composer.startReplaceGroup(-1184695133);
                jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
                composer.endReplaceGroup();
            } else {
                if (i3 != 3) {
                    composer.startReplaceGroup(-1184701380);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1184692195);
                jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            }
            arrayList.add(new SegmentedLine.Segment(arrayList2, new SegmentedLine.Style.Solid(jM21456getPositive0d7_KjU, null, C2002Dp.m7995constructorimpl((float) 1.5d), StrokeCap.INSTANCE.m6849getRoundKaPHkGw(), 2, null)));
        }
    }
}

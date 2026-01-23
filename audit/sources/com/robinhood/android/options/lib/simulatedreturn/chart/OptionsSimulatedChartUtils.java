package com.robinhood.android.options.lib.simulatedreturn.chart;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.options.simulatedreturnschart.SimulatedReturnsGridLine;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionsSimulatedChartUtils.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"createOptionsSimulatedReturnChartAxisLabels", "", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisLabel;", "gridlines", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/simulatedreturnschart/SimulatedReturnsGridLine;", "usePreTradeStyle", "", "boldLineColor", "Landroidx/compose/ui/graphics/Color;", "isPriority", "createOptionsSimulatedReturnChartAxisLabels-cf5BqRc", "(Lkotlinx/collections/immutable/ImmutableList;ZJZLandroidx/compose/runtime/Composer;II)Ljava/util/List;", "dottedDrawStyle", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "width", "Landroidx/compose/ui/unit/Dp;", "lengthMultiplier", "", "gapMultiplier", "dottedDrawStyle-Kz89ssw", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/drawscope/Stroke;", "solidDrawStyle", "solidDrawStyle-kHDZbjc", "(FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/drawscope/Stroke;", "getPreTradeScrubColor", "state", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;", "(Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartScrubState;Landroidx/compose/runtime/Composer;I)J", "lib-options-simulated-return_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartUtilsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedChartUtils {

    /* compiled from: OptionsSimulatedChartUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsSimulatedChartScrubState.values().length];
            try {
                iArr[OptionsSimulatedChartScrubState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsSimulatedChartScrubState.SCRUB_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionsSimulatedChartScrubState.SCRUB_PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: createOptionsSimulatedReturnChartAxisLabels-cf5BqRc, reason: not valid java name */
    public static final List<OptionsSimulatedReturnChartAxisLabel> m16931createOptionsSimulatedReturnChartAxisLabelscf5BqRc(ImmutableList<SimulatedReturnsGridLine> gridlines, boolean z, long j, boolean z2, Composer composer, int i, int i2) {
        float fM7995constructorimpl;
        Stroke strokeM16932dottedDrawStyleKz89ssw;
        long jM21427getFg30d7_KjU;
        long j2;
        long jM21426getFg20d7_KjU;
        Intrinsics.checkNotNullParameter(gridlines, "gridlines");
        composer.startReplaceGroup(1740874015);
        long jM21427getFg30d7_KjU2 = (i2 & 4) != 0 ? BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU() : j;
        boolean z3 = (i2 & 8) != 0 ? false : z2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1740874015, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.createOptionsSimulatedReturnChartAxisLabels (OptionsSimulatedChartUtils.kt:22)");
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(gridlines, 10));
        for (SimulatedReturnsGridLine simulatedReturnsGridLine : gridlines) {
            if (!simulatedReturnsGridLine.isBold()) {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
            } else {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl((float) 1.5d);
            }
            if (simulatedReturnsGridLine.isBold()) {
                composer.startReplaceGroup(-999455550);
                strokeM16932dottedDrawStyleKz89ssw = m16933solidDrawStylekHDZbjc(fM7995constructorimpl, composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-999395999);
                strokeM16932dottedDrawStyleKz89ssw = m16932dottedDrawStyleKz89ssw(fM7995constructorimpl, 0.0f, 0.0f, composer, 0, 6);
                composer.endReplaceGroup();
            }
            Stroke stroke = strokeM16932dottedDrawStyleKz89ssw;
            if (simulatedReturnsGridLine.isBold()) {
                composer.startReplaceGroup(1768880471);
                composer.endReplaceGroup();
                j2 = jM21427getFg30d7_KjU2;
            } else {
                if (z) {
                    composer.startReplaceGroup(1768882509);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU();
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1768883853);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composer.endReplaceGroup();
                }
                j2 = jM21427getFg30d7_KjU;
            }
            long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(j2, (float) simulatedReturnsGridLine.getOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            if (z) {
                composer.startReplaceGroup(-999073909);
                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-999023317);
                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
                composer.endReplaceGroup();
            }
            long jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(jM21426getFg20d7_KjU, (float) simulatedReturnsGridLine.getOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new OptionsSimulatedReturnChartAxisLabel(simulatedReturnsGridLine.getLabel(), (float) simulatedReturnsGridLine.getPosition(), jM6705copywmQWz5c$default, stroke, jM6705copywmQWz5c$default2, null, z3, 32, null));
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = arrayList;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return arrayList3;
    }

    public static final long getPreTradeScrubColor(OptionsSimulatedChartScrubState state, Composer composer, int i) {
        long jM21427getFg30d7_KjU;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceGroup(340790576);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(340790576, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.getPreTradeScrubColor (OptionsSimulatedChartUtils.kt:73)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(1082234355);
            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(1082236882);
            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
            composer.endReplaceGroup();
        } else {
            if (i2 != 3) {
                composer.startReplaceGroup(1082232122);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(1082239219);
            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21427getFg30d7_KjU;
    }

    /* renamed from: dottedDrawStyle-Kz89ssw, reason: not valid java name */
    public static final Stroke m16932dottedDrawStyleKz89ssw(float f, float f2, float f3, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-1303136581);
        if ((i2 & 1) != 0) {
            f = C2002Dp.m7995constructorimpl(1);
        }
        if ((i2 & 2) != 0) {
            f2 = 1.0f;
        }
        float f4 = (i2 & 4) != 0 ? 3.0f : f3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1303136581, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.dottedDrawStyle (OptionsSimulatedChartUtils.kt:54)");
        }
        float fMo5016toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f);
        Stroke stroke = new Stroke(fMo5016toPx0680j_4, 0.0f, StrokeCap.INSTANCE.m6848getButtKaPHkGw(), StrokeJoin.INSTANCE.m6856getMiterLxFBmk8(), PathEffect.INSTANCE.dashPathEffect(new float[]{f2 * fMo5016toPx0680j_4, f4 * fMo5016toPx0680j_4}, 0.0f), 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stroke;
    }

    /* renamed from: solidDrawStyle-kHDZbjc, reason: not valid java name */
    public static final Stroke m16933solidDrawStylekHDZbjc(float f, Composer composer, int i, int i2) {
        composer.startReplaceGroup(1397149056);
        if ((i2 & 1) != 0) {
            f = C2002Dp.m7995constructorimpl(1);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1397149056, i, -1, "com.robinhood.android.options.lib.simulatedreturn.chart.solidDrawStyle (OptionsSimulatedChartUtils.kt:68)");
        }
        Stroke stroke = new Stroke(((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f), 0.0f, 0, 0, null, 30, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stroke;
    }
}

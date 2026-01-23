package com.robinhood.android.lib.performancechart;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.models.serverdriven.experimental.api.PerformanceChartAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PerformanceSegmentedLineChart.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a^\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"PerformanceSegmentedLineChart", "", "modifier", "Landroidx/compose/ui/Modifier;", "chartModel", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/PerformanceChartAction;", "onScrub", "Lkotlin/Function1;", "Lcom/robinhood/android/charts/model/Point;", "Lkotlin/ParameterName;", "name", "scrubPoint", "onScrubStopped", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/models/portfolio/PerformanceChartModel;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-performance-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.performancechart.PerformanceSegmentedLineChartKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class PerformanceSegmentedLineChart {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PerformanceSegmentedLineChart$lambda$0(Modifier modifier, PerformanceChartModel performanceChartModel, SduiActionHandler sduiActionHandler, Function1 function1, Function0 function0, int i, int i2, Composer composer, int i3) {
        PerformanceSegmentedLineChart(modifier, performanceChartModel, sduiActionHandler, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PerformanceSegmentedLineChart(Modifier modifier, final PerformanceChartModel chartModel, final SduiActionHandler<? super PerformanceChartAction> actionHandler, final Function1<? super Point, Unit> onScrub, final Function0<Unit> onScrubStopped, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(chartModel, "chartModel");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onScrub, "onScrub");
        Intrinsics.checkNotNullParameter(onScrubStopped, "onScrubStopped");
        Composer composerStartRestartGroup = composer.startRestartGroup(1118949812);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(chartModel) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScrub) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScrubStopped) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1118949812, i3, -1, "com.robinhood.android.lib.performancechart.PerformanceSegmentedLineChart (PerformanceSegmentedLineChart.kt:21)");
            }
            List<ChartFill> fills = chartModel.getFills();
            Modifier modifier5 = modifier4;
            List<Line> lines = chartModel.getLines();
            List<UIComponent<PerformanceChartAction>> overlays = chartModel.getOverlays();
            int i5 = ((i3 << 15) & 1879048192) | (i3 & 14) | ((i3 << 6) & 57344) | ((i3 << 12) & 29360128);
            composerStartRestartGroup.startReplaceGroup(977840936);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<List<? extends com.robinhood.models.serverdriven.experimental.api.Point>, Unit>() { // from class: com.robinhood.android.lib.performancechart.PerformanceSegmentedLineChartKt$PerformanceSegmentedLineChart$$inlined$SduiSegmentedLineChart$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<com.robinhood.models.serverdriven.experimental.api.Point> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends com.robinhood.models.serverdriven.experimental.api.Point> list) {
                        invoke2((List<com.robinhood.models.serverdriven.experimental.api.Point>) list);
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i6 = 57358 & i5;
            int i7 = i5 >> 6;
            composer2 = composerStartRestartGroup;
            SduiChartMappersKt.SduiSegmentedLineChart(modifier5, fills, lines, overlays, actionHandler, onScrub, (Function1) objRememberedValue, onScrubStopped, false, true, null, 0.0f, PerformanceChartAction.class, composer2, i6 | (458752 & i7) | (i7 & 29360128), 0, 0);
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.performancechart.PerformanceSegmentedLineChartKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PerformanceSegmentedLineChart.PerformanceSegmentedLineChart$lambda$0(modifier3, chartModel, actionHandler, onScrub, onScrubStopped, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

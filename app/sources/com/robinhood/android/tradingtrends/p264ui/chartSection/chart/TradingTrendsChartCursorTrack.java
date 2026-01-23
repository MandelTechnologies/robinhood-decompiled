package com.robinhood.android.tradingtrends.p264ui.chartSection.chart;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.charts.cursor.ChartLabelTrack;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.sdui.chartgroup.ScrubState;
import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradingTrendsChartCursorTrack.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"TradingTrendsChartCursorTrack", "", "chartGroup", "Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "scrubState", "Lcom/robinhood/android/sdui/chartgroup/ScrubState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;Lcom/robinhood/android/sdui/chartgroup/ScrubState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-trading-trends_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorTrackKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TradingTrendsChartCursorTrack {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingTrendsChartCursorTrack$lambda$0(ChartGroup chartGroup, ScrubState scrubState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradingTrendsChartCursorTrack(chartGroup, scrubState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void TradingTrendsChartCursorTrack(final ChartGroup<? extends GenericAction> chartGroup, final ScrubState scrubState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Point point;
        Intrinsics.checkNotNullParameter(chartGroup, "chartGroup");
        Composer composerStartRestartGroup = composer.startRestartGroup(611354288);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(chartGroup) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(scrubState) : composerStartRestartGroup.changedInstance(scrubState) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(611354288, i3, -1, "com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorTrack (TradingTrendsChartCursorTrack.kt:18)");
            }
            ChartLabelTrack.ChartCursorTrack((scrubState == null || (point = scrubState.getPoint()) == null) ? null : Float.valueOf(point.getX()), modifier3, scrubState != null ? scrubState.getChartStartXOffset() : 0.0f, ComposableLambda3.rememberComposableLambda(438619671, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorTrackKt.TradingTrendsChartCursorTrack.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(438619671, i5, -1, "com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorTrack.<anonymous> (TradingTrendsChartCursorTrack.kt:24)");
                    }
                    ScrubState scrubState2 = scrubState;
                    if (scrubState2 != null) {
                        ChartGroup<GenericAction> chartGroup2 = chartGroup;
                        Float snapX = scrubState2.getSnapX();
                        TradingTrendsChartCursor4.TradingTrendsChartCursor(chartGroup2, snapX != null ? snapX.floatValue() : scrubState2.getPoint().getX(), null, composer2, 0, 4);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 112) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.chart.TradingTrendsChartCursorTrackKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingTrendsChartCursorTrack.TradingTrendsChartCursorTrack$lambda$0(chartGroup, scrubState, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

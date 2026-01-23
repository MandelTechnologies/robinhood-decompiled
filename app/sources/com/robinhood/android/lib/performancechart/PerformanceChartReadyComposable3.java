package com.robinhood.android.lib.performancechart;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.charts.ModifiersKt;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.lib.performancechart.PerformanceChartReadyComposable;
import com.robinhood.android.lib.performancechart.PerformanceChartStateProvider3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PerformanceChartReadyComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$1$1$4$1, reason: use source file name */
/* loaded from: classes8.dex */
final class PerformanceChartReadyComposable3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ PerformanceChartModel $chartModel;
    final /* synthetic */ SnapshotState<Boolean> $didScrub$delegate;
    final /* synthetic */ Component $eventComponent;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Screen $eventScreen;
    final /* synthetic */ Boolean $highlightChartForFtux;
    final /* synthetic */ Function0<Unit> $onEducationFocus;
    final /* synthetic */ SnapshotState<Point> $scrubPointState$delegate;
    final /* synthetic */ PerformanceChartStateProvider3.Ready $state;

    PerformanceChartReadyComposable3(PerformanceChartStateProvider3.Ready ready, Function0<Unit> function0, Boolean bool, PerformanceChartModel performanceChartModel, EventLogger eventLogger, Screen screen, Component component, SnapshotState<Point> snapshotState, SnapshotState<Boolean> snapshotState2) {
        this.$state = ready;
        this.$onEducationFocus = function0;
        this.$highlightChartForFtux = bool;
        this.$chartModel = performanceChartModel;
        this.$eventLogger = eventLogger;
        this.$eventScreen = screen;
        this.$eventComponent = component;
        this.$scrubPointState$delegate = snapshotState;
        this.$didScrub$delegate = snapshotState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1180407564, i, -1, "com.robinhood.android.lib.performancechart.PerformanceChartReadyComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PerformanceChartReadyComposable.kt:275)");
        }
        Modifier modifierHighlightIfNotNull = PerformanceChartReadyComposable.highlightIfNotNull(PerformanceChartReadyComposable.chartEducationTourId(ModifiersKt.fullWidthChartSize(Modifier.INSTANCE), this.$state.getChartType(), this.$onEducationFocus), this.$highlightChartForFtux);
        PerformanceChartModel performanceChartModel = this.$chartModel;
        SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer, 0);
        composer.startReplaceGroup(-1633490746);
        final SnapshotState<Point> snapshotState = this.$scrubPointState$delegate;
        final SnapshotState<Boolean> snapshotState2 = this.$didScrub$delegate;
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$1$1$4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PerformanceChartReadyComposable3.invoke$lambda$1$lambda$0(snapshotState, snapshotState2, (Point) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventScreen) | composer.changedInstance(this.$eventComponent) | composer.changedInstance(this.$state);
        final EventLogger eventLogger = this.$eventLogger;
        final Screen screen = this.$eventScreen;
        final Component component = this.$eventComponent;
        final PerformanceChartStateProvider3.Ready ready = this.$state;
        final SnapshotState<Point> snapshotState3 = this.$scrubPointState$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            Function0 function0 = new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$1$1$4$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerformanceChartReadyComposable3.invoke$lambda$3$lambda$2(eventLogger, screen, component, ready, snapshotState3);
                }
            };
            composer.updateRememberedValue(function0);
            objRememberedValue2 = function0;
        }
        composer.endReplaceGroup();
        PerformanceSegmentedLineChart.PerformanceSegmentedLineChart(modifierHighlightIfNotNull, performanceChartModel, sduiActionHandlerCurrentActionHandler, function1, (Function0) objRememberedValue2, composer, 3072, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, SnapshotState snapshotState2, Point it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        PerformanceChartReadyComposable.C205002.AnonymousClass1.invoke$lambda$25$lambda$5(snapshotState2, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, Screen screen, Component component, PerformanceChartStateProvider3.Ready ready, SnapshotState snapshotState) {
        EventLogger.DefaultImpls.logDrag$default(eventLogger, UserInteractionEventData.Action.SCRUB_LINE_CHART, screen, component, null, PerformanceChartReadyComposable.chartContext(ready.getActiveSpan(), ready), false, 40, null);
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}

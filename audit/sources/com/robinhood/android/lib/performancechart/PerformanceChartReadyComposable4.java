package com.robinhood.android.lib.performancechart;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.charts.span.SpanOptionsDynamicSelector;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.compose.ModifiersKt;
import com.robinhood.android.lib.performancechart.PerformanceChartReadyComposable;
import com.robinhood.android.lib.performancechart.PerformanceChartStateProvider3;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions2;
import com.robinhood.android.redesigninvesting.interactions.scrolling.LocalAccountTabScrollInteraction;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PerformanceChartReadyComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$1$1$5, reason: use source file name */
/* loaded from: classes8.dex */
final class PerformanceChartReadyComposable4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ PerformanceChartModel $chartModel;
    final /* synthetic */ SnapshotState<Boolean> $didScrub$delegate;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Screen $eventScreen;
    final /* synthetic */ Boolean $highlightChartForFtux;
    final /* synthetic */ Function0<Unit> $onEducationFocus;
    final /* synthetic */ Function1<String, Unit> $onSpanSelected;
    final /* synthetic */ PerformanceChartStateProvider3.Ready $state;
    final /* synthetic */ Function3<Row5, Composer, Integer, Unit> $trailingButtonOverride;

    /* JADX WARN: Multi-variable type inference failed */
    PerformanceChartReadyComposable4(PerformanceChartModel performanceChartModel, PerformanceChartStateProvider3.Ready ready, Function1<? super String, Unit> function1, EventLogger eventLogger, Screen screen, Function0<Unit> function0, Boolean bool, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, SnapshotState<Boolean> snapshotState) {
        this.$chartModel = performanceChartModel;
        this.$state = ready;
        this.$onSpanSelected = function1;
        this.$eventLogger = eventLogger;
        this.$eventScreen = screen;
        this.$onEducationFocus = function0;
        this.$highlightChartForFtux = bool;
        this.$trailingButtonOverride = function3;
        this.$didScrub$delegate = snapshotState;
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
            ComposerKt.traceEventStart(695805050, i, -1, "com.robinhood.android.lib.performancechart.PerformanceChartReadyComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PerformanceChartReadyComposable.kt:303)");
        }
        ImmutableList immutableList = extensions2.toImmutableList(this.$chartModel.getSpans().getAvailableSpans());
        String activeSpan = this.$state.getActiveSpan();
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = composer.changed(this.$onSpanSelected) | composer.changedInstance(this.$state) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventScreen);
        final Function1<String, Unit> function1 = this.$onSpanSelected;
        final PerformanceChartStateProvider3.Ready ready = this.$state;
        final EventLogger eventLogger = this.$eventLogger;
        final Screen screen = this.$eventScreen;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$1$1$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PerformanceChartReadyComposable4.invoke$lambda$1$lambda$0(function1, ready, eventLogger, screen, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function12 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        ComposableLambda composableLambdaRememberComposableLambda = null;
        Modifier modifierAccountTabScrollInteraction = AccountTabScrollInteractions2.accountTabScrollInteraction(PerformanceChartReadyComposable.highlightIfNotNull(ModifiersKt.educationTourId$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null), EducationTourElementIds.PERFORMANCE_CHART_SPAN_SELECTOR, null, this.$onEducationFocus, false, false, 26, null), this.$highlightChartForFtux), (AccountTabScrollInteractions) composer.consume(LocalAccountTabScrollInteraction.getLocalAccountTabScrollInteraction()));
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventScreen) | composer.changedInstance(this.$state);
        final EventLogger eventLogger2 = this.$eventLogger;
        final Screen screen2 = this.$eventScreen;
        final PerformanceChartStateProvider3.Ready ready2 = this.$state;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$1$1$5$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PerformanceChartReadyComposable4.invoke$lambda$3$lambda$2(eventLogger2, screen2, ready2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        if (this.$trailingButtonOverride != null) {
            composer.startReplaceGroup(1217840808);
            final Function3<Row5, Composer, Integer, Unit> function3 = this.$trailingButtonOverride;
            composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(2084832983, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$1$1$5.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                    invoke(row5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 SpanOptionsDynamicSelector, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(SpanOptionsDynamicSelector, "$this$SpanOptionsDynamicSelector");
                    if ((i2 & 6) == 0) {
                        i2 |= composer2.changed(SpanOptionsDynamicSelector) ? 4 : 2;
                    }
                    if ((i2 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2084832983, i2, -1, "com.robinhood.android.lib.performancechart.PerformanceChartReadyComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PerformanceChartReadyComposable.kt:336)");
                    }
                    function3.invoke(SpanOptionsDynamicSelector, composer2, Integer.valueOf(i2 & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54);
            composer.endReplaceGroup();
        } else if (this.$state.getShowSettings()) {
            composer.startReplaceGroup(1218065806);
            final PerformanceChartModel performanceChartModel = this.$chartModel;
            final PerformanceChartStateProvider3.Ready ready3 = this.$state;
            final SnapshotState<Boolean> snapshotState = this.$didScrub$delegate;
            composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-2140032128, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartReadyComposableKt$PerformanceChartReadyComposable$2$1$1$5.4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                    invoke(row5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 SpanOptionsDynamicSelector, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(SpanOptionsDynamicSelector, "$this$SpanOptionsDynamicSelector");
                    if ((i2 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2140032128, i2, -1, "com.robinhood.android.lib.performancechart.PerformanceChartReadyComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PerformanceChartReadyComposable.kt:342)");
                    }
                    PerformanceChartReadyComposable.PerformanceChartSettingsButton(performanceChartModel.getAccountNumber(), ready3.getChartType(), PerformanceChartReadyComposable.chartContext(ready3.getActiveSpan(), ready3), !PerformanceChartReadyComposable.C205002.AnonymousClass1.invoke$lambda$25$lambda$4(snapshotState) && ready3.getShowBenchmarksTooltip(), ready3.getSettingsTooltipTextResId(), null, composer2, 0, 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1218712899);
            composer.endReplaceGroup();
        }
        SpanOptionsDynamicSelector.SpanOptionsDynamicSelector(immutableList, activeSpan, function12, modifierAccountTabScrollInteraction, function0, false, composableLambdaRememberComposableLambda, composer, 0, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, PerformanceChartStateProvider3.Ready ready, EventLogger eventLogger, Screen screen, String selectedSpan) {
        Intrinsics.checkNotNullParameter(selectedSpan, "selectedSpan");
        function1.invoke(selectedSpan);
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CHANGE_CHART_SPAN, screen, PerformanceChartReadyComposable.spanSelectorComponent, null, PerformanceChartReadyComposable.chartContext(selectedSpan, ready), false, 40, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, Screen screen, PerformanceChartStateProvider3.Ready ready) {
        EventLogger.DefaultImpls.logScroll$default(eventLogger, null, screen, PerformanceChartReadyComposable.spanSelectorComponent, null, PerformanceChartReadyComposable.chartContext(ready.getActiveSpan(), ready), 9, null);
        return Unit.INSTANCE;
    }
}

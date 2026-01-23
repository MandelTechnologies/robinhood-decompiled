package com.robinhood.android.chart.blackwidowadvancedchart;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.IntervalSelector3;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.bottombar.ScrollingIntervalSelector3;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: InternalAdvancedChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$3$1$1$3, reason: use source file name */
/* loaded from: classes7.dex */
final class InternalAdvancedChart4 implements Function3<Row5, Composer, Integer, Unit> {
    final /* synthetic */ BottomBarState $bottomBarState;
    final /* synthetic */ BlackWidowAdvanceChartCallbacks $chartCallbacks;
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;

    InternalAdvancedChart4(BottomBarState bottomBarState, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks) {
        this.$bottomBarState = bottomBarState;
        this.$eventLogger = eventLogger;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$chartCallbacks = blackWidowAdvanceChartCallbacks;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
        invoke(row5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, IntervalDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, "IntervalSelector", null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, it.getLabel(), null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, null, 32763, null).getContext(), false, 41, null);
        blackWidowAdvanceChartCallbacks.onIntervalSelected(it);
        return Unit.INSTANCE;
    }

    public final void invoke(Row5 SpanSelector, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(SpanSelector, "$this$SpanSelector");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(130726780, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChart.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalAdvancedChart.kt:155)");
        }
        if (this.$bottomBarState.getScrollingIntervalPickerEnabled()) {
            composer.startReplaceGroup(-1053711358);
            IntervalSelectorState intervalSelectorState = this.$bottomBarState.getIntervalSelectorState();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$chartCallbacks);
            final EventLogger eventLogger = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks = this.$chartCallbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$3$1$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InternalAdvancedChart4.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, blackWidowAdvanceChartCallbacks, (IntervalDto) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks2 = this.$chartCallbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(blackWidowAdvanceChartCallbacks2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new InternalAdvancedChart5(blackWidowAdvanceChartCallbacks2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            ScrollingIntervalSelector3.ScrollingIntervalSelector(intervalSelectorState, function1, (Function0) ((KFunction) objRememberedValue2), null, composer, 0, 8);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1052463701);
            IntervalSelectorState intervalSelectorState2 = this.$bottomBarState.getIntervalSelectorState();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance3 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$chartCallbacks);
            final EventLogger eventLogger2 = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
            final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks3 = this.$chartCallbacks;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$3$1$1$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InternalAdvancedChart4.invoke$lambda$4$lambda$3(eventLogger2, userInteractionEventDescriptor2, blackWidowAdvanceChartCallbacks3, (IntervalDto) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function12 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks4 = this.$chartCallbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(blackWidowAdvanceChartCallbacks4);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new InternalAdvancedChart6(blackWidowAdvanceChartCallbacks4);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            IntervalSelector3.IntervalSelector(intervalSelectorState2, function12, (Function0) ((KFunction) objRememberedValue4), null, composer, 0, 8);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, IntervalDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, "IntervalSelector", null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, it.getLabel(), null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, null, 32763, null).getContext(), false, 41, null);
        blackWidowAdvanceChartCallbacks.onIntervalSelected(it);
        return Unit.INSTANCE;
    }
}

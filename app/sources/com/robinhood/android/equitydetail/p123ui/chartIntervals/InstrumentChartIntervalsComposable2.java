package com.robinhood.android.equitydetail.p123ui.chartIntervals;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.util.GraphSelection2;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableViewContext2;
import com.robinhood.android.equitydetail.p123ui.chartIntervals.InstrumentChartIntervalsStateProvider3;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartInterval;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.GraphContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstrumentChartIntervalsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsComposableKt$InstrumentChartIntervalsComposable$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class InstrumentChartIntervalsComposable2 implements Function3<InstrumentChartInterval, Composer, Integer, Unit> {
    final /* synthetic */ Function1<String, Unit> $onIntervalSelected;
    final /* synthetic */ InstrumentChartIntervalsStateProvider3 $state;

    /* JADX WARN: Multi-variable type inference failed */
    InstrumentChartIntervalsComposable2(InstrumentChartIntervalsStateProvider3 instrumentChartIntervalsStateProvider3, Function1<? super String, Unit> function1) {
        this.$state = instrumentChartIntervalsStateProvider3;
        this.$onIntervalSelected = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InstrumentChartInterval instrumentChartInterval, Composer composer, Integer num) {
        invoke(instrumentChartInterval, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final InstrumentChartInterval interval, Composer composer, int i) {
        Modifier modifierBentoPlaceholder$default;
        Intrinsics.checkNotNullParameter(interval, "interval");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(536323306, i, -1, "com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsComposable.<anonymous>.<anonymous> (InstrumentChartIntervalsComposable.kt:68)");
        }
        String title = interval.getTitle();
        if (this.$state instanceof InstrumentChartIntervalsStateProvider3.Ready) {
            Modifier.Companion companion = Modifier.INSTANCE;
            Component component = new Component(Component.ComponentType.CHIP, interval.getIntervalId(), null, 4, null);
            DisplaySpan displaySpanFromServerValue = DisplaySpan.INSTANCE.fromServerValue(((InstrumentChartIntervalsStateProvider3.Ready) this.$state).getSpanInterval().getSpanId());
            modifierBentoPlaceholder$default = ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, null, null, displaySpanFromServerValue != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new GraphContext(null, LoggableViewContext2.toSpanContextInterval(GraphSelection2.getEquityGraphSelection(displaySpanFromServerValue)), null, 5, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -67108865, -1, -1, -1, -1, 16383, null) : null, component, null, 39, null), false, false, false, true, false, null, 110, null);
        } else {
            modifierBentoPlaceholder$default = com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, true, null, 2, null);
        }
        InstrumentChartIntervalsStateProvider3 instrumentChartIntervalsStateProvider3 = this.$state;
        boolean z = instrumentChartIntervalsStateProvider3 instanceof InstrumentChartIntervalsStateProvider3.Ready;
        boolean z2 = (instrumentChartIntervalsStateProvider3 instanceof InstrumentChartIntervalsStateProvider3.Ready) && Intrinsics.areEqual(((InstrumentChartIntervalsStateProvider3.Ready) instrumentChartIntervalsStateProvider3).getSpanInterval().getSelectedInterval(), interval.getIntervalId());
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changedInstance(interval) | composer.changed(this.$onIntervalSelected);
        final InstrumentChartIntervalsStateProvider3 instrumentChartIntervalsStateProvider32 = this.$state;
        final Function1<String, Unit> function1 = this.$onIntervalSelected;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsComposableKt$InstrumentChartIntervalsComposable$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InstrumentChartIntervalsComposable2.invoke$lambda$2$lambda$1(instrumentChartIntervalsStateProvider32, interval, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoChip.BentoSelectionChip((Function0) objRememberedValue, modifierBentoPlaceholder$default, z, z2, null, title, composer, 0, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(InstrumentChartIntervalsStateProvider3 instrumentChartIntervalsStateProvider3, InstrumentChartInterval instrumentChartInterval, Function1 function1) {
        if ((instrumentChartIntervalsStateProvider3 instanceof InstrumentChartIntervalsStateProvider3.Ready) && !Intrinsics.areEqual(((InstrumentChartIntervalsStateProvider3.Ready) instrumentChartIntervalsStateProvider3).getSpanInterval().getSelectedInterval(), instrumentChartInterval.getIntervalId())) {
            function1.invoke(instrumentChartInterval.getIntervalId());
        }
        return Unit.INSTANCE;
    }
}

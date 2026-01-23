package com.robinhood.android.tradingtrends.p264ui.chartSection;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.sdui.chartgroup.ScrubState;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: TradingTrendsChartSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionKt$TradingTrendsChartSection$2$3$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class TradingTrendsChartSection4 implements Function1<ScrubState, Unit> {
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<Boolean> $ignoreFirstNull$delegate;
    final /* synthetic */ SnapshotState<ScrubState> $scrubState$delegate;

    TradingTrendsChartSection4(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, SnapshotState<ScrubState> snapshotState, SnapshotState<Boolean> snapshotState2) {
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$eventLogger = eventLogger;
        this.$scrubState$delegate = snapshotState;
        this.$ignoreFirstNull$delegate = snapshotState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ScrubState scrubState) {
        invoke2(scrubState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ScrubState scrubState) {
        this.$scrubState$delegate.setValue(scrubState);
        if (scrubState == null) {
            if (!TradingTrendsChartSection.TradingTrendsChartSection$lambda$17$lambda$12$lambda$7(this.$ignoreFirstNull$delegate)) {
                Component component = new Component(Component.ComponentType.TRADING_TRENDS_CHART, null, null, 6, null);
                EventLogger.DefaultImpls.logDrag$default(this.$eventLogger, null, this.$eventDescriptor.getScreen(), component, null, null, false, 57, null);
            }
            TradingTrendsChartSection.TradingTrendsChartSection$lambda$17$lambda$12$lambda$8(this.$ignoreFirstNull$delegate, false);
        }
    }
}

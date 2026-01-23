package com.robinhood.android.portfolio.pnlhub.p216ui;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.charts.model.Point;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PnlHubChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
final class PnlHubChartKt$PnlHubChart$2$6$1 implements Function1<Point, Unit> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<Point> $selectedPoint$delegate;
    final /* synthetic */ UserInteractionEventDescriptor $userInteractionEventDescriptor;

    PnlHubChartKt$PnlHubChart$2$6$1(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, SnapshotState<Point> snapshotState) {
        this.$userInteractionEventDescriptor = userInteractionEventDescriptor;
        this.$eventLogger = eventLogger;
        this.$selectedPoint$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Point point) {
        invoke2(point);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Point point) {
        Intrinsics.checkNotNullParameter(point, "point");
        if (PnlHubChartKt.PnlHubChart$lambda$1(this.$selectedPoint$delegate) == null) {
            Screen screen = this.$userInteractionEventDescriptor.getScreen();
            EventLogger.DefaultImpls.logTap$default(this.$eventLogger, UserInteractionEventData.Action.SCRUB, screen, new Component(Component.ComponentType.PNL_CHART, null, null, 6, null), null, null, false, 56, null);
        }
        this.$selectedPoint$delegate.setValue(point);
    }
}

package com.robinhood.shared.common.earnings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.sdui.chartgroup.ScrubState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import rh_server_driven_ui.p531v1.ChartGroupDto;

/* compiled from: EarningsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsContent$2$1$6, reason: use source file name */
/* loaded from: classes26.dex */
final class EarningsComposable6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<ScrubState> $scrubState$delegate;
    final /* synthetic */ ChartGroupDto $sduiChart;

    EarningsComposable6(SnapshotState<ScrubState> snapshotState, ChartGroupDto chartGroupDto) {
        this.$scrubState$delegate = snapshotState;
        this.$sduiChart = chartGroupDto;
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
            ComposerKt.traceEventStart(-2000901038, i, -1, "com.robinhood.shared.common.earnings.EarningsContent.<anonymous>.<anonymous>.<anonymous> (EarningsComposable.kt:335)");
        }
        ScrubState scrubStateEarningsContent$lambda$30$lambda$29$lambda$20 = EarningsComposable.EarningsContent$lambda$30$lambda$29$lambda$20(this.$scrubState$delegate);
        if (scrubStateEarningsContent$lambda$30$lambda$29$lambda$20 != null) {
            ChartGroupDto chartGroupDto = this.$sduiChart;
            Float snapX = scrubStateEarningsContent$lambda$30$lambda$29$lambda$20.getSnapX();
            EarningsComposable.EarningsChartCursor(chartGroupDto, snapX != null ? snapX.floatValue() : scrubStateEarningsContent$lambda$30$lambda$29$lambda$20.getPoint().getX(), null, composer, 0, 4);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

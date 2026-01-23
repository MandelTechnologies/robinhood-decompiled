package com.robinhood.android.chart.blackwidowadvancedchart;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4;
import com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderAction3;
import com.robinhood.android.chart.equityadvancedchart.EquityNbboDisplayBottomPopup;
import com.robinhood.android.chart.equityadvancedchart.MacEquityOrderState;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAdvancedChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$3$1$4, reason: use source file name */
/* loaded from: classes7.dex */
final class InternalAdvancedChart7 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ AdvanceChartOrderDuxo4 $orderCallbacks;
    final /* synthetic */ InstrumentOrderState $orderState;

    InternalAdvancedChart7(InstrumentOrderState instrumentOrderState, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4) {
        this.$orderState = instrumentOrderState;
        this.$orderCallbacks = advanceChartOrderDuxo4;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1079258495, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChart.<anonymous>.<anonymous>.<anonymous> (InternalAdvancedChart.kt:203)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        MacEquityOrderState macEquityOrderState = (MacEquityOrderState) this.$orderState;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$orderCallbacks);
        final AdvanceChartOrderDuxo4 advanceChartOrderDuxo4 = this.$orderCallbacks;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.InternalAdvancedChartKt$InternalAdvancedChart$3$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InternalAdvancedChart7.invoke$lambda$1$lambda$0(advanceChartOrderDuxo4);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EquityNbboDisplayBottomPopup.EquityNbboDisplayBottomPopup(macEquityOrderState, (Function0) objRememberedValue, companion, composer, MacEquityOrderState.$stable | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(AdvanceChartOrderDuxo4 advanceChartOrderDuxo4) {
        advanceChartOrderDuxo4.handleGenericAdvanceChartOrderAction(EquityAdvanceChartOrderAction3.INSTANCE);
        return Unit.INSTANCE;
    }
}

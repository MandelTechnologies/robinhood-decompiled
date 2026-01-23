package com.robinhood.android.futures.detail.p140ui.chart;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.charts.span.AdvancedChartSelector;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: FuturesDetailChartSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class FuturesDetailChartSectionKt$FuturesDetailChartSection$4$8 implements Function3<Row5, Composer, Integer, Unit> {
    final /* synthetic */ FuturesDetailChartCallbacks $callbacks;
    final /* synthetic */ Function1<UUID, Unit> $onOpenAdvancedChart;
    final /* synthetic */ SnapshotState4<FuturesDetailChartViewState> $viewState$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    FuturesDetailChartSectionKt$FuturesDetailChartSection$4$8(SnapshotState4<FuturesDetailChartViewState> snapshotState4, FuturesDetailChartCallbacks futuresDetailChartCallbacks, Function1<? super UUID, Unit> function1) {
        this.$viewState$delegate = snapshotState4;
        this.$callbacks = futuresDetailChartCallbacks;
        this.$onOpenAdvancedChart = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
        invoke(row5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(SnapshotState4 snapshotState4, FuturesDetailChartCallbacks futuresDetailChartCallbacks, Function1 function1) {
        UUID contractId = FuturesDetailChartSectionKt.FuturesDetailChartSection$lambda$7(snapshotState4).getContractId();
        if (contractId != null) {
            futuresDetailChartCallbacks.onAdvancedChartOpened();
            function1.invoke(contractId);
        }
        return Unit.INSTANCE;
    }

    public final void invoke(Row5 UnifiedDynamicSpanSelector, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(UnifiedDynamicSpanSelector, "$this$UnifiedDynamicSpanSelector");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1678160422, i, -1, "com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSection.<anonymous>.<anonymous> (FuturesDetailChartSection.kt:197)");
        }
        if (FuturesDetailChartSectionKt.FuturesDetailChartSection$lambda$7(this.$viewState$delegate).getShowAdvancedChartButton()) {
            composer.startReplaceGroup(657876052);
            boolean z = !FuturesDetailChartSectionKt.FuturesDetailChartSection$lambda$7(this.$viewState$delegate).getHasVisitedMac();
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$callbacks) | composer.changed(this.$onOpenAdvancedChart);
            final SnapshotState4<FuturesDetailChartViewState> snapshotState4 = this.$viewState$delegate;
            final FuturesDetailChartCallbacks futuresDetailChartCallbacks = this.$callbacks;
            final Function1<UUID, Unit> function1 = this.$onOpenAdvancedChart;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$FuturesDetailChartSection$4$8$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesDetailChartSectionKt$FuturesDetailChartSection$4$8.invoke$lambda$2$lambda$1(snapshotState4, futuresDetailChartCallbacks, function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AdvancedChartSelector.AdvancedChartSelector((Function0) objRememberedValue, z, null, composer, 0, 4);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(658294118);
            FuturesDetailChartCallbacks futuresDetailChartCallbacks2 = this.$callbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(futuresDetailChartCallbacks2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new FuturesDetailChartSectionKt$FuturesDetailChartSection$4$8$2$1(futuresDetailChartCallbacks2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            FuturesDetailChartSectionKt.ChartSettingsButton((Function0) ((KFunction) objRememberedValue2), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

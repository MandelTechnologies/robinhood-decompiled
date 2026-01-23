package com.robinhood.android.options.portfolioriskanalyzer;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartDuxo;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartViewState;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedChartLaunchMode;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartEvent;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartKt;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState;
import com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt;
import com.robinhood.android.udf.event.Event;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$2 */
/* loaded from: classes11.dex */
final class C23438xa20abbde implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ OptionsProfitAndLossChartDuxo $chartDuxo;
    final /* synthetic */ SnapshotState4<Event<OptionsSimulatedReturnChartEvent>> $chartEventState$delegate;
    final /* synthetic */ OptionsSimulatedChartLaunchMode.ProfitAndLoss $chartLaunchMode;
    final /* synthetic */ SnapshotState4<OptionsProfitAndLossChartViewState> $chartViewState$delegate;

    C23438xa20abbde(OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo, OptionsSimulatedChartLaunchMode.ProfitAndLoss profitAndLoss, SnapshotState4<OptionsProfitAndLossChartViewState> snapshotState4, SnapshotState4<Event<OptionsSimulatedReturnChartEvent>> snapshotState42) {
        this.$chartDuxo = optionsProfitAndLossChartDuxo;
        this.$chartLaunchMode = profitAndLoss;
        this.$chartViewState$delegate = snapshotState4;
        this.$chartEventState$delegate = snapshotState42;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> function3M2241x943116a0;
        Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> function3M2247x9ed9f985;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(446875569, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.LoadedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:277)");
        }
        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(200));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = InteractionSource2.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue);
        }
        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
        composer.endReplaceGroup();
        OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo = this.$chartDuxo;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(optionsProfitAndLossChartDuxo);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new C23439xe47eba79(optionsProfitAndLossChartDuxo);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM5156height3ABfNKs, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null);
        OptionsProfitAndLossChartViewState optionsProfitAndLossChartViewStateInvoke$lambda$40$lambda$11 = OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$11(this.$chartViewState$delegate);
        Event eventInvoke$lambda$40$lambda$12 = OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$12(this.$chartEventState$delegate);
        OptionsSimulatedChartLaunchMode.ProfitAndLoss profitAndLoss = this.$chartLaunchMode;
        boolean usePreTradeStyle = profitAndLoss != null ? profitAndLoss.getUsePreTradeStyle() : true;
        OptionsSimulatedChartLaunchMode.ProfitAndLoss profitAndLoss2 = this.$chartLaunchMode;
        Function1<Double, Unit> onEstimatedContractPriceUpdated = profitAndLoss2 != null ? profitAndLoss2.getOnEstimatedContractPriceUpdated() : null;
        composer.startReplaceGroup(-49280889);
        if (onEstimatedContractPriceUpdated == null) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C23438xa20abbde.invoke$lambda$3$lambda$2((Double) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            onEstimatedContractPriceUpdated = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        OptionsSimulatedChartLaunchMode.ProfitAndLoss profitAndLoss3 = this.$chartLaunchMode;
        Function1<OptionsSimulatedReturnErrorState, Unit> onErrorStateUpdated = profitAndLoss3 != null ? profitAndLoss3.getOnErrorStateUpdated() : null;
        composer.startReplaceGroup(-49277509);
        if (onErrorStateUpdated == null) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C23438xa20abbde.invoke$lambda$5$lambda$4((OptionsSimulatedReturnErrorState) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            onErrorStateUpdated = (Function1) objRememberedValue4;
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo2 = this.$chartDuxo;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(optionsProfitAndLossChartDuxo2);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new C23440xe47ec5bc(optionsProfitAndLossChartDuxo2);
            composer.updateRememberedValue(objRememberedValue5);
        }
        KFunction kFunction = (KFunction) objRememberedValue5;
        composer.endReplaceGroup();
        OptionsProfitAndLossChartDuxo optionsProfitAndLossChartDuxo3 = this.$chartDuxo;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance3 = composer.changedInstance(optionsProfitAndLossChartDuxo3);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new C23441xe47ec97d(optionsProfitAndLossChartDuxo3);
            composer.updateRememberedValue(objRememberedValue6);
        }
        KFunction kFunction2 = (KFunction) objRememberedValue6;
        composer.endReplaceGroup();
        OptionsSimulatedChartLaunchMode.ProfitAndLoss profitAndLoss4 = this.$chartLaunchMode;
        if (profitAndLoss4 == null || (function3M2241x943116a0 = profitAndLoss4.getHeaderComponent()) == null) {
            function3M2241x943116a0 = ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.INSTANCE.m2241x943116a0();
        }
        OptionsSimulatedChartLaunchMode.ProfitAndLoss profitAndLoss5 = this.$chartLaunchMode;
        if (profitAndLoss5 == null || (function3M2247x9ed9f985 = profitAndLoss5.getErrorComponent()) == null) {
            function3M2247x9ed9f985 = ComposableSingletons$OptionsPortfolioRiskAnalyzerComposableKt.INSTANCE.m2247x9ed9f985();
        }
        OptionsSimulatedReturnChartKt.OptionsSimulatedReturnBaseChart(null, optionsProfitAndLossChartViewStateInvoke$lambda$40$lambda$11, eventInvoke$lambda$40$lambda$12, usePreTradeStyle, onEstimatedContractPriceUpdated, onErrorStateUpdated, (Function1) kFunction, (Function0) kFunction2, function3M2247x9ed9f985, modifierM4891clickableO2vRcR0$default, function3M2241x943116a0, composer, (OptionsProfitAndLossChartViewState.$stable << 3) | 6, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Double d) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState) {
        return Unit.INSTANCE;
    }
}

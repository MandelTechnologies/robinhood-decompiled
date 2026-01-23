package com.robinhood.android.options.portfolioriskanalyzer;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt;
import com.robinhood.android.options.portfolioriskanalyzer.components.chartheader.OptionsPortfolioRiskAnalyzerChartHeaderViewState;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRow3;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerEquityPositionRowViewState;
import com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$6 */
/* loaded from: classes11.dex */
final class C23446xa20abbe2 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState4<OptionsPortfolioRiskAnalyzerChartHeaderViewState> $chartHeaderViewState$delegate;
    final /* synthetic */ OptionsPortfolioRiskAnalyzerEquityPositionRowViewState $equityPositionRowState;
    final /* synthetic */ Function1<FragmentKey, Unit> $onOpenStockDetailPage;
    final /* synthetic */ OptionsPortfolioRiskAnalyzerPositionDuxo $positionDuxo;

    /* JADX WARN: Multi-variable type inference failed */
    C23446xa20abbe2(OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo, OptionsPortfolioRiskAnalyzerEquityPositionRowViewState optionsPortfolioRiskAnalyzerEquityPositionRowViewState, SnapshotState4<OptionsPortfolioRiskAnalyzerChartHeaderViewState> snapshotState4, Function1<? super FragmentKey, Unit> function1) {
        this.$positionDuxo = optionsPortfolioRiskAnalyzerPositionDuxo;
        this.$equityPositionRowState = optionsPortfolioRiskAnalyzerEquityPositionRowViewState;
        this.$chartHeaderViewState$delegate = snapshotState4;
        this.$onOpenStockDetailPage = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-731455987, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.LoadedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:329)");
        }
        OptionsPortfolioRiskAnalyzerPositionDuxo optionsPortfolioRiskAnalyzerPositionDuxo = this.$positionDuxo;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(optionsPortfolioRiskAnalyzerPositionDuxo);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new C23447xe4b714bc(optionsPortfolioRiskAnalyzerPositionDuxo);
            composer.updateRememberedValue(objRememberedValue);
        }
        KFunction kFunction = (KFunction) objRememberedValue;
        composer.endReplaceGroup();
        OptionsPortfolioRiskAnalyzerEquityPositionRowViewState optionsPortfolioRiskAnalyzerEquityPositionRowViewState = this.$equityPositionRowState;
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$chartHeaderViewState$delegate) | composer.changed(this.$onOpenStockDetailPage);
        final SnapshotState4<OptionsPortfolioRiskAnalyzerChartHeaderViewState> snapshotState4 = this.$chartHeaderViewState$delegate;
        final Function1<FragmentKey, Unit> function1 = this.$onOpenStockDetailPage;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$6$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C23446xa20abbe2.invoke$lambda$3$lambda$2(snapshotState4, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        OptionsPortfolioRiskAnalyzerEquityPositionRow3.OptionsPortfolioRiskAnalyzerEquityPositionRow(optionsPortfolioRiskAnalyzerEquityPositionRowViewState, (Function0) objRememberedValue2, null, (Function2) kFunction, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(SnapshotState4 snapshotState4, Function1 function1) {
        FragmentKey underlyingDetailPageFragmentKey = OptionsPortfolioRiskAnalyzerComposableKt.C234363.invoke$lambda$40$lambda$9(snapshotState4).getUnderlyingDetailPageFragmentKey();
        if (underlyingDetailPageFragmentKey != null) {
            function1.invoke(underlyingDetailPageFragmentKey);
        }
        return Unit.INSTANCE;
    }
}

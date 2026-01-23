package com.robinhood.android.options.portfolioriskanalyzer;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSlider;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDuxo;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsPortfolioRiskAnalyzerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$4 */
/* loaded from: classes11.dex */
final class C23443xa20abbe0 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ OptionsSimulatedReturnTimeSliderDuxo $sliderDuxo;
    final /* synthetic */ SnapshotState<Double> $sliderPosition$delegate;

    C23443xa20abbe0(OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo, SnapshotState<Double> snapshotState) {
        this.$sliderDuxo = optionsSimulatedReturnTimeSliderDuxo;
        this.$sliderPosition$delegate = snapshotState;
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
            ComposerKt.traceEventStart(-1265150481, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.LoadedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerComposable.kt:307)");
        }
        long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
        OptionsSimulatedReturnTimeSliderDuxo optionsSimulatedReturnTimeSliderDuxo = this.$sliderDuxo;
        composer.startReplaceGroup(5004770);
        final SnapshotState<Double> snapshotState = this.$sliderPosition$delegate;
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C23443xa20abbe0.invoke$lambda$1$lambda$0(snapshotState, ((Double) obj).doubleValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerComposableKt$LoadedContent$3$1$9$1$1$4$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        OptionsSimulatedReturnSlider.m16967OptionsSimulatedReturnBaseSliderlVb_Clg(true, null, jM21371getBg0d7_KjU, optionsSimulatedReturnTimeSliderDuxo, function1, companion2, false, (Function0) objRememberedValue2, composer, (OptionsSimulatedReturnTimeSliderDuxo.$stable << 9) | 12804150, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, double d) {
        snapshotState.setValue(Double.valueOf(d));
        return Unit.INSTANCE;
    }
}

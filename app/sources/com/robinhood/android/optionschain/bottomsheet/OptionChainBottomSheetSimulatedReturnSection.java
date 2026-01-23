package com.robinhood.android.optionschain.bottomsheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnPreTradeChartError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainBottomSheetSimulatedReturnSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.bottomsheet.ComposableSingletons$OptionChainBottomSheetSimulatedReturnSectionKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainBottomSheetSimulatedReturnSection {
    public static final OptionChainBottomSheetSimulatedReturnSection INSTANCE = new OptionChainBottomSheetSimulatedReturnSection();
    private static Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> lambda$1868999074 = ComposableLambda3.composableLambdaInstance(1868999074, false, new Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.bottomsheet.ComposableSingletons$OptionChainBottomSheetSimulatedReturnSectionKt$lambda$1868999074$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, Composer composer, Integer num) {
            invoke(optionsSimulatedReturnErrorState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(OptionsSimulatedReturnErrorState it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1868999074, i, -1, "com.robinhood.android.optionschain.bottomsheet.ComposableSingletons$OptionChainBottomSheetSimulatedReturnSectionKt.lambda$1868999074.<anonymous> (OptionChainBottomSheetSimulatedReturnSection.kt:77)");
            }
            OptionsSimulatedReturnPreTradeChartError.OptionsSimulatedReturnPreTradeChartError(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> lambda$1376735753 = ComposableLambda3.composableLambdaInstance(1376735753, false, new Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.bottomsheet.ComposableSingletons$OptionChainBottomSheetSimulatedReturnSectionKt$lambda$1376735753$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, Composer composer, Integer num) {
            invoke(optionsSimulatedReturnErrorState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(OptionsSimulatedReturnErrorState it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1376735753, i, -1, "com.robinhood.android.optionschain.bottomsheet.ComposableSingletons$OptionChainBottomSheetSimulatedReturnSectionKt.lambda$1376735753.<anonymous> (OptionChainBottomSheetSimulatedReturnSection.kt:109)");
            }
            OptionsSimulatedReturnPreTradeChartError.OptionsSimulatedReturnPreTradeChartError(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> getLambda$1376735753$feature_options_chain_externalDebug() {
        return lambda$1376735753;
    }

    public final Function3<OptionsSimulatedReturnErrorState, Composer, Integer, Unit> getLambda$1868999074$feature_options_chain_externalDebug() {
        return lambda$1868999074;
    }
}

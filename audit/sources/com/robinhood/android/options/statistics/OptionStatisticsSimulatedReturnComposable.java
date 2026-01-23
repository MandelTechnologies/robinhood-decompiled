package com.robinhood.android.options.statistics;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedReturnProfitLossHeader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStatisticsSimulatedReturnComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.statistics.ComposableSingletons$OptionStatisticsSimulatedReturnComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionStatisticsSimulatedReturnComposable {
    public static final OptionStatisticsSimulatedReturnComposable INSTANCE = new OptionStatisticsSimulatedReturnComposable();

    /* renamed from: lambda$-589776973, reason: not valid java name */
    private static Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> f9150lambda$589776973 = ComposableLambda3.composableLambdaInstance(-589776973, false, new Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.statistics.ComposableSingletons$OptionStatisticsSimulatedReturnComposableKt$lambda$-589776973$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(OptionsSimulatedChartHeaderState optionsSimulatedChartHeaderState, Composer composer, Integer num) {
            invoke(optionsSimulatedChartHeaderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(OptionsSimulatedChartHeaderState headerState, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(headerState, "headerState");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-589776973, i, -1, "com.robinhood.android.options.statistics.ComposableSingletons$OptionStatisticsSimulatedReturnComposableKt.lambda$-589776973.<anonymous> (OptionStatisticsSimulatedReturnComposable.kt:65)");
            }
            OptionsSimulatedReturnProfitLossHeader.OptionsSimulatedReturnProfitLossHeader(headerState, true, null, composer, (i & 14) | 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1800765076, reason: not valid java name */
    private static Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> f9149lambda$1800765076 = ComposableLambda3.composableLambdaInstance(-1800765076, false, new Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.statistics.ComposableSingletons$OptionStatisticsSimulatedReturnComposableKt$lambda$-1800765076$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(OptionsSimulatedChartHeaderState optionsSimulatedChartHeaderState, Composer composer, Integer num) {
            invoke(optionsSimulatedChartHeaderState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(OptionsSimulatedChartHeaderState headerState, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(headerState, "headerState");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1800765076, i, -1, "com.robinhood.android.options.statistics.ComposableSingletons$OptionStatisticsSimulatedReturnComposableKt.lambda$-1800765076.<anonymous> (OptionStatisticsSimulatedReturnComposable.kt:94)");
            }
            OptionsSimulatedReturnProfitLossHeader.OptionsSimulatedReturnProfitLossHeader(headerState, true, null, composer, (i & 14) | 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1800765076$feature_lib_options_statistics_externalDebug */
    public final Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> m2278x1a85e3ee() {
        return f9149lambda$1800765076;
    }

    /* renamed from: getLambda$-589776973$feature_lib_options_statistics_externalDebug */
    public final Function3<OptionsSimulatedChartHeaderState, Composer, Integer, Unit> m2279x4d9de665() {
        return f9150lambda$589776973;
    }
}

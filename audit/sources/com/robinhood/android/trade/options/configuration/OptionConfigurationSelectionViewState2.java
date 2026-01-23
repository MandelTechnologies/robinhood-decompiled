package com.robinhood.android.trade.options.configuration;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionConfigurationSelectionViewState.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.configuration.ComposableSingletons$OptionConfigurationSelectionViewStateKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionConfigurationSelectionViewState2 {
    public static final OptionConfigurationSelectionViewState2 INSTANCE = new OptionConfigurationSelectionViewState2();

    /* renamed from: lambda$-1096691760, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9273lambda$1096691760 = ComposableLambda3.composableLambdaInstance(-1096691760, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.options.configuration.ComposableSingletons$OptionConfigurationSelectionViewStateKt$lambda$-1096691760$1
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
                ComposerKt.traceEventStart(-1096691760, i, -1, "com.robinhood.android.trade.options.configuration.ComposableSingletons$OptionConfigurationSelectionViewStateKt.lambda$-1096691760.<anonymous> (OptionConfigurationSelectionViewState.kt:95)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1594271663 = ComposableLambda3.composableLambdaInstance(1594271663, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.options.configuration.ComposableSingletons$OptionConfigurationSelectionViewStateKt$lambda$1594271663$1
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
                ComposerKt.traceEventStart(1594271663, i, -1, "com.robinhood.android.trade.options.configuration.ComposableSingletons$OptionConfigurationSelectionViewStateKt.lambda$1594271663.<anonymous> (OptionConfigurationSelectionViewState.kt:94)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1563977711, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9274lambda$1563977711 = ComposableLambda3.composableLambdaInstance(-1563977711, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.options.configuration.ComposableSingletons$OptionConfigurationSelectionViewStateKt$lambda$-1563977711$1
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
                ComposerKt.traceEventStart(-1563977711, i, -1, "com.robinhood.android.trade.options.configuration.ComposableSingletons$OptionConfigurationSelectionViewStateKt.lambda$-1563977711.<anonymous> (OptionConfigurationSelectionViewState.kt:123)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1096691760$feature_trade_options_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19450getLambda$1096691760$feature_trade_options_externalDebug() {
        return f9273lambda$1096691760;
    }

    /* renamed from: getLambda$-1563977711$feature_trade_options_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19451getLambda$1563977711$feature_trade_options_externalDebug() {
        return f9274lambda$1563977711;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1594271663$feature_trade_options_externalDebug() {
        return lambda$1594271663;
    }
}

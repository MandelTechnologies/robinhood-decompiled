package com.robinhood.android.trade.equity.p261ui.configuration.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OrderConfigurationSelectionDataState.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.ComposableSingletons$OrderConfigurationSelectionDataStateKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OrderConfigurationSelectionDataState2 {
    public static final OrderConfigurationSelectionDataState2 INSTANCE = new OrderConfigurationSelectionDataState2();
    private static Function2<Composer, Integer, Unit> lambda$389010241 = ComposableLambda3.composableLambdaInstance(389010241, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.equity.ui.configuration.selection.ComposableSingletons$OrderConfigurationSelectionDataStateKt$lambda$389010241$1
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
                ComposerKt.traceEventStart(389010241, i, -1, "com.robinhood.android.trade.equity.ui.configuration.selection.ComposableSingletons$OrderConfigurationSelectionDataStateKt.lambda$389010241.<anonymous> (OrderConfigurationSelectionDataState.kt:331)");
            }
            AdtHeaderComposable.AdtHeader(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$389010241$feature_trade_equity_externalDebug() {
        return lambda$389010241;
    }
}

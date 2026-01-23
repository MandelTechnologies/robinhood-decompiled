package com.robinhood.android.equitytradeladder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.loading.Loading4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityTradeLadderComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$EquityTradeLadderComposableKt {
    public static final ComposableSingletons$EquityTradeLadderComposableKt INSTANCE = new ComposableSingletons$EquityTradeLadderComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$1112341090 = ComposableLambda3.composableLambdaInstance(1112341090, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.ComposableSingletons$EquityTradeLadderComposableKt$lambda$1112341090$1
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
                ComposerKt.traceEventStart(1112341090, i, -1, "com.robinhood.android.equitytradeladder.ComposableSingletons$EquityTradeLadderComposableKt.lambda$1112341090.<anonymous> (EquityTradeLadderComposable.kt:178)");
            }
            Loading4.Loading(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1112341090$feature_equity_trade_ladder_externalDebug() {
        return lambda$1112341090;
    }
}

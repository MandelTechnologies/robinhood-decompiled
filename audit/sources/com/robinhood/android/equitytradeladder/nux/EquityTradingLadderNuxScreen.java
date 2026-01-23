package com.robinhood.android.equitytradeladder.nux;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityTradingLadderNuxScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.nux.ComposableSingletons$EquityTradingLadderNuxScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityTradingLadderNuxScreen {
    public static final EquityTradingLadderNuxScreen INSTANCE = new EquityTradingLadderNuxScreen();

    /* renamed from: lambda$-1729663499, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8926lambda$1729663499 = ComposableLambda3.composableLambdaInstance(-1729663499, false, EquityTradingLadderNuxScreen3.INSTANCE);

    /* renamed from: lambda$-1262941802, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8925lambda$1262941802 = ComposableLambda3.composableLambdaInstance(-1262941802, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.nux.ComposableSingletons$EquityTradingLadderNuxScreenKt$lambda$-1262941802$1
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
                ComposerKt.traceEventStart(-1262941802, i, -1, "com.robinhood.android.equitytradeladder.nux.ComposableSingletons$EquityTradingLadderNuxScreenKt.lambda$-1262941802.<anonymous> (EquityTradingLadderNuxScreen.kt:108)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, EquityTradingLadderNuxScreen.INSTANCE.m14062getLambda$1729663499$feature_equity_trade_ladder_externalDebug(), composer, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1262941802$feature_equity_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14061getLambda$1262941802$feature_equity_trade_ladder_externalDebug() {
        return f8925lambda$1262941802;
    }

    /* renamed from: getLambda$-1729663499$feature_equity_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14062getLambda$1729663499$feature_equity_trade_ladder_externalDebug() {
        return f8926lambda$1729663499;
    }
}

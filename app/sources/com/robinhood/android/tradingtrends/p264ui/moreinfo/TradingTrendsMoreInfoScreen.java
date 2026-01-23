package com.robinhood.android.tradingtrends.p264ui.moreinfo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TradingTrendsMoreInfoScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.tradingtrends.ui.moreinfo.ComposableSingletons$TradingTrendsMoreInfoScreenKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TradingTrendsMoreInfoScreen {
    public static final TradingTrendsMoreInfoScreen INSTANCE = new TradingTrendsMoreInfoScreen();

    /* renamed from: lambda$-1746163930, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9276lambda$1746163930 = ComposableLambda3.composableLambdaInstance(-1746163930, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.moreinfo.ComposableSingletons$TradingTrendsMoreInfoScreenKt$lambda$-1746163930$1
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
                ComposerKt.traceEventStart(-1746163930, i, -1, "com.robinhood.android.tradingtrends.ui.moreinfo.ComposableSingletons$TradingTrendsMoreInfoScreenKt.lambda$-1746163930.<anonymous> (TradingTrendsMoreInfoScreen.kt:62)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1746163930$lib_trading_trends_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19531getLambda$1746163930$lib_trading_trends_externalDebug() {
        return f9276lambda$1746163930;
    }
}

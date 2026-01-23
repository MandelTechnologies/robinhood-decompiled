package com.robinhood.android.portfolio.benchmarkIntro;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BenchmarkIntroScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.benchmarkIntro.ComposableSingletons$BenchmarkIntroScreenKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class BenchmarkIntroScreen3 {
    public static final BenchmarkIntroScreen3 INSTANCE = new BenchmarkIntroScreen3();

    /* renamed from: lambda$-1737361835, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9170lambda$1737361835 = ComposableLambda3.composableLambdaInstance(-1737361835, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.benchmarkIntro.ComposableSingletons$BenchmarkIntroScreenKt$lambda$-1737361835$1
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
                ComposerKt.traceEventStart(-1737361835, i, -1, "com.robinhood.android.portfolio.benchmarkIntro.ComposableSingletons$BenchmarkIntroScreenKt.lambda$-1737361835.<anonymous> (BenchmarkIntroScreen.kt:217)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-949055063, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9171lambda$949055063 = ComposableLambda3.composableLambdaInstance(-949055063, false, BenchmarkIntroScreen5.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1936721252 = ComposableLambda3.composableLambdaInstance(1936721252, false, BenchmarkIntroScreen6.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$576867695 = ComposableLambda3.composableLambdaInstance(576867695, false, BenchmarkIntroScreen7.INSTANCE);

    /* renamed from: getLambda$-1737361835$feature_portfolio_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17622getLambda$1737361835$feature_portfolio_externalDebug() {
        return f9170lambda$1737361835;
    }

    /* renamed from: getLambda$-949055063$feature_portfolio_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17623getLambda$949055063$feature_portfolio_externalDebug() {
        return f9171lambda$949055063;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1936721252$feature_portfolio_externalDebug() {
        return lambda$1936721252;
    }

    public final Function2<Composer, Integer, Unit> getLambda$576867695$feature_portfolio_externalDebug() {
        return lambda$576867695;
    }
}

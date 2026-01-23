package com.robinhood.android.cortex.digest.portfolio.splash;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: PortfolioDigestSplashComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$PortfolioDigestSplashComposableKt {
    public static final ComposableSingletons$PortfolioDigestSplashComposableKt INSTANCE = new ComposableSingletons$PortfolioDigestSplashComposableKt();

    /* renamed from: lambda$-780207458, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8753lambda$780207458 = ComposableLambda3.composableLambdaInstance(-780207458, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.ComposableSingletons$PortfolioDigestSplashComposableKt$lambda$-780207458$1
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
                ComposerKt.traceEventStart(-780207458, i, -1, "com.robinhood.android.cortex.digest.portfolio.splash.ComposableSingletons$PortfolioDigestSplashComposableKt.lambda$-780207458.<anonymous> (PortfolioDigestSplashComposable.kt:165)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$262538738 = ComposableLambda3.composableLambdaInstance(262538738, false, C12157x20c755ca.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1385080753 = ComposableLambda3.composableLambdaInstance(1385080753, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.portfolio.splash.ComposableSingletons$PortfolioDigestSplashComposableKt$lambda$1385080753$1
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
                ComposerKt.traceEventStart(1385080753, i, -1, "com.robinhood.android.cortex.digest.portfolio.splash.ComposableSingletons$PortfolioDigestSplashComposableKt.lambda$1385080753.<anonymous> (PortfolioDigestSplashComposable.kt:164)");
            }
            ComposableSingletons$PortfolioDigestSplashComposableKt composableSingletons$PortfolioDigestSplashComposableKt = ComposableSingletons$PortfolioDigestSplashComposableKt.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableSingletons$PortfolioDigestSplashComposableKt.m1872x49cc122e(), null, composableSingletons$PortfolioDigestSplashComposableKt.m1874x859db850(), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-780207458$feature_cortex_digest_portfolio_externalDebug */
    public final Function2<Composer, Integer, Unit> m1872x49cc122e() {
        return f8753lambda$780207458;
    }

    /* renamed from: getLambda$1385080753$feature_cortex_digest_portfolio_externalDebug */
    public final Function2<Composer, Integer, Unit> m1873x43b7bd5a() {
        return lambda$1385080753;
    }

    /* renamed from: getLambda$262538738$feature_cortex_digest_portfolio_externalDebug */
    public final Function3<BentoAppBarScope, Composer, Integer, Unit> m1874x859db850() {
        return lambda$262538738;
    }
}

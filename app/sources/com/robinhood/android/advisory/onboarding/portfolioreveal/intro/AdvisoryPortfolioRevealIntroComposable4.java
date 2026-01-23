package com.robinhood.android.advisory.onboarding.portfolioreveal.intro;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryPortfolioRevealIntroComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.ComposableSingletons$AdvisoryPortfolioRevealIntroComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryPortfolioRevealIntroComposable4 {
    public static final AdvisoryPortfolioRevealIntroComposable4 INSTANCE = new AdvisoryPortfolioRevealIntroComposable4();

    /* renamed from: lambda$-13734402, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8640lambda$13734402 = ComposableLambda3.composableLambdaInstance(-13734402, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.ComposableSingletons$AdvisoryPortfolioRevealIntroComposableKt$lambda$-13734402$1
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
                ComposerKt.traceEventStart(-13734402, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.ComposableSingletons$AdvisoryPortfolioRevealIntroComposableKt.lambda$-13734402.<anonymous> (AdvisoryPortfolioRevealIntroComposable.kt:156)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-145664560, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8641lambda$145664560 = ComposableLambda3.composableLambdaInstance(-145664560, false, AdvisoryPortfolioRevealIntroComposable6.INSTANCE);

    /* renamed from: getLambda$-13734402$feature_advisory_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11110getLambda$13734402$feature_advisory_onboarding_externalDebug() {
        return f8640lambda$13734402;
    }

    /* renamed from: getLambda$-145664560$feature_advisory_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11111getLambda$145664560$feature_advisory_onboarding_externalDebug() {
        return f8641lambda$145664560;
    }
}

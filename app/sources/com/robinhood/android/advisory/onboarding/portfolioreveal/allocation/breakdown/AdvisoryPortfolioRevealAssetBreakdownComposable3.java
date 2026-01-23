package com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryPortfolioRevealAssetBreakdownComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.ComposableSingletons$AdvisoryPortfolioRevealAssetBreakdownComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryPortfolioRevealAssetBreakdownComposable3 {
    public static final AdvisoryPortfolioRevealAssetBreakdownComposable3 INSTANCE = new AdvisoryPortfolioRevealAssetBreakdownComposable3();

    /* renamed from: lambda$-274774973, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8637lambda$274774973 = ComposableLambda3.composableLambdaInstance(-274774973, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.ComposableSingletons$AdvisoryPortfolioRevealAssetBreakdownComposableKt$lambda$-274774973$1
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
                ComposerKt.traceEventStart(-274774973, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.ComposableSingletons$AdvisoryPortfolioRevealAssetBreakdownComposableKt.lambda$-274774973.<anonymous> (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:124)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2099927082, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8636lambda$2099927082 = ComposableLambda3.composableLambdaInstance(-2099927082, false, AdvisoryPortfolioRevealAssetBreakdownComposable4.INSTANCE);

    /* renamed from: getLambda$-2099927082$feature_advisory_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11094getLambda$2099927082$feature_advisory_onboarding_externalDebug() {
        return f8636lambda$2099927082;
    }

    /* renamed from: getLambda$-274774973$feature_advisory_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11095getLambda$274774973$feature_advisory_onboarding_externalDebug() {
        return f8637lambda$274774973;
    }
}

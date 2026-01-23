package com.robinhood.android.advisory.onboarding.portfolioreveal.allocation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvsoryPortfolioRevealAllocationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.ComposableSingletons$AdvsoryPortfolioRevealAllocationComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvsoryPortfolioRevealAllocationComposable5 {
    public static final AdvsoryPortfolioRevealAllocationComposable5 INSTANCE = new AdvsoryPortfolioRevealAllocationComposable5();
    private static Function2<Composer, Integer, Unit> lambda$2027799885 = ComposableLambda3.composableLambdaInstance(2027799885, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.ComposableSingletons$AdvsoryPortfolioRevealAllocationComposableKt$lambda$2027799885$1
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
                ComposerKt.traceEventStart(2027799885, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.ComposableSingletons$AdvsoryPortfolioRevealAllocationComposableKt.lambda$2027799885.<anonymous> (AdvsoryPortfolioRevealAllocationComposable.kt:94)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2027799885$feature_advisory_onboarding_externalDebug() {
        return lambda$2027799885;
    }
}

package com.robinhood.android.advisor.marketplace.onboarding;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisorMarketplaceOnboardingComponents.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisor.marketplace.onboarding.ComposableSingletons$AdvisorMarketplaceOnboardingComponentsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisorMarketplaceOnboardingComponents2 {
    public static final AdvisorMarketplaceOnboardingComponents2 INSTANCE = new AdvisorMarketplaceOnboardingComponents2();
    private static Function2<Composer, Integer, Unit> lambda$1990933950 = ComposableLambda3.composableLambdaInstance(1990933950, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.ComposableSingletons$AdvisorMarketplaceOnboardingComponentsKt$lambda$1990933950$1
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
                ComposerKt.traceEventStart(1990933950, i, -1, "com.robinhood.android.advisor.marketplace.onboarding.ComposableSingletons$AdvisorMarketplaceOnboardingComponentsKt.lambda$1990933950.<anonymous> (AdvisorMarketplaceOnboardingComponents.kt:28)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$1151944081 = ComposableLambda3.composableLambdaInstance(1151944081, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.ComposableSingletons$AdvisorMarketplaceOnboardingComponentsKt$lambda$1151944081$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1151944081, i, -1, "com.robinhood.android.advisor.marketplace.onboarding.ComposableSingletons$AdvisorMarketplaceOnboardingComponentsKt.lambda$1151944081.<anonymous> (AdvisorMarketplaceOnboardingComponents.kt:61)");
            }
            LoadingScreenComposablesKt.PromoLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 1, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$1151944081$feature_advisor_marketplace_onboarding_externalDebug */
    public final Function3<PaddingValues, Composer, Integer, Unit> m1721xa3e03951() {
        return lambda$1151944081;
    }

    /* renamed from: getLambda$1990933950$feature_advisor_marketplace_onboarding_externalDebug */
    public final Function2<Composer, Integer, Unit> m1722xebf5b843() {
        return lambda$1990933950;
    }
}

package com.robinhood.android.advisor.marketplace.onboarding.hub;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisorMarketplaceOnboardingHubScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.ComposableSingletons$AdvisorMarketplaceOnboardingHubScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisorMarketplaceOnboardingHubScreen4 {
    public static final AdvisorMarketplaceOnboardingHubScreen4 INSTANCE = new AdvisorMarketplaceOnboardingHubScreen4();

    /* renamed from: lambda$-135407804, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8624lambda$135407804 = ComposableLambda3.composableLambdaInstance(-135407804, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.hub.ComposableSingletons$AdvisorMarketplaceOnboardingHubScreenKt$lambda$-135407804$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 6) == 0) {
                i |= composer.changed(item) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-135407804, i, -1, "com.robinhood.android.advisor.marketplace.onboarding.hub.ComposableSingletons$AdvisorMarketplaceOnboardingHubScreenKt.lambda$-135407804.<anonymous> (AdvisorMarketplaceOnboardingHubScreen.kt:250)");
            }
            MeetingsHub2.NoMeetingsContent(item.fillParentMaxHeight(LazyItemScope.fillParentMaxWidth$default(item, Modifier.INSTANCE, 0.0f, 1, null), 0.7f), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-135407804$feature_advisor_marketplace_onboarding_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1730x6fa33c56() {
        return f8624lambda$135407804;
    }
}

package com.robinhood.android.advisor.marketplace.onboarding;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubScreen;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorDashboardState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarketplaceOnboardingNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisor.marketplace.onboarding.ComposableSingletons$MarketplaceOnboardingNavGraphKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class MarketplaceOnboardingNavGraph {
    public static final MarketplaceOnboardingNavGraph INSTANCE = new MarketplaceOnboardingNavGraph();

    /* renamed from: lambda$-1851718809, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f8623lambda$1851718809 = ComposableLambda3.composableLambdaInstance(-1851718809, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.ComposableSingletons$MarketplaceOnboardingNavGraphKt$lambda$-1851718809$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1851718809, i, -1, "com.robinhood.android.advisor.marketplace.onboarding.ComposableSingletons$MarketplaceOnboardingNavGraphKt.lambda$-1851718809.<anonymous> (MarketplaceOnboardingNavGraph.kt:30)");
            }
            MarketplaceOnboardingNotEnrolledScreen.MarketplaceOnboardingNotEnrolledScreen((AdvisorDashboardState.NotEnrolled) ComposableCompanion.args(entry), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> lambda$1596344671 = ComposableLambda3.composableLambdaInstance(1596344671, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.ComposableSingletons$MarketplaceOnboardingNavGraphKt$lambda$1596344671$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, LifecycleAwareNavigator unused$var$2, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            Intrinsics.checkNotNullParameter(unused$var$2, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1596344671, i, -1, "com.robinhood.android.advisor.marketplace.onboarding.ComposableSingletons$MarketplaceOnboardingNavGraphKt.lambda$1596344671.<anonymous> (MarketplaceOnboardingNavGraph.kt:45)");
            }
            AdvisorMarketplaceOnboardingHubScreen.AdvisorMarketplaceOnboardingHubScreen(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1851718809$feature_advisor_marketplace_onboarding_externalDebug */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m1723xedc62ad8() {
        return f8623lambda$1851718809;
    }

    /* renamed from: getLambda$1596344671$feature_advisor_marketplace_onboarding_externalDebug */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m1724x7672421f() {
        return lambda$1596344671;
    }
}

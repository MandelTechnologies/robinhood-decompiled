package com.robinhood.android.advisor.marketplace.onboarding;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisor.marketplace.onboarding.OnboardingInitialDestination;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import com.robinhood.android.navigation.compose.destination.BaseComposableDestination;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorDashboardState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarketplaceOnboardingNavGraph.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0000¨\u0006\t"}, m3636d2 = {"marketplaceOnboardingNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "state", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState;", "onRefreshRequested", "Lkotlin/Function0;", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNavGraphKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class MarketplaceOnboardingNavGraph4 {
    public static final void marketplaceOnboardingNavGraph(NavGraphBuilder navGraphBuilder, final NavHostController navController, AdvisorDashboardState state, final Function0<Unit> onRefreshRequested) {
        BaseComposableDestination baseComposableDestination;
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onRefreshRequested, "onRefreshRequested");
        OnboardingInitialDestination<?> destination = AdvisorMarketplaceNavHost.getDestination(state);
        if (destination instanceof OnboardingInitialDestination.NotEnrolled) {
            baseComposableDestination = OnboardingNotEnrolledDestination.INSTANCE;
        } else {
            if (!(destination instanceof OnboardingInitialDestination.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            baseComposableDestination = OnboardingErrorDestination.INSTANCE;
        }
        NavGraphBuilders.navigation(navGraphBuilder, baseComposableDestination, destination, new Function1() { // from class: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNavGraphKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketplaceOnboardingNavGraph4.marketplaceOnboardingNavGraph$lambda$0(navController, onRefreshRequested, (NavGraphBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit marketplaceOnboardingNavGraph$lambda$0(NavHostController navHostController, final Function0 function0, NavGraphBuilder navigation) {
        Intrinsics.checkNotNullParameter(navigation, "$this$navigation");
        OnboardingNotEnrolledDestination onboardingNotEnrolledDestination = OnboardingNotEnrolledDestination.INSTANCE;
        MarketplaceOnboardingNavGraph marketplaceOnboardingNavGraph = MarketplaceOnboardingNavGraph.INSTANCE;
        NavGraphBuilders.composable(navigation, navHostController, onboardingNotEnrolledDestination, marketplaceOnboardingNavGraph.m1723xedc62ad8());
        NavGraphBuilders.composable(navigation, navHostController, OnboardingErrorDestination.INSTANCE, ComposableLambda3.composableLambdaInstance(-1467330082, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNavGraphKt$marketplaceOnboardingNavGraph$1$1
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
                    ComposerKt.traceEventStart(-1467330082, i, -1, "com.robinhood.android.advisor.marketplace.onboarding.marketplaceOnboardingNavGraph.<anonymous>.<anonymous> (MarketplaceOnboardingNavGraph.kt:36)");
                }
                final Function0<Unit> function02 = function0;
                AdvisorMarketplaceOnboardingComponents.BackHandlingScaffold(null, null, ComposableLambda3.rememberComposableLambda(1163922506, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.MarketplaceOnboardingNavGraphKt$marketplaceOnboardingNavGraph$1$1.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i2 & 6) == 0) {
                            i2 |= composer2.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i2 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1163922506, i2, -1, "com.robinhood.android.advisor.marketplace.onboarding.marketplaceOnboardingNavGraph.<anonymous>.<anonymous>.<anonymous> (MarketplaceOnboardingNavGraph.kt:37)");
                        }
                        ErrorScreenComposable.ErrorScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), function02, 0, null, null, null, null, false, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 384, 3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navigation, navHostController, OnboardingHubDestination.INSTANCE, marketplaceOnboardingNavGraph.m1724x7672421f());
        return Unit.INSTANCE;
    }
}

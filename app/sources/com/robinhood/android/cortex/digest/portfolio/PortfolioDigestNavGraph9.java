package com.robinhood.android.cortex.digest.portfolio;

import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.cortex.contracts.PortfolioDigestFragmentKey;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations7;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import com.robinhood.android.navigation.compose.destination.BaseComposableDestination;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestNavGraph.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"portfolioDigestNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "initArgs", "Lcom/robinhood/android/cortex/contracts/PortfolioDigestFragmentKey;", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestNavGraphKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioDigestNavGraph9 {
    public static final void portfolioDigestNavGraph(NavGraphBuilder navGraphBuilder, final NavHostController navController, PortfolioDigestFragmentKey initArgs) {
        BaseComposableDestination splashWithNeedsGold;
        BaseComposableDestination baseComposableDestination;
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(initArgs, "initArgs");
        if (initArgs instanceof PortfolioDigestFragmentKey.WithId) {
            PortfolioDigestFragmentKey.WithId withId = (PortfolioDigestFragmentKey.WithId) initArgs;
            splashWithNeedsGold = new PortfolioDigestDestinations7.Splash(withId.getAccountNumber(), withId.getSkipSplashIfOnboarding(), withId.getSource());
        } else {
            if (!(initArgs instanceof PortfolioDigestFragmentKey.WithDigest)) {
                throw new NoWhenBranchMatchedException();
            }
            PortfolioDigestFragmentKey.WithDigest withDigest = (PortfolioDigestFragmentKey.WithDigest) initArgs;
            PortfolioDigest digest = withDigest.getDigest();
            if (digest instanceof PortfolioDigest.HasOnboarded) {
                splashWithNeedsGold = new PortfolioDigestDestinations7.Detail((PortfolioDigest.HasOnboarded) digest, withDigest.getSource());
            } else if (digest instanceof PortfolioDigest.NeedsOnboarding) {
                if (withDigest.getSkipSplashIfOnboarding()) {
                    splashWithNeedsGold = new PortfolioDigestDestinations7.Agreement((PortfolioDigest.NeedsOnboarding) digest, withDigest.getSource());
                } else {
                    splashWithNeedsGold = new PortfolioDigestDestinations7.SplashWithNeedsOnboarding((PortfolioDigest.NeedsOnboarding) digest, withDigest.getSource());
                }
            } else {
                if (!(digest instanceof PortfolioDigest.NeedsGold)) {
                    throw new NoWhenBranchMatchedException();
                }
                splashWithNeedsGold = new PortfolioDigestDestinations7.SplashWithNeedsGold((PortfolioDigest.NeedsGold) digest, withDigest.getSource());
            }
        }
        if ((splashWithNeedsGold instanceof PortfolioDigestDestinations7.Splash) || (splashWithNeedsGold instanceof PortfolioDigestDestinations7.SplashWithNeedsGold) || (splashWithNeedsGold instanceof PortfolioDigestDestinations7.SplashWithNeedsOnboarding)) {
            baseComposableDestination = PortfolioDigestDestinations9.INSTANCE;
        } else if (splashWithNeedsGold instanceof PortfolioDigestDestinations7.Detail) {
            baseComposableDestination = PortfolioDigestDestinations4.INSTANCE;
        } else {
            if (!(splashWithNeedsGold instanceof PortfolioDigestDestinations7.Agreement)) {
                throw new NoWhenBranchMatchedException();
            }
            baseComposableDestination = PortfolioDigestDestinations.INSTANCE;
        }
        NavGraphBuilders.navigation(navGraphBuilder, baseComposableDestination, splashWithNeedsGold, new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestNavGraphKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PortfolioDigestNavGraph9.portfolioDigestNavGraph$lambda$0(navController, (NavGraphBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit portfolioDigestNavGraph$lambda$0(NavHostController navHostController, NavGraphBuilder navigation) {
        Intrinsics.checkNotNullParameter(navigation, "$this$navigation");
        PortfolioDigestDestinations9 portfolioDigestDestinations9 = PortfolioDigestDestinations9.INSTANCE;
        PortfolioDigestNavGraph portfolioDigestNavGraph = PortfolioDigestNavGraph.INSTANCE;
        NavGraphBuilders.composable(navigation, navHostController, portfolioDigestDestinations9, portfolioDigestNavGraph.m1864xfbcea172());
        NavGraphBuilders.composable(navigation, navHostController, PortfolioDigestDestinations.INSTANCE, portfolioDigestNavGraph.m1863x65a0c569());
        NavGraphBuilders.composable(navigation, navHostController, PortfolioDigestDestinations4.INSTANCE, portfolioDigestNavGraph.m1866x24cca225());
        NavGraphBuilders.composable(navigation, navHostController, PortfolioDigestDestinations2.INSTANCE, portfolioDigestNavGraph.getLambda$54055749$feature_cortex_digest_portfolio_externalDebug());
        NavGraphBuilders.bottomSheet(navigation, navHostController, PortfolioDigestDestinations3.INSTANCE, portfolioDigestNavGraph.m1867xd660a26e());
        NavGraphBuilders.bottomSheet(navigation, navHostController, PortfolioDigestDestinations6.INSTANCE, portfolioDigestNavGraph.m1868xea21bd70());
        NavGraphBuilders.dialog(navigation, navHostController, PortfolioDigestDestinations5.INSTANCE, portfolioDigestNavGraph.m1865x519bacb1());
        return Unit.INSTANCE;
    }
}

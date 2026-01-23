package com.robinhood.android.cortex.digest.portfolio;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import com.robinhood.android.cortex.contracts.PortfolioDigestFragmentKey;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PortfolioDigestNavigationComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"PortfolioDigestNavigationComposable", "", "initArgs", "Lcom/robinhood/android/cortex/contracts/PortfolioDigestFragmentKey;", "(Lcom/robinhood/android/cortex/contracts/PortfolioDigestFragmentKey;Landroidx/compose/runtime/Composer;I)V", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestNavigationComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioDigestNavigationComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestNavigationComposable$lambda$2(PortfolioDigestFragmentKey portfolioDigestFragmentKey, int i, Composer composer, int i2) {
        PortfolioDigestNavigationComposable(portfolioDigestFragmentKey, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PortfolioDigestNavigationComposable(final PortfolioDigestFragmentKey initArgs, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(initArgs, "initArgs");
        Composer composerStartRestartGroup = composer.startRestartGroup(982494132);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(initArgs) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(982494132, i2, -1, "com.robinhood.android.cortex.digest.portfolio.PortfolioDigestNavigationComposable (PortfolioDigestNavigationComposable.kt:12)");
            }
            NavHostController navHostControllerRememberNavController = NavHostController2.rememberNavController(new Navigator[0], composerStartRestartGroup, 0);
            PortfolioDigestDestinations8 portfolioDigestDestinations8 = PortfolioDigestDestinations8.INSTANCE;
            long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(initArgs);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestNavigationComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PortfolioDigestNavigationComposable.PortfolioDigestNavigationComposable$lambda$1$lambda$0(initArgs, (NavGraphBuilder) obj, (NavHostController) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            GenericNavHost.m20570GenericNavHostuDo3WH8(navHostControllerRememberNavController, extensions2.persistentSetOf((Function2) objRememberedValue), portfolioDigestDestinations8, jM21371getBg0d7_KjU, null, composerStartRestartGroup, ComposableDestinationWithArgs.$stable << 6, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.portfolio.PortfolioDigestNavigationComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PortfolioDigestNavigationComposable.PortfolioDigestNavigationComposable$lambda$2(initArgs, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestNavigationComposable$lambda$1$lambda$0(PortfolioDigestFragmentKey portfolioDigestFragmentKey, NavGraphBuilder persistentSetOf, NavHostController navController) {
        Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
        Intrinsics.checkNotNullParameter(navController, "navController");
        PortfolioDigestNavGraph9.portfolioDigestNavGraph(persistentSetOf, navController, portfolioDigestFragmentKey);
        return Unit.INSTANCE;
    }
}

package com.robinhood.shared.crypto.staking.staking.navigation;

import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import com.robinhood.shared.staking.contracts.CryptoStakingIntentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StakingNavGraph.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"stakingNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "initArgs", "Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey;", "feature-crypto-staking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.navigation.StakingNavGraphKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class StakingNavGraph5 {
    public static final void stakingNavGraph(NavGraphBuilder navGraphBuilder, final NavHostController navController, final CryptoStakingIntentKey initArgs) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(initArgs, "initArgs");
        NavGraphBuilders.navigation(navGraphBuilder, StakingNavDests2.INSTANCE, StakingNavDests6.INSTANCE, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.navigation.StakingNavGraphKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StakingNavGraph5.stakingNavGraph$lambda$0(navController, initArgs, (NavGraphBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stakingNavGraph$lambda$0(NavHostController navHostController, CryptoStakingIntentKey cryptoStakingIntentKey, NavGraphBuilder navigation) {
        Intrinsics.checkNotNullParameter(navigation, "$this$navigation");
        NavGraphBuilders.composable(navigation, navHostController, StakingNavDests2.INSTANCE, ComposableLambda3.composableLambdaInstance(159442334, true, new StakingNavGraph6(cryptoStakingIntentKey, navHostController)));
        NavGraphBuilders.composable(navigation, navHostController, StakingNavDests3.INSTANCE, ComposableLambda3.composableLambdaInstance(-1736317305, true, new StakingNavGraph7(cryptoStakingIntentKey)));
        StakingNavDests stakingNavDests = StakingNavDests.INSTANCE;
        StakingNavGraph stakingNavGraph = StakingNavGraph.INSTANCE;
        NavGraphBuilders.composable(navigation, navHostController, stakingNavDests, stakingNavGraph.m24949getLambda$1290779994$feature_crypto_staking_externalDebug());
        NavGraphBuilders.composable(navigation, navHostController, StakingNavDests5.INSTANCE, stakingNavGraph.m24951getLambda$845242683$feature_crypto_staking_externalDebug());
        NavGraphBuilders.composable(navigation, navHostController, StakingNavDests4.INSTANCE, stakingNavGraph.m24950getLambda$399705372$feature_crypto_staking_externalDebug());
        return Unit.INSTANCE;
    }
}

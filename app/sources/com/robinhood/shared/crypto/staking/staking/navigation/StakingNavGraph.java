package com.robinhood.shared.crypto.staking.staking.navigation;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.models.crypto.p315ui.staking.UiCryptoStakingOrderModel;
import com.robinhood.shared.crypto.staking.staking.receipt.CryptoStakingReceiptComposable3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StakingNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.navigation.ComposableSingletons$StakingNavGraphKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class StakingNavGraph {
    public static final StakingNavGraph INSTANCE = new StakingNavGraph();

    /* renamed from: lambda$-1290779994, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f9410lambda$1290779994 = ComposableLambda3.composableLambdaInstance(-1290779994, false, StakingNavGraph2.INSTANCE);

    /* renamed from: lambda$-845242683, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f9412lambda$845242683 = ComposableLambda3.composableLambdaInstance(-845242683, false, StakingNavGraph4.INSTANCE);

    /* renamed from: lambda$-399705372, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f9411lambda$399705372 = ComposableLambda3.composableLambdaInstance(-399705372, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.navigation.ComposableSingletons$StakingNavGraphKt$lambda$-399705372$1
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
                ComposerKt.traceEventStart(-399705372, i, -1, "com.robinhood.shared.crypto.staking.staking.navigation.ComposableSingletons$StakingNavGraphKt.lambda$-399705372.<anonymous> (StakingNavGraph.kt:112)");
            }
            CryptoStakingReceiptComposable3.CryptoStakingReceiptComposable((UiCryptoStakingOrderModel) ComposableCompanion.args(entry), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1290779994$feature_crypto_staking_externalDebug, reason: not valid java name */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m24949getLambda$1290779994$feature_crypto_staking_externalDebug() {
        return f9410lambda$1290779994;
    }

    /* renamed from: getLambda$-399705372$feature_crypto_staking_externalDebug, reason: not valid java name */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m24950getLambda$399705372$feature_crypto_staking_externalDebug() {
        return f9411lambda$399705372;
    }

    /* renamed from: getLambda$-845242683$feature_crypto_staking_externalDebug, reason: not valid java name */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m24951getLambda$845242683$feature_crypto_staking_externalDebug() {
        return f9412lambda$845242683;
    }
}

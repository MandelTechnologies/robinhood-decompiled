package com.robinhood.shared.crypto.staking.staking.navigation;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavOptionsBuilder;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavOptionsBuilders;
import com.robinhood.models.crypto.p315ui.staking.UiCryptoStakingOrderModel;
import com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewComposable4;
import com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StakingNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.staking.staking.navigation.ComposableSingletons$StakingNavGraphKt$lambda$-845242683$1, reason: use source file name */
/* loaded from: classes6.dex */
final class StakingNavGraph4 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
    public static final StakingNavGraph4 INSTANCE = new StakingNavGraph4();

    StakingNavGraph4() {
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, final LifecycleAwareNavigator navigator, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-845242683, i, -1, "com.robinhood.shared.crypto.staking.staking.navigation.ComposableSingletons$StakingNavGraphKt.lambda$-845242683.<anonymous> (StakingNavGraph.kt:98)");
        }
        boolean z = true;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        CryptoStakingReviewDuxo.InitArgs initArgs = (CryptoStakingReviewDuxo.InitArgs) ComposableCompanion.args(entry);
        composer.startReplaceGroup(5004770);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(navigator)) && (i & 384) != 256) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.navigation.ComposableSingletons$StakingNavGraphKt$lambda$-845242683$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return StakingNavGraph4.invoke$lambda$2$lambda$1(navigator, (UiCryptoStakingOrderModel) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoStakingReviewComposable4.CryptoStakingReviewComposable(initArgs, (Function1) objRememberedValue, modifierFillMaxSize$default, null, composer, 384, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(LifecycleAwareNavigator lifecycleAwareNavigator, UiCryptoStakingOrderModel it) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(it, "it");
        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, StakingNavDests4.INSTANCE, it, null, null, false, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.navigation.ComposableSingletons$StakingNavGraphKt$lambda$-845242683$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StakingNavGraph4.invoke$lambda$2$lambda$1$lambda$0((NavOptionsBuilder) obj);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        NavOptionsBuilders.popUpTo(navigate, StakingNavDests6.INSTANCE.getRoutePath(), true);
        return Unit.INSTANCE;
    }
}

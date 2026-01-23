package com.robinhood.shared.crypto.staking.staking.navigation;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.models.crypto.p315ui.staking.UiCryptoStakingOrderModel;
import com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputComposable5;
import com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo;
import com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StakingNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.staking.staking.navigation.ComposableSingletons$StakingNavGraphKt$lambda$-1290779994$1, reason: use source file name */
/* loaded from: classes6.dex */
final class StakingNavGraph2 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
    public static final StakingNavGraph2 INSTANCE = new StakingNavGraph2();

    StakingNavGraph2() {
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
            ComposerKt.traceEventStart(-1290779994, i, -1, "com.robinhood.shared.crypto.staking.staking.navigation.ComposableSingletons$StakingNavGraphKt.lambda$-1290779994.<anonymous> (StakingNavGraph.kt:83)");
        }
        boolean z = true;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        CryptoStakingInputDuxo.InitArgs initArgs = (CryptoStakingInputDuxo.InitArgs) ComposableCompanion.args(entry);
        composer.startReplaceGroup(5004770);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(navigator)) && (i & 384) != 256) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.shared.crypto.staking.staking.navigation.ComposableSingletons$StakingNavGraphKt$lambda$-1290779994$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StakingNavGraph2.invoke$lambda$1$lambda$0(navigator, (UiCryptoStakingOrderModel) obj, (UUID) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoStakingInputComposable5.CryptoStakingInputComposable(initArgs, (Function2) objRememberedValue, modifierFillMaxSize$default, null, composer, 384, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator, UiCryptoStakingOrderModel order, UUID idempotencyId) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, StakingNavDests5.INSTANCE, new CryptoStakingReviewDuxo.InitArgs(order, idempotencyId), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }
}

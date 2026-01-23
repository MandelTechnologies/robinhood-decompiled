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
import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo;
import com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingComposable7;
import com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo;
import com.robinhood.shared.crypto.staking.staking.utils.OrderTypes2;
import com.robinhood.shared.staking.contracts.CryptoStakingIntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: StakingNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.staking.staking.navigation.StakingNavGraphKt$stakingNavGraph$1$2, reason: use source file name */
/* loaded from: classes6.dex */
final class StakingNavGraph7 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
    final /* synthetic */ CryptoStakingIntentKey $initArgs;

    StakingNavGraph7(CryptoStakingIntentKey cryptoStakingIntentKey) {
        this.$initArgs = cryptoStakingIntentKey;
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
            ComposerKt.traceEventStart(-1736317305, i, -1, "com.robinhood.shared.crypto.staking.staking.navigation.stakingNavGraph.<anonymous>.<anonymous> (StakingNavGraph.kt:65)");
        }
        boolean z = true;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        CryptoStakingOnboardingDuxo.InitArgs initArgs = (CryptoStakingOnboardingDuxo.InitArgs) ComposableCompanion.args(entry);
        composer.startReplaceGroup(-1633490746);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(navigator)) && (i & 384) != 256) {
            z = false;
        }
        boolean zChangedInstance = composer.changedInstance(this.$initArgs) | z;
        final CryptoStakingIntentKey cryptoStakingIntentKey = this.$initArgs;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.navigation.StakingNavGraphKt$stakingNavGraph$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StakingNavGraph7.invoke$lambda$1$lambda$0(navigator, cryptoStakingIntentKey);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoStakingOnboardingComposable7.CryptoStakingOnboardingComposable(initArgs, (Function0) objRememberedValue, modifierFillMaxSize$default, null, composer, 384, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator, CryptoStakingIntentKey cryptoStakingIntentKey) throws Resources.NotFoundException {
        StakingNavDests stakingNavDests = StakingNavDests.INSTANCE;
        UUID currencyPairId = cryptoStakingIntentKey.getCurrencyPairId();
        ApiCryptoStakingOrder.OrderType apiOrderType = OrderTypes2.getApiOrderType(cryptoStakingIntentKey.getOrderType());
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        String prefilledAssetAmount = cryptoStakingIntentKey.getPrefilledAssetAmount();
        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, stakingNavDests, new CryptoStakingInputDuxo.InitArgs(currencyPairId, apiOrderType, uuidRandomUUID, prefilledAssetAmount != null ? StringsKt.toBigDecimalOrNull(prefilledAssetAmount) : null, cryptoStakingIntentKey.getEntryPointIdentifier()), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }
}

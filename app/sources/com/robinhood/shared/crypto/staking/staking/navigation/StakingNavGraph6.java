package com.robinhood.shared.crypto.staking.staking.navigation;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavOptionsBuilders;
import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.models.crypto.p314db.staking.StakingConfig;
import com.robinhood.shared.crypto.staking.staking.initialization.InitialLoadingComposable4;
import com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo;
import com.robinhood.shared.crypto.staking.staking.onboarding.CryptoStakingOnboardingDuxo;
import com.robinhood.shared.crypto.staking.staking.utils.OrderTypes2;
import com.robinhood.shared.staking.contracts.CryptoStakingIntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: StakingNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.staking.staking.navigation.StakingNavGraphKt$stakingNavGraph$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class StakingNavGraph6 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
    final /* synthetic */ CryptoStakingIntentKey $initArgs;
    final /* synthetic */ NavHostController $navController;

    StakingNavGraph6(CryptoStakingIntentKey cryptoStakingIntentKey, NavHostController navHostController) {
        this.$initArgs = cryptoStakingIntentKey;
        this.$navController = navHostController;
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, final LifecycleAwareNavigator navigator, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(159442334, i, -1, "com.robinhood.shared.crypto.staking.staking.navigation.stakingNavGraph.<anonymous>.<anonymous> (StakingNavGraph.kt:32)");
        }
        boolean z = true;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        CryptoStakingIntentKey cryptoStakingIntentKey = this.$initArgs;
        composer.startReplaceGroup(-1746271574);
        int i2 = (i & 896) ^ 384;
        boolean zChangedInstance = ((i2 > 256 && composer.changed(navigator)) || (i & 384) == 256) | composer.changedInstance(this.$initArgs) | composer.changedInstance(this.$navController);
        final CryptoStakingIntentKey cryptoStakingIntentKey2 = this.$initArgs;
        final NavHostController navHostController = this.$navController;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.navigation.StakingNavGraphKt$stakingNavGraph$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return StakingNavGraph6.invoke$lambda$2$lambda$1(navigator, cryptoStakingIntentKey2, navHostController, (StakingConfig.OnboardingPage) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1746271574);
        if ((i2 <= 256 || !composer.changed(navigator)) && (i & 384) != 256) {
            z = false;
        }
        boolean zChangedInstance2 = composer.changedInstance(this.$initArgs) | z | composer.changedInstance(this.$navController);
        final CryptoStakingIntentKey cryptoStakingIntentKey3 = this.$initArgs;
        final NavHostController navHostController2 = this.$navController;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.staking.staking.navigation.StakingNavGraphKt$stakingNavGraph$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StakingNavGraph6.invoke$lambda$5$lambda$4(navigator, cryptoStakingIntentKey3, navHostController2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        InitialLoadingComposable4.InitialLoadingComposable(cryptoStakingIntentKey, function1, (Function0) objRememberedValue2, modifierFillMaxSize$default, null, composer, 3072, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(LifecycleAwareNavigator lifecycleAwareNavigator, CryptoStakingIntentKey cryptoStakingIntentKey, final NavHostController navHostController, StakingConfig.OnboardingPage onboardingPage) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(onboardingPage, "onboardingPage");
        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, StakingNavDests3.INSTANCE, new CryptoStakingOnboardingDuxo.InitArgs(onboardingPage, cryptoStakingIntentKey.getCurrencyPairId(), cryptoStakingIntentKey.getReceiptUuid(), cryptoStakingIntentKey.getEntryPointIdentifier()), null, null, false, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.navigation.StakingNavGraphKt$stakingNavGraph$1$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StakingNavGraph6.invoke$lambda$2$lambda$1$lambda$0(navHostController, (NavOptionsBuilder) obj);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(NavHostController navHostController, NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        NavOptionsBuilders.popUpToStartDestination(navigate, navHostController, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(LifecycleAwareNavigator lifecycleAwareNavigator, CryptoStakingIntentKey cryptoStakingIntentKey, final NavHostController navHostController) throws Resources.NotFoundException {
        StakingNavDests stakingNavDests = StakingNavDests.INSTANCE;
        UUID currencyPairId = cryptoStakingIntentKey.getCurrencyPairId();
        ApiCryptoStakingOrder.OrderType apiOrderType = OrderTypes2.getApiOrderType(cryptoStakingIntentKey.getOrderType());
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        String prefilledAssetAmount = cryptoStakingIntentKey.getPrefilledAssetAmount();
        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, stakingNavDests, new CryptoStakingInputDuxo.InitArgs(currencyPairId, apiOrderType, uuidRandomUUID, prefilledAssetAmount != null ? StringsKt.toBigDecimalOrNull(prefilledAssetAmount) : null, cryptoStakingIntentKey.getEntryPointIdentifier()), null, null, false, new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.navigation.StakingNavGraphKt$stakingNavGraph$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StakingNavGraph6.invoke$lambda$5$lambda$4$lambda$3(navHostController, (NavOptionsBuilder) obj);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4$lambda$3(NavHostController navHostController, NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        NavOptionsBuilders.popUpToStartDestination(navigate, navHostController, true);
        return Unit.INSTANCE;
    }
}

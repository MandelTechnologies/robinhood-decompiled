package com.robinhood.shared.crypto.transfer.send.address.manage;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.shared.crypto.contracts.transfers.CryptoAddSavedAddressFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoAddAddressNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddAddressNavGraphKt$cryptoAddAddressNavGraph$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoAddAddressNavGraph4 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
    final /* synthetic */ CryptoAddSavedAddressFragmentKey $args;

    CryptoAddAddressNavGraph4(CryptoAddSavedAddressFragmentKey cryptoAddSavedAddressFragmentKey) {
        this.$args = cryptoAddSavedAddressFragmentKey;
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
            ComposerKt.traceEventStart(267532985, i, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.cryptoAddAddressNavGraph.<anonymous>.<anonymous> (CryptoAddAddressNavGraph.kt:25)");
        }
        boolean z = true;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        SavedStateHandle savedStateHandle = entry.getSavedStateHandle();
        CryptoAddSavedAddressFragmentKey cryptoAddSavedAddressFragmentKey = this.$args;
        composer.startReplaceGroup(5004770);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(navigator)) && (i & 384) != 256) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddAddressNavGraphKt$cryptoAddAddressNavGraph$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoAddAddressNavGraph4.invoke$lambda$1$lambda$0(navigator);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoAddSavedAddressComposable5.CryptoAddSavedAddressComposable(cryptoAddSavedAddressFragmentKey, savedStateHandle, (Function0) objRememberedValue, modifierFillMaxSize$default, null, composer, 3072, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator) throws Resources.NotFoundException {
        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, CryptoAddAddressNavDestinations.INSTANCE, null, null, false, null, 30, null);
        return Unit.INSTANCE;
    }
}

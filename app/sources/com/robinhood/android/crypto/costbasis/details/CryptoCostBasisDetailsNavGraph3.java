package com.robinhood.android.crypto.costbasis.details;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import com.robinhood.android.crypto.costbasis.details.entry.CostBasisEntryArgs;
import com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoCostBasisDetailsNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsNavGraphKt$cryptoCostBasisDetailsNavGraph$1$2, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoCostBasisDetailsNavGraph3 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
    final /* synthetic */ NavHostController $navController;

    CryptoCostBasisDetailsNavGraph3(NavHostController navHostController) {
        this.$navController = navHostController;
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, LifecycleAwareNavigator navigator, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(573092078, i, -1, "com.robinhood.android.crypto.costbasis.details.cryptoCostBasisDetailsNavGraph.<anonymous>.<anonymous> (CryptoCostBasisDetailsNavGraph.kt:37)");
        }
        Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null));
        CostBasisEntryArgs costBasisEntryArgs = (CostBasisEntryArgs) ComposableCompanion.args(entry);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$navController);
        final NavHostController navHostController = this.$navController;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsNavGraphKt$cryptoCostBasisDetailsNavGraph$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoCostBasisDetailsNavGraph3.invoke$lambda$1$lambda$0(navHostController);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoCostBasisEntryComposableKt.CryptoCostBasisEntryComposable(costBasisEntryArgs, (Function0) objRememberedValue, modifierSystemBarsPadding, null, composer, 0, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(NavHostController navHostController) {
        navHostController.popBackStack();
        return Unit.INSTANCE;
    }
}

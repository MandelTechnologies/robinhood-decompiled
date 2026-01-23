package com.robinhood.android.crypto.costbasis.details;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.crypto.contracts.CryptoCostBasisDetailsIntentKey;
import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListComposableKt;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCostBasisDetailsNavGraph.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"cryptoCostBasisDetailsNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "extras", "Lcom/robinhood/android/crypto/contracts/CryptoCostBasisDetailsIntentKey;", "navController", "Landroidx/navigation/NavHostController;", "feature-crypto-cost-basis_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsNavGraphKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoCostBasisDetailsNavGraph {
    public static final void cryptoCostBasisDetailsNavGraph(NavGraphBuilder navGraphBuilder, final CryptoCostBasisDetailsIntentKey extras, final NavHostController navController) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(navController, "navController");
        NavGraphBuilders.navigation(navGraphBuilder, CryptoCostBasisDetailsDestinations2.INSTANCE, CryptoCostBasisDetailsDestinations3.INSTANCE, new Function1() { // from class: com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsNavGraphKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoCostBasisDetailsNavGraph.cryptoCostBasisDetailsNavGraph$lambda$0(navController, extras, (NavGraphBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoCostBasisDetailsNavGraph$lambda$0(NavHostController navHostController, final CryptoCostBasisDetailsIntentKey cryptoCostBasisDetailsIntentKey, NavGraphBuilder navigation) {
        Intrinsics.checkNotNullParameter(navigation, "$this$navigation");
        NavGraphBuilders.composable(navigation, navHostController, CryptoCostBasisDetailsDestinations2.INSTANCE, ComposableLambda3.composableLambdaInstance(1566543607, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsNavGraphKt$cryptoCostBasisDetailsNavGraph$1$1
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
                    ComposerKt.traceEventStart(1566543607, i, -1, "com.robinhood.android.crypto.costbasis.details.cryptoCostBasisDetailsNavGraph.<anonymous>.<anonymous> (CryptoCostBasisDetailsNavGraph.kt:26)");
                }
                CryptoCostBasisDetailsListComposableKt.CryptoCostBasisDetailsListComposable(cryptoCostBasisDetailsIntentKey, WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), null, composer, 0, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navigation, navHostController, CryptoCostBasisDetailsDestinations.INSTANCE, ComposableLambda3.composableLambdaInstance(573092078, true, new CryptoCostBasisDetailsNavGraph3(navHostController)));
        return Unit.INSTANCE;
    }
}

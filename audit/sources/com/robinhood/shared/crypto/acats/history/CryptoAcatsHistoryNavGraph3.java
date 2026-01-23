package com.robinhood.shared.crypto.acats.history;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.contracts.CryptoAcatsHistoryFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAcatsHistoryNavGraph.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"cryptoAcatsHistoryNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "key", "Lcom/robinhood/shared/crypto/contracts/CryptoAcatsHistoryFragmentKey;", "feature-acats_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryNavGraphKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAcatsHistoryNavGraph3 {
    public static final void cryptoAcatsHistoryNavGraph(NavGraphBuilder navGraphBuilder, final NavHostController navController, final CryptoAcatsHistoryFragmentKey key) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(key, "key");
        NavGraphBuilders.navigation(navGraphBuilder, CryptoAcatsHistoryDestinations.INSTANCE, CryptoAcatsHistoryDestinations2.INSTANCE, new Function1() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryNavGraphKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoAcatsHistoryNavGraph3.cryptoAcatsHistoryNavGraph$lambda$0(navController, key, (NavGraphBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoAcatsHistoryNavGraph$lambda$0(NavHostController navHostController, final CryptoAcatsHistoryFragmentKey cryptoAcatsHistoryFragmentKey, NavGraphBuilder navigation) {
        Intrinsics.checkNotNullParameter(navigation, "$this$navigation");
        NavGraphBuilders.composable(navigation, navHostController, CryptoAcatsHistoryDestinations.INSTANCE, ComposableLambda3.composableLambdaInstance(215399561, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryNavGraphKt$cryptoAcatsHistoryNavGraph$1$1
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
                    ComposerKt.traceEventStart(215399561, i, -1, "com.robinhood.shared.crypto.acats.history.cryptoAcatsHistoryNavGraph.<anonymous>.<anonymous> (CryptoAcatsHistoryNavGraph.kt:24)");
                }
                CryptoAcatsHistoryComposableKt.CryptoAcatsHistoryComposable(cryptoAcatsHistoryFragmentKey, ModifiersKt.logScreenTransitions(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TXN_DETAIL, null, null, null, 14, null), null, null, null, null, 61, null)), null, composer, 0, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navigation, navHostController, CryptoAcatsHistoryDestinations3.INSTANCE, CryptoAcatsHistoryNavGraph.INSTANCE.m24877getLambda$462238862$feature_acats_externalRelease());
        return Unit.INSTANCE;
    }
}

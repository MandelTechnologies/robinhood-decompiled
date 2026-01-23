package com.robinhood.shared.crypto.acats.history;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationsDetailAssetsResponseDto;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAcatsHistoryNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.acats.history.ComposableSingletons$CryptoAcatsHistoryNavGraphKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAcatsHistoryNavGraph {
    public static final CryptoAcatsHistoryNavGraph INSTANCE = new CryptoAcatsHistoryNavGraph();

    /* renamed from: lambda$-462238862, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f9399lambda$462238862 = ComposableLambda3.composableLambdaInstance(-462238862, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.history.ComposableSingletons$CryptoAcatsHistoryNavGraphKt$lambda$-462238862$1
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
                ComposerKt.traceEventStart(-462238862, i, -1, "com.robinhood.shared.crypto.acats.history.ComposableSingletons$CryptoAcatsHistoryNavGraphKt.lambda$-462238862.<anonymous> (CryptoAcatsHistoryNavGraph.kt:34)");
            }
            CryptoMigrationsDetailAssetsComposable3.CryptoMigrationsDetailAssetsComposable((CryptoMigrationsDetailAssetsResponseDto) ComposableCompanion.args(entry), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-462238862$feature_acats_externalRelease, reason: not valid java name */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m24877getLambda$462238862$feature_acats_externalRelease() {
        return f9399lambda$462238862;
    }
}

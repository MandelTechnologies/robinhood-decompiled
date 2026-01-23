package com.robinhood.android.gold.upgrade.unified;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedEmbeddedComposable;
import com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageApplicationComposable3;
import com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposable4;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUnifiedNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.ComposableSingletons$GoldUnifiedNavGraphKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedNavGraph {
    public static final GoldUnifiedNavGraph INSTANCE = new GoldUnifiedNavGraph();
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> lambda$489458950 = ComposableLambda3.composableLambdaInstance(489458950, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.ComposableSingletons$GoldUnifiedNavGraphKt$lambda$489458950$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, LifecycleAwareNavigator unused$var$2, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            Intrinsics.checkNotNullParameter(unused$var$2, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(489458950, i, -1, "com.robinhood.android.gold.upgrade.unified.ComposableSingletons$GoldUnifiedNavGraphKt.lambda$489458950.<anonymous> (GoldUnifiedNavGraph.kt:41)");
            }
            GoldUnifiedEmbeddedComposable.GoldUnifiedEmbeddedComposable(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> lambda$2056071678 = ComposableLambda3.composableLambdaInstance(2056071678, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.ComposableSingletons$GoldUnifiedNavGraphKt$lambda$2056071678$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, LifecycleAwareNavigator unused$var$2, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            Intrinsics.checkNotNullParameter(unused$var$2, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2056071678, i, -1, "com.robinhood.android.gold.upgrade.unified.ComposableSingletons$GoldUnifiedNavGraphKt.lambda$2056071678.<anonymous> (GoldUnifiedNavGraph.kt:99)");
            }
            GoldUnifiedHostComposable3.UpdateApp(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> lambda$657792833 = ComposableLambda3.composableLambdaInstance(657792833, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.ComposableSingletons$GoldUnifiedNavGraphKt$lambda$657792833$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, LifecycleAwareNavigator unused$var$2, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            Intrinsics.checkNotNullParameter(unused$var$2, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(657792833, i, -1, "com.robinhood.android.gold.upgrade.unified.ComposableSingletons$GoldUnifiedNavGraphKt.lambda$657792833.<anonymous> (GoldUnifiedNavGraph.kt:115)");
            }
            GoldSageStartApplicationComposable4.GoldSageStartApplicationComposable(null, null, null, null, composer, 0, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> lambda$1623355650 = ComposableLambda3.composableLambdaInstance(1623355650, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.ComposableSingletons$GoldUnifiedNavGraphKt$lambda$1623355650$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, LifecycleAwareNavigator unused$var$2, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            Intrinsics.checkNotNullParameter(unused$var$2, "$unused$var$");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1623355650, i, -1, "com.robinhood.android.gold.upgrade.unified.ComposableSingletons$GoldUnifiedNavGraphKt.lambda$1623355650.<anonymous> (GoldUnifiedNavGraph.kt:118)");
            }
            GoldSageApplicationComposable3.GoldSageApplicationComposable(null, null, null, null, composer, 0, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> getLambda$1623355650$feature_gold_upgrade_externalRelease() {
        return lambda$1623355650;
    }

    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> getLambda$2056071678$feature_gold_upgrade_externalRelease() {
        return lambda$2056071678;
    }

    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> getLambda$489458950$feature_gold_upgrade_externalRelease() {
        return lambda$489458950;
    }

    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> getLambda$657792833$feature_gold_upgrade_externalRelease() {
        return lambda$657792833;
    }
}

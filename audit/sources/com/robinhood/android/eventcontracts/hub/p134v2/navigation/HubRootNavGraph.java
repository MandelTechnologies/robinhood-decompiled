package com.robinhood.android.eventcontracts.hub.p134v2.navigation;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.eventcontracts.hub.p134v2.navigation.HubRootNavGraphDestinations2;
import com.robinhood.android.eventcontracts.hub.p134v2.root.HubMainComposable3;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HubRootNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.navigation.ComposableSingletons$HubRootNavGraphKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubRootNavGraph {
    public static final HubRootNavGraph INSTANCE = new HubRootNavGraph();
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> lambda$2096202629 = ComposableLambda3.composableLambdaInstance(2096202629, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.navigation.ComposableSingletons$HubRootNavGraphKt$lambda$2096202629$1
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
                ComposerKt.traceEventStart(2096202629, i, -1, "com.robinhood.android.eventcontracts.hub.v2.navigation.ComposableSingletons$HubRootNavGraphKt.lambda$2096202629.<anonymous> (HubRootNavGraph.kt:34)");
            }
            HubMainComposable3.HubMainComposable(((HubRootNavGraphDestinations2.Args) ComposableCompanion.args(entry)).getEntryPointIdentifier(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> getLambda$2096202629$feature_hub_v2_externalDebug() {
        return lambda$2096202629;
    }
}

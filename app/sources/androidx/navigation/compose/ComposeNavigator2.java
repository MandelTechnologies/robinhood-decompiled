package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: ComposeNavigator.kt */
@Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class ComposeNavigator2 {
    public static final ComposeNavigator2 INSTANCE = new ComposeNavigator2();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> f8591lambda1 = ComposableLambda3.composableLambdaInstance(127448943, false, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(127448943, i, -1, "androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt.lambda-1.<anonymous> (ComposeNavigator.kt:62)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$navigation_compose_release, reason: not valid java name */
    public final Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> m8325getLambda1$navigation_compose_release() {
        return f8591lambda1;
    }
}

package com.robinhood.android.gold.sage;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavOptionsBuilder;
import com.robinhood.android.gold.sage.data.GoldSageDestinationArgs;
import com.robinhood.android.gold.sage.data.GoldSageFlow;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavOptionsBuilders;
import com.robinhood.android.navigation.compose.NavTransition;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldSageNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.sage.GoldSageNavGraphKt$goldSageNavGraph$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldSageNavGraph2 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
    final /* synthetic */ Function1<Throwable, Unit> $handleError;

    /* JADX WARN: Multi-variable type inference failed */
    GoldSageNavGraph2(Function1<? super Throwable, Unit> function1) {
        this.$handleError = function1;
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(LifecycleAwareNavigator lifecycleAwareNavigator, GoldSageFlow goldSageFlow) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(goldSageFlow, "goldSageFlow");
        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(GoldSageDestinations3.INSTANCE, new GoldSageDestinationArgs(goldSageFlow), NavTransition.NONE, null, 4, null), false, new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageNavGraphKt$goldSageNavGraph$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldSageNavGraph2.invoke$lambda$2$lambda$1$lambda$0((NavOptionsBuilder) obj);
            }
        }, 2, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        NavOptionsBuilders.popUpTo(navigate, GoldSageDestinations2.INSTANCE.getRoutePath(), true);
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, final LifecycleAwareNavigator navigator, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-135606725, i, -1, "com.robinhood.android.gold.sage.goldSageNavGraph.<anonymous>.<anonymous> (GoldSageNavGraph.kt:25)");
        }
        composer.startReplaceGroup(5004770);
        boolean z = (((i & 896) ^ 384) > 256 && composer.changed(navigator)) || (i & 384) == 256;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageNavGraphKt$goldSageNavGraph$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoldSageNavGraph2.invoke$lambda$2$lambda$1(navigator, (GoldSageFlow) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        GoldSageLoadingComposable.GoldSageLoadingComposable((Function1) objRememberedValue, this.$handleError, null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

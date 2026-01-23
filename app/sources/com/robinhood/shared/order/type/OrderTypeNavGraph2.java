package com.robinhood.shared.order.type;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.robinhood.shared.order.type.OrderTypeDestinations;
import com.robinhood.shared.order.type.education.CryptoOrderTypeEducationComposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderTypeNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.order.type.ComposableSingletons$OrderTypeNavGraphKt$lambda$-1410630193$1, reason: use source file name */
/* loaded from: classes6.dex */
final class OrderTypeNavGraph2 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
    public static final OrderTypeNavGraph2 INSTANCE = new OrderTypeNavGraph2();

    OrderTypeNavGraph2() {
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
            ComposerKt.traceEventStart(-1410630193, i, -1, "com.robinhood.shared.order.type.ComposableSingletons$OrderTypeNavGraphKt.lambda$-1410630193.<anonymous> (OrderTypeNavGraph.kt:45)");
        }
        final OrderTypeDestinations.Args args = (OrderTypeDestinations.Args) ComposableCompanion.args(entry);
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration = args.getConfiguration();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = ((((i & 896) ^ 384) > 256 && composer.changed(navigator)) || (i & 384) == 256) | composer.changedInstance(args);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.order.type.ComposableSingletons$OrderTypeNavGraphKt$lambda$-1410630193$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderTypeNavGraph2.invoke$lambda$1$lambda$0(navigator, args);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoOrderTypeEducationComposable.CryptoOrderTypeEducationComposable(configuration, (Function0) objRememberedValue, null, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator, OrderTypeDestinations.Args args) throws Resources.NotFoundException {
        LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, OrderTypeDestinations3.INSTANCE.createComposeNav(args.getPriceInputArgs()), false, (Function1) null, 6, (Object) null);
        return Unit.INSTANCE;
    }
}

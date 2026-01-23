package com.robinhood.shared.order.type;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey5;
import com.robinhood.shared.order.type.OrderTypeDestinations5;
import com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposable5;
import com.robinhood.shared.order.type.timeInForce.TimeInForceOrderPrice2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderTypeNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.order.type.OrderTypeNavGraphKt$orderTypeNavGraph$1$3, reason: use source file name */
/* loaded from: classes6.dex */
final class OrderTypeNavGraph6 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
    final /* synthetic */ Function1<CryptoOrderTypeFragmentKey5, Unit> $onOrderPricesSelected;

    /* JADX WARN: Multi-variable type inference failed */
    OrderTypeNavGraph6(Function1<? super CryptoOrderTypeFragmentKey5, Unit> function1) {
        this.$onOrderPricesSelected = function1;
    }

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
            ComposerKt.traceEventStart(-1810136623, i, -1, "com.robinhood.shared.order.type.orderTypeNavGraph.<anonymous>.<anonymous> (OrderTypeNavGraph.kt:64)");
        }
        final OrderTypeDestinations5.Args args = (OrderTypeDestinations5.Args) ComposableCompanion.args(entry);
        OrderTimeInForce timeInForce = args.getTimeInForceOrderPrice().getTimeInForce();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(args) | composer.changed(this.$onOrderPricesSelected);
        final Function1<CryptoOrderTypeFragmentKey5, Unit> function1 = this.$onOrderPricesSelected;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.order.type.OrderTypeNavGraphKt$orderTypeNavGraph$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderTypeNavGraph6.invoke$lambda$1$lambda$0(args, function1, (OrderTimeInForce) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SelectTimeInForceComposable5.SelectTimeInForceComposable(timeInForce, (Function1) objRememberedValue, null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(OrderTypeDestinations5.Args args, Function1 function1, OrderTimeInForce selectedTimeInForce) {
        Intrinsics.checkNotNullParameter(selectedTimeInForce, "selectedTimeInForce");
        function1.invoke(TimeInForceOrderPrice2.toOrderPrices(args.getTimeInForceOrderPrice(), selectedTimeInForce));
        return Unit.INSTANCE;
    }
}

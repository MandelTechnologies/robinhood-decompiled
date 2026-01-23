package com.robinhood.shared.order.type;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import com.robinhood.android.navigation.compose.destination.BaseComposableDestination;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey3;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey5;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposable4;
import com.robinhood.shared.order.type.selection.OrderTypeSelectionComposable5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeNavGraph.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001ap\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0000¨\u0006\u0012"}, m3636d2 = {"orderTypeNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "initialArgs", "Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey;", "onOrderPricesSelected", "Lkotlin/Function1;", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices;", "Lkotlin/ParameterName;", "name", "orderPrices", "onEducationItemSelected", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderEducationAction;", "action", "onActivityBackPress", "Lkotlin/Function0;", "lib-order-type_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.OrderTypeNavGraphKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypeNavGraph3 {
    public static final void orderTypeNavGraph(NavGraphBuilder navGraphBuilder, final NavHostController navController, final CryptoOrderTypeFragmentKey initialArgs, final Function1<? super CryptoOrderTypeFragmentKey5, Unit> onOrderPricesSelected, final Function1<? super CryptoOrderTypeFragmentKey3, Unit> onEducationItemSelected, final Function0<Unit> onActivityBackPress) {
        BaseComposableDestination baseComposableDestinationCreateDest;
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(initialArgs, "initialArgs");
        Intrinsics.checkNotNullParameter(onOrderPricesSelected, "onOrderPricesSelected");
        Intrinsics.checkNotNullParameter(onEducationItemSelected, "onEducationItemSelected");
        Intrinsics.checkNotNullParameter(onActivityBackPress, "onActivityBackPress");
        if (initialArgs instanceof CryptoOrderTypeFragmentKey.SelectOrderType) {
            baseComposableDestinationCreateDest = OrderTypeDestinations4.INSTANCE.createDest(initialArgs);
        } else {
            if (!(initialArgs instanceof CryptoOrderTypeFragmentKey.EditOrderType)) {
                throw new NoWhenBranchMatchedException();
            }
            baseComposableDestinationCreateDest = OrderTypeDestinations3.INSTANCE.createDest(initialArgs);
        }
        NavGraphBuilders.navigation(navGraphBuilder, baseComposableDestinationCreateDest, OrderTypeDestinations2.INSTANCE, new Function1() { // from class: com.robinhood.shared.order.type.OrderTypeNavGraphKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTypeNavGraph3.orderTypeNavGraph$lambda$0(navController, initialArgs, onActivityBackPress, onOrderPricesSelected, onEducationItemSelected, (NavGraphBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit orderTypeNavGraph$lambda$0(NavHostController navHostController, CryptoOrderTypeFragmentKey cryptoOrderTypeFragmentKey, final Function0 function0, final Function1 function1, final Function1 function12, NavGraphBuilder navigation) {
        Intrinsics.checkNotNullParameter(navigation, "$this$navigation");
        NavGraphBuilders.composable(navigation, navHostController, OrderTypeDestinations4.INSTANCE.createDest(cryptoOrderTypeFragmentKey), ComposableLambda3.composableLambdaInstance(-280392232, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.OrderTypeNavGraphKt$orderTypeNavGraph$1$1
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
                    ComposerKt.traceEventStart(-280392232, i, -1, "com.robinhood.shared.order.type.orderTypeNavGraph.<anonymous>.<anonymous> (OrderTypeNavGraph.kt:38)");
                }
                OrderTypeSelectionComposable5.OrderTypeSelectionComposable(function0, function1, function12, null, null, composer, 0, 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navigation, navHostController, OrderTypeDestinations.INSTANCE, OrderTypeNavGraph.INSTANCE.m25565getLambda$1410630193$lib_order_type_externalDebug());
        NavGraphBuilders.composable(navigation, navHostController, OrderTypeDestinations3.INSTANCE.createDest(cryptoOrderTypeFragmentKey), ComposableLambda3.composableLambdaInstance(537100240, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.OrderTypeNavGraphKt$orderTypeNavGraph$1$2
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
                    ComposerKt.traceEventStart(537100240, i, -1, "com.robinhood.shared.order.type.orderTypeNavGraph.<anonymous>.<anonymous> (OrderTypeNavGraph.kt:59)");
                }
                OrderTypePriceInputComposable4.OrderTypePriceInputComposable(function0, null, composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navigation, navHostController, OrderTypeDestinations5.INSTANCE, ComposableLambda3.composableLambdaInstance(-1810136623, true, new OrderTypeNavGraph6(function1)));
        return Unit.INSTANCE;
    }
}

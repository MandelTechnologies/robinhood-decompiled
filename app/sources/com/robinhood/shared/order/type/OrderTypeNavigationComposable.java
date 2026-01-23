package com.robinhood.shared.order.type;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey3;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OrderTypeNavigationComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ai\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"OrderTypeNavigationComposable", "", "initialArgs", "Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey;", "onOrderPricesSelected", "Lkotlin/Function1;", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices;", "Lkotlin/ParameterName;", "name", "orderPrices", "onEducationItemSelected", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderEducationAction;", "action", "onActivityBackPress", "Lkotlin/Function0;", "(Lcom/robinhood/shared/crypto/contracts/orderType/CryptoOrderTypeFragmentKey;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-order-type_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.order.type.OrderTypeNavigationComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypeNavigationComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderTypeNavigationComposable$lambda$2(CryptoOrderTypeFragmentKey cryptoOrderTypeFragmentKey, Function1 function1, Function1 function12, Function0 function0, int i, Composer composer, int i2) {
        OrderTypeNavigationComposable(cryptoOrderTypeFragmentKey, function1, function12, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OrderTypeNavigationComposable(final CryptoOrderTypeFragmentKey initialArgs, final Function1<? super CryptoOrderTypeFragmentKey5, Unit> onOrderPricesSelected, final Function1<? super CryptoOrderTypeFragmentKey3, Unit> onEducationItemSelected, final Function0<Unit> onActivityBackPress, Composer composer, final int i) {
        int i2;
        final NavHostController navHostController;
        Intrinsics.checkNotNullParameter(initialArgs, "initialArgs");
        Intrinsics.checkNotNullParameter(onOrderPricesSelected, "onOrderPricesSelected");
        Intrinsics.checkNotNullParameter(onEducationItemSelected, "onEducationItemSelected");
        Intrinsics.checkNotNullParameter(onActivityBackPress, "onActivityBackPress");
        Composer composerStartRestartGroup = composer.startRestartGroup(198029952);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(initialArgs) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onOrderPricesSelected) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEducationItemSelected) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onActivityBackPress) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(198029952, i2, -1, "com.robinhood.shared.order.type.OrderTypeNavigationComposable (OrderTypeNavigationComposable.kt:19)");
            }
            NavHostController navHostControllerRememberNavController = NavHostController2.rememberNavController(new Navigator[0], composerStartRestartGroup, 0);
            Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i2 & 7168) == 2048) | ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(navHostControllerRememberNavController) | composerStartRestartGroup.changedInstance(initialArgs) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                navHostController = navHostControllerRememberNavController;
                Function2 function2 = new Function2() { // from class: com.robinhood.shared.order.type.OrderTypeNavigationComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderTypeNavigationComposable.OrderTypeNavigationComposable$lambda$1$lambda$0(navHostController, initialArgs, onOrderPricesSelected, onEducationItemSelected, onActivityBackPress, (NavGraphBuilder) obj, (NavHostController) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function2);
                objRememberedValue = function2;
            } else {
                navHostController = navHostControllerRememberNavController;
            }
            composerStartRestartGroup.endReplaceGroup();
            GenericNavHost.m20570GenericNavHostuDo3WH8(navHostController, extensions2.persistentSetOf((Function2) objRememberedValue), OrderTypeDestinations2.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), modifierSystemBarsPadding, composerStartRestartGroup, ComposableDestination.$stable << 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.OrderTypeNavigationComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderTypeNavigationComposable.OrderTypeNavigationComposable$lambda$2(initialArgs, onOrderPricesSelected, onEducationItemSelected, onActivityBackPress, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderTypeNavigationComposable$lambda$1$lambda$0(NavHostController navHostController, CryptoOrderTypeFragmentKey cryptoOrderTypeFragmentKey, Function1 function1, Function1 function12, Function0 function0, NavGraphBuilder persistentSetOf, NavHostController it) {
        Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
        Intrinsics.checkNotNullParameter(it, "it");
        OrderTypeNavGraph3.orderTypeNavGraph(persistentSetOf, navHostController, cryptoOrderTypeFragmentKey, function1, function12, function0);
        return Unit.INSTANCE;
    }
}

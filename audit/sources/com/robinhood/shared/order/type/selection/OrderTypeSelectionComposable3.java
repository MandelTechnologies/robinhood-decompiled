package com.robinhood.shared.order.type.selection;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey3;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey6;
import com.robinhood.shared.order.type.selection.OrderTypeSelectionViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OrderTypeSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.order.type.selection.ComposableSingletons$OrderTypeSelectionComposableKt$lambda$4837169$1, reason: use source file name */
/* loaded from: classes6.dex */
final class OrderTypeSelectionComposable3 implements Function2<Composer, Integer, Unit> {
    public static final OrderTypeSelectionComposable3 INSTANCE = new OrderTypeSelectionComposable3();

    OrderTypeSelectionComposable3() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(4837169, i, -1, "com.robinhood.shared.order.type.selection.ComposableSingletons$OrderTypeSelectionComposableKt.lambda$4837169.<anonymous> (OrderTypeSelectionComposable.kt:196)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
        StringResource.Companion companion2 = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion2.invoke("Sell order types");
        int i3 = C20690R.drawable.pict_mono_rds_crypto_c;
        StringResource stringResourceInvoke2 = companion2.invoke("Market Order");
        StringResource stringResourceInvoke3 = companion2.invoke("Sell BTC at the best available price");
        CryptoOrderTypeFragmentKey6 cryptoOrderTypeFragmentKey6 = CryptoOrderTypeFragmentKey6.MARKET;
        OrderTypeSelectionViewState.OrderTypeRowState orderTypeRowState = new OrderTypeSelectionViewState.OrderTypeRowState(i3, true, stringResourceInvoke2, stringResourceInvoke3, cryptoOrderTypeFragmentKey6);
        int i4 = C20690R.drawable.pict_clr_rds_order_types_sell_limit;
        StringResource stringResourceInvoke4 = companion2.invoke("Limit Order");
        StringResource stringResourceInvoke5 = companion2.invoke("Sell BTC at a minimum price or higher");
        CryptoOrderTypeFragmentKey6 cryptoOrderTypeFragmentKey62 = CryptoOrderTypeFragmentKey6.LIMIT;
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new OrderTypeSelectionViewState.SectionState.OrderSectionState(stringResourceInvoke, extensions2.persistentListOf(orderTypeRowState, new OrderTypeSelectionViewState.OrderTypeRowState(i4, false, stringResourceInvoke4, stringResourceInvoke5, cryptoOrderTypeFragmentKey62, 2, null))), new OrderTypeSelectionViewState.SectionState.OrderSectionState(companion2.invoke("Buy order types"), extensions2.persistentListOf(new OrderTypeSelectionViewState.OrderTypeRowState(C20690R.drawable.pict_mono_rds_crypto_c, true, companion2.invoke("Market Order"), companion2.invoke("Buy BTC at the best available price"), cryptoOrderTypeFragmentKey6), new OrderTypeSelectionViewState.OrderTypeRowState(C20690R.drawable.pict_clr_rds_order_types_buy_limit, false, companion2.invoke("Limit Order"), companion2.invoke("Buy BTC at a maximum price or lower"), cryptoOrderTypeFragmentKey62, 2, null))), new OrderTypeSelectionViewState.SectionState.EducationSectionState(companion2.invoke("Education"), extensions2.persistentListOf(new OrderTypeSelectionViewState.EducationTypeRowState(companion2.invoke("Learn about perpetual futures"), companion2.invoke("View guide"), CryptoOrderTypeFragmentKey3.VIEW_GUIDE), new OrderTypeSelectionViewState.EducationTypeRowState(companion2.invoke("Learn to place a trade"), companion2.invoke("Launch tour"), CryptoOrderTypeFragmentKey3.LAUNCH_TOUR))));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.order.type.selection.ComposableSingletons$OrderTypeSelectionComposableKt$lambda$4837169$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderTypeSelectionComposable3.invoke$lambda$1$lambda$0((CryptoOrderTypeFragmentKey6) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.order.type.selection.ComposableSingletons$OrderTypeSelectionComposableKt$lambda$4837169$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderTypeSelectionComposable3.invoke$lambda$3$lambda$2((CryptoOrderTypeFragmentKey3) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        OrderTypeSelectionComposable5.MainContent(immutableList3PersistentListOf, function1, (Function1) objRememberedValue2, modifierM5144paddingVpY3zN4$default, composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CryptoOrderTypeFragmentKey6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(CryptoOrderTypeFragmentKey3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}

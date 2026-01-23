package com.robinhood.shared.order.type.priceInput;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import com.robinhood.shared.order.type.util.TextFieldValueUtil;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderTypePriceInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.order.type.priceInput.ComposableSingletons$OrderTypePriceInputComposableKt$lambda$-1548545379$1, reason: use source file name */
/* loaded from: classes6.dex */
final class OrderTypePriceInputComposable2 implements Function2<Composer, Integer, Unit> {
    public static final OrderTypePriceInputComposable2 INSTANCE = new OrderTypePriceInputComposable2();

    OrderTypePriceInputComposable2() {
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
            ComposerKt.traceEventStart(-1548545379, i, -1, "com.robinhood.shared.order.type.priceInput.ComposableSingletons$OrderTypePriceInputComposableKt.lambda$-1548545379.<anonymous> (OrderTypePriceInputComposable.kt:317)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke("<Title>");
        StringResource stringResourceInvoke2 = companion.invoke("<Description>");
        OrderTypePriceInputViewState.PriceInputRowState priceInputRowState = new OrderTypePriceInputViewState.PriceInputRowState(companion.invoke("Limit price"), TextFieldValueUtil.toTextFieldValue("$0.00", ""), true, 0, false);
        OrderTypePriceInputViewState.PriceForOrderRowState priceForOrderRowState = new OrderTypePriceInputViewState.PriceForOrderRowState(companion.invoke("Bid:"), "$64,043.00", false);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.order.type.priceInput.ComposableSingletons$OrderTypePriceInputComposableKt$lambda$-1548545379$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        int i2 = StringResource.$stable;
        OrderTypePriceInputComposable4.MainContent(stringResourceInvoke, stringResourceInvoke2, priceInputRowState, priceForOrderRowState, function0, modifierM4872backgroundbw27NRU$default, composer, (i2 << 9) | i2 | 24576 | (i2 << 3) | (i2 << 6), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

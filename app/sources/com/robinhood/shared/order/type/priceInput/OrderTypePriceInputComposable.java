package com.robinhood.shared.order.type.priceInput;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OrderTypePriceInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.priceInput.ComposableSingletons$OrderTypePriceInputComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypePriceInputComposable {
    public static final OrderTypePriceInputComposable INSTANCE = new OrderTypePriceInputComposable();
    private static Function2<Composer, Integer, Unit> lambda$1277212661 = ComposableLambda3.composableLambdaInstance(1277212661, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.order.type.priceInput.ComposableSingletons$OrderTypePriceInputComposableKt$lambda$1277212661$1
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
                ComposerKt.traceEventStart(1277212661, i, -1, "com.robinhood.shared.order.type.priceInput.ComposableSingletons$OrderTypePriceInputComposableKt.lambda$1277212661.<anonymous> (OrderTypePriceInputComposable.kt:89)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1548545379, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9465lambda$1548545379 = ComposableLambda3.composableLambdaInstance(-1548545379, false, OrderTypePriceInputComposable2.INSTANCE);

    /* renamed from: getLambda$-1548545379$lib_order_type_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25572getLambda$1548545379$lib_order_type_externalDebug() {
        return f9465lambda$1548545379;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1277212661$lib_order_type_externalDebug() {
        return lambda$1277212661;
    }
}

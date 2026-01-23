package com.robinhood.android.futures.trade.p147ui.orderform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OrderFormRows.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$OrderFormRowsKt {
    public static final ComposableSingletons$OrderFormRowsKt INSTANCE = new ComposableSingletons$OrderFormRowsKt();
    private static Function2<Composer, Integer, Unit> lambda$1709260126 = ComposableLambda3.composableLambdaInstance(1709260126, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.ComposableSingletons$OrderFormRowsKt$lambda$1709260126$1
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
                ComposerKt.traceEventStart(1709260126, i, -1, "com.robinhood.android.futures.trade.ui.orderform.ComposableSingletons$OrderFormRowsKt.lambda$1709260126.<anonymous> (OrderFormRows.kt:451)");
            }
            OrderFormRowsKt.BuyingPowerEffectRow(OrderForm6.EDITING, null, null, null, null, null, null, composer, 1797558);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2070254469, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9011lambda$2070254469 = ComposableLambda3.composableLambdaInstance(-2070254469, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.ComposableSingletons$OrderFormRowsKt$lambda$-2070254469$1
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
                ComposerKt.traceEventStart(-2070254469, i, -1, "com.robinhood.android.futures.trade.ui.orderform.ComposableSingletons$OrderFormRowsKt.lambda$-2070254469.<anonymous> (OrderFormRows.kt:484)");
            }
            OrderFormRowsKt.BuyingPowerEffectRow(OrderForm6.EDITING, "$1,234.56", null, null, null, StringResource.INSTANCE.invoke("$5,432.10"), null, composer, (StringResource.$stable << 15) | 1600950);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1773231206, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9010lambda$1773231206 = ComposableLambda3.composableLambdaInstance(-1773231206, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.ComposableSingletons$OrderFormRowsKt$lambda$-1773231206$1
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
                ComposerKt.traceEventStart(-1773231206, i, -1, "com.robinhood.android.futures.trade.ui.orderform.ComposableSingletons$OrderFormRowsKt.lambda$-1773231206.<anonymous> (OrderFormRows.kt:500)");
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke("$5,432.10");
            StringResource stringResourceInvoke2 = companion.invoke(C17462R.string.futures_order_gold_savings_label, "$0.50");
            OrderForm6 orderForm6 = OrderForm6.EDITING;
            int i2 = StringResource.$stable;
            OrderFormRowsKt.BuyingPowerEffectRow(orderForm6, "$1,234.56", null, null, null, stringResourceInvoke, stringResourceInvoke2, composer, (i2 << 15) | 28086 | (i2 << 18));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-734949822, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9012lambda$734949822 = ComposableLambda3.composableLambdaInstance(-734949822, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.ComposableSingletons$OrderFormRowsKt$lambda$-734949822$1
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
                ComposerKt.traceEventStart(-734949822, i, -1, "com.robinhood.android.futures.trade.ui.orderform.ComposableSingletons$OrderFormRowsKt.lambda$-734949822.<anonymous> (OrderFormRows.kt:519)");
            }
            OrderForm6 orderForm6 = OrderForm6.EDITING;
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke("$2,345.67");
            StringResource stringResourceInvoke2 = companion.invoke("$0.50");
            StringResource stringResourceInvoke3 = companion.invoke("$0.30");
            StringResource stringResourceInvoke4 = companion.invoke("$0.80");
            StringResource stringResourceInvoke5 = companion.invoke(C17462R.string.futures_order_gold_savings_label, "$0.50");
            int i2 = StringResource.$stable;
            OrderFormRowsKt.BuyingPowerEffectRow(orderForm6, "$1,234.56", stringResourceInvoke, stringResourceInvoke2, stringResourceInvoke3, stringResourceInvoke4, stringResourceInvoke5, composer, (i2 << 6) | 54 | (i2 << 9) | (i2 << 12) | (i2 << 15) | (i2 << 18));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1634849664 = ComposableLambda3.composableLambdaInstance(1634849664, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.ComposableSingletons$OrderFormRowsKt$lambda$1634849664$1
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
                ComposerKt.traceEventStart(1634849664, i, -1, "com.robinhood.android.futures.trade.ui.orderform.ComposableSingletons$OrderFormRowsKt.lambda$1634849664.<anonymous> (OrderFormRows.kt:538)");
            }
            OrderForm6 orderForm6 = OrderForm6.EDITING;
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke("$2,345.67");
            StringResource stringResourceInvoke2 = companion.invoke("$0.50");
            StringResource stringResourceInvoke3 = companion.invoke("$0.30");
            StringResource stringResourceInvoke4 = companion.invoke("$0.80");
            StringResource stringResourceInvoke5 = companion.invoke(C17462R.string.futures_order_gold_savings_label, "$0.50");
            int i2 = StringResource.$stable;
            OrderFormRowsKt.BuyingPowerEffectRow(orderForm6, "$1,234.56", stringResourceInvoke, stringResourceInvoke2, stringResourceInvoke3, stringResourceInvoke4, stringResourceInvoke5, composer, (i2 << 6) | 54 | (i2 << 9) | (i2 << 12) | (i2 << 15) | (i2 << 18));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1773231206$feature_futures_trade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14909getLambda$1773231206$feature_futures_trade_externalDebug() {
        return f9010lambda$1773231206;
    }

    /* renamed from: getLambda$-2070254469$feature_futures_trade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14910getLambda$2070254469$feature_futures_trade_externalDebug() {
        return f9011lambda$2070254469;
    }

    /* renamed from: getLambda$-734949822$feature_futures_trade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14911getLambda$734949822$feature_futures_trade_externalDebug() {
        return f9012lambda$734949822;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1634849664$feature_futures_trade_externalDebug() {
        return lambda$1634849664;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1709260126$feature_futures_trade_externalDebug() {
        return lambda$1709260126;
    }
}

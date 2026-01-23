package com.robinhood.android.event.trade.orderform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.event.trade.EventOrderFormViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EventOrderReceipt.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.trade.orderform.ComposableSingletons$EventOrderReceiptKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventOrderReceipt {
    public static final EventOrderReceipt INSTANCE = new EventOrderReceipt();

    /* renamed from: lambda$-2080012239, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8953lambda$2080012239 = ComposableLambda3.composableLambdaInstance(-2080012239, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.ComposableSingletons$EventOrderReceiptKt$lambda$-2080012239$1
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
                ComposerKt.traceEventStart(-2080012239, i, -1, "com.robinhood.android.event.trade.orderform.ComposableSingletons$EventOrderReceiptKt.lambda$-2080012239.<anonymous> (EventOrderReceipt.kt:244)");
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            EventOrderFormViewState.PayoutData.Receipt receipt = new EventOrderFormViewState.PayoutData.Receipt(companion.invoke("Payout if Philadelphia wins"), companion.invoke("$30"));
            StringResource stringResourceInvoke = companion.invoke("Est credit");
            StringResource stringResourceInvoke2 = companion.invoke("$0.47");
            StringResource stringResourceInvoke3 = companion.invoke("0 of 100");
            int i2 = StringResource.$stable;
            EventOrderReceipt3.OrderReceiptCard("Philadelphia", "Your limit order to buy 1 contract of **Yes PHI** at $0.50 is complete.", receipt, stringResourceInvoke, stringResourceInvoke2, stringResourceInvoke3, false, null, null, "Yes LAR\nYes Over 45.5\nNo Higbee 2+ TD", null, composer, (i2 << 6) | 920125494 | (i2 << 9) | (i2 << 12) | (i2 << 15), 0, 1024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2080012239$feature_event_trade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14285getLambda$2080012239$feature_event_trade_externalDebug() {
        return f8953lambda$2080012239;
    }
}

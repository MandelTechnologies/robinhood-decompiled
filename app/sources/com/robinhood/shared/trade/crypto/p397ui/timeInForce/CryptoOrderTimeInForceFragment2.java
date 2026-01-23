package com.robinhood.shared.trade.crypto.p397ui.timeInForce;

import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.p397ui.timeInForce.CryptoOrderTimeInForceFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTimeInForceFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.timeInForce.CryptoOrderTimeInForceFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoOrderTimeInForceFragment2 extends FunctionReferenceImpl implements Function2<OrderTimeInForce, CryptoOrderPrices, Unit> {
    CryptoOrderTimeInForceFragment2(Object obj) {
        super(2, obj, CryptoOrderTimeInForceFragment.Callbacks.class, "onTimeInForceConfirmed", "onTimeInForceConfirmed(Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(OrderTimeInForce orderTimeInForce, CryptoOrderPrices cryptoOrderPrices) {
        invoke2(orderTimeInForce, cryptoOrderPrices);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OrderTimeInForce p0, CryptoOrderPrices p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((CryptoOrderTimeInForceFragment.Callbacks) this.receiver).onTimeInForceConfirmed(p0, p1);
    }
}

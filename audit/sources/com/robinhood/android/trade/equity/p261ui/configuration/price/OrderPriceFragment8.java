package com.robinhood.android.trade.equity.p261ui.configuration.price;

import com.robinhood.android.trade.equity.p261ui.configuration.price.OrderPriceFragment;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderPriceFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$onPriceValidated$callback$3, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class OrderPriceFragment8 extends FunctionReferenceImpl implements Function2<DirectOrder, BigDecimal, Unit> {
    OrderPriceFragment8(Object obj) {
        super(2, obj, OrderPriceFragment.Callbacks.class, "onOrderStopLossPriceValidated", "onOrderStopLossPriceValidated(Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;Ljava/math/BigDecimal;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(DirectOrder directOrder, BigDecimal bigDecimal) {
        invoke2(directOrder, bigDecimal);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DirectOrder p0, BigDecimal p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((OrderPriceFragment.Callbacks) this.receiver).onOrderStopLossPriceValidated(p0, p1);
    }
}

package com.robinhood.android.trade.equity.p261ui.configuration.price;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OrderPriceFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$onViewCreated$1$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class OrderPriceFragment9 extends FunctionReferenceImpl implements Function0<Unit> {
    OrderPriceFragment9(Object obj) {
        super(0, obj, OrderPriceDuxo.class, "validatePrice", "validatePrice()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OrderPriceDuxo) this.receiver).validatePrice();
    }
}

package com.robinhood.android.equityadvancedorder;

import com.robinhood.models.p320db.Order;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvancedOrderDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EquityAdvancedOrderDuxo$1$1$1 extends FunctionReferenceImpl implements Function1<Order.Configuration, Unit> {
    EquityAdvancedOrderDuxo$1$1$1(Object obj) {
        super(1, obj, EquityAdvancedOrderDuxo.class, "onSwitchOrderConfiguration", "onSwitchOrderConfiguration$lib_equity_advanced_order_externalDebug(Lcom/robinhood/models/db/Order$Configuration;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Order.Configuration configuration) {
        invoke2(configuration);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Order.Configuration p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EquityAdvancedOrderDuxo) this.receiver).m1958xf90208f1(p0);
    }
}

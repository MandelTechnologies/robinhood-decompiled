package com.robinhood.shared.order.type.timeInForce;

import com.robinhood.models.p320db.OrderTimeInForce;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectTimeInForceComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.timeInForce.SelectTimeInForceComposableKt$SelectTimeInForceComposable$2$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class SelectTimeInForceComposable8 extends FunctionReferenceImpl implements Function1<OrderTimeInForce, Unit> {
    SelectTimeInForceComposable8(Object obj) {
        super(1, obj, SelectTimeInForceDuxo.class, "onRowClick", "onRowClick(Lcom/robinhood/models/db/OrderTimeInForce;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OrderTimeInForce orderTimeInForce) {
        invoke2(orderTimeInForce);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OrderTimeInForce p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((SelectTimeInForceDuxo) this.receiver).onRowClick(p0);
    }
}

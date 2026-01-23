package com.robinhood.shared.order.type.selection;

import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.selection.OrderTypeSelectionComposableKt$OrderTypeSelectionComposable$4$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class OrderTypeSelectionComposable9 extends FunctionReferenceImpl implements Function1<CryptoOrderTypeFragmentKey6, Unit> {
    OrderTypeSelectionComposable9(Object obj) {
        super(1, obj, OrderTypeSelectionDuxo.class, "onOrderTypeSelected", "onOrderTypeSelected(Lcom/robinhood/shared/crypto/contracts/orderType/OrderType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CryptoOrderTypeFragmentKey6 cryptoOrderTypeFragmentKey6) {
        invoke2(cryptoOrderTypeFragmentKey6);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CryptoOrderTypeFragmentKey6 p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OrderTypeSelectionDuxo) this.receiver).onOrderTypeSelected(p0);
    }
}

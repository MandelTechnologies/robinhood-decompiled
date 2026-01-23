package com.robinhood.shared.order.type.priceInput;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypePriceInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$4$2$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class OrderTypePriceInputComposable6 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
    OrderTypePriceInputComposable6(Object obj) {
        super(1, obj, OrderTypePriceInputDuxo.class, "onKeyPress", "onKeyPress(Landroid/view/KeyEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
        invoke2(keyEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeyEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OrderTypePriceInputDuxo) this.receiver).onKeyPress(p0);
    }
}

package com.robinhood.shared.order.type.priceInput;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OrderTypePriceInputComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputComposableKt$OrderTypePriceInputComposable$3$2$1$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class OrderTypePriceInputComposable5 extends FunctionReferenceImpl implements Function0<Unit> {
    OrderTypePriceInputComposable5(Object obj) {
        super(0, obj, OrderTypePriceInputDuxo.class, "onLaunchEducation", "onLaunchEducation()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OrderTypePriceInputDuxo) this.receiver).onLaunchEducation();
    }
}

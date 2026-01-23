package com.robinhood.android.equityadvancedorder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: EquityAdvancedOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EquityAdvancedOrderFragment$ComposeContent$2$1$2$2$1 extends AdaptedFunctionReference implements Function0<Unit> {
    EquityAdvancedOrderFragment$ComposeContent$2$1$2$2$1(Object obj) {
        super(0, obj, EquityAdvancedOrderDuxo.class, "handlePrimaryButtonPress", "handlePrimaryButtonPress(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/equity/validation/EquityOrderContext;ZZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        EquityAdvancedOrderDuxo.handlePrimaryButtonPress$default((EquityAdvancedOrderDuxo) this.receiver, null, null, false, false, 15, null);
    }
}

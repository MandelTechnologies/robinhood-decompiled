package com.robinhood.android.equityadvancedorder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EquityAdvancedOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EquityAdvancedOrderFragment$ComposeContent$2$1$9$1 extends FunctionReferenceImpl implements Function0<Unit> {
    EquityAdvancedOrderFragment$ComposeContent$2$1$9$1(Object obj) {
        super(0, obj, EquityAdvancedOrderDuxo.class, "handleTwentyFourHourButtonClick", "handleTwentyFourHourButtonClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EquityAdvancedOrderDuxo) this.receiver).handleTwentyFourHourButtonClick();
    }
}

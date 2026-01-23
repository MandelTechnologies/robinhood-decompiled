package com.robinhood.android.equityadvancedorder.datastate;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EquityAdvancedOrderDataState.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataStateKt$orderTypeSelectionRow$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EquityAdvancedOrderDataState3 extends FunctionReferenceImpl implements Function0<Unit> {
    EquityAdvancedOrderDataState3(Object obj) {
        super(0, obj, EquityAdvancedOrderDataState2.class, "onSwitchToMarket", "onSwitchToMarket(Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        EquityAdvancedOrderDataState2.onSwitchToMarket((EquityAdvancedOrderDataState) this.receiver);
    }
}

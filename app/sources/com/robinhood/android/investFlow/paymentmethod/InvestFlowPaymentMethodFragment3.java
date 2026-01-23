package com.robinhood.android.investFlow.paymentmethod;

import com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowPaymentMethodFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment$paymentAdapter$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowPaymentMethodFragment3 extends FunctionReferenceImpl implements Function1<InvestFlowPaymentMethodFragment.Row, Unit> {
    InvestFlowPaymentMethodFragment3(Object obj) {
        super(1, obj, InvestFlowPaymentMethodFragment.class, "onRowClicked", "onRowClicked(Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InvestFlowPaymentMethodFragment.Row row) {
        invoke2(row);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InvestFlowPaymentMethodFragment.Row p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InvestFlowPaymentMethodFragment) this.receiver).onRowClicked(p0);
    }
}

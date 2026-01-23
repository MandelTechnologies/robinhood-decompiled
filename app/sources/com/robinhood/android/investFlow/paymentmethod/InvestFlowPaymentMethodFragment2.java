package com.robinhood.android.investFlow.paymentmethod;

import android.view.View;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowPaymentMethodBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowPaymentMethodFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowPaymentMethodFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentInvestFlowPaymentMethodBinding> {
    public static final InvestFlowPaymentMethodFragment2 INSTANCE = new InvestFlowPaymentMethodFragment2();

    InvestFlowPaymentMethodFragment2() {
        super(1, FragmentInvestFlowPaymentMethodBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowPaymentMethodBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInvestFlowPaymentMethodBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInvestFlowPaymentMethodBinding.bind(p0);
    }
}

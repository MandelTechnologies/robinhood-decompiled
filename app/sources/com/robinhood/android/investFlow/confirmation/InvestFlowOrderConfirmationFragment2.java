package com.robinhood.android.investFlow.confirmation;

import android.view.View;
import com.robinhood.android.investFlow.databinding.IncludeInvestFlowOrderConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowOrderConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowOrderConfirmationFragment2 extends FunctionReferenceImpl implements Function1<View, IncludeInvestFlowOrderConfirmationBinding> {
    public static final InvestFlowOrderConfirmationFragment2 INSTANCE = new InvestFlowOrderConfirmationFragment2();

    InvestFlowOrderConfirmationFragment2() {
        super(1, IncludeInvestFlowOrderConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investFlow/databinding/IncludeInvestFlowOrderConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeInvestFlowOrderConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeInvestFlowOrderConfirmationBinding.bind(p0);
    }
}

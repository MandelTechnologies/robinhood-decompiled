package com.robinhood.android.investFlow.amount;

import android.view.View;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowAmountBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowAmountFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.amount.InvestFlowAmountFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowAmountFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentInvestFlowAmountBinding> {
    public static final InvestFlowAmountFragment3 INSTANCE = new InvestFlowAmountFragment3();

    InvestFlowAmountFragment3() {
        super(1, FragmentInvestFlowAmountBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowAmountBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInvestFlowAmountBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInvestFlowAmountBinding.bind(p0);
    }
}

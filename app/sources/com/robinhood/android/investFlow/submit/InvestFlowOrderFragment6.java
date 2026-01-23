package com.robinhood.android.investFlow.submit;

import android.view.View;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowOrderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.submit.InvestFlowOrderFragment$fragmentBinding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowOrderFragment6 extends FunctionReferenceImpl implements Function1<View, FragmentInvestFlowOrderBinding> {
    public static final InvestFlowOrderFragment6 INSTANCE = new InvestFlowOrderFragment6();

    InvestFlowOrderFragment6() {
        super(1, FragmentInvestFlowOrderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowOrderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInvestFlowOrderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInvestFlowOrderBinding.bind(p0);
    }
}

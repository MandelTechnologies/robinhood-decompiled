package com.robinhood.android.investFlow.submit;

import android.view.View;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowRecurringBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.submit.InvestFlowOrderFragment$contentBindingRecurring$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowOrderFragment5 extends FunctionReferenceImpl implements Function1<View, FragmentInvestFlowRecurringBinding> {
    public static final InvestFlowOrderFragment5 INSTANCE = new InvestFlowOrderFragment5();

    InvestFlowOrderFragment5() {
        super(1, FragmentInvestFlowRecurringBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowRecurringBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInvestFlowRecurringBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInvestFlowRecurringBinding.bind(p0);
    }
}

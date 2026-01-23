package com.robinhood.android.investFlow.recurring;

import android.view.View;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowRecurringBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowRecurringFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowRecurringFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentInvestFlowRecurringBinding> {
    public static final InvestFlowRecurringFragment2 INSTANCE = new InvestFlowRecurringFragment2();

    InvestFlowRecurringFragment2() {
        super(1, FragmentInvestFlowRecurringBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowRecurringBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInvestFlowRecurringBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInvestFlowRecurringBinding.bind(p0);
    }
}

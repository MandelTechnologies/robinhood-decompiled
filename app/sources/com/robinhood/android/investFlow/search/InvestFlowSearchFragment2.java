package com.robinhood.android.investFlow.search;

import android.view.View;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowSearchBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowSearchFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.search.InvestFlowSearchFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowSearchFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentInvestFlowSearchBinding> {
    public static final InvestFlowSearchFragment2 INSTANCE = new InvestFlowSearchFragment2();

    InvestFlowSearchFragment2() {
        super(1, FragmentInvestFlowSearchBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowSearchBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInvestFlowSearchBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInvestFlowSearchBinding.bind(p0);
    }
}

package com.robinhood.android.investFlow.split;

import android.view.View;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowSplitBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowSplitFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.split.InvestFlowSplitFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowSplitFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentInvestFlowSplitBinding> {
    public static final InvestFlowSplitFragment2 INSTANCE = new InvestFlowSplitFragment2();

    InvestFlowSplitFragment2() {
        super(1, FragmentInvestFlowSplitBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowSplitBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInvestFlowSplitBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInvestFlowSplitBinding.bind(p0);
    }
}

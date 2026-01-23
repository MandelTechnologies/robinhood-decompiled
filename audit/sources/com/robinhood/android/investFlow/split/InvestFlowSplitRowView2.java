package com.robinhood.android.investFlow.split;

import android.view.View;
import com.robinhood.android.investFlow.databinding.MergeInvestFlowSplitRowBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowSplitRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.split.InvestFlowSplitRowView$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowSplitRowView2 extends FunctionReferenceImpl implements Function1<View, MergeInvestFlowSplitRowBinding> {
    public static final InvestFlowSplitRowView2 INSTANCE = new InvestFlowSplitRowView2();

    InvestFlowSplitRowView2() {
        super(1, MergeInvestFlowSplitRowBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investFlow/databinding/MergeInvestFlowSplitRowBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeInvestFlowSplitRowBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeInvestFlowSplitRowBinding.bind(p0);
    }
}

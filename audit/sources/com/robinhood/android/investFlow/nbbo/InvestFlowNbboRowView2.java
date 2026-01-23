package com.robinhood.android.investFlow.nbbo;

import android.view.View;
import com.robinhood.android.investFlow.databinding.MergeInvestFlowNbboRowBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowNbboRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.nbbo.InvestFlowNbboRowView$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowNbboRowView2 extends FunctionReferenceImpl implements Function1<View, MergeInvestFlowNbboRowBinding> {
    public static final InvestFlowNbboRowView2 INSTANCE = new InvestFlowNbboRowView2();

    InvestFlowNbboRowView2() {
        super(1, MergeInvestFlowNbboRowBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investFlow/databinding/MergeInvestFlowNbboRowBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeInvestFlowNbboRowBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeInvestFlowNbboRowBinding.bind(p0);
    }
}

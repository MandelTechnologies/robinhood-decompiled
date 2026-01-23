package com.robinhood.android.investFlow.nbbo;

import android.view.View;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowMultipleNbboBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowMultipleNbboFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowMultipleNbboFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentInvestFlowMultipleNbboBinding> {
    public static final InvestFlowMultipleNbboFragment3 INSTANCE = new InvestFlowMultipleNbboFragment3();

    InvestFlowMultipleNbboFragment3() {
        super(1, FragmentInvestFlowMultipleNbboBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowMultipleNbboBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInvestFlowMultipleNbboBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInvestFlowMultipleNbboBinding.bind(p0);
    }
}

package com.robinhood.android.investFlow.submit;

import android.view.View;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowOneTimeSingleBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.submit.InvestFlowOrderFragment$contentBindingOneTimeSingle$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowOrderFragment4 extends FunctionReferenceImpl implements Function1<View, FragmentInvestFlowOneTimeSingleBinding> {
    public static final InvestFlowOrderFragment4 INSTANCE = new InvestFlowOrderFragment4();

    InvestFlowOrderFragment4() {
        super(1, FragmentInvestFlowOneTimeSingleBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowOneTimeSingleBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInvestFlowOneTimeSingleBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInvestFlowOneTimeSingleBinding.bind(p0);
    }
}

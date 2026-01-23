package com.robinhood.android.investFlow.recurring;

import android.view.View;
import com.robinhood.android.investFlow.databinding.MergeInvestFlowRecurringRowBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowRecurringRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.recurring.InvestFlowRecurringRowView$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowRecurringRowView2 extends FunctionReferenceImpl implements Function1<View, MergeInvestFlowRecurringRowBinding> {
    public static final InvestFlowRecurringRowView2 INSTANCE = new InvestFlowRecurringRowView2();

    InvestFlowRecurringRowView2() {
        super(1, MergeInvestFlowRecurringRowBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investFlow/databinding/MergeInvestFlowRecurringRowBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeInvestFlowRecurringRowBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeInvestFlowRecurringRowBinding.bind(p0);
    }
}

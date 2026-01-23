package com.robinhood.android.investFlow;

import android.view.View;
import com.robinhood.android.investFlow.databinding.ActivityInvestFlowBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.InvestFlowActivity$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InvestFlowActivity2 extends FunctionReferenceImpl implements Function1<View, ActivityInvestFlowBinding> {
    public static final InvestFlowActivity2 INSTANCE = new InvestFlowActivity2();

    InvestFlowActivity2() {
        super(1, ActivityInvestFlowBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investFlow/databinding/ActivityInvestFlowBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActivityInvestFlowBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ActivityInvestFlowBinding.bind(p0);
    }
}

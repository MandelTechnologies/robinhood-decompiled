package com.robinhood.android.common.recurring.agreement.paycheck;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.FragmentPaycheckRecurringInvestmentAgreementBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckRecurringInvestmentAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class PaycheckRecurringInvestmentAgreementFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPaycheckRecurringInvestmentAgreementBinding> {
    public static final PaycheckRecurringInvestmentAgreementFragment2 INSTANCE = new PaycheckRecurringInvestmentAgreementFragment2();

    PaycheckRecurringInvestmentAgreementFragment2() {
        super(1, FragmentPaycheckRecurringInvestmentAgreementBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/FragmentPaycheckRecurringInvestmentAgreementBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPaycheckRecurringInvestmentAgreementBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPaycheckRecurringInvestmentAgreementBinding.bind(p0);
    }
}

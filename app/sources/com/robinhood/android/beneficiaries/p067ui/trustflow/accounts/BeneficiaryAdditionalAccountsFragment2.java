package com.robinhood.android.beneficiaries.p067ui.trustflow.accounts;

import android.view.View;
import com.robinhood.android.beneficiaries.databinding.FragmentBeneficiaryCreateAdditionalAccountsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryAdditionalAccountsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$viewBinding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class BeneficiaryAdditionalAccountsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentBeneficiaryCreateAdditionalAccountsBinding> {
    public static final BeneficiaryAdditionalAccountsFragment2 INSTANCE = new BeneficiaryAdditionalAccountsFragment2();

    BeneficiaryAdditionalAccountsFragment2() {
        super(1, FragmentBeneficiaryCreateAdditionalAccountsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateAdditionalAccountsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentBeneficiaryCreateAdditionalAccountsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentBeneficiaryCreateAdditionalAccountsBinding.bind(p0);
    }
}

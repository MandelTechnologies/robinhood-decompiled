package com.robinhood.android.beneficiaries.p067ui.introflow.agreement;

import android.view.View;
import com.robinhood.android.beneficiaries.databinding.FragmentBeneficiaryCreateAgreementBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.beneficiaries.ui.introflow.agreement.BeneficiaryAgreementFragment$viewBinding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class BeneficiaryAgreementFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentBeneficiaryCreateAgreementBinding> {
    public static final BeneficiaryAgreementFragment2 INSTANCE = new BeneficiaryAgreementFragment2();

    BeneficiaryAgreementFragment2() {
        super(1, FragmentBeneficiaryCreateAgreementBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateAgreementBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentBeneficiaryCreateAgreementBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentBeneficiaryCreateAgreementBinding.bind(p0);
    }
}

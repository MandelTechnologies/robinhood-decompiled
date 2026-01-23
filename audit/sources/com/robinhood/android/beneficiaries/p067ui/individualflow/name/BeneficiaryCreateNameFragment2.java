package com.robinhood.android.beneficiaries.p067ui.individualflow.name;

import android.view.View;
import com.robinhood.android.beneficiaries.databinding.FragmentBeneficiaryCreateNameBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryCreateNameFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment$viewBinding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class BeneficiaryCreateNameFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentBeneficiaryCreateNameBinding> {
    public static final BeneficiaryCreateNameFragment2 INSTANCE = new BeneficiaryCreateNameFragment2();

    BeneficiaryCreateNameFragment2() {
        super(1, FragmentBeneficiaryCreateNameBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateNameBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentBeneficiaryCreateNameBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentBeneficiaryCreateNameBinding.bind(p0);
    }
}

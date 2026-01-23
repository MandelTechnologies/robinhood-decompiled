package com.robinhood.android.beneficiaries.p067ui.individualflow.email;

import android.view.View;
import com.robinhood.android.beneficiaries.databinding.FragmentBeneficiaryCreateEmailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryCreateEmailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.email.BeneficiaryCreateEmailFragment$viewBinding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class BeneficiaryCreateEmailFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentBeneficiaryCreateEmailBinding> {
    public static final BeneficiaryCreateEmailFragment3 INSTANCE = new BeneficiaryCreateEmailFragment3();

    BeneficiaryCreateEmailFragment3() {
        super(1, FragmentBeneficiaryCreateEmailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateEmailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentBeneficiaryCreateEmailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentBeneficiaryCreateEmailBinding.bind(p0);
    }
}

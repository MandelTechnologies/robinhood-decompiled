package com.robinhood.android.optionsupgrade;

import android.view.View;
import com.robinhood.android.optionsupgrade.databinding.FragmentOptionUpgradeInvestmentProfileBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingEditInvestmentProfileFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingEditInvestmentProfileFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionOnboardingEditInvestmentProfileFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionUpgradeInvestmentProfileBinding> {
    public static final OptionOnboardingEditInvestmentProfileFragment2 INSTANCE = new OptionOnboardingEditInvestmentProfileFragment2();

    OptionOnboardingEditInvestmentProfileFragment2() {
        super(1, FragmentOptionUpgradeInvestmentProfileBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionUpgradeInvestmentProfileBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionUpgradeInvestmentProfileBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionUpgradeInvestmentProfileBinding.bind(p0);
    }
}

package com.robinhood.android.optionsupgrade;

import android.view.View;
import com.robinhood.android.optionsupgrade.databinding.FragmentOptionsUpgradeComparisonBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingEducationSpreadFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingEducationSpreadFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionOnboardingEducationSpreadFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentOptionsUpgradeComparisonBinding> {
    public static final OptionOnboardingEducationSpreadFragment3 INSTANCE = new OptionOnboardingEducationSpreadFragment3();

    OptionOnboardingEducationSpreadFragment3() {
        super(1, FragmentOptionsUpgradeComparisonBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionsUpgradeComparisonBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionsUpgradeComparisonBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionsUpgradeComparisonBinding.bind(p0);
    }
}

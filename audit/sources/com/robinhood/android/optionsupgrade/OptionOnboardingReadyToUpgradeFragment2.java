package com.robinhood.android.optionsupgrade;

import android.view.View;
import com.robinhood.android.optionsupgrade.databinding.FragmentOptionsOnboardingReadyToUpgradeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingReadyToUpgradeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingReadyToUpgradeFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionOnboardingReadyToUpgradeFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionsOnboardingReadyToUpgradeBinding> {
    public static final OptionOnboardingReadyToUpgradeFragment2 INSTANCE = new OptionOnboardingReadyToUpgradeFragment2();

    OptionOnboardingReadyToUpgradeFragment2() {
        super(1, FragmentOptionsOnboardingReadyToUpgradeBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionsOnboardingReadyToUpgradeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionsOnboardingReadyToUpgradeBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionsOnboardingReadyToUpgradeBinding.bind(p0);
    }
}

package com.robinhood.android.optionsupgrade;

import android.view.View;
import com.robinhood.android.optionsupgrade.databinding.FragmentOptionUpgradeConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingApprovedTradesFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingApprovedTradesFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionOnboardingApprovedTradesFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionUpgradeConfirmationBinding> {
    public static final OptionOnboardingApprovedTradesFragment2 INSTANCE = new OptionOnboardingApprovedTradesFragment2();

    OptionOnboardingApprovedTradesFragment2() {
        super(1, FragmentOptionUpgradeConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionUpgradeConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionUpgradeConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionUpgradeConfirmationBinding.bind(p0);
    }
}

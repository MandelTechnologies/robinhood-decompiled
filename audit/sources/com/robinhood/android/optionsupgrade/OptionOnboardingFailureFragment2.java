package com.robinhood.android.optionsupgrade;

import android.view.View;
import com.robinhood.android.optionsupgrade.databinding.FragmentOptionUpgradeDeniedBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingFailureFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingFailureFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionOnboardingFailureFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionUpgradeDeniedBinding> {
    public static final OptionOnboardingFailureFragment2 INSTANCE = new OptionOnboardingFailureFragment2();

    OptionOnboardingFailureFragment2() {
        super(1, FragmentOptionUpgradeDeniedBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsupgrade/databinding/FragmentOptionUpgradeDeniedBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionUpgradeDeniedBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionUpgradeDeniedBinding.bind(p0);
    }
}

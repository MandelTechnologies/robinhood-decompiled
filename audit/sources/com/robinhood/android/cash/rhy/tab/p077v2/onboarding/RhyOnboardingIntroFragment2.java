package com.robinhood.android.cash.rhy.tab.p077v2.onboarding;

import android.view.View;
import com.robinhood.android.cash.rhy.tab.databinding.FragmentRhyOnboardingIntroBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOnboardingIntroFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.onboarding.RhyOnboardingIntroFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class RhyOnboardingIntroFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRhyOnboardingIntroBinding> {
    public static final RhyOnboardingIntroFragment2 INSTANCE = new RhyOnboardingIntroFragment2();

    RhyOnboardingIntroFragment2() {
        super(1, FragmentRhyOnboardingIntroBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhyOnboardingIntroBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyOnboardingIntroBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyOnboardingIntroBinding.bind(p0);
    }
}

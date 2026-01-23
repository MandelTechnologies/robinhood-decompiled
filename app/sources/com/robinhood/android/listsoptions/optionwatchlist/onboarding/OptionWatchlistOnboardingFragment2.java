package com.robinhood.android.listsoptions.optionwatchlist.onboarding;

import android.view.View;
import com.robinhood.android.listsoptions.databinding.FragmentOptionWatchlistOnboardingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionWatchlistOnboardingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.listsoptions.optionwatchlist.onboarding.OptionWatchlistOnboardingFragment$bindings$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class OptionWatchlistOnboardingFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionWatchlistOnboardingBinding> {
    public static final OptionWatchlistOnboardingFragment2 INSTANCE = new OptionWatchlistOnboardingFragment2();

    OptionWatchlistOnboardingFragment2() {
        super(1, FragmentOptionWatchlistOnboardingBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/listsoptions/databinding/FragmentOptionWatchlistOnboardingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionWatchlistOnboardingBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionWatchlistOnboardingBinding.bind(p0);
    }
}

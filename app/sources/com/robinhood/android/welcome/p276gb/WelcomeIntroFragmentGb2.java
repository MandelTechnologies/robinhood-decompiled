package com.robinhood.android.welcome.p276gb;

import android.view.View;
import com.robinhood.android.welcome.databinding.FragmentWelcomeIntroGbBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeIntroFragmentGb.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.welcome.gb.WelcomeIntroFragmentGb$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class WelcomeIntroFragmentGb2 extends FunctionReferenceImpl implements Function1<View, FragmentWelcomeIntroGbBinding> {
    public static final WelcomeIntroFragmentGb2 INSTANCE = new WelcomeIntroFragmentGb2();

    WelcomeIntroFragmentGb2() {
        super(1, FragmentWelcomeIntroGbBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/welcome/databinding/FragmentWelcomeIntroGbBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentWelcomeIntroGbBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentWelcomeIntroGbBinding.bind(p0);
    }
}

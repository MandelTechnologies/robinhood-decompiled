package com.robinhood.android.welcome.p276gb;

import android.view.View;
import com.robinhood.android.welcome.databinding.FragmentWelcomeGbBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeFragmentGb.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.welcome.gb.WelcomeFragmentGb$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class WelcomeFragmentGb2 extends FunctionReferenceImpl implements Function1<View, FragmentWelcomeGbBinding> {
    public static final WelcomeFragmentGb2 INSTANCE = new WelcomeFragmentGb2();

    WelcomeFragmentGb2() {
        super(1, FragmentWelcomeGbBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/welcome/databinding/FragmentWelcomeGbBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentWelcomeGbBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentWelcomeGbBinding.bind(p0);
    }
}

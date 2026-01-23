package com.robinhood.android.welcome.p276gb;

import android.view.View;
import com.robinhood.android.welcome.databinding.FragmentWelcomeFeatureGbBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeFeatureFragmentGb.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.welcome.gb.WelcomeFeatureFragmentGb$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class WelcomeFeatureFragmentGb2 extends FunctionReferenceImpl implements Function1<View, FragmentWelcomeFeatureGbBinding> {
    public static final WelcomeFeatureFragmentGb2 INSTANCE = new WelcomeFeatureFragmentGb2();

    WelcomeFeatureFragmentGb2() {
        super(1, FragmentWelcomeFeatureGbBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/welcome/databinding/FragmentWelcomeFeatureGbBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentWelcomeFeatureGbBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentWelcomeFeatureGbBinding.bind(p0);
    }
}

package com.robinhood.android.welcome;

import android.view.View;
import com.robinhood.android.welcome.databinding.FragmentWelcomeFeatureBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeFeatureFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.welcome.WelcomeFeatureFragment$binding$2, reason: use source file name */
/* loaded from: classes20.dex */
/* synthetic */ class WelcomeFeatureFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentWelcomeFeatureBinding> {
    public static final WelcomeFeatureFragment2 INSTANCE = new WelcomeFeatureFragment2();

    WelcomeFeatureFragment2() {
        super(1, FragmentWelcomeFeatureBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/welcome/databinding/FragmentWelcomeFeatureBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentWelcomeFeatureBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentWelcomeFeatureBinding.bind(p0);
    }
}

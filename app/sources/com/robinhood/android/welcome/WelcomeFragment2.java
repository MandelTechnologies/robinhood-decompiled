package com.robinhood.android.welcome;

import android.view.View;
import com.robinhood.android.welcome.databinding.FragmentWelcomeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.welcome.WelcomeFragment$binding$2, reason: use source file name */
/* loaded from: classes20.dex */
/* synthetic */ class WelcomeFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentWelcomeBinding> {
    public static final WelcomeFragment2 INSTANCE = new WelcomeFragment2();

    WelcomeFragment2() {
        super(1, FragmentWelcomeBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/welcome/databinding/FragmentWelcomeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentWelcomeBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentWelcomeBinding.bind(p0);
    }
}

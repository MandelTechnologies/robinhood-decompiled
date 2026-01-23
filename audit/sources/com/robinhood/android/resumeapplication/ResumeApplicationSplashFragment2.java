package com.robinhood.android.resumeapplication;

import android.view.View;
import com.robinhood.android.resumeapplication.databinding.FragmentResumeApplicationSplashBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResumeApplicationSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.resumeapplication.ResumeApplicationSplashFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class ResumeApplicationSplashFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentResumeApplicationSplashBinding> {
    public static final ResumeApplicationSplashFragment2 INSTANCE = new ResumeApplicationSplashFragment2();

    ResumeApplicationSplashFragment2() {
        super(1, FragmentResumeApplicationSplashBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/resumeapplication/databinding/FragmentResumeApplicationSplashBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentResumeApplicationSplashBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentResumeApplicationSplashBinding.bind(p0);
    }
}

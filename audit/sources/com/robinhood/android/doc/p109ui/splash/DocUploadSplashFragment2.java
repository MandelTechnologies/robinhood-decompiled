package com.robinhood.android.doc.p109ui.splash;

import android.view.View;
import com.robinhood.android.doc.databinding.FragmentDocUploadSplashBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.splash.DocUploadSplashFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DocUploadSplashFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDocUploadSplashBinding> {
    public static final DocUploadSplashFragment2 INSTANCE = new DocUploadSplashFragment2();

    DocUploadSplashFragment2() {
        super(1, FragmentDocUploadSplashBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/doc/databinding/FragmentDocUploadSplashBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDocUploadSplashBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDocUploadSplashBinding.bind(p0);
    }
}

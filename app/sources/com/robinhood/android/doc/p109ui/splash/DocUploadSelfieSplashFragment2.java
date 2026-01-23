package com.robinhood.android.doc.p109ui.splash;

import android.view.View;
import com.robinhood.android.doc.databinding.FragmentDocUploadSelfieSplashBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadSelfieSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.doc.ui.splash.DocUploadSelfieSplashFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DocUploadSelfieSplashFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDocUploadSelfieSplashBinding> {
    public static final DocUploadSelfieSplashFragment2 INSTANCE = new DocUploadSelfieSplashFragment2();

    DocUploadSelfieSplashFragment2() {
        super(1, FragmentDocUploadSelfieSplashBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/doc/databinding/FragmentDocUploadSelfieSplashBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDocUploadSelfieSplashBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDocUploadSelfieSplashBinding.bind(p0);
    }
}

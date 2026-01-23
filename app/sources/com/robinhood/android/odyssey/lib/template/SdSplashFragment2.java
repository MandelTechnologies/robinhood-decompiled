package com.robinhood.android.odyssey.lib.template;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdSplashBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.SdSplashFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdSplashFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSdSplashBinding> {
    public static final SdSplashFragment2 INSTANCE = new SdSplashFragment2();

    SdSplashFragment2() {
        super(1, FragmentSdSplashBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdSplashBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSdSplashBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSdSplashBinding.bind(p0);
    }
}

package com.robinhood.android.margin.p174ui.instant;

import android.view.View;
import com.robinhood.android.margin.databinding.FragmentInstantUpgradeSplashBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantUpgradeSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class InstantUpgradeSplashFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentInstantUpgradeSplashBinding> {
    public static final InstantUpgradeSplashFragment2 INSTANCE = new InstantUpgradeSplashFragment2();

    InstantUpgradeSplashFragment2() {
        super(1, FragmentInstantUpgradeSplashBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/margin/databinding/FragmentInstantUpgradeSplashBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInstantUpgradeSplashBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInstantUpgradeSplashBinding.bind(p0);
    }
}

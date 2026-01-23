package com.robinhood.android.trade.directipo.p260ui.splash;

import android.view.View;
import com.robinhood.android.trade.directipo.databinding.FragmentDirectIpoAccessBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOrderSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.directipo.ui.splash.DirectIpoOrderSplashFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class DirectIpoOrderSplashFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDirectIpoAccessBinding> {
    public static final DirectIpoOrderSplashFragment2 INSTANCE = new DirectIpoOrderSplashFragment2();

    DirectIpoOrderSplashFragment2() {
        super(1, FragmentDirectIpoAccessBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/directipo/databinding/FragmentDirectIpoAccessBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDirectIpoAccessBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDirectIpoAccessBinding.bind(p0);
    }
}

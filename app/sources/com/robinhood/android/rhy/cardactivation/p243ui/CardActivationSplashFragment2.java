package com.robinhood.android.rhy.cardactivation.p243ui;

import android.view.View;
import com.robinhood.android.rhy.cardactivation.databinding.FragmentCardActivationSplashBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardActivationSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.cardactivation.ui.CardActivationSplashFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class CardActivationSplashFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentCardActivationSplashBinding> {
    public static final CardActivationSplashFragment2 INSTANCE = new CardActivationSplashFragment2();

    CardActivationSplashFragment2() {
        super(1, FragmentCardActivationSplashBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhy/cardactivation/databinding/FragmentCardActivationSplashBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCardActivationSplashBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCardActivationSplashBinding.bind(p0);
    }
}

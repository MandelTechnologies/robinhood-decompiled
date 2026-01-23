package com.robinhood.android.welcome.rebrand;

import android.view.View;
import com.robinhood.android.welcome.databinding.FragmentWelcomeRebrandBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeRebrandFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class WelcomeRebrandFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentWelcomeRebrandBinding> {
    public static final WelcomeRebrandFragment2 INSTANCE = new WelcomeRebrandFragment2();

    WelcomeRebrandFragment2() {
        super(1, FragmentWelcomeRebrandBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/welcome/databinding/FragmentWelcomeRebrandBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentWelcomeRebrandBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentWelcomeRebrandBinding.bind(p0);
    }
}

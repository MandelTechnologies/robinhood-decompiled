package com.robinhood.android.rhy.waitlist.p244ui;

import android.view.View;
import com.robinhood.android.rhy.waitlist.databinding.FragmentRhyWaitlistSignUpBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyWaitlistSignUpFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhyWaitlistSignUpFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRhyWaitlistSignUpBinding> {
    public static final RhyWaitlistSignUpFragment2 INSTANCE = new RhyWaitlistSignUpFragment2();

    RhyWaitlistSignUpFragment2() {
        super(1, FragmentRhyWaitlistSignUpBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhy/waitlist/databinding/FragmentRhyWaitlistSignUpBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyWaitlistSignUpBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyWaitlistSignUpBinding.bind(p0);
    }
}

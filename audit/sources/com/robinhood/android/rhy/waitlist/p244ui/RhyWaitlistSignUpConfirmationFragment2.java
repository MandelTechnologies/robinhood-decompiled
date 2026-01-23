package com.robinhood.android.rhy.waitlist.p244ui;

import android.view.View;
import com.robinhood.android.rhy.waitlist.databinding.FragmentRhyWaitlistSignUpConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyWaitlistSignUpConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.waitlist.ui.RhyWaitlistSignUpConfirmationFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhyWaitlistSignUpConfirmationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRhyWaitlistSignUpConfirmationBinding> {
    public static final RhyWaitlistSignUpConfirmationFragment2 INSTANCE = new RhyWaitlistSignUpConfirmationFragment2();

    RhyWaitlistSignUpConfirmationFragment2() {
        super(1, FragmentRhyWaitlistSignUpConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhy/waitlist/databinding/FragmentRhyWaitlistSignUpConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyWaitlistSignUpConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyWaitlistSignUpConfirmationBinding.bind(p0);
    }
}

package com.robinhood.android.verification.phone;

import android.view.View;
import com.robinhood.android.verification.databinding.FragmentPhoneUpdateBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneUpdateFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.phone.PhoneUpdateFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class PhoneUpdateFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPhoneUpdateBinding> {
    public static final PhoneUpdateFragment2 INSTANCE = new PhoneUpdateFragment2();

    PhoneUpdateFragment2() {
        super(1, FragmentPhoneUpdateBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/verification/databinding/FragmentPhoneUpdateBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPhoneUpdateBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPhoneUpdateBinding.bind(p0);
    }
}

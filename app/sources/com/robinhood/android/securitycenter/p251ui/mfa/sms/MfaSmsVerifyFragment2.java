package com.robinhood.android.securitycenter.p251ui.mfa.sms;

import android.view.View;
import com.robinhood.android.securitycenter.databinding.FragmentMfaSmsVerifyBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MfaSmsVerifyFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.mfa.sms.MfaSmsVerifyFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class MfaSmsVerifyFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentMfaSmsVerifyBinding> {
    public static final MfaSmsVerifyFragment2 INSTANCE = new MfaSmsVerifyFragment2();

    MfaSmsVerifyFragment2() {
        super(1, FragmentMfaSmsVerifyBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/securitycenter/databinding/FragmentMfaSmsVerifyBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMfaSmsVerifyBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMfaSmsVerifyBinding.bind(p0);
    }
}

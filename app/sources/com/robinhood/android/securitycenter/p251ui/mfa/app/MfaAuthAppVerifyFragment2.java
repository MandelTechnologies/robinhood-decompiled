package com.robinhood.android.securitycenter.p251ui.mfa.app;

import android.view.View;
import com.robinhood.android.securitycenter.databinding.FragmentMfaAuthAppVerifyBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MfaAuthAppVerifyFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppVerifyFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class MfaAuthAppVerifyFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentMfaAuthAppVerifyBinding> {
    public static final MfaAuthAppVerifyFragment2 INSTANCE = new MfaAuthAppVerifyFragment2();

    MfaAuthAppVerifyFragment2() {
        super(1, FragmentMfaAuthAppVerifyBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/securitycenter/databinding/FragmentMfaAuthAppVerifyBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMfaAuthAppVerifyBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMfaAuthAppVerifyBinding.bind(p0);
    }
}

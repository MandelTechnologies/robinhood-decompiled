package com.robinhood.android.securitycenter.p251ui.mfa;

import android.view.View;
import com.robinhood.android.securitycenter.databinding.FragmentMfaSettingsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MfaSettingsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.mfa.MfaSettingsFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class MfaSettingsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentMfaSettingsBinding> {
    public static final MfaSettingsFragment2 INSTANCE = new MfaSettingsFragment2();

    MfaSettingsFragment2() {
        super(1, FragmentMfaSettingsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/securitycenter/databinding/FragmentMfaSettingsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMfaSettingsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMfaSettingsBinding.bind(p0);
    }
}

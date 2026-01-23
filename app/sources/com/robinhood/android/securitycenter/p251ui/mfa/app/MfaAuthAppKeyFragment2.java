package com.robinhood.android.securitycenter.p251ui.mfa.app;

import android.view.View;
import com.robinhood.android.securitycenter.databinding.FragmentMfaAuthAppKeyBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MfaAuthAppKeyFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppKeyFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class MfaAuthAppKeyFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentMfaAuthAppKeyBinding> {
    public static final MfaAuthAppKeyFragment2 INSTANCE = new MfaAuthAppKeyFragment2();

    MfaAuthAppKeyFragment2() {
        super(1, FragmentMfaAuthAppKeyBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/securitycenter/databinding/FragmentMfaAuthAppKeyBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMfaAuthAppKeyBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMfaAuthAppKeyBinding.bind(p0);
    }
}

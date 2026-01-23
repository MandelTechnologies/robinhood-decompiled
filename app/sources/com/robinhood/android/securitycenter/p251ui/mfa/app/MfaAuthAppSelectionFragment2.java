package com.robinhood.android.securitycenter.p251ui.mfa.app;

import android.view.View;
import com.robinhood.android.securitycenter.databinding.FragmentMfaAuthAppSelectionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MfaAuthAppSelectionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.mfa.app.MfaAuthAppSelectionFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class MfaAuthAppSelectionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentMfaAuthAppSelectionBinding> {
    public static final MfaAuthAppSelectionFragment2 INSTANCE = new MfaAuthAppSelectionFragment2();

    MfaAuthAppSelectionFragment2() {
        super(1, FragmentMfaAuthAppSelectionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/securitycenter/databinding/FragmentMfaAuthAppSelectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMfaAuthAppSelectionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMfaAuthAppSelectionBinding.bind(p0);
    }
}

package com.robinhood.android.verification.email;

import android.view.View;
import com.robinhood.android.common.databinding.ActivityFragmentContainerBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingEmailVerificationActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.email.SettingEmailVerificationActivity$bindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class SettingEmailVerificationActivity2 extends FunctionReferenceImpl implements Function1<View, ActivityFragmentContainerBinding> {
    public static final SettingEmailVerificationActivity2 INSTANCE = new SettingEmailVerificationActivity2();

    SettingEmailVerificationActivity2() {
        super(1, ActivityFragmentContainerBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/databinding/ActivityFragmentContainerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActivityFragmentContainerBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ActivityFragmentContainerBinding.bind(p0);
    }
}

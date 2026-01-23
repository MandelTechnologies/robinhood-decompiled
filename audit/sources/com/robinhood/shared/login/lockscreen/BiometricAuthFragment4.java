package com.robinhood.shared.login.lockscreen;

import android.view.View;
import com.robinhood.shared.login.databinding.FragmentBiometricAuthBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BiometricAuthFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.login.lockscreen.BiometricAuthFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class BiometricAuthFragment4 extends FunctionReferenceImpl implements Function1<View, FragmentBiometricAuthBinding> {
    public static final BiometricAuthFragment4 INSTANCE = new BiometricAuthFragment4();

    BiometricAuthFragment4() {
        super(1, FragmentBiometricAuthBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/login/databinding/FragmentBiometricAuthBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentBiometricAuthBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentBiometricAuthBinding.bind(p0);
    }
}

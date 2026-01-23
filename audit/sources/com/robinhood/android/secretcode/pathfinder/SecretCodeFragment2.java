package com.robinhood.android.secretcode.pathfinder;

import android.view.View;
import com.robinhood.android.secretcode.databinding.FragmentSecretCodeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecretCodeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.secretcode.pathfinder.SecretCodeFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SecretCodeFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSecretCodeBinding> {
    public static final SecretCodeFragment2 INSTANCE = new SecretCodeFragment2();

    SecretCodeFragment2() {
        super(1, FragmentSecretCodeBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/secretcode/databinding/FragmentSecretCodeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSecretCodeBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSecretCodeBinding.bind(p0);
    }
}

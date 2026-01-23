package com.robinhood.android.challenge.verification;

import android.view.View;
import com.robinhood.android.challenge.databinding.FragmentUpdateMfaMethodBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateMfaMethodFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.challenge.verification.UpdateMfaMethodFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class UpdateMfaMethodFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentUpdateMfaMethodBinding> {
    public static final UpdateMfaMethodFragment2 INSTANCE = new UpdateMfaMethodFragment2();

    UpdateMfaMethodFragment2() {
        super(1, FragmentUpdateMfaMethodBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/challenge/databinding/FragmentUpdateMfaMethodBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentUpdateMfaMethodBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentUpdateMfaMethodBinding.bind(p0);
    }
}

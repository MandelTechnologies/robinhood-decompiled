package com.robinhood.android.acatsin.confirmname;

import android.view.View;
import com.robinhood.android.acatsin.databinding.FragmentAcatsInConfirmAccountNameBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInConfirmAccountNameFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameFragment$viewBinding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInConfirmAccountNameFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAcatsInConfirmAccountNameBinding> {
    public static final AcatsInConfirmAccountNameFragment2 INSTANCE = new AcatsInConfirmAccountNameFragment2();

    AcatsInConfirmAccountNameFragment2() {
        super(1, FragmentAcatsInConfirmAccountNameBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInConfirmAccountNameBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAcatsInConfirmAccountNameBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAcatsInConfirmAccountNameBinding.bind(p0);
    }
}

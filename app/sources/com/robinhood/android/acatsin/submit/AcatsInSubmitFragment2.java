package com.robinhood.android.acatsin.submit;

import android.view.View;
import com.robinhood.android.acatsin.databinding.FragmentAcatsInSubmitBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInSubmitFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.submit.AcatsInSubmitFragment$viewBinding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInSubmitFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAcatsInSubmitBinding> {
    public static final AcatsInSubmitFragment2 INSTANCE = new AcatsInSubmitFragment2();

    AcatsInSubmitFragment2() {
        super(1, FragmentAcatsInSubmitBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInSubmitBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAcatsInSubmitBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAcatsInSubmitBinding.bind(p0);
    }
}

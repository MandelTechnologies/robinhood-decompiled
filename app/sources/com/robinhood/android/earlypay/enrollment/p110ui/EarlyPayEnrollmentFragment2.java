package com.robinhood.android.earlypay.enrollment.p110ui;

import android.view.View;
import com.robinhood.android.earlypay.databinding.FragmentEarlyPayEnrollmentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarlyPayEnrollmentFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class EarlyPayEnrollmentFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEarlyPayEnrollmentBinding> {
    public static final EarlyPayEnrollmentFragment2 INSTANCE = new EarlyPayEnrollmentFragment2();

    EarlyPayEnrollmentFragment2() {
        super(1, FragmentEarlyPayEnrollmentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/earlypay/databinding/FragmentEarlyPayEnrollmentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEarlyPayEnrollmentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEarlyPayEnrollmentBinding.bind(p0);
    }
}

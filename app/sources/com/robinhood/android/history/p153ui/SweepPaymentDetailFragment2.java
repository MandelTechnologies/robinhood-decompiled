package com.robinhood.android.history.p153ui;

import android.view.View;
import com.robinhood.android.history.databinding.FragmentSweepPaymentDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepPaymentDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.SweepPaymentDetailFragment$bindings$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SweepPaymentDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSweepPaymentDetailBinding> {
    public static final SweepPaymentDetailFragment2 INSTANCE = new SweepPaymentDetailFragment2();

    SweepPaymentDetailFragment2() {
        super(1, FragmentSweepPaymentDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/history/databinding/FragmentSweepPaymentDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSweepPaymentDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSweepPaymentDetailBinding.bind(p0);
    }
}

package com.robinhood.android.history.p153ui.check;

import android.view.View;
import com.robinhood.android.history.databinding.FragmentCheckPaymentDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckPaymentDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.check.CheckPaymentDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class CheckPaymentDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentCheckPaymentDetailBinding> {
    public static final CheckPaymentDetailFragment2 INSTANCE = new CheckPaymentDetailFragment2();

    CheckPaymentDetailFragment2() {
        super(1, FragmentCheckPaymentDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/history/databinding/FragmentCheckPaymentDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCheckPaymentDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCheckPaymentDetailBinding.bind(p0);
    }
}

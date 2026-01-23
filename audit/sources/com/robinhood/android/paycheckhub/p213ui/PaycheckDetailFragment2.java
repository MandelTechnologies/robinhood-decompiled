package com.robinhood.android.paycheckhub.p213ui;

import android.view.View;
import com.robinhood.android.paycheckhub.databinding.FragmentPaycheckDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class PaycheckDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPaycheckDetailBinding> {
    public static final PaycheckDetailFragment2 INSTANCE = new PaycheckDetailFragment2();

    PaycheckDetailFragment2() {
        super(1, FragmentPaycheckDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/paycheckhub/databinding/FragmentPaycheckDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPaycheckDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPaycheckDetailBinding.bind(p0);
    }
}

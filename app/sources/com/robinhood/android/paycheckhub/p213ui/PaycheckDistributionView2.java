package com.robinhood.android.paycheckhub.p213ui;

import android.view.View;
import com.robinhood.android.paycheckhub.databinding.MergePaycheckDistributionViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckDistributionView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckDistributionView$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class PaycheckDistributionView2 extends FunctionReferenceImpl implements Function1<View, MergePaycheckDistributionViewBinding> {
    public static final PaycheckDistributionView2 INSTANCE = new PaycheckDistributionView2();

    PaycheckDistributionView2() {
        super(1, MergePaycheckDistributionViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/paycheckhub/databinding/MergePaycheckDistributionViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergePaycheckDistributionViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergePaycheckDistributionViewBinding.bind(p0);
    }
}

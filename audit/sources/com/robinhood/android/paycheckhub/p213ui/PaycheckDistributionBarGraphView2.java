package com.robinhood.android.paycheckhub.p213ui;

import android.view.View;
import com.robinhood.android.paycheckhub.databinding.MergePaycheckDistributionBarGraphViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckDistributionBarGraphView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckDistributionBarGraphView$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class PaycheckDistributionBarGraphView2 extends FunctionReferenceImpl implements Function1<View, MergePaycheckDistributionBarGraphViewBinding> {
    public static final PaycheckDistributionBarGraphView2 INSTANCE = new PaycheckDistributionBarGraphView2();

    PaycheckDistributionBarGraphView2() {
        super(1, MergePaycheckDistributionBarGraphViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/paycheckhub/databinding/MergePaycheckDistributionBarGraphViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergePaycheckDistributionBarGraphViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergePaycheckDistributionBarGraphViewBinding.bind(p0);
    }
}

package com.robinhood.android.ordersummary.p211ui;

import android.view.View;
import com.robinhood.android.ordersummary.databinding.FragmentOrderSummaryExplanationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderSummaryExplanationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.ordersummary.ui.OrderSummaryExplanationFragment$viewBindings$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OrderSummaryExplanationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOrderSummaryExplanationBinding> {
    public static final OrderSummaryExplanationFragment2 INSTANCE = new OrderSummaryExplanationFragment2();

    OrderSummaryExplanationFragment2() {
        super(1, FragmentOrderSummaryExplanationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/ordersummary/databinding/FragmentOrderSummaryExplanationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOrderSummaryExplanationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOrderSummaryExplanationBinding.bind(p0);
    }
}

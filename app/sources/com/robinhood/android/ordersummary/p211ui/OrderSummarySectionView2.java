package com.robinhood.android.ordersummary.p211ui;

import android.view.View;
import com.robinhood.android.ordersummary.databinding.MergeOrderSummaryExplanationSectionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderSummarySectionView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.ordersummary.ui.OrderSummarySectionView$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OrderSummarySectionView2 extends FunctionReferenceImpl implements Function1<View, MergeOrderSummaryExplanationSectionBinding> {
    public static final OrderSummarySectionView2 INSTANCE = new OrderSummarySectionView2();

    OrderSummarySectionView2() {
        super(1, MergeOrderSummaryExplanationSectionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/ordersummary/databinding/MergeOrderSummaryExplanationSectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOrderSummaryExplanationSectionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOrderSummaryExplanationSectionBinding.bind(p0);
    }
}

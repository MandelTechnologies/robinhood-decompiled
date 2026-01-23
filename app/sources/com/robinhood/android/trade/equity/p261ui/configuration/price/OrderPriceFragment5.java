package com.robinhood.android.trade.equity.p261ui.configuration.price;

import android.view.View;
import com.robinhood.android.trade.equity.databinding.FragmentOrderPriceBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderPriceFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceFragment$bindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class OrderPriceFragment5 extends FunctionReferenceImpl implements Function1<View, FragmentOrderPriceBinding> {
    public static final OrderPriceFragment5 INSTANCE = new OrderPriceFragment5();

    OrderPriceFragment5() {
        super(1, FragmentOrderPriceBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/equity/databinding/FragmentOrderPriceBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOrderPriceBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOrderPriceBinding.bind(p0);
    }
}

package com.robinhood.android.trade.equity.p261ui.preipo;

import android.view.View;
import com.robinhood.android.trade.equity.databinding.FragmentOrderPreIpoBidPriceBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderPreIpoBidPriceFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.preipo.OrderPreIpoBidPriceFragment$viewBinding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class OrderPreIpoBidPriceFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOrderPreIpoBidPriceBinding> {
    public static final OrderPreIpoBidPriceFragment2 INSTANCE = new OrderPreIpoBidPriceFragment2();

    OrderPreIpoBidPriceFragment2() {
        super(1, FragmentOrderPreIpoBidPriceBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/equity/databinding/FragmentOrderPreIpoBidPriceBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOrderPreIpoBidPriceBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOrderPreIpoBidPriceBinding.bind(p0);
    }
}

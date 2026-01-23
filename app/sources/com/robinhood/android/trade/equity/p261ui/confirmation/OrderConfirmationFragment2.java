package com.robinhood.android.trade.equity.p261ui.confirmation;

import android.view.View;
import com.robinhood.android.trade.equity.databinding.IncludeOrderConfirmationLayoutBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationFragment$bindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class OrderConfirmationFragment2 extends FunctionReferenceImpl implements Function1<View, IncludeOrderConfirmationLayoutBinding> {
    public static final OrderConfirmationFragment2 INSTANCE = new OrderConfirmationFragment2();

    OrderConfirmationFragment2() {
        super(1, IncludeOrderConfirmationLayoutBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/equity/databinding/IncludeOrderConfirmationLayoutBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeOrderConfirmationLayoutBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeOrderConfirmationLayoutBinding.bind(p0);
    }
}

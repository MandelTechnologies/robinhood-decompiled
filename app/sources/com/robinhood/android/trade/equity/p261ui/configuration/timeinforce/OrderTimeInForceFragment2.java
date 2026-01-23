package com.robinhood.android.trade.equity.p261ui.configuration.timeinforce;

import android.view.View;
import com.robinhood.android.trade.equity.databinding.FragmentOrderTimeInForceBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTimeInForceFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class OrderTimeInForceFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOrderTimeInForceBinding> {
    public static final OrderTimeInForceFragment2 INSTANCE = new OrderTimeInForceFragment2();

    OrderTimeInForceFragment2() {
        super(1, FragmentOrderTimeInForceBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/equity/databinding/FragmentOrderTimeInForceBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOrderTimeInForceBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOrderTimeInForceBinding.bind(p0);
    }
}

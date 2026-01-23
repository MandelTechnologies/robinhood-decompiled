package com.robinhood.android.history.p153ui;

import android.view.View;
import com.robinhood.android.history.databinding.FragmentOrderDetailPagerBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderDetailPagerFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.OrderDetailPagerFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class OrderDetailPagerFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOrderDetailPagerBinding> {
    public static final OrderDetailPagerFragment2 INSTANCE = new OrderDetailPagerFragment2();

    OrderDetailPagerFragment2() {
        super(1, FragmentOrderDetailPagerBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/history/databinding/FragmentOrderDetailPagerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOrderDetailPagerBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOrderDetailPagerBinding.bind(p0);
    }
}

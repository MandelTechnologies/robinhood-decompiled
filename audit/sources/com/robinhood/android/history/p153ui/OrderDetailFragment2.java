package com.robinhood.android.history.p153ui;

import android.view.View;
import com.robinhood.android.history.databinding.FragmentOrderDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.OrderDetailFragment$bindings$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class OrderDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOrderDetailBinding> {
    public static final OrderDetailFragment2 INSTANCE = new OrderDetailFragment2();

    OrderDetailFragment2() {
        super(1, FragmentOrderDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/history/databinding/FragmentOrderDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOrderDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOrderDetailBinding.bind(p0);
    }
}

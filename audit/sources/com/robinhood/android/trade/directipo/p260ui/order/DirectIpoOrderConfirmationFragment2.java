package com.robinhood.android.trade.directipo.p260ui.order;

import android.view.View;
import com.robinhood.android.trade.directipo.databinding.MergeDirectIpoOrderConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOrderConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderConfirmationFragment$bindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class DirectIpoOrderConfirmationFragment2 extends FunctionReferenceImpl implements Function1<View, MergeDirectIpoOrderConfirmationBinding> {
    public static final DirectIpoOrderConfirmationFragment2 INSTANCE = new DirectIpoOrderConfirmationFragment2();

    DirectIpoOrderConfirmationFragment2() {
        super(1, MergeDirectIpoOrderConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/directipo/databinding/MergeDirectIpoOrderConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeDirectIpoOrderConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeDirectIpoOrderConfirmationBinding.bind(p0);
    }
}

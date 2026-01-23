package com.robinhood.android.trade.directipo.p260ui.order;

import android.view.View;
import com.robinhood.android.trade.directipo.databinding.DialogDirectIpoOrderPriceInfoAlertBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOrderPriceInfoAlertDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderPriceInfoAlertDialogFragment$bindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class DirectIpoOrderPriceInfoAlertDialogFragment2 extends FunctionReferenceImpl implements Function1<View, DialogDirectIpoOrderPriceInfoAlertBinding> {
    public static final DirectIpoOrderPriceInfoAlertDialogFragment2 INSTANCE = new DirectIpoOrderPriceInfoAlertDialogFragment2();

    DirectIpoOrderPriceInfoAlertDialogFragment2() {
        super(1, DialogDirectIpoOrderPriceInfoAlertBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/directipo/databinding/DialogDirectIpoOrderPriceInfoAlertBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final DialogDirectIpoOrderPriceInfoAlertBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return DialogDirectIpoOrderPriceInfoAlertBinding.bind(p0);
    }
}

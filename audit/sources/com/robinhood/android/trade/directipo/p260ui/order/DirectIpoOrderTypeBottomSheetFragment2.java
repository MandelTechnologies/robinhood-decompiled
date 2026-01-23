package com.robinhood.android.trade.directipo.p260ui.order;

import android.view.View;
import com.robinhood.android.trade.directipo.databinding.DialogDirectIpoPriceTypeBottomsheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOrderTypeBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderTypeBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class DirectIpoOrderTypeBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, DialogDirectIpoPriceTypeBottomsheetBinding> {
    public static final DirectIpoOrderTypeBottomSheetFragment2 INSTANCE = new DirectIpoOrderTypeBottomSheetFragment2();

    DirectIpoOrderTypeBottomSheetFragment2() {
        super(1, DialogDirectIpoPriceTypeBottomsheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/directipo/databinding/DialogDirectIpoPriceTypeBottomsheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final DialogDirectIpoPriceTypeBottomsheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return DialogDirectIpoPriceTypeBottomsheetBinding.bind(p0);
    }
}

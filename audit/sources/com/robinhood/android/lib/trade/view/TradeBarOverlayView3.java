package com.robinhood.android.lib.trade.view;

import android.view.View;
import com.robinhood.android.lib.trade.databinding.MergeTradeBarOverlayBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradeBarOverlayView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.trade.view.TradeBarOverlayView$viewBinding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class TradeBarOverlayView3 extends FunctionReferenceImpl implements Function1<View, MergeTradeBarOverlayBinding> {
    public static final TradeBarOverlayView3 INSTANCE = new TradeBarOverlayView3();

    TradeBarOverlayView3() {
        super(1, MergeTradeBarOverlayBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/trade/databinding/MergeTradeBarOverlayBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeTradeBarOverlayBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeTradeBarOverlayBinding.bind(p0);
    }
}

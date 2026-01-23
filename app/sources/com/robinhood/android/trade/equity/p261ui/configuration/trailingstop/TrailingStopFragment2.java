package com.robinhood.android.trade.equity.p261ui.configuration.trailingstop;

import android.view.View;
import com.robinhood.android.trade.equity.databinding.FragmentTrailingStopBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrailingStopFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class TrailingStopFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTrailingStopBinding> {
    public static final TrailingStopFragment2 INSTANCE = new TrailingStopFragment2();

    TrailingStopFragment2() {
        super(1, FragmentTrailingStopBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/equity/databinding/FragmentTrailingStopBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTrailingStopBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTrailingStopBinding.bind(p0);
    }
}

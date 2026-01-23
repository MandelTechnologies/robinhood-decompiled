package com.robinhood.android.trade.equity.p261ui.dollar;

import android.view.View;
import com.robinhood.android.trade.equity.databinding.FragmentEquityDollarOrderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityDollarOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$fragmentBindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class EquityDollarOrderFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEquityDollarOrderBinding> {
    public static final EquityDollarOrderFragment2 INSTANCE = new EquityDollarOrderFragment2();

    EquityDollarOrderFragment2() {
        super(1, FragmentEquityDollarOrderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/equity/databinding/FragmentEquityDollarOrderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEquityDollarOrderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEquityDollarOrderBinding.bind(p0);
    }
}

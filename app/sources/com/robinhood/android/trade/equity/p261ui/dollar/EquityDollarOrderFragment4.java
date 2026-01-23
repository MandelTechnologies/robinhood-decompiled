package com.robinhood.android.trade.equity.p261ui.dollar;

import android.view.View;
import com.robinhood.android.trade.equity.databinding.MergeEquityDollarOrderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityDollarOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderFragment$mergeBindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class EquityDollarOrderFragment4 extends FunctionReferenceImpl implements Function1<View, MergeEquityDollarOrderBinding> {
    public static final EquityDollarOrderFragment4 INSTANCE = new EquityDollarOrderFragment4();

    EquityDollarOrderFragment4() {
        super(1, MergeEquityDollarOrderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/equity/databinding/MergeEquityDollarOrderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEquityDollarOrderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEquityDollarOrderBinding.bind(p0);
    }
}

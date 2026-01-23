package com.robinhood.android.trade.equity.p261ui.share;

import android.view.View;
import com.robinhood.android.trade.equity.databinding.FragmentEquityOrderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityShareOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment$fragmentBindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class EquityShareOrderFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentEquityOrderBinding> {
    public static final EquityShareOrderFragment3 INSTANCE = new EquityShareOrderFragment3();

    EquityShareOrderFragment3() {
        super(1, FragmentEquityOrderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/equity/databinding/FragmentEquityOrderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEquityOrderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEquityOrderBinding.bind(p0);
    }
}

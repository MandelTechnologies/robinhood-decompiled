package com.robinhood.android.trade.options.profitloss;

import android.view.View;
import com.robinhood.android.optionsplchart.databinding.MergeOptionsProfitLossInfoBarBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossInfoBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBar$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class OptionsProfitLossInfoBar2 extends FunctionReferenceImpl implements Function1<View, MergeOptionsProfitLossInfoBarBinding> {
    public static final OptionsProfitLossInfoBar2 INSTANCE = new OptionsProfitLossInfoBar2();

    OptionsProfitLossInfoBar2() {
        super(1, MergeOptionsProfitLossInfoBarBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsplchart/databinding/MergeOptionsProfitLossInfoBarBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOptionsProfitLossInfoBarBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOptionsProfitLossInfoBarBinding.bind(p0);
    }
}

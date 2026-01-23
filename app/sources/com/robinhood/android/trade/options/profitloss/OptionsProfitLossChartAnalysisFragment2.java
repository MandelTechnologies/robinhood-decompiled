package com.robinhood.android.trade.options.profitloss;

import android.view.View;
import com.robinhood.android.optionsplchart.databinding.FragmentOptionsProfitLossChartAnalysisBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossChartAnalysisFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartAnalysisFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class OptionsProfitLossChartAnalysisFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionsProfitLossChartAnalysisBinding> {
    public static final OptionsProfitLossChartAnalysisFragment2 INSTANCE = new OptionsProfitLossChartAnalysisFragment2();

    OptionsProfitLossChartAnalysisFragment2() {
        super(1, FragmentOptionsProfitLossChartAnalysisBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsplchart/databinding/FragmentOptionsProfitLossChartAnalysisBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionsProfitLossChartAnalysisBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionsProfitLossChartAnalysisBinding.bind(p0);
    }
}

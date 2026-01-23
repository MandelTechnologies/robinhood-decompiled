package com.robinhood.android.common.options.upsell.plchart;

import android.view.View;
import com.robinhood.android.common.options.databinding.FragmentProfitAndLossEducationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossChartEducationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.upsell.plchart.ProfitAndLossChartEducationFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class ProfitAndLossChartEducationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentProfitAndLossEducationBinding> {
    public static final ProfitAndLossChartEducationFragment2 INSTANCE = new ProfitAndLossChartEducationFragment2();

    ProfitAndLossChartEducationFragment2() {
        super(1, FragmentProfitAndLossEducationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/options/databinding/FragmentProfitAndLossEducationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentProfitAndLossEducationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentProfitAndLossEducationBinding.bind(p0);
    }
}

package com.robinhood.android.advancedchart.config;

import android.view.View;
import com.robinhood.android.advancedchart.databinding.FragmentAdvancedChartIndicatorListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartIndicatorListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AdvancedChartIndicatorListFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAdvancedChartIndicatorListBinding> {
    public static final AdvancedChartIndicatorListFragment2 INSTANCE = new AdvancedChartIndicatorListFragment2();

    AdvancedChartIndicatorListFragment2() {
        super(1, FragmentAdvancedChartIndicatorListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartIndicatorListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAdvancedChartIndicatorListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAdvancedChartIndicatorListBinding.bind(p0);
    }
}

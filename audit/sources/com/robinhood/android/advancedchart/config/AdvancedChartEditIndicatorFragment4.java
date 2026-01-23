package com.robinhood.android.advancedchart.config;

import android.view.View;
import com.robinhood.android.advancedchart.databinding.FragmentAdvancedChartEditIndicatorBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartEditIndicatorFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AdvancedChartEditIndicatorFragment4 extends FunctionReferenceImpl implements Function1<View, FragmentAdvancedChartEditIndicatorBinding> {
    public static final AdvancedChartEditIndicatorFragment4 INSTANCE = new AdvancedChartEditIndicatorFragment4();

    AdvancedChartEditIndicatorFragment4() {
        super(1, FragmentAdvancedChartEditIndicatorBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartEditIndicatorBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAdvancedChartEditIndicatorBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAdvancedChartEditIndicatorBinding.bind(p0);
    }
}

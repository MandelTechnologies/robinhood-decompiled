package com.robinhood.android.advancedchart.config;

import android.view.View;
import com.robinhood.android.advancedchart.databinding.FragmentAdvancedChartAddIndicatorBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartAddIndicatorFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AdvancedChartAddIndicatorFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAdvancedChartAddIndicatorBinding> {
    public static final AdvancedChartAddIndicatorFragment2 INSTANCE = new AdvancedChartAddIndicatorFragment2();

    AdvancedChartAddIndicatorFragment2() {
        super(1, FragmentAdvancedChartAddIndicatorBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartAddIndicatorBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAdvancedChartAddIndicatorBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAdvancedChartAddIndicatorBinding.bind(p0);
    }
}

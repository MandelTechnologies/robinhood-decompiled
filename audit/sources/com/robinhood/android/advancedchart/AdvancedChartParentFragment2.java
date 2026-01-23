package com.robinhood.android.advancedchart;

import android.view.View;
import com.robinhood.android.advancedchart.databinding.FragmentAdvancedChartParentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartParentFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AdvancedChartParentFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAdvancedChartParentBinding> {
    public static final AdvancedChartParentFragment2 INSTANCE = new AdvancedChartParentFragment2();

    AdvancedChartParentFragment2() {
        super(1, FragmentAdvancedChartParentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartParentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAdvancedChartParentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAdvancedChartParentBinding.bind(p0);
    }
}

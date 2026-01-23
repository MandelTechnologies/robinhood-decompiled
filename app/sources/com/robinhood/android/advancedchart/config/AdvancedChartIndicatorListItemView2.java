package com.robinhood.android.advancedchart.config;

import android.view.View;
import com.robinhood.android.advancedchart.databinding.ViewIndicatorListItemBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartIndicatorListItemView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListItemView$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AdvancedChartIndicatorListItemView2 extends FunctionReferenceImpl implements Function1<View, ViewIndicatorListItemBinding> {
    public static final AdvancedChartIndicatorListItemView2 INSTANCE = new AdvancedChartIndicatorListItemView2();

    AdvancedChartIndicatorListItemView2() {
        super(1, ViewIndicatorListItemBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/advancedchart/databinding/ViewIndicatorListItemBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ViewIndicatorListItemBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ViewIndicatorListItemBinding.bind(p0);
    }
}

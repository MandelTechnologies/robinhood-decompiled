package com.robinhood.android.options.statistics;

import android.view.View;
import com.robinhood.android.options.statistics.databinding.MergeOptionStrategyStatisticsViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyStatisticsView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.statistics.OptionStrategyStatisticsView$bindings$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionStrategyStatisticsView2 extends FunctionReferenceImpl implements Function1<View, MergeOptionStrategyStatisticsViewBinding> {
    public static final OptionStrategyStatisticsView2 INSTANCE = new OptionStrategyStatisticsView2();

    OptionStrategyStatisticsView2() {
        super(1, MergeOptionStrategyStatisticsViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/options/statistics/databinding/MergeOptionStrategyStatisticsViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOptionStrategyStatisticsViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOptionStrategyStatisticsViewBinding.bind(p0);
    }
}

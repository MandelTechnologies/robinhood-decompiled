package com.robinhood.android.trade.recommendations.p262ui.order;

import android.view.View;
import com.robinhood.android.trade.recommendations.databinding.MergeRecommendationsTotalRowBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsTotalRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsTotalRowView$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class RecommendationsTotalRowView2 extends FunctionReferenceImpl implements Function1<View, MergeRecommendationsTotalRowBinding> {
    public static final RecommendationsTotalRowView2 INSTANCE = new RecommendationsTotalRowView2();

    RecommendationsTotalRowView2() {
        super(1, MergeRecommendationsTotalRowBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/recommendations/databinding/MergeRecommendationsTotalRowBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRecommendationsTotalRowBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRecommendationsTotalRowBinding.bind(p0);
    }
}

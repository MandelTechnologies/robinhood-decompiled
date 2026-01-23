package com.robinhood.android.trade.recommendations.p262ui.order;

import android.view.View;
import com.robinhood.android.trade.recommendations.databinding.MergeRecommendationsNbboRowBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsNbboRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsNbboRowView$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class RecommendationsNbboRowView2 extends FunctionReferenceImpl implements Function1<View, MergeRecommendationsNbboRowBinding> {
    public static final RecommendationsNbboRowView2 INSTANCE = new RecommendationsNbboRowView2();

    RecommendationsNbboRowView2() {
        super(1, MergeRecommendationsNbboRowBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/recommendations/databinding/MergeRecommendationsNbboRowBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRecommendationsNbboRowBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRecommendationsNbboRowBinding.bind(p0);
    }
}

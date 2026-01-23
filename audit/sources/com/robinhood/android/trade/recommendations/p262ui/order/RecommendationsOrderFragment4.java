package com.robinhood.android.trade.recommendations.p262ui.order;

import android.view.View;
import com.robinhood.android.trade.recommendations.databinding.MergeRecommendationsOrderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$mergeBindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class RecommendationsOrderFragment4 extends FunctionReferenceImpl implements Function1<View, MergeRecommendationsOrderBinding> {
    public static final RecommendationsOrderFragment4 INSTANCE = new RecommendationsOrderFragment4();

    RecommendationsOrderFragment4() {
        super(1, MergeRecommendationsOrderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/recommendations/databinding/MergeRecommendationsOrderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRecommendationsOrderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRecommendationsOrderBinding.bind(p0);
    }
}

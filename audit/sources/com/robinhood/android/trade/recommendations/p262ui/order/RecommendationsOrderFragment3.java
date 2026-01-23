package com.robinhood.android.trade.recommendations.p262ui.order;

import android.view.View;
import com.robinhood.android.trade.recommendations.databinding.FragmentRecommendationsOrderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderFragment$layoutBinding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class RecommendationsOrderFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentRecommendationsOrderBinding> {
    public static final RecommendationsOrderFragment3 INSTANCE = new RecommendationsOrderFragment3();

    RecommendationsOrderFragment3() {
        super(1, FragmentRecommendationsOrderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/recommendations/databinding/FragmentRecommendationsOrderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecommendationsOrderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecommendationsOrderBinding.bind(p0);
    }
}

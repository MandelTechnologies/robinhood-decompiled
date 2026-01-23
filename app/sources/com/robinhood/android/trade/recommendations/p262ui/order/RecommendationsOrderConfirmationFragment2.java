package com.robinhood.android.trade.recommendations.p262ui.order;

import android.view.View;
import com.robinhood.android.trade.recommendations.databinding.FragmentRecommendationsOrderConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsOrderConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.recommendations.ui.order.RecommendationsOrderConfirmationFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class RecommendationsOrderConfirmationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecommendationsOrderConfirmationBinding> {
    public static final RecommendationsOrderConfirmationFragment2 INSTANCE = new RecommendationsOrderConfirmationFragment2();

    RecommendationsOrderConfirmationFragment2() {
        super(1, FragmentRecommendationsOrderConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/recommendations/databinding/FragmentRecommendationsOrderConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecommendationsOrderConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecommendationsOrderConfirmationBinding.bind(p0);
    }
}

package com.robinhood.android.trade.recommendations.p262ui.disclosures;

import android.view.View;
import com.robinhood.android.trade.recommendations.databinding.FragmentRecommendationsDisclosuresBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsDisclosuresFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.recommendations.ui.disclosures.RecommendationsDisclosuresFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class RecommendationsDisclosuresFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecommendationsDisclosuresBinding> {
    public static final RecommendationsDisclosuresFragment2 INSTANCE = new RecommendationsDisclosuresFragment2();

    RecommendationsDisclosuresFragment2() {
        super(1, FragmentRecommendationsDisclosuresBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/recommendations/databinding/FragmentRecommendationsDisclosuresBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecommendationsDisclosuresBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecommendationsDisclosuresBinding.bind(p0);
    }
}

package com.robinhood.android.recommendations.p224ui.risk;

import android.view.View;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsRiskProfileBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsRiskProfileFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsRiskProfileFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecommendationsRiskProfileBinding> {
    public static final RecommendationsRiskProfileFragment2 INSTANCE = new RecommendationsRiskProfileFragment2();

    RecommendationsRiskProfileFragment2() {
        super(1, FragmentRecommendationsRiskProfileBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsRiskProfileBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecommendationsRiskProfileBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecommendationsRiskProfileBinding.bind(p0);
    }
}

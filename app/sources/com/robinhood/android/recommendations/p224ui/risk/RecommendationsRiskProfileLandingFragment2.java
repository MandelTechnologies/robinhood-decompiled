package com.robinhood.android.recommendations.p224ui.risk;

import android.view.View;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsRiskProfileLandingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsRiskProfileLandingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsRiskProfileLandingFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecommendationsRiskProfileLandingBinding> {
    public static final RecommendationsRiskProfileLandingFragment2 INSTANCE = new RecommendationsRiskProfileLandingFragment2();

    RecommendationsRiskProfileLandingFragment2() {
        super(1, FragmentRecommendationsRiskProfileLandingBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsRiskProfileLandingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecommendationsRiskProfileLandingBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecommendationsRiskProfileLandingBinding.bind(p0);
    }
}

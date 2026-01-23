package com.robinhood.android.recommendations.p224ui.questionnaire.landing;

import android.view.View;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsQuestionnaireLandingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsQuestionnaireLandingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.questionnaire.landing.RecommendationsQuestionnaireLandingFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsQuestionnaireLandingFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecommendationsQuestionnaireLandingBinding> {
    public static final RecommendationsQuestionnaireLandingFragment2 INSTANCE = new RecommendationsQuestionnaireLandingFragment2();

    RecommendationsQuestionnaireLandingFragment2() {
        super(1, FragmentRecommendationsQuestionnaireLandingBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireLandingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecommendationsQuestionnaireLandingBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecommendationsQuestionnaireLandingBinding.bind(p0);
    }
}

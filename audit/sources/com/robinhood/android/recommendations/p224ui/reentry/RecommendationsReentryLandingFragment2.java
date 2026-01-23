package com.robinhood.android.recommendations.p224ui.reentry;

import android.view.View;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsQuestionnaireLandingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsReentryLandingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryLandingFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsReentryLandingFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecommendationsQuestionnaireLandingBinding> {
    public static final RecommendationsReentryLandingFragment2 INSTANCE = new RecommendationsReentryLandingFragment2();

    RecommendationsReentryLandingFragment2() {
        super(1, FragmentRecommendationsQuestionnaireLandingBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireLandingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecommendationsQuestionnaireLandingBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecommendationsQuestionnaireLandingBinding.bind(p0);
    }
}

package com.robinhood.android.recommendations.p224ui.questionnaire;

import android.view.View;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsQuestionnaireQuestionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsQuestionnaireQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireQuestionFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsQuestionnaireQuestionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecommendationsQuestionnaireQuestionBinding> {
    public static final RecommendationsQuestionnaireQuestionFragment2 INSTANCE = new RecommendationsQuestionnaireQuestionFragment2();

    RecommendationsQuestionnaireQuestionFragment2() {
        super(1, FragmentRecommendationsQuestionnaireQuestionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireQuestionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecommendationsQuestionnaireQuestionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecommendationsQuestionnaireQuestionBinding.bind(p0);
    }
}

package com.robinhood.android.recommendations.p224ui.confirmation;

import android.view.View;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsQuestionnaireConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsQuestionnaireConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.confirmation.RecommendationsQuestionnaireConfirmationFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsQuestionnaireConfirmationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecommendationsQuestionnaireConfirmationBinding> {
    public static final RecommendationsQuestionnaireConfirmationFragment2 INSTANCE = new RecommendationsQuestionnaireConfirmationFragment2();

    RecommendationsQuestionnaireConfirmationFragment2() {
        super(1, FragmentRecommendationsQuestionnaireConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsQuestionnaireConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecommendationsQuestionnaireConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecommendationsQuestionnaireConfirmationBinding.bind(p0);
    }
}

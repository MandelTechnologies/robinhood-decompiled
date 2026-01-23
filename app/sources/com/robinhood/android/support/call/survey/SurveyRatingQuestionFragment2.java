package com.robinhood.android.support.call.survey;

import android.view.View;
import com.robinhood.shared.support.databinding.FragmentSurveyRatingQuestionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyRatingQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.survey.SurveyRatingQuestionFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class SurveyRatingQuestionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSurveyRatingQuestionBinding> {
    public static final SurveyRatingQuestionFragment2 INSTANCE = new SurveyRatingQuestionFragment2();

    SurveyRatingQuestionFragment2() {
        super(1, FragmentSurveyRatingQuestionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/support/databinding/FragmentSurveyRatingQuestionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSurveyRatingQuestionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSurveyRatingQuestionBinding.bind(p0);
    }
}

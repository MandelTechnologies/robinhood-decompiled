package com.robinhood.android.investorprofile.p162ui.review;

import com.robinhood.android.investorprofile.p162ui.review.QuestionnaireReviewFragment;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireReview;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireReviewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class QuestionnaireReviewFragment2 extends FunctionReferenceImpl implements Function2<UiQuestionnaireReview.QuestionAnswer, Map<String, ? extends UiQuestionnaireQuestion.Supported>, Unit> {
    QuestionnaireReviewFragment2(Object obj) {
        super(2, obj, QuestionnaireReviewFragment.Callbacks.class, "onQuestionSelected", "onQuestionSelected(Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview$QuestionAnswer;Ljava/util/Map;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UiQuestionnaireReview.QuestionAnswer questionAnswer, Map<String, ? extends UiQuestionnaireQuestion.Supported> map) {
        invoke2(questionAnswer, map);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UiQuestionnaireReview.QuestionAnswer p0, Map<String, ? extends UiQuestionnaireQuestion.Supported> map) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((QuestionnaireReviewFragment.Callbacks) this.receiver).onQuestionSelected(p0, map);
    }
}

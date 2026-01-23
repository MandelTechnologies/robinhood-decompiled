package com.robinhood.android.investorprofile.p162ui.review;

import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireReview;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireReviewScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReviewScreen$3$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class QuestionnaireReviewScreen8 extends FunctionReferenceImpl implements Function1<List<? extends UiQuestionnaireReview.QuestionAnswer>, Unit> {
    QuestionnaireReviewScreen8(Object obj) {
        super(1, obj, QuestionnaireReviewDuxo.class, "onConfirm", "onConfirm(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends UiQuestionnaireReview.QuestionAnswer> list) {
        invoke2((List<UiQuestionnaireReview.QuestionAnswer>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<UiQuestionnaireReview.QuestionAnswer> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((QuestionnaireReviewDuxo) this.receiver).onConfirm(p0);
    }
}

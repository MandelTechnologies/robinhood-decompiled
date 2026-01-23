package com.robinhood.shared.education.p377ui.quiz;

import android.view.View;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonSection;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationQuizAnswer;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationQuizAnswer2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EducationQuizDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/quiz/EducationQuizDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/shared/education/ui/quiz/EducationLessonSectionQuizViewState;", "hostView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "updateQuiz", "", "updatedQuiz", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection$Quiz;", "selectQuizAnswer", "selectedAnswer", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationQuizAnswer;", "revealCorrectAnswer", "revealHint", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationQuizDuxo extends ViewDuxo<EducationLessonSectionQuizViewState> {
    public static final int $stable = ViewDuxo.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationQuizDuxo(View hostView) {
        super(hostView, new EducationLessonSectionQuizViewState(null, null, null, 0, 0, null, null, null, 255, null), null, 4, null);
        Intrinsics.checkNotNullParameter(hostView, "hostView");
    }

    public final void updateQuiz(final EducationLessonSection.Quiz updatedQuiz) {
        Intrinsics.checkNotNullParameter(updatedQuiz, "updatedQuiz");
        final MarkdownContent content = updatedQuiz.getContent();
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.quiz.EducationQuizDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationQuizDuxo.updateQuiz$lambda$1(content, updatedQuiz, (EducationLessonSectionQuizViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonSectionQuizViewState updateQuiz$lambda$1(MarkdownContent markdownContent, EducationLessonSection.Quiz quiz, EducationLessonSectionQuizViewState applyMutation) {
        EducationQuizViewState2 educationQuizViewState2;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (Intrinsics.areEqual(markdownContent, applyMutation.getQuestion())) {
            return applyMutation;
        }
        List<EducationQuizAnswer> answers = quiz.getAnswers();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(answers, 10));
        Iterator<T> it = answers.iterator();
        while (it.hasNext()) {
            arrayList.add(new QuizAnswerViewState((EducationQuizAnswer) it.next(), false, 2, null));
        }
        if (applyMutation.getSelectedAnswersMap().get(markdownContent) != null) {
            educationQuizViewState2 = EducationQuizViewState2.CONTINUE;
        } else {
            educationQuizViewState2 = EducationQuizViewState2.GONE;
        }
        return EducationLessonSectionQuizViewState.copy$default(applyMutation, quiz.getHeader(), quiz.getTitle(), markdownContent, quiz.getTextColor(), quiz.getLinkTextColor(), arrayList, null, educationQuizViewState2, 64, null);
    }

    public final void selectQuizAnswer(final EducationQuizAnswer selectedAnswer) {
        Intrinsics.checkNotNullParameter(selectedAnswer, "selectedAnswer");
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.quiz.EducationQuizDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationQuizDuxo.selectQuizAnswer$lambda$2(selectedAnswer, (EducationLessonSectionQuizViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonSectionQuizViewState selectQuizAnswer$lambda$2(EducationQuizAnswer educationQuizAnswer, EducationLessonSectionQuizViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonSectionQuizViewState.copy$default(applyMutation, null, null, null, 0, 0, null, MapsKt.plus(applyMutation.getSelectedAnswersMap(), Tuples4.m3642to(applyMutation.getQuestion(), new QuizAnswerViewState(educationQuizAnswer, true))), EducationQuizViewState2.CONTINUE, 63, null);
    }

    public final void revealCorrectAnswer() {
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.quiz.EducationQuizDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationQuizDuxo.revealCorrectAnswer$lambda$4((EducationLessonSectionQuizViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonSectionQuizViewState revealCorrectAnswer$lambda$4(EducationLessonSectionQuizViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        for (QuizAnswerViewState quizAnswerViewState : applyMutation.getDisplayedAnswers()) {
            if (quizAnswerViewState.getAnswer().getCorrectness() == EducationQuizAnswer2.CORRECT) {
                return EducationLessonSectionQuizViewState.copy$default(applyMutation, null, null, null, 0, 0, null, MapsKt.plus(applyMutation.getSelectedAnswersMap(), Tuples4.m3642to(applyMutation.getQuestion(), QuizAnswerViewState.copy$default(quizAnswerViewState, null, true, 1, null))), EducationQuizViewState2.CONTINUE, 63, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void revealHint() {
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.quiz.EducationQuizDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationQuizDuxo.revealHint$lambda$5((EducationLessonSectionQuizViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonSectionQuizViewState revealHint$lambda$5(EducationLessonSectionQuizViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.getHintViewState() == EducationQuizViewState2.GONE ? EducationLessonSectionQuizViewState.copy$default(applyMutation, null, null, null, 0, 0, null, null, EducationQuizViewState2.SWIPE_TO_REVEAL_ANSWER, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null) : applyMutation;
    }
}

package com.robinhood.shared.education.p377ui.quiz;

import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationQuizAnswer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationQuizViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/quiz/QuizAnswerViewState;", "", "answer", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationQuizAnswer;", "isSelected", "", "<init>", "(Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationQuizAnswer;Z)V", "getAnswer", "()Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationQuizAnswer;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class QuizAnswerViewState {
    public static final int $stable = 8;
    private final EducationQuizAnswer answer;
    private final boolean isSelected;

    public static /* synthetic */ QuizAnswerViewState copy$default(QuizAnswerViewState quizAnswerViewState, EducationQuizAnswer educationQuizAnswer, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            educationQuizAnswer = quizAnswerViewState.answer;
        }
        if ((i & 2) != 0) {
            z = quizAnswerViewState.isSelected;
        }
        return quizAnswerViewState.copy(educationQuizAnswer, z);
    }

    /* renamed from: component1, reason: from getter */
    public final EducationQuizAnswer getAnswer() {
        return this.answer;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final QuizAnswerViewState copy(EducationQuizAnswer answer, boolean isSelected) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        return new QuizAnswerViewState(answer, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizAnswerViewState)) {
            return false;
        }
        QuizAnswerViewState quizAnswerViewState = (QuizAnswerViewState) other;
        return Intrinsics.areEqual(this.answer, quizAnswerViewState.answer) && this.isSelected == quizAnswerViewState.isSelected;
    }

    public int hashCode() {
        return (this.answer.hashCode() * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "QuizAnswerViewState(answer=" + this.answer + ", isSelected=" + this.isSelected + ")";
    }

    public QuizAnswerViewState(EducationQuizAnswer answer, boolean z) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.answer = answer;
        this.isSelected = z;
    }

    public /* synthetic */ QuizAnswerViewState(EducationQuizAnswer educationQuizAnswer, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(educationQuizAnswer, (i & 2) != 0 ? false : z);
    }

    public final EducationQuizAnswer getAnswer() {
        return this.answer;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }
}

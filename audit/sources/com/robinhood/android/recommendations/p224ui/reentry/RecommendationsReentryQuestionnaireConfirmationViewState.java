package com.robinhood.android.recommendations.p224ui.reentry;

import com.robinhood.recommendations.models.p363ui.UiRecommendationsExistingAnswers;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsQuestionnaire;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecommendationsReentryQuestionnaireConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010%\u001a\u00020\u0003HÂ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J!\u0010)\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\fHÆ\u0003J_\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\fHÆ\u0001J\u0013\u0010+\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0019HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R)\u0010\u000b\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010 \u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR#\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\r0\u00058F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationViewState;", "", "existingAnswers", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsExistingAnswers;", "questionAnswerSummaries", "", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsExistingAnswers$QuestionAnswerSummary;", "isLoading", "", "questions", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$Question;", "changeAnswerEvent", "Lcom/robinhood/udf/UiEvent;", "Lkotlin/Pair;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$Answer;", "Lcom/robinhood/android/recommendations/ui/reentry/QuestionAnswer;", "<init>", "(Lcom/robinhood/recommendations/models/ui/UiRecommendationsExistingAnswers;Ljava/util/List;ZLjava/util/List;Lcom/robinhood/udf/UiEvent;)V", "getQuestionAnswerSummaries", "()Ljava/util/List;", "()Z", "getQuestions", "getChangeAnswerEvent", "()Lcom/robinhood/udf/UiEvent;", "title", "", "getTitle", "()Ljava/lang/String;", "subtitle", "getSubtitle", "disclosureMarkdown", "getDisclosureMarkdown", "confirmBtnTitle", "getConfirmBtnTitle", "questionsAndAnswers", "Ljava/util/UUID;", "getQuestionsAndAnswers", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class RecommendationsReentryQuestionnaireConfirmationViewState {
    private final UiEvent<Tuples2<UiRecommendationsQuestionnaire.Question, UiRecommendationsQuestionnaire.Answer>> changeAnswerEvent;
    private final UiRecommendationsExistingAnswers existingAnswers;
    private final boolean isLoading;
    private final List<UiRecommendationsExistingAnswers.QuestionAnswerSummary> questionAnswerSummaries;
    private final List<UiRecommendationsQuestionnaire.Question> questions;

    /* renamed from: component1, reason: from getter */
    private final UiRecommendationsExistingAnswers getExistingAnswers() {
        return this.existingAnswers;
    }

    public static /* synthetic */ RecommendationsReentryQuestionnaireConfirmationViewState copy$default(RecommendationsReentryQuestionnaireConfirmationViewState recommendationsReentryQuestionnaireConfirmationViewState, UiRecommendationsExistingAnswers uiRecommendationsExistingAnswers, List list, boolean z, List list2, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            uiRecommendationsExistingAnswers = recommendationsReentryQuestionnaireConfirmationViewState.existingAnswers;
        }
        if ((i & 2) != 0) {
            list = recommendationsReentryQuestionnaireConfirmationViewState.questionAnswerSummaries;
        }
        if ((i & 4) != 0) {
            z = recommendationsReentryQuestionnaireConfirmationViewState.isLoading;
        }
        if ((i & 8) != 0) {
            list2 = recommendationsReentryQuestionnaireConfirmationViewState.questions;
        }
        if ((i & 16) != 0) {
            uiEvent = recommendationsReentryQuestionnaireConfirmationViewState.changeAnswerEvent;
        }
        UiEvent uiEvent2 = uiEvent;
        boolean z2 = z;
        return recommendationsReentryQuestionnaireConfirmationViewState.copy(uiRecommendationsExistingAnswers, list, z2, list2, uiEvent2);
    }

    public final List<UiRecommendationsExistingAnswers.QuestionAnswerSummary> component2() {
        return this.questionAnswerSummaries;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<UiRecommendationsQuestionnaire.Question> component4() {
        return this.questions;
    }

    public final UiEvent<Tuples2<UiRecommendationsQuestionnaire.Question, UiRecommendationsQuestionnaire.Answer>> component5() {
        return this.changeAnswerEvent;
    }

    public final RecommendationsReentryQuestionnaireConfirmationViewState copy(UiRecommendationsExistingAnswers existingAnswers, List<UiRecommendationsExistingAnswers.QuestionAnswerSummary> questionAnswerSummaries, boolean isLoading, List<UiRecommendationsQuestionnaire.Question> questions, UiEvent<Tuples2<UiRecommendationsQuestionnaire.Question, UiRecommendationsQuestionnaire.Answer>> changeAnswerEvent) {
        Intrinsics.checkNotNullParameter(existingAnswers, "existingAnswers");
        Intrinsics.checkNotNullParameter(questionAnswerSummaries, "questionAnswerSummaries");
        Intrinsics.checkNotNullParameter(questions, "questions");
        return new RecommendationsReentryQuestionnaireConfirmationViewState(existingAnswers, questionAnswerSummaries, isLoading, questions, changeAnswerEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationsReentryQuestionnaireConfirmationViewState)) {
            return false;
        }
        RecommendationsReentryQuestionnaireConfirmationViewState recommendationsReentryQuestionnaireConfirmationViewState = (RecommendationsReentryQuestionnaireConfirmationViewState) other;
        return Intrinsics.areEqual(this.existingAnswers, recommendationsReentryQuestionnaireConfirmationViewState.existingAnswers) && Intrinsics.areEqual(this.questionAnswerSummaries, recommendationsReentryQuestionnaireConfirmationViewState.questionAnswerSummaries) && this.isLoading == recommendationsReentryQuestionnaireConfirmationViewState.isLoading && Intrinsics.areEqual(this.questions, recommendationsReentryQuestionnaireConfirmationViewState.questions) && Intrinsics.areEqual(this.changeAnswerEvent, recommendationsReentryQuestionnaireConfirmationViewState.changeAnswerEvent);
    }

    public int hashCode() {
        int iHashCode = ((((((this.existingAnswers.hashCode() * 31) + this.questionAnswerSummaries.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.questions.hashCode()) * 31;
        UiEvent<Tuples2<UiRecommendationsQuestionnaire.Question, UiRecommendationsQuestionnaire.Answer>> uiEvent = this.changeAnswerEvent;
        return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
    }

    public String toString() {
        return "RecommendationsReentryQuestionnaireConfirmationViewState(existingAnswers=" + this.existingAnswers + ", questionAnswerSummaries=" + this.questionAnswerSummaries + ", isLoading=" + this.isLoading + ", questions=" + this.questions + ", changeAnswerEvent=" + this.changeAnswerEvent + ")";
    }

    public RecommendationsReentryQuestionnaireConfirmationViewState(UiRecommendationsExistingAnswers existingAnswers, List<UiRecommendationsExistingAnswers.QuestionAnswerSummary> questionAnswerSummaries, boolean z, List<UiRecommendationsQuestionnaire.Question> questions, UiEvent<Tuples2<UiRecommendationsQuestionnaire.Question, UiRecommendationsQuestionnaire.Answer>> uiEvent) {
        Intrinsics.checkNotNullParameter(existingAnswers, "existingAnswers");
        Intrinsics.checkNotNullParameter(questionAnswerSummaries, "questionAnswerSummaries");
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.existingAnswers = existingAnswers;
        this.questionAnswerSummaries = questionAnswerSummaries;
        this.isLoading = z;
        this.questions = questions;
        this.changeAnswerEvent = uiEvent;
    }

    public final List<UiRecommendationsExistingAnswers.QuestionAnswerSummary> getQuestionAnswerSummaries() {
        return this.questionAnswerSummaries;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ RecommendationsReentryQuestionnaireConfirmationViewState(UiRecommendationsExistingAnswers uiRecommendationsExistingAnswers, List list, boolean z, List list2, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiRecommendationsExistingAnswers, list, (i & 4) != 0 ? true : z, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : uiEvent);
    }

    public final List<UiRecommendationsQuestionnaire.Question> getQuestions() {
        return this.questions;
    }

    public final UiEvent<Tuples2<UiRecommendationsQuestionnaire.Question, UiRecommendationsQuestionnaire.Answer>> getChangeAnswerEvent() {
        return this.changeAnswerEvent;
    }

    public final String getTitle() {
        return this.existingAnswers.getTitle();
    }

    public final String getSubtitle() {
        return this.existingAnswers.getSubtitle();
    }

    public final String getDisclosureMarkdown() {
        return this.existingAnswers.getDisclosureMarkdown();
    }

    public final String getConfirmBtnTitle() {
        return this.existingAnswers.getContinueBtnTitle();
    }

    public final List<Tuples2<UUID, UUID>> getQuestionsAndAnswers() {
        List<UiRecommendationsExistingAnswers.QuestionAnswerSummary> list = this.questionAnswerSummaries;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((UiRecommendationsExistingAnswers.QuestionAnswerSummary) it.next()).getQuestionToAnswerIds());
        }
        return arrayList;
    }
}

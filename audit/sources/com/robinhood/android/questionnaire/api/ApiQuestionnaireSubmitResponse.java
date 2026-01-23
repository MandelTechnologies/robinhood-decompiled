package com.robinhood.android.questionnaire.api;

import com.squareup.moshi.JsonClass;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiQuestionnaireSubmitResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitResponse;", "", "review_page_type", "Lcom/robinhood/android/questionnaire/api/ReviewPageType;", "questions_summary", "", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitResponse$QuestionsSummary;", "<init>", "(Lcom/robinhood/android/questionnaire/api/ReviewPageType;Ljava/util/List;)V", "getReview_page_type", "()Lcom/robinhood/android/questionnaire/api/ReviewPageType;", "getQuestions_summary", "()Ljava/util/List;", "QuestionsSummary", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ApiQuestionnaireSubmitResponse {
    private final List<QuestionsSummary> questions_summary;
    private final ReviewPageType review_page_type;

    public ApiQuestionnaireSubmitResponse(ReviewPageType review_page_type, List<QuestionsSummary> questions_summary) {
        Intrinsics.checkNotNullParameter(review_page_type, "review_page_type");
        Intrinsics.checkNotNullParameter(questions_summary, "questions_summary");
        this.review_page_type = review_page_type;
        this.questions_summary = questions_summary;
    }

    public final ReviewPageType getReview_page_type() {
        return this.review_page_type;
    }

    public final List<QuestionsSummary> getQuestions_summary() {
        return this.questions_summary;
    }

    /* compiled from: ApiQuestionnaireSubmitResponse.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireSubmitResponse$QuestionsSummary;", "", "question_key", "", "user_answer_id", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getQuestion_key", "()Ljava/lang/String;", "getUser_answer_id", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class QuestionsSummary {
        private final String question_key;
        private final UUID user_answer_id;

        public static /* synthetic */ QuestionsSummary copy$default(QuestionsSummary questionsSummary, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = questionsSummary.question_key;
            }
            if ((i & 2) != 0) {
                uuid = questionsSummary.user_answer_id;
            }
            return questionsSummary.copy(str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getQuestion_key() {
            return this.question_key;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getUser_answer_id() {
            return this.user_answer_id;
        }

        public final QuestionsSummary copy(String question_key, UUID user_answer_id) {
            Intrinsics.checkNotNullParameter(question_key, "question_key");
            Intrinsics.checkNotNullParameter(user_answer_id, "user_answer_id");
            return new QuestionsSummary(question_key, user_answer_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionsSummary)) {
                return false;
            }
            QuestionsSummary questionsSummary = (QuestionsSummary) other;
            return Intrinsics.areEqual(this.question_key, questionsSummary.question_key) && Intrinsics.areEqual(this.user_answer_id, questionsSummary.user_answer_id);
        }

        public int hashCode() {
            return (this.question_key.hashCode() * 31) + this.user_answer_id.hashCode();
        }

        public String toString() {
            return "QuestionsSummary(question_key=" + this.question_key + ", user_answer_id=" + this.user_answer_id + ")";
        }

        public QuestionsSummary(String question_key, UUID user_answer_id) {
            Intrinsics.checkNotNullParameter(question_key, "question_key");
            Intrinsics.checkNotNullParameter(user_answer_id, "user_answer_id");
            this.question_key = question_key;
            this.user_answer_id = user_answer_id;
        }

        public final String getQuestion_key() {
            return this.question_key;
        }

        public final UUID getUser_answer_id() {
            return this.user_answer_id;
        }
    }
}

package com.robinhood.android.questionnaire.api;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiQuestionnaireProfileResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireProfileSummary;", "", "question_key", "", "answer_content", "Lcom/robinhood/android/questionnaire/api/ApiAnswerContent;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/questionnaire/api/ApiAnswerContent;)V", "getQuestion_key", "()Ljava/lang/String;", "getAnswer_content", "()Lcom/robinhood/android/questionnaire/api/ApiAnswerContent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApiQuestionnaireProfileSummary {
    private final ApiQuestionnaireProfileResponse2 answer_content;
    private final String question_key;

    public static /* synthetic */ ApiQuestionnaireProfileSummary copy$default(ApiQuestionnaireProfileSummary apiQuestionnaireProfileSummary, String str, ApiQuestionnaireProfileResponse2 apiQuestionnaireProfileResponse2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiQuestionnaireProfileSummary.question_key;
        }
        if ((i & 2) != 0) {
            apiQuestionnaireProfileResponse2 = apiQuestionnaireProfileSummary.answer_content;
        }
        return apiQuestionnaireProfileSummary.copy(str, apiQuestionnaireProfileResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuestion_key() {
        return this.question_key;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiQuestionnaireProfileResponse2 getAnswer_content() {
        return this.answer_content;
    }

    public final ApiQuestionnaireProfileSummary copy(String question_key, ApiQuestionnaireProfileResponse2 answer_content) {
        Intrinsics.checkNotNullParameter(question_key, "question_key");
        return new ApiQuestionnaireProfileSummary(question_key, answer_content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiQuestionnaireProfileSummary)) {
            return false;
        }
        ApiQuestionnaireProfileSummary apiQuestionnaireProfileSummary = (ApiQuestionnaireProfileSummary) other;
        return Intrinsics.areEqual(this.question_key, apiQuestionnaireProfileSummary.question_key) && Intrinsics.areEqual(this.answer_content, apiQuestionnaireProfileSummary.answer_content);
    }

    public int hashCode() {
        int iHashCode = this.question_key.hashCode() * 31;
        ApiQuestionnaireProfileResponse2 apiQuestionnaireProfileResponse2 = this.answer_content;
        return iHashCode + (apiQuestionnaireProfileResponse2 == null ? 0 : apiQuestionnaireProfileResponse2.hashCode());
    }

    public String toString() {
        return "ApiQuestionnaireProfileSummary(question_key=" + this.question_key + ", answer_content=" + this.answer_content + ")";
    }

    public ApiQuestionnaireProfileSummary(String question_key, ApiQuestionnaireProfileResponse2 apiQuestionnaireProfileResponse2) {
        Intrinsics.checkNotNullParameter(question_key, "question_key");
        this.question_key = question_key;
        this.answer_content = apiQuestionnaireProfileResponse2;
    }

    public final String getQuestion_key() {
        return this.question_key;
    }

    public final ApiQuestionnaireProfileResponse2 getAnswer_content() {
        return this.answer_content;
    }
}

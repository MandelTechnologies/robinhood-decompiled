package com.robinhood.android.questionnaire.api;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiQuestionnaireProfileResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/QuestionnaireStringAnswerSummary;", "", "answer_text", "", "<init>", "(Ljava/lang/String;)V", "getAnswer_text", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class QuestionnaireStringAnswerSummary {
    private final String answer_text;

    public static /* synthetic */ QuestionnaireStringAnswerSummary copy$default(QuestionnaireStringAnswerSummary questionnaireStringAnswerSummary, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionnaireStringAnswerSummary.answer_text;
        }
        return questionnaireStringAnswerSummary.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAnswer_text() {
        return this.answer_text;
    }

    public final QuestionnaireStringAnswerSummary copy(String answer_text) {
        Intrinsics.checkNotNullParameter(answer_text, "answer_text");
        return new QuestionnaireStringAnswerSummary(answer_text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QuestionnaireStringAnswerSummary) && Intrinsics.areEqual(this.answer_text, ((QuestionnaireStringAnswerSummary) other).answer_text);
    }

    public int hashCode() {
        return this.answer_text.hashCode();
    }

    public String toString() {
        return "QuestionnaireStringAnswerSummary(answer_text=" + this.answer_text + ")";
    }

    public QuestionnaireStringAnswerSummary(String answer_text) {
        Intrinsics.checkNotNullParameter(answer_text, "answer_text");
        this.answer_text = answer_text;
    }

    public final String getAnswer_text() {
        return this.answer_text;
    }
}

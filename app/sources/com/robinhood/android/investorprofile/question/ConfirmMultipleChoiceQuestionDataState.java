package com.robinhood.android.investorprofile.question;

import com.robinhood.android.questionnaire.api.ApiQuestionnaireProfileResponse;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmMultipleChoiceQuestionDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionDataState;", "", "accountNumber", "", "profile", "Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireProfileResponse;", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireProfileResponse;Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;)V", "getAccountNumber", "()Ljava/lang/String;", "getProfile", "()Lcom/robinhood/android/questionnaire/api/ApiQuestionnaireProfileResponse;", "getQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ConfirmMultipleChoiceQuestionDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final ApiQuestionnaireProfileResponse profile;
    private final UiQuestionnaireQuestion.MultipleChoiceQuestion question;

    public static /* synthetic */ ConfirmMultipleChoiceQuestionDataState copy$default(ConfirmMultipleChoiceQuestionDataState confirmMultipleChoiceQuestionDataState, String str, ApiQuestionnaireProfileResponse apiQuestionnaireProfileResponse, UiQuestionnaireQuestion.MultipleChoiceQuestion multipleChoiceQuestion, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmMultipleChoiceQuestionDataState.accountNumber;
        }
        if ((i & 2) != 0) {
            apiQuestionnaireProfileResponse = confirmMultipleChoiceQuestionDataState.profile;
        }
        if ((i & 4) != 0) {
            multipleChoiceQuestion = confirmMultipleChoiceQuestionDataState.question;
        }
        return confirmMultipleChoiceQuestionDataState.copy(str, apiQuestionnaireProfileResponse, multipleChoiceQuestion);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiQuestionnaireProfileResponse getProfile() {
        return this.profile;
    }

    /* renamed from: component3, reason: from getter */
    public final UiQuestionnaireQuestion.MultipleChoiceQuestion getQuestion() {
        return this.question;
    }

    public final ConfirmMultipleChoiceQuestionDataState copy(String accountNumber, ApiQuestionnaireProfileResponse profile, UiQuestionnaireQuestion.MultipleChoiceQuestion question) {
        Intrinsics.checkNotNullParameter(question, "question");
        return new ConfirmMultipleChoiceQuestionDataState(accountNumber, profile, question);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmMultipleChoiceQuestionDataState)) {
            return false;
        }
        ConfirmMultipleChoiceQuestionDataState confirmMultipleChoiceQuestionDataState = (ConfirmMultipleChoiceQuestionDataState) other;
        return Intrinsics.areEqual(this.accountNumber, confirmMultipleChoiceQuestionDataState.accountNumber) && Intrinsics.areEqual(this.profile, confirmMultipleChoiceQuestionDataState.profile) && Intrinsics.areEqual(this.question, confirmMultipleChoiceQuestionDataState.question);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ApiQuestionnaireProfileResponse apiQuestionnaireProfileResponse = this.profile;
        return ((iHashCode + (apiQuestionnaireProfileResponse != null ? apiQuestionnaireProfileResponse.hashCode() : 0)) * 31) + this.question.hashCode();
    }

    public String toString() {
        return "ConfirmMultipleChoiceQuestionDataState(accountNumber=" + this.accountNumber + ", profile=" + this.profile + ", question=" + this.question + ")";
    }

    public ConfirmMultipleChoiceQuestionDataState(String str, ApiQuestionnaireProfileResponse apiQuestionnaireProfileResponse, UiQuestionnaireQuestion.MultipleChoiceQuestion question) {
        Intrinsics.checkNotNullParameter(question, "question");
        this.accountNumber = str;
        this.profile = apiQuestionnaireProfileResponse;
        this.question = question;
    }

    public /* synthetic */ ConfirmMultipleChoiceQuestionDataState(String str, ApiQuestionnaireProfileResponse apiQuestionnaireProfileResponse, UiQuestionnaireQuestion.MultipleChoiceQuestion multipleChoiceQuestion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : apiQuestionnaireProfileResponse, multipleChoiceQuestion);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ApiQuestionnaireProfileResponse getProfile() {
        return this.profile;
    }

    public final UiQuestionnaireQuestion.MultipleChoiceQuestion getQuestion() {
        return this.question;
    }
}

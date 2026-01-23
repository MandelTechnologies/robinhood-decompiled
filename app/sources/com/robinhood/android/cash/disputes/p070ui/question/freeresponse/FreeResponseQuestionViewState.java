package com.robinhood.android.cash.disputes.p070ui.question.freeresponse;

import com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader;
import com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader2;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationResult;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationState;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationState2;
import com.robinhood.models.p355ui.DisputeQuestionnaire;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FreeResponseQuestionViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0011\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÂ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0012\u0010\u001c\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0012\u0010\u001f\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u0004\u0018\u00010\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0012\u0010#\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010\"¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/freeresponse/FreeResponseQuestionViewState;", "Lcom/robinhood/android/cash/disputes/ui/question/QuestionDisplayHeader;", "Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationState;", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;", "isValidationRequestLoading", "", "textPreFillEvent", "Lcom/robinhood/udf/UiEvent;", "", "validationResultEvent", "Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationResult;", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getTextPreFillEvent", "()Lcom/robinhood/udf/UiEvent;", "getValidationResultEvent", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "isContinueButtonLoading", "()Z", "isSkipButtonEnabled", "isSubtitleVisible", "subtitleText", "getSubtitleText", "()Ljava/lang/String;", "titleText", "getTitleText", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FreeResponseQuestionViewState implements QuestionDisplayHeader, ResponseValidationState {
    public static final int $stable = 8;
    private final /* synthetic */ QuestionDisplayHeader2 $$delegate_0;
    private final /* synthetic */ ResponseValidationState2 $$delegate_1;
    private final boolean isValidationRequestLoading;
    private final DisputeQuestionnaire.Question.UserInput question;
    private final UiEvent<String> textPreFillEvent;
    private final UiEvent<ResponseValidationResult> validationResultEvent;

    /* renamed from: component1, reason: from getter */
    private final DisputeQuestionnaire.Question.UserInput getQuestion() {
        return this.question;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getIsValidationRequestLoading() {
        return this.isValidationRequestLoading;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FreeResponseQuestionViewState copy$default(FreeResponseQuestionViewState freeResponseQuestionViewState, DisputeQuestionnaire.Question.UserInput userInput, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            userInput = freeResponseQuestionViewState.question;
        }
        if ((i & 2) != 0) {
            z = freeResponseQuestionViewState.isValidationRequestLoading;
        }
        if ((i & 4) != 0) {
            uiEvent = freeResponseQuestionViewState.textPreFillEvent;
        }
        if ((i & 8) != 0) {
            uiEvent2 = freeResponseQuestionViewState.validationResultEvent;
        }
        return freeResponseQuestionViewState.copy(userInput, z, uiEvent, uiEvent2);
    }

    public final UiEvent<String> component3() {
        return this.textPreFillEvent;
    }

    public final UiEvent<ResponseValidationResult> component4() {
        return this.validationResultEvent;
    }

    public final FreeResponseQuestionViewState copy(DisputeQuestionnaire.Question.UserInput question, boolean isValidationRequestLoading, UiEvent<String> textPreFillEvent, UiEvent<ResponseValidationResult> validationResultEvent) {
        Intrinsics.checkNotNullParameter(question, "question");
        return new FreeResponseQuestionViewState(question, isValidationRequestLoading, textPreFillEvent, validationResultEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreeResponseQuestionViewState)) {
            return false;
        }
        FreeResponseQuestionViewState freeResponseQuestionViewState = (FreeResponseQuestionViewState) other;
        return Intrinsics.areEqual(this.question, freeResponseQuestionViewState.question) && this.isValidationRequestLoading == freeResponseQuestionViewState.isValidationRequestLoading && Intrinsics.areEqual(this.textPreFillEvent, freeResponseQuestionViewState.textPreFillEvent) && Intrinsics.areEqual(this.validationResultEvent, freeResponseQuestionViewState.validationResultEvent);
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader
    public String getSubtitleText() {
        return this.$$delegate_0.getSubtitleText();
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader
    public String getTitleText() {
        return this.$$delegate_0.getTitleText();
    }

    public int hashCode() {
        int iHashCode = ((this.question.hashCode() * 31) + Boolean.hashCode(this.isValidationRequestLoading)) * 31;
        UiEvent<String> uiEvent = this.textPreFillEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<ResponseValidationResult> uiEvent2 = this.validationResultEvent;
        return iHashCode2 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationState
    /* renamed from: isContinueButtonLoading */
    public boolean getIsValidationRequestLoading() {
        return this.$$delegate_1.getIsValidationRequestLoading();
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationState
    public boolean isSkipButtonEnabled() {
        return this.$$delegate_1.isSkipButtonEnabled();
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader
    public boolean isSubtitleVisible() {
        return this.$$delegate_0.isSubtitleVisible();
    }

    public String toString() {
        return "FreeResponseQuestionViewState(question=" + this.question + ", isValidationRequestLoading=" + this.isValidationRequestLoading + ", textPreFillEvent=" + this.textPreFillEvent + ", validationResultEvent=" + this.validationResultEvent + ")";
    }

    public FreeResponseQuestionViewState(DisputeQuestionnaire.Question.UserInput question, boolean z, UiEvent<String> uiEvent, UiEvent<ResponseValidationResult> uiEvent2) {
        Intrinsics.checkNotNullParameter(question, "question");
        this.$$delegate_0 = new QuestionDisplayHeader2(question);
        this.$$delegate_1 = new ResponseValidationState2(z);
        this.question = question;
        this.isValidationRequestLoading = z;
        this.textPreFillEvent = uiEvent;
        this.validationResultEvent = uiEvent2;
    }

    public /* synthetic */ FreeResponseQuestionViewState(DisputeQuestionnaire.Question.UserInput userInput, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userInput, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? null : uiEvent2);
    }

    public final UiEvent<String> getTextPreFillEvent() {
        return this.textPreFillEvent;
    }

    public final UiEvent<ResponseValidationResult> getValidationResultEvent() {
        return this.validationResultEvent;
    }
}

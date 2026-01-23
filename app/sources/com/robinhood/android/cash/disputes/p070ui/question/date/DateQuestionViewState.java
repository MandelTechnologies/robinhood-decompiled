package com.robinhood.android.cash.disputes.p070ui.question.date;

import com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader;
import com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader2;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationResult;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationState;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationState2;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p355ui.DisputeQuestionnaire;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.Instants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: DateQuestionViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019Jf\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0019R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b,\u0010\u0019R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b-\u0010\u0019R\u0013\u00100\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u0010\u001fR\u0016\u00104\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u0010\u001fR\u0014\u00105\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u0010\u0017R\u0014\u00106\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u0010\u0017R\u0014\u00107\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u0010\u0017¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionViewState;", "Lcom/robinhood/android/cash/disputes/ui/question/QuestionDisplayHeader;", "Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationState;", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;", "question", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "minervaAccount", "", "isValidationRequestLoading", "Lcom/robinhood/udf/UiEvent;", "j$/time/LocalDate", "datePreFillEvent", "", "textPreFillEvent", "Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationResult;", "validationResultEvent", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;Lcom/robinhood/models/db/mcduckling/MinervaAccount;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "component1", "()Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;", "component2", "()Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "component3", "()Z", "component4", "()Lcom/robinhood/udf/UiEvent;", "component5", "component6", "copy", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;Lcom/robinhood/models/db/mcduckling/MinervaAccount;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)Lcom/robinhood/android/cash/disputes/ui/question/date/DateQuestionViewState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "Z", "Lcom/robinhood/udf/UiEvent;", "getDatePreFillEvent", "getTextPreFillEvent", "getValidationResultEvent", "getEarliestAvailableDate", "()Lj$/time/LocalDate;", "earliestAvailableDate", "getTitleText", "titleText", "getSubtitleText", "subtitleText", "isSubtitleVisible", "isContinueButtonLoading", "isSkipButtonEnabled", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DateQuestionViewState implements QuestionDisplayHeader, ResponseValidationState {
    public static final int $stable = 8;
    private final /* synthetic */ QuestionDisplayHeader2 $$delegate_0;
    private final /* synthetic */ ResponseValidationState2 $$delegate_1;
    private final UiEvent<LocalDate> datePreFillEvent;
    private final boolean isValidationRequestLoading;
    private final MinervaAccount minervaAccount;
    private final DisputeQuestionnaire.Question.UserInput question;
    private final UiEvent<String> textPreFillEvent;
    private final UiEvent<ResponseValidationResult> validationResultEvent;

    /* renamed from: component1, reason: from getter */
    private final DisputeQuestionnaire.Question.UserInput getQuestion() {
        return this.question;
    }

    /* renamed from: component2, reason: from getter */
    private final MinervaAccount getMinervaAccount() {
        return this.minervaAccount;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getIsValidationRequestLoading() {
        return this.isValidationRequestLoading;
    }

    public static /* synthetic */ DateQuestionViewState copy$default(DateQuestionViewState dateQuestionViewState, DisputeQuestionnaire.Question.UserInput userInput, MinervaAccount minervaAccount, boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, int i, Object obj) {
        if ((i & 1) != 0) {
            userInput = dateQuestionViewState.question;
        }
        if ((i & 2) != 0) {
            minervaAccount = dateQuestionViewState.minervaAccount;
        }
        if ((i & 4) != 0) {
            z = dateQuestionViewState.isValidationRequestLoading;
        }
        if ((i & 8) != 0) {
            uiEvent = dateQuestionViewState.datePreFillEvent;
        }
        if ((i & 16) != 0) {
            uiEvent2 = dateQuestionViewState.textPreFillEvent;
        }
        if ((i & 32) != 0) {
            uiEvent3 = dateQuestionViewState.validationResultEvent;
        }
        UiEvent uiEvent4 = uiEvent2;
        UiEvent uiEvent5 = uiEvent3;
        return dateQuestionViewState.copy(userInput, minervaAccount, z, uiEvent, uiEvent4, uiEvent5);
    }

    public final UiEvent<LocalDate> component4() {
        return this.datePreFillEvent;
    }

    public final UiEvent<String> component5() {
        return this.textPreFillEvent;
    }

    public final UiEvent<ResponseValidationResult> component6() {
        return this.validationResultEvent;
    }

    public final DateQuestionViewState copy(DisputeQuestionnaire.Question.UserInput question, MinervaAccount minervaAccount, boolean isValidationRequestLoading, UiEvent<LocalDate> datePreFillEvent, UiEvent<String> textPreFillEvent, UiEvent<ResponseValidationResult> validationResultEvent) {
        Intrinsics.checkNotNullParameter(question, "question");
        return new DateQuestionViewState(question, minervaAccount, isValidationRequestLoading, datePreFillEvent, textPreFillEvent, validationResultEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateQuestionViewState)) {
            return false;
        }
        DateQuestionViewState dateQuestionViewState = (DateQuestionViewState) other;
        return Intrinsics.areEqual(this.question, dateQuestionViewState.question) && Intrinsics.areEqual(this.minervaAccount, dateQuestionViewState.minervaAccount) && this.isValidationRequestLoading == dateQuestionViewState.isValidationRequestLoading && Intrinsics.areEqual(this.datePreFillEvent, dateQuestionViewState.datePreFillEvent) && Intrinsics.areEqual(this.textPreFillEvent, dateQuestionViewState.textPreFillEvent) && Intrinsics.areEqual(this.validationResultEvent, dateQuestionViewState.validationResultEvent);
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
        int iHashCode = this.question.hashCode() * 31;
        MinervaAccount minervaAccount = this.minervaAccount;
        int iHashCode2 = (((iHashCode + (minervaAccount == null ? 0 : minervaAccount.hashCode())) * 31) + Boolean.hashCode(this.isValidationRequestLoading)) * 31;
        UiEvent<LocalDate> uiEvent = this.datePreFillEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<String> uiEvent2 = this.textPreFillEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<ResponseValidationResult> uiEvent3 = this.validationResultEvent;
        return iHashCode4 + (uiEvent3 != null ? uiEvent3.hashCode() : 0);
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
        return "DateQuestionViewState(question=" + this.question + ", minervaAccount=" + this.minervaAccount + ", isValidationRequestLoading=" + this.isValidationRequestLoading + ", datePreFillEvent=" + this.datePreFillEvent + ", textPreFillEvent=" + this.textPreFillEvent + ", validationResultEvent=" + this.validationResultEvent + ")";
    }

    public DateQuestionViewState(DisputeQuestionnaire.Question.UserInput question, MinervaAccount minervaAccount, boolean z, UiEvent<LocalDate> uiEvent, UiEvent<String> uiEvent2, UiEvent<ResponseValidationResult> uiEvent3) {
        Intrinsics.checkNotNullParameter(question, "question");
        this.$$delegate_0 = new QuestionDisplayHeader2(question);
        this.$$delegate_1 = new ResponseValidationState2(z);
        this.question = question;
        this.minervaAccount = minervaAccount;
        this.isValidationRequestLoading = z;
        this.datePreFillEvent = uiEvent;
        this.textPreFillEvent = uiEvent2;
        this.validationResultEvent = uiEvent3;
    }

    public /* synthetic */ DateQuestionViewState(DisputeQuestionnaire.Question.UserInput userInput, MinervaAccount minervaAccount, boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userInput, (i & 2) != 0 ? null : minervaAccount, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : uiEvent2, (i & 32) != 0 ? null : uiEvent3);
    }

    public final UiEvent<LocalDate> getDatePreFillEvent() {
        return this.datePreFillEvent;
    }

    public final UiEvent<String> getTextPreFillEvent() {
        return this.textPreFillEvent;
    }

    public final UiEvent<ResponseValidationResult> getValidationResultEvent() {
        return this.validationResultEvent;
    }

    public final LocalDate getEarliestAvailableDate() {
        Instant createdAt;
        MinervaAccount minervaAccount = this.minervaAccount;
        if (minervaAccount == null || (createdAt = minervaAccount.getCreatedAt()) == null) {
            return null;
        }
        return Instants.toLocalDate$default(createdAt, null, 1, null);
    }
}

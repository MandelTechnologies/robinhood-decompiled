package com.robinhood.android.cash.disputes.p070ui.question.decimal;

import com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader;
import com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader2;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationResult;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationState;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationState2;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.models.p355ui.DisputeQuestionnaire;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DecimalAmountQuestionViewState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0017\u001a\u00020\u0004HÂ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003J\t\u0010\u0019\u001a\u00020\tHÂ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010$\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010%R\u0012\u0010'\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0014\u0010(\u001a\u0004\u0018\u00010#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0012\u0010+\u001a\u00020#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/decimal/DecimalAmountQuestionViewState;", "Lcom/robinhood/android/cash/disputes/ui/question/QuestionDisplayHeader;", "Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationState;", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;", "selectedTransactions", "", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "isValidationRequestLoading", "", "amountPreFillEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/models/util/Money;", "validationResultEvent", "Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationResult;", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;Ljava/util/List;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getAmountPreFillEvent", "()Lcom/robinhood/udf/UiEvent;", "getValidationResultEvent", "inputHintAmount", "getInputHintAmount", "()Lcom/robinhood/models/util/Money;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "isContinueButtonLoading", "()Z", "isSkipButtonEnabled", "isSubtitleVisible", "subtitleText", "getSubtitleText", "()Ljava/lang/String;", "titleText", "getTitleText", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DecimalAmountQuestionViewState implements QuestionDisplayHeader, ResponseValidationState {
    public static final int $stable = 8;
    private final /* synthetic */ QuestionDisplayHeader2 $$delegate_0;
    private final /* synthetic */ ResponseValidationState2 $$delegate_1;
    private final UiEvent<Money> amountPreFillEvent;
    private final boolean isValidationRequestLoading;
    private final DisputeQuestionnaire.Question.UserInput question;
    private final List<SettledCardTransaction> selectedTransactions;
    private final UiEvent<ResponseValidationResult> validationResultEvent;

    /* renamed from: component1, reason: from getter */
    private final DisputeQuestionnaire.Question.UserInput getQuestion() {
        return this.question;
    }

    private final List<SettledCardTransaction> component2() {
        return this.selectedTransactions;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getIsValidationRequestLoading() {
        return this.isValidationRequestLoading;
    }

    public static /* synthetic */ DecimalAmountQuestionViewState copy$default(DecimalAmountQuestionViewState decimalAmountQuestionViewState, DisputeQuestionnaire.Question.UserInput userInput, List list, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            userInput = decimalAmountQuestionViewState.question;
        }
        if ((i & 2) != 0) {
            list = decimalAmountQuestionViewState.selectedTransactions;
        }
        if ((i & 4) != 0) {
            z = decimalAmountQuestionViewState.isValidationRequestLoading;
        }
        if ((i & 8) != 0) {
            uiEvent = decimalAmountQuestionViewState.amountPreFillEvent;
        }
        if ((i & 16) != 0) {
            uiEvent2 = decimalAmountQuestionViewState.validationResultEvent;
        }
        UiEvent uiEvent3 = uiEvent2;
        boolean z2 = z;
        return decimalAmountQuestionViewState.copy(userInput, list, z2, uiEvent, uiEvent3);
    }

    public final UiEvent<Money> component4() {
        return this.amountPreFillEvent;
    }

    public final UiEvent<ResponseValidationResult> component5() {
        return this.validationResultEvent;
    }

    public final DecimalAmountQuestionViewState copy(DisputeQuestionnaire.Question.UserInput question, List<SettledCardTransaction> selectedTransactions, boolean isValidationRequestLoading, UiEvent<Money> amountPreFillEvent, UiEvent<ResponseValidationResult> validationResultEvent) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(selectedTransactions, "selectedTransactions");
        return new DecimalAmountQuestionViewState(question, selectedTransactions, isValidationRequestLoading, amountPreFillEvent, validationResultEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecimalAmountQuestionViewState)) {
            return false;
        }
        DecimalAmountQuestionViewState decimalAmountQuestionViewState = (DecimalAmountQuestionViewState) other;
        return Intrinsics.areEqual(this.question, decimalAmountQuestionViewState.question) && Intrinsics.areEqual(this.selectedTransactions, decimalAmountQuestionViewState.selectedTransactions) && this.isValidationRequestLoading == decimalAmountQuestionViewState.isValidationRequestLoading && Intrinsics.areEqual(this.amountPreFillEvent, decimalAmountQuestionViewState.amountPreFillEvent) && Intrinsics.areEqual(this.validationResultEvent, decimalAmountQuestionViewState.validationResultEvent);
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
        int iHashCode = ((((this.question.hashCode() * 31) + this.selectedTransactions.hashCode()) * 31) + Boolean.hashCode(this.isValidationRequestLoading)) * 31;
        UiEvent<Money> uiEvent = this.amountPreFillEvent;
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
        return "DecimalAmountQuestionViewState(question=" + this.question + ", selectedTransactions=" + this.selectedTransactions + ", isValidationRequestLoading=" + this.isValidationRequestLoading + ", amountPreFillEvent=" + this.amountPreFillEvent + ", validationResultEvent=" + this.validationResultEvent + ")";
    }

    public DecimalAmountQuestionViewState(DisputeQuestionnaire.Question.UserInput question, List<SettledCardTransaction> selectedTransactions, boolean z, UiEvent<Money> uiEvent, UiEvent<ResponseValidationResult> uiEvent2) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(selectedTransactions, "selectedTransactions");
        this.$$delegate_0 = new QuestionDisplayHeader2(question);
        this.$$delegate_1 = new ResponseValidationState2(z);
        this.question = question;
        this.selectedTransactions = selectedTransactions;
        this.isValidationRequestLoading = z;
        this.amountPreFillEvent = uiEvent;
        this.validationResultEvent = uiEvent2;
    }

    public /* synthetic */ DecimalAmountQuestionViewState(DisputeQuestionnaire.Question.UserInput userInput, List list, boolean z, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userInput, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? null : uiEvent2);
    }

    public final UiEvent<Money> getAmountPreFillEvent() {
        return this.amountPreFillEvent;
    }

    public final UiEvent<ResponseValidationResult> getValidationResultEvent() {
        return this.validationResultEvent;
    }

    public final Money getInputHintAmount() {
        if (this.selectedTransactions.size() == 1) {
            return ((SettledCardTransaction) CollectionsKt.first((List) this.selectedTransactions)).getAdjustment().getAmount();
        }
        return null;
    }
}

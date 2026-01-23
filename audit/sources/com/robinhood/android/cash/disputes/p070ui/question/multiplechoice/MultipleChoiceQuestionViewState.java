package com.robinhood.android.cash.disputes.p070ui.question.multiplechoice;

import com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader;
import com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader2;
import com.robinhood.models.p355ui.DisputeQuestionnaire;
import com.robinhood.udf.UiEvent;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultipleChoiceQuestionViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u001a\u001a\u00020\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/multiplechoice/MultipleChoiceQuestionViewState;", "Lcom/robinhood/android/cash/disputes/ui/question/QuestionDisplayHeader;", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$MultipleChoiceInput;", "choicePreFillEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$MultipleChoiceInput;Lcom/robinhood/udf/UiEvent;)V", "getChoicePreFillEvent", "()Lcom/robinhood/udf/UiEvent;", InquiryField.ChoicesField.TYPE, "", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$MultipleChoiceInput$Choice;", "getChoices", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "isSubtitleVisible", "()Z", "subtitleText", "getSubtitleText", "()Ljava/lang/String;", "titleText", "getTitleText", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MultipleChoiceQuestionViewState implements QuestionDisplayHeader {
    public static final int $stable = 8;
    private final /* synthetic */ QuestionDisplayHeader2 $$delegate_0;
    private final UiEvent<Integer> choicePreFillEvent;
    private final DisputeQuestionnaire.Question.MultipleChoiceInput question;

    /* renamed from: component1, reason: from getter */
    private final DisputeQuestionnaire.Question.MultipleChoiceInput getQuestion() {
        return this.question;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultipleChoiceQuestionViewState copy$default(MultipleChoiceQuestionViewState multipleChoiceQuestionViewState, DisputeQuestionnaire.Question.MultipleChoiceInput multipleChoiceInput, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            multipleChoiceInput = multipleChoiceQuestionViewState.question;
        }
        if ((i & 2) != 0) {
            uiEvent = multipleChoiceQuestionViewState.choicePreFillEvent;
        }
        return multipleChoiceQuestionViewState.copy(multipleChoiceInput, uiEvent);
    }

    public final UiEvent<Integer> component2() {
        return this.choicePreFillEvent;
    }

    public final MultipleChoiceQuestionViewState copy(DisputeQuestionnaire.Question.MultipleChoiceInput question, UiEvent<Integer> choicePreFillEvent) {
        Intrinsics.checkNotNullParameter(question, "question");
        return new MultipleChoiceQuestionViewState(question, choicePreFillEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultipleChoiceQuestionViewState)) {
            return false;
        }
        MultipleChoiceQuestionViewState multipleChoiceQuestionViewState = (MultipleChoiceQuestionViewState) other;
        return Intrinsics.areEqual(this.question, multipleChoiceQuestionViewState.question) && Intrinsics.areEqual(this.choicePreFillEvent, multipleChoiceQuestionViewState.choicePreFillEvent);
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
        UiEvent<Integer> uiEvent = this.choicePreFillEvent;
        return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
    }

    @Override // com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader
    public boolean isSubtitleVisible() {
        return this.$$delegate_0.isSubtitleVisible();
    }

    public String toString() {
        return "MultipleChoiceQuestionViewState(question=" + this.question + ", choicePreFillEvent=" + this.choicePreFillEvent + ")";
    }

    public MultipleChoiceQuestionViewState(DisputeQuestionnaire.Question.MultipleChoiceInput question, UiEvent<Integer> uiEvent) {
        Intrinsics.checkNotNullParameter(question, "question");
        this.$$delegate_0 = new QuestionDisplayHeader2(question);
        this.question = question;
        this.choicePreFillEvent = uiEvent;
    }

    public /* synthetic */ MultipleChoiceQuestionViewState(DisputeQuestionnaire.Question.MultipleChoiceInput multipleChoiceInput, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(multipleChoiceInput, (i & 2) != 0 ? null : uiEvent);
    }

    public final UiEvent<Integer> getChoicePreFillEvent() {
        return this.choicePreFillEvent;
    }

    public final List<DisputeQuestionnaire.Question.MultipleChoiceInput.Choice> getChoices() {
        return this.question.getChoices();
    }
}

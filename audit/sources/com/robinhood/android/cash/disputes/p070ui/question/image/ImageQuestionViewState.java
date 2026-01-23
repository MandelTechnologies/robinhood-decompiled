package com.robinhood.android.cash.disputes.p070ui.question.image;

import com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader;
import com.robinhood.android.cash.disputes.p070ui.question.QuestionDisplayHeader2;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationResult;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationState;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationState2;
import com.robinhood.models.p355ui.DisputeQuestionnaire;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageQuestionViewState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u0000 52\u00020\u00012\u00020\u0002:\u000245BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0004HÂ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003J\t\u0010\u001f\u001a\u00020\tHÂ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0002\u0010!J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003Jb\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\rHÖ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010,\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u0012\u0010-\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010\u0017R\u0012\u0010.\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010\u0017R\u0014\u0010/\u001a\u0004\u0018\u00010\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u0012\u00102\u001a\u00020\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00101¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionViewState;", "Lcom/robinhood/android/cash/disputes/ui/question/QuestionDisplayHeader;", "Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationState;", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;", "selectedFiles", "", "Lcom/robinhood/android/cash/disputes/ui/question/image/FileSelectionItem;", "isValidationRequestLoading", "", "isTextInputBlank", "textPreFillEvent", "Lcom/robinhood/udf/UiEvent;", "", "validationResultEvent", "Lcom/robinhood/android/cash/disputes/ui/question/ResponseValidationResult;", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;Ljava/util/List;ZLjava/lang/Boolean;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "Ljava/lang/Boolean;", "getTextPreFillEvent", "()Lcom/robinhood/udf/UiEvent;", "getValidationResultEvent", "isRecyclerViewInvisible", "()Z", "isContinueButtonEnabled", "uploadButtonAction", "Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionViewState$UploadButtonAction;", "getUploadButtonAction", "()Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionViewState$UploadButtonAction;", "component1", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "copy", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$UserInput;Ljava/util/List;ZLjava/lang/Boolean;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionViewState;", "equals", "other", "", "hashCode", "", "toString", "isContinueButtonLoading", "isSkipButtonEnabled", "isSubtitleVisible", "subtitleText", "getSubtitleText", "()Ljava/lang/String;", "titleText", "getTitleText", "UploadButtonAction", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ImageQuestionViewState implements QuestionDisplayHeader, ResponseValidationState {
    public static final int MAX_FILES = 5;
    private final /* synthetic */ QuestionDisplayHeader2 $$delegate_0;
    private final /* synthetic */ ResponseValidationState2 $$delegate_1;
    private final Boolean isTextInputBlank;
    private final boolean isValidationRequestLoading;
    private final DisputeQuestionnaire.Question.UserInput question;
    private final List<FileSelectionItem> selectedFiles;
    private final UiEvent<String> textPreFillEvent;
    private final UiEvent<ResponseValidationResult> validationResultEvent;
    public static final int $stable = 8;

    /* renamed from: component1, reason: from getter */
    private final DisputeQuestionnaire.Question.UserInput getQuestion() {
        return this.question;
    }

    private final List<FileSelectionItem> component2() {
        return this.selectedFiles;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getIsValidationRequestLoading() {
        return this.isValidationRequestLoading;
    }

    /* renamed from: component4, reason: from getter */
    private final Boolean getIsTextInputBlank() {
        return this.isTextInputBlank;
    }

    public static /* synthetic */ ImageQuestionViewState copy$default(ImageQuestionViewState imageQuestionViewState, DisputeQuestionnaire.Question.UserInput userInput, List list, boolean z, Boolean bool, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            userInput = imageQuestionViewState.question;
        }
        if ((i & 2) != 0) {
            list = imageQuestionViewState.selectedFiles;
        }
        if ((i & 4) != 0) {
            z = imageQuestionViewState.isValidationRequestLoading;
        }
        if ((i & 8) != 0) {
            bool = imageQuestionViewState.isTextInputBlank;
        }
        if ((i & 16) != 0) {
            uiEvent = imageQuestionViewState.textPreFillEvent;
        }
        if ((i & 32) != 0) {
            uiEvent2 = imageQuestionViewState.validationResultEvent;
        }
        UiEvent uiEvent3 = uiEvent;
        UiEvent uiEvent4 = uiEvent2;
        return imageQuestionViewState.copy(userInput, list, z, bool, uiEvent3, uiEvent4);
    }

    public final UiEvent<String> component5() {
        return this.textPreFillEvent;
    }

    public final UiEvent<ResponseValidationResult> component6() {
        return this.validationResultEvent;
    }

    public final ImageQuestionViewState copy(DisputeQuestionnaire.Question.UserInput question, List<FileSelectionItem> selectedFiles, boolean isValidationRequestLoading, Boolean isTextInputBlank, UiEvent<String> textPreFillEvent, UiEvent<ResponseValidationResult> validationResultEvent) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(selectedFiles, "selectedFiles");
        return new ImageQuestionViewState(question, selectedFiles, isValidationRequestLoading, isTextInputBlank, textPreFillEvent, validationResultEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageQuestionViewState)) {
            return false;
        }
        ImageQuestionViewState imageQuestionViewState = (ImageQuestionViewState) other;
        return Intrinsics.areEqual(this.question, imageQuestionViewState.question) && Intrinsics.areEqual(this.selectedFiles, imageQuestionViewState.selectedFiles) && this.isValidationRequestLoading == imageQuestionViewState.isValidationRequestLoading && Intrinsics.areEqual(this.isTextInputBlank, imageQuestionViewState.isTextInputBlank) && Intrinsics.areEqual(this.textPreFillEvent, imageQuestionViewState.textPreFillEvent) && Intrinsics.areEqual(this.validationResultEvent, imageQuestionViewState.validationResultEvent);
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
        int iHashCode = ((((this.question.hashCode() * 31) + this.selectedFiles.hashCode()) * 31) + Boolean.hashCode(this.isValidationRequestLoading)) * 31;
        Boolean bool = this.isTextInputBlank;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        UiEvent<String> uiEvent = this.textPreFillEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<ResponseValidationResult> uiEvent2 = this.validationResultEvent;
        return iHashCode3 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
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
        return "ImageQuestionViewState(question=" + this.question + ", selectedFiles=" + this.selectedFiles + ", isValidationRequestLoading=" + this.isValidationRequestLoading + ", isTextInputBlank=" + this.isTextInputBlank + ", textPreFillEvent=" + this.textPreFillEvent + ", validationResultEvent=" + this.validationResultEvent + ")";
    }

    public ImageQuestionViewState(DisputeQuestionnaire.Question.UserInput question, List<FileSelectionItem> selectedFiles, boolean z, Boolean bool, UiEvent<String> uiEvent, UiEvent<ResponseValidationResult> uiEvent2) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(selectedFiles, "selectedFiles");
        this.$$delegate_0 = new QuestionDisplayHeader2(question);
        this.$$delegate_1 = new ResponseValidationState2(z);
        this.question = question;
        this.selectedFiles = selectedFiles;
        this.isValidationRequestLoading = z;
        this.isTextInputBlank = bool;
        this.textPreFillEvent = uiEvent;
        this.validationResultEvent = uiEvent2;
    }

    public /* synthetic */ ImageQuestionViewState(DisputeQuestionnaire.Question.UserInput userInput, List list, boolean z, Boolean bool, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userInput, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : uiEvent, (i & 32) != 0 ? null : uiEvent2);
    }

    public final UiEvent<String> getTextPreFillEvent() {
        return this.textPreFillEvent;
    }

    public final UiEvent<ResponseValidationResult> getValidationResultEvent() {
        return this.validationResultEvent;
    }

    public final boolean isRecyclerViewInvisible() {
        return this.selectedFiles.isEmpty();
    }

    public final boolean isContinueButtonEnabled() {
        return Intrinsics.areEqual(this.isTextInputBlank, Boolean.FALSE) || !this.selectedFiles.isEmpty();
    }

    public final UploadButtonAction getUploadButtonAction() {
        if (this.selectedFiles.size() < 5) {
            return UploadButtonAction.FILE_SELECTION;
        }
        return UploadButtonAction.MAX_FILES_REACHED;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageQuestionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionViewState$UploadButtonAction;", "", "<init>", "(Ljava/lang/String;I)V", "FILE_SELECTION", "MAX_FILES_REACHED", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UploadButtonAction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UploadButtonAction[] $VALUES;
        public static final UploadButtonAction FILE_SELECTION = new UploadButtonAction("FILE_SELECTION", 0);
        public static final UploadButtonAction MAX_FILES_REACHED = new UploadButtonAction("MAX_FILES_REACHED", 1);

        private static final /* synthetic */ UploadButtonAction[] $values() {
            return new UploadButtonAction[]{FILE_SELECTION, MAX_FILES_REACHED};
        }

        public static EnumEntries<UploadButtonAction> getEntries() {
            return $ENTRIES;
        }

        private UploadButtonAction(String str, int i) {
        }

        static {
            UploadButtonAction[] uploadButtonActionArr$values = $values();
            $VALUES = uploadButtonActionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(uploadButtonActionArr$values);
        }

        public static UploadButtonAction valueOf(String str) {
            return (UploadButtonAction) Enum.valueOf(UploadButtonAction.class, str);
        }

        public static UploadButtonAction[] values() {
            return (UploadButtonAction[]) $VALUES.clone();
        }
    }
}

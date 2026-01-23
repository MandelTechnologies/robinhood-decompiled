package com.robinhood.android.investorprofile.p162ui.questionnaire.integerquestion;

import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: QuestionnaireIntegerQuestionDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionDataState;", "", "defaultValue", "", "inputString", "integerQuestion", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$IntegerQuestion;", "thresholdValueAlert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$IntegerQuestion;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getDefaultValue", "()Ljava/lang/String;", "getInputString", "getIntegerQuestion", "()Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$IntegerQuestion;", "getThresholdValueAlert", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "showResetDefaultButton", "", "getShowResetDefaultButton", "()Z", "ctaEnabled", "getCtaEnabled", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class QuestionnaireIntegerQuestionDataState {
    private final String defaultValue;
    private final String inputString;
    private final UiQuestionnaireQuestion.IntegerQuestion integerQuestion;
    private final GenericAlertContent<GenericAction> thresholdValueAlert;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionnaireIntegerQuestionDataState copy$default(QuestionnaireIntegerQuestionDataState questionnaireIntegerQuestionDataState, String str, String str2, UiQuestionnaireQuestion.IntegerQuestion integerQuestion, GenericAlertContent genericAlertContent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionnaireIntegerQuestionDataState.defaultValue;
        }
        if ((i & 2) != 0) {
            str2 = questionnaireIntegerQuestionDataState.inputString;
        }
        if ((i & 4) != 0) {
            integerQuestion = questionnaireIntegerQuestionDataState.integerQuestion;
        }
        if ((i & 8) != 0) {
            genericAlertContent = questionnaireIntegerQuestionDataState.thresholdValueAlert;
        }
        return questionnaireIntegerQuestionDataState.copy(str, str2, integerQuestion, genericAlertContent);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInputString() {
        return this.inputString;
    }

    /* renamed from: component3, reason: from getter */
    public final UiQuestionnaireQuestion.IntegerQuestion getIntegerQuestion() {
        return this.integerQuestion;
    }

    public final GenericAlertContent<GenericAction> component4() {
        return this.thresholdValueAlert;
    }

    public final QuestionnaireIntegerQuestionDataState copy(String defaultValue, String inputString, UiQuestionnaireQuestion.IntegerQuestion integerQuestion, GenericAlertContent<? extends GenericAction> thresholdValueAlert) {
        Intrinsics.checkNotNullParameter(inputString, "inputString");
        Intrinsics.checkNotNullParameter(integerQuestion, "integerQuestion");
        return new QuestionnaireIntegerQuestionDataState(defaultValue, inputString, integerQuestion, thresholdValueAlert);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionnaireIntegerQuestionDataState)) {
            return false;
        }
        QuestionnaireIntegerQuestionDataState questionnaireIntegerQuestionDataState = (QuestionnaireIntegerQuestionDataState) other;
        return Intrinsics.areEqual(this.defaultValue, questionnaireIntegerQuestionDataState.defaultValue) && Intrinsics.areEqual(this.inputString, questionnaireIntegerQuestionDataState.inputString) && Intrinsics.areEqual(this.integerQuestion, questionnaireIntegerQuestionDataState.integerQuestion) && Intrinsics.areEqual(this.thresholdValueAlert, questionnaireIntegerQuestionDataState.thresholdValueAlert);
    }

    public int hashCode() {
        String str = this.defaultValue;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.inputString.hashCode()) * 31) + this.integerQuestion.hashCode()) * 31;
        GenericAlertContent<GenericAction> genericAlertContent = this.thresholdValueAlert;
        return iHashCode + (genericAlertContent != null ? genericAlertContent.hashCode() : 0);
    }

    public String toString() {
        return "QuestionnaireIntegerQuestionDataState(defaultValue=" + this.defaultValue + ", inputString=" + this.inputString + ", integerQuestion=" + this.integerQuestion + ", thresholdValueAlert=" + this.thresholdValueAlert + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionnaireIntegerQuestionDataState(String str, String inputString, UiQuestionnaireQuestion.IntegerQuestion integerQuestion, GenericAlertContent<? extends GenericAction> genericAlertContent) {
        Intrinsics.checkNotNullParameter(inputString, "inputString");
        Intrinsics.checkNotNullParameter(integerQuestion, "integerQuestion");
        this.defaultValue = str;
        this.inputString = inputString;
        this.integerQuestion = integerQuestion;
        this.thresholdValueAlert = genericAlertContent;
    }

    public /* synthetic */ QuestionnaireIntegerQuestionDataState(String str, String str2, UiQuestionnaireQuestion.IntegerQuestion integerQuestion, GenericAlertContent genericAlertContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, integerQuestion, (i & 8) != 0 ? null : genericAlertContent);
    }

    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final String getInputString() {
        return this.inputString;
    }

    public final UiQuestionnaireQuestion.IntegerQuestion getIntegerQuestion() {
        return this.integerQuestion;
    }

    public final GenericAlertContent<GenericAction> getThresholdValueAlert() {
        return this.thresholdValueAlert;
    }

    public final boolean getShowResetDefaultButton() {
        if (this.defaultValue != null) {
            return !Intrinsics.areEqual(r0, this.inputString);
        }
        return false;
    }

    public final boolean getCtaEnabled() {
        return this.inputString.length() > 0;
    }

    /* compiled from: QuestionnaireIntegerQuestionDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionDataState;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionViewState;", "<init>", "()V", "reduce", "dataState", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<QuestionnaireIntegerQuestionDataState, QuestionnaireIntegerQuestionViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public QuestionnaireIntegerQuestionViewState reduce(QuestionnaireIntegerQuestionDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            return new QuestionnaireIntegerQuestionViewState(dataState.getInputString(), dataState.getShowResetDefaultButton(), dataState.getCtaEnabled(), dataState.getIntegerQuestion().getTitle(), dataState.getIntegerQuestion().getSubtitle(), dataState.getIntegerQuestion().getContent().getPlaceholder(), dataState.getIntegerQuestion().getDisclosureMarkdown(), dataState.getThresholdValueAlert());
        }
    }
}

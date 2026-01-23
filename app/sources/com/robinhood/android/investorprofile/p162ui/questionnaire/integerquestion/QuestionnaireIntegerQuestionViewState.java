package com.robinhood.android.investorprofile.p162ui.questionnaire.integerquestion;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireIntegerQuestionViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionViewState;", "", "inputString", "", "showResetDefaultButton", "", "ctaEnabled", "title", "subtitle", "inputPlaceholder", "disclosureMarkdown", "thresholdValueAlert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "getInputString", "()Ljava/lang/String;", "getShowResetDefaultButton", "()Z", "getCtaEnabled", "getTitle", "getSubtitle", "getInputPlaceholder", "getDisclosureMarkdown", "getThresholdValueAlert", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class QuestionnaireIntegerQuestionViewState {
    public static final int $stable = 8;
    private final boolean ctaEnabled;
    private final String disclosureMarkdown;
    private final String inputPlaceholder;
    private final String inputString;
    private final boolean showResetDefaultButton;
    private final String subtitle;
    private final GenericAlertContent<GenericAction> thresholdValueAlert;
    private final String title;

    public static /* synthetic */ QuestionnaireIntegerQuestionViewState copy$default(QuestionnaireIntegerQuestionViewState questionnaireIntegerQuestionViewState, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, GenericAlertContent genericAlertContent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionnaireIntegerQuestionViewState.inputString;
        }
        if ((i & 2) != 0) {
            z = questionnaireIntegerQuestionViewState.showResetDefaultButton;
        }
        if ((i & 4) != 0) {
            z2 = questionnaireIntegerQuestionViewState.ctaEnabled;
        }
        if ((i & 8) != 0) {
            str2 = questionnaireIntegerQuestionViewState.title;
        }
        if ((i & 16) != 0) {
            str3 = questionnaireIntegerQuestionViewState.subtitle;
        }
        if ((i & 32) != 0) {
            str4 = questionnaireIntegerQuestionViewState.inputPlaceholder;
        }
        if ((i & 64) != 0) {
            str5 = questionnaireIntegerQuestionViewState.disclosureMarkdown;
        }
        if ((i & 128) != 0) {
            genericAlertContent = questionnaireIntegerQuestionViewState.thresholdValueAlert;
        }
        String str6 = str5;
        GenericAlertContent genericAlertContent2 = genericAlertContent;
        String str7 = str3;
        String str8 = str4;
        return questionnaireIntegerQuestionViewState.copy(str, z, z2, str2, str7, str8, str6, genericAlertContent2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInputString() {
        return this.inputString;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowResetDefaultButton() {
        return this.showResetDefaultButton;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCtaEnabled() {
        return this.ctaEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInputPlaceholder() {
        return this.inputPlaceholder;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final GenericAlertContent<GenericAction> component8() {
        return this.thresholdValueAlert;
    }

    public final QuestionnaireIntegerQuestionViewState copy(String inputString, boolean showResetDefaultButton, boolean ctaEnabled, String title, String subtitle, String inputPlaceholder, String disclosureMarkdown, GenericAlertContent<? extends GenericAction> thresholdValueAlert) {
        Intrinsics.checkNotNullParameter(inputString, "inputString");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(inputPlaceholder, "inputPlaceholder");
        return new QuestionnaireIntegerQuestionViewState(inputString, showResetDefaultButton, ctaEnabled, title, subtitle, inputPlaceholder, disclosureMarkdown, thresholdValueAlert);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionnaireIntegerQuestionViewState)) {
            return false;
        }
        QuestionnaireIntegerQuestionViewState questionnaireIntegerQuestionViewState = (QuestionnaireIntegerQuestionViewState) other;
        return Intrinsics.areEqual(this.inputString, questionnaireIntegerQuestionViewState.inputString) && this.showResetDefaultButton == questionnaireIntegerQuestionViewState.showResetDefaultButton && this.ctaEnabled == questionnaireIntegerQuestionViewState.ctaEnabled && Intrinsics.areEqual(this.title, questionnaireIntegerQuestionViewState.title) && Intrinsics.areEqual(this.subtitle, questionnaireIntegerQuestionViewState.subtitle) && Intrinsics.areEqual(this.inputPlaceholder, questionnaireIntegerQuestionViewState.inputPlaceholder) && Intrinsics.areEqual(this.disclosureMarkdown, questionnaireIntegerQuestionViewState.disclosureMarkdown) && Intrinsics.areEqual(this.thresholdValueAlert, questionnaireIntegerQuestionViewState.thresholdValueAlert);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.inputString.hashCode() * 31) + Boolean.hashCode(this.showResetDefaultButton)) * 31) + Boolean.hashCode(this.ctaEnabled)) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.inputPlaceholder.hashCode()) * 31;
        String str = this.disclosureMarkdown;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        GenericAlertContent<GenericAction> genericAlertContent = this.thresholdValueAlert;
        return iHashCode2 + (genericAlertContent != null ? genericAlertContent.hashCode() : 0);
    }

    public String toString() {
        return "QuestionnaireIntegerQuestionViewState(inputString=" + this.inputString + ", showResetDefaultButton=" + this.showResetDefaultButton + ", ctaEnabled=" + this.ctaEnabled + ", title=" + this.title + ", subtitle=" + this.subtitle + ", inputPlaceholder=" + this.inputPlaceholder + ", disclosureMarkdown=" + this.disclosureMarkdown + ", thresholdValueAlert=" + this.thresholdValueAlert + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionnaireIntegerQuestionViewState(String inputString, boolean z, boolean z2, String title, String subtitle, String inputPlaceholder, String str, GenericAlertContent<? extends GenericAction> genericAlertContent) {
        Intrinsics.checkNotNullParameter(inputString, "inputString");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(inputPlaceholder, "inputPlaceholder");
        this.inputString = inputString;
        this.showResetDefaultButton = z;
        this.ctaEnabled = z2;
        this.title = title;
        this.subtitle = subtitle;
        this.inputPlaceholder = inputPlaceholder;
        this.disclosureMarkdown = str;
        this.thresholdValueAlert = genericAlertContent;
    }

    public final String getInputString() {
        return this.inputString;
    }

    public final boolean getShowResetDefaultButton() {
        return this.showResetDefaultButton;
    }

    public final boolean getCtaEnabled() {
        return this.ctaEnabled;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getInputPlaceholder() {
        return this.inputPlaceholder;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final GenericAlertContent<GenericAction> getThresholdValueAlert() {
        return this.thresholdValueAlert;
    }
}

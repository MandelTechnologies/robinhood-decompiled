package com.robinhood.android.optionsupgrade;

import com.robinhood.android.doc.p109ui.photo.DocUploadReviewPdfFragment;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingDisclosureStates.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureViewState;", "", InstantRetirementAgreementComponents.MarkdownTag, "", "disclosureLoading", "", "buttonLoading", DocUploadReviewPdfFragment.ERROR_DIALOG_TAG, "Lcom/robinhood/android/optionsupgrade/ErrorDialogType;", "<init>", "(Ljava/lang/String;ZZLcom/robinhood/android/optionsupgrade/ErrorDialogType;)V", "getMarkdown", "()Ljava/lang/String;", "getDisclosureLoading", "()Z", "getButtonLoading", "getErrorDialog", "()Lcom/robinhood/android/optionsupgrade/ErrorDialogType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOnboardingDisclosureViewState {
    public static final int $stable = 0;
    private final boolean buttonLoading;
    private final boolean disclosureLoading;
    private final OptionOnboardingDisclosureStates errorDialog;
    private final String markdown;

    public static /* synthetic */ OptionOnboardingDisclosureViewState copy$default(OptionOnboardingDisclosureViewState optionOnboardingDisclosureViewState, String str, boolean z, boolean z2, OptionOnboardingDisclosureStates optionOnboardingDisclosureStates, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionOnboardingDisclosureViewState.markdown;
        }
        if ((i & 2) != 0) {
            z = optionOnboardingDisclosureViewState.disclosureLoading;
        }
        if ((i & 4) != 0) {
            z2 = optionOnboardingDisclosureViewState.buttonLoading;
        }
        if ((i & 8) != 0) {
            optionOnboardingDisclosureStates = optionOnboardingDisclosureViewState.errorDialog;
        }
        return optionOnboardingDisclosureViewState.copy(str, z, z2, optionOnboardingDisclosureStates);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMarkdown() {
        return this.markdown;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDisclosureLoading() {
        return this.disclosureLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getButtonLoading() {
        return this.buttonLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionOnboardingDisclosureStates getErrorDialog() {
        return this.errorDialog;
    }

    public final OptionOnboardingDisclosureViewState copy(String markdown, boolean disclosureLoading, boolean buttonLoading, OptionOnboardingDisclosureStates errorDialog) {
        Intrinsics.checkNotNullParameter(errorDialog, "errorDialog");
        return new OptionOnboardingDisclosureViewState(markdown, disclosureLoading, buttonLoading, errorDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOnboardingDisclosureViewState)) {
            return false;
        }
        OptionOnboardingDisclosureViewState optionOnboardingDisclosureViewState = (OptionOnboardingDisclosureViewState) other;
        return Intrinsics.areEqual(this.markdown, optionOnboardingDisclosureViewState.markdown) && this.disclosureLoading == optionOnboardingDisclosureViewState.disclosureLoading && this.buttonLoading == optionOnboardingDisclosureViewState.buttonLoading && this.errorDialog == optionOnboardingDisclosureViewState.errorDialog;
    }

    public int hashCode() {
        String str = this.markdown;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.disclosureLoading)) * 31) + Boolean.hashCode(this.buttonLoading)) * 31) + this.errorDialog.hashCode();
    }

    public String toString() {
        return "OptionOnboardingDisclosureViewState(markdown=" + this.markdown + ", disclosureLoading=" + this.disclosureLoading + ", buttonLoading=" + this.buttonLoading + ", errorDialog=" + this.errorDialog + ")";
    }

    public OptionOnboardingDisclosureViewState(String str, boolean z, boolean z2, OptionOnboardingDisclosureStates errorDialog) {
        Intrinsics.checkNotNullParameter(errorDialog, "errorDialog");
        this.markdown = str;
        this.disclosureLoading = z;
        this.buttonLoading = z2;
        this.errorDialog = errorDialog;
    }

    public final String getMarkdown() {
        return this.markdown;
    }

    public final boolean getDisclosureLoading() {
        return this.disclosureLoading;
    }

    public final boolean getButtonLoading() {
        return this.buttonLoading;
    }

    public final OptionOnboardingDisclosureStates getErrorDialog() {
        return this.errorDialog;
    }
}

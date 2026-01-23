package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;

/* compiled from: OptionOnboardingQuestionProfessionalTraderComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingQuestionProfessionalTraderViewState;", "", "questionResId", "", "isNoButtonLoading", "", "isYesButtonLoading", "<init>", "(IZZ)V", "getQuestionResId", "()I", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOnboardingQuestionProfessionalTraderViewState {
    public static final int $stable = 0;
    private final boolean isNoButtonLoading;
    private final boolean isYesButtonLoading;
    private final int questionResId;

    public static /* synthetic */ OptionOnboardingQuestionProfessionalTraderViewState copy$default(OptionOnboardingQuestionProfessionalTraderViewState optionOnboardingQuestionProfessionalTraderViewState, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = optionOnboardingQuestionProfessionalTraderViewState.questionResId;
        }
        if ((i2 & 2) != 0) {
            z = optionOnboardingQuestionProfessionalTraderViewState.isNoButtonLoading;
        }
        if ((i2 & 4) != 0) {
            z2 = optionOnboardingQuestionProfessionalTraderViewState.isYesButtonLoading;
        }
        return optionOnboardingQuestionProfessionalTraderViewState.copy(i, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getQuestionResId() {
        return this.questionResId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsNoButtonLoading() {
        return this.isNoButtonLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsYesButtonLoading() {
        return this.isYesButtonLoading;
    }

    public final OptionOnboardingQuestionProfessionalTraderViewState copy(int questionResId, boolean isNoButtonLoading, boolean isYesButtonLoading) {
        return new OptionOnboardingQuestionProfessionalTraderViewState(questionResId, isNoButtonLoading, isYesButtonLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOnboardingQuestionProfessionalTraderViewState)) {
            return false;
        }
        OptionOnboardingQuestionProfessionalTraderViewState optionOnboardingQuestionProfessionalTraderViewState = (OptionOnboardingQuestionProfessionalTraderViewState) other;
        return this.questionResId == optionOnboardingQuestionProfessionalTraderViewState.questionResId && this.isNoButtonLoading == optionOnboardingQuestionProfessionalTraderViewState.isNoButtonLoading && this.isYesButtonLoading == optionOnboardingQuestionProfessionalTraderViewState.isYesButtonLoading;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.questionResId) * 31) + Boolean.hashCode(this.isNoButtonLoading)) * 31) + Boolean.hashCode(this.isYesButtonLoading);
    }

    public String toString() {
        return "OptionOnboardingQuestionProfessionalTraderViewState(questionResId=" + this.questionResId + ", isNoButtonLoading=" + this.isNoButtonLoading + ", isYesButtonLoading=" + this.isYesButtonLoading + ")";
    }

    public OptionOnboardingQuestionProfessionalTraderViewState(int i, boolean z, boolean z2) {
        this.questionResId = i;
        this.isNoButtonLoading = z;
        this.isYesButtonLoading = z2;
    }

    public final int getQuestionResId() {
        return this.questionResId;
    }

    public final boolean isNoButtonLoading() {
        return this.isNoButtonLoading;
    }

    public final boolean isYesButtonLoading() {
        return this.isYesButtonLoading;
    }
}

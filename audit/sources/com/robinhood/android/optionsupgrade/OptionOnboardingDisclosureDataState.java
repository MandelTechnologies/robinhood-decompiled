package com.robinhood.android.optionsupgrade;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingDisclosureStates.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureDataState;", "", "agreementLoadingState", "Lcom/robinhood/android/optionsupgrade/LoadingState;", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "signingLoadingState", "", "loadingNextScreens", "", "<init>", "(Lcom/robinhood/android/optionsupgrade/LoadingState;Lcom/robinhood/android/optionsupgrade/LoadingState;Z)V", "getAgreementLoadingState", "()Lcom/robinhood/android/optionsupgrade/LoadingState;", "getSigningLoadingState", "getLoadingNextScreens", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionOnboardingDisclosureDataState {
    public static final int $stable = 0;
    private final OptionOnboardingDisclosureStates2<UiAgreementWithContent> agreementLoadingState;
    private final boolean loadingNextScreens;
    private final OptionOnboardingDisclosureStates2<Unit> signingLoadingState;

    public OptionOnboardingDisclosureDataState() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionOnboardingDisclosureDataState copy$default(OptionOnboardingDisclosureDataState optionOnboardingDisclosureDataState, OptionOnboardingDisclosureStates2 optionOnboardingDisclosureStates2, OptionOnboardingDisclosureStates2 optionOnboardingDisclosureStates22, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            optionOnboardingDisclosureStates2 = optionOnboardingDisclosureDataState.agreementLoadingState;
        }
        if ((i & 2) != 0) {
            optionOnboardingDisclosureStates22 = optionOnboardingDisclosureDataState.signingLoadingState;
        }
        if ((i & 4) != 0) {
            z = optionOnboardingDisclosureDataState.loadingNextScreens;
        }
        return optionOnboardingDisclosureDataState.copy(optionOnboardingDisclosureStates2, optionOnboardingDisclosureStates22, z);
    }

    public final OptionOnboardingDisclosureStates2<UiAgreementWithContent> component1() {
        return this.agreementLoadingState;
    }

    public final OptionOnboardingDisclosureStates2<Unit> component2() {
        return this.signingLoadingState;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getLoadingNextScreens() {
        return this.loadingNextScreens;
    }

    public final OptionOnboardingDisclosureDataState copy(OptionOnboardingDisclosureStates2<UiAgreementWithContent> agreementLoadingState, OptionOnboardingDisclosureStates2<Unit> signingLoadingState, boolean loadingNextScreens) {
        return new OptionOnboardingDisclosureDataState(agreementLoadingState, signingLoadingState, loadingNextScreens);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionOnboardingDisclosureDataState)) {
            return false;
        }
        OptionOnboardingDisclosureDataState optionOnboardingDisclosureDataState = (OptionOnboardingDisclosureDataState) other;
        return Intrinsics.areEqual(this.agreementLoadingState, optionOnboardingDisclosureDataState.agreementLoadingState) && Intrinsics.areEqual(this.signingLoadingState, optionOnboardingDisclosureDataState.signingLoadingState) && this.loadingNextScreens == optionOnboardingDisclosureDataState.loadingNextScreens;
    }

    public int hashCode() {
        OptionOnboardingDisclosureStates2<UiAgreementWithContent> optionOnboardingDisclosureStates2 = this.agreementLoadingState;
        int iHashCode = (optionOnboardingDisclosureStates2 == null ? 0 : optionOnboardingDisclosureStates2.hashCode()) * 31;
        OptionOnboardingDisclosureStates2<Unit> optionOnboardingDisclosureStates22 = this.signingLoadingState;
        return ((iHashCode + (optionOnboardingDisclosureStates22 != null ? optionOnboardingDisclosureStates22.hashCode() : 0)) * 31) + Boolean.hashCode(this.loadingNextScreens);
    }

    public String toString() {
        return "OptionOnboardingDisclosureDataState(agreementLoadingState=" + this.agreementLoadingState + ", signingLoadingState=" + this.signingLoadingState + ", loadingNextScreens=" + this.loadingNextScreens + ")";
    }

    public OptionOnboardingDisclosureDataState(OptionOnboardingDisclosureStates2<UiAgreementWithContent> optionOnboardingDisclosureStates2, OptionOnboardingDisclosureStates2<Unit> optionOnboardingDisclosureStates22, boolean z) {
        this.agreementLoadingState = optionOnboardingDisclosureStates2;
        this.signingLoadingState = optionOnboardingDisclosureStates22;
        this.loadingNextScreens = z;
    }

    public /* synthetic */ OptionOnboardingDisclosureDataState(OptionOnboardingDisclosureStates2 optionOnboardingDisclosureStates2, OptionOnboardingDisclosureStates2 optionOnboardingDisclosureStates22, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : optionOnboardingDisclosureStates2, (i & 2) != 0 ? null : optionOnboardingDisclosureStates22, (i & 4) != 0 ? false : z);
    }

    public final OptionOnboardingDisclosureStates2<UiAgreementWithContent> getAgreementLoadingState() {
        return this.agreementLoadingState;
    }

    public final OptionOnboardingDisclosureStates2<Unit> getSigningLoadingState() {
        return this.signingLoadingState;
    }

    public final boolean getLoadingNextScreens() {
        return this.loadingNextScreens;
    }
}

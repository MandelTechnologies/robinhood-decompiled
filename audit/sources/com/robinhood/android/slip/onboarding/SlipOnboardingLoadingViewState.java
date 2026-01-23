package com.robinhood.android.slip.onboarding;

import com.robinhood.models.p355ui.UiSlipOnboardingEligibility;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipOnboardingLoadingViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingViewState;", "", "isMember", "", "eligibility", "Lcom/robinhood/models/ui/UiSlipOnboardingEligibility;", "<init>", "(ZLcom/robinhood/models/ui/UiSlipOnboardingEligibility;)V", "()Z", "getEligibility", "()Lcom/robinhood/models/ui/UiSlipOnboardingEligibility;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SlipOnboardingLoadingViewState {
    public static final int $stable = 8;
    private final UiSlipOnboardingEligibility eligibility;
    private final boolean isMember;

    /* JADX WARN: Multi-variable type inference failed */
    public SlipOnboardingLoadingViewState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SlipOnboardingLoadingViewState copy$default(SlipOnboardingLoadingViewState slipOnboardingLoadingViewState, boolean z, UiSlipOnboardingEligibility uiSlipOnboardingEligibility, int i, Object obj) {
        if ((i & 1) != 0) {
            z = slipOnboardingLoadingViewState.isMember;
        }
        if ((i & 2) != 0) {
            uiSlipOnboardingEligibility = slipOnboardingLoadingViewState.eligibility;
        }
        return slipOnboardingLoadingViewState.copy(z, uiSlipOnboardingEligibility);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsMember() {
        return this.isMember;
    }

    /* renamed from: component2, reason: from getter */
    public final UiSlipOnboardingEligibility getEligibility() {
        return this.eligibility;
    }

    public final SlipOnboardingLoadingViewState copy(boolean isMember, UiSlipOnboardingEligibility eligibility) {
        return new SlipOnboardingLoadingViewState(isMember, eligibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlipOnboardingLoadingViewState)) {
            return false;
        }
        SlipOnboardingLoadingViewState slipOnboardingLoadingViewState = (SlipOnboardingLoadingViewState) other;
        return this.isMember == slipOnboardingLoadingViewState.isMember && Intrinsics.areEqual(this.eligibility, slipOnboardingLoadingViewState.eligibility);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isMember) * 31;
        UiSlipOnboardingEligibility uiSlipOnboardingEligibility = this.eligibility;
        return iHashCode + (uiSlipOnboardingEligibility == null ? 0 : uiSlipOnboardingEligibility.hashCode());
    }

    public String toString() {
        return "SlipOnboardingLoadingViewState(isMember=" + this.isMember + ", eligibility=" + this.eligibility + ")";
    }

    public SlipOnboardingLoadingViewState(boolean z, UiSlipOnboardingEligibility uiSlipOnboardingEligibility) {
        this.isMember = z;
        this.eligibility = uiSlipOnboardingEligibility;
    }

    public /* synthetic */ SlipOnboardingLoadingViewState(boolean z, UiSlipOnboardingEligibility uiSlipOnboardingEligibility, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : uiSlipOnboardingEligibility);
    }

    public final boolean isMember() {
        return this.isMember;
    }

    public final UiSlipOnboardingEligibility getEligibility() {
        return this.eligibility;
    }
}

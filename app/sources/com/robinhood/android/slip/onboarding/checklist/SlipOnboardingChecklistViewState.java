package com.robinhood.android.slip.onboarding.checklist;

import com.robinhood.models.p355ui.UiSlipOnboardingEligibility;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipOnboardingChecklistDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistViewState;", "", "eligibility", "Lcom/robinhood/models/ui/UiSlipOnboardingEligibility;", "<init>", "(Lcom/robinhood/models/ui/UiSlipOnboardingEligibility;)V", "getEligibility", "()Lcom/robinhood/models/ui/UiSlipOnboardingEligibility;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SlipOnboardingChecklistViewState {
    public static final int $stable = 8;
    private final UiSlipOnboardingEligibility eligibility;

    /* JADX WARN: Multi-variable type inference failed */
    public SlipOnboardingChecklistViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SlipOnboardingChecklistViewState copy$default(SlipOnboardingChecklistViewState slipOnboardingChecklistViewState, UiSlipOnboardingEligibility uiSlipOnboardingEligibility, int i, Object obj) {
        if ((i & 1) != 0) {
            uiSlipOnboardingEligibility = slipOnboardingChecklistViewState.eligibility;
        }
        return slipOnboardingChecklistViewState.copy(uiSlipOnboardingEligibility);
    }

    /* renamed from: component1, reason: from getter */
    public final UiSlipOnboardingEligibility getEligibility() {
        return this.eligibility;
    }

    public final SlipOnboardingChecklistViewState copy(UiSlipOnboardingEligibility eligibility) {
        return new SlipOnboardingChecklistViewState(eligibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SlipOnboardingChecklistViewState) && Intrinsics.areEqual(this.eligibility, ((SlipOnboardingChecklistViewState) other).eligibility);
    }

    public int hashCode() {
        UiSlipOnboardingEligibility uiSlipOnboardingEligibility = this.eligibility;
        if (uiSlipOnboardingEligibility == null) {
            return 0;
        }
        return uiSlipOnboardingEligibility.hashCode();
    }

    public String toString() {
        return "SlipOnboardingChecklistViewState(eligibility=" + this.eligibility + ")";
    }

    public SlipOnboardingChecklistViewState(UiSlipOnboardingEligibility uiSlipOnboardingEligibility) {
        this.eligibility = uiSlipOnboardingEligibility;
    }

    public /* synthetic */ SlipOnboardingChecklistViewState(UiSlipOnboardingEligibility uiSlipOnboardingEligibility, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiSlipOnboardingEligibility);
    }

    public final UiSlipOnboardingEligibility getEligibility() {
        return this.eligibility;
    }
}

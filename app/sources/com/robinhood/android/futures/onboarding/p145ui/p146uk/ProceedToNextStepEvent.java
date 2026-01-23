package com.robinhood.android.futures.onboarding.p145ui.p146uk;

import kotlin.Metadata;

/* compiled from: FuturesUkCheckEligibilityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/uk/ProceedToNextStepEvent;", "", "alreadyEligibleForNextStep", "", "canRetryNextStep", "<init>", "(ZZ)V", "getAlreadyEligibleForNextStep", "()Z", "getCanRetryNextStep", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProceedToNextStepEvent {
    public static final int $stable = 0;
    private final boolean alreadyEligibleForNextStep;
    private final boolean canRetryNextStep;

    public static /* synthetic */ ProceedToNextStepEvent copy$default(ProceedToNextStepEvent proceedToNextStepEvent, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = proceedToNextStepEvent.alreadyEligibleForNextStep;
        }
        if ((i & 2) != 0) {
            z2 = proceedToNextStepEvent.canRetryNextStep;
        }
        return proceedToNextStepEvent.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAlreadyEligibleForNextStep() {
        return this.alreadyEligibleForNextStep;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCanRetryNextStep() {
        return this.canRetryNextStep;
    }

    public final ProceedToNextStepEvent copy(boolean alreadyEligibleForNextStep, boolean canRetryNextStep) {
        return new ProceedToNextStepEvent(alreadyEligibleForNextStep, canRetryNextStep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProceedToNextStepEvent)) {
            return false;
        }
        ProceedToNextStepEvent proceedToNextStepEvent = (ProceedToNextStepEvent) other;
        return this.alreadyEligibleForNextStep == proceedToNextStepEvent.alreadyEligibleForNextStep && this.canRetryNextStep == proceedToNextStepEvent.canRetryNextStep;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.alreadyEligibleForNextStep) * 31) + Boolean.hashCode(this.canRetryNextStep);
    }

    public String toString() {
        return "ProceedToNextStepEvent(alreadyEligibleForNextStep=" + this.alreadyEligibleForNextStep + ", canRetryNextStep=" + this.canRetryNextStep + ")";
    }

    public ProceedToNextStepEvent(boolean z, boolean z2) {
        this.alreadyEligibleForNextStep = z;
        this.canRetryNextStep = z2;
    }

    public final boolean getAlreadyEligibleForNextStep() {
        return this.alreadyEligibleForNextStep;
    }

    public final boolean getCanRetryNextStep() {
        return this.canRetryNextStep;
    }
}

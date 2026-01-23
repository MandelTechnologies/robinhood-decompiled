package com.robinhood.android.slip.onboarding;

import com.robinhood.models.p355ui.UiSlipOnboardingEligibility;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipOnboardingLoadingEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingEvent;", "", "<init>", "()V", "EligibilityReceived", "EligibilityError", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingEvent$EligibilityError;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingEvent$EligibilityReceived;", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class SlipOnboardingLoadingEvent {
    public static final int $stable = 0;

    public /* synthetic */ SlipOnboardingLoadingEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SlipOnboardingLoadingEvent() {
    }

    /* compiled from: SlipOnboardingLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingEvent$EligibilityReceived;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingEvent;", "eligibility", "Lcom/robinhood/models/ui/UiSlipOnboardingEligibility;", "isEnabled", "", "<init>", "(Lcom/robinhood/models/ui/UiSlipOnboardingEligibility;Z)V", "getEligibility", "()Lcom/robinhood/models/ui/UiSlipOnboardingEligibility;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EligibilityReceived extends SlipOnboardingLoadingEvent {
        public static final int $stable = 8;
        private final UiSlipOnboardingEligibility eligibility;
        private final boolean isEnabled;

        public static /* synthetic */ EligibilityReceived copy$default(EligibilityReceived eligibilityReceived, UiSlipOnboardingEligibility uiSlipOnboardingEligibility, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uiSlipOnboardingEligibility = eligibilityReceived.eligibility;
            }
            if ((i & 2) != 0) {
                z = eligibilityReceived.isEnabled;
            }
            return eligibilityReceived.copy(uiSlipOnboardingEligibility, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UiSlipOnboardingEligibility getEligibility() {
            return this.eligibility;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public final EligibilityReceived copy(UiSlipOnboardingEligibility eligibility, boolean isEnabled) {
            Intrinsics.checkNotNullParameter(eligibility, "eligibility");
            return new EligibilityReceived(eligibility, isEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EligibilityReceived)) {
                return false;
            }
            EligibilityReceived eligibilityReceived = (EligibilityReceived) other;
            return Intrinsics.areEqual(this.eligibility, eligibilityReceived.eligibility) && this.isEnabled == eligibilityReceived.isEnabled;
        }

        public int hashCode() {
            return (this.eligibility.hashCode() * 31) + Boolean.hashCode(this.isEnabled);
        }

        public String toString() {
            return "EligibilityReceived(eligibility=" + this.eligibility + ", isEnabled=" + this.isEnabled + ")";
        }

        public final UiSlipOnboardingEligibility getEligibility() {
            return this.eligibility;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibilityReceived(UiSlipOnboardingEligibility eligibility, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(eligibility, "eligibility");
            this.eligibility = eligibility;
            this.isEnabled = z;
        }
    }

    /* compiled from: SlipOnboardingLoadingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingEvent$EligibilityError;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EligibilityError extends SlipOnboardingLoadingEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ EligibilityError copy$default(EligibilityError eligibilityError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = eligibilityError.throwable;
            }
            return eligibilityError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final EligibilityError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new EligibilityError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EligibilityError) && Intrinsics.areEqual(this.throwable, ((EligibilityError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "EligibilityError(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibilityError(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}

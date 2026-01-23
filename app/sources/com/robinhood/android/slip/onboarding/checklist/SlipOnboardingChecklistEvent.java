package com.robinhood.android.slip.onboarding.checklist;

import com.robinhood.models.p355ui.UiSlipOnboardingEligibility;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipOnboardingChecklistEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent;", "", "<init>", "()V", "ProfileCheckPassed", "PortfolioCheckPassed", "CheckFailed", "EligibilityLoaded", "Error", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent$CheckFailed;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent$EligibilityLoaded;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent$Error;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent$PortfolioCheckPassed;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent$ProfileCheckPassed;", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class SlipOnboardingChecklistEvent {
    public static final int $stable = 0;

    public /* synthetic */ SlipOnboardingChecklistEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SlipOnboardingChecklistEvent() {
    }

    /* compiled from: SlipOnboardingChecklistEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent$ProfileCheckPassed;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ProfileCheckPassed extends SlipOnboardingChecklistEvent {
        public static final int $stable = 0;
        public static final ProfileCheckPassed INSTANCE = new ProfileCheckPassed();

        public boolean equals(Object other) {
            return this == other || (other instanceof ProfileCheckPassed);
        }

        public int hashCode() {
            return 270245197;
        }

        public String toString() {
            return "ProfileCheckPassed";
        }

        private ProfileCheckPassed() {
            super(null);
        }
    }

    /* compiled from: SlipOnboardingChecklistEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent$PortfolioCheckPassed;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent;", "isRecommended", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PortfolioCheckPassed extends SlipOnboardingChecklistEvent {
        public static final int $stable = 0;
        private final boolean isRecommended;

        public static /* synthetic */ PortfolioCheckPassed copy$default(PortfolioCheckPassed portfolioCheckPassed, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = portfolioCheckPassed.isRecommended;
            }
            return portfolioCheckPassed.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRecommended() {
            return this.isRecommended;
        }

        public final PortfolioCheckPassed copy(boolean isRecommended) {
            return new PortfolioCheckPassed(isRecommended);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PortfolioCheckPassed) && this.isRecommended == ((PortfolioCheckPassed) other).isRecommended;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRecommended);
        }

        public String toString() {
            return "PortfolioCheckPassed(isRecommended=" + this.isRecommended + ")";
        }

        public PortfolioCheckPassed(boolean z) {
            super(null);
            this.isRecommended = z;
        }

        public final boolean isRecommended() {
            return this.isRecommended;
        }
    }

    /* compiled from: SlipOnboardingChecklistEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent$CheckFailed;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CheckFailed extends SlipOnboardingChecklistEvent {
        public static final int $stable = 0;
        public static final CheckFailed INSTANCE = new CheckFailed();

        public boolean equals(Object other) {
            return this == other || (other instanceof CheckFailed);
        }

        public int hashCode() {
            return -1857499641;
        }

        public String toString() {
            return "CheckFailed";
        }

        private CheckFailed() {
            super(null);
        }
    }

    /* compiled from: SlipOnboardingChecklistEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent$EligibilityLoaded;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent;", "eligibility", "Lcom/robinhood/models/ui/UiSlipOnboardingEligibility;", "<init>", "(Lcom/robinhood/models/ui/UiSlipOnboardingEligibility;)V", "getEligibility", "()Lcom/robinhood/models/ui/UiSlipOnboardingEligibility;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EligibilityLoaded extends SlipOnboardingChecklistEvent {
        public static final int $stable = 8;
        private final UiSlipOnboardingEligibility eligibility;

        public static /* synthetic */ EligibilityLoaded copy$default(EligibilityLoaded eligibilityLoaded, UiSlipOnboardingEligibility uiSlipOnboardingEligibility, int i, Object obj) {
            if ((i & 1) != 0) {
                uiSlipOnboardingEligibility = eligibilityLoaded.eligibility;
            }
            return eligibilityLoaded.copy(uiSlipOnboardingEligibility);
        }

        /* renamed from: component1, reason: from getter */
        public final UiSlipOnboardingEligibility getEligibility() {
            return this.eligibility;
        }

        public final EligibilityLoaded copy(UiSlipOnboardingEligibility eligibility) {
            return new EligibilityLoaded(eligibility);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EligibilityLoaded) && Intrinsics.areEqual(this.eligibility, ((EligibilityLoaded) other).eligibility);
        }

        public int hashCode() {
            UiSlipOnboardingEligibility uiSlipOnboardingEligibility = this.eligibility;
            if (uiSlipOnboardingEligibility == null) {
                return 0;
            }
            return uiSlipOnboardingEligibility.hashCode();
        }

        public String toString() {
            return "EligibilityLoaded(eligibility=" + this.eligibility + ")";
        }

        public EligibilityLoaded(UiSlipOnboardingEligibility uiSlipOnboardingEligibility) {
            super(null);
            this.eligibility = uiSlipOnboardingEligibility;
        }

        public final UiSlipOnboardingEligibility getEligibility() {
            return this.eligibility;
        }
    }

    /* compiled from: SlipOnboardingChecklistEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent$Error;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends SlipOnboardingChecklistEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}

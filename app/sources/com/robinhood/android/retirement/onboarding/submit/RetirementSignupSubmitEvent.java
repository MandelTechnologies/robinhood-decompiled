package com.robinhood.android.retirement.onboarding.submit;

import com.robinhood.android.models.retirement.api.ApiRetirementSignUpEligibility2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignupSubmitEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitEvent;", "", "Error", "Ineligible", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitEvent$Error;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitEvent$Ineligible;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RetirementSignupSubmitEvent {

    /* compiled from: RetirementSignupSubmitEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitEvent$Error;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitEvent;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements RetirementSignupSubmitEvent {
        public static final int $stable = 8;
        private final Throwable cause;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.cause;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final Error copy(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new Error(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.cause, ((Error) other).cause);
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        public String toString() {
            return "Error(cause=" + this.cause + ")";
        }

        public Error(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        public final Throwable getCause() {
            return this.cause;
        }
    }

    /* compiled from: RetirementSignupSubmitEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitEvent$Ineligible;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitEvent;", "bottomSheet", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;)V", "getBottomSheet", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ineligible implements RetirementSignupSubmitEvent {
        public static final int $stable = 8;
        private final ApiRetirementSignUpEligibility2 bottomSheet;

        public static /* synthetic */ Ineligible copy$default(Ineligible ineligible, ApiRetirementSignUpEligibility2 apiRetirementSignUpEligibility2, int i, Object obj) {
            if ((i & 1) != 0) {
                apiRetirementSignUpEligibility2 = ineligible.bottomSheet;
            }
            return ineligible.copy(apiRetirementSignUpEligibility2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiRetirementSignUpEligibility2 getBottomSheet() {
            return this.bottomSheet;
        }

        public final Ineligible copy(ApiRetirementSignUpEligibility2 bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            return new Ineligible(bottomSheet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ineligible) && Intrinsics.areEqual(this.bottomSheet, ((Ineligible) other).bottomSheet);
        }

        public int hashCode() {
            return this.bottomSheet.hashCode();
        }

        public String toString() {
            return "Ineligible(bottomSheet=" + this.bottomSheet + ")";
        }

        public Ineligible(ApiRetirementSignUpEligibility2 bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            this.bottomSheet = bottomSheet;
        }

        public final ApiRetirementSignUpEligibility2 getBottomSheet() {
            return this.bottomSheet;
        }
    }
}

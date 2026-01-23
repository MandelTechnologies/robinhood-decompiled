package com.robinhood.android.advisory.onboarding.retirement.contribution;

import kotlin.Metadata;

/* compiled from: RetirementOnboardingContributionEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionEvent;", "", "LaunchTaxYear", "PushToAgreements", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionEvent$LaunchTaxYear;", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionEvent$PushToAgreements;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface RetirementOnboardingContributionEvent {

    /* compiled from: RetirementOnboardingContributionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionEvent$LaunchTaxYear;", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchTaxYear implements RetirementOnboardingContributionEvent {
        public static final int $stable = 0;
        public static final LaunchTaxYear INSTANCE = new LaunchTaxYear();

        public boolean equals(Object other) {
            return this == other || (other instanceof LaunchTaxYear);
        }

        public int hashCode() {
            return 600090146;
        }

        public String toString() {
            return "LaunchTaxYear";
        }

        private LaunchTaxYear() {
        }
    }

    /* compiled from: RetirementOnboardingContributionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionEvent$PushToAgreements;", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PushToAgreements implements RetirementOnboardingContributionEvent {
        public static final int $stable = 0;
        public static final PushToAgreements INSTANCE = new PushToAgreements();

        public boolean equals(Object other) {
            return this == other || (other instanceof PushToAgreements);
        }

        public int hashCode() {
            return -1794697519;
        }

        public String toString() {
            return "PushToAgreements";
        }

        private PushToAgreements() {
        }
    }
}

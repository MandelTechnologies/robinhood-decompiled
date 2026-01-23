package com.robinhood.android.futures.onboarding.p145ui;

import kotlin.Metadata;

/* compiled from: FuturesOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent;", "", "UserNotInExperimentEvent", "ShowValuePropsEvent", "ShowEligibility", "StartRhdOnboarding", "ShowFuturesTradingEvent", "UserAlreadyHasAccount", "SignAgreement", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent$ShowEligibility;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent$ShowFuturesTradingEvent;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent$ShowValuePropsEvent;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent$SignAgreement;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent$StartRhdOnboarding;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent$UserAlreadyHasAccount;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent$UserNotInExperimentEvent;", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingEvent, reason: use source file name */
/* loaded from: classes3.dex */
public interface FuturesOnboardingDuxo5 {

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent$UserNotInExperimentEvent;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingEvent$UserNotInExperimentEvent */
    public static final /* data */ class UserNotInExperimentEvent implements FuturesOnboardingDuxo5 {
        public static final int $stable = 0;
        public static final UserNotInExperimentEvent INSTANCE = new UserNotInExperimentEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof UserNotInExperimentEvent);
        }

        public int hashCode() {
            return 283869366;
        }

        public String toString() {
            return "UserNotInExperimentEvent";
        }

        private UserNotInExperimentEvent() {
        }
    }

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent$ShowValuePropsEvent;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingEvent$ShowValuePropsEvent */
    public static final /* data */ class ShowValuePropsEvent implements FuturesOnboardingDuxo5 {
        public static final int $stable = 0;
        public static final ShowValuePropsEvent INSTANCE = new ShowValuePropsEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowValuePropsEvent);
        }

        public int hashCode() {
            return -969273160;
        }

        public String toString() {
            return "ShowValuePropsEvent";
        }

        private ShowValuePropsEvent() {
        }
    }

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent$ShowEligibility;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingEvent$ShowEligibility */
    public static final /* data */ class ShowEligibility implements FuturesOnboardingDuxo5 {
        public static final int $stable = 0;
        public static final ShowEligibility INSTANCE = new ShowEligibility();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowEligibility);
        }

        public int hashCode() {
            return 1550677866;
        }

        public String toString() {
            return "ShowEligibility";
        }

        private ShowEligibility() {
        }
    }

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent$StartRhdOnboarding;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingEvent$StartRhdOnboarding */
    public static final /* data */ class StartRhdOnboarding implements FuturesOnboardingDuxo5 {
        public static final int $stable = 0;
        public static final StartRhdOnboarding INSTANCE = new StartRhdOnboarding();

        public boolean equals(Object other) {
            return this == other || (other instanceof StartRhdOnboarding);
        }

        public int hashCode() {
            return -319328499;
        }

        public String toString() {
            return "StartRhdOnboarding";
        }

        private StartRhdOnboarding() {
        }
    }

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent$ShowFuturesTradingEvent;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingEvent$ShowFuturesTradingEvent */
    public static final /* data */ class ShowFuturesTradingEvent implements FuturesOnboardingDuxo5 {
        public static final int $stable = 0;
        public static final ShowFuturesTradingEvent INSTANCE = new ShowFuturesTradingEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowFuturesTradingEvent);
        }

        public int hashCode() {
            return -1187080186;
        }

        public String toString() {
            return "ShowFuturesTradingEvent";
        }

        private ShowFuturesTradingEvent() {
        }
    }

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent$UserAlreadyHasAccount;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingEvent$UserAlreadyHasAccount */
    public static final /* data */ class UserAlreadyHasAccount implements FuturesOnboardingDuxo5 {
        public static final int $stable = 0;
        public static final UserAlreadyHasAccount INSTANCE = new UserAlreadyHasAccount();

        public boolean equals(Object other) {
            return this == other || (other instanceof UserAlreadyHasAccount);
        }

        public int hashCode() {
            return 1962748858;
        }

        public String toString() {
            return "UserAlreadyHasAccount";
        }

        private UserAlreadyHasAccount() {
        }
    }

    /* compiled from: FuturesOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent$SignAgreement;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingEvent$SignAgreement */
    public static final /* data */ class SignAgreement implements FuturesOnboardingDuxo5 {
        public static final int $stable = 0;
        public static final SignAgreement INSTANCE = new SignAgreement();

        public boolean equals(Object other) {
            return this == other || (other instanceof SignAgreement);
        }

        public int hashCode() {
            return -133771673;
        }

        public String toString() {
            return "SignAgreement";
        }

        private SignAgreement() {
        }
    }
}

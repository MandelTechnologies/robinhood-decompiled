package com.robinhood.android.futures.onboarding.p145ui.eligibility;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesEligibilityDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent;", "", "UserHasNoBrokerageAccountEvent", "UserBecameEligibleEvent", "UserHasAccountEvent", "UserIsIneligibleButHasOptionsOrMargin", "UsersApplicationPendingReviewEvent", "NetworkError", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent$NetworkError;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent$UserBecameEligibleEvent;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent$UserHasAccountEvent;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent$UserHasNoBrokerageAccountEvent;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent$UserIsIneligibleButHasOptionsOrMargin;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent$UsersApplicationPendingReviewEvent;", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityEvent, reason: use source file name */
/* loaded from: classes3.dex */
public interface FuturesEligibilityDuxo4 {

    /* compiled from: FuturesEligibilityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent$UserHasNoBrokerageAccountEvent;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityEvent$UserHasNoBrokerageAccountEvent */
    public static final /* data */ class UserHasNoBrokerageAccountEvent implements FuturesEligibilityDuxo4 {
        public static final int $stable = 0;
        public static final UserHasNoBrokerageAccountEvent INSTANCE = new UserHasNoBrokerageAccountEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof UserHasNoBrokerageAccountEvent);
        }

        public int hashCode() {
            return 778866702;
        }

        public String toString() {
            return "UserHasNoBrokerageAccountEvent";
        }

        private UserHasNoBrokerageAccountEvent() {
        }
    }

    /* compiled from: FuturesEligibilityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent$UserBecameEligibleEvent;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityEvent$UserBecameEligibleEvent */
    public static final /* data */ class UserBecameEligibleEvent implements FuturesEligibilityDuxo4 {
        public static final int $stable = 0;
        public static final UserBecameEligibleEvent INSTANCE = new UserBecameEligibleEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof UserBecameEligibleEvent);
        }

        public int hashCode() {
            return 115210708;
        }

        public String toString() {
            return "UserBecameEligibleEvent";
        }

        private UserBecameEligibleEvent() {
        }
    }

    /* compiled from: FuturesEligibilityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent$UserHasAccountEvent;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityEvent$UserHasAccountEvent */
    public static final /* data */ class UserHasAccountEvent implements FuturesEligibilityDuxo4 {
        public static final int $stable = 0;
        public static final UserHasAccountEvent INSTANCE = new UserHasAccountEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof UserHasAccountEvent);
        }

        public int hashCode() {
            return -1809314639;
        }

        public String toString() {
            return "UserHasAccountEvent";
        }

        private UserHasAccountEvent() {
        }
    }

    /* compiled from: FuturesEligibilityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent$UserIsIneligibleButHasOptionsOrMargin;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityEvent$UserIsIneligibleButHasOptionsOrMargin */
    public static final /* data */ class UserIsIneligibleButHasOptionsOrMargin implements FuturesEligibilityDuxo4 {
        public static final int $stable = 0;
        public static final UserIsIneligibleButHasOptionsOrMargin INSTANCE = new UserIsIneligibleButHasOptionsOrMargin();

        public boolean equals(Object other) {
            return this == other || (other instanceof UserIsIneligibleButHasOptionsOrMargin);
        }

        public int hashCode() {
            return 227724154;
        }

        public String toString() {
            return "UserIsIneligibleButHasOptionsOrMargin";
        }

        private UserIsIneligibleButHasOptionsOrMargin() {
        }
    }

    /* compiled from: FuturesEligibilityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent$UsersApplicationPendingReviewEvent;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityEvent$UsersApplicationPendingReviewEvent */
    public static final /* data */ class UsersApplicationPendingReviewEvent implements FuturesEligibilityDuxo4 {
        public static final int $stable = 0;
        public static final UsersApplicationPendingReviewEvent INSTANCE = new UsersApplicationPendingReviewEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof UsersApplicationPendingReviewEvent);
        }

        public int hashCode() {
            return -1924390946;
        }

        public String toString() {
            return "UsersApplicationPendingReviewEvent";
        }

        private UsersApplicationPendingReviewEvent() {
        }
    }

    /* compiled from: FuturesEligibilityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent$NetworkError;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityEvent$NetworkError, reason: from toString */
    public static final /* data */ class NetworkError implements FuturesEligibilityDuxo4 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ NetworkError copy$default(NetworkError networkError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = networkError.throwable;
            }
            return networkError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final NetworkError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new NetworkError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NetworkError) && Intrinsics.areEqual(this.throwable, ((NetworkError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "NetworkError(throwable=" + this.throwable + ")";
        }

        public NetworkError(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}

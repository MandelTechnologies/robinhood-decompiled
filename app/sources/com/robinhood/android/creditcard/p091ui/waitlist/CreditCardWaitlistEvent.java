package com.robinhood.android.creditcard.p091ui.waitlist;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreditCardWaitlistFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistEvent;", "", "Error", "CreditApplicationReferralCodeLimitReached", "CreditApplicationReferralAccountIneligible", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistEvent$CreditApplicationReferralAccountIneligible;", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistEvent$CreditApplicationReferralCodeLimitReached;", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistEvent$Error;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface CreditCardWaitlistEvent {

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistEvent$Error;", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements CreditCardWaitlistEvent {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -1812516058;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistEvent$CreditApplicationReferralCodeLimitReached;", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistEvent;", "referrerFirstName", "", "<init>", "(Ljava/lang/String;)V", "getReferrerFirstName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CreditApplicationReferralCodeLimitReached implements CreditCardWaitlistEvent {
        public static final int $stable = 0;
        private final String referrerFirstName;

        public static /* synthetic */ CreditApplicationReferralCodeLimitReached copy$default(CreditApplicationReferralCodeLimitReached creditApplicationReferralCodeLimitReached, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = creditApplicationReferralCodeLimitReached.referrerFirstName;
            }
            return creditApplicationReferralCodeLimitReached.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getReferrerFirstName() {
            return this.referrerFirstName;
        }

        public final CreditApplicationReferralCodeLimitReached copy(String referrerFirstName) {
            return new CreditApplicationReferralCodeLimitReached(referrerFirstName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreditApplicationReferralCodeLimitReached) && Intrinsics.areEqual(this.referrerFirstName, ((CreditApplicationReferralCodeLimitReached) other).referrerFirstName);
        }

        public int hashCode() {
            String str = this.referrerFirstName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "CreditApplicationReferralCodeLimitReached(referrerFirstName=" + this.referrerFirstName + ")";
        }

        public CreditApplicationReferralCodeLimitReached(String str) {
            this.referrerFirstName = str;
        }

        public final String getReferrerFirstName() {
            return this.referrerFirstName;
        }
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistEvent$CreditApplicationReferralAccountIneligible;", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CreditApplicationReferralAccountIneligible implements CreditCardWaitlistEvent {
        public static final int $stable = 0;
        public static final CreditApplicationReferralAccountIneligible INSTANCE = new CreditApplicationReferralAccountIneligible();

        public boolean equals(Object other) {
            return this == other || (other instanceof CreditApplicationReferralAccountIneligible);
        }

        public int hashCode() {
            return -204580169;
        }

        public String toString() {
            return "CreditApplicationReferralAccountIneligible";
        }

        private CreditApplicationReferralAccountIneligible() {
        }
    }
}

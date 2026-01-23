package com.robinhood.android.rhyonboarding.postaccountopen;

import kotlin.Metadata;

/* compiled from: RhyPostAccountOpenViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenViewState;", "", "Loading", "Timeout", "Finished", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenViewState$Finished;", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenViewState$Loading;", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenViewState$Timeout;", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RhyPostAccountOpenViewState {

    /* compiled from: RhyPostAccountOpenViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenViewState$Loading;", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenViewState;", "<init>", "()V", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements RhyPostAccountOpenViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: RhyPostAccountOpenViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenViewState$Timeout;", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenViewState;", "<init>", "()V", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Timeout implements RhyPostAccountOpenViewState {
        public static final int $stable = 0;
        public static final Timeout INSTANCE = new Timeout();

        private Timeout() {
        }
    }

    /* compiled from: RhyPostAccountOpenViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenViewState$Finished;", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenViewState;", "spendingAccountCreated", "", "<init>", "(Z)V", "getSpendingAccountCreated", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Finished implements RhyPostAccountOpenViewState {
        public static final int $stable = 0;
        private final boolean spendingAccountCreated;

        public static /* synthetic */ Finished copy$default(Finished finished, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = finished.spendingAccountCreated;
            }
            return finished.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSpendingAccountCreated() {
            return this.spendingAccountCreated;
        }

        public final Finished copy(boolean spendingAccountCreated) {
            return new Finished(spendingAccountCreated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Finished) && this.spendingAccountCreated == ((Finished) other).spendingAccountCreated;
        }

        public int hashCode() {
            return Boolean.hashCode(this.spendingAccountCreated);
        }

        public String toString() {
            return "Finished(spendingAccountCreated=" + this.spendingAccountCreated + ")";
        }

        public Finished(boolean z) {
            this.spendingAccountCreated = z;
        }

        public final boolean getSpendingAccountCreated() {
            return this.spendingAccountCreated;
        }
    }
}

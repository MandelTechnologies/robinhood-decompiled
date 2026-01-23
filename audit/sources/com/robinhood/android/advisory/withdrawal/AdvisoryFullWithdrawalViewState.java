package com.robinhood.android.advisory.withdrawal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: AdvisoryFullWithdrawalViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState;", "", "Loaded", "Loading", "InitializationError", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState$InitializationError;", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState$Loaded;", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState$Loading;", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AdvisoryFullWithdrawalViewState {

    /* compiled from: AdvisoryFullWithdrawalViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState$Loaded;", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState;", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary;", "submitting", "", "<init>", "(Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary;Z)V", "getSummary", "()Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary;", "getSubmitting", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AdvisoryFullWithdrawalViewState {
        public static final int $stable = 8;
        private final boolean submitting;
        private final FullWithdrawalSummary summary;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, FullWithdrawalSummary fullWithdrawalSummary, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                fullWithdrawalSummary = loaded.summary;
            }
            if ((i & 2) != 0) {
                z = loaded.submitting;
            }
            return loaded.copy(fullWithdrawalSummary, z);
        }

        /* renamed from: component1, reason: from getter */
        public final FullWithdrawalSummary getSummary() {
            return this.summary;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSubmitting() {
            return this.submitting;
        }

        public final Loaded copy(FullWithdrawalSummary summary, boolean submitting) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            return new Loaded(summary, submitting);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.summary, loaded.summary) && this.submitting == loaded.submitting;
        }

        public int hashCode() {
            return (this.summary.hashCode() * 31) + Boolean.hashCode(this.submitting);
        }

        public String toString() {
            return "Loaded(summary=" + this.summary + ", submitting=" + this.submitting + ")";
        }

        public Loaded(FullWithdrawalSummary summary, boolean z) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            this.summary = summary;
            this.submitting = z;
        }

        public final FullWithdrawalSummary getSummary() {
            return this.summary;
        }

        public final boolean getSubmitting() {
            return this.submitting;
        }
    }

    /* compiled from: AdvisoryFullWithdrawalViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState$Loading;", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AdvisoryFullWithdrawalViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1221373947;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AdvisoryFullWithdrawalViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState$InitializationError;", "Lcom/robinhood/android/advisory/withdrawal/AdvisoryFullWithdrawalViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitializationError implements AdvisoryFullWithdrawalViewState {
        public static final int $stable = 0;
        public static final InitializationError INSTANCE = new InitializationError();

        public boolean equals(Object other) {
            return this == other || (other instanceof InitializationError);
        }

        public int hashCode() {
            return -452438383;
        }

        public String toString() {
            return "InitializationError";
        }

        private InitializationError() {
        }
    }
}

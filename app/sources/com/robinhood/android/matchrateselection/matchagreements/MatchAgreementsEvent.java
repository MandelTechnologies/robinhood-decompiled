package com.robinhood.android.matchrateselection.matchagreements;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchAgreementsEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsEvent;", "", "Error", "AgreementsSigned", "Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsEvent$AgreementsSigned;", "Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsEvent$Error;", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MatchAgreementsEvent {

    /* compiled from: MatchAgreementsEvent.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\r\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsEvent$Error;", "Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsEvent;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "navigateBackAfterDismiss", "", "<init>", "(Ljava/lang/Exception;Z)V", "getError", "()Ljava/lang/Exception;", "getNavigateBackAfterDismiss", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements MatchAgreementsEvent {
        public static final int $stable = 8;
        private final Exception error;
        private final boolean navigateBackAfterDismiss;

        public static /* synthetic */ Error copy$default(Error error, Exception exc, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.error;
            }
            if ((i & 2) != 0) {
                z = error.navigateBackAfterDismiss;
            }
            return error.copy(exc, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getNavigateBackAfterDismiss() {
            return this.navigateBackAfterDismiss;
        }

        public final Error copy(Exception error, boolean navigateBackAfterDismiss) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error, navigateBackAfterDismiss);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.error, error.error) && this.navigateBackAfterDismiss == error.navigateBackAfterDismiss;
        }

        public int hashCode() {
            return (this.error.hashCode() * 31) + Boolean.hashCode(this.navigateBackAfterDismiss);
        }

        public String toString() {
            return "Error(error=" + this.error + ", navigateBackAfterDismiss=" + this.navigateBackAfterDismiss + ")";
        }

        public Error(Exception error, boolean z) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
            this.navigateBackAfterDismiss = z;
        }

        public final Exception getError() {
            return this.error;
        }

        public final boolean getNavigateBackAfterDismiss() {
            return this.navigateBackAfterDismiss;
        }
    }

    /* compiled from: MatchAgreementsEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsEvent$AgreementsSigned;", "Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AgreementsSigned implements MatchAgreementsEvent {
        public static final int $stable = 0;
        public static final AgreementsSigned INSTANCE = new AgreementsSigned();

        public boolean equals(Object other) {
            return this == other || (other instanceof AgreementsSigned);
        }

        public int hashCode() {
            return 2089583572;
        }

        public String toString() {
            return "AgreementsSigned";
        }

        private AgreementsSigned() {
        }
    }
}

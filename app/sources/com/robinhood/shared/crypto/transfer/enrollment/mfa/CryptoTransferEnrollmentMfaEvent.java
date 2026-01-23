package com.robinhood.shared.crypto.transfer.enrollment.mfa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferEnrollmentMfaEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent;", "", "Navigate", "Error", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Navigate;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface CryptoTransferEnrollmentMfaEvent {

    /* compiled from: CryptoTransferEnrollmentMfaEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Navigate;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent;", "Phone", "Email", "Enroll", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Navigate$Email;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Navigate$Enroll;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Navigate$Phone;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Navigate extends CryptoTransferEnrollmentMfaEvent {

        /* compiled from: CryptoTransferEnrollmentMfaEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Navigate$Phone;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Navigate;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Phone implements Navigate {
            public static final int $stable = 0;
            public static final Phone INSTANCE = new Phone();

            public boolean equals(Object other) {
                return this == other || (other instanceof Phone);
            }

            public int hashCode() {
                return -509872457;
            }

            public String toString() {
                return "Phone";
            }

            private Phone() {
            }
        }

        /* compiled from: CryptoTransferEnrollmentMfaEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Navigate$Email;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Navigate;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Email implements Navigate {
            public static final int $stable = 0;
            public static final Email INSTANCE = new Email();

            public boolean equals(Object other) {
                return this == other || (other instanceof Email);
            }

            public int hashCode() {
                return -519895835;
            }

            public String toString() {
                return "Email";
            }

            private Email() {
            }
        }

        /* compiled from: CryptoTransferEnrollmentMfaEvent.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Navigate$Enroll;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Navigate;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Enroll implements Navigate {
            public static final int $stable = 0;
            public static final Enroll INSTANCE = new Enroll();

            public boolean equals(Object other) {
                return this == other || (other instanceof Enroll);
            }

            public int hashCode() {
                return 1064534141;
            }

            public String toString() {
                return "Enroll";
            }

            private Enroll() {
            }
        }
    }

    /* compiled from: CryptoTransferEnrollmentMfaEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/enrollment/mfa/CryptoTransferEnrollmentMfaEvent;", "t", "", "<init>", "(Ljava/lang/Throwable;)V", "getT", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements CryptoTransferEnrollmentMfaEvent {
        public static final int $stable = 8;
        private final Throwable t;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.t;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getT() {
            return this.t;
        }

        public final Error copy(Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            return new Error(t);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.t, ((Error) other).t);
        }

        public int hashCode() {
            return this.t.hashCode();
        }

        public String toString() {
            return "Error(t=" + this.t + ")";
        }

        public Error(Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            this.t = t;
        }

        public final Throwable getT() {
            return this.t;
        }
    }
}

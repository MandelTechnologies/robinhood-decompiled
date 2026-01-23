package com.robinhood.shared.crypto.transfer.send.landing;

import com.robinhood.models.crypto.p314db.transfer.CryptoTransferLimits;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendLandingEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingEvent;", "", "ShowHigherLimitSheet", "Error", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingEvent$ShowHigherLimitSheet;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface CryptoTransferSendLandingEvent {

    /* compiled from: CryptoTransferSendLandingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingEvent$ShowHigherLimitSheet;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingEvent;", "limits", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferLimits;", "<init>", "(Lcom/robinhood/models/crypto/db/transfer/CryptoTransferLimits;)V", "getLimits", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferLimits;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowHigherLimitSheet implements CryptoTransferSendLandingEvent {
        public static final int $stable = 8;
        private final CryptoTransferLimits limits;

        public static /* synthetic */ ShowHigherLimitSheet copy$default(ShowHigherLimitSheet showHigherLimitSheet, CryptoTransferLimits cryptoTransferLimits, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoTransferLimits = showHigherLimitSheet.limits;
            }
            return showHigherLimitSheet.copy(cryptoTransferLimits);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoTransferLimits getLimits() {
            return this.limits;
        }

        public final ShowHigherLimitSheet copy(CryptoTransferLimits limits) {
            Intrinsics.checkNotNullParameter(limits, "limits");
            return new ShowHigherLimitSheet(limits);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowHigherLimitSheet) && Intrinsics.areEqual(this.limits, ((ShowHigherLimitSheet) other).limits);
        }

        public int hashCode() {
            return this.limits.hashCode();
        }

        public String toString() {
            return "ShowHigherLimitSheet(limits=" + this.limits + ")";
        }

        public ShowHigherLimitSheet(CryptoTransferLimits limits) {
            Intrinsics.checkNotNullParameter(limits, "limits");
            this.limits = limits;
        }

        public final CryptoTransferLimits getLimits() {
            return this.limits;
        }
    }

    /* compiled from: CryptoTransferSendLandingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/send/landing/CryptoTransferSendLandingEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements CryptoTransferSendLandingEvent {
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

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}

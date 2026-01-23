package com.robinhood.android.rhy.referral.fund.confirmation;

import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralFundConfirmationEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationEvent;", "", "VerificationRequired", "PushTokenize", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationEvent$PushTokenize;", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationEvent$VerificationRequired;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RhyReferralFundConfirmationEvent {

    /* compiled from: RhyReferralFundConfirmationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationEvent$VerificationRequired;", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationEvent;", "exception", "Lcom/robinhood/models/api/minerva/VerificationRequiredException;", "<init>", "(Lcom/robinhood/models/api/minerva/VerificationRequiredException;)V", "getException", "()Lcom/robinhood/models/api/minerva/VerificationRequiredException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VerificationRequired implements RhyReferralFundConfirmationEvent {
        public static final int $stable = 8;
        private final VerificationRequiredException exception;

        public static /* synthetic */ VerificationRequired copy$default(VerificationRequired verificationRequired, VerificationRequiredException verificationRequiredException, int i, Object obj) {
            if ((i & 1) != 0) {
                verificationRequiredException = verificationRequired.exception;
            }
            return verificationRequired.copy(verificationRequiredException);
        }

        /* renamed from: component1, reason: from getter */
        public final VerificationRequiredException getException() {
            return this.exception;
        }

        public final VerificationRequired copy(VerificationRequiredException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new VerificationRequired(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerificationRequired) && Intrinsics.areEqual(this.exception, ((VerificationRequired) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "VerificationRequired(exception=" + this.exception + ")";
        }

        public VerificationRequired(VerificationRequiredException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public final VerificationRequiredException getException() {
            return this.exception;
        }
    }

    /* compiled from: RhyReferralFundConfirmationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationEvent$PushTokenize;", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationEvent;", "request", "Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "<init>", "(Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;)V", "getRequest", "()Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PushTokenize implements RhyReferralFundConfirmationEvent {
        public static final int $stable = 8;
        private final PushTokenizeRequest request;

        public static /* synthetic */ PushTokenize copy$default(PushTokenize pushTokenize, PushTokenizeRequest pushTokenizeRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                pushTokenizeRequest = pushTokenize.request;
            }
            return pushTokenize.copy(pushTokenizeRequest);
        }

        /* renamed from: component1, reason: from getter */
        public final PushTokenizeRequest getRequest() {
            return this.request;
        }

        public final PushTokenize copy(PushTokenizeRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return new PushTokenize(request);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PushTokenize) && Intrinsics.areEqual(this.request, ((PushTokenize) other).request);
        }

        public int hashCode() {
            return this.request.hashCode();
        }

        public String toString() {
            return "PushTokenize(request=" + this.request + ")";
        }

        public PushTokenize(PushTokenizeRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
        }

        public final PushTokenizeRequest getRequest() {
            return this.request;
        }
    }
}

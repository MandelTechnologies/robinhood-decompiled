package com.truelayer.payments.core.domain.payments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentFailureReason.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\b\u0086\u0081\u0002\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001%B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006&"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;", "", "reason", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getReason", "()Ljava/lang/String;", "setReason", "(Ljava/lang/String;)V", "AuthorizationFailed", "Blocked", "Canceled", "ConstraintViolation", "Expired", "InsufficientFunds", "InternalServerError", "InvalidAccountDetails", "InvalidAccountHolderName", "InvalidBeneficiaryAccount", "InvalidCredentials", "InvalidMandateState", "InvalidOtp", "InvalidRemitterAccount", "InvalidRequest", "InvalidSortCode", "MandateRevoked", "NotAuthorized", "PaymentLimitExceeded", "ProviderError", "ProviderExpired", "ProviderRejected", "Rejected", "SchemeUnavailable", "UnknownError", "UserCanceledAtProvider", "VerificationDeclined", "Unknown", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PaymentFailureReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentFailureReason[] $VALUES;
    public static final PaymentFailureReason InternalServerError;
    public static final PaymentFailureReason InvalidRemitterAccount;
    public static final PaymentFailureReason ProviderExpired;
    public static final PaymentFailureReason Unknown;
    private String reason;
    public static final PaymentFailureReason AuthorizationFailed = new PaymentFailureReason("AuthorizationFailed", 0, null, 1, null);
    public static final PaymentFailureReason Blocked = new PaymentFailureReason("Blocked", 1, null, 1, null);
    public static final PaymentFailureReason Canceled = new PaymentFailureReason("Canceled", 2, null, 1, null);
    public static final PaymentFailureReason ConstraintViolation = new PaymentFailureReason("ConstraintViolation", 3, null, 1, null);
    public static final PaymentFailureReason Expired = new PaymentFailureReason("Expired", 4, null, 1, null);
    public static final PaymentFailureReason InsufficientFunds = new PaymentFailureReason("InsufficientFunds", 5, null, 1, null);
    public static final PaymentFailureReason InvalidAccountDetails = new PaymentFailureReason("InvalidAccountDetails", 7, null, 1, null);
    public static final PaymentFailureReason InvalidAccountHolderName = new PaymentFailureReason("InvalidAccountHolderName", 8, null, 1, null);
    public static final PaymentFailureReason InvalidBeneficiaryAccount = new PaymentFailureReason("InvalidBeneficiaryAccount", 9, null, 1, null);
    public static final PaymentFailureReason InvalidCredentials = new PaymentFailureReason("InvalidCredentials", 10, null, 1, null);
    public static final PaymentFailureReason InvalidMandateState = new PaymentFailureReason("InvalidMandateState", 11, null, 1, 0 == true ? 1 : 0);
    public static final PaymentFailureReason InvalidOtp = new PaymentFailureReason("InvalidOtp", 12, null, 1, null);
    public static final PaymentFailureReason InvalidRequest = new PaymentFailureReason("InvalidRequest", 14, null, 1, null);
    public static final PaymentFailureReason InvalidSortCode = new PaymentFailureReason("InvalidSortCode", 15, null, 1, null);
    public static final PaymentFailureReason MandateRevoked = new PaymentFailureReason("MandateRevoked", 16, null, 1, null);
    public static final PaymentFailureReason NotAuthorized = new PaymentFailureReason("NotAuthorized", 17, null, 1, null);
    public static final PaymentFailureReason PaymentLimitExceeded = new PaymentFailureReason("PaymentLimitExceeded", 18, null, 1, 0 == true ? 1 : 0);
    public static final PaymentFailureReason ProviderError = new PaymentFailureReason("ProviderError", 19, null, 1, null);
    public static final PaymentFailureReason ProviderRejected = new PaymentFailureReason("ProviderRejected", 21, null, 1, null);
    public static final PaymentFailureReason Rejected = new PaymentFailureReason("Rejected", 22, null, 1, null);
    public static final PaymentFailureReason SchemeUnavailable = new PaymentFailureReason("SchemeUnavailable", 23, null, 1, null);
    public static final PaymentFailureReason UnknownError = new PaymentFailureReason("UnknownError", 24, null, 1, null);
    public static final PaymentFailureReason UserCanceledAtProvider = new PaymentFailureReason("UserCanceledAtProvider", 25, null, 1, 0 == true ? 1 : 0);
    public static final PaymentFailureReason VerificationDeclined = new PaymentFailureReason("VerificationDeclined", 26, null, 1, null);

    private static final /* synthetic */ PaymentFailureReason[] $values() {
        return new PaymentFailureReason[]{AuthorizationFailed, Blocked, Canceled, ConstraintViolation, Expired, InsufficientFunds, InternalServerError, InvalidAccountDetails, InvalidAccountHolderName, InvalidBeneficiaryAccount, InvalidCredentials, InvalidMandateState, InvalidOtp, InvalidRemitterAccount, InvalidRequest, InvalidSortCode, MandateRevoked, NotAuthorized, PaymentLimitExceeded, ProviderError, ProviderExpired, ProviderRejected, Rejected, SchemeUnavailable, UnknownError, UserCanceledAtProvider, VerificationDeclined, Unknown};
    }

    public static EnumEntries<PaymentFailureReason> getEntries() {
        return $ENTRIES;
    }

    public static PaymentFailureReason valueOf(String str) {
        return (PaymentFailureReason) Enum.valueOf(PaymentFailureReason.class, str);
    }

    public static PaymentFailureReason[] values() {
        return (PaymentFailureReason[]) $VALUES.clone();
    }

    private PaymentFailureReason(String str, int i, String str2) {
        this.reason = str2;
    }

    /* synthetic */ PaymentFailureReason(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? "" : str2);
    }

    public final String getReason() {
        return this.reason;
    }

    public final void setReason(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reason = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        InternalServerError = new PaymentFailureReason("InternalServerError", 6, null, 1, defaultConstructorMarker);
        InvalidRemitterAccount = new PaymentFailureReason("InvalidRemitterAccount", 13, null, 1, defaultConstructorMarker);
        ProviderExpired = new PaymentFailureReason("ProviderExpired", 20, null, 1, defaultConstructorMarker);
        Unknown = new PaymentFailureReason("Unknown", 27, null, 1, defaultConstructorMarker);
        PaymentFailureReason[] paymentFailureReasonArr$values = $values();
        $VALUES = paymentFailureReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(paymentFailureReasonArr$values);
        INSTANCE = new Companion(null);
    }
}

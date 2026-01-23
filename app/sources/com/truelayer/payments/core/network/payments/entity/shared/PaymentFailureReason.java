package com.truelayer.payments.core.network.payments.entity.shared;

import com.robinhood.models.api.MarginCall;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentFailureReason.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\b\u0087\u0081\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001(B\u000f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006)"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentFailureReason;", "", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;", "reason", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getReason", "()Ljava/lang/String;", "setReason", "(Ljava/lang/String;)V", "intoDomain", "AuthorizationFailed", "Blocked", "Canceled", "ConstraintViolation", "Expired", "InsufficientFunds", "InternalServerError", "InvalidAccountDetails", "InvalidAccountHolderName", "InvalidBeneficiaryAccount", "InvalidCredentials", "InvalidMandateState", "InvalidOtp", "InvalidRemitterAccount", "InvalidRequest", "InvalidSortCode", "MandateRevoked", "NotAuthorized", "PaymentLimitExceeded", "ProviderError", "ProviderExpired", "ProviderRejected", "Rejected", "SchemeUnavailable", "UnknownError", "UserCanceledAtProvider", "VerificationDeclined", "Unknown", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable(with = PaymentFailureReason2.class)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class PaymentFailureReason implements IntoDomain<com.truelayer.payments.core.domain.payments.PaymentFailureReason> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentFailureReason[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private String reason;
    public static final PaymentFailureReason AuthorizationFailed = new PaymentFailureReason("AuthorizationFailed", 0, "authorization_failed");
    public static final PaymentFailureReason Blocked = new PaymentFailureReason("Blocked", 1, "blocked");
    public static final PaymentFailureReason Canceled = new PaymentFailureReason("Canceled", 2, "canceled");
    public static final PaymentFailureReason ConstraintViolation = new PaymentFailureReason("ConstraintViolation", 3, "constraint_violation");
    public static final PaymentFailureReason Expired = new PaymentFailureReason("Expired", 4, MarginCall.STATE_EXPIRED);
    public static final PaymentFailureReason InsufficientFunds = new PaymentFailureReason("InsufficientFunds", 5, "insufficient_funds");
    public static final PaymentFailureReason InternalServerError = new PaymentFailureReason("InternalServerError", 6, "internal_server_error");
    public static final PaymentFailureReason InvalidAccountDetails = new PaymentFailureReason("InvalidAccountDetails", 7, "invalid_account_details");
    public static final PaymentFailureReason InvalidAccountHolderName = new PaymentFailureReason("InvalidAccountHolderName", 8, "invalid_account_holder_name");
    public static final PaymentFailureReason InvalidBeneficiaryAccount = new PaymentFailureReason("InvalidBeneficiaryAccount", 9, "invalid_beneficiary_account");
    public static final PaymentFailureReason InvalidCredentials = new PaymentFailureReason("InvalidCredentials", 10, "invalid_credentials");
    public static final PaymentFailureReason InvalidMandateState = new PaymentFailureReason("InvalidMandateState", 11, "invalid_mandate_state");
    public static final PaymentFailureReason InvalidOtp = new PaymentFailureReason("InvalidOtp", 12, "invalid_otp");
    public static final PaymentFailureReason InvalidRemitterAccount = new PaymentFailureReason("InvalidRemitterAccount", 13, "invalid_remitter_account");
    public static final PaymentFailureReason InvalidRequest = new PaymentFailureReason("InvalidRequest", 14, "invalid_request");
    public static final PaymentFailureReason InvalidSortCode = new PaymentFailureReason("InvalidSortCode", 15, "invalid_sort_code");
    public static final PaymentFailureReason MandateRevoked = new PaymentFailureReason("MandateRevoked", 16, "mandate_revoked");
    public static final PaymentFailureReason NotAuthorized = new PaymentFailureReason("NotAuthorized", 17, "not_authorized");
    public static final PaymentFailureReason PaymentLimitExceeded = new PaymentFailureReason("PaymentLimitExceeded", 18, "payment_limit_exceeded");
    public static final PaymentFailureReason ProviderError = new PaymentFailureReason("ProviderError", 19, "provider_error");
    public static final PaymentFailureReason ProviderExpired = new PaymentFailureReason("ProviderExpired", 20, "provider_expired");
    public static final PaymentFailureReason ProviderRejected = new PaymentFailureReason("ProviderRejected", 21, "provider_rejected");
    public static final PaymentFailureReason Rejected = new PaymentFailureReason("Rejected", 22, "rejected");
    public static final PaymentFailureReason SchemeUnavailable = new PaymentFailureReason("SchemeUnavailable", 23, "scheme_unavailable");
    public static final PaymentFailureReason UnknownError = new PaymentFailureReason("UnknownError", 24, "unknown_error");
    public static final PaymentFailureReason UserCanceledAtProvider = new PaymentFailureReason("UserCanceledAtProvider", 25, "user_canceled_at_provider");
    public static final PaymentFailureReason VerificationDeclined = new PaymentFailureReason("VerificationDeclined", 26, "verification_declined");
    public static final PaymentFailureReason Unknown = new PaymentFailureReason("Unknown", 27, "unknown");

    /* compiled from: PaymentFailureReason.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentFailureReason.values().length];
            try {
                iArr[PaymentFailureReason.AuthorizationFailed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentFailureReason.Blocked.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentFailureReason.Canceled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentFailureReason.ConstraintViolation.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentFailureReason.Expired.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentFailureReason.InsufficientFunds.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentFailureReason.InternalServerError.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentFailureReason.InvalidAccountDetails.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PaymentFailureReason.InvalidAccountHolderName.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PaymentFailureReason.InvalidBeneficiaryAccount.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PaymentFailureReason.InvalidCredentials.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PaymentFailureReason.InvalidMandateState.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PaymentFailureReason.InvalidOtp.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PaymentFailureReason.InvalidRemitterAccount.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PaymentFailureReason.InvalidRequest.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[PaymentFailureReason.InvalidSortCode.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[PaymentFailureReason.MandateRevoked.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[PaymentFailureReason.NotAuthorized.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[PaymentFailureReason.PaymentLimitExceeded.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[PaymentFailureReason.ProviderError.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[PaymentFailureReason.ProviderExpired.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[PaymentFailureReason.ProviderRejected.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[PaymentFailureReason.Rejected.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[PaymentFailureReason.SchemeUnavailable.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[PaymentFailureReason.UnknownError.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[PaymentFailureReason.UserCanceledAtProvider.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[PaymentFailureReason.VerificationDeclined.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[PaymentFailureReason.Unknown.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

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

    /* compiled from: PaymentFailureReason.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentFailureReason$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentFailureReason;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) PaymentFailureReason.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PaymentFailureReason> serializer() {
            return get$cachedSerializer();
        }
    }

    private PaymentFailureReason(String str, int i, String str2) {
        this.reason = str2;
    }

    public final String getReason() {
        return this.reason;
    }

    public final void setReason(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reason = str;
    }

    static {
        PaymentFailureReason[] paymentFailureReasonArr$values = $values();
        $VALUES = paymentFailureReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(paymentFailureReasonArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.payments.entity.shared.PaymentFailureReason.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return PaymentFailureReason2.INSTANCE;
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.truelayer.payments.core.domain.utils.IntoDomain
    public com.truelayer.payments.core.domain.payments.PaymentFailureReason intoDomain() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.AuthorizationFailed;
            case 2:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.Blocked;
            case 3:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.Canceled;
            case 4:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.ConstraintViolation;
            case 5:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.Expired;
            case 6:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.InsufficientFunds;
            case 7:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.InternalServerError;
            case 8:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.InvalidAccountDetails;
            case 9:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.InvalidAccountHolderName;
            case 10:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.InvalidBeneficiaryAccount;
            case 11:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.InvalidCredentials;
            case 12:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.InvalidMandateState;
            case 13:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.InvalidOtp;
            case 14:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.InvalidRemitterAccount;
            case 15:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.InvalidRequest;
            case 16:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.InvalidSortCode;
            case 17:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.MandateRevoked;
            case 18:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.NotAuthorized;
            case 19:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.PaymentLimitExceeded;
            case 20:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.ProviderError;
            case 21:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.ProviderExpired;
            case 22:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.ProviderRejected;
            case 23:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.Rejected;
            case 24:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.SchemeUnavailable;
            case 25:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.UnknownError;
            case 26:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.UserCanceledAtProvider;
            case 27:
                return com.truelayer.payments.core.domain.payments.PaymentFailureReason.VerificationDeclined;
            case 28:
                com.truelayer.payments.core.domain.payments.PaymentFailureReason paymentFailureReason = com.truelayer.payments.core.domain.payments.PaymentFailureReason.Unknown;
                paymentFailureReason.setReason(this.reason);
                return paymentFailureReason;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

package com.truelayer.payments.core.domain.payments;

import com.robinhood.models.api.MarginCall;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthorizationFlowResponse.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "", "AuthorizationFailed", "Authorizing", "Companion", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$Authorizing;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface AuthorizationFlowResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: AuthorizationFlowResponse.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$Authorizing;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "authorizationFlow", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "(Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;)V", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Authorizing implements AuthorizationFlowResponse {
        private final AuthorizationFlow authorizationFlow;

        public static /* synthetic */ Authorizing copy$default(Authorizing authorizing, AuthorizationFlow authorizationFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                authorizationFlow = authorizing.authorizationFlow;
            }
            return authorizing.copy(authorizationFlow);
        }

        /* renamed from: component1, reason: from getter */
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        public final Authorizing copy(AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            return new Authorizing(authorizationFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Authorizing) && Intrinsics.areEqual(this.authorizationFlow, ((Authorizing) other).authorizationFlow);
        }

        public int hashCode() {
            return this.authorizationFlow.hashCode();
        }

        public String toString() {
            return "Authorizing(authorizationFlow=" + this.authorizationFlow + ")";
        }

        public Authorizing(AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            this.authorizationFlow = authorizationFlow;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }
    }

    /* compiled from: AuthorizationFlowResponse.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0003\u0016\u0017\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "failureReason", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureReason;", "failureStage", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureStage;", "(Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureReason;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureStage;)V", "getFailureReason", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureReason;", "getFailureStage", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureStage;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "FailureReason", "FailureStage", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class AuthorizationFailed implements AuthorizationFlowResponse {
        private final FailureReason failureReason;
        private final FailureStage failureStage;

        public static /* synthetic */ AuthorizationFailed copy$default(AuthorizationFailed authorizationFailed, FailureReason failureReason, FailureStage failureStage, int i, Object obj) {
            if ((i & 1) != 0) {
                failureReason = authorizationFailed.failureReason;
            }
            if ((i & 2) != 0) {
                failureStage = authorizationFailed.failureStage;
            }
            return authorizationFailed.copy(failureReason, failureStage);
        }

        /* renamed from: component1, reason: from getter */
        public final FailureReason getFailureReason() {
            return this.failureReason;
        }

        /* renamed from: component2, reason: from getter */
        public final FailureStage getFailureStage() {
            return this.failureStage;
        }

        public final AuthorizationFailed copy(FailureReason failureReason, FailureStage failureStage) {
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            Intrinsics.checkNotNullParameter(failureStage, "failureStage");
            return new AuthorizationFailed(failureReason, failureStage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorizationFailed)) {
                return false;
            }
            AuthorizationFailed authorizationFailed = (AuthorizationFailed) other;
            return this.failureReason == authorizationFailed.failureReason && this.failureStage == authorizationFailed.failureStage;
        }

        public int hashCode() {
            return (this.failureReason.hashCode() * 31) + this.failureStage.hashCode();
        }

        public String toString() {
            return "AuthorizationFailed(failureReason=" + this.failureReason + ", failureStage=" + this.failureStage + ")";
        }

        public AuthorizationFailed(FailureReason failureReason, FailureStage failureStage) {
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            Intrinsics.checkNotNullParameter(failureStage, "failureStage");
            this.failureReason = failureReason;
            this.failureStage = failureStage;
        }

        public final FailureReason getFailureReason() {
            return this.failureReason;
        }

        public final FailureStage getFailureStage() {
            return this.failureStage;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AuthorizationFlowResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureReason;", "", ResourceTypes.RAW, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRaw", "()Ljava/lang/String;", "intoPaymentFailureReason", "Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;", "Rejected", "ProviderError", "ProviderRejected", "InternalServerError", "Canceled", "Expired", "AuthorizationFailed", "InvalidRequest", "InsufficientFunds", "InvalidSortCode", "MandateRevoked", "ConstraintViolation", "InvalidMandateState", "UnknownError", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class FailureReason {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ FailureReason[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String raw;
            public static final FailureReason Rejected = new FailureReason("Rejected", 0, "rejected");
            public static final FailureReason ProviderError = new FailureReason("ProviderError", 1, "provider_error");
            public static final FailureReason ProviderRejected = new FailureReason("ProviderRejected", 2, "provider_rejected");
            public static final FailureReason InternalServerError = new FailureReason("InternalServerError", 3, "internal_server_error");
            public static final FailureReason Canceled = new FailureReason("Canceled", 4, "canceled");
            public static final FailureReason Expired = new FailureReason("Expired", 5, MarginCall.STATE_EXPIRED);
            public static final FailureReason AuthorizationFailed = new FailureReason("AuthorizationFailed", 6, "authorization_failed");
            public static final FailureReason InvalidRequest = new FailureReason("InvalidRequest", 7, "invalid_request");
            public static final FailureReason InsufficientFunds = new FailureReason("InsufficientFunds", 8, "insufficient_funds");
            public static final FailureReason InvalidSortCode = new FailureReason("InvalidSortCode", 9, "invalid_sort_code");
            public static final FailureReason MandateRevoked = new FailureReason("MandateRevoked", 10, "mandate_revoked");
            public static final FailureReason ConstraintViolation = new FailureReason("ConstraintViolation", 11, "constraint_violation");
            public static final FailureReason InvalidMandateState = new FailureReason("InvalidMandateState", 12, "invalid_mandate_state");
            public static final FailureReason UnknownError = new FailureReason("UnknownError", 13, "unknown_error");

            /* compiled from: AuthorizationFlowResponse.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FailureReason.values().length];
                    try {
                        iArr[FailureReason.Rejected.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FailureReason.ProviderError.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FailureReason.ProviderRejected.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[FailureReason.InternalServerError.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[FailureReason.Canceled.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[FailureReason.Expired.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[FailureReason.AuthorizationFailed.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[FailureReason.InvalidRequest.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[FailureReason.InsufficientFunds.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[FailureReason.InvalidSortCode.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[FailureReason.MandateRevoked.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[FailureReason.ConstraintViolation.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[FailureReason.InvalidMandateState.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[FailureReason.UnknownError.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            private static final /* synthetic */ FailureReason[] $values() {
                return new FailureReason[]{Rejected, ProviderError, ProviderRejected, InternalServerError, Canceled, Expired, AuthorizationFailed, InvalidRequest, InsufficientFunds, InvalidSortCode, MandateRevoked, ConstraintViolation, InvalidMandateState, UnknownError};
            }

            public static EnumEntries<FailureReason> getEntries() {
                return $ENTRIES;
            }

            public static FailureReason valueOf(String str) {
                return (FailureReason) Enum.valueOf(FailureReason.class, str);
            }

            public static FailureReason[] values() {
                return (FailureReason[]) $VALUES.clone();
            }

            private FailureReason(String str, int i, String str2) {
                this.raw = str2;
            }

            public final String getRaw() {
                return this.raw;
            }

            static {
                FailureReason[] failureReasonArr$values = $values();
                $VALUES = failureReasonArr$values;
                $ENTRIES = EnumEntries2.enumEntries(failureReasonArr$values);
                INSTANCE = new Companion(null);
            }

            public final PaymentFailureReason intoPaymentFailureReason() {
                switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                    case 1:
                        return PaymentFailureReason.Rejected;
                    case 2:
                        return PaymentFailureReason.ProviderError;
                    case 3:
                        return PaymentFailureReason.ProviderRejected;
                    case 4:
                        return PaymentFailureReason.InternalServerError;
                    case 5:
                        return PaymentFailureReason.Canceled;
                    case 6:
                        return PaymentFailureReason.Expired;
                    case 7:
                        return PaymentFailureReason.AuthorizationFailed;
                    case 8:
                        return PaymentFailureReason.InvalidRequest;
                    case 9:
                        return PaymentFailureReason.InsufficientFunds;
                    case 10:
                        return PaymentFailureReason.InvalidSortCode;
                    case 11:
                        return PaymentFailureReason.MandateRevoked;
                    case 12:
                        return PaymentFailureReason.ConstraintViolation;
                    case 13:
                        return PaymentFailureReason.InvalidMandateState;
                    case 14:
                        return PaymentFailureReason.UnknownError;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }

            /* compiled from: AuthorizationFlowResponse.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureReason$Companion;", "", "()V", "from", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureReason;", "value", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final FailureReason from(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    for (FailureReason failureReason : FailureReason.values()) {
                        if (Intrinsics.areEqual(failureReason.getRaw(), value)) {
                            return failureReason;
                        }
                    }
                    return FailureReason.UnknownError;
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AuthorizationFlowResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureStage;", "", ResourceTypes.RAW, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRaw", "()Ljava/lang/String;", "AuthorizationRequired", "Authorizing", "Authorized", "Unknown", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class FailureStage {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ FailureStage[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String raw;
            public static final FailureStage AuthorizationRequired = new FailureStage("AuthorizationRequired", 0, "authorization_required");
            public static final FailureStage Authorizing = new FailureStage("Authorizing", 1, "authorizing");
            public static final FailureStage Authorized = new FailureStage("Authorized", 2, "authorized");
            public static final FailureStage Unknown = new FailureStage("Unknown", 3, "unknown");

            private static final /* synthetic */ FailureStage[] $values() {
                return new FailureStage[]{AuthorizationRequired, Authorizing, Authorized, Unknown};
            }

            public static EnumEntries<FailureStage> getEntries() {
                return $ENTRIES;
            }

            public static FailureStage valueOf(String str) {
                return (FailureStage) Enum.valueOf(FailureStage.class, str);
            }

            public static FailureStage[] values() {
                return (FailureStage[]) $VALUES.clone();
            }

            private FailureStage(String str, int i, String str2) {
                this.raw = str2;
            }

            public final String getRaw() {
                return this.raw;
            }

            static {
                FailureStage[] failureStageArr$values = $values();
                $VALUES = failureStageArr$values;
                $ENTRIES = EnumEntries2.enumEntries(failureStageArr$values);
                INSTANCE = new Companion(null);
            }

            /* compiled from: AuthorizationFlowResponse.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureStage$Companion;", "", "()V", "from", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed$FailureStage;", "value", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final FailureStage from(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    for (FailureStage failureStage : FailureStage.values()) {
                        if (Intrinsics.areEqual(failureStage.getRaw(), value)) {
                            return failureStage;
                        }
                    }
                    return FailureStage.Unknown;
                }
            }
        }
    }

    /* compiled from: AuthorizationFlowResponse.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$Companion;", "", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}

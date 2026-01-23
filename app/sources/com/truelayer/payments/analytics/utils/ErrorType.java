package com.truelayer.payments.analytics.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/truelayer/payments/analytics/utils/ErrorType;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "Connection", "CertificateValidation", "Validation", "Authentication", "InvalidParameters", "InvalidState", "Provider", "ProviderUnavailable", "Server", "PaymentFailed", "PaymentAuthorizationFailed", "ActivityNotFound", "FlowCoordinatorInconsistency", "ParseFailed", "Forbidden", "NotFound", "IdempotencyKeyConcurrencyConflict", "IdempotencyKeyReuse", "MissingReturnUri", "Unknown", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ErrorType[] $VALUES;
    private final String key;
    public static final ErrorType Connection = new ErrorType("Connection", 0, "ConnectionError");
    public static final ErrorType CertificateValidation = new ErrorType("CertificateValidation", 1, "CertificateValidationError");
    public static final ErrorType Validation = new ErrorType("Validation", 2, "ValidationError");
    public static final ErrorType Authentication = new ErrorType("Authentication", 3, "AuthenticationError");
    public static final ErrorType InvalidParameters = new ErrorType("InvalidParameters", 4, "InvalidParametersError");
    public static final ErrorType InvalidState = new ErrorType("InvalidState", 5, "InvalidStateError");
    public static final ErrorType Provider = new ErrorType("Provider", 6, "ProviderError");
    public static final ErrorType ProviderUnavailable = new ErrorType("ProviderUnavailable", 7, "ProviderUnavailable");
    public static final ErrorType Server = new ErrorType("Server", 8, "ServerError");
    public static final ErrorType PaymentFailed = new ErrorType("PaymentFailed", 9, "PaymentError");
    public static final ErrorType PaymentAuthorizationFailed = new ErrorType("PaymentAuthorizationFailed", 10, "PaymentAuthorizationError");
    public static final ErrorType ActivityNotFound = new ErrorType("ActivityNotFound", 11, "ActivityNotFoundError");
    public static final ErrorType FlowCoordinatorInconsistency = new ErrorType("FlowCoordinatorInconsistency", 12, "FlowCoordinatorError");
    public static final ErrorType ParseFailed = new ErrorType("ParseFailed", 13, "ParseError");
    public static final ErrorType Forbidden = new ErrorType("Forbidden", 14, "ForbiddenError");
    public static final ErrorType NotFound = new ErrorType("NotFound", 15, "NotFoundError");
    public static final ErrorType IdempotencyKeyConcurrencyConflict = new ErrorType("IdempotencyKeyConcurrencyConflict", 16, "IdempotencyKeyConcurrencyConflictError");
    public static final ErrorType IdempotencyKeyReuse = new ErrorType("IdempotencyKeyReuse", 17, "IdempotencyKeyReuseError");
    public static final ErrorType MissingReturnUri = new ErrorType("MissingReturnUri", 18, "MissingReturnUri");
    public static final ErrorType Unknown = new ErrorType("Unknown", 19, "UnexpectedError");

    private static final /* synthetic */ ErrorType[] $values() {
        return new ErrorType[]{Connection, CertificateValidation, Validation, Authentication, InvalidParameters, InvalidState, Provider, ProviderUnavailable, Server, PaymentFailed, PaymentAuthorizationFailed, ActivityNotFound, FlowCoordinatorInconsistency, ParseFailed, Forbidden, NotFound, IdempotencyKeyConcurrencyConflict, IdempotencyKeyReuse, MissingReturnUri, Unknown};
    }

    public static EnumEntries<ErrorType> getEntries() {
        return $ENTRIES;
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) $VALUES.clone();
    }

    private ErrorType(String str, int i, String str2) {
        this.key = str2;
    }

    public final String getKey() {
        return this.key;
    }

    static {
        ErrorType[] errorTypeArr$values = $values();
        $VALUES = errorTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(errorTypeArr$values);
        INSTANCE = new Companion(null);
    }
}

package com.truelayer.payments.core.domain.errors;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.truelayer.payments.core.domain.utils.DefaultValue;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CoreError.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00162\u00020\u0001:\u0005\u0015\u0016\u0017\u0018\u0019BK\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0014\u0082\u0001\u0004\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/errors/CoreError;", "", "message", "", "cause", "", "responseBody", "traceId", "endpoint", "underlyingError", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCause", "()Ljava/lang/Throwable;", "getEndpoint", "()Ljava/lang/String;", "getMessage", "getResponseBody", "getTraceId", "getUnderlyingError", "setUnderlyingError", "(Ljava/lang/String;)V", "CertificateValidationError", "Companion", "ConnectionError", "HttpError", "ValidationError", "Lcom/truelayer/payments/core/domain/errors/CoreError$CertificateValidationError;", "Lcom/truelayer/payments/core/domain/errors/CoreError$ConnectionError;", "Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError;", "Lcom/truelayer/payments/core/domain/errors/CoreError$ValidationError;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class CoreError {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Throwable cause;
    private final String endpoint;
    private final String message;
    private final String responseBody;
    private final String traceId;
    private String underlyingError;

    public /* synthetic */ CoreError(String str, Throwable th, String str2, String str3, String str4, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th, str2, str3, str4, str5);
    }

    private CoreError(String str, Throwable th, String str2, String str3, String str4, String str5) {
        this.message = str;
        this.cause = th;
        this.responseBody = str2;
        this.traceId = str3;
        this.endpoint = str4;
        this.underlyingError = str5;
    }

    public /* synthetic */ CoreError(String str, Throwable th, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, null);
    }

    public final String getMessage() {
        return this.message;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String getResponseBody() {
        return this.responseBody;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public String getUnderlyingError() {
        return this.underlyingError;
    }

    public void setUnderlyingError(String str) {
        this.underlyingError = str;
    }

    /* compiled from: CoreError.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/errors/CoreError$ConnectionError;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "cause", "", "responseBody", "", "traceId", "endpoint", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCause", "()Ljava/lang/Throwable;", "getEndpoint", "()Ljava/lang/String;", "getResponseBody", "getTraceId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class ConnectionError extends CoreError {
        private final Throwable cause;
        private final String endpoint;
        private final String responseBody;
        private final String traceId;

        public static /* synthetic */ ConnectionError copy$default(ConnectionError connectionError, Throwable th, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                th = connectionError.cause;
            }
            if ((i & 2) != 0) {
                str = connectionError.responseBody;
            }
            if ((i & 4) != 0) {
                str2 = connectionError.traceId;
            }
            if ((i & 8) != 0) {
                str3 = connectionError.endpoint;
            }
            return connectionError.copy(th, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component2, reason: from getter */
        public final String getResponseBody() {
            return this.responseBody;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTraceId() {
            return this.traceId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEndpoint() {
            return this.endpoint;
        }

        public final ConnectionError copy(Throwable cause, String responseBody, String traceId, String endpoint) {
            return new ConnectionError(cause, responseBody, traceId, endpoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConnectionError)) {
                return false;
            }
            ConnectionError connectionError = (ConnectionError) other;
            return Intrinsics.areEqual(this.cause, connectionError.cause) && Intrinsics.areEqual(this.responseBody, connectionError.responseBody) && Intrinsics.areEqual(this.traceId, connectionError.traceId) && Intrinsics.areEqual(this.endpoint, connectionError.endpoint);
        }

        public int hashCode() {
            Throwable th = this.cause;
            int iHashCode = (th == null ? 0 : th.hashCode()) * 31;
            String str = this.responseBody;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.traceId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.endpoint;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "ConnectionError(cause=" + this.cause + ", responseBody=" + this.responseBody + ", traceId=" + this.traceId + ", endpoint=" + this.endpoint + ")";
        }

        public /* synthetic */ ConnectionError(Throwable th, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, str3);
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public Throwable getCause() {
            return this.cause;
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public String getResponseBody() {
            return this.responseBody;
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public String getTraceId() {
            return this.traceId;
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public String getEndpoint() {
            return this.endpoint;
        }

        public ConnectionError(Throwable th, String str, String str2, String str3) {
            super("Connection error occurred.", th, str, str2, str3, null, 32, null);
            this.cause = th;
            this.responseBody = str;
            this.traceId = str2;
            this.endpoint = str3;
        }
    }

    /* compiled from: CoreError.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/errors/CoreError$CertificateValidationError;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "cause", "", "responseBody", "", "traceId", "endpoint", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCause", "()Ljava/lang/Throwable;", "getEndpoint", "()Ljava/lang/String;", "getResponseBody", "getTraceId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class CertificateValidationError extends CoreError {
        private final Throwable cause;
        private final String endpoint;
        private final String responseBody;
        private final String traceId;

        public static /* synthetic */ CertificateValidationError copy$default(CertificateValidationError certificateValidationError, Throwable th, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                th = certificateValidationError.cause;
            }
            if ((i & 2) != 0) {
                str = certificateValidationError.responseBody;
            }
            if ((i & 4) != 0) {
                str2 = certificateValidationError.traceId;
            }
            if ((i & 8) != 0) {
                str3 = certificateValidationError.endpoint;
            }
            return certificateValidationError.copy(th, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component2, reason: from getter */
        public final String getResponseBody() {
            return this.responseBody;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTraceId() {
            return this.traceId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEndpoint() {
            return this.endpoint;
        }

        public final CertificateValidationError copy(Throwable cause, String responseBody, String traceId, String endpoint) {
            return new CertificateValidationError(cause, responseBody, traceId, endpoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CertificateValidationError)) {
                return false;
            }
            CertificateValidationError certificateValidationError = (CertificateValidationError) other;
            return Intrinsics.areEqual(this.cause, certificateValidationError.cause) && Intrinsics.areEqual(this.responseBody, certificateValidationError.responseBody) && Intrinsics.areEqual(this.traceId, certificateValidationError.traceId) && Intrinsics.areEqual(this.endpoint, certificateValidationError.endpoint);
        }

        public int hashCode() {
            Throwable th = this.cause;
            int iHashCode = (th == null ? 0 : th.hashCode()) * 31;
            String str = this.responseBody;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.traceId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.endpoint;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "CertificateValidationError(cause=" + this.cause + ", responseBody=" + this.responseBody + ", traceId=" + this.traceId + ", endpoint=" + this.endpoint + ")";
        }

        public /* synthetic */ CertificateValidationError(Throwable th, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, str3);
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public Throwable getCause() {
            return this.cause;
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public String getResponseBody() {
            return this.responseBody;
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public String getTraceId() {
            return this.traceId;
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public String getEndpoint() {
            return this.endpoint;
        }

        public CertificateValidationError(Throwable th, String str, String str2, String str3) {
            super("Server certificates are not valid. Unable to establish secure connection.", th, str, str2, str3, null, 32, null);
            this.cause = th;
            this.responseBody = str;
            this.traceId = str2;
            this.endpoint = str3;
        }
    }

    /* compiled from: CoreError.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/truelayer/payments/core/domain/errors/CoreError$ValidationError;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "cause", "", "responseBody", "", "traceId", "endpoint", "underlyingError", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCause", "()Ljava/lang/Throwable;", "getEndpoint", "()Ljava/lang/String;", "getResponseBody", "getTraceId", "getUnderlyingError", "setUnderlyingError", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class ValidationError extends CoreError {
        private final Throwable cause;
        private final String endpoint;
        private final String responseBody;
        private final String traceId;
        private String underlyingError;

        public static /* synthetic */ ValidationError copy$default(ValidationError validationError, Throwable th, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                th = validationError.cause;
            }
            if ((i & 2) != 0) {
                str = validationError.responseBody;
            }
            if ((i & 4) != 0) {
                str2 = validationError.traceId;
            }
            if ((i & 8) != 0) {
                str3 = validationError.endpoint;
            }
            if ((i & 16) != 0) {
                str4 = validationError.underlyingError;
            }
            String str5 = str4;
            String str6 = str2;
            return validationError.copy(th, str, str6, str3, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component2, reason: from getter */
        public final String getResponseBody() {
            return this.responseBody;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTraceId() {
            return this.traceId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEndpoint() {
            return this.endpoint;
        }

        /* renamed from: component5, reason: from getter */
        public final String getUnderlyingError() {
            return this.underlyingError;
        }

        public final ValidationError copy(Throwable cause, String responseBody, String traceId, String endpoint, String underlyingError) {
            return new ValidationError(cause, responseBody, traceId, endpoint, underlyingError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidationError)) {
                return false;
            }
            ValidationError validationError = (ValidationError) other;
            return Intrinsics.areEqual(this.cause, validationError.cause) && Intrinsics.areEqual(this.responseBody, validationError.responseBody) && Intrinsics.areEqual(this.traceId, validationError.traceId) && Intrinsics.areEqual(this.endpoint, validationError.endpoint) && Intrinsics.areEqual(this.underlyingError, validationError.underlyingError);
        }

        public int hashCode() {
            Throwable th = this.cause;
            int iHashCode = (th == null ? 0 : th.hashCode()) * 31;
            String str = this.responseBody;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.traceId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.endpoint;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.underlyingError;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "ValidationError(cause=" + this.cause + ", responseBody=" + this.responseBody + ", traceId=" + this.traceId + ", endpoint=" + this.endpoint + ", underlyingError=" + this.underlyingError + ")";
        }

        public /* synthetic */ ValidationError(Throwable th, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, str3, (i & 16) != 0 ? null : str4);
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public Throwable getCause() {
            return this.cause;
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public String getResponseBody() {
            return this.responseBody;
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public String getTraceId() {
            return this.traceId;
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public String getEndpoint() {
            return this.endpoint;
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public String getUnderlyingError() {
            return this.underlyingError;
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public void setUnderlyingError(String str) {
            this.underlyingError = str;
        }

        public ValidationError(Throwable th, String str, String str2, String str3, String str4) {
            super("Validation error occurred.", th, str, str2, str3, str4, null);
            this.cause = th;
            this.responseBody = str;
            this.traceId = str2;
            this.endpoint = str3;
            this.underlyingError = str4;
        }
    }

    /* compiled from: CoreError.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019BE\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\n\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\t\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u001a\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "httpStatusCode", "", "type", "Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError$ServerErrorType;", "autoRetry", "responseBody", "", "traceId", "endpoint", "(ILcom/truelayer/payments/core/domain/errors/CoreError$HttpError$ServerErrorType;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAutoRetry", "()I", "getEndpoint", "()Ljava/lang/String;", "getHttpStatusCode", "setHttpStatusCode", "(I)V", "getResponseBody", "getTraceId", "getType", "()Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError$ServerErrorType;", "InvalidParameters", "ServerError", "ServerErrorType", "Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError$InvalidParameters;", "Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError$ServerError;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static abstract class HttpError extends CoreError {
        private final int autoRetry;
        private final String endpoint;
        private int httpStatusCode;
        private final String responseBody;
        private final String traceId;
        private final ServerErrorType type;

        public /* synthetic */ HttpError(int i, ServerErrorType serverErrorType, int i2, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, serverErrorType, i2, str, str2, str3);
        }

        public int getHttpStatusCode() {
            return this.httpStatusCode;
        }

        public void setHttpStatusCode(int i) {
            this.httpStatusCode = i;
        }

        public /* synthetic */ HttpError(int i, ServerErrorType serverErrorType, int i2, String str, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? ServerErrorType.UnknownError : serverErrorType, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2, str3, null);
        }

        public ServerErrorType getType() {
            return this.type;
        }

        public int getAutoRetry() {
            return this.autoRetry;
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public String getResponseBody() {
            return this.responseBody;
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public String getTraceId() {
            return this.traceId;
        }

        @Override // com.truelayer.payments.core.domain.errors.CoreError
        public String getEndpoint() {
            return this.endpoint;
        }

        private HttpError(int i, ServerErrorType serverErrorType, int i2, String str, String str2, String str3) {
            super("Http error occurred.", null, str, str2, str3, null, 34, null);
            this.httpStatusCode = i;
            this.type = serverErrorType;
            this.autoRetry = i2;
            this.responseBody = str;
            this.traceId = str2;
            this.endpoint = str3;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CoreError.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError$ServerErrorType;", "", "(Ljava/lang/String;I)V", "InvalidState", "InvalidParameters", "Unauthenticated", "Forbidden", "NotFound", "IdempotencyKeyConcurrencyConflict", "IdempotencyKeyReuse", "ProviderError", "UnknownError", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class ServerErrorType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ServerErrorType[] $VALUES;
            public static final ServerErrorType InvalidState = new ServerErrorType("InvalidState", 0);
            public static final ServerErrorType InvalidParameters = new ServerErrorType("InvalidParameters", 1);
            public static final ServerErrorType Unauthenticated = new ServerErrorType("Unauthenticated", 2);
            public static final ServerErrorType Forbidden = new ServerErrorType("Forbidden", 3);
            public static final ServerErrorType NotFound = new ServerErrorType("NotFound", 4);
            public static final ServerErrorType IdempotencyKeyConcurrencyConflict = new ServerErrorType("IdempotencyKeyConcurrencyConflict", 5);
            public static final ServerErrorType IdempotencyKeyReuse = new ServerErrorType("IdempotencyKeyReuse", 6);
            public static final ServerErrorType ProviderError = new ServerErrorType("ProviderError", 7);
            public static final ServerErrorType UnknownError = new ServerErrorType("UnknownError", 8);

            private static final /* synthetic */ ServerErrorType[] $values() {
                return new ServerErrorType[]{InvalidState, InvalidParameters, Unauthenticated, Forbidden, NotFound, IdempotencyKeyConcurrencyConflict, IdempotencyKeyReuse, ProviderError, UnknownError};
            }

            public static EnumEntries<ServerErrorType> getEntries() {
                return $ENTRIES;
            }

            public static ServerErrorType valueOf(String str) {
                return (ServerErrorType) Enum.valueOf(ServerErrorType.class, str);
            }

            public static ServerErrorType[] values() {
                return (ServerErrorType[]) $VALUES.clone();
            }

            private ServerErrorType(String str, int i) {
            }

            static {
                ServerErrorType[] serverErrorTypeArr$values = $values();
                $VALUES = serverErrorTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(serverErrorTypeArr$values);
            }
        }

        /* compiled from: CoreError.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\rJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J_\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError$ServerError;", "Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError;", "httpStatusCode", "", "type", "Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError$ServerErrorType;", "responseBody", "", "traceId", "autoRetry", "endpoint", "title", "description", "(ILcom/truelayer/payments/core/domain/errors/CoreError$HttpError$ServerErrorType;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAutoRetry", "()I", "getDescription", "()Ljava/lang/String;", "getEndpoint", "getHttpStatusCode", "setHttpStatusCode", "(I)V", "getResponseBody", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getTraceId", "getType", "()Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError$ServerErrorType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class ServerError extends HttpError {
            private final int autoRetry;
            private final String description;
            private final String endpoint;
            private int httpStatusCode;
            private final String responseBody;
            private String title;
            private final String traceId;
            private final ServerErrorType type;

            public static /* synthetic */ ServerError copy$default(ServerError serverError, int i, ServerErrorType serverErrorType, String str, String str2, int i2, String str3, String str4, String str5, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = serverError.httpStatusCode;
                }
                if ((i3 & 2) != 0) {
                    serverErrorType = serverError.type;
                }
                if ((i3 & 4) != 0) {
                    str = serverError.responseBody;
                }
                if ((i3 & 8) != 0) {
                    str2 = serverError.traceId;
                }
                if ((i3 & 16) != 0) {
                    i2 = serverError.autoRetry;
                }
                if ((i3 & 32) != 0) {
                    str3 = serverError.endpoint;
                }
                if ((i3 & 64) != 0) {
                    str4 = serverError.title;
                }
                if ((i3 & 128) != 0) {
                    str5 = serverError.description;
                }
                String str6 = str4;
                String str7 = str5;
                int i4 = i2;
                String str8 = str3;
                return serverError.copy(i, serverErrorType, str, str2, i4, str8, str6, str7);
            }

            /* renamed from: component1, reason: from getter */
            public final int getHttpStatusCode() {
                return this.httpStatusCode;
            }

            /* renamed from: component2, reason: from getter */
            public final ServerErrorType getType() {
                return this.type;
            }

            /* renamed from: component3, reason: from getter */
            public final String getResponseBody() {
                return this.responseBody;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTraceId() {
                return this.traceId;
            }

            /* renamed from: component5, reason: from getter */
            public final int getAutoRetry() {
                return this.autoRetry;
            }

            /* renamed from: component6, reason: from getter */
            public final String getEndpoint() {
                return this.endpoint;
            }

            /* renamed from: component7, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component8, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final ServerError copy(int httpStatusCode, ServerErrorType type2, String responseBody, String traceId, int autoRetry, String endpoint, String title, String description) {
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                return new ServerError(httpStatusCode, type2, responseBody, traceId, autoRetry, endpoint, title, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ServerError)) {
                    return false;
                }
                ServerError serverError = (ServerError) other;
                return this.httpStatusCode == serverError.httpStatusCode && this.type == serverError.type && Intrinsics.areEqual(this.responseBody, serverError.responseBody) && Intrinsics.areEqual(this.traceId, serverError.traceId) && this.autoRetry == serverError.autoRetry && Intrinsics.areEqual(this.endpoint, serverError.endpoint) && Intrinsics.areEqual(this.title, serverError.title) && Intrinsics.areEqual(this.description, serverError.description);
            }

            public int hashCode() {
                int iHashCode = ((Integer.hashCode(this.httpStatusCode) * 31) + this.type.hashCode()) * 31;
                String str = this.responseBody;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.traceId;
                int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.autoRetry)) * 31;
                String str3 = this.endpoint;
                return ((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.description.hashCode();
            }

            public String toString() {
                return "ServerError(httpStatusCode=" + this.httpStatusCode + ", type=" + this.type + ", responseBody=" + this.responseBody + ", traceId=" + this.traceId + ", autoRetry=" + this.autoRetry + ", endpoint=" + this.endpoint + ", title=" + this.title + ", description=" + this.description + ")";
            }

            public /* synthetic */ ServerError(int i, ServerErrorType serverErrorType, String str, String str2, int i2, String str3, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, serverErrorType, str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? 0 : i2, str3, str4, str5);
            }

            @Override // com.truelayer.payments.core.domain.errors.CoreError.HttpError
            public int getHttpStatusCode() {
                return this.httpStatusCode;
            }

            @Override // com.truelayer.payments.core.domain.errors.CoreError.HttpError
            public void setHttpStatusCode(int i) {
                this.httpStatusCode = i;
            }

            @Override // com.truelayer.payments.core.domain.errors.CoreError.HttpError
            public ServerErrorType getType() {
                return this.type;
            }

            @Override // com.truelayer.payments.core.domain.errors.CoreError.HttpError, com.truelayer.payments.core.domain.errors.CoreError
            public String getResponseBody() {
                return this.responseBody;
            }

            @Override // com.truelayer.payments.core.domain.errors.CoreError.HttpError, com.truelayer.payments.core.domain.errors.CoreError
            public String getTraceId() {
                return this.traceId;
            }

            @Override // com.truelayer.payments.core.domain.errors.CoreError.HttpError
            public int getAutoRetry() {
                return this.autoRetry;
            }

            @Override // com.truelayer.payments.core.domain.errors.CoreError.HttpError, com.truelayer.payments.core.domain.errors.CoreError
            public String getEndpoint() {
                return this.endpoint;
            }

            public final String getTitle() {
                return this.title;
            }

            public final void setTitle(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.title = str;
            }

            public final String getDescription() {
                return this.description;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ServerError(int i, ServerErrorType type2, String str, String str2, int i2, String str3, String title, String description) {
                super(i, type2, i2, str, str2, str3, null);
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                this.httpStatusCode = i;
                this.type = type2;
                this.responseBody = str;
                this.traceId = str2;
                this.autoRetry = i2;
                this.endpoint = str3;
                this.title = title;
                this.description = description;
            }
        }

        /* compiled from: CoreError.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\f¢\u0006\u0002\u0010\u000eJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u001b\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fHÆ\u0003Jq\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0006\u0010.\u001a\u00020\u0005J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R#\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError$InvalidParameters;", "Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError;", "httpStatusCode", "", "responseBody", "", "traceId", "autoRetry", "endpoint", "title", "description", "invalidParameters", "", "", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAutoRetry", "()I", "getDescription", "()Ljava/lang/String;", "getEndpoint", "getHttpStatusCode", "setHttpStatusCode", "(I)V", "getInvalidParameters", "()Ljava/util/Map;", "getResponseBody", "getTitle", "getTraceId", "type", "Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError$ServerErrorType;", "getType", "()Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError$ServerErrorType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "invalidParametersToString", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class InvalidParameters extends HttpError {
            private final int autoRetry;
            private final String description;
            private final String endpoint;
            private int httpStatusCode;
            private final Map<String, List<String>> invalidParameters;
            private final String responseBody;
            private final String title;
            private final String traceId;

            public static /* synthetic */ InvalidParameters copy$default(InvalidParameters invalidParameters, int i, String str, String str2, int i2, String str3, String str4, String str5, Map map, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = invalidParameters.httpStatusCode;
                }
                if ((i3 & 2) != 0) {
                    str = invalidParameters.responseBody;
                }
                if ((i3 & 4) != 0) {
                    str2 = invalidParameters.traceId;
                }
                if ((i3 & 8) != 0) {
                    i2 = invalidParameters.autoRetry;
                }
                if ((i3 & 16) != 0) {
                    str3 = invalidParameters.endpoint;
                }
                if ((i3 & 32) != 0) {
                    str4 = invalidParameters.title;
                }
                if ((i3 & 64) != 0) {
                    str5 = invalidParameters.description;
                }
                if ((i3 & 128) != 0) {
                    map = invalidParameters.invalidParameters;
                }
                String str6 = str5;
                Map map2 = map;
                String str7 = str3;
                String str8 = str4;
                return invalidParameters.copy(i, str, str2, i2, str7, str8, str6, map2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getHttpStatusCode() {
                return this.httpStatusCode;
            }

            /* renamed from: component2, reason: from getter */
            public final String getResponseBody() {
                return this.responseBody;
            }

            /* renamed from: component3, reason: from getter */
            public final String getTraceId() {
                return this.traceId;
            }

            /* renamed from: component4, reason: from getter */
            public final int getAutoRetry() {
                return this.autoRetry;
            }

            /* renamed from: component5, reason: from getter */
            public final String getEndpoint() {
                return this.endpoint;
            }

            /* renamed from: component6, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component7, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final Map<String, List<String>> component8() {
                return this.invalidParameters;
            }

            public final InvalidParameters copy(int httpStatusCode, String responseBody, String traceId, int autoRetry, String endpoint, String title, String description, Map<String, ? extends List<String>> invalidParameters) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(invalidParameters, "invalidParameters");
                return new InvalidParameters(httpStatusCode, responseBody, traceId, autoRetry, endpoint, title, description, invalidParameters);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InvalidParameters)) {
                    return false;
                }
                InvalidParameters invalidParameters = (InvalidParameters) other;
                return this.httpStatusCode == invalidParameters.httpStatusCode && Intrinsics.areEqual(this.responseBody, invalidParameters.responseBody) && Intrinsics.areEqual(this.traceId, invalidParameters.traceId) && this.autoRetry == invalidParameters.autoRetry && Intrinsics.areEqual(this.endpoint, invalidParameters.endpoint) && Intrinsics.areEqual(this.title, invalidParameters.title) && Intrinsics.areEqual(this.description, invalidParameters.description) && Intrinsics.areEqual(this.invalidParameters, invalidParameters.invalidParameters);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.httpStatusCode) * 31;
                String str = this.responseBody;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.traceId;
                int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.autoRetry)) * 31;
                String str3 = this.endpoint;
                return ((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.invalidParameters.hashCode();
            }

            public String toString() {
                return "InvalidParameters(httpStatusCode=" + this.httpStatusCode + ", responseBody=" + this.responseBody + ", traceId=" + this.traceId + ", autoRetry=" + this.autoRetry + ", endpoint=" + this.endpoint + ", title=" + this.title + ", description=" + this.description + ", invalidParameters=" + this.invalidParameters + ")";
            }

            @Override // com.truelayer.payments.core.domain.errors.CoreError.HttpError
            public int getHttpStatusCode() {
                return this.httpStatusCode;
            }

            @Override // com.truelayer.payments.core.domain.errors.CoreError.HttpError
            public void setHttpStatusCode(int i) {
                this.httpStatusCode = i;
            }

            @Override // com.truelayer.payments.core.domain.errors.CoreError.HttpError, com.truelayer.payments.core.domain.errors.CoreError
            public String getResponseBody() {
                return this.responseBody;
            }

            @Override // com.truelayer.payments.core.domain.errors.CoreError.HttpError, com.truelayer.payments.core.domain.errors.CoreError
            public String getTraceId() {
                return this.traceId;
            }

            @Override // com.truelayer.payments.core.domain.errors.CoreError.HttpError
            public int getAutoRetry() {
                return this.autoRetry;
            }

            @Override // com.truelayer.payments.core.domain.errors.CoreError.HttpError, com.truelayer.payments.core.domain.errors.CoreError
            public String getEndpoint() {
                return this.endpoint;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getDescription() {
                return this.description;
            }

            public /* synthetic */ InvalidParameters(int i, String str, String str2, int i2, String str3, String str4, String str5, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? 0 : i2, str3, str4, str5, (i3 & 128) != 0 ? MapsKt.emptyMap() : map);
            }

            public final Map<String, List<String>> getInvalidParameters() {
                return this.invalidParameters;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public InvalidParameters(int i, String str, String str2, int i2, String str3, String title, String description, Map<String, ? extends List<String>> invalidParameters) {
                super(i, null, i2, str, str2, str3, 2, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(invalidParameters, "invalidParameters");
                this.httpStatusCode = i;
                this.responseBody = str;
                this.traceId = str2;
                this.autoRetry = i2;
                this.endpoint = str3;
                this.title = title;
                this.description = description;
                this.invalidParameters = invalidParameters;
            }

            @Override // com.truelayer.payments.core.domain.errors.CoreError.HttpError
            public ServerErrorType getType() {
                return ServerErrorType.InvalidParameters;
            }

            public final String invalidParametersToString() {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, List<String>> entry : this.invalidParameters.entrySet()) {
                    sb.append(((Object) entry.getKey()) + ":\n");
                    Iterator<T> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        sb.append("  - " + ((String) it.next()) + "\n");
                    }
                }
                String string2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return string2;
            }
        }
    }

    /* compiled from: CoreError.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/errors/CoreError$Companion;", "Lcom/truelayer/payments/core/domain/utils/DefaultValue;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError$ServerError;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion implements DefaultValue<CoreError> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.truelayer.payments.core.domain.utils.DefaultValue
        /* renamed from: default, reason: not valid java name */
        public CoreError mo27021default() {
            return new HttpError.ServerError(500, HttpError.ServerErrorType.UnknownError, "", null, 0, null, "Unknown error", "", 24, null);
        }
    }
}

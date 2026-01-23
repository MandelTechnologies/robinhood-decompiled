package com.truelayer.payments.core.network;

import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.TrueLayerCore;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.utils.IntoCoreError;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkError.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0014\u0015\u0016\u0017B?\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u0082\u0001\u0004\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/truelayer/payments/core/network/NetworkError;", "E", "Lcom/truelayer/payments/core/domain/utils/IntoCoreError;", "message", "", "cause", "", "responseBody", "traceId", "endpoint", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCause", "()Ljava/lang/Throwable;", "getEndpoint", "()Ljava/lang/String;", "getMessage", "getResponseBody", "getTraceId", "intoCoreError", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "CertificateValidationError", "ConnectionError", "HttpError", "ValidationError", "Lcom/truelayer/payments/core/network/NetworkError$CertificateValidationError;", "Lcom/truelayer/payments/core/network/NetworkError$ConnectionError;", "Lcom/truelayer/payments/core/network/NetworkError$HttpError;", "Lcom/truelayer/payments/core/network/NetworkError$ValidationError;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class NetworkError<E> implements IntoCoreError {
    private final Throwable cause;
    private final String endpoint;
    private final String message;
    private final String responseBody;
    private final String traceId;

    public /* synthetic */ NetworkError(String str, Throwable th, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th, str2, str3, str4);
    }

    private NetworkError(String str, Throwable th, String str2, String str3, String str4) {
        this.message = str;
        this.cause = th;
        this.responseBody = str2;
        this.traceId = str3;
        this.endpoint = str4;
    }

    public /* synthetic */ NetworkError(String str, Throwable th, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, null);
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

    /* compiled from: NetworkError.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J?\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/truelayer/payments/core/network/NetworkError$ConnectionError;", "E", "Lcom/truelayer/payments/core/network/NetworkError;", "cause", "", "responseBody", "", "traceId", "endpoint", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCause", "()Ljava/lang/Throwable;", "setCause", "(Ljava/lang/Throwable;)V", "getEndpoint", "()Ljava/lang/String;", "getResponseBody", "getTraceId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class ConnectionError<E> extends NetworkError<E> {
        private Throwable cause;
        private final String endpoint;
        private final String responseBody;
        private final String traceId;

        public ConnectionError() {
            this(null, null, null, null, 15, null);
        }

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

        public final ConnectionError<E> copy(Throwable cause, String responseBody, String traceId, String endpoint) {
            return new ConnectionError<>(cause, responseBody, traceId, endpoint);
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
            this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public Throwable getCause() {
            return this.cause;
        }

        public void setCause(Throwable th) {
            this.cause = th;
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public String getResponseBody() {
            return this.responseBody;
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public String getTraceId() {
            return this.traceId;
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public String getEndpoint() {
            return this.endpoint;
        }

        public ConnectionError(Throwable th, String str, String str2, String str3) {
            super("Connection error occurred.", th, str, str2, null, 16, null);
            this.cause = th;
            this.responseBody = str;
            this.traceId = str2;
            this.endpoint = str3;
        }
    }

    /* compiled from: NetworkError.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J?\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/truelayer/payments/core/network/NetworkError$CertificateValidationError;", "E", "Lcom/truelayer/payments/core/network/NetworkError;", "cause", "", "responseBody", "", "traceId", "endpoint", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCause", "()Ljava/lang/Throwable;", "setCause", "(Ljava/lang/Throwable;)V", "getEndpoint", "()Ljava/lang/String;", "getResponseBody", "getTraceId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class CertificateValidationError<E> extends NetworkError<E> {
        private Throwable cause;
        private final String endpoint;
        private final String responseBody;
        private final String traceId;

        public CertificateValidationError() {
            this(null, null, null, null, 15, null);
        }

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

        public final CertificateValidationError<E> copy(Throwable cause, String responseBody, String traceId, String endpoint) {
            return new CertificateValidationError<>(cause, responseBody, traceId, endpoint);
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
            this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public Throwable getCause() {
            return this.cause;
        }

        public void setCause(Throwable th) {
            this.cause = th;
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public String getResponseBody() {
            return this.responseBody;
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public String getTraceId() {
            return this.traceId;
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public String getEndpoint() {
            return this.endpoint;
        }

        public CertificateValidationError(Throwable th, String str, String str2, String str3) {
            super("Server certificates are not valid. Unable to establish secure connection.", th, str, str2, null, 16, null);
            this.cause = th;
            this.responseBody = str;
            this.traceId = str2;
            this.endpoint = str3;
        }
    }

    /* compiled from: NetworkError.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J?\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/truelayer/payments/core/network/NetworkError$ValidationError;", "E", "Lcom/truelayer/payments/core/network/NetworkError;", "cause", "", "responseBody", "", "traceId", "endpoint", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCause", "()Ljava/lang/Throwable;", "setCause", "(Ljava/lang/Throwable;)V", "getEndpoint", "()Ljava/lang/String;", "getResponseBody", "getTraceId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class ValidationError<E> extends NetworkError<E> {
        private Throwable cause;
        private final String endpoint;
        private final String responseBody;
        private final String traceId;

        public ValidationError() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ ValidationError copy$default(ValidationError validationError, Throwable th, String str, String str2, String str3, int i, Object obj) {
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
            return validationError.copy(th, str, str2, str3);
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

        public final ValidationError<E> copy(Throwable cause, String responseBody, String traceId, String endpoint) {
            return new ValidationError<>(cause, responseBody, traceId, endpoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidationError)) {
                return false;
            }
            ValidationError validationError = (ValidationError) other;
            return Intrinsics.areEqual(this.cause, validationError.cause) && Intrinsics.areEqual(this.responseBody, validationError.responseBody) && Intrinsics.areEqual(this.traceId, validationError.traceId) && Intrinsics.areEqual(this.endpoint, validationError.endpoint);
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
            return "ValidationError(cause=" + this.cause + ", responseBody=" + this.responseBody + ", traceId=" + this.traceId + ", endpoint=" + this.endpoint + ")";
        }

        public /* synthetic */ ValidationError(Throwable th, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public Throwable getCause() {
            return this.cause;
        }

        public void setCause(Throwable th) {
            this.cause = th;
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public String getResponseBody() {
            return this.responseBody;
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public String getTraceId() {
            return this.traceId;
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public String getEndpoint() {
            return this.endpoint;
        }

        public ValidationError(Throwable th, String str, String str2, String str3) {
            super("Validation error occurred.", th, str, str2, str3, null);
            this.cause = th;
            this.responseBody = str;
            this.traceId = str2;
            this.endpoint = str3;
        }
    }

    /* compiled from: NetworkError.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BS\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003Jd\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0004HÖ\u0001J\b\u0010(\u001a\u00020)H\u0016J\t\u0010*\u001a\u00020\nHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\f\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0001¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006+"}, m3636d2 = {"Lcom/truelayer/payments/core/network/NetworkError$HttpError;", "E", "Lcom/truelayer/payments/core/network/NetworkError;", "status", "", "error", "", "response", "autoRetry", "responseBody", "", "traceId", "endpoint", "(ILjava/lang/Throwable;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAutoRetry", "()I", "getEndpoint", "()Ljava/lang/String;", "getError", "()Ljava/lang/Throwable;", "getResponse", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getResponseBody", "getStatus", "getTraceId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/Throwable;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/truelayer/payments/core/network/NetworkError$HttpError;", "equals", "", "other", "", "hashCode", "intoCoreError", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class HttpError<E> extends NetworkError<E> {
        private final int autoRetry;
        private final String endpoint;
        private final Throwable error;
        private final E response;
        private final String responseBody;
        private final int status;
        private final String traceId;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HttpError copy$default(HttpError httpError, int i, Throwable th, Object obj, int i2, String str, String str2, String str3, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                i = httpError.status;
            }
            if ((i3 & 2) != 0) {
                th = httpError.error;
            }
            E e = obj;
            if ((i3 & 4) != 0) {
                e = httpError.response;
            }
            if ((i3 & 8) != 0) {
                i2 = httpError.autoRetry;
            }
            if ((i3 & 16) != 0) {
                str = httpError.responseBody;
            }
            if ((i3 & 32) != 0) {
                str2 = httpError.traceId;
            }
            if ((i3 & 64) != 0) {
                str3 = httpError.endpoint;
            }
            String str4 = str2;
            String str5 = str3;
            String str6 = str;
            E e2 = e;
            return httpError.copy(i, th, e2, i2, str6, str4, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final E component3() {
            return this.response;
        }

        /* renamed from: component4, reason: from getter */
        public final int getAutoRetry() {
            return this.autoRetry;
        }

        /* renamed from: component5, reason: from getter */
        public final String getResponseBody() {
            return this.responseBody;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTraceId() {
            return this.traceId;
        }

        /* renamed from: component7, reason: from getter */
        public final String getEndpoint() {
            return this.endpoint;
        }

        public final HttpError<E> copy(int status, Throwable error, E response, int autoRetry, String responseBody, String traceId, String endpoint) {
            return new HttpError<>(status, error, response, autoRetry, responseBody, traceId, endpoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HttpError)) {
                return false;
            }
            HttpError httpError = (HttpError) other;
            return this.status == httpError.status && Intrinsics.areEqual(this.error, httpError.error) && Intrinsics.areEqual(this.response, httpError.response) && this.autoRetry == httpError.autoRetry && Intrinsics.areEqual(this.responseBody, httpError.responseBody) && Intrinsics.areEqual(this.traceId, httpError.traceId) && Intrinsics.areEqual(this.endpoint, httpError.endpoint);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.status) * 31;
            Throwable th = this.error;
            int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
            E e = this.response;
            int iHashCode3 = (((iHashCode2 + (e == null ? 0 : e.hashCode())) * 31) + Integer.hashCode(this.autoRetry)) * 31;
            String str = this.responseBody;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.traceId;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.endpoint;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "HttpError(status=" + this.status + ", error=" + this.error + ", response=" + this.response + ", autoRetry=" + this.autoRetry + ", responseBody=" + this.responseBody + ", traceId=" + this.traceId + ", endpoint=" + this.endpoint + ")";
        }

        public /* synthetic */ HttpError(int i, Throwable th, Object obj, int i2, String str, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? null : th, (i3 & 4) != 0 ? null : obj, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : str, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : str3);
        }

        public final int getStatus() {
            return this.status;
        }

        public final Throwable getError() {
            return this.error;
        }

        public final E getResponse() {
            return this.response;
        }

        public final int getAutoRetry() {
            return this.autoRetry;
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public String getResponseBody() {
            return this.responseBody;
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public String getTraceId() {
            return this.traceId;
        }

        @Override // com.truelayer.payments.core.network.NetworkError
        public String getEndpoint() {
            return this.endpoint;
        }

        public HttpError(int i, Throwable th, E e, int i2, String str, String str2, String str3) {
            super("Http " + i + " error occurred.", th, str, str2, str3, null);
            this.status = i;
            this.error = th;
            this.response = e;
            this.autoRetry = i2;
            this.responseBody = str;
            this.traceId = str2;
            this.endpoint = str3;
        }

        @Override // com.truelayer.payments.core.network.NetworkError, com.truelayer.payments.core.domain.utils.IntoCoreError
        public CoreError intoCoreError() {
            E e = this.response;
            IntoCoreError.IntoHttpError intoHttpError = e instanceof IntoCoreError.IntoHttpError ? (IntoCoreError.IntoHttpError) e : null;
            CoreError.HttpError httpErrorIntoCoreHttpError = intoHttpError != null ? intoHttpError.intoCoreHttpError(this.status, getResponseBody(), getTraceId(), this.autoRetry, getEndpoint()) : null;
            if (httpErrorIntoCoreHttpError != null) {
                return httpErrorIntoCoreHttpError;
            }
            return new CoreError.HttpError.ServerError(this.status, CoreError.HttpError.ServerErrorType.UnknownError, getResponseBody(), getTraceId(), this.autoRetry, getEndpoint(), "", "");
        }
    }

    @Override // com.truelayer.payments.core.domain.utils.IntoCoreError
    public CoreError intoCoreError() {
        if (this instanceof CertificateValidationError) {
            return new CoreError.CertificateValidationError(((CertificateValidationError) this).getCause(), getResponseBody(), getTraceId(), getEndpoint());
        }
        if (this instanceof ConnectionError) {
            return new CoreError.ConnectionError(((ConnectionError) this).getCause(), getResponseBody(), getTraceId(), getEndpoint());
        }
        if (this instanceof ValidationError) {
            return new CoreError.ValidationError(((ValidationError) this).getCause(), getResponseBody(), getTraceId(), getEndpoint(), null, 16, null);
        }
        if (!(this instanceof HttpError)) {
            throw new NoWhenBranchMatchedException();
        }
        TrueLayerAnalytics analytics$payments_core_release = TrueLayerCore.INSTANCE.getAnalytics$payments_core_release();
        Throwable cause = getCause();
        analytics$payments_core_release.track(new AnalyticsEvents.WTF(null, "Incorrect error mapping", cause != null ? ExceptionsKt.stackTraceToString(cause) : null, getResponseBody(), getTraceId(), getEndpoint(), 1, null));
        return CoreError.HttpError.ServerError.copy$default(CoreError.INSTANCE.mo27021default(), 0, null, null, null, 0, null, "Incorrect error mapping.", "This should never happen.", 63, null);
    }
}

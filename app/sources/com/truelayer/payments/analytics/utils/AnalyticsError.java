package com.truelayer.payments.analytics.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorType.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b \b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jo\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\fHÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006,"}, m3636d2 = {"Lcom/truelayer/payments/analytics/utils/AnalyticsError;", "", "type", "Lcom/truelayer/payments/analytics/utils/ErrorType;", "message", "", "shouldRetry", "", "serverResponse", "traceId", "cause", "autoRetry", "", "endpoint", "underlyingError", "(Lcom/truelayer/payments/analytics/utils/ErrorType;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAutoRetry", "()I", "getCause", "()Ljava/lang/String;", "getEndpoint", "getMessage", "getServerResponse", "getShouldRetry", "()Z", "getTraceId", "getType", "()Lcom/truelayer/payments/analytics/utils/ErrorType;", "getUnderlyingError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AnalyticsError {
    private final int autoRetry;
    private final String cause;
    private final String endpoint;
    private final String message;
    private final String serverResponse;
    private final boolean shouldRetry;
    private final String traceId;
    private final ErrorType type;
    private final String underlyingError;

    public static /* synthetic */ AnalyticsError copy$default(AnalyticsError analyticsError, ErrorType errorType, String str, boolean z, String str2, String str3, String str4, int i, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            errorType = analyticsError.type;
        }
        if ((i2 & 2) != 0) {
            str = analyticsError.message;
        }
        if ((i2 & 4) != 0) {
            z = analyticsError.shouldRetry;
        }
        if ((i2 & 8) != 0) {
            str2 = analyticsError.serverResponse;
        }
        if ((i2 & 16) != 0) {
            str3 = analyticsError.traceId;
        }
        if ((i2 & 32) != 0) {
            str4 = analyticsError.cause;
        }
        if ((i2 & 64) != 0) {
            i = analyticsError.autoRetry;
        }
        if ((i2 & 128) != 0) {
            str5 = analyticsError.endpoint;
        }
        if ((i2 & 256) != 0) {
            str6 = analyticsError.underlyingError;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        int i3 = i;
        String str10 = str3;
        boolean z2 = z;
        return analyticsError.copy(errorType, str, z2, str2, str10, str9, i3, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final ErrorType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldRetry() {
        return this.shouldRetry;
    }

    /* renamed from: component4, reason: from getter */
    public final String getServerResponse() {
        return this.serverResponse;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCause() {
        return this.cause;
    }

    /* renamed from: component7, reason: from getter */
    public final int getAutoRetry() {
        return this.autoRetry;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* renamed from: component9, reason: from getter */
    public final String getUnderlyingError() {
        return this.underlyingError;
    }

    public final AnalyticsError copy(ErrorType type2, String message, boolean shouldRetry, String serverResponse, String traceId, String cause, int autoRetry, String endpoint, String underlyingError) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return new AnalyticsError(type2, message, shouldRetry, serverResponse, traceId, cause, autoRetry, endpoint, underlyingError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsError)) {
            return false;
        }
        AnalyticsError analyticsError = (AnalyticsError) other;
        return this.type == analyticsError.type && Intrinsics.areEqual(this.message, analyticsError.message) && this.shouldRetry == analyticsError.shouldRetry && Intrinsics.areEqual(this.serverResponse, analyticsError.serverResponse) && Intrinsics.areEqual(this.traceId, analyticsError.traceId) && Intrinsics.areEqual(this.cause, analyticsError.cause) && this.autoRetry == analyticsError.autoRetry && Intrinsics.areEqual(this.endpoint, analyticsError.endpoint) && Intrinsics.areEqual(this.underlyingError, analyticsError.underlyingError);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.message;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.shouldRetry)) * 31;
        String str2 = this.serverResponse;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.traceId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cause;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.autoRetry)) * 31;
        String str5 = this.endpoint;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.underlyingError;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "AnalyticsError(type=" + this.type + ", message=" + this.message + ", shouldRetry=" + this.shouldRetry + ", serverResponse=" + this.serverResponse + ", traceId=" + this.traceId + ", cause=" + this.cause + ", autoRetry=" + this.autoRetry + ", endpoint=" + this.endpoint + ", underlyingError=" + this.underlyingError + ")";
    }

    public AnalyticsError(ErrorType type2, String str, boolean z, String str2, String str3, String str4, int i, String str5, String str6) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.type = type2;
        this.message = str;
        this.shouldRetry = z;
        this.serverResponse = str2;
        this.traceId = str3;
        this.cause = str4;
        this.autoRetry = i;
        this.endpoint = str5;
        this.underlyingError = str6;
    }

    public /* synthetic */ AnalyticsError(ErrorType errorType, String str, boolean z, String str2, String str3, String str4, int i, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorType, (i2 & 2) != 0 ? null : str, z, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? 0 : i, str5, (i2 & 256) != 0 ? null : str6);
    }

    public final ErrorType getType() {
        return this.type;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getShouldRetry() {
        return this.shouldRetry;
    }

    public final String getServerResponse() {
        return this.serverResponse;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final String getCause() {
        return this.cause;
    }

    public final int getAutoRetry() {
        return this.autoRetry;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final String getUnderlyingError() {
        return this.underlyingError;
    }
}

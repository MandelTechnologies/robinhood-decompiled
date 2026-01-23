package com.truelayer.payments.core.configuration;

import com.truelayer.payments.core.domain.configuration.HttpConnectionConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: HttpClientConfig.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/core/configuration/HttpClientConfig;", "", "uri", "Lokhttp3/HttpUrl;", "paymentsExperienceUri", "clientsAppName", "", "userAgent", "connection", "Lcom/truelayer/payments/core/domain/configuration/HttpConnectionConfiguration;", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/configuration/HttpConnectionConfiguration;)V", "getClientsAppName", "()Ljava/lang/String;", "getConnection", "()Lcom/truelayer/payments/core/domain/configuration/HttpConnectionConfiguration;", "getPaymentsExperienceUri", "()Lokhttp3/HttpUrl;", "getUri", "getUserAgent", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HttpClientConfig {
    private final String clientsAppName;
    private final HttpConnectionConfiguration connection;
    private final HttpUrl paymentsExperienceUri;
    private final HttpUrl uri;
    private final String userAgent;

    public static /* synthetic */ HttpClientConfig copy$default(HttpClientConfig httpClientConfig, HttpUrl httpUrl, HttpUrl httpUrl2, String str, String str2, HttpConnectionConfiguration httpConnectionConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            httpUrl = httpClientConfig.uri;
        }
        if ((i & 2) != 0) {
            httpUrl2 = httpClientConfig.paymentsExperienceUri;
        }
        if ((i & 4) != 0) {
            str = httpClientConfig.clientsAppName;
        }
        if ((i & 8) != 0) {
            str2 = httpClientConfig.userAgent;
        }
        if ((i & 16) != 0) {
            httpConnectionConfiguration = httpClientConfig.connection;
        }
        HttpConnectionConfiguration httpConnectionConfiguration2 = httpConnectionConfiguration;
        String str3 = str;
        return httpClientConfig.copy(httpUrl, httpUrl2, str3, str2, httpConnectionConfiguration2);
    }

    /* renamed from: component1, reason: from getter */
    public final HttpUrl getUri() {
        return this.uri;
    }

    /* renamed from: component2, reason: from getter */
    public final HttpUrl getPaymentsExperienceUri() {
        return this.paymentsExperienceUri;
    }

    /* renamed from: component3, reason: from getter */
    public final String getClientsAppName() {
        return this.clientsAppName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    /* renamed from: component5, reason: from getter */
    public final HttpConnectionConfiguration getConnection() {
        return this.connection;
    }

    public final HttpClientConfig copy(HttpUrl uri, HttpUrl paymentsExperienceUri, String clientsAppName, String userAgent, HttpConnectionConfiguration connection) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(paymentsExperienceUri, "paymentsExperienceUri");
        Intrinsics.checkNotNullParameter(clientsAppName, "clientsAppName");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(connection, "connection");
        return new HttpClientConfig(uri, paymentsExperienceUri, clientsAppName, userAgent, connection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpClientConfig)) {
            return false;
        }
        HttpClientConfig httpClientConfig = (HttpClientConfig) other;
        return Intrinsics.areEqual(this.uri, httpClientConfig.uri) && Intrinsics.areEqual(this.paymentsExperienceUri, httpClientConfig.paymentsExperienceUri) && Intrinsics.areEqual(this.clientsAppName, httpClientConfig.clientsAppName) && Intrinsics.areEqual(this.userAgent, httpClientConfig.userAgent) && Intrinsics.areEqual(this.connection, httpClientConfig.connection);
    }

    public int hashCode() {
        return (((((((this.uri.hashCode() * 31) + this.paymentsExperienceUri.hashCode()) * 31) + this.clientsAppName.hashCode()) * 31) + this.userAgent.hashCode()) * 31) + this.connection.hashCode();
    }

    public String toString() {
        return "HttpClientConfig(uri=" + this.uri + ", paymentsExperienceUri=" + this.paymentsExperienceUri + ", clientsAppName=" + this.clientsAppName + ", userAgent=" + this.userAgent + ", connection=" + this.connection + ")";
    }

    public HttpClientConfig(HttpUrl uri, HttpUrl paymentsExperienceUri, String clientsAppName, String userAgent, HttpConnectionConfiguration connection) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(paymentsExperienceUri, "paymentsExperienceUri");
        Intrinsics.checkNotNullParameter(clientsAppName, "clientsAppName");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.uri = uri;
        this.paymentsExperienceUri = paymentsExperienceUri;
        this.clientsAppName = clientsAppName;
        this.userAgent = userAgent;
        this.connection = connection;
    }

    public final HttpUrl getUri() {
        return this.uri;
    }

    public final HttpUrl getPaymentsExperienceUri() {
        return this.paymentsExperienceUri;
    }

    public final String getClientsAppName() {
        return this.clientsAppName;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public /* synthetic */ HttpClientConfig(HttpUrl httpUrl, HttpUrl httpUrl2, String str, String str2, HttpConnectionConfiguration httpConnectionConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpUrl, httpUrl2, str, str2, (i & 16) != 0 ? new HttpConnectionConfiguration(0L, null, 3, null) : httpConnectionConfiguration);
    }

    public final HttpConnectionConfiguration getConnection() {
        return this.connection;
    }
}

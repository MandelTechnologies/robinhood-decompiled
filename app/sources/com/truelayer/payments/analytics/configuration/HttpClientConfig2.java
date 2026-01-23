package com.truelayer.payments.analytics.configuration;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: HttpClientConfig.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002¨\u0006\n"}, m3636d2 = {"getOkhttpClient", "Lokhttp3/OkHttpClient;", "headers", "", "Lcom/truelayer/payments/analytics/configuration/HttpHeader;", "enableDebugLogging", "", "intoClient", "Lokhttp3/OkHttpClient$Builder;", "Lcom/truelayer/payments/analytics/configuration/HttpClientConfig;", "payments-analytics_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.analytics.configuration.HttpClientConfigKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class HttpClientConfig2 {
    public static /* synthetic */ OkHttpClient getOkhttpClient$default(List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return getOkhttpClient(list, z);
    }

    public static final OkHttpClient getOkhttpClient(List<HttpHeader> headers, boolean z) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        return intoClient(new HttpClientConfig(5000L, headers, z)).build();
    }

    private static final OkHttpClient.Builder intoClient(final HttpClientConfig httpClientConfig) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.readTimeout(httpClientConfig.getConnectionTimeoutMillis(), timeUnit);
        builder.writeTimeout(httpClientConfig.getConnectionTimeoutMillis(), timeUnit);
        builder.connectTimeout(httpClientConfig.getConnectionTimeoutMillis(), timeUnit);
        builder.addInterceptor(new Interceptor() { // from class: com.truelayer.payments.analytics.configuration.HttpClientConfigKt$intoClient$lambda$6$$inlined$-addInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Intrinsics.checkNotNullParameter(chain, "chain");
                Request.Builder builderNewBuilder = chain.request().newBuilder();
                for (HttpHeader httpHeader : httpClientConfig.getHeaders()) {
                    builderNewBuilder.addHeader(httpHeader.getName(), httpHeader.getValue());
                }
                return chain.proceed(builderNewBuilder.build());
            }
        });
        return builder;
    }

    private static final void intoClient$lambda$6$lambda$5$lambda$3(Logger logger, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        logger.log(Level.INFO, it);
    }
}

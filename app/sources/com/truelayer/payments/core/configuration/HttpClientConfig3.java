package com.truelayer.payments.core.configuration;

import com.robinhood.utils.http.Headers;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: HttpClientConfig.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"intoClient", "Lokhttp3/OkHttpClient$Builder;", "Lcom/truelayer/payments/core/configuration/HttpClientConfig;", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.core.configuration.HttpClientConfigKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class HttpClientConfig3 {
    public static final OkHttpClient.Builder intoClient(final HttpClientConfig httpClientConfig) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.readTimeout(httpClientConfig.getConnection().getTimeoutMs(), timeUnit);
        builder.writeTimeout(httpClientConfig.getConnection().getTimeoutMs(), timeUnit);
        builder.connectTimeout(httpClientConfig.getConnection().getTimeoutMs(), timeUnit);
        builder.addInterceptor(new Interceptor() { // from class: com.truelayer.payments.core.configuration.HttpClientConfigKt$intoClient$lambda$5$$inlined$-addInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Intrinsics.checkNotNullParameter(chain, "chain");
                Request.Builder builderNewBuilder = chain.request().newBuilder();
                builderNewBuilder.header(Headers.USER_AGENT, httpClientConfig.getUserAgent());
                builderNewBuilder.header("TL-Agent", httpClientConfig.getUserAgent());
                builderNewBuilder.header("X-TRUELAYER-SDK-APP-NAME", httpClientConfig.getClientsAppName());
                String languageTag = Locale.getDefault().toLanguageTag();
                Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
                builderNewBuilder.header(Headers.LANGUAGE, languageTag);
                return chain.proceed(builderNewBuilder.build());
            }
        });
        return builder;
    }
}

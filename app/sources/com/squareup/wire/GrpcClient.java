package com.squareup.wire;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.http.ContentEncoding;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Timeout;

/* compiled from: GrpcClient.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\tH&J<\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u000b\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\tH&J\u001a\u0010\f\u001a\u0002H\r\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u000eH\u0086\b¢\u0006\u0002\u0010\u000fJ#\u0010\f\u001a\u0002H\r\"\b\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\r0\u0011¢\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014\"\b\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\r0\u0011H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016JE\u0010\u0004\u001a\u00020\u00172\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00192\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0002¨\u0006%"}, m3636d2 = {"Lcom/squareup/wire/GrpcClient;", "", "<init>", "()V", "newCall", "Lcom/squareup/wire/GrpcCall;", "S", "R", "method", "Lcom/squareup/wire/GrpcMethod;", "newStreamingCall", "Lcom/squareup/wire/GrpcStreamingCall;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Lcom/squareup/wire/Service;", "()Lcom/squareup/wire/Service;", "service", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Lcom/squareup/wire/Service;", "implementationClass", "Ljava/lang/Class;", "newBuilder", "Lcom/squareup/wire/GrpcClient$Builder;", "Lokhttp3/Call;", "requestMetadata", "", "", "requestBody", "Lokhttp3/RequestBody;", "Lcom/squareup/wire/GrpcRequestBody;", "timeout", "Lokio/Timeout;", "newCall$wire_grpc_client", "serializeTimeout", "timeoutNanos", "", "Builder", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public abstract class GrpcClient {
    public abstract <S, R> GrpcCall<S, R> newCall(GrpcMethod<S, R> method);

    public abstract <S, R> GrpcStreamingCall<S, R> newStreamingCall(GrpcMethod<S, R> method);

    public final /* synthetic */ <T extends Service> T create() {
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) create(Reflection.getOrCreateKotlinClass(Service.class));
    }

    public final <T extends Service> T create(KClass<T> service) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(service, "service");
        try {
            Constructor<?>[] declaredConstructors = implementationClass(service).getDeclaredConstructors();
            Intrinsics.checkNotNullExpressionValue(declaredConstructors, "getDeclaredConstructors(...)");
            Object objCast = JvmClassMapping.getJavaClass(service).cast(((Constructor) ArraysKt.single(declaredConstructors)).newInstance(this));
            Intrinsics.checkNotNullExpressionValue(objCast, "cast(...)");
            return (T) objCast;
        } catch (Exception unused) {
            throw new IllegalStateException(("failed to create gRPC class for " + service + ": is it a Wire-generated gRPC interface?").toString());
        }
    }

    private final <T extends Service> Class<?> implementationClass(KClass<T> service) throws ClassNotFoundException {
        String qualifiedName = service.getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName);
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) qualifiedName, ".", 0, false, 6, (Object) null) + 1;
        String strSubstring = qualifiedName.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = qualifiedName.substring(iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        Class<?> cls = Class.forName(strSubstring + "Grpc" + strSubstring2);
        Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
        return cls;
    }

    public final Builder newBuilder() {
        if (!(this instanceof GrpcClient2)) {
            throw new IllegalStateException("newBuilder is not available for custom implementation of GrpcClient");
        }
        GrpcClient2 grpcClient2 = (GrpcClient2) this;
        return new Builder().callFactory(grpcClient2.getClient()).baseUrl(grpcClient2.getBaseUrl()).minMessageToCompress(grpcClient2.getMinMessageToCompress());
    }

    public final Call newCall$wire_grpc_client(GrpcMethod<?, ?> method, Map<String, String> requestMetadata, RequestBody requestBody, Timeout timeout) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        if (!(this instanceof GrpcClient2)) {
            throw new IllegalStateException("newCall is not available for custom implementation of GrpcClient");
        }
        GrpcClient2 grpcClient2 = (GrpcClient2) this;
        Call.Factory client = grpcClient2.getClient();
        Request.Builder builder = new Request.Builder();
        HttpUrl httpUrlResolve = grpcClient2.getBaseUrl().resolve(method.getPath());
        Intrinsics.checkNotNull(httpUrlResolve);
        Request.Builder builderAddHeader = builder.url(httpUrlResolve).addHeader("te", "trailers").addHeader("grpc-trace-bin", "").addHeader("grpc-accept-encoding", ContentEncoding.GZIP);
        if (grpcClient2.getMinMessageToCompress() < Long.MAX_VALUE) {
            builderAddHeader.addHeader("grpc-encoding", ContentEncoding.GZIP);
        }
        for (Map.Entry<String, String> entry : requestMetadata.entrySet()) {
            builderAddHeader.addHeader(entry.getKey(), entry.getValue());
        }
        if (timeout.getHasDeadline()) {
            builderAddHeader.addHeader("grpc-timeout", serializeTimeout(timeout.deadlineNanoTime()));
        }
        if (timeout.getTimeoutNanos() > 0) {
            builderAddHeader.addHeader("grpc-timeout", serializeTimeout(timeout.getTimeoutNanos()));
        }
        return client.newCall(builderAddHeader.tag(GrpcMethod.class, method).method("POST", requestBody).build());
    }

    private final String serializeTimeout(long timeoutNanos) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (timeoutNanos < 0) {
            throw new IllegalArgumentException("Timeout too small");
        }
        if (timeoutNanos < 100000000) {
            StringBuilder sb = new StringBuilder();
            sb.append(timeoutNanos);
            sb.append('n');
            return sb.toString();
        }
        if (timeoutNanos < 100000000000L) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(timeUnit.toMicros(timeoutNanos));
            sb2.append('u');
            return sb2.toString();
        }
        if (timeoutNanos < 100000000000000L) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(timeUnit.toMillis(timeoutNanos));
            sb3.append('m');
            return sb3.toString();
        }
        if (timeoutNanos < 100000000000000000L) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(timeUnit.toSeconds(timeoutNanos));
            sb4.append('S');
            return sb4.toString();
        }
        if (timeoutNanos < 6000000000000000000L) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(timeUnit.toMinutes(timeoutNanos));
            sb5.append('M');
            return sb5.toString();
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(timeUnit.toHours(timeoutNanos));
        sb6.append('H');
        return sb6.toString();
    }

    /* compiled from: GrpcClient.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\rJ\u0012\u0010\u0006\u001a\u00020\u00002\n\u0010\u000e\u001a\u00060\u0007j\u0002`\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/squareup/wire/GrpcClient$Builder;", "", "<init>", "()V", "client", "Lokhttp3/Call$Factory;", "baseUrl", "Lokhttp3/HttpUrl;", "Lcom/squareup/wire/GrpcHttpUrl;", "minMessageToCompress", "", "Lokhttp3/OkHttpClient;", "callFactory", "", "url", "bytes", "build", "Lcom/squareup/wire/GrpcClient;", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Builder {
        private HttpUrl baseUrl;
        private Call.Factory client;
        private long minMessageToCompress;

        public final Builder client(OkHttpClient client) {
            Intrinsics.checkNotNullParameter(client, "client");
            if (client.protocols().contains(Protocol.HTTP_2) || client.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
                return callFactory(client);
            }
            throw new IllegalArgumentException("OkHttpClient is not configured with a HTTP/2 protocol which is required for gRPC connections.");
        }

        public final Builder callFactory(Call.Factory client) {
            Intrinsics.checkNotNullParameter(client, "client");
            this.client = client;
            return this;
        }

        public final Builder baseUrl(String baseUrl) {
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            this.baseUrl = GrpcHttpUrl.toHttpUrl(baseUrl);
            return this;
        }

        public final Builder baseUrl(HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.baseUrl = url;
            return this;
        }

        public final Builder minMessageToCompress(long bytes) {
            if (bytes < 0) {
                throw new IllegalArgumentException(("minMessageToCompress must not be negative: " + bytes).toString());
            }
            this.minMessageToCompress = bytes;
            return this;
        }

        public final GrpcClient build() {
            Call.Factory factory = this.client;
            if (factory == null) {
                throw new IllegalArgumentException("client is not set");
            }
            HttpUrl httpUrl = this.baseUrl;
            if (httpUrl != null) {
                return new GrpcClient2(factory, httpUrl, this.minMessageToCompress);
            }
            throw new IllegalArgumentException("baseUrl is not set");
        }
    }
}

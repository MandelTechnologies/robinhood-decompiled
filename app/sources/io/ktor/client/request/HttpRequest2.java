package io.ktor.client.request;

import com.robinhood.android.car.result.CarResultComposable2;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.engine.HttpClientEngineCapability2;
import io.ktor.client.utils.Content5;
import io.ktor.http.Headers;
import io.ktor.http.Headers3;
import io.ktor.http.HttpMessage2;
import io.ktor.http.HttpMethod;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLUtils2;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.Attributes;
import io.ktor.util.Attributes3;
import io.ktor.util.AttributesJvm2;
import io.ktor.util.StringValues5;
import io.ktor.util.reflect.TypeInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;

/* compiled from: HttpRequest.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 @2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\tJ-\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R*\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010.\u001a\u00020-2\u0006\u0010&\u001a\u00020-8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R(\u0010?\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u0001098F@GX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006A"}, m3636d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/http/HttpMessageBuilder;", "<init>", "()V", "Lio/ktor/client/request/HttpRequestData;", "build", "()Lio/ktor/client/request/HttpRequestData;", "builder", "takeFromWithExecutionContext", "(Lio/ktor/client/request/HttpRequestBuilder;)Lio/ktor/client/request/HttpRequestBuilder;", "takeFrom", "", "T", "Lio/ktor/client/engine/HttpClientEngineCapability;", "key", "capability", "", "setCapability", "(Lio/ktor/client/engine/HttpClientEngineCapability;Ljava/lang/Object;)V", "getCapabilityOrNull", "(Lio/ktor/client/engine/HttpClientEngineCapability;)Ljava/lang/Object;", "Lio/ktor/http/URLBuilder;", "url", "Lio/ktor/http/URLBuilder;", "getUrl", "()Lio/ktor/http/URLBuilder;", "Lio/ktor/http/HttpMethod;", "method", "Lio/ktor/http/HttpMethod;", "getMethod", "()Lio/ktor/http/HttpMethod;", "setMethod", "(Lio/ktor/http/HttpMethod;)V", "Lio/ktor/http/HeadersBuilder;", "headers", "Lio/ktor/http/HeadersBuilder;", "getHeaders", "()Lio/ktor/http/HeadersBuilder;", "<set-?>", CarResultComposable2.BODY, "Ljava/lang/Object;", "getBody", "()Ljava/lang/Object;", "setBody", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/Job;", "executionContext", "Lkotlinx/coroutines/Job;", "getExecutionContext", "()Lkotlinx/coroutines/Job;", "setExecutionContext$ktor_client_core", "(Lkotlinx/coroutines/Job;)V", "Lio/ktor/util/Attributes;", "attributes", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "Lio/ktor/util/reflect/TypeInfo;", "value", "getBodyType", "()Lio/ktor/util/reflect/TypeInfo;", "setBodyType", "(Lio/ktor/util/reflect/TypeInfo;)V", "bodyType", "Companion", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.request.HttpRequestBuilder, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpRequest2 implements HttpMessage2 {
    private final URLBuilder url = new URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
    private HttpMethod method = HttpMethod.INSTANCE.getGet();
    private final Headers3 headers = new Headers3(0, 1, null);
    private Object body = Content5.INSTANCE;
    private Job executionContext = Supervisor3.SupervisorJob$default(null, 1, null);
    private final Attributes attributes = AttributesJvm2.Attributes(true);

    public final URLBuilder getUrl() {
        return this.url;
    }

    public final HttpMethod getMethod() {
        return this.method;
    }

    public final void setMethod(HttpMethod httpMethod) {
        Intrinsics.checkNotNullParameter(httpMethod, "<set-?>");
        this.method = httpMethod;
    }

    @Override // io.ktor.http.HttpMessage2
    public Headers3 getHeaders() {
        return this.headers;
    }

    public final Object getBody() {
        return this.body;
    }

    public final void setBody(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.body = obj;
    }

    public final TypeInfo getBodyType() {
        return (TypeInfo) this.attributes.getOrNull(RequestBody2.getBodyTypeAttributeKey());
    }

    public final void setBodyType(TypeInfo typeInfo) {
        if (typeInfo != null) {
            this.attributes.put(RequestBody2.getBodyTypeAttributeKey(), typeInfo);
        } else {
            this.attributes.remove(RequestBody2.getBodyTypeAttributeKey());
        }
    }

    public final Job getExecutionContext() {
        return this.executionContext;
    }

    public final void setExecutionContext$ktor_client_core(Job job) {
        Intrinsics.checkNotNullParameter(job, "<set-?>");
        this.executionContext = job;
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    public final HttpRequestData build() {
        Url urlBuild = this.url.build();
        HttpMethod httpMethod = this.method;
        Headers headersBuild = getHeaders().build();
        Object obj = this.body;
        OutgoingContent outgoingContent = obj instanceof OutgoingContent ? (OutgoingContent) obj : null;
        if (outgoingContent != null) {
            return new HttpRequestData(urlBuild, httpMethod, headersBuild, outgoingContent, this.executionContext, this.attributes);
        }
        throw new IllegalStateException(("No request transformation found: " + this.body).toString());
    }

    public final HttpRequest2 takeFromWithExecutionContext(HttpRequest2 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.executionContext = builder.executionContext;
        return takeFrom(builder);
    }

    public final HttpRequest2 takeFrom(HttpRequest2 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.method = builder.method;
        this.body = builder.body;
        setBodyType(builder.getBodyType());
        URLUtils2.takeFrom(this.url, builder.url);
        URLBuilder uRLBuilder = this.url;
        uRLBuilder.setEncodedPathSegments(uRLBuilder.getEncodedPathSegments());
        StringValues5.appendAll(getHeaders(), builder.getHeaders());
        Attributes3.putAll(this.attributes, builder.attributes);
        return this;
    }

    public final <T> void setCapability(HttpClientEngineCapability<T> key, T capability) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(capability, "capability");
        ((Map) this.attributes.computeIfAbsent(HttpClientEngineCapability2.getENGINE_CAPABILITIES_KEY(), new Function0<Map<HttpClientEngineCapability<?>, Object>>() { // from class: io.ktor.client.request.HttpRequestBuilder$setCapability$capabilities$1
            @Override // kotlin.jvm.functions.Function0
            public final Map<HttpClientEngineCapability<?>, Object> invoke() {
                return new LinkedHashMap();
            }
        })).put(key, capability);
    }

    public final <T> T getCapabilityOrNull(HttpClientEngineCapability<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.attributes.getOrNull(HttpClientEngineCapability2.getENGINE_CAPABILITIES_KEY());
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
    }
}

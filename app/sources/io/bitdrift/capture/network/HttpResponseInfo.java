package io.bitdrift.capture.network;

import io.bitdrift.capture.providers.FieldProvider3;
import io.bitdrift.capture.providers.FieldProvider4;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HttpResponseInfo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u000b8\u0000X\u0080D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R*\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020 0\nj\u0002`!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010$R*\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020 0\nj\u0002`!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010$¨\u0006'"}, m3636d2 = {"Lio/bitdrift/capture/network/HttpResponseInfo;", "", "Lio/bitdrift/capture/network/HttpRequestInfo;", "request", "Lio/bitdrift/capture/network/HttpResponse;", "response", "", "durationMs", "Lio/bitdrift/capture/network/HttpRequestMetrics;", "metrics", "", "", "extraFields", "<init>", "(Lio/bitdrift/capture/network/HttpRequestInfo;Lio/bitdrift/capture/network/HttpResponse;JLio/bitdrift/capture/network/HttpRequestMetrics;Ljava/util/Map;)V", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/bitdrift/capture/network/HttpRequestInfo;", "Lio/bitdrift/capture/network/HttpResponse;", "J", "Lio/bitdrift/capture/network/HttpRequestMetrics;", "Ljava/util/Map;", "name", "Ljava/lang/String;", "getName$platform_jvm_capture_capture_logger_lib_kt", "Lio/bitdrift/capture/providers/FieldValue;", "Lio/bitdrift/capture/InternalFieldsMap;", "fields", "getFields$platform_jvm_capture_capture_logger_lib_kt", "()Ljava/util/Map;", "matchingFields", "getMatchingFields$platform_jvm_capture_capture_logger_lib_kt", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final /* data */ class HttpResponseInfo {
    private final long durationMs;
    private final Map<String, String> extraFields;
    private final Map<String, FieldProvider4> fields;
    private final Map<String, FieldProvider4> matchingFields;
    private HttpRequestMetrics metrics;
    private final String name;
    private final HttpRequestInfo request;
    private final HttpResponse response;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpResponseInfo)) {
            return false;
        }
        HttpResponseInfo httpResponseInfo = (HttpResponseInfo) other;
        return Intrinsics.areEqual(this.request, httpResponseInfo.request) && Intrinsics.areEqual(this.response, httpResponseInfo.response) && this.durationMs == httpResponseInfo.durationMs && Intrinsics.areEqual(this.metrics, httpResponseInfo.metrics) && Intrinsics.areEqual(this.extraFields, httpResponseInfo.extraFields);
    }

    public int hashCode() {
        int iHashCode = ((((this.request.hashCode() * 31) + this.response.hashCode()) * 31) + D8$$SyntheticClass4.m3321m(this.durationMs)) * 31;
        HttpRequestMetrics httpRequestMetrics = this.metrics;
        return ((iHashCode + (httpRequestMetrics == null ? 0 : httpRequestMetrics.hashCode())) * 31) + this.extraFields.hashCode();
    }

    public String toString() {
        return "HttpResponseInfo(request=" + this.request + ", response=" + this.response + ", durationMs=" + this.durationMs + ", metrics=" + this.metrics + ", extraFields=" + this.extraFields + ')';
    }

    @JvmOverloads
    public HttpResponseInfo(HttpRequestInfo request, HttpResponse response, long j, HttpRequestMetrics httpRequestMetrics, Map<String, String> extraFields) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(extraFields, "extraFields");
        this.request = request;
        this.response = response;
        this.durationMs = j;
        this.metrics = httpRequestMetrics;
        this.extraFields = extraFields;
        this.name = "HTTPResponse";
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("_span_type", new FieldProvider4.StringField("end"));
        mapCreateMapBuilder.put("_duration_ms", new FieldProvider4.StringField(String.valueOf(j)));
        String lowerCase = response.getResult().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        mapCreateMapBuilder.put("_result", new FieldProvider4.StringField(lowerCase));
        PutOptional.putOptional$default(mapCreateMapBuilder, "_status_code", response.getStatusCode(), null, 4, null);
        PutOptional.putOptional(mapCreateMapBuilder, "_error_type", response.getError(), new Function1<Throwable, String>() { // from class: io.bitdrift.capture.network.HttpResponseInfo$fields$1$fields$1$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String simpleName = ((Class) new PropertyReference0Impl(it) { // from class: io.bitdrift.capture.network.HttpResponseInfo$fields$1$fields$1$1.1
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty6
                    public Object get() {
                        return this.receiver.getClass();
                    }
                }.get()).getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                return simpleName;
            }
        });
        PutOptional.putOptional(mapCreateMapBuilder, "_error_message", response.getError(), new Function1<Throwable, String>() { // from class: io.bitdrift.capture.network.HttpResponseInfo$fields$1$fields$1$2
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String message = it.getMessage();
                return message == null ? "" : message;
            }
        });
        PutOptional.putOptional$default(mapCreateMapBuilder, "_host", response.getHost(), null, 4, null);
        HttpUrlPath path = response.getPath();
        PutOptional.putOptional$default(mapCreateMapBuilder, "_path", path != null ? path.getValue() : null, null, 4, null);
        PutOptional.putOptional$default(mapCreateMapBuilder, "_query", response.getQuery(), null, 4, null);
        HttpUrlPath path2 = response.getPath();
        if (path2 != null) {
            HttpUrlPath path3 = request.getPath();
            String template = Intrinsics.areEqual(path3 != null ? path3.getValue() : null, path2.getValue()) ? request.getPath().getTemplate() : null;
            PutOptional.putOptional$default(mapCreateMapBuilder, "_path_template", (template == null && (template = path2.getTemplate()) == null) ? null : template, null, 4, null);
        }
        HttpRequestMetrics httpRequestMetrics2 = this.metrics;
        if (httpRequestMetrics2 != null) {
            mapCreateMapBuilder.put("_request_body_bytes_sent_count", new FieldProvider4.StringField(String.valueOf(httpRequestMetrics2.getRequestBodyBytesSentCount())));
            mapCreateMapBuilder.put("_response_body_bytes_received_count", new FieldProvider4.StringField(String.valueOf(httpRequestMetrics2.getResponseBodyBytesReceivedCount())));
            mapCreateMapBuilder.put("_request_headers_bytes_count", new FieldProvider4.StringField(String.valueOf(httpRequestMetrics2.getRequestHeadersBytesCount())));
            mapCreateMapBuilder.put("_response_headers_bytes_count", new FieldProvider4.StringField(String.valueOf(httpRequestMetrics2.getResponseHeadersBytesCount())));
            PutOptional.putOptional$default(mapCreateMapBuilder, "_dns_resolution_duration_ms", httpRequestMetrics2.getDnsResolutionDurationMs(), null, 4, null);
            PutOptional.putOptional$default(mapCreateMapBuilder, "_tls_duration_ms", httpRequestMetrics2.getTlsDurationMs(), null, 4, null);
            PutOptional.putOptional$default(mapCreateMapBuilder, "_tcp_duration_ms", httpRequestMetrics2.getTcpDurationMs(), null, 4, null);
            PutOptional.putOptional$default(mapCreateMapBuilder, "_fetch_init_duration_ms", httpRequestMetrics2.getFetchInitializationMs(), null, 4, null);
            PutOptional.putOptional$default(mapCreateMapBuilder, "_response_latency_ms", httpRequestMetrics2.getResponseLatencyMs(), null, 4, null);
            PutOptional.putOptional$default(mapCreateMapBuilder, "_protocol", httpRequestMetrics2.getProtocolName(), null, 4, null);
        }
        this.fields = MapsKt.plus(MapsKt.plus(FieldProvider3.toFields(extraFields), request.getCommonFields$platform_jvm_capture_capture_logger_lib_kt()), MapsKt.build(mapCreateMapBuilder));
        Map<String, FieldProvider4> fields$platform_jvm_capture_capture_logger_lib_kt = request.getFields$platform_jvm_capture_capture_logger_lib_kt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(fields$platform_jvm_capture_capture_logger_lib_kt.size()));
        Iterator<T> it = fields$platform_jvm_capture_capture_logger_lib_kt.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put("_request." + ((String) entry.getKey()), entry.getValue());
        }
        Map<String, FieldProvider4> matchingFields$platform_jvm_capture_capture_logger_lib_kt = this.request.getMatchingFields$platform_jvm_capture_capture_logger_lib_kt();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(matchingFields$platform_jvm_capture_capture_logger_lib_kt.size()));
        Iterator<T> it2 = matchingFields$platform_jvm_capture_capture_logger_lib_kt.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put("_request." + ((String) entry2.getKey()), entry2.getValue());
        }
        Map mapPlus = MapsKt.plus(linkedHashMap, linkedHashMap2);
        Map<String, String> headers = this.response.getHeaders();
        this.matchingFields = MapsKt.plus(mapPlus, FieldProvider3.toFields(headers != null ? HTTPHeaders.INSTANCE.normalizeHeaders(headers) : null));
    }

    public /* synthetic */ HttpResponseInfo(HttpRequestInfo httpRequestInfo, HttpResponse httpResponse, long j, HttpRequestMetrics httpRequestMetrics, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpRequestInfo, httpResponse, j, (i & 8) != 0 ? null : httpRequestMetrics, (i & 16) != 0 ? MapsKt.emptyMap() : map);
    }

    /* renamed from: getName$platform_jvm_capture_capture_logger_lib_kt, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<String, FieldProvider4> getFields$platform_jvm_capture_capture_logger_lib_kt() {
        return this.fields;
    }

    public final Map<String, FieldProvider4> getMatchingFields$platform_jvm_capture_capture_logger_lib_kt() {
        return this.matchingFields;
    }
}

package io.bitdrift.capture.network;

import io.bitdrift.capture.providers.FieldProvider3;
import io.bitdrift.capture.providers.FieldProvider4;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: HttpRequestInfo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001By\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0014\u001a\u00020\u0013*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00112\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0016\u001a\u00020\u0013*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00112\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u001a\u0010'\u001a\u00020\u00028\u0000X\u0080D¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\u001bR+\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\bj\u0002`)8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R+\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\bj\u0002`)8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R*\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\bj\u0002`)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b3\u0010-¨\u00064"}, m3636d2 = {"Lio/bitdrift/capture/network/HttpRequestInfo;", "", "", "method", "host", "Lio/bitdrift/capture/network/HttpUrlPath;", "path", "query", "", "headers", "", "bytesExpectedToSendCount", "Ljava/util/UUID;", "spanId", "extraFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/bitdrift/capture/network/HttpUrlPath;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;Ljava/util/UUID;Ljava/util/Map;)V", "", "Lio/bitdrift/capture/providers/FieldValue;", "", "putOptionalGraphQlHeaders", "(Ljava/util/Map;Ljava/util/Map;)V", "putOptionalHeaderSpanFields", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "Lio/bitdrift/capture/network/HttpUrlPath;", "getPath$platform_jvm_capture_capture_logger_lib_kt", "()Lio/bitdrift/capture/network/HttpUrlPath;", "Ljava/util/Map;", "Ljava/lang/Long;", "Ljava/util/UUID;", "name", "getName$platform_jvm_capture_capture_logger_lib_kt", "Lio/bitdrift/capture/InternalFieldsMap;", "fields$delegate", "Lkotlin/Lazy;", "getFields$platform_jvm_capture_capture_logger_lib_kt", "()Ljava/util/Map;", "fields", "commonFields$delegate", "getCommonFields$platform_jvm_capture_capture_logger_lib_kt", "commonFields", "matchingFields", "getMatchingFields$platform_jvm_capture_capture_logger_lib_kt", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final /* data */ class HttpRequestInfo {
    private final Long bytesExpectedToSendCount;

    /* renamed from: commonFields$delegate, reason: from kotlin metadata */
    private final Lazy commonFields;
    private final Map<String, String> extraFields;

    /* renamed from: fields$delegate, reason: from kotlin metadata */
    private final Lazy fields;
    private final Map<String, String> headers;
    private final String host;
    private final Map<String, FieldProvider4> matchingFields;
    private final String method;
    private final String name;
    private final HttpUrlPath path;
    private final String query;
    private final UUID spanId;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpRequestInfo)) {
            return false;
        }
        HttpRequestInfo httpRequestInfo = (HttpRequestInfo) other;
        return Intrinsics.areEqual(this.method, httpRequestInfo.method) && Intrinsics.areEqual(this.host, httpRequestInfo.host) && Intrinsics.areEqual(this.path, httpRequestInfo.path) && Intrinsics.areEqual(this.query, httpRequestInfo.query) && Intrinsics.areEqual(this.headers, httpRequestInfo.headers) && Intrinsics.areEqual(this.bytesExpectedToSendCount, httpRequestInfo.bytesExpectedToSendCount) && Intrinsics.areEqual(this.spanId, httpRequestInfo.spanId) && Intrinsics.areEqual(this.extraFields, httpRequestInfo.extraFields);
    }

    public int hashCode() {
        int iHashCode = this.method.hashCode() * 31;
        String str = this.host;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        HttpUrlPath httpUrlPath = this.path;
        int iHashCode3 = (iHashCode2 + (httpUrlPath == null ? 0 : httpUrlPath.hashCode())) * 31;
        String str2 = this.query;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.headers;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Long l = this.bytesExpectedToSendCount;
        return ((((iHashCode5 + (l != null ? l.hashCode() : 0)) * 31) + this.spanId.hashCode()) * 31) + this.extraFields.hashCode();
    }

    public String toString() {
        return "HttpRequestInfo(method=" + this.method + ", host=" + this.host + ", path=" + this.path + ", query=" + this.query + ", headers=" + this.headers + ", bytesExpectedToSendCount=" + this.bytesExpectedToSendCount + ", spanId=" + this.spanId + ", extraFields=" + this.extraFields + ')';
    }

    @JvmOverloads
    public HttpRequestInfo(String method, String str, HttpUrlPath httpUrlPath, String str2, Map<String, String> map, Long l, UUID spanId, Map<String, String> extraFields) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(extraFields, "extraFields");
        this.method = method;
        this.host = str;
        this.path = httpUrlPath;
        this.query = str2;
        this.headers = map;
        this.bytesExpectedToSendCount = l;
        this.spanId = spanId;
        this.extraFields = extraFields;
        this.name = "HTTPRequest";
        this.fields = LazyKt.lazy(new Function0<Map<String, ? extends FieldProvider4>>() { // from class: io.bitdrift.capture.network.HttpRequestInfo$fields$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<String, ? extends FieldProvider4> invoke() {
                HttpRequestInfo httpRequestInfo = this.this$0;
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.putAll(httpRequestInfo.getCommonFields$platform_jvm_capture_capture_logger_lib_kt());
                PutOptional.putOptional$default(mapCreateMapBuilder, "_request_body_bytes_expected_to_send_count", httpRequestInfo.bytesExpectedToSendCount, null, 4, null);
                return MapsKt.build(mapCreateMapBuilder);
            }
        });
        this.commonFields = LazyKt.lazy(new Function0<Map<String, ? extends FieldProvider4>>() { // from class: io.bitdrift.capture.network.HttpRequestInfo$commonFields$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Map<String, ? extends FieldProvider4> invoke() {
                String template;
                HttpRequestInfo httpRequestInfo = this.this$0;
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.putAll(FieldProvider3.toFields(httpRequestInfo.extraFields));
                mapCreateMapBuilder.put("_span_name", new FieldProvider4.StringField("_http"));
                httpRequestInfo.putOptionalHeaderSpanFields(mapCreateMapBuilder, httpRequestInfo.headers);
                httpRequestInfo.putOptionalGraphQlHeaders(mapCreateMapBuilder, httpRequestInfo.headers);
                String string2 = httpRequestInfo.spanId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                mapCreateMapBuilder.put("_span_id", new FieldProvider4.StringField(string2));
                mapCreateMapBuilder.put("_span_type", new FieldProvider4.StringField("start"));
                mapCreateMapBuilder.put("_method", new FieldProvider4.StringField(httpRequestInfo.method));
                PutOptional.putOptional$default(mapCreateMapBuilder, "_host", httpRequestInfo.host, null, 4, null);
                HttpUrlPath path = httpRequestInfo.getPath();
                PutOptional.putOptional$default(mapCreateMapBuilder, "_path", path != null ? path.getValue() : null, null, 4, null);
                PutOptional.putOptional$default(mapCreateMapBuilder, "_query", httpRequestInfo.query, null, 4, null);
                HttpUrlPath path2 = httpRequestInfo.getPath();
                if (path2 != null && (template = path2.getTemplate()) != null) {
                    mapCreateMapBuilder.put("_path_template", new FieldProvider4.StringField(template));
                }
                return MapsKt.build(mapCreateMapBuilder);
            }
        });
        this.matchingFields = FieldProvider3.toFields(map != null ? HTTPHeaders.INSTANCE.normalizeHeaders(map) : null);
    }

    /* renamed from: getPath$platform_jvm_capture_capture_logger_lib_kt, reason: from getter */
    public final HttpUrlPath getPath() {
        return this.path;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HttpRequestInfo(String str, String str2, HttpUrlPath httpUrlPath, String str3, Map map, Long l, UUID uuid, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str2 = (i & 2) != 0 ? null : str2;
        httpUrlPath = (i & 4) != 0 ? null : httpUrlPath;
        str3 = (i & 8) != 0 ? null : str3;
        map = (i & 16) != 0 ? null : map;
        l = (i & 32) != 0 ? null : l;
        if ((i & 64) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID(...)");
        }
        this(str, str2, httpUrlPath, str3, map, l, uuid, (i & 128) != 0 ? MapsKt.emptyMap() : map2);
    }

    /* renamed from: getName$platform_jvm_capture_capture_logger_lib_kt, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<String, FieldProvider4> getFields$platform_jvm_capture_capture_logger_lib_kt() {
        return (Map) this.fields.getValue();
    }

    public final Map<String, FieldProvider4> getCommonFields$platform_jvm_capture_capture_logger_lib_kt() {
        return (Map) this.commonFields.getValue();
    }

    public final Map<String, FieldProvider4> getMatchingFields$platform_jvm_capture_capture_logger_lib_kt() {
        return this.matchingFields;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void putOptionalHeaderSpanFields(Map<String, FieldProvider4> map, Map<String, String> map2) {
        String str;
        if (map2 == null || (str = map2.get("x-capture-span-key")) == null) {
            return;
        }
        String str2 = "x-capture-span-" + str;
        map.put("_span_name", new FieldProvider4.StringField('_' + map2.get(str2 + "-name")));
        String str3 = str2 + "-field";
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (StringsKt.startsWith$default(key, str3, false, 2, (Object) null)) {
                map.put(StringsKt.replace$default(StringsKt.removePrefix(key, str3), '-', '_', false, 4, (Object) null), new FieldProvider4.StringField(value));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void putOptionalGraphQlHeaders(Map<String, FieldProvider4> map, Map<String, String> map2) {
        String str;
        if (map2 == null || (str = map2.get("X-APOLLO-OPERATION-NAME")) == null) {
            return;
        }
        map.put("_path_template", new FieldProvider4.StringField("gql-" + str));
        map.put("_operation_name", new FieldProvider4.StringField(str));
        String str2 = map2.get("X-APOLLO-OPERATION-TYPE");
        if (str2 != null) {
            map.put("_operation_type", new FieldProvider4.StringField(str2));
        }
        String str3 = map2.get("X-APOLLO-OPERATION-ID");
        if (str3 != null) {
            map.put("_operation_id", new FieldProvider4.StringField(str3));
        }
        map.put("_span_name", new FieldProvider4.StringField("_graphql"));
    }
}

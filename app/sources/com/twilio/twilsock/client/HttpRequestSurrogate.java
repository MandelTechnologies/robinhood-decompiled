package com.twilio.twilsock.client;

import com.twilio.twilsock.util.MultiMap;
import com.twilio.twilsock.util.http2;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.Enums4;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TwilsockProtocol.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u0000 '2\u00020\u0001:\u0002&'Bm\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\u0016\b\u0001\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBE\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\u0010\u000fJ&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÁ\u0001¢\u0006\u0002\b%R(\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R(\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0016¨\u0006("}, m3636d2 = {"Lcom/twilio/twilsock/client/HttpRequestSurrogate;", "", "seen1", "", "host", "", "path", "method", "Lcom/twilio/twilsock/util/HttpMethod;", "params", "Lcom/twilio/twilsock/util/MultiMap;", "headers", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/twilio/twilsock/util/HttpMethod;Lcom/twilio/twilsock/util/MultiMap;Lcom/twilio/twilsock/util/MultiMap;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/twilio/twilsock/util/HttpMethod;Lcom/twilio/twilsock/util/MultiMap;Lcom/twilio/twilsock/util/MultiMap;)V", "getHeaders$annotations", "()V", "getHeaders", "()Lcom/twilio/twilsock/util/MultiMap;", "getHost$annotations", "getHost", "()Ljava/lang/String;", "getMethod$annotations", "getMethod", "()Lcom/twilio/twilsock/util/HttpMethod;", "getParams$annotations", "getParams", "getPath$annotations", "getPath", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$twilsock_release", "$serializer", "Companion", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
final class HttpRequestSurrogate {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final MultiMap<String, String> headers;
    private final String host;
    private final http2 method;
    private final MultiMap<String, String> params;
    private final String path;

    @SerialName("headers")
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @SerialName("host")
    public static /* synthetic */ void getHost$annotations() {
    }

    @SerialName("method")
    public static /* synthetic */ void getMethod$annotations() {
    }

    @SerialName("params")
    public static /* synthetic */ void getParams$annotations() {
    }

    @SerialName("path")
    public static /* synthetic */ void getPath$annotations() {
    }

    /* compiled from: TwilsockProtocol.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/twilio/twilsock/client/HttpRequestSurrogate$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/twilsock/client/HttpRequestSurrogate;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HttpRequestSurrogate> serializer() {
            return HttpRequestSurrogate$$serializer.INSTANCE;
        }
    }

    static {
        KSerializer<Object> kSerializerCreateSimpleEnumSerializer = Enums4.createSimpleEnumSerializer("com.twilio.twilsock.util.HttpMethod", http2.values());
        MultiMap.Companion companion = MultiMap.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, kSerializerCreateSimpleEnumSerializer, companion.serializer(stringSerializer, stringSerializer), companion.serializer(stringSerializer, stringSerializer)};
    }

    @Deprecated
    public /* synthetic */ HttpRequestSurrogate(int i, @SerialName("host") String str, @SerialName("path") String str2, @SerialName("method") http2 http2Var, @SerialName("params") MultiMap multiMap, @SerialName("headers") MultiMap multiMap2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptions.throwMissingFieldException(i, 31, HttpRequestSurrogate$$serializer.INSTANCE.getDescriptor());
        }
        this.host = str;
        this.path = str2;
        this.method = http2Var;
        this.params = multiMap;
        this.headers = multiMap2;
    }

    public HttpRequestSurrogate(String host, String path, http2 method, MultiMap<String, String> params, MultiMap<String, String> headers) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.host = host;
        this.path = path;
        this.method = method;
        this.params = params;
        this.headers = headers;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$twilsock_release(HttpRequestSurrogate self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.host);
        output.encodeStringElement(serialDesc, 1, self.path);
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.method);
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.params);
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.headers);
    }

    public final String getHost() {
        return this.host;
    }

    public final String getPath() {
        return this.path;
    }

    public final http2 getMethod() {
        return this.method;
    }

    public final MultiMap<String, String> getParams() {
        return this.params;
    }

    public final MultiMap<String, String> getHeaders() {
        return this.headers;
    }
}

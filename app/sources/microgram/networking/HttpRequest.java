package microgram.networking;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.Enums4;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: HttpRequest.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 72\u00020\u0001:\u0003879Bm\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u00106¨\u0006:"}, m3636d2 = {"Lmicrogram/networking/HttpRequest;", "", "", "seen1", "", "id", "url", "Lmicrogram/networking/HttpRequest$Method;", "method", "Lmicrogram/networking/DataEncodingType;", "responseType", "", "headers", "Lmicrogram/networking/BodyData;", CarResultComposable2.BODY, "timeoutMs", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lmicrogram/networking/HttpRequest$Method;Lmicrogram/networking/DataEncodingType;Ljava/util/Map;Lmicrogram/networking/BodyData;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_networking", "(Lmicrogram/networking/HttpRequest;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getUrl", "Lmicrogram/networking/HttpRequest$Method;", "getMethod", "()Lmicrogram/networking/HttpRequest$Method;", "Lmicrogram/networking/DataEncodingType;", "getResponseType", "()Lmicrogram/networking/DataEncodingType;", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "Lmicrogram/networking/BodyData;", "getBody", "()Lmicrogram/networking/BodyData;", "Ljava/lang/Integer;", "getTimeoutMs", "()Ljava/lang/Integer;", "Companion", "$serializer", "Method", "microgram-networking"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes14.dex */
public final /* data */ class HttpRequest {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BodyData body;
    private final Map<String, String> headers;
    private final String id;
    private final Method method;
    private final CommonTypes3 responseType;
    private final Integer timeoutMs;
    private final String url;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) other;
        return Intrinsics.areEqual(this.id, httpRequest.id) && Intrinsics.areEqual(this.url, httpRequest.url) && this.method == httpRequest.method && this.responseType == httpRequest.responseType && Intrinsics.areEqual(this.headers, httpRequest.headers) && Intrinsics.areEqual(this.body, httpRequest.body) && Intrinsics.areEqual(this.timeoutMs, httpRequest.timeoutMs);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.url.hashCode()) * 31) + this.method.hashCode()) * 31) + this.responseType.hashCode()) * 31) + this.headers.hashCode()) * 31;
        BodyData bodyData = this.body;
        int iHashCode2 = (iHashCode + (bodyData == null ? 0 : bodyData.hashCode())) * 31;
        Integer num = this.timeoutMs;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "HttpRequest(id=" + this.id + ", url=" + this.url + ", method=" + this.method + ", responseType=" + this.responseType + ", headers=" + this.headers + ", body=" + this.body + ", timeoutMs=" + this.timeoutMs + ")";
    }

    /* compiled from: HttpRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/networking/HttpRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/networking/HttpRequest;", "microgram-networking"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HttpRequest> serializer() {
            return HttpRequest7.INSTANCE;
        }
    }

    static {
        KSerializer<Method> kSerializerSerializer = Method.INSTANCE.serializer();
        KSerializer<CommonTypes3> kSerializerSerializer2 = CommonTypes3.INSTANCE.serializer();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, kSerializerSerializer, kSerializerSerializer2, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null};
    }

    @Deprecated
    public /* synthetic */ HttpRequest(int i, String str, String str2, Method method, CommonTypes3 commonTypes3, Map map, BodyData bodyData, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptions.throwMissingFieldException(i, 2, HttpRequest7.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
            str = uuidRandomUUID.toString();
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        }
        this.id = str;
        this.url = str2;
        if ((i & 4) == 0) {
            this.method = Method.GET;
        } else {
            this.method = method;
        }
        if ((i & 8) == 0) {
            this.responseType = CommonTypes3.STRING;
        } else {
            this.responseType = commonTypes3;
        }
        if ((i & 16) == 0) {
            this.headers = MapsKt.emptyMap();
        } else {
            this.headers = map;
        }
        if ((i & 32) == 0) {
            this.body = null;
        } else {
            this.body = bodyData;
        }
        if ((i & 64) == 0) {
            this.timeoutMs = null;
        } else {
            this.timeoutMs = num;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_networking(HttpRequest self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeStringElement(serialDesc, 0, self.id);
        } else {
            String str = self.id;
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
            String string2 = uuidRandomUUID.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            if (!Intrinsics.areEqual(str, string2)) {
            }
        }
        output.encodeStringElement(serialDesc, 1, self.url);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.method != Method.GET) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.method);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.responseType != CommonTypes3.STRING) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.responseType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.headers, MapsKt.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.headers);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.body != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, CommonTypes2.INSTANCE, self.body);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.timeoutMs == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.timeoutMs);
    }

    public final String getId() {
        return this.id;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Method getMethod() {
        return this.method;
    }

    public final CommonTypes3 getResponseType() {
        return this.responseType;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final BodyData getBody() {
        return this.body;
    }

    public final Integer getTimeoutMs() {
        return this.timeoutMs;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HttpRequest.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m3636d2 = {"Lmicrogram/networking/HttpRequest$Method;", "", "(Ljava/lang/String;I)V", "GET", "POST", "PUT", "PATCH", "DELETE", "Companion", "microgram-networking"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final class Method {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Method[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @SerialName("get")
        public static final Method GET = new Method("GET", 0);

        @SerialName("post")
        public static final Method POST = new Method("POST", 1);

        @SerialName("put")
        public static final Method PUT = new Method("PUT", 2);

        @SerialName("patch")
        public static final Method PATCH = new Method("PATCH", 3);

        @SerialName(AnalyticsStrings.BUTTON_LIST_DELETE)
        public static final Method DELETE = new Method("DELETE", 4);

        private static final /* synthetic */ Method[] $values() {
            return new Method[]{GET, POST, PUT, PATCH, DELETE};
        }

        public static EnumEntries<Method> getEntries() {
            return $ENTRIES;
        }

        public static Method valueOf(String str) {
            return (Method) Enum.valueOf(Method.class, str);
        }

        public static Method[] values() {
            return (Method[]) $VALUES.clone();
        }

        /* compiled from: HttpRequest.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/networking/HttpRequest$Method$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/networking/HttpRequest$Method;", "microgram-networking"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Method.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Method> serializer() {
                return get$cachedSerializer();
            }
        }

        private Method(String str, int i) {
        }

        static {
            Method[] methodArr$values = $values();
            $VALUES = methodArr$values;
            $ENTRIES = EnumEntries2.enumEntries(methodArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.networking.HttpRequest.Method.Companion.1
                @Override // kotlin.jvm.functions.Function0
                public final KSerializer<Object> invoke() {
                    return Enums4.createAnnotatedEnumSerializer("microgram.networking.HttpRequest.Method", Method.values(), new String[]{"get", "post", "put", "patch", AnalyticsStrings.BUTTON_LIST_DELETE}, new Annotation[][]{null, null, null, null, null}, null);
                }
            });
        }
    }
}

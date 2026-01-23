package com.twilio.twilsock.client;

import com.twilio.util.InternalUtils3;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.Enums4;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement6;

/* compiled from: TwilsockMessage.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0010\b\u0010\u0018\u0000 \u00192\u00020\u0001:\u0003\u0019\u001a\u001bBK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockMessage;", "", "requestId", "", "method", "Lcom/twilio/twilsock/client/TwilsockMessage$Method;", "rawHeaders", "headers", "Lkotlinx/serialization/json/JsonObject;", "payloadType", "payload", "rawMessage", "", "(Ljava/lang/String;Lcom/twilio/twilsock/client/TwilsockMessage$Method;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;[B)V", "getHeaders", "()Lkotlinx/serialization/json/JsonObject;", "getMethod", "()Lcom/twilio/twilsock/client/TwilsockMessage$Method;", "getPayload", "()Ljava/lang/String;", "getPayloadType", "getRawHeaders", "getRawMessage", "()[B", "getRequestId", "Companion", "Headers", "Method", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public class TwilsockMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final JsonElement6 headers;
    private final Method method;
    private final String payload;
    private final String payloadType;
    private final String rawHeaders;
    private final byte[] rawMessage;
    private final String requestId;

    public TwilsockMessage(String requestId, Method method, String rawHeaders, JsonElement6 headers, String payloadType, String payload, byte[] bArr) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(rawHeaders, "rawHeaders");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(payloadType, "payloadType");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.requestId = requestId;
        this.method = method;
        this.rawHeaders = rawHeaders;
        this.headers = headers;
        this.payloadType = payloadType;
        this.payload = payload;
        this.rawMessage = bArr;
    }

    public /* synthetic */ TwilsockMessage(String str, Method method, String str2, JsonElement6 jsonElement6, String str3, String str4, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InternalUtils3.generateSID("RQ") : str, method, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? InternalUtils3.emptyJsonObject() : jsonElement6, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? null : bArr);
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final Method getMethod() {
        return this.method;
    }

    public final String getRawHeaders() {
        return this.rawHeaders;
    }

    public final JsonElement6 getHeaders() {
        return this.headers;
    }

    public final String getPayloadType() {
        return this.payloadType;
    }

    public final String getPayload() {
        return this.payload;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TwilsockMessage.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockMessage$Method;", "", "(Ljava/lang/String;I)V", "INIT", "UPDATE", "PING", "CLOSE", "NOTIFICATION", "UPSTREAM_REQUEST", "REPLY", "CLIENT_UPDATE", "Companion", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final class Method {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Method[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @SerialName("init")
        public static final Method INIT = new Method("INIT", 0);

        @SerialName("update")
        public static final Method UPDATE = new Method("UPDATE", 1);

        @SerialName("ping")
        public static final Method PING = new Method("PING", 2);

        @SerialName("close")
        public static final Method CLOSE = new Method("CLOSE", 3);

        @SerialName("notification")
        public static final Method NOTIFICATION = new Method("NOTIFICATION", 4);

        @SerialName("message")
        public static final Method UPSTREAM_REQUEST = new Method("UPSTREAM_REQUEST", 5);

        @SerialName("reply")
        public static final Method REPLY = new Method("REPLY", 6);

        @SerialName("client_update")
        public static final Method CLIENT_UPDATE = new Method("CLIENT_UPDATE", 7);

        private static final /* synthetic */ Method[] $values() {
            return new Method[]{INIT, UPDATE, PING, CLOSE, NOTIFICATION, UPSTREAM_REQUEST, REPLY, CLIENT_UPDATE};
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

        /* compiled from: TwilsockMessage.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockMessage$Method$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/twilsock/client/TwilsockMessage$Method;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
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
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.twilio.twilsock.client.TwilsockMessage.Method.Companion.1
                @Override // kotlin.jvm.functions.Function0
                public final KSerializer<Object> invoke() {
                    return Enums4.createAnnotatedEnumSerializer("com.twilio.twilsock.client.TwilsockMessage.Method", Method.values(), new String[]{"init", "update", "ping", "close", "notification", "message", "reply", "client_update"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
                }
            });
        }
    }

    public final byte[] getRawMessage() {
        return this.rawMessage;
    }

    /* compiled from: TwilsockMessage.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./BI\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001J&\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,HÁ\u0001¢\u0006\u0002\b-R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0015\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0018¨\u00060"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockMessage$Headers;", "", "seen1", "", "method", "Lcom/twilio/twilsock/client/TwilsockMessage$Method;", "requestId", "", "payloadSize", "payloadType", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/twilio/twilsock/client/TwilsockMessage$Method;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/twilio/twilsock/client/TwilsockMessage$Method;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getMethod$annotations", "()V", "getMethod", "()Lcom/twilio/twilsock/client/TwilsockMessage$Method;", "getPayloadSize$annotations", "getPayloadSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPayloadType$annotations", "getPayloadType", "()Ljava/lang/String;", "getRequestId$annotations", "getRequestId", "component1", "component2", "component3", "component4", "copy", "(Lcom/twilio/twilsock/client/TwilsockMessage$Method;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/twilio/twilsock/client/TwilsockMessage$Headers;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$twilsock_release", "$serializer", "Companion", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Headers {
        private final Method method;
        private final Integer payloadSize;
        private final String payloadType;
        private final String requestId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final KSerializer<Object>[] $childSerializers = {Method.INSTANCE.serializer(), null, null, null};

        public static /* synthetic */ Headers copy$default(Headers headers, Method method, String str, Integer num, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                method = headers.method;
            }
            if ((i & 2) != 0) {
                str = headers.requestId;
            }
            if ((i & 4) != 0) {
                num = headers.payloadSize;
            }
            if ((i & 8) != 0) {
                str2 = headers.payloadType;
            }
            return headers.copy(method, str, num, str2);
        }

        @SerialName("method")
        public static /* synthetic */ void getMethod$annotations() {
        }

        @SerialName("payload_size")
        public static /* synthetic */ void getPayloadSize$annotations() {
        }

        @SerialName("payload_type")
        public static /* synthetic */ void getPayloadType$annotations() {
        }

        @SerialName("id")
        public static /* synthetic */ void getRequestId$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final Method getMethod() {
            return this.method;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getPayloadSize() {
            return this.payloadSize;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPayloadType() {
            return this.payloadType;
        }

        public final Headers copy(Method method, String requestId, Integer payloadSize, String payloadType) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            return new Headers(method, requestId, payloadSize, payloadType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Headers)) {
                return false;
            }
            Headers headers = (Headers) other;
            return this.method == headers.method && Intrinsics.areEqual(this.requestId, headers.requestId) && Intrinsics.areEqual(this.payloadSize, headers.payloadSize) && Intrinsics.areEqual(this.payloadType, headers.payloadType);
        }

        public int hashCode() {
            int iHashCode = ((this.method.hashCode() * 31) + this.requestId.hashCode()) * 31;
            Integer num = this.payloadSize;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.payloadType;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Headers(method=" + this.method + ", requestId=" + this.requestId + ", payloadSize=" + this.payloadSize + ", payloadType=" + this.payloadType + ')';
        }

        /* compiled from: TwilsockMessage.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockMessage$Headers$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/twilio/twilsock/client/TwilsockMessage$Headers;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Headers> serializer() {
                return TwilsockMessage4.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ Headers(int i, @SerialName("method") Method method, @SerialName("id") String str, @SerialName("payload_size") Integer num, @SerialName("payload_type") String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptions.throwMissingFieldException(i, 3, TwilsockMessage4.INSTANCE.getDescriptor());
            }
            this.method = method;
            this.requestId = str;
            if ((i & 4) == 0) {
                this.payloadSize = null;
            } else {
                this.payloadSize = num;
            }
            if ((i & 8) == 0) {
                this.payloadType = null;
            } else {
                this.payloadType = str2;
            }
        }

        public Headers(Method method, String requestId, Integer num, String str) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.method = method;
            this.requestId = requestId;
            this.payloadSize = num;
            this.payloadType = str;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$twilsock_release(Headers self, Encoding3 output, SerialDescriptor serialDesc) {
            output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.method);
            output.encodeStringElement(serialDesc, 1, self.requestId);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.payloadSize != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.payloadSize);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.payloadType == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.payloadType);
        }

        public /* synthetic */ Headers(Method method, String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2);
        }

        public final Method getMethod() {
            return this.method;
        }

        public final String getRequestId() {
            return this.requestId;
        }

        public final Integer getPayloadSize() {
            return this.payloadSize;
        }

        public final String getPayloadType() {
            return this.payloadType;
        }
    }

    /* compiled from: TwilsockMessage.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockMessage$Companion;", "", "()V", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

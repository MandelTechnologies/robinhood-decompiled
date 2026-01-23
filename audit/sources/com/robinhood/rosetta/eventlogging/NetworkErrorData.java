package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.NetworkErrorData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: NetworkErrorData.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003#$%BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\nH\u0016J\b\u0010!\u001a\u00020\u0006H\u0016JB\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorData;", "Lcom/squareup/wire/Message;", "", "request_method", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "request_url", "", "request_duration_ms", "", "response_status_code", "", "type", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;Ljava/lang/String;JILcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;Lokio/ByteString;)V", "getRequest_method", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "getRequest_url", "()Ljava/lang/String;", "getRequest_duration_ms", "()J", "getResponse_status_code", "()I", "getType", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "Method", "NetworkErrorType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NetworkErrorData extends Message {

    @JvmField
    public static final ProtoAdapter<NetworkErrorData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "requestDurationMs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 5)
    private final long request_duration_ms;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NetworkErrorData$Method#ADAPTER", jsonName = "requestMethod", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Method request_method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String request_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "responseStatusCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final int response_status_code;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NetworkErrorData$NetworkErrorType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
    private final NetworkErrorType type;

    public NetworkErrorData() {
        this(null, null, 0L, 0, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24406newBuilder();
    }

    public final Method getRequest_method() {
        return this.request_method;
    }

    public /* synthetic */ NetworkErrorData(Method method, String str, long j, int i, NetworkErrorType networkErrorType, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Method.METHOD_UNSPECIFIED : method, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? NetworkErrorType.NETWORK_ERROR_TYPE_UNSPECIFIED : networkErrorType, (i2 & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getRequest_url() {
        return this.request_url;
    }

    public final long getRequest_duration_ms() {
        return this.request_duration_ms;
    }

    public final int getResponse_status_code() {
        return this.response_status_code;
    }

    public final NetworkErrorType getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkErrorData(Method request_method, String request_url, long j, int i, NetworkErrorType type2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(request_method, "request_method");
        Intrinsics.checkNotNullParameter(request_url, "request_url");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.request_method = request_method;
        this.request_url = request_url;
        this.request_duration_ms = j;
        this.response_status_code = i;
        this.type = type2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24406newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NetworkErrorData)) {
            return false;
        }
        NetworkErrorData networkErrorData = (NetworkErrorData) other;
        return Intrinsics.areEqual(unknownFields(), networkErrorData.unknownFields()) && this.request_method == networkErrorData.request_method && Intrinsics.areEqual(this.request_url, networkErrorData.request_url) && this.request_duration_ms == networkErrorData.request_duration_ms && this.response_status_code == networkErrorData.response_status_code && this.type == networkErrorData.type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.request_method.hashCode()) * 37) + this.request_url.hashCode()) * 37) + Long.hashCode(this.request_duration_ms)) * 37) + Integer.hashCode(this.response_status_code)) * 37) + this.type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("request_method=" + this.request_method);
        arrayList.add("request_url=" + Internal.sanitize(this.request_url));
        arrayList.add("request_duration_ms=" + this.request_duration_ms);
        arrayList.add("response_status_code=" + this.response_status_code);
        arrayList.add("type=" + this.type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "NetworkErrorData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NetworkErrorData copy$default(NetworkErrorData networkErrorData, Method method, String str, long j, int i, NetworkErrorType networkErrorType, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            method = networkErrorData.request_method;
        }
        if ((i2 & 2) != 0) {
            str = networkErrorData.request_url;
        }
        if ((i2 & 4) != 0) {
            j = networkErrorData.request_duration_ms;
        }
        if ((i2 & 8) != 0) {
            i = networkErrorData.response_status_code;
        }
        if ((i2 & 16) != 0) {
            networkErrorType = networkErrorData.type;
        }
        if ((i2 & 32) != 0) {
            byteString = networkErrorData.unknownFields();
        }
        ByteString byteString2 = byteString;
        int i3 = i;
        long j2 = j;
        return networkErrorData.copy(method, str, j2, i3, networkErrorType, byteString2);
    }

    public final NetworkErrorData copy(Method request_method, String request_url, long request_duration_ms, int response_status_code, NetworkErrorType type2, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(request_method, "request_method");
        Intrinsics.checkNotNullParameter(request_url, "request_url");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NetworkErrorData(request_method, request_url, request_duration_ms, response_status_code, type2, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NetworkErrorData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NetworkErrorData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.NetworkErrorData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NetworkErrorData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getRequest_method() != NetworkErrorData.Method.METHOD_UNSPECIFIED) {
                    size += NetworkErrorData.Method.ADAPTER.encodedSizeWithTag(1, value.getRequest_method());
                }
                if (!Intrinsics.areEqual(value.getRequest_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRequest_url());
                }
                if (value.getRequest_duration_ms() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(5, Long.valueOf(value.getRequest_duration_ms()));
                }
                if (value.getResponse_status_code() != 0) {
                    size += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getResponse_status_code()));
                }
                return value.getType() != NetworkErrorData.NetworkErrorType.NETWORK_ERROR_TYPE_UNSPECIFIED ? size + NetworkErrorData.NetworkErrorType.ADAPTER.encodedSizeWithTag(4, value.getType()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NetworkErrorData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getRequest_method() != NetworkErrorData.Method.METHOD_UNSPECIFIED) {
                    NetworkErrorData.Method.ADAPTER.encodeWithTag(writer, 1, (int) value.getRequest_method());
                }
                if (!Intrinsics.areEqual(value.getRequest_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRequest_url());
                }
                if (value.getRequest_duration_ms() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 5, (int) Long.valueOf(value.getRequest_duration_ms()));
                }
                if (value.getResponse_status_code() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getResponse_status_code()));
                }
                if (value.getType() != NetworkErrorData.NetworkErrorType.NETWORK_ERROR_TYPE_UNSPECIFIED) {
                    NetworkErrorData.NetworkErrorType.ADAPTER.encodeWithTag(writer, 4, (int) value.getType());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NetworkErrorData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getType() != NetworkErrorData.NetworkErrorType.NETWORK_ERROR_TYPE_UNSPECIFIED) {
                    NetworkErrorData.NetworkErrorType.ADAPTER.encodeWithTag(writer, 4, (int) value.getType());
                }
                if (value.getResponse_status_code() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getResponse_status_code()));
                }
                if (value.getRequest_duration_ms() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 5, (int) Long.valueOf(value.getRequest_duration_ms()));
                }
                if (!Intrinsics.areEqual(value.getRequest_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRequest_url());
                }
                if (value.getRequest_method() != NetworkErrorData.Method.METHOD_UNSPECIFIED) {
                    NetworkErrorData.Method.ADAPTER.encodeWithTag(writer, 1, (int) value.getRequest_method());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NetworkErrorData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                NetworkErrorData.Method methodDecode = NetworkErrorData.Method.METHOD_UNSPECIFIED;
                NetworkErrorData.NetworkErrorType networkErrorType = NetworkErrorData.NetworkErrorType.NETWORK_ERROR_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                int iIntValue = 0;
                String strDecode = "";
                NetworkErrorData.NetworkErrorType networkErrorTypeDecode = networkErrorType;
                while (true) {
                    NetworkErrorData.Method method = methodDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new NetworkErrorData(method, strDecode, jLongValue, iIntValue, networkErrorTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                methodDecode = NetworkErrorData.Method.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                        } else if (iNextTag == 4) {
                            try {
                                networkErrorTypeDecode = NetworkErrorData.NetworkErrorType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 5) {
                            jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NetworkErrorData redact(NetworkErrorData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return NetworkErrorData.copy$default(value, null, null, 0L, 0, null, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NetworkErrorData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "METHOD_UNSPECIFIED", "GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS", "HEAD", "CONNECT", "TRACE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Method implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Method[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Method> ADAPTER;
        public static final Method CONNECT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Method DELETE;
        public static final Method GET;
        public static final Method HEAD;
        public static final Method METHOD_UNSPECIFIED;
        public static final Method OPTIONS;
        public static final Method PATCH;
        public static final Method POST;
        public static final Method PUT;
        public static final Method TRACE;
        private final int value;

        private static final /* synthetic */ Method[] $values() {
            return new Method[]{METHOD_UNSPECIFIED, GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, CONNECT, TRACE};
        }

        @JvmStatic
        public static final Method fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Method> getEntries() {
            return $ENTRIES;
        }

        private Method(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Method method = new Method("METHOD_UNSPECIFIED", 0, 0);
            METHOD_UNSPECIFIED = method;
            GET = new Method("GET", 1, 1);
            POST = new Method("POST", 2, 2);
            PUT = new Method("PUT", 3, 3);
            PATCH = new Method("PATCH", 4, 4);
            DELETE = new Method("DELETE", 5, 5);
            OPTIONS = new Method("OPTIONS", 6, 6);
            HEAD = new Method("HEAD", 7, 7);
            CONNECT = new Method("CONNECT", 8, 8);
            TRACE = new Method("TRACE", 9, 9);
            Method[] methodArr$values = $values();
            $VALUES = methodArr$values;
            $ENTRIES = EnumEntries2.enumEntries(methodArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Method.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Method>(orCreateKotlinClass, syntax, method) { // from class: com.robinhood.rosetta.eventlogging.NetworkErrorData$Method$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NetworkErrorData.Method fromValue(int value) {
                    return NetworkErrorData.Method.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NetworkErrorData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Method fromValue(int value) {
                switch (value) {
                    case 0:
                        return Method.METHOD_UNSPECIFIED;
                    case 1:
                        return Method.GET;
                    case 2:
                        return Method.POST;
                    case 3:
                        return Method.PUT;
                    case 4:
                        return Method.PATCH;
                    case 5:
                        return Method.DELETE;
                    case 6:
                        return Method.OPTIONS;
                    case 7:
                        return Method.HEAD;
                    case 8:
                        return Method.CONNECT;
                    case 9:
                        return Method.TRACE;
                    default:
                        return null;
                }
            }
        }

        public static Method valueOf(String str) {
            return (Method) Enum.valueOf(Method.class, str);
        }

        public static Method[] values() {
            return (Method[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NetworkErrorData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NETWORK_ERROR_TYPE_UNSPECIFIED", "NON_2XX_RESPONSE", "TIMEOUT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NetworkErrorType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NetworkErrorType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<NetworkErrorType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final NetworkErrorType NETWORK_ERROR_TYPE_UNSPECIFIED;
        public static final NetworkErrorType NON_2XX_RESPONSE;
        public static final NetworkErrorType TIMEOUT;
        private final int value;

        private static final /* synthetic */ NetworkErrorType[] $values() {
            return new NetworkErrorType[]{NETWORK_ERROR_TYPE_UNSPECIFIED, NON_2XX_RESPONSE, TIMEOUT};
        }

        @JvmStatic
        public static final NetworkErrorType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<NetworkErrorType> getEntries() {
            return $ENTRIES;
        }

        private NetworkErrorType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final NetworkErrorType networkErrorType = new NetworkErrorType("NETWORK_ERROR_TYPE_UNSPECIFIED", 0, 0);
            NETWORK_ERROR_TYPE_UNSPECIFIED = networkErrorType;
            NON_2XX_RESPONSE = new NetworkErrorType("NON_2XX_RESPONSE", 1, 1);
            TIMEOUT = new NetworkErrorType("TIMEOUT", 2, 2);
            NetworkErrorType[] networkErrorTypeArr$values = $values();
            $VALUES = networkErrorTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(networkErrorTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NetworkErrorType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<NetworkErrorType>(orCreateKotlinClass, syntax, networkErrorType) { // from class: com.robinhood.rosetta.eventlogging.NetworkErrorData$NetworkErrorType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NetworkErrorData.NetworkErrorType fromValue(int value) {
                    return NetworkErrorData.NetworkErrorType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NetworkErrorData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final NetworkErrorType fromValue(int value) {
                if (value == 0) {
                    return NetworkErrorType.NETWORK_ERROR_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return NetworkErrorType.NON_2XX_RESPONSE;
                }
                if (value != 2) {
                    return null;
                }
                return NetworkErrorType.TIMEOUT;
            }
        }

        public static NetworkErrorType valueOf(String str) {
            return (NetworkErrorType) Enum.valueOf(NetworkErrorType.class, str);
        }

        public static NetworkErrorType[] values() {
            return (NetworkErrorType[]) $VALUES.clone();
        }
    }
}

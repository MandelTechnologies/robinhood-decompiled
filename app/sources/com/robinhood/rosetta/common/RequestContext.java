package com.robinhood.rosetta.common;

import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: RequestContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/common/RequestContext;", "Lcom/squareup/wire/Message;", "", "ip", "", "device_id", "user_agent", "request_path", "author_major_oak_email", "device_token_hash", "device_creation_time", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLokio/ByteString;)V", "getIp", "()Ljava/lang/String;", "getDevice_id", "getUser_agent", "getRequest_path", "getAuthor_major_oak_email", "getDevice_token_hash", "getDevice_creation_time", "()J", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class RequestContext extends Message {

    @JvmField
    public static final ProtoAdapter<RequestContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "authorMajorOakEmail", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 6)
    private final String author_major_oak_email;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "deviceCreationTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 8)
    private final long device_creation_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceTokenHash", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 7)
    private final String device_token_hash;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ip;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestPath", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final String request_path;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final String user_agent;

    public RequestContext() {
        this(null, null, null, null, null, null, 0L, null, 255, null);
    }

    public /* synthetic */ RequestContext(String str, String str2, String str3, String str4, String str5, String str6, long j, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? 0L : j, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23988newBuilder();
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getUser_agent() {
        return this.user_agent;
    }

    public final String getRequest_path() {
        return this.request_path;
    }

    public final String getAuthor_major_oak_email() {
        return this.author_major_oak_email;
    }

    public final String getDevice_token_hash() {
        return this.device_token_hash;
    }

    public final long getDevice_creation_time() {
        return this.device_creation_time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestContext(String ip, String device_id, String user_agent, String request_path, String author_major_oak_email, String device_token_hash, long j, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(device_id, "device_id");
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(request_path, "request_path");
        Intrinsics.checkNotNullParameter(author_major_oak_email, "author_major_oak_email");
        Intrinsics.checkNotNullParameter(device_token_hash, "device_token_hash");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ip = ip;
        this.device_id = device_id;
        this.user_agent = user_agent;
        this.request_path = request_path;
        this.author_major_oak_email = author_major_oak_email;
        this.device_token_hash = device_token_hash;
        this.device_creation_time = j;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23988newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RequestContext)) {
            return false;
        }
        RequestContext requestContext = (RequestContext) other;
        return Intrinsics.areEqual(unknownFields(), requestContext.unknownFields()) && Intrinsics.areEqual(this.ip, requestContext.ip) && Intrinsics.areEqual(this.device_id, requestContext.device_id) && Intrinsics.areEqual(this.user_agent, requestContext.user_agent) && Intrinsics.areEqual(this.request_path, requestContext.request_path) && Intrinsics.areEqual(this.author_major_oak_email, requestContext.author_major_oak_email) && Intrinsics.areEqual(this.device_token_hash, requestContext.device_token_hash) && this.device_creation_time == requestContext.device_creation_time;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.ip.hashCode()) * 37) + this.device_id.hashCode()) * 37) + this.user_agent.hashCode()) * 37) + this.request_path.hashCode()) * 37) + this.author_major_oak_email.hashCode()) * 37) + this.device_token_hash.hashCode()) * 37) + Long.hashCode(this.device_creation_time);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ip=" + Internal.sanitize(this.ip));
        arrayList.add("device_id=" + Internal.sanitize(this.device_id));
        arrayList.add("user_agent=" + Internal.sanitize(this.user_agent));
        arrayList.add("request_path=" + Internal.sanitize(this.request_path));
        arrayList.add("author_major_oak_email=" + Internal.sanitize(this.author_major_oak_email));
        arrayList.add("device_token_hash=" + Internal.sanitize(this.device_token_hash));
        arrayList.add("device_creation_time=" + this.device_creation_time);
        return CollectionsKt.joinToString$default(arrayList, ", ", "RequestContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RequestContext copy$default(RequestContext requestContext, String str, String str2, String str3, String str4, String str5, String str6, long j, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestContext.ip;
        }
        if ((i & 2) != 0) {
            str2 = requestContext.device_id;
        }
        if ((i & 4) != 0) {
            str3 = requestContext.user_agent;
        }
        if ((i & 8) != 0) {
            str4 = requestContext.request_path;
        }
        if ((i & 16) != 0) {
            str5 = requestContext.author_major_oak_email;
        }
        if ((i & 32) != 0) {
            str6 = requestContext.device_token_hash;
        }
        if ((i & 64) != 0) {
            j = requestContext.device_creation_time;
        }
        if ((i & 128) != 0) {
            byteString = requestContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        long j2 = j;
        String str7 = str5;
        String str8 = str6;
        return requestContext.copy(str, str2, str3, str4, str7, str8, j2, byteString2);
    }

    public final RequestContext copy(String ip, String device_id, String user_agent, String request_path, String author_major_oak_email, String device_token_hash, long device_creation_time, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(device_id, "device_id");
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(request_path, "request_path");
        Intrinsics.checkNotNullParameter(author_major_oak_email, "author_major_oak_email");
        Intrinsics.checkNotNullParameter(device_token_hash, "device_token_hash");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RequestContext(ip, device_id, user_agent, request_path, author_major_oak_email, device_token_hash, device_creation_time, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RequestContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RequestContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.common.RequestContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RequestContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getIp(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getIp());
                }
                if (!Intrinsics.areEqual(value.getDevice_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDevice_id());
                }
                if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getUser_agent());
                }
                if (!Intrinsics.areEqual(value.getRequest_path(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getRequest_path());
                }
                if (!Intrinsics.areEqual(value.getAuthor_major_oak_email(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getAuthor_major_oak_email());
                }
                if (!Intrinsics.areEqual(value.getDevice_token_hash(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getDevice_token_hash());
                }
                return value.getDevice_creation_time() != 0 ? size + ProtoAdapter.INT64.encodedSizeWithTag(8, Long.valueOf(value.getDevice_creation_time())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RequestContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getIp(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIp());
                }
                if (!Intrinsics.areEqual(value.getDevice_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDevice_id());
                }
                if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUser_agent());
                }
                if (!Intrinsics.areEqual(value.getRequest_path(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRequest_path());
                }
                if (!Intrinsics.areEqual(value.getAuthor_major_oak_email(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAuthor_major_oak_email());
                }
                if (!Intrinsics.areEqual(value.getDevice_token_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getDevice_token_hash());
                }
                if (value.getDevice_creation_time() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 8, (int) Long.valueOf(value.getDevice_creation_time()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RequestContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDevice_creation_time() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 8, (int) Long.valueOf(value.getDevice_creation_time()));
                }
                if (!Intrinsics.areEqual(value.getDevice_token_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getDevice_token_hash());
                }
                if (!Intrinsics.areEqual(value.getAuthor_major_oak_email(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAuthor_major_oak_email());
                }
                if (!Intrinsics.areEqual(value.getRequest_path(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRequest_path());
                }
                if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUser_agent());
                }
                if (!Intrinsics.areEqual(value.getDevice_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDevice_id());
                }
                if (Intrinsics.areEqual(value.getIp(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIp());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RequestContext redact(RequestContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RequestContext.copy$default(value, null, null, null, null, null, null, 0L, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RequestContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                long jLongValue = 0;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 4:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                        }
                    } else {
                        return new RequestContext(strDecode, strDecode5, strDecode6, strDecode2, strDecode3, strDecode4, jLongValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}

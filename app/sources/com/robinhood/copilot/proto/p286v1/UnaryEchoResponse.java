package com.robinhood.copilot.proto.p286v1;

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

/* compiled from: UnaryEchoResponse.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/UnaryEchoResponse;", "Lcom/squareup/wire/Message;", "", "message", "", "client_name", "server_name", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getMessage", "()Ljava/lang/String;", "getClient_name", "getServer_name", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class UnaryEchoResponse extends Message {

    @JvmField
    public static final ProtoAdapter<UnaryEchoResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clientName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String client_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "serverName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String server_name;

    public UnaryEchoResponse() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ UnaryEchoResponse(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22179newBuilder();
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getClient_name() {
        return this.client_name;
    }

    public final String getServer_name() {
        return this.server_name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnaryEchoResponse(String message, String client_name, String server_name, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(client_name, "client_name");
        Intrinsics.checkNotNullParameter(server_name, "server_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.message = message;
        this.client_name = client_name;
        this.server_name = server_name;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22179newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UnaryEchoResponse)) {
            return false;
        }
        UnaryEchoResponse unaryEchoResponse = (UnaryEchoResponse) other;
        return Intrinsics.areEqual(unknownFields(), unaryEchoResponse.unknownFields()) && Intrinsics.areEqual(this.message, unaryEchoResponse.message) && Intrinsics.areEqual(this.client_name, unaryEchoResponse.client_name) && Intrinsics.areEqual(this.server_name, unaryEchoResponse.server_name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.message.hashCode()) * 37) + this.client_name.hashCode()) * 37) + this.server_name.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("message=" + Internal.sanitize(this.message));
        arrayList.add("client_name=" + Internal.sanitize(this.client_name));
        arrayList.add("server_name=" + Internal.sanitize(this.server_name));
        return CollectionsKt.joinToString$default(arrayList, ", ", "UnaryEchoResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UnaryEchoResponse copy$default(UnaryEchoResponse unaryEchoResponse, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unaryEchoResponse.message;
        }
        if ((i & 2) != 0) {
            str2 = unaryEchoResponse.client_name;
        }
        if ((i & 4) != 0) {
            str3 = unaryEchoResponse.server_name;
        }
        if ((i & 8) != 0) {
            byteString = unaryEchoResponse.unknownFields();
        }
        return unaryEchoResponse.copy(str, str2, str3, byteString);
    }

    public final UnaryEchoResponse copy(String message, String client_name, String server_name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(client_name, "client_name");
        Intrinsics.checkNotNullParameter(server_name, "server_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UnaryEchoResponse(message, client_name, server_name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UnaryEchoResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UnaryEchoResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.UnaryEchoResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UnaryEchoResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getClient_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getClient_name());
                }
                return !Intrinsics.areEqual(value.getServer_name(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getServer_name()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UnaryEchoResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getClient_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getClient_name());
                }
                if (!Intrinsics.areEqual(value.getServer_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getServer_name());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UnaryEchoResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getServer_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getServer_name());
                }
                if (!Intrinsics.areEqual(value.getClient_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getClient_name());
                }
                if (Intrinsics.areEqual(value.getMessage(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMessage());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UnaryEchoResponse redact(UnaryEchoResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UnaryEchoResponse.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UnaryEchoResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UnaryEchoResponse(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}

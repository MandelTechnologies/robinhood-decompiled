package com.robinhood.rosetta.eventlogging;

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

/* compiled from: ClientContext.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientContext;", "Lcom/squareup/wire/Message;", "", "os_version", "", "platform", "app_version", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getOs_version", "()Ljava/lang/String;", "getPlatform", "getApp_version", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientContext extends Message {

    @JvmField
    public static final ProtoAdapter<ClientContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "appVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String app_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "osVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String os_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String platform;

    public ClientContext() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ ClientContext(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24095newBuilder();
    }

    public final String getOs_version() {
        return this.os_version;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getApp_version() {
        return this.app_version;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientContext(String os_version, String platform, String app_version, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.os_version = os_version;
        this.platform = platform;
        this.app_version = app_version;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24095newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientContext)) {
            return false;
        }
        ClientContext clientContext = (ClientContext) other;
        return Intrinsics.areEqual(unknownFields(), clientContext.unknownFields()) && Intrinsics.areEqual(this.os_version, clientContext.os_version) && Intrinsics.areEqual(this.platform, clientContext.platform) && Intrinsics.areEqual(this.app_version, clientContext.app_version);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.os_version.hashCode()) * 37) + this.platform.hashCode()) * 37) + this.app_version.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("os_version=" + Internal.sanitize(this.os_version));
        arrayList.add("platform=" + Internal.sanitize(this.platform));
        arrayList.add("app_version=" + Internal.sanitize(this.app_version));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientContext copy$default(ClientContext clientContext, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientContext.os_version;
        }
        if ((i & 2) != 0) {
            str2 = clientContext.platform;
        }
        if ((i & 4) != 0) {
            str3 = clientContext.app_version;
        }
        if ((i & 8) != 0) {
            byteString = clientContext.unknownFields();
        }
        return clientContext.copy(str, str2, str3, byteString);
    }

    public final ClientContext copy(String os_version, String platform, String app_version, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientContext(os_version, platform, app_version, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOs_version());
                }
                if (!Intrinsics.areEqual(value.getPlatform(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPlatform());
                }
                return !Intrinsics.areEqual(value.getApp_version(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getApp_version()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOs_version());
                }
                if (!Intrinsics.areEqual(value.getPlatform(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPlatform());
                }
                if (!Intrinsics.areEqual(value.getApp_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getApp_version());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getApp_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getApp_version());
                }
                if (!Intrinsics.areEqual(value.getPlatform(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPlatform());
                }
                if (Intrinsics.areEqual(value.getOs_version(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOs_version());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientContext redact(ClientContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ClientContext.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ClientContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ClientContext(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
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

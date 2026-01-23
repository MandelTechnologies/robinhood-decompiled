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
import p479j$.time.Instant;

/* compiled from: ClientBinaryEvent.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B_\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJe\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b-\u0010,R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b.\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBinaryEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "version", "", "download_size_in_mb", "install_size_in_mb", "device_type", "Lcom/robinhood/rosetta/eventlogging/ClientApp;", "app", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;DDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientApp;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;DDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientApp;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientBinaryEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Ljava/lang/String;", "getVersion", "D", "getDownload_size_in_mb", "()D", "getInstall_size_in_mb", "getDevice_type", "Lcom/robinhood/rosetta/eventlogging/ClientApp;", "getApp", "()Lcom/robinhood/rosetta/eventlogging/ClientApp;", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientBinaryEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientBinaryEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientApp#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final ClientApp app;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String device_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "downloadSizeInMb", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double download_size_in_mb;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "installSizeInMb", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final double install_size_in_mb;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String version;

    public ClientBinaryEvent() {
        this(null, null, null, 0.0d, 0.0d, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24077newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientBinaryEvent(ClientPlatform clientPlatform, Instant instant, String str, double d, double d2, String str2, ClientApp clientApp, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? 0.0d : d2, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? ClientApp.CLIENT_APP_UNDEFINED : clientApp, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getVersion() {
        return this.version;
    }

    public final double getDownload_size_in_mb() {
        return this.download_size_in_mb;
    }

    public final double getInstall_size_in_mb() {
        return this.install_size_in_mb;
    }

    public final String getDevice_type() {
        return this.device_type;
    }

    public final ClientApp getApp() {
        return this.app;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientBinaryEvent(ClientPlatform platform, Instant instant, String version, double d, double d2, String device_type, ClientApp app, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(device_type, "device_type");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.version = version;
        this.download_size_in_mb = d;
        this.install_size_in_mb = d2;
        this.device_type = device_type;
        this.app = app;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24077newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientBinaryEvent)) {
            return false;
        }
        ClientBinaryEvent clientBinaryEvent = (ClientBinaryEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientBinaryEvent.unknownFields()) && this.platform == clientBinaryEvent.platform && Intrinsics.areEqual(this.timestamp, clientBinaryEvent.timestamp) && Intrinsics.areEqual(this.version, clientBinaryEvent.version) && this.download_size_in_mb == clientBinaryEvent.download_size_in_mb && this.install_size_in_mb == clientBinaryEvent.install_size_in_mb && Intrinsics.areEqual(this.device_type, clientBinaryEvent.device_type) && this.app == clientBinaryEvent.app;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.version.hashCode()) * 37) + Double.hashCode(this.download_size_in_mb)) * 37) + Double.hashCode(this.install_size_in_mb)) * 37) + this.device_type.hashCode()) * 37) + this.app.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("platform=" + this.platform);
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("version=" + Internal.sanitize(this.version));
        arrayList.add("download_size_in_mb=" + this.download_size_in_mb);
        arrayList.add("install_size_in_mb=" + this.install_size_in_mb);
        arrayList.add("device_type=" + Internal.sanitize(this.device_type));
        arrayList.add("app=" + this.app);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientBinaryEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientBinaryEvent copy$default(ClientBinaryEvent clientBinaryEvent, ClientPlatform clientPlatform, Instant instant, String str, double d, double d2, String str2, ClientApp clientApp, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            clientPlatform = clientBinaryEvent.platform;
        }
        if ((i & 2) != 0) {
            instant = clientBinaryEvent.timestamp;
        }
        if ((i & 4) != 0) {
            str = clientBinaryEvent.version;
        }
        if ((i & 8) != 0) {
            d = clientBinaryEvent.download_size_in_mb;
        }
        if ((i & 16) != 0) {
            d2 = clientBinaryEvent.install_size_in_mb;
        }
        if ((i & 32) != 0) {
            str2 = clientBinaryEvent.device_type;
        }
        if ((i & 64) != 0) {
            clientApp = clientBinaryEvent.app;
        }
        if ((i & 128) != 0) {
            byteString = clientBinaryEvent.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        double d3 = d2;
        double d4 = d;
        String str4 = str;
        return clientBinaryEvent.copy(clientPlatform, instant, str4, d4, d3, str3, clientApp, byteString2);
    }

    public final ClientBinaryEvent copy(ClientPlatform platform, Instant timestamp, String version, double download_size_in_mb, double install_size_in_mb, String device_type, ClientApp app, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(device_type, "device_type");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientBinaryEvent(platform, timestamp, version, download_size_in_mb, install_size_in_mb, device_type, app, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientBinaryEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientBinaryEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientBinaryEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientBinaryEvent value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getVersion(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getVersion());
                }
                if (!Double.valueOf(value.getDownload_size_in_mb()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getDownload_size_in_mb()));
                }
                if (!Double.valueOf(value.getInstall_size_in_mb()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(5, Double.valueOf(value.getInstall_size_in_mb()));
                }
                if (!Intrinsics.areEqual(value.getDevice_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDevice_type());
                }
                return value.getApp() != ClientApp.CLIENT_APP_UNDEFINED ? size + ClientApp.ADAPTER.encodedSizeWithTag(7, value.getApp()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientBinaryEvent value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getVersion(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getVersion());
                }
                if (!Double.valueOf(value.getDownload_size_in_mb()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getDownload_size_in_mb()));
                }
                if (!Double.valueOf(value.getInstall_size_in_mb()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getInstall_size_in_mb()));
                }
                if (!Intrinsics.areEqual(value.getDevice_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDevice_type());
                }
                if (value.getApp() != ClientApp.CLIENT_APP_UNDEFINED) {
                    ClientApp.ADAPTER.encodeWithTag(writer, 7, (int) value.getApp());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientBinaryEvent value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getApp() != ClientApp.CLIENT_APP_UNDEFINED) {
                    ClientApp.ADAPTER.encodeWithTag(writer, 7, (int) value.getApp());
                }
                if (!Intrinsics.areEqual(value.getDevice_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDevice_type());
                }
                if (!Double.valueOf(value.getInstall_size_in_mb()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getInstall_size_in_mb()));
                }
                if (!Double.valueOf(value.getDownload_size_in_mb()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getDownload_size_in_mb()));
                }
                if (!Intrinsics.areEqual(value.getVersion(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getVersion());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ClientBinaryEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                ClientApp clientApp = ClientApp.CLIENT_APP_UNDEFINED;
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                String strDecode = "";
                String strDecode2 = strDecode;
                Instant instantDecode = null;
                ClientApp clientAppDecode = clientApp;
                while (true) {
                    ClientPlatform clientPlatform = clientPlatformDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        clientPlatformDecode = ClientPlatform.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                case 3:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 5:
                                    dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 6:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    try {
                                        clientAppDecode = ClientApp.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ClientBinaryEvent(clientPlatform, instantDecode, strDecode, dDoubleValue, dDoubleValue2, strDecode2, clientAppDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientBinaryEvent redact(ClientBinaryEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return ClientBinaryEvent.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, 0.0d, 0.0d, null, null, ByteString.EMPTY, 125, null);
            }
        };
    }
}

package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.NetworkConnection;
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

/* compiled from: NetworkConnection.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", "Lcom/squareup/wire/Message;", "", "connection_type", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "is_metered", "", "signal_level", "", "link_bandwidth", "Lcom/robinhood/rosetta/eventlogging/Bandwidth;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;ZFLcom/robinhood/rosetta/eventlogging/Bandwidth;Lokio/ByteString;)V", "getConnection_type", "()Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "()Z", "getSignal_level", "()F", "getLink_bandwidth", "()Lcom/robinhood/rosetta/eventlogging/Bandwidth;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ConnectionType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NetworkConnection extends Message {

    @JvmField
    public static final ProtoAdapter<NetworkConnection> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NetworkConnection$ConnectionType#ADAPTER", jsonName = "connectionType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ConnectionType connection_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isMetered", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_metered;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Bandwidth#ADAPTER", jsonName = "linkBandwidth", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Bandwidth link_bandwidth;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "signalLevel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float signal_level;

    public NetworkConnection() {
        this(null, false, 0.0f, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24404newBuilder();
    }

    public final ConnectionType getConnection_type() {
        return this.connection_type;
    }

    public /* synthetic */ NetworkConnection(ConnectionType connectionType, boolean z, float f, Bandwidth bandwidth, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ConnectionType.CONNECTION_TYPE_UNSPECIFIED : connectionType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? null : bandwidth, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* renamed from: is_metered, reason: from getter */
    public final boolean getIs_metered() {
        return this.is_metered;
    }

    public final float getSignal_level() {
        return this.signal_level;
    }

    public final Bandwidth getLink_bandwidth() {
        return this.link_bandwidth;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkConnection(ConnectionType connection_type, boolean z, float f, Bandwidth bandwidth, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(connection_type, "connection_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.connection_type = connection_type;
        this.is_metered = z;
        this.signal_level = f;
        this.link_bandwidth = bandwidth;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24404newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NetworkConnection)) {
            return false;
        }
        NetworkConnection networkConnection = (NetworkConnection) other;
        return Intrinsics.areEqual(unknownFields(), networkConnection.unknownFields()) && this.connection_type == networkConnection.connection_type && this.is_metered == networkConnection.is_metered && this.signal_level == networkConnection.signal_level && Intrinsics.areEqual(this.link_bandwidth, networkConnection.link_bandwidth);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.connection_type.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_metered)) * 37) + Float.hashCode(this.signal_level)) * 37;
        Bandwidth bandwidth = this.link_bandwidth;
        int iHashCode2 = iHashCode + (bandwidth != null ? bandwidth.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("connection_type=" + this.connection_type);
        arrayList.add("is_metered=" + this.is_metered);
        arrayList.add("signal_level=" + this.signal_level);
        Bandwidth bandwidth = this.link_bandwidth;
        if (bandwidth != null) {
            arrayList.add("link_bandwidth=" + bandwidth);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NetworkConnection{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NetworkConnection copy$default(NetworkConnection networkConnection, ConnectionType connectionType, boolean z, float f, Bandwidth bandwidth, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            connectionType = networkConnection.connection_type;
        }
        if ((i & 2) != 0) {
            z = networkConnection.is_metered;
        }
        if ((i & 4) != 0) {
            f = networkConnection.signal_level;
        }
        if ((i & 8) != 0) {
            bandwidth = networkConnection.link_bandwidth;
        }
        if ((i & 16) != 0) {
            byteString = networkConnection.unknownFields();
        }
        ByteString byteString2 = byteString;
        float f2 = f;
        return networkConnection.copy(connectionType, z, f2, bandwidth, byteString2);
    }

    public final NetworkConnection copy(ConnectionType connection_type, boolean is_metered, float signal_level, Bandwidth link_bandwidth, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(connection_type, "connection_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NetworkConnection(connection_type, is_metered, signal_level, link_bandwidth, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NetworkConnection.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NetworkConnection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.NetworkConnection$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NetworkConnection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getConnection_type() != NetworkConnection.ConnectionType.CONNECTION_TYPE_UNSPECIFIED) {
                    size += NetworkConnection.ConnectionType.ADAPTER.encodedSizeWithTag(1, value.getConnection_type());
                }
                if (value.getIs_metered()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, java.lang.Boolean.valueOf(value.getIs_metered()));
                }
                if (!Float.valueOf(value.getSignal_level()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getSignal_level()));
                }
                return value.getLink_bandwidth() != null ? size + Bandwidth.ADAPTER.encodedSizeWithTag(4, value.getLink_bandwidth()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NetworkConnection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getConnection_type() != NetworkConnection.ConnectionType.CONNECTION_TYPE_UNSPECIFIED) {
                    NetworkConnection.ConnectionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getConnection_type());
                }
                if (value.getIs_metered()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getIs_metered()));
                }
                if (!Float.valueOf(value.getSignal_level()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getSignal_level()));
                }
                if (value.getLink_bandwidth() != null) {
                    Bandwidth.ADAPTER.encodeWithTag(writer, 4, (int) value.getLink_bandwidth());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NetworkConnection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLink_bandwidth() != null) {
                    Bandwidth.ADAPTER.encodeWithTag(writer, 4, (int) value.getLink_bandwidth());
                }
                if (!Float.valueOf(value.getSignal_level()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getSignal_level()));
                }
                if (value.getIs_metered()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getIs_metered()));
                }
                if (value.getConnection_type() != NetworkConnection.ConnectionType.CONNECTION_TYPE_UNSPECIFIED) {
                    NetworkConnection.ConnectionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getConnection_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NetworkConnection decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                NetworkConnection.ConnectionType connectionTypeDecode = NetworkConnection.ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Bandwidth bandwidthDecode = null;
                boolean zBooleanValue = false;
                float fFloatValue = 0.0f;
                while (true) {
                    NetworkConnection.ConnectionType connectionType = connectionTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new NetworkConnection(connectionType, zBooleanValue, fFloatValue, bandwidthDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                connectionTypeDecode = NetworkConnection.ConnectionType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (iNextTag == 3) {
                            fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        } else if (iNextTag == 4) {
                            bandwidthDecode = Bandwidth.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NetworkConnection redact(NetworkConnection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Bandwidth link_bandwidth = value.getLink_bandwidth();
                return NetworkConnection.copy$default(value, null, false, 0.0f, link_bandwidth != null ? Bandwidth.ADAPTER.redact(link_bandwidth) : null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NetworkConnection.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONNECTION_TYPE_UNSPECIFIED", "WIFI", "CELLULAR", "NOT_CONNECTED", "BLUETOOTH", "ETHERNET", "VPN", "WIFI_AWARE", "LOWPAN", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ConnectionType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConnectionType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ConnectionType> ADAPTER;
        public static final ConnectionType BLUETOOTH;
        public static final ConnectionType CELLULAR;
        public static final ConnectionType CONNECTION_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ConnectionType ETHERNET;
        public static final ConnectionType LOWPAN;
        public static final ConnectionType NOT_CONNECTED;
        public static final ConnectionType VPN;
        public static final ConnectionType WIFI;
        public static final ConnectionType WIFI_AWARE;
        private final int value;

        private static final /* synthetic */ ConnectionType[] $values() {
            return new ConnectionType[]{CONNECTION_TYPE_UNSPECIFIED, WIFI, CELLULAR, NOT_CONNECTED, BLUETOOTH, ETHERNET, VPN, WIFI_AWARE, LOWPAN};
        }

        @JvmStatic
        public static final ConnectionType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ConnectionType> getEntries() {
            return $ENTRIES;
        }

        private ConnectionType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ConnectionType connectionType = new ConnectionType("CONNECTION_TYPE_UNSPECIFIED", 0, 0);
            CONNECTION_TYPE_UNSPECIFIED = connectionType;
            WIFI = new ConnectionType("WIFI", 1, 1);
            CELLULAR = new ConnectionType("CELLULAR", 2, 2);
            NOT_CONNECTED = new ConnectionType("NOT_CONNECTED", 3, 3);
            BLUETOOTH = new ConnectionType("BLUETOOTH", 4, 4);
            ETHERNET = new ConnectionType("ETHERNET", 5, 5);
            VPN = new ConnectionType("VPN", 6, 6);
            WIFI_AWARE = new ConnectionType("WIFI_AWARE", 7, 7);
            LOWPAN = new ConnectionType("LOWPAN", 8, 8);
            ConnectionType[] connectionTypeArr$values = $values();
            $VALUES = connectionTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(connectionTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConnectionType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ConnectionType>(orCreateKotlinClass, syntax, connectionType) { // from class: com.robinhood.rosetta.eventlogging.NetworkConnection$ConnectionType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NetworkConnection.ConnectionType fromValue(int value) {
                    return NetworkConnection.ConnectionType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NetworkConnection.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ConnectionType fromValue(int value) {
                switch (value) {
                    case 0:
                        return ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
                    case 1:
                        return ConnectionType.WIFI;
                    case 2:
                        return ConnectionType.CELLULAR;
                    case 3:
                        return ConnectionType.NOT_CONNECTED;
                    case 4:
                        return ConnectionType.BLUETOOTH;
                    case 5:
                        return ConnectionType.ETHERNET;
                    case 6:
                        return ConnectionType.VPN;
                    case 7:
                        return ConnectionType.WIFI_AWARE;
                    case 8:
                        return ConnectionType.LOWPAN;
                    default:
                        return null;
                }
            }
        }

        public static ConnectionType valueOf(String str) {
            return (ConnectionType) Enum.valueOf(ConnectionType.class, str);
        }

        public static ConnectionType[] values() {
            return (ConnectionType[]) $VALUES.clone();
        }
    }
}

package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: ClientDeployEvent.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010BU\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ[\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b/\u0010\u001e¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientDeployEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "version", "Lcom/robinhood/rosetta/eventlogging/ClientDeployType;", "deploy_type", "Lcom/robinhood/rosetta/eventlogging/ClientDeployDestination;", "destination", "application_id", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientDeployType;Lcom/robinhood/rosetta/eventlogging/ClientDeployDestination;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientDeployType;Lcom/robinhood/rosetta/eventlogging/ClientDeployDestination;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientDeployEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Ljava/lang/String;", "getVersion", "Lcom/robinhood/rosetta/eventlogging/ClientDeployType;", "getDeploy_type", "()Lcom/robinhood/rosetta/eventlogging/ClientDeployType;", "Lcom/robinhood/rosetta/eventlogging/ClientDeployDestination;", "getDestination", "()Lcom/robinhood/rosetta/eventlogging/ClientDeployDestination;", "getApplication_id", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientDeployEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientDeployEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "applicationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String application_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientDeployType#ADAPTER", jsonName = "deployType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ClientDeployType deploy_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientDeployDestination#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final ClientDeployDestination destination;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String version;

    public ClientDeployEvent() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24099newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientDeployEvent(ClientPlatform clientPlatform, Instant instant, String str, ClientDeployType clientDeployType, ClientDeployDestination clientDeployDestination, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ClientDeployType.DEFAULT_DEPLOY_TYPE : clientDeployType, (i & 16) != 0 ? ClientDeployDestination.DEFAULT_DESTINATION : clientDeployDestination, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getVersion() {
        return this.version;
    }

    public final ClientDeployType getDeploy_type() {
        return this.deploy_type;
    }

    public final ClientDeployDestination getDestination() {
        return this.destination;
    }

    public final String getApplication_id() {
        return this.application_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientDeployEvent(ClientPlatform platform, Instant instant, String version, ClientDeployType deploy_type, ClientDeployDestination destination, String application_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(deploy_type, "deploy_type");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(application_id, "application_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.version = version;
        this.deploy_type = deploy_type;
        this.destination = destination;
        this.application_id = application_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24099newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientDeployEvent)) {
            return false;
        }
        ClientDeployEvent clientDeployEvent = (ClientDeployEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientDeployEvent.unknownFields()) && this.platform == clientDeployEvent.platform && Intrinsics.areEqual(this.timestamp, clientDeployEvent.timestamp) && Intrinsics.areEqual(this.version, clientDeployEvent.version) && this.deploy_type == clientDeployEvent.deploy_type && this.destination == clientDeployEvent.destination && Intrinsics.areEqual(this.application_id, clientDeployEvent.application_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.version.hashCode()) * 37) + this.deploy_type.hashCode()) * 37) + this.destination.hashCode()) * 37) + this.application_id.hashCode();
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
        arrayList.add("deploy_type=" + this.deploy_type);
        arrayList.add("destination=" + this.destination);
        arrayList.add("application_id=" + Internal.sanitize(this.application_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientDeployEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientDeployEvent copy$default(ClientDeployEvent clientDeployEvent, ClientPlatform clientPlatform, Instant instant, String str, ClientDeployType clientDeployType, ClientDeployDestination clientDeployDestination, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            clientPlatform = clientDeployEvent.platform;
        }
        if ((i & 2) != 0) {
            instant = clientDeployEvent.timestamp;
        }
        if ((i & 4) != 0) {
            str = clientDeployEvent.version;
        }
        if ((i & 8) != 0) {
            clientDeployType = clientDeployEvent.deploy_type;
        }
        if ((i & 16) != 0) {
            clientDeployDestination = clientDeployEvent.destination;
        }
        if ((i & 32) != 0) {
            str2 = clientDeployEvent.application_id;
        }
        if ((i & 64) != 0) {
            byteString = clientDeployEvent.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        ClientDeployDestination clientDeployDestination2 = clientDeployDestination;
        String str4 = str;
        return clientDeployEvent.copy(clientPlatform, instant, str4, clientDeployType, clientDeployDestination2, str3, byteString2);
    }

    public final ClientDeployEvent copy(ClientPlatform platform, Instant timestamp, String version, ClientDeployType deploy_type, ClientDeployDestination destination, String application_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(deploy_type, "deploy_type");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(application_id, "application_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientDeployEvent(platform, timestamp, version, deploy_type, destination, application_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientDeployEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientDeployEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientDeployEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientDeployEvent value) {
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
                if (value.getDeploy_type() != ClientDeployType.DEFAULT_DEPLOY_TYPE) {
                    size += ClientDeployType.ADAPTER.encodedSizeWithTag(4, value.getDeploy_type());
                }
                if (value.getDestination() != ClientDeployDestination.DEFAULT_DESTINATION) {
                    size += ClientDeployDestination.ADAPTER.encodedSizeWithTag(5, value.getDestination());
                }
                return !Intrinsics.areEqual(value.getApplication_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getApplication_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientDeployEvent value) throws IOException {
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
                if (value.getDeploy_type() != ClientDeployType.DEFAULT_DEPLOY_TYPE) {
                    ClientDeployType.ADAPTER.encodeWithTag(writer, 4, (int) value.getDeploy_type());
                }
                if (value.getDestination() != ClientDeployDestination.DEFAULT_DESTINATION) {
                    ClientDeployDestination.ADAPTER.encodeWithTag(writer, 5, (int) value.getDestination());
                }
                if (!Intrinsics.areEqual(value.getApplication_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getApplication_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientDeployEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getApplication_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getApplication_id());
                }
                if (value.getDestination() != ClientDeployDestination.DEFAULT_DESTINATION) {
                    ClientDeployDestination.ADAPTER.encodeWithTag(writer, 5, (int) value.getDestination());
                }
                if (value.getDeploy_type() != ClientDeployType.DEFAULT_DEPLOY_TYPE) {
                    ClientDeployType.ADAPTER.encodeWithTag(writer, 4, (int) value.getDeploy_type());
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
            public ClientDeployEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                ClientDeployType clientDeployType = ClientDeployType.DEFAULT_DEPLOY_TYPE;
                ClientDeployDestination clientDeployDestination = ClientDeployDestination.DEFAULT_DESTINATION;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                Instant instantDecode = null;
                ClientDeployDestination clientDeployDestinationDecode = clientDeployDestination;
                ClientDeployType clientDeployTypeDecode = clientDeployType;
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
                                    try {
                                        clientDeployTypeDecode = ClientDeployType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 5:
                                    try {
                                        clientDeployDestinationDecode = ClientDeployDestination.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 6:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ClientDeployEvent(clientPlatform, instantDecode, strDecode, clientDeployTypeDecode, clientDeployDestinationDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientDeployEvent redact(ClientDeployEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return ClientDeployEvent.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, null, ByteString.EMPTY, 61, null);
            }
        };
    }
}

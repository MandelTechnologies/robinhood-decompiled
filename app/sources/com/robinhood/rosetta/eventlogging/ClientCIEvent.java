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

/* compiled from: ClientCIEvent.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00015Ba\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 Jg\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b4\u00100¨\u00066"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCIEvent;", "Lcom/squareup/wire/Message;", "", "", "id", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "Lcom/robinhood/rosetta/eventlogging/Environment;", "environment", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "duration", "Lcom/robinhood/rosetta/eventlogging/CIStatus;", "status", "wait_duration", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lcom/robinhood/rosetta/eventlogging/Environment;Lj$/time/Instant;FLcom/robinhood/rosetta/eventlogging/CIStatus;FLokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lcom/robinhood/rosetta/eventlogging/Environment;Lj$/time/Instant;FLcom/robinhood/rosetta/eventlogging/CIStatus;FLokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientCIEvent;", "Ljava/lang/String;", "getId", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lcom/robinhood/rosetta/eventlogging/Environment;", "getEnvironment", "()Lcom/robinhood/rosetta/eventlogging/Environment;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "F", "getDuration", "()F", "Lcom/robinhood/rosetta/eventlogging/CIStatus;", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/CIStatus;", "getWait_duration", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientCIEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientCIEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
    private final float duration;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Environment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
    private final Environment environment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 7)
    private final String id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CIStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 5)
    private final CIStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "waitDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 6)
    private final float wait_duration;

    public ClientCIEvent() {
        this(null, null, null, null, 0.0f, null, 0.0f, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24087newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ ClientCIEvent(String str, ClientPlatform clientPlatform, Environment environment, Instant instant, float f, CIStatus cIStatus, float f2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i & 4) != 0 ? null : environment, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? 0.0f : f, (i & 32) != 0 ? CIStatus.DEFAULT_STATUS : cIStatus, (i & 64) != 0 ? 0.0f : f2, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final CIStatus getStatus() {
        return this.status;
    }

    public final float getWait_duration() {
        return this.wait_duration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientCIEvent(String id, ClientPlatform platform, Environment environment, Instant instant, float f, CIStatus status, float f2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.platform = platform;
        this.environment = environment;
        this.timestamp = instant;
        this.duration = f;
        this.status = status;
        this.wait_duration = f2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24087newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientCIEvent)) {
            return false;
        }
        ClientCIEvent clientCIEvent = (ClientCIEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientCIEvent.unknownFields()) && Intrinsics.areEqual(this.id, clientCIEvent.id) && this.platform == clientCIEvent.platform && Intrinsics.areEqual(this.environment, clientCIEvent.environment) && Intrinsics.areEqual(this.timestamp, clientCIEvent.timestamp) && this.duration == clientCIEvent.duration && this.status == clientCIEvent.status && this.wait_duration == clientCIEvent.wait_duration;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.platform.hashCode()) * 37;
        Environment environment = this.environment;
        int iHashCode2 = (iHashCode + (environment != null ? environment.hashCode() : 0)) * 37;
        Instant instant = this.timestamp;
        int iHashCode3 = ((((((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37) + Float.hashCode(this.duration)) * 37) + this.status.hashCode()) * 37) + Float.hashCode(this.wait_duration);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("platform=" + this.platform);
        Environment environment = this.environment;
        if (environment != null) {
            arrayList.add("environment=" + environment);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("duration=" + this.duration);
        arrayList.add("status=" + this.status);
        arrayList.add("wait_duration=" + this.wait_duration);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientCIEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientCIEvent copy$default(ClientCIEvent clientCIEvent, String str, ClientPlatform clientPlatform, Environment environment, Instant instant, float f, CIStatus cIStatus, float f2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientCIEvent.id;
        }
        if ((i & 2) != 0) {
            clientPlatform = clientCIEvent.platform;
        }
        if ((i & 4) != 0) {
            environment = clientCIEvent.environment;
        }
        if ((i & 8) != 0) {
            instant = clientCIEvent.timestamp;
        }
        if ((i & 16) != 0) {
            f = clientCIEvent.duration;
        }
        if ((i & 32) != 0) {
            cIStatus = clientCIEvent.status;
        }
        if ((i & 64) != 0) {
            f2 = clientCIEvent.wait_duration;
        }
        if ((i & 128) != 0) {
            byteString = clientCIEvent.unknownFields();
        }
        float f3 = f2;
        ByteString byteString2 = byteString;
        float f4 = f;
        CIStatus cIStatus2 = cIStatus;
        return clientCIEvent.copy(str, clientPlatform, environment, instant, f4, cIStatus2, f3, byteString2);
    }

    public final ClientCIEvent copy(String id, ClientPlatform platform, Environment environment, Instant timestamp, float duration, CIStatus status, float wait_duration, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientCIEvent(id, platform, environment, timestamp, duration, status, wait_duration, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientCIEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientCIEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientCIEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientCIEvent value) {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getId());
                }
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getEnvironment() != null) {
                    size += Environment.ADAPTER.encodedSizeWithTag(2, value.getEnvironment());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getTimestamp());
                }
                if (!Float.valueOf(value.getDuration()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getDuration()));
                }
                if (value.getStatus() != CIStatus.DEFAULT_STATUS) {
                    size += CIStatus.ADAPTER.encodedSizeWithTag(5, value.getStatus());
                }
                return !Float.valueOf(value.getWait_duration()).equals(fValueOf) ? size + ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.getWait_duration())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientCIEvent value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getId());
                }
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getEnvironment() != null) {
                    Environment.ADAPTER.encodeWithTag(writer, 2, (int) value.getEnvironment());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (!Float.valueOf(value.getDuration()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getDuration()));
                }
                if (value.getStatus() != CIStatus.DEFAULT_STATUS) {
                    CIStatus.ADAPTER.encodeWithTag(writer, 5, (int) value.getStatus());
                }
                if (!Float.valueOf(value.getWait_duration()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 6, (int) Float.valueOf(value.getWait_duration()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientCIEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Float fValueOf = Float.valueOf(value.getWait_duration());
                Float fValueOf2 = Float.valueOf(0.0f);
                if (!fValueOf.equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 6, (int) Float.valueOf(value.getWait_duration()));
                }
                if (value.getStatus() != CIStatus.DEFAULT_STATUS) {
                    CIStatus.ADAPTER.encodeWithTag(writer, 5, (int) value.getStatus());
                }
                if (!Float.valueOf(value.getDuration()).equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getDuration()));
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (value.getEnvironment() != null) {
                    Environment.ADAPTER.encodeWithTag(writer, 2, (int) value.getEnvironment());
                }
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ClientCIEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                CIStatus cIStatus = CIStatus.DEFAULT_STATUS;
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                String strDecode = "";
                Environment environmentDecode = null;
                CIStatus cIStatusDecode = cIStatus;
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
                                    environmentDecode = Environment.ADAPTER.decode(reader);
                                    break;
                                case 3:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                case 4:
                                    fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    break;
                                case 5:
                                    try {
                                        cIStatusDecode = CIStatus.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 6:
                                    fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    break;
                                case 7:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ClientCIEvent(strDecode, clientPlatform, environmentDecode, instantDecode, fFloatValue, cIStatusDecode, fFloatValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientCIEvent redact(ClientCIEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Environment environment = value.getEnvironment();
                Environment environmentRedact = environment != null ? Environment.ADAPTER.redact(environment) : null;
                Instant timestamp = value.getTimestamp();
                return ClientCIEvent.copy$default(value, null, null, environmentRedact, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, 0.0f, null, 0.0f, ByteString.EMPTY, 115, null);
            }
        };
    }
}

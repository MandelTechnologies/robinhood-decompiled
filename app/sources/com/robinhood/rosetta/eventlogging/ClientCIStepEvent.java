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

/* compiled from: ClientCIStepEvent.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00017Bk\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!Jq\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b/\u0010!R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b3\u00102R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCIStepEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "", "ci_event_id", "Lcom/robinhood/rosetta/eventlogging/Environment;", "environment", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "name", "", "duration", "wait_duration", "Lcom/robinhood/rosetta/eventlogging/CIStatus;", "status", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Environment;Lj$/time/Instant;Ljava/lang/String;FFLcom/robinhood/rosetta/eventlogging/CIStatus;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Environment;Lj$/time/Instant;Ljava/lang/String;FFLcom/robinhood/rosetta/eventlogging/CIStatus;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientCIStepEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Ljava/lang/String;", "getCi_event_id", "Lcom/robinhood/rosetta/eventlogging/Environment;", "getEnvironment", "()Lcom/robinhood/rosetta/eventlogging/Environment;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getName", "F", "getDuration", "()F", "getWait_duration", "Lcom/robinhood/rosetta/eventlogging/CIStatus;", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/CIStatus;", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientCIStepEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientCIStepEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ciEventId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String ci_event_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final float duration;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Environment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Environment environment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String name;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CIStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final CIStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "waitDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final float wait_duration;

    public ClientCIStepEvent() {
        this(null, null, null, null, null, 0.0f, 0.0f, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24089newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientCIStepEvent(ClientPlatform clientPlatform, String str, Environment environment, Instant instant, String str2, float f, float f2, CIStatus cIStatus, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : environment, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? 0.0f : f, (i & 64) != 0 ? 0.0f : f2, (i & 128) != 0 ? CIStatus.DEFAULT_STATUS : cIStatus, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getCi_event_id() {
        return this.ci_event_id;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getName() {
        return this.name;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final float getWait_duration() {
        return this.wait_duration;
    }

    public final CIStatus getStatus() {
        return this.status;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientCIStepEvent(ClientPlatform platform, String ci_event_id, Environment environment, Instant instant, String name, float f, float f2, CIStatus status, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(ci_event_id, "ci_event_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.ci_event_id = ci_event_id;
        this.environment = environment;
        this.timestamp = instant;
        this.name = name;
        this.duration = f;
        this.wait_duration = f2;
        this.status = status;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24089newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientCIStepEvent)) {
            return false;
        }
        ClientCIStepEvent clientCIStepEvent = (ClientCIStepEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientCIStepEvent.unknownFields()) && this.platform == clientCIStepEvent.platform && Intrinsics.areEqual(this.ci_event_id, clientCIStepEvent.ci_event_id) && Intrinsics.areEqual(this.environment, clientCIStepEvent.environment) && Intrinsics.areEqual(this.timestamp, clientCIStepEvent.timestamp) && Intrinsics.areEqual(this.name, clientCIStepEvent.name) && this.duration == clientCIStepEvent.duration && this.wait_duration == clientCIStepEvent.wait_duration && this.status == clientCIStepEvent.status;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37) + this.ci_event_id.hashCode()) * 37;
        Environment environment = this.environment;
        int iHashCode2 = (iHashCode + (environment != null ? environment.hashCode() : 0)) * 37;
        Instant instant = this.timestamp;
        int iHashCode3 = ((((((((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37) + this.name.hashCode()) * 37) + Float.hashCode(this.duration)) * 37) + Float.hashCode(this.wait_duration)) * 37) + this.status.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("platform=" + this.platform);
        arrayList.add("ci_event_id=" + Internal.sanitize(this.ci_event_id));
        Environment environment = this.environment;
        if (environment != null) {
            arrayList.add("environment=" + environment);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("duration=" + this.duration);
        arrayList.add("wait_duration=" + this.wait_duration);
        arrayList.add("status=" + this.status);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientCIStepEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientCIStepEvent copy$default(ClientCIStepEvent clientCIStepEvent, ClientPlatform clientPlatform, String str, Environment environment, Instant instant, String str2, float f, float f2, CIStatus cIStatus, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            clientPlatform = clientCIStepEvent.platform;
        }
        if ((i & 2) != 0) {
            str = clientCIStepEvent.ci_event_id;
        }
        if ((i & 4) != 0) {
            environment = clientCIStepEvent.environment;
        }
        if ((i & 8) != 0) {
            instant = clientCIStepEvent.timestamp;
        }
        if ((i & 16) != 0) {
            str2 = clientCIStepEvent.name;
        }
        if ((i & 32) != 0) {
            f = clientCIStepEvent.duration;
        }
        if ((i & 64) != 0) {
            f2 = clientCIStepEvent.wait_duration;
        }
        if ((i & 128) != 0) {
            cIStatus = clientCIStepEvent.status;
        }
        if ((i & 256) != 0) {
            byteString = clientCIStepEvent.unknownFields();
        }
        CIStatus cIStatus2 = cIStatus;
        ByteString byteString2 = byteString;
        float f3 = f;
        float f4 = f2;
        String str3 = str2;
        Environment environment2 = environment;
        return clientCIStepEvent.copy(clientPlatform, str, environment2, instant, str3, f3, f4, cIStatus2, byteString2);
    }

    public final ClientCIStepEvent copy(ClientPlatform platform, String ci_event_id, Environment environment, Instant timestamp, String name, float duration, float wait_duration, CIStatus status, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(ci_event_id, "ci_event_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientCIStepEvent(platform, ci_event_id, environment, timestamp, name, duration, wait_duration, status, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientCIStepEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientCIStepEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientCIStepEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientCIStepEvent value) {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (!Intrinsics.areEqual(value.getCi_event_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCi_event_id());
                }
                if (value.getEnvironment() != null) {
                    size += Environment.ADAPTER.encodedSizeWithTag(3, value.getEnvironment());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getName());
                }
                if (!Float.valueOf(value.getDuration()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.getDuration()));
                }
                if (!Float.valueOf(value.getWait_duration()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(7, Float.valueOf(value.getWait_duration()));
                }
                return value.getStatus() != CIStatus.DEFAULT_STATUS ? size + CIStatus.ADAPTER.encodedSizeWithTag(8, value.getStatus()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientCIStepEvent value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (!Intrinsics.areEqual(value.getCi_event_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCi_event_id());
                }
                if (value.getEnvironment() != null) {
                    Environment.ADAPTER.encodeWithTag(writer, 3, (int) value.getEnvironment());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getName());
                }
                if (!Float.valueOf(value.getDuration()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 6, (int) Float.valueOf(value.getDuration()));
                }
                if (!Float.valueOf(value.getWait_duration()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 7, (int) Float.valueOf(value.getWait_duration()));
                }
                if (value.getStatus() != CIStatus.DEFAULT_STATUS) {
                    CIStatus.ADAPTER.encodeWithTag(writer, 8, (int) value.getStatus());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientCIStepEvent value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getStatus() != CIStatus.DEFAULT_STATUS) {
                    CIStatus.ADAPTER.encodeWithTag(writer, 8, (int) value.getStatus());
                }
                if (!Float.valueOf(value.getWait_duration()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 7, (int) Float.valueOf(value.getWait_duration()));
                }
                if (!Float.valueOf(value.getDuration()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 6, (int) Float.valueOf(value.getDuration()));
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getName());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getTimestamp());
                }
                if (value.getEnvironment() != null) {
                    Environment.ADAPTER.encodeWithTag(writer, 3, (int) value.getEnvironment());
                }
                if (!Intrinsics.areEqual(value.getCi_event_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCi_event_id());
                }
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ClientCIStepEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                CIStatus cIStatus = CIStatus.DEFAULT_STATUS;
                long jBeginMessage = reader.beginMessage();
                Environment environmentDecode = null;
                Instant instantDecode = null;
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                String strDecode = "";
                String strDecode2 = strDecode;
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
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    environmentDecode = Environment.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                case 5:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    break;
                                case 7:
                                    fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    break;
                                case 8:
                                    try {
                                        cIStatusDecode = CIStatus.ADAPTER.decode(reader);
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
                            return new ClientCIStepEvent(clientPlatform, strDecode, environmentDecode, instantDecode, strDecode2, fFloatValue, fFloatValue2, cIStatusDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientCIStepEvent redact(ClientCIStepEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Environment environment = value.getEnvironment();
                Environment environmentRedact = environment != null ? Environment.ADAPTER.redact(environment) : null;
                Instant timestamp = value.getTimestamp();
                return ClientCIStepEvent.copy$default(value, null, null, environmentRedact, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, 0.0f, 0.0f, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, null);
            }
        };
    }
}

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

/* compiled from: ClientPartyOwnershipEvent.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-BU\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ[\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u001dR\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b(\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b)\u0010\u001dR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientPartyOwnershipEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "module", "party", "metric_name", "", "metric_value", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientPartyOwnershipEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Ljava/lang/String;", "getModule", "getParty", "getMetric_name", "F", "getMetric_value", "()F", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientPartyOwnershipEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientPartyOwnershipEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "metricName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String metric_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "metricValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final float metric_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String module;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String party;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    public ClientPartyOwnershipEvent() {
        this(null, null, null, null, null, 0.0f, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24109newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientPartyOwnershipEvent(ClientPlatform clientPlatform, Instant instant, String str, String str2, String str3, float f, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? 0.0f : f, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getModule() {
        return this.module;
    }

    public final String getParty() {
        return this.party;
    }

    public final String getMetric_name() {
        return this.metric_name;
    }

    public final float getMetric_value() {
        return this.metric_value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientPartyOwnershipEvent(ClientPlatform platform, Instant instant, String module, String party, String metric_name, float f, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(party, "party");
        Intrinsics.checkNotNullParameter(metric_name, "metric_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.module = module;
        this.party = party;
        this.metric_name = metric_name;
        this.metric_value = f;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24109newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientPartyOwnershipEvent)) {
            return false;
        }
        ClientPartyOwnershipEvent clientPartyOwnershipEvent = (ClientPartyOwnershipEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientPartyOwnershipEvent.unknownFields()) && this.platform == clientPartyOwnershipEvent.platform && Intrinsics.areEqual(this.timestamp, clientPartyOwnershipEvent.timestamp) && Intrinsics.areEqual(this.module, clientPartyOwnershipEvent.module) && Intrinsics.areEqual(this.party, clientPartyOwnershipEvent.party) && Intrinsics.areEqual(this.metric_name, clientPartyOwnershipEvent.metric_name) && this.metric_value == clientPartyOwnershipEvent.metric_value;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.module.hashCode()) * 37) + this.party.hashCode()) * 37) + this.metric_name.hashCode()) * 37) + Float.hashCode(this.metric_value);
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
        arrayList.add("module=" + Internal.sanitize(this.module));
        arrayList.add("party=" + Internal.sanitize(this.party));
        arrayList.add("metric_name=" + Internal.sanitize(this.metric_name));
        arrayList.add("metric_value=" + this.metric_value);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientPartyOwnershipEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientPartyOwnershipEvent copy$default(ClientPartyOwnershipEvent clientPartyOwnershipEvent, ClientPlatform clientPlatform, Instant instant, String str, String str2, String str3, float f, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            clientPlatform = clientPartyOwnershipEvent.platform;
        }
        if ((i & 2) != 0) {
            instant = clientPartyOwnershipEvent.timestamp;
        }
        if ((i & 4) != 0) {
            str = clientPartyOwnershipEvent.module;
        }
        if ((i & 8) != 0) {
            str2 = clientPartyOwnershipEvent.party;
        }
        if ((i & 16) != 0) {
            str3 = clientPartyOwnershipEvent.metric_name;
        }
        if ((i & 32) != 0) {
            f = clientPartyOwnershipEvent.metric_value;
        }
        if ((i & 64) != 0) {
            byteString = clientPartyOwnershipEvent.unknownFields();
        }
        float f2 = f;
        ByteString byteString2 = byteString;
        String str4 = str3;
        String str5 = str;
        return clientPartyOwnershipEvent.copy(clientPlatform, instant, str5, str2, str4, f2, byteString2);
    }

    public final ClientPartyOwnershipEvent copy(ClientPlatform platform, Instant timestamp, String module, String party, String metric_name, float metric_value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(party, "party");
        Intrinsics.checkNotNullParameter(metric_name, "metric_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientPartyOwnershipEvent(platform, timestamp, module, party, metric_name, metric_value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientPartyOwnershipEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientPartyOwnershipEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientPartyOwnershipEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientPartyOwnershipEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getModule(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getModule());
                }
                if (!Intrinsics.areEqual(value.getParty(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getParty());
                }
                if (!Intrinsics.areEqual(value.getMetric_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getMetric_name());
                }
                return !Float.valueOf(value.getMetric_value()).equals(Float.valueOf(0.0f)) ? size + ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.getMetric_value())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientPartyOwnershipEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getModule(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getModule());
                }
                if (!Intrinsics.areEqual(value.getParty(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getParty());
                }
                if (!Intrinsics.areEqual(value.getMetric_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMetric_name());
                }
                if (!Float.valueOf(value.getMetric_value()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 6, (int) Float.valueOf(value.getMetric_value()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientPartyOwnershipEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Float.valueOf(value.getMetric_value()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 6, (int) Float.valueOf(value.getMetric_value()));
                }
                if (!Intrinsics.areEqual(value.getMetric_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMetric_name());
                }
                if (!Intrinsics.areEqual(value.getParty(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getParty());
                }
                if (!Intrinsics.areEqual(value.getModule(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getModule());
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
            public ClientPartyOwnershipEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                float fFloatValue = 0.0f;
                Instant instantDecode = null;
                String strDecode3 = strDecode2;
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
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ClientPartyOwnershipEvent(clientPlatform, instantDecode, strDecode3, strDecode, strDecode2, fFloatValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientPartyOwnershipEvent redact(ClientPartyOwnershipEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return ClientPartyOwnershipEvent.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, 0.0f, ByteString.EMPTY, 61, null);
            }
        };
    }
}

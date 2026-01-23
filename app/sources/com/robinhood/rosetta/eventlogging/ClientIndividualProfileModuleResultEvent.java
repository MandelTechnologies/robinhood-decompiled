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

/* compiled from: ClientIndividualProfileModuleResultEvent.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010Ba\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJg\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u001eR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b.\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b/\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/Environment;", "environment", "", "module_name", "", "incremental_build_time", "transitive_dependent_count", "direct_dependent_count", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/Environment;Ljava/lang/String;IIILokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/Environment;Ljava/lang/String;IIILokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Lcom/robinhood/rosetta/eventlogging/Environment;", "getEnvironment", "()Lcom/robinhood/rosetta/eventlogging/Environment;", "Ljava/lang/String;", "getModule_name", "I", "getIncremental_build_time", "getTransitive_dependent_count", "getDirect_dependent_count", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientIndividualProfileModuleResultEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientIndividualProfileModuleResultEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "directDependentCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int direct_dependent_count;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Environment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Environment environment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "incrementalBuildTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int incremental_build_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "moduleName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String module_name;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "transitiveDependentCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int transitive_dependent_count;

    public ClientIndividualProfileModuleResultEvent() {
        this(null, null, null, null, 0, 0, 0, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24102newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientIndividualProfileModuleResultEvent(ClientPlatform clientPlatform, Instant instant, Environment environment, String str, int i, int i2, int i3, ByteString byteString, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i4 & 2) != 0 ? null : instant, (i4 & 4) != 0 ? null : environment, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0 : i3, (i4 & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final String getModule_name() {
        return this.module_name;
    }

    public final int getIncremental_build_time() {
        return this.incremental_build_time;
    }

    public final int getTransitive_dependent_count() {
        return this.transitive_dependent_count;
    }

    public final int getDirect_dependent_count() {
        return this.direct_dependent_count;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientIndividualProfileModuleResultEvent(ClientPlatform platform, Instant instant, Environment environment, String module_name, int i, int i2, int i3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(module_name, "module_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.environment = environment;
        this.module_name = module_name;
        this.incremental_build_time = i;
        this.transitive_dependent_count = i2;
        this.direct_dependent_count = i3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24102newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientIndividualProfileModuleResultEvent)) {
            return false;
        }
        ClientIndividualProfileModuleResultEvent clientIndividualProfileModuleResultEvent = (ClientIndividualProfileModuleResultEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientIndividualProfileModuleResultEvent.unknownFields()) && this.platform == clientIndividualProfileModuleResultEvent.platform && Intrinsics.areEqual(this.timestamp, clientIndividualProfileModuleResultEvent.timestamp) && Intrinsics.areEqual(this.environment, clientIndividualProfileModuleResultEvent.environment) && Intrinsics.areEqual(this.module_name, clientIndividualProfileModuleResultEvent.module_name) && this.incremental_build_time == clientIndividualProfileModuleResultEvent.incremental_build_time && this.transitive_dependent_count == clientIndividualProfileModuleResultEvent.transitive_dependent_count && this.direct_dependent_count == clientIndividualProfileModuleResultEvent.direct_dependent_count;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Environment environment = this.environment;
        int iHashCode3 = ((((((((iHashCode2 + (environment != null ? environment.hashCode() : 0)) * 37) + this.module_name.hashCode()) * 37) + Integer.hashCode(this.incremental_build_time)) * 37) + Integer.hashCode(this.transitive_dependent_count)) * 37) + Integer.hashCode(this.direct_dependent_count);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("platform=" + this.platform);
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Environment environment = this.environment;
        if (environment != null) {
            arrayList.add("environment=" + environment);
        }
        arrayList.add("module_name=" + Internal.sanitize(this.module_name));
        arrayList.add("incremental_build_time=" + this.incremental_build_time);
        arrayList.add("transitive_dependent_count=" + this.transitive_dependent_count);
        arrayList.add("direct_dependent_count=" + this.direct_dependent_count);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientIndividualProfileModuleResultEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientIndividualProfileModuleResultEvent copy$default(ClientIndividualProfileModuleResultEvent clientIndividualProfileModuleResultEvent, ClientPlatform clientPlatform, Instant instant, Environment environment, String str, int i, int i2, int i3, ByteString byteString, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            clientPlatform = clientIndividualProfileModuleResultEvent.platform;
        }
        if ((i4 & 2) != 0) {
            instant = clientIndividualProfileModuleResultEvent.timestamp;
        }
        if ((i4 & 4) != 0) {
            environment = clientIndividualProfileModuleResultEvent.environment;
        }
        if ((i4 & 8) != 0) {
            str = clientIndividualProfileModuleResultEvent.module_name;
        }
        if ((i4 & 16) != 0) {
            i = clientIndividualProfileModuleResultEvent.incremental_build_time;
        }
        if ((i4 & 32) != 0) {
            i2 = clientIndividualProfileModuleResultEvent.transitive_dependent_count;
        }
        if ((i4 & 64) != 0) {
            i3 = clientIndividualProfileModuleResultEvent.direct_dependent_count;
        }
        if ((i4 & 128) != 0) {
            byteString = clientIndividualProfileModuleResultEvent.unknownFields();
        }
        int i5 = i3;
        ByteString byteString2 = byteString;
        int i6 = i;
        int i7 = i2;
        return clientIndividualProfileModuleResultEvent.copy(clientPlatform, instant, environment, str, i6, i7, i5, byteString2);
    }

    public final ClientIndividualProfileModuleResultEvent copy(ClientPlatform platform, Instant timestamp, Environment environment, String module_name, int incremental_build_time, int transitive_dependent_count, int direct_dependent_count, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(module_name, "module_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientIndividualProfileModuleResultEvent(platform, timestamp, environment, module_name, incremental_build_time, transitive_dependent_count, direct_dependent_count, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientIndividualProfileModuleResultEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientIndividualProfileModuleResultEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientIndividualProfileModuleResultEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientIndividualProfileModuleResultEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (value.getEnvironment() != null) {
                    size += Environment.ADAPTER.encodedSizeWithTag(3, value.getEnvironment());
                }
                if (!Intrinsics.areEqual(value.getModule_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getModule_name());
                }
                if (value.getIncremental_build_time() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getIncremental_build_time()));
                }
                if (value.getTransitive_dependent_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getTransitive_dependent_count()));
                }
                return value.getDirect_dependent_count() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getDirect_dependent_count())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientIndividualProfileModuleResultEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (value.getEnvironment() != null) {
                    Environment.ADAPTER.encodeWithTag(writer, 3, (int) value.getEnvironment());
                }
                if (!Intrinsics.areEqual(value.getModule_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getModule_name());
                }
                if (value.getIncremental_build_time() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getIncremental_build_time()));
                }
                if (value.getTransitive_dependent_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getTransitive_dependent_count()));
                }
                if (value.getDirect_dependent_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getDirect_dependent_count()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientIndividualProfileModuleResultEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDirect_dependent_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getDirect_dependent_count()));
                }
                if (value.getTransitive_dependent_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getTransitive_dependent_count()));
                }
                if (value.getIncremental_build_time() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getIncremental_build_time()));
                }
                if (!Intrinsics.areEqual(value.getModule_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getModule_name());
                }
                if (value.getEnvironment() != null) {
                    Environment.ADAPTER.encodeWithTag(writer, 3, (int) value.getEnvironment());
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
            public ClientIndividualProfileModuleResultEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                Instant instantDecode = null;
                Environment environmentDecode = null;
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
                                    environmentDecode = Environment.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 6:
                                    iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 7:
                                    iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ClientIndividualProfileModuleResultEvent(clientPlatform, instantDecode, environmentDecode, strDecode, iIntValue, iIntValue2, iIntValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientIndividualProfileModuleResultEvent redact(ClientIndividualProfileModuleResultEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
                Environment environment = value.getEnvironment();
                return ClientIndividualProfileModuleResultEvent.copy$default(value, null, instantRedact, environment != null ? Environment.ADAPTER.redact(environment) : null, null, 0, 0, 0, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, null);
            }
        };
    }
}

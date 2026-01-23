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

/* compiled from: ClientOverallProfileModulesResultEvent.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00012Ba\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJg\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u001cR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b0\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b1\u0010\u001c¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/Environment;", "environment", "", "initial_clean_build_time", "", "average_incremental_build_time", "total_run_time", "total_module_count", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/Environment;IDIILokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/Environment;IDIILokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Lcom/robinhood/rosetta/eventlogging/Environment;", "getEnvironment", "()Lcom/robinhood/rosetta/eventlogging/Environment;", "I", "getInitial_clean_build_time", "D", "getAverage_incremental_build_time", "()D", "getTotal_run_time", "getTotal_module_count", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientOverallProfileModulesResultEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientOverallProfileModulesResultEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "averageIncrementalBuildTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final double average_incremental_build_time;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Environment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Environment environment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "initialCleanBuildTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int initial_clean_build_time;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalModuleCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int total_module_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalRunTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int total_run_time;

    public ClientOverallProfileModulesResultEvent() {
        this(null, null, null, 0, 0.0d, 0, 0, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24108newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientOverallProfileModulesResultEvent(ClientPlatform clientPlatform, Instant instant, Environment environment, int i, double d, int i2, int i3, ByteString byteString, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i4 & 2) != 0 ? null : instant, (i4 & 4) != 0 ? null : environment, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0.0d : d, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0 : i3, (i4 & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final int getInitial_clean_build_time() {
        return this.initial_clean_build_time;
    }

    public final double getAverage_incremental_build_time() {
        return this.average_incremental_build_time;
    }

    public final int getTotal_run_time() {
        return this.total_run_time;
    }

    public final int getTotal_module_count() {
        return this.total_module_count;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientOverallProfileModulesResultEvent(ClientPlatform platform, Instant instant, Environment environment, int i, double d, int i2, int i3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.environment = environment;
        this.initial_clean_build_time = i;
        this.average_incremental_build_time = d;
        this.total_run_time = i2;
        this.total_module_count = i3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24108newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientOverallProfileModulesResultEvent)) {
            return false;
        }
        ClientOverallProfileModulesResultEvent clientOverallProfileModulesResultEvent = (ClientOverallProfileModulesResultEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientOverallProfileModulesResultEvent.unknownFields()) && this.platform == clientOverallProfileModulesResultEvent.platform && Intrinsics.areEqual(this.timestamp, clientOverallProfileModulesResultEvent.timestamp) && Intrinsics.areEqual(this.environment, clientOverallProfileModulesResultEvent.environment) && this.initial_clean_build_time == clientOverallProfileModulesResultEvent.initial_clean_build_time && this.average_incremental_build_time == clientOverallProfileModulesResultEvent.average_incremental_build_time && this.total_run_time == clientOverallProfileModulesResultEvent.total_run_time && this.total_module_count == clientOverallProfileModulesResultEvent.total_module_count;
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
        int iHashCode3 = ((((((((iHashCode2 + (environment != null ? environment.hashCode() : 0)) * 37) + Integer.hashCode(this.initial_clean_build_time)) * 37) + Double.hashCode(this.average_incremental_build_time)) * 37) + Integer.hashCode(this.total_run_time)) * 37) + Integer.hashCode(this.total_module_count);
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
        arrayList.add("initial_clean_build_time=" + this.initial_clean_build_time);
        arrayList.add("average_incremental_build_time=" + this.average_incremental_build_time);
        arrayList.add("total_run_time=" + this.total_run_time);
        arrayList.add("total_module_count=" + this.total_module_count);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientOverallProfileModulesResultEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientOverallProfileModulesResultEvent copy$default(ClientOverallProfileModulesResultEvent clientOverallProfileModulesResultEvent, ClientPlatform clientPlatform, Instant instant, Environment environment, int i, double d, int i2, int i3, ByteString byteString, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            clientPlatform = clientOverallProfileModulesResultEvent.platform;
        }
        if ((i4 & 2) != 0) {
            instant = clientOverallProfileModulesResultEvent.timestamp;
        }
        if ((i4 & 4) != 0) {
            environment = clientOverallProfileModulesResultEvent.environment;
        }
        if ((i4 & 8) != 0) {
            i = clientOverallProfileModulesResultEvent.initial_clean_build_time;
        }
        if ((i4 & 16) != 0) {
            d = clientOverallProfileModulesResultEvent.average_incremental_build_time;
        }
        if ((i4 & 32) != 0) {
            i2 = clientOverallProfileModulesResultEvent.total_run_time;
        }
        if ((i4 & 64) != 0) {
            i3 = clientOverallProfileModulesResultEvent.total_module_count;
        }
        if ((i4 & 128) != 0) {
            byteString = clientOverallProfileModulesResultEvent.unknownFields();
        }
        ByteString byteString2 = byteString;
        int i5 = i2;
        double d2 = d;
        Environment environment2 = environment;
        int i6 = i;
        return clientOverallProfileModulesResultEvent.copy(clientPlatform, instant, environment2, i6, d2, i5, i3, byteString2);
    }

    public final ClientOverallProfileModulesResultEvent copy(ClientPlatform platform, Instant timestamp, Environment environment, int initial_clean_build_time, double average_incremental_build_time, int total_run_time, int total_module_count, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientOverallProfileModulesResultEvent(platform, timestamp, environment, initial_clean_build_time, average_incremental_build_time, total_run_time, total_module_count, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientOverallProfileModulesResultEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientOverallProfileModulesResultEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientOverallProfileModulesResultEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientOverallProfileModulesResultEvent value) {
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
                if (value.getInitial_clean_build_time() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getInitial_clean_build_time()));
                }
                if (!Double.valueOf(value.getAverage_incremental_build_time()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(5, Double.valueOf(value.getAverage_incremental_build_time()));
                }
                if (value.getTotal_run_time() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getTotal_run_time()));
                }
                return value.getTotal_module_count() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getTotal_module_count())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientOverallProfileModulesResultEvent value) throws IOException {
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
                if (value.getInitial_clean_build_time() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getInitial_clean_build_time()));
                }
                if (!Double.valueOf(value.getAverage_incremental_build_time()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getAverage_incremental_build_time()));
                }
                if (value.getTotal_run_time() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getTotal_run_time()));
                }
                if (value.getTotal_module_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getTotal_module_count()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientOverallProfileModulesResultEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTotal_module_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getTotal_module_count()));
                }
                if (value.getTotal_run_time() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getTotal_run_time()));
                }
                if (!Double.valueOf(value.getAverage_incremental_build_time()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getAverage_incremental_build_time()));
                }
                if (value.getInitial_clean_build_time() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getInitial_clean_build_time()));
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
            public ClientOverallProfileModulesResultEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                double dDoubleValue = 0.0d;
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
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 5:
                                    dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
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
                            return new ClientOverallProfileModulesResultEvent(clientPlatform, instantDecode, environmentDecode, iIntValue, dDoubleValue, iIntValue2, iIntValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientOverallProfileModulesResultEvent redact(ClientOverallProfileModulesResultEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
                Environment environment = value.getEnvironment();
                return ClientOverallProfileModulesResultEvent.copy$default(value, null, instantRedact, environment != null ? Environment.ADAPTER.redact(environment) : null, 0, 0.0d, 0, 0, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, null);
            }
        };
    }
}

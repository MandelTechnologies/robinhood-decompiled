package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.eventlogging.ClientSecuritywareBenchmarkEvent;
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
import com.squareup.wire.internal.Internal;
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
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: ClientSecuritywareBenchmarkEvent.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000245Bo\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 Ju\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010 R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010 R\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b)\u0010 R\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b-\u0010 R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u00103¨\u00066"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent;", "Lcom/squareup/wire/Message;", "", "", "repository", "commit_hash", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "benchmark_id", "", "", "durations", "average_duration", "machine_id", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent$Environment;", "environment", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;DLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent$Environment;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;DLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent$Environment;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent;", "Ljava/lang/String;", "getRepository", "getCommit_hash", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getBenchmark_id", "D", "getAverage_duration", "()D", "getMachine_id", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent$Environment;", "getEnvironment", "()Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent$Environment;", "Ljava/util/List;", "getDurations", "()Ljava/util/List;", "Companion", "Environment", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ClientSecuritywareBenchmarkEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientSecuritywareBenchmarkEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "averageDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double average_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "benchmarkId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String benchmark_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "commitHash", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String commit_hash;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.PACKED, schemaIndex = 4, tag = 5)
    private final java.util.List<Double> durations;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientSecuritywareBenchmarkEvent$Environment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Environment environment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "machineId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String machine_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String repository;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant timestamp;

    public ClientSecuritywareBenchmarkEvent() {
        this(null, null, null, null, null, 0.0d, null, null, null, 511, null);
    }

    public /* synthetic */ ClientSecuritywareBenchmarkEvent(String str, String str2, Instant instant, String str3, java.util.List list, double d, String str4, Environment environment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? Environment.UNKNOWN : environment, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24111newBuilder();
    }

    public final String getRepository() {
        return this.repository;
    }

    public final String getCommit_hash() {
        return this.commit_hash;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getBenchmark_id() {
        return this.benchmark_id;
    }

    public final double getAverage_duration() {
        return this.average_duration;
    }

    public final String getMachine_id() {
        return this.machine_id;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientSecuritywareBenchmarkEvent(String repository, String commit_hash, Instant instant, String benchmark_id, java.util.List<Double> durations, double d, String machine_id, Environment environment, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(commit_hash, "commit_hash");
        Intrinsics.checkNotNullParameter(benchmark_id, "benchmark_id");
        Intrinsics.checkNotNullParameter(durations, "durations");
        Intrinsics.checkNotNullParameter(machine_id, "machine_id");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.repository = repository;
        this.commit_hash = commit_hash;
        this.timestamp = instant;
        this.benchmark_id = benchmark_id;
        this.average_duration = d;
        this.machine_id = machine_id;
        this.environment = environment;
        this.durations = Internal.immutableCopyOf("durations", durations);
    }

    public final java.util.List<Double> getDurations() {
        return this.durations;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24111newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientSecuritywareBenchmarkEvent)) {
            return false;
        }
        ClientSecuritywareBenchmarkEvent clientSecuritywareBenchmarkEvent = (ClientSecuritywareBenchmarkEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientSecuritywareBenchmarkEvent.unknownFields()) && Intrinsics.areEqual(this.repository, clientSecuritywareBenchmarkEvent.repository) && Intrinsics.areEqual(this.commit_hash, clientSecuritywareBenchmarkEvent.commit_hash) && Intrinsics.areEqual(this.timestamp, clientSecuritywareBenchmarkEvent.timestamp) && Intrinsics.areEqual(this.benchmark_id, clientSecuritywareBenchmarkEvent.benchmark_id) && Intrinsics.areEqual(this.durations, clientSecuritywareBenchmarkEvent.durations) && this.average_duration == clientSecuritywareBenchmarkEvent.average_duration && Intrinsics.areEqual(this.machine_id, clientSecuritywareBenchmarkEvent.machine_id) && this.environment == clientSecuritywareBenchmarkEvent.environment;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.repository.hashCode()) * 37) + this.commit_hash.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.benchmark_id.hashCode()) * 37) + this.durations.hashCode()) * 37) + Double.hashCode(this.average_duration)) * 37) + this.machine_id.hashCode()) * 37) + this.environment.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("repository=" + Internal.sanitize(this.repository));
        arrayList.add("commit_hash=" + Internal.sanitize(this.commit_hash));
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("benchmark_id=" + Internal.sanitize(this.benchmark_id));
        if (!this.durations.isEmpty()) {
            arrayList.add("durations=" + this.durations);
        }
        arrayList.add("average_duration=" + this.average_duration);
        arrayList.add("machine_id=" + Internal.sanitize(this.machine_id));
        arrayList.add("environment=" + this.environment);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientSecuritywareBenchmarkEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientSecuritywareBenchmarkEvent copy$default(ClientSecuritywareBenchmarkEvent clientSecuritywareBenchmarkEvent, String str, String str2, Instant instant, String str3, java.util.List list, double d, String str4, Environment environment, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientSecuritywareBenchmarkEvent.repository;
        }
        if ((i & 2) != 0) {
            str2 = clientSecuritywareBenchmarkEvent.commit_hash;
        }
        if ((i & 4) != 0) {
            instant = clientSecuritywareBenchmarkEvent.timestamp;
        }
        if ((i & 8) != 0) {
            str3 = clientSecuritywareBenchmarkEvent.benchmark_id;
        }
        if ((i & 16) != 0) {
            list = clientSecuritywareBenchmarkEvent.durations;
        }
        if ((i & 32) != 0) {
            d = clientSecuritywareBenchmarkEvent.average_duration;
        }
        if ((i & 64) != 0) {
            str4 = clientSecuritywareBenchmarkEvent.machine_id;
        }
        if ((i & 128) != 0) {
            environment = clientSecuritywareBenchmarkEvent.environment;
        }
        if ((i & 256) != 0) {
            byteString = clientSecuritywareBenchmarkEvent.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str4;
        double d2 = d;
        String str6 = str3;
        java.util.List list2 = list;
        Instant instant2 = instant;
        return clientSecuritywareBenchmarkEvent.copy(str, str2, instant2, str6, list2, d2, str5, environment, byteString2);
    }

    public final ClientSecuritywareBenchmarkEvent copy(String repository, String commit_hash, Instant timestamp, String benchmark_id, java.util.List<Double> durations, double average_duration, String machine_id, Environment environment, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(commit_hash, "commit_hash");
        Intrinsics.checkNotNullParameter(benchmark_id, "benchmark_id");
        Intrinsics.checkNotNullParameter(durations, "durations");
        Intrinsics.checkNotNullParameter(machine_id, "machine_id");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientSecuritywareBenchmarkEvent(repository, commit_hash, timestamp, benchmark_id, durations, average_duration, machine_id, environment, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientSecuritywareBenchmarkEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientSecuritywareBenchmarkEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientSecuritywareBenchmarkEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientSecuritywareBenchmarkEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRepository(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRepository());
                }
                if (!Intrinsics.areEqual(value.getCommit_hash(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCommit_hash());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getBenchmark_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getBenchmark_id());
                }
                ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                int iEncodedSizeWithTag = size + protoAdapter.asPacked().encodedSizeWithTag(5, value.getDurations());
                if (!Double.valueOf(value.getAverage_duration()).equals(Double.valueOf(0.0d))) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(6, Double.valueOf(value.getAverage_duration()));
                }
                if (!Intrinsics.areEqual(value.getMachine_id(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getMachine_id());
                }
                return value.getEnvironment() != ClientSecuritywareBenchmarkEvent.Environment.UNKNOWN ? iEncodedSizeWithTag + ClientSecuritywareBenchmarkEvent.Environment.ADAPTER.encodedSizeWithTag(8, value.getEnvironment()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientSecuritywareBenchmarkEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRepository(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRepository());
                }
                if (!Intrinsics.areEqual(value.getCommit_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCommit_hash());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getBenchmark_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBenchmark_id());
                }
                ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                protoAdapter.asPacked().encodeWithTag(writer, 5, (int) value.getDurations());
                if (!Double.valueOf(value.getAverage_duration()).equals(Double.valueOf(0.0d))) {
                    protoAdapter.encodeWithTag(writer, 6, (int) Double.valueOf(value.getAverage_duration()));
                }
                if (!Intrinsics.areEqual(value.getMachine_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMachine_id());
                }
                if (value.getEnvironment() != ClientSecuritywareBenchmarkEvent.Environment.UNKNOWN) {
                    ClientSecuritywareBenchmarkEvent.Environment.ADAPTER.encodeWithTag(writer, 8, (int) value.getEnvironment());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientSecuritywareBenchmarkEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEnvironment() != ClientSecuritywareBenchmarkEvent.Environment.UNKNOWN) {
                    ClientSecuritywareBenchmarkEvent.Environment.ADAPTER.encodeWithTag(writer, 8, (int) value.getEnvironment());
                }
                if (!Intrinsics.areEqual(value.getMachine_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMachine_id());
                }
                if (!Double.valueOf(value.getAverage_duration()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getAverage_duration()));
                }
                ProtoAdapter.DOUBLE.asPacked().encodeWithTag(writer, 5, (int) value.getDurations());
                if (!Intrinsics.areEqual(value.getBenchmark_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBenchmark_id());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getCommit_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCommit_hash());
                }
                if (Intrinsics.areEqual(value.getRepository(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRepository());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ClientSecuritywareBenchmarkEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientSecuritywareBenchmarkEvent.Environment environment = ClientSecuritywareBenchmarkEvent.Environment.UNKNOWN;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                java.util.List listEmptyList = null;
                double dDoubleValue = 0.0d;
                ClientSecuritywareBenchmarkEvent.Environment environmentDecode = environment;
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                if (listEmptyList == null) {
                                    listEmptyList = new ArrayList((int) RangesKt.coerceAtMost(reader.nextFieldMinLengthInBytes() / 8, 2147483647L));
                                }
                                listEmptyList.add(ProtoAdapter.DOUBLE.decode(reader));
                                break;
                            case 6:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 7:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                try {
                                    environmentDecode = ClientSecuritywareBenchmarkEvent.Environment.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        ByteString byteStringEndMessageAndGetUnknownFields = reader.endMessageAndGetUnknownFields(jBeginMessage);
                        String str = strDecode2;
                        String str2 = strDecode3;
                        Instant instant = instantDecode;
                        String str3 = strDecode4;
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        return new ClientSecuritywareBenchmarkEvent(str, str2, instant, str3, listEmptyList, dDoubleValue, strDecode, environmentDecode, byteStringEndMessageAndGetUnknownFields);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientSecuritywareBenchmarkEvent redact(ClientSecuritywareBenchmarkEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return ClientSecuritywareBenchmarkEvent.copy$default(value, null, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, 0.0d, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClientSecuritywareBenchmarkEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent$Environment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "DEFAULT", "BASELINE", "STAGING", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Environment implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Environment[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Environment> ADAPTER;
        public static final Environment BASELINE;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Environment DEFAULT;
        public static final Environment STAGING;
        public static final Environment UNKNOWN;
        private final int value;

        private static final /* synthetic */ Environment[] $values() {
            return new Environment[]{UNKNOWN, DEFAULT, BASELINE, STAGING};
        }

        @JvmStatic
        public static final Environment fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Environment> getEntries() {
            return $ENTRIES;
        }

        private Environment(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Environment environment = new Environment("UNKNOWN", 0, 0);
            UNKNOWN = environment;
            DEFAULT = new Environment("DEFAULT", 1, 1);
            BASELINE = new Environment("BASELINE", 2, 2);
            STAGING = new Environment("STAGING", 3, 3);
            Environment[] environmentArr$values = $values();
            $VALUES = environmentArr$values;
            $ENTRIES = EnumEntries2.enumEntries(environmentArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Environment.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Environment>(orCreateKotlinClass, syntax, environment) { // from class: com.robinhood.rosetta.eventlogging.ClientSecuritywareBenchmarkEvent$Environment$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ClientSecuritywareBenchmarkEvent.Environment fromValue(int value) {
                    return ClientSecuritywareBenchmarkEvent.Environment.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ClientSecuritywareBenchmarkEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent$Environment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent$Environment;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Environment fromValue(int value) {
                if (value == 0) {
                    return Environment.UNKNOWN;
                }
                if (value == 1) {
                    return Environment.DEFAULT;
                }
                if (value == 2) {
                    return Environment.BASELINE;
                }
                if (value != 3) {
                    return null;
                }
                return Environment.STAGING;
            }
        }

        public static Environment valueOf(String str) {
            return (Environment) Enum.valueOf(Environment.class, str);
        }

        public static Environment[] values() {
            return (Environment[]) $VALUES.clone();
        }
    }
}

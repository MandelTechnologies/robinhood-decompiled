package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
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

/* compiled from: ClientBuildImpactModuleMetricsEvent.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B\u0087\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\"J\u008d\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b.\u0010-R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b/\u0010-R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b0\u0010-R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b1\u0010-R\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b2\u0010-R\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b3\u0010-R\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b4\u0010-R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u0010\"¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "daily_commits", "daily_commits_percent", "module_size", "module_size_percent", "dependent_modules_size", "dependent_modules_size_percent", "build_impact", "build_impact_percent", "", "name", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;DDDDDDDDLjava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;DDDDDDDDLjava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "D", "getDaily_commits", "()D", "getDaily_commits_percent", "getModule_size", "getModule_size_percent", "getDependent_modules_size", "getDependent_modules_size_percent", "getBuild_impact", "getBuild_impact_percent", "Ljava/lang/String;", "getName", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientBuildImpactModuleMetricsEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientBuildImpactModuleMetricsEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "buildImpact", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final double build_impact;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "buildImpactPercent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final double build_impact_percent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dailyCommits", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double daily_commits;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dailyCommitsPercent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double daily_commits_percent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dependentModulesSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final double dependent_modules_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "dependentModulesSizePercent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final double dependent_modules_size_percent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "moduleSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final double module_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "moduleSizePercent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double module_size_percent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String name;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    public ClientBuildImpactModuleMetricsEvent() {
        this(null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24082newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientBuildImpactModuleMetricsEvent(ClientPlatform clientPlatform, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2, (i & 16) != 0 ? 0.0d : d3, (i & 32) != 0 ? 0.0d : d4, (i & 64) != 0 ? 0.0d : d5, (i & 128) != 0 ? 0.0d : d6, (i & 256) != 0 ? 0.0d : d7, (i & 512) == 0 ? d8 : 0.0d, (i & 1024) != 0 ? "" : str, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final double getDaily_commits() {
        return this.daily_commits;
    }

    public final double getDaily_commits_percent() {
        return this.daily_commits_percent;
    }

    public final double getModule_size() {
        return this.module_size;
    }

    public final double getModule_size_percent() {
        return this.module_size_percent;
    }

    public final double getDependent_modules_size() {
        return this.dependent_modules_size;
    }

    public final double getDependent_modules_size_percent() {
        return this.dependent_modules_size_percent;
    }

    public final double getBuild_impact() {
        return this.build_impact;
    }

    public final double getBuild_impact_percent() {
        return this.build_impact_percent;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientBuildImpactModuleMetricsEvent(ClientPlatform platform, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, String name, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.daily_commits = d;
        this.daily_commits_percent = d2;
        this.module_size = d3;
        this.module_size_percent = d4;
        this.dependent_modules_size = d5;
        this.dependent_modules_size_percent = d6;
        this.build_impact = d7;
        this.build_impact_percent = d8;
        this.name = name;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24082newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientBuildImpactModuleMetricsEvent)) {
            return false;
        }
        ClientBuildImpactModuleMetricsEvent clientBuildImpactModuleMetricsEvent = (ClientBuildImpactModuleMetricsEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientBuildImpactModuleMetricsEvent.unknownFields()) && this.platform == clientBuildImpactModuleMetricsEvent.platform && Intrinsics.areEqual(this.timestamp, clientBuildImpactModuleMetricsEvent.timestamp) && this.daily_commits == clientBuildImpactModuleMetricsEvent.daily_commits && this.daily_commits_percent == clientBuildImpactModuleMetricsEvent.daily_commits_percent && this.module_size == clientBuildImpactModuleMetricsEvent.module_size && this.module_size_percent == clientBuildImpactModuleMetricsEvent.module_size_percent && this.dependent_modules_size == clientBuildImpactModuleMetricsEvent.dependent_modules_size && this.dependent_modules_size_percent == clientBuildImpactModuleMetricsEvent.dependent_modules_size_percent && this.build_impact == clientBuildImpactModuleMetricsEvent.build_impact && this.build_impact_percent == clientBuildImpactModuleMetricsEvent.build_impact_percent && Intrinsics.areEqual(this.name, clientBuildImpactModuleMetricsEvent.name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + Double.hashCode(this.daily_commits)) * 37) + Double.hashCode(this.daily_commits_percent)) * 37) + Double.hashCode(this.module_size)) * 37) + Double.hashCode(this.module_size_percent)) * 37) + Double.hashCode(this.dependent_modules_size)) * 37) + Double.hashCode(this.dependent_modules_size_percent)) * 37) + Double.hashCode(this.build_impact)) * 37) + Double.hashCode(this.build_impact_percent)) * 37) + this.name.hashCode();
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
        arrayList.add("daily_commits=" + this.daily_commits);
        arrayList.add("daily_commits_percent=" + this.daily_commits_percent);
        arrayList.add("module_size=" + this.module_size);
        arrayList.add("module_size_percent=" + this.module_size_percent);
        arrayList.add("dependent_modules_size=" + this.dependent_modules_size);
        arrayList.add("dependent_modules_size_percent=" + this.dependent_modules_size_percent);
        arrayList.add("build_impact=" + this.build_impact);
        arrayList.add("build_impact_percent=" + this.build_impact_percent);
        arrayList.add("name=" + Internal.sanitize(this.name));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientBuildImpactModuleMetricsEvent{", "}", 0, null, null, 56, null);
    }

    public final ClientBuildImpactModuleMetricsEvent copy(ClientPlatform platform, Instant timestamp, double daily_commits, double daily_commits_percent, double module_size, double module_size_percent, double dependent_modules_size, double dependent_modules_size_percent, double build_impact, double build_impact_percent, String name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientBuildImpactModuleMetricsEvent(platform, timestamp, daily_commits, daily_commits_percent, module_size, module_size_percent, dependent_modules_size, dependent_modules_size_percent, build_impact, build_impact_percent, name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientBuildImpactModuleMetricsEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientBuildImpactModuleMetricsEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientBuildImpactModuleMetricsEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientBuildImpactModuleMetricsEvent value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (!Double.valueOf(value.getDaily_commits()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getDaily_commits()));
                }
                if (!Double.valueOf(value.getDaily_commits_percent()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getDaily_commits_percent()));
                }
                if (!Double.valueOf(value.getModule_size()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(5, Double.valueOf(value.getModule_size()));
                }
                if (!Double.valueOf(value.getModule_size_percent()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getModule_size_percent()));
                }
                if (!Double.valueOf(value.getDependent_modules_size()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getDependent_modules_size()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_percent()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(8, Double.valueOf(value.getDependent_modules_size_percent()));
                }
                if (!Double.valueOf(value.getBuild_impact()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(9, Double.valueOf(value.getBuild_impact()));
                }
                if (!Double.valueOf(value.getBuild_impact_percent()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(10, Double.valueOf(value.getBuild_impact_percent()));
                }
                return !Intrinsics.areEqual(value.getName(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(11, value.getName()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientBuildImpactModuleMetricsEvent value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (!Double.valueOf(value.getDaily_commits()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getDaily_commits()));
                }
                if (!Double.valueOf(value.getDaily_commits_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getDaily_commits_percent()));
                }
                if (!Double.valueOf(value.getModule_size()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getModule_size()));
                }
                if (!Double.valueOf(value.getModule_size_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getModule_size_percent()));
                }
                if (!Double.valueOf(value.getDependent_modules_size()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getDependent_modules_size()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getDependent_modules_size_percent()));
                }
                if (!Double.valueOf(value.getBuild_impact()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getBuild_impact()));
                }
                if (!Double.valueOf(value.getBuild_impact_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 10, (int) Double.valueOf(value.getBuild_impact_percent()));
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getName());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientBuildImpactModuleMetricsEvent value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getName());
                }
                if (!Double.valueOf(value.getBuild_impact_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 10, (int) Double.valueOf(value.getBuild_impact_percent()));
                }
                if (!Double.valueOf(value.getBuild_impact()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getBuild_impact()));
                }
                if (!Double.valueOf(value.getDependent_modules_size_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getDependent_modules_size_percent()));
                }
                if (!Double.valueOf(value.getDependent_modules_size()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getDependent_modules_size()));
                }
                if (!Double.valueOf(value.getModule_size_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getModule_size_percent()));
                }
                if (!Double.valueOf(value.getModule_size()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getModule_size()));
                }
                if (!Double.valueOf(value.getDaily_commits_percent()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getDaily_commits_percent()));
                }
                if (!Double.valueOf(value.getDaily_commits()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getDaily_commits()));
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                */
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0027. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public com.robinhood.rosetta.eventlogging.ClientBuildImpactModuleMetricsEvent decode(com.squareup.wire.ProtoReader r28) {
                /*
                    Method dump skipped, instructions count: 260
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientBuildImpactModuleMetricsEvent2.decode(com.squareup.wire.ProtoReader):com.robinhood.rosetta.eventlogging.ClientBuildImpactModuleMetricsEvent");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientBuildImpactModuleMetricsEvent redact(ClientBuildImpactModuleMetricsEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return value.copy((2045 & 1) != 0 ? value.platform : null, (2045 & 2) != 0 ? value.timestamp : timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, (2045 & 4) != 0 ? value.daily_commits : 0.0d, (2045 & 8) != 0 ? value.daily_commits_percent : 0.0d, (2045 & 16) != 0 ? value.module_size : 0.0d, (2045 & 32) != 0 ? value.module_size_percent : 0.0d, (2045 & 64) != 0 ? value.dependent_modules_size : 0.0d, (2045 & 128) != 0 ? value.dependent_modules_size_percent : 0.0d, (2045 & 256) != 0 ? value.build_impact : 0.0d, (2045 & 512) != 0 ? value.build_impact_percent : 0.0d, (2045 & 1024) != 0 ? value.name : null, (2045 & 2048) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

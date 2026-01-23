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

/* compiled from: ClientModuleEvent.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00019By\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u007f\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010!R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b,\u0010!R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u001fR \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b4\u0010\u001fR\u001a\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b5\u0010!R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientModuleEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "group_id", "name", "", "test_count", "", "test_coverage", "file_count", "", "dependencies", "module_type", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;IFILjava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;IFILjava/util/List;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientModuleEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Ljava/lang/String;", "getGroup_id", "getName", "I", "getTest_count", "F", "getTest_coverage", "()F", "getTest_coverage$annotations", "()V", "getFile_count", "getModule_type", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientModuleEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientModuleEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final java.util.List<String> dependencies;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fileCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int file_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "groupId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String group_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "moduleType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String module_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String name;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "testCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int test_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "testCoverage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final float test_coverage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    public ClientModuleEvent() {
        this(null, null, null, null, 0, 0.0f, 0, null, null, null, 1023, null);
    }

    @Deprecated
    public static /* synthetic */ void getTest_coverage$annotations() {
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24105newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientModuleEvent(ClientPlatform clientPlatform, Instant instant, String str, String str2, int i, float f, int i2, java.util.List list, String str3, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i3 & 2) != 0 ? null : instant, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0.0f : f, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? CollectionsKt.emptyList() : list, (i3 & 256) != 0 ? "" : str3, (i3 & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getGroup_id() {
        return this.group_id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getTest_count() {
        return this.test_count;
    }

    public final float getTest_coverage() {
        return this.test_coverage;
    }

    public final int getFile_count() {
        return this.file_count;
    }

    public final String getModule_type() {
        return this.module_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientModuleEvent(ClientPlatform platform, Instant instant, String group_id, String name, int i, float f, int i2, java.util.List<String> dependencies, String module_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(group_id, "group_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        Intrinsics.checkNotNullParameter(module_type, "module_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.group_id = group_id;
        this.name = name;
        this.test_count = i;
        this.test_coverage = f;
        this.file_count = i2;
        this.module_type = module_type;
        this.dependencies = Internal.immutableCopyOf("dependencies", dependencies);
    }

    public final java.util.List<String> getDependencies() {
        return this.dependencies;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24105newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientModuleEvent)) {
            return false;
        }
        ClientModuleEvent clientModuleEvent = (ClientModuleEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientModuleEvent.unknownFields()) && this.platform == clientModuleEvent.platform && Intrinsics.areEqual(this.timestamp, clientModuleEvent.timestamp) && Intrinsics.areEqual(this.group_id, clientModuleEvent.group_id) && Intrinsics.areEqual(this.name, clientModuleEvent.name) && this.test_count == clientModuleEvent.test_count && this.test_coverage == clientModuleEvent.test_coverage && this.file_count == clientModuleEvent.file_count && Intrinsics.areEqual(this.dependencies, clientModuleEvent.dependencies) && Intrinsics.areEqual(this.module_type, clientModuleEvent.module_type);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.group_id.hashCode()) * 37) + this.name.hashCode()) * 37) + Integer.hashCode(this.test_count)) * 37) + Float.hashCode(this.test_coverage)) * 37) + Integer.hashCode(this.file_count)) * 37) + this.dependencies.hashCode()) * 37) + this.module_type.hashCode();
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
        arrayList.add("group_id=" + Internal.sanitize(this.group_id));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("test_count=" + this.test_count);
        arrayList.add("test_coverage=" + this.test_coverage);
        arrayList.add("file_count=" + this.file_count);
        if (!this.dependencies.isEmpty()) {
            arrayList.add("dependencies=" + Internal.sanitize(this.dependencies));
        }
        arrayList.add("module_type=" + Internal.sanitize(this.module_type));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientModuleEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientModuleEvent copy$default(ClientModuleEvent clientModuleEvent, ClientPlatform clientPlatform, Instant instant, String str, String str2, int i, float f, int i2, java.util.List list, String str3, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            clientPlatform = clientModuleEvent.platform;
        }
        if ((i3 & 2) != 0) {
            instant = clientModuleEvent.timestamp;
        }
        if ((i3 & 4) != 0) {
            str = clientModuleEvent.group_id;
        }
        if ((i3 & 8) != 0) {
            str2 = clientModuleEvent.name;
        }
        if ((i3 & 16) != 0) {
            i = clientModuleEvent.test_count;
        }
        if ((i3 & 32) != 0) {
            f = clientModuleEvent.test_coverage;
        }
        if ((i3 & 64) != 0) {
            i2 = clientModuleEvent.file_count;
        }
        if ((i3 & 128) != 0) {
            list = clientModuleEvent.dependencies;
        }
        if ((i3 & 256) != 0) {
            str3 = clientModuleEvent.module_type;
        }
        if ((i3 & 512) != 0) {
            byteString = clientModuleEvent.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        int i4 = i2;
        java.util.List list2 = list;
        int i5 = i;
        float f2 = f;
        return clientModuleEvent.copy(clientPlatform, instant, str, str2, i5, f2, i4, list2, str4, byteString2);
    }

    public final ClientModuleEvent copy(ClientPlatform platform, Instant timestamp, String group_id, String name, int test_count, float test_coverage, int file_count, java.util.List<String> dependencies, String module_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(group_id, "group_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        Intrinsics.checkNotNullParameter(module_type, "module_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientModuleEvent(platform, timestamp, group_id, name, test_count, test_coverage, file_count, dependencies, module_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientModuleEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientModuleEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientModuleEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientModuleEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getGroup_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getGroup_id());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getName());
                }
                if (value.getTest_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getTest_count()));
                }
                if (!Float.valueOf(value.getTest_coverage()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.getTest_coverage()));
                }
                if (value.getFile_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getFile_count()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(8, value.getDependencies());
                return !Intrinsics.areEqual(value.getModule_type(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(9, value.getModule_type()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientModuleEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getGroup_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getGroup_id());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getName());
                }
                if (value.getTest_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getTest_count()));
                }
                if (!Float.valueOf(value.getTest_coverage()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 6, (int) Float.valueOf(value.getTest_coverage()));
                }
                if (value.getFile_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getFile_count()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 8, (int) value.getDependencies());
                if (!Intrinsics.areEqual(value.getModule_type(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getModule_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientModuleEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getModule_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getModule_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 8, (int) value.getDependencies());
                if (value.getFile_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getFile_count()));
                }
                if (!Float.valueOf(value.getTest_coverage()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 6, (int) Float.valueOf(value.getTest_coverage()));
                }
                if (value.getTest_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getTest_count()));
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getGroup_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getGroup_id());
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
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0026. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public com.robinhood.rosetta.eventlogging.ClientModuleEvent decode(com.squareup.wire.ProtoReader r18) {
                /*
                    r17 = this;
                    r1 = r18
                    java.lang.String r0 = "reader"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                    com.robinhood.rosetta.eventlogging.ClientPlatform r0 = com.robinhood.rosetta.eventlogging.ClientPlatform.DEFAULT_PLATFORM
                    java.util.ArrayList r9 = new java.util.ArrayList
                    r9.<init>()
                    long r2 = r1.beginMessage()
                    r4 = 0
                    java.lang.String r5 = ""
                    r6 = 0
                    r7 = 0
                    r8 = r5
                    r10 = r6
                    r11 = r10
                    r12 = r7
                    r5 = r4
                    r6 = r8
                    r7 = r6
                L1e:
                    r4 = r0
                L1f:
                    int r13 = r1.nextTag()
                    r0 = -1
                    if (r13 == r0) goto La1
                    switch(r13) {
                        case 1: goto L85;
                        case 2: goto L7d;
                        case 3: goto L75;
                        case 4: goto L6d;
                        case 5: goto L5f;
                        case 6: goto L51;
                        case 7: goto L43;
                        case 8: goto L39;
                        case 9: goto L31;
                        default: goto L29;
                    }
                L29:
                    r1.readUnknownField(r13)
                L2c:
                    r16 = r4
                    r15 = r5
                    goto L9c
                L31:
                    com.squareup.wire.ProtoAdapter<java.lang.String> r0 = com.squareup.wire.ProtoAdapter.STRING
                    java.lang.Object r0 = r0.decode(r1)
                    r8 = r0
                    goto L1f
                L39:
                    com.squareup.wire.ProtoAdapter<java.lang.String> r0 = com.squareup.wire.ProtoAdapter.STRING
                    java.lang.Object r0 = r0.decode(r1)
                    r9.add(r0)
                    goto L2c
                L43:
                    com.squareup.wire.ProtoAdapter<java.lang.Integer> r0 = com.squareup.wire.ProtoAdapter.INT32
                    java.lang.Object r0 = r0.decode(r1)
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r0 = r0.intValue()
                    r11 = r0
                    goto L1f
                L51:
                    com.squareup.wire.ProtoAdapter<java.lang.Float> r0 = com.squareup.wire.ProtoAdapter.FLOAT
                    java.lang.Object r0 = r0.decode(r1)
                    java.lang.Number r0 = (java.lang.Number) r0
                    float r0 = r0.floatValue()
                    r12 = r0
                    goto L1f
                L5f:
                    com.squareup.wire.ProtoAdapter<java.lang.Integer> r0 = com.squareup.wire.ProtoAdapter.INT32
                    java.lang.Object r0 = r0.decode(r1)
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r0 = r0.intValue()
                    r10 = r0
                    goto L1f
                L6d:
                    com.squareup.wire.ProtoAdapter<java.lang.String> r0 = com.squareup.wire.ProtoAdapter.STRING
                    java.lang.Object r0 = r0.decode(r1)
                    r7 = r0
                    goto L1f
                L75:
                    com.squareup.wire.ProtoAdapter<java.lang.String> r0 = com.squareup.wire.ProtoAdapter.STRING
                    java.lang.Object r0 = r0.decode(r1)
                    r6 = r0
                    goto L1f
                L7d:
                    com.squareup.wire.ProtoAdapter<j$.time.Instant> r0 = com.squareup.wire.ProtoAdapter.INSTANT
                    java.lang.Object r0 = r0.decode(r1)
                    r5 = r0
                    goto L1f
                L85:
                    com.squareup.wire.ProtoAdapter<com.robinhood.rosetta.eventlogging.ClientPlatform> r0 = com.robinhood.rosetta.eventlogging.ClientPlatform.ADAPTER     // Catch: com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException -> L8c
                    java.lang.Object r0 = r0.decode(r1)     // Catch: com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException -> L8c
                    goto L1e
                L8c:
                    r0 = move-exception
                    com.squareup.wire.FieldEncoding r14 = com.squareup.wire.FieldEncoding.VARINT
                    int r0 = r0.value
                    r16 = r4
                    r15 = r5
                    long r4 = (long) r0
                    java.lang.Long r0 = java.lang.Long.valueOf(r4)
                    r1.addUnknownField(r13, r14, r0)
                L9c:
                    r5 = r15
                    r4 = r16
                    goto L1f
                La1:
                    r16 = r4
                    r15 = r5
                    okio.ByteString r0 = r1.endMessageAndGetUnknownFields(r2)
                    com.robinhood.rosetta.eventlogging.ClientModuleEvent r1 = new com.robinhood.rosetta.eventlogging.ClientModuleEvent
                    r2 = r16
                    com.robinhood.rosetta.eventlogging.ClientPlatform r2 = (com.robinhood.rosetta.eventlogging.ClientPlatform) r2
                    r3 = r15
                    j$.time.Instant r3 = (p479j$.time.Instant) r3
                    r4 = r6
                    java.lang.String r4 = (java.lang.String) r4
                    r5 = r7
                    java.lang.String r5 = (java.lang.String) r5
                    java.lang.String r8 = (java.lang.String) r8
                    r6 = r10
                    r7 = r12
                    r10 = r8
                    r8 = r11
                    r11 = r0
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientModuleEvent2.decode(com.squareup.wire.ProtoReader):com.robinhood.rosetta.eventlogging.ClientModuleEvent");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientModuleEvent redact(ClientModuleEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return ClientModuleEvent.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, 0, 0.0f, 0, null, null, ByteString.EMPTY, 509, null);
            }
        };
    }
}

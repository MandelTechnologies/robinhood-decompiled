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

/* compiled from: ClientTestSuiteEvent.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\u0018\u0000 B2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BB\u009b\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J¡\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010&R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010$R\u001a\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b6\u0010$R\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b7\u0010$R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b8\u0010$R\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b9\u0010&R\u001a\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b:\u0010&R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0017\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00104\u001a\u0004\bA\u0010$¨\u0006C"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "name", "", "duration", "", "passed_count", "failed_count", "ignored_count", "retry_count", "group_id", "module_name", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;", "type", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContext;", "context", "untested_count", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;FIIIILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContext;ILokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Ljava/lang/String;FIIIILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContext;ILokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Ljava/lang/String;", "getName", "F", "getDuration", "()F", "I", "getPassed_count", "getFailed_count", "getIgnored_count", "getRetry_count", "getGroup_id", "getModule_name", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;", "getType", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteType;", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContext;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContext;", "getUntested_count", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientTestSuiteEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientTestSuiteEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientTestSuiteContext#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final ClientTestSuiteContext context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final float duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "failedCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int failed_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "groupId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String group_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "ignoredCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int ignored_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "moduleName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String module_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "passedCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int passed_count;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "retryCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final int retry_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientTestSuiteType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final ClientTestSuiteType type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "untestedCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final int untested_count;

    public ClientTestSuiteEvent() {
        this(null, null, null, 0.0f, 0, 0, 0, 0, null, null, null, null, 0, null, 16383, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24118newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientTestSuiteEvent(ClientPlatform clientPlatform, Instant instant, String str, float f, int i, int i2, int i3, int i4, String str2, String str3, ClientTestSuiteType clientTestSuiteType, ClientTestSuiteContext clientTestSuiteContext, int i5, ByteString byteString, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i6 & 2) != 0 ? null : instant, (i6 & 4) != 0 ? "" : str, (i6 & 8) != 0 ? 0.0f : f, (i6 & 16) != 0 ? 0 : i, (i6 & 32) != 0 ? 0 : i2, (i6 & 64) != 0 ? 0 : i3, (i6 & 128) != 0 ? 0 : i4, (i6 & 256) != 0 ? "" : str2, (i6 & 512) == 0 ? str3 : "", (i6 & 1024) != 0 ? ClientTestSuiteType.DEFAULT_TEST_TYPE : clientTestSuiteType, (i6 & 2048) != 0 ? ClientTestSuiteContext.DEFAULT_TEST_SUITE_CONTEXT : clientTestSuiteContext, (i6 & 4096) == 0 ? i5 : 0, (i6 & 8192) != 0 ? ByteString.EMPTY : byteString);
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

    public final int getPassed_count() {
        return this.passed_count;
    }

    public final int getFailed_count() {
        return this.failed_count;
    }

    public final int getIgnored_count() {
        return this.ignored_count;
    }

    public final int getRetry_count() {
        return this.retry_count;
    }

    public final String getGroup_id() {
        return this.group_id;
    }

    public final String getModule_name() {
        return this.module_name;
    }

    public final ClientTestSuiteType getType() {
        return this.type;
    }

    public final ClientTestSuiteContext getContext() {
        return this.context;
    }

    public final int getUntested_count() {
        return this.untested_count;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientTestSuiteEvent(ClientPlatform platform, Instant instant, String name, float f, int i, int i2, int i3, int i4, String group_id, String module_name, ClientTestSuiteType type2, ClientTestSuiteContext context, int i5, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(group_id, "group_id");
        Intrinsics.checkNotNullParameter(module_name, "module_name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.name = name;
        this.duration = f;
        this.passed_count = i;
        this.failed_count = i2;
        this.ignored_count = i3;
        this.retry_count = i4;
        this.group_id = group_id;
        this.module_name = module_name;
        this.type = type2;
        this.context = context;
        this.untested_count = i5;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24118newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientTestSuiteEvent)) {
            return false;
        }
        ClientTestSuiteEvent clientTestSuiteEvent = (ClientTestSuiteEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientTestSuiteEvent.unknownFields()) && this.platform == clientTestSuiteEvent.platform && Intrinsics.areEqual(this.timestamp, clientTestSuiteEvent.timestamp) && Intrinsics.areEqual(this.name, clientTestSuiteEvent.name) && this.duration == clientTestSuiteEvent.duration && this.passed_count == clientTestSuiteEvent.passed_count && this.failed_count == clientTestSuiteEvent.failed_count && this.ignored_count == clientTestSuiteEvent.ignored_count && this.retry_count == clientTestSuiteEvent.retry_count && Intrinsics.areEqual(this.group_id, clientTestSuiteEvent.group_id) && Intrinsics.areEqual(this.module_name, clientTestSuiteEvent.module_name) && this.type == clientTestSuiteEvent.type && this.context == clientTestSuiteEvent.context && this.untested_count == clientTestSuiteEvent.untested_count;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((((((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.name.hashCode()) * 37) + Float.hashCode(this.duration)) * 37) + Integer.hashCode(this.passed_count)) * 37) + Integer.hashCode(this.failed_count)) * 37) + Integer.hashCode(this.ignored_count)) * 37) + Integer.hashCode(this.retry_count)) * 37) + this.group_id.hashCode()) * 37) + this.module_name.hashCode()) * 37) + this.type.hashCode()) * 37) + this.context.hashCode()) * 37) + Integer.hashCode(this.untested_count);
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
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("duration=" + this.duration);
        arrayList.add("passed_count=" + this.passed_count);
        arrayList.add("failed_count=" + this.failed_count);
        arrayList.add("ignored_count=" + this.ignored_count);
        arrayList.add("retry_count=" + this.retry_count);
        arrayList.add("group_id=" + Internal.sanitize(this.group_id));
        arrayList.add("module_name=" + Internal.sanitize(this.module_name));
        arrayList.add("type=" + this.type);
        arrayList.add("context=" + this.context);
        arrayList.add("untested_count=" + this.untested_count);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientTestSuiteEvent{", "}", 0, null, null, 56, null);
    }

    public final ClientTestSuiteEvent copy(ClientPlatform platform, Instant timestamp, String name, float duration, int passed_count, int failed_count, int ignored_count, int retry_count, String group_id, String module_name, ClientTestSuiteType type2, ClientTestSuiteContext context, int untested_count, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(group_id, "group_id");
        Intrinsics.checkNotNullParameter(module_name, "module_name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientTestSuiteEvent(platform, timestamp, name, duration, passed_count, failed_count, ignored_count, retry_count, group_id, module_name, type2, context, untested_count, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientTestSuiteEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientTestSuiteEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientTestSuiteEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientTestSuiteEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getName());
                }
                if (!Float.valueOf(value.getDuration()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getDuration()));
                }
                if (value.getPassed_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getPassed_count()));
                }
                if (value.getFailed_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getFailed_count()));
                }
                if (value.getIgnored_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getIgnored_count()));
                }
                if (value.getRetry_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(8, Integer.valueOf(value.getRetry_count()));
                }
                if (!Intrinsics.areEqual(value.getGroup_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getGroup_id());
                }
                if (!Intrinsics.areEqual(value.getModule_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getModule_name());
                }
                if (value.getType() != ClientTestSuiteType.DEFAULT_TEST_TYPE) {
                    size += ClientTestSuiteType.ADAPTER.encodedSizeWithTag(11, value.getType());
                }
                if (value.getContext() != ClientTestSuiteContext.DEFAULT_TEST_SUITE_CONTEXT) {
                    size += ClientTestSuiteContext.ADAPTER.encodedSizeWithTag(12, value.getContext());
                }
                return value.getUntested_count() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(13, Integer.valueOf(value.getUntested_count())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientTestSuiteEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
                }
                if (!Float.valueOf(value.getDuration()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getDuration()));
                }
                if (value.getPassed_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getPassed_count()));
                }
                if (value.getFailed_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getFailed_count()));
                }
                if (value.getIgnored_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getIgnored_count()));
                }
                if (value.getRetry_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getRetry_count()));
                }
                if (!Intrinsics.areEqual(value.getGroup_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getGroup_id());
                }
                if (!Intrinsics.areEqual(value.getModule_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getModule_name());
                }
                if (value.getType() != ClientTestSuiteType.DEFAULT_TEST_TYPE) {
                    ClientTestSuiteType.ADAPTER.encodeWithTag(writer, 11, (int) value.getType());
                }
                if (value.getContext() != ClientTestSuiteContext.DEFAULT_TEST_SUITE_CONTEXT) {
                    ClientTestSuiteContext.ADAPTER.encodeWithTag(writer, 12, (int) value.getContext());
                }
                if (value.getUntested_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 13, (int) Integer.valueOf(value.getUntested_count()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientTestSuiteEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUntested_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 13, (int) Integer.valueOf(value.getUntested_count()));
                }
                if (value.getContext() != ClientTestSuiteContext.DEFAULT_TEST_SUITE_CONTEXT) {
                    ClientTestSuiteContext.ADAPTER.encodeWithTag(writer, 12, (int) value.getContext());
                }
                if (value.getType() != ClientTestSuiteType.DEFAULT_TEST_TYPE) {
                    ClientTestSuiteType.ADAPTER.encodeWithTag(writer, 11, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getModule_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getModule_name());
                }
                if (!Intrinsics.areEqual(value.getGroup_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getGroup_id());
                }
                if (value.getRetry_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getRetry_count()));
                }
                if (value.getIgnored_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getIgnored_count()));
                }
                if (value.getFailed_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getFailed_count()));
                }
                if (value.getPassed_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getPassed_count()));
                }
                if (!Float.valueOf(value.getDuration()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getDuration()));
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
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
            public ClientTestSuiteEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                ClientTestSuiteType clientTestSuiteType = ClientTestSuiteType.DEFAULT_TEST_TYPE;
                ClientTestSuiteContext clientTestSuiteContext = ClientTestSuiteContext.DEFAULT_TEST_SUITE_CONTEXT;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                float fFloatValue = 0.0f;
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                int iIntValue4 = 0;
                int iIntValue5 = 0;
                Instant instantDecode = null;
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                ClientTestSuiteContext clientTestSuiteContextDecode = clientTestSuiteContext;
                ClientTestSuiteType clientTestSuiteTypeDecode = clientTestSuiteType;
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
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
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
                                case 8:
                                    iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 9:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 10:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 11:
                                    try {
                                        clientTestSuiteTypeDecode = ClientTestSuiteType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 12:
                                    try {
                                        clientTestSuiteContextDecode = ClientTestSuiteContext.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 13:
                                    iIntValue5 = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ClientTestSuiteEvent(clientPlatform, instantDecode, strDecode2, fFloatValue, iIntValue, iIntValue2, iIntValue3, iIntValue4, strDecode3, strDecode, clientTestSuiteTypeDecode, clientTestSuiteContextDecode, iIntValue5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientTestSuiteEvent redact(ClientTestSuiteEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return value.copy((8189 & 1) != 0 ? value.platform : null, (8189 & 2) != 0 ? value.timestamp : timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, (8189 & 4) != 0 ? value.name : null, (8189 & 8) != 0 ? value.duration : 0.0f, (8189 & 16) != 0 ? value.passed_count : 0, (8189 & 32) != 0 ? value.failed_count : 0, (8189 & 64) != 0 ? value.ignored_count : 0, (8189 & 128) != 0 ? value.retry_count : 0, (8189 & 256) != 0 ? value.group_id : null, (8189 & 512) != 0 ? value.module_name : null, (8189 & 1024) != 0 ? value.type : null, (8189 & 2048) != 0 ? value.context : null, (8189 & 4096) != 0 ? value.untested_count : 0, (8189 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

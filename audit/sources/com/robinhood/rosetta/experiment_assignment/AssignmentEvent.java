package com.robinhood.rosetta.experiment_assignment;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* compiled from: AssignmentEvent.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B¯\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010,\u001a\u00020\u0002H\u0017J\u0013\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u0004H\u0016J®\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentEvent;", "Lcom/squareup/wire/Message;", "", "user_agent", "", "results", "", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentResult;", "variants", "", "request_type", "kaizen_list_respected", "", "platform", "version", "entity_type", "entity_id", "trigger", "source", "event", "timestamp", "application", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getUser_agent", "()Ljava/lang/String;", "getRequest_type", "getKaizen_list_respected", "()Z", "getPlatform", "getVersion", "getEntity_type", "getEntity_id", "getTrigger", "getSource", "getEvent", "getTimestamp", "getApplication", "getResults", "()Ljava/util/List;", "getVariants", "()Ljava/util/Map;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AssignmentEvent extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String application;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entityId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String entity_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entityType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String entity_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String event;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "kaizenListRespected", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean kaizen_list_respected;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String request_type;

    @WireField(adapter = "com.robinhood.rosetta.experiment_assignment.AssignmentResult#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<AssignmentResult> results;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final boolean trigger;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String user_agent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final Map<String, String> variants;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String version;

    @JvmField
    public static final ProtoAdapter<AssignmentEvent> ADAPTER = new AssignmentEvent2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(AssignmentEvent.class), Syntax.PROTO_3);

    public AssignmentEvent() {
        this(null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, 32767, null);
    }

    public /* synthetic */ AssignmentEvent(String str, List list, Map map, String str2, boolean z, String str3, String str4, String str5, String str6, boolean z2, String str7, String str8, String str9, String str10, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) == 0 ? z2 : false, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9, (i & 8192) == 0 ? str10 : "", (i & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24622newBuilder();
    }

    public final String getUser_agent() {
        return this.user_agent;
    }

    public final String getRequest_type() {
        return this.request_type;
    }

    public final boolean getKaizen_list_respected() {
        return this.kaizen_list_respected;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getEntity_type() {
        return this.entity_type;
    }

    public final String getEntity_id() {
        return this.entity_id;
    }

    public final boolean getTrigger() {
        return this.trigger;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getApplication() {
        return this.application;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssignmentEvent(String user_agent, List<AssignmentResult> results, Map<String, String> variants, String request_type, boolean z, String platform, String version, String entity_type, String entity_id, boolean z2, String source, String event, String timestamp, String application, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(variants, "variants");
        Intrinsics.checkNotNullParameter(request_type, "request_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_agent = user_agent;
        this.request_type = request_type;
        this.kaizen_list_respected = z;
        this.platform = platform;
        this.version = version;
        this.entity_type = entity_type;
        this.entity_id = entity_id;
        this.trigger = z2;
        this.source = source;
        this.event = event;
        this.timestamp = timestamp;
        this.application = application;
        this.results = Internal.immutableCopyOf("results", results);
        this.variants = Internal.immutableCopyOf("variants", variants);
    }

    public final List<AssignmentResult> getResults() {
        return this.results;
    }

    public final Map<String, String> getVariants() {
        return this.variants;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24622newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AssignmentEvent)) {
            return false;
        }
        AssignmentEvent assignmentEvent = (AssignmentEvent) other;
        return Intrinsics.areEqual(unknownFields(), assignmentEvent.unknownFields()) && Intrinsics.areEqual(this.user_agent, assignmentEvent.user_agent) && Intrinsics.areEqual(this.results, assignmentEvent.results) && Intrinsics.areEqual(this.variants, assignmentEvent.variants) && Intrinsics.areEqual(this.request_type, assignmentEvent.request_type) && this.kaizen_list_respected == assignmentEvent.kaizen_list_respected && Intrinsics.areEqual(this.platform, assignmentEvent.platform) && Intrinsics.areEqual(this.version, assignmentEvent.version) && Intrinsics.areEqual(this.entity_type, assignmentEvent.entity_type) && Intrinsics.areEqual(this.entity_id, assignmentEvent.entity_id) && this.trigger == assignmentEvent.trigger && Intrinsics.areEqual(this.source, assignmentEvent.source) && Intrinsics.areEqual(this.event, assignmentEvent.event) && Intrinsics.areEqual(this.timestamp, assignmentEvent.timestamp) && Intrinsics.areEqual(this.application, assignmentEvent.application);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.user_agent.hashCode()) * 37) + this.results.hashCode()) * 37) + this.variants.hashCode()) * 37) + this.request_type.hashCode()) * 37) + Boolean.hashCode(this.kaizen_list_respected)) * 37) + this.platform.hashCode()) * 37) + this.version.hashCode()) * 37) + this.entity_type.hashCode()) * 37) + this.entity_id.hashCode()) * 37) + Boolean.hashCode(this.trigger)) * 37) + this.source.hashCode()) * 37) + this.event.hashCode()) * 37) + this.timestamp.hashCode()) * 37) + this.application.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("user_agent=" + Internal.sanitize(this.user_agent));
        if (!this.results.isEmpty()) {
            arrayList.add("results=" + this.results);
        }
        if (!this.variants.isEmpty()) {
            arrayList.add("variants=" + this.variants);
        }
        arrayList.add("request_type=" + Internal.sanitize(this.request_type));
        arrayList.add("kaizen_list_respected=" + this.kaizen_list_respected);
        arrayList.add("platform=" + Internal.sanitize(this.platform));
        arrayList.add("version=" + Internal.sanitize(this.version));
        arrayList.add("entity_type=" + Internal.sanitize(this.entity_type));
        arrayList.add("entity_id=" + Internal.sanitize(this.entity_id));
        arrayList.add("trigger=" + this.trigger);
        arrayList.add("source=" + Internal.sanitize(this.source));
        arrayList.add("event=" + Internal.sanitize(this.event));
        arrayList.add("timestamp=" + Internal.sanitize(this.timestamp));
        arrayList.add("application=" + Internal.sanitize(this.application));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AssignmentEvent{", "}", 0, null, null, 56, null);
    }

    public final AssignmentEvent copy(String user_agent, List<AssignmentResult> results, Map<String, String> variants, String request_type, boolean kaizen_list_respected, String platform, String version, String entity_type, String entity_id, boolean trigger, String source, String event, String timestamp, String application, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(variants, "variants");
        Intrinsics.checkNotNullParameter(request_type, "request_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AssignmentEvent(user_agent, results, variants, request_type, kaizen_list_respected, platform, version, entity_type, entity_id, trigger, source, event, timestamp, application, unknownFields);
    }
}

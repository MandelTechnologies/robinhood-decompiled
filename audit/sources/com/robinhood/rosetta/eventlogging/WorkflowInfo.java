package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.lib.stepupverification.SuvConstants;
import com.robinhood.rosetta.eventlogging.WorkflowInfo;
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
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: WorkflowInfo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000245B\u0087\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!J\u008d\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010!R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b,\u0010!R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b-\u0010!R\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b.\u0010!R\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b/\u0010!R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b0\u0010!R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b1\u0010!R\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b2\u0010!R\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b3\u0010!¨\u00066"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WorkflowInfo;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfo$EventType;", "event_type", "", "frontend_event_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "event_time", SuvConstants.PARAM_WORKFLOW_ID, "screen_name", "block_id", "client_version", "action", "logging_identifier", "challenge_id", "error", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/WorkflowInfo$EventType;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/WorkflowInfo$EventType;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/WorkflowInfo;", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfo$EventType;", "getEvent_type", "()Lcom/robinhood/rosetta/eventlogging/WorkflowInfo$EventType;", "Ljava/lang/String;", "getFrontend_event_id", "Lj$/time/Instant;", "getEvent_time", "()Lj$/time/Instant;", "getWorkflow_id", "getScreen_name", "getBlock_id", "getClient_version", "getAction", "getLogging_identifier", "getChallenge_id", "getError", "Companion", "EventType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class WorkflowInfo extends Message {

    @JvmField
    public static final ProtoAdapter<WorkflowInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "blockId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String block_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = ChallengeResponseActivity.EXTRA_CHALLENGE_ID, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String challenge_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clientVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String client_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "eventTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant event_time;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.WorkflowInfo$EventType#ADAPTER", jsonName = "eventType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EventType event_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "frontendEventId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String frontend_event_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String screen_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "workflowId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String workflow_id;

    public WorkflowInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24615newBuilder();
    }

    public final EventType getEvent_type() {
        return this.event_type;
    }

    public /* synthetic */ WorkflowInfo(EventType eventType, String str, Instant instant, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EventType.EVENT_TYPE_UNSPECIFIED : eventType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getFrontend_event_id() {
        return this.frontend_event_id;
    }

    public final Instant getEvent_time() {
        return this.event_time;
    }

    public final String getWorkflow_id() {
        return this.workflow_id;
    }

    public final String getScreen_name() {
        return this.screen_name;
    }

    public final String getBlock_id() {
        return this.block_id;
    }

    public final String getClient_version() {
        return this.client_version;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final String getChallenge_id() {
        return this.challenge_id;
    }

    public final String getError() {
        return this.error;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowInfo(EventType event_type, String frontend_event_id, Instant instant, String workflow_id, String screen_name, String block_id, String client_version, String action, String logging_identifier, String challenge_id, String error, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(frontend_event_id, "frontend_event_id");
        Intrinsics.checkNotNullParameter(workflow_id, "workflow_id");
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(block_id, "block_id");
        Intrinsics.checkNotNullParameter(client_version, "client_version");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(challenge_id, "challenge_id");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.event_type = event_type;
        this.frontend_event_id = frontend_event_id;
        this.event_time = instant;
        this.workflow_id = workflow_id;
        this.screen_name = screen_name;
        this.block_id = block_id;
        this.client_version = client_version;
        this.action = action;
        this.logging_identifier = logging_identifier;
        this.challenge_id = challenge_id;
        this.error = error;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24615newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WorkflowInfo)) {
            return false;
        }
        WorkflowInfo workflowInfo = (WorkflowInfo) other;
        return Intrinsics.areEqual(unknownFields(), workflowInfo.unknownFields()) && this.event_type == workflowInfo.event_type && Intrinsics.areEqual(this.frontend_event_id, workflowInfo.frontend_event_id) && Intrinsics.areEqual(this.event_time, workflowInfo.event_time) && Intrinsics.areEqual(this.workflow_id, workflowInfo.workflow_id) && Intrinsics.areEqual(this.screen_name, workflowInfo.screen_name) && Intrinsics.areEqual(this.block_id, workflowInfo.block_id) && Intrinsics.areEqual(this.client_version, workflowInfo.client_version) && Intrinsics.areEqual(this.action, workflowInfo.action) && Intrinsics.areEqual(this.logging_identifier, workflowInfo.logging_identifier) && Intrinsics.areEqual(this.challenge_id, workflowInfo.challenge_id) && Intrinsics.areEqual(this.error, workflowInfo.error);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.event_type.hashCode()) * 37) + this.frontend_event_id.hashCode()) * 37;
        Instant instant = this.event_time;
        int iHashCode2 = ((((((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.workflow_id.hashCode()) * 37) + this.screen_name.hashCode()) * 37) + this.block_id.hashCode()) * 37) + this.client_version.hashCode()) * 37) + this.action.hashCode()) * 37) + this.logging_identifier.hashCode()) * 37) + this.challenge_id.hashCode()) * 37) + this.error.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("event_type=" + this.event_type);
        arrayList.add("frontend_event_id=" + Internal.sanitize(this.frontend_event_id));
        Instant instant = this.event_time;
        if (instant != null) {
            arrayList.add("event_time=" + instant);
        }
        arrayList.add("workflow_id=" + Internal.sanitize(this.workflow_id));
        arrayList.add("screen_name=" + Internal.sanitize(this.screen_name));
        arrayList.add("block_id=" + Internal.sanitize(this.block_id));
        arrayList.add("client_version=" + Internal.sanitize(this.client_version));
        arrayList.add("action=" + Internal.sanitize(this.action));
        arrayList.add("logging_identifier=" + Internal.sanitize(this.logging_identifier));
        arrayList.add("challenge_id=" + Internal.sanitize(this.challenge_id));
        arrayList.add("error=" + Internal.sanitize(this.error));
        return CollectionsKt.joinToString$default(arrayList, ", ", "WorkflowInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ WorkflowInfo copy$default(WorkflowInfo workflowInfo, EventType eventType, String str, Instant instant, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            eventType = workflowInfo.event_type;
        }
        if ((i & 2) != 0) {
            str = workflowInfo.frontend_event_id;
        }
        if ((i & 4) != 0) {
            instant = workflowInfo.event_time;
        }
        if ((i & 8) != 0) {
            str2 = workflowInfo.workflow_id;
        }
        if ((i & 16) != 0) {
            str3 = workflowInfo.screen_name;
        }
        if ((i & 32) != 0) {
            str4 = workflowInfo.block_id;
        }
        if ((i & 64) != 0) {
            str5 = workflowInfo.client_version;
        }
        if ((i & 128) != 0) {
            str6 = workflowInfo.action;
        }
        if ((i & 256) != 0) {
            str7 = workflowInfo.logging_identifier;
        }
        if ((i & 512) != 0) {
            str8 = workflowInfo.challenge_id;
        }
        if ((i & 1024) != 0) {
            str9 = workflowInfo.error;
        }
        if ((i & 2048) != 0) {
            byteString = workflowInfo.unknownFields();
        }
        String str10 = str9;
        ByteString byteString2 = byteString;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        String str15 = str3;
        String str16 = str4;
        return workflowInfo.copy(eventType, str, instant, str2, str15, str16, str13, str14, str11, str12, str10, byteString2);
    }

    public final WorkflowInfo copy(EventType event_type, String frontend_event_id, Instant event_time, String workflow_id, String screen_name, String block_id, String client_version, String action, String logging_identifier, String challenge_id, String error, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(frontend_event_id, "frontend_event_id");
        Intrinsics.checkNotNullParameter(workflow_id, "workflow_id");
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(block_id, "block_id");
        Intrinsics.checkNotNullParameter(client_version, "client_version");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(challenge_id, "challenge_id");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new WorkflowInfo(event_type, frontend_event_id, event_time, workflow_id, screen_name, block_id, client_version, action, logging_identifier, challenge_id, error, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WorkflowInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<WorkflowInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.WorkflowInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WorkflowInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getEvent_type() != WorkflowInfo.EventType.EVENT_TYPE_UNSPECIFIED) {
                    size += WorkflowInfo.EventType.ADAPTER.encodedSizeWithTag(1, value.getEvent_type());
                }
                if (!Intrinsics.areEqual(value.getFrontend_event_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFrontend_event_id());
                }
                if (value.getEvent_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getEvent_time());
                }
                if (!Intrinsics.areEqual(value.getWorkflow_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getWorkflow_id());
                }
                if (!Intrinsics.areEqual(value.getScreen_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getScreen_name());
                }
                if (!Intrinsics.areEqual(value.getBlock_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getBlock_id());
                }
                if (!Intrinsics.areEqual(value.getClient_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getClient_version());
                }
                if (!Intrinsics.areEqual(value.getAction(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getAction());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getChallenge_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getChallenge_id());
                }
                return !Intrinsics.areEqual(value.getError(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(11, value.getError()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WorkflowInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEvent_type() != WorkflowInfo.EventType.EVENT_TYPE_UNSPECIFIED) {
                    WorkflowInfo.EventType.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent_type());
                }
                if (!Intrinsics.areEqual(value.getFrontend_event_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFrontend_event_id());
                }
                if (value.getEvent_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getEvent_time());
                }
                if (!Intrinsics.areEqual(value.getWorkflow_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getWorkflow_id());
                }
                if (!Intrinsics.areEqual(value.getScreen_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getScreen_name());
                }
                if (!Intrinsics.areEqual(value.getBlock_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getBlock_id());
                }
                if (!Intrinsics.areEqual(value.getClient_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getClient_version());
                }
                if (!Intrinsics.areEqual(value.getAction(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getAction());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getChallenge_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getChallenge_id());
                }
                if (!Intrinsics.areEqual(value.getError(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getError());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WorkflowInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getError(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getError());
                }
                if (!Intrinsics.areEqual(value.getChallenge_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getChallenge_id());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getAction(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getAction());
                }
                if (!Intrinsics.areEqual(value.getClient_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getClient_version());
                }
                if (!Intrinsics.areEqual(value.getBlock_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getBlock_id());
                }
                if (!Intrinsics.areEqual(value.getScreen_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getScreen_name());
                }
                if (!Intrinsics.areEqual(value.getWorkflow_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getWorkflow_id());
                }
                if (value.getEvent_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getEvent_time());
                }
                if (!Intrinsics.areEqual(value.getFrontend_event_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFrontend_event_id());
                }
                if (value.getEvent_type() != WorkflowInfo.EventType.EVENT_TYPE_UNSPECIFIED) {
                    WorkflowInfo.EventType.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public WorkflowInfo decode(ProtoReader reader) throws IOException {
                WorkflowInfo.EventType eventType;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                WorkflowInfo.EventType eventType2 = WorkflowInfo.EventType.EVENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                Instant instantDecode = null;
                WorkflowInfo.EventType eventTypeDecode = eventType2;
                String strDecode9 = strDecode8;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    eventTypeDecode = WorkflowInfo.EventType.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    eventType = eventTypeDecode;
                                    str = strDecode9;
                                    str2 = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                eventType = eventTypeDecode;
                                str = strDecode9;
                                str2 = strDecode;
                                break;
                        }
                        eventTypeDecode = eventType;
                        strDecode = str2;
                        strDecode9 = str;
                    } else {
                        return new WorkflowInfo(eventTypeDecode, strDecode9, instantDecode, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WorkflowInfo redact(WorkflowInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant event_time = value.getEvent_time();
                return WorkflowInfo.copy$default(value, null, null, event_time != null ? ProtoAdapter.INSTANT.redact(event_time) : null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 2043, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkflowInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WorkflowInfo$EventType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_TYPE_UNSPECIFIED", "REQUEST", "RESPONSE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EventType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EventType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EventType EVENT_TYPE_UNSPECIFIED;
        public static final EventType REQUEST;
        public static final EventType RESPONSE;
        private final int value;

        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{EVENT_TYPE_UNSPECIFIED, REQUEST, RESPONSE};
        }

        @JvmStatic
        public static final EventType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EventType> getEntries() {
            return $ENTRIES;
        }

        private EventType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EventType eventType = new EventType("EVENT_TYPE_UNSPECIFIED", 0, 0);
            EVENT_TYPE_UNSPECIFIED = eventType;
            REQUEST = new EventType("REQUEST", 1, 1);
            RESPONSE = new EventType("RESPONSE", 2, 2);
            EventType[] eventTypeArr$values = $values();
            $VALUES = eventTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EventType>(orCreateKotlinClass, syntax, eventType) { // from class: com.robinhood.rosetta.eventlogging.WorkflowInfo$EventType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public WorkflowInfo.EventType fromValue(int value) {
                    return WorkflowInfo.EventType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: WorkflowInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WorkflowInfo$EventType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfo$EventType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EventType fromValue(int value) {
                if (value == 0) {
                    return EventType.EVENT_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return EventType.REQUEST;
                }
                if (value != 2) {
                    return null;
                }
                return EventType.RESPONSE;
            }
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }
}

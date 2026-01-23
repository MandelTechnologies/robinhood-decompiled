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
import p479j$.time.Duration;

/* compiled from: CompletedActionMetadataEvent.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b*\u0018\u0000 O2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001OB\u0095\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0017¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010-J\u009b\u0002\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010-R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b2\u0010-R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b3\u0010-R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b4\u0010-R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b\t\u00106R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b7\u00106R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010+R\"\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010<R\"\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b=\u0010<R\"\u0010\u0011\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b>\u0010<R\"\u0010\u0012\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b?\u0010<R\"\u0010\u0013\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\b@\u0010<R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u0016\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bD\u0010CR\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bE\u0010CR\u001a\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\bI\u0010-R\u001a\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00100\u001a\u0004\bJ\u0010-R\u001a\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00100\u001a\u0004\bK\u0010-R\u001a\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\bL\u0010-R\u001a\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00100\u001a\u0004\bM\u0010-R\u001a\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\bN\u0010-¨\u0006P"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEvent;", "Lcom/squareup/wire/Message;", "", "", "correlated_invocations_id", "target_id", "uuid", "action_mnemonic", "", "is_stamped", "cached_result", "", "exit_code", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "queued_duration", "total_worker_duration", "execution_duration", "input_fetch_duration", "output_upload_duration", "", "input_files_sizes", "output_files_number", "output_files_sizes", "", "cost", "namespace", "worker_node", "worker_pod", "action_id", "tool_invocation_id", "directory", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;JJJDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;JJJDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEvent;", "Ljava/lang/String;", "getCorrelated_invocations_id", "getTarget_id", "getUuid", "getAction_mnemonic", "Z", "()Z", "getCached_result", "I", "getExit_code", "Lj$/time/Duration;", "getQueued_duration", "()Lj$/time/Duration;", "getTotal_worker_duration", "getExecution_duration", "getInput_fetch_duration", "getOutput_upload_duration", "J", "getInput_files_sizes", "()J", "getOutput_files_number", "getOutput_files_sizes", "D", "getCost", "()D", "getNamespace", "getWorker_node", "getWorker_pod", "getAction_id", "getTool_invocation_id", "getDirectory", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CompletedActionMetadataEvent extends Message {

    @JvmField
    public static final ProtoAdapter<CompletedActionMetadataEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "actionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final String action_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "actionMnemonic", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String action_mnemonic;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "cachedResult", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean cached_result;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "correlatedInvocationsId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String correlated_invocations_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final double cost;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final String directory;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DURATION", jsonName = "executionDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Duration execution_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "exitCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int exit_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DURATION", jsonName = "inputFetchDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Duration input_fetch_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "inputFilesSizes", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final long input_files_sizes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isStamped", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_stamped;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final String namespace;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "outputFilesNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final long output_files_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "outputFilesSizes", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final long output_files_sizes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DURATION", jsonName = "outputUploadDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Duration output_upload_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DURATION", jsonName = "queuedDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Duration queued_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "targetId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String target_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "toolInvocationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final String tool_invocation_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DURATION", jsonName = "totalWorkerDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Duration total_worker_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "workerNode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final String worker_node;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "workerPod", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final String worker_pod;

    public CompletedActionMetadataEvent() {
        this(null, null, null, null, false, false, 0, null, null, null, null, null, 0L, 0L, 0L, 0.0d, null, null, null, null, null, null, null, 8388607, null);
    }

    public /* synthetic */ CompletedActionMetadataEvent(String str, String str2, String str3, String str4, boolean z, boolean z2, int i, Duration duration, Duration duration2, Duration duration3, Duration duration4, Duration duration5, long j, long j2, long j3, double d, String str5, String str6, String str7, String str8, String str9, String str10, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) == 0 ? i : 0, (i2 & 128) != 0 ? null : duration, (i2 & 256) != 0 ? null : duration2, (i2 & 512) != 0 ? null : duration3, (i2 & 1024) != 0 ? null : duration4, (i2 & 2048) == 0 ? duration5 : null, (i2 & 4096) != 0 ? 0L : j, (i2 & 8192) != 0 ? 0L : j2, (i2 & 16384) == 0 ? j3 : 0L, (32768 & i2) != 0 ? 0.0d : d, (65536 & i2) != 0 ? "" : str5, (i2 & 131072) != 0 ? "" : str6, (i2 & 262144) != 0 ? "" : str7, (i2 & 524288) != 0 ? "" : str8, (i2 & 1048576) != 0 ? "" : str9, (i2 & 2097152) == 0 ? str10 : "", (i2 & 4194304) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24132newBuilder();
    }

    public final String getCorrelated_invocations_id() {
        return this.correlated_invocations_id;
    }

    public final String getTarget_id() {
        return this.target_id;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getAction_mnemonic() {
        return this.action_mnemonic;
    }

    /* renamed from: is_stamped, reason: from getter */
    public final boolean getIs_stamped() {
        return this.is_stamped;
    }

    public final boolean getCached_result() {
        return this.cached_result;
    }

    public final int getExit_code() {
        return this.exit_code;
    }

    public final Duration getQueued_duration() {
        return this.queued_duration;
    }

    public final Duration getTotal_worker_duration() {
        return this.total_worker_duration;
    }

    public final Duration getExecution_duration() {
        return this.execution_duration;
    }

    public final Duration getInput_fetch_duration() {
        return this.input_fetch_duration;
    }

    public final Duration getOutput_upload_duration() {
        return this.output_upload_duration;
    }

    public final long getInput_files_sizes() {
        return this.input_files_sizes;
    }

    public final long getOutput_files_number() {
        return this.output_files_number;
    }

    public final long getOutput_files_sizes() {
        return this.output_files_sizes;
    }

    public final double getCost() {
        return this.cost;
    }

    public final String getNamespace() {
        return this.namespace;
    }

    public final String getWorker_node() {
        return this.worker_node;
    }

    public final String getWorker_pod() {
        return this.worker_pod;
    }

    public final String getAction_id() {
        return this.action_id;
    }

    public final String getTool_invocation_id() {
        return this.tool_invocation_id;
    }

    public final String getDirectory() {
        return this.directory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompletedActionMetadataEvent(String correlated_invocations_id, String target_id, String uuid, String action_mnemonic, boolean z, boolean z2, int i, Duration duration, Duration duration2, Duration duration3, Duration duration4, Duration duration5, long j, long j2, long j3, double d, String namespace, String worker_node, String worker_pod, String action_id, String tool_invocation_id, String directory, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(correlated_invocations_id, "correlated_invocations_id");
        Intrinsics.checkNotNullParameter(target_id, "target_id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(action_mnemonic, "action_mnemonic");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(worker_node, "worker_node");
        Intrinsics.checkNotNullParameter(worker_pod, "worker_pod");
        Intrinsics.checkNotNullParameter(action_id, "action_id");
        Intrinsics.checkNotNullParameter(tool_invocation_id, "tool_invocation_id");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.correlated_invocations_id = correlated_invocations_id;
        this.target_id = target_id;
        this.uuid = uuid;
        this.action_mnemonic = action_mnemonic;
        this.is_stamped = z;
        this.cached_result = z2;
        this.exit_code = i;
        this.queued_duration = duration;
        this.total_worker_duration = duration2;
        this.execution_duration = duration3;
        this.input_fetch_duration = duration4;
        this.output_upload_duration = duration5;
        this.input_files_sizes = j;
        this.output_files_number = j2;
        this.output_files_sizes = j3;
        this.cost = d;
        this.namespace = namespace;
        this.worker_node = worker_node;
        this.worker_pod = worker_pod;
        this.action_id = action_id;
        this.tool_invocation_id = tool_invocation_id;
        this.directory = directory;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24132newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CompletedActionMetadataEvent)) {
            return false;
        }
        CompletedActionMetadataEvent completedActionMetadataEvent = (CompletedActionMetadataEvent) other;
        return Intrinsics.areEqual(unknownFields(), completedActionMetadataEvent.unknownFields()) && Intrinsics.areEqual(this.correlated_invocations_id, completedActionMetadataEvent.correlated_invocations_id) && Intrinsics.areEqual(this.target_id, completedActionMetadataEvent.target_id) && Intrinsics.areEqual(this.uuid, completedActionMetadataEvent.uuid) && Intrinsics.areEqual(this.action_mnemonic, completedActionMetadataEvent.action_mnemonic) && this.is_stamped == completedActionMetadataEvent.is_stamped && this.cached_result == completedActionMetadataEvent.cached_result && this.exit_code == completedActionMetadataEvent.exit_code && Intrinsics.areEqual(this.queued_duration, completedActionMetadataEvent.queued_duration) && Intrinsics.areEqual(this.total_worker_duration, completedActionMetadataEvent.total_worker_duration) && Intrinsics.areEqual(this.execution_duration, completedActionMetadataEvent.execution_duration) && Intrinsics.areEqual(this.input_fetch_duration, completedActionMetadataEvent.input_fetch_duration) && Intrinsics.areEqual(this.output_upload_duration, completedActionMetadataEvent.output_upload_duration) && this.input_files_sizes == completedActionMetadataEvent.input_files_sizes && this.output_files_number == completedActionMetadataEvent.output_files_number && this.output_files_sizes == completedActionMetadataEvent.output_files_sizes && this.cost == completedActionMetadataEvent.cost && Intrinsics.areEqual(this.namespace, completedActionMetadataEvent.namespace) && Intrinsics.areEqual(this.worker_node, completedActionMetadataEvent.worker_node) && Intrinsics.areEqual(this.worker_pod, completedActionMetadataEvent.worker_pod) && Intrinsics.areEqual(this.action_id, completedActionMetadataEvent.action_id) && Intrinsics.areEqual(this.tool_invocation_id, completedActionMetadataEvent.tool_invocation_id) && Intrinsics.areEqual(this.directory, completedActionMetadataEvent.directory);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.correlated_invocations_id.hashCode()) * 37) + this.target_id.hashCode()) * 37) + this.uuid.hashCode()) * 37) + this.action_mnemonic.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_stamped)) * 37) + java.lang.Boolean.hashCode(this.cached_result)) * 37) + Integer.hashCode(this.exit_code)) * 37;
        Duration duration = this.queued_duration;
        int iHashCode2 = (iHashCode + (duration != null ? duration.hashCode() : 0)) * 37;
        Duration duration2 = this.total_worker_duration;
        int iHashCode3 = (iHashCode2 + (duration2 != null ? duration2.hashCode() : 0)) * 37;
        Duration duration3 = this.execution_duration;
        int iHashCode4 = (iHashCode3 + (duration3 != null ? duration3.hashCode() : 0)) * 37;
        Duration duration4 = this.input_fetch_duration;
        int iHashCode5 = (iHashCode4 + (duration4 != null ? duration4.hashCode() : 0)) * 37;
        Duration duration5 = this.output_upload_duration;
        int iHashCode6 = ((((((((((((((((((((iHashCode5 + (duration5 != null ? duration5.hashCode() : 0)) * 37) + Long.hashCode(this.input_files_sizes)) * 37) + Long.hashCode(this.output_files_number)) * 37) + Long.hashCode(this.output_files_sizes)) * 37) + Double.hashCode(this.cost)) * 37) + this.namespace.hashCode()) * 37) + this.worker_node.hashCode()) * 37) + this.worker_pod.hashCode()) * 37) + this.action_id.hashCode()) * 37) + this.tool_invocation_id.hashCode()) * 37) + this.directory.hashCode();
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("correlated_invocations_id=" + Internal.sanitize(this.correlated_invocations_id));
        arrayList.add("target_id=" + Internal.sanitize(this.target_id));
        arrayList.add("uuid=" + Internal.sanitize(this.uuid));
        arrayList.add("action_mnemonic=" + Internal.sanitize(this.action_mnemonic));
        arrayList.add("is_stamped=" + this.is_stamped);
        arrayList.add("cached_result=" + this.cached_result);
        arrayList.add("exit_code=" + this.exit_code);
        Duration duration = this.queued_duration;
        if (duration != null) {
            arrayList.add("queued_duration=" + duration);
        }
        Duration duration2 = this.total_worker_duration;
        if (duration2 != null) {
            arrayList.add("total_worker_duration=" + duration2);
        }
        Duration duration3 = this.execution_duration;
        if (duration3 != null) {
            arrayList.add("execution_duration=" + duration3);
        }
        Duration duration4 = this.input_fetch_duration;
        if (duration4 != null) {
            arrayList.add("input_fetch_duration=" + duration4);
        }
        Duration duration5 = this.output_upload_duration;
        if (duration5 != null) {
            arrayList.add("output_upload_duration=" + duration5);
        }
        arrayList.add("input_files_sizes=" + this.input_files_sizes);
        arrayList.add("output_files_number=" + this.output_files_number);
        arrayList.add("output_files_sizes=" + this.output_files_sizes);
        arrayList.add("cost=" + this.cost);
        arrayList.add("namespace=" + Internal.sanitize(this.namespace));
        arrayList.add("worker_node=" + Internal.sanitize(this.worker_node));
        arrayList.add("worker_pod=" + Internal.sanitize(this.worker_pod));
        arrayList.add("action_id=" + Internal.sanitize(this.action_id));
        arrayList.add("tool_invocation_id=" + Internal.sanitize(this.tool_invocation_id));
        arrayList.add("directory=" + Internal.sanitize(this.directory));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CompletedActionMetadataEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CompletedActionMetadataEvent copy$default(CompletedActionMetadataEvent completedActionMetadataEvent, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, Duration duration, Duration duration2, Duration duration3, Duration duration4, Duration duration5, long j, long j2, long j3, double d, String str5, String str6, String str7, String str8, String str9, String str10, ByteString byteString, int i2, Object obj) {
        String str11 = (i2 & 1) != 0 ? completedActionMetadataEvent.correlated_invocations_id : str;
        String str12 = (i2 & 2) != 0 ? completedActionMetadataEvent.target_id : str2;
        String str13 = (i2 & 4) != 0 ? completedActionMetadataEvent.uuid : str3;
        String str14 = (i2 & 8) != 0 ? completedActionMetadataEvent.action_mnemonic : str4;
        boolean z3 = (i2 & 16) != 0 ? completedActionMetadataEvent.is_stamped : z;
        boolean z4 = (i2 & 32) != 0 ? completedActionMetadataEvent.cached_result : z2;
        int i3 = (i2 & 64) != 0 ? completedActionMetadataEvent.exit_code : i;
        Duration duration6 = (i2 & 128) != 0 ? completedActionMetadataEvent.queued_duration : duration;
        Duration duration7 = (i2 & 256) != 0 ? completedActionMetadataEvent.total_worker_duration : duration2;
        Duration duration8 = (i2 & 512) != 0 ? completedActionMetadataEvent.execution_duration : duration3;
        Duration duration9 = (i2 & 1024) != 0 ? completedActionMetadataEvent.input_fetch_duration : duration4;
        Duration duration10 = (i2 & 2048) != 0 ? completedActionMetadataEvent.output_upload_duration : duration5;
        long j4 = (i2 & 4096) != 0 ? completedActionMetadataEvent.input_files_sizes : j;
        String str15 = str11;
        String str16 = str12;
        long j5 = (i2 & 8192) != 0 ? completedActionMetadataEvent.output_files_number : j2;
        long j6 = (i2 & 16384) != 0 ? completedActionMetadataEvent.output_files_sizes : j3;
        double d2 = (i2 & 32768) != 0 ? completedActionMetadataEvent.cost : d;
        return completedActionMetadataEvent.copy(str15, str16, str13, str14, z3, z4, i3, duration6, duration7, duration8, duration9, duration10, j4, j5, j6, d2, (i2 & 65536) != 0 ? completedActionMetadataEvent.namespace : str5, (i2 & 131072) != 0 ? completedActionMetadataEvent.worker_node : str6, (i2 & 262144) != 0 ? completedActionMetadataEvent.worker_pod : str7, (i2 & 524288) != 0 ? completedActionMetadataEvent.action_id : str8, (i2 & 1048576) != 0 ? completedActionMetadataEvent.tool_invocation_id : str9, (i2 & 2097152) != 0 ? completedActionMetadataEvent.directory : str10, (i2 & 4194304) != 0 ? completedActionMetadataEvent.unknownFields() : byteString);
    }

    public final CompletedActionMetadataEvent copy(String correlated_invocations_id, String target_id, String uuid, String action_mnemonic, boolean is_stamped, boolean cached_result, int exit_code, Duration queued_duration, Duration total_worker_duration, Duration execution_duration, Duration input_fetch_duration, Duration output_upload_duration, long input_files_sizes, long output_files_number, long output_files_sizes, double cost, String namespace, String worker_node, String worker_pod, String action_id, String tool_invocation_id, String directory, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(correlated_invocations_id, "correlated_invocations_id");
        Intrinsics.checkNotNullParameter(target_id, "target_id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(action_mnemonic, "action_mnemonic");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(worker_node, "worker_node");
        Intrinsics.checkNotNullParameter(worker_pod, "worker_pod");
        Intrinsics.checkNotNullParameter(action_id, "action_id");
        Intrinsics.checkNotNullParameter(tool_invocation_id, "tool_invocation_id");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CompletedActionMetadataEvent(correlated_invocations_id, target_id, uuid, action_mnemonic, is_stamped, cached_result, exit_code, queued_duration, total_worker_duration, execution_duration, input_fetch_duration, output_upload_duration, input_files_sizes, output_files_number, output_files_sizes, cost, namespace, worker_node, worker_pod, action_id, tool_invocation_id, directory, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CompletedActionMetadataEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CompletedActionMetadataEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CompletedActionMetadataEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CompletedActionMetadataEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCorrelated_invocations_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCorrelated_invocations_id());
                }
                if (!Intrinsics.areEqual(value.getTarget_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTarget_id());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getUuid());
                }
                if (!Intrinsics.areEqual(value.getAction_mnemonic(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAction_mnemonic());
                }
                if (value.getIs_stamped()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, java.lang.Boolean.valueOf(value.getIs_stamped()));
                }
                if (value.getCached_result()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, java.lang.Boolean.valueOf(value.getCached_result()));
                }
                if (value.getExit_code() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getExit_code()));
                }
                if (value.getQueued_duration() != null) {
                    size += ProtoAdapter.DURATION.encodedSizeWithTag(8, value.getQueued_duration());
                }
                if (value.getTotal_worker_duration() != null) {
                    size += ProtoAdapter.DURATION.encodedSizeWithTag(9, value.getTotal_worker_duration());
                }
                if (value.getExecution_duration() != null) {
                    size += ProtoAdapter.DURATION.encodedSizeWithTag(10, value.getExecution_duration());
                }
                if (value.getInput_fetch_duration() != null) {
                    size += ProtoAdapter.DURATION.encodedSizeWithTag(11, value.getInput_fetch_duration());
                }
                if (value.getOutput_upload_duration() != null) {
                    size += ProtoAdapter.DURATION.encodedSizeWithTag(12, value.getOutput_upload_duration());
                }
                if (value.getInput_files_sizes() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(13, Long.valueOf(value.getInput_files_sizes()));
                }
                if (value.getOutput_files_number() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(14, Long.valueOf(value.getOutput_files_number()));
                }
                if (value.getOutput_files_sizes() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(15, Long.valueOf(value.getOutput_files_sizes()));
                }
                if (!Double.valueOf(value.getCost()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(16, Double.valueOf(value.getCost()));
                }
                if (!Intrinsics.areEqual(value.getNamespace(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(17, value.getNamespace());
                }
                if (!Intrinsics.areEqual(value.getWorker_node(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getWorker_node());
                }
                if (!Intrinsics.areEqual(value.getWorker_pod(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(19, value.getWorker_pod());
                }
                if (!Intrinsics.areEqual(value.getAction_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(20, value.getAction_id());
                }
                if (!Intrinsics.areEqual(value.getTool_invocation_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(21, value.getTool_invocation_id());
                }
                return !Intrinsics.areEqual(value.getDirectory(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(22, value.getDirectory()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CompletedActionMetadataEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCorrelated_invocations_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCorrelated_invocations_id());
                }
                if (!Intrinsics.areEqual(value.getTarget_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTarget_id());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUuid());
                }
                if (!Intrinsics.areEqual(value.getAction_mnemonic(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAction_mnemonic());
                }
                if (value.getIs_stamped()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) java.lang.Boolean.valueOf(value.getIs_stamped()));
                }
                if (value.getCached_result()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) java.lang.Boolean.valueOf(value.getCached_result()));
                }
                if (value.getExit_code() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getExit_code()));
                }
                if (value.getQueued_duration() != null) {
                    ProtoAdapter.DURATION.encodeWithTag(writer, 8, (int) value.getQueued_duration());
                }
                if (value.getTotal_worker_duration() != null) {
                    ProtoAdapter.DURATION.encodeWithTag(writer, 9, (int) value.getTotal_worker_duration());
                }
                if (value.getExecution_duration() != null) {
                    ProtoAdapter.DURATION.encodeWithTag(writer, 10, (int) value.getExecution_duration());
                }
                if (value.getInput_fetch_duration() != null) {
                    ProtoAdapter.DURATION.encodeWithTag(writer, 11, (int) value.getInput_fetch_duration());
                }
                if (value.getOutput_upload_duration() != null) {
                    ProtoAdapter.DURATION.encodeWithTag(writer, 12, (int) value.getOutput_upload_duration());
                }
                if (value.getInput_files_sizes() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 13, (int) Long.valueOf(value.getInput_files_sizes()));
                }
                if (value.getOutput_files_number() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 14, (int) Long.valueOf(value.getOutput_files_number()));
                }
                if (value.getOutput_files_sizes() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 15, (int) Long.valueOf(value.getOutput_files_sizes()));
                }
                if (!Double.valueOf(value.getCost()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 16, (int) Double.valueOf(value.getCost()));
                }
                if (!Intrinsics.areEqual(value.getNamespace(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getNamespace());
                }
                if (!Intrinsics.areEqual(value.getWorker_node(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getWorker_node());
                }
                if (!Intrinsics.areEqual(value.getWorker_pod(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getWorker_pod());
                }
                if (!Intrinsics.areEqual(value.getAction_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getAction_id());
                }
                if (!Intrinsics.areEqual(value.getTool_invocation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getTool_invocation_id());
                }
                if (!Intrinsics.areEqual(value.getDirectory(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getDirectory());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CompletedActionMetadataEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDirectory(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getDirectory());
                }
                if (!Intrinsics.areEqual(value.getTool_invocation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getTool_invocation_id());
                }
                if (!Intrinsics.areEqual(value.getAction_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getAction_id());
                }
                if (!Intrinsics.areEqual(value.getWorker_pod(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getWorker_pod());
                }
                if (!Intrinsics.areEqual(value.getWorker_node(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getWorker_node());
                }
                if (!Intrinsics.areEqual(value.getNamespace(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getNamespace());
                }
                if (!Double.valueOf(value.getCost()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 16, (int) Double.valueOf(value.getCost()));
                }
                if (value.getOutput_files_sizes() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 15, (int) Long.valueOf(value.getOutput_files_sizes()));
                }
                if (value.getOutput_files_number() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 14, (int) Long.valueOf(value.getOutput_files_number()));
                }
                if (value.getInput_files_sizes() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 13, (int) Long.valueOf(value.getInput_files_sizes()));
                }
                if (value.getOutput_upload_duration() != null) {
                    ProtoAdapter.DURATION.encodeWithTag(writer, 12, (int) value.getOutput_upload_duration());
                }
                if (value.getInput_fetch_duration() != null) {
                    ProtoAdapter.DURATION.encodeWithTag(writer, 11, (int) value.getInput_fetch_duration());
                }
                if (value.getExecution_duration() != null) {
                    ProtoAdapter.DURATION.encodeWithTag(writer, 10, (int) value.getExecution_duration());
                }
                if (value.getTotal_worker_duration() != null) {
                    ProtoAdapter.DURATION.encodeWithTag(writer, 9, (int) value.getTotal_worker_duration());
                }
                if (value.getQueued_duration() != null) {
                    ProtoAdapter.DURATION.encodeWithTag(writer, 8, (int) value.getQueued_duration());
                }
                if (value.getExit_code() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getExit_code()));
                }
                if (value.getCached_result()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) java.lang.Boolean.valueOf(value.getCached_result()));
                }
                if (value.getIs_stamped()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) java.lang.Boolean.valueOf(value.getIs_stamped()));
                }
                if (!Intrinsics.areEqual(value.getAction_mnemonic(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAction_mnemonic());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUuid());
                }
                if (!Intrinsics.areEqual(value.getTarget_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTarget_id());
                }
                if (Intrinsics.areEqual(value.getCorrelated_invocations_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCorrelated_invocations_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CompletedActionMetadataEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                int iIntValue = 0;
                Duration durationDecode = null;
                Duration durationDecode2 = null;
                Duration durationDecode3 = null;
                Duration durationDecode4 = null;
                Duration durationDecode5 = null;
                long jLongValue = 0;
                long jLongValue2 = 0;
                long jLongValue3 = 0;
                double dDoubleValue = 0.0d;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode5;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 6:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 7:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 8:
                                durationDecode = ProtoAdapter.DURATION.decode(reader);
                                break;
                            case 9:
                                durationDecode2 = ProtoAdapter.DURATION.decode(reader);
                                break;
                            case 10:
                                durationDecode3 = ProtoAdapter.DURATION.decode(reader);
                                break;
                            case 11:
                                durationDecode4 = ProtoAdapter.DURATION.decode(reader);
                                break;
                            case 12:
                                durationDecode5 = ProtoAdapter.DURATION.decode(reader);
                                break;
                            case 13:
                                jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 14:
                                jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 15:
                                jLongValue3 = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 16:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 17:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 18:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 19:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 20:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 21:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 22:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode5 = str;
                    } else {
                        return new CompletedActionMetadataEvent(strDecode4, str, strDecode6, strDecode7, zBooleanValue, zBooleanValue2, iIntValue, durationDecode, durationDecode2, durationDecode3, durationDecode4, durationDecode5, jLongValue, jLongValue2, jLongValue3, dDoubleValue, strDecode8, strDecode9, strDecode10, strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CompletedActionMetadataEvent redact(CompletedActionMetadataEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Duration queued_duration = value.getQueued_duration();
                Duration durationRedact = queued_duration != null ? ProtoAdapter.DURATION.redact(queued_duration) : null;
                Duration total_worker_duration = value.getTotal_worker_duration();
                Duration durationRedact2 = total_worker_duration != null ? ProtoAdapter.DURATION.redact(total_worker_duration) : null;
                Duration execution_duration = value.getExecution_duration();
                Duration durationRedact3 = execution_duration != null ? ProtoAdapter.DURATION.redact(execution_duration) : null;
                Duration input_fetch_duration = value.getInput_fetch_duration();
                Duration durationRedact4 = input_fetch_duration != null ? ProtoAdapter.DURATION.redact(input_fetch_duration) : null;
                Duration output_upload_duration = value.getOutput_upload_duration();
                return CompletedActionMetadataEvent.copy$default(value, null, null, null, null, false, false, 0, durationRedact, durationRedact2, durationRedact3, durationRedact4, output_upload_duration != null ? ProtoAdapter.DURATION.redact(output_upload_duration) : null, 0L, 0L, 0L, 0.0d, null, null, null, null, null, null, ByteString.EMPTY, 4190335, null);
            }
        };
    }
}

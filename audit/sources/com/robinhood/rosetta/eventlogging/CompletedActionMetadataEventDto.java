package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.idl.serialization.WireDurationSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Duration;

/* compiled from: CompletedActionMetadataEventDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\"\b\u0007\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004TSUVB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u008d\u0002\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\b\b\u0002\u0010 \u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020\b\u0012\b\b\u0002\u0010\"\u001a\u00020\b\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010$\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010%J\u0091\u0002\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010,H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0010H\u0016¢\u0006\u0004\b8\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00109R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b:\u0010+R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b;\u0010+R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b<\u0010+R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b=\u0010+R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010>R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b?\u0010>R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b@\u00101R\u0019\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0019\u0010\u0015\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138F¢\u0006\u0006\u001a\u0004\bC\u0010BR\u0019\u0010\u0016\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138F¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0019\u0010\u0017\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138F¢\u0006\u0006\u001a\u0004\bE\u0010BR\u0019\u0010\u0018\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138F¢\u0006\u0006\u001a\u0004\bF\u0010BR\u0011\u0010\u001a\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bI\u0010HR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0011\u0010\u001e\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010\u001f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bM\u0010+R\u0011\u0010 \u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bN\u0010+R\u0011\u0010!\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bO\u0010+R\u0011\u0010\"\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bP\u0010+R\u0011\u0010#\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bQ\u0010+R\u0011\u0010$\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bR\u0010+¨\u0006W"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto$Surrogate;)V", "", "correlated_invocations_id", "target_id", "uuid", "action_mnemonic", "", "is_stamped", "cached_result", "", "exit_code", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "queued_duration", "total_worker_duration", "execution_duration", "input_fetch_duration", "output_upload_duration", "", "input_files_sizes", "output_files_number", "output_files_sizes", "", "cost", "namespace", "worker_node", "worker_pod", "action_id", "tool_invocation_id", "directory", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;JJJDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;JJJDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEvent;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto$Surrogate;", "getCorrelated_invocations_id", "getTarget_id", "getUuid", "getAction_mnemonic", "()Z", "getCached_result", "getExit_code", "getQueued_duration", "()Lj$/time/Duration;", "getTotal_worker_duration", "getExecution_duration", "getInput_fetch_duration", "getOutput_upload_duration", "getInput_files_sizes", "()J", "getOutput_files_number", "getOutput_files_sizes", "getCost", "()D", "getNamespace", "getWorker_node", "getWorker_pod", "getAction_id", "getTool_invocation_id", "getDirectory", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CompletedActionMetadataEventDto implements Dto3<CompletedActionMetadataEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CompletedActionMetadataEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CompletedActionMetadataEventDto, CompletedActionMetadataEvent>> binaryBase64Serializer$delegate;
    private static final CompletedActionMetadataEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CompletedActionMetadataEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CompletedActionMetadataEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getCorrelated_invocations_id() {
        return this.surrogate.getCorrelated_invocations_id();
    }

    public final String getTarget_id() {
        return this.surrogate.getTarget_id();
    }

    public final String getUuid() {
        return this.surrogate.getUuid();
    }

    public final String getAction_mnemonic() {
        return this.surrogate.getAction_mnemonic();
    }

    public final boolean is_stamped() {
        return this.surrogate.is_stamped();
    }

    public final boolean getCached_result() {
        return this.surrogate.getCached_result();
    }

    public final int getExit_code() {
        return this.surrogate.getExit_code();
    }

    public final Duration getQueued_duration() {
        return this.surrogate.getQueued_duration();
    }

    public final Duration getTotal_worker_duration() {
        return this.surrogate.getTotal_worker_duration();
    }

    public final Duration getExecution_duration() {
        return this.surrogate.getExecution_duration();
    }

    public final Duration getInput_fetch_duration() {
        return this.surrogate.getInput_fetch_duration();
    }

    public final Duration getOutput_upload_duration() {
        return this.surrogate.getOutput_upload_duration();
    }

    public final long getInput_files_sizes() {
        return this.surrogate.getInput_files_sizes();
    }

    public final long getOutput_files_number() {
        return this.surrogate.getOutput_files_number();
    }

    public final long getOutput_files_sizes() {
        return this.surrogate.getOutput_files_sizes();
    }

    public final double getCost() {
        return this.surrogate.getCost();
    }

    public final String getNamespace() {
        return this.surrogate.getNamespace();
    }

    public final String getWorker_node() {
        return this.surrogate.getWorker_node();
    }

    public final String getWorker_pod() {
        return this.surrogate.getWorker_pod();
    }

    public final String getAction_id() {
        return this.surrogate.getAction_id();
    }

    public final String getTool_invocation_id() {
        return this.surrogate.getTool_invocation_id();
    }

    public final String getDirectory() {
        return this.surrogate.getDirectory();
    }

    public /* synthetic */ CompletedActionMetadataEventDto(String str, String str2, String str3, String str4, boolean z, boolean z2, int i, Duration duration, Duration duration2, Duration duration3, Duration duration4, Duration duration5, long j, long j2, long j3, double d, String str5, String str6, String str7, String str8, String str9, String str10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) == 0 ? i : 0, (i2 & 128) != 0 ? null : duration, (i2 & 256) != 0 ? null : duration2, (i2 & 512) != 0 ? null : duration3, (i2 & 1024) != 0 ? null : duration4, (i2 & 2048) == 0 ? duration5 : null, (i2 & 4096) != 0 ? 0L : j, (i2 & 8192) != 0 ? 0L : j2, (i2 & 16384) == 0 ? j3 : 0L, (32768 & i2) != 0 ? 0.0d : d, (65536 & i2) != 0 ? "" : str5, (i2 & 131072) != 0 ? "" : str6, (i2 & 262144) != 0 ? "" : str7, (i2 & 524288) != 0 ? "" : str8, (i2 & 1048576) != 0 ? "" : str9, (i2 & 2097152) != 0 ? "" : str10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompletedActionMetadataEventDto(String correlated_invocations_id, String target_id, String uuid, String action_mnemonic, boolean z, boolean z2, int i, Duration duration, Duration duration2, Duration duration3, Duration duration4, Duration duration5, long j, long j2, long j3, double d, String namespace, String worker_node, String worker_pod, String action_id, String tool_invocation_id, String directory) {
        this(new Surrogate(correlated_invocations_id, target_id, uuid, action_mnemonic, z, z2, i, duration, duration2, duration3, duration4, duration5, j, j2, j3, d, namespace, worker_node, worker_pod, action_id, tool_invocation_id, directory));
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
    }

    public static /* synthetic */ CompletedActionMetadataEventDto copy$default(CompletedActionMetadataEventDto completedActionMetadataEventDto, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, Duration duration, Duration duration2, Duration duration3, Duration duration4, Duration duration5, long j, long j2, long j3, double d, String str5, String str6, String str7, String str8, String str9, String str10, int i2, Object obj) {
        String directory;
        String str11;
        String correlated_invocations_id = (i2 & 1) != 0 ? completedActionMetadataEventDto.surrogate.getCorrelated_invocations_id() : str;
        String target_id = (i2 & 2) != 0 ? completedActionMetadataEventDto.surrogate.getTarget_id() : str2;
        String uuid = (i2 & 4) != 0 ? completedActionMetadataEventDto.surrogate.getUuid() : str3;
        String action_mnemonic = (i2 & 8) != 0 ? completedActionMetadataEventDto.surrogate.getAction_mnemonic() : str4;
        boolean zIs_stamped = (i2 & 16) != 0 ? completedActionMetadataEventDto.surrogate.is_stamped() : z;
        boolean cached_result = (i2 & 32) != 0 ? completedActionMetadataEventDto.surrogate.getCached_result() : z2;
        int exit_code = (i2 & 64) != 0 ? completedActionMetadataEventDto.surrogate.getExit_code() : i;
        Duration queued_duration = (i2 & 128) != 0 ? completedActionMetadataEventDto.surrogate.getQueued_duration() : duration;
        Duration total_worker_duration = (i2 & 256) != 0 ? completedActionMetadataEventDto.surrogate.getTotal_worker_duration() : duration2;
        Duration execution_duration = (i2 & 512) != 0 ? completedActionMetadataEventDto.surrogate.getExecution_duration() : duration3;
        Duration input_fetch_duration = (i2 & 1024) != 0 ? completedActionMetadataEventDto.surrogate.getInput_fetch_duration() : duration4;
        Duration output_upload_duration = (i2 & 2048) != 0 ? completedActionMetadataEventDto.surrogate.getOutput_upload_duration() : duration5;
        long input_files_sizes = (i2 & 4096) != 0 ? completedActionMetadataEventDto.surrogate.getInput_files_sizes() : j;
        String str12 = correlated_invocations_id;
        long output_files_number = (i2 & 8192) != 0 ? completedActionMetadataEventDto.surrogate.getOutput_files_number() : j2;
        long output_files_sizes = (i2 & 16384) != 0 ? completedActionMetadataEventDto.surrogate.getOutput_files_sizes() : j3;
        double cost = (32768 & i2) != 0 ? completedActionMetadataEventDto.surrogate.getCost() : d;
        String namespace = (65536 & i2) != 0 ? completedActionMetadataEventDto.surrogate.getNamespace() : str5;
        String worker_node = (i2 & 131072) != 0 ? completedActionMetadataEventDto.surrogate.getWorker_node() : str6;
        String worker_pod = (i2 & 262144) != 0 ? completedActionMetadataEventDto.surrogate.getWorker_pod() : str7;
        String action_id = (i2 & 524288) != 0 ? completedActionMetadataEventDto.surrogate.getAction_id() : str8;
        String tool_invocation_id = (i2 & 1048576) != 0 ? completedActionMetadataEventDto.surrogate.getTool_invocation_id() : str9;
        if ((i2 & 2097152) != 0) {
            str11 = tool_invocation_id;
            directory = completedActionMetadataEventDto.surrogate.getDirectory();
        } else {
            directory = str10;
            str11 = tool_invocation_id;
        }
        return completedActionMetadataEventDto.copy(str12, target_id, uuid, action_mnemonic, zIs_stamped, cached_result, exit_code, queued_duration, total_worker_duration, execution_duration, input_fetch_duration, output_upload_duration, input_files_sizes, output_files_number, output_files_sizes, cost, namespace, worker_node, worker_pod, action_id, str11, directory);
    }

    public final CompletedActionMetadataEventDto copy(String correlated_invocations_id, String target_id, String uuid, String action_mnemonic, boolean is_stamped, boolean cached_result, int exit_code, Duration queued_duration, Duration total_worker_duration, Duration execution_duration, Duration input_fetch_duration, Duration output_upload_duration, long input_files_sizes, long output_files_number, long output_files_sizes, double cost, String namespace, String worker_node, String worker_pod, String action_id, String tool_invocation_id, String directory) {
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
        return new CompletedActionMetadataEventDto(new Surrogate(correlated_invocations_id, target_id, uuid, action_mnemonic, is_stamped, cached_result, exit_code, queued_duration, total_worker_duration, execution_duration, input_fetch_duration, output_upload_duration, input_files_sizes, output_files_number, output_files_sizes, cost, namespace, worker_node, worker_pod, action_id, tool_invocation_id, directory));
    }

    @Override // com.robinhood.idl.Dto
    public CompletedActionMetadataEvent toProto() {
        return new CompletedActionMetadataEvent(this.surrogate.getCorrelated_invocations_id(), this.surrogate.getTarget_id(), this.surrogate.getUuid(), this.surrogate.getAction_mnemonic(), this.surrogate.is_stamped(), this.surrogate.getCached_result(), this.surrogate.getExit_code(), this.surrogate.getQueued_duration(), this.surrogate.getTotal_worker_duration(), this.surrogate.getExecution_duration(), this.surrogate.getInput_fetch_duration(), this.surrogate.getOutput_upload_duration(), this.surrogate.getInput_files_sizes(), this.surrogate.getOutput_files_number(), this.surrogate.getOutput_files_sizes(), this.surrogate.getCost(), this.surrogate.getNamespace(), this.surrogate.getWorker_node(), this.surrogate.getWorker_pod(), this.surrogate.getAction_id(), this.surrogate.getTool_invocation_id(), this.surrogate.getDirectory(), null, 4194304, null);
    }

    public String toString() {
        return "[CompletedActionMetadataEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CompletedActionMetadataEventDto) && Intrinsics.areEqual(((CompletedActionMetadataEventDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CompletedActionMetadataEventDto.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b[\b\u0083\b\u0018\u0000 \u0089\u00012\u00020\u0001:\u0004\u008a\u0001\u0089\u0001Bì\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012.\b\u0002\u0010\u0012\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011\u0012.\b\u0002\u0010\u0013\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011\u0012.\b\u0002\u0010\u0014\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011\u0012.\b\u0002\u0010\u0015\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011\u0012.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011\u0012\u0017\b\u0002\u0010\u0019\u001a\u00110\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0018\u0012\u0017\b\u0002\u0010\u001a\u001a\u00110\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0018\u0012\u0017\b\u0002\u0010\u001b\u001a\u00110\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0018\u0012\u0017\b\u0002\u0010\u001e\u001a\u00110\u001c¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&Bé\u0001\b\u0010\u0012\u0006\u0010'\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u00105J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u00105J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u00105J\u0010\u00109\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b;\u0010:J\u001f\u0010<\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b<\u0010=J6\u0010>\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011HÆ\u0003¢\u0006\u0004\b>\u0010?J6\u0010@\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011HÆ\u0003¢\u0006\u0004\b@\u0010?J6\u0010A\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011HÆ\u0003¢\u0006\u0004\bA\u0010?J6\u0010B\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011HÆ\u0003¢\u0006\u0004\bB\u0010?J6\u0010C\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011HÆ\u0003¢\u0006\u0004\bC\u0010?J\u001f\u0010D\u001a\u00110\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0018HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00110\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0018HÆ\u0003¢\u0006\u0004\bF\u0010EJ\u001f\u0010G\u001a\u00110\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0018HÆ\u0003¢\u0006\u0004\bG\u0010EJ\u001f\u0010H\u001a\u00110\u001c¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u001dHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bJ\u00105J\u0010\u0010K\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bK\u00105J\u0010\u0010L\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bL\u00105J\u0010\u0010M\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bM\u00105J\u0010\u0010N\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bN\u00105J\u0010\u0010O\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bO\u00105Jõ\u0003\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2.\b\u0002\u0010\u0012\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00112.\b\u0002\u0010\u0013\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00112.\b\u0002\u0010\u0014\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00112.\b\u0002\u0010\u0015\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00112.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00112\u0017\b\u0002\u0010\u0019\u001a\u00110\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00182\u0017\b\u0002\u0010\u001a\u001a\u00110\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00182\u0017\b\u0002\u0010\u001b\u001a\u00110\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00182\u0017\b\u0002\u0010\u001e\u001a\u00110\u001c¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bR\u00105J\u0010\u0010S\u001a\u00020\nHÖ\u0001¢\u0006\u0004\bS\u0010=J\u001a\u0010U\u001a\u00020\u00072\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bU\u0010VR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010W\u0012\u0004\bY\u0010Z\u001a\u0004\bX\u00105R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010W\u0012\u0004\b\\\u0010Z\u001a\u0004\b[\u00105R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010W\u0012\u0004\b^\u0010Z\u001a\u0004\b]\u00105R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010W\u0012\u0004\b`\u0010Z\u001a\u0004\b_\u00105R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010a\u0012\u0004\bb\u0010Z\u001a\u0004\b\b\u0010:R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010a\u0012\u0004\bd\u0010Z\u001a\u0004\bc\u0010:R/\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010e\u0012\u0004\bg\u0010Z\u001a\u0004\bf\u0010=RF\u0010\u0012\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010h\u0012\u0004\bj\u0010Z\u001a\u0004\bi\u0010?RF\u0010\u0013\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010h\u0012\u0004\bl\u0010Z\u001a\u0004\bk\u0010?RF\u0010\u0014\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010h\u0012\u0004\bn\u0010Z\u001a\u0004\bm\u0010?RF\u0010\u0015\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010h\u0012\u0004\bp\u0010Z\u001a\u0004\bo\u0010?RF\u0010\u0016\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010h\u0012\u0004\br\u0010Z\u001a\u0004\bq\u0010?R/\u0010\u0019\u001a\u00110\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010s\u0012\u0004\bu\u0010Z\u001a\u0004\bt\u0010ER/\u0010\u001a\u001a\u00110\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010s\u0012\u0004\bw\u0010Z\u001a\u0004\bv\u0010ER/\u0010\u001b\u001a\u00110\u0017¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010s\u0012\u0004\by\u0010Z\u001a\u0004\bx\u0010ER/\u0010\u001e\u001a\u00110\u001c¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010z\u0012\u0004\b|\u0010Z\u001a\u0004\b{\u0010IR \u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010W\u0012\u0004\b~\u0010Z\u001a\u0004\b}\u00105R!\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b \u0010W\u0012\u0005\b\u0080\u0001\u0010Z\u001a\u0004\b\u007f\u00105R\"\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b!\u0010W\u0012\u0005\b\u0082\u0001\u0010Z\u001a\u0005\b\u0081\u0001\u00105R\"\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\"\u0010W\u0012\u0005\b\u0084\u0001\u0010Z\u001a\u0005\b\u0083\u0001\u00105R\"\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b#\u0010W\u0012\u0005\b\u0086\u0001\u0010Z\u001a\u0005\b\u0085\u0001\u00105R\"\u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b$\u0010W\u0012\u0005\b\u0088\u0001\u0010Z\u001a\u0005\b\u0087\u0001\u00105¨\u0006\u008b\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto$Surrogate;", "", "", "correlated_invocations_id", "target_id", "uuid", "action_mnemonic", "", "is_stamped", "cached_result", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "exit_code", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "Lcom/robinhood/idl/serialization/WireDurationSerializer;", "queued_duration", "total_worker_duration", "execution_duration", "input_fetch_duration", "output_upload_duration", "", "Lcom/robinhood/idl/serialization/Int64Serializer;", "input_files_sizes", "output_files_number", "output_files_sizes", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "cost", "namespace", "worker_node", "worker_pod", "action_id", "tool_invocation_id", "directory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;JJJDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;JJJDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "component7", "()I", "component8", "()Lj$/time/Duration;", "component9", "component10", "component11", "component12", "component13", "()J", "component14", "component15", "component16", "()D", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;Lj$/time/Duration;JJJDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto$Surrogate;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCorrelated_invocations_id", "getCorrelated_invocations_id$annotations", "()V", "getTarget_id", "getTarget_id$annotations", "getUuid", "getUuid$annotations", "getAction_mnemonic", "getAction_mnemonic$annotations", "Z", "is_stamped$annotations", "getCached_result", "getCached_result$annotations", "I", "getExit_code", "getExit_code$annotations", "Lj$/time/Duration;", "getQueued_duration", "getQueued_duration$annotations", "getTotal_worker_duration", "getTotal_worker_duration$annotations", "getExecution_duration", "getExecution_duration$annotations", "getInput_fetch_duration", "getInput_fetch_duration$annotations", "getOutput_upload_duration", "getOutput_upload_duration$annotations", "J", "getInput_files_sizes", "getInput_files_sizes$annotations", "getOutput_files_number", "getOutput_files_number$annotations", "getOutput_files_sizes", "getOutput_files_sizes$annotations", "D", "getCost", "getCost$annotations", "getNamespace", "getNamespace$annotations", "getWorker_node", "getWorker_node$annotations", "getWorker_pod", "getWorker_pod$annotations", "getAction_id", "getAction_id$annotations", "getTool_invocation_id", "getTool_invocation_id$annotations", "getDirectory", "getDirectory$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String action_id;
        private final String action_mnemonic;
        private final boolean cached_result;
        private final String correlated_invocations_id;
        private final double cost;
        private final String directory;
        private final Duration execution_duration;
        private final int exit_code;
        private final Duration input_fetch_duration;
        private final long input_files_sizes;
        private final boolean is_stamped;
        private final String namespace;
        private final long output_files_number;
        private final long output_files_sizes;
        private final Duration output_upload_duration;
        private final Duration queued_duration;
        private final String target_id;
        private final String tool_invocation_id;
        private final Duration total_worker_duration;
        private final String uuid;
        private final String worker_node;
        private final String worker_pod;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, false, false, 0, (Duration) null, (Duration) null, (Duration) null, (Duration) null, (Duration) null, 0L, 0L, 0L, 0.0d, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4194303, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, Duration duration, Duration duration2, Duration duration3, Duration duration4, Duration duration5, long j, long j2, long j3, double d, String str5, String str6, String str7, String str8, String str9, String str10, int i2, Object obj) {
            String str11;
            String str12;
            String str13 = (i2 & 1) != 0 ? surrogate.correlated_invocations_id : str;
            String str14 = (i2 & 2) != 0 ? surrogate.target_id : str2;
            String str15 = (i2 & 4) != 0 ? surrogate.uuid : str3;
            String str16 = (i2 & 8) != 0 ? surrogate.action_mnemonic : str4;
            boolean z3 = (i2 & 16) != 0 ? surrogate.is_stamped : z;
            boolean z4 = (i2 & 32) != 0 ? surrogate.cached_result : z2;
            int i3 = (i2 & 64) != 0 ? surrogate.exit_code : i;
            Duration duration6 = (i2 & 128) != 0 ? surrogate.queued_duration : duration;
            Duration duration7 = (i2 & 256) != 0 ? surrogate.total_worker_duration : duration2;
            Duration duration8 = (i2 & 512) != 0 ? surrogate.execution_duration : duration3;
            Duration duration9 = (i2 & 1024) != 0 ? surrogate.input_fetch_duration : duration4;
            Duration duration10 = (i2 & 2048) != 0 ? surrogate.output_upload_duration : duration5;
            long j4 = (i2 & 4096) != 0 ? surrogate.input_files_sizes : j;
            String str17 = str13;
            String str18 = str14;
            long j5 = (i2 & 8192) != 0 ? surrogate.output_files_number : j2;
            long j6 = (i2 & 16384) != 0 ? surrogate.output_files_sizes : j3;
            double d2 = (i2 & 32768) != 0 ? surrogate.cost : d;
            String str19 = (i2 & 65536) != 0 ? surrogate.namespace : str5;
            double d3 = d2;
            String str20 = (i2 & 131072) != 0 ? surrogate.worker_node : str6;
            String str21 = (i2 & 262144) != 0 ? surrogate.worker_pod : str7;
            String str22 = str20;
            String str23 = (i2 & 524288) != 0 ? surrogate.action_id : str8;
            String str24 = (i2 & 1048576) != 0 ? surrogate.tool_invocation_id : str9;
            if ((i2 & 2097152) != 0) {
                str12 = str24;
                str11 = surrogate.directory;
            } else {
                str11 = str10;
                str12 = str24;
            }
            return surrogate.copy(str17, str18, str15, str16, z3, z4, i3, duration6, duration7, duration8, duration9, duration10, j4, j5, j6, d3, str19, str22, str21, str23, str12, str11);
        }

        @SerialName("actionId")
        @JsonAnnotations2(names = {"action_id"})
        public static /* synthetic */ void getAction_id$annotations() {
        }

        @SerialName("actionMnemonic")
        @JsonAnnotations2(names = {"action_mnemonic"})
        public static /* synthetic */ void getAction_mnemonic$annotations() {
        }

        @SerialName("cachedResult")
        @JsonAnnotations2(names = {"cached_result"})
        public static /* synthetic */ void getCached_result$annotations() {
        }

        @SerialName("correlatedInvocationsId")
        @JsonAnnotations2(names = {"correlated_invocations_id"})
        public static /* synthetic */ void getCorrelated_invocations_id$annotations() {
        }

        @SerialName("cost")
        @JsonAnnotations2(names = {"cost"})
        public static /* synthetic */ void getCost$annotations() {
        }

        @SerialName("directory")
        @JsonAnnotations2(names = {"directory"})
        public static /* synthetic */ void getDirectory$annotations() {
        }

        @SerialName("executionDuration")
        @JsonAnnotations2(names = {"execution_duration"})
        public static /* synthetic */ void getExecution_duration$annotations() {
        }

        @SerialName("exitCode")
        @JsonAnnotations2(names = {"exit_code"})
        public static /* synthetic */ void getExit_code$annotations() {
        }

        @SerialName("inputFetchDuration")
        @JsonAnnotations2(names = {"input_fetch_duration"})
        public static /* synthetic */ void getInput_fetch_duration$annotations() {
        }

        @SerialName("inputFilesSizes")
        @JsonAnnotations2(names = {"input_files_sizes"})
        public static /* synthetic */ void getInput_files_sizes$annotations() {
        }

        @SerialName("namespace")
        @JsonAnnotations2(names = {"namespace"})
        public static /* synthetic */ void getNamespace$annotations() {
        }

        @SerialName("outputFilesNumber")
        @JsonAnnotations2(names = {"output_files_number"})
        public static /* synthetic */ void getOutput_files_number$annotations() {
        }

        @SerialName("outputFilesSizes")
        @JsonAnnotations2(names = {"output_files_sizes"})
        public static /* synthetic */ void getOutput_files_sizes$annotations() {
        }

        @SerialName("outputUploadDuration")
        @JsonAnnotations2(names = {"output_upload_duration"})
        public static /* synthetic */ void getOutput_upload_duration$annotations() {
        }

        @SerialName("queuedDuration")
        @JsonAnnotations2(names = {"queued_duration"})
        public static /* synthetic */ void getQueued_duration$annotations() {
        }

        @SerialName("targetId")
        @JsonAnnotations2(names = {"target_id"})
        public static /* synthetic */ void getTarget_id$annotations() {
        }

        @SerialName("toolInvocationId")
        @JsonAnnotations2(names = {"tool_invocation_id"})
        public static /* synthetic */ void getTool_invocation_id$annotations() {
        }

        @SerialName("totalWorkerDuration")
        @JsonAnnotations2(names = {"total_worker_duration"})
        public static /* synthetic */ void getTotal_worker_duration$annotations() {
        }

        @SerialName("uuid")
        @JsonAnnotations2(names = {"uuid"})
        public static /* synthetic */ void getUuid$annotations() {
        }

        @SerialName("workerNode")
        @JsonAnnotations2(names = {"worker_node"})
        public static /* synthetic */ void getWorker_node$annotations() {
        }

        @SerialName("workerPod")
        @JsonAnnotations2(names = {"worker_pod"})
        public static /* synthetic */ void getWorker_pod$annotations() {
        }

        @SerialName("isStamped")
        @JsonAnnotations2(names = {"is_stamped"})
        public static /* synthetic */ void is_stamped$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getCorrelated_invocations_id() {
            return this.correlated_invocations_id;
        }

        /* renamed from: component10, reason: from getter */
        public final Duration getExecution_duration() {
            return this.execution_duration;
        }

        /* renamed from: component11, reason: from getter */
        public final Duration getInput_fetch_duration() {
            return this.input_fetch_duration;
        }

        /* renamed from: component12, reason: from getter */
        public final Duration getOutput_upload_duration() {
            return this.output_upload_duration;
        }

        /* renamed from: component13, reason: from getter */
        public final long getInput_files_sizes() {
            return this.input_files_sizes;
        }

        /* renamed from: component14, reason: from getter */
        public final long getOutput_files_number() {
            return this.output_files_number;
        }

        /* renamed from: component15, reason: from getter */
        public final long getOutput_files_sizes() {
            return this.output_files_sizes;
        }

        /* renamed from: component16, reason: from getter */
        public final double getCost() {
            return this.cost;
        }

        /* renamed from: component17, reason: from getter */
        public final String getNamespace() {
            return this.namespace;
        }

        /* renamed from: component18, reason: from getter */
        public final String getWorker_node() {
            return this.worker_node;
        }

        /* renamed from: component19, reason: from getter */
        public final String getWorker_pod() {
            return this.worker_pod;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTarget_id() {
            return this.target_id;
        }

        /* renamed from: component20, reason: from getter */
        public final String getAction_id() {
            return this.action_id;
        }

        /* renamed from: component21, reason: from getter */
        public final String getTool_invocation_id() {
            return this.tool_invocation_id;
        }

        /* renamed from: component22, reason: from getter */
        public final String getDirectory() {
            return this.directory;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAction_mnemonic() {
            return this.action_mnemonic;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIs_stamped() {
            return this.is_stamped;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getCached_result() {
            return this.cached_result;
        }

        /* renamed from: component7, reason: from getter */
        public final int getExit_code() {
            return this.exit_code;
        }

        /* renamed from: component8, reason: from getter */
        public final Duration getQueued_duration() {
            return this.queued_duration;
        }

        /* renamed from: component9, reason: from getter */
        public final Duration getTotal_worker_duration() {
            return this.total_worker_duration;
        }

        public final Surrogate copy(String correlated_invocations_id, String target_id, String uuid, String action_mnemonic, boolean is_stamped, boolean cached_result, int exit_code, Duration queued_duration, Duration total_worker_duration, Duration execution_duration, Duration input_fetch_duration, Duration output_upload_duration, long input_files_sizes, long output_files_number, long output_files_sizes, double cost, String namespace, String worker_node, String worker_pod, String action_id, String tool_invocation_id, String directory) {
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
            return new Surrogate(correlated_invocations_id, target_id, uuid, action_mnemonic, is_stamped, cached_result, exit_code, queued_duration, total_worker_duration, execution_duration, input_fetch_duration, output_upload_duration, input_files_sizes, output_files_number, output_files_sizes, cost, namespace, worker_node, worker_pod, action_id, tool_invocation_id, directory);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.correlated_invocations_id, surrogate.correlated_invocations_id) && Intrinsics.areEqual(this.target_id, surrogate.target_id) && Intrinsics.areEqual(this.uuid, surrogate.uuid) && Intrinsics.areEqual(this.action_mnemonic, surrogate.action_mnemonic) && this.is_stamped == surrogate.is_stamped && this.cached_result == surrogate.cached_result && this.exit_code == surrogate.exit_code && Intrinsics.areEqual(this.queued_duration, surrogate.queued_duration) && Intrinsics.areEqual(this.total_worker_duration, surrogate.total_worker_duration) && Intrinsics.areEqual(this.execution_duration, surrogate.execution_duration) && Intrinsics.areEqual(this.input_fetch_duration, surrogate.input_fetch_duration) && Intrinsics.areEqual(this.output_upload_duration, surrogate.output_upload_duration) && this.input_files_sizes == surrogate.input_files_sizes && this.output_files_number == surrogate.output_files_number && this.output_files_sizes == surrogate.output_files_sizes && Double.compare(this.cost, surrogate.cost) == 0 && Intrinsics.areEqual(this.namespace, surrogate.namespace) && Intrinsics.areEqual(this.worker_node, surrogate.worker_node) && Intrinsics.areEqual(this.worker_pod, surrogate.worker_pod) && Intrinsics.areEqual(this.action_id, surrogate.action_id) && Intrinsics.areEqual(this.tool_invocation_id, surrogate.tool_invocation_id) && Intrinsics.areEqual(this.directory, surrogate.directory);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.correlated_invocations_id.hashCode() * 31) + this.target_id.hashCode()) * 31) + this.uuid.hashCode()) * 31) + this.action_mnemonic.hashCode()) * 31) + java.lang.Boolean.hashCode(this.is_stamped)) * 31) + java.lang.Boolean.hashCode(this.cached_result)) * 31) + Integer.hashCode(this.exit_code)) * 31;
            Duration duration = this.queued_duration;
            int iHashCode2 = (iHashCode + (duration == null ? 0 : duration.hashCode())) * 31;
            Duration duration2 = this.total_worker_duration;
            int iHashCode3 = (iHashCode2 + (duration2 == null ? 0 : duration2.hashCode())) * 31;
            Duration duration3 = this.execution_duration;
            int iHashCode4 = (iHashCode3 + (duration3 == null ? 0 : duration3.hashCode())) * 31;
            Duration duration4 = this.input_fetch_duration;
            int iHashCode5 = (iHashCode4 + (duration4 == null ? 0 : duration4.hashCode())) * 31;
            Duration duration5 = this.output_upload_duration;
            return ((((((((((((((((((((iHashCode5 + (duration5 != null ? duration5.hashCode() : 0)) * 31) + Long.hashCode(this.input_files_sizes)) * 31) + Long.hashCode(this.output_files_number)) * 31) + Long.hashCode(this.output_files_sizes)) * 31) + Double.hashCode(this.cost)) * 31) + this.namespace.hashCode()) * 31) + this.worker_node.hashCode()) * 31) + this.worker_pod.hashCode()) * 31) + this.action_id.hashCode()) * 31) + this.tool_invocation_id.hashCode()) * 31) + this.directory.hashCode();
        }

        public String toString() {
            return "Surrogate(correlated_invocations_id=" + this.correlated_invocations_id + ", target_id=" + this.target_id + ", uuid=" + this.uuid + ", action_mnemonic=" + this.action_mnemonic + ", is_stamped=" + this.is_stamped + ", cached_result=" + this.cached_result + ", exit_code=" + this.exit_code + ", queued_duration=" + this.queued_duration + ", total_worker_duration=" + this.total_worker_duration + ", execution_duration=" + this.execution_duration + ", input_fetch_duration=" + this.input_fetch_duration + ", output_upload_duration=" + this.output_upload_duration + ", input_files_sizes=" + this.input_files_sizes + ", output_files_number=" + this.output_files_number + ", output_files_sizes=" + this.output_files_sizes + ", cost=" + this.cost + ", namespace=" + this.namespace + ", worker_node=" + this.worker_node + ", worker_pod=" + this.worker_pod + ", action_id=" + this.action_id + ", tool_invocation_id=" + this.tool_invocation_id + ", directory=" + this.directory + ")";
        }

        /* compiled from: CompletedActionMetadataEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CompletedActionMetadataEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, int i2, Duration duration, Duration duration2, Duration duration3, Duration duration4, Duration duration5, long j, long j2, long j3, double d, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.correlated_invocations_id = "";
            } else {
                this.correlated_invocations_id = str;
            }
            if ((i & 2) == 0) {
                this.target_id = "";
            } else {
                this.target_id = str2;
            }
            if ((i & 4) == 0) {
                this.uuid = "";
            } else {
                this.uuid = str3;
            }
            if ((i & 8) == 0) {
                this.action_mnemonic = "";
            } else {
                this.action_mnemonic = str4;
            }
            if ((i & 16) == 0) {
                this.is_stamped = false;
            } else {
                this.is_stamped = z;
            }
            if ((i & 32) == 0) {
                this.cached_result = false;
            } else {
                this.cached_result = z2;
            }
            if ((i & 64) == 0) {
                this.exit_code = 0;
            } else {
                this.exit_code = i2;
            }
            if ((i & 128) == 0) {
                this.queued_duration = null;
            } else {
                this.queued_duration = duration;
            }
            if ((i & 256) == 0) {
                this.total_worker_duration = null;
            } else {
                this.total_worker_duration = duration2;
            }
            if ((i & 512) == 0) {
                this.execution_duration = null;
            } else {
                this.execution_duration = duration3;
            }
            if ((i & 1024) == 0) {
                this.input_fetch_duration = null;
            } else {
                this.input_fetch_duration = duration4;
            }
            if ((i & 2048) == 0) {
                this.output_upload_duration = null;
            } else {
                this.output_upload_duration = duration5;
            }
            if ((i & 4096) == 0) {
                this.input_files_sizes = 0L;
            } else {
                this.input_files_sizes = j;
            }
            if ((i & 8192) == 0) {
                this.output_files_number = 0L;
            } else {
                this.output_files_number = j2;
            }
            if ((i & 16384) == 0) {
                this.output_files_sizes = 0L;
            } else {
                this.output_files_sizes = j3;
            }
            this.cost = (32768 & i) == 0 ? 0.0d : d;
            if ((65536 & i) == 0) {
                this.namespace = "";
            } else {
                this.namespace = str5;
            }
            if ((131072 & i) == 0) {
                this.worker_node = "";
            } else {
                this.worker_node = str6;
            }
            if ((262144 & i) == 0) {
                this.worker_pod = "";
            } else {
                this.worker_pod = str7;
            }
            if ((524288 & i) == 0) {
                this.action_id = "";
            } else {
                this.action_id = str8;
            }
            if ((1048576 & i) == 0) {
                this.tool_invocation_id = "";
            } else {
                this.tool_invocation_id = str9;
            }
            if ((i & 2097152) == 0) {
                this.directory = "";
            } else {
                this.directory = str10;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.correlated_invocations_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.correlated_invocations_id);
            }
            if (!Intrinsics.areEqual(self.target_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.target_id);
            }
            if (!Intrinsics.areEqual(self.uuid, "")) {
                output.encodeStringElement(serialDesc, 2, self.uuid);
            }
            if (!Intrinsics.areEqual(self.action_mnemonic, "")) {
                output.encodeStringElement(serialDesc, 3, self.action_mnemonic);
            }
            boolean z = self.is_stamped;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
            boolean z2 = self.cached_result;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 5, z2);
            }
            int i = self.exit_code;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            Duration duration = self.queued_duration;
            if (duration != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, WireDurationSerializer.INSTANCE, duration);
            }
            Duration duration2 = self.total_worker_duration;
            if (duration2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, WireDurationSerializer.INSTANCE, duration2);
            }
            Duration duration3 = self.execution_duration;
            if (duration3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, WireDurationSerializer.INSTANCE, duration3);
            }
            Duration duration4 = self.input_fetch_duration;
            if (duration4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, WireDurationSerializer.INSTANCE, duration4);
            }
            Duration duration5 = self.output_upload_duration;
            if (duration5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, WireDurationSerializer.INSTANCE, duration5);
            }
            long j = self.input_files_sizes;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 12, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            long j2 = self.output_files_number;
            if (j2 != 0) {
                output.encodeSerializableElement(serialDesc, 13, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j2));
            }
            long j3 = self.output_files_sizes;
            if (j3 != 0) {
                output.encodeSerializableElement(serialDesc, 14, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j3));
            }
            if (Double.compare(self.cost, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 15, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.cost));
            }
            if (!Intrinsics.areEqual(self.namespace, "")) {
                output.encodeStringElement(serialDesc, 16, self.namespace);
            }
            if (!Intrinsics.areEqual(self.worker_node, "")) {
                output.encodeStringElement(serialDesc, 17, self.worker_node);
            }
            if (!Intrinsics.areEqual(self.worker_pod, "")) {
                output.encodeStringElement(serialDesc, 18, self.worker_pod);
            }
            if (!Intrinsics.areEqual(self.action_id, "")) {
                output.encodeStringElement(serialDesc, 19, self.action_id);
            }
            if (!Intrinsics.areEqual(self.tool_invocation_id, "")) {
                output.encodeStringElement(serialDesc, 20, self.tool_invocation_id);
            }
            if (Intrinsics.areEqual(self.directory, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 21, self.directory);
        }

        public Surrogate(String correlated_invocations_id, String target_id, String uuid, String action_mnemonic, boolean z, boolean z2, int i, Duration duration, Duration duration2, Duration duration3, Duration duration4, Duration duration5, long j, long j2, long j3, double d, String namespace, String worker_node, String worker_pod, String action_id, String tool_invocation_id, String directory) {
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

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, boolean z, boolean z2, int i, Duration duration, Duration duration2, Duration duration3, Duration duration4, Duration duration5, long j, long j2, long j3, double d, String str5, String str6, String str7, String str8, String str9, String str10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) == 0 ? i : 0, (i2 & 128) != 0 ? null : duration, (i2 & 256) != 0 ? null : duration2, (i2 & 512) != 0 ? null : duration3, (i2 & 1024) != 0 ? null : duration4, (i2 & 2048) == 0 ? duration5 : null, (i2 & 4096) != 0 ? 0L : j, (i2 & 8192) != 0 ? 0L : j2, (i2 & 16384) == 0 ? j3 : 0L, (32768 & i2) != 0 ? 0.0d : d, (65536 & i2) != 0 ? "" : str5, (i2 & 131072) != 0 ? "" : str6, (i2 & 262144) != 0 ? "" : str7, (i2 & 524288) != 0 ? "" : str8, (i2 & 1048576) != 0 ? "" : str9, (i2 & 2097152) != 0 ? "" : str10);
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

        public final boolean is_stamped() {
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
    }

    /* compiled from: CompletedActionMetadataEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto;", "Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CompletedActionMetadataEventDto, CompletedActionMetadataEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CompletedActionMetadataEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CompletedActionMetadataEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CompletedActionMetadataEventDto> getBinaryBase64Serializer() {
            return (KSerializer) CompletedActionMetadataEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CompletedActionMetadataEvent> getProtoAdapter() {
            return CompletedActionMetadataEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CompletedActionMetadataEventDto getZeroValue() {
            return CompletedActionMetadataEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CompletedActionMetadataEventDto fromProto(CompletedActionMetadataEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CompletedActionMetadataEventDto(new Surrogate(proto.getCorrelated_invocations_id(), proto.getTarget_id(), proto.getUuid(), proto.getAction_mnemonic(), proto.getIs_stamped(), proto.getCached_result(), proto.getExit_code(), proto.getQueued_duration(), proto.getTotal_worker_duration(), proto.getExecution_duration(), proto.getInput_fetch_duration(), proto.getOutput_upload_duration(), proto.getInput_files_sizes(), proto.getOutput_files_number(), proto.getOutput_files_sizes(), proto.getCost(), proto.getNamespace(), proto.getWorker_node(), proto.getWorker_pod(), proto.getAction_id(), proto.getTool_invocation_id(), proto.getDirectory()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CompletedActionMetadataEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CompletedActionMetadataEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CompletedActionMetadataEventDto(null, null, null, null, false, false, 0, null, null, null, null, null, 0L, 0L, 0L, 0.0d, null, null, null, null, null, null, 4194303, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CompletedActionMetadataEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CompletedActionMetadataEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CompletedActionMetadataEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CompletedActionMetadataEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CompletedActionMetadataEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CompletedActionMetadataEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CompletedActionMetadataEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CompletedActionMetadataEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CompletedActionMetadataEventDto";
        }
    }
}

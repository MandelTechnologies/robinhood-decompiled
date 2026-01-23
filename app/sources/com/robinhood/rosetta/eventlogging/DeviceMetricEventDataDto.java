package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.DeviceMetricEventData;
import com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto;
import com.singular.sdk.internal.Constants;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
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
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: DeviceMetricEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b/\b\u0007\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000fXWYZ[\\]^_`abcdeB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B±\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b\u0006\u0010%Jµ\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,H\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000201H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000201H\u0016¢\u0006\u0004\b:\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0013\u0010 \u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010\"\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010$\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bV\u0010+¨\u0006f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$Surrogate;)V", "", "duration_seconds", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;", "app_state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto;", "runtime", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto;", "cpu", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto;", "gpu", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto;", "memory", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto;", "disk", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto;", "network", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto;", "responsiveness", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto;", "launch_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto;", "exit_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto;", "display_metrics", "", "additional_info", "(DLcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto;Ljava/lang/String;)V", "copy", "(DLcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$Surrogate;", "getDuration_seconds", "()D", "getApp_state", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;", "getTimestamp", "()Lj$/time/Instant;", "getRuntime", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto;", "getCpu", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto;", "getGpu", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto;", "getMemory", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto;", "getDisk", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto;", "getNetwork", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto;", "getResponsiveness", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto;", "getLaunch_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto;", "getExit_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto;", "getDisplay_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto;", "getAdditional_info", "Companion", "Surrogate", "AppStateDto", "RuntimeMetricsDto", "CpuMetricsDto", "GpuMetricsDto", "MemoryMetricsDto", "DiskMetricsDto", "NetworkMetricsDto", "ResponsivenessMetricsDto", "LaunchMetricsDto", "ExitMetricsDto", "DisplayMetricsDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class DeviceMetricEventDataDto implements Dto3<DeviceMetricEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DeviceMetricEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DeviceMetricEventDataDto, DeviceMetricEventData>> binaryBase64Serializer$delegate;
    private static final DeviceMetricEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DeviceMetricEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DeviceMetricEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final double getDuration_seconds() {
        return this.surrogate.getDuration_seconds();
    }

    public final AppStateDto getApp_state() {
        return this.surrogate.getApp_state();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final RuntimeMetricsDto getRuntime() {
        return this.surrogate.getRuntime();
    }

    public final CpuMetricsDto getCpu() {
        return this.surrogate.getCpu();
    }

    public final GpuMetricsDto getGpu() {
        return this.surrogate.getGpu();
    }

    public final MemoryMetricsDto getMemory() {
        return this.surrogate.getMemory();
    }

    public final DiskMetricsDto getDisk() {
        return this.surrogate.getDisk();
    }

    public final NetworkMetricsDto getNetwork() {
        return this.surrogate.getNetwork();
    }

    public final ResponsivenessMetricsDto getResponsiveness() {
        return this.surrogate.getResponsiveness();
    }

    public final LaunchMetricsDto getLaunch_metrics() {
        return this.surrogate.getLaunch_metrics();
    }

    public final ExitMetricsDto getExit_metrics() {
        return this.surrogate.getExit_metrics();
    }

    public final DisplayMetricsDto getDisplay_metrics() {
        return this.surrogate.getDisplay_metrics();
    }

    public final String getAdditional_info() {
        return this.surrogate.getAdditional_info();
    }

    public /* synthetic */ DeviceMetricEventDataDto(double d, AppStateDto appStateDto, Instant instant, RuntimeMetricsDto runtimeMetricsDto, CpuMetricsDto cpuMetricsDto, GpuMetricsDto gpuMetricsDto, MemoryMetricsDto memoryMetricsDto, DiskMetricsDto diskMetricsDto, NetworkMetricsDto networkMetricsDto, ResponsivenessMetricsDto responsivenessMetricsDto, LaunchMetricsDto launchMetricsDto, ExitMetricsDto exitMetricsDto, DisplayMetricsDto displayMetricsDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? AppStateDto.INSTANCE.getZeroValue() : appStateDto, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : runtimeMetricsDto, (i & 16) != 0 ? null : cpuMetricsDto, (i & 32) != 0 ? null : gpuMetricsDto, (i & 64) != 0 ? null : memoryMetricsDto, (i & 128) != 0 ? null : diskMetricsDto, (i & 256) != 0 ? null : networkMetricsDto, (i & 512) != 0 ? null : responsivenessMetricsDto, (i & 1024) != 0 ? null : launchMetricsDto, (i & 2048) != 0 ? null : exitMetricsDto, (i & 4096) == 0 ? displayMetricsDto : null, (i & 8192) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceMetricEventDataDto(double d, AppStateDto app_state, Instant instant, RuntimeMetricsDto runtimeMetricsDto, CpuMetricsDto cpuMetricsDto, GpuMetricsDto gpuMetricsDto, MemoryMetricsDto memoryMetricsDto, DiskMetricsDto diskMetricsDto, NetworkMetricsDto networkMetricsDto, ResponsivenessMetricsDto responsivenessMetricsDto, LaunchMetricsDto launchMetricsDto, ExitMetricsDto exitMetricsDto, DisplayMetricsDto displayMetricsDto, String additional_info) {
        this(new Surrogate(d, app_state, instant, runtimeMetricsDto, cpuMetricsDto, gpuMetricsDto, memoryMetricsDto, diskMetricsDto, networkMetricsDto, responsivenessMetricsDto, launchMetricsDto, exitMetricsDto, displayMetricsDto, additional_info));
        Intrinsics.checkNotNullParameter(app_state, "app_state");
        Intrinsics.checkNotNullParameter(additional_info, "additional_info");
    }

    public final DeviceMetricEventDataDto copy(double duration_seconds, AppStateDto app_state, Instant timestamp, RuntimeMetricsDto runtime, CpuMetricsDto cpu, GpuMetricsDto gpu, MemoryMetricsDto memory, DiskMetricsDto disk, NetworkMetricsDto network, ResponsivenessMetricsDto responsiveness, LaunchMetricsDto launch_metrics, ExitMetricsDto exit_metrics, DisplayMetricsDto display_metrics, String additional_info) {
        Intrinsics.checkNotNullParameter(app_state, "app_state");
        Intrinsics.checkNotNullParameter(additional_info, "additional_info");
        return new DeviceMetricEventDataDto(new Surrogate(duration_seconds, app_state, timestamp, runtime, cpu, gpu, memory, disk, network, responsiveness, launch_metrics, exit_metrics, display_metrics, additional_info));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public DeviceMetricEventData toProto() {
        double duration_seconds = this.surrogate.getDuration_seconds();
        DeviceMetricEventData.AppState appState = (DeviceMetricEventData.AppState) this.surrogate.getApp_state().toProto();
        Instant timestamp = this.surrogate.getTimestamp();
        RuntimeMetricsDto runtime = this.surrogate.getRuntime();
        DeviceMetricEventData.RuntimeMetrics proto = runtime != null ? runtime.toProto() : null;
        CpuMetricsDto cpu = this.surrogate.getCpu();
        DeviceMetricEventData.CpuMetrics proto2 = cpu != null ? cpu.toProto() : null;
        GpuMetricsDto gpu = this.surrogate.getGpu();
        DeviceMetricEventData.GpuMetrics proto3 = gpu != null ? gpu.toProto() : null;
        MemoryMetricsDto memory = this.surrogate.getMemory();
        DeviceMetricEventData.MemoryMetrics proto4 = memory != null ? memory.toProto() : null;
        DiskMetricsDto disk = this.surrogate.getDisk();
        DeviceMetricEventData.DiskMetrics proto5 = disk != null ? disk.toProto() : null;
        NetworkMetricsDto network = this.surrogate.getNetwork();
        DeviceMetricEventData.NetworkMetrics proto6 = network != null ? network.toProto() : null;
        ResponsivenessMetricsDto responsiveness = this.surrogate.getResponsiveness();
        DeviceMetricEventData.ResponsivenessMetrics proto7 = responsiveness != null ? responsiveness.toProto() : null;
        LaunchMetricsDto launch_metrics = this.surrogate.getLaunch_metrics();
        DeviceMetricEventData.LaunchMetrics proto8 = launch_metrics != null ? launch_metrics.toProto() : null;
        ExitMetricsDto exit_metrics = this.surrogate.getExit_metrics();
        DeviceMetricEventData.ExitMetrics proto9 = exit_metrics != null ? exit_metrics.toProto() : null;
        DisplayMetricsDto display_metrics = this.surrogate.getDisplay_metrics();
        ByteString byteString = null;
        return new DeviceMetricEventData(duration_seconds, appState, timestamp, proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, display_metrics != null ? display_metrics.toProto() : null, this.surrogate.getAdditional_info(), byteString, 16384, null);
    }

    public String toString() {
        return "[DeviceMetricEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DeviceMetricEventDataDto) && Intrinsics.areEqual(((DeviceMetricEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b0\b\u0083\b\u0018\u0000 \u0083\u00012\u00020\u0001:\u0004\u0084\u0001\u0083\u0001BÜ\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012.\b\u0002\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$B¥\u0001\b\u0010\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b#\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b5\u00106J6\u00107\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020!HÆ\u0003¢\u0006\u0004\bM\u0010NJå\u0001\u0010O\u001a\u00020\u00002\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072.\b\u0002\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!HÆ\u0001¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020!HÖ\u0001¢\u0006\u0004\bQ\u0010NJ\u0010\u0010R\u001a\u00020%HÖ\u0001¢\u0006\u0004\bR\u0010SJ\u001a\u0010V\u001a\u00020U2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bV\u0010WR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010X\u0012\u0004\bZ\u0010[\u001a\u0004\bY\u00104R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\\\u0012\u0004\b^\u0010[\u001a\u0004\b]\u00106RF\u0010\f\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010_\u0012\u0004\ba\u0010[\u001a\u0004\b`\u00108R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010b\u0012\u0004\bd\u0010[\u001a\u0004\bc\u0010:R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010e\u0012\u0004\bg\u0010[\u001a\u0004\bf\u0010<R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010h\u0012\u0004\bj\u0010[\u001a\u0004\bi\u0010>R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010k\u0012\u0004\bm\u0010[\u001a\u0004\bl\u0010@R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010n\u0012\u0004\bp\u0010[\u001a\u0004\bo\u0010BR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010q\u0012\u0004\bs\u0010[\u001a\u0004\br\u0010DR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010t\u0012\u0004\bv\u0010[\u001a\u0004\bu\u0010FR\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010w\u0012\u0004\by\u0010[\u001a\u0004\bx\u0010HR\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010z\u0012\u0004\b|\u0010[\u001a\u0004\b{\u0010JR\"\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010}\u0012\u0004\b\u007f\u0010[\u001a\u0004\b~\u0010LR#\u0010\"\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\"\u0010\u0080\u0001\u0012\u0005\b\u0082\u0001\u0010[\u001a\u0005\b\u0081\u0001\u0010N¨\u0006\u0085\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "duration_seconds", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;", "app_state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto;", "runtime", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto;", "cpu", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto;", "gpu", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto;", "memory", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto;", "disk", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto;", "network", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto;", "responsiveness", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto;", "launch_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto;", "exit_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto;", "display_metrics", "", "additional_info", "<init>", "(DLcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()D", "component2", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;", "component3", "()Lj$/time/Instant;", "component4", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto;", "component5", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto;", "component6", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto;", "component7", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto;", "component8", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto;", "component9", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto;", "component10", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto;", "component11", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto;", "component12", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto;", "component13", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto;", "component14", "()Ljava/lang/String;", "copy", "(DLcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getDuration_seconds", "getDuration_seconds$annotations", "()V", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;", "getApp_state", "getApp_state$annotations", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto;", "getRuntime", "getRuntime$annotations", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto;", "getCpu", "getCpu$annotations", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto;", "getGpu", "getGpu$annotations", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto;", "getMemory", "getMemory$annotations", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto;", "getDisk", "getDisk$annotations", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto;", "getNetwork", "getNetwork$annotations", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto;", "getResponsiveness", "getResponsiveness$annotations", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto;", "getLaunch_metrics", "getLaunch_metrics$annotations", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto;", "getExit_metrics", "getExit_metrics$annotations", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto;", "getDisplay_metrics", "getDisplay_metrics$annotations", "Ljava/lang/String;", "getAdditional_info", "getAdditional_info$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String additional_info;
        private final AppStateDto app_state;
        private final CpuMetricsDto cpu;
        private final DiskMetricsDto disk;
        private final DisplayMetricsDto display_metrics;
        private final double duration_seconds;
        private final ExitMetricsDto exit_metrics;
        private final GpuMetricsDto gpu;
        private final LaunchMetricsDto launch_metrics;
        private final MemoryMetricsDto memory;
        private final NetworkMetricsDto network;
        private final ResponsivenessMetricsDto responsiveness;
        private final RuntimeMetricsDto runtime;
        private final Instant timestamp;

        public Surrogate() {
            this(0.0d, (AppStateDto) null, (Instant) null, (RuntimeMetricsDto) null, (CpuMetricsDto) null, (GpuMetricsDto) null, (MemoryMetricsDto) null, (DiskMetricsDto) null, (NetworkMetricsDto) null, (ResponsivenessMetricsDto) null, (LaunchMetricsDto) null, (ExitMetricsDto) null, (DisplayMetricsDto) null, (String) null, 16383, (DefaultConstructorMarker) null);
        }

        @SerialName("additionalInfo")
        @JsonAnnotations2(names = {"additional_info"})
        public static /* synthetic */ void getAdditional_info$annotations() {
        }

        @SerialName("appState")
        @JsonAnnotations2(names = {"app_state"})
        public static /* synthetic */ void getApp_state$annotations() {
        }

        @SerialName("cpu")
        @JsonAnnotations2(names = {"cpu"})
        public static /* synthetic */ void getCpu$annotations() {
        }

        @SerialName("disk")
        @JsonAnnotations2(names = {"disk"})
        public static /* synthetic */ void getDisk$annotations() {
        }

        @SerialName("displayMetrics")
        @JsonAnnotations2(names = {"display_metrics"})
        public static /* synthetic */ void getDisplay_metrics$annotations() {
        }

        @SerialName("durationSeconds")
        @JsonAnnotations2(names = {"duration_seconds"})
        public static /* synthetic */ void getDuration_seconds$annotations() {
        }

        @SerialName("exitMetrics")
        @JsonAnnotations2(names = {"exit_metrics"})
        public static /* synthetic */ void getExit_metrics$annotations() {
        }

        @SerialName("gpu")
        @JsonAnnotations2(names = {"gpu"})
        public static /* synthetic */ void getGpu$annotations() {
        }

        @SerialName("launchMetrics")
        @JsonAnnotations2(names = {"launch_metrics"})
        public static /* synthetic */ void getLaunch_metrics$annotations() {
        }

        @SerialName("memory")
        @JsonAnnotations2(names = {"memory"})
        public static /* synthetic */ void getMemory$annotations() {
        }

        @SerialName("network")
        @JsonAnnotations2(names = {"network"})
        public static /* synthetic */ void getNetwork$annotations() {
        }

        @SerialName("responsiveness")
        @JsonAnnotations2(names = {"responsiveness"})
        public static /* synthetic */ void getResponsiveness$annotations() {
        }

        @SerialName("runtime")
        @JsonAnnotations2(names = {"runtime"})
        public static /* synthetic */ void getRuntime$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final double getDuration_seconds() {
            return this.duration_seconds;
        }

        /* renamed from: component10, reason: from getter */
        public final ResponsivenessMetricsDto getResponsiveness() {
            return this.responsiveness;
        }

        /* renamed from: component11, reason: from getter */
        public final LaunchMetricsDto getLaunch_metrics() {
            return this.launch_metrics;
        }

        /* renamed from: component12, reason: from getter */
        public final ExitMetricsDto getExit_metrics() {
            return this.exit_metrics;
        }

        /* renamed from: component13, reason: from getter */
        public final DisplayMetricsDto getDisplay_metrics() {
            return this.display_metrics;
        }

        /* renamed from: component14, reason: from getter */
        public final String getAdditional_info() {
            return this.additional_info;
        }

        /* renamed from: component2, reason: from getter */
        public final AppStateDto getApp_state() {
            return this.app_state;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component4, reason: from getter */
        public final RuntimeMetricsDto getRuntime() {
            return this.runtime;
        }

        /* renamed from: component5, reason: from getter */
        public final CpuMetricsDto getCpu() {
            return this.cpu;
        }

        /* renamed from: component6, reason: from getter */
        public final GpuMetricsDto getGpu() {
            return this.gpu;
        }

        /* renamed from: component7, reason: from getter */
        public final MemoryMetricsDto getMemory() {
            return this.memory;
        }

        /* renamed from: component8, reason: from getter */
        public final DiskMetricsDto getDisk() {
            return this.disk;
        }

        /* renamed from: component9, reason: from getter */
        public final NetworkMetricsDto getNetwork() {
            return this.network;
        }

        public final Surrogate copy(double duration_seconds, AppStateDto app_state, Instant timestamp, RuntimeMetricsDto runtime, CpuMetricsDto cpu, GpuMetricsDto gpu, MemoryMetricsDto memory, DiskMetricsDto disk, NetworkMetricsDto network, ResponsivenessMetricsDto responsiveness, LaunchMetricsDto launch_metrics, ExitMetricsDto exit_metrics, DisplayMetricsDto display_metrics, String additional_info) {
            Intrinsics.checkNotNullParameter(app_state, "app_state");
            Intrinsics.checkNotNullParameter(additional_info, "additional_info");
            return new Surrogate(duration_seconds, app_state, timestamp, runtime, cpu, gpu, memory, disk, network, responsiveness, launch_metrics, exit_metrics, display_metrics, additional_info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Double.compare(this.duration_seconds, surrogate.duration_seconds) == 0 && this.app_state == surrogate.app_state && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.runtime, surrogate.runtime) && Intrinsics.areEqual(this.cpu, surrogate.cpu) && Intrinsics.areEqual(this.gpu, surrogate.gpu) && Intrinsics.areEqual(this.memory, surrogate.memory) && Intrinsics.areEqual(this.disk, surrogate.disk) && Intrinsics.areEqual(this.network, surrogate.network) && Intrinsics.areEqual(this.responsiveness, surrogate.responsiveness) && Intrinsics.areEqual(this.launch_metrics, surrogate.launch_metrics) && Intrinsics.areEqual(this.exit_metrics, surrogate.exit_metrics) && Intrinsics.areEqual(this.display_metrics, surrogate.display_metrics) && Intrinsics.areEqual(this.additional_info, surrogate.additional_info);
        }

        public int hashCode() {
            int iHashCode = ((Double.hashCode(this.duration_seconds) * 31) + this.app_state.hashCode()) * 31;
            Instant instant = this.timestamp;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            RuntimeMetricsDto runtimeMetricsDto = this.runtime;
            int iHashCode3 = (iHashCode2 + (runtimeMetricsDto == null ? 0 : runtimeMetricsDto.hashCode())) * 31;
            CpuMetricsDto cpuMetricsDto = this.cpu;
            int iHashCode4 = (iHashCode3 + (cpuMetricsDto == null ? 0 : cpuMetricsDto.hashCode())) * 31;
            GpuMetricsDto gpuMetricsDto = this.gpu;
            int iHashCode5 = (iHashCode4 + (gpuMetricsDto == null ? 0 : gpuMetricsDto.hashCode())) * 31;
            MemoryMetricsDto memoryMetricsDto = this.memory;
            int iHashCode6 = (iHashCode5 + (memoryMetricsDto == null ? 0 : memoryMetricsDto.hashCode())) * 31;
            DiskMetricsDto diskMetricsDto = this.disk;
            int iHashCode7 = (iHashCode6 + (diskMetricsDto == null ? 0 : diskMetricsDto.hashCode())) * 31;
            NetworkMetricsDto networkMetricsDto = this.network;
            int iHashCode8 = (iHashCode7 + (networkMetricsDto == null ? 0 : networkMetricsDto.hashCode())) * 31;
            ResponsivenessMetricsDto responsivenessMetricsDto = this.responsiveness;
            int iHashCode9 = (iHashCode8 + (responsivenessMetricsDto == null ? 0 : responsivenessMetricsDto.hashCode())) * 31;
            LaunchMetricsDto launchMetricsDto = this.launch_metrics;
            int iHashCode10 = (iHashCode9 + (launchMetricsDto == null ? 0 : launchMetricsDto.hashCode())) * 31;
            ExitMetricsDto exitMetricsDto = this.exit_metrics;
            int iHashCode11 = (iHashCode10 + (exitMetricsDto == null ? 0 : exitMetricsDto.hashCode())) * 31;
            DisplayMetricsDto displayMetricsDto = this.display_metrics;
            return ((iHashCode11 + (displayMetricsDto != null ? displayMetricsDto.hashCode() : 0)) * 31) + this.additional_info.hashCode();
        }

        public String toString() {
            return "Surrogate(duration_seconds=" + this.duration_seconds + ", app_state=" + this.app_state + ", timestamp=" + this.timestamp + ", runtime=" + this.runtime + ", cpu=" + this.cpu + ", gpu=" + this.gpu + ", memory=" + this.memory + ", disk=" + this.disk + ", network=" + this.network + ", responsiveness=" + this.responsiveness + ", launch_metrics=" + this.launch_metrics + ", exit_metrics=" + this.exit_metrics + ", display_metrics=" + this.display_metrics + ", additional_info=" + this.additional_info + ")";
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DeviceMetricEventDataDto$Surrogate$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, double d, AppStateDto appStateDto, Instant instant, RuntimeMetricsDto runtimeMetricsDto, CpuMetricsDto cpuMetricsDto, GpuMetricsDto gpuMetricsDto, MemoryMetricsDto memoryMetricsDto, DiskMetricsDto diskMetricsDto, NetworkMetricsDto networkMetricsDto, ResponsivenessMetricsDto responsivenessMetricsDto, LaunchMetricsDto launchMetricsDto, ExitMetricsDto exitMetricsDto, DisplayMetricsDto displayMetricsDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.duration_seconds = (i & 1) == 0 ? 0.0d : d;
            if ((i & 2) == 0) {
                this.app_state = AppStateDto.INSTANCE.getZeroValue();
            } else {
                this.app_state = appStateDto;
            }
            if ((i & 4) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 8) == 0) {
                this.runtime = null;
            } else {
                this.runtime = runtimeMetricsDto;
            }
            if ((i & 16) == 0) {
                this.cpu = null;
            } else {
                this.cpu = cpuMetricsDto;
            }
            if ((i & 32) == 0) {
                this.gpu = null;
            } else {
                this.gpu = gpuMetricsDto;
            }
            if ((i & 64) == 0) {
                this.memory = null;
            } else {
                this.memory = memoryMetricsDto;
            }
            if ((i & 128) == 0) {
                this.disk = null;
            } else {
                this.disk = diskMetricsDto;
            }
            if ((i & 256) == 0) {
                this.network = null;
            } else {
                this.network = networkMetricsDto;
            }
            if ((i & 512) == 0) {
                this.responsiveness = null;
            } else {
                this.responsiveness = responsivenessMetricsDto;
            }
            if ((i & 1024) == 0) {
                this.launch_metrics = null;
            } else {
                this.launch_metrics = launchMetricsDto;
            }
            if ((i & 2048) == 0) {
                this.exit_metrics = null;
            } else {
                this.exit_metrics = exitMetricsDto;
            }
            if ((i & 4096) == 0) {
                this.display_metrics = null;
            } else {
                this.display_metrics = displayMetricsDto;
            }
            this.additional_info = (i & 8192) == 0 ? "" : str;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (Double.compare(self.duration_seconds, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.duration_seconds));
            }
            if (self.app_state != AppStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, AppStateDto.Serializer.INSTANCE, self.app_state);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            RuntimeMetricsDto runtimeMetricsDto = self.runtime;
            if (runtimeMetricsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, RuntimeMetricsDto.Serializer.INSTANCE, runtimeMetricsDto);
            }
            CpuMetricsDto cpuMetricsDto = self.cpu;
            if (cpuMetricsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CpuMetricsDto.Serializer.INSTANCE, cpuMetricsDto);
            }
            GpuMetricsDto gpuMetricsDto = self.gpu;
            if (gpuMetricsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, GpuMetricsDto.Serializer.INSTANCE, gpuMetricsDto);
            }
            MemoryMetricsDto memoryMetricsDto = self.memory;
            if (memoryMetricsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MemoryMetricsDto.Serializer.INSTANCE, memoryMetricsDto);
            }
            DiskMetricsDto diskMetricsDto = self.disk;
            if (diskMetricsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, DiskMetricsDto.Serializer.INSTANCE, diskMetricsDto);
            }
            NetworkMetricsDto networkMetricsDto = self.network;
            if (networkMetricsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, NetworkMetricsDto.Serializer.INSTANCE, networkMetricsDto);
            }
            ResponsivenessMetricsDto responsivenessMetricsDto = self.responsiveness;
            if (responsivenessMetricsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, ResponsivenessMetricsDto.Serializer.INSTANCE, responsivenessMetricsDto);
            }
            LaunchMetricsDto launchMetricsDto = self.launch_metrics;
            if (launchMetricsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, LaunchMetricsDto.Serializer.INSTANCE, launchMetricsDto);
            }
            ExitMetricsDto exitMetricsDto = self.exit_metrics;
            if (exitMetricsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, ExitMetricsDto.Serializer.INSTANCE, exitMetricsDto);
            }
            DisplayMetricsDto displayMetricsDto = self.display_metrics;
            if (displayMetricsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, DisplayMetricsDto.Serializer.INSTANCE, displayMetricsDto);
            }
            if (Intrinsics.areEqual(self.additional_info, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 13, self.additional_info);
        }

        public Surrogate(double d, AppStateDto app_state, Instant instant, RuntimeMetricsDto runtimeMetricsDto, CpuMetricsDto cpuMetricsDto, GpuMetricsDto gpuMetricsDto, MemoryMetricsDto memoryMetricsDto, DiskMetricsDto diskMetricsDto, NetworkMetricsDto networkMetricsDto, ResponsivenessMetricsDto responsivenessMetricsDto, LaunchMetricsDto launchMetricsDto, ExitMetricsDto exitMetricsDto, DisplayMetricsDto displayMetricsDto, String additional_info) {
            Intrinsics.checkNotNullParameter(app_state, "app_state");
            Intrinsics.checkNotNullParameter(additional_info, "additional_info");
            this.duration_seconds = d;
            this.app_state = app_state;
            this.timestamp = instant;
            this.runtime = runtimeMetricsDto;
            this.cpu = cpuMetricsDto;
            this.gpu = gpuMetricsDto;
            this.memory = memoryMetricsDto;
            this.disk = diskMetricsDto;
            this.network = networkMetricsDto;
            this.responsiveness = responsivenessMetricsDto;
            this.launch_metrics = launchMetricsDto;
            this.exit_metrics = exitMetricsDto;
            this.display_metrics = displayMetricsDto;
            this.additional_info = additional_info;
        }

        public final double getDuration_seconds() {
            return this.duration_seconds;
        }

        public final AppStateDto getApp_state() {
            return this.app_state;
        }

        public /* synthetic */ Surrogate(double d, AppStateDto appStateDto, Instant instant, RuntimeMetricsDto runtimeMetricsDto, CpuMetricsDto cpuMetricsDto, GpuMetricsDto gpuMetricsDto, MemoryMetricsDto memoryMetricsDto, DiskMetricsDto diskMetricsDto, NetworkMetricsDto networkMetricsDto, ResponsivenessMetricsDto responsivenessMetricsDto, LaunchMetricsDto launchMetricsDto, ExitMetricsDto exitMetricsDto, DisplayMetricsDto displayMetricsDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? AppStateDto.INSTANCE.getZeroValue() : appStateDto, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : runtimeMetricsDto, (i & 16) != 0 ? null : cpuMetricsDto, (i & 32) != 0 ? null : gpuMetricsDto, (i & 64) != 0 ? null : memoryMetricsDto, (i & 128) != 0 ? null : diskMetricsDto, (i & 256) != 0 ? null : networkMetricsDto, (i & 512) != 0 ? null : responsivenessMetricsDto, (i & 1024) != 0 ? null : launchMetricsDto, (i & 2048) != 0 ? null : exitMetricsDto, (i & 4096) == 0 ? displayMetricsDto : null, (i & 8192) != 0 ? "" : str);
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final RuntimeMetricsDto getRuntime() {
            return this.runtime;
        }

        public final CpuMetricsDto getCpu() {
            return this.cpu;
        }

        public final GpuMetricsDto getGpu() {
            return this.gpu;
        }

        public final MemoryMetricsDto getMemory() {
            return this.memory;
        }

        public final DiskMetricsDto getDisk() {
            return this.disk;
        }

        public final NetworkMetricsDto getNetwork() {
            return this.network;
        }

        public final ResponsivenessMetricsDto getResponsiveness() {
            return this.responsiveness;
        }

        public final LaunchMetricsDto getLaunch_metrics() {
            return this.launch_metrics;
        }

        public final ExitMetricsDto getExit_metrics() {
            return this.exit_metrics;
        }

        public final DisplayMetricsDto getDisplay_metrics() {
            return this.display_metrics;
        }

        public final String getAdditional_info() {
            return this.additional_info;
        }
    }

    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<DeviceMetricEventDataDto, DeviceMetricEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DeviceMetricEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DeviceMetricEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DeviceMetricEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) DeviceMetricEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DeviceMetricEventData> getProtoAdapter() {
            return DeviceMetricEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DeviceMetricEventDataDto getZeroValue() {
            return DeviceMetricEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DeviceMetricEventDataDto fromProto(DeviceMetricEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            double duration_seconds = proto.getDuration_seconds();
            AppStateDto appStateDtoFromProto = AppStateDto.INSTANCE.fromProto(proto.getApp_state());
            Instant timestamp = proto.getTimestamp();
            DeviceMetricEventData.RuntimeMetrics runtime = proto.getRuntime();
            RuntimeMetricsDto runtimeMetricsDtoFromProto = runtime != null ? RuntimeMetricsDto.INSTANCE.fromProto(runtime) : null;
            DeviceMetricEventData.CpuMetrics cpu = proto.getCpu();
            CpuMetricsDto cpuMetricsDtoFromProto = cpu != null ? CpuMetricsDto.INSTANCE.fromProto(cpu) : null;
            DeviceMetricEventData.GpuMetrics gpu = proto.getGpu();
            GpuMetricsDto gpuMetricsDtoFromProto = gpu != null ? GpuMetricsDto.INSTANCE.fromProto(gpu) : null;
            DeviceMetricEventData.MemoryMetrics memory = proto.getMemory();
            MemoryMetricsDto memoryMetricsDtoFromProto = memory != null ? MemoryMetricsDto.INSTANCE.fromProto(memory) : null;
            DeviceMetricEventData.DiskMetrics disk = proto.getDisk();
            DiskMetricsDto diskMetricsDtoFromProto = disk != null ? DiskMetricsDto.INSTANCE.fromProto(disk) : null;
            DeviceMetricEventData.NetworkMetrics network = proto.getNetwork();
            NetworkMetricsDto networkMetricsDtoFromProto = network != null ? NetworkMetricsDto.INSTANCE.fromProto(network) : null;
            DeviceMetricEventData.ResponsivenessMetrics responsiveness = proto.getResponsiveness();
            ResponsivenessMetricsDto responsivenessMetricsDtoFromProto = responsiveness != null ? ResponsivenessMetricsDto.INSTANCE.fromProto(responsiveness) : null;
            DeviceMetricEventData.LaunchMetrics launch_metrics = proto.getLaunch_metrics();
            LaunchMetricsDto launchMetricsDtoFromProto = launch_metrics != null ? LaunchMetricsDto.INSTANCE.fromProto(launch_metrics) : null;
            DeviceMetricEventData.ExitMetrics exit_metrics = proto.getExit_metrics();
            ExitMetricsDto exitMetricsDtoFromProto = exit_metrics != null ? ExitMetricsDto.INSTANCE.fromProto(exit_metrics) : null;
            DeviceMetricEventData.DisplayMetrics display_metrics = proto.getDisplay_metrics();
            return new DeviceMetricEventDataDto(new Surrogate(duration_seconds, appStateDtoFromProto, timestamp, runtimeMetricsDtoFromProto, cpuMetricsDtoFromProto, gpuMetricsDtoFromProto, memoryMetricsDtoFromProto, diskMetricsDtoFromProto, networkMetricsDtoFromProto, responsivenessMetricsDtoFromProto, launchMetricsDtoFromProto, exitMetricsDtoFromProto, display_metrics != null ? DisplayMetricsDto.INSTANCE.fromProto(display_metrics) : null, proto.getAdditional_info()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceMetricEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DeviceMetricEventDataDto(0.0d, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$AppState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "APP_STATE_UNSPECIFIED", "APP_STATE_ALL", "APP_STATE_BACKGROUND", "APP_STATE_FOREGROUND", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AppStateDto implements Dto2<DeviceMetricEventData.AppState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AppStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AppStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AppStateDto, DeviceMetricEventData.AppState>> binaryBase64Serializer$delegate;
        public static final AppStateDto APP_STATE_UNSPECIFIED = new APP_STATE_UNSPECIFIED("APP_STATE_UNSPECIFIED", 0);
        public static final AppStateDto APP_STATE_ALL = new APP_STATE_ALL("APP_STATE_ALL", 1);
        public static final AppStateDto APP_STATE_BACKGROUND = new APP_STATE_BACKGROUND("APP_STATE_BACKGROUND", 2);
        public static final AppStateDto APP_STATE_FOREGROUND = new APP_STATE_FOREGROUND("APP_STATE_FOREGROUND", 3);

        private static final /* synthetic */ AppStateDto[] $values() {
            return new AppStateDto[]{APP_STATE_UNSPECIFIED, APP_STATE_ALL, APP_STATE_BACKGROUND, APP_STATE_FOREGROUND};
        }

        public /* synthetic */ AppStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AppStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto.AppStateDto.APP_STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$AppState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APP_STATE_UNSPECIFIED extends AppStateDto {
            APP_STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DeviceMetricEventData.AppState toProto() {
                return DeviceMetricEventData.AppState.APP_STATE_UNSPECIFIED;
            }
        }

        private AppStateDto(String str, int i) {
        }

        static {
            AppStateDto[] appStateDtoArr$values = $values();
            $VALUES = appStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(appStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$AppStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceMetricEventDataDto.AppStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto.AppStateDto.APP_STATE_ALL", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$AppState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APP_STATE_ALL extends AppStateDto {
            APP_STATE_ALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DeviceMetricEventData.AppState toProto() {
                return DeviceMetricEventData.AppState.APP_STATE_ALL;
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto.AppStateDto.APP_STATE_BACKGROUND", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$AppState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APP_STATE_BACKGROUND extends AppStateDto {
            APP_STATE_BACKGROUND(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DeviceMetricEventData.AppState toProto() {
                return DeviceMetricEventData.AppState.APP_STATE_BACKGROUND;
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto.AppStateDto.APP_STATE_FOREGROUND", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$AppState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APP_STATE_FOREGROUND extends AppStateDto {
            APP_STATE_FOREGROUND(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public DeviceMetricEventData.AppState toProto() {
                return DeviceMetricEventData.AppState.APP_STATE_FOREGROUND;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$AppState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AppStateDto, DeviceMetricEventData.AppState> {

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DeviceMetricEventData.AppState.values().length];
                    try {
                        iArr[DeviceMetricEventData.AppState.APP_STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DeviceMetricEventData.AppState.APP_STATE_ALL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DeviceMetricEventData.AppState.APP_STATE_BACKGROUND.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[DeviceMetricEventData.AppState.APP_STATE_FOREGROUND.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AppStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AppStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AppStateDto> getBinaryBase64Serializer() {
                return (KSerializer) AppStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DeviceMetricEventData.AppState> getProtoAdapter() {
                return DeviceMetricEventData.AppState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AppStateDto getZeroValue() {
                return AppStateDto.APP_STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AppStateDto fromProto(DeviceMetricEventData.AppState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AppStateDto.APP_STATE_UNSPECIFIED;
                }
                if (i == 2) {
                    return AppStateDto.APP_STATE_ALL;
                }
                if (i == 3) {
                    return AppStateDto.APP_STATE_BACKGROUND;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return AppStateDto.APP_STATE_FOREGROUND;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$AppStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<AppStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AppStateDto, DeviceMetricEventData.AppState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.AppState", AppStateDto.getEntries(), AppStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AppStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AppStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AppStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AppStateDto valueOf(String str) {
            return (AppStateDto) Enum.valueOf(AppStateDto.class, str);
        }

        public static AppStateDto[] values() {
            return (AppStateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f !\"B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$RuntimeMetrics;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto$Surrogate;)V", "foreground_time_seconds", "", "background_time_seconds", "(DD)V", "getForeground_time_seconds", "()D", "getBackground_time_seconds", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class RuntimeMetricsDto implements Dto3<DeviceMetricEventData.RuntimeMetrics>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<RuntimeMetricsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<RuntimeMetricsDto, DeviceMetricEventData.RuntimeMetrics>> binaryBase64Serializer$delegate;
        private static final RuntimeMetricsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ RuntimeMetricsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private RuntimeMetricsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final double getForeground_time_seconds() {
            return this.surrogate.getForeground_time_seconds();
        }

        public final double getBackground_time_seconds() {
            return this.surrogate.getBackground_time_seconds();
        }

        public RuntimeMetricsDto(double d, double d2) {
            this(new Surrogate(d, d2));
        }

        public /* synthetic */ RuntimeMetricsDto(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
        }

        public static /* synthetic */ RuntimeMetricsDto copy$default(RuntimeMetricsDto runtimeMetricsDto, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = runtimeMetricsDto.surrogate.getForeground_time_seconds();
            }
            if ((i & 2) != 0) {
                d2 = runtimeMetricsDto.surrogate.getBackground_time_seconds();
            }
            return runtimeMetricsDto.copy(d, d2);
        }

        public final RuntimeMetricsDto copy(double foreground_time_seconds, double background_time_seconds) {
            return new RuntimeMetricsDto(new Surrogate(foreground_time_seconds, background_time_seconds));
        }

        @Override // com.robinhood.idl.Dto
        public DeviceMetricEventData.RuntimeMetrics toProto() {
            return new DeviceMetricEventData.RuntimeMetrics(this.surrogate.getForeground_time_seconds(), this.surrogate.getBackground_time_seconds(), null, 4, null);
        }

        public String toString() {
            return "[RuntimeMetricsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof RuntimeMetricsDto) && Intrinsics.areEqual(((RuntimeMetricsDto) other).surrogate, this.surrogate);
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
        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 '2\u00020\u0001:\u0002&'B9\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u0018\u0010\u0015\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u0016\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto$Surrogate;", "", "foreground_time_seconds", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "background_time_seconds", "<init>", "(DD)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getForeground_time_seconds$annotations", "()V", "getForeground_time_seconds", "()D", "getBackground_time_seconds$annotations", "getBackground_time_seconds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final double background_time_seconds;
            private final double foreground_time_seconds;

            public Surrogate() {
                this(0.0d, 0.0d, 3, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, double d, double d2, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = surrogate.foreground_time_seconds;
                }
                if ((i & 2) != 0) {
                    d2 = surrogate.background_time_seconds;
                }
                return surrogate.copy(d, d2);
            }

            @SerialName("backgroundTimeSeconds")
            @JsonAnnotations2(names = {"background_time_seconds"})
            public static /* synthetic */ void getBackground_time_seconds$annotations() {
            }

            @SerialName("foregroundTimeSeconds")
            @JsonAnnotations2(names = {"foreground_time_seconds"})
            public static /* synthetic */ void getForeground_time_seconds$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final double getForeground_time_seconds() {
                return this.foreground_time_seconds;
            }

            /* renamed from: component2, reason: from getter */
            public final double getBackground_time_seconds() {
                return this.background_time_seconds;
            }

            public final Surrogate copy(double foreground_time_seconds, double background_time_seconds) {
                return new Surrogate(foreground_time_seconds, background_time_seconds);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Double.compare(this.foreground_time_seconds, surrogate.foreground_time_seconds) == 0 && Double.compare(this.background_time_seconds, surrogate.background_time_seconds) == 0;
            }

            public int hashCode() {
                return (Double.hashCode(this.foreground_time_seconds) * 31) + Double.hashCode(this.background_time_seconds);
            }

            public String toString() {
                return "Surrogate(foreground_time_seconds=" + this.foreground_time_seconds + ", background_time_seconds=" + this.background_time_seconds + ")";
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return DeviceMetricEventDataDto$RuntimeMetricsDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, double d, double d2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.foreground_time_seconds = 0.0d;
                } else {
                    this.foreground_time_seconds = d;
                }
                if ((i & 2) == 0) {
                    this.background_time_seconds = 0.0d;
                } else {
                    this.background_time_seconds = d2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Double.compare(self.foreground_time_seconds, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.foreground_time_seconds));
                }
                if (Double.compare(self.background_time_seconds, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.background_time_seconds));
                }
            }

            public Surrogate(double d, double d2) {
                this.foreground_time_seconds = d;
                this.background_time_seconds = d2;
            }

            public /* synthetic */ Surrogate(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
            }

            public final double getForeground_time_seconds() {
                return this.foreground_time_seconds;
            }

            public final double getBackground_time_seconds() {
                return this.background_time_seconds;
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$RuntimeMetrics;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<RuntimeMetricsDto, DeviceMetricEventData.RuntimeMetrics> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<RuntimeMetricsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RuntimeMetricsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RuntimeMetricsDto> getBinaryBase64Serializer() {
                return (KSerializer) RuntimeMetricsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DeviceMetricEventData.RuntimeMetrics> getProtoAdapter() {
                return DeviceMetricEventData.RuntimeMetrics.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RuntimeMetricsDto getZeroValue() {
                return RuntimeMetricsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RuntimeMetricsDto fromProto(DeviceMetricEventData.RuntimeMetrics proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new RuntimeMetricsDto(new Surrogate(proto.getForeground_time_seconds(), proto.getBackground_time_seconds()), (DefaultConstructorMarker) null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$RuntimeMetricsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceMetricEventDataDto.RuntimeMetricsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new RuntimeMetricsDto(0.0d, 0.0d, 3, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<RuntimeMetricsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.RuntimeMetrics", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, RuntimeMetricsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public RuntimeMetricsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new RuntimeMetricsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$RuntimeMetricsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$RuntimeMetricsDto";
            }
        }
    }

    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$CpuMetrics;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto$Surrogate;)V", "total_time_seconds", "", "utime_seconds", "stime_seconds", "cumulative_kiloinstructions", "(DDDD)V", "getTotal_time_seconds", "()D", "getUtime_seconds", "getStime_seconds", "getCumulative_kiloinstructions", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CpuMetricsDto implements Dto3<DeviceMetricEventData.CpuMetrics>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<CpuMetricsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CpuMetricsDto, DeviceMetricEventData.CpuMetrics>> binaryBase64Serializer$delegate;
        private static final CpuMetricsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ CpuMetricsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CpuMetricsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final double getTotal_time_seconds() {
            return this.surrogate.getTotal_time_seconds();
        }

        public final double getUtime_seconds() {
            return this.surrogate.getUtime_seconds();
        }

        public final double getStime_seconds() {
            return this.surrogate.getStime_seconds();
        }

        public final double getCumulative_kiloinstructions() {
            return this.surrogate.getCumulative_kiloinstructions();
        }

        public /* synthetic */ CpuMetricsDto(double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4);
        }

        public CpuMetricsDto(double d, double d2, double d3, double d4) {
            this(new Surrogate(d, d2, d3, d4));
        }

        public static /* synthetic */ CpuMetricsDto copy$default(CpuMetricsDto cpuMetricsDto, double d, double d2, double d3, double d4, int i, Object obj) {
            if ((i & 1) != 0) {
                d = cpuMetricsDto.surrogate.getTotal_time_seconds();
            }
            double d5 = d;
            if ((i & 2) != 0) {
                d2 = cpuMetricsDto.surrogate.getUtime_seconds();
            }
            double d6 = d2;
            if ((i & 4) != 0) {
                d3 = cpuMetricsDto.surrogate.getStime_seconds();
            }
            return cpuMetricsDto.copy(d5, d6, d3, (i & 8) != 0 ? cpuMetricsDto.surrogate.getCumulative_kiloinstructions() : d4);
        }

        public final CpuMetricsDto copy(double total_time_seconds, double utime_seconds, double stime_seconds, double cumulative_kiloinstructions) {
            return new CpuMetricsDto(new Surrogate(total_time_seconds, utime_seconds, stime_seconds, cumulative_kiloinstructions));
        }

        @Override // com.robinhood.idl.Dto
        public DeviceMetricEventData.CpuMetrics toProto() {
            return new DeviceMetricEventData.CpuMetrics(this.surrogate.getTotal_time_seconds(), this.surrogate.getUtime_seconds(), this.surrogate.getStime_seconds(), this.surrogate.getCumulative_kiloinstructions(), null, 16, null);
        }

        public String toString() {
            return "[CpuMetricsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof CpuMetricsDto) && Intrinsics.areEqual(((CpuMetricsDto) other).surrogate, this.surrogate);
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
        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u0002./Bk\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\u0004\b\n\u0010\u000bB;\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\u0018\u0010\u001b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001c\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001d\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001e\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003Jm\u0010\u001f\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\rHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R+\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R+\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto$Surrogate;", "", "total_time_seconds", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "utime_seconds", "stime_seconds", "cumulative_kiloinstructions", "<init>", "(DDDD)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTotal_time_seconds$annotations", "()V", "getTotal_time_seconds", "()D", "getUtime_seconds$annotations", "getUtime_seconds", "getStime_seconds$annotations", "getStime_seconds", "getCumulative_kiloinstructions$annotations", "getCumulative_kiloinstructions", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final double cumulative_kiloinstructions;
            private final double stime_seconds;
            private final double total_time_seconds;
            private final double utime_seconds;

            public Surrogate() {
                this(0.0d, 0.0d, 0.0d, 0.0d, 15, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, double d, double d2, double d3, double d4, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = surrogate.total_time_seconds;
                }
                double d5 = d;
                if ((i & 2) != 0) {
                    d2 = surrogate.utime_seconds;
                }
                double d6 = d2;
                if ((i & 4) != 0) {
                    d3 = surrogate.stime_seconds;
                }
                return surrogate.copy(d5, d6, d3, (i & 8) != 0 ? surrogate.cumulative_kiloinstructions : d4);
            }

            @SerialName("cumulativeKiloinstructions")
            @JsonAnnotations2(names = {"cumulative_kiloinstructions"})
            public static /* synthetic */ void getCumulative_kiloinstructions$annotations() {
            }

            @SerialName("stimeSeconds")
            @JsonAnnotations2(names = {"stime_seconds"})
            public static /* synthetic */ void getStime_seconds$annotations() {
            }

            @SerialName("totalTimeSeconds")
            @JsonAnnotations2(names = {"total_time_seconds"})
            public static /* synthetic */ void getTotal_time_seconds$annotations() {
            }

            @SerialName("utimeSeconds")
            @JsonAnnotations2(names = {"utime_seconds"})
            public static /* synthetic */ void getUtime_seconds$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final double getTotal_time_seconds() {
                return this.total_time_seconds;
            }

            /* renamed from: component2, reason: from getter */
            public final double getUtime_seconds() {
                return this.utime_seconds;
            }

            /* renamed from: component3, reason: from getter */
            public final double getStime_seconds() {
                return this.stime_seconds;
            }

            /* renamed from: component4, reason: from getter */
            public final double getCumulative_kiloinstructions() {
                return this.cumulative_kiloinstructions;
            }

            public final Surrogate copy(double total_time_seconds, double utime_seconds, double stime_seconds, double cumulative_kiloinstructions) {
                return new Surrogate(total_time_seconds, utime_seconds, stime_seconds, cumulative_kiloinstructions);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Double.compare(this.total_time_seconds, surrogate.total_time_seconds) == 0 && Double.compare(this.utime_seconds, surrogate.utime_seconds) == 0 && Double.compare(this.stime_seconds, surrogate.stime_seconds) == 0 && Double.compare(this.cumulative_kiloinstructions, surrogate.cumulative_kiloinstructions) == 0;
            }

            public int hashCode() {
                return (((((Double.hashCode(this.total_time_seconds) * 31) + Double.hashCode(this.utime_seconds)) * 31) + Double.hashCode(this.stime_seconds)) * 31) + Double.hashCode(this.cumulative_kiloinstructions);
            }

            public String toString() {
                return "Surrogate(total_time_seconds=" + this.total_time_seconds + ", utime_seconds=" + this.utime_seconds + ", stime_seconds=" + this.stime_seconds + ", cumulative_kiloinstructions=" + this.cumulative_kiloinstructions + ")";
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return DeviceMetricEventDataDto$CpuMetricsDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, double d, double d2, double d3, double d4, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.total_time_seconds = 0.0d;
                } else {
                    this.total_time_seconds = d;
                }
                if ((i & 2) == 0) {
                    this.utime_seconds = 0.0d;
                } else {
                    this.utime_seconds = d2;
                }
                if ((i & 4) == 0) {
                    this.stime_seconds = 0.0d;
                } else {
                    this.stime_seconds = d3;
                }
                if ((i & 8) == 0) {
                    this.cumulative_kiloinstructions = 0.0d;
                } else {
                    this.cumulative_kiloinstructions = d4;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Double.compare(self.total_time_seconds, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.total_time_seconds));
                }
                if (Double.compare(self.utime_seconds, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.utime_seconds));
                }
                if (Double.compare(self.stime_seconds, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.stime_seconds));
                }
                if (Double.compare(self.cumulative_kiloinstructions, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.cumulative_kiloinstructions));
                }
            }

            public Surrogate(double d, double d2, double d3, double d4) {
                this.total_time_seconds = d;
                this.utime_seconds = d2;
                this.stime_seconds = d3;
                this.cumulative_kiloinstructions = d4;
            }

            public /* synthetic */ Surrogate(double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4);
            }

            public final double getTotal_time_seconds() {
                return this.total_time_seconds;
            }

            public final double getUtime_seconds() {
                return this.utime_seconds;
            }

            public final double getStime_seconds() {
                return this.stime_seconds;
            }

            public final double getCumulative_kiloinstructions() {
                return this.cumulative_kiloinstructions;
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$CpuMetrics;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<CpuMetricsDto, DeviceMetricEventData.CpuMetrics> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CpuMetricsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CpuMetricsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CpuMetricsDto> getBinaryBase64Serializer() {
                return (KSerializer) CpuMetricsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DeviceMetricEventData.CpuMetrics> getProtoAdapter() {
                return DeviceMetricEventData.CpuMetrics.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CpuMetricsDto getZeroValue() {
                return CpuMetricsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CpuMetricsDto fromProto(DeviceMetricEventData.CpuMetrics proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new CpuMetricsDto(new Surrogate(proto.getTotal_time_seconds(), proto.getUtime_seconds(), proto.getStime_seconds(), proto.getCumulative_kiloinstructions()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$CpuMetricsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceMetricEventDataDto.CpuMetricsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new CpuMetricsDto(0.0d, 0.0d, 0.0d, 0.0d, 15, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CpuMetricsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.CpuMetrics", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CpuMetricsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public CpuMetricsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new CpuMetricsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$CpuMetricsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$CpuMetricsDto";
            }
        }
    }

    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001d\u001e\u001f B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$GpuMetrics;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto$Surrogate;)V", "total_time_seconds", "", "(D)V", "getTotal_time_seconds", "()D", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class GpuMetricsDto implements Dto3<DeviceMetricEventData.GpuMetrics>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<GpuMetricsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<GpuMetricsDto, DeviceMetricEventData.GpuMetrics>> binaryBase64Serializer$delegate;
        private static final GpuMetricsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ GpuMetricsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private GpuMetricsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final double getTotal_time_seconds() {
            return this.surrogate.getTotal_time_seconds();
        }

        public GpuMetricsDto(double d) {
            this(new Surrogate(d));
        }

        public /* synthetic */ GpuMetricsDto(double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d);
        }

        public static /* synthetic */ GpuMetricsDto copy$default(GpuMetricsDto gpuMetricsDto, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = gpuMetricsDto.surrogate.getTotal_time_seconds();
            }
            return gpuMetricsDto.copy(d);
        }

        public final GpuMetricsDto copy(double total_time_seconds) {
            return new GpuMetricsDto(new Surrogate(total_time_seconds));
        }

        @Override // com.robinhood.idl.Dto
        public DeviceMetricEventData.GpuMetrics toProto() {
            return new DeviceMetricEventData.GpuMetrics(this.surrogate.getTotal_time_seconds(), null, 2, null);
        }

        public String toString() {
            return "[GpuMetricsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof GpuMetricsDto) && Intrinsics.areEqual(((GpuMetricsDto) other).surrogate, this.surrogate);
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
        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B \u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\u0004\b\u0007\u0010\bB#\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u0018\u0010\u0012\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\"\u0010\u0013\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\nHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto$Surrogate;", "", "total_time_seconds", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "<init>", "(D)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTotal_time_seconds$annotations", "()V", "getTotal_time_seconds", "()D", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final double total_time_seconds;

            public Surrogate() {
                this(0.0d, 1, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = surrogate.total_time_seconds;
                }
                return surrogate.copy(d);
            }

            @SerialName("totalTimeSeconds")
            @JsonAnnotations2(names = {"total_time_seconds"})
            public static /* synthetic */ void getTotal_time_seconds$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final double getTotal_time_seconds() {
                return this.total_time_seconds;
            }

            public final Surrogate copy(double total_time_seconds) {
                return new Surrogate(total_time_seconds);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Double.compare(this.total_time_seconds, ((Surrogate) other).total_time_seconds) == 0;
            }

            public int hashCode() {
                return Double.hashCode(this.total_time_seconds);
            }

            public String toString() {
                return "Surrogate(total_time_seconds=" + this.total_time_seconds + ")";
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return DeviceMetricEventDataDto$GpuMetricsDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, double d, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.total_time_seconds = 0.0d;
                } else {
                    this.total_time_seconds = d;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Double.compare(self.total_time_seconds, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.total_time_seconds));
                }
            }

            public Surrogate(double d) {
                this.total_time_seconds = d;
            }

            public /* synthetic */ Surrogate(double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 0.0d : d);
            }

            public final double getTotal_time_seconds() {
                return this.total_time_seconds;
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$GpuMetrics;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<GpuMetricsDto, DeviceMetricEventData.GpuMetrics> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<GpuMetricsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<GpuMetricsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<GpuMetricsDto> getBinaryBase64Serializer() {
                return (KSerializer) GpuMetricsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DeviceMetricEventData.GpuMetrics> getProtoAdapter() {
                return DeviceMetricEventData.GpuMetrics.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public GpuMetricsDto getZeroValue() {
                return GpuMetricsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public GpuMetricsDto fromProto(DeviceMetricEventData.GpuMetrics proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new GpuMetricsDto(new Surrogate(proto.getTotal_time_seconds()), null);
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion companion = new Companion(defaultConstructorMarker);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$GpuMetricsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceMetricEventDataDto.GpuMetricsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new GpuMetricsDto(0.0d, 1, defaultConstructorMarker);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<GpuMetricsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.GpuMetrics", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, GpuMetricsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public GpuMetricsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new GpuMetricsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$GpuMetricsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$GpuMetricsDto";
            }
        }
    }

    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u000eH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000eH\u0016J\b\u0010%\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$MemoryMetrics;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto$Surrogate;)V", "peak_usage_kb", "", "average_usage_when_suspended_kb", "min_threshold_kb", "", "low_memory_event_count", "", "(DDJI)V", "getPeak_usage_kb", "()D", "getAverage_usage_when_suspended_kb", "getMin_threshold_kb", "()J", "getLow_memory_event_count", "()I", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class MemoryMetricsDto implements Dto3<DeviceMetricEventData.MemoryMetrics>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<MemoryMetricsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<MemoryMetricsDto, DeviceMetricEventData.MemoryMetrics>> binaryBase64Serializer$delegate;
        private static final MemoryMetricsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ MemoryMetricsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private MemoryMetricsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final double getPeak_usage_kb() {
            return this.surrogate.getPeak_usage_kb();
        }

        public final double getAverage_usage_when_suspended_kb() {
            return this.surrogate.getAverage_usage_when_suspended_kb();
        }

        public final long getMin_threshold_kb() {
            return this.surrogate.getMin_threshold_kb();
        }

        public final int getLow_memory_event_count() {
            return this.surrogate.getLow_memory_event_count();
        }

        public /* synthetic */ MemoryMetricsDto(double d, double d2, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0.0d : d, (i2 & 2) != 0 ? 0.0d : d2, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0 : i);
        }

        public MemoryMetricsDto(double d, double d2, long j, int i) {
            this(new Surrogate(d, d2, j, i));
        }

        public static /* synthetic */ MemoryMetricsDto copy$default(MemoryMetricsDto memoryMetricsDto, double d, double d2, long j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                d = memoryMetricsDto.surrogate.getPeak_usage_kb();
            }
            double d3 = d;
            if ((i2 & 2) != 0) {
                d2 = memoryMetricsDto.surrogate.getAverage_usage_when_suspended_kb();
            }
            double d4 = d2;
            if ((i2 & 4) != 0) {
                j = memoryMetricsDto.surrogate.getMin_threshold_kb();
            }
            long j2 = j;
            if ((i2 & 8) != 0) {
                i = memoryMetricsDto.surrogate.getLow_memory_event_count();
            }
            return memoryMetricsDto.copy(d3, d4, j2, i);
        }

        public final MemoryMetricsDto copy(double peak_usage_kb, double average_usage_when_suspended_kb, long min_threshold_kb, int low_memory_event_count) {
            return new MemoryMetricsDto(new Surrogate(peak_usage_kb, average_usage_when_suspended_kb, min_threshold_kb, low_memory_event_count));
        }

        @Override // com.robinhood.idl.Dto
        public DeviceMetricEventData.MemoryMetrics toProto() {
            return new DeviceMetricEventData.MemoryMetrics(this.surrogate.getPeak_usage_kb(), this.surrogate.getAverage_usage_when_suspended_kb(), this.surrogate.getMin_threshold_kb(), this.surrogate.getLow_memory_event_count(), null, 16, null);
        }

        public String toString() {
            return "[MemoryMetricsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof MemoryMetricsDto) && Intrinsics.areEqual(((MemoryMetricsDto) other).surrogate, this.surrogate);
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
        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000234Bk\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\r¢\u0006\u0004\b\u000e\u0010\u000fB;\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0013J\u0018\u0010 \u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010!\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\"\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010#\u001a\u00110\f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\rHÆ\u0003Jm\u0010$\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\u000b\u001a\u00110\f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R+\u0010\b\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR+\u0010\u000b\u001a\u00110\f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto$Surrogate;", "", "peak_usage_kb", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "average_usage_when_suspended_kb", "min_threshold_kb", "", "Lcom/robinhood/idl/serialization/Int64Serializer;", "low_memory_event_count", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "<init>", "(DDJI)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDJILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPeak_usage_kb$annotations", "()V", "getPeak_usage_kb", "()D", "getAverage_usage_when_suspended_kb$annotations", "getAverage_usage_when_suspended_kb", "getMin_threshold_kb$annotations", "getMin_threshold_kb", "()J", "getLow_memory_event_count$annotations", "getLow_memory_event_count", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final double average_usage_when_suspended_kb;
            private final int low_memory_event_count;
            private final long min_threshold_kb;
            private final double peak_usage_kb;

            public Surrogate() {
                this(0.0d, 0.0d, 0L, 0, 15, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, double d, double d2, long j, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    d = surrogate.peak_usage_kb;
                }
                double d3 = d;
                if ((i2 & 2) != 0) {
                    d2 = surrogate.average_usage_when_suspended_kb;
                }
                double d4 = d2;
                if ((i2 & 4) != 0) {
                    j = surrogate.min_threshold_kb;
                }
                long j2 = j;
                if ((i2 & 8) != 0) {
                    i = surrogate.low_memory_event_count;
                }
                return surrogate.copy(d3, d4, j2, i);
            }

            @SerialName("averageUsageWhenSuspendedKb")
            @JsonAnnotations2(names = {"average_usage_when_suspended_kb"})
            public static /* synthetic */ void getAverage_usage_when_suspended_kb$annotations() {
            }

            @SerialName("lowMemoryEventCount")
            @JsonAnnotations2(names = {"low_memory_event_count"})
            public static /* synthetic */ void getLow_memory_event_count$annotations() {
            }

            @SerialName("minThresholdKb")
            @JsonAnnotations2(names = {"min_threshold_kb"})
            public static /* synthetic */ void getMin_threshold_kb$annotations() {
            }

            @SerialName("peakUsageKb")
            @JsonAnnotations2(names = {"peak_usage_kb"})
            public static /* synthetic */ void getPeak_usage_kb$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final double getPeak_usage_kb() {
                return this.peak_usage_kb;
            }

            /* renamed from: component2, reason: from getter */
            public final double getAverage_usage_when_suspended_kb() {
                return this.average_usage_when_suspended_kb;
            }

            /* renamed from: component3, reason: from getter */
            public final long getMin_threshold_kb() {
                return this.min_threshold_kb;
            }

            /* renamed from: component4, reason: from getter */
            public final int getLow_memory_event_count() {
                return this.low_memory_event_count;
            }

            public final Surrogate copy(double peak_usage_kb, double average_usage_when_suspended_kb, long min_threshold_kb, int low_memory_event_count) {
                return new Surrogate(peak_usage_kb, average_usage_when_suspended_kb, min_threshold_kb, low_memory_event_count);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Double.compare(this.peak_usage_kb, surrogate.peak_usage_kb) == 0 && Double.compare(this.average_usage_when_suspended_kb, surrogate.average_usage_when_suspended_kb) == 0 && this.min_threshold_kb == surrogate.min_threshold_kb && this.low_memory_event_count == surrogate.low_memory_event_count;
            }

            public int hashCode() {
                return (((((Double.hashCode(this.peak_usage_kb) * 31) + Double.hashCode(this.average_usage_when_suspended_kb)) * 31) + Long.hashCode(this.min_threshold_kb)) * 31) + Integer.hashCode(this.low_memory_event_count);
            }

            public String toString() {
                return "Surrogate(peak_usage_kb=" + this.peak_usage_kb + ", average_usage_when_suspended_kb=" + this.average_usage_when_suspended_kb + ", min_threshold_kb=" + this.min_threshold_kb + ", low_memory_event_count=" + this.low_memory_event_count + ")";
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return DeviceMetricEventDataDto$MemoryMetricsDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, double d, double d2, long j, int i2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.peak_usage_kb = 0.0d;
                } else {
                    this.peak_usage_kb = d;
                }
                if ((i & 2) == 0) {
                    this.average_usage_when_suspended_kb = 0.0d;
                } else {
                    this.average_usage_when_suspended_kb = d2;
                }
                if ((i & 4) == 0) {
                    this.min_threshold_kb = 0L;
                } else {
                    this.min_threshold_kb = j;
                }
                if ((i & 8) == 0) {
                    this.low_memory_event_count = 0;
                } else {
                    this.low_memory_event_count = i2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Double.compare(self.peak_usage_kb, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.peak_usage_kb));
                }
                if (Double.compare(self.average_usage_when_suspended_kb, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.average_usage_when_suspended_kb));
                }
                long j = self.min_threshold_kb;
                if (j != 0) {
                    output.encodeSerializableElement(serialDesc, 2, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
                }
                int i = self.low_memory_event_count;
                if (i != 0) {
                    output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                }
            }

            public Surrogate(double d, double d2, long j, int i) {
                this.peak_usage_kb = d;
                this.average_usage_when_suspended_kb = d2;
                this.min_threshold_kb = j;
                this.low_memory_event_count = i;
            }

            public /* synthetic */ Surrogate(double d, double d2, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 0.0d : d, (i2 & 2) != 0 ? 0.0d : d2, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0 : i);
            }

            public final double getPeak_usage_kb() {
                return this.peak_usage_kb;
            }

            public final double getAverage_usage_when_suspended_kb() {
                return this.average_usage_when_suspended_kb;
            }

            public final long getMin_threshold_kb() {
                return this.min_threshold_kb;
            }

            public final int getLow_memory_event_count() {
                return this.low_memory_event_count;
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$MemoryMetrics;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<MemoryMetricsDto, DeviceMetricEventData.MemoryMetrics> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MemoryMetricsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MemoryMetricsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MemoryMetricsDto> getBinaryBase64Serializer() {
                return (KSerializer) MemoryMetricsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DeviceMetricEventData.MemoryMetrics> getProtoAdapter() {
                return DeviceMetricEventData.MemoryMetrics.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MemoryMetricsDto getZeroValue() {
                return MemoryMetricsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MemoryMetricsDto fromProto(DeviceMetricEventData.MemoryMetrics proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new MemoryMetricsDto(new Surrogate(proto.getPeak_usage_kb(), proto.getAverage_usage_when_suspended_kb(), proto.getMin_threshold_kb(), proto.getLow_memory_event_count()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$MemoryMetricsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceMetricEventDataDto.MemoryMetricsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new MemoryMetricsDto(0.0d, 0.0d, 0L, 0, 15, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<MemoryMetricsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.MemoryMetrics", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, MemoryMetricsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public MemoryMetricsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new MemoryMetricsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MemoryMetricsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4189_5)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$MemoryMetricsDto";
            }
        }
    }

    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001d\u001e\u001f B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DiskMetrics;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto$Surrogate;)V", "total_written_kb", "", "(D)V", "getTotal_written_kb", "()D", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DiskMetricsDto implements Dto3<DeviceMetricEventData.DiskMetrics>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<DiskMetricsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DiskMetricsDto, DeviceMetricEventData.DiskMetrics>> binaryBase64Serializer$delegate;
        private static final DiskMetricsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ DiskMetricsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private DiskMetricsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final double getTotal_written_kb() {
            return this.surrogate.getTotal_written_kb();
        }

        public DiskMetricsDto(double d) {
            this(new Surrogate(d));
        }

        public /* synthetic */ DiskMetricsDto(double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d);
        }

        public static /* synthetic */ DiskMetricsDto copy$default(DiskMetricsDto diskMetricsDto, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = diskMetricsDto.surrogate.getTotal_written_kb();
            }
            return diskMetricsDto.copy(d);
        }

        public final DiskMetricsDto copy(double total_written_kb) {
            return new DiskMetricsDto(new Surrogate(total_written_kb));
        }

        @Override // com.robinhood.idl.Dto
        public DeviceMetricEventData.DiskMetrics toProto() {
            return new DeviceMetricEventData.DiskMetrics(this.surrogate.getTotal_written_kb(), null, 2, null);
        }

        public String toString() {
            return "[DiskMetricsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof DiskMetricsDto) && Intrinsics.areEqual(((DiskMetricsDto) other).surrogate, this.surrogate);
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
        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B \u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\u0004\b\u0007\u0010\bB#\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u0018\u0010\u0012\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\"\u0010\u0013\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\nHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto$Surrogate;", "", "total_written_kb", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "<init>", "(D)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTotal_written_kb$annotations", "()V", "getTotal_written_kb", "()D", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final double total_written_kb;

            public Surrogate() {
                this(0.0d, 1, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = surrogate.total_written_kb;
                }
                return surrogate.copy(d);
            }

            @SerialName("totalWrittenKb")
            @JsonAnnotations2(names = {"total_written_kb"})
            public static /* synthetic */ void getTotal_written_kb$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final double getTotal_written_kb() {
                return this.total_written_kb;
            }

            public final Surrogate copy(double total_written_kb) {
                return new Surrogate(total_written_kb);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Double.compare(this.total_written_kb, ((Surrogate) other).total_written_kb) == 0;
            }

            public int hashCode() {
                return Double.hashCode(this.total_written_kb);
            }

            public String toString() {
                return "Surrogate(total_written_kb=" + this.total_written_kb + ")";
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return DeviceMetricEventDataDto$DiskMetricsDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, double d, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.total_written_kb = 0.0d;
                } else {
                    this.total_written_kb = d;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Double.compare(self.total_written_kb, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.total_written_kb));
                }
            }

            public Surrogate(double d) {
                this.total_written_kb = d;
            }

            public /* synthetic */ Surrogate(double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 0.0d : d);
            }

            public final double getTotal_written_kb() {
                return this.total_written_kb;
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DiskMetrics;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<DiskMetricsDto, DeviceMetricEventData.DiskMetrics> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DiskMetricsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DiskMetricsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DiskMetricsDto> getBinaryBase64Serializer() {
                return (KSerializer) DiskMetricsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DeviceMetricEventData.DiskMetrics> getProtoAdapter() {
                return DeviceMetricEventData.DiskMetrics.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DiskMetricsDto getZeroValue() {
                return DiskMetricsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DiskMetricsDto fromProto(DeviceMetricEventData.DiskMetrics proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new DiskMetricsDto(new Surrogate(proto.getTotal_written_kb()), null);
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion companion = new Companion(defaultConstructorMarker);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$DiskMetricsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceMetricEventDataDto.DiskMetricsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new DiskMetricsDto(0.0d, 1, defaultConstructorMarker);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<DiskMetricsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.DiskMetrics", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DiskMetricsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public DiskMetricsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new DiskMetricsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DiskMetricsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$DiskMetricsDto";
            }
        }
    }

    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b*+,-./01B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bi\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u0011Jf\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tJ\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010\b\u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$Surrogate;)V", "other", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;", Constants.WIFI, "cellular", "bluetooth", "ethernet", "vpn", "wifi_aware", "lowpan", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;)V", "getOther", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;", "getWifi", "getCellular", "getBluetooth", "getEthernet", "getVpn", "getWifi_aware", "getLowpan", "copy", "toProto", "toString", "", "equals", "", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ConnectionMetricsDto", "TransferStatsDto", "MeteredDto", "RoamingDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class NetworkMetricsDto implements Dto3<DeviceMetricEventData.NetworkMetrics>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<NetworkMetricsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<NetworkMetricsDto, DeviceMetricEventData.NetworkMetrics>> binaryBase64Serializer$delegate;
        private static final NetworkMetricsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ NetworkMetricsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private NetworkMetricsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final ConnectionMetricsDto getOther() {
            return this.surrogate.getOther();
        }

        public final ConnectionMetricsDto getWifi() {
            return this.surrogate.getWifi();
        }

        public final ConnectionMetricsDto getCellular() {
            return this.surrogate.getCellular();
        }

        public final ConnectionMetricsDto getBluetooth() {
            return this.surrogate.getBluetooth();
        }

        public final ConnectionMetricsDto getEthernet() {
            return this.surrogate.getEthernet();
        }

        public final ConnectionMetricsDto getVpn() {
            return this.surrogate.getVpn();
        }

        public final ConnectionMetricsDto getWifi_aware() {
            return this.surrogate.getWifi_aware();
        }

        public final ConnectionMetricsDto getLowpan() {
            return this.surrogate.getLowpan();
        }

        public /* synthetic */ NetworkMetricsDto(ConnectionMetricsDto connectionMetricsDto, ConnectionMetricsDto connectionMetricsDto2, ConnectionMetricsDto connectionMetricsDto3, ConnectionMetricsDto connectionMetricsDto4, ConnectionMetricsDto connectionMetricsDto5, ConnectionMetricsDto connectionMetricsDto6, ConnectionMetricsDto connectionMetricsDto7, ConnectionMetricsDto connectionMetricsDto8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : connectionMetricsDto, (i & 2) != 0 ? null : connectionMetricsDto2, (i & 4) != 0 ? null : connectionMetricsDto3, (i & 8) != 0 ? null : connectionMetricsDto4, (i & 16) != 0 ? null : connectionMetricsDto5, (i & 32) != 0 ? null : connectionMetricsDto6, (i & 64) != 0 ? null : connectionMetricsDto7, (i & 128) != 0 ? null : connectionMetricsDto8);
        }

        public NetworkMetricsDto(ConnectionMetricsDto connectionMetricsDto, ConnectionMetricsDto connectionMetricsDto2, ConnectionMetricsDto connectionMetricsDto3, ConnectionMetricsDto connectionMetricsDto4, ConnectionMetricsDto connectionMetricsDto5, ConnectionMetricsDto connectionMetricsDto6, ConnectionMetricsDto connectionMetricsDto7, ConnectionMetricsDto connectionMetricsDto8) {
            this(new Surrogate(connectionMetricsDto, connectionMetricsDto2, connectionMetricsDto3, connectionMetricsDto4, connectionMetricsDto5, connectionMetricsDto6, connectionMetricsDto7, connectionMetricsDto8));
        }

        public static /* synthetic */ NetworkMetricsDto copy$default(NetworkMetricsDto networkMetricsDto, ConnectionMetricsDto connectionMetricsDto, ConnectionMetricsDto connectionMetricsDto2, ConnectionMetricsDto connectionMetricsDto3, ConnectionMetricsDto connectionMetricsDto4, ConnectionMetricsDto connectionMetricsDto5, ConnectionMetricsDto connectionMetricsDto6, ConnectionMetricsDto connectionMetricsDto7, ConnectionMetricsDto connectionMetricsDto8, int i, Object obj) {
            if ((i & 1) != 0) {
                connectionMetricsDto = networkMetricsDto.surrogate.getOther();
            }
            if ((i & 2) != 0) {
                connectionMetricsDto2 = networkMetricsDto.surrogate.getWifi();
            }
            if ((i & 4) != 0) {
                connectionMetricsDto3 = networkMetricsDto.surrogate.getCellular();
            }
            if ((i & 8) != 0) {
                connectionMetricsDto4 = networkMetricsDto.surrogate.getBluetooth();
            }
            if ((i & 16) != 0) {
                connectionMetricsDto5 = networkMetricsDto.surrogate.getEthernet();
            }
            if ((i & 32) != 0) {
                connectionMetricsDto6 = networkMetricsDto.surrogate.getVpn();
            }
            if ((i & 64) != 0) {
                connectionMetricsDto7 = networkMetricsDto.surrogate.getWifi_aware();
            }
            if ((i & 128) != 0) {
                connectionMetricsDto8 = networkMetricsDto.surrogate.getLowpan();
            }
            ConnectionMetricsDto connectionMetricsDto9 = connectionMetricsDto7;
            ConnectionMetricsDto connectionMetricsDto10 = connectionMetricsDto8;
            ConnectionMetricsDto connectionMetricsDto11 = connectionMetricsDto5;
            ConnectionMetricsDto connectionMetricsDto12 = connectionMetricsDto6;
            return networkMetricsDto.copy(connectionMetricsDto, connectionMetricsDto2, connectionMetricsDto3, connectionMetricsDto4, connectionMetricsDto11, connectionMetricsDto12, connectionMetricsDto9, connectionMetricsDto10);
        }

        public final NetworkMetricsDto copy(ConnectionMetricsDto other, ConnectionMetricsDto wifi, ConnectionMetricsDto cellular, ConnectionMetricsDto bluetooth, ConnectionMetricsDto ethernet, ConnectionMetricsDto vpn, ConnectionMetricsDto wifi_aware, ConnectionMetricsDto lowpan) {
            return new NetworkMetricsDto(new Surrogate(other, wifi, cellular, bluetooth, ethernet, vpn, wifi_aware, lowpan));
        }

        @Override // com.robinhood.idl.Dto
        public DeviceMetricEventData.NetworkMetrics toProto() {
            ConnectionMetricsDto other = this.surrogate.getOther();
            DeviceMetricEventData.NetworkMetrics.ConnectionMetrics proto = other != null ? other.toProto() : null;
            ConnectionMetricsDto wifi = this.surrogate.getWifi();
            DeviceMetricEventData.NetworkMetrics.ConnectionMetrics proto2 = wifi != null ? wifi.toProto() : null;
            ConnectionMetricsDto cellular = this.surrogate.getCellular();
            DeviceMetricEventData.NetworkMetrics.ConnectionMetrics proto3 = cellular != null ? cellular.toProto() : null;
            ConnectionMetricsDto bluetooth = this.surrogate.getBluetooth();
            DeviceMetricEventData.NetworkMetrics.ConnectionMetrics proto4 = bluetooth != null ? bluetooth.toProto() : null;
            ConnectionMetricsDto ethernet = this.surrogate.getEthernet();
            DeviceMetricEventData.NetworkMetrics.ConnectionMetrics proto5 = ethernet != null ? ethernet.toProto() : null;
            ConnectionMetricsDto vpn = this.surrogate.getVpn();
            DeviceMetricEventData.NetworkMetrics.ConnectionMetrics proto6 = vpn != null ? vpn.toProto() : null;
            ConnectionMetricsDto wifi_aware = this.surrogate.getWifi_aware();
            DeviceMetricEventData.NetworkMetrics.ConnectionMetrics proto7 = wifi_aware != null ? wifi_aware.toProto() : null;
            ConnectionMetricsDto lowpan = this.surrogate.getLowpan();
            return new DeviceMetricEventData.NetworkMetrics(proto, proto2, proto3, proto4, proto5, proto6, proto7, lowpan != null ? lowpan.toProto() : null, null, 256, null);
        }

        public String toString() {
            return "[NetworkMetricsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof NetworkMetricsDto) && Intrinsics.areEqual(((NetworkMetricsDto) other).surrogate, this.surrogate);
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
        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002:;Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fBk\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u000eHÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001J%\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0001¢\u0006\u0002\b9R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$Surrogate;", "", "other", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;", Constants.WIFI, "cellular", "bluetooth", "ethernet", "vpn", "wifi_aware", "lowpan", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOther$annotations", "()V", "getOther", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;", "getWifi$annotations", "getWifi", "getCellular$annotations", "getCellular", "getBluetooth$annotations", "getBluetooth", "getEthernet$annotations", "getEthernet", "getVpn$annotations", "getVpn", "getWifi_aware$annotations", "getWifi_aware", "getLowpan$annotations", "getLowpan", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final ConnectionMetricsDto bluetooth;
            private final ConnectionMetricsDto cellular;
            private final ConnectionMetricsDto ethernet;
            private final ConnectionMetricsDto lowpan;
            private final ConnectionMetricsDto other;
            private final ConnectionMetricsDto vpn;
            private final ConnectionMetricsDto wifi;
            private final ConnectionMetricsDto wifi_aware;

            public Surrogate() {
                this((ConnectionMetricsDto) null, (ConnectionMetricsDto) null, (ConnectionMetricsDto) null, (ConnectionMetricsDto) null, (ConnectionMetricsDto) null, (ConnectionMetricsDto) null, (ConnectionMetricsDto) null, (ConnectionMetricsDto) null, 255, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ConnectionMetricsDto connectionMetricsDto, ConnectionMetricsDto connectionMetricsDto2, ConnectionMetricsDto connectionMetricsDto3, ConnectionMetricsDto connectionMetricsDto4, ConnectionMetricsDto connectionMetricsDto5, ConnectionMetricsDto connectionMetricsDto6, ConnectionMetricsDto connectionMetricsDto7, ConnectionMetricsDto connectionMetricsDto8, int i, Object obj) {
                if ((i & 1) != 0) {
                    connectionMetricsDto = surrogate.other;
                }
                if ((i & 2) != 0) {
                    connectionMetricsDto2 = surrogate.wifi;
                }
                if ((i & 4) != 0) {
                    connectionMetricsDto3 = surrogate.cellular;
                }
                if ((i & 8) != 0) {
                    connectionMetricsDto4 = surrogate.bluetooth;
                }
                if ((i & 16) != 0) {
                    connectionMetricsDto5 = surrogate.ethernet;
                }
                if ((i & 32) != 0) {
                    connectionMetricsDto6 = surrogate.vpn;
                }
                if ((i & 64) != 0) {
                    connectionMetricsDto7 = surrogate.wifi_aware;
                }
                if ((i & 128) != 0) {
                    connectionMetricsDto8 = surrogate.lowpan;
                }
                ConnectionMetricsDto connectionMetricsDto9 = connectionMetricsDto7;
                ConnectionMetricsDto connectionMetricsDto10 = connectionMetricsDto8;
                ConnectionMetricsDto connectionMetricsDto11 = connectionMetricsDto5;
                ConnectionMetricsDto connectionMetricsDto12 = connectionMetricsDto6;
                return surrogate.copy(connectionMetricsDto, connectionMetricsDto2, connectionMetricsDto3, connectionMetricsDto4, connectionMetricsDto11, connectionMetricsDto12, connectionMetricsDto9, connectionMetricsDto10);
            }

            @SerialName("bluetooth")
            @JsonAnnotations2(names = {"bluetooth"})
            public static /* synthetic */ void getBluetooth$annotations() {
            }

            @SerialName("cellular")
            @JsonAnnotations2(names = {"cellular"})
            public static /* synthetic */ void getCellular$annotations() {
            }

            @SerialName("ethernet")
            @JsonAnnotations2(names = {"ethernet"})
            public static /* synthetic */ void getEthernet$annotations() {
            }

            @SerialName("lowpan")
            @JsonAnnotations2(names = {"lowpan"})
            public static /* synthetic */ void getLowpan$annotations() {
            }

            @SerialName("other")
            @JsonAnnotations2(names = {"other"})
            public static /* synthetic */ void getOther$annotations() {
            }

            @SerialName("vpn")
            @JsonAnnotations2(names = {"vpn"})
            public static /* synthetic */ void getVpn$annotations() {
            }

            @SerialName(Constants.WIFI)
            @JsonAnnotations2(names = {Constants.WIFI})
            public static /* synthetic */ void getWifi$annotations() {
            }

            @SerialName("wifiAware")
            @JsonAnnotations2(names = {"wifi_aware"})
            public static /* synthetic */ void getWifi_aware$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final ConnectionMetricsDto getOther() {
                return this.other;
            }

            /* renamed from: component2, reason: from getter */
            public final ConnectionMetricsDto getWifi() {
                return this.wifi;
            }

            /* renamed from: component3, reason: from getter */
            public final ConnectionMetricsDto getCellular() {
                return this.cellular;
            }

            /* renamed from: component4, reason: from getter */
            public final ConnectionMetricsDto getBluetooth() {
                return this.bluetooth;
            }

            /* renamed from: component5, reason: from getter */
            public final ConnectionMetricsDto getEthernet() {
                return this.ethernet;
            }

            /* renamed from: component6, reason: from getter */
            public final ConnectionMetricsDto getVpn() {
                return this.vpn;
            }

            /* renamed from: component7, reason: from getter */
            public final ConnectionMetricsDto getWifi_aware() {
                return this.wifi_aware;
            }

            /* renamed from: component8, reason: from getter */
            public final ConnectionMetricsDto getLowpan() {
                return this.lowpan;
            }

            public final Surrogate copy(ConnectionMetricsDto other, ConnectionMetricsDto wifi, ConnectionMetricsDto cellular, ConnectionMetricsDto bluetooth, ConnectionMetricsDto ethernet, ConnectionMetricsDto vpn, ConnectionMetricsDto wifi_aware, ConnectionMetricsDto lowpan) {
                return new Surrogate(other, wifi, cellular, bluetooth, ethernet, vpn, wifi_aware, lowpan);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.other, surrogate.other) && Intrinsics.areEqual(this.wifi, surrogate.wifi) && Intrinsics.areEqual(this.cellular, surrogate.cellular) && Intrinsics.areEqual(this.bluetooth, surrogate.bluetooth) && Intrinsics.areEqual(this.ethernet, surrogate.ethernet) && Intrinsics.areEqual(this.vpn, surrogate.vpn) && Intrinsics.areEqual(this.wifi_aware, surrogate.wifi_aware) && Intrinsics.areEqual(this.lowpan, surrogate.lowpan);
            }

            public int hashCode() {
                ConnectionMetricsDto connectionMetricsDto = this.other;
                int iHashCode = (connectionMetricsDto == null ? 0 : connectionMetricsDto.hashCode()) * 31;
                ConnectionMetricsDto connectionMetricsDto2 = this.wifi;
                int iHashCode2 = (iHashCode + (connectionMetricsDto2 == null ? 0 : connectionMetricsDto2.hashCode())) * 31;
                ConnectionMetricsDto connectionMetricsDto3 = this.cellular;
                int iHashCode3 = (iHashCode2 + (connectionMetricsDto3 == null ? 0 : connectionMetricsDto3.hashCode())) * 31;
                ConnectionMetricsDto connectionMetricsDto4 = this.bluetooth;
                int iHashCode4 = (iHashCode3 + (connectionMetricsDto4 == null ? 0 : connectionMetricsDto4.hashCode())) * 31;
                ConnectionMetricsDto connectionMetricsDto5 = this.ethernet;
                int iHashCode5 = (iHashCode4 + (connectionMetricsDto5 == null ? 0 : connectionMetricsDto5.hashCode())) * 31;
                ConnectionMetricsDto connectionMetricsDto6 = this.vpn;
                int iHashCode6 = (iHashCode5 + (connectionMetricsDto6 == null ? 0 : connectionMetricsDto6.hashCode())) * 31;
                ConnectionMetricsDto connectionMetricsDto7 = this.wifi_aware;
                int iHashCode7 = (iHashCode6 + (connectionMetricsDto7 == null ? 0 : connectionMetricsDto7.hashCode())) * 31;
                ConnectionMetricsDto connectionMetricsDto8 = this.lowpan;
                return iHashCode7 + (connectionMetricsDto8 != null ? connectionMetricsDto8.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(other=" + this.other + ", wifi=" + this.wifi + ", cellular=" + this.cellular + ", bluetooth=" + this.bluetooth + ", ethernet=" + this.ethernet + ", vpn=" + this.vpn + ", wifi_aware=" + this.wifi_aware + ", lowpan=" + this.lowpan + ")";
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return DeviceMetricEventDataDto$NetworkMetricsDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, ConnectionMetricsDto connectionMetricsDto, ConnectionMetricsDto connectionMetricsDto2, ConnectionMetricsDto connectionMetricsDto3, ConnectionMetricsDto connectionMetricsDto4, ConnectionMetricsDto connectionMetricsDto5, ConnectionMetricsDto connectionMetricsDto6, ConnectionMetricsDto connectionMetricsDto7, ConnectionMetricsDto connectionMetricsDto8, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.other = null;
                } else {
                    this.other = connectionMetricsDto;
                }
                if ((i & 2) == 0) {
                    this.wifi = null;
                } else {
                    this.wifi = connectionMetricsDto2;
                }
                if ((i & 4) == 0) {
                    this.cellular = null;
                } else {
                    this.cellular = connectionMetricsDto3;
                }
                if ((i & 8) == 0) {
                    this.bluetooth = null;
                } else {
                    this.bluetooth = connectionMetricsDto4;
                }
                if ((i & 16) == 0) {
                    this.ethernet = null;
                } else {
                    this.ethernet = connectionMetricsDto5;
                }
                if ((i & 32) == 0) {
                    this.vpn = null;
                } else {
                    this.vpn = connectionMetricsDto6;
                }
                if ((i & 64) == 0) {
                    this.wifi_aware = null;
                } else {
                    this.wifi_aware = connectionMetricsDto7;
                }
                if ((i & 128) == 0) {
                    this.lowpan = null;
                } else {
                    this.lowpan = connectionMetricsDto8;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                ConnectionMetricsDto connectionMetricsDto = self.other;
                if (connectionMetricsDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, ConnectionMetricsDto.Serializer.INSTANCE, connectionMetricsDto);
                }
                ConnectionMetricsDto connectionMetricsDto2 = self.wifi;
                if (connectionMetricsDto2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, ConnectionMetricsDto.Serializer.INSTANCE, connectionMetricsDto2);
                }
                ConnectionMetricsDto connectionMetricsDto3 = self.cellular;
                if (connectionMetricsDto3 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, ConnectionMetricsDto.Serializer.INSTANCE, connectionMetricsDto3);
                }
                ConnectionMetricsDto connectionMetricsDto4 = self.bluetooth;
                if (connectionMetricsDto4 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, ConnectionMetricsDto.Serializer.INSTANCE, connectionMetricsDto4);
                }
                ConnectionMetricsDto connectionMetricsDto5 = self.ethernet;
                if (connectionMetricsDto5 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, ConnectionMetricsDto.Serializer.INSTANCE, connectionMetricsDto5);
                }
                ConnectionMetricsDto connectionMetricsDto6 = self.vpn;
                if (connectionMetricsDto6 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 5, ConnectionMetricsDto.Serializer.INSTANCE, connectionMetricsDto6);
                }
                ConnectionMetricsDto connectionMetricsDto7 = self.wifi_aware;
                if (connectionMetricsDto7 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 6, ConnectionMetricsDto.Serializer.INSTANCE, connectionMetricsDto7);
                }
                ConnectionMetricsDto connectionMetricsDto8 = self.lowpan;
                if (connectionMetricsDto8 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 7, ConnectionMetricsDto.Serializer.INSTANCE, connectionMetricsDto8);
                }
            }

            public Surrogate(ConnectionMetricsDto connectionMetricsDto, ConnectionMetricsDto connectionMetricsDto2, ConnectionMetricsDto connectionMetricsDto3, ConnectionMetricsDto connectionMetricsDto4, ConnectionMetricsDto connectionMetricsDto5, ConnectionMetricsDto connectionMetricsDto6, ConnectionMetricsDto connectionMetricsDto7, ConnectionMetricsDto connectionMetricsDto8) {
                this.other = connectionMetricsDto;
                this.wifi = connectionMetricsDto2;
                this.cellular = connectionMetricsDto3;
                this.bluetooth = connectionMetricsDto4;
                this.ethernet = connectionMetricsDto5;
                this.vpn = connectionMetricsDto6;
                this.wifi_aware = connectionMetricsDto7;
                this.lowpan = connectionMetricsDto8;
            }

            public /* synthetic */ Surrogate(ConnectionMetricsDto connectionMetricsDto, ConnectionMetricsDto connectionMetricsDto2, ConnectionMetricsDto connectionMetricsDto3, ConnectionMetricsDto connectionMetricsDto4, ConnectionMetricsDto connectionMetricsDto5, ConnectionMetricsDto connectionMetricsDto6, ConnectionMetricsDto connectionMetricsDto7, ConnectionMetricsDto connectionMetricsDto8, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : connectionMetricsDto, (i & 2) != 0 ? null : connectionMetricsDto2, (i & 4) != 0 ? null : connectionMetricsDto3, (i & 8) != 0 ? null : connectionMetricsDto4, (i & 16) != 0 ? null : connectionMetricsDto5, (i & 32) != 0 ? null : connectionMetricsDto6, (i & 64) != 0 ? null : connectionMetricsDto7, (i & 128) != 0 ? null : connectionMetricsDto8);
            }

            public final ConnectionMetricsDto getOther() {
                return this.other;
            }

            public final ConnectionMetricsDto getWifi() {
                return this.wifi;
            }

            public final ConnectionMetricsDto getCellular() {
                return this.cellular;
            }

            public final ConnectionMetricsDto getBluetooth() {
                return this.bluetooth;
            }

            public final ConnectionMetricsDto getEthernet() {
                return this.ethernet;
            }

            public final ConnectionMetricsDto getVpn() {
                return this.vpn;
            }

            public final ConnectionMetricsDto getWifi_aware() {
                return this.wifi_aware;
            }

            public final ConnectionMetricsDto getLowpan() {
                return this.lowpan;
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<NetworkMetricsDto, DeviceMetricEventData.NetworkMetrics> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NetworkMetricsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NetworkMetricsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NetworkMetricsDto> getBinaryBase64Serializer() {
                return (KSerializer) NetworkMetricsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DeviceMetricEventData.NetworkMetrics> getProtoAdapter() {
                return DeviceMetricEventData.NetworkMetrics.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NetworkMetricsDto getZeroValue() {
                return NetworkMetricsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NetworkMetricsDto fromProto(DeviceMetricEventData.NetworkMetrics proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                DeviceMetricEventData.NetworkMetrics.ConnectionMetrics other = proto.getOther();
                DefaultConstructorMarker defaultConstructorMarker = null;
                ConnectionMetricsDto connectionMetricsDtoFromProto = other != null ? ConnectionMetricsDto.INSTANCE.fromProto(other) : null;
                DeviceMetricEventData.NetworkMetrics.ConnectionMetrics wifi = proto.getWifi();
                ConnectionMetricsDto connectionMetricsDtoFromProto2 = wifi != null ? ConnectionMetricsDto.INSTANCE.fromProto(wifi) : null;
                DeviceMetricEventData.NetworkMetrics.ConnectionMetrics cellular = proto.getCellular();
                ConnectionMetricsDto connectionMetricsDtoFromProto3 = cellular != null ? ConnectionMetricsDto.INSTANCE.fromProto(cellular) : null;
                DeviceMetricEventData.NetworkMetrics.ConnectionMetrics bluetooth = proto.getBluetooth();
                ConnectionMetricsDto connectionMetricsDtoFromProto4 = bluetooth != null ? ConnectionMetricsDto.INSTANCE.fromProto(bluetooth) : null;
                DeviceMetricEventData.NetworkMetrics.ConnectionMetrics ethernet = proto.getEthernet();
                ConnectionMetricsDto connectionMetricsDtoFromProto5 = ethernet != null ? ConnectionMetricsDto.INSTANCE.fromProto(ethernet) : null;
                DeviceMetricEventData.NetworkMetrics.ConnectionMetrics vpn = proto.getVpn();
                ConnectionMetricsDto connectionMetricsDtoFromProto6 = vpn != null ? ConnectionMetricsDto.INSTANCE.fromProto(vpn) : null;
                DeviceMetricEventData.NetworkMetrics.ConnectionMetrics wifi_aware = proto.getWifi_aware();
                ConnectionMetricsDto connectionMetricsDtoFromProto7 = wifi_aware != null ? ConnectionMetricsDto.INSTANCE.fromProto(wifi_aware) : null;
                DeviceMetricEventData.NetworkMetrics.ConnectionMetrics lowpan = proto.getLowpan();
                return new NetworkMetricsDto(new Surrogate(connectionMetricsDtoFromProto, connectionMetricsDtoFromProto2, connectionMetricsDtoFromProto3, connectionMetricsDtoFromProto4, connectionMetricsDtoFromProto5, connectionMetricsDtoFromProto6, connectionMetricsDtoFromProto7, lowpan != null ? ConnectionMetricsDto.INSTANCE.fromProto(lowpan) : null), defaultConstructorMarker);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$NetworkMetricsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceMetricEventDataDto.NetworkMetricsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new NetworkMetricsDto(null, null, null, null, null, null, null, null, 255, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0011J<\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$ConnectionMetrics;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto$Surrogate;)V", "time_seconds", "", "download", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto;", "upload", "metered", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;", "roaming", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;", "(DLcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;)V", "getTime_seconds", "()D", "getDownload", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto;", "getUpload", "getMetered", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;", "getRoaming", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class ConnectionMetricsDto implements Dto3<DeviceMetricEventData.NetworkMetrics.ConnectionMetrics>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<ConnectionMetricsDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<ConnectionMetricsDto, DeviceMetricEventData.NetworkMetrics.ConnectionMetrics>> binaryBase64Serializer$delegate;
            private static final ConnectionMetricsDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ ConnectionMetricsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private ConnectionMetricsDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final double getTime_seconds() {
                return this.surrogate.getTime_seconds();
            }

            public final TransferStatsDto getDownload() {
                return this.surrogate.getDownload();
            }

            public final TransferStatsDto getUpload() {
                return this.surrogate.getUpload();
            }

            public final MeteredDto getMetered() {
                return this.surrogate.getMetered();
            }

            public final RoamingDto getRoaming() {
                return this.surrogate.getRoaming();
            }

            public /* synthetic */ ConnectionMetricsDto(double d, TransferStatsDto transferStatsDto, TransferStatsDto transferStatsDto2, MeteredDto meteredDto, RoamingDto roamingDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? null : transferStatsDto, (i & 4) != 0 ? null : transferStatsDto2, (i & 8) != 0 ? MeteredDto.INSTANCE.getZeroValue() : meteredDto, (i & 16) != 0 ? RoamingDto.INSTANCE.getZeroValue() : roamingDto);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public ConnectionMetricsDto(double d, TransferStatsDto transferStatsDto, TransferStatsDto transferStatsDto2, MeteredDto metered, RoamingDto roaming) {
                this(new Surrogate(d, transferStatsDto, transferStatsDto2, metered, roaming));
                Intrinsics.checkNotNullParameter(metered, "metered");
                Intrinsics.checkNotNullParameter(roaming, "roaming");
            }

            public static /* synthetic */ ConnectionMetricsDto copy$default(ConnectionMetricsDto connectionMetricsDto, double d, TransferStatsDto transferStatsDto, TransferStatsDto transferStatsDto2, MeteredDto meteredDto, RoamingDto roamingDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = connectionMetricsDto.surrogate.getTime_seconds();
                }
                double d2 = d;
                if ((i & 2) != 0) {
                    transferStatsDto = connectionMetricsDto.surrogate.getDownload();
                }
                TransferStatsDto transferStatsDto3 = transferStatsDto;
                if ((i & 4) != 0) {
                    transferStatsDto2 = connectionMetricsDto.surrogate.getUpload();
                }
                TransferStatsDto transferStatsDto4 = transferStatsDto2;
                if ((i & 8) != 0) {
                    meteredDto = connectionMetricsDto.surrogate.getMetered();
                }
                MeteredDto meteredDto2 = meteredDto;
                if ((i & 16) != 0) {
                    roamingDto = connectionMetricsDto.surrogate.getRoaming();
                }
                return connectionMetricsDto.copy(d2, transferStatsDto3, transferStatsDto4, meteredDto2, roamingDto);
            }

            public final ConnectionMetricsDto copy(double time_seconds, TransferStatsDto download, TransferStatsDto upload, MeteredDto metered, RoamingDto roaming) {
                Intrinsics.checkNotNullParameter(metered, "metered");
                Intrinsics.checkNotNullParameter(roaming, "roaming");
                return new ConnectionMetricsDto(new Surrogate(time_seconds, download, upload, metered, roaming));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public DeviceMetricEventData.NetworkMetrics.ConnectionMetrics toProto() {
                double time_seconds = this.surrogate.getTime_seconds();
                TransferStatsDto download = this.surrogate.getDownload();
                DeviceMetricEventData.NetworkMetrics.TransferStats proto = download != null ? download.toProto() : null;
                TransferStatsDto upload = this.surrogate.getUpload();
                return new DeviceMetricEventData.NetworkMetrics.ConnectionMetrics(time_seconds, proto, upload != null ? upload.toProto() : null, (DeviceMetricEventData.NetworkMetrics.Metered) this.surrogate.getMetered().toProto(), (DeviceMetricEventData.NetworkMetrics.Roaming) this.surrogate.getRoaming().toProto(), null, 32, null);
            }

            public String toString() {
                return "[ConnectionMetricsDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof ConnectionMetricsDto) && Intrinsics.areEqual(((ConnectionMetricsDto) other).surrogate, this.surrogate);
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
            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 92\u00020\u0001:\u000289BL\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fBK\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\u0018\u0010$\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003JN\u0010)\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0011HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J%\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010#¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto$Surrogate;", "", "time_seconds", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "download", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto;", "upload", "metered", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;", "roaming", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;", "<init>", "(DLcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTime_seconds$annotations", "()V", "getTime_seconds", "()D", "getDownload$annotations", "getDownload", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto;", "getUpload$annotations", "getUpload", "getMetered$annotations", "getMetered", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;", "getRoaming$annotations", "getRoaming", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final TransferStatsDto download;
                private final MeteredDto metered;
                private final RoamingDto roaming;
                private final double time_seconds;
                private final TransferStatsDto upload;

                public Surrogate() {
                    this(0.0d, (TransferStatsDto) null, (TransferStatsDto) null, (MeteredDto) null, (RoamingDto) null, 31, (DefaultConstructorMarker) null);
                }

                public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, double d, TransferStatsDto transferStatsDto, TransferStatsDto transferStatsDto2, MeteredDto meteredDto, RoamingDto roamingDto, int i, Object obj) {
                    if ((i & 1) != 0) {
                        d = surrogate.time_seconds;
                    }
                    double d2 = d;
                    if ((i & 2) != 0) {
                        transferStatsDto = surrogate.download;
                    }
                    TransferStatsDto transferStatsDto3 = transferStatsDto;
                    if ((i & 4) != 0) {
                        transferStatsDto2 = surrogate.upload;
                    }
                    TransferStatsDto transferStatsDto4 = transferStatsDto2;
                    if ((i & 8) != 0) {
                        meteredDto = surrogate.metered;
                    }
                    MeteredDto meteredDto2 = meteredDto;
                    if ((i & 16) != 0) {
                        roamingDto = surrogate.roaming;
                    }
                    return surrogate.copy(d2, transferStatsDto3, transferStatsDto4, meteredDto2, roamingDto);
                }

                @SerialName("download")
                @JsonAnnotations2(names = {"download"})
                public static /* synthetic */ void getDownload$annotations() {
                }

                @SerialName("metered")
                @JsonAnnotations2(names = {"metered"})
                public static /* synthetic */ void getMetered$annotations() {
                }

                @SerialName("roaming")
                @JsonAnnotations2(names = {"roaming"})
                public static /* synthetic */ void getRoaming$annotations() {
                }

                @SerialName("timeSeconds")
                @JsonAnnotations2(names = {"time_seconds"})
                public static /* synthetic */ void getTime_seconds$annotations() {
                }

                @SerialName("upload")
                @JsonAnnotations2(names = {"upload"})
                public static /* synthetic */ void getUpload$annotations() {
                }

                /* renamed from: component1, reason: from getter */
                public final double getTime_seconds() {
                    return this.time_seconds;
                }

                /* renamed from: component2, reason: from getter */
                public final TransferStatsDto getDownload() {
                    return this.download;
                }

                /* renamed from: component3, reason: from getter */
                public final TransferStatsDto getUpload() {
                    return this.upload;
                }

                /* renamed from: component4, reason: from getter */
                public final MeteredDto getMetered() {
                    return this.metered;
                }

                /* renamed from: component5, reason: from getter */
                public final RoamingDto getRoaming() {
                    return this.roaming;
                }

                public final Surrogate copy(double time_seconds, TransferStatsDto download, TransferStatsDto upload, MeteredDto metered, RoamingDto roaming) {
                    Intrinsics.checkNotNullParameter(metered, "metered");
                    Intrinsics.checkNotNullParameter(roaming, "roaming");
                    return new Surrogate(time_seconds, download, upload, metered, roaming);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Double.compare(this.time_seconds, surrogate.time_seconds) == 0 && Intrinsics.areEqual(this.download, surrogate.download) && Intrinsics.areEqual(this.upload, surrogate.upload) && this.metered == surrogate.metered && this.roaming == surrogate.roaming;
                }

                public int hashCode() {
                    int iHashCode = Double.hashCode(this.time_seconds) * 31;
                    TransferStatsDto transferStatsDto = this.download;
                    int iHashCode2 = (iHashCode + (transferStatsDto == null ? 0 : transferStatsDto.hashCode())) * 31;
                    TransferStatsDto transferStatsDto2 = this.upload;
                    return ((((iHashCode2 + (transferStatsDto2 != null ? transferStatsDto2.hashCode() : 0)) * 31) + this.metered.hashCode()) * 31) + this.roaming.hashCode();
                }

                public String toString() {
                    return "Surrogate(time_seconds=" + this.time_seconds + ", download=" + this.download + ", upload=" + this.upload + ", metered=" + this.metered + ", roaming=" + this.roaming + ")";
                }

                /* compiled from: DeviceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C36547xf4e4e27d.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, double d, TransferStatsDto transferStatsDto, TransferStatsDto transferStatsDto2, MeteredDto meteredDto, RoamingDto roamingDto, SerializationConstructorMarker serializationConstructorMarker) {
                    this.time_seconds = (i & 1) == 0 ? 0.0d : d;
                    if ((i & 2) == 0) {
                        this.download = null;
                    } else {
                        this.download = transferStatsDto;
                    }
                    if ((i & 4) == 0) {
                        this.upload = null;
                    } else {
                        this.upload = transferStatsDto2;
                    }
                    if ((i & 8) == 0) {
                        this.metered = MeteredDto.INSTANCE.getZeroValue();
                    } else {
                        this.metered = meteredDto;
                    }
                    if ((i & 16) == 0) {
                        this.roaming = RoamingDto.INSTANCE.getZeroValue();
                    } else {
                        this.roaming = roamingDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (Double.compare(self.time_seconds, 0.0d) != 0) {
                        output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.time_seconds));
                    }
                    TransferStatsDto transferStatsDto = self.download;
                    if (transferStatsDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, TransferStatsDto.Serializer.INSTANCE, transferStatsDto);
                    }
                    TransferStatsDto transferStatsDto2 = self.upload;
                    if (transferStatsDto2 != null) {
                        output.encodeNullableSerializableElement(serialDesc, 2, TransferStatsDto.Serializer.INSTANCE, transferStatsDto2);
                    }
                    if (self.metered != MeteredDto.INSTANCE.getZeroValue()) {
                        output.encodeSerializableElement(serialDesc, 3, MeteredDto.Serializer.INSTANCE, self.metered);
                    }
                    if (self.roaming != RoamingDto.INSTANCE.getZeroValue()) {
                        output.encodeSerializableElement(serialDesc, 4, RoamingDto.Serializer.INSTANCE, self.roaming);
                    }
                }

                public Surrogate(double d, TransferStatsDto transferStatsDto, TransferStatsDto transferStatsDto2, MeteredDto metered, RoamingDto roaming) {
                    Intrinsics.checkNotNullParameter(metered, "metered");
                    Intrinsics.checkNotNullParameter(roaming, "roaming");
                    this.time_seconds = d;
                    this.download = transferStatsDto;
                    this.upload = transferStatsDto2;
                    this.metered = metered;
                    this.roaming = roaming;
                }

                public final double getTime_seconds() {
                    return this.time_seconds;
                }

                public final TransferStatsDto getDownload() {
                    return this.download;
                }

                public final TransferStatsDto getUpload() {
                    return this.upload;
                }

                public final MeteredDto getMetered() {
                    return this.metered;
                }

                public /* synthetic */ Surrogate(double d, TransferStatsDto transferStatsDto, TransferStatsDto transferStatsDto2, MeteredDto meteredDto, RoamingDto roamingDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? null : transferStatsDto, (i & 4) != 0 ? null : transferStatsDto2, (i & 8) != 0 ? MeteredDto.INSTANCE.getZeroValue() : meteredDto, (i & 16) != 0 ? RoamingDto.INSTANCE.getZeroValue() : roamingDto);
                }

                public final RoamingDto getRoaming() {
                    return this.roaming;
                }
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$ConnectionMetrics;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<ConnectionMetricsDto, DeviceMetricEventData.NetworkMetrics.ConnectionMetrics> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ConnectionMetricsDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ConnectionMetricsDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ConnectionMetricsDto> getBinaryBase64Serializer() {
                    return (KSerializer) ConnectionMetricsDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<DeviceMetricEventData.NetworkMetrics.ConnectionMetrics> getProtoAdapter() {
                    return DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ConnectionMetricsDto getZeroValue() {
                    return ConnectionMetricsDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ConnectionMetricsDto fromProto(DeviceMetricEventData.NetworkMetrics.ConnectionMetrics proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    double time_seconds = proto.getTime_seconds();
                    DeviceMetricEventData.NetworkMetrics.TransferStats download = proto.getDownload();
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    TransferStatsDto transferStatsDtoFromProto = download != null ? TransferStatsDto.INSTANCE.fromProto(download) : null;
                    DeviceMetricEventData.NetworkMetrics.TransferStats upload = proto.getUpload();
                    return new ConnectionMetricsDto(new Surrogate(time_seconds, transferStatsDtoFromProto, upload != null ? TransferStatsDto.INSTANCE.fromProto(upload) : null, MeteredDto.INSTANCE.fromProto(proto.getMetered()), RoamingDto.INSTANCE.fromProto(proto.getRoaming())), defaultConstructorMarker);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DeviceMetricEventDataDto.NetworkMetricsDto.ConnectionMetricsDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new ConnectionMetricsDto(0.0d, null, null, null, null, 31, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<ConnectionMetricsDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.NetworkMetrics.ConnectionMetrics", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, ConnectionMetricsDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public ConnectionMetricsDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new ConnectionMetricsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4188_4)
                public final String provideIntoMap() {
                    return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$NetworkMetricsDto$ConnectionMetricsDto";
                }
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 !\"#B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$TransferStats;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto$Surrogate;)V", "kilobytes", "", "packets", "", "(DI)V", "getKilobytes", "()D", "getPackets", "()I", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class TransferStatsDto implements Dto3<DeviceMetricEventData.NetworkMetrics.TransferStats>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<TransferStatsDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<TransferStatsDto, DeviceMetricEventData.NetworkMetrics.TransferStats>> binaryBase64Serializer$delegate;
            private static final TransferStatsDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ TransferStatsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private TransferStatsDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final double getKilobytes() {
                return this.surrogate.getKilobytes();
            }

            public final int getPackets() {
                return this.surrogate.getPackets();
            }

            public TransferStatsDto(double d, int i) {
                this(new Surrogate(d, i));
            }

            public /* synthetic */ TransferStatsDto(double d, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 0.0d : d, (i2 & 2) != 0 ? 0 : i);
            }

            public static /* synthetic */ TransferStatsDto copy$default(TransferStatsDto transferStatsDto, double d, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    d = transferStatsDto.surrogate.getKilobytes();
                }
                if ((i2 & 2) != 0) {
                    i = transferStatsDto.surrogate.getPackets();
                }
                return transferStatsDto.copy(d, i);
            }

            public final TransferStatsDto copy(double kilobytes, int packets) {
                return new TransferStatsDto(new Surrogate(kilobytes, packets));
            }

            @Override // com.robinhood.idl.Dto
            public DeviceMetricEventData.NetworkMetrics.TransferStats toProto() {
                return new DeviceMetricEventData.NetworkMetrics.TransferStats(this.surrogate.getKilobytes(), this.surrogate.getPackets(), null, 4, null);
            }

            public String toString() {
                return "[TransferStatsDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof TransferStatsDto) && Intrinsics.areEqual(((TransferStatsDto) other).surrogate, this.surrogate);
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
            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002()B9\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\t¢\u0006\u0004\b\n\u0010\u000bB+\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u000fJ\u0018\u0010\u0017\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u0018\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto$Surrogate;", "", "kilobytes", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "packets", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "<init>", "(DI)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getKilobytes$annotations", "()V", "getKilobytes", "()D", "getPackets$annotations", "getPackets", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final double kilobytes;
                private final int packets;

                public Surrogate() {
                    this(0.0d, 0, 3, (DefaultConstructorMarker) null);
                }

                public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, double d, int i, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        d = surrogate.kilobytes;
                    }
                    if ((i2 & 2) != 0) {
                        i = surrogate.packets;
                    }
                    return surrogate.copy(d, i);
                }

                @SerialName("kilobytes")
                @JsonAnnotations2(names = {"kilobytes"})
                public static /* synthetic */ void getKilobytes$annotations() {
                }

                @SerialName("packets")
                @JsonAnnotations2(names = {"packets"})
                public static /* synthetic */ void getPackets$annotations() {
                }

                /* renamed from: component1, reason: from getter */
                public final double getKilobytes() {
                    return this.kilobytes;
                }

                /* renamed from: component2, reason: from getter */
                public final int getPackets() {
                    return this.packets;
                }

                public final Surrogate copy(double kilobytes, int packets) {
                    return new Surrogate(kilobytes, packets);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Double.compare(this.kilobytes, surrogate.kilobytes) == 0 && this.packets == surrogate.packets;
                }

                public int hashCode() {
                    return (Double.hashCode(this.kilobytes) * 31) + Integer.hashCode(this.packets);
                }

                public String toString() {
                    return "Surrogate(kilobytes=" + this.kilobytes + ", packets=" + this.packets + ")";
                }

                /* compiled from: DeviceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C36551xabc6206e.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, double d, int i2, SerializationConstructorMarker serializationConstructorMarker) {
                    this.kilobytes = (i & 1) == 0 ? 0.0d : d;
                    if ((i & 2) == 0) {
                        this.packets = 0;
                    } else {
                        this.packets = i2;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (Double.compare(self.kilobytes, 0.0d) != 0) {
                        output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.kilobytes));
                    }
                    int i = self.packets;
                    if (i != 0) {
                        output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                    }
                }

                public Surrogate(double d, int i) {
                    this.kilobytes = d;
                    this.packets = i;
                }

                public /* synthetic */ Surrogate(double d, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i2 & 1) != 0 ? 0.0d : d, (i2 & 2) != 0 ? 0 : i);
                }

                public final double getKilobytes() {
                    return this.kilobytes;
                }

                public final int getPackets() {
                    return this.packets;
                }
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$TransferStats;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<TransferStatsDto, DeviceMetricEventData.NetworkMetrics.TransferStats> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<TransferStatsDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TransferStatsDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TransferStatsDto> getBinaryBase64Serializer() {
                    return (KSerializer) TransferStatsDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<DeviceMetricEventData.NetworkMetrics.TransferStats> getProtoAdapter() {
                    return DeviceMetricEventData.NetworkMetrics.TransferStats.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TransferStatsDto getZeroValue() {
                    return TransferStatsDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TransferStatsDto fromProto(DeviceMetricEventData.NetworkMetrics.TransferStats proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new TransferStatsDto(new Surrogate(proto.getKilobytes(), proto.getPackets()), (DefaultConstructorMarker) null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DeviceMetricEventDataDto.NetworkMetricsDto.TransferStatsDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new TransferStatsDto(0.0d, 0, 3, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<TransferStatsDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.NetworkMetrics.TransferStats", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, TransferStatsDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public TransferStatsDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new TransferStatsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
                }
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4193_9)
                public final String provideIntoMap() {
                    return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$NetworkMetricsDto$TransferStatsDto";
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Metered;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "METERED_UNSPECIFIED", "METERED_ALL", "METERED_YES", "METERED_NO", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class MeteredDto implements Dto2<DeviceMetricEventData.NetworkMetrics.Metered>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ MeteredDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<MeteredDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<MeteredDto, DeviceMetricEventData.NetworkMetrics.Metered>> binaryBase64Serializer$delegate;
            public static final MeteredDto METERED_UNSPECIFIED = new METERED_UNSPECIFIED("METERED_UNSPECIFIED", 0);
            public static final MeteredDto METERED_ALL = new METERED_ALL("METERED_ALL", 1);
            public static final MeteredDto METERED_YES = new METERED_YES("METERED_YES", 2);
            public static final MeteredDto METERED_NO = new METERED_NO("METERED_NO", 3);

            private static final /* synthetic */ MeteredDto[] $values() {
                return new MeteredDto[]{METERED_UNSPECIFIED, METERED_ALL, METERED_YES, METERED_NO};
            }

            public /* synthetic */ MeteredDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i);
            }

            public static EnumEntries<MeteredDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private MeteredDto(String str, int i) {
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto.NetworkMetricsDto.MeteredDto.METERED_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Metered;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class METERED_UNSPECIFIED extends MeteredDto {
                METERED_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public DeviceMetricEventData.NetworkMetrics.Metered toProto() {
                    return DeviceMetricEventData.NetworkMetrics.Metered.METERED_UNSPECIFIED;
                }
            }

            static {
                MeteredDto[] meteredDtoArr$values = $values();
                $VALUES = meteredDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(meteredDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DeviceMetricEventDataDto.NetworkMetricsDto.MeteredDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto.NetworkMetricsDto.MeteredDto.METERED_ALL", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Metered;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class METERED_ALL extends MeteredDto {
                METERED_ALL(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public DeviceMetricEventData.NetworkMetrics.Metered toProto() {
                    return DeviceMetricEventData.NetworkMetrics.Metered.METERED_ALL;
                }
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto.NetworkMetricsDto.MeteredDto.METERED_YES", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Metered;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class METERED_YES extends MeteredDto {
                METERED_YES(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public DeviceMetricEventData.NetworkMetrics.Metered toProto() {
                    return DeviceMetricEventData.NetworkMetrics.Metered.METERED_YES;
                }
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto.NetworkMetricsDto.MeteredDto.METERED_NO", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Metered;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class METERED_NO extends MeteredDto {
                METERED_NO(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public DeviceMetricEventData.NetworkMetrics.Metered toProto() {
                    return DeviceMetricEventData.NetworkMetrics.Metered.METERED_NO;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Metered;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto2.Creator<MeteredDto, DeviceMetricEventData.NetworkMetrics.Metered> {

                /* compiled from: DeviceMetricEventDataDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes26.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[DeviceMetricEventData.NetworkMetrics.Metered.values().length];
                        try {
                            iArr[DeviceMetricEventData.NetworkMetrics.Metered.METERED_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DeviceMetricEventData.NetworkMetrics.Metered.METERED_ALL.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[DeviceMetricEventData.NetworkMetrics.Metered.METERED_YES.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[DeviceMetricEventData.NetworkMetrics.Metered.METERED_NO.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<MeteredDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<MeteredDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<MeteredDto> getBinaryBase64Serializer() {
                    return (KSerializer) MeteredDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<DeviceMetricEventData.NetworkMetrics.Metered> getProtoAdapter() {
                    return DeviceMetricEventData.NetworkMetrics.Metered.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public MeteredDto getZeroValue() {
                    return MeteredDto.METERED_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public MeteredDto fromProto(DeviceMetricEventData.NetworkMetrics.Metered proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                    if (i == 1) {
                        return MeteredDto.METERED_UNSPECIFIED;
                    }
                    if (i == 2) {
                        return MeteredDto.METERED_ALL;
                    }
                    if (i == 3) {
                        return MeteredDto.METERED_YES;
                    }
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return MeteredDto.METERED_NO;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MeteredDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<MeteredDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<MeteredDto, DeviceMetricEventData.NetworkMetrics.Metered> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.NetworkMetrics.Metered", MeteredDto.getEntries(), MeteredDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public MeteredDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (MeteredDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, MeteredDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static MeteredDto valueOf(String str) {
                return (MeteredDto) Enum.valueOf(MeteredDto.class, str);
            }

            public static MeteredDto[] values() {
                return (MeteredDto[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Roaming;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ROAMING_UNSPECIFIED", "ROAMING_ALL", "ROAMING_YES", "ROAMING_NO", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class RoamingDto implements Dto2<DeviceMetricEventData.NetworkMetrics.Roaming>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ RoamingDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<RoamingDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<RoamingDto, DeviceMetricEventData.NetworkMetrics.Roaming>> binaryBase64Serializer$delegate;
            public static final RoamingDto ROAMING_UNSPECIFIED = new ROAMING_UNSPECIFIED("ROAMING_UNSPECIFIED", 0);
            public static final RoamingDto ROAMING_ALL = new ROAMING_ALL("ROAMING_ALL", 1);
            public static final RoamingDto ROAMING_YES = new ROAMING_YES("ROAMING_YES", 2);
            public static final RoamingDto ROAMING_NO = new ROAMING_NO("ROAMING_NO", 3);

            private static final /* synthetic */ RoamingDto[] $values() {
                return new RoamingDto[]{ROAMING_UNSPECIFIED, ROAMING_ALL, ROAMING_YES, ROAMING_NO};
            }

            public /* synthetic */ RoamingDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i);
            }

            public static EnumEntries<RoamingDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private RoamingDto(String str, int i) {
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto.NetworkMetricsDto.RoamingDto.ROAMING_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Roaming;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class ROAMING_UNSPECIFIED extends RoamingDto {
                ROAMING_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public DeviceMetricEventData.NetworkMetrics.Roaming toProto() {
                    return DeviceMetricEventData.NetworkMetrics.Roaming.ROAMING_UNSPECIFIED;
                }
            }

            static {
                RoamingDto[] roamingDtoArr$values = $values();
                $VALUES = roamingDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(roamingDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DeviceMetricEventDataDto.NetworkMetricsDto.RoamingDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto.NetworkMetricsDto.RoamingDto.ROAMING_ALL", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Roaming;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class ROAMING_ALL extends RoamingDto {
                ROAMING_ALL(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public DeviceMetricEventData.NetworkMetrics.Roaming toProto() {
                    return DeviceMetricEventData.NetworkMetrics.Roaming.ROAMING_ALL;
                }
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto.NetworkMetricsDto.RoamingDto.ROAMING_YES", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Roaming;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class ROAMING_YES extends RoamingDto {
                ROAMING_YES(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public DeviceMetricEventData.NetworkMetrics.Roaming toProto() {
                    return DeviceMetricEventData.NetworkMetrics.Roaming.ROAMING_YES;
                }
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto.NetworkMetricsDto.RoamingDto.ROAMING_NO", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Roaming;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class ROAMING_NO extends RoamingDto {
                ROAMING_NO(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public DeviceMetricEventData.NetworkMetrics.Roaming toProto() {
                    return DeviceMetricEventData.NetworkMetrics.Roaming.ROAMING_NO;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Roaming;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto2.Creator<RoamingDto, DeviceMetricEventData.NetworkMetrics.Roaming> {

                /* compiled from: DeviceMetricEventDataDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes26.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[DeviceMetricEventData.NetworkMetrics.Roaming.values().length];
                        try {
                            iArr[DeviceMetricEventData.NetworkMetrics.Roaming.ROAMING_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DeviceMetricEventData.NetworkMetrics.Roaming.ROAMING_ALL.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[DeviceMetricEventData.NetworkMetrics.Roaming.ROAMING_YES.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[DeviceMetricEventData.NetworkMetrics.Roaming.ROAMING_NO.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<RoamingDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<RoamingDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<RoamingDto> getBinaryBase64Serializer() {
                    return (KSerializer) RoamingDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<DeviceMetricEventData.NetworkMetrics.Roaming> getProtoAdapter() {
                    return DeviceMetricEventData.NetworkMetrics.Roaming.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public RoamingDto getZeroValue() {
                    return RoamingDto.ROAMING_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public RoamingDto fromProto(DeviceMetricEventData.NetworkMetrics.Roaming proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                    if (i == 1) {
                        return RoamingDto.ROAMING_UNSPECIFIED;
                    }
                    if (i == 2) {
                        return RoamingDto.ROAMING_ALL;
                    }
                    if (i == 3) {
                        return RoamingDto.ROAMING_YES;
                    }
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return RoamingDto.ROAMING_NO;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$RoamingDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<RoamingDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<RoamingDto, DeviceMetricEventData.NetworkMetrics.Roaming> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.NetworkMetrics.Roaming", RoamingDto.getEntries(), RoamingDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public RoamingDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (RoamingDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, RoamingDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static RoamingDto valueOf(String str) {
                return (RoamingDto) Enum.valueOf(RoamingDto.class, str);
            }

            public static RoamingDto[] values() {
                return (RoamingDto[]) $VALUES.clone();
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<NetworkMetricsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.NetworkMetrics", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, NetworkMetricsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public NetworkMetricsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new NetworkMetricsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$NetworkMetricsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$NetworkMetricsDto";
            }
        }
    }

    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u000eJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000bJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ResponsivenessMetrics;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto$Surrogate;)V", "janky_frame_percentage", "", "total_hang_time_seconds", "", "total_hang_time_percentage", "scroll_hitch_time_ratio_ms_per_second", "(FDFD)V", "getJanky_frame_percentage", "()F", "getTotal_hang_time_seconds", "()D", "getTotal_hang_time_percentage", "getScroll_hitch_time_ratio_ms_per_second", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ResponsivenessMetricsDto implements Dto3<DeviceMetricEventData.ResponsivenessMetrics>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ResponsivenessMetricsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ResponsivenessMetricsDto, DeviceMetricEventData.ResponsivenessMetrics>> binaryBase64Serializer$delegate;
        private static final ResponsivenessMetricsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ResponsivenessMetricsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ResponsivenessMetricsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final float getJanky_frame_percentage() {
            return this.surrogate.getJanky_frame_percentage();
        }

        public final double getTotal_hang_time_seconds() {
            return this.surrogate.getTotal_hang_time_seconds();
        }

        public final float getTotal_hang_time_percentage() {
            return this.surrogate.getTotal_hang_time_percentage();
        }

        public final double getScroll_hitch_time_ratio_ms_per_second() {
            return this.surrogate.getScroll_hitch_time_ratio_ms_per_second();
        }

        public /* synthetic */ ResponsivenessMetricsDto(float f, double d, float f2, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0d : d2);
        }

        public ResponsivenessMetricsDto(float f, double d, float f2, double d2) {
            this(new Surrogate(f, d, f2, d2));
        }

        public static /* synthetic */ ResponsivenessMetricsDto copy$default(ResponsivenessMetricsDto responsivenessMetricsDto, float f, double d, float f2, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = responsivenessMetricsDto.surrogate.getJanky_frame_percentage();
            }
            if ((i & 2) != 0) {
                d = responsivenessMetricsDto.surrogate.getTotal_hang_time_seconds();
            }
            if ((i & 4) != 0) {
                f2 = responsivenessMetricsDto.surrogate.getTotal_hang_time_percentage();
            }
            if ((i & 8) != 0) {
                d2 = responsivenessMetricsDto.surrogate.getScroll_hitch_time_ratio_ms_per_second();
            }
            float f3 = f2;
            return responsivenessMetricsDto.copy(f, d, f3, d2);
        }

        public final ResponsivenessMetricsDto copy(float janky_frame_percentage, double total_hang_time_seconds, float total_hang_time_percentage, double scroll_hitch_time_ratio_ms_per_second) {
            return new ResponsivenessMetricsDto(new Surrogate(janky_frame_percentage, total_hang_time_seconds, total_hang_time_percentage, scroll_hitch_time_ratio_ms_per_second));
        }

        @Override // com.robinhood.idl.Dto
        public DeviceMetricEventData.ResponsivenessMetrics toProto() {
            return new DeviceMetricEventData.ResponsivenessMetrics(this.surrogate.getJanky_frame_percentage(), this.surrogate.getTotal_hang_time_seconds(), this.surrogate.getTotal_hang_time_percentage(), this.surrogate.getScroll_hitch_time_ratio_ms_per_second(), null, 16, null);
        }

        public String toString() {
            return "[ResponsivenessMetricsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ResponsivenessMetricsDto) && Intrinsics.areEqual(((ResponsivenessMetricsDto) other).surrogate, this.surrogate);
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
        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000212Bk\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\t¢\u0006\u0004\b\f\u0010\rB;\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\u0018\u0010\u001e\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001f\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\tHÆ\u0003J\u0018\u0010 \u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010!\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\tHÆ\u0003Jm\u0010\"\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\t2\u0017\b\u0002\u0010\n\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u000b\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\tHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u000fHÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R+\u0010\n\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R+\u0010\u000b\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0019¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto$Surrogate;", "", "janky_frame_percentage", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "total_hang_time_seconds", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "total_hang_time_percentage", "scroll_hitch_time_ratio_ms_per_second", "<init>", "(FDFD)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IFDFDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getJanky_frame_percentage$annotations", "()V", "getJanky_frame_percentage", "()F", "getTotal_hang_time_seconds$annotations", "getTotal_hang_time_seconds", "()D", "getTotal_hang_time_percentage$annotations", "getTotal_hang_time_percentage", "getScroll_hitch_time_ratio_ms_per_second$annotations", "getScroll_hitch_time_ratio_ms_per_second", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final float janky_frame_percentage;
            private final double scroll_hitch_time_ratio_ms_per_second;
            private final float total_hang_time_percentage;
            private final double total_hang_time_seconds;

            public Surrogate() {
                this(0.0f, 0.0d, 0.0f, 0.0d, 15, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, float f, double d, float f2, double d2, int i, Object obj) {
                if ((i & 1) != 0) {
                    f = surrogate.janky_frame_percentage;
                }
                if ((i & 2) != 0) {
                    d = surrogate.total_hang_time_seconds;
                }
                if ((i & 4) != 0) {
                    f2 = surrogate.total_hang_time_percentage;
                }
                if ((i & 8) != 0) {
                    d2 = surrogate.scroll_hitch_time_ratio_ms_per_second;
                }
                float f3 = f2;
                return surrogate.copy(f, d, f3, d2);
            }

            @SerialName("jankyFramePercentage")
            @JsonAnnotations2(names = {"janky_frame_percentage"})
            public static /* synthetic */ void getJanky_frame_percentage$annotations() {
            }

            @SerialName("scrollHitchTimeRatioMsPerSecond")
            @JsonAnnotations2(names = {"scroll_hitch_time_ratio_ms_per_second"})
            public static /* synthetic */ void getScroll_hitch_time_ratio_ms_per_second$annotations() {
            }

            @SerialName("totalHangTimePercentage")
            @JsonAnnotations2(names = {"total_hang_time_percentage"})
            public static /* synthetic */ void getTotal_hang_time_percentage$annotations() {
            }

            @SerialName("totalHangTimeSeconds")
            @JsonAnnotations2(names = {"total_hang_time_seconds"})
            public static /* synthetic */ void getTotal_hang_time_seconds$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final float getJanky_frame_percentage() {
                return this.janky_frame_percentage;
            }

            /* renamed from: component2, reason: from getter */
            public final double getTotal_hang_time_seconds() {
                return this.total_hang_time_seconds;
            }

            /* renamed from: component3, reason: from getter */
            public final float getTotal_hang_time_percentage() {
                return this.total_hang_time_percentage;
            }

            /* renamed from: component4, reason: from getter */
            public final double getScroll_hitch_time_ratio_ms_per_second() {
                return this.scroll_hitch_time_ratio_ms_per_second;
            }

            public final Surrogate copy(float janky_frame_percentage, double total_hang_time_seconds, float total_hang_time_percentage, double scroll_hitch_time_ratio_ms_per_second) {
                return new Surrogate(janky_frame_percentage, total_hang_time_seconds, total_hang_time_percentage, scroll_hitch_time_ratio_ms_per_second);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Float.compare(this.janky_frame_percentage, surrogate.janky_frame_percentage) == 0 && Double.compare(this.total_hang_time_seconds, surrogate.total_hang_time_seconds) == 0 && Float.compare(this.total_hang_time_percentage, surrogate.total_hang_time_percentage) == 0 && Double.compare(this.scroll_hitch_time_ratio_ms_per_second, surrogate.scroll_hitch_time_ratio_ms_per_second) == 0;
            }

            public int hashCode() {
                return (((((Float.hashCode(this.janky_frame_percentage) * 31) + Double.hashCode(this.total_hang_time_seconds)) * 31) + Float.hashCode(this.total_hang_time_percentage)) * 31) + Double.hashCode(this.scroll_hitch_time_ratio_ms_per_second);
            }

            public String toString() {
                return "Surrogate(janky_frame_percentage=" + this.janky_frame_percentage + ", total_hang_time_seconds=" + this.total_hang_time_seconds + ", total_hang_time_percentage=" + this.total_hang_time_percentage + ", scroll_hitch_time_ratio_ms_per_second=" + this.scroll_hitch_time_ratio_ms_per_second + ")";
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return C36553x4077d4d0.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, float f, double d, float f2, double d2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.janky_frame_percentage = 0.0f;
                } else {
                    this.janky_frame_percentage = f;
                }
                if ((i & 2) == 0) {
                    this.total_hang_time_seconds = 0.0d;
                } else {
                    this.total_hang_time_seconds = d;
                }
                if ((i & 4) == 0) {
                    this.total_hang_time_percentage = 0.0f;
                } else {
                    this.total_hang_time_percentage = f2;
                }
                if ((i & 8) == 0) {
                    this.scroll_hitch_time_ratio_ms_per_second = 0.0d;
                } else {
                    this.scroll_hitch_time_ratio_ms_per_second = d2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Float.compare(self.janky_frame_percentage, 0.0f) != 0) {
                    output.encodeSerializableElement(serialDesc, 0, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.janky_frame_percentage));
                }
                if (Double.compare(self.total_hang_time_seconds, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.total_hang_time_seconds));
                }
                if (Float.compare(self.total_hang_time_percentage, 0.0f) != 0) {
                    output.encodeSerializableElement(serialDesc, 2, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.total_hang_time_percentage));
                }
                if (Double.compare(self.scroll_hitch_time_ratio_ms_per_second, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.scroll_hitch_time_ratio_ms_per_second));
                }
            }

            public Surrogate(float f, double d, float f2, double d2) {
                this.janky_frame_percentage = f;
                this.total_hang_time_seconds = d;
                this.total_hang_time_percentage = f2;
                this.scroll_hitch_time_ratio_ms_per_second = d2;
            }

            public /* synthetic */ Surrogate(float f, double d, float f2, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0d : d2);
            }

            public final float getJanky_frame_percentage() {
                return this.janky_frame_percentage;
            }

            public final double getTotal_hang_time_seconds() {
                return this.total_hang_time_seconds;
            }

            public final float getTotal_hang_time_percentage() {
                return this.total_hang_time_percentage;
            }

            public final double getScroll_hitch_time_ratio_ms_per_second() {
                return this.scroll_hitch_time_ratio_ms_per_second;
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ResponsivenessMetrics;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<ResponsivenessMetricsDto, DeviceMetricEventData.ResponsivenessMetrics> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ResponsivenessMetricsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ResponsivenessMetricsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ResponsivenessMetricsDto> getBinaryBase64Serializer() {
                return (KSerializer) ResponsivenessMetricsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DeviceMetricEventData.ResponsivenessMetrics> getProtoAdapter() {
                return DeviceMetricEventData.ResponsivenessMetrics.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ResponsivenessMetricsDto getZeroValue() {
                return ResponsivenessMetricsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ResponsivenessMetricsDto fromProto(DeviceMetricEventData.ResponsivenessMetrics proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new ResponsivenessMetricsDto(new Surrogate(proto.getJanky_frame_percentage(), proto.getTotal_hang_time_seconds(), proto.getTotal_hang_time_percentage(), proto.getScroll_hitch_time_ratio_ms_per_second()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$ResponsivenessMetricsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceMetricEventDataDto.ResponsivenessMetricsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ResponsivenessMetricsDto(0.0f, 0.0d, 0.0f, 0.0d, 15, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ResponsivenessMetricsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.ResponsivenessMetrics", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ResponsivenessMetricsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ResponsivenessMetricsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ResponsivenessMetricsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ResponsivenessMetricsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4185_1)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$ResponsivenessMetricsDto";
            }
        }
    }

    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"#$%B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\rJ$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\tH\u0016J\b\u0010!\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$LaunchMetrics;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto$Surrogate;)V", "launch_count", "", "resume_count", "time_to_first_draw_ms", "", "(IID)V", "getLaunch_count", "()I", "getResume_count", "getTime_to_first_draw_ms", "()D", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class LaunchMetricsDto implements Dto3<DeviceMetricEventData.LaunchMetrics>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<LaunchMetricsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<LaunchMetricsDto, DeviceMetricEventData.LaunchMetrics>> binaryBase64Serializer$delegate;
        private static final LaunchMetricsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ LaunchMetricsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private LaunchMetricsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final int getLaunch_count() {
            return this.surrogate.getLaunch_count();
        }

        public final int getResume_count() {
            return this.surrogate.getResume_count();
        }

        public final double getTime_to_first_draw_ms() {
            return this.surrogate.getTime_to_first_draw_ms();
        }

        public /* synthetic */ LaunchMetricsDto(int i, int i2, double d, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0.0d : d);
        }

        public LaunchMetricsDto(int i, int i2, double d) {
            this(new Surrogate(i, i2, d));
        }

        public static /* synthetic */ LaunchMetricsDto copy$default(LaunchMetricsDto launchMetricsDto, int i, int i2, double d, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = launchMetricsDto.surrogate.getLaunch_count();
            }
            if ((i3 & 2) != 0) {
                i2 = launchMetricsDto.surrogate.getResume_count();
            }
            if ((i3 & 4) != 0) {
                d = launchMetricsDto.surrogate.getTime_to_first_draw_ms();
            }
            return launchMetricsDto.copy(i, i2, d);
        }

        public final LaunchMetricsDto copy(int launch_count, int resume_count, double time_to_first_draw_ms) {
            return new LaunchMetricsDto(new Surrogate(launch_count, resume_count, time_to_first_draw_ms));
        }

        @Override // com.robinhood.idl.Dto
        public DeviceMetricEventData.LaunchMetrics toProto() {
            return new DeviceMetricEventData.LaunchMetrics(this.surrogate.getLaunch_count(), this.surrogate.getResume_count(), this.surrogate.getTime_to_first_draw_ms(), null, 8, null);
        }

        public String toString() {
            return "[LaunchMetricsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof LaunchMetricsDto) && Intrinsics.areEqual(((LaunchMetricsDto) other).surrogate, this.surrogate);
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
        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002,-BR\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\n¢\u0006\u0004\b\u000b\u0010\fB3\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0010J\u0018\u0010\u001a\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001c\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\nHÆ\u0003JT\u0010\u001d\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R+\u0010\b\u001a\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto$Surrogate;", "", "launch_count", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "resume_count", "time_to_first_draw_ms", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "<init>", "(IID)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLaunch_count$annotations", "()V", "getLaunch_count", "()I", "getResume_count$annotations", "getResume_count", "getTime_to_first_draw_ms$annotations", "getTime_to_first_draw_ms", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final int launch_count;
            private final int resume_count;
            private final double time_to_first_draw_ms;

            public Surrogate() {
                this(0, 0, 0.0d, 7, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, int i, int i2, double d, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = surrogate.launch_count;
                }
                if ((i3 & 2) != 0) {
                    i2 = surrogate.resume_count;
                }
                if ((i3 & 4) != 0) {
                    d = surrogate.time_to_first_draw_ms;
                }
                return surrogate.copy(i, i2, d);
            }

            @SerialName("launchCount")
            @JsonAnnotations2(names = {"launch_count"})
            public static /* synthetic */ void getLaunch_count$annotations() {
            }

            @SerialName("resumeCount")
            @JsonAnnotations2(names = {"resume_count"})
            public static /* synthetic */ void getResume_count$annotations() {
            }

            @SerialName("timeToFirstDrawMs")
            @JsonAnnotations2(names = {"time_to_first_draw_ms"})
            public static /* synthetic */ void getTime_to_first_draw_ms$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final int getLaunch_count() {
                return this.launch_count;
            }

            /* renamed from: component2, reason: from getter */
            public final int getResume_count() {
                return this.resume_count;
            }

            /* renamed from: component3, reason: from getter */
            public final double getTime_to_first_draw_ms() {
                return this.time_to_first_draw_ms;
            }

            public final Surrogate copy(int launch_count, int resume_count, double time_to_first_draw_ms) {
                return new Surrogate(launch_count, resume_count, time_to_first_draw_ms);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.launch_count == surrogate.launch_count && this.resume_count == surrogate.resume_count && Double.compare(this.time_to_first_draw_ms, surrogate.time_to_first_draw_ms) == 0;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.launch_count) * 31) + Integer.hashCode(this.resume_count)) * 31) + Double.hashCode(this.time_to_first_draw_ms);
            }

            public String toString() {
                return "Surrogate(launch_count=" + this.launch_count + ", resume_count=" + this.resume_count + ", time_to_first_draw_ms=" + this.time_to_first_draw_ms + ")";
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return DeviceMetricEventDataDto$LaunchMetricsDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, int i2, int i3, double d, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.launch_count = 0;
                } else {
                    this.launch_count = i2;
                }
                if ((i & 2) == 0) {
                    this.resume_count = 0;
                } else {
                    this.resume_count = i3;
                }
                if ((i & 4) == 0) {
                    this.time_to_first_draw_ms = 0.0d;
                } else {
                    this.time_to_first_draw_ms = d;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                int i = self.launch_count;
                if (i != 0) {
                    output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                }
                int i2 = self.resume_count;
                if (i2 != 0) {
                    output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
                }
                if (Double.compare(self.time_to_first_draw_ms, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.time_to_first_draw_ms));
                }
            }

            public Surrogate(int i, int i2, double d) {
                this.launch_count = i;
                this.resume_count = i2;
                this.time_to_first_draw_ms = d;
            }

            public /* synthetic */ Surrogate(int i, int i2, double d, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0.0d : d);
            }

            public final int getLaunch_count() {
                return this.launch_count;
            }

            public final int getResume_count() {
                return this.resume_count;
            }

            public final double getTime_to_first_draw_ms() {
                return this.time_to_first_draw_ms;
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$LaunchMetrics;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<LaunchMetricsDto, DeviceMetricEventData.LaunchMetrics> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<LaunchMetricsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<LaunchMetricsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<LaunchMetricsDto> getBinaryBase64Serializer() {
                return (KSerializer) LaunchMetricsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DeviceMetricEventData.LaunchMetrics> getProtoAdapter() {
                return DeviceMetricEventData.LaunchMetrics.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public LaunchMetricsDto getZeroValue() {
                return LaunchMetricsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public LaunchMetricsDto fromProto(DeviceMetricEventData.LaunchMetrics proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new LaunchMetricsDto(new Surrogate(proto.getLaunch_count(), proto.getResume_count(), proto.getTime_to_first_draw_ms()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$LaunchMetricsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceMetricEventDataDto.LaunchMetricsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new LaunchMetricsDto(0, 0, 0.0d, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<LaunchMetricsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.LaunchMetrics", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, LaunchMetricsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public LaunchMetricsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new LaunchMetricsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$LaunchMetricsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4191_7)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$LaunchMetricsDto";
            }
        }
    }

    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006!\"#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001e\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$Surrogate;)V", "background_exit_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto;", "foreground_exit_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto;", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto;)V", "getBackground_exit_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto;", "getForeground_exit_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "BackgroundExitMetricsDto", "ForegroundExitMetricsDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ExitMetricsDto implements Dto3<DeviceMetricEventData.ExitMetrics>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ExitMetricsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ExitMetricsDto, DeviceMetricEventData.ExitMetrics>> binaryBase64Serializer$delegate;
        private static final ExitMetricsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ExitMetricsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ExitMetricsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final BackgroundExitMetricsDto getBackground_exit_metrics() {
            return this.surrogate.getBackground_exit_metrics();
        }

        public final ForegroundExitMetricsDto getForeground_exit_metrics() {
            return this.surrogate.getForeground_exit_metrics();
        }

        public ExitMetricsDto(BackgroundExitMetricsDto backgroundExitMetricsDto, ForegroundExitMetricsDto foregroundExitMetricsDto) {
            this(new Surrogate(backgroundExitMetricsDto, foregroundExitMetricsDto));
        }

        public /* synthetic */ ExitMetricsDto(BackgroundExitMetricsDto backgroundExitMetricsDto, ForegroundExitMetricsDto foregroundExitMetricsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : backgroundExitMetricsDto, (i & 2) != 0 ? null : foregroundExitMetricsDto);
        }

        public static /* synthetic */ ExitMetricsDto copy$default(ExitMetricsDto exitMetricsDto, BackgroundExitMetricsDto backgroundExitMetricsDto, ForegroundExitMetricsDto foregroundExitMetricsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                backgroundExitMetricsDto = exitMetricsDto.surrogate.getBackground_exit_metrics();
            }
            if ((i & 2) != 0) {
                foregroundExitMetricsDto = exitMetricsDto.surrogate.getForeground_exit_metrics();
            }
            return exitMetricsDto.copy(backgroundExitMetricsDto, foregroundExitMetricsDto);
        }

        public final ExitMetricsDto copy(BackgroundExitMetricsDto background_exit_metrics, ForegroundExitMetricsDto foreground_exit_metrics) {
            return new ExitMetricsDto(new Surrogate(background_exit_metrics, foreground_exit_metrics));
        }

        @Override // com.robinhood.idl.Dto
        public DeviceMetricEventData.ExitMetrics toProto() {
            BackgroundExitMetricsDto background_exit_metrics = this.surrogate.getBackground_exit_metrics();
            DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics proto = background_exit_metrics != null ? background_exit_metrics.toProto() : null;
            ForegroundExitMetricsDto foreground_exit_metrics = this.surrogate.getForeground_exit_metrics();
            return new DeviceMetricEventData.ExitMetrics(proto, foreground_exit_metrics != null ? foreground_exit_metrics.toProto() : null, null, 4, null);
        }

        public String toString() {
            return "[ExitMetricsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ExitMetricsDto) && Intrinsics.areEqual(((ExitMetricsDto) other).surrogate, this.surrogate);
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
        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$Surrogate;", "", "background_exit_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto;", "foreground_exit_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBackground_exit_metrics$annotations", "()V", "getBackground_exit_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto;", "getForeground_exit_metrics$annotations", "getForeground_exit_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final BackgroundExitMetricsDto background_exit_metrics;
            private final ForegroundExitMetricsDto foreground_exit_metrics;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((BackgroundExitMetricsDto) null, (ForegroundExitMetricsDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, BackgroundExitMetricsDto backgroundExitMetricsDto, ForegroundExitMetricsDto foregroundExitMetricsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    backgroundExitMetricsDto = surrogate.background_exit_metrics;
                }
                if ((i & 2) != 0) {
                    foregroundExitMetricsDto = surrogate.foreground_exit_metrics;
                }
                return surrogate.copy(backgroundExitMetricsDto, foregroundExitMetricsDto);
            }

            @SerialName("backgroundExitMetrics")
            @JsonAnnotations2(names = {"background_exit_metrics"})
            public static /* synthetic */ void getBackground_exit_metrics$annotations() {
            }

            @SerialName("foregroundExitMetrics")
            @JsonAnnotations2(names = {"foreground_exit_metrics"})
            public static /* synthetic */ void getForeground_exit_metrics$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final BackgroundExitMetricsDto getBackground_exit_metrics() {
                return this.background_exit_metrics;
            }

            /* renamed from: component2, reason: from getter */
            public final ForegroundExitMetricsDto getForeground_exit_metrics() {
                return this.foreground_exit_metrics;
            }

            public final Surrogate copy(BackgroundExitMetricsDto background_exit_metrics, ForegroundExitMetricsDto foreground_exit_metrics) {
                return new Surrogate(background_exit_metrics, foreground_exit_metrics);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.background_exit_metrics, surrogate.background_exit_metrics) && Intrinsics.areEqual(this.foreground_exit_metrics, surrogate.foreground_exit_metrics);
            }

            public int hashCode() {
                BackgroundExitMetricsDto backgroundExitMetricsDto = this.background_exit_metrics;
                int iHashCode = (backgroundExitMetricsDto == null ? 0 : backgroundExitMetricsDto.hashCode()) * 31;
                ForegroundExitMetricsDto foregroundExitMetricsDto = this.foreground_exit_metrics;
                return iHashCode + (foregroundExitMetricsDto != null ? foregroundExitMetricsDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(background_exit_metrics=" + this.background_exit_metrics + ", foreground_exit_metrics=" + this.foreground_exit_metrics + ")";
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return DeviceMetricEventDataDto$ExitMetricsDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, BackgroundExitMetricsDto backgroundExitMetricsDto, ForegroundExitMetricsDto foregroundExitMetricsDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.background_exit_metrics = null;
                } else {
                    this.background_exit_metrics = backgroundExitMetricsDto;
                }
                if ((i & 2) == 0) {
                    this.foreground_exit_metrics = null;
                } else {
                    this.foreground_exit_metrics = foregroundExitMetricsDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                BackgroundExitMetricsDto backgroundExitMetricsDto = self.background_exit_metrics;
                if (backgroundExitMetricsDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, BackgroundExitMetricsDto.Serializer.INSTANCE, backgroundExitMetricsDto);
                }
                ForegroundExitMetricsDto foregroundExitMetricsDto = self.foreground_exit_metrics;
                if (foregroundExitMetricsDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, ForegroundExitMetricsDto.Serializer.INSTANCE, foregroundExitMetricsDto);
                }
            }

            public Surrogate(BackgroundExitMetricsDto backgroundExitMetricsDto, ForegroundExitMetricsDto foregroundExitMetricsDto) {
                this.background_exit_metrics = backgroundExitMetricsDto;
                this.foreground_exit_metrics = foregroundExitMetricsDto;
            }

            public /* synthetic */ Surrogate(BackgroundExitMetricsDto backgroundExitMetricsDto, ForegroundExitMetricsDto foregroundExitMetricsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : backgroundExitMetricsDto, (i & 2) != 0 ? null : foregroundExitMetricsDto);
            }

            public final BackgroundExitMetricsDto getBackground_exit_metrics() {
                return this.background_exit_metrics;
            }

            public final ForegroundExitMetricsDto getForeground_exit_metrics() {
                return this.foreground_exit_metrics;
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<ExitMetricsDto, DeviceMetricEventData.ExitMetrics> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ExitMetricsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ExitMetricsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ExitMetricsDto> getBinaryBase64Serializer() {
                return (KSerializer) ExitMetricsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DeviceMetricEventData.ExitMetrics> getProtoAdapter() {
                return DeviceMetricEventData.ExitMetrics.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ExitMetricsDto getZeroValue() {
                return ExitMetricsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ExitMetricsDto fromProto(DeviceMetricEventData.ExitMetrics proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics background_exit_metrics = proto.getBackground_exit_metrics();
                DefaultConstructorMarker defaultConstructorMarker = null;
                BackgroundExitMetricsDto backgroundExitMetricsDtoFromProto = background_exit_metrics != null ? BackgroundExitMetricsDto.INSTANCE.fromProto(background_exit_metrics) : null;
                DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics foreground_exit_metrics = proto.getForeground_exit_metrics();
                return new ExitMetricsDto(new Surrogate(backgroundExitMetricsDtoFromProto, foreground_exit_metrics != null ? ForegroundExitMetricsDto.INSTANCE.fromProto(foreground_exit_metrics) : null), defaultConstructorMarker);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$ExitMetricsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceMetricEventDataDto.ExitMetricsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ExitMetricsDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 !\"#B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\fJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tH\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics$BackgroundExitMetrics;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto$Surrogate;)V", "cumulative_bad_access_exit_count", "", "cumulative_cpu_resource_limit_exit_count", "cumulative_illegal_instruction_exit_count", "(III)V", "getCumulative_bad_access_exit_count", "()I", "getCumulative_cpu_resource_limit_exit_count", "getCumulative_illegal_instruction_exit_count", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class BackgroundExitMetricsDto implements Dto3<DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<BackgroundExitMetricsDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<BackgroundExitMetricsDto, DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics>> binaryBase64Serializer$delegate;
            private static final BackgroundExitMetricsDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ BackgroundExitMetricsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private BackgroundExitMetricsDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final int getCumulative_bad_access_exit_count() {
                return this.surrogate.getCumulative_bad_access_exit_count();
            }

            public final int getCumulative_cpu_resource_limit_exit_count() {
                return this.surrogate.getCumulative_cpu_resource_limit_exit_count();
            }

            public final int getCumulative_illegal_instruction_exit_count() {
                return this.surrogate.getCumulative_illegal_instruction_exit_count();
            }

            public /* synthetic */ BackgroundExitMetricsDto(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
                this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
            }

            public BackgroundExitMetricsDto(int i, int i2, int i3) {
                this(new Surrogate(i, i2, i3));
            }

            public static /* synthetic */ BackgroundExitMetricsDto copy$default(BackgroundExitMetricsDto backgroundExitMetricsDto, int i, int i2, int i3, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    i = backgroundExitMetricsDto.surrogate.getCumulative_bad_access_exit_count();
                }
                if ((i4 & 2) != 0) {
                    i2 = backgroundExitMetricsDto.surrogate.getCumulative_cpu_resource_limit_exit_count();
                }
                if ((i4 & 4) != 0) {
                    i3 = backgroundExitMetricsDto.surrogate.getCumulative_illegal_instruction_exit_count();
                }
                return backgroundExitMetricsDto.copy(i, i2, i3);
            }

            public final BackgroundExitMetricsDto copy(int cumulative_bad_access_exit_count, int cumulative_cpu_resource_limit_exit_count, int cumulative_illegal_instruction_exit_count) {
                return new BackgroundExitMetricsDto(new Surrogate(cumulative_bad_access_exit_count, cumulative_cpu_resource_limit_exit_count, cumulative_illegal_instruction_exit_count));
            }

            @Override // com.robinhood.idl.Dto
            public DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics toProto() {
                return new DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics(this.surrogate.getCumulative_bad_access_exit_count(), this.surrogate.getCumulative_cpu_resource_limit_exit_count(), this.surrogate.getCumulative_illegal_instruction_exit_count(), null, 8, null);
            }

            public String toString() {
                return "[BackgroundExitMetricsDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof BackgroundExitMetricsDto) && Intrinsics.areEqual(((BackgroundExitMetricsDto) other).surrogate, this.surrogate);
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
            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 *2\u00020\u0001:\u0002)*BR\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\u0004\b\t\u0010\nB3\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000eJ\u0018\u0010\u0017\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u0018\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u0019\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003JT\u0010\u001a\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J%\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R+\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto$Surrogate;", "", "cumulative_bad_access_exit_count", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "cumulative_cpu_resource_limit_exit_count", "cumulative_illegal_instruction_exit_count", "<init>", "(III)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCumulative_bad_access_exit_count$annotations", "()V", "getCumulative_bad_access_exit_count", "()I", "getCumulative_cpu_resource_limit_exit_count$annotations", "getCumulative_cpu_resource_limit_exit_count", "getCumulative_illegal_instruction_exit_count$annotations", "getCumulative_illegal_instruction_exit_count", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final int cumulative_bad_access_exit_count;
                private final int cumulative_cpu_resource_limit_exit_count;
                private final int cumulative_illegal_instruction_exit_count;

                public Surrogate() {
                    this(0, 0, 0, 7, (DefaultConstructorMarker) null);
                }

                public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, int i, int i2, int i3, int i4, Object obj) {
                    if ((i4 & 1) != 0) {
                        i = surrogate.cumulative_bad_access_exit_count;
                    }
                    if ((i4 & 2) != 0) {
                        i2 = surrogate.cumulative_cpu_resource_limit_exit_count;
                    }
                    if ((i4 & 4) != 0) {
                        i3 = surrogate.cumulative_illegal_instruction_exit_count;
                    }
                    return surrogate.copy(i, i2, i3);
                }

                @SerialName("cumulativeBadAccessExitCount")
                @JsonAnnotations2(names = {"cumulative_bad_access_exit_count"})
                public static /* synthetic */ void getCumulative_bad_access_exit_count$annotations() {
                }

                @SerialName("cumulativeCpuResourceLimitExitCount")
                @JsonAnnotations2(names = {"cumulative_cpu_resource_limit_exit_count"})
                public static /* synthetic */ void getCumulative_cpu_resource_limit_exit_count$annotations() {
                }

                @SerialName("cumulativeIllegalInstructionExitCount")
                @JsonAnnotations2(names = {"cumulative_illegal_instruction_exit_count"})
                public static /* synthetic */ void getCumulative_illegal_instruction_exit_count$annotations() {
                }

                /* renamed from: component1, reason: from getter */
                public final int getCumulative_bad_access_exit_count() {
                    return this.cumulative_bad_access_exit_count;
                }

                /* renamed from: component2, reason: from getter */
                public final int getCumulative_cpu_resource_limit_exit_count() {
                    return this.cumulative_cpu_resource_limit_exit_count;
                }

                /* renamed from: component3, reason: from getter */
                public final int getCumulative_illegal_instruction_exit_count() {
                    return this.cumulative_illegal_instruction_exit_count;
                }

                public final Surrogate copy(int cumulative_bad_access_exit_count, int cumulative_cpu_resource_limit_exit_count, int cumulative_illegal_instruction_exit_count) {
                    return new Surrogate(cumulative_bad_access_exit_count, cumulative_cpu_resource_limit_exit_count, cumulative_illegal_instruction_exit_count);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return this.cumulative_bad_access_exit_count == surrogate.cumulative_bad_access_exit_count && this.cumulative_cpu_resource_limit_exit_count == surrogate.cumulative_cpu_resource_limit_exit_count && this.cumulative_illegal_instruction_exit_count == surrogate.cumulative_illegal_instruction_exit_count;
                }

                public int hashCode() {
                    return (((Integer.hashCode(this.cumulative_bad_access_exit_count) * 31) + Integer.hashCode(this.cumulative_cpu_resource_limit_exit_count)) * 31) + Integer.hashCode(this.cumulative_illegal_instruction_exit_count);
                }

                public String toString() {
                    return "Surrogate(cumulative_bad_access_exit_count=" + this.cumulative_bad_access_exit_count + ", cumulative_cpu_resource_limit_exit_count=" + this.cumulative_cpu_resource_limit_exit_count + ", cumulative_illegal_instruction_exit_count=" + this.cumulative_illegal_instruction_exit_count + ")";
                }

                /* compiled from: DeviceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C36540xd7fc6335.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.cumulative_bad_access_exit_count = 0;
                    } else {
                        this.cumulative_bad_access_exit_count = i2;
                    }
                    if ((i & 2) == 0) {
                        this.cumulative_cpu_resource_limit_exit_count = 0;
                    } else {
                        this.cumulative_cpu_resource_limit_exit_count = i3;
                    }
                    if ((i & 4) == 0) {
                        this.cumulative_illegal_instruction_exit_count = 0;
                    } else {
                        this.cumulative_illegal_instruction_exit_count = i4;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    int i = self.cumulative_bad_access_exit_count;
                    if (i != 0) {
                        output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                    }
                    int i2 = self.cumulative_cpu_resource_limit_exit_count;
                    if (i2 != 0) {
                        output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
                    }
                    int i3 = self.cumulative_illegal_instruction_exit_count;
                    if (i3 != 0) {
                        output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
                    }
                }

                public Surrogate(int i, int i2, int i3) {
                    this.cumulative_bad_access_exit_count = i;
                    this.cumulative_cpu_resource_limit_exit_count = i2;
                    this.cumulative_illegal_instruction_exit_count = i3;
                }

                public /* synthetic */ Surrogate(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
                }

                public final int getCumulative_bad_access_exit_count() {
                    return this.cumulative_bad_access_exit_count;
                }

                public final int getCumulative_cpu_resource_limit_exit_count() {
                    return this.cumulative_cpu_resource_limit_exit_count;
                }

                public final int getCumulative_illegal_instruction_exit_count() {
                    return this.cumulative_illegal_instruction_exit_count;
                }
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics$BackgroundExitMetrics;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<BackgroundExitMetricsDto, DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<BackgroundExitMetricsDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<BackgroundExitMetricsDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<BackgroundExitMetricsDto> getBinaryBase64Serializer() {
                    return (KSerializer) BackgroundExitMetricsDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics> getProtoAdapter() {
                    return DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public BackgroundExitMetricsDto getZeroValue() {
                    return BackgroundExitMetricsDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public BackgroundExitMetricsDto fromProto(DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new BackgroundExitMetricsDto(new Surrogate(proto.getCumulative_bad_access_exit_count(), proto.getCumulative_cpu_resource_limit_exit_count(), proto.getCumulative_illegal_instruction_exit_count()), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DeviceMetricEventDataDto.ExitMetricsDto.BackgroundExitMetricsDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new BackgroundExitMetricsDto(0, 0, 0, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<BackgroundExitMetricsDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, BackgroundExitMetricsDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public BackgroundExitMetricsDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new BackgroundExitMetricsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4184_0)
                public final String provideIntoMap() {
                    return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$ExitMetricsDto$BackgroundExitMetricsDto";
                }
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001e\u001f !B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tH\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics$ForegroundExitMetrics;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto$Surrogate;)V", "cumulative_bad_access_exit_count", "", "cumulative_illegal_instruction_exit_count", "(II)V", "getCumulative_bad_access_exit_count", "()I", "getCumulative_illegal_instruction_exit_count", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class ForegroundExitMetricsDto implements Dto3<DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<ForegroundExitMetricsDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<ForegroundExitMetricsDto, DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics>> binaryBase64Serializer$delegate;
            private static final ForegroundExitMetricsDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ ForegroundExitMetricsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private ForegroundExitMetricsDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final int getCumulative_bad_access_exit_count() {
                return this.surrogate.getCumulative_bad_access_exit_count();
            }

            public final int getCumulative_illegal_instruction_exit_count() {
                return this.surrogate.getCumulative_illegal_instruction_exit_count();
            }

            public ForegroundExitMetricsDto(int i, int i2) {
                this(new Surrogate(i, i2));
            }

            public /* synthetic */ ForegroundExitMetricsDto(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
            }

            public static /* synthetic */ ForegroundExitMetricsDto copy$default(ForegroundExitMetricsDto foregroundExitMetricsDto, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = foregroundExitMetricsDto.surrogate.getCumulative_bad_access_exit_count();
                }
                if ((i3 & 2) != 0) {
                    i2 = foregroundExitMetricsDto.surrogate.getCumulative_illegal_instruction_exit_count();
                }
                return foregroundExitMetricsDto.copy(i, i2);
            }

            public final ForegroundExitMetricsDto copy(int cumulative_bad_access_exit_count, int cumulative_illegal_instruction_exit_count) {
                return new ForegroundExitMetricsDto(new Surrogate(cumulative_bad_access_exit_count, cumulative_illegal_instruction_exit_count));
            }

            @Override // com.robinhood.idl.Dto
            public DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics toProto() {
                return new DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics(this.surrogate.getCumulative_bad_access_exit_count(), this.surrogate.getCumulative_illegal_instruction_exit_count(), null, 4, null);
            }

            public String toString() {
                return "[ForegroundExitMetricsDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof ForegroundExitMetricsDto) && Intrinsics.areEqual(((ForegroundExitMetricsDto) other).surrogate, this.surrogate);
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
            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002%&B9\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\rJ\u0018\u0010\u0014\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u0015\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto$Surrogate;", "", "cumulative_bad_access_exit_count", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "cumulative_illegal_instruction_exit_count", "<init>", "(II)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCumulative_bad_access_exit_count$annotations", "()V", "getCumulative_bad_access_exit_count", "()I", "getCumulative_illegal_instruction_exit_count$annotations", "getCumulative_illegal_instruction_exit_count", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final int cumulative_bad_access_exit_count;
                private final int cumulative_illegal_instruction_exit_count;

                /* JADX WARN: Illegal instructions before constructor call */
                public Surrogate() {
                    int i = 0;
                    this(i, i, 3, (DefaultConstructorMarker) null);
                }

                public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        i = surrogate.cumulative_bad_access_exit_count;
                    }
                    if ((i3 & 2) != 0) {
                        i2 = surrogate.cumulative_illegal_instruction_exit_count;
                    }
                    return surrogate.copy(i, i2);
                }

                @SerialName("cumulativeBadAccessExitCount")
                @JsonAnnotations2(names = {"cumulative_bad_access_exit_count"})
                public static /* synthetic */ void getCumulative_bad_access_exit_count$annotations() {
                }

                @SerialName("cumulativeIllegalInstructionExitCount")
                @JsonAnnotations2(names = {"cumulative_illegal_instruction_exit_count"})
                public static /* synthetic */ void getCumulative_illegal_instruction_exit_count$annotations() {
                }

                /* renamed from: component1, reason: from getter */
                public final int getCumulative_bad_access_exit_count() {
                    return this.cumulative_bad_access_exit_count;
                }

                /* renamed from: component2, reason: from getter */
                public final int getCumulative_illegal_instruction_exit_count() {
                    return this.cumulative_illegal_instruction_exit_count;
                }

                public final Surrogate copy(int cumulative_bad_access_exit_count, int cumulative_illegal_instruction_exit_count) {
                    return new Surrogate(cumulative_bad_access_exit_count, cumulative_illegal_instruction_exit_count);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return this.cumulative_bad_access_exit_count == surrogate.cumulative_bad_access_exit_count && this.cumulative_illegal_instruction_exit_count == surrogate.cumulative_illegal_instruction_exit_count;
                }

                public int hashCode() {
                    return (Integer.hashCode(this.cumulative_bad_access_exit_count) * 31) + Integer.hashCode(this.cumulative_illegal_instruction_exit_count);
                }

                public String toString() {
                    return "Surrogate(cumulative_bad_access_exit_count=" + this.cumulative_bad_access_exit_count + ", cumulative_illegal_instruction_exit_count=" + this.cumulative_illegal_instruction_exit_count + ")";
                }

                /* compiled from: DeviceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C36542x3ef6d0ca.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.cumulative_bad_access_exit_count = 0;
                    } else {
                        this.cumulative_bad_access_exit_count = i2;
                    }
                    if ((i & 2) == 0) {
                        this.cumulative_illegal_instruction_exit_count = 0;
                    } else {
                        this.cumulative_illegal_instruction_exit_count = i3;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    int i = self.cumulative_bad_access_exit_count;
                    if (i != 0) {
                        output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                    }
                    int i2 = self.cumulative_illegal_instruction_exit_count;
                    if (i2 != 0) {
                        output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
                    }
                }

                public Surrogate(int i, int i2) {
                    this.cumulative_bad_access_exit_count = i;
                    this.cumulative_illegal_instruction_exit_count = i2;
                }

                public /* synthetic */ Surrogate(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
                }

                public final int getCumulative_bad_access_exit_count() {
                    return this.cumulative_bad_access_exit_count;
                }

                public final int getCumulative_illegal_instruction_exit_count() {
                    return this.cumulative_illegal_instruction_exit_count;
                }
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics$ForegroundExitMetrics;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<ForegroundExitMetricsDto, DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ForegroundExitMetricsDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ForegroundExitMetricsDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ForegroundExitMetricsDto> getBinaryBase64Serializer() {
                    return (KSerializer) ForegroundExitMetricsDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics> getProtoAdapter() {
                    return DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ForegroundExitMetricsDto getZeroValue() {
                    return ForegroundExitMetricsDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ForegroundExitMetricsDto fromProto(DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new ForegroundExitMetricsDto(new Surrogate(proto.getCumulative_bad_access_exit_count(), proto.getCumulative_illegal_instruction_exit_count()), (DefaultConstructorMarker) null);
                }
            }

            static {
                DefaultConstructorMarker defaultConstructorMarker = null;
                Companion companion = new Companion(defaultConstructorMarker);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DeviceMetricEventDataDto.ExitMetricsDto.ForegroundExitMetricsDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                int i = 0;
                zeroValue = new ForegroundExitMetricsDto(i, i, 3, defaultConstructorMarker);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<ForegroundExitMetricsDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, ForegroundExitMetricsDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public ForegroundExitMetricsDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new ForegroundExitMetricsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
                }
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4187_3)
                public final String provideIntoMap() {
                    return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$ExitMetricsDto$ForegroundExitMetricsDto";
                }
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ExitMetricsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.ExitMetrics", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ExitMetricsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ExitMetricsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ExitMetricsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$ExitMetricsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$ExitMetricsDto";
            }
        }
    }

    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\u001d\u001e\u001f !B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\nJ\u0012\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DisplayMetrics;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$Surrogate;)V", "pixel_luminance_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto;", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto;)V", "getPixel_luminance_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "PixelLuminanceMetricsDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DisplayMetricsDto implements Dto3<DeviceMetricEventData.DisplayMetrics>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<DisplayMetricsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DisplayMetricsDto, DeviceMetricEventData.DisplayMetrics>> binaryBase64Serializer$delegate;
        private static final DisplayMetricsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ DisplayMetricsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private DisplayMetricsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final PixelLuminanceMetricsDto getPixel_luminance_metrics() {
            return this.surrogate.getPixel_luminance_metrics();
        }

        public DisplayMetricsDto(PixelLuminanceMetricsDto pixelLuminanceMetricsDto) {
            this(new Surrogate(pixelLuminanceMetricsDto));
        }

        public /* synthetic */ DisplayMetricsDto(PixelLuminanceMetricsDto pixelLuminanceMetricsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : pixelLuminanceMetricsDto);
        }

        public static /* synthetic */ DisplayMetricsDto copy$default(DisplayMetricsDto displayMetricsDto, PixelLuminanceMetricsDto pixelLuminanceMetricsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                pixelLuminanceMetricsDto = displayMetricsDto.surrogate.getPixel_luminance_metrics();
            }
            return displayMetricsDto.copy(pixelLuminanceMetricsDto);
        }

        public final DisplayMetricsDto copy(PixelLuminanceMetricsDto pixel_luminance_metrics) {
            return new DisplayMetricsDto(new Surrogate(pixel_luminance_metrics));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public DeviceMetricEventData.DisplayMetrics toProto() {
            PixelLuminanceMetricsDto pixel_luminance_metrics = this.surrogate.getPixel_luminance_metrics();
            return new DeviceMetricEventData.DisplayMetrics(pixel_luminance_metrics != null ? pixel_luminance_metrics.toProto() : null, null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[DisplayMetricsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof DisplayMetricsDto) && Intrinsics.areEqual(((DisplayMetricsDto) other).surrogate, this.surrogate);
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
        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$Surrogate;", "", "pixel_luminance_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPixel_luminance_metrics$annotations", "()V", "getPixel_luminance_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final PixelLuminanceMetricsDto pixel_luminance_metrics;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((PixelLuminanceMetricsDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, PixelLuminanceMetricsDto pixelLuminanceMetricsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    pixelLuminanceMetricsDto = surrogate.pixel_luminance_metrics;
                }
                return surrogate.copy(pixelLuminanceMetricsDto);
            }

            @SerialName("pixelLuminanceMetrics")
            @JsonAnnotations2(names = {"pixel_luminance_metrics"})
            public static /* synthetic */ void getPixel_luminance_metrics$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final PixelLuminanceMetricsDto getPixel_luminance_metrics() {
                return this.pixel_luminance_metrics;
            }

            public final Surrogate copy(PixelLuminanceMetricsDto pixel_luminance_metrics) {
                return new Surrogate(pixel_luminance_metrics);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.pixel_luminance_metrics, ((Surrogate) other).pixel_luminance_metrics);
            }

            public int hashCode() {
                PixelLuminanceMetricsDto pixelLuminanceMetricsDto = this.pixel_luminance_metrics;
                if (pixelLuminanceMetricsDto == null) {
                    return 0;
                }
                return pixelLuminanceMetricsDto.hashCode();
            }

            public String toString() {
                return "Surrogate(pixel_luminance_metrics=" + this.pixel_luminance_metrics + ")";
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return DeviceMetricEventDataDto$DisplayMetricsDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, PixelLuminanceMetricsDto pixelLuminanceMetricsDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.pixel_luminance_metrics = null;
                } else {
                    this.pixel_luminance_metrics = pixelLuminanceMetricsDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                PixelLuminanceMetricsDto pixelLuminanceMetricsDto = self.pixel_luminance_metrics;
                if (pixelLuminanceMetricsDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, PixelLuminanceMetricsDto.Serializer.INSTANCE, pixelLuminanceMetricsDto);
                }
            }

            public Surrogate(PixelLuminanceMetricsDto pixelLuminanceMetricsDto) {
                this.pixel_luminance_metrics = pixelLuminanceMetricsDto;
            }

            public /* synthetic */ Surrogate(PixelLuminanceMetricsDto pixelLuminanceMetricsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : pixelLuminanceMetricsDto);
            }

            public final PixelLuminanceMetricsDto getPixel_luminance_metrics() {
                return this.pixel_luminance_metrics;
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DisplayMetrics;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<DisplayMetricsDto, DeviceMetricEventData.DisplayMetrics> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DisplayMetricsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DisplayMetricsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DisplayMetricsDto> getBinaryBase64Serializer() {
                return (KSerializer) DisplayMetricsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<DeviceMetricEventData.DisplayMetrics> getProtoAdapter() {
                return DeviceMetricEventData.DisplayMetrics.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DisplayMetricsDto getZeroValue() {
                return DisplayMetricsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DisplayMetricsDto fromProto(DeviceMetricEventData.DisplayMetrics proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics pixel_luminance_metrics = proto.getPixel_luminance_metrics();
                return new DisplayMetricsDto(new Surrogate(pixel_luminance_metrics != null ? PixelLuminanceMetricsDto.INSTANCE.fromProto(pixel_luminance_metrics) : null), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$DisplayMetricsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceMetricEventDataDto.DisplayMetricsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new DisplayMetricsDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DisplayMetrics$PixelLuminanceMetrics;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto$Surrogate;)V", "average_pixel_luminance", "", "standard_deviation", "average_pixel_luminance_apl", "standard_deviation_apl", "(DDDD)V", "getAverage_pixel_luminance", "()D", "getStandard_deviation", "getAverage_pixel_luminance_apl", "getStandard_deviation_apl", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class PixelLuminanceMetricsDto implements Dto3<DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<PixelLuminanceMetricsDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<PixelLuminanceMetricsDto, DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics>> binaryBase64Serializer$delegate;
            private static final PixelLuminanceMetricsDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ PixelLuminanceMetricsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private PixelLuminanceMetricsDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final double getAverage_pixel_luminance() {
                return this.surrogate.getAverage_pixel_luminance();
            }

            public final double getStandard_deviation() {
                return this.surrogate.getStandard_deviation();
            }

            public final double getAverage_pixel_luminance_apl() {
                return this.surrogate.getAverage_pixel_luminance_apl();
            }

            public final double getStandard_deviation_apl() {
                return this.surrogate.getStandard_deviation_apl();
            }

            public /* synthetic */ PixelLuminanceMetricsDto(double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4);
            }

            public PixelLuminanceMetricsDto(double d, double d2, double d3, double d4) {
                this(new Surrogate(d, d2, d3, d4));
            }

            public static /* synthetic */ PixelLuminanceMetricsDto copy$default(PixelLuminanceMetricsDto pixelLuminanceMetricsDto, double d, double d2, double d3, double d4, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = pixelLuminanceMetricsDto.surrogate.getAverage_pixel_luminance();
                }
                double d5 = d;
                if ((i & 2) != 0) {
                    d2 = pixelLuminanceMetricsDto.surrogate.getStandard_deviation();
                }
                double d6 = d2;
                if ((i & 4) != 0) {
                    d3 = pixelLuminanceMetricsDto.surrogate.getAverage_pixel_luminance_apl();
                }
                return pixelLuminanceMetricsDto.copy(d5, d6, d3, (i & 8) != 0 ? pixelLuminanceMetricsDto.surrogate.getStandard_deviation_apl() : d4);
            }

            public final PixelLuminanceMetricsDto copy(double average_pixel_luminance, double standard_deviation, double average_pixel_luminance_apl, double standard_deviation_apl) {
                return new PixelLuminanceMetricsDto(new Surrogate(average_pixel_luminance, standard_deviation, average_pixel_luminance_apl, standard_deviation_apl));
            }

            @Override // com.robinhood.idl.Dto
            public DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics toProto() {
                return new DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics(this.surrogate.getAverage_pixel_luminance(), this.surrogate.getStandard_deviation(), this.surrogate.getAverage_pixel_luminance_apl(), this.surrogate.getStandard_deviation_apl(), null, 16, null);
            }

            public String toString() {
                return "[PixelLuminanceMetricsDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof PixelLuminanceMetricsDto) && Intrinsics.areEqual(((PixelLuminanceMetricsDto) other).surrogate, this.surrogate);
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
            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u0002./Bk\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\u0004\b\n\u0010\u000bB;\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\u0018\u0010\u001b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001c\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001d\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001e\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003Jm\u0010\u001f\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\rHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R+\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R+\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto$Surrogate;", "", "average_pixel_luminance", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "standard_deviation", "average_pixel_luminance_apl", "standard_deviation_apl", "<init>", "(DDDD)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAverage_pixel_luminance$annotations", "()V", "getAverage_pixel_luminance", "()D", "getStandard_deviation$annotations", "getStandard_deviation", "getAverage_pixel_luminance_apl$annotations", "getAverage_pixel_luminance_apl", "getStandard_deviation_apl$annotations", "getStandard_deviation_apl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final double average_pixel_luminance;
                private final double average_pixel_luminance_apl;
                private final double standard_deviation;
                private final double standard_deviation_apl;

                public Surrogate() {
                    this(0.0d, 0.0d, 0.0d, 0.0d, 15, (DefaultConstructorMarker) null);
                }

                public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, double d, double d2, double d3, double d4, int i, Object obj) {
                    if ((i & 1) != 0) {
                        d = surrogate.average_pixel_luminance;
                    }
                    double d5 = d;
                    if ((i & 2) != 0) {
                        d2 = surrogate.standard_deviation;
                    }
                    double d6 = d2;
                    if ((i & 4) != 0) {
                        d3 = surrogate.average_pixel_luminance_apl;
                    }
                    return surrogate.copy(d5, d6, d3, (i & 8) != 0 ? surrogate.standard_deviation_apl : d4);
                }

                @SerialName("averagePixelLuminance")
                @JsonAnnotations2(names = {"average_pixel_luminance"})
                public static /* synthetic */ void getAverage_pixel_luminance$annotations() {
                }

                @SerialName("averagePixelLuminanceApl")
                @JsonAnnotations2(names = {"average_pixel_luminance_apl"})
                public static /* synthetic */ void getAverage_pixel_luminance_apl$annotations() {
                }

                @SerialName("standardDeviation")
                @JsonAnnotations2(names = {"standard_deviation"})
                public static /* synthetic */ void getStandard_deviation$annotations() {
                }

                @SerialName("standardDeviationApl")
                @JsonAnnotations2(names = {"standard_deviation_apl"})
                public static /* synthetic */ void getStandard_deviation_apl$annotations() {
                }

                /* renamed from: component1, reason: from getter */
                public final double getAverage_pixel_luminance() {
                    return this.average_pixel_luminance;
                }

                /* renamed from: component2, reason: from getter */
                public final double getStandard_deviation() {
                    return this.standard_deviation;
                }

                /* renamed from: component3, reason: from getter */
                public final double getAverage_pixel_luminance_apl() {
                    return this.average_pixel_luminance_apl;
                }

                /* renamed from: component4, reason: from getter */
                public final double getStandard_deviation_apl() {
                    return this.standard_deviation_apl;
                }

                public final Surrogate copy(double average_pixel_luminance, double standard_deviation, double average_pixel_luminance_apl, double standard_deviation_apl) {
                    return new Surrogate(average_pixel_luminance, standard_deviation, average_pixel_luminance_apl, standard_deviation_apl);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Double.compare(this.average_pixel_luminance, surrogate.average_pixel_luminance) == 0 && Double.compare(this.standard_deviation, surrogate.standard_deviation) == 0 && Double.compare(this.average_pixel_luminance_apl, surrogate.average_pixel_luminance_apl) == 0 && Double.compare(this.standard_deviation_apl, surrogate.standard_deviation_apl) == 0;
                }

                public int hashCode() {
                    return (((((Double.hashCode(this.average_pixel_luminance) * 31) + Double.hashCode(this.standard_deviation)) * 31) + Double.hashCode(this.average_pixel_luminance_apl)) * 31) + Double.hashCode(this.standard_deviation_apl);
                }

                public String toString() {
                    return "Surrogate(average_pixel_luminance=" + this.average_pixel_luminance + ", standard_deviation=" + this.standard_deviation + ", average_pixel_luminance_apl=" + this.average_pixel_luminance_apl + ", standard_deviation_apl=" + this.standard_deviation_apl + ")";
                }

                /* compiled from: DeviceMetricEventDataDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C36537xbace161d.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, double d, double d2, double d3, double d4, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.average_pixel_luminance = 0.0d;
                    } else {
                        this.average_pixel_luminance = d;
                    }
                    if ((i & 2) == 0) {
                        this.standard_deviation = 0.0d;
                    } else {
                        this.standard_deviation = d2;
                    }
                    if ((i & 4) == 0) {
                        this.average_pixel_luminance_apl = 0.0d;
                    } else {
                        this.average_pixel_luminance_apl = d3;
                    }
                    if ((i & 8) == 0) {
                        this.standard_deviation_apl = 0.0d;
                    } else {
                        this.standard_deviation_apl = d4;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (Double.compare(self.average_pixel_luminance, 0.0d) != 0) {
                        output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.average_pixel_luminance));
                    }
                    if (Double.compare(self.standard_deviation, 0.0d) != 0) {
                        output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.standard_deviation));
                    }
                    if (Double.compare(self.average_pixel_luminance_apl, 0.0d) != 0) {
                        output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.average_pixel_luminance_apl));
                    }
                    if (Double.compare(self.standard_deviation_apl, 0.0d) != 0) {
                        output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.standard_deviation_apl));
                    }
                }

                public Surrogate(double d, double d2, double d3, double d4) {
                    this.average_pixel_luminance = d;
                    this.standard_deviation = d2;
                    this.average_pixel_luminance_apl = d3;
                    this.standard_deviation_apl = d4;
                }

                public /* synthetic */ Surrogate(double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4);
                }

                public final double getAverage_pixel_luminance() {
                    return this.average_pixel_luminance;
                }

                public final double getStandard_deviation() {
                    return this.standard_deviation;
                }

                public final double getAverage_pixel_luminance_apl() {
                    return this.average_pixel_luminance_apl;
                }

                public final double getStandard_deviation_apl() {
                    return this.standard_deviation_apl;
                }
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DisplayMetrics$PixelLuminanceMetrics;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<PixelLuminanceMetricsDto, DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<PixelLuminanceMetricsDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<PixelLuminanceMetricsDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<PixelLuminanceMetricsDto> getBinaryBase64Serializer() {
                    return (KSerializer) PixelLuminanceMetricsDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics> getProtoAdapter() {
                    return DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public PixelLuminanceMetricsDto getZeroValue() {
                    return PixelLuminanceMetricsDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public PixelLuminanceMetricsDto fromProto(DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new PixelLuminanceMetricsDto(new Surrogate(proto.getAverage_pixel_luminance(), proto.getStandard_deviation(), proto.getAverage_pixel_luminance_apl(), proto.getStandard_deviation_apl()), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DeviceMetricEventDataDto.DisplayMetricsDto.PixelLuminanceMetricsDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new PixelLuminanceMetricsDto(0.0d, 0.0d, 0.0d, 0.0d, 15, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<PixelLuminanceMetricsDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, PixelLuminanceMetricsDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public PixelLuminanceMetricsDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new PixelLuminanceMetricsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: DeviceMetricEventDataDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4184_0)
                public final String provideIntoMap() {
                    return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$DisplayMetricsDto$PixelLuminanceMetricsDto";
                }
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<DisplayMetricsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData.DisplayMetrics", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DisplayMetricsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public DisplayMetricsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new DisplayMetricsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: DeviceMetricEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$DisplayMetricsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto$DisplayMetricsDto";
            }
        }
    }

    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<DeviceMetricEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.DeviceMetricEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DeviceMetricEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DeviceMetricEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DeviceMetricEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DeviceMetricEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto";
        }
    }
}

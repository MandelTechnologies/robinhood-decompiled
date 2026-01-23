package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.DeviceMetricEventData;
import com.singular.sdk.internal.Constants;
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

/* compiled from: DeviceMetricEventData.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b<\u0018\u0000 [2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\f[\\]^_`abcdefB¹\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0017¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001eH\u0016¢\u0006\u0004\b.\u0010/J¿\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b0\u00101R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u00107R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010M\u001a\u0004\bN\u0010OR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010S\u001a\u0004\bT\u0010UR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010Y\u001a\u0004\bZ\u0010/¨\u0006g"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData;", "Lcom/squareup/wire/Message;", "", "", "duration_seconds", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$AppState;", "app_state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$RuntimeMetrics;", "runtime", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$CpuMetrics;", "cpu", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$GpuMetrics;", "gpu", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$MemoryMetrics;", "memory", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DiskMetrics;", "disk", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics;", "network", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ResponsivenessMetrics;", "responsiveness", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$LaunchMetrics;", "launch_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics;", "exit_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DisplayMetrics;", "display_metrics", "", "additional_info", "Lokio/ByteString;", "unknownFields", "<init>", "(DLcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$AppState;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$RuntimeMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$CpuMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$GpuMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$MemoryMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DiskMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ResponsivenessMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$LaunchMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DisplayMetrics;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(DLcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$AppState;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$RuntimeMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$CpuMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$GpuMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$MemoryMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DiskMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ResponsivenessMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$LaunchMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DisplayMetrics;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData;", "D", "getDuration_seconds", "()D", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$AppState;", "getApp_state", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$AppState;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$RuntimeMetrics;", "getRuntime", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$RuntimeMetrics;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$CpuMetrics;", "getCpu", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$CpuMetrics;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$GpuMetrics;", "getGpu", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$GpuMetrics;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$MemoryMetrics;", "getMemory", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$MemoryMetrics;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DiskMetrics;", "getDisk", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DiskMetrics;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics;", "getNetwork", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ResponsivenessMetrics;", "getResponsiveness", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ResponsivenessMetrics;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$LaunchMetrics;", "getLaunch_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$LaunchMetrics;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics;", "getExit_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DisplayMetrics;", "getDisplay_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DisplayMetrics;", "Ljava/lang/String;", "getAdditional_info", "Companion", "AppState", "RuntimeMetrics", "CpuMetrics", "GpuMetrics", "MemoryMetrics", "DiskMetrics", "NetworkMetrics", "ResponsivenessMetrics", "LaunchMetrics", "ExitMetrics", "DisplayMetrics", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class DeviceMetricEventData extends Message {

    @JvmField
    public static final ProtoAdapter<DeviceMetricEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "additionalInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 20)
    private final String additional_info;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$AppState#ADAPTER", jsonName = "appState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AppState app_state;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$CpuMetrics#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final CpuMetrics cpu;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$DiskMetrics#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final DiskMetrics disk;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$DisplayMetrics#ADAPTER", jsonName = "displayMetrics", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final DisplayMetrics display_metrics;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "durationSeconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double duration_seconds;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$ExitMetrics#ADAPTER", jsonName = "exitMetrics", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final ExitMetrics exit_metrics;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$GpuMetrics#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final GpuMetrics gpu;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$LaunchMetrics#ADAPTER", jsonName = "launchMetrics", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final LaunchMetrics launch_metrics;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$MemoryMetrics#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final MemoryMetrics memory;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final NetworkMetrics network;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$ResponsivenessMetrics#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final ResponsivenessMetrics responsiveness;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$RuntimeMetrics#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final RuntimeMetrics runtime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant timestamp;

    public DeviceMetricEventData() {
        this(0.0d, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24198newBuilder();
    }

    public final double getDuration_seconds() {
        return this.duration_seconds;
    }

    public final AppState getApp_state() {
        return this.app_state;
    }

    public /* synthetic */ DeviceMetricEventData(double d, AppState appState, Instant instant, RuntimeMetrics runtimeMetrics, CpuMetrics cpuMetrics, GpuMetrics gpuMetrics, MemoryMetrics memoryMetrics, DiskMetrics diskMetrics, NetworkMetrics networkMetrics, ResponsivenessMetrics responsivenessMetrics, LaunchMetrics launchMetrics, ExitMetrics exitMetrics, DisplayMetrics displayMetrics, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? AppState.APP_STATE_UNSPECIFIED : appState, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : runtimeMetrics, (i & 16) != 0 ? null : cpuMetrics, (i & 32) != 0 ? null : gpuMetrics, (i & 64) != 0 ? null : memoryMetrics, (i & 128) != 0 ? null : diskMetrics, (i & 256) != 0 ? null : networkMetrics, (i & 512) != 0 ? null : responsivenessMetrics, (i & 1024) != 0 ? null : launchMetrics, (i & 2048) != 0 ? null : exitMetrics, (i & 4096) == 0 ? displayMetrics : null, (i & 8192) != 0 ? "" : str, (i & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final RuntimeMetrics getRuntime() {
        return this.runtime;
    }

    public final CpuMetrics getCpu() {
        return this.cpu;
    }

    public final GpuMetrics getGpu() {
        return this.gpu;
    }

    public final MemoryMetrics getMemory() {
        return this.memory;
    }

    public final DiskMetrics getDisk() {
        return this.disk;
    }

    public final NetworkMetrics getNetwork() {
        return this.network;
    }

    public final ResponsivenessMetrics getResponsiveness() {
        return this.responsiveness;
    }

    public final LaunchMetrics getLaunch_metrics() {
        return this.launch_metrics;
    }

    public final ExitMetrics getExit_metrics() {
        return this.exit_metrics;
    }

    public final DisplayMetrics getDisplay_metrics() {
        return this.display_metrics;
    }

    public final String getAdditional_info() {
        return this.additional_info;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceMetricEventData(double d, AppState app_state, Instant instant, RuntimeMetrics runtimeMetrics, CpuMetrics cpuMetrics, GpuMetrics gpuMetrics, MemoryMetrics memoryMetrics, DiskMetrics diskMetrics, NetworkMetrics networkMetrics, ResponsivenessMetrics responsivenessMetrics, LaunchMetrics launchMetrics, ExitMetrics exitMetrics, DisplayMetrics displayMetrics, String additional_info, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(app_state, "app_state");
        Intrinsics.checkNotNullParameter(additional_info, "additional_info");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.duration_seconds = d;
        this.app_state = app_state;
        this.timestamp = instant;
        this.runtime = runtimeMetrics;
        this.cpu = cpuMetrics;
        this.gpu = gpuMetrics;
        this.memory = memoryMetrics;
        this.disk = diskMetrics;
        this.network = networkMetrics;
        this.responsiveness = responsivenessMetrics;
        this.launch_metrics = launchMetrics;
        this.exit_metrics = exitMetrics;
        this.display_metrics = displayMetrics;
        this.additional_info = additional_info;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24198newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DeviceMetricEventData)) {
            return false;
        }
        DeviceMetricEventData deviceMetricEventData = (DeviceMetricEventData) other;
        return Intrinsics.areEqual(unknownFields(), deviceMetricEventData.unknownFields()) && this.duration_seconds == deviceMetricEventData.duration_seconds && this.app_state == deviceMetricEventData.app_state && Intrinsics.areEqual(this.timestamp, deviceMetricEventData.timestamp) && Intrinsics.areEqual(this.runtime, deviceMetricEventData.runtime) && Intrinsics.areEqual(this.cpu, deviceMetricEventData.cpu) && Intrinsics.areEqual(this.gpu, deviceMetricEventData.gpu) && Intrinsics.areEqual(this.memory, deviceMetricEventData.memory) && Intrinsics.areEqual(this.disk, deviceMetricEventData.disk) && Intrinsics.areEqual(this.network, deviceMetricEventData.network) && Intrinsics.areEqual(this.responsiveness, deviceMetricEventData.responsiveness) && Intrinsics.areEqual(this.launch_metrics, deviceMetricEventData.launch_metrics) && Intrinsics.areEqual(this.exit_metrics, deviceMetricEventData.exit_metrics) && Intrinsics.areEqual(this.display_metrics, deviceMetricEventData.display_metrics) && Intrinsics.areEqual(this.additional_info, deviceMetricEventData.additional_info);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + Double.hashCode(this.duration_seconds)) * 37) + this.app_state.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        RuntimeMetrics runtimeMetrics = this.runtime;
        int iHashCode3 = (iHashCode2 + (runtimeMetrics != null ? runtimeMetrics.hashCode() : 0)) * 37;
        CpuMetrics cpuMetrics = this.cpu;
        int iHashCode4 = (iHashCode3 + (cpuMetrics != null ? cpuMetrics.hashCode() : 0)) * 37;
        GpuMetrics gpuMetrics = this.gpu;
        int iHashCode5 = (iHashCode4 + (gpuMetrics != null ? gpuMetrics.hashCode() : 0)) * 37;
        MemoryMetrics memoryMetrics = this.memory;
        int iHashCode6 = (iHashCode5 + (memoryMetrics != null ? memoryMetrics.hashCode() : 0)) * 37;
        DiskMetrics diskMetrics = this.disk;
        int iHashCode7 = (iHashCode6 + (diskMetrics != null ? diskMetrics.hashCode() : 0)) * 37;
        NetworkMetrics networkMetrics = this.network;
        int iHashCode8 = (iHashCode7 + (networkMetrics != null ? networkMetrics.hashCode() : 0)) * 37;
        ResponsivenessMetrics responsivenessMetrics = this.responsiveness;
        int iHashCode9 = (iHashCode8 + (responsivenessMetrics != null ? responsivenessMetrics.hashCode() : 0)) * 37;
        LaunchMetrics launchMetrics = this.launch_metrics;
        int iHashCode10 = (iHashCode9 + (launchMetrics != null ? launchMetrics.hashCode() : 0)) * 37;
        ExitMetrics exitMetrics = this.exit_metrics;
        int iHashCode11 = (iHashCode10 + (exitMetrics != null ? exitMetrics.hashCode() : 0)) * 37;
        DisplayMetrics displayMetrics = this.display_metrics;
        int iHashCode12 = ((iHashCode11 + (displayMetrics != null ? displayMetrics.hashCode() : 0)) * 37) + this.additional_info.hashCode();
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("duration_seconds=" + this.duration_seconds);
        arrayList.add("app_state=" + this.app_state);
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        RuntimeMetrics runtimeMetrics = this.runtime;
        if (runtimeMetrics != null) {
            arrayList.add("runtime=" + runtimeMetrics);
        }
        CpuMetrics cpuMetrics = this.cpu;
        if (cpuMetrics != null) {
            arrayList.add("cpu=" + cpuMetrics);
        }
        GpuMetrics gpuMetrics = this.gpu;
        if (gpuMetrics != null) {
            arrayList.add("gpu=" + gpuMetrics);
        }
        MemoryMetrics memoryMetrics = this.memory;
        if (memoryMetrics != null) {
            arrayList.add("memory=" + memoryMetrics);
        }
        DiskMetrics diskMetrics = this.disk;
        if (diskMetrics != null) {
            arrayList.add("disk=" + diskMetrics);
        }
        NetworkMetrics networkMetrics = this.network;
        if (networkMetrics != null) {
            arrayList.add("network=" + networkMetrics);
        }
        ResponsivenessMetrics responsivenessMetrics = this.responsiveness;
        if (responsivenessMetrics != null) {
            arrayList.add("responsiveness=" + responsivenessMetrics);
        }
        LaunchMetrics launchMetrics = this.launch_metrics;
        if (launchMetrics != null) {
            arrayList.add("launch_metrics=" + launchMetrics);
        }
        ExitMetrics exitMetrics = this.exit_metrics;
        if (exitMetrics != null) {
            arrayList.add("exit_metrics=" + exitMetrics);
        }
        DisplayMetrics displayMetrics = this.display_metrics;
        if (displayMetrics != null) {
            arrayList.add("display_metrics=" + displayMetrics);
        }
        arrayList.add("additional_info=" + Internal.sanitize(this.additional_info));
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeviceMetricEventData{", "}", 0, null, null, 56, null);
    }

    public final DeviceMetricEventData copy(double duration_seconds, AppState app_state, Instant timestamp, RuntimeMetrics runtime, CpuMetrics cpu, GpuMetrics gpu, MemoryMetrics memory, DiskMetrics disk, NetworkMetrics network, ResponsivenessMetrics responsiveness, LaunchMetrics launch_metrics, ExitMetrics exit_metrics, DisplayMetrics display_metrics, String additional_info, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(app_state, "app_state");
        Intrinsics.checkNotNullParameter(additional_info, "additional_info");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DeviceMetricEventData(duration_seconds, app_state, timestamp, runtime, cpu, gpu, memory, disk, network, responsiveness, launch_metrics, exit_metrics, display_metrics, additional_info, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DeviceMetricEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DeviceMetricEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DeviceMetricEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Double.valueOf(value.getDuration_seconds()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getDuration_seconds()));
                }
                if (value.getApp_state() != DeviceMetricEventData.AppState.APP_STATE_UNSPECIFIED) {
                    size += DeviceMetricEventData.AppState.ADAPTER.encodedSizeWithTag(2, value.getApp_state());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getTimestamp());
                }
                if (value.getRuntime() != null) {
                    size += DeviceMetricEventData.RuntimeMetrics.ADAPTER.encodedSizeWithTag(4, value.getRuntime());
                }
                if (value.getCpu() != null) {
                    size += DeviceMetricEventData.CpuMetrics.ADAPTER.encodedSizeWithTag(5, value.getCpu());
                }
                if (value.getGpu() != null) {
                    size += DeviceMetricEventData.GpuMetrics.ADAPTER.encodedSizeWithTag(6, value.getGpu());
                }
                if (value.getMemory() != null) {
                    size += DeviceMetricEventData.MemoryMetrics.ADAPTER.encodedSizeWithTag(7, value.getMemory());
                }
                if (value.getDisk() != null) {
                    size += DeviceMetricEventData.DiskMetrics.ADAPTER.encodedSizeWithTag(8, value.getDisk());
                }
                if (value.getNetwork() != null) {
                    size += DeviceMetricEventData.NetworkMetrics.ADAPTER.encodedSizeWithTag(9, value.getNetwork());
                }
                if (value.getResponsiveness() != null) {
                    size += DeviceMetricEventData.ResponsivenessMetrics.ADAPTER.encodedSizeWithTag(10, value.getResponsiveness());
                }
                if (value.getLaunch_metrics() != null) {
                    size += DeviceMetricEventData.LaunchMetrics.ADAPTER.encodedSizeWithTag(11, value.getLaunch_metrics());
                }
                if (value.getExit_metrics() != null) {
                    size += DeviceMetricEventData.ExitMetrics.ADAPTER.encodedSizeWithTag(12, value.getExit_metrics());
                }
                if (value.getDisplay_metrics() != null) {
                    size += DeviceMetricEventData.DisplayMetrics.ADAPTER.encodedSizeWithTag(13, value.getDisplay_metrics());
                }
                return !Intrinsics.areEqual(value.getAdditional_info(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(20, value.getAdditional_info()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DeviceMetricEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Double.valueOf(value.getDuration_seconds()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getDuration_seconds()));
                }
                if (value.getApp_state() != DeviceMetricEventData.AppState.APP_STATE_UNSPECIFIED) {
                    DeviceMetricEventData.AppState.ADAPTER.encodeWithTag(writer, 2, (int) value.getApp_state());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (value.getRuntime() != null) {
                    DeviceMetricEventData.RuntimeMetrics.ADAPTER.encodeWithTag(writer, 4, (int) value.getRuntime());
                }
                if (value.getCpu() != null) {
                    DeviceMetricEventData.CpuMetrics.ADAPTER.encodeWithTag(writer, 5, (int) value.getCpu());
                }
                if (value.getGpu() != null) {
                    DeviceMetricEventData.GpuMetrics.ADAPTER.encodeWithTag(writer, 6, (int) value.getGpu());
                }
                if (value.getMemory() != null) {
                    DeviceMetricEventData.MemoryMetrics.ADAPTER.encodeWithTag(writer, 7, (int) value.getMemory());
                }
                if (value.getDisk() != null) {
                    DeviceMetricEventData.DiskMetrics.ADAPTER.encodeWithTag(writer, 8, (int) value.getDisk());
                }
                if (value.getNetwork() != null) {
                    DeviceMetricEventData.NetworkMetrics.ADAPTER.encodeWithTag(writer, 9, (int) value.getNetwork());
                }
                if (value.getResponsiveness() != null) {
                    DeviceMetricEventData.ResponsivenessMetrics.ADAPTER.encodeWithTag(writer, 10, (int) value.getResponsiveness());
                }
                if (value.getLaunch_metrics() != null) {
                    DeviceMetricEventData.LaunchMetrics.ADAPTER.encodeWithTag(writer, 11, (int) value.getLaunch_metrics());
                }
                if (value.getExit_metrics() != null) {
                    DeviceMetricEventData.ExitMetrics.ADAPTER.encodeWithTag(writer, 12, (int) value.getExit_metrics());
                }
                if (value.getDisplay_metrics() != null) {
                    DeviceMetricEventData.DisplayMetrics.ADAPTER.encodeWithTag(writer, 13, (int) value.getDisplay_metrics());
                }
                if (!Intrinsics.areEqual(value.getAdditional_info(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getAdditional_info());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DeviceMetricEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAdditional_info(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getAdditional_info());
                }
                if (value.getDisplay_metrics() != null) {
                    DeviceMetricEventData.DisplayMetrics.ADAPTER.encodeWithTag(writer, 13, (int) value.getDisplay_metrics());
                }
                if (value.getExit_metrics() != null) {
                    DeviceMetricEventData.ExitMetrics.ADAPTER.encodeWithTag(writer, 12, (int) value.getExit_metrics());
                }
                if (value.getLaunch_metrics() != null) {
                    DeviceMetricEventData.LaunchMetrics.ADAPTER.encodeWithTag(writer, 11, (int) value.getLaunch_metrics());
                }
                if (value.getResponsiveness() != null) {
                    DeviceMetricEventData.ResponsivenessMetrics.ADAPTER.encodeWithTag(writer, 10, (int) value.getResponsiveness());
                }
                if (value.getNetwork() != null) {
                    DeviceMetricEventData.NetworkMetrics.ADAPTER.encodeWithTag(writer, 9, (int) value.getNetwork());
                }
                if (value.getDisk() != null) {
                    DeviceMetricEventData.DiskMetrics.ADAPTER.encodeWithTag(writer, 8, (int) value.getDisk());
                }
                if (value.getMemory() != null) {
                    DeviceMetricEventData.MemoryMetrics.ADAPTER.encodeWithTag(writer, 7, (int) value.getMemory());
                }
                if (value.getGpu() != null) {
                    DeviceMetricEventData.GpuMetrics.ADAPTER.encodeWithTag(writer, 6, (int) value.getGpu());
                }
                if (value.getCpu() != null) {
                    DeviceMetricEventData.CpuMetrics.ADAPTER.encodeWithTag(writer, 5, (int) value.getCpu());
                }
                if (value.getRuntime() != null) {
                    DeviceMetricEventData.RuntimeMetrics.ADAPTER.encodeWithTag(writer, 4, (int) value.getRuntime());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                }
                if (value.getApp_state() != DeviceMetricEventData.AppState.APP_STATE_UNSPECIFIED) {
                    DeviceMetricEventData.AppState.ADAPTER.encodeWithTag(writer, 2, (int) value.getApp_state());
                }
                if (Double.valueOf(value.getDuration_seconds()).equals(Double.valueOf(0.0d))) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getDuration_seconds()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DeviceMetricEventData decode(ProtoReader reader) throws IOException {
                Instant instant;
                double d;
                Intrinsics.checkNotNullParameter(reader, "reader");
                DeviceMetricEventData.AppState appState = DeviceMetricEventData.AppState.APP_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                DeviceMetricEventData.AppState appStateDecode = appState;
                DeviceMetricEventData.RuntimeMetrics runtimeMetricsDecode = null;
                DeviceMetricEventData.CpuMetrics cpuMetricsDecode = null;
                DeviceMetricEventData.GpuMetrics gpuMetricsDecode = null;
                DeviceMetricEventData.MemoryMetrics memoryMetricsDecode = null;
                DeviceMetricEventData.DiskMetrics diskMetricsDecode = null;
                DeviceMetricEventData.NetworkMetrics networkMetricsDecode = null;
                DeviceMetricEventData.ResponsivenessMetrics responsivenessMetricsDecode = null;
                DeviceMetricEventData.LaunchMetrics launchMetricsDecode = null;
                DeviceMetricEventData.ExitMetrics exitMetricsDecode = null;
                DeviceMetricEventData.DisplayMetrics displayMetricsDecode = null;
                String strDecode = "";
                double dDoubleValue = 0.0d;
                Instant instantDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DeviceMetricEventData(dDoubleValue, appStateDecode, instantDecode, runtimeMetricsDecode, cpuMetricsDecode, gpuMetricsDecode, memoryMetricsDecode, diskMetricsDecode, networkMetricsDecode, responsivenessMetricsDecode, launchMetricsDecode, exitMetricsDecode, displayMetricsDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag != 20) {
                        switch (iNextTag) {
                            case 1:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                instantDecode = instantDecode;
                                continue;
                            case 2:
                                try {
                                    appStateDecode = DeviceMetricEventData.AppState.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    instant = instantDecode;
                                    d = dDoubleValue;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 4:
                                runtimeMetricsDecode = DeviceMetricEventData.RuntimeMetrics.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                cpuMetricsDecode = DeviceMetricEventData.CpuMetrics.ADAPTER.decode(reader);
                                continue;
                            case 6:
                                gpuMetricsDecode = DeviceMetricEventData.GpuMetrics.ADAPTER.decode(reader);
                                continue;
                            case 7:
                                memoryMetricsDecode = DeviceMetricEventData.MemoryMetrics.ADAPTER.decode(reader);
                                continue;
                            case 8:
                                diskMetricsDecode = DeviceMetricEventData.DiskMetrics.ADAPTER.decode(reader);
                                continue;
                            case 9:
                                networkMetricsDecode = DeviceMetricEventData.NetworkMetrics.ADAPTER.decode(reader);
                                continue;
                            case 10:
                                responsivenessMetricsDecode = DeviceMetricEventData.ResponsivenessMetrics.ADAPTER.decode(reader);
                                continue;
                            case 11:
                                launchMetricsDecode = DeviceMetricEventData.LaunchMetrics.ADAPTER.decode(reader);
                                continue;
                            case 12:
                                exitMetricsDecode = DeviceMetricEventData.ExitMetrics.ADAPTER.decode(reader);
                                continue;
                            case 13:
                                displayMetricsDecode = DeviceMetricEventData.DisplayMetrics.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                instant = instantDecode;
                                d = dDoubleValue;
                                break;
                        }
                        instantDecode = instant;
                        dDoubleValue = d;
                    } else {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DeviceMetricEventData redact(DeviceMetricEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
                DeviceMetricEventData.RuntimeMetrics runtime = value.getRuntime();
                DeviceMetricEventData.RuntimeMetrics runtimeMetricsRedact = runtime != null ? DeviceMetricEventData.RuntimeMetrics.ADAPTER.redact(runtime) : null;
                DeviceMetricEventData.CpuMetrics cpu = value.getCpu();
                DeviceMetricEventData.CpuMetrics cpuMetricsRedact = cpu != null ? DeviceMetricEventData.CpuMetrics.ADAPTER.redact(cpu) : null;
                DeviceMetricEventData.GpuMetrics gpu = value.getGpu();
                DeviceMetricEventData.GpuMetrics gpuMetricsRedact = gpu != null ? DeviceMetricEventData.GpuMetrics.ADAPTER.redact(gpu) : null;
                DeviceMetricEventData.MemoryMetrics memory = value.getMemory();
                DeviceMetricEventData.MemoryMetrics memoryMetricsRedact = memory != null ? DeviceMetricEventData.MemoryMetrics.ADAPTER.redact(memory) : null;
                DeviceMetricEventData.DiskMetrics disk = value.getDisk();
                DeviceMetricEventData.DiskMetrics diskMetricsRedact = disk != null ? DeviceMetricEventData.DiskMetrics.ADAPTER.redact(disk) : null;
                DeviceMetricEventData.NetworkMetrics network = value.getNetwork();
                DeviceMetricEventData.NetworkMetrics networkMetricsRedact = network != null ? DeviceMetricEventData.NetworkMetrics.ADAPTER.redact(network) : null;
                DeviceMetricEventData.ResponsivenessMetrics responsiveness = value.getResponsiveness();
                DeviceMetricEventData.ResponsivenessMetrics responsivenessMetricsRedact = responsiveness != null ? DeviceMetricEventData.ResponsivenessMetrics.ADAPTER.redact(responsiveness) : null;
                DeviceMetricEventData.LaunchMetrics launch_metrics = value.getLaunch_metrics();
                DeviceMetricEventData.LaunchMetrics launchMetricsRedact = launch_metrics != null ? DeviceMetricEventData.LaunchMetrics.ADAPTER.redact(launch_metrics) : null;
                DeviceMetricEventData.ExitMetrics exit_metrics = value.getExit_metrics();
                DeviceMetricEventData.ExitMetrics exitMetricsRedact = exit_metrics != null ? DeviceMetricEventData.ExitMetrics.ADAPTER.redact(exit_metrics) : null;
                DeviceMetricEventData.DisplayMetrics display_metrics = value.getDisplay_metrics();
                return value.copy((8195 & 1) != 0 ? value.duration_seconds : 0.0d, (8195 & 2) != 0 ? value.app_state : null, (8195 & 4) != 0 ? value.timestamp : instantRedact, (8195 & 8) != 0 ? value.runtime : runtimeMetricsRedact, (8195 & 16) != 0 ? value.cpu : cpuMetricsRedact, (8195 & 32) != 0 ? value.gpu : gpuMetricsRedact, (8195 & 64) != 0 ? value.memory : memoryMetricsRedact, (8195 & 128) != 0 ? value.disk : diskMetricsRedact, (8195 & 256) != 0 ? value.network : networkMetricsRedact, (8195 & 512) != 0 ? value.responsiveness : responsivenessMetricsRedact, (8195 & 1024) != 0 ? value.launch_metrics : launchMetricsRedact, (8195 & 2048) != 0 ? value.exit_metrics : exitMetricsRedact, (8195 & 4096) != 0 ? value.display_metrics : display_metrics != null ? DeviceMetricEventData.DisplayMetrics.ADAPTER.redact(display_metrics) : null, (8195 & 8192) != 0 ? value.additional_info : null, (8195 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeviceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$AppState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "APP_STATE_UNSPECIFIED", "APP_STATE_ALL", "APP_STATE_BACKGROUND", "APP_STATE_FOREGROUND", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AppState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AppState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<AppState> ADAPTER;
        public static final AppState APP_STATE_ALL;
        public static final AppState APP_STATE_BACKGROUND;
        public static final AppState APP_STATE_FOREGROUND;
        public static final AppState APP_STATE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ AppState[] $values() {
            return new AppState[]{APP_STATE_UNSPECIFIED, APP_STATE_ALL, APP_STATE_BACKGROUND, APP_STATE_FOREGROUND};
        }

        @JvmStatic
        public static final AppState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AppState> getEntries() {
            return $ENTRIES;
        }

        private AppState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AppState appState = new AppState("APP_STATE_UNSPECIFIED", 0, 0);
            APP_STATE_UNSPECIFIED = appState;
            APP_STATE_ALL = new AppState("APP_STATE_ALL", 1, 1);
            APP_STATE_BACKGROUND = new AppState("APP_STATE_BACKGROUND", 2, 2);
            APP_STATE_FOREGROUND = new AppState("APP_STATE_FOREGROUND", 3, 3);
            AppState[] appStateArr$values = $values();
            $VALUES = appStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(appStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AppState>(orCreateKotlinClass, syntax, appState) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$AppState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public DeviceMetricEventData.AppState fromValue(int value) {
                    return DeviceMetricEventData.AppState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: DeviceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$AppState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$AppState;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AppState fromValue(int value) {
                if (value == 0) {
                    return AppState.APP_STATE_UNSPECIFIED;
                }
                if (value == 1) {
                    return AppState.APP_STATE_ALL;
                }
                if (value == 2) {
                    return AppState.APP_STATE_BACKGROUND;
                }
                if (value != 3) {
                    return null;
                }
                return AppState.APP_STATE_FOREGROUND;
            }
        }

        public static AppState valueOf(String str) {
            return (AppState) Enum.valueOf(AppState.class, str);
        }

        public static AppState[] values() {
            return (AppState[]) $VALUES.clone();
        }
    }

    /* compiled from: DeviceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$RuntimeMetrics;", "Lcom/squareup/wire/Message;", "", "foreground_time_seconds", "", "background_time_seconds", "unknownFields", "Lokio/ByteString;", "<init>", "(DDLokio/ByteString;)V", "getForeground_time_seconds", "()D", "getBackground_time_seconds", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RuntimeMetrics extends Message {

        @JvmField
        public static final ProtoAdapter<RuntimeMetrics> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "backgroundTimeSeconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final double background_time_seconds;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "foregroundTimeSeconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final double foreground_time_seconds;

        public RuntimeMetrics() {
            this(0.0d, 0.0d, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24213newBuilder();
        }

        public final double getForeground_time_seconds() {
            return this.foreground_time_seconds;
        }

        public final double getBackground_time_seconds() {
            return this.background_time_seconds;
        }

        public /* synthetic */ RuntimeMetrics(double d, double d2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuntimeMetrics(double d, double d2, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.foreground_time_seconds = d;
            this.background_time_seconds = d2;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24213newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof RuntimeMetrics)) {
                return false;
            }
            RuntimeMetrics runtimeMetrics = (RuntimeMetrics) other;
            return Intrinsics.areEqual(unknownFields(), runtimeMetrics.unknownFields()) && this.foreground_time_seconds == runtimeMetrics.foreground_time_seconds && this.background_time_seconds == runtimeMetrics.background_time_seconds;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + Double.hashCode(this.foreground_time_seconds)) * 37) + Double.hashCode(this.background_time_seconds);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("foreground_time_seconds=" + this.foreground_time_seconds);
            arrayList.add("background_time_seconds=" + this.background_time_seconds);
            return CollectionsKt.joinToString$default(arrayList, ", ", "RuntimeMetrics{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ RuntimeMetrics copy$default(RuntimeMetrics runtimeMetrics, double d, double d2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                d = runtimeMetrics.foreground_time_seconds;
            }
            double d3 = d;
            if ((i & 2) != 0) {
                d2 = runtimeMetrics.background_time_seconds;
            }
            double d4 = d2;
            if ((i & 4) != 0) {
                byteString = runtimeMetrics.unknownFields();
            }
            return runtimeMetrics.copy(d3, d4, byteString);
        }

        public final RuntimeMetrics copy(double foreground_time_seconds, double background_time_seconds, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new RuntimeMetrics(foreground_time_seconds, background_time_seconds, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RuntimeMetrics.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<RuntimeMetrics>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$RuntimeMetrics$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.RuntimeMetrics decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    double dDoubleValue = 0.0d;
                    double dDoubleValue2 = 0.0d;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DeviceMetricEventData.RuntimeMetrics(dDoubleValue, dDoubleValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 2) {
                            dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(DeviceMetricEventData.RuntimeMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    Double dValueOf = Double.valueOf(value.getForeground_time_seconds());
                    Double dValueOf2 = Double.valueOf(0.0d);
                    if (!dValueOf.equals(dValueOf2)) {
                        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getForeground_time_seconds()));
                    }
                    return !Double.valueOf(value.getBackground_time_seconds()).equals(dValueOf2) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getBackground_time_seconds())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, DeviceMetricEventData.RuntimeMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Double dValueOf = Double.valueOf(value.getForeground_time_seconds());
                    Double dValueOf2 = Double.valueOf(0.0d);
                    if (!dValueOf.equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getForeground_time_seconds()));
                    }
                    if (!Double.valueOf(value.getBackground_time_seconds()).equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getBackground_time_seconds()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, DeviceMetricEventData.RuntimeMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    Double dValueOf = Double.valueOf(value.getBackground_time_seconds());
                    Double dValueOf2 = Double.valueOf(0.0d);
                    if (!dValueOf.equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getBackground_time_seconds()));
                    }
                    if (Double.valueOf(value.getForeground_time_seconds()).equals(dValueOf2)) {
                        return;
                    }
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getForeground_time_seconds()));
                }

                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.RuntimeMetrics redact(DeviceMetricEventData.RuntimeMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return DeviceMetricEventData.RuntimeMetrics.copy$default(value, 0.0d, 0.0d, ByteString.EMPTY, 3, null);
                }
            };
        }
    }

    /* compiled from: DeviceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$CpuMetrics;", "Lcom/squareup/wire/Message;", "", "total_time_seconds", "", "utime_seconds", "stime_seconds", "cumulative_kiloinstructions", "unknownFields", "Lokio/ByteString;", "<init>", "(DDDDLokio/ByteString;)V", "getTotal_time_seconds", "()D", "getUtime_seconds", "getStime_seconds", "getCumulative_kiloinstructions", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CpuMetrics extends Message {

        @JvmField
        public static final ProtoAdapter<CpuMetrics> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "cumulativeKiloinstructions", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final double cumulative_kiloinstructions;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "stimeSeconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final double stime_seconds;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "totalTimeSeconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final double total_time_seconds;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "utimeSeconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final double utime_seconds;

        public CpuMetrics() {
            this(0.0d, 0.0d, 0.0d, 0.0d, null, 31, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24199newBuilder();
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

        public /* synthetic */ CpuMetrics(double d, double d2, double d3, double d4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CpuMetrics(double d, double d2, double d3, double d4, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.total_time_seconds = d;
            this.utime_seconds = d2;
            this.stime_seconds = d3;
            this.cumulative_kiloinstructions = d4;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24199newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CpuMetrics)) {
                return false;
            }
            CpuMetrics cpuMetrics = (CpuMetrics) other;
            return Intrinsics.areEqual(unknownFields(), cpuMetrics.unknownFields()) && this.total_time_seconds == cpuMetrics.total_time_seconds && this.utime_seconds == cpuMetrics.utime_seconds && this.stime_seconds == cpuMetrics.stime_seconds && this.cumulative_kiloinstructions == cpuMetrics.cumulative_kiloinstructions;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((unknownFields().hashCode() * 37) + Double.hashCode(this.total_time_seconds)) * 37) + Double.hashCode(this.utime_seconds)) * 37) + Double.hashCode(this.stime_seconds)) * 37) + Double.hashCode(this.cumulative_kiloinstructions);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("total_time_seconds=" + this.total_time_seconds);
            arrayList.add("utime_seconds=" + this.utime_seconds);
            arrayList.add("stime_seconds=" + this.stime_seconds);
            arrayList.add("cumulative_kiloinstructions=" + this.cumulative_kiloinstructions);
            return CollectionsKt.joinToString$default(arrayList, ", ", "CpuMetrics{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ CpuMetrics copy$default(CpuMetrics cpuMetrics, double d, double d2, double d3, double d4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                d = cpuMetrics.total_time_seconds;
            }
            double d5 = d;
            if ((i & 2) != 0) {
                d2 = cpuMetrics.utime_seconds;
            }
            return cpuMetrics.copy(d5, d2, (i & 4) != 0 ? cpuMetrics.stime_seconds : d3, (i & 8) != 0 ? cpuMetrics.cumulative_kiloinstructions : d4, (i & 16) != 0 ? cpuMetrics.unknownFields() : byteString);
        }

        public final CpuMetrics copy(double total_time_seconds, double utime_seconds, double stime_seconds, double cumulative_kiloinstructions, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CpuMetrics(total_time_seconds, utime_seconds, stime_seconds, cumulative_kiloinstructions, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CpuMetrics.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CpuMetrics>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$CpuMetrics$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.CpuMetrics decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    double dDoubleValue = 0.0d;
                    double dDoubleValue2 = 0.0d;
                    double dDoubleValue3 = 0.0d;
                    double dDoubleValue4 = 0.0d;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DeviceMetricEventData.CpuMetrics(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 2) {
                            dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 3) {
                            dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 4) {
                            dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(DeviceMetricEventData.CpuMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    Double dValueOf = Double.valueOf(value.getTotal_time_seconds());
                    Double dValueOf2 = Double.valueOf(0.0d);
                    if (!dValueOf.equals(dValueOf2)) {
                        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getTotal_time_seconds()));
                    }
                    if (!Double.valueOf(value.getUtime_seconds()).equals(dValueOf2)) {
                        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getUtime_seconds()));
                    }
                    if (!Double.valueOf(value.getStime_seconds()).equals(dValueOf2)) {
                        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getStime_seconds()));
                    }
                    return !Double.valueOf(value.getCumulative_kiloinstructions()).equals(dValueOf2) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getCumulative_kiloinstructions())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, DeviceMetricEventData.CpuMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Double dValueOf = Double.valueOf(value.getTotal_time_seconds());
                    Double dValueOf2 = Double.valueOf(0.0d);
                    if (!dValueOf.equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getTotal_time_seconds()));
                    }
                    if (!Double.valueOf(value.getUtime_seconds()).equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getUtime_seconds()));
                    }
                    if (!Double.valueOf(value.getStime_seconds()).equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getStime_seconds()));
                    }
                    if (!Double.valueOf(value.getCumulative_kiloinstructions()).equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getCumulative_kiloinstructions()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, DeviceMetricEventData.CpuMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    Double dValueOf = Double.valueOf(value.getCumulative_kiloinstructions());
                    Double dValueOf2 = Double.valueOf(0.0d);
                    if (!dValueOf.equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getCumulative_kiloinstructions()));
                    }
                    if (!Double.valueOf(value.getStime_seconds()).equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getStime_seconds()));
                    }
                    if (!Double.valueOf(value.getUtime_seconds()).equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getUtime_seconds()));
                    }
                    if (Double.valueOf(value.getTotal_time_seconds()).equals(dValueOf2)) {
                        return;
                    }
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getTotal_time_seconds()));
                }

                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.CpuMetrics redact(DeviceMetricEventData.CpuMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return DeviceMetricEventData.CpuMetrics.copy$default(value, 0.0d, 0.0d, 0.0d, 0.0d, ByteString.EMPTY, 15, null);
                }
            };
        }
    }

    /* compiled from: DeviceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$GpuMetrics;", "Lcom/squareup/wire/Message;", "", "total_time_seconds", "", "unknownFields", "Lokio/ByteString;", "<init>", "(DLokio/ByteString;)V", "getTotal_time_seconds", "()D", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GpuMetrics extends Message {

        @JvmField
        public static final ProtoAdapter<GpuMetrics> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "totalTimeSeconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final double total_time_seconds;

        public GpuMetrics() {
            this(0.0d, null, 3, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24206newBuilder();
        }

        public final double getTotal_time_seconds() {
            return this.total_time_seconds;
        }

        public /* synthetic */ GpuMetrics(double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GpuMetrics(double d, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.total_time_seconds = d;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24206newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof GpuMetrics)) {
                return false;
            }
            GpuMetrics gpuMetrics = (GpuMetrics) other;
            return Intrinsics.areEqual(unknownFields(), gpuMetrics.unknownFields()) && this.total_time_seconds == gpuMetrics.total_time_seconds;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + Double.hashCode(this.total_time_seconds);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("total_time_seconds=" + this.total_time_seconds);
            return CollectionsKt.joinToString$default(arrayList, ", ", "GpuMetrics{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ GpuMetrics copy$default(GpuMetrics gpuMetrics, double d, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                d = gpuMetrics.total_time_seconds;
            }
            if ((i & 2) != 0) {
                byteString = gpuMetrics.unknownFields();
            }
            return gpuMetrics.copy(d, byteString);
        }

        public final GpuMetrics copy(double total_time_seconds, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new GpuMetrics(total_time_seconds, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GpuMetrics.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<GpuMetrics>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$GpuMetrics$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.GpuMetrics decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    double dDoubleValue = 0.0d;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DeviceMetricEventData.GpuMetrics(dDoubleValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(DeviceMetricEventData.GpuMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return !Double.valueOf(value.getTotal_time_seconds()).equals(Double.valueOf(0.0d)) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getTotal_time_seconds())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, DeviceMetricEventData.GpuMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Double.valueOf(value.getTotal_time_seconds()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getTotal_time_seconds()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, DeviceMetricEventData.GpuMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (Double.valueOf(value.getTotal_time_seconds()).equals(Double.valueOf(0.0d))) {
                        return;
                    }
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getTotal_time_seconds()));
                }

                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.GpuMetrics redact(DeviceMetricEventData.GpuMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return DeviceMetricEventData.GpuMetrics.copy$default(value, 0.0d, ByteString.EMPTY, 1, null);
                }
            };
        }
    }

    /* compiled from: DeviceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$MemoryMetrics;", "Lcom/squareup/wire/Message;", "", "peak_usage_kb", "", "average_usage_when_suspended_kb", "min_threshold_kb", "", "low_memory_event_count", "", "unknownFields", "Lokio/ByteString;", "<init>", "(DDJILokio/ByteString;)V", "getPeak_usage_kb", "()D", "getAverage_usage_when_suspended_kb", "getMin_threshold_kb", "()J", "getLow_memory_event_count", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MemoryMetrics extends Message {

        @JvmField
        public static final ProtoAdapter<MemoryMetrics> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "averageUsageWhenSuspendedKb", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final double average_usage_when_suspended_kb;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "lowMemoryEventCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final int low_memory_event_count;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "minThresholdKb", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final long min_threshold_kb;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "peakUsageKb", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final double peak_usage_kb;

        public MemoryMetrics() {
            this(0.0d, 0.0d, 0L, 0, null, 31, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24208newBuilder();
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

        public /* synthetic */ MemoryMetrics(double d, double d2, long j, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0.0d : d, (i2 & 2) != 0 ? 0.0d : d2, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MemoryMetrics(double d, double d2, long j, int i, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.peak_usage_kb = d;
            this.average_usage_when_suspended_kb = d2;
            this.min_threshold_kb = j;
            this.low_memory_event_count = i;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24208newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof MemoryMetrics)) {
                return false;
            }
            MemoryMetrics memoryMetrics = (MemoryMetrics) other;
            return Intrinsics.areEqual(unknownFields(), memoryMetrics.unknownFields()) && this.peak_usage_kb == memoryMetrics.peak_usage_kb && this.average_usage_when_suspended_kb == memoryMetrics.average_usage_when_suspended_kb && this.min_threshold_kb == memoryMetrics.min_threshold_kb && this.low_memory_event_count == memoryMetrics.low_memory_event_count;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((unknownFields().hashCode() * 37) + Double.hashCode(this.peak_usage_kb)) * 37) + Double.hashCode(this.average_usage_when_suspended_kb)) * 37) + Long.hashCode(this.min_threshold_kb)) * 37) + Integer.hashCode(this.low_memory_event_count);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("peak_usage_kb=" + this.peak_usage_kb);
            arrayList.add("average_usage_when_suspended_kb=" + this.average_usage_when_suspended_kb);
            arrayList.add("min_threshold_kb=" + this.min_threshold_kb);
            arrayList.add("low_memory_event_count=" + this.low_memory_event_count);
            return CollectionsKt.joinToString$default(arrayList, ", ", "MemoryMetrics{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ MemoryMetrics copy$default(MemoryMetrics memoryMetrics, double d, double d2, long j, int i, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                d = memoryMetrics.peak_usage_kb;
            }
            double d3 = d;
            if ((i2 & 2) != 0) {
                d2 = memoryMetrics.average_usage_when_suspended_kb;
            }
            double d4 = d2;
            if ((i2 & 4) != 0) {
                j = memoryMetrics.min_threshold_kb;
            }
            return memoryMetrics.copy(d3, d4, j, (i2 & 8) != 0 ? memoryMetrics.low_memory_event_count : i, (i2 & 16) != 0 ? memoryMetrics.unknownFields() : byteString);
        }

        public final MemoryMetrics copy(double peak_usage_kb, double average_usage_when_suspended_kb, long min_threshold_kb, int low_memory_event_count, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new MemoryMetrics(peak_usage_kb, average_usage_when_suspended_kb, min_threshold_kb, low_memory_event_count, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MemoryMetrics.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<MemoryMetrics>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$MemoryMetrics$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.MemoryMetrics decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    double dDoubleValue = 0.0d;
                    double dDoubleValue2 = 0.0d;
                    long jLongValue = 0;
                    int iIntValue = 0;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DeviceMetricEventData.MemoryMetrics(dDoubleValue, dDoubleValue2, jLongValue, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 2) {
                            dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 3) {
                            jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                        } else if (iNextTag == 4) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(DeviceMetricEventData.MemoryMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    Double dValueOf = Double.valueOf(value.getPeak_usage_kb());
                    Double dValueOf2 = Double.valueOf(0.0d);
                    if (!dValueOf.equals(dValueOf2)) {
                        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getPeak_usage_kb()));
                    }
                    if (!Double.valueOf(value.getAverage_usage_when_suspended_kb()).equals(dValueOf2)) {
                        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getAverage_usage_when_suspended_kb()));
                    }
                    if (value.getMin_threshold_kb() != 0) {
                        size += ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(value.getMin_threshold_kb()));
                    }
                    return value.getLow_memory_event_count() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getLow_memory_event_count())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, DeviceMetricEventData.MemoryMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Double dValueOf = Double.valueOf(value.getPeak_usage_kb());
                    Double dValueOf2 = Double.valueOf(0.0d);
                    if (!dValueOf.equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getPeak_usage_kb()));
                    }
                    if (!Double.valueOf(value.getAverage_usage_when_suspended_kb()).equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getAverage_usage_when_suspended_kb()));
                    }
                    if (value.getMin_threshold_kb() != 0) {
                        ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getMin_threshold_kb()));
                    }
                    if (value.getLow_memory_event_count() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getLow_memory_event_count()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, DeviceMetricEventData.MemoryMetrics value) throws IOException {
                    Double dValueOf = Double.valueOf(0.0d);
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getLow_memory_event_count() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getLow_memory_event_count()));
                    }
                    if (value.getMin_threshold_kb() != 0) {
                        ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getMin_threshold_kb()));
                    }
                    if (!Double.valueOf(value.getAverage_usage_when_suspended_kb()).equals(dValueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getAverage_usage_when_suspended_kb()));
                    }
                    if (Double.valueOf(value.getPeak_usage_kb()).equals(dValueOf)) {
                        return;
                    }
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getPeak_usage_kb()));
                }

                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.MemoryMetrics redact(DeviceMetricEventData.MemoryMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return DeviceMetricEventData.MemoryMetrics.copy$default(value, 0.0d, 0.0d, 0L, 0, ByteString.EMPTY, 15, null);
                }
            };
        }
    }

    /* compiled from: DeviceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DiskMetrics;", "Lcom/squareup/wire/Message;", "", "total_written_kb", "", "unknownFields", "Lokio/ByteString;", "<init>", "(DLokio/ByteString;)V", "getTotal_written_kb", "()D", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DiskMetrics extends Message {

        @JvmField
        public static final ProtoAdapter<DiskMetrics> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "totalWrittenKb", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final double total_written_kb;

        public DiskMetrics() {
            this(0.0d, null, 3, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24200newBuilder();
        }

        public final double getTotal_written_kb() {
            return this.total_written_kb;
        }

        public /* synthetic */ DiskMetrics(double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DiskMetrics(double d, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.total_written_kb = d;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24200newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DiskMetrics)) {
                return false;
            }
            DiskMetrics diskMetrics = (DiskMetrics) other;
            return Intrinsics.areEqual(unknownFields(), diskMetrics.unknownFields()) && this.total_written_kb == diskMetrics.total_written_kb;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + Double.hashCode(this.total_written_kb);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("total_written_kb=" + this.total_written_kb);
            return CollectionsKt.joinToString$default(arrayList, ", ", "DiskMetrics{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ DiskMetrics copy$default(DiskMetrics diskMetrics, double d, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                d = diskMetrics.total_written_kb;
            }
            if ((i & 2) != 0) {
                byteString = diskMetrics.unknownFields();
            }
            return diskMetrics.copy(d, byteString);
        }

        public final DiskMetrics copy(double total_written_kb, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new DiskMetrics(total_written_kb, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DiskMetrics.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<DiskMetrics>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$DiskMetrics$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.DiskMetrics decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    double dDoubleValue = 0.0d;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DeviceMetricEventData.DiskMetrics(dDoubleValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(DeviceMetricEventData.DiskMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return !Double.valueOf(value.getTotal_written_kb()).equals(Double.valueOf(0.0d)) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getTotal_written_kb())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, DeviceMetricEventData.DiskMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Double.valueOf(value.getTotal_written_kb()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getTotal_written_kb()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, DeviceMetricEventData.DiskMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (Double.valueOf(value.getTotal_written_kb()).equals(Double.valueOf(0.0d))) {
                        return;
                    }
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getTotal_written_kb()));
                }

                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.DiskMetrics redact(DeviceMetricEventData.DiskMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return DeviceMetricEventData.DiskMetrics.copy$default(value, 0.0d, ByteString.EMPTY, 1, null);
                }
            };
        }
    }

    /* compiled from: DeviceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005#$%&'Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016Jp\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics;", "Lcom/squareup/wire/Message;", "", "other", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$ConnectionMetrics;", Constants.WIFI, "cellular", "bluetooth", "ethernet", "vpn", "wifi_aware", "lowpan", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$ConnectionMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$ConnectionMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$ConnectionMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$ConnectionMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$ConnectionMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$ConnectionMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$ConnectionMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$ConnectionMetrics;Lokio/ByteString;)V", "getOther", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$ConnectionMetrics;", "getWifi", "getCellular", "getBluetooth", "getEthernet", "getVpn", "getWifi_aware", "getLowpan", "newBuilder", "equals", "", "other_", "", "hashCode", "", "toString", "", "copy", "Companion", "ConnectionMetrics", "TransferStats", "Metered", "Roaming", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NetworkMetrics extends Message {

        @JvmField
        public static final ProtoAdapter<NetworkMetrics> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$ConnectionMetrics#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final ConnectionMetrics bluetooth;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$ConnectionMetrics#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final ConnectionMetrics cellular;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$ConnectionMetrics#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final ConnectionMetrics ethernet;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$ConnectionMetrics#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
        private final ConnectionMetrics lowpan;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$ConnectionMetrics#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final ConnectionMetrics other;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$ConnectionMetrics#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
        private final ConnectionMetrics vpn;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$ConnectionMetrics#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final ConnectionMetrics wifi;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$ConnectionMetrics#ADAPTER", jsonName = "wifiAware", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
        private final ConnectionMetrics wifi_aware;

        public NetworkMetrics() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24209newBuilder();
        }

        public final ConnectionMetrics getOther() {
            return this.other;
        }

        public final ConnectionMetrics getWifi() {
            return this.wifi;
        }

        public final ConnectionMetrics getCellular() {
            return this.cellular;
        }

        public final ConnectionMetrics getBluetooth() {
            return this.bluetooth;
        }

        public final ConnectionMetrics getEthernet() {
            return this.ethernet;
        }

        public final ConnectionMetrics getVpn() {
            return this.vpn;
        }

        public final ConnectionMetrics getWifi_aware() {
            return this.wifi_aware;
        }

        public final ConnectionMetrics getLowpan() {
            return this.lowpan;
        }

        public /* synthetic */ NetworkMetrics(ConnectionMetrics connectionMetrics, ConnectionMetrics connectionMetrics2, ConnectionMetrics connectionMetrics3, ConnectionMetrics connectionMetrics4, ConnectionMetrics connectionMetrics5, ConnectionMetrics connectionMetrics6, ConnectionMetrics connectionMetrics7, ConnectionMetrics connectionMetrics8, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : connectionMetrics, (i & 2) != 0 ? null : connectionMetrics2, (i & 4) != 0 ? null : connectionMetrics3, (i & 8) != 0 ? null : connectionMetrics4, (i & 16) != 0 ? null : connectionMetrics5, (i & 32) != 0 ? null : connectionMetrics6, (i & 64) != 0 ? null : connectionMetrics7, (i & 128) != 0 ? null : connectionMetrics8, (i & 256) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkMetrics(ConnectionMetrics connectionMetrics, ConnectionMetrics connectionMetrics2, ConnectionMetrics connectionMetrics3, ConnectionMetrics connectionMetrics4, ConnectionMetrics connectionMetrics5, ConnectionMetrics connectionMetrics6, ConnectionMetrics connectionMetrics7, ConnectionMetrics connectionMetrics8, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.other = connectionMetrics;
            this.wifi = connectionMetrics2;
            this.cellular = connectionMetrics3;
            this.bluetooth = connectionMetrics4;
            this.ethernet = connectionMetrics5;
            this.vpn = connectionMetrics6;
            this.wifi_aware = connectionMetrics7;
            this.lowpan = connectionMetrics8;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24209newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other_) {
            if (other_ == this) {
                return true;
            }
            if (!(other_ instanceof NetworkMetrics)) {
                return false;
            }
            NetworkMetrics networkMetrics = (NetworkMetrics) other_;
            return Intrinsics.areEqual(unknownFields(), networkMetrics.unknownFields()) && Intrinsics.areEqual(this.other, networkMetrics.other) && Intrinsics.areEqual(this.wifi, networkMetrics.wifi) && Intrinsics.areEqual(this.cellular, networkMetrics.cellular) && Intrinsics.areEqual(this.bluetooth, networkMetrics.bluetooth) && Intrinsics.areEqual(this.ethernet, networkMetrics.ethernet) && Intrinsics.areEqual(this.vpn, networkMetrics.vpn) && Intrinsics.areEqual(this.wifi_aware, networkMetrics.wifi_aware) && Intrinsics.areEqual(this.lowpan, networkMetrics.lowpan);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ConnectionMetrics connectionMetrics = this.other;
            int iHashCode2 = (iHashCode + (connectionMetrics != null ? connectionMetrics.hashCode() : 0)) * 37;
            ConnectionMetrics connectionMetrics2 = this.wifi;
            int iHashCode3 = (iHashCode2 + (connectionMetrics2 != null ? connectionMetrics2.hashCode() : 0)) * 37;
            ConnectionMetrics connectionMetrics3 = this.cellular;
            int iHashCode4 = (iHashCode3 + (connectionMetrics3 != null ? connectionMetrics3.hashCode() : 0)) * 37;
            ConnectionMetrics connectionMetrics4 = this.bluetooth;
            int iHashCode5 = (iHashCode4 + (connectionMetrics4 != null ? connectionMetrics4.hashCode() : 0)) * 37;
            ConnectionMetrics connectionMetrics5 = this.ethernet;
            int iHashCode6 = (iHashCode5 + (connectionMetrics5 != null ? connectionMetrics5.hashCode() : 0)) * 37;
            ConnectionMetrics connectionMetrics6 = this.vpn;
            int iHashCode7 = (iHashCode6 + (connectionMetrics6 != null ? connectionMetrics6.hashCode() : 0)) * 37;
            ConnectionMetrics connectionMetrics7 = this.wifi_aware;
            int iHashCode8 = (iHashCode7 + (connectionMetrics7 != null ? connectionMetrics7.hashCode() : 0)) * 37;
            ConnectionMetrics connectionMetrics8 = this.lowpan;
            int iHashCode9 = iHashCode8 + (connectionMetrics8 != null ? connectionMetrics8.hashCode() : 0);
            this.hashCode = iHashCode9;
            return iHashCode9;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ConnectionMetrics connectionMetrics = this.other;
            if (connectionMetrics != null) {
                arrayList.add("other=" + connectionMetrics);
            }
            ConnectionMetrics connectionMetrics2 = this.wifi;
            if (connectionMetrics2 != null) {
                arrayList.add("wifi=" + connectionMetrics2);
            }
            ConnectionMetrics connectionMetrics3 = this.cellular;
            if (connectionMetrics3 != null) {
                arrayList.add("cellular=" + connectionMetrics3);
            }
            ConnectionMetrics connectionMetrics4 = this.bluetooth;
            if (connectionMetrics4 != null) {
                arrayList.add("bluetooth=" + connectionMetrics4);
            }
            ConnectionMetrics connectionMetrics5 = this.ethernet;
            if (connectionMetrics5 != null) {
                arrayList.add("ethernet=" + connectionMetrics5);
            }
            ConnectionMetrics connectionMetrics6 = this.vpn;
            if (connectionMetrics6 != null) {
                arrayList.add("vpn=" + connectionMetrics6);
            }
            ConnectionMetrics connectionMetrics7 = this.wifi_aware;
            if (connectionMetrics7 != null) {
                arrayList.add("wifi_aware=" + connectionMetrics7);
            }
            ConnectionMetrics connectionMetrics8 = this.lowpan;
            if (connectionMetrics8 != null) {
                arrayList.add("lowpan=" + connectionMetrics8);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "NetworkMetrics{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ NetworkMetrics copy$default(NetworkMetrics networkMetrics, ConnectionMetrics connectionMetrics, ConnectionMetrics connectionMetrics2, ConnectionMetrics connectionMetrics3, ConnectionMetrics connectionMetrics4, ConnectionMetrics connectionMetrics5, ConnectionMetrics connectionMetrics6, ConnectionMetrics connectionMetrics7, ConnectionMetrics connectionMetrics8, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                connectionMetrics = networkMetrics.other;
            }
            if ((i & 2) != 0) {
                connectionMetrics2 = networkMetrics.wifi;
            }
            if ((i & 4) != 0) {
                connectionMetrics3 = networkMetrics.cellular;
            }
            if ((i & 8) != 0) {
                connectionMetrics4 = networkMetrics.bluetooth;
            }
            if ((i & 16) != 0) {
                connectionMetrics5 = networkMetrics.ethernet;
            }
            if ((i & 32) != 0) {
                connectionMetrics6 = networkMetrics.vpn;
            }
            if ((i & 64) != 0) {
                connectionMetrics7 = networkMetrics.wifi_aware;
            }
            if ((i & 128) != 0) {
                connectionMetrics8 = networkMetrics.lowpan;
            }
            if ((i & 256) != 0) {
                byteString = networkMetrics.unknownFields();
            }
            ConnectionMetrics connectionMetrics9 = connectionMetrics8;
            ByteString byteString2 = byteString;
            ConnectionMetrics connectionMetrics10 = connectionMetrics6;
            ConnectionMetrics connectionMetrics11 = connectionMetrics7;
            ConnectionMetrics connectionMetrics12 = connectionMetrics5;
            ConnectionMetrics connectionMetrics13 = connectionMetrics3;
            return networkMetrics.copy(connectionMetrics, connectionMetrics2, connectionMetrics13, connectionMetrics4, connectionMetrics12, connectionMetrics10, connectionMetrics11, connectionMetrics9, byteString2);
        }

        public final NetworkMetrics copy(ConnectionMetrics other, ConnectionMetrics wifi, ConnectionMetrics cellular, ConnectionMetrics bluetooth, ConnectionMetrics ethernet, ConnectionMetrics vpn, ConnectionMetrics wifi_aware, ConnectionMetrics lowpan, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new NetworkMetrics(other, wifi, cellular, bluetooth, ethernet, vpn, wifi_aware, lowpan, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NetworkMetrics.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<NetworkMetrics>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.NetworkMetrics decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsDecode = null;
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsDecode2 = null;
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsDecode3 = null;
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsDecode4 = null;
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsDecode5 = null;
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsDecode6 = null;
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsDecode7 = null;
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsDecode8 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    connectionMetricsDecode = DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.decode(reader);
                                    break;
                                case 2:
                                    connectionMetricsDecode2 = DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.decode(reader);
                                    break;
                                case 3:
                                    connectionMetricsDecode3 = DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    connectionMetricsDecode4 = DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    connectionMetricsDecode5 = DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    connectionMetricsDecode6 = DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.decode(reader);
                                    break;
                                case 7:
                                    connectionMetricsDecode7 = DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.decode(reader);
                                    break;
                                case 8:
                                    connectionMetricsDecode8 = DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new DeviceMetricEventData.NetworkMetrics(connectionMetricsDecode, connectionMetricsDecode2, connectionMetricsDecode3, connectionMetricsDecode4, connectionMetricsDecode5, connectionMetricsDecode6, connectionMetricsDecode7, connectionMetricsDecode8, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(DeviceMetricEventData.NetworkMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getOther() != null) {
                        size += DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodedSizeWithTag(1, value.getOther());
                    }
                    if (value.getWifi() != null) {
                        size += DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodedSizeWithTag(2, value.getWifi());
                    }
                    if (value.getCellular() != null) {
                        size += DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodedSizeWithTag(3, value.getCellular());
                    }
                    if (value.getBluetooth() != null) {
                        size += DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodedSizeWithTag(4, value.getBluetooth());
                    }
                    if (value.getEthernet() != null) {
                        size += DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodedSizeWithTag(5, value.getEthernet());
                    }
                    if (value.getVpn() != null) {
                        size += DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodedSizeWithTag(6, value.getVpn());
                    }
                    if (value.getWifi_aware() != null) {
                        size += DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodedSizeWithTag(7, value.getWifi_aware());
                    }
                    return value.getLowpan() != null ? size + DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodedSizeWithTag(8, value.getLowpan()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, DeviceMetricEventData.NetworkMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getOther() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 1, (int) value.getOther());
                    }
                    if (value.getWifi() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 2, (int) value.getWifi());
                    }
                    if (value.getCellular() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 3, (int) value.getCellular());
                    }
                    if (value.getBluetooth() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 4, (int) value.getBluetooth());
                    }
                    if (value.getEthernet() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 5, (int) value.getEthernet());
                    }
                    if (value.getVpn() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 6, (int) value.getVpn());
                    }
                    if (value.getWifi_aware() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 7, (int) value.getWifi_aware());
                    }
                    if (value.getLowpan() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 8, (int) value.getLowpan());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, DeviceMetricEventData.NetworkMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getLowpan() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 8, (int) value.getLowpan());
                    }
                    if (value.getWifi_aware() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 7, (int) value.getWifi_aware());
                    }
                    if (value.getVpn() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 6, (int) value.getVpn());
                    }
                    if (value.getEthernet() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 5, (int) value.getEthernet());
                    }
                    if (value.getBluetooth() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 4, (int) value.getBluetooth());
                    }
                    if (value.getCellular() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 3, (int) value.getCellular());
                    }
                    if (value.getWifi() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 2, (int) value.getWifi());
                    }
                    if (value.getOther() != null) {
                        DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.encodeWithTag(writer, 1, (int) value.getOther());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.NetworkMetrics redact(DeviceMetricEventData.NetworkMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics other = value.getOther();
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsRedact = other != null ? DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.redact(other) : null;
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics wifi = value.getWifi();
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsRedact2 = wifi != null ? DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.redact(wifi) : null;
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics cellular = value.getCellular();
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsRedact3 = cellular != null ? DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.redact(cellular) : null;
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics bluetooth = value.getBluetooth();
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsRedact4 = bluetooth != null ? DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.redact(bluetooth) : null;
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics ethernet = value.getEthernet();
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsRedact5 = ethernet != null ? DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.redact(ethernet) : null;
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics vpn = value.getVpn();
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsRedact6 = vpn != null ? DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.redact(vpn) : null;
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics wifi_aware = value.getWifi_aware();
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics connectionMetricsRedact7 = wifi_aware != null ? DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.redact(wifi_aware) : null;
                    DeviceMetricEventData.NetworkMetrics.ConnectionMetrics lowpan = value.getLowpan();
                    return value.copy(connectionMetricsRedact, connectionMetricsRedact2, connectionMetricsRedact3, connectionMetricsRedact4, connectionMetricsRedact5, connectionMetricsRedact6, connectionMetricsRedact7, lowpan != null ? DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.ADAPTER.redact(lowpan) : null, ByteString.EMPTY);
                }
            };
        }

        /* compiled from: DeviceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016JF\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$ConnectionMetrics;", "Lcom/squareup/wire/Message;", "", "time_seconds", "", "download", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$TransferStats;", "upload", "metered", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Metered;", "roaming", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Roaming;", "unknownFields", "Lokio/ByteString;", "<init>", "(DLcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$TransferStats;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$TransferStats;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Metered;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Roaming;Lokio/ByteString;)V", "getTime_seconds", "()D", "getDownload", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$TransferStats;", "getUpload", "getMetered", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Metered;", "getRoaming", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Roaming;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ConnectionMetrics extends Message {

            @JvmField
            public static final ProtoAdapter<ConnectionMetrics> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$TransferStats#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final TransferStats download;

            @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$Metered#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
            private final Metered metered;

            @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$Roaming#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
            private final Roaming roaming;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "timeSeconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final double time_seconds;

            @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$TransferStats#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final TransferStats upload;

            public ConnectionMetrics() {
                this(0.0d, null, null, null, null, null, 63, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m24210newBuilder();
            }

            public final double getTime_seconds() {
                return this.time_seconds;
            }

            public final TransferStats getDownload() {
                return this.download;
            }

            public final TransferStats getUpload() {
                return this.upload;
            }

            public final Metered getMetered() {
                return this.metered;
            }

            public /* synthetic */ ConnectionMetrics(double d, TransferStats transferStats, TransferStats transferStats2, Metered metered, Roaming roaming, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? null : transferStats, (i & 4) == 0 ? transferStats2 : null, (i & 8) != 0 ? Metered.METERED_UNSPECIFIED : metered, (i & 16) != 0 ? Roaming.ROAMING_UNSPECIFIED : roaming, (i & 32) != 0 ? ByteString.EMPTY : byteString);
            }

            public final Roaming getRoaming() {
                return this.roaming;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConnectionMetrics(double d, TransferStats transferStats, TransferStats transferStats2, Metered metered, Roaming roaming, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(metered, "metered");
                Intrinsics.checkNotNullParameter(roaming, "roaming");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.time_seconds = d;
                this.download = transferStats;
                this.upload = transferStats2;
                this.metered = metered;
                this.roaming = roaming;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m24210newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ConnectionMetrics)) {
                    return false;
                }
                ConnectionMetrics connectionMetrics = (ConnectionMetrics) other;
                return Intrinsics.areEqual(unknownFields(), connectionMetrics.unknownFields()) && this.time_seconds == connectionMetrics.time_seconds && Intrinsics.areEqual(this.download, connectionMetrics.download) && Intrinsics.areEqual(this.upload, connectionMetrics.upload) && this.metered == connectionMetrics.metered && this.roaming == connectionMetrics.roaming;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = ((unknownFields().hashCode() * 37) + Double.hashCode(this.time_seconds)) * 37;
                TransferStats transferStats = this.download;
                int iHashCode2 = (iHashCode + (transferStats != null ? transferStats.hashCode() : 0)) * 37;
                TransferStats transferStats2 = this.upload;
                int iHashCode3 = ((((iHashCode2 + (transferStats2 != null ? transferStats2.hashCode() : 0)) * 37) + this.metered.hashCode()) * 37) + this.roaming.hashCode();
                this.hashCode = iHashCode3;
                return iHashCode3;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("time_seconds=" + this.time_seconds);
                TransferStats transferStats = this.download;
                if (transferStats != null) {
                    arrayList.add("download=" + transferStats);
                }
                TransferStats transferStats2 = this.upload;
                if (transferStats2 != null) {
                    arrayList.add("upload=" + transferStats2);
                }
                arrayList.add("metered=" + this.metered);
                arrayList.add("roaming=" + this.roaming);
                return CollectionsKt.joinToString$default(arrayList, ", ", "ConnectionMetrics{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ ConnectionMetrics copy$default(ConnectionMetrics connectionMetrics, double d, TransferStats transferStats, TransferStats transferStats2, Metered metered, Roaming roaming, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = connectionMetrics.time_seconds;
                }
                double d2 = d;
                if ((i & 2) != 0) {
                    transferStats = connectionMetrics.download;
                }
                TransferStats transferStats3 = transferStats;
                if ((i & 4) != 0) {
                    transferStats2 = connectionMetrics.upload;
                }
                TransferStats transferStats4 = transferStats2;
                if ((i & 8) != 0) {
                    metered = connectionMetrics.metered;
                }
                Metered metered2 = metered;
                if ((i & 16) != 0) {
                    roaming = connectionMetrics.roaming;
                }
                Roaming roaming2 = roaming;
                if ((i & 32) != 0) {
                    byteString = connectionMetrics.unknownFields();
                }
                return connectionMetrics.copy(d2, transferStats3, transferStats4, metered2, roaming2, byteString);
            }

            public final ConnectionMetrics copy(double time_seconds, TransferStats download, TransferStats upload, Metered metered, Roaming roaming, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(metered, "metered");
                Intrinsics.checkNotNullParameter(roaming, "roaming");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new ConnectionMetrics(time_seconds, download, upload, metered, roaming, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConnectionMetrics.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<ConnectionMetrics>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$ConnectionMetrics$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(DeviceMetricEventData.NetworkMetrics.ConnectionMetrics value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Double.valueOf(value.getTime_seconds()).equals(Double.valueOf(0.0d))) {
                            size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getTime_seconds()));
                        }
                        if (value.getDownload() != null) {
                            size += DeviceMetricEventData.NetworkMetrics.TransferStats.ADAPTER.encodedSizeWithTag(2, value.getDownload());
                        }
                        if (value.getUpload() != null) {
                            size += DeviceMetricEventData.NetworkMetrics.TransferStats.ADAPTER.encodedSizeWithTag(3, value.getUpload());
                        }
                        if (value.getMetered() != DeviceMetricEventData.NetworkMetrics.Metered.METERED_UNSPECIFIED) {
                            size += DeviceMetricEventData.NetworkMetrics.Metered.ADAPTER.encodedSizeWithTag(4, value.getMetered());
                        }
                        return value.getRoaming() != DeviceMetricEventData.NetworkMetrics.Roaming.ROAMING_UNSPECIFIED ? size + DeviceMetricEventData.NetworkMetrics.Roaming.ADAPTER.encodedSizeWithTag(5, value.getRoaming()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, DeviceMetricEventData.NetworkMetrics.ConnectionMetrics value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Double.valueOf(value.getTime_seconds()).equals(Double.valueOf(0.0d))) {
                            ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getTime_seconds()));
                        }
                        if (value.getDownload() != null) {
                            DeviceMetricEventData.NetworkMetrics.TransferStats.ADAPTER.encodeWithTag(writer, 2, (int) value.getDownload());
                        }
                        if (value.getUpload() != null) {
                            DeviceMetricEventData.NetworkMetrics.TransferStats.ADAPTER.encodeWithTag(writer, 3, (int) value.getUpload());
                        }
                        if (value.getMetered() != DeviceMetricEventData.NetworkMetrics.Metered.METERED_UNSPECIFIED) {
                            DeviceMetricEventData.NetworkMetrics.Metered.ADAPTER.encodeWithTag(writer, 4, (int) value.getMetered());
                        }
                        if (value.getRoaming() != DeviceMetricEventData.NetworkMetrics.Roaming.ROAMING_UNSPECIFIED) {
                            DeviceMetricEventData.NetworkMetrics.Roaming.ADAPTER.encodeWithTag(writer, 5, (int) value.getRoaming());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, DeviceMetricEventData.NetworkMetrics.ConnectionMetrics value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getRoaming() != DeviceMetricEventData.NetworkMetrics.Roaming.ROAMING_UNSPECIFIED) {
                            DeviceMetricEventData.NetworkMetrics.Roaming.ADAPTER.encodeWithTag(writer, 5, (int) value.getRoaming());
                        }
                        if (value.getMetered() != DeviceMetricEventData.NetworkMetrics.Metered.METERED_UNSPECIFIED) {
                            DeviceMetricEventData.NetworkMetrics.Metered.ADAPTER.encodeWithTag(writer, 4, (int) value.getMetered());
                        }
                        if (value.getUpload() != null) {
                            DeviceMetricEventData.NetworkMetrics.TransferStats.ADAPTER.encodeWithTag(writer, 3, (int) value.getUpload());
                        }
                        if (value.getDownload() != null) {
                            DeviceMetricEventData.NetworkMetrics.TransferStats.ADAPTER.encodeWithTag(writer, 2, (int) value.getDownload());
                        }
                        if (Double.valueOf(value.getTime_seconds()).equals(Double.valueOf(0.0d))) {
                            return;
                        }
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getTime_seconds()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public DeviceMetricEventData.NetworkMetrics.ConnectionMetrics decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        DeviceMetricEventData.NetworkMetrics.Metered meteredDecode = DeviceMetricEventData.NetworkMetrics.Metered.METERED_UNSPECIFIED;
                        DeviceMetricEventData.NetworkMetrics.Roaming roaming = DeviceMetricEventData.NetworkMetrics.Roaming.ROAMING_UNSPECIFIED;
                        long jBeginMessage = reader.beginMessage();
                        DeviceMetricEventData.NetworkMetrics.TransferStats transferStatsDecode = null;
                        double dDoubleValue = 0.0d;
                        DeviceMetricEventData.NetworkMetrics.TransferStats transferStatsDecode2 = null;
                        DeviceMetricEventData.NetworkMetrics.Roaming roamingDecode = roaming;
                        while (true) {
                            DeviceMetricEventData.NetworkMetrics.Metered metered = meteredDecode;
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new DeviceMetricEventData.NetworkMetrics.ConnectionMetrics(dDoubleValue, transferStatsDecode2, transferStatsDecode, metered, roamingDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                } else if (iNextTag == 2) {
                                    transferStatsDecode2 = DeviceMetricEventData.NetworkMetrics.TransferStats.ADAPTER.decode(reader);
                                } else if (iNextTag == 3) {
                                    transferStatsDecode = DeviceMetricEventData.NetworkMetrics.TransferStats.ADAPTER.decode(reader);
                                } else if (iNextTag == 4) {
                                    try {
                                        meteredDecode = DeviceMetricEventData.NetworkMetrics.Metered.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                } else if (iNextTag == 5) {
                                    try {
                                        roamingDecode = DeviceMetricEventData.NetworkMetrics.Roaming.ADAPTER.decode(reader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    }
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public DeviceMetricEventData.NetworkMetrics.ConnectionMetrics redact(DeviceMetricEventData.NetworkMetrics.ConnectionMetrics value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        DeviceMetricEventData.NetworkMetrics.TransferStats download = value.getDownload();
                        DeviceMetricEventData.NetworkMetrics.TransferStats transferStatsRedact = download != null ? DeviceMetricEventData.NetworkMetrics.TransferStats.ADAPTER.redact(download) : null;
                        DeviceMetricEventData.NetworkMetrics.TransferStats upload = value.getUpload();
                        return DeviceMetricEventData.NetworkMetrics.ConnectionMetrics.copy$default(value, 0.0d, transferStatsRedact, upload != null ? DeviceMetricEventData.NetworkMetrics.TransferStats.ADAPTER.redact(upload) : null, null, null, ByteString.EMPTY, 25, null);
                    }
                };
            }
        }

        /* compiled from: DeviceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$TransferStats;", "Lcom/squareup/wire/Message;", "", "kilobytes", "", "packets", "", "unknownFields", "Lokio/ByteString;", "<init>", "(DILokio/ByteString;)V", "getKilobytes", "()D", "getPackets", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class TransferStats extends Message {

            @JvmField
            public static final ProtoAdapter<TransferStats> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final double kilobytes;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final int packets;

            public TransferStats() {
                this(0.0d, 0, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m24211newBuilder();
            }

            public final double getKilobytes() {
                return this.kilobytes;
            }

            public final int getPackets() {
                return this.packets;
            }

            public /* synthetic */ TransferStats(double d, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 0.0d : d, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TransferStats(double d, int i, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.kilobytes = d;
                this.packets = i;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m24211newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TransferStats)) {
                    return false;
                }
                TransferStats transferStats = (TransferStats) other;
                return Intrinsics.areEqual(unknownFields(), transferStats.unknownFields()) && this.kilobytes == transferStats.kilobytes && this.packets == transferStats.packets;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((unknownFields().hashCode() * 37) + Double.hashCode(this.kilobytes)) * 37) + Integer.hashCode(this.packets);
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("kilobytes=" + this.kilobytes);
                arrayList.add("packets=" + this.packets);
                return CollectionsKt.joinToString$default(arrayList, ", ", "TransferStats{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ TransferStats copy$default(TransferStats transferStats, double d, int i, ByteString byteString, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    d = transferStats.kilobytes;
                }
                if ((i2 & 2) != 0) {
                    i = transferStats.packets;
                }
                if ((i2 & 4) != 0) {
                    byteString = transferStats.unknownFields();
                }
                return transferStats.copy(d, i, byteString);
            }

            public final TransferStats copy(double kilobytes, int packets, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new TransferStats(kilobytes, packets, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferStats.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TransferStats>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$TransferStats$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public DeviceMetricEventData.NetworkMetrics.TransferStats decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        double dDoubleValue = 0.0d;
                        int iIntValue = 0;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new DeviceMetricEventData.NetworkMetrics.TransferStats(dDoubleValue, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                            } else if (iNextTag == 2) {
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(DeviceMetricEventData.NetworkMetrics.TransferStats value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Double.valueOf(value.getKilobytes()).equals(Double.valueOf(0.0d))) {
                            size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getKilobytes()));
                        }
                        return value.getPackets() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getPackets())) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, DeviceMetricEventData.NetworkMetrics.TransferStats value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Double.valueOf(value.getKilobytes()).equals(Double.valueOf(0.0d))) {
                            ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getKilobytes()));
                        }
                        if (value.getPackets() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getPackets()));
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, DeviceMetricEventData.NetworkMetrics.TransferStats value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getPackets() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getPackets()));
                        }
                        if (Double.valueOf(value.getKilobytes()).equals(Double.valueOf(0.0d))) {
                            return;
                        }
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getKilobytes()));
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public DeviceMetricEventData.NetworkMetrics.TransferStats redact(DeviceMetricEventData.NetworkMetrics.TransferStats value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return DeviceMetricEventData.NetworkMetrics.TransferStats.copy$default(value, 0.0d, 0, ByteString.EMPTY, 3, null);
                    }
                };
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DeviceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Metered;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "METERED_UNSPECIFIED", "METERED_ALL", "METERED_YES", "METERED_NO", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Metered implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Metered[] $VALUES;

            @JvmField
            public static final ProtoAdapter<Metered> ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Metered METERED_ALL;
            public static final Metered METERED_NO;
            public static final Metered METERED_UNSPECIFIED;
            public static final Metered METERED_YES;
            private final int value;

            private static final /* synthetic */ Metered[] $values() {
                return new Metered[]{METERED_UNSPECIFIED, METERED_ALL, METERED_YES, METERED_NO};
            }

            @JvmStatic
            public static final Metered fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<Metered> getEntries() {
                return $ENTRIES;
            }

            private Metered(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final Metered metered = new Metered("METERED_UNSPECIFIED", 0, 0);
                METERED_UNSPECIFIED = metered;
                METERED_ALL = new Metered("METERED_ALL", 1, 1);
                METERED_YES = new Metered("METERED_YES", 2, 2);
                METERED_NO = new Metered("METERED_NO", 3, 3);
                Metered[] meteredArr$values = $values();
                $VALUES = meteredArr$values;
                $ENTRIES = EnumEntries2.enumEntries(meteredArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Metered.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<Metered>(orCreateKotlinClass, syntax, metered) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$Metered$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public DeviceMetricEventData.NetworkMetrics.Metered fromValue(int value) {
                        return DeviceMetricEventData.NetworkMetrics.Metered.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: DeviceMetricEventData.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Metered$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Metered;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final Metered fromValue(int value) {
                    if (value == 0) {
                        return Metered.METERED_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Metered.METERED_ALL;
                    }
                    if (value == 2) {
                        return Metered.METERED_YES;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return Metered.METERED_NO;
                }
            }

            public static Metered valueOf(String str) {
                return (Metered) Enum.valueOf(Metered.class, str);
            }

            public static Metered[] values() {
                return (Metered[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DeviceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Roaming;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ROAMING_UNSPECIFIED", "ROAMING_ALL", "ROAMING_YES", "ROAMING_NO", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Roaming implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Roaming[] $VALUES;

            @JvmField
            public static final ProtoAdapter<Roaming> ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Roaming ROAMING_ALL;
            public static final Roaming ROAMING_NO;
            public static final Roaming ROAMING_UNSPECIFIED;
            public static final Roaming ROAMING_YES;
            private final int value;

            private static final /* synthetic */ Roaming[] $values() {
                return new Roaming[]{ROAMING_UNSPECIFIED, ROAMING_ALL, ROAMING_YES, ROAMING_NO};
            }

            @JvmStatic
            public static final Roaming fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<Roaming> getEntries() {
                return $ENTRIES;
            }

            private Roaming(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final Roaming roaming = new Roaming("ROAMING_UNSPECIFIED", 0, 0);
                ROAMING_UNSPECIFIED = roaming;
                ROAMING_ALL = new Roaming("ROAMING_ALL", 1, 1);
                ROAMING_YES = new Roaming("ROAMING_YES", 2, 2);
                ROAMING_NO = new Roaming("ROAMING_NO", 3, 3);
                Roaming[] roamingArr$values = $values();
                $VALUES = roamingArr$values;
                $ENTRIES = EnumEntries2.enumEntries(roamingArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Roaming.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<Roaming>(orCreateKotlinClass, syntax, roaming) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$NetworkMetrics$Roaming$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public DeviceMetricEventData.NetworkMetrics.Roaming fromValue(int value) {
                        return DeviceMetricEventData.NetworkMetrics.Roaming.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: DeviceMetricEventData.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Roaming$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$NetworkMetrics$Roaming;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final Roaming fromValue(int value) {
                    if (value == 0) {
                        return Roaming.ROAMING_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Roaming.ROAMING_ALL;
                    }
                    if (value == 2) {
                        return Roaming.ROAMING_YES;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return Roaming.ROAMING_NO;
                }
            }

            public static Roaming valueOf(String str) {
                return (Roaming) Enum.valueOf(Roaming.class, str);
            }

            public static Roaming[] values() {
                return (Roaming[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: DeviceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ResponsivenessMetrics;", "Lcom/squareup/wire/Message;", "", "janky_frame_percentage", "", "total_hang_time_seconds", "", "total_hang_time_percentage", "scroll_hitch_time_ratio_ms_per_second", "unknownFields", "Lokio/ByteString;", "<init>", "(FDFDLokio/ByteString;)V", "getJanky_frame_percentage", "()F", "getTotal_hang_time_seconds", "()D", "getTotal_hang_time_percentage", "getScroll_hitch_time_ratio_ms_per_second", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ResponsivenessMetrics extends Message {

        @JvmField
        public static final ProtoAdapter<ResponsivenessMetrics> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "jankyFramePercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final float janky_frame_percentage;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "scrollHitchTimeRatioMsPerSecond", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final double scroll_hitch_time_ratio_ms_per_second;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "totalHangTimePercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final float total_hang_time_percentage;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "totalHangTimeSeconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final double total_hang_time_seconds;

        public ResponsivenessMetrics() {
            this(0.0f, 0.0d, 0.0f, 0.0d, null, 31, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24212newBuilder();
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

        public /* synthetic */ ResponsivenessMetrics(float f, double d, float f2, double d2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0d : d2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponsivenessMetrics(float f, double d, float f2, double d2, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.janky_frame_percentage = f;
            this.total_hang_time_seconds = d;
            this.total_hang_time_percentage = f2;
            this.scroll_hitch_time_ratio_ms_per_second = d2;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24212newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ResponsivenessMetrics)) {
                return false;
            }
            ResponsivenessMetrics responsivenessMetrics = (ResponsivenessMetrics) other;
            return Intrinsics.areEqual(unknownFields(), responsivenessMetrics.unknownFields()) && this.janky_frame_percentage == responsivenessMetrics.janky_frame_percentage && this.total_hang_time_seconds == responsivenessMetrics.total_hang_time_seconds && this.total_hang_time_percentage == responsivenessMetrics.total_hang_time_percentage && this.scroll_hitch_time_ratio_ms_per_second == responsivenessMetrics.scroll_hitch_time_ratio_ms_per_second;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((unknownFields().hashCode() * 37) + Float.hashCode(this.janky_frame_percentage)) * 37) + Double.hashCode(this.total_hang_time_seconds)) * 37) + Float.hashCode(this.total_hang_time_percentage)) * 37) + Double.hashCode(this.scroll_hitch_time_ratio_ms_per_second);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("janky_frame_percentage=" + this.janky_frame_percentage);
            arrayList.add("total_hang_time_seconds=" + this.total_hang_time_seconds);
            arrayList.add("total_hang_time_percentage=" + this.total_hang_time_percentage);
            arrayList.add("scroll_hitch_time_ratio_ms_per_second=" + this.scroll_hitch_time_ratio_ms_per_second);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ResponsivenessMetrics{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ResponsivenessMetrics copy$default(ResponsivenessMetrics responsivenessMetrics, float f, double d, float f2, double d2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                f = responsivenessMetrics.janky_frame_percentage;
            }
            if ((i & 2) != 0) {
                d = responsivenessMetrics.total_hang_time_seconds;
            }
            if ((i & 4) != 0) {
                f2 = responsivenessMetrics.total_hang_time_percentage;
            }
            if ((i & 8) != 0) {
                d2 = responsivenessMetrics.scroll_hitch_time_ratio_ms_per_second;
            }
            if ((i & 16) != 0) {
                byteString = responsivenessMetrics.unknownFields();
            }
            float f3 = f2;
            return responsivenessMetrics.copy(f, d, f3, d2, byteString);
        }

        public final ResponsivenessMetrics copy(float janky_frame_percentage, double total_hang_time_seconds, float total_hang_time_percentage, double scroll_hitch_time_ratio_ms_per_second, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ResponsivenessMetrics(janky_frame_percentage, total_hang_time_seconds, total_hang_time_percentage, scroll_hitch_time_ratio_ms_per_second, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ResponsivenessMetrics.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ResponsivenessMetrics>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$ResponsivenessMetrics$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.ResponsivenessMetrics decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    float fFloatValue = 0.0f;
                    float fFloatValue2 = 0.0f;
                    double dDoubleValue = 0.0d;
                    double dDoubleValue2 = 0.0d;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DeviceMetricEventData.ResponsivenessMetrics(fFloatValue, dDoubleValue, fFloatValue2, dDoubleValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        } else if (iNextTag == 2) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else if (iNextTag == 3) {
                            fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        } else if (iNextTag == 4) {
                            dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(DeviceMetricEventData.ResponsivenessMetrics value) {
                    Double dValueOf = Double.valueOf(0.0d);
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    Float fValueOf = Float.valueOf(value.getJanky_frame_percentage());
                    Float fValueOf2 = Float.valueOf(0.0f);
                    if (!fValueOf.equals(fValueOf2)) {
                        size += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.getJanky_frame_percentage()));
                    }
                    if (!Double.valueOf(value.getTotal_hang_time_seconds()).equals(dValueOf)) {
                        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getTotal_hang_time_seconds()));
                    }
                    if (!Float.valueOf(value.getTotal_hang_time_percentage()).equals(fValueOf2)) {
                        size += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getTotal_hang_time_percentage()));
                    }
                    return !Double.valueOf(value.getScroll_hitch_time_ratio_ms_per_second()).equals(dValueOf) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getScroll_hitch_time_ratio_ms_per_second())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, DeviceMetricEventData.ResponsivenessMetrics value) throws IOException {
                    Double dValueOf = Double.valueOf(0.0d);
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Float fValueOf = Float.valueOf(value.getJanky_frame_percentage());
                    Float fValueOf2 = Float.valueOf(0.0f);
                    if (!fValueOf.equals(fValueOf2)) {
                        ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getJanky_frame_percentage()));
                    }
                    if (!Double.valueOf(value.getTotal_hang_time_seconds()).equals(dValueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getTotal_hang_time_seconds()));
                    }
                    if (!Float.valueOf(value.getTotal_hang_time_percentage()).equals(fValueOf2)) {
                        ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getTotal_hang_time_percentage()));
                    }
                    if (!Double.valueOf(value.getScroll_hitch_time_ratio_ms_per_second()).equals(dValueOf)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getScroll_hitch_time_ratio_ms_per_second()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, DeviceMetricEventData.ResponsivenessMetrics value) throws IOException {
                    Float fValueOf = Float.valueOf(0.0f);
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    Double dValueOf = Double.valueOf(value.getScroll_hitch_time_ratio_ms_per_second());
                    Double dValueOf2 = Double.valueOf(0.0d);
                    if (!dValueOf.equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getScroll_hitch_time_ratio_ms_per_second()));
                    }
                    if (!Float.valueOf(value.getTotal_hang_time_percentage()).equals(fValueOf)) {
                        ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getTotal_hang_time_percentage()));
                    }
                    if (!Double.valueOf(value.getTotal_hang_time_seconds()).equals(dValueOf2)) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getTotal_hang_time_seconds()));
                    }
                    if (Float.valueOf(value.getJanky_frame_percentage()).equals(fValueOf)) {
                        return;
                    }
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 1, (int) Float.valueOf(value.getJanky_frame_percentage()));
                }

                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.ResponsivenessMetrics redact(DeviceMetricEventData.ResponsivenessMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return DeviceMetricEventData.ResponsivenessMetrics.copy$default(value, 0.0f, 0.0d, 0.0f, 0.0d, ByteString.EMPTY, 15, null);
                }
            };
        }
    }

    /* compiled from: DeviceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$LaunchMetrics;", "Lcom/squareup/wire/Message;", "", "launch_count", "", "resume_count", "time_to_first_draw_ms", "", "unknownFields", "Lokio/ByteString;", "<init>", "(IIDLokio/ByteString;)V", "getLaunch_count", "()I", "getResume_count", "getTime_to_first_draw_ms", "()D", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LaunchMetrics extends Message {

        @JvmField
        public static final ProtoAdapter<LaunchMetrics> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "launchCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final int launch_count;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "resumeCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final int resume_count;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "timeToFirstDrawMs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final double time_to_first_draw_ms;

        public LaunchMetrics() {
            this(0, 0, 0.0d, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24207newBuilder();
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

        public /* synthetic */ LaunchMetrics(int i, int i2, double d, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0.0d : d, (i3 & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchMetrics(int i, int i2, double d, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.launch_count = i;
            this.resume_count = i2;
            this.time_to_first_draw_ms = d;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24207newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof LaunchMetrics)) {
                return false;
            }
            LaunchMetrics launchMetrics = (LaunchMetrics) other;
            return Intrinsics.areEqual(unknownFields(), launchMetrics.unknownFields()) && this.launch_count == launchMetrics.launch_count && this.resume_count == launchMetrics.resume_count && this.time_to_first_draw_ms == launchMetrics.time_to_first_draw_ms;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + Integer.hashCode(this.launch_count)) * 37) + Integer.hashCode(this.resume_count)) * 37) + Double.hashCode(this.time_to_first_draw_ms);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("launch_count=" + this.launch_count);
            arrayList.add("resume_count=" + this.resume_count);
            arrayList.add("time_to_first_draw_ms=" + this.time_to_first_draw_ms);
            return CollectionsKt.joinToString$default(arrayList, ", ", "LaunchMetrics{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ LaunchMetrics copy$default(LaunchMetrics launchMetrics, int i, int i2, double d, ByteString byteString, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = launchMetrics.launch_count;
            }
            if ((i3 & 2) != 0) {
                i2 = launchMetrics.resume_count;
            }
            if ((i3 & 4) != 0) {
                d = launchMetrics.time_to_first_draw_ms;
            }
            if ((i3 & 8) != 0) {
                byteString = launchMetrics.unknownFields();
            }
            ByteString byteString2 = byteString;
            return launchMetrics.copy(i, i2, d, byteString2);
        }

        public final LaunchMetrics copy(int launch_count, int resume_count, double time_to_first_draw_ms, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new LaunchMetrics(launch_count, resume_count, time_to_first_draw_ms, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LaunchMetrics.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<LaunchMetrics>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$LaunchMetrics$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.LaunchMetrics decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    int iIntValue = 0;
                    int iIntValue2 = 0;
                    double dDoubleValue = 0.0d;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DeviceMetricEventData.LaunchMetrics(iIntValue, iIntValue2, dDoubleValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else if (iNextTag == 2) {
                            iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                        } else if (iNextTag == 3) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(DeviceMetricEventData.LaunchMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getLaunch_count() != 0) {
                        size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getLaunch_count()));
                    }
                    if (value.getResume_count() != 0) {
                        size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getResume_count()));
                    }
                    return !Double.valueOf(value.getTime_to_first_draw_ms()).equals(Double.valueOf(0.0d)) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getTime_to_first_draw_ms())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, DeviceMetricEventData.LaunchMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getLaunch_count() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getLaunch_count()));
                    }
                    if (value.getResume_count() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getResume_count()));
                    }
                    if (!Double.valueOf(value.getTime_to_first_draw_ms()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getTime_to_first_draw_ms()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, DeviceMetricEventData.LaunchMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Double.valueOf(value.getTime_to_first_draw_ms()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getTime_to_first_draw_ms()));
                    }
                    if (value.getResume_count() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getResume_count()));
                    }
                    if (value.getLaunch_count() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getLaunch_count()));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.LaunchMetrics redact(DeviceMetricEventData.LaunchMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return DeviceMetricEventData.LaunchMetrics.copy$default(value, 0, 0, 0.0d, ByteString.EMPTY, 7, null);
                }
            };
        }
    }

    /* compiled from: DeviceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics;", "Lcom/squareup/wire/Message;", "", "background_exit_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics$BackgroundExitMetrics;", "foreground_exit_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics$ForegroundExitMetrics;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics$BackgroundExitMetrics;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics$ForegroundExitMetrics;Lokio/ByteString;)V", "getBackground_exit_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics$BackgroundExitMetrics;", "getForeground_exit_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics$ForegroundExitMetrics;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "BackgroundExitMetrics", "ForegroundExitMetrics", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ExitMetrics extends Message {

        @JvmField
        public static final ProtoAdapter<ExitMetrics> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$ExitMetrics$BackgroundExitMetrics#ADAPTER", jsonName = "backgroundExitMetrics", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final BackgroundExitMetrics background_exit_metrics;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$ExitMetrics$ForegroundExitMetrics#ADAPTER", jsonName = "foregroundExitMetrics", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final ForegroundExitMetrics foreground_exit_metrics;

        public ExitMetrics() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24203newBuilder();
        }

        public final BackgroundExitMetrics getBackground_exit_metrics() {
            return this.background_exit_metrics;
        }

        public final ForegroundExitMetrics getForeground_exit_metrics() {
            return this.foreground_exit_metrics;
        }

        public /* synthetic */ ExitMetrics(BackgroundExitMetrics backgroundExitMetrics, ForegroundExitMetrics foregroundExitMetrics, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : backgroundExitMetrics, (i & 2) != 0 ? null : foregroundExitMetrics, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExitMetrics(BackgroundExitMetrics backgroundExitMetrics, ForegroundExitMetrics foregroundExitMetrics, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.background_exit_metrics = backgroundExitMetrics;
            this.foreground_exit_metrics = foregroundExitMetrics;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24203newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ExitMetrics)) {
                return false;
            }
            ExitMetrics exitMetrics = (ExitMetrics) other;
            return Intrinsics.areEqual(unknownFields(), exitMetrics.unknownFields()) && Intrinsics.areEqual(this.background_exit_metrics, exitMetrics.background_exit_metrics) && Intrinsics.areEqual(this.foreground_exit_metrics, exitMetrics.foreground_exit_metrics);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            BackgroundExitMetrics backgroundExitMetrics = this.background_exit_metrics;
            int iHashCode2 = (iHashCode + (backgroundExitMetrics != null ? backgroundExitMetrics.hashCode() : 0)) * 37;
            ForegroundExitMetrics foregroundExitMetrics = this.foreground_exit_metrics;
            int iHashCode3 = iHashCode2 + (foregroundExitMetrics != null ? foregroundExitMetrics.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            BackgroundExitMetrics backgroundExitMetrics = this.background_exit_metrics;
            if (backgroundExitMetrics != null) {
                arrayList.add("background_exit_metrics=" + backgroundExitMetrics);
            }
            ForegroundExitMetrics foregroundExitMetrics = this.foreground_exit_metrics;
            if (foregroundExitMetrics != null) {
                arrayList.add("foreground_exit_metrics=" + foregroundExitMetrics);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ExitMetrics{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ExitMetrics copy$default(ExitMetrics exitMetrics, BackgroundExitMetrics backgroundExitMetrics, ForegroundExitMetrics foregroundExitMetrics, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                backgroundExitMetrics = exitMetrics.background_exit_metrics;
            }
            if ((i & 2) != 0) {
                foregroundExitMetrics = exitMetrics.foreground_exit_metrics;
            }
            if ((i & 4) != 0) {
                byteString = exitMetrics.unknownFields();
            }
            return exitMetrics.copy(backgroundExitMetrics, foregroundExitMetrics, byteString);
        }

        public final ExitMetrics copy(BackgroundExitMetrics background_exit_metrics, ForegroundExitMetrics foreground_exit_metrics, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ExitMetrics(background_exit_metrics, foreground_exit_metrics, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ExitMetrics.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ExitMetrics>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$ExitMetrics$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.ExitMetrics decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics backgroundExitMetricsDecode = null;
                    DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics foregroundExitMetricsDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DeviceMetricEventData.ExitMetrics(backgroundExitMetricsDecode, foregroundExitMetricsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            backgroundExitMetricsDecode = DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            foregroundExitMetricsDecode = DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(DeviceMetricEventData.ExitMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getBackground_exit_metrics() != null) {
                        size += DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics.ADAPTER.encodedSizeWithTag(1, value.getBackground_exit_metrics());
                    }
                    return value.getForeground_exit_metrics() != null ? size + DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics.ADAPTER.encodedSizeWithTag(2, value.getForeground_exit_metrics()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, DeviceMetricEventData.ExitMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getBackground_exit_metrics() != null) {
                        DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics.ADAPTER.encodeWithTag(writer, 1, (int) value.getBackground_exit_metrics());
                    }
                    if (value.getForeground_exit_metrics() != null) {
                        DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics.ADAPTER.encodeWithTag(writer, 2, (int) value.getForeground_exit_metrics());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, DeviceMetricEventData.ExitMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getForeground_exit_metrics() != null) {
                        DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics.ADAPTER.encodeWithTag(writer, 2, (int) value.getForeground_exit_metrics());
                    }
                    if (value.getBackground_exit_metrics() != null) {
                        DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics.ADAPTER.encodeWithTag(writer, 1, (int) value.getBackground_exit_metrics());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.ExitMetrics redact(DeviceMetricEventData.ExitMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics background_exit_metrics = value.getBackground_exit_metrics();
                    DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics backgroundExitMetricsRedact = background_exit_metrics != null ? DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics.ADAPTER.redact(background_exit_metrics) : null;
                    DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics foreground_exit_metrics = value.getForeground_exit_metrics();
                    return value.copy(backgroundExitMetricsRedact, foreground_exit_metrics != null ? DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics.ADAPTER.redact(foreground_exit_metrics) : null, ByteString.EMPTY);
                }
            };
        }

        /* compiled from: DeviceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics$BackgroundExitMetrics;", "Lcom/squareup/wire/Message;", "", "cumulative_bad_access_exit_count", "", "cumulative_cpu_resource_limit_exit_count", "cumulative_illegal_instruction_exit_count", "unknownFields", "Lokio/ByteString;", "<init>", "(IIILokio/ByteString;)V", "getCumulative_bad_access_exit_count", "()I", "getCumulative_cpu_resource_limit_exit_count", "getCumulative_illegal_instruction_exit_count", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class BackgroundExitMetrics extends Message {

            @JvmField
            public static final ProtoAdapter<BackgroundExitMetrics> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "cumulativeBadAccessExitCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final int cumulative_bad_access_exit_count;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "cumulativeCpuResourceLimitExitCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final int cumulative_cpu_resource_limit_exit_count;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "cumulativeIllegalInstructionExitCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final int cumulative_illegal_instruction_exit_count;

            public BackgroundExitMetrics() {
                this(0, 0, 0, null, 15, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m24204newBuilder();
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

            public /* synthetic */ BackgroundExitMetrics(int i, int i2, int i3, ByteString byteString, int i4, DefaultConstructorMarker defaultConstructorMarker) {
                this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BackgroundExitMetrics(int i, int i2, int i3, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.cumulative_bad_access_exit_count = i;
                this.cumulative_cpu_resource_limit_exit_count = i2;
                this.cumulative_illegal_instruction_exit_count = i3;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m24204newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof BackgroundExitMetrics)) {
                    return false;
                }
                BackgroundExitMetrics backgroundExitMetrics = (BackgroundExitMetrics) other;
                return Intrinsics.areEqual(unknownFields(), backgroundExitMetrics.unknownFields()) && this.cumulative_bad_access_exit_count == backgroundExitMetrics.cumulative_bad_access_exit_count && this.cumulative_cpu_resource_limit_exit_count == backgroundExitMetrics.cumulative_cpu_resource_limit_exit_count && this.cumulative_illegal_instruction_exit_count == backgroundExitMetrics.cumulative_illegal_instruction_exit_count;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((((unknownFields().hashCode() * 37) + Integer.hashCode(this.cumulative_bad_access_exit_count)) * 37) + Integer.hashCode(this.cumulative_cpu_resource_limit_exit_count)) * 37) + Integer.hashCode(this.cumulative_illegal_instruction_exit_count);
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("cumulative_bad_access_exit_count=" + this.cumulative_bad_access_exit_count);
                arrayList.add("cumulative_cpu_resource_limit_exit_count=" + this.cumulative_cpu_resource_limit_exit_count);
                arrayList.add("cumulative_illegal_instruction_exit_count=" + this.cumulative_illegal_instruction_exit_count);
                return CollectionsKt.joinToString$default(arrayList, ", ", "BackgroundExitMetrics{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ BackgroundExitMetrics copy$default(BackgroundExitMetrics backgroundExitMetrics, int i, int i2, int i3, ByteString byteString, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    i = backgroundExitMetrics.cumulative_bad_access_exit_count;
                }
                if ((i4 & 2) != 0) {
                    i2 = backgroundExitMetrics.cumulative_cpu_resource_limit_exit_count;
                }
                if ((i4 & 4) != 0) {
                    i3 = backgroundExitMetrics.cumulative_illegal_instruction_exit_count;
                }
                if ((i4 & 8) != 0) {
                    byteString = backgroundExitMetrics.unknownFields();
                }
                return backgroundExitMetrics.copy(i, i2, i3, byteString);
            }

            public final BackgroundExitMetrics copy(int cumulative_bad_access_exit_count, int cumulative_cpu_resource_limit_exit_count, int cumulative_illegal_instruction_exit_count, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new BackgroundExitMetrics(cumulative_bad_access_exit_count, cumulative_cpu_resource_limit_exit_count, cumulative_illegal_instruction_exit_count, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BackgroundExitMetrics.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<BackgroundExitMetrics>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$ExitMetrics$BackgroundExitMetrics$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        int iIntValue = 0;
                        int iIntValue2 = 0;
                        int iIntValue3 = 0;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics(iIntValue, iIntValue2, iIntValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            } else if (iNextTag == 2) {
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                            } else if (iNextTag == 3) {
                                iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (value.getCumulative_bad_access_exit_count() != 0) {
                            size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getCumulative_bad_access_exit_count()));
                        }
                        if (value.getCumulative_cpu_resource_limit_exit_count() != 0) {
                            size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getCumulative_cpu_resource_limit_exit_count()));
                        }
                        return value.getCumulative_illegal_instruction_exit_count() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getCumulative_illegal_instruction_exit_count())) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value.getCumulative_bad_access_exit_count() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getCumulative_bad_access_exit_count()));
                        }
                        if (value.getCumulative_cpu_resource_limit_exit_count() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getCumulative_cpu_resource_limit_exit_count()));
                        }
                        if (value.getCumulative_illegal_instruction_exit_count() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getCumulative_illegal_instruction_exit_count()));
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getCumulative_illegal_instruction_exit_count() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getCumulative_illegal_instruction_exit_count()));
                        }
                        if (value.getCumulative_cpu_resource_limit_exit_count() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getCumulative_cpu_resource_limit_exit_count()));
                        }
                        if (value.getCumulative_bad_access_exit_count() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getCumulative_bad_access_exit_count()));
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics redact(DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return DeviceMetricEventData.ExitMetrics.BackgroundExitMetrics.copy$default(value, 0, 0, 0, ByteString.EMPTY, 7, null);
                    }
                };
            }
        }

        /* compiled from: DeviceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$ExitMetrics$ForegroundExitMetrics;", "Lcom/squareup/wire/Message;", "", "cumulative_bad_access_exit_count", "", "cumulative_illegal_instruction_exit_count", "unknownFields", "Lokio/ByteString;", "<init>", "(IILokio/ByteString;)V", "getCumulative_bad_access_exit_count", "()I", "getCumulative_illegal_instruction_exit_count", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ForegroundExitMetrics extends Message {

            @JvmField
            public static final ProtoAdapter<ForegroundExitMetrics> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "cumulativeBadAccessExitCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final int cumulative_bad_access_exit_count;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "cumulativeIllegalInstructionExitCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final int cumulative_illegal_instruction_exit_count;

            public ForegroundExitMetrics() {
                this(0, 0, null, 7, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m24205newBuilder();
            }

            public final int getCumulative_bad_access_exit_count() {
                return this.cumulative_bad_access_exit_count;
            }

            public final int getCumulative_illegal_instruction_exit_count() {
                return this.cumulative_illegal_instruction_exit_count;
            }

            public /* synthetic */ ForegroundExitMetrics(int i, int i2, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForegroundExitMetrics(int i, int i2, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.cumulative_bad_access_exit_count = i;
                this.cumulative_illegal_instruction_exit_count = i2;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m24205newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ForegroundExitMetrics)) {
                    return false;
                }
                ForegroundExitMetrics foregroundExitMetrics = (ForegroundExitMetrics) other;
                return Intrinsics.areEqual(unknownFields(), foregroundExitMetrics.unknownFields()) && this.cumulative_bad_access_exit_count == foregroundExitMetrics.cumulative_bad_access_exit_count && this.cumulative_illegal_instruction_exit_count == foregroundExitMetrics.cumulative_illegal_instruction_exit_count;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.cumulative_bad_access_exit_count)) * 37) + Integer.hashCode(this.cumulative_illegal_instruction_exit_count);
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("cumulative_bad_access_exit_count=" + this.cumulative_bad_access_exit_count);
                arrayList.add("cumulative_illegal_instruction_exit_count=" + this.cumulative_illegal_instruction_exit_count);
                return CollectionsKt.joinToString$default(arrayList, ", ", "ForegroundExitMetrics{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ ForegroundExitMetrics copy$default(ForegroundExitMetrics foregroundExitMetrics, int i, int i2, ByteString byteString, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = foregroundExitMetrics.cumulative_bad_access_exit_count;
                }
                if ((i3 & 2) != 0) {
                    i2 = foregroundExitMetrics.cumulative_illegal_instruction_exit_count;
                }
                if ((i3 & 4) != 0) {
                    byteString = foregroundExitMetrics.unknownFields();
                }
                return foregroundExitMetrics.copy(i, i2, byteString);
            }

            public final ForegroundExitMetrics copy(int cumulative_bad_access_exit_count, int cumulative_illegal_instruction_exit_count, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new ForegroundExitMetrics(cumulative_bad_access_exit_count, cumulative_illegal_instruction_exit_count, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ForegroundExitMetrics.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<ForegroundExitMetrics>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$ExitMetrics$ForegroundExitMetrics$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        int iIntValue = 0;
                        int iIntValue2 = 0;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics(iIntValue, iIntValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            } else if (iNextTag == 2) {
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (value.getCumulative_bad_access_exit_count() != 0) {
                            size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getCumulative_bad_access_exit_count()));
                        }
                        return value.getCumulative_illegal_instruction_exit_count() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getCumulative_illegal_instruction_exit_count())) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value.getCumulative_bad_access_exit_count() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getCumulative_bad_access_exit_count()));
                        }
                        if (value.getCumulative_illegal_instruction_exit_count() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getCumulative_illegal_instruction_exit_count()));
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (value.getCumulative_illegal_instruction_exit_count() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getCumulative_illegal_instruction_exit_count()));
                        }
                        if (value.getCumulative_bad_access_exit_count() != 0) {
                            ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getCumulative_bad_access_exit_count()));
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics redact(DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return DeviceMetricEventData.ExitMetrics.ForegroundExitMetrics.copy$default(value, 0, 0, ByteString.EMPTY, 3, null);
                    }
                };
            }
        }
    }

    /* compiled from: DeviceMetricEventData.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DisplayMetrics;", "Lcom/squareup/wire/Message;", "", "pixel_luminance_metrics", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DisplayMetrics$PixelLuminanceMetrics;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DisplayMetrics$PixelLuminanceMetrics;Lokio/ByteString;)V", "getPixel_luminance_metrics", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DisplayMetrics$PixelLuminanceMetrics;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "PixelLuminanceMetrics", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DisplayMetrics extends Message {

        @JvmField
        public static final ProtoAdapter<DisplayMetrics> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData$DisplayMetrics$PixelLuminanceMetrics#ADAPTER", jsonName = "pixelLuminanceMetrics", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final PixelLuminanceMetrics pixel_luminance_metrics;

        /* JADX WARN: Multi-variable type inference failed */
        public DisplayMetrics() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24201newBuilder();
        }

        public final PixelLuminanceMetrics getPixel_luminance_metrics() {
            return this.pixel_luminance_metrics;
        }

        public /* synthetic */ DisplayMetrics(PixelLuminanceMetrics pixelLuminanceMetrics, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : pixelLuminanceMetrics, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayMetrics(PixelLuminanceMetrics pixelLuminanceMetrics, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.pixel_luminance_metrics = pixelLuminanceMetrics;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24201newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DisplayMetrics)) {
                return false;
            }
            DisplayMetrics displayMetrics = (DisplayMetrics) other;
            return Intrinsics.areEqual(unknownFields(), displayMetrics.unknownFields()) && Intrinsics.areEqual(this.pixel_luminance_metrics, displayMetrics.pixel_luminance_metrics);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            PixelLuminanceMetrics pixelLuminanceMetrics = this.pixel_luminance_metrics;
            int iHashCode2 = iHashCode + (pixelLuminanceMetrics != null ? pixelLuminanceMetrics.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            PixelLuminanceMetrics pixelLuminanceMetrics = this.pixel_luminance_metrics;
            if (pixelLuminanceMetrics != null) {
                arrayList.add("pixel_luminance_metrics=" + pixelLuminanceMetrics);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayMetrics{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ DisplayMetrics copy$default(DisplayMetrics displayMetrics, PixelLuminanceMetrics pixelLuminanceMetrics, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                pixelLuminanceMetrics = displayMetrics.pixel_luminance_metrics;
            }
            if ((i & 2) != 0) {
                byteString = displayMetrics.unknownFields();
            }
            return displayMetrics.copy(pixelLuminanceMetrics, byteString);
        }

        public final DisplayMetrics copy(PixelLuminanceMetrics pixel_luminance_metrics, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new DisplayMetrics(pixel_luminance_metrics, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DisplayMetrics.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<DisplayMetrics>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$DisplayMetrics$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.DisplayMetrics decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics pixelLuminanceMetricsDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DeviceMetricEventData.DisplayMetrics(pixelLuminanceMetricsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            pixelLuminanceMetricsDecode = DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(DeviceMetricEventData.DisplayMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getPixel_luminance_metrics() != null ? size + DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics.ADAPTER.encodedSizeWithTag(1, value.getPixel_luminance_metrics()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, DeviceMetricEventData.DisplayMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getPixel_luminance_metrics() != null) {
                        DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics.ADAPTER.encodeWithTag(writer, 1, (int) value.getPixel_luminance_metrics());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, DeviceMetricEventData.DisplayMetrics value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getPixel_luminance_metrics() != null) {
                        DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics.ADAPTER.encodeWithTag(writer, 1, (int) value.getPixel_luminance_metrics());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public DeviceMetricEventData.DisplayMetrics redact(DeviceMetricEventData.DisplayMetrics value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics pixel_luminance_metrics = value.getPixel_luminance_metrics();
                    return value.copy(pixel_luminance_metrics != null ? DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics.ADAPTER.redact(pixel_luminance_metrics) : null, ByteString.EMPTY);
                }
            };
        }

        /* compiled from: DeviceMetricEventData.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData$DisplayMetrics$PixelLuminanceMetrics;", "Lcom/squareup/wire/Message;", "", "average_pixel_luminance", "", "standard_deviation", "average_pixel_luminance_apl", "standard_deviation_apl", "unknownFields", "Lokio/ByteString;", "<init>", "(DDDDLokio/ByteString;)V", "getAverage_pixel_luminance", "()D", "getStandard_deviation", "getAverage_pixel_luminance_apl", "getStandard_deviation_apl", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class PixelLuminanceMetrics extends Message {

            @JvmField
            public static final ProtoAdapter<PixelLuminanceMetrics> ADAPTER;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "averagePixelLuminance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final double average_pixel_luminance;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "averagePixelLuminanceApl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final double average_pixel_luminance_apl;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "standardDeviation", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final double standard_deviation;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "standardDeviationApl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
            private final double standard_deviation_apl;

            public PixelLuminanceMetrics() {
                this(0.0d, 0.0d, 0.0d, 0.0d, null, 31, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m24202newBuilder();
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

            public /* synthetic */ PixelLuminanceMetrics(double d, double d2, double d3, double d4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PixelLuminanceMetrics(double d, double d2, double d3, double d4, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.average_pixel_luminance = d;
                this.standard_deviation = d2;
                this.average_pixel_luminance_apl = d3;
                this.standard_deviation_apl = d4;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m24202newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof PixelLuminanceMetrics)) {
                    return false;
                }
                PixelLuminanceMetrics pixelLuminanceMetrics = (PixelLuminanceMetrics) other;
                return Intrinsics.areEqual(unknownFields(), pixelLuminanceMetrics.unknownFields()) && this.average_pixel_luminance == pixelLuminanceMetrics.average_pixel_luminance && this.standard_deviation == pixelLuminanceMetrics.standard_deviation && this.average_pixel_luminance_apl == pixelLuminanceMetrics.average_pixel_luminance_apl && this.standard_deviation_apl == pixelLuminanceMetrics.standard_deviation_apl;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((((((unknownFields().hashCode() * 37) + Double.hashCode(this.average_pixel_luminance)) * 37) + Double.hashCode(this.standard_deviation)) * 37) + Double.hashCode(this.average_pixel_luminance_apl)) * 37) + Double.hashCode(this.standard_deviation_apl);
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("average_pixel_luminance=" + this.average_pixel_luminance);
                arrayList.add("standard_deviation=" + this.standard_deviation);
                arrayList.add("average_pixel_luminance_apl=" + this.average_pixel_luminance_apl);
                arrayList.add("standard_deviation_apl=" + this.standard_deviation_apl);
                return CollectionsKt.joinToString$default(arrayList, ", ", "PixelLuminanceMetrics{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ PixelLuminanceMetrics copy$default(PixelLuminanceMetrics pixelLuminanceMetrics, double d, double d2, double d3, double d4, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = pixelLuminanceMetrics.average_pixel_luminance;
                }
                double d5 = d;
                if ((i & 2) != 0) {
                    d2 = pixelLuminanceMetrics.standard_deviation;
                }
                return pixelLuminanceMetrics.copy(d5, d2, (i & 4) != 0 ? pixelLuminanceMetrics.average_pixel_luminance_apl : d3, (i & 8) != 0 ? pixelLuminanceMetrics.standard_deviation_apl : d4, (i & 16) != 0 ? pixelLuminanceMetrics.unknownFields() : byteString);
            }

            public final PixelLuminanceMetrics copy(double average_pixel_luminance, double standard_deviation, double average_pixel_luminance_apl, double standard_deviation_apl, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new PixelLuminanceMetrics(average_pixel_luminance, standard_deviation, average_pixel_luminance_apl, standard_deviation_apl, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PixelLuminanceMetrics.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<PixelLuminanceMetrics>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceMetricEventData$DisplayMetrics$PixelLuminanceMetrics$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        double dDoubleValue = 0.0d;
                        double dDoubleValue2 = 0.0d;
                        double dDoubleValue3 = 0.0d;
                        double dDoubleValue4 = 0.0d;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                            } else if (iNextTag == 2) {
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                            } else if (iNextTag == 3) {
                                dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                            } else if (iNextTag == 4) {
                                dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        Double dValueOf = Double.valueOf(value.getAverage_pixel_luminance());
                        Double dValueOf2 = Double.valueOf(0.0d);
                        if (!dValueOf.equals(dValueOf2)) {
                            size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getAverage_pixel_luminance()));
                        }
                        if (!Double.valueOf(value.getStandard_deviation()).equals(dValueOf2)) {
                            size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getStandard_deviation()));
                        }
                        if (!Double.valueOf(value.getAverage_pixel_luminance_apl()).equals(dValueOf2)) {
                            size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getAverage_pixel_luminance_apl()));
                        }
                        return !Double.valueOf(value.getStandard_deviation_apl()).equals(dValueOf2) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getStandard_deviation_apl())) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        Double dValueOf = Double.valueOf(value.getAverage_pixel_luminance());
                        Double dValueOf2 = Double.valueOf(0.0d);
                        if (!dValueOf.equals(dValueOf2)) {
                            ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getAverage_pixel_luminance()));
                        }
                        if (!Double.valueOf(value.getStandard_deviation()).equals(dValueOf2)) {
                            ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getStandard_deviation()));
                        }
                        if (!Double.valueOf(value.getAverage_pixel_luminance_apl()).equals(dValueOf2)) {
                            ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAverage_pixel_luminance_apl()));
                        }
                        if (!Double.valueOf(value.getStandard_deviation_apl()).equals(dValueOf2)) {
                            ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getStandard_deviation_apl()));
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        Double dValueOf = Double.valueOf(value.getStandard_deviation_apl());
                        Double dValueOf2 = Double.valueOf(0.0d);
                        if (!dValueOf.equals(dValueOf2)) {
                            ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getStandard_deviation_apl()));
                        }
                        if (!Double.valueOf(value.getAverage_pixel_luminance_apl()).equals(dValueOf2)) {
                            ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAverage_pixel_luminance_apl()));
                        }
                        if (!Double.valueOf(value.getStandard_deviation()).equals(dValueOf2)) {
                            ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getStandard_deviation()));
                        }
                        if (Double.valueOf(value.getAverage_pixel_luminance()).equals(dValueOf2)) {
                            return;
                        }
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getAverage_pixel_luminance()));
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics redact(DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return DeviceMetricEventData.DisplayMetrics.PixelLuminanceMetrics.copy$default(value, 0.0d, 0.0d, 0.0d, 0.0d, ByteString.EMPTY, 15, null);
                    }
                };
            }
        }
    }
}

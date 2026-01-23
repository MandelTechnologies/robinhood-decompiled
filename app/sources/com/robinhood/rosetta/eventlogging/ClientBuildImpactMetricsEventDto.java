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
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.ClientPlatformDto;
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
import p479j$.time.Instant;

/* compiled from: ClientBuildImpactMetricsEventDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b#\b\u0007\u0018\u0000 U2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004VUWXB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B÷\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\b\b\u0002\u0010\u001a\u001a\u00020\r\u0012\b\b\u0002\u0010\u001b\u001a\u00020\r\u0012\b\b\u0002\u0010\u001c\u001a\u00020\r\u0012\b\b\u0002\u0010\u001d\u001a\u00020\r\u0012\b\b\u0002\u0010\u001e\u001a\u00020\r\u0012\b\b\u0002\u0010\u001f\u001a\u00020\r\u0012\b\b\u0002\u0010 \u001a\u00020\r\u0012\b\b\u0002\u0010!\u001a\u00020\r\u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b\u0006\u0010$Jû\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,H\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\"H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\"H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\"H\u0016¢\u0006\u0004\b9\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bA\u0010@R\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0011\u0010\u0011\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bC\u0010@R\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bD\u0010@R\u0011\u0010\u0013\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bE\u0010@R\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bF\u0010@R\u0011\u0010\u0015\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bG\u0010@R\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bH\u0010@R\u0011\u0010\u0017\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bI\u0010@R\u0011\u0010\u0018\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bJ\u0010@R\u0011\u0010\u0019\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bK\u0010@R\u0011\u0010\u001a\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bL\u0010@R\u0011\u0010\u001b\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bM\u0010@R\u0011\u0010\u001c\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bN\u0010@R\u0011\u0010\u001d\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bO\u0010@R\u0011\u0010\u001e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bP\u0010@R\u0011\u0010\u001f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bQ\u0010@R\u0011\u0010 \u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bR\u0010@R\u0011\u0010!\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bS\u0010@R\u0011\u0010#\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bT\u00102¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "daily_commits_total", "daily_commits_mean", "daily_commits_mean_percent", "daily_commits_median", "daily_commits_median_percent", "module_size_total", "module_size_mean", "module_size_mean_percent", "module_size_median", "module_size_median_percent", "dependent_modules_size_total", "dependent_modules_size_mean", "dependent_modules_size_mean_percent", "dependent_modules_size_median", "dependent_modules_size_median_percent", "build_impact_total", "build_impact_mean", "build_impact_mean_percent", "build_impact_median", "build_impact_median_percent", "", "module_count", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;DDDDDDDDDDDDDDDDDDDDI)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;DDDDDDDDDDDDDDDDDDDDI)Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEvent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getDaily_commits_total", "()D", "getDaily_commits_mean", "getDaily_commits_mean_percent", "getDaily_commits_median", "getDaily_commits_median_percent", "getModule_size_total", "getModule_size_mean", "getModule_size_mean_percent", "getModule_size_median", "getModule_size_median_percent", "getDependent_modules_size_total", "getDependent_modules_size_mean", "getDependent_modules_size_mean_percent", "getDependent_modules_size_median", "getDependent_modules_size_median_percent", "getBuild_impact_total", "getBuild_impact_mean", "getBuild_impact_mean_percent", "getBuild_impact_median", "getBuild_impact_median_percent", "getModule_count", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientBuildImpactMetricsEventDto implements Dto3<ClientBuildImpactMetricsEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientBuildImpactMetricsEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientBuildImpactMetricsEventDto, ClientBuildImpactMetricsEvent>> binaryBase64Serializer$delegate;
    private static final ClientBuildImpactMetricsEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientBuildImpactMetricsEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientBuildImpactMetricsEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final double getDaily_commits_total() {
        return this.surrogate.getDaily_commits_total();
    }

    public final double getDaily_commits_mean() {
        return this.surrogate.getDaily_commits_mean();
    }

    public final double getDaily_commits_mean_percent() {
        return this.surrogate.getDaily_commits_mean_percent();
    }

    public final double getDaily_commits_median() {
        return this.surrogate.getDaily_commits_median();
    }

    public final double getDaily_commits_median_percent() {
        return this.surrogate.getDaily_commits_median_percent();
    }

    public final double getModule_size_total() {
        return this.surrogate.getModule_size_total();
    }

    public final double getModule_size_mean() {
        return this.surrogate.getModule_size_mean();
    }

    public final double getModule_size_mean_percent() {
        return this.surrogate.getModule_size_mean_percent();
    }

    public final double getModule_size_median() {
        return this.surrogate.getModule_size_median();
    }

    public final double getModule_size_median_percent() {
        return this.surrogate.getModule_size_median_percent();
    }

    public final double getDependent_modules_size_total() {
        return this.surrogate.getDependent_modules_size_total();
    }

    public final double getDependent_modules_size_mean() {
        return this.surrogate.getDependent_modules_size_mean();
    }

    public final double getDependent_modules_size_mean_percent() {
        return this.surrogate.getDependent_modules_size_mean_percent();
    }

    public final double getDependent_modules_size_median() {
        return this.surrogate.getDependent_modules_size_median();
    }

    public final double getDependent_modules_size_median_percent() {
        return this.surrogate.getDependent_modules_size_median_percent();
    }

    public final double getBuild_impact_total() {
        return this.surrogate.getBuild_impact_total();
    }

    public final double getBuild_impact_mean() {
        return this.surrogate.getBuild_impact_mean();
    }

    public final double getBuild_impact_mean_percent() {
        return this.surrogate.getBuild_impact_mean_percent();
    }

    public final double getBuild_impact_median() {
        return this.surrogate.getBuild_impact_median();
    }

    public final double getBuild_impact_median_percent() {
        return this.surrogate.getBuild_impact_median_percent();
    }

    public final int getModule_count() {
        return this.surrogate.getModule_count();
    }

    public /* synthetic */ ClientBuildImpactMetricsEventDto(ClientPlatformDto clientPlatformDto, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i2 & 2) != 0 ? null : instant, (i2 & 4) != 0 ? 0.0d : d, (i2 & 8) != 0 ? 0.0d : d2, (i2 & 16) != 0 ? 0.0d : d3, (i2 & 32) != 0 ? 0.0d : d4, (i2 & 64) != 0 ? 0.0d : d5, (i2 & 128) != 0 ? 0.0d : d6, (i2 & 256) != 0 ? 0.0d : d7, (i2 & 512) != 0 ? 0.0d : d8, (i2 & 1024) != 0 ? 0.0d : d9, (i2 & 2048) != 0 ? 0.0d : d10, (i2 & 4096) != 0 ? 0.0d : d11, (i2 & 8192) != 0 ? 0.0d : d12, (i2 & 16384) != 0 ? 0.0d : d13, (32768 & i2) != 0 ? 0.0d : d14, (65536 & i2) != 0 ? 0.0d : d15, (131072 & i2) != 0 ? 0.0d : d16, (262144 & i2) != 0 ? 0.0d : d17, (524288 & i2) != 0 ? 0.0d : d18, (1048576 & i2) != 0 ? 0.0d : d19, (2097152 & i2) == 0 ? d20 : 0.0d, (i2 & 4194304) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientBuildImpactMetricsEventDto(ClientPlatformDto platform, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, int i) {
        this(new Surrogate(platform, instant, d, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, i));
        Intrinsics.checkNotNullParameter(platform, "platform");
    }

    public final ClientBuildImpactMetricsEventDto copy(ClientPlatformDto platform, Instant timestamp, double daily_commits_total, double daily_commits_mean, double daily_commits_mean_percent, double daily_commits_median, double daily_commits_median_percent, double module_size_total, double module_size_mean, double module_size_mean_percent, double module_size_median, double module_size_median_percent, double dependent_modules_size_total, double dependent_modules_size_mean, double dependent_modules_size_mean_percent, double dependent_modules_size_median, double dependent_modules_size_median_percent, double build_impact_total, double build_impact_mean, double build_impact_mean_percent, double build_impact_median, double build_impact_median_percent, int module_count) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        return new ClientBuildImpactMetricsEventDto(new Surrogate(platform, timestamp, daily_commits_total, daily_commits_mean, daily_commits_mean_percent, daily_commits_median, daily_commits_median_percent, module_size_total, module_size_mean, module_size_mean_percent, module_size_median, module_size_median_percent, dependent_modules_size_total, dependent_modules_size_mean, dependent_modules_size_mean_percent, dependent_modules_size_median, dependent_modules_size_median_percent, build_impact_total, build_impact_mean, build_impact_mean_percent, build_impact_median, build_impact_median_percent, module_count));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientBuildImpactMetricsEvent toProto() {
        return new ClientBuildImpactMetricsEvent((ClientPlatform) this.surrogate.getPlatform().toProto(), this.surrogate.getTimestamp(), this.surrogate.getDaily_commits_total(), this.surrogate.getDaily_commits_mean(), this.surrogate.getDaily_commits_mean_percent(), this.surrogate.getDaily_commits_median(), this.surrogate.getDaily_commits_median_percent(), this.surrogate.getModule_size_total(), this.surrogate.getModule_size_mean(), this.surrogate.getModule_size_mean_percent(), this.surrogate.getModule_size_median(), this.surrogate.getModule_size_median_percent(), this.surrogate.getDependent_modules_size_total(), this.surrogate.getDependent_modules_size_mean(), this.surrogate.getDependent_modules_size_mean_percent(), this.surrogate.getDependent_modules_size_median(), this.surrogate.getDependent_modules_size_median_percent(), this.surrogate.getBuild_impact_total(), this.surrogate.getBuild_impact_mean(), this.surrogate.getBuild_impact_mean_percent(), this.surrogate.getBuild_impact_median(), this.surrogate.getBuild_impact_median_percent(), this.surrogate.getModule_count(), null, 8388608, null);
    }

    public String toString() {
        return "[ClientBuildImpactMetricsEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientBuildImpactMetricsEventDto) && Intrinsics.areEqual(((ClientBuildImpactMetricsEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientBuildImpactMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b8\b\u0083\b\u0018\u0000 \u008a\u00012\u00020\u0001:\u0004\u008b\u0001\u008a\u0001BÎ\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0014\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0015\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0017\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0018\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0019\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u001a\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u001b\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u001c\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u001d\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u001e\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u001f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\"\u001a\u00110 ¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0!¢\u0006\u0004\b#\u0010$B×\u0001\b\u0010\u0012\u0006\u0010%\u001a\u00020 \u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\n\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\u0006\u0010\"\u001a\u00020 \u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J'\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u00103J6\u00104\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b8\u00107J\u001f\u00109\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b9\u00107J\u001f\u0010:\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b:\u00107J\u001f\u0010;\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b;\u00107J\u001f\u0010<\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b<\u00107J\u001f\u0010=\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b=\u00107J\u001f\u0010>\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b>\u00107J\u001f\u0010?\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b?\u00107J\u001f\u0010@\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b@\u00107J\u001f\u0010A\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bA\u00107J\u001f\u0010B\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bB\u00107J\u001f\u0010C\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bC\u00107J\u001f\u0010D\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bD\u00107J\u001f\u0010E\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bE\u00107J\u001f\u0010F\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bF\u00107J\u001f\u0010G\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bG\u00107J\u001f\u0010H\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bH\u00107J\u001f\u0010I\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bI\u00107J\u001f\u0010J\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bJ\u00107J\u001f\u0010K\u001a\u00110 ¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0!HÆ\u0003¢\u0006\u0004\bK\u0010LJ×\u0004\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\r\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0010\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0011\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0012\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0013\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0014\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0015\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0016\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0017\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0018\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0019\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u001a\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u001b\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u001c\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u001d\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u001e\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u001f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\"\u001a\u00110 ¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0!HÆ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010P\u001a\u00020OHÖ\u0001¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020 HÖ\u0001¢\u0006\u0004\bR\u0010LJ\u001a\u0010U\u001a\u00020T2\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bU\u0010VR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010W\u0012\u0004\bY\u0010Z\u001a\u0004\bX\u00103RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010[\u0012\u0004\b]\u0010Z\u001a\u0004\b\\\u00105R/\u0010\f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010^\u0012\u0004\b`\u0010Z\u001a\u0004\b_\u00107R/\u0010\r\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010^\u0012\u0004\bb\u0010Z\u001a\u0004\ba\u00107R/\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010^\u0012\u0004\bd\u0010Z\u001a\u0004\bc\u00107R/\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010^\u0012\u0004\bf\u0010Z\u001a\u0004\be\u00107R/\u0010\u0010\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010^\u0012\u0004\bh\u0010Z\u001a\u0004\bg\u00107R/\u0010\u0011\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010^\u0012\u0004\bj\u0010Z\u001a\u0004\bi\u00107R/\u0010\u0012\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010^\u0012\u0004\bl\u0010Z\u001a\u0004\bk\u00107R/\u0010\u0013\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010^\u0012\u0004\bn\u0010Z\u001a\u0004\bm\u00107R/\u0010\u0014\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010^\u0012\u0004\bp\u0010Z\u001a\u0004\bo\u00107R/\u0010\u0015\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010^\u0012\u0004\br\u0010Z\u001a\u0004\bq\u00107R/\u0010\u0016\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010^\u0012\u0004\bt\u0010Z\u001a\u0004\bs\u00107R/\u0010\u0017\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010^\u0012\u0004\bv\u0010Z\u001a\u0004\bu\u00107R/\u0010\u0018\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010^\u0012\u0004\bx\u0010Z\u001a\u0004\bw\u00107R/\u0010\u0019\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010^\u0012\u0004\bz\u0010Z\u001a\u0004\by\u00107R/\u0010\u001a\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010^\u0012\u0004\b|\u0010Z\u001a\u0004\b{\u00107R/\u0010\u001b\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010^\u0012\u0004\b~\u0010Z\u001a\u0004\b}\u00107R0\u0010\u001c\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b\u001c\u0010^\u0012\u0005\b\u0080\u0001\u0010Z\u001a\u0004\b\u007f\u00107R1\u0010\u001d\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001d\u0010^\u0012\u0005\b\u0082\u0001\u0010Z\u001a\u0005\b\u0081\u0001\u00107R1\u0010\u001e\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001e\u0010^\u0012\u0005\b\u0084\u0001\u0010Z\u001a\u0005\b\u0083\u0001\u00107R1\u0010\u001f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001f\u0010^\u0012\u0005\b\u0086\u0001\u0010Z\u001a\u0005\b\u0085\u0001\u00107R2\u0010\"\u001a\u00110 ¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0!8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\"\u0010\u0087\u0001\u0012\u0005\b\u0089\u0001\u0010Z\u001a\u0005\b\u0088\u0001\u0010L¨\u0006\u008c\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "daily_commits_total", "daily_commits_mean", "daily_commits_mean_percent", "daily_commits_median", "daily_commits_median_percent", "module_size_total", "module_size_mean", "module_size_mean_percent", "module_size_median", "module_size_median_percent", "dependent_modules_size_total", "dependent_modules_size_mean", "dependent_modules_size_mean_percent", "dependent_modules_size_median", "dependent_modules_size_median_percent", "build_impact_total", "build_impact_mean", "build_impact_mean_percent", "build_impact_median", "build_impact_median_percent", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "module_count", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;DDDDDDDDDDDDDDDDDDDDI)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;DDDDDDDDDDDDDDDDDDDDILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()D", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "()I", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;DDDDDDDDDDDDDDDDDDDDI)Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto$Surrogate;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "D", "getDaily_commits_total", "getDaily_commits_total$annotations", "getDaily_commits_mean", "getDaily_commits_mean$annotations", "getDaily_commits_mean_percent", "getDaily_commits_mean_percent$annotations", "getDaily_commits_median", "getDaily_commits_median$annotations", "getDaily_commits_median_percent", "getDaily_commits_median_percent$annotations", "getModule_size_total", "getModule_size_total$annotations", "getModule_size_mean", "getModule_size_mean$annotations", "getModule_size_mean_percent", "getModule_size_mean_percent$annotations", "getModule_size_median", "getModule_size_median$annotations", "getModule_size_median_percent", "getModule_size_median_percent$annotations", "getDependent_modules_size_total", "getDependent_modules_size_total$annotations", "getDependent_modules_size_mean", "getDependent_modules_size_mean$annotations", "getDependent_modules_size_mean_percent", "getDependent_modules_size_mean_percent$annotations", "getDependent_modules_size_median", "getDependent_modules_size_median$annotations", "getDependent_modules_size_median_percent", "getDependent_modules_size_median_percent$annotations", "getBuild_impact_total", "getBuild_impact_total$annotations", "getBuild_impact_mean", "getBuild_impact_mean$annotations", "getBuild_impact_mean_percent", "getBuild_impact_mean_percent$annotations", "getBuild_impact_median", "getBuild_impact_median$annotations", "getBuild_impact_median_percent", "getBuild_impact_median_percent$annotations", "I", "getModule_count", "getModule_count$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double build_impact_mean;
        private final double build_impact_mean_percent;
        private final double build_impact_median;
        private final double build_impact_median_percent;
        private final double build_impact_total;
        private final double daily_commits_mean;
        private final double daily_commits_mean_percent;
        private final double daily_commits_median;
        private final double daily_commits_median_percent;
        private final double daily_commits_total;
        private final double dependent_modules_size_mean;
        private final double dependent_modules_size_mean_percent;
        private final double dependent_modules_size_median;
        private final double dependent_modules_size_median_percent;
        private final double dependent_modules_size_total;
        private final int module_count;
        private final double module_size_mean;
        private final double module_size_mean_percent;
        private final double module_size_median;
        private final double module_size_median_percent;
        private final double module_size_total;
        private final ClientPlatformDto platform;
        private final Instant timestamp;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 8388607, (DefaultConstructorMarker) null);
        }

        @SerialName("buildImpactMean")
        @JsonAnnotations2(names = {"build_impact_mean"})
        public static /* synthetic */ void getBuild_impact_mean$annotations() {
        }

        @SerialName("buildImpactMeanPercent")
        @JsonAnnotations2(names = {"build_impact_mean_percent"})
        public static /* synthetic */ void getBuild_impact_mean_percent$annotations() {
        }

        @SerialName("buildImpactMedian")
        @JsonAnnotations2(names = {"build_impact_median"})
        public static /* synthetic */ void getBuild_impact_median$annotations() {
        }

        @SerialName("buildImpactMedianPercent")
        @JsonAnnotations2(names = {"build_impact_median_percent"})
        public static /* synthetic */ void getBuild_impact_median_percent$annotations() {
        }

        @SerialName("buildImpactTotal")
        @JsonAnnotations2(names = {"build_impact_total"})
        public static /* synthetic */ void getBuild_impact_total$annotations() {
        }

        @SerialName("dailyCommitsMean")
        @JsonAnnotations2(names = {"daily_commits_mean"})
        public static /* synthetic */ void getDaily_commits_mean$annotations() {
        }

        @SerialName("dailyCommitsMeanPercent")
        @JsonAnnotations2(names = {"daily_commits_mean_percent"})
        public static /* synthetic */ void getDaily_commits_mean_percent$annotations() {
        }

        @SerialName("dailyCommitsMedian")
        @JsonAnnotations2(names = {"daily_commits_median"})
        public static /* synthetic */ void getDaily_commits_median$annotations() {
        }

        @SerialName("dailyCommitsMedianPercent")
        @JsonAnnotations2(names = {"daily_commits_median_percent"})
        public static /* synthetic */ void getDaily_commits_median_percent$annotations() {
        }

        @SerialName("dailyCommitsTotal")
        @JsonAnnotations2(names = {"daily_commits_total"})
        public static /* synthetic */ void getDaily_commits_total$annotations() {
        }

        @SerialName("dependentModulesSizeMean")
        @JsonAnnotations2(names = {"dependent_modules_size_mean"})
        public static /* synthetic */ void getDependent_modules_size_mean$annotations() {
        }

        @SerialName("dependentModulesSizeMeanPercent")
        @JsonAnnotations2(names = {"dependent_modules_size_mean_percent"})
        public static /* synthetic */ void getDependent_modules_size_mean_percent$annotations() {
        }

        @SerialName("dependentModulesSizeMedian")
        @JsonAnnotations2(names = {"dependent_modules_size_median"})
        public static /* synthetic */ void getDependent_modules_size_median$annotations() {
        }

        @SerialName("dependentModulesSizeMedianPercent")
        @JsonAnnotations2(names = {"dependent_modules_size_median_percent"})
        public static /* synthetic */ void getDependent_modules_size_median_percent$annotations() {
        }

        @SerialName("dependentModulesSizeTotal")
        @JsonAnnotations2(names = {"dependent_modules_size_total"})
        public static /* synthetic */ void getDependent_modules_size_total$annotations() {
        }

        @SerialName("moduleCount")
        @JsonAnnotations2(names = {"module_count"})
        public static /* synthetic */ void getModule_count$annotations() {
        }

        @SerialName("moduleSizeMean")
        @JsonAnnotations2(names = {"module_size_mean"})
        public static /* synthetic */ void getModule_size_mean$annotations() {
        }

        @SerialName("moduleSizeMeanPercent")
        @JsonAnnotations2(names = {"module_size_mean_percent"})
        public static /* synthetic */ void getModule_size_mean_percent$annotations() {
        }

        @SerialName("moduleSizeMedian")
        @JsonAnnotations2(names = {"module_size_median"})
        public static /* synthetic */ void getModule_size_median$annotations() {
        }

        @SerialName("moduleSizeMedianPercent")
        @JsonAnnotations2(names = {"module_size_median_percent"})
        public static /* synthetic */ void getModule_size_median_percent$annotations() {
        }

        @SerialName("moduleSizeTotal")
        @JsonAnnotations2(names = {"module_size_total"})
        public static /* synthetic */ void getModule_size_total$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /* renamed from: component10, reason: from getter */
        public final double getModule_size_mean_percent() {
            return this.module_size_mean_percent;
        }

        /* renamed from: component11, reason: from getter */
        public final double getModule_size_median() {
            return this.module_size_median;
        }

        /* renamed from: component12, reason: from getter */
        public final double getModule_size_median_percent() {
            return this.module_size_median_percent;
        }

        /* renamed from: component13, reason: from getter */
        public final double getDependent_modules_size_total() {
            return this.dependent_modules_size_total;
        }

        /* renamed from: component14, reason: from getter */
        public final double getDependent_modules_size_mean() {
            return this.dependent_modules_size_mean;
        }

        /* renamed from: component15, reason: from getter */
        public final double getDependent_modules_size_mean_percent() {
            return this.dependent_modules_size_mean_percent;
        }

        /* renamed from: component16, reason: from getter */
        public final double getDependent_modules_size_median() {
            return this.dependent_modules_size_median;
        }

        /* renamed from: component17, reason: from getter */
        public final double getDependent_modules_size_median_percent() {
            return this.dependent_modules_size_median_percent;
        }

        /* renamed from: component18, reason: from getter */
        public final double getBuild_impact_total() {
            return this.build_impact_total;
        }

        /* renamed from: component19, reason: from getter */
        public final double getBuild_impact_mean() {
            return this.build_impact_mean;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component20, reason: from getter */
        public final double getBuild_impact_mean_percent() {
            return this.build_impact_mean_percent;
        }

        /* renamed from: component21, reason: from getter */
        public final double getBuild_impact_median() {
            return this.build_impact_median;
        }

        /* renamed from: component22, reason: from getter */
        public final double getBuild_impact_median_percent() {
            return this.build_impact_median_percent;
        }

        /* renamed from: component23, reason: from getter */
        public final int getModule_count() {
            return this.module_count;
        }

        /* renamed from: component3, reason: from getter */
        public final double getDaily_commits_total() {
            return this.daily_commits_total;
        }

        /* renamed from: component4, reason: from getter */
        public final double getDaily_commits_mean() {
            return this.daily_commits_mean;
        }

        /* renamed from: component5, reason: from getter */
        public final double getDaily_commits_mean_percent() {
            return this.daily_commits_mean_percent;
        }

        /* renamed from: component6, reason: from getter */
        public final double getDaily_commits_median() {
            return this.daily_commits_median;
        }

        /* renamed from: component7, reason: from getter */
        public final double getDaily_commits_median_percent() {
            return this.daily_commits_median_percent;
        }

        /* renamed from: component8, reason: from getter */
        public final double getModule_size_total() {
            return this.module_size_total;
        }

        /* renamed from: component9, reason: from getter */
        public final double getModule_size_mean() {
            return this.module_size_mean;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, double daily_commits_total, double daily_commits_mean, double daily_commits_mean_percent, double daily_commits_median, double daily_commits_median_percent, double module_size_total, double module_size_mean, double module_size_mean_percent, double module_size_median, double module_size_median_percent, double dependent_modules_size_total, double dependent_modules_size_mean, double dependent_modules_size_mean_percent, double dependent_modules_size_median, double dependent_modules_size_median_percent, double build_impact_total, double build_impact_mean, double build_impact_mean_percent, double build_impact_median, double build_impact_median_percent, int module_count) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            return new Surrogate(platform, timestamp, daily_commits_total, daily_commits_mean, daily_commits_mean_percent, daily_commits_median, daily_commits_median_percent, module_size_total, module_size_mean, module_size_mean_percent, module_size_median, module_size_median_percent, dependent_modules_size_total, dependent_modules_size_mean, dependent_modules_size_mean_percent, dependent_modules_size_median, dependent_modules_size_median_percent, build_impact_total, build_impact_mean, build_impact_mean_percent, build_impact_median, build_impact_median_percent, module_count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Double.compare(this.daily_commits_total, surrogate.daily_commits_total) == 0 && Double.compare(this.daily_commits_mean, surrogate.daily_commits_mean) == 0 && Double.compare(this.daily_commits_mean_percent, surrogate.daily_commits_mean_percent) == 0 && Double.compare(this.daily_commits_median, surrogate.daily_commits_median) == 0 && Double.compare(this.daily_commits_median_percent, surrogate.daily_commits_median_percent) == 0 && Double.compare(this.module_size_total, surrogate.module_size_total) == 0 && Double.compare(this.module_size_mean, surrogate.module_size_mean) == 0 && Double.compare(this.module_size_mean_percent, surrogate.module_size_mean_percent) == 0 && Double.compare(this.module_size_median, surrogate.module_size_median) == 0 && Double.compare(this.module_size_median_percent, surrogate.module_size_median_percent) == 0 && Double.compare(this.dependent_modules_size_total, surrogate.dependent_modules_size_total) == 0 && Double.compare(this.dependent_modules_size_mean, surrogate.dependent_modules_size_mean) == 0 && Double.compare(this.dependent_modules_size_mean_percent, surrogate.dependent_modules_size_mean_percent) == 0 && Double.compare(this.dependent_modules_size_median, surrogate.dependent_modules_size_median) == 0 && Double.compare(this.dependent_modules_size_median_percent, surrogate.dependent_modules_size_median_percent) == 0 && Double.compare(this.build_impact_total, surrogate.build_impact_total) == 0 && Double.compare(this.build_impact_mean, surrogate.build_impact_mean) == 0 && Double.compare(this.build_impact_mean_percent, surrogate.build_impact_mean_percent) == 0 && Double.compare(this.build_impact_median, surrogate.build_impact_median) == 0 && Double.compare(this.build_impact_median_percent, surrogate.build_impact_median_percent) == 0 && this.module_count == surrogate.module_count;
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((((((((((((((((((((((((((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + Double.hashCode(this.daily_commits_total)) * 31) + Double.hashCode(this.daily_commits_mean)) * 31) + Double.hashCode(this.daily_commits_mean_percent)) * 31) + Double.hashCode(this.daily_commits_median)) * 31) + Double.hashCode(this.daily_commits_median_percent)) * 31) + Double.hashCode(this.module_size_total)) * 31) + Double.hashCode(this.module_size_mean)) * 31) + Double.hashCode(this.module_size_mean_percent)) * 31) + Double.hashCode(this.module_size_median)) * 31) + Double.hashCode(this.module_size_median_percent)) * 31) + Double.hashCode(this.dependent_modules_size_total)) * 31) + Double.hashCode(this.dependent_modules_size_mean)) * 31) + Double.hashCode(this.dependent_modules_size_mean_percent)) * 31) + Double.hashCode(this.dependent_modules_size_median)) * 31) + Double.hashCode(this.dependent_modules_size_median_percent)) * 31) + Double.hashCode(this.build_impact_total)) * 31) + Double.hashCode(this.build_impact_mean)) * 31) + Double.hashCode(this.build_impact_mean_percent)) * 31) + Double.hashCode(this.build_impact_median)) * 31) + Double.hashCode(this.build_impact_median_percent)) * 31) + Integer.hashCode(this.module_count);
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", daily_commits_total=" + this.daily_commits_total + ", daily_commits_mean=" + this.daily_commits_mean + ", daily_commits_mean_percent=" + this.daily_commits_mean_percent + ", daily_commits_median=" + this.daily_commits_median + ", daily_commits_median_percent=" + this.daily_commits_median_percent + ", module_size_total=" + this.module_size_total + ", module_size_mean=" + this.module_size_mean + ", module_size_mean_percent=" + this.module_size_mean_percent + ", module_size_median=" + this.module_size_median + ", module_size_median_percent=" + this.module_size_median_percent + ", dependent_modules_size_total=" + this.dependent_modules_size_total + ", dependent_modules_size_mean=" + this.dependent_modules_size_mean + ", dependent_modules_size_mean_percent=" + this.dependent_modules_size_mean_percent + ", dependent_modules_size_median=" + this.dependent_modules_size_median + ", dependent_modules_size_median_percent=" + this.dependent_modules_size_median_percent + ", build_impact_total=" + this.build_impact_total + ", build_impact_mean=" + this.build_impact_mean + ", build_impact_mean_percent=" + this.build_impact_mean_percent + ", build_impact_median=" + this.build_impact_median + ", build_impact_median_percent=" + this.build_impact_median_percent + ", module_count=" + this.module_count + ")";
        }

        /* compiled from: ClientBuildImpactMetricsEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientBuildImpactMetricsEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.daily_commits_total = 0.0d;
            } else {
                this.daily_commits_total = d;
            }
            if ((i & 8) == 0) {
                this.daily_commits_mean = 0.0d;
            } else {
                this.daily_commits_mean = d2;
            }
            if ((i & 16) == 0) {
                this.daily_commits_mean_percent = 0.0d;
            } else {
                this.daily_commits_mean_percent = d3;
            }
            if ((i & 32) == 0) {
                this.daily_commits_median = 0.0d;
            } else {
                this.daily_commits_median = d4;
            }
            if ((i & 64) == 0) {
                this.daily_commits_median_percent = 0.0d;
            } else {
                this.daily_commits_median_percent = d5;
            }
            if ((i & 128) == 0) {
                this.module_size_total = 0.0d;
            } else {
                this.module_size_total = d6;
            }
            if ((i & 256) == 0) {
                this.module_size_mean = 0.0d;
            } else {
                this.module_size_mean = d7;
            }
            if ((i & 512) == 0) {
                this.module_size_mean_percent = 0.0d;
            } else {
                this.module_size_mean_percent = d8;
            }
            if ((i & 1024) == 0) {
                this.module_size_median = 0.0d;
            } else {
                this.module_size_median = d9;
            }
            if ((i & 2048) == 0) {
                this.module_size_median_percent = 0.0d;
            } else {
                this.module_size_median_percent = d10;
            }
            if ((i & 4096) == 0) {
                this.dependent_modules_size_total = 0.0d;
            } else {
                this.dependent_modules_size_total = d11;
            }
            if ((i & 8192) == 0) {
                this.dependent_modules_size_mean = 0.0d;
            } else {
                this.dependent_modules_size_mean = d12;
            }
            if ((i & 16384) == 0) {
                this.dependent_modules_size_mean_percent = 0.0d;
            } else {
                this.dependent_modules_size_mean_percent = d13;
            }
            if ((32768 & i) == 0) {
                this.dependent_modules_size_median = 0.0d;
            } else {
                this.dependent_modules_size_median = d14;
            }
            if ((65536 & i) == 0) {
                this.dependent_modules_size_median_percent = 0.0d;
            } else {
                this.dependent_modules_size_median_percent = d15;
            }
            if ((131072 & i) == 0) {
                this.build_impact_total = 0.0d;
            } else {
                this.build_impact_total = d16;
            }
            if ((262144 & i) == 0) {
                this.build_impact_mean = 0.0d;
            } else {
                this.build_impact_mean = d17;
            }
            if ((524288 & i) == 0) {
                this.build_impact_mean_percent = 0.0d;
            } else {
                this.build_impact_mean_percent = d18;
            }
            if ((1048576 & i) == 0) {
                this.build_impact_median = 0.0d;
            } else {
                this.build_impact_median = d19;
            }
            if ((2097152 & i) == 0) {
                this.build_impact_median_percent = 0.0d;
            } else {
                this.build_impact_median_percent = d20;
            }
            this.module_count = (i & 4194304) == 0 ? 0 : i2;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.platform != ClientPlatformDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ClientPlatformDto.Serializer.INSTANCE, self.platform);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            if (Double.compare(self.daily_commits_total, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.daily_commits_total));
            }
            if (Double.compare(self.daily_commits_mean, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.daily_commits_mean));
            }
            if (Double.compare(self.daily_commits_mean_percent, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 4, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.daily_commits_mean_percent));
            }
            if (Double.compare(self.daily_commits_median, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.daily_commits_median));
            }
            if (Double.compare(self.daily_commits_median_percent, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 6, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.daily_commits_median_percent));
            }
            if (Double.compare(self.module_size_total, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 7, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.module_size_total));
            }
            if (Double.compare(self.module_size_mean, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 8, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.module_size_mean));
            }
            if (Double.compare(self.module_size_mean_percent, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 9, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.module_size_mean_percent));
            }
            if (Double.compare(self.module_size_median, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 10, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.module_size_median));
            }
            if (Double.compare(self.module_size_median_percent, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 11, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.module_size_median_percent));
            }
            if (Double.compare(self.dependent_modules_size_total, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 12, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.dependent_modules_size_total));
            }
            if (Double.compare(self.dependent_modules_size_mean, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 13, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.dependent_modules_size_mean));
            }
            if (Double.compare(self.dependent_modules_size_mean_percent, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 14, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.dependent_modules_size_mean_percent));
            }
            if (Double.compare(self.dependent_modules_size_median, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 15, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.dependent_modules_size_median));
            }
            if (Double.compare(self.dependent_modules_size_median_percent, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 16, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.dependent_modules_size_median_percent));
            }
            if (Double.compare(self.build_impact_total, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 17, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.build_impact_total));
            }
            if (Double.compare(self.build_impact_mean, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 18, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.build_impact_mean));
            }
            if (Double.compare(self.build_impact_mean_percent, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 19, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.build_impact_mean_percent));
            }
            if (Double.compare(self.build_impact_median, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 20, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.build_impact_median));
            }
            if (Double.compare(self.build_impact_median_percent, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 21, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.build_impact_median_percent));
            }
            int i = self.module_count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 22, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, int i) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            this.platform = platform;
            this.timestamp = instant;
            this.daily_commits_total = d;
            this.daily_commits_mean = d2;
            this.daily_commits_mean_percent = d3;
            this.daily_commits_median = d4;
            this.daily_commits_median_percent = d5;
            this.module_size_total = d6;
            this.module_size_mean = d7;
            this.module_size_mean_percent = d8;
            this.module_size_median = d9;
            this.module_size_median_percent = d10;
            this.dependent_modules_size_total = d11;
            this.dependent_modules_size_mean = d12;
            this.dependent_modules_size_mean_percent = d13;
            this.dependent_modules_size_median = d14;
            this.dependent_modules_size_median_percent = d15;
            this.build_impact_total = d16;
            this.build_impact_mean = d17;
            this.build_impact_mean_percent = d18;
            this.build_impact_median = d19;
            this.build_impact_median_percent = d20;
            this.module_count = i;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        public /* synthetic */ Surrogate(ClientPlatformDto clientPlatformDto, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i2 & 2) != 0 ? null : instant, (i2 & 4) != 0 ? 0.0d : d, (i2 & 8) != 0 ? 0.0d : d2, (i2 & 16) != 0 ? 0.0d : d3, (i2 & 32) != 0 ? 0.0d : d4, (i2 & 64) != 0 ? 0.0d : d5, (i2 & 128) != 0 ? 0.0d : d6, (i2 & 256) != 0 ? 0.0d : d7, (i2 & 512) != 0 ? 0.0d : d8, (i2 & 1024) != 0 ? 0.0d : d9, (i2 & 2048) != 0 ? 0.0d : d10, (i2 & 4096) != 0 ? 0.0d : d11, (i2 & 8192) != 0 ? 0.0d : d12, (i2 & 16384) != 0 ? 0.0d : d13, (32768 & i2) != 0 ? 0.0d : d14, (65536 & i2) != 0 ? 0.0d : d15, (131072 & i2) != 0 ? 0.0d : d16, (262144 & i2) != 0 ? 0.0d : d17, (524288 & i2) != 0 ? 0.0d : d18, (1048576 & i2) != 0 ? 0.0d : d19, (2097152 & i2) == 0 ? d20 : 0.0d, (i2 & 4194304) != 0 ? 0 : i);
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final double getDaily_commits_total() {
            return this.daily_commits_total;
        }

        public final double getDaily_commits_mean() {
            return this.daily_commits_mean;
        }

        public final double getDaily_commits_mean_percent() {
            return this.daily_commits_mean_percent;
        }

        public final double getDaily_commits_median() {
            return this.daily_commits_median;
        }

        public final double getDaily_commits_median_percent() {
            return this.daily_commits_median_percent;
        }

        public final double getModule_size_total() {
            return this.module_size_total;
        }

        public final double getModule_size_mean() {
            return this.module_size_mean;
        }

        public final double getModule_size_mean_percent() {
            return this.module_size_mean_percent;
        }

        public final double getModule_size_median() {
            return this.module_size_median;
        }

        public final double getModule_size_median_percent() {
            return this.module_size_median_percent;
        }

        public final double getDependent_modules_size_total() {
            return this.dependent_modules_size_total;
        }

        public final double getDependent_modules_size_mean() {
            return this.dependent_modules_size_mean;
        }

        public final double getDependent_modules_size_mean_percent() {
            return this.dependent_modules_size_mean_percent;
        }

        public final double getDependent_modules_size_median() {
            return this.dependent_modules_size_median;
        }

        public final double getDependent_modules_size_median_percent() {
            return this.dependent_modules_size_median_percent;
        }

        public final double getBuild_impact_total() {
            return this.build_impact_total;
        }

        public final double getBuild_impact_mean() {
            return this.build_impact_mean;
        }

        public final double getBuild_impact_mean_percent() {
            return this.build_impact_mean_percent;
        }

        public final double getBuild_impact_median() {
            return this.build_impact_median;
        }

        public final double getBuild_impact_median_percent() {
            return this.build_impact_median_percent;
        }

        public final int getModule_count() {
            return this.module_count;
        }
    }

    /* compiled from: ClientBuildImpactMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClientBuildImpactMetricsEventDto, ClientBuildImpactMetricsEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientBuildImpactMetricsEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientBuildImpactMetricsEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientBuildImpactMetricsEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientBuildImpactMetricsEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientBuildImpactMetricsEvent> getProtoAdapter() {
            return ClientBuildImpactMetricsEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientBuildImpactMetricsEventDto getZeroValue() {
            return ClientBuildImpactMetricsEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientBuildImpactMetricsEventDto fromProto(ClientBuildImpactMetricsEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClientBuildImpactMetricsEventDto(new Surrogate(ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform()), proto.getTimestamp(), proto.getDaily_commits_total(), proto.getDaily_commits_mean(), proto.getDaily_commits_mean_percent(), proto.getDaily_commits_median(), proto.getDaily_commits_median_percent(), proto.getModule_size_total(), proto.getModule_size_mean(), proto.getModule_size_mean_percent(), proto.getModule_size_median(), proto.getModule_size_median_percent(), proto.getDependent_modules_size_total(), proto.getDependent_modules_size_mean(), proto.getDependent_modules_size_mean_percent(), proto.getDependent_modules_size_median(), proto.getDependent_modules_size_median_percent(), proto.getBuild_impact_total(), proto.getBuild_impact_mean(), proto.getBuild_impact_mean_percent(), proto.getBuild_impact_median(), proto.getBuild_impact_median_percent(), proto.getModule_count()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientBuildImpactMetricsEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientBuildImpactMetricsEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientBuildImpactMetricsEventDto(null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 8388607, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientBuildImpactMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientBuildImpactMetricsEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientBuildImpactMetricsEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientBuildImpactMetricsEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientBuildImpactMetricsEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientBuildImpactMetricsEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientBuildImpactMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactMetricsEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientBuildImpactMetricsEventDto";
        }
    }
}

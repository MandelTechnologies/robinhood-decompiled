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

/* compiled from: ClientBuildImpactModuleMetricsEventDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004>=?@B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u007f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0006\u0010\u0018J\u0083\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b5\u00104R\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b6\u00104R\u0011\u0010\u0011\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b7\u00104R\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b8\u00104R\u0011\u0010\u0013\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b9\u00104R\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b:\u00104R\u0011\u0010\u0015\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b;\u00104R\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b<\u0010\u001e¨\u0006A"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "daily_commits", "daily_commits_percent", "module_size", "module_size_percent", "dependent_modules_size", "dependent_modules_size_percent", "build_impact", "build_impact_percent", "", "name", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;DDDDDDDDLjava/lang/String;)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;DDDDDDDDLjava/lang/String;)Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getDaily_commits", "()D", "getDaily_commits_percent", "getModule_size", "getModule_size_percent", "getDependent_modules_size", "getDependent_modules_size_percent", "getBuild_impact", "getBuild_impact_percent", "getName", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientBuildImpactModuleMetricsEventDto implements Dto3<ClientBuildImpactModuleMetricsEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientBuildImpactModuleMetricsEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientBuildImpactModuleMetricsEventDto, ClientBuildImpactModuleMetricsEvent>> binaryBase64Serializer$delegate;
    private static final ClientBuildImpactModuleMetricsEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientBuildImpactModuleMetricsEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientBuildImpactModuleMetricsEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final double getDaily_commits() {
        return this.surrogate.getDaily_commits();
    }

    public final double getDaily_commits_percent() {
        return this.surrogate.getDaily_commits_percent();
    }

    public final double getModule_size() {
        return this.surrogate.getModule_size();
    }

    public final double getModule_size_percent() {
        return this.surrogate.getModule_size_percent();
    }

    public final double getDependent_modules_size() {
        return this.surrogate.getDependent_modules_size();
    }

    public final double getDependent_modules_size_percent() {
        return this.surrogate.getDependent_modules_size_percent();
    }

    public final double getBuild_impact() {
        return this.surrogate.getBuild_impact();
    }

    public final double getBuild_impact_percent() {
        return this.surrogate.getBuild_impact_percent();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public /* synthetic */ ClientBuildImpactModuleMetricsEventDto(ClientPlatformDto clientPlatformDto, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2, (i & 16) != 0 ? 0.0d : d3, (i & 32) != 0 ? 0.0d : d4, (i & 64) != 0 ? 0.0d : d5, (i & 128) != 0 ? 0.0d : d6, (i & 256) != 0 ? 0.0d : d7, (i & 512) == 0 ? d8 : 0.0d, (i & 1024) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientBuildImpactModuleMetricsEventDto(ClientPlatformDto platform, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, String name) {
        this(new Surrogate(platform, instant, d, d2, d3, d4, d5, d6, d7, d8, name));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public final ClientBuildImpactModuleMetricsEventDto copy(ClientPlatformDto platform, Instant timestamp, double daily_commits, double daily_commits_percent, double module_size, double module_size_percent, double dependent_modules_size, double dependent_modules_size_percent, double build_impact, double build_impact_percent, String name) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
        return new ClientBuildImpactModuleMetricsEventDto(new Surrogate(platform, timestamp, daily_commits, daily_commits_percent, module_size, module_size_percent, dependent_modules_size, dependent_modules_size_percent, build_impact, build_impact_percent, name));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientBuildImpactModuleMetricsEvent toProto() {
        return new ClientBuildImpactModuleMetricsEvent((ClientPlatform) this.surrogate.getPlatform().toProto(), this.surrogate.getTimestamp(), this.surrogate.getDaily_commits(), this.surrogate.getDaily_commits_percent(), this.surrogate.getModule_size(), this.surrogate.getModule_size_percent(), this.surrogate.getDependent_modules_size(), this.surrogate.getDependent_modules_size_percent(), this.surrogate.getBuild_impact(), this.surrogate.getBuild_impact_percent(), this.surrogate.getName(), null, 2048, null);
    }

    public String toString() {
        return "[ClientBuildImpactModuleMetricsEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientBuildImpactModuleMetricsEventDto) && Intrinsics.areEqual(((ClientBuildImpactModuleMetricsEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientBuildImpactModuleMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b \b\u0083\b\u0018\u0000 Y2\u00020\u0001:\u0002ZYB\u0093\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017By\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J6\u0010(\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b,\u0010+J\u001f\u0010-\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b-\u0010+J\u001f\u0010.\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b.\u0010+J\u001f\u0010/\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b/\u0010+J\u001f\u00100\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b0\u0010+J\u001f\u00101\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b1\u0010+J\u001f\u00102\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b2\u0010+J\u0010\u00103\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b3\u00104J\u009c\u0002\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\r\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0010\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0011\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0012\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u0013\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b7\u00104J\u0010\u00108\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010'RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010B\u0012\u0004\bD\u0010A\u001a\u0004\bC\u0010)R/\u0010\f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010E\u0012\u0004\bG\u0010A\u001a\u0004\bF\u0010+R/\u0010\r\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010E\u0012\u0004\bI\u0010A\u001a\u0004\bH\u0010+R/\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010E\u0012\u0004\bK\u0010A\u001a\u0004\bJ\u0010+R/\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010E\u0012\u0004\bM\u0010A\u001a\u0004\bL\u0010+R/\u0010\u0010\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010E\u0012\u0004\bO\u0010A\u001a\u0004\bN\u0010+R/\u0010\u0011\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010E\u0012\u0004\bQ\u0010A\u001a\u0004\bP\u0010+R/\u0010\u0012\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010E\u0012\u0004\bS\u0010A\u001a\u0004\bR\u0010+R/\u0010\u0013\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010E\u0012\u0004\bU\u0010A\u001a\u0004\bT\u0010+R \u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010V\u0012\u0004\bX\u0010A\u001a\u0004\bW\u00104¨\u0006["}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "daily_commits", "daily_commits_percent", "module_size", "module_size_percent", "dependent_modules_size", "dependent_modules_size_percent", "build_impact", "build_impact_percent", "", "name", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;DDDDDDDDLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;DDDDDDDDLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()D", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;DDDDDDDDLjava/lang/String;)Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "D", "getDaily_commits", "getDaily_commits$annotations", "getDaily_commits_percent", "getDaily_commits_percent$annotations", "getModule_size", "getModule_size$annotations", "getModule_size_percent", "getModule_size_percent$annotations", "getDependent_modules_size", "getDependent_modules_size$annotations", "getDependent_modules_size_percent", "getDependent_modules_size_percent$annotations", "getBuild_impact", "getBuild_impact$annotations", "getBuild_impact_percent", "getBuild_impact_percent$annotations", "Ljava/lang/String;", "getName", "getName$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double build_impact;
        private final double build_impact_percent;
        private final double daily_commits;
        private final double daily_commits_percent;
        private final double dependent_modules_size;
        private final double dependent_modules_size_percent;
        private final double module_size;
        private final double module_size_percent;
        private final String name;
        private final ClientPlatformDto platform;
        private final Instant timestamp;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, (String) null, 2047, (DefaultConstructorMarker) null);
        }

        @SerialName("buildImpact")
        @JsonAnnotations2(names = {"build_impact"})
        public static /* synthetic */ void getBuild_impact$annotations() {
        }

        @SerialName("buildImpactPercent")
        @JsonAnnotations2(names = {"build_impact_percent"})
        public static /* synthetic */ void getBuild_impact_percent$annotations() {
        }

        @SerialName("dailyCommits")
        @JsonAnnotations2(names = {"daily_commits"})
        public static /* synthetic */ void getDaily_commits$annotations() {
        }

        @SerialName("dailyCommitsPercent")
        @JsonAnnotations2(names = {"daily_commits_percent"})
        public static /* synthetic */ void getDaily_commits_percent$annotations() {
        }

        @SerialName("dependentModulesSize")
        @JsonAnnotations2(names = {"dependent_modules_size"})
        public static /* synthetic */ void getDependent_modules_size$annotations() {
        }

        @SerialName("dependentModulesSizePercent")
        @JsonAnnotations2(names = {"dependent_modules_size_percent"})
        public static /* synthetic */ void getDependent_modules_size_percent$annotations() {
        }

        @SerialName("moduleSize")
        @JsonAnnotations2(names = {"module_size"})
        public static /* synthetic */ void getModule_size$annotations() {
        }

        @SerialName("moduleSizePercent")
        @JsonAnnotations2(names = {"module_size_percent"})
        public static /* synthetic */ void getModule_size_percent$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
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
        public final double getBuild_impact_percent() {
            return this.build_impact_percent;
        }

        /* renamed from: component11, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final double getDaily_commits() {
            return this.daily_commits;
        }

        /* renamed from: component4, reason: from getter */
        public final double getDaily_commits_percent() {
            return this.daily_commits_percent;
        }

        /* renamed from: component5, reason: from getter */
        public final double getModule_size() {
            return this.module_size;
        }

        /* renamed from: component6, reason: from getter */
        public final double getModule_size_percent() {
            return this.module_size_percent;
        }

        /* renamed from: component7, reason: from getter */
        public final double getDependent_modules_size() {
            return this.dependent_modules_size;
        }

        /* renamed from: component8, reason: from getter */
        public final double getDependent_modules_size_percent() {
            return this.dependent_modules_size_percent;
        }

        /* renamed from: component9, reason: from getter */
        public final double getBuild_impact() {
            return this.build_impact;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, double daily_commits, double daily_commits_percent, double module_size, double module_size_percent, double dependent_modules_size, double dependent_modules_size_percent, double build_impact, double build_impact_percent, String name) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Surrogate(platform, timestamp, daily_commits, daily_commits_percent, module_size, module_size_percent, dependent_modules_size, dependent_modules_size_percent, build_impact, build_impact_percent, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Double.compare(this.daily_commits, surrogate.daily_commits) == 0 && Double.compare(this.daily_commits_percent, surrogate.daily_commits_percent) == 0 && Double.compare(this.module_size, surrogate.module_size) == 0 && Double.compare(this.module_size_percent, surrogate.module_size_percent) == 0 && Double.compare(this.dependent_modules_size, surrogate.dependent_modules_size) == 0 && Double.compare(this.dependent_modules_size_percent, surrogate.dependent_modules_size_percent) == 0 && Double.compare(this.build_impact, surrogate.build_impact) == 0 && Double.compare(this.build_impact_percent, surrogate.build_impact_percent) == 0 && Intrinsics.areEqual(this.name, surrogate.name);
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + Double.hashCode(this.daily_commits)) * 31) + Double.hashCode(this.daily_commits_percent)) * 31) + Double.hashCode(this.module_size)) * 31) + Double.hashCode(this.module_size_percent)) * 31) + Double.hashCode(this.dependent_modules_size)) * 31) + Double.hashCode(this.dependent_modules_size_percent)) * 31) + Double.hashCode(this.build_impact)) * 31) + Double.hashCode(this.build_impact_percent)) * 31) + this.name.hashCode();
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", daily_commits=" + this.daily_commits + ", daily_commits_percent=" + this.daily_commits_percent + ", module_size=" + this.module_size + ", module_size_percent=" + this.module_size_percent + ", dependent_modules_size=" + this.dependent_modules_size + ", dependent_modules_size_percent=" + this.dependent_modules_size_percent + ", build_impact=" + this.build_impact + ", build_impact_percent=" + this.build_impact_percent + ", name=" + this.name + ")";
        }

        /* compiled from: ClientBuildImpactModuleMetricsEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientBuildImpactModuleMetricsEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.daily_commits = 0.0d;
            } else {
                this.daily_commits = d;
            }
            if ((i & 8) == 0) {
                this.daily_commits_percent = 0.0d;
            } else {
                this.daily_commits_percent = d2;
            }
            if ((i & 16) == 0) {
                this.module_size = 0.0d;
            } else {
                this.module_size = d3;
            }
            if ((i & 32) == 0) {
                this.module_size_percent = 0.0d;
            } else {
                this.module_size_percent = d4;
            }
            if ((i & 64) == 0) {
                this.dependent_modules_size = 0.0d;
            } else {
                this.dependent_modules_size = d5;
            }
            if ((i & 128) == 0) {
                this.dependent_modules_size_percent = 0.0d;
            } else {
                this.dependent_modules_size_percent = d6;
            }
            if ((i & 256) == 0) {
                this.build_impact = 0.0d;
            } else {
                this.build_impact = d7;
            }
            if ((i & 512) == 0) {
                this.build_impact_percent = 0.0d;
            } else {
                this.build_impact_percent = d8;
            }
            this.name = (i & 1024) == 0 ? "" : str;
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
            if (Double.compare(self.daily_commits, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.daily_commits));
            }
            if (Double.compare(self.daily_commits_percent, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.daily_commits_percent));
            }
            if (Double.compare(self.module_size, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 4, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.module_size));
            }
            if (Double.compare(self.module_size_percent, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.module_size_percent));
            }
            if (Double.compare(self.dependent_modules_size, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 6, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.dependent_modules_size));
            }
            if (Double.compare(self.dependent_modules_size_percent, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 7, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.dependent_modules_size_percent));
            }
            if (Double.compare(self.build_impact, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 8, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.build_impact));
            }
            if (Double.compare(self.build_impact_percent, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 9, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.build_impact_percent));
            }
            if (Intrinsics.areEqual(self.name, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 10, self.name);
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, String name) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(name, "name");
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

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        public /* synthetic */ Surrogate(ClientPlatformDto clientPlatformDto, Instant instant, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2, (i & 16) != 0 ? 0.0d : d3, (i & 32) != 0 ? 0.0d : d4, (i & 64) != 0 ? 0.0d : d5, (i & 128) != 0 ? 0.0d : d6, (i & 256) != 0 ? 0.0d : d7, (i & 512) == 0 ? d8 : 0.0d, (i & 1024) != 0 ? "" : str);
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
    }

    /* compiled from: ClientBuildImpactModuleMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClientBuildImpactModuleMetricsEventDto, ClientBuildImpactModuleMetricsEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientBuildImpactModuleMetricsEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientBuildImpactModuleMetricsEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientBuildImpactModuleMetricsEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientBuildImpactModuleMetricsEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientBuildImpactModuleMetricsEvent> getProtoAdapter() {
            return ClientBuildImpactModuleMetricsEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientBuildImpactModuleMetricsEventDto getZeroValue() {
            return ClientBuildImpactModuleMetricsEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientBuildImpactModuleMetricsEventDto fromProto(ClientBuildImpactModuleMetricsEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClientBuildImpactModuleMetricsEventDto(new Surrogate(ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform()), proto.getTimestamp(), proto.getDaily_commits(), proto.getDaily_commits_percent(), proto.getModule_size(), proto.getModule_size_percent(), proto.getDependent_modules_size(), proto.getDependent_modules_size_percent(), proto.getBuild_impact(), proto.getBuild_impact_percent(), proto.getName()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientBuildImpactModuleMetricsEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientBuildImpactModuleMetricsEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientBuildImpactModuleMetricsEventDto(null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientBuildImpactModuleMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientBuildImpactModuleMetricsEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientBuildImpactModuleMetricsEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientBuildImpactModuleMetricsEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientBuildImpactModuleMetricsEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientBuildImpactModuleMetricsEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientBuildImpactModuleMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildImpactModuleMetricsEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientBuildImpactModuleMetricsEventDto";
        }
    }
}

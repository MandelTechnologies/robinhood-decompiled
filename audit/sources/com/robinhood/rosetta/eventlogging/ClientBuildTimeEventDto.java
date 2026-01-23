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
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.BuildLocationDto;
import com.robinhood.rosetta.eventlogging.ClientPlatformDto;
import com.robinhood.rosetta.eventlogging.EnvironmentDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import p479j$.time.Instant;

/* compiled from: ClientBuildTimeEventDto.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004KJLMB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u009f\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u001fJ£\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010&H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020*H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020*H\u0016¢\u0006\u0004\b3\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b5\u0010%R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b>\u0010%R\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b?\u0010%R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010\u0018\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010\u0019\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bD\u0010CR\u0011\u0010\u001a\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bE\u00109R\u0011\u0010\u001b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bF\u00109R\u0011\u0010\u001d\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010\u001e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bI\u0010%¨\u0006N"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto$Surrogate;)V", "", "id", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "", "duration", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "environment", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "goal", "user", "Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;", "location", "", "configuration_cache_enabled", "configuration_cache_hit", "configuration_cache_load_time", "configuration_cache_store_time", "", "configuration_cache_size", "tz_identifier", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;FLcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;ZZFFDLjava/lang/String;)V", "copy", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;FLcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;ZZFFDLjava/lang/String;)Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEvent;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto$Surrogate;", "getId", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getDuration", "()F", "getEnvironment", "()Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "getTimestamp", "()Lj$/time/Instant;", "getGoal", "getUser", "getLocation", "()Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;", "getConfiguration_cache_enabled", "()Z", "getConfiguration_cache_hit", "getConfiguration_cache_load_time", "getConfiguration_cache_store_time", "getConfiguration_cache_size", "()D", "getTz_identifier", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientBuildTimeEventDto implements Dto3<ClientBuildTimeEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientBuildTimeEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientBuildTimeEventDto, ClientBuildTimeEvent>> binaryBase64Serializer$delegate;
    private static final ClientBuildTimeEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientBuildTimeEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientBuildTimeEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final float getDuration() {
        return this.surrogate.getDuration();
    }

    public final EnvironmentDto getEnvironment() {
        return this.surrogate.getEnvironment();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getGoal() {
        return this.surrogate.getGoal();
    }

    public final String getUser() {
        return this.surrogate.getUser();
    }

    public final BuildLocationDto getLocation() {
        return this.surrogate.getLocation();
    }

    public final boolean getConfiguration_cache_enabled() {
        return this.surrogate.getConfiguration_cache_enabled();
    }

    public final boolean getConfiguration_cache_hit() {
        return this.surrogate.getConfiguration_cache_hit();
    }

    public final float getConfiguration_cache_load_time() {
        return this.surrogate.getConfiguration_cache_load_time();
    }

    public final float getConfiguration_cache_store_time() {
        return this.surrogate.getConfiguration_cache_store_time();
    }

    public final double getConfiguration_cache_size() {
        return this.surrogate.getConfiguration_cache_size();
    }

    public final String getTz_identifier() {
        return this.surrogate.getTz_identifier();
    }

    public /* synthetic */ ClientBuildTimeEventDto(String str, ClientPlatformDto clientPlatformDto, float f, EnvironmentDto environmentDto, Instant instant, String str2, String str3, BuildLocationDto buildLocationDto, boolean z, boolean z2, float f2, float f3, double d, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? null : environmentDto, (i & 16) == 0 ? instant : null, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? BuildLocationDto.INSTANCE.getZeroValue() : buildLocationDto, (i & 256) != 0 ? false : z, (i & 512) == 0 ? z2 : false, (i & 1024) != 0 ? 0.0f : f2, (i & 2048) == 0 ? f3 : 0.0f, (i & 4096) != 0 ? 0.0d : d, (i & 8192) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientBuildTimeEventDto(String id, ClientPlatformDto platform, float f, EnvironmentDto environmentDto, Instant instant, String goal, String user, BuildLocationDto location, boolean z, boolean z2, float f2, float f3, double d, String tz_identifier) {
        this(new Surrogate(id, platform, f, environmentDto, instant, goal, user, location, z, z2, f2, f3, d, tz_identifier));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(goal, "goal");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(tz_identifier, "tz_identifier");
    }

    public final ClientBuildTimeEventDto copy(String id, ClientPlatformDto platform, float duration, EnvironmentDto environment, Instant timestamp, String goal, String user, BuildLocationDto location, boolean configuration_cache_enabled, boolean configuration_cache_hit, float configuration_cache_load_time, float configuration_cache_store_time, double configuration_cache_size, String tz_identifier) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(goal, "goal");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(tz_identifier, "tz_identifier");
        return new ClientBuildTimeEventDto(new Surrogate(id, platform, duration, environment, timestamp, goal, user, location, configuration_cache_enabled, configuration_cache_hit, configuration_cache_load_time, configuration_cache_store_time, configuration_cache_size, tz_identifier));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientBuildTimeEvent toProto() {
        String id = this.surrogate.getId();
        ClientPlatform clientPlatform = (ClientPlatform) this.surrogate.getPlatform().toProto();
        float duration = this.surrogate.getDuration();
        EnvironmentDto environment = this.surrogate.getEnvironment();
        return new ClientBuildTimeEvent(id, clientPlatform, duration, environment != null ? environment.toProto() : null, this.surrogate.getTimestamp(), this.surrogate.getGoal(), this.surrogate.getUser(), (BuildLocation) this.surrogate.getLocation().toProto(), this.surrogate.getConfiguration_cache_enabled(), this.surrogate.getConfiguration_cache_hit(), this.surrogate.getConfiguration_cache_load_time(), this.surrogate.getConfiguration_cache_store_time(), this.surrogate.getConfiguration_cache_size(), this.surrogate.getTz_identifier(), null, 16384, null);
    }

    public String toString() {
        return "[ClientBuildTimeEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientBuildTimeEventDto) && Intrinsics.areEqual(((ClientBuildTimeEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientBuildTimeEventDto.kt */
    @Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bI\b\u0083\b\u0018\u0000 q2\u00020\u0001:\u0002rqB÷\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012.\b\u0002\u0010\u0010\u001a(\u0018\u00010\rj\u0013\u0018\u0001`\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\u0017\b\u0002\u0010\u0018\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u0019\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u001c\u001a\u00110\u001a¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fB\u009b\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001e\u0010$J'\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b4\u00105J6\u00106\u001a(\u0018\u00010\rj\u0013\u0018\u0001`\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u0010/J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010/J\u0010\u0010:\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b>\u0010=J\u001f\u0010?\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b?\u00103J\u001f\u0010@\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b@\u00103J\u001f\u0010A\u001a\u00110\u001a¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001bHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bC\u0010/J\u0080\u0002\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2.\b\u0002\u0010\u0010\u001a(\u0018\u00010\rj\u0013\u0018\u0001`\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\u0017\b\u0002\u0010\u0018\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u0017\b\u0002\u0010\u0019\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u0017\b\u0002\u0010\u001c\u001a\u00110\u001a¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bF\u0010/J\u0010\u0010G\u001a\u00020 HÖ\u0001¢\u0006\u0004\bG\u0010HJ\u001a\u0010J\u001a\u00020\u00152\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bJ\u0010KR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010L\u0012\u0004\bN\u0010O\u001a\u0004\bM\u0010/R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010P\u0012\u0004\bR\u0010O\u001a\u0004\bQ\u00101R/\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010S\u0012\u0004\bU\u0010O\u001a\u0004\bT\u00103R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010V\u0012\u0004\bX\u0010O\u001a\u0004\bW\u00105RF\u0010\u0010\u001a(\u0018\u00010\rj\u0013\u0018\u0001`\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010Y\u0012\u0004\b[\u0010O\u001a\u0004\bZ\u00107R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010L\u0012\u0004\b]\u0010O\u001a\u0004\b\\\u0010/R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010L\u0012\u0004\b_\u0010O\u001a\u0004\b^\u0010/R \u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010`\u0012\u0004\bb\u0010O\u001a\u0004\ba\u0010;R \u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010c\u0012\u0004\be\u0010O\u001a\u0004\bd\u0010=R \u0010\u0017\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010c\u0012\u0004\bg\u0010O\u001a\u0004\bf\u0010=R/\u0010\u0018\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010S\u0012\u0004\bi\u0010O\u001a\u0004\bh\u00103R/\u0010\u0019\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010S\u0012\u0004\bk\u0010O\u001a\u0004\bj\u00103R/\u0010\u001c\u001a\u00110\u001a¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010l\u0012\u0004\bn\u0010O\u001a\u0004\bm\u0010BR \u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010L\u0012\u0004\bp\u0010O\u001a\u0004\bo\u0010/¨\u0006s"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto$Surrogate;", "", "", "id", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "duration", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "environment", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "goal", "user", "Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;", "location", "", "configuration_cache_enabled", "configuration_cache_hit", "configuration_cache_load_time", "configuration_cache_store_time", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "configuration_cache_size", "tz_identifier", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;FLcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;ZZFFDLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;FLcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;ZZFFDLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component3", "()F", "component4", "()Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "component5", "()Lj$/time/Instant;", "component6", "component7", "component8", "()Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;", "component9", "()Z", "component10", "component11", "component12", "component13", "()D", "component14", "copy", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;FLcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;ZZFFDLjava/lang/String;)Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "F", "getDuration", "getDuration$annotations", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "getEnvironment", "getEnvironment$annotations", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "getGoal", "getGoal$annotations", "getUser", "getUser$annotations", "Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;", "getLocation", "getLocation$annotations", "Z", "getConfiguration_cache_enabled", "getConfiguration_cache_enabled$annotations", "getConfiguration_cache_hit", "getConfiguration_cache_hit$annotations", "getConfiguration_cache_load_time", "getConfiguration_cache_load_time$annotations", "getConfiguration_cache_store_time", "getConfiguration_cache_store_time$annotations", "D", "getConfiguration_cache_size", "getConfiguration_cache_size$annotations", "getTz_identifier", "getTz_identifier$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean configuration_cache_enabled;
        private final boolean configuration_cache_hit;
        private final float configuration_cache_load_time;
        private final double configuration_cache_size;
        private final float configuration_cache_store_time;
        private final float duration;
        private final EnvironmentDto environment;
        private final String goal;
        private final String id;
        private final BuildLocationDto location;
        private final ClientPlatformDto platform;
        private final Instant timestamp;
        private final String tz_identifier;
        private final String user;

        public Surrogate() {
            this((String) null, (ClientPlatformDto) null, 0.0f, (EnvironmentDto) null, (Instant) null, (String) null, (String) null, (BuildLocationDto) null, false, false, 0.0f, 0.0f, 0.0d, (String) null, 16383, (DefaultConstructorMarker) null);
        }

        @SerialName("configurationCacheEnabled")
        @JsonAnnotations2(names = {"configuration_cache_enabled"})
        public static /* synthetic */ void getConfiguration_cache_enabled$annotations() {
        }

        @SerialName("configurationCacheHit")
        @JsonAnnotations2(names = {"configuration_cache_hit"})
        public static /* synthetic */ void getConfiguration_cache_hit$annotations() {
        }

        @SerialName("configurationCacheLoadTime")
        @JsonAnnotations2(names = {"configuration_cache_load_time"})
        public static /* synthetic */ void getConfiguration_cache_load_time$annotations() {
        }

        @SerialName("configurationCacheSize")
        @JsonAnnotations2(names = {"configuration_cache_size"})
        public static /* synthetic */ void getConfiguration_cache_size$annotations() {
        }

        @SerialName("configurationCacheStoreTime")
        @JsonAnnotations2(names = {"configuration_cache_store_time"})
        public static /* synthetic */ void getConfiguration_cache_store_time$annotations() {
        }

        @SerialName("duration")
        @JsonAnnotations2(names = {"duration"})
        public static /* synthetic */ void getDuration$annotations() {
        }

        @SerialName("environment")
        @JsonAnnotations2(names = {"environment"})
        public static /* synthetic */ void getEnvironment$annotations() {
        }

        @SerialName("goal")
        @JsonAnnotations2(names = {"goal"})
        public static /* synthetic */ void getGoal$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("location")
        @JsonAnnotations2(names = {"location"})
        public static /* synthetic */ void getLocation$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("tzIdentifier")
        @JsonAnnotations2(names = {"tz_identifier"})
        public static /* synthetic */ void getTz_identifier$annotations() {
        }

        @SerialName("user")
        @JsonAnnotations2(names = {"user"})
        public static /* synthetic */ void getUser$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getConfiguration_cache_hit() {
            return this.configuration_cache_hit;
        }

        /* renamed from: component11, reason: from getter */
        public final float getConfiguration_cache_load_time() {
            return this.configuration_cache_load_time;
        }

        /* renamed from: component12, reason: from getter */
        public final float getConfiguration_cache_store_time() {
            return this.configuration_cache_store_time;
        }

        /* renamed from: component13, reason: from getter */
        public final double getConfiguration_cache_size() {
            return this.configuration_cache_size;
        }

        /* renamed from: component14, reason: from getter */
        public final String getTz_identifier() {
            return this.tz_identifier;
        }

        /* renamed from: component2, reason: from getter */
        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /* renamed from: component3, reason: from getter */
        public final float getDuration() {
            return this.duration;
        }

        /* renamed from: component4, reason: from getter */
        public final EnvironmentDto getEnvironment() {
            return this.environment;
        }

        /* renamed from: component5, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component6, reason: from getter */
        public final String getGoal() {
            return this.goal;
        }

        /* renamed from: component7, reason: from getter */
        public final String getUser() {
            return this.user;
        }

        /* renamed from: component8, reason: from getter */
        public final BuildLocationDto getLocation() {
            return this.location;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getConfiguration_cache_enabled() {
            return this.configuration_cache_enabled;
        }

        public final Surrogate copy(String id, ClientPlatformDto platform, float duration, EnvironmentDto environment, Instant timestamp, String goal, String user, BuildLocationDto location, boolean configuration_cache_enabled, boolean configuration_cache_hit, float configuration_cache_load_time, float configuration_cache_store_time, double configuration_cache_size, String tz_identifier) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(goal, "goal");
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(tz_identifier, "tz_identifier");
            return new Surrogate(id, platform, duration, environment, timestamp, goal, user, location, configuration_cache_enabled, configuration_cache_hit, configuration_cache_load_time, configuration_cache_store_time, configuration_cache_size, tz_identifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.platform == surrogate.platform && Float.compare(this.duration, surrogate.duration) == 0 && Intrinsics.areEqual(this.environment, surrogate.environment) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.goal, surrogate.goal) && Intrinsics.areEqual(this.user, surrogate.user) && this.location == surrogate.location && this.configuration_cache_enabled == surrogate.configuration_cache_enabled && this.configuration_cache_hit == surrogate.configuration_cache_hit && Float.compare(this.configuration_cache_load_time, surrogate.configuration_cache_load_time) == 0 && Float.compare(this.configuration_cache_store_time, surrogate.configuration_cache_store_time) == 0 && Double.compare(this.configuration_cache_size, surrogate.configuration_cache_size) == 0 && Intrinsics.areEqual(this.tz_identifier, surrogate.tz_identifier);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.platform.hashCode()) * 31) + Float.hashCode(this.duration)) * 31;
            EnvironmentDto environmentDto = this.environment;
            int iHashCode2 = (iHashCode + (environmentDto == null ? 0 : environmentDto.hashCode())) * 31;
            Instant instant = this.timestamp;
            return ((((((((((((((((((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 31) + this.goal.hashCode()) * 31) + this.user.hashCode()) * 31) + this.location.hashCode()) * 31) + java.lang.Boolean.hashCode(this.configuration_cache_enabled)) * 31) + java.lang.Boolean.hashCode(this.configuration_cache_hit)) * 31) + Float.hashCode(this.configuration_cache_load_time)) * 31) + Float.hashCode(this.configuration_cache_store_time)) * 31) + Double.hashCode(this.configuration_cache_size)) * 31) + this.tz_identifier.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", platform=" + this.platform + ", duration=" + this.duration + ", environment=" + this.environment + ", timestamp=" + this.timestamp + ", goal=" + this.goal + ", user=" + this.user + ", location=" + this.location + ", configuration_cache_enabled=" + this.configuration_cache_enabled + ", configuration_cache_hit=" + this.configuration_cache_hit + ", configuration_cache_load_time=" + this.configuration_cache_load_time + ", configuration_cache_store_time=" + this.configuration_cache_store_time + ", configuration_cache_size=" + this.configuration_cache_size + ", tz_identifier=" + this.tz_identifier + ")";
        }

        /* compiled from: ClientBuildTimeEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientBuildTimeEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ClientPlatformDto clientPlatformDto, float f, EnvironmentDto environmentDto, Instant instant, String str2, String str3, BuildLocationDto buildLocationDto, boolean z, boolean z2, float f2, float f3, double d, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.platform = ClientPlatformDto.INSTANCE.getZeroValue();
            } else {
                this.platform = clientPlatformDto;
            }
            if ((i & 4) == 0) {
                this.duration = 0.0f;
            } else {
                this.duration = f;
            }
            if ((i & 8) == 0) {
                this.environment = null;
            } else {
                this.environment = environmentDto;
            }
            if ((i & 16) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 32) == 0) {
                this.goal = "";
            } else {
                this.goal = str2;
            }
            if ((i & 64) == 0) {
                this.user = "";
            } else {
                this.user = str3;
            }
            if ((i & 128) == 0) {
                this.location = BuildLocationDto.INSTANCE.getZeroValue();
            } else {
                this.location = buildLocationDto;
            }
            if ((i & 256) == 0) {
                this.configuration_cache_enabled = false;
            } else {
                this.configuration_cache_enabled = z;
            }
            if ((i & 512) == 0) {
                this.configuration_cache_hit = false;
            } else {
                this.configuration_cache_hit = z2;
            }
            if ((i & 1024) == 0) {
                this.configuration_cache_load_time = 0.0f;
            } else {
                this.configuration_cache_load_time = f2;
            }
            if ((i & 2048) == 0) {
                this.configuration_cache_store_time = 0.0f;
            } else {
                this.configuration_cache_store_time = f3;
            }
            this.configuration_cache_size = (i & 4096) == 0 ? 0.0d : d;
            if ((i & 8192) == 0) {
                this.tz_identifier = "";
            } else {
                this.tz_identifier = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (self.platform != ClientPlatformDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, ClientPlatformDto.Serializer.INSTANCE, self.platform);
            }
            if (Float.compare(self.duration, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 2, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.duration));
            }
            EnvironmentDto environmentDto = self.environment;
            if (environmentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, EnvironmentDto.Serializer.INSTANCE, environmentDto);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.goal, "")) {
                output.encodeStringElement(serialDesc, 5, self.goal);
            }
            if (!Intrinsics.areEqual(self.user, "")) {
                output.encodeStringElement(serialDesc, 6, self.user);
            }
            if (self.location != BuildLocationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, BuildLocationDto.Serializer.INSTANCE, self.location);
            }
            boolean z = self.configuration_cache_enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 8, z);
            }
            boolean z2 = self.configuration_cache_hit;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 9, z2);
            }
            if (Float.compare(self.configuration_cache_load_time, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 10, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.configuration_cache_load_time));
            }
            if (Float.compare(self.configuration_cache_store_time, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 11, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.configuration_cache_store_time));
            }
            if (Double.compare(self.configuration_cache_size, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 12, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.configuration_cache_size));
            }
            if (Intrinsics.areEqual(self.tz_identifier, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 13, self.tz_identifier);
        }

        public Surrogate(String id, ClientPlatformDto platform, float f, EnvironmentDto environmentDto, Instant instant, String goal, String user, BuildLocationDto location, boolean z, boolean z2, float f2, float f3, double d, String tz_identifier) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(goal, "goal");
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(tz_identifier, "tz_identifier");
            this.id = id;
            this.platform = platform;
            this.duration = f;
            this.environment = environmentDto;
            this.timestamp = instant;
            this.goal = goal;
            this.user = user;
            this.location = location;
            this.configuration_cache_enabled = z;
            this.configuration_cache_hit = z2;
            this.configuration_cache_load_time = f2;
            this.configuration_cache_store_time = f3;
            this.configuration_cache_size = d;
            this.tz_identifier = tz_identifier;
        }

        public /* synthetic */ Surrogate(String str, ClientPlatformDto clientPlatformDto, float f, EnvironmentDto environmentDto, Instant instant, String str2, String str3, BuildLocationDto buildLocationDto, boolean z, boolean z2, float f2, float f3, double d, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? null : environmentDto, (i & 16) == 0 ? instant : null, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? BuildLocationDto.INSTANCE.getZeroValue() : buildLocationDto, (i & 256) != 0 ? false : z, (i & 512) == 0 ? z2 : false, (i & 1024) != 0 ? 0.0f : f2, (i & 2048) == 0 ? f3 : 0.0f, (i & 4096) != 0 ? 0.0d : d, (i & 8192) != 0 ? "" : str4);
        }

        public final String getId() {
            return this.id;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        public final float getDuration() {
            return this.duration;
        }

        public final EnvironmentDto getEnvironment() {
            return this.environment;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getGoal() {
            return this.goal;
        }

        public final String getUser() {
            return this.user;
        }

        public final BuildLocationDto getLocation() {
            return this.location;
        }

        public final boolean getConfiguration_cache_enabled() {
            return this.configuration_cache_enabled;
        }

        public final boolean getConfiguration_cache_hit() {
            return this.configuration_cache_hit;
        }

        public final float getConfiguration_cache_load_time() {
            return this.configuration_cache_load_time;
        }

        public final float getConfiguration_cache_store_time() {
            return this.configuration_cache_store_time;
        }

        public final double getConfiguration_cache_size() {
            return this.configuration_cache_size;
        }

        public final String getTz_identifier() {
            return this.tz_identifier;
        }
    }

    /* compiled from: ClientBuildTimeEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ClientBuildTimeEventDto, ClientBuildTimeEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientBuildTimeEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientBuildTimeEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientBuildTimeEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientBuildTimeEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientBuildTimeEvent> getProtoAdapter() {
            return ClientBuildTimeEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientBuildTimeEventDto getZeroValue() {
            return ClientBuildTimeEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientBuildTimeEventDto fromProto(ClientBuildTimeEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            ClientPlatformDto clientPlatformDtoFromProto = ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform());
            float duration = proto.getDuration();
            Environment environment = proto.getEnvironment();
            return new ClientBuildTimeEventDto(new Surrogate(id, clientPlatformDtoFromProto, duration, environment != null ? EnvironmentDto.INSTANCE.fromProto(environment) : null, proto.getTimestamp(), proto.getGoal(), proto.getUser(), BuildLocationDto.INSTANCE.fromProto(proto.getLocation()), proto.getConfiguration_cache_enabled(), proto.getConfiguration_cache_hit(), proto.getConfiguration_cache_load_time(), proto.getConfiguration_cache_store_time(), proto.getConfiguration_cache_size(), proto.getTz_identifier()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientBuildTimeEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientBuildTimeEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientBuildTimeEventDto(null, null, 0.0f, null, null, null, null, null, false, false, 0.0f, 0.0f, 0.0d, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientBuildTimeEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientBuildTimeEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientBuildTimeEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientBuildTimeEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientBuildTimeEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientBuildTimeEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientBuildTimeEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildTimeEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientBuildTimeEventDto";
        }
    }
}

package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
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

/* compiled from: ClientOverallProfileModulesResultEventDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004879:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BY\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0015J]\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b2\u0010#R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u0010\u0013\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b5\u0010#R\u0011\u0010\u0014\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b6\u0010#¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "environment", "", "initial_clean_build_time", "", "average_incremental_build_time", "total_run_time", "total_module_count", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;IDII)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;IDII)Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEvent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getEnvironment", "()Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "getInitial_clean_build_time", "getAverage_incremental_build_time", "()D", "getTotal_run_time", "getTotal_module_count", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientOverallProfileModulesResultEventDto implements Dto3<ClientOverallProfileModulesResultEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientOverallProfileModulesResultEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientOverallProfileModulesResultEventDto, ClientOverallProfileModulesResultEvent>> binaryBase64Serializer$delegate;
    private static final ClientOverallProfileModulesResultEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientOverallProfileModulesResultEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientOverallProfileModulesResultEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final EnvironmentDto getEnvironment() {
        return this.surrogate.getEnvironment();
    }

    public final int getInitial_clean_build_time() {
        return this.surrogate.getInitial_clean_build_time();
    }

    public final double getAverage_incremental_build_time() {
        return this.surrogate.getAverage_incremental_build_time();
    }

    public final int getTotal_run_time() {
        return this.surrogate.getTotal_run_time();
    }

    public final int getTotal_module_count() {
        return this.surrogate.getTotal_module_count();
    }

    public /* synthetic */ ClientOverallProfileModulesResultEventDto(ClientPlatformDto clientPlatformDto, Instant instant, EnvironmentDto environmentDto, int i, double d, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i4 & 2) != 0 ? null : instant, (i4 & 4) != 0 ? null : environmentDto, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0.0d : d, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0 : i3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientOverallProfileModulesResultEventDto(ClientPlatformDto platform, Instant instant, EnvironmentDto environmentDto, int i, double d, int i2, int i3) {
        this(new Surrogate(platform, instant, environmentDto, i, d, i2, i3));
        Intrinsics.checkNotNullParameter(platform, "platform");
    }

    public static /* synthetic */ ClientOverallProfileModulesResultEventDto copy$default(ClientOverallProfileModulesResultEventDto clientOverallProfileModulesResultEventDto, ClientPlatformDto clientPlatformDto, Instant instant, EnvironmentDto environmentDto, int i, double d, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            clientPlatformDto = clientOverallProfileModulesResultEventDto.surrogate.getPlatform();
        }
        if ((i4 & 2) != 0) {
            instant = clientOverallProfileModulesResultEventDto.surrogate.getTimestamp();
        }
        if ((i4 & 4) != 0) {
            environmentDto = clientOverallProfileModulesResultEventDto.surrogate.getEnvironment();
        }
        if ((i4 & 8) != 0) {
            i = clientOverallProfileModulesResultEventDto.surrogate.getInitial_clean_build_time();
        }
        if ((i4 & 16) != 0) {
            d = clientOverallProfileModulesResultEventDto.surrogate.getAverage_incremental_build_time();
        }
        if ((i4 & 32) != 0) {
            i2 = clientOverallProfileModulesResultEventDto.surrogate.getTotal_run_time();
        }
        if ((i4 & 64) != 0) {
            i3 = clientOverallProfileModulesResultEventDto.surrogate.getTotal_module_count();
        }
        double d2 = d;
        EnvironmentDto environmentDto2 = environmentDto;
        int i5 = i;
        return clientOverallProfileModulesResultEventDto.copy(clientPlatformDto, instant, environmentDto2, i5, d2, i2, i3);
    }

    public final ClientOverallProfileModulesResultEventDto copy(ClientPlatformDto platform, Instant timestamp, EnvironmentDto environment, int initial_clean_build_time, double average_incremental_build_time, int total_run_time, int total_module_count) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        return new ClientOverallProfileModulesResultEventDto(new Surrogate(platform, timestamp, environment, initial_clean_build_time, average_incremental_build_time, total_run_time, total_module_count));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientOverallProfileModulesResultEvent toProto() {
        ClientPlatform clientPlatform = (ClientPlatform) this.surrogate.getPlatform().toProto();
        Instant timestamp = this.surrogate.getTimestamp();
        EnvironmentDto environment = this.surrogate.getEnvironment();
        return new ClientOverallProfileModulesResultEvent(clientPlatform, timestamp, environment != null ? environment.toProto() : null, this.surrogate.getInitial_clean_build_time(), this.surrogate.getAverage_incremental_build_time(), this.surrogate.getTotal_run_time(), this.surrogate.getTotal_module_count(), null, 128, null);
    }

    public String toString() {
        return "[ClientOverallProfileModulesResultEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientOverallProfileModulesResultEventDto) && Intrinsics.areEqual(((ClientOverallProfileModulesResultEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientOverallProfileModulesResultEventDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 M2\u00020\u0001:\u0002NMB±\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r¢\u0006\u0004\b\u0014\u0010\u0015BY\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J6\u0010%\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b-\u0010*J\u001f\u0010.\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b.\u0010*Jº\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0012\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u0013\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\rHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b4\u0010*J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010$RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\b?\u0010<\u001a\u0004\b>\u0010&R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bB\u0010<\u001a\u0004\bA\u0010(R/\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010C\u0012\u0004\bE\u0010<\u001a\u0004\bD\u0010*R/\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010F\u0012\u0004\bH\u0010<\u001a\u0004\bG\u0010,R/\u0010\u0012\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010C\u0012\u0004\bJ\u0010<\u001a\u0004\bI\u0010*R/\u0010\u0013\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010C\u0012\u0004\bL\u0010<\u001a\u0004\bK\u0010*¨\u0006O"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "environment", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "initial_clean_build_time", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "average_incremental_build_time", "total_run_time", "total_module_count", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;IDII)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;IDIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "component4", "()I", "component5", "()D", "component6", "component7", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;IDII)Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto$Surrogate;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "getEnvironment", "getEnvironment$annotations", "I", "getInitial_clean_build_time", "getInitial_clean_build_time$annotations", "D", "getAverage_incremental_build_time", "getAverage_incremental_build_time$annotations", "getTotal_run_time", "getTotal_run_time$annotations", "getTotal_module_count", "getTotal_module_count$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double average_incremental_build_time;
        private final EnvironmentDto environment;
        private final int initial_clean_build_time;
        private final ClientPlatformDto platform;
        private final Instant timestamp;
        private final int total_module_count;
        private final int total_run_time;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, (EnvironmentDto) null, 0, 0.0d, 0, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, EnvironmentDto environmentDto, int i, double d, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i4 & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i4 & 4) != 0) {
                environmentDto = surrogate.environment;
            }
            if ((i4 & 8) != 0) {
                i = surrogate.initial_clean_build_time;
            }
            if ((i4 & 16) != 0) {
                d = surrogate.average_incremental_build_time;
            }
            if ((i4 & 32) != 0) {
                i2 = surrogate.total_run_time;
            }
            if ((i4 & 64) != 0) {
                i3 = surrogate.total_module_count;
            }
            double d2 = d;
            EnvironmentDto environmentDto2 = environmentDto;
            int i5 = i;
            return surrogate.copy(clientPlatformDto, instant, environmentDto2, i5, d2, i2, i3);
        }

        @SerialName("averageIncrementalBuildTime")
        @JsonAnnotations2(names = {"average_incremental_build_time"})
        public static /* synthetic */ void getAverage_incremental_build_time$annotations() {
        }

        @SerialName("environment")
        @JsonAnnotations2(names = {"environment"})
        public static /* synthetic */ void getEnvironment$annotations() {
        }

        @SerialName("initialCleanBuildTime")
        @JsonAnnotations2(names = {"initial_clean_build_time"})
        public static /* synthetic */ void getInitial_clean_build_time$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("totalModuleCount")
        @JsonAnnotations2(names = {"total_module_count"})
        public static /* synthetic */ void getTotal_module_count$annotations() {
        }

        @SerialName("totalRunTime")
        @JsonAnnotations2(names = {"total_run_time"})
        public static /* synthetic */ void getTotal_run_time$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final EnvironmentDto getEnvironment() {
            return this.environment;
        }

        /* renamed from: component4, reason: from getter */
        public final int getInitial_clean_build_time() {
            return this.initial_clean_build_time;
        }

        /* renamed from: component5, reason: from getter */
        public final double getAverage_incremental_build_time() {
            return this.average_incremental_build_time;
        }

        /* renamed from: component6, reason: from getter */
        public final int getTotal_run_time() {
            return this.total_run_time;
        }

        /* renamed from: component7, reason: from getter */
        public final int getTotal_module_count() {
            return this.total_module_count;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, EnvironmentDto environment, int initial_clean_build_time, double average_incremental_build_time, int total_run_time, int total_module_count) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            return new Surrogate(platform, timestamp, environment, initial_clean_build_time, average_incremental_build_time, total_run_time, total_module_count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.environment, surrogate.environment) && this.initial_clean_build_time == surrogate.initial_clean_build_time && Double.compare(this.average_incremental_build_time, surrogate.average_incremental_build_time) == 0 && this.total_run_time == surrogate.total_run_time && this.total_module_count == surrogate.total_module_count;
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            EnvironmentDto environmentDto = this.environment;
            return ((((((((iHashCode2 + (environmentDto != null ? environmentDto.hashCode() : 0)) * 31) + Integer.hashCode(this.initial_clean_build_time)) * 31) + Double.hashCode(this.average_incremental_build_time)) * 31) + Integer.hashCode(this.total_run_time)) * 31) + Integer.hashCode(this.total_module_count);
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", environment=" + this.environment + ", initial_clean_build_time=" + this.initial_clean_build_time + ", average_incremental_build_time=" + this.average_incremental_build_time + ", total_run_time=" + this.total_run_time + ", total_module_count=" + this.total_module_count + ")";
        }

        /* compiled from: ClientOverallProfileModulesResultEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientOverallProfileModulesResultEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, EnvironmentDto environmentDto, int i2, double d, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.environment = null;
            } else {
                this.environment = environmentDto;
            }
            if ((i & 8) == 0) {
                this.initial_clean_build_time = 0;
            } else {
                this.initial_clean_build_time = i2;
            }
            if ((i & 16) == 0) {
                this.average_incremental_build_time = 0.0d;
            } else {
                this.average_incremental_build_time = d;
            }
            if ((i & 32) == 0) {
                this.total_run_time = 0;
            } else {
                this.total_run_time = i3;
            }
            if ((i & 64) == 0) {
                this.total_module_count = 0;
            } else {
                this.total_module_count = i4;
            }
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
            EnvironmentDto environmentDto = self.environment;
            if (environmentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, EnvironmentDto.Serializer.INSTANCE, environmentDto);
            }
            int i = self.initial_clean_build_time;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (Double.compare(self.average_incremental_build_time, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 4, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.average_incremental_build_time));
            }
            int i2 = self.total_run_time;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            int i3 = self.total_module_count;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, EnvironmentDto environmentDto, int i, double d, int i2, int i3) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            this.platform = platform;
            this.timestamp = instant;
            this.environment = environmentDto;
            this.initial_clean_build_time = i;
            this.average_incremental_build_time = d;
            this.total_run_time = i2;
            this.total_module_count = i3;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        public /* synthetic */ Surrogate(ClientPlatformDto clientPlatformDto, Instant instant, EnvironmentDto environmentDto, int i, double d, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i4 & 2) != 0 ? null : instant, (i4 & 4) != 0 ? null : environmentDto, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0.0d : d, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? 0 : i3);
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final EnvironmentDto getEnvironment() {
            return this.environment;
        }

        public final int getInitial_clean_build_time() {
            return this.initial_clean_build_time;
        }

        public final double getAverage_incremental_build_time() {
            return this.average_incremental_build_time;
        }

        public final int getTotal_run_time() {
            return this.total_run_time;
        }

        public final int getTotal_module_count() {
            return this.total_module_count;
        }
    }

    /* compiled from: ClientOverallProfileModulesResultEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ClientOverallProfileModulesResultEventDto, ClientOverallProfileModulesResultEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientOverallProfileModulesResultEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientOverallProfileModulesResultEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientOverallProfileModulesResultEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientOverallProfileModulesResultEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientOverallProfileModulesResultEvent> getProtoAdapter() {
            return ClientOverallProfileModulesResultEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientOverallProfileModulesResultEventDto getZeroValue() {
            return ClientOverallProfileModulesResultEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientOverallProfileModulesResultEventDto fromProto(ClientOverallProfileModulesResultEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ClientPlatformDto clientPlatformDtoFromProto = ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform());
            Instant timestamp = proto.getTimestamp();
            Environment environment = proto.getEnvironment();
            return new ClientOverallProfileModulesResultEventDto(new Surrogate(clientPlatformDtoFromProto, timestamp, environment != null ? EnvironmentDto.INSTANCE.fromProto(environment) : null, proto.getInitial_clean_build_time(), proto.getAverage_incremental_build_time(), proto.getTotal_run_time(), proto.getTotal_module_count()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientOverallProfileModulesResultEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientOverallProfileModulesResultEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientOverallProfileModulesResultEventDto(null, null, null, 0, 0.0d, 0, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientOverallProfileModulesResultEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientOverallProfileModulesResultEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientOverallProfileModulesResultEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientOverallProfileModulesResultEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientOverallProfileModulesResultEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientOverallProfileModulesResultEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientOverallProfileModulesResultEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientOverallProfileModulesResultEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientOverallProfileModulesResultEventDto";
        }
    }
}

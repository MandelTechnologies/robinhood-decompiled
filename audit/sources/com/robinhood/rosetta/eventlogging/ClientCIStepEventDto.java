package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.CIStatusDto;
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

/* compiled from: ClientCIStepEventDto.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004<;=>B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0006\u0010\u0017Jg\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0019\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u0010\u0011\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b5\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u0014\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b8\u00107R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006?"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientCIStepEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "", "ci_event_id", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "environment", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "name", "", "duration", "wait_duration", "Lcom/robinhood/rosetta/eventlogging/CIStatusDto;", "status", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;Ljava/lang/String;FFLcom/robinhood/rosetta/eventlogging/CIStatusDto;)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;Ljava/lang/String;FFLcom/robinhood/rosetta/eventlogging/CIStatusDto;)Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientCIStepEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getCi_event_id", "getEnvironment", "()Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "getTimestamp", "()Lj$/time/Instant;", "getName", "getDuration", "()F", "getWait_duration", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/CIStatusDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientCIStepEventDto implements Dto3<ClientCIStepEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientCIStepEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientCIStepEventDto, ClientCIStepEvent>> binaryBase64Serializer$delegate;
    private static final ClientCIStepEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientCIStepEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientCIStepEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final String getCi_event_id() {
        return this.surrogate.getCi_event_id();
    }

    public final EnvironmentDto getEnvironment() {
        return this.surrogate.getEnvironment();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final float getDuration() {
        return this.surrogate.getDuration();
    }

    public final float getWait_duration() {
        return this.surrogate.getWait_duration();
    }

    public final CIStatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public /* synthetic */ ClientCIStepEventDto(ClientPlatformDto clientPlatformDto, String str, EnvironmentDto environmentDto, Instant instant, String str2, float f, float f2, CIStatusDto cIStatusDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : environmentDto, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? 0.0f : f, (i & 64) != 0 ? 0.0f : f2, (i & 128) != 0 ? CIStatusDto.INSTANCE.getZeroValue() : cIStatusDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientCIStepEventDto(ClientPlatformDto platform, String ci_event_id, EnvironmentDto environmentDto, Instant instant, String name, float f, float f2, CIStatusDto status) {
        this(new Surrogate(platform, ci_event_id, environmentDto, instant, name, f, f2, status));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(ci_event_id, "ci_event_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
    }

    public static /* synthetic */ ClientCIStepEventDto copy$default(ClientCIStepEventDto clientCIStepEventDto, ClientPlatformDto clientPlatformDto, String str, EnvironmentDto environmentDto, Instant instant, String str2, float f, float f2, CIStatusDto cIStatusDto, int i, Object obj) {
        if ((i & 1) != 0) {
            clientPlatformDto = clientCIStepEventDto.surrogate.getPlatform();
        }
        if ((i & 2) != 0) {
            str = clientCIStepEventDto.surrogate.getCi_event_id();
        }
        if ((i & 4) != 0) {
            environmentDto = clientCIStepEventDto.surrogate.getEnvironment();
        }
        if ((i & 8) != 0) {
            instant = clientCIStepEventDto.surrogate.getTimestamp();
        }
        if ((i & 16) != 0) {
            str2 = clientCIStepEventDto.surrogate.getName();
        }
        if ((i & 32) != 0) {
            f = clientCIStepEventDto.surrogate.getDuration();
        }
        if ((i & 64) != 0) {
            f2 = clientCIStepEventDto.surrogate.getWait_duration();
        }
        if ((i & 128) != 0) {
            cIStatusDto = clientCIStepEventDto.surrogate.getStatus();
        }
        float f3 = f2;
        CIStatusDto cIStatusDto2 = cIStatusDto;
        String str3 = str2;
        float f4 = f;
        return clientCIStepEventDto.copy(clientPlatformDto, str, environmentDto, instant, str3, f4, f3, cIStatusDto2);
    }

    public final ClientCIStepEventDto copy(ClientPlatformDto platform, String ci_event_id, EnvironmentDto environment, Instant timestamp, String name, float duration, float wait_duration, CIStatusDto status) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(ci_event_id, "ci_event_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        return new ClientCIStepEventDto(new Surrogate(platform, ci_event_id, environment, timestamp, name, duration, wait_duration, status));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientCIStepEvent toProto() {
        ClientPlatform clientPlatform = (ClientPlatform) this.surrogate.getPlatform().toProto();
        String ci_event_id = this.surrogate.getCi_event_id();
        EnvironmentDto environment = this.surrogate.getEnvironment();
        return new ClientCIStepEvent(clientPlatform, ci_event_id, environment != null ? environment.toProto() : null, this.surrogate.getTimestamp(), this.surrogate.getName(), this.surrogate.getDuration(), this.surrogate.getWait_duration(), (CIStatus) this.surrogate.getStatus().toProto(), null, 256, null);
    }

    public String toString() {
        return "[ClientCIStepEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientCIStepEventDto) && Intrinsics.areEqual(((ClientCIStepEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientCIStepEventDto.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0083\b\u0018\u0000 S2\u00020\u0001:\u0002TSB\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016Bg\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J6\u0010+\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b-\u0010(J\u001f\u0010.\u001a\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0010\u00101\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b1\u00102J¦\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062.\b\u0002\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u0017\b\u0002\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0012\u001a\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u0010(J\u0010\u00106\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010&R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010@\u0012\u0004\bB\u0010?\u001a\u0004\bA\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010C\u0012\u0004\bE\u0010?\u001a\u0004\bD\u0010*RF\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010F\u0012\u0004\bH\u0010?\u001a\u0004\bG\u0010,R \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010@\u0012\u0004\bJ\u0010?\u001a\u0004\bI\u0010(R/\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010K\u0012\u0004\bM\u0010?\u001a\u0004\bL\u0010/R/\u0010\u0012\u001a\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010K\u0012\u0004\bO\u0010?\u001a\u0004\bN\u0010/R \u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010P\u0012\u0004\bR\u0010?\u001a\u0004\bQ\u00102¨\u0006U"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "", "ci_event_id", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "environment", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "name", "", "Lcom/robinhood/idl/serialization/FloatSerializer;", "duration", "wait_duration", "Lcom/robinhood/rosetta/eventlogging/CIStatusDto;", "status", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;Ljava/lang/String;FFLcom/robinhood/rosetta/eventlogging/CIStatusDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;Ljava/lang/String;FFLcom/robinhood/rosetta/eventlogging/CIStatusDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "component4", "()Lj$/time/Instant;", "component5", "component6", "()F", "component7", "component8", "()Lcom/robinhood/rosetta/eventlogging/CIStatusDto;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;Ljava/lang/String;FFLcom/robinhood/rosetta/eventlogging/CIStatusDto;)Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Ljava/lang/String;", "getCi_event_id", "getCi_event_id$annotations", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "getEnvironment", "getEnvironment$annotations", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "getName", "getName$annotations", "F", "getDuration", "getDuration$annotations", "getWait_duration", "getWait_duration$annotations", "Lcom/robinhood/rosetta/eventlogging/CIStatusDto;", "getStatus", "getStatus$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String ci_event_id;
        private final float duration;
        private final EnvironmentDto environment;
        private final String name;
        private final ClientPlatformDto platform;
        private final CIStatusDto status;
        private final Instant timestamp;
        private final float wait_duration;

        public Surrogate() {
            this((ClientPlatformDto) null, (String) null, (EnvironmentDto) null, (Instant) null, (String) null, 0.0f, 0.0f, (CIStatusDto) null, 255, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, String str, EnvironmentDto environmentDto, Instant instant, String str2, float f, float f2, CIStatusDto cIStatusDto, int i, Object obj) {
            if ((i & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i & 2) != 0) {
                str = surrogate.ci_event_id;
            }
            if ((i & 4) != 0) {
                environmentDto = surrogate.environment;
            }
            if ((i & 8) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 16) != 0) {
                str2 = surrogate.name;
            }
            if ((i & 32) != 0) {
                f = surrogate.duration;
            }
            if ((i & 64) != 0) {
                f2 = surrogate.wait_duration;
            }
            if ((i & 128) != 0) {
                cIStatusDto = surrogate.status;
            }
            float f3 = f2;
            CIStatusDto cIStatusDto2 = cIStatusDto;
            String str3 = str2;
            float f4 = f;
            return surrogate.copy(clientPlatformDto, str, environmentDto, instant, str3, f4, f3, cIStatusDto2);
        }

        @SerialName("ciEventId")
        @JsonAnnotations2(names = {"ci_event_id"})
        public static /* synthetic */ void getCi_event_id$annotations() {
        }

        @SerialName("duration")
        @JsonAnnotations2(names = {"duration"})
        public static /* synthetic */ void getDuration$annotations() {
        }

        @SerialName("environment")
        @JsonAnnotations2(names = {"environment"})
        public static /* synthetic */ void getEnvironment$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("waitDuration")
        @JsonAnnotations2(names = {"wait_duration"})
        public static /* synthetic */ void getWait_duration$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCi_event_id() {
            return this.ci_event_id;
        }

        /* renamed from: component3, reason: from getter */
        public final EnvironmentDto getEnvironment() {
            return this.environment;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component5, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component6, reason: from getter */
        public final float getDuration() {
            return this.duration;
        }

        /* renamed from: component7, reason: from getter */
        public final float getWait_duration() {
            return this.wait_duration;
        }

        /* renamed from: component8, reason: from getter */
        public final CIStatusDto getStatus() {
            return this.status;
        }

        public final Surrogate copy(ClientPlatformDto platform, String ci_event_id, EnvironmentDto environment, Instant timestamp, String name, float duration, float wait_duration, CIStatusDto status) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(ci_event_id, "ci_event_id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(status, "status");
            return new Surrogate(platform, ci_event_id, environment, timestamp, name, duration, wait_duration, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.ci_event_id, surrogate.ci_event_id) && Intrinsics.areEqual(this.environment, surrogate.environment) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.name, surrogate.name) && Float.compare(this.duration, surrogate.duration) == 0 && Float.compare(this.wait_duration, surrogate.wait_duration) == 0 && this.status == surrogate.status;
        }

        public int hashCode() {
            int iHashCode = ((this.platform.hashCode() * 31) + this.ci_event_id.hashCode()) * 31;
            EnvironmentDto environmentDto = this.environment;
            int iHashCode2 = (iHashCode + (environmentDto == null ? 0 : environmentDto.hashCode())) * 31;
            Instant instant = this.timestamp;
            return ((((((((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 31) + this.name.hashCode()) * 31) + Float.hashCode(this.duration)) * 31) + Float.hashCode(this.wait_duration)) * 31) + this.status.hashCode();
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", ci_event_id=" + this.ci_event_id + ", environment=" + this.environment + ", timestamp=" + this.timestamp + ", name=" + this.name + ", duration=" + this.duration + ", wait_duration=" + this.wait_duration + ", status=" + this.status + ")";
        }

        /* compiled from: ClientCIStepEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientCIStepEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, String str, EnvironmentDto environmentDto, Instant instant, String str2, float f, float f2, CIStatusDto cIStatusDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.ci_event_id = "";
            } else {
                this.ci_event_id = str;
            }
            if ((i & 4) == 0) {
                this.environment = null;
            } else {
                this.environment = environmentDto;
            }
            if ((i & 8) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 16) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 32) == 0) {
                this.duration = 0.0f;
            } else {
                this.duration = f;
            }
            if ((i & 64) == 0) {
                this.wait_duration = 0.0f;
            } else {
                this.wait_duration = f2;
            }
            if ((i & 128) == 0) {
                this.status = CIStatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = cIStatusDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.platform != ClientPlatformDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ClientPlatformDto.Serializer.INSTANCE, self.platform);
            }
            if (!Intrinsics.areEqual(self.ci_event_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.ci_event_id);
            }
            EnvironmentDto environmentDto = self.environment;
            if (environmentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, EnvironmentDto.Serializer.INSTANCE, environmentDto);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 4, self.name);
            }
            if (Float.compare(self.duration, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 5, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.duration));
            }
            if (Float.compare(self.wait_duration, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 6, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.wait_duration));
            }
            if (self.status != CIStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, CIStatusDto.Serializer.INSTANCE, self.status);
            }
        }

        public Surrogate(ClientPlatformDto platform, String ci_event_id, EnvironmentDto environmentDto, Instant instant, String name, float f, float f2, CIStatusDto status) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(ci_event_id, "ci_event_id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(status, "status");
            this.platform = platform;
            this.ci_event_id = ci_event_id;
            this.environment = environmentDto;
            this.timestamp = instant;
            this.name = name;
            this.duration = f;
            this.wait_duration = f2;
            this.status = status;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        public /* synthetic */ Surrogate(ClientPlatformDto clientPlatformDto, String str, EnvironmentDto environmentDto, Instant instant, String str2, float f, float f2, CIStatusDto cIStatusDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : environmentDto, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? 0.0f : f, (i & 64) != 0 ? 0.0f : f2, (i & 128) != 0 ? CIStatusDto.INSTANCE.getZeroValue() : cIStatusDto);
        }

        public final String getCi_event_id() {
            return this.ci_event_id;
        }

        public final EnvironmentDto getEnvironment() {
            return this.environment;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getName() {
            return this.name;
        }

        public final float getDuration() {
            return this.duration;
        }

        public final float getWait_duration() {
            return this.wait_duration;
        }

        public final CIStatusDto getStatus() {
            return this.status;
        }
    }

    /* compiled from: ClientCIStepEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientCIStepEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ClientCIStepEventDto, ClientCIStepEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientCIStepEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientCIStepEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientCIStepEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientCIStepEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientCIStepEvent> getProtoAdapter() {
            return ClientCIStepEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientCIStepEventDto getZeroValue() {
            return ClientCIStepEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientCIStepEventDto fromProto(ClientCIStepEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ClientPlatformDto clientPlatformDtoFromProto = ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform());
            String ci_event_id = proto.getCi_event_id();
            Environment environment = proto.getEnvironment();
            return new ClientCIStepEventDto(new Surrogate(clientPlatformDtoFromProto, ci_event_id, environment != null ? EnvironmentDto.INSTANCE.fromProto(environment) : null, proto.getTimestamp(), proto.getName(), proto.getDuration(), proto.getWait_duration(), CIStatusDto.INSTANCE.fromProto(proto.getStatus())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientCIStepEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientCIStepEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientCIStepEventDto(null, null, null, null, null, 0.0f, 0.0f, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientCIStepEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientCIStepEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientCIStepEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientCIStepEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientCIStepEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientCIStepEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientCIStepEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCIStepEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientCIStepEventDto";
        }
    }
}

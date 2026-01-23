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
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.BuildLocationDto;
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

/* compiled from: ClientCacheMissEventDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00046578B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0015J[\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b0\u0010\"R\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b1\u0010\"R\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b2\u0010\"R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "task_name", "", "misses", "hits", "total_duration", "Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;", "location", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;IIILcom/robinhood/rosetta/eventlogging/BuildLocationDto;)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;IIILcom/robinhood/rosetta/eventlogging/BuildLocationDto;)Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getTask_name", "getMisses", "getHits", "getTotal_duration", "getLocation", "()Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientCacheMissEventDto implements Dto3<ClientCacheMissEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientCacheMissEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientCacheMissEventDto, ClientCacheMissEvent>> binaryBase64Serializer$delegate;
    private static final ClientCacheMissEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientCacheMissEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientCacheMissEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getTask_name() {
        return this.surrogate.getTask_name();
    }

    public final int getMisses() {
        return this.surrogate.getMisses();
    }

    public final int getHits() {
        return this.surrogate.getHits();
    }

    public final int getTotal_duration() {
        return this.surrogate.getTotal_duration();
    }

    public final BuildLocationDto getLocation() {
        return this.surrogate.getLocation();
    }

    public /* synthetic */ ClientCacheMissEventDto(ClientPlatformDto clientPlatformDto, Instant instant, String str, int i, int i2, int i3, BuildLocationDto buildLocationDto, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i4 & 2) != 0 ? null : instant, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) != 0 ? BuildLocationDto.INSTANCE.getZeroValue() : buildLocationDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientCacheMissEventDto(ClientPlatformDto platform, Instant instant, String task_name, int i, int i2, int i3, BuildLocationDto location) {
        this(new Surrogate(platform, instant, task_name, i, i2, i3, location));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(task_name, "task_name");
        Intrinsics.checkNotNullParameter(location, "location");
    }

    public static /* synthetic */ ClientCacheMissEventDto copy$default(ClientCacheMissEventDto clientCacheMissEventDto, ClientPlatformDto clientPlatformDto, Instant instant, String str, int i, int i2, int i3, BuildLocationDto buildLocationDto, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            clientPlatformDto = clientCacheMissEventDto.surrogate.getPlatform();
        }
        if ((i4 & 2) != 0) {
            instant = clientCacheMissEventDto.surrogate.getTimestamp();
        }
        if ((i4 & 4) != 0) {
            str = clientCacheMissEventDto.surrogate.getTask_name();
        }
        if ((i4 & 8) != 0) {
            i = clientCacheMissEventDto.surrogate.getMisses();
        }
        if ((i4 & 16) != 0) {
            i2 = clientCacheMissEventDto.surrogate.getHits();
        }
        if ((i4 & 32) != 0) {
            i3 = clientCacheMissEventDto.surrogate.getTotal_duration();
        }
        if ((i4 & 64) != 0) {
            buildLocationDto = clientCacheMissEventDto.surrogate.getLocation();
        }
        int i5 = i3;
        BuildLocationDto buildLocationDto2 = buildLocationDto;
        int i6 = i2;
        String str2 = str;
        return clientCacheMissEventDto.copy(clientPlatformDto, instant, str2, i, i6, i5, buildLocationDto2);
    }

    public final ClientCacheMissEventDto copy(ClientPlatformDto platform, Instant timestamp, String task_name, int misses, int hits, int total_duration, BuildLocationDto location) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(task_name, "task_name");
        Intrinsics.checkNotNullParameter(location, "location");
        return new ClientCacheMissEventDto(new Surrogate(platform, timestamp, task_name, misses, hits, total_duration, location));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientCacheMissEvent toProto() {
        return new ClientCacheMissEvent((ClientPlatform) this.surrogate.getPlatform().toProto(), this.surrogate.getTimestamp(), this.surrogate.getTask_name(), this.surrogate.getMisses(), this.surrogate.getHits(), this.surrogate.getTotal_duration(), (BuildLocation) this.surrogate.getLocation().toProto(), null, 128, null);
    }

    public String toString() {
        return "[ClientCacheMissEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientCacheMissEventDto) && Intrinsics.areEqual(((ClientCacheMissEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientCacheMissEventDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 J2\u00020\u0001:\u0002KJB \u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B[\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J6\u0010$\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b*\u0010)J\u001f\u0010+\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b+\u0010)J\u0010\u0010,\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J©\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u000f\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u0010\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b0\u0010'J\u0010\u00101\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b1\u0010)J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010#RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\b<\u00109\u001a\u0004\b;\u0010%R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010=\u0012\u0004\b?\u00109\u001a\u0004\b>\u0010'R/\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010@\u0012\u0004\bB\u00109\u001a\u0004\bA\u0010)R/\u0010\u000f\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010@\u0012\u0004\bD\u00109\u001a\u0004\bC\u0010)R/\u0010\u0010\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010@\u0012\u0004\bF\u00109\u001a\u0004\bE\u0010)R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010G\u0012\u0004\bI\u00109\u001a\u0004\bH\u0010-¨\u0006L"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "task_name", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "misses", "hits", "total_duration", "Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;", "location", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;IIILcom/robinhood/rosetta/eventlogging/BuildLocationDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;IIILcom/robinhood/rosetta/eventlogging/BuildLocationDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()Ljava/lang/String;", "component4", "()I", "component5", "component6", "component7", "()Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;IIILcom/robinhood/rosetta/eventlogging/BuildLocationDto;)Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Ljava/lang/String;", "getTask_name", "getTask_name$annotations", "I", "getMisses", "getMisses$annotations", "getHits", "getHits$annotations", "getTotal_duration", "getTotal_duration$annotations", "Lcom/robinhood/rosetta/eventlogging/BuildLocationDto;", "getLocation", "getLocation$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int hits;
        private final BuildLocationDto location;
        private final int misses;
        private final ClientPlatformDto platform;
        private final String task_name;
        private final Instant timestamp;
        private final int total_duration;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, (String) null, 0, 0, 0, (BuildLocationDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, String str, int i, int i2, int i3, BuildLocationDto buildLocationDto, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i4 & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i4 & 4) != 0) {
                str = surrogate.task_name;
            }
            if ((i4 & 8) != 0) {
                i = surrogate.misses;
            }
            if ((i4 & 16) != 0) {
                i2 = surrogate.hits;
            }
            if ((i4 & 32) != 0) {
                i3 = surrogate.total_duration;
            }
            if ((i4 & 64) != 0) {
                buildLocationDto = surrogate.location;
            }
            int i5 = i3;
            BuildLocationDto buildLocationDto2 = buildLocationDto;
            int i6 = i2;
            String str2 = str;
            return surrogate.copy(clientPlatformDto, instant, str2, i, i6, i5, buildLocationDto2);
        }

        @SerialName("hits")
        @JsonAnnotations2(names = {"hits"})
        public static /* synthetic */ void getHits$annotations() {
        }

        @SerialName("location")
        @JsonAnnotations2(names = {"location"})
        public static /* synthetic */ void getLocation$annotations() {
        }

        @SerialName("misses")
        @JsonAnnotations2(names = {"misses"})
        public static /* synthetic */ void getMisses$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("taskName")
        @JsonAnnotations2(names = {"task_name"})
        public static /* synthetic */ void getTask_name$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("totalDuration")
        @JsonAnnotations2(names = {"total_duration"})
        public static /* synthetic */ void getTotal_duration$annotations() {
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
        public final String getTask_name() {
            return this.task_name;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMisses() {
            return this.misses;
        }

        /* renamed from: component5, reason: from getter */
        public final int getHits() {
            return this.hits;
        }

        /* renamed from: component6, reason: from getter */
        public final int getTotal_duration() {
            return this.total_duration;
        }

        /* renamed from: component7, reason: from getter */
        public final BuildLocationDto getLocation() {
            return this.location;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, String task_name, int misses, int hits, int total_duration, BuildLocationDto location) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(task_name, "task_name");
            Intrinsics.checkNotNullParameter(location, "location");
            return new Surrogate(platform, timestamp, task_name, misses, hits, total_duration, location);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.task_name, surrogate.task_name) && this.misses == surrogate.misses && this.hits == surrogate.hits && this.total_duration == surrogate.total_duration && this.location == surrogate.location;
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.task_name.hashCode()) * 31) + Integer.hashCode(this.misses)) * 31) + Integer.hashCode(this.hits)) * 31) + Integer.hashCode(this.total_duration)) * 31) + this.location.hashCode();
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", task_name=" + this.task_name + ", misses=" + this.misses + ", hits=" + this.hits + ", total_duration=" + this.total_duration + ", location=" + this.location + ")";
        }

        /* compiled from: ClientCacheMissEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientCacheMissEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, String str, int i2, int i3, int i4, BuildLocationDto buildLocationDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.task_name = "";
            } else {
                this.task_name = str;
            }
            if ((i & 8) == 0) {
                this.misses = 0;
            } else {
                this.misses = i2;
            }
            if ((i & 16) == 0) {
                this.hits = 0;
            } else {
                this.hits = i3;
            }
            if ((i & 32) == 0) {
                this.total_duration = 0;
            } else {
                this.total_duration = i4;
            }
            if ((i & 64) == 0) {
                this.location = BuildLocationDto.INSTANCE.getZeroValue();
            } else {
                this.location = buildLocationDto;
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
            if (!Intrinsics.areEqual(self.task_name, "")) {
                output.encodeStringElement(serialDesc, 2, self.task_name);
            }
            int i = self.misses;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.hits;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            int i3 = self.total_duration;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
            if (self.location != BuildLocationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, BuildLocationDto.Serializer.INSTANCE, self.location);
            }
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, String task_name, int i, int i2, int i3, BuildLocationDto location) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(task_name, "task_name");
            Intrinsics.checkNotNullParameter(location, "location");
            this.platform = platform;
            this.timestamp = instant;
            this.task_name = task_name;
            this.misses = i;
            this.hits = i2;
            this.total_duration = i3;
            this.location = location;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        public /* synthetic */ Surrogate(ClientPlatformDto clientPlatformDto, Instant instant, String str, int i, int i2, int i3, BuildLocationDto buildLocationDto, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i4 & 2) != 0 ? null : instant, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) != 0 ? BuildLocationDto.INSTANCE.getZeroValue() : buildLocationDto);
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getTask_name() {
            return this.task_name;
        }

        public final int getMisses() {
            return this.misses;
        }

        public final int getHits() {
            return this.hits;
        }

        public final int getTotal_duration() {
            return this.total_duration;
        }

        public final BuildLocationDto getLocation() {
            return this.location;
        }
    }

    /* compiled from: ClientCacheMissEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClientCacheMissEventDto, ClientCacheMissEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientCacheMissEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientCacheMissEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientCacheMissEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientCacheMissEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientCacheMissEvent> getProtoAdapter() {
            return ClientCacheMissEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientCacheMissEventDto getZeroValue() {
            return ClientCacheMissEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientCacheMissEventDto fromProto(ClientCacheMissEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClientCacheMissEventDto(new Surrogate(ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform()), proto.getTimestamp(), proto.getTask_name(), proto.getMisses(), proto.getHits(), proto.getTotal_duration(), BuildLocationDto.INSTANCE.fromProto(proto.getLocation())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientCacheMissEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientCacheMissEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientCacheMissEventDto(null, null, null, 0, 0, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientCacheMissEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientCacheMissEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientCacheMissEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientCacheMissEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientCacheMissEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientCacheMissEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientCacheMissEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCacheMissEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientCacheMissEventDto";
        }
    }
}

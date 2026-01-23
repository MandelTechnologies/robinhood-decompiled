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
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.ClientAppDto;
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

/* compiled from: ClientBinaryEventDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004879:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0015J[\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b3\u00102R\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientBinaryEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "version", "", "download_size_in_mb", "install_size_in_mb", "device_type", "Lcom/robinhood/rosetta/eventlogging/ClientAppDto;", "app", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;DDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientAppDto;)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;DDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientAppDto;)Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientBinaryEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getVersion", "getDownload_size_in_mb", "()D", "getInstall_size_in_mb", "getDevice_type", "getApp", "()Lcom/robinhood/rosetta/eventlogging/ClientAppDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientBinaryEventDto implements Dto3<ClientBinaryEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientBinaryEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientBinaryEventDto, ClientBinaryEvent>> binaryBase64Serializer$delegate;
    private static final ClientBinaryEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientBinaryEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientBinaryEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getVersion() {
        return this.surrogate.getVersion();
    }

    public final double getDownload_size_in_mb() {
        return this.surrogate.getDownload_size_in_mb();
    }

    public final double getInstall_size_in_mb() {
        return this.surrogate.getInstall_size_in_mb();
    }

    public final String getDevice_type() {
        return this.surrogate.getDevice_type();
    }

    public final ClientAppDto getApp() {
        return this.surrogate.getApp();
    }

    public /* synthetic */ ClientBinaryEventDto(ClientPlatformDto clientPlatformDto, Instant instant, String str, double d, double d2, String str2, ClientAppDto clientAppDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? 0.0d : d2, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? ClientAppDto.INSTANCE.getZeroValue() : clientAppDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientBinaryEventDto(ClientPlatformDto platform, Instant instant, String version, double d, double d2, String device_type, ClientAppDto app) {
        this(new Surrogate(platform, instant, version, d, d2, device_type, app));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(device_type, "device_type");
        Intrinsics.checkNotNullParameter(app, "app");
    }

    public static /* synthetic */ ClientBinaryEventDto copy$default(ClientBinaryEventDto clientBinaryEventDto, ClientPlatformDto clientPlatformDto, Instant instant, String str, double d, double d2, String str2, ClientAppDto clientAppDto, int i, Object obj) {
        if ((i & 1) != 0) {
            clientPlatformDto = clientBinaryEventDto.surrogate.getPlatform();
        }
        if ((i & 2) != 0) {
            instant = clientBinaryEventDto.surrogate.getTimestamp();
        }
        if ((i & 4) != 0) {
            str = clientBinaryEventDto.surrogate.getVersion();
        }
        if ((i & 8) != 0) {
            d = clientBinaryEventDto.surrogate.getDownload_size_in_mb();
        }
        if ((i & 16) != 0) {
            d2 = clientBinaryEventDto.surrogate.getInstall_size_in_mb();
        }
        if ((i & 32) != 0) {
            str2 = clientBinaryEventDto.surrogate.getDevice_type();
        }
        if ((i & 64) != 0) {
            clientAppDto = clientBinaryEventDto.surrogate.getApp();
        }
        double d3 = d2;
        double d4 = d;
        String str3 = str;
        return clientBinaryEventDto.copy(clientPlatformDto, instant, str3, d4, d3, str2, clientAppDto);
    }

    public final ClientBinaryEventDto copy(ClientPlatformDto platform, Instant timestamp, String version, double download_size_in_mb, double install_size_in_mb, String device_type, ClientAppDto app) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(device_type, "device_type");
        Intrinsics.checkNotNullParameter(app, "app");
        return new ClientBinaryEventDto(new Surrogate(platform, timestamp, version, download_size_in_mb, install_size_in_mb, device_type, app));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientBinaryEvent toProto() {
        return new ClientBinaryEvent((ClientPlatform) this.surrogate.getPlatform().toProto(), this.surrogate.getTimestamp(), this.surrogate.getVersion(), this.surrogate.getDownload_size_in_mb(), this.surrogate.getInstall_size_in_mb(), this.surrogate.getDevice_type(), (ClientApp) this.surrogate.getApp().toProto(), null, 128, null);
    }

    public String toString() {
        return "[ClientBinaryEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientBinaryEventDto) && Intrinsics.areEqual(((ClientBinaryEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientBinaryEventDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 L2\u00020\u0001:\u0002MLB\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B]\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J6\u0010%\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010(J\u0010\u0010-\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u009a\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u000f\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b1\u0010(J\u0010\u00102\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010$RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\b>\u0010;\u001a\u0004\b=\u0010&R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010?\u0012\u0004\bA\u0010;\u001a\u0004\b@\u0010(R/\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010B\u0012\u0004\bD\u0010;\u001a\u0004\bC\u0010*R/\u0010\u000f\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010B\u0012\u0004\bF\u0010;\u001a\u0004\bE\u0010*R \u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010?\u0012\u0004\bH\u0010;\u001a\u0004\bG\u0010(R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010I\u0012\u0004\bK\u0010;\u001a\u0004\bJ\u0010.¨\u0006N"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "version", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "download_size_in_mb", "install_size_in_mb", "device_type", "Lcom/robinhood/rosetta/eventlogging/ClientAppDto;", "app", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;DDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientAppDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;DDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientAppDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()Ljava/lang/String;", "component4", "()D", "component5", "component6", "component7", "()Lcom/robinhood/rosetta/eventlogging/ClientAppDto;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;DDLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientAppDto;)Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Ljava/lang/String;", "getVersion", "getVersion$annotations", "D", "getDownload_size_in_mb", "getDownload_size_in_mb$annotations", "getInstall_size_in_mb", "getInstall_size_in_mb$annotations", "getDevice_type", "getDevice_type$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientAppDto;", "getApp", "getApp$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ClientAppDto app;
        private final String device_type;
        private final double download_size_in_mb;
        private final double install_size_in_mb;
        private final ClientPlatformDto platform;
        private final Instant timestamp;
        private final String version;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, (String) null, 0.0d, 0.0d, (String) null, (ClientAppDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, String str, double d, double d2, String str2, ClientAppDto clientAppDto, int i, Object obj) {
            if ((i & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 4) != 0) {
                str = surrogate.version;
            }
            if ((i & 8) != 0) {
                d = surrogate.download_size_in_mb;
            }
            if ((i & 16) != 0) {
                d2 = surrogate.install_size_in_mb;
            }
            if ((i & 32) != 0) {
                str2 = surrogate.device_type;
            }
            if ((i & 64) != 0) {
                clientAppDto = surrogate.app;
            }
            double d3 = d2;
            double d4 = d;
            String str3 = str;
            return surrogate.copy(clientPlatformDto, instant, str3, d4, d3, str2, clientAppDto);
        }

        @SerialName("app")
        @JsonAnnotations2(names = {"app"})
        public static /* synthetic */ void getApp$annotations() {
        }

        @SerialName("deviceType")
        @JsonAnnotations2(names = {"device_type"})
        public static /* synthetic */ void getDevice_type$annotations() {
        }

        @SerialName("downloadSizeInMb")
        @JsonAnnotations2(names = {"download_size_in_mb"})
        public static /* synthetic */ void getDownload_size_in_mb$annotations() {
        }

        @SerialName("installSizeInMb")
        @JsonAnnotations2(names = {"install_size_in_mb"})
        public static /* synthetic */ void getInstall_size_in_mb$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("version")
        @JsonAnnotations2(names = {"version"})
        public static /* synthetic */ void getVersion$annotations() {
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
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component4, reason: from getter */
        public final double getDownload_size_in_mb() {
            return this.download_size_in_mb;
        }

        /* renamed from: component5, reason: from getter */
        public final double getInstall_size_in_mb() {
            return this.install_size_in_mb;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDevice_type() {
            return this.device_type;
        }

        /* renamed from: component7, reason: from getter */
        public final ClientAppDto getApp() {
            return this.app;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, String version, double download_size_in_mb, double install_size_in_mb, String device_type, ClientAppDto app) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(device_type, "device_type");
            Intrinsics.checkNotNullParameter(app, "app");
            return new Surrogate(platform, timestamp, version, download_size_in_mb, install_size_in_mb, device_type, app);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.version, surrogate.version) && Double.compare(this.download_size_in_mb, surrogate.download_size_in_mb) == 0 && Double.compare(this.install_size_in_mb, surrogate.install_size_in_mb) == 0 && Intrinsics.areEqual(this.device_type, surrogate.device_type) && this.app == surrogate.app;
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.version.hashCode()) * 31) + Double.hashCode(this.download_size_in_mb)) * 31) + Double.hashCode(this.install_size_in_mb)) * 31) + this.device_type.hashCode()) * 31) + this.app.hashCode();
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", version=" + this.version + ", download_size_in_mb=" + this.download_size_in_mb + ", install_size_in_mb=" + this.install_size_in_mb + ", device_type=" + this.device_type + ", app=" + this.app + ")";
        }

        /* compiled from: ClientBinaryEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientBinaryEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, String str, double d, double d2, String str2, ClientAppDto clientAppDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.version = "";
            } else {
                this.version = str;
            }
            if ((i & 8) == 0) {
                this.download_size_in_mb = 0.0d;
            } else {
                this.download_size_in_mb = d;
            }
            if ((i & 16) == 0) {
                this.install_size_in_mb = 0.0d;
            } else {
                this.install_size_in_mb = d2;
            }
            if ((i & 32) == 0) {
                this.device_type = "";
            } else {
                this.device_type = str2;
            }
            if ((i & 64) == 0) {
                this.app = ClientAppDto.INSTANCE.getZeroValue();
            } else {
                this.app = clientAppDto;
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
            if (!Intrinsics.areEqual(self.version, "")) {
                output.encodeStringElement(serialDesc, 2, self.version);
            }
            if (Double.compare(self.download_size_in_mb, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.download_size_in_mb));
            }
            if (Double.compare(self.install_size_in_mb, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 4, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.install_size_in_mb));
            }
            if (!Intrinsics.areEqual(self.device_type, "")) {
                output.encodeStringElement(serialDesc, 5, self.device_type);
            }
            if (self.app != ClientAppDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, ClientAppDto.Serializer.INSTANCE, self.app);
            }
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, String version, double d, double d2, String device_type, ClientAppDto app) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(device_type, "device_type");
            Intrinsics.checkNotNullParameter(app, "app");
            this.platform = platform;
            this.timestamp = instant;
            this.version = version;
            this.download_size_in_mb = d;
            this.install_size_in_mb = d2;
            this.device_type = device_type;
            this.app = app;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        public /* synthetic */ Surrogate(ClientPlatformDto clientPlatformDto, Instant instant, String str, double d, double d2, String str2, ClientAppDto clientAppDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? 0.0d : d2, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? ClientAppDto.INSTANCE.getZeroValue() : clientAppDto);
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getVersion() {
            return this.version;
        }

        public final double getDownload_size_in_mb() {
            return this.download_size_in_mb;
        }

        public final double getInstall_size_in_mb() {
            return this.install_size_in_mb;
        }

        public final String getDevice_type() {
            return this.device_type;
        }

        public final ClientAppDto getApp() {
            return this.app;
        }
    }

    /* compiled from: ClientBinaryEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientBinaryEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClientBinaryEventDto, ClientBinaryEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientBinaryEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientBinaryEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientBinaryEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientBinaryEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientBinaryEvent> getProtoAdapter() {
            return ClientBinaryEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientBinaryEventDto getZeroValue() {
            return ClientBinaryEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientBinaryEventDto fromProto(ClientBinaryEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClientBinaryEventDto(new Surrogate(ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform()), proto.getTimestamp(), proto.getVersion(), proto.getDownload_size_in_mb(), proto.getInstall_size_in_mb(), proto.getDevice_type(), ClientAppDto.INSTANCE.fromProto(proto.getApp())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientBinaryEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientBinaryEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientBinaryEventDto(null, null, null, 0.0d, 0.0d, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientBinaryEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientBinaryEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientBinaryEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientBinaryEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientBinaryEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientBinaryEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientBinaryEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBinaryEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientBinaryEventDto";
        }
    }
}

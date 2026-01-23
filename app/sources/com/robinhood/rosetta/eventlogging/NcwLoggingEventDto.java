package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.UnsignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.ApplicationDto;
import com.robinhood.rosetta.eventlogging.AuthenticationDto;
import com.robinhood.rosetta.eventlogging.DeviceDto;
import com.robinhood.rosetta.eventlogging.GeoIPDto;
import com.robinhood.rosetta.eventlogging.NcwAppEventDto;
import com.robinhood.rosetta.eventlogging.NetworkConnectionDto;
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

/* compiled from: NcwLoggingEventDto.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004?@ABB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u008b\u0001\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u001cJ\u0088\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000fJ\b\u00102\u001a\u00020\u0002H\u0016J\b\u00103\u001a\u00020\u000fH\u0016J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\b\u00108\u001a\u00020\u0017H\u0016J\u0018\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0017H\u0016J\b\u0010>\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u001a\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b/\u0010$R\u0011\u0010\u001b\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b0\u0010$¨\u0006C"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwLoggingEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/NcwLoggingEvent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/NcwLoggingEventDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NcwLoggingEventDto$Surrogate;)V", "device", "Lcom/robinhood/rosetta/eventlogging/DeviceDto;", "app", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto;", "event", "Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto;", "timestamp", "", "client_ip", "event_hash", "geoip", "Lcom/robinhood/rosetta/eventlogging/GeoIPDto;", "authenticated", "Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;", "created_at", "", "network_connection", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;", "veritas_device_id", "wallet_id", "(Lcom/robinhood/rosetta/eventlogging/DeviceDto;Lcom/robinhood/rosetta/eventlogging/ApplicationDto;Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/GeoIPDto;Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;ILcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;Ljava/lang/String;Ljava/lang/String;)V", "getDevice", "()Lcom/robinhood/rosetta/eventlogging/DeviceDto;", "getApp", "()Lcom/robinhood/rosetta/eventlogging/ApplicationDto;", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto;", "getTimestamp", "()Ljava/lang/String;", "getClient_ip", "getEvent_hash", "getGeoip", "()Lcom/robinhood/rosetta/eventlogging/GeoIPDto;", "getAuthenticated", "()Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;", "getCreated_at", "()I", "getNetwork_connection", "()Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;", "getVeritas_device_id", "getWallet_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class NcwLoggingEventDto implements Dto3<NcwLoggingEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NcwLoggingEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NcwLoggingEventDto, NcwLoggingEvent>> binaryBase64Serializer$delegate;
    private static final NcwLoggingEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NcwLoggingEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NcwLoggingEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DeviceDto getDevice() {
        return this.surrogate.getDevice();
    }

    public final ApplicationDto getApp() {
        return this.surrogate.getApp();
    }

    public final NcwAppEventDto getEvent() {
        return this.surrogate.getEvent();
    }

    public final String getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getClient_ip() {
        return this.surrogate.getClient_ip();
    }

    public final String getEvent_hash() {
        return this.surrogate.getEvent_hash();
    }

    public final GeoIPDto getGeoip() {
        return this.surrogate.getGeoip();
    }

    public final AuthenticationDto getAuthenticated() {
        return this.surrogate.getAuthenticated();
    }

    public final int getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final NetworkConnectionDto getNetwork_connection() {
        return this.surrogate.getNetwork_connection();
    }

    public final String getVeritas_device_id() {
        return this.surrogate.getVeritas_device_id();
    }

    public final String getWallet_id() {
        return this.surrogate.getWallet_id();
    }

    public /* synthetic */ NcwLoggingEventDto(DeviceDto deviceDto, ApplicationDto applicationDto, NcwAppEventDto ncwAppEventDto, String str, String str2, String str3, GeoIPDto geoIPDto, AuthenticationDto authenticationDto, int i, NetworkConnectionDto networkConnectionDto, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : deviceDto, (i2 & 2) != 0 ? null : applicationDto, (i2 & 4) != 0 ? null : ncwAppEventDto, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? null : geoIPDto, (i2 & 128) != 0 ? AuthenticationDto.INSTANCE.getZeroValue() : authenticationDto, (i2 & 256) != 0 ? 0 : i, (i2 & 512) == 0 ? networkConnectionDto : null, (i2 & 1024) != 0 ? "" : str4, (i2 & 2048) != 0 ? "" : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NcwLoggingEventDto(DeviceDto deviceDto, ApplicationDto applicationDto, NcwAppEventDto ncwAppEventDto, String timestamp, String client_ip, String event_hash, GeoIPDto geoIPDto, AuthenticationDto authenticated, int i, NetworkConnectionDto networkConnectionDto, String veritas_device_id, String wallet_id) {
        this(new Surrogate(deviceDto, applicationDto, ncwAppEventDto, timestamp, client_ip, event_hash, geoIPDto, authenticated, i, networkConnectionDto, veritas_device_id, wallet_id));
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(client_ip, "client_ip");
        Intrinsics.checkNotNullParameter(event_hash, "event_hash");
        Intrinsics.checkNotNullParameter(authenticated, "authenticated");
        Intrinsics.checkNotNullParameter(veritas_device_id, "veritas_device_id");
        Intrinsics.checkNotNullParameter(wallet_id, "wallet_id");
    }

    public static /* synthetic */ NcwLoggingEventDto copy$default(NcwLoggingEventDto ncwLoggingEventDto, DeviceDto deviceDto, ApplicationDto applicationDto, NcwAppEventDto ncwAppEventDto, String str, String str2, String str3, GeoIPDto geoIPDto, AuthenticationDto authenticationDto, int i, NetworkConnectionDto networkConnectionDto, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            deviceDto = ncwLoggingEventDto.surrogate.getDevice();
        }
        if ((i2 & 2) != 0) {
            applicationDto = ncwLoggingEventDto.surrogate.getApp();
        }
        if ((i2 & 4) != 0) {
            ncwAppEventDto = ncwLoggingEventDto.surrogate.getEvent();
        }
        if ((i2 & 8) != 0) {
            str = ncwLoggingEventDto.surrogate.getTimestamp();
        }
        if ((i2 & 16) != 0) {
            str2 = ncwLoggingEventDto.surrogate.getClient_ip();
        }
        if ((i2 & 32) != 0) {
            str3 = ncwLoggingEventDto.surrogate.getEvent_hash();
        }
        if ((i2 & 64) != 0) {
            geoIPDto = ncwLoggingEventDto.surrogate.getGeoip();
        }
        if ((i2 & 128) != 0) {
            authenticationDto = ncwLoggingEventDto.surrogate.getAuthenticated();
        }
        if ((i2 & 256) != 0) {
            i = ncwLoggingEventDto.surrogate.getCreated_at();
        }
        if ((i2 & 512) != 0) {
            networkConnectionDto = ncwLoggingEventDto.surrogate.getNetwork_connection();
        }
        if ((i2 & 1024) != 0) {
            str4 = ncwLoggingEventDto.surrogate.getVeritas_device_id();
        }
        if ((i2 & 2048) != 0) {
            str5 = ncwLoggingEventDto.surrogate.getWallet_id();
        }
        String str6 = str4;
        String str7 = str5;
        int i3 = i;
        NetworkConnectionDto networkConnectionDto2 = networkConnectionDto;
        GeoIPDto geoIPDto2 = geoIPDto;
        AuthenticationDto authenticationDto2 = authenticationDto;
        String str8 = str2;
        String str9 = str3;
        return ncwLoggingEventDto.copy(deviceDto, applicationDto, ncwAppEventDto, str, str8, str9, geoIPDto2, authenticationDto2, i3, networkConnectionDto2, str6, str7);
    }

    public final NcwLoggingEventDto copy(DeviceDto device, ApplicationDto app, NcwAppEventDto event, String timestamp, String client_ip, String event_hash, GeoIPDto geoip, AuthenticationDto authenticated, int created_at, NetworkConnectionDto network_connection, String veritas_device_id, String wallet_id) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(client_ip, "client_ip");
        Intrinsics.checkNotNullParameter(event_hash, "event_hash");
        Intrinsics.checkNotNullParameter(authenticated, "authenticated");
        Intrinsics.checkNotNullParameter(veritas_device_id, "veritas_device_id");
        Intrinsics.checkNotNullParameter(wallet_id, "wallet_id");
        return new NcwLoggingEventDto(new Surrogate(device, app, event, timestamp, client_ip, event_hash, geoip, authenticated, created_at, network_connection, veritas_device_id, wallet_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public NcwLoggingEvent toProto() {
        DeviceDto device = this.surrogate.getDevice();
        Device proto = device != null ? device.toProto() : null;
        ApplicationDto app = this.surrogate.getApp();
        Application proto2 = app != null ? app.toProto() : null;
        NcwAppEventDto event = this.surrogate.getEvent();
        NcwAppEvent proto3 = event != null ? event.toProto() : null;
        String timestamp = this.surrogate.getTimestamp();
        String client_ip = this.surrogate.getClient_ip();
        String event_hash = this.surrogate.getEvent_hash();
        GeoIPDto geoip = this.surrogate.getGeoip();
        GeoIP proto4 = geoip != null ? geoip.toProto() : null;
        Authentication authentication = (Authentication) this.surrogate.getAuthenticated().toProto();
        int created_at = this.surrogate.getCreated_at();
        NetworkConnectionDto network_connection = this.surrogate.getNetwork_connection();
        return new NcwLoggingEvent(proto, proto2, proto3, timestamp, client_ip, event_hash, proto4, authentication, created_at, network_connection != null ? network_connection.toProto() : null, this.surrogate.getVeritas_device_id(), this.surrogate.getWallet_id(), null, 4096, null);
    }

    public String toString() {
        return "[NcwLoggingEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NcwLoggingEventDto) && Intrinsics.areEqual(((NcwLoggingEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: NcwLoggingEventDto.kt */
    @Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 [2\u00020\u0001:\u0002Z[B\u0098\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aB\u0091\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001eJ\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010C\u001a\u00020\tHÆ\u0003J\t\u0010D\u001a\u00020\tHÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010G\u001a\u00020\u000fHÆ\u0003J\u0018\u0010H\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010J\u001a\u00020\tHÆ\u0003J\t\u0010K\u001a\u00020\tHÆ\u0003J\u009a\u0001\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\b\u0002\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\tHÆ\u0001J\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020\u0011HÖ\u0001J\t\u0010Q\u001a\u00020\tHÖ\u0001J%\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u00002\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0001¢\u0006\u0002\bYR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010 \u001a\u0004\b$\u0010%R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010 \u001a\u0004\b'\u0010(R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010 \u001a\u0004\b*\u0010+R\u001c\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010 \u001a\u0004\b-\u0010+R\u001c\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010 \u001a\u0004\b/\u0010+R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010 \u001a\u0004\b1\u00102R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010 \u001a\u0004\b4\u00105R+\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010 \u001a\u0004\b7\u00108R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010 \u001a\u0004\b:\u0010;R\u001c\u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010 \u001a\u0004\b=\u0010+R\u001c\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010 \u001a\u0004\b?\u0010+¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwLoggingEventDto$Surrogate;", "", "device", "Lcom/robinhood/rosetta/eventlogging/DeviceDto;", "app", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto;", "event", "Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto;", "timestamp", "", "client_ip", "event_hash", "geoip", "Lcom/robinhood/rosetta/eventlogging/GeoIPDto;", "authenticated", "Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;", "created_at", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/UInt32Serializer;", "network_connection", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;", "veritas_device_id", "wallet_id", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceDto;Lcom/robinhood/rosetta/eventlogging/ApplicationDto;Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/GeoIPDto;Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;ILcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/DeviceDto;Lcom/robinhood/rosetta/eventlogging/ApplicationDto;Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/GeoIPDto;Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;ILcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDevice$annotations", "()V", "getDevice", "()Lcom/robinhood/rosetta/eventlogging/DeviceDto;", "getApp$annotations", "getApp", "()Lcom/robinhood/rosetta/eventlogging/ApplicationDto;", "getEvent$annotations", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto;", "getTimestamp$annotations", "getTimestamp", "()Ljava/lang/String;", "getClient_ip$annotations", "getClient_ip", "getEvent_hash$annotations", "getEvent_hash", "getGeoip$annotations", "getGeoip", "()Lcom/robinhood/rosetta/eventlogging/GeoIPDto;", "getAuthenticated$annotations", "getAuthenticated", "()Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;", "getCreated_at$annotations", "getCreated_at", "()I", "getNetwork_connection$annotations", "getNetwork_connection", "()Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;", "getVeritas_device_id$annotations", "getVeritas_device_id", "getWallet_id$annotations", "getWallet_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ApplicationDto app;
        private final AuthenticationDto authenticated;
        private final String client_ip;
        private final int created_at;
        private final DeviceDto device;
        private final NcwAppEventDto event;
        private final String event_hash;
        private final GeoIPDto geoip;
        private final NetworkConnectionDto network_connection;
        private final String timestamp;
        private final String veritas_device_id;
        private final String wallet_id;

        public Surrogate() {
            this((DeviceDto) null, (ApplicationDto) null, (NcwAppEventDto) null, (String) null, (String) null, (String) null, (GeoIPDto) null, (AuthenticationDto) null, 0, (NetworkConnectionDto) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, DeviceDto deviceDto, ApplicationDto applicationDto, NcwAppEventDto ncwAppEventDto, String str, String str2, String str3, GeoIPDto geoIPDto, AuthenticationDto authenticationDto, int i, NetworkConnectionDto networkConnectionDto, String str4, String str5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                deviceDto = surrogate.device;
            }
            if ((i2 & 2) != 0) {
                applicationDto = surrogate.app;
            }
            if ((i2 & 4) != 0) {
                ncwAppEventDto = surrogate.event;
            }
            if ((i2 & 8) != 0) {
                str = surrogate.timestamp;
            }
            if ((i2 & 16) != 0) {
                str2 = surrogate.client_ip;
            }
            if ((i2 & 32) != 0) {
                str3 = surrogate.event_hash;
            }
            if ((i2 & 64) != 0) {
                geoIPDto = surrogate.geoip;
            }
            if ((i2 & 128) != 0) {
                authenticationDto = surrogate.authenticated;
            }
            if ((i2 & 256) != 0) {
                i = surrogate.created_at;
            }
            if ((i2 & 512) != 0) {
                networkConnectionDto = surrogate.network_connection;
            }
            if ((i2 & 1024) != 0) {
                str4 = surrogate.veritas_device_id;
            }
            if ((i2 & 2048) != 0) {
                str5 = surrogate.wallet_id;
            }
            String str6 = str4;
            String str7 = str5;
            int i3 = i;
            NetworkConnectionDto networkConnectionDto2 = networkConnectionDto;
            GeoIPDto geoIPDto2 = geoIPDto;
            AuthenticationDto authenticationDto2 = authenticationDto;
            String str8 = str2;
            String str9 = str3;
            return surrogate.copy(deviceDto, applicationDto, ncwAppEventDto, str, str8, str9, geoIPDto2, authenticationDto2, i3, networkConnectionDto2, str6, str7);
        }

        @SerialName("app")
        @JsonAnnotations2(names = {"app"})
        public static /* synthetic */ void getApp$annotations() {
        }

        @SerialName("authenticated")
        @JsonAnnotations2(names = {"authenticated"})
        public static /* synthetic */ void getAuthenticated$annotations() {
        }

        @SerialName("clientIp")
        @JsonAnnotations2(names = {"client_ip"})
        public static /* synthetic */ void getClient_ip$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("device")
        @JsonAnnotations2(names = {"device"})
        public static /* synthetic */ void getDevice$annotations() {
        }

        @SerialName("event")
        @JsonAnnotations2(names = {"event"})
        public static /* synthetic */ void getEvent$annotations() {
        }

        @SerialName("eventHash")
        @JsonAnnotations2(names = {"event_hash"})
        public static /* synthetic */ void getEvent_hash$annotations() {
        }

        @SerialName("geoip")
        @JsonAnnotations2(names = {"geoip"})
        public static /* synthetic */ void getGeoip$annotations() {
        }

        @SerialName("networkConnection")
        @JsonAnnotations2(names = {"network_connection"})
        public static /* synthetic */ void getNetwork_connection$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("veritasDeviceId")
        @JsonAnnotations2(names = {"veritas_device_id"})
        public static /* synthetic */ void getVeritas_device_id$annotations() {
        }

        @SerialName("walletId")
        @JsonAnnotations2(names = {"wallet_id"})
        public static /* synthetic */ void getWallet_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final DeviceDto getDevice() {
            return this.device;
        }

        /* renamed from: component10, reason: from getter */
        public final NetworkConnectionDto getNetwork_connection() {
            return this.network_connection;
        }

        /* renamed from: component11, reason: from getter */
        public final String getVeritas_device_id() {
            return this.veritas_device_id;
        }

        /* renamed from: component12, reason: from getter */
        public final String getWallet_id() {
            return this.wallet_id;
        }

        /* renamed from: component2, reason: from getter */
        public final ApplicationDto getApp() {
            return this.app;
        }

        /* renamed from: component3, reason: from getter */
        public final NcwAppEventDto getEvent() {
            return this.event;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component5, reason: from getter */
        public final String getClient_ip() {
            return this.client_ip;
        }

        /* renamed from: component6, reason: from getter */
        public final String getEvent_hash() {
            return this.event_hash;
        }

        /* renamed from: component7, reason: from getter */
        public final GeoIPDto getGeoip() {
            return this.geoip;
        }

        /* renamed from: component8, reason: from getter */
        public final AuthenticationDto getAuthenticated() {
            return this.authenticated;
        }

        /* renamed from: component9, reason: from getter */
        public final int getCreated_at() {
            return this.created_at;
        }

        public final Surrogate copy(DeviceDto device, ApplicationDto app, NcwAppEventDto event, String timestamp, String client_ip, String event_hash, GeoIPDto geoip, AuthenticationDto authenticated, int created_at, NetworkConnectionDto network_connection, String veritas_device_id, String wallet_id) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(client_ip, "client_ip");
            Intrinsics.checkNotNullParameter(event_hash, "event_hash");
            Intrinsics.checkNotNullParameter(authenticated, "authenticated");
            Intrinsics.checkNotNullParameter(veritas_device_id, "veritas_device_id");
            Intrinsics.checkNotNullParameter(wallet_id, "wallet_id");
            return new Surrogate(device, app, event, timestamp, client_ip, event_hash, geoip, authenticated, created_at, network_connection, veritas_device_id, wallet_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.device, surrogate.device) && Intrinsics.areEqual(this.app, surrogate.app) && Intrinsics.areEqual(this.event, surrogate.event) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.client_ip, surrogate.client_ip) && Intrinsics.areEqual(this.event_hash, surrogate.event_hash) && Intrinsics.areEqual(this.geoip, surrogate.geoip) && this.authenticated == surrogate.authenticated && this.created_at == surrogate.created_at && Intrinsics.areEqual(this.network_connection, surrogate.network_connection) && Intrinsics.areEqual(this.veritas_device_id, surrogate.veritas_device_id) && Intrinsics.areEqual(this.wallet_id, surrogate.wallet_id);
        }

        public int hashCode() {
            DeviceDto deviceDto = this.device;
            int iHashCode = (deviceDto == null ? 0 : deviceDto.hashCode()) * 31;
            ApplicationDto applicationDto = this.app;
            int iHashCode2 = (iHashCode + (applicationDto == null ? 0 : applicationDto.hashCode())) * 31;
            NcwAppEventDto ncwAppEventDto = this.event;
            int iHashCode3 = (((((((iHashCode2 + (ncwAppEventDto == null ? 0 : ncwAppEventDto.hashCode())) * 31) + this.timestamp.hashCode()) * 31) + this.client_ip.hashCode()) * 31) + this.event_hash.hashCode()) * 31;
            GeoIPDto geoIPDto = this.geoip;
            int iHashCode4 = (((((iHashCode3 + (geoIPDto == null ? 0 : geoIPDto.hashCode())) * 31) + this.authenticated.hashCode()) * 31) + Integer.hashCode(this.created_at)) * 31;
            NetworkConnectionDto networkConnectionDto = this.network_connection;
            return ((((iHashCode4 + (networkConnectionDto != null ? networkConnectionDto.hashCode() : 0)) * 31) + this.veritas_device_id.hashCode()) * 31) + this.wallet_id.hashCode();
        }

        public String toString() {
            return "Surrogate(device=" + this.device + ", app=" + this.app + ", event=" + this.event + ", timestamp=" + this.timestamp + ", client_ip=" + this.client_ip + ", event_hash=" + this.event_hash + ", geoip=" + this.geoip + ", authenticated=" + this.authenticated + ", created_at=" + this.created_at + ", network_connection=" + this.network_connection + ", veritas_device_id=" + this.veritas_device_id + ", wallet_id=" + this.wallet_id + ")";
        }

        /* compiled from: NcwLoggingEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwLoggingEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwLoggingEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NcwLoggingEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DeviceDto deviceDto, ApplicationDto applicationDto, NcwAppEventDto ncwAppEventDto, String str, String str2, String str3, GeoIPDto geoIPDto, AuthenticationDto authenticationDto, int i2, NetworkConnectionDto networkConnectionDto, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.device = null;
            } else {
                this.device = deviceDto;
            }
            if ((i & 2) == 0) {
                this.app = null;
            } else {
                this.app = applicationDto;
            }
            if ((i & 4) == 0) {
                this.event = null;
            } else {
                this.event = ncwAppEventDto;
            }
            if ((i & 8) == 0) {
                this.timestamp = "";
            } else {
                this.timestamp = str;
            }
            if ((i & 16) == 0) {
                this.client_ip = "";
            } else {
                this.client_ip = str2;
            }
            if ((i & 32) == 0) {
                this.event_hash = "";
            } else {
                this.event_hash = str3;
            }
            if ((i & 64) == 0) {
                this.geoip = null;
            } else {
                this.geoip = geoIPDto;
            }
            if ((i & 128) == 0) {
                this.authenticated = AuthenticationDto.INSTANCE.getZeroValue();
            } else {
                this.authenticated = authenticationDto;
            }
            if ((i & 256) == 0) {
                this.created_at = 0;
            } else {
                this.created_at = i2;
            }
            if ((i & 512) == 0) {
                this.network_connection = null;
            } else {
                this.network_connection = networkConnectionDto;
            }
            if ((i & 1024) == 0) {
                this.veritas_device_id = "";
            } else {
                this.veritas_device_id = str4;
            }
            if ((i & 2048) == 0) {
                this.wallet_id = "";
            } else {
                this.wallet_id = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            DeviceDto deviceDto = self.device;
            if (deviceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DeviceDto.Serializer.INSTANCE, deviceDto);
            }
            ApplicationDto applicationDto = self.app;
            if (applicationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ApplicationDto.Serializer.INSTANCE, applicationDto);
            }
            NcwAppEventDto ncwAppEventDto = self.event;
            if (ncwAppEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, NcwAppEventDto.Serializer.INSTANCE, ncwAppEventDto);
            }
            if (!Intrinsics.areEqual(self.timestamp, "")) {
                output.encodeStringElement(serialDesc, 3, self.timestamp);
            }
            if (!Intrinsics.areEqual(self.client_ip, "")) {
                output.encodeStringElement(serialDesc, 4, self.client_ip);
            }
            if (!Intrinsics.areEqual(self.event_hash, "")) {
                output.encodeStringElement(serialDesc, 5, self.event_hash);
            }
            GeoIPDto geoIPDto = self.geoip;
            if (geoIPDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, GeoIPDto.Serializer.INSTANCE, geoIPDto);
            }
            if (self.authenticated != AuthenticationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, AuthenticationDto.Serializer.INSTANCE, self.authenticated);
            }
            int i = self.created_at;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 8, UnsignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            NetworkConnectionDto networkConnectionDto = self.network_connection;
            if (networkConnectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, NetworkConnectionDto.Serializer.INSTANCE, networkConnectionDto);
            }
            if (!Intrinsics.areEqual(self.veritas_device_id, "")) {
                output.encodeStringElement(serialDesc, 10, self.veritas_device_id);
            }
            if (Intrinsics.areEqual(self.wallet_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 11, self.wallet_id);
        }

        public Surrogate(DeviceDto deviceDto, ApplicationDto applicationDto, NcwAppEventDto ncwAppEventDto, String timestamp, String client_ip, String event_hash, GeoIPDto geoIPDto, AuthenticationDto authenticated, int i, NetworkConnectionDto networkConnectionDto, String veritas_device_id, String wallet_id) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(client_ip, "client_ip");
            Intrinsics.checkNotNullParameter(event_hash, "event_hash");
            Intrinsics.checkNotNullParameter(authenticated, "authenticated");
            Intrinsics.checkNotNullParameter(veritas_device_id, "veritas_device_id");
            Intrinsics.checkNotNullParameter(wallet_id, "wallet_id");
            this.device = deviceDto;
            this.app = applicationDto;
            this.event = ncwAppEventDto;
            this.timestamp = timestamp;
            this.client_ip = client_ip;
            this.event_hash = event_hash;
            this.geoip = geoIPDto;
            this.authenticated = authenticated;
            this.created_at = i;
            this.network_connection = networkConnectionDto;
            this.veritas_device_id = veritas_device_id;
            this.wallet_id = wallet_id;
        }

        public /* synthetic */ Surrogate(DeviceDto deviceDto, ApplicationDto applicationDto, NcwAppEventDto ncwAppEventDto, String str, String str2, String str3, GeoIPDto geoIPDto, AuthenticationDto authenticationDto, int i, NetworkConnectionDto networkConnectionDto, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : deviceDto, (i2 & 2) != 0 ? null : applicationDto, (i2 & 4) != 0 ? null : ncwAppEventDto, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? null : geoIPDto, (i2 & 128) != 0 ? AuthenticationDto.INSTANCE.getZeroValue() : authenticationDto, (i2 & 256) != 0 ? 0 : i, (i2 & 512) == 0 ? networkConnectionDto : null, (i2 & 1024) != 0 ? "" : str4, (i2 & 2048) != 0 ? "" : str5);
        }

        public final DeviceDto getDevice() {
            return this.device;
        }

        public final ApplicationDto getApp() {
            return this.app;
        }

        public final NcwAppEventDto getEvent() {
            return this.event;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }

        public final String getClient_ip() {
            return this.client_ip;
        }

        public final String getEvent_hash() {
            return this.event_hash;
        }

        public final GeoIPDto getGeoip() {
            return this.geoip;
        }

        public final AuthenticationDto getAuthenticated() {
            return this.authenticated;
        }

        public final int getCreated_at() {
            return this.created_at;
        }

        public final NetworkConnectionDto getNetwork_connection() {
            return this.network_connection;
        }

        public final String getVeritas_device_id() {
            return this.veritas_device_id;
        }

        public final String getWallet_id() {
            return this.wallet_id;
        }
    }

    /* compiled from: NcwLoggingEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwLoggingEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NcwLoggingEventDto;", "Lcom/robinhood/rosetta/eventlogging/NcwLoggingEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NcwLoggingEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<NcwLoggingEventDto, NcwLoggingEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NcwLoggingEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NcwLoggingEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NcwLoggingEventDto> getBinaryBase64Serializer() {
            return (KSerializer) NcwLoggingEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NcwLoggingEvent> getProtoAdapter() {
            return NcwLoggingEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NcwLoggingEventDto getZeroValue() {
            return NcwLoggingEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NcwLoggingEventDto fromProto(NcwLoggingEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Device device = proto.getDevice();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DeviceDto deviceDtoFromProto = device != null ? DeviceDto.INSTANCE.fromProto(device) : null;
            Application app = proto.getApp();
            ApplicationDto applicationDtoFromProto = app != null ? ApplicationDto.INSTANCE.fromProto(app) : null;
            NcwAppEvent event = proto.getEvent();
            NcwAppEventDto ncwAppEventDtoFromProto = event != null ? NcwAppEventDto.INSTANCE.fromProto(event) : null;
            String timestamp = proto.getTimestamp();
            String client_ip = proto.getClient_ip();
            String event_hash = proto.getEvent_hash();
            GeoIP geoip = proto.getGeoip();
            GeoIPDto geoIPDtoFromProto = geoip != null ? GeoIPDto.INSTANCE.fromProto(geoip) : null;
            AuthenticationDto authenticationDtoFromProto = AuthenticationDto.INSTANCE.fromProto(proto.getAuthenticated());
            int created_at = proto.getCreated_at();
            NetworkConnection network_connection = proto.getNetwork_connection();
            return new NcwLoggingEventDto(new Surrogate(deviceDtoFromProto, applicationDtoFromProto, ncwAppEventDtoFromProto, timestamp, client_ip, event_hash, geoIPDtoFromProto, authenticationDtoFromProto, created_at, network_connection != null ? NetworkConnectionDto.INSTANCE.fromProto(network_connection) : null, proto.getVeritas_device_id(), proto.getWallet_id()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NcwLoggingEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NcwLoggingEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NcwLoggingEventDto(null, null, null, null, null, null, null, null, 0, null, null, null, 4095, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: NcwLoggingEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwLoggingEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwLoggingEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/NcwLoggingEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<NcwLoggingEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.NcwLoggingEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NcwLoggingEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NcwLoggingEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NcwLoggingEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NcwLoggingEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwLoggingEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.NcwLoggingEventDto";
        }
    }
}

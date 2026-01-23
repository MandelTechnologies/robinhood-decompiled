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
import com.robinhood.rosetta.eventlogging.AppEventDto;
import com.robinhood.rosetta.eventlogging.ApplicationDto;
import com.robinhood.rosetta.eventlogging.AuthenticationDto;
import com.robinhood.rosetta.eventlogging.DeviceDto;
import com.robinhood.rosetta.eventlogging.Event;
import com.robinhood.rosetta.eventlogging.EventDto;
import com.robinhood.rosetta.eventlogging.GeoIPDto;
import com.robinhood.rosetta.eventlogging.NetworkConnectionDto;
import com.robinhood.rosetta.eventlogging.UserDto;
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

/* compiled from: LoggingEventDto.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004EFGHB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0097\u0001\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u001fJ\u0094\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u0011J\b\u00108\u001a\u00020\u0002H\u0016J\b\u00109\u001a\u00020\u0011H\u0016J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0096\u0002J\b\u0010>\u001a\u00020\u0019H\u0016J\u0018\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0019H\u0016J\b\u0010D\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u001e\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b6\u0010)¨\u0006I"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LoggingEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/LoggingEvent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/LoggingEventDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/LoggingEventDto$Surrogate;)V", "user", "Lcom/robinhood/rosetta/eventlogging/UserDto;", "device", "Lcom/robinhood/rosetta/eventlogging/DeviceDto;", "app", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto;", "event", "Lcom/robinhood/rosetta/eventlogging/AppEventDto;", "timestamp", "", "client_ip", "event_hash", "geoip", "Lcom/robinhood/rosetta/eventlogging/GeoIPDto;", "authenticated", "Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;", "created_at", "", "network_connection", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;", "event_schema_type", "Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "locality", "(Lcom/robinhood/rosetta/eventlogging/UserDto;Lcom/robinhood/rosetta/eventlogging/DeviceDto;Lcom/robinhood/rosetta/eventlogging/ApplicationDto;Lcom/robinhood/rosetta/eventlogging/AppEventDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/GeoIPDto;Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;ILcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;Ljava/lang/String;)V", "getUser", "()Lcom/robinhood/rosetta/eventlogging/UserDto;", "getDevice", "()Lcom/robinhood/rosetta/eventlogging/DeviceDto;", "getApp", "()Lcom/robinhood/rosetta/eventlogging/ApplicationDto;", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/AppEventDto;", "getTimestamp", "()Ljava/lang/String;", "getClient_ip", "getEvent_hash", "getGeoip", "()Lcom/robinhood/rosetta/eventlogging/GeoIPDto;", "getAuthenticated", "()Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;", "getCreated_at", "()I", "getNetwork_connection", "()Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;", "getEvent_schema_type", "()Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "getLocality", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class LoggingEventDto implements Dto3<LoggingEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LoggingEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LoggingEventDto, LoggingEvent>> binaryBase64Serializer$delegate;
    private static final LoggingEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LoggingEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LoggingEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UserDto getUser() {
        return this.surrogate.getUser();
    }

    public final DeviceDto getDevice() {
        return this.surrogate.getDevice();
    }

    public final ApplicationDto getApp() {
        return this.surrogate.getApp();
    }

    public final AppEventDto getEvent() {
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

    public final EventDto.TypeDto getEvent_schema_type() {
        return this.surrogate.getEvent_schema_type();
    }

    public final String getLocality() {
        return this.surrogate.getLocality();
    }

    public /* synthetic */ LoggingEventDto(UserDto userDto, DeviceDto deviceDto, ApplicationDto applicationDto, AppEventDto appEventDto, String str, String str2, String str3, GeoIPDto geoIPDto, AuthenticationDto authenticationDto, int i, NetworkConnectionDto networkConnectionDto, EventDto.TypeDto typeDto, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : userDto, (i2 & 2) != 0 ? null : deviceDto, (i2 & 4) != 0 ? null : applicationDto, (i2 & 8) != 0 ? null : appEventDto, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? "" : str3, (i2 & 128) != 0 ? null : geoIPDto, (i2 & 256) != 0 ? AuthenticationDto.INSTANCE.getZeroValue() : authenticationDto, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) == 0 ? networkConnectionDto : null, (i2 & 2048) != 0 ? EventDto.TypeDto.INSTANCE.getZeroValue() : typeDto, (i2 & 4096) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoggingEventDto(UserDto userDto, DeviceDto deviceDto, ApplicationDto applicationDto, AppEventDto appEventDto, String timestamp, String client_ip, String event_hash, GeoIPDto geoIPDto, AuthenticationDto authenticated, int i, NetworkConnectionDto networkConnectionDto, EventDto.TypeDto event_schema_type, String locality) {
        this(new Surrogate(userDto, deviceDto, applicationDto, appEventDto, timestamp, client_ip, event_hash, geoIPDto, authenticated, i, networkConnectionDto, event_schema_type, locality));
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(client_ip, "client_ip");
        Intrinsics.checkNotNullParameter(event_hash, "event_hash");
        Intrinsics.checkNotNullParameter(authenticated, "authenticated");
        Intrinsics.checkNotNullParameter(event_schema_type, "event_schema_type");
        Intrinsics.checkNotNullParameter(locality, "locality");
    }

    public static /* synthetic */ LoggingEventDto copy$default(LoggingEventDto loggingEventDto, UserDto userDto, DeviceDto deviceDto, ApplicationDto applicationDto, AppEventDto appEventDto, String str, String str2, String str3, GeoIPDto geoIPDto, AuthenticationDto authenticationDto, int i, NetworkConnectionDto networkConnectionDto, EventDto.TypeDto typeDto, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            userDto = loggingEventDto.surrogate.getUser();
        }
        return loggingEventDto.copy(userDto, (i2 & 2) != 0 ? loggingEventDto.surrogate.getDevice() : deviceDto, (i2 & 4) != 0 ? loggingEventDto.surrogate.getApp() : applicationDto, (i2 & 8) != 0 ? loggingEventDto.surrogate.getEvent() : appEventDto, (i2 & 16) != 0 ? loggingEventDto.surrogate.getTimestamp() : str, (i2 & 32) != 0 ? loggingEventDto.surrogate.getClient_ip() : str2, (i2 & 64) != 0 ? loggingEventDto.surrogate.getEvent_hash() : str3, (i2 & 128) != 0 ? loggingEventDto.surrogate.getGeoip() : geoIPDto, (i2 & 256) != 0 ? loggingEventDto.surrogate.getAuthenticated() : authenticationDto, (i2 & 512) != 0 ? loggingEventDto.surrogate.getCreated_at() : i, (i2 & 1024) != 0 ? loggingEventDto.surrogate.getNetwork_connection() : networkConnectionDto, (i2 & 2048) != 0 ? loggingEventDto.surrogate.getEvent_schema_type() : typeDto, (i2 & 4096) != 0 ? loggingEventDto.surrogate.getLocality() : str4);
    }

    public final LoggingEventDto copy(UserDto user, DeviceDto device, ApplicationDto app, AppEventDto event, String timestamp, String client_ip, String event_hash, GeoIPDto geoip, AuthenticationDto authenticated, int created_at, NetworkConnectionDto network_connection, EventDto.TypeDto event_schema_type, String locality) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(client_ip, "client_ip");
        Intrinsics.checkNotNullParameter(event_hash, "event_hash");
        Intrinsics.checkNotNullParameter(authenticated, "authenticated");
        Intrinsics.checkNotNullParameter(event_schema_type, "event_schema_type");
        Intrinsics.checkNotNullParameter(locality, "locality");
        return new LoggingEventDto(new Surrogate(user, device, app, event, timestamp, client_ip, event_hash, geoip, authenticated, created_at, network_connection, event_schema_type, locality));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public LoggingEvent toProto() {
        UserDto user = this.surrogate.getUser();
        User proto = user != null ? user.toProto() : null;
        DeviceDto device = this.surrogate.getDevice();
        Device proto2 = device != null ? device.toProto() : null;
        ApplicationDto app = this.surrogate.getApp();
        Application proto3 = app != null ? app.toProto() : null;
        AppEventDto event = this.surrogate.getEvent();
        AppEvent proto4 = event != null ? event.toProto() : null;
        String timestamp = this.surrogate.getTimestamp();
        String client_ip = this.surrogate.getClient_ip();
        String event_hash = this.surrogate.getEvent_hash();
        GeoIPDto geoip = this.surrogate.getGeoip();
        GeoIP proto5 = geoip != null ? geoip.toProto() : null;
        Authentication authentication = (Authentication) this.surrogate.getAuthenticated().toProto();
        int created_at = this.surrogate.getCreated_at();
        NetworkConnectionDto network_connection = this.surrogate.getNetwork_connection();
        return new LoggingEvent(proto, proto2, proto3, proto4, timestamp, client_ip, event_hash, proto5, authentication, created_at, network_connection != null ? network_connection.toProto() : null, (Event.Type) this.surrogate.getEvent_schema_type().toProto(), this.surrogate.getLocality(), null, 8192, null);
    }

    public String toString() {
        return "[LoggingEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LoggingEventDto) && Intrinsics.areEqual(((LoggingEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: LoggingEventDto.kt */
    @Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 c2\u00020\u0001:\u0002bcB¤\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dB\u009b\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0013\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010!J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010K\u001a\u00020\u000bHÆ\u0003J\t\u0010L\u001a\u00020\u000bHÆ\u0003J\t\u0010M\u001a\u00020\u000bHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010O\u001a\u00020\u0011HÆ\u0003J\u0018\u0010P\u001a\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010R\u001a\u00020\u001aHÆ\u0003J\t\u0010S\u001a\u00020\u000bHÆ\u0003J¦\u0001\u0010T\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0017\b\u0002\u0010\u0012\u001a\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u000bHÆ\u0001J\u0013\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020\u0013HÖ\u0001J\t\u0010Y\u001a\u00020\u000bHÖ\u0001J%\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u00002\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`H\u0001¢\u0006\u0002\baR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010#\u001a\u0004\b'\u0010(R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010#\u001a\u0004\b*\u0010+R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010#\u001a\u0004\b-\u0010.R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010#\u001a\u0004\b0\u00101R\u001c\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010#\u001a\u0004\b3\u00101R\u001c\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010#\u001a\u0004\b5\u00101R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010#\u001a\u0004\b7\u00108R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010#\u001a\u0004\b:\u0010;R+\u0010\u0012\u001a\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010#\u001a\u0004\b=\u0010>R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010#\u001a\u0004\b@\u0010AR\u001c\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010#\u001a\u0004\bC\u0010DR\u001c\u0010\u001b\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010#\u001a\u0004\bF\u00101¨\u0006d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LoggingEventDto$Surrogate;", "", "user", "Lcom/robinhood/rosetta/eventlogging/UserDto;", "device", "Lcom/robinhood/rosetta/eventlogging/DeviceDto;", "app", "Lcom/robinhood/rosetta/eventlogging/ApplicationDto;", "event", "Lcom/robinhood/rosetta/eventlogging/AppEventDto;", "timestamp", "", "client_ip", "event_hash", "geoip", "Lcom/robinhood/rosetta/eventlogging/GeoIPDto;", "authenticated", "Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;", "created_at", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/UInt32Serializer;", "network_connection", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;", "event_schema_type", "Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "locality", "<init>", "(Lcom/robinhood/rosetta/eventlogging/UserDto;Lcom/robinhood/rosetta/eventlogging/DeviceDto;Lcom/robinhood/rosetta/eventlogging/ApplicationDto;Lcom/robinhood/rosetta/eventlogging/AppEventDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/GeoIPDto;Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;ILcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/UserDto;Lcom/robinhood/rosetta/eventlogging/DeviceDto;Lcom/robinhood/rosetta/eventlogging/ApplicationDto;Lcom/robinhood/rosetta/eventlogging/AppEventDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/GeoIPDto;Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;ILcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUser$annotations", "()V", "getUser", "()Lcom/robinhood/rosetta/eventlogging/UserDto;", "getDevice$annotations", "getDevice", "()Lcom/robinhood/rosetta/eventlogging/DeviceDto;", "getApp$annotations", "getApp", "()Lcom/robinhood/rosetta/eventlogging/ApplicationDto;", "getEvent$annotations", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/AppEventDto;", "getTimestamp$annotations", "getTimestamp", "()Ljava/lang/String;", "getClient_ip$annotations", "getClient_ip", "getEvent_hash$annotations", "getEvent_hash", "getGeoip$annotations", "getGeoip", "()Lcom/robinhood/rosetta/eventlogging/GeoIPDto;", "getAuthenticated$annotations", "getAuthenticated", "()Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;", "getCreated_at$annotations", "getCreated_at", "()I", "getNetwork_connection$annotations", "getNetwork_connection", "()Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;", "getEvent_schema_type$annotations", "getEvent_schema_type", "()Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "getLocality$annotations", "getLocality", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ApplicationDto app;
        private final AuthenticationDto authenticated;
        private final String client_ip;
        private final int created_at;
        private final DeviceDto device;
        private final AppEventDto event;
        private final String event_hash;
        private final EventDto.TypeDto event_schema_type;
        private final GeoIPDto geoip;
        private final String locality;
        private final NetworkConnectionDto network_connection;
        private final String timestamp;
        private final UserDto user;

        public Surrogate() {
            this((UserDto) null, (DeviceDto) null, (ApplicationDto) null, (AppEventDto) null, (String) null, (String) null, (String) null, (GeoIPDto) null, (AuthenticationDto) null, 0, (NetworkConnectionDto) null, (EventDto.TypeDto) null, (String) null, 8191, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UserDto userDto, DeviceDto deviceDto, ApplicationDto applicationDto, AppEventDto appEventDto, String str, String str2, String str3, GeoIPDto geoIPDto, AuthenticationDto authenticationDto, int i, NetworkConnectionDto networkConnectionDto, EventDto.TypeDto typeDto, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                userDto = surrogate.user;
            }
            return surrogate.copy(userDto, (i2 & 2) != 0 ? surrogate.device : deviceDto, (i2 & 4) != 0 ? surrogate.app : applicationDto, (i2 & 8) != 0 ? surrogate.event : appEventDto, (i2 & 16) != 0 ? surrogate.timestamp : str, (i2 & 32) != 0 ? surrogate.client_ip : str2, (i2 & 64) != 0 ? surrogate.event_hash : str3, (i2 & 128) != 0 ? surrogate.geoip : geoIPDto, (i2 & 256) != 0 ? surrogate.authenticated : authenticationDto, (i2 & 512) != 0 ? surrogate.created_at : i, (i2 & 1024) != 0 ? surrogate.network_connection : networkConnectionDto, (i2 & 2048) != 0 ? surrogate.event_schema_type : typeDto, (i2 & 4096) != 0 ? surrogate.locality : str4);
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

        @SerialName("eventSchemaType")
        @JsonAnnotations2(names = {"event_schema_type"})
        public static /* synthetic */ void getEvent_schema_type$annotations() {
        }

        @SerialName("geoip")
        @JsonAnnotations2(names = {"geoip"})
        public static /* synthetic */ void getGeoip$annotations() {
        }

        @SerialName("locality")
        @JsonAnnotations2(names = {"locality"})
        public static /* synthetic */ void getLocality$annotations() {
        }

        @SerialName("networkConnection")
        @JsonAnnotations2(names = {"network_connection"})
        public static /* synthetic */ void getNetwork_connection$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("user")
        @JsonAnnotations2(names = {"user"})
        public static /* synthetic */ void getUser$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UserDto getUser() {
            return this.user;
        }

        /* renamed from: component10, reason: from getter */
        public final int getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component11, reason: from getter */
        public final NetworkConnectionDto getNetwork_connection() {
            return this.network_connection;
        }

        /* renamed from: component12, reason: from getter */
        public final EventDto.TypeDto getEvent_schema_type() {
            return this.event_schema_type;
        }

        /* renamed from: component13, reason: from getter */
        public final String getLocality() {
            return this.locality;
        }

        /* renamed from: component2, reason: from getter */
        public final DeviceDto getDevice() {
            return this.device;
        }

        /* renamed from: component3, reason: from getter */
        public final ApplicationDto getApp() {
            return this.app;
        }

        /* renamed from: component4, reason: from getter */
        public final AppEventDto getEvent() {
            return this.event;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component6, reason: from getter */
        public final String getClient_ip() {
            return this.client_ip;
        }

        /* renamed from: component7, reason: from getter */
        public final String getEvent_hash() {
            return this.event_hash;
        }

        /* renamed from: component8, reason: from getter */
        public final GeoIPDto getGeoip() {
            return this.geoip;
        }

        /* renamed from: component9, reason: from getter */
        public final AuthenticationDto getAuthenticated() {
            return this.authenticated;
        }

        public final Surrogate copy(UserDto user, DeviceDto device, ApplicationDto app, AppEventDto event, String timestamp, String client_ip, String event_hash, GeoIPDto geoip, AuthenticationDto authenticated, int created_at, NetworkConnectionDto network_connection, EventDto.TypeDto event_schema_type, String locality) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(client_ip, "client_ip");
            Intrinsics.checkNotNullParameter(event_hash, "event_hash");
            Intrinsics.checkNotNullParameter(authenticated, "authenticated");
            Intrinsics.checkNotNullParameter(event_schema_type, "event_schema_type");
            Intrinsics.checkNotNullParameter(locality, "locality");
            return new Surrogate(user, device, app, event, timestamp, client_ip, event_hash, geoip, authenticated, created_at, network_connection, event_schema_type, locality);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.user, surrogate.user) && Intrinsics.areEqual(this.device, surrogate.device) && Intrinsics.areEqual(this.app, surrogate.app) && Intrinsics.areEqual(this.event, surrogate.event) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.client_ip, surrogate.client_ip) && Intrinsics.areEqual(this.event_hash, surrogate.event_hash) && Intrinsics.areEqual(this.geoip, surrogate.geoip) && this.authenticated == surrogate.authenticated && this.created_at == surrogate.created_at && Intrinsics.areEqual(this.network_connection, surrogate.network_connection) && this.event_schema_type == surrogate.event_schema_type && Intrinsics.areEqual(this.locality, surrogate.locality);
        }

        public int hashCode() {
            UserDto userDto = this.user;
            int iHashCode = (userDto == null ? 0 : userDto.hashCode()) * 31;
            DeviceDto deviceDto = this.device;
            int iHashCode2 = (iHashCode + (deviceDto == null ? 0 : deviceDto.hashCode())) * 31;
            ApplicationDto applicationDto = this.app;
            int iHashCode3 = (iHashCode2 + (applicationDto == null ? 0 : applicationDto.hashCode())) * 31;
            AppEventDto appEventDto = this.event;
            int iHashCode4 = (((((((iHashCode3 + (appEventDto == null ? 0 : appEventDto.hashCode())) * 31) + this.timestamp.hashCode()) * 31) + this.client_ip.hashCode()) * 31) + this.event_hash.hashCode()) * 31;
            GeoIPDto geoIPDto = this.geoip;
            int iHashCode5 = (((((iHashCode4 + (geoIPDto == null ? 0 : geoIPDto.hashCode())) * 31) + this.authenticated.hashCode()) * 31) + Integer.hashCode(this.created_at)) * 31;
            NetworkConnectionDto networkConnectionDto = this.network_connection;
            return ((((iHashCode5 + (networkConnectionDto != null ? networkConnectionDto.hashCode() : 0)) * 31) + this.event_schema_type.hashCode()) * 31) + this.locality.hashCode();
        }

        public String toString() {
            return "Surrogate(user=" + this.user + ", device=" + this.device + ", app=" + this.app + ", event=" + this.event + ", timestamp=" + this.timestamp + ", client_ip=" + this.client_ip + ", event_hash=" + this.event_hash + ", geoip=" + this.geoip + ", authenticated=" + this.authenticated + ", created_at=" + this.created_at + ", network_connection=" + this.network_connection + ", event_schema_type=" + this.event_schema_type + ", locality=" + this.locality + ")";
        }

        /* compiled from: LoggingEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LoggingEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/LoggingEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LoggingEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UserDto userDto, DeviceDto deviceDto, ApplicationDto applicationDto, AppEventDto appEventDto, String str, String str2, String str3, GeoIPDto geoIPDto, AuthenticationDto authenticationDto, int i2, NetworkConnectionDto networkConnectionDto, EventDto.TypeDto typeDto, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.user = null;
            } else {
                this.user = userDto;
            }
            if ((i & 2) == 0) {
                this.device = null;
            } else {
                this.device = deviceDto;
            }
            if ((i & 4) == 0) {
                this.app = null;
            } else {
                this.app = applicationDto;
            }
            if ((i & 8) == 0) {
                this.event = null;
            } else {
                this.event = appEventDto;
            }
            if ((i & 16) == 0) {
                this.timestamp = "";
            } else {
                this.timestamp = str;
            }
            if ((i & 32) == 0) {
                this.client_ip = "";
            } else {
                this.client_ip = str2;
            }
            if ((i & 64) == 0) {
                this.event_hash = "";
            } else {
                this.event_hash = str3;
            }
            if ((i & 128) == 0) {
                this.geoip = null;
            } else {
                this.geoip = geoIPDto;
            }
            if ((i & 256) == 0) {
                this.authenticated = AuthenticationDto.INSTANCE.getZeroValue();
            } else {
                this.authenticated = authenticationDto;
            }
            if ((i & 512) == 0) {
                this.created_at = 0;
            } else {
                this.created_at = i2;
            }
            if ((i & 1024) == 0) {
                this.network_connection = null;
            } else {
                this.network_connection = networkConnectionDto;
            }
            if ((i & 2048) == 0) {
                this.event_schema_type = EventDto.TypeDto.INSTANCE.getZeroValue();
            } else {
                this.event_schema_type = typeDto;
            }
            if ((i & 4096) == 0) {
                this.locality = "";
            } else {
                this.locality = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UserDto userDto = self.user;
            if (userDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UserDto.Serializer.INSTANCE, userDto);
            }
            DeviceDto deviceDto = self.device;
            if (deviceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DeviceDto.Serializer.INSTANCE, deviceDto);
            }
            ApplicationDto applicationDto = self.app;
            if (applicationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ApplicationDto.Serializer.INSTANCE, applicationDto);
            }
            AppEventDto appEventDto = self.event;
            if (appEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, AppEventDto.Serializer.INSTANCE, appEventDto);
            }
            if (!Intrinsics.areEqual(self.timestamp, "")) {
                output.encodeStringElement(serialDesc, 4, self.timestamp);
            }
            if (!Intrinsics.areEqual(self.client_ip, "")) {
                output.encodeStringElement(serialDesc, 5, self.client_ip);
            }
            if (!Intrinsics.areEqual(self.event_hash, "")) {
                output.encodeStringElement(serialDesc, 6, self.event_hash);
            }
            GeoIPDto geoIPDto = self.geoip;
            if (geoIPDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, GeoIPDto.Serializer.INSTANCE, geoIPDto);
            }
            if (self.authenticated != AuthenticationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, AuthenticationDto.Serializer.INSTANCE, self.authenticated);
            }
            int i = self.created_at;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 9, UnsignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            NetworkConnectionDto networkConnectionDto = self.network_connection;
            if (networkConnectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, NetworkConnectionDto.Serializer.INSTANCE, networkConnectionDto);
            }
            if (self.event_schema_type != EventDto.TypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 11, EventDto.TypeDto.Serializer.INSTANCE, self.event_schema_type);
            }
            if (Intrinsics.areEqual(self.locality, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 12, self.locality);
        }

        public Surrogate(UserDto userDto, DeviceDto deviceDto, ApplicationDto applicationDto, AppEventDto appEventDto, String timestamp, String client_ip, String event_hash, GeoIPDto geoIPDto, AuthenticationDto authenticated, int i, NetworkConnectionDto networkConnectionDto, EventDto.TypeDto event_schema_type, String locality) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(client_ip, "client_ip");
            Intrinsics.checkNotNullParameter(event_hash, "event_hash");
            Intrinsics.checkNotNullParameter(authenticated, "authenticated");
            Intrinsics.checkNotNullParameter(event_schema_type, "event_schema_type");
            Intrinsics.checkNotNullParameter(locality, "locality");
            this.user = userDto;
            this.device = deviceDto;
            this.app = applicationDto;
            this.event = appEventDto;
            this.timestamp = timestamp;
            this.client_ip = client_ip;
            this.event_hash = event_hash;
            this.geoip = geoIPDto;
            this.authenticated = authenticated;
            this.created_at = i;
            this.network_connection = networkConnectionDto;
            this.event_schema_type = event_schema_type;
            this.locality = locality;
        }

        public /* synthetic */ Surrogate(UserDto userDto, DeviceDto deviceDto, ApplicationDto applicationDto, AppEventDto appEventDto, String str, String str2, String str3, GeoIPDto geoIPDto, AuthenticationDto authenticationDto, int i, NetworkConnectionDto networkConnectionDto, EventDto.TypeDto typeDto, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : userDto, (i2 & 2) != 0 ? null : deviceDto, (i2 & 4) != 0 ? null : applicationDto, (i2 & 8) != 0 ? null : appEventDto, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? "" : str3, (i2 & 128) != 0 ? null : geoIPDto, (i2 & 256) != 0 ? AuthenticationDto.INSTANCE.getZeroValue() : authenticationDto, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) == 0 ? networkConnectionDto : null, (i2 & 2048) != 0 ? EventDto.TypeDto.INSTANCE.getZeroValue() : typeDto, (i2 & 4096) != 0 ? "" : str4);
        }

        public final UserDto getUser() {
            return this.user;
        }

        public final DeviceDto getDevice() {
            return this.device;
        }

        public final ApplicationDto getApp() {
            return this.app;
        }

        public final AppEventDto getEvent() {
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

        public final EventDto.TypeDto getEvent_schema_type() {
            return this.event_schema_type;
        }

        public final String getLocality() {
            return this.locality;
        }
    }

    /* compiled from: LoggingEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LoggingEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/LoggingEventDto;", "Lcom/robinhood/rosetta/eventlogging/LoggingEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/LoggingEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<LoggingEventDto, LoggingEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoggingEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LoggingEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LoggingEventDto> getBinaryBase64Serializer() {
            return (KSerializer) LoggingEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LoggingEvent> getProtoAdapter() {
            return LoggingEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LoggingEventDto getZeroValue() {
            return LoggingEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LoggingEventDto fromProto(LoggingEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            User user = proto.getUser();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UserDto userDtoFromProto = user != null ? UserDto.INSTANCE.fromProto(user) : null;
            Device device = proto.getDevice();
            DeviceDto deviceDtoFromProto = device != null ? DeviceDto.INSTANCE.fromProto(device) : null;
            Application app = proto.getApp();
            ApplicationDto applicationDtoFromProto = app != null ? ApplicationDto.INSTANCE.fromProto(app) : null;
            AppEvent event = proto.getEvent();
            AppEventDto appEventDtoFromProto = event != null ? AppEventDto.INSTANCE.fromProto(event) : null;
            String timestamp = proto.getTimestamp();
            String client_ip = proto.getClient_ip();
            String event_hash = proto.getEvent_hash();
            GeoIP geoip = proto.getGeoip();
            GeoIPDto geoIPDtoFromProto = geoip != null ? GeoIPDto.INSTANCE.fromProto(geoip) : null;
            AuthenticationDto authenticationDtoFromProto = AuthenticationDto.INSTANCE.fromProto(proto.getAuthenticated());
            int created_at = proto.getCreated_at();
            NetworkConnection network_connection = proto.getNetwork_connection();
            return new LoggingEventDto(new Surrogate(userDtoFromProto, deviceDtoFromProto, applicationDtoFromProto, appEventDtoFromProto, timestamp, client_ip, event_hash, geoIPDtoFromProto, authenticationDtoFromProto, created_at, network_connection != null ? NetworkConnectionDto.INSTANCE.fromProto(network_connection) : null, EventDto.TypeDto.INSTANCE.fromProto(proto.getEvent_schema_type()), proto.getLocality()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.LoggingEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoggingEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new LoggingEventDto(null, null, null, null, null, null, null, null, null, 0, null, null, null, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LoggingEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LoggingEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/LoggingEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/LoggingEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<LoggingEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.LoggingEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LoggingEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LoggingEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LoggingEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LoggingEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LoggingEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.LoggingEventDto";
        }
    }
}

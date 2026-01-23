package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.UnsignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.AuthenticationDto;
import com.robinhood.rosetta.eventlogging.Event;
import com.robinhood.rosetta.eventlogging.EventDto;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import okio.ByteString;

/* compiled from: EventDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000534567B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0006\u0010\u0016J`\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\u000bH\u0016J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\u000eH\u0016J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u000eH\u0016J\b\u00102\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\"\u0010!R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/Event;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/EventDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EventDto$Surrogate;)V", "schema_type", "Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "schema_name", "", "property", "created_at", "", WebsocketGatewayConstants.TOPIC_KEY, "size", WebsocketGatewayConstants.DATA_KEY, "Lokio/ByteString;", "uuid", "authenticated", "Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;", "(Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILokio/ByteString;Lokio/ByteString;Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;)V", "getSchema_type", "()Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "getSchema_name", "()Ljava/lang/String;", "getProperty", "getCreated_at", "()I", "getTopic", "getSize", "getData", "()Lokio/ByteString;", "getUuid", "getAuthenticated", "()Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "TypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class EventDto implements Dto3<Event>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EventDto, Event>> binaryBase64Serializer$delegate;
    private static final EventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final TypeDto getSchema_type() {
        return this.surrogate.getSchema_type();
    }

    public final String getSchema_name() {
        return this.surrogate.getSchema_name();
    }

    public final String getProperty() {
        return this.surrogate.getProperty();
    }

    public final int getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final String getTopic() {
        return this.surrogate.getTopic();
    }

    public final int getSize() {
        return this.surrogate.getSize();
    }

    public final ByteString getData() {
        return this.surrogate.getData();
    }

    public final ByteString getUuid() {
        return this.surrogate.getUuid();
    }

    public final AuthenticationDto getAuthenticated() {
        return this.surrogate.getAuthenticated();
    }

    public /* synthetic */ EventDto(TypeDto typeDto, String str, String str2, int i, String str3, int i2, ByteString byteString, ByteString byteString2, AuthenticationDto authenticationDto, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? ByteString.EMPTY : byteString, (i3 & 128) != 0 ? ByteString.EMPTY : byteString2, (i3 & 256) != 0 ? AuthenticationDto.INSTANCE.getZeroValue() : authenticationDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventDto(TypeDto schema_type, String schema_name, String property, int i, String topic, int i2, ByteString data, ByteString uuid, AuthenticationDto authenticated) {
        this(new Surrogate(schema_type, schema_name, property, i, topic, i2, data, uuid, authenticated));
        Intrinsics.checkNotNullParameter(schema_type, "schema_type");
        Intrinsics.checkNotNullParameter(schema_name, "schema_name");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(authenticated, "authenticated");
    }

    public static /* synthetic */ EventDto copy$default(EventDto eventDto, TypeDto typeDto, String str, String str2, int i, String str3, int i2, ByteString byteString, ByteString byteString2, AuthenticationDto authenticationDto, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            typeDto = eventDto.surrogate.getSchema_type();
        }
        if ((i3 & 2) != 0) {
            str = eventDto.surrogate.getSchema_name();
        }
        if ((i3 & 4) != 0) {
            str2 = eventDto.surrogate.getProperty();
        }
        if ((i3 & 8) != 0) {
            i = eventDto.surrogate.getCreated_at();
        }
        if ((i3 & 16) != 0) {
            str3 = eventDto.surrogate.getTopic();
        }
        if ((i3 & 32) != 0) {
            i2 = eventDto.surrogate.getSize();
        }
        if ((i3 & 64) != 0) {
            byteString = eventDto.surrogate.getData();
        }
        if ((i3 & 128) != 0) {
            byteString2 = eventDto.surrogate.getUuid();
        }
        if ((i3 & 256) != 0) {
            authenticationDto = eventDto.surrogate.getAuthenticated();
        }
        ByteString byteString3 = byteString2;
        AuthenticationDto authenticationDto2 = authenticationDto;
        int i4 = i2;
        ByteString byteString4 = byteString;
        String str4 = str3;
        String str5 = str2;
        return eventDto.copy(typeDto, str, str5, i, str4, i4, byteString4, byteString3, authenticationDto2);
    }

    public final EventDto copy(TypeDto schema_type, String schema_name, String property, int created_at, String topic, int size, ByteString data, ByteString uuid, AuthenticationDto authenticated) {
        Intrinsics.checkNotNullParameter(schema_type, "schema_type");
        Intrinsics.checkNotNullParameter(schema_name, "schema_name");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(authenticated, "authenticated");
        return new EventDto(new Surrogate(schema_type, schema_name, property, created_at, topic, size, data, uuid, authenticated));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Event toProto() {
        return new Event((Event.Type) this.surrogate.getSchema_type().toProto(), this.surrogate.getSchema_name(), this.surrogate.getProperty(), this.surrogate.getCreated_at(), this.surrogate.getTopic(), this.surrogate.getSize(), this.surrogate.getData(), this.surrogate.getUuid(), (Authentication) this.surrogate.getAuthenticated().toProto(), null, 512, null);
    }

    public String toString() {
        return "[EventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EventDto) && Intrinsics.areEqual(((EventDto) other).surrogate, this.surrogate);
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
    /* compiled from: EventDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 J2\u00020\u0001:\u0002IJB\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\r\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015Bq\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u0019J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u0018\u00105\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\u0018\u00107\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J\u0018\u00108\u001a\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u0010HÆ\u0003J\u0018\u00109\u001a\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0013HÆ\u0003J\u009f\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\u0017\b\u0002\u0010\r\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u000e\u001a\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\bHÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001J%\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0001¢\u0006\u0002\bHR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010 R+\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010%R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010 R+\u0010\r\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010%R+\u0010\u000e\u001a\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,R+\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010,R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001b\u001a\u0004\b0\u00101¨\u0006K"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventDto$Surrogate;", "", "schema_type", "Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "schema_name", "", "property", "created_at", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/UInt32Serializer;", WebsocketGatewayConstants.TOPIC_KEY, "size", WebsocketGatewayConstants.DATA_KEY, "Lokio/ByteString;", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "uuid", "authenticated", "Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILokio/ByteString;Lokio/ByteString;Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILokio/ByteString;Lokio/ByteString;Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSchema_type$annotations", "()V", "getSchema_type", "()Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "getSchema_name$annotations", "getSchema_name", "()Ljava/lang/String;", "getProperty$annotations", "getProperty", "getCreated_at$annotations", "getCreated_at", "()I", "getTopic$annotations", "getTopic", "getSize$annotations", "getSize", "getData$annotations", "getData", "()Lokio/ByteString;", "getUuid$annotations", "getUuid", "getAuthenticated$annotations", "getAuthenticated", "()Lcom/robinhood/rosetta/eventlogging/AuthenticationDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AuthenticationDto authenticated;
        private final int created_at;
        private final ByteString data;
        private final String property;
        private final String schema_name;
        private final TypeDto schema_type;
        private final int size;
        private final String topic;
        private final ByteString uuid;

        public Surrogate() {
            this((TypeDto) null, (String) null, (String) null, 0, (String) null, 0, (ByteString) null, (ByteString) null, (AuthenticationDto) null, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, TypeDto typeDto, String str, String str2, int i, String str3, int i2, ByteString byteString, ByteString byteString2, AuthenticationDto authenticationDto, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                typeDto = surrogate.schema_type;
            }
            if ((i3 & 2) != 0) {
                str = surrogate.schema_name;
            }
            if ((i3 & 4) != 0) {
                str2 = surrogate.property;
            }
            if ((i3 & 8) != 0) {
                i = surrogate.created_at;
            }
            if ((i3 & 16) != 0) {
                str3 = surrogate.topic;
            }
            if ((i3 & 32) != 0) {
                i2 = surrogate.size;
            }
            if ((i3 & 64) != 0) {
                byteString = surrogate.data;
            }
            if ((i3 & 128) != 0) {
                byteString2 = surrogate.uuid;
            }
            if ((i3 & 256) != 0) {
                authenticationDto = surrogate.authenticated;
            }
            ByteString byteString3 = byteString2;
            AuthenticationDto authenticationDto2 = authenticationDto;
            int i4 = i2;
            ByteString byteString4 = byteString;
            String str4 = str3;
            String str5 = str2;
            return surrogate.copy(typeDto, str, str5, i, str4, i4, byteString4, byteString3, authenticationDto2);
        }

        @SerialName("authenticated")
        @JsonAnnotations2(names = {"authenticated"})
        public static /* synthetic */ void getAuthenticated$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName(WebsocketGatewayConstants.DATA_KEY)
        @JsonAnnotations2(names = {WebsocketGatewayConstants.DATA_KEY})
        public static /* synthetic */ void getData$annotations() {
        }

        @SerialName("property")
        @JsonAnnotations2(names = {"property"})
        public static /* synthetic */ void getProperty$annotations() {
        }

        @SerialName("schemaName")
        @JsonAnnotations2(names = {"schema_name"})
        public static /* synthetic */ void getSchema_name$annotations() {
        }

        @SerialName("schemaType")
        @JsonAnnotations2(names = {"schema_type"})
        public static /* synthetic */ void getSchema_type$annotations() {
        }

        @SerialName("size")
        @JsonAnnotations2(names = {"size"})
        public static /* synthetic */ void getSize$annotations() {
        }

        @SerialName(WebsocketGatewayConstants.TOPIC_KEY)
        @JsonAnnotations2(names = {WebsocketGatewayConstants.TOPIC_KEY})
        public static /* synthetic */ void getTopic$annotations() {
        }

        @SerialName("uuid")
        @JsonAnnotations2(names = {"uuid"})
        public static /* synthetic */ void getUuid$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final TypeDto getSchema_type() {
            return this.schema_type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSchema_name() {
            return this.schema_name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getProperty() {
            return this.property;
        }

        /* renamed from: component4, reason: from getter */
        public final int getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTopic() {
            return this.topic;
        }

        /* renamed from: component6, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        /* renamed from: component7, reason: from getter */
        public final ByteString getData() {
            return this.data;
        }

        /* renamed from: component8, reason: from getter */
        public final ByteString getUuid() {
            return this.uuid;
        }

        /* renamed from: component9, reason: from getter */
        public final AuthenticationDto getAuthenticated() {
            return this.authenticated;
        }

        public final Surrogate copy(TypeDto schema_type, String schema_name, String property, int created_at, String topic, int size, ByteString data, ByteString uuid, AuthenticationDto authenticated) {
            Intrinsics.checkNotNullParameter(schema_type, "schema_type");
            Intrinsics.checkNotNullParameter(schema_name, "schema_name");
            Intrinsics.checkNotNullParameter(property, "property");
            Intrinsics.checkNotNullParameter(topic, "topic");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(authenticated, "authenticated");
            return new Surrogate(schema_type, schema_name, property, created_at, topic, size, data, uuid, authenticated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.schema_type == surrogate.schema_type && Intrinsics.areEqual(this.schema_name, surrogate.schema_name) && Intrinsics.areEqual(this.property, surrogate.property) && this.created_at == surrogate.created_at && Intrinsics.areEqual(this.topic, surrogate.topic) && this.size == surrogate.size && Intrinsics.areEqual(this.data, surrogate.data) && Intrinsics.areEqual(this.uuid, surrogate.uuid) && this.authenticated == surrogate.authenticated;
        }

        public int hashCode() {
            return (((((((((((((((this.schema_type.hashCode() * 31) + this.schema_name.hashCode()) * 31) + this.property.hashCode()) * 31) + Integer.hashCode(this.created_at)) * 31) + this.topic.hashCode()) * 31) + Integer.hashCode(this.size)) * 31) + this.data.hashCode()) * 31) + this.uuid.hashCode()) * 31) + this.authenticated.hashCode();
        }

        public String toString() {
            return "Surrogate(schema_type=" + this.schema_type + ", schema_name=" + this.schema_name + ", property=" + this.property + ", created_at=" + this.created_at + ", topic=" + this.topic + ", size=" + this.size + ", data=" + this.data + ", uuid=" + this.uuid + ", authenticated=" + this.authenticated + ")";
        }

        /* compiled from: EventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EventDto6.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, TypeDto typeDto, String str, String str2, int i2, String str3, int i3, ByteString byteString, ByteString byteString2, AuthenticationDto authenticationDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.schema_type = (i & 1) == 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto;
            if ((i & 2) == 0) {
                this.schema_name = "";
            } else {
                this.schema_name = str;
            }
            if ((i & 4) == 0) {
                this.property = "";
            } else {
                this.property = str2;
            }
            if ((i & 8) == 0) {
                this.created_at = 0;
            } else {
                this.created_at = i2;
            }
            if ((i & 16) == 0) {
                this.topic = "";
            } else {
                this.topic = str3;
            }
            if ((i & 32) == 0) {
                this.size = 0;
            } else {
                this.size = i3;
            }
            if ((i & 64) == 0) {
                this.data = ByteString.EMPTY;
            } else {
                this.data = byteString;
            }
            if ((i & 128) == 0) {
                this.uuid = ByteString.EMPTY;
            } else {
                this.uuid = byteString2;
            }
            if ((i & 256) == 0) {
                this.authenticated = AuthenticationDto.INSTANCE.getZeroValue();
            } else {
                this.authenticated = authenticationDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.schema_type != TypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, TypeDto.Serializer.INSTANCE, self.schema_type);
            }
            if (!Intrinsics.areEqual(self.schema_name, "")) {
                output.encodeStringElement(serialDesc, 1, self.schema_name);
            }
            if (!Intrinsics.areEqual(self.property, "")) {
                output.encodeStringElement(serialDesc, 2, self.property);
            }
            int i = self.created_at;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 3, UnsignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.topic, "")) {
                output.encodeStringElement(serialDesc, 4, self.topic);
            }
            int i2 = self.size;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 5, UnsignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            ByteString byteString = self.data;
            ByteString byteString2 = ByteString.EMPTY;
            if (!Intrinsics.areEqual(byteString, byteString2)) {
                output.encodeSerializableElement(serialDesc, 6, ByteStringSerializer.INSTANCE, self.data);
            }
            if (!Intrinsics.areEqual(self.uuid, byteString2)) {
                output.encodeSerializableElement(serialDesc, 7, ByteStringSerializer.INSTANCE, self.uuid);
            }
            if (self.authenticated != AuthenticationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, AuthenticationDto.Serializer.INSTANCE, self.authenticated);
            }
        }

        public Surrogate(TypeDto schema_type, String schema_name, String property, int i, String topic, int i2, ByteString data, ByteString uuid, AuthenticationDto authenticated) {
            Intrinsics.checkNotNullParameter(schema_type, "schema_type");
            Intrinsics.checkNotNullParameter(schema_name, "schema_name");
            Intrinsics.checkNotNullParameter(property, "property");
            Intrinsics.checkNotNullParameter(topic, "topic");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(authenticated, "authenticated");
            this.schema_type = schema_type;
            this.schema_name = schema_name;
            this.property = property;
            this.created_at = i;
            this.topic = topic;
            this.size = i2;
            this.data = data;
            this.uuid = uuid;
            this.authenticated = authenticated;
        }

        public final TypeDto getSchema_type() {
            return this.schema_type;
        }

        public /* synthetic */ Surrogate(TypeDto typeDto, String str, String str2, int i, String str3, int i2, ByteString byteString, ByteString byteString2, AuthenticationDto authenticationDto, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? ByteString.EMPTY : byteString, (i3 & 128) != 0 ? ByteString.EMPTY : byteString2, (i3 & 256) != 0 ? AuthenticationDto.INSTANCE.getZeroValue() : authenticationDto);
        }

        public final String getSchema_name() {
            return this.schema_name;
        }

        public final String getProperty() {
            return this.property;
        }

        public final int getCreated_at() {
            return this.created_at;
        }

        public final String getTopic() {
            return this.topic;
        }

        public final int getSize() {
            return this.size;
        }

        public final ByteString getData() {
            return this.data;
        }

        public final ByteString getUuid() {
            return this.uuid;
        }

        public final AuthenticationDto getAuthenticated() {
            return this.authenticated;
        }
    }

    /* compiled from: EventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EventDto;", "Lcom/robinhood/rosetta/eventlogging/Event;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<EventDto, Event> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventDto> getBinaryBase64Serializer() {
            return (KSerializer) EventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Event> getProtoAdapter() {
            return Event.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventDto getZeroValue() {
            return EventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventDto fromProto(Event proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new EventDto(new Surrogate(TypeDto.INSTANCE.fromProto(proto.getSchema_type()), proto.getSchema_name(), proto.getProperty(), proto.getCreated_at(), proto.getTopic(), proto.getSize(), proto.getData(), proto.getUuid(), AuthenticationDto.INSTANCE.fromProto(proto.getAuthenticated())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EventDto(null, null, null, 0, null, 0, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/Event$Type;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT_TYPE", "PROTOBUF", "JSON", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TypeDto implements Dto2<Event.Type>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TypeDto, Event.Type>> binaryBase64Serializer$delegate;
        public static final TypeDto DEFAULT_TYPE = new DEFAULT_TYPE("DEFAULT_TYPE", 0);
        public static final TypeDto PROTOBUF = new PROTOBUF("PROTOBUF", 1);
        public static final TypeDto JSON = new JSON("JSON", 2);

        private static final /* synthetic */ TypeDto[] $values() {
            return new TypeDto[]{DEFAULT_TYPE, PROTOBUF, JSON};
        }

        public /* synthetic */ TypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: EventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EventDto.TypeDto.DEFAULT_TYPE", "Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Event$Type;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEFAULT_TYPE extends TypeDto {
            DEFAULT_TYPE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Event.Type toProto() {
                return Event.Type.DEFAULT_TYPE;
            }
        }

        private TypeDto(String str, int i) {
        }

        static {
            TypeDto[] typeDtoArr$values = $values();
            $VALUES = typeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EventDto$TypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EventDto.TypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: EventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EventDto.TypeDto.PROTOBUF", "Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Event$Type;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PROTOBUF extends TypeDto {
            PROTOBUF(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Event.Type toProto() {
                return Event.Type.PROTOBUF;
            }
        }

        /* compiled from: EventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/EventDto.TypeDto.JSON", "Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/Event$Type;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class JSON extends TypeDto {
            JSON(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Event.Type toProto() {
                return Event.Type.JSON;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: EventDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "Lcom/robinhood/rosetta/eventlogging/Event$Type;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TypeDto, Event.Type> {

            /* compiled from: EventDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Event.Type.values().length];
                    try {
                        iArr[Event.Type.DEFAULT_TYPE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Event.Type.PROTOBUF.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Event.Type.JSON.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TypeDto> getBinaryBase64Serializer() {
                return (KSerializer) TypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Event.Type> getProtoAdapter() {
                return Event.Type.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto getZeroValue() {
                return TypeDto.DEFAULT_TYPE;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(Event.Type proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TypeDto.DEFAULT_TYPE;
                }
                if (i == 2) {
                    return TypeDto.PROTOBUF;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return TypeDto.JSON;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: EventDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EventDto$TypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<TypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TypeDto, Event.Type> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.Event.Type", TypeDto.getEntries(), TypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: EventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/EventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<EventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.Event", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.EventDto";
        }
    }
}

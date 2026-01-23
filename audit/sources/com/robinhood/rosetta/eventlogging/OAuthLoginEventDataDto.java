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
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.rosetta.eventlogging.OAuthLoginEventData;
import com.robinhood.rosetta.eventlogging.OAuthLoginEventDataDto;
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

/* compiled from: OAuthLoginEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006()*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$Surrogate;)V", "duration_ms", "", "error_message", "", "error_type", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;", "event_type", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto;", "(JLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto;)V", "getDuration_ms", "()J", "getError_message", "()Ljava/lang/String;", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;", "getEvent_type", "()Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ErrorTypeDto", "EventTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class OAuthLoginEventDataDto implements Dto3<OAuthLoginEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OAuthLoginEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OAuthLoginEventDataDto, OAuthLoginEventData>> binaryBase64Serializer$delegate;
    private static final OAuthLoginEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OAuthLoginEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OAuthLoginEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final long getDuration_ms() {
        return this.surrogate.getDuration_ms();
    }

    public final String getError_message() {
        return this.surrogate.getError_message();
    }

    public final ErrorTypeDto getError_type() {
        return this.surrogate.getError_type();
    }

    public final EventTypeDto getEvent_type() {
        return this.surrogate.getEvent_type();
    }

    public /* synthetic */ OAuthLoginEventDataDto(long j, String str, ErrorTypeDto errorTypeDto, EventTypeDto eventTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ErrorTypeDto.INSTANCE.getZeroValue() : errorTypeDto, (i & 8) != 0 ? EventTypeDto.INSTANCE.getZeroValue() : eventTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OAuthLoginEventDataDto(long j, String error_message, ErrorTypeDto error_type, EventTypeDto event_type) {
        this(new Surrogate(j, error_message, error_type, event_type));
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
    }

    public static /* synthetic */ OAuthLoginEventDataDto copy$default(OAuthLoginEventDataDto oAuthLoginEventDataDto, long j, String str, ErrorTypeDto errorTypeDto, EventTypeDto eventTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            j = oAuthLoginEventDataDto.surrogate.getDuration_ms();
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = oAuthLoginEventDataDto.surrogate.getError_message();
        }
        String str2 = str;
        if ((i & 4) != 0) {
            errorTypeDto = oAuthLoginEventDataDto.surrogate.getError_type();
        }
        ErrorTypeDto errorTypeDto2 = errorTypeDto;
        if ((i & 8) != 0) {
            eventTypeDto = oAuthLoginEventDataDto.surrogate.getEvent_type();
        }
        return oAuthLoginEventDataDto.copy(j2, str2, errorTypeDto2, eventTypeDto);
    }

    public final OAuthLoginEventDataDto copy(long duration_ms, String error_message, ErrorTypeDto error_type, EventTypeDto event_type) {
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        return new OAuthLoginEventDataDto(new Surrogate(duration_ms, error_message, error_type, event_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OAuthLoginEventData toProto() {
        return new OAuthLoginEventData(this.surrogate.getDuration_ms(), this.surrogate.getError_message(), (OAuthLoginEventData.ErrorType) this.surrogate.getError_type().toProto(), (OAuthLoginEventData.EventType) this.surrogate.getEvent_type().toProto(), null, 16, null);
    }

    public String toString() {
        return "[OAuthLoginEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OAuthLoginEventDataDto) && Intrinsics.areEqual(((OAuthLoginEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: OAuthLoginEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000234B>\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\u0018\u0010!\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J@\u0010%\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0010HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010 ¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$Surrogate;", "", "duration_ms", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "error_message", "", "error_type", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;", "event_type", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto;", "<init>", "(JLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDuration_ms$annotations", "()V", "getDuration_ms", "()J", "getError_message$annotations", "getError_message", "()Ljava/lang/String;", "getError_type$annotations", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;", "getEvent_type$annotations", "getEvent_type", "()Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long duration_ms;
        private final String error_message;
        private final ErrorTypeDto error_type;
        private final EventTypeDto event_type;

        public Surrogate() {
            this(0L, (String) null, (ErrorTypeDto) null, (EventTypeDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, long j, String str, ErrorTypeDto errorTypeDto, EventTypeDto eventTypeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                j = surrogate.duration_ms;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = surrogate.error_message;
            }
            String str2 = str;
            if ((i & 4) != 0) {
                errorTypeDto = surrogate.error_type;
            }
            ErrorTypeDto errorTypeDto2 = errorTypeDto;
            if ((i & 8) != 0) {
                eventTypeDto = surrogate.event_type;
            }
            return surrogate.copy(j2, str2, errorTypeDto2, eventTypeDto);
        }

        @SerialName("durationMs")
        @JsonAnnotations2(names = {"duration_ms"})
        public static /* synthetic */ void getDuration_ms$annotations() {
        }

        @SerialName("errorMessage")
        @JsonAnnotations2(names = {"error_message"})
        public static /* synthetic */ void getError_message$annotations() {
        }

        @SerialName("errorType")
        @JsonAnnotations2(names = {"error_type"})
        public static /* synthetic */ void getError_type$annotations() {
        }

        @SerialName("eventType")
        @JsonAnnotations2(names = {"event_type"})
        public static /* synthetic */ void getEvent_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final long getDuration_ms() {
            return this.duration_ms;
        }

        /* renamed from: component2, reason: from getter */
        public final String getError_message() {
            return this.error_message;
        }

        /* renamed from: component3, reason: from getter */
        public final ErrorTypeDto getError_type() {
            return this.error_type;
        }

        /* renamed from: component4, reason: from getter */
        public final EventTypeDto getEvent_type() {
            return this.event_type;
        }

        public final Surrogate copy(long duration_ms, String error_message, ErrorTypeDto error_type, EventTypeDto event_type) {
            Intrinsics.checkNotNullParameter(error_message, "error_message");
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(event_type, "event_type");
            return new Surrogate(duration_ms, error_message, error_type, event_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.duration_ms == surrogate.duration_ms && Intrinsics.areEqual(this.error_message, surrogate.error_message) && this.error_type == surrogate.error_type && this.event_type == surrogate.event_type;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.duration_ms) * 31) + this.error_message.hashCode()) * 31) + this.error_type.hashCode()) * 31) + this.event_type.hashCode();
        }

        public String toString() {
            return "Surrogate(duration_ms=" + this.duration_ms + ", error_message=" + this.error_message + ", error_type=" + this.error_type + ", event_type=" + this.event_type + ")";
        }

        /* compiled from: OAuthLoginEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OAuthLoginEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, long j, String str, ErrorTypeDto errorTypeDto, EventTypeDto eventTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.duration_ms = (i & 1) == 0 ? 0L : j;
            if ((i & 2) == 0) {
                this.error_message = "";
            } else {
                this.error_message = str;
            }
            if ((i & 4) == 0) {
                this.error_type = ErrorTypeDto.INSTANCE.getZeroValue();
            } else {
                this.error_type = errorTypeDto;
            }
            if ((i & 8) == 0) {
                this.event_type = EventTypeDto.INSTANCE.getZeroValue();
            } else {
                this.event_type = eventTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            long j = self.duration_ms;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            if (!Intrinsics.areEqual(self.error_message, "")) {
                output.encodeStringElement(serialDesc, 1, self.error_message);
            }
            if (self.error_type != ErrorTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ErrorTypeDto.Serializer.INSTANCE, self.error_type);
            }
            if (self.event_type != EventTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, EventTypeDto.Serializer.INSTANCE, self.event_type);
            }
        }

        public Surrogate(long j, String error_message, ErrorTypeDto error_type, EventTypeDto event_type) {
            Intrinsics.checkNotNullParameter(error_message, "error_message");
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(event_type, "event_type");
            this.duration_ms = j;
            this.error_message = error_message;
            this.error_type = error_type;
            this.event_type = event_type;
        }

        public final long getDuration_ms() {
            return this.duration_ms;
        }

        public final String getError_message() {
            return this.error_message;
        }

        public /* synthetic */ Surrogate(long j, String str, ErrorTypeDto errorTypeDto, EventTypeDto eventTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ErrorTypeDto.INSTANCE.getZeroValue() : errorTypeDto, (i & 8) != 0 ? EventTypeDto.INSTANCE.getZeroValue() : eventTypeDto);
        }

        public final ErrorTypeDto getError_type() {
            return this.error_type;
        }

        public final EventTypeDto getEvent_type() {
            return this.event_type;
        }
    }

    /* compiled from: OAuthLoginEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<OAuthLoginEventDataDto, OAuthLoginEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OAuthLoginEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OAuthLoginEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OAuthLoginEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) OAuthLoginEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OAuthLoginEventData> getProtoAdapter() {
            return OAuthLoginEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OAuthLoginEventDataDto getZeroValue() {
            return OAuthLoginEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OAuthLoginEventDataDto fromProto(OAuthLoginEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new OAuthLoginEventDataDto(new Surrogate(proto.getDuration_ms(), proto.getError_message(), ErrorTypeDto.INSTANCE.fromProto(proto.getError_type()), EventTypeDto.INSTANCE.fromProto(proto.getEvent_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OAuthLoginEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OAuthLoginEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OAuthLoginEventDataDto(0L, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OAuthLoginEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$ErrorType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR_TYPE_UNSPECIFIED", "MISSING_OAUTH_PARAMS", "AUTHORIZE_SUBMIT_FAILURE", "PLAID_MISSING_APPLICATION_ID", "PLAID_ERROR_FETCHING_APPLICATION_DETAILS", "UNIMPLEMENTED_OAUTH_CLIENT_ID", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ErrorTypeDto implements Dto2<OAuthLoginEventData.ErrorType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ErrorTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ErrorTypeDto, OAuthLoginEventData.ErrorType>> binaryBase64Serializer$delegate;
        public static final ErrorTypeDto ERROR_TYPE_UNSPECIFIED = new ERROR_TYPE_UNSPECIFIED("ERROR_TYPE_UNSPECIFIED", 0);
        public static final ErrorTypeDto MISSING_OAUTH_PARAMS = new MISSING_OAUTH_PARAMS("MISSING_OAUTH_PARAMS", 1);
        public static final ErrorTypeDto AUTHORIZE_SUBMIT_FAILURE = new AUTHORIZE_SUBMIT_FAILURE("AUTHORIZE_SUBMIT_FAILURE", 2);
        public static final ErrorTypeDto PLAID_MISSING_APPLICATION_ID = new PLAID_MISSING_APPLICATION_ID("PLAID_MISSING_APPLICATION_ID", 3);
        public static final ErrorTypeDto PLAID_ERROR_FETCHING_APPLICATION_DETAILS = new PLAID_ERROR_FETCHING_APPLICATION_DETAILS("PLAID_ERROR_FETCHING_APPLICATION_DETAILS", 4);
        public static final ErrorTypeDto UNIMPLEMENTED_OAUTH_CLIENT_ID = new UNIMPLEMENTED_OAUTH_CLIENT_ID("UNIMPLEMENTED_OAUTH_CLIENT_ID", 5);

        private static final /* synthetic */ ErrorTypeDto[] $values() {
            return new ErrorTypeDto[]{ERROR_TYPE_UNSPECIFIED, MISSING_OAUTH_PARAMS, AUTHORIZE_SUBMIT_FAILURE, PLAID_MISSING_APPLICATION_ID, PLAID_ERROR_FETCHING_APPLICATION_DETAILS, UNIMPLEMENTED_OAUTH_CLIENT_ID};
        }

        public /* synthetic */ ErrorTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ErrorTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: OAuthLoginEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto.ErrorTypeDto.ERROR_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR_TYPE_UNSPECIFIED extends ErrorTypeDto {
            ERROR_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthLoginEventData.ErrorType toProto() {
                return OAuthLoginEventData.ErrorType.ERROR_TYPE_UNSPECIFIED;
            }
        }

        private ErrorTypeDto(String str, int i) {
        }

        static {
            ErrorTypeDto[] errorTypeDtoArr$values = $values();
            $VALUES = errorTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OAuthLoginEventDataDto$ErrorTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OAuthLoginEventDataDto.ErrorTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: OAuthLoginEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto.ErrorTypeDto.MISSING_OAUTH_PARAMS", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MISSING_OAUTH_PARAMS extends ErrorTypeDto {
            MISSING_OAUTH_PARAMS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthLoginEventData.ErrorType toProto() {
                return OAuthLoginEventData.ErrorType.MISSING_OAUTH_PARAMS;
            }
        }

        /* compiled from: OAuthLoginEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto.ErrorTypeDto.AUTHORIZE_SUBMIT_FAILURE", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTHORIZE_SUBMIT_FAILURE extends ErrorTypeDto {
            AUTHORIZE_SUBMIT_FAILURE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthLoginEventData.ErrorType toProto() {
                return OAuthLoginEventData.ErrorType.AUTHORIZE_SUBMIT_FAILURE;
            }
        }

        /* compiled from: OAuthLoginEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto.ErrorTypeDto.PLAID_MISSING_APPLICATION_ID", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PLAID_MISSING_APPLICATION_ID extends ErrorTypeDto {
            PLAID_MISSING_APPLICATION_ID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthLoginEventData.ErrorType toProto() {
                return OAuthLoginEventData.ErrorType.PLAID_MISSING_APPLICATION_ID;
            }
        }

        /* compiled from: OAuthLoginEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto.ErrorTypeDto.PLAID_ERROR_FETCHING_APPLICATION_DETAILS", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PLAID_ERROR_FETCHING_APPLICATION_DETAILS extends ErrorTypeDto {
            PLAID_ERROR_FETCHING_APPLICATION_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthLoginEventData.ErrorType toProto() {
                return OAuthLoginEventData.ErrorType.PLAID_ERROR_FETCHING_APPLICATION_DETAILS;
            }
        }

        /* compiled from: OAuthLoginEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto.ErrorTypeDto.UNIMPLEMENTED_OAUTH_CLIENT_ID", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNIMPLEMENTED_OAUTH_CLIENT_ID extends ErrorTypeDto {
            UNIMPLEMENTED_OAUTH_CLIENT_ID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthLoginEventData.ErrorType toProto() {
                return OAuthLoginEventData.ErrorType.UNIMPLEMENTED_OAUTH_CLIENT_ID;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: OAuthLoginEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$ErrorType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ErrorTypeDto, OAuthLoginEventData.ErrorType> {

            /* compiled from: OAuthLoginEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OAuthLoginEventData.ErrorType.values().length];
                    try {
                        iArr[OAuthLoginEventData.ErrorType.ERROR_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OAuthLoginEventData.ErrorType.MISSING_OAUTH_PARAMS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[OAuthLoginEventData.ErrorType.AUTHORIZE_SUBMIT_FAILURE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[OAuthLoginEventData.ErrorType.PLAID_MISSING_APPLICATION_ID.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[OAuthLoginEventData.ErrorType.PLAID_ERROR_FETCHING_APPLICATION_DETAILS.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[OAuthLoginEventData.ErrorType.UNIMPLEMENTED_OAUTH_CLIENT_ID.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ErrorTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) ErrorTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<OAuthLoginEventData.ErrorType> getProtoAdapter() {
                return OAuthLoginEventData.ErrorType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorTypeDto getZeroValue() {
                return ErrorTypeDto.ERROR_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorTypeDto fromProto(OAuthLoginEventData.ErrorType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ErrorTypeDto.ERROR_TYPE_UNSPECIFIED;
                    case 2:
                        return ErrorTypeDto.MISSING_OAUTH_PARAMS;
                    case 3:
                        return ErrorTypeDto.AUTHORIZE_SUBMIT_FAILURE;
                    case 4:
                        return ErrorTypeDto.PLAID_MISSING_APPLICATION_ID;
                    case 5:
                        return ErrorTypeDto.PLAID_ERROR_FETCHING_APPLICATION_DETAILS;
                    case 6:
                        return ErrorTypeDto.UNIMPLEMENTED_OAUTH_CLIENT_ID;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: OAuthLoginEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$ErrorTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ErrorTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ErrorTypeDto, OAuthLoginEventData.ErrorType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.OAuthLoginEventData.ErrorType", ErrorTypeDto.getEntries(), ErrorTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ErrorTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ErrorTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ErrorTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ErrorTypeDto valueOf(String str) {
            return (ErrorTypeDto) Enum.valueOf(ErrorTypeDto.class, str);
        }

        public static ErrorTypeDto[] values() {
            return (ErrorTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OAuthLoginEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$EventType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_TYPE_UNSPECIFIED", "PLAID_APPLICATION_FETCHED", "AUTHORIZE_SUBMIT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EventTypeDto implements Dto2<OAuthLoginEventData.EventType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EventTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EventTypeDto, OAuthLoginEventData.EventType>> binaryBase64Serializer$delegate;
        public static final EventTypeDto EVENT_TYPE_UNSPECIFIED = new EVENT_TYPE_UNSPECIFIED("EVENT_TYPE_UNSPECIFIED", 0);
        public static final EventTypeDto PLAID_APPLICATION_FETCHED = new PLAID_APPLICATION_FETCHED("PLAID_APPLICATION_FETCHED", 1);
        public static final EventTypeDto AUTHORIZE_SUBMIT = new AUTHORIZE_SUBMIT("AUTHORIZE_SUBMIT", 2);

        private static final /* synthetic */ EventTypeDto[] $values() {
            return new EventTypeDto[]{EVENT_TYPE_UNSPECIFIED, PLAID_APPLICATION_FETCHED, AUTHORIZE_SUBMIT};
        }

        public /* synthetic */ EventTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EventTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: OAuthLoginEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto.EventTypeDto.EVENT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_TYPE_UNSPECIFIED extends EventTypeDto {
            EVENT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthLoginEventData.EventType toProto() {
                return OAuthLoginEventData.EventType.EVENT_TYPE_UNSPECIFIED;
            }
        }

        private EventTypeDto(String str, int i) {
        }

        static {
            EventTypeDto[] eventTypeDtoArr$values = $values();
            $VALUES = eventTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OAuthLoginEventDataDto$EventTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OAuthLoginEventDataDto.EventTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: OAuthLoginEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto.EventTypeDto.PLAID_APPLICATION_FETCHED", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PLAID_APPLICATION_FETCHED extends EventTypeDto {
            PLAID_APPLICATION_FETCHED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthLoginEventData.EventType toProto() {
                return OAuthLoginEventData.EventType.PLAID_APPLICATION_FETCHED;
            }
        }

        /* compiled from: OAuthLoginEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto.EventTypeDto.AUTHORIZE_SUBMIT", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTHORIZE_SUBMIT extends EventTypeDto {
            AUTHORIZE_SUBMIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OAuthLoginEventData.EventType toProto() {
                return OAuthLoginEventData.EventType.AUTHORIZE_SUBMIT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: OAuthLoginEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$EventType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EventTypeDto, OAuthLoginEventData.EventType> {

            /* compiled from: OAuthLoginEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OAuthLoginEventData.EventType.values().length];
                    try {
                        iArr[OAuthLoginEventData.EventType.EVENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OAuthLoginEventData.EventType.PLAID_APPLICATION_FETCHED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[OAuthLoginEventData.EventType.AUTHORIZE_SUBMIT.ordinal()] = 3;
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

            public final KSerializer<EventTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) EventTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<OAuthLoginEventData.EventType> getProtoAdapter() {
                return OAuthLoginEventData.EventType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventTypeDto getZeroValue() {
                return EventTypeDto.EVENT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventTypeDto fromProto(OAuthLoginEventData.EventType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return EventTypeDto.EVENT_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return EventTypeDto.PLAID_APPLICATION_FETCHED;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return EventTypeDto.AUTHORIZE_SUBMIT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: OAuthLoginEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$EventTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EventTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EventTypeDto, OAuthLoginEventData.EventType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.OAuthLoginEventData.EventType", EventTypeDto.getEntries(), EventTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EventTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EventTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EventTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EventTypeDto valueOf(String str) {
            return (EventTypeDto) Enum.valueOf(EventTypeDto.class, str);
        }

        public static EventTypeDto[] values() {
            return (EventTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: OAuthLoginEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OAuthLoginEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.OAuthLoginEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OAuthLoginEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OAuthLoginEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OAuthLoginEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OAuthLoginEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.OAuthLoginEventDataDto";
        }
    }
}

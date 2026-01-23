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
import com.robinhood.rosetta.eventlogging.ArkoseLabsEventData;
import com.robinhood.rosetta.eventlogging.ArkoseLabsEventDataDto;
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

/* compiled from: ArkoseLabsEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006*+,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0011J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\tJ\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$Surrogate;)V", "duration_ms", "", "error_message", "", "error_type", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;", "event_type", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "duration_ms_double", "(JLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;J)V", "getDuration_ms", "()J", "getError_message", "()Ljava/lang/String;", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;", "getEvent_type", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "getDuration_ms_double", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ErrorTypeDto", "EventTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ArkoseLabsEventDataDto implements Dto3<ArkoseLabsEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ArkoseLabsEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ArkoseLabsEventDataDto, ArkoseLabsEventData>> binaryBase64Serializer$delegate;
    private static final ArkoseLabsEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ArkoseLabsEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ArkoseLabsEventDataDto(Surrogate surrogate) {
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

    public final long getDuration_ms_double() {
        return this.surrogate.getDuration_ms_double();
    }

    public /* synthetic */ ArkoseLabsEventDataDto(long j, String str, ErrorTypeDto errorTypeDto, EventTypeDto eventTypeDto, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ErrorTypeDto.INSTANCE.getZeroValue() : errorTypeDto, (i & 8) != 0 ? EventTypeDto.INSTANCE.getZeroValue() : eventTypeDto, (i & 16) != 0 ? 0L : j2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArkoseLabsEventDataDto(long j, String error_message, ErrorTypeDto error_type, EventTypeDto event_type, long j2) {
        this(new Surrogate(j, error_message, error_type, event_type, j2));
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
    }

    public static /* synthetic */ ArkoseLabsEventDataDto copy$default(ArkoseLabsEventDataDto arkoseLabsEventDataDto, long j, String str, ErrorTypeDto errorTypeDto, EventTypeDto eventTypeDto, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = arkoseLabsEventDataDto.surrogate.getDuration_ms();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = arkoseLabsEventDataDto.surrogate.getError_message();
        }
        String str2 = str;
        if ((i & 4) != 0) {
            errorTypeDto = arkoseLabsEventDataDto.surrogate.getError_type();
        }
        ErrorTypeDto errorTypeDto2 = errorTypeDto;
        if ((i & 8) != 0) {
            eventTypeDto = arkoseLabsEventDataDto.surrogate.getEvent_type();
        }
        EventTypeDto eventTypeDto2 = eventTypeDto;
        if ((i & 16) != 0) {
            j2 = arkoseLabsEventDataDto.surrogate.getDuration_ms_double();
        }
        return arkoseLabsEventDataDto.copy(j3, str2, errorTypeDto2, eventTypeDto2, j2);
    }

    public final ArkoseLabsEventDataDto copy(long duration_ms, String error_message, ErrorTypeDto error_type, EventTypeDto event_type, long duration_ms_double) {
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        return new ArkoseLabsEventDataDto(new Surrogate(duration_ms, error_message, error_type, event_type, duration_ms_double));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ArkoseLabsEventData toProto() {
        return new ArkoseLabsEventData(this.surrogate.getDuration_ms(), this.surrogate.getError_message(), (ArkoseLabsEventData.ErrorType) this.surrogate.getError_type().toProto(), (ArkoseLabsEventData.EventType) this.surrogate.getEvent_type().toProto(), this.surrogate.getDuration_ms_double(), null, 32, null);
    }

    public String toString() {
        return "[ArkoseLabsEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ArkoseLabsEventDataDto) && Intrinsics.areEqual(((ArkoseLabsEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: ArkoseLabsEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000278BW\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\u0004\b\u000e\u0010\u000fBI\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\u0018\u0010$\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u0018\u0010(\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003JY\u0010)\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0017\b\u0002\u0010\r\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0011HÖ\u0001J\t\u0010.\u001a\u00020\bHÖ\u0001J%\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0001¢\u0006\u0002\b6R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010!R+\u0010\r\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$Surrogate;", "", "duration_ms", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "error_message", "", "error_type", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;", "event_type", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "duration_ms_double", "<init>", "(JLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;J)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDuration_ms$annotations", "()V", "getDuration_ms", "()J", "getError_message$annotations", "getError_message", "()Ljava/lang/String;", "getError_type$annotations", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;", "getEvent_type$annotations", "getEvent_type", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "getDuration_ms_double$annotations", "getDuration_ms_double", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long duration_ms;
        private final long duration_ms_double;
        private final String error_message;
        private final ErrorTypeDto error_type;
        private final EventTypeDto event_type;

        public Surrogate() {
            this(0L, (String) null, (ErrorTypeDto) null, (EventTypeDto) null, 0L, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, long j, String str, ErrorTypeDto errorTypeDto, EventTypeDto eventTypeDto, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = surrogate.duration_ms;
            }
            long j3 = j;
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
            EventTypeDto eventTypeDto2 = eventTypeDto;
            if ((i & 16) != 0) {
                j2 = surrogate.duration_ms_double;
            }
            return surrogate.copy(j3, str2, errorTypeDto2, eventTypeDto2, j2);
        }

        @SerialName("durationMs")
        @JsonAnnotations2(names = {"duration_ms"})
        public static /* synthetic */ void getDuration_ms$annotations() {
        }

        @SerialName("durationMsDouble")
        @JsonAnnotations2(names = {"duration_ms_double"})
        public static /* synthetic */ void getDuration_ms_double$annotations() {
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

        /* renamed from: component5, reason: from getter */
        public final long getDuration_ms_double() {
            return this.duration_ms_double;
        }

        public final Surrogate copy(long duration_ms, String error_message, ErrorTypeDto error_type, EventTypeDto event_type, long duration_ms_double) {
            Intrinsics.checkNotNullParameter(error_message, "error_message");
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(event_type, "event_type");
            return new Surrogate(duration_ms, error_message, error_type, event_type, duration_ms_double);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.duration_ms == surrogate.duration_ms && Intrinsics.areEqual(this.error_message, surrogate.error_message) && this.error_type == surrogate.error_type && this.event_type == surrogate.event_type && this.duration_ms_double == surrogate.duration_ms_double;
        }

        public int hashCode() {
            return (((((((Long.hashCode(this.duration_ms) * 31) + this.error_message.hashCode()) * 31) + this.error_type.hashCode()) * 31) + this.event_type.hashCode()) * 31) + Long.hashCode(this.duration_ms_double);
        }

        public String toString() {
            return "Surrogate(duration_ms=" + this.duration_ms + ", error_message=" + this.error_message + ", error_type=" + this.error_type + ", event_type=" + this.event_type + ", duration_ms_double=" + this.duration_ms_double + ")";
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ArkoseLabsEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, long j, String str, ErrorTypeDto errorTypeDto, EventTypeDto eventTypeDto, long j2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.duration_ms = 0L;
            } else {
                this.duration_ms = j;
            }
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
            if ((i & 16) == 0) {
                this.duration_ms_double = 0L;
            } else {
                this.duration_ms_double = j2;
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
            long j2 = self.duration_ms_double;
            if (j2 != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j2));
            }
        }

        public Surrogate(long j, String error_message, ErrorTypeDto error_type, EventTypeDto event_type, long j2) {
            Intrinsics.checkNotNullParameter(error_message, "error_message");
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(event_type, "event_type");
            this.duration_ms = j;
            this.error_message = error_message;
            this.error_type = error_type;
            this.event_type = event_type;
            this.duration_ms_double = j2;
        }

        public final long getDuration_ms() {
            return this.duration_ms;
        }

        public final String getError_message() {
            return this.error_message;
        }

        public /* synthetic */ Surrogate(long j, String str, ErrorTypeDto errorTypeDto, EventTypeDto eventTypeDto, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ErrorTypeDto.INSTANCE.getZeroValue() : errorTypeDto, (i & 8) != 0 ? EventTypeDto.INSTANCE.getZeroValue() : eventTypeDto, (i & 16) != 0 ? 0L : j2);
        }

        public final ErrorTypeDto getError_type() {
            return this.error_type;
        }

        public final EventTypeDto getEvent_type() {
            return this.event_type;
        }

        public final long getDuration_ms_double() {
            return this.duration_ms_double;
        }
    }

    /* compiled from: ArkoseLabsEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ArkoseLabsEventDataDto, ArkoseLabsEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ArkoseLabsEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ArkoseLabsEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ArkoseLabsEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) ArkoseLabsEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ArkoseLabsEventData> getProtoAdapter() {
            return ArkoseLabsEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ArkoseLabsEventDataDto getZeroValue() {
            return ArkoseLabsEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ArkoseLabsEventDataDto fromProto(ArkoseLabsEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ArkoseLabsEventDataDto(new Surrogate(proto.getDuration_ms(), proto.getError_message(), ErrorTypeDto.INSTANCE.fromProto(proto.getError_type()), EventTypeDto.INSTANCE.fromProto(proto.getEvent_type()), proto.getDuration_ms_double()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ArkoseLabsEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ArkoseLabsEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ArkoseLabsEventDataDto(0L, null, null, null, 0L, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ArkoseLabsEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$ErrorType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR_TYPE_UNSPECIFIED", "UNKNOWN", "TIMEOUT", "JAVASCRIPT_ERROR", "CLIENT_NOT_INSTANTIATED", "USER_OUT_OF_ATTEMPTS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ErrorTypeDto implements Dto2<ArkoseLabsEventData.ErrorType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ErrorTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ErrorTypeDto, ArkoseLabsEventData.ErrorType>> binaryBase64Serializer$delegate;
        public static final ErrorTypeDto ERROR_TYPE_UNSPECIFIED = new ERROR_TYPE_UNSPECIFIED("ERROR_TYPE_UNSPECIFIED", 0);
        public static final ErrorTypeDto UNKNOWN = new UNKNOWN("UNKNOWN", 1);
        public static final ErrorTypeDto TIMEOUT = new TIMEOUT("TIMEOUT", 2);
        public static final ErrorTypeDto JAVASCRIPT_ERROR = new JAVASCRIPT_ERROR("JAVASCRIPT_ERROR", 3);
        public static final ErrorTypeDto CLIENT_NOT_INSTANTIATED = new CLIENT_NOT_INSTANTIATED("CLIENT_NOT_INSTANTIATED", 4);
        public static final ErrorTypeDto USER_OUT_OF_ATTEMPTS = new USER_OUT_OF_ATTEMPTS("USER_OUT_OF_ATTEMPTS", 5);

        private static final /* synthetic */ ErrorTypeDto[] $values() {
            return new ErrorTypeDto[]{ERROR_TYPE_UNSPECIFIED, UNKNOWN, TIMEOUT, JAVASCRIPT_ERROR, CLIENT_NOT_INSTANTIATED, USER_OUT_OF_ATTEMPTS};
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

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.ErrorTypeDto.ERROR_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR_TYPE_UNSPECIFIED extends ErrorTypeDto {
            ERROR_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.ErrorType toProto() {
                return ArkoseLabsEventData.ErrorType.ERROR_TYPE_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ArkoseLabsEventDataDto$ErrorTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ArkoseLabsEventDataDto.ErrorTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.ErrorTypeDto.UNKNOWN", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNKNOWN extends ErrorTypeDto {
            UNKNOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.ErrorType toProto() {
                return ArkoseLabsEventData.ErrorType.UNKNOWN;
            }
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.ErrorTypeDto.TIMEOUT", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TIMEOUT extends ErrorTypeDto {
            TIMEOUT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.ErrorType toProto() {
                return ArkoseLabsEventData.ErrorType.TIMEOUT;
            }
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.ErrorTypeDto.JAVASCRIPT_ERROR", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class JAVASCRIPT_ERROR extends ErrorTypeDto {
            JAVASCRIPT_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.ErrorType toProto() {
                return ArkoseLabsEventData.ErrorType.JAVASCRIPT_ERROR;
            }
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.ErrorTypeDto.CLIENT_NOT_INSTANTIATED", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CLIENT_NOT_INSTANTIATED extends ErrorTypeDto {
            CLIENT_NOT_INSTANTIATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.ErrorType toProto() {
                return ArkoseLabsEventData.ErrorType.CLIENT_NOT_INSTANTIATED;
            }
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.ErrorTypeDto.USER_OUT_OF_ATTEMPTS", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class USER_OUT_OF_ATTEMPTS extends ErrorTypeDto {
            USER_OUT_OF_ATTEMPTS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.ErrorType toProto() {
                return ArkoseLabsEventData.ErrorType.USER_OUT_OF_ATTEMPTS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$ErrorType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ErrorTypeDto, ArkoseLabsEventData.ErrorType> {

            /* compiled from: ArkoseLabsEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ArkoseLabsEventData.ErrorType.values().length];
                    try {
                        iArr[ArkoseLabsEventData.ErrorType.ERROR_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.ErrorType.UNKNOWN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.ErrorType.TIMEOUT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.ErrorType.JAVASCRIPT_ERROR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.ErrorType.CLIENT_NOT_INSTANTIATED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.ErrorType.USER_OUT_OF_ATTEMPTS.ordinal()] = 6;
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
            public ProtoAdapter<ArkoseLabsEventData.ErrorType> getProtoAdapter() {
                return ArkoseLabsEventData.ErrorType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorTypeDto getZeroValue() {
                return ErrorTypeDto.ERROR_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorTypeDto fromProto(ArkoseLabsEventData.ErrorType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ErrorTypeDto.ERROR_TYPE_UNSPECIFIED;
                    case 2:
                        return ErrorTypeDto.UNKNOWN;
                    case 3:
                        return ErrorTypeDto.TIMEOUT;
                    case 4:
                        return ErrorTypeDto.JAVASCRIPT_ERROR;
                    case 5:
                        return ErrorTypeDto.CLIENT_NOT_INSTANTIATED;
                    case 6:
                        return ErrorTypeDto.USER_OUT_OF_ATTEMPTS;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$ErrorTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ErrorTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ErrorTypeDto, ArkoseLabsEventData.ErrorType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ArkoseLabsEventData.ErrorType", ErrorTypeDto.getEntries(), ErrorTypeDto.INSTANCE.getZeroValue());

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
    /* compiled from: ArkoseLabsEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_TYPE_UNSPECIFIED", "LOGIN_EVENT", "SIGNUP_EVENT", "ERROR_EVENT", "READY_EVENT", "RESET_EVENT", "HIDE_EVENT", "SUPPRESS_EVENT", "SHOW_EVENT", "SHOWN_EVENT", "COMPLETED_EVENT", "FAILED_EVENT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EventTypeDto implements Dto2<ArkoseLabsEventData.EventType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EventTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EventTypeDto, ArkoseLabsEventData.EventType>> binaryBase64Serializer$delegate;
        public static final EventTypeDto EVENT_TYPE_UNSPECIFIED = new EVENT_TYPE_UNSPECIFIED("EVENT_TYPE_UNSPECIFIED", 0);
        public static final EventTypeDto LOGIN_EVENT = new LOGIN_EVENT("LOGIN_EVENT", 1);
        public static final EventTypeDto SIGNUP_EVENT = new SIGNUP_EVENT("SIGNUP_EVENT", 2);
        public static final EventTypeDto ERROR_EVENT = new ERROR_EVENT("ERROR_EVENT", 3);
        public static final EventTypeDto READY_EVENT = new READY_EVENT("READY_EVENT", 4);
        public static final EventTypeDto RESET_EVENT = new RESET_EVENT("RESET_EVENT", 5);
        public static final EventTypeDto HIDE_EVENT = new HIDE_EVENT("HIDE_EVENT", 6);
        public static final EventTypeDto SUPPRESS_EVENT = new SUPPRESS_EVENT("SUPPRESS_EVENT", 7);
        public static final EventTypeDto SHOW_EVENT = new SHOW_EVENT("SHOW_EVENT", 8);
        public static final EventTypeDto SHOWN_EVENT = new SHOWN_EVENT("SHOWN_EVENT", 9);
        public static final EventTypeDto COMPLETED_EVENT = new COMPLETED_EVENT("COMPLETED_EVENT", 10);
        public static final EventTypeDto FAILED_EVENT = new FAILED_EVENT("FAILED_EVENT", 11);

        private static final /* synthetic */ EventTypeDto[] $values() {
            return new EventTypeDto[]{EVENT_TYPE_UNSPECIFIED, LOGIN_EVENT, SIGNUP_EVENT, ERROR_EVENT, READY_EVENT, RESET_EVENT, HIDE_EVENT, SUPPRESS_EVENT, SHOW_EVENT, SHOWN_EVENT, COMPLETED_EVENT, FAILED_EVENT};
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

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.EventTypeDto.EVENT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_TYPE_UNSPECIFIED extends EventTypeDto {
            EVENT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.EventType toProto() {
                return ArkoseLabsEventData.EventType.EVENT_TYPE_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ArkoseLabsEventDataDto$EventTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ArkoseLabsEventDataDto.EventTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.EventTypeDto.LOGIN_EVENT", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LOGIN_EVENT extends EventTypeDto {
            LOGIN_EVENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.EventType toProto() {
                return ArkoseLabsEventData.EventType.LOGIN_EVENT;
            }
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.EventTypeDto.SIGNUP_EVENT", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SIGNUP_EVENT extends EventTypeDto {
            SIGNUP_EVENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.EventType toProto() {
                return ArkoseLabsEventData.EventType.SIGNUP_EVENT;
            }
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.EventTypeDto.ERROR_EVENT", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR_EVENT extends EventTypeDto {
            ERROR_EVENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.EventType toProto() {
                return ArkoseLabsEventData.EventType.ERROR_EVENT;
            }
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.EventTypeDto.READY_EVENT", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class READY_EVENT extends EventTypeDto {
            READY_EVENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.EventType toProto() {
                return ArkoseLabsEventData.EventType.READY_EVENT;
            }
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.EventTypeDto.RESET_EVENT", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RESET_EVENT extends EventTypeDto {
            RESET_EVENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.EventType toProto() {
                return ArkoseLabsEventData.EventType.RESET_EVENT;
            }
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.EventTypeDto.HIDE_EVENT", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HIDE_EVENT extends EventTypeDto {
            HIDE_EVENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.EventType toProto() {
                return ArkoseLabsEventData.EventType.HIDE_EVENT;
            }
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.EventTypeDto.SUPPRESS_EVENT", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUPPRESS_EVENT extends EventTypeDto {
            SUPPRESS_EVENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.EventType toProto() {
                return ArkoseLabsEventData.EventType.SUPPRESS_EVENT;
            }
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.EventTypeDto.SHOW_EVENT", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SHOW_EVENT extends EventTypeDto {
            SHOW_EVENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.EventType toProto() {
                return ArkoseLabsEventData.EventType.SHOW_EVENT;
            }
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.EventTypeDto.SHOWN_EVENT", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SHOWN_EVENT extends EventTypeDto {
            SHOWN_EVENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.EventType toProto() {
                return ArkoseLabsEventData.EventType.SHOWN_EVENT;
            }
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.EventTypeDto.COMPLETED_EVENT", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class COMPLETED_EVENT extends EventTypeDto {
            COMPLETED_EVENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.EventType toProto() {
                return ArkoseLabsEventData.EventType.COMPLETED_EVENT;
            }
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto.EventTypeDto.FAILED_EVENT", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED_EVENT extends EventTypeDto {
            FAILED_EVENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ArkoseLabsEventData.EventType toProto() {
                return ArkoseLabsEventData.EventType.FAILED_EVENT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EventTypeDto, ArkoseLabsEventData.EventType> {

            /* compiled from: ArkoseLabsEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ArkoseLabsEventData.EventType.values().length];
                    try {
                        iArr[ArkoseLabsEventData.EventType.EVENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.EventType.LOGIN_EVENT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.EventType.SIGNUP_EVENT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.EventType.ERROR_EVENT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.EventType.READY_EVENT.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.EventType.RESET_EVENT.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.EventType.HIDE_EVENT.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.EventType.SUPPRESS_EVENT.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.EventType.SHOW_EVENT.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.EventType.SHOWN_EVENT.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.EventType.COMPLETED_EVENT.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[ArkoseLabsEventData.EventType.FAILED_EVENT.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
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
            public ProtoAdapter<ArkoseLabsEventData.EventType> getProtoAdapter() {
                return ArkoseLabsEventData.EventType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventTypeDto getZeroValue() {
                return EventTypeDto.EVENT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventTypeDto fromProto(ArkoseLabsEventData.EventType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return EventTypeDto.EVENT_TYPE_UNSPECIFIED;
                    case 2:
                        return EventTypeDto.LOGIN_EVENT;
                    case 3:
                        return EventTypeDto.SIGNUP_EVENT;
                    case 4:
                        return EventTypeDto.ERROR_EVENT;
                    case 5:
                        return EventTypeDto.READY_EVENT;
                    case 6:
                        return EventTypeDto.RESET_EVENT;
                    case 7:
                        return EventTypeDto.HIDE_EVENT;
                    case 8:
                        return EventTypeDto.SUPPRESS_EVENT;
                    case 9:
                        return EventTypeDto.SHOW_EVENT;
                    case 10:
                        return EventTypeDto.SHOWN_EVENT;
                    case 11:
                        return EventTypeDto.COMPLETED_EVENT;
                    case 12:
                        return EventTypeDto.FAILED_EVENT;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ArkoseLabsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$EventTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EventTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EventTypeDto, ArkoseLabsEventData.EventType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ArkoseLabsEventData.EventType", EventTypeDto.getEntries(), EventTypeDto.INSTANCE.getZeroValue());

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

    /* compiled from: ArkoseLabsEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ArkoseLabsEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ArkoseLabsEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ArkoseLabsEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ArkoseLabsEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ArkoseLabsEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ArkoseLabsEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ArkoseLabsEventDataDto";
        }
    }
}

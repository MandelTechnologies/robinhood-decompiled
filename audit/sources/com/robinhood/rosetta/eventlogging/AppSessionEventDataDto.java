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
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.AppSessionEventData;
import com.robinhood.rosetta.eventlogging.AppSessionEventDataDto;
import com.singular.sdk.internal.Constants;
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

/* compiled from: AppSessionEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\"#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0013\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bH\u0016J\b\u0010!\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$Surrogate;)V", "event_type", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "time_spent", "", "is_public_beta", "", "(Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;IZ)V", "getEvent_type", "()Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "getTime_spent", "()I", "()Z", "copy", "toProto", "toString", "", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "EventTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class AppSessionEventDataDto implements Dto3<AppSessionEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AppSessionEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AppSessionEventDataDto, AppSessionEventData>> binaryBase64Serializer$delegate;
    private static final AppSessionEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AppSessionEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AppSessionEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final EventTypeDto getEvent_type() {
        return this.surrogate.getEvent_type();
    }

    public final int getTime_spent() {
        return this.surrogate.getTime_spent();
    }

    public final boolean is_public_beta() {
        return this.surrogate.is_public_beta();
    }

    public /* synthetic */ AppSessionEventDataDto(EventTypeDto eventTypeDto, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EventTypeDto.INSTANCE.getZeroValue() : eventTypeDto, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppSessionEventDataDto(EventTypeDto event_type, int i, boolean z) {
        this(new Surrogate(event_type, i, z));
        Intrinsics.checkNotNullParameter(event_type, "event_type");
    }

    public static /* synthetic */ AppSessionEventDataDto copy$default(AppSessionEventDataDto appSessionEventDataDto, EventTypeDto eventTypeDto, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eventTypeDto = appSessionEventDataDto.surrogate.getEvent_type();
        }
        if ((i2 & 2) != 0) {
            i = appSessionEventDataDto.surrogate.getTime_spent();
        }
        if ((i2 & 4) != 0) {
            z = appSessionEventDataDto.surrogate.is_public_beta();
        }
        return appSessionEventDataDto.copy(eventTypeDto, i, z);
    }

    public final AppSessionEventDataDto copy(EventTypeDto event_type, int time_spent, boolean is_public_beta) {
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        return new AppSessionEventDataDto(new Surrogate(event_type, time_spent, is_public_beta));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AppSessionEventData toProto() {
        return new AppSessionEventData((AppSessionEventData.EventType) this.surrogate.getEvent_type().toProto(), this.surrogate.getTime_spent(), this.surrogate.is_public_beta(), null, 8, null);
    }

    public String toString() {
        return "[AppSessionEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AppSessionEventDataDto) && Intrinsics.areEqual(((AppSessionEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: AppSessionEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B4\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fB5\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\u001b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J6\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\t\u0010\u0019¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$Surrogate;", "", "event_type", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "time_spent", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "is_public_beta", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;IZ)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEvent_type$annotations", "()V", "getEvent_type", "()Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "getTime_spent$annotations", "getTime_spent", "()I", "is_public_beta$annotations", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final EventTypeDto event_type;
        private final boolean is_public_beta;
        private final int time_spent;

        public Surrogate() {
            this((EventTypeDto) null, 0, false, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, EventTypeDto eventTypeDto, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                eventTypeDto = surrogate.event_type;
            }
            if ((i2 & 2) != 0) {
                i = surrogate.time_spent;
            }
            if ((i2 & 4) != 0) {
                z = surrogate.is_public_beta;
            }
            return surrogate.copy(eventTypeDto, i, z);
        }

        @SerialName("eventType")
        @JsonAnnotations2(names = {"event_type"})
        public static /* synthetic */ void getEvent_type$annotations() {
        }

        @SerialName("timeSpent")
        @JsonAnnotations2(names = {"time_spent"})
        public static /* synthetic */ void getTime_spent$annotations() {
        }

        @SerialName("isPublicBeta")
        @JsonAnnotations2(names = {"is_public_beta"})
        public static /* synthetic */ void is_public_beta$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final EventTypeDto getEvent_type() {
            return this.event_type;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTime_spent() {
            return this.time_spent;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIs_public_beta() {
            return this.is_public_beta;
        }

        public final Surrogate copy(EventTypeDto event_type, int time_spent, boolean is_public_beta) {
            Intrinsics.checkNotNullParameter(event_type, "event_type");
            return new Surrogate(event_type, time_spent, is_public_beta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.event_type == surrogate.event_type && this.time_spent == surrogate.time_spent && this.is_public_beta == surrogate.is_public_beta;
        }

        public int hashCode() {
            return (((this.event_type.hashCode() * 31) + Integer.hashCode(this.time_spent)) * 31) + java.lang.Boolean.hashCode(this.is_public_beta);
        }

        public String toString() {
            return "Surrogate(event_type=" + this.event_type + ", time_spent=" + this.time_spent + ", is_public_beta=" + this.is_public_beta + ")";
        }

        /* compiled from: AppSessionEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AppSessionEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EventTypeDto eventTypeDto, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            this.event_type = (i & 1) == 0 ? EventTypeDto.INSTANCE.getZeroValue() : eventTypeDto;
            if ((i & 2) == 0) {
                this.time_spent = 0;
            } else {
                this.time_spent = i2;
            }
            if ((i & 4) == 0) {
                this.is_public_beta = false;
            } else {
                this.is_public_beta = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.event_type != EventTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, EventTypeDto.Serializer.INSTANCE, self.event_type);
            }
            int i = self.time_spent;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            boolean z = self.is_public_beta;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
        }

        public Surrogate(EventTypeDto event_type, int i, boolean z) {
            Intrinsics.checkNotNullParameter(event_type, "event_type");
            this.event_type = event_type;
            this.time_spent = i;
            this.is_public_beta = z;
        }

        public final EventTypeDto getEvent_type() {
            return this.event_type;
        }

        public /* synthetic */ Surrogate(EventTypeDto eventTypeDto, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? EventTypeDto.INSTANCE.getZeroValue() : eventTypeDto, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z);
        }

        public final int getTime_spent() {
            return this.time_spent;
        }

        public final boolean is_public_beta() {
            return this.is_public_beta;
        }
    }

    /* compiled from: AppSessionEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<AppSessionEventDataDto, AppSessionEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppSessionEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AppSessionEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AppSessionEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) AppSessionEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AppSessionEventData> getProtoAdapter() {
            return AppSessionEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AppSessionEventDataDto getZeroValue() {
            return AppSessionEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AppSessionEventDataDto fromProto(AppSessionEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new AppSessionEventDataDto(new Surrogate(EventTypeDto.INSTANCE.fromProto(proto.getEvent_type()), proto.getTime_spent(), proto.getIs_public_beta()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AppSessionEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppSessionEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AppSessionEventDataDto(null, 0, false, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppSessionEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_TYPE_UNSPECIFIED", Constants.API_TYPE_SESSION_START, "SESSION_END", "APP_FOREGROUND", "APP_BACKGROUND", "NOTIFICATIONS_ENABLED", "NOTIFICATIONS_DISABLED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EventTypeDto implements Dto2<AppSessionEventData.EventType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EventTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EventTypeDto, AppSessionEventData.EventType>> binaryBase64Serializer$delegate;
        public static final EventTypeDto EVENT_TYPE_UNSPECIFIED = new EVENT_TYPE_UNSPECIFIED("EVENT_TYPE_UNSPECIFIED", 0);
        public static final EventTypeDto SESSION_START = new SESSION_START(Constants.API_TYPE_SESSION_START, 1);
        public static final EventTypeDto SESSION_END = new SESSION_END("SESSION_END", 2);
        public static final EventTypeDto APP_FOREGROUND = new APP_FOREGROUND("APP_FOREGROUND", 3);
        public static final EventTypeDto APP_BACKGROUND = new APP_BACKGROUND("APP_BACKGROUND", 4);
        public static final EventTypeDto NOTIFICATIONS_ENABLED = new NOTIFICATIONS_ENABLED("NOTIFICATIONS_ENABLED", 5);
        public static final EventTypeDto NOTIFICATIONS_DISABLED = new NOTIFICATIONS_DISABLED("NOTIFICATIONS_DISABLED", 6);

        private static final /* synthetic */ EventTypeDto[] $values() {
            return new EventTypeDto[]{EVENT_TYPE_UNSPECIFIED, SESSION_START, SESSION_END, APP_FOREGROUND, APP_BACKGROUND, NOTIFICATIONS_ENABLED, NOTIFICATIONS_DISABLED};
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

        /* compiled from: AppSessionEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AppSessionEventDataDto.EventTypeDto.EVENT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_TYPE_UNSPECIFIED extends EventTypeDto {
            EVENT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AppSessionEventData.EventType toProto() {
                return AppSessionEventData.EventType.EVENT_TYPE_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AppSessionEventDataDto$EventTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AppSessionEventDataDto.EventTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: AppSessionEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AppSessionEventDataDto.EventTypeDto.SESSION_START", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SESSION_START extends EventTypeDto {
            SESSION_START(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AppSessionEventData.EventType toProto() {
                return AppSessionEventData.EventType.SESSION_START;
            }
        }

        /* compiled from: AppSessionEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AppSessionEventDataDto.EventTypeDto.SESSION_END", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SESSION_END extends EventTypeDto {
            SESSION_END(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AppSessionEventData.EventType toProto() {
                return AppSessionEventData.EventType.SESSION_END;
            }
        }

        /* compiled from: AppSessionEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AppSessionEventDataDto.EventTypeDto.APP_FOREGROUND", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APP_FOREGROUND extends EventTypeDto {
            APP_FOREGROUND(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AppSessionEventData.EventType toProto() {
                return AppSessionEventData.EventType.APP_FOREGROUND;
            }
        }

        /* compiled from: AppSessionEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AppSessionEventDataDto.EventTypeDto.APP_BACKGROUND", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APP_BACKGROUND extends EventTypeDto {
            APP_BACKGROUND(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AppSessionEventData.EventType toProto() {
                return AppSessionEventData.EventType.APP_BACKGROUND;
            }
        }

        /* compiled from: AppSessionEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AppSessionEventDataDto.EventTypeDto.NOTIFICATIONS_ENABLED", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NOTIFICATIONS_ENABLED extends EventTypeDto {
            NOTIFICATIONS_ENABLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AppSessionEventData.EventType toProto() {
                return AppSessionEventData.EventType.NOTIFICATIONS_ENABLED;
            }
        }

        /* compiled from: AppSessionEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AppSessionEventDataDto.EventTypeDto.NOTIFICATIONS_DISABLED", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NOTIFICATIONS_DISABLED extends EventTypeDto {
            NOTIFICATIONS_DISABLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AppSessionEventData.EventType toProto() {
                return AppSessionEventData.EventType.NOTIFICATIONS_DISABLED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: AppSessionEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EventTypeDto, AppSessionEventData.EventType> {

            /* compiled from: AppSessionEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AppSessionEventData.EventType.values().length];
                    try {
                        iArr[AppSessionEventData.EventType.EVENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AppSessionEventData.EventType.SESSION_START.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AppSessionEventData.EventType.SESSION_END.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AppSessionEventData.EventType.APP_FOREGROUND.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[AppSessionEventData.EventType.APP_BACKGROUND.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[AppSessionEventData.EventType.NOTIFICATIONS_ENABLED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[AppSessionEventData.EventType.NOTIFICATIONS_DISABLED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
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
            public ProtoAdapter<AppSessionEventData.EventType> getProtoAdapter() {
                return AppSessionEventData.EventType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventTypeDto getZeroValue() {
                return EventTypeDto.EVENT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventTypeDto fromProto(AppSessionEventData.EventType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return EventTypeDto.EVENT_TYPE_UNSPECIFIED;
                    case 2:
                        return EventTypeDto.SESSION_START;
                    case 3:
                        return EventTypeDto.SESSION_END;
                    case 4:
                        return EventTypeDto.APP_FOREGROUND;
                    case 5:
                        return EventTypeDto.APP_BACKGROUND;
                    case 6:
                        return EventTypeDto.NOTIFICATIONS_ENABLED;
                    case 7:
                        return EventTypeDto.NOTIFICATIONS_DISABLED;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AppSessionEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$EventTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EventTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EventTypeDto, AppSessionEventData.EventType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.AppSessionEventData.EventType", EventTypeDto.getEntries(), EventTypeDto.INSTANCE.getZeroValue());

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

    /* compiled from: AppSessionEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<AppSessionEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.AppSessionEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AppSessionEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AppSessionEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AppSessionEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AppSessionEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.AppSessionEventDataDto";
        }
    }
}

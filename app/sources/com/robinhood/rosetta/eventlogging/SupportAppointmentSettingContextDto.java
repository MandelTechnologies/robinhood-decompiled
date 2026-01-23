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
import com.robinhood.rosetta.eventlogging.SupportAppointmentSettingContext;
import com.robinhood.rosetta.eventlogging.SupportAppointmentSettingContextDto;
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

/* compiled from: SupportAppointmentSettingContextDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005$%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000eJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\tJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$Surrogate;)V", "case_intent", "", "campaign_id", "scheduling_type", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto;", "appointment_id", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto;Ljava/lang/String;)V", "getCase_intent", "()Ljava/lang/String;", "getCampaign_id", "getScheduling_type", "()Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto;", "getAppointment_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "AppointmentSchedulingTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class SupportAppointmentSettingContextDto implements Dto3<SupportAppointmentSettingContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SupportAppointmentSettingContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SupportAppointmentSettingContextDto, SupportAppointmentSettingContext>> binaryBase64Serializer$delegate;
    private static final SupportAppointmentSettingContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SupportAppointmentSettingContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SupportAppointmentSettingContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getCase_intent() {
        return this.surrogate.getCase_intent();
    }

    public final String getCampaign_id() {
        return this.surrogate.getCampaign_id();
    }

    public final AppointmentSchedulingTypeDto getScheduling_type() {
        return this.surrogate.getScheduling_type();
    }

    public final String getAppointment_id() {
        return this.surrogate.getAppointment_id();
    }

    public /* synthetic */ SupportAppointmentSettingContextDto(String str, String str2, AppointmentSchedulingTypeDto appointmentSchedulingTypeDto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? AppointmentSchedulingTypeDto.INSTANCE.getZeroValue() : appointmentSchedulingTypeDto, (i & 8) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SupportAppointmentSettingContextDto(String case_intent, String campaign_id, AppointmentSchedulingTypeDto scheduling_type, String appointment_id) {
        this(new Surrogate(case_intent, campaign_id, scheduling_type, appointment_id));
        Intrinsics.checkNotNullParameter(case_intent, "case_intent");
        Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
        Intrinsics.checkNotNullParameter(scheduling_type, "scheduling_type");
        Intrinsics.checkNotNullParameter(appointment_id, "appointment_id");
    }

    public static /* synthetic */ SupportAppointmentSettingContextDto copy$default(SupportAppointmentSettingContextDto supportAppointmentSettingContextDto, String str, String str2, AppointmentSchedulingTypeDto appointmentSchedulingTypeDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportAppointmentSettingContextDto.surrogate.getCase_intent();
        }
        if ((i & 2) != 0) {
            str2 = supportAppointmentSettingContextDto.surrogate.getCampaign_id();
        }
        if ((i & 4) != 0) {
            appointmentSchedulingTypeDto = supportAppointmentSettingContextDto.surrogate.getScheduling_type();
        }
        if ((i & 8) != 0) {
            str3 = supportAppointmentSettingContextDto.surrogate.getAppointment_id();
        }
        return supportAppointmentSettingContextDto.copy(str, str2, appointmentSchedulingTypeDto, str3);
    }

    public final SupportAppointmentSettingContextDto copy(String case_intent, String campaign_id, AppointmentSchedulingTypeDto scheduling_type, String appointment_id) {
        Intrinsics.checkNotNullParameter(case_intent, "case_intent");
        Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
        Intrinsics.checkNotNullParameter(scheduling_type, "scheduling_type");
        Intrinsics.checkNotNullParameter(appointment_id, "appointment_id");
        return new SupportAppointmentSettingContextDto(new Surrogate(case_intent, campaign_id, scheduling_type, appointment_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SupportAppointmentSettingContext toProto() {
        return new SupportAppointmentSettingContext(this.surrogate.getCase_intent(), this.surrogate.getCampaign_id(), (SupportAppointmentSettingContext.AppointmentSchedulingType) this.surrogate.getScheduling_type().toProto(), this.surrogate.getAppointment_id(), null, 16, null);
    }

    public String toString() {
        return "[SupportAppointmentSettingContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SupportAppointmentSettingContextDto) && Intrinsics.areEqual(((SupportAppointmentSettingContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: SupportAppointmentSettingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002,-B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$Surrogate;", "", "case_intent", "", "campaign_id", "scheduling_type", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto;", "appointment_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCase_intent$annotations", "()V", "getCase_intent", "()Ljava/lang/String;", "getCampaign_id$annotations", "getCampaign_id", "getScheduling_type$annotations", "getScheduling_type", "()Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto;", "getAppointment_id$annotations", "getAppointment_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String appointment_id;
        private final String campaign_id;
        private final String case_intent;
        private final AppointmentSchedulingTypeDto scheduling_type;

        public Surrogate() {
            this((String) null, (String) null, (AppointmentSchedulingTypeDto) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, AppointmentSchedulingTypeDto appointmentSchedulingTypeDto, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.case_intent;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.campaign_id;
            }
            if ((i & 4) != 0) {
                appointmentSchedulingTypeDto = surrogate.scheduling_type;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.appointment_id;
            }
            return surrogate.copy(str, str2, appointmentSchedulingTypeDto, str3);
        }

        @SerialName("appointmentId")
        @JsonAnnotations2(names = {"appointment_id"})
        public static /* synthetic */ void getAppointment_id$annotations() {
        }

        @SerialName("campaignId")
        @JsonAnnotations2(names = {"campaign_id"})
        public static /* synthetic */ void getCampaign_id$annotations() {
        }

        @SerialName("caseIntent")
        @JsonAnnotations2(names = {"case_intent"})
        public static /* synthetic */ void getCase_intent$annotations() {
        }

        @SerialName("schedulingType")
        @JsonAnnotations2(names = {"scheduling_type"})
        public static /* synthetic */ void getScheduling_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getCase_intent() {
            return this.case_intent;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCampaign_id() {
            return this.campaign_id;
        }

        /* renamed from: component3, reason: from getter */
        public final AppointmentSchedulingTypeDto getScheduling_type() {
            return this.scheduling_type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAppointment_id() {
            return this.appointment_id;
        }

        public final Surrogate copy(String case_intent, String campaign_id, AppointmentSchedulingTypeDto scheduling_type, String appointment_id) {
            Intrinsics.checkNotNullParameter(case_intent, "case_intent");
            Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
            Intrinsics.checkNotNullParameter(scheduling_type, "scheduling_type");
            Intrinsics.checkNotNullParameter(appointment_id, "appointment_id");
            return new Surrogate(case_intent, campaign_id, scheduling_type, appointment_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.case_intent, surrogate.case_intent) && Intrinsics.areEqual(this.campaign_id, surrogate.campaign_id) && this.scheduling_type == surrogate.scheduling_type && Intrinsics.areEqual(this.appointment_id, surrogate.appointment_id);
        }

        public int hashCode() {
            return (((((this.case_intent.hashCode() * 31) + this.campaign_id.hashCode()) * 31) + this.scheduling_type.hashCode()) * 31) + this.appointment_id.hashCode();
        }

        public String toString() {
            return "Surrogate(case_intent=" + this.case_intent + ", campaign_id=" + this.campaign_id + ", scheduling_type=" + this.scheduling_type + ", appointment_id=" + this.appointment_id + ")";
        }

        /* compiled from: SupportAppointmentSettingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SupportAppointmentSettingContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, AppointmentSchedulingTypeDto appointmentSchedulingTypeDto, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.case_intent = "";
            } else {
                this.case_intent = str;
            }
            if ((i & 2) == 0) {
                this.campaign_id = "";
            } else {
                this.campaign_id = str2;
            }
            if ((i & 4) == 0) {
                this.scheduling_type = AppointmentSchedulingTypeDto.INSTANCE.getZeroValue();
            } else {
                this.scheduling_type = appointmentSchedulingTypeDto;
            }
            if ((i & 8) == 0) {
                this.appointment_id = "";
            } else {
                this.appointment_id = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.case_intent, "")) {
                output.encodeStringElement(serialDesc, 0, self.case_intent);
            }
            if (!Intrinsics.areEqual(self.campaign_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.campaign_id);
            }
            if (self.scheduling_type != AppointmentSchedulingTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, AppointmentSchedulingTypeDto.Serializer.INSTANCE, self.scheduling_type);
            }
            if (Intrinsics.areEqual(self.appointment_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.appointment_id);
        }

        public Surrogate(String case_intent, String campaign_id, AppointmentSchedulingTypeDto scheduling_type, String appointment_id) {
            Intrinsics.checkNotNullParameter(case_intent, "case_intent");
            Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
            Intrinsics.checkNotNullParameter(scheduling_type, "scheduling_type");
            Intrinsics.checkNotNullParameter(appointment_id, "appointment_id");
            this.case_intent = case_intent;
            this.campaign_id = campaign_id;
            this.scheduling_type = scheduling_type;
            this.appointment_id = appointment_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, AppointmentSchedulingTypeDto appointmentSchedulingTypeDto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? AppointmentSchedulingTypeDto.INSTANCE.getZeroValue() : appointmentSchedulingTypeDto, (i & 8) != 0 ? "" : str3);
        }

        public final String getCase_intent() {
            return this.case_intent;
        }

        public final String getCampaign_id() {
            return this.campaign_id;
        }

        public final AppointmentSchedulingTypeDto getScheduling_type() {
            return this.scheduling_type;
        }

        public final String getAppointment_id() {
            return this.appointment_id;
        }
    }

    /* compiled from: SupportAppointmentSettingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto;", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<SupportAppointmentSettingContextDto, SupportAppointmentSettingContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SupportAppointmentSettingContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SupportAppointmentSettingContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SupportAppointmentSettingContextDto> getBinaryBase64Serializer() {
            return (KSerializer) SupportAppointmentSettingContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SupportAppointmentSettingContext> getProtoAdapter() {
            return SupportAppointmentSettingContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SupportAppointmentSettingContextDto getZeroValue() {
            return SupportAppointmentSettingContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SupportAppointmentSettingContextDto fromProto(SupportAppointmentSettingContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new SupportAppointmentSettingContextDto(new Surrogate(proto.getCase_intent(), proto.getCampaign_id(), AppointmentSchedulingTypeDto.INSTANCE.fromProto(proto.getScheduling_type()), proto.getAppointment_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.SupportAppointmentSettingContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportAppointmentSettingContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SupportAppointmentSettingContextDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SupportAppointmentSettingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContext$AppointmentSchedulingType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED", "SCHEDULE", "RESCHEDULE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AppointmentSchedulingTypeDto implements Dto2<SupportAppointmentSettingContext.AppointmentSchedulingType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AppointmentSchedulingTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AppointmentSchedulingTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AppointmentSchedulingTypeDto, SupportAppointmentSettingContext.AppointmentSchedulingType>> binaryBase64Serializer$delegate;
        public static final AppointmentSchedulingTypeDto APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED = new APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED("APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED", 0);
        public static final AppointmentSchedulingTypeDto SCHEDULE = new SCHEDULE("SCHEDULE", 1);
        public static final AppointmentSchedulingTypeDto RESCHEDULE = new RESCHEDULE("RESCHEDULE", 2);

        private static final /* synthetic */ AppointmentSchedulingTypeDto[] $values() {
            return new AppointmentSchedulingTypeDto[]{APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED, SCHEDULE, RESCHEDULE};
        }

        public /* synthetic */ AppointmentSchedulingTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AppointmentSchedulingTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private AppointmentSchedulingTypeDto(String str, int i) {
        }

        /* compiled from: SupportAppointmentSettingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto.AppointmentSchedulingTypeDto.APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContext$AppointmentSchedulingType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED extends AppointmentSchedulingTypeDto {
            APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SupportAppointmentSettingContext.AppointmentSchedulingType toProto() {
                return SupportAppointmentSettingContext.AppointmentSchedulingType.APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED;
            }
        }

        static {
            AppointmentSchedulingTypeDto[] appointmentSchedulingTypeDtoArr$values = $values();
            $VALUES = appointmentSchedulingTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(appointmentSchedulingTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SupportAppointmentSettingContextDto.AppointmentSchedulingTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: SupportAppointmentSettingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto.AppointmentSchedulingTypeDto.SCHEDULE", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContext$AppointmentSchedulingType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SCHEDULE extends AppointmentSchedulingTypeDto {
            SCHEDULE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SupportAppointmentSettingContext.AppointmentSchedulingType toProto() {
                return SupportAppointmentSettingContext.AppointmentSchedulingType.SCHEDULE;
            }
        }

        /* compiled from: SupportAppointmentSettingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto.AppointmentSchedulingTypeDto.RESCHEDULE", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContext$AppointmentSchedulingType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RESCHEDULE extends AppointmentSchedulingTypeDto {
            RESCHEDULE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SupportAppointmentSettingContext.AppointmentSchedulingType toProto() {
                return SupportAppointmentSettingContext.AppointmentSchedulingType.RESCHEDULE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: SupportAppointmentSettingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto;", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContext$AppointmentSchedulingType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AppointmentSchedulingTypeDto, SupportAppointmentSettingContext.AppointmentSchedulingType> {

            /* compiled from: SupportAppointmentSettingContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SupportAppointmentSettingContext.AppointmentSchedulingType.values().length];
                    try {
                        iArr[SupportAppointmentSettingContext.AppointmentSchedulingType.APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SupportAppointmentSettingContext.AppointmentSchedulingType.SCHEDULE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SupportAppointmentSettingContext.AppointmentSchedulingType.RESCHEDULE.ordinal()] = 3;
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

            public final KSerializer<AppointmentSchedulingTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AppointmentSchedulingTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AppointmentSchedulingTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) AppointmentSchedulingTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<SupportAppointmentSettingContext.AppointmentSchedulingType> getProtoAdapter() {
                return SupportAppointmentSettingContext.AppointmentSchedulingType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AppointmentSchedulingTypeDto getZeroValue() {
                return AppointmentSchedulingTypeDto.APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AppointmentSchedulingTypeDto fromProto(SupportAppointmentSettingContext.AppointmentSchedulingType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AppointmentSchedulingTypeDto.APPOINTMENT_SCHEDULING_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return AppointmentSchedulingTypeDto.SCHEDULE;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return AppointmentSchedulingTypeDto.RESCHEDULE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SupportAppointmentSettingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$AppointmentSchedulingTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<AppointmentSchedulingTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AppointmentSchedulingTypeDto, SupportAppointmentSettingContext.AppointmentSchedulingType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.SupportAppointmentSettingContext.AppointmentSchedulingType", AppointmentSchedulingTypeDto.getEntries(), AppointmentSchedulingTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AppointmentSchedulingTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AppointmentSchedulingTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AppointmentSchedulingTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AppointmentSchedulingTypeDto valueOf(String str) {
            return (AppointmentSchedulingTypeDto) Enum.valueOf(AppointmentSchedulingTypeDto.class, str);
        }

        public static AppointmentSchedulingTypeDto[] values() {
            return (AppointmentSchedulingTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: SupportAppointmentSettingContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SupportAppointmentSettingContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.SupportAppointmentSettingContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SupportAppointmentSettingContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SupportAppointmentSettingContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SupportAppointmentSettingContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SupportAppointmentSettingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SupportAppointmentSettingContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.SupportAppointmentSettingContextDto";
        }
    }
}

package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContext;
import com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContextDto;
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

/* compiled from: SlipOnboardingCheckboxContextDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#$%&'B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$Surrogate;)V", "individual", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;", "ira_roth", "ira_traditional", "joint_tenancy_with_ros", "(Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;)V", "getIndividual", "()Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;", "getIra_roth", "getIra_traditional", "getJoint_tenancy_with_ros", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "CheckboxStateDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class SlipOnboardingCheckboxContextDto implements Dto3<SlipOnboardingCheckboxContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SlipOnboardingCheckboxContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SlipOnboardingCheckboxContextDto, SlipOnboardingCheckboxContext>> binaryBase64Serializer$delegate;
    private static final SlipOnboardingCheckboxContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SlipOnboardingCheckboxContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SlipOnboardingCheckboxContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CheckboxStateDto getIndividual() {
        return this.surrogate.getIndividual();
    }

    public final CheckboxStateDto getIra_roth() {
        return this.surrogate.getIra_roth();
    }

    public final CheckboxStateDto getIra_traditional() {
        return this.surrogate.getIra_traditional();
    }

    public final CheckboxStateDto getJoint_tenancy_with_ros() {
        return this.surrogate.getJoint_tenancy_with_ros();
    }

    public /* synthetic */ SlipOnboardingCheckboxContextDto(CheckboxStateDto checkboxStateDto, CheckboxStateDto checkboxStateDto2, CheckboxStateDto checkboxStateDto3, CheckboxStateDto checkboxStateDto4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CheckboxStateDto.INSTANCE.getZeroValue() : checkboxStateDto, (i & 2) != 0 ? CheckboxStateDto.INSTANCE.getZeroValue() : checkboxStateDto2, (i & 4) != 0 ? CheckboxStateDto.INSTANCE.getZeroValue() : checkboxStateDto3, (i & 8) != 0 ? CheckboxStateDto.INSTANCE.getZeroValue() : checkboxStateDto4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlipOnboardingCheckboxContextDto(CheckboxStateDto individual, CheckboxStateDto ira_roth, CheckboxStateDto ira_traditional, CheckboxStateDto joint_tenancy_with_ros) {
        this(new Surrogate(individual, ira_roth, ira_traditional, joint_tenancy_with_ros));
        Intrinsics.checkNotNullParameter(individual, "individual");
        Intrinsics.checkNotNullParameter(ira_roth, "ira_roth");
        Intrinsics.checkNotNullParameter(ira_traditional, "ira_traditional");
        Intrinsics.checkNotNullParameter(joint_tenancy_with_ros, "joint_tenancy_with_ros");
    }

    public static /* synthetic */ SlipOnboardingCheckboxContextDto copy$default(SlipOnboardingCheckboxContextDto slipOnboardingCheckboxContextDto, CheckboxStateDto checkboxStateDto, CheckboxStateDto checkboxStateDto2, CheckboxStateDto checkboxStateDto3, CheckboxStateDto checkboxStateDto4, int i, Object obj) {
        if ((i & 1) != 0) {
            checkboxStateDto = slipOnboardingCheckboxContextDto.surrogate.getIndividual();
        }
        if ((i & 2) != 0) {
            checkboxStateDto2 = slipOnboardingCheckboxContextDto.surrogate.getIra_roth();
        }
        if ((i & 4) != 0) {
            checkboxStateDto3 = slipOnboardingCheckboxContextDto.surrogate.getIra_traditional();
        }
        if ((i & 8) != 0) {
            checkboxStateDto4 = slipOnboardingCheckboxContextDto.surrogate.getJoint_tenancy_with_ros();
        }
        return slipOnboardingCheckboxContextDto.copy(checkboxStateDto, checkboxStateDto2, checkboxStateDto3, checkboxStateDto4);
    }

    public final SlipOnboardingCheckboxContextDto copy(CheckboxStateDto individual, CheckboxStateDto ira_roth, CheckboxStateDto ira_traditional, CheckboxStateDto joint_tenancy_with_ros) {
        Intrinsics.checkNotNullParameter(individual, "individual");
        Intrinsics.checkNotNullParameter(ira_roth, "ira_roth");
        Intrinsics.checkNotNullParameter(ira_traditional, "ira_traditional");
        Intrinsics.checkNotNullParameter(joint_tenancy_with_ros, "joint_tenancy_with_ros");
        return new SlipOnboardingCheckboxContextDto(new Surrogate(individual, ira_roth, ira_traditional, joint_tenancy_with_ros));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SlipOnboardingCheckboxContext toProto() {
        return new SlipOnboardingCheckboxContext((SlipOnboardingCheckboxContext.CheckboxState) this.surrogate.getIndividual().toProto(), (SlipOnboardingCheckboxContext.CheckboxState) this.surrogate.getIra_roth().toProto(), (SlipOnboardingCheckboxContext.CheckboxState) this.surrogate.getIra_traditional().toProto(), (SlipOnboardingCheckboxContext.CheckboxState) this.surrogate.getJoint_tenancy_with_ros().toProto(), null, 16, null);
    }

    public String toString() {
        return "[SlipOnboardingCheckboxContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SlipOnboardingCheckboxContextDto) && Intrinsics.areEqual(((SlipOnboardingCheckboxContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: SlipOnboardingCheckboxContextDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$Surrogate;", "", "individual", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;", "ira_roth", "ira_traditional", "joint_tenancy_with_ros", "<init>", "(Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIndividual$annotations", "()V", "getIndividual", "()Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;", "getIra_roth$annotations", "getIra_roth", "getIra_traditional$annotations", "getIra_traditional", "getJoint_tenancy_with_ros$annotations", "getJoint_tenancy_with_ros", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CheckboxStateDto individual;
        private final CheckboxStateDto ira_roth;
        private final CheckboxStateDto ira_traditional;
        private final CheckboxStateDto joint_tenancy_with_ros;

        public Surrogate() {
            this((CheckboxStateDto) null, (CheckboxStateDto) null, (CheckboxStateDto) null, (CheckboxStateDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, CheckboxStateDto checkboxStateDto, CheckboxStateDto checkboxStateDto2, CheckboxStateDto checkboxStateDto3, CheckboxStateDto checkboxStateDto4, int i, Object obj) {
            if ((i & 1) != 0) {
                checkboxStateDto = surrogate.individual;
            }
            if ((i & 2) != 0) {
                checkboxStateDto2 = surrogate.ira_roth;
            }
            if ((i & 4) != 0) {
                checkboxStateDto3 = surrogate.ira_traditional;
            }
            if ((i & 8) != 0) {
                checkboxStateDto4 = surrogate.joint_tenancy_with_ros;
            }
            return surrogate.copy(checkboxStateDto, checkboxStateDto2, checkboxStateDto3, checkboxStateDto4);
        }

        @SerialName("individual")
        @JsonAnnotations2(names = {"individual"})
        public static /* synthetic */ void getIndividual$annotations() {
        }

        @SerialName("iraRoth")
        @JsonAnnotations2(names = {"ira_roth"})
        public static /* synthetic */ void getIra_roth$annotations() {
        }

        @SerialName("iraTraditional")
        @JsonAnnotations2(names = {"ira_traditional"})
        public static /* synthetic */ void getIra_traditional$annotations() {
        }

        @SerialName("jointTenancyWithRos")
        @JsonAnnotations2(names = {"joint_tenancy_with_ros"})
        public static /* synthetic */ void getJoint_tenancy_with_ros$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CheckboxStateDto getIndividual() {
            return this.individual;
        }

        /* renamed from: component2, reason: from getter */
        public final CheckboxStateDto getIra_roth() {
            return this.ira_roth;
        }

        /* renamed from: component3, reason: from getter */
        public final CheckboxStateDto getIra_traditional() {
            return this.ira_traditional;
        }

        /* renamed from: component4, reason: from getter */
        public final CheckboxStateDto getJoint_tenancy_with_ros() {
            return this.joint_tenancy_with_ros;
        }

        public final Surrogate copy(CheckboxStateDto individual, CheckboxStateDto ira_roth, CheckboxStateDto ira_traditional, CheckboxStateDto joint_tenancy_with_ros) {
            Intrinsics.checkNotNullParameter(individual, "individual");
            Intrinsics.checkNotNullParameter(ira_roth, "ira_roth");
            Intrinsics.checkNotNullParameter(ira_traditional, "ira_traditional");
            Intrinsics.checkNotNullParameter(joint_tenancy_with_ros, "joint_tenancy_with_ros");
            return new Surrogate(individual, ira_roth, ira_traditional, joint_tenancy_with_ros);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.individual == surrogate.individual && this.ira_roth == surrogate.ira_roth && this.ira_traditional == surrogate.ira_traditional && this.joint_tenancy_with_ros == surrogate.joint_tenancy_with_ros;
        }

        public int hashCode() {
            return (((((this.individual.hashCode() * 31) + this.ira_roth.hashCode()) * 31) + this.ira_traditional.hashCode()) * 31) + this.joint_tenancy_with_ros.hashCode();
        }

        public String toString() {
            return "Surrogate(individual=" + this.individual + ", ira_roth=" + this.ira_roth + ", ira_traditional=" + this.ira_traditional + ", joint_tenancy_with_ros=" + this.joint_tenancy_with_ros + ")";
        }

        /* compiled from: SlipOnboardingCheckboxContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SlipOnboardingCheckboxContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CheckboxStateDto checkboxStateDto, CheckboxStateDto checkboxStateDto2, CheckboxStateDto checkboxStateDto3, CheckboxStateDto checkboxStateDto4, SerializationConstructorMarker serializationConstructorMarker) {
            this.individual = (i & 1) == 0 ? CheckboxStateDto.INSTANCE.getZeroValue() : checkboxStateDto;
            if ((i & 2) == 0) {
                this.ira_roth = CheckboxStateDto.INSTANCE.getZeroValue();
            } else {
                this.ira_roth = checkboxStateDto2;
            }
            if ((i & 4) == 0) {
                this.ira_traditional = CheckboxStateDto.INSTANCE.getZeroValue();
            } else {
                this.ira_traditional = checkboxStateDto3;
            }
            if ((i & 8) == 0) {
                this.joint_tenancy_with_ros = CheckboxStateDto.INSTANCE.getZeroValue();
            } else {
                this.joint_tenancy_with_ros = checkboxStateDto4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            CheckboxStateDto checkboxStateDto = self.individual;
            CheckboxStateDto.Companion companion = CheckboxStateDto.INSTANCE;
            if (checkboxStateDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, CheckboxStateDto.Serializer.INSTANCE, self.individual);
            }
            if (self.ira_roth != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, CheckboxStateDto.Serializer.INSTANCE, self.ira_roth);
            }
            if (self.ira_traditional != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, CheckboxStateDto.Serializer.INSTANCE, self.ira_traditional);
            }
            if (self.joint_tenancy_with_ros != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, CheckboxStateDto.Serializer.INSTANCE, self.joint_tenancy_with_ros);
            }
        }

        public Surrogate(CheckboxStateDto individual, CheckboxStateDto ira_roth, CheckboxStateDto ira_traditional, CheckboxStateDto joint_tenancy_with_ros) {
            Intrinsics.checkNotNullParameter(individual, "individual");
            Intrinsics.checkNotNullParameter(ira_roth, "ira_roth");
            Intrinsics.checkNotNullParameter(ira_traditional, "ira_traditional");
            Intrinsics.checkNotNullParameter(joint_tenancy_with_ros, "joint_tenancy_with_ros");
            this.individual = individual;
            this.ira_roth = ira_roth;
            this.ira_traditional = ira_traditional;
            this.joint_tenancy_with_ros = joint_tenancy_with_ros;
        }

        public final CheckboxStateDto getIndividual() {
            return this.individual;
        }

        public /* synthetic */ Surrogate(CheckboxStateDto checkboxStateDto, CheckboxStateDto checkboxStateDto2, CheckboxStateDto checkboxStateDto3, CheckboxStateDto checkboxStateDto4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CheckboxStateDto.INSTANCE.getZeroValue() : checkboxStateDto, (i & 2) != 0 ? CheckboxStateDto.INSTANCE.getZeroValue() : checkboxStateDto2, (i & 4) != 0 ? CheckboxStateDto.INSTANCE.getZeroValue() : checkboxStateDto3, (i & 8) != 0 ? CheckboxStateDto.INSTANCE.getZeroValue() : checkboxStateDto4);
        }

        public final CheckboxStateDto getIra_roth() {
            return this.ira_roth;
        }

        public final CheckboxStateDto getIra_traditional() {
            return this.ira_traditional;
        }

        public final CheckboxStateDto getJoint_tenancy_with_ros() {
            return this.joint_tenancy_with_ros;
        }
    }

    /* compiled from: SlipOnboardingCheckboxContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto;", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<SlipOnboardingCheckboxContextDto, SlipOnboardingCheckboxContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SlipOnboardingCheckboxContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SlipOnboardingCheckboxContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SlipOnboardingCheckboxContextDto> getBinaryBase64Serializer() {
            return (KSerializer) SlipOnboardingCheckboxContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SlipOnboardingCheckboxContext> getProtoAdapter() {
            return SlipOnboardingCheckboxContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SlipOnboardingCheckboxContextDto getZeroValue() {
            return SlipOnboardingCheckboxContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SlipOnboardingCheckboxContextDto fromProto(SlipOnboardingCheckboxContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            CheckboxStateDto.Companion companion = CheckboxStateDto.INSTANCE;
            return new SlipOnboardingCheckboxContextDto(new Surrogate(companion.fromProto(proto.getIndividual()), companion.fromProto(proto.getIra_roth()), companion.fromProto(proto.getIra_traditional()), companion.fromProto(proto.getJoint_tenancy_with_ros())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SlipOnboardingCheckboxContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SlipOnboardingCheckboxContextDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SlipOnboardingCheckboxContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", EducationTourScreenNames.UNSPECIFIED_SCREEN, "NONE", "UNCHECKED", "CHECKED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CheckboxStateDto implements Dto2<SlipOnboardingCheckboxContext.CheckboxState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckboxStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CheckboxStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CheckboxStateDto, SlipOnboardingCheckboxContext.CheckboxState>> binaryBase64Serializer$delegate;
        public static final CheckboxStateDto UNSPECIFIED = new UNSPECIFIED(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0);
        public static final CheckboxStateDto NONE = new NONE("NONE", 1);
        public static final CheckboxStateDto UNCHECKED = new UNCHECKED("UNCHECKED", 2);
        public static final CheckboxStateDto CHECKED = new CHECKED("CHECKED", 3);

        private static final /* synthetic */ CheckboxStateDto[] $values() {
            return new CheckboxStateDto[]{UNSPECIFIED, NONE, UNCHECKED, CHECKED};
        }

        public /* synthetic */ CheckboxStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CheckboxStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CheckboxStateDto(String str, int i) {
        }

        /* compiled from: SlipOnboardingCheckboxContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto.CheckboxStateDto.UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNSPECIFIED extends CheckboxStateDto {
            UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SlipOnboardingCheckboxContext.CheckboxState toProto() {
                return SlipOnboardingCheckboxContext.CheckboxState.UNSPECIFIED;
            }
        }

        static {
            CheckboxStateDto[] checkboxStateDtoArr$values = $values();
            $VALUES = checkboxStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(checkboxStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContextDto$CheckboxStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SlipOnboardingCheckboxContextDto.CheckboxStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: SlipOnboardingCheckboxContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto.CheckboxStateDto.NONE", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NONE extends CheckboxStateDto {
            NONE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SlipOnboardingCheckboxContext.CheckboxState toProto() {
                return SlipOnboardingCheckboxContext.CheckboxState.NONE;
            }
        }

        /* compiled from: SlipOnboardingCheckboxContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto.CheckboxStateDto.UNCHECKED", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNCHECKED extends CheckboxStateDto {
            UNCHECKED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SlipOnboardingCheckboxContext.CheckboxState toProto() {
                return SlipOnboardingCheckboxContext.CheckboxState.UNCHECKED;
            }
        }

        /* compiled from: SlipOnboardingCheckboxContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto.CheckboxStateDto.CHECKED", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHECKED extends CheckboxStateDto {
            CHECKED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SlipOnboardingCheckboxContext.CheckboxState toProto() {
                return SlipOnboardingCheckboxContext.CheckboxState.CHECKED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: SlipOnboardingCheckboxContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CheckboxStateDto, SlipOnboardingCheckboxContext.CheckboxState> {

            /* compiled from: SlipOnboardingCheckboxContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SlipOnboardingCheckboxContext.CheckboxState.values().length];
                    try {
                        iArr[SlipOnboardingCheckboxContext.CheckboxState.UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SlipOnboardingCheckboxContext.CheckboxState.NONE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SlipOnboardingCheckboxContext.CheckboxState.UNCHECKED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SlipOnboardingCheckboxContext.CheckboxState.CHECKED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CheckboxStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CheckboxStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CheckboxStateDto> getBinaryBase64Serializer() {
                return (KSerializer) CheckboxStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<SlipOnboardingCheckboxContext.CheckboxState> getProtoAdapter() {
                return SlipOnboardingCheckboxContext.CheckboxState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CheckboxStateDto getZeroValue() {
                return CheckboxStateDto.UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CheckboxStateDto fromProto(SlipOnboardingCheckboxContext.CheckboxState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CheckboxStateDto.UNSPECIFIED;
                }
                if (i == 2) {
                    return CheckboxStateDto.NONE;
                }
                if (i == 3) {
                    return CheckboxStateDto.UNCHECKED;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return CheckboxStateDto.CHECKED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SlipOnboardingCheckboxContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$CheckboxStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CheckboxStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CheckboxStateDto, SlipOnboardingCheckboxContext.CheckboxState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.SlipOnboardingCheckboxContext.CheckboxState", CheckboxStateDto.getEntries(), CheckboxStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CheckboxStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CheckboxStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CheckboxStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CheckboxStateDto valueOf(String str) {
            return (CheckboxStateDto) Enum.valueOf(CheckboxStateDto.class, str);
        }

        public static CheckboxStateDto[] values() {
            return (CheckboxStateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: SlipOnboardingCheckboxContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<SlipOnboardingCheckboxContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.SlipOnboardingCheckboxContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SlipOnboardingCheckboxContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SlipOnboardingCheckboxContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SlipOnboardingCheckboxContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SlipOnboardingCheckboxContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContextDto";
        }
    }
}

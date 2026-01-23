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
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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

/* compiled from: MachineDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0012JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u000eJ\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\u000eH\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u000eH\u0016J\b\u0010*\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MachineDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/Machine;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MachineDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MachineDto$Surrogate;)V", "model", "", "cpu", "processor_speed", "", "core_count", "", "os", "os_version", "physical_memory", "(Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;Ljava/lang/String;I)V", "getModel", "()Ljava/lang/String;", "getCpu", "getProcessor_speed", "()F", "getCore_count", "()I", "getOs", "getOs_version", "getPhysical_memory", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class MachineDto implements Dto3<Machine>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MachineDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MachineDto, Machine>> binaryBase64Serializer$delegate;
    private static final MachineDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MachineDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MachineDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getModel() {
        return this.surrogate.getModel();
    }

    public final String getCpu() {
        return this.surrogate.getCpu();
    }

    public final float getProcessor_speed() {
        return this.surrogate.getProcessor_speed();
    }

    public final int getCore_count() {
        return this.surrogate.getCore_count();
    }

    public final String getOs() {
        return this.surrogate.getOs();
    }

    public final String getOs_version() {
        return this.surrogate.getOs_version();
    }

    public final int getPhysical_memory() {
        return this.surrogate.getPhysical_memory();
    }

    public /* synthetic */ MachineDto(String str, String str2, float f, int i, String str3, String str4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0.0f : f, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MachineDto(String model, String cpu, float f, int i, String os, String os_version, int i2) {
        this(new Surrogate(model, cpu, f, i, os, os_version, i2));
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(cpu, "cpu");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
    }

    public static /* synthetic */ MachineDto copy$default(MachineDto machineDto, String str, String str2, float f, int i, String str3, String str4, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = machineDto.surrogate.getModel();
        }
        if ((i3 & 2) != 0) {
            str2 = machineDto.surrogate.getCpu();
        }
        if ((i3 & 4) != 0) {
            f = machineDto.surrogate.getProcessor_speed();
        }
        if ((i3 & 8) != 0) {
            i = machineDto.surrogate.getCore_count();
        }
        if ((i3 & 16) != 0) {
            str3 = machineDto.surrogate.getOs();
        }
        if ((i3 & 32) != 0) {
            str4 = machineDto.surrogate.getOs_version();
        }
        if ((i3 & 64) != 0) {
            i2 = machineDto.surrogate.getPhysical_memory();
        }
        String str5 = str4;
        int i4 = i2;
        String str6 = str3;
        float f2 = f;
        return machineDto.copy(str, str2, f2, i, str6, str5, i4);
    }

    public final MachineDto copy(String model, String cpu, float processor_speed, int core_count, String os, String os_version, int physical_memory) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(cpu, "cpu");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        return new MachineDto(new Surrogate(model, cpu, processor_speed, core_count, os, os_version, physical_memory));
    }

    @Override // com.robinhood.idl.Dto
    public Machine toProto() {
        return new Machine(this.surrogate.getModel(), this.surrogate.getCpu(), this.surrogate.getProcessor_speed(), this.surrogate.getCore_count(), this.surrogate.getOs(), this.surrogate.getOs_version(), this.surrogate.getPhysical_memory(), null, 128, null);
    }

    public String toString() {
        return "[MachineDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MachineDto) && Intrinsics.areEqual(((MachineDto) other).surrogate, this.surrogate);
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
    /* compiled from: MachineDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002=>Bz\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\f¢\u0006\u0004\b\u0010\u0010\u0011B[\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0018\u0010*\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u0018\u0010+\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\fHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0018\u0010.\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\fHÆ\u0003J|\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u0017\b\u0002\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u0017\b\u0002\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\fHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u000bHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J%\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0001¢\u0006\u0002\b<R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR+\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010!R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R+\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010!¨\u0006?"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MachineDto$Surrogate;", "", "model", "", "cpu", "processor_speed", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "core_count", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "os", "os_version", "physical_memory", "<init>", "(Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;Ljava/lang/String;I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;FILjava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getModel$annotations", "()V", "getModel", "()Ljava/lang/String;", "getCpu$annotations", "getCpu", "getProcessor_speed$annotations", "getProcessor_speed", "()F", "getCore_count$annotations", "getCore_count", "()I", "getOs$annotations", "getOs", "getOs_version$annotations", "getOs_version", "getPhysical_memory$annotations", "getPhysical_memory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int core_count;
        private final String cpu;
        private final String model;
        private final String os;
        private final String os_version;
        private final int physical_memory;
        private final float processor_speed;

        public Surrogate() {
            this((String) null, (String) null, 0.0f, 0, (String) null, (String) null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, float f, int i, String str3, String str4, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = surrogate.model;
            }
            if ((i3 & 2) != 0) {
                str2 = surrogate.cpu;
            }
            if ((i3 & 4) != 0) {
                f = surrogate.processor_speed;
            }
            if ((i3 & 8) != 0) {
                i = surrogate.core_count;
            }
            if ((i3 & 16) != 0) {
                str3 = surrogate.os;
            }
            if ((i3 & 32) != 0) {
                str4 = surrogate.os_version;
            }
            if ((i3 & 64) != 0) {
                i2 = surrogate.physical_memory;
            }
            String str5 = str4;
            int i4 = i2;
            String str6 = str3;
            float f2 = f;
            return surrogate.copy(str, str2, f2, i, str6, str5, i4);
        }

        @SerialName("coreCount")
        @JsonAnnotations2(names = {"core_count"})
        public static /* synthetic */ void getCore_count$annotations() {
        }

        @SerialName("cpu")
        @JsonAnnotations2(names = {"cpu"})
        public static /* synthetic */ void getCpu$annotations() {
        }

        @SerialName("model")
        @JsonAnnotations2(names = {"model"})
        public static /* synthetic */ void getModel$annotations() {
        }

        @SerialName("os")
        @JsonAnnotations2(names = {"os"})
        public static /* synthetic */ void getOs$annotations() {
        }

        @SerialName("osVersion")
        @JsonAnnotations2(names = {"os_version"})
        public static /* synthetic */ void getOs_version$annotations() {
        }

        @SerialName("physicalMemory")
        @JsonAnnotations2(names = {"physical_memory"})
        public static /* synthetic */ void getPhysical_memory$annotations() {
        }

        @SerialName("processorSpeed")
        @JsonAnnotations2(names = {"processor_speed"})
        public static /* synthetic */ void getProcessor_speed$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCpu() {
            return this.cpu;
        }

        /* renamed from: component3, reason: from getter */
        public final float getProcessor_speed() {
            return this.processor_speed;
        }

        /* renamed from: component4, reason: from getter */
        public final int getCore_count() {
            return this.core_count;
        }

        /* renamed from: component5, reason: from getter */
        public final String getOs() {
            return this.os;
        }

        /* renamed from: component6, reason: from getter */
        public final String getOs_version() {
            return this.os_version;
        }

        /* renamed from: component7, reason: from getter */
        public final int getPhysical_memory() {
            return this.physical_memory;
        }

        public final Surrogate copy(String model, String cpu, float processor_speed, int core_count, String os, String os_version, int physical_memory) {
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(cpu, "cpu");
            Intrinsics.checkNotNullParameter(os, "os");
            Intrinsics.checkNotNullParameter(os_version, "os_version");
            return new Surrogate(model, cpu, processor_speed, core_count, os, os_version, physical_memory);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.model, surrogate.model) && Intrinsics.areEqual(this.cpu, surrogate.cpu) && Float.compare(this.processor_speed, surrogate.processor_speed) == 0 && this.core_count == surrogate.core_count && Intrinsics.areEqual(this.os, surrogate.os) && Intrinsics.areEqual(this.os_version, surrogate.os_version) && this.physical_memory == surrogate.physical_memory;
        }

        public int hashCode() {
            return (((((((((((this.model.hashCode() * 31) + this.cpu.hashCode()) * 31) + Float.hashCode(this.processor_speed)) * 31) + Integer.hashCode(this.core_count)) * 31) + this.os.hashCode()) * 31) + this.os_version.hashCode()) * 31) + Integer.hashCode(this.physical_memory);
        }

        public String toString() {
            return "Surrogate(model=" + this.model + ", cpu=" + this.cpu + ", processor_speed=" + this.processor_speed + ", core_count=" + this.core_count + ", os=" + this.os + ", os_version=" + this.os_version + ", physical_memory=" + this.physical_memory + ")";
        }

        /* compiled from: MachineDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MachineDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MachineDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MachineDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, float f, int i2, String str3, String str4, int i3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.model = "";
            } else {
                this.model = str;
            }
            if ((i & 2) == 0) {
                this.cpu = "";
            } else {
                this.cpu = str2;
            }
            if ((i & 4) == 0) {
                this.processor_speed = 0.0f;
            } else {
                this.processor_speed = f;
            }
            if ((i & 8) == 0) {
                this.core_count = 0;
            } else {
                this.core_count = i2;
            }
            if ((i & 16) == 0) {
                this.os = "";
            } else {
                this.os = str3;
            }
            if ((i & 32) == 0) {
                this.os_version = "";
            } else {
                this.os_version = str4;
            }
            if ((i & 64) == 0) {
                this.physical_memory = 0;
            } else {
                this.physical_memory = i3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.model, "")) {
                output.encodeStringElement(serialDesc, 0, self.model);
            }
            if (!Intrinsics.areEqual(self.cpu, "")) {
                output.encodeStringElement(serialDesc, 1, self.cpu);
            }
            if (Float.compare(self.processor_speed, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 2, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.processor_speed));
            }
            int i = self.core_count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.os, "")) {
                output.encodeStringElement(serialDesc, 4, self.os);
            }
            if (!Intrinsics.areEqual(self.os_version, "")) {
                output.encodeStringElement(serialDesc, 5, self.os_version);
            }
            int i2 = self.physical_memory;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
        }

        public Surrogate(String model, String cpu, float f, int i, String os, String os_version, int i2) {
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(cpu, "cpu");
            Intrinsics.checkNotNullParameter(os, "os");
            Intrinsics.checkNotNullParameter(os_version, "os_version");
            this.model = model;
            this.cpu = cpu;
            this.processor_speed = f;
            this.core_count = i;
            this.os = os;
            this.os_version = os_version;
            this.physical_memory = i2;
        }

        public /* synthetic */ Surrogate(String str, String str2, float f, int i, String str3, String str4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0.0f : f, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? 0 : i2);
        }

        public final String getModel() {
            return this.model;
        }

        public final String getCpu() {
            return this.cpu;
        }

        public final float getProcessor_speed() {
            return this.processor_speed;
        }

        public final int getCore_count() {
            return this.core_count;
        }

        public final String getOs() {
            return this.os;
        }

        public final String getOs_version() {
            return this.os_version;
        }

        public final int getPhysical_memory() {
            return this.physical_memory;
        }
    }

    /* compiled from: MachineDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MachineDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MachineDto;", "Lcom/robinhood/rosetta/eventlogging/Machine;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MachineDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<MachineDto, Machine> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MachineDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MachineDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MachineDto> getBinaryBase64Serializer() {
            return (KSerializer) MachineDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Machine> getProtoAdapter() {
            return Machine.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MachineDto getZeroValue() {
            return MachineDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MachineDto fromProto(Machine proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new MachineDto(new Surrogate(proto.getModel(), proto.getCpu(), proto.getProcessor_speed(), proto.getCore_count(), proto.getOs(), proto.getOs_version(), proto.getPhysical_memory()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MachineDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MachineDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MachineDto(null, null, 0.0f, 0, null, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MachineDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MachineDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MachineDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MachineDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<MachineDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.Machine", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MachineDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MachineDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MachineDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MachineDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MachineDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.MachineDto";
        }
    }
}

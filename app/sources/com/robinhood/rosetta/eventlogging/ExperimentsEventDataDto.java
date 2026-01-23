package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.TriggeringExperimentsDto;
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

/* compiled from: ExperimentsEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 !\"#B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001c\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto$Surrogate;)V", "assignments", "", "triggering_data", "Lcom/robinhood/rosetta/eventlogging/TriggeringExperimentsDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/TriggeringExperimentsDto;)V", "getAssignments", "()Ljava/lang/String;", "getTriggering_data", "()Lcom/robinhood/rosetta/eventlogging/TriggeringExperimentsDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ExperimentsEventDataDto implements Dto3<ExperimentsEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ExperimentsEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ExperimentsEventDataDto, ExperimentsEventData>> binaryBase64Serializer$delegate;
    private static final ExperimentsEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ExperimentsEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ExperimentsEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAssignments() {
        return this.surrogate.getAssignments();
    }

    public final TriggeringExperimentsDto getTriggering_data() {
        return this.surrogate.getTriggering_data();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExperimentsEventDataDto(String assignments, TriggeringExperimentsDto triggeringExperimentsDto) {
        this(new Surrogate(assignments, triggeringExperimentsDto));
        Intrinsics.checkNotNullParameter(assignments, "assignments");
    }

    public /* synthetic */ ExperimentsEventDataDto(String str, TriggeringExperimentsDto triggeringExperimentsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : triggeringExperimentsDto);
    }

    public static /* synthetic */ ExperimentsEventDataDto copy$default(ExperimentsEventDataDto experimentsEventDataDto, String str, TriggeringExperimentsDto triggeringExperimentsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = experimentsEventDataDto.surrogate.getAssignments();
        }
        if ((i & 2) != 0) {
            triggeringExperimentsDto = experimentsEventDataDto.surrogate.getTriggering_data();
        }
        return experimentsEventDataDto.copy(str, triggeringExperimentsDto);
    }

    public final ExperimentsEventDataDto copy(String assignments, TriggeringExperimentsDto triggering_data) {
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        return new ExperimentsEventDataDto(new Surrogate(assignments, triggering_data));
    }

    @Override // com.robinhood.idl.Dto
    public ExperimentsEventData toProto() {
        String assignments = this.surrogate.getAssignments();
        TriggeringExperimentsDto triggering_data = this.surrogate.getTriggering_data();
        return new ExperimentsEventData(assignments, triggering_data != null ? triggering_data.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[ExperimentsEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ExperimentsEventDataDto) && Intrinsics.areEqual(((ExperimentsEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: ExperimentsEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto$Surrogate;", "", "assignments", "", "triggering_data", "Lcom/robinhood/rosetta/eventlogging/TriggeringExperimentsDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/TriggeringExperimentsDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/TriggeringExperimentsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAssignments$annotations", "()V", "getAssignments", "()Ljava/lang/String;", "getTriggering_data$annotations", "getTriggering_data", "()Lcom/robinhood/rosetta/eventlogging/TriggeringExperimentsDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String assignments;
        private final TriggeringExperimentsDto triggering_data;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((String) null, (TriggeringExperimentsDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, TriggeringExperimentsDto triggeringExperimentsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.assignments;
            }
            if ((i & 2) != 0) {
                triggeringExperimentsDto = surrogate.triggering_data;
            }
            return surrogate.copy(str, triggeringExperimentsDto);
        }

        @SerialName("assignments")
        @JsonAnnotations2(names = {"assignments"})
        public static /* synthetic */ void getAssignments$annotations() {
        }

        @SerialName("triggeringData")
        @JsonAnnotations2(names = {"triggering_data"})
        public static /* synthetic */ void getTriggering_data$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAssignments() {
            return this.assignments;
        }

        /* renamed from: component2, reason: from getter */
        public final TriggeringExperimentsDto getTriggering_data() {
            return this.triggering_data;
        }

        public final Surrogate copy(String assignments, TriggeringExperimentsDto triggering_data) {
            Intrinsics.checkNotNullParameter(assignments, "assignments");
            return new Surrogate(assignments, triggering_data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.assignments, surrogate.assignments) && Intrinsics.areEqual(this.triggering_data, surrogate.triggering_data);
        }

        public int hashCode() {
            int iHashCode = this.assignments.hashCode() * 31;
            TriggeringExperimentsDto triggeringExperimentsDto = this.triggering_data;
            return iHashCode + (triggeringExperimentsDto == null ? 0 : triggeringExperimentsDto.hashCode());
        }

        public String toString() {
            return "Surrogate(assignments=" + this.assignments + ", triggering_data=" + this.triggering_data + ")";
        }

        /* compiled from: ExperimentsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ExperimentsEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, TriggeringExperimentsDto triggeringExperimentsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.assignments = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.triggering_data = null;
            } else {
                this.triggering_data = triggeringExperimentsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.assignments, "")) {
                output.encodeStringElement(serialDesc, 0, self.assignments);
            }
            TriggeringExperimentsDto triggeringExperimentsDto = self.triggering_data;
            if (triggeringExperimentsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TriggeringExperimentsDto.Serializer.INSTANCE, triggeringExperimentsDto);
            }
        }

        public Surrogate(String assignments, TriggeringExperimentsDto triggeringExperimentsDto) {
            Intrinsics.checkNotNullParameter(assignments, "assignments");
            this.assignments = assignments;
            this.triggering_data = triggeringExperimentsDto;
        }

        public final String getAssignments() {
            return this.assignments;
        }

        public /* synthetic */ Surrogate(String str, TriggeringExperimentsDto triggeringExperimentsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : triggeringExperimentsDto);
        }

        public final TriggeringExperimentsDto getTriggering_data() {
            return this.triggering_data;
        }
    }

    /* compiled from: ExperimentsEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ExperimentsEventDataDto, ExperimentsEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ExperimentsEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ExperimentsEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ExperimentsEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) ExperimentsEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ExperimentsEventData> getProtoAdapter() {
            return ExperimentsEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ExperimentsEventDataDto getZeroValue() {
            return ExperimentsEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ExperimentsEventDataDto fromProto(ExperimentsEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String assignments = proto.getAssignments();
            TriggeringExperiments triggering_data = proto.getTriggering_data();
            return new ExperimentsEventDataDto(new Surrogate(assignments, triggering_data != null ? TriggeringExperimentsDto.INSTANCE.fromProto(triggering_data) : null), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ExperimentsEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ExperimentsEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ExperimentsEventDataDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ExperimentsEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ExperimentsEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ExperimentsEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ExperimentsEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ExperimentsEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ExperimentsEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: ExperimentsEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ExperimentsEventDataDto";
        }
    }
}

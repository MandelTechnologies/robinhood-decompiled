package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.SuitabilityCheckpointDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: GetCheckpointSuitabilityRequestDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 !\"#B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto$Surrogate;)V", "rhs_account_number", "", "checkpoint", "Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;)V", "getRhs_account_number", "()Ljava/lang/String;", "getCheckpoint", "()Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class GetCheckpointSuitabilityRequestDto implements Dto3<GetCheckpointSuitabilityRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCheckpointSuitabilityRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCheckpointSuitabilityRequestDto, GetCheckpointSuitabilityRequest>> binaryBase64Serializer$delegate;
    private static final GetCheckpointSuitabilityRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCheckpointSuitabilityRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCheckpointSuitabilityRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRhs_account_number() {
        return this.surrogate.getRhs_account_number();
    }

    public final SuitabilityCheckpointDto getCheckpoint() {
        return this.surrogate.getCheckpoint();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCheckpointSuitabilityRequestDto(String rhs_account_number, SuitabilityCheckpointDto checkpoint) {
        this(new Surrogate(rhs_account_number, checkpoint));
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(checkpoint, "checkpoint");
    }

    public /* synthetic */ GetCheckpointSuitabilityRequestDto(String str, SuitabilityCheckpointDto suitabilityCheckpointDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SuitabilityCheckpointDto.INSTANCE.getZeroValue() : suitabilityCheckpointDto);
    }

    public static /* synthetic */ GetCheckpointSuitabilityRequestDto copy$default(GetCheckpointSuitabilityRequestDto getCheckpointSuitabilityRequestDto, String str, SuitabilityCheckpointDto suitabilityCheckpointDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCheckpointSuitabilityRequestDto.surrogate.getRhs_account_number();
        }
        if ((i & 2) != 0) {
            suitabilityCheckpointDto = getCheckpointSuitabilityRequestDto.surrogate.getCheckpoint();
        }
        return getCheckpointSuitabilityRequestDto.copy(str, suitabilityCheckpointDto);
    }

    public final GetCheckpointSuitabilityRequestDto copy(String rhs_account_number, SuitabilityCheckpointDto checkpoint) {
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(checkpoint, "checkpoint");
        return new GetCheckpointSuitabilityRequestDto(new Surrogate(rhs_account_number, checkpoint));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetCheckpointSuitabilityRequest toProto() {
        return new GetCheckpointSuitabilityRequest(this.surrogate.getRhs_account_number(), (SuitabilityCheckpoint) this.surrogate.getCheckpoint().toProto(), null, 4, null);
    }

    public String toString() {
        return "[GetCheckpointSuitabilityRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCheckpointSuitabilityRequestDto) && Intrinsics.areEqual(((GetCheckpointSuitabilityRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCheckpointSuitabilityRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto$Surrogate;", "", "rhs_account_number", "", "checkpoint", "Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRhs_account_number$annotations", "()V", "getRhs_account_number", "()Ljava/lang/String;", "getCheckpoint$annotations", "getCheckpoint", "()Lcom/robinhood/ceres/v1/SuitabilityCheckpointDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final SuitabilityCheckpointDto checkpoint;
        private final String rhs_account_number;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((String) null, (SuitabilityCheckpointDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, SuitabilityCheckpointDto suitabilityCheckpointDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.rhs_account_number;
            }
            if ((i & 2) != 0) {
                suitabilityCheckpointDto = surrogate.checkpoint;
            }
            return surrogate.copy(str, suitabilityCheckpointDto);
        }

        @SerialName("checkpoint")
        @JsonAnnotations2(names = {"checkpoint"})
        public static /* synthetic */ void getCheckpoint$annotations() {
        }

        @SerialName("rhsAccountNumber")
        @JsonAnnotations2(names = {"rhs_account_number"})
        public static /* synthetic */ void getRhs_account_number$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        /* renamed from: component2, reason: from getter */
        public final SuitabilityCheckpointDto getCheckpoint() {
            return this.checkpoint;
        }

        public final Surrogate copy(String rhs_account_number, SuitabilityCheckpointDto checkpoint) {
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(checkpoint, "checkpoint");
            return new Surrogate(rhs_account_number, checkpoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && this.checkpoint == surrogate.checkpoint;
        }

        public int hashCode() {
            return (this.rhs_account_number.hashCode() * 31) + this.checkpoint.hashCode();
        }

        public String toString() {
            return "Surrogate(rhs_account_number=" + this.rhs_account_number + ", checkpoint=" + this.checkpoint + ")";
        }

        /* compiled from: GetCheckpointSuitabilityRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCheckpointSuitabilityRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, SuitabilityCheckpointDto suitabilityCheckpointDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.rhs_account_number = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.checkpoint = SuitabilityCheckpointDto.INSTANCE.getZeroValue();
            } else {
                this.checkpoint = suitabilityCheckpointDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.rhs_account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.rhs_account_number);
            }
            if (self.checkpoint != SuitabilityCheckpointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SuitabilityCheckpointDto.Serializer.INSTANCE, self.checkpoint);
            }
        }

        public Surrogate(String rhs_account_number, SuitabilityCheckpointDto checkpoint) {
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(checkpoint, "checkpoint");
            this.rhs_account_number = rhs_account_number;
            this.checkpoint = checkpoint;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public /* synthetic */ Surrogate(String str, SuitabilityCheckpointDto suitabilityCheckpointDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SuitabilityCheckpointDto.INSTANCE.getZeroValue() : suitabilityCheckpointDto);
        }

        public final SuitabilityCheckpointDto getCheckpoint() {
            return this.checkpoint;
        }
    }

    /* compiled from: GetCheckpointSuitabilityRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto;", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetCheckpointSuitabilityRequestDto, GetCheckpointSuitabilityRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCheckpointSuitabilityRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCheckpointSuitabilityRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCheckpointSuitabilityRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCheckpointSuitabilityRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCheckpointSuitabilityRequest> getProtoAdapter() {
            return GetCheckpointSuitabilityRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCheckpointSuitabilityRequestDto getZeroValue() {
            return GetCheckpointSuitabilityRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCheckpointSuitabilityRequestDto fromProto(GetCheckpointSuitabilityRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetCheckpointSuitabilityRequestDto(new Surrogate(proto.getRhs_account_number(), SuitabilityCheckpointDto.INSTANCE.fromProto(proto.getCheckpoint())), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.GetCheckpointSuitabilityRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCheckpointSuitabilityRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetCheckpointSuitabilityRequestDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCheckpointSuitabilityRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetCheckpointSuitabilityRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.GetCheckpointSuitabilityRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCheckpointSuitabilityRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCheckpointSuitabilityRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCheckpointSuitabilityRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: GetCheckpointSuitabilityRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.GetCheckpointSuitabilityRequestDto";
        }
    }
}

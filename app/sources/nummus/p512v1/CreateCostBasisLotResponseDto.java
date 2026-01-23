package nummus.p512v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nummus.p512v1.CostBasisLotsSummaryDto;
import nummus.p512v1.ValidationInfoDto;

/* compiled from: CreateCostBasisLotResponseDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lnummus/v1/CreateCostBasisLotResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/CreateCostBasisLotResponse;", "Landroid/os/Parcelable;", "Lnummus/v1/CreateCostBasisLotResponseDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/CreateCostBasisLotResponseDto$Surrogate;)V", "", "lot_id", "status", "Lnummus/v1/ValidationInfoDto;", "validation", "Lnummus/v1/CostBasisLotsSummaryDto;", "deposit_summary", "(Ljava/lang/String;Ljava/lang/String;Lnummus/v1/ValidationInfoDto;Lnummus/v1/CostBasisLotsSummaryDto;)V", "toProto", "()Lnummus/v1/CreateCostBasisLotResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/CreateCostBasisLotResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class CreateCostBasisLotResponseDto implements Dto3<CreateCostBasisLotResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreateCostBasisLotResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreateCostBasisLotResponseDto, CreateCostBasisLotResponse>> binaryBase64Serializer$delegate;
    private static final CreateCostBasisLotResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreateCostBasisLotResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreateCostBasisLotResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ CreateCostBasisLotResponseDto(String str, String str2, ValidationInfoDto validationInfoDto, CostBasisLotsSummaryDto costBasisLotsSummaryDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : validationInfoDto, (i & 8) != 0 ? null : costBasisLotsSummaryDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateCostBasisLotResponseDto(String lot_id, String status, ValidationInfoDto validationInfoDto, CostBasisLotsSummaryDto costBasisLotsSummaryDto) {
        this(new Surrogate(lot_id, status, validationInfoDto, costBasisLotsSummaryDto));
        Intrinsics.checkNotNullParameter(lot_id, "lot_id");
        Intrinsics.checkNotNullParameter(status, "status");
    }

    @Override // com.robinhood.idl.Dto
    public CreateCostBasisLotResponse toProto() {
        String lot_id = this.surrogate.getLot_id();
        String status = this.surrogate.getStatus();
        ValidationInfoDto validation = this.surrogate.getValidation();
        ValidationInfo proto = validation != null ? validation.toProto() : null;
        CostBasisLotsSummaryDto deposit_summary = this.surrogate.getDeposit_summary();
        return new CreateCostBasisLotResponse(lot_id, status, proto, deposit_summary != null ? deposit_summary.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[CreateCostBasisLotResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreateCostBasisLotResponseDto) && Intrinsics.areEqual(((CreateCostBasisLotResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: CreateCostBasisLotResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b*\u0010$\u001a\u0004\b(\u0010)R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010$\u001a\u0004\b,\u0010-¨\u00061"}, m3636d2 = {"Lnummus/v1/CreateCostBasisLotResponseDto$Surrogate;", "", "", "lot_id", "status", "Lnummus/v1/ValidationInfoDto;", "validation", "Lnummus/v1/CostBasisLotsSummaryDto;", "deposit_summary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lnummus/v1/ValidationInfoDto;Lnummus/v1/CostBasisLotsSummaryDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lnummus/v1/ValidationInfoDto;Lnummus/v1/CostBasisLotsSummaryDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/CreateCostBasisLotResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLot_id", "getLot_id$annotations", "()V", "getStatus", "getStatus$annotations", "Lnummus/v1/ValidationInfoDto;", "getValidation", "()Lnummus/v1/ValidationInfoDto;", "getValidation$annotations", "Lnummus/v1/CostBasisLotsSummaryDto;", "getDeposit_summary", "()Lnummus/v1/CostBasisLotsSummaryDto;", "getDeposit_summary$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CostBasisLotsSummaryDto deposit_summary;
        private final String lot_id;
        private final String status;
        private final ValidationInfoDto validation;

        public Surrogate() {
            this((String) null, (String) null, (ValidationInfoDto) null, (CostBasisLotsSummaryDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.lot_id, surrogate.lot_id) && Intrinsics.areEqual(this.status, surrogate.status) && Intrinsics.areEqual(this.validation, surrogate.validation) && Intrinsics.areEqual(this.deposit_summary, surrogate.deposit_summary);
        }

        public int hashCode() {
            int iHashCode = ((this.lot_id.hashCode() * 31) + this.status.hashCode()) * 31;
            ValidationInfoDto validationInfoDto = this.validation;
            int iHashCode2 = (iHashCode + (validationInfoDto == null ? 0 : validationInfoDto.hashCode())) * 31;
            CostBasisLotsSummaryDto costBasisLotsSummaryDto = this.deposit_summary;
            return iHashCode2 + (costBasisLotsSummaryDto != null ? costBasisLotsSummaryDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(lot_id=" + this.lot_id + ", status=" + this.status + ", validation=" + this.validation + ", deposit_summary=" + this.deposit_summary + ")";
        }

        /* compiled from: CreateCostBasisLotResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/CreateCostBasisLotResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CreateCostBasisLotResponseDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreateCostBasisLotResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, ValidationInfoDto validationInfoDto, CostBasisLotsSummaryDto costBasisLotsSummaryDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.lot_id = "";
            } else {
                this.lot_id = str;
            }
            if ((i & 2) == 0) {
                this.status = "";
            } else {
                this.status = str2;
            }
            if ((i & 4) == 0) {
                this.validation = null;
            } else {
                this.validation = validationInfoDto;
            }
            if ((i & 8) == 0) {
                this.deposit_summary = null;
            } else {
                this.deposit_summary = costBasisLotsSummaryDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.lot_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.lot_id);
            }
            if (!Intrinsics.areEqual(self.status, "")) {
                output.encodeStringElement(serialDesc, 1, self.status);
            }
            ValidationInfoDto validationInfoDto = self.validation;
            if (validationInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ValidationInfoDto.Serializer.INSTANCE, validationInfoDto);
            }
            CostBasisLotsSummaryDto costBasisLotsSummaryDto = self.deposit_summary;
            if (costBasisLotsSummaryDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, CostBasisLotsSummaryDto.Serializer.INSTANCE, costBasisLotsSummaryDto);
            }
        }

        public Surrogate(String lot_id, String status, ValidationInfoDto validationInfoDto, CostBasisLotsSummaryDto costBasisLotsSummaryDto) {
            Intrinsics.checkNotNullParameter(lot_id, "lot_id");
            Intrinsics.checkNotNullParameter(status, "status");
            this.lot_id = lot_id;
            this.status = status;
            this.validation = validationInfoDto;
            this.deposit_summary = costBasisLotsSummaryDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, ValidationInfoDto validationInfoDto, CostBasisLotsSummaryDto costBasisLotsSummaryDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : validationInfoDto, (i & 8) != 0 ? null : costBasisLotsSummaryDto);
        }

        public final String getLot_id() {
            return this.lot_id;
        }

        public final String getStatus() {
            return this.status;
        }

        public final ValidationInfoDto getValidation() {
            return this.validation;
        }

        public final CostBasisLotsSummaryDto getDeposit_summary() {
            return this.deposit_summary;
        }
    }

    /* compiled from: CreateCostBasisLotResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/CreateCostBasisLotResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/CreateCostBasisLotResponseDto;", "Lnummus/v1/CreateCostBasisLotResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/CreateCostBasisLotResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CreateCostBasisLotResponseDto, CreateCostBasisLotResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreateCostBasisLotResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateCostBasisLotResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateCostBasisLotResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) CreateCostBasisLotResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreateCostBasisLotResponse> getProtoAdapter() {
            return CreateCostBasisLotResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateCostBasisLotResponseDto getZeroValue() {
            return CreateCostBasisLotResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateCostBasisLotResponseDto fromProto(CreateCostBasisLotResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String lot_id = proto.getLot_id();
            String status = proto.getStatus();
            ValidationInfo validation = proto.getValidation();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ValidationInfoDto validationInfoDtoFromProto = validation != null ? ValidationInfoDto.INSTANCE.fromProto(validation) : null;
            CostBasisLotsSummary deposit_summary = proto.getDeposit_summary();
            return new CreateCostBasisLotResponseDto(new Surrogate(lot_id, status, validationInfoDtoFromProto, deposit_summary != null ? CostBasisLotsSummaryDto.INSTANCE.fromProto(deposit_summary) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.CreateCostBasisLotResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateCostBasisLotResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CreateCostBasisLotResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CreateCostBasisLotResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/CreateCostBasisLotResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CreateCostBasisLotResponseDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/CreateCostBasisLotResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CreateCostBasisLotResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.CreateCostBasisLotResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreateCostBasisLotResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreateCostBasisLotResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreateCostBasisLotResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreateCostBasisLotResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/CreateCostBasisLotResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "nummus.v1.CreateCostBasisLotResponseDto";
        }
    }
}

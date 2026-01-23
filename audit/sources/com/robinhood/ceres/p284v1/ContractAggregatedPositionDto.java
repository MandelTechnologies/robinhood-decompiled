package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FuturesContractTypeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
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

/* compiled from: ContractAggregatedPositionDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0011JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019¨\u0006."}, m3636d2 = {"Lcom/robinhood/ceres/v1/ContractAggregatedPositionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/ContractAggregatedPosition;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/ContractAggregatedPositionDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/ContractAggregatedPositionDto$Surrogate;)V", "id", "", "symbol", "description", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "total_yes_quantity", "Lcom/robinhood/idl/IdlDecimal;", "total_no_quantity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "getId", "()Ljava/lang/String;", "getSymbol", "getDescription", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getTotal_yes_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getTotal_no_quantity", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class ContractAggregatedPositionDto implements Dto3<ContractAggregatedPosition>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ContractAggregatedPositionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ContractAggregatedPositionDto, ContractAggregatedPosition>> binaryBase64Serializer$delegate;
    private static final ContractAggregatedPositionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ContractAggregatedPositionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ContractAggregatedPositionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final FuturesContractTypeDto getContract_type() {
        return this.surrogate.getContract_type();
    }

    public final IdlDecimal getTotal_yes_quantity() {
        return this.surrogate.getTotal_yes_quantity();
    }

    public final IdlDecimal getTotal_no_quantity() {
        return this.surrogate.getTotal_no_quantity();
    }

    public /* synthetic */ ContractAggregatedPositionDto(String str, String str2, String str3, FuturesContractTypeDto futuresContractTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? FuturesContractTypeDto.INSTANCE.getZeroValue() : futuresContractTypeDto, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContractAggregatedPositionDto(String id, String symbol, String description, FuturesContractTypeDto contract_type, IdlDecimal total_yes_quantity, IdlDecimal total_no_quantity) {
        this(new Surrogate(id, symbol, description, contract_type, total_yes_quantity, total_no_quantity));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(total_yes_quantity, "total_yes_quantity");
        Intrinsics.checkNotNullParameter(total_no_quantity, "total_no_quantity");
    }

    public static /* synthetic */ ContractAggregatedPositionDto copy$default(ContractAggregatedPositionDto contractAggregatedPositionDto, String str, String str2, String str3, FuturesContractTypeDto futuresContractTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractAggregatedPositionDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            str2 = contractAggregatedPositionDto.surrogate.getSymbol();
        }
        if ((i & 4) != 0) {
            str3 = contractAggregatedPositionDto.surrogate.getDescription();
        }
        if ((i & 8) != 0) {
            futuresContractTypeDto = contractAggregatedPositionDto.surrogate.getContract_type();
        }
        if ((i & 16) != 0) {
            idlDecimal = contractAggregatedPositionDto.surrogate.getTotal_yes_quantity();
        }
        if ((i & 32) != 0) {
            idlDecimal2 = contractAggregatedPositionDto.surrogate.getTotal_no_quantity();
        }
        IdlDecimal idlDecimal3 = idlDecimal;
        IdlDecimal idlDecimal4 = idlDecimal2;
        return contractAggregatedPositionDto.copy(str, str2, str3, futuresContractTypeDto, idlDecimal3, idlDecimal4);
    }

    public final ContractAggregatedPositionDto copy(String id, String symbol, String description, FuturesContractTypeDto contract_type, IdlDecimal total_yes_quantity, IdlDecimal total_no_quantity) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(total_yes_quantity, "total_yes_quantity");
        Intrinsics.checkNotNullParameter(total_no_quantity, "total_no_quantity");
        return new ContractAggregatedPositionDto(new Surrogate(id, symbol, description, contract_type, total_yes_quantity, total_no_quantity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ContractAggregatedPosition toProto() {
        return new ContractAggregatedPosition(this.surrogate.getId(), this.surrogate.getSymbol(), this.surrogate.getDescription(), (FuturesContractType) this.surrogate.getContract_type().toProto(), this.surrogate.getTotal_yes_quantity().getStringValue(), this.surrogate.getTotal_no_quantity().getStringValue(), null, 64, null);
    }

    public String toString() {
        return "[ContractAggregatedPositionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ContractAggregatedPositionDto) && Intrinsics.areEqual(((ContractAggregatedPositionDto) other).surrogate, this.surrogate);
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
    /* compiled from: ContractAggregatedPositionDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u00029:Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u0018\u0010)\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003J\u0018\u0010*\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003Jc\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\u0017\b\u0002\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0011HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u001fR+\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R+\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\"¨\u0006;"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ContractAggregatedPositionDto$Surrogate;", "", "id", "", "symbol", "description", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "total_yes_quantity", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "total_no_quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getSymbol$annotations", "getSymbol", "getDescription$annotations", "getDescription", "getContract_type$annotations", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getTotal_yes_quantity$annotations", "getTotal_yes_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getTotal_no_quantity$annotations", "getTotal_no_quantity", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final FuturesContractTypeDto contract_type;
        private final String description;
        private final String id;
        private final String symbol;
        private final IdlDecimal total_no_quantity;
        private final IdlDecimal total_yes_quantity;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (FuturesContractTypeDto) null, (IdlDecimal) null, (IdlDecimal) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, FuturesContractTypeDto futuresContractTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.symbol;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.description;
            }
            if ((i & 8) != 0) {
                futuresContractTypeDto = surrogate.contract_type;
            }
            if ((i & 16) != 0) {
                idlDecimal = surrogate.total_yes_quantity;
            }
            if ((i & 32) != 0) {
                idlDecimal2 = surrogate.total_no_quantity;
            }
            IdlDecimal idlDecimal3 = idlDecimal;
            IdlDecimal idlDecimal4 = idlDecimal2;
            return surrogate.copy(str, str2, str3, futuresContractTypeDto, idlDecimal3, idlDecimal4);
        }

        @SerialName("contractType")
        @JsonAnnotations2(names = {"contract_type"})
        public static /* synthetic */ void getContract_type$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("totalNoQuantity")
        @JsonAnnotations2(names = {"total_no_quantity"})
        public static /* synthetic */ void getTotal_no_quantity$annotations() {
        }

        @SerialName("totalYesQuantity")
        @JsonAnnotations2(names = {"total_yes_quantity"})
        public static /* synthetic */ void getTotal_yes_quantity$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        /* renamed from: component5, reason: from getter */
        public final IdlDecimal getTotal_yes_quantity() {
            return this.total_yes_quantity;
        }

        /* renamed from: component6, reason: from getter */
        public final IdlDecimal getTotal_no_quantity() {
            return this.total_no_quantity;
        }

        public final Surrogate copy(String id, String symbol, String description, FuturesContractTypeDto contract_type, IdlDecimal total_yes_quantity, IdlDecimal total_no_quantity) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            Intrinsics.checkNotNullParameter(total_yes_quantity, "total_yes_quantity");
            Intrinsics.checkNotNullParameter(total_no_quantity, "total_no_quantity");
            return new Surrogate(id, symbol, description, contract_type, total_yes_quantity, total_no_quantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.description, surrogate.description) && this.contract_type == surrogate.contract_type && Intrinsics.areEqual(this.total_yes_quantity, surrogate.total_yes_quantity) && Intrinsics.areEqual(this.total_no_quantity, surrogate.total_no_quantity);
        }

        public int hashCode() {
            return (((((((((this.id.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.description.hashCode()) * 31) + this.contract_type.hashCode()) * 31) + this.total_yes_quantity.hashCode()) * 31) + this.total_no_quantity.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", symbol=" + this.symbol + ", description=" + this.description + ", contract_type=" + this.contract_type + ", total_yes_quantity=" + this.total_yes_quantity + ", total_no_quantity=" + this.total_no_quantity + ")";
        }

        /* compiled from: ContractAggregatedPositionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ContractAggregatedPositionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ContractAggregatedPositionDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ContractAggregatedPositionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, FuturesContractTypeDto futuresContractTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str2;
            }
            if ((i & 4) == 0) {
                this.description = "";
            } else {
                this.description = str3;
            }
            if ((i & 8) == 0) {
                this.contract_type = FuturesContractTypeDto.INSTANCE.getZeroValue();
            } else {
                this.contract_type = futuresContractTypeDto;
            }
            if ((i & 16) == 0) {
                this.total_yes_quantity = new IdlDecimal("");
            } else {
                this.total_yes_quantity = idlDecimal;
            }
            if ((i & 32) == 0) {
                this.total_no_quantity = new IdlDecimal("");
            } else {
                this.total_no_quantity = idlDecimal2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 1, self.symbol);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 2, self.description);
            }
            if (self.contract_type != FuturesContractTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, FuturesContractTypeDto.Serializer.INSTANCE, self.contract_type);
            }
            if (!Intrinsics.areEqual(self.total_yes_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.total_yes_quantity);
            }
            if (Intrinsics.areEqual(self.total_no_quantity, new IdlDecimal(""))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.total_no_quantity);
        }

        public Surrogate(String id, String symbol, String description, FuturesContractTypeDto contract_type, IdlDecimal total_yes_quantity, IdlDecimal total_no_quantity) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            Intrinsics.checkNotNullParameter(total_yes_quantity, "total_yes_quantity");
            Intrinsics.checkNotNullParameter(total_no_quantity, "total_no_quantity");
            this.id = id;
            this.symbol = symbol;
            this.description = description;
            this.contract_type = contract_type;
            this.total_yes_quantity = total_yes_quantity;
            this.total_no_quantity = total_no_quantity;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, FuturesContractTypeDto futuresContractTypeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? FuturesContractTypeDto.INSTANCE.getZeroValue() : futuresContractTypeDto, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal2);
        }

        public final String getId() {
            return this.id;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getDescription() {
            return this.description;
        }

        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        public final IdlDecimal getTotal_yes_quantity() {
            return this.total_yes_quantity;
        }

        public final IdlDecimal getTotal_no_quantity() {
            return this.total_no_quantity;
        }
    }

    /* compiled from: ContractAggregatedPositionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ContractAggregatedPositionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/ContractAggregatedPositionDto;", "Lcom/robinhood/ceres/v1/ContractAggregatedPosition;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/ContractAggregatedPositionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ContractAggregatedPositionDto, ContractAggregatedPosition> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ContractAggregatedPositionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContractAggregatedPositionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContractAggregatedPositionDto> getBinaryBase64Serializer() {
            return (KSerializer) ContractAggregatedPositionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ContractAggregatedPosition> getProtoAdapter() {
            return ContractAggregatedPosition.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContractAggregatedPositionDto getZeroValue() {
            return ContractAggregatedPositionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContractAggregatedPositionDto fromProto(ContractAggregatedPosition proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ContractAggregatedPositionDto(new Surrogate(proto.getId(), proto.getSymbol(), proto.getDescription(), FuturesContractTypeDto.INSTANCE.fromProto(proto.getContract_type()), new IdlDecimal(proto.getTotal_yes_quantity()), new IdlDecimal(proto.getTotal_no_quantity())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.ContractAggregatedPositionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContractAggregatedPositionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ContractAggregatedPositionDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ContractAggregatedPositionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ContractAggregatedPositionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ContractAggregatedPositionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/ContractAggregatedPositionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ContractAggregatedPositionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.ContractAggregatedPosition", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ContractAggregatedPositionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ContractAggregatedPositionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ContractAggregatedPositionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ContractAggregatedPositionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ContractAggregatedPositionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.ContractAggregatedPositionDto";
        }
    }
}

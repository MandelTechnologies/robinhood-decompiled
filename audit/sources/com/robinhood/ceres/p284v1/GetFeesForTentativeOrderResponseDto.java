package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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

/* compiled from: GetFeesForTentativeOrderResponseDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000fJN\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006+"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponse;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto$Surrogate;)V", "total_fee", "Lcom/robinhood/rosetta/common/MoneyDto;", "total_commission", "total_gold_savings", "total_fee_per_contract", "total_commission_per_contract", "total_gold_savings_per_contract", "(Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "getTotal_fee", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getTotal_commission", "getTotal_gold_savings", "getTotal_fee_per_contract", "getTotal_commission_per_contract", "getTotal_gold_savings_per_contract", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class GetFeesForTentativeOrderResponseDto implements Dto3<GetFeesForTentativeOrderResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetFeesForTentativeOrderResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetFeesForTentativeOrderResponseDto, GetFeesForTentativeOrderResponse>> binaryBase64Serializer$delegate;
    private static final GetFeesForTentativeOrderResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetFeesForTentativeOrderResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetFeesForTentativeOrderResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MoneyDto getTotal_fee() {
        return this.surrogate.getTotal_fee();
    }

    public final MoneyDto getTotal_commission() {
        return this.surrogate.getTotal_commission();
    }

    public final MoneyDto getTotal_gold_savings() {
        return this.surrogate.getTotal_gold_savings();
    }

    public final MoneyDto getTotal_fee_per_contract() {
        return this.surrogate.getTotal_fee_per_contract();
    }

    public final MoneyDto getTotal_commission_per_contract() {
        return this.surrogate.getTotal_commission_per_contract();
    }

    public final MoneyDto getTotal_gold_savings_per_contract() {
        return this.surrogate.getTotal_gold_savings_per_contract();
    }

    public /* synthetic */ GetFeesForTentativeOrderResponseDto(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? null : moneyDto2, (i & 4) != 0 ? null : moneyDto3, (i & 8) != 0 ? null : moneyDto4, (i & 16) != 0 ? null : moneyDto5, (i & 32) != 0 ? null : moneyDto6);
    }

    public GetFeesForTentativeOrderResponseDto(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6) {
        this(new Surrogate(moneyDto, moneyDto2, moneyDto3, moneyDto4, moneyDto5, moneyDto6));
    }

    public static /* synthetic */ GetFeesForTentativeOrderResponseDto copy$default(GetFeesForTentativeOrderResponseDto getFeesForTentativeOrderResponseDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyDto = getFeesForTentativeOrderResponseDto.surrogate.getTotal_fee();
        }
        if ((i & 2) != 0) {
            moneyDto2 = getFeesForTentativeOrderResponseDto.surrogate.getTotal_commission();
        }
        if ((i & 4) != 0) {
            moneyDto3 = getFeesForTentativeOrderResponseDto.surrogate.getTotal_gold_savings();
        }
        if ((i & 8) != 0) {
            moneyDto4 = getFeesForTentativeOrderResponseDto.surrogate.getTotal_fee_per_contract();
        }
        if ((i & 16) != 0) {
            moneyDto5 = getFeesForTentativeOrderResponseDto.surrogate.getTotal_commission_per_contract();
        }
        if ((i & 32) != 0) {
            moneyDto6 = getFeesForTentativeOrderResponseDto.surrogate.getTotal_gold_savings_per_contract();
        }
        MoneyDto moneyDto7 = moneyDto5;
        MoneyDto moneyDto8 = moneyDto6;
        return getFeesForTentativeOrderResponseDto.copy(moneyDto, moneyDto2, moneyDto3, moneyDto4, moneyDto7, moneyDto8);
    }

    public final GetFeesForTentativeOrderResponseDto copy(MoneyDto total_fee, MoneyDto total_commission, MoneyDto total_gold_savings, MoneyDto total_fee_per_contract, MoneyDto total_commission_per_contract, MoneyDto total_gold_savings_per_contract) {
        return new GetFeesForTentativeOrderResponseDto(new Surrogate(total_fee, total_commission, total_gold_savings, total_fee_per_contract, total_commission_per_contract, total_gold_savings_per_contract));
    }

    @Override // com.robinhood.idl.Dto
    public GetFeesForTentativeOrderResponse toProto() {
        MoneyDto total_fee = this.surrogate.getTotal_fee();
        Money proto = total_fee != null ? total_fee.toProto() : null;
        MoneyDto total_commission = this.surrogate.getTotal_commission();
        Money proto2 = total_commission != null ? total_commission.toProto() : null;
        MoneyDto total_gold_savings = this.surrogate.getTotal_gold_savings();
        Money proto3 = total_gold_savings != null ? total_gold_savings.toProto() : null;
        MoneyDto total_fee_per_contract = this.surrogate.getTotal_fee_per_contract();
        Money proto4 = total_fee_per_contract != null ? total_fee_per_contract.toProto() : null;
        MoneyDto total_commission_per_contract = this.surrogate.getTotal_commission_per_contract();
        Money proto5 = total_commission_per_contract != null ? total_commission_per_contract.toProto() : null;
        MoneyDto total_gold_savings_per_contract = this.surrogate.getTotal_gold_savings_per_contract();
        return new GetFeesForTentativeOrderResponse(proto, proto2, proto3, proto4, proto5, total_gold_savings_per_contract != null ? total_gold_savings_per_contract.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[GetFeesForTentativeOrderResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetFeesForTentativeOrderResponseDto) && Intrinsics.areEqual(((GetFeesForTentativeOrderResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetFeesForTentativeOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000234BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013¨\u00065"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto$Surrogate;", "", "total_fee", "Lcom/robinhood/rosetta/common/MoneyDto;", "total_commission", "total_gold_savings", "total_fee_per_contract", "total_commission_per_contract", "total_gold_savings_per_contract", "<init>", "(Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTotal_fee$annotations", "()V", "getTotal_fee", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getTotal_commission$annotations", "getTotal_commission", "getTotal_gold_savings$annotations", "getTotal_gold_savings", "getTotal_fee_per_contract$annotations", "getTotal_fee_per_contract", "getTotal_commission_per_contract$annotations", "getTotal_commission_per_contract", "getTotal_gold_savings_per_contract$annotations", "getTotal_gold_savings_per_contract", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto total_commission;
        private final MoneyDto total_commission_per_contract;
        private final MoneyDto total_fee;
        private final MoneyDto total_fee_per_contract;
        private final MoneyDto total_gold_savings;
        private final MoneyDto total_gold_savings_per_contract;

        public Surrogate() {
            this((MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, int i, Object obj) {
            if ((i & 1) != 0) {
                moneyDto = surrogate.total_fee;
            }
            if ((i & 2) != 0) {
                moneyDto2 = surrogate.total_commission;
            }
            if ((i & 4) != 0) {
                moneyDto3 = surrogate.total_gold_savings;
            }
            if ((i & 8) != 0) {
                moneyDto4 = surrogate.total_fee_per_contract;
            }
            if ((i & 16) != 0) {
                moneyDto5 = surrogate.total_commission_per_contract;
            }
            if ((i & 32) != 0) {
                moneyDto6 = surrogate.total_gold_savings_per_contract;
            }
            MoneyDto moneyDto7 = moneyDto5;
            MoneyDto moneyDto8 = moneyDto6;
            return surrogate.copy(moneyDto, moneyDto2, moneyDto3, moneyDto4, moneyDto7, moneyDto8);
        }

        @SerialName("totalCommission")
        @JsonAnnotations2(names = {"total_commission"})
        public static /* synthetic */ void getTotal_commission$annotations() {
        }

        @SerialName("totalCommissionPerContract")
        @JsonAnnotations2(names = {"total_commission_per_contract"})
        public static /* synthetic */ void getTotal_commission_per_contract$annotations() {
        }

        @SerialName("totalFee")
        @JsonAnnotations2(names = {"total_fee"})
        public static /* synthetic */ void getTotal_fee$annotations() {
        }

        @SerialName("totalFeePerContract")
        @JsonAnnotations2(names = {"total_fee_per_contract"})
        public static /* synthetic */ void getTotal_fee_per_contract$annotations() {
        }

        @SerialName("totalGoldSavings")
        @JsonAnnotations2(names = {"total_gold_savings"})
        public static /* synthetic */ void getTotal_gold_savings$annotations() {
        }

        @SerialName("totalGoldSavingsPerContract")
        @JsonAnnotations2(names = {"total_gold_savings_per_contract"})
        public static /* synthetic */ void getTotal_gold_savings_per_contract$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final MoneyDto getTotal_fee() {
            return this.total_fee;
        }

        /* renamed from: component2, reason: from getter */
        public final MoneyDto getTotal_commission() {
            return this.total_commission;
        }

        /* renamed from: component3, reason: from getter */
        public final MoneyDto getTotal_gold_savings() {
            return this.total_gold_savings;
        }

        /* renamed from: component4, reason: from getter */
        public final MoneyDto getTotal_fee_per_contract() {
            return this.total_fee_per_contract;
        }

        /* renamed from: component5, reason: from getter */
        public final MoneyDto getTotal_commission_per_contract() {
            return this.total_commission_per_contract;
        }

        /* renamed from: component6, reason: from getter */
        public final MoneyDto getTotal_gold_savings_per_contract() {
            return this.total_gold_savings_per_contract;
        }

        public final Surrogate copy(MoneyDto total_fee, MoneyDto total_commission, MoneyDto total_gold_savings, MoneyDto total_fee_per_contract, MoneyDto total_commission_per_contract, MoneyDto total_gold_savings_per_contract) {
            return new Surrogate(total_fee, total_commission, total_gold_savings, total_fee_per_contract, total_commission_per_contract, total_gold_savings_per_contract);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.total_fee, surrogate.total_fee) && Intrinsics.areEqual(this.total_commission, surrogate.total_commission) && Intrinsics.areEqual(this.total_gold_savings, surrogate.total_gold_savings) && Intrinsics.areEqual(this.total_fee_per_contract, surrogate.total_fee_per_contract) && Intrinsics.areEqual(this.total_commission_per_contract, surrogate.total_commission_per_contract) && Intrinsics.areEqual(this.total_gold_savings_per_contract, surrogate.total_gold_savings_per_contract);
        }

        public int hashCode() {
            MoneyDto moneyDto = this.total_fee;
            int iHashCode = (moneyDto == null ? 0 : moneyDto.hashCode()) * 31;
            MoneyDto moneyDto2 = this.total_commission;
            int iHashCode2 = (iHashCode + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.total_gold_savings;
            int iHashCode3 = (iHashCode2 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            MoneyDto moneyDto4 = this.total_fee_per_contract;
            int iHashCode4 = (iHashCode3 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            MoneyDto moneyDto5 = this.total_commission_per_contract;
            int iHashCode5 = (iHashCode4 + (moneyDto5 == null ? 0 : moneyDto5.hashCode())) * 31;
            MoneyDto moneyDto6 = this.total_gold_savings_per_contract;
            return iHashCode5 + (moneyDto6 != null ? moneyDto6.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(total_fee=" + this.total_fee + ", total_commission=" + this.total_commission + ", total_gold_savings=" + this.total_gold_savings + ", total_fee_per_contract=" + this.total_fee_per_contract + ", total_commission_per_contract=" + this.total_commission_per_contract + ", total_gold_savings_per_contract=" + this.total_gold_savings_per_contract + ")";
        }

        /* compiled from: GetFeesForTentativeOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetFeesForTentativeOrderResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.total_fee = null;
            } else {
                this.total_fee = moneyDto;
            }
            if ((i & 2) == 0) {
                this.total_commission = null;
            } else {
                this.total_commission = moneyDto2;
            }
            if ((i & 4) == 0) {
                this.total_gold_savings = null;
            } else {
                this.total_gold_savings = moneyDto3;
            }
            if ((i & 8) == 0) {
                this.total_fee_per_contract = null;
            } else {
                this.total_fee_per_contract = moneyDto4;
            }
            if ((i & 16) == 0) {
                this.total_commission_per_contract = null;
            } else {
                this.total_commission_per_contract = moneyDto5;
            }
            if ((i & 32) == 0) {
                this.total_gold_savings_per_contract = null;
            } else {
                this.total_gold_savings_per_contract = moneyDto6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MoneyDto moneyDto = self.total_fee;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.total_commission;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.total_gold_savings;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            MoneyDto moneyDto4 = self.total_fee_per_contract;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            MoneyDto moneyDto5 = self.total_commission_per_contract;
            if (moneyDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto5);
            }
            MoneyDto moneyDto6 = self.total_gold_savings_per_contract;
            if (moneyDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto6);
            }
        }

        public Surrogate(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6) {
            this.total_fee = moneyDto;
            this.total_commission = moneyDto2;
            this.total_gold_savings = moneyDto3;
            this.total_fee_per_contract = moneyDto4;
            this.total_commission_per_contract = moneyDto5;
            this.total_gold_savings_per_contract = moneyDto6;
        }

        public /* synthetic */ Surrogate(MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? null : moneyDto2, (i & 4) != 0 ? null : moneyDto3, (i & 8) != 0 ? null : moneyDto4, (i & 16) != 0 ? null : moneyDto5, (i & 32) != 0 ? null : moneyDto6);
        }

        public final MoneyDto getTotal_fee() {
            return this.total_fee;
        }

        public final MoneyDto getTotal_commission() {
            return this.total_commission;
        }

        public final MoneyDto getTotal_gold_savings() {
            return this.total_gold_savings;
        }

        public final MoneyDto getTotal_fee_per_contract() {
            return this.total_fee_per_contract;
        }

        public final MoneyDto getTotal_commission_per_contract() {
            return this.total_commission_per_contract;
        }

        public final MoneyDto getTotal_gold_savings_per_contract() {
            return this.total_gold_savings_per_contract;
        }
    }

    /* compiled from: GetFeesForTentativeOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetFeesForTentativeOrderResponseDto, GetFeesForTentativeOrderResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetFeesForTentativeOrderResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetFeesForTentativeOrderResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetFeesForTentativeOrderResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetFeesForTentativeOrderResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetFeesForTentativeOrderResponse> getProtoAdapter() {
            return GetFeesForTentativeOrderResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetFeesForTentativeOrderResponseDto getZeroValue() {
            return GetFeesForTentativeOrderResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetFeesForTentativeOrderResponseDto fromProto(GetFeesForTentativeOrderResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Money total_fee = proto.getTotal_fee();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = total_fee != null ? MoneyDto.INSTANCE.fromProto(total_fee) : null;
            Money total_commission = proto.getTotal_commission();
            MoneyDto moneyDtoFromProto2 = total_commission != null ? MoneyDto.INSTANCE.fromProto(total_commission) : null;
            Money total_gold_savings = proto.getTotal_gold_savings();
            MoneyDto moneyDtoFromProto3 = total_gold_savings != null ? MoneyDto.INSTANCE.fromProto(total_gold_savings) : null;
            Money total_fee_per_contract = proto.getTotal_fee_per_contract();
            MoneyDto moneyDtoFromProto4 = total_fee_per_contract != null ? MoneyDto.INSTANCE.fromProto(total_fee_per_contract) : null;
            Money total_commission_per_contract = proto.getTotal_commission_per_contract();
            MoneyDto moneyDtoFromProto5 = total_commission_per_contract != null ? MoneyDto.INSTANCE.fromProto(total_commission_per_contract) : null;
            Money total_gold_savings_per_contract = proto.getTotal_gold_savings_per_contract();
            return new GetFeesForTentativeOrderResponseDto(new Surrogate(moneyDtoFromProto, moneyDtoFromProto2, moneyDtoFromProto3, moneyDtoFromProto4, moneyDtoFromProto5, total_gold_savings_per_contract != null ? MoneyDto.INSTANCE.fromProto(total_gold_savings_per_contract) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.GetFeesForTentativeOrderResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetFeesForTentativeOrderResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetFeesForTentativeOrderResponseDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetFeesForTentativeOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetFeesForTentativeOrderResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.GetFeesForTentativeOrderResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetFeesForTentativeOrderResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetFeesForTentativeOrderResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetFeesForTentativeOrderResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetFeesForTentativeOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.GetFeesForTentativeOrderResponseDto";
        }
    }
}

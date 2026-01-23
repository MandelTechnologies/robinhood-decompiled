package rosetta.midas.p538v1;

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
import com.robinhood.models.api.MarginCall;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rosetta.midas.p538v1.CreditCardBoostedCashbackFeature;
import rosetta.midas.p538v1.CreditCardBoostedCashbackFeatureDto;
import rosetta.midas.p538v1.PromotionDetailsDto;

/* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007'&()*+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006-"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto;", "Lcom/robinhood/idl/MessageDto;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature;", "Landroid/os/Parcelable;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$Surrogate;", "surrogate", "<init>", "(Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$Surrogate;)V", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto;", "clawback_penalty_type", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto;", "cashback_promotion_type", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "cashback_promotion_status", "Lrosetta/midas/v1/PromotionDetailsDto;", "promotion_details", "(Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto;Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto;Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;Lrosetta/midas/v1/PromotionDetailsDto;)V", "toProto", "()Lrosetta/midas/v1/CreditCardBoostedCashbackFeature;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$Surrogate;", "Companion", "Surrogate", "CashbackPromotionTypeDto", "CashbackPromotionStatusDto", "ClawbackPenaltyTypeDto", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class CreditCardBoostedCashbackFeatureDto implements Dto3<CreditCardBoostedCashbackFeature>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreditCardBoostedCashbackFeatureDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreditCardBoostedCashbackFeatureDto, CreditCardBoostedCashbackFeature>> binaryBase64Serializer$delegate;
    private static final CreditCardBoostedCashbackFeatureDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreditCardBoostedCashbackFeatureDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreditCardBoostedCashbackFeatureDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ CreditCardBoostedCashbackFeatureDto(ClawbackPenaltyTypeDto clawbackPenaltyTypeDto, CashbackPromotionTypeDto cashbackPromotionTypeDto, CashbackPromotionStatusDto cashbackPromotionStatusDto, PromotionDetailsDto promotionDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClawbackPenaltyTypeDto.INSTANCE.getZeroValue() : clawbackPenaltyTypeDto, (i & 2) != 0 ? CashbackPromotionTypeDto.INSTANCE.getZeroValue() : cashbackPromotionTypeDto, (i & 4) != 0 ? CashbackPromotionStatusDto.INSTANCE.getZeroValue() : cashbackPromotionStatusDto, (i & 8) != 0 ? null : promotionDetailsDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreditCardBoostedCashbackFeatureDto(ClawbackPenaltyTypeDto clawback_penalty_type, CashbackPromotionTypeDto cashback_promotion_type, CashbackPromotionStatusDto cashback_promotion_status, PromotionDetailsDto promotionDetailsDto) {
        this(new Surrogate(clawback_penalty_type, cashback_promotion_type, cashback_promotion_status, promotionDetailsDto));
        Intrinsics.checkNotNullParameter(clawback_penalty_type, "clawback_penalty_type");
        Intrinsics.checkNotNullParameter(cashback_promotion_type, "cashback_promotion_type");
        Intrinsics.checkNotNullParameter(cashback_promotion_status, "cashback_promotion_status");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CreditCardBoostedCashbackFeature toProto() {
        CreditCardBoostedCashbackFeature.ClawbackPenaltyType clawbackPenaltyType = (CreditCardBoostedCashbackFeature.ClawbackPenaltyType) this.surrogate.getClawback_penalty_type().toProto();
        CreditCardBoostedCashbackFeature.CashbackPromotionType cashbackPromotionType = (CreditCardBoostedCashbackFeature.CashbackPromotionType) this.surrogate.getCashback_promotion_type().toProto();
        CreditCardBoostedCashbackFeature.CashbackPromotionStatus cashbackPromotionStatus = (CreditCardBoostedCashbackFeature.CashbackPromotionStatus) this.surrogate.getCashback_promotion_status().toProto();
        PromotionDetailsDto promotion_details = this.surrogate.getPromotion_details();
        return new CreditCardBoostedCashbackFeature(clawbackPenaltyType, cashbackPromotionType, cashbackPromotionStatus, promotion_details != null ? promotion_details.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[CreditCardBoostedCashbackFeatureDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreditCardBoostedCashbackFeatureDto) && Intrinsics.areEqual(((CreditCardBoostedCashbackFeatureDto) other).surrogate, this.surrogate);
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
    /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102¨\u00066"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$Surrogate;", "", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto;", "clawback_penalty_type", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto;", "cashback_promotion_type", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "cashback_promotion_status", "Lrosetta/midas/v1/PromotionDetailsDto;", "promotion_details", "<init>", "(Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto;Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto;Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;Lrosetta/midas/v1/PromotionDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto;Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto;Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;Lrosetta/midas/v1/PromotionDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto;", "getClawback_penalty_type", "()Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto;", "getClawback_penalty_type$annotations", "()V", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto;", "getCashback_promotion_type", "()Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto;", "getCashback_promotion_type$annotations", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "getCashback_promotion_status", "()Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "getCashback_promotion_status$annotations", "Lrosetta/midas/v1/PromotionDetailsDto;", "getPromotion_details", "()Lrosetta/midas/v1/PromotionDetailsDto;", "getPromotion_details$annotations", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CashbackPromotionStatusDto cashback_promotion_status;
        private final CashbackPromotionTypeDto cashback_promotion_type;
        private final ClawbackPenaltyTypeDto clawback_penalty_type;
        private final PromotionDetailsDto promotion_details;

        public Surrogate() {
            this((ClawbackPenaltyTypeDto) null, (CashbackPromotionTypeDto) null, (CashbackPromotionStatusDto) null, (PromotionDetailsDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.clawback_penalty_type == surrogate.clawback_penalty_type && this.cashback_promotion_type == surrogate.cashback_promotion_type && this.cashback_promotion_status == surrogate.cashback_promotion_status && Intrinsics.areEqual(this.promotion_details, surrogate.promotion_details);
        }

        public int hashCode() {
            int iHashCode = ((((this.clawback_penalty_type.hashCode() * 31) + this.cashback_promotion_type.hashCode()) * 31) + this.cashback_promotion_status.hashCode()) * 31;
            PromotionDetailsDto promotionDetailsDto = this.promotion_details;
            return iHashCode + (promotionDetailsDto == null ? 0 : promotionDetailsDto.hashCode());
        }

        public String toString() {
            return "Surrogate(clawback_penalty_type=" + this.clawback_penalty_type + ", cashback_promotion_type=" + this.cashback_promotion_type + ", cashback_promotion_status=" + this.cashback_promotion_status + ", promotion_details=" + this.promotion_details + ")";
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreditCardBoostedCashbackFeatureDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClawbackPenaltyTypeDto clawbackPenaltyTypeDto, CashbackPromotionTypeDto cashbackPromotionTypeDto, CashbackPromotionStatusDto cashbackPromotionStatusDto, PromotionDetailsDto promotionDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.clawback_penalty_type = (i & 1) == 0 ? ClawbackPenaltyTypeDto.INSTANCE.getZeroValue() : clawbackPenaltyTypeDto;
            if ((i & 2) == 0) {
                this.cashback_promotion_type = CashbackPromotionTypeDto.INSTANCE.getZeroValue();
            } else {
                this.cashback_promotion_type = cashbackPromotionTypeDto;
            }
            if ((i & 4) == 0) {
                this.cashback_promotion_status = CashbackPromotionStatusDto.INSTANCE.getZeroValue();
            } else {
                this.cashback_promotion_status = cashbackPromotionStatusDto;
            }
            if ((i & 8) == 0) {
                this.promotion_details = null;
            } else {
                this.promotion_details = promotionDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_midas_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.clawback_penalty_type != ClawbackPenaltyTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ClawbackPenaltyTypeDto.Serializer.INSTANCE, self.clawback_penalty_type);
            }
            if (self.cashback_promotion_type != CashbackPromotionTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, CashbackPromotionTypeDto.Serializer.INSTANCE, self.cashback_promotion_type);
            }
            if (self.cashback_promotion_status != CashbackPromotionStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, CashbackPromotionStatusDto.Serializer.INSTANCE, self.cashback_promotion_status);
            }
            PromotionDetailsDto promotionDetailsDto = self.promotion_details;
            if (promotionDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, PromotionDetailsDto.Serializer.INSTANCE, promotionDetailsDto);
            }
        }

        public Surrogate(ClawbackPenaltyTypeDto clawback_penalty_type, CashbackPromotionTypeDto cashback_promotion_type, CashbackPromotionStatusDto cashback_promotion_status, PromotionDetailsDto promotionDetailsDto) {
            Intrinsics.checkNotNullParameter(clawback_penalty_type, "clawback_penalty_type");
            Intrinsics.checkNotNullParameter(cashback_promotion_type, "cashback_promotion_type");
            Intrinsics.checkNotNullParameter(cashback_promotion_status, "cashback_promotion_status");
            this.clawback_penalty_type = clawback_penalty_type;
            this.cashback_promotion_type = cashback_promotion_type;
            this.cashback_promotion_status = cashback_promotion_status;
            this.promotion_details = promotionDetailsDto;
        }

        public final ClawbackPenaltyTypeDto getClawback_penalty_type() {
            return this.clawback_penalty_type;
        }

        public /* synthetic */ Surrogate(ClawbackPenaltyTypeDto clawbackPenaltyTypeDto, CashbackPromotionTypeDto cashbackPromotionTypeDto, CashbackPromotionStatusDto cashbackPromotionStatusDto, PromotionDetailsDto promotionDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ClawbackPenaltyTypeDto.INSTANCE.getZeroValue() : clawbackPenaltyTypeDto, (i & 2) != 0 ? CashbackPromotionTypeDto.INSTANCE.getZeroValue() : cashbackPromotionTypeDto, (i & 4) != 0 ? CashbackPromotionStatusDto.INSTANCE.getZeroValue() : cashbackPromotionStatusDto, (i & 8) != 0 ? null : promotionDetailsDto);
        }

        public final CashbackPromotionTypeDto getCashback_promotion_type() {
            return this.cashback_promotion_type;
        }

        public final CashbackPromotionStatusDto getCashback_promotion_status() {
            return this.cashback_promotion_status;
        }

        public final PromotionDetailsDto getPromotion_details() {
            return this.promotion_details;
        }
    }

    /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CreditCardBoostedCashbackFeatureDto, CreditCardBoostedCashbackFeature> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreditCardBoostedCashbackFeatureDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreditCardBoostedCashbackFeatureDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreditCardBoostedCashbackFeatureDto> getBinaryBase64Serializer() {
            return (KSerializer) CreditCardBoostedCashbackFeatureDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreditCardBoostedCashbackFeature> getProtoAdapter() {
            return CreditCardBoostedCashbackFeature.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreditCardBoostedCashbackFeatureDto getZeroValue() {
            return CreditCardBoostedCashbackFeatureDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreditCardBoostedCashbackFeatureDto fromProto(CreditCardBoostedCashbackFeature proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ClawbackPenaltyTypeDto clawbackPenaltyTypeDtoFromProto = ClawbackPenaltyTypeDto.INSTANCE.fromProto(proto.getClawback_penalty_type());
            CashbackPromotionTypeDto cashbackPromotionTypeDtoFromProto = CashbackPromotionTypeDto.INSTANCE.fromProto(proto.getCashback_promotion_type());
            CashbackPromotionStatusDto cashbackPromotionStatusDtoFromProto = CashbackPromotionStatusDto.INSTANCE.fromProto(proto.getCashback_promotion_status());
            PromotionDetails promotion_details = proto.getPromotion_details();
            return new CreditCardBoostedCashbackFeatureDto(new Surrogate(clawbackPenaltyTypeDtoFromProto, cashbackPromotionTypeDtoFromProto, cashbackPromotionStatusDtoFromProto, promotion_details != null ? PromotionDetailsDto.INSTANCE.fromProto(promotion_details) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.CreditCardBoostedCashbackFeatureDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreditCardBoostedCashbackFeatureDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CreditCardBoostedCashbackFeatureDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "CASHBACK_PROMOTION_TYPE_UNSPECIFIED", "FOUR_PERCENT", "FIVE_PERCENT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CashbackPromotionTypeDto implements Dto2<CreditCardBoostedCashbackFeature.CashbackPromotionType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CashbackPromotionTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CashbackPromotionTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CashbackPromotionTypeDto, CreditCardBoostedCashbackFeature.CashbackPromotionType>> binaryBase64Serializer$delegate;
        private final String json_value;
        public static final CashbackPromotionTypeDto CASHBACK_PROMOTION_TYPE_UNSPECIFIED = new CASHBACK_PROMOTION_TYPE_UNSPECIFIED("CASHBACK_PROMOTION_TYPE_UNSPECIFIED", 0);
        public static final CashbackPromotionTypeDto FOUR_PERCENT = new FOUR_PERCENT("FOUR_PERCENT", 1);
        public static final CashbackPromotionTypeDto FIVE_PERCENT = new FIVE_PERCENT("FIVE_PERCENT", 2);

        private static final /* synthetic */ CashbackPromotionTypeDto[] $values() {
            return new CashbackPromotionTypeDto[]{CASHBACK_PROMOTION_TYPE_UNSPECIFIED, FOUR_PERCENT, FIVE_PERCENT};
        }

        public /* synthetic */ CashbackPromotionTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2);
        }

        public static EnumEntries<CashbackPromotionTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CashbackPromotionTypeDto(String str, int i, String str2) {
            this.json_value = str2;
        }

        public final String getJson_value() {
            return this.json_value;
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardBoostedCashbackFeatureDto.CashbackPromotionTypeDto.CASHBACK_PROMOTION_TYPE_UNSPECIFIED", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto;", "toProto", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionType;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CASHBACK_PROMOTION_TYPE_UNSPECIFIED extends CashbackPromotionTypeDto {
            CASHBACK_PROMOTION_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, "", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardBoostedCashbackFeature.CashbackPromotionType toProto() {
                return CreditCardBoostedCashbackFeature.CashbackPromotionType.CASHBACK_PROMOTION_TYPE_UNSPECIFIED;
            }
        }

        static {
            CashbackPromotionTypeDto[] cashbackPromotionTypeDtoArr$values = $values();
            $VALUES = cashbackPromotionTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cashbackPromotionTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreditCardBoostedCashbackFeatureDto.CashbackPromotionTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardBoostedCashbackFeatureDto.CashbackPromotionTypeDto.FOUR_PERCENT", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto;", "toProto", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionType;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FOUR_PERCENT extends CashbackPromotionTypeDto {
            FOUR_PERCENT(String str, int i) {
                super(str, i, "four_percent", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardBoostedCashbackFeature.CashbackPromotionType toProto() {
                return CreditCardBoostedCashbackFeature.CashbackPromotionType.FOUR_PERCENT;
            }
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardBoostedCashbackFeatureDto.CashbackPromotionTypeDto.FIVE_PERCENT", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto;", "toProto", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionType;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIVE_PERCENT extends CashbackPromotionTypeDto {
            FIVE_PERCENT(String str, int i) {
                super(str, i, "five_percent", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardBoostedCashbackFeature.CashbackPromotionType toProto() {
                return CreditCardBoostedCashbackFeature.CashbackPromotionType.FIVE_PERCENT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CashbackPromotionTypeDto, CreditCardBoostedCashbackFeature.CashbackPromotionType> {

            /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CreditCardBoostedCashbackFeature.CashbackPromotionType.values().length];
                    try {
                        iArr[CreditCardBoostedCashbackFeature.CashbackPromotionType.CASHBACK_PROMOTION_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CreditCardBoostedCashbackFeature.CashbackPromotionType.FOUR_PERCENT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CreditCardBoostedCashbackFeature.CashbackPromotionType.FIVE_PERCENT.ordinal()] = 3;
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

            public final KSerializer<CashbackPromotionTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CashbackPromotionTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CashbackPromotionTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) CashbackPromotionTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CreditCardBoostedCashbackFeature.CashbackPromotionType> getProtoAdapter() {
                return CreditCardBoostedCashbackFeature.CashbackPromotionType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CashbackPromotionTypeDto getZeroValue() {
                return CashbackPromotionTypeDto.CASHBACK_PROMOTION_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CashbackPromotionTypeDto fromProto(CreditCardBoostedCashbackFeature.CashbackPromotionType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CashbackPromotionTypeDto.CASHBACK_PROMOTION_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return CashbackPromotionTypeDto.FOUR_PERCENT;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return CashbackPromotionTypeDto.FIVE_PERCENT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<CashbackPromotionTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CashbackPromotionTypeDto, CreditCardBoostedCashbackFeature.CashbackPromotionType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.midas.v1.CreditCardBoostedCashbackFeature.CashbackPromotionType", CashbackPromotionTypeDto.getEntries(), CashbackPromotionTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CashbackPromotionTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CashbackPromotionTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CashbackPromotionTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CashbackPromotionTypeDto valueOf(String str) {
            return (CashbackPromotionTypeDto) Enum.valueOf(CashbackPromotionTypeDto.class, str);
        }

        public static CashbackPromotionTypeDto[] values() {
            return (CashbackPromotionTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0019\u001aB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001b"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "STATUS_UNSPECIFIED", "DISABLED", "ELIGIBLE", "ACTIVATED", "REVOKED", "EXPIRED", "PENDING_ACTIVATION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CashbackPromotionStatusDto implements Dto2<CreditCardBoostedCashbackFeature.CashbackPromotionStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CashbackPromotionStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CashbackPromotionStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CashbackPromotionStatusDto, CreditCardBoostedCashbackFeature.CashbackPromotionStatus>> binaryBase64Serializer$delegate;
        private final String json_value;
        public static final CashbackPromotionStatusDto STATUS_UNSPECIFIED = new STATUS_UNSPECIFIED("STATUS_UNSPECIFIED", 0);
        public static final CashbackPromotionStatusDto DISABLED = new DISABLED("DISABLED", 1);
        public static final CashbackPromotionStatusDto ELIGIBLE = new ELIGIBLE("ELIGIBLE", 2);
        public static final CashbackPromotionStatusDto ACTIVATED = new ACTIVATED("ACTIVATED", 3);
        public static final CashbackPromotionStatusDto REVOKED = new REVOKED("REVOKED", 4);
        public static final CashbackPromotionStatusDto EXPIRED = new EXPIRED("EXPIRED", 5);
        public static final CashbackPromotionStatusDto PENDING_ACTIVATION = new PENDING_ACTIVATION("PENDING_ACTIVATION", 6);

        private static final /* synthetic */ CashbackPromotionStatusDto[] $values() {
            return new CashbackPromotionStatusDto[]{STATUS_UNSPECIFIED, DISABLED, ELIGIBLE, ACTIVATED, REVOKED, EXPIRED, PENDING_ACTIVATION};
        }

        public /* synthetic */ CashbackPromotionStatusDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2);
        }

        public static EnumEntries<CashbackPromotionStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CashbackPromotionStatusDto(String str, int i, String str2) {
            this.json_value = str2;
        }

        public final String getJson_value() {
            return this.json_value;
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardBoostedCashbackFeatureDto.CashbackPromotionStatusDto.STATUS_UNSPECIFIED", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "toProto", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATUS_UNSPECIFIED extends CashbackPromotionStatusDto {
            STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, "", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardBoostedCashbackFeature.CashbackPromotionStatus toProto() {
                return CreditCardBoostedCashbackFeature.CashbackPromotionStatus.STATUS_UNSPECIFIED;
            }
        }

        static {
            CashbackPromotionStatusDto[] cashbackPromotionStatusDtoArr$values = $values();
            $VALUES = cashbackPromotionStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cashbackPromotionStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreditCardBoostedCashbackFeatureDto.CashbackPromotionStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardBoostedCashbackFeatureDto.CashbackPromotionStatusDto.DISABLED", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "toProto", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DISABLED extends CashbackPromotionStatusDto {
            DISABLED(String str, int i) {
                super(str, i, "disabled", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardBoostedCashbackFeature.CashbackPromotionStatus toProto() {
                return CreditCardBoostedCashbackFeature.CashbackPromotionStatus.DISABLED;
            }
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardBoostedCashbackFeatureDto.CashbackPromotionStatusDto.ELIGIBLE", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "toProto", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ELIGIBLE extends CashbackPromotionStatusDto {
            ELIGIBLE(String str, int i) {
                super(str, i, "eligible", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardBoostedCashbackFeature.CashbackPromotionStatus toProto() {
                return CreditCardBoostedCashbackFeature.CashbackPromotionStatus.ELIGIBLE;
            }
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardBoostedCashbackFeatureDto.CashbackPromotionStatusDto.ACTIVATED", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "toProto", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACTIVATED extends CashbackPromotionStatusDto {
            ACTIVATED(String str, int i) {
                super(str, i, "activated", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardBoostedCashbackFeature.CashbackPromotionStatus toProto() {
                return CreditCardBoostedCashbackFeature.CashbackPromotionStatus.ACTIVATED;
            }
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardBoostedCashbackFeatureDto.CashbackPromotionStatusDto.REVOKED", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "toProto", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REVOKED extends CashbackPromotionStatusDto {
            REVOKED(String str, int i) {
                super(str, i, "revoked", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardBoostedCashbackFeature.CashbackPromotionStatus toProto() {
                return CreditCardBoostedCashbackFeature.CashbackPromotionStatus.REVOKED;
            }
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardBoostedCashbackFeatureDto.CashbackPromotionStatusDto.EXPIRED", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "toProto", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXPIRED extends CashbackPromotionStatusDto {
            EXPIRED(String str, int i) {
                super(str, i, MarginCall.STATE_EXPIRED, null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardBoostedCashbackFeature.CashbackPromotionStatus toProto() {
                return CreditCardBoostedCashbackFeature.CashbackPromotionStatus.EXPIRED;
            }
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardBoostedCashbackFeatureDto.CashbackPromotionStatusDto.PENDING_ACTIVATION", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "toProto", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING_ACTIVATION extends CashbackPromotionStatusDto {
            PENDING_ACTIVATION(String str, int i) {
                super(str, i, "pending_activation", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardBoostedCashbackFeature.CashbackPromotionStatus toProto() {
                return CreditCardBoostedCashbackFeature.CashbackPromotionStatus.PENDING_ACTIVATION;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$CashbackPromotionStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CashbackPromotionStatusDto, CreditCardBoostedCashbackFeature.CashbackPromotionStatus> {

            /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CreditCardBoostedCashbackFeature.CashbackPromotionStatus.values().length];
                    try {
                        iArr[CreditCardBoostedCashbackFeature.CashbackPromotionStatus.STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CreditCardBoostedCashbackFeature.CashbackPromotionStatus.DISABLED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CreditCardBoostedCashbackFeature.CashbackPromotionStatus.ELIGIBLE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CreditCardBoostedCashbackFeature.CashbackPromotionStatus.ACTIVATED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CreditCardBoostedCashbackFeature.CashbackPromotionStatus.REVOKED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CreditCardBoostedCashbackFeature.CashbackPromotionStatus.EXPIRED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[CreditCardBoostedCashbackFeature.CashbackPromotionStatus.PENDING_ACTIVATION.ordinal()] = 7;
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

            public final KSerializer<CashbackPromotionStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CashbackPromotionStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CashbackPromotionStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) CashbackPromotionStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CreditCardBoostedCashbackFeature.CashbackPromotionStatus> getProtoAdapter() {
                return CreditCardBoostedCashbackFeature.CashbackPromotionStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CashbackPromotionStatusDto getZeroValue() {
                return CashbackPromotionStatusDto.STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CashbackPromotionStatusDto fromProto(CreditCardBoostedCashbackFeature.CashbackPromotionStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return CashbackPromotionStatusDto.STATUS_UNSPECIFIED;
                    case 2:
                        return CashbackPromotionStatusDto.DISABLED;
                    case 3:
                        return CashbackPromotionStatusDto.ELIGIBLE;
                    case 4:
                        return CashbackPromotionStatusDto.ACTIVATED;
                    case 5:
                        return CashbackPromotionStatusDto.REVOKED;
                    case 6:
                        return CashbackPromotionStatusDto.EXPIRED;
                    case 7:
                        return CashbackPromotionStatusDto.PENDING_ACTIVATION;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$CashbackPromotionStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<CashbackPromotionStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CashbackPromotionStatusDto, CreditCardBoostedCashbackFeature.CashbackPromotionStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.midas.v1.CreditCardBoostedCashbackFeature.CashbackPromotionStatus", CashbackPromotionStatusDto.getEntries(), CashbackPromotionStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CashbackPromotionStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CashbackPromotionStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CashbackPromotionStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CashbackPromotionStatusDto valueOf(String str) {
            return (CashbackPromotionStatusDto) Enum.valueOf(CashbackPromotionStatusDto.class, str);
        }

        public static CashbackPromotionStatusDto[] values() {
            return (CashbackPromotionStatusDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$ClawbackPenaltyType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "CLAWBACK_PENALTY_TYPE_UNSPECIFIED", "POINTS_CLAWBACK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ClawbackPenaltyTypeDto implements Dto2<CreditCardBoostedCashbackFeature.ClawbackPenaltyType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ClawbackPenaltyTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ClawbackPenaltyTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ClawbackPenaltyTypeDto, CreditCardBoostedCashbackFeature.ClawbackPenaltyType>> binaryBase64Serializer$delegate;
        private final String json_value;
        public static final ClawbackPenaltyTypeDto CLAWBACK_PENALTY_TYPE_UNSPECIFIED = new CLAWBACK_PENALTY_TYPE_UNSPECIFIED("CLAWBACK_PENALTY_TYPE_UNSPECIFIED", 0);
        public static final ClawbackPenaltyTypeDto POINTS_CLAWBACK = new POINTS_CLAWBACK("POINTS_CLAWBACK", 1);

        private static final /* synthetic */ ClawbackPenaltyTypeDto[] $values() {
            return new ClawbackPenaltyTypeDto[]{CLAWBACK_PENALTY_TYPE_UNSPECIFIED, POINTS_CLAWBACK};
        }

        public /* synthetic */ ClawbackPenaltyTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2);
        }

        public static EnumEntries<ClawbackPenaltyTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ClawbackPenaltyTypeDto(String str, int i, String str2) {
            this.json_value = str2;
        }

        public final String getJson_value() {
            return this.json_value;
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardBoostedCashbackFeatureDto.ClawbackPenaltyTypeDto.CLAWBACK_PENALTY_TYPE_UNSPECIFIED", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto;", "toProto", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$ClawbackPenaltyType;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CLAWBACK_PENALTY_TYPE_UNSPECIFIED extends ClawbackPenaltyTypeDto {
            CLAWBACK_PENALTY_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, "", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardBoostedCashbackFeature.ClawbackPenaltyType toProto() {
                return CreditCardBoostedCashbackFeature.ClawbackPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED;
            }
        }

        static {
            ClawbackPenaltyTypeDto[] clawbackPenaltyTypeDtoArr$values = $values();
            $VALUES = clawbackPenaltyTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(clawbackPenaltyTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreditCardBoostedCashbackFeatureDto.ClawbackPenaltyTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardBoostedCashbackFeatureDto.ClawbackPenaltyTypeDto.POINTS_CLAWBACK", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto;", "toProto", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$ClawbackPenaltyType;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class POINTS_CLAWBACK extends ClawbackPenaltyTypeDto {
            POINTS_CLAWBACK(String str, int i) {
                super(str, i, "points_clawback", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardBoostedCashbackFeature.ClawbackPenaltyType toProto() {
                return CreditCardBoostedCashbackFeature.ClawbackPenaltyType.POINTS_CLAWBACK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeature$ClawbackPenaltyType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ClawbackPenaltyTypeDto, CreditCardBoostedCashbackFeature.ClawbackPenaltyType> {

            /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CreditCardBoostedCashbackFeature.ClawbackPenaltyType.values().length];
                    try {
                        iArr[CreditCardBoostedCashbackFeature.ClawbackPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CreditCardBoostedCashbackFeature.ClawbackPenaltyType.POINTS_CLAWBACK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ClawbackPenaltyTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ClawbackPenaltyTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ClawbackPenaltyTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) ClawbackPenaltyTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CreditCardBoostedCashbackFeature.ClawbackPenaltyType> getProtoAdapter() {
                return CreditCardBoostedCashbackFeature.ClawbackPenaltyType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ClawbackPenaltyTypeDto getZeroValue() {
                return ClawbackPenaltyTypeDto.CLAWBACK_PENALTY_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ClawbackPenaltyTypeDto fromProto(CreditCardBoostedCashbackFeature.ClawbackPenaltyType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ClawbackPenaltyTypeDto.CLAWBACK_PENALTY_TYPE_UNSPECIFIED;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return ClawbackPenaltyTypeDto.POINTS_CLAWBACK;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$ClawbackPenaltyTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<ClawbackPenaltyTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ClawbackPenaltyTypeDto, CreditCardBoostedCashbackFeature.ClawbackPenaltyType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.midas.v1.CreditCardBoostedCashbackFeature.ClawbackPenaltyType", ClawbackPenaltyTypeDto.getEntries(), ClawbackPenaltyTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ClawbackPenaltyTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ClawbackPenaltyTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ClawbackPenaltyTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ClawbackPenaltyTypeDto valueOf(String str) {
            return (ClawbackPenaltyTypeDto) Enum.valueOf(ClawbackPenaltyTypeDto.class, str);
        }

        public static ClawbackPenaltyTypeDto[] values() {
            return (ClawbackPenaltyTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto;", "<init>", "()V", "surrogateSerializer", "Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CreditCardBoostedCashbackFeatureDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.CreditCardBoostedCashbackFeature", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreditCardBoostedCashbackFeatureDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreditCardBoostedCashbackFeatureDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreditCardBoostedCashbackFeatureDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreditCardBoostedCashbackFeatureDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardBoostedCashbackFeatureDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "rosetta.midas.v1.CreditCardBoostedCashbackFeatureDto";
        }
    }
}

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
import rosetta.midas.p538v1.CreditCardCLIFeature;
import rosetta.midas.p538v1.CreditCardCLIFeatureDto;
import rosetta.midas.p538v1.PromotionDetailsDto;

/* compiled from: CreditCardCLIFeatureDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007'&()*+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006-"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto;", "Lcom/robinhood/idl/MessageDto;", "Lrosetta/midas/v1/CreditCardCLIFeature;", "Landroid/os/Parcelable;", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$Surrogate;", "surrogate", "<init>", "(Lrosetta/midas/v1/CreditCardCLIFeatureDto$Surrogate;)V", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto;", "cli_penalty_type", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;", "cli_promotion_type", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "cli_promotion_status", "Lrosetta/midas/v1/PromotionDetailsDto;", "promotion_details", "(Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto;Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;Lrosetta/midas/v1/PromotionDetailsDto;)V", "toProto", "()Lrosetta/midas/v1/CreditCardCLIFeature;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$Surrogate;", "Companion", "Surrogate", "CLIPromotionTypeDto", "CLIPromotionStatusDto", "CLIPenaltyTypeDto", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class CreditCardCLIFeatureDto implements Dto3<CreditCardCLIFeature>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreditCardCLIFeatureDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreditCardCLIFeatureDto, CreditCardCLIFeature>> binaryBase64Serializer$delegate;
    private static final CreditCardCLIFeatureDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreditCardCLIFeatureDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreditCardCLIFeatureDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ CreditCardCLIFeatureDto(CLIPenaltyTypeDto cLIPenaltyTypeDto, CLIPromotionTypeDto cLIPromotionTypeDto, CLIPromotionStatusDto cLIPromotionStatusDto, PromotionDetailsDto promotionDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CLIPenaltyTypeDto.INSTANCE.getZeroValue() : cLIPenaltyTypeDto, (i & 2) != 0 ? CLIPromotionTypeDto.INSTANCE.getZeroValue() : cLIPromotionTypeDto, (i & 4) != 0 ? CLIPromotionStatusDto.INSTANCE.getZeroValue() : cLIPromotionStatusDto, (i & 8) != 0 ? null : promotionDetailsDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreditCardCLIFeatureDto(CLIPenaltyTypeDto cli_penalty_type, CLIPromotionTypeDto cli_promotion_type, CLIPromotionStatusDto cli_promotion_status, PromotionDetailsDto promotionDetailsDto) {
        this(new Surrogate(cli_penalty_type, cli_promotion_type, cli_promotion_status, promotionDetailsDto));
        Intrinsics.checkNotNullParameter(cli_penalty_type, "cli_penalty_type");
        Intrinsics.checkNotNullParameter(cli_promotion_type, "cli_promotion_type");
        Intrinsics.checkNotNullParameter(cli_promotion_status, "cli_promotion_status");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CreditCardCLIFeature toProto() {
        CreditCardCLIFeature.CLIPenaltyType cLIPenaltyType = (CreditCardCLIFeature.CLIPenaltyType) this.surrogate.getCli_penalty_type().toProto();
        CreditCardCLIFeature.CLIPromotionType cLIPromotionType = (CreditCardCLIFeature.CLIPromotionType) this.surrogate.getCli_promotion_type().toProto();
        CreditCardCLIFeature.CLIPromotionStatus cLIPromotionStatus = (CreditCardCLIFeature.CLIPromotionStatus) this.surrogate.getCli_promotion_status().toProto();
        PromotionDetailsDto promotion_details = this.surrogate.getPromotion_details();
        return new CreditCardCLIFeature(cLIPenaltyType, cLIPromotionType, cLIPromotionStatus, promotion_details != null ? promotion_details.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[CreditCardCLIFeatureDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreditCardCLIFeatureDto) && Intrinsics.areEqual(((CreditCardCLIFeatureDto) other).surrogate, this.surrogate);
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
    /* compiled from: CreditCardCLIFeatureDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102¨\u00066"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto$Surrogate;", "", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto;", "cli_penalty_type", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;", "cli_promotion_type", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "cli_promotion_status", "Lrosetta/midas/v1/PromotionDetailsDto;", "promotion_details", "<init>", "(Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto;Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;Lrosetta/midas/v1/PromotionDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto;Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;Lrosetta/midas/v1/PromotionDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lrosetta/midas/v1/CreditCardCLIFeatureDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto;", "getCli_penalty_type", "()Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto;", "getCli_penalty_type$annotations", "()V", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;", "getCli_promotion_type", "()Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;", "getCli_promotion_type$annotations", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "getCli_promotion_status", "()Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "getCli_promotion_status$annotations", "Lrosetta/midas/v1/PromotionDetailsDto;", "getPromotion_details", "()Lrosetta/midas/v1/PromotionDetailsDto;", "getPromotion_details$annotations", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CLIPenaltyTypeDto cli_penalty_type;
        private final CLIPromotionStatusDto cli_promotion_status;
        private final CLIPromotionTypeDto cli_promotion_type;
        private final PromotionDetailsDto promotion_details;

        public Surrogate() {
            this((CLIPenaltyTypeDto) null, (CLIPromotionTypeDto) null, (CLIPromotionStatusDto) null, (PromotionDetailsDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.cli_penalty_type == surrogate.cli_penalty_type && this.cli_promotion_type == surrogate.cli_promotion_type && this.cli_promotion_status == surrogate.cli_promotion_status && Intrinsics.areEqual(this.promotion_details, surrogate.promotion_details);
        }

        public int hashCode() {
            int iHashCode = ((((this.cli_penalty_type.hashCode() * 31) + this.cli_promotion_type.hashCode()) * 31) + this.cli_promotion_status.hashCode()) * 31;
            PromotionDetailsDto promotionDetailsDto = this.promotion_details;
            return iHashCode + (promotionDetailsDto == null ? 0 : promotionDetailsDto.hashCode());
        }

        public String toString() {
            return "Surrogate(cli_penalty_type=" + this.cli_penalty_type + ", cli_promotion_type=" + this.cli_promotion_type + ", cli_promotion_status=" + this.cli_promotion_status + ", promotion_details=" + this.promotion_details + ")";
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreditCardCLIFeatureDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CLIPenaltyTypeDto cLIPenaltyTypeDto, CLIPromotionTypeDto cLIPromotionTypeDto, CLIPromotionStatusDto cLIPromotionStatusDto, PromotionDetailsDto promotionDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.cli_penalty_type = (i & 1) == 0 ? CLIPenaltyTypeDto.INSTANCE.getZeroValue() : cLIPenaltyTypeDto;
            if ((i & 2) == 0) {
                this.cli_promotion_type = CLIPromotionTypeDto.INSTANCE.getZeroValue();
            } else {
                this.cli_promotion_type = cLIPromotionTypeDto;
            }
            if ((i & 4) == 0) {
                this.cli_promotion_status = CLIPromotionStatusDto.INSTANCE.getZeroValue();
            } else {
                this.cli_promotion_status = cLIPromotionStatusDto;
            }
            if ((i & 8) == 0) {
                this.promotion_details = null;
            } else {
                this.promotion_details = promotionDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_midas_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.cli_penalty_type != CLIPenaltyTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, CLIPenaltyTypeDto.Serializer.INSTANCE, self.cli_penalty_type);
            }
            if (self.cli_promotion_type != CLIPromotionTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, CLIPromotionTypeDto.Serializer.INSTANCE, self.cli_promotion_type);
            }
            if (self.cli_promotion_status != CLIPromotionStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, CLIPromotionStatusDto.Serializer.INSTANCE, self.cli_promotion_status);
            }
            PromotionDetailsDto promotionDetailsDto = self.promotion_details;
            if (promotionDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, PromotionDetailsDto.Serializer.INSTANCE, promotionDetailsDto);
            }
        }

        public Surrogate(CLIPenaltyTypeDto cli_penalty_type, CLIPromotionTypeDto cli_promotion_type, CLIPromotionStatusDto cli_promotion_status, PromotionDetailsDto promotionDetailsDto) {
            Intrinsics.checkNotNullParameter(cli_penalty_type, "cli_penalty_type");
            Intrinsics.checkNotNullParameter(cli_promotion_type, "cli_promotion_type");
            Intrinsics.checkNotNullParameter(cli_promotion_status, "cli_promotion_status");
            this.cli_penalty_type = cli_penalty_type;
            this.cli_promotion_type = cli_promotion_type;
            this.cli_promotion_status = cli_promotion_status;
            this.promotion_details = promotionDetailsDto;
        }

        public final CLIPenaltyTypeDto getCli_penalty_type() {
            return this.cli_penalty_type;
        }

        public /* synthetic */ Surrogate(CLIPenaltyTypeDto cLIPenaltyTypeDto, CLIPromotionTypeDto cLIPromotionTypeDto, CLIPromotionStatusDto cLIPromotionStatusDto, PromotionDetailsDto promotionDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CLIPenaltyTypeDto.INSTANCE.getZeroValue() : cLIPenaltyTypeDto, (i & 2) != 0 ? CLIPromotionTypeDto.INSTANCE.getZeroValue() : cLIPromotionTypeDto, (i & 4) != 0 ? CLIPromotionStatusDto.INSTANCE.getZeroValue() : cLIPromotionStatusDto, (i & 8) != 0 ? null : promotionDetailsDto);
        }

        public final CLIPromotionTypeDto getCli_promotion_type() {
            return this.cli_promotion_type;
        }

        public final CLIPromotionStatusDto getCli_promotion_status() {
            return this.cli_promotion_status;
        }

        public final PromotionDetailsDto getPromotion_details() {
            return this.promotion_details;
        }
    }

    /* compiled from: CreditCardCLIFeatureDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrosetta/midas/v1/CreditCardCLIFeatureDto;", "Lrosetta/midas/v1/CreditCardCLIFeature;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/CreditCardCLIFeatureDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CreditCardCLIFeatureDto, CreditCardCLIFeature> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreditCardCLIFeatureDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreditCardCLIFeatureDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreditCardCLIFeatureDto> getBinaryBase64Serializer() {
            return (KSerializer) CreditCardCLIFeatureDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreditCardCLIFeature> getProtoAdapter() {
            return CreditCardCLIFeature.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreditCardCLIFeatureDto getZeroValue() {
            return CreditCardCLIFeatureDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreditCardCLIFeatureDto fromProto(CreditCardCLIFeature proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            CLIPenaltyTypeDto cLIPenaltyTypeDtoFromProto = CLIPenaltyTypeDto.INSTANCE.fromProto(proto.getCli_penalty_type());
            CLIPromotionTypeDto cLIPromotionTypeDtoFromProto = CLIPromotionTypeDto.INSTANCE.fromProto(proto.getCli_promotion_type());
            CLIPromotionStatusDto cLIPromotionStatusDtoFromProto = CLIPromotionStatusDto.INSTANCE.fromProto(proto.getCli_promotion_status());
            PromotionDetails promotion_details = proto.getPromotion_details();
            return new CreditCardCLIFeatureDto(new Surrogate(cLIPenaltyTypeDtoFromProto, cLIPromotionTypeDtoFromProto, cLIPromotionStatusDtoFromProto, promotion_details != null ? PromotionDetailsDto.INSTANCE.fromProto(promotion_details) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.CreditCardCLIFeatureDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreditCardCLIFeatureDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CreditCardCLIFeatureDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreditCardCLIFeatureDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001a\u001bB\u001d\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001c"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionType;", "Landroid/os/Parcelable;", "", "json_value", "", "db_enum", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "getDb_enum", "CLI_PROMOTION_TYPE_UNSPECIFIED", "CLI_300", "CLI_1000", "CLI_2500", "CLI_5000", "CLI_FLEXIBLE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CLIPromotionTypeDto implements Dto2<CreditCardCLIFeature.CLIPromotionType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CLIPromotionTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CLIPromotionTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CLIPromotionTypeDto, CreditCardCLIFeature.CLIPromotionType>> binaryBase64Serializer$delegate;
        private final String db_enum;
        private final String json_value;
        public static final CLIPromotionTypeDto CLI_PROMOTION_TYPE_UNSPECIFIED = new CLI_PROMOTION_TYPE_UNSPECIFIED("CLI_PROMOTION_TYPE_UNSPECIFIED", 0);
        public static final CLIPromotionTypeDto CLI_300 = new CLI_300("CLI_300", 1);
        public static final CLIPromotionTypeDto CLI_1000 = new CLI_1000("CLI_1000", 2);
        public static final CLIPromotionTypeDto CLI_2500 = new CLI_2500("CLI_2500", 3);
        public static final CLIPromotionTypeDto CLI_5000 = new CLI_5000("CLI_5000", 4);
        public static final CLIPromotionTypeDto CLI_FLEXIBLE = new CLI_FLEXIBLE("CLI_FLEXIBLE", 5);

        private static final /* synthetic */ CLIPromotionTypeDto[] $values() {
            return new CLIPromotionTypeDto[]{CLI_PROMOTION_TYPE_UNSPECIFIED, CLI_300, CLI_1000, CLI_2500, CLI_5000, CLI_FLEXIBLE};
        }

        public /* synthetic */ CLIPromotionTypeDto(String str, int i, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, str3);
        }

        public static EnumEntries<CLIPromotionTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CLIPromotionTypeDto(String str, int i, String str2, String str3) {
            this.json_value = str2;
            this.db_enum = str3;
        }

        public final String getJson_value() {
            return this.json_value;
        }

        public final String getDb_enum() {
            return this.db_enum;
        }

        static {
            CLIPromotionTypeDto[] cLIPromotionTypeDtoArr$values = $values();
            $VALUES = cLIPromotionTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cLIPromotionTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.CreditCardCLIFeatureDto$CLIPromotionTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreditCardCLIFeatureDto.CLIPromotionTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPromotionTypeDto.CLI_PROMOTION_TYPE_UNSPECIFIED", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionType;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CLI_PROMOTION_TYPE_UNSPECIFIED extends CLIPromotionTypeDto {
            CLI_PROMOTION_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, "", "", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPromotionType toProto() {
                return CreditCardCLIFeature.CLIPromotionType.CLI_PROMOTION_TYPE_UNSPECIFIED;
            }
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPromotionTypeDto.CLI_300", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionType;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CLI_300 extends CLIPromotionTypeDto {
            CLI_300(String str, int i) {
                super(str, i, "cli_300", "cli_400", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPromotionType toProto() {
                return CreditCardCLIFeature.CLIPromotionType.CLI_300;
            }
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPromotionTypeDto.CLI_1000", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionType;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CLI_1000 extends CLIPromotionTypeDto {
            CLI_1000(String str, int i) {
                super(str, i, "cli_1000", "", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPromotionType toProto() {
                return CreditCardCLIFeature.CLIPromotionType.CLI_1000;
            }
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPromotionTypeDto.CLI_2500", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionType;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CLI_2500 extends CLIPromotionTypeDto {
            CLI_2500(String str, int i) {
                super(str, i, "cli_2500", "", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPromotionType toProto() {
                return CreditCardCLIFeature.CLIPromotionType.CLI_2500;
            }
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPromotionTypeDto.CLI_5000", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionType;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CLI_5000 extends CLIPromotionTypeDto {
            CLI_5000(String str, int i) {
                super(str, i, "cli_5000", "", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPromotionType toProto() {
                return CreditCardCLIFeature.CLIPromotionType.CLI_5000;
            }
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPromotionTypeDto.CLI_FLEXIBLE", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionType;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class CLI_FLEXIBLE extends CLIPromotionTypeDto {
            CLI_FLEXIBLE(String str, int i) {
                super(str, i, "cli_flexible", "", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPromotionType toProto() {
                return CreditCardCLIFeature.CLIPromotionType.CLI_FLEXIBLE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CLIPromotionTypeDto, CreditCardCLIFeature.CLIPromotionType> {

            /* compiled from: CreditCardCLIFeatureDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CreditCardCLIFeature.CLIPromotionType.values().length];
                    try {
                        iArr[CreditCardCLIFeature.CLIPromotionType.CLI_PROMOTION_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CreditCardCLIFeature.CLIPromotionType.CLI_300.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CreditCardCLIFeature.CLIPromotionType.CLI_1000.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CreditCardCLIFeature.CLIPromotionType.CLI_2500.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CreditCardCLIFeature.CLIPromotionType.CLI_5000.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CreditCardCLIFeature.CLIPromotionType.CLI_FLEXIBLE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CLIPromotionTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CLIPromotionTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CLIPromotionTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) CLIPromotionTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CreditCardCLIFeature.CLIPromotionType> getProtoAdapter() {
                return CreditCardCLIFeature.CLIPromotionType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CLIPromotionTypeDto getZeroValue() {
                return CLIPromotionTypeDto.CLI_PROMOTION_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CLIPromotionTypeDto fromProto(CreditCardCLIFeature.CLIPromotionType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return CLIPromotionTypeDto.CLI_PROMOTION_TYPE_UNSPECIFIED;
                    case 2:
                        return CLIPromotionTypeDto.CLI_300;
                    case 3:
                        return CLIPromotionTypeDto.CLI_1000;
                    case 4:
                        return CLIPromotionTypeDto.CLI_2500;
                    case 5:
                        return CLIPromotionTypeDto.CLI_5000;
                    case 6:
                        return CLIPromotionTypeDto.CLI_FLEXIBLE;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<CLIPromotionTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CLIPromotionTypeDto, CreditCardCLIFeature.CLIPromotionType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.midas.v1.CreditCardCLIFeature.CLIPromotionType", CLIPromotionTypeDto.getEntries(), CLIPromotionTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CLIPromotionTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CLIPromotionTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CLIPromotionTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CLIPromotionTypeDto valueOf(String str) {
            return (CLIPromotionTypeDto) Enum.valueOf(CLIPromotionTypeDto.class, str);
        }

        public static CLIPromotionTypeDto[] values() {
            return (CLIPromotionTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreditCardCLIFeatureDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0019\u001aB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001b"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "STATUS_UNSPECIFIED", "DISABLED", "ELIGIBLE", "ACTIVATED", "REVOKED", "EXPIRED", "PENDING_ACTIVATION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CLIPromotionStatusDto implements Dto2<CreditCardCLIFeature.CLIPromotionStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CLIPromotionStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CLIPromotionStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CLIPromotionStatusDto, CreditCardCLIFeature.CLIPromotionStatus>> binaryBase64Serializer$delegate;
        private final String json_value;
        public static final CLIPromotionStatusDto STATUS_UNSPECIFIED = new STATUS_UNSPECIFIED("STATUS_UNSPECIFIED", 0);
        public static final CLIPromotionStatusDto DISABLED = new DISABLED("DISABLED", 1);
        public static final CLIPromotionStatusDto ELIGIBLE = new ELIGIBLE("ELIGIBLE", 2);
        public static final CLIPromotionStatusDto ACTIVATED = new ACTIVATED("ACTIVATED", 3);
        public static final CLIPromotionStatusDto REVOKED = new REVOKED("REVOKED", 4);
        public static final CLIPromotionStatusDto EXPIRED = new EXPIRED("EXPIRED", 5);
        public static final CLIPromotionStatusDto PENDING_ACTIVATION = new PENDING_ACTIVATION("PENDING_ACTIVATION", 6);

        private static final /* synthetic */ CLIPromotionStatusDto[] $values() {
            return new CLIPromotionStatusDto[]{STATUS_UNSPECIFIED, DISABLED, ELIGIBLE, ACTIVATED, REVOKED, EXPIRED, PENDING_ACTIVATION};
        }

        public /* synthetic */ CLIPromotionStatusDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2);
        }

        public static EnumEntries<CLIPromotionStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CLIPromotionStatusDto(String str, int i, String str2) {
            this.json_value = str2;
        }

        public final String getJson_value() {
            return this.json_value;
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPromotionStatusDto.STATUS_UNSPECIFIED", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATUS_UNSPECIFIED extends CLIPromotionStatusDto {
            STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, "", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPromotionStatus toProto() {
                return CreditCardCLIFeature.CLIPromotionStatus.STATUS_UNSPECIFIED;
            }
        }

        static {
            CLIPromotionStatusDto[] cLIPromotionStatusDtoArr$values = $values();
            $VALUES = cLIPromotionStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cLIPromotionStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.CreditCardCLIFeatureDto$CLIPromotionStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreditCardCLIFeatureDto.CLIPromotionStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPromotionStatusDto.DISABLED", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DISABLED extends CLIPromotionStatusDto {
            DISABLED(String str, int i) {
                super(str, i, "disabled", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPromotionStatus toProto() {
                return CreditCardCLIFeature.CLIPromotionStatus.DISABLED;
            }
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPromotionStatusDto.ELIGIBLE", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ELIGIBLE extends CLIPromotionStatusDto {
            ELIGIBLE(String str, int i) {
                super(str, i, "eligible", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPromotionStatus toProto() {
                return CreditCardCLIFeature.CLIPromotionStatus.ELIGIBLE;
            }
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPromotionStatusDto.ACTIVATED", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACTIVATED extends CLIPromotionStatusDto {
            ACTIVATED(String str, int i) {
                super(str, i, "activated", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPromotionStatus toProto() {
                return CreditCardCLIFeature.CLIPromotionStatus.ACTIVATED;
            }
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPromotionStatusDto.REVOKED", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REVOKED extends CLIPromotionStatusDto {
            REVOKED(String str, int i) {
                super(str, i, "revoked", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPromotionStatus toProto() {
                return CreditCardCLIFeature.CLIPromotionStatus.REVOKED;
            }
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPromotionStatusDto.EXPIRED", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXPIRED extends CLIPromotionStatusDto {
            EXPIRED(String str, int i) {
                super(str, i, MarginCall.STATE_EXPIRED, null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPromotionStatus toProto() {
                return CreditCardCLIFeature.CLIPromotionStatus.EXPIRED;
            }
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPromotionStatusDto.PENDING_ACTIVATION", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING_ACTIVATION extends CLIPromotionStatusDto {
            PENDING_ACTIVATION(String str, int i) {
                super(str, i, "pending_activation", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPromotionStatus toProto() {
                return CreditCardCLIFeature.CLIPromotionStatus.PENDING_ACTIVATION;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPromotionStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CLIPromotionStatusDto, CreditCardCLIFeature.CLIPromotionStatus> {

            /* compiled from: CreditCardCLIFeatureDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CreditCardCLIFeature.CLIPromotionStatus.values().length];
                    try {
                        iArr[CreditCardCLIFeature.CLIPromotionStatus.STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CreditCardCLIFeature.CLIPromotionStatus.DISABLED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CreditCardCLIFeature.CLIPromotionStatus.ELIGIBLE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CreditCardCLIFeature.CLIPromotionStatus.ACTIVATED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CreditCardCLIFeature.CLIPromotionStatus.REVOKED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CreditCardCLIFeature.CLIPromotionStatus.EXPIRED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[CreditCardCLIFeature.CLIPromotionStatus.PENDING_ACTIVATION.ordinal()] = 7;
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

            public final KSerializer<CLIPromotionStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CLIPromotionStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CLIPromotionStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) CLIPromotionStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CreditCardCLIFeature.CLIPromotionStatus> getProtoAdapter() {
                return CreditCardCLIFeature.CLIPromotionStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CLIPromotionStatusDto getZeroValue() {
                return CLIPromotionStatusDto.STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CLIPromotionStatusDto fromProto(CreditCardCLIFeature.CLIPromotionStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return CLIPromotionStatusDto.STATUS_UNSPECIFIED;
                    case 2:
                        return CLIPromotionStatusDto.DISABLED;
                    case 3:
                        return CLIPromotionStatusDto.ELIGIBLE;
                    case 4:
                        return CLIPromotionStatusDto.ACTIVATED;
                    case 5:
                        return CLIPromotionStatusDto.REVOKED;
                    case 6:
                        return CLIPromotionStatusDto.EXPIRED;
                    case 7:
                        return CLIPromotionStatusDto.PENDING_ACTIVATION;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPromotionStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<CLIPromotionStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CLIPromotionStatusDto, CreditCardCLIFeature.CLIPromotionStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.midas.v1.CreditCardCLIFeature.CLIPromotionStatus", CLIPromotionStatusDto.getEntries(), CLIPromotionStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CLIPromotionStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CLIPromotionStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CLIPromotionStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CLIPromotionStatusDto valueOf(String str) {
            return (CLIPromotionStatusDto) Enum.valueOf(CLIPromotionStatusDto.class, str);
        }

        public static CLIPromotionStatusDto[] values() {
            return (CLIPromotionStatusDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreditCardCLIFeatureDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPenaltyType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "CLAWBACK_PENALTY_TYPE_UNSPECIFIED", "CLI_CLAWBACK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CLIPenaltyTypeDto implements Dto2<CreditCardCLIFeature.CLIPenaltyType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CLIPenaltyTypeDto[] $VALUES;
        public static final CLIPenaltyTypeDto CLAWBACK_PENALTY_TYPE_UNSPECIFIED = new CLAWBACK_PENALTY_TYPE_UNSPECIFIED("CLAWBACK_PENALTY_TYPE_UNSPECIFIED", 0);
        public static final CLIPenaltyTypeDto CLI_CLAWBACK = new CLI_CLAWBACK("CLI_CLAWBACK", 1);

        @JvmField
        public static final Parcelable.Creator<CLIPenaltyTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CLIPenaltyTypeDto, CreditCardCLIFeature.CLIPenaltyType>> binaryBase64Serializer$delegate;
        private final String json_value;

        private static final /* synthetic */ CLIPenaltyTypeDto[] $values() {
            return new CLIPenaltyTypeDto[]{CLAWBACK_PENALTY_TYPE_UNSPECIFIED, CLI_CLAWBACK};
        }

        public /* synthetic */ CLIPenaltyTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2);
        }

        public static EnumEntries<CLIPenaltyTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CLIPenaltyTypeDto(String str, int i, String str2) {
            this.json_value = str2;
        }

        public final String getJson_value() {
            return this.json_value;
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPenaltyTypeDto.CLAWBACK_PENALTY_TYPE_UNSPECIFIED", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPenaltyType;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CLAWBACK_PENALTY_TYPE_UNSPECIFIED extends CLIPenaltyTypeDto {
            CLAWBACK_PENALTY_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, "", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPenaltyType toProto() {
                return CreditCardCLIFeature.CLIPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED;
            }
        }

        static {
            CLIPenaltyTypeDto[] cLIPenaltyTypeDtoArr$values = $values();
            $VALUES = cLIPenaltyTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cLIPenaltyTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.CreditCardCLIFeatureDto$CLIPenaltyTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreditCardCLIFeatureDto.CLIPenaltyTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rosetta/midas/v1/CreditCardCLIFeatureDto.CLIPenaltyTypeDto.CLI_CLAWBACK", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto;", "toProto", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPenaltyType;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CLI_CLAWBACK extends CLIPenaltyTypeDto {
            CLI_CLAWBACK(String str, int i) {
                super(str, i, "cli_clawback", null);
            }

            @Override // com.robinhood.idl.Dto
            public CreditCardCLIFeature.CLIPenaltyType toProto() {
                return CreditCardCLIFeature.CLIPenaltyType.CLI_CLAWBACK;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto;", "Lrosetta/midas/v1/CreditCardCLIFeature$CLIPenaltyType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CLIPenaltyTypeDto, CreditCardCLIFeature.CLIPenaltyType> {

            /* compiled from: CreditCardCLIFeatureDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CreditCardCLIFeature.CLIPenaltyType.values().length];
                    try {
                        iArr[CreditCardCLIFeature.CLIPenaltyType.CLAWBACK_PENALTY_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CreditCardCLIFeature.CLIPenaltyType.CLI_CLAWBACK.ordinal()] = 2;
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

            public final KSerializer<CLIPenaltyTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CLIPenaltyTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CLIPenaltyTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) CLIPenaltyTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CreditCardCLIFeature.CLIPenaltyType> getProtoAdapter() {
                return CreditCardCLIFeature.CLIPenaltyType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CLIPenaltyTypeDto getZeroValue() {
                return CLIPenaltyTypeDto.CLAWBACK_PENALTY_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CLIPenaltyTypeDto fromProto(CreditCardCLIFeature.CLIPenaltyType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CLIPenaltyTypeDto.CLAWBACK_PENALTY_TYPE_UNSPECIFIED;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return CLIPenaltyTypeDto.CLI_CLAWBACK;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CreditCardCLIFeatureDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$CLIPenaltyTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<CLIPenaltyTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CLIPenaltyTypeDto, CreditCardCLIFeature.CLIPenaltyType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.midas.v1.CreditCardCLIFeature.CLIPenaltyType", CLIPenaltyTypeDto.getEntries(), CLIPenaltyTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CLIPenaltyTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CLIPenaltyTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CLIPenaltyTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CLIPenaltyTypeDto valueOf(String str) {
            return (CLIPenaltyTypeDto) Enum.valueOf(CLIPenaltyTypeDto.class, str);
        }

        public static CLIPenaltyTypeDto[] values() {
            return (CLIPenaltyTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CreditCardCLIFeatureDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/CreditCardCLIFeatureDto;", "<init>", "()V", "surrogateSerializer", "Lrosetta/midas/v1/CreditCardCLIFeatureDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CreditCardCLIFeatureDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.CreditCardCLIFeature", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreditCardCLIFeatureDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreditCardCLIFeatureDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreditCardCLIFeatureDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreditCardCLIFeatureDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrosetta/midas/v1/CreditCardCLIFeatureDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "rosetta.midas.v1.CreditCardCLIFeatureDto";
        }
    }
}

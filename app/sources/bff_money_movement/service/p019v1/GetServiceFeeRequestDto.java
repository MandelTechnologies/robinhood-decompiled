package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import cashier_protos.payment_intents.p047v1.Direction;
import cashier_protos.payment_intents.p047v1.DirectionDto;
import cashier_protos.payment_intents.p047v1.FXTransferCreationDetails;
import cashier_protos.payment_intents.p047v1.FXTransferCreationDetailsDto;
import cashier_protos.payment_intents.p047v1.Purpose;
import cashier_protos.payment_intents.p047v1.PurposeDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.common.CurrencyDto;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GetServiceFeeRequestDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000532456B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u00101\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00067"}, m3636d2 = {"Lbff_money_movement/service/v1/GetServiceFeeRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/GetServiceFeeRequest;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/GetServiceFeeRequestDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/GetServiceFeeRequestDto$Surrogate;)V", "", "amount", "Lcom/robinhood/rosetta/common/CurrencyDto;", "currency", "Lcashier_protos/payment_intents/v1/DirectionDto;", "direction", "Lcashier_protos/payment_intents/v1/PurposeDto;", "purpose", "Lbff_money_movement/service/v1/GetServiceFeeRequestDto$TransferDetailsDto;", "transfer_details", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/CurrencyDto;Lcashier_protos/payment_intents/v1/DirectionDto;Lcashier_protos/payment_intents/v1/PurposeDto;Lbff_money_movement/service/v1/GetServiceFeeRequestDto$TransferDetailsDto;)V", "toProto", "()Lbff_money_movement/service/v1/GetServiceFeeRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/GetServiceFeeRequestDto$Surrogate;", "getAmount", "getCurrency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getDirection", "()Lcashier_protos/payment_intents/v1/DirectionDto;", "getPurpose", "()Lcashier_protos/payment_intents/v1/PurposeDto;", "Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;", "getFx_transfer_creation_details", "()Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;", "fx_transfer_creation_details", "Companion", "Surrogate", "TransferDetailsDto", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class GetServiceFeeRequestDto implements Dto3<GetServiceFeeRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetServiceFeeRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetServiceFeeRequestDto, GetServiceFeeRequest>> binaryBase64Serializer$delegate;
    private static final GetServiceFeeRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetServiceFeeRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetServiceFeeRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAmount() {
        return this.surrogate.getAmount();
    }

    public final CurrencyDto getCurrency() {
        return this.surrogate.getCurrency();
    }

    public final DirectionDto getDirection() {
        return this.surrogate.getDirection();
    }

    public final PurposeDto getPurpose() {
        return this.surrogate.getPurpose();
    }

    public final FXTransferCreationDetailsDto getFx_transfer_creation_details() {
        return this.surrogate.getFx_transfer_creation_details();
    }

    public /* synthetic */ GetServiceFeeRequestDto(String str, CurrencyDto currencyDto, DirectionDto directionDto, PurposeDto purposeDto, TransferDetailsDto transferDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 4) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 8) != 0 ? PurposeDto.INSTANCE.getZeroValue() : purposeDto, (i & 16) != 0 ? null : transferDetailsDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GetServiceFeeRequestDto(String str, CurrencyDto currency, DirectionDto direction, PurposeDto purpose, TransferDetailsDto transferDetailsDto) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        TransferDetailsDto.FxTransferCreationDetails fxTransferCreationDetails = transferDetailsDto instanceof TransferDetailsDto.FxTransferCreationDetails ? (TransferDetailsDto.FxTransferCreationDetails) transferDetailsDto : null;
        this(new Surrogate(str, currency, direction, purpose, fxTransferCreationDetails != null ? fxTransferCreationDetails.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetServiceFeeRequest toProto() {
        String amount = this.surrogate.getAmount();
        Currency currency = (Currency) this.surrogate.getCurrency().toProto();
        Direction direction = (Direction) this.surrogate.getDirection().toProto();
        Purpose purpose = (Purpose) this.surrogate.getPurpose().toProto();
        FXTransferCreationDetailsDto fx_transfer_creation_details = this.surrogate.getFx_transfer_creation_details();
        return new GetServiceFeeRequest(amount, currency, direction, purpose, fx_transfer_creation_details != null ? fx_transfer_creation_details.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[GetServiceFeeRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetServiceFeeRequestDto) && Intrinsics.areEqual(((GetServiceFeeRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetServiceFeeRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b7\u0010'\u001a\u0004\b5\u00106¨\u0006:"}, m3636d2 = {"Lbff_money_movement/service/v1/GetServiceFeeRequestDto$Surrogate;", "", "", "amount", "Lcom/robinhood/rosetta/common/CurrencyDto;", "currency", "Lcashier_protos/payment_intents/v1/DirectionDto;", "direction", "Lcashier_protos/payment_intents/v1/PurposeDto;", "purpose", "Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;", "fx_transfer_creation_details", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/CurrencyDto;Lcashier_protos/payment_intents/v1/DirectionDto;Lcashier_protos/payment_intents/v1/PurposeDto;Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/robinhood/rosetta/common/CurrencyDto;Lcashier_protos/payment_intents/v1/DirectionDto;Lcashier_protos/payment_intents/v1/PurposeDto;Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/GetServiceFeeRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAmount", "getAmount$annotations", "()V", "Lcom/robinhood/rosetta/common/CurrencyDto;", "getCurrency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getCurrency$annotations", "Lcashier_protos/payment_intents/v1/DirectionDto;", "getDirection", "()Lcashier_protos/payment_intents/v1/DirectionDto;", "getDirection$annotations", "Lcashier_protos/payment_intents/v1/PurposeDto;", "getPurpose", "()Lcashier_protos/payment_intents/v1/PurposeDto;", "getPurpose$annotations", "Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;", "getFx_transfer_creation_details", "()Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;", "getFx_transfer_creation_details$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String amount;
        private final CurrencyDto currency;
        private final DirectionDto direction;
        private final FXTransferCreationDetailsDto fx_transfer_creation_details;
        private final PurposeDto purpose;

        public Surrogate() {
            this((String) null, (CurrencyDto) null, (DirectionDto) null, (PurposeDto) null, (FXTransferCreationDetailsDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.amount, surrogate.amount) && this.currency == surrogate.currency && this.direction == surrogate.direction && this.purpose == surrogate.purpose && Intrinsics.areEqual(this.fx_transfer_creation_details, surrogate.fx_transfer_creation_details);
        }

        public int hashCode() {
            String str = this.amount;
            int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.direction.hashCode()) * 31) + this.purpose.hashCode()) * 31;
            FXTransferCreationDetailsDto fXTransferCreationDetailsDto = this.fx_transfer_creation_details;
            return iHashCode + (fXTransferCreationDetailsDto != null ? fXTransferCreationDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(amount=" + this.amount + ", currency=" + this.currency + ", direction=" + this.direction + ", purpose=" + this.purpose + ", fx_transfer_creation_details=" + this.fx_transfer_creation_details + ")";
        }

        /* compiled from: GetServiceFeeRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/GetServiceFeeRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetServiceFeeRequestDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetServiceFeeRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, CurrencyDto currencyDto, DirectionDto directionDto, PurposeDto purposeDto, FXTransferCreationDetailsDto fXTransferCreationDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.amount = null;
            } else {
                this.amount = str;
            }
            if ((i & 2) == 0) {
                this.currency = CurrencyDto.INSTANCE.getZeroValue();
            } else {
                this.currency = currencyDto;
            }
            if ((i & 4) == 0) {
                this.direction = DirectionDto.INSTANCE.getZeroValue();
            } else {
                this.direction = directionDto;
            }
            if ((i & 8) == 0) {
                this.purpose = PurposeDto.INSTANCE.getZeroValue();
            } else {
                this.purpose = purposeDto;
            }
            if ((i & 16) == 0) {
                this.fx_transfer_creation_details = null;
            } else {
                this.fx_transfer_creation_details = fXTransferCreationDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            String str = self.amount;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            if (self.currency != CurrencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, CurrencyDto.Serializer.INSTANCE, self.currency);
            }
            if (self.direction != DirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, DirectionDto.Serializer.INSTANCE, self.direction);
            }
            if (self.purpose != PurposeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, PurposeDto.Serializer.INSTANCE, self.purpose);
            }
            FXTransferCreationDetailsDto fXTransferCreationDetailsDto = self.fx_transfer_creation_details;
            if (fXTransferCreationDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, FXTransferCreationDetailsDto.Serializer.INSTANCE, fXTransferCreationDetailsDto);
            }
        }

        public Surrogate(String str, CurrencyDto currency, DirectionDto direction, PurposeDto purpose, FXTransferCreationDetailsDto fXTransferCreationDetailsDto) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(purpose, "purpose");
            this.amount = str;
            this.currency = currency;
            this.direction = direction;
            this.purpose = purpose;
            this.fx_transfer_creation_details = fXTransferCreationDetailsDto;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final CurrencyDto getCurrency() {
            return this.currency;
        }

        public /* synthetic */ Surrogate(String str, CurrencyDto currencyDto, DirectionDto directionDto, PurposeDto purposeDto, FXTransferCreationDetailsDto fXTransferCreationDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 4) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 8) != 0 ? PurposeDto.INSTANCE.getZeroValue() : purposeDto, (i & 16) != 0 ? null : fXTransferCreationDetailsDto);
        }

        public final DirectionDto getDirection() {
            return this.direction;
        }

        public final PurposeDto getPurpose() {
            return this.purpose;
        }

        public final FXTransferCreationDetailsDto getFx_transfer_creation_details() {
            return this.fx_transfer_creation_details;
        }
    }

    /* compiled from: GetServiceFeeRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/GetServiceFeeRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/GetServiceFeeRequestDto;", "Lbff_money_movement/service/v1/GetServiceFeeRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/GetServiceFeeRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetServiceFeeRequestDto, GetServiceFeeRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetServiceFeeRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetServiceFeeRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetServiceFeeRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetServiceFeeRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetServiceFeeRequest> getProtoAdapter() {
            return GetServiceFeeRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetServiceFeeRequestDto getZeroValue() {
            return GetServiceFeeRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetServiceFeeRequestDto fromProto(GetServiceFeeRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String amount = proto.getAmount();
            CurrencyDto currencyDtoFromProto = CurrencyDto.INSTANCE.fromProto(proto.getCurrency());
            DirectionDto directionDtoFromProto = DirectionDto.INSTANCE.fromProto(proto.getDirection());
            PurposeDto purposeDtoFromProto = PurposeDto.INSTANCE.fromProto(proto.getPurpose());
            FXTransferCreationDetails fx_transfer_creation_details = proto.getFx_transfer_creation_details();
            return new GetServiceFeeRequestDto(new Surrogate(amount, currencyDtoFromProto, directionDtoFromProto, purposeDtoFromProto, fx_transfer_creation_details != null ? FXTransferCreationDetailsDto.INSTANCE.fromProto(fx_transfer_creation_details) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.GetServiceFeeRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetServiceFeeRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetServiceFeeRequestDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetServiceFeeRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/GetServiceFeeRequestDto$TransferDetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "FxTransferCreationDetails", "Companion", "Lbff_money_movement/service/v1/GetServiceFeeRequestDto$TransferDetailsDto$FxTransferCreationDetails;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class TransferDetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ TransferDetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TransferDetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: GetServiceFeeRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbff_money_movement/service/v1/GetServiceFeeRequestDto$TransferDetailsDto$FxTransferCreationDetails;", "Lbff_money_movement/service/v1/GetServiceFeeRequestDto$TransferDetailsDto;", "Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;", "value", "<init>", "(Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;", "getValue", "()Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FxTransferCreationDetails extends TransferDetailsDto {
            private final FXTransferCreationDetailsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FxTransferCreationDetails) && Intrinsics.areEqual(this.value, ((FxTransferCreationDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "FxTransferCreationDetails(value=" + this.value + ")";
            }

            public final FXTransferCreationDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FxTransferCreationDetails(FXTransferCreationDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetServiceFeeRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbff_money_movement/service/v1/GetServiceFeeRequestDto$TransferDetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbff_money_movement/service/v1/GetServiceFeeRequestDto$TransferDetailsDto;", "Lbff_money_movement/service/v1/GetServiceFeeRequest;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<TransferDetailsDto, GetServiceFeeRequest> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetServiceFeeRequest> getProtoAdapter() {
                return GetServiceFeeRequest.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TransferDetailsDto fromProto(GetServiceFeeRequest proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getFx_transfer_creation_details() != null) {
                    return new FxTransferCreationDetails(FXTransferCreationDetailsDto.INSTANCE.fromProto(proto.getFx_transfer_creation_details()));
                }
                return null;
            }
        }
    }

    /* compiled from: GetServiceFeeRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/GetServiceFeeRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetServiceFeeRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/GetServiceFeeRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetServiceFeeRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.GetServiceFeeRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetServiceFeeRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetServiceFeeRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetServiceFeeRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetServiceFeeRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/GetServiceFeeRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.GetServiceFeeRequestDto";
        }
    }
}

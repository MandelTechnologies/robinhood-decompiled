package contracts.crypto.trade.proto.p431v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import contracts.crypto.trade.proto.p431v1.BottomSheetType;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import contracts.crypto.trade.proto.p431v1.TokenizationEstimatedPriceDto;
import contracts.crypto.trade.proto.p431v1.TokenizationEstimatedTotalCostDto;
import contracts.crypto.trade.proto.p431v1.TokenizationFxFeeDto;
import contracts.crypto.trade.proto.p431v1.TokenizationTradePowerDto;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rosetta.nummus.MonetizationModel;
import rosetta.nummus.MonetizationModelDto;
import rosetta.nummus.order.InputMode;
import rosetta.nummus.order.InputModeDto;
import rosetta.nummus.order.Side;
import rosetta.nummus.order.SideDto;
import rosetta.nummus.order.Type;
import rosetta.nummus.order.TypeDto;

/* compiled from: BottomSheetTypeDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\n'&()*+,-./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010%\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00060"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetType;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "type", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/BottomSheetType;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$Surrogate;", "getType", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "getSpread", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "spread", "Companion", "Surrogate", "TypeDto", "CryptoPowerDto", "MarketPriceDto", "SpreadDto", "TaxLotTransferredLotDto", "LimitOrderDefinitionDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class BottomSheetTypeDto implements Dto3<BottomSheetType>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BottomSheetTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BottomSheetTypeDto, BottomSheetType>> binaryBase64Serializer$delegate;
    private static final BottomSheetTypeDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BottomSheetTypeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BottomSheetTypeDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final TypeDto getType() {
        if (this.surrogate.getCrypto_power() != null) {
            return new TypeDto.CryptoPower(this.surrogate.getCrypto_power());
        }
        if (this.surrogate.getMarket_price() != null) {
            return new TypeDto.MarketPrice(this.surrogate.getMarket_price());
        }
        if (this.surrogate.getSpread() != null) {
            return new TypeDto.Spread(this.surrogate.getSpread());
        }
        if (this.surrogate.getTax_lot_transferred_lot() != null) {
            return new TypeDto.TaxLotTransferredLot(this.surrogate.getTax_lot_transferred_lot());
        }
        if (this.surrogate.getLimit_order_definition() != null) {
            return new TypeDto.LimitOrderDefinition(this.surrogate.getLimit_order_definition());
        }
        if (this.surrogate.getTokenization_trade_power() != null) {
            return new TypeDto.TokenizationTradePower(this.surrogate.getTokenization_trade_power());
        }
        if (this.surrogate.getTokenization_estimated_price() != null) {
            return new TypeDto.TokenizationEstimatedPrice(this.surrogate.getTokenization_estimated_price());
        }
        if (this.surrogate.getTokenization_fx_fee() != null) {
            return new TypeDto.TokenizationFxFee(this.surrogate.getTokenization_fx_fee());
        }
        if (this.surrogate.getTokenization_estimated_total_cost() != null) {
            return new TypeDto.TokenizationEstimatedTotalCost(this.surrogate.getTokenization_estimated_total_cost());
        }
        return null;
    }

    public final SpreadDto getSpread() {
        return this.surrogate.getSpread();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomSheetTypeDto(TypeDto typeDto) {
        TypeDto.CryptoPower cryptoPower = typeDto instanceof TypeDto.CryptoPower ? (TypeDto.CryptoPower) typeDto : null;
        CryptoPowerDto value = cryptoPower != null ? cryptoPower.getValue() : null;
        TypeDto.MarketPrice marketPrice = typeDto instanceof TypeDto.MarketPrice ? (TypeDto.MarketPrice) typeDto : null;
        MarketPriceDto value2 = marketPrice != null ? marketPrice.getValue() : null;
        TypeDto.Spread spread = typeDto instanceof TypeDto.Spread ? (TypeDto.Spread) typeDto : null;
        SpreadDto value3 = spread != null ? spread.getValue() : null;
        TypeDto.TaxLotTransferredLot taxLotTransferredLot = typeDto instanceof TypeDto.TaxLotTransferredLot ? (TypeDto.TaxLotTransferredLot) typeDto : null;
        TaxLotTransferredLotDto value4 = taxLotTransferredLot != null ? taxLotTransferredLot.getValue() : null;
        TypeDto.LimitOrderDefinition limitOrderDefinition = typeDto instanceof TypeDto.LimitOrderDefinition ? (TypeDto.LimitOrderDefinition) typeDto : null;
        LimitOrderDefinitionDto value5 = limitOrderDefinition != null ? limitOrderDefinition.getValue() : null;
        TypeDto.TokenizationTradePower tokenizationTradePower = typeDto instanceof TypeDto.TokenizationTradePower ? (TypeDto.TokenizationTradePower) typeDto : null;
        TokenizationTradePowerDto value6 = tokenizationTradePower != null ? tokenizationTradePower.getValue() : null;
        TypeDto.TokenizationEstimatedPrice tokenizationEstimatedPrice = typeDto instanceof TypeDto.TokenizationEstimatedPrice ? (TypeDto.TokenizationEstimatedPrice) typeDto : null;
        TokenizationEstimatedPriceDto value7 = tokenizationEstimatedPrice != null ? tokenizationEstimatedPrice.getValue() : null;
        TypeDto.TokenizationFxFee tokenizationFxFee = typeDto instanceof TypeDto.TokenizationFxFee ? (TypeDto.TokenizationFxFee) typeDto : null;
        TokenizationFxFeeDto value8 = tokenizationFxFee != null ? tokenizationFxFee.getValue() : null;
        TypeDto.TokenizationEstimatedTotalCost tokenizationEstimatedTotalCost = typeDto instanceof TypeDto.TokenizationEstimatedTotalCost ? (TypeDto.TokenizationEstimatedTotalCost) typeDto : null;
        this(new Surrogate(value, value2, value3, value4, value5, value6, value7, value8, tokenizationEstimatedTotalCost != null ? tokenizationEstimatedTotalCost.getValue() : null));
    }

    public /* synthetic */ BottomSheetTypeDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeDto);
    }

    @Override // com.robinhood.idl.Dto
    public BottomSheetType toProto() {
        CryptoPowerDto crypto_power = this.surrogate.getCrypto_power();
        BottomSheetType.CryptoPower proto = crypto_power != null ? crypto_power.toProto() : null;
        MarketPriceDto market_price = this.surrogate.getMarket_price();
        BottomSheetType.MarketPrice proto2 = market_price != null ? market_price.toProto() : null;
        SpreadDto spread = this.surrogate.getSpread();
        BottomSheetType.Spread proto3 = spread != null ? spread.toProto() : null;
        TaxLotTransferredLotDto tax_lot_transferred_lot = this.surrogate.getTax_lot_transferred_lot();
        BottomSheetType.TaxLotTransferredLot proto4 = tax_lot_transferred_lot != null ? tax_lot_transferred_lot.toProto() : null;
        LimitOrderDefinitionDto limit_order_definition = this.surrogate.getLimit_order_definition();
        BottomSheetType.LimitOrderDefinition proto5 = limit_order_definition != null ? limit_order_definition.toProto() : null;
        TokenizationTradePowerDto tokenization_trade_power = this.surrogate.getTokenization_trade_power();
        TokenizationTradePower proto6 = tokenization_trade_power != null ? tokenization_trade_power.toProto() : null;
        TokenizationEstimatedPriceDto tokenization_estimated_price = this.surrogate.getTokenization_estimated_price();
        TokenizationEstimatedPrice proto7 = tokenization_estimated_price != null ? tokenization_estimated_price.toProto() : null;
        TokenizationFxFeeDto tokenization_fx_fee = this.surrogate.getTokenization_fx_fee();
        TokenizationFxFee proto8 = tokenization_fx_fee != null ? tokenization_fx_fee.toProto() : null;
        TokenizationEstimatedTotalCostDto tokenization_estimated_total_cost = this.surrogate.getTokenization_estimated_total_cost();
        return new BottomSheetType(proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, tokenization_estimated_total_cost != null ? tokenization_estimated_total_cost.toProto() : null, null, 512, null);
    }

    public String toString() {
        return "[BottomSheetTypeDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BottomSheetTypeDto) && Intrinsics.areEqual(((BottomSheetTypeDto) other).surrogate, this.surrogate);
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
    /* compiled from: BottomSheetTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b*\b\u0083\b\u0018\u0000 R2\u00020\u0001:\u0002SRBs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bu\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b5\u00101\u001a\u0004\b3\u00104R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b9\u00101\u001a\u0004\b7\u00108R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\b=\u00101\u001a\u0004\b;\u0010<R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010>\u0012\u0004\bA\u00101\u001a\u0004\b?\u0010@R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010B\u0012\u0004\bE\u00101\u001a\u0004\bC\u0010DR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010F\u0012\u0004\bI\u00101\u001a\u0004\bG\u0010HR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010J\u0012\u0004\bM\u00101\u001a\u0004\bK\u0010LR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010N\u0012\u0004\bQ\u00101\u001a\u0004\bO\u0010P¨\u0006T"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto;", "crypto_power", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto;", "market_price", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "spread", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto;", "tax_lot_transferred_lot", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;", "limit_order_definition", "Lcontracts/crypto/trade/proto/v1/TokenizationTradePowerDto;", "tokenization_trade_power", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;", "tokenization_estimated_price", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", "tokenization_fx_fee", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "tokenization_estimated_total_cost", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto;Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto;Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto;Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;Lcontracts/crypto/trade/proto/v1/TokenizationTradePowerDto;Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto;Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto;Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto;Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;Lcontracts/crypto/trade/proto/v1/TokenizationTradePowerDto;Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto;", "getCrypto_power", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto;", "getCrypto_power$annotations", "()V", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto;", "getMarket_price", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto;", "getMarket_price$annotations", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "getSpread", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "getSpread$annotations", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto;", "getTax_lot_transferred_lot", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto;", "getTax_lot_transferred_lot$annotations", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;", "getLimit_order_definition", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;", "getLimit_order_definition$annotations", "Lcontracts/crypto/trade/proto/v1/TokenizationTradePowerDto;", "getTokenization_trade_power", "()Lcontracts/crypto/trade/proto/v1/TokenizationTradePowerDto;", "getTokenization_trade_power$annotations", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;", "getTokenization_estimated_price", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;", "getTokenization_estimated_price$annotations", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", "getTokenization_fx_fee", "()Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", "getTokenization_fx_fee$annotations", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "getTokenization_estimated_total_cost", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "getTokenization_estimated_total_cost$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CryptoPowerDto crypto_power;
        private final LimitOrderDefinitionDto limit_order_definition;
        private final MarketPriceDto market_price;
        private final SpreadDto spread;
        private final TaxLotTransferredLotDto tax_lot_transferred_lot;
        private final TokenizationEstimatedPriceDto tokenization_estimated_price;
        private final TokenizationEstimatedTotalCostDto tokenization_estimated_total_cost;
        private final TokenizationFxFeeDto tokenization_fx_fee;
        private final TokenizationTradePowerDto tokenization_trade_power;

        public Surrogate() {
            this((CryptoPowerDto) null, (MarketPriceDto) null, (SpreadDto) null, (TaxLotTransferredLotDto) null, (LimitOrderDefinitionDto) null, (TokenizationTradePowerDto) null, (TokenizationEstimatedPriceDto) null, (TokenizationFxFeeDto) null, (TokenizationEstimatedTotalCostDto) null, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.crypto_power, surrogate.crypto_power) && Intrinsics.areEqual(this.market_price, surrogate.market_price) && Intrinsics.areEqual(this.spread, surrogate.spread) && Intrinsics.areEqual(this.tax_lot_transferred_lot, surrogate.tax_lot_transferred_lot) && Intrinsics.areEqual(this.limit_order_definition, surrogate.limit_order_definition) && Intrinsics.areEqual(this.tokenization_trade_power, surrogate.tokenization_trade_power) && Intrinsics.areEqual(this.tokenization_estimated_price, surrogate.tokenization_estimated_price) && Intrinsics.areEqual(this.tokenization_fx_fee, surrogate.tokenization_fx_fee) && Intrinsics.areEqual(this.tokenization_estimated_total_cost, surrogate.tokenization_estimated_total_cost);
        }

        public int hashCode() {
            CryptoPowerDto cryptoPowerDto = this.crypto_power;
            int iHashCode = (cryptoPowerDto == null ? 0 : cryptoPowerDto.hashCode()) * 31;
            MarketPriceDto marketPriceDto = this.market_price;
            int iHashCode2 = (iHashCode + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
            SpreadDto spreadDto = this.spread;
            int iHashCode3 = (iHashCode2 + (spreadDto == null ? 0 : spreadDto.hashCode())) * 31;
            TaxLotTransferredLotDto taxLotTransferredLotDto = this.tax_lot_transferred_lot;
            int iHashCode4 = (iHashCode3 + (taxLotTransferredLotDto == null ? 0 : taxLotTransferredLotDto.hashCode())) * 31;
            LimitOrderDefinitionDto limitOrderDefinitionDto = this.limit_order_definition;
            int iHashCode5 = (iHashCode4 + (limitOrderDefinitionDto == null ? 0 : limitOrderDefinitionDto.hashCode())) * 31;
            TokenizationTradePowerDto tokenizationTradePowerDto = this.tokenization_trade_power;
            int iHashCode6 = (iHashCode5 + (tokenizationTradePowerDto == null ? 0 : tokenizationTradePowerDto.hashCode())) * 31;
            TokenizationEstimatedPriceDto tokenizationEstimatedPriceDto = this.tokenization_estimated_price;
            int iHashCode7 = (iHashCode6 + (tokenizationEstimatedPriceDto == null ? 0 : tokenizationEstimatedPriceDto.hashCode())) * 31;
            TokenizationFxFeeDto tokenizationFxFeeDto = this.tokenization_fx_fee;
            int iHashCode8 = (iHashCode7 + (tokenizationFxFeeDto == null ? 0 : tokenizationFxFeeDto.hashCode())) * 31;
            TokenizationEstimatedTotalCostDto tokenizationEstimatedTotalCostDto = this.tokenization_estimated_total_cost;
            return iHashCode8 + (tokenizationEstimatedTotalCostDto != null ? tokenizationEstimatedTotalCostDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(crypto_power=" + this.crypto_power + ", market_price=" + this.market_price + ", spread=" + this.spread + ", tax_lot_transferred_lot=" + this.tax_lot_transferred_lot + ", limit_order_definition=" + this.limit_order_definition + ", tokenization_trade_power=" + this.tokenization_trade_power + ", tokenization_estimated_price=" + this.tokenization_estimated_price + ", tokenization_fx_fee=" + this.tokenization_fx_fee + ", tokenization_estimated_total_cost=" + this.tokenization_estimated_total_cost + ")";
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BottomSheetTypeDto6.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CryptoPowerDto cryptoPowerDto, MarketPriceDto marketPriceDto, SpreadDto spreadDto, TaxLotTransferredLotDto taxLotTransferredLotDto, LimitOrderDefinitionDto limitOrderDefinitionDto, TokenizationTradePowerDto tokenizationTradePowerDto, TokenizationEstimatedPriceDto tokenizationEstimatedPriceDto, TokenizationFxFeeDto tokenizationFxFeeDto, TokenizationEstimatedTotalCostDto tokenizationEstimatedTotalCostDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.crypto_power = null;
            } else {
                this.crypto_power = cryptoPowerDto;
            }
            if ((i & 2) == 0) {
                this.market_price = null;
            } else {
                this.market_price = marketPriceDto;
            }
            if ((i & 4) == 0) {
                this.spread = null;
            } else {
                this.spread = spreadDto;
            }
            if ((i & 8) == 0) {
                this.tax_lot_transferred_lot = null;
            } else {
                this.tax_lot_transferred_lot = taxLotTransferredLotDto;
            }
            if ((i & 16) == 0) {
                this.limit_order_definition = null;
            } else {
                this.limit_order_definition = limitOrderDefinitionDto;
            }
            if ((i & 32) == 0) {
                this.tokenization_trade_power = null;
            } else {
                this.tokenization_trade_power = tokenizationTradePowerDto;
            }
            if ((i & 64) == 0) {
                this.tokenization_estimated_price = null;
            } else {
                this.tokenization_estimated_price = tokenizationEstimatedPriceDto;
            }
            if ((i & 128) == 0) {
                this.tokenization_fx_fee = null;
            } else {
                this.tokenization_fx_fee = tokenizationFxFeeDto;
            }
            if ((i & 256) == 0) {
                this.tokenization_estimated_total_cost = null;
            } else {
                this.tokenization_estimated_total_cost = tokenizationEstimatedTotalCostDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            CryptoPowerDto cryptoPowerDto = self.crypto_power;
            if (cryptoPowerDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, CryptoPowerDto.Serializer.INSTANCE, cryptoPowerDto);
            }
            MarketPriceDto marketPriceDto = self.market_price;
            if (marketPriceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MarketPriceDto.Serializer.INSTANCE, marketPriceDto);
            }
            SpreadDto spreadDto = self.spread;
            if (spreadDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, SpreadDto.Serializer.INSTANCE, spreadDto);
            }
            TaxLotTransferredLotDto taxLotTransferredLotDto = self.tax_lot_transferred_lot;
            if (taxLotTransferredLotDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TaxLotTransferredLotDto.Serializer.INSTANCE, taxLotTransferredLotDto);
            }
            LimitOrderDefinitionDto limitOrderDefinitionDto = self.limit_order_definition;
            if (limitOrderDefinitionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, LimitOrderDefinitionDto.Serializer.INSTANCE, limitOrderDefinitionDto);
            }
            TokenizationTradePowerDto tokenizationTradePowerDto = self.tokenization_trade_power;
            if (tokenizationTradePowerDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, TokenizationTradePowerDto.Serializer.INSTANCE, tokenizationTradePowerDto);
            }
            TokenizationEstimatedPriceDto tokenizationEstimatedPriceDto = self.tokenization_estimated_price;
            if (tokenizationEstimatedPriceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, TokenizationEstimatedPriceDto.Serializer.INSTANCE, tokenizationEstimatedPriceDto);
            }
            TokenizationFxFeeDto tokenizationFxFeeDto = self.tokenization_fx_fee;
            if (tokenizationFxFeeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, TokenizationFxFeeDto.Serializer.INSTANCE, tokenizationFxFeeDto);
            }
            TokenizationEstimatedTotalCostDto tokenizationEstimatedTotalCostDto = self.tokenization_estimated_total_cost;
            if (tokenizationEstimatedTotalCostDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, TokenizationEstimatedTotalCostDto.Serializer.INSTANCE, tokenizationEstimatedTotalCostDto);
            }
        }

        public Surrogate(CryptoPowerDto cryptoPowerDto, MarketPriceDto marketPriceDto, SpreadDto spreadDto, TaxLotTransferredLotDto taxLotTransferredLotDto, LimitOrderDefinitionDto limitOrderDefinitionDto, TokenizationTradePowerDto tokenizationTradePowerDto, TokenizationEstimatedPriceDto tokenizationEstimatedPriceDto, TokenizationFxFeeDto tokenizationFxFeeDto, TokenizationEstimatedTotalCostDto tokenizationEstimatedTotalCostDto) {
            this.crypto_power = cryptoPowerDto;
            this.market_price = marketPriceDto;
            this.spread = spreadDto;
            this.tax_lot_transferred_lot = taxLotTransferredLotDto;
            this.limit_order_definition = limitOrderDefinitionDto;
            this.tokenization_trade_power = tokenizationTradePowerDto;
            this.tokenization_estimated_price = tokenizationEstimatedPriceDto;
            this.tokenization_fx_fee = tokenizationFxFeeDto;
            this.tokenization_estimated_total_cost = tokenizationEstimatedTotalCostDto;
        }

        public /* synthetic */ Surrogate(CryptoPowerDto cryptoPowerDto, MarketPriceDto marketPriceDto, SpreadDto spreadDto, TaxLotTransferredLotDto taxLotTransferredLotDto, LimitOrderDefinitionDto limitOrderDefinitionDto, TokenizationTradePowerDto tokenizationTradePowerDto, TokenizationEstimatedPriceDto tokenizationEstimatedPriceDto, TokenizationFxFeeDto tokenizationFxFeeDto, TokenizationEstimatedTotalCostDto tokenizationEstimatedTotalCostDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cryptoPowerDto, (i & 2) != 0 ? null : marketPriceDto, (i & 4) != 0 ? null : spreadDto, (i & 8) != 0 ? null : taxLotTransferredLotDto, (i & 16) != 0 ? null : limitOrderDefinitionDto, (i & 32) != 0 ? null : tokenizationTradePowerDto, (i & 64) != 0 ? null : tokenizationEstimatedPriceDto, (i & 128) != 0 ? null : tokenizationFxFeeDto, (i & 256) != 0 ? null : tokenizationEstimatedTotalCostDto);
        }

        public final CryptoPowerDto getCrypto_power() {
            return this.crypto_power;
        }

        public final MarketPriceDto getMarket_price() {
            return this.market_price;
        }

        public final SpreadDto getSpread() {
            return this.spread;
        }

        public final TaxLotTransferredLotDto getTax_lot_transferred_lot() {
            return this.tax_lot_transferred_lot;
        }

        public final LimitOrderDefinitionDto getLimit_order_definition() {
            return this.limit_order_definition;
        }

        public final TokenizationTradePowerDto getTokenization_trade_power() {
            return this.tokenization_trade_power;
        }

        public final TokenizationEstimatedPriceDto getTokenization_estimated_price() {
            return this.tokenization_estimated_price;
        }

        public final TokenizationFxFeeDto getTokenization_fx_fee() {
            return this.tokenization_fx_fee;
        }

        public final TokenizationEstimatedTotalCostDto getTokenization_estimated_total_cost() {
            return this.tokenization_estimated_total_cost;
        }
    }

    /* compiled from: BottomSheetTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BottomSheetTypeDto, BottomSheetType> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BottomSheetTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BottomSheetTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BottomSheetTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) BottomSheetTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BottomSheetType> getProtoAdapter() {
            return BottomSheetType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BottomSheetTypeDto getZeroValue() {
            return BottomSheetTypeDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BottomSheetTypeDto fromProto(BottomSheetType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            BottomSheetType.CryptoPower crypto_power = proto.getCrypto_power();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CryptoPowerDto cryptoPowerDtoFromProto = crypto_power != null ? CryptoPowerDto.INSTANCE.fromProto(crypto_power) : null;
            BottomSheetType.MarketPrice market_price = proto.getMarket_price();
            MarketPriceDto marketPriceDtoFromProto = market_price != null ? MarketPriceDto.INSTANCE.fromProto(market_price) : null;
            BottomSheetType.Spread spread = proto.getSpread();
            SpreadDto spreadDtoFromProto = spread != null ? SpreadDto.INSTANCE.fromProto(spread) : null;
            BottomSheetType.TaxLotTransferredLot tax_lot_transferred_lot = proto.getTax_lot_transferred_lot();
            TaxLotTransferredLotDto taxLotTransferredLotDtoFromProto = tax_lot_transferred_lot != null ? TaxLotTransferredLotDto.INSTANCE.fromProto(tax_lot_transferred_lot) : null;
            BottomSheetType.LimitOrderDefinition limit_order_definition = proto.getLimit_order_definition();
            LimitOrderDefinitionDto limitOrderDefinitionDtoFromProto = limit_order_definition != null ? LimitOrderDefinitionDto.INSTANCE.fromProto(limit_order_definition) : null;
            TokenizationTradePower tokenization_trade_power = proto.getTokenization_trade_power();
            TokenizationTradePowerDto tokenizationTradePowerDtoFromProto = tokenization_trade_power != null ? TokenizationTradePowerDto.INSTANCE.fromProto(tokenization_trade_power) : null;
            TokenizationEstimatedPrice tokenization_estimated_price = proto.getTokenization_estimated_price();
            TokenizationEstimatedPriceDto tokenizationEstimatedPriceDtoFromProto = tokenization_estimated_price != null ? TokenizationEstimatedPriceDto.INSTANCE.fromProto(tokenization_estimated_price) : null;
            TokenizationFxFee tokenization_fx_fee = proto.getTokenization_fx_fee();
            TokenizationFxFeeDto tokenizationFxFeeDtoFromProto = tokenization_fx_fee != null ? TokenizationFxFeeDto.INSTANCE.fromProto(tokenization_fx_fee) : null;
            TokenizationEstimatedTotalCost tokenization_estimated_total_cost = proto.getTokenization_estimated_total_cost();
            return new BottomSheetTypeDto(new Surrogate(cryptoPowerDtoFromProto, marketPriceDtoFromProto, spreadDtoFromProto, taxLotTransferredLotDtoFromProto, limitOrderDefinitionDtoFromProto, tokenizationTradePowerDtoFromProto, tokenizationEstimatedPriceDtoFromProto, tokenizationFxFeeDtoFromProto, tokenization_estimated_total_cost != null ? TokenizationEstimatedTotalCostDto.INSTANCE.fromProto(tokenization_estimated_total_cost) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.BottomSheetTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomSheetTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BottomSheetTypeDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BottomSheetTypeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "CryptoPower", "MarketPrice", "Spread", "TaxLotTransferredLot", "LimitOrderDefinition", "TokenizationTradePower", "TokenizationEstimatedPrice", "TokenizationFxFee", "TokenizationEstimatedTotalCost", "Companion", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$CryptoPower;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$LimitOrderDefinition;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$MarketPrice;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$Spread;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TaxLotTransferredLot;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationEstimatedPrice;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationEstimatedTotalCost;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationFxFee;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationTradePower;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class TypeDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TypeDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$CryptoPower;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CryptoPower extends TypeDto {
            private final CryptoPowerDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CryptoPower) && Intrinsics.areEqual(this.value, ((CryptoPower) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CryptoPower(value=" + this.value + ")";
            }

            public final CryptoPowerDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CryptoPower(CryptoPowerDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$MarketPrice;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MarketPrice extends TypeDto {
            private final MarketPriceDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MarketPrice) && Intrinsics.areEqual(this.value, ((MarketPrice) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MarketPrice(value=" + this.value + ")";
            }

            public final MarketPriceDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarketPrice(MarketPriceDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$Spread;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Spread extends TypeDto {
            private final SpreadDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Spread) && Intrinsics.areEqual(this.value, ((Spread) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Spread(value=" + this.value + ")";
            }

            public final SpreadDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Spread(SpreadDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TaxLotTransferredLot;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TaxLotTransferredLot extends TypeDto {
            private final TaxLotTransferredLotDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TaxLotTransferredLot) && Intrinsics.areEqual(this.value, ((TaxLotTransferredLot) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TaxLotTransferredLot(value=" + this.value + ")";
            }

            public final TaxLotTransferredLotDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaxLotTransferredLot(TaxLotTransferredLotDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$LimitOrderDefinition;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LimitOrderDefinition extends TypeDto {
            private final LimitOrderDefinitionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LimitOrderDefinition) && Intrinsics.areEqual(this.value, ((LimitOrderDefinition) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "LimitOrderDefinition(value=" + this.value + ")";
            }

            public final LimitOrderDefinitionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LimitOrderDefinition(LimitOrderDefinitionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationTradePower;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/TokenizationTradePowerDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/TokenizationTradePowerDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/TokenizationTradePowerDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/TokenizationTradePowerDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TokenizationTradePower extends TypeDto {
            private final TokenizationTradePowerDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TokenizationTradePower) && Intrinsics.areEqual(this.value, ((TokenizationTradePower) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TokenizationTradePower(value=" + this.value + ")";
            }

            public final TokenizationTradePowerDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokenizationTradePower(TokenizationTradePowerDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationEstimatedPrice;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TokenizationEstimatedPrice extends TypeDto {
            private final TokenizationEstimatedPriceDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TokenizationEstimatedPrice) && Intrinsics.areEqual(this.value, ((TokenizationEstimatedPrice) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TokenizationEstimatedPrice(value=" + this.value + ")";
            }

            public final TokenizationEstimatedPriceDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokenizationEstimatedPrice(TokenizationEstimatedPriceDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationFxFee;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TokenizationFxFee extends TypeDto {
            private final TokenizationFxFeeDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TokenizationFxFee) && Intrinsics.areEqual(this.value, ((TokenizationFxFee) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TokenizationFxFee(value=" + this.value + ")";
            }

            public final TokenizationFxFeeDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokenizationFxFee(TokenizationFxFeeDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$TokenizationEstimatedTotalCost;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCostDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TokenizationEstimatedTotalCost extends TypeDto {
            private final TokenizationEstimatedTotalCostDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TokenizationEstimatedTotalCost) && Intrinsics.areEqual(this.value, ((TokenizationEstimatedTotalCost) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TokenizationEstimatedTotalCost(value=" + this.value + ")";
            }

            public final TokenizationEstimatedTotalCostDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokenizationEstimatedTotalCost(TokenizationEstimatedTotalCostDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetType;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<TypeDto, BottomSheetType> {
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
            public ProtoAdapter<BottomSheetType> getProtoAdapter() {
                return BottomSheetType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(BottomSheetType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getCrypto_power() != null) {
                    return new CryptoPower(CryptoPowerDto.INSTANCE.fromProto(proto.getCrypto_power()));
                }
                if (proto.getMarket_price() != null) {
                    return new MarketPrice(MarketPriceDto.INSTANCE.fromProto(proto.getMarket_price()));
                }
                if (proto.getSpread() != null) {
                    return new Spread(SpreadDto.INSTANCE.fromProto(proto.getSpread()));
                }
                if (proto.getTax_lot_transferred_lot() != null) {
                    return new TaxLotTransferredLot(TaxLotTransferredLotDto.INSTANCE.fromProto(proto.getTax_lot_transferred_lot()));
                }
                if (proto.getLimit_order_definition() != null) {
                    return new LimitOrderDefinition(LimitOrderDefinitionDto.INSTANCE.fromProto(proto.getLimit_order_definition()));
                }
                if (proto.getTokenization_trade_power() != null) {
                    return new TokenizationTradePower(TokenizationTradePowerDto.INSTANCE.fromProto(proto.getTokenization_trade_power()));
                }
                if (proto.getTokenization_estimated_price() != null) {
                    return new TokenizationEstimatedPrice(TokenizationEstimatedPriceDto.INSTANCE.fromProto(proto.getTokenization_estimated_price()));
                }
                if (proto.getTokenization_fx_fee() != null) {
                    return new TokenizationFxFee(TokenizationFxFeeDto.INSTANCE.fromProto(proto.getTokenization_fx_fee()));
                }
                if (proto.getTokenization_estimated_total_cost() != null) {
                    return new TokenizationEstimatedTotalCost(TokenizationEstimatedTotalCostDto.INSTANCE.fromProto(proto.getTokenization_estimated_total_cost()));
                }
                return null;
            }
        }
    }

    /* compiled from: BottomSheetTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$#%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$CryptoPower;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto$Surrogate;)V", "Lrosetta/nummus/order/InputModeDto;", "input_mode", "Lrosetta/nummus/order/SideDto;", "order_side", "", "asset_currency_code", "(Lrosetta/nummus/order/InputModeDto;Lrosetta/nummus/order/SideDto;Ljava/lang/String;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/BottomSheetType$CryptoPower;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CryptoPowerDto implements Dto3<BottomSheetType.CryptoPower>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<CryptoPowerDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CryptoPowerDto, BottomSheetType.CryptoPower>> binaryBase64Serializer$delegate;
        private static final CryptoPowerDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ CryptoPowerDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CryptoPowerDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public /* synthetic */ CryptoPowerDto(InputModeDto inputModeDto, SideDto sideDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? InputModeDto.INSTANCE.getZeroValue() : inputModeDto, (i & 2) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 4) != 0 ? "" : str);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CryptoPowerDto(InputModeDto input_mode, SideDto order_side, String asset_currency_code) {
            this(new Surrogate(input_mode, order_side, asset_currency_code));
            Intrinsics.checkNotNullParameter(input_mode, "input_mode");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public BottomSheetType.CryptoPower toProto() {
            return new BottomSheetType.CryptoPower((InputMode) this.surrogate.getInput_mode().toProto(), (Side) this.surrogate.getOrder_side().toProto(), this.surrogate.getAsset_currency_code(), null, 8, null);
        }

        public String toString() {
            return "[CryptoPowerDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof CryptoPowerDto) && Intrinsics.areEqual(((CryptoPowerDto) other).surrogate, this.surrogate);
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
        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b+\u0010$\u001a\u0004\b*\u0010\u0019¨\u0006."}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto$Surrogate;", "", "Lrosetta/nummus/order/InputModeDto;", "input_mode", "Lrosetta/nummus/order/SideDto;", "order_side", "", "asset_currency_code", "<init>", "(Lrosetta/nummus/order/InputModeDto;Lrosetta/nummus/order/SideDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/nummus/order/InputModeDto;Lrosetta/nummus/order/SideDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/nummus/order/InputModeDto;", "getInput_mode", "()Lrosetta/nummus/order/InputModeDto;", "getInput_mode$annotations", "()V", "Lrosetta/nummus/order/SideDto;", "getOrder_side", "()Lrosetta/nummus/order/SideDto;", "getOrder_side$annotations", "Ljava/lang/String;", "getAsset_currency_code", "getAsset_currency_code$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String asset_currency_code;
            private final InputModeDto input_mode;
            private final SideDto order_side;

            public Surrogate() {
                this((InputModeDto) null, (SideDto) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.input_mode == surrogate.input_mode && this.order_side == surrogate.order_side && Intrinsics.areEqual(this.asset_currency_code, surrogate.asset_currency_code);
            }

            public int hashCode() {
                return (((this.input_mode.hashCode() * 31) + this.order_side.hashCode()) * 31) + this.asset_currency_code.hashCode();
            }

            public String toString() {
                return "Surrogate(input_mode=" + this.input_mode + ", order_side=" + this.order_side + ", asset_currency_code=" + this.asset_currency_code + ")";
            }

            /* compiled from: BottomSheetTypeDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return BottomSheetTypeDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, InputModeDto inputModeDto, SideDto sideDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
                this.input_mode = (i & 1) == 0 ? InputModeDto.INSTANCE.getZeroValue() : inputModeDto;
                if ((i & 2) == 0) {
                    this.order_side = SideDto.INSTANCE.getZeroValue();
                } else {
                    this.order_side = sideDto;
                }
                if ((i & 4) == 0) {
                    this.asset_currency_code = "";
                } else {
                    this.asset_currency_code = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.input_mode != InputModeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, InputModeDto.Serializer.INSTANCE, self.input_mode);
                }
                if (self.order_side != SideDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, SideDto.Serializer.INSTANCE, self.order_side);
                }
                if (Intrinsics.areEqual(self.asset_currency_code, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 2, self.asset_currency_code);
            }

            public Surrogate(InputModeDto input_mode, SideDto order_side, String asset_currency_code) {
                Intrinsics.checkNotNullParameter(input_mode, "input_mode");
                Intrinsics.checkNotNullParameter(order_side, "order_side");
                Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
                this.input_mode = input_mode;
                this.order_side = order_side;
                this.asset_currency_code = asset_currency_code;
            }

            public final InputModeDto getInput_mode() {
                return this.input_mode;
            }

            public /* synthetic */ Surrogate(InputModeDto inputModeDto, SideDto sideDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? InputModeDto.INSTANCE.getZeroValue() : inputModeDto, (i & 2) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 4) != 0 ? "" : str);
            }

            public final SideDto getOrder_side() {
                return this.order_side;
            }

            public final String getAsset_currency_code() {
                return this.asset_currency_code;
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$CryptoPower;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<CryptoPowerDto, BottomSheetType.CryptoPower> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CryptoPowerDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CryptoPowerDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CryptoPowerDto> getBinaryBase64Serializer() {
                return (KSerializer) CryptoPowerDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<BottomSheetType.CryptoPower> getProtoAdapter() {
                return BottomSheetType.CryptoPower.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CryptoPowerDto getZeroValue() {
                return CryptoPowerDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CryptoPowerDto fromProto(BottomSheetType.CryptoPower proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new CryptoPowerDto(new Surrogate(InputModeDto.INSTANCE.fromProto(proto.getInput_mode()), SideDto.INSTANCE.fromProto(proto.getOrder_side()), proto.getAsset_currency_code()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.BottomSheetTypeDto$CryptoPowerDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BottomSheetTypeDto.CryptoPowerDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new CryptoPowerDto(null, null, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CryptoPowerDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.BottomSheetType.CryptoPower", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CryptoPowerDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public CryptoPowerDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new CryptoPowerDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$CryptoPowerDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.BottomSheetTypeDto$CryptoPowerDto";
            }
        }
    }

    /* compiled from: BottomSheetTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"!#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006%"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$MarketPrice;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto$Surrogate;)V", "Lrosetta/nummus/order/SideDto;", "order_side", "", "asset_currency_code", "(Lrosetta/nummus/order/SideDto;Ljava/lang/String;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/BottomSheetType$MarketPrice;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class MarketPriceDto implements Dto3<BottomSheetType.MarketPrice>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<MarketPriceDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<MarketPriceDto, BottomSheetType.MarketPrice>> binaryBase64Serializer$delegate;
        private static final MarketPriceDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ MarketPriceDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private MarketPriceDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public MarketPriceDto(SideDto order_side, String asset_currency_code) {
            this(new Surrogate(order_side, asset_currency_code));
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        }

        public /* synthetic */ MarketPriceDto(SideDto sideDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 2) != 0 ? "" : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public BottomSheetType.MarketPrice toProto() {
            return new BottomSheetType.MarketPrice((Side) this.surrogate.getOrder_side().toProto(), this.surrogate.getAsset_currency_code(), null, 4, null);
        }

        public String toString() {
            return "[MarketPriceDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof MarketPriceDto) && Intrinsics.areEqual(((MarketPriceDto) other).surrogate, this.surrogate);
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
        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u0017¨\u0006("}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto$Surrogate;", "", "Lrosetta/nummus/order/SideDto;", "order_side", "", "asset_currency_code", "<init>", "(Lrosetta/nummus/order/SideDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/nummus/order/SideDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/nummus/order/SideDto;", "getOrder_side", "()Lrosetta/nummus/order/SideDto;", "getOrder_side$annotations", "()V", "Ljava/lang/String;", "getAsset_currency_code", "getAsset_currency_code$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String asset_currency_code;
            private final SideDto order_side;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((SideDto) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.order_side == surrogate.order_side && Intrinsics.areEqual(this.asset_currency_code, surrogate.asset_currency_code);
            }

            public int hashCode() {
                return (this.order_side.hashCode() * 31) + this.asset_currency_code.hashCode();
            }

            public String toString() {
                return "Surrogate(order_side=" + this.order_side + ", asset_currency_code=" + this.asset_currency_code + ")";
            }

            /* compiled from: BottomSheetTypeDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return BottomSheetTypeDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, SideDto sideDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
                this.order_side = (i & 1) == 0 ? SideDto.INSTANCE.getZeroValue() : sideDto;
                if ((i & 2) == 0) {
                    this.asset_currency_code = "";
                } else {
                    this.asset_currency_code = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.order_side != SideDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, SideDto.Serializer.INSTANCE, self.order_side);
                }
                if (Intrinsics.areEqual(self.asset_currency_code, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 1, self.asset_currency_code);
            }

            public Surrogate(SideDto order_side, String asset_currency_code) {
                Intrinsics.checkNotNullParameter(order_side, "order_side");
                Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
                this.order_side = order_side;
                this.asset_currency_code = asset_currency_code;
            }

            public final SideDto getOrder_side() {
                return this.order_side;
            }

            public /* synthetic */ Surrogate(SideDto sideDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 2) != 0 ? "" : str);
            }

            public final String getAsset_currency_code() {
                return this.asset_currency_code;
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$MarketPrice;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<MarketPriceDto, BottomSheetType.MarketPrice> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MarketPriceDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MarketPriceDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MarketPriceDto> getBinaryBase64Serializer() {
                return (KSerializer) MarketPriceDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<BottomSheetType.MarketPrice> getProtoAdapter() {
                return BottomSheetType.MarketPrice.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MarketPriceDto getZeroValue() {
                return MarketPriceDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MarketPriceDto fromProto(BottomSheetType.MarketPrice proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new MarketPriceDto(new Surrogate(SideDto.INSTANCE.fromProto(proto.getOrder_side()), proto.getAsset_currency_code()), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.BottomSheetTypeDto$MarketPriceDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BottomSheetTypeDto.MarketPriceDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new MarketPriceDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<MarketPriceDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.BottomSheetType.MarketPrice", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, MarketPriceDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public MarketPriceDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new MarketPriceDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MarketPriceDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.BottomSheetTypeDto$MarketPriceDto";
            }
        }
    }

    /* compiled from: BottomSheetTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)¨\u0006."}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$Spread;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto$Surrogate;)V", "", "asset_currency_code", "Lrosetta/nummus/order/SideDto;", "order_side", "Lrosetta/nummus/order/TypeDto;", "order_type", "Lcom/robinhood/idl/IdlDecimal;", "rebate_ratio", "buy_spread_ratio", "sell_spread_ratio", "bid_price_formatted", "mid_price_formatted", "ask_price_formatted", "(Ljava/lang/String;Lrosetta/nummus/order/SideDto;Lrosetta/nummus/order/TypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/BottomSheetType$Spread;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SpreadDto implements Dto3<BottomSheetType.Spread>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<SpreadDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SpreadDto, BottomSheetType.Spread>> binaryBase64Serializer$delegate;
        private static final SpreadDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ SpreadDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private SpreadDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public /* synthetic */ SpreadDto(String str, SideDto sideDto, rosetta.nummus.order.TypeDto typeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 4) != 0 ? rosetta.nummus.order.TypeDto.INSTANCE.getZeroValue() : typeDto, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SpreadDto(String asset_currency_code, SideDto order_side, rosetta.nummus.order.TypeDto order_type, IdlDecimal rebate_ratio, IdlDecimal buy_spread_ratio, IdlDecimal sell_spread_ratio, String bid_price_formatted, String mid_price_formatted, String ask_price_formatted) {
            this(new Surrogate(asset_currency_code, order_side, order_type, rebate_ratio, buy_spread_ratio, sell_spread_ratio, bid_price_formatted, mid_price_formatted, ask_price_formatted));
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(rebate_ratio, "rebate_ratio");
            Intrinsics.checkNotNullParameter(buy_spread_ratio, "buy_spread_ratio");
            Intrinsics.checkNotNullParameter(sell_spread_ratio, "sell_spread_ratio");
            Intrinsics.checkNotNullParameter(bid_price_formatted, "bid_price_formatted");
            Intrinsics.checkNotNullParameter(mid_price_formatted, "mid_price_formatted");
            Intrinsics.checkNotNullParameter(ask_price_formatted, "ask_price_formatted");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public BottomSheetType.Spread toProto() {
            return new BottomSheetType.Spread(this.surrogate.getAsset_currency_code(), (Side) this.surrogate.getOrder_side().toProto(), (Type) this.surrogate.getOrder_type().toProto(), this.surrogate.getRebate_ratio().getStringValue(), this.surrogate.getBuy_spread_ratio().getStringValue(), this.surrogate.getSell_spread_ratio().getStringValue(), this.surrogate.getBid_price_formatted(), this.surrogate.getMid_price_formatted(), this.surrogate.getAsk_price_formatted(), null, 512, null);
        }

        public String toString() {
            return "[SpreadDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof SpreadDto) && Intrinsics.areEqual(((SpreadDto) other).surrogate, this.surrogate);
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
        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDB\u008e\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0017\b\u0002\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013Bu\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R/\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b9\u0010-\u001a\u0004\b7\u00108R/\u0010\r\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00106\u0012\u0004\b;\u0010-\u001a\u0004\b:\u00108R/\u0010\u000e\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\b=\u0010-\u001a\u0004\b<\u00108R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010*\u0012\u0004\b?\u0010-\u001a\u0004\b>\u0010#R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010*\u0012\u0004\bA\u0010-\u001a\u0004\b@\u0010#R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010*\u0012\u0004\bC\u0010-\u001a\u0004\bB\u0010#¨\u0006F"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto$Surrogate;", "", "", "asset_currency_code", "Lrosetta/nummus/order/SideDto;", "order_side", "Lrosetta/nummus/order/TypeDto;", "order_type", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "rebate_ratio", "buy_spread_ratio", "sell_spread_ratio", "bid_price_formatted", "mid_price_formatted", "ask_price_formatted", "<init>", "(Ljava/lang/String;Lrosetta/nummus/order/SideDto;Lrosetta/nummus/order/TypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrosetta/nummus/order/SideDto;Lrosetta/nummus/order/TypeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsset_currency_code", "getAsset_currency_code$annotations", "()V", "Lrosetta/nummus/order/SideDto;", "getOrder_side", "()Lrosetta/nummus/order/SideDto;", "getOrder_side$annotations", "Lrosetta/nummus/order/TypeDto;", "getOrder_type", "()Lrosetta/nummus/order/TypeDto;", "getOrder_type$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getRebate_ratio", "()Lcom/robinhood/idl/IdlDecimal;", "getRebate_ratio$annotations", "getBuy_spread_ratio", "getBuy_spread_ratio$annotations", "getSell_spread_ratio", "getSell_spread_ratio$annotations", "getBid_price_formatted", "getBid_price_formatted$annotations", "getMid_price_formatted", "getMid_price_formatted$annotations", "getAsk_price_formatted", "getAsk_price_formatted$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String ask_price_formatted;
            private final String asset_currency_code;
            private final String bid_price_formatted;
            private final IdlDecimal buy_spread_ratio;
            private final String mid_price_formatted;
            private final SideDto order_side;
            private final rosetta.nummus.order.TypeDto order_type;
            private final IdlDecimal rebate_ratio;
            private final IdlDecimal sell_spread_ratio;

            public Surrogate() {
                this((String) null, (SideDto) null, (rosetta.nummus.order.TypeDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.asset_currency_code, surrogate.asset_currency_code) && this.order_side == surrogate.order_side && this.order_type == surrogate.order_type && Intrinsics.areEqual(this.rebate_ratio, surrogate.rebate_ratio) && Intrinsics.areEqual(this.buy_spread_ratio, surrogate.buy_spread_ratio) && Intrinsics.areEqual(this.sell_spread_ratio, surrogate.sell_spread_ratio) && Intrinsics.areEqual(this.bid_price_formatted, surrogate.bid_price_formatted) && Intrinsics.areEqual(this.mid_price_formatted, surrogate.mid_price_formatted) && Intrinsics.areEqual(this.ask_price_formatted, surrogate.ask_price_formatted);
            }

            public int hashCode() {
                return (((((((((((((((this.asset_currency_code.hashCode() * 31) + this.order_side.hashCode()) * 31) + this.order_type.hashCode()) * 31) + this.rebate_ratio.hashCode()) * 31) + this.buy_spread_ratio.hashCode()) * 31) + this.sell_spread_ratio.hashCode()) * 31) + this.bid_price_formatted.hashCode()) * 31) + this.mid_price_formatted.hashCode()) * 31) + this.ask_price_formatted.hashCode();
            }

            public String toString() {
                return "Surrogate(asset_currency_code=" + this.asset_currency_code + ", order_side=" + this.order_side + ", order_type=" + this.order_type + ", rebate_ratio=" + this.rebate_ratio + ", buy_spread_ratio=" + this.buy_spread_ratio + ", sell_spread_ratio=" + this.sell_spread_ratio + ", bid_price_formatted=" + this.bid_price_formatted + ", mid_price_formatted=" + this.mid_price_formatted + ", ask_price_formatted=" + this.ask_price_formatted + ")";
            }

            /* compiled from: BottomSheetTypeDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return BottomSheetTypeDto5.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, SideDto sideDto, rosetta.nummus.order.TypeDto typeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.asset_currency_code = "";
                } else {
                    this.asset_currency_code = str;
                }
                if ((i & 2) == 0) {
                    this.order_side = SideDto.INSTANCE.getZeroValue();
                } else {
                    this.order_side = sideDto;
                }
                if ((i & 4) == 0) {
                    this.order_type = rosetta.nummus.order.TypeDto.INSTANCE.getZeroValue();
                } else {
                    this.order_type = typeDto;
                }
                if ((i & 8) == 0) {
                    this.rebate_ratio = new IdlDecimal("");
                } else {
                    this.rebate_ratio = idlDecimal;
                }
                if ((i & 16) == 0) {
                    this.buy_spread_ratio = new IdlDecimal("");
                } else {
                    this.buy_spread_ratio = idlDecimal2;
                }
                if ((i & 32) == 0) {
                    this.sell_spread_ratio = new IdlDecimal("");
                } else {
                    this.sell_spread_ratio = idlDecimal3;
                }
                if ((i & 64) == 0) {
                    this.bid_price_formatted = "";
                } else {
                    this.bid_price_formatted = str2;
                }
                if ((i & 128) == 0) {
                    this.mid_price_formatted = "";
                } else {
                    this.mid_price_formatted = str3;
                }
                if ((i & 256) == 0) {
                    this.ask_price_formatted = "";
                } else {
                    this.ask_price_formatted = str4;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.asset_currency_code, "")) {
                    output.encodeStringElement(serialDesc, 0, self.asset_currency_code);
                }
                if (self.order_side != SideDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, SideDto.Serializer.INSTANCE, self.order_side);
                }
                if (self.order_type != rosetta.nummus.order.TypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 2, TypeDto.Serializer.INSTANCE, self.order_type);
                }
                if (!Intrinsics.areEqual(self.rebate_ratio, new IdlDecimal(""))) {
                    output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.rebate_ratio);
                }
                if (!Intrinsics.areEqual(self.buy_spread_ratio, new IdlDecimal(""))) {
                    output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.buy_spread_ratio);
                }
                if (!Intrinsics.areEqual(self.sell_spread_ratio, new IdlDecimal(""))) {
                    output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.sell_spread_ratio);
                }
                if (!Intrinsics.areEqual(self.bid_price_formatted, "")) {
                    output.encodeStringElement(serialDesc, 6, self.bid_price_formatted);
                }
                if (!Intrinsics.areEqual(self.mid_price_formatted, "")) {
                    output.encodeStringElement(serialDesc, 7, self.mid_price_formatted);
                }
                if (Intrinsics.areEqual(self.ask_price_formatted, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 8, self.ask_price_formatted);
            }

            public Surrogate(String asset_currency_code, SideDto order_side, rosetta.nummus.order.TypeDto order_type, IdlDecimal rebate_ratio, IdlDecimal buy_spread_ratio, IdlDecimal sell_spread_ratio, String bid_price_formatted, String mid_price_formatted, String ask_price_formatted) {
                Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
                Intrinsics.checkNotNullParameter(order_side, "order_side");
                Intrinsics.checkNotNullParameter(order_type, "order_type");
                Intrinsics.checkNotNullParameter(rebate_ratio, "rebate_ratio");
                Intrinsics.checkNotNullParameter(buy_spread_ratio, "buy_spread_ratio");
                Intrinsics.checkNotNullParameter(sell_spread_ratio, "sell_spread_ratio");
                Intrinsics.checkNotNullParameter(bid_price_formatted, "bid_price_formatted");
                Intrinsics.checkNotNullParameter(mid_price_formatted, "mid_price_formatted");
                Intrinsics.checkNotNullParameter(ask_price_formatted, "ask_price_formatted");
                this.asset_currency_code = asset_currency_code;
                this.order_side = order_side;
                this.order_type = order_type;
                this.rebate_ratio = rebate_ratio;
                this.buy_spread_ratio = buy_spread_ratio;
                this.sell_spread_ratio = sell_spread_ratio;
                this.bid_price_formatted = bid_price_formatted;
                this.mid_price_formatted = mid_price_formatted;
                this.ask_price_formatted = ask_price_formatted;
            }

            public /* synthetic */ Surrogate(String str, SideDto sideDto, rosetta.nummus.order.TypeDto typeDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 4) != 0 ? rosetta.nummus.order.TypeDto.INSTANCE.getZeroValue() : typeDto, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4);
            }

            public final String getAsset_currency_code() {
                return this.asset_currency_code;
            }

            public final SideDto getOrder_side() {
                return this.order_side;
            }

            public final rosetta.nummus.order.TypeDto getOrder_type() {
                return this.order_type;
            }

            public final IdlDecimal getRebate_ratio() {
                return this.rebate_ratio;
            }

            public final IdlDecimal getBuy_spread_ratio() {
                return this.buy_spread_ratio;
            }

            public final IdlDecimal getSell_spread_ratio() {
                return this.sell_spread_ratio;
            }

            public final String getBid_price_formatted() {
                return this.bid_price_formatted;
            }

            public final String getMid_price_formatted() {
                return this.mid_price_formatted;
            }

            public final String getAsk_price_formatted() {
                return this.ask_price_formatted;
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$Spread;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<SpreadDto, BottomSheetType.Spread> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SpreadDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SpreadDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SpreadDto> getBinaryBase64Serializer() {
                return (KSerializer) SpreadDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<BottomSheetType.Spread> getProtoAdapter() {
                return BottomSheetType.Spread.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SpreadDto getZeroValue() {
                return SpreadDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SpreadDto fromProto(BottomSheetType.Spread proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new SpreadDto(new Surrogate(proto.getAsset_currency_code(), SideDto.INSTANCE.fromProto(proto.getOrder_side()), rosetta.nummus.order.TypeDto.INSTANCE.fromProto(proto.getOrder_type()), new IdlDecimal(proto.getRebate_ratio()), new IdlDecimal(proto.getBuy_spread_ratio()), new IdlDecimal(proto.getSell_spread_ratio()), proto.getBid_price_formatted(), proto.getMid_price_formatted(), proto.getAsk_price_formatted()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.BottomSheetTypeDto$SpreadDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BottomSheetTypeDto.SpreadDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new SpreadDto(null, null, null, null, null, null, null, null, null, 511, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<SpreadDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.BottomSheetType.Spread", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SpreadDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public SpreadDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new SpreadDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4185_1)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.BottomSheetTypeDto$SpreadDto";
            }
        }
    }

    /* compiled from: BottomSheetTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$TaxLotTransferredLot;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/BottomSheetType$TaxLotTransferredLot;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TaxLotTransferredLotDto implements Dto3<BottomSheetType.TaxLotTransferredLot>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TaxLotTransferredLotDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TaxLotTransferredLotDto, BottomSheetType.TaxLotTransferredLot>> binaryBase64Serializer$delegate;
        private static final TaxLotTransferredLotDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TaxLotTransferredLotDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TaxLotTransferredLotDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public TaxLotTransferredLotDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public BottomSheetType.TaxLotTransferredLot toProto() {
            return new BottomSheetType.TaxLotTransferredLot(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[TaxLotTransferredLotDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TaxLotTransferredLotDto) && Intrinsics.areEqual(((TaxLotTransferredLotDto) other).surrogate, this.surrogate);
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
        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.BottomSheetTypeDto$TaxLotTransferredLotDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BottomSheetTypeDto.TaxLotTransferredLotDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return 865568830;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("contracts.crypto.trade.proto.v1.BottomSheetTypeDto.TaxLotTransferredLotDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$TaxLotTransferredLot;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<TaxLotTransferredLotDto, BottomSheetType.TaxLotTransferredLot> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TaxLotTransferredLotDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TaxLotTransferredLotDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TaxLotTransferredLotDto> getBinaryBase64Serializer() {
                return (KSerializer) TaxLotTransferredLotDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<BottomSheetType.TaxLotTransferredLot> getProtoAdapter() {
                return BottomSheetType.TaxLotTransferredLot.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TaxLotTransferredLotDto getZeroValue() {
                return TaxLotTransferredLotDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TaxLotTransferredLotDto fromProto(BottomSheetType.TaxLotTransferredLot proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new TaxLotTransferredLotDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.BottomSheetTypeDto$TaxLotTransferredLotDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BottomSheetTypeDto.TaxLotTransferredLotDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TaxLotTransferredLotDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TaxLotTransferredLotDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.BottomSheetType.TaxLotTransferredLot", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TaxLotTransferredLotDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TaxLotTransferredLotDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TaxLotTransferredLotDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$TaxLotTransferredLotDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4191_7)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.BottomSheetTypeDto$TaxLotTransferredLotDto";
            }
        }
    }

    /* compiled from: BottomSheetTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B[\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)¨\u0006."}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$LimitOrderDefinition;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto$Surrogate;)V", "", "asset_currency_code", "Lrosetta/nummus/order/SideDto;", "order_side", "Lrosetta/nummus/MonetizationModelDto;", "monetization_model", "bid_price_formatted", "ask_price_formatted", "Lcom/robinhood/idl/IdlDecimal;", "buy_spread_ratio", "sell_spread_ratio", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "spread_bottom_sheet_data", "(Ljava/lang/String;Lrosetta/nummus/order/SideDto;Lrosetta/nummus/MonetizationModelDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/BottomSheetType$LimitOrderDefinition;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class LimitOrderDefinitionDto implements Dto3<BottomSheetType.LimitOrderDefinition>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<LimitOrderDefinitionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<LimitOrderDefinitionDto, BottomSheetType.LimitOrderDefinition>> binaryBase64Serializer$delegate;
        private static final LimitOrderDefinitionDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ LimitOrderDefinitionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private LimitOrderDefinitionDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public /* synthetic */ LimitOrderDefinitionDto(String str, SideDto sideDto, MonetizationModelDto monetizationModelDto, String str2, String str3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, SpreadDto spreadDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 4) != 0 ? MonetizationModelDto.INSTANCE.getZeroValue() : monetizationModelDto, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal, (i & 64) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 128) != 0 ? null : spreadDto);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public LimitOrderDefinitionDto(String asset_currency_code, SideDto order_side, MonetizationModelDto monetization_model, String bid_price_formatted, String ask_price_formatted, IdlDecimal buy_spread_ratio, IdlDecimal sell_spread_ratio, SpreadDto spreadDto) {
            this(new Surrogate(asset_currency_code, order_side, monetization_model, bid_price_formatted, ask_price_formatted, buy_spread_ratio, sell_spread_ratio, spreadDto));
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
            Intrinsics.checkNotNullParameter(bid_price_formatted, "bid_price_formatted");
            Intrinsics.checkNotNullParameter(ask_price_formatted, "ask_price_formatted");
            Intrinsics.checkNotNullParameter(buy_spread_ratio, "buy_spread_ratio");
            Intrinsics.checkNotNullParameter(sell_spread_ratio, "sell_spread_ratio");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public BottomSheetType.LimitOrderDefinition toProto() {
            String asset_currency_code = this.surrogate.getAsset_currency_code();
            Side side = (Side) this.surrogate.getOrder_side().toProto();
            MonetizationModel monetizationModel = (MonetizationModel) this.surrogate.getMonetization_model().toProto();
            String bid_price_formatted = this.surrogate.getBid_price_formatted();
            String ask_price_formatted = this.surrogate.getAsk_price_formatted();
            String stringValue = this.surrogate.getBuy_spread_ratio().getStringValue();
            String stringValue2 = this.surrogate.getSell_spread_ratio().getStringValue();
            SpreadDto spread_bottom_sheet_data = this.surrogate.getSpread_bottom_sheet_data();
            return new BottomSheetType.LimitOrderDefinition(asset_currency_code, side, monetizationModel, bid_price_formatted, ask_price_formatted, stringValue, stringValue2, spread_bottom_sheet_data != null ? spread_bottom_sheet_data.toProto() : null, null, 256, null);
        }

        public String toString() {
            return "[LimitOrderDefinitionDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof LimitOrderDefinitionDto) && Intrinsics.areEqual(((LimitOrderDefinitionDto) other).surrogate, this.surrogate);
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
        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDBw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bk\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b7\u0010-\u001a\u0004\b6\u0010#R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b9\u0010-\u001a\u0004\b8\u0010#R/\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010:\u0012\u0004\b=\u0010-\u001a\u0004\b;\u0010<R/\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010:\u0012\u0004\b?\u0010-\u001a\u0004\b>\u0010<R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010@\u0012\u0004\bC\u0010-\u001a\u0004\bA\u0010B¨\u0006F"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto$Surrogate;", "", "", "asset_currency_code", "Lrosetta/nummus/order/SideDto;", "order_side", "Lrosetta/nummus/MonetizationModelDto;", "monetization_model", "bid_price_formatted", "ask_price_formatted", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "buy_spread_ratio", "sell_spread_ratio", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "spread_bottom_sheet_data", "<init>", "(Ljava/lang/String;Lrosetta/nummus/order/SideDto;Lrosetta/nummus/MonetizationModelDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrosetta/nummus/order/SideDto;Lrosetta/nummus/MonetizationModelDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsset_currency_code", "getAsset_currency_code$annotations", "()V", "Lrosetta/nummus/order/SideDto;", "getOrder_side", "()Lrosetta/nummus/order/SideDto;", "getOrder_side$annotations", "Lrosetta/nummus/MonetizationModelDto;", "getMonetization_model", "()Lrosetta/nummus/MonetizationModelDto;", "getMonetization_model$annotations", "getBid_price_formatted", "getBid_price_formatted$annotations", "getAsk_price_formatted", "getAsk_price_formatted$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getBuy_spread_ratio", "()Lcom/robinhood/idl/IdlDecimal;", "getBuy_spread_ratio$annotations", "getSell_spread_ratio", "getSell_spread_ratio$annotations", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "getSpread_bottom_sheet_data", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$SpreadDto;", "getSpread_bottom_sheet_data$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String ask_price_formatted;
            private final String asset_currency_code;
            private final String bid_price_formatted;
            private final IdlDecimal buy_spread_ratio;
            private final MonetizationModelDto monetization_model;
            private final SideDto order_side;
            private final IdlDecimal sell_spread_ratio;
            private final SpreadDto spread_bottom_sheet_data;

            public Surrogate() {
                this((String) null, (SideDto) null, (MonetizationModelDto) null, (String) null, (String) null, (IdlDecimal) null, (IdlDecimal) null, (SpreadDto) null, 255, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.asset_currency_code, surrogate.asset_currency_code) && this.order_side == surrogate.order_side && this.monetization_model == surrogate.monetization_model && Intrinsics.areEqual(this.bid_price_formatted, surrogate.bid_price_formatted) && Intrinsics.areEqual(this.ask_price_formatted, surrogate.ask_price_formatted) && Intrinsics.areEqual(this.buy_spread_ratio, surrogate.buy_spread_ratio) && Intrinsics.areEqual(this.sell_spread_ratio, surrogate.sell_spread_ratio) && Intrinsics.areEqual(this.spread_bottom_sheet_data, surrogate.spread_bottom_sheet_data);
            }

            public int hashCode() {
                int iHashCode = ((((((((((((this.asset_currency_code.hashCode() * 31) + this.order_side.hashCode()) * 31) + this.monetization_model.hashCode()) * 31) + this.bid_price_formatted.hashCode()) * 31) + this.ask_price_formatted.hashCode()) * 31) + this.buy_spread_ratio.hashCode()) * 31) + this.sell_spread_ratio.hashCode()) * 31;
                SpreadDto spreadDto = this.spread_bottom_sheet_data;
                return iHashCode + (spreadDto == null ? 0 : spreadDto.hashCode());
            }

            public String toString() {
                return "Surrogate(asset_currency_code=" + this.asset_currency_code + ", order_side=" + this.order_side + ", monetization_model=" + this.monetization_model + ", bid_price_formatted=" + this.bid_price_formatted + ", ask_price_formatted=" + this.ask_price_formatted + ", buy_spread_ratio=" + this.buy_spread_ratio + ", sell_spread_ratio=" + this.sell_spread_ratio + ", spread_bottom_sheet_data=" + this.spread_bottom_sheet_data + ")";
            }

            /* compiled from: BottomSheetTypeDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return BottomSheetTypeDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, SideDto sideDto, MonetizationModelDto monetizationModelDto, String str2, String str3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, SpreadDto spreadDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.asset_currency_code = "";
                } else {
                    this.asset_currency_code = str;
                }
                if ((i & 2) == 0) {
                    this.order_side = SideDto.INSTANCE.getZeroValue();
                } else {
                    this.order_side = sideDto;
                }
                if ((i & 4) == 0) {
                    this.monetization_model = MonetizationModelDto.INSTANCE.getZeroValue();
                } else {
                    this.monetization_model = monetizationModelDto;
                }
                if ((i & 8) == 0) {
                    this.bid_price_formatted = "";
                } else {
                    this.bid_price_formatted = str2;
                }
                if ((i & 16) == 0) {
                    this.ask_price_formatted = "";
                } else {
                    this.ask_price_formatted = str3;
                }
                if ((i & 32) == 0) {
                    this.buy_spread_ratio = new IdlDecimal("");
                } else {
                    this.buy_spread_ratio = idlDecimal;
                }
                if ((i & 64) == 0) {
                    this.sell_spread_ratio = new IdlDecimal("");
                } else {
                    this.sell_spread_ratio = idlDecimal2;
                }
                if ((i & 128) == 0) {
                    this.spread_bottom_sheet_data = null;
                } else {
                    this.spread_bottom_sheet_data = spreadDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.asset_currency_code, "")) {
                    output.encodeStringElement(serialDesc, 0, self.asset_currency_code);
                }
                if (self.order_side != SideDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, SideDto.Serializer.INSTANCE, self.order_side);
                }
                if (self.monetization_model != MonetizationModelDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 2, MonetizationModelDto.Serializer.INSTANCE, self.monetization_model);
                }
                if (!Intrinsics.areEqual(self.bid_price_formatted, "")) {
                    output.encodeStringElement(serialDesc, 3, self.bid_price_formatted);
                }
                if (!Intrinsics.areEqual(self.ask_price_formatted, "")) {
                    output.encodeStringElement(serialDesc, 4, self.ask_price_formatted);
                }
                if (!Intrinsics.areEqual(self.buy_spread_ratio, new IdlDecimal(""))) {
                    output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.buy_spread_ratio);
                }
                if (!Intrinsics.areEqual(self.sell_spread_ratio, new IdlDecimal(""))) {
                    output.encodeSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, self.sell_spread_ratio);
                }
                SpreadDto spreadDto = self.spread_bottom_sheet_data;
                if (spreadDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 7, SpreadDto.Serializer.INSTANCE, spreadDto);
                }
            }

            public Surrogate(String asset_currency_code, SideDto order_side, MonetizationModelDto monetization_model, String bid_price_formatted, String ask_price_formatted, IdlDecimal buy_spread_ratio, IdlDecimal sell_spread_ratio, SpreadDto spreadDto) {
                Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
                Intrinsics.checkNotNullParameter(order_side, "order_side");
                Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
                Intrinsics.checkNotNullParameter(bid_price_formatted, "bid_price_formatted");
                Intrinsics.checkNotNullParameter(ask_price_formatted, "ask_price_formatted");
                Intrinsics.checkNotNullParameter(buy_spread_ratio, "buy_spread_ratio");
                Intrinsics.checkNotNullParameter(sell_spread_ratio, "sell_spread_ratio");
                this.asset_currency_code = asset_currency_code;
                this.order_side = order_side;
                this.monetization_model = monetization_model;
                this.bid_price_formatted = bid_price_formatted;
                this.ask_price_formatted = ask_price_formatted;
                this.buy_spread_ratio = buy_spread_ratio;
                this.sell_spread_ratio = sell_spread_ratio;
                this.spread_bottom_sheet_data = spreadDto;
            }

            public /* synthetic */ Surrogate(String str, SideDto sideDto, MonetizationModelDto monetizationModelDto, String str2, String str3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, SpreadDto spreadDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 4) != 0 ? MonetizationModelDto.INSTANCE.getZeroValue() : monetizationModelDto, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal, (i & 64) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 128) != 0 ? null : spreadDto);
            }

            public final String getAsset_currency_code() {
                return this.asset_currency_code;
            }

            public final SideDto getOrder_side() {
                return this.order_side;
            }

            public final MonetizationModelDto getMonetization_model() {
                return this.monetization_model;
            }

            public final String getBid_price_formatted() {
                return this.bid_price_formatted;
            }

            public final String getAsk_price_formatted() {
                return this.ask_price_formatted;
            }

            public final IdlDecimal getBuy_spread_ratio() {
                return this.buy_spread_ratio;
            }

            public final IdlDecimal getSell_spread_ratio() {
                return this.sell_spread_ratio;
            }

            public final SpreadDto getSpread_bottom_sheet_data() {
                return this.spread_bottom_sheet_data;
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$LimitOrderDefinition;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<LimitOrderDefinitionDto, BottomSheetType.LimitOrderDefinition> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<LimitOrderDefinitionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<LimitOrderDefinitionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<LimitOrderDefinitionDto> getBinaryBase64Serializer() {
                return (KSerializer) LimitOrderDefinitionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<BottomSheetType.LimitOrderDefinition> getProtoAdapter() {
                return BottomSheetType.LimitOrderDefinition.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public LimitOrderDefinitionDto getZeroValue() {
                return LimitOrderDefinitionDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public LimitOrderDefinitionDto fromProto(BottomSheetType.LimitOrderDefinition proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String asset_currency_code = proto.getAsset_currency_code();
                SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getOrder_side());
                MonetizationModelDto monetizationModelDtoFromProto = MonetizationModelDto.INSTANCE.fromProto(proto.getMonetization_model());
                String bid_price_formatted = proto.getBid_price_formatted();
                String ask_price_formatted = proto.getAsk_price_formatted();
                IdlDecimal idlDecimal = new IdlDecimal(proto.getBuy_spread_ratio());
                IdlDecimal idlDecimal2 = new IdlDecimal(proto.getSell_spread_ratio());
                BottomSheetType.Spread spread_bottom_sheet_data = proto.getSpread_bottom_sheet_data();
                return new LimitOrderDefinitionDto(new Surrogate(asset_currency_code, sideDtoFromProto, monetizationModelDtoFromProto, bid_price_formatted, ask_price_formatted, idlDecimal, idlDecimal2, spread_bottom_sheet_data != null ? SpreadDto.INSTANCE.fromProto(spread_bottom_sheet_data) : null), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.BottomSheetTypeDto$LimitOrderDefinitionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BottomSheetTypeDto.LimitOrderDefinitionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new LimitOrderDefinitionDto(null, null, null, null, null, null, null, null, 255, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<LimitOrderDefinitionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.BottomSheetType.LimitOrderDefinition", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, LimitOrderDefinitionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public LimitOrderDefinitionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new LimitOrderDefinitionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: BottomSheetTypeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$LimitOrderDefinitionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.BottomSheetTypeDto$LimitOrderDefinitionDto";
            }
        }
    }

    /* compiled from: BottomSheetTypeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BottomSheetTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.BottomSheetType", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BottomSheetTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BottomSheetTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BottomSheetTypeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BottomSheetTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "contracts.crypto.trade.proto.v1.BottomSheetTypeDto";
        }
    }
}

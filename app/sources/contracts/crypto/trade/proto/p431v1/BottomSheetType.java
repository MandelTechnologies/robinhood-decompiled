package contracts.crypto.trade.proto.p431v1;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import contracts.crypto.trade.proto.p431v1.BottomSheetType;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.nummus.MonetizationModel;
import rosetta.nummus.order.InputMode;
import rosetta.nummus.order.Side;
import rosetta.nummus.order.Type;

/* compiled from: BottomSheetType.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000656789:B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010+\u001a\u00020\u0002H\u0017J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000203H\u0016J|\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006;"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetType;", "Lcom/squareup/wire/Message;", "", "crypto_power", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$CryptoPower;", "market_price", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$MarketPrice;", "spread", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$Spread;", "tax_lot_transferred_lot", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$TaxLotTransferredLot;", "limit_order_definition", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$LimitOrderDefinition;", "tokenization_trade_power", "Lcontracts/crypto/trade/proto/v1/TokenizationTradePower;", "tokenization_estimated_price", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPrice;", "tokenization_fx_fee", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFee;", "tokenization_estimated_total_cost", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetType$CryptoPower;Lcontracts/crypto/trade/proto/v1/BottomSheetType$MarketPrice;Lcontracts/crypto/trade/proto/v1/BottomSheetType$Spread;Lcontracts/crypto/trade/proto/v1/BottomSheetType$TaxLotTransferredLot;Lcontracts/crypto/trade/proto/v1/BottomSheetType$LimitOrderDefinition;Lcontracts/crypto/trade/proto/v1/TokenizationTradePower;Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPrice;Lcontracts/crypto/trade/proto/v1/TokenizationFxFee;Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost;Lokio/ByteString;)V", "getCrypto_power", "()Lcontracts/crypto/trade/proto/v1/BottomSheetType$CryptoPower;", "getMarket_price", "()Lcontracts/crypto/trade/proto/v1/BottomSheetType$MarketPrice;", "getSpread", "()Lcontracts/crypto/trade/proto/v1/BottomSheetType$Spread;", "getTax_lot_transferred_lot", "()Lcontracts/crypto/trade/proto/v1/BottomSheetType$TaxLotTransferredLot;", "getLimit_order_definition", "()Lcontracts/crypto/trade/proto/v1/BottomSheetType$LimitOrderDefinition;", "getTokenization_trade_power", "()Lcontracts/crypto/trade/proto/v1/TokenizationTradePower;", "getTokenization_estimated_price", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPrice;", "getTokenization_fx_fee", "()Lcontracts/crypto/trade/proto/v1/TokenizationFxFee;", "getTokenization_estimated_total_cost", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "CryptoPower", "MarketPrice", "Spread", "TaxLotTransferredLot", "LimitOrderDefinition", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class BottomSheetType extends Message {

    @JvmField
    public static final ProtoAdapter<BottomSheetType> ADAPTER;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.BottomSheetType$CryptoPower#ADAPTER", jsonName = "cryptoPower", oneofName = "type", schemaIndex = 0, tag = 1)
    private final CryptoPower crypto_power;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.BottomSheetType$LimitOrderDefinition#ADAPTER", jsonName = "limitOrderDefinition", oneofName = "type", schemaIndex = 4, tag = 5)
    private final LimitOrderDefinition limit_order_definition;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.BottomSheetType$MarketPrice#ADAPTER", jsonName = "marketPrice", oneofName = "type", schemaIndex = 1, tag = 2)
    private final MarketPrice market_price;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.BottomSheetType$Spread#ADAPTER", oneofName = "type", schemaIndex = 2, tag = 3)
    private final Spread spread;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.BottomSheetType$TaxLotTransferredLot#ADAPTER", jsonName = "taxLotTransferredLot", oneofName = "type", schemaIndex = 3, tag = 4)
    private final TaxLotTransferredLot tax_lot_transferred_lot;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.TokenizationEstimatedPrice#ADAPTER", jsonName = "tokenizationEstimatedPrice", oneofName = "type", schemaIndex = 6, tag = 7)
    private final TokenizationEstimatedPrice tokenization_estimated_price;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.TokenizationEstimatedTotalCost#ADAPTER", jsonName = "tokenizationEstimatedTotalCost", oneofName = "type", schemaIndex = 8, tag = 9)
    private final TokenizationEstimatedTotalCost tokenization_estimated_total_cost;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.TokenizationFxFee#ADAPTER", jsonName = "tokenizationFxFee", oneofName = "type", schemaIndex = 7, tag = 8)
    private final TokenizationFxFee tokenization_fx_fee;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.TokenizationTradePower#ADAPTER", jsonName = "tokenizationTradePower", oneofName = "type", schemaIndex = 5, tag = 6)
    private final TokenizationTradePower tokenization_trade_power;

    public BottomSheetType() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27643newBuilder();
    }

    public final CryptoPower getCrypto_power() {
        return this.crypto_power;
    }

    public final MarketPrice getMarket_price() {
        return this.market_price;
    }

    public final Spread getSpread() {
        return this.spread;
    }

    public final TaxLotTransferredLot getTax_lot_transferred_lot() {
        return this.tax_lot_transferred_lot;
    }

    public final LimitOrderDefinition getLimit_order_definition() {
        return this.limit_order_definition;
    }

    public final TokenizationTradePower getTokenization_trade_power() {
        return this.tokenization_trade_power;
    }

    public final TokenizationEstimatedPrice getTokenization_estimated_price() {
        return this.tokenization_estimated_price;
    }

    public final TokenizationFxFee getTokenization_fx_fee() {
        return this.tokenization_fx_fee;
    }

    public final TokenizationEstimatedTotalCost getTokenization_estimated_total_cost() {
        return this.tokenization_estimated_total_cost;
    }

    public /* synthetic */ BottomSheetType(CryptoPower cryptoPower, MarketPrice marketPrice, Spread spread, TaxLotTransferredLot taxLotTransferredLot, LimitOrderDefinition limitOrderDefinition, TokenizationTradePower tokenizationTradePower, TokenizationEstimatedPrice tokenizationEstimatedPrice, TokenizationFxFee tokenizationFxFee, TokenizationEstimatedTotalCost tokenizationEstimatedTotalCost, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoPower, (i & 2) != 0 ? null : marketPrice, (i & 4) != 0 ? null : spread, (i & 8) != 0 ? null : taxLotTransferredLot, (i & 16) != 0 ? null : limitOrderDefinition, (i & 32) != 0 ? null : tokenizationTradePower, (i & 64) != 0 ? null : tokenizationEstimatedPrice, (i & 128) != 0 ? null : tokenizationFxFee, (i & 256) != 0 ? null : tokenizationEstimatedTotalCost, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetType(CryptoPower cryptoPower, MarketPrice marketPrice, Spread spread, TaxLotTransferredLot taxLotTransferredLot, LimitOrderDefinition limitOrderDefinition, TokenizationTradePower tokenizationTradePower, TokenizationEstimatedPrice tokenizationEstimatedPrice, TokenizationFxFee tokenizationFxFee, TokenizationEstimatedTotalCost tokenizationEstimatedTotalCost, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.crypto_power = cryptoPower;
        this.market_price = marketPrice;
        this.spread = spread;
        this.tax_lot_transferred_lot = taxLotTransferredLot;
        this.limit_order_definition = limitOrderDefinition;
        this.tokenization_trade_power = tokenizationTradePower;
        this.tokenization_estimated_price = tokenizationEstimatedPrice;
        this.tokenization_fx_fee = tokenizationFxFee;
        this.tokenization_estimated_total_cost = tokenizationEstimatedTotalCost;
        if (Internal.countNonNull(cryptoPower, marketPrice, spread, taxLotTransferredLot, limitOrderDefinition, tokenizationTradePower, tokenizationEstimatedPrice, tokenizationFxFee, tokenizationEstimatedTotalCost) > 1) {
            throw new IllegalArgumentException("At most one of crypto_power, market_price, spread, tax_lot_transferred_lot, limit_order_definition, tokenization_trade_power, tokenization_estimated_price, tokenization_fx_fee, tokenization_estimated_total_cost may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27643newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BottomSheetType)) {
            return false;
        }
        BottomSheetType bottomSheetType = (BottomSheetType) other;
        return Intrinsics.areEqual(unknownFields(), bottomSheetType.unknownFields()) && Intrinsics.areEqual(this.crypto_power, bottomSheetType.crypto_power) && Intrinsics.areEqual(this.market_price, bottomSheetType.market_price) && Intrinsics.areEqual(this.spread, bottomSheetType.spread) && Intrinsics.areEqual(this.tax_lot_transferred_lot, bottomSheetType.tax_lot_transferred_lot) && Intrinsics.areEqual(this.limit_order_definition, bottomSheetType.limit_order_definition) && Intrinsics.areEqual(this.tokenization_trade_power, bottomSheetType.tokenization_trade_power) && Intrinsics.areEqual(this.tokenization_estimated_price, bottomSheetType.tokenization_estimated_price) && Intrinsics.areEqual(this.tokenization_fx_fee, bottomSheetType.tokenization_fx_fee) && Intrinsics.areEqual(this.tokenization_estimated_total_cost, bottomSheetType.tokenization_estimated_total_cost);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        CryptoPower cryptoPower = this.crypto_power;
        int iHashCode2 = (iHashCode + (cryptoPower != null ? cryptoPower.hashCode() : 0)) * 37;
        MarketPrice marketPrice = this.market_price;
        int iHashCode3 = (iHashCode2 + (marketPrice != null ? marketPrice.hashCode() : 0)) * 37;
        Spread spread = this.spread;
        int iHashCode4 = (iHashCode3 + (spread != null ? spread.hashCode() : 0)) * 37;
        TaxLotTransferredLot taxLotTransferredLot = this.tax_lot_transferred_lot;
        int iHashCode5 = (iHashCode4 + (taxLotTransferredLot != null ? taxLotTransferredLot.hashCode() : 0)) * 37;
        LimitOrderDefinition limitOrderDefinition = this.limit_order_definition;
        int iHashCode6 = (iHashCode5 + (limitOrderDefinition != null ? limitOrderDefinition.hashCode() : 0)) * 37;
        TokenizationTradePower tokenizationTradePower = this.tokenization_trade_power;
        int iHashCode7 = (iHashCode6 + (tokenizationTradePower != null ? tokenizationTradePower.hashCode() : 0)) * 37;
        TokenizationEstimatedPrice tokenizationEstimatedPrice = this.tokenization_estimated_price;
        int iHashCode8 = (iHashCode7 + (tokenizationEstimatedPrice != null ? tokenizationEstimatedPrice.hashCode() : 0)) * 37;
        TokenizationFxFee tokenizationFxFee = this.tokenization_fx_fee;
        int iHashCode9 = (iHashCode8 + (tokenizationFxFee != null ? tokenizationFxFee.hashCode() : 0)) * 37;
        TokenizationEstimatedTotalCost tokenizationEstimatedTotalCost = this.tokenization_estimated_total_cost;
        int iHashCode10 = iHashCode9 + (tokenizationEstimatedTotalCost != null ? tokenizationEstimatedTotalCost.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        CryptoPower cryptoPower = this.crypto_power;
        if (cryptoPower != null) {
            arrayList.add("crypto_power=" + cryptoPower);
        }
        MarketPrice marketPrice = this.market_price;
        if (marketPrice != null) {
            arrayList.add("market_price=" + marketPrice);
        }
        Spread spread = this.spread;
        if (spread != null) {
            arrayList.add("spread=" + spread);
        }
        TaxLotTransferredLot taxLotTransferredLot = this.tax_lot_transferred_lot;
        if (taxLotTransferredLot != null) {
            arrayList.add("tax_lot_transferred_lot=" + taxLotTransferredLot);
        }
        LimitOrderDefinition limitOrderDefinition = this.limit_order_definition;
        if (limitOrderDefinition != null) {
            arrayList.add("limit_order_definition=" + limitOrderDefinition);
        }
        TokenizationTradePower tokenizationTradePower = this.tokenization_trade_power;
        if (tokenizationTradePower != null) {
            arrayList.add("tokenization_trade_power=" + tokenizationTradePower);
        }
        TokenizationEstimatedPrice tokenizationEstimatedPrice = this.tokenization_estimated_price;
        if (tokenizationEstimatedPrice != null) {
            arrayList.add("tokenization_estimated_price=" + tokenizationEstimatedPrice);
        }
        TokenizationFxFee tokenizationFxFee = this.tokenization_fx_fee;
        if (tokenizationFxFee != null) {
            arrayList.add("tokenization_fx_fee=" + tokenizationFxFee);
        }
        TokenizationEstimatedTotalCost tokenizationEstimatedTotalCost = this.tokenization_estimated_total_cost;
        if (tokenizationEstimatedTotalCost != null) {
            arrayList.add("tokenization_estimated_total_cost=" + tokenizationEstimatedTotalCost);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BottomSheetType{", "}", 0, null, null, 56, null);
    }

    public final BottomSheetType copy(CryptoPower crypto_power, MarketPrice market_price, Spread spread, TaxLotTransferredLot tax_lot_transferred_lot, LimitOrderDefinition limit_order_definition, TokenizationTradePower tokenization_trade_power, TokenizationEstimatedPrice tokenization_estimated_price, TokenizationFxFee tokenization_fx_fee, TokenizationEstimatedTotalCost tokenization_estimated_total_cost, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BottomSheetType(crypto_power, market_price, spread, tax_lot_transferred_lot, limit_order_definition, tokenization_trade_power, tokenization_estimated_price, tokenization_fx_fee, tokenization_estimated_total_cost, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BottomSheetType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BottomSheetType>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.BottomSheetType$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BottomSheetType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + BottomSheetType.CryptoPower.ADAPTER.encodedSizeWithTag(1, value.getCrypto_power()) + BottomSheetType.MarketPrice.ADAPTER.encodedSizeWithTag(2, value.getMarket_price()) + BottomSheetType.Spread.ADAPTER.encodedSizeWithTag(3, value.getSpread()) + BottomSheetType.TaxLotTransferredLot.ADAPTER.encodedSizeWithTag(4, value.getTax_lot_transferred_lot()) + BottomSheetType.LimitOrderDefinition.ADAPTER.encodedSizeWithTag(5, value.getLimit_order_definition()) + TokenizationTradePower.ADAPTER.encodedSizeWithTag(6, value.getTokenization_trade_power()) + TokenizationEstimatedPrice.ADAPTER.encodedSizeWithTag(7, value.getTokenization_estimated_price()) + TokenizationFxFee.ADAPTER.encodedSizeWithTag(8, value.getTokenization_fx_fee()) + TokenizationEstimatedTotalCost.ADAPTER.encodedSizeWithTag(9, value.getTokenization_estimated_total_cost());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BottomSheetType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                BottomSheetType.CryptoPower.ADAPTER.encodeWithTag(writer, 1, (int) value.getCrypto_power());
                BottomSheetType.MarketPrice.ADAPTER.encodeWithTag(writer, 2, (int) value.getMarket_price());
                BottomSheetType.Spread.ADAPTER.encodeWithTag(writer, 3, (int) value.getSpread());
                BottomSheetType.TaxLotTransferredLot.ADAPTER.encodeWithTag(writer, 4, (int) value.getTax_lot_transferred_lot());
                BottomSheetType.LimitOrderDefinition.ADAPTER.encodeWithTag(writer, 5, (int) value.getLimit_order_definition());
                TokenizationTradePower.ADAPTER.encodeWithTag(writer, 6, (int) value.getTokenization_trade_power());
                TokenizationEstimatedPrice.ADAPTER.encodeWithTag(writer, 7, (int) value.getTokenization_estimated_price());
                TokenizationFxFee.ADAPTER.encodeWithTag(writer, 8, (int) value.getTokenization_fx_fee());
                TokenizationEstimatedTotalCost.ADAPTER.encodeWithTag(writer, 9, (int) value.getTokenization_estimated_total_cost());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BottomSheetType value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TokenizationEstimatedTotalCost.ADAPTER.encodeWithTag(writer, 9, (int) value.getTokenization_estimated_total_cost());
                TokenizationFxFee.ADAPTER.encodeWithTag(writer, 8, (int) value.getTokenization_fx_fee());
                TokenizationEstimatedPrice.ADAPTER.encodeWithTag(writer, 7, (int) value.getTokenization_estimated_price());
                TokenizationTradePower.ADAPTER.encodeWithTag(writer, 6, (int) value.getTokenization_trade_power());
                BottomSheetType.LimitOrderDefinition.ADAPTER.encodeWithTag(writer, 5, (int) value.getLimit_order_definition());
                BottomSheetType.TaxLotTransferredLot.ADAPTER.encodeWithTag(writer, 4, (int) value.getTax_lot_transferred_lot());
                BottomSheetType.Spread.ADAPTER.encodeWithTag(writer, 3, (int) value.getSpread());
                BottomSheetType.MarketPrice.ADAPTER.encodeWithTag(writer, 2, (int) value.getMarket_price());
                BottomSheetType.CryptoPower.ADAPTER.encodeWithTag(writer, 1, (int) value.getCrypto_power());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BottomSheetType redact(BottomSheetType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BottomSheetType.CryptoPower crypto_power = value.getCrypto_power();
                BottomSheetType.CryptoPower cryptoPowerRedact = crypto_power != null ? BottomSheetType.CryptoPower.ADAPTER.redact(crypto_power) : null;
                BottomSheetType.MarketPrice market_price = value.getMarket_price();
                BottomSheetType.MarketPrice marketPriceRedact = market_price != null ? BottomSheetType.MarketPrice.ADAPTER.redact(market_price) : null;
                BottomSheetType.Spread spread = value.getSpread();
                BottomSheetType.Spread spreadRedact = spread != null ? BottomSheetType.Spread.ADAPTER.redact(spread) : null;
                BottomSheetType.TaxLotTransferredLot tax_lot_transferred_lot = value.getTax_lot_transferred_lot();
                BottomSheetType.TaxLotTransferredLot taxLotTransferredLotRedact = tax_lot_transferred_lot != null ? BottomSheetType.TaxLotTransferredLot.ADAPTER.redact(tax_lot_transferred_lot) : null;
                BottomSheetType.LimitOrderDefinition limit_order_definition = value.getLimit_order_definition();
                BottomSheetType.LimitOrderDefinition limitOrderDefinitionRedact = limit_order_definition != null ? BottomSheetType.LimitOrderDefinition.ADAPTER.redact(limit_order_definition) : null;
                TokenizationTradePower tokenization_trade_power = value.getTokenization_trade_power();
                TokenizationTradePower tokenizationTradePowerRedact = tokenization_trade_power != null ? TokenizationTradePower.ADAPTER.redact(tokenization_trade_power) : null;
                TokenizationEstimatedPrice tokenization_estimated_price = value.getTokenization_estimated_price();
                TokenizationEstimatedPrice tokenizationEstimatedPriceRedact = tokenization_estimated_price != null ? TokenizationEstimatedPrice.ADAPTER.redact(tokenization_estimated_price) : null;
                TokenizationFxFee tokenization_fx_fee = value.getTokenization_fx_fee();
                TokenizationFxFee tokenizationFxFeeRedact = tokenization_fx_fee != null ? TokenizationFxFee.ADAPTER.redact(tokenization_fx_fee) : null;
                TokenizationEstimatedTotalCost tokenization_estimated_total_cost = value.getTokenization_estimated_total_cost();
                return value.copy(cryptoPowerRedact, marketPriceRedact, spreadRedact, taxLotTransferredLotRedact, limitOrderDefinitionRedact, tokenizationTradePowerRedact, tokenizationEstimatedPriceRedact, tokenizationFxFeeRedact, tokenization_estimated_total_cost != null ? TokenizationEstimatedTotalCost.ADAPTER.redact(tokenization_estimated_total_cost) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BottomSheetType decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                BottomSheetType.CryptoPower cryptoPowerDecode = null;
                BottomSheetType.MarketPrice marketPriceDecode = null;
                BottomSheetType.Spread spreadDecode = null;
                BottomSheetType.TaxLotTransferredLot taxLotTransferredLotDecode = null;
                BottomSheetType.LimitOrderDefinition limitOrderDefinitionDecode = null;
                TokenizationTradePower tokenizationTradePowerDecode = null;
                TokenizationEstimatedPrice tokenizationEstimatedPriceDecode = null;
                TokenizationFxFee tokenizationFxFeeDecode = null;
                TokenizationEstimatedTotalCost tokenizationEstimatedTotalCostDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                cryptoPowerDecode = BottomSheetType.CryptoPower.ADAPTER.decode(reader);
                                break;
                            case 2:
                                marketPriceDecode = BottomSheetType.MarketPrice.ADAPTER.decode(reader);
                                break;
                            case 3:
                                spreadDecode = BottomSheetType.Spread.ADAPTER.decode(reader);
                                break;
                            case 4:
                                taxLotTransferredLotDecode = BottomSheetType.TaxLotTransferredLot.ADAPTER.decode(reader);
                                break;
                            case 5:
                                limitOrderDefinitionDecode = BottomSheetType.LimitOrderDefinition.ADAPTER.decode(reader);
                                break;
                            case 6:
                                tokenizationTradePowerDecode = TokenizationTradePower.ADAPTER.decode(reader);
                                break;
                            case 7:
                                tokenizationEstimatedPriceDecode = TokenizationEstimatedPrice.ADAPTER.decode(reader);
                                break;
                            case 8:
                                tokenizationFxFeeDecode = TokenizationFxFee.ADAPTER.decode(reader);
                                break;
                            case 9:
                                tokenizationEstimatedTotalCostDecode = TokenizationEstimatedTotalCost.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new BottomSheetType(cryptoPowerDecode, marketPriceDecode, spreadDecode, taxLotTransferredLotDecode, limitOrderDefinitionDecode, tokenizationTradePowerDecode, tokenizationEstimatedPriceDecode, tokenizationFxFeeDecode, tokenizationEstimatedTotalCostDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }

    /* compiled from: BottomSheetType.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetType$CryptoPower;", "Lcom/squareup/wire/Message;", "", "input_mode", "Lrosetta/nummus/order/InputMode;", "order_side", "Lrosetta/nummus/order/Side;", "asset_currency_code", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/nummus/order/InputMode;Lrosetta/nummus/order/Side;Ljava/lang/String;Lokio/ByteString;)V", "getInput_mode", "()Lrosetta/nummus/order/InputMode;", "getOrder_side", "()Lrosetta/nummus/order/Side;", "getAsset_currency_code", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CryptoPower extends Message {

        @JvmField
        public static final ProtoAdapter<CryptoPower> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String asset_currency_code;

        @WireField(adapter = "rosetta.nummus.order.InputMode#ADAPTER", jsonName = "inputMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final InputMode input_mode;

        @WireField(adapter = "rosetta.nummus.order.Side#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Side order_side;

        public CryptoPower() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27644newBuilder();
        }

        public final InputMode getInput_mode() {
            return this.input_mode;
        }

        public /* synthetic */ CryptoPower(InputMode inputMode, Side side, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? InputMode.INPUT_MODE__UNSPECIFIED : inputMode, (i & 2) != 0 ? Side.SIDE__UNSPECIFIED : side, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public final Side getOrder_side() {
            return this.order_side;
        }

        public final String getAsset_currency_code() {
            return this.asset_currency_code;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoPower(InputMode input_mode, Side order_side, String asset_currency_code, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(input_mode, "input_mode");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.input_mode = input_mode;
            this.order_side = order_side;
            this.asset_currency_code = asset_currency_code;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27644newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CryptoPower)) {
                return false;
            }
            CryptoPower cryptoPower = (CryptoPower) other;
            return Intrinsics.areEqual(unknownFields(), cryptoPower.unknownFields()) && this.input_mode == cryptoPower.input_mode && this.order_side == cryptoPower.order_side && Intrinsics.areEqual(this.asset_currency_code, cryptoPower.asset_currency_code);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + this.input_mode.hashCode()) * 37) + this.order_side.hashCode()) * 37) + this.asset_currency_code.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("input_mode=" + this.input_mode);
            arrayList.add("order_side=" + this.order_side);
            arrayList.add("asset_currency_code=" + Internal.sanitize(this.asset_currency_code));
            return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoPower{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ CryptoPower copy$default(CryptoPower cryptoPower, InputMode inputMode, Side side, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                inputMode = cryptoPower.input_mode;
            }
            if ((i & 2) != 0) {
                side = cryptoPower.order_side;
            }
            if ((i & 4) != 0) {
                str = cryptoPower.asset_currency_code;
            }
            if ((i & 8) != 0) {
                byteString = cryptoPower.unknownFields();
            }
            return cryptoPower.copy(inputMode, side, str, byteString);
        }

        public final CryptoPower copy(InputMode input_mode, Side order_side, String asset_currency_code, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(input_mode, "input_mode");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CryptoPower(input_mode, order_side, asset_currency_code, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoPower.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CryptoPower>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.BottomSheetType$CryptoPower$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BottomSheetType.CryptoPower value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getInput_mode() != InputMode.INPUT_MODE__UNSPECIFIED) {
                        size += InputMode.ADAPTER.encodedSizeWithTag(1, value.getInput_mode());
                    }
                    if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                        size += Side.ADAPTER.encodedSizeWithTag(2, value.getOrder_side());
                    }
                    return !Intrinsics.areEqual(value.getAsset_currency_code(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAsset_currency_code()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BottomSheetType.CryptoPower value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getInput_mode() != InputMode.INPUT_MODE__UNSPECIFIED) {
                        InputMode.ADAPTER.encodeWithTag(writer, 1, (int) value.getInput_mode());
                    }
                    if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                        Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_side());
                    }
                    if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAsset_currency_code());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BottomSheetType.CryptoPower value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAsset_currency_code());
                    }
                    if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                        Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_side());
                    }
                    if (value.getInput_mode() != InputMode.INPUT_MODE__UNSPECIFIED) {
                        InputMode.ADAPTER.encodeWithTag(writer, 1, (int) value.getInput_mode());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetType.CryptoPower decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    InputMode inputModeDecode = InputMode.INPUT_MODE__UNSPECIFIED;
                    Side sideDecode = Side.SIDE__UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new BottomSheetType.CryptoPower(inputModeDecode, sideDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                inputModeDecode = InputMode.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                sideDecode = Side.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetType.CryptoPower redact(BottomSheetType.CryptoPower value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return BottomSheetType.CryptoPower.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }
            };
        }
    }

    /* compiled from: BottomSheetType.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetType$MarketPrice;", "Lcom/squareup/wire/Message;", "", "order_side", "Lrosetta/nummus/order/Side;", "asset_currency_code", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/nummus/order/Side;Ljava/lang/String;Lokio/ByteString;)V", "getOrder_side", "()Lrosetta/nummus/order/Side;", "getAsset_currency_code", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MarketPrice extends Message {

        @JvmField
        public static final ProtoAdapter<MarketPrice> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String asset_currency_code;

        @WireField(adapter = "rosetta.nummus.order.Side#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Side order_side;

        public MarketPrice() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27646newBuilder();
        }

        public final Side getOrder_side() {
            return this.order_side;
        }

        public /* synthetic */ MarketPrice(Side side, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Side.SIDE__UNSPECIFIED : side, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getAsset_currency_code() {
            return this.asset_currency_code;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarketPrice(Side order_side, String asset_currency_code, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.order_side = order_side;
            this.asset_currency_code = asset_currency_code;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27646newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof MarketPrice)) {
                return false;
            }
            MarketPrice marketPrice = (MarketPrice) other;
            return Intrinsics.areEqual(unknownFields(), marketPrice.unknownFields()) && this.order_side == marketPrice.order_side && Intrinsics.areEqual(this.asset_currency_code, marketPrice.asset_currency_code);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.order_side.hashCode()) * 37) + this.asset_currency_code.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("order_side=" + this.order_side);
            arrayList.add("asset_currency_code=" + Internal.sanitize(this.asset_currency_code));
            return CollectionsKt.joinToString$default(arrayList, ", ", "MarketPrice{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ MarketPrice copy$default(MarketPrice marketPrice, Side side, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                side = marketPrice.order_side;
            }
            if ((i & 2) != 0) {
                str = marketPrice.asset_currency_code;
            }
            if ((i & 4) != 0) {
                byteString = marketPrice.unknownFields();
            }
            return marketPrice.copy(side, str, byteString);
        }

        public final MarketPrice copy(Side order_side, String asset_currency_code, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new MarketPrice(order_side, asset_currency_code, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarketPrice.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<MarketPrice>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.BottomSheetType$MarketPrice$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BottomSheetType.MarketPrice value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                        size += Side.ADAPTER.encodedSizeWithTag(1, value.getOrder_side());
                    }
                    return !Intrinsics.areEqual(value.getAsset_currency_code(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAsset_currency_code()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BottomSheetType.MarketPrice value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                        Side.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_side());
                    }
                    if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsset_currency_code());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BottomSheetType.MarketPrice value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsset_currency_code());
                    }
                    if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                        Side.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_side());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetType.MarketPrice decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Side sideDecode = Side.SIDE__UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new BottomSheetType.MarketPrice(sideDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                sideDecode = Side.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetType.MarketPrice redact(BottomSheetType.MarketPrice value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return BottomSheetType.MarketPrice.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }
    }

    /* compiled from: BottomSheetType.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016Jj\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetType$Spread;", "Lcom/squareup/wire/Message;", "", "asset_currency_code", "", "order_side", "Lrosetta/nummus/order/Side;", "order_type", "Lrosetta/nummus/order/Type;", "rebate_ratio", "buy_spread_ratio", "sell_spread_ratio", "bid_price_formatted", "mid_price_formatted", "ask_price_formatted", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrosetta/nummus/order/Side;Lrosetta/nummus/order/Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAsset_currency_code", "()Ljava/lang/String;", "getOrder_side", "()Lrosetta/nummus/order/Side;", "getOrder_type", "()Lrosetta/nummus/order/Type;", "getRebate_ratio", "getBuy_spread_ratio", "getSell_spread_ratio", "getBid_price_formatted", "getMid_price_formatted", "getAsk_price_formatted", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Spread extends Message {

        @JvmField
        public static final ProtoAdapter<Spread> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askPriceFormatted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
        private final String ask_price_formatted;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String asset_currency_code;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidPriceFormatted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
        private final String bid_price_formatted;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buySpreadRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final String buy_spread_ratio;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "midPriceFormatted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
        private final String mid_price_formatted;

        @WireField(adapter = "rosetta.nummus.order.Side#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Side order_side;

        @WireField(adapter = "rosetta.nummus.order.Type#ADAPTER", jsonName = "orderType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final Type order_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rebateRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String rebate_ratio;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sellSpreadRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
        private final String sell_spread_ratio;

        public Spread() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        public /* synthetic */ Spread(String str, Side side, Type type2, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Side.SIDE__UNSPECIFIED : side, (i & 4) != 0 ? Type.TYPE__UNSPECIFIED : type2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27647newBuilder();
        }

        public final String getAsset_currency_code() {
            return this.asset_currency_code;
        }

        public final Side getOrder_side() {
            return this.order_side;
        }

        public final Type getOrder_type() {
            return this.order_type;
        }

        public final String getRebate_ratio() {
            return this.rebate_ratio;
        }

        public final String getBuy_spread_ratio() {
            return this.buy_spread_ratio;
        }

        public final String getSell_spread_ratio() {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Spread(String asset_currency_code, Side order_side, Type order_type, String rebate_ratio, String buy_spread_ratio, String sell_spread_ratio, String bid_price_formatted, String mid_price_formatted, String ask_price_formatted, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(rebate_ratio, "rebate_ratio");
            Intrinsics.checkNotNullParameter(buy_spread_ratio, "buy_spread_ratio");
            Intrinsics.checkNotNullParameter(sell_spread_ratio, "sell_spread_ratio");
            Intrinsics.checkNotNullParameter(bid_price_formatted, "bid_price_formatted");
            Intrinsics.checkNotNullParameter(mid_price_formatted, "mid_price_formatted");
            Intrinsics.checkNotNullParameter(ask_price_formatted, "ask_price_formatted");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
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

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27647newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Spread)) {
                return false;
            }
            Spread spread = (Spread) other;
            return Intrinsics.areEqual(unknownFields(), spread.unknownFields()) && Intrinsics.areEqual(this.asset_currency_code, spread.asset_currency_code) && this.order_side == spread.order_side && this.order_type == spread.order_type && Intrinsics.areEqual(this.rebate_ratio, spread.rebate_ratio) && Intrinsics.areEqual(this.buy_spread_ratio, spread.buy_spread_ratio) && Intrinsics.areEqual(this.sell_spread_ratio, spread.sell_spread_ratio) && Intrinsics.areEqual(this.bid_price_formatted, spread.bid_price_formatted) && Intrinsics.areEqual(this.mid_price_formatted, spread.mid_price_formatted) && Intrinsics.areEqual(this.ask_price_formatted, spread.ask_price_formatted);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((((((((((((unknownFields().hashCode() * 37) + this.asset_currency_code.hashCode()) * 37) + this.order_side.hashCode()) * 37) + this.order_type.hashCode()) * 37) + this.rebate_ratio.hashCode()) * 37) + this.buy_spread_ratio.hashCode()) * 37) + this.sell_spread_ratio.hashCode()) * 37) + this.bid_price_formatted.hashCode()) * 37) + this.mid_price_formatted.hashCode()) * 37) + this.ask_price_formatted.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("asset_currency_code=" + Internal.sanitize(this.asset_currency_code));
            arrayList.add("order_side=" + this.order_side);
            arrayList.add("order_type=" + this.order_type);
            arrayList.add("rebate_ratio=" + Internal.sanitize(this.rebate_ratio));
            arrayList.add("buy_spread_ratio=" + Internal.sanitize(this.buy_spread_ratio));
            arrayList.add("sell_spread_ratio=" + Internal.sanitize(this.sell_spread_ratio));
            arrayList.add("bid_price_formatted=" + Internal.sanitize(this.bid_price_formatted));
            arrayList.add("mid_price_formatted=" + Internal.sanitize(this.mid_price_formatted));
            arrayList.add("ask_price_formatted=" + Internal.sanitize(this.ask_price_formatted));
            return CollectionsKt.joinToString$default(arrayList, ", ", "Spread{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Spread copy$default(Spread spread, String str, Side side, Type type2, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = spread.asset_currency_code;
            }
            if ((i & 2) != 0) {
                side = spread.order_side;
            }
            if ((i & 4) != 0) {
                type2 = spread.order_type;
            }
            if ((i & 8) != 0) {
                str2 = spread.rebate_ratio;
            }
            if ((i & 16) != 0) {
                str3 = spread.buy_spread_ratio;
            }
            if ((i & 32) != 0) {
                str4 = spread.sell_spread_ratio;
            }
            if ((i & 64) != 0) {
                str5 = spread.bid_price_formatted;
            }
            if ((i & 128) != 0) {
                str6 = spread.mid_price_formatted;
            }
            if ((i & 256) != 0) {
                str7 = spread.ask_price_formatted;
            }
            if ((i & 512) != 0) {
                byteString = spread.unknownFields();
            }
            String str8 = str7;
            ByteString byteString2 = byteString;
            String str9 = str5;
            String str10 = str6;
            String str11 = str3;
            String str12 = str4;
            return spread.copy(str, side, type2, str2, str11, str12, str9, str10, str8, byteString2);
        }

        public final Spread copy(String asset_currency_code, Side order_side, Type order_type, String rebate_ratio, String buy_spread_ratio, String sell_spread_ratio, String bid_price_formatted, String mid_price_formatted, String ask_price_formatted, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(rebate_ratio, "rebate_ratio");
            Intrinsics.checkNotNullParameter(buy_spread_ratio, "buy_spread_ratio");
            Intrinsics.checkNotNullParameter(sell_spread_ratio, "sell_spread_ratio");
            Intrinsics.checkNotNullParameter(bid_price_formatted, "bid_price_formatted");
            Intrinsics.checkNotNullParameter(mid_price_formatted, "mid_price_formatted");
            Intrinsics.checkNotNullParameter(ask_price_formatted, "ask_price_formatted");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Spread(asset_currency_code, order_side, order_type, rebate_ratio, buy_spread_ratio, sell_spread_ratio, bid_price_formatted, mid_price_formatted, ask_price_formatted, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Spread.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Spread>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.BottomSheetType$Spread$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BottomSheetType.Spread value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAsset_currency_code());
                    }
                    if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                        size += Side.ADAPTER.encodedSizeWithTag(2, value.getOrder_side());
                    }
                    if (value.getOrder_type() != Type.TYPE__UNSPECIFIED) {
                        size += Type.ADAPTER.encodedSizeWithTag(3, value.getOrder_type());
                    }
                    if (!Intrinsics.areEqual(value.getRebate_ratio(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRebate_ratio());
                    }
                    if (!Intrinsics.areEqual(value.getBuy_spread_ratio(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getBuy_spread_ratio());
                    }
                    if (!Intrinsics.areEqual(value.getSell_spread_ratio(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getSell_spread_ratio());
                    }
                    if (!Intrinsics.areEqual(value.getBid_price_formatted(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getBid_price_formatted());
                    }
                    if (!Intrinsics.areEqual(value.getMid_price_formatted(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getMid_price_formatted());
                    }
                    return !Intrinsics.areEqual(value.getAsk_price_formatted(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(9, value.getAsk_price_formatted()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BottomSheetType.Spread value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_currency_code());
                    }
                    if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                        Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_side());
                    }
                    if (value.getOrder_type() != Type.TYPE__UNSPECIFIED) {
                        Type.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_type());
                    }
                    if (!Intrinsics.areEqual(value.getRebate_ratio(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRebate_ratio());
                    }
                    if (!Intrinsics.areEqual(value.getBuy_spread_ratio(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getBuy_spread_ratio());
                    }
                    if (!Intrinsics.areEqual(value.getSell_spread_ratio(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSell_spread_ratio());
                    }
                    if (!Intrinsics.areEqual(value.getBid_price_formatted(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getBid_price_formatted());
                    }
                    if (!Intrinsics.areEqual(value.getMid_price_formatted(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getMid_price_formatted());
                    }
                    if (!Intrinsics.areEqual(value.getAsk_price_formatted(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getAsk_price_formatted());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BottomSheetType.Spread value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getAsk_price_formatted(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getAsk_price_formatted());
                    }
                    if (!Intrinsics.areEqual(value.getMid_price_formatted(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getMid_price_formatted());
                    }
                    if (!Intrinsics.areEqual(value.getBid_price_formatted(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getBid_price_formatted());
                    }
                    if (!Intrinsics.areEqual(value.getSell_spread_ratio(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSell_spread_ratio());
                    }
                    if (!Intrinsics.areEqual(value.getBuy_spread_ratio(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getBuy_spread_ratio());
                    }
                    if (!Intrinsics.areEqual(value.getRebate_ratio(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRebate_ratio());
                    }
                    if (value.getOrder_type() != Type.TYPE__UNSPECIFIED) {
                        Type.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_type());
                    }
                    if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                        Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_side());
                    }
                    if (Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_currency_code());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetType.Spread decode(ProtoReader reader) throws IOException {
                    Type type2;
                    String str;
                    String str2;
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Side side = Side.SIDE__UNSPECIFIED;
                    Type type3 = Type.TYPE__UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = strDecode;
                    String strDecode3 = strDecode2;
                    String strDecode4 = strDecode3;
                    String strDecode5 = strDecode4;
                    String strDecode6 = strDecode5;
                    String strDecode7 = strDecode6;
                    Type typeDecode = type3;
                    Side sideDecode = side;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    type2 = typeDecode;
                                    str = strDecode;
                                    try {
                                        sideDecode = Side.ADAPTER.decode(reader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        str2 = strDecode2;
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                    strDecode = str;
                                    typeDecode = type2;
                                    break;
                                case 3:
                                    try {
                                        typeDecode = Type.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        type2 = typeDecode;
                                        str = strDecode;
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 8:
                                    strDecode6 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 9:
                                    strDecode7 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    type2 = typeDecode;
                                    str = strDecode;
                                    str2 = strDecode2;
                                    strDecode2 = str2;
                                    strDecode = str;
                                    typeDecode = type2;
                                    break;
                            }
                        } else {
                            return new BottomSheetType.Spread(strDecode, sideDecode, typeDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetType.Spread redact(BottomSheetType.Spread value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return BottomSheetType.Spread.copy$default(value, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 511, null);
                }
            };
        }
    }

    /* compiled from: BottomSheetType.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetType$TaxLotTransferredLot;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TaxLotTransferredLot extends Message {

        @JvmField
        public static final ProtoAdapter<TaxLotTransferredLot> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public TaxLotTransferredLot() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27648newBuilder();
        }

        public /* synthetic */ TaxLotTransferredLot(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaxLotTransferredLot(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27648newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof TaxLotTransferredLot) && Intrinsics.areEqual(unknownFields(), ((TaxLotTransferredLot) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "TaxLotTransferredLot{}";
        }

        public final TaxLotTransferredLot copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TaxLotTransferredLot(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotTransferredLot.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TaxLotTransferredLot>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.BottomSheetType$TaxLotTransferredLot$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetType.TaxLotTransferredLot decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new BottomSheetType.TaxLotTransferredLot(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BottomSheetType.TaxLotTransferredLot value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BottomSheetType.TaxLotTransferredLot value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BottomSheetType.TaxLotTransferredLot value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetType.TaxLotTransferredLot redact(BottomSheetType.TaxLotTransferredLot value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: BottomSheetType.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016Jb\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/BottomSheetType$LimitOrderDefinition;", "Lcom/squareup/wire/Message;", "", "asset_currency_code", "", "order_side", "Lrosetta/nummus/order/Side;", "monetization_model", "Lrosetta/nummus/MonetizationModel;", "bid_price_formatted", "ask_price_formatted", "buy_spread_ratio", "sell_spread_ratio", "spread_bottom_sheet_data", "Lcontracts/crypto/trade/proto/v1/BottomSheetType$Spread;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrosetta/nummus/order/Side;Lrosetta/nummus/MonetizationModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcontracts/crypto/trade/proto/v1/BottomSheetType$Spread;Lokio/ByteString;)V", "getAsset_currency_code", "()Ljava/lang/String;", "getOrder_side", "()Lrosetta/nummus/order/Side;", "getMonetization_model", "()Lrosetta/nummus/MonetizationModel;", "getBid_price_formatted", "getAsk_price_formatted", "getBuy_spread_ratio", "getSell_spread_ratio", "getSpread_bottom_sheet_data", "()Lcontracts/crypto/trade/proto/v1/BottomSheetType$Spread;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LimitOrderDefinition extends Message {

        @JvmField
        public static final ProtoAdapter<LimitOrderDefinition> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askPriceFormatted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final String ask_price_formatted;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String asset_currency_code;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidPriceFormatted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String bid_price_formatted;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buySpreadRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
        private final String buy_spread_ratio;

        @WireField(adapter = "rosetta.nummus.MonetizationModel#ADAPTER", jsonName = "monetizationModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final MonetizationModel monetization_model;

        @WireField(adapter = "rosetta.nummus.order.Side#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Side order_side;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sellSpreadRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
        private final String sell_spread_ratio;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.BottomSheetType$Spread#ADAPTER", jsonName = "spreadBottomSheetData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
        private final Spread spread_bottom_sheet_data;

        public LimitOrderDefinition() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public /* synthetic */ LimitOrderDefinition(String str, Side side, MonetizationModel monetizationModel, String str2, String str3, String str4, String str5, Spread spread, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Side.SIDE__UNSPECIFIED : side, (i & 4) != 0 ? MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED : monetizationModel, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? null : spread, (i & 256) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27645newBuilder();
        }

        public final String getAsset_currency_code() {
            return this.asset_currency_code;
        }

        public final Side getOrder_side() {
            return this.order_side;
        }

        public final MonetizationModel getMonetization_model() {
            return this.monetization_model;
        }

        public final String getBid_price_formatted() {
            return this.bid_price_formatted;
        }

        public final String getAsk_price_formatted() {
            return this.ask_price_formatted;
        }

        public final String getBuy_spread_ratio() {
            return this.buy_spread_ratio;
        }

        public final String getSell_spread_ratio() {
            return this.sell_spread_ratio;
        }

        public final Spread getSpread_bottom_sheet_data() {
            return this.spread_bottom_sheet_data;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LimitOrderDefinition(String asset_currency_code, Side order_side, MonetizationModel monetization_model, String bid_price_formatted, String ask_price_formatted, String buy_spread_ratio, String sell_spread_ratio, Spread spread, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
            Intrinsics.checkNotNullParameter(bid_price_formatted, "bid_price_formatted");
            Intrinsics.checkNotNullParameter(ask_price_formatted, "ask_price_formatted");
            Intrinsics.checkNotNullParameter(buy_spread_ratio, "buy_spread_ratio");
            Intrinsics.checkNotNullParameter(sell_spread_ratio, "sell_spread_ratio");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.asset_currency_code = asset_currency_code;
            this.order_side = order_side;
            this.monetization_model = monetization_model;
            this.bid_price_formatted = bid_price_formatted;
            this.ask_price_formatted = ask_price_formatted;
            this.buy_spread_ratio = buy_spread_ratio;
            this.sell_spread_ratio = sell_spread_ratio;
            this.spread_bottom_sheet_data = spread;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27645newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof LimitOrderDefinition)) {
                return false;
            }
            LimitOrderDefinition limitOrderDefinition = (LimitOrderDefinition) other;
            return Intrinsics.areEqual(unknownFields(), limitOrderDefinition.unknownFields()) && Intrinsics.areEqual(this.asset_currency_code, limitOrderDefinition.asset_currency_code) && this.order_side == limitOrderDefinition.order_side && this.monetization_model == limitOrderDefinition.monetization_model && Intrinsics.areEqual(this.bid_price_formatted, limitOrderDefinition.bid_price_formatted) && Intrinsics.areEqual(this.ask_price_formatted, limitOrderDefinition.ask_price_formatted) && Intrinsics.areEqual(this.buy_spread_ratio, limitOrderDefinition.buy_spread_ratio) && Intrinsics.areEqual(this.sell_spread_ratio, limitOrderDefinition.sell_spread_ratio) && Intrinsics.areEqual(this.spread_bottom_sheet_data, limitOrderDefinition.spread_bottom_sheet_data);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.asset_currency_code.hashCode()) * 37) + this.order_side.hashCode()) * 37) + this.monetization_model.hashCode()) * 37) + this.bid_price_formatted.hashCode()) * 37) + this.ask_price_formatted.hashCode()) * 37) + this.buy_spread_ratio.hashCode()) * 37) + this.sell_spread_ratio.hashCode()) * 37;
            Spread spread = this.spread_bottom_sheet_data;
            int iHashCode2 = iHashCode + (spread != null ? spread.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("asset_currency_code=" + Internal.sanitize(this.asset_currency_code));
            arrayList.add("order_side=" + this.order_side);
            arrayList.add("monetization_model=" + this.monetization_model);
            arrayList.add("bid_price_formatted=" + Internal.sanitize(this.bid_price_formatted));
            arrayList.add("ask_price_formatted=" + Internal.sanitize(this.ask_price_formatted));
            arrayList.add("buy_spread_ratio=" + Internal.sanitize(this.buy_spread_ratio));
            arrayList.add("sell_spread_ratio=" + Internal.sanitize(this.sell_spread_ratio));
            Spread spread = this.spread_bottom_sheet_data;
            if (spread != null) {
                arrayList.add("spread_bottom_sheet_data=" + spread);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LimitOrderDefinition{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ LimitOrderDefinition copy$default(LimitOrderDefinition limitOrderDefinition, String str, Side side, MonetizationModel monetizationModel, String str2, String str3, String str4, String str5, Spread spread, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = limitOrderDefinition.asset_currency_code;
            }
            if ((i & 2) != 0) {
                side = limitOrderDefinition.order_side;
            }
            if ((i & 4) != 0) {
                monetizationModel = limitOrderDefinition.monetization_model;
            }
            if ((i & 8) != 0) {
                str2 = limitOrderDefinition.bid_price_formatted;
            }
            if ((i & 16) != 0) {
                str3 = limitOrderDefinition.ask_price_formatted;
            }
            if ((i & 32) != 0) {
                str4 = limitOrderDefinition.buy_spread_ratio;
            }
            if ((i & 64) != 0) {
                str5 = limitOrderDefinition.sell_spread_ratio;
            }
            if ((i & 128) != 0) {
                spread = limitOrderDefinition.spread_bottom_sheet_data;
            }
            if ((i & 256) != 0) {
                byteString = limitOrderDefinition.unknownFields();
            }
            Spread spread2 = spread;
            ByteString byteString2 = byteString;
            String str6 = str4;
            String str7 = str5;
            String str8 = str3;
            MonetizationModel monetizationModel2 = monetizationModel;
            return limitOrderDefinition.copy(str, side, monetizationModel2, str2, str8, str6, str7, spread2, byteString2);
        }

        public final LimitOrderDefinition copy(String asset_currency_code, Side order_side, MonetizationModel monetization_model, String bid_price_formatted, String ask_price_formatted, String buy_spread_ratio, String sell_spread_ratio, Spread spread_bottom_sheet_data, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
            Intrinsics.checkNotNullParameter(bid_price_formatted, "bid_price_formatted");
            Intrinsics.checkNotNullParameter(ask_price_formatted, "ask_price_formatted");
            Intrinsics.checkNotNullParameter(buy_spread_ratio, "buy_spread_ratio");
            Intrinsics.checkNotNullParameter(sell_spread_ratio, "sell_spread_ratio");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new LimitOrderDefinition(asset_currency_code, order_side, monetization_model, bid_price_formatted, ask_price_formatted, buy_spread_ratio, sell_spread_ratio, spread_bottom_sheet_data, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LimitOrderDefinition.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<LimitOrderDefinition>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.BottomSheetType$LimitOrderDefinition$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BottomSheetType.LimitOrderDefinition value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAsset_currency_code());
                    }
                    if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                        size += Side.ADAPTER.encodedSizeWithTag(2, value.getOrder_side());
                    }
                    if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                        size += MonetizationModel.ADAPTER.encodedSizeWithTag(3, value.getMonetization_model());
                    }
                    if (!Intrinsics.areEqual(value.getBid_price_formatted(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getBid_price_formatted());
                    }
                    if (!Intrinsics.areEqual(value.getAsk_price_formatted(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAsk_price_formatted());
                    }
                    if (!Intrinsics.areEqual(value.getBuy_spread_ratio(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getBuy_spread_ratio());
                    }
                    if (!Intrinsics.areEqual(value.getSell_spread_ratio(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getSell_spread_ratio());
                    }
                    return value.getSpread_bottom_sheet_data() != null ? size + BottomSheetType.Spread.ADAPTER.encodedSizeWithTag(8, value.getSpread_bottom_sheet_data()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BottomSheetType.LimitOrderDefinition value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_currency_code());
                    }
                    if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                        Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_side());
                    }
                    if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                        MonetizationModel.ADAPTER.encodeWithTag(writer, 3, (int) value.getMonetization_model());
                    }
                    if (!Intrinsics.areEqual(value.getBid_price_formatted(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBid_price_formatted());
                    }
                    if (!Intrinsics.areEqual(value.getAsk_price_formatted(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAsk_price_formatted());
                    }
                    if (!Intrinsics.areEqual(value.getBuy_spread_ratio(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getBuy_spread_ratio());
                    }
                    if (!Intrinsics.areEqual(value.getSell_spread_ratio(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getSell_spread_ratio());
                    }
                    if (value.getSpread_bottom_sheet_data() != null) {
                        BottomSheetType.Spread.ADAPTER.encodeWithTag(writer, 8, (int) value.getSpread_bottom_sheet_data());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BottomSheetType.LimitOrderDefinition value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getSpread_bottom_sheet_data() != null) {
                        BottomSheetType.Spread.ADAPTER.encodeWithTag(writer, 8, (int) value.getSpread_bottom_sheet_data());
                    }
                    if (!Intrinsics.areEqual(value.getSell_spread_ratio(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getSell_spread_ratio());
                    }
                    if (!Intrinsics.areEqual(value.getBuy_spread_ratio(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getBuy_spread_ratio());
                    }
                    if (!Intrinsics.areEqual(value.getAsk_price_formatted(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAsk_price_formatted());
                    }
                    if (!Intrinsics.areEqual(value.getBid_price_formatted(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBid_price_formatted());
                    }
                    if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                        MonetizationModel.ADAPTER.encodeWithTag(writer, 3, (int) value.getMonetization_model());
                    }
                    if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                        Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_side());
                    }
                    if (Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_currency_code());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetType.LimitOrderDefinition decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Side sideDecode = Side.SIDE__UNSPECIFIED;
                    MonetizationModel monetizationModel = MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = strDecode;
                    String strDecode3 = strDecode2;
                    String strDecode4 = strDecode3;
                    BottomSheetType.Spread spreadDecode = null;
                    MonetizationModel monetizationModelDecode = monetizationModel;
                    String strDecode5 = strDecode4;
                    while (true) {
                        Side side = sideDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag != -1) {
                                switch (iNextTag) {
                                    case 1:
                                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 2:
                                        try {
                                            sideDecode = Side.ADAPTER.decode(reader);
                                            break;
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                            break;
                                        }
                                    case 3:
                                        try {
                                            monetizationModelDecode = MonetizationModel.ADAPTER.decode(reader);
                                            break;
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                            break;
                                        }
                                    case 4:
                                        strDecode = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 5:
                                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 6:
                                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 7:
                                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 8:
                                        spreadDecode = BottomSheetType.Spread.ADAPTER.decode(reader);
                                        break;
                                    default:
                                        reader.readUnknownField(iNextTag);
                                        break;
                                }
                            } else {
                                return new BottomSheetType.LimitOrderDefinition(strDecode5, side, monetizationModelDecode, strDecode, strDecode2, strDecode3, strDecode4, spreadDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetType.LimitOrderDefinition redact(BottomSheetType.LimitOrderDefinition value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    BottomSheetType.Spread spread_bottom_sheet_data = value.getSpread_bottom_sheet_data();
                    return BottomSheetType.LimitOrderDefinition.copy$default(value, null, null, null, null, null, null, null, spread_bottom_sheet_data != null ? BottomSheetType.Spread.ADAPTER.redact(spread_bottom_sheet_data) : null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
                }
            };
        }
    }
}

package contracts.crypto.trade.proto.p431v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import contracts.crypto.trade.proto.p431v1.TokenizationEstimatedTotalCost;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.nummus.order.Side;

/* compiled from: TokenizationEstimatedTotalCost.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000223B\u009f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010)\u001a\u00020\u0002H\u0017J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u0004H\u0016J\u009e\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00064"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost;", "Lcom/squareup/wire/Message;", "", "primary_currency_code", "", "secondary_currency_code", "primary_price_per_token_formatted", "asset_currency_code", "entered_quantity", "exchange_fee_percentage", "estimated_total_cost_formatted", "estimated_fee_cost_formatted", "maximum_total_cost_formatted", "maximum_fee_cost_formatted", "order_side", "Lrosetta/nummus/order/Side;", "trade_collar_percentage", "exchange_collar_percentage", "order_type", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost$OrderType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/nummus/order/Side;Ljava/lang/String;Ljava/lang/String;Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost$OrderType;Lokio/ByteString;)V", "getPrimary_currency_code", "()Ljava/lang/String;", "getSecondary_currency_code", "getPrimary_price_per_token_formatted", "getAsset_currency_code", "getEntered_quantity", "getExchange_fee_percentage", "getEstimated_total_cost_formatted", "getEstimated_fee_cost_formatted", "getMaximum_total_cost_formatted", "getMaximum_fee_cost_formatted", "getOrder_side", "()Lrosetta/nummus/order/Side;", "getTrade_collar_percentage", "getExchange_collar_percentage", "getOrder_type", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost$OrderType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "OrderType", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class TokenizationEstimatedTotalCost extends Message {

    @JvmField
    public static final ProtoAdapter<TokenizationEstimatedTotalCost> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String asset_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "enteredQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String entered_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedFeeCostFormatted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String estimated_fee_cost_formatted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedTotalCostFormatted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String estimated_total_cost_formatted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exchangeCollarPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String exchange_collar_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exchangeFeePercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String exchange_fee_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maximumFeeCostFormatted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String maximum_fee_cost_formatted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maximumTotalCostFormatted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String maximum_total_cost_formatted;

    @WireField(adapter = "rosetta.nummus.order.Side#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Side order_side;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.TokenizationEstimatedTotalCost$OrderType#ADAPTER", jsonName = "orderType", schemaIndex = 13, tag = 14)
    private final OrderType order_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String primary_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryPricePerTokenFormatted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String primary_price_per_token_formatted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String secondary_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tradeCollarPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String trade_collar_percentage;

    public TokenizationEstimatedTotalCost() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public /* synthetic */ TokenizationEstimatedTotalCost(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Side side, String str11, String str12, OrderType orderType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? Side.SIDE__UNSPECIFIED : side, (i & 2048) != 0 ? "" : str11, (i & 4096) == 0 ? str12 : "", (i & 8192) != 0 ? null : orderType, (i & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27712newBuilder();
    }

    public final String getPrimary_currency_code() {
        return this.primary_currency_code;
    }

    public final String getSecondary_currency_code() {
        return this.secondary_currency_code;
    }

    public final String getPrimary_price_per_token_formatted() {
        return this.primary_price_per_token_formatted;
    }

    public final String getAsset_currency_code() {
        return this.asset_currency_code;
    }

    public final String getEntered_quantity() {
        return this.entered_quantity;
    }

    public final String getExchange_fee_percentage() {
        return this.exchange_fee_percentage;
    }

    public final String getEstimated_total_cost_formatted() {
        return this.estimated_total_cost_formatted;
    }

    public final String getEstimated_fee_cost_formatted() {
        return this.estimated_fee_cost_formatted;
    }

    public final String getMaximum_total_cost_formatted() {
        return this.maximum_total_cost_formatted;
    }

    public final String getMaximum_fee_cost_formatted() {
        return this.maximum_fee_cost_formatted;
    }

    public final Side getOrder_side() {
        return this.order_side;
    }

    public final String getTrade_collar_percentage() {
        return this.trade_collar_percentage;
    }

    public final String getExchange_collar_percentage() {
        return this.exchange_collar_percentage;
    }

    public final OrderType getOrder_type() {
        return this.order_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenizationEstimatedTotalCost(String primary_currency_code, String secondary_currency_code, String primary_price_per_token_formatted, String asset_currency_code, String entered_quantity, String exchange_fee_percentage, String estimated_total_cost_formatted, String estimated_fee_cost_formatted, String maximum_total_cost_formatted, String maximum_fee_cost_formatted, Side order_side, String trade_collar_percentage, String exchange_collar_percentage, OrderType orderType, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(primary_currency_code, "primary_currency_code");
        Intrinsics.checkNotNullParameter(secondary_currency_code, "secondary_currency_code");
        Intrinsics.checkNotNullParameter(primary_price_per_token_formatted, "primary_price_per_token_formatted");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(entered_quantity, "entered_quantity");
        Intrinsics.checkNotNullParameter(exchange_fee_percentage, "exchange_fee_percentage");
        Intrinsics.checkNotNullParameter(estimated_total_cost_formatted, "estimated_total_cost_formatted");
        Intrinsics.checkNotNullParameter(estimated_fee_cost_formatted, "estimated_fee_cost_formatted");
        Intrinsics.checkNotNullParameter(maximum_total_cost_formatted, "maximum_total_cost_formatted");
        Intrinsics.checkNotNullParameter(maximum_fee_cost_formatted, "maximum_fee_cost_formatted");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(trade_collar_percentage, "trade_collar_percentage");
        Intrinsics.checkNotNullParameter(exchange_collar_percentage, "exchange_collar_percentage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.primary_currency_code = primary_currency_code;
        this.secondary_currency_code = secondary_currency_code;
        this.primary_price_per_token_formatted = primary_price_per_token_formatted;
        this.asset_currency_code = asset_currency_code;
        this.entered_quantity = entered_quantity;
        this.exchange_fee_percentage = exchange_fee_percentage;
        this.estimated_total_cost_formatted = estimated_total_cost_formatted;
        this.estimated_fee_cost_formatted = estimated_fee_cost_formatted;
        this.maximum_total_cost_formatted = maximum_total_cost_formatted;
        this.maximum_fee_cost_formatted = maximum_fee_cost_formatted;
        this.order_side = order_side;
        this.trade_collar_percentage = trade_collar_percentage;
        this.exchange_collar_percentage = exchange_collar_percentage;
        this.order_type = orderType;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27712newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TokenizationEstimatedTotalCost)) {
            return false;
        }
        TokenizationEstimatedTotalCost tokenizationEstimatedTotalCost = (TokenizationEstimatedTotalCost) other;
        return Intrinsics.areEqual(unknownFields(), tokenizationEstimatedTotalCost.unknownFields()) && Intrinsics.areEqual(this.primary_currency_code, tokenizationEstimatedTotalCost.primary_currency_code) && Intrinsics.areEqual(this.secondary_currency_code, tokenizationEstimatedTotalCost.secondary_currency_code) && Intrinsics.areEqual(this.primary_price_per_token_formatted, tokenizationEstimatedTotalCost.primary_price_per_token_formatted) && Intrinsics.areEqual(this.asset_currency_code, tokenizationEstimatedTotalCost.asset_currency_code) && Intrinsics.areEqual(this.entered_quantity, tokenizationEstimatedTotalCost.entered_quantity) && Intrinsics.areEqual(this.exchange_fee_percentage, tokenizationEstimatedTotalCost.exchange_fee_percentage) && Intrinsics.areEqual(this.estimated_total_cost_formatted, tokenizationEstimatedTotalCost.estimated_total_cost_formatted) && Intrinsics.areEqual(this.estimated_fee_cost_formatted, tokenizationEstimatedTotalCost.estimated_fee_cost_formatted) && Intrinsics.areEqual(this.maximum_total_cost_formatted, tokenizationEstimatedTotalCost.maximum_total_cost_formatted) && Intrinsics.areEqual(this.maximum_fee_cost_formatted, tokenizationEstimatedTotalCost.maximum_fee_cost_formatted) && this.order_side == tokenizationEstimatedTotalCost.order_side && Intrinsics.areEqual(this.trade_collar_percentage, tokenizationEstimatedTotalCost.trade_collar_percentage) && Intrinsics.areEqual(this.exchange_collar_percentage, tokenizationEstimatedTotalCost.exchange_collar_percentage) && this.order_type == tokenizationEstimatedTotalCost.order_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.primary_currency_code.hashCode()) * 37) + this.secondary_currency_code.hashCode()) * 37) + this.primary_price_per_token_formatted.hashCode()) * 37) + this.asset_currency_code.hashCode()) * 37) + this.entered_quantity.hashCode()) * 37) + this.exchange_fee_percentage.hashCode()) * 37) + this.estimated_total_cost_formatted.hashCode()) * 37) + this.estimated_fee_cost_formatted.hashCode()) * 37) + this.maximum_total_cost_formatted.hashCode()) * 37) + this.maximum_fee_cost_formatted.hashCode()) * 37) + this.order_side.hashCode()) * 37) + this.trade_collar_percentage.hashCode()) * 37) + this.exchange_collar_percentage.hashCode()) * 37;
        OrderType orderType = this.order_type;
        int iHashCode2 = iHashCode + (orderType != null ? orderType.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("primary_currency_code=" + Internal.sanitize(this.primary_currency_code));
        arrayList.add("secondary_currency_code=" + Internal.sanitize(this.secondary_currency_code));
        arrayList.add("primary_price_per_token_formatted=" + Internal.sanitize(this.primary_price_per_token_formatted));
        arrayList.add("asset_currency_code=" + Internal.sanitize(this.asset_currency_code));
        arrayList.add("entered_quantity=" + Internal.sanitize(this.entered_quantity));
        arrayList.add("exchange_fee_percentage=" + Internal.sanitize(this.exchange_fee_percentage));
        arrayList.add("estimated_total_cost_formatted=" + Internal.sanitize(this.estimated_total_cost_formatted));
        arrayList.add("estimated_fee_cost_formatted=" + Internal.sanitize(this.estimated_fee_cost_formatted));
        arrayList.add("maximum_total_cost_formatted=" + Internal.sanitize(this.maximum_total_cost_formatted));
        arrayList.add("maximum_fee_cost_formatted=" + Internal.sanitize(this.maximum_fee_cost_formatted));
        arrayList.add("order_side=" + this.order_side);
        arrayList.add("trade_collar_percentage=" + Internal.sanitize(this.trade_collar_percentage));
        arrayList.add("exchange_collar_percentage=" + Internal.sanitize(this.exchange_collar_percentage));
        OrderType orderType = this.order_type;
        if (orderType != null) {
            arrayList.add("order_type=" + orderType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TokenizationEstimatedTotalCost{", "}", 0, null, null, 56, null);
    }

    public final TokenizationEstimatedTotalCost copy(String primary_currency_code, String secondary_currency_code, String primary_price_per_token_formatted, String asset_currency_code, String entered_quantity, String exchange_fee_percentage, String estimated_total_cost_formatted, String estimated_fee_cost_formatted, String maximum_total_cost_formatted, String maximum_fee_cost_formatted, Side order_side, String trade_collar_percentage, String exchange_collar_percentage, OrderType order_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(primary_currency_code, "primary_currency_code");
        Intrinsics.checkNotNullParameter(secondary_currency_code, "secondary_currency_code");
        Intrinsics.checkNotNullParameter(primary_price_per_token_formatted, "primary_price_per_token_formatted");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(entered_quantity, "entered_quantity");
        Intrinsics.checkNotNullParameter(exchange_fee_percentage, "exchange_fee_percentage");
        Intrinsics.checkNotNullParameter(estimated_total_cost_formatted, "estimated_total_cost_formatted");
        Intrinsics.checkNotNullParameter(estimated_fee_cost_formatted, "estimated_fee_cost_formatted");
        Intrinsics.checkNotNullParameter(maximum_total_cost_formatted, "maximum_total_cost_formatted");
        Intrinsics.checkNotNullParameter(maximum_fee_cost_formatted, "maximum_fee_cost_formatted");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(trade_collar_percentage, "trade_collar_percentage");
        Intrinsics.checkNotNullParameter(exchange_collar_percentage, "exchange_collar_percentage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TokenizationEstimatedTotalCost(primary_currency_code, secondary_currency_code, primary_price_per_token_formatted, asset_currency_code, entered_quantity, exchange_fee_percentage, estimated_total_cost_formatted, estimated_fee_cost_formatted, maximum_total_cost_formatted, maximum_fee_cost_formatted, order_side, trade_collar_percentage, exchange_collar_percentage, order_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TokenizationEstimatedTotalCost.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TokenizationEstimatedTotalCost>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.TokenizationEstimatedTotalCost$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TokenizationEstimatedTotalCost value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPrimary_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPrimary_currency_code());
                }
                if (!Intrinsics.areEqual(value.getSecondary_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSecondary_currency_code());
                }
                if (!Intrinsics.areEqual(value.getPrimary_price_per_token_formatted(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrimary_price_per_token_formatted());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAsset_currency_code());
                }
                if (!Intrinsics.areEqual(value.getEntered_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getEntered_quantity());
                }
                if (!Intrinsics.areEqual(value.getExchange_fee_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getExchange_fee_percentage());
                }
                if (!Intrinsics.areEqual(value.getEstimated_total_cost_formatted(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getEstimated_total_cost_formatted());
                }
                if (!Intrinsics.areEqual(value.getEstimated_fee_cost_formatted(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getEstimated_fee_cost_formatted());
                }
                if (!Intrinsics.areEqual(value.getMaximum_total_cost_formatted(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getMaximum_total_cost_formatted());
                }
                if (!Intrinsics.areEqual(value.getMaximum_fee_cost_formatted(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getMaximum_fee_cost_formatted());
                }
                if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(11, value.getOrder_side());
                }
                if (!Intrinsics.areEqual(value.getTrade_collar_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getTrade_collar_percentage());
                }
                if (!Intrinsics.areEqual(value.getExchange_collar_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getExchange_collar_percentage());
                }
                return size + TokenizationEstimatedTotalCost.OrderType.ADAPTER.encodedSizeWithTag(14, value.getOrder_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TokenizationEstimatedTotalCost value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPrimary_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPrimary_currency_code());
                }
                if (!Intrinsics.areEqual(value.getSecondary_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSecondary_currency_code());
                }
                if (!Intrinsics.areEqual(value.getPrimary_price_per_token_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_price_per_token_formatted());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAsset_currency_code());
                }
                if (!Intrinsics.areEqual(value.getEntered_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getEntered_quantity());
                }
                if (!Intrinsics.areEqual(value.getExchange_fee_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getExchange_fee_percentage());
                }
                if (!Intrinsics.areEqual(value.getEstimated_total_cost_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getEstimated_total_cost_formatted());
                }
                if (!Intrinsics.areEqual(value.getEstimated_fee_cost_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getEstimated_fee_cost_formatted());
                }
                if (!Intrinsics.areEqual(value.getMaximum_total_cost_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getMaximum_total_cost_formatted());
                }
                if (!Intrinsics.areEqual(value.getMaximum_fee_cost_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getMaximum_fee_cost_formatted());
                }
                if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 11, (int) value.getOrder_side());
                }
                if (!Intrinsics.areEqual(value.getTrade_collar_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getTrade_collar_percentage());
                }
                if (!Intrinsics.areEqual(value.getExchange_collar_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getExchange_collar_percentage());
                }
                TokenizationEstimatedTotalCost.OrderType.ADAPTER.encodeWithTag(writer, 14, (int) value.getOrder_type());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TokenizationEstimatedTotalCost value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TokenizationEstimatedTotalCost.OrderType.ADAPTER.encodeWithTag(writer, 14, (int) value.getOrder_type());
                if (!Intrinsics.areEqual(value.getExchange_collar_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getExchange_collar_percentage());
                }
                if (!Intrinsics.areEqual(value.getTrade_collar_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getTrade_collar_percentage());
                }
                if (value.getOrder_side() != Side.SIDE__UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 11, (int) value.getOrder_side());
                }
                if (!Intrinsics.areEqual(value.getMaximum_fee_cost_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getMaximum_fee_cost_formatted());
                }
                if (!Intrinsics.areEqual(value.getMaximum_total_cost_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getMaximum_total_cost_formatted());
                }
                if (!Intrinsics.areEqual(value.getEstimated_fee_cost_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getEstimated_fee_cost_formatted());
                }
                if (!Intrinsics.areEqual(value.getEstimated_total_cost_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getEstimated_total_cost_formatted());
                }
                if (!Intrinsics.areEqual(value.getExchange_fee_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getExchange_fee_percentage());
                }
                if (!Intrinsics.areEqual(value.getEntered_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getEntered_quantity());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAsset_currency_code());
                }
                if (!Intrinsics.areEqual(value.getPrimary_price_per_token_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_price_per_token_formatted());
                }
                if (!Intrinsics.areEqual(value.getSecondary_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSecondary_currency_code());
                }
                if (Intrinsics.areEqual(value.getPrimary_currency_code(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPrimary_currency_code());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TokenizationEstimatedTotalCost decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Side side = Side.SIDE__UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Side sideDecode = side;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                TokenizationEstimatedTotalCost.OrderType orderTypeDecode = null;
                String strDecode12 = strDecode11;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                str = strDecode12;
                                str2 = strDecode;
                                str3 = strDecode2;
                                try {
                                    sideDecode = Side.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 12:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 14:
                                try {
                                    orderTypeDecode = TokenizationEstimatedTotalCost.OrderType.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    str = strDecode12;
                                    str2 = strDecode;
                                    str3 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode12;
                                str2 = strDecode;
                                str3 = strDecode2;
                                break;
                        }
                        strDecode12 = str;
                        strDecode = str2;
                        strDecode2 = str3;
                    } else {
                        return new TokenizationEstimatedTotalCost(strDecode12, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, sideDecode, strDecode10, strDecode11, orderTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TokenizationEstimatedTotalCost redact(TokenizationEstimatedTotalCost value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((16383 & 1) != 0 ? value.primary_currency_code : null, (16383 & 2) != 0 ? value.secondary_currency_code : null, (16383 & 4) != 0 ? value.primary_price_per_token_formatted : null, (16383 & 8) != 0 ? value.asset_currency_code : null, (16383 & 16) != 0 ? value.entered_quantity : null, (16383 & 32) != 0 ? value.exchange_fee_percentage : null, (16383 & 64) != 0 ? value.estimated_total_cost_formatted : null, (16383 & 128) != 0 ? value.estimated_fee_cost_formatted : null, (16383 & 256) != 0 ? value.maximum_total_cost_formatted : null, (16383 & 512) != 0 ? value.maximum_fee_cost_formatted : null, (16383 & 1024) != 0 ? value.order_side : null, (16383 & 2048) != 0 ? value.trade_collar_percentage : null, (16383 & 4096) != 0 ? value.exchange_collar_percentage : null, (16383 & 8192) != 0 ? value.order_type : null, (16383 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TokenizationEstimatedTotalCost.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost$OrderType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_TYPE_UNSPECIFIED", "MARKET", "LIMIT", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OrderType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderType LIMIT;
        public static final OrderType MARKET;
        public static final OrderType ORDER_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ OrderType[] $values() {
            return new OrderType[]{ORDER_TYPE_UNSPECIFIED, MARKET, LIMIT};
        }

        @JvmStatic
        public static final OrderType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OrderType> getEntries() {
            return $ENTRIES;
        }

        private OrderType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OrderType orderType = new OrderType("ORDER_TYPE_UNSPECIFIED", 0, 0);
            ORDER_TYPE_UNSPECIFIED = orderType;
            MARKET = new OrderType("MARKET", 1, 1);
            LIMIT = new OrderType("LIMIT", 2, 2);
            OrderType[] orderTypeArr$values = $values();
            $VALUES = orderTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OrderType>(orCreateKotlinClass, syntax, orderType) { // from class: contracts.crypto.trade.proto.v1.TokenizationEstimatedTotalCost$OrderType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TokenizationEstimatedTotalCost.OrderType fromValue(int value) {
                    return TokenizationEstimatedTotalCost.OrderType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TokenizationEstimatedTotalCost.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost$OrderType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedTotalCost$OrderType;", "fromValue", "value", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OrderType fromValue(int value) {
                if (value == 0) {
                    return OrderType.ORDER_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return OrderType.MARKET;
                }
                if (value != 2) {
                    return null;
                }
                return OrderType.LIMIT;
            }
        }

        public static OrderType valueOf(String str) {
            return (OrderType) Enum.valueOf(OrderType.class, str);
        }

        public static OrderType[] values() {
            return (OrderType[]) $VALUES.clone();
        }
    }
}

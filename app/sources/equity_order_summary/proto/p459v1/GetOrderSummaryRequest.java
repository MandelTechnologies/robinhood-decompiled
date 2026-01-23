package equity_order_summary.proto.p459v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
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
import rosetta.order.MarketHours;
import rosetta.order.OrderType;
import rosetta.order.PositionEffect;
import rosetta.order.Side;
import rosetta.order.TimeInForce;
import rosetta.order.Trigger;

/* compiled from: GetOrderSummaryRequest.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 M2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MBã\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010!\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\b\u0010D\u001a\u00020\u0002H\u0017J\u0013\u0010E\u001a\u00020 2\b\u0010F\u001a\u0004\u0018\u00010GH\u0096\u0002J\b\u0010H\u001a\u00020IH\u0016J\b\u0010J\u001a\u00020\u000eH\u0016Jç\u0001\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"¢\u0006\u0002\u0010LR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0016\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00100R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00100R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00100R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u001a\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010B¨\u0006N"}, m3636d2 = {"Lequity_order_summary/proto/v1/GetOrderSummaryRequest;", "Lcom/squareup/wire/Message;", "", "market_hours", "Lequity_order_summary/proto/v1/MarketHours;", "time_in_force", "Lrosetta/order/TimeInForce;", "type", "Lrosetta/order/OrderType;", "trigger", "Lrosetta/order/Trigger;", "order_market_hours", "Lrosetta/order/MarketHours;", "quantity", "", "symbol", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "last_trade_price", "dollar_based_amount", "preset_percent_limit", "side", "Lrosetta/order/Side;", "notional_estimated_quantity_decimals", "", "order_to_replace_id", "trailing_peg", "Lequity_order_summary/proto/v1/TrailingPeg;", "instrument_id", "position_effect", "Lrosetta/order/PositionEffect;", "has_sales_taxes", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lequity_order_summary/proto/v1/MarketHours;Lrosetta/order/TimeInForce;Lrosetta/order/OrderType;Lrosetta/order/Trigger;Lrosetta/order/MarketHours;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/Side;JLjava/lang/String;Lequity_order_summary/proto/v1/TrailingPeg;Ljava/lang/String;Lrosetta/order/PositionEffect;Ljava/lang/Boolean;Lokio/ByteString;)V", "getMarket_hours", "()Lequity_order_summary/proto/v1/MarketHours;", "getTime_in_force", "()Lrosetta/order/TimeInForce;", "getType", "()Lrosetta/order/OrderType;", "getTrigger", "()Lrosetta/order/Trigger;", "getOrder_market_hours", "()Lrosetta/order/MarketHours;", "getQuantity", "()Ljava/lang/String;", "getSymbol", "getPrice", "getStop_price", "getLast_trade_price", "getDollar_based_amount", "getPreset_percent_limit", "getSide", "()Lrosetta/order/Side;", "getNotional_estimated_quantity_decimals", "()J", "getOrder_to_replace_id", "getTrailing_peg", "()Lequity_order_summary/proto/v1/TrailingPeg;", "getInstrument_id", "getPosition_effect", "()Lrosetta/order/PositionEffect;", "getHas_sales_taxes", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Lequity_order_summary/proto/v1/MarketHours;Lrosetta/order/TimeInForce;Lrosetta/order/OrderType;Lrosetta/order/Trigger;Lrosetta/order/MarketHours;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/Side;JLjava/lang/String;Lequity_order_summary/proto/v1/TrailingPeg;Ljava/lang/String;Lrosetta/order/PositionEffect;Ljava/lang/Boolean;Lokio/ByteString;)Lequity_order_summary/proto/v1/GetOrderSummaryRequest;", "Companion", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GetOrderSummaryRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetOrderSummaryRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dollarBasedAmount", schemaIndex = 10, tag = 11)
    private final String dollar_based_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasSalesTaxes", schemaIndex = 18, tag = 19)
    private final Boolean has_sales_taxes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", schemaIndex = 16, tag = 17)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastTradePrice", schemaIndex = 9, tag = 10)
    private final String last_trade_price;

    @WireField(adapter = "equity_order_summary.proto.v1.MarketHours#ADAPTER", jsonName = "marketHours", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MarketHours market_hours;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "notionalEstimatedQuantityDecimals", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final long notional_estimated_quantity_decimals;

    @WireField(adapter = "rosetta.order.MarketHours#ADAPTER", jsonName = "orderMarketHours", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final MarketHours order_market_hours;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderToReplaceId", schemaIndex = 14, tag = 15)
    private final String order_to_replace_id;

    @WireField(adapter = "rosetta.order.PositionEffect#ADAPTER", jsonName = "positionEffect", schemaIndex = 17, tag = 18)
    private final PositionEffect position_effect;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "presetPercentLimit", schemaIndex = 11, tag = 12)
    private final String preset_percent_limit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String quantity;

    @WireField(adapter = "rosetta.order.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Side side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stopPrice", schemaIndex = 8, tag = 9)
    private final String stop_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String symbol;

    @WireField(adapter = "rosetta.order.TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TimeInForce time_in_force;

    @WireField(adapter = "equity_order_summary.proto.v1.TrailingPeg#ADAPTER", jsonName = "trailingPeg", schemaIndex = 15, tag = 16)
    private final TrailingPeg trailing_peg;

    @WireField(adapter = "rosetta.order.Trigger#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Trigger trigger;

    @WireField(adapter = "rosetta.order.OrderType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final OrderType type;

    public GetOrderSummaryRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, 1048575, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28018newBuilder();
    }

    public final MarketHours getMarket_hours() {
        return this.market_hours;
    }

    public final TimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    public /* synthetic */ GetOrderSummaryRequest(MarketHours marketHours, TimeInForce timeInForce, OrderType orderType, Trigger trigger, MarketHours marketHours2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Side side, long j, String str8, TrailingPeg trailingPeg, String str9, PositionEffect positionEffect, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : marketHours, (i & 2) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i & 4) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i & 8) != 0 ? Trigger.TRIGGER_UNSPECIFIED : trigger, (i & 16) != 0 ? MarketHours.MARKET_HOURS_UNSPECIFIED : marketHours2, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? "" : str2, (i & 128) == 0 ? str3 : "", (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 8192) != 0 ? 0L : j, (i & 16384) != 0 ? null : str8, (i & 32768) != 0 ? null : trailingPeg, (i & 65536) != 0 ? null : str9, (i & 131072) != 0 ? null : positionEffect, (i & 262144) != 0 ? null : bool, (i & 524288) != 0 ? ByteString.EMPTY : byteString);
    }

    public final OrderType getType() {
        return this.type;
    }

    public final Trigger getTrigger() {
        return this.trigger;
    }

    public final MarketHours getOrder_market_hours() {
        return this.order_market_hours;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getStop_price() {
        return this.stop_price;
    }

    public final String getLast_trade_price() {
        return this.last_trade_price;
    }

    public final String getDollar_based_amount() {
        return this.dollar_based_amount;
    }

    public final String getPreset_percent_limit() {
        return this.preset_percent_limit;
    }

    public final Side getSide() {
        return this.side;
    }

    public final long getNotional_estimated_quantity_decimals() {
        return this.notional_estimated_quantity_decimals;
    }

    public final String getOrder_to_replace_id() {
        return this.order_to_replace_id;
    }

    public final TrailingPeg getTrailing_peg() {
        return this.trailing_peg;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final PositionEffect getPosition_effect() {
        return this.position_effect;
    }

    public final Boolean getHas_sales_taxes() {
        return this.has_sales_taxes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrderSummaryRequest(MarketHours marketHours, TimeInForce time_in_force, OrderType type2, Trigger trigger, MarketHours order_market_hours, String quantity, String symbol, String price, String str, String str2, String str3, String str4, Side side, long j, String str5, TrailingPeg trailingPeg, String str6, PositionEffect positionEffect, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(order_market_hours, "order_market_hours");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.market_hours = marketHours;
        this.time_in_force = time_in_force;
        this.type = type2;
        this.trigger = trigger;
        this.order_market_hours = order_market_hours;
        this.quantity = quantity;
        this.symbol = symbol;
        this.price = price;
        this.stop_price = str;
        this.last_trade_price = str2;
        this.dollar_based_amount = str3;
        this.preset_percent_limit = str4;
        this.side = side;
        this.notional_estimated_quantity_decimals = j;
        this.order_to_replace_id = str5;
        this.trailing_peg = trailingPeg;
        this.instrument_id = str6;
        this.position_effect = positionEffect;
        this.has_sales_taxes = bool;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28018newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetOrderSummaryRequest)) {
            return false;
        }
        GetOrderSummaryRequest getOrderSummaryRequest = (GetOrderSummaryRequest) other;
        return Intrinsics.areEqual(unknownFields(), getOrderSummaryRequest.unknownFields()) && Intrinsics.areEqual(this.market_hours, getOrderSummaryRequest.market_hours) && this.time_in_force == getOrderSummaryRequest.time_in_force && this.type == getOrderSummaryRequest.type && this.trigger == getOrderSummaryRequest.trigger && this.order_market_hours == getOrderSummaryRequest.order_market_hours && Intrinsics.areEqual(this.quantity, getOrderSummaryRequest.quantity) && Intrinsics.areEqual(this.symbol, getOrderSummaryRequest.symbol) && Intrinsics.areEqual(this.price, getOrderSummaryRequest.price) && Intrinsics.areEqual(this.stop_price, getOrderSummaryRequest.stop_price) && Intrinsics.areEqual(this.last_trade_price, getOrderSummaryRequest.last_trade_price) && Intrinsics.areEqual(this.dollar_based_amount, getOrderSummaryRequest.dollar_based_amount) && Intrinsics.areEqual(this.preset_percent_limit, getOrderSummaryRequest.preset_percent_limit) && this.side == getOrderSummaryRequest.side && this.notional_estimated_quantity_decimals == getOrderSummaryRequest.notional_estimated_quantity_decimals && Intrinsics.areEqual(this.order_to_replace_id, getOrderSummaryRequest.order_to_replace_id) && Intrinsics.areEqual(this.trailing_peg, getOrderSummaryRequest.trailing_peg) && Intrinsics.areEqual(this.instrument_id, getOrderSummaryRequest.instrument_id) && this.position_effect == getOrderSummaryRequest.position_effect && Intrinsics.areEqual(this.has_sales_taxes, getOrderSummaryRequest.has_sales_taxes);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        MarketHours marketHours = this.market_hours;
        int iHashCode2 = (((((((((((((((iHashCode + (marketHours != null ? marketHours.hashCode() : 0)) * 37) + this.time_in_force.hashCode()) * 37) + this.type.hashCode()) * 37) + this.trigger.hashCode()) * 37) + this.order_market_hours.hashCode()) * 37) + this.quantity.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.price.hashCode()) * 37;
        String str = this.stop_price;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.last_trade_price;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.dollar_based_amount;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.preset_percent_limit;
        int iHashCode6 = (((((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37) + this.side.hashCode()) * 37) + Long.hashCode(this.notional_estimated_quantity_decimals)) * 37;
        String str5 = this.order_to_replace_id;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        TrailingPeg trailingPeg = this.trailing_peg;
        int iHashCode8 = (iHashCode7 + (trailingPeg != null ? trailingPeg.hashCode() : 0)) * 37;
        String str6 = this.instrument_id;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37;
        PositionEffect positionEffect = this.position_effect;
        int iHashCode10 = (iHashCode9 + (positionEffect != null ? positionEffect.hashCode() : 0)) * 37;
        Boolean bool = this.has_sales_taxes;
        int iHashCode11 = iHashCode10 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        MarketHours marketHours = this.market_hours;
        if (marketHours != null) {
            arrayList.add("market_hours=" + marketHours);
        }
        arrayList.add("time_in_force=" + this.time_in_force);
        arrayList.add("type=" + this.type);
        arrayList.add("trigger=" + this.trigger);
        arrayList.add("order_market_hours=" + this.order_market_hours);
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("price=" + Internal.sanitize(this.price));
        String str = this.stop_price;
        if (str != null) {
            arrayList.add("stop_price=" + Internal.sanitize(str));
        }
        String str2 = this.last_trade_price;
        if (str2 != null) {
            arrayList.add("last_trade_price=" + Internal.sanitize(str2));
        }
        String str3 = this.dollar_based_amount;
        if (str3 != null) {
            arrayList.add("dollar_based_amount=" + Internal.sanitize(str3));
        }
        String str4 = this.preset_percent_limit;
        if (str4 != null) {
            arrayList.add("preset_percent_limit=" + Internal.sanitize(str4));
        }
        arrayList.add("side=" + this.side);
        arrayList.add("notional_estimated_quantity_decimals=" + this.notional_estimated_quantity_decimals);
        String str5 = this.order_to_replace_id;
        if (str5 != null) {
            arrayList.add("order_to_replace_id=" + Internal.sanitize(str5));
        }
        TrailingPeg trailingPeg = this.trailing_peg;
        if (trailingPeg != null) {
            arrayList.add("trailing_peg=" + trailingPeg);
        }
        String str6 = this.instrument_id;
        if (str6 != null) {
            arrayList.add("instrument_id=" + Internal.sanitize(str6));
        }
        PositionEffect positionEffect = this.position_effect;
        if (positionEffect != null) {
            arrayList.add("position_effect=" + positionEffect);
        }
        Boolean bool = this.has_sales_taxes;
        if (bool != null) {
            arrayList.add("has_sales_taxes=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetOrderSummaryRequest{", "}", 0, null, null, 56, null);
    }

    public final GetOrderSummaryRequest copy(MarketHours market_hours, TimeInForce time_in_force, OrderType type2, Trigger trigger, MarketHours order_market_hours, String quantity, String symbol, String price, String stop_price, String last_trade_price, String dollar_based_amount, String preset_percent_limit, Side side, long notional_estimated_quantity_decimals, String order_to_replace_id, TrailingPeg trailing_peg, String instrument_id, PositionEffect position_effect, Boolean has_sales_taxes, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(order_market_hours, "order_market_hours");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetOrderSummaryRequest(market_hours, time_in_force, type2, trigger, order_market_hours, quantity, symbol, price, stop_price, last_trade_price, dollar_based_amount, preset_percent_limit, side, notional_estimated_quantity_decimals, order_to_replace_id, trailing_peg, instrument_id, position_effect, has_sales_taxes, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetOrderSummaryRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetOrderSummaryRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_order_summary.proto.v1.GetOrderSummaryRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetOrderSummaryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMarket_hours() != null) {
                    size += MarketHours.ADAPTER.encodedSizeWithTag(1, value.getMarket_hours());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    size += TimeInForce.ADAPTER.encodedSizeWithTag(2, value.getTime_in_force());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    size += OrderType.ADAPTER.encodedSizeWithTag(3, value.getType());
                }
                if (value.getTrigger() != Trigger.TRIGGER_UNSPECIFIED) {
                    size += Trigger.ADAPTER.encodedSizeWithTag(4, value.getTrigger());
                }
                if (value.getOrder_market_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    size += MarketHours.ADAPTER.encodedSizeWithTag(5, value.getOrder_market_hours());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getPrice());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(9, value.getStop_price()) + protoAdapter.encodedSizeWithTag(10, value.getLast_trade_price()) + protoAdapter.encodedSizeWithTag(11, value.getDollar_based_amount()) + protoAdapter.encodedSizeWithTag(12, value.getPreset_percent_limit());
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    iEncodedSizeWithTag += Side.ADAPTER.encodedSizeWithTag(13, value.getSide());
                }
                if (value.getNotional_estimated_quantity_decimals() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT64.encodedSizeWithTag(14, Long.valueOf(value.getNotional_estimated_quantity_decimals()));
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(15, value.getOrder_to_replace_id()) + TrailingPeg.ADAPTER.encodedSizeWithTag(16, value.getTrailing_peg()) + protoAdapter.encodedSizeWithTag(17, value.getInstrument_id()) + PositionEffect.ADAPTER.encodedSizeWithTag(18, value.getPosition_effect()) + ProtoAdapter.BOOL.encodedSizeWithTag(19, value.getHas_sales_taxes());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetOrderSummaryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMarket_hours() != null) {
                    MarketHours.ADAPTER.encodeWithTag(writer, 1, (int) value.getMarket_hours());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 2, (int) value.getTime_in_force());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (value.getTrigger() != Trigger.TRIGGER_UNSPECIFIED) {
                    Trigger.ADAPTER.encodeWithTag(writer, 4, (int) value.getTrigger());
                }
                if (value.getOrder_market_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    MarketHours.ADAPTER.encodeWithTag(writer, 5, (int) value.getOrder_market_hours());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPrice());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 9, (int) value.getStop_price());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getLast_trade_price());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getDollar_based_amount());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getPreset_percent_limit());
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 13, (int) value.getSide());
                }
                if (value.getNotional_estimated_quantity_decimals() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 14, (int) Long.valueOf(value.getNotional_estimated_quantity_decimals()));
                }
                protoAdapter.encodeWithTag(writer, 15, (int) value.getOrder_to_replace_id());
                TrailingPeg.ADAPTER.encodeWithTag(writer, 16, (int) value.getTrailing_peg());
                protoAdapter.encodeWithTag(writer, 17, (int) value.getInstrument_id());
                PositionEffect.ADAPTER.encodeWithTag(writer, 18, (int) value.getPosition_effect());
                ProtoAdapter.BOOL.encodeWithTag(writer, 19, (int) value.getHas_sales_taxes());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetOrderSummaryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 19, (int) value.getHas_sales_taxes());
                PositionEffect.ADAPTER.encodeWithTag(writer, 18, (int) value.getPosition_effect());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 17, (int) value.getInstrument_id());
                TrailingPeg.ADAPTER.encodeWithTag(writer, 16, (int) value.getTrailing_peg());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getOrder_to_replace_id());
                if (value.getNotional_estimated_quantity_decimals() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 14, (int) Long.valueOf(value.getNotional_estimated_quantity_decimals()));
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 13, (int) value.getSide());
                }
                protoAdapter.encodeWithTag(writer, 12, (int) value.getPreset_percent_limit());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getDollar_based_amount());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getLast_trade_price());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getStop_price());
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getQuantity());
                }
                if (value.getOrder_market_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    MarketHours.ADAPTER.encodeWithTag(writer, 5, (int) value.getOrder_market_hours());
                }
                if (value.getTrigger() != Trigger.TRIGGER_UNSPECIFIED) {
                    Trigger.ADAPTER.encodeWithTag(writer, 4, (int) value.getTrigger());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 2, (int) value.getTime_in_force());
                }
                if (value.getMarket_hours() != null) {
                    MarketHours.ADAPTER.encodeWithTag(writer, 1, (int) value.getMarket_hours());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetOrderSummaryRequest decode(ProtoReader reader) throws IOException {
                OrderType orderType;
                Trigger trigger;
                MarketHours marketHours;
                Intrinsics.checkNotNullParameter(reader, "reader");
                TimeInForce timeInForce = TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                OrderType orderType2 = OrderType.ORDER_TYPE_UNSPECIFIED;
                Trigger trigger2 = Trigger.TRIGGER_UNSPECIFIED;
                MarketHours marketHours2 = MarketHours.MARKET_HOURS_UNSPECIFIED;
                Side side = Side.SIDE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                TimeInForce timeInForceDecode = timeInForce;
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                TrailingPeg trailingPegDecode = null;
                String strDecode4 = null;
                PositionEffect positionEffectDecode = null;
                Boolean boolDecode = null;
                String strDecode5 = "";
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                long jLongValue = 0;
                Side sideDecode = side;
                MarketHours marketHoursDecode = null;
                String strDecode8 = null;
                String strDecode9 = null;
                MarketHours marketHoursDecode2 = marketHours2;
                Trigger triggerDecode = trigger2;
                OrderType orderTypeDecode = orderType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                marketHoursDecode = MarketHours.ADAPTER.decode(reader);
                                break;
                            case 2:
                                orderType = orderTypeDecode;
                                trigger = triggerDecode;
                                marketHours = marketHoursDecode2;
                                try {
                                    timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                orderTypeDecode = orderType;
                                triggerDecode = trigger;
                                marketHoursDecode2 = marketHours;
                                break;
                            case 3:
                                orderType = orderTypeDecode;
                                trigger = triggerDecode;
                                marketHours = marketHoursDecode2;
                                try {
                                    orderTypeDecode = OrderType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                triggerDecode = trigger;
                                marketHoursDecode2 = marketHours;
                                break;
                            case 4:
                                orderType = orderTypeDecode;
                                trigger = triggerDecode;
                                marketHours = marketHoursDecode2;
                                try {
                                    triggerDecode = Trigger.ADAPTER.decode(reader);
                                    orderTypeDecode = orderType;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                marketHoursDecode2 = marketHours;
                                break;
                            case 5:
                                orderType = orderTypeDecode;
                                trigger = triggerDecode;
                                marketHours = marketHoursDecode2;
                                try {
                                    marketHoursDecode2 = MarketHours.ADAPTER.decode(reader);
                                    orderTypeDecode = orderType;
                                    triggerDecode = trigger;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                orderType = orderTypeDecode;
                                trigger = triggerDecode;
                                marketHours = marketHoursDecode2;
                                try {
                                    sideDecode = Side.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                }
                                orderTypeDecode = orderType;
                                triggerDecode = trigger;
                                marketHoursDecode2 = marketHours;
                                break;
                            case 14:
                                jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                                orderTypeDecode = orderTypeDecode;
                                break;
                            case 15:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                trailingPegDecode = TrailingPeg.ADAPTER.decode(reader);
                                break;
                            case 17:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 18:
                                try {
                                    positionEffectDecode = PositionEffect.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    orderType = orderTypeDecode;
                                    trigger = triggerDecode;
                                    marketHours = marketHoursDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                    break;
                                }
                            case 19:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                orderType = orderTypeDecode;
                                trigger = triggerDecode;
                                marketHours = marketHoursDecode2;
                                orderTypeDecode = orderType;
                                triggerDecode = trigger;
                                marketHoursDecode2 = marketHours;
                                break;
                        }
                    } else {
                        return new GetOrderSummaryRequest(marketHoursDecode, timeInForceDecode, orderTypeDecode, triggerDecode, marketHoursDecode2, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, strDecode, strDecode2, sideDecode, jLongValue, strDecode3, trailingPegDecode, strDecode4, positionEffectDecode, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetOrderSummaryRequest redact(GetOrderSummaryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                MarketHours market_hours = value.getMarket_hours();
                MarketHours marketHoursRedact = market_hours != null ? MarketHours.ADAPTER.redact(market_hours) : null;
                TrailingPeg trailing_peg = value.getTrailing_peg();
                return value.copy((491518 & 1) != 0 ? value.market_hours : marketHoursRedact, (491518 & 2) != 0 ? value.time_in_force : null, (491518 & 4) != 0 ? value.type : null, (491518 & 8) != 0 ? value.trigger : null, (491518 & 16) != 0 ? value.order_market_hours : null, (491518 & 32) != 0 ? value.quantity : null, (491518 & 64) != 0 ? value.symbol : null, (491518 & 128) != 0 ? value.price : null, (491518 & 256) != 0 ? value.stop_price : null, (491518 & 512) != 0 ? value.last_trade_price : null, (491518 & 1024) != 0 ? value.dollar_based_amount : null, (491518 & 2048) != 0 ? value.preset_percent_limit : null, (491518 & 4096) != 0 ? value.side : null, (491518 & 8192) != 0 ? value.notional_estimated_quantity_decimals : 0L, (491518 & 16384) != 0 ? value.order_to_replace_id : null, (491518 & 32768) != 0 ? value.trailing_peg : trailing_peg != null ? TrailingPeg.ADAPTER.redact(trailing_peg) : null, (491518 & 65536) != 0 ? value.instrument_id : null, (491518 & 131072) != 0 ? value.position_effect : null, (491518 & 262144) != 0 ? value.has_sales_taxes : null, (491518 & 524288) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

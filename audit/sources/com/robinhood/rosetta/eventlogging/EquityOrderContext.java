package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.compose.bidask.BidAskDetails3;
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
import p479j$.time.Instant;
import rosetta.order.MarketHours;
import rosetta.order.OrderEntryPoint;
import rosetta.order.OrderInputFormat;
import rosetta.order.OrderType;
import rosetta.order.PositionEffect;
import rosetta.order.Side;
import rosetta.order.Trigger;

/* compiled from: EquityOrderContext.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b/\u0018\u0000 ]2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001]Bç\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0017¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*H\u0096\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0003H\u0016¢\u0006\u0004\b2\u00103Jí\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b4\u00105R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u00103R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b8\u00103R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\b\r\u0010CR\u001a\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\b\u000e\u0010CR\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\b\u000f\u0010CR\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\bG\u00103R\u001a\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\bH\u00103R\"\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bJ\u0010KR\"\u0010\u0017\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010I\u001a\u0004\bL\u0010KR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00106\u001a\u0004\bP\u00103R\u001a\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010!\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010#\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010W\u001a\u0004\bX\u0010YR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010Z\u001a\u0004\b[\u0010\\¨\u0006^"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;", "Lcom/squareup/wire/Message;", "", "", "instrument_id", "symbol", "Lrosetta/order/Side;", "side", "Lrosetta/order/OrderType;", "type", "Lrosetta/order/Trigger;", "trigger", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "is_dollar_based_amount", "is_trailing_order", "is_preset_percent_limit_order", "Lrosetta/order/MarketHours;", "market_hours", BidAskDetails3.BID_PRICE, BidAskDetails3.ASK_PRICE, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "bid_ask_timestamp", "quote_last_cache_timestamp", "", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelection;", "tax_lot_selections", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;", "tax_lots_context", "estimated_total_fees", "Lrosetta/order/PositionEffect;", "position_effect", "Lrosetta/order/OrderEntryPoint;", "order_entry_point", "Lrosetta/order/OrderInputFormat;", "order_input_format", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/order/Side;Lrosetta/order/OrderType;Lrosetta/order/Trigger;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lrosetta/order/MarketHours;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;Ljava/lang/String;Lrosetta/order/PositionEffect;Lrosetta/order/OrderEntryPoint;Lrosetta/order/OrderInputFormat;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/order/Side;Lrosetta/order/OrderType;Lrosetta/order/Trigger;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;Lrosetta/order/MarketHours;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;Ljava/lang/String;Lrosetta/order/PositionEffect;Lrosetta/order/OrderEntryPoint;Lrosetta/order/OrderInputFormat;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/EquityOrderContext;", "Ljava/lang/String;", "getInstrument_id", "getSymbol", "Lrosetta/order/Side;", "getSide", "()Lrosetta/order/Side;", "Lrosetta/order/OrderType;", "getType", "()Lrosetta/order/OrderType;", "Lrosetta/order/Trigger;", "getTrigger", "()Lrosetta/order/Trigger;", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "Lrosetta/order/MarketHours;", "getMarket_hours", "()Lrosetta/order/MarketHours;", "getBid_price", "getAsk_price", "Lj$/time/Instant;", "getBid_ask_timestamp", "()Lj$/time/Instant;", "getQuote_last_cache_timestamp", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;", "getTax_lots_context", "()Lcom/robinhood/rosetta/eventlogging/TaxLotsContext;", "getEstimated_total_fees", "Lrosetta/order/PositionEffect;", "getPosition_effect", "()Lrosetta/order/PositionEffect;", "Lrosetta/order/OrderEntryPoint;", "getOrder_entry_point", "()Lrosetta/order/OrderEntryPoint;", "Lrosetta/order/OrderInputFormat;", "getOrder_input_format", "()Lrosetta/order/OrderInputFormat;", "Ljava/util/List;", "getTax_lot_selections", "()Ljava/util/List;", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class EquityOrderContext extends Message {

    @JvmField
    public static final ProtoAdapter<EquityOrderContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String ask_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "bidAskTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Instant bid_ask_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String bid_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedTotalFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String estimated_total_fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "isDollarBasedAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Boolean is_dollar_based_amount;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "isPresetPercentLimitOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Boolean is_preset_percent_limit_order;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "isTrailingOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Boolean is_trailing_order;

    @WireField(adapter = "rosetta.order.MarketHours#ADAPTER", jsonName = "marketHours", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final MarketHours market_hours;

    @WireField(adapter = "rosetta.order.OrderEntryPoint#ADAPTER", jsonName = "orderEntryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final OrderEntryPoint order_entry_point;

    @WireField(adapter = "rosetta.order.OrderInputFormat#ADAPTER", jsonName = "orderInputFormat", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final OrderInputFormat order_input_format;

    @WireField(adapter = "rosetta.order.PositionEffect#ADAPTER", jsonName = "positionEffect", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final PositionEffect position_effect;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "quoteLastCacheTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Instant quote_last_cache_timestamp;

    @WireField(adapter = "rosetta.order.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Side side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String symbol;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TaxLotSelection#ADAPTER", jsonName = "taxLotSelections", label = WireField.Label.REPEATED, schemaIndex = 13, tag = 14)
    private final java.util.List<TaxLotSelection> tax_lot_selections;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TaxLotsContext#ADAPTER", jsonName = "taxLotsContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final TaxLotsContext tax_lots_context;

    @WireField(adapter = "rosetta.order.Trigger#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Trigger trigger;

    @WireField(adapter = "rosetta.order.OrderType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final OrderType type;

    public EquityOrderContext() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public /* synthetic */ EquityOrderContext(String str, String str2, Side side, OrderType orderType, Trigger trigger, Boolean r26, Boolean r27, Boolean r28, MarketHours marketHours, String str3, String str4, Instant instant, Instant instant2, java.util.List list, TaxLotsContext taxLotsContext, String str5, PositionEffect positionEffect, OrderEntryPoint orderEntryPoint, OrderInputFormat orderInputFormat, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 8) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i & 16) != 0 ? Trigger.TRIGGER_UNSPECIFIED : trigger, (i & 32) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r26, (i & 64) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r27, (i & 128) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r28, (i & 256) != 0 ? MarketHours.MARKET_HOURS_UNSPECIFIED : marketHours, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? "" : str4, (i & 2048) != 0 ? null : instant, (i & 4096) != 0 ? null : instant2, (i & 8192) != 0 ? CollectionsKt.emptyList() : list, (i & 16384) != 0 ? null : taxLotsContext, (i & 32768) == 0 ? str5 : "", (i & 65536) != 0 ? PositionEffect.POSITION_EFFECT_UNSPECIFIED : positionEffect, (i & 131072) != 0 ? OrderEntryPoint.ORDER_ENTRY_POINT_UNSPECIFIED : orderEntryPoint, (i & 262144) != 0 ? OrderInputFormat.ORDER_INPUT_FORMAT_UNSPECIFIED : orderInputFormat, (i & 524288) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24246newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final Side getSide() {
        return this.side;
    }

    public final OrderType getType() {
        return this.type;
    }

    public final Trigger getTrigger() {
        return this.trigger;
    }

    /* renamed from: is_dollar_based_amount, reason: from getter */
    public final Boolean getIs_dollar_based_amount() {
        return this.is_dollar_based_amount;
    }

    /* renamed from: is_trailing_order, reason: from getter */
    public final Boolean getIs_trailing_order() {
        return this.is_trailing_order;
    }

    /* renamed from: is_preset_percent_limit_order, reason: from getter */
    public final Boolean getIs_preset_percent_limit_order() {
        return this.is_preset_percent_limit_order;
    }

    public final MarketHours getMarket_hours() {
        return this.market_hours;
    }

    public final String getBid_price() {
        return this.bid_price;
    }

    public final String getAsk_price() {
        return this.ask_price;
    }

    public final Instant getBid_ask_timestamp() {
        return this.bid_ask_timestamp;
    }

    public final Instant getQuote_last_cache_timestamp() {
        return this.quote_last_cache_timestamp;
    }

    public final TaxLotsContext getTax_lots_context() {
        return this.tax_lots_context;
    }

    public final String getEstimated_total_fees() {
        return this.estimated_total_fees;
    }

    public final PositionEffect getPosition_effect() {
        return this.position_effect;
    }

    public final OrderEntryPoint getOrder_entry_point() {
        return this.order_entry_point;
    }

    public final OrderInputFormat getOrder_input_format() {
        return this.order_input_format;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderContext(String instrument_id, String symbol, Side side, OrderType type2, Trigger trigger, Boolean is_dollar_based_amount, Boolean is_trailing_order, Boolean is_preset_percent_limit_order, MarketHours market_hours, String bid_price, String ask_price, Instant instant, Instant instant2, java.util.List<TaxLotSelection> tax_lot_selections, TaxLotsContext taxLotsContext, String estimated_total_fees, PositionEffect position_effect, OrderEntryPoint order_entry_point, OrderInputFormat order_input_format, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(is_dollar_based_amount, "is_dollar_based_amount");
        Intrinsics.checkNotNullParameter(is_trailing_order, "is_trailing_order");
        Intrinsics.checkNotNullParameter(is_preset_percent_limit_order, "is_preset_percent_limit_order");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(tax_lot_selections, "tax_lot_selections");
        Intrinsics.checkNotNullParameter(estimated_total_fees, "estimated_total_fees");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(order_entry_point, "order_entry_point");
        Intrinsics.checkNotNullParameter(order_input_format, "order_input_format");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.symbol = symbol;
        this.side = side;
        this.type = type2;
        this.trigger = trigger;
        this.is_dollar_based_amount = is_dollar_based_amount;
        this.is_trailing_order = is_trailing_order;
        this.is_preset_percent_limit_order = is_preset_percent_limit_order;
        this.market_hours = market_hours;
        this.bid_price = bid_price;
        this.ask_price = ask_price;
        this.bid_ask_timestamp = instant;
        this.quote_last_cache_timestamp = instant2;
        this.tax_lots_context = taxLotsContext;
        this.estimated_total_fees = estimated_total_fees;
        this.position_effect = position_effect;
        this.order_entry_point = order_entry_point;
        this.order_input_format = order_input_format;
        this.tax_lot_selections = Internal.immutableCopyOf("tax_lot_selections", tax_lot_selections);
    }

    public final java.util.List<TaxLotSelection> getTax_lot_selections() {
        return this.tax_lot_selections;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24246newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EquityOrderContext)) {
            return false;
        }
        EquityOrderContext equityOrderContext = (EquityOrderContext) other;
        return Intrinsics.areEqual(unknownFields(), equityOrderContext.unknownFields()) && Intrinsics.areEqual(this.instrument_id, equityOrderContext.instrument_id) && Intrinsics.areEqual(this.symbol, equityOrderContext.symbol) && this.side == equityOrderContext.side && this.type == equityOrderContext.type && this.trigger == equityOrderContext.trigger && this.is_dollar_based_amount == equityOrderContext.is_dollar_based_amount && this.is_trailing_order == equityOrderContext.is_trailing_order && this.is_preset_percent_limit_order == equityOrderContext.is_preset_percent_limit_order && this.market_hours == equityOrderContext.market_hours && Intrinsics.areEqual(this.bid_price, equityOrderContext.bid_price) && Intrinsics.areEqual(this.ask_price, equityOrderContext.ask_price) && Intrinsics.areEqual(this.bid_ask_timestamp, equityOrderContext.bid_ask_timestamp) && Intrinsics.areEqual(this.quote_last_cache_timestamp, equityOrderContext.quote_last_cache_timestamp) && Intrinsics.areEqual(this.tax_lot_selections, equityOrderContext.tax_lot_selections) && Intrinsics.areEqual(this.tax_lots_context, equityOrderContext.tax_lots_context) && Intrinsics.areEqual(this.estimated_total_fees, equityOrderContext.estimated_total_fees) && this.position_effect == equityOrderContext.position_effect && this.order_entry_point == equityOrderContext.order_entry_point && this.order_input_format == equityOrderContext.order_input_format;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.side.hashCode()) * 37) + this.type.hashCode()) * 37) + this.trigger.hashCode()) * 37) + this.is_dollar_based_amount.hashCode()) * 37) + this.is_trailing_order.hashCode()) * 37) + this.is_preset_percent_limit_order.hashCode()) * 37) + this.market_hours.hashCode()) * 37) + this.bid_price.hashCode()) * 37) + this.ask_price.hashCode()) * 37;
        Instant instant = this.bid_ask_timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.quote_last_cache_timestamp;
        int iHashCode3 = (((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.tax_lot_selections.hashCode()) * 37;
        TaxLotsContext taxLotsContext = this.tax_lots_context;
        int iHashCode4 = ((((((((iHashCode3 + (taxLotsContext != null ? taxLotsContext.hashCode() : 0)) * 37) + this.estimated_total_fees.hashCode()) * 37) + this.position_effect.hashCode()) * 37) + this.order_entry_point.hashCode()) * 37) + this.order_input_format.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("side=" + this.side);
        arrayList.add("type=" + this.type);
        arrayList.add("trigger=" + this.trigger);
        arrayList.add("is_dollar_based_amount=" + this.is_dollar_based_amount);
        arrayList.add("is_trailing_order=" + this.is_trailing_order);
        arrayList.add("is_preset_percent_limit_order=" + this.is_preset_percent_limit_order);
        arrayList.add("market_hours=" + this.market_hours);
        arrayList.add("bid_price=" + Internal.sanitize(this.bid_price));
        arrayList.add("ask_price=" + Internal.sanitize(this.ask_price));
        Instant instant = this.bid_ask_timestamp;
        if (instant != null) {
            arrayList.add("bid_ask_timestamp=" + instant);
        }
        Instant instant2 = this.quote_last_cache_timestamp;
        if (instant2 != null) {
            arrayList.add("quote_last_cache_timestamp=" + instant2);
        }
        if (!this.tax_lot_selections.isEmpty()) {
            arrayList.add("tax_lot_selections=" + this.tax_lot_selections);
        }
        TaxLotsContext taxLotsContext = this.tax_lots_context;
        if (taxLotsContext != null) {
            arrayList.add("tax_lots_context=" + taxLotsContext);
        }
        arrayList.add("estimated_total_fees=" + Internal.sanitize(this.estimated_total_fees));
        arrayList.add("position_effect=" + this.position_effect);
        arrayList.add("order_entry_point=" + this.order_entry_point);
        arrayList.add("order_input_format=" + this.order_input_format);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EquityOrderContext{", "}", 0, null, null, 56, null);
    }

    public final EquityOrderContext copy(String instrument_id, String symbol, Side side, OrderType type2, Trigger trigger, Boolean is_dollar_based_amount, Boolean is_trailing_order, Boolean is_preset_percent_limit_order, MarketHours market_hours, String bid_price, String ask_price, Instant bid_ask_timestamp, Instant quote_last_cache_timestamp, java.util.List<TaxLotSelection> tax_lot_selections, TaxLotsContext tax_lots_context, String estimated_total_fees, PositionEffect position_effect, OrderEntryPoint order_entry_point, OrderInputFormat order_input_format, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(is_dollar_based_amount, "is_dollar_based_amount");
        Intrinsics.checkNotNullParameter(is_trailing_order, "is_trailing_order");
        Intrinsics.checkNotNullParameter(is_preset_percent_limit_order, "is_preset_percent_limit_order");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(tax_lot_selections, "tax_lot_selections");
        Intrinsics.checkNotNullParameter(estimated_total_fees, "estimated_total_fees");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(order_entry_point, "order_entry_point");
        Intrinsics.checkNotNullParameter(order_input_format, "order_input_format");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EquityOrderContext(instrument_id, symbol, side, type2, trigger, is_dollar_based_amount, is_trailing_order, is_preset_percent_limit_order, market_hours, bid_price, ask_price, bid_ask_timestamp, quote_last_cache_timestamp, tax_lot_selections, tax_lots_context, estimated_total_fees, position_effect, order_entry_point, order_input_format, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EquityOrderContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EquityOrderContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.EquityOrderContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EquityOrderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSymbol());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(3, value.getSide());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    size += OrderType.ADAPTER.encodedSizeWithTag(4, value.getType());
                }
                if (value.getTrigger() != Trigger.TRIGGER_UNSPECIFIED) {
                    size += Trigger.ADAPTER.encodedSizeWithTag(5, value.getTrigger());
                }
                Boolean is_dollar_based_amount = value.getIs_dollar_based_amount();
                Boolean r3 = Boolean.BOOLEAN_UNSPECIFIED;
                if (is_dollar_based_amount != r3) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(6, value.getIs_dollar_based_amount());
                }
                if (value.getIs_trailing_order() != r3) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(7, value.getIs_trailing_order());
                }
                if (value.getIs_preset_percent_limit_order() != r3) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(8, value.getIs_preset_percent_limit_order());
                }
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    size += MarketHours.ADAPTER.encodedSizeWithTag(9, value.getMarket_hours());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getAsk_price());
                }
                if (value.getBid_ask_timestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(12, value.getBid_ask_timestamp());
                }
                if (value.getQuote_last_cache_timestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(13, value.getQuote_last_cache_timestamp());
                }
                int iEncodedSizeWithTag = size + TaxLotSelection.ADAPTER.asRepeated().encodedSizeWithTag(14, value.getTax_lot_selections());
                if (value.getTax_lots_context() != null) {
                    iEncodedSizeWithTag += TaxLotsContext.ADAPTER.encodedSizeWithTag(15, value.getTax_lots_context());
                }
                if (!Intrinsics.areEqual(value.getEstimated_total_fees(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getEstimated_total_fees());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    iEncodedSizeWithTag += PositionEffect.ADAPTER.encodedSizeWithTag(17, value.getPosition_effect());
                }
                if (value.getOrder_entry_point() != OrderEntryPoint.ORDER_ENTRY_POINT_UNSPECIFIED) {
                    iEncodedSizeWithTag += OrderEntryPoint.ADAPTER.encodedSizeWithTag(18, value.getOrder_entry_point());
                }
                return value.getOrder_input_format() != OrderInputFormat.ORDER_INPUT_FORMAT_UNSPECIFIED ? iEncodedSizeWithTag + OrderInputFormat.ADAPTER.encodedSizeWithTag(19, value.getOrder_input_format()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EquityOrderContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSymbol());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 3, (int) value.getSide());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 4, (int) value.getType());
                }
                if (value.getTrigger() != Trigger.TRIGGER_UNSPECIFIED) {
                    Trigger.ADAPTER.encodeWithTag(writer, 5, (int) value.getTrigger());
                }
                Boolean is_dollar_based_amount = value.getIs_dollar_based_amount();
                Boolean r2 = Boolean.BOOLEAN_UNSPECIFIED;
                if (is_dollar_based_amount != r2) {
                    Boolean.ADAPTER.encodeWithTag(writer, 6, (int) value.getIs_dollar_based_amount());
                }
                if (value.getIs_trailing_order() != r2) {
                    Boolean.ADAPTER.encodeWithTag(writer, 7, (int) value.getIs_trailing_order());
                }
                if (value.getIs_preset_percent_limit_order() != r2) {
                    Boolean.ADAPTER.encodeWithTag(writer, 8, (int) value.getIs_preset_percent_limit_order());
                }
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    MarketHours.ADAPTER.encodeWithTag(writer, 9, (int) value.getMarket_hours());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getAsk_price());
                }
                if (value.getBid_ask_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 12, (int) value.getBid_ask_timestamp());
                }
                if (value.getQuote_last_cache_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 13, (int) value.getQuote_last_cache_timestamp());
                }
                TaxLotSelection.ADAPTER.asRepeated().encodeWithTag(writer, 14, (int) value.getTax_lot_selections());
                if (value.getTax_lots_context() != null) {
                    TaxLotsContext.ADAPTER.encodeWithTag(writer, 15, (int) value.getTax_lots_context());
                }
                if (!Intrinsics.areEqual(value.getEstimated_total_fees(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getEstimated_total_fees());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 17, (int) value.getPosition_effect());
                }
                if (value.getOrder_entry_point() != OrderEntryPoint.ORDER_ENTRY_POINT_UNSPECIFIED) {
                    OrderEntryPoint.ADAPTER.encodeWithTag(writer, 18, (int) value.getOrder_entry_point());
                }
                if (value.getOrder_input_format() != OrderInputFormat.ORDER_INPUT_FORMAT_UNSPECIFIED) {
                    OrderInputFormat.ADAPTER.encodeWithTag(writer, 19, (int) value.getOrder_input_format());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EquityOrderContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOrder_input_format() != OrderInputFormat.ORDER_INPUT_FORMAT_UNSPECIFIED) {
                    OrderInputFormat.ADAPTER.encodeWithTag(writer, 19, (int) value.getOrder_input_format());
                }
                if (value.getOrder_entry_point() != OrderEntryPoint.ORDER_ENTRY_POINT_UNSPECIFIED) {
                    OrderEntryPoint.ADAPTER.encodeWithTag(writer, 18, (int) value.getOrder_entry_point());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 17, (int) value.getPosition_effect());
                }
                if (!Intrinsics.areEqual(value.getEstimated_total_fees(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getEstimated_total_fees());
                }
                if (value.getTax_lots_context() != null) {
                    TaxLotsContext.ADAPTER.encodeWithTag(writer, 15, (int) value.getTax_lots_context());
                }
                TaxLotSelection.ADAPTER.asRepeated().encodeWithTag(writer, 14, (int) value.getTax_lot_selections());
                if (value.getQuote_last_cache_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 13, (int) value.getQuote_last_cache_timestamp());
                }
                if (value.getBid_ask_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 12, (int) value.getBid_ask_timestamp());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getAsk_price());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getBid_price());
                }
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    MarketHours.ADAPTER.encodeWithTag(writer, 9, (int) value.getMarket_hours());
                }
                Boolean is_preset_percent_limit_order = value.getIs_preset_percent_limit_order();
                Boolean r2 = Boolean.BOOLEAN_UNSPECIFIED;
                if (is_preset_percent_limit_order != r2) {
                    Boolean.ADAPTER.encodeWithTag(writer, 8, (int) value.getIs_preset_percent_limit_order());
                }
                if (value.getIs_trailing_order() != r2) {
                    Boolean.ADAPTER.encodeWithTag(writer, 7, (int) value.getIs_trailing_order());
                }
                if (value.getIs_dollar_based_amount() != r2) {
                    Boolean.ADAPTER.encodeWithTag(writer, 6, (int) value.getIs_dollar_based_amount());
                }
                if (value.getTrigger() != Trigger.TRIGGER_UNSPECIFIED) {
                    Trigger.ADAPTER.encodeWithTag(writer, 5, (int) value.getTrigger());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 4, (int) value.getType());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 3, (int) value.getSide());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSymbol());
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EquityOrderContext decode(ProtoReader reader) throws IOException {
                OrderType orderType;
                Trigger trigger;
                Boolean r26;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Side side = Side.SIDE_UNSPECIFIED;
                OrderType orderType2 = OrderType.ORDER_TYPE_UNSPECIFIED;
                Trigger trigger2 = Trigger.TRIGGER_UNSPECIFIED;
                Boolean r4 = Boolean.BOOLEAN_UNSPECIFIED;
                MarketHours marketHours = MarketHours.MARKET_HOURS_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                PositionEffect positionEffect = PositionEffect.POSITION_EFFECT_UNSPECIFIED;
                OrderEntryPoint orderEntryPoint = OrderEntryPoint.ORDER_ENTRY_POINT_UNSPECIFIED;
                OrderInputFormat orderInputFormat = OrderInputFormat.ORDER_INPUT_FORMAT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Side sideDecode = side;
                OrderInputFormat orderInputFormatDecode = orderInputFormat;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                TaxLotsContext taxLotsContextDecode = null;
                MarketHours marketHoursDecode = marketHours;
                PositionEffect positionEffectDecode = positionEffect;
                OrderEntryPoint orderEntryPointDecode = orderEntryPoint;
                Boolean booleanDecode = r4;
                Boolean booleanDecode2 = booleanDecode;
                Boolean booleanDecode3 = booleanDecode2;
                Trigger triggerDecode = trigger2;
                OrderType orderTypeDecode = orderType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EquityOrderContext(strDecode, strDecode2, sideDecode, orderTypeDecode, triggerDecode, booleanDecode, booleanDecode2, booleanDecode3, marketHoursDecode, strDecode3, strDecode4, instantDecode, instantDecode2, arrayList, taxLotsContextDecode, strDecode5, positionEffectDecode, orderEntryPointDecode, orderInputFormatDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            orderType = orderTypeDecode;
                            trigger = triggerDecode;
                            r26 = booleanDecode;
                            try {
                                sideDecode = Side.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            orderTypeDecode = orderType;
                            triggerDecode = trigger;
                            booleanDecode = r26;
                            break;
                        case 4:
                            orderType = orderTypeDecode;
                            trigger = triggerDecode;
                            r26 = booleanDecode;
                            try {
                                orderTypeDecode = OrderType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            triggerDecode = trigger;
                            booleanDecode = r26;
                            break;
                        case 5:
                            orderType = orderTypeDecode;
                            trigger = triggerDecode;
                            r26 = booleanDecode;
                            try {
                                triggerDecode = Trigger.ADAPTER.decode(reader);
                                orderTypeDecode = orderType;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                            booleanDecode = r26;
                            break;
                        case 6:
                            orderType = orderTypeDecode;
                            trigger = triggerDecode;
                            r26 = booleanDecode;
                            try {
                                booleanDecode = Boolean.ADAPTER.decode(reader);
                                orderTypeDecode = orderType;
                                triggerDecode = trigger;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 7:
                            orderType = orderTypeDecode;
                            trigger = triggerDecode;
                            r26 = booleanDecode;
                            try {
                                booleanDecode2 = Boolean.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                            }
                            orderTypeDecode = orderType;
                            triggerDecode = trigger;
                            booleanDecode = r26;
                            break;
                        case 8:
                            orderType = orderTypeDecode;
                            trigger = triggerDecode;
                            r26 = booleanDecode;
                            try {
                                booleanDecode3 = Boolean.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                            }
                            orderTypeDecode = orderType;
                            triggerDecode = trigger;
                            booleanDecode = r26;
                            break;
                        case 9:
                            orderType = orderTypeDecode;
                            trigger = triggerDecode;
                            r26 = booleanDecode;
                            try {
                                marketHoursDecode = MarketHours.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                            }
                            orderTypeDecode = orderType;
                            triggerDecode = trigger;
                            booleanDecode = r26;
                            break;
                        case 10:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 11:
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 12:
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 13:
                            instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 14:
                            orderType = orderTypeDecode;
                            trigger = triggerDecode;
                            r26 = booleanDecode;
                            arrayList.add(TaxLotSelection.ADAPTER.decode(reader));
                            orderTypeDecode = orderType;
                            triggerDecode = trigger;
                            booleanDecode = r26;
                            break;
                        case 15:
                            taxLotsContextDecode = TaxLotsContext.ADAPTER.decode(reader);
                            break;
                        case 16:
                            strDecode5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 17:
                            orderType = orderTypeDecode;
                            trigger = triggerDecode;
                            r26 = booleanDecode;
                            try {
                                positionEffectDecode = PositionEffect.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                            }
                            orderTypeDecode = orderType;
                            triggerDecode = trigger;
                            booleanDecode = r26;
                            break;
                        case 18:
                            orderType = orderTypeDecode;
                            trigger = triggerDecode;
                            r26 = booleanDecode;
                            try {
                                orderEntryPointDecode = OrderEntryPoint.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e9.value));
                            }
                            orderTypeDecode = orderType;
                            triggerDecode = trigger;
                            booleanDecode = r26;
                            break;
                        case 19:
                            try {
                                orderInputFormatDecode = OrderInputFormat.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                orderType = orderTypeDecode;
                                trigger = triggerDecode;
                                r26 = booleanDecode;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                break;
                            }
                        default:
                            reader.readUnknownField(iNextTag);
                            orderType = orderTypeDecode;
                            trigger = triggerDecode;
                            r26 = booleanDecode;
                            orderTypeDecode = orderType;
                            triggerDecode = trigger;
                            booleanDecode = r26;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EquityOrderContext redact(EquityOrderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant bid_ask_timestamp = value.getBid_ask_timestamp();
                Instant instantRedact = bid_ask_timestamp != null ? ProtoAdapter.INSTANT.redact(bid_ask_timestamp) : null;
                Instant quote_last_cache_timestamp = value.getQuote_last_cache_timestamp();
                Instant instantRedact2 = quote_last_cache_timestamp != null ? ProtoAdapter.INSTANT.redact(quote_last_cache_timestamp) : null;
                java.util.List listM26823redactElements = Internal.m26823redactElements(value.getTax_lot_selections(), TaxLotSelection.ADAPTER);
                TaxLotsContext tax_lots_context = value.getTax_lots_context();
                return value.copy((493567 & 1) != 0 ? value.instrument_id : null, (493567 & 2) != 0 ? value.symbol : null, (493567 & 4) != 0 ? value.side : null, (493567 & 8) != 0 ? value.type : null, (493567 & 16) != 0 ? value.trigger : null, (493567 & 32) != 0 ? value.is_dollar_based_amount : null, (493567 & 64) != 0 ? value.is_trailing_order : null, (493567 & 128) != 0 ? value.is_preset_percent_limit_order : null, (493567 & 256) != 0 ? value.market_hours : null, (493567 & 512) != 0 ? value.bid_price : null, (493567 & 1024) != 0 ? value.ask_price : null, (493567 & 2048) != 0 ? value.bid_ask_timestamp : instantRedact, (493567 & 4096) != 0 ? value.quote_last_cache_timestamp : instantRedact2, (493567 & 8192) != 0 ? value.tax_lot_selections : listM26823redactElements, (493567 & 16384) != 0 ? value.tax_lots_context : tax_lots_context != null ? TaxLotsContext.ADAPTER.redact(tax_lots_context) : null, (493567 & 32768) != 0 ? value.estimated_total_fees : null, (493567 & 65536) != 0 ? value.position_effect : null, (493567 & 131072) != 0 ? value.order_entry_point : null, (493567 & 262144) != 0 ? value.order_input_format : null, (493567 & 524288) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

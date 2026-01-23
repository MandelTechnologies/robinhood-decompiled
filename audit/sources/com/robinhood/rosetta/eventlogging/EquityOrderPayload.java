package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.cbc.service.tax_lot.p283v1.DisposalMethod;
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
import rosetta.order.TimeInForce;
import rosetta.order.Trigger;

/* compiled from: EquityOrderPayload.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\bL\u0018\u0000 \u008b\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u008b\u0001B\u0097\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030!\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\b\b\u0002\u0010)\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010,\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+\u0012\b\b\u0002\u0010.\u001a\u00020-\u0012\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020/0!\u0012\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u0002010!\u0012\b\b\u0002\u00103\u001a\u00020\u0003\u0012\b\b\u0002\u00105\u001a\u000204\u0012\b\b\u0002\u00107\u001a\u000206\u0012\b\b\u0002\u00109\u001a\u000208\u0012\b\b\u0002\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0002H\u0017¢\u0006\u0004\b>\u0010?J\u001a\u0010B\u001a\u00020\u00132\b\u0010A\u001a\u0004\u0018\u00010@H\u0096\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020$H\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0003H\u0016¢\u0006\u0004\bF\u0010GJ\u009d\u0003\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00132\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030!2\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\u0010\b\u0002\u0010,\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+2\b\b\u0002\u0010.\u001a\u00020-2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020/0!2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u0002010!2\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00107\u001a\u0002062\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010;\u001a\u00020:¢\u0006\u0004\bH\u0010IR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010J\u001a\u0004\bK\u0010GR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bL\u0010GR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\bM\u0010GR\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bN\u0010GR\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010J\u001a\u0004\bO\u0010GR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bS\u0010GR\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bT\u0010GR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010^\u001a\u0004\b_\u0010`R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010a\u001a\u0004\bb\u0010cR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010d\u001a\u0004\be\u0010fR\u001a\u0010\u0019\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010^\u001a\u0004\bg\u0010`R\u001a\u0010\u001a\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010^\u001a\u0004\bh\u0010`R\u001a\u0010\u001b\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010^\u001a\u0004\b\u001b\u0010`R\u001a\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010J\u001a\u0004\bi\u0010GR\u001a\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010J\u001a\u0004\bj\u0010GR\u001a\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010J\u001a\u0004\bk\u0010GR\u001a\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010J\u001a\u0004\bl\u0010GR\u001a\u0010 \u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010^\u001a\u0004\bm\u0010`R\u001a\u0010#\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010J\u001a\u0004\bn\u0010GR\u001a\u0010%\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010o\u001a\u0004\bp\u0010ER\u001a\u0010'\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010q\u001a\u0004\br\u0010sR\u001a\u0010(\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010J\u001a\u0004\bt\u0010GR\u001a\u0010)\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010J\u001a\u0004\bu\u0010GR\"\u0010,\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010.\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010y\u001a\u0004\bz\u0010{R\u001a\u00103\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010J\u001a\u0004\b|\u0010GR\u001a\u00105\u001a\u0002048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010}\u001a\u0004\b~\u0010\u007fR\u001d\u00107\u001a\u0002068\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b7\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001d\u00109\u001a\u0002088\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b9\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030!8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\"\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R#\u00100\u001a\b\u0012\u0004\u0012\u00020/0!8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b0\u0010\u0086\u0001\u001a\u0006\b\u0089\u0001\u0010\u0088\u0001R#\u00102\u001a\b\u0012\u0004\u0012\u0002010!8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b2\u0010\u0086\u0001\u001a\u0006\b\u008a\u0001\u0010\u0088\u0001¨\u0006\u008c\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderPayload;", "Lcom/squareup/wire/Message;", "", "", "ref_id", "account", "instrument", "symbol", "quantity", "Lrosetta/order/Side;", "side", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "Lrosetta/order/OrderType;", "type", "Lrosetta/order/Trigger;", "trigger", "Lrosetta/order/TimeInForce;", "time_in_force", "", "extended_hours", "Lcom/robinhood/rosetta/eventlogging/Money;", "dollar_based_amount", "Lcom/robinhood/rosetta/eventlogging/TrailingPeg;", "trailing_peg", "override_day_trade_checks", "override_dtbp_checks", "is_ipo_access_order", "ipo_access_lower_collared_price", "ipo_access_lower_price", "ipo_access_upper_collared_price", "ipo_access_upper_price", "has_ipo_access_custom_price_limit", "", "check_overrides", "preset_percent_limit", "", "order_form_version", "Lrosetta/order/MarketHours;", "market_hours", BidAskDetails3.BID_PRICE, BidAskDetails3.ASK_PRICE, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "bid_ask_timestamp", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;", "tax_lot_selection_type", "Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelection;", "tax_lots", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelection;", "tax_lots_v2", "estimated_total_fee", "Lrosetta/order/PositionEffect;", "position_effect", "Lrosetta/order/OrderEntryPoint;", "order_entry_point", "Lrosetta/order/OrderInputFormat;", "order_input_format", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/Side;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/OrderType;Lrosetta/order/Trigger;Lrosetta/order/TimeInForce;ZLcom/robinhood/rosetta/eventlogging/Money;Lcom/robinhood/rosetta/eventlogging/TrailingPeg;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;ILrosetta/order/MarketHours;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lrosetta/order/PositionEffect;Lrosetta/order/OrderEntryPoint;Lrosetta/order/OrderInputFormat;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/Side;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/OrderType;Lrosetta/order/Trigger;Lrosetta/order/TimeInForce;ZLcom/robinhood/rosetta/eventlogging/Money;Lcom/robinhood/rosetta/eventlogging/TrailingPeg;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;ILrosetta/order/MarketHours;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lrosetta/order/PositionEffect;Lrosetta/order/OrderEntryPoint;Lrosetta/order/OrderInputFormat;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/EquityOrderPayload;", "Ljava/lang/String;", "getRef_id", "getAccount", "getInstrument", "getSymbol", "getQuantity", "Lrosetta/order/Side;", "getSide", "()Lrosetta/order/Side;", "getPrice", "getStop_price", "Lrosetta/order/OrderType;", "getType", "()Lrosetta/order/OrderType;", "Lrosetta/order/Trigger;", "getTrigger", "()Lrosetta/order/Trigger;", "Lrosetta/order/TimeInForce;", "getTime_in_force", "()Lrosetta/order/TimeInForce;", "Z", "getExtended_hours", "()Z", "Lcom/robinhood/rosetta/eventlogging/Money;", "getDollar_based_amount", "()Lcom/robinhood/rosetta/eventlogging/Money;", "Lcom/robinhood/rosetta/eventlogging/TrailingPeg;", "getTrailing_peg", "()Lcom/robinhood/rosetta/eventlogging/TrailingPeg;", "getOverride_day_trade_checks", "getOverride_dtbp_checks", "getIpo_access_lower_collared_price", "getIpo_access_lower_price", "getIpo_access_upper_collared_price", "getIpo_access_upper_price", "getHas_ipo_access_custom_price_limit", "getPreset_percent_limit", "I", "getOrder_form_version", "Lrosetta/order/MarketHours;", "getMarket_hours", "()Lrosetta/order/MarketHours;", "getBid_price", "getAsk_price", "Lj$/time/Instant;", "getBid_ask_timestamp", "()Lj$/time/Instant;", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;", "getTax_lot_selection_type", "()Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;", "getEstimated_total_fee", "Lrosetta/order/PositionEffect;", "getPosition_effect", "()Lrosetta/order/PositionEffect;", "Lrosetta/order/OrderEntryPoint;", "getOrder_entry_point", "()Lrosetta/order/OrderEntryPoint;", "Lrosetta/order/OrderInputFormat;", "getOrder_input_format", "()Lrosetta/order/OrderInputFormat;", "Ljava/util/List;", "getCheck_overrides", "()Ljava/util/List;", "getTax_lots", "getTax_lots_v2", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class EquityOrderPayload extends Message {

    @JvmField
    public static final ProtoAdapter<EquityOrderPayload> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 29)
    private final String ask_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "bidAskTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 30)
    private final Instant bid_ask_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 28)
    private final String bid_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "checkOverrides", label = WireField.Label.REPEATED, schemaIndex = 22, tag = 24)
    private final java.util.List<String> check_overrides;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Money#ADAPTER", jsonName = "dollarBasedAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Money dollar_based_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedTotalFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 32, tag = 34)
    private final String estimated_total_fee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "extendedHours", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final boolean extended_hours;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasIpoAccessCustomPriceLimit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 23)
    private final boolean has_ipo_access_custom_price_limit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String instrument;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ipoAccessLowerCollaredPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 19)
    private final String ipo_access_lower_collared_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ipoAccessLowerPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 20)
    private final String ipo_access_lower_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ipoAccessUpperCollaredPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 21)
    private final String ipo_access_upper_collared_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ipoAccessUpperPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 22)
    private final String ipo_access_upper_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isIpoAccessOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 18)
    private final boolean is_ipo_access_order;

    @WireField(adapter = "rosetta.order.MarketHours#ADAPTER", jsonName = "marketHours", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 27)
    private final MarketHours market_hours;

    @WireField(adapter = "rosetta.order.OrderEntryPoint#ADAPTER", jsonName = "orderEntryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 34, tag = 36)
    private final OrderEntryPoint order_entry_point;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "orderFormVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 26)
    private final int order_form_version;

    @WireField(adapter = "rosetta.order.OrderInputFormat#ADAPTER", jsonName = "orderInputFormat", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 35, tag = 37)
    private final OrderInputFormat order_input_format;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "overrideDayTradeChecks", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final boolean override_day_trade_checks;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "overrideDtbpChecks", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 17)
    private final boolean override_dtbp_checks;

    @WireField(adapter = "rosetta.order.PositionEffect#ADAPTER", jsonName = "positionEffect", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 33, tag = 35)
    private final PositionEffect position_effect;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "presetPercentLimit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 25)
    private final String preset_percent_limit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ref_id;

    @WireField(adapter = "rosetta.order.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Side side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stopPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String stop_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String symbol;

    @WireField(adapter = "com.robinhood.cbc.service.tax_lot.v1.DisposalMethod#ADAPTER", jsonName = "taxLotSelectionType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 31)
    private final DisposalMethod tax_lot_selection_type;

    @WireField(adapter = "com.robinhood.cbc.service.tax_lot.v1.TaxLotSelection#ADAPTER", jsonName = "taxLots", label = WireField.Label.REPEATED, schemaIndex = 30, tag = 32)
    private final java.util.List<com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelection> tax_lots;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TaxLotSelection#ADAPTER", jsonName = "taxLotsV2", label = WireField.Label.REPEATED, schemaIndex = 31, tag = 33)
    private final java.util.List<TaxLotSelection> tax_lots_v2;

    @WireField(adapter = "rosetta.order.TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final TimeInForce time_in_force;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TrailingPeg#ADAPTER", jsonName = "trailingPeg", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final TrailingPeg trailing_peg;

    @WireField(adapter = "rosetta.order.Trigger#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Trigger trigger;

    @WireField(adapter = "rosetta.order.OrderType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final OrderType type;

    public EquityOrderPayload() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, -1, 31, null);
    }

    public /* synthetic */ EquityOrderPayload(String str, String str2, String str3, String str4, String str5, Side side, String str6, String str7, OrderType orderType, Trigger trigger, TimeInForce timeInForce, boolean z, Money money, TrailingPeg trailingPeg, boolean z2, boolean z3, boolean z4, String str8, String str9, String str10, String str11, boolean z5, java.util.List list, String str12, int i, MarketHours marketHours, String str13, String str14, Instant instant, DisposalMethod disposalMethod, java.util.List list2, java.util.List list3, String str15, PositionEffect positionEffect, OrderEntryPoint orderEntryPoint, OrderInputFormat orderInputFormat, ByteString byteString, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? Side.SIDE_UNSPECIFIED : side, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i2 & 512) != 0 ? Trigger.TRIGGER_UNSPECIFIED : trigger, (i2 & 1024) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i2 & 2048) != 0 ? false : z, (i2 & 4096) != 0 ? null : money, (i2 & 8192) != 0 ? null : trailingPeg, (i2 & 16384) != 0 ? false : z2, (i2 & 32768) != 0 ? false : z3, (i2 & 65536) != 0 ? false : z4, (i2 & 131072) != 0 ? "" : str8, (i2 & 262144) != 0 ? "" : str9, (i2 & 524288) != 0 ? "" : str10, (i2 & 1048576) != 0 ? "" : str11, (i2 & 2097152) != 0 ? false : z5, (i2 & 4194304) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8388608) != 0 ? "" : str12, (i2 & 16777216) != 0 ? 0 : i, (i2 & 33554432) != 0 ? MarketHours.MARKET_HOURS_UNSPECIFIED : marketHours, (i2 & 67108864) != 0 ? "" : str13, (i2 & 134217728) != 0 ? "" : str14, (i2 & 268435456) == 0 ? instant : null, (i2 & 536870912) != 0 ? DisposalMethod.METHOD_UNSPECIFIED : disposalMethod, (i2 & 1073741824) != 0 ? CollectionsKt.emptyList() : list2, (i2 & Integer.MIN_VALUE) != 0 ? CollectionsKt.emptyList() : list3, (i3 & 1) == 0 ? str15 : "", (i3 & 2) != 0 ? PositionEffect.POSITION_EFFECT_UNSPECIFIED : positionEffect, (i3 & 4) != 0 ? OrderEntryPoint.ORDER_ENTRY_POINT_UNSPECIFIED : orderEntryPoint, (i3 & 8) != 0 ? OrderInputFormat.ORDER_INPUT_FORMAT_UNSPECIFIED : orderInputFormat, (i3 & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24251newBuilder();
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getAccount() {
        return this.account;
    }

    public final String getInstrument() {
        return this.instrument;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final Side getSide() {
        return this.side;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getStop_price() {
        return this.stop_price;
    }

    public final OrderType getType() {
        return this.type;
    }

    public final Trigger getTrigger() {
        return this.trigger;
    }

    public final TimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    public final boolean getExtended_hours() {
        return this.extended_hours;
    }

    public final Money getDollar_based_amount() {
        return this.dollar_based_amount;
    }

    public final TrailingPeg getTrailing_peg() {
        return this.trailing_peg;
    }

    public final boolean getOverride_day_trade_checks() {
        return this.override_day_trade_checks;
    }

    public final boolean getOverride_dtbp_checks() {
        return this.override_dtbp_checks;
    }

    /* renamed from: is_ipo_access_order, reason: from getter */
    public final boolean getIs_ipo_access_order() {
        return this.is_ipo_access_order;
    }

    public final String getIpo_access_lower_collared_price() {
        return this.ipo_access_lower_collared_price;
    }

    public final String getIpo_access_lower_price() {
        return this.ipo_access_lower_price;
    }

    public final String getIpo_access_upper_collared_price() {
        return this.ipo_access_upper_collared_price;
    }

    public final String getIpo_access_upper_price() {
        return this.ipo_access_upper_price;
    }

    public final boolean getHas_ipo_access_custom_price_limit() {
        return this.has_ipo_access_custom_price_limit;
    }

    public final String getPreset_percent_limit() {
        return this.preset_percent_limit;
    }

    public final int getOrder_form_version() {
        return this.order_form_version;
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

    public final DisposalMethod getTax_lot_selection_type() {
        return this.tax_lot_selection_type;
    }

    public final String getEstimated_total_fee() {
        return this.estimated_total_fee;
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
    public EquityOrderPayload(String ref_id, String account, String instrument, String symbol, String quantity, Side side, String price, String stop_price, OrderType type2, Trigger trigger, TimeInForce time_in_force, boolean z, Money money, TrailingPeg trailingPeg, boolean z2, boolean z3, boolean z4, String ipo_access_lower_collared_price, String ipo_access_lower_price, String ipo_access_upper_collared_price, String ipo_access_upper_price, boolean z5, java.util.List<String> check_overrides, String preset_percent_limit, int i, MarketHours market_hours, String bid_price, String ask_price, Instant instant, DisposalMethod tax_lot_selection_type, java.util.List<com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelection> tax_lots, java.util.List<TaxLotSelection> tax_lots_v2, String estimated_total_fee, PositionEffect position_effect, OrderEntryPoint order_entry_point, OrderInputFormat order_input_format, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(stop_price, "stop_price");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(ipo_access_lower_collared_price, "ipo_access_lower_collared_price");
        Intrinsics.checkNotNullParameter(ipo_access_lower_price, "ipo_access_lower_price");
        Intrinsics.checkNotNullParameter(ipo_access_upper_collared_price, "ipo_access_upper_collared_price");
        Intrinsics.checkNotNullParameter(ipo_access_upper_price, "ipo_access_upper_price");
        Intrinsics.checkNotNullParameter(check_overrides, "check_overrides");
        Intrinsics.checkNotNullParameter(preset_percent_limit, "preset_percent_limit");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(tax_lot_selection_type, "tax_lot_selection_type");
        Intrinsics.checkNotNullParameter(tax_lots, "tax_lots");
        Intrinsics.checkNotNullParameter(tax_lots_v2, "tax_lots_v2");
        Intrinsics.checkNotNullParameter(estimated_total_fee, "estimated_total_fee");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(order_entry_point, "order_entry_point");
        Intrinsics.checkNotNullParameter(order_input_format, "order_input_format");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ref_id = ref_id;
        this.account = account;
        this.instrument = instrument;
        this.symbol = symbol;
        this.quantity = quantity;
        this.side = side;
        this.price = price;
        this.stop_price = stop_price;
        this.type = type2;
        this.trigger = trigger;
        this.time_in_force = time_in_force;
        this.extended_hours = z;
        this.dollar_based_amount = money;
        this.trailing_peg = trailingPeg;
        this.override_day_trade_checks = z2;
        this.override_dtbp_checks = z3;
        this.is_ipo_access_order = z4;
        this.ipo_access_lower_collared_price = ipo_access_lower_collared_price;
        this.ipo_access_lower_price = ipo_access_lower_price;
        this.ipo_access_upper_collared_price = ipo_access_upper_collared_price;
        this.ipo_access_upper_price = ipo_access_upper_price;
        this.has_ipo_access_custom_price_limit = z5;
        this.preset_percent_limit = preset_percent_limit;
        this.order_form_version = i;
        this.market_hours = market_hours;
        this.bid_price = bid_price;
        this.ask_price = ask_price;
        this.bid_ask_timestamp = instant;
        this.tax_lot_selection_type = tax_lot_selection_type;
        this.estimated_total_fee = estimated_total_fee;
        this.position_effect = position_effect;
        this.order_entry_point = order_entry_point;
        this.order_input_format = order_input_format;
        this.check_overrides = Internal.immutableCopyOf("check_overrides", check_overrides);
        this.tax_lots = Internal.immutableCopyOf("tax_lots", tax_lots);
        this.tax_lots_v2 = Internal.immutableCopyOf("tax_lots_v2", tax_lots_v2);
    }

    public final java.util.List<String> getCheck_overrides() {
        return this.check_overrides;
    }

    public final java.util.List<com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelection> getTax_lots() {
        return this.tax_lots;
    }

    public final java.util.List<TaxLotSelection> getTax_lots_v2() {
        return this.tax_lots_v2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24251newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EquityOrderPayload)) {
            return false;
        }
        EquityOrderPayload equityOrderPayload = (EquityOrderPayload) other;
        return Intrinsics.areEqual(unknownFields(), equityOrderPayload.unknownFields()) && Intrinsics.areEqual(this.ref_id, equityOrderPayload.ref_id) && Intrinsics.areEqual(this.account, equityOrderPayload.account) && Intrinsics.areEqual(this.instrument, equityOrderPayload.instrument) && Intrinsics.areEqual(this.symbol, equityOrderPayload.symbol) && Intrinsics.areEqual(this.quantity, equityOrderPayload.quantity) && this.side == equityOrderPayload.side && Intrinsics.areEqual(this.price, equityOrderPayload.price) && Intrinsics.areEqual(this.stop_price, equityOrderPayload.stop_price) && this.type == equityOrderPayload.type && this.trigger == equityOrderPayload.trigger && this.time_in_force == equityOrderPayload.time_in_force && this.extended_hours == equityOrderPayload.extended_hours && Intrinsics.areEqual(this.dollar_based_amount, equityOrderPayload.dollar_based_amount) && Intrinsics.areEqual(this.trailing_peg, equityOrderPayload.trailing_peg) && this.override_day_trade_checks == equityOrderPayload.override_day_trade_checks && this.override_dtbp_checks == equityOrderPayload.override_dtbp_checks && this.is_ipo_access_order == equityOrderPayload.is_ipo_access_order && Intrinsics.areEqual(this.ipo_access_lower_collared_price, equityOrderPayload.ipo_access_lower_collared_price) && Intrinsics.areEqual(this.ipo_access_lower_price, equityOrderPayload.ipo_access_lower_price) && Intrinsics.areEqual(this.ipo_access_upper_collared_price, equityOrderPayload.ipo_access_upper_collared_price) && Intrinsics.areEqual(this.ipo_access_upper_price, equityOrderPayload.ipo_access_upper_price) && this.has_ipo_access_custom_price_limit == equityOrderPayload.has_ipo_access_custom_price_limit && Intrinsics.areEqual(this.check_overrides, equityOrderPayload.check_overrides) && Intrinsics.areEqual(this.preset_percent_limit, equityOrderPayload.preset_percent_limit) && this.order_form_version == equityOrderPayload.order_form_version && this.market_hours == equityOrderPayload.market_hours && Intrinsics.areEqual(this.bid_price, equityOrderPayload.bid_price) && Intrinsics.areEqual(this.ask_price, equityOrderPayload.ask_price) && Intrinsics.areEqual(this.bid_ask_timestamp, equityOrderPayload.bid_ask_timestamp) && this.tax_lot_selection_type == equityOrderPayload.tax_lot_selection_type && Intrinsics.areEqual(this.tax_lots, equityOrderPayload.tax_lots) && Intrinsics.areEqual(this.tax_lots_v2, equityOrderPayload.tax_lots_v2) && Intrinsics.areEqual(this.estimated_total_fee, equityOrderPayload.estimated_total_fee) && this.position_effect == equityOrderPayload.position_effect && this.order_entry_point == equityOrderPayload.order_entry_point && this.order_input_format == equityOrderPayload.order_input_format;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.ref_id.hashCode()) * 37) + this.account.hashCode()) * 37) + this.instrument.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.quantity.hashCode()) * 37) + this.side.hashCode()) * 37) + this.price.hashCode()) * 37) + this.stop_price.hashCode()) * 37) + this.type.hashCode()) * 37) + this.trigger.hashCode()) * 37) + this.time_in_force.hashCode()) * 37) + java.lang.Boolean.hashCode(this.extended_hours)) * 37;
        Money money = this.dollar_based_amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        TrailingPeg trailingPeg = this.trailing_peg;
        int iHashCode3 = (((((((((((((((((((((((((((((iHashCode2 + (trailingPeg != null ? trailingPeg.hashCode() : 0)) * 37) + java.lang.Boolean.hashCode(this.override_day_trade_checks)) * 37) + java.lang.Boolean.hashCode(this.override_dtbp_checks)) * 37) + java.lang.Boolean.hashCode(this.is_ipo_access_order)) * 37) + this.ipo_access_lower_collared_price.hashCode()) * 37) + this.ipo_access_lower_price.hashCode()) * 37) + this.ipo_access_upper_collared_price.hashCode()) * 37) + this.ipo_access_upper_price.hashCode()) * 37) + java.lang.Boolean.hashCode(this.has_ipo_access_custom_price_limit)) * 37) + this.check_overrides.hashCode()) * 37) + this.preset_percent_limit.hashCode()) * 37) + Integer.hashCode(this.order_form_version)) * 37) + this.market_hours.hashCode()) * 37) + this.bid_price.hashCode()) * 37) + this.ask_price.hashCode()) * 37;
        Instant instant = this.bid_ask_timestamp;
        int iHashCode4 = ((((((((((((((iHashCode3 + (instant != null ? instant.hashCode() : 0)) * 37) + this.tax_lot_selection_type.hashCode()) * 37) + this.tax_lots.hashCode()) * 37) + this.tax_lots_v2.hashCode()) * 37) + this.estimated_total_fee.hashCode()) * 37) + this.position_effect.hashCode()) * 37) + this.order_entry_point.hashCode()) * 37) + this.order_input_format.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("account=" + Internal.sanitize(this.account));
        arrayList.add("instrument=" + Internal.sanitize(this.instrument));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("side=" + this.side);
        arrayList.add("price=" + Internal.sanitize(this.price));
        arrayList.add("stop_price=" + Internal.sanitize(this.stop_price));
        arrayList.add("type=" + this.type);
        arrayList.add("trigger=" + this.trigger);
        arrayList.add("time_in_force=" + this.time_in_force);
        arrayList.add("extended_hours=" + this.extended_hours);
        Money money = this.dollar_based_amount;
        if (money != null) {
            arrayList.add("dollar_based_amount=" + money);
        }
        TrailingPeg trailingPeg = this.trailing_peg;
        if (trailingPeg != null) {
            arrayList.add("trailing_peg=" + trailingPeg);
        }
        arrayList.add("override_day_trade_checks=" + this.override_day_trade_checks);
        arrayList.add("override_dtbp_checks=" + this.override_dtbp_checks);
        arrayList.add("is_ipo_access_order=" + this.is_ipo_access_order);
        arrayList.add("ipo_access_lower_collared_price=" + Internal.sanitize(this.ipo_access_lower_collared_price));
        arrayList.add("ipo_access_lower_price=" + Internal.sanitize(this.ipo_access_lower_price));
        arrayList.add("ipo_access_upper_collared_price=" + Internal.sanitize(this.ipo_access_upper_collared_price));
        arrayList.add("ipo_access_upper_price=" + Internal.sanitize(this.ipo_access_upper_price));
        arrayList.add("has_ipo_access_custom_price_limit=" + this.has_ipo_access_custom_price_limit);
        if (!this.check_overrides.isEmpty()) {
            arrayList.add("check_overrides=" + Internal.sanitize(this.check_overrides));
        }
        arrayList.add("preset_percent_limit=" + Internal.sanitize(this.preset_percent_limit));
        arrayList.add("order_form_version=" + this.order_form_version);
        arrayList.add("market_hours=" + this.market_hours);
        arrayList.add("bid_price=" + Internal.sanitize(this.bid_price));
        arrayList.add("ask_price=" + Internal.sanitize(this.ask_price));
        Instant instant = this.bid_ask_timestamp;
        if (instant != null) {
            arrayList.add("bid_ask_timestamp=" + instant);
        }
        arrayList.add("tax_lot_selection_type=" + this.tax_lot_selection_type);
        if (!this.tax_lots.isEmpty()) {
            arrayList.add("tax_lots=" + this.tax_lots);
        }
        if (!this.tax_lots_v2.isEmpty()) {
            arrayList.add("tax_lots_v2=" + this.tax_lots_v2);
        }
        arrayList.add("estimated_total_fee=" + Internal.sanitize(this.estimated_total_fee));
        arrayList.add("position_effect=" + this.position_effect);
        arrayList.add("order_entry_point=" + this.order_entry_point);
        arrayList.add("order_input_format=" + this.order_input_format);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EquityOrderPayload{", "}", 0, null, null, 56, null);
    }

    public final EquityOrderPayload copy(String ref_id, String account, String instrument, String symbol, String quantity, Side side, String price, String stop_price, OrderType type2, Trigger trigger, TimeInForce time_in_force, boolean extended_hours, Money dollar_based_amount, TrailingPeg trailing_peg, boolean override_day_trade_checks, boolean override_dtbp_checks, boolean is_ipo_access_order, String ipo_access_lower_collared_price, String ipo_access_lower_price, String ipo_access_upper_collared_price, String ipo_access_upper_price, boolean has_ipo_access_custom_price_limit, java.util.List<String> check_overrides, String preset_percent_limit, int order_form_version, MarketHours market_hours, String bid_price, String ask_price, Instant bid_ask_timestamp, DisposalMethod tax_lot_selection_type, java.util.List<com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelection> tax_lots, java.util.List<TaxLotSelection> tax_lots_v2, String estimated_total_fee, PositionEffect position_effect, OrderEntryPoint order_entry_point, OrderInputFormat order_input_format, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(stop_price, "stop_price");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(ipo_access_lower_collared_price, "ipo_access_lower_collared_price");
        Intrinsics.checkNotNullParameter(ipo_access_lower_price, "ipo_access_lower_price");
        Intrinsics.checkNotNullParameter(ipo_access_upper_collared_price, "ipo_access_upper_collared_price");
        Intrinsics.checkNotNullParameter(ipo_access_upper_price, "ipo_access_upper_price");
        Intrinsics.checkNotNullParameter(check_overrides, "check_overrides");
        Intrinsics.checkNotNullParameter(preset_percent_limit, "preset_percent_limit");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(tax_lot_selection_type, "tax_lot_selection_type");
        Intrinsics.checkNotNullParameter(tax_lots, "tax_lots");
        Intrinsics.checkNotNullParameter(tax_lots_v2, "tax_lots_v2");
        Intrinsics.checkNotNullParameter(estimated_total_fee, "estimated_total_fee");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(order_entry_point, "order_entry_point");
        Intrinsics.checkNotNullParameter(order_input_format, "order_input_format");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EquityOrderPayload(ref_id, account, instrument, symbol, quantity, side, price, stop_price, type2, trigger, time_in_force, extended_hours, dollar_based_amount, trailing_peg, override_day_trade_checks, override_dtbp_checks, is_ipo_access_order, ipo_access_lower_collared_price, ipo_access_lower_price, ipo_access_upper_collared_price, ipo_access_upper_price, has_ipo_access_custom_price_limit, check_overrides, preset_percent_limit, order_form_version, market_hours, bid_price, ask_price, bid_ask_timestamp, tax_lot_selection_type, tax_lots, tax_lots_v2, estimated_total_fee, position_effect, order_entry_point, order_input_format, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EquityOrderPayload.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EquityOrderPayload>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.EquityOrderPayload$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EquityOrderPayload value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getAccount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount());
                }
                if (!Intrinsics.areEqual(value.getInstrument(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getInstrument());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getQuantity());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(6, value.getSide());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getStop_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getStop_price());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    size += OrderType.ADAPTER.encodedSizeWithTag(9, value.getType());
                }
                if (value.getTrigger() != Trigger.TRIGGER_UNSPECIFIED) {
                    size += Trigger.ADAPTER.encodedSizeWithTag(10, value.getTrigger());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    size += TimeInForce.ADAPTER.encodedSizeWithTag(11, value.getTime_in_force());
                }
                if (value.getExtended_hours()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(12, java.lang.Boolean.valueOf(value.getExtended_hours()));
                }
                if (value.getDollar_based_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(13, value.getDollar_based_amount());
                }
                if (value.getTrailing_peg() != null) {
                    size += TrailingPeg.ADAPTER.encodedSizeWithTag(14, value.getTrailing_peg());
                }
                if (value.getOverride_day_trade_checks()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(15, java.lang.Boolean.valueOf(value.getOverride_day_trade_checks()));
                }
                if (value.getOverride_dtbp_checks()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(17, java.lang.Boolean.valueOf(value.getOverride_dtbp_checks()));
                }
                if (value.getIs_ipo_access_order()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(18, java.lang.Boolean.valueOf(value.getIs_ipo_access_order()));
                }
                if (!Intrinsics.areEqual(value.getIpo_access_lower_collared_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(19, value.getIpo_access_lower_collared_price());
                }
                if (!Intrinsics.areEqual(value.getIpo_access_lower_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(20, value.getIpo_access_lower_price());
                }
                if (!Intrinsics.areEqual(value.getIpo_access_upper_collared_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(21, value.getIpo_access_upper_collared_price());
                }
                if (!Intrinsics.areEqual(value.getIpo_access_upper_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(22, value.getIpo_access_upper_price());
                }
                if (value.getHas_ipo_access_custom_price_limit()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(23, java.lang.Boolean.valueOf(value.getHas_ipo_access_custom_price_limit()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(24, value.getCheck_overrides());
                if (!Intrinsics.areEqual(value.getPreset_percent_limit(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(25, value.getPreset_percent_limit());
                }
                if (value.getOrder_form_version() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(26, Integer.valueOf(value.getOrder_form_version()));
                }
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    iEncodedSizeWithTag += MarketHours.ADAPTER.encodedSizeWithTag(27, value.getMarket_hours());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(28, value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(29, value.getAsk_price());
                }
                if (value.getBid_ask_timestamp() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(30, value.getBid_ask_timestamp());
                }
                if (value.getTax_lot_selection_type() != DisposalMethod.METHOD_UNSPECIFIED) {
                    iEncodedSizeWithTag += DisposalMethod.ADAPTER.encodedSizeWithTag(31, value.getTax_lot_selection_type());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelection.ADAPTER.asRepeated().encodedSizeWithTag(32, value.getTax_lots()) + TaxLotSelection.ADAPTER.asRepeated().encodedSizeWithTag(33, value.getTax_lots_v2());
                if (!Intrinsics.areEqual(value.getEstimated_total_fee(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(34, value.getEstimated_total_fee());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += PositionEffect.ADAPTER.encodedSizeWithTag(35, value.getPosition_effect());
                }
                if (value.getOrder_entry_point() != OrderEntryPoint.ORDER_ENTRY_POINT_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += OrderEntryPoint.ADAPTER.encodedSizeWithTag(36, value.getOrder_entry_point());
                }
                return value.getOrder_input_format() != OrderInputFormat.ORDER_INPUT_FORMAT_UNSPECIFIED ? iEncodedSizeWithTag2 + OrderInputFormat.ADAPTER.encodedSizeWithTag(37, value.getOrder_input_format()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EquityOrderPayload value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getAccount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount());
                }
                if (!Intrinsics.areEqual(value.getInstrument(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstrument());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getQuantity());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 6, (int) value.getSide());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getStop_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getStop_price());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 9, (int) value.getType());
                }
                if (value.getTrigger() != Trigger.TRIGGER_UNSPECIFIED) {
                    Trigger.ADAPTER.encodeWithTag(writer, 10, (int) value.getTrigger());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 11, (int) value.getTime_in_force());
                }
                if (value.getExtended_hours()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) java.lang.Boolean.valueOf(value.getExtended_hours()));
                }
                if (value.getDollar_based_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 13, (int) value.getDollar_based_amount());
                }
                if (value.getTrailing_peg() != null) {
                    TrailingPeg.ADAPTER.encodeWithTag(writer, 14, (int) value.getTrailing_peg());
                }
                if (value.getOverride_day_trade_checks()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 15, (int) java.lang.Boolean.valueOf(value.getOverride_day_trade_checks()));
                }
                if (value.getOverride_dtbp_checks()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 17, (int) java.lang.Boolean.valueOf(value.getOverride_dtbp_checks()));
                }
                if (value.getIs_ipo_access_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 18, (int) java.lang.Boolean.valueOf(value.getIs_ipo_access_order()));
                }
                if (!Intrinsics.areEqual(value.getIpo_access_lower_collared_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getIpo_access_lower_collared_price());
                }
                if (!Intrinsics.areEqual(value.getIpo_access_lower_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getIpo_access_lower_price());
                }
                if (!Intrinsics.areEqual(value.getIpo_access_upper_collared_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getIpo_access_upper_collared_price());
                }
                if (!Intrinsics.areEqual(value.getIpo_access_upper_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getIpo_access_upper_price());
                }
                if (value.getHas_ipo_access_custom_price_limit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 23, (int) java.lang.Boolean.valueOf(value.getHas_ipo_access_custom_price_limit()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 24, (int) value.getCheck_overrides());
                if (!Intrinsics.areEqual(value.getPreset_percent_limit(), "")) {
                    protoAdapter.encodeWithTag(writer, 25, (int) value.getPreset_percent_limit());
                }
                if (value.getOrder_form_version() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 26, (int) Integer.valueOf(value.getOrder_form_version()));
                }
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    MarketHours.ADAPTER.encodeWithTag(writer, 27, (int) value.getMarket_hours());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    protoAdapter.encodeWithTag(writer, 28, (int) value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    protoAdapter.encodeWithTag(writer, 29, (int) value.getAsk_price());
                }
                if (value.getBid_ask_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 30, (int) value.getBid_ask_timestamp());
                }
                if (value.getTax_lot_selection_type() != DisposalMethod.METHOD_UNSPECIFIED) {
                    DisposalMethod.ADAPTER.encodeWithTag(writer, 31, (int) value.getTax_lot_selection_type());
                }
                com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelection.ADAPTER.asRepeated().encodeWithTag(writer, 32, (int) value.getTax_lots());
                TaxLotSelection.ADAPTER.asRepeated().encodeWithTag(writer, 33, (int) value.getTax_lots_v2());
                if (!Intrinsics.areEqual(value.getEstimated_total_fee(), "")) {
                    protoAdapter.encodeWithTag(writer, 34, (int) value.getEstimated_total_fee());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 35, (int) value.getPosition_effect());
                }
                if (value.getOrder_entry_point() != OrderEntryPoint.ORDER_ENTRY_POINT_UNSPECIFIED) {
                    OrderEntryPoint.ADAPTER.encodeWithTag(writer, 36, (int) value.getOrder_entry_point());
                }
                if (value.getOrder_input_format() != OrderInputFormat.ORDER_INPUT_FORMAT_UNSPECIFIED) {
                    OrderInputFormat.ADAPTER.encodeWithTag(writer, 37, (int) value.getOrder_input_format());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EquityOrderPayload value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOrder_input_format() != OrderInputFormat.ORDER_INPUT_FORMAT_UNSPECIFIED) {
                    OrderInputFormat.ADAPTER.encodeWithTag(writer, 37, (int) value.getOrder_input_format());
                }
                if (value.getOrder_entry_point() != OrderEntryPoint.ORDER_ENTRY_POINT_UNSPECIFIED) {
                    OrderEntryPoint.ADAPTER.encodeWithTag(writer, 36, (int) value.getOrder_entry_point());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 35, (int) value.getPosition_effect());
                }
                if (!Intrinsics.areEqual(value.getEstimated_total_fee(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 34, (int) value.getEstimated_total_fee());
                }
                TaxLotSelection.ADAPTER.asRepeated().encodeWithTag(writer, 33, (int) value.getTax_lots_v2());
                com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelection.ADAPTER.asRepeated().encodeWithTag(writer, 32, (int) value.getTax_lots());
                if (value.getTax_lot_selection_type() != DisposalMethod.METHOD_UNSPECIFIED) {
                    DisposalMethod.ADAPTER.encodeWithTag(writer, 31, (int) value.getTax_lot_selection_type());
                }
                if (value.getBid_ask_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 30, (int) value.getBid_ask_timestamp());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 29, (int) value.getAsk_price());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 28, (int) value.getBid_price());
                }
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    MarketHours.ADAPTER.encodeWithTag(writer, 27, (int) value.getMarket_hours());
                }
                if (value.getOrder_form_version() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 26, (int) Integer.valueOf(value.getOrder_form_version()));
                }
                if (!Intrinsics.areEqual(value.getPreset_percent_limit(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 25, (int) value.getPreset_percent_limit());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 24, (int) value.getCheck_overrides());
                if (value.getHas_ipo_access_custom_price_limit()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 23, (int) java.lang.Boolean.valueOf(value.getHas_ipo_access_custom_price_limit()));
                }
                if (!Intrinsics.areEqual(value.getIpo_access_upper_price(), "")) {
                    protoAdapter.encodeWithTag(writer, 22, (int) value.getIpo_access_upper_price());
                }
                if (!Intrinsics.areEqual(value.getIpo_access_upper_collared_price(), "")) {
                    protoAdapter.encodeWithTag(writer, 21, (int) value.getIpo_access_upper_collared_price());
                }
                if (!Intrinsics.areEqual(value.getIpo_access_lower_price(), "")) {
                    protoAdapter.encodeWithTag(writer, 20, (int) value.getIpo_access_lower_price());
                }
                if (!Intrinsics.areEqual(value.getIpo_access_lower_collared_price(), "")) {
                    protoAdapter.encodeWithTag(writer, 19, (int) value.getIpo_access_lower_collared_price());
                }
                if (value.getIs_ipo_access_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 18, (int) java.lang.Boolean.valueOf(value.getIs_ipo_access_order()));
                }
                if (value.getOverride_dtbp_checks()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 17, (int) java.lang.Boolean.valueOf(value.getOverride_dtbp_checks()));
                }
                if (value.getOverride_day_trade_checks()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 15, (int) java.lang.Boolean.valueOf(value.getOverride_day_trade_checks()));
                }
                if (value.getTrailing_peg() != null) {
                    TrailingPeg.ADAPTER.encodeWithTag(writer, 14, (int) value.getTrailing_peg());
                }
                if (value.getDollar_based_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 13, (int) value.getDollar_based_amount());
                }
                if (value.getExtended_hours()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) java.lang.Boolean.valueOf(value.getExtended_hours()));
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 11, (int) value.getTime_in_force());
                }
                if (value.getTrigger() != Trigger.TRIGGER_UNSPECIFIED) {
                    Trigger.ADAPTER.encodeWithTag(writer, 10, (int) value.getTrigger());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 9, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getStop_price(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getStop_price());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getPrice());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 6, (int) value.getSide());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getInstrument(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getInstrument());
                }
                if (!Intrinsics.areEqual(value.getAccount(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getAccount());
                }
                if (Intrinsics.areEqual(value.getRef_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getRef_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EquityOrderPayload decode(ProtoReader reader) throws IOException {
                OrderType orderType;
                TimeInForce timeInForce;
                MarketHours marketHours;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Side side = Side.SIDE_UNSPECIFIED;
                OrderType orderType2 = OrderType.ORDER_TYPE_UNSPECIFIED;
                Trigger trigger = Trigger.TRIGGER_UNSPECIFIED;
                TimeInForce timeInForce2 = TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                MarketHours marketHours2 = MarketHours.MARKET_HOURS_UNSPECIFIED;
                DisposalMethod disposalMethod = DisposalMethod.METHOD_UNSPECIFIED;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                PositionEffect positionEffect = PositionEffect.POSITION_EFFECT_UNSPECIFIED;
                OrderEntryPoint orderEntryPoint = OrderEntryPoint.ORDER_ENTRY_POINT_UNSPECIFIED;
                OrderInputFormat orderInputFormat = OrderInputFormat.ORDER_INPUT_FORMAT_UNSPECIFIED;
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
                String strDecode12 = strDecode11;
                String strDecode13 = strDecode12;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                boolean zBooleanValue4 = false;
                boolean zBooleanValue5 = false;
                int iIntValue = 0;
                Money moneyDecode = null;
                TrailingPeg trailingPegDecode = null;
                Instant instantDecode = null;
                OrderInputFormat orderInputFormatDecode = orderInputFormat;
                String strDecode14 = strDecode13;
                String strDecode15 = strDecode14;
                OrderEntryPoint orderEntryPointDecode = orderEntryPoint;
                PositionEffect positionEffectDecode = positionEffect;
                DisposalMethod disposalMethodDecode = disposalMethod;
                MarketHours marketHoursDecode = marketHours2;
                TimeInForce timeInForceDecode = timeInForce2;
                Trigger triggerDecode = trigger;
                OrderType orderTypeDecode = orderType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EquityOrderPayload(strDecode14, strDecode15, strDecode, strDecode2, strDecode3, sideDecode, strDecode4, strDecode5, orderTypeDecode, triggerDecode, timeInForceDecode, zBooleanValue, moneyDecode, trailingPegDecode, zBooleanValue2, zBooleanValue3, zBooleanValue4, strDecode6, strDecode7, strDecode8, strDecode9, zBooleanValue5, arrayList, strDecode10, iIntValue, marketHoursDecode, strDecode11, strDecode12, instantDecode, disposalMethodDecode, arrayList2, arrayList3, strDecode13, positionEffectDecode, orderEntryPointDecode, orderInputFormatDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            strDecode14 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            strDecode15 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            orderType = orderTypeDecode;
                            timeInForce = timeInForceDecode;
                            marketHours = marketHoursDecode;
                            try {
                                sideDecode = Side.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            orderTypeDecode = orderType;
                            timeInForceDecode = timeInForce;
                            marketHoursDecode = marketHours;
                            break;
                        case 7:
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            strDecode5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 9:
                            orderType = orderTypeDecode;
                            timeInForce = timeInForceDecode;
                            marketHours = marketHoursDecode;
                            try {
                                orderTypeDecode = OrderType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            timeInForceDecode = timeInForce;
                            marketHoursDecode = marketHours;
                            break;
                        case 10:
                            orderType = orderTypeDecode;
                            timeInForce = timeInForceDecode;
                            marketHours = marketHoursDecode;
                            try {
                                triggerDecode = Trigger.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            orderTypeDecode = orderType;
                            timeInForceDecode = timeInForce;
                            marketHoursDecode = marketHours;
                            break;
                        case 11:
                            orderType = orderTypeDecode;
                            timeInForce = timeInForceDecode;
                            marketHours = marketHoursDecode;
                            try {
                                timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                                orderTypeDecode = orderType;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                            marketHoursDecode = marketHours;
                            break;
                        case 12:
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 13:
                            moneyDecode = Money.ADAPTER.decode(reader);
                            break;
                        case 14:
                            trailingPegDecode = TrailingPeg.ADAPTER.decode(reader);
                            break;
                        case 15:
                            zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 16:
                        default:
                            reader.readUnknownField(iNextTag);
                            orderType = orderTypeDecode;
                            timeInForce = timeInForceDecode;
                            marketHours = marketHoursDecode;
                            orderTypeDecode = orderType;
                            timeInForceDecode = timeInForce;
                            marketHoursDecode = marketHours;
                            break;
                        case 17:
                            zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 18:
                            zBooleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 19:
                            strDecode6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 20:
                            strDecode7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 21:
                            strDecode8 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 22:
                            strDecode9 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 23:
                            zBooleanValue5 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 24:
                            orderType = orderTypeDecode;
                            timeInForce = timeInForceDecode;
                            marketHours = marketHoursDecode;
                            arrayList.add(ProtoAdapter.STRING.decode(reader));
                            orderTypeDecode = orderType;
                            timeInForceDecode = timeInForce;
                            marketHoursDecode = marketHours;
                            break;
                        case 25:
                            strDecode10 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 26:
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 27:
                            orderType = orderTypeDecode;
                            timeInForce = timeInForceDecode;
                            marketHours = marketHoursDecode;
                            try {
                                marketHoursDecode = MarketHours.ADAPTER.decode(reader);
                                orderTypeDecode = orderType;
                                timeInForceDecode = timeInForce;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                break;
                            }
                        case 28:
                            strDecode11 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 29:
                            strDecode12 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 30:
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 31:
                            orderType = orderTypeDecode;
                            timeInForce = timeInForceDecode;
                            marketHours = marketHoursDecode;
                            try {
                                disposalMethodDecode = DisposalMethod.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                            }
                            orderTypeDecode = orderType;
                            timeInForceDecode = timeInForce;
                            marketHoursDecode = marketHours;
                            break;
                        case 32:
                            orderType = orderTypeDecode;
                            timeInForce = timeInForceDecode;
                            marketHours = marketHoursDecode;
                            arrayList2.add(com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelection.ADAPTER.decode(reader));
                            orderTypeDecode = orderType;
                            timeInForceDecode = timeInForce;
                            marketHoursDecode = marketHours;
                            break;
                        case 33:
                            orderType = orderTypeDecode;
                            timeInForce = timeInForceDecode;
                            marketHours = marketHoursDecode;
                            arrayList3.add(TaxLotSelection.ADAPTER.decode(reader));
                            orderTypeDecode = orderType;
                            timeInForceDecode = timeInForce;
                            marketHoursDecode = marketHours;
                            break;
                        case 34:
                            strDecode13 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 35:
                            orderType = orderTypeDecode;
                            timeInForce = timeInForceDecode;
                            marketHours = marketHoursDecode;
                            try {
                                positionEffectDecode = PositionEffect.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                            }
                            orderTypeDecode = orderType;
                            timeInForceDecode = timeInForce;
                            marketHoursDecode = marketHours;
                            break;
                        case 36:
                            orderType = orderTypeDecode;
                            timeInForce = timeInForceDecode;
                            marketHours = marketHoursDecode;
                            try {
                                orderEntryPointDecode = OrderEntryPoint.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                            }
                            orderTypeDecode = orderType;
                            timeInForceDecode = timeInForce;
                            marketHoursDecode = marketHours;
                            break;
                        case 37:
                            try {
                                orderInputFormatDecode = OrderInputFormat.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                orderType = orderTypeDecode;
                                timeInForce = timeInForceDecode;
                                marketHours = marketHoursDecode;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e9.value));
                                break;
                            }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EquityOrderPayload redact(EquityOrderPayload value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money dollar_based_amount = value.getDollar_based_amount();
                Money moneyRedact = dollar_based_amount != null ? Money.ADAPTER.redact(dollar_based_amount) : null;
                TrailingPeg trailing_peg = value.getTrailing_peg();
                TrailingPeg trailingPegRedact = trailing_peg != null ? TrailingPeg.ADAPTER.redact(trailing_peg) : null;
                Instant bid_ask_timestamp = value.getBid_ask_timestamp();
                return value.copy((805294079 & 1) != 0 ? value.ref_id : null, (805294079 & 2) != 0 ? value.account : null, (805294079 & 4) != 0 ? value.instrument : null, (805294079 & 8) != 0 ? value.symbol : null, (805294079 & 16) != 0 ? value.quantity : null, (805294079 & 32) != 0 ? value.side : null, (805294079 & 64) != 0 ? value.price : null, (805294079 & 128) != 0 ? value.stop_price : null, (805294079 & 256) != 0 ? value.type : null, (805294079 & 512) != 0 ? value.trigger : null, (805294079 & 1024) != 0 ? value.time_in_force : null, (805294079 & 2048) != 0 ? value.extended_hours : false, (805294079 & 4096) != 0 ? value.dollar_based_amount : moneyRedact, (805294079 & 8192) != 0 ? value.trailing_peg : trailingPegRedact, (805294079 & 16384) != 0 ? value.override_day_trade_checks : false, (805294079 & 32768) != 0 ? value.override_dtbp_checks : false, (805294079 & 65536) != 0 ? value.is_ipo_access_order : false, (805294079 & 131072) != 0 ? value.ipo_access_lower_collared_price : null, (805294079 & 262144) != 0 ? value.ipo_access_lower_price : null, (805294079 & 524288) != 0 ? value.ipo_access_upper_collared_price : null, (805294079 & 1048576) != 0 ? value.ipo_access_upper_price : null, (805294079 & 2097152) != 0 ? value.has_ipo_access_custom_price_limit : false, (805294079 & 4194304) != 0 ? value.check_overrides : null, (805294079 & 8388608) != 0 ? value.preset_percent_limit : null, (805294079 & 16777216) != 0 ? value.order_form_version : 0, (805294079 & 33554432) != 0 ? value.market_hours : null, (805294079 & 67108864) != 0 ? value.bid_price : null, (805294079 & 134217728) != 0 ? value.ask_price : null, (805294079 & 268435456) != 0 ? value.bid_ask_timestamp : bid_ask_timestamp != null ? ProtoAdapter.INSTANT.redact(bid_ask_timestamp) : null, (805294079 & 536870912) != 0 ? value.tax_lot_selection_type : null, (805294079 & 1073741824) != 0 ? value.tax_lots : Internal.m26823redactElements(value.getTax_lots(), com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelection.ADAPTER), (805294079 & Integer.MIN_VALUE) != 0 ? value.tax_lots_v2 : Internal.m26823redactElements(value.getTax_lots_v2(), TaxLotSelection.ADAPTER), (15 & 1) != 0 ? value.estimated_total_fee : null, (15 & 2) != 0 ? value.position_effect : null, (15 & 4) != 0 ? value.order_entry_point : null, (15 & 8) != 0 ? value.order_input_format : null, (15 & 16) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

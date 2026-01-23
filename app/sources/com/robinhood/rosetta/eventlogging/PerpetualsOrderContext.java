package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.rosetta.eventlogging.PerpetualsOrderContext;
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

/* compiled from: PerpetualsOrderContext.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u0000 P2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006PQRSTUB\u008b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\b\b\u0002\u0010%\u001a\u00020&¢\u0006\u0004\b'\u0010(J\b\u0010I\u001a\u00020\u0002H\u0017J\u0013\u0010J\u001a\u00020\"2\b\u0010K\u001a\u0004\u0018\u00010LH\u0096\u0002J\b\u0010M\u001a\u00020\u0019H\u0016J\b\u0010N\u001a\u00020\u0004H\u0016J\u008a\u0002\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020&R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0016\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0016\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00101R\u0016\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00101R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\u001a\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0016\u0010\u001b\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00101R\u0016\u0010\u001c\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00101R\u0016\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0016\u0010\u001f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00101R\u0016\u0010 \u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00101R\u0016\u0010!\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010GR\u0016\u0010#\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010GR\u0016\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010*¨\u0006V"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext;", "Lcom/squareup/wire/Message;", "", "order_id", "", "contract_id", "order_type", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;", "order_side", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderSide;", BidAskDetails3.BID_PRICE, "", BidAskDetails3.ASK_PRICE, "limit_price", "stop_price", "time_in_force", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "quote_currency_code", "order_quantity", "order_currency_code", "avg_executed_price", "total_notional_amount", "margin_mode", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$MarginMode;", "leverage", "", "take_profit", "stop_loss", "fees", "status", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "executed_notional", "executed_quantity", "is_liquidation_order", "", "is_close_position_order", "ref_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderSide;DDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;Ljava/lang/String;DLjava/lang/String;DDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$MarginMode;IDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;DDZZLjava/lang/String;Lokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "getContract_id", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderSide;", "getBid_price", "()D", "getAsk_price", "getLimit_price", "getStop_price", "getTime_in_force", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "getQuote_currency_code", "getOrder_quantity", "getOrder_currency_code", "getAvg_executed_price", "getTotal_notional_amount", "getMargin_mode", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$MarginMode;", "getLeverage", "()I", "getTake_profit", "getStop_loss", "getFees", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "getExecuted_notional", "getExecuted_quantity", "()Z", "getRef_id", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "PerpetualsOrderType", "PerpetualsOrderSide", "TimeInForce", "MarginMode", "OrderStatus", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PerpetualsOrderContext extends Message {

    @JvmField
    public static final ProtoAdapter<PerpetualsOrderContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double ask_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "avgExecutedPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final double avg_executed_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final double bid_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "executedNotional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final double executed_notional;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "executedQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final double executed_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final double fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isClosePositionOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final boolean is_close_position_order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isLiquidationOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final boolean is_liquidation_order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final int leverage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "limitPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final double limit_price;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$MarginMode#ADAPTER", jsonName = "marginMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final MarginMode margin_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String order_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "orderQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final double order_quantity;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$PerpetualsOrderSide#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final PerpetualsOrderSide order_side;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$PerpetualsOrderType#ADAPTER", jsonName = "orderType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final PerpetualsOrderType order_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String quote_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final String ref_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$OrderStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final OrderStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "stopLoss", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final double stop_loss;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "stopPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final double stop_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "takeProfit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final double take_profit;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final TimeInForce time_in_force;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "totalNotionalAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final double total_notional_amount;

    public PerpetualsOrderContext() {
        this(null, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0.0d, 0.0d, 0.0d, null, 0.0d, 0.0d, false, false, null, null, 67108863, null);
    }

    public /* synthetic */ PerpetualsOrderContext(String str, String str2, PerpetualsOrderType perpetualsOrderType, PerpetualsOrderSide perpetualsOrderSide, double d, double d2, double d3, double d4, TimeInForce timeInForce, String str3, double d5, String str4, double d6, double d7, MarginMode marginMode, int i, double d8, double d9, double d10, OrderStatus orderStatus, double d11, double d12, boolean z, boolean z2, String str5, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? PerpetualsOrderType.ORDER_TYPE_UNSPECIFIED : perpetualsOrderType, (i2 & 8) != 0 ? PerpetualsOrderSide.ORDER_SIDE_UNSPECIFIED : perpetualsOrderSide, (i2 & 16) != 0 ? 0.0d : d, (i2 & 32) != 0 ? 0.0d : d2, (i2 & 64) != 0 ? 0.0d : d3, (i2 & 128) != 0 ? 0.0d : d4, (i2 & 256) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i2 & 512) != 0 ? "" : str3, (i2 & 1024) != 0 ? 0.0d : d5, (i2 & 2048) != 0 ? "" : str4, (i2 & 4096) != 0 ? 0.0d : d6, (i2 & 8192) != 0 ? 0.0d : d7, (i2 & 16384) != 0 ? MarginMode.MARGIN_MODE_UNSPECIFIED : marginMode, (i2 & 32768) != 0 ? 0 : i, (i2 & 65536) != 0 ? 0.0d : d8, (i2 & 131072) != 0 ? 0.0d : d9, (i2 & 262144) != 0 ? 0.0d : d10, (i2 & 524288) != 0 ? OrderStatus.ORDER_STATUS_UNSPECIFIED : orderStatus, (i2 & 1048576) != 0 ? 0.0d : d11, (i2 & 2097152) != 0 ? 0.0d : d12, (i2 & 4194304) != 0 ? false : z, (i2 & 8388608) == 0 ? z2 : false, (i2 & 16777216) == 0 ? str5 : "", (i2 & 33554432) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24495newBuilder();
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final PerpetualsOrderType getOrder_type() {
        return this.order_type;
    }

    public final PerpetualsOrderSide getOrder_side() {
        return this.order_side;
    }

    public final double getBid_price() {
        return this.bid_price;
    }

    public final double getAsk_price() {
        return this.ask_price;
    }

    public final double getLimit_price() {
        return this.limit_price;
    }

    public final double getStop_price() {
        return this.stop_price;
    }

    public final TimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    public final String getQuote_currency_code() {
        return this.quote_currency_code;
    }

    public final double getOrder_quantity() {
        return this.order_quantity;
    }

    public final String getOrder_currency_code() {
        return this.order_currency_code;
    }

    public final double getAvg_executed_price() {
        return this.avg_executed_price;
    }

    public final double getTotal_notional_amount() {
        return this.total_notional_amount;
    }

    public final MarginMode getMargin_mode() {
        return this.margin_mode;
    }

    public final int getLeverage() {
        return this.leverage;
    }

    public final double getTake_profit() {
        return this.take_profit;
    }

    public final double getStop_loss() {
        return this.stop_loss;
    }

    public final double getFees() {
        return this.fees;
    }

    public final OrderStatus getStatus() {
        return this.status;
    }

    public final double getExecuted_notional() {
        return this.executed_notional;
    }

    public final double getExecuted_quantity() {
        return this.executed_quantity;
    }

    /* renamed from: is_liquidation_order, reason: from getter */
    public final boolean getIs_liquidation_order() {
        return this.is_liquidation_order;
    }

    /* renamed from: is_close_position_order, reason: from getter */
    public final boolean getIs_close_position_order() {
        return this.is_close_position_order;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualsOrderContext(String order_id, String contract_id, PerpetualsOrderType order_type, PerpetualsOrderSide order_side, double d, double d2, double d3, double d4, TimeInForce time_in_force, String quote_currency_code, double d5, String order_currency_code, double d6, double d7, MarginMode margin_mode, int i, double d8, double d9, double d10, OrderStatus status, double d11, double d12, boolean z, boolean z2, String ref_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(order_currency_code, "order_currency_code");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.contract_id = contract_id;
        this.order_type = order_type;
        this.order_side = order_side;
        this.bid_price = d;
        this.ask_price = d2;
        this.limit_price = d3;
        this.stop_price = d4;
        this.time_in_force = time_in_force;
        this.quote_currency_code = quote_currency_code;
        this.order_quantity = d5;
        this.order_currency_code = order_currency_code;
        this.avg_executed_price = d6;
        this.total_notional_amount = d7;
        this.margin_mode = margin_mode;
        this.leverage = i;
        this.take_profit = d8;
        this.stop_loss = d9;
        this.fees = d10;
        this.status = status;
        this.executed_notional = d11;
        this.executed_quantity = d12;
        this.is_liquidation_order = z;
        this.is_close_position_order = z2;
        this.ref_id = ref_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24495newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PerpetualsOrderContext)) {
            return false;
        }
        PerpetualsOrderContext perpetualsOrderContext = (PerpetualsOrderContext) other;
        return Intrinsics.areEqual(unknownFields(), perpetualsOrderContext.unknownFields()) && Intrinsics.areEqual(this.order_id, perpetualsOrderContext.order_id) && Intrinsics.areEqual(this.contract_id, perpetualsOrderContext.contract_id) && this.order_type == perpetualsOrderContext.order_type && this.order_side == perpetualsOrderContext.order_side && this.bid_price == perpetualsOrderContext.bid_price && this.ask_price == perpetualsOrderContext.ask_price && this.limit_price == perpetualsOrderContext.limit_price && this.stop_price == perpetualsOrderContext.stop_price && this.time_in_force == perpetualsOrderContext.time_in_force && Intrinsics.areEqual(this.quote_currency_code, perpetualsOrderContext.quote_currency_code) && this.order_quantity == perpetualsOrderContext.order_quantity && Intrinsics.areEqual(this.order_currency_code, perpetualsOrderContext.order_currency_code) && this.avg_executed_price == perpetualsOrderContext.avg_executed_price && this.total_notional_amount == perpetualsOrderContext.total_notional_amount && this.margin_mode == perpetualsOrderContext.margin_mode && this.leverage == perpetualsOrderContext.leverage && this.take_profit == perpetualsOrderContext.take_profit && this.stop_loss == perpetualsOrderContext.stop_loss && this.fees == perpetualsOrderContext.fees && this.status == perpetualsOrderContext.status && this.executed_notional == perpetualsOrderContext.executed_notional && this.executed_quantity == perpetualsOrderContext.executed_quantity && this.is_liquidation_order == perpetualsOrderContext.is_liquidation_order && this.is_close_position_order == perpetualsOrderContext.is_close_position_order && Intrinsics.areEqual(this.ref_id, perpetualsOrderContext.ref_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.order_id.hashCode()) * 37) + this.contract_id.hashCode()) * 37) + this.order_type.hashCode()) * 37) + this.order_side.hashCode()) * 37) + Double.hashCode(this.bid_price)) * 37) + Double.hashCode(this.ask_price)) * 37) + Double.hashCode(this.limit_price)) * 37) + Double.hashCode(this.stop_price)) * 37) + this.time_in_force.hashCode()) * 37) + this.quote_currency_code.hashCode()) * 37) + Double.hashCode(this.order_quantity)) * 37) + this.order_currency_code.hashCode()) * 37) + Double.hashCode(this.avg_executed_price)) * 37) + Double.hashCode(this.total_notional_amount)) * 37) + this.margin_mode.hashCode()) * 37) + Integer.hashCode(this.leverage)) * 37) + Double.hashCode(this.take_profit)) * 37) + Double.hashCode(this.stop_loss)) * 37) + Double.hashCode(this.fees)) * 37) + this.status.hashCode()) * 37) + Double.hashCode(this.executed_notional)) * 37) + Double.hashCode(this.executed_quantity)) * 37) + java.lang.Boolean.hashCode(this.is_liquidation_order)) * 37) + java.lang.Boolean.hashCode(this.is_close_position_order)) * 37) + this.ref_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("order_type=" + this.order_type);
        arrayList.add("order_side=" + this.order_side);
        arrayList.add("bid_price=" + this.bid_price);
        arrayList.add("ask_price=" + this.ask_price);
        arrayList.add("limit_price=" + this.limit_price);
        arrayList.add("stop_price=" + this.stop_price);
        arrayList.add("time_in_force=" + this.time_in_force);
        arrayList.add("quote_currency_code=" + Internal.sanitize(this.quote_currency_code));
        arrayList.add("order_quantity=" + this.order_quantity);
        arrayList.add("order_currency_code=" + Internal.sanitize(this.order_currency_code));
        arrayList.add("avg_executed_price=" + this.avg_executed_price);
        arrayList.add("total_notional_amount=" + this.total_notional_amount);
        arrayList.add("margin_mode=" + this.margin_mode);
        arrayList.add("leverage=" + this.leverage);
        arrayList.add("take_profit=" + this.take_profit);
        arrayList.add("stop_loss=" + this.stop_loss);
        arrayList.add("fees=" + this.fees);
        arrayList.add("status=" + this.status);
        arrayList.add("executed_notional=" + this.executed_notional);
        arrayList.add("executed_quantity=" + this.executed_quantity);
        arrayList.add("is_liquidation_order=" + this.is_liquidation_order);
        arrayList.add("is_close_position_order=" + this.is_close_position_order);
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerpetualsOrderContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PerpetualsOrderContext copy$default(PerpetualsOrderContext perpetualsOrderContext, String str, String str2, PerpetualsOrderType perpetualsOrderType, PerpetualsOrderSide perpetualsOrderSide, double d, double d2, double d3, double d4, TimeInForce timeInForce, String str3, double d5, String str4, double d6, double d7, MarginMode marginMode, int i, double d8, double d9, double d10, OrderStatus orderStatus, double d11, double d12, boolean z, boolean z2, String str5, ByteString byteString, int i2, Object obj) {
        String str6 = (i2 & 1) != 0 ? perpetualsOrderContext.order_id : str;
        String str7 = (i2 & 2) != 0 ? perpetualsOrderContext.contract_id : str2;
        PerpetualsOrderType perpetualsOrderType2 = (i2 & 4) != 0 ? perpetualsOrderContext.order_type : perpetualsOrderType;
        PerpetualsOrderSide perpetualsOrderSide2 = (i2 & 8) != 0 ? perpetualsOrderContext.order_side : perpetualsOrderSide;
        double d13 = (i2 & 16) != 0 ? perpetualsOrderContext.bid_price : d;
        double d14 = (i2 & 32) != 0 ? perpetualsOrderContext.ask_price : d2;
        double d15 = (i2 & 64) != 0 ? perpetualsOrderContext.limit_price : d3;
        double d16 = (i2 & 128) != 0 ? perpetualsOrderContext.stop_price : d4;
        TimeInForce timeInForce2 = (i2 & 256) != 0 ? perpetualsOrderContext.time_in_force : timeInForce;
        String str8 = (i2 & 512) != 0 ? perpetualsOrderContext.quote_currency_code : str3;
        String str9 = str6;
        String str10 = str7;
        double d17 = (i2 & 1024) != 0 ? perpetualsOrderContext.order_quantity : d5;
        String str11 = (i2 & 2048) != 0 ? perpetualsOrderContext.order_currency_code : str4;
        double d18 = (i2 & 4096) != 0 ? perpetualsOrderContext.avg_executed_price : d6;
        double d19 = (i2 & 8192) != 0 ? perpetualsOrderContext.total_notional_amount : d7;
        MarginMode marginMode2 = (i2 & 16384) != 0 ? perpetualsOrderContext.margin_mode : marginMode;
        return perpetualsOrderContext.copy(str9, str10, perpetualsOrderType2, perpetualsOrderSide2, d13, d14, d15, d16, timeInForce2, str8, d17, str11, d18, d19, marginMode2, (32768 & i2) != 0 ? perpetualsOrderContext.leverage : i, (i2 & 65536) != 0 ? perpetualsOrderContext.take_profit : d8, (i2 & 131072) != 0 ? perpetualsOrderContext.stop_loss : d9, (i2 & 262144) != 0 ? perpetualsOrderContext.fees : d10, (i2 & 524288) != 0 ? perpetualsOrderContext.status : orderStatus, (i2 & 1048576) != 0 ? perpetualsOrderContext.executed_notional : d11, (i2 & 2097152) != 0 ? perpetualsOrderContext.executed_quantity : d12, (i2 & 4194304) != 0 ? perpetualsOrderContext.is_liquidation_order : z, (i2 & 8388608) != 0 ? perpetualsOrderContext.is_close_position_order : z2, (i2 & 16777216) != 0 ? perpetualsOrderContext.ref_id : str5, (i2 & 33554432) != 0 ? perpetualsOrderContext.unknownFields() : byteString);
    }

    public final PerpetualsOrderContext copy(String order_id, String contract_id, PerpetualsOrderType order_type, PerpetualsOrderSide order_side, double bid_price, double ask_price, double limit_price, double stop_price, TimeInForce time_in_force, String quote_currency_code, double order_quantity, String order_currency_code, double avg_executed_price, double total_notional_amount, MarginMode margin_mode, int leverage, double take_profit, double stop_loss, double fees, OrderStatus status, double executed_notional, double executed_quantity, boolean is_liquidation_order, boolean is_close_position_order, String ref_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(order_currency_code, "order_currency_code");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PerpetualsOrderContext(order_id, contract_id, order_type, order_side, bid_price, ask_price, limit_price, stop_price, time_in_force, quote_currency_code, order_quantity, order_currency_code, avg_executed_price, total_notional_amount, margin_mode, leverage, take_profit, stop_loss, fees, status, executed_notional, executed_quantity, is_liquidation_order, is_close_position_order, ref_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerpetualsOrderContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PerpetualsOrderContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PerpetualsOrderContext value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getContract_id());
                }
                if (value.getOrder_type() != PerpetualsOrderContext.PerpetualsOrderType.ORDER_TYPE_UNSPECIFIED) {
                    size += PerpetualsOrderContext.PerpetualsOrderType.ADAPTER.encodedSizeWithTag(3, value.getOrder_type());
                }
                if (value.getOrder_side() != PerpetualsOrderContext.PerpetualsOrderSide.ORDER_SIDE_UNSPECIFIED) {
                    size += PerpetualsOrderContext.PerpetualsOrderSide.ADAPTER.encodedSizeWithTag(4, value.getOrder_side());
                }
                if (!Double.valueOf(value.getBid_price()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(5, Double.valueOf(value.getBid_price()));
                }
                if (!Double.valueOf(value.getAsk_price()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getAsk_price()));
                }
                if (!Double.valueOf(value.getLimit_price()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getLimit_price()));
                }
                if (!Double.valueOf(value.getStop_price()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(8, Double.valueOf(value.getStop_price()));
                }
                if (value.getTime_in_force() != PerpetualsOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    size += PerpetualsOrderContext.TimeInForce.ADAPTER.encodedSizeWithTag(9, value.getTime_in_force());
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getQuote_currency_code());
                }
                if (!Double.valueOf(value.getOrder_quantity()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(11, Double.valueOf(value.getOrder_quantity()));
                }
                if (!Intrinsics.areEqual(value.getOrder_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getOrder_currency_code());
                }
                if (!Double.valueOf(value.getAvg_executed_price()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(13, Double.valueOf(value.getAvg_executed_price()));
                }
                if (!Double.valueOf(value.getTotal_notional_amount()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(14, Double.valueOf(value.getTotal_notional_amount()));
                }
                if (value.getMargin_mode() != PerpetualsOrderContext.MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    size += PerpetualsOrderContext.MarginMode.ADAPTER.encodedSizeWithTag(15, value.getMargin_mode());
                }
                if (value.getLeverage() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(16, Integer.valueOf(value.getLeverage()));
                }
                if (!Double.valueOf(value.getTake_profit()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(17, Double.valueOf(value.getTake_profit()));
                }
                if (!Double.valueOf(value.getStop_loss()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(18, Double.valueOf(value.getStop_loss()));
                }
                if (!Double.valueOf(value.getFees()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(19, Double.valueOf(value.getFees()));
                }
                if (value.getStatus() != PerpetualsOrderContext.OrderStatus.ORDER_STATUS_UNSPECIFIED) {
                    size += PerpetualsOrderContext.OrderStatus.ADAPTER.encodedSizeWithTag(20, value.getStatus());
                }
                if (!Double.valueOf(value.getExecuted_notional()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(21, Double.valueOf(value.getExecuted_notional()));
                }
                if (!Double.valueOf(value.getExecuted_quantity()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(22, Double.valueOf(value.getExecuted_quantity()));
                }
                if (value.getIs_liquidation_order()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(23, java.lang.Boolean.valueOf(value.getIs_liquidation_order()));
                }
                if (value.getIs_close_position_order()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(24, java.lang.Boolean.valueOf(value.getIs_close_position_order()));
                }
                return !Intrinsics.areEqual(value.getRef_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(25, value.getRef_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PerpetualsOrderContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContract_id());
                }
                if (value.getOrder_type() != PerpetualsOrderContext.PerpetualsOrderType.ORDER_TYPE_UNSPECIFIED) {
                    PerpetualsOrderContext.PerpetualsOrderType.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_type());
                }
                if (value.getOrder_side() != PerpetualsOrderContext.PerpetualsOrderSide.ORDER_SIDE_UNSPECIFIED) {
                    PerpetualsOrderContext.PerpetualsOrderSide.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_side());
                }
                if (!Double.valueOf(value.getBid_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getBid_price()));
                }
                if (!Double.valueOf(value.getAsk_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getAsk_price()));
                }
                if (!Double.valueOf(value.getLimit_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getLimit_price()));
                }
                if (!Double.valueOf(value.getStop_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getStop_price()));
                }
                if (value.getTime_in_force() != PerpetualsOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    PerpetualsOrderContext.TimeInForce.ADAPTER.encodeWithTag(writer, 9, (int) value.getTime_in_force());
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getQuote_currency_code());
                }
                if (!Double.valueOf(value.getOrder_quantity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 11, (int) Double.valueOf(value.getOrder_quantity()));
                }
                if (!Intrinsics.areEqual(value.getOrder_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getOrder_currency_code());
                }
                if (!Double.valueOf(value.getAvg_executed_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 13, (int) Double.valueOf(value.getAvg_executed_price()));
                }
                if (!Double.valueOf(value.getTotal_notional_amount()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 14, (int) Double.valueOf(value.getTotal_notional_amount()));
                }
                if (value.getMargin_mode() != PerpetualsOrderContext.MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    PerpetualsOrderContext.MarginMode.ADAPTER.encodeWithTag(writer, 15, (int) value.getMargin_mode());
                }
                if (value.getLeverage() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 16, (int) Integer.valueOf(value.getLeverage()));
                }
                if (!Double.valueOf(value.getTake_profit()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 17, (int) Double.valueOf(value.getTake_profit()));
                }
                if (!Double.valueOf(value.getStop_loss()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 18, (int) Double.valueOf(value.getStop_loss()));
                }
                if (!Double.valueOf(value.getFees()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 19, (int) Double.valueOf(value.getFees()));
                }
                if (value.getStatus() != PerpetualsOrderContext.OrderStatus.ORDER_STATUS_UNSPECIFIED) {
                    PerpetualsOrderContext.OrderStatus.ADAPTER.encodeWithTag(writer, 20, (int) value.getStatus());
                }
                if (!Double.valueOf(value.getExecuted_notional()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 21, (int) Double.valueOf(value.getExecuted_notional()));
                }
                if (!Double.valueOf(value.getExecuted_quantity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 22, (int) Double.valueOf(value.getExecuted_quantity()));
                }
                if (value.getIs_liquidation_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 23, (int) java.lang.Boolean.valueOf(value.getIs_liquidation_order()));
                }
                if (value.getIs_close_position_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 24, (int) java.lang.Boolean.valueOf(value.getIs_close_position_order()));
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 25, (int) value.getRef_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PerpetualsOrderContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 25, (int) value.getRef_id());
                }
                if (value.getIs_close_position_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 24, (int) java.lang.Boolean.valueOf(value.getIs_close_position_order()));
                }
                if (value.getIs_liquidation_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 23, (int) java.lang.Boolean.valueOf(value.getIs_liquidation_order()));
                }
                if (!Double.valueOf(value.getExecuted_quantity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 22, (int) Double.valueOf(value.getExecuted_quantity()));
                }
                if (!Double.valueOf(value.getExecuted_notional()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 21, (int) Double.valueOf(value.getExecuted_notional()));
                }
                if (value.getStatus() != PerpetualsOrderContext.OrderStatus.ORDER_STATUS_UNSPECIFIED) {
                    PerpetualsOrderContext.OrderStatus.ADAPTER.encodeWithTag(writer, 20, (int) value.getStatus());
                }
                if (!Double.valueOf(value.getFees()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 19, (int) Double.valueOf(value.getFees()));
                }
                if (!Double.valueOf(value.getStop_loss()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 18, (int) Double.valueOf(value.getStop_loss()));
                }
                if (!Double.valueOf(value.getTake_profit()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 17, (int) Double.valueOf(value.getTake_profit()));
                }
                if (value.getLeverage() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 16, (int) Integer.valueOf(value.getLeverage()));
                }
                if (value.getMargin_mode() != PerpetualsOrderContext.MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    PerpetualsOrderContext.MarginMode.ADAPTER.encodeWithTag(writer, 15, (int) value.getMargin_mode());
                }
                if (!Double.valueOf(value.getTotal_notional_amount()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 14, (int) Double.valueOf(value.getTotal_notional_amount()));
                }
                if (!Double.valueOf(value.getAvg_executed_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 13, (int) Double.valueOf(value.getAvg_executed_price()));
                }
                if (!Intrinsics.areEqual(value.getOrder_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getOrder_currency_code());
                }
                if (!Double.valueOf(value.getOrder_quantity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 11, (int) Double.valueOf(value.getOrder_quantity()));
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getQuote_currency_code());
                }
                if (value.getTime_in_force() != PerpetualsOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    PerpetualsOrderContext.TimeInForce.ADAPTER.encodeWithTag(writer, 9, (int) value.getTime_in_force());
                }
                if (!Double.valueOf(value.getStop_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getStop_price()));
                }
                if (!Double.valueOf(value.getLimit_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getLimit_price()));
                }
                if (!Double.valueOf(value.getAsk_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getAsk_price()));
                }
                if (!Double.valueOf(value.getBid_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getBid_price()));
                }
                if (value.getOrder_side() != PerpetualsOrderContext.PerpetualsOrderSide.ORDER_SIDE_UNSPECIFIED) {
                    PerpetualsOrderContext.PerpetualsOrderSide.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_side());
                }
                if (value.getOrder_type() != PerpetualsOrderContext.PerpetualsOrderType.ORDER_TYPE_UNSPECIFIED) {
                    PerpetualsOrderContext.PerpetualsOrderType.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_type());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContract_id());
                }
                if (Intrinsics.areEqual(value.getOrder_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PerpetualsOrderContext decode(ProtoReader reader) throws IOException {
                PerpetualsOrderContext.PerpetualsOrderType perpetualsOrderType;
                PerpetualsOrderContext.PerpetualsOrderSide perpetualsOrderSide;
                PerpetualsOrderContext.TimeInForce timeInForce;
                Intrinsics.checkNotNullParameter(reader, "reader");
                PerpetualsOrderContext.PerpetualsOrderType perpetualsOrderType2 = PerpetualsOrderContext.PerpetualsOrderType.ORDER_TYPE_UNSPECIFIED;
                PerpetualsOrderContext.PerpetualsOrderSide perpetualsOrderSide2 = PerpetualsOrderContext.PerpetualsOrderSide.ORDER_SIDE_UNSPECIFIED;
                PerpetualsOrderContext.TimeInForce timeInForce2 = PerpetualsOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                PerpetualsOrderContext.MarginMode marginMode = PerpetualsOrderContext.MarginMode.MARGIN_MODE_UNSPECIFIED;
                PerpetualsOrderContext.OrderStatus orderStatus = PerpetualsOrderContext.OrderStatus.ORDER_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                double dDoubleValue4 = 0.0d;
                double dDoubleValue5 = 0.0d;
                double dDoubleValue6 = 0.0d;
                double dDoubleValue7 = 0.0d;
                double dDoubleValue8 = 0.0d;
                double dDoubleValue9 = 0.0d;
                double dDoubleValue10 = 0.0d;
                double dDoubleValue11 = 0.0d;
                double dDoubleValue12 = 0.0d;
                int iIntValue = 0;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                PerpetualsOrderContext.OrderStatus orderStatusDecode = orderStatus;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                PerpetualsOrderContext.MarginMode marginModeDecode = marginMode;
                PerpetualsOrderContext.TimeInForce timeInForceDecode = timeInForce2;
                PerpetualsOrderContext.PerpetualsOrderSide perpetualsOrderSideDecode = perpetualsOrderSide2;
                PerpetualsOrderContext.PerpetualsOrderType perpetualsOrderTypeDecode = perpetualsOrderType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                timeInForce = timeInForceDecode;
                                try {
                                    perpetualsOrderTypeDecode = PerpetualsOrderContext.PerpetualsOrderType.ADAPTER.decode(reader);
                                    timeInForceDecode = timeInForce;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 4:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                timeInForce = timeInForceDecode;
                                try {
                                    perpetualsOrderSideDecode = PerpetualsOrderContext.PerpetualsOrderSide.ADAPTER.decode(reader);
                                    timeInForceDecode = timeInForce;
                                    perpetualsOrderTypeDecode = perpetualsOrderType;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 5:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 6:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 7:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 8:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 9:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                timeInForce = timeInForceDecode;
                                try {
                                    timeInForceDecode = PerpetualsOrderContext.TimeInForce.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 10:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue5 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 12:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue6 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 14:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue7 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 15:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                try {
                                    marginModeDecode = PerpetualsOrderContext.MarginMode.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    timeInForce = timeInForceDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 16:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 17:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue8 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 18:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue9 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 19:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue10 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 20:
                                try {
                                    orderStatusDecode = PerpetualsOrderContext.OrderStatus.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    perpetualsOrderType = perpetualsOrderTypeDecode;
                                    perpetualsOrderSide = perpetualsOrderSideDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                            case 21:
                                dDoubleValue11 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 22:
                                dDoubleValue12 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 23:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 24:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 25:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                timeInForce = timeInForceDecode;
                                timeInForceDecode = timeInForce;
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                        }
                    } else {
                        return new PerpetualsOrderContext(strDecode3, strDecode4, perpetualsOrderTypeDecode, perpetualsOrderSideDecode, dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, timeInForceDecode, strDecode5, dDoubleValue5, strDecode, dDoubleValue6, dDoubleValue7, marginModeDecode, iIntValue, dDoubleValue8, dDoubleValue9, dDoubleValue10, orderStatusDecode, dDoubleValue11, dDoubleValue12, zBooleanValue, zBooleanValue2, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PerpetualsOrderContext redact(PerpetualsOrderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PerpetualsOrderContext.copy$default(value, null, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0.0d, 0.0d, 0.0d, null, 0.0d, 0.0d, false, false, null, ByteString.EMPTY, 33554431, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualsOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_TYPE_UNSPECIFIED", "MARKET", "LIMIT", "STOP", "TAKE_PROFIT", "STOP_LOSS", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PerpetualsOrderType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PerpetualsOrderType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<PerpetualsOrderType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PerpetualsOrderType LIMIT;
        public static final PerpetualsOrderType MARKET;
        public static final PerpetualsOrderType ORDER_TYPE_UNSPECIFIED;
        public static final PerpetualsOrderType STOP;
        public static final PerpetualsOrderType STOP_LOSS;
        public static final PerpetualsOrderType TAKE_PROFIT;
        private final int value;

        private static final /* synthetic */ PerpetualsOrderType[] $values() {
            return new PerpetualsOrderType[]{ORDER_TYPE_UNSPECIFIED, MARKET, LIMIT, STOP, TAKE_PROFIT, STOP_LOSS};
        }

        @JvmStatic
        public static final PerpetualsOrderType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<PerpetualsOrderType> getEntries() {
            return $ENTRIES;
        }

        private PerpetualsOrderType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final PerpetualsOrderType perpetualsOrderType = new PerpetualsOrderType("ORDER_TYPE_UNSPECIFIED", 0, 0);
            ORDER_TYPE_UNSPECIFIED = perpetualsOrderType;
            MARKET = new PerpetualsOrderType("MARKET", 1, 1);
            LIMIT = new PerpetualsOrderType("LIMIT", 2, 2);
            STOP = new PerpetualsOrderType("STOP", 3, 3);
            TAKE_PROFIT = new PerpetualsOrderType("TAKE_PROFIT", 4, 4);
            STOP_LOSS = new PerpetualsOrderType("STOP_LOSS", 5, 5);
            PerpetualsOrderType[] perpetualsOrderTypeArr$values = $values();
            $VALUES = perpetualsOrderTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(perpetualsOrderTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerpetualsOrderType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<PerpetualsOrderType>(orCreateKotlinClass, syntax, perpetualsOrderType) { // from class: com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$PerpetualsOrderType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerpetualsOrderContext.PerpetualsOrderType fromValue(int value) {
                    return PerpetualsOrderContext.PerpetualsOrderType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerpetualsOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final PerpetualsOrderType fromValue(int value) {
                if (value == 0) {
                    return PerpetualsOrderType.ORDER_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return PerpetualsOrderType.MARKET;
                }
                if (value == 2) {
                    return PerpetualsOrderType.LIMIT;
                }
                if (value == 3) {
                    return PerpetualsOrderType.STOP;
                }
                if (value == 4) {
                    return PerpetualsOrderType.TAKE_PROFIT;
                }
                if (value != 5) {
                    return null;
                }
                return PerpetualsOrderType.STOP_LOSS;
            }
        }

        public static PerpetualsOrderType valueOf(String str) {
            return (PerpetualsOrderType) Enum.valueOf(PerpetualsOrderType.class, str);
        }

        public static PerpetualsOrderType[] values() {
            return (PerpetualsOrderType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualsOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderSide;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_SIDE_UNSPECIFIED", "LONG", "SHORT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PerpetualsOrderSide implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PerpetualsOrderSide[] $VALUES;

        @JvmField
        public static final ProtoAdapter<PerpetualsOrderSide> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PerpetualsOrderSide LONG;
        public static final PerpetualsOrderSide ORDER_SIDE_UNSPECIFIED;
        public static final PerpetualsOrderSide SHORT;
        private final int value;

        private static final /* synthetic */ PerpetualsOrderSide[] $values() {
            return new PerpetualsOrderSide[]{ORDER_SIDE_UNSPECIFIED, LONG, SHORT};
        }

        @JvmStatic
        public static final PerpetualsOrderSide fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<PerpetualsOrderSide> getEntries() {
            return $ENTRIES;
        }

        private PerpetualsOrderSide(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final PerpetualsOrderSide perpetualsOrderSide = new PerpetualsOrderSide("ORDER_SIDE_UNSPECIFIED", 0, 0);
            ORDER_SIDE_UNSPECIFIED = perpetualsOrderSide;
            LONG = new PerpetualsOrderSide("LONG", 1, 1);
            SHORT = new PerpetualsOrderSide("SHORT", 2, 2);
            PerpetualsOrderSide[] perpetualsOrderSideArr$values = $values();
            $VALUES = perpetualsOrderSideArr$values;
            $ENTRIES = EnumEntries2.enumEntries(perpetualsOrderSideArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerpetualsOrderSide.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<PerpetualsOrderSide>(orCreateKotlinClass, syntax, perpetualsOrderSide) { // from class: com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$PerpetualsOrderSide$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerpetualsOrderContext.PerpetualsOrderSide fromValue(int value) {
                    return PerpetualsOrderContext.PerpetualsOrderSide.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerpetualsOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderSide$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderSide;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final PerpetualsOrderSide fromValue(int value) {
                if (value == 0) {
                    return PerpetualsOrderSide.ORDER_SIDE_UNSPECIFIED;
                }
                if (value == 1) {
                    return PerpetualsOrderSide.LONG;
                }
                if (value != 2) {
                    return null;
                }
                return PerpetualsOrderSide.SHORT;
            }
        }

        public static PerpetualsOrderSide valueOf(String str) {
            return (PerpetualsOrderSide) Enum.valueOf(PerpetualsOrderSide.class, str);
        }

        public static PerpetualsOrderSide[] values() {
            return (PerpetualsOrderSide[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualsOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TIME_IN_FORCE_UNSPECIFIED", "GTC", "IOC", "FOK", "DAY", "GFD", "GFW", "GFM", "OPG", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TimeInForce implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TimeInForce[] $VALUES;

        @JvmField
        public static final ProtoAdapter<TimeInForce> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TimeInForce DAY;
        public static final TimeInForce FOK;
        public static final TimeInForce GFD;
        public static final TimeInForce GFM;
        public static final TimeInForce GFW;
        public static final TimeInForce GTC;
        public static final TimeInForce IOC;
        public static final TimeInForce OPG;
        public static final TimeInForce TIME_IN_FORCE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ TimeInForce[] $values() {
            return new TimeInForce[]{TIME_IN_FORCE_UNSPECIFIED, GTC, IOC, FOK, DAY, GFD, GFW, GFM, OPG};
        }

        @JvmStatic
        public static final TimeInForce fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<TimeInForce> getEntries() {
            return $ENTRIES;
        }

        private TimeInForce(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final TimeInForce timeInForce = new TimeInForce("TIME_IN_FORCE_UNSPECIFIED", 0, 0);
            TIME_IN_FORCE_UNSPECIFIED = timeInForce;
            GTC = new TimeInForce("GTC", 1, 1);
            IOC = new TimeInForce("IOC", 2, 2);
            FOK = new TimeInForce("FOK", 3, 3);
            DAY = new TimeInForce("DAY", 4, 4);
            GFD = new TimeInForce("GFD", 5, 5);
            GFW = new TimeInForce("GFW", 6, 6);
            GFM = new TimeInForce("GFM", 7, 7);
            OPG = new TimeInForce("OPG", 8, 8);
            TimeInForce[] timeInForceArr$values = $values();
            $VALUES = timeInForceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(timeInForceArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TimeInForce.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<TimeInForce>(orCreateKotlinClass, syntax, timeInForce) { // from class: com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$TimeInForce$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerpetualsOrderContext.TimeInForce fromValue(int value) {
                    return PerpetualsOrderContext.TimeInForce.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerpetualsOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final TimeInForce fromValue(int value) {
                switch (value) {
                    case 0:
                        return TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                    case 1:
                        return TimeInForce.GTC;
                    case 2:
                        return TimeInForce.IOC;
                    case 3:
                        return TimeInForce.FOK;
                    case 4:
                        return TimeInForce.DAY;
                    case 5:
                        return TimeInForce.GFD;
                    case 6:
                        return TimeInForce.GFW;
                    case 7:
                        return TimeInForce.GFM;
                    case 8:
                        return TimeInForce.OPG;
                    default:
                        return null;
                }
            }
        }

        public static TimeInForce valueOf(String str) {
            return (TimeInForce) Enum.valueOf(TimeInForce.class, str);
        }

        public static TimeInForce[] values() {
            return (TimeInForce[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualsOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$MarginMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MARGIN_MODE_UNSPECIFIED", "ISOLATED", "CROSS", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MarginMode implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MarginMode[] $VALUES;

        @JvmField
        public static final ProtoAdapter<MarginMode> ADAPTER;
        public static final MarginMode CROSS;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final MarginMode ISOLATED;
        public static final MarginMode MARGIN_MODE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ MarginMode[] $values() {
            return new MarginMode[]{MARGIN_MODE_UNSPECIFIED, ISOLATED, CROSS};
        }

        @JvmStatic
        public static final MarginMode fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<MarginMode> getEntries() {
            return $ENTRIES;
        }

        private MarginMode(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final MarginMode marginMode = new MarginMode("MARGIN_MODE_UNSPECIFIED", 0, 0);
            MARGIN_MODE_UNSPECIFIED = marginMode;
            ISOLATED = new MarginMode("ISOLATED", 1, 1);
            CROSS = new MarginMode("CROSS", 2, 2);
            MarginMode[] marginModeArr$values = $values();
            $VALUES = marginModeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(marginModeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginMode.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<MarginMode>(orCreateKotlinClass, syntax, marginMode) { // from class: com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$MarginMode$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerpetualsOrderContext.MarginMode fromValue(int value) {
                    return PerpetualsOrderContext.MarginMode.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerpetualsOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$MarginMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$MarginMode;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final MarginMode fromValue(int value) {
                if (value == 0) {
                    return MarginMode.MARGIN_MODE_UNSPECIFIED;
                }
                if (value == 1) {
                    return MarginMode.ISOLATED;
                }
                if (value != 2) {
                    return null;
                }
                return MarginMode.CROSS;
            }
        }

        public static MarginMode valueOf(String str) {
            return (MarginMode) Enum.valueOf(MarginMode.class, str);
        }

        public static MarginMode[] values() {
            return (MarginMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualsOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_STATUS_UNSPECIFIED", "CANCELED", "CONFIRMED", "FAILED", "FILLED", "NEW", "PARTIALLY_FILLED", "REJECTED", "UNCONFIRMED", "VOIDED", "EXPIRED", "PENDING", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OrderStatus> ADAPTER;
        public static final OrderStatus CANCELED;
        public static final OrderStatus CONFIRMED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderStatus EXPIRED;
        public static final OrderStatus FAILED;
        public static final OrderStatus FILLED;
        public static final OrderStatus NEW;
        public static final OrderStatus ORDER_STATUS_UNSPECIFIED;
        public static final OrderStatus PARTIALLY_FILLED;
        public static final OrderStatus PENDING;
        public static final OrderStatus REJECTED;
        public static final OrderStatus UNCONFIRMED;
        public static final OrderStatus VOIDED;
        private final int value;

        private static final /* synthetic */ OrderStatus[] $values() {
            return new OrderStatus[]{ORDER_STATUS_UNSPECIFIED, CANCELED, CONFIRMED, FAILED, FILLED, NEW, PARTIALLY_FILLED, REJECTED, UNCONFIRMED, VOIDED, EXPIRED, PENDING};
        }

        @JvmStatic
        public static final OrderStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OrderStatus> getEntries() {
            return $ENTRIES;
        }

        private OrderStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OrderStatus orderStatus = new OrderStatus("ORDER_STATUS_UNSPECIFIED", 0, 0);
            ORDER_STATUS_UNSPECIFIED = orderStatus;
            CANCELED = new OrderStatus("CANCELED", 1, 1);
            CONFIRMED = new OrderStatus("CONFIRMED", 2, 2);
            FAILED = new OrderStatus("FAILED", 3, 3);
            FILLED = new OrderStatus("FILLED", 4, 4);
            NEW = new OrderStatus("NEW", 5, 5);
            PARTIALLY_FILLED = new OrderStatus("PARTIALLY_FILLED", 6, 6);
            REJECTED = new OrderStatus("REJECTED", 7, 7);
            UNCONFIRMED = new OrderStatus("UNCONFIRMED", 8, 8);
            VOIDED = new OrderStatus("VOIDED", 9, 9);
            EXPIRED = new OrderStatus("EXPIRED", 10, 10);
            PENDING = new OrderStatus("PENDING", 11, 11);
            OrderStatus[] orderStatusArr$values = $values();
            $VALUES = orderStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OrderStatus>(orCreateKotlinClass, syntax, orderStatus) { // from class: com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$OrderStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PerpetualsOrderContext.OrderStatus fromValue(int value) {
                    return PerpetualsOrderContext.OrderStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PerpetualsOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OrderStatus fromValue(int value) {
                switch (value) {
                    case 0:
                        return OrderStatus.ORDER_STATUS_UNSPECIFIED;
                    case 1:
                        return OrderStatus.CANCELED;
                    case 2:
                        return OrderStatus.CONFIRMED;
                    case 3:
                        return OrderStatus.FAILED;
                    case 4:
                        return OrderStatus.FILLED;
                    case 5:
                        return OrderStatus.NEW;
                    case 6:
                        return OrderStatus.PARTIALLY_FILLED;
                    case 7:
                        return OrderStatus.REJECTED;
                    case 8:
                        return OrderStatus.UNCONFIRMED;
                    case 9:
                        return OrderStatus.VOIDED;
                    case 10:
                        return OrderStatus.EXPIRED;
                    case 11:
                        return OrderStatus.PENDING;
                    default:
                        return null;
                }
            }
        }

        public static OrderStatus valueOf(String str) {
            return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
        }

        public static OrderStatus[] values() {
            return (OrderStatus[]) $VALUES.clone();
        }
    }
}

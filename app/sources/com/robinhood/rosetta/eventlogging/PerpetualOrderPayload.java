package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.rosetta.eventlogging.PerpetualsOrderContext;
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

/* compiled from: PerpetualOrderPayload.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 R2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001RB\u0095\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\f\u0012\b\b\u0002\u0010!\u001a\u00020\f\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010%\u001a\u00020\u0004\u0012\b\b\u0002\u0010&\u001a\u00020'¢\u0006\u0004\b(\u0010)J\b\u0010K\u001a\u00020\u0002H\u0017J\u0013\u0010L\u001a\u00020#2\b\u0010M\u001a\u0004\u0018\u00010NH\u0096\u0002J\b\u0010O\u001a\u00020\u001aH\u0016J\b\u0010P\u001a\u00020\u0004H\u0016J\u0094\u0002\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020'R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0016\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0016\u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0016\u0010\u0015\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0016\u0010\u0016\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00103R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010\u001b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00103R\u0016\u0010\u001c\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00103R\u0016\u0010\u001d\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00103R\u0016\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0016\u0010 \u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00103R\u0016\u0010!\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00103R\u0016\u0010\"\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010IR\u0016\u0010$\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010IR\u0016\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010+¨\u0006S"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualOrderPayload;", "Lcom/squareup/wire/Message;", "", "ref_id", "", "account_id", "contract_id", "order_type", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;", "order_side", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderSide;", BidAskDetails3.BID_PRICE, "", BidAskDetails3.ASK_PRICE, "limit_price", "stop_price", "time_in_force", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "quote_currency_code", "order_quantity", "order_currency_code", "avg_executed_price", "total_notional_amount", "margin_mode", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$MarginMode;", "leverage", "", "take_profit", "stop_loss", "fees", "status", "Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "executed_notional", "executed_quantity", "is_liquidation_order", "", "is_close_position_order", "masked_ref_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderSide;DDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;Ljava/lang/String;DLjava/lang/String;DDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$MarginMode;IDDDLcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;DDZZLjava/lang/String;Lokio/ByteString;)V", "getRef_id", "()Ljava/lang/String;", "getAccount_id", "getContract_id", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderType;", "getOrder_side", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$PerpetualsOrderSide;", "getBid_price", "()D", "getAsk_price", "getLimit_price", "getStop_price", "getTime_in_force", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$TimeInForce;", "getQuote_currency_code", "getOrder_quantity", "getOrder_currency_code", "getAvg_executed_price", "getTotal_notional_amount", "getMargin_mode", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$MarginMode;", "getLeverage", "()I", "getTake_profit", "getStop_loss", "getFees", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/PerpetualsOrderContext$OrderStatus;", "getExecuted_notional", "getExecuted_quantity", "()Z", "getMasked_ref_id", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PerpetualOrderPayload extends Message {

    @JvmField
    public static final ProtoAdapter<PerpetualOrderPayload> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final double ask_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "avgExecutedPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final double avg_executed_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double bid_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "executedNotional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final double executed_notional;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "executedQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final double executed_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final double fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isClosePositionOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final boolean is_close_position_order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isLiquidationOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final boolean is_liquidation_order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final int leverage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "limitPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final double limit_price;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$MarginMode#ADAPTER", jsonName = "marginMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final PerpetualsOrderContext.MarginMode margin_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedRefId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 1001)
    private final String masked_ref_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String order_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "orderQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final double order_quantity;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$PerpetualsOrderSide#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final PerpetualsOrderContext.PerpetualsOrderSide order_side;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$PerpetualsOrderType#ADAPTER", jsonName = "orderType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final PerpetualsOrderContext.PerpetualsOrderType order_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String quote_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ref_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$OrderStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final PerpetualsOrderContext.OrderStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "stopLoss", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final double stop_loss;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "stopPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final double stop_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "takeProfit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final double take_profit;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualsOrderContext$TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final PerpetualsOrderContext.TimeInForce time_in_force;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "totalNotionalAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final double total_notional_amount;

    public PerpetualOrderPayload() {
        this(null, null, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0.0d, 0.0d, 0.0d, null, 0.0d, 0.0d, false, false, null, null, 134217727, null);
    }

    public /* synthetic */ PerpetualOrderPayload(String str, String str2, String str3, PerpetualsOrderContext.PerpetualsOrderType perpetualsOrderType, PerpetualsOrderContext.PerpetualsOrderSide perpetualsOrderSide, double d, double d2, double d3, double d4, PerpetualsOrderContext.TimeInForce timeInForce, String str4, double d5, String str5, double d6, double d7, PerpetualsOrderContext.MarginMode marginMode, int i, double d8, double d9, double d10, PerpetualsOrderContext.OrderStatus orderStatus, double d11, double d12, boolean z, boolean z2, String str6, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? PerpetualsOrderContext.PerpetualsOrderType.ORDER_TYPE_UNSPECIFIED : perpetualsOrderType, (i2 & 16) != 0 ? PerpetualsOrderContext.PerpetualsOrderSide.ORDER_SIDE_UNSPECIFIED : perpetualsOrderSide, (i2 & 32) != 0 ? 0.0d : d, (i2 & 64) != 0 ? 0.0d : d2, (i2 & 128) != 0 ? 0.0d : d3, (i2 & 256) != 0 ? 0.0d : d4, (i2 & 512) != 0 ? PerpetualsOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i2 & 1024) != 0 ? "" : str4, (i2 & 2048) != 0 ? 0.0d : d5, (i2 & 4096) != 0 ? "" : str5, (i2 & 8192) != 0 ? 0.0d : d6, (i2 & 16384) != 0 ? 0.0d : d7, (32768 & i2) != 0 ? PerpetualsOrderContext.MarginMode.MARGIN_MODE_UNSPECIFIED : marginMode, (i2 & 65536) != 0 ? 0 : i, (i2 & 131072) != 0 ? 0.0d : d8, (i2 & 262144) != 0 ? 0.0d : d9, (i2 & 524288) != 0 ? 0.0d : d10, (i2 & 1048576) != 0 ? PerpetualsOrderContext.OrderStatus.ORDER_STATUS_UNSPECIFIED : orderStatus, (i2 & 2097152) != 0 ? 0.0d : d11, (i2 & 4194304) != 0 ? 0.0d : d12, (i2 & 8388608) != 0 ? false : z, (i2 & 16777216) == 0 ? z2 : false, (i2 & 33554432) == 0 ? str6 : "", (i2 & 67108864) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24492newBuilder();
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final PerpetualsOrderContext.PerpetualsOrderType getOrder_type() {
        return this.order_type;
    }

    public final PerpetualsOrderContext.PerpetualsOrderSide getOrder_side() {
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

    public final PerpetualsOrderContext.TimeInForce getTime_in_force() {
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

    public final PerpetualsOrderContext.MarginMode getMargin_mode() {
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

    public final PerpetualsOrderContext.OrderStatus getStatus() {
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

    public final String getMasked_ref_id() {
        return this.masked_ref_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualOrderPayload(String ref_id, String account_id, String contract_id, PerpetualsOrderContext.PerpetualsOrderType order_type, PerpetualsOrderContext.PerpetualsOrderSide order_side, double d, double d2, double d3, double d4, PerpetualsOrderContext.TimeInForce time_in_force, String quote_currency_code, double d5, String order_currency_code, double d6, double d7, PerpetualsOrderContext.MarginMode margin_mode, int i, double d8, double d9, double d10, PerpetualsOrderContext.OrderStatus status, double d11, double d12, boolean z, boolean z2, String masked_ref_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(order_currency_code, "order_currency_code");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(masked_ref_id, "masked_ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ref_id = ref_id;
        this.account_id = account_id;
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
        this.masked_ref_id = masked_ref_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24492newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PerpetualOrderPayload)) {
            return false;
        }
        PerpetualOrderPayload perpetualOrderPayload = (PerpetualOrderPayload) other;
        return Intrinsics.areEqual(unknownFields(), perpetualOrderPayload.unknownFields()) && Intrinsics.areEqual(this.ref_id, perpetualOrderPayload.ref_id) && Intrinsics.areEqual(this.account_id, perpetualOrderPayload.account_id) && Intrinsics.areEqual(this.contract_id, perpetualOrderPayload.contract_id) && this.order_type == perpetualOrderPayload.order_type && this.order_side == perpetualOrderPayload.order_side && this.bid_price == perpetualOrderPayload.bid_price && this.ask_price == perpetualOrderPayload.ask_price && this.limit_price == perpetualOrderPayload.limit_price && this.stop_price == perpetualOrderPayload.stop_price && this.time_in_force == perpetualOrderPayload.time_in_force && Intrinsics.areEqual(this.quote_currency_code, perpetualOrderPayload.quote_currency_code) && this.order_quantity == perpetualOrderPayload.order_quantity && Intrinsics.areEqual(this.order_currency_code, perpetualOrderPayload.order_currency_code) && this.avg_executed_price == perpetualOrderPayload.avg_executed_price && this.total_notional_amount == perpetualOrderPayload.total_notional_amount && this.margin_mode == perpetualOrderPayload.margin_mode && this.leverage == perpetualOrderPayload.leverage && this.take_profit == perpetualOrderPayload.take_profit && this.stop_loss == perpetualOrderPayload.stop_loss && this.fees == perpetualOrderPayload.fees && this.status == perpetualOrderPayload.status && this.executed_notional == perpetualOrderPayload.executed_notional && this.executed_quantity == perpetualOrderPayload.executed_quantity && this.is_liquidation_order == perpetualOrderPayload.is_liquidation_order && this.is_close_position_order == perpetualOrderPayload.is_close_position_order && Intrinsics.areEqual(this.masked_ref_id, perpetualOrderPayload.masked_ref_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.ref_id.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.contract_id.hashCode()) * 37) + this.order_type.hashCode()) * 37) + this.order_side.hashCode()) * 37) + Double.hashCode(this.bid_price)) * 37) + Double.hashCode(this.ask_price)) * 37) + Double.hashCode(this.limit_price)) * 37) + Double.hashCode(this.stop_price)) * 37) + this.time_in_force.hashCode()) * 37) + this.quote_currency_code.hashCode()) * 37) + Double.hashCode(this.order_quantity)) * 37) + this.order_currency_code.hashCode()) * 37) + Double.hashCode(this.avg_executed_price)) * 37) + Double.hashCode(this.total_notional_amount)) * 37) + this.margin_mode.hashCode()) * 37) + Integer.hashCode(this.leverage)) * 37) + Double.hashCode(this.take_profit)) * 37) + Double.hashCode(this.stop_loss)) * 37) + Double.hashCode(this.fees)) * 37) + this.status.hashCode()) * 37) + Double.hashCode(this.executed_notional)) * 37) + Double.hashCode(this.executed_quantity)) * 37) + java.lang.Boolean.hashCode(this.is_liquidation_order)) * 37) + java.lang.Boolean.hashCode(this.is_close_position_order)) * 37) + this.masked_ref_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
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
        arrayList.add("masked_ref_id=" + Internal.sanitize(this.masked_ref_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerpetualOrderPayload{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PerpetualOrderPayload copy$default(PerpetualOrderPayload perpetualOrderPayload, String str, String str2, String str3, PerpetualsOrderContext.PerpetualsOrderType perpetualsOrderType, PerpetualsOrderContext.PerpetualsOrderSide perpetualsOrderSide, double d, double d2, double d3, double d4, PerpetualsOrderContext.TimeInForce timeInForce, String str4, double d5, String str5, double d6, double d7, PerpetualsOrderContext.MarginMode marginMode, int i, double d8, double d9, double d10, PerpetualsOrderContext.OrderStatus orderStatus, double d11, double d12, boolean z, boolean z2, String str6, ByteString byteString, int i2, Object obj) {
        String str7 = (i2 & 1) != 0 ? perpetualOrderPayload.ref_id : str;
        String str8 = (i2 & 2) != 0 ? perpetualOrderPayload.account_id : str2;
        String str9 = (i2 & 4) != 0 ? perpetualOrderPayload.contract_id : str3;
        PerpetualsOrderContext.PerpetualsOrderType perpetualsOrderType2 = (i2 & 8) != 0 ? perpetualOrderPayload.order_type : perpetualsOrderType;
        PerpetualsOrderContext.PerpetualsOrderSide perpetualsOrderSide2 = (i2 & 16) != 0 ? perpetualOrderPayload.order_side : perpetualsOrderSide;
        double d13 = (i2 & 32) != 0 ? perpetualOrderPayload.bid_price : d;
        double d14 = (i2 & 64) != 0 ? perpetualOrderPayload.ask_price : d2;
        double d15 = (i2 & 128) != 0 ? perpetualOrderPayload.limit_price : d3;
        double d16 = (i2 & 256) != 0 ? perpetualOrderPayload.stop_price : d4;
        PerpetualsOrderContext.TimeInForce timeInForce2 = (i2 & 512) != 0 ? perpetualOrderPayload.time_in_force : timeInForce;
        String str10 = str7;
        String str11 = (i2 & 1024) != 0 ? perpetualOrderPayload.quote_currency_code : str4;
        String str12 = str8;
        double d17 = (i2 & 2048) != 0 ? perpetualOrderPayload.order_quantity : d5;
        String str13 = (i2 & 4096) != 0 ? perpetualOrderPayload.order_currency_code : str5;
        double d18 = (i2 & 8192) != 0 ? perpetualOrderPayload.avg_executed_price : d6;
        double d19 = (i2 & 16384) != 0 ? perpetualOrderPayload.total_notional_amount : d7;
        PerpetualsOrderContext.MarginMode marginMode2 = (i2 & 32768) != 0 ? perpetualOrderPayload.margin_mode : marginMode;
        int i3 = (i2 & 65536) != 0 ? perpetualOrderPayload.leverage : i;
        double d20 = d19;
        double d21 = (i2 & 131072) != 0 ? perpetualOrderPayload.take_profit : d8;
        double d22 = (i2 & 262144) != 0 ? perpetualOrderPayload.stop_loss : d9;
        double d23 = (i2 & 524288) != 0 ? perpetualOrderPayload.fees : d10;
        return perpetualOrderPayload.copy(str10, str12, str9, perpetualsOrderType2, perpetualsOrderSide2, d13, d14, d15, d16, timeInForce2, str11, d17, str13, d18, d20, marginMode2, i3, d21, d22, d23, (i2 & 1048576) != 0 ? perpetualOrderPayload.status : orderStatus, (i2 & 2097152) != 0 ? perpetualOrderPayload.executed_notional : d11, (i2 & 4194304) != 0 ? perpetualOrderPayload.executed_quantity : d12, (i2 & 8388608) != 0 ? perpetualOrderPayload.is_liquidation_order : z, (i2 & 16777216) != 0 ? perpetualOrderPayload.is_close_position_order : z2, (i2 & 33554432) != 0 ? perpetualOrderPayload.masked_ref_id : str6, (i2 & 67108864) != 0 ? perpetualOrderPayload.unknownFields() : byteString);
    }

    public final PerpetualOrderPayload copy(String ref_id, String account_id, String contract_id, PerpetualsOrderContext.PerpetualsOrderType order_type, PerpetualsOrderContext.PerpetualsOrderSide order_side, double bid_price, double ask_price, double limit_price, double stop_price, PerpetualsOrderContext.TimeInForce time_in_force, String quote_currency_code, double order_quantity, String order_currency_code, double avg_executed_price, double total_notional_amount, PerpetualsOrderContext.MarginMode margin_mode, int leverage, double take_profit, double stop_loss, double fees, PerpetualsOrderContext.OrderStatus status, double executed_notional, double executed_quantity, boolean is_liquidation_order, boolean is_close_position_order, String masked_ref_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(order_currency_code, "order_currency_code");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(masked_ref_id, "masked_ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PerpetualOrderPayload(ref_id, account_id, contract_id, order_type, order_side, bid_price, ask_price, limit_price, stop_price, time_in_force, quote_currency_code, order_quantity, order_currency_code, avg_executed_price, total_notional_amount, margin_mode, leverage, take_profit, stop_loss, fees, status, executed_notional, executed_quantity, is_liquidation_order, is_close_position_order, masked_ref_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerpetualOrderPayload.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PerpetualOrderPayload>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerpetualOrderPayload$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PerpetualOrderPayload value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getContract_id());
                }
                if (value.getOrder_type() != PerpetualsOrderContext.PerpetualsOrderType.ORDER_TYPE_UNSPECIFIED) {
                    size += PerpetualsOrderContext.PerpetualsOrderType.ADAPTER.encodedSizeWithTag(4, value.getOrder_type());
                }
                if (value.getOrder_side() != PerpetualsOrderContext.PerpetualsOrderSide.ORDER_SIDE_UNSPECIFIED) {
                    size += PerpetualsOrderContext.PerpetualsOrderSide.ADAPTER.encodedSizeWithTag(5, value.getOrder_side());
                }
                if (!Double.valueOf(value.getBid_price()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getBid_price()));
                }
                if (!Double.valueOf(value.getAsk_price()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getAsk_price()));
                }
                if (!Double.valueOf(value.getLimit_price()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(8, Double.valueOf(value.getLimit_price()));
                }
                if (!Double.valueOf(value.getStop_price()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(9, Double.valueOf(value.getStop_price()));
                }
                if (value.getTime_in_force() != PerpetualsOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    size += PerpetualsOrderContext.TimeInForce.ADAPTER.encodedSizeWithTag(10, value.getTime_in_force());
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getQuote_currency_code());
                }
                if (!Double.valueOf(value.getOrder_quantity()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(12, Double.valueOf(value.getOrder_quantity()));
                }
                if (!Intrinsics.areEqual(value.getOrder_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getOrder_currency_code());
                }
                if (!Double.valueOf(value.getAvg_executed_price()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(14, Double.valueOf(value.getAvg_executed_price()));
                }
                if (!Double.valueOf(value.getTotal_notional_amount()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(15, Double.valueOf(value.getTotal_notional_amount()));
                }
                if (value.getMargin_mode() != PerpetualsOrderContext.MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    size += PerpetualsOrderContext.MarginMode.ADAPTER.encodedSizeWithTag(16, value.getMargin_mode());
                }
                if (value.getLeverage() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(17, Integer.valueOf(value.getLeverage()));
                }
                if (!Double.valueOf(value.getTake_profit()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(18, Double.valueOf(value.getTake_profit()));
                }
                if (!Double.valueOf(value.getStop_loss()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(19, Double.valueOf(value.getStop_loss()));
                }
                if (!Double.valueOf(value.getFees()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(20, Double.valueOf(value.getFees()));
                }
                if (value.getStatus() != PerpetualsOrderContext.OrderStatus.ORDER_STATUS_UNSPECIFIED) {
                    size += PerpetualsOrderContext.OrderStatus.ADAPTER.encodedSizeWithTag(21, value.getStatus());
                }
                if (!Double.valueOf(value.getExecuted_notional()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(22, Double.valueOf(value.getExecuted_notional()));
                }
                if (!Double.valueOf(value.getExecuted_quantity()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(23, Double.valueOf(value.getExecuted_quantity()));
                }
                if (value.getIs_liquidation_order()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(24, java.lang.Boolean.valueOf(value.getIs_liquidation_order()));
                }
                if (value.getIs_close_position_order()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(25, java.lang.Boolean.valueOf(value.getIs_close_position_order()));
                }
                return !Intrinsics.areEqual(value.getMasked_ref_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1001, value.getMasked_ref_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PerpetualOrderPayload value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getContract_id());
                }
                if (value.getOrder_type() != PerpetualsOrderContext.PerpetualsOrderType.ORDER_TYPE_UNSPECIFIED) {
                    PerpetualsOrderContext.PerpetualsOrderType.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_type());
                }
                if (value.getOrder_side() != PerpetualsOrderContext.PerpetualsOrderSide.ORDER_SIDE_UNSPECIFIED) {
                    PerpetualsOrderContext.PerpetualsOrderSide.ADAPTER.encodeWithTag(writer, 5, (int) value.getOrder_side());
                }
                if (!Double.valueOf(value.getBid_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getBid_price()));
                }
                if (!Double.valueOf(value.getAsk_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getAsk_price()));
                }
                if (!Double.valueOf(value.getLimit_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getLimit_price()));
                }
                if (!Double.valueOf(value.getStop_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getStop_price()));
                }
                if (value.getTime_in_force() != PerpetualsOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    PerpetualsOrderContext.TimeInForce.ADAPTER.encodeWithTag(writer, 10, (int) value.getTime_in_force());
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getQuote_currency_code());
                }
                if (!Double.valueOf(value.getOrder_quantity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 12, (int) Double.valueOf(value.getOrder_quantity()));
                }
                if (!Intrinsics.areEqual(value.getOrder_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getOrder_currency_code());
                }
                if (!Double.valueOf(value.getAvg_executed_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 14, (int) Double.valueOf(value.getAvg_executed_price()));
                }
                if (!Double.valueOf(value.getTotal_notional_amount()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 15, (int) Double.valueOf(value.getTotal_notional_amount()));
                }
                if (value.getMargin_mode() != PerpetualsOrderContext.MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    PerpetualsOrderContext.MarginMode.ADAPTER.encodeWithTag(writer, 16, (int) value.getMargin_mode());
                }
                if (value.getLeverage() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 17, (int) Integer.valueOf(value.getLeverage()));
                }
                if (!Double.valueOf(value.getTake_profit()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 18, (int) Double.valueOf(value.getTake_profit()));
                }
                if (!Double.valueOf(value.getStop_loss()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 19, (int) Double.valueOf(value.getStop_loss()));
                }
                if (!Double.valueOf(value.getFees()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 20, (int) Double.valueOf(value.getFees()));
                }
                if (value.getStatus() != PerpetualsOrderContext.OrderStatus.ORDER_STATUS_UNSPECIFIED) {
                    PerpetualsOrderContext.OrderStatus.ADAPTER.encodeWithTag(writer, 21, (int) value.getStatus());
                }
                if (!Double.valueOf(value.getExecuted_notional()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 22, (int) Double.valueOf(value.getExecuted_notional()));
                }
                if (!Double.valueOf(value.getExecuted_quantity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 23, (int) Double.valueOf(value.getExecuted_quantity()));
                }
                if (value.getIs_liquidation_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 24, (int) java.lang.Boolean.valueOf(value.getIs_liquidation_order()));
                }
                if (value.getIs_close_position_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 25, (int) java.lang.Boolean.valueOf(value.getIs_close_position_order()));
                }
                if (!Intrinsics.areEqual(value.getMasked_ref_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1001, (int) value.getMasked_ref_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PerpetualOrderPayload value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMasked_ref_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1001, (int) value.getMasked_ref_id());
                }
                if (value.getIs_close_position_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 25, (int) java.lang.Boolean.valueOf(value.getIs_close_position_order()));
                }
                if (value.getIs_liquidation_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 24, (int) java.lang.Boolean.valueOf(value.getIs_liquidation_order()));
                }
                if (!Double.valueOf(value.getExecuted_quantity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 23, (int) Double.valueOf(value.getExecuted_quantity()));
                }
                if (!Double.valueOf(value.getExecuted_notional()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 22, (int) Double.valueOf(value.getExecuted_notional()));
                }
                if (value.getStatus() != PerpetualsOrderContext.OrderStatus.ORDER_STATUS_UNSPECIFIED) {
                    PerpetualsOrderContext.OrderStatus.ADAPTER.encodeWithTag(writer, 21, (int) value.getStatus());
                }
                if (!Double.valueOf(value.getFees()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 20, (int) Double.valueOf(value.getFees()));
                }
                if (!Double.valueOf(value.getStop_loss()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 19, (int) Double.valueOf(value.getStop_loss()));
                }
                if (!Double.valueOf(value.getTake_profit()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 18, (int) Double.valueOf(value.getTake_profit()));
                }
                if (value.getLeverage() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 17, (int) Integer.valueOf(value.getLeverage()));
                }
                if (value.getMargin_mode() != PerpetualsOrderContext.MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    PerpetualsOrderContext.MarginMode.ADAPTER.encodeWithTag(writer, 16, (int) value.getMargin_mode());
                }
                if (!Double.valueOf(value.getTotal_notional_amount()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 15, (int) Double.valueOf(value.getTotal_notional_amount()));
                }
                if (!Double.valueOf(value.getAvg_executed_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 14, (int) Double.valueOf(value.getAvg_executed_price()));
                }
                if (!Intrinsics.areEqual(value.getOrder_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getOrder_currency_code());
                }
                if (!Double.valueOf(value.getOrder_quantity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 12, (int) Double.valueOf(value.getOrder_quantity()));
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getQuote_currency_code());
                }
                if (value.getTime_in_force() != PerpetualsOrderContext.TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    PerpetualsOrderContext.TimeInForce.ADAPTER.encodeWithTag(writer, 10, (int) value.getTime_in_force());
                }
                if (!Double.valueOf(value.getStop_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getStop_price()));
                }
                if (!Double.valueOf(value.getLimit_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getLimit_price()));
                }
                if (!Double.valueOf(value.getAsk_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getAsk_price()));
                }
                if (!Double.valueOf(value.getBid_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getBid_price()));
                }
                if (value.getOrder_side() != PerpetualsOrderContext.PerpetualsOrderSide.ORDER_SIDE_UNSPECIFIED) {
                    PerpetualsOrderContext.PerpetualsOrderSide.ADAPTER.encodeWithTag(writer, 5, (int) value.getOrder_side());
                }
                if (value.getOrder_type() != PerpetualsOrderContext.PerpetualsOrderType.ORDER_TYPE_UNSPECIFIED) {
                    PerpetualsOrderContext.PerpetualsOrderType.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_type());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (Intrinsics.areEqual(value.getRef_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRef_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PerpetualOrderPayload decode(ProtoReader reader) throws IOException {
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
                String strDecode3 = strDecode2;
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
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                PerpetualsOrderContext.MarginMode marginModeDecode = marginMode;
                PerpetualsOrderContext.TimeInForce timeInForceDecode = timeInForce2;
                PerpetualsOrderContext.PerpetualsOrderSide perpetualsOrderSideDecode = perpetualsOrderSide2;
                PerpetualsOrderContext.PerpetualsOrderType perpetualsOrderTypeDecode = perpetualsOrderType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PerpetualOrderPayload(strDecode4, strDecode5, strDecode6, perpetualsOrderTypeDecode, perpetualsOrderSideDecode, dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, timeInForceDecode, strDecode, dDoubleValue5, strDecode2, dDoubleValue6, dDoubleValue7, marginModeDecode, iIntValue, dDoubleValue8, dDoubleValue9, dDoubleValue10, orderStatusDecode, dDoubleValue11, dDoubleValue12, zBooleanValue, zBooleanValue2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag != 1001) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                timeInForce = timeInForceDecode;
                                try {
                                    perpetualsOrderTypeDecode = PerpetualsOrderContext.PerpetualsOrderType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                timeInForceDecode = timeInForce;
                                break;
                            case 5:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                timeInForce = timeInForceDecode;
                                try {
                                    perpetualsOrderSideDecode = PerpetualsOrderContext.PerpetualsOrderSide.ADAPTER.decode(reader);
                                    perpetualsOrderTypeDecode = perpetualsOrderType;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                timeInForceDecode = timeInForce;
                                break;
                            case 6:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 7:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 8:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 9:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 10:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                timeInForce = timeInForceDecode;
                                try {
                                    timeInForceDecode = PerpetualsOrderContext.TimeInForce.ADAPTER.decode(reader);
                                    perpetualsOrderTypeDecode = perpetualsOrderType;
                                    perpetualsOrderSideDecode = perpetualsOrderSide;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 11:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue5 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 13:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue6 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 15:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue7 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 16:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                timeInForce = timeInForceDecode;
                                try {
                                    marginModeDecode = PerpetualsOrderContext.MarginMode.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                }
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                timeInForceDecode = timeInForce;
                                break;
                            case 17:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 18:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue8 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 19:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue9 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 20:
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                dDoubleValue10 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                break;
                            case 21:
                                try {
                                    orderStatusDecode = PerpetualsOrderContext.OrderStatus.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    perpetualsOrderType = perpetualsOrderTypeDecode;
                                    perpetualsOrderSide = perpetualsOrderSideDecode;
                                    timeInForce = timeInForceDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                            case 22:
                                dDoubleValue11 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 23:
                                dDoubleValue12 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 24:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 25:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                perpetualsOrderType = perpetualsOrderTypeDecode;
                                perpetualsOrderSide = perpetualsOrderSideDecode;
                                timeInForce = timeInForceDecode;
                                perpetualsOrderTypeDecode = perpetualsOrderType;
                                perpetualsOrderSideDecode = perpetualsOrderSide;
                                timeInForceDecode = timeInForce;
                                break;
                        }
                    } else {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PerpetualOrderPayload redact(PerpetualOrderPayload value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PerpetualOrderPayload.copy$default(value, null, null, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0.0d, 0.0d, 0.0d, null, 0.0d, 0.0d, false, false, null, ByteString.EMPTY, 67108863, null);
            }
        };
    }
}

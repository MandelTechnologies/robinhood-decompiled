package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
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
import rosetta.nummus.MonetizationModel;
import rosetta.order.InitiatorType;
import rosetta.order.OrderType;
import rosetta.order.Side;
import rosetta.order.TimeInForce;

/* compiled from: CryptoOrderPayload.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b+\u0018\u0000 U2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001UBá\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0002H\u0017¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010/Jç\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b0\u00101R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u0010/R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b4\u0010/R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b5\u0010/R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b6\u0010/R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b7\u0010/R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\bD\u0010/R\u001a\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\bE\u0010/R\u001a\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\bF\u0010/R\"\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\bM\u0010/R\u001a\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010Q\u001a\u0004\b\u001d\u0010RR\u001a\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\bS\u0010/R\u001a\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010Q\u001a\u0004\b\u001f\u0010RR\u001a\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00102\u001a\u0004\bT\u0010/¨\u0006V"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayload;", "Lcom/squareup/wire/Message;", "", "", "ref_id", "account_id", "currency_pair_id", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "quantity", "Lrosetta/order/Side;", "side", "Lrosetta/order/TimeInForce;", "time_in_force", "Lrosetta/order/OrderType;", "type", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "orderType", "entered_amount", "quote_ask_source", "quote_bid_source", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "quote_updated_at", "Lrosetta/nummus/MonetizationModel;", "monetization_model", "fee_ratio", "Lrosetta/order/InitiatorType;", "initiator_type", "", "is_auto_send", "replacing_order_id", "is_replacing_order", "masked_ref_id", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/Side;Lrosetta/order/TimeInForce;Lrosetta/order/OrderType;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lrosetta/nummus/MonetizationModel;Ljava/lang/String;Lrosetta/order/InitiatorType;ZLjava/lang/String;ZLjava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/Side;Lrosetta/order/TimeInForce;Lrosetta/order/OrderType;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lrosetta/nummus/MonetizationModel;Ljava/lang/String;Lrosetta/order/InitiatorType;ZLjava/lang/String;ZLjava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/CryptoOrderPayload;", "Ljava/lang/String;", "getRef_id", "getAccount_id", "getCurrency_pair_id", "getPrice", "getQuantity", "Lrosetta/order/Side;", "getSide", "()Lrosetta/order/Side;", "Lrosetta/order/TimeInForce;", "getTime_in_force", "()Lrosetta/order/TimeInForce;", "Lrosetta/order/OrderType;", "getType", "()Lrosetta/order/OrderType;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "getOrderType", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "getEntered_amount", "getQuote_ask_source", "getQuote_bid_source", "Lj$/time/Instant;", "getQuote_updated_at", "()Lj$/time/Instant;", "Lrosetta/nummus/MonetizationModel;", "getMonetization_model", "()Lrosetta/nummus/MonetizationModel;", "getFee_ratio", "Lrosetta/order/InitiatorType;", "getInitiator_type", "()Lrosetta/order/InitiatorType;", "Z", "()Z", "getReplacing_order_id", "getMasked_ref_id", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CryptoOrderPayload extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoOrderPayload> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String currency_pair_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "enteredAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String entered_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final String fee_ratio;

    @WireField(adapter = "rosetta.order.InitiatorType#ADAPTER", jsonName = "initiatorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final InitiatorType initiator_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isAutoSend", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final boolean is_auto_send;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isReplacingOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final boolean is_replacing_order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedRefId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 1001)
    private final String masked_ref_id;

    @WireField(adapter = "rosetta.nummus.MonetizationModel#ADAPTER", jsonName = "monetizationModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final MonetizationModel monetization_model;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoOrderContext$CryptoOrderType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final CryptoOrderContext.CryptoOrderType orderType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteAskSource", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String quote_ask_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteBidSource", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String quote_bid_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "quoteUpdatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Instant quote_updated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ref_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "replacingOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final String replacing_order_id;

    @WireField(adapter = "rosetta.order.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Side side;

    @WireField(adapter = "rosetta.order.TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final TimeInForce time_in_force;

    @WireField(adapter = "rosetta.order.OrderType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final OrderType type;

    public CryptoOrderPayload() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 2097151, null);
    }

    public /* synthetic */ CryptoOrderPayload(String str, String str2, String str3, String str4, String str5, Side side, TimeInForce timeInForce, OrderType orderType, CryptoOrderContext.CryptoOrderType cryptoOrderType, String str6, String str7, String str8, Instant instant, MonetizationModel monetizationModel, String str9, InitiatorType initiatorType, boolean z, String str10, boolean z2, String str11, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 64) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i & 128) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i & 256) != 0 ? CryptoOrderContext.CryptoOrderType.ORDER_TYPE_UNSPECIFIED : cryptoOrderType, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? null : instant, (i & 8192) != 0 ? MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED : monetizationModel, (i & 16384) != 0 ? "" : str9, (i & 32768) != 0 ? InitiatorType.INITIATOR_TYPE_UNSPECIFIED : initiatorType, (i & 65536) != 0 ? false : z, (i & 131072) != 0 ? "" : str10, (i & 262144) == 0 ? z2 : false, (i & 524288) == 0 ? str11 : "", (i & 1048576) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24157newBuilder();
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final Side getSide() {
        return this.side;
    }

    public final TimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    public final OrderType getType() {
        return this.type;
    }

    public final CryptoOrderContext.CryptoOrderType getOrderType() {
        return this.orderType;
    }

    public final String getEntered_amount() {
        return this.entered_amount;
    }

    public final String getQuote_ask_source() {
        return this.quote_ask_source;
    }

    public final String getQuote_bid_source() {
        return this.quote_bid_source;
    }

    public final Instant getQuote_updated_at() {
        return this.quote_updated_at;
    }

    public final MonetizationModel getMonetization_model() {
        return this.monetization_model;
    }

    public final String getFee_ratio() {
        return this.fee_ratio;
    }

    public final InitiatorType getInitiator_type() {
        return this.initiator_type;
    }

    /* renamed from: is_auto_send, reason: from getter */
    public final boolean getIs_auto_send() {
        return this.is_auto_send;
    }

    public final String getReplacing_order_id() {
        return this.replacing_order_id;
    }

    /* renamed from: is_replacing_order, reason: from getter */
    public final boolean getIs_replacing_order() {
        return this.is_replacing_order;
    }

    public final String getMasked_ref_id() {
        return this.masked_ref_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOrderPayload(String ref_id, String account_id, String currency_pair_id, String price, String quantity, Side side, TimeInForce time_in_force, OrderType type2, CryptoOrderContext.CryptoOrderType orderType, String entered_amount, String quote_ask_source, String quote_bid_source, Instant instant, MonetizationModel monetization_model, String fee_ratio, InitiatorType initiator_type, boolean z, String replacing_order_id, boolean z2, String masked_ref_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(entered_amount, "entered_amount");
        Intrinsics.checkNotNullParameter(quote_ask_source, "quote_ask_source");
        Intrinsics.checkNotNullParameter(quote_bid_source, "quote_bid_source");
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(initiator_type, "initiator_type");
        Intrinsics.checkNotNullParameter(replacing_order_id, "replacing_order_id");
        Intrinsics.checkNotNullParameter(masked_ref_id, "masked_ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ref_id = ref_id;
        this.account_id = account_id;
        this.currency_pair_id = currency_pair_id;
        this.price = price;
        this.quantity = quantity;
        this.side = side;
        this.time_in_force = time_in_force;
        this.type = type2;
        this.orderType = orderType;
        this.entered_amount = entered_amount;
        this.quote_ask_source = quote_ask_source;
        this.quote_bid_source = quote_bid_source;
        this.quote_updated_at = instant;
        this.monetization_model = monetization_model;
        this.fee_ratio = fee_ratio;
        this.initiator_type = initiator_type;
        this.is_auto_send = z;
        this.replacing_order_id = replacing_order_id;
        this.is_replacing_order = z2;
        this.masked_ref_id = masked_ref_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24157newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoOrderPayload)) {
            return false;
        }
        CryptoOrderPayload cryptoOrderPayload = (CryptoOrderPayload) other;
        return Intrinsics.areEqual(unknownFields(), cryptoOrderPayload.unknownFields()) && Intrinsics.areEqual(this.ref_id, cryptoOrderPayload.ref_id) && Intrinsics.areEqual(this.account_id, cryptoOrderPayload.account_id) && Intrinsics.areEqual(this.currency_pair_id, cryptoOrderPayload.currency_pair_id) && Intrinsics.areEqual(this.price, cryptoOrderPayload.price) && Intrinsics.areEqual(this.quantity, cryptoOrderPayload.quantity) && this.side == cryptoOrderPayload.side && this.time_in_force == cryptoOrderPayload.time_in_force && this.type == cryptoOrderPayload.type && this.orderType == cryptoOrderPayload.orderType && Intrinsics.areEqual(this.entered_amount, cryptoOrderPayload.entered_amount) && Intrinsics.areEqual(this.quote_ask_source, cryptoOrderPayload.quote_ask_source) && Intrinsics.areEqual(this.quote_bid_source, cryptoOrderPayload.quote_bid_source) && Intrinsics.areEqual(this.quote_updated_at, cryptoOrderPayload.quote_updated_at) && this.monetization_model == cryptoOrderPayload.monetization_model && Intrinsics.areEqual(this.fee_ratio, cryptoOrderPayload.fee_ratio) && this.initiator_type == cryptoOrderPayload.initiator_type && this.is_auto_send == cryptoOrderPayload.is_auto_send && Intrinsics.areEqual(this.replacing_order_id, cryptoOrderPayload.replacing_order_id) && this.is_replacing_order == cryptoOrderPayload.is_replacing_order && Intrinsics.areEqual(this.masked_ref_id, cryptoOrderPayload.masked_ref_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.ref_id.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.currency_pair_id.hashCode()) * 37) + this.price.hashCode()) * 37) + this.quantity.hashCode()) * 37) + this.side.hashCode()) * 37) + this.time_in_force.hashCode()) * 37) + this.type.hashCode()) * 37) + this.orderType.hashCode()) * 37) + this.entered_amount.hashCode()) * 37) + this.quote_ask_source.hashCode()) * 37) + this.quote_bid_source.hashCode()) * 37;
        Instant instant = this.quote_updated_at;
        int iHashCode2 = ((((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.monetization_model.hashCode()) * 37) + this.fee_ratio.hashCode()) * 37) + this.initiator_type.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_auto_send)) * 37) + this.replacing_order_id.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_replacing_order)) * 37) + this.masked_ref_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        arrayList.add("price=" + Internal.sanitize(this.price));
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("side=" + this.side);
        arrayList.add("time_in_force=" + this.time_in_force);
        arrayList.add("type=" + this.type);
        arrayList.add("orderType=" + this.orderType);
        arrayList.add("entered_amount=" + Internal.sanitize(this.entered_amount));
        arrayList.add("quote_ask_source=" + Internal.sanitize(this.quote_ask_source));
        arrayList.add("quote_bid_source=" + Internal.sanitize(this.quote_bid_source));
        Instant instant = this.quote_updated_at;
        if (instant != null) {
            arrayList.add("quote_updated_at=" + instant);
        }
        arrayList.add("monetization_model=" + this.monetization_model);
        arrayList.add("fee_ratio=" + Internal.sanitize(this.fee_ratio));
        arrayList.add("initiator_type=" + this.initiator_type);
        arrayList.add("is_auto_send=" + this.is_auto_send);
        arrayList.add("replacing_order_id=" + Internal.sanitize(this.replacing_order_id));
        arrayList.add("is_replacing_order=" + this.is_replacing_order);
        arrayList.add("masked_ref_id=" + Internal.sanitize(this.masked_ref_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoOrderPayload{", "}", 0, null, null, 56, null);
    }

    public final CryptoOrderPayload copy(String ref_id, String account_id, String currency_pair_id, String price, String quantity, Side side, TimeInForce time_in_force, OrderType type2, CryptoOrderContext.CryptoOrderType orderType, String entered_amount, String quote_ask_source, String quote_bid_source, Instant quote_updated_at, MonetizationModel monetization_model, String fee_ratio, InitiatorType initiator_type, boolean is_auto_send, String replacing_order_id, boolean is_replacing_order, String masked_ref_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(entered_amount, "entered_amount");
        Intrinsics.checkNotNullParameter(quote_ask_source, "quote_ask_source");
        Intrinsics.checkNotNullParameter(quote_bid_source, "quote_bid_source");
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(initiator_type, "initiator_type");
        Intrinsics.checkNotNullParameter(replacing_order_id, "replacing_order_id");
        Intrinsics.checkNotNullParameter(masked_ref_id, "masked_ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoOrderPayload(ref_id, account_id, currency_pair_id, price, quantity, side, time_in_force, type2, orderType, entered_amount, quote_ask_source, quote_bid_source, quote_updated_at, monetization_model, fee_ratio, initiator_type, is_auto_send, replacing_order_id, is_replacing_order, masked_ref_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoOrderPayload.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoOrderPayload>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoOrderPayload$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoOrderPayload value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCurrency_pair_id());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getQuantity());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(6, value.getSide());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    size += TimeInForce.ADAPTER.encodedSizeWithTag(7, value.getTime_in_force());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    size += OrderType.ADAPTER.encodedSizeWithTag(8, value.getType());
                }
                if (value.getOrderType() != CryptoOrderContext.CryptoOrderType.ORDER_TYPE_UNSPECIFIED) {
                    size += CryptoOrderContext.CryptoOrderType.ADAPTER.encodedSizeWithTag(9, value.getOrderType());
                }
                if (!Intrinsics.areEqual(value.getEntered_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getEntered_amount());
                }
                if (!Intrinsics.areEqual(value.getQuote_ask_source(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getQuote_ask_source());
                }
                if (!Intrinsics.areEqual(value.getQuote_bid_source(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getQuote_bid_source());
                }
                if (value.getQuote_updated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(13, value.getQuote_updated_at());
                }
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    size += MonetizationModel.ADAPTER.encodedSizeWithTag(14, value.getMonetization_model());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getFee_ratio());
                }
                if (value.getInitiator_type() != InitiatorType.INITIATOR_TYPE_UNSPECIFIED) {
                    size += InitiatorType.ADAPTER.encodedSizeWithTag(16, value.getInitiator_type());
                }
                if (value.getIs_auto_send()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(17, java.lang.Boolean.valueOf(value.getIs_auto_send()));
                }
                if (!Intrinsics.areEqual(value.getReplacing_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getReplacing_order_id());
                }
                if (value.getIs_replacing_order()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(19, java.lang.Boolean.valueOf(value.getIs_replacing_order()));
                }
                return !Intrinsics.areEqual(value.getMasked_ref_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1001, value.getMasked_ref_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoOrderPayload value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCurrency_pair_id());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getQuantity());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 6, (int) value.getSide());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 7, (int) value.getTime_in_force());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 8, (int) value.getType());
                }
                if (value.getOrderType() != CryptoOrderContext.CryptoOrderType.ORDER_TYPE_UNSPECIFIED) {
                    CryptoOrderContext.CryptoOrderType.ADAPTER.encodeWithTag(writer, 9, (int) value.getOrderType());
                }
                if (!Intrinsics.areEqual(value.getEntered_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getEntered_amount());
                }
                if (!Intrinsics.areEqual(value.getQuote_ask_source(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getQuote_ask_source());
                }
                if (!Intrinsics.areEqual(value.getQuote_bid_source(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getQuote_bid_source());
                }
                if (value.getQuote_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 13, (int) value.getQuote_updated_at());
                }
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    MonetizationModel.ADAPTER.encodeWithTag(writer, 14, (int) value.getMonetization_model());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getFee_ratio());
                }
                if (value.getInitiator_type() != InitiatorType.INITIATOR_TYPE_UNSPECIFIED) {
                    InitiatorType.ADAPTER.encodeWithTag(writer, 16, (int) value.getInitiator_type());
                }
                if (value.getIs_auto_send()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 17, (int) java.lang.Boolean.valueOf(value.getIs_auto_send()));
                }
                if (!Intrinsics.areEqual(value.getReplacing_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getReplacing_order_id());
                }
                if (value.getIs_replacing_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 19, (int) java.lang.Boolean.valueOf(value.getIs_replacing_order()));
                }
                if (!Intrinsics.areEqual(value.getMasked_ref_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1001, (int) value.getMasked_ref_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoOrderPayload value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMasked_ref_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1001, (int) value.getMasked_ref_id());
                }
                if (value.getIs_replacing_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 19, (int) java.lang.Boolean.valueOf(value.getIs_replacing_order()));
                }
                if (!Intrinsics.areEqual(value.getReplacing_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getReplacing_order_id());
                }
                if (value.getIs_auto_send()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 17, (int) java.lang.Boolean.valueOf(value.getIs_auto_send()));
                }
                if (value.getInitiator_type() != InitiatorType.INITIATOR_TYPE_UNSPECIFIED) {
                    InitiatorType.ADAPTER.encodeWithTag(writer, 16, (int) value.getInitiator_type());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getFee_ratio());
                }
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    MonetizationModel.ADAPTER.encodeWithTag(writer, 14, (int) value.getMonetization_model());
                }
                if (value.getQuote_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 13, (int) value.getQuote_updated_at());
                }
                if (!Intrinsics.areEqual(value.getQuote_bid_source(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getQuote_bid_source());
                }
                if (!Intrinsics.areEqual(value.getQuote_ask_source(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getQuote_ask_source());
                }
                if (!Intrinsics.areEqual(value.getEntered_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getEntered_amount());
                }
                if (value.getOrderType() != CryptoOrderContext.CryptoOrderType.ORDER_TYPE_UNSPECIFIED) {
                    CryptoOrderContext.CryptoOrderType.ADAPTER.encodeWithTag(writer, 9, (int) value.getOrderType());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 8, (int) value.getType());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 7, (int) value.getTime_in_force());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 6, (int) value.getSide());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCurrency_pair_id());
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
            public CryptoOrderPayload decode(ProtoReader reader) throws IOException {
                TimeInForce timeInForce;
                OrderType orderType;
                CryptoOrderContext.CryptoOrderType cryptoOrderType;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Side side = Side.SIDE_UNSPECIFIED;
                TimeInForce timeInForce2 = TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                OrderType orderType2 = OrderType.ORDER_TYPE_UNSPECIFIED;
                CryptoOrderContext.CryptoOrderType cryptoOrderType2 = CryptoOrderContext.CryptoOrderType.ORDER_TYPE_UNSPECIFIED;
                MonetizationModel monetizationModel = MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED;
                InitiatorType initiatorType = InitiatorType.INITIATOR_TYPE_UNSPECIFIED;
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
                Instant instantDecode = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                InitiatorType initiatorTypeDecode = initiatorType;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                MonetizationModel monetizationModelDecode = monetizationModel;
                CryptoOrderContext.CryptoOrderType cryptoOrderTypeDecode = cryptoOrderType2;
                OrderType orderTypeDecode = orderType2;
                TimeInForce timeInForceDecode = timeInForce2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CryptoOrderPayload(strDecode10, strDecode11, strDecode, strDecode2, strDecode3, sideDecode, timeInForceDecode, orderTypeDecode, cryptoOrderTypeDecode, strDecode4, strDecode5, strDecode6, instantDecode, monetizationModelDecode, strDecode7, initiatorTypeDecode, zBooleanValue, strDecode8, zBooleanValue2, strDecode9, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag != 1001) {
                        switch (iNextTag) {
                            case 1:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
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
                                timeInForce = timeInForceDecode;
                                orderType = orderTypeDecode;
                                cryptoOrderType = cryptoOrderTypeDecode;
                                try {
                                    sideDecode = Side.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                timeInForceDecode = timeInForce;
                                orderTypeDecode = orderType;
                                cryptoOrderTypeDecode = cryptoOrderType;
                                break;
                            case 7:
                                timeInForce = timeInForceDecode;
                                orderType = orderTypeDecode;
                                cryptoOrderType = cryptoOrderTypeDecode;
                                try {
                                    timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                orderTypeDecode = orderType;
                                cryptoOrderTypeDecode = cryptoOrderType;
                                break;
                            case 8:
                                timeInForce = timeInForceDecode;
                                orderType = orderTypeDecode;
                                cryptoOrderType = cryptoOrderTypeDecode;
                                try {
                                    orderTypeDecode = OrderType.ADAPTER.decode(reader);
                                    timeInForceDecode = timeInForce;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                cryptoOrderTypeDecode = cryptoOrderType;
                                break;
                            case 9:
                                timeInForce = timeInForceDecode;
                                orderType = orderTypeDecode;
                                cryptoOrderType = cryptoOrderTypeDecode;
                                try {
                                    cryptoOrderTypeDecode = CryptoOrderContext.CryptoOrderType.ADAPTER.decode(reader);
                                    timeInForceDecode = timeInForce;
                                    orderTypeDecode = orderType;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 10:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 14:
                                timeInForce = timeInForceDecode;
                                orderType = orderTypeDecode;
                                cryptoOrderType = cryptoOrderTypeDecode;
                                try {
                                    monetizationModelDecode = MonetizationModel.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                }
                                timeInForceDecode = timeInForce;
                                orderTypeDecode = orderType;
                                cryptoOrderTypeDecode = cryptoOrderType;
                                break;
                            case 15:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                try {
                                    initiatorTypeDecode = InitiatorType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    timeInForce = timeInForceDecode;
                                    orderType = orderTypeDecode;
                                    cryptoOrderType = cryptoOrderTypeDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                    break;
                                }
                            case 17:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 18:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 19:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                timeInForce = timeInForceDecode;
                                orderType = orderTypeDecode;
                                cryptoOrderType = cryptoOrderTypeDecode;
                                timeInForceDecode = timeInForce;
                                orderTypeDecode = orderType;
                                cryptoOrderTypeDecode = cryptoOrderType;
                                break;
                        }
                    } else {
                        strDecode9 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoOrderPayload redact(CryptoOrderPayload value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant quote_updated_at = value.getQuote_updated_at();
                return value.copy((1044479 & 1) != 0 ? value.ref_id : null, (1044479 & 2) != 0 ? value.account_id : null, (1044479 & 4) != 0 ? value.currency_pair_id : null, (1044479 & 8) != 0 ? value.price : null, (1044479 & 16) != 0 ? value.quantity : null, (1044479 & 32) != 0 ? value.side : null, (1044479 & 64) != 0 ? value.time_in_force : null, (1044479 & 128) != 0 ? value.type : null, (1044479 & 256) != 0 ? value.orderType : null, (1044479 & 512) != 0 ? value.entered_amount : null, (1044479 & 1024) != 0 ? value.quote_ask_source : null, (1044479 & 2048) != 0 ? value.quote_bid_source : null, (1044479 & 4096) != 0 ? value.quote_updated_at : quote_updated_at != null ? ProtoAdapter.INSTANT.redact(quote_updated_at) : null, (1044479 & 8192) != 0 ? value.monetization_model : null, (1044479 & 16384) != 0 ? value.fee_ratio : null, (1044479 & 32768) != 0 ? value.initiator_type : null, (1044479 & 65536) != 0 ? value.is_auto_send : false, (1044479 & 131072) != 0 ? value.replacing_order_id : null, (1044479 & 262144) != 0 ? value.is_replacing_order : false, (1044479 & 524288) != 0 ? value.masked_ref_id : null, (1044479 & 1048576) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

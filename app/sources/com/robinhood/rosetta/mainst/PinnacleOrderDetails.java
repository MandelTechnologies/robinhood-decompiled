package com.robinhood.rosetta.mainst;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarComposable5;
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
import java.util.List;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.InstrumentType;
import rosetta.mainst.OrderState;
import rosetta.mainst.OrderType;
import rosetta.mainst.Route;
import rosetta.mainst.Side;
import rosetta.mainst.TimeInForce;
import rosetta.order.Agent;
import rosetta.order.ResponseCategory;

/* compiled from: PinnacleOrderDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 U2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001UBï\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020\u001f\u0012\b\b\u0002\u0010#\u001a\u00020\u001f\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020'¢\u0006\u0004\b(\u0010)J\b\u0010L\u001a\u00020\u0002H\u0017J\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0096\u0002J\b\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020\u001fH\u0016Jî\u0001\u0010T\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00106R\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0016\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00106R\u0016\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0016\u0010 \u001a\u00020!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010\"\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010CR\u0016\u0010#\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010CR\u0016\u0010$\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010K¨\u0006V"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleOrderDetails;", "Lcom/squareup/wire/Message;", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUID;", ComboOrderDetailTopbarComposable5.ORDER_STATUS, "Lrosetta/mainst/OrderState;", "instrument_type", "Lrosetta/mainst/InstrumentType;", "created_at", "Lcom/robinhood/rosetta/mainst/Time;", "last_sent_at", "created_agent", "Lrosetta/order/Agent;", "cancelled_quantity", "Lcom/robinhood/rosetta/mainst/Decimal;", "latest_cancel_log", "Lcom/robinhood/rosetta/mainst/CancelLog;", "response_category", "Lrosetta/order/ResponseCategory;", "legs", "", "Lcom/robinhood/rosetta/mainst/PinnacleLegDetails;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "side", "Lrosetta/mainst/Side;", "type", "Lrosetta/mainst/OrderType;", "quantity", "symbol", "", PlaceTypes.ROUTE, "Lrosetta/mainst/Route;", "clearing_firm", "response_text", "time_in_force", "Lrosetta/mainst/TimeInForce;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/mainst/OrderState;Lrosetta/mainst/InstrumentType;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/order/Agent;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/CancelLog;Lrosetta/order/ResponseCategory;Ljava/util/List;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/Side;Lrosetta/mainst/OrderType;Lcom/robinhood/rosetta/mainst/Decimal;Ljava/lang/String;Lrosetta/mainst/Route;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/TimeInForce;Lokio/ByteString;)V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUID;", "getOrder_status", "()Lrosetta/mainst/OrderState;", "getInstrument_type", "()Lrosetta/mainst/InstrumentType;", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/Time;", "getLast_sent_at", "getCreated_agent", "()Lrosetta/order/Agent;", "getCancelled_quantity", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getLatest_cancel_log", "()Lcom/robinhood/rosetta/mainst/CancelLog;", "getResponse_category", "()Lrosetta/order/ResponseCategory;", "getPrice", "getStop_price", "getSide", "()Lrosetta/mainst/Side;", "getType", "()Lrosetta/mainst/OrderType;", "getQuantity", "getSymbol", "()Ljava/lang/String;", "getRoute", "()Lrosetta/mainst/Route;", "getClearing_firm", "getResponse_text", "getTime_in_force", "()Lrosetta/mainst/TimeInForce;", "getLegs", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PinnacleOrderDetails extends Message {

    @JvmField
    public static final ProtoAdapter<PinnacleOrderDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "cancelledQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Decimal cancelled_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clearingFirm", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final String clearing_firm;

    @WireField(adapter = "rosetta.order.Agent#ADAPTER", jsonName = "createdAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Agent created_agent;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Time created_at;

    @WireField(adapter = "rosetta.mainst.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "lastSentAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Time last_sent_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.CancelLog#ADAPTER", jsonName = "latestCancelLog", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final CancelLog latest_cancel_log;

    @WireField(adapter = "com.robinhood.rosetta.mainst.PinnacleLegDetails#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 9, tag = 10)
    private final List<PinnacleLegDetails> legs;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID order_id;

    @WireField(adapter = "rosetta.mainst.OrderState#ADAPTER", jsonName = "orderStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OrderState order_status;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Decimal price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final Decimal quantity;

    @WireField(adapter = "rosetta.order.ResponseCategory#ADAPTER", jsonName = "responseCategory", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final ResponseCategory response_category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "responseText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final String response_text;

    @WireField(adapter = "rosetta.mainst.Route#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final Route route;

    @WireField(adapter = "rosetta.mainst.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Side side;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "stopPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Decimal stop_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String symbol;

    @WireField(adapter = "rosetta.mainst.TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final TimeInForce time_in_force;

    @WireField(adapter = "rosetta.mainst.OrderType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final OrderType type;

    public PinnacleOrderDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24699newBuilder();
    }

    public final UUID getOrder_id() {
        return this.order_id;
    }

    public final OrderState getOrder_status() {
        return this.order_status;
    }

    public /* synthetic */ PinnacleOrderDetails(UUID uuid, OrderState orderState, InstrumentType instrumentType, Time time, Time time2, Agent agent, Decimal decimal, CancelLog cancelLog, ResponseCategory responseCategory, List list, Decimal decimal2, Decimal decimal3, Side side, OrderType orderType, Decimal decimal4, String str, Route route, String str2, String str3, TimeInForce timeInForce, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? OrderState.ORDER_STATE_UNSPECIFIED : orderState, (i & 4) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i & 8) != 0 ? null : time, (i & 16) != 0 ? null : time2, (i & 32) != 0 ? Agent.AGENT_UNSPECIFIED : agent, (i & 64) != 0 ? null : decimal, (i & 128) != 0 ? null : cancelLog, (i & 256) != 0 ? ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED : responseCategory, (i & 512) != 0 ? CollectionsKt.emptyList() : list, (i & 1024) != 0 ? null : decimal2, (i & 2048) != 0 ? null : decimal3, (i & 4096) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 8192) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i & 16384) != 0 ? null : decimal4, (i & 32768) != 0 ? "" : str, (i & 65536) != 0 ? Route.ROUTE_UNSPECIFIED : route, (i & 131072) != 0 ? "" : str2, (i & 262144) == 0 ? str3 : "", (i & 524288) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i & 1048576) != 0 ? ByteString.EMPTY : byteString);
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    public final Time getCreated_at() {
        return this.created_at;
    }

    public final Time getLast_sent_at() {
        return this.last_sent_at;
    }

    public final Agent getCreated_agent() {
        return this.created_agent;
    }

    public final Decimal getCancelled_quantity() {
        return this.cancelled_quantity;
    }

    public final CancelLog getLatest_cancel_log() {
        return this.latest_cancel_log;
    }

    public final ResponseCategory getResponse_category() {
        return this.response_category;
    }

    public final Decimal getPrice() {
        return this.price;
    }

    public final Decimal getStop_price() {
        return this.stop_price;
    }

    public final Side getSide() {
        return this.side;
    }

    public final OrderType getType() {
        return this.type;
    }

    public final Decimal getQuantity() {
        return this.quantity;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final Route getRoute() {
        return this.route;
    }

    public final String getClearing_firm() {
        return this.clearing_firm;
    }

    public final String getResponse_text() {
        return this.response_text;
    }

    public final TimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnacleOrderDetails(UUID uuid, OrderState order_status, InstrumentType instrument_type, Time time, Time time2, Agent created_agent, Decimal decimal, CancelLog cancelLog, ResponseCategory response_category, List<PinnacleLegDetails> legs, Decimal decimal2, Decimal decimal3, Side side, OrderType type2, Decimal decimal4, String symbol, Route route, String clearing_firm, String response_text, TimeInForce time_in_force, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_status, "order_status");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(created_agent, "created_agent");
        Intrinsics.checkNotNullParameter(response_category, "response_category");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(clearing_firm, "clearing_firm");
        Intrinsics.checkNotNullParameter(response_text, "response_text");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = uuid;
        this.order_status = order_status;
        this.instrument_type = instrument_type;
        this.created_at = time;
        this.last_sent_at = time2;
        this.created_agent = created_agent;
        this.cancelled_quantity = decimal;
        this.latest_cancel_log = cancelLog;
        this.response_category = response_category;
        this.price = decimal2;
        this.stop_price = decimal3;
        this.side = side;
        this.type = type2;
        this.quantity = decimal4;
        this.symbol = symbol;
        this.route = route;
        this.clearing_firm = clearing_firm;
        this.response_text = response_text;
        this.time_in_force = time_in_force;
        this.legs = Internal.immutableCopyOf("legs", legs);
    }

    public final List<PinnacleLegDetails> getLegs() {
        return this.legs;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24699newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PinnacleOrderDetails)) {
            return false;
        }
        PinnacleOrderDetails pinnacleOrderDetails = (PinnacleOrderDetails) other;
        return Intrinsics.areEqual(unknownFields(), pinnacleOrderDetails.unknownFields()) && Intrinsics.areEqual(this.order_id, pinnacleOrderDetails.order_id) && this.order_status == pinnacleOrderDetails.order_status && this.instrument_type == pinnacleOrderDetails.instrument_type && Intrinsics.areEqual(this.created_at, pinnacleOrderDetails.created_at) && Intrinsics.areEqual(this.last_sent_at, pinnacleOrderDetails.last_sent_at) && this.created_agent == pinnacleOrderDetails.created_agent && Intrinsics.areEqual(this.cancelled_quantity, pinnacleOrderDetails.cancelled_quantity) && Intrinsics.areEqual(this.latest_cancel_log, pinnacleOrderDetails.latest_cancel_log) && this.response_category == pinnacleOrderDetails.response_category && Intrinsics.areEqual(this.legs, pinnacleOrderDetails.legs) && Intrinsics.areEqual(this.price, pinnacleOrderDetails.price) && Intrinsics.areEqual(this.stop_price, pinnacleOrderDetails.stop_price) && this.side == pinnacleOrderDetails.side && this.type == pinnacleOrderDetails.type && Intrinsics.areEqual(this.quantity, pinnacleOrderDetails.quantity) && Intrinsics.areEqual(this.symbol, pinnacleOrderDetails.symbol) && this.route == pinnacleOrderDetails.route && Intrinsics.areEqual(this.clearing_firm, pinnacleOrderDetails.clearing_firm) && Intrinsics.areEqual(this.response_text, pinnacleOrderDetails.response_text) && this.time_in_force == pinnacleOrderDetails.time_in_force;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.order_id;
        int iHashCode2 = (((((iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37) + this.order_status.hashCode()) * 37) + this.instrument_type.hashCode()) * 37;
        Time time = this.created_at;
        int iHashCode3 = (iHashCode2 + (time != null ? time.hashCode() : 0)) * 37;
        Time time2 = this.last_sent_at;
        int iHashCode4 = (((iHashCode3 + (time2 != null ? time2.hashCode() : 0)) * 37) + this.created_agent.hashCode()) * 37;
        Decimal decimal = this.cancelled_quantity;
        int iHashCode5 = (iHashCode4 + (decimal != null ? decimal.hashCode() : 0)) * 37;
        CancelLog cancelLog = this.latest_cancel_log;
        int iHashCode6 = (((((iHashCode5 + (cancelLog != null ? cancelLog.hashCode() : 0)) * 37) + this.response_category.hashCode()) * 37) + this.legs.hashCode()) * 37;
        Decimal decimal2 = this.price;
        int iHashCode7 = (iHashCode6 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        Decimal decimal3 = this.stop_price;
        int iHashCode8 = (((((iHashCode7 + (decimal3 != null ? decimal3.hashCode() : 0)) * 37) + this.side.hashCode()) * 37) + this.type.hashCode()) * 37;
        Decimal decimal4 = this.quantity;
        int iHashCode9 = ((((((((((iHashCode8 + (decimal4 != null ? decimal4.hashCode() : 0)) * 37) + this.symbol.hashCode()) * 37) + this.route.hashCode()) * 37) + this.clearing_firm.hashCode()) * 37) + this.response_text.hashCode()) * 37) + this.time_in_force.hashCode();
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.order_id;
        if (uuid != null) {
            arrayList.add("order_id=" + uuid);
        }
        arrayList.add("order_status=" + this.order_status);
        arrayList.add("instrument_type=" + this.instrument_type);
        Time time = this.created_at;
        if (time != null) {
            arrayList.add("created_at=" + time);
        }
        Time time2 = this.last_sent_at;
        if (time2 != null) {
            arrayList.add("last_sent_at=" + time2);
        }
        arrayList.add("created_agent=" + this.created_agent);
        Decimal decimal = this.cancelled_quantity;
        if (decimal != null) {
            arrayList.add("cancelled_quantity=" + decimal);
        }
        CancelLog cancelLog = this.latest_cancel_log;
        if (cancelLog != null) {
            arrayList.add("latest_cancel_log=" + cancelLog);
        }
        arrayList.add("response_category=" + this.response_category);
        if (!this.legs.isEmpty()) {
            arrayList.add("legs=" + this.legs);
        }
        Decimal decimal2 = this.price;
        if (decimal2 != null) {
            arrayList.add("price=" + decimal2);
        }
        Decimal decimal3 = this.stop_price;
        if (decimal3 != null) {
            arrayList.add("stop_price=" + decimal3);
        }
        arrayList.add("side=" + this.side);
        arrayList.add("type=" + this.type);
        Decimal decimal4 = this.quantity;
        if (decimal4 != null) {
            arrayList.add("quantity=" + decimal4);
        }
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("route=" + this.route);
        arrayList.add("clearing_firm=" + Internal.sanitize(this.clearing_firm));
        arrayList.add("response_text=" + Internal.sanitize(this.response_text));
        arrayList.add("time_in_force=" + this.time_in_force);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PinnacleOrderDetails{", "}", 0, null, null, 56, null);
    }

    public final PinnacleOrderDetails copy(UUID order_id, OrderState order_status, InstrumentType instrument_type, Time created_at, Time last_sent_at, Agent created_agent, Decimal cancelled_quantity, CancelLog latest_cancel_log, ResponseCategory response_category, List<PinnacleLegDetails> legs, Decimal price, Decimal stop_price, Side side, OrderType type2, Decimal quantity, String symbol, Route route, String clearing_firm, String response_text, TimeInForce time_in_force, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_status, "order_status");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(created_agent, "created_agent");
        Intrinsics.checkNotNullParameter(response_category, "response_category");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(clearing_firm, "clearing_firm");
        Intrinsics.checkNotNullParameter(response_text, "response_text");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PinnacleOrderDetails(order_id, order_status, instrument_type, created_at, last_sent_at, created_agent, cancelled_quantity, latest_cancel_log, response_category, legs, price, stop_price, side, type2, quantity, symbol, route, clearing_firm, response_text, time_in_force, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PinnacleOrderDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PinnacleOrderDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.PinnacleOrderDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PinnacleOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOrder_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (value.getOrder_status() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    size += OrderState.ADAPTER.encodedSizeWithTag(2, value.getOrder_status());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    size += InstrumentType.ADAPTER.encodedSizeWithTag(3, value.getInstrument_type());
                }
                if (value.getCreated_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(4, value.getCreated_at());
                }
                if (value.getLast_sent_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(5, value.getLast_sent_at());
                }
                if (value.getCreated_agent() != Agent.AGENT_UNSPECIFIED) {
                    size += Agent.ADAPTER.encodedSizeWithTag(6, value.getCreated_agent());
                }
                if (value.getCancelled_quantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(7, value.getCancelled_quantity());
                }
                if (value.getLatest_cancel_log() != null) {
                    size += CancelLog.ADAPTER.encodedSizeWithTag(8, value.getLatest_cancel_log());
                }
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    size += ResponseCategory.ADAPTER.encodedSizeWithTag(9, value.getResponse_category());
                }
                int iEncodedSizeWithTag = size + PinnacleLegDetails.ADAPTER.asRepeated().encodedSizeWithTag(10, value.getLegs());
                if (value.getPrice() != null) {
                    iEncodedSizeWithTag += Decimal.ADAPTER.encodedSizeWithTag(11, value.getPrice());
                }
                if (value.getStop_price() != null) {
                    iEncodedSizeWithTag += Decimal.ADAPTER.encodedSizeWithTag(12, value.getStop_price());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    iEncodedSizeWithTag += Side.ADAPTER.encodedSizeWithTag(13, value.getSide());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += OrderType.ADAPTER.encodedSizeWithTag(14, value.getType());
                }
                if (value.getQuantity() != null) {
                    iEncodedSizeWithTag += Decimal.ADAPTER.encodedSizeWithTag(15, value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getSymbol());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    iEncodedSizeWithTag += Route.ADAPTER.encodedSizeWithTag(17, value.getRoute());
                }
                if (!Intrinsics.areEqual(value.getClearing_firm(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getClearing_firm());
                }
                if (!Intrinsics.areEqual(value.getResponse_text(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(19, value.getResponse_text());
                }
                return value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED ? iEncodedSizeWithTag + TimeInForce.ADAPTER.encodedSizeWithTag(20, value.getTime_in_force()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PinnacleOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (value.getOrder_status() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    OrderState.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_status());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 3, (int) value.getInstrument_type());
                }
                if (value.getCreated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (value.getLast_sent_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getLast_sent_at());
                }
                if (value.getCreated_agent() != Agent.AGENT_UNSPECIFIED) {
                    Agent.ADAPTER.encodeWithTag(writer, 6, (int) value.getCreated_agent());
                }
                if (value.getCancelled_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 7, (int) value.getCancelled_quantity());
                }
                if (value.getLatest_cancel_log() != null) {
                    CancelLog.ADAPTER.encodeWithTag(writer, 8, (int) value.getLatest_cancel_log());
                }
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    ResponseCategory.ADAPTER.encodeWithTag(writer, 9, (int) value.getResponse_category());
                }
                PinnacleLegDetails.ADAPTER.asRepeated().encodeWithTag(writer, 10, (int) value.getLegs());
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 11, (int) value.getPrice());
                }
                if (value.getStop_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 12, (int) value.getStop_price());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 13, (int) value.getSide());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 14, (int) value.getType());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 15, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getSymbol());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 17, (int) value.getRoute());
                }
                if (!Intrinsics.areEqual(value.getClearing_firm(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getClearing_firm());
                }
                if (!Intrinsics.areEqual(value.getResponse_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getResponse_text());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 20, (int) value.getTime_in_force());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PinnacleOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 20, (int) value.getTime_in_force());
                }
                if (!Intrinsics.areEqual(value.getResponse_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getResponse_text());
                }
                if (!Intrinsics.areEqual(value.getClearing_firm(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getClearing_firm());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 17, (int) value.getRoute());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getSymbol());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 15, (int) value.getQuantity());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 14, (int) value.getType());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 13, (int) value.getSide());
                }
                if (value.getStop_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 12, (int) value.getStop_price());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 11, (int) value.getPrice());
                }
                PinnacleLegDetails.ADAPTER.asRepeated().encodeWithTag(writer, 10, (int) value.getLegs());
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    ResponseCategory.ADAPTER.encodeWithTag(writer, 9, (int) value.getResponse_category());
                }
                if (value.getLatest_cancel_log() != null) {
                    CancelLog.ADAPTER.encodeWithTag(writer, 8, (int) value.getLatest_cancel_log());
                }
                if (value.getCancelled_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 7, (int) value.getCancelled_quantity());
                }
                if (value.getCreated_agent() != Agent.AGENT_UNSPECIFIED) {
                    Agent.ADAPTER.encodeWithTag(writer, 6, (int) value.getCreated_agent());
                }
                if (value.getLast_sent_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getLast_sent_at());
                }
                if (value.getCreated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getCreated_at());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 3, (int) value.getInstrument_type());
                }
                if (value.getOrder_status() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    OrderState.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_status());
                }
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PinnacleOrderDetails decode(ProtoReader reader) throws IOException {
                InstrumentType instrumentType;
                Agent agent;
                ResponseCategory responseCategory;
                Intrinsics.checkNotNullParameter(reader, "reader");
                OrderState orderState = OrderState.ORDER_STATE_UNSPECIFIED;
                InstrumentType instrumentType2 = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                Agent agent2 = Agent.AGENT_UNSPECIFIED;
                ResponseCategory responseCategory2 = ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                Side side = Side.SIDE_UNSPECIFIED;
                OrderType orderType = OrderType.ORDER_TYPE_UNSPECIFIED;
                Route route = Route.ROUTE_UNSPECIFIED;
                TimeInForce timeInForce = TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                OrderState orderStateDecode = orderState;
                Time timeDecode = null;
                Time timeDecode2 = null;
                Decimal decimalDecode = null;
                CancelLog cancelLogDecode = null;
                Decimal decimalDecode2 = null;
                Decimal decimalDecode3 = null;
                Decimal decimalDecode4 = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                TimeInForce timeInForceDecode = timeInForce;
                UUID uuidDecode = null;
                Route routeDecode = route;
                OrderType orderTypeDecode = orderType;
                Side sideDecode = side;
                ResponseCategory responseCategoryDecode = responseCategory2;
                Agent agentDecode = agent2;
                InstrumentType instrumentTypeDecode = instrumentType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PinnacleOrderDetails(uuidDecode, orderStateDecode, instrumentTypeDecode, timeDecode, timeDecode2, agentDecode, decimalDecode, cancelLogDecode, responseCategoryDecode, arrayList, decimalDecode2, decimalDecode3, sideDecode, orderTypeDecode, decimalDecode4, strDecode, routeDecode, strDecode2, strDecode3, timeInForceDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            uuidDecode = UUID.ADAPTER.decode(reader);
                            break;
                        case 2:
                            instrumentType = instrumentTypeDecode;
                            agent = agentDecode;
                            responseCategory = responseCategoryDecode;
                            try {
                                orderStateDecode = OrderState.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            instrumentTypeDecode = instrumentType;
                            agentDecode = agent;
                            responseCategoryDecode = responseCategory;
                            break;
                        case 3:
                            instrumentType = instrumentTypeDecode;
                            agent = agentDecode;
                            responseCategory = responseCategoryDecode;
                            try {
                                instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            agentDecode = agent;
                            responseCategoryDecode = responseCategory;
                            break;
                        case 4:
                            timeDecode = Time.ADAPTER.decode(reader);
                            break;
                        case 5:
                            timeDecode2 = Time.ADAPTER.decode(reader);
                            break;
                        case 6:
                            instrumentType = instrumentTypeDecode;
                            agent = agentDecode;
                            responseCategory = responseCategoryDecode;
                            try {
                                agentDecode = Agent.ADAPTER.decode(reader);
                                instrumentTypeDecode = instrumentType;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                            responseCategoryDecode = responseCategory;
                            break;
                        case 7:
                            decimalDecode = Decimal.ADAPTER.decode(reader);
                            break;
                        case 8:
                            cancelLogDecode = CancelLog.ADAPTER.decode(reader);
                            break;
                        case 9:
                            instrumentType = instrumentTypeDecode;
                            agent = agentDecode;
                            responseCategory = responseCategoryDecode;
                            try {
                                responseCategoryDecode = ResponseCategory.ADAPTER.decode(reader);
                                instrumentTypeDecode = instrumentType;
                                agentDecode = agent;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 10:
                            instrumentType = instrumentTypeDecode;
                            agent = agentDecode;
                            responseCategory = responseCategoryDecode;
                            arrayList.add(PinnacleLegDetails.ADAPTER.decode(reader));
                            instrumentTypeDecode = instrumentType;
                            agentDecode = agent;
                            responseCategoryDecode = responseCategory;
                            break;
                        case 11:
                            decimalDecode2 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 12:
                            decimalDecode3 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 13:
                            instrumentType = instrumentTypeDecode;
                            agent = agentDecode;
                            responseCategory = responseCategoryDecode;
                            try {
                                sideDecode = Side.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                            }
                            instrumentTypeDecode = instrumentType;
                            agentDecode = agent;
                            responseCategoryDecode = responseCategory;
                            break;
                        case 14:
                            instrumentType = instrumentTypeDecode;
                            agent = agentDecode;
                            responseCategory = responseCategoryDecode;
                            try {
                                orderTypeDecode = OrderType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                            }
                            instrumentTypeDecode = instrumentType;
                            agentDecode = agent;
                            responseCategoryDecode = responseCategory;
                            break;
                        case 15:
                            decimalDecode4 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 16:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 17:
                            instrumentType = instrumentTypeDecode;
                            agent = agentDecode;
                            responseCategory = responseCategoryDecode;
                            try {
                                routeDecode = Route.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                            }
                            instrumentTypeDecode = instrumentType;
                            agentDecode = agent;
                            responseCategoryDecode = responseCategory;
                            break;
                        case 18:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 19:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 20:
                            try {
                                timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                instrumentType = instrumentTypeDecode;
                                agent = agentDecode;
                                responseCategory = responseCategoryDecode;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                                break;
                            }
                        default:
                            reader.readUnknownField(iNextTag);
                            instrumentType = instrumentTypeDecode;
                            agent = agentDecode;
                            responseCategory = responseCategoryDecode;
                            instrumentTypeDecode = instrumentType;
                            agentDecode = agent;
                            responseCategoryDecode = responseCategory;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PinnacleOrderDetails redact(PinnacleOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID order_id = value.getOrder_id();
                UUID uuidRedact = order_id != null ? UUID.ADAPTER.redact(order_id) : null;
                Time created_at = value.getCreated_at();
                Time timeRedact = created_at != null ? Time.ADAPTER.redact(created_at) : null;
                Time last_sent_at = value.getLast_sent_at();
                Time timeRedact2 = last_sent_at != null ? Time.ADAPTER.redact(last_sent_at) : null;
                Decimal cancelled_quantity = value.getCancelled_quantity();
                Decimal decimalRedact = cancelled_quantity != null ? Decimal.ADAPTER.redact(cancelled_quantity) : null;
                CancelLog latest_cancel_log = value.getLatest_cancel_log();
                CancelLog cancelLogRedact = latest_cancel_log != null ? CancelLog.ADAPTER.redact(latest_cancel_log) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getLegs(), PinnacleLegDetails.ADAPTER);
                Decimal price = value.getPrice();
                Decimal decimalRedact2 = price != null ? Decimal.ADAPTER.redact(price) : null;
                Decimal stop_price = value.getStop_price();
                Decimal decimalRedact3 = stop_price != null ? Decimal.ADAPTER.redact(stop_price) : null;
                Decimal quantity = value.getQuantity();
                return value.copy((1028390 & 1) != 0 ? value.order_id : uuidRedact, (1028390 & 2) != 0 ? value.order_status : null, (1028390 & 4) != 0 ? value.instrument_type : null, (1028390 & 8) != 0 ? value.created_at : timeRedact, (1028390 & 16) != 0 ? value.last_sent_at : timeRedact2, (1028390 & 32) != 0 ? value.created_agent : null, (1028390 & 64) != 0 ? value.cancelled_quantity : decimalRedact, (1028390 & 128) != 0 ? value.latest_cancel_log : cancelLogRedact, (1028390 & 256) != 0 ? value.response_category : null, (1028390 & 512) != 0 ? value.legs : listM26823redactElements, (1028390 & 1024) != 0 ? value.price : decimalRedact2, (1028390 & 2048) != 0 ? value.stop_price : decimalRedact3, (1028390 & 4096) != 0 ? value.side : null, (1028390 & 8192) != 0 ? value.type : null, (1028390 & 16384) != 0 ? value.quantity : quantity != null ? Decimal.ADAPTER.redact(quantity) : null, (1028390 & 32768) != 0 ? value.symbol : null, (1028390 & 65536) != 0 ? value.route : null, (1028390 & 131072) != 0 ? value.clearing_firm : null, (1028390 & 262144) != 0 ? value.response_text : null, (1028390 & 524288) != 0 ? value.time_in_force : null, (1028390 & 1048576) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

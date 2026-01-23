package com.robinhood.rosetta.mainst;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.common.Date;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.InstrumentType;
import rosetta.mainst.MarketState;
import rosetta.mainst.OrderTrigger;
import rosetta.mainst.OrderType;
import rosetta.mainst.Route;
import rosetta.mainst.Side;
import rosetta.mainst.TimeInForce;
import rosetta.order.Agent;
import rosetta.order.MarketHours;
import rosetta.order.ResponseCategory;

/* compiled from: VenueOrderUpdate.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 o2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001oBç\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010*\u001a\u00020+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010-\u001a\u00020.\u0012\b\b\u0002\u0010/\u001a\u000200\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00103\u001a\u000204¢\u0006\u0004\b5\u00106J\b\u0010g\u001a\u00020\u0002H\u0017J\u0013\u0010h\u001a\u00020i2\b\u0010j\u001a\u0004\u0018\u00010kH\u0096\u0002J\b\u0010l\u001a\u00020.H\u0016J\b\u0010m\u001a\u00020\u0004H\u0016Jæ\u0002\u0010n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010*\u001a\u00020+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\b\b\u0002\u00103\u001a\u000204R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00108R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00108R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010DR\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010DR\u0016\u0010\u0015\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010GR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010DR\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010:R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010QR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010<R\u0016\u0010 \u001a\u00020!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0016\u0010\"\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0016\u0010$\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0018\u0010&\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010QR\u0018\u0010'\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010<R\u0018\u0010(\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010DR\u0018\u0010)\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010<R\u0016\u0010*\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0018\u0010,\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010QR\u0016\u0010-\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0016\u0010/\u001a\u0002008\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0018\u00101\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010f¨\u0006p"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/VenueOrderUpdate;", "Lcom/squareup/wire/Message;", "", "cl_ord_id", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUID;", "venue_id", "Lcom/robinhood/rosetta/mainst/NullableString;", "session_id", PlaceTypes.ROUTE, "Lrosetta/mainst/Route;", "fix_conn_id", "state", "Lrosetta/mainst/MarketState;", "sent_at", "Lcom/robinhood/rosetta/mainst/Time;", "confirmed_at", "cancel_open_agent", "Lrosetta/order/Agent;", "cancel_open_time", "cancel_close_agent", "cancel_close_time", "instrument_type", "Lrosetta/mainst/InstrumentType;", "instrument_id", "time_in_force", "Lrosetta/mainst/TimeInForce;", "quantity", "Lcom/robinhood/rosetta/mainst/Decimal;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "response_text", "response_category", "Lrosetta/order/ResponseCategory;", "trigger", "Lrosetta/mainst/OrderTrigger;", "type", "Lrosetta/mainst/OrderType;", "stop_price", "smart_routing_algorithm", "rejected_at", "routing_metadata", "market_hours", "Lrosetta/order/MarketHours;", "executed_notional", "version", "", "side", "Lrosetta/mainst/Side;", "session_date", "Lcom/robinhood/rosetta/common/Date;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/NullableString;Ljava/lang/String;Lrosetta/mainst/Route;Ljava/lang/String;Lrosetta/mainst/MarketState;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/order/Agent;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/order/Agent;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/mainst/InstrumentType;Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/mainst/TimeInForce;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/NullableString;Lrosetta/order/ResponseCategory;Lrosetta/mainst/OrderTrigger;Lrosetta/mainst/OrderType;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/NullableString;Lrosetta/order/MarketHours;Lcom/robinhood/rosetta/mainst/Decimal;ILrosetta/mainst/Side;Lcom/robinhood/rosetta/common/Date;Lokio/ByteString;)V", "getCl_ord_id", "()Ljava/lang/String;", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUID;", "getVenue_id", "()Lcom/robinhood/rosetta/mainst/NullableString;", "getSession_id", "getRoute", "()Lrosetta/mainst/Route;", "getFix_conn_id", "getState", "()Lrosetta/mainst/MarketState;", "getSent_at", "()Lcom/robinhood/rosetta/mainst/Time;", "getConfirmed_at", "getCancel_open_agent", "()Lrosetta/order/Agent;", "getCancel_open_time", "getCancel_close_agent", "getCancel_close_time", "getInstrument_type", "()Lrosetta/mainst/InstrumentType;", "getInstrument_id", "getTime_in_force", "()Lrosetta/mainst/TimeInForce;", "getQuantity", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getPrice", "getResponse_text", "getResponse_category", "()Lrosetta/order/ResponseCategory;", "getTrigger", "()Lrosetta/mainst/OrderTrigger;", "getType", "()Lrosetta/mainst/OrderType;", "getStop_price", "getSmart_routing_algorithm", "getRejected_at", "getRouting_metadata", "getMarket_hours", "()Lrosetta/order/MarketHours;", "getExecuted_notional", "getVersion", "()I", "getSide", "()Lrosetta/mainst/Side;", "getSession_date", "()Lcom/robinhood/rosetta/common/Date;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class VenueOrderUpdate extends Message {

    @JvmField
    public static final ProtoAdapter<VenueOrderUpdate> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "rosetta.order.Agent#ADAPTER", jsonName = "cancelCloseAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Agent cancel_close_agent;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "cancelCloseTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Time cancel_close_time;

    @WireField(adapter = "rosetta.order.Agent#ADAPTER", jsonName = "cancelOpenAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Agent cancel_open_agent;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "cancelOpenTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Time cancel_open_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clOrdId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String cl_ord_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "confirmedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Time confirmed_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "executedNotional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 29)
    private final Decimal executed_notional;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fixConnId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String fix_conn_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final UUID instrument_id;

    @WireField(adapter = "rosetta.mainst.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final InstrumentType instrument_type;

    @WireField(adapter = "rosetta.order.MarketHours#ADAPTER", jsonName = "marketHours", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 28)
    private final MarketHours market_hours;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final UUID order_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final Decimal price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final Decimal quantity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "rejectedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 26)
    private final Time rejected_at;

    @WireField(adapter = "rosetta.order.ResponseCategory#ADAPTER", jsonName = "responseCategory", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final ResponseCategory response_category;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "responseText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final NullableString response_text;

    @WireField(adapter = "rosetta.mainst.Route#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Route route;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "routingMetadata", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 27)
    private final NullableString routing_metadata;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "sentAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Time sent_at;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "sessionDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 30, tag = 32)
    private final Date session_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String session_id;

    @WireField(adapter = "rosetta.mainst.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 31)
    private final Side side;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "smartRoutingAlgorithm", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 25)
    private final NullableString smart_routing_algorithm;

    @WireField(adapter = "rosetta.mainst.MarketState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final MarketState state;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "stopPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 24)
    private final Decimal stop_price;

    @WireField(adapter = "rosetta.mainst.TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final TimeInForce time_in_force;

    @WireField(adapter = "rosetta.mainst.OrderTrigger#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 22)
    private final OrderTrigger trigger;

    @WireField(adapter = "rosetta.mainst.OrderType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 23)
    private final OrderType type;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "venueId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final NullableString venue_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 30)
    private final int version;

    public VenueOrderUpdate() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, -1, null);
    }

    public /* synthetic */ VenueOrderUpdate(String str, UUID uuid, NullableString nullableString, String str2, Route route, String str3, MarketState marketState, Time time, Time time2, Agent agent, Time time3, Agent agent2, Time time4, InstrumentType instrumentType, UUID uuid2, TimeInForce timeInForce, Decimal decimal, Decimal decimal2, NullableString nullableString2, ResponseCategory responseCategory, OrderTrigger orderTrigger, OrderType orderType, Decimal decimal3, NullableString nullableString3, Time time5, NullableString nullableString4, MarketHours marketHours, Decimal decimal4, int i, Side side, Date date, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : uuid, (i2 & 4) != 0 ? null : nullableString, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? Route.ROUTE_UNSPECIFIED : route, (i2 & 32) == 0 ? str3 : "", (i2 & 64) != 0 ? MarketState.MARKET_STATE_UNSPECIFIED : marketState, (i2 & 128) != 0 ? null : time, (i2 & 256) != 0 ? null : time2, (i2 & 512) != 0 ? Agent.AGENT_UNSPECIFIED : agent, (i2 & 1024) != 0 ? null : time3, (i2 & 2048) != 0 ? Agent.AGENT_UNSPECIFIED : agent2, (i2 & 4096) != 0 ? null : time4, (i2 & 8192) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i2 & 16384) != 0 ? null : uuid2, (i2 & 32768) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i2 & 65536) != 0 ? null : decimal, (i2 & 131072) != 0 ? null : decimal2, (i2 & 262144) != 0 ? null : nullableString2, (i2 & 524288) != 0 ? ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED : responseCategory, (i2 & 1048576) != 0 ? OrderTrigger.ORDER_TRIGGER_UNSPECIFIED : orderTrigger, (i2 & 2097152) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i2 & 4194304) != 0 ? null : decimal3, (i2 & 8388608) != 0 ? null : nullableString3, (i2 & 16777216) != 0 ? null : time5, (i2 & 33554432) != 0 ? null : nullableString4, (i2 & 67108864) != 0 ? MarketHours.MARKET_HOURS_UNSPECIFIED : marketHours, (i2 & 134217728) != 0 ? null : decimal4, (i2 & 268435456) != 0 ? 0 : i, (i2 & 536870912) != 0 ? Side.SIDE_UNSPECIFIED : side, (i2 & 1073741824) != 0 ? null : date, (i2 & Integer.MIN_VALUE) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24710newBuilder();
    }

    public final String getCl_ord_id() {
        return this.cl_ord_id;
    }

    public final UUID getOrder_id() {
        return this.order_id;
    }

    public final NullableString getVenue_id() {
        return this.venue_id;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final Route getRoute() {
        return this.route;
    }

    public final String getFix_conn_id() {
        return this.fix_conn_id;
    }

    public final MarketState getState() {
        return this.state;
    }

    public final Time getSent_at() {
        return this.sent_at;
    }

    public final Time getConfirmed_at() {
        return this.confirmed_at;
    }

    public final Agent getCancel_open_agent() {
        return this.cancel_open_agent;
    }

    public final Time getCancel_open_time() {
        return this.cancel_open_time;
    }

    public final Agent getCancel_close_agent() {
        return this.cancel_close_agent;
    }

    public final Time getCancel_close_time() {
        return this.cancel_close_time;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    public final UUID getInstrument_id() {
        return this.instrument_id;
    }

    public final TimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    public final Decimal getQuantity() {
        return this.quantity;
    }

    public final Decimal getPrice() {
        return this.price;
    }

    public final NullableString getResponse_text() {
        return this.response_text;
    }

    public final ResponseCategory getResponse_category() {
        return this.response_category;
    }

    public final OrderTrigger getTrigger() {
        return this.trigger;
    }

    public final OrderType getType() {
        return this.type;
    }

    public final Decimal getStop_price() {
        return this.stop_price;
    }

    public final NullableString getSmart_routing_algorithm() {
        return this.smart_routing_algorithm;
    }

    public final Time getRejected_at() {
        return this.rejected_at;
    }

    public final NullableString getRouting_metadata() {
        return this.routing_metadata;
    }

    public final MarketHours getMarket_hours() {
        return this.market_hours;
    }

    public final Decimal getExecuted_notional() {
        return this.executed_notional;
    }

    public final int getVersion() {
        return this.version;
    }

    public final Side getSide() {
        return this.side;
    }

    public final Date getSession_date() {
        return this.session_date;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VenueOrderUpdate(String cl_ord_id, UUID uuid, NullableString nullableString, String session_id, Route route, String fix_conn_id, MarketState state, Time time, Time time2, Agent cancel_open_agent, Time time3, Agent cancel_close_agent, Time time4, InstrumentType instrument_type, UUID uuid2, TimeInForce time_in_force, Decimal decimal, Decimal decimal2, NullableString nullableString2, ResponseCategory response_category, OrderTrigger trigger, OrderType type2, Decimal decimal3, NullableString nullableString3, Time time5, NullableString nullableString4, MarketHours market_hours, Decimal decimal4, int i, Side side, Date date, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(cl_ord_id, "cl_ord_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(fix_conn_id, "fix_conn_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
        Intrinsics.checkNotNullParameter(cancel_close_agent, "cancel_close_agent");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(response_category, "response_category");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.cl_ord_id = cl_ord_id;
        this.order_id = uuid;
        this.venue_id = nullableString;
        this.session_id = session_id;
        this.route = route;
        this.fix_conn_id = fix_conn_id;
        this.state = state;
        this.sent_at = time;
        this.confirmed_at = time2;
        this.cancel_open_agent = cancel_open_agent;
        this.cancel_open_time = time3;
        this.cancel_close_agent = cancel_close_agent;
        this.cancel_close_time = time4;
        this.instrument_type = instrument_type;
        this.instrument_id = uuid2;
        this.time_in_force = time_in_force;
        this.quantity = decimal;
        this.price = decimal2;
        this.response_text = nullableString2;
        this.response_category = response_category;
        this.trigger = trigger;
        this.type = type2;
        this.stop_price = decimal3;
        this.smart_routing_algorithm = nullableString3;
        this.rejected_at = time5;
        this.routing_metadata = nullableString4;
        this.market_hours = market_hours;
        this.executed_notional = decimal4;
        this.version = i;
        this.side = side;
        this.session_date = date;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24710newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof VenueOrderUpdate)) {
            return false;
        }
        VenueOrderUpdate venueOrderUpdate = (VenueOrderUpdate) other;
        return Intrinsics.areEqual(unknownFields(), venueOrderUpdate.unknownFields()) && Intrinsics.areEqual(this.cl_ord_id, venueOrderUpdate.cl_ord_id) && Intrinsics.areEqual(this.order_id, venueOrderUpdate.order_id) && Intrinsics.areEqual(this.venue_id, venueOrderUpdate.venue_id) && Intrinsics.areEqual(this.session_id, venueOrderUpdate.session_id) && this.route == venueOrderUpdate.route && Intrinsics.areEqual(this.fix_conn_id, venueOrderUpdate.fix_conn_id) && this.state == venueOrderUpdate.state && Intrinsics.areEqual(this.sent_at, venueOrderUpdate.sent_at) && Intrinsics.areEqual(this.confirmed_at, venueOrderUpdate.confirmed_at) && this.cancel_open_agent == venueOrderUpdate.cancel_open_agent && Intrinsics.areEqual(this.cancel_open_time, venueOrderUpdate.cancel_open_time) && this.cancel_close_agent == venueOrderUpdate.cancel_close_agent && Intrinsics.areEqual(this.cancel_close_time, venueOrderUpdate.cancel_close_time) && this.instrument_type == venueOrderUpdate.instrument_type && Intrinsics.areEqual(this.instrument_id, venueOrderUpdate.instrument_id) && this.time_in_force == venueOrderUpdate.time_in_force && Intrinsics.areEqual(this.quantity, venueOrderUpdate.quantity) && Intrinsics.areEqual(this.price, venueOrderUpdate.price) && Intrinsics.areEqual(this.response_text, venueOrderUpdate.response_text) && this.response_category == venueOrderUpdate.response_category && this.trigger == venueOrderUpdate.trigger && this.type == venueOrderUpdate.type && Intrinsics.areEqual(this.stop_price, venueOrderUpdate.stop_price) && Intrinsics.areEqual(this.smart_routing_algorithm, venueOrderUpdate.smart_routing_algorithm) && Intrinsics.areEqual(this.rejected_at, venueOrderUpdate.rejected_at) && Intrinsics.areEqual(this.routing_metadata, venueOrderUpdate.routing_metadata) && this.market_hours == venueOrderUpdate.market_hours && Intrinsics.areEqual(this.executed_notional, venueOrderUpdate.executed_notional) && this.version == venueOrderUpdate.version && this.side == venueOrderUpdate.side && Intrinsics.areEqual(this.session_date, venueOrderUpdate.session_date);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.cl_ord_id.hashCode()) * 37;
        UUID uuid = this.order_id;
        int iHashCode2 = (iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37;
        NullableString nullableString = this.venue_id;
        int iHashCode3 = (((((((((iHashCode2 + (nullableString != null ? nullableString.hashCode() : 0)) * 37) + this.session_id.hashCode()) * 37) + this.route.hashCode()) * 37) + this.fix_conn_id.hashCode()) * 37) + this.state.hashCode()) * 37;
        Time time = this.sent_at;
        int iHashCode4 = (iHashCode3 + (time != null ? time.hashCode() : 0)) * 37;
        Time time2 = this.confirmed_at;
        int iHashCode5 = (((iHashCode4 + (time2 != null ? time2.hashCode() : 0)) * 37) + this.cancel_open_agent.hashCode()) * 37;
        Time time3 = this.cancel_open_time;
        int iHashCode6 = (((iHashCode5 + (time3 != null ? time3.hashCode() : 0)) * 37) + this.cancel_close_agent.hashCode()) * 37;
        Time time4 = this.cancel_close_time;
        int iHashCode7 = (((iHashCode6 + (time4 != null ? time4.hashCode() : 0)) * 37) + this.instrument_type.hashCode()) * 37;
        UUID uuid2 = this.instrument_id;
        int iHashCode8 = (((iHashCode7 + (uuid2 != null ? uuid2.hashCode() : 0)) * 37) + this.time_in_force.hashCode()) * 37;
        Decimal decimal = this.quantity;
        int iHashCode9 = (iHashCode8 + (decimal != null ? decimal.hashCode() : 0)) * 37;
        Decimal decimal2 = this.price;
        int iHashCode10 = (iHashCode9 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        NullableString nullableString2 = this.response_text;
        int iHashCode11 = (((((((iHashCode10 + (nullableString2 != null ? nullableString2.hashCode() : 0)) * 37) + this.response_category.hashCode()) * 37) + this.trigger.hashCode()) * 37) + this.type.hashCode()) * 37;
        Decimal decimal3 = this.stop_price;
        int iHashCode12 = (iHashCode11 + (decimal3 != null ? decimal3.hashCode() : 0)) * 37;
        NullableString nullableString3 = this.smart_routing_algorithm;
        int iHashCode13 = (iHashCode12 + (nullableString3 != null ? nullableString3.hashCode() : 0)) * 37;
        Time time5 = this.rejected_at;
        int iHashCode14 = (iHashCode13 + (time5 != null ? time5.hashCode() : 0)) * 37;
        NullableString nullableString4 = this.routing_metadata;
        int iHashCode15 = (((iHashCode14 + (nullableString4 != null ? nullableString4.hashCode() : 0)) * 37) + this.market_hours.hashCode()) * 37;
        Decimal decimal4 = this.executed_notional;
        int iHashCode16 = (((((iHashCode15 + (decimal4 != null ? decimal4.hashCode() : 0)) * 37) + Integer.hashCode(this.version)) * 37) + this.side.hashCode()) * 37;
        Date date = this.session_date;
        int iHashCode17 = iHashCode16 + (date != null ? date.hashCode() : 0);
        this.hashCode = iHashCode17;
        return iHashCode17;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("cl_ord_id=" + Internal.sanitize(this.cl_ord_id));
        UUID uuid = this.order_id;
        if (uuid != null) {
            arrayList.add("order_id=" + uuid);
        }
        NullableString nullableString = this.venue_id;
        if (nullableString != null) {
            arrayList.add("venue_id=" + nullableString);
        }
        arrayList.add("session_id=" + Internal.sanitize(this.session_id));
        arrayList.add("route=" + this.route);
        arrayList.add("fix_conn_id=" + Internal.sanitize(this.fix_conn_id));
        arrayList.add("state=" + this.state);
        Time time = this.sent_at;
        if (time != null) {
            arrayList.add("sent_at=" + time);
        }
        Time time2 = this.confirmed_at;
        if (time2 != null) {
            arrayList.add("confirmed_at=" + time2);
        }
        arrayList.add("cancel_open_agent=" + this.cancel_open_agent);
        Time time3 = this.cancel_open_time;
        if (time3 != null) {
            arrayList.add("cancel_open_time=" + time3);
        }
        arrayList.add("cancel_close_agent=" + this.cancel_close_agent);
        Time time4 = this.cancel_close_time;
        if (time4 != null) {
            arrayList.add("cancel_close_time=" + time4);
        }
        arrayList.add("instrument_type=" + this.instrument_type);
        UUID uuid2 = this.instrument_id;
        if (uuid2 != null) {
            arrayList.add("instrument_id=" + uuid2);
        }
        arrayList.add("time_in_force=" + this.time_in_force);
        Decimal decimal = this.quantity;
        if (decimal != null) {
            arrayList.add("quantity=" + decimal);
        }
        Decimal decimal2 = this.price;
        if (decimal2 != null) {
            arrayList.add("price=" + decimal2);
        }
        NullableString nullableString2 = this.response_text;
        if (nullableString2 != null) {
            arrayList.add("response_text=" + nullableString2);
        }
        arrayList.add("response_category=" + this.response_category);
        arrayList.add("trigger=" + this.trigger);
        arrayList.add("type=" + this.type);
        Decimal decimal3 = this.stop_price;
        if (decimal3 != null) {
            arrayList.add("stop_price=" + decimal3);
        }
        NullableString nullableString3 = this.smart_routing_algorithm;
        if (nullableString3 != null) {
            arrayList.add("smart_routing_algorithm=" + nullableString3);
        }
        Time time5 = this.rejected_at;
        if (time5 != null) {
            arrayList.add("rejected_at=" + time5);
        }
        NullableString nullableString4 = this.routing_metadata;
        if (nullableString4 != null) {
            arrayList.add("routing_metadata=" + nullableString4);
        }
        arrayList.add("market_hours=" + this.market_hours);
        Decimal decimal4 = this.executed_notional;
        if (decimal4 != null) {
            arrayList.add("executed_notional=" + decimal4);
        }
        arrayList.add("version=" + this.version);
        arrayList.add("side=" + this.side);
        Date date = this.session_date;
        if (date != null) {
            arrayList.add("session_date=" + date);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VenueOrderUpdate{", "}", 0, null, null, 56, null);
    }

    public final VenueOrderUpdate copy(String cl_ord_id, UUID order_id, NullableString venue_id, String session_id, Route route, String fix_conn_id, MarketState state, Time sent_at, Time confirmed_at, Agent cancel_open_agent, Time cancel_open_time, Agent cancel_close_agent, Time cancel_close_time, InstrumentType instrument_type, UUID instrument_id, TimeInForce time_in_force, Decimal quantity, Decimal price, NullableString response_text, ResponseCategory response_category, OrderTrigger trigger, OrderType type2, Decimal stop_price, NullableString smart_routing_algorithm, Time rejected_at, NullableString routing_metadata, MarketHours market_hours, Decimal executed_notional, int version, Side side, Date session_date, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(cl_ord_id, "cl_ord_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(fix_conn_id, "fix_conn_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
        Intrinsics.checkNotNullParameter(cancel_close_agent, "cancel_close_agent");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(response_category, "response_category");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new VenueOrderUpdate(cl_ord_id, order_id, venue_id, session_id, route, fix_conn_id, state, sent_at, confirmed_at, cancel_open_agent, cancel_open_time, cancel_close_agent, cancel_close_time, instrument_type, instrument_id, time_in_force, quantity, price, response_text, response_category, trigger, type2, stop_price, smart_routing_algorithm, rejected_at, routing_metadata, market_hours, executed_notional, version, side, session_date, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(VenueOrderUpdate.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<VenueOrderUpdate>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.VenueOrderUpdate$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(VenueOrderUpdate value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCl_ord_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCl_ord_id());
                }
                if (value.getOrder_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(2, value.getOrder_id());
                }
                if (value.getVenue_id() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(3, value.getVenue_id());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSession_id());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    size += Route.ADAPTER.encodedSizeWithTag(5, value.getRoute());
                }
                if (!Intrinsics.areEqual(value.getFix_conn_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getFix_conn_id());
                }
                if (value.getState() != MarketState.MARKET_STATE_UNSPECIFIED) {
                    size += MarketState.ADAPTER.encodedSizeWithTag(7, value.getState());
                }
                if (value.getSent_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(8, value.getSent_at());
                }
                if (value.getConfirmed_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(9, value.getConfirmed_at());
                }
                Agent cancel_open_agent = value.getCancel_open_agent();
                Agent agent = Agent.AGENT_UNSPECIFIED;
                if (cancel_open_agent != agent) {
                    size += Agent.ADAPTER.encodedSizeWithTag(10, value.getCancel_open_agent());
                }
                if (value.getCancel_open_time() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(11, value.getCancel_open_time());
                }
                if (value.getCancel_close_agent() != agent) {
                    size += Agent.ADAPTER.encodedSizeWithTag(12, value.getCancel_close_agent());
                }
                if (value.getCancel_close_time() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(13, value.getCancel_close_time());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    size += InstrumentType.ADAPTER.encodedSizeWithTag(14, value.getInstrument_type());
                }
                if (value.getInstrument_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(15, value.getInstrument_id());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    size += TimeInForce.ADAPTER.encodedSizeWithTag(16, value.getTime_in_force());
                }
                if (value.getQuantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(17, value.getQuantity());
                }
                if (value.getPrice() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(18, value.getPrice());
                }
                if (value.getResponse_text() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(19, value.getResponse_text());
                }
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    size += ResponseCategory.ADAPTER.encodedSizeWithTag(20, value.getResponse_category());
                }
                if (value.getTrigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    size += OrderTrigger.ADAPTER.encodedSizeWithTag(22, value.getTrigger());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    size += OrderType.ADAPTER.encodedSizeWithTag(23, value.getType());
                }
                if (value.getStop_price() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(24, value.getStop_price());
                }
                if (value.getSmart_routing_algorithm() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(25, value.getSmart_routing_algorithm());
                }
                if (value.getRejected_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(26, value.getRejected_at());
                }
                if (value.getRouting_metadata() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(27, value.getRouting_metadata());
                }
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    size += MarketHours.ADAPTER.encodedSizeWithTag(28, value.getMarket_hours());
                }
                if (value.getExecuted_notional() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(29, value.getExecuted_notional());
                }
                if (value.getVersion() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(30, Integer.valueOf(value.getVersion()));
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(31, value.getSide());
                }
                return value.getSession_date() != null ? size + Date.ADAPTER.encodedSizeWithTag(32, value.getSession_date()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, VenueOrderUpdate value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCl_ord_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCl_ord_id());
                }
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (value.getVenue_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 3, (int) value.getVenue_id());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSession_id());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 5, (int) value.getRoute());
                }
                if (!Intrinsics.areEqual(value.getFix_conn_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getFix_conn_id());
                }
                if (value.getState() != MarketState.MARKET_STATE_UNSPECIFIED) {
                    MarketState.ADAPTER.encodeWithTag(writer, 7, (int) value.getState());
                }
                if (value.getSent_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 8, (int) value.getSent_at());
                }
                if (value.getConfirmed_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 9, (int) value.getConfirmed_at());
                }
                Agent cancel_open_agent = value.getCancel_open_agent();
                Agent agent = Agent.AGENT_UNSPECIFIED;
                if (cancel_open_agent != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 10, (int) value.getCancel_open_agent());
                }
                if (value.getCancel_open_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 11, (int) value.getCancel_open_time());
                }
                if (value.getCancel_close_agent() != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 12, (int) value.getCancel_close_agent());
                }
                if (value.getCancel_close_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 13, (int) value.getCancel_close_time());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 14, (int) value.getInstrument_type());
                }
                if (value.getInstrument_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 15, (int) value.getInstrument_id());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 16, (int) value.getTime_in_force());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 17, (int) value.getQuantity());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 18, (int) value.getPrice());
                }
                if (value.getResponse_text() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 19, (int) value.getResponse_text());
                }
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    ResponseCategory.ADAPTER.encodeWithTag(writer, 20, (int) value.getResponse_category());
                }
                if (value.getTrigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    OrderTrigger.ADAPTER.encodeWithTag(writer, 22, (int) value.getTrigger());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 23, (int) value.getType());
                }
                if (value.getStop_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 24, (int) value.getStop_price());
                }
                if (value.getSmart_routing_algorithm() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 25, (int) value.getSmart_routing_algorithm());
                }
                if (value.getRejected_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 26, (int) value.getRejected_at());
                }
                if (value.getRouting_metadata() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 27, (int) value.getRouting_metadata());
                }
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    MarketHours.ADAPTER.encodeWithTag(writer, 28, (int) value.getMarket_hours());
                }
                if (value.getExecuted_notional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 29, (int) value.getExecuted_notional());
                }
                if (value.getVersion() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 30, (int) Integer.valueOf(value.getVersion()));
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 31, (int) value.getSide());
                }
                if (value.getSession_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 32, (int) value.getSession_date());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, VenueOrderUpdate value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSession_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 32, (int) value.getSession_date());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 31, (int) value.getSide());
                }
                if (value.getVersion() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 30, (int) Integer.valueOf(value.getVersion()));
                }
                if (value.getExecuted_notional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 29, (int) value.getExecuted_notional());
                }
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    MarketHours.ADAPTER.encodeWithTag(writer, 28, (int) value.getMarket_hours());
                }
                if (value.getRouting_metadata() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 27, (int) value.getRouting_metadata());
                }
                if (value.getRejected_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 26, (int) value.getRejected_at());
                }
                if (value.getSmart_routing_algorithm() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 25, (int) value.getSmart_routing_algorithm());
                }
                if (value.getStop_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 24, (int) value.getStop_price());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 23, (int) value.getType());
                }
                if (value.getTrigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    OrderTrigger.ADAPTER.encodeWithTag(writer, 22, (int) value.getTrigger());
                }
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    ResponseCategory.ADAPTER.encodeWithTag(writer, 20, (int) value.getResponse_category());
                }
                if (value.getResponse_text() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 19, (int) value.getResponse_text());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 18, (int) value.getPrice());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 17, (int) value.getQuantity());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 16, (int) value.getTime_in_force());
                }
                if (value.getInstrument_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 15, (int) value.getInstrument_id());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 14, (int) value.getInstrument_type());
                }
                if (value.getCancel_close_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 13, (int) value.getCancel_close_time());
                }
                Agent cancel_close_agent = value.getCancel_close_agent();
                Agent agent = Agent.AGENT_UNSPECIFIED;
                if (cancel_close_agent != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 12, (int) value.getCancel_close_agent());
                }
                if (value.getCancel_open_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 11, (int) value.getCancel_open_time());
                }
                if (value.getCancel_open_agent() != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 10, (int) value.getCancel_open_agent());
                }
                if (value.getConfirmed_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 9, (int) value.getConfirmed_at());
                }
                if (value.getSent_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 8, (int) value.getSent_at());
                }
                if (value.getState() != MarketState.MARKET_STATE_UNSPECIFIED) {
                    MarketState.ADAPTER.encodeWithTag(writer, 7, (int) value.getState());
                }
                if (!Intrinsics.areEqual(value.getFix_conn_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getFix_conn_id());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 5, (int) value.getRoute());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSession_id());
                }
                if (value.getVenue_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 3, (int) value.getVenue_id());
                }
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (Intrinsics.areEqual(value.getCl_ord_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCl_ord_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public VenueOrderUpdate decode(ProtoReader reader) throws IOException {
                MarketState marketState;
                Agent agent;
                Agent agent2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Route route = Route.ROUTE_UNSPECIFIED;
                MarketState marketState2 = MarketState.MARKET_STATE_UNSPECIFIED;
                Agent agent3 = Agent.AGENT_UNSPECIFIED;
                InstrumentType instrumentType = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                TimeInForce timeInForce = TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                ResponseCategory responseCategory = ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED;
                OrderTrigger orderTrigger = OrderTrigger.ORDER_TRIGGER_UNSPECIFIED;
                OrderType orderType = OrderType.ORDER_TYPE_UNSPECIFIED;
                MarketHours marketHours = MarketHours.MARKET_HOURS_UNSPECIFIED;
                Side side = Side.SIDE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Route routeDecode = route;
                String strDecode = "";
                String strDecode2 = strDecode;
                UUID uuidDecode = null;
                NullableString nullableStringDecode = null;
                Time timeDecode = null;
                Time timeDecode2 = null;
                Time timeDecode3 = null;
                Time timeDecode4 = null;
                UUID uuidDecode2 = null;
                Decimal decimalDecode = null;
                Decimal decimalDecode2 = null;
                NullableString nullableStringDecode2 = null;
                Decimal decimalDecode3 = null;
                NullableString nullableStringDecode3 = null;
                Time timeDecode5 = null;
                NullableString nullableStringDecode4 = null;
                Decimal decimalDecode4 = null;
                Date dateDecode = null;
                int iIntValue = 0;
                MarketHours marketHoursDecode = marketHours;
                Side sideDecode = side;
                String strDecode3 = strDecode2;
                OrderTrigger orderTriggerDecode = orderTrigger;
                OrderType orderTypeDecode = orderType;
                TimeInForce timeInForceDecode = timeInForce;
                ResponseCategory responseCategoryDecode = responseCategory;
                Agent agentDecode = agent3;
                InstrumentType instrumentTypeDecode = instrumentType;
                MarketState marketStateDecode = marketState2;
                Agent agentDecode2 = agentDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                uuidDecode = UUID.ADAPTER.decode(reader);
                                break;
                            case 3:
                                nullableStringDecode = NullableString.ADAPTER.decode(reader);
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                marketState = marketStateDecode;
                                agent = agentDecode2;
                                agent2 = agentDecode;
                                try {
                                    routeDecode = Route.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                marketStateDecode = marketState;
                                agentDecode2 = agent;
                                agentDecode = agent2;
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                marketState = marketStateDecode;
                                agent = agentDecode2;
                                agent2 = agentDecode;
                                try {
                                    marketStateDecode = MarketState.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                agentDecode2 = agent;
                                agentDecode = agent2;
                                break;
                            case 8:
                                timeDecode = Time.ADAPTER.decode(reader);
                                break;
                            case 9:
                                timeDecode2 = Time.ADAPTER.decode(reader);
                                break;
                            case 10:
                                marketState = marketStateDecode;
                                agent = agentDecode2;
                                agent2 = agentDecode;
                                try {
                                    agentDecode2 = Agent.ADAPTER.decode(reader);
                                    marketStateDecode = marketState;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                agentDecode = agent2;
                                break;
                            case 11:
                                timeDecode3 = Time.ADAPTER.decode(reader);
                                break;
                            case 12:
                                marketState = marketStateDecode;
                                agent = agentDecode2;
                                agent2 = agentDecode;
                                try {
                                    agentDecode = Agent.ADAPTER.decode(reader);
                                    marketStateDecode = marketState;
                                    agentDecode2 = agent;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 13:
                                timeDecode4 = Time.ADAPTER.decode(reader);
                                break;
                            case 14:
                                marketState = marketStateDecode;
                                agent = agentDecode2;
                                agent2 = agentDecode;
                                try {
                                    instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                }
                                marketStateDecode = marketState;
                                agentDecode2 = agent;
                                agentDecode = agent2;
                                break;
                            case 15:
                                uuidDecode2 = UUID.ADAPTER.decode(reader);
                                break;
                            case 16:
                                marketState = marketStateDecode;
                                agent = agentDecode2;
                                agent2 = agentDecode;
                                try {
                                    timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                }
                                marketStateDecode = marketState;
                                agentDecode2 = agent;
                                agentDecode = agent2;
                                break;
                            case 17:
                                decimalDecode = Decimal.ADAPTER.decode(reader);
                                break;
                            case 18:
                                decimalDecode2 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 19:
                                nullableStringDecode2 = NullableString.ADAPTER.decode(reader);
                                break;
                            case 20:
                                marketState = marketStateDecode;
                                agent = agentDecode2;
                                agent2 = agentDecode;
                                try {
                                    responseCategoryDecode = ResponseCategory.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                                }
                                marketStateDecode = marketState;
                                agentDecode2 = agent;
                                agentDecode = agent2;
                                break;
                            case 21:
                            default:
                                reader.readUnknownField(iNextTag);
                                marketState = marketStateDecode;
                                agent = agentDecode2;
                                agent2 = agentDecode;
                                marketStateDecode = marketState;
                                agentDecode2 = agent;
                                agentDecode = agent2;
                                break;
                            case 22:
                                marketState = marketStateDecode;
                                agent = agentDecode2;
                                agent2 = agentDecode;
                                try {
                                    orderTriggerDecode = OrderTrigger.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                                }
                                marketStateDecode = marketState;
                                agentDecode2 = agent;
                                agentDecode = agent2;
                                break;
                            case 23:
                                marketState = marketStateDecode;
                                agent = agentDecode2;
                                agent2 = agentDecode;
                                try {
                                    orderTypeDecode = OrderType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e9.value));
                                }
                                marketStateDecode = marketState;
                                agentDecode2 = agent;
                                agentDecode = agent2;
                                break;
                            case 24:
                                decimalDecode3 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 25:
                                nullableStringDecode3 = NullableString.ADAPTER.decode(reader);
                                break;
                            case 26:
                                timeDecode5 = Time.ADAPTER.decode(reader);
                                break;
                            case 27:
                                nullableStringDecode4 = NullableString.ADAPTER.decode(reader);
                                break;
                            case 28:
                                marketState = marketStateDecode;
                                agent = agentDecode2;
                                agent2 = agentDecode;
                                try {
                                    marketHoursDecode = MarketHours.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                }
                                marketStateDecode = marketState;
                                agentDecode2 = agent;
                                agentDecode = agent2;
                                break;
                            case 29:
                                decimalDecode4 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 30:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 31:
                                try {
                                    sideDecode = Side.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                    marketState = marketStateDecode;
                                    agent = agentDecode2;
                                    agent2 = agentDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                                    break;
                                }
                            case 32:
                                dateDecode = Date.ADAPTER.decode(reader);
                                break;
                        }
                    } else {
                        return new VenueOrderUpdate(strDecode3, uuidDecode, nullableStringDecode, strDecode, routeDecode, strDecode2, marketStateDecode, timeDecode, timeDecode2, agentDecode2, timeDecode3, agentDecode, timeDecode4, instrumentTypeDecode, uuidDecode2, timeInForceDecode, decimalDecode, decimalDecode2, nullableStringDecode2, responseCategoryDecode, orderTriggerDecode, orderTypeDecode, decimalDecode3, nullableStringDecode3, timeDecode5, nullableStringDecode4, marketHoursDecode, decimalDecode4, iIntValue, sideDecode, dateDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public VenueOrderUpdate redact(VenueOrderUpdate value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID order_id = value.getOrder_id();
                UUID uuidRedact = order_id != null ? UUID.ADAPTER.redact(order_id) : null;
                NullableString venue_id = value.getVenue_id();
                NullableString nullableStringRedact = venue_id != null ? NullableString.ADAPTER.redact(venue_id) : null;
                Time sent_at = value.getSent_at();
                Time timeRedact = sent_at != null ? Time.ADAPTER.redact(sent_at) : null;
                Time confirmed_at = value.getConfirmed_at();
                Time timeRedact2 = confirmed_at != null ? Time.ADAPTER.redact(confirmed_at) : null;
                Time cancel_open_time = value.getCancel_open_time();
                Time timeRedact3 = cancel_open_time != null ? Time.ADAPTER.redact(cancel_open_time) : null;
                Time cancel_close_time = value.getCancel_close_time();
                Time timeRedact4 = cancel_close_time != null ? Time.ADAPTER.redact(cancel_close_time) : null;
                UUID instrument_id = value.getInstrument_id();
                UUID uuidRedact2 = instrument_id != null ? UUID.ADAPTER.redact(instrument_id) : null;
                Decimal quantity = value.getQuantity();
                Decimal decimalRedact = quantity != null ? Decimal.ADAPTER.redact(quantity) : null;
                Decimal price = value.getPrice();
                Decimal decimalRedact2 = price != null ? Decimal.ADAPTER.redact(price) : null;
                NullableString response_text = value.getResponse_text();
                NullableString nullableStringRedact2 = response_text != null ? NullableString.ADAPTER.redact(response_text) : null;
                Decimal stop_price = value.getStop_price();
                Decimal decimalRedact3 = stop_price != null ? Decimal.ADAPTER.redact(stop_price) : null;
                NullableString smart_routing_algorithm = value.getSmart_routing_algorithm();
                NullableString nullableStringRedact3 = smart_routing_algorithm != null ? NullableString.ADAPTER.redact(smart_routing_algorithm) : null;
                Time rejected_at = value.getRejected_at();
                Time timeRedact5 = rejected_at != null ? Time.ADAPTER.redact(rejected_at) : null;
                NullableString routing_metadata = value.getRouting_metadata();
                NullableString nullableStringRedact4 = routing_metadata != null ? NullableString.ADAPTER.redact(routing_metadata) : null;
                Decimal executed_notional = value.getExecuted_notional();
                Decimal decimalRedact4 = executed_notional != null ? Decimal.ADAPTER.redact(executed_notional) : null;
                Date session_date = value.getSession_date();
                return value.copy((876128889 & 1) != 0 ? value.cl_ord_id : null, (876128889 & 2) != 0 ? value.order_id : uuidRedact, (876128889 & 4) != 0 ? value.venue_id : nullableStringRedact, (876128889 & 8) != 0 ? value.session_id : null, (876128889 & 16) != 0 ? value.route : null, (876128889 & 32) != 0 ? value.fix_conn_id : null, (876128889 & 64) != 0 ? value.state : null, (876128889 & 128) != 0 ? value.sent_at : timeRedact, (876128889 & 256) != 0 ? value.confirmed_at : timeRedact2, (876128889 & 512) != 0 ? value.cancel_open_agent : null, (876128889 & 1024) != 0 ? value.cancel_open_time : timeRedact3, (876128889 & 2048) != 0 ? value.cancel_close_agent : null, (876128889 & 4096) != 0 ? value.cancel_close_time : timeRedact4, (876128889 & 8192) != 0 ? value.instrument_type : null, (876128889 & 16384) != 0 ? value.instrument_id : uuidRedact2, (876128889 & 32768) != 0 ? value.time_in_force : null, (876128889 & 65536) != 0 ? value.quantity : decimalRedact, (876128889 & 131072) != 0 ? value.price : decimalRedact2, (876128889 & 262144) != 0 ? value.response_text : nullableStringRedact2, (876128889 & 524288) != 0 ? value.response_category : null, (876128889 & 1048576) != 0 ? value.trigger : null, (876128889 & 2097152) != 0 ? value.type : null, (876128889 & 4194304) != 0 ? value.stop_price : decimalRedact3, (876128889 & 8388608) != 0 ? value.smart_routing_algorithm : nullableStringRedact3, (876128889 & 16777216) != 0 ? value.rejected_at : timeRedact5, (876128889 & 33554432) != 0 ? value.routing_metadata : nullableStringRedact4, (876128889 & 67108864) != 0 ? value.market_hours : null, (876128889 & 134217728) != 0 ? value.executed_notional : decimalRedact4, (876128889 & 268435456) != 0 ? value.version : 0, (876128889 & 536870912) != 0 ? value.side : null, (876128889 & 1073741824) != 0 ? value.session_date : session_date != null ? Date.ADAPTER.redact(session_date) : null, (876128889 & Integer.MIN_VALUE) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

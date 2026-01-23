package com.robinhood.rosetta.mainst;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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
import rosetta.mainst.Route;

/* compiled from: OrderSendLog.kt */
@kotlin.Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010'\u001a\u00020\u0002H\u0017J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\u000eH\u0016J\b\u0010-\u001a\u00020.H\u0016J\u0084\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderSendLog;", "Lcom/squareup/wire/Message;", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUID;", InquiryField.DateField.TYPE, "Lcom/robinhood/rosetta/mainst/Time;", "sent_at", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/mainst/Decimal;", "confirmed_at", PlaceTypes.ROUTE, "Lrosetta/mainst/Route;", "count", "", "quantity", "session_id", "Lcom/robinhood/rosetta/mainst/NullableString;", "cl_ord_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/mainst/Route;ILcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/NullableString;Lokio/ByteString;)V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUID;", "getDate", "()Lcom/robinhood/rosetta/mainst/Time;", "getSent_at", "getPrice", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getConfirmed_at", "getRoute", "()Lrosetta/mainst/Route;", "getCount", "()I", "getQuantity", "getSession_id", "()Lcom/robinhood/rosetta/mainst/NullableString;", "getCl_ord_id", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderSendLog extends Message {

    @JvmField
    public static final ProtoAdapter<OrderSendLog> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "clOrdId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final NullableString cl_ord_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "confirmedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Time confirmed_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int count;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Time date;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID order_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Decimal price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Decimal quantity;

    @WireField(adapter = "rosetta.mainst.Route#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Route route;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "sentAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Time sent_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "sessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final NullableString session_id;

    public OrderSendLog() {
        this(null, null, null, null, null, null, 0, null, null, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24692newBuilder();
    }

    public final UUID getOrder_id() {
        return this.order_id;
    }

    public final Time getDate() {
        return this.date;
    }

    public final Time getSent_at() {
        return this.sent_at;
    }

    public final Decimal getPrice() {
        return this.price;
    }

    public final Time getConfirmed_at() {
        return this.confirmed_at;
    }

    public final Route getRoute() {
        return this.route;
    }

    public /* synthetic */ OrderSendLog(UUID uuid, Time time, Time time2, Decimal decimal, Time time3, Route route, int i, Decimal decimal2, NullableString nullableString, NullableString nullableString2, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uuid, (i2 & 2) != 0 ? null : time, (i2 & 4) != 0 ? null : time2, (i2 & 8) != 0 ? null : decimal, (i2 & 16) != 0 ? null : time3, (i2 & 32) != 0 ? Route.ROUTE_UNSPECIFIED : route, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : decimal2, (i2 & 256) != 0 ? null : nullableString, (i2 & 512) != 0 ? null : nullableString2, (i2 & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getCount() {
        return this.count;
    }

    public final Decimal getQuantity() {
        return this.quantity;
    }

    public final NullableString getSession_id() {
        return this.session_id;
    }

    public final NullableString getCl_ord_id() {
        return this.cl_ord_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSendLog(UUID uuid, Time time, Time time2, Decimal decimal, Time time3, Route route, int i, Decimal decimal2, NullableString nullableString, NullableString nullableString2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = uuid;
        this.date = time;
        this.sent_at = time2;
        this.price = decimal;
        this.confirmed_at = time3;
        this.route = route;
        this.count = i;
        this.quantity = decimal2;
        this.session_id = nullableString;
        this.cl_ord_id = nullableString2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24692newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderSendLog)) {
            return false;
        }
        OrderSendLog orderSendLog = (OrderSendLog) other;
        return Intrinsics.areEqual(unknownFields(), orderSendLog.unknownFields()) && Intrinsics.areEqual(this.order_id, orderSendLog.order_id) && Intrinsics.areEqual(this.date, orderSendLog.date) && Intrinsics.areEqual(this.sent_at, orderSendLog.sent_at) && Intrinsics.areEqual(this.price, orderSendLog.price) && Intrinsics.areEqual(this.confirmed_at, orderSendLog.confirmed_at) && this.route == orderSendLog.route && this.count == orderSendLog.count && Intrinsics.areEqual(this.quantity, orderSendLog.quantity) && Intrinsics.areEqual(this.session_id, orderSendLog.session_id) && Intrinsics.areEqual(this.cl_ord_id, orderSendLog.cl_ord_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.order_id;
        int iHashCode2 = (iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37;
        Time time = this.date;
        int iHashCode3 = (iHashCode2 + (time != null ? time.hashCode() : 0)) * 37;
        Time time2 = this.sent_at;
        int iHashCode4 = (iHashCode3 + (time2 != null ? time2.hashCode() : 0)) * 37;
        Decimal decimal = this.price;
        int iHashCode5 = (iHashCode4 + (decimal != null ? decimal.hashCode() : 0)) * 37;
        Time time3 = this.confirmed_at;
        int iHashCode6 = (((((iHashCode5 + (time3 != null ? time3.hashCode() : 0)) * 37) + this.route.hashCode()) * 37) + Integer.hashCode(this.count)) * 37;
        Decimal decimal2 = this.quantity;
        int iHashCode7 = (iHashCode6 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        NullableString nullableString = this.session_id;
        int iHashCode8 = (iHashCode7 + (nullableString != null ? nullableString.hashCode() : 0)) * 37;
        NullableString nullableString2 = this.cl_ord_id;
        int iHashCode9 = iHashCode8 + (nullableString2 != null ? nullableString2.hashCode() : 0);
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
        Time time = this.date;
        if (time != null) {
            arrayList.add("date=" + time);
        }
        Time time2 = this.sent_at;
        if (time2 != null) {
            arrayList.add("sent_at=" + time2);
        }
        Decimal decimal = this.price;
        if (decimal != null) {
            arrayList.add("price=" + decimal);
        }
        Time time3 = this.confirmed_at;
        if (time3 != null) {
            arrayList.add("confirmed_at=" + time3);
        }
        arrayList.add("route=" + this.route);
        arrayList.add("count=" + this.count);
        Decimal decimal2 = this.quantity;
        if (decimal2 != null) {
            arrayList.add("quantity=" + decimal2);
        }
        NullableString nullableString = this.session_id;
        if (nullableString != null) {
            arrayList.add("session_id=" + nullableString);
        }
        NullableString nullableString2 = this.cl_ord_id;
        if (nullableString2 != null) {
            arrayList.add("cl_ord_id=" + nullableString2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderSendLog{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderSendLog copy$default(OrderSendLog orderSendLog, UUID uuid, Time time, Time time2, Decimal decimal, Time time3, Route route, int i, Decimal decimal2, NullableString nullableString, NullableString nullableString2, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = orderSendLog.order_id;
        }
        if ((i2 & 2) != 0) {
            time = orderSendLog.date;
        }
        if ((i2 & 4) != 0) {
            time2 = orderSendLog.sent_at;
        }
        if ((i2 & 8) != 0) {
            decimal = orderSendLog.price;
        }
        if ((i2 & 16) != 0) {
            time3 = orderSendLog.confirmed_at;
        }
        if ((i2 & 32) != 0) {
            route = orderSendLog.route;
        }
        if ((i2 & 64) != 0) {
            i = orderSendLog.count;
        }
        if ((i2 & 128) != 0) {
            decimal2 = orderSendLog.quantity;
        }
        if ((i2 & 256) != 0) {
            nullableString = orderSendLog.session_id;
        }
        if ((i2 & 512) != 0) {
            nullableString2 = orderSendLog.cl_ord_id;
        }
        if ((i2 & 1024) != 0) {
            byteString = orderSendLog.unknownFields();
        }
        NullableString nullableString3 = nullableString2;
        ByteString byteString2 = byteString;
        Decimal decimal3 = decimal2;
        NullableString nullableString4 = nullableString;
        Route route2 = route;
        int i3 = i;
        Time time4 = time3;
        Time time5 = time2;
        return orderSendLog.copy(uuid, time, time5, decimal, time4, route2, i3, decimal3, nullableString4, nullableString3, byteString2);
    }

    public final OrderSendLog copy(UUID order_id, Time date, Time sent_at, Decimal price, Time confirmed_at, Route route, int count, Decimal quantity, NullableString session_id, NullableString cl_ord_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderSendLog(order_id, date, sent_at, price, confirmed_at, route, count, quantity, session_id, cl_ord_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderSendLog.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderSendLog>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.OrderSendLog$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderSendLog value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOrder_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (value.getDate() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(2, value.getDate());
                }
                if (value.getSent_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(3, value.getSent_at());
                }
                if (value.getPrice() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(4, value.getPrice());
                }
                if (value.getConfirmed_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(5, value.getConfirmed_at());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    size += Route.ADAPTER.encodedSizeWithTag(6, value.getRoute());
                }
                if (value.getCount() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getCount()));
                }
                if (value.getQuantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(8, value.getQuantity());
                }
                if (value.getSession_id() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(9, value.getSession_id());
                }
                return value.getCl_ord_id() != null ? size + NullableString.ADAPTER.encodedSizeWithTag(10, value.getCl_ord_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderSendLog value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (value.getDate() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 2, (int) value.getDate());
                }
                if (value.getSent_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 3, (int) value.getSent_at());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 4, (int) value.getPrice());
                }
                if (value.getConfirmed_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getConfirmed_at());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 6, (int) value.getRoute());
                }
                if (value.getCount() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getCount()));
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 8, (int) value.getQuantity());
                }
                if (value.getSession_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 9, (int) value.getSession_id());
                }
                if (value.getCl_ord_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 10, (int) value.getCl_ord_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderSendLog value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCl_ord_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 10, (int) value.getCl_ord_id());
                }
                if (value.getSession_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 9, (int) value.getSession_id());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 8, (int) value.getQuantity());
                }
                if (value.getCount() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getCount()));
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 6, (int) value.getRoute());
                }
                if (value.getConfirmed_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getConfirmed_at());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 4, (int) value.getPrice());
                }
                if (value.getSent_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 3, (int) value.getSent_at());
                }
                if (value.getDate() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 2, (int) value.getDate());
                }
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderSendLog decode(ProtoReader reader) throws IOException {
                Route route;
                UUID uuid;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Route route2 = Route.ROUTE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Time timeDecode = null;
                Time timeDecode2 = null;
                Decimal decimalDecode = null;
                Time timeDecode3 = null;
                Decimal decimalDecode2 = null;
                NullableString nullableStringDecode = null;
                NullableString nullableStringDecode2 = null;
                int iIntValue = 0;
                Route routeDecode = route2;
                UUID uuidDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                uuidDecode = UUID.ADAPTER.decode(reader);
                                continue;
                            case 2:
                                timeDecode = Time.ADAPTER.decode(reader);
                                continue;
                            case 3:
                                timeDecode2 = Time.ADAPTER.decode(reader);
                                continue;
                            case 4:
                                decimalDecode = Decimal.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                timeDecode3 = Time.ADAPTER.decode(reader);
                                continue;
                            case 6:
                                try {
                                    routeDecode = Route.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    route = routeDecode;
                                    uuid = uuidDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 7:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                continue;
                            case 8:
                                decimalDecode2 = Decimal.ADAPTER.decode(reader);
                                continue;
                            case 9:
                                nullableStringDecode = NullableString.ADAPTER.decode(reader);
                                continue;
                            case 10:
                                nullableStringDecode2 = NullableString.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                route = routeDecode;
                                uuid = uuidDecode;
                                break;
                        }
                        uuidDecode = uuid;
                        routeDecode = route;
                    } else {
                        return new OrderSendLog(uuidDecode, timeDecode, timeDecode2, decimalDecode, timeDecode3, routeDecode, iIntValue, decimalDecode2, nullableStringDecode, nullableStringDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderSendLog redact(OrderSendLog value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID order_id = value.getOrder_id();
                UUID uuidRedact = order_id != null ? UUID.ADAPTER.redact(order_id) : null;
                Time date = value.getDate();
                Time timeRedact = date != null ? Time.ADAPTER.redact(date) : null;
                Time sent_at = value.getSent_at();
                Time timeRedact2 = sent_at != null ? Time.ADAPTER.redact(sent_at) : null;
                Decimal price = value.getPrice();
                Decimal decimalRedact = price != null ? Decimal.ADAPTER.redact(price) : null;
                Time confirmed_at = value.getConfirmed_at();
                Time timeRedact3 = confirmed_at != null ? Time.ADAPTER.redact(confirmed_at) : null;
                Decimal quantity = value.getQuantity();
                Decimal decimalRedact2 = quantity != null ? Decimal.ADAPTER.redact(quantity) : null;
                NullableString session_id = value.getSession_id();
                NullableString nullableStringRedact = session_id != null ? NullableString.ADAPTER.redact(session_id) : null;
                NullableString cl_ord_id = value.getCl_ord_id();
                return OrderSendLog.copy$default(value, uuidRedact, timeRedact, timeRedact2, decimalRedact, timeRedact3, null, 0, decimalRedact2, nullableStringRedact, cl_ord_id != null ? NullableString.ADAPTER.redact(cl_ord_id) : null, ByteString.EMPTY, 96, null);
            }
        };
    }
}

package com.robinhood.ceres.p284v1;

import com.robinhood.rosetta.common.Money;
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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;
import rosetta.mainst.OrderState;
import rosetta.mainst.OrderType;

/* compiled from: OrderDetails.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@B±\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J·\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010&R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\"\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\"\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b2\u00101R\"\u0010\f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b3\u00101R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b4\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b;\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b<\u0010&R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?¨\u0006A"}, m3636d2 = {"Lcom/robinhood/ceres/v1/OrderDetails;", "Lcom/squareup/wire/Message;", "", "", "order_quantity", "pending_quantity", "Lrosetta/mainst/OrderState;", "order_state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "canceled_at", "filled_quantity", "Lcom/robinhood/rosetta/common/Money;", "filled_notional", "Lrosetta/mainst/OrderType;", "order_type", "limit_price", "account_id", "", "Lcom/robinhood/ceres/v1/OrderLegDetails;", "order_leg_details", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderState;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lrosetta/mainst/OrderType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderState;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lrosetta/mainst/OrderType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)Lcom/robinhood/ceres/v1/OrderDetails;", "Ljava/lang/String;", "getOrder_quantity", "getPending_quantity", "Lrosetta/mainst/OrderState;", "getOrder_state", "()Lrosetta/mainst/OrderState;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "getCanceled_at", "getFilled_quantity", "Lcom/robinhood/rosetta/common/Money;", "getFilled_notional", "()Lcom/robinhood/rosetta/common/Money;", "Lrosetta/mainst/OrderType;", "getOrder_type", "()Lrosetta/mainst/OrderType;", "getLimit_price", "getAccount_id", "Ljava/util/List;", "getOrder_leg_details", "()Ljava/util/List;", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class OrderDetails extends Message {

    @JvmField
    public static final ProtoAdapter<OrderDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", schemaIndex = 10, tag = 11)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "canceledAt", schemaIndex = 5, tag = 6)
    private final Instant canceled_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", schemaIndex = 3, tag = 4)
    private final Instant created_at;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "filledNotional", schemaIndex = 7, tag = 8)
    private final Money filled_notional;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "filledQuantity", schemaIndex = 6, tag = 7)
    private final String filled_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitPrice", schemaIndex = 9, tag = 10)
    private final String limit_price;

    @WireField(adapter = "com.robinhood.ceres.v1.OrderLegDetails#ADAPTER", jsonName = "orderLegDetails", label = WireField.Label.REPEATED, schemaIndex = 11, tag = 12)
    private final List<OrderLegDetails> order_leg_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_quantity;

    @WireField(adapter = "rosetta.mainst.OrderState#ADAPTER", jsonName = "orderState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final OrderState order_state;

    @WireField(adapter = "rosetta.mainst.OrderType#ADAPTER", jsonName = "orderType", schemaIndex = 8, tag = 9)
    private final OrderType order_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pendingQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String pending_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", schemaIndex = 4, tag = 5)
    private final Instant updated_at;

    public OrderDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public /* synthetic */ OrderDetails(String str, String str2, OrderState orderState, Instant instant, Instant instant2, Instant instant3, String str3, Money money, OrderType orderType, String str4, String str5, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? OrderState.ORDER_STATE_UNSPECIFIED : orderState, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : instant2, (i & 32) != 0 ? null : instant3, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : money, (i & 256) != 0 ? null : orderType, (i & 512) != 0 ? null : str4, (i & 1024) == 0 ? str5 : null, (i & 2048) != 0 ? CollectionsKt.emptyList() : list, (i & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20395newBuilder();
    }

    public final String getOrder_quantity() {
        return this.order_quantity;
    }

    public final String getPending_quantity() {
        return this.pending_quantity;
    }

    public final OrderState getOrder_state() {
        return this.order_state;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    public final Instant getCanceled_at() {
        return this.canceled_at;
    }

    public final String getFilled_quantity() {
        return this.filled_quantity;
    }

    public final Money getFilled_notional() {
        return this.filled_notional;
    }

    public final OrderType getOrder_type() {
        return this.order_type;
    }

    public final String getLimit_price() {
        return this.limit_price;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetails(String order_quantity, String pending_quantity, OrderState order_state, Instant instant, Instant instant2, Instant instant3, String str, Money money, OrderType orderType, String str2, String str3, List<OrderLegDetails> order_leg_details, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_quantity, "order_quantity");
        Intrinsics.checkNotNullParameter(pending_quantity, "pending_quantity");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(order_leg_details, "order_leg_details");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_quantity = order_quantity;
        this.pending_quantity = pending_quantity;
        this.order_state = order_state;
        this.created_at = instant;
        this.updated_at = instant2;
        this.canceled_at = instant3;
        this.filled_quantity = str;
        this.filled_notional = money;
        this.order_type = orderType;
        this.limit_price = str2;
        this.account_id = str3;
        this.order_leg_details = Internal.immutableCopyOf("order_leg_details", order_leg_details);
    }

    public final List<OrderLegDetails> getOrder_leg_details() {
        return this.order_leg_details;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20395newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderDetails)) {
            return false;
        }
        OrderDetails orderDetails = (OrderDetails) other;
        return Intrinsics.areEqual(unknownFields(), orderDetails.unknownFields()) && Intrinsics.areEqual(this.order_quantity, orderDetails.order_quantity) && Intrinsics.areEqual(this.pending_quantity, orderDetails.pending_quantity) && this.order_state == orderDetails.order_state && Intrinsics.areEqual(this.created_at, orderDetails.created_at) && Intrinsics.areEqual(this.updated_at, orderDetails.updated_at) && Intrinsics.areEqual(this.canceled_at, orderDetails.canceled_at) && Intrinsics.areEqual(this.filled_quantity, orderDetails.filled_quantity) && Intrinsics.areEqual(this.filled_notional, orderDetails.filled_notional) && this.order_type == orderDetails.order_type && Intrinsics.areEqual(this.limit_price, orderDetails.limit_price) && Intrinsics.areEqual(this.account_id, orderDetails.account_id) && Intrinsics.areEqual(this.order_leg_details, orderDetails.order_leg_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.order_quantity.hashCode()) * 37) + this.pending_quantity.hashCode()) * 37) + this.order_state.hashCode()) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updated_at;
        int iHashCode3 = (iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Instant instant3 = this.canceled_at;
        int iHashCode4 = (iHashCode3 + (instant3 != null ? instant3.hashCode() : 0)) * 37;
        String str = this.filled_quantity;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.filled_notional;
        int iHashCode6 = (iHashCode5 + (money != null ? money.hashCode() : 0)) * 37;
        OrderType orderType = this.order_type;
        int iHashCode7 = (iHashCode6 + (orderType != null ? orderType.hashCode() : 0)) * 37;
        String str2 = this.limit_price;
        int iHashCode8 = (iHashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.account_id;
        int iHashCode9 = ((iHashCode8 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.order_leg_details.hashCode();
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_quantity=" + Internal.sanitize(this.order_quantity));
        arrayList.add("pending_quantity=" + Internal.sanitize(this.pending_quantity));
        arrayList.add("order_state=" + this.order_state);
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            arrayList.add("updated_at=" + instant2);
        }
        Instant instant3 = this.canceled_at;
        if (instant3 != null) {
            arrayList.add("canceled_at=" + instant3);
        }
        String str = this.filled_quantity;
        if (str != null) {
            arrayList.add("filled_quantity=" + Internal.sanitize(str));
        }
        Money money = this.filled_notional;
        if (money != null) {
            arrayList.add("filled_notional=" + money);
        }
        OrderType orderType = this.order_type;
        if (orderType != null) {
            arrayList.add("order_type=" + orderType);
        }
        String str2 = this.limit_price;
        if (str2 != null) {
            arrayList.add("limit_price=" + Internal.sanitize(str2));
        }
        String str3 = this.account_id;
        if (str3 != null) {
            arrayList.add("account_id=" + Internal.sanitize(str3));
        }
        if (!this.order_leg_details.isEmpty()) {
            arrayList.add("order_leg_details=" + this.order_leg_details);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderDetails copy$default(OrderDetails orderDetails, String str, String str2, OrderState orderState, Instant instant, Instant instant2, Instant instant3, String str3, Money money, OrderType orderType, String str4, String str5, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderDetails.order_quantity;
        }
        return orderDetails.copy(str, (i & 2) != 0 ? orderDetails.pending_quantity : str2, (i & 4) != 0 ? orderDetails.order_state : orderState, (i & 8) != 0 ? orderDetails.created_at : instant, (i & 16) != 0 ? orderDetails.updated_at : instant2, (i & 32) != 0 ? orderDetails.canceled_at : instant3, (i & 64) != 0 ? orderDetails.filled_quantity : str3, (i & 128) != 0 ? orderDetails.filled_notional : money, (i & 256) != 0 ? orderDetails.order_type : orderType, (i & 512) != 0 ? orderDetails.limit_price : str4, (i & 1024) != 0 ? orderDetails.account_id : str5, (i & 2048) != 0 ? orderDetails.order_leg_details : list, (i & 4096) != 0 ? orderDetails.unknownFields() : byteString);
    }

    public final OrderDetails copy(String order_quantity, String pending_quantity, OrderState order_state, Instant created_at, Instant updated_at, Instant canceled_at, String filled_quantity, Money filled_notional, OrderType order_type, String limit_price, String account_id, List<OrderLegDetails> order_leg_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_quantity, "order_quantity");
        Intrinsics.checkNotNullParameter(pending_quantity, "pending_quantity");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(order_leg_details, "order_leg_details");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderDetails(order_quantity, pending_quantity, order_state, created_at, updated_at, canceled_at, filled_quantity, filled_notional, order_type, limit_price, account_id, order_leg_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.OrderDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_quantity());
                }
                if (!Intrinsics.areEqual(value.getPending_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPending_quantity());
                }
                if (value.getOrder_state() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    size += OrderState.ADAPTER.encodedSizeWithTag(3, value.getOrder_state());
                }
                ProtoAdapter<Instant> protoAdapter = ProtoAdapter.INSTANT;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(4, value.getCreated_at()) + protoAdapter.encodedSizeWithTag(5, value.getUpdated_at()) + protoAdapter.encodedSizeWithTag(6, value.getCanceled_at());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(7, value.getFilled_quantity()) + Money.ADAPTER.encodedSizeWithTag(8, value.getFilled_notional()) + OrderType.ADAPTER.encodedSizeWithTag(9, value.getOrder_type()) + protoAdapter2.encodedSizeWithTag(10, value.getLimit_price()) + protoAdapter2.encodedSizeWithTag(11, value.getAccount_id()) + OrderLegDetails.ADAPTER.asRepeated().encodedSizeWithTag(12, value.getOrder_leg_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_quantity());
                }
                if (!Intrinsics.areEqual(value.getPending_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPending_quantity());
                }
                if (value.getOrder_state() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    OrderState.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_state());
                }
                ProtoAdapter<Instant> protoAdapter = ProtoAdapter.INSTANT;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getCreated_at());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getUpdated_at());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getCanceled_at());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getFilled_quantity());
                Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getFilled_notional());
                OrderType.ADAPTER.encodeWithTag(writer, 9, (int) value.getOrder_type());
                protoAdapter2.encodeWithTag(writer, 10, (int) value.getLimit_price());
                protoAdapter2.encodeWithTag(writer, 11, (int) value.getAccount_id());
                OrderLegDetails.ADAPTER.asRepeated().encodeWithTag(writer, 12, (int) value.getOrder_leg_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                OrderLegDetails.ADAPTER.asRepeated().encodeWithTag(writer, 12, (int) value.getOrder_leg_details());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 11, (int) value.getAccount_id());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getLimit_price());
                OrderType.ADAPTER.encodeWithTag(writer, 9, (int) value.getOrder_type());
                Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getFilled_notional());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getFilled_quantity());
                ProtoAdapter<Instant> protoAdapter2 = ProtoAdapter.INSTANT;
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getCanceled_at());
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getUpdated_at());
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getCreated_at());
                if (value.getOrder_state() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    OrderState.ADAPTER.encodeWithTag(writer, 3, (int) value.getOrder_state());
                }
                if (!Intrinsics.areEqual(value.getPending_quantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getPending_quantity());
                }
                if (Intrinsics.areEqual(value.getOrder_quantity(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getOrder_quantity());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderDetails decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                Instant instant;
                Intrinsics.checkNotNullParameter(reader, "reader");
                OrderState orderState = OrderState.ORDER_STATE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                OrderState orderStateDecode = orderState;
                String strDecode = "";
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Instant instantDecode3 = null;
                String strDecode2 = null;
                Money moneyDecode = null;
                OrderType orderTypeDecode = null;
                String strDecode3 = null;
                String strDecode4 = null;
                String strDecode5 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                str = strDecode5;
                                str2 = strDecode;
                                instant = instantDecode;
                                try {
                                    orderStateDecode = OrderState.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                strDecode5 = str;
                                strDecode = str2;
                                instantDecode = instant;
                                break;
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 6:
                                instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 7:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 9:
                                try {
                                    orderTypeDecode = OrderType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    str = strDecode5;
                                    str2 = strDecode;
                                    instant = instantDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 10:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                arrayList.add(OrderLegDetails.ADAPTER.decode(reader));
                                str = strDecode5;
                                str2 = strDecode;
                                instant = instantDecode;
                                strDecode5 = str;
                                strDecode = str2;
                                instantDecode = instant;
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode5;
                                str2 = strDecode;
                                instant = instantDecode;
                                strDecode5 = str;
                                strDecode = str2;
                                instantDecode = instant;
                                break;
                        }
                    } else {
                        return new OrderDetails(strDecode5, strDecode, orderStateDecode, instantDecode, instantDecode2, instantDecode3, strDecode2, moneyDecode, orderTypeDecode, strDecode3, strDecode4, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderDetails redact(OrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant updated_at = value.getUpdated_at();
                Instant instantRedact2 = updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null;
                Instant canceled_at = value.getCanceled_at();
                Instant instantRedact3 = canceled_at != null ? ProtoAdapter.INSTANT.redact(canceled_at) : null;
                Money filled_notional = value.getFilled_notional();
                return OrderDetails.copy$default(value, null, null, null, instantRedact, instantRedact2, instantRedact3, null, filled_notional != null ? Money.ADAPTER.redact(filled_notional) : null, null, null, null, Internal.m26823redactElements(value.getOrder_leg_details(), OrderLegDetails.ADAPTER), ByteString.EMPTY, 1863, null);
            }
        };
    }
}

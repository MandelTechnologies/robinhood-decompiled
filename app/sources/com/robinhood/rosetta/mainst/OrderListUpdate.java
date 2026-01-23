package com.robinhood.rosetta.mainst;

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
import rosetta.order.Agent;
import rosetta.order.ClientService;
import rosetta.order.OrderListContingencyType;

/* compiled from: OrderListUpdate.kt */
@kotlin.Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u0099\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00104\u001a\u00020\u0002H\u0017J\u0013\u00105\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\b\u00108\u001a\u00020\u0018H\u0016J\b\u00109\u001a\u00020\u0012H\u0016J\u0098\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderListUpdate;", "Lcom/squareup/wire/Message;", "", "id", "Lcom/robinhood/rosetta/mainst/UUID;", "proportional_triggering", "", "sub_orders", "", "Lcom/robinhood/rosetta/mainst/OrderUpdate;", "received_at", "Lcom/robinhood/rosetta/mainst/Time;", "contingency_type", "Lrosetta/order/OrderListContingencyType;", "cancel_open_time", "cancel_open_agent", "Lrosetta/order/Agent;", "account_number", "", "service_shard_id", "Lcom/robinhood/rosetta/mainst/NullableInt;", "order_created_service", "Lrosetta/order/ClientService;", "version", "", "list_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;ZLjava/util/List;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/order/OrderListContingencyType;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/order/Agent;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/NullableInt;Lrosetta/order/ClientService;ILcom/robinhood/rosetta/mainst/UUID;Lokio/ByteString;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUID;", "getProportional_triggering", "()Z", "getReceived_at", "()Lcom/robinhood/rosetta/mainst/Time;", "getContingency_type", "()Lrosetta/order/OrderListContingencyType;", "getCancel_open_time", "getCancel_open_agent", "()Lrosetta/order/Agent;", "getAccount_number", "()Ljava/lang/String;", "getService_shard_id", "()Lcom/robinhood/rosetta/mainst/NullableInt;", "getOrder_created_service", "()Lrosetta/order/ClientService;", "getVersion", "()I", "getList_id", "getSub_orders", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class OrderListUpdate extends Message {

    @JvmField
    public static final ProtoAdapter<OrderListUpdate> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String account_number;

    @WireField(adapter = "rosetta.order.Agent#ADAPTER", jsonName = "cancelOpenAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Agent cancel_open_agent;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "cancelOpenTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Time cancel_open_time;

    @WireField(adapter = "rosetta.order.OrderListContingencyType#ADAPTER", jsonName = "contingencyType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final OrderListContingencyType contingency_type;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "listId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final UUID list_id;

    @WireField(adapter = "rosetta.order.ClientService#ADAPTER", jsonName = "orderCreatedService", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final ClientService order_created_service;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "proportionalTriggering", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean proportional_triggering;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "receivedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Time received_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableInt#ADAPTER", jsonName = "serviceShardId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final NullableInt service_shard_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.OrderUpdate#ADAPTER", jsonName = "subOrders", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<OrderUpdate> sub_orders;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final int version;

    public OrderListUpdate() {
        this(null, false, null, null, null, null, null, null, null, null, 0, null, null, 8191, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24687newBuilder();
    }

    public final UUID getId() {
        return this.id;
    }

    public final boolean getProportional_triggering() {
        return this.proportional_triggering;
    }

    public /* synthetic */ OrderListUpdate(UUID uuid, boolean z, List list, Time time, OrderListContingencyType orderListContingencyType, Time time2, Agent agent, String str, NullableInt nullableInt, ClientService clientService, int i, UUID uuid2, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uuid, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? null : time, (i2 & 16) != 0 ? OrderListContingencyType.ORDER_LIST_CONTINGENCY_UNSPECIFIED : orderListContingencyType, (i2 & 32) != 0 ? null : time2, (i2 & 64) != 0 ? Agent.AGENT_UNSPECIFIED : agent, (i2 & 128) != 0 ? "" : str, (i2 & 256) != 0 ? null : nullableInt, (i2 & 512) != 0 ? ClientService.CLIENT_SERVICE_UNSPECIFIED : clientService, (i2 & 1024) == 0 ? i : 0, (i2 & 2048) == 0 ? uuid2 : null, (i2 & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Time getReceived_at() {
        return this.received_at;
    }

    public final OrderListContingencyType getContingency_type() {
        return this.contingency_type;
    }

    public final Time getCancel_open_time() {
        return this.cancel_open_time;
    }

    public final Agent getCancel_open_agent() {
        return this.cancel_open_agent;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final NullableInt getService_shard_id() {
        return this.service_shard_id;
    }

    public final ClientService getOrder_created_service() {
        return this.order_created_service;
    }

    public final int getVersion() {
        return this.version;
    }

    public final UUID getList_id() {
        return this.list_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderListUpdate(UUID uuid, boolean z, List<OrderUpdate> sub_orders, Time time, OrderListContingencyType contingency_type, Time time2, Agent cancel_open_agent, String account_number, NullableInt nullableInt, ClientService order_created_service, int i, UUID uuid2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(sub_orders, "sub_orders");
        Intrinsics.checkNotNullParameter(contingency_type, "contingency_type");
        Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(order_created_service, "order_created_service");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = uuid;
        this.proportional_triggering = z;
        this.received_at = time;
        this.contingency_type = contingency_type;
        this.cancel_open_time = time2;
        this.cancel_open_agent = cancel_open_agent;
        this.account_number = account_number;
        this.service_shard_id = nullableInt;
        this.order_created_service = order_created_service;
        this.version = i;
        this.list_id = uuid2;
        this.sub_orders = Internal.immutableCopyOf("sub_orders", sub_orders);
    }

    public final List<OrderUpdate> getSub_orders() {
        return this.sub_orders;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24687newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderListUpdate)) {
            return false;
        }
        OrderListUpdate orderListUpdate = (OrderListUpdate) other;
        return Intrinsics.areEqual(unknownFields(), orderListUpdate.unknownFields()) && Intrinsics.areEqual(this.id, orderListUpdate.id) && this.proportional_triggering == orderListUpdate.proportional_triggering && Intrinsics.areEqual(this.sub_orders, orderListUpdate.sub_orders) && Intrinsics.areEqual(this.received_at, orderListUpdate.received_at) && this.contingency_type == orderListUpdate.contingency_type && Intrinsics.areEqual(this.cancel_open_time, orderListUpdate.cancel_open_time) && this.cancel_open_agent == orderListUpdate.cancel_open_agent && Intrinsics.areEqual(this.account_number, orderListUpdate.account_number) && Intrinsics.areEqual(this.service_shard_id, orderListUpdate.service_shard_id) && this.order_created_service == orderListUpdate.order_created_service && this.version == orderListUpdate.version && Intrinsics.areEqual(this.list_id, orderListUpdate.list_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.id;
        int iHashCode2 = (((((iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37) + Boolean.hashCode(this.proportional_triggering)) * 37) + this.sub_orders.hashCode()) * 37;
        Time time = this.received_at;
        int iHashCode3 = (((iHashCode2 + (time != null ? time.hashCode() : 0)) * 37) + this.contingency_type.hashCode()) * 37;
        Time time2 = this.cancel_open_time;
        int iHashCode4 = (((((iHashCode3 + (time2 != null ? time2.hashCode() : 0)) * 37) + this.cancel_open_agent.hashCode()) * 37) + this.account_number.hashCode()) * 37;
        NullableInt nullableInt = this.service_shard_id;
        int iHashCode5 = (((((iHashCode4 + (nullableInt != null ? nullableInt.hashCode() : 0)) * 37) + this.order_created_service.hashCode()) * 37) + Integer.hashCode(this.version)) * 37;
        UUID uuid2 = this.list_id;
        int iHashCode6 = iHashCode5 + (uuid2 != null ? uuid2.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.id;
        if (uuid != null) {
            arrayList.add("id=" + uuid);
        }
        arrayList.add("proportional_triggering=" + this.proportional_triggering);
        if (!this.sub_orders.isEmpty()) {
            arrayList.add("sub_orders=" + this.sub_orders);
        }
        Time time = this.received_at;
        if (time != null) {
            arrayList.add("received_at=" + time);
        }
        arrayList.add("contingency_type=" + this.contingency_type);
        Time time2 = this.cancel_open_time;
        if (time2 != null) {
            arrayList.add("cancel_open_time=" + time2);
        }
        arrayList.add("cancel_open_agent=" + this.cancel_open_agent);
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        NullableInt nullableInt = this.service_shard_id;
        if (nullableInt != null) {
            arrayList.add("service_shard_id=" + nullableInt);
        }
        arrayList.add("order_created_service=" + this.order_created_service);
        arrayList.add("version=" + this.version);
        UUID uuid2 = this.list_id;
        if (uuid2 != null) {
            arrayList.add("list_id=" + uuid2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderListUpdate{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderListUpdate copy$default(OrderListUpdate orderListUpdate, UUID uuid, boolean z, List list, Time time, OrderListContingencyType orderListContingencyType, Time time2, Agent agent, String str, NullableInt nullableInt, ClientService clientService, int i, UUID uuid2, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = orderListUpdate.id;
        }
        return orderListUpdate.copy(uuid, (i2 & 2) != 0 ? orderListUpdate.proportional_triggering : z, (i2 & 4) != 0 ? orderListUpdate.sub_orders : list, (i2 & 8) != 0 ? orderListUpdate.received_at : time, (i2 & 16) != 0 ? orderListUpdate.contingency_type : orderListContingencyType, (i2 & 32) != 0 ? orderListUpdate.cancel_open_time : time2, (i2 & 64) != 0 ? orderListUpdate.cancel_open_agent : agent, (i2 & 128) != 0 ? orderListUpdate.account_number : str, (i2 & 256) != 0 ? orderListUpdate.service_shard_id : nullableInt, (i2 & 512) != 0 ? orderListUpdate.order_created_service : clientService, (i2 & 1024) != 0 ? orderListUpdate.version : i, (i2 & 2048) != 0 ? orderListUpdate.list_id : uuid2, (i2 & 4096) != 0 ? orderListUpdate.unknownFields() : byteString);
    }

    public final OrderListUpdate copy(UUID id, boolean proportional_triggering, List<OrderUpdate> sub_orders, Time received_at, OrderListContingencyType contingency_type, Time cancel_open_time, Agent cancel_open_agent, String account_number, NullableInt service_shard_id, ClientService order_created_service, int version, UUID list_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(sub_orders, "sub_orders");
        Intrinsics.checkNotNullParameter(contingency_type, "contingency_type");
        Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(order_created_service, "order_created_service");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderListUpdate(id, proportional_triggering, sub_orders, received_at, contingency_type, cancel_open_time, cancel_open_agent, account_number, service_shard_id, order_created_service, version, list_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderListUpdate.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderListUpdate>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.OrderListUpdate$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderListUpdate value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getId() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getId());
                }
                if (value.getProportional_triggering()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getProportional_triggering()));
                }
                int iEncodedSizeWithTag = size + OrderUpdate.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getSub_orders());
                if (value.getReceived_at() != null) {
                    iEncodedSizeWithTag += Time.ADAPTER.encodedSizeWithTag(4, value.getReceived_at());
                }
                if (value.getContingency_type() != OrderListContingencyType.ORDER_LIST_CONTINGENCY_UNSPECIFIED) {
                    iEncodedSizeWithTag += OrderListContingencyType.ADAPTER.encodedSizeWithTag(5, value.getContingency_type());
                }
                if (value.getCancel_open_time() != null) {
                    iEncodedSizeWithTag += Time.ADAPTER.encodedSizeWithTag(6, value.getCancel_open_time());
                }
                if (value.getCancel_open_agent() != Agent.AGENT_UNSPECIFIED) {
                    iEncodedSizeWithTag += Agent.ADAPTER.encodedSizeWithTag(7, value.getCancel_open_agent());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getAccount_number());
                }
                if (value.getService_shard_id() != null) {
                    iEncodedSizeWithTag += NullableInt.ADAPTER.encodedSizeWithTag(9, value.getService_shard_id());
                }
                if (value.getOrder_created_service() != ClientService.CLIENT_SERVICE_UNSPECIFIED) {
                    iEncodedSizeWithTag += ClientService.ADAPTER.encodedSizeWithTag(10, value.getOrder_created_service());
                }
                if (value.getVersion() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(11, Integer.valueOf(value.getVersion()));
                }
                return value.getList_id() != null ? iEncodedSizeWithTag + UUID.ADAPTER.encodedSizeWithTag(12, value.getList_id()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderListUpdate value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getProportional_triggering()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getProportional_triggering()));
                }
                OrderUpdate.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getSub_orders());
                if (value.getReceived_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getReceived_at());
                }
                if (value.getContingency_type() != OrderListContingencyType.ORDER_LIST_CONTINGENCY_UNSPECIFIED) {
                    OrderListContingencyType.ADAPTER.encodeWithTag(writer, 5, (int) value.getContingency_type());
                }
                if (value.getCancel_open_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 6, (int) value.getCancel_open_time());
                }
                if (value.getCancel_open_agent() != Agent.AGENT_UNSPECIFIED) {
                    Agent.ADAPTER.encodeWithTag(writer, 7, (int) value.getCancel_open_agent());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getAccount_number());
                }
                if (value.getService_shard_id() != null) {
                    NullableInt.ADAPTER.encodeWithTag(writer, 9, (int) value.getService_shard_id());
                }
                if (value.getOrder_created_service() != ClientService.CLIENT_SERVICE_UNSPECIFIED) {
                    ClientService.ADAPTER.encodeWithTag(writer, 10, (int) value.getOrder_created_service());
                }
                if (value.getVersion() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 11, (int) Integer.valueOf(value.getVersion()));
                }
                if (value.getList_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 12, (int) value.getList_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderListUpdate value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getList_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 12, (int) value.getList_id());
                }
                if (value.getVersion() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 11, (int) Integer.valueOf(value.getVersion()));
                }
                if (value.getOrder_created_service() != ClientService.CLIENT_SERVICE_UNSPECIFIED) {
                    ClientService.ADAPTER.encodeWithTag(writer, 10, (int) value.getOrder_created_service());
                }
                if (value.getService_shard_id() != null) {
                    NullableInt.ADAPTER.encodeWithTag(writer, 9, (int) value.getService_shard_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getAccount_number());
                }
                if (value.getCancel_open_agent() != Agent.AGENT_UNSPECIFIED) {
                    Agent.ADAPTER.encodeWithTag(writer, 7, (int) value.getCancel_open_agent());
                }
                if (value.getCancel_open_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 6, (int) value.getCancel_open_time());
                }
                if (value.getContingency_type() != OrderListContingencyType.ORDER_LIST_CONTINGENCY_UNSPECIFIED) {
                    OrderListContingencyType.ADAPTER.encodeWithTag(writer, 5, (int) value.getContingency_type());
                }
                if (value.getReceived_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getReceived_at());
                }
                OrderUpdate.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getSub_orders());
                if (value.getProportional_triggering()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getProportional_triggering()));
                }
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderListUpdate decode(ProtoReader reader) throws IOException {
                Agent agent;
                ClientService clientService;
                UUID uuid;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                OrderListContingencyType orderListContingencyType = OrderListContingencyType.ORDER_LIST_CONTINGENCY_UNSPECIFIED;
                Agent agent2 = Agent.AGENT_UNSPECIFIED;
                ClientService clientService2 = ClientService.CLIENT_SERVICE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                OrderListContingencyType orderListContingencyTypeDecode = orderListContingencyType;
                Time timeDecode = null;
                NullableInt nullableIntDecode = null;
                UUID uuidDecode = null;
                boolean zBooleanValue = false;
                int iIntValue = 0;
                String strDecode = "";
                ClientService clientServiceDecode = clientService2;
                UUID uuidDecode2 = null;
                Time timeDecode2 = null;
                Agent agentDecode = agent2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                uuidDecode2 = UUID.ADAPTER.decode(reader);
                                break;
                            case 2:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 3:
                                agent = agentDecode;
                                clientService = clientServiceDecode;
                                uuid = uuidDecode2;
                                arrayList.add(OrderUpdate.ADAPTER.decode(reader));
                                agentDecode = agent;
                                uuidDecode2 = uuid;
                                clientServiceDecode = clientService;
                                break;
                            case 4:
                                timeDecode2 = Time.ADAPTER.decode(reader);
                                break;
                            case 5:
                                agent = agentDecode;
                                clientService = clientServiceDecode;
                                uuid = uuidDecode2;
                                try {
                                    orderListContingencyTypeDecode = OrderListContingencyType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                agentDecode = agent;
                                uuidDecode2 = uuid;
                                clientServiceDecode = clientService;
                                break;
                            case 6:
                                timeDecode = Time.ADAPTER.decode(reader);
                                break;
                            case 7:
                                agent = agentDecode;
                                clientService = clientServiceDecode;
                                uuid = uuidDecode2;
                                try {
                                    agentDecode = Agent.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                uuidDecode2 = uuid;
                                clientServiceDecode = clientService;
                                break;
                            case 8:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                nullableIntDecode = NullableInt.ADAPTER.decode(reader);
                                break;
                            case 10:
                                try {
                                    clientServiceDecode = ClientService.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    agent = agentDecode;
                                    clientService = clientServiceDecode;
                                    uuid = uuidDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 11:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 12:
                                uuidDecode = UUID.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                agent = agentDecode;
                                clientService = clientServiceDecode;
                                uuid = uuidDecode2;
                                agentDecode = agent;
                                uuidDecode2 = uuid;
                                clientServiceDecode = clientService;
                                break;
                        }
                    } else {
                        return new OrderListUpdate(uuidDecode2, zBooleanValue, arrayList, timeDecode2, orderListContingencyTypeDecode, timeDecode, agentDecode, strDecode, nullableIntDecode, clientServiceDecode, iIntValue, uuidDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderListUpdate redact(OrderListUpdate value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID id = value.getId();
                UUID uuidRedact = id != null ? UUID.ADAPTER.redact(id) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getSub_orders(), OrderUpdate.ADAPTER);
                Time received_at = value.getReceived_at();
                Time timeRedact = received_at != null ? Time.ADAPTER.redact(received_at) : null;
                Time cancel_open_time = value.getCancel_open_time();
                Time timeRedact2 = cancel_open_time != null ? Time.ADAPTER.redact(cancel_open_time) : null;
                NullableInt service_shard_id = value.getService_shard_id();
                NullableInt nullableIntRedact = service_shard_id != null ? NullableInt.ADAPTER.redact(service_shard_id) : null;
                UUID list_id = value.getList_id();
                return OrderListUpdate.copy$default(value, uuidRedact, false, listM26823redactElements, timeRedact, null, timeRedact2, null, null, nullableIntRedact, null, 0, list_id != null ? UUID.ADAPTER.redact(list_id) : null, ByteString.EMPTY, 1746, null);
            }
        };
    }
}

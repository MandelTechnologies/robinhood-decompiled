package com.robinhood.ceres.p284v1;

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
import rosetta.mainst.OrderTrigger;
import rosetta.mainst.OrderType;
import rosetta.mainst.TimeInForce;
import rosetta.order.Agent;

/* compiled from: CreatePositionSelloutRequest.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u00101\u001a\u00020\u0002H\u0017J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0096\u0002J\b\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020\u0004H\u0016J¦\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0019R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001d¨\u0006;"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreatePositionSelloutRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "sellout_reason", "Lcom/robinhood/ceres/v1/SelloutReason;", "contract_id", "sellout_type", "Lcom/robinhood/ceres/v1/SelloutType;", "quantity", "total_balance", "notes", "sellout_agent", "Lrosetta/order/Agent;", "sellout_agent_alias", "order_type", "Lrosetta/mainst/OrderType;", "order_trigger", "Lrosetta/mainst/OrderTrigger;", "order_time_in_force", "Lrosetta/mainst/TimeInForce;", "stop_price", "limit_price", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/SelloutReason;Ljava/lang/String;Lcom/robinhood/ceres/v1/SelloutType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/Agent;Ljava/lang/String;Lrosetta/mainst/OrderType;Lrosetta/mainst/OrderTrigger;Lrosetta/mainst/TimeInForce;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getSellout_reason", "()Lcom/robinhood/ceres/v1/SelloutReason;", "getContract_id", "getSellout_type", "()Lcom/robinhood/ceres/v1/SelloutType;", "getQuantity", "getTotal_balance", "getNotes", "getSellout_agent", "()Lrosetta/order/Agent;", "getSellout_agent_alias", "getOrder_type", "()Lrosetta/mainst/OrderType;", "getOrder_trigger", "()Lrosetta/mainst/OrderTrigger;", "getOrder_time_in_force", "()Lrosetta/mainst/TimeInForce;", "getStop_price", "getLimit_price", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CreatePositionSelloutRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreatePositionSelloutRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitPrice", schemaIndex = 13, tag = 14)
    private final String limit_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final String notes;

    @WireField(adapter = "rosetta.mainst.TimeInForce#ADAPTER", jsonName = "orderTimeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final TimeInForce order_time_in_force;

    @WireField(adapter = "rosetta.mainst.OrderTrigger#ADAPTER", jsonName = "orderTrigger", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final OrderTrigger order_trigger;

    @WireField(adapter = "rosetta.mainst.OrderType#ADAPTER", jsonName = "orderType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final OrderType order_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String quantity;

    @WireField(adapter = "rosetta.order.Agent#ADAPTER", jsonName = "selloutAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Agent sellout_agent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selloutAgentAlias", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String sellout_agent_alias;

    @WireField(adapter = "com.robinhood.ceres.v1.SelloutReason#ADAPTER", jsonName = "selloutReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final SelloutReason sellout_reason;

    @WireField(adapter = "com.robinhood.ceres.v1.SelloutType#ADAPTER", jsonName = "selloutType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final SelloutType sellout_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stopPrice", schemaIndex = 12, tag = 13)
    private final String stop_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalBalance", schemaIndex = 5, tag = 6)
    private final String total_balance;

    public CreatePositionSelloutRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public /* synthetic */ CreatePositionSelloutRequest(String str, SelloutReason selloutReason, String str2, SelloutType selloutType, String str3, String str4, String str5, Agent agent, String str6, OrderType orderType, OrderTrigger orderTrigger, TimeInForce timeInForce, String str7, String str8, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SelloutReason.SELLOUT_REASON_UNSPECIFIED : selloutReason, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? SelloutType.SELLOUT_TYPE_UNSPECIFIED : selloutType, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? Agent.AGENT_UNSPECIFIED : agent, (i & 256) == 0 ? str6 : "", (i & 512) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i & 1024) != 0 ? OrderTrigger.ORDER_TRIGGER_UNSPECIFIED : orderTrigger, (i & 2048) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i & 4096) != 0 ? null : str7, (i & 8192) == 0 ? str8 : null, (i & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20289newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final SelloutReason getSellout_reason() {
        return this.sellout_reason;
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final SelloutType getSellout_type() {
        return this.sellout_type;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getTotal_balance() {
        return this.total_balance;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final Agent getSellout_agent() {
        return this.sellout_agent;
    }

    public final String getSellout_agent_alias() {
        return this.sellout_agent_alias;
    }

    public final OrderType getOrder_type() {
        return this.order_type;
    }

    public final OrderTrigger getOrder_trigger() {
        return this.order_trigger;
    }

    public final TimeInForce getOrder_time_in_force() {
        return this.order_time_in_force;
    }

    public final String getStop_price() {
        return this.stop_price;
    }

    public final String getLimit_price() {
        return this.limit_price;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePositionSelloutRequest(String account_id, SelloutReason sellout_reason, String contract_id, SelloutType sellout_type, String str, String str2, String str3, Agent sellout_agent, String sellout_agent_alias, OrderType order_type, OrderTrigger order_trigger, TimeInForce order_time_in_force, String str4, String str5, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(sellout_reason, "sellout_reason");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(sellout_type, "sellout_type");
        Intrinsics.checkNotNullParameter(sellout_agent, "sellout_agent");
        Intrinsics.checkNotNullParameter(sellout_agent_alias, "sellout_agent_alias");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
        Intrinsics.checkNotNullParameter(order_time_in_force, "order_time_in_force");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.sellout_reason = sellout_reason;
        this.contract_id = contract_id;
        this.sellout_type = sellout_type;
        this.quantity = str;
        this.total_balance = str2;
        this.notes = str3;
        this.sellout_agent = sellout_agent;
        this.sellout_agent_alias = sellout_agent_alias;
        this.order_type = order_type;
        this.order_trigger = order_trigger;
        this.order_time_in_force = order_time_in_force;
        this.stop_price = str4;
        this.limit_price = str5;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20289newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreatePositionSelloutRequest)) {
            return false;
        }
        CreatePositionSelloutRequest createPositionSelloutRequest = (CreatePositionSelloutRequest) other;
        return Intrinsics.areEqual(unknownFields(), createPositionSelloutRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, createPositionSelloutRequest.account_id) && this.sellout_reason == createPositionSelloutRequest.sellout_reason && Intrinsics.areEqual(this.contract_id, createPositionSelloutRequest.contract_id) && this.sellout_type == createPositionSelloutRequest.sellout_type && Intrinsics.areEqual(this.quantity, createPositionSelloutRequest.quantity) && Intrinsics.areEqual(this.total_balance, createPositionSelloutRequest.total_balance) && Intrinsics.areEqual(this.notes, createPositionSelloutRequest.notes) && this.sellout_agent == createPositionSelloutRequest.sellout_agent && Intrinsics.areEqual(this.sellout_agent_alias, createPositionSelloutRequest.sellout_agent_alias) && this.order_type == createPositionSelloutRequest.order_type && this.order_trigger == createPositionSelloutRequest.order_trigger && this.order_time_in_force == createPositionSelloutRequest.order_time_in_force && Intrinsics.areEqual(this.stop_price, createPositionSelloutRequest.stop_price) && Intrinsics.areEqual(this.limit_price, createPositionSelloutRequest.limit_price);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.sellout_reason.hashCode()) * 37) + this.contract_id.hashCode()) * 37) + this.sellout_type.hashCode()) * 37;
        String str = this.quantity;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.total_balance;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.notes;
        int iHashCode4 = (((((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.sellout_agent.hashCode()) * 37) + this.sellout_agent_alias.hashCode()) * 37) + this.order_type.hashCode()) * 37) + this.order_trigger.hashCode()) * 37) + this.order_time_in_force.hashCode()) * 37;
        String str4 = this.stop_price;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.limit_price;
        int iHashCode6 = iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("sellout_reason=" + this.sellout_reason);
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("sellout_type=" + this.sellout_type);
        String str = this.quantity;
        if (str != null) {
            arrayList.add("quantity=" + Internal.sanitize(str));
        }
        String str2 = this.total_balance;
        if (str2 != null) {
            arrayList.add("total_balance=" + Internal.sanitize(str2));
        }
        String str3 = this.notes;
        if (str3 != null) {
            arrayList.add("notes=" + Internal.sanitize(str3));
        }
        arrayList.add("sellout_agent=" + this.sellout_agent);
        arrayList.add("sellout_agent_alias=" + Internal.sanitize(this.sellout_agent_alias));
        arrayList.add("order_type=" + this.order_type);
        arrayList.add("order_trigger=" + this.order_trigger);
        arrayList.add("order_time_in_force=" + this.order_time_in_force);
        String str4 = this.stop_price;
        if (str4 != null) {
            arrayList.add("stop_price=" + Internal.sanitize(str4));
        }
        String str5 = this.limit_price;
        if (str5 != null) {
            arrayList.add("limit_price=" + Internal.sanitize(str5));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreatePositionSelloutRequest{", "}", 0, null, null, 56, null);
    }

    public final CreatePositionSelloutRequest copy(String account_id, SelloutReason sellout_reason, String contract_id, SelloutType sellout_type, String quantity, String total_balance, String notes, Agent sellout_agent, String sellout_agent_alias, OrderType order_type, OrderTrigger order_trigger, TimeInForce order_time_in_force, String stop_price, String limit_price, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(sellout_reason, "sellout_reason");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(sellout_type, "sellout_type");
        Intrinsics.checkNotNullParameter(sellout_agent, "sellout_agent");
        Intrinsics.checkNotNullParameter(sellout_agent_alias, "sellout_agent_alias");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
        Intrinsics.checkNotNullParameter(order_time_in_force, "order_time_in_force");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreatePositionSelloutRequest(account_id, sellout_reason, contract_id, sellout_type, quantity, total_balance, notes, sellout_agent, sellout_agent_alias, order_type, order_trigger, order_time_in_force, stop_price, limit_price, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreatePositionSelloutRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreatePositionSelloutRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.CreatePositionSelloutRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreatePositionSelloutRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                if (value.getSellout_reason() != SelloutReason.SELLOUT_REASON_UNSPECIFIED) {
                    size += SelloutReason.ADAPTER.encodedSizeWithTag(2, value.getSellout_reason());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getContract_id());
                }
                if (value.getSellout_type() != SelloutType.SELLOUT_TYPE_UNSPECIFIED) {
                    size += SelloutType.ADAPTER.encodedSizeWithTag(4, value.getSellout_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(5, value.getQuantity()) + protoAdapter.encodedSizeWithTag(6, value.getTotal_balance()) + protoAdapter.encodedSizeWithTag(7, value.getNotes());
                if (value.getSellout_agent() != Agent.AGENT_UNSPECIFIED) {
                    iEncodedSizeWithTag += Agent.ADAPTER.encodedSizeWithTag(8, value.getSellout_agent());
                }
                if (!Intrinsics.areEqual(value.getSellout_agent_alias(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(9, value.getSellout_agent_alias());
                }
                if (value.getOrder_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += OrderType.ADAPTER.encodedSizeWithTag(10, value.getOrder_type());
                }
                if (value.getOrder_trigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    iEncodedSizeWithTag += OrderTrigger.ADAPTER.encodedSizeWithTag(11, value.getOrder_trigger());
                }
                if (value.getOrder_time_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    iEncodedSizeWithTag += TimeInForce.ADAPTER.encodedSizeWithTag(12, value.getOrder_time_in_force());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(13, value.getStop_price()) + protoAdapter.encodedSizeWithTag(14, value.getLimit_price());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreatePositionSelloutRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                if (value.getSellout_reason() != SelloutReason.SELLOUT_REASON_UNSPECIFIED) {
                    SelloutReason.ADAPTER.encodeWithTag(writer, 2, (int) value.getSellout_reason());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getContract_id());
                }
                if (value.getSellout_type() != SelloutType.SELLOUT_TYPE_UNSPECIFIED) {
                    SelloutType.ADAPTER.encodeWithTag(writer, 4, (int) value.getSellout_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getQuantity());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getTotal_balance());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getNotes());
                if (value.getSellout_agent() != Agent.AGENT_UNSPECIFIED) {
                    Agent.ADAPTER.encodeWithTag(writer, 8, (int) value.getSellout_agent());
                }
                if (!Intrinsics.areEqual(value.getSellout_agent_alias(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getSellout_agent_alias());
                }
                if (value.getOrder_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 10, (int) value.getOrder_type());
                }
                if (value.getOrder_trigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    OrderTrigger.ADAPTER.encodeWithTag(writer, 11, (int) value.getOrder_trigger());
                }
                if (value.getOrder_time_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 12, (int) value.getOrder_time_in_force());
                }
                protoAdapter.encodeWithTag(writer, 13, (int) value.getStop_price());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getLimit_price());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreatePositionSelloutRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 14, (int) value.getLimit_price());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getStop_price());
                if (value.getOrder_time_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 12, (int) value.getOrder_time_in_force());
                }
                if (value.getOrder_trigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    OrderTrigger.ADAPTER.encodeWithTag(writer, 11, (int) value.getOrder_trigger());
                }
                if (value.getOrder_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 10, (int) value.getOrder_type());
                }
                if (!Intrinsics.areEqual(value.getSellout_agent_alias(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getSellout_agent_alias());
                }
                if (value.getSellout_agent() != Agent.AGENT_UNSPECIFIED) {
                    Agent.ADAPTER.encodeWithTag(writer, 8, (int) value.getSellout_agent());
                }
                protoAdapter.encodeWithTag(writer, 7, (int) value.getNotes());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getTotal_balance());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getQuantity());
                if (value.getSellout_type() != SelloutType.SELLOUT_TYPE_UNSPECIFIED) {
                    SelloutType.ADAPTER.encodeWithTag(writer, 4, (int) value.getSellout_type());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getContract_id());
                }
                if (value.getSellout_reason() != SelloutReason.SELLOUT_REASON_UNSPECIFIED) {
                    SelloutReason.ADAPTER.encodeWithTag(writer, 2, (int) value.getSellout_reason());
                }
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreatePositionSelloutRequest decode(ProtoReader reader) throws IOException {
                SelloutType selloutType;
                Agent agent;
                OrderType orderType;
                Intrinsics.checkNotNullParameter(reader, "reader");
                SelloutReason selloutReason = SelloutReason.SELLOUT_REASON_UNSPECIFIED;
                SelloutType selloutType2 = SelloutType.SELLOUT_TYPE_UNSPECIFIED;
                Agent agent2 = Agent.AGENT_UNSPECIFIED;
                OrderType orderType2 = OrderType.ORDER_TYPE_UNSPECIFIED;
                OrderTrigger orderTrigger = OrderTrigger.ORDER_TRIGGER_UNSPECIFIED;
                TimeInForce timeInForce = TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                SelloutReason selloutReasonDecode = selloutReason;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = null;
                String strDecode4 = null;
                String strDecode5 = null;
                String strDecode6 = null;
                String strDecode7 = null;
                TimeInForce timeInForceDecode = timeInForce;
                String strDecode8 = strDecode2;
                OrderTrigger orderTriggerDecode = orderTrigger;
                OrderType orderTypeDecode = orderType2;
                Agent agentDecode = agent2;
                SelloutType selloutTypeDecode = selloutType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                selloutType = selloutTypeDecode;
                                agent = agentDecode;
                                orderType = orderTypeDecode;
                                try {
                                    selloutReasonDecode = SelloutReason.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                selloutTypeDecode = selloutType;
                                agentDecode = agent;
                                orderTypeDecode = orderType;
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                selloutType = selloutTypeDecode;
                                agent = agentDecode;
                                orderType = orderTypeDecode;
                                try {
                                    selloutTypeDecode = SelloutType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                agentDecode = agent;
                                orderTypeDecode = orderType;
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                selloutType = selloutTypeDecode;
                                agent = agentDecode;
                                orderType = orderTypeDecode;
                                try {
                                    agentDecode = Agent.ADAPTER.decode(reader);
                                    selloutTypeDecode = selloutType;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                orderTypeDecode = orderType;
                                break;
                            case 9:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                selloutType = selloutTypeDecode;
                                agent = agentDecode;
                                orderType = orderTypeDecode;
                                try {
                                    orderTypeDecode = OrderType.ADAPTER.decode(reader);
                                    selloutTypeDecode = selloutType;
                                    agentDecode = agent;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 11:
                                selloutType = selloutTypeDecode;
                                agent = agentDecode;
                                orderType = orderTypeDecode;
                                try {
                                    orderTriggerDecode = OrderTrigger.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                }
                                selloutTypeDecode = selloutType;
                                agentDecode = agent;
                                orderTypeDecode = orderType;
                                break;
                            case 12:
                                try {
                                    timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    selloutType = selloutTypeDecode;
                                    agent = agentDecode;
                                    orderType = orderTypeDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                    break;
                                }
                            case 13:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                selloutType = selloutTypeDecode;
                                agent = agentDecode;
                                orderType = orderTypeDecode;
                                selloutTypeDecode = selloutType;
                                agentDecode = agent;
                                orderTypeDecode = orderType;
                                break;
                        }
                    } else {
                        return new CreatePositionSelloutRequest(strDecode8, selloutReasonDecode, strDecode, selloutTypeDecode, strDecode3, strDecode4, strDecode5, agentDecode, strDecode2, orderTypeDecode, orderTriggerDecode, timeInForceDecode, strDecode6, strDecode7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreatePositionSelloutRequest redact(CreatePositionSelloutRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((16383 & 1) != 0 ? value.account_id : null, (16383 & 2) != 0 ? value.sellout_reason : null, (16383 & 4) != 0 ? value.contract_id : null, (16383 & 8) != 0 ? value.sellout_type : null, (16383 & 16) != 0 ? value.quantity : null, (16383 & 32) != 0 ? value.total_balance : null, (16383 & 64) != 0 ? value.notes : null, (16383 & 128) != 0 ? value.sellout_agent : null, (16383 & 256) != 0 ? value.sellout_agent_alias : null, (16383 & 512) != 0 ? value.order_type : null, (16383 & 1024) != 0 ? value.order_trigger : null, (16383 & 2048) != 0 ? value.order_time_in_force : null, (16383 & 4096) != 0 ? value.stop_price : null, (16383 & 8192) != 0 ? value.limit_price : null, (16383 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

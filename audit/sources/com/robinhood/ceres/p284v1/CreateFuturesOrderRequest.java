package com.robinhood.ceres.p284v1;

import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.mainst.ClientMarketdata;
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
import rosetta.mainst.OrderTrigger;
import rosetta.mainst.OrderType;
import rosetta.mainst.TimeInForce;

/* compiled from: CreateFuturesOrderRequest.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b*\u0018\u0000 R2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001RBÏ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0017¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010-JÕ\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010-R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u0010-R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b3\u0010-R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u00106R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b=\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b>\u0010-R\u001a\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b?\u0010-R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010C\u001a\u0004\b\u0016\u0010DR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010E\u001a\u0004\bF\u0010GR\"\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00100\u001a\u0004\bK\u0010-R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010L\u001a\u0004\bM\u0010NR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\bP\u0010Q¨\u0006S"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesOrderRequest;", "Lcom/squareup/wire/Message;", "", "", "account_id", "", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequest;", "legs", "quantity", "max_show", "Lrosetta/mainst/OrderType;", "order_type", "Lrosetta/mainst/OrderTrigger;", "order_trigger", "Lrosetta/mainst/TimeInForce;", "time_in_force", "limit_price", "stop_price", "ref_id", "Lcom/robinhood/rosetta/mainst/ClientMarketdata;", "client_marketdata", "", "is_auto_send_enabled", "Lcom/robinhood/rosetta/common/Money;", "entered_notional_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "gtd_expiration_time", "quote_id", "Lcom/robinhood/ceres/v1/OrderEntryMetadata;", "order_entry_metadata", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderType;Lrosetta/mainst/OrderTrigger;Lrosetta/mainst/TimeInForce;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/ClientMarketdata;Ljava/lang/Boolean;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderEntryMetadata;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderType;Lrosetta/mainst/OrderTrigger;Lrosetta/mainst/TimeInForce;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/ClientMarketdata;Ljava/lang/Boolean;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderEntryMetadata;Lokio/ByteString;)Lcom/robinhood/ceres/v1/CreateFuturesOrderRequest;", "Ljava/lang/String;", "getAccount_id", "getQuantity", "getMax_show", "Lrosetta/mainst/OrderType;", "getOrder_type", "()Lrosetta/mainst/OrderType;", "Lrosetta/mainst/OrderTrigger;", "getOrder_trigger", "()Lrosetta/mainst/OrderTrigger;", "Lrosetta/mainst/TimeInForce;", "getTime_in_force", "()Lrosetta/mainst/TimeInForce;", "getLimit_price", "getStop_price", "getRef_id", "Lcom/robinhood/rosetta/mainst/ClientMarketdata;", "getClient_marketdata", "()Lcom/robinhood/rosetta/mainst/ClientMarketdata;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lcom/robinhood/rosetta/common/Money;", "getEntered_notional_amount", "()Lcom/robinhood/rosetta/common/Money;", "Lj$/time/Instant;", "getGtd_expiration_time", "()Lj$/time/Instant;", "getQuote_id", "Lcom/robinhood/ceres/v1/OrderEntryMetadata;", "getOrder_entry_metadata", "()Lcom/robinhood/ceres/v1/OrderEntryMetadata;", "Ljava/util/List;", "getLegs", "()Ljava/util/List;", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CreateFuturesOrderRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreateFuturesOrderRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.ClientMarketdata#ADAPTER", jsonName = "clientMarketdata", schemaIndex = 10, tag = 11)
    private final ClientMarketdata client_marketdata;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "enteredNotionalAmount", schemaIndex = 12, tag = 21)
    private final Money entered_notional_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "gtdExpirationTime", schemaIndex = 13, tag = 22)
    private final Instant gtd_expiration_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isAutoSendEnabled", schemaIndex = 11, tag = 12)
    private final Boolean is_auto_send_enabled;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesOrderLegRequest#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<FuturesOrderLegRequest> legs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitPrice", schemaIndex = 7, tag = 8)
    private final String limit_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxShow", schemaIndex = 3, tag = 4)
    private final String max_show;

    @WireField(adapter = "com.robinhood.ceres.v1.OrderEntryMetadata#ADAPTER", jsonName = "orderEntryMetadata", schemaIndex = 15, tag = 25)
    private final OrderEntryMetadata order_entry_metadata;

    @WireField(adapter = "rosetta.mainst.OrderTrigger#ADAPTER", jsonName = "orderTrigger", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final OrderTrigger order_trigger;

    @WireField(adapter = "rosetta.mainst.OrderType#ADAPTER", jsonName = "orderType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final OrderType order_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteId", schemaIndex = 14, tag = 23)
    private final String quote_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String ref_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stopPrice", schemaIndex = 8, tag = 9)
    private final String stop_price;

    @WireField(adapter = "rosetta.mainst.TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final TimeInForce time_in_force;

    public CreateFuturesOrderRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public /* synthetic */ CreateFuturesOrderRequest(String str, List list, String str2, String str3, OrderType orderType, OrderTrigger orderTrigger, TimeInForce timeInForce, String str4, String str5, String str6, ClientMarketdata clientMarketdata, Boolean bool, Money money, Instant instant, String str7, OrderEntryMetadata orderEntryMetadata, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i & 32) != 0 ? OrderTrigger.ORDER_TRIGGER_UNSPECIFIED : orderTrigger, (i & 64) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) == 0 ? str6 : "", (i & 1024) != 0 ? null : clientMarketdata, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : money, (i & 8192) != 0 ? null : instant, (i & 16384) != 0 ? null : str7, (i & 32768) != 0 ? null : orderEntryMetadata, (i & 65536) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20288newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getMax_show() {
        return this.max_show;
    }

    public final OrderType getOrder_type() {
        return this.order_type;
    }

    public final OrderTrigger getOrder_trigger() {
        return this.order_trigger;
    }

    public final TimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    public final String getLimit_price() {
        return this.limit_price;
    }

    public final String getStop_price() {
        return this.stop_price;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final ClientMarketdata getClient_marketdata() {
        return this.client_marketdata;
    }

    /* renamed from: is_auto_send_enabled, reason: from getter */
    public final Boolean getIs_auto_send_enabled() {
        return this.is_auto_send_enabled;
    }

    public final Money getEntered_notional_amount() {
        return this.entered_notional_amount;
    }

    public final Instant getGtd_expiration_time() {
        return this.gtd_expiration_time;
    }

    public final String getQuote_id() {
        return this.quote_id;
    }

    public final OrderEntryMetadata getOrder_entry_metadata() {
        return this.order_entry_metadata;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFuturesOrderRequest(String account_id, List<FuturesOrderLegRequest> legs, String quantity, String str, OrderType order_type, OrderTrigger order_trigger, TimeInForce time_in_force, String str2, String str3, String ref_id, ClientMarketdata clientMarketdata, Boolean bool, Money money, Instant instant, String str4, OrderEntryMetadata orderEntryMetadata, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.quantity = quantity;
        this.max_show = str;
        this.order_type = order_type;
        this.order_trigger = order_trigger;
        this.time_in_force = time_in_force;
        this.limit_price = str2;
        this.stop_price = str3;
        this.ref_id = ref_id;
        this.client_marketdata = clientMarketdata;
        this.is_auto_send_enabled = bool;
        this.entered_notional_amount = money;
        this.gtd_expiration_time = instant;
        this.quote_id = str4;
        this.order_entry_metadata = orderEntryMetadata;
        this.legs = Internal.immutableCopyOf("legs", legs);
    }

    public final List<FuturesOrderLegRequest> getLegs() {
        return this.legs;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20288newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateFuturesOrderRequest)) {
            return false;
        }
        CreateFuturesOrderRequest createFuturesOrderRequest = (CreateFuturesOrderRequest) other;
        return Intrinsics.areEqual(unknownFields(), createFuturesOrderRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, createFuturesOrderRequest.account_id) && Intrinsics.areEqual(this.legs, createFuturesOrderRequest.legs) && Intrinsics.areEqual(this.quantity, createFuturesOrderRequest.quantity) && Intrinsics.areEqual(this.max_show, createFuturesOrderRequest.max_show) && this.order_type == createFuturesOrderRequest.order_type && this.order_trigger == createFuturesOrderRequest.order_trigger && this.time_in_force == createFuturesOrderRequest.time_in_force && Intrinsics.areEqual(this.limit_price, createFuturesOrderRequest.limit_price) && Intrinsics.areEqual(this.stop_price, createFuturesOrderRequest.stop_price) && Intrinsics.areEqual(this.ref_id, createFuturesOrderRequest.ref_id) && Intrinsics.areEqual(this.client_marketdata, createFuturesOrderRequest.client_marketdata) && Intrinsics.areEqual(this.is_auto_send_enabled, createFuturesOrderRequest.is_auto_send_enabled) && Intrinsics.areEqual(this.entered_notional_amount, createFuturesOrderRequest.entered_notional_amount) && Intrinsics.areEqual(this.gtd_expiration_time, createFuturesOrderRequest.gtd_expiration_time) && Intrinsics.areEqual(this.quote_id, createFuturesOrderRequest.quote_id) && Intrinsics.areEqual(this.order_entry_metadata, createFuturesOrderRequest.order_entry_metadata);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.legs.hashCode()) * 37) + this.quantity.hashCode()) * 37;
        String str = this.max_show;
        int iHashCode2 = (((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.order_type.hashCode()) * 37) + this.order_trigger.hashCode()) * 37) + this.time_in_force.hashCode()) * 37;
        String str2 = this.limit_price;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.stop_price;
        int iHashCode4 = (((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.ref_id.hashCode()) * 37;
        ClientMarketdata clientMarketdata = this.client_marketdata;
        int iHashCode5 = (iHashCode4 + (clientMarketdata != null ? clientMarketdata.hashCode() : 0)) * 37;
        Boolean bool = this.is_auto_send_enabled;
        int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        Money money = this.entered_notional_amount;
        int iHashCode7 = (iHashCode6 + (money != null ? money.hashCode() : 0)) * 37;
        Instant instant = this.gtd_expiration_time;
        int iHashCode8 = (iHashCode7 + (instant != null ? instant.hashCode() : 0)) * 37;
        String str4 = this.quote_id;
        int iHashCode9 = (iHashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        OrderEntryMetadata orderEntryMetadata = this.order_entry_metadata;
        int iHashCode10 = iHashCode9 + (orderEntryMetadata != null ? orderEntryMetadata.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        if (!this.legs.isEmpty()) {
            arrayList.add("legs=" + this.legs);
        }
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        String str = this.max_show;
        if (str != null) {
            arrayList.add("max_show=" + Internal.sanitize(str));
        }
        arrayList.add("order_type=" + this.order_type);
        arrayList.add("order_trigger=" + this.order_trigger);
        arrayList.add("time_in_force=" + this.time_in_force);
        String str2 = this.limit_price;
        if (str2 != null) {
            arrayList.add("limit_price=" + Internal.sanitize(str2));
        }
        String str3 = this.stop_price;
        if (str3 != null) {
            arrayList.add("stop_price=" + Internal.sanitize(str3));
        }
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        ClientMarketdata clientMarketdata = this.client_marketdata;
        if (clientMarketdata != null) {
            arrayList.add("client_marketdata=" + clientMarketdata);
        }
        Boolean bool = this.is_auto_send_enabled;
        if (bool != null) {
            arrayList.add("is_auto_send_enabled=" + bool);
        }
        Money money = this.entered_notional_amount;
        if (money != null) {
            arrayList.add("entered_notional_amount=" + money);
        }
        Instant instant = this.gtd_expiration_time;
        if (instant != null) {
            arrayList.add("gtd_expiration_time=" + instant);
        }
        String str4 = this.quote_id;
        if (str4 != null) {
            arrayList.add("quote_id=" + Internal.sanitize(str4));
        }
        OrderEntryMetadata orderEntryMetadata = this.order_entry_metadata;
        if (orderEntryMetadata != null) {
            arrayList.add("order_entry_metadata=" + orderEntryMetadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateFuturesOrderRequest{", "}", 0, null, null, 56, null);
    }

    public final CreateFuturesOrderRequest copy(String account_id, List<FuturesOrderLegRequest> legs, String quantity, String max_show, OrderType order_type, OrderTrigger order_trigger, TimeInForce time_in_force, String limit_price, String stop_price, String ref_id, ClientMarketdata client_marketdata, Boolean is_auto_send_enabled, Money entered_notional_amount, Instant gtd_expiration_time, String quote_id, OrderEntryMetadata order_entry_metadata, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateFuturesOrderRequest(account_id, legs, quantity, max_show, order_type, order_trigger, time_in_force, limit_price, stop_price, ref_id, client_marketdata, is_auto_send_enabled, entered_notional_amount, gtd_expiration_time, quote_id, order_entry_metadata, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateFuturesOrderRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateFuturesOrderRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.CreateFuturesOrderRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateFuturesOrderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                int iEncodedSizeWithTag = size + FuturesOrderLegRequest.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getLegs());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getQuantity());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getMax_show());
                if (value.getOrder_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += OrderType.ADAPTER.encodedSizeWithTag(5, value.getOrder_type());
                }
                if (value.getOrder_trigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += OrderTrigger.ADAPTER.encodedSizeWithTag(6, value.getOrder_trigger());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += TimeInForce.ADAPTER.encodedSizeWithTag(7, value.getTime_in_force());
                }
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(8, value.getLimit_price()) + protoAdapter.encodedSizeWithTag(9, value.getStop_price());
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(10, value.getRef_id());
                }
                return iEncodedSizeWithTag3 + ClientMarketdata.ADAPTER.encodedSizeWithTag(11, value.getClient_marketdata()) + ProtoAdapter.BOOL.encodedSizeWithTag(12, value.getIs_auto_send_enabled()) + Money.ADAPTER.encodedSizeWithTag(21, value.getEntered_notional_amount()) + ProtoAdapter.INSTANT.encodedSizeWithTag(22, value.getGtd_expiration_time()) + protoAdapter.encodedSizeWithTag(23, value.getQuote_id()) + OrderEntryMetadata.ADAPTER.encodedSizeWithTag(25, value.getOrder_entry_metadata());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateFuturesOrderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                FuturesOrderLegRequest.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getLegs());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuantity());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getMax_show());
                if (value.getOrder_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 5, (int) value.getOrder_type());
                }
                if (value.getOrder_trigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    OrderTrigger.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrder_trigger());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 7, (int) value.getTime_in_force());
                }
                protoAdapter.encodeWithTag(writer, 8, (int) value.getLimit_price());
                protoAdapter.encodeWithTag(writer, 9, (int) value.getStop_price());
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getRef_id());
                }
                ClientMarketdata.ADAPTER.encodeWithTag(writer, 11, (int) value.getClient_marketdata());
                ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) value.getIs_auto_send_enabled());
                Money.ADAPTER.encodeWithTag(writer, 21, (int) value.getEntered_notional_amount());
                ProtoAdapter.INSTANT.encodeWithTag(writer, 22, (int) value.getGtd_expiration_time());
                protoAdapter.encodeWithTag(writer, 23, (int) value.getQuote_id());
                OrderEntryMetadata.ADAPTER.encodeWithTag(writer, 25, (int) value.getOrder_entry_metadata());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateFuturesOrderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                OrderEntryMetadata.ADAPTER.encodeWithTag(writer, 25, (int) value.getOrder_entry_metadata());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 23, (int) value.getQuote_id());
                ProtoAdapter.INSTANT.encodeWithTag(writer, 22, (int) value.getGtd_expiration_time());
                Money.ADAPTER.encodeWithTag(writer, 21, (int) value.getEntered_notional_amount());
                ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) value.getIs_auto_send_enabled());
                ClientMarketdata.ADAPTER.encodeWithTag(writer, 11, (int) value.getClient_marketdata());
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getRef_id());
                }
                protoAdapter.encodeWithTag(writer, 9, (int) value.getStop_price());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getLimit_price());
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 7, (int) value.getTime_in_force());
                }
                if (value.getOrder_trigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    OrderTrigger.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrder_trigger());
                }
                if (value.getOrder_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 5, (int) value.getOrder_type());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getMax_show());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getQuantity());
                }
                FuturesOrderLegRequest.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getLegs());
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateFuturesOrderRequest decode(ProtoReader reader) throws IOException {
                OrderTrigger orderTrigger;
                TimeInForce timeInForce;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                OrderType orderType = OrderType.ORDER_TYPE_UNSPECIFIED;
                OrderTrigger orderTrigger2 = OrderTrigger.ORDER_TRIGGER_UNSPECIFIED;
                TimeInForce timeInForce2 = TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                OrderType orderTypeDecode = orderType;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = null;
                String strDecode4 = null;
                String strDecode5 = null;
                ClientMarketdata clientMarketdataDecode = null;
                Boolean boolDecode = null;
                Money moneyDecode = null;
                Instant instantDecode = null;
                String strDecode6 = null;
                OrderEntryMetadata orderEntryMetadataDecode = null;
                TimeInForce timeInForceDecode = timeInForce2;
                String strDecode7 = strDecode2;
                OrderTrigger orderTriggerDecode = orderTrigger2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CreateFuturesOrderRequest(strDecode7, arrayList, strDecode, strDecode3, orderTypeDecode, orderTriggerDecode, timeInForceDecode, strDecode4, strDecode5, strDecode2, clientMarketdataDecode, boolDecode, moneyDecode, instantDecode, strDecode6, orderEntryMetadataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag != 25) {
                        switch (iNextTag) {
                            case 1:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                orderTrigger = orderTriggerDecode;
                                timeInForce = timeInForceDecode;
                                str = strDecode7;
                                arrayList.add(FuturesOrderLegRequest.ADAPTER.decode(reader));
                                orderTriggerDecode = orderTrigger;
                                strDecode7 = str;
                                timeInForceDecode = timeInForce;
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                orderTrigger = orderTriggerDecode;
                                timeInForce = timeInForceDecode;
                                str = strDecode7;
                                try {
                                    orderTypeDecode = OrderType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                orderTriggerDecode = orderTrigger;
                                strDecode7 = str;
                                timeInForceDecode = timeInForce;
                                break;
                            case 6:
                                orderTrigger = orderTriggerDecode;
                                timeInForce = timeInForceDecode;
                                str = strDecode7;
                                try {
                                    orderTriggerDecode = OrderTrigger.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                strDecode7 = str;
                                timeInForceDecode = timeInForce;
                                break;
                            case 7:
                                try {
                                    timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    orderTrigger = orderTriggerDecode;
                                    timeInForce = timeInForceDecode;
                                    str = strDecode7;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                clientMarketdataDecode = ClientMarketdata.ADAPTER.decode(reader);
                                break;
                            case 12:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            default:
                                switch (iNextTag) {
                                    case 21:
                                        moneyDecode = Money.ADAPTER.decode(reader);
                                        continue;
                                    case 22:
                                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                        continue;
                                    case 23:
                                        strDecode6 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    default:
                                        reader.readUnknownField(iNextTag);
                                        orderTrigger = orderTriggerDecode;
                                        timeInForce = timeInForceDecode;
                                        str = strDecode7;
                                        break;
                                }
                                orderTriggerDecode = orderTrigger;
                                strDecode7 = str;
                                timeInForceDecode = timeInForce;
                                break;
                        }
                    } else {
                        orderEntryMetadataDecode = OrderEntryMetadata.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateFuturesOrderRequest redact(CreateFuturesOrderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getLegs(), FuturesOrderLegRequest.ADAPTER);
                ClientMarketdata client_marketdata = value.getClient_marketdata();
                ClientMarketdata clientMarketdataRedact = client_marketdata != null ? ClientMarketdata.ADAPTER.redact(client_marketdata) : null;
                Money entered_notional_amount = value.getEntered_notional_amount();
                Money moneyRedact = entered_notional_amount != null ? Money.ADAPTER.redact(entered_notional_amount) : null;
                Instant gtd_expiration_time = value.getGtd_expiration_time();
                Instant instantRedact = gtd_expiration_time != null ? ProtoAdapter.INSTANT.redact(gtd_expiration_time) : null;
                OrderEntryMetadata order_entry_metadata = value.getOrder_entry_metadata();
                return value.copy((19453 & 1) != 0 ? value.account_id : null, (19453 & 2) != 0 ? value.legs : listM26823redactElements, (19453 & 4) != 0 ? value.quantity : null, (19453 & 8) != 0 ? value.max_show : null, (19453 & 16) != 0 ? value.order_type : null, (19453 & 32) != 0 ? value.order_trigger : null, (19453 & 64) != 0 ? value.time_in_force : null, (19453 & 128) != 0 ? value.limit_price : null, (19453 & 256) != 0 ? value.stop_price : null, (19453 & 512) != 0 ? value.ref_id : null, (19453 & 1024) != 0 ? value.client_marketdata : clientMarketdataRedact, (19453 & 2048) != 0 ? value.is_auto_send_enabled : null, (19453 & 4096) != 0 ? value.entered_notional_amount : moneyRedact, (19453 & 8192) != 0 ? value.gtd_expiration_time : instantRedact, (19453 & 16384) != 0 ? value.quote_id : null, (19453 & 32768) != 0 ? value.order_entry_metadata : order_entry_metadata != null ? OrderEntryMetadata.ADAPTER.redact(order_entry_metadata) : null, (19453 & 65536) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

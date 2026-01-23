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
import rosetta.mainst.OrderState;
import rosetta.mainst.OrderTrigger;
import rosetta.mainst.OrderType;
import rosetta.mainst.Side;

/* compiled from: GetOrdersRequest.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 Q2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001QB\u008f\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010$\u001a\u00020%¢\u0006\u0004\b&\u0010'J\b\u0010I\u001a\u00020\u0002H\u0017J\u0013\u0010J\u001a\u00020\u001a2\b\u0010K\u001a\u0004\u0018\u00010LH\u0096\u0002J\b\u0010M\u001a\u00020\u000bH\u0016J\b\u0010N\u001a\u00020\u0004H\u0016J\u0093\u0002\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020%¢\u0006\u0002\u0010PR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010)R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010)R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\b\u0019\u0010<R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010)R\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0018\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010H¨\u0006R"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetOrdersRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "order_state", "", "Lrosetta/mainst/OrderState;", "contract_id", "cursor", "page_size", "", "account_number", "order_id", "order_type", "Lrosetta/mainst/OrderType;", "order_side", "Lrosetta/mainst/Side;", "start_date", "end_date", "comma_separated_order_state", "updated_at_start_time", "updated_at_end_time", "order_trigger", "Lrosetta/mainst/OrderTrigger;", "is_download_csv", "", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractType;", "reject_reason", "Lcom/robinhood/ceres/v1/OrderRejectReason;", "rhs_account_number", "shard_region", "Lcom/robinhood/ceres/v1/ShardRegion;", "shard_number", "Lcom/robinhood/ceres/v1/ShardNumber;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderType;Lrosetta/mainst/Side;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderTrigger;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/FuturesContractType;Lcom/robinhood/ceres/v1/OrderRejectReason;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegion;Lcom/robinhood/ceres/v1/ShardNumber;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getContract_id", "getCursor", "getPage_size", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAccount_number", "getOrder_id", "getOrder_type", "()Lrosetta/mainst/OrderType;", "getOrder_side", "()Lrosetta/mainst/Side;", "getStart_date", "getEnd_date", "getComma_separated_order_state", "getUpdated_at_start_time", "getUpdated_at_end_time", "getOrder_trigger", "()Lrosetta/mainst/OrderTrigger;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractType;", "getReject_reason", "()Lcom/robinhood/ceres/v1/OrderRejectReason;", "getRhs_account_number", "getShard_region", "()Lcom/robinhood/ceres/v1/ShardRegion;", "getShard_number", "()Lcom/robinhood/ceres/v1/ShardNumber;", "getOrder_state", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderType;Lrosetta/mainst/Side;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderTrigger;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/FuturesContractType;Lcom/robinhood/ceres/v1/OrderRejectReason;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegion;Lcom/robinhood/ceres/v1/ShardNumber;Lokio/ByteString;)Lcom/robinhood/ceres/v1/GetOrdersRequest;", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetOrdersRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetOrdersRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", schemaIndex = 5, tag = 6)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "commaSeparatedOrderState", schemaIndex = 11, tag = 12)
    private final String comma_separated_order_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", schemaIndex = 2, tag = 3)
    private final String contract_id;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesContractType#ADAPTER", jsonName = "contractType", schemaIndex = 16, tag = 17)
    private final FuturesContractType contract_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "endDate", schemaIndex = 10, tag = 11)
    private final String end_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDownloadCsv", schemaIndex = 15, tag = 16)
    private final Boolean is_download_csv;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", schemaIndex = 6, tag = 7)
    private final String order_id;

    @WireField(adapter = "rosetta.mainst.Side#ADAPTER", jsonName = "orderSide", schemaIndex = 8, tag = 9)
    private final Side order_side;

    @WireField(adapter = "rosetta.mainst.OrderState#ADAPTER", jsonName = "orderState", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<OrderState> order_state;

    @WireField(adapter = "rosetta.mainst.OrderTrigger#ADAPTER", jsonName = "orderTrigger", schemaIndex = 14, tag = 15)
    private final OrderTrigger order_trigger;

    @WireField(adapter = "rosetta.mainst.OrderType#ADAPTER", jsonName = "orderType", schemaIndex = 7, tag = 8)
    private final OrderType order_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageSize", schemaIndex = 4, tag = 5)
    private final Integer page_size;

    @WireField(adapter = "com.robinhood.ceres.v1.OrderRejectReason#ADAPTER", jsonName = "rejectReason", schemaIndex = 17, tag = 18)
    private final OrderRejectReason reject_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", schemaIndex = 18, tag = 19)
    private final String rhs_account_number;

    @WireField(adapter = "com.robinhood.ceres.v1.ShardNumber#ADAPTER", jsonName = "shardNumber", schemaIndex = 20, tag = 21)
    private final ShardNumber shard_number;

    @WireField(adapter = "com.robinhood.ceres.v1.ShardRegion#ADAPTER", jsonName = "shardRegion", schemaIndex = 19, tag = 20)
    private final ShardRegion shard_region;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "startDate", schemaIndex = 9, tag = 10)
    private final String start_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAtEndTime", schemaIndex = 13, tag = 14)
    private final String updated_at_end_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAtStartTime", schemaIndex = 12, tag = 13)
    private final String updated_at_start_time;

    public GetOrdersRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20373newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public /* synthetic */ GetOrdersRequest(String str, List list, String str2, String str3, Integer num, String str4, String str5, OrderType orderType, Side side, String str6, String str7, String str8, String str9, String str10, OrderTrigger orderTrigger, Boolean bool, FuturesContractType futuresContractType, OrderRejectReason orderRejectReason, String str11, ShardRegion shardRegion, ShardNumber shardNumber, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : orderType, (i & 256) != 0 ? null : side, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : orderTrigger, (i & 32768) != 0 ? null : bool, (i & 65536) != 0 ? null : futuresContractType, (i & 131072) != 0 ? null : orderRejectReason, (i & 262144) != 0 ? null : str11, (i & 524288) != 0 ? null : shardRegion, (i & 1048576) != 0 ? null : shardNumber, (i & 2097152) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Integer getPage_size() {
        return this.page_size;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final OrderType getOrder_type() {
        return this.order_type;
    }

    public final Side getOrder_side() {
        return this.order_side;
    }

    public final String getStart_date() {
        return this.start_date;
    }

    public final String getEnd_date() {
        return this.end_date;
    }

    public final String getComma_separated_order_state() {
        return this.comma_separated_order_state;
    }

    public final String getUpdated_at_start_time() {
        return this.updated_at_start_time;
    }

    public final String getUpdated_at_end_time() {
        return this.updated_at_end_time;
    }

    public final OrderTrigger getOrder_trigger() {
        return this.order_trigger;
    }

    /* renamed from: is_download_csv, reason: from getter */
    public final Boolean getIs_download_csv() {
        return this.is_download_csv;
    }

    public final FuturesContractType getContract_type() {
        return this.contract_type;
    }

    public final OrderRejectReason getReject_reason() {
        return this.reject_reason;
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public final ShardRegion getShard_region() {
        return this.shard_region;
    }

    public final ShardNumber getShard_number() {
        return this.shard_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrdersRequest(String account_id, List<? extends OrderState> order_state, String str, String str2, Integer num, String str3, String str4, OrderType orderType, Side side, String str5, String str6, String str7, String str8, String str9, OrderTrigger orderTrigger, Boolean bool, FuturesContractType futuresContractType, OrderRejectReason orderRejectReason, String str10, ShardRegion shardRegion, ShardNumber shardNumber, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.contract_id = str;
        this.cursor = str2;
        this.page_size = num;
        this.account_number = str3;
        this.order_id = str4;
        this.order_type = orderType;
        this.order_side = side;
        this.start_date = str5;
        this.end_date = str6;
        this.comma_separated_order_state = str7;
        this.updated_at_start_time = str8;
        this.updated_at_end_time = str9;
        this.order_trigger = orderTrigger;
        this.is_download_csv = bool;
        this.contract_type = futuresContractType;
        this.reject_reason = orderRejectReason;
        this.rhs_account_number = str10;
        this.shard_region = shardRegion;
        this.shard_number = shardNumber;
        this.order_state = Internal.immutableCopyOf("order_state", order_state);
    }

    public final List<OrderState> getOrder_state() {
        return this.order_state;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20373newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetOrdersRequest)) {
            return false;
        }
        GetOrdersRequest getOrdersRequest = (GetOrdersRequest) other;
        return Intrinsics.areEqual(unknownFields(), getOrdersRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, getOrdersRequest.account_id) && Intrinsics.areEqual(this.order_state, getOrdersRequest.order_state) && Intrinsics.areEqual(this.contract_id, getOrdersRequest.contract_id) && Intrinsics.areEqual(this.cursor, getOrdersRequest.cursor) && Intrinsics.areEqual(this.page_size, getOrdersRequest.page_size) && Intrinsics.areEqual(this.account_number, getOrdersRequest.account_number) && Intrinsics.areEqual(this.order_id, getOrdersRequest.order_id) && this.order_type == getOrdersRequest.order_type && this.order_side == getOrdersRequest.order_side && Intrinsics.areEqual(this.start_date, getOrdersRequest.start_date) && Intrinsics.areEqual(this.end_date, getOrdersRequest.end_date) && Intrinsics.areEqual(this.comma_separated_order_state, getOrdersRequest.comma_separated_order_state) && Intrinsics.areEqual(this.updated_at_start_time, getOrdersRequest.updated_at_start_time) && Intrinsics.areEqual(this.updated_at_end_time, getOrdersRequest.updated_at_end_time) && this.order_trigger == getOrdersRequest.order_trigger && Intrinsics.areEqual(this.is_download_csv, getOrdersRequest.is_download_csv) && this.contract_type == getOrdersRequest.contract_type && this.reject_reason == getOrdersRequest.reject_reason && Intrinsics.areEqual(this.rhs_account_number, getOrdersRequest.rhs_account_number) && this.shard_region == getOrdersRequest.shard_region && this.shard_number == getOrdersRequest.shard_number;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.order_state.hashCode()) * 37;
        String str = this.contract_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cursor;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.page_size;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        String str3 = this.account_number;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.order_id;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        OrderType orderType = this.order_type;
        int iHashCode7 = (iHashCode6 + (orderType != null ? orderType.hashCode() : 0)) * 37;
        Side side = this.order_side;
        int iHashCode8 = (iHashCode7 + (side != null ? side.hashCode() : 0)) * 37;
        String str5 = this.start_date;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.end_date;
        int iHashCode10 = (iHashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.comma_separated_order_state;
        int iHashCode11 = (iHashCode10 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.updated_at_start_time;
        int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.updated_at_end_time;
        int iHashCode13 = (iHashCode12 + (str9 != null ? str9.hashCode() : 0)) * 37;
        OrderTrigger orderTrigger = this.order_trigger;
        int iHashCode14 = (iHashCode13 + (orderTrigger != null ? orderTrigger.hashCode() : 0)) * 37;
        Boolean bool = this.is_download_csv;
        int iHashCode15 = (iHashCode14 + (bool != null ? bool.hashCode() : 0)) * 37;
        FuturesContractType futuresContractType = this.contract_type;
        int iHashCode16 = (iHashCode15 + (futuresContractType != null ? futuresContractType.hashCode() : 0)) * 37;
        OrderRejectReason orderRejectReason = this.reject_reason;
        int iHashCode17 = (iHashCode16 + (orderRejectReason != null ? orderRejectReason.hashCode() : 0)) * 37;
        String str10 = this.rhs_account_number;
        int iHashCode18 = (iHashCode17 + (str10 != null ? str10.hashCode() : 0)) * 37;
        ShardRegion shardRegion = this.shard_region;
        int iHashCode19 = (iHashCode18 + (shardRegion != null ? shardRegion.hashCode() : 0)) * 37;
        ShardNumber shardNumber = this.shard_number;
        int iHashCode20 = iHashCode19 + (shardNumber != null ? shardNumber.hashCode() : 0);
        this.hashCode = iHashCode20;
        return iHashCode20;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        if (!this.order_state.isEmpty()) {
            arrayList.add("order_state=" + this.order_state);
        }
        String str = this.contract_id;
        if (str != null) {
            arrayList.add("contract_id=" + Internal.sanitize(str));
        }
        String str2 = this.cursor;
        if (str2 != null) {
            arrayList.add("cursor=" + Internal.sanitize(str2));
        }
        Integer num = this.page_size;
        if (num != null) {
            arrayList.add("page_size=" + num);
        }
        String str3 = this.account_number;
        if (str3 != null) {
            arrayList.add("account_number=" + Internal.sanitize(str3));
        }
        String str4 = this.order_id;
        if (str4 != null) {
            arrayList.add("order_id=" + Internal.sanitize(str4));
        }
        OrderType orderType = this.order_type;
        if (orderType != null) {
            arrayList.add("order_type=" + orderType);
        }
        Side side = this.order_side;
        if (side != null) {
            arrayList.add("order_side=" + side);
        }
        String str5 = this.start_date;
        if (str5 != null) {
            arrayList.add("start_date=" + Internal.sanitize(str5));
        }
        String str6 = this.end_date;
        if (str6 != null) {
            arrayList.add("end_date=" + Internal.sanitize(str6));
        }
        String str7 = this.comma_separated_order_state;
        if (str7 != null) {
            arrayList.add("comma_separated_order_state=" + Internal.sanitize(str7));
        }
        String str8 = this.updated_at_start_time;
        if (str8 != null) {
            arrayList.add("updated_at_start_time=" + Internal.sanitize(str8));
        }
        String str9 = this.updated_at_end_time;
        if (str9 != null) {
            arrayList.add("updated_at_end_time=" + Internal.sanitize(str9));
        }
        OrderTrigger orderTrigger = this.order_trigger;
        if (orderTrigger != null) {
            arrayList.add("order_trigger=" + orderTrigger);
        }
        Boolean bool = this.is_download_csv;
        if (bool != null) {
            arrayList.add("is_download_csv=" + bool);
        }
        FuturesContractType futuresContractType = this.contract_type;
        if (futuresContractType != null) {
            arrayList.add("contract_type=" + futuresContractType);
        }
        OrderRejectReason orderRejectReason = this.reject_reason;
        if (orderRejectReason != null) {
            arrayList.add("reject_reason=" + orderRejectReason);
        }
        String str10 = this.rhs_account_number;
        if (str10 != null) {
            arrayList.add("rhs_account_number=" + Internal.sanitize(str10));
        }
        ShardRegion shardRegion = this.shard_region;
        if (shardRegion != null) {
            arrayList.add("shard_region=" + shardRegion);
        }
        ShardNumber shardNumber = this.shard_number;
        if (shardNumber != null) {
            arrayList.add("shard_number=" + shardNumber);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetOrdersRequest{", "}", 0, null, null, 56, null);
    }

    public final GetOrdersRequest copy(String account_id, List<? extends OrderState> order_state, String contract_id, String cursor, Integer page_size, String account_number, String order_id, OrderType order_type, Side order_side, String start_date, String end_date, String comma_separated_order_state, String updated_at_start_time, String updated_at_end_time, OrderTrigger order_trigger, Boolean is_download_csv, FuturesContractType contract_type, OrderRejectReason reject_reason, String rhs_account_number, ShardRegion shard_region, ShardNumber shard_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetOrdersRequest(account_id, order_state, contract_id, cursor, page_size, account_number, order_id, order_type, order_side, start_date, end_date, comma_separated_order_state, updated_at_start_time, updated_at_end_time, order_trigger, is_download_csv, contract_type, reject_reason, rhs_account_number, shard_region, shard_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetOrdersRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetOrdersRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetOrdersRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetOrdersRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                int iEncodedSizeWithTag = size + OrderState.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getOrder_state());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getContract_id()) + protoAdapter.encodedSizeWithTag(4, value.getCursor()) + ProtoAdapter.INT32.encodedSizeWithTag(5, value.getPage_size()) + protoAdapter.encodedSizeWithTag(6, value.getAccount_number()) + protoAdapter.encodedSizeWithTag(7, value.getOrder_id()) + OrderType.ADAPTER.encodedSizeWithTag(8, value.getOrder_type()) + Side.ADAPTER.encodedSizeWithTag(9, value.getOrder_side()) + protoAdapter.encodedSizeWithTag(10, value.getStart_date()) + protoAdapter.encodedSizeWithTag(11, value.getEnd_date()) + protoAdapter.encodedSizeWithTag(12, value.getComma_separated_order_state()) + protoAdapter.encodedSizeWithTag(13, value.getUpdated_at_start_time()) + protoAdapter.encodedSizeWithTag(14, value.getUpdated_at_end_time()) + OrderTrigger.ADAPTER.encodedSizeWithTag(15, value.getOrder_trigger()) + ProtoAdapter.BOOL.encodedSizeWithTag(16, value.getIs_download_csv()) + FuturesContractType.ADAPTER.encodedSizeWithTag(17, value.getContract_type()) + OrderRejectReason.ADAPTER.encodedSizeWithTag(18, value.getReject_reason()) + protoAdapter.encodedSizeWithTag(19, value.getRhs_account_number()) + ShardRegion.ADAPTER.encodedSizeWithTag(20, value.getShard_region()) + ShardNumber.ADAPTER.encodedSizeWithTag(21, value.getShard_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetOrdersRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                OrderState.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getOrder_state());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getContract_id());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getCursor());
                ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) value.getPage_size());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getAccount_number());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getOrder_id());
                OrderType.ADAPTER.encodeWithTag(writer, 8, (int) value.getOrder_type());
                Side.ADAPTER.encodeWithTag(writer, 9, (int) value.getOrder_side());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getStart_date());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getEnd_date());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getComma_separated_order_state());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getUpdated_at_start_time());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getUpdated_at_end_time());
                OrderTrigger.ADAPTER.encodeWithTag(writer, 15, (int) value.getOrder_trigger());
                ProtoAdapter.BOOL.encodeWithTag(writer, 16, (int) value.getIs_download_csv());
                FuturesContractType.ADAPTER.encodeWithTag(writer, 17, (int) value.getContract_type());
                OrderRejectReason.ADAPTER.encodeWithTag(writer, 18, (int) value.getReject_reason());
                protoAdapter.encodeWithTag(writer, 19, (int) value.getRhs_account_number());
                ShardRegion.ADAPTER.encodeWithTag(writer, 20, (int) value.getShard_region());
                ShardNumber.ADAPTER.encodeWithTag(writer, 21, (int) value.getShard_number());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetOrdersRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ShardNumber.ADAPTER.encodeWithTag(writer, 21, (int) value.getShard_number());
                ShardRegion.ADAPTER.encodeWithTag(writer, 20, (int) value.getShard_region());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 19, (int) value.getRhs_account_number());
                OrderRejectReason.ADAPTER.encodeWithTag(writer, 18, (int) value.getReject_reason());
                FuturesContractType.ADAPTER.encodeWithTag(writer, 17, (int) value.getContract_type());
                ProtoAdapter.BOOL.encodeWithTag(writer, 16, (int) value.getIs_download_csv());
                OrderTrigger.ADAPTER.encodeWithTag(writer, 15, (int) value.getOrder_trigger());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getUpdated_at_end_time());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getUpdated_at_start_time());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getComma_separated_order_state());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getEnd_date());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getStart_date());
                Side.ADAPTER.encodeWithTag(writer, 9, (int) value.getOrder_side());
                OrderType.ADAPTER.encodeWithTag(writer, 8, (int) value.getOrder_type());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getOrder_id());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getAccount_number());
                ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) value.getPage_size());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getCursor());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getContract_id());
                OrderState.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getOrder_state());
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetOrdersRequest decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                Integer num;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = null;
                Integer numDecode = null;
                String strDecode4 = null;
                String strDecode5 = null;
                OrderType orderTypeDecode = null;
                Side sideDecode = null;
                String strDecode6 = null;
                String strDecode7 = null;
                String strDecode8 = null;
                String strDecode9 = null;
                String strDecode10 = null;
                OrderTrigger orderTriggerDecode = null;
                Boolean boolDecode = null;
                FuturesContractType futuresContractTypeDecode = null;
                OrderRejectReason orderRejectReasonDecode = null;
                String strDecode11 = null;
                ShardRegion shardRegionDecode = null;
                ShardNumber shardNumberDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetOrdersRequest(strDecode, arrayList, strDecode2, strDecode3, numDecode, strDecode4, strDecode5, orderTypeDecode, sideDecode, strDecode6, strDecode7, strDecode8, strDecode9, strDecode10, orderTriggerDecode, boolDecode, futuresContractTypeDecode, orderRejectReasonDecode, strDecode11, shardRegionDecode, shardNumberDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 2:
                            str = strDecode2;
                            str2 = strDecode3;
                            num = numDecode;
                            try {
                                OrderState.ADAPTER.tryDecode(reader, arrayList);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 3:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 4:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 5:
                            numDecode = ProtoAdapter.INT32.decode(reader);
                            continue;
                        case 6:
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 7:
                            strDecode5 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 8:
                            str = strDecode2;
                            str2 = strDecode3;
                            num = numDecode;
                            try {
                                orderTypeDecode = OrderType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 9:
                            str = strDecode2;
                            str2 = strDecode3;
                            num = numDecode;
                            try {
                                sideDecode = Side.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        case 10:
                            strDecode6 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 11:
                            strDecode7 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 12:
                            strDecode8 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 13:
                            strDecode9 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 14:
                            strDecode10 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 15:
                            str = strDecode2;
                            str2 = strDecode3;
                            num = numDecode;
                            try {
                                orderTriggerDecode = OrderTrigger.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 16:
                            boolDecode = ProtoAdapter.BOOL.decode(reader);
                            continue;
                        case 17:
                            str = strDecode2;
                            str2 = strDecode3;
                            num = numDecode;
                            try {
                                futuresContractTypeDecode = FuturesContractType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                break;
                            }
                        case 18:
                            str = strDecode2;
                            str2 = strDecode3;
                            num = numDecode;
                            try {
                                orderRejectReasonDecode = OrderRejectReason.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                break;
                            }
                        case 19:
                            strDecode11 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 20:
                            str = strDecode2;
                            str2 = strDecode3;
                            num = numDecode;
                            try {
                                shardRegionDecode = ShardRegion.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                                break;
                            }
                        case 21:
                            try {
                                shardNumberDecode = ShardNumber.ADAPTER.decode(reader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                str = strDecode2;
                                str2 = strDecode3;
                                num = numDecode;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                                break;
                            }
                        default:
                            reader.readUnknownField(iNextTag);
                            str = strDecode2;
                            str2 = strDecode3;
                            num = numDecode;
                            break;
                    }
                    strDecode2 = str;
                    strDecode3 = str2;
                    numDecode = num;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetOrdersRequest redact(GetOrdersRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((2097151 & 1) != 0 ? value.account_id : null, (2097151 & 2) != 0 ? value.order_state : null, (2097151 & 4) != 0 ? value.contract_id : null, (2097151 & 8) != 0 ? value.cursor : null, (2097151 & 16) != 0 ? value.page_size : null, (2097151 & 32) != 0 ? value.account_number : null, (2097151 & 64) != 0 ? value.order_id : null, (2097151 & 128) != 0 ? value.order_type : null, (2097151 & 256) != 0 ? value.order_side : null, (2097151 & 512) != 0 ? value.start_date : null, (2097151 & 1024) != 0 ? value.end_date : null, (2097151 & 2048) != 0 ? value.comma_separated_order_state : null, (2097151 & 4096) != 0 ? value.updated_at_start_time : null, (2097151 & 8192) != 0 ? value.updated_at_end_time : null, (2097151 & 16384) != 0 ? value.order_trigger : null, (2097151 & 32768) != 0 ? value.is_download_csv : null, (2097151 & 65536) != 0 ? value.contract_type : null, (2097151 & 131072) != 0 ? value.reject_reason : null, (2097151 & 262144) != 0 ? value.rhs_account_number : null, (2097151 & 524288) != 0 ? value.shard_region : null, (2097151 & 1048576) != 0 ? value.shard_number : null, (2097151 & 2097152) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

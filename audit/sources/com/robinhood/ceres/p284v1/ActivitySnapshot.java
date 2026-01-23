package com.robinhood.ceres.p284v1;

import com.robinhood.ceres.p284v1.ActivitySnapshot;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: ActivitySnapshot.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002>?B\u0099\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00105\u001a\u00020\u0002H\u0017J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0096\u0002J\b\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020\u0004H\u0016J\u0098\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006@"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshot;", "Lcom/squareup/wire/Message;", "", "account_id", "", "type", "Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "object_id", "ordering_id", "", "position_sellout_request_details", "Lcom/robinhood/ceres/v1/PositionSelloutRequestDetails;", "brokeback_sync_object_details", "Lcom/robinhood/ceres/v1/BrokebackSyncObjectDetails;", "order_details", "Lcom/robinhood/ceres/v1/OrderDetails;", "cash_balance_details", "Lcom/robinhood/ceres/v1/CashBalanceDetails;", "current_aggregate_position_details", "Lcom/robinhood/ceres/v1/CurrentAggregatePositionDetails;", "account_application_details", "Lcom/robinhood/ceres/v1/AccountApplicationDetails;", "execution_details", "Lcom/robinhood/ceres/v1/ExecutionDetails;", "account_details", "Lcom/robinhood/ceres/v1/AccountDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;Ljava/lang/String;JLcom/robinhood/ceres/v1/PositionSelloutRequestDetails;Lcom/robinhood/ceres/v1/BrokebackSyncObjectDetails;Lcom/robinhood/ceres/v1/OrderDetails;Lcom/robinhood/ceres/v1/CashBalanceDetails;Lcom/robinhood/ceres/v1/CurrentAggregatePositionDetails;Lcom/robinhood/ceres/v1/AccountApplicationDetails;Lcom/robinhood/ceres/v1/ExecutionDetails;Lcom/robinhood/ceres/v1/AccountDetails;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getType", "()Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "getObject_id", "getOrdering_id", "()J", "getPosition_sellout_request_details", "()Lcom/robinhood/ceres/v1/PositionSelloutRequestDetails;", "getBrokeback_sync_object_details", "()Lcom/robinhood/ceres/v1/BrokebackSyncObjectDetails;", "getOrder_details", "()Lcom/robinhood/ceres/v1/OrderDetails;", "getCash_balance_details", "()Lcom/robinhood/ceres/v1/CashBalanceDetails;", "getCurrent_aggregate_position_details", "()Lcom/robinhood/ceres/v1/CurrentAggregatePositionDetails;", "getAccount_application_details", "()Lcom/robinhood/ceres/v1/AccountApplicationDetails;", "getExecution_details", "()Lcom/robinhood/ceres/v1/ExecutionDetails;", "getAccount_details", "()Lcom/robinhood/ceres/v1/AccountDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Type", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ActivitySnapshot extends Message {

    @JvmField
    public static final ProtoAdapter<ActivitySnapshot> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.AccountApplicationDetails#ADAPTER", jsonName = "accountApplicationDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 9, tag = 21)
    private final AccountApplicationDetails account_application_details;

    @WireField(adapter = "com.robinhood.ceres.v1.AccountDetails#ADAPTER", jsonName = "accountDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 11, tag = 23)
    private final AccountDetails account_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.robinhood.ceres.v1.BrokebackSyncObjectDetails#ADAPTER", jsonName = "brokebackSyncObjectDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 5, tag = 17)
    private final BrokebackSyncObjectDetails brokeback_sync_object_details;

    @WireField(adapter = "com.robinhood.ceres.v1.CashBalanceDetails#ADAPTER", jsonName = "cashBalanceDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 7, tag = 19)
    private final CashBalanceDetails cash_balance_details;

    @WireField(adapter = "com.robinhood.ceres.v1.CurrentAggregatePositionDetails#ADAPTER", jsonName = "currentAggregatePositionDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 8, tag = 20)
    private final CurrentAggregatePositionDetails current_aggregate_position_details;

    @WireField(adapter = "com.robinhood.ceres.v1.ExecutionDetails#ADAPTER", jsonName = "executionDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 10, tag = 22)
    private final ExecutionDetails execution_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "objectId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String object_id;

    @WireField(adapter = "com.robinhood.ceres.v1.OrderDetails#ADAPTER", jsonName = "orderDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 6, tag = 18)
    private final OrderDetails order_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "orderingId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final long ordering_id;

    @WireField(adapter = "com.robinhood.ceres.v1.PositionSelloutRequestDetails#ADAPTER", jsonName = "positionSelloutRequestDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 4, tag = 16)
    private final PositionSelloutRequestDetails position_sellout_request_details;

    @WireField(adapter = "com.robinhood.ceres.v1.ActivitySnapshot$Type#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Type type;

    public ActivitySnapshot() {
        this(null, null, null, 0L, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public /* synthetic */ ActivitySnapshot(String str, Type type2, String str2, long j, PositionSelloutRequestDetails positionSelloutRequestDetails, BrokebackSyncObjectDetails brokebackSyncObjectDetails, OrderDetails orderDetails, CashBalanceDetails cashBalanceDetails, CurrentAggregatePositionDetails currentAggregatePositionDetails, AccountApplicationDetails accountApplicationDetails, ExecutionDetails executionDetails, AccountDetails accountDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Type.TYPE_UNSPECIFIED : type2, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? null : positionSelloutRequestDetails, (i & 32) != 0 ? null : brokebackSyncObjectDetails, (i & 64) != 0 ? null : orderDetails, (i & 128) != 0 ? null : cashBalanceDetails, (i & 256) != 0 ? null : currentAggregatePositionDetails, (i & 512) != 0 ? null : accountApplicationDetails, (i & 1024) != 0 ? null : executionDetails, (i & 2048) == 0 ? accountDetails : null, (i & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20246newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final Type getType() {
        return this.type;
    }

    public final String getObject_id() {
        return this.object_id;
    }

    public final long getOrdering_id() {
        return this.ordering_id;
    }

    public final PositionSelloutRequestDetails getPosition_sellout_request_details() {
        return this.position_sellout_request_details;
    }

    public final BrokebackSyncObjectDetails getBrokeback_sync_object_details() {
        return this.brokeback_sync_object_details;
    }

    public final OrderDetails getOrder_details() {
        return this.order_details;
    }

    public final CashBalanceDetails getCash_balance_details() {
        return this.cash_balance_details;
    }

    public final CurrentAggregatePositionDetails getCurrent_aggregate_position_details() {
        return this.current_aggregate_position_details;
    }

    public final AccountApplicationDetails getAccount_application_details() {
        return this.account_application_details;
    }

    public final ExecutionDetails getExecution_details() {
        return this.execution_details;
    }

    public final AccountDetails getAccount_details() {
        return this.account_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySnapshot(String account_id, Type type2, String object_id, long j, PositionSelloutRequestDetails positionSelloutRequestDetails, BrokebackSyncObjectDetails brokebackSyncObjectDetails, OrderDetails orderDetails, CashBalanceDetails cashBalanceDetails, CurrentAggregatePositionDetails currentAggregatePositionDetails, AccountApplicationDetails accountApplicationDetails, ExecutionDetails executionDetails, AccountDetails accountDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(object_id, "object_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.type = type2;
        this.object_id = object_id;
        this.ordering_id = j;
        this.position_sellout_request_details = positionSelloutRequestDetails;
        this.brokeback_sync_object_details = brokebackSyncObjectDetails;
        this.order_details = orderDetails;
        this.cash_balance_details = cashBalanceDetails;
        this.current_aggregate_position_details = currentAggregatePositionDetails;
        this.account_application_details = accountApplicationDetails;
        this.execution_details = executionDetails;
        this.account_details = accountDetails;
        if (Internal.countNonNull(positionSelloutRequestDetails, brokebackSyncObjectDetails, orderDetails, cashBalanceDetails, currentAggregatePositionDetails, accountApplicationDetails, executionDetails, accountDetails) > 1) {
            throw new IllegalArgumentException("At most one of position_sellout_request_details, brokeback_sync_object_details, order_details, cash_balance_details, current_aggregate_position_details, account_application_details, execution_details, account_details may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20246newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ActivitySnapshot)) {
            return false;
        }
        ActivitySnapshot activitySnapshot = (ActivitySnapshot) other;
        return Intrinsics.areEqual(unknownFields(), activitySnapshot.unknownFields()) && Intrinsics.areEqual(this.account_id, activitySnapshot.account_id) && this.type == activitySnapshot.type && Intrinsics.areEqual(this.object_id, activitySnapshot.object_id) && this.ordering_id == activitySnapshot.ordering_id && Intrinsics.areEqual(this.position_sellout_request_details, activitySnapshot.position_sellout_request_details) && Intrinsics.areEqual(this.brokeback_sync_object_details, activitySnapshot.brokeback_sync_object_details) && Intrinsics.areEqual(this.order_details, activitySnapshot.order_details) && Intrinsics.areEqual(this.cash_balance_details, activitySnapshot.cash_balance_details) && Intrinsics.areEqual(this.current_aggregate_position_details, activitySnapshot.current_aggregate_position_details) && Intrinsics.areEqual(this.account_application_details, activitySnapshot.account_application_details) && Intrinsics.areEqual(this.execution_details, activitySnapshot.execution_details) && Intrinsics.areEqual(this.account_details, activitySnapshot.account_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.type.hashCode()) * 37) + this.object_id.hashCode()) * 37) + Long.hashCode(this.ordering_id)) * 37;
        PositionSelloutRequestDetails positionSelloutRequestDetails = this.position_sellout_request_details;
        int iHashCode2 = (iHashCode + (positionSelloutRequestDetails != null ? positionSelloutRequestDetails.hashCode() : 0)) * 37;
        BrokebackSyncObjectDetails brokebackSyncObjectDetails = this.brokeback_sync_object_details;
        int iHashCode3 = (iHashCode2 + (brokebackSyncObjectDetails != null ? brokebackSyncObjectDetails.hashCode() : 0)) * 37;
        OrderDetails orderDetails = this.order_details;
        int iHashCode4 = (iHashCode3 + (orderDetails != null ? orderDetails.hashCode() : 0)) * 37;
        CashBalanceDetails cashBalanceDetails = this.cash_balance_details;
        int iHashCode5 = (iHashCode4 + (cashBalanceDetails != null ? cashBalanceDetails.hashCode() : 0)) * 37;
        CurrentAggregatePositionDetails currentAggregatePositionDetails = this.current_aggregate_position_details;
        int iHashCode6 = (iHashCode5 + (currentAggregatePositionDetails != null ? currentAggregatePositionDetails.hashCode() : 0)) * 37;
        AccountApplicationDetails accountApplicationDetails = this.account_application_details;
        int iHashCode7 = (iHashCode6 + (accountApplicationDetails != null ? accountApplicationDetails.hashCode() : 0)) * 37;
        ExecutionDetails executionDetails = this.execution_details;
        int iHashCode8 = (iHashCode7 + (executionDetails != null ? executionDetails.hashCode() : 0)) * 37;
        AccountDetails accountDetails = this.account_details;
        int iHashCode9 = iHashCode8 + (accountDetails != null ? accountDetails.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("type=" + this.type);
        arrayList.add("object_id=" + Internal.sanitize(this.object_id));
        arrayList.add("ordering_id=" + this.ordering_id);
        PositionSelloutRequestDetails positionSelloutRequestDetails = this.position_sellout_request_details;
        if (positionSelloutRequestDetails != null) {
            arrayList.add("position_sellout_request_details=" + positionSelloutRequestDetails);
        }
        BrokebackSyncObjectDetails brokebackSyncObjectDetails = this.brokeback_sync_object_details;
        if (brokebackSyncObjectDetails != null) {
            arrayList.add("brokeback_sync_object_details=" + brokebackSyncObjectDetails);
        }
        OrderDetails orderDetails = this.order_details;
        if (orderDetails != null) {
            arrayList.add("order_details=" + orderDetails);
        }
        CashBalanceDetails cashBalanceDetails = this.cash_balance_details;
        if (cashBalanceDetails != null) {
            arrayList.add("cash_balance_details=" + cashBalanceDetails);
        }
        CurrentAggregatePositionDetails currentAggregatePositionDetails = this.current_aggregate_position_details;
        if (currentAggregatePositionDetails != null) {
            arrayList.add("current_aggregate_position_details=" + currentAggregatePositionDetails);
        }
        AccountApplicationDetails accountApplicationDetails = this.account_application_details;
        if (accountApplicationDetails != null) {
            arrayList.add("account_application_details=" + accountApplicationDetails);
        }
        ExecutionDetails executionDetails = this.execution_details;
        if (executionDetails != null) {
            arrayList.add("execution_details=" + executionDetails);
        }
        AccountDetails accountDetails = this.account_details;
        if (accountDetails != null) {
            arrayList.add("account_details=" + accountDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySnapshot{", "}", 0, null, null, 56, null);
    }

    public final ActivitySnapshot copy(String account_id, Type type2, String object_id, long ordering_id, PositionSelloutRequestDetails position_sellout_request_details, BrokebackSyncObjectDetails brokeback_sync_object_details, OrderDetails order_details, CashBalanceDetails cash_balance_details, CurrentAggregatePositionDetails current_aggregate_position_details, AccountApplicationDetails account_application_details, ExecutionDetails execution_details, AccountDetails account_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(object_id, "object_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ActivitySnapshot(account_id, type2, object_id, ordering_id, position_sellout_request_details, brokeback_sync_object_details, order_details, cash_balance_details, current_aggregate_position_details, account_application_details, execution_details, account_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivitySnapshot.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ActivitySnapshot>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.ActivitySnapshot$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ActivitySnapshot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                if (value.getType() != ActivitySnapshot.Type.TYPE_UNSPECIFIED) {
                    size += ActivitySnapshot.Type.ADAPTER.encodedSizeWithTag(2, value.getType());
                }
                if (!Intrinsics.areEqual(value.getObject_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getObject_id());
                }
                if (value.getOrdering_id() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(4, Long.valueOf(value.getOrdering_id()));
                }
                return size + PositionSelloutRequestDetails.ADAPTER.encodedSizeWithTag(16, value.getPosition_sellout_request_details()) + BrokebackSyncObjectDetails.ADAPTER.encodedSizeWithTag(17, value.getBrokeback_sync_object_details()) + OrderDetails.ADAPTER.encodedSizeWithTag(18, value.getOrder_details()) + CashBalanceDetails.ADAPTER.encodedSizeWithTag(19, value.getCash_balance_details()) + CurrentAggregatePositionDetails.ADAPTER.encodedSizeWithTag(20, value.getCurrent_aggregate_position_details()) + AccountApplicationDetails.ADAPTER.encodedSizeWithTag(21, value.getAccount_application_details()) + ExecutionDetails.ADAPTER.encodedSizeWithTag(22, value.getExecution_details()) + AccountDetails.ADAPTER.encodedSizeWithTag(23, value.getAccount_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ActivitySnapshot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                if (value.getType() != ActivitySnapshot.Type.TYPE_UNSPECIFIED) {
                    ActivitySnapshot.Type.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getObject_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getObject_id());
                }
                if (value.getOrdering_id() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getOrdering_id()));
                }
                PositionSelloutRequestDetails.ADAPTER.encodeWithTag(writer, 16, (int) value.getPosition_sellout_request_details());
                BrokebackSyncObjectDetails.ADAPTER.encodeWithTag(writer, 17, (int) value.getBrokeback_sync_object_details());
                OrderDetails.ADAPTER.encodeWithTag(writer, 18, (int) value.getOrder_details());
                CashBalanceDetails.ADAPTER.encodeWithTag(writer, 19, (int) value.getCash_balance_details());
                CurrentAggregatePositionDetails.ADAPTER.encodeWithTag(writer, 20, (int) value.getCurrent_aggregate_position_details());
                AccountApplicationDetails.ADAPTER.encodeWithTag(writer, 21, (int) value.getAccount_application_details());
                ExecutionDetails.ADAPTER.encodeWithTag(writer, 22, (int) value.getExecution_details());
                AccountDetails.ADAPTER.encodeWithTag(writer, 23, (int) value.getAccount_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ActivitySnapshot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AccountDetails.ADAPTER.encodeWithTag(writer, 23, (int) value.getAccount_details());
                ExecutionDetails.ADAPTER.encodeWithTag(writer, 22, (int) value.getExecution_details());
                AccountApplicationDetails.ADAPTER.encodeWithTag(writer, 21, (int) value.getAccount_application_details());
                CurrentAggregatePositionDetails.ADAPTER.encodeWithTag(writer, 20, (int) value.getCurrent_aggregate_position_details());
                CashBalanceDetails.ADAPTER.encodeWithTag(writer, 19, (int) value.getCash_balance_details());
                OrderDetails.ADAPTER.encodeWithTag(writer, 18, (int) value.getOrder_details());
                BrokebackSyncObjectDetails.ADAPTER.encodeWithTag(writer, 17, (int) value.getBrokeback_sync_object_details());
                PositionSelloutRequestDetails.ADAPTER.encodeWithTag(writer, 16, (int) value.getPosition_sellout_request_details());
                if (value.getOrdering_id() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 4, (int) Long.valueOf(value.getOrdering_id()));
                }
                if (!Intrinsics.areEqual(value.getObject_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getObject_id());
                }
                if (value.getType() != ActivitySnapshot.Type.TYPE_UNSPECIFIED) {
                    ActivitySnapshot.Type.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ActivitySnapshot decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                PositionSelloutRequestDetails positionSelloutRequestDetails;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ActivitySnapshot.Type type2 = ActivitySnapshot.Type.TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                PositionSelloutRequestDetails positionSelloutRequestDetailsDecode = null;
                ActivitySnapshot.Type typeDecode = type2;
                long jLongValue = 0;
                BrokebackSyncObjectDetails brokebackSyncObjectDetailsDecode = null;
                OrderDetails orderDetailsDecode = null;
                CashBalanceDetails cashBalanceDetailsDecode = null;
                CurrentAggregatePositionDetails currentAggregatePositionDetailsDecode = null;
                AccountApplicationDetails accountApplicationDetailsDecode = null;
                ExecutionDetails executionDetailsDecode = null;
                AccountDetails accountDetailsDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ActivitySnapshot(strDecode, typeDecode, strDecode2, jLongValue, positionSelloutRequestDetailsDecode, brokebackSyncObjectDetailsDecode, orderDetailsDecode, cashBalanceDetailsDecode, currentAggregatePositionDetailsDecode, accountApplicationDetailsDecode, executionDetailsDecode, accountDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            typeDecode = ActivitySnapshot.Type.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            str = strDecode;
                            str2 = strDecode2;
                            positionSelloutRequestDetails = positionSelloutRequestDetailsDecode;
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else {
                        switch (iNextTag) {
                            case 16:
                                positionSelloutRequestDetailsDecode = PositionSelloutRequestDetails.ADAPTER.decode(reader);
                                continue;
                            case 17:
                                brokebackSyncObjectDetailsDecode = BrokebackSyncObjectDetails.ADAPTER.decode(reader);
                                continue;
                            case 18:
                                orderDetailsDecode = OrderDetails.ADAPTER.decode(reader);
                                continue;
                            case 19:
                                cashBalanceDetailsDecode = CashBalanceDetails.ADAPTER.decode(reader);
                                continue;
                            case 20:
                                currentAggregatePositionDetailsDecode = CurrentAggregatePositionDetails.ADAPTER.decode(reader);
                                continue;
                            case 21:
                                accountApplicationDetailsDecode = AccountApplicationDetails.ADAPTER.decode(reader);
                                continue;
                            case 22:
                                executionDetailsDecode = ExecutionDetails.ADAPTER.decode(reader);
                                continue;
                            case 23:
                                accountDetailsDecode = AccountDetails.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode;
                                str2 = strDecode2;
                                positionSelloutRequestDetails = positionSelloutRequestDetailsDecode;
                                break;
                        }
                        strDecode = str;
                        positionSelloutRequestDetailsDecode = positionSelloutRequestDetails;
                        strDecode2 = str2;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ActivitySnapshot redact(ActivitySnapshot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PositionSelloutRequestDetails position_sellout_request_details = value.getPosition_sellout_request_details();
                PositionSelloutRequestDetails positionSelloutRequestDetailsRedact = position_sellout_request_details != null ? PositionSelloutRequestDetails.ADAPTER.redact(position_sellout_request_details) : null;
                BrokebackSyncObjectDetails brokeback_sync_object_details = value.getBrokeback_sync_object_details();
                BrokebackSyncObjectDetails brokebackSyncObjectDetailsRedact = brokeback_sync_object_details != null ? BrokebackSyncObjectDetails.ADAPTER.redact(brokeback_sync_object_details) : null;
                OrderDetails order_details = value.getOrder_details();
                OrderDetails orderDetailsRedact = order_details != null ? OrderDetails.ADAPTER.redact(order_details) : null;
                CashBalanceDetails cash_balance_details = value.getCash_balance_details();
                CashBalanceDetails cashBalanceDetailsRedact = cash_balance_details != null ? CashBalanceDetails.ADAPTER.redact(cash_balance_details) : null;
                CurrentAggregatePositionDetails current_aggregate_position_details = value.getCurrent_aggregate_position_details();
                CurrentAggregatePositionDetails currentAggregatePositionDetailsRedact = current_aggregate_position_details != null ? CurrentAggregatePositionDetails.ADAPTER.redact(current_aggregate_position_details) : null;
                AccountApplicationDetails account_application_details = value.getAccount_application_details();
                AccountApplicationDetails accountApplicationDetailsRedact = account_application_details != null ? AccountApplicationDetails.ADAPTER.redact(account_application_details) : null;
                ExecutionDetails execution_details = value.getExecution_details();
                ExecutionDetails executionDetailsRedact = execution_details != null ? ExecutionDetails.ADAPTER.redact(execution_details) : null;
                AccountDetails account_details = value.getAccount_details();
                return value.copy((15 & 1) != 0 ? value.account_id : null, (15 & 2) != 0 ? value.type : null, (15 & 4) != 0 ? value.object_id : null, (15 & 8) != 0 ? value.ordering_id : 0L, (15 & 16) != 0 ? value.position_sellout_request_details : positionSelloutRequestDetailsRedact, (15 & 32) != 0 ? value.brokeback_sync_object_details : brokebackSyncObjectDetailsRedact, (15 & 64) != 0 ? value.order_details : orderDetailsRedact, (15 & 128) != 0 ? value.cash_balance_details : cashBalanceDetailsRedact, (15 & 256) != 0 ? value.current_aggregate_position_details : currentAggregatePositionDetailsRedact, (15 & 512) != 0 ? value.account_application_details : accountApplicationDetailsRedact, (15 & 1024) != 0 ? value.execution_details : executionDetailsRedact, (15 & 2048) != 0 ? value.account_details : account_details != null ? AccountDetails.ADAPTER.redact(account_details) : null, (15 & 4096) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActivitySnapshot.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "POSITION_SELLOUT_REQUEST_DETAILS", "BROKEBACK_SYNC_OBJECT_DETAILS", "ORDER_DETAILS", "CASH_BALANCE_DETAILS", "CURRENT_AGGREGATE_POSITION_DETAILS", "ACCOUNT_APPLICATION_DETAILS", "EXECUTION_DETAILS", "ACCOUNT_DETAILS", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ACCOUNT_APPLICATION_DETAILS;
        public static final Type ACCOUNT_DETAILS;

        @JvmField
        public static final ProtoAdapter<Type> ADAPTER;
        public static final Type BROKEBACK_SYNC_OBJECT_DETAILS;
        public static final Type CASH_BALANCE_DETAILS;
        public static final Type CURRENT_AGGREGATE_POSITION_DETAILS;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type EXECUTION_DETAILS;
        public static final Type ORDER_DETAILS;
        public static final Type POSITION_SELLOUT_REQUEST_DETAILS;
        public static final Type TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{TYPE_UNSPECIFIED, POSITION_SELLOUT_REQUEST_DETAILS, BROKEBACK_SYNC_OBJECT_DETAILS, ORDER_DETAILS, CASH_BALANCE_DETAILS, CURRENT_AGGREGATE_POSITION_DETAILS, ACCOUNT_APPLICATION_DETAILS, EXECUTION_DETAILS, ACCOUNT_DETAILS};
        }

        @JvmStatic
        public static final Type fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Type type2 = new Type("TYPE_UNSPECIFIED", 0, 0);
            TYPE_UNSPECIFIED = type2;
            POSITION_SELLOUT_REQUEST_DETAILS = new Type("POSITION_SELLOUT_REQUEST_DETAILS", 1, 1);
            BROKEBACK_SYNC_OBJECT_DETAILS = new Type("BROKEBACK_SYNC_OBJECT_DETAILS", 2, 2);
            ORDER_DETAILS = new Type("ORDER_DETAILS", 3, 3);
            CASH_BALANCE_DETAILS = new Type("CASH_BALANCE_DETAILS", 4, 4);
            CURRENT_AGGREGATE_POSITION_DETAILS = new Type("CURRENT_AGGREGATE_POSITION_DETAILS", 5, 5);
            ACCOUNT_APPLICATION_DETAILS = new Type("ACCOUNT_APPLICATION_DETAILS", 6, 6);
            EXECUTION_DETAILS = new Type("EXECUTION_DETAILS", 7, 7);
            ACCOUNT_DETAILS = new Type("ACCOUNT_DETAILS", 8, 8);
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: com.robinhood.ceres.v1.ActivitySnapshot$Type$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ActivitySnapshot.Type fromValue(int value) {
                    return ActivitySnapshot.Type.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ActivitySnapshot.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ActivitySnapshot$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/ActivitySnapshot$Type;", "fromValue", "value", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Type fromValue(int value) {
                switch (value) {
                    case 0:
                        return Type.TYPE_UNSPECIFIED;
                    case 1:
                        return Type.POSITION_SELLOUT_REQUEST_DETAILS;
                    case 2:
                        return Type.BROKEBACK_SYNC_OBJECT_DETAILS;
                    case 3:
                        return Type.ORDER_DETAILS;
                    case 4:
                        return Type.CASH_BALANCE_DETAILS;
                    case 5:
                        return Type.CURRENT_AGGREGATE_POSITION_DETAILS;
                    case 6:
                        return Type.ACCOUNT_APPLICATION_DETAILS;
                    case 7:
                        return Type.EXECUTION_DETAILS;
                    case 8:
                        return Type.ACCOUNT_DETAILS;
                    default:
                        return null;
                }
            }
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}

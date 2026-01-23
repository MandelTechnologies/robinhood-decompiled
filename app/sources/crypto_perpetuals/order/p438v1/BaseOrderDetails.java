package crypto_perpetuals.order.p438v1;

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
import crypto_perpetuals.common.p435v1.MarginMode;
import crypto_perpetuals.common.p435v1.Side;
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

/* compiled from: BaseOrderDetails.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b'\u0018\u0000 O2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001OBí\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0017¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010-Jó\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00172\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010-R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010-R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u00108R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b9\u0010-R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\bC\u0010-R\u001a\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\bD\u0010-R\u001a\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\bE\u0010-R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\bF\u0010-R\u001a\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\bG\u0010-R\"\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010H\u001a\u0004\bI\u0010JR\"\u0010\u0019\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010H\u001a\u0004\bK\u0010JR\u001a\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010L\u001a\u0004\b\u001b\u0010MR\u001a\u0010\u001c\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010L\u001a\u0004\b\u001c\u0010MR\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010L\u001a\u0004\b\u001d\u0010MR\"\u0010\u001e\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010H\u001a\u0004\bN\u0010J¨\u0006P"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/BaseOrderDetails;", "Lcom/squareup/wire/Message;", "", "", "order_id", "Lcrypto_perpetuals/order/v1/OrderStatus;", ComboOrderDetailTopbarComposable5.ORDER_STATUS, "leverage", "Lcrypto_perpetuals/common/v1/MarginMode;", "margin_mode", "contract_id", "Lcrypto_perpetuals/order/v1/OrderFees;", "estimated_fees", "Lcrypto_perpetuals/common/v1/Side;", "order_side", "Lcrypto_perpetuals/order/v1/OrderPrice;", "estimated_order_price", "estimated_total_contract_quantity", "estimated_total_notional_amount", "executed_notional", "average_executed_price", "executed_quantity", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "", "is_liquidation_order", "is_close_position_order", "is_cancelable", "last_transaction_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lcrypto_perpetuals/order/v1/OrderStatus;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MarginMode;Ljava/lang/String;Lcrypto_perpetuals/order/v1/OrderFees;Lcrypto_perpetuals/common/v1/Side;Lcrypto_perpetuals/order/v1/OrderPrice;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;ZZZLj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lcrypto_perpetuals/order/v1/OrderStatus;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MarginMode;Ljava/lang/String;Lcrypto_perpetuals/order/v1/OrderFees;Lcrypto_perpetuals/common/v1/Side;Lcrypto_perpetuals/order/v1/OrderPrice;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;ZZZLj$/time/Instant;Lokio/ByteString;)Lcrypto_perpetuals/order/v1/BaseOrderDetails;", "Ljava/lang/String;", "getOrder_id", "Lcrypto_perpetuals/order/v1/OrderStatus;", "getOrder_status", "()Lcrypto_perpetuals/order/v1/OrderStatus;", "getLeverage", "Lcrypto_perpetuals/common/v1/MarginMode;", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginMode;", "getContract_id", "Lcrypto_perpetuals/order/v1/OrderFees;", "getEstimated_fees", "()Lcrypto_perpetuals/order/v1/OrderFees;", "Lcrypto_perpetuals/common/v1/Side;", "getOrder_side", "()Lcrypto_perpetuals/common/v1/Side;", "Lcrypto_perpetuals/order/v1/OrderPrice;", "getEstimated_order_price", "()Lcrypto_perpetuals/order/v1/OrderPrice;", "getEstimated_total_contract_quantity", "getEstimated_total_notional_amount", "getExecuted_notional", "getAverage_executed_price", "getExecuted_quantity", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "Z", "()Z", "getLast_transaction_at", "Companion", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class BaseOrderDetails extends Message {

    @JvmField
    public static final ProtoAdapter<BaseOrderDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "averageExecutedPrice", schemaIndex = 11, tag = 12)
    private final String average_executed_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final Instant created_at;

    @WireField(adapter = "crypto_perpetuals.order.v1.OrderFees#ADAPTER", jsonName = "estimatedFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final OrderFees estimated_fees;

    @WireField(adapter = "crypto_perpetuals.order.v1.OrderPrice#ADAPTER", jsonName = "estimatedOrderPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final OrderPrice estimated_order_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedTotalContractQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String estimated_total_contract_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedTotalNotionalAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String estimated_total_notional_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "executedNotional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String executed_notional;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "executedQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String executed_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isCancelable", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final boolean is_cancelable;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isClosePositionOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final boolean is_close_position_order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isLiquidationOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final boolean is_liquidation_order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lastTransactionAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final Instant last_transaction_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String leverage;

    @WireField(adapter = "crypto_perpetuals.common.v1.MarginMode#ADAPTER", jsonName = "marginMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final MarginMode margin_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_id;

    @WireField(adapter = "crypto_perpetuals.common.v1.Side#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Side order_side;

    @WireField(adapter = "crypto_perpetuals.order.v1.OrderStatus#ADAPTER", jsonName = "orderStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OrderStatus order_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final Instant updated_at;

    public BaseOrderDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, 1048575, null);
    }

    public /* synthetic */ BaseOrderDetails(String str, OrderStatus orderStatus, String str2, MarginMode marginMode, String str3, OrderFees orderFees, Side side, OrderPrice orderPrice, String str4, String str5, String str6, String str7, String str8, Instant instant, Instant instant2, boolean z, boolean z2, boolean z3, Instant instant3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OrderStatus.ORDER_STATUS_UNSPECIFIED : orderStatus, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? MarginMode.MARGIN_MODE_UNSPECIFIED : marginMode, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : orderFees, (i & 64) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 128) != 0 ? null : orderPrice, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? null : str7, (i & 4096) == 0 ? str8 : "", (i & 8192) != 0 ? null : instant, (i & 16384) != 0 ? null : instant2, (i & 32768) != 0 ? false : z, (i & 65536) != 0 ? false : z2, (i & 131072) == 0 ? z3 : false, (i & 262144) != 0 ? null : instant3, (i & 524288) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27833newBuilder();
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final OrderStatus getOrder_status() {
        return this.order_status;
    }

    public final String getLeverage() {
        return this.leverage;
    }

    public final MarginMode getMargin_mode() {
        return this.margin_mode;
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final OrderFees getEstimated_fees() {
        return this.estimated_fees;
    }

    public final Side getOrder_side() {
        return this.order_side;
    }

    public final OrderPrice getEstimated_order_price() {
        return this.estimated_order_price;
    }

    public final String getEstimated_total_contract_quantity() {
        return this.estimated_total_contract_quantity;
    }

    public final String getEstimated_total_notional_amount() {
        return this.estimated_total_notional_amount;
    }

    public final String getExecuted_notional() {
        return this.executed_notional;
    }

    public final String getAverage_executed_price() {
        return this.average_executed_price;
    }

    public final String getExecuted_quantity() {
        return this.executed_quantity;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    /* renamed from: is_liquidation_order, reason: from getter */
    public final boolean getIs_liquidation_order() {
        return this.is_liquidation_order;
    }

    /* renamed from: is_close_position_order, reason: from getter */
    public final boolean getIs_close_position_order() {
        return this.is_close_position_order;
    }

    /* renamed from: is_cancelable, reason: from getter */
    public final boolean getIs_cancelable() {
        return this.is_cancelable;
    }

    public final Instant getLast_transaction_at() {
        return this.last_transaction_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOrderDetails(String order_id, OrderStatus order_status, String leverage, MarginMode margin_mode, String contract_id, OrderFees orderFees, Side order_side, OrderPrice orderPrice, String estimated_total_contract_quantity, String estimated_total_notional_amount, String executed_notional, String str, String executed_quantity, Instant instant, Instant instant2, boolean z, boolean z2, boolean z3, Instant instant3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_status, "order_status");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(estimated_total_contract_quantity, "estimated_total_contract_quantity");
        Intrinsics.checkNotNullParameter(estimated_total_notional_amount, "estimated_total_notional_amount");
        Intrinsics.checkNotNullParameter(executed_notional, "executed_notional");
        Intrinsics.checkNotNullParameter(executed_quantity, "executed_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.order_status = order_status;
        this.leverage = leverage;
        this.margin_mode = margin_mode;
        this.contract_id = contract_id;
        this.estimated_fees = orderFees;
        this.order_side = order_side;
        this.estimated_order_price = orderPrice;
        this.estimated_total_contract_quantity = estimated_total_contract_quantity;
        this.estimated_total_notional_amount = estimated_total_notional_amount;
        this.executed_notional = executed_notional;
        this.average_executed_price = str;
        this.executed_quantity = executed_quantity;
        this.created_at = instant;
        this.updated_at = instant2;
        this.is_liquidation_order = z;
        this.is_close_position_order = z2;
        this.is_cancelable = z3;
        this.last_transaction_at = instant3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27833newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BaseOrderDetails)) {
            return false;
        }
        BaseOrderDetails baseOrderDetails = (BaseOrderDetails) other;
        return Intrinsics.areEqual(unknownFields(), baseOrderDetails.unknownFields()) && Intrinsics.areEqual(this.order_id, baseOrderDetails.order_id) && this.order_status == baseOrderDetails.order_status && Intrinsics.areEqual(this.leverage, baseOrderDetails.leverage) && this.margin_mode == baseOrderDetails.margin_mode && Intrinsics.areEqual(this.contract_id, baseOrderDetails.contract_id) && Intrinsics.areEqual(this.estimated_fees, baseOrderDetails.estimated_fees) && this.order_side == baseOrderDetails.order_side && Intrinsics.areEqual(this.estimated_order_price, baseOrderDetails.estimated_order_price) && Intrinsics.areEqual(this.estimated_total_contract_quantity, baseOrderDetails.estimated_total_contract_quantity) && Intrinsics.areEqual(this.estimated_total_notional_amount, baseOrderDetails.estimated_total_notional_amount) && Intrinsics.areEqual(this.executed_notional, baseOrderDetails.executed_notional) && Intrinsics.areEqual(this.average_executed_price, baseOrderDetails.average_executed_price) && Intrinsics.areEqual(this.executed_quantity, baseOrderDetails.executed_quantity) && Intrinsics.areEqual(this.created_at, baseOrderDetails.created_at) && Intrinsics.areEqual(this.updated_at, baseOrderDetails.updated_at) && this.is_liquidation_order == baseOrderDetails.is_liquidation_order && this.is_close_position_order == baseOrderDetails.is_close_position_order && this.is_cancelable == baseOrderDetails.is_cancelable && Intrinsics.areEqual(this.last_transaction_at, baseOrderDetails.last_transaction_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.order_id.hashCode()) * 37) + this.order_status.hashCode()) * 37) + this.leverage.hashCode()) * 37) + this.margin_mode.hashCode()) * 37) + this.contract_id.hashCode()) * 37;
        OrderFees orderFees = this.estimated_fees;
        int iHashCode2 = (((iHashCode + (orderFees != null ? orderFees.hashCode() : 0)) * 37) + this.order_side.hashCode()) * 37;
        OrderPrice orderPrice = this.estimated_order_price;
        int iHashCode3 = (((((((iHashCode2 + (orderPrice != null ? orderPrice.hashCode() : 0)) * 37) + this.estimated_total_contract_quantity.hashCode()) * 37) + this.estimated_total_notional_amount.hashCode()) * 37) + this.executed_notional.hashCode()) * 37;
        String str = this.average_executed_price;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 37) + this.executed_quantity.hashCode()) * 37;
        Instant instant = this.created_at;
        int iHashCode5 = (iHashCode4 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updated_at;
        int iHashCode6 = (((((((iHashCode5 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_liquidation_order)) * 37) + Boolean.hashCode(this.is_close_position_order)) * 37) + Boolean.hashCode(this.is_cancelable)) * 37;
        Instant instant3 = this.last_transaction_at;
        int iHashCode7 = iHashCode6 + (instant3 != null ? instant3.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("order_status=" + this.order_status);
        arrayList.add("leverage=" + Internal.sanitize(this.leverage));
        arrayList.add("margin_mode=" + this.margin_mode);
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        OrderFees orderFees = this.estimated_fees;
        if (orderFees != null) {
            arrayList.add("estimated_fees=" + orderFees);
        }
        arrayList.add("order_side=" + this.order_side);
        OrderPrice orderPrice = this.estimated_order_price;
        if (orderPrice != null) {
            arrayList.add("estimated_order_price=" + orderPrice);
        }
        arrayList.add("estimated_total_contract_quantity=" + Internal.sanitize(this.estimated_total_contract_quantity));
        arrayList.add("estimated_total_notional_amount=" + Internal.sanitize(this.estimated_total_notional_amount));
        arrayList.add("executed_notional=" + Internal.sanitize(this.executed_notional));
        String str = this.average_executed_price;
        if (str != null) {
            arrayList.add("average_executed_price=" + Internal.sanitize(str));
        }
        arrayList.add("executed_quantity=" + Internal.sanitize(this.executed_quantity));
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            arrayList.add("updated_at=" + instant2);
        }
        arrayList.add("is_liquidation_order=" + this.is_liquidation_order);
        arrayList.add("is_close_position_order=" + this.is_close_position_order);
        arrayList.add("is_cancelable=" + this.is_cancelable);
        Instant instant3 = this.last_transaction_at;
        if (instant3 != null) {
            arrayList.add("last_transaction_at=" + instant3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BaseOrderDetails{", "}", 0, null, null, 56, null);
    }

    public final BaseOrderDetails copy(String order_id, OrderStatus order_status, String leverage, MarginMode margin_mode, String contract_id, OrderFees estimated_fees, Side order_side, OrderPrice estimated_order_price, String estimated_total_contract_quantity, String estimated_total_notional_amount, String executed_notional, String average_executed_price, String executed_quantity, Instant created_at, Instant updated_at, boolean is_liquidation_order, boolean is_close_position_order, boolean is_cancelable, Instant last_transaction_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_status, "order_status");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(estimated_total_contract_quantity, "estimated_total_contract_quantity");
        Intrinsics.checkNotNullParameter(estimated_total_notional_amount, "estimated_total_notional_amount");
        Intrinsics.checkNotNullParameter(executed_notional, "executed_notional");
        Intrinsics.checkNotNullParameter(executed_quantity, "executed_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BaseOrderDetails(order_id, order_status, leverage, margin_mode, contract_id, estimated_fees, order_side, estimated_order_price, estimated_total_contract_quantity, estimated_total_notional_amount, executed_notional, average_executed_price, executed_quantity, created_at, updated_at, is_liquidation_order, is_close_position_order, is_cancelable, last_transaction_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BaseOrderDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BaseOrderDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.order.v1.BaseOrderDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BaseOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (value.getOrder_status() != OrderStatus.ORDER_STATUS_UNSPECIFIED) {
                    size += OrderStatus.ADAPTER.encodedSizeWithTag(2, value.getOrder_status());
                }
                if (!Intrinsics.areEqual(value.getLeverage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLeverage());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    size += MarginMode.ADAPTER.encodedSizeWithTag(4, value.getMargin_mode());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getContract_id());
                }
                if (value.getEstimated_fees() != null) {
                    size += OrderFees.ADAPTER.encodedSizeWithTag(6, value.getEstimated_fees());
                }
                if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(7, value.getOrder_side());
                }
                if (value.getEstimated_order_price() != null) {
                    size += OrderPrice.ADAPTER.encodedSizeWithTag(8, value.getEstimated_order_price());
                }
                if (!Intrinsics.areEqual(value.getEstimated_total_contract_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getEstimated_total_contract_quantity());
                }
                if (!Intrinsics.areEqual(value.getEstimated_total_notional_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getEstimated_total_notional_amount());
                }
                if (!Intrinsics.areEqual(value.getExecuted_notional(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getExecuted_notional());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(12, value.getAverage_executed_price());
                if (!Intrinsics.areEqual(value.getExecuted_quantity(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(13, value.getExecuted_quantity());
                }
                if (value.getCreated_at() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(14, value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(15, value.getUpdated_at());
                }
                if (value.getIs_liquidation_order()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(16, Boolean.valueOf(value.getIs_liquidation_order()));
                }
                if (value.getIs_close_position_order()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(17, Boolean.valueOf(value.getIs_close_position_order()));
                }
                if (value.getIs_cancelable()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(18, Boolean.valueOf(value.getIs_cancelable()));
                }
                return value.getLast_transaction_at() != null ? iEncodedSizeWithTag + ProtoAdapter.INSTANT.encodedSizeWithTag(19, value.getLast_transaction_at()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BaseOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (value.getOrder_status() != OrderStatus.ORDER_STATUS_UNSPECIFIED) {
                    OrderStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_status());
                }
                if (!Intrinsics.areEqual(value.getLeverage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLeverage());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 4, (int) value.getMargin_mode());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getContract_id());
                }
                if (value.getEstimated_fees() != null) {
                    OrderFees.ADAPTER.encodeWithTag(writer, 6, (int) value.getEstimated_fees());
                }
                if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 7, (int) value.getOrder_side());
                }
                if (value.getEstimated_order_price() != null) {
                    OrderPrice.ADAPTER.encodeWithTag(writer, 8, (int) value.getEstimated_order_price());
                }
                if (!Intrinsics.areEqual(value.getEstimated_total_contract_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getEstimated_total_contract_quantity());
                }
                if (!Intrinsics.areEqual(value.getEstimated_total_notional_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getEstimated_total_notional_amount());
                }
                if (!Intrinsics.areEqual(value.getExecuted_notional(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getExecuted_notional());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 12, (int) value.getAverage_executed_price());
                if (!Intrinsics.areEqual(value.getExecuted_quantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 13, (int) value.getExecuted_quantity());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 14, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 15, (int) value.getUpdated_at());
                }
                if (value.getIs_liquidation_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 16, (int) Boolean.valueOf(value.getIs_liquidation_order()));
                }
                if (value.getIs_close_position_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 17, (int) Boolean.valueOf(value.getIs_close_position_order()));
                }
                if (value.getIs_cancelable()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 18, (int) Boolean.valueOf(value.getIs_cancelable()));
                }
                if (value.getLast_transaction_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 19, (int) value.getLast_transaction_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BaseOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLast_transaction_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 19, (int) value.getLast_transaction_at());
                }
                if (value.getIs_cancelable()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 18, (int) Boolean.valueOf(value.getIs_cancelable()));
                }
                if (value.getIs_close_position_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 17, (int) Boolean.valueOf(value.getIs_close_position_order()));
                }
                if (value.getIs_liquidation_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 16, (int) Boolean.valueOf(value.getIs_liquidation_order()));
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 15, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 14, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getExecuted_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getExecuted_quantity());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 12, (int) value.getAverage_executed_price());
                if (!Intrinsics.areEqual(value.getExecuted_notional(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getExecuted_notional());
                }
                if (!Intrinsics.areEqual(value.getEstimated_total_notional_amount(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getEstimated_total_notional_amount());
                }
                if (!Intrinsics.areEqual(value.getEstimated_total_contract_quantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getEstimated_total_contract_quantity());
                }
                if (value.getEstimated_order_price() != null) {
                    OrderPrice.ADAPTER.encodeWithTag(writer, 8, (int) value.getEstimated_order_price());
                }
                if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 7, (int) value.getOrder_side());
                }
                if (value.getEstimated_fees() != null) {
                    OrderFees.ADAPTER.encodeWithTag(writer, 6, (int) value.getEstimated_fees());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getContract_id());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 4, (int) value.getMargin_mode());
                }
                if (!Intrinsics.areEqual(value.getLeverage(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getLeverage());
                }
                if (value.getOrder_status() != OrderStatus.ORDER_STATUS_UNSPECIFIED) {
                    OrderStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_status());
                }
                if (Intrinsics.areEqual(value.getOrder_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getOrder_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BaseOrderDetails decode(ProtoReader reader) throws IOException {
                MarginMode marginMode;
                Side side;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                OrderStatus orderStatus = OrderStatus.ORDER_STATUS_UNSPECIFIED;
                MarginMode marginMode2 = MarginMode.MARGIN_MODE_UNSPECIFIED;
                Side side2 = Side.SIDE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                OrderStatus orderStatusDecode = orderStatus;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                OrderFees orderFeesDecode = null;
                OrderPrice orderPriceDecode = null;
                String strDecode6 = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Instant instantDecode3 = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                Side sideDecode = side2;
                String strDecode7 = strDecode5;
                String strDecode8 = strDecode7;
                MarginMode marginModeDecode = marginMode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                marginMode = marginModeDecode;
                                side = sideDecode;
                                str = strDecode7;
                                try {
                                    orderStatusDecode = OrderStatus.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                marginModeDecode = marginMode;
                                strDecode7 = str;
                                sideDecode = side;
                                break;
                            case 3:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                marginMode = marginModeDecode;
                                side = sideDecode;
                                str = strDecode7;
                                try {
                                    marginModeDecode = MarginMode.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                strDecode7 = str;
                                sideDecode = side;
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                orderFeesDecode = OrderFees.ADAPTER.decode(reader);
                                break;
                            case 7:
                                try {
                                    sideDecode = Side.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    marginMode = marginModeDecode;
                                    side = sideDecode;
                                    str = strDecode7;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 8:
                                orderPriceDecode = OrderPrice.ADAPTER.decode(reader);
                                break;
                            case 9:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 15:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 16:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 17:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 18:
                                zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 19:
                                instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                marginMode = marginModeDecode;
                                side = sideDecode;
                                str = strDecode7;
                                marginModeDecode = marginMode;
                                strDecode7 = str;
                                sideDecode = side;
                                break;
                        }
                    } else {
                        return new BaseOrderDetails(strDecode7, orderStatusDecode, strDecode8, marginModeDecode, strDecode, orderFeesDecode, sideDecode, orderPriceDecode, strDecode2, strDecode3, strDecode4, strDecode6, strDecode5, instantDecode, instantDecode2, zBooleanValue, zBooleanValue2, zBooleanValue3, instantDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BaseOrderDetails redact(BaseOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                OrderFees estimated_fees = value.getEstimated_fees();
                OrderFees orderFeesRedact = estimated_fees != null ? OrderFees.ADAPTER.redact(estimated_fees) : null;
                OrderPrice estimated_order_price = value.getEstimated_order_price();
                OrderPrice orderPriceRedact = estimated_order_price != null ? OrderPrice.ADAPTER.redact(estimated_order_price) : null;
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant updated_at = value.getUpdated_at();
                Instant instantRedact2 = updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null;
                Instant last_transaction_at = value.getLast_transaction_at();
                return value.copy((237407 & 1) != 0 ? value.order_id : null, (237407 & 2) != 0 ? value.order_status : null, (237407 & 4) != 0 ? value.leverage : null, (237407 & 8) != 0 ? value.margin_mode : null, (237407 & 16) != 0 ? value.contract_id : null, (237407 & 32) != 0 ? value.estimated_fees : orderFeesRedact, (237407 & 64) != 0 ? value.order_side : null, (237407 & 128) != 0 ? value.estimated_order_price : orderPriceRedact, (237407 & 256) != 0 ? value.estimated_total_contract_quantity : null, (237407 & 512) != 0 ? value.estimated_total_notional_amount : null, (237407 & 1024) != 0 ? value.executed_notional : null, (237407 & 2048) != 0 ? value.average_executed_price : null, (237407 & 4096) != 0 ? value.executed_quantity : null, (237407 & 8192) != 0 ? value.created_at : instantRedact, (237407 & 16384) != 0 ? value.updated_at : instantRedact2, (237407 & 32768) != 0 ? value.is_liquidation_order : false, (237407 & 65536) != 0 ? value.is_close_position_order : false, (237407 & 131072) != 0 ? value.is_cancelable : false, (237407 & 262144) != 0 ? value.last_transaction_at : last_transaction_at != null ? ProtoAdapter.INSTANT.redact(last_transaction_at) : null, (237407 & 524288) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

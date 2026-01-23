package com.robinhood.ceres.p284v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.common.Money;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
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
import rosetta.mainst.OrderTrigger;
import rosetta.mainst.OrderType;
import rosetta.mainst.TimeInForce;

/* compiled from: FuturesOrder.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bM\u0018\u0000 \u0094\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0094\u0001Bñ\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0006\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00107\u001a\u00020\u0015\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\"\u0012\u0010\b\u0002\u0010<\u001a\n\u0018\u00010:j\u0004\u0018\u0001`;\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0002H\u0017¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u00020\u001c2\b\u0010E\u001a\u0004\u0018\u00010DH\u0096\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0003H\u0016¢\u0006\u0004\bK\u0010LJ÷\u0003\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\b\b\u0002\u00107\u001a\u00020\u00152\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\"2\u0010\b\u0002\u0010<\u001a\n\u0018\u00010:j\u0004\u0018\u0001`;2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010?\u001a\u00020>¢\u0006\u0004\bM\u0010NR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010O\u001a\u0004\bP\u0010LR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010O\u001a\u0004\bQ\u0010LR\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010O\u001a\u0004\bR\u0010LR\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\bS\u0010LR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010O\u001a\u0004\bT\u0010LR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010[\u001a\u0004\b\\\u0010]R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\b^\u0010LR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\b_\u0010LR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\b`\u0010LR\u001a\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010O\u001a\u0004\bd\u0010LR\u001a\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010O\u001a\u0004\be\u0010LR\u001a\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010O\u001a\u0004\bf\u0010LR\u001a\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010O\u001a\u0004\bj\u0010LR\u001a\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010O\u001a\u0004\bk\u0010LR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010l\u001a\u0004\bm\u0010nR\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010o\u001a\u0004\bp\u0010qR\u001c\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010r\u001a\u0004\bs\u0010tR\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010u\u001a\u0004\bv\u0010wR\u001c\u0010*\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010o\u001a\u0004\bx\u0010qR\u001c\u0010+\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010o\u001a\u0004\by\u0010qR\u001c\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010O\u001a\u0004\bz\u0010LR\u001c\u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010O\u001a\u0004\b{\u0010LR\u001c\u0010.\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010|\u001a\u0004\b.\u0010}R\u001d\u00100\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b0\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001d\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0004\b1\u0010O\u001a\u0005\b\u0081\u0001\u0010LR\u001d\u00102\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0004\b2\u0010O\u001a\u0005\b\u0082\u0001\u0010LR\u001d\u00103\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0004\b3\u0010O\u001a\u0005\b\u0083\u0001\u0010LR\u001d\u00104\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0004\b4\u0010O\u001a\u0005\b\u0084\u0001\u0010LR\u001f\u00106\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b6\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001b\u00107\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\r\n\u0004\b7\u0010a\u001a\u0005\b\u0088\u0001\u0010cR\u001d\u00108\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0004\b8\u0010O\u001a\u0005\b\u0089\u0001\u0010LR\u001d\u00109\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b9\u0010o\u001a\u0005\b\u008a\u0001\u0010qR%\u0010<\u001a\n\u0018\u00010:j\u0004\u0018\u0001`;8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b<\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001d\u0010=\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0004\b=\u0010O\u001a\u0005\b\u008e\u0001\u0010LR#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\b\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00068\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u001b\u0010\u008f\u0001\u001a\u0006\b\u0092\u0001\u0010\u0091\u0001R#\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00068\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b%\u0010\u008f\u0001\u001a\u0006\b\u0093\u0001\u0010\u0091\u0001¨\u0006\u0095\u0001"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrder;", "Lcom/squareup/wire/Message;", "", "", "order_id", "account_id", "", "Lcom/robinhood/ceres/v1/FuturesOrderLeg;", "order_legs", "quantity", "filled_quantity", "max_show", "Lrosetta/mainst/OrderType;", "order_type", "Lrosetta/mainst/OrderTrigger;", "order_trigger", "Lrosetta/mainst/TimeInForce;", "time_in_force", "limit_price", "stop_price", "average_price", "Lrosetta/mainst/OrderState;", "order_state", "ref_id", "created_at", "updated_at", "Lcom/robinhood/ceres/v1/FuturesOrderExecution;", "order_executions", "", "route_to_mainst", "employee_alias", "account_number", "Lcom/robinhood/ceres/v1/OrderEnteredReason;", "entered_reason", "Lcom/robinhood/rosetta/common/Money;", "total_fee", "Lcom/robinhood/ceres/v1/FuturesOrderFee;", "fees", "Lcom/robinhood/ceres/v1/OrderCancelReason;", "cancel_reason", "Lcom/robinhood/ceres/v1/OrderRejectReason;", "reject_reason", "total_commission", "total_gold_savings", "failed_receipt_override_title", "failed_receipt_override_detail_markdown", "is_auto_send_enabled", "Lcom/robinhood/ceres/v1/PositionEffect;", "position_effect_at_placement_time", "rhs_account_number", "symbol", "device_platform", "device_id", "Lcom/robinhood/ceres/v1/RealizedPnlForOrder;", "realized_pnl", "derived_state", "opp_side", "entered_notional_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "gtd_expiration_time", "quote_id", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderType;Lrosetta/mainst/OrderTrigger;Lrosetta/mainst/TimeInForce;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderEnteredReason;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Lcom/robinhood/ceres/v1/OrderCancelReason;Lcom/robinhood/ceres/v1/OrderRejectReason;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/PositionEffect;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/RealizedPnlForOrder;Lrosetta/mainst/OrderState;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderType;Lrosetta/mainst/OrderTrigger;Lrosetta/mainst/TimeInForce;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderEnteredReason;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Lcom/robinhood/ceres/v1/OrderCancelReason;Lcom/robinhood/ceres/v1/OrderRejectReason;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/PositionEffect;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/RealizedPnlForOrder;Lrosetta/mainst/OrderState;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lj$/time/Instant;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/ceres/v1/FuturesOrder;", "Ljava/lang/String;", "getOrder_id", "getAccount_id", "getQuantity", "getFilled_quantity", "getMax_show", "Lrosetta/mainst/OrderType;", "getOrder_type", "()Lrosetta/mainst/OrderType;", "Lrosetta/mainst/OrderTrigger;", "getOrder_trigger", "()Lrosetta/mainst/OrderTrigger;", "Lrosetta/mainst/TimeInForce;", "getTime_in_force", "()Lrosetta/mainst/TimeInForce;", "getLimit_price", "getStop_price", "getAverage_price", "Lrosetta/mainst/OrderState;", "getOrder_state", "()Lrosetta/mainst/OrderState;", "getRef_id", "getCreated_at", "getUpdated_at", "Z", "getRoute_to_mainst", "()Z", "getEmployee_alias", "getAccount_number", "Lcom/robinhood/ceres/v1/OrderEnteredReason;", "getEntered_reason", "()Lcom/robinhood/ceres/v1/OrderEnteredReason;", "Lcom/robinhood/rosetta/common/Money;", "getTotal_fee", "()Lcom/robinhood/rosetta/common/Money;", "Lcom/robinhood/ceres/v1/OrderCancelReason;", "getCancel_reason", "()Lcom/robinhood/ceres/v1/OrderCancelReason;", "Lcom/robinhood/ceres/v1/OrderRejectReason;", "getReject_reason", "()Lcom/robinhood/ceres/v1/OrderRejectReason;", "getTotal_commission", "getTotal_gold_savings", "getFailed_receipt_override_title", "getFailed_receipt_override_detail_markdown", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lcom/robinhood/ceres/v1/PositionEffect;", "getPosition_effect_at_placement_time", "()Lcom/robinhood/ceres/v1/PositionEffect;", "getRhs_account_number", "getSymbol", "getDevice_platform", "getDevice_id", "Lcom/robinhood/ceres/v1/RealizedPnlForOrder;", "getRealized_pnl", "()Lcom/robinhood/ceres/v1/RealizedPnlForOrder;", "getDerived_state", "getOpp_side", "getEntered_notional_amount", "Lj$/time/Instant;", "getGtd_expiration_time", "()Lj$/time/Instant;", "getQuote_id", "Ljava/util/List;", "getOrder_legs", "()Ljava/util/List;", "getOrder_executions", "getFees", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FuturesOrder extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesOrder> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "averagePrice", schemaIndex = 11, tag = 12)
    private final String average_price;

    @WireField(adapter = "com.robinhood.ceres.v1.OrderCancelReason#ADAPTER", jsonName = "cancelReason", schemaIndex = 23, tag = 24)
    private final OrderCancelReason cancel_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final String created_at;

    @WireField(adapter = "rosetta.mainst.OrderState#ADAPTER", jsonName = "derivedState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 36, tag = 37)
    private final OrderState derived_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, schemaIndex = 34, tag = 35)
    private final String device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "devicePlatform", schemaIndex = 33, tag = 34)
    private final String device_platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "employeeAlias", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final String employee_alias;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "enteredNotionalAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 38, tag = 39)
    private final Money entered_notional_amount;

    @WireField(adapter = "com.robinhood.ceres.v1.OrderEnteredReason#ADAPTER", jsonName = "enteredReason", schemaIndex = 20, tag = 21)
    private final OrderEnteredReason entered_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 28, tag = 29)
    private final String failed_receipt_override_detail_markdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 27, tag = 28)
    private final String failed_receipt_override_title;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesOrderFee#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 22, tag = 23)
    private final List<FuturesOrderFee> fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "filledQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String filled_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "gtdExpirationTime", schemaIndex = 39, tag = 40)
    private final Instant gtd_expiration_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isAutoSendEnabled", schemaIndex = 29, tag = 30)
    private final Boolean is_auto_send_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitPrice", schemaIndex = 9, tag = 10)
    private final String limit_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxShow", schemaIndex = 5, tag = 6)
    private final String max_show;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "oppSide", schemaIndex = 37, tag = 38)
    private final String opp_side;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesOrderExecution#ADAPTER", jsonName = "orderExecutions", label = WireField.Label.REPEATED, schemaIndex = 16, tag = 17)
    private final List<FuturesOrderExecution> order_executions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_id;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesOrderLeg#ADAPTER", jsonName = "orderLegs", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<FuturesOrderLeg> order_legs;

    @WireField(adapter = "rosetta.mainst.OrderState#ADAPTER", jsonName = "orderState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final OrderState order_state;

    @WireField(adapter = "rosetta.mainst.OrderTrigger#ADAPTER", jsonName = "orderTrigger", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final OrderTrigger order_trigger;

    @WireField(adapter = "rosetta.mainst.OrderType#ADAPTER", jsonName = "orderType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final OrderType order_type;

    @WireField(adapter = "com.robinhood.ceres.v1.PositionEffect#ADAPTER", jsonName = "positionEffectAtPlacementTime", schemaIndex = 30, tag = 31)
    private final PositionEffect position_effect_at_placement_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteId", schemaIndex = 40, tag = 41)
    private final String quote_id;

    @WireField(adapter = "com.robinhood.ceres.v1.RealizedPnlForOrder#ADAPTER", jsonName = "realizedPnl", schemaIndex = 35, tag = 36)
    private final RealizedPnlForOrder realized_pnl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String ref_id;

    @WireField(adapter = "com.robinhood.ceres.v1.OrderRejectReason#ADAPTER", jsonName = "rejectReason", schemaIndex = 24, tag = 25)
    private final OrderRejectReason reject_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", schemaIndex = 31, tag = 32)
    private final String rhs_account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "routeToMainst", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final boolean route_to_mainst;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stopPrice", schemaIndex = 10, tag = 11)
    private final String stop_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 32, tag = 33)
    private final String symbol;

    @WireField(adapter = "rosetta.mainst.TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final TimeInForce time_in_force;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalCommission", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 26)
    private final Money total_commission;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final Money total_fee;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalGoldSavings", schemaIndex = 26, tag = 27)
    private final Money total_gold_savings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String updated_at;

    public FuturesOrder() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1023, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FuturesOrder(String str, String str2, List list, String str3, String str4, String str5, OrderType orderType, OrderTrigger orderTrigger, TimeInForce timeInForce, String str6, String str7, String str8, OrderState orderState, String str9, String str10, String str11, List list2, boolean z, String str12, String str13, OrderEnteredReason orderEnteredReason, Money money, List list3, OrderCancelReason orderCancelReason, OrderRejectReason orderRejectReason, Money money2, Money money3, String str14, String str15, Boolean bool, PositionEffect positionEffect, String str16, String str17, String str18, String str19, RealizedPnlForOrder realizedPnlForOrder, OrderState orderState2, String str20, Money money4, Instant instant, String str21, ByteString byteString, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str22 = (i & 1) != 0 ? "" : str;
        this(str22, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i & 128) != 0 ? OrderTrigger.ORDER_TRIGGER_UNSPECIFIED : orderTrigger, (i & 256) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? OrderState.ORDER_STATE_UNSPECIFIED : orderState, (i & 8192) != 0 ? "" : str9, (i & 16384) != 0 ? "" : str10, (i & 32768) != 0 ? "" : str11, (i & 65536) != 0 ? CollectionsKt.emptyList() : list2, (i & 131072) != 0 ? false : z, (i & 262144) != 0 ? "" : str12, (i & 524288) == 0 ? str13 : "", (i & 1048576) != 0 ? null : orderEnteredReason, (i & 2097152) != 0 ? null : money, (i & 4194304) != 0 ? CollectionsKt.emptyList() : list3, (i & 8388608) != 0 ? null : orderCancelReason, (i & 16777216) != 0 ? null : orderRejectReason, (i & 33554432) != 0 ? null : money2, (i & 67108864) != 0 ? null : money3, (i & 134217728) != 0 ? null : str14, (i & 268435456) != 0 ? null : str15, (i & 536870912) != 0 ? null : bool, (i & 1073741824) != 0 ? null : positionEffect, (i & Integer.MIN_VALUE) != 0 ? null : str16, (i2 & 1) != 0 ? null : str17, (i2 & 2) != 0 ? null : str18, (i2 & 4) != 0 ? null : str19, (i2 & 8) != 0 ? null : realizedPnlForOrder, (i2 & 16) != 0 ? OrderState.ORDER_STATE_UNSPECIFIED : orderState2, (i2 & 32) != 0 ? null : str20, (i2 & 64) != 0 ? null : money4, (i2 & 128) != 0 ? null : instant, (i2 & 256) != 0 ? null : str21, (i2 & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20325newBuilder();
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getFilled_quantity() {
        return this.filled_quantity;
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

    public final String getAverage_price() {
        return this.average_price;
    }

    public final OrderState getOrder_state() {
        return this.order_state;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    public final boolean getRoute_to_mainst() {
        return this.route_to_mainst;
    }

    public final String getEmployee_alias() {
        return this.employee_alias;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final OrderEnteredReason getEntered_reason() {
        return this.entered_reason;
    }

    public final Money getTotal_fee() {
        return this.total_fee;
    }

    public final OrderCancelReason getCancel_reason() {
        return this.cancel_reason;
    }

    public final OrderRejectReason getReject_reason() {
        return this.reject_reason;
    }

    public final Money getTotal_commission() {
        return this.total_commission;
    }

    public final Money getTotal_gold_savings() {
        return this.total_gold_savings;
    }

    public final String getFailed_receipt_override_title() {
        return this.failed_receipt_override_title;
    }

    public final String getFailed_receipt_override_detail_markdown() {
        return this.failed_receipt_override_detail_markdown;
    }

    /* renamed from: is_auto_send_enabled, reason: from getter */
    public final Boolean getIs_auto_send_enabled() {
        return this.is_auto_send_enabled;
    }

    public final PositionEffect getPosition_effect_at_placement_time() {
        return this.position_effect_at_placement_time;
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getDevice_platform() {
        return this.device_platform;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final RealizedPnlForOrder getRealized_pnl() {
        return this.realized_pnl;
    }

    public final OrderState getDerived_state() {
        return this.derived_state;
    }

    public final String getOpp_side() {
        return this.opp_side;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOrder(String order_id, String account_id, List<FuturesOrderLeg> order_legs, String quantity, String filled_quantity, String str, OrderType order_type, OrderTrigger order_trigger, TimeInForce time_in_force, String str2, String str3, String str4, OrderState order_state, String ref_id, String created_at, String updated_at, List<FuturesOrderExecution> order_executions, boolean z, String employee_alias, String account_number, OrderEnteredReason orderEnteredReason, Money money, List<FuturesOrderFee> fees, OrderCancelReason orderCancelReason, OrderRejectReason orderRejectReason, Money money2, Money money3, String str5, String str6, Boolean bool, PositionEffect positionEffect, String str7, String str8, String str9, String str10, RealizedPnlForOrder realizedPnlForOrder, OrderState derived_state, String str11, Money money4, Instant instant, String str12, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(order_legs, "order_legs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(filled_quantity, "filled_quantity");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(order_executions, "order_executions");
        Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(derived_state, "derived_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.account_id = account_id;
        this.quantity = quantity;
        this.filled_quantity = filled_quantity;
        this.max_show = str;
        this.order_type = order_type;
        this.order_trigger = order_trigger;
        this.time_in_force = time_in_force;
        this.limit_price = str2;
        this.stop_price = str3;
        this.average_price = str4;
        this.order_state = order_state;
        this.ref_id = ref_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.route_to_mainst = z;
        this.employee_alias = employee_alias;
        this.account_number = account_number;
        this.entered_reason = orderEnteredReason;
        this.total_fee = money;
        this.cancel_reason = orderCancelReason;
        this.reject_reason = orderRejectReason;
        this.total_commission = money2;
        this.total_gold_savings = money3;
        this.failed_receipt_override_title = str5;
        this.failed_receipt_override_detail_markdown = str6;
        this.is_auto_send_enabled = bool;
        this.position_effect_at_placement_time = positionEffect;
        this.rhs_account_number = str7;
        this.symbol = str8;
        this.device_platform = str9;
        this.device_id = str10;
        this.realized_pnl = realizedPnlForOrder;
        this.derived_state = derived_state;
        this.opp_side = str11;
        this.entered_notional_amount = money4;
        this.gtd_expiration_time = instant;
        this.quote_id = str12;
        this.order_legs = Internal.immutableCopyOf("order_legs", order_legs);
        this.order_executions = Internal.immutableCopyOf("order_executions", order_executions);
        this.fees = Internal.immutableCopyOf("fees", fees);
    }

    public final List<FuturesOrderLeg> getOrder_legs() {
        return this.order_legs;
    }

    public final List<FuturesOrderExecution> getOrder_executions() {
        return this.order_executions;
    }

    public final List<FuturesOrderFee> getFees() {
        return this.fees;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20325newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesOrder)) {
            return false;
        }
        FuturesOrder futuresOrder = (FuturesOrder) other;
        return Intrinsics.areEqual(unknownFields(), futuresOrder.unknownFields()) && Intrinsics.areEqual(this.order_id, futuresOrder.order_id) && Intrinsics.areEqual(this.account_id, futuresOrder.account_id) && Intrinsics.areEqual(this.order_legs, futuresOrder.order_legs) && Intrinsics.areEqual(this.quantity, futuresOrder.quantity) && Intrinsics.areEqual(this.filled_quantity, futuresOrder.filled_quantity) && Intrinsics.areEqual(this.max_show, futuresOrder.max_show) && this.order_type == futuresOrder.order_type && this.order_trigger == futuresOrder.order_trigger && this.time_in_force == futuresOrder.time_in_force && Intrinsics.areEqual(this.limit_price, futuresOrder.limit_price) && Intrinsics.areEqual(this.stop_price, futuresOrder.stop_price) && Intrinsics.areEqual(this.average_price, futuresOrder.average_price) && this.order_state == futuresOrder.order_state && Intrinsics.areEqual(this.ref_id, futuresOrder.ref_id) && Intrinsics.areEqual(this.created_at, futuresOrder.created_at) && Intrinsics.areEqual(this.updated_at, futuresOrder.updated_at) && Intrinsics.areEqual(this.order_executions, futuresOrder.order_executions) && this.route_to_mainst == futuresOrder.route_to_mainst && Intrinsics.areEqual(this.employee_alias, futuresOrder.employee_alias) && Intrinsics.areEqual(this.account_number, futuresOrder.account_number) && this.entered_reason == futuresOrder.entered_reason && Intrinsics.areEqual(this.total_fee, futuresOrder.total_fee) && Intrinsics.areEqual(this.fees, futuresOrder.fees) && this.cancel_reason == futuresOrder.cancel_reason && this.reject_reason == futuresOrder.reject_reason && Intrinsics.areEqual(this.total_commission, futuresOrder.total_commission) && Intrinsics.areEqual(this.total_gold_savings, futuresOrder.total_gold_savings) && Intrinsics.areEqual(this.failed_receipt_override_title, futuresOrder.failed_receipt_override_title) && Intrinsics.areEqual(this.failed_receipt_override_detail_markdown, futuresOrder.failed_receipt_override_detail_markdown) && Intrinsics.areEqual(this.is_auto_send_enabled, futuresOrder.is_auto_send_enabled) && this.position_effect_at_placement_time == futuresOrder.position_effect_at_placement_time && Intrinsics.areEqual(this.rhs_account_number, futuresOrder.rhs_account_number) && Intrinsics.areEqual(this.symbol, futuresOrder.symbol) && Intrinsics.areEqual(this.device_platform, futuresOrder.device_platform) && Intrinsics.areEqual(this.device_id, futuresOrder.device_id) && Intrinsics.areEqual(this.realized_pnl, futuresOrder.realized_pnl) && this.derived_state == futuresOrder.derived_state && Intrinsics.areEqual(this.opp_side, futuresOrder.opp_side) && Intrinsics.areEqual(this.entered_notional_amount, futuresOrder.entered_notional_amount) && Intrinsics.areEqual(this.gtd_expiration_time, futuresOrder.gtd_expiration_time) && Intrinsics.areEqual(this.quote_id, futuresOrder.quote_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.order_id.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.order_legs.hashCode()) * 37) + this.quantity.hashCode()) * 37) + this.filled_quantity.hashCode()) * 37;
        String str = this.max_show;
        int iHashCode2 = (((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.order_type.hashCode()) * 37) + this.order_trigger.hashCode()) * 37) + this.time_in_force.hashCode()) * 37;
        String str2 = this.limit_price;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.stop_price;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.average_price;
        int iHashCode5 = (((((((((((((((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37) + this.order_state.hashCode()) * 37) + this.ref_id.hashCode()) * 37) + this.created_at.hashCode()) * 37) + this.updated_at.hashCode()) * 37) + this.order_executions.hashCode()) * 37) + Boolean.hashCode(this.route_to_mainst)) * 37) + this.employee_alias.hashCode()) * 37) + this.account_number.hashCode()) * 37;
        OrderEnteredReason orderEnteredReason = this.entered_reason;
        int iHashCode6 = (iHashCode5 + (orderEnteredReason != null ? orderEnteredReason.hashCode() : 0)) * 37;
        Money money = this.total_fee;
        int iHashCode7 = (((iHashCode6 + (money != null ? money.hashCode() : 0)) * 37) + this.fees.hashCode()) * 37;
        OrderCancelReason orderCancelReason = this.cancel_reason;
        int iHashCode8 = (iHashCode7 + (orderCancelReason != null ? orderCancelReason.hashCode() : 0)) * 37;
        OrderRejectReason orderRejectReason = this.reject_reason;
        int iHashCode9 = (iHashCode8 + (orderRejectReason != null ? orderRejectReason.hashCode() : 0)) * 37;
        Money money2 = this.total_commission;
        int iHashCode10 = (iHashCode9 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.total_gold_savings;
        int iHashCode11 = (iHashCode10 + (money3 != null ? money3.hashCode() : 0)) * 37;
        String str5 = this.failed_receipt_override_title;
        int iHashCode12 = (iHashCode11 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.failed_receipt_override_detail_markdown;
        int iHashCode13 = (iHashCode12 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Boolean bool = this.is_auto_send_enabled;
        int iHashCode14 = (iHashCode13 + (bool != null ? bool.hashCode() : 0)) * 37;
        PositionEffect positionEffect = this.position_effect_at_placement_time;
        int iHashCode15 = (iHashCode14 + (positionEffect != null ? positionEffect.hashCode() : 0)) * 37;
        String str7 = this.rhs_account_number;
        int iHashCode16 = (iHashCode15 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.symbol;
        int iHashCode17 = (iHashCode16 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.device_platform;
        int iHashCode18 = (iHashCode17 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.device_id;
        int iHashCode19 = (iHashCode18 + (str10 != null ? str10.hashCode() : 0)) * 37;
        RealizedPnlForOrder realizedPnlForOrder = this.realized_pnl;
        int iHashCode20 = (((iHashCode19 + (realizedPnlForOrder != null ? realizedPnlForOrder.hashCode() : 0)) * 37) + this.derived_state.hashCode()) * 37;
        String str11 = this.opp_side;
        int iHashCode21 = (iHashCode20 + (str11 != null ? str11.hashCode() : 0)) * 37;
        Money money4 = this.entered_notional_amount;
        int iHashCode22 = (iHashCode21 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Instant instant = this.gtd_expiration_time;
        int iHashCode23 = (iHashCode22 + (instant != null ? instant.hashCode() : 0)) * 37;
        String str12 = this.quote_id;
        int iHashCode24 = iHashCode23 + (str12 != null ? str12.hashCode() : 0);
        this.hashCode = iHashCode24;
        return iHashCode24;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        if (!this.order_legs.isEmpty()) {
            arrayList.add("order_legs=" + this.order_legs);
        }
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("filled_quantity=" + Internal.sanitize(this.filled_quantity));
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
        String str4 = this.average_price;
        if (str4 != null) {
            arrayList.add("average_price=" + Internal.sanitize(str4));
        }
        arrayList.add("order_state=" + this.order_state);
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        if (!this.order_executions.isEmpty()) {
            arrayList.add("order_executions=" + this.order_executions);
        }
        arrayList.add("route_to_mainst=" + this.route_to_mainst);
        arrayList.add("employee_alias=" + Internal.sanitize(this.employee_alias));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        OrderEnteredReason orderEnteredReason = this.entered_reason;
        if (orderEnteredReason != null) {
            arrayList.add("entered_reason=" + orderEnteredReason);
        }
        Money money = this.total_fee;
        if (money != null) {
            arrayList.add("total_fee=" + money);
        }
        if (!this.fees.isEmpty()) {
            arrayList.add("fees=" + this.fees);
        }
        OrderCancelReason orderCancelReason = this.cancel_reason;
        if (orderCancelReason != null) {
            arrayList.add("cancel_reason=" + orderCancelReason);
        }
        OrderRejectReason orderRejectReason = this.reject_reason;
        if (orderRejectReason != null) {
            arrayList.add("reject_reason=" + orderRejectReason);
        }
        Money money2 = this.total_commission;
        if (money2 != null) {
            arrayList.add("total_commission=" + money2);
        }
        Money money3 = this.total_gold_savings;
        if (money3 != null) {
            arrayList.add("total_gold_savings=" + money3);
        }
        String str5 = this.failed_receipt_override_title;
        if (str5 != null) {
            arrayList.add("failed_receipt_override_title=" + Internal.sanitize(str5));
        }
        String str6 = this.failed_receipt_override_detail_markdown;
        if (str6 != null) {
            arrayList.add("failed_receipt_override_detail_markdown=" + Internal.sanitize(str6));
        }
        Boolean bool = this.is_auto_send_enabled;
        if (bool != null) {
            arrayList.add("is_auto_send_enabled=" + bool);
        }
        PositionEffect positionEffect = this.position_effect_at_placement_time;
        if (positionEffect != null) {
            arrayList.add("position_effect_at_placement_time=" + positionEffect);
        }
        String str7 = this.rhs_account_number;
        if (str7 != null) {
            arrayList.add("rhs_account_number=" + Internal.sanitize(str7));
        }
        String str8 = this.symbol;
        if (str8 != null) {
            arrayList.add("symbol=" + Internal.sanitize(str8));
        }
        String str9 = this.device_platform;
        if (str9 != null) {
            arrayList.add("device_platform=" + Internal.sanitize(str9));
        }
        String str10 = this.device_id;
        if (str10 != null) {
            arrayList.add("device_id=" + Internal.sanitize(str10));
        }
        RealizedPnlForOrder realizedPnlForOrder = this.realized_pnl;
        if (realizedPnlForOrder != null) {
            arrayList.add("realized_pnl=" + realizedPnlForOrder);
        }
        arrayList.add("derived_state=" + this.derived_state);
        String str11 = this.opp_side;
        if (str11 != null) {
            arrayList.add("opp_side=" + Internal.sanitize(str11));
        }
        Money money4 = this.entered_notional_amount;
        if (money4 != null) {
            arrayList.add("entered_notional_amount=" + money4);
        }
        Instant instant = this.gtd_expiration_time;
        if (instant != null) {
            arrayList.add("gtd_expiration_time=" + instant);
        }
        String str12 = this.quote_id;
        if (str12 != null) {
            arrayList.add("quote_id=" + Internal.sanitize(str12));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesOrder{", "}", 0, null, null, 56, null);
    }

    public final FuturesOrder copy(String order_id, String account_id, List<FuturesOrderLeg> order_legs, String quantity, String filled_quantity, String max_show, OrderType order_type, OrderTrigger order_trigger, TimeInForce time_in_force, String limit_price, String stop_price, String average_price, OrderState order_state, String ref_id, String created_at, String updated_at, List<FuturesOrderExecution> order_executions, boolean route_to_mainst, String employee_alias, String account_number, OrderEnteredReason entered_reason, Money total_fee, List<FuturesOrderFee> fees, OrderCancelReason cancel_reason, OrderRejectReason reject_reason, Money total_commission, Money total_gold_savings, String failed_receipt_override_title, String failed_receipt_override_detail_markdown, Boolean is_auto_send_enabled, PositionEffect position_effect_at_placement_time, String rhs_account_number, String symbol, String device_platform, String device_id, RealizedPnlForOrder realized_pnl, OrderState derived_state, String opp_side, Money entered_notional_amount, Instant gtd_expiration_time, String quote_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(order_legs, "order_legs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(filled_quantity, "filled_quantity");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(order_executions, "order_executions");
        Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(derived_state, "derived_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesOrder(order_id, account_id, order_legs, quantity, filled_quantity, max_show, order_type, order_trigger, time_in_force, limit_price, stop_price, average_price, order_state, ref_id, created_at, updated_at, order_executions, route_to_mainst, employee_alias, account_number, entered_reason, total_fee, fees, cancel_reason, reject_reason, total_commission, total_gold_savings, failed_receipt_override_title, failed_receipt_override_detail_markdown, is_auto_send_enabled, position_effect_at_placement_time, rhs_account_number, symbol, device_platform, device_id, realized_pnl, derived_state, opp_side, entered_notional_amount, gtd_expiration_time, quote_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesOrder.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesOrder>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FuturesOrder$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesOrder value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_id());
                }
                int iEncodedSizeWithTag = size + FuturesOrderLeg.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getOrder_legs());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getFilled_quantity(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getFilled_quantity());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(6, value.getMax_show());
                if (value.getOrder_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += OrderType.ADAPTER.encodedSizeWithTag(7, value.getOrder_type());
                }
                if (value.getOrder_trigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += OrderTrigger.ADAPTER.encodedSizeWithTag(8, value.getOrder_trigger());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += TimeInForce.ADAPTER.encodedSizeWithTag(9, value.getTime_in_force());
                }
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(10, value.getLimit_price()) + protoAdapter.encodedSizeWithTag(11, value.getStop_price()) + protoAdapter.encodedSizeWithTag(12, value.getAverage_price());
                OrderState order_state = value.getOrder_state();
                OrderState orderState = OrderState.ORDER_STATE_UNSPECIFIED;
                if (order_state != orderState) {
                    iEncodedSizeWithTag3 += OrderState.ADAPTER.encodedSizeWithTag(13, value.getOrder_state());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(14, value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(15, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(16, value.getUpdated_at());
                }
                int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + FuturesOrderExecution.ADAPTER.asRepeated().encodedSizeWithTag(17, value.getOrder_executions());
                if (value.getRoute_to_mainst()) {
                    iEncodedSizeWithTag4 += ProtoAdapter.BOOL.encodedSizeWithTag(18, Boolean.valueOf(value.getRoute_to_mainst()));
                }
                if (!Intrinsics.areEqual(value.getEmployee_alias(), "")) {
                    iEncodedSizeWithTag4 += protoAdapter.encodedSizeWithTag(19, value.getEmployee_alias());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    iEncodedSizeWithTag4 += protoAdapter.encodedSizeWithTag(20, value.getAccount_number());
                }
                int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + OrderEnteredReason.ADAPTER.encodedSizeWithTag(21, value.getEntered_reason());
                if (value.getTotal_fee() != null) {
                    iEncodedSizeWithTag5 += Money.ADAPTER.encodedSizeWithTag(22, value.getTotal_fee());
                }
                int iEncodedSizeWithTag6 = iEncodedSizeWithTag5 + FuturesOrderFee.ADAPTER.asRepeated().encodedSizeWithTag(23, value.getFees()) + OrderCancelReason.ADAPTER.encodedSizeWithTag(24, value.getCancel_reason()) + OrderRejectReason.ADAPTER.encodedSizeWithTag(25, value.getReject_reason());
                if (value.getTotal_commission() != null) {
                    iEncodedSizeWithTag6 += Money.ADAPTER.encodedSizeWithTag(26, value.getTotal_commission());
                }
                ProtoAdapter<Money> protoAdapter2 = Money.ADAPTER;
                int iEncodedSizeWithTag7 = iEncodedSizeWithTag6 + protoAdapter2.encodedSizeWithTag(27, value.getTotal_gold_savings()) + protoAdapter.encodedSizeWithTag(28, value.getFailed_receipt_override_title()) + protoAdapter.encodedSizeWithTag(29, value.getFailed_receipt_override_detail_markdown()) + ProtoAdapter.BOOL.encodedSizeWithTag(30, value.getIs_auto_send_enabled()) + PositionEffect.ADAPTER.encodedSizeWithTag(31, value.getPosition_effect_at_placement_time()) + protoAdapter.encodedSizeWithTag(32, value.getRhs_account_number()) + protoAdapter.encodedSizeWithTag(33, value.getSymbol()) + protoAdapter.encodedSizeWithTag(34, value.getDevice_platform()) + protoAdapter.encodedSizeWithTag(35, value.getDevice_id()) + RealizedPnlForOrder.ADAPTER.encodedSizeWithTag(36, value.getRealized_pnl());
                if (value.getDerived_state() != orderState) {
                    iEncodedSizeWithTag7 += OrderState.ADAPTER.encodedSizeWithTag(37, value.getDerived_state());
                }
                int iEncodedSizeWithTag8 = iEncodedSizeWithTag7 + protoAdapter.encodedSizeWithTag(38, value.getOpp_side());
                if (value.getEntered_notional_amount() != null) {
                    iEncodedSizeWithTag8 += protoAdapter2.encodedSizeWithTag(39, value.getEntered_notional_amount());
                }
                return iEncodedSizeWithTag8 + ProtoAdapter.INSTANT.encodedSizeWithTag(40, value.getGtd_expiration_time()) + protoAdapter.encodedSizeWithTag(41, value.getQuote_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesOrder value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                FuturesOrderLeg.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getOrder_legs());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getFilled_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getFilled_quantity());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getMax_show());
                if (value.getOrder_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 7, (int) value.getOrder_type());
                }
                if (value.getOrder_trigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    OrderTrigger.ADAPTER.encodeWithTag(writer, 8, (int) value.getOrder_trigger());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 9, (int) value.getTime_in_force());
                }
                protoAdapter.encodeWithTag(writer, 10, (int) value.getLimit_price());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getStop_price());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getAverage_price());
                OrderState order_state = value.getOrder_state();
                OrderState orderState = OrderState.ORDER_STATE_UNSPECIFIED;
                if (order_state != orderState) {
                    OrderState.ADAPTER.encodeWithTag(writer, 13, (int) value.getOrder_state());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 14, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 15, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 16, (int) value.getUpdated_at());
                }
                FuturesOrderExecution.ADAPTER.asRepeated().encodeWithTag(writer, 17, (int) value.getOrder_executions());
                if (value.getRoute_to_mainst()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 18, (int) Boolean.valueOf(value.getRoute_to_mainst()));
                }
                if (!Intrinsics.areEqual(value.getEmployee_alias(), "")) {
                    protoAdapter.encodeWithTag(writer, 19, (int) value.getEmployee_alias());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    protoAdapter.encodeWithTag(writer, 20, (int) value.getAccount_number());
                }
                OrderEnteredReason.ADAPTER.encodeWithTag(writer, 21, (int) value.getEntered_reason());
                if (value.getTotal_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 22, (int) value.getTotal_fee());
                }
                FuturesOrderFee.ADAPTER.asRepeated().encodeWithTag(writer, 23, (int) value.getFees());
                OrderCancelReason.ADAPTER.encodeWithTag(writer, 24, (int) value.getCancel_reason());
                OrderRejectReason.ADAPTER.encodeWithTag(writer, 25, (int) value.getReject_reason());
                if (value.getTotal_commission() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 26, (int) value.getTotal_commission());
                }
                ProtoAdapter<Money> protoAdapter2 = Money.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 27, (int) value.getTotal_gold_savings());
                protoAdapter.encodeWithTag(writer, 28, (int) value.getFailed_receipt_override_title());
                protoAdapter.encodeWithTag(writer, 29, (int) value.getFailed_receipt_override_detail_markdown());
                ProtoAdapter.BOOL.encodeWithTag(writer, 30, (int) value.getIs_auto_send_enabled());
                PositionEffect.ADAPTER.encodeWithTag(writer, 31, (int) value.getPosition_effect_at_placement_time());
                protoAdapter.encodeWithTag(writer, 32, (int) value.getRhs_account_number());
                protoAdapter.encodeWithTag(writer, 33, (int) value.getSymbol());
                protoAdapter.encodeWithTag(writer, 34, (int) value.getDevice_platform());
                protoAdapter.encodeWithTag(writer, 35, (int) value.getDevice_id());
                RealizedPnlForOrder.ADAPTER.encodeWithTag(writer, 36, (int) value.getRealized_pnl());
                if (value.getDerived_state() != orderState) {
                    OrderState.ADAPTER.encodeWithTag(writer, 37, (int) value.getDerived_state());
                }
                protoAdapter.encodeWithTag(writer, 38, (int) value.getOpp_side());
                if (value.getEntered_notional_amount() != null) {
                    protoAdapter2.encodeWithTag(writer, 39, (int) value.getEntered_notional_amount());
                }
                ProtoAdapter.INSTANT.encodeWithTag(writer, 40, (int) value.getGtd_expiration_time());
                protoAdapter.encodeWithTag(writer, 41, (int) value.getQuote_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesOrder value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 41, (int) value.getQuote_id());
                ProtoAdapter.INSTANT.encodeWithTag(writer, 40, (int) value.getGtd_expiration_time());
                if (value.getEntered_notional_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 39, (int) value.getEntered_notional_amount());
                }
                protoAdapter.encodeWithTag(writer, 38, (int) value.getOpp_side());
                OrderState derived_state = value.getDerived_state();
                OrderState orderState = OrderState.ORDER_STATE_UNSPECIFIED;
                if (derived_state != orderState) {
                    OrderState.ADAPTER.encodeWithTag(writer, 37, (int) value.getDerived_state());
                }
                RealizedPnlForOrder.ADAPTER.encodeWithTag(writer, 36, (int) value.getRealized_pnl());
                protoAdapter.encodeWithTag(writer, 35, (int) value.getDevice_id());
                protoAdapter.encodeWithTag(writer, 34, (int) value.getDevice_platform());
                protoAdapter.encodeWithTag(writer, 33, (int) value.getSymbol());
                protoAdapter.encodeWithTag(writer, 32, (int) value.getRhs_account_number());
                PositionEffect.ADAPTER.encodeWithTag(writer, 31, (int) value.getPosition_effect_at_placement_time());
                ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 30, (int) value.getIs_auto_send_enabled());
                protoAdapter.encodeWithTag(writer, 29, (int) value.getFailed_receipt_override_detail_markdown());
                protoAdapter.encodeWithTag(writer, 28, (int) value.getFailed_receipt_override_title());
                ProtoAdapter<Money> protoAdapter3 = Money.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 27, (int) value.getTotal_gold_savings());
                if (value.getTotal_commission() != null) {
                    protoAdapter3.encodeWithTag(writer, 26, (int) value.getTotal_commission());
                }
                OrderRejectReason.ADAPTER.encodeWithTag(writer, 25, (int) value.getReject_reason());
                OrderCancelReason.ADAPTER.encodeWithTag(writer, 24, (int) value.getCancel_reason());
                FuturesOrderFee.ADAPTER.asRepeated().encodeWithTag(writer, 23, (int) value.getFees());
                if (value.getTotal_fee() != null) {
                    protoAdapter3.encodeWithTag(writer, 22, (int) value.getTotal_fee());
                }
                OrderEnteredReason.ADAPTER.encodeWithTag(writer, 21, (int) value.getEntered_reason());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    protoAdapter.encodeWithTag(writer, 20, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getEmployee_alias(), "")) {
                    protoAdapter.encodeWithTag(writer, 19, (int) value.getEmployee_alias());
                }
                if (value.getRoute_to_mainst()) {
                    protoAdapter2.encodeWithTag(writer, 18, (int) Boolean.valueOf(value.getRoute_to_mainst()));
                }
                FuturesOrderExecution.ADAPTER.asRepeated().encodeWithTag(writer, 17, (int) value.getOrder_executions());
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 16, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 15, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 14, (int) value.getRef_id());
                }
                if (value.getOrder_state() != orderState) {
                    OrderState.ADAPTER.encodeWithTag(writer, 13, (int) value.getOrder_state());
                }
                protoAdapter.encodeWithTag(writer, 12, (int) value.getAverage_price());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getStop_price());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getLimit_price());
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 9, (int) value.getTime_in_force());
                }
                if (value.getOrder_trigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    OrderTrigger.ADAPTER.encodeWithTag(writer, 8, (int) value.getOrder_trigger());
                }
                if (value.getOrder_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 7, (int) value.getOrder_type());
                }
                protoAdapter.encodeWithTag(writer, 6, (int) value.getMax_show());
                if (!Intrinsics.areEqual(value.getFilled_quantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getFilled_quantity());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getQuantity());
                }
                FuturesOrderLeg.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getOrder_legs());
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (Intrinsics.areEqual(value.getOrder_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getOrder_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesOrder decode(ProtoReader reader) throws IOException {
                OrderTrigger orderTrigger;
                OrderState orderState;
                OrderState orderState2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                OrderType orderType = OrderType.ORDER_TYPE_UNSPECIFIED;
                OrderTrigger orderTrigger2 = OrderTrigger.ORDER_TRIGGER_UNSPECIFIED;
                TimeInForce timeInForce = TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                OrderState orderState3 = OrderState.ORDER_STATE_UNSPECIFIED;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                OrderType orderTypeDecode = orderType;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = null;
                String strDecode10 = null;
                String strDecode11 = null;
                String strDecode12 = null;
                OrderEnteredReason orderEnteredReasonDecode = null;
                Money moneyDecode = null;
                OrderCancelReason orderCancelReasonDecode = null;
                OrderRejectReason orderRejectReasonDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                String strDecode13 = null;
                String strDecode14 = null;
                Boolean boolDecode = null;
                PositionEffect positionEffectDecode = null;
                String strDecode15 = null;
                String strDecode16 = null;
                String strDecode17 = null;
                String strDecode18 = null;
                RealizedPnlForOrder realizedPnlForOrderDecode = null;
                String strDecode19 = null;
                Money moneyDecode4 = null;
                Instant instantDecode = null;
                String strDecode20 = null;
                boolean zBooleanValue = false;
                OrderState orderStateDecode = orderState3;
                OrderState orderStateDecode2 = orderStateDecode;
                String strDecode21 = strDecode8;
                TimeInForce timeInForceDecode = timeInForce;
                OrderTrigger orderTriggerDecode = orderTrigger2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FuturesOrder(strDecode21, strDecode, arrayList, strDecode2, strDecode3, strDecode9, orderTypeDecode, orderTriggerDecode, timeInForceDecode, strDecode10, strDecode11, strDecode12, orderStateDecode, strDecode4, strDecode5, strDecode6, arrayList2, zBooleanValue, strDecode7, strDecode8, orderEnteredReasonDecode, moneyDecode, arrayList3, orderCancelReasonDecode, orderRejectReasonDecode, moneyDecode2, moneyDecode3, strDecode13, strDecode14, boolDecode, positionEffectDecode, strDecode15, strDecode16, strDecode17, strDecode18, realizedPnlForOrderDecode, orderStateDecode2, strDecode19, moneyDecode4, instantDecode, strDecode20, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            strDecode21 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            orderTrigger = orderTriggerDecode;
                            orderState = orderStateDecode;
                            orderState2 = orderStateDecode2;
                            arrayList.add(FuturesOrderLeg.ADAPTER.decode(reader));
                            orderTriggerDecode = orderTrigger;
                            orderStateDecode = orderState;
                            orderStateDecode2 = orderState2;
                            break;
                        case 4:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            strDecode9 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            orderTrigger = orderTriggerDecode;
                            orderState = orderStateDecode;
                            orderState2 = orderStateDecode2;
                            try {
                                orderTypeDecode = OrderType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            orderTriggerDecode = orderTrigger;
                            orderStateDecode = orderState;
                            orderStateDecode2 = orderState2;
                            break;
                        case 8:
                            orderTrigger = orderTriggerDecode;
                            orderState = orderStateDecode;
                            orderState2 = orderStateDecode2;
                            try {
                                orderTriggerDecode = OrderTrigger.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            orderStateDecode = orderState;
                            orderStateDecode2 = orderState2;
                            break;
                        case 9:
                            orderTrigger = orderTriggerDecode;
                            orderState = orderStateDecode;
                            orderState2 = orderStateDecode2;
                            try {
                                timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            orderTriggerDecode = orderTrigger;
                            orderStateDecode = orderState;
                            orderStateDecode2 = orderState2;
                            break;
                        case 10:
                            strDecode10 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 11:
                            strDecode11 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 12:
                            strDecode12 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 13:
                            orderTrigger = orderTriggerDecode;
                            orderState = orderStateDecode;
                            orderState2 = orderStateDecode2;
                            try {
                                orderStateDecode = OrderState.ADAPTER.decode(reader);
                                orderTriggerDecode = orderTrigger;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                            orderStateDecode2 = orderState2;
                            break;
                        case 14:
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 15:
                            strDecode5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 16:
                            strDecode6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 17:
                            orderTrigger = orderTriggerDecode;
                            orderState = orderStateDecode;
                            orderState2 = orderStateDecode2;
                            arrayList2.add(FuturesOrderExecution.ADAPTER.decode(reader));
                            orderTriggerDecode = orderTrigger;
                            orderStateDecode = orderState;
                            orderStateDecode2 = orderState2;
                            break;
                        case 18:
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 19:
                            strDecode7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 20:
                            strDecode8 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 21:
                            orderTrigger = orderTriggerDecode;
                            orderState = orderStateDecode;
                            orderState2 = orderStateDecode2;
                            try {
                                orderEnteredReasonDecode = OrderEnteredReason.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                            }
                            orderTriggerDecode = orderTrigger;
                            orderStateDecode = orderState;
                            orderStateDecode2 = orderState2;
                            break;
                        case 22:
                            moneyDecode = Money.ADAPTER.decode(reader);
                            break;
                        case 23:
                            orderTrigger = orderTriggerDecode;
                            orderState = orderStateDecode;
                            orderState2 = orderStateDecode2;
                            arrayList3.add(FuturesOrderFee.ADAPTER.decode(reader));
                            orderTriggerDecode = orderTrigger;
                            orderStateDecode = orderState;
                            orderStateDecode2 = orderState2;
                            break;
                        case 24:
                            orderTrigger = orderTriggerDecode;
                            orderState = orderStateDecode;
                            orderState2 = orderStateDecode2;
                            try {
                                orderCancelReasonDecode = OrderCancelReason.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                            }
                            orderTriggerDecode = orderTrigger;
                            orderStateDecode = orderState;
                            orderStateDecode2 = orderState2;
                            break;
                        case 25:
                            orderTrigger = orderTriggerDecode;
                            orderState = orderStateDecode;
                            orderState2 = orderStateDecode2;
                            try {
                                orderRejectReasonDecode = OrderRejectReason.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                            }
                            orderTriggerDecode = orderTrigger;
                            orderStateDecode = orderState;
                            orderStateDecode2 = orderState2;
                            break;
                        case 26:
                            moneyDecode2 = Money.ADAPTER.decode(reader);
                            break;
                        case 27:
                            moneyDecode3 = Money.ADAPTER.decode(reader);
                            break;
                        case 28:
                            strDecode13 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 29:
                            strDecode14 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 30:
                            boolDecode = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 31:
                            orderTrigger = orderTriggerDecode;
                            orderState = orderStateDecode;
                            orderState2 = orderStateDecode2;
                            try {
                                positionEffectDecode = PositionEffect.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                            }
                            orderTriggerDecode = orderTrigger;
                            orderStateDecode = orderState;
                            orderStateDecode2 = orderState2;
                            break;
                        case 32:
                            strDecode15 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 33:
                            strDecode16 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 34:
                            strDecode17 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 35:
                            strDecode18 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 36:
                            realizedPnlForOrderDecode = RealizedPnlForOrder.ADAPTER.decode(reader);
                            break;
                        case 37:
                            try {
                                orderStateDecode2 = OrderState.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                orderTrigger = orderTriggerDecode;
                                orderState = orderStateDecode;
                                orderState2 = orderStateDecode2;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e9.value));
                                break;
                            }
                        case 38:
                            strDecode19 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 39:
                            moneyDecode4 = Money.ADAPTER.decode(reader);
                            break;
                        case 40:
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 41:
                            strDecode20 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            orderTrigger = orderTriggerDecode;
                            orderState = orderStateDecode;
                            orderState2 = orderStateDecode2;
                            orderTriggerDecode = orderTrigger;
                            orderStateDecode = orderState;
                            orderStateDecode2 = orderState2;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesOrder redact(FuturesOrder value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getOrder_legs(), FuturesOrderLeg.ADAPTER);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getOrder_executions(), FuturesOrderExecution.ADAPTER);
                Money total_fee = value.getTotal_fee();
                Money moneyRedact = total_fee != null ? Money.ADAPTER.redact(total_fee) : null;
                List listM26823redactElements3 = Internal.m26823redactElements(value.getFees(), FuturesOrderFee.ADAPTER);
                Money total_commission = value.getTotal_commission();
                Money moneyRedact2 = total_commission != null ? Money.ADAPTER.redact(total_commission) : null;
                Money total_gold_savings = value.getTotal_gold_savings();
                Money moneyRedact3 = total_gold_savings != null ? Money.ADAPTER.redact(total_gold_savings) : null;
                RealizedPnlForOrder realized_pnl = value.getRealized_pnl();
                RealizedPnlForOrder realizedPnlForOrderRedact = realized_pnl != null ? RealizedPnlForOrder.ADAPTER.redact(realized_pnl) : null;
                Money entered_notional_amount = value.getEntered_notional_amount();
                Money moneyRedact4 = entered_notional_amount != null ? Money.ADAPTER.redact(entered_notional_amount) : null;
                Instant gtd_expiration_time = value.getGtd_expiration_time();
                return value.copy(((-107020293) & 1) != 0 ? value.order_id : null, ((-107020293) & 2) != 0 ? value.account_id : null, ((-107020293) & 4) != 0 ? value.order_legs : listM26823redactElements, ((-107020293) & 8) != 0 ? value.quantity : null, ((-107020293) & 16) != 0 ? value.filled_quantity : null, ((-107020293) & 32) != 0 ? value.max_show : null, ((-107020293) & 64) != 0 ? value.order_type : null, ((-107020293) & 128) != 0 ? value.order_trigger : null, ((-107020293) & 256) != 0 ? value.time_in_force : null, ((-107020293) & 512) != 0 ? value.limit_price : null, ((-107020293) & 1024) != 0 ? value.stop_price : null, ((-107020293) & 2048) != 0 ? value.average_price : null, ((-107020293) & 4096) != 0 ? value.order_state : null, ((-107020293) & 8192) != 0 ? value.ref_id : null, ((-107020293) & 16384) != 0 ? value.created_at : null, ((-107020293) & 32768) != 0 ? value.updated_at : null, ((-107020293) & 65536) != 0 ? value.order_executions : listM26823redactElements2, ((-107020293) & 131072) != 0 ? value.route_to_mainst : false, ((-107020293) & 262144) != 0 ? value.employee_alias : null, ((-107020293) & 524288) != 0 ? value.account_number : null, ((-107020293) & 1048576) != 0 ? value.entered_reason : null, ((-107020293) & 2097152) != 0 ? value.total_fee : moneyRedact, ((-107020293) & 4194304) != 0 ? value.fees : listM26823redactElements3, ((-107020293) & 8388608) != 0 ? value.cancel_reason : null, ((-107020293) & 16777216) != 0 ? value.reject_reason : null, ((-107020293) & 33554432) != 0 ? value.total_commission : moneyRedact2, ((-107020293) & 67108864) != 0 ? value.total_gold_savings : moneyRedact3, ((-107020293) & 134217728) != 0 ? value.failed_receipt_override_title : null, ((-107020293) & 268435456) != 0 ? value.failed_receipt_override_detail_markdown : null, ((-107020293) & 536870912) != 0 ? value.is_auto_send_enabled : null, ((-107020293) & 1073741824) != 0 ? value.position_effect_at_placement_time : null, ((-107020293) & Integer.MIN_VALUE) != 0 ? value.rhs_account_number : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE & 1) != 0 ? value.symbol : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE & 2) != 0 ? value.device_platform : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE & 4) != 0 ? value.device_id : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE & 8) != 0 ? value.realized_pnl : realizedPnlForOrderRedact, (EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE & 16) != 0 ? value.derived_state : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE & 32) != 0 ? value.opp_side : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE & 64) != 0 ? value.entered_notional_amount : moneyRedact4, (EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE & 128) != 0 ? value.gtd_expiration_time : gtd_expiration_time != null ? ProtoAdapter.INSTANT.redact(gtd_expiration_time) : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE & 256) != 0 ? value.quote_id : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE & 512) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

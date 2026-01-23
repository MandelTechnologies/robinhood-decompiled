package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import com.robinhood.ceres.p284v1.FuturesOrderExecutionDto;
import com.robinhood.ceres.p284v1.FuturesOrderFeeDto;
import com.robinhood.ceres.p284v1.FuturesOrderLegDto;
import com.robinhood.ceres.p284v1.OrderCancelReasonDto;
import com.robinhood.ceres.p284v1.OrderEnteredReasonDto;
import com.robinhood.ceres.p284v1.OrderRejectReasonDto;
import com.robinhood.ceres.p284v1.PositionEffectDto;
import com.robinhood.ceres.p284v1.RealizedPnlForOrderDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;
import rosetta.mainst.OrderState;
import rosetta.mainst.OrderStateDto;
import rosetta.mainst.OrderTrigger;
import rosetta.mainst.OrderTriggerDto;
import rosetta.mainst.OrderType;
import rosetta.mainst.OrderTypeDto;
import rosetta.mainst.TimeInForce;
import rosetta.mainst.TimeInForceDto;

/* compiled from: FuturesOrderDto.kt */
@Metadata(m3635d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b@\b\u0007\u0018\u0000 \u0091\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b\u0092\u0001\u0091\u0001\u0093\u0001\u0094\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bé\u0003\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000b\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010$\u001a\u00020\b\u0012\b\b\u0002\u0010%\u001a\u00020\b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u000b\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010=\u001a\u00020\u001b\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010(\u0012\u0010\b\u0002\u0010B\u001a\n\u0018\u00010@j\u0004\u0018\u0001`A\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010DJí\u0003\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000b2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u000b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00100\u001a\u0004\u0018\u00010(2\n\b\u0002\u00101\u001a\u0004\u0018\u00010(2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\"2\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010=\u001a\u00020\u001b2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010(2\u0010\b\u0002\u0010B\u001a\n\u0018\u00010@j\u0004\u0018\u0001`A2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\b¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0002H\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\bH\u0016¢\u0006\u0004\bI\u0010JJ\u001a\u0010M\u001a\u00020\"2\b\u0010L\u001a\u0004\u0018\u00010KH\u0096\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010V\u001a\u00020U2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020OH\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020OH\u0016¢\u0006\u0004\bX\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010YR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bZ\u0010JR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b[\u0010JR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b`\u0010_R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\ba\u0010_R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bh\u0010_R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bi\u0010_R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bj\u0010_R\u0011\u0010\u001c\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0011\u0010\u001d\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bm\u0010JR\u0011\u0010\u001e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bn\u0010JR\u0011\u0010\u001f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bo\u0010JR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000b8F¢\u0006\u0006\u001a\u0004\bp\u0010]R\u0011\u0010#\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0011\u0010$\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bs\u0010JR\u0011\u0010%\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bt\u0010JR\u0013\u0010'\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0013\u0010)\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u000b8F¢\u0006\u0006\u001a\u0004\by\u0010]R\u0013\u0010-\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0013\u0010/\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0013\u00100\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b~\u0010xR\u0013\u00101\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b\u007f\u0010xR\u0014\u00102\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010JR\u0014\u00103\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010JR\u0014\u00104\u001a\u0004\u0018\u00010\"8F¢\u0006\u0007\u001a\u0005\b4\u0010\u0082\u0001R\u0015\u00106\u001a\u0004\u0018\u0001058F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0014\u00107\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010JR\u0014\u00108\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010JR\u0014\u00109\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010JR\u0014\u0010:\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010JR\u0015\u0010<\u001a\u0004\u0018\u00010;8F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0012\u0010=\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010lR\u0014\u0010>\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010_R\u0014\u0010?\u001a\u0004\u0018\u00010(8F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010xR\u001b\u0010B\u001a\n\u0018\u00010@j\u0004\u0018\u0001`A8F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0014\u0010C\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010J¨\u0006\u0095\u0001"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FuturesOrder;", "Landroid/os/Parcelable;", "Lcom/robinhood/ceres/v1/FuturesOrderDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/ceres/v1/FuturesOrderDto$Surrogate;)V", "", "order_id", "account_id", "", "Lcom/robinhood/ceres/v1/FuturesOrderLegDto;", "order_legs", "Lcom/robinhood/idl/IdlDecimal;", "quantity", "filled_quantity", "max_show", "Lrosetta/mainst/OrderTypeDto;", "order_type", "Lrosetta/mainst/OrderTriggerDto;", "order_trigger", "Lrosetta/mainst/TimeInForceDto;", "time_in_force", "limit_price", "stop_price", "average_price", "Lrosetta/mainst/OrderStateDto;", "order_state", "ref_id", "created_at", "updated_at", "Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto;", "order_executions", "", "route_to_mainst", "employee_alias", "account_number", "Lcom/robinhood/ceres/v1/OrderEnteredReasonDto;", "entered_reason", "Lcom/robinhood/rosetta/common/MoneyDto;", "total_fee", "Lcom/robinhood/ceres/v1/FuturesOrderFeeDto;", "fees", "Lcom/robinhood/ceres/v1/OrderCancelReasonDto;", "cancel_reason", "Lcom/robinhood/ceres/v1/OrderRejectReasonDto;", "reject_reason", "total_commission", "total_gold_savings", "failed_receipt_override_title", "failed_receipt_override_detail_markdown", "is_auto_send_enabled", "Lcom/robinhood/ceres/v1/PositionEffectDto;", "position_effect_at_placement_time", "rhs_account_number", "symbol", "device_platform", "device_id", "Lcom/robinhood/ceres/v1/RealizedPnlForOrderDto;", "realized_pnl", "derived_state", "opp_side", "entered_notional_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "gtd_expiration_time", "quote_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderStateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderEnteredReasonDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lcom/robinhood/ceres/v1/OrderCancelReasonDto;Lcom/robinhood/ceres/v1/OrderRejectReasonDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/PositionEffectDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/RealizedPnlForOrderDto;Lrosetta/mainst/OrderStateDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderStateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderEnteredReasonDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lcom/robinhood/ceres/v1/OrderCancelReasonDto;Lcom/robinhood/ceres/v1/OrderRejectReasonDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/PositionEffectDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/RealizedPnlForOrderDto;Lrosetta/mainst/OrderStateDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;)Lcom/robinhood/ceres/v1/FuturesOrderDto;", "toProto", "()Lcom/robinhood/ceres/v1/FuturesOrder;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/ceres/v1/FuturesOrderDto$Surrogate;", "getOrder_id", "getAccount_id", "getOrder_legs", "()Ljava/util/List;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getFilled_quantity", "getMax_show", "getOrder_type", "()Lrosetta/mainst/OrderTypeDto;", "getOrder_trigger", "()Lrosetta/mainst/OrderTriggerDto;", "getTime_in_force", "()Lrosetta/mainst/TimeInForceDto;", "getLimit_price", "getStop_price", "getAverage_price", "getOrder_state", "()Lrosetta/mainst/OrderStateDto;", "getRef_id", "getCreated_at", "getUpdated_at", "getOrder_executions", "getRoute_to_mainst", "()Z", "getEmployee_alias", "getAccount_number", "getEntered_reason", "()Lcom/robinhood/ceres/v1/OrderEnteredReasonDto;", "getTotal_fee", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getFees", "getCancel_reason", "()Lcom/robinhood/ceres/v1/OrderCancelReasonDto;", "getReject_reason", "()Lcom/robinhood/ceres/v1/OrderRejectReasonDto;", "getTotal_commission", "getTotal_gold_savings", "getFailed_receipt_override_title", "getFailed_receipt_override_detail_markdown", "()Ljava/lang/Boolean;", "getPosition_effect_at_placement_time", "()Lcom/robinhood/ceres/v1/PositionEffectDto;", "getRhs_account_number", "getSymbol", "getDevice_platform", "getDevice_id", "getRealized_pnl", "()Lcom/robinhood/ceres/v1/RealizedPnlForOrderDto;", "getDerived_state", "getOpp_side", "getEntered_notional_amount", "getGtd_expiration_time", "()Lj$/time/Instant;", "getQuote_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class FuturesOrderDto implements Dto3<FuturesOrder>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesOrderDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesOrderDto, FuturesOrder>> binaryBase64Serializer$delegate;
    private static final FuturesOrderDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesOrderDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesOrderDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final List<FuturesOrderLegDto> getOrder_legs() {
        return this.surrogate.getOrder_legs();
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final IdlDecimal getFilled_quantity() {
        return this.surrogate.getFilled_quantity();
    }

    public final IdlDecimal getMax_show() {
        return this.surrogate.getMax_show();
    }

    public final OrderTypeDto getOrder_type() {
        return this.surrogate.getOrder_type();
    }

    public final OrderTriggerDto getOrder_trigger() {
        return this.surrogate.getOrder_trigger();
    }

    public final TimeInForceDto getTime_in_force() {
        return this.surrogate.getTime_in_force();
    }

    public final IdlDecimal getLimit_price() {
        return this.surrogate.getLimit_price();
    }

    public final IdlDecimal getStop_price() {
        return this.surrogate.getStop_price();
    }

    public final IdlDecimal getAverage_price() {
        return this.surrogate.getAverage_price();
    }

    public final OrderStateDto getOrder_state() {
        return this.surrogate.getOrder_state();
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final String getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final String getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final List<FuturesOrderExecutionDto> getOrder_executions() {
        return this.surrogate.getOrder_executions();
    }

    public final boolean getRoute_to_mainst() {
        return this.surrogate.getRoute_to_mainst();
    }

    public final String getEmployee_alias() {
        return this.surrogate.getEmployee_alias();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final OrderEnteredReasonDto getEntered_reason() {
        return this.surrogate.getEntered_reason();
    }

    public final MoneyDto getTotal_fee() {
        return this.surrogate.getTotal_fee();
    }

    public final List<FuturesOrderFeeDto> getFees() {
        return this.surrogate.getFees();
    }

    public final OrderCancelReasonDto getCancel_reason() {
        return this.surrogate.getCancel_reason();
    }

    public final OrderRejectReasonDto getReject_reason() {
        return this.surrogate.getReject_reason();
    }

    public final MoneyDto getTotal_commission() {
        return this.surrogate.getTotal_commission();
    }

    public final MoneyDto getTotal_gold_savings() {
        return this.surrogate.getTotal_gold_savings();
    }

    public final String getFailed_receipt_override_title() {
        return this.surrogate.getFailed_receipt_override_title();
    }

    public final String getFailed_receipt_override_detail_markdown() {
        return this.surrogate.getFailed_receipt_override_detail_markdown();
    }

    public final Boolean is_auto_send_enabled() {
        return this.surrogate.is_auto_send_enabled();
    }

    public final PositionEffectDto getPosition_effect_at_placement_time() {
        return this.surrogate.getPosition_effect_at_placement_time();
    }

    public final String getRhs_account_number() {
        return this.surrogate.getRhs_account_number();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getDevice_platform() {
        return this.surrogate.getDevice_platform();
    }

    public final String getDevice_id() {
        return this.surrogate.getDevice_id();
    }

    public final RealizedPnlForOrderDto getRealized_pnl() {
        return this.surrogate.getRealized_pnl();
    }

    public final OrderStateDto getDerived_state() {
        return this.surrogate.getDerived_state();
    }

    public final IdlDecimal getOpp_side() {
        return this.surrogate.getOpp_side();
    }

    public final MoneyDto getEntered_notional_amount() {
        return this.surrogate.getEntered_notional_amount();
    }

    public final Instant getGtd_expiration_time() {
        return this.surrogate.getGtd_expiration_time();
    }

    public final String getQuote_id() {
        return this.surrogate.getQuote_id();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FuturesOrderDto(String str, String str2, List list, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, OrderTypeDto orderTypeDto, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, OrderStateDto orderStateDto, String str3, String str4, String str5, List list2, boolean z, String str6, String str7, OrderEnteredReasonDto orderEnteredReasonDto, MoneyDto moneyDto, List list3, OrderCancelReasonDto orderCancelReasonDto, OrderRejectReasonDto orderRejectReasonDto, MoneyDto moneyDto2, MoneyDto moneyDto3, String str8, String str9, Boolean bool, PositionEffectDto positionEffectDto, String str10, String str11, String str12, String str13, RealizedPnlForOrderDto realizedPnlForOrderDto, OrderStateDto orderStateDto2, IdlDecimal idlDecimal7, MoneyDto moneyDto4, Instant instant, String str14, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str15 = (i & 1) != 0 ? "" : str;
        this(str15, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 32) != 0 ? null : idlDecimal3, (i & 64) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 128) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto, (i & 256) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 512) != 0 ? null : idlDecimal4, (i & 1024) != 0 ? null : idlDecimal5, (i & 2048) != 0 ? null : idlDecimal6, (i & 4096) != 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto, (i & 8192) != 0 ? "" : str3, (i & 16384) != 0 ? "" : str4, (i & 32768) != 0 ? "" : str5, (i & 65536) != 0 ? CollectionsKt.emptyList() : list2, (i & 131072) != 0 ? false : z, (i & 262144) != 0 ? "" : str6, (i & 524288) == 0 ? str7 : "", (i & 1048576) != 0 ? null : orderEnteredReasonDto, (i & 2097152) != 0 ? null : moneyDto, (i & 4194304) != 0 ? CollectionsKt.emptyList() : list3, (i & 8388608) != 0 ? null : orderCancelReasonDto, (i & 16777216) != 0 ? null : orderRejectReasonDto, (i & 33554432) != 0 ? null : moneyDto2, (i & 67108864) != 0 ? null : moneyDto3, (i & 134217728) != 0 ? null : str8, (i & 268435456) != 0 ? null : str9, (i & 536870912) != 0 ? null : bool, (i & 1073741824) != 0 ? null : positionEffectDto, (i & Integer.MIN_VALUE) != 0 ? null : str10, (i2 & 1) != 0 ? null : str11, (i2 & 2) != 0 ? null : str12, (i2 & 4) != 0 ? null : str13, (i2 & 8) != 0 ? null : realizedPnlForOrderDto, (i2 & 16) != 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto2, (i2 & 32) != 0 ? null : idlDecimal7, (i2 & 64) != 0 ? null : moneyDto4, (i2 & 128) != 0 ? null : instant, (i2 & 256) != 0 ? null : str14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesOrderDto(String order_id, String account_id, List<FuturesOrderLegDto> order_legs, IdlDecimal quantity, IdlDecimal filled_quantity, IdlDecimal idlDecimal, OrderTypeDto order_type, OrderTriggerDto order_trigger, TimeInForceDto time_in_force, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, OrderStateDto order_state, String ref_id, String created_at, String updated_at, List<FuturesOrderExecutionDto> order_executions, boolean z, String employee_alias, String account_number, OrderEnteredReasonDto orderEnteredReasonDto, MoneyDto moneyDto, List<FuturesOrderFeeDto> fees, OrderCancelReasonDto orderCancelReasonDto, OrderRejectReasonDto orderRejectReasonDto, MoneyDto moneyDto2, MoneyDto moneyDto3, String str, String str2, Boolean bool, PositionEffectDto positionEffectDto, String str3, String str4, String str5, String str6, RealizedPnlForOrderDto realizedPnlForOrderDto, OrderStateDto derived_state, IdlDecimal idlDecimal5, MoneyDto moneyDto4, Instant instant, String str7) {
        this(new Surrogate(order_id, account_id, order_legs, quantity, filled_quantity, idlDecimal, order_type, order_trigger, time_in_force, idlDecimal2, idlDecimal3, idlDecimal4, order_state, ref_id, created_at, updated_at, order_executions, z, employee_alias, account_number, orderEnteredReasonDto, moneyDto, fees, orderCancelReasonDto, orderRejectReasonDto, moneyDto2, moneyDto3, str, str2, bool, positionEffectDto, str3, str4, str5, str6, realizedPnlForOrderDto, derived_state, idlDecimal5, moneyDto4, instant, str7));
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
    }

    public final FuturesOrderDto copy(String order_id, String account_id, List<FuturesOrderLegDto> order_legs, IdlDecimal quantity, IdlDecimal filled_quantity, IdlDecimal max_show, OrderTypeDto order_type, OrderTriggerDto order_trigger, TimeInForceDto time_in_force, IdlDecimal limit_price, IdlDecimal stop_price, IdlDecimal average_price, OrderStateDto order_state, String ref_id, String created_at, String updated_at, List<FuturesOrderExecutionDto> order_executions, boolean route_to_mainst, String employee_alias, String account_number, OrderEnteredReasonDto entered_reason, MoneyDto total_fee, List<FuturesOrderFeeDto> fees, OrderCancelReasonDto cancel_reason, OrderRejectReasonDto reject_reason, MoneyDto total_commission, MoneyDto total_gold_savings, String failed_receipt_override_title, String failed_receipt_override_detail_markdown, Boolean is_auto_send_enabled, PositionEffectDto position_effect_at_placement_time, String rhs_account_number, String symbol, String device_platform, String device_id, RealizedPnlForOrderDto realized_pnl, OrderStateDto derived_state, IdlDecimal opp_side, MoneyDto entered_notional_amount, Instant gtd_expiration_time, String quote_id) {
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
        return new FuturesOrderDto(new Surrogate(order_id, account_id, order_legs, quantity, filled_quantity, max_show, order_type, order_trigger, time_in_force, limit_price, stop_price, average_price, order_state, ref_id, created_at, updated_at, order_executions, route_to_mainst, employee_alias, account_number, entered_reason, total_fee, fees, cancel_reason, reject_reason, total_commission, total_gold_savings, failed_receipt_override_title, failed_receipt_override_detail_markdown, is_auto_send_enabled, position_effect_at_placement_time, rhs_account_number, symbol, device_platform, device_id, realized_pnl, derived_state, opp_side, entered_notional_amount, gtd_expiration_time, quote_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesOrder toProto() {
        String order_id = this.surrogate.getOrder_id();
        String account_id = this.surrogate.getAccount_id();
        List<FuturesOrderLegDto> order_legs = this.surrogate.getOrder_legs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_legs, 10));
        Iterator<T> it = order_legs.iterator();
        while (it.hasNext()) {
            arrayList.add(((FuturesOrderLegDto) it.next()).toProto());
        }
        String stringValue = this.surrogate.getQuantity().getStringValue();
        String stringValue2 = this.surrogate.getFilled_quantity().getStringValue();
        IdlDecimal max_show = this.surrogate.getMax_show();
        String stringValue3 = max_show != null ? max_show.getStringValue() : null;
        OrderType orderType = (OrderType) this.surrogate.getOrder_type().toProto();
        OrderTrigger orderTrigger = (OrderTrigger) this.surrogate.getOrder_trigger().toProto();
        TimeInForce timeInForce = (TimeInForce) this.surrogate.getTime_in_force().toProto();
        IdlDecimal limit_price = this.surrogate.getLimit_price();
        String stringValue4 = limit_price != null ? limit_price.getStringValue() : null;
        IdlDecimal stop_price = this.surrogate.getStop_price();
        String stringValue5 = stop_price != null ? stop_price.getStringValue() : null;
        IdlDecimal average_price = this.surrogate.getAverage_price();
        String stringValue6 = average_price != null ? average_price.getStringValue() : null;
        OrderState orderState = (OrderState) this.surrogate.getOrder_state().toProto();
        String ref_id = this.surrogate.getRef_id();
        String created_at = this.surrogate.getCreated_at();
        String str = stringValue3;
        String updated_at = this.surrogate.getUpdated_at();
        List<FuturesOrderExecutionDto> order_executions = this.surrogate.getOrder_executions();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_executions, 10));
        Iterator<T> it2 = order_executions.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FuturesOrderExecutionDto) it2.next()).toProto());
        }
        boolean route_to_mainst = this.surrogate.getRoute_to_mainst();
        String employee_alias = this.surrogate.getEmployee_alias();
        String account_number = this.surrogate.getAccount_number();
        OrderEnteredReasonDto entered_reason = this.surrogate.getEntered_reason();
        OrderEnteredReason orderEnteredReason = entered_reason != null ? (OrderEnteredReason) entered_reason.toProto() : null;
        MoneyDto total_fee = this.surrogate.getTotal_fee();
        Money proto = total_fee != null ? total_fee.toProto() : null;
        List<FuturesOrderFeeDto> fees = this.surrogate.getFees();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(fees, 10));
        Iterator<T> it3 = fees.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((FuturesOrderFeeDto) it3.next()).toProto());
        }
        OrderCancelReasonDto cancel_reason = this.surrogate.getCancel_reason();
        OrderCancelReason orderCancelReason = cancel_reason != null ? (OrderCancelReason) cancel_reason.toProto() : null;
        OrderRejectReasonDto reject_reason = this.surrogate.getReject_reason();
        OrderRejectReason orderRejectReason = reject_reason != null ? (OrderRejectReason) reject_reason.toProto() : null;
        OrderCancelReason orderCancelReason2 = orderCancelReason;
        MoneyDto total_commission = this.surrogate.getTotal_commission();
        Money proto2 = total_commission != null ? total_commission.toProto() : null;
        MoneyDto total_gold_savings = this.surrogate.getTotal_gold_savings();
        Money proto3 = total_gold_savings != null ? total_gold_savings.toProto() : null;
        String failed_receipt_override_title = this.surrogate.getFailed_receipt_override_title();
        String failed_receipt_override_detail_markdown = this.surrogate.getFailed_receipt_override_detail_markdown();
        Boolean boolIs_auto_send_enabled = this.surrogate.is_auto_send_enabled();
        PositionEffectDto position_effect_at_placement_time = this.surrogate.getPosition_effect_at_placement_time();
        PositionEffect positionEffect = position_effect_at_placement_time != null ? (PositionEffect) position_effect_at_placement_time.toProto() : null;
        String rhs_account_number = this.surrogate.getRhs_account_number();
        String symbol = this.surrogate.getSymbol();
        String device_platform = this.surrogate.getDevice_platform();
        String device_id = this.surrogate.getDevice_id();
        RealizedPnlForOrderDto realized_pnl = this.surrogate.getRealized_pnl();
        RealizedPnlForOrder proto4 = realized_pnl != null ? realized_pnl.toProto() : null;
        OrderState orderState2 = (OrderState) this.surrogate.getDerived_state().toProto();
        IdlDecimal opp_side = this.surrogate.getOpp_side();
        String stringValue7 = opp_side != null ? opp_side.getStringValue() : null;
        MoneyDto entered_notional_amount = this.surrogate.getEntered_notional_amount();
        return new FuturesOrder(order_id, account_id, arrayList, stringValue, stringValue2, str, orderType, orderTrigger, timeInForce, stringValue4, stringValue5, stringValue6, orderState, ref_id, created_at, updated_at, arrayList2, route_to_mainst, employee_alias, account_number, orderEnteredReason, proto, arrayList3, orderCancelReason2, orderRejectReason, proto2, proto3, failed_receipt_override_title, failed_receipt_override_detail_markdown, boolIs_auto_send_enabled, positionEffect, rhs_account_number, symbol, device_platform, device_id, proto4, orderState2, stringValue7, entered_notional_amount != null ? entered_notional_amount.toProto() : null, this.surrogate.getGtd_expiration_time(), this.surrogate.getQuote_id(), null, 0, 512, null);
    }

    public String toString() {
        return "[FuturesOrderDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesOrderDto) && Intrinsics.areEqual(((FuturesOrderDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FuturesOrderDto.kt */
    @Metadata(m3635d1 = {"\u0000¹\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0003\b©\u0001\b\u0083\b\u0018\u0000 ö\u00012\u00020\u0001:\u0004÷\u0001ö\u0001Bî\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0017\b\u0002\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0019\b\u0002\u0010\u000e\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0019\b\u0002\u0010\u0015\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0019\b\u0002\u0010\u0016\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0019\b\u0002\u0010\u0017\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0005\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0005\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\b\b\u0002\u0010:\u001a\u00020\u0018\u0012\u0019\b\u0002\u0010;\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010%\u0012.\b\u0002\u0010@\u001a(\u0018\u00010=j\u0013\u0018\u0001`>¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0?¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0?\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bB\u0010CBÍ\u0003\b\u0010\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010F\u001a\u00020D\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0005\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0005\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010-\u001a\u0004\u0018\u00010%\u0012\b\u0010.\u001a\u0004\u0018\u00010%\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\u00101\u001a\u0004\u0018\u00010\u001f\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\u00106\u001a\u0004\u0018\u00010\u0002\u0012\b\u00107\u001a\u0004\u0018\u00010\u0002\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010;\u001a\u0004\u0018\u00010\b\u0012\b\u0010<\u001a\u0004\u0018\u00010%\u0012\b\u0010@\u001a\u0004\u0018\u00010=\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010H\u001a\u0004\u0018\u00010G¢\u0006\u0004\bB\u0010IJ'\u0010R\u001a\u00020O2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bP\u0010QJ\u0010\u0010S\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bU\u0010TJ\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u001f\u0010X\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bX\u0010YJ\u001f\u0010Z\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bZ\u0010YJ!\u0010[\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b[\u0010YJ\u0010\u0010\\\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b`\u0010aJ!\u0010b\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bb\u0010YJ!\u0010c\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bc\u0010YJ!\u0010d\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\bd\u0010YJ\u0010\u0010e\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bg\u0010TJ\u0010\u0010h\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bh\u0010TJ\u0010\u0010i\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bi\u0010TJ\u0016\u0010j\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0005HÆ\u0003¢\u0006\u0004\bj\u0010WJ\u0010\u0010k\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bk\u0010lJ\u0010\u0010m\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bm\u0010TJ\u0010\u0010n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bn\u0010TJ\u0012\u0010o\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bo\u0010pJ\u0012\u0010q\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bq\u0010rJ\u0016\u0010s\u001a\b\u0012\u0004\u0012\u00020'0\u0005HÆ\u0003¢\u0006\u0004\bs\u0010WJ\u0012\u0010t\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bt\u0010uJ\u0012\u0010v\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bv\u0010wJ\u0012\u0010x\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bx\u0010rJ\u0012\u0010y\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\by\u0010rJ\u0012\u0010z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bz\u0010TJ\u0012\u0010{\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b{\u0010TJ\u0012\u0010|\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b|\u0010}J\u0012\u0010~\u001a\u0004\u0018\u000102HÆ\u0003¢\u0006\u0004\b~\u0010\u007fJ\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0080\u0001\u0010TJ\u0014\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0081\u0001\u0010TJ\u0014\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0082\u0001\u0010TJ\u0014\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u0083\u0001\u0010TJ\u0015\u0010\u0084\u0001\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0012\u0010\u0086\u0001\u001a\u00020\u0018HÆ\u0003¢\u0006\u0005\b\u0086\u0001\u0010fJ#\u0010\u0087\u0001\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0005\b\u0087\u0001\u0010YJ\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0005\b\u0088\u0001\u0010rJ9\u0010\u0089\u0001\u001a(\u0018\u00010=j\u0013\u0018\u0001`>¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0?¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0?HÆ\u0003¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0014\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0005\b\u008b\u0001\u0010TJú\u0004\u0010\u008c\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0017\b\u0002\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\r\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\u0019\b\u0002\u0010\u000e\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0019\b\u0002\u0010\u0015\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\u0019\b\u0002\u0010\u0016\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\u0019\b\u0002\u0010\u0017\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00052\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\b\b\u0002\u0010:\u001a\u00020\u00182\u0019\b\u0002\u0010;\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010%2.\b\u0002\u0010@\u001a(\u0018\u00010=j\u0013\u0018\u0001`>¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0?¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0?2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0012\u0010\u008e\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0005\b\u008e\u0001\u0010TJ\u0013\u0010\u008f\u0001\u001a\u00020DHÖ\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001e\u0010\u0092\u0001\u001a\u00020\u001f2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001R$\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0003\u0010\u0094\u0001\u0012\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0005\b\u0095\u0001\u0010TR$\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0004\u0010\u0094\u0001\u0012\u0006\b\u0099\u0001\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010TR*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0007\u0010\u009a\u0001\u0012\u0006\b\u009c\u0001\u0010\u0097\u0001\u001a\u0005\b\u009b\u0001\u0010WR3\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\f\u0010\u009d\u0001\u0012\u0006\b\u009f\u0001\u0010\u0097\u0001\u001a\u0005\b\u009e\u0001\u0010YR3\u0010\r\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\r\u0010\u009d\u0001\u0012\u0006\b¡\u0001\u0010\u0097\u0001\u001a\u0005\b \u0001\u0010YR5\u0010\u000e\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000e\u0010\u009d\u0001\u0012\u0006\b£\u0001\u0010\u0097\u0001\u001a\u0005\b¢\u0001\u0010YR$\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0010\u0010¤\u0001\u0012\u0006\b¦\u0001\u0010\u0097\u0001\u001a\u0005\b¥\u0001\u0010]R$\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0012\u0010§\u0001\u0012\u0006\b©\u0001\u0010\u0097\u0001\u001a\u0005\b¨\u0001\u0010_R$\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0014\u0010ª\u0001\u0012\u0006\b¬\u0001\u0010\u0097\u0001\u001a\u0005\b«\u0001\u0010aR5\u0010\u0015\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0015\u0010\u009d\u0001\u0012\u0006\b®\u0001\u0010\u0097\u0001\u001a\u0005\b\u00ad\u0001\u0010YR5\u0010\u0016\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0016\u0010\u009d\u0001\u0012\u0006\b°\u0001\u0010\u0097\u0001\u001a\u0005\b¯\u0001\u0010YR5\u0010\u0017\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0017\u0010\u009d\u0001\u0012\u0006\b²\u0001\u0010\u0097\u0001\u001a\u0005\b±\u0001\u0010YR$\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0019\u0010³\u0001\u0012\u0006\bµ\u0001\u0010\u0097\u0001\u001a\u0005\b´\u0001\u0010fR$\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001a\u0010\u0094\u0001\u0012\u0006\b·\u0001\u0010\u0097\u0001\u001a\u0005\b¶\u0001\u0010TR$\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001b\u0010\u0094\u0001\u0012\u0006\b¹\u0001\u0010\u0097\u0001\u001a\u0005\b¸\u0001\u0010TR$\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001c\u0010\u0094\u0001\u0012\u0006\b»\u0001\u0010\u0097\u0001\u001a\u0005\bº\u0001\u0010TR*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001e\u0010\u009a\u0001\u0012\u0006\b½\u0001\u0010\u0097\u0001\u001a\u0005\b¼\u0001\u0010WR$\u0010 \u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b \u0010¾\u0001\u0012\u0006\bÀ\u0001\u0010\u0097\u0001\u001a\u0005\b¿\u0001\u0010lR$\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b!\u0010\u0094\u0001\u0012\u0006\bÂ\u0001\u0010\u0097\u0001\u001a\u0005\bÁ\u0001\u0010TR$\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\"\u0010\u0094\u0001\u0012\u0006\bÄ\u0001\u0010\u0097\u0001\u001a\u0005\bÃ\u0001\u0010TR&\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b$\u0010Å\u0001\u0012\u0006\bÇ\u0001\u0010\u0097\u0001\u001a\u0005\bÆ\u0001\u0010pR&\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b&\u0010È\u0001\u0012\u0006\bÊ\u0001\u0010\u0097\u0001\u001a\u0005\bÉ\u0001\u0010rR*\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00058\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b(\u0010\u009a\u0001\u0012\u0006\bÌ\u0001\u0010\u0097\u0001\u001a\u0005\bË\u0001\u0010WR&\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b*\u0010Í\u0001\u0012\u0006\bÏ\u0001\u0010\u0097\u0001\u001a\u0005\bÎ\u0001\u0010uR&\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b,\u0010Ð\u0001\u0012\u0006\bÒ\u0001\u0010\u0097\u0001\u001a\u0005\bÑ\u0001\u0010wR&\u0010-\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b-\u0010È\u0001\u0012\u0006\bÔ\u0001\u0010\u0097\u0001\u001a\u0005\bÓ\u0001\u0010rR&\u0010.\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b.\u0010È\u0001\u0012\u0006\bÖ\u0001\u0010\u0097\u0001\u001a\u0005\bÕ\u0001\u0010rR&\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b/\u0010\u0094\u0001\u0012\u0006\bØ\u0001\u0010\u0097\u0001\u001a\u0005\b×\u0001\u0010TR&\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b0\u0010\u0094\u0001\u0012\u0006\bÚ\u0001\u0010\u0097\u0001\u001a\u0005\bÙ\u0001\u0010TR%\u00101\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b1\u0010Û\u0001\u0012\u0006\bÜ\u0001\u0010\u0097\u0001\u001a\u0004\b1\u0010}R&\u00103\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b3\u0010Ý\u0001\u0012\u0006\bß\u0001\u0010\u0097\u0001\u001a\u0005\bÞ\u0001\u0010\u007fR&\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b4\u0010\u0094\u0001\u0012\u0006\bá\u0001\u0010\u0097\u0001\u001a\u0005\bà\u0001\u0010TR&\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b5\u0010\u0094\u0001\u0012\u0006\bã\u0001\u0010\u0097\u0001\u001a\u0005\bâ\u0001\u0010TR&\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b6\u0010\u0094\u0001\u0012\u0006\bå\u0001\u0010\u0097\u0001\u001a\u0005\bä\u0001\u0010TR&\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b7\u0010\u0094\u0001\u0012\u0006\bç\u0001\u0010\u0097\u0001\u001a\u0005\bæ\u0001\u0010TR'\u00109\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b9\u0010è\u0001\u0012\u0006\bê\u0001\u0010\u0097\u0001\u001a\u0006\bé\u0001\u0010\u0085\u0001R$\u0010:\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b:\u0010³\u0001\u0012\u0006\bì\u0001\u0010\u0097\u0001\u001a\u0005\bë\u0001\u0010fR5\u0010;\u001a\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b;\u0010\u009d\u0001\u0012\u0006\bî\u0001\u0010\u0097\u0001\u001a\u0005\bí\u0001\u0010YR&\u0010<\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b<\u0010È\u0001\u0012\u0006\bð\u0001\u0010\u0097\u0001\u001a\u0005\bï\u0001\u0010rRK\u0010@\u001a(\u0018\u00010=j\u0013\u0018\u0001`>¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0?¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0?8\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b@\u0010ñ\u0001\u0012\u0006\bó\u0001\u0010\u0097\u0001\u001a\u0006\bò\u0001\u0010\u008a\u0001R&\u0010A\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bA\u0010\u0094\u0001\u0012\u0006\bõ\u0001\u0010\u0097\u0001\u001a\u0005\bô\u0001\u0010T¨\u0006ø\u0001"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderDto$Surrogate;", "", "", "order_id", "account_id", "", "Lcom/robinhood/ceres/v1/FuturesOrderLegDto;", "order_legs", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quantity", "filled_quantity", "max_show", "Lrosetta/mainst/OrderTypeDto;", "order_type", "Lrosetta/mainst/OrderTriggerDto;", "order_trigger", "Lrosetta/mainst/TimeInForceDto;", "time_in_force", "limit_price", "stop_price", "average_price", "Lrosetta/mainst/OrderStateDto;", "order_state", "ref_id", "created_at", "updated_at", "Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto;", "order_executions", "", "route_to_mainst", "employee_alias", "account_number", "Lcom/robinhood/ceres/v1/OrderEnteredReasonDto;", "entered_reason", "Lcom/robinhood/rosetta/common/MoneyDto;", "total_fee", "Lcom/robinhood/ceres/v1/FuturesOrderFeeDto;", "fees", "Lcom/robinhood/ceres/v1/OrderCancelReasonDto;", "cancel_reason", "Lcom/robinhood/ceres/v1/OrderRejectReasonDto;", "reject_reason", "total_commission", "total_gold_savings", "failed_receipt_override_title", "failed_receipt_override_detail_markdown", "is_auto_send_enabled", "Lcom/robinhood/ceres/v1/PositionEffectDto;", "position_effect_at_placement_time", "rhs_account_number", "symbol", "device_platform", "device_id", "Lcom/robinhood/ceres/v1/RealizedPnlForOrderDto;", "realized_pnl", "derived_state", "opp_side", "entered_notional_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "gtd_expiration_time", "quote_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderStateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderEnteredReasonDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lcom/robinhood/ceres/v1/OrderCancelReasonDto;Lcom/robinhood/ceres/v1/OrderRejectReasonDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/PositionEffectDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/RealizedPnlForOrderDto;Lrosetta/mainst/OrderStateDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;)V", "", "seen0", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderStateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderEnteredReasonDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lcom/robinhood/ceres/v1/OrderCancelReasonDto;Lcom/robinhood/ceres/v1/OrderRejectReasonDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/PositionEffectDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/RealizedPnlForOrderDto;Lrosetta/mainst/OrderStateDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ceres_entity_v1_externalRelease", "(Lcom/robinhood/ceres/v1/FuturesOrderDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/robinhood/idl/IdlDecimal;", "component5", "component6", "component7", "()Lrosetta/mainst/OrderTypeDto;", "component8", "()Lrosetta/mainst/OrderTriggerDto;", "component9", "()Lrosetta/mainst/TimeInForceDto;", "component10", "component11", "component12", "component13", "()Lrosetta/mainst/OrderStateDto;", "component14", "component15", "component16", "component17", "component18", "()Z", "component19", "component20", "component21", "()Lcom/robinhood/ceres/v1/OrderEnteredReasonDto;", "component22", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component23", "component24", "()Lcom/robinhood/ceres/v1/OrderCancelReasonDto;", "component25", "()Lcom/robinhood/ceres/v1/OrderRejectReasonDto;", "component26", "component27", "component28", "component29", "component30", "()Ljava/lang/Boolean;", "component31", "()Lcom/robinhood/ceres/v1/PositionEffectDto;", "component32", "component33", "component34", "component35", "component36", "()Lcom/robinhood/ceres/v1/RealizedPnlForOrderDto;", "component37", "component38", "component39", "component40", "()Lj$/time/Instant;", "component41", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderStateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderEnteredReasonDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lcom/robinhood/ceres/v1/OrderCancelReasonDto;Lcom/robinhood/ceres/v1/OrderRejectReasonDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/PositionEffectDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/RealizedPnlForOrderDto;Lrosetta/mainst/OrderStateDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;)Lcom/robinhood/ceres/v1/FuturesOrderDto$Surrogate;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrder_id", "getOrder_id$annotations", "()V", "getAccount_id", "getAccount_id$annotations", "Ljava/util/List;", "getOrder_legs", "getOrder_legs$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "getQuantity$annotations", "getFilled_quantity", "getFilled_quantity$annotations", "getMax_show", "getMax_show$annotations", "Lrosetta/mainst/OrderTypeDto;", "getOrder_type", "getOrder_type$annotations", "Lrosetta/mainst/OrderTriggerDto;", "getOrder_trigger", "getOrder_trigger$annotations", "Lrosetta/mainst/TimeInForceDto;", "getTime_in_force", "getTime_in_force$annotations", "getLimit_price", "getLimit_price$annotations", "getStop_price", "getStop_price$annotations", "getAverage_price", "getAverage_price$annotations", "Lrosetta/mainst/OrderStateDto;", "getOrder_state", "getOrder_state$annotations", "getRef_id", "getRef_id$annotations", "getCreated_at", "getCreated_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "getOrder_executions", "getOrder_executions$annotations", "Z", "getRoute_to_mainst", "getRoute_to_mainst$annotations", "getEmployee_alias", "getEmployee_alias$annotations", "getAccount_number", "getAccount_number$annotations", "Lcom/robinhood/ceres/v1/OrderEnteredReasonDto;", "getEntered_reason", "getEntered_reason$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getTotal_fee", "getTotal_fee$annotations", "getFees", "getFees$annotations", "Lcom/robinhood/ceres/v1/OrderCancelReasonDto;", "getCancel_reason", "getCancel_reason$annotations", "Lcom/robinhood/ceres/v1/OrderRejectReasonDto;", "getReject_reason", "getReject_reason$annotations", "getTotal_commission", "getTotal_commission$annotations", "getTotal_gold_savings", "getTotal_gold_savings$annotations", "getFailed_receipt_override_title", "getFailed_receipt_override_title$annotations", "getFailed_receipt_override_detail_markdown", "getFailed_receipt_override_detail_markdown$annotations", "Ljava/lang/Boolean;", "is_auto_send_enabled$annotations", "Lcom/robinhood/ceres/v1/PositionEffectDto;", "getPosition_effect_at_placement_time", "getPosition_effect_at_placement_time$annotations", "getRhs_account_number", "getRhs_account_number$annotations", "getSymbol", "getSymbol$annotations", "getDevice_platform", "getDevice_platform$annotations", "getDevice_id", "getDevice_id$annotations", "Lcom/robinhood/ceres/v1/RealizedPnlForOrderDto;", "getRealized_pnl", "getRealized_pnl$annotations", "getDerived_state", "getDerived_state$annotations", "getOpp_side", "getOpp_side$annotations", "getEntered_notional_amount", "getEntered_notional_amount$annotations", "Lj$/time/Instant;", "getGtd_expiration_time", "getGtd_expiration_time$annotations", "getQuote_id", "getQuote_id$annotations", "Companion", "$serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final String account_number;
        private final IdlDecimal average_price;
        private final OrderCancelReasonDto cancel_reason;
        private final String created_at;
        private final OrderStateDto derived_state;
        private final String device_id;
        private final String device_platform;
        private final String employee_alias;
        private final MoneyDto entered_notional_amount;
        private final OrderEnteredReasonDto entered_reason;
        private final String failed_receipt_override_detail_markdown;
        private final String failed_receipt_override_title;
        private final List<FuturesOrderFeeDto> fees;
        private final IdlDecimal filled_quantity;
        private final Instant gtd_expiration_time;
        private final Boolean is_auto_send_enabled;
        private final IdlDecimal limit_price;
        private final IdlDecimal max_show;
        private final IdlDecimal opp_side;
        private final List<FuturesOrderExecutionDto> order_executions;
        private final String order_id;
        private final List<FuturesOrderLegDto> order_legs;
        private final OrderStateDto order_state;
        private final OrderTriggerDto order_trigger;
        private final OrderTypeDto order_type;
        private final PositionEffectDto position_effect_at_placement_time;
        private final IdlDecimal quantity;
        private final String quote_id;
        private final RealizedPnlForOrderDto realized_pnl;
        private final String ref_id;
        private final OrderRejectReasonDto reject_reason;
        private final String rhs_account_number;
        private final boolean route_to_mainst;
        private final IdlDecimal stop_price;
        private final String symbol;
        private final TimeInForceDto time_in_force;
        private final MoneyDto total_commission;
        private final MoneyDto total_fee;
        private final MoneyDto total_gold_savings;
        private final String updated_at;

        public Surrogate() {
            this((String) null, (String) null, (List) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (OrderTypeDto) null, (OrderTriggerDto) null, (TimeInForceDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (OrderStateDto) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, (String) null, (OrderEnteredReasonDto) null, (MoneyDto) null, (List) null, (OrderCancelReasonDto) null, (OrderRejectReasonDto) null, (MoneyDto) null, (MoneyDto) null, (String) null, (String) null, (Boolean) null, (PositionEffectDto) null, (String) null, (String) null, (String) null, (String) null, (RealizedPnlForOrderDto) null, (OrderStateDto) null, (IdlDecimal) null, (MoneyDto) null, (Instant) null, (String) null, -1, 511, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(FuturesOrderLegDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(FuturesOrderExecutionDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(FuturesOrderFeeDto.Serializer.INSTANCE);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("averagePrice")
        @JsonAnnotations2(names = {"average_price"})
        public static /* synthetic */ void getAverage_price$annotations() {
        }

        @SerialName("cancelReason")
        @JsonAnnotations2(names = {"cancel_reason"})
        public static /* synthetic */ void getCancel_reason$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("derivedState")
        @JsonAnnotations2(names = {"derived_state"})
        public static /* synthetic */ void getDerived_state$annotations() {
        }

        @SerialName(CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID)
        @JsonAnnotations2(names = {"device_id"})
        public static /* synthetic */ void getDevice_id$annotations() {
        }

        @SerialName("devicePlatform")
        @JsonAnnotations2(names = {"device_platform"})
        public static /* synthetic */ void getDevice_platform$annotations() {
        }

        @SerialName("employeeAlias")
        @JsonAnnotations2(names = {"employee_alias"})
        public static /* synthetic */ void getEmployee_alias$annotations() {
        }

        @SerialName("enteredNotionalAmount")
        @JsonAnnotations2(names = {"entered_notional_amount"})
        public static /* synthetic */ void getEntered_notional_amount$annotations() {
        }

        @SerialName("enteredReason")
        @JsonAnnotations2(names = {"entered_reason"})
        public static /* synthetic */ void getEntered_reason$annotations() {
        }

        @SerialName("failed_receipt_override_detail_markdown")
        @JsonAnnotations2(names = {"failed_receipt_override_detail_markdown"})
        public static /* synthetic */ void getFailed_receipt_override_detail_markdown$annotations() {
        }

        @SerialName("failed_receipt_override_title")
        @JsonAnnotations2(names = {"failed_receipt_override_title"})
        public static /* synthetic */ void getFailed_receipt_override_title$annotations() {
        }

        @SerialName("fees")
        @JsonAnnotations2(names = {"fees"})
        public static /* synthetic */ void getFees$annotations() {
        }

        @SerialName("filledQuantity")
        @JsonAnnotations2(names = {"filled_quantity"})
        public static /* synthetic */ void getFilled_quantity$annotations() {
        }

        @SerialName("gtdExpirationTime")
        @JsonAnnotations2(names = {"gtd_expiration_time"})
        public static /* synthetic */ void getGtd_expiration_time$annotations() {
        }

        @SerialName("limitPrice")
        @JsonAnnotations2(names = {"limit_price"})
        public static /* synthetic */ void getLimit_price$annotations() {
        }

        @SerialName("maxShow")
        @JsonAnnotations2(names = {"max_show"})
        public static /* synthetic */ void getMax_show$annotations() {
        }

        @SerialName("oppSide")
        @JsonAnnotations2(names = {"opp_side"})
        public static /* synthetic */ void getOpp_side$annotations() {
        }

        @SerialName("orderExecutions")
        @JsonAnnotations2(names = {"order_executions"})
        public static /* synthetic */ void getOrder_executions$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName("orderLegs")
        @JsonAnnotations2(names = {"order_legs"})
        public static /* synthetic */ void getOrder_legs$annotations() {
        }

        @SerialName("orderState")
        @JsonAnnotations2(names = {"order_state"})
        public static /* synthetic */ void getOrder_state$annotations() {
        }

        @SerialName("orderTrigger")
        @JsonAnnotations2(names = {"order_trigger"})
        public static /* synthetic */ void getOrder_trigger$annotations() {
        }

        @SerialName("orderType")
        @JsonAnnotations2(names = {"order_type"})
        public static /* synthetic */ void getOrder_type$annotations() {
        }

        @SerialName("positionEffectAtPlacementTime")
        @JsonAnnotations2(names = {"position_effect_at_placement_time"})
        public static /* synthetic */ void getPosition_effect_at_placement_time$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("quoteId")
        @JsonAnnotations2(names = {"quote_id"})
        public static /* synthetic */ void getQuote_id$annotations() {
        }

        @SerialName("realizedPnl")
        @JsonAnnotations2(names = {"realized_pnl"})
        public static /* synthetic */ void getRealized_pnl$annotations() {
        }

        @SerialName("refId")
        @JsonAnnotations2(names = {"ref_id"})
        public static /* synthetic */ void getRef_id$annotations() {
        }

        @SerialName("rejectReason")
        @JsonAnnotations2(names = {"reject_reason"})
        public static /* synthetic */ void getReject_reason$annotations() {
        }

        @SerialName("rhsAccountNumber")
        @JsonAnnotations2(names = {"rhs_account_number"})
        public static /* synthetic */ void getRhs_account_number$annotations() {
        }

        @SerialName("routeToMainst")
        @JsonAnnotations2(names = {"route_to_mainst"})
        public static /* synthetic */ void getRoute_to_mainst$annotations() {
        }

        @SerialName("stopPrice")
        @JsonAnnotations2(names = {"stop_price"})
        public static /* synthetic */ void getStop_price$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("timeInForce")
        @JsonAnnotations2(names = {"time_in_force"})
        public static /* synthetic */ void getTime_in_force$annotations() {
        }

        @SerialName("totalCommission")
        @JsonAnnotations2(names = {"total_commission"})
        public static /* synthetic */ void getTotal_commission$annotations() {
        }

        @SerialName("totalFee")
        @JsonAnnotations2(names = {"total_fee"})
        public static /* synthetic */ void getTotal_fee$annotations() {
        }

        @SerialName("totalGoldSavings")
        @JsonAnnotations2(names = {"total_gold_savings"})
        public static /* synthetic */ void getTotal_gold_savings$annotations() {
        }

        @SerialName("updatedAt")
        @JsonAnnotations2(names = {"updated_at"})
        public static /* synthetic */ void getUpdated_at$annotations() {
        }

        @SerialName("isAutoSendEnabled")
        @JsonAnnotations2(names = {"is_auto_send_enabled"})
        public static /* synthetic */ void is_auto_send_enabled$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component10, reason: from getter */
        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }

        /* renamed from: component11, reason: from getter */
        public final IdlDecimal getStop_price() {
            return this.stop_price;
        }

        /* renamed from: component12, reason: from getter */
        public final IdlDecimal getAverage_price() {
            return this.average_price;
        }

        /* renamed from: component13, reason: from getter */
        public final OrderStateDto getOrder_state() {
            return this.order_state;
        }

        /* renamed from: component14, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component15, reason: from getter */
        public final String getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component16, reason: from getter */
        public final String getUpdated_at() {
            return this.updated_at;
        }

        public final List<FuturesOrderExecutionDto> component17() {
            return this.order_executions;
        }

        /* renamed from: component18, reason: from getter */
        public final boolean getRoute_to_mainst() {
            return this.route_to_mainst;
        }

        /* renamed from: component19, reason: from getter */
        public final String getEmployee_alias() {
            return this.employee_alias;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component20, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component21, reason: from getter */
        public final OrderEnteredReasonDto getEntered_reason() {
            return this.entered_reason;
        }

        /* renamed from: component22, reason: from getter */
        public final MoneyDto getTotal_fee() {
            return this.total_fee;
        }

        public final List<FuturesOrderFeeDto> component23() {
            return this.fees;
        }

        /* renamed from: component24, reason: from getter */
        public final OrderCancelReasonDto getCancel_reason() {
            return this.cancel_reason;
        }

        /* renamed from: component25, reason: from getter */
        public final OrderRejectReasonDto getReject_reason() {
            return this.reject_reason;
        }

        /* renamed from: component26, reason: from getter */
        public final MoneyDto getTotal_commission() {
            return this.total_commission;
        }

        /* renamed from: component27, reason: from getter */
        public final MoneyDto getTotal_gold_savings() {
            return this.total_gold_savings;
        }

        /* renamed from: component28, reason: from getter */
        public final String getFailed_receipt_override_title() {
            return this.failed_receipt_override_title;
        }

        /* renamed from: component29, reason: from getter */
        public final String getFailed_receipt_override_detail_markdown() {
            return this.failed_receipt_override_detail_markdown;
        }

        public final List<FuturesOrderLegDto> component3() {
            return this.order_legs;
        }

        /* renamed from: component30, reason: from getter */
        public final Boolean getIs_auto_send_enabled() {
            return this.is_auto_send_enabled;
        }

        /* renamed from: component31, reason: from getter */
        public final PositionEffectDto getPosition_effect_at_placement_time() {
            return this.position_effect_at_placement_time;
        }

        /* renamed from: component32, reason: from getter */
        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        /* renamed from: component33, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component34, reason: from getter */
        public final String getDevice_platform() {
            return this.device_platform;
        }

        /* renamed from: component35, reason: from getter */
        public final String getDevice_id() {
            return this.device_id;
        }

        /* renamed from: component36, reason: from getter */
        public final RealizedPnlForOrderDto getRealized_pnl() {
            return this.realized_pnl;
        }

        /* renamed from: component37, reason: from getter */
        public final OrderStateDto getDerived_state() {
            return this.derived_state;
        }

        /* renamed from: component38, reason: from getter */
        public final IdlDecimal getOpp_side() {
            return this.opp_side;
        }

        /* renamed from: component39, reason: from getter */
        public final MoneyDto getEntered_notional_amount() {
            return this.entered_notional_amount;
        }

        /* renamed from: component4, reason: from getter */
        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component40, reason: from getter */
        public final Instant getGtd_expiration_time() {
            return this.gtd_expiration_time;
        }

        /* renamed from: component41, reason: from getter */
        public final String getQuote_id() {
            return this.quote_id;
        }

        /* renamed from: component5, reason: from getter */
        public final IdlDecimal getFilled_quantity() {
            return this.filled_quantity;
        }

        /* renamed from: component6, reason: from getter */
        public final IdlDecimal getMax_show() {
            return this.max_show;
        }

        /* renamed from: component7, reason: from getter */
        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        /* renamed from: component8, reason: from getter */
        public final OrderTriggerDto getOrder_trigger() {
            return this.order_trigger;
        }

        /* renamed from: component9, reason: from getter */
        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        public final Surrogate copy(String order_id, String account_id, List<FuturesOrderLegDto> order_legs, IdlDecimal quantity, IdlDecimal filled_quantity, IdlDecimal max_show, OrderTypeDto order_type, OrderTriggerDto order_trigger, TimeInForceDto time_in_force, IdlDecimal limit_price, IdlDecimal stop_price, IdlDecimal average_price, OrderStateDto order_state, String ref_id, String created_at, String updated_at, List<FuturesOrderExecutionDto> order_executions, boolean route_to_mainst, String employee_alias, String account_number, OrderEnteredReasonDto entered_reason, MoneyDto total_fee, List<FuturesOrderFeeDto> fees, OrderCancelReasonDto cancel_reason, OrderRejectReasonDto reject_reason, MoneyDto total_commission, MoneyDto total_gold_savings, String failed_receipt_override_title, String failed_receipt_override_detail_markdown, Boolean is_auto_send_enabled, PositionEffectDto position_effect_at_placement_time, String rhs_account_number, String symbol, String device_platform, String device_id, RealizedPnlForOrderDto realized_pnl, OrderStateDto derived_state, IdlDecimal opp_side, MoneyDto entered_notional_amount, Instant gtd_expiration_time, String quote_id) {
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
            return new Surrogate(order_id, account_id, order_legs, quantity, filled_quantity, max_show, order_type, order_trigger, time_in_force, limit_price, stop_price, average_price, order_state, ref_id, created_at, updated_at, order_executions, route_to_mainst, employee_alias, account_number, entered_reason, total_fee, fees, cancel_reason, reject_reason, total_commission, total_gold_savings, failed_receipt_override_title, failed_receipt_override_detail_markdown, is_auto_send_enabled, position_effect_at_placement_time, rhs_account_number, symbol, device_platform, device_id, realized_pnl, derived_state, opp_side, entered_notional_amount, gtd_expiration_time, quote_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.order_legs, surrogate.order_legs) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.filled_quantity, surrogate.filled_quantity) && Intrinsics.areEqual(this.max_show, surrogate.max_show) && this.order_type == surrogate.order_type && this.order_trigger == surrogate.order_trigger && this.time_in_force == surrogate.time_in_force && Intrinsics.areEqual(this.limit_price, surrogate.limit_price) && Intrinsics.areEqual(this.stop_price, surrogate.stop_price) && Intrinsics.areEqual(this.average_price, surrogate.average_price) && this.order_state == surrogate.order_state && Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.order_executions, surrogate.order_executions) && this.route_to_mainst == surrogate.route_to_mainst && Intrinsics.areEqual(this.employee_alias, surrogate.employee_alias) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.entered_reason == surrogate.entered_reason && Intrinsics.areEqual(this.total_fee, surrogate.total_fee) && Intrinsics.areEqual(this.fees, surrogate.fees) && this.cancel_reason == surrogate.cancel_reason && this.reject_reason == surrogate.reject_reason && Intrinsics.areEqual(this.total_commission, surrogate.total_commission) && Intrinsics.areEqual(this.total_gold_savings, surrogate.total_gold_savings) && Intrinsics.areEqual(this.failed_receipt_override_title, surrogate.failed_receipt_override_title) && Intrinsics.areEqual(this.failed_receipt_override_detail_markdown, surrogate.failed_receipt_override_detail_markdown) && Intrinsics.areEqual(this.is_auto_send_enabled, surrogate.is_auto_send_enabled) && this.position_effect_at_placement_time == surrogate.position_effect_at_placement_time && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.device_platform, surrogate.device_platform) && Intrinsics.areEqual(this.device_id, surrogate.device_id) && Intrinsics.areEqual(this.realized_pnl, surrogate.realized_pnl) && this.derived_state == surrogate.derived_state && Intrinsics.areEqual(this.opp_side, surrogate.opp_side) && Intrinsics.areEqual(this.entered_notional_amount, surrogate.entered_notional_amount) && Intrinsics.areEqual(this.gtd_expiration_time, surrogate.gtd_expiration_time) && Intrinsics.areEqual(this.quote_id, surrogate.quote_id);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.order_id.hashCode() * 31) + this.account_id.hashCode()) * 31) + this.order_legs.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.filled_quantity.hashCode()) * 31;
            IdlDecimal idlDecimal = this.max_show;
            int iHashCode2 = (((((((iHashCode + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31) + this.order_type.hashCode()) * 31) + this.order_trigger.hashCode()) * 31) + this.time_in_force.hashCode()) * 31;
            IdlDecimal idlDecimal2 = this.limit_price;
            int iHashCode3 = (iHashCode2 + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
            IdlDecimal idlDecimal3 = this.stop_price;
            int iHashCode4 = (iHashCode3 + (idlDecimal3 == null ? 0 : idlDecimal3.hashCode())) * 31;
            IdlDecimal idlDecimal4 = this.average_price;
            int iHashCode5 = (((((((((((((((((iHashCode4 + (idlDecimal4 == null ? 0 : idlDecimal4.hashCode())) * 31) + this.order_state.hashCode()) * 31) + this.ref_id.hashCode()) * 31) + this.created_at.hashCode()) * 31) + this.updated_at.hashCode()) * 31) + this.order_executions.hashCode()) * 31) + Boolean.hashCode(this.route_to_mainst)) * 31) + this.employee_alias.hashCode()) * 31) + this.account_number.hashCode()) * 31;
            OrderEnteredReasonDto orderEnteredReasonDto = this.entered_reason;
            int iHashCode6 = (iHashCode5 + (orderEnteredReasonDto == null ? 0 : orderEnteredReasonDto.hashCode())) * 31;
            MoneyDto moneyDto = this.total_fee;
            int iHashCode7 = (((iHashCode6 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.fees.hashCode()) * 31;
            OrderCancelReasonDto orderCancelReasonDto = this.cancel_reason;
            int iHashCode8 = (iHashCode7 + (orderCancelReasonDto == null ? 0 : orderCancelReasonDto.hashCode())) * 31;
            OrderRejectReasonDto orderRejectReasonDto = this.reject_reason;
            int iHashCode9 = (iHashCode8 + (orderRejectReasonDto == null ? 0 : orderRejectReasonDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.total_commission;
            int iHashCode10 = (iHashCode9 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.total_gold_savings;
            int iHashCode11 = (iHashCode10 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            String str = this.failed_receipt_override_title;
            int iHashCode12 = (iHashCode11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.failed_receipt_override_detail_markdown;
            int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.is_auto_send_enabled;
            int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
            PositionEffectDto positionEffectDto = this.position_effect_at_placement_time;
            int iHashCode15 = (iHashCode14 + (positionEffectDto == null ? 0 : positionEffectDto.hashCode())) * 31;
            String str3 = this.rhs_account_number;
            int iHashCode16 = (iHashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.symbol;
            int iHashCode17 = (iHashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.device_platform;
            int iHashCode18 = (iHashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.device_id;
            int iHashCode19 = (iHashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31;
            RealizedPnlForOrderDto realizedPnlForOrderDto = this.realized_pnl;
            int iHashCode20 = (((iHashCode19 + (realizedPnlForOrderDto == null ? 0 : realizedPnlForOrderDto.hashCode())) * 31) + this.derived_state.hashCode()) * 31;
            IdlDecimal idlDecimal5 = this.opp_side;
            int iHashCode21 = (iHashCode20 + (idlDecimal5 == null ? 0 : idlDecimal5.hashCode())) * 31;
            MoneyDto moneyDto4 = this.entered_notional_amount;
            int iHashCode22 = (iHashCode21 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            Instant instant = this.gtd_expiration_time;
            int iHashCode23 = (iHashCode22 + (instant == null ? 0 : instant.hashCode())) * 31;
            String str7 = this.quote_id;
            return iHashCode23 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(order_id=" + this.order_id + ", account_id=" + this.account_id + ", order_legs=" + this.order_legs + ", quantity=" + this.quantity + ", filled_quantity=" + this.filled_quantity + ", max_show=" + this.max_show + ", order_type=" + this.order_type + ", order_trigger=" + this.order_trigger + ", time_in_force=" + this.time_in_force + ", limit_price=" + this.limit_price + ", stop_price=" + this.stop_price + ", average_price=" + this.average_price + ", order_state=" + this.order_state + ", ref_id=" + this.ref_id + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", order_executions=" + this.order_executions + ", route_to_mainst=" + this.route_to_mainst + ", employee_alias=" + this.employee_alias + ", account_number=" + this.account_number + ", entered_reason=" + this.entered_reason + ", total_fee=" + this.total_fee + ", fees=" + this.fees + ", cancel_reason=" + this.cancel_reason + ", reject_reason=" + this.reject_reason + ", total_commission=" + this.total_commission + ", total_gold_savings=" + this.total_gold_savings + ", failed_receipt_override_title=" + this.failed_receipt_override_title + ", failed_receipt_override_detail_markdown=" + this.failed_receipt_override_detail_markdown + ", is_auto_send_enabled=" + this.is_auto_send_enabled + ", position_effect_at_placement_time=" + this.position_effect_at_placement_time + ", rhs_account_number=" + this.rhs_account_number + ", symbol=" + this.symbol + ", device_platform=" + this.device_platform + ", device_id=" + this.device_id + ", realized_pnl=" + this.realized_pnl + ", derived_state=" + this.derived_state + ", opp_side=" + this.opp_side + ", entered_notional_amount=" + this.entered_notional_amount + ", gtd_expiration_time=" + this.gtd_expiration_time + ", quote_id=" + this.quote_id + ")";
        }

        /* compiled from: FuturesOrderDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesOrderDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesOrderDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.ceres.v1.FuturesOrderDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesOrderDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.ceres.v1.FuturesOrderDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesOrderDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.ceres.v1.FuturesOrderDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesOrderDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, int i2, String str, String str2, List list, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, OrderTypeDto orderTypeDto, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, OrderStateDto orderStateDto, String str3, String str4, String str5, List list2, boolean z, String str6, String str7, OrderEnteredReasonDto orderEnteredReasonDto, MoneyDto moneyDto, List list3, OrderCancelReasonDto orderCancelReasonDto, OrderRejectReasonDto orderRejectReasonDto, MoneyDto moneyDto2, MoneyDto moneyDto3, String str8, String str9, Boolean bool, PositionEffectDto positionEffectDto, String str10, String str11, String str12, String str13, RealizedPnlForOrderDto realizedPnlForOrderDto, OrderStateDto orderStateDto2, IdlDecimal idlDecimal7, MoneyDto moneyDto4, Instant instant, String str14, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_id = "";
            } else {
                this.order_id = str;
            }
            if ((i & 2) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str2;
            }
            if ((i & 4) == 0) {
                this.order_legs = CollectionsKt.emptyList();
            } else {
                this.order_legs = list;
            }
            if ((i & 8) == 0) {
                this.quantity = new IdlDecimal("");
            } else {
                this.quantity = idlDecimal;
            }
            if ((i & 16) == 0) {
                this.filled_quantity = new IdlDecimal("");
            } else {
                this.filled_quantity = idlDecimal2;
            }
            if ((i & 32) == 0) {
                this.max_show = null;
            } else {
                this.max_show = idlDecimal3;
            }
            if ((i & 64) == 0) {
                this.order_type = OrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.order_type = orderTypeDto;
            }
            if ((i & 128) == 0) {
                this.order_trigger = OrderTriggerDto.INSTANCE.getZeroValue();
            } else {
                this.order_trigger = orderTriggerDto;
            }
            if ((i & 256) == 0) {
                this.time_in_force = TimeInForceDto.INSTANCE.getZeroValue();
            } else {
                this.time_in_force = timeInForceDto;
            }
            if ((i & 512) == 0) {
                this.limit_price = null;
            } else {
                this.limit_price = idlDecimal4;
            }
            if ((i & 1024) == 0) {
                this.stop_price = null;
            } else {
                this.stop_price = idlDecimal5;
            }
            if ((i & 2048) == 0) {
                this.average_price = null;
            } else {
                this.average_price = idlDecimal6;
            }
            this.order_state = (i & 4096) == 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto;
            if ((i & 8192) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str3;
            }
            if ((i & 16384) == 0) {
                this.created_at = "";
            } else {
                this.created_at = str4;
            }
            if ((32768 & i) == 0) {
                this.updated_at = "";
            } else {
                this.updated_at = str5;
            }
            this.order_executions = (65536 & i) == 0 ? CollectionsKt.emptyList() : list2;
            this.route_to_mainst = (131072 & i) == 0 ? false : z;
            if ((262144 & i) == 0) {
                this.employee_alias = "";
            } else {
                this.employee_alias = str6;
            }
            if ((524288 & i) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str7;
            }
            if ((1048576 & i) == 0) {
                this.entered_reason = null;
            } else {
                this.entered_reason = orderEnteredReasonDto;
            }
            if ((2097152 & i) == 0) {
                this.total_fee = null;
            } else {
                this.total_fee = moneyDto;
            }
            this.fees = (4194304 & i) == 0 ? CollectionsKt.emptyList() : list3;
            if ((8388608 & i) == 0) {
                this.cancel_reason = null;
            } else {
                this.cancel_reason = orderCancelReasonDto;
            }
            if ((16777216 & i) == 0) {
                this.reject_reason = null;
            } else {
                this.reject_reason = orderRejectReasonDto;
            }
            if ((33554432 & i) == 0) {
                this.total_commission = null;
            } else {
                this.total_commission = moneyDto2;
            }
            if ((67108864 & i) == 0) {
                this.total_gold_savings = null;
            } else {
                this.total_gold_savings = moneyDto3;
            }
            if ((134217728 & i) == 0) {
                this.failed_receipt_override_title = null;
            } else {
                this.failed_receipt_override_title = str8;
            }
            if ((268435456 & i) == 0) {
                this.failed_receipt_override_detail_markdown = null;
            } else {
                this.failed_receipt_override_detail_markdown = str9;
            }
            if ((536870912 & i) == 0) {
                this.is_auto_send_enabled = null;
            } else {
                this.is_auto_send_enabled = bool;
            }
            if ((1073741824 & i) == 0) {
                this.position_effect_at_placement_time = null;
            } else {
                this.position_effect_at_placement_time = positionEffectDto;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.rhs_account_number = null;
            } else {
                this.rhs_account_number = str10;
            }
            if ((i2 & 1) == 0) {
                this.symbol = null;
            } else {
                this.symbol = str11;
            }
            if ((i2 & 2) == 0) {
                this.device_platform = null;
            } else {
                this.device_platform = str12;
            }
            if ((i2 & 4) == 0) {
                this.device_id = null;
            } else {
                this.device_id = str13;
            }
            if ((i2 & 8) == 0) {
                this.realized_pnl = null;
            } else {
                this.realized_pnl = realizedPnlForOrderDto;
            }
            this.derived_state = (i2 & 16) == 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto2;
            if ((i2 & 32) == 0) {
                this.opp_side = null;
            } else {
                this.opp_side = idlDecimal7;
            }
            if ((i2 & 64) == 0) {
                this.entered_notional_amount = null;
            } else {
                this.entered_notional_amount = moneyDto4;
            }
            if ((i2 & 128) == 0) {
                this.gtd_expiration_time = null;
            } else {
                this.gtd_expiration_time = instant;
            }
            if ((i2 & 256) == 0) {
                this.quote_id = null;
            } else {
                this.quote_id = str14;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.order_id);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_id);
            }
            if (!Intrinsics.areEqual(self.order_legs, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.order_legs);
            }
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            if (!Intrinsics.areEqual(self.filled_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.filled_quantity);
            }
            IdlDecimal idlDecimal = self.max_show;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            if (self.order_type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, OrderTypeDto.Serializer.INSTANCE, self.order_type);
            }
            if (self.order_trigger != OrderTriggerDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, OrderTriggerDto.Serializer.INSTANCE, self.order_trigger);
            }
            if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
            IdlDecimal idlDecimal2 = self.limit_price;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
            IdlDecimal idlDecimal3 = self.stop_price;
            if (idlDecimal3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, IdlDecimalSerializer.INSTANCE, idlDecimal3);
            }
            IdlDecimal idlDecimal4 = self.average_price;
            if (idlDecimal4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, IdlDecimalSerializer.INSTANCE, idlDecimal4);
            }
            OrderStateDto orderStateDto = self.order_state;
            OrderStateDto.Companion companion = OrderStateDto.INSTANCE;
            if (orderStateDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 12, OrderStateDto.Serializer.INSTANCE, self.order_state);
            }
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 13, self.ref_id);
            }
            if (!Intrinsics.areEqual(self.created_at, "")) {
                output.encodeStringElement(serialDesc, 14, self.created_at);
            }
            if (!Intrinsics.areEqual(self.updated_at, "")) {
                output.encodeStringElement(serialDesc, 15, self.updated_at);
            }
            if (!Intrinsics.areEqual(self.order_executions, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 16, lazyArr[16].getValue(), self.order_executions);
            }
            boolean z = self.route_to_mainst;
            if (z) {
                output.encodeBooleanElement(serialDesc, 17, z);
            }
            if (!Intrinsics.areEqual(self.employee_alias, "")) {
                output.encodeStringElement(serialDesc, 18, self.employee_alias);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 19, self.account_number);
            }
            OrderEnteredReasonDto orderEnteredReasonDto = self.entered_reason;
            if (orderEnteredReasonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, OrderEnteredReasonDto.Serializer.INSTANCE, orderEnteredReasonDto);
            }
            MoneyDto moneyDto = self.total_fee;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.fees, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 22, lazyArr[22].getValue(), self.fees);
            }
            OrderCancelReasonDto orderCancelReasonDto = self.cancel_reason;
            if (orderCancelReasonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, OrderCancelReasonDto.Serializer.INSTANCE, orderCancelReasonDto);
            }
            OrderRejectReasonDto orderRejectReasonDto = self.reject_reason;
            if (orderRejectReasonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 24, OrderRejectReasonDto.Serializer.INSTANCE, orderRejectReasonDto);
            }
            MoneyDto moneyDto2 = self.total_commission;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.total_gold_savings;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 26, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            String str = self.failed_receipt_override_title;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, StringSerializer.INSTANCE, str);
            }
            String str2 = self.failed_receipt_override_detail_markdown;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 28, StringSerializer.INSTANCE, str2);
            }
            Boolean bool = self.is_auto_send_enabled;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 29, BooleanSerializer.INSTANCE, bool);
            }
            PositionEffectDto positionEffectDto = self.position_effect_at_placement_time;
            if (positionEffectDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 30, PositionEffectDto.Serializer.INSTANCE, positionEffectDto);
            }
            String str3 = self.rhs_account_number;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 31, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.symbol;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 32, StringSerializer.INSTANCE, str4);
            }
            String str5 = self.device_platform;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 33, StringSerializer.INSTANCE, str5);
            }
            String str6 = self.device_id;
            if (str6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 34, StringSerializer.INSTANCE, str6);
            }
            RealizedPnlForOrderDto realizedPnlForOrderDto = self.realized_pnl;
            if (realizedPnlForOrderDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 35, RealizedPnlForOrderDto.Serializer.INSTANCE, realizedPnlForOrderDto);
            }
            if (self.derived_state != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 36, OrderStateDto.Serializer.INSTANCE, self.derived_state);
            }
            IdlDecimal idlDecimal5 = self.opp_side;
            if (idlDecimal5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 37, IdlDecimalSerializer.INSTANCE, idlDecimal5);
            }
            MoneyDto moneyDto4 = self.entered_notional_amount;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 38, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            Instant instant = self.gtd_expiration_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 39, WireInstantSerializer.INSTANCE, instant);
            }
            String str7 = self.quote_id;
            if (str7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 40, StringSerializer.INSTANCE, str7);
            }
        }

        public Surrogate(String order_id, String account_id, List<FuturesOrderLegDto> order_legs, IdlDecimal quantity, IdlDecimal filled_quantity, IdlDecimal idlDecimal, OrderTypeDto order_type, OrderTriggerDto order_trigger, TimeInForceDto time_in_force, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, OrderStateDto order_state, String ref_id, String created_at, String updated_at, List<FuturesOrderExecutionDto> order_executions, boolean z, String employee_alias, String account_number, OrderEnteredReasonDto orderEnteredReasonDto, MoneyDto moneyDto, List<FuturesOrderFeeDto> fees, OrderCancelReasonDto orderCancelReasonDto, OrderRejectReasonDto orderRejectReasonDto, MoneyDto moneyDto2, MoneyDto moneyDto3, String str, String str2, Boolean bool, PositionEffectDto positionEffectDto, String str3, String str4, String str5, String str6, RealizedPnlForOrderDto realizedPnlForOrderDto, OrderStateDto derived_state, IdlDecimal idlDecimal5, MoneyDto moneyDto4, Instant instant, String str7) {
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
            this.order_id = order_id;
            this.account_id = account_id;
            this.order_legs = order_legs;
            this.quantity = quantity;
            this.filled_quantity = filled_quantity;
            this.max_show = idlDecimal;
            this.order_type = order_type;
            this.order_trigger = order_trigger;
            this.time_in_force = time_in_force;
            this.limit_price = idlDecimal2;
            this.stop_price = idlDecimal3;
            this.average_price = idlDecimal4;
            this.order_state = order_state;
            this.ref_id = ref_id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.order_executions = order_executions;
            this.route_to_mainst = z;
            this.employee_alias = employee_alias;
            this.account_number = account_number;
            this.entered_reason = orderEnteredReasonDto;
            this.total_fee = moneyDto;
            this.fees = fees;
            this.cancel_reason = orderCancelReasonDto;
            this.reject_reason = orderRejectReasonDto;
            this.total_commission = moneyDto2;
            this.total_gold_savings = moneyDto3;
            this.failed_receipt_override_title = str;
            this.failed_receipt_override_detail_markdown = str2;
            this.is_auto_send_enabled = bool;
            this.position_effect_at_placement_time = positionEffectDto;
            this.rhs_account_number = str3;
            this.symbol = str4;
            this.device_platform = str5;
            this.device_id = str6;
            this.realized_pnl = realizedPnlForOrderDto;
            this.derived_state = derived_state;
            this.opp_side = idlDecimal5;
            this.entered_notional_amount = moneyDto4;
            this.gtd_expiration_time = instant;
            this.quote_id = str7;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Surrogate(String str, String str2, List list, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, OrderTypeDto orderTypeDto, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, OrderStateDto orderStateDto, String str3, String str4, String str5, List list2, boolean z, String str6, String str7, OrderEnteredReasonDto orderEnteredReasonDto, MoneyDto moneyDto, List list3, OrderCancelReasonDto orderCancelReasonDto, OrderRejectReasonDto orderRejectReasonDto, MoneyDto moneyDto2, MoneyDto moneyDto3, String str8, String str9, Boolean bool, PositionEffectDto positionEffectDto, String str10, String str11, String str12, String str13, RealizedPnlForOrderDto realizedPnlForOrderDto, OrderStateDto orderStateDto2, IdlDecimal idlDecimal7, MoneyDto moneyDto4, Instant instant, String str14, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            String str15 = (i & 1) != 0 ? "" : str;
            this(str15, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 32) != 0 ? null : idlDecimal3, (i & 64) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 128) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto, (i & 256) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 512) != 0 ? null : idlDecimal4, (i & 1024) != 0 ? null : idlDecimal5, (i & 2048) != 0 ? null : idlDecimal6, (i & 4096) != 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto, (i & 8192) != 0 ? "" : str3, (i & 16384) != 0 ? "" : str4, (i & 32768) != 0 ? "" : str5, (i & 65536) != 0 ? CollectionsKt.emptyList() : list2, (i & 131072) != 0 ? false : z, (i & 262144) != 0 ? "" : str6, (i & 524288) == 0 ? str7 : "", (i & 1048576) != 0 ? null : orderEnteredReasonDto, (i & 2097152) != 0 ? null : moneyDto, (i & 4194304) != 0 ? CollectionsKt.emptyList() : list3, (i & 8388608) != 0 ? null : orderCancelReasonDto, (i & 16777216) != 0 ? null : orderRejectReasonDto, (i & 33554432) != 0 ? null : moneyDto2, (i & 67108864) != 0 ? null : moneyDto3, (i & 134217728) != 0 ? null : str8, (i & 268435456) != 0 ? null : str9, (i & 536870912) != 0 ? null : bool, (i & 1073741824) != 0 ? null : positionEffectDto, (i & Integer.MIN_VALUE) != 0 ? null : str10, (i2 & 1) != 0 ? null : str11, (i2 & 2) != 0 ? null : str12, (i2 & 4) != 0 ? null : str13, (i2 & 8) != 0 ? null : realizedPnlForOrderDto, (i2 & 16) != 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto2, (i2 & 32) != 0 ? null : idlDecimal7, (i2 & 64) != 0 ? null : moneyDto4, (i2 & 128) != 0 ? null : instant, (i2 & 256) != 0 ? null : str14);
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final List<FuturesOrderLegDto> getOrder_legs() {
            return this.order_legs;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final IdlDecimal getFilled_quantity() {
            return this.filled_quantity;
        }

        public final IdlDecimal getMax_show() {
            return this.max_show;
        }

        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        public final OrderTriggerDto getOrder_trigger() {
            return this.order_trigger;
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }

        public final IdlDecimal getStop_price() {
            return this.stop_price;
        }

        public final IdlDecimal getAverage_price() {
            return this.average_price;
        }

        public final OrderStateDto getOrder_state() {
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

        public final List<FuturesOrderExecutionDto> getOrder_executions() {
            return this.order_executions;
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

        public final OrderEnteredReasonDto getEntered_reason() {
            return this.entered_reason;
        }

        public final MoneyDto getTotal_fee() {
            return this.total_fee;
        }

        public final List<FuturesOrderFeeDto> getFees() {
            return this.fees;
        }

        public final OrderCancelReasonDto getCancel_reason() {
            return this.cancel_reason;
        }

        public final OrderRejectReasonDto getReject_reason() {
            return this.reject_reason;
        }

        public final MoneyDto getTotal_commission() {
            return this.total_commission;
        }

        public final MoneyDto getTotal_gold_savings() {
            return this.total_gold_savings;
        }

        public final String getFailed_receipt_override_title() {
            return this.failed_receipt_override_title;
        }

        public final String getFailed_receipt_override_detail_markdown() {
            return this.failed_receipt_override_detail_markdown;
        }

        public final Boolean is_auto_send_enabled() {
            return this.is_auto_send_enabled;
        }

        public final PositionEffectDto getPosition_effect_at_placement_time() {
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

        public final RealizedPnlForOrderDto getRealized_pnl() {
            return this.realized_pnl;
        }

        public final OrderStateDto getDerived_state() {
            return this.derived_state;
        }

        public final IdlDecimal getOpp_side() {
            return this.opp_side;
        }

        public final MoneyDto getEntered_notional_amount() {
            return this.entered_notional_amount;
        }

        public final Instant getGtd_expiration_time() {
            return this.gtd_expiration_time;
        }

        public final String getQuote_id() {
            return this.quote_id;
        }
    }

    /* compiled from: FuturesOrderDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "Lcom/robinhood/ceres/v1/FuturesOrder;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesOrderDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FuturesOrderDto, FuturesOrder> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesOrderDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesOrderDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesOrderDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesOrderDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesOrder> getProtoAdapter() {
            return FuturesOrder.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesOrderDto getZeroValue() {
            return FuturesOrderDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesOrderDto fromProto(FuturesOrder proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String order_id = proto.getOrder_id();
            String account_id = proto.getAccount_id();
            List<FuturesOrderLeg> order_legs = proto.getOrder_legs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_legs, 10));
            Iterator<T> it = order_legs.iterator();
            while (it.hasNext()) {
                arrayList.add(FuturesOrderLegDto.INSTANCE.fromProto((FuturesOrderLeg) it.next()));
            }
            IdlDecimal idlDecimal = new IdlDecimal(proto.getQuantity());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getFilled_quantity());
            String max_show = proto.getMax_show();
            IdlDecimal idlDecimal3 = max_show != null ? new IdlDecimal(max_show) : null;
            OrderTypeDto orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(proto.getOrder_type());
            OrderTriggerDto orderTriggerDtoFromProto = OrderTriggerDto.INSTANCE.fromProto(proto.getOrder_trigger());
            TimeInForceDto timeInForceDtoFromProto = TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force());
            String limit_price = proto.getLimit_price();
            IdlDecimal idlDecimal4 = limit_price != null ? new IdlDecimal(limit_price) : null;
            String stop_price = proto.getStop_price();
            IdlDecimal idlDecimal5 = stop_price != null ? new IdlDecimal(stop_price) : null;
            String average_price = proto.getAverage_price();
            IdlDecimal idlDecimal6 = average_price != null ? new IdlDecimal(average_price) : null;
            OrderStateDto orderStateDtoFromProto = OrderStateDto.INSTANCE.fromProto(proto.getOrder_state());
            IdlDecimal idlDecimal7 = idlDecimal4;
            IdlDecimal idlDecimal8 = idlDecimal6;
            String ref_id = proto.getRef_id();
            DefaultConstructorMarker defaultConstructorMarker = null;
            String created_at = proto.getCreated_at();
            String updated_at = proto.getUpdated_at();
            List<FuturesOrderExecution> order_executions = proto.getOrder_executions();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_executions, 10));
            Iterator<T> it2 = order_executions.iterator();
            while (it2.hasNext()) {
                arrayList2.add(FuturesOrderExecutionDto.INSTANCE.fromProto((FuturesOrderExecution) it2.next()));
            }
            boolean route_to_mainst = proto.getRoute_to_mainst();
            String employee_alias = proto.getEmployee_alias();
            String account_number = proto.getAccount_number();
            OrderEnteredReason entered_reason = proto.getEntered_reason();
            OrderEnteredReasonDto orderEnteredReasonDtoFromProto = entered_reason != null ? OrderEnteredReasonDto.INSTANCE.fromProto(entered_reason) : null;
            Money total_fee = proto.getTotal_fee();
            OrderEnteredReasonDto orderEnteredReasonDto = orderEnteredReasonDtoFromProto;
            MoneyDto moneyDtoFromProto = total_fee != null ? MoneyDto.INSTANCE.fromProto(total_fee) : null;
            List<FuturesOrderFee> fees = proto.getFees();
            MoneyDto moneyDto = moneyDtoFromProto;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(fees, 10));
            for (Iterator it3 = fees.iterator(); it3.hasNext(); it3 = it3) {
                arrayList3.add(FuturesOrderFeeDto.INSTANCE.fromProto((FuturesOrderFee) it3.next()));
            }
            OrderCancelReason cancel_reason = proto.getCancel_reason();
            OrderCancelReasonDto orderCancelReasonDtoFromProto = cancel_reason != null ? OrderCancelReasonDto.INSTANCE.fromProto(cancel_reason) : null;
            OrderRejectReason reject_reason = proto.getReject_reason();
            OrderRejectReasonDto orderRejectReasonDtoFromProto = reject_reason != null ? OrderRejectReasonDto.INSTANCE.fromProto(reject_reason) : null;
            Money total_commission = proto.getTotal_commission();
            OrderRejectReasonDto orderRejectReasonDto = orderRejectReasonDtoFromProto;
            MoneyDto moneyDtoFromProto2 = total_commission != null ? MoneyDto.INSTANCE.fromProto(total_commission) : null;
            Money total_gold_savings = proto.getTotal_gold_savings();
            MoneyDto moneyDto2 = moneyDtoFromProto2;
            MoneyDto moneyDtoFromProto3 = total_gold_savings != null ? MoneyDto.INSTANCE.fromProto(total_gold_savings) : null;
            String failed_receipt_override_title = proto.getFailed_receipt_override_title();
            String failed_receipt_override_detail_markdown = proto.getFailed_receipt_override_detail_markdown();
            Boolean boolIs_auto_send_enabled = proto.getIs_auto_send_enabled();
            PositionEffect position_effect_at_placement_time = proto.getPosition_effect_at_placement_time();
            MoneyDto moneyDto3 = moneyDtoFromProto3;
            PositionEffectDto positionEffectDtoFromProto = position_effect_at_placement_time != null ? PositionEffectDto.INSTANCE.fromProto(position_effect_at_placement_time) : null;
            String rhs_account_number = proto.getRhs_account_number();
            String symbol = proto.getSymbol();
            String device_platform = proto.getDevice_platform();
            String device_id = proto.getDevice_id();
            RealizedPnlForOrder realized_pnl = proto.getRealized_pnl();
            PositionEffectDto positionEffectDto = positionEffectDtoFromProto;
            RealizedPnlForOrderDto realizedPnlForOrderDtoFromProto = realized_pnl != null ? RealizedPnlForOrderDto.INSTANCE.fromProto(realized_pnl) : null;
            OrderStateDto orderStateDtoFromProto2 = OrderStateDto.INSTANCE.fromProto(proto.getDerived_state());
            String opp_side = proto.getOpp_side();
            IdlDecimal idlDecimal9 = opp_side != null ? new IdlDecimal(opp_side) : null;
            Money entered_notional_amount = proto.getEntered_notional_amount();
            return new FuturesOrderDto(new Surrogate(order_id, account_id, arrayList, idlDecimal, idlDecimal2, idlDecimal3, orderTypeDtoFromProto, orderTriggerDtoFromProto, timeInForceDtoFromProto, idlDecimal7, idlDecimal5, idlDecimal8, orderStateDtoFromProto, ref_id, created_at, updated_at, arrayList2, route_to_mainst, employee_alias, account_number, orderEnteredReasonDto, moneyDto, arrayList3, orderCancelReasonDtoFromProto, orderRejectReasonDto, moneyDto2, moneyDto3, failed_receipt_override_title, failed_receipt_override_detail_markdown, boolIs_auto_send_enabled, positionEffectDto, rhs_account_number, symbol, device_platform, device_id, realizedPnlForOrderDtoFromProto, orderStateDtoFromProto2, idlDecimal9, entered_notional_amount != null ? MoneyDto.INSTANCE.fromProto(entered_notional_amount) : null, proto.getGtd_expiration_time(), proto.getQuote_id()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesOrderDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesOrderDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new FuturesOrderDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesOrderDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FuturesOrderDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesOrderDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FuturesOrder", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesOrderDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesOrderDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesOrderDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesOrderDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FuturesOrderDto";
        }
    }
}

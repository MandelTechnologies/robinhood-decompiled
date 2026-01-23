package com.robinhood.rosetta.nummus;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.cbc.service.tax_lot.p283v1.DisposalMethod;
import com.robinhood.cbc.service.tax_lot.p283v1.DisposalMethodDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.ByteStringSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.brokerage.BrokerageAccountingDetails;
import com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.rosetta.nummus.CryptoOrderDetailsDto;
import com.robinhood.rosetta.nummus.ExecutionDto;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import okio.ByteString;
import p479j$.time.Instant;
import rosetta.nummus.CurrencyPair;
import rosetta.nummus.CurrencyPairDto;
import rosetta.order.Agent;
import rosetta.order.AgentDto;
import rosetta.order.InitiatorType;
import rosetta.order.InitiatorTypeDto;
import rosetta.order.OrderType;
import rosetta.order.OrderTypeDto;
import rosetta.order.ResponseCategory;
import rosetta.order.ResponseCategoryDto;
import rosetta.order.Side;
import rosetta.order.SideDto;
import rosetta.order.State;
import rosetta.order.StateDto;
import rosetta.order.TimeInForce;
import rosetta.order.TimeInForceDto;

/* compiled from: CryptoOrderDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b;\b\u0007\u0018\u0000 \u0086\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b\u0087\u0001\u0086\u0001\u0088\u0001\u0089\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0095\u0003\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0016\u0012\b\b\u0002\u0010 \u001a\u00020\u0016\u0012\b\b\u0002\u0010!\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\u0010\b\u0002\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(\u0012\b\b\u0002\u0010+\u001a\u00020*\u0012\b\b\u0002\u0010-\u001a\u00020,\u0012\b\b\u0002\u0010.\u001a\u00020,\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\b\b\u0002\u00101\u001a\u00020\u0016\u0012\b\b\u0002\u00102\u001a\u00020,\u0012\b\b\u0002\u00103\u001a\u00020\u0016\u0012\u0010\b\u0002\u00104\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(\u0012\b\b\u0002\u00105\u001a\u00020\u0016\u0012\b\b\u0002\u00106\u001a\u00020\u0016\u0012\b\b\u0002\u00107\u001a\u00020\u0016\u0012\b\b\u0002\u00108\u001a\u00020\u0016\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109\u0012\b\b\u0002\u0010<\u001a\u00020;\u0012\u0010\b\u0002\u0010=\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(¢\u0006\u0004\b\u0006\u0010>J\u0099\u0003\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u00162\b\b\u0002\u0010\u001f\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u00162\b\b\u0002\u0010!\u001a\u00020\u00162\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\u0010\b\u0002\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020,2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020\u00162\b\b\u0002\u00102\u001a\u00020,2\b\b\u0002\u00103\u001a\u00020\u00162\u0010\b\u0002\u00104\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(2\b\b\u0002\u00105\u001a\u00020\u00162\b\b\u0002\u00106\u001a\u00020\u00162\b\b\u0002\u00107\u001a\u00020\u00162\b\b\u0002\u00108\u001a\u00020\u00162\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\b\b\u0002\u0010<\u001a\u00020;2\u0010\b\u0002\u0010=\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0002H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0016H\u0016¢\u0006\u0004\bC\u0010DJ\u001a\u0010G\u001a\u00020/2\b\u0010F\u001a\u0004\u0018\u00010EH\u0096\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KJ\u001f\u0010P\u001a\u00020O2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020IH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020IH\u0016¢\u0006\u0004\bR\u0010KR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010SR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bb\u0010DR\u0011\u0010\u0018\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bc\u0010DR\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bd\u0010DR\u0011\u0010\u001a\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\be\u0010DR\u0011\u0010\u001b\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bf\u0010DR\u0011\u0010\u001c\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bg\u0010DR\u0011\u0010\u001d\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bh\u0010DR\u0011\u0010\u001e\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bi\u0010DR\u0011\u0010\u001f\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bj\u0010DR\u0011\u0010 \u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bk\u0010DR\u0011\u0010!\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bl\u0010DR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010&\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0019\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0011\u0010+\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0011\u0010-\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0011\u0010.\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\bw\u0010vR\u0011\u00100\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u0010xR\u0011\u00101\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\by\u0010DR\u0011\u00102\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\bz\u0010vR\u0011\u00103\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b{\u0010DR\u0019\u00104\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(8F¢\u0006\u0006\u001a\u0004\b|\u0010rR\u0011\u00105\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b}\u0010DR\u0011\u00106\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b~\u0010DR\u0011\u00107\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u007f\u0010DR\u0012\u00108\u001a\u00020\u00168F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010DR\u0015\u0010:\u001a\u0004\u0018\u0001098F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0013\u0010<\u001a\u00020;8F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010=\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010r¨\u0006\u008a\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/nummus/CryptoOrderDetails;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto$Surrogate;)V", "Lrosetta/order/StateDto;", "state", "Lrosetta/order/OrderTypeDto;", "type", "Lrosetta/order/SideDto;", "side", "Lrosetta/order/TimeInForceDto;", "time_in_force", "Lrosetta/order/AgentDto;", "cancel_agent", "Lrosetta/order/ResponseCategoryDto;", "response_category", "Lrosetta/nummus/CurrencyPairDto;", Content.MarketIndicator.CRYPTO_TYPE, "", "quantity", "cumulative_quantity", "leaves_quantity", "canceled_quantity", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "average_executed_price", "user_entered_order_total", "cumulative_order_value", "rounded_cumulative_order_value", "remaining_notional", "entered_amount", "", "Lcom/robinhood/rosetta/nummus/ExecutionDto;", "executions", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "brokerage_accounting_details", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_transaction_at", "Lrosetta/order/InitiatorTypeDto;", "initiator_type", "Lokio/ByteString;", "initiator_id", "reference_id", "", "is_eligible_for_bonus", "funding_source_type", "account_id", "stop_price", "submitted_at", "fee_amount", "rounded_order_value_with_fee", "num_selected_lots", "tax_lot_term_type", "Lcom/robinhood/rosetta/common/MoneyDto;", "estimated_gain_loss", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;", "tax_lot_disposal_method", "updated_at", "(Lrosetta/order/StateDto;Lrosetta/order/OrderTypeDto;Lrosetta/order/SideDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/AgentDto;Lrosetta/order/ResponseCategoryDto;Lrosetta/nummus/CurrencyPairDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;Lj$/time/Instant;Lrosetta/order/InitiatorTypeDto;Lokio/ByteString;Lokio/ByteString;ZLjava/lang/String;Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;Lj$/time/Instant;)V", "copy", "(Lrosetta/order/StateDto;Lrosetta/order/OrderTypeDto;Lrosetta/order/SideDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/AgentDto;Lrosetta/order/ResponseCategoryDto;Lrosetta/nummus/CurrencyPairDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;Lj$/time/Instant;Lrosetta/order/InitiatorTypeDto;Lokio/ByteString;Lokio/ByteString;ZLjava/lang/String;Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;Lj$/time/Instant;)Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;", "toProto", "()Lcom/robinhood/rosetta/nummus/CryptoOrderDetails;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto$Surrogate;", "getState", "()Lrosetta/order/StateDto;", "getType", "()Lrosetta/order/OrderTypeDto;", "getSide", "()Lrosetta/order/SideDto;", "getTime_in_force", "()Lrosetta/order/TimeInForceDto;", "getCancel_agent", "()Lrosetta/order/AgentDto;", "getResponse_category", "()Lrosetta/order/ResponseCategoryDto;", "getCurrency_pair", "()Lrosetta/nummus/CurrencyPairDto;", "getQuantity", "getCumulative_quantity", "getLeaves_quantity", "getCanceled_quantity", "getPrice", "getAverage_executed_price", "getUser_entered_order_total", "getCumulative_order_value", "getRounded_cumulative_order_value", "getRemaining_notional", "getEntered_amount", "getExecutions", "()Ljava/util/List;", "getBrokerage_accounting_details", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "getLast_transaction_at", "()Lj$/time/Instant;", "getInitiator_type", "()Lrosetta/order/InitiatorTypeDto;", "getInitiator_id", "()Lokio/ByteString;", "getReference_id", "()Z", "getFunding_source_type", "getAccount_id", "getStop_price", "getSubmitted_at", "getFee_amount", "getRounded_order_value_with_fee", "getNum_selected_lots", "getTax_lot_term_type", "getEstimated_gain_loss", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getTax_lot_disposal_method", "()Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;", "getUpdated_at", "Companion", "Surrogate", "Serializer", "MultibindingModule", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class CryptoOrderDetailsDto implements Dto3<CryptoOrderDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoOrderDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoOrderDetailsDto, CryptoOrderDetails>> binaryBase64Serializer$delegate;
    private static final CryptoOrderDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoOrderDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoOrderDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final StateDto getState() {
        return this.surrogate.getState();
    }

    public final OrderTypeDto getType() {
        return this.surrogate.getType();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final TimeInForceDto getTime_in_force() {
        return this.surrogate.getTime_in_force();
    }

    public final AgentDto getCancel_agent() {
        return this.surrogate.getCancel_agent();
    }

    public final ResponseCategoryDto getResponse_category() {
        return this.surrogate.getResponse_category();
    }

    public final CurrencyPairDto getCurrency_pair() {
        return this.surrogate.getCurrency_pair();
    }

    public final String getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final String getCumulative_quantity() {
        return this.surrogate.getCumulative_quantity();
    }

    public final String getLeaves_quantity() {
        return this.surrogate.getLeaves_quantity();
    }

    public final String getCanceled_quantity() {
        return this.surrogate.getCanceled_quantity();
    }

    public final String getPrice() {
        return this.surrogate.getPrice();
    }

    public final String getAverage_executed_price() {
        return this.surrogate.getAverage_executed_price();
    }

    public final String getUser_entered_order_total() {
        return this.surrogate.getUser_entered_order_total();
    }

    public final String getCumulative_order_value() {
        return this.surrogate.getCumulative_order_value();
    }

    public final String getRounded_cumulative_order_value() {
        return this.surrogate.getRounded_cumulative_order_value();
    }

    public final String getRemaining_notional() {
        return this.surrogate.getRemaining_notional();
    }

    public final String getEntered_amount() {
        return this.surrogate.getEntered_amount();
    }

    public final List<ExecutionDto> getExecutions() {
        return this.surrogate.getExecutions();
    }

    public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
        return this.surrogate.getBrokerage_accounting_details();
    }

    public final Instant getLast_transaction_at() {
        return this.surrogate.getLast_transaction_at();
    }

    public final InitiatorTypeDto getInitiator_type() {
        return this.surrogate.getInitiator_type();
    }

    public final ByteString getInitiator_id() {
        return this.surrogate.getInitiator_id();
    }

    public final ByteString getReference_id() {
        return this.surrogate.getReference_id();
    }

    public final boolean is_eligible_for_bonus() {
        return this.surrogate.is_eligible_for_bonus();
    }

    public final String getFunding_source_type() {
        return this.surrogate.getFunding_source_type();
    }

    public final ByteString getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final String getStop_price() {
        return this.surrogate.getStop_price();
    }

    public final Instant getSubmitted_at() {
        return this.surrogate.getSubmitted_at();
    }

    public final String getFee_amount() {
        return this.surrogate.getFee_amount();
    }

    public final String getRounded_order_value_with_fee() {
        return this.surrogate.getRounded_order_value_with_fee();
    }

    public final String getNum_selected_lots() {
        return this.surrogate.getNum_selected_lots();
    }

    public final String getTax_lot_term_type() {
        return this.surrogate.getTax_lot_term_type();
    }

    public final MoneyDto getEstimated_gain_loss() {
        return this.surrogate.getEstimated_gain_loss();
    }

    public final DisposalMethodDto getTax_lot_disposal_method() {
        return this.surrogate.getTax_lot_disposal_method();
    }

    public final Instant getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public /* synthetic */ CryptoOrderDetailsDto(StateDto stateDto, OrderTypeDto orderTypeDto, SideDto sideDto, TimeInForceDto timeInForceDto, AgentDto agentDto, ResponseCategoryDto responseCategoryDto, CurrencyPairDto currencyPairDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, Instant instant, InitiatorTypeDto initiatorTypeDto, ByteString byteString, ByteString byteString2, boolean z, String str12, ByteString byteString3, String str13, Instant instant2, String str14, String str15, String str16, String str17, MoneyDto moneyDto, DisposalMethodDto disposalMethodDto, Instant instant3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i & 2) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 4) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 8) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 16) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i & 32) != 0 ? ResponseCategoryDto.INSTANCE.getZeroValue() : responseCategoryDto, (i & 64) != 0 ? null : currencyPairDto, (i & 128) != 0 ? "" : str, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? "" : str4, (i & 2048) != 0 ? "" : str5, (i & 4096) != 0 ? "" : str6, (i & 8192) != 0 ? "" : str7, (i & 16384) != 0 ? "" : str8, (i & 32768) != 0 ? "" : str9, (i & 65536) != 0 ? "" : str10, (i & 131072) != 0 ? "" : str11, (i & 262144) != 0 ? CollectionsKt.emptyList() : list, (i & 524288) != 0 ? null : brokerageAccountingDetailsDto, (i & 1048576) != 0 ? null : instant, (i & 2097152) != 0 ? InitiatorTypeDto.INSTANCE.getZeroValue() : initiatorTypeDto, (i & 4194304) != 0 ? ByteString.EMPTY : byteString, (i & 8388608) != 0 ? ByteString.EMPTY : byteString2, (i & 16777216) != 0 ? false : z, (i & 33554432) != 0 ? "" : str12, (i & 67108864) != 0 ? ByteString.EMPTY : byteString3, (i & 134217728) != 0 ? "" : str13, (i & 268435456) != 0 ? null : instant2, (i & 536870912) != 0 ? "" : str14, (i & 1073741824) != 0 ? "" : str15, (i & Integer.MIN_VALUE) != 0 ? "" : str16, (i2 & 1) == 0 ? str17 : "", (i2 & 2) != 0 ? null : moneyDto, (i2 & 4) != 0 ? DisposalMethodDto.INSTANCE.getZeroValue() : disposalMethodDto, (i2 & 8) != 0 ? null : instant3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoOrderDetailsDto(StateDto state, OrderTypeDto type2, SideDto side, TimeInForceDto time_in_force, AgentDto cancel_agent, ResponseCategoryDto response_category, CurrencyPairDto currencyPairDto, String quantity, String cumulative_quantity, String leaves_quantity, String canceled_quantity, String price, String average_executed_price, String user_entered_order_total, String cumulative_order_value, String rounded_cumulative_order_value, String remaining_notional, String entered_amount, List<ExecutionDto> executions, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, Instant instant, InitiatorTypeDto initiator_type, ByteString initiator_id, ByteString reference_id, boolean z, String funding_source_type, ByteString account_id, String stop_price, Instant instant2, String fee_amount, String rounded_order_value_with_fee, String num_selected_lots, String tax_lot_term_type, MoneyDto moneyDto, DisposalMethodDto tax_lot_disposal_method, Instant instant3) {
        this(new Surrogate(state, type2, side, time_in_force, cancel_agent, response_category, currencyPairDto, quantity, cumulative_quantity, leaves_quantity, canceled_quantity, price, average_executed_price, user_entered_order_total, cumulative_order_value, rounded_cumulative_order_value, remaining_notional, entered_amount, executions, brokerageAccountingDetailsDto, instant, initiator_type, initiator_id, reference_id, z, funding_source_type, account_id, stop_price, instant2, fee_amount, rounded_order_value_with_fee, num_selected_lots, tax_lot_term_type, moneyDto, tax_lot_disposal_method, instant3));
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(cancel_agent, "cancel_agent");
        Intrinsics.checkNotNullParameter(response_category, "response_category");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(cumulative_quantity, "cumulative_quantity");
        Intrinsics.checkNotNullParameter(leaves_quantity, "leaves_quantity");
        Intrinsics.checkNotNullParameter(canceled_quantity, "canceled_quantity");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(average_executed_price, "average_executed_price");
        Intrinsics.checkNotNullParameter(user_entered_order_total, "user_entered_order_total");
        Intrinsics.checkNotNullParameter(cumulative_order_value, "cumulative_order_value");
        Intrinsics.checkNotNullParameter(rounded_cumulative_order_value, "rounded_cumulative_order_value");
        Intrinsics.checkNotNullParameter(remaining_notional, "remaining_notional");
        Intrinsics.checkNotNullParameter(entered_amount, "entered_amount");
        Intrinsics.checkNotNullParameter(executions, "executions");
        Intrinsics.checkNotNullParameter(initiator_type, "initiator_type");
        Intrinsics.checkNotNullParameter(initiator_id, "initiator_id");
        Intrinsics.checkNotNullParameter(reference_id, "reference_id");
        Intrinsics.checkNotNullParameter(funding_source_type, "funding_source_type");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(stop_price, "stop_price");
        Intrinsics.checkNotNullParameter(fee_amount, "fee_amount");
        Intrinsics.checkNotNullParameter(rounded_order_value_with_fee, "rounded_order_value_with_fee");
        Intrinsics.checkNotNullParameter(num_selected_lots, "num_selected_lots");
        Intrinsics.checkNotNullParameter(tax_lot_term_type, "tax_lot_term_type");
        Intrinsics.checkNotNullParameter(tax_lot_disposal_method, "tax_lot_disposal_method");
    }

    public static /* synthetic */ CryptoOrderDetailsDto copy$default(CryptoOrderDetailsDto cryptoOrderDetailsDto, StateDto stateDto, OrderTypeDto orderTypeDto, SideDto sideDto, TimeInForceDto timeInForceDto, AgentDto agentDto, ResponseCategoryDto responseCategoryDto, CurrencyPairDto currencyPairDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, Instant instant, InitiatorTypeDto initiatorTypeDto, ByteString byteString, ByteString byteString2, boolean z, String str12, ByteString byteString3, String str13, Instant instant2, String str14, String str15, String str16, String str17, MoneyDto moneyDto, DisposalMethodDto disposalMethodDto, Instant instant3, int i, int i2, Object obj) {
        Instant updated_at;
        DisposalMethodDto disposalMethodDto2;
        BrokerageAccountingDetailsDto brokerageAccountingDetailsDto2;
        Instant instant4;
        InitiatorTypeDto initiatorTypeDto2;
        ByteString byteString4;
        ByteString byteString5;
        boolean z2;
        String str18;
        ByteString byteString6;
        String str19;
        Instant instant5;
        String str20;
        String str21;
        String str22;
        String str23;
        MoneyDto moneyDto2;
        String str24;
        AgentDto agentDto2;
        ResponseCategoryDto responseCategoryDto2;
        CurrencyPairDto currencyPairDto2;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        List list2;
        OrderTypeDto orderTypeDto2;
        SideDto sideDto2;
        TimeInForceDto timeInForceDto2;
        StateDto state = (i & 1) != 0 ? cryptoOrderDetailsDto.surrogate.getState() : stateDto;
        OrderTypeDto type2 = (i & 2) != 0 ? cryptoOrderDetailsDto.surrogate.getType() : orderTypeDto;
        SideDto side = (i & 4) != 0 ? cryptoOrderDetailsDto.surrogate.getSide() : sideDto;
        TimeInForceDto time_in_force = (i & 8) != 0 ? cryptoOrderDetailsDto.surrogate.getTime_in_force() : timeInForceDto;
        AgentDto cancel_agent = (i & 16) != 0 ? cryptoOrderDetailsDto.surrogate.getCancel_agent() : agentDto;
        ResponseCategoryDto response_category = (i & 32) != 0 ? cryptoOrderDetailsDto.surrogate.getResponse_category() : responseCategoryDto;
        CurrencyPairDto currency_pair = (i & 64) != 0 ? cryptoOrderDetailsDto.surrogate.getCurrency_pair() : currencyPairDto;
        String quantity = (i & 128) != 0 ? cryptoOrderDetailsDto.surrogate.getQuantity() : str;
        String cumulative_quantity = (i & 256) != 0 ? cryptoOrderDetailsDto.surrogate.getCumulative_quantity() : str2;
        String leaves_quantity = (i & 512) != 0 ? cryptoOrderDetailsDto.surrogate.getLeaves_quantity() : str3;
        String canceled_quantity = (i & 1024) != 0 ? cryptoOrderDetailsDto.surrogate.getCanceled_quantity() : str4;
        String price = (i & 2048) != 0 ? cryptoOrderDetailsDto.surrogate.getPrice() : str5;
        String average_executed_price = (i & 4096) != 0 ? cryptoOrderDetailsDto.surrogate.getAverage_executed_price() : str6;
        String user_entered_order_total = (i & 8192) != 0 ? cryptoOrderDetailsDto.surrogate.getUser_entered_order_total() : str7;
        StateDto stateDto2 = state;
        String cumulative_order_value = (i & 16384) != 0 ? cryptoOrderDetailsDto.surrogate.getCumulative_order_value() : str8;
        String rounded_cumulative_order_value = (i & 32768) != 0 ? cryptoOrderDetailsDto.surrogate.getRounded_cumulative_order_value() : str9;
        String remaining_notional = (i & 65536) != 0 ? cryptoOrderDetailsDto.surrogate.getRemaining_notional() : str10;
        String entered_amount = (i & 131072) != 0 ? cryptoOrderDetailsDto.surrogate.getEntered_amount() : str11;
        List executions = (i & 262144) != 0 ? cryptoOrderDetailsDto.surrogate.getExecutions() : list;
        BrokerageAccountingDetailsDto brokerage_accounting_details = (i & 524288) != 0 ? cryptoOrderDetailsDto.surrogate.getBrokerage_accounting_details() : brokerageAccountingDetailsDto;
        Instant last_transaction_at = (i & 1048576) != 0 ? cryptoOrderDetailsDto.surrogate.getLast_transaction_at() : instant;
        InitiatorTypeDto initiator_type = (i & 2097152) != 0 ? cryptoOrderDetailsDto.surrogate.getInitiator_type() : initiatorTypeDto;
        ByteString initiator_id = (i & 4194304) != 0 ? cryptoOrderDetailsDto.surrogate.getInitiator_id() : byteString;
        ByteString reference_id = (i & 8388608) != 0 ? cryptoOrderDetailsDto.surrogate.getReference_id() : byteString2;
        boolean zIs_eligible_for_bonus = (i & 16777216) != 0 ? cryptoOrderDetailsDto.surrogate.is_eligible_for_bonus() : z;
        String funding_source_type = (i & 33554432) != 0 ? cryptoOrderDetailsDto.surrogate.getFunding_source_type() : str12;
        ByteString account_id = (i & 67108864) != 0 ? cryptoOrderDetailsDto.surrogate.getAccount_id() : byteString3;
        String stop_price = (i & 134217728) != 0 ? cryptoOrderDetailsDto.surrogate.getStop_price() : str13;
        Instant submitted_at = (i & 268435456) != 0 ? cryptoOrderDetailsDto.surrogate.getSubmitted_at() : instant2;
        String fee_amount = (i & 536870912) != 0 ? cryptoOrderDetailsDto.surrogate.getFee_amount() : str14;
        String rounded_order_value_with_fee = (i & 1073741824) != 0 ? cryptoOrderDetailsDto.surrogate.getRounded_order_value_with_fee() : str15;
        String num_selected_lots = (i & Integer.MIN_VALUE) != 0 ? cryptoOrderDetailsDto.surrogate.getNum_selected_lots() : str16;
        String tax_lot_term_type = (i2 & 1) != 0 ? cryptoOrderDetailsDto.surrogate.getTax_lot_term_type() : str17;
        MoneyDto estimated_gain_loss = (i2 & 2) != 0 ? cryptoOrderDetailsDto.surrogate.getEstimated_gain_loss() : moneyDto;
        DisposalMethodDto tax_lot_disposal_method = (i2 & 4) != 0 ? cryptoOrderDetailsDto.surrogate.getTax_lot_disposal_method() : disposalMethodDto;
        if ((i2 & 8) != 0) {
            disposalMethodDto2 = tax_lot_disposal_method;
            updated_at = cryptoOrderDetailsDto.surrogate.getUpdated_at();
            instant4 = last_transaction_at;
            initiatorTypeDto2 = initiator_type;
            byteString4 = initiator_id;
            byteString5 = reference_id;
            z2 = zIs_eligible_for_bonus;
            str18 = funding_source_type;
            byteString6 = account_id;
            str19 = stop_price;
            instant5 = submitted_at;
            str20 = fee_amount;
            str21 = rounded_order_value_with_fee;
            str22 = num_selected_lots;
            str23 = tax_lot_term_type;
            moneyDto2 = estimated_gain_loss;
            str24 = cumulative_order_value;
            responseCategoryDto2 = response_category;
            currencyPairDto2 = currency_pair;
            str25 = quantity;
            str26 = cumulative_quantity;
            str27 = leaves_quantity;
            str28 = canceled_quantity;
            str29 = price;
            str30 = average_executed_price;
            str31 = user_entered_order_total;
            str32 = rounded_cumulative_order_value;
            str33 = remaining_notional;
            str34 = entered_amount;
            list2 = executions;
            brokerageAccountingDetailsDto2 = brokerage_accounting_details;
            orderTypeDto2 = type2;
            sideDto2 = side;
            timeInForceDto2 = time_in_force;
            agentDto2 = cancel_agent;
        } else {
            updated_at = instant3;
            disposalMethodDto2 = tax_lot_disposal_method;
            brokerageAccountingDetailsDto2 = brokerage_accounting_details;
            instant4 = last_transaction_at;
            initiatorTypeDto2 = initiator_type;
            byteString4 = initiator_id;
            byteString5 = reference_id;
            z2 = zIs_eligible_for_bonus;
            str18 = funding_source_type;
            byteString6 = account_id;
            str19 = stop_price;
            instant5 = submitted_at;
            str20 = fee_amount;
            str21 = rounded_order_value_with_fee;
            str22 = num_selected_lots;
            str23 = tax_lot_term_type;
            moneyDto2 = estimated_gain_loss;
            str24 = cumulative_order_value;
            agentDto2 = cancel_agent;
            responseCategoryDto2 = response_category;
            currencyPairDto2 = currency_pair;
            str25 = quantity;
            str26 = cumulative_quantity;
            str27 = leaves_quantity;
            str28 = canceled_quantity;
            str29 = price;
            str30 = average_executed_price;
            str31 = user_entered_order_total;
            str32 = rounded_cumulative_order_value;
            str33 = remaining_notional;
            str34 = entered_amount;
            list2 = executions;
            orderTypeDto2 = type2;
            sideDto2 = side;
            timeInForceDto2 = time_in_force;
        }
        return cryptoOrderDetailsDto.copy(stateDto2, orderTypeDto2, sideDto2, timeInForceDto2, agentDto2, responseCategoryDto2, currencyPairDto2, str25, str26, str27, str28, str29, str30, str31, str24, str32, str33, str34, list2, brokerageAccountingDetailsDto2, instant4, initiatorTypeDto2, byteString4, byteString5, z2, str18, byteString6, str19, instant5, str20, str21, str22, str23, moneyDto2, disposalMethodDto2, updated_at);
    }

    public final CryptoOrderDetailsDto copy(StateDto state, OrderTypeDto type2, SideDto side, TimeInForceDto time_in_force, AgentDto cancel_agent, ResponseCategoryDto response_category, CurrencyPairDto currency_pair, String quantity, String cumulative_quantity, String leaves_quantity, String canceled_quantity, String price, String average_executed_price, String user_entered_order_total, String cumulative_order_value, String rounded_cumulative_order_value, String remaining_notional, String entered_amount, List<ExecutionDto> executions, BrokerageAccountingDetailsDto brokerage_accounting_details, Instant last_transaction_at, InitiatorTypeDto initiator_type, ByteString initiator_id, ByteString reference_id, boolean is_eligible_for_bonus, String funding_source_type, ByteString account_id, String stop_price, Instant submitted_at, String fee_amount, String rounded_order_value_with_fee, String num_selected_lots, String tax_lot_term_type, MoneyDto estimated_gain_loss, DisposalMethodDto tax_lot_disposal_method, Instant updated_at) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(cancel_agent, "cancel_agent");
        Intrinsics.checkNotNullParameter(response_category, "response_category");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(cumulative_quantity, "cumulative_quantity");
        Intrinsics.checkNotNullParameter(leaves_quantity, "leaves_quantity");
        Intrinsics.checkNotNullParameter(canceled_quantity, "canceled_quantity");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(average_executed_price, "average_executed_price");
        Intrinsics.checkNotNullParameter(user_entered_order_total, "user_entered_order_total");
        Intrinsics.checkNotNullParameter(cumulative_order_value, "cumulative_order_value");
        Intrinsics.checkNotNullParameter(rounded_cumulative_order_value, "rounded_cumulative_order_value");
        Intrinsics.checkNotNullParameter(remaining_notional, "remaining_notional");
        Intrinsics.checkNotNullParameter(entered_amount, "entered_amount");
        Intrinsics.checkNotNullParameter(executions, "executions");
        Intrinsics.checkNotNullParameter(initiator_type, "initiator_type");
        Intrinsics.checkNotNullParameter(initiator_id, "initiator_id");
        Intrinsics.checkNotNullParameter(reference_id, "reference_id");
        Intrinsics.checkNotNullParameter(funding_source_type, "funding_source_type");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(stop_price, "stop_price");
        Intrinsics.checkNotNullParameter(fee_amount, "fee_amount");
        Intrinsics.checkNotNullParameter(rounded_order_value_with_fee, "rounded_order_value_with_fee");
        Intrinsics.checkNotNullParameter(num_selected_lots, "num_selected_lots");
        Intrinsics.checkNotNullParameter(tax_lot_term_type, "tax_lot_term_type");
        Intrinsics.checkNotNullParameter(tax_lot_disposal_method, "tax_lot_disposal_method");
        return new CryptoOrderDetailsDto(new Surrogate(state, type2, side, time_in_force, cancel_agent, response_category, currency_pair, quantity, cumulative_quantity, leaves_quantity, canceled_quantity, price, average_executed_price, user_entered_order_total, cumulative_order_value, rounded_cumulative_order_value, remaining_notional, entered_amount, executions, brokerage_accounting_details, last_transaction_at, initiator_type, initiator_id, reference_id, is_eligible_for_bonus, funding_source_type, account_id, stop_price, submitted_at, fee_amount, rounded_order_value_with_fee, num_selected_lots, tax_lot_term_type, estimated_gain_loss, tax_lot_disposal_method, updated_at));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CryptoOrderDetails toProto() {
        State state = (State) this.surrogate.getState().toProto();
        OrderType orderType = (OrderType) this.surrogate.getType().toProto();
        Side side = (Side) this.surrogate.getSide().toProto();
        TimeInForce timeInForce = (TimeInForce) this.surrogate.getTime_in_force().toProto();
        Agent agent = (Agent) this.surrogate.getCancel_agent().toProto();
        ResponseCategory responseCategory = (ResponseCategory) this.surrogate.getResponse_category().toProto();
        CurrencyPairDto currency_pair = this.surrogate.getCurrency_pair();
        CurrencyPair proto = currency_pair != null ? currency_pair.toProto() : null;
        String quantity = this.surrogate.getQuantity();
        String cumulative_quantity = this.surrogate.getCumulative_quantity();
        String leaves_quantity = this.surrogate.getLeaves_quantity();
        String canceled_quantity = this.surrogate.getCanceled_quantity();
        String price = this.surrogate.getPrice();
        String average_executed_price = this.surrogate.getAverage_executed_price();
        String user_entered_order_total = this.surrogate.getUser_entered_order_total();
        String cumulative_order_value = this.surrogate.getCumulative_order_value();
        String rounded_cumulative_order_value = this.surrogate.getRounded_cumulative_order_value();
        String remaining_notional = this.surrogate.getRemaining_notional();
        String entered_amount = this.surrogate.getEntered_amount();
        List<ExecutionDto> executions = this.surrogate.getExecutions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(executions, 10));
        Iterator<T> it = executions.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExecutionDto) it.next()).toProto());
        }
        BrokerageAccountingDetailsDto brokerage_accounting_details = this.surrogate.getBrokerage_accounting_details();
        BrokerageAccountingDetails proto2 = brokerage_accounting_details != null ? brokerage_accounting_details.toProto() : null;
        Instant last_transaction_at = this.surrogate.getLast_transaction_at();
        InitiatorType initiatorType = (InitiatorType) this.surrogate.getInitiator_type().toProto();
        ByteString initiator_id = this.surrogate.getInitiator_id();
        ByteString reference_id = this.surrogate.getReference_id();
        boolean zIs_eligible_for_bonus = this.surrogate.is_eligible_for_bonus();
        String funding_source_type = this.surrogate.getFunding_source_type();
        ByteString account_id = this.surrogate.getAccount_id();
        String stop_price = this.surrogate.getStop_price();
        Instant submitted_at = this.surrogate.getSubmitted_at();
        String fee_amount = this.surrogate.getFee_amount();
        String rounded_order_value_with_fee = this.surrogate.getRounded_order_value_with_fee();
        String num_selected_lots = this.surrogate.getNum_selected_lots();
        String tax_lot_term_type = this.surrogate.getTax_lot_term_type();
        MoneyDto estimated_gain_loss = this.surrogate.getEstimated_gain_loss();
        return new CryptoOrderDetails(state, orderType, side, timeInForce, agent, responseCategory, proto, quantity, cumulative_quantity, leaves_quantity, canceled_quantity, price, average_executed_price, user_entered_order_total, cumulative_order_value, rounded_cumulative_order_value, remaining_notional, entered_amount, arrayList, proto2, last_transaction_at, initiatorType, initiator_id, reference_id, zIs_eligible_for_bonus, funding_source_type, account_id, stop_price, submitted_at, fee_amount, rounded_order_value_with_fee, num_selected_lots, tax_lot_term_type, estimated_gain_loss != null ? estimated_gain_loss.toProto() : null, (DisposalMethod) this.surrogate.getTax_lot_disposal_method().toProto(), this.surrogate.getUpdated_at(), null, 0, 16, null);
    }

    public String toString() {
        return "[CryptoOrderDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoOrderDetailsDto) && Intrinsics.areEqual(((CryptoOrderDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: CryptoOrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000©\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0003\b\u009a\u0001\b\u0083\b\u0018\u0000 á\u00012\u00020\u0001:\u0004â\u0001á\u0001B\u009a\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012.\b\u0002\u0010&\u001a(\u0018\u00010!j\u0013\u0018\u0001`\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\u0017\b\u0002\u0010+\u001a\u00110)¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0*\u0012\u0017\b\u0002\u0010,\u001a\u00110)¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0*\u0012\b\b\u0002\u0010.\u001a\u00020-\u0012\b\b\u0002\u0010/\u001a\u00020\u0010\u0012\u0017\b\u0002\u00100\u001a\u00110)¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0*\u0012\b\b\u0002\u00101\u001a\u00020\u0010\u0012.\b\u0002\u00102\u001a(\u0018\u00010!j\u0013\u0018\u0001`\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%\u0012\b\b\u0002\u00103\u001a\u00020\u0010\u0012\b\b\u0002\u00104\u001a\u00020\u0010\u0012\b\b\u0002\u00105\u001a\u00020\u0010\u0012\b\b\u0002\u00106\u001a\u00020\u0010\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107\u0012\b\b\u0002\u0010:\u001a\u000209\u0012.\b\u0002\u0010;\u001a(\u0018\u00010!j\u0013\u0018\u0001`\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%¢\u0006\u0004\b<\u0010=B\u008f\u0003\b\u0010\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010@\u001a\u00020>\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010&\u001a\u0004\u0018\u00010!\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010+\u001a\u0004\u0018\u00010)\u0012\b\u0010,\u001a\u0004\u0018\u00010)\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0010\u0012\b\u00100\u001a\u0004\u0018\u00010)\u0012\b\u00101\u001a\u0004\u0018\u00010\u0010\u0012\b\u00102\u001a\u0004\u0018\u00010!\u0012\b\u00103\u001a\u0004\u0018\u00010\u0010\u0012\b\u00104\u001a\u0004\u0018\u00010\u0010\u0012\b\u00105\u001a\u0004\u0018\u00010\u0010\u0012\b\u00106\u001a\u0004\u0018\u00010\u0010\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\b\u0010;\u001a\u0004\u0018\u00010!\u0012\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\b<\u0010CJ'\u0010L\u001a\u00020I2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010M\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b]\u0010\\J\u0010\u0010^\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b^\u0010\\J\u0010\u0010_\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b_\u0010\\J\u0010\u0010`\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b`\u0010\\J\u0010\u0010a\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\ba\u0010\\J\u0010\u0010b\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bb\u0010\\J\u0010\u0010c\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bc\u0010\\J\u0010\u0010d\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bd\u0010\\J\u0010\u0010e\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\be\u0010\\J\u0010\u0010f\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bf\u0010\\J\u0016\u0010g\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cHÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0012\u0010i\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bi\u0010jJ6\u0010k\u001a(\u0018\u00010!j\u0013\u0018\u0001`\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%HÆ\u0003¢\u0006\u0004\bk\u0010lJ\u0010\u0010m\u001a\u00020'HÆ\u0003¢\u0006\u0004\bm\u0010nJ\u001f\u0010o\u001a\u00110)¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0*HÆ\u0003¢\u0006\u0004\bo\u0010pJ\u001f\u0010q\u001a\u00110)¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0*HÆ\u0003¢\u0006\u0004\bq\u0010pJ\u0010\u0010r\u001a\u00020-HÆ\u0003¢\u0006\u0004\br\u0010sJ\u0010\u0010t\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bt\u0010\\J\u001f\u0010u\u001a\u00110)¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0*HÆ\u0003¢\u0006\u0004\bu\u0010pJ\u0010\u0010v\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bv\u0010\\J6\u0010w\u001a(\u0018\u00010!j\u0013\u0018\u0001`\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%HÆ\u0003¢\u0006\u0004\bw\u0010lJ\u0010\u0010x\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bx\u0010\\J\u0010\u0010y\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\by\u0010\\J\u0010\u0010z\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bz\u0010\\J\u0010\u0010{\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b{\u0010\\J\u0012\u0010|\u001a\u0004\u0018\u000107HÆ\u0003¢\u0006\u0004\b|\u0010}J\u0010\u0010~\u001a\u000209HÆ\u0003¢\u0006\u0004\b~\u0010\u007fJ8\u0010\u0080\u0001\u001a(\u0018\u00010!j\u0013\u0018\u0001`\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%HÆ\u0003¢\u0006\u0005\b\u0080\u0001\u0010lJ¦\u0004\u0010\u0081\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00102\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2.\b\u0002\u0010&\u001a(\u0018\u00010!j\u0013\u0018\u0001`\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%2\b\b\u0002\u0010(\u001a\u00020'2\u0017\b\u0002\u0010+\u001a\u00110)¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0*2\u0017\b\u0002\u0010,\u001a\u00110)¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0*2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\u00102\u0017\b\u0002\u00100\u001a\u00110)¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0*2\b\b\u0002\u00101\u001a\u00020\u00102.\b\u0002\u00102\u001a(\u0018\u00010!j\u0013\u0018\u0001`\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%2\b\b\u0002\u00103\u001a\u00020\u00102\b\b\u0002\u00104\u001a\u00020\u00102\b\b\u0002\u00105\u001a\u00020\u00102\b\b\u0002\u00106\u001a\u00020\u00102\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0002\u0010:\u001a\u0002092.\b\u0002\u0010;\u001a(\u0018\u00010!j\u0013\u0018\u0001`\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%HÆ\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0012\u0010\u0083\u0001\u001a\u00020\u0010HÖ\u0001¢\u0006\u0005\b\u0083\u0001\u0010\\J\u0013\u0010\u0084\u0001\u001a\u00020>HÖ\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001e\u0010\u0087\u0001\u001a\u00020-2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001R$\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0003\u0010\u0089\u0001\u0012\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0005\b\u008a\u0001\u0010NR$\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0005\u0010\u008d\u0001\u0012\u0006\b\u008f\u0001\u0010\u008c\u0001\u001a\u0005\b\u008e\u0001\u0010PR$\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0007\u0010\u0090\u0001\u0012\u0006\b\u0092\u0001\u0010\u008c\u0001\u001a\u0005\b\u0091\u0001\u0010RR$\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\t\u0010\u0093\u0001\u0012\u0006\b\u0095\u0001\u0010\u008c\u0001\u001a\u0005\b\u0094\u0001\u0010TR$\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000b\u0010\u0096\u0001\u0012\u0006\b\u0098\u0001\u0010\u008c\u0001\u001a\u0005\b\u0097\u0001\u0010VR$\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\r\u0010\u0099\u0001\u0012\u0006\b\u009b\u0001\u0010\u008c\u0001\u001a\u0005\b\u009a\u0001\u0010XR&\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000f\u0010\u009c\u0001\u0012\u0006\b\u009e\u0001\u0010\u008c\u0001\u001a\u0005\b\u009d\u0001\u0010ZR$\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0011\u0010\u009f\u0001\u0012\u0006\b¡\u0001\u0010\u008c\u0001\u001a\u0005\b \u0001\u0010\\R$\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0012\u0010\u009f\u0001\u0012\u0006\b£\u0001\u0010\u008c\u0001\u001a\u0005\b¢\u0001\u0010\\R$\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0013\u0010\u009f\u0001\u0012\u0006\b¥\u0001\u0010\u008c\u0001\u001a\u0005\b¤\u0001\u0010\\R$\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0014\u0010\u009f\u0001\u0012\u0006\b§\u0001\u0010\u008c\u0001\u001a\u0005\b¦\u0001\u0010\\R$\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0015\u0010\u009f\u0001\u0012\u0006\b©\u0001\u0010\u008c\u0001\u001a\u0005\b¨\u0001\u0010\\R$\u0010\u0016\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0016\u0010\u009f\u0001\u0012\u0006\b«\u0001\u0010\u008c\u0001\u001a\u0005\bª\u0001\u0010\\R$\u0010\u0017\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0017\u0010\u009f\u0001\u0012\u0006\b\u00ad\u0001\u0010\u008c\u0001\u001a\u0005\b¬\u0001\u0010\\R$\u0010\u0018\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0018\u0010\u009f\u0001\u0012\u0006\b¯\u0001\u0010\u008c\u0001\u001a\u0005\b®\u0001\u0010\\R$\u0010\u0019\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0019\u0010\u009f\u0001\u0012\u0006\b±\u0001\u0010\u008c\u0001\u001a\u0005\b°\u0001\u0010\\R$\u0010\u001a\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001a\u0010\u009f\u0001\u0012\u0006\b³\u0001\u0010\u008c\u0001\u001a\u0005\b²\u0001\u0010\\R$\u0010\u001b\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001b\u0010\u009f\u0001\u0012\u0006\bµ\u0001\u0010\u008c\u0001\u001a\u0005\b´\u0001\u0010\\R*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001e\u0010¶\u0001\u0012\u0006\b¸\u0001\u0010\u008c\u0001\u001a\u0005\b·\u0001\u0010hR&\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b \u0010¹\u0001\u0012\u0006\b»\u0001\u0010\u008c\u0001\u001a\u0005\bº\u0001\u0010jRJ\u0010&\u001a(\u0018\u00010!j\u0013\u0018\u0001`\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b&\u0010¼\u0001\u0012\u0006\b¾\u0001\u0010\u008c\u0001\u001a\u0005\b½\u0001\u0010lR$\u0010(\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b(\u0010¿\u0001\u0012\u0006\bÁ\u0001\u0010\u008c\u0001\u001a\u0005\bÀ\u0001\u0010nR3\u0010+\u001a\u00110)¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0*8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b+\u0010Â\u0001\u0012\u0006\bÄ\u0001\u0010\u008c\u0001\u001a\u0005\bÃ\u0001\u0010pR3\u0010,\u001a\u00110)¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0*8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b,\u0010Â\u0001\u0012\u0006\bÆ\u0001\u0010\u008c\u0001\u001a\u0005\bÅ\u0001\u0010pR#\u0010.\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b.\u0010Ç\u0001\u0012\u0006\bÈ\u0001\u0010\u008c\u0001\u001a\u0004\b.\u0010sR$\u0010/\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b/\u0010\u009f\u0001\u0012\u0006\bÊ\u0001\u0010\u008c\u0001\u001a\u0005\bÉ\u0001\u0010\\R3\u00100\u001a\u00110)¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0*8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b0\u0010Â\u0001\u0012\u0006\bÌ\u0001\u0010\u008c\u0001\u001a\u0005\bË\u0001\u0010pR$\u00101\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b1\u0010\u009f\u0001\u0012\u0006\bÎ\u0001\u0010\u008c\u0001\u001a\u0005\bÍ\u0001\u0010\\RJ\u00102\u001a(\u0018\u00010!j\u0013\u0018\u0001`\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b2\u0010¼\u0001\u0012\u0006\bÐ\u0001\u0010\u008c\u0001\u001a\u0005\bÏ\u0001\u0010lR$\u00103\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b3\u0010\u009f\u0001\u0012\u0006\bÒ\u0001\u0010\u008c\u0001\u001a\u0005\bÑ\u0001\u0010\\R$\u00104\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b4\u0010\u009f\u0001\u0012\u0006\bÔ\u0001\u0010\u008c\u0001\u001a\u0005\bÓ\u0001\u0010\\R$\u00105\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b5\u0010\u009f\u0001\u0012\u0006\bÖ\u0001\u0010\u008c\u0001\u001a\u0005\bÕ\u0001\u0010\\R$\u00106\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b6\u0010\u009f\u0001\u0012\u0006\bØ\u0001\u0010\u008c\u0001\u001a\u0005\b×\u0001\u0010\\R&\u00108\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b8\u0010Ù\u0001\u0012\u0006\bÛ\u0001\u0010\u008c\u0001\u001a\u0005\bÚ\u0001\u0010}R$\u0010:\u001a\u0002098\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b:\u0010Ü\u0001\u0012\u0006\bÞ\u0001\u0010\u008c\u0001\u001a\u0005\bÝ\u0001\u0010\u007fRJ\u0010;\u001a(\u0018\u00010!j\u0013\u0018\u0001`\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\t0%8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b;\u0010¼\u0001\u0012\u0006\bà\u0001\u0010\u008c\u0001\u001a\u0005\bß\u0001\u0010l¨\u0006ã\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto$Surrogate;", "", "Lrosetta/order/StateDto;", "state", "Lrosetta/order/OrderTypeDto;", "type", "Lrosetta/order/SideDto;", "side", "Lrosetta/order/TimeInForceDto;", "time_in_force", "Lrosetta/order/AgentDto;", "cancel_agent", "Lrosetta/order/ResponseCategoryDto;", "response_category", "Lrosetta/nummus/CurrencyPairDto;", Content.MarketIndicator.CRYPTO_TYPE, "", "quantity", "cumulative_quantity", "leaves_quantity", "canceled_quantity", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "average_executed_price", "user_entered_order_total", "cumulative_order_value", "rounded_cumulative_order_value", "remaining_notional", "entered_amount", "", "Lcom/robinhood/rosetta/nummus/ExecutionDto;", "executions", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "brokerage_accounting_details", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "last_transaction_at", "Lrosetta/order/InitiatorTypeDto;", "initiator_type", "Lokio/ByteString;", "Lcom/robinhood/idl/serialization/ByteStringSerializer;", "initiator_id", "reference_id", "", "is_eligible_for_bonus", "funding_source_type", "account_id", "stop_price", "submitted_at", "fee_amount", "rounded_order_value_with_fee", "num_selected_lots", "tax_lot_term_type", "Lcom/robinhood/rosetta/common/MoneyDto;", "estimated_gain_loss", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;", "tax_lot_disposal_method", "updated_at", "<init>", "(Lrosetta/order/StateDto;Lrosetta/order/OrderTypeDto;Lrosetta/order/SideDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/AgentDto;Lrosetta/order/ResponseCategoryDto;Lrosetta/nummus/CurrencyPairDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;Lj$/time/Instant;Lrosetta/order/InitiatorTypeDto;Lokio/ByteString;Lokio/ByteString;ZLjava/lang/String;Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;Lj$/time/Instant;)V", "", "seen0", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILrosetta/order/StateDto;Lrosetta/order/OrderTypeDto;Lrosetta/order/SideDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/AgentDto;Lrosetta/order/ResponseCategoryDto;Lrosetta/nummus/CurrencyPairDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;Lj$/time/Instant;Lrosetta/order/InitiatorTypeDto;Lokio/ByteString;Lokio/ByteString;ZLjava/lang/String;Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_nummus_nummus_externalRelease", "(Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lrosetta/order/StateDto;", "component2", "()Lrosetta/order/OrderTypeDto;", "component3", "()Lrosetta/order/SideDto;", "component4", "()Lrosetta/order/TimeInForceDto;", "component5", "()Lrosetta/order/AgentDto;", "component6", "()Lrosetta/order/ResponseCategoryDto;", "component7", "()Lrosetta/nummus/CurrencyPairDto;", "component8", "()Ljava/lang/String;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Ljava/util/List;", "component20", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "component21", "()Lj$/time/Instant;", "component22", "()Lrosetta/order/InitiatorTypeDto;", "component23", "()Lokio/ByteString;", "component24", "component25", "()Z", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component35", "()Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;", "component36", "copy", "(Lrosetta/order/StateDto;Lrosetta/order/OrderTypeDto;Lrosetta/order/SideDto;Lrosetta/order/TimeInForceDto;Lrosetta/order/AgentDto;Lrosetta/order/ResponseCategoryDto;Lrosetta/nummus/CurrencyPairDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;Lj$/time/Instant;Lrosetta/order/InitiatorTypeDto;Lokio/ByteString;Lokio/ByteString;ZLjava/lang/String;Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;Lj$/time/Instant;)Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto$Surrogate;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/order/StateDto;", "getState", "getState$annotations", "()V", "Lrosetta/order/OrderTypeDto;", "getType", "getType$annotations", "Lrosetta/order/SideDto;", "getSide", "getSide$annotations", "Lrosetta/order/TimeInForceDto;", "getTime_in_force", "getTime_in_force$annotations", "Lrosetta/order/AgentDto;", "getCancel_agent", "getCancel_agent$annotations", "Lrosetta/order/ResponseCategoryDto;", "getResponse_category", "getResponse_category$annotations", "Lrosetta/nummus/CurrencyPairDto;", "getCurrency_pair", "getCurrency_pair$annotations", "Ljava/lang/String;", "getQuantity", "getQuantity$annotations", "getCumulative_quantity", "getCumulative_quantity$annotations", "getLeaves_quantity", "getLeaves_quantity$annotations", "getCanceled_quantity", "getCanceled_quantity$annotations", "getPrice", "getPrice$annotations", "getAverage_executed_price", "getAverage_executed_price$annotations", "getUser_entered_order_total", "getUser_entered_order_total$annotations", "getCumulative_order_value", "getCumulative_order_value$annotations", "getRounded_cumulative_order_value", "getRounded_cumulative_order_value$annotations", "getRemaining_notional", "getRemaining_notional$annotations", "getEntered_amount", "getEntered_amount$annotations", "Ljava/util/List;", "getExecutions", "getExecutions$annotations", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "getBrokerage_accounting_details", "getBrokerage_accounting_details$annotations", "Lj$/time/Instant;", "getLast_transaction_at", "getLast_transaction_at$annotations", "Lrosetta/order/InitiatorTypeDto;", "getInitiator_type", "getInitiator_type$annotations", "Lokio/ByteString;", "getInitiator_id", "getInitiator_id$annotations", "getReference_id", "getReference_id$annotations", "Z", "is_eligible_for_bonus$annotations", "getFunding_source_type", "getFunding_source_type$annotations", "getAccount_id", "getAccount_id$annotations", "getStop_price", "getStop_price$annotations", "getSubmitted_at", "getSubmitted_at$annotations", "getFee_amount", "getFee_amount$annotations", "getRounded_order_value_with_fee", "getRounded_order_value_with_fee$annotations", "getNum_selected_lots", "getNum_selected_lots$annotations", "getTax_lot_term_type", "getTax_lot_term_type$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getEstimated_gain_loss", "getEstimated_gain_loss$annotations", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;", "getTax_lot_disposal_method", "getTax_lot_disposal_method$annotations", "getUpdated_at", "getUpdated_at$annotations", "Companion", "$serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final ByteString account_id;
        private final String average_executed_price;
        private final BrokerageAccountingDetailsDto brokerage_accounting_details;
        private final AgentDto cancel_agent;
        private final String canceled_quantity;
        private final String cumulative_order_value;
        private final String cumulative_quantity;
        private final CurrencyPairDto currency_pair;
        private final String entered_amount;
        private final MoneyDto estimated_gain_loss;
        private final List<ExecutionDto> executions;
        private final String fee_amount;
        private final String funding_source_type;
        private final ByteString initiator_id;
        private final InitiatorTypeDto initiator_type;
        private final boolean is_eligible_for_bonus;
        private final Instant last_transaction_at;
        private final String leaves_quantity;
        private final String num_selected_lots;
        private final String price;
        private final String quantity;
        private final ByteString reference_id;
        private final String remaining_notional;
        private final ResponseCategoryDto response_category;
        private final String rounded_cumulative_order_value;
        private final String rounded_order_value_with_fee;
        private final SideDto side;
        private final StateDto state;
        private final String stop_price;
        private final Instant submitted_at;
        private final DisposalMethodDto tax_lot_disposal_method;
        private final String tax_lot_term_type;
        private final TimeInForceDto time_in_force;
        private final OrderTypeDto type;
        private final Instant updated_at;
        private final String user_entered_order_total;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.nummus.CryptoOrderDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoOrderDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((StateDto) null, (OrderTypeDto) null, (SideDto) null, (TimeInForceDto) null, (AgentDto) null, (ResponseCategoryDto) null, (CurrencyPairDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (BrokerageAccountingDetailsDto) null, (Instant) null, (InitiatorTypeDto) null, (ByteString) null, (ByteString) null, false, (String) null, (ByteString) null, (String) null, (Instant) null, (String) null, (String) null, (String) null, (String) null, (MoneyDto) null, (DisposalMethodDto) null, (Instant) null, -1, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ExecutionDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, StateDto stateDto, OrderTypeDto orderTypeDto, SideDto sideDto, TimeInForceDto timeInForceDto, AgentDto agentDto, ResponseCategoryDto responseCategoryDto, CurrencyPairDto currencyPairDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, Instant instant, InitiatorTypeDto initiatorTypeDto, ByteString byteString, ByteString byteString2, boolean z, String str12, ByteString byteString3, String str13, Instant instant2, String str14, String str15, String str16, String str17, MoneyDto moneyDto, DisposalMethodDto disposalMethodDto, Instant instant3, int i, int i2, Object obj) {
            Instant instant4;
            DisposalMethodDto disposalMethodDto2;
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto2;
            Instant instant5;
            InitiatorTypeDto initiatorTypeDto2;
            ByteString byteString4;
            ByteString byteString5;
            boolean z2;
            String str18;
            ByteString byteString6;
            String str19;
            Instant instant6;
            String str20;
            String str21;
            String str22;
            String str23;
            MoneyDto moneyDto2;
            String str24;
            AgentDto agentDto2;
            ResponseCategoryDto responseCategoryDto2;
            CurrencyPairDto currencyPairDto2;
            String str25;
            String str26;
            String str27;
            String str28;
            String str29;
            String str30;
            String str31;
            String str32;
            String str33;
            String str34;
            List list2;
            OrderTypeDto orderTypeDto2;
            SideDto sideDto2;
            TimeInForceDto timeInForceDto2;
            StateDto stateDto2 = (i & 1) != 0 ? surrogate.state : stateDto;
            OrderTypeDto orderTypeDto3 = (i & 2) != 0 ? surrogate.type : orderTypeDto;
            SideDto sideDto3 = (i & 4) != 0 ? surrogate.side : sideDto;
            TimeInForceDto timeInForceDto3 = (i & 8) != 0 ? surrogate.time_in_force : timeInForceDto;
            AgentDto agentDto3 = (i & 16) != 0 ? surrogate.cancel_agent : agentDto;
            ResponseCategoryDto responseCategoryDto3 = (i & 32) != 0 ? surrogate.response_category : responseCategoryDto;
            CurrencyPairDto currencyPairDto3 = (i & 64) != 0 ? surrogate.currency_pair : currencyPairDto;
            String str35 = (i & 128) != 0 ? surrogate.quantity : str;
            String str36 = (i & 256) != 0 ? surrogate.cumulative_quantity : str2;
            String str37 = (i & 512) != 0 ? surrogate.leaves_quantity : str3;
            String str38 = (i & 1024) != 0 ? surrogate.canceled_quantity : str4;
            String str39 = (i & 2048) != 0 ? surrogate.price : str5;
            String str40 = (i & 4096) != 0 ? surrogate.average_executed_price : str6;
            String str41 = (i & 8192) != 0 ? surrogate.user_entered_order_total : str7;
            StateDto stateDto3 = stateDto2;
            String str42 = (i & 16384) != 0 ? surrogate.cumulative_order_value : str8;
            String str43 = (i & 32768) != 0 ? surrogate.rounded_cumulative_order_value : str9;
            String str44 = (i & 65536) != 0 ? surrogate.remaining_notional : str10;
            String str45 = (i & 131072) != 0 ? surrogate.entered_amount : str11;
            List list3 = (i & 262144) != 0 ? surrogate.executions : list;
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto3 = (i & 524288) != 0 ? surrogate.brokerage_accounting_details : brokerageAccountingDetailsDto;
            Instant instant7 = (i & 1048576) != 0 ? surrogate.last_transaction_at : instant;
            InitiatorTypeDto initiatorTypeDto3 = (i & 2097152) != 0 ? surrogate.initiator_type : initiatorTypeDto;
            ByteString byteString7 = (i & 4194304) != 0 ? surrogate.initiator_id : byteString;
            ByteString byteString8 = (i & 8388608) != 0 ? surrogate.reference_id : byteString2;
            boolean z3 = (i & 16777216) != 0 ? surrogate.is_eligible_for_bonus : z;
            String str46 = (i & 33554432) != 0 ? surrogate.funding_source_type : str12;
            ByteString byteString9 = (i & 67108864) != 0 ? surrogate.account_id : byteString3;
            String str47 = (i & 134217728) != 0 ? surrogate.stop_price : str13;
            Instant instant8 = (i & 268435456) != 0 ? surrogate.submitted_at : instant2;
            String str48 = (i & 536870912) != 0 ? surrogate.fee_amount : str14;
            String str49 = (i & 1073741824) != 0 ? surrogate.rounded_order_value_with_fee : str15;
            String str50 = (i & Integer.MIN_VALUE) != 0 ? surrogate.num_selected_lots : str16;
            String str51 = (i2 & 1) != 0 ? surrogate.tax_lot_term_type : str17;
            MoneyDto moneyDto3 = (i2 & 2) != 0 ? surrogate.estimated_gain_loss : moneyDto;
            DisposalMethodDto disposalMethodDto3 = (i2 & 4) != 0 ? surrogate.tax_lot_disposal_method : disposalMethodDto;
            if ((i2 & 8) != 0) {
                disposalMethodDto2 = disposalMethodDto3;
                instant4 = surrogate.updated_at;
                instant5 = instant7;
                initiatorTypeDto2 = initiatorTypeDto3;
                byteString4 = byteString7;
                byteString5 = byteString8;
                z2 = z3;
                str18 = str46;
                byteString6 = byteString9;
                str19 = str47;
                instant6 = instant8;
                str20 = str48;
                str21 = str49;
                str22 = str50;
                str23 = str51;
                moneyDto2 = moneyDto3;
                str24 = str42;
                responseCategoryDto2 = responseCategoryDto3;
                currencyPairDto2 = currencyPairDto3;
                str25 = str35;
                str26 = str36;
                str27 = str37;
                str28 = str38;
                str29 = str39;
                str30 = str40;
                str31 = str41;
                str32 = str43;
                str33 = str44;
                str34 = str45;
                list2 = list3;
                brokerageAccountingDetailsDto2 = brokerageAccountingDetailsDto3;
                orderTypeDto2 = orderTypeDto3;
                sideDto2 = sideDto3;
                timeInForceDto2 = timeInForceDto3;
                agentDto2 = agentDto3;
            } else {
                instant4 = instant3;
                disposalMethodDto2 = disposalMethodDto3;
                brokerageAccountingDetailsDto2 = brokerageAccountingDetailsDto3;
                instant5 = instant7;
                initiatorTypeDto2 = initiatorTypeDto3;
                byteString4 = byteString7;
                byteString5 = byteString8;
                z2 = z3;
                str18 = str46;
                byteString6 = byteString9;
                str19 = str47;
                instant6 = instant8;
                str20 = str48;
                str21 = str49;
                str22 = str50;
                str23 = str51;
                moneyDto2 = moneyDto3;
                str24 = str42;
                agentDto2 = agentDto3;
                responseCategoryDto2 = responseCategoryDto3;
                currencyPairDto2 = currencyPairDto3;
                str25 = str35;
                str26 = str36;
                str27 = str37;
                str28 = str38;
                str29 = str39;
                str30 = str40;
                str31 = str41;
                str32 = str43;
                str33 = str44;
                str34 = str45;
                list2 = list3;
                orderTypeDto2 = orderTypeDto3;
                sideDto2 = sideDto3;
                timeInForceDto2 = timeInForceDto3;
            }
            return surrogate.copy(stateDto3, orderTypeDto2, sideDto2, timeInForceDto2, agentDto2, responseCategoryDto2, currencyPairDto2, str25, str26, str27, str28, str29, str30, str31, str24, str32, str33, str34, list2, brokerageAccountingDetailsDto2, instant5, initiatorTypeDto2, byteString4, byteString5, z2, str18, byteString6, str19, instant6, str20, str21, str22, str23, moneyDto2, disposalMethodDto2, instant4);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("averageExecutedPrice")
        @JsonAnnotations2(names = {"average_executed_price"})
        public static /* synthetic */ void getAverage_executed_price$annotations() {
        }

        @SerialName("brokerageAccountingDetails")
        @JsonAnnotations2(names = {"brokerage_accounting_details"})
        public static /* synthetic */ void getBrokerage_accounting_details$annotations() {
        }

        @SerialName("cancelAgent")
        @JsonAnnotations2(names = {"cancel_agent"})
        public static /* synthetic */ void getCancel_agent$annotations() {
        }

        @SerialName("canceledQuantity")
        @JsonAnnotations2(names = {"canceled_quantity"})
        public static /* synthetic */ void getCanceled_quantity$annotations() {
        }

        @SerialName("cumulativeOrderValue")
        @JsonAnnotations2(names = {"cumulative_order_value"})
        public static /* synthetic */ void getCumulative_order_value$annotations() {
        }

        @SerialName("cumulativeQuantity")
        @JsonAnnotations2(names = {"cumulative_quantity"})
        public static /* synthetic */ void getCumulative_quantity$annotations() {
        }

        @SerialName("currencyPair")
        @JsonAnnotations2(names = {Content.MarketIndicator.CRYPTO_TYPE})
        public static /* synthetic */ void getCurrency_pair$annotations() {
        }

        @SerialName("enteredAmount")
        @JsonAnnotations2(names = {"entered_amount"})
        public static /* synthetic */ void getEntered_amount$annotations() {
        }

        @SerialName("estimatedGainLoss")
        @JsonAnnotations2(names = {"estimated_gain_loss"})
        public static /* synthetic */ void getEstimated_gain_loss$annotations() {
        }

        @SerialName("executions")
        @JsonAnnotations2(names = {"executions"})
        public static /* synthetic */ void getExecutions$annotations() {
        }

        @SerialName("feeAmount")
        @JsonAnnotations2(names = {"fee_amount"})
        public static /* synthetic */ void getFee_amount$annotations() {
        }

        @SerialName("fundingSourceType")
        @JsonAnnotations2(names = {"funding_source_type"})
        public static /* synthetic */ void getFunding_source_type$annotations() {
        }

        @SerialName("initiatorId")
        @JsonAnnotations2(names = {"initiator_id"})
        public static /* synthetic */ void getInitiator_id$annotations() {
        }

        @SerialName("initiatorType")
        @JsonAnnotations2(names = {"initiator_type"})
        public static /* synthetic */ void getInitiator_type$annotations() {
        }

        @SerialName("lastTransactionAt")
        @JsonAnnotations2(names = {"last_transaction_at"})
        public static /* synthetic */ void getLast_transaction_at$annotations() {
        }

        @SerialName("leavesQuantity")
        @JsonAnnotations2(names = {"leaves_quantity"})
        public static /* synthetic */ void getLeaves_quantity$annotations() {
        }

        @SerialName("numSelectedLots")
        @JsonAnnotations2(names = {"num_selected_lots"})
        public static /* synthetic */ void getNum_selected_lots$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("referenceId")
        @JsonAnnotations2(names = {"reference_id"})
        public static /* synthetic */ void getReference_id$annotations() {
        }

        @SerialName("remainingNotional")
        @JsonAnnotations2(names = {"remaining_notional"})
        public static /* synthetic */ void getRemaining_notional$annotations() {
        }

        @SerialName("responseCategory")
        @JsonAnnotations2(names = {"response_category"})
        public static /* synthetic */ void getResponse_category$annotations() {
        }

        @SerialName("roundedCumulativeOrderValue")
        @JsonAnnotations2(names = {"rounded_cumulative_order_value"})
        public static /* synthetic */ void getRounded_cumulative_order_value$annotations() {
        }

        @SerialName("roundedOrderValueWithFee")
        @JsonAnnotations2(names = {"rounded_order_value_with_fee"})
        public static /* synthetic */ void getRounded_order_value_with_fee$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("stopPrice")
        @JsonAnnotations2(names = {"stop_price"})
        public static /* synthetic */ void getStop_price$annotations() {
        }

        @SerialName("submittedAt")
        @JsonAnnotations2(names = {"submitted_at"})
        public static /* synthetic */ void getSubmitted_at$annotations() {
        }

        @SerialName("taxLotDisposalMethod")
        @JsonAnnotations2(names = {"tax_lot_disposal_method"})
        public static /* synthetic */ void getTax_lot_disposal_method$annotations() {
        }

        @SerialName("taxLotTermType")
        @JsonAnnotations2(names = {"tax_lot_term_type"})
        public static /* synthetic */ void getTax_lot_term_type$annotations() {
        }

        @SerialName("timeInForce")
        @JsonAnnotations2(names = {"time_in_force"})
        public static /* synthetic */ void getTime_in_force$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("updatedAt")
        @JsonAnnotations2(names = {"updated_at"})
        public static /* synthetic */ void getUpdated_at$annotations() {
        }

        @SerialName("userEnteredOrderTotal")
        @JsonAnnotations2(names = {"user_entered_order_total"})
        public static /* synthetic */ void getUser_entered_order_total$annotations() {
        }

        @SerialName("isEligibleForBonus")
        @JsonAnnotations2(names = {"is_eligible_for_bonus"})
        public static /* synthetic */ void is_eligible_for_bonus$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final StateDto getState() {
            return this.state;
        }

        /* renamed from: component10, reason: from getter */
        public final String getLeaves_quantity() {
            return this.leaves_quantity;
        }

        /* renamed from: component11, reason: from getter */
        public final String getCanceled_quantity() {
            return this.canceled_quantity;
        }

        /* renamed from: component12, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        /* renamed from: component13, reason: from getter */
        public final String getAverage_executed_price() {
            return this.average_executed_price;
        }

        /* renamed from: component14, reason: from getter */
        public final String getUser_entered_order_total() {
            return this.user_entered_order_total;
        }

        /* renamed from: component15, reason: from getter */
        public final String getCumulative_order_value() {
            return this.cumulative_order_value;
        }

        /* renamed from: component16, reason: from getter */
        public final String getRounded_cumulative_order_value() {
            return this.rounded_cumulative_order_value;
        }

        /* renamed from: component17, reason: from getter */
        public final String getRemaining_notional() {
            return this.remaining_notional;
        }

        /* renamed from: component18, reason: from getter */
        public final String getEntered_amount() {
            return this.entered_amount;
        }

        public final List<ExecutionDto> component19() {
            return this.executions;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderTypeDto getType() {
            return this.type;
        }

        /* renamed from: component20, reason: from getter */
        public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
            return this.brokerage_accounting_details;
        }

        /* renamed from: component21, reason: from getter */
        public final Instant getLast_transaction_at() {
            return this.last_transaction_at;
        }

        /* renamed from: component22, reason: from getter */
        public final InitiatorTypeDto getInitiator_type() {
            return this.initiator_type;
        }

        /* renamed from: component23, reason: from getter */
        public final ByteString getInitiator_id() {
            return this.initiator_id;
        }

        /* renamed from: component24, reason: from getter */
        public final ByteString getReference_id() {
            return this.reference_id;
        }

        /* renamed from: component25, reason: from getter */
        public final boolean getIs_eligible_for_bonus() {
            return this.is_eligible_for_bonus;
        }

        /* renamed from: component26, reason: from getter */
        public final String getFunding_source_type() {
            return this.funding_source_type;
        }

        /* renamed from: component27, reason: from getter */
        public final ByteString getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component28, reason: from getter */
        public final String getStop_price() {
            return this.stop_price;
        }

        /* renamed from: component29, reason: from getter */
        public final Instant getSubmitted_at() {
            return this.submitted_at;
        }

        /* renamed from: component3, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component30, reason: from getter */
        public final String getFee_amount() {
            return this.fee_amount;
        }

        /* renamed from: component31, reason: from getter */
        public final String getRounded_order_value_with_fee() {
            return this.rounded_order_value_with_fee;
        }

        /* renamed from: component32, reason: from getter */
        public final String getNum_selected_lots() {
            return this.num_selected_lots;
        }

        /* renamed from: component33, reason: from getter */
        public final String getTax_lot_term_type() {
            return this.tax_lot_term_type;
        }

        /* renamed from: component34, reason: from getter */
        public final MoneyDto getEstimated_gain_loss() {
            return this.estimated_gain_loss;
        }

        /* renamed from: component35, reason: from getter */
        public final DisposalMethodDto getTax_lot_disposal_method() {
            return this.tax_lot_disposal_method;
        }

        /* renamed from: component36, reason: from getter */
        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: component4, reason: from getter */
        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        /* renamed from: component5, reason: from getter */
        public final AgentDto getCancel_agent() {
            return this.cancel_agent;
        }

        /* renamed from: component6, reason: from getter */
        public final ResponseCategoryDto getResponse_category() {
            return this.response_category;
        }

        /* renamed from: component7, reason: from getter */
        public final CurrencyPairDto getCurrency_pair() {
            return this.currency_pair;
        }

        /* renamed from: component8, reason: from getter */
        public final String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component9, reason: from getter */
        public final String getCumulative_quantity() {
            return this.cumulative_quantity;
        }

        public final Surrogate copy(StateDto state, OrderTypeDto type2, SideDto side, TimeInForceDto time_in_force, AgentDto cancel_agent, ResponseCategoryDto response_category, CurrencyPairDto currency_pair, String quantity, String cumulative_quantity, String leaves_quantity, String canceled_quantity, String price, String average_executed_price, String user_entered_order_total, String cumulative_order_value, String rounded_cumulative_order_value, String remaining_notional, String entered_amount, List<ExecutionDto> executions, BrokerageAccountingDetailsDto brokerage_accounting_details, Instant last_transaction_at, InitiatorTypeDto initiator_type, ByteString initiator_id, ByteString reference_id, boolean is_eligible_for_bonus, String funding_source_type, ByteString account_id, String stop_price, Instant submitted_at, String fee_amount, String rounded_order_value_with_fee, String num_selected_lots, String tax_lot_term_type, MoneyDto estimated_gain_loss, DisposalMethodDto tax_lot_disposal_method, Instant updated_at) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(cancel_agent, "cancel_agent");
            Intrinsics.checkNotNullParameter(response_category, "response_category");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(cumulative_quantity, "cumulative_quantity");
            Intrinsics.checkNotNullParameter(leaves_quantity, "leaves_quantity");
            Intrinsics.checkNotNullParameter(canceled_quantity, "canceled_quantity");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(average_executed_price, "average_executed_price");
            Intrinsics.checkNotNullParameter(user_entered_order_total, "user_entered_order_total");
            Intrinsics.checkNotNullParameter(cumulative_order_value, "cumulative_order_value");
            Intrinsics.checkNotNullParameter(rounded_cumulative_order_value, "rounded_cumulative_order_value");
            Intrinsics.checkNotNullParameter(remaining_notional, "remaining_notional");
            Intrinsics.checkNotNullParameter(entered_amount, "entered_amount");
            Intrinsics.checkNotNullParameter(executions, "executions");
            Intrinsics.checkNotNullParameter(initiator_type, "initiator_type");
            Intrinsics.checkNotNullParameter(initiator_id, "initiator_id");
            Intrinsics.checkNotNullParameter(reference_id, "reference_id");
            Intrinsics.checkNotNullParameter(funding_source_type, "funding_source_type");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(stop_price, "stop_price");
            Intrinsics.checkNotNullParameter(fee_amount, "fee_amount");
            Intrinsics.checkNotNullParameter(rounded_order_value_with_fee, "rounded_order_value_with_fee");
            Intrinsics.checkNotNullParameter(num_selected_lots, "num_selected_lots");
            Intrinsics.checkNotNullParameter(tax_lot_term_type, "tax_lot_term_type");
            Intrinsics.checkNotNullParameter(tax_lot_disposal_method, "tax_lot_disposal_method");
            return new Surrogate(state, type2, side, time_in_force, cancel_agent, response_category, currency_pair, quantity, cumulative_quantity, leaves_quantity, canceled_quantity, price, average_executed_price, user_entered_order_total, cumulative_order_value, rounded_cumulative_order_value, remaining_notional, entered_amount, executions, brokerage_accounting_details, last_transaction_at, initiator_type, initiator_id, reference_id, is_eligible_for_bonus, funding_source_type, account_id, stop_price, submitted_at, fee_amount, rounded_order_value_with_fee, num_selected_lots, tax_lot_term_type, estimated_gain_loss, tax_lot_disposal_method, updated_at);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.state == surrogate.state && this.type == surrogate.type && this.side == surrogate.side && this.time_in_force == surrogate.time_in_force && this.cancel_agent == surrogate.cancel_agent && this.response_category == surrogate.response_category && Intrinsics.areEqual(this.currency_pair, surrogate.currency_pair) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.cumulative_quantity, surrogate.cumulative_quantity) && Intrinsics.areEqual(this.leaves_quantity, surrogate.leaves_quantity) && Intrinsics.areEqual(this.canceled_quantity, surrogate.canceled_quantity) && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.average_executed_price, surrogate.average_executed_price) && Intrinsics.areEqual(this.user_entered_order_total, surrogate.user_entered_order_total) && Intrinsics.areEqual(this.cumulative_order_value, surrogate.cumulative_order_value) && Intrinsics.areEqual(this.rounded_cumulative_order_value, surrogate.rounded_cumulative_order_value) && Intrinsics.areEqual(this.remaining_notional, surrogate.remaining_notional) && Intrinsics.areEqual(this.entered_amount, surrogate.entered_amount) && Intrinsics.areEqual(this.executions, surrogate.executions) && Intrinsics.areEqual(this.brokerage_accounting_details, surrogate.brokerage_accounting_details) && Intrinsics.areEqual(this.last_transaction_at, surrogate.last_transaction_at) && this.initiator_type == surrogate.initiator_type && Intrinsics.areEqual(this.initiator_id, surrogate.initiator_id) && Intrinsics.areEqual(this.reference_id, surrogate.reference_id) && this.is_eligible_for_bonus == surrogate.is_eligible_for_bonus && Intrinsics.areEqual(this.funding_source_type, surrogate.funding_source_type) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.stop_price, surrogate.stop_price) && Intrinsics.areEqual(this.submitted_at, surrogate.submitted_at) && Intrinsics.areEqual(this.fee_amount, surrogate.fee_amount) && Intrinsics.areEqual(this.rounded_order_value_with_fee, surrogate.rounded_order_value_with_fee) && Intrinsics.areEqual(this.num_selected_lots, surrogate.num_selected_lots) && Intrinsics.areEqual(this.tax_lot_term_type, surrogate.tax_lot_term_type) && Intrinsics.areEqual(this.estimated_gain_loss, surrogate.estimated_gain_loss) && this.tax_lot_disposal_method == surrogate.tax_lot_disposal_method && Intrinsics.areEqual(this.updated_at, surrogate.updated_at);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.state.hashCode() * 31) + this.type.hashCode()) * 31) + this.side.hashCode()) * 31) + this.time_in_force.hashCode()) * 31) + this.cancel_agent.hashCode()) * 31) + this.response_category.hashCode()) * 31;
            CurrencyPairDto currencyPairDto = this.currency_pair;
            int iHashCode2 = (((((((((((((((((((((((((iHashCode + (currencyPairDto == null ? 0 : currencyPairDto.hashCode())) * 31) + this.quantity.hashCode()) * 31) + this.cumulative_quantity.hashCode()) * 31) + this.leaves_quantity.hashCode()) * 31) + this.canceled_quantity.hashCode()) * 31) + this.price.hashCode()) * 31) + this.average_executed_price.hashCode()) * 31) + this.user_entered_order_total.hashCode()) * 31) + this.cumulative_order_value.hashCode()) * 31) + this.rounded_cumulative_order_value.hashCode()) * 31) + this.remaining_notional.hashCode()) * 31) + this.entered_amount.hashCode()) * 31) + this.executions.hashCode()) * 31;
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto = this.brokerage_accounting_details;
            int iHashCode3 = (iHashCode2 + (brokerageAccountingDetailsDto == null ? 0 : brokerageAccountingDetailsDto.hashCode())) * 31;
            Instant instant = this.last_transaction_at;
            int iHashCode4 = (((((((((((((((iHashCode3 + (instant == null ? 0 : instant.hashCode())) * 31) + this.initiator_type.hashCode()) * 31) + this.initiator_id.hashCode()) * 31) + this.reference_id.hashCode()) * 31) + Boolean.hashCode(this.is_eligible_for_bonus)) * 31) + this.funding_source_type.hashCode()) * 31) + this.account_id.hashCode()) * 31) + this.stop_price.hashCode()) * 31;
            Instant instant2 = this.submitted_at;
            int iHashCode5 = (((((((((iHashCode4 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.fee_amount.hashCode()) * 31) + this.rounded_order_value_with_fee.hashCode()) * 31) + this.num_selected_lots.hashCode()) * 31) + this.tax_lot_term_type.hashCode()) * 31;
            MoneyDto moneyDto = this.estimated_gain_loss;
            int iHashCode6 = (((iHashCode5 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.tax_lot_disposal_method.hashCode()) * 31;
            Instant instant3 = this.updated_at;
            return iHashCode6 + (instant3 != null ? instant3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(state=" + this.state + ", type=" + this.type + ", side=" + this.side + ", time_in_force=" + this.time_in_force + ", cancel_agent=" + this.cancel_agent + ", response_category=" + this.response_category + ", currency_pair=" + this.currency_pair + ", quantity=" + this.quantity + ", cumulative_quantity=" + this.cumulative_quantity + ", leaves_quantity=" + this.leaves_quantity + ", canceled_quantity=" + this.canceled_quantity + ", price=" + this.price + ", average_executed_price=" + this.average_executed_price + ", user_entered_order_total=" + this.user_entered_order_total + ", cumulative_order_value=" + this.cumulative_order_value + ", rounded_cumulative_order_value=" + this.rounded_cumulative_order_value + ", remaining_notional=" + this.remaining_notional + ", entered_amount=" + this.entered_amount + ", executions=" + this.executions + ", brokerage_accounting_details=" + this.brokerage_accounting_details + ", last_transaction_at=" + this.last_transaction_at + ", initiator_type=" + this.initiator_type + ", initiator_id=" + this.initiator_id + ", reference_id=" + this.reference_id + ", is_eligible_for_bonus=" + this.is_eligible_for_bonus + ", funding_source_type=" + this.funding_source_type + ", account_id=" + this.account_id + ", stop_price=" + this.stop_price + ", submitted_at=" + this.submitted_at + ", fee_amount=" + this.fee_amount + ", rounded_order_value_with_fee=" + this.rounded_order_value_with_fee + ", num_selected_lots=" + this.num_selected_lots + ", tax_lot_term_type=" + this.tax_lot_term_type + ", estimated_gain_loss=" + this.estimated_gain_loss + ", tax_lot_disposal_method=" + this.tax_lot_disposal_method + ", updated_at=" + this.updated_at + ")";
        }

        /* compiled from: CryptoOrderDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto$Surrogate;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoOrderDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, StateDto stateDto, OrderTypeDto orderTypeDto, SideDto sideDto, TimeInForceDto timeInForceDto, AgentDto agentDto, ResponseCategoryDto responseCategoryDto, CurrencyPairDto currencyPairDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, Instant instant, InitiatorTypeDto initiatorTypeDto, ByteString byteString, ByteString byteString2, boolean z, String str12, ByteString byteString3, String str13, Instant instant2, String str14, String str15, String str16, String str17, MoneyDto moneyDto, DisposalMethodDto disposalMethodDto, Instant instant3, SerializationConstructorMarker serializationConstructorMarker) {
            this.state = (i & 1) == 0 ? StateDto.INSTANCE.getZeroValue() : stateDto;
            if ((i & 2) == 0) {
                this.type = OrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = orderTypeDto;
            }
            if ((i & 4) == 0) {
                this.side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.side = sideDto;
            }
            if ((i & 8) == 0) {
                this.time_in_force = TimeInForceDto.INSTANCE.getZeroValue();
            } else {
                this.time_in_force = timeInForceDto;
            }
            if ((i & 16) == 0) {
                this.cancel_agent = AgentDto.INSTANCE.getZeroValue();
            } else {
                this.cancel_agent = agentDto;
            }
            if ((i & 32) == 0) {
                this.response_category = ResponseCategoryDto.INSTANCE.getZeroValue();
            } else {
                this.response_category = responseCategoryDto;
            }
            if ((i & 64) == 0) {
                this.currency_pair = null;
            } else {
                this.currency_pair = currencyPairDto;
            }
            if ((i & 128) == 0) {
                this.quantity = "";
            } else {
                this.quantity = str;
            }
            if ((i & 256) == 0) {
                this.cumulative_quantity = "";
            } else {
                this.cumulative_quantity = str2;
            }
            if ((i & 512) == 0) {
                this.leaves_quantity = "";
            } else {
                this.leaves_quantity = str3;
            }
            if ((i & 1024) == 0) {
                this.canceled_quantity = "";
            } else {
                this.canceled_quantity = str4;
            }
            if ((i & 2048) == 0) {
                this.price = "";
            } else {
                this.price = str5;
            }
            if ((i & 4096) == 0) {
                this.average_executed_price = "";
            } else {
                this.average_executed_price = str6;
            }
            if ((i & 8192) == 0) {
                this.user_entered_order_total = "";
            } else {
                this.user_entered_order_total = str7;
            }
            if ((i & 16384) == 0) {
                this.cumulative_order_value = "";
            } else {
                this.cumulative_order_value = str8;
            }
            if ((32768 & i) == 0) {
                this.rounded_cumulative_order_value = "";
            } else {
                this.rounded_cumulative_order_value = str9;
            }
            if ((65536 & i) == 0) {
                this.remaining_notional = "";
            } else {
                this.remaining_notional = str10;
            }
            if ((131072 & i) == 0) {
                this.entered_amount = "";
            } else {
                this.entered_amount = str11;
            }
            this.executions = (262144 & i) == 0 ? CollectionsKt.emptyList() : list;
            if ((524288 & i) == 0) {
                this.brokerage_accounting_details = null;
            } else {
                this.brokerage_accounting_details = brokerageAccountingDetailsDto;
            }
            if ((1048576 & i) == 0) {
                this.last_transaction_at = null;
            } else {
                this.last_transaction_at = instant;
            }
            this.initiator_type = (2097152 & i) == 0 ? InitiatorTypeDto.INSTANCE.getZeroValue() : initiatorTypeDto;
            this.initiator_id = (4194304 & i) == 0 ? ByteString.EMPTY : byteString;
            this.reference_id = (8388608 & i) == 0 ? ByteString.EMPTY : byteString2;
            this.is_eligible_for_bonus = (16777216 & i) == 0 ? false : z;
            if ((33554432 & i) == 0) {
                this.funding_source_type = "";
            } else {
                this.funding_source_type = str12;
            }
            this.account_id = (67108864 & i) == 0 ? ByteString.EMPTY : byteString3;
            if ((134217728 & i) == 0) {
                this.stop_price = "";
            } else {
                this.stop_price = str13;
            }
            if ((268435456 & i) == 0) {
                this.submitted_at = null;
            } else {
                this.submitted_at = instant2;
            }
            if ((536870912 & i) == 0) {
                this.fee_amount = "";
            } else {
                this.fee_amount = str14;
            }
            if ((1073741824 & i) == 0) {
                this.rounded_order_value_with_fee = "";
            } else {
                this.rounded_order_value_with_fee = str15;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.num_selected_lots = "";
            } else {
                this.num_selected_lots = str16;
            }
            if ((i2 & 1) == 0) {
                this.tax_lot_term_type = "";
            } else {
                this.tax_lot_term_type = str17;
            }
            if ((i2 & 2) == 0) {
                this.estimated_gain_loss = null;
            } else {
                this.estimated_gain_loss = moneyDto;
            }
            this.tax_lot_disposal_method = (i2 & 4) == 0 ? DisposalMethodDto.INSTANCE.getZeroValue() : disposalMethodDto;
            if ((i2 & 8) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_nummus_nummus_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.state != StateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, StateDto.Serializer.INSTANCE, self.state);
            }
            if (self.type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, OrderTypeDto.Serializer.INSTANCE, self.type);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, SideDto.Serializer.INSTANCE, self.side);
            }
            if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
            if (self.cancel_agent != AgentDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, AgentDto.Serializer.INSTANCE, self.cancel_agent);
            }
            if (self.response_category != ResponseCategoryDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, ResponseCategoryDto.Serializer.INSTANCE, self.response_category);
            }
            CurrencyPairDto currencyPairDto = self.currency_pair;
            if (currencyPairDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, CurrencyPairDto.Serializer.INSTANCE, currencyPairDto);
            }
            if (!Intrinsics.areEqual(self.quantity, "")) {
                output.encodeStringElement(serialDesc, 7, self.quantity);
            }
            if (!Intrinsics.areEqual(self.cumulative_quantity, "")) {
                output.encodeStringElement(serialDesc, 8, self.cumulative_quantity);
            }
            if (!Intrinsics.areEqual(self.leaves_quantity, "")) {
                output.encodeStringElement(serialDesc, 9, self.leaves_quantity);
            }
            if (!Intrinsics.areEqual(self.canceled_quantity, "")) {
                output.encodeStringElement(serialDesc, 10, self.canceled_quantity);
            }
            if (!Intrinsics.areEqual(self.price, "")) {
                output.encodeStringElement(serialDesc, 11, self.price);
            }
            if (!Intrinsics.areEqual(self.average_executed_price, "")) {
                output.encodeStringElement(serialDesc, 12, self.average_executed_price);
            }
            if (!Intrinsics.areEqual(self.user_entered_order_total, "")) {
                output.encodeStringElement(serialDesc, 13, self.user_entered_order_total);
            }
            if (!Intrinsics.areEqual(self.cumulative_order_value, "")) {
                output.encodeStringElement(serialDesc, 14, self.cumulative_order_value);
            }
            if (!Intrinsics.areEqual(self.rounded_cumulative_order_value, "")) {
                output.encodeStringElement(serialDesc, 15, self.rounded_cumulative_order_value);
            }
            if (!Intrinsics.areEqual(self.remaining_notional, "")) {
                output.encodeStringElement(serialDesc, 16, self.remaining_notional);
            }
            if (!Intrinsics.areEqual(self.entered_amount, "")) {
                output.encodeStringElement(serialDesc, 17, self.entered_amount);
            }
            if (!Intrinsics.areEqual(self.executions, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 18, lazyArr[18].getValue(), self.executions);
            }
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto = self.brokerage_accounting_details;
            if (brokerageAccountingDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, BrokerageAccountingDetailsDto.Serializer.INSTANCE, brokerageAccountingDetailsDto);
            }
            Instant instant = self.last_transaction_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.initiator_type != InitiatorTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 21, InitiatorTypeDto.Serializer.INSTANCE, self.initiator_type);
            }
            ByteString byteString = self.initiator_id;
            ByteString byteString2 = ByteString.EMPTY;
            if (!Intrinsics.areEqual(byteString, byteString2)) {
                output.encodeSerializableElement(serialDesc, 22, ByteStringSerializer.INSTANCE, self.initiator_id);
            }
            if (!Intrinsics.areEqual(self.reference_id, byteString2)) {
                output.encodeSerializableElement(serialDesc, 23, ByteStringSerializer.INSTANCE, self.reference_id);
            }
            boolean z = self.is_eligible_for_bonus;
            if (z) {
                output.encodeBooleanElement(serialDesc, 24, z);
            }
            if (!Intrinsics.areEqual(self.funding_source_type, "")) {
                output.encodeStringElement(serialDesc, 25, self.funding_source_type);
            }
            if (!Intrinsics.areEqual(self.account_id, byteString2)) {
                output.encodeSerializableElement(serialDesc, 26, ByteStringSerializer.INSTANCE, self.account_id);
            }
            if (!Intrinsics.areEqual(self.stop_price, "")) {
                output.encodeStringElement(serialDesc, 27, self.stop_price);
            }
            Instant instant2 = self.submitted_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 28, WireInstantSerializer.INSTANCE, instant2);
            }
            if (!Intrinsics.areEqual(self.fee_amount, "")) {
                output.encodeStringElement(serialDesc, 29, self.fee_amount);
            }
            if (!Intrinsics.areEqual(self.rounded_order_value_with_fee, "")) {
                output.encodeStringElement(serialDesc, 30, self.rounded_order_value_with_fee);
            }
            if (!Intrinsics.areEqual(self.num_selected_lots, "")) {
                output.encodeStringElement(serialDesc, 31, self.num_selected_lots);
            }
            if (!Intrinsics.areEqual(self.tax_lot_term_type, "")) {
                output.encodeStringElement(serialDesc, 32, self.tax_lot_term_type);
            }
            MoneyDto moneyDto = self.estimated_gain_loss;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 33, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (self.tax_lot_disposal_method != DisposalMethodDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 34, DisposalMethodDto.Serializer.INSTANCE, self.tax_lot_disposal_method);
            }
            Instant instant3 = self.updated_at;
            if (instant3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 35, WireInstantSerializer.INSTANCE, instant3);
            }
        }

        public Surrogate(StateDto state, OrderTypeDto type2, SideDto side, TimeInForceDto time_in_force, AgentDto cancel_agent, ResponseCategoryDto response_category, CurrencyPairDto currencyPairDto, String quantity, String cumulative_quantity, String leaves_quantity, String canceled_quantity, String price, String average_executed_price, String user_entered_order_total, String cumulative_order_value, String rounded_cumulative_order_value, String remaining_notional, String entered_amount, List<ExecutionDto> executions, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, Instant instant, InitiatorTypeDto initiator_type, ByteString initiator_id, ByteString reference_id, boolean z, String funding_source_type, ByteString account_id, String stop_price, Instant instant2, String fee_amount, String rounded_order_value_with_fee, String num_selected_lots, String tax_lot_term_type, MoneyDto moneyDto, DisposalMethodDto tax_lot_disposal_method, Instant instant3) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(cancel_agent, "cancel_agent");
            Intrinsics.checkNotNullParameter(response_category, "response_category");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(cumulative_quantity, "cumulative_quantity");
            Intrinsics.checkNotNullParameter(leaves_quantity, "leaves_quantity");
            Intrinsics.checkNotNullParameter(canceled_quantity, "canceled_quantity");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(average_executed_price, "average_executed_price");
            Intrinsics.checkNotNullParameter(user_entered_order_total, "user_entered_order_total");
            Intrinsics.checkNotNullParameter(cumulative_order_value, "cumulative_order_value");
            Intrinsics.checkNotNullParameter(rounded_cumulative_order_value, "rounded_cumulative_order_value");
            Intrinsics.checkNotNullParameter(remaining_notional, "remaining_notional");
            Intrinsics.checkNotNullParameter(entered_amount, "entered_amount");
            Intrinsics.checkNotNullParameter(executions, "executions");
            Intrinsics.checkNotNullParameter(initiator_type, "initiator_type");
            Intrinsics.checkNotNullParameter(initiator_id, "initiator_id");
            Intrinsics.checkNotNullParameter(reference_id, "reference_id");
            Intrinsics.checkNotNullParameter(funding_source_type, "funding_source_type");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(stop_price, "stop_price");
            Intrinsics.checkNotNullParameter(fee_amount, "fee_amount");
            Intrinsics.checkNotNullParameter(rounded_order_value_with_fee, "rounded_order_value_with_fee");
            Intrinsics.checkNotNullParameter(num_selected_lots, "num_selected_lots");
            Intrinsics.checkNotNullParameter(tax_lot_term_type, "tax_lot_term_type");
            Intrinsics.checkNotNullParameter(tax_lot_disposal_method, "tax_lot_disposal_method");
            this.state = state;
            this.type = type2;
            this.side = side;
            this.time_in_force = time_in_force;
            this.cancel_agent = cancel_agent;
            this.response_category = response_category;
            this.currency_pair = currencyPairDto;
            this.quantity = quantity;
            this.cumulative_quantity = cumulative_quantity;
            this.leaves_quantity = leaves_quantity;
            this.canceled_quantity = canceled_quantity;
            this.price = price;
            this.average_executed_price = average_executed_price;
            this.user_entered_order_total = user_entered_order_total;
            this.cumulative_order_value = cumulative_order_value;
            this.rounded_cumulative_order_value = rounded_cumulative_order_value;
            this.remaining_notional = remaining_notional;
            this.entered_amount = entered_amount;
            this.executions = executions;
            this.brokerage_accounting_details = brokerageAccountingDetailsDto;
            this.last_transaction_at = instant;
            this.initiator_type = initiator_type;
            this.initiator_id = initiator_id;
            this.reference_id = reference_id;
            this.is_eligible_for_bonus = z;
            this.funding_source_type = funding_source_type;
            this.account_id = account_id;
            this.stop_price = stop_price;
            this.submitted_at = instant2;
            this.fee_amount = fee_amount;
            this.rounded_order_value_with_fee = rounded_order_value_with_fee;
            this.num_selected_lots = num_selected_lots;
            this.tax_lot_term_type = tax_lot_term_type;
            this.estimated_gain_loss = moneyDto;
            this.tax_lot_disposal_method = tax_lot_disposal_method;
            this.updated_at = instant3;
        }

        public final StateDto getState() {
            return this.state;
        }

        public /* synthetic */ Surrogate(StateDto stateDto, OrderTypeDto orderTypeDto, SideDto sideDto, TimeInForceDto timeInForceDto, AgentDto agentDto, ResponseCategoryDto responseCategoryDto, CurrencyPairDto currencyPairDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, Instant instant, InitiatorTypeDto initiatorTypeDto, ByteString byteString, ByteString byteString2, boolean z, String str12, ByteString byteString3, String str13, Instant instant2, String str14, String str15, String str16, String str17, MoneyDto moneyDto, DisposalMethodDto disposalMethodDto, Instant instant3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? StateDto.INSTANCE.getZeroValue() : stateDto, (i & 2) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 4) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i & 8) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 16) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i & 32) != 0 ? ResponseCategoryDto.INSTANCE.getZeroValue() : responseCategoryDto, (i & 64) != 0 ? null : currencyPairDto, (i & 128) != 0 ? "" : str, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? "" : str4, (i & 2048) != 0 ? "" : str5, (i & 4096) != 0 ? "" : str6, (i & 8192) != 0 ? "" : str7, (i & 16384) != 0 ? "" : str8, (i & 32768) != 0 ? "" : str9, (i & 65536) != 0 ? "" : str10, (i & 131072) != 0 ? "" : str11, (i & 262144) != 0 ? CollectionsKt.emptyList() : list, (i & 524288) != 0 ? null : brokerageAccountingDetailsDto, (i & 1048576) != 0 ? null : instant, (i & 2097152) != 0 ? InitiatorTypeDto.INSTANCE.getZeroValue() : initiatorTypeDto, (i & 4194304) != 0 ? ByteString.EMPTY : byteString, (i & 8388608) != 0 ? ByteString.EMPTY : byteString2, (i & 16777216) != 0 ? false : z, (i & 33554432) != 0 ? "" : str12, (i & 67108864) != 0 ? ByteString.EMPTY : byteString3, (i & 134217728) != 0 ? "" : str13, (i & 268435456) != 0 ? null : instant2, (i & 536870912) != 0 ? "" : str14, (i & 1073741824) != 0 ? "" : str15, (i & Integer.MIN_VALUE) != 0 ? "" : str16, (i2 & 1) == 0 ? str17 : "", (i2 & 2) != 0 ? null : moneyDto, (i2 & 4) != 0 ? DisposalMethodDto.INSTANCE.getZeroValue() : disposalMethodDto, (i2 & 8) != 0 ? null : instant3);
        }

        public final OrderTypeDto getType() {
            return this.type;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        public final AgentDto getCancel_agent() {
            return this.cancel_agent;
        }

        public final ResponseCategoryDto getResponse_category() {
            return this.response_category;
        }

        public final CurrencyPairDto getCurrency_pair() {
            return this.currency_pair;
        }

        public final String getQuantity() {
            return this.quantity;
        }

        public final String getCumulative_quantity() {
            return this.cumulative_quantity;
        }

        public final String getLeaves_quantity() {
            return this.leaves_quantity;
        }

        public final String getCanceled_quantity() {
            return this.canceled_quantity;
        }

        public final String getPrice() {
            return this.price;
        }

        public final String getAverage_executed_price() {
            return this.average_executed_price;
        }

        public final String getUser_entered_order_total() {
            return this.user_entered_order_total;
        }

        public final String getCumulative_order_value() {
            return this.cumulative_order_value;
        }

        public final String getRounded_cumulative_order_value() {
            return this.rounded_cumulative_order_value;
        }

        public final String getRemaining_notional() {
            return this.remaining_notional;
        }

        public final String getEntered_amount() {
            return this.entered_amount;
        }

        public final List<ExecutionDto> getExecutions() {
            return this.executions;
        }

        public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
            return this.brokerage_accounting_details;
        }

        public final Instant getLast_transaction_at() {
            return this.last_transaction_at;
        }

        public final InitiatorTypeDto getInitiator_type() {
            return this.initiator_type;
        }

        public final ByteString getInitiator_id() {
            return this.initiator_id;
        }

        public final ByteString getReference_id() {
            return this.reference_id;
        }

        public final boolean is_eligible_for_bonus() {
            return this.is_eligible_for_bonus;
        }

        public final String getFunding_source_type() {
            return this.funding_source_type;
        }

        public final ByteString getAccount_id() {
            return this.account_id;
        }

        public final String getStop_price() {
            return this.stop_price;
        }

        public final Instant getSubmitted_at() {
            return this.submitted_at;
        }

        public final String getFee_amount() {
            return this.fee_amount;
        }

        public final String getRounded_order_value_with_fee() {
            return this.rounded_order_value_with_fee;
        }

        public final String getNum_selected_lots() {
            return this.num_selected_lots;
        }

        public final String getTax_lot_term_type() {
            return this.tax_lot_term_type;
        }

        public final MoneyDto getEstimated_gain_loss() {
            return this.estimated_gain_loss;
        }

        public final DisposalMethodDto getTax_lot_disposal_method() {
            return this.tax_lot_disposal_method;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }
    }

    /* compiled from: CryptoOrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;", "Lcom/robinhood/rosetta/nummus/CryptoOrderDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CryptoOrderDetailsDto, CryptoOrderDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoOrderDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoOrderDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoOrderDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoOrderDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoOrderDetails> getProtoAdapter() {
            return CryptoOrderDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoOrderDetailsDto getZeroValue() {
            return CryptoOrderDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoOrderDetailsDto fromProto(CryptoOrderDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            StateDto stateDtoFromProto = StateDto.INSTANCE.fromProto(proto.getState());
            OrderTypeDto orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(proto.getType());
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getSide());
            TimeInForceDto timeInForceDtoFromProto = TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force());
            AgentDto agentDtoFromProto = AgentDto.INSTANCE.fromProto(proto.getCancel_agent());
            ResponseCategoryDto responseCategoryDtoFromProto = ResponseCategoryDto.INSTANCE.fromProto(proto.getResponse_category());
            CurrencyPair currency_pair = proto.getCurrency_pair();
            CurrencyPairDto currencyPairDtoFromProto = currency_pair != null ? CurrencyPairDto.INSTANCE.fromProto(currency_pair) : null;
            String quantity = proto.getQuantity();
            String cumulative_quantity = proto.getCumulative_quantity();
            String leaves_quantity = proto.getLeaves_quantity();
            String canceled_quantity = proto.getCanceled_quantity();
            String price = proto.getPrice();
            String average_executed_price = proto.getAverage_executed_price();
            String user_entered_order_total = proto.getUser_entered_order_total();
            String cumulative_order_value = proto.getCumulative_order_value();
            String rounded_cumulative_order_value = proto.getRounded_cumulative_order_value();
            String remaining_notional = proto.getRemaining_notional();
            String entered_amount = proto.getEntered_amount();
            List<Execution> executions = proto.getExecutions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(executions, 10));
            for (Iterator it = executions.iterator(); it.hasNext(); it = it) {
                arrayList.add(ExecutionDto.INSTANCE.fromProto((Execution) it.next()));
            }
            BrokerageAccountingDetails brokerage_accounting_details = proto.getBrokerage_accounting_details();
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDtoFromProto = brokerage_accounting_details != null ? BrokerageAccountingDetailsDto.INSTANCE.fromProto(brokerage_accounting_details) : null;
            Instant last_transaction_at = proto.getLast_transaction_at();
            InitiatorTypeDto initiatorTypeDtoFromProto = InitiatorTypeDto.INSTANCE.fromProto(proto.getInitiator_type());
            ByteString initiator_id = proto.getInitiator_id();
            ByteString reference_id = proto.getReference_id();
            boolean is_eligible_for_bonus = proto.getIs_eligible_for_bonus();
            String funding_source_type = proto.getFunding_source_type();
            ByteString account_id = proto.getAccount_id();
            String stop_price = proto.getStop_price();
            Instant submitted_at = proto.getSubmitted_at();
            String fee_amount = proto.getFee_amount();
            String rounded_order_value_with_fee = proto.getRounded_order_value_with_fee();
            String num_selected_lots = proto.getNum_selected_lots();
            String tax_lot_term_type = proto.getTax_lot_term_type();
            Money estimated_gain_loss = proto.getEstimated_gain_loss();
            return new CryptoOrderDetailsDto(new Surrogate(stateDtoFromProto, orderTypeDtoFromProto, sideDtoFromProto, timeInForceDtoFromProto, agentDtoFromProto, responseCategoryDtoFromProto, currencyPairDtoFromProto, quantity, cumulative_quantity, leaves_quantity, canceled_quantity, price, average_executed_price, user_entered_order_total, cumulative_order_value, rounded_cumulative_order_value, remaining_notional, entered_amount, arrayList, brokerageAccountingDetailsDtoFromProto, last_transaction_at, initiatorTypeDtoFromProto, initiator_id, reference_id, is_eligible_for_bonus, funding_source_type, account_id, stop_price, submitted_at, fee_amount, rounded_order_value_with_fee, num_selected_lots, tax_lot_term_type, estimated_gain_loss != null ? MoneyDto.INSTANCE.fromProto(estimated_gain_loss) : null, DisposalMethodDto.INSTANCE.fromProto(proto.getTax_lot_disposal_method()), proto.getUpdated_at()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.nummus.CryptoOrderDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoOrderDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new CryptoOrderDetailsDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, -1, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CryptoOrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CryptoOrderDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.nummus.CryptoOrderDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoOrderDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoOrderDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoOrderDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoOrderDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CryptoOrderDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.nummus.CryptoOrderDetailsDto";
        }
    }
}

package com.robinhood.rosetta.nummus;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.cbc.service.tax_lot.p283v1.DisposalMethod;
import com.robinhood.rosetta.brokerage.BrokerageAccountingDetails;
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
import rosetta.nummus.CurrencyPair;
import rosetta.order.Agent;
import rosetta.order.InitiatorType;
import rosetta.order.OrderType;
import rosetta.order.ResponseCategory;
import rosetta.order.Side;
import rosetta.order.State;
import rosetta.order.TimeInForce;

/* compiled from: CryptoOrderDetails.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bJ\u0018\u0000 \u008b\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u008b\u0001B\u009d\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0010\b\u0002\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010)\u001a\u00020'\u0012\b\b\u0002\u0010+\u001a\u00020*\u0012\b\b\u0002\u0010,\u001a\u00020\u0011\u0012\b\b\u0002\u0010-\u001a\u00020'\u0012\b\b\u0002\u0010.\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010/\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#\u0012\b\b\u0002\u00100\u001a\u00020\u0011\u0012\b\b\u0002\u00101\u001a\u00020\u0011\u0012\b\b\u0002\u00102\u001a\u00020\u0011\u0012\b\b\u0002\u00103\u001a\u00020\u0011\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\b\b\u0002\u00107\u001a\u000206\u0012\u0010\b\u0002\u00108\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#\u0012\b\b\u0002\u00109\u001a\u00020'¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0002H\u0017¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020*2\b\u0010?\u001a\u0004\u0018\u00010>H\u0096\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0011H\u0016¢\u0006\u0004\bE\u0010FJ£\u0003\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0010\b\u0002\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020'2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\u00112\b\b\u0002\u0010-\u001a\u00020'2\b\b\u0002\u0010.\u001a\u00020\u00112\u0010\b\u0002\u0010/\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#2\b\b\u0002\u00100\u001a\u00020\u00112\b\b\u0002\u00101\u001a\u00020\u00112\b\b\u0002\u00102\u001a\u00020\u00112\b\b\u0002\u00103\u001a\u00020\u00112\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\b\b\u0002\u00107\u001a\u0002062\u0010\b\u0002\u00108\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#2\b\b\u0002\u00109\u001a\u00020'¢\u0006\u0004\bG\u0010HR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010R\u001a\u0004\bS\u0010TR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010X\u001a\u0004\bY\u0010ZR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010^\u001a\u0004\b_\u0010FR\u001a\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010^\u001a\u0004\b`\u0010FR\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010^\u001a\u0004\ba\u0010FR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010^\u001a\u0004\bb\u0010FR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010^\u001a\u0004\bc\u0010FR\u001a\u0010\u0017\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010^\u001a\u0004\bd\u0010FR\u001a\u0010\u0018\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010^\u001a\u0004\be\u0010FR\u001a\u0010\u0019\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010^\u001a\u0004\bf\u0010FR\u001a\u0010\u001a\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010^\u001a\u0004\bg\u0010FR\u001a\u0010\u001b\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010^\u001a\u0004\bh\u0010FR\u001a\u0010\u001c\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010^\u001a\u0004\bi\u0010FR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010j\u001a\u0004\bk\u0010lR\"\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010m\u001a\u0004\bn\u0010oR\u001a\u0010&\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010p\u001a\u0004\bq\u0010rR\u001a\u0010(\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010)\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010s\u001a\u0004\bv\u0010uR\u001a\u0010+\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010w\u001a\u0004\b+\u0010xR\u001a\u0010,\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010^\u001a\u0004\by\u0010FR\u001a\u0010-\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010s\u001a\u0004\bz\u0010uR\u001a\u0010.\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010^\u001a\u0004\b{\u0010FR\"\u0010/\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010m\u001a\u0004\b|\u0010oR\u001a\u00100\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010^\u001a\u0004\b}\u0010FR\u001a\u00101\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010^\u001a\u0004\b~\u0010FR\u001a\u00102\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010^\u001a\u0004\b\u007f\u0010FR\u001b\u00103\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\r\n\u0004\b3\u0010^\u001a\u0005\b\u0080\u0001\u0010FR\u001f\u00105\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b5\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001d\u00107\u001a\u0002068\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b7\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R#\u00108\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b8\u0010m\u001a\u0005\b\u0087\u0001\u0010oR#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u001f\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u008c\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CryptoOrderDetails;", "Lcom/squareup/wire/Message;", "", "Lrosetta/order/State;", "state", "Lrosetta/order/OrderType;", "type", "Lrosetta/order/Side;", "side", "Lrosetta/order/TimeInForce;", "time_in_force", "Lrosetta/order/Agent;", "cancel_agent", "Lrosetta/order/ResponseCategory;", "response_category", "Lrosetta/nummus/CurrencyPair;", Content.MarketIndicator.CRYPTO_TYPE, "", "quantity", "cumulative_quantity", "leaves_quantity", "canceled_quantity", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "average_executed_price", "user_entered_order_total", "cumulative_order_value", "rounded_cumulative_order_value", "remaining_notional", "entered_amount", "", "Lcom/robinhood/rosetta/nummus/Execution;", "executions", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "brokerage_accounting_details", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_transaction_at", "Lrosetta/order/InitiatorType;", "initiator_type", "Lokio/ByteString;", "initiator_id", "reference_id", "", "is_eligible_for_bonus", "funding_source_type", "account_id", "stop_price", "submitted_at", "fee_amount", "rounded_order_value_with_fee", "num_selected_lots", "tax_lot_term_type", "Lcom/robinhood/rosetta/common/Money;", "estimated_gain_loss", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;", "tax_lot_disposal_method", "updated_at", "unknownFields", "<init>", "(Lrosetta/order/State;Lrosetta/order/OrderType;Lrosetta/order/Side;Lrosetta/order/TimeInForce;Lrosetta/order/Agent;Lrosetta/order/ResponseCategory;Lrosetta/nummus/CurrencyPair;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;Lj$/time/Instant;Lrosetta/order/InitiatorType;Lokio/ByteString;Lokio/ByteString;ZLjava/lang/String;Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lrosetta/order/State;Lrosetta/order/OrderType;Lrosetta/order/Side;Lrosetta/order/TimeInForce;Lrosetta/order/Agent;Lrosetta/order/ResponseCategory;Lrosetta/nummus/CurrencyPair;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;Lj$/time/Instant;Lrosetta/order/InitiatorType;Lokio/ByteString;Lokio/ByteString;ZLjava/lang/String;Lokio/ByteString;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;Lj$/time/Instant;Lokio/ByteString;)Lcom/robinhood/rosetta/nummus/CryptoOrderDetails;", "Lrosetta/order/State;", "getState", "()Lrosetta/order/State;", "Lrosetta/order/OrderType;", "getType", "()Lrosetta/order/OrderType;", "Lrosetta/order/Side;", "getSide", "()Lrosetta/order/Side;", "Lrosetta/order/TimeInForce;", "getTime_in_force", "()Lrosetta/order/TimeInForce;", "Lrosetta/order/Agent;", "getCancel_agent", "()Lrosetta/order/Agent;", "Lrosetta/order/ResponseCategory;", "getResponse_category", "()Lrosetta/order/ResponseCategory;", "Lrosetta/nummus/CurrencyPair;", "getCurrency_pair", "()Lrosetta/nummus/CurrencyPair;", "Ljava/lang/String;", "getQuantity", "getCumulative_quantity", "getLeaves_quantity", "getCanceled_quantity", "getPrice", "getAverage_executed_price", "getUser_entered_order_total", "getCumulative_order_value", "getRounded_cumulative_order_value", "getRemaining_notional", "getEntered_amount", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "getBrokerage_accounting_details", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetails;", "Lj$/time/Instant;", "getLast_transaction_at", "()Lj$/time/Instant;", "Lrosetta/order/InitiatorType;", "getInitiator_type", "()Lrosetta/order/InitiatorType;", "Lokio/ByteString;", "getInitiator_id", "()Lokio/ByteString;", "getReference_id", "Z", "()Z", "getFunding_source_type", "getAccount_id", "getStop_price", "getSubmitted_at", "getFee_amount", "getRounded_order_value_with_fee", "getNum_selected_lots", "getTax_lot_term_type", "Lcom/robinhood/rosetta/common/Money;", "getEstimated_gain_loss", "()Lcom/robinhood/rosetta/common/Money;", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;", "getTax_lot_disposal_method", "()Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethod;", "getUpdated_at", "Ljava/util/List;", "getExecutions", "()Ljava/util/List;", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoOrderDetails extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoOrderDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 27)
    private final ByteString account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "averageExecutedPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 20)
    private final String average_executed_price;

    @WireField(adapter = "com.robinhood.rosetta.brokerage.BrokerageAccountingDetails#ADAPTER", jsonName = "brokerageAccountingDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 11)
    private final BrokerageAccountingDetails brokerage_accounting_details;

    @WireField(adapter = "rosetta.order.Agent#ADAPTER", jsonName = "cancelAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 16)
    private final Agent cancel_agent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "canceledQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 6)
    private final String canceled_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cumulativeOrderValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 9)
    private final String cumulative_order_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cumulativeQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 5)
    private final String cumulative_quantity;

    @WireField(adapter = "rosetta.nummus.CurrencyPair#ADAPTER", jsonName = "currencyPair", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 3)
    private final CurrencyPair currency_pair;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "enteredAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 24)
    private final String entered_amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "estimatedGainLoss", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 33, tag = 34)
    private final Money estimated_gain_loss;

    @WireField(adapter = "com.robinhood.rosetta.nummus.Execution#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 18, tag = 10)
    private final List<Execution> executions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 30)
    private final String fee_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fundingSourceType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 26)
    private final String funding_source_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "initiatorId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 22)
    private final ByteString initiator_id;

    @WireField(adapter = "rosetta.order.InitiatorType#ADAPTER", jsonName = "initiatorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 21)
    private final InitiatorType initiator_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEligibleForBonus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final boolean is_eligible_for_bonus;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lastTransactionAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 19)
    private final Instant last_transaction_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "leavesQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 18)
    private final String leaves_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "numSelectedLots", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 31, tag = 32)
    private final String num_selected_lots;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 7)
    private final String price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 4)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "referenceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 23)
    private final ByteString reference_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "remainingNotional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 12)
    private final String remaining_notional;

    @WireField(adapter = "rosetta.order.ResponseCategory#ADAPTER", jsonName = "responseCategory", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 17)
    private final ResponseCategory response_category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "roundedCumulativeOrderValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 15)
    private final String rounded_cumulative_order_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "roundedOrderValueWithFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 30, tag = 31)
    private final String rounded_order_value_with_fee;

    @WireField(adapter = "rosetta.order.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
    private final Side side;

    @WireField(adapter = "rosetta.order.State#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final State state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stopPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 28)
    private final String stop_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "submittedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 29)
    private final Instant submitted_at;

    @WireField(adapter = "com.robinhood.cbc.service.tax_lot.v1.DisposalMethod#ADAPTER", jsonName = "taxLotDisposalMethod", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 34, tag = 35)
    private final DisposalMethod tax_lot_disposal_method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "taxLotTermType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 32, tag = 33)
    private final String tax_lot_term_type;

    @WireField(adapter = "rosetta.order.TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 14)
    private final TimeInForce time_in_force;

    @WireField(adapter = "rosetta.order.OrderType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 13)
    private final OrderType type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 35, tag = 36)
    private final Instant updated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userEnteredOrderTotal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 8)
    private final String user_entered_order_total;

    public CryptoOrderDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24728newBuilder();
    }

    public final State getState() {
        return this.state;
    }

    public /* synthetic */ CryptoOrderDetails(State state, OrderType orderType, Side side, TimeInForce timeInForce, Agent agent, ResponseCategory responseCategory, CurrencyPair currencyPair, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, BrokerageAccountingDetails brokerageAccountingDetails, Instant instant, InitiatorType initiatorType, ByteString byteString, ByteString byteString2, boolean z, String str12, ByteString byteString3, String str13, Instant instant2, String str14, String str15, String str16, String str17, Money money, DisposalMethod disposalMethod, Instant instant3, ByteString byteString4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? State.STATE_UNSPECIFIED : state, (i & 2) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i & 4) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 8) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i & 16) != 0 ? Agent.AGENT_UNSPECIFIED : agent, (i & 32) != 0 ? ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED : responseCategory, (i & 64) != 0 ? null : currencyPair, (i & 128) != 0 ? "" : str, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? "" : str4, (i & 2048) != 0 ? "" : str5, (i & 4096) != 0 ? "" : str6, (i & 8192) != 0 ? "" : str7, (i & 16384) != 0 ? "" : str8, (i & 32768) != 0 ? "" : str9, (i & 65536) != 0 ? "" : str10, (i & 131072) != 0 ? "" : str11, (i & 262144) != 0 ? CollectionsKt.emptyList() : list, (i & 524288) != 0 ? null : brokerageAccountingDetails, (i & 1048576) != 0 ? null : instant, (i & 2097152) != 0 ? InitiatorType.INITIATOR_TYPE_UNSPECIFIED : initiatorType, (i & 4194304) != 0 ? ByteString.EMPTY : byteString, (i & 8388608) != 0 ? ByteString.EMPTY : byteString2, (i & 16777216) != 0 ? false : z, (i & 33554432) != 0 ? "" : str12, (i & 67108864) != 0 ? ByteString.EMPTY : byteString3, (i & 134217728) != 0 ? "" : str13, (i & 268435456) != 0 ? null : instant2, (i & 536870912) != 0 ? "" : str14, (i & 1073741824) != 0 ? "" : str15, (i & Integer.MIN_VALUE) != 0 ? "" : str16, (i2 & 1) == 0 ? str17 : "", (i2 & 2) != 0 ? null : money, (i2 & 4) != 0 ? DisposalMethod.METHOD_UNSPECIFIED : disposalMethod, (i2 & 8) != 0 ? null : instant3, (i2 & 16) != 0 ? ByteString.EMPTY : byteString4);
    }

    public final OrderType getType() {
        return this.type;
    }

    public final Side getSide() {
        return this.side;
    }

    public final TimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    public final Agent getCancel_agent() {
        return this.cancel_agent;
    }

    public final ResponseCategory getResponse_category() {
        return this.response_category;
    }

    public final CurrencyPair getCurrency_pair() {
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

    public final BrokerageAccountingDetails getBrokerage_accounting_details() {
        return this.brokerage_accounting_details;
    }

    public final Instant getLast_transaction_at() {
        return this.last_transaction_at;
    }

    public final InitiatorType getInitiator_type() {
        return this.initiator_type;
    }

    public final ByteString getInitiator_id() {
        return this.initiator_id;
    }

    public final ByteString getReference_id() {
        return this.reference_id;
    }

    /* renamed from: is_eligible_for_bonus, reason: from getter */
    public final boolean getIs_eligible_for_bonus() {
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

    public final Money getEstimated_gain_loss() {
        return this.estimated_gain_loss;
    }

    public final DisposalMethod getTax_lot_disposal_method() {
        return this.tax_lot_disposal_method;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOrderDetails(State state, OrderType type2, Side side, TimeInForce time_in_force, Agent cancel_agent, ResponseCategory response_category, CurrencyPair currencyPair, String quantity, String cumulative_quantity, String leaves_quantity, String canceled_quantity, String price, String average_executed_price, String user_entered_order_total, String cumulative_order_value, String rounded_cumulative_order_value, String remaining_notional, String entered_amount, List<Execution> executions, BrokerageAccountingDetails brokerageAccountingDetails, Instant instant, InitiatorType initiator_type, ByteString initiator_id, ByteString reference_id, boolean z, String funding_source_type, ByteString account_id, String stop_price, Instant instant2, String fee_amount, String rounded_order_value_with_fee, String num_selected_lots, String tax_lot_term_type, Money money, DisposalMethod tax_lot_disposal_method, Instant instant3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.state = state;
        this.type = type2;
        this.side = side;
        this.time_in_force = time_in_force;
        this.cancel_agent = cancel_agent;
        this.response_category = response_category;
        this.currency_pair = currencyPair;
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
        this.brokerage_accounting_details = brokerageAccountingDetails;
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
        this.estimated_gain_loss = money;
        this.tax_lot_disposal_method = tax_lot_disposal_method;
        this.updated_at = instant3;
        this.executions = Internal.immutableCopyOf("executions", executions);
    }

    public final List<Execution> getExecutions() {
        return this.executions;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24728newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoOrderDetails)) {
            return false;
        }
        CryptoOrderDetails cryptoOrderDetails = (CryptoOrderDetails) other;
        return Intrinsics.areEqual(unknownFields(), cryptoOrderDetails.unknownFields()) && this.state == cryptoOrderDetails.state && this.type == cryptoOrderDetails.type && this.side == cryptoOrderDetails.side && this.time_in_force == cryptoOrderDetails.time_in_force && this.cancel_agent == cryptoOrderDetails.cancel_agent && this.response_category == cryptoOrderDetails.response_category && Intrinsics.areEqual(this.currency_pair, cryptoOrderDetails.currency_pair) && Intrinsics.areEqual(this.quantity, cryptoOrderDetails.quantity) && Intrinsics.areEqual(this.cumulative_quantity, cryptoOrderDetails.cumulative_quantity) && Intrinsics.areEqual(this.leaves_quantity, cryptoOrderDetails.leaves_quantity) && Intrinsics.areEqual(this.canceled_quantity, cryptoOrderDetails.canceled_quantity) && Intrinsics.areEqual(this.price, cryptoOrderDetails.price) && Intrinsics.areEqual(this.average_executed_price, cryptoOrderDetails.average_executed_price) && Intrinsics.areEqual(this.user_entered_order_total, cryptoOrderDetails.user_entered_order_total) && Intrinsics.areEqual(this.cumulative_order_value, cryptoOrderDetails.cumulative_order_value) && Intrinsics.areEqual(this.rounded_cumulative_order_value, cryptoOrderDetails.rounded_cumulative_order_value) && Intrinsics.areEqual(this.remaining_notional, cryptoOrderDetails.remaining_notional) && Intrinsics.areEqual(this.entered_amount, cryptoOrderDetails.entered_amount) && Intrinsics.areEqual(this.executions, cryptoOrderDetails.executions) && Intrinsics.areEqual(this.brokerage_accounting_details, cryptoOrderDetails.brokerage_accounting_details) && Intrinsics.areEqual(this.last_transaction_at, cryptoOrderDetails.last_transaction_at) && this.initiator_type == cryptoOrderDetails.initiator_type && Intrinsics.areEqual(this.initiator_id, cryptoOrderDetails.initiator_id) && Intrinsics.areEqual(this.reference_id, cryptoOrderDetails.reference_id) && this.is_eligible_for_bonus == cryptoOrderDetails.is_eligible_for_bonus && Intrinsics.areEqual(this.funding_source_type, cryptoOrderDetails.funding_source_type) && Intrinsics.areEqual(this.account_id, cryptoOrderDetails.account_id) && Intrinsics.areEqual(this.stop_price, cryptoOrderDetails.stop_price) && Intrinsics.areEqual(this.submitted_at, cryptoOrderDetails.submitted_at) && Intrinsics.areEqual(this.fee_amount, cryptoOrderDetails.fee_amount) && Intrinsics.areEqual(this.rounded_order_value_with_fee, cryptoOrderDetails.rounded_order_value_with_fee) && Intrinsics.areEqual(this.num_selected_lots, cryptoOrderDetails.num_selected_lots) && Intrinsics.areEqual(this.tax_lot_term_type, cryptoOrderDetails.tax_lot_term_type) && Intrinsics.areEqual(this.estimated_gain_loss, cryptoOrderDetails.estimated_gain_loss) && this.tax_lot_disposal_method == cryptoOrderDetails.tax_lot_disposal_method && Intrinsics.areEqual(this.updated_at, cryptoOrderDetails.updated_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.state.hashCode()) * 37) + this.type.hashCode()) * 37) + this.side.hashCode()) * 37) + this.time_in_force.hashCode()) * 37) + this.cancel_agent.hashCode()) * 37) + this.response_category.hashCode()) * 37;
        CurrencyPair currencyPair = this.currency_pair;
        int iHashCode2 = (((((((((((((((((((((((((iHashCode + (currencyPair != null ? currencyPair.hashCode() : 0)) * 37) + this.quantity.hashCode()) * 37) + this.cumulative_quantity.hashCode()) * 37) + this.leaves_quantity.hashCode()) * 37) + this.canceled_quantity.hashCode()) * 37) + this.price.hashCode()) * 37) + this.average_executed_price.hashCode()) * 37) + this.user_entered_order_total.hashCode()) * 37) + this.cumulative_order_value.hashCode()) * 37) + this.rounded_cumulative_order_value.hashCode()) * 37) + this.remaining_notional.hashCode()) * 37) + this.entered_amount.hashCode()) * 37) + this.executions.hashCode()) * 37;
        BrokerageAccountingDetails brokerageAccountingDetails = this.brokerage_accounting_details;
        int iHashCode3 = (iHashCode2 + (brokerageAccountingDetails != null ? brokerageAccountingDetails.hashCode() : 0)) * 37;
        Instant instant = this.last_transaction_at;
        int iHashCode4 = (((((((((((((((iHashCode3 + (instant != null ? instant.hashCode() : 0)) * 37) + this.initiator_type.hashCode()) * 37) + this.initiator_id.hashCode()) * 37) + this.reference_id.hashCode()) * 37) + Boolean.hashCode(this.is_eligible_for_bonus)) * 37) + this.funding_source_type.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.stop_price.hashCode()) * 37;
        Instant instant2 = this.submitted_at;
        int iHashCode5 = (((((((((iHashCode4 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.fee_amount.hashCode()) * 37) + this.rounded_order_value_with_fee.hashCode()) * 37) + this.num_selected_lots.hashCode()) * 37) + this.tax_lot_term_type.hashCode()) * 37;
        Money money = this.estimated_gain_loss;
        int iHashCode6 = (((iHashCode5 + (money != null ? money.hashCode() : 0)) * 37) + this.tax_lot_disposal_method.hashCode()) * 37;
        Instant instant3 = this.updated_at;
        int iHashCode7 = iHashCode6 + (instant3 != null ? instant3.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("state=" + this.state);
        arrayList.add("type=" + this.type);
        arrayList.add("side=" + this.side);
        arrayList.add("time_in_force=" + this.time_in_force);
        arrayList.add("cancel_agent=" + this.cancel_agent);
        arrayList.add("response_category=" + this.response_category);
        CurrencyPair currencyPair = this.currency_pair;
        if (currencyPair != null) {
            arrayList.add("currency_pair=" + currencyPair);
        }
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("cumulative_quantity=" + Internal.sanitize(this.cumulative_quantity));
        arrayList.add("leaves_quantity=" + Internal.sanitize(this.leaves_quantity));
        arrayList.add("canceled_quantity=" + Internal.sanitize(this.canceled_quantity));
        arrayList.add("price=" + Internal.sanitize(this.price));
        arrayList.add("average_executed_price=" + Internal.sanitize(this.average_executed_price));
        arrayList.add("user_entered_order_total=" + Internal.sanitize(this.user_entered_order_total));
        arrayList.add("cumulative_order_value=" + Internal.sanitize(this.cumulative_order_value));
        arrayList.add("rounded_cumulative_order_value=" + Internal.sanitize(this.rounded_cumulative_order_value));
        arrayList.add("remaining_notional=" + Internal.sanitize(this.remaining_notional));
        arrayList.add("entered_amount=" + Internal.sanitize(this.entered_amount));
        if (!this.executions.isEmpty()) {
            arrayList.add("executions=" + this.executions);
        }
        BrokerageAccountingDetails brokerageAccountingDetails = this.brokerage_accounting_details;
        if (brokerageAccountingDetails != null) {
            arrayList.add("brokerage_accounting_details=" + brokerageAccountingDetails);
        }
        Instant instant = this.last_transaction_at;
        if (instant != null) {
            arrayList.add("last_transaction_at=" + instant);
        }
        arrayList.add("initiator_type=" + this.initiator_type);
        arrayList.add("initiator_id=" + this.initiator_id);
        arrayList.add("reference_id=" + this.reference_id);
        arrayList.add("is_eligible_for_bonus=" + this.is_eligible_for_bonus);
        arrayList.add("funding_source_type=" + Internal.sanitize(this.funding_source_type));
        arrayList.add("account_id=" + this.account_id);
        arrayList.add("stop_price=" + Internal.sanitize(this.stop_price));
        Instant instant2 = this.submitted_at;
        if (instant2 != null) {
            arrayList.add("submitted_at=" + instant2);
        }
        arrayList.add("fee_amount=" + Internal.sanitize(this.fee_amount));
        arrayList.add("rounded_order_value_with_fee=" + Internal.sanitize(this.rounded_order_value_with_fee));
        arrayList.add("num_selected_lots=" + Internal.sanitize(this.num_selected_lots));
        arrayList.add("tax_lot_term_type=" + Internal.sanitize(this.tax_lot_term_type));
        Money money = this.estimated_gain_loss;
        if (money != null) {
            arrayList.add("estimated_gain_loss=" + money);
        }
        arrayList.add("tax_lot_disposal_method=" + this.tax_lot_disposal_method);
        Instant instant3 = this.updated_at;
        if (instant3 != null) {
            arrayList.add("updated_at=" + instant3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoOrderDetails{", "}", 0, null, null, 56, null);
    }

    public final CryptoOrderDetails copy(State state, OrderType type2, Side side, TimeInForce time_in_force, Agent cancel_agent, ResponseCategory response_category, CurrencyPair currency_pair, String quantity, String cumulative_quantity, String leaves_quantity, String canceled_quantity, String price, String average_executed_price, String user_entered_order_total, String cumulative_order_value, String rounded_cumulative_order_value, String remaining_notional, String entered_amount, List<Execution> executions, BrokerageAccountingDetails brokerage_accounting_details, Instant last_transaction_at, InitiatorType initiator_type, ByteString initiator_id, ByteString reference_id, boolean is_eligible_for_bonus, String funding_source_type, ByteString account_id, String stop_price, Instant submitted_at, String fee_amount, String rounded_order_value_with_fee, String num_selected_lots, String tax_lot_term_type, Money estimated_gain_loss, DisposalMethod tax_lot_disposal_method, Instant updated_at, ByteString unknownFields) {
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoOrderDetails(state, type2, side, time_in_force, cancel_agent, response_category, currency_pair, quantity, cumulative_quantity, leaves_quantity, canceled_quantity, price, average_executed_price, user_entered_order_total, cumulative_order_value, rounded_cumulative_order_value, remaining_notional, entered_amount, executions, brokerage_accounting_details, last_transaction_at, initiator_type, initiator_id, reference_id, is_eligible_for_bonus, funding_source_type, account_id, stop_price, submitted_at, fee_amount, rounded_order_value_with_fee, num_selected_lots, tax_lot_term_type, estimated_gain_loss, tax_lot_disposal_method, updated_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoOrderDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoOrderDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.nummus.CryptoOrderDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getState() != State.STATE_UNSPECIFIED) {
                    size += State.ADAPTER.encodedSizeWithTag(1, value.getState());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    size += OrderType.ADAPTER.encodedSizeWithTag(13, value.getType());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(2, value.getSide());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    size += TimeInForce.ADAPTER.encodedSizeWithTag(14, value.getTime_in_force());
                }
                if (value.getCancel_agent() != Agent.AGENT_UNSPECIFIED) {
                    size += Agent.ADAPTER.encodedSizeWithTag(16, value.getCancel_agent());
                }
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    size += ResponseCategory.ADAPTER.encodedSizeWithTag(17, value.getResponse_category());
                }
                if (value.getCurrency_pair() != null) {
                    size += CurrencyPair.ADAPTER.encodedSizeWithTag(3, value.getCurrency_pair());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getCumulative_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getCumulative_quantity());
                }
                if (!Intrinsics.areEqual(value.getLeaves_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getLeaves_quantity());
                }
                if (!Intrinsics.areEqual(value.getCanceled_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getCanceled_quantity());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getAverage_executed_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(20, value.getAverage_executed_price());
                }
                if (!Intrinsics.areEqual(value.getUser_entered_order_total(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getUser_entered_order_total());
                }
                if (!Intrinsics.areEqual(value.getCumulative_order_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getCumulative_order_value());
                }
                if (!Intrinsics.areEqual(value.getRounded_cumulative_order_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getRounded_cumulative_order_value());
                }
                if (!Intrinsics.areEqual(value.getRemaining_notional(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getRemaining_notional());
                }
                if (!Intrinsics.areEqual(value.getEntered_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(24, value.getEntered_amount());
                }
                int iEncodedSizeWithTag = size + Execution.ADAPTER.asRepeated().encodedSizeWithTag(10, value.getExecutions());
                if (value.getBrokerage_accounting_details() != null) {
                    iEncodedSizeWithTag += BrokerageAccountingDetails.ADAPTER.encodedSizeWithTag(11, value.getBrokerage_accounting_details());
                }
                if (value.getLast_transaction_at() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(19, value.getLast_transaction_at());
                }
                if (value.getInitiator_type() != InitiatorType.INITIATOR_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += InitiatorType.ADAPTER.encodedSizeWithTag(21, value.getInitiator_type());
                }
                ByteString initiator_id = value.getInitiator_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(initiator_id, byteString)) {
                    iEncodedSizeWithTag += ProtoAdapter.BYTES.encodedSizeWithTag(22, value.getInitiator_id());
                }
                if (!Intrinsics.areEqual(value.getReference_id(), byteString)) {
                    iEncodedSizeWithTag += ProtoAdapter.BYTES.encodedSizeWithTag(23, value.getReference_id());
                }
                if (value.getIs_eligible_for_bonus()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(25, Boolean.valueOf(value.getIs_eligible_for_bonus()));
                }
                if (!Intrinsics.areEqual(value.getFunding_source_type(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(26, value.getFunding_source_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), byteString)) {
                    iEncodedSizeWithTag += ProtoAdapter.BYTES.encodedSizeWithTag(27, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getStop_price(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(28, value.getStop_price());
                }
                if (value.getSubmitted_at() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(29, value.getSubmitted_at());
                }
                if (!Intrinsics.areEqual(value.getFee_amount(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(30, value.getFee_amount());
                }
                if (!Intrinsics.areEqual(value.getRounded_order_value_with_fee(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(31, value.getRounded_order_value_with_fee());
                }
                if (!Intrinsics.areEqual(value.getNum_selected_lots(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(32, value.getNum_selected_lots());
                }
                if (!Intrinsics.areEqual(value.getTax_lot_term_type(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(33, value.getTax_lot_term_type());
                }
                if (value.getEstimated_gain_loss() != null) {
                    iEncodedSizeWithTag += Money.ADAPTER.encodedSizeWithTag(34, value.getEstimated_gain_loss());
                }
                if (value.getTax_lot_disposal_method() != DisposalMethod.METHOD_UNSPECIFIED) {
                    iEncodedSizeWithTag += DisposalMethod.ADAPTER.encodedSizeWithTag(35, value.getTax_lot_disposal_method());
                }
                return value.getUpdated_at() != null ? iEncodedSizeWithTag + ProtoAdapter.INSTANT.encodedSizeWithTag(36, value.getUpdated_at()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getState() != State.STATE_UNSPECIFIED) {
                    State.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 13, (int) value.getType());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getSide());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 14, (int) value.getTime_in_force());
                }
                if (value.getCancel_agent() != Agent.AGENT_UNSPECIFIED) {
                    Agent.ADAPTER.encodeWithTag(writer, 16, (int) value.getCancel_agent());
                }
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    ResponseCategory.ADAPTER.encodeWithTag(writer, 17, (int) value.getResponse_category());
                }
                if (value.getCurrency_pair() != null) {
                    CurrencyPair.ADAPTER.encodeWithTag(writer, 3, (int) value.getCurrency_pair());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getCumulative_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCumulative_quantity());
                }
                if (!Intrinsics.areEqual(value.getLeaves_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getLeaves_quantity());
                }
                if (!Intrinsics.areEqual(value.getCanceled_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getCanceled_quantity());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getAverage_executed_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getAverage_executed_price());
                }
                if (!Intrinsics.areEqual(value.getUser_entered_order_total(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getUser_entered_order_total());
                }
                if (!Intrinsics.areEqual(value.getCumulative_order_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCumulative_order_value());
                }
                if (!Intrinsics.areEqual(value.getRounded_cumulative_order_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getRounded_cumulative_order_value());
                }
                if (!Intrinsics.areEqual(value.getRemaining_notional(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getRemaining_notional());
                }
                if (!Intrinsics.areEqual(value.getEntered_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 24, (int) value.getEntered_amount());
                }
                Execution.ADAPTER.asRepeated().encodeWithTag(writer, 10, (int) value.getExecutions());
                if (value.getBrokerage_accounting_details() != null) {
                    BrokerageAccountingDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getBrokerage_accounting_details());
                }
                if (value.getLast_transaction_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 19, (int) value.getLast_transaction_at());
                }
                if (value.getInitiator_type() != InitiatorType.INITIATOR_TYPE_UNSPECIFIED) {
                    InitiatorType.ADAPTER.encodeWithTag(writer, 21, (int) value.getInitiator_type());
                }
                ByteString initiator_id = value.getInitiator_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(initiator_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 22, (int) value.getInitiator_id());
                }
                if (!Intrinsics.areEqual(value.getReference_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 23, (int) value.getReference_id());
                }
                if (value.getIs_eligible_for_bonus()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 25, (int) Boolean.valueOf(value.getIs_eligible_for_bonus()));
                }
                if (!Intrinsics.areEqual(value.getFunding_source_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 26, (int) value.getFunding_source_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 27, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getStop_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 28, (int) value.getStop_price());
                }
                if (value.getSubmitted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 29, (int) value.getSubmitted_at());
                }
                if (!Intrinsics.areEqual(value.getFee_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 30, (int) value.getFee_amount());
                }
                if (!Intrinsics.areEqual(value.getRounded_order_value_with_fee(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 31, (int) value.getRounded_order_value_with_fee());
                }
                if (!Intrinsics.areEqual(value.getNum_selected_lots(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 32, (int) value.getNum_selected_lots());
                }
                if (!Intrinsics.areEqual(value.getTax_lot_term_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 33, (int) value.getTax_lot_term_type());
                }
                if (value.getEstimated_gain_loss() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 34, (int) value.getEstimated_gain_loss());
                }
                if (value.getTax_lot_disposal_method() != DisposalMethod.METHOD_UNSPECIFIED) {
                    DisposalMethod.ADAPTER.encodeWithTag(writer, 35, (int) value.getTax_lot_disposal_method());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 36, (int) value.getUpdated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 36, (int) value.getUpdated_at());
                }
                if (value.getTax_lot_disposal_method() != DisposalMethod.METHOD_UNSPECIFIED) {
                    DisposalMethod.ADAPTER.encodeWithTag(writer, 35, (int) value.getTax_lot_disposal_method());
                }
                if (value.getEstimated_gain_loss() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 34, (int) value.getEstimated_gain_loss());
                }
                if (!Intrinsics.areEqual(value.getTax_lot_term_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 33, (int) value.getTax_lot_term_type());
                }
                if (!Intrinsics.areEqual(value.getNum_selected_lots(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 32, (int) value.getNum_selected_lots());
                }
                if (!Intrinsics.areEqual(value.getRounded_order_value_with_fee(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 31, (int) value.getRounded_order_value_with_fee());
                }
                if (!Intrinsics.areEqual(value.getFee_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 30, (int) value.getFee_amount());
                }
                if (value.getSubmitted_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 29, (int) value.getSubmitted_at());
                }
                if (!Intrinsics.areEqual(value.getStop_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 28, (int) value.getStop_price());
                }
                ByteString account_id = value.getAccount_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(account_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 27, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getFunding_source_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 26, (int) value.getFunding_source_type());
                }
                if (value.getIs_eligible_for_bonus()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 25, (int) Boolean.valueOf(value.getIs_eligible_for_bonus()));
                }
                if (!Intrinsics.areEqual(value.getReference_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 23, (int) value.getReference_id());
                }
                if (!Intrinsics.areEqual(value.getInitiator_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 22, (int) value.getInitiator_id());
                }
                if (value.getInitiator_type() != InitiatorType.INITIATOR_TYPE_UNSPECIFIED) {
                    InitiatorType.ADAPTER.encodeWithTag(writer, 21, (int) value.getInitiator_type());
                }
                if (value.getLast_transaction_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 19, (int) value.getLast_transaction_at());
                }
                if (value.getBrokerage_accounting_details() != null) {
                    BrokerageAccountingDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getBrokerage_accounting_details());
                }
                Execution.ADAPTER.asRepeated().encodeWithTag(writer, 10, (int) value.getExecutions());
                if (!Intrinsics.areEqual(value.getEntered_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 24, (int) value.getEntered_amount());
                }
                if (!Intrinsics.areEqual(value.getRemaining_notional(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getRemaining_notional());
                }
                if (!Intrinsics.areEqual(value.getRounded_cumulative_order_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getRounded_cumulative_order_value());
                }
                if (!Intrinsics.areEqual(value.getCumulative_order_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getCumulative_order_value());
                }
                if (!Intrinsics.areEqual(value.getUser_entered_order_total(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getUser_entered_order_total());
                }
                if (!Intrinsics.areEqual(value.getAverage_executed_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getAverage_executed_price());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getCanceled_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getCanceled_quantity());
                }
                if (!Intrinsics.areEqual(value.getLeaves_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getLeaves_quantity());
                }
                if (!Intrinsics.areEqual(value.getCumulative_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCumulative_quantity());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getQuantity());
                }
                if (value.getCurrency_pair() != null) {
                    CurrencyPair.ADAPTER.encodeWithTag(writer, 3, (int) value.getCurrency_pair());
                }
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    ResponseCategory.ADAPTER.encodeWithTag(writer, 17, (int) value.getResponse_category());
                }
                if (value.getCancel_agent() != Agent.AGENT_UNSPECIFIED) {
                    Agent.ADAPTER.encodeWithTag(writer, 16, (int) value.getCancel_agent());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 14, (int) value.getTime_in_force());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getSide());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 13, (int) value.getType());
                }
                if (value.getState() != State.STATE_UNSPECIFIED) {
                    State.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoOrderDetails decode(ProtoReader reader) throws IOException {
                OrderType orderType;
                Side side;
                TimeInForce timeInForce;
                Intrinsics.checkNotNullParameter(reader, "reader");
                State state = State.STATE_UNSPECIFIED;
                OrderType orderType2 = OrderType.ORDER_TYPE_UNSPECIFIED;
                Side side2 = Side.SIDE_UNSPECIFIED;
                TimeInForce timeInForce2 = TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                Agent agent = Agent.AGENT_UNSPECIFIED;
                ResponseCategory responseCategory = ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                InitiatorType initiatorType = InitiatorType.INITIATOR_TYPE_UNSPECIFIED;
                ByteString byteString = ByteString.EMPTY;
                DisposalMethod disposalMethod = DisposalMethod.METHOD_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                State stateDecode = state;
                CurrencyPair currencyPairDecode = null;
                BrokerageAccountingDetails brokerageAccountingDetailsDecode = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Money moneyDecode = null;
                Instant instantDecode3 = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                String strDecode12 = strDecode11;
                String strDecode13 = strDecode12;
                String strDecode14 = strDecode13;
                String strDecode15 = strDecode14;
                String strDecode16 = strDecode15;
                String strDecode17 = strDecode16;
                boolean zBooleanValue = false;
                ByteString byteStringDecode = byteString;
                ByteString byteStringDecode2 = byteStringDecode;
                DisposalMethod disposalMethodDecode = disposalMethod;
                InitiatorType initiatorTypeDecode = initiatorType;
                ByteString byteStringDecode3 = byteStringDecode2;
                ResponseCategory responseCategoryDecode = responseCategory;
                Agent agentDecode = agent;
                TimeInForce timeInForceDecode = timeInForce2;
                Side sideDecode = side2;
                OrderType orderTypeDecode = orderType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CryptoOrderDetails(stateDecode, orderTypeDecode, sideDecode, timeInForceDecode, agentDecode, responseCategoryDecode, currencyPairDecode, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, strDecode10, strDecode11, arrayList, brokerageAccountingDetailsDecode, instantDecode, initiatorTypeDecode, byteStringDecode3, byteStringDecode, zBooleanValue, strDecode12, byteStringDecode2, strDecode13, instantDecode2, strDecode14, strDecode15, strDecode16, strDecode17, moneyDecode, disposalMethodDecode, instantDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            orderType = orderTypeDecode;
                            side = sideDecode;
                            timeInForce = timeInForceDecode;
                            try {
                                stateDecode = State.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            orderTypeDecode = orderType;
                            sideDecode = side;
                            timeInForceDecode = timeInForce;
                            break;
                        case 2:
                            orderType = orderTypeDecode;
                            side = sideDecode;
                            timeInForce = timeInForceDecode;
                            try {
                                sideDecode = Side.ADAPTER.decode(reader);
                                orderTypeDecode = orderType;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            timeInForceDecode = timeInForce;
                            break;
                        case 3:
                            currencyPairDecode = CurrencyPair.ADAPTER.decode(reader);
                            break;
                        case 4:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            strDecode5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            strDecode7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 9:
                            strDecode8 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 10:
                            orderType = orderTypeDecode;
                            side = sideDecode;
                            timeInForce = timeInForceDecode;
                            arrayList.add(Execution.ADAPTER.decode(reader));
                            orderTypeDecode = orderType;
                            sideDecode = side;
                            timeInForceDecode = timeInForce;
                            break;
                        case 11:
                            brokerageAccountingDetailsDecode = BrokerageAccountingDetails.ADAPTER.decode(reader);
                            break;
                        case 12:
                            strDecode10 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 13:
                            orderType = orderTypeDecode;
                            side = sideDecode;
                            timeInForce = timeInForceDecode;
                            try {
                                orderTypeDecode = OrderType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                            sideDecode = side;
                            timeInForceDecode = timeInForce;
                            break;
                        case 14:
                            orderType = orderTypeDecode;
                            side = sideDecode;
                            timeInForce = timeInForceDecode;
                            try {
                                timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                                orderTypeDecode = orderType;
                                sideDecode = side;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 15:
                            strDecode9 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 16:
                            orderType = orderTypeDecode;
                            side = sideDecode;
                            timeInForce = timeInForceDecode;
                            try {
                                agentDecode = Agent.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                            }
                            orderTypeDecode = orderType;
                            sideDecode = side;
                            timeInForceDecode = timeInForce;
                            break;
                        case 17:
                            orderType = orderTypeDecode;
                            side = sideDecode;
                            timeInForce = timeInForceDecode;
                            try {
                                responseCategoryDecode = ResponseCategory.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                            }
                            orderTypeDecode = orderType;
                            sideDecode = side;
                            timeInForceDecode = timeInForce;
                            break;
                        case 18:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 19:
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 20:
                            strDecode6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 21:
                            orderType = orderTypeDecode;
                            side = sideDecode;
                            timeInForce = timeInForceDecode;
                            try {
                                initiatorTypeDecode = InitiatorType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                            }
                            orderTypeDecode = orderType;
                            sideDecode = side;
                            timeInForceDecode = timeInForce;
                            break;
                        case 22:
                            byteStringDecode3 = ProtoAdapter.BYTES.decode(reader);
                            break;
                        case 23:
                            byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                            break;
                        case 24:
                            strDecode11 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 25:
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 26:
                            strDecode12 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 27:
                            byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                            break;
                        case 28:
                            strDecode13 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 29:
                            instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 30:
                            strDecode14 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 31:
                            strDecode15 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 32:
                            strDecode16 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 33:
                            strDecode17 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 34:
                            moneyDecode = Money.ADAPTER.decode(reader);
                            break;
                        case 35:
                            try {
                                disposalMethodDecode = DisposalMethod.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                orderType = orderTypeDecode;
                                side = sideDecode;
                                timeInForce = timeInForceDecode;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                                break;
                            }
                        case 36:
                            instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            orderType = orderTypeDecode;
                            side = sideDecode;
                            timeInForce = timeInForceDecode;
                            orderTypeDecode = orderType;
                            sideDecode = side;
                            timeInForceDecode = timeInForce;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoOrderDetails redact(CryptoOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CurrencyPair currency_pair = value.getCurrency_pair();
                CurrencyPair currencyPairRedact = currency_pair != null ? CurrencyPair.ADAPTER.redact(currency_pair) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getExecutions(), Execution.ADAPTER);
                BrokerageAccountingDetails brokerage_accounting_details = value.getBrokerage_accounting_details();
                BrokerageAccountingDetails brokerageAccountingDetailsRedact = brokerage_accounting_details != null ? BrokerageAccountingDetails.ADAPTER.redact(brokerage_accounting_details) : null;
                Instant last_transaction_at = value.getLast_transaction_at();
                Instant instantRedact = last_transaction_at != null ? ProtoAdapter.INSTANT.redact(last_transaction_at) : null;
                Instant submitted_at = value.getSubmitted_at();
                Instant instantRedact2 = submitted_at != null ? ProtoAdapter.INSTANT.redact(submitted_at) : null;
                Money estimated_gain_loss = value.getEstimated_gain_loss();
                Money moneyRedact = estimated_gain_loss != null ? Money.ADAPTER.redact(estimated_gain_loss) : null;
                Instant updated_at = value.getUpdated_at();
                return value.copy(((-270270529) & 1) != 0 ? value.state : null, ((-270270529) & 2) != 0 ? value.type : null, ((-270270529) & 4) != 0 ? value.side : null, ((-270270529) & 8) != 0 ? value.time_in_force : null, ((-270270529) & 16) != 0 ? value.cancel_agent : null, ((-270270529) & 32) != 0 ? value.response_category : null, ((-270270529) & 64) != 0 ? value.currency_pair : currencyPairRedact, ((-270270529) & 128) != 0 ? value.quantity : null, ((-270270529) & 256) != 0 ? value.cumulative_quantity : null, ((-270270529) & 512) != 0 ? value.leaves_quantity : null, ((-270270529) & 1024) != 0 ? value.canceled_quantity : null, ((-270270529) & 2048) != 0 ? value.price : null, ((-270270529) & 4096) != 0 ? value.average_executed_price : null, ((-270270529) & 8192) != 0 ? value.user_entered_order_total : null, ((-270270529) & 16384) != 0 ? value.cumulative_order_value : null, ((-270270529) & 32768) != 0 ? value.rounded_cumulative_order_value : null, ((-270270529) & 65536) != 0 ? value.remaining_notional : null, ((-270270529) & 131072) != 0 ? value.entered_amount : null, ((-270270529) & 262144) != 0 ? value.executions : listM26823redactElements, ((-270270529) & 524288) != 0 ? value.brokerage_accounting_details : brokerageAccountingDetailsRedact, ((-270270529) & 1048576) != 0 ? value.last_transaction_at : instantRedact, ((-270270529) & 2097152) != 0 ? value.initiator_type : null, ((-270270529) & 4194304) != 0 ? value.initiator_id : null, ((-270270529) & 8388608) != 0 ? value.reference_id : null, ((-270270529) & 16777216) != 0 ? value.is_eligible_for_bonus : false, ((-270270529) & 33554432) != 0 ? value.funding_source_type : null, ((-270270529) & 67108864) != 0 ? value.account_id : null, ((-270270529) & 134217728) != 0 ? value.stop_price : null, ((-270270529) & 268435456) != 0 ? value.submitted_at : instantRedact2, ((-270270529) & 536870912) != 0 ? value.fee_amount : null, ((-270270529) & 1073741824) != 0 ? value.rounded_order_value_with_fee : null, ((-270270529) & Integer.MIN_VALUE) != 0 ? value.num_selected_lots : null, (5 & 1) != 0 ? value.tax_lot_term_type : null, (5 & 2) != 0 ? value.estimated_gain_loss : moneyRedact, (5 & 4) != 0 ? value.tax_lot_disposal_method : null, (5 & 8) != 0 ? value.updated_at : updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null, (5 & 16) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

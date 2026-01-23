package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.cbc.service.tax_lot.p283v1.DisposalMethod;
import com.robinhood.cbc.service.tax_lot.p283v1.DisposalMethodDto;
import com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelectionDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.EquityOrderPayloadDto;
import com.robinhood.rosetta.eventlogging.MoneyDto;
import com.robinhood.rosetta.eventlogging.TaxLotSelectionDto;
import com.robinhood.rosetta.eventlogging.TrailingPegDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;
import rosetta.order.MarketHours;
import rosetta.order.MarketHoursDto;
import rosetta.order.OrderEntryPoint;
import rosetta.order.OrderEntryPointDto;
import rosetta.order.OrderInputFormat;
import rosetta.order.OrderInputFormatDto;
import rosetta.order.OrderType;
import rosetta.order.OrderTypeDto;
import rosetta.order.PositionEffect;
import rosetta.order.PositionEffectDto;
import rosetta.order.Side;
import rosetta.order.SideDto;
import rosetta.order.TimeInForce;
import rosetta.order.TimeInForceDto;
import rosetta.order.Trigger;
import rosetta.order.TriggerDto;

/* compiled from: EquityOrderPayloadDto.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b;\b\u0007\u0018\u0000 \u0087\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b\u0088\u0001\u0087\u0001\u0089\u0001\u008a\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u008f\u0003\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0018\u0012\b\b\u0002\u0010 \u001a\u00020\u0018\u0012\b\b\u0002\u0010!\u001a\u00020\b\u0012\b\b\u0002\u0010\"\u001a\u00020\b\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010$\u001a\u00020\b\u0012\b\b\u0002\u0010%\u001a\u00020\u0018\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0&\u0012\b\b\u0002\u0010(\u001a\u00020\b\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010.\u001a\u00020-\u0012\b\b\u0002\u0010/\u001a\u00020-\u0012\u0010\b\u0002\u00102\u001a\n\u0018\u000100j\u0004\u0018\u0001`1\u0012\b\b\u0002\u00104\u001a\u000203\u0012\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u0002050&\u0012\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u0002070&\u0012\b\b\u0002\u00109\u001a\u00020\b\u0012\b\b\u0002\u0010;\u001a\u00020:\u0012\b\b\u0002\u0010=\u001a\u00020<\u0012\b\b\u0002\u0010?\u001a\u00020>¢\u0006\u0004\b\u0006\u0010@J\u0093\u0003\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\u00182\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0&2\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020-2\u0010\b\u0002\u00102\u001a\n\u0018\u000100j\u0004\u0018\u0001`12\b\b\u0002\u00104\u001a\u0002032\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u0002050&2\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u0002070&2\b\b\u0002\u00109\u001a\u00020\b2\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020<2\b\b\u0002\u0010?\u001a\u00020>¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0002H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\bH\u0016¢\u0006\u0004\bE\u0010FJ\u001a\u0010I\u001a\u00020\u00182\b\u0010H\u001a\u0004\u0018\u00010GH\u0096\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020)H\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010Q\u001a\u00020P2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020)H\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020)H\u0016¢\u0006\u0004\bS\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bU\u0010FR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bV\u0010FR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bW\u0010FR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bX\u0010FR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bY\u0010FR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\\\u0010FR\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b]\u0010FR\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0011\u0010\u001e\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bj\u0010eR\u0011\u0010\u001f\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bk\u0010eR\u0011\u0010 \u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b \u0010eR\u0011\u0010!\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bl\u0010FR\u0011\u0010\"\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bm\u0010FR\u0011\u0010#\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bn\u0010FR\u0011\u0010$\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bo\u0010FR\u0011\u0010%\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bp\u0010eR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0&8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0011\u0010(\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bs\u0010FR\u0011\u0010*\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\bt\u0010LR\u0011\u0010,\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0011\u0010.\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0011\u0010/\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\by\u0010xR\u0019\u00102\u001a\n\u0018\u000100j\u0004\u0018\u0001`18F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0011\u00104\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002050&8F¢\u0006\u0006\u001a\u0004\b~\u0010rR\u0017\u00108\u001a\b\u0012\u0004\u0012\u0002070&8F¢\u0006\u0006\u001a\u0004\b\u007f\u0010rR\u0012\u00109\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010FR\u0013\u0010;\u001a\u00020:8F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0013\u0010=\u001a\u00020<8F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0013\u0010?\u001a\u00020>8F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u008b\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayload;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto$Surrogate;)V", "", "ref_id", "account", "instrument", "symbol", "quantity", "Lrosetta/order/SideDto;", "side", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "Lrosetta/order/OrderTypeDto;", "type", "Lrosetta/order/TriggerDto;", "trigger", "Lrosetta/order/TimeInForceDto;", "time_in_force", "", "extended_hours", "Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "dollar_based_amount", "Lcom/robinhood/rosetta/eventlogging/TrailingPegDto;", "trailing_peg", "override_day_trade_checks", "override_dtbp_checks", "is_ipo_access_order", "ipo_access_lower_collared_price", "ipo_access_lower_price", "ipo_access_upper_collared_price", "ipo_access_upper_price", "has_ipo_access_custom_price_limit", "", "check_overrides", "preset_percent_limit", "", "order_form_version", "Lrosetta/order/MarketHoursDto;", "market_hours", "Lcom/robinhood/idl/IdlDecimal;", BidAskDetails3.BID_PRICE, BidAskDetails3.ASK_PRICE, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "bid_ask_timestamp", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;", "tax_lot_selection_type", "Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionDto;", "tax_lots", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;", "tax_lots_v2", "estimated_total_fee", "Lrosetta/order/PositionEffectDto;", "position_effect", "Lrosetta/order/OrderEntryPointDto;", "order_entry_point", "Lrosetta/order/OrderInputFormatDto;", "order_input_format", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/OrderTypeDto;Lrosetta/order/TriggerDto;Lrosetta/order/TimeInForceDto;ZLcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/TrailingPegDto;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;ILrosetta/order/MarketHoursDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lrosetta/order/PositionEffectDto;Lrosetta/order/OrderEntryPointDto;Lrosetta/order/OrderInputFormatDto;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/OrderTypeDto;Lrosetta/order/TriggerDto;Lrosetta/order/TimeInForceDto;ZLcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/TrailingPegDto;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;ILrosetta/order/MarketHoursDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lrosetta/order/PositionEffectDto;Lrosetta/order/OrderEntryPointDto;Lrosetta/order/OrderInputFormatDto;)Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderPayload;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto$Surrogate;", "getRef_id", "getAccount", "getInstrument", "getSymbol", "getQuantity", "getSide", "()Lrosetta/order/SideDto;", "getPrice", "getStop_price", "getType", "()Lrosetta/order/OrderTypeDto;", "getTrigger", "()Lrosetta/order/TriggerDto;", "getTime_in_force", "()Lrosetta/order/TimeInForceDto;", "getExtended_hours", "()Z", "getDollar_based_amount", "()Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "getTrailing_peg", "()Lcom/robinhood/rosetta/eventlogging/TrailingPegDto;", "getOverride_day_trade_checks", "getOverride_dtbp_checks", "getIpo_access_lower_collared_price", "getIpo_access_lower_price", "getIpo_access_upper_collared_price", "getIpo_access_upper_price", "getHas_ipo_access_custom_price_limit", "getCheck_overrides", "()Ljava/util/List;", "getPreset_percent_limit", "getOrder_form_version", "getMarket_hours", "()Lrosetta/order/MarketHoursDto;", "getBid_price", "()Lcom/robinhood/idl/IdlDecimal;", "getAsk_price", "getBid_ask_timestamp", "()Lj$/time/Instant;", "getTax_lot_selection_type", "()Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;", "getTax_lots", "getTax_lots_v2", "getEstimated_total_fee", "getPosition_effect", "()Lrosetta/order/PositionEffectDto;", "getOrder_entry_point", "()Lrosetta/order/OrderEntryPointDto;", "getOrder_input_format", "()Lrosetta/order/OrderInputFormatDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class EquityOrderPayloadDto implements Dto3<EquityOrderPayload>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EquityOrderPayloadDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EquityOrderPayloadDto, EquityOrderPayload>> binaryBase64Serializer$delegate;
    private static final EquityOrderPayloadDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EquityOrderPayloadDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EquityOrderPayloadDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final String getAccount() {
        return this.surrogate.getAccount();
    }

    public final String getInstrument() {
        return this.surrogate.getInstrument();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final String getPrice() {
        return this.surrogate.getPrice();
    }

    public final String getStop_price() {
        return this.surrogate.getStop_price();
    }

    public final OrderTypeDto getType() {
        return this.surrogate.getType();
    }

    public final TriggerDto getTrigger() {
        return this.surrogate.getTrigger();
    }

    public final TimeInForceDto getTime_in_force() {
        return this.surrogate.getTime_in_force();
    }

    public final boolean getExtended_hours() {
        return this.surrogate.getExtended_hours();
    }

    public final MoneyDto getDollar_based_amount() {
        return this.surrogate.getDollar_based_amount();
    }

    public final TrailingPegDto getTrailing_peg() {
        return this.surrogate.getTrailing_peg();
    }

    public final boolean getOverride_day_trade_checks() {
        return this.surrogate.getOverride_day_trade_checks();
    }

    public final boolean getOverride_dtbp_checks() {
        return this.surrogate.getOverride_dtbp_checks();
    }

    public final boolean is_ipo_access_order() {
        return this.surrogate.is_ipo_access_order();
    }

    public final String getIpo_access_lower_collared_price() {
        return this.surrogate.getIpo_access_lower_collared_price();
    }

    public final String getIpo_access_lower_price() {
        return this.surrogate.getIpo_access_lower_price();
    }

    public final String getIpo_access_upper_collared_price() {
        return this.surrogate.getIpo_access_upper_collared_price();
    }

    public final String getIpo_access_upper_price() {
        return this.surrogate.getIpo_access_upper_price();
    }

    public final boolean getHas_ipo_access_custom_price_limit() {
        return this.surrogate.getHas_ipo_access_custom_price_limit();
    }

    public final java.util.List<String> getCheck_overrides() {
        return this.surrogate.getCheck_overrides();
    }

    public final String getPreset_percent_limit() {
        return this.surrogate.getPreset_percent_limit();
    }

    public final int getOrder_form_version() {
        return this.surrogate.getOrder_form_version();
    }

    public final MarketHoursDto getMarket_hours() {
        return this.surrogate.getMarket_hours();
    }

    public final IdlDecimal getBid_price() {
        return this.surrogate.getBid_price();
    }

    public final IdlDecimal getAsk_price() {
        return this.surrogate.getAsk_price();
    }

    public final Instant getBid_ask_timestamp() {
        return this.surrogate.getBid_ask_timestamp();
    }

    public final DisposalMethodDto getTax_lot_selection_type() {
        return this.surrogate.getTax_lot_selection_type();
    }

    public final java.util.List<com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelectionDto> getTax_lots() {
        return this.surrogate.getTax_lots();
    }

    public final java.util.List<TaxLotSelectionDto> getTax_lots_v2() {
        return this.surrogate.getTax_lots_v2();
    }

    public final String getEstimated_total_fee() {
        return this.surrogate.getEstimated_total_fee();
    }

    public final PositionEffectDto getPosition_effect() {
        return this.surrogate.getPosition_effect();
    }

    public final OrderEntryPointDto getOrder_entry_point() {
        return this.surrogate.getOrder_entry_point();
    }

    public final OrderInputFormatDto getOrder_input_format() {
        return this.surrogate.getOrder_input_format();
    }

    public /* synthetic */ EquityOrderPayloadDto(String str, String str2, String str3, String str4, String str5, SideDto sideDto, String str6, String str7, OrderTypeDto orderTypeDto, TriggerDto triggerDto, TimeInForceDto timeInForceDto, boolean z, MoneyDto moneyDto, TrailingPegDto trailingPegDto, boolean z2, boolean z3, boolean z4, String str8, String str9, String str10, String str11, boolean z5, java.util.List list, String str12, int i, MarketHoursDto marketHoursDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, Instant instant, DisposalMethodDto disposalMethodDto, java.util.List list2, java.util.List list3, String str13, PositionEffectDto positionEffectDto, OrderEntryPointDto orderEntryPointDto, OrderInputFormatDto orderInputFormatDto, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i2 & 512) != 0 ? TriggerDto.INSTANCE.getZeroValue() : triggerDto, (i2 & 1024) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i2 & 2048) != 0 ? false : z, (i2 & 4096) != 0 ? null : moneyDto, (i2 & 8192) != 0 ? null : trailingPegDto, (i2 & 16384) != 0 ? false : z2, (i2 & 32768) != 0 ? false : z3, (i2 & 65536) != 0 ? false : z4, (i2 & 131072) != 0 ? "" : str8, (i2 & 262144) != 0 ? "" : str9, (i2 & 524288) != 0 ? "" : str10, (i2 & 1048576) != 0 ? "" : str11, (i2 & 2097152) != 0 ? false : z5, (i2 & 4194304) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8388608) != 0 ? "" : str12, (i2 & 16777216) != 0 ? 0 : i, (i2 & 33554432) != 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto, (i2 & 67108864) != 0 ? new IdlDecimal("") : idlDecimal, (i2 & 134217728) != 0 ? new IdlDecimal("") : idlDecimal2, (i2 & 268435456) == 0 ? instant : null, (i2 & 536870912) != 0 ? DisposalMethodDto.INSTANCE.getZeroValue() : disposalMethodDto, (i2 & 1073741824) != 0 ? CollectionsKt.emptyList() : list2, (i2 & Integer.MIN_VALUE) != 0 ? CollectionsKt.emptyList() : list3, (i3 & 1) == 0 ? str13 : "", (i3 & 2) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i3 & 4) != 0 ? OrderEntryPointDto.INSTANCE.getZeroValue() : orderEntryPointDto, (i3 & 8) != 0 ? OrderInputFormatDto.INSTANCE.getZeroValue() : orderInputFormatDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EquityOrderPayloadDto(String ref_id, String account, String instrument, String symbol, String quantity, SideDto side, String price, String stop_price, OrderTypeDto type2, TriggerDto trigger, TimeInForceDto time_in_force, boolean z, MoneyDto moneyDto, TrailingPegDto trailingPegDto, boolean z2, boolean z3, boolean z4, String ipo_access_lower_collared_price, String ipo_access_lower_price, String ipo_access_upper_collared_price, String ipo_access_upper_price, boolean z5, java.util.List<String> check_overrides, String preset_percent_limit, int i, MarketHoursDto market_hours, IdlDecimal bid_price, IdlDecimal ask_price, Instant instant, DisposalMethodDto tax_lot_selection_type, java.util.List<com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelectionDto> tax_lots, java.util.List<TaxLotSelectionDto> tax_lots_v2, String estimated_total_fee, PositionEffectDto position_effect, OrderEntryPointDto order_entry_point, OrderInputFormatDto order_input_format) {
        this(new Surrogate(ref_id, account, instrument, symbol, quantity, side, price, stop_price, type2, trigger, time_in_force, z, moneyDto, trailingPegDto, z2, z3, z4, ipo_access_lower_collared_price, ipo_access_lower_price, ipo_access_upper_collared_price, ipo_access_upper_price, z5, check_overrides, preset_percent_limit, i, market_hours, bid_price, ask_price, instant, tax_lot_selection_type, tax_lots, tax_lots_v2, estimated_total_fee, position_effect, order_entry_point, order_input_format));
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(stop_price, "stop_price");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(ipo_access_lower_collared_price, "ipo_access_lower_collared_price");
        Intrinsics.checkNotNullParameter(ipo_access_lower_price, "ipo_access_lower_price");
        Intrinsics.checkNotNullParameter(ipo_access_upper_collared_price, "ipo_access_upper_collared_price");
        Intrinsics.checkNotNullParameter(ipo_access_upper_price, "ipo_access_upper_price");
        Intrinsics.checkNotNullParameter(check_overrides, "check_overrides");
        Intrinsics.checkNotNullParameter(preset_percent_limit, "preset_percent_limit");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(tax_lot_selection_type, "tax_lot_selection_type");
        Intrinsics.checkNotNullParameter(tax_lots, "tax_lots");
        Intrinsics.checkNotNullParameter(tax_lots_v2, "tax_lots_v2");
        Intrinsics.checkNotNullParameter(estimated_total_fee, "estimated_total_fee");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(order_entry_point, "order_entry_point");
        Intrinsics.checkNotNullParameter(order_input_format, "order_input_format");
    }

    public static /* synthetic */ EquityOrderPayloadDto copy$default(EquityOrderPayloadDto equityOrderPayloadDto, String str, String str2, String str3, String str4, String str5, SideDto sideDto, String str6, String str7, OrderTypeDto orderTypeDto, TriggerDto triggerDto, TimeInForceDto timeInForceDto, boolean z, MoneyDto moneyDto, TrailingPegDto trailingPegDto, boolean z2, boolean z3, boolean z4, String str8, String str9, String str10, String str11, boolean z5, java.util.List list, String str12, int i, MarketHoursDto marketHoursDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, Instant instant, DisposalMethodDto disposalMethodDto, java.util.List list2, java.util.List list3, String str13, PositionEffectDto positionEffectDto, OrderEntryPointDto orderEntryPointDto, OrderInputFormatDto orderInputFormatDto, int i2, int i3, Object obj) {
        OrderInputFormatDto order_input_format;
        OrderEntryPointDto orderEntryPointDto2;
        String str14;
        String str15;
        boolean z6;
        java.util.List list4;
        String str16;
        int i4;
        MarketHoursDto marketHoursDto2;
        IdlDecimal idlDecimal3;
        IdlDecimal idlDecimal4;
        Instant instant2;
        DisposalMethodDto disposalMethodDto2;
        java.util.List list5;
        java.util.List list6;
        String str17;
        PositionEffectDto positionEffectDto2;
        boolean z7;
        String str18;
        SideDto sideDto2;
        String str19;
        String str20;
        OrderTypeDto orderTypeDto2;
        TriggerDto triggerDto2;
        TimeInForceDto timeInForceDto2;
        boolean z8;
        MoneyDto moneyDto2;
        TrailingPegDto trailingPegDto2;
        boolean z9;
        boolean z10;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String ref_id = (i2 & 1) != 0 ? equityOrderPayloadDto.surrogate.getRef_id() : str;
        String account = (i2 & 2) != 0 ? equityOrderPayloadDto.surrogate.getAccount() : str2;
        String instrument = (i2 & 4) != 0 ? equityOrderPayloadDto.surrogate.getInstrument() : str3;
        String symbol = (i2 & 8) != 0 ? equityOrderPayloadDto.surrogate.getSymbol() : str4;
        String quantity = (i2 & 16) != 0 ? equityOrderPayloadDto.surrogate.getQuantity() : str5;
        SideDto side = (i2 & 32) != 0 ? equityOrderPayloadDto.surrogate.getSide() : sideDto;
        String price = (i2 & 64) != 0 ? equityOrderPayloadDto.surrogate.getPrice() : str6;
        String stop_price = (i2 & 128) != 0 ? equityOrderPayloadDto.surrogate.getStop_price() : str7;
        OrderTypeDto type2 = (i2 & 256) != 0 ? equityOrderPayloadDto.surrogate.getType() : orderTypeDto;
        TriggerDto trigger = (i2 & 512) != 0 ? equityOrderPayloadDto.surrogate.getTrigger() : triggerDto;
        TimeInForceDto time_in_force = (i2 & 1024) != 0 ? equityOrderPayloadDto.surrogate.getTime_in_force() : timeInForceDto;
        boolean extended_hours = (i2 & 2048) != 0 ? equityOrderPayloadDto.surrogate.getExtended_hours() : z;
        MoneyDto dollar_based_amount = (i2 & 4096) != 0 ? equityOrderPayloadDto.surrogate.getDollar_based_amount() : moneyDto;
        TrailingPegDto trailing_peg = (i2 & 8192) != 0 ? equityOrderPayloadDto.surrogate.getTrailing_peg() : trailingPegDto;
        String str26 = ref_id;
        boolean override_day_trade_checks = (i2 & 16384) != 0 ? equityOrderPayloadDto.surrogate.getOverride_day_trade_checks() : z2;
        boolean override_dtbp_checks = (i2 & 32768) != 0 ? equityOrderPayloadDto.surrogate.getOverride_dtbp_checks() : z3;
        boolean zIs_ipo_access_order = (i2 & 65536) != 0 ? equityOrderPayloadDto.surrogate.is_ipo_access_order() : z4;
        String ipo_access_lower_collared_price = (i2 & 131072) != 0 ? equityOrderPayloadDto.surrogate.getIpo_access_lower_collared_price() : str8;
        String ipo_access_lower_price = (i2 & 262144) != 0 ? equityOrderPayloadDto.surrogate.getIpo_access_lower_price() : str9;
        String ipo_access_upper_collared_price = (i2 & 524288) != 0 ? equityOrderPayloadDto.surrogate.getIpo_access_upper_collared_price() : str10;
        String ipo_access_upper_price = (i2 & 1048576) != 0 ? equityOrderPayloadDto.surrogate.getIpo_access_upper_price() : str11;
        boolean has_ipo_access_custom_price_limit = (i2 & 2097152) != 0 ? equityOrderPayloadDto.surrogate.getHas_ipo_access_custom_price_limit() : z5;
        java.util.List check_overrides = (i2 & 4194304) != 0 ? equityOrderPayloadDto.surrogate.getCheck_overrides() : list;
        String preset_percent_limit = (i2 & 8388608) != 0 ? equityOrderPayloadDto.surrogate.getPreset_percent_limit() : str12;
        int order_form_version = (i2 & 16777216) != 0 ? equityOrderPayloadDto.surrogate.getOrder_form_version() : i;
        MarketHoursDto market_hours = (i2 & 33554432) != 0 ? equityOrderPayloadDto.surrogate.getMarket_hours() : marketHoursDto;
        IdlDecimal bid_price = (i2 & 67108864) != 0 ? equityOrderPayloadDto.surrogate.getBid_price() : idlDecimal;
        IdlDecimal ask_price = (i2 & 134217728) != 0 ? equityOrderPayloadDto.surrogate.getAsk_price() : idlDecimal2;
        Instant bid_ask_timestamp = (i2 & 268435456) != 0 ? equityOrderPayloadDto.surrogate.getBid_ask_timestamp() : instant;
        DisposalMethodDto tax_lot_selection_type = (i2 & 536870912) != 0 ? equityOrderPayloadDto.surrogate.getTax_lot_selection_type() : disposalMethodDto;
        java.util.List tax_lots = (i2 & 1073741824) != 0 ? equityOrderPayloadDto.surrogate.getTax_lots() : list2;
        java.util.List tax_lots_v2 = (i2 & Integer.MIN_VALUE) != 0 ? equityOrderPayloadDto.surrogate.getTax_lots_v2() : list3;
        String estimated_total_fee = (i3 & 1) != 0 ? equityOrderPayloadDto.surrogate.getEstimated_total_fee() : str13;
        PositionEffectDto position_effect = (i3 & 2) != 0 ? equityOrderPayloadDto.surrogate.getPosition_effect() : positionEffectDto;
        OrderEntryPointDto order_entry_point = (i3 & 4) != 0 ? equityOrderPayloadDto.surrogate.getOrder_entry_point() : orderEntryPointDto;
        if ((i3 & 8) != 0) {
            orderEntryPointDto2 = order_entry_point;
            order_input_format = equityOrderPayloadDto.surrogate.getOrder_input_format();
            str15 = ipo_access_upper_price;
            z6 = has_ipo_access_custom_price_limit;
            list4 = check_overrides;
            str16 = preset_percent_limit;
            i4 = order_form_version;
            marketHoursDto2 = market_hours;
            idlDecimal3 = bid_price;
            idlDecimal4 = ask_price;
            instant2 = bid_ask_timestamp;
            disposalMethodDto2 = tax_lot_selection_type;
            list5 = tax_lots;
            list6 = tax_lots_v2;
            str17 = estimated_total_fee;
            positionEffectDto2 = position_effect;
            z7 = override_day_trade_checks;
            sideDto2 = side;
            str19 = price;
            str20 = stop_price;
            orderTypeDto2 = type2;
            triggerDto2 = trigger;
            timeInForceDto2 = time_in_force;
            z8 = extended_hours;
            moneyDto2 = dollar_based_amount;
            trailingPegDto2 = trailing_peg;
            z9 = override_dtbp_checks;
            z10 = zIs_ipo_access_order;
            str21 = ipo_access_lower_collared_price;
            str22 = ipo_access_lower_price;
            str14 = ipo_access_upper_collared_price;
            str23 = account;
            str24 = instrument;
            str25 = symbol;
            str18 = quantity;
        } else {
            order_input_format = orderInputFormatDto;
            orderEntryPointDto2 = order_entry_point;
            str14 = ipo_access_upper_collared_price;
            str15 = ipo_access_upper_price;
            z6 = has_ipo_access_custom_price_limit;
            list4 = check_overrides;
            str16 = preset_percent_limit;
            i4 = order_form_version;
            marketHoursDto2 = market_hours;
            idlDecimal3 = bid_price;
            idlDecimal4 = ask_price;
            instant2 = bid_ask_timestamp;
            disposalMethodDto2 = tax_lot_selection_type;
            list5 = tax_lots;
            list6 = tax_lots_v2;
            str17 = estimated_total_fee;
            positionEffectDto2 = position_effect;
            z7 = override_day_trade_checks;
            str18 = quantity;
            sideDto2 = side;
            str19 = price;
            str20 = stop_price;
            orderTypeDto2 = type2;
            triggerDto2 = trigger;
            timeInForceDto2 = time_in_force;
            z8 = extended_hours;
            moneyDto2 = dollar_based_amount;
            trailingPegDto2 = trailing_peg;
            z9 = override_dtbp_checks;
            z10 = zIs_ipo_access_order;
            str21 = ipo_access_lower_collared_price;
            str22 = ipo_access_lower_price;
            str23 = account;
            str24 = instrument;
            str25 = symbol;
        }
        return equityOrderPayloadDto.copy(str26, str23, str24, str25, str18, sideDto2, str19, str20, orderTypeDto2, triggerDto2, timeInForceDto2, z8, moneyDto2, trailingPegDto2, z7, z9, z10, str21, str22, str14, str15, z6, list4, str16, i4, marketHoursDto2, idlDecimal3, idlDecimal4, instant2, disposalMethodDto2, list5, list6, str17, positionEffectDto2, orderEntryPointDto2, order_input_format);
    }

    public final EquityOrderPayloadDto copy(String ref_id, String account, String instrument, String symbol, String quantity, SideDto side, String price, String stop_price, OrderTypeDto type2, TriggerDto trigger, TimeInForceDto time_in_force, boolean extended_hours, MoneyDto dollar_based_amount, TrailingPegDto trailing_peg, boolean override_day_trade_checks, boolean override_dtbp_checks, boolean is_ipo_access_order, String ipo_access_lower_collared_price, String ipo_access_lower_price, String ipo_access_upper_collared_price, String ipo_access_upper_price, boolean has_ipo_access_custom_price_limit, java.util.List<String> check_overrides, String preset_percent_limit, int order_form_version, MarketHoursDto market_hours, IdlDecimal bid_price, IdlDecimal ask_price, Instant bid_ask_timestamp, DisposalMethodDto tax_lot_selection_type, java.util.List<com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelectionDto> tax_lots, java.util.List<TaxLotSelectionDto> tax_lots_v2, String estimated_total_fee, PositionEffectDto position_effect, OrderEntryPointDto order_entry_point, OrderInputFormatDto order_input_format) {
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(stop_price, "stop_price");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(ipo_access_lower_collared_price, "ipo_access_lower_collared_price");
        Intrinsics.checkNotNullParameter(ipo_access_lower_price, "ipo_access_lower_price");
        Intrinsics.checkNotNullParameter(ipo_access_upper_collared_price, "ipo_access_upper_collared_price");
        Intrinsics.checkNotNullParameter(ipo_access_upper_price, "ipo_access_upper_price");
        Intrinsics.checkNotNullParameter(check_overrides, "check_overrides");
        Intrinsics.checkNotNullParameter(preset_percent_limit, "preset_percent_limit");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(tax_lot_selection_type, "tax_lot_selection_type");
        Intrinsics.checkNotNullParameter(tax_lots, "tax_lots");
        Intrinsics.checkNotNullParameter(tax_lots_v2, "tax_lots_v2");
        Intrinsics.checkNotNullParameter(estimated_total_fee, "estimated_total_fee");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(order_entry_point, "order_entry_point");
        Intrinsics.checkNotNullParameter(order_input_format, "order_input_format");
        return new EquityOrderPayloadDto(new Surrogate(ref_id, account, instrument, symbol, quantity, side, price, stop_price, type2, trigger, time_in_force, extended_hours, dollar_based_amount, trailing_peg, override_day_trade_checks, override_dtbp_checks, is_ipo_access_order, ipo_access_lower_collared_price, ipo_access_lower_price, ipo_access_upper_collared_price, ipo_access_upper_price, has_ipo_access_custom_price_limit, check_overrides, preset_percent_limit, order_form_version, market_hours, bid_price, ask_price, bid_ask_timestamp, tax_lot_selection_type, tax_lots, tax_lots_v2, estimated_total_fee, position_effect, order_entry_point, order_input_format));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EquityOrderPayload toProto() {
        String ref_id = this.surrogate.getRef_id();
        String account = this.surrogate.getAccount();
        String instrument = this.surrogate.getInstrument();
        String symbol = this.surrogate.getSymbol();
        String quantity = this.surrogate.getQuantity();
        Side side = (Side) this.surrogate.getSide().toProto();
        String price = this.surrogate.getPrice();
        String stop_price = this.surrogate.getStop_price();
        OrderType orderType = (OrderType) this.surrogate.getType().toProto();
        Trigger trigger = (Trigger) this.surrogate.getTrigger().toProto();
        TimeInForce timeInForce = (TimeInForce) this.surrogate.getTime_in_force().toProto();
        boolean extended_hours = this.surrogate.getExtended_hours();
        MoneyDto dollar_based_amount = this.surrogate.getDollar_based_amount();
        Money proto = dollar_based_amount != null ? dollar_based_amount.toProto() : null;
        TrailingPegDto trailing_peg = this.surrogate.getTrailing_peg();
        TrailingPeg proto2 = trailing_peg != null ? trailing_peg.toProto() : null;
        boolean override_day_trade_checks = this.surrogate.getOverride_day_trade_checks();
        boolean override_dtbp_checks = this.surrogate.getOverride_dtbp_checks();
        boolean zIs_ipo_access_order = this.surrogate.is_ipo_access_order();
        String ipo_access_lower_collared_price = this.surrogate.getIpo_access_lower_collared_price();
        String ipo_access_lower_price = this.surrogate.getIpo_access_lower_price();
        String ipo_access_upper_collared_price = this.surrogate.getIpo_access_upper_collared_price();
        String ipo_access_upper_price = this.surrogate.getIpo_access_upper_price();
        boolean has_ipo_access_custom_price_limit = this.surrogate.getHas_ipo_access_custom_price_limit();
        java.util.List<String> check_overrides = this.surrogate.getCheck_overrides();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(check_overrides, 10));
        Iterator<T> it = check_overrides.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        String preset_percent_limit = this.surrogate.getPreset_percent_limit();
        int order_form_version = this.surrogate.getOrder_form_version();
        MarketHours marketHours = (MarketHours) this.surrogate.getMarket_hours().toProto();
        String stringValue = this.surrogate.getBid_price().getStringValue();
        String stringValue2 = this.surrogate.getAsk_price().getStringValue();
        Instant bid_ask_timestamp = this.surrogate.getBid_ask_timestamp();
        DisposalMethod disposalMethod = (DisposalMethod) this.surrogate.getTax_lot_selection_type().toProto();
        java.util.List<com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelectionDto> tax_lots = this.surrogate.getTax_lots();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lots, 10));
        Iterator<T> it2 = tax_lots.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelectionDto) it2.next()).toProto());
        }
        java.util.List<TaxLotSelectionDto> tax_lots_v2 = this.surrogate.getTax_lots_v2();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lots_v2, 10));
        Iterator<T> it3 = tax_lots_v2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((TaxLotSelectionDto) it3.next()).toProto());
        }
        return new EquityOrderPayload(ref_id, account, instrument, symbol, quantity, side, price, stop_price, orderType, trigger, timeInForce, extended_hours, proto, proto2, override_day_trade_checks, override_dtbp_checks, zIs_ipo_access_order, ipo_access_lower_collared_price, ipo_access_lower_price, ipo_access_upper_collared_price, ipo_access_upper_price, has_ipo_access_custom_price_limit, arrayList, preset_percent_limit, order_form_version, marketHours, stringValue, stringValue2, bid_ask_timestamp, disposalMethod, arrayList2, arrayList3, this.surrogate.getEstimated_total_fee(), (PositionEffect) this.surrogate.getPosition_effect().toProto(), (OrderEntryPoint) this.surrogate.getOrder_entry_point().toProto(), (OrderInputFormat) this.surrogate.getOrder_input_format().toProto(), null, 0, 16, null);
    }

    public String toString() {
        return "[EquityOrderPayloadDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EquityOrderPayloadDto) && Intrinsics.areEqual(((EquityOrderPayloadDto) other).surrogate, this.surrogate);
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
    /* compiled from: EquityOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000¹\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0003\b\u009b\u0001\b\u0083\b\u0018\u0000 ä\u00012\u00020\u0001:\u0004å\u0001ä\u0001BØ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010'\u001a\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t0&\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\u0017\b\u0002\u0010,\u001a\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t0+\u0012\u0017\b\u0002\u0010-\u001a\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t0+\u0012.\b\u0002\u00101\u001a(\u0018\u00010.j\u0013\u0018\u0001`/¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t00¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t00\u0012\b\b\u0002\u00103\u001a\u000202\u0012\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u0002040 \u0012\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u0002060 \u0012\b\b\u0002\u00108\u001a\u00020\u0002\u0012\b\b\u0002\u0010:\u001a\u000209\u0012\b\b\u0002\u0010<\u001a\u00020;\u0012\b\b\u0002\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@B\u0091\u0003\b\u0010\u0012\u0006\u0010A\u001a\u00020#\u0012\u0006\u0010B\u001a\u00020#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0012\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 \u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010'\u001a\u00020#\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010,\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010*\u0012\b\u00101\u001a\u0004\u0018\u00010.\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\u000e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010 \u0012\u000e\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010 \u0012\b\u00108\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010:\u001a\u0004\u0018\u000109\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\b?\u0010EJ'\u0010N\u001a\u00020K2\u0006\u0010F\u001a\u00020\u00002\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020IH\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010O\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bQ\u0010PJ\u0010\u0010R\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bR\u0010PJ\u0010\u0010S\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bS\u0010PJ\u0010\u0010T\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bT\u0010PJ\u0010\u0010U\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bW\u0010PJ\u0010\u0010X\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bX\u0010PJ\u0010\u0010Y\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b_\u0010`J\u0012\u0010a\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0012\u0010c\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\be\u0010`J\u0010\u0010f\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bf\u0010`J\u0010\u0010g\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bg\u0010`J\u0010\u0010h\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bh\u0010PJ\u0010\u0010i\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bi\u0010PJ\u0010\u0010j\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bj\u0010PJ\u0010\u0010k\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bk\u0010PJ\u0010\u0010l\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bl\u0010`J\u0016\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00020 HÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bo\u0010PJ\u001f\u0010p\u001a\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t0&HÆ\u0003¢\u0006\u0004\bp\u0010qJ\u0010\u0010r\u001a\u00020(HÆ\u0003¢\u0006\u0004\br\u0010sJ\u001f\u0010t\u001a\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t0+HÆ\u0003¢\u0006\u0004\bt\u0010uJ\u001f\u0010v\u001a\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t0+HÆ\u0003¢\u0006\u0004\bv\u0010uJ6\u0010w\u001a(\u0018\u00010.j\u0013\u0018\u0001`/¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t00¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t00HÆ\u0003¢\u0006\u0004\bw\u0010xJ\u0010\u0010y\u001a\u000202HÆ\u0003¢\u0006\u0004\by\u0010zJ\u0016\u0010{\u001a\b\u0012\u0004\u0012\u0002040 HÆ\u0003¢\u0006\u0004\b{\u0010nJ\u0016\u0010|\u001a\b\u0012\u0004\u0012\u0002060 HÆ\u0003¢\u0006\u0004\b|\u0010nJ\u0010\u0010}\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b}\u0010PJ\u0010\u0010~\u001a\u000209HÆ\u0003¢\u0006\u0004\b~\u0010\u007fJ\u0013\u0010\u0080\u0001\u001a\u00020;HÆ\u0003¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0013\u0010\u0082\u0001\u001a\u00020=HÆ\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001Jä\u0003\u0010\u0084\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00122\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u00022\u0017\b\u0002\u0010'\u001a\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t0&2\b\b\u0002\u0010)\u001a\u00020(2\u0017\b\u0002\u0010,\u001a\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t0+2\u0017\b\u0002\u0010-\u001a\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t0+2.\b\u0002\u00101\u001a(\u0018\u00010.j\u0013\u0018\u0001`/¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t00¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t002\b\b\u0002\u00103\u001a\u0002022\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u0002040 2\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u0002060 2\b\b\u0002\u00108\u001a\u00020\u00022\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020=HÆ\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0012\u0010\u0086\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0005\b\u0086\u0001\u0010PJ\u0012\u0010\u0087\u0001\u001a\u00020#HÖ\u0001¢\u0006\u0005\b\u0087\u0001\u0010qJ\u001e\u0010\u0089\u0001\u001a\u00020\u00122\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001R$\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0003\u0010\u008b\u0001\u0012\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0005\b\u008c\u0001\u0010PR$\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0004\u0010\u008b\u0001\u0012\u0006\b\u0090\u0001\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010PR$\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0005\u0010\u008b\u0001\u0012\u0006\b\u0092\u0001\u0010\u008e\u0001\u001a\u0005\b\u0091\u0001\u0010PR$\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0006\u0010\u008b\u0001\u0012\u0006\b\u0094\u0001\u0010\u008e\u0001\u001a\u0005\b\u0093\u0001\u0010PR$\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0007\u0010\u008b\u0001\u0012\u0006\b\u0096\u0001\u0010\u008e\u0001\u001a\u0005\b\u0095\u0001\u0010PR$\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\t\u0010\u0097\u0001\u0012\u0006\b\u0099\u0001\u0010\u008e\u0001\u001a\u0005\b\u0098\u0001\u0010VR$\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\n\u0010\u008b\u0001\u0012\u0006\b\u009b\u0001\u0010\u008e\u0001\u001a\u0005\b\u009a\u0001\u0010PR$\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000b\u0010\u008b\u0001\u0012\u0006\b\u009d\u0001\u0010\u008e\u0001\u001a\u0005\b\u009c\u0001\u0010PR$\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\r\u0010\u009e\u0001\u0012\u0006\b \u0001\u0010\u008e\u0001\u001a\u0005\b\u009f\u0001\u0010ZR$\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000f\u0010¡\u0001\u0012\u0006\b£\u0001\u0010\u008e\u0001\u001a\u0005\b¢\u0001\u0010\\R$\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0011\u0010¤\u0001\u0012\u0006\b¦\u0001\u0010\u008e\u0001\u001a\u0005\b¥\u0001\u0010^R$\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0013\u0010§\u0001\u0012\u0006\b©\u0001\u0010\u008e\u0001\u001a\u0005\b¨\u0001\u0010`R&\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0015\u0010ª\u0001\u0012\u0006\b¬\u0001\u0010\u008e\u0001\u001a\u0005\b«\u0001\u0010bR&\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0017\u0010\u00ad\u0001\u0012\u0006\b¯\u0001\u0010\u008e\u0001\u001a\u0005\b®\u0001\u0010dR$\u0010\u0018\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0018\u0010§\u0001\u0012\u0006\b±\u0001\u0010\u008e\u0001\u001a\u0005\b°\u0001\u0010`R$\u0010\u0019\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0019\u0010§\u0001\u0012\u0006\b³\u0001\u0010\u008e\u0001\u001a\u0005\b²\u0001\u0010`R#\u0010\u001a\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001a\u0010§\u0001\u0012\u0006\b´\u0001\u0010\u008e\u0001\u001a\u0004\b\u001a\u0010`R$\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001b\u0010\u008b\u0001\u0012\u0006\b¶\u0001\u0010\u008e\u0001\u001a\u0005\bµ\u0001\u0010PR$\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001c\u0010\u008b\u0001\u0012\u0006\b¸\u0001\u0010\u008e\u0001\u001a\u0005\b·\u0001\u0010PR$\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001d\u0010\u008b\u0001\u0012\u0006\bº\u0001\u0010\u008e\u0001\u001a\u0005\b¹\u0001\u0010PR$\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001e\u0010\u008b\u0001\u0012\u0006\b¼\u0001\u0010\u008e\u0001\u001a\u0005\b»\u0001\u0010PR$\u0010\u001f\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001f\u0010§\u0001\u0012\u0006\b¾\u0001\u0010\u008e\u0001\u001a\u0005\b½\u0001\u0010`R*\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b!\u0010¿\u0001\u0012\u0006\bÁ\u0001\u0010\u008e\u0001\u001a\u0005\bÀ\u0001\u0010nR$\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\"\u0010\u008b\u0001\u0012\u0006\bÃ\u0001\u0010\u008e\u0001\u001a\u0005\bÂ\u0001\u0010PR3\u0010'\u001a\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t0&8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b'\u0010Ä\u0001\u0012\u0006\bÆ\u0001\u0010\u008e\u0001\u001a\u0005\bÅ\u0001\u0010qR$\u0010)\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b)\u0010Ç\u0001\u0012\u0006\bÉ\u0001\u0010\u008e\u0001\u001a\u0005\bÈ\u0001\u0010sR3\u0010,\u001a\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t0+8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b,\u0010Ê\u0001\u0012\u0006\bÌ\u0001\u0010\u008e\u0001\u001a\u0005\bË\u0001\u0010uR3\u0010-\u001a\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t0+8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b-\u0010Ê\u0001\u0012\u0006\bÎ\u0001\u0010\u008e\u0001\u001a\u0005\bÍ\u0001\u0010uRJ\u00101\u001a(\u0018\u00010.j\u0013\u0018\u0001`/¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t00¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\t008\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b1\u0010Ï\u0001\u0012\u0006\bÑ\u0001\u0010\u008e\u0001\u001a\u0005\bÐ\u0001\u0010xR$\u00103\u001a\u0002028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b3\u0010Ò\u0001\u0012\u0006\bÔ\u0001\u0010\u008e\u0001\u001a\u0005\bÓ\u0001\u0010zR*\u00105\u001a\b\u0012\u0004\u0012\u0002040 8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b5\u0010¿\u0001\u0012\u0006\bÖ\u0001\u0010\u008e\u0001\u001a\u0005\bÕ\u0001\u0010nR*\u00107\u001a\b\u0012\u0004\u0012\u0002060 8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b7\u0010¿\u0001\u0012\u0006\bØ\u0001\u0010\u008e\u0001\u001a\u0005\b×\u0001\u0010nR$\u00108\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b8\u0010\u008b\u0001\u0012\u0006\bÚ\u0001\u0010\u008e\u0001\u001a\u0005\bÙ\u0001\u0010PR$\u0010:\u001a\u0002098\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b:\u0010Û\u0001\u0012\u0006\bÝ\u0001\u0010\u008e\u0001\u001a\u0005\bÜ\u0001\u0010\u007fR%\u0010<\u001a\u00020;8\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b<\u0010Þ\u0001\u0012\u0006\bà\u0001\u0010\u008e\u0001\u001a\u0006\bß\u0001\u0010\u0081\u0001R%\u0010>\u001a\u00020=8\u0006X\u0087\u0004¢\u0006\u0017\n\u0005\b>\u0010á\u0001\u0012\u0006\bã\u0001\u0010\u008e\u0001\u001a\u0006\bâ\u0001\u0010\u0083\u0001¨\u0006æ\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto$Surrogate;", "", "", "ref_id", "account", "instrument", "symbol", "quantity", "Lrosetta/order/SideDto;", "side", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "Lrosetta/order/OrderTypeDto;", "type", "Lrosetta/order/TriggerDto;", "trigger", "Lrosetta/order/TimeInForceDto;", "time_in_force", "", "extended_hours", "Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "dollar_based_amount", "Lcom/robinhood/rosetta/eventlogging/TrailingPegDto;", "trailing_peg", "override_day_trade_checks", "override_dtbp_checks", "is_ipo_access_order", "ipo_access_lower_collared_price", "ipo_access_lower_price", "ipo_access_upper_collared_price", "ipo_access_upper_price", "has_ipo_access_custom_price_limit", "", "check_overrides", "preset_percent_limit", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "order_form_version", "Lrosetta/order/MarketHoursDto;", "market_hours", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", BidAskDetails3.BID_PRICE, BidAskDetails3.ASK_PRICE, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "bid_ask_timestamp", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;", "tax_lot_selection_type", "Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionDto;", "tax_lots", "Lcom/robinhood/rosetta/eventlogging/TaxLotSelectionDto;", "tax_lots_v2", "estimated_total_fee", "Lrosetta/order/PositionEffectDto;", "position_effect", "Lrosetta/order/OrderEntryPointDto;", "order_entry_point", "Lrosetta/order/OrderInputFormatDto;", "order_input_format", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/OrderTypeDto;Lrosetta/order/TriggerDto;Lrosetta/order/TimeInForceDto;ZLcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/TrailingPegDto;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;ILrosetta/order/MarketHoursDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lrosetta/order/PositionEffectDto;Lrosetta/order/OrderEntryPointDto;Lrosetta/order/OrderInputFormatDto;)V", "seen0", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/OrderTypeDto;Lrosetta/order/TriggerDto;Lrosetta/order/TimeInForceDto;ZLcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/TrailingPegDto;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;ILrosetta/order/MarketHoursDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lrosetta/order/PositionEffectDto;Lrosetta/order/OrderEntryPointDto;Lrosetta/order/OrderInputFormatDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lrosetta/order/SideDto;", "component7", "component8", "component9", "()Lrosetta/order/OrderTypeDto;", "component10", "()Lrosetta/order/TriggerDto;", "component11", "()Lrosetta/order/TimeInForceDto;", "component12", "()Z", "component13", "()Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "component14", "()Lcom/robinhood/rosetta/eventlogging/TrailingPegDto;", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "()Ljava/util/List;", "component24", "component25", "()I", "component26", "()Lrosetta/order/MarketHoursDto;", "component27", "()Lcom/robinhood/idl/IdlDecimal;", "component28", "component29", "()Lj$/time/Instant;", "component30", "()Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;", "component31", "component32", "component33", "component34", "()Lrosetta/order/PositionEffectDto;", "component35", "()Lrosetta/order/OrderEntryPointDto;", "component36", "()Lrosetta/order/OrderInputFormatDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/SideDto;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/OrderTypeDto;Lrosetta/order/TriggerDto;Lrosetta/order/TimeInForceDto;ZLcom/robinhood/rosetta/eventlogging/MoneyDto;Lcom/robinhood/rosetta/eventlogging/TrailingPegDto;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;ILrosetta/order/MarketHoursDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lrosetta/order/PositionEffectDto;Lrosetta/order/OrderEntryPointDto;Lrosetta/order/OrderInputFormatDto;)Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto$Surrogate;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRef_id", "getRef_id$annotations", "()V", "getAccount", "getAccount$annotations", "getInstrument", "getInstrument$annotations", "getSymbol", "getSymbol$annotations", "getQuantity", "getQuantity$annotations", "Lrosetta/order/SideDto;", "getSide", "getSide$annotations", "getPrice", "getPrice$annotations", "getStop_price", "getStop_price$annotations", "Lrosetta/order/OrderTypeDto;", "getType", "getType$annotations", "Lrosetta/order/TriggerDto;", "getTrigger", "getTrigger$annotations", "Lrosetta/order/TimeInForceDto;", "getTime_in_force", "getTime_in_force$annotations", "Z", "getExtended_hours", "getExtended_hours$annotations", "Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "getDollar_based_amount", "getDollar_based_amount$annotations", "Lcom/robinhood/rosetta/eventlogging/TrailingPegDto;", "getTrailing_peg", "getTrailing_peg$annotations", "getOverride_day_trade_checks", "getOverride_day_trade_checks$annotations", "getOverride_dtbp_checks", "getOverride_dtbp_checks$annotations", "is_ipo_access_order$annotations", "getIpo_access_lower_collared_price", "getIpo_access_lower_collared_price$annotations", "getIpo_access_lower_price", "getIpo_access_lower_price$annotations", "getIpo_access_upper_collared_price", "getIpo_access_upper_collared_price$annotations", "getIpo_access_upper_price", "getIpo_access_upper_price$annotations", "getHas_ipo_access_custom_price_limit", "getHas_ipo_access_custom_price_limit$annotations", "Ljava/util/List;", "getCheck_overrides", "getCheck_overrides$annotations", "getPreset_percent_limit", "getPreset_percent_limit$annotations", "I", "getOrder_form_version", "getOrder_form_version$annotations", "Lrosetta/order/MarketHoursDto;", "getMarket_hours", "getMarket_hours$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getBid_price", "getBid_price$annotations", "getAsk_price", "getAsk_price$annotations", "Lj$/time/Instant;", "getBid_ask_timestamp", "getBid_ask_timestamp$annotations", "Lcom/robinhood/cbc/service/tax_lot/v1/DisposalMethodDto;", "getTax_lot_selection_type", "getTax_lot_selection_type$annotations", "getTax_lots", "getTax_lots$annotations", "getTax_lots_v2", "getTax_lots_v2$annotations", "getEstimated_total_fee", "getEstimated_total_fee$annotations", "Lrosetta/order/PositionEffectDto;", "getPosition_effect", "getPosition_effect$annotations", "Lrosetta/order/OrderEntryPointDto;", "getOrder_entry_point", "getOrder_entry_point$annotations", "Lrosetta/order/OrderInputFormatDto;", "getOrder_input_format", "getOrder_input_format$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account;
        private final IdlDecimal ask_price;
        private final Instant bid_ask_timestamp;
        private final IdlDecimal bid_price;
        private final java.util.List<String> check_overrides;
        private final MoneyDto dollar_based_amount;
        private final String estimated_total_fee;
        private final boolean extended_hours;
        private final boolean has_ipo_access_custom_price_limit;
        private final String instrument;
        private final String ipo_access_lower_collared_price;
        private final String ipo_access_lower_price;
        private final String ipo_access_upper_collared_price;
        private final String ipo_access_upper_price;
        private final boolean is_ipo_access_order;
        private final MarketHoursDto market_hours;
        private final OrderEntryPointDto order_entry_point;
        private final int order_form_version;
        private final OrderInputFormatDto order_input_format;
        private final boolean override_day_trade_checks;
        private final boolean override_dtbp_checks;
        private final PositionEffectDto position_effect;
        private final String preset_percent_limit;
        private final String price;
        private final String quantity;
        private final String ref_id;
        private final SideDto side;
        private final String stop_price;
        private final String symbol;
        private final DisposalMethodDto tax_lot_selection_type;
        private final java.util.List<com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelectionDto> tax_lots;
        private final java.util.List<TaxLotSelectionDto> tax_lots_v2;
        private final TimeInForceDto time_in_force;
        private final TrailingPegDto trailing_peg;
        private final TriggerDto trigger;
        private final OrderTypeDto type;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (SideDto) null, (String) null, (String) null, (OrderTypeDto) null, (TriggerDto) null, (TimeInForceDto) null, false, (MoneyDto) null, (TrailingPegDto) null, false, false, false, (String) null, (String) null, (String) null, (String) null, false, (java.util.List) null, (String) null, 0, (MarketHoursDto) null, (IdlDecimal) null, (IdlDecimal) null, (Instant) null, (DisposalMethodDto) null, (java.util.List) null, (java.util.List) null, (String) null, (PositionEffectDto) null, (OrderEntryPointDto) null, (OrderInputFormatDto) null, -1, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(TaxLotSelectionDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(TaxLotSelectionDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, SideDto sideDto, String str6, String str7, OrderTypeDto orderTypeDto, TriggerDto triggerDto, TimeInForceDto timeInForceDto, boolean z, MoneyDto moneyDto, TrailingPegDto trailingPegDto, boolean z2, boolean z3, boolean z4, String str8, String str9, String str10, String str11, boolean z5, java.util.List list, String str12, int i, MarketHoursDto marketHoursDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, Instant instant, DisposalMethodDto disposalMethodDto, java.util.List list2, java.util.List list3, String str13, PositionEffectDto positionEffectDto, OrderEntryPointDto orderEntryPointDto, OrderInputFormatDto orderInputFormatDto, int i2, int i3, Object obj) {
            OrderInputFormatDto orderInputFormatDto2;
            OrderEntryPointDto orderEntryPointDto2;
            String str14;
            String str15;
            boolean z6;
            java.util.List list4;
            String str16;
            int i4;
            MarketHoursDto marketHoursDto2;
            IdlDecimal idlDecimal3;
            IdlDecimal idlDecimal4;
            Instant instant2;
            DisposalMethodDto disposalMethodDto2;
            java.util.List list5;
            java.util.List list6;
            String str17;
            PositionEffectDto positionEffectDto2;
            boolean z7;
            String str18;
            SideDto sideDto2;
            String str19;
            String str20;
            OrderTypeDto orderTypeDto2;
            TriggerDto triggerDto2;
            TimeInForceDto timeInForceDto2;
            boolean z8;
            MoneyDto moneyDto2;
            TrailingPegDto trailingPegDto2;
            boolean z9;
            boolean z10;
            String str21;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26 = (i2 & 1) != 0 ? surrogate.ref_id : str;
            String str27 = (i2 & 2) != 0 ? surrogate.account : str2;
            String str28 = (i2 & 4) != 0 ? surrogate.instrument : str3;
            String str29 = (i2 & 8) != 0 ? surrogate.symbol : str4;
            String str30 = (i2 & 16) != 0 ? surrogate.quantity : str5;
            SideDto sideDto3 = (i2 & 32) != 0 ? surrogate.side : sideDto;
            String str31 = (i2 & 64) != 0 ? surrogate.price : str6;
            String str32 = (i2 & 128) != 0 ? surrogate.stop_price : str7;
            OrderTypeDto orderTypeDto3 = (i2 & 256) != 0 ? surrogate.type : orderTypeDto;
            TriggerDto triggerDto3 = (i2 & 512) != 0 ? surrogate.trigger : triggerDto;
            TimeInForceDto timeInForceDto3 = (i2 & 1024) != 0 ? surrogate.time_in_force : timeInForceDto;
            boolean z11 = (i2 & 2048) != 0 ? surrogate.extended_hours : z;
            MoneyDto moneyDto3 = (i2 & 4096) != 0 ? surrogate.dollar_based_amount : moneyDto;
            TrailingPegDto trailingPegDto3 = (i2 & 8192) != 0 ? surrogate.trailing_peg : trailingPegDto;
            String str33 = str26;
            boolean z12 = (i2 & 16384) != 0 ? surrogate.override_day_trade_checks : z2;
            boolean z13 = (i2 & 32768) != 0 ? surrogate.override_dtbp_checks : z3;
            boolean z14 = (i2 & 65536) != 0 ? surrogate.is_ipo_access_order : z4;
            String str34 = (i2 & 131072) != 0 ? surrogate.ipo_access_lower_collared_price : str8;
            String str35 = (i2 & 262144) != 0 ? surrogate.ipo_access_lower_price : str9;
            String str36 = (i2 & 524288) != 0 ? surrogate.ipo_access_upper_collared_price : str10;
            String str37 = (i2 & 1048576) != 0 ? surrogate.ipo_access_upper_price : str11;
            boolean z15 = (i2 & 2097152) != 0 ? surrogate.has_ipo_access_custom_price_limit : z5;
            java.util.List list7 = (i2 & 4194304) != 0 ? surrogate.check_overrides : list;
            String str38 = (i2 & 8388608) != 0 ? surrogate.preset_percent_limit : str12;
            int i5 = (i2 & 16777216) != 0 ? surrogate.order_form_version : i;
            MarketHoursDto marketHoursDto3 = (i2 & 33554432) != 0 ? surrogate.market_hours : marketHoursDto;
            IdlDecimal idlDecimal5 = (i2 & 67108864) != 0 ? surrogate.bid_price : idlDecimal;
            IdlDecimal idlDecimal6 = (i2 & 134217728) != 0 ? surrogate.ask_price : idlDecimal2;
            Instant instant3 = (i2 & 268435456) != 0 ? surrogate.bid_ask_timestamp : instant;
            DisposalMethodDto disposalMethodDto3 = (i2 & 536870912) != 0 ? surrogate.tax_lot_selection_type : disposalMethodDto;
            java.util.List list8 = (i2 & 1073741824) != 0 ? surrogate.tax_lots : list2;
            java.util.List list9 = (i2 & Integer.MIN_VALUE) != 0 ? surrogate.tax_lots_v2 : list3;
            String str39 = (i3 & 1) != 0 ? surrogate.estimated_total_fee : str13;
            PositionEffectDto positionEffectDto3 = (i3 & 2) != 0 ? surrogate.position_effect : positionEffectDto;
            OrderEntryPointDto orderEntryPointDto3 = (i3 & 4) != 0 ? surrogate.order_entry_point : orderEntryPointDto;
            if ((i3 & 8) != 0) {
                orderEntryPointDto2 = orderEntryPointDto3;
                orderInputFormatDto2 = surrogate.order_input_format;
                str15 = str37;
                z6 = z15;
                list4 = list7;
                str16 = str38;
                i4 = i5;
                marketHoursDto2 = marketHoursDto3;
                idlDecimal3 = idlDecimal5;
                idlDecimal4 = idlDecimal6;
                instant2 = instant3;
                disposalMethodDto2 = disposalMethodDto3;
                list5 = list8;
                list6 = list9;
                str17 = str39;
                positionEffectDto2 = positionEffectDto3;
                z7 = z12;
                sideDto2 = sideDto3;
                str19 = str31;
                str20 = str32;
                orderTypeDto2 = orderTypeDto3;
                triggerDto2 = triggerDto3;
                timeInForceDto2 = timeInForceDto3;
                z8 = z11;
                moneyDto2 = moneyDto3;
                trailingPegDto2 = trailingPegDto3;
                z9 = z13;
                z10 = z14;
                str21 = str34;
                str22 = str35;
                str14 = str36;
                str23 = str27;
                str24 = str28;
                str25 = str29;
                str18 = str30;
            } else {
                orderInputFormatDto2 = orderInputFormatDto;
                orderEntryPointDto2 = orderEntryPointDto3;
                str14 = str36;
                str15 = str37;
                z6 = z15;
                list4 = list7;
                str16 = str38;
                i4 = i5;
                marketHoursDto2 = marketHoursDto3;
                idlDecimal3 = idlDecimal5;
                idlDecimal4 = idlDecimal6;
                instant2 = instant3;
                disposalMethodDto2 = disposalMethodDto3;
                list5 = list8;
                list6 = list9;
                str17 = str39;
                positionEffectDto2 = positionEffectDto3;
                z7 = z12;
                str18 = str30;
                sideDto2 = sideDto3;
                str19 = str31;
                str20 = str32;
                orderTypeDto2 = orderTypeDto3;
                triggerDto2 = triggerDto3;
                timeInForceDto2 = timeInForceDto3;
                z8 = z11;
                moneyDto2 = moneyDto3;
                trailingPegDto2 = trailingPegDto3;
                z9 = z13;
                z10 = z14;
                str21 = str34;
                str22 = str35;
                str23 = str27;
                str24 = str28;
                str25 = str29;
            }
            return surrogate.copy(str33, str23, str24, str25, str18, sideDto2, str19, str20, orderTypeDto2, triggerDto2, timeInForceDto2, z8, moneyDto2, trailingPegDto2, z7, z9, z10, str21, str22, str14, str15, z6, list4, str16, i4, marketHoursDto2, idlDecimal3, idlDecimal4, instant2, disposalMethodDto2, list5, list6, str17, positionEffectDto2, orderEntryPointDto2, orderInputFormatDto2);
        }

        @SerialName("account")
        @JsonAnnotations2(names = {"account"})
        public static /* synthetic */ void getAccount$annotations() {
        }

        @SerialName("askPrice")
        @JsonAnnotations2(names = {BidAskDetails3.ASK_PRICE})
        public static /* synthetic */ void getAsk_price$annotations() {
        }

        @SerialName("bidAskTimestamp")
        @JsonAnnotations2(names = {"bid_ask_timestamp"})
        public static /* synthetic */ void getBid_ask_timestamp$annotations() {
        }

        @SerialName("bidPrice")
        @JsonAnnotations2(names = {BidAskDetails3.BID_PRICE})
        public static /* synthetic */ void getBid_price$annotations() {
        }

        @SerialName("checkOverrides")
        @JsonAnnotations2(names = {"check_overrides"})
        public static /* synthetic */ void getCheck_overrides$annotations() {
        }

        @SerialName("dollarBasedAmount")
        @JsonAnnotations2(names = {"dollar_based_amount"})
        public static /* synthetic */ void getDollar_based_amount$annotations() {
        }

        @SerialName("estimatedTotalFee")
        @JsonAnnotations2(names = {"estimated_total_fee"})
        public static /* synthetic */ void getEstimated_total_fee$annotations() {
        }

        @SerialName("extendedHours")
        @JsonAnnotations2(names = {"extended_hours"})
        public static /* synthetic */ void getExtended_hours$annotations() {
        }

        @SerialName("hasIpoAccessCustomPriceLimit")
        @JsonAnnotations2(names = {"has_ipo_access_custom_price_limit"})
        public static /* synthetic */ void getHas_ipo_access_custom_price_limit$annotations() {
        }

        @SerialName("instrument")
        @JsonAnnotations2(names = {"instrument"})
        public static /* synthetic */ void getInstrument$annotations() {
        }

        @SerialName("ipoAccessLowerCollaredPrice")
        @JsonAnnotations2(names = {"ipo_access_lower_collared_price"})
        public static /* synthetic */ void getIpo_access_lower_collared_price$annotations() {
        }

        @SerialName("ipoAccessLowerPrice")
        @JsonAnnotations2(names = {"ipo_access_lower_price"})
        public static /* synthetic */ void getIpo_access_lower_price$annotations() {
        }

        @SerialName("ipoAccessUpperCollaredPrice")
        @JsonAnnotations2(names = {"ipo_access_upper_collared_price"})
        public static /* synthetic */ void getIpo_access_upper_collared_price$annotations() {
        }

        @SerialName("ipoAccessUpperPrice")
        @JsonAnnotations2(names = {"ipo_access_upper_price"})
        public static /* synthetic */ void getIpo_access_upper_price$annotations() {
        }

        @SerialName("marketHours")
        @JsonAnnotations2(names = {"market_hours"})
        public static /* synthetic */ void getMarket_hours$annotations() {
        }

        @SerialName("orderEntryPoint")
        @JsonAnnotations2(names = {"order_entry_point"})
        public static /* synthetic */ void getOrder_entry_point$annotations() {
        }

        @SerialName("orderFormVersion")
        @JsonAnnotations2(names = {"order_form_version"})
        public static /* synthetic */ void getOrder_form_version$annotations() {
        }

        @SerialName("orderInputFormat")
        @JsonAnnotations2(names = {"order_input_format"})
        public static /* synthetic */ void getOrder_input_format$annotations() {
        }

        @SerialName("overrideDayTradeChecks")
        @JsonAnnotations2(names = {"override_day_trade_checks"})
        public static /* synthetic */ void getOverride_day_trade_checks$annotations() {
        }

        @SerialName("overrideDtbpChecks")
        @JsonAnnotations2(names = {"override_dtbp_checks"})
        public static /* synthetic */ void getOverride_dtbp_checks$annotations() {
        }

        @SerialName("positionEffect")
        @JsonAnnotations2(names = {"position_effect"})
        public static /* synthetic */ void getPosition_effect$annotations() {
        }

        @SerialName("presetPercentLimit")
        @JsonAnnotations2(names = {"preset_percent_limit"})
        public static /* synthetic */ void getPreset_percent_limit$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("refId")
        @JsonAnnotations2(names = {"ref_id"})
        public static /* synthetic */ void getRef_id$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        @SerialName("stopPrice")
        @JsonAnnotations2(names = {"stop_price"})
        public static /* synthetic */ void getStop_price$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("taxLotSelectionType")
        @JsonAnnotations2(names = {"tax_lot_selection_type"})
        public static /* synthetic */ void getTax_lot_selection_type$annotations() {
        }

        @SerialName("taxLots")
        @JsonAnnotations2(names = {"tax_lots"})
        public static /* synthetic */ void getTax_lots$annotations() {
        }

        @SerialName("taxLotsV2")
        @JsonAnnotations2(names = {"tax_lots_v2"})
        public static /* synthetic */ void getTax_lots_v2$annotations() {
        }

        @SerialName("timeInForce")
        @JsonAnnotations2(names = {"time_in_force"})
        public static /* synthetic */ void getTime_in_force$annotations() {
        }

        @SerialName("trailingPeg")
        @JsonAnnotations2(names = {"trailing_peg"})
        public static /* synthetic */ void getTrailing_peg$annotations() {
        }

        @SerialName("trigger")
        @JsonAnnotations2(names = {"trigger"})
        public static /* synthetic */ void getTrigger$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("isIpoAccessOrder")
        @JsonAnnotations2(names = {"is_ipo_access_order"})
        public static /* synthetic */ void is_ipo_access_order$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component10, reason: from getter */
        public final TriggerDto getTrigger() {
            return this.trigger;
        }

        /* renamed from: component11, reason: from getter */
        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getExtended_hours() {
            return this.extended_hours;
        }

        /* renamed from: component13, reason: from getter */
        public final MoneyDto getDollar_based_amount() {
            return this.dollar_based_amount;
        }

        /* renamed from: component14, reason: from getter */
        public final TrailingPegDto getTrailing_peg() {
            return this.trailing_peg;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getOverride_day_trade_checks() {
            return this.override_day_trade_checks;
        }

        /* renamed from: component16, reason: from getter */
        public final boolean getOverride_dtbp_checks() {
            return this.override_dtbp_checks;
        }

        /* renamed from: component17, reason: from getter */
        public final boolean getIs_ipo_access_order() {
            return this.is_ipo_access_order;
        }

        /* renamed from: component18, reason: from getter */
        public final String getIpo_access_lower_collared_price() {
            return this.ipo_access_lower_collared_price;
        }

        /* renamed from: component19, reason: from getter */
        public final String getIpo_access_lower_price() {
            return this.ipo_access_lower_price;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccount() {
            return this.account;
        }

        /* renamed from: component20, reason: from getter */
        public final String getIpo_access_upper_collared_price() {
            return this.ipo_access_upper_collared_price;
        }

        /* renamed from: component21, reason: from getter */
        public final String getIpo_access_upper_price() {
            return this.ipo_access_upper_price;
        }

        /* renamed from: component22, reason: from getter */
        public final boolean getHas_ipo_access_custom_price_limit() {
            return this.has_ipo_access_custom_price_limit;
        }

        public final java.util.List<String> component23() {
            return this.check_overrides;
        }

        /* renamed from: component24, reason: from getter */
        public final String getPreset_percent_limit() {
            return this.preset_percent_limit;
        }

        /* renamed from: component25, reason: from getter */
        public final int getOrder_form_version() {
            return this.order_form_version;
        }

        /* renamed from: component26, reason: from getter */
        public final MarketHoursDto getMarket_hours() {
            return this.market_hours;
        }

        /* renamed from: component27, reason: from getter */
        public final IdlDecimal getBid_price() {
            return this.bid_price;
        }

        /* renamed from: component28, reason: from getter */
        public final IdlDecimal getAsk_price() {
            return this.ask_price;
        }

        /* renamed from: component29, reason: from getter */
        public final Instant getBid_ask_timestamp() {
            return this.bid_ask_timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final String getInstrument() {
            return this.instrument;
        }

        /* renamed from: component30, reason: from getter */
        public final DisposalMethodDto getTax_lot_selection_type() {
            return this.tax_lot_selection_type;
        }

        public final java.util.List<com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelectionDto> component31() {
            return this.tax_lots;
        }

        public final java.util.List<TaxLotSelectionDto> component32() {
            return this.tax_lots_v2;
        }

        /* renamed from: component33, reason: from getter */
        public final String getEstimated_total_fee() {
            return this.estimated_total_fee;
        }

        /* renamed from: component34, reason: from getter */
        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        /* renamed from: component35, reason: from getter */
        public final OrderEntryPointDto getOrder_entry_point() {
            return this.order_entry_point;
        }

        /* renamed from: component36, reason: from getter */
        public final OrderInputFormatDto getOrder_input_format() {
            return this.order_input_format;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component5, reason: from getter */
        public final String getQuantity() {
            return this.quantity;
        }

        /* renamed from: component6, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        /* renamed from: component8, reason: from getter */
        public final String getStop_price() {
            return this.stop_price;
        }

        /* renamed from: component9, reason: from getter */
        public final OrderTypeDto getType() {
            return this.type;
        }

        public final Surrogate copy(String ref_id, String account, String instrument, String symbol, String quantity, SideDto side, String price, String stop_price, OrderTypeDto type2, TriggerDto trigger, TimeInForceDto time_in_force, boolean extended_hours, MoneyDto dollar_based_amount, TrailingPegDto trailing_peg, boolean override_day_trade_checks, boolean override_dtbp_checks, boolean is_ipo_access_order, String ipo_access_lower_collared_price, String ipo_access_lower_price, String ipo_access_upper_collared_price, String ipo_access_upper_price, boolean has_ipo_access_custom_price_limit, java.util.List<String> check_overrides, String preset_percent_limit, int order_form_version, MarketHoursDto market_hours, IdlDecimal bid_price, IdlDecimal ask_price, Instant bid_ask_timestamp, DisposalMethodDto tax_lot_selection_type, java.util.List<com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelectionDto> tax_lots, java.util.List<TaxLotSelectionDto> tax_lots_v2, String estimated_total_fee, PositionEffectDto position_effect, OrderEntryPointDto order_entry_point, OrderInputFormatDto order_input_format) {
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(stop_price, "stop_price");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(ipo_access_lower_collared_price, "ipo_access_lower_collared_price");
            Intrinsics.checkNotNullParameter(ipo_access_lower_price, "ipo_access_lower_price");
            Intrinsics.checkNotNullParameter(ipo_access_upper_collared_price, "ipo_access_upper_collared_price");
            Intrinsics.checkNotNullParameter(ipo_access_upper_price, "ipo_access_upper_price");
            Intrinsics.checkNotNullParameter(check_overrides, "check_overrides");
            Intrinsics.checkNotNullParameter(preset_percent_limit, "preset_percent_limit");
            Intrinsics.checkNotNullParameter(market_hours, "market_hours");
            Intrinsics.checkNotNullParameter(bid_price, "bid_price");
            Intrinsics.checkNotNullParameter(ask_price, "ask_price");
            Intrinsics.checkNotNullParameter(tax_lot_selection_type, "tax_lot_selection_type");
            Intrinsics.checkNotNullParameter(tax_lots, "tax_lots");
            Intrinsics.checkNotNullParameter(tax_lots_v2, "tax_lots_v2");
            Intrinsics.checkNotNullParameter(estimated_total_fee, "estimated_total_fee");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(order_entry_point, "order_entry_point");
            Intrinsics.checkNotNullParameter(order_input_format, "order_input_format");
            return new Surrogate(ref_id, account, instrument, symbol, quantity, side, price, stop_price, type2, trigger, time_in_force, extended_hours, dollar_based_amount, trailing_peg, override_day_trade_checks, override_dtbp_checks, is_ipo_access_order, ipo_access_lower_collared_price, ipo_access_lower_price, ipo_access_upper_collared_price, ipo_access_upper_price, has_ipo_access_custom_price_limit, check_overrides, preset_percent_limit, order_form_version, market_hours, bid_price, ask_price, bid_ask_timestamp, tax_lot_selection_type, tax_lots, tax_lots_v2, estimated_total_fee, position_effect, order_entry_point, order_input_format);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.account, surrogate.account) && Intrinsics.areEqual(this.instrument, surrogate.instrument) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && this.side == surrogate.side && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.stop_price, surrogate.stop_price) && this.type == surrogate.type && this.trigger == surrogate.trigger && this.time_in_force == surrogate.time_in_force && this.extended_hours == surrogate.extended_hours && Intrinsics.areEqual(this.dollar_based_amount, surrogate.dollar_based_amount) && Intrinsics.areEqual(this.trailing_peg, surrogate.trailing_peg) && this.override_day_trade_checks == surrogate.override_day_trade_checks && this.override_dtbp_checks == surrogate.override_dtbp_checks && this.is_ipo_access_order == surrogate.is_ipo_access_order && Intrinsics.areEqual(this.ipo_access_lower_collared_price, surrogate.ipo_access_lower_collared_price) && Intrinsics.areEqual(this.ipo_access_lower_price, surrogate.ipo_access_lower_price) && Intrinsics.areEqual(this.ipo_access_upper_collared_price, surrogate.ipo_access_upper_collared_price) && Intrinsics.areEqual(this.ipo_access_upper_price, surrogate.ipo_access_upper_price) && this.has_ipo_access_custom_price_limit == surrogate.has_ipo_access_custom_price_limit && Intrinsics.areEqual(this.check_overrides, surrogate.check_overrides) && Intrinsics.areEqual(this.preset_percent_limit, surrogate.preset_percent_limit) && this.order_form_version == surrogate.order_form_version && this.market_hours == surrogate.market_hours && Intrinsics.areEqual(this.bid_price, surrogate.bid_price) && Intrinsics.areEqual(this.ask_price, surrogate.ask_price) && Intrinsics.areEqual(this.bid_ask_timestamp, surrogate.bid_ask_timestamp) && this.tax_lot_selection_type == surrogate.tax_lot_selection_type && Intrinsics.areEqual(this.tax_lots, surrogate.tax_lots) && Intrinsics.areEqual(this.tax_lots_v2, surrogate.tax_lots_v2) && Intrinsics.areEqual(this.estimated_total_fee, surrogate.estimated_total_fee) && this.position_effect == surrogate.position_effect && this.order_entry_point == surrogate.order_entry_point && this.order_input_format == surrogate.order_input_format;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((this.ref_id.hashCode() * 31) + this.account.hashCode()) * 31) + this.instrument.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.side.hashCode()) * 31) + this.price.hashCode()) * 31) + this.stop_price.hashCode()) * 31) + this.type.hashCode()) * 31) + this.trigger.hashCode()) * 31) + this.time_in_force.hashCode()) * 31) + java.lang.Boolean.hashCode(this.extended_hours)) * 31;
            MoneyDto moneyDto = this.dollar_based_amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            TrailingPegDto trailingPegDto = this.trailing_peg;
            int iHashCode3 = (((((((((((((((((((((((((((((iHashCode2 + (trailingPegDto == null ? 0 : trailingPegDto.hashCode())) * 31) + java.lang.Boolean.hashCode(this.override_day_trade_checks)) * 31) + java.lang.Boolean.hashCode(this.override_dtbp_checks)) * 31) + java.lang.Boolean.hashCode(this.is_ipo_access_order)) * 31) + this.ipo_access_lower_collared_price.hashCode()) * 31) + this.ipo_access_lower_price.hashCode()) * 31) + this.ipo_access_upper_collared_price.hashCode()) * 31) + this.ipo_access_upper_price.hashCode()) * 31) + java.lang.Boolean.hashCode(this.has_ipo_access_custom_price_limit)) * 31) + this.check_overrides.hashCode()) * 31) + this.preset_percent_limit.hashCode()) * 31) + Integer.hashCode(this.order_form_version)) * 31) + this.market_hours.hashCode()) * 31) + this.bid_price.hashCode()) * 31) + this.ask_price.hashCode()) * 31;
            Instant instant = this.bid_ask_timestamp;
            return ((((((((((((((iHashCode3 + (instant != null ? instant.hashCode() : 0)) * 31) + this.tax_lot_selection_type.hashCode()) * 31) + this.tax_lots.hashCode()) * 31) + this.tax_lots_v2.hashCode()) * 31) + this.estimated_total_fee.hashCode()) * 31) + this.position_effect.hashCode()) * 31) + this.order_entry_point.hashCode()) * 31) + this.order_input_format.hashCode();
        }

        public String toString() {
            return "Surrogate(ref_id=" + this.ref_id + ", account=" + this.account + ", instrument=" + this.instrument + ", symbol=" + this.symbol + ", quantity=" + this.quantity + ", side=" + this.side + ", price=" + this.price + ", stop_price=" + this.stop_price + ", type=" + this.type + ", trigger=" + this.trigger + ", time_in_force=" + this.time_in_force + ", extended_hours=" + this.extended_hours + ", dollar_based_amount=" + this.dollar_based_amount + ", trailing_peg=" + this.trailing_peg + ", override_day_trade_checks=" + this.override_day_trade_checks + ", override_dtbp_checks=" + this.override_dtbp_checks + ", is_ipo_access_order=" + this.is_ipo_access_order + ", ipo_access_lower_collared_price=" + this.ipo_access_lower_collared_price + ", ipo_access_lower_price=" + this.ipo_access_lower_price + ", ipo_access_upper_collared_price=" + this.ipo_access_upper_collared_price + ", ipo_access_upper_price=" + this.ipo_access_upper_price + ", has_ipo_access_custom_price_limit=" + this.has_ipo_access_custom_price_limit + ", check_overrides=" + this.check_overrides + ", preset_percent_limit=" + this.preset_percent_limit + ", order_form_version=" + this.order_form_version + ", market_hours=" + this.market_hours + ", bid_price=" + this.bid_price + ", ask_price=" + this.ask_price + ", bid_ask_timestamp=" + this.bid_ask_timestamp + ", tax_lot_selection_type=" + this.tax_lot_selection_type + ", tax_lots=" + this.tax_lots + ", tax_lots_v2=" + this.tax_lots_v2 + ", estimated_total_fee=" + this.estimated_total_fee + ", position_effect=" + this.position_effect + ", order_entry_point=" + this.order_entry_point + ", order_input_format=" + this.order_input_format + ")";
        }

        /* compiled from: EquityOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EquityOrderPayloadDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.eventlogging.EquityOrderPayloadDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityOrderPayloadDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.eventlogging.EquityOrderPayloadDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityOrderPayloadDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.eventlogging.EquityOrderPayloadDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityOrderPayloadDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, int i2, String str, String str2, String str3, String str4, String str5, SideDto sideDto, String str6, String str7, OrderTypeDto orderTypeDto, TriggerDto triggerDto, TimeInForceDto timeInForceDto, boolean z, MoneyDto moneyDto, TrailingPegDto trailingPegDto, boolean z2, boolean z3, boolean z4, String str8, String str9, String str10, String str11, boolean z5, java.util.List list, String str12, int i3, MarketHoursDto marketHoursDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, Instant instant, DisposalMethodDto disposalMethodDto, java.util.List list2, java.util.List list3, String str13, PositionEffectDto positionEffectDto, OrderEntryPointDto orderEntryPointDto, OrderInputFormatDto orderInputFormatDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str;
            }
            if ((i & 2) == 0) {
                this.account = "";
            } else {
                this.account = str2;
            }
            if ((i & 4) == 0) {
                this.instrument = "";
            } else {
                this.instrument = str3;
            }
            if ((i & 8) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str4;
            }
            if ((i & 16) == 0) {
                this.quantity = "";
            } else {
                this.quantity = str5;
            }
            if ((i & 32) == 0) {
                this.side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.side = sideDto;
            }
            if ((i & 64) == 0) {
                this.price = "";
            } else {
                this.price = str6;
            }
            if ((i & 128) == 0) {
                this.stop_price = "";
            } else {
                this.stop_price = str7;
            }
            if ((i & 256) == 0) {
                this.type = OrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = orderTypeDto;
            }
            if ((i & 512) == 0) {
                this.trigger = TriggerDto.INSTANCE.getZeroValue();
            } else {
                this.trigger = triggerDto;
            }
            if ((i & 1024) == 0) {
                this.time_in_force = TimeInForceDto.INSTANCE.getZeroValue();
            } else {
                this.time_in_force = timeInForceDto;
            }
            if ((i & 2048) == 0) {
                this.extended_hours = false;
            } else {
                this.extended_hours = z;
            }
            if ((i & 4096) == 0) {
                this.dollar_based_amount = null;
            } else {
                this.dollar_based_amount = moneyDto;
            }
            if ((i & 8192) == 0) {
                this.trailing_peg = null;
            } else {
                this.trailing_peg = trailingPegDto;
            }
            if ((i & 16384) == 0) {
                this.override_day_trade_checks = false;
            } else {
                this.override_day_trade_checks = z2;
            }
            if ((32768 & i) == 0) {
                this.override_dtbp_checks = false;
            } else {
                this.override_dtbp_checks = z3;
            }
            if ((65536 & i) == 0) {
                this.is_ipo_access_order = false;
            } else {
                this.is_ipo_access_order = z4;
            }
            if ((131072 & i) == 0) {
                this.ipo_access_lower_collared_price = "";
            } else {
                this.ipo_access_lower_collared_price = str8;
            }
            if ((262144 & i) == 0) {
                this.ipo_access_lower_price = "";
            } else {
                this.ipo_access_lower_price = str9;
            }
            if ((524288 & i) == 0) {
                this.ipo_access_upper_collared_price = "";
            } else {
                this.ipo_access_upper_collared_price = str10;
            }
            if ((1048576 & i) == 0) {
                this.ipo_access_upper_price = "";
            } else {
                this.ipo_access_upper_price = str11;
            }
            if ((2097152 & i) == 0) {
                this.has_ipo_access_custom_price_limit = false;
            } else {
                this.has_ipo_access_custom_price_limit = z5;
            }
            this.check_overrides = (4194304 & i) == 0 ? CollectionsKt.emptyList() : list;
            if ((8388608 & i) == 0) {
                this.preset_percent_limit = "";
            } else {
                this.preset_percent_limit = str12;
            }
            if ((16777216 & i) == 0) {
                this.order_form_version = 0;
            } else {
                this.order_form_version = i3;
            }
            this.market_hours = (33554432 & i) == 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto;
            this.bid_price = (67108864 & i) == 0 ? new IdlDecimal("") : idlDecimal;
            this.ask_price = (134217728 & i) == 0 ? new IdlDecimal("") : idlDecimal2;
            if ((268435456 & i) == 0) {
                this.bid_ask_timestamp = null;
            } else {
                this.bid_ask_timestamp = instant;
            }
            this.tax_lot_selection_type = (536870912 & i) == 0 ? DisposalMethodDto.INSTANCE.getZeroValue() : disposalMethodDto;
            this.tax_lots = (1073741824 & i) == 0 ? CollectionsKt.emptyList() : list2;
            this.tax_lots_v2 = (i & Integer.MIN_VALUE) == 0 ? CollectionsKt.emptyList() : list3;
            if ((i2 & 1) == 0) {
                this.estimated_total_fee = "";
            } else {
                this.estimated_total_fee = str13;
            }
            this.position_effect = (i2 & 2) == 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto;
            this.order_entry_point = (i2 & 4) == 0 ? OrderEntryPointDto.INSTANCE.getZeroValue() : orderEntryPointDto;
            this.order_input_format = (i2 & 8) == 0 ? OrderInputFormatDto.INSTANCE.getZeroValue() : orderInputFormatDto;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.ref_id);
            }
            if (!Intrinsics.areEqual(self.account, "")) {
                output.encodeStringElement(serialDesc, 1, self.account);
            }
            if (!Intrinsics.areEqual(self.instrument, "")) {
                output.encodeStringElement(serialDesc, 2, self.instrument);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 3, self.symbol);
            }
            if (!Intrinsics.areEqual(self.quantity, "")) {
                output.encodeStringElement(serialDesc, 4, self.quantity);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, SideDto.Serializer.INSTANCE, self.side);
            }
            if (!Intrinsics.areEqual(self.price, "")) {
                output.encodeStringElement(serialDesc, 6, self.price);
            }
            if (!Intrinsics.areEqual(self.stop_price, "")) {
                output.encodeStringElement(serialDesc, 7, self.stop_price);
            }
            if (self.type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, OrderTypeDto.Serializer.INSTANCE, self.type);
            }
            if (self.trigger != TriggerDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, TriggerDto.Serializer.INSTANCE, self.trigger);
            }
            if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
            boolean z = self.extended_hours;
            if (z) {
                output.encodeBooleanElement(serialDesc, 11, z);
            }
            MoneyDto moneyDto = self.dollar_based_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            TrailingPegDto trailingPegDto = self.trailing_peg;
            if (trailingPegDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, TrailingPegDto.Serializer.INSTANCE, trailingPegDto);
            }
            boolean z2 = self.override_day_trade_checks;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 14, z2);
            }
            boolean z3 = self.override_dtbp_checks;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 15, z3);
            }
            boolean z4 = self.is_ipo_access_order;
            if (z4) {
                output.encodeBooleanElement(serialDesc, 16, z4);
            }
            if (!Intrinsics.areEqual(self.ipo_access_lower_collared_price, "")) {
                output.encodeStringElement(serialDesc, 17, self.ipo_access_lower_collared_price);
            }
            if (!Intrinsics.areEqual(self.ipo_access_lower_price, "")) {
                output.encodeStringElement(serialDesc, 18, self.ipo_access_lower_price);
            }
            if (!Intrinsics.areEqual(self.ipo_access_upper_collared_price, "")) {
                output.encodeStringElement(serialDesc, 19, self.ipo_access_upper_collared_price);
            }
            if (!Intrinsics.areEqual(self.ipo_access_upper_price, "")) {
                output.encodeStringElement(serialDesc, 20, self.ipo_access_upper_price);
            }
            boolean z5 = self.has_ipo_access_custom_price_limit;
            if (z5) {
                output.encodeBooleanElement(serialDesc, 21, z5);
            }
            if (!Intrinsics.areEqual(self.check_overrides, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 22, lazyArr[22].getValue(), self.check_overrides);
            }
            if (!Intrinsics.areEqual(self.preset_percent_limit, "")) {
                output.encodeStringElement(serialDesc, 23, self.preset_percent_limit);
            }
            int i = self.order_form_version;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 24, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (self.market_hours != MarketHoursDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 25, MarketHoursDto.Serializer.INSTANCE, self.market_hours);
            }
            if (!Intrinsics.areEqual(self.bid_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 26, IdlDecimalSerializer.INSTANCE, self.bid_price);
            }
            if (!Intrinsics.areEqual(self.ask_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 27, IdlDecimalSerializer.INSTANCE, self.ask_price);
            }
            Instant instant = self.bid_ask_timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 28, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.tax_lot_selection_type != DisposalMethodDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 29, DisposalMethodDto.Serializer.INSTANCE, self.tax_lot_selection_type);
            }
            if (!Intrinsics.areEqual(self.tax_lots, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 30, lazyArr[30].getValue(), self.tax_lots);
            }
            if (!Intrinsics.areEqual(self.tax_lots_v2, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 31, lazyArr[31].getValue(), self.tax_lots_v2);
            }
            if (!Intrinsics.areEqual(self.estimated_total_fee, "")) {
                output.encodeStringElement(serialDesc, 32, self.estimated_total_fee);
            }
            if (self.position_effect != PositionEffectDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 33, PositionEffectDto.Serializer.INSTANCE, self.position_effect);
            }
            if (self.order_entry_point != OrderEntryPointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 34, OrderEntryPointDto.Serializer.INSTANCE, self.order_entry_point);
            }
            if (self.order_input_format != OrderInputFormatDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 35, OrderInputFormatDto.Serializer.INSTANCE, self.order_input_format);
            }
        }

        public Surrogate(String ref_id, String account, String instrument, String symbol, String quantity, SideDto side, String price, String stop_price, OrderTypeDto type2, TriggerDto trigger, TimeInForceDto time_in_force, boolean z, MoneyDto moneyDto, TrailingPegDto trailingPegDto, boolean z2, boolean z3, boolean z4, String ipo_access_lower_collared_price, String ipo_access_lower_price, String ipo_access_upper_collared_price, String ipo_access_upper_price, boolean z5, java.util.List<String> check_overrides, String preset_percent_limit, int i, MarketHoursDto market_hours, IdlDecimal bid_price, IdlDecimal ask_price, Instant instant, DisposalMethodDto tax_lot_selection_type, java.util.List<com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelectionDto> tax_lots, java.util.List<TaxLotSelectionDto> tax_lots_v2, String estimated_total_fee, PositionEffectDto position_effect, OrderEntryPointDto order_entry_point, OrderInputFormatDto order_input_format) {
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(stop_price, "stop_price");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(ipo_access_lower_collared_price, "ipo_access_lower_collared_price");
            Intrinsics.checkNotNullParameter(ipo_access_lower_price, "ipo_access_lower_price");
            Intrinsics.checkNotNullParameter(ipo_access_upper_collared_price, "ipo_access_upper_collared_price");
            Intrinsics.checkNotNullParameter(ipo_access_upper_price, "ipo_access_upper_price");
            Intrinsics.checkNotNullParameter(check_overrides, "check_overrides");
            Intrinsics.checkNotNullParameter(preset_percent_limit, "preset_percent_limit");
            Intrinsics.checkNotNullParameter(market_hours, "market_hours");
            Intrinsics.checkNotNullParameter(bid_price, "bid_price");
            Intrinsics.checkNotNullParameter(ask_price, "ask_price");
            Intrinsics.checkNotNullParameter(tax_lot_selection_type, "tax_lot_selection_type");
            Intrinsics.checkNotNullParameter(tax_lots, "tax_lots");
            Intrinsics.checkNotNullParameter(tax_lots_v2, "tax_lots_v2");
            Intrinsics.checkNotNullParameter(estimated_total_fee, "estimated_total_fee");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(order_entry_point, "order_entry_point");
            Intrinsics.checkNotNullParameter(order_input_format, "order_input_format");
            this.ref_id = ref_id;
            this.account = account;
            this.instrument = instrument;
            this.symbol = symbol;
            this.quantity = quantity;
            this.side = side;
            this.price = price;
            this.stop_price = stop_price;
            this.type = type2;
            this.trigger = trigger;
            this.time_in_force = time_in_force;
            this.extended_hours = z;
            this.dollar_based_amount = moneyDto;
            this.trailing_peg = trailingPegDto;
            this.override_day_trade_checks = z2;
            this.override_dtbp_checks = z3;
            this.is_ipo_access_order = z4;
            this.ipo_access_lower_collared_price = ipo_access_lower_collared_price;
            this.ipo_access_lower_price = ipo_access_lower_price;
            this.ipo_access_upper_collared_price = ipo_access_upper_collared_price;
            this.ipo_access_upper_price = ipo_access_upper_price;
            this.has_ipo_access_custom_price_limit = z5;
            this.check_overrides = check_overrides;
            this.preset_percent_limit = preset_percent_limit;
            this.order_form_version = i;
            this.market_hours = market_hours;
            this.bid_price = bid_price;
            this.ask_price = ask_price;
            this.bid_ask_timestamp = instant;
            this.tax_lot_selection_type = tax_lot_selection_type;
            this.tax_lots = tax_lots;
            this.tax_lots_v2 = tax_lots_v2;
            this.estimated_total_fee = estimated_total_fee;
            this.position_effect = position_effect;
            this.order_entry_point = order_entry_point;
            this.order_input_format = order_input_format;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, SideDto sideDto, String str6, String str7, OrderTypeDto orderTypeDto, TriggerDto triggerDto, TimeInForceDto timeInForceDto, boolean z, MoneyDto moneyDto, TrailingPegDto trailingPegDto, boolean z2, boolean z3, boolean z4, String str8, String str9, String str10, String str11, boolean z5, java.util.List list, String str12, int i, MarketHoursDto marketHoursDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, Instant instant, DisposalMethodDto disposalMethodDto, java.util.List list2, java.util.List list3, String str13, PositionEffectDto positionEffectDto, OrderEntryPointDto orderEntryPointDto, OrderInputFormatDto orderInputFormatDto, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i2 & 512) != 0 ? TriggerDto.INSTANCE.getZeroValue() : triggerDto, (i2 & 1024) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i2 & 2048) != 0 ? false : z, (i2 & 4096) != 0 ? null : moneyDto, (i2 & 8192) != 0 ? null : trailingPegDto, (i2 & 16384) != 0 ? false : z2, (i2 & 32768) != 0 ? false : z3, (i2 & 65536) != 0 ? false : z4, (i2 & 131072) != 0 ? "" : str8, (i2 & 262144) != 0 ? "" : str9, (i2 & 524288) != 0 ? "" : str10, (i2 & 1048576) != 0 ? "" : str11, (i2 & 2097152) != 0 ? false : z5, (i2 & 4194304) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8388608) != 0 ? "" : str12, (i2 & 16777216) != 0 ? 0 : i, (i2 & 33554432) != 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto, (i2 & 67108864) != 0 ? new IdlDecimal("") : idlDecimal, (i2 & 134217728) != 0 ? new IdlDecimal("") : idlDecimal2, (i2 & 268435456) == 0 ? instant : null, (i2 & 536870912) != 0 ? DisposalMethodDto.INSTANCE.getZeroValue() : disposalMethodDto, (i2 & 1073741824) != 0 ? CollectionsKt.emptyList() : list2, (i2 & Integer.MIN_VALUE) != 0 ? CollectionsKt.emptyList() : list3, (i3 & 1) == 0 ? str13 : "", (i3 & 2) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i3 & 4) != 0 ? OrderEntryPointDto.INSTANCE.getZeroValue() : orderEntryPointDto, (i3 & 8) != 0 ? OrderInputFormatDto.INSTANCE.getZeroValue() : orderInputFormatDto);
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final String getAccount() {
            return this.account;
        }

        public final String getInstrument() {
            return this.instrument;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getQuantity() {
            return this.quantity;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final String getPrice() {
            return this.price;
        }

        public final String getStop_price() {
            return this.stop_price;
        }

        public final OrderTypeDto getType() {
            return this.type;
        }

        public final TriggerDto getTrigger() {
            return this.trigger;
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        public final boolean getExtended_hours() {
            return this.extended_hours;
        }

        public final MoneyDto getDollar_based_amount() {
            return this.dollar_based_amount;
        }

        public final TrailingPegDto getTrailing_peg() {
            return this.trailing_peg;
        }

        public final boolean getOverride_day_trade_checks() {
            return this.override_day_trade_checks;
        }

        public final boolean getOverride_dtbp_checks() {
            return this.override_dtbp_checks;
        }

        public final boolean is_ipo_access_order() {
            return this.is_ipo_access_order;
        }

        public final String getIpo_access_lower_collared_price() {
            return this.ipo_access_lower_collared_price;
        }

        public final String getIpo_access_lower_price() {
            return this.ipo_access_lower_price;
        }

        public final String getIpo_access_upper_collared_price() {
            return this.ipo_access_upper_collared_price;
        }

        public final String getIpo_access_upper_price() {
            return this.ipo_access_upper_price;
        }

        public final boolean getHas_ipo_access_custom_price_limit() {
            return this.has_ipo_access_custom_price_limit;
        }

        public final java.util.List<String> getCheck_overrides() {
            return this.check_overrides;
        }

        public final String getPreset_percent_limit() {
            return this.preset_percent_limit;
        }

        public final int getOrder_form_version() {
            return this.order_form_version;
        }

        public final MarketHoursDto getMarket_hours() {
            return this.market_hours;
        }

        public final IdlDecimal getBid_price() {
            return this.bid_price;
        }

        public final IdlDecimal getAsk_price() {
            return this.ask_price;
        }

        public final Instant getBid_ask_timestamp() {
            return this.bid_ask_timestamp;
        }

        public final DisposalMethodDto getTax_lot_selection_type() {
            return this.tax_lot_selection_type;
        }

        public final java.util.List<com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelectionDto> getTax_lots() {
            return this.tax_lots;
        }

        public final java.util.List<TaxLotSelectionDto> getTax_lots_v2() {
            return this.tax_lots_v2;
        }

        public final String getEstimated_total_fee() {
            return this.estimated_total_fee;
        }

        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        public final OrderEntryPointDto getOrder_entry_point() {
            return this.order_entry_point;
        }

        public final OrderInputFormatDto getOrder_input_format() {
            return this.order_input_format;
        }
    }

    /* compiled from: EquityOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayload;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EquityOrderPayloadDto, EquityOrderPayload> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EquityOrderPayloadDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquityOrderPayloadDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquityOrderPayloadDto> getBinaryBase64Serializer() {
            return (KSerializer) EquityOrderPayloadDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EquityOrderPayload> getProtoAdapter() {
            return EquityOrderPayload.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquityOrderPayloadDto getZeroValue() {
            return EquityOrderPayloadDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquityOrderPayloadDto fromProto(EquityOrderPayload proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String ref_id = proto.getRef_id();
            String account = proto.getAccount();
            String instrument = proto.getInstrument();
            String symbol = proto.getSymbol();
            String quantity = proto.getQuantity();
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getSide());
            String price = proto.getPrice();
            String stop_price = proto.getStop_price();
            OrderTypeDto orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(proto.getType());
            TriggerDto triggerDtoFromProto = TriggerDto.INSTANCE.fromProto(proto.getTrigger());
            TimeInForceDto timeInForceDtoFromProto = TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force());
            boolean extended_hours = proto.getExtended_hours();
            Money dollar_based_amount = proto.getDollar_based_amount();
            MoneyDto moneyDtoFromProto = dollar_based_amount != null ? MoneyDto.INSTANCE.fromProto(dollar_based_amount) : null;
            TrailingPeg trailing_peg = proto.getTrailing_peg();
            TrailingPegDto trailingPegDtoFromProto = trailing_peg != null ? TrailingPegDto.INSTANCE.fromProto(trailing_peg) : null;
            boolean override_day_trade_checks = proto.getOverride_day_trade_checks();
            boolean override_dtbp_checks = proto.getOverride_dtbp_checks();
            boolean is_ipo_access_order = proto.getIs_ipo_access_order();
            String ipo_access_lower_collared_price = proto.getIpo_access_lower_collared_price();
            String ipo_access_lower_price = proto.getIpo_access_lower_price();
            String ipo_access_upper_collared_price = proto.getIpo_access_upper_collared_price();
            String ipo_access_upper_price = proto.getIpo_access_upper_price();
            boolean has_ipo_access_custom_price_limit = proto.getHas_ipo_access_custom_price_limit();
            java.util.List<String> check_overrides = proto.getCheck_overrides();
            MoneyDto moneyDto = moneyDtoFromProto;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(check_overrides, 10));
            Iterator<T> it = check_overrides.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            String preset_percent_limit = proto.getPreset_percent_limit();
            int order_form_version = proto.getOrder_form_version();
            MarketHoursDto marketHoursDtoFromProto = MarketHoursDto.INSTANCE.fromProto(proto.getMarket_hours());
            IdlDecimal idlDecimal = new IdlDecimal(proto.getBid_price());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getAsk_price());
            Instant bid_ask_timestamp = proto.getBid_ask_timestamp();
            DisposalMethodDto disposalMethodDtoFromProto = DisposalMethodDto.INSTANCE.fromProto(proto.getTax_lot_selection_type());
            java.util.List<com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelection> tax_lots = proto.getTax_lots();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lots, 10));
            Iterator<T> it2 = tax_lots.iterator();
            while (it2.hasNext()) {
                arrayList2.add(com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelectionDto.INSTANCE.fromProto((com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelection) it2.next()));
            }
            java.util.List<TaxLotSelection> tax_lots_v2 = proto.getTax_lots_v2();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lots_v2, 10));
            Iterator<T> it3 = tax_lots_v2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(TaxLotSelectionDto.INSTANCE.fromProto((TaxLotSelection) it3.next()));
                arrayList2 = arrayList2;
            }
            return new EquityOrderPayloadDto(new Surrogate(ref_id, account, instrument, symbol, quantity, sideDtoFromProto, price, stop_price, orderTypeDtoFromProto, triggerDtoFromProto, timeInForceDtoFromProto, extended_hours, moneyDto, trailingPegDtoFromProto, override_day_trade_checks, override_dtbp_checks, is_ipo_access_order, ipo_access_lower_collared_price, ipo_access_lower_price, ipo_access_upper_collared_price, ipo_access_upper_price, has_ipo_access_custom_price_limit, arrayList, preset_percent_limit, order_form_version, marketHoursDtoFromProto, idlDecimal, idlDecimal2, bid_ask_timestamp, disposalMethodDtoFromProto, arrayList2, arrayList3, proto.getEstimated_total_fee(), PositionEffectDto.INSTANCE.fromProto(proto.getPosition_effect()), OrderEntryPointDto.INSTANCE.fromProto(proto.getOrder_entry_point()), OrderInputFormatDto.INSTANCE.fromProto(proto.getOrder_input_format())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EquityOrderPayloadDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityOrderPayloadDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new EquityOrderPayloadDto(null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, -1, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EquityOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<EquityOrderPayloadDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.EquityOrderPayload", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EquityOrderPayloadDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EquityOrderPayloadDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EquityOrderPayloadDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EquityOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.EquityOrderPayloadDto";
        }
    }
}

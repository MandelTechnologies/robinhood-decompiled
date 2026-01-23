package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
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
import rosetta.account.BrokerageAccountType;
import rosetta.option.MarketabilityType;
import rosetta.order.DefaultPriceSetting;
import rosetta.order.State;

/* compiled from: OptionOrderMeta.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 ^2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002^_B·\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020\u0004\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020\u0004\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010+\u001a\u00020,¢\u0006\u0004\b-\u0010.J\b\u0010V\u001a\u00020\u0002H\u0017J\u0013\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0096\u0002J\b\u0010[\u001a\u00020\u000fH\u0016J\b\u0010\\\u001a\u00020\u0004H\u0016J¶\u0002\u0010]\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010+\u001a\u00020,R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00100R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u00108R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00100R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00100R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00100R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00100R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0016\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010BR\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00100R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0016\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00100R\u0016\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00100R\u0016\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00100R\u0016\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00100R\u0016\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00100R\u0016\u0010#\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0016\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00100R\u0016\u0010&\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0016\u0010(\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00100R\u0018\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010U¨\u0006`"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta;", "Lcom/squareup/wire/Message;", "", BidAskDetails3.BID_PRICE, "", BidAskDetails3.ASK_PRICE, "entered_price", "source", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "chain_symbol", "existing_order_id", "has_position", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "is_watching", "num_legs", "", "adjusted_mark_price", "adjusted_mark_price_round_down", "adjusted_mark_price_min_tick", "adjusted_mark_price_round_down_min_tick", "marketability", "Lrosetta/option/MarketabilityType;", "prev_order_state", "Lrosetta/order/State;", "current_order_state", "default_price_setting", "Lrosetta/order/DefaultPriceSetting;", "marketability_request_id", "order_check_data", "Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckData;", "strategy_code", "tmp_round_experiment_no_round_price", "tmp_round_experiment_mark_round_price", "tmp_round_experiment_min_tick_round_price", "tmp_round_experiment_mark_and_min_tick_round_price", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/account/BrokerageAccountType;", "previous_quantity", "option_order_type", "Lcom/robinhood/rosetta/eventlogging/OptionsOrderType;", "chain_type", "related_order_data", "Lcom/robinhood/rosetta/eventlogging/OptionRelatedOrderData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/Boolean;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/option/MarketabilityType;Lrosetta/order/State;Lrosetta/order/State;Lrosetta/order/DefaultPriceSetting;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/account/BrokerageAccountType;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionsOrderType;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/OptionRelatedOrderData;Lokio/ByteString;)V", "getBid_price", "()Ljava/lang/String;", "getAsk_price", "getEntered_price", "getSource", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "getChain_symbol", "getExisting_order_id", "getHas_position", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getNum_legs", "()I", "getAdjusted_mark_price", "getAdjusted_mark_price_round_down", "getAdjusted_mark_price_min_tick", "getAdjusted_mark_price_round_down_min_tick", "getMarketability", "()Lrosetta/option/MarketabilityType;", "getPrev_order_state", "()Lrosetta/order/State;", "getCurrent_order_state", "getDefault_price_setting", "()Lrosetta/order/DefaultPriceSetting;", "getMarketability_request_id", "getOrder_check_data", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderCheckData;", "getStrategy_code", "getTmp_round_experiment_no_round_price", "getTmp_round_experiment_mark_round_price", "getTmp_round_experiment_min_tick_round_price", "getTmp_round_experiment_mark_and_min_tick_round_price", "getAccount_type", "()Lrosetta/account/BrokerageAccountType;", "getPrevious_quantity", "getOption_order_type", "()Lcom/robinhood/rosetta/eventlogging/OptionsOrderType;", "getChain_type", "getRelated_order_data", "()Lcom/robinhood/rosetta/eventlogging/OptionRelatedOrderData;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "Source", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OptionOrderMeta extends Message {

    @JvmField
    public static final ProtoAdapter<OptionOrderMeta> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 104)
    private final BrokerageAccountType account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "adjustedMarkPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String adjusted_mark_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "adjustedMarkPriceMinTick", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String adjusted_mark_price_min_tick;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "adjustedMarkPriceRoundDown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String adjusted_mark_price_round_down;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "adjustedMarkPriceRoundDownMinTick", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String adjusted_mark_price_round_down_min_tick;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String ask_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String bid_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chainSymbol", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String chain_symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chainType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 107)
    private final String chain_type;

    @WireField(adapter = "rosetta.order.State#ADAPTER", jsonName = "currentOrderState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final State current_order_state;

    @WireField(adapter = "rosetta.order.DefaultPriceSetting#ADAPTER", jsonName = "defaultPriceSetting", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final DefaultPriceSetting default_price_setting;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "enteredPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String entered_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "existingOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String existing_order_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "hasPosition", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Boolean has_position;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "isWatching", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Boolean is_watching;

    @WireField(adapter = "rosetta.option.MarketabilityType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final MarketabilityType marketability;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "marketabilityRequestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final String marketability_request_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "numLegs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final int num_legs;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionsOrderType#ADAPTER", jsonName = "optionOrderType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 106)
    private final OptionsOrderType option_order_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionOrderCheckData#ADAPTER", jsonName = "orderCheckData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final OptionOrderCheckData order_check_data;

    @WireField(adapter = "rosetta.order.State#ADAPTER", jsonName = "prevOrderState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final State prev_order_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previousQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 105)
    private final String previous_quantity;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionRelatedOrderData#ADAPTER", jsonName = "relatedOrderData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 108)
    private final OptionRelatedOrderData related_order_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionOrderMeta$Source#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Source source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "strategyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final String strategy_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tmpRoundExperimentMarkAndMinTickRoundPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 103)
    private final String tmp_round_experiment_mark_and_min_tick_round_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tmpRoundExperimentMarkRoundPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 101)
    private final String tmp_round_experiment_mark_round_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tmpRoundExperimentMinTickRoundPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 102)
    private final String tmp_round_experiment_min_tick_round_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tmpRoundExperimentNoRoundPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 100)
    private final String tmp_round_experiment_no_round_price;

    public OptionOrderMeta() {
        this(null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
    }

    public /* synthetic */ OptionOrderMeta(String str, String str2, String str3, Source source, String str4, String str5, Boolean r37, Boolean r38, int i, String str6, String str7, String str8, String str9, MarketabilityType marketabilityType, State state, State state2, DefaultPriceSetting defaultPriceSetting, String str10, OptionOrderCheckData optionOrderCheckData, String str11, String str12, String str13, String str14, String str15, BrokerageAccountType brokerageAccountType, String str16, OptionsOrderType optionsOrderType, String str17, OptionRelatedOrderData optionRelatedOrderData, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? Source.SOURCE_UNSPECIFIED : source, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r37, (i2 & 128) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r38, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) != 0 ? "" : str7, (i2 & 2048) != 0 ? "" : str8, (i2 & 4096) != 0 ? "" : str9, (i2 & 8192) != 0 ? MarketabilityType.MARKETABILITY_UNSPECIFIED : marketabilityType, (i2 & 16384) != 0 ? State.STATE_UNSPECIFIED : state, (i2 & 32768) != 0 ? State.STATE_UNSPECIFIED : state2, (i2 & 65536) != 0 ? DefaultPriceSetting.PRICE_SETTING_UNSPECIFIED : defaultPriceSetting, (i2 & 131072) != 0 ? "" : str10, (i2 & 262144) != 0 ? null : optionOrderCheckData, (i2 & 524288) != 0 ? "" : str11, (i2 & 1048576) != 0 ? "" : str12, (i2 & 2097152) != 0 ? "" : str13, (i2 & 4194304) != 0 ? "" : str14, (i2 & 8388608) != 0 ? "" : str15, (i2 & 16777216) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i2 & 33554432) != 0 ? "" : str16, (i2 & 67108864) != 0 ? OptionsOrderType.OPTIONS_ORDER_TYPE_UNSPECIFIED : optionsOrderType, (i2 & 134217728) == 0 ? str17 : "", (i2 & 268435456) == 0 ? optionRelatedOrderData : null, (i2 & 536870912) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24432newBuilder();
    }

    public final String getBid_price() {
        return this.bid_price;
    }

    public final String getAsk_price() {
        return this.ask_price;
    }

    public final String getEntered_price() {
        return this.entered_price;
    }

    public final Source getSource() {
        return this.source;
    }

    public final String getChain_symbol() {
        return this.chain_symbol;
    }

    public final String getExisting_order_id() {
        return this.existing_order_id;
    }

    public final Boolean getHas_position() {
        return this.has_position;
    }

    /* renamed from: is_watching, reason: from getter */
    public final Boolean getIs_watching() {
        return this.is_watching;
    }

    public final int getNum_legs() {
        return this.num_legs;
    }

    public final String getAdjusted_mark_price() {
        return this.adjusted_mark_price;
    }

    public final String getAdjusted_mark_price_round_down() {
        return this.adjusted_mark_price_round_down;
    }

    public final String getAdjusted_mark_price_min_tick() {
        return this.adjusted_mark_price_min_tick;
    }

    public final String getAdjusted_mark_price_round_down_min_tick() {
        return this.adjusted_mark_price_round_down_min_tick;
    }

    public final MarketabilityType getMarketability() {
        return this.marketability;
    }

    public final State getPrev_order_state() {
        return this.prev_order_state;
    }

    public final State getCurrent_order_state() {
        return this.current_order_state;
    }

    public final DefaultPriceSetting getDefault_price_setting() {
        return this.default_price_setting;
    }

    public final String getMarketability_request_id() {
        return this.marketability_request_id;
    }

    public final OptionOrderCheckData getOrder_check_data() {
        return this.order_check_data;
    }

    public final String getStrategy_code() {
        return this.strategy_code;
    }

    public final String getTmp_round_experiment_no_round_price() {
        return this.tmp_round_experiment_no_round_price;
    }

    public final String getTmp_round_experiment_mark_round_price() {
        return this.tmp_round_experiment_mark_round_price;
    }

    public final String getTmp_round_experiment_min_tick_round_price() {
        return this.tmp_round_experiment_min_tick_round_price;
    }

    public final String getTmp_round_experiment_mark_and_min_tick_round_price() {
        return this.tmp_round_experiment_mark_and_min_tick_round_price;
    }

    public final BrokerageAccountType getAccount_type() {
        return this.account_type;
    }

    public final String getPrevious_quantity() {
        return this.previous_quantity;
    }

    public final OptionsOrderType getOption_order_type() {
        return this.option_order_type;
    }

    public final String getChain_type() {
        return this.chain_type;
    }

    public final OptionRelatedOrderData getRelated_order_data() {
        return this.related_order_data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderMeta(String bid_price, String ask_price, String entered_price, Source source, String chain_symbol, String existing_order_id, Boolean has_position, Boolean is_watching, int i, String adjusted_mark_price, String adjusted_mark_price_round_down, String adjusted_mark_price_min_tick, String adjusted_mark_price_round_down_min_tick, MarketabilityType marketability, State prev_order_state, State current_order_state, DefaultPriceSetting default_price_setting, String marketability_request_id, OptionOrderCheckData optionOrderCheckData, String strategy_code, String tmp_round_experiment_no_round_price, String tmp_round_experiment_mark_round_price, String tmp_round_experiment_min_tick_round_price, String tmp_round_experiment_mark_and_min_tick_round_price, BrokerageAccountType account_type, String previous_quantity, OptionsOrderType option_order_type, String chain_type, OptionRelatedOrderData optionRelatedOrderData, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(entered_price, "entered_price");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
        Intrinsics.checkNotNullParameter(existing_order_id, "existing_order_id");
        Intrinsics.checkNotNullParameter(has_position, "has_position");
        Intrinsics.checkNotNullParameter(is_watching, "is_watching");
        Intrinsics.checkNotNullParameter(adjusted_mark_price, "adjusted_mark_price");
        Intrinsics.checkNotNullParameter(adjusted_mark_price_round_down, "adjusted_mark_price_round_down");
        Intrinsics.checkNotNullParameter(adjusted_mark_price_min_tick, "adjusted_mark_price_min_tick");
        Intrinsics.checkNotNullParameter(adjusted_mark_price_round_down_min_tick, "adjusted_mark_price_round_down_min_tick");
        Intrinsics.checkNotNullParameter(marketability, "marketability");
        Intrinsics.checkNotNullParameter(prev_order_state, "prev_order_state");
        Intrinsics.checkNotNullParameter(current_order_state, "current_order_state");
        Intrinsics.checkNotNullParameter(default_price_setting, "default_price_setting");
        Intrinsics.checkNotNullParameter(marketability_request_id, "marketability_request_id");
        Intrinsics.checkNotNullParameter(strategy_code, "strategy_code");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_no_round_price, "tmp_round_experiment_no_round_price");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_mark_round_price, "tmp_round_experiment_mark_round_price");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_min_tick_round_price, "tmp_round_experiment_min_tick_round_price");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_mark_and_min_tick_round_price, "tmp_round_experiment_mark_and_min_tick_round_price");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(previous_quantity, "previous_quantity");
        Intrinsics.checkNotNullParameter(option_order_type, "option_order_type");
        Intrinsics.checkNotNullParameter(chain_type, "chain_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.bid_price = bid_price;
        this.ask_price = ask_price;
        this.entered_price = entered_price;
        this.source = source;
        this.chain_symbol = chain_symbol;
        this.existing_order_id = existing_order_id;
        this.has_position = has_position;
        this.is_watching = is_watching;
        this.num_legs = i;
        this.adjusted_mark_price = adjusted_mark_price;
        this.adjusted_mark_price_round_down = adjusted_mark_price_round_down;
        this.adjusted_mark_price_min_tick = adjusted_mark_price_min_tick;
        this.adjusted_mark_price_round_down_min_tick = adjusted_mark_price_round_down_min_tick;
        this.marketability = marketability;
        this.prev_order_state = prev_order_state;
        this.current_order_state = current_order_state;
        this.default_price_setting = default_price_setting;
        this.marketability_request_id = marketability_request_id;
        this.order_check_data = optionOrderCheckData;
        this.strategy_code = strategy_code;
        this.tmp_round_experiment_no_round_price = tmp_round_experiment_no_round_price;
        this.tmp_round_experiment_mark_round_price = tmp_round_experiment_mark_round_price;
        this.tmp_round_experiment_min_tick_round_price = tmp_round_experiment_min_tick_round_price;
        this.tmp_round_experiment_mark_and_min_tick_round_price = tmp_round_experiment_mark_and_min_tick_round_price;
        this.account_type = account_type;
        this.previous_quantity = previous_quantity;
        this.option_order_type = option_order_type;
        this.chain_type = chain_type;
        this.related_order_data = optionRelatedOrderData;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24432newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionOrderMeta)) {
            return false;
        }
        OptionOrderMeta optionOrderMeta = (OptionOrderMeta) other;
        return Intrinsics.areEqual(unknownFields(), optionOrderMeta.unknownFields()) && Intrinsics.areEqual(this.bid_price, optionOrderMeta.bid_price) && Intrinsics.areEqual(this.ask_price, optionOrderMeta.ask_price) && Intrinsics.areEqual(this.entered_price, optionOrderMeta.entered_price) && this.source == optionOrderMeta.source && Intrinsics.areEqual(this.chain_symbol, optionOrderMeta.chain_symbol) && Intrinsics.areEqual(this.existing_order_id, optionOrderMeta.existing_order_id) && this.has_position == optionOrderMeta.has_position && this.is_watching == optionOrderMeta.is_watching && this.num_legs == optionOrderMeta.num_legs && Intrinsics.areEqual(this.adjusted_mark_price, optionOrderMeta.adjusted_mark_price) && Intrinsics.areEqual(this.adjusted_mark_price_round_down, optionOrderMeta.adjusted_mark_price_round_down) && Intrinsics.areEqual(this.adjusted_mark_price_min_tick, optionOrderMeta.adjusted_mark_price_min_tick) && Intrinsics.areEqual(this.adjusted_mark_price_round_down_min_tick, optionOrderMeta.adjusted_mark_price_round_down_min_tick) && this.marketability == optionOrderMeta.marketability && this.prev_order_state == optionOrderMeta.prev_order_state && this.current_order_state == optionOrderMeta.current_order_state && this.default_price_setting == optionOrderMeta.default_price_setting && Intrinsics.areEqual(this.marketability_request_id, optionOrderMeta.marketability_request_id) && Intrinsics.areEqual(this.order_check_data, optionOrderMeta.order_check_data) && Intrinsics.areEqual(this.strategy_code, optionOrderMeta.strategy_code) && Intrinsics.areEqual(this.tmp_round_experiment_no_round_price, optionOrderMeta.tmp_round_experiment_no_round_price) && Intrinsics.areEqual(this.tmp_round_experiment_mark_round_price, optionOrderMeta.tmp_round_experiment_mark_round_price) && Intrinsics.areEqual(this.tmp_round_experiment_min_tick_round_price, optionOrderMeta.tmp_round_experiment_min_tick_round_price) && Intrinsics.areEqual(this.tmp_round_experiment_mark_and_min_tick_round_price, optionOrderMeta.tmp_round_experiment_mark_and_min_tick_round_price) && this.account_type == optionOrderMeta.account_type && Intrinsics.areEqual(this.previous_quantity, optionOrderMeta.previous_quantity) && this.option_order_type == optionOrderMeta.option_order_type && Intrinsics.areEqual(this.chain_type, optionOrderMeta.chain_type) && Intrinsics.areEqual(this.related_order_data, optionOrderMeta.related_order_data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.bid_price.hashCode()) * 37) + this.ask_price.hashCode()) * 37) + this.entered_price.hashCode()) * 37) + this.source.hashCode()) * 37) + this.chain_symbol.hashCode()) * 37) + this.existing_order_id.hashCode()) * 37) + this.has_position.hashCode()) * 37) + this.is_watching.hashCode()) * 37) + Integer.hashCode(this.num_legs)) * 37) + this.adjusted_mark_price.hashCode()) * 37) + this.adjusted_mark_price_round_down.hashCode()) * 37) + this.adjusted_mark_price_min_tick.hashCode()) * 37) + this.adjusted_mark_price_round_down_min_tick.hashCode()) * 37) + this.marketability.hashCode()) * 37) + this.prev_order_state.hashCode()) * 37) + this.current_order_state.hashCode()) * 37) + this.default_price_setting.hashCode()) * 37) + this.marketability_request_id.hashCode()) * 37;
        OptionOrderCheckData optionOrderCheckData = this.order_check_data;
        int iHashCode2 = (((((((((((((((((((iHashCode + (optionOrderCheckData != null ? optionOrderCheckData.hashCode() : 0)) * 37) + this.strategy_code.hashCode()) * 37) + this.tmp_round_experiment_no_round_price.hashCode()) * 37) + this.tmp_round_experiment_mark_round_price.hashCode()) * 37) + this.tmp_round_experiment_min_tick_round_price.hashCode()) * 37) + this.tmp_round_experiment_mark_and_min_tick_round_price.hashCode()) * 37) + this.account_type.hashCode()) * 37) + this.previous_quantity.hashCode()) * 37) + this.option_order_type.hashCode()) * 37) + this.chain_type.hashCode()) * 37;
        OptionRelatedOrderData optionRelatedOrderData = this.related_order_data;
        int iHashCode3 = iHashCode2 + (optionRelatedOrderData != null ? optionRelatedOrderData.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("bid_price=" + Internal.sanitize(this.bid_price));
        arrayList.add("ask_price=" + Internal.sanitize(this.ask_price));
        arrayList.add("entered_price=" + Internal.sanitize(this.entered_price));
        arrayList.add("source=" + this.source);
        arrayList.add("chain_symbol=" + Internal.sanitize(this.chain_symbol));
        arrayList.add("existing_order_id=" + Internal.sanitize(this.existing_order_id));
        arrayList.add("has_position=" + this.has_position);
        arrayList.add("is_watching=" + this.is_watching);
        arrayList.add("num_legs=" + this.num_legs);
        arrayList.add("adjusted_mark_price=" + Internal.sanitize(this.adjusted_mark_price));
        arrayList.add("adjusted_mark_price_round_down=" + Internal.sanitize(this.adjusted_mark_price_round_down));
        arrayList.add("adjusted_mark_price_min_tick=" + Internal.sanitize(this.adjusted_mark_price_min_tick));
        arrayList.add("adjusted_mark_price_round_down_min_tick=" + Internal.sanitize(this.adjusted_mark_price_round_down_min_tick));
        arrayList.add("marketability=" + this.marketability);
        arrayList.add("prev_order_state=" + this.prev_order_state);
        arrayList.add("current_order_state=" + this.current_order_state);
        arrayList.add("default_price_setting=" + this.default_price_setting);
        arrayList.add("marketability_request_id=" + Internal.sanitize(this.marketability_request_id));
        OptionOrderCheckData optionOrderCheckData = this.order_check_data;
        if (optionOrderCheckData != null) {
            arrayList.add("order_check_data=" + optionOrderCheckData);
        }
        arrayList.add("strategy_code=" + Internal.sanitize(this.strategy_code));
        arrayList.add("tmp_round_experiment_no_round_price=" + Internal.sanitize(this.tmp_round_experiment_no_round_price));
        arrayList.add("tmp_round_experiment_mark_round_price=" + Internal.sanitize(this.tmp_round_experiment_mark_round_price));
        arrayList.add("tmp_round_experiment_min_tick_round_price=" + Internal.sanitize(this.tmp_round_experiment_min_tick_round_price));
        arrayList.add("tmp_round_experiment_mark_and_min_tick_round_price=" + Internal.sanitize(this.tmp_round_experiment_mark_and_min_tick_round_price));
        arrayList.add("account_type=" + this.account_type);
        arrayList.add("previous_quantity=" + Internal.sanitize(this.previous_quantity));
        arrayList.add("option_order_type=" + this.option_order_type);
        arrayList.add("chain_type=" + Internal.sanitize(this.chain_type));
        OptionRelatedOrderData optionRelatedOrderData = this.related_order_data;
        if (optionRelatedOrderData != null) {
            arrayList.add("related_order_data=" + optionRelatedOrderData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionOrderMeta{", "}", 0, null, null, 56, null);
    }

    public final OptionOrderMeta copy(String bid_price, String ask_price, String entered_price, Source source, String chain_symbol, String existing_order_id, Boolean has_position, Boolean is_watching, int num_legs, String adjusted_mark_price, String adjusted_mark_price_round_down, String adjusted_mark_price_min_tick, String adjusted_mark_price_round_down_min_tick, MarketabilityType marketability, State prev_order_state, State current_order_state, DefaultPriceSetting default_price_setting, String marketability_request_id, OptionOrderCheckData order_check_data, String strategy_code, String tmp_round_experiment_no_round_price, String tmp_round_experiment_mark_round_price, String tmp_round_experiment_min_tick_round_price, String tmp_round_experiment_mark_and_min_tick_round_price, BrokerageAccountType account_type, String previous_quantity, OptionsOrderType option_order_type, String chain_type, OptionRelatedOrderData related_order_data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(entered_price, "entered_price");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
        Intrinsics.checkNotNullParameter(existing_order_id, "existing_order_id");
        Intrinsics.checkNotNullParameter(has_position, "has_position");
        Intrinsics.checkNotNullParameter(is_watching, "is_watching");
        Intrinsics.checkNotNullParameter(adjusted_mark_price, "adjusted_mark_price");
        Intrinsics.checkNotNullParameter(adjusted_mark_price_round_down, "adjusted_mark_price_round_down");
        Intrinsics.checkNotNullParameter(adjusted_mark_price_min_tick, "adjusted_mark_price_min_tick");
        Intrinsics.checkNotNullParameter(adjusted_mark_price_round_down_min_tick, "adjusted_mark_price_round_down_min_tick");
        Intrinsics.checkNotNullParameter(marketability, "marketability");
        Intrinsics.checkNotNullParameter(prev_order_state, "prev_order_state");
        Intrinsics.checkNotNullParameter(current_order_state, "current_order_state");
        Intrinsics.checkNotNullParameter(default_price_setting, "default_price_setting");
        Intrinsics.checkNotNullParameter(marketability_request_id, "marketability_request_id");
        Intrinsics.checkNotNullParameter(strategy_code, "strategy_code");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_no_round_price, "tmp_round_experiment_no_round_price");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_mark_round_price, "tmp_round_experiment_mark_round_price");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_min_tick_round_price, "tmp_round_experiment_min_tick_round_price");
        Intrinsics.checkNotNullParameter(tmp_round_experiment_mark_and_min_tick_round_price, "tmp_round_experiment_mark_and_min_tick_round_price");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(previous_quantity, "previous_quantity");
        Intrinsics.checkNotNullParameter(option_order_type, "option_order_type");
        Intrinsics.checkNotNullParameter(chain_type, "chain_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionOrderMeta(bid_price, ask_price, entered_price, source, chain_symbol, existing_order_id, has_position, is_watching, num_legs, adjusted_mark_price, adjusted_mark_price_round_down, adjusted_mark_price_min_tick, adjusted_mark_price_round_down_min_tick, marketability, prev_order_state, current_order_state, default_price_setting, marketability_request_id, order_check_data, strategy_code, tmp_round_experiment_no_round_price, tmp_round_experiment_mark_round_price, tmp_round_experiment_min_tick_round_price, tmp_round_experiment_mark_and_min_tick_round_price, account_type, previous_quantity, option_order_type, chain_type, related_order_data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionOrderMeta.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionOrderMeta>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionOrderMeta$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionOrderMeta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAsk_price());
                }
                if (!Intrinsics.areEqual(value.getEntered_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getEntered_price());
                }
                if (value.getSource() != OptionOrderMeta.Source.SOURCE_UNSPECIFIED) {
                    size += OptionOrderMeta.Source.ADAPTER.encodedSizeWithTag(4, value.getSource());
                }
                if (!Intrinsics.areEqual(value.getChain_symbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getChain_symbol());
                }
                if (!Intrinsics.areEqual(value.getExisting_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getExisting_order_id());
                }
                Boolean has_position = value.getHas_position();
                Boolean r3 = Boolean.BOOLEAN_UNSPECIFIED;
                if (has_position != r3) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(7, value.getHas_position());
                }
                if (value.getIs_watching() != r3) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(8, value.getIs_watching());
                }
                if (value.getNum_legs() != 0) {
                    size += ProtoAdapter.UINT32.encodedSizeWithTag(9, Integer.valueOf(value.getNum_legs()));
                }
                if (!Intrinsics.areEqual(value.getAdjusted_mark_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getAdjusted_mark_price());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_mark_price_round_down(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getAdjusted_mark_price_round_down());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_mark_price_min_tick(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getAdjusted_mark_price_min_tick());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_mark_price_round_down_min_tick(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getAdjusted_mark_price_round_down_min_tick());
                }
                if (value.getMarketability() != MarketabilityType.MARKETABILITY_UNSPECIFIED) {
                    size += MarketabilityType.ADAPTER.encodedSizeWithTag(14, value.getMarketability());
                }
                State prev_order_state = value.getPrev_order_state();
                State state = State.STATE_UNSPECIFIED;
                if (prev_order_state != state) {
                    size += State.ADAPTER.encodedSizeWithTag(15, value.getPrev_order_state());
                }
                if (value.getCurrent_order_state() != state) {
                    size += State.ADAPTER.encodedSizeWithTag(16, value.getCurrent_order_state());
                }
                if (value.getDefault_price_setting() != DefaultPriceSetting.PRICE_SETTING_UNSPECIFIED) {
                    size += DefaultPriceSetting.ADAPTER.encodedSizeWithTag(17, value.getDefault_price_setting());
                }
                if (!Intrinsics.areEqual(value.getMarketability_request_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getMarketability_request_id());
                }
                if (value.getOrder_check_data() != null) {
                    size += OptionOrderCheckData.ADAPTER.encodedSizeWithTag(19, value.getOrder_check_data());
                }
                if (!Intrinsics.areEqual(value.getStrategy_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(20, value.getStrategy_code());
                }
                if (!Intrinsics.areEqual(value.getTmp_round_experiment_no_round_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(100, value.getTmp_round_experiment_no_round_price());
                }
                if (!Intrinsics.areEqual(value.getTmp_round_experiment_mark_round_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(101, value.getTmp_round_experiment_mark_round_price());
                }
                if (!Intrinsics.areEqual(value.getTmp_round_experiment_min_tick_round_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(102, value.getTmp_round_experiment_min_tick_round_price());
                }
                if (!Intrinsics.areEqual(value.getTmp_round_experiment_mark_and_min_tick_round_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(103, value.getTmp_round_experiment_mark_and_min_tick_round_price());
                }
                if (value.getAccount_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    size += BrokerageAccountType.ADAPTER.encodedSizeWithTag(104, value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getPrevious_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(105, value.getPrevious_quantity());
                }
                if (value.getOption_order_type() != OptionsOrderType.OPTIONS_ORDER_TYPE_UNSPECIFIED) {
                    size += OptionsOrderType.ADAPTER.encodedSizeWithTag(106, value.getOption_order_type());
                }
                if (!Intrinsics.areEqual(value.getChain_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(107, value.getChain_type());
                }
                return value.getRelated_order_data() != null ? size + OptionRelatedOrderData.ADAPTER.encodedSizeWithTag(108, value.getRelated_order_data()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionOrderMeta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsk_price());
                }
                if (!Intrinsics.areEqual(value.getEntered_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEntered_price());
                }
                if (value.getSource() != OptionOrderMeta.Source.SOURCE_UNSPECIFIED) {
                    OptionOrderMeta.Source.ADAPTER.encodeWithTag(writer, 4, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getChain_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getChain_symbol());
                }
                if (!Intrinsics.areEqual(value.getExisting_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getExisting_order_id());
                }
                Boolean has_position = value.getHas_position();
                Boolean r2 = Boolean.BOOLEAN_UNSPECIFIED;
                if (has_position != r2) {
                    Boolean.ADAPTER.encodeWithTag(writer, 7, (int) value.getHas_position());
                }
                if (value.getIs_watching() != r2) {
                    Boolean.ADAPTER.encodeWithTag(writer, 8, (int) value.getIs_watching());
                }
                if (value.getNum_legs() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getNum_legs()));
                }
                if (!Intrinsics.areEqual(value.getAdjusted_mark_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getAdjusted_mark_price());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_mark_price_round_down(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getAdjusted_mark_price_round_down());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_mark_price_min_tick(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getAdjusted_mark_price_min_tick());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_mark_price_round_down_min_tick(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getAdjusted_mark_price_round_down_min_tick());
                }
                if (value.getMarketability() != MarketabilityType.MARKETABILITY_UNSPECIFIED) {
                    MarketabilityType.ADAPTER.encodeWithTag(writer, 14, (int) value.getMarketability());
                }
                State prev_order_state = value.getPrev_order_state();
                State state = State.STATE_UNSPECIFIED;
                if (prev_order_state != state) {
                    State.ADAPTER.encodeWithTag(writer, 15, (int) value.getPrev_order_state());
                }
                if (value.getCurrent_order_state() != state) {
                    State.ADAPTER.encodeWithTag(writer, 16, (int) value.getCurrent_order_state());
                }
                if (value.getDefault_price_setting() != DefaultPriceSetting.PRICE_SETTING_UNSPECIFIED) {
                    DefaultPriceSetting.ADAPTER.encodeWithTag(writer, 17, (int) value.getDefault_price_setting());
                }
                if (!Intrinsics.areEqual(value.getMarketability_request_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getMarketability_request_id());
                }
                if (value.getOrder_check_data() != null) {
                    OptionOrderCheckData.ADAPTER.encodeWithTag(writer, 19, (int) value.getOrder_check_data());
                }
                if (!Intrinsics.areEqual(value.getStrategy_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getStrategy_code());
                }
                if (!Intrinsics.areEqual(value.getTmp_round_experiment_no_round_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 100, (int) value.getTmp_round_experiment_no_round_price());
                }
                if (!Intrinsics.areEqual(value.getTmp_round_experiment_mark_round_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 101, (int) value.getTmp_round_experiment_mark_round_price());
                }
                if (!Intrinsics.areEqual(value.getTmp_round_experiment_min_tick_round_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 102, (int) value.getTmp_round_experiment_min_tick_round_price());
                }
                if (!Intrinsics.areEqual(value.getTmp_round_experiment_mark_and_min_tick_round_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 103, (int) value.getTmp_round_experiment_mark_and_min_tick_round_price());
                }
                if (value.getAccount_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 104, (int) value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getPrevious_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 105, (int) value.getPrevious_quantity());
                }
                if (value.getOption_order_type() != OptionsOrderType.OPTIONS_ORDER_TYPE_UNSPECIFIED) {
                    OptionsOrderType.ADAPTER.encodeWithTag(writer, 106, (int) value.getOption_order_type());
                }
                if (!Intrinsics.areEqual(value.getChain_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 107, (int) value.getChain_type());
                }
                if (value.getRelated_order_data() != null) {
                    OptionRelatedOrderData.ADAPTER.encodeWithTag(writer, 108, (int) value.getRelated_order_data());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionOrderMeta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRelated_order_data() != null) {
                    OptionRelatedOrderData.ADAPTER.encodeWithTag(writer, 108, (int) value.getRelated_order_data());
                }
                if (!Intrinsics.areEqual(value.getChain_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 107, (int) value.getChain_type());
                }
                if (value.getOption_order_type() != OptionsOrderType.OPTIONS_ORDER_TYPE_UNSPECIFIED) {
                    OptionsOrderType.ADAPTER.encodeWithTag(writer, 106, (int) value.getOption_order_type());
                }
                if (!Intrinsics.areEqual(value.getPrevious_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 105, (int) value.getPrevious_quantity());
                }
                if (value.getAccount_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 104, (int) value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getTmp_round_experiment_mark_and_min_tick_round_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 103, (int) value.getTmp_round_experiment_mark_and_min_tick_round_price());
                }
                if (!Intrinsics.areEqual(value.getTmp_round_experiment_min_tick_round_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 102, (int) value.getTmp_round_experiment_min_tick_round_price());
                }
                if (!Intrinsics.areEqual(value.getTmp_round_experiment_mark_round_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 101, (int) value.getTmp_round_experiment_mark_round_price());
                }
                if (!Intrinsics.areEqual(value.getTmp_round_experiment_no_round_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 100, (int) value.getTmp_round_experiment_no_round_price());
                }
                if (!Intrinsics.areEqual(value.getStrategy_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getStrategy_code());
                }
                if (value.getOrder_check_data() != null) {
                    OptionOrderCheckData.ADAPTER.encodeWithTag(writer, 19, (int) value.getOrder_check_data());
                }
                if (!Intrinsics.areEqual(value.getMarketability_request_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getMarketability_request_id());
                }
                if (value.getDefault_price_setting() != DefaultPriceSetting.PRICE_SETTING_UNSPECIFIED) {
                    DefaultPriceSetting.ADAPTER.encodeWithTag(writer, 17, (int) value.getDefault_price_setting());
                }
                State current_order_state = value.getCurrent_order_state();
                State state = State.STATE_UNSPECIFIED;
                if (current_order_state != state) {
                    State.ADAPTER.encodeWithTag(writer, 16, (int) value.getCurrent_order_state());
                }
                if (value.getPrev_order_state() != state) {
                    State.ADAPTER.encodeWithTag(writer, 15, (int) value.getPrev_order_state());
                }
                if (value.getMarketability() != MarketabilityType.MARKETABILITY_UNSPECIFIED) {
                    MarketabilityType.ADAPTER.encodeWithTag(writer, 14, (int) value.getMarketability());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_mark_price_round_down_min_tick(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getAdjusted_mark_price_round_down_min_tick());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_mark_price_min_tick(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getAdjusted_mark_price_min_tick());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_mark_price_round_down(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getAdjusted_mark_price_round_down());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_mark_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getAdjusted_mark_price());
                }
                if (value.getNum_legs() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getNum_legs()));
                }
                Boolean is_watching = value.getIs_watching();
                Boolean r2 = Boolean.BOOLEAN_UNSPECIFIED;
                if (is_watching != r2) {
                    Boolean.ADAPTER.encodeWithTag(writer, 8, (int) value.getIs_watching());
                }
                if (value.getHas_position() != r2) {
                    Boolean.ADAPTER.encodeWithTag(writer, 7, (int) value.getHas_position());
                }
                if (!Intrinsics.areEqual(value.getExisting_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getExisting_order_id());
                }
                if (!Intrinsics.areEqual(value.getChain_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getChain_symbol());
                }
                if (value.getSource() != OptionOrderMeta.Source.SOURCE_UNSPECIFIED) {
                    OptionOrderMeta.Source.ADAPTER.encodeWithTag(writer, 4, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getEntered_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEntered_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsk_price());
                }
                if (Intrinsics.areEqual(value.getBid_price(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBid_price());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderMeta decode(ProtoReader reader) throws IOException {
                Boolean r33;
                Boolean r34;
                MarketabilityType marketabilityType;
                Intrinsics.checkNotNullParameter(reader, "reader");
                OptionOrderMeta.Source source = OptionOrderMeta.Source.SOURCE_UNSPECIFIED;
                Boolean r2 = Boolean.BOOLEAN_UNSPECIFIED;
                MarketabilityType marketabilityType2 = MarketabilityType.MARKETABILITY_UNSPECIFIED;
                State state = State.STATE_UNSPECIFIED;
                DefaultPriceSetting defaultPriceSetting = DefaultPriceSetting.PRICE_SETTING_UNSPECIFIED;
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                OptionsOrderType optionsOrderType = OptionsOrderType.OPTIONS_ORDER_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                OptionOrderMeta.Source sourceDecode = source;
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
                int iIntValue = 0;
                OptionOrderCheckData optionOrderCheckDataDecode = null;
                OptionRelatedOrderData optionRelatedOrderDataDecode = null;
                DefaultPriceSetting defaultPriceSettingDecode = defaultPriceSetting;
                BrokerageAccountType brokerageAccountTypeDecode = brokerageAccountType;
                OptionsOrderType optionsOrderTypeDecode = optionsOrderType;
                MarketabilityType marketabilityTypeDecode = marketabilityType2;
                State stateDecode = state;
                State stateDecode2 = stateDecode;
                Boolean booleanDecode = r2;
                Boolean booleanDecode2 = booleanDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                r33 = booleanDecode;
                                r34 = booleanDecode2;
                                marketabilityType = marketabilityTypeDecode;
                                try {
                                    sourceDecode = OptionOrderMeta.Source.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                booleanDecode = r33;
                                booleanDecode2 = r34;
                                marketabilityTypeDecode = marketabilityType;
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                r33 = booleanDecode;
                                r34 = booleanDecode2;
                                marketabilityType = marketabilityTypeDecode;
                                try {
                                    booleanDecode = Boolean.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                booleanDecode2 = r34;
                                marketabilityTypeDecode = marketabilityType;
                                break;
                            case 8:
                                r33 = booleanDecode;
                                r34 = booleanDecode2;
                                marketabilityType = marketabilityTypeDecode;
                                try {
                                    booleanDecode2 = Boolean.ADAPTER.decode(reader);
                                    booleanDecode = r33;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                marketabilityTypeDecode = marketabilityType;
                                break;
                            case 9:
                                iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                                break;
                            case 10:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                r33 = booleanDecode;
                                r34 = booleanDecode2;
                                marketabilityType = marketabilityTypeDecode;
                                try {
                                    marketabilityTypeDecode = MarketabilityType.ADAPTER.decode(reader);
                                    booleanDecode = r33;
                                    booleanDecode2 = r34;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 15:
                                r33 = booleanDecode;
                                r34 = booleanDecode2;
                                marketabilityType = marketabilityTypeDecode;
                                try {
                                    stateDecode = State.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                }
                                booleanDecode = r33;
                                booleanDecode2 = r34;
                                marketabilityTypeDecode = marketabilityType;
                                break;
                            case 16:
                                r33 = booleanDecode;
                                r34 = booleanDecode2;
                                marketabilityType = marketabilityTypeDecode;
                                try {
                                    stateDecode2 = State.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                }
                                booleanDecode = r33;
                                booleanDecode2 = r34;
                                marketabilityTypeDecode = marketabilityType;
                                break;
                            case 17:
                                r33 = booleanDecode;
                                r34 = booleanDecode2;
                                marketabilityType = marketabilityTypeDecode;
                                try {
                                    defaultPriceSettingDecode = DefaultPriceSetting.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                                }
                                booleanDecode = r33;
                                booleanDecode2 = r34;
                                marketabilityTypeDecode = marketabilityType;
                                break;
                            case 18:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 19:
                                optionOrderCheckDataDecode = OptionOrderCheckData.ADAPTER.decode(reader);
                                break;
                            case 20:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                switch (iNextTag) {
                                    case 100:
                                        strDecode12 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 101:
                                        strDecode13 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 102:
                                        strDecode14 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 103:
                                        strDecode15 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 104:
                                        r33 = booleanDecode;
                                        r34 = booleanDecode2;
                                        marketabilityType = marketabilityTypeDecode;
                                        try {
                                            brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                                            break;
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                                            break;
                                        }
                                    case 105:
                                        strDecode16 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 106:
                                        try {
                                            optionsOrderTypeDecode = OptionsOrderType.ADAPTER.decode(reader);
                                            continue;
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                            r33 = booleanDecode;
                                            r34 = booleanDecode2;
                                            marketabilityType = marketabilityTypeDecode;
                                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e9.value));
                                            break;
                                        }
                                    case 107:
                                        strDecode17 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 108:
                                        optionRelatedOrderDataDecode = OptionRelatedOrderData.ADAPTER.decode(reader);
                                        continue;
                                    default:
                                        reader.readUnknownField(iNextTag);
                                        r33 = booleanDecode;
                                        r34 = booleanDecode2;
                                        marketabilityType = marketabilityTypeDecode;
                                        break;
                                }
                                booleanDecode = r33;
                                booleanDecode2 = r34;
                                marketabilityTypeDecode = marketabilityType;
                                break;
                        }
                    } else {
                        return new OptionOrderMeta(strDecode, strDecode2, strDecode3, sourceDecode, strDecode4, strDecode5, booleanDecode, booleanDecode2, iIntValue, strDecode6, strDecode7, strDecode8, strDecode9, marketabilityTypeDecode, stateDecode, stateDecode2, defaultPriceSettingDecode, strDecode10, optionOrderCheckDataDecode, strDecode11, strDecode12, strDecode13, strDecode14, strDecode15, brokerageAccountTypeDecode, strDecode16, optionsOrderTypeDecode, strDecode17, optionRelatedOrderDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderMeta redact(OptionOrderMeta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                OptionOrderCheckData order_check_data = value.getOrder_check_data();
                OptionOrderCheckData optionOrderCheckDataRedact = order_check_data != null ? OptionOrderCheckData.ADAPTER.redact(order_check_data) : null;
                OptionRelatedOrderData related_order_data = value.getRelated_order_data();
                return value.copy((268173311 & 1) != 0 ? value.bid_price : null, (268173311 & 2) != 0 ? value.ask_price : null, (268173311 & 4) != 0 ? value.entered_price : null, (268173311 & 8) != 0 ? value.source : null, (268173311 & 16) != 0 ? value.chain_symbol : null, (268173311 & 32) != 0 ? value.existing_order_id : null, (268173311 & 64) != 0 ? value.has_position : null, (268173311 & 128) != 0 ? value.is_watching : null, (268173311 & 256) != 0 ? value.num_legs : 0, (268173311 & 512) != 0 ? value.adjusted_mark_price : null, (268173311 & 1024) != 0 ? value.adjusted_mark_price_round_down : null, (268173311 & 2048) != 0 ? value.adjusted_mark_price_min_tick : null, (268173311 & 4096) != 0 ? value.adjusted_mark_price_round_down_min_tick : null, (268173311 & 8192) != 0 ? value.marketability : null, (268173311 & 16384) != 0 ? value.prev_order_state : null, (268173311 & 32768) != 0 ? value.current_order_state : null, (268173311 & 65536) != 0 ? value.default_price_setting : null, (268173311 & 131072) != 0 ? value.marketability_request_id : null, (268173311 & 262144) != 0 ? value.order_check_data : optionOrderCheckDataRedact, (268173311 & 524288) != 0 ? value.strategy_code : null, (268173311 & 1048576) != 0 ? value.tmp_round_experiment_no_round_price : null, (268173311 & 2097152) != 0 ? value.tmp_round_experiment_mark_round_price : null, (268173311 & 4194304) != 0 ? value.tmp_round_experiment_min_tick_round_price : null, (268173311 & 8388608) != 0 ? value.tmp_round_experiment_mark_and_min_tick_round_price : null, (268173311 & 16777216) != 0 ? value.account_type : null, (268173311 & 33554432) != 0 ? value.previous_quantity : null, (268173311 & 67108864) != 0 ? value.option_order_type : null, (268173311 & 134217728) != 0 ? value.chain_type : null, (268173311 & 268435456) != 0 ? value.related_order_data : related_order_data != null ? OptionRelatedOrderData.ADAPTER.redact(related_order_data) : null, (268173311 & 536870912) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionOrderMeta.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SOURCE_UNSPECIFIED", "SOURCE_OPTION_CHAIN", "SOURCE_INSTRUMENT_DETAIL", "SOURCE_AGGREGATE_POSITION", "SOURCE_STRATEGY_DETAIL", "SOURCE_ORDER_DETAIL", "SOURCE_ACTIVITY_ITEM", "SOURCE_STRATEGY_ROLL", "SOURCE_STRATEGY_CHAIN", "SOURCE_SIMULATED_RETURNS", "SOURCE_HOME_TAB", "SOURCE_ASSET_HOME", "SOURCE_RETIREMENT_HOME", "SOURCE_ORDER_FORM_FLYOVER", "SOURCE_SOCIAL_POST", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Source implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Source> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Source SOURCE_ACTIVITY_ITEM;
        public static final Source SOURCE_AGGREGATE_POSITION;
        public static final Source SOURCE_ASSET_HOME;
        public static final Source SOURCE_HOME_TAB;
        public static final Source SOURCE_INSTRUMENT_DETAIL;
        public static final Source SOURCE_OPTION_CHAIN;
        public static final Source SOURCE_ORDER_DETAIL;
        public static final Source SOURCE_ORDER_FORM_FLYOVER;
        public static final Source SOURCE_RETIREMENT_HOME;
        public static final Source SOURCE_SIMULATED_RETURNS;
        public static final Source SOURCE_SOCIAL_POST;
        public static final Source SOURCE_STRATEGY_CHAIN;
        public static final Source SOURCE_STRATEGY_DETAIL;
        public static final Source SOURCE_STRATEGY_ROLL;
        public static final Source SOURCE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Source[] $values() {
            return new Source[]{SOURCE_UNSPECIFIED, SOURCE_OPTION_CHAIN, SOURCE_INSTRUMENT_DETAIL, SOURCE_AGGREGATE_POSITION, SOURCE_STRATEGY_DETAIL, SOURCE_ORDER_DETAIL, SOURCE_ACTIVITY_ITEM, SOURCE_STRATEGY_ROLL, SOURCE_STRATEGY_CHAIN, SOURCE_SIMULATED_RETURNS, SOURCE_HOME_TAB, SOURCE_ASSET_HOME, SOURCE_RETIREMENT_HOME, SOURCE_ORDER_FORM_FLYOVER, SOURCE_SOCIAL_POST};
        }

        @JvmStatic
        public static final Source fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Source> getEntries() {
            return $ENTRIES;
        }

        private Source(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Source source = new Source("SOURCE_UNSPECIFIED", 0, 0);
            SOURCE_UNSPECIFIED = source;
            SOURCE_OPTION_CHAIN = new Source("SOURCE_OPTION_CHAIN", 1, 1);
            SOURCE_INSTRUMENT_DETAIL = new Source("SOURCE_INSTRUMENT_DETAIL", 2, 2);
            SOURCE_AGGREGATE_POSITION = new Source("SOURCE_AGGREGATE_POSITION", 3, 3);
            SOURCE_STRATEGY_DETAIL = new Source("SOURCE_STRATEGY_DETAIL", 4, 4);
            SOURCE_ORDER_DETAIL = new Source("SOURCE_ORDER_DETAIL", 5, 5);
            SOURCE_ACTIVITY_ITEM = new Source("SOURCE_ACTIVITY_ITEM", 6, 6);
            SOURCE_STRATEGY_ROLL = new Source("SOURCE_STRATEGY_ROLL", 7, 7);
            SOURCE_STRATEGY_CHAIN = new Source("SOURCE_STRATEGY_CHAIN", 8, 8);
            SOURCE_SIMULATED_RETURNS = new Source("SOURCE_SIMULATED_RETURNS", 9, 9);
            SOURCE_HOME_TAB = new Source("SOURCE_HOME_TAB", 10, 10);
            SOURCE_ASSET_HOME = new Source("SOURCE_ASSET_HOME", 11, 11);
            SOURCE_RETIREMENT_HOME = new Source("SOURCE_RETIREMENT_HOME", 12, 12);
            SOURCE_ORDER_FORM_FLYOVER = new Source("SOURCE_ORDER_FORM_FLYOVER", 13, 13);
            SOURCE_SOCIAL_POST = new Source("SOURCE_SOCIAL_POST", 14, 14);
            Source[] sourceArr$values = $values();
            $VALUES = sourceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Source.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Source>(orCreateKotlinClass, syntax, source) { // from class: com.robinhood.rosetta.eventlogging.OptionOrderMeta$Source$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public OptionOrderMeta.Source fromValue(int value) {
                    return OptionOrderMeta.Source.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: OptionOrderMeta.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Source fromValue(int value) {
                switch (value) {
                    case 0:
                        return Source.SOURCE_UNSPECIFIED;
                    case 1:
                        return Source.SOURCE_OPTION_CHAIN;
                    case 2:
                        return Source.SOURCE_INSTRUMENT_DETAIL;
                    case 3:
                        return Source.SOURCE_AGGREGATE_POSITION;
                    case 4:
                        return Source.SOURCE_STRATEGY_DETAIL;
                    case 5:
                        return Source.SOURCE_ORDER_DETAIL;
                    case 6:
                        return Source.SOURCE_ACTIVITY_ITEM;
                    case 7:
                        return Source.SOURCE_STRATEGY_ROLL;
                    case 8:
                        return Source.SOURCE_STRATEGY_CHAIN;
                    case 9:
                        return Source.SOURCE_SIMULATED_RETURNS;
                    case 10:
                        return Source.SOURCE_HOME_TAB;
                    case 11:
                        return Source.SOURCE_ASSET_HOME;
                    case 12:
                        return Source.SOURCE_RETIREMENT_HOME;
                    case 13:
                        return Source.SOURCE_ORDER_FORM_FLYOVER;
                    case 14:
                        return Source.SOURCE_SOCIAL_POST;
                    default:
                        return null;
                }
            }
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }
}

package com.robinhood.ceres.p284v1;

import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: ValidateOrderResponse.kt */
@Metadata(m3635d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 i2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001iB\u0097\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u0010/\u001a\u000200¢\u0006\u0004\b1\u00102J\b\u0010_\u001a\u00020\u0002H\u0017J\u0013\u0010`\u001a\u00020a2\b\u0010b\u001a\u0004\u0018\u00010cH\u0096\u0002J\b\u0010d\u001a\u00020eH\u0016J\b\u0010f\u001a\u00020gH\u0016J\u0096\u0002\u0010h\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\b\b\u0002\u0010/\u001a\u000200R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0018\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0018\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0018\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0018\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0018\u0010-\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^¨\u0006j"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponse;", "Lcom/squareup/wire/Message;", "", "result", "Lcom/robinhood/ceres/v1/ValidateOrderResult;", "success", "Lcom/robinhood/ceres/v1/ValidateOrderSuccessDetails;", "insufficient_bp", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientBPDetails;", "insufficient_account_value", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetails;", QuestionnaireContexts.SUITABILITY, "Lcom/robinhood/ceres/v1/ValidateOrderSuitabilityDetails;", "invalid_tick", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetails;", "missing_price", "Lcom/robinhood/ceres/v1/ValidateOrderMissingPriceDetails;", "nonpositive_quantity", "Lcom/robinhood/ceres/v1/ValidateOrderNonpositiveQuantityDetails;", "max_order_quantity", "Lcom/robinhood/ceres/v1/ValidateOrderMaxOrderQuantityDetails;", "gtc_market_order", "Lcom/robinhood/ceres/v1/ValidateOrderGTCMarketOrderDetails;", "tradability", "Lcom/robinhood/ceres/v1/ValidateOrderTradabilityDetails;", "account_pco", "Lcom/robinhood/ceres/v1/ValidateOrderAccountPCODetails;", "instrument_pco", "Lcom/robinhood/ceres/v1/ValidateOrderInstrumentPCODetails;", "max_position", "Lcom/robinhood/ceres/v1/ValidateOrderMaxPositionDetails;", "margin_min_equity", "Lcom/robinhood/ceres/v1/ValidateOrderMarginMinEquityDetails;", "no_shorts", "Lcom/robinhood/ceres/v1/ValidateOrderNoShortsDetails;", "instant_fraud", "Lcom/robinhood/ceres/v1/ValidateOrderInstantFraudDetails;", "sender_location", "Lcom/robinhood/ceres/v1/ValidateOrderSenderLocationDetails;", "uneconomical_price", "Lcom/robinhood/ceres/v1/ValidateOrderUneconomicalPriceDetails;", "no_reversals", "Lcom/robinhood/ceres/v1/ValidateOrderNoReversalsDetails;", "invalid_price", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidPriceDetails;", "generic", "Lcom/robinhood/ceres/v1/ValidateOrderGenericDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderResult;Lcom/robinhood/ceres/v1/ValidateOrderSuccessDetails;Lcom/robinhood/ceres/v1/ValidateOrderInsufficientBPDetails;Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetails;Lcom/robinhood/ceres/v1/ValidateOrderSuitabilityDetails;Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetails;Lcom/robinhood/ceres/v1/ValidateOrderMissingPriceDetails;Lcom/robinhood/ceres/v1/ValidateOrderNonpositiveQuantityDetails;Lcom/robinhood/ceres/v1/ValidateOrderMaxOrderQuantityDetails;Lcom/robinhood/ceres/v1/ValidateOrderGTCMarketOrderDetails;Lcom/robinhood/ceres/v1/ValidateOrderTradabilityDetails;Lcom/robinhood/ceres/v1/ValidateOrderAccountPCODetails;Lcom/robinhood/ceres/v1/ValidateOrderInstrumentPCODetails;Lcom/robinhood/ceres/v1/ValidateOrderMaxPositionDetails;Lcom/robinhood/ceres/v1/ValidateOrderMarginMinEquityDetails;Lcom/robinhood/ceres/v1/ValidateOrderNoShortsDetails;Lcom/robinhood/ceres/v1/ValidateOrderInstantFraudDetails;Lcom/robinhood/ceres/v1/ValidateOrderSenderLocationDetails;Lcom/robinhood/ceres/v1/ValidateOrderUneconomicalPriceDetails;Lcom/robinhood/ceres/v1/ValidateOrderNoReversalsDetails;Lcom/robinhood/ceres/v1/ValidateOrderInvalidPriceDetails;Lcom/robinhood/ceres/v1/ValidateOrderGenericDetails;Lokio/ByteString;)V", "getResult", "()Lcom/robinhood/ceres/v1/ValidateOrderResult;", "getSuccess", "()Lcom/robinhood/ceres/v1/ValidateOrderSuccessDetails;", "getInsufficient_bp", "()Lcom/robinhood/ceres/v1/ValidateOrderInsufficientBPDetails;", "getInsufficient_account_value", "()Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetails;", "getSuitability", "()Lcom/robinhood/ceres/v1/ValidateOrderSuitabilityDetails;", "getInvalid_tick", "()Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetails;", "getMissing_price", "()Lcom/robinhood/ceres/v1/ValidateOrderMissingPriceDetails;", "getNonpositive_quantity", "()Lcom/robinhood/ceres/v1/ValidateOrderNonpositiveQuantityDetails;", "getMax_order_quantity", "()Lcom/robinhood/ceres/v1/ValidateOrderMaxOrderQuantityDetails;", "getGtc_market_order", "()Lcom/robinhood/ceres/v1/ValidateOrderGTCMarketOrderDetails;", "getTradability", "()Lcom/robinhood/ceres/v1/ValidateOrderTradabilityDetails;", "getAccount_pco", "()Lcom/robinhood/ceres/v1/ValidateOrderAccountPCODetails;", "getInstrument_pco", "()Lcom/robinhood/ceres/v1/ValidateOrderInstrumentPCODetails;", "getMax_position", "()Lcom/robinhood/ceres/v1/ValidateOrderMaxPositionDetails;", "getMargin_min_equity", "()Lcom/robinhood/ceres/v1/ValidateOrderMarginMinEquityDetails;", "getNo_shorts", "()Lcom/robinhood/ceres/v1/ValidateOrderNoShortsDetails;", "getInstant_fraud", "()Lcom/robinhood/ceres/v1/ValidateOrderInstantFraudDetails;", "getSender_location", "()Lcom/robinhood/ceres/v1/ValidateOrderSenderLocationDetails;", "getUneconomical_price", "()Lcom/robinhood/ceres/v1/ValidateOrderUneconomicalPriceDetails;", "getNo_reversals", "()Lcom/robinhood/ceres/v1/ValidateOrderNoReversalsDetails;", "getInvalid_price", "()Lcom/robinhood/ceres/v1/ValidateOrderInvalidPriceDetails;", "getGeneric", "()Lcom/robinhood/ceres/v1/ValidateOrderGenericDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ValidateOrderResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ValidateOrderResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderAccountPCODetails#ADAPTER", jsonName = "accountPco", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 11, tag = 12)
    private final ValidateOrderAccountPCODetails account_pco;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderGenericDetails#ADAPTER", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 21, tag = 2)
    private final ValidateOrderGenericDetails generic;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderGTCMarketOrderDetails#ADAPTER", jsonName = "gtcMarketOrder", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 9, tag = 10)
    private final ValidateOrderGTCMarketOrderDetails gtc_market_order;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderInstantFraudDetails#ADAPTER", jsonName = "instantFraud", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 16, tag = 18)
    private final ValidateOrderInstantFraudDetails instant_fraud;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderInstrumentPCODetails#ADAPTER", jsonName = "instrumentPco", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 12, tag = 13)
    private final ValidateOrderInstrumentPCODetails instrument_pco;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderInsufficientAccountValueDetails#ADAPTER", jsonName = "insufficientAccountValue", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 3, tag = 14)
    private final ValidateOrderInsufficientAccountValueDetails insufficient_account_value;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderInsufficientBPDetails#ADAPTER", jsonName = "insufficientBp", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 2, tag = 4)
    private final ValidateOrderInsufficientBPDetails insufficient_bp;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderInvalidPriceDetails#ADAPTER", jsonName = "invalidPrice", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 20, tag = 22)
    private final ValidateOrderInvalidPriceDetails invalid_price;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderInvalidTickDetails#ADAPTER", jsonName = "invalidTick", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 5, tag = 6)
    private final ValidateOrderInvalidTickDetails invalid_tick;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderMarginMinEquityDetails#ADAPTER", jsonName = "marginMinEquity", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 14, tag = 16)
    private final ValidateOrderMarginMinEquityDetails margin_min_equity;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderMaxOrderQuantityDetails#ADAPTER", jsonName = "maxOrderQuantity", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 8, tag = 9)
    private final ValidateOrderMaxOrderQuantityDetails max_order_quantity;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderMaxPositionDetails#ADAPTER", jsonName = "maxPosition", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 13, tag = 15)
    private final ValidateOrderMaxPositionDetails max_position;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderMissingPriceDetails#ADAPTER", jsonName = "missingPrice", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 6, tag = 7)
    private final ValidateOrderMissingPriceDetails missing_price;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderNoReversalsDetails#ADAPTER", jsonName = "noReversals", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 19, tag = 21)
    private final ValidateOrderNoReversalsDetails no_reversals;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderNoShortsDetails#ADAPTER", jsonName = "noShorts", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 15, tag = 17)
    private final ValidateOrderNoShortsDetails no_shorts;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderNonpositiveQuantityDetails#ADAPTER", jsonName = "nonpositiveQuantity", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 7, tag = 8)
    private final ValidateOrderNonpositiveQuantityDetails nonpositive_quantity;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderResult#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ValidateOrderResult result;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderSenderLocationDetails#ADAPTER", jsonName = "senderLocation", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 17, tag = 19)
    private final ValidateOrderSenderLocationDetails sender_location;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderSuccessDetails#ADAPTER", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 1, tag = 3)
    private final ValidateOrderSuccessDetails success;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderSuitabilityDetails#ADAPTER", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 4, tag = 5)
    private final ValidateOrderSuitabilityDetails suitability;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderTradabilityDetails#ADAPTER", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 10, tag = 11)
    private final ValidateOrderTradabilityDetails tradability;

    @WireField(adapter = "com.robinhood.ceres.v1.ValidateOrderUneconomicalPriceDetails#ADAPTER", jsonName = "uneconomicalPrice", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 18, tag = 20)
    private final ValidateOrderUneconomicalPriceDetails uneconomical_price;

    public ValidateOrderResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20453newBuilder();
    }

    public final ValidateOrderResult getResult() {
        return this.result;
    }

    public /* synthetic */ ValidateOrderResponse(ValidateOrderResult validateOrderResult, ValidateOrderSuccessDetails validateOrderSuccessDetails, ValidateOrderInsufficientBPDetails validateOrderInsufficientBPDetails, ValidateOrderInsufficientAccountValueDetails validateOrderInsufficientAccountValueDetails, ValidateOrderSuitabilityDetails validateOrderSuitabilityDetails, ValidateOrderInvalidTickDetails validateOrderInvalidTickDetails, ValidateOrderMissingPriceDetails validateOrderMissingPriceDetails, ValidateOrderNonpositiveQuantityDetails validateOrderNonpositiveQuantityDetails, ValidateOrderMaxOrderQuantityDetails validateOrderMaxOrderQuantityDetails, ValidateOrderGTCMarketOrderDetails validateOrderGTCMarketOrderDetails, ValidateOrderTradabilityDetails validateOrderTradabilityDetails, ValidateOrderAccountPCODetails validateOrderAccountPCODetails, ValidateOrderInstrumentPCODetails validateOrderInstrumentPCODetails, ValidateOrderMaxPositionDetails validateOrderMaxPositionDetails, ValidateOrderMarginMinEquityDetails validateOrderMarginMinEquityDetails, ValidateOrderNoShortsDetails validateOrderNoShortsDetails, ValidateOrderInstantFraudDetails validateOrderInstantFraudDetails, ValidateOrderSenderLocationDetails validateOrderSenderLocationDetails, ValidateOrderUneconomicalPriceDetails validateOrderUneconomicalPriceDetails, ValidateOrderNoReversalsDetails validateOrderNoReversalsDetails, ValidateOrderInvalidPriceDetails validateOrderInvalidPriceDetails, ValidateOrderGenericDetails validateOrderGenericDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ValidateOrderResult.VALIDATE_ORDER_RESULT_UNSPECIFIED : validateOrderResult, (i & 2) != 0 ? null : validateOrderSuccessDetails, (i & 4) != 0 ? null : validateOrderInsufficientBPDetails, (i & 8) != 0 ? null : validateOrderInsufficientAccountValueDetails, (i & 16) != 0 ? null : validateOrderSuitabilityDetails, (i & 32) != 0 ? null : validateOrderInvalidTickDetails, (i & 64) != 0 ? null : validateOrderMissingPriceDetails, (i & 128) != 0 ? null : validateOrderNonpositiveQuantityDetails, (i & 256) != 0 ? null : validateOrderMaxOrderQuantityDetails, (i & 512) != 0 ? null : validateOrderGTCMarketOrderDetails, (i & 1024) != 0 ? null : validateOrderTradabilityDetails, (i & 2048) != 0 ? null : validateOrderAccountPCODetails, (i & 4096) != 0 ? null : validateOrderInstrumentPCODetails, (i & 8192) != 0 ? null : validateOrderMaxPositionDetails, (i & 16384) != 0 ? null : validateOrderMarginMinEquityDetails, (i & 32768) != 0 ? null : validateOrderNoShortsDetails, (i & 65536) != 0 ? null : validateOrderInstantFraudDetails, (i & 131072) != 0 ? null : validateOrderSenderLocationDetails, (i & 262144) != 0 ? null : validateOrderUneconomicalPriceDetails, (i & 524288) != 0 ? null : validateOrderNoReversalsDetails, (i & 1048576) != 0 ? null : validateOrderInvalidPriceDetails, (i & 2097152) != 0 ? null : validateOrderGenericDetails, (i & 4194304) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ValidateOrderSuccessDetails getSuccess() {
        return this.success;
    }

    public final ValidateOrderInsufficientBPDetails getInsufficient_bp() {
        return this.insufficient_bp;
    }

    public final ValidateOrderInsufficientAccountValueDetails getInsufficient_account_value() {
        return this.insufficient_account_value;
    }

    public final ValidateOrderSuitabilityDetails getSuitability() {
        return this.suitability;
    }

    public final ValidateOrderInvalidTickDetails getInvalid_tick() {
        return this.invalid_tick;
    }

    public final ValidateOrderMissingPriceDetails getMissing_price() {
        return this.missing_price;
    }

    public final ValidateOrderNonpositiveQuantityDetails getNonpositive_quantity() {
        return this.nonpositive_quantity;
    }

    public final ValidateOrderMaxOrderQuantityDetails getMax_order_quantity() {
        return this.max_order_quantity;
    }

    public final ValidateOrderGTCMarketOrderDetails getGtc_market_order() {
        return this.gtc_market_order;
    }

    public final ValidateOrderTradabilityDetails getTradability() {
        return this.tradability;
    }

    public final ValidateOrderAccountPCODetails getAccount_pco() {
        return this.account_pco;
    }

    public final ValidateOrderInstrumentPCODetails getInstrument_pco() {
        return this.instrument_pco;
    }

    public final ValidateOrderMaxPositionDetails getMax_position() {
        return this.max_position;
    }

    public final ValidateOrderMarginMinEquityDetails getMargin_min_equity() {
        return this.margin_min_equity;
    }

    public final ValidateOrderNoShortsDetails getNo_shorts() {
        return this.no_shorts;
    }

    public final ValidateOrderInstantFraudDetails getInstant_fraud() {
        return this.instant_fraud;
    }

    public final ValidateOrderSenderLocationDetails getSender_location() {
        return this.sender_location;
    }

    public final ValidateOrderUneconomicalPriceDetails getUneconomical_price() {
        return this.uneconomical_price;
    }

    public final ValidateOrderNoReversalsDetails getNo_reversals() {
        return this.no_reversals;
    }

    public final ValidateOrderInvalidPriceDetails getInvalid_price() {
        return this.invalid_price;
    }

    public final ValidateOrderGenericDetails getGeneric() {
        return this.generic;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateOrderResponse(ValidateOrderResult result, ValidateOrderSuccessDetails validateOrderSuccessDetails, ValidateOrderInsufficientBPDetails validateOrderInsufficientBPDetails, ValidateOrderInsufficientAccountValueDetails validateOrderInsufficientAccountValueDetails, ValidateOrderSuitabilityDetails validateOrderSuitabilityDetails, ValidateOrderInvalidTickDetails validateOrderInvalidTickDetails, ValidateOrderMissingPriceDetails validateOrderMissingPriceDetails, ValidateOrderNonpositiveQuantityDetails validateOrderNonpositiveQuantityDetails, ValidateOrderMaxOrderQuantityDetails validateOrderMaxOrderQuantityDetails, ValidateOrderGTCMarketOrderDetails validateOrderGTCMarketOrderDetails, ValidateOrderTradabilityDetails validateOrderTradabilityDetails, ValidateOrderAccountPCODetails validateOrderAccountPCODetails, ValidateOrderInstrumentPCODetails validateOrderInstrumentPCODetails, ValidateOrderMaxPositionDetails validateOrderMaxPositionDetails, ValidateOrderMarginMinEquityDetails validateOrderMarginMinEquityDetails, ValidateOrderNoShortsDetails validateOrderNoShortsDetails, ValidateOrderInstantFraudDetails validateOrderInstantFraudDetails, ValidateOrderSenderLocationDetails validateOrderSenderLocationDetails, ValidateOrderUneconomicalPriceDetails validateOrderUneconomicalPriceDetails, ValidateOrderNoReversalsDetails validateOrderNoReversalsDetails, ValidateOrderInvalidPriceDetails validateOrderInvalidPriceDetails, ValidateOrderGenericDetails validateOrderGenericDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.result = result;
        this.success = validateOrderSuccessDetails;
        this.insufficient_bp = validateOrderInsufficientBPDetails;
        this.insufficient_account_value = validateOrderInsufficientAccountValueDetails;
        this.suitability = validateOrderSuitabilityDetails;
        this.invalid_tick = validateOrderInvalidTickDetails;
        this.missing_price = validateOrderMissingPriceDetails;
        this.nonpositive_quantity = validateOrderNonpositiveQuantityDetails;
        this.max_order_quantity = validateOrderMaxOrderQuantityDetails;
        this.gtc_market_order = validateOrderGTCMarketOrderDetails;
        this.tradability = validateOrderTradabilityDetails;
        this.account_pco = validateOrderAccountPCODetails;
        this.instrument_pco = validateOrderInstrumentPCODetails;
        this.max_position = validateOrderMaxPositionDetails;
        this.margin_min_equity = validateOrderMarginMinEquityDetails;
        this.no_shorts = validateOrderNoShortsDetails;
        this.instant_fraud = validateOrderInstantFraudDetails;
        this.sender_location = validateOrderSenderLocationDetails;
        this.uneconomical_price = validateOrderUneconomicalPriceDetails;
        this.no_reversals = validateOrderNoReversalsDetails;
        this.invalid_price = validateOrderInvalidPriceDetails;
        this.generic = validateOrderGenericDetails;
        if (Internal.countNonNull(validateOrderSuccessDetails, validateOrderInsufficientBPDetails, validateOrderInsufficientAccountValueDetails, validateOrderSuitabilityDetails, validateOrderInvalidTickDetails, validateOrderMissingPriceDetails, validateOrderNonpositiveQuantityDetails, validateOrderMaxOrderQuantityDetails, validateOrderGTCMarketOrderDetails, validateOrderTradabilityDetails, validateOrderAccountPCODetails, validateOrderInstrumentPCODetails, validateOrderMaxPositionDetails, validateOrderMarginMinEquityDetails, validateOrderNoShortsDetails, validateOrderInstantFraudDetails, validateOrderSenderLocationDetails, validateOrderUneconomicalPriceDetails, validateOrderNoReversalsDetails, validateOrderInvalidPriceDetails, validateOrderGenericDetails) > 1) {
            throw new IllegalArgumentException("At most one of success, insufficient_bp, insufficient_account_value, suitability, invalid_tick, missing_price, nonpositive_quantity, max_order_quantity, gtc_market_order, tradability, account_pco, instrument_pco, max_position, margin_min_equity, no_shorts, instant_fraud, sender_location, uneconomical_price, no_reversals, invalid_price, generic may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20453newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValidateOrderResponse)) {
            return false;
        }
        ValidateOrderResponse validateOrderResponse = (ValidateOrderResponse) other;
        return Intrinsics.areEqual(unknownFields(), validateOrderResponse.unknownFields()) && this.result == validateOrderResponse.result && Intrinsics.areEqual(this.success, validateOrderResponse.success) && Intrinsics.areEqual(this.insufficient_bp, validateOrderResponse.insufficient_bp) && Intrinsics.areEqual(this.insufficient_account_value, validateOrderResponse.insufficient_account_value) && Intrinsics.areEqual(this.suitability, validateOrderResponse.suitability) && Intrinsics.areEqual(this.invalid_tick, validateOrderResponse.invalid_tick) && Intrinsics.areEqual(this.missing_price, validateOrderResponse.missing_price) && Intrinsics.areEqual(this.nonpositive_quantity, validateOrderResponse.nonpositive_quantity) && Intrinsics.areEqual(this.max_order_quantity, validateOrderResponse.max_order_quantity) && Intrinsics.areEqual(this.gtc_market_order, validateOrderResponse.gtc_market_order) && Intrinsics.areEqual(this.tradability, validateOrderResponse.tradability) && Intrinsics.areEqual(this.account_pco, validateOrderResponse.account_pco) && Intrinsics.areEqual(this.instrument_pco, validateOrderResponse.instrument_pco) && Intrinsics.areEqual(this.max_position, validateOrderResponse.max_position) && Intrinsics.areEqual(this.margin_min_equity, validateOrderResponse.margin_min_equity) && Intrinsics.areEqual(this.no_shorts, validateOrderResponse.no_shorts) && Intrinsics.areEqual(this.instant_fraud, validateOrderResponse.instant_fraud) && Intrinsics.areEqual(this.sender_location, validateOrderResponse.sender_location) && Intrinsics.areEqual(this.uneconomical_price, validateOrderResponse.uneconomical_price) && Intrinsics.areEqual(this.no_reversals, validateOrderResponse.no_reversals) && Intrinsics.areEqual(this.invalid_price, validateOrderResponse.invalid_price) && Intrinsics.areEqual(this.generic, validateOrderResponse.generic);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.result.hashCode()) * 37;
        ValidateOrderSuccessDetails validateOrderSuccessDetails = this.success;
        int iHashCode2 = (iHashCode + (validateOrderSuccessDetails != null ? validateOrderSuccessDetails.hashCode() : 0)) * 37;
        ValidateOrderInsufficientBPDetails validateOrderInsufficientBPDetails = this.insufficient_bp;
        int iHashCode3 = (iHashCode2 + (validateOrderInsufficientBPDetails != null ? validateOrderInsufficientBPDetails.hashCode() : 0)) * 37;
        ValidateOrderInsufficientAccountValueDetails validateOrderInsufficientAccountValueDetails = this.insufficient_account_value;
        int iHashCode4 = (iHashCode3 + (validateOrderInsufficientAccountValueDetails != null ? validateOrderInsufficientAccountValueDetails.hashCode() : 0)) * 37;
        ValidateOrderSuitabilityDetails validateOrderSuitabilityDetails = this.suitability;
        int iHashCode5 = (iHashCode4 + (validateOrderSuitabilityDetails != null ? validateOrderSuitabilityDetails.hashCode() : 0)) * 37;
        ValidateOrderInvalidTickDetails validateOrderInvalidTickDetails = this.invalid_tick;
        int iHashCode6 = (iHashCode5 + (validateOrderInvalidTickDetails != null ? validateOrderInvalidTickDetails.hashCode() : 0)) * 37;
        ValidateOrderMissingPriceDetails validateOrderMissingPriceDetails = this.missing_price;
        int iHashCode7 = (iHashCode6 + (validateOrderMissingPriceDetails != null ? validateOrderMissingPriceDetails.hashCode() : 0)) * 37;
        ValidateOrderNonpositiveQuantityDetails validateOrderNonpositiveQuantityDetails = this.nonpositive_quantity;
        int iHashCode8 = (iHashCode7 + (validateOrderNonpositiveQuantityDetails != null ? validateOrderNonpositiveQuantityDetails.hashCode() : 0)) * 37;
        ValidateOrderMaxOrderQuantityDetails validateOrderMaxOrderQuantityDetails = this.max_order_quantity;
        int iHashCode9 = (iHashCode8 + (validateOrderMaxOrderQuantityDetails != null ? validateOrderMaxOrderQuantityDetails.hashCode() : 0)) * 37;
        ValidateOrderGTCMarketOrderDetails validateOrderGTCMarketOrderDetails = this.gtc_market_order;
        int iHashCode10 = (iHashCode9 + (validateOrderGTCMarketOrderDetails != null ? validateOrderGTCMarketOrderDetails.hashCode() : 0)) * 37;
        ValidateOrderTradabilityDetails validateOrderTradabilityDetails = this.tradability;
        int iHashCode11 = (iHashCode10 + (validateOrderTradabilityDetails != null ? validateOrderTradabilityDetails.hashCode() : 0)) * 37;
        ValidateOrderAccountPCODetails validateOrderAccountPCODetails = this.account_pco;
        int iHashCode12 = (iHashCode11 + (validateOrderAccountPCODetails != null ? validateOrderAccountPCODetails.hashCode() : 0)) * 37;
        ValidateOrderInstrumentPCODetails validateOrderInstrumentPCODetails = this.instrument_pco;
        int iHashCode13 = (iHashCode12 + (validateOrderInstrumentPCODetails != null ? validateOrderInstrumentPCODetails.hashCode() : 0)) * 37;
        ValidateOrderMaxPositionDetails validateOrderMaxPositionDetails = this.max_position;
        int iHashCode14 = (iHashCode13 + (validateOrderMaxPositionDetails != null ? validateOrderMaxPositionDetails.hashCode() : 0)) * 37;
        ValidateOrderMarginMinEquityDetails validateOrderMarginMinEquityDetails = this.margin_min_equity;
        int iHashCode15 = (iHashCode14 + (validateOrderMarginMinEquityDetails != null ? validateOrderMarginMinEquityDetails.hashCode() : 0)) * 37;
        ValidateOrderNoShortsDetails validateOrderNoShortsDetails = this.no_shorts;
        int iHashCode16 = (iHashCode15 + (validateOrderNoShortsDetails != null ? validateOrderNoShortsDetails.hashCode() : 0)) * 37;
        ValidateOrderInstantFraudDetails validateOrderInstantFraudDetails = this.instant_fraud;
        int iHashCode17 = (iHashCode16 + (validateOrderInstantFraudDetails != null ? validateOrderInstantFraudDetails.hashCode() : 0)) * 37;
        ValidateOrderSenderLocationDetails validateOrderSenderLocationDetails = this.sender_location;
        int iHashCode18 = (iHashCode17 + (validateOrderSenderLocationDetails != null ? validateOrderSenderLocationDetails.hashCode() : 0)) * 37;
        ValidateOrderUneconomicalPriceDetails validateOrderUneconomicalPriceDetails = this.uneconomical_price;
        int iHashCode19 = (iHashCode18 + (validateOrderUneconomicalPriceDetails != null ? validateOrderUneconomicalPriceDetails.hashCode() : 0)) * 37;
        ValidateOrderNoReversalsDetails validateOrderNoReversalsDetails = this.no_reversals;
        int iHashCode20 = (iHashCode19 + (validateOrderNoReversalsDetails != null ? validateOrderNoReversalsDetails.hashCode() : 0)) * 37;
        ValidateOrderInvalidPriceDetails validateOrderInvalidPriceDetails = this.invalid_price;
        int iHashCode21 = (iHashCode20 + (validateOrderInvalidPriceDetails != null ? validateOrderInvalidPriceDetails.hashCode() : 0)) * 37;
        ValidateOrderGenericDetails validateOrderGenericDetails = this.generic;
        int iHashCode22 = iHashCode21 + (validateOrderGenericDetails != null ? validateOrderGenericDetails.hashCode() : 0);
        this.hashCode = iHashCode22;
        return iHashCode22;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("result=" + this.result);
        ValidateOrderSuccessDetails validateOrderSuccessDetails = this.success;
        if (validateOrderSuccessDetails != null) {
            arrayList.add("success=" + validateOrderSuccessDetails);
        }
        ValidateOrderInsufficientBPDetails validateOrderInsufficientBPDetails = this.insufficient_bp;
        if (validateOrderInsufficientBPDetails != null) {
            arrayList.add("insufficient_bp=" + validateOrderInsufficientBPDetails);
        }
        ValidateOrderInsufficientAccountValueDetails validateOrderInsufficientAccountValueDetails = this.insufficient_account_value;
        if (validateOrderInsufficientAccountValueDetails != null) {
            arrayList.add("insufficient_account_value=" + validateOrderInsufficientAccountValueDetails);
        }
        ValidateOrderSuitabilityDetails validateOrderSuitabilityDetails = this.suitability;
        if (validateOrderSuitabilityDetails != null) {
            arrayList.add("suitability=" + validateOrderSuitabilityDetails);
        }
        ValidateOrderInvalidTickDetails validateOrderInvalidTickDetails = this.invalid_tick;
        if (validateOrderInvalidTickDetails != null) {
            arrayList.add("invalid_tick=" + validateOrderInvalidTickDetails);
        }
        ValidateOrderMissingPriceDetails validateOrderMissingPriceDetails = this.missing_price;
        if (validateOrderMissingPriceDetails != null) {
            arrayList.add("missing_price=" + validateOrderMissingPriceDetails);
        }
        ValidateOrderNonpositiveQuantityDetails validateOrderNonpositiveQuantityDetails = this.nonpositive_quantity;
        if (validateOrderNonpositiveQuantityDetails != null) {
            arrayList.add("nonpositive_quantity=" + validateOrderNonpositiveQuantityDetails);
        }
        ValidateOrderMaxOrderQuantityDetails validateOrderMaxOrderQuantityDetails = this.max_order_quantity;
        if (validateOrderMaxOrderQuantityDetails != null) {
            arrayList.add("max_order_quantity=" + validateOrderMaxOrderQuantityDetails);
        }
        ValidateOrderGTCMarketOrderDetails validateOrderGTCMarketOrderDetails = this.gtc_market_order;
        if (validateOrderGTCMarketOrderDetails != null) {
            arrayList.add("gtc_market_order=" + validateOrderGTCMarketOrderDetails);
        }
        ValidateOrderTradabilityDetails validateOrderTradabilityDetails = this.tradability;
        if (validateOrderTradabilityDetails != null) {
            arrayList.add("tradability=" + validateOrderTradabilityDetails);
        }
        ValidateOrderAccountPCODetails validateOrderAccountPCODetails = this.account_pco;
        if (validateOrderAccountPCODetails != null) {
            arrayList.add("account_pco=" + validateOrderAccountPCODetails);
        }
        ValidateOrderInstrumentPCODetails validateOrderInstrumentPCODetails = this.instrument_pco;
        if (validateOrderInstrumentPCODetails != null) {
            arrayList.add("instrument_pco=" + validateOrderInstrumentPCODetails);
        }
        ValidateOrderMaxPositionDetails validateOrderMaxPositionDetails = this.max_position;
        if (validateOrderMaxPositionDetails != null) {
            arrayList.add("max_position=" + validateOrderMaxPositionDetails);
        }
        ValidateOrderMarginMinEquityDetails validateOrderMarginMinEquityDetails = this.margin_min_equity;
        if (validateOrderMarginMinEquityDetails != null) {
            arrayList.add("margin_min_equity=" + validateOrderMarginMinEquityDetails);
        }
        ValidateOrderNoShortsDetails validateOrderNoShortsDetails = this.no_shorts;
        if (validateOrderNoShortsDetails != null) {
            arrayList.add("no_shorts=" + validateOrderNoShortsDetails);
        }
        ValidateOrderInstantFraudDetails validateOrderInstantFraudDetails = this.instant_fraud;
        if (validateOrderInstantFraudDetails != null) {
            arrayList.add("instant_fraud=" + validateOrderInstantFraudDetails);
        }
        ValidateOrderSenderLocationDetails validateOrderSenderLocationDetails = this.sender_location;
        if (validateOrderSenderLocationDetails != null) {
            arrayList.add("sender_location=" + validateOrderSenderLocationDetails);
        }
        ValidateOrderUneconomicalPriceDetails validateOrderUneconomicalPriceDetails = this.uneconomical_price;
        if (validateOrderUneconomicalPriceDetails != null) {
            arrayList.add("uneconomical_price=" + validateOrderUneconomicalPriceDetails);
        }
        ValidateOrderNoReversalsDetails validateOrderNoReversalsDetails = this.no_reversals;
        if (validateOrderNoReversalsDetails != null) {
            arrayList.add("no_reversals=" + validateOrderNoReversalsDetails);
        }
        ValidateOrderInvalidPriceDetails validateOrderInvalidPriceDetails = this.invalid_price;
        if (validateOrderInvalidPriceDetails != null) {
            arrayList.add("invalid_price=" + validateOrderInvalidPriceDetails);
        }
        ValidateOrderGenericDetails validateOrderGenericDetails = this.generic;
        if (validateOrderGenericDetails != null) {
            arrayList.add("generic=" + validateOrderGenericDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateOrderResponse{", "}", 0, null, null, 56, null);
    }

    public final ValidateOrderResponse copy(ValidateOrderResult result, ValidateOrderSuccessDetails success, ValidateOrderInsufficientBPDetails insufficient_bp, ValidateOrderInsufficientAccountValueDetails insufficient_account_value, ValidateOrderSuitabilityDetails suitability, ValidateOrderInvalidTickDetails invalid_tick, ValidateOrderMissingPriceDetails missing_price, ValidateOrderNonpositiveQuantityDetails nonpositive_quantity, ValidateOrderMaxOrderQuantityDetails max_order_quantity, ValidateOrderGTCMarketOrderDetails gtc_market_order, ValidateOrderTradabilityDetails tradability, ValidateOrderAccountPCODetails account_pco, ValidateOrderInstrumentPCODetails instrument_pco, ValidateOrderMaxPositionDetails max_position, ValidateOrderMarginMinEquityDetails margin_min_equity, ValidateOrderNoShortsDetails no_shorts, ValidateOrderInstantFraudDetails instant_fraud, ValidateOrderSenderLocationDetails sender_location, ValidateOrderUneconomicalPriceDetails uneconomical_price, ValidateOrderNoReversalsDetails no_reversals, ValidateOrderInvalidPriceDetails invalid_price, ValidateOrderGenericDetails generic, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValidateOrderResponse(result, success, insufficient_bp, insufficient_account_value, suitability, invalid_tick, missing_price, nonpositive_quantity, max_order_quantity, gtc_market_order, tradability, account_pco, instrument_pco, max_position, margin_min_equity, no_shorts, instant_fraud, sender_location, uneconomical_price, no_reversals, invalid_price, generic, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidateOrderResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValidateOrderResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.ValidateOrderResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValidateOrderResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getResult() != ValidateOrderResult.VALIDATE_ORDER_RESULT_UNSPECIFIED) {
                    size += ValidateOrderResult.ADAPTER.encodedSizeWithTag(1, value.getResult());
                }
                return size + ValidateOrderSuccessDetails.ADAPTER.encodedSizeWithTag(3, value.getSuccess()) + ValidateOrderInsufficientBPDetails.ADAPTER.encodedSizeWithTag(4, value.getInsufficient_bp()) + ValidateOrderInsufficientAccountValueDetails.ADAPTER.encodedSizeWithTag(14, value.getInsufficient_account_value()) + ValidateOrderSuitabilityDetails.ADAPTER.encodedSizeWithTag(5, value.getSuitability()) + ValidateOrderInvalidTickDetails.ADAPTER.encodedSizeWithTag(6, value.getInvalid_tick()) + ValidateOrderMissingPriceDetails.ADAPTER.encodedSizeWithTag(7, value.getMissing_price()) + ValidateOrderNonpositiveQuantityDetails.ADAPTER.encodedSizeWithTag(8, value.getNonpositive_quantity()) + ValidateOrderMaxOrderQuantityDetails.ADAPTER.encodedSizeWithTag(9, value.getMax_order_quantity()) + ValidateOrderGTCMarketOrderDetails.ADAPTER.encodedSizeWithTag(10, value.getGtc_market_order()) + ValidateOrderTradabilityDetails.ADAPTER.encodedSizeWithTag(11, value.getTradability()) + ValidateOrderAccountPCODetails.ADAPTER.encodedSizeWithTag(12, value.getAccount_pco()) + ValidateOrderInstrumentPCODetails.ADAPTER.encodedSizeWithTag(13, value.getInstrument_pco()) + ValidateOrderMaxPositionDetails.ADAPTER.encodedSizeWithTag(15, value.getMax_position()) + ValidateOrderMarginMinEquityDetails.ADAPTER.encodedSizeWithTag(16, value.getMargin_min_equity()) + ValidateOrderNoShortsDetails.ADAPTER.encodedSizeWithTag(17, value.getNo_shorts()) + ValidateOrderInstantFraudDetails.ADAPTER.encodedSizeWithTag(18, value.getInstant_fraud()) + ValidateOrderSenderLocationDetails.ADAPTER.encodedSizeWithTag(19, value.getSender_location()) + ValidateOrderUneconomicalPriceDetails.ADAPTER.encodedSizeWithTag(20, value.getUneconomical_price()) + ValidateOrderNoReversalsDetails.ADAPTER.encodedSizeWithTag(21, value.getNo_reversals()) + ValidateOrderInvalidPriceDetails.ADAPTER.encodedSizeWithTag(22, value.getInvalid_price()) + ValidateOrderGenericDetails.ADAPTER.encodedSizeWithTag(2, value.getGeneric());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValidateOrderResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getResult() != ValidateOrderResult.VALIDATE_ORDER_RESULT_UNSPECIFIED) {
                    ValidateOrderResult.ADAPTER.encodeWithTag(writer, 1, (int) value.getResult());
                }
                ValidateOrderSuccessDetails.ADAPTER.encodeWithTag(writer, 3, (int) value.getSuccess());
                ValidateOrderInsufficientBPDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getInsufficient_bp());
                ValidateOrderInsufficientAccountValueDetails.ADAPTER.encodeWithTag(writer, 14, (int) value.getInsufficient_account_value());
                ValidateOrderSuitabilityDetails.ADAPTER.encodeWithTag(writer, 5, (int) value.getSuitability());
                ValidateOrderInvalidTickDetails.ADAPTER.encodeWithTag(writer, 6, (int) value.getInvalid_tick());
                ValidateOrderMissingPriceDetails.ADAPTER.encodeWithTag(writer, 7, (int) value.getMissing_price());
                ValidateOrderNonpositiveQuantityDetails.ADAPTER.encodeWithTag(writer, 8, (int) value.getNonpositive_quantity());
                ValidateOrderMaxOrderQuantityDetails.ADAPTER.encodeWithTag(writer, 9, (int) value.getMax_order_quantity());
                ValidateOrderGTCMarketOrderDetails.ADAPTER.encodeWithTag(writer, 10, (int) value.getGtc_market_order());
                ValidateOrderTradabilityDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getTradability());
                ValidateOrderAccountPCODetails.ADAPTER.encodeWithTag(writer, 12, (int) value.getAccount_pco());
                ValidateOrderInstrumentPCODetails.ADAPTER.encodeWithTag(writer, 13, (int) value.getInstrument_pco());
                ValidateOrderMaxPositionDetails.ADAPTER.encodeWithTag(writer, 15, (int) value.getMax_position());
                ValidateOrderMarginMinEquityDetails.ADAPTER.encodeWithTag(writer, 16, (int) value.getMargin_min_equity());
                ValidateOrderNoShortsDetails.ADAPTER.encodeWithTag(writer, 17, (int) value.getNo_shorts());
                ValidateOrderInstantFraudDetails.ADAPTER.encodeWithTag(writer, 18, (int) value.getInstant_fraud());
                ValidateOrderSenderLocationDetails.ADAPTER.encodeWithTag(writer, 19, (int) value.getSender_location());
                ValidateOrderUneconomicalPriceDetails.ADAPTER.encodeWithTag(writer, 20, (int) value.getUneconomical_price());
                ValidateOrderNoReversalsDetails.ADAPTER.encodeWithTag(writer, 21, (int) value.getNo_reversals());
                ValidateOrderInvalidPriceDetails.ADAPTER.encodeWithTag(writer, 22, (int) value.getInvalid_price());
                ValidateOrderGenericDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getGeneric());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValidateOrderResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ValidateOrderGenericDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getGeneric());
                ValidateOrderInvalidPriceDetails.ADAPTER.encodeWithTag(writer, 22, (int) value.getInvalid_price());
                ValidateOrderNoReversalsDetails.ADAPTER.encodeWithTag(writer, 21, (int) value.getNo_reversals());
                ValidateOrderUneconomicalPriceDetails.ADAPTER.encodeWithTag(writer, 20, (int) value.getUneconomical_price());
                ValidateOrderSenderLocationDetails.ADAPTER.encodeWithTag(writer, 19, (int) value.getSender_location());
                ValidateOrderInstantFraudDetails.ADAPTER.encodeWithTag(writer, 18, (int) value.getInstant_fraud());
                ValidateOrderNoShortsDetails.ADAPTER.encodeWithTag(writer, 17, (int) value.getNo_shorts());
                ValidateOrderMarginMinEquityDetails.ADAPTER.encodeWithTag(writer, 16, (int) value.getMargin_min_equity());
                ValidateOrderMaxPositionDetails.ADAPTER.encodeWithTag(writer, 15, (int) value.getMax_position());
                ValidateOrderInstrumentPCODetails.ADAPTER.encodeWithTag(writer, 13, (int) value.getInstrument_pco());
                ValidateOrderAccountPCODetails.ADAPTER.encodeWithTag(writer, 12, (int) value.getAccount_pco());
                ValidateOrderTradabilityDetails.ADAPTER.encodeWithTag(writer, 11, (int) value.getTradability());
                ValidateOrderGTCMarketOrderDetails.ADAPTER.encodeWithTag(writer, 10, (int) value.getGtc_market_order());
                ValidateOrderMaxOrderQuantityDetails.ADAPTER.encodeWithTag(writer, 9, (int) value.getMax_order_quantity());
                ValidateOrderNonpositiveQuantityDetails.ADAPTER.encodeWithTag(writer, 8, (int) value.getNonpositive_quantity());
                ValidateOrderMissingPriceDetails.ADAPTER.encodeWithTag(writer, 7, (int) value.getMissing_price());
                ValidateOrderInvalidTickDetails.ADAPTER.encodeWithTag(writer, 6, (int) value.getInvalid_tick());
                ValidateOrderSuitabilityDetails.ADAPTER.encodeWithTag(writer, 5, (int) value.getSuitability());
                ValidateOrderInsufficientAccountValueDetails.ADAPTER.encodeWithTag(writer, 14, (int) value.getInsufficient_account_value());
                ValidateOrderInsufficientBPDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getInsufficient_bp());
                ValidateOrderSuccessDetails.ADAPTER.encodeWithTag(writer, 3, (int) value.getSuccess());
                if (value.getResult() != ValidateOrderResult.VALIDATE_ORDER_RESULT_UNSPECIFIED) {
                    ValidateOrderResult.ADAPTER.encodeWithTag(writer, 1, (int) value.getResult());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ValidateOrderResponse decode(ProtoReader reader) throws IOException {
                ValidateOrderSuccessDetails validateOrderSuccessDetails;
                ValidateOrderInsufficientBPDetails validateOrderInsufficientBPDetails;
                ValidateOrderInsufficientAccountValueDetails validateOrderInsufficientAccountValueDetails;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ValidateOrderResult validateOrderResult = ValidateOrderResult.VALIDATE_ORDER_RESULT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ValidateOrderResult validateOrderResultDecode = validateOrderResult;
                ValidateOrderSuccessDetails validateOrderSuccessDetailsDecode = null;
                ValidateOrderInsufficientBPDetails validateOrderInsufficientBPDetailsDecode = null;
                ValidateOrderInsufficientAccountValueDetails validateOrderInsufficientAccountValueDetailsDecode = null;
                ValidateOrderSuitabilityDetails validateOrderSuitabilityDetailsDecode = null;
                ValidateOrderInvalidTickDetails validateOrderInvalidTickDetailsDecode = null;
                ValidateOrderMissingPriceDetails validateOrderMissingPriceDetailsDecode = null;
                ValidateOrderNonpositiveQuantityDetails validateOrderNonpositiveQuantityDetailsDecode = null;
                ValidateOrderMaxOrderQuantityDetails validateOrderMaxOrderQuantityDetailsDecode = null;
                ValidateOrderGTCMarketOrderDetails validateOrderGTCMarketOrderDetailsDecode = null;
                ValidateOrderTradabilityDetails validateOrderTradabilityDetailsDecode = null;
                ValidateOrderAccountPCODetails validateOrderAccountPCODetailsDecode = null;
                ValidateOrderInstrumentPCODetails validateOrderInstrumentPCODetailsDecode = null;
                ValidateOrderMaxPositionDetails validateOrderMaxPositionDetailsDecode = null;
                ValidateOrderMarginMinEquityDetails validateOrderMarginMinEquityDetailsDecode = null;
                ValidateOrderNoShortsDetails validateOrderNoShortsDetailsDecode = null;
                ValidateOrderInstantFraudDetails validateOrderInstantFraudDetailsDecode = null;
                ValidateOrderSenderLocationDetails validateOrderSenderLocationDetailsDecode = null;
                ValidateOrderUneconomicalPriceDetails validateOrderUneconomicalPriceDetailsDecode = null;
                ValidateOrderNoReversalsDetails validateOrderNoReversalsDetailsDecode = null;
                ValidateOrderInvalidPriceDetails validateOrderInvalidPriceDetailsDecode = null;
                ValidateOrderGenericDetails validateOrderGenericDetailsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    validateOrderResultDecode = ValidateOrderResult.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    validateOrderSuccessDetails = validateOrderSuccessDetailsDecode;
                                    validateOrderInsufficientBPDetails = validateOrderInsufficientBPDetailsDecode;
                                    validateOrderInsufficientAccountValueDetails = validateOrderInsufficientAccountValueDetailsDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                validateOrderGenericDetailsDecode = ValidateOrderGenericDetails.ADAPTER.decode(reader);
                                continue;
                            case 3:
                                validateOrderSuccessDetailsDecode = ValidateOrderSuccessDetails.ADAPTER.decode(reader);
                                continue;
                            case 4:
                                validateOrderInsufficientBPDetailsDecode = ValidateOrderInsufficientBPDetails.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                validateOrderSuitabilityDetailsDecode = ValidateOrderSuitabilityDetails.ADAPTER.decode(reader);
                                continue;
                            case 6:
                                validateOrderInvalidTickDetailsDecode = ValidateOrderInvalidTickDetails.ADAPTER.decode(reader);
                                continue;
                            case 7:
                                validateOrderMissingPriceDetailsDecode = ValidateOrderMissingPriceDetails.ADAPTER.decode(reader);
                                continue;
                            case 8:
                                validateOrderNonpositiveQuantityDetailsDecode = ValidateOrderNonpositiveQuantityDetails.ADAPTER.decode(reader);
                                continue;
                            case 9:
                                validateOrderMaxOrderQuantityDetailsDecode = ValidateOrderMaxOrderQuantityDetails.ADAPTER.decode(reader);
                                continue;
                            case 10:
                                validateOrderGTCMarketOrderDetailsDecode = ValidateOrderGTCMarketOrderDetails.ADAPTER.decode(reader);
                                continue;
                            case 11:
                                validateOrderTradabilityDetailsDecode = ValidateOrderTradabilityDetails.ADAPTER.decode(reader);
                                continue;
                            case 12:
                                validateOrderAccountPCODetailsDecode = ValidateOrderAccountPCODetails.ADAPTER.decode(reader);
                                continue;
                            case 13:
                                validateOrderInstrumentPCODetailsDecode = ValidateOrderInstrumentPCODetails.ADAPTER.decode(reader);
                                continue;
                            case 14:
                                validateOrderInsufficientAccountValueDetailsDecode = ValidateOrderInsufficientAccountValueDetails.ADAPTER.decode(reader);
                                continue;
                            case 15:
                                validateOrderMaxPositionDetailsDecode = ValidateOrderMaxPositionDetails.ADAPTER.decode(reader);
                                continue;
                            case 16:
                                validateOrderMarginMinEquityDetailsDecode = ValidateOrderMarginMinEquityDetails.ADAPTER.decode(reader);
                                continue;
                            case 17:
                                validateOrderNoShortsDetailsDecode = ValidateOrderNoShortsDetails.ADAPTER.decode(reader);
                                continue;
                            case 18:
                                validateOrderInstantFraudDetailsDecode = ValidateOrderInstantFraudDetails.ADAPTER.decode(reader);
                                continue;
                            case 19:
                                validateOrderSenderLocationDetailsDecode = ValidateOrderSenderLocationDetails.ADAPTER.decode(reader);
                                continue;
                            case 20:
                                validateOrderUneconomicalPriceDetailsDecode = ValidateOrderUneconomicalPriceDetails.ADAPTER.decode(reader);
                                continue;
                            case 21:
                                validateOrderNoReversalsDetailsDecode = ValidateOrderNoReversalsDetails.ADAPTER.decode(reader);
                                continue;
                            case 22:
                                validateOrderInvalidPriceDetailsDecode = ValidateOrderInvalidPriceDetails.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                validateOrderSuccessDetails = validateOrderSuccessDetailsDecode;
                                validateOrderInsufficientBPDetails = validateOrderInsufficientBPDetailsDecode;
                                validateOrderInsufficientAccountValueDetails = validateOrderInsufficientAccountValueDetailsDecode;
                                break;
                        }
                        validateOrderSuccessDetailsDecode = validateOrderSuccessDetails;
                        validateOrderInsufficientAccountValueDetailsDecode = validateOrderInsufficientAccountValueDetails;
                        validateOrderInsufficientBPDetailsDecode = validateOrderInsufficientBPDetails;
                    } else {
                        return new ValidateOrderResponse(validateOrderResultDecode, validateOrderSuccessDetailsDecode, validateOrderInsufficientBPDetailsDecode, validateOrderInsufficientAccountValueDetailsDecode, validateOrderSuitabilityDetailsDecode, validateOrderInvalidTickDetailsDecode, validateOrderMissingPriceDetailsDecode, validateOrderNonpositiveQuantityDetailsDecode, validateOrderMaxOrderQuantityDetailsDecode, validateOrderGTCMarketOrderDetailsDecode, validateOrderTradabilityDetailsDecode, validateOrderAccountPCODetailsDecode, validateOrderInstrumentPCODetailsDecode, validateOrderMaxPositionDetailsDecode, validateOrderMarginMinEquityDetailsDecode, validateOrderNoShortsDetailsDecode, validateOrderInstantFraudDetailsDecode, validateOrderSenderLocationDetailsDecode, validateOrderUneconomicalPriceDetailsDecode, validateOrderNoReversalsDetailsDecode, validateOrderInvalidPriceDetailsDecode, validateOrderGenericDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidateOrderResponse redact(ValidateOrderResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ValidateOrderSuccessDetails success = value.getSuccess();
                ValidateOrderSuccessDetails validateOrderSuccessDetailsRedact = success != null ? ValidateOrderSuccessDetails.ADAPTER.redact(success) : null;
                ValidateOrderInsufficientBPDetails insufficient_bp = value.getInsufficient_bp();
                ValidateOrderInsufficientBPDetails validateOrderInsufficientBPDetailsRedact = insufficient_bp != null ? ValidateOrderInsufficientBPDetails.ADAPTER.redact(insufficient_bp) : null;
                ValidateOrderInsufficientAccountValueDetails insufficient_account_value = value.getInsufficient_account_value();
                ValidateOrderInsufficientAccountValueDetails validateOrderInsufficientAccountValueDetailsRedact = insufficient_account_value != null ? ValidateOrderInsufficientAccountValueDetails.ADAPTER.redact(insufficient_account_value) : null;
                ValidateOrderSuitabilityDetails suitability = value.getSuitability();
                ValidateOrderSuitabilityDetails validateOrderSuitabilityDetailsRedact = suitability != null ? ValidateOrderSuitabilityDetails.ADAPTER.redact(suitability) : null;
                ValidateOrderInvalidTickDetails invalid_tick = value.getInvalid_tick();
                ValidateOrderInvalidTickDetails validateOrderInvalidTickDetailsRedact = invalid_tick != null ? ValidateOrderInvalidTickDetails.ADAPTER.redact(invalid_tick) : null;
                ValidateOrderMissingPriceDetails missing_price = value.getMissing_price();
                ValidateOrderMissingPriceDetails validateOrderMissingPriceDetailsRedact = missing_price != null ? ValidateOrderMissingPriceDetails.ADAPTER.redact(missing_price) : null;
                ValidateOrderNonpositiveQuantityDetails nonpositive_quantity = value.getNonpositive_quantity();
                ValidateOrderNonpositiveQuantityDetails validateOrderNonpositiveQuantityDetailsRedact = nonpositive_quantity != null ? ValidateOrderNonpositiveQuantityDetails.ADAPTER.redact(nonpositive_quantity) : null;
                ValidateOrderMaxOrderQuantityDetails max_order_quantity = value.getMax_order_quantity();
                ValidateOrderMaxOrderQuantityDetails validateOrderMaxOrderQuantityDetailsRedact = max_order_quantity != null ? ValidateOrderMaxOrderQuantityDetails.ADAPTER.redact(max_order_quantity) : null;
                ValidateOrderGTCMarketOrderDetails gtc_market_order = value.getGtc_market_order();
                ValidateOrderGTCMarketOrderDetails validateOrderGTCMarketOrderDetailsRedact = gtc_market_order != null ? ValidateOrderGTCMarketOrderDetails.ADAPTER.redact(gtc_market_order) : null;
                ValidateOrderTradabilityDetails tradability = value.getTradability();
                ValidateOrderTradabilityDetails validateOrderTradabilityDetailsRedact = tradability != null ? ValidateOrderTradabilityDetails.ADAPTER.redact(tradability) : null;
                ValidateOrderAccountPCODetails account_pco = value.getAccount_pco();
                ValidateOrderAccountPCODetails validateOrderAccountPCODetailsRedact = account_pco != null ? ValidateOrderAccountPCODetails.ADAPTER.redact(account_pco) : null;
                ValidateOrderInstrumentPCODetails instrument_pco = value.getInstrument_pco();
                ValidateOrderInstrumentPCODetails validateOrderInstrumentPCODetailsRedact = instrument_pco != null ? ValidateOrderInstrumentPCODetails.ADAPTER.redact(instrument_pco) : null;
                ValidateOrderMaxPositionDetails max_position = value.getMax_position();
                ValidateOrderMaxPositionDetails validateOrderMaxPositionDetailsRedact = max_position != null ? ValidateOrderMaxPositionDetails.ADAPTER.redact(max_position) : null;
                ValidateOrderMarginMinEquityDetails margin_min_equity = value.getMargin_min_equity();
                ValidateOrderMarginMinEquityDetails validateOrderMarginMinEquityDetailsRedact = margin_min_equity != null ? ValidateOrderMarginMinEquityDetails.ADAPTER.redact(margin_min_equity) : null;
                ValidateOrderNoShortsDetails no_shorts = value.getNo_shorts();
                ValidateOrderMarginMinEquityDetails validateOrderMarginMinEquityDetails = validateOrderMarginMinEquityDetailsRedact;
                ValidateOrderNoShortsDetails validateOrderNoShortsDetailsRedact = no_shorts != null ? ValidateOrderNoShortsDetails.ADAPTER.redact(no_shorts) : null;
                ValidateOrderInstantFraudDetails instant_fraud = value.getInstant_fraud();
                ValidateOrderNoShortsDetails validateOrderNoShortsDetails = validateOrderNoShortsDetailsRedact;
                ValidateOrderInstantFraudDetails validateOrderInstantFraudDetailsRedact = instant_fraud != null ? ValidateOrderInstantFraudDetails.ADAPTER.redact(instant_fraud) : null;
                ValidateOrderSenderLocationDetails sender_location = value.getSender_location();
                ValidateOrderInstantFraudDetails validateOrderInstantFraudDetails = validateOrderInstantFraudDetailsRedact;
                ValidateOrderSenderLocationDetails validateOrderSenderLocationDetailsRedact = sender_location != null ? ValidateOrderSenderLocationDetails.ADAPTER.redact(sender_location) : null;
                ValidateOrderUneconomicalPriceDetails uneconomical_price = value.getUneconomical_price();
                ValidateOrderSenderLocationDetails validateOrderSenderLocationDetails = validateOrderSenderLocationDetailsRedact;
                ValidateOrderUneconomicalPriceDetails validateOrderUneconomicalPriceDetailsRedact = uneconomical_price != null ? ValidateOrderUneconomicalPriceDetails.ADAPTER.redact(uneconomical_price) : null;
                ValidateOrderNoReversalsDetails no_reversals = value.getNo_reversals();
                ValidateOrderUneconomicalPriceDetails validateOrderUneconomicalPriceDetails = validateOrderUneconomicalPriceDetailsRedact;
                ValidateOrderNoReversalsDetails validateOrderNoReversalsDetailsRedact = no_reversals != null ? ValidateOrderNoReversalsDetails.ADAPTER.redact(no_reversals) : null;
                ValidateOrderInvalidPriceDetails invalid_price = value.getInvalid_price();
                ValidateOrderNoReversalsDetails validateOrderNoReversalsDetails = validateOrderNoReversalsDetailsRedact;
                ValidateOrderInvalidPriceDetails validateOrderInvalidPriceDetailsRedact = invalid_price != null ? ValidateOrderInvalidPriceDetails.ADAPTER.redact(invalid_price) : null;
                ValidateOrderGenericDetails generic = value.getGeneric();
                return value.copy((1 & 1) != 0 ? value.result : null, (1 & 2) != 0 ? value.success : validateOrderSuccessDetailsRedact, (1 & 4) != 0 ? value.insufficient_bp : validateOrderInsufficientBPDetailsRedact, (1 & 8) != 0 ? value.insufficient_account_value : validateOrderInsufficientAccountValueDetailsRedact, (1 & 16) != 0 ? value.suitability : validateOrderSuitabilityDetailsRedact, (1 & 32) != 0 ? value.invalid_tick : validateOrderInvalidTickDetailsRedact, (1 & 64) != 0 ? value.missing_price : validateOrderMissingPriceDetailsRedact, (1 & 128) != 0 ? value.nonpositive_quantity : validateOrderNonpositiveQuantityDetailsRedact, (1 & 256) != 0 ? value.max_order_quantity : validateOrderMaxOrderQuantityDetailsRedact, (1 & 512) != 0 ? value.gtc_market_order : validateOrderGTCMarketOrderDetailsRedact, (1 & 1024) != 0 ? value.tradability : validateOrderTradabilityDetailsRedact, (1 & 2048) != 0 ? value.account_pco : validateOrderAccountPCODetailsRedact, (1 & 4096) != 0 ? value.instrument_pco : validateOrderInstrumentPCODetailsRedact, (1 & 8192) != 0 ? value.max_position : validateOrderMaxPositionDetailsRedact, (1 & 16384) != 0 ? value.margin_min_equity : validateOrderMarginMinEquityDetails, (1 & 32768) != 0 ? value.no_shorts : validateOrderNoShortsDetails, (1 & 65536) != 0 ? value.instant_fraud : validateOrderInstantFraudDetails, (1 & 131072) != 0 ? value.sender_location : validateOrderSenderLocationDetails, (1 & 262144) != 0 ? value.uneconomical_price : validateOrderUneconomicalPriceDetails, (1 & 524288) != 0 ? value.no_reversals : validateOrderNoReversalsDetails, (1 & 1048576) != 0 ? value.invalid_price : validateOrderInvalidPriceDetailsRedact, (1 & 2097152) != 0 ? value.generic : generic != null ? ValidateOrderGenericDetails.ADAPTER.redact(generic) : null, (1 & 4194304) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

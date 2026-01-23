package com.robinhood.rosetta.mainst;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.ledger.trade.TradeType;
import rosetta.mainst.PutCallCode;
import rosetta.mainst.Route;
import rosetta.mainst.Side;

/* compiled from: PinnacleExecutionDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001aBç\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020\u0004\u0012\b\b\u0002\u0010&\u001a\u00020\u0004\u0012\b\b\u0002\u0010'\u001a\u00020\u000f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010,\u001a\u00020-¢\u0006\u0004\b.\u0010/J\b\u0010Y\u001a\u00020\u0002H\u0017J\u0013\u0010Z\u001a\u00020$2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0096\u0002J\b\u0010]\u001a\u00020^H\u0016J\b\u0010_\u001a\u00020\u0004H\u0016Jæ\u0002\u0010`\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u000f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010,\u001a\u00020-R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00101R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00101R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00101R\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00101R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00103R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010>R\u0016\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00101R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010>R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010>R\u0016\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0016\u0010\u001f\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0016\u0010!\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0016\u0010#\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0016\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u00101R\u0016\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00101R\u0016\u0010'\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010<R\u0018\u0010(\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010>R\u0018\u0010)\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010>R\u0018\u0010*\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010>R\u0018\u0010+\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010>¨\u0006b"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleExecutionDetails;", "Lcom/squareup/wire/Message;", "", "type", "", "timestamp", "Lcom/robinhood/rosetta/mainst/Time;", "execution_id", "Lcom/robinhood/rosetta/mainst/UUID;", "order_id", "venue_execution_id", "contra_broker", "instrument_id", "symbol", "side", "Lrosetta/mainst/Side;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/mainst/Decimal;", "quantity", "rounded_notional", "trade_date", "settlement_date", "broken_at", "commission", "leg_id", "correction_details", "Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetails;", "sec_fee", "taf_fee", PlaceTypes.ROUTE, "Lrosetta/mainst/Route;", "put_call_code", "Lrosetta/mainst/PutCallCode;", "trade_type", "Lrosetta/ledger/trade/TradeType;", "executed_on_exchange", "", "offset_account", "trailer", "firm_side", "or_fee", "occ_fee", "non_denominated_currency_traded", "fx_fee_in_bps", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/UUID;Ljava/lang/String;Lrosetta/mainst/Side;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Decimal;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetails;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/Route;Lrosetta/mainst/PutCallCode;Lrosetta/ledger/trade/TradeType;ZLjava/lang/String;Ljava/lang/String;Lrosetta/mainst/Side;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lokio/ByteString;)V", "getType", "()Ljava/lang/String;", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/Time;", "getExecution_id", "()Lcom/robinhood/rosetta/mainst/UUID;", "getOrder_id", "getVenue_execution_id", "getContra_broker", "getInstrument_id", "getSymbol", "getSide", "()Lrosetta/mainst/Side;", "getPrice", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getQuantity", "getRounded_notional", "getTrade_date", "getSettlement_date", "getBroken_at", "getCommission", "getLeg_id", "getCorrection_details", "()Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetails;", "getSec_fee", "getTaf_fee", "getRoute", "()Lrosetta/mainst/Route;", "getPut_call_code", "()Lrosetta/mainst/PutCallCode;", "getTrade_type", "()Lrosetta/ledger/trade/TradeType;", "getExecuted_on_exchange", "()Z", "getOffset_account", "getTrailer", "getFirm_side", "getOr_fee", "getOcc_fee", "getNon_denominated_currency_traded", "getFx_fee_in_bps", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PinnacleExecutionDetails extends Message {

    @JvmField
    public static final ProtoAdapter<PinnacleExecutionDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "brokenAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final Time broken_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final Decimal commission;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contraBroker", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String contra_broker;

    @WireField(adapter = "com.robinhood.rosetta.mainst.PinnacleCorrectionDetails#ADAPTER", jsonName = "correctionDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final PinnacleCorrectionDetails correction_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "executedOnExchange", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final boolean executed_on_exchange;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "executionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final UUID execution_id;

    @WireField(adapter = "rosetta.mainst.Side#ADAPTER", jsonName = "firmSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 27)
    private final Side firm_side;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "fxFeeInBps", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 30, tag = 31)
    private final Decimal fx_fee_in_bps;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final UUID instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "legId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final String leg_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "nonDenominatedCurrencyTraded", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 30)
    private final Decimal non_denominated_currency_traded;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "occFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 29)
    private final Decimal occ_fee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "offsetAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final String offset_account;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "orFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 28)
    private final Decimal or_fee;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final UUID order_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Decimal price;

    @WireField(adapter = "rosetta.mainst.PutCallCode#ADAPTER", jsonName = "putCallCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final PutCallCode put_call_code;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Decimal quantity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "roundedNotional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Decimal rounded_notional;

    @WireField(adapter = "rosetta.mainst.Route#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final Route route;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "secFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final Decimal sec_fee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "settlementDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String settlement_date;

    @WireField(adapter = "rosetta.mainst.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Side side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String symbol;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "tafFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final Decimal taf_fee;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Time timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tradeDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String trade_date;

    @WireField(adapter = "rosetta.ledger.trade.TradeType#ADAPTER", jsonName = "tradeType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final TradeType trade_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 26)
    private final String trailer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "venueExecutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String venue_execution_id;

    public PinnacleExecutionDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, -1, null);
    }

    public /* synthetic */ PinnacleExecutionDetails(String str, Time time, UUID uuid, UUID uuid2, String str2, String str3, UUID uuid3, String str4, Side side, Decimal decimal, Decimal decimal2, Decimal decimal3, String str5, String str6, Time time2, Decimal decimal4, String str7, PinnacleCorrectionDetails pinnacleCorrectionDetails, Decimal decimal5, Decimal decimal6, Route route, PutCallCode putCallCode, TradeType tradeType, boolean z, String str8, String str9, Side side2, Decimal decimal7, Decimal decimal8, Decimal decimal9, Decimal decimal10, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : time, (i & 4) != 0 ? null : uuid, (i & 8) != 0 ? null : uuid2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? null : uuid3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 512) != 0 ? null : decimal, (i & 1024) != 0 ? null : decimal2, (i & 2048) != 0 ? null : decimal3, (i & 4096) != 0 ? "" : str5, (i & 8192) != 0 ? "" : str6, (i & 16384) != 0 ? null : time2, (i & 32768) != 0 ? null : decimal4, (i & 65536) != 0 ? "" : str7, (i & 131072) != 0 ? null : pinnacleCorrectionDetails, (i & 262144) != 0 ? null : decimal5, (i & 524288) != 0 ? null : decimal6, (i & 1048576) != 0 ? Route.ROUTE_UNSPECIFIED : route, (i & 2097152) != 0 ? PutCallCode.PUT_CALL_CODE_UNSPECIFIED : putCallCode, (i & 4194304) != 0 ? TradeType.TRADE_TYPE_UNSPECIFIED : tradeType, (i & 8388608) != 0 ? false : z, (i & 16777216) != 0 ? "" : str8, (i & 33554432) == 0 ? str9 : "", (i & 67108864) != 0 ? Side.SIDE_UNSPECIFIED : side2, (i & 134217728) != 0 ? null : decimal7, (i & 268435456) != 0 ? null : decimal8, (i & 536870912) != 0 ? null : decimal9, (i & 1073741824) != 0 ? null : decimal10, (i & Integer.MIN_VALUE) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24697newBuilder();
    }

    public final String getType() {
        return this.type;
    }

    public final Time getTimestamp() {
        return this.timestamp;
    }

    public final UUID getExecution_id() {
        return this.execution_id;
    }

    public final UUID getOrder_id() {
        return this.order_id;
    }

    public final String getVenue_execution_id() {
        return this.venue_execution_id;
    }

    public final String getContra_broker() {
        return this.contra_broker;
    }

    public final UUID getInstrument_id() {
        return this.instrument_id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final Side getSide() {
        return this.side;
    }

    public final Decimal getPrice() {
        return this.price;
    }

    public final Decimal getQuantity() {
        return this.quantity;
    }

    public final Decimal getRounded_notional() {
        return this.rounded_notional;
    }

    public final String getTrade_date() {
        return this.trade_date;
    }

    public final String getSettlement_date() {
        return this.settlement_date;
    }

    public final Time getBroken_at() {
        return this.broken_at;
    }

    public final Decimal getCommission() {
        return this.commission;
    }

    public final String getLeg_id() {
        return this.leg_id;
    }

    public final PinnacleCorrectionDetails getCorrection_details() {
        return this.correction_details;
    }

    public final Decimal getSec_fee() {
        return this.sec_fee;
    }

    public final Decimal getTaf_fee() {
        return this.taf_fee;
    }

    public final Route getRoute() {
        return this.route;
    }

    public final PutCallCode getPut_call_code() {
        return this.put_call_code;
    }

    public final TradeType getTrade_type() {
        return this.trade_type;
    }

    public final boolean getExecuted_on_exchange() {
        return this.executed_on_exchange;
    }

    public final String getOffset_account() {
        return this.offset_account;
    }

    public final String getTrailer() {
        return this.trailer;
    }

    public final Side getFirm_side() {
        return this.firm_side;
    }

    public final Decimal getOr_fee() {
        return this.or_fee;
    }

    public final Decimal getOcc_fee() {
        return this.occ_fee;
    }

    public final Decimal getNon_denominated_currency_traded() {
        return this.non_denominated_currency_traded;
    }

    public final Decimal getFx_fee_in_bps() {
        return this.fx_fee_in_bps;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnacleExecutionDetails(String type2, Time time, UUID uuid, UUID uuid2, String venue_execution_id, String contra_broker, UUID uuid3, String symbol, Side side, Decimal decimal, Decimal decimal2, Decimal decimal3, String trade_date, String settlement_date, Time time2, Decimal decimal4, String leg_id, PinnacleCorrectionDetails pinnacleCorrectionDetails, Decimal decimal5, Decimal decimal6, Route route, PutCallCode put_call_code, TradeType trade_type, boolean z, String offset_account, String trailer, Side firm_side, Decimal decimal7, Decimal decimal8, Decimal decimal9, Decimal decimal10, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(venue_execution_id, "venue_execution_id");
        Intrinsics.checkNotNullParameter(contra_broker, "contra_broker");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(trade_date, "trade_date");
        Intrinsics.checkNotNullParameter(settlement_date, "settlement_date");
        Intrinsics.checkNotNullParameter(leg_id, "leg_id");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(trade_type, "trade_type");
        Intrinsics.checkNotNullParameter(offset_account, "offset_account");
        Intrinsics.checkNotNullParameter(trailer, "trailer");
        Intrinsics.checkNotNullParameter(firm_side, "firm_side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.timestamp = time;
        this.execution_id = uuid;
        this.order_id = uuid2;
        this.venue_execution_id = venue_execution_id;
        this.contra_broker = contra_broker;
        this.instrument_id = uuid3;
        this.symbol = symbol;
        this.side = side;
        this.price = decimal;
        this.quantity = decimal2;
        this.rounded_notional = decimal3;
        this.trade_date = trade_date;
        this.settlement_date = settlement_date;
        this.broken_at = time2;
        this.commission = decimal4;
        this.leg_id = leg_id;
        this.correction_details = pinnacleCorrectionDetails;
        this.sec_fee = decimal5;
        this.taf_fee = decimal6;
        this.route = route;
        this.put_call_code = put_call_code;
        this.trade_type = trade_type;
        this.executed_on_exchange = z;
        this.offset_account = offset_account;
        this.trailer = trailer;
        this.firm_side = firm_side;
        this.or_fee = decimal7;
        this.occ_fee = decimal8;
        this.non_denominated_currency_traded = decimal9;
        this.fx_fee_in_bps = decimal10;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24697newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PinnacleExecutionDetails)) {
            return false;
        }
        PinnacleExecutionDetails pinnacleExecutionDetails = (PinnacleExecutionDetails) other;
        return Intrinsics.areEqual(unknownFields(), pinnacleExecutionDetails.unknownFields()) && Intrinsics.areEqual(this.type, pinnacleExecutionDetails.type) && Intrinsics.areEqual(this.timestamp, pinnacleExecutionDetails.timestamp) && Intrinsics.areEqual(this.execution_id, pinnacleExecutionDetails.execution_id) && Intrinsics.areEqual(this.order_id, pinnacleExecutionDetails.order_id) && Intrinsics.areEqual(this.venue_execution_id, pinnacleExecutionDetails.venue_execution_id) && Intrinsics.areEqual(this.contra_broker, pinnacleExecutionDetails.contra_broker) && Intrinsics.areEqual(this.instrument_id, pinnacleExecutionDetails.instrument_id) && Intrinsics.areEqual(this.symbol, pinnacleExecutionDetails.symbol) && this.side == pinnacleExecutionDetails.side && Intrinsics.areEqual(this.price, pinnacleExecutionDetails.price) && Intrinsics.areEqual(this.quantity, pinnacleExecutionDetails.quantity) && Intrinsics.areEqual(this.rounded_notional, pinnacleExecutionDetails.rounded_notional) && Intrinsics.areEqual(this.trade_date, pinnacleExecutionDetails.trade_date) && Intrinsics.areEqual(this.settlement_date, pinnacleExecutionDetails.settlement_date) && Intrinsics.areEqual(this.broken_at, pinnacleExecutionDetails.broken_at) && Intrinsics.areEqual(this.commission, pinnacleExecutionDetails.commission) && Intrinsics.areEqual(this.leg_id, pinnacleExecutionDetails.leg_id) && Intrinsics.areEqual(this.correction_details, pinnacleExecutionDetails.correction_details) && Intrinsics.areEqual(this.sec_fee, pinnacleExecutionDetails.sec_fee) && Intrinsics.areEqual(this.taf_fee, pinnacleExecutionDetails.taf_fee) && this.route == pinnacleExecutionDetails.route && this.put_call_code == pinnacleExecutionDetails.put_call_code && this.trade_type == pinnacleExecutionDetails.trade_type && this.executed_on_exchange == pinnacleExecutionDetails.executed_on_exchange && Intrinsics.areEqual(this.offset_account, pinnacleExecutionDetails.offset_account) && Intrinsics.areEqual(this.trailer, pinnacleExecutionDetails.trailer) && this.firm_side == pinnacleExecutionDetails.firm_side && Intrinsics.areEqual(this.or_fee, pinnacleExecutionDetails.or_fee) && Intrinsics.areEqual(this.occ_fee, pinnacleExecutionDetails.occ_fee) && Intrinsics.areEqual(this.non_denominated_currency_traded, pinnacleExecutionDetails.non_denominated_currency_traded) && Intrinsics.areEqual(this.fx_fee_in_bps, pinnacleExecutionDetails.fx_fee_in_bps);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37;
        Time time = this.timestamp;
        int iHashCode2 = (iHashCode + (time != null ? time.hashCode() : 0)) * 37;
        UUID uuid = this.execution_id;
        int iHashCode3 = (iHashCode2 + (uuid != null ? uuid.hashCode() : 0)) * 37;
        UUID uuid2 = this.order_id;
        int iHashCode4 = (((((iHashCode3 + (uuid2 != null ? uuid2.hashCode() : 0)) * 37) + this.venue_execution_id.hashCode()) * 37) + this.contra_broker.hashCode()) * 37;
        UUID uuid3 = this.instrument_id;
        int iHashCode5 = (((((iHashCode4 + (uuid3 != null ? uuid3.hashCode() : 0)) * 37) + this.symbol.hashCode()) * 37) + this.side.hashCode()) * 37;
        Decimal decimal = this.price;
        int iHashCode6 = (iHashCode5 + (decimal != null ? decimal.hashCode() : 0)) * 37;
        Decimal decimal2 = this.quantity;
        int iHashCode7 = (iHashCode6 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        Decimal decimal3 = this.rounded_notional;
        int iHashCode8 = (((((iHashCode7 + (decimal3 != null ? decimal3.hashCode() : 0)) * 37) + this.trade_date.hashCode()) * 37) + this.settlement_date.hashCode()) * 37;
        Time time2 = this.broken_at;
        int iHashCode9 = (iHashCode8 + (time2 != null ? time2.hashCode() : 0)) * 37;
        Decimal decimal4 = this.commission;
        int iHashCode10 = (((iHashCode9 + (decimal4 != null ? decimal4.hashCode() : 0)) * 37) + this.leg_id.hashCode()) * 37;
        PinnacleCorrectionDetails pinnacleCorrectionDetails = this.correction_details;
        int iHashCode11 = (iHashCode10 + (pinnacleCorrectionDetails != null ? pinnacleCorrectionDetails.hashCode() : 0)) * 37;
        Decimal decimal5 = this.sec_fee;
        int iHashCode12 = (iHashCode11 + (decimal5 != null ? decimal5.hashCode() : 0)) * 37;
        Decimal decimal6 = this.taf_fee;
        int iHashCode13 = (((((((((((((((iHashCode12 + (decimal6 != null ? decimal6.hashCode() : 0)) * 37) + this.route.hashCode()) * 37) + this.put_call_code.hashCode()) * 37) + this.trade_type.hashCode()) * 37) + Boolean.hashCode(this.executed_on_exchange)) * 37) + this.offset_account.hashCode()) * 37) + this.trailer.hashCode()) * 37) + this.firm_side.hashCode()) * 37;
        Decimal decimal7 = this.or_fee;
        int iHashCode14 = (iHashCode13 + (decimal7 != null ? decimal7.hashCode() : 0)) * 37;
        Decimal decimal8 = this.occ_fee;
        int iHashCode15 = (iHashCode14 + (decimal8 != null ? decimal8.hashCode() : 0)) * 37;
        Decimal decimal9 = this.non_denominated_currency_traded;
        int iHashCode16 = (iHashCode15 + (decimal9 != null ? decimal9.hashCode() : 0)) * 37;
        Decimal decimal10 = this.fx_fee_in_bps;
        int iHashCode17 = iHashCode16 + (decimal10 != null ? decimal10.hashCode() : 0);
        this.hashCode = iHashCode17;
        return iHashCode17;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + Internal.sanitize(this.type));
        Time time = this.timestamp;
        if (time != null) {
            arrayList.add("timestamp=" + time);
        }
        UUID uuid = this.execution_id;
        if (uuid != null) {
            arrayList.add("execution_id=" + uuid);
        }
        UUID uuid2 = this.order_id;
        if (uuid2 != null) {
            arrayList.add("order_id=" + uuid2);
        }
        arrayList.add("venue_execution_id=" + Internal.sanitize(this.venue_execution_id));
        arrayList.add("contra_broker=" + Internal.sanitize(this.contra_broker));
        UUID uuid3 = this.instrument_id;
        if (uuid3 != null) {
            arrayList.add("instrument_id=" + uuid3);
        }
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("side=" + this.side);
        Decimal decimal = this.price;
        if (decimal != null) {
            arrayList.add("price=" + decimal);
        }
        Decimal decimal2 = this.quantity;
        if (decimal2 != null) {
            arrayList.add("quantity=" + decimal2);
        }
        Decimal decimal3 = this.rounded_notional;
        if (decimal3 != null) {
            arrayList.add("rounded_notional=" + decimal3);
        }
        arrayList.add("trade_date=" + Internal.sanitize(this.trade_date));
        arrayList.add("settlement_date=" + Internal.sanitize(this.settlement_date));
        Time time2 = this.broken_at;
        if (time2 != null) {
            arrayList.add("broken_at=" + time2);
        }
        Decimal decimal4 = this.commission;
        if (decimal4 != null) {
            arrayList.add("commission=" + decimal4);
        }
        arrayList.add("leg_id=" + Internal.sanitize(this.leg_id));
        PinnacleCorrectionDetails pinnacleCorrectionDetails = this.correction_details;
        if (pinnacleCorrectionDetails != null) {
            arrayList.add("correction_details=" + pinnacleCorrectionDetails);
        }
        Decimal decimal5 = this.sec_fee;
        if (decimal5 != null) {
            arrayList.add("sec_fee=" + decimal5);
        }
        Decimal decimal6 = this.taf_fee;
        if (decimal6 != null) {
            arrayList.add("taf_fee=" + decimal6);
        }
        arrayList.add("route=" + this.route);
        arrayList.add("put_call_code=" + this.put_call_code);
        arrayList.add("trade_type=" + this.trade_type);
        arrayList.add("executed_on_exchange=" + this.executed_on_exchange);
        arrayList.add("offset_account=" + Internal.sanitize(this.offset_account));
        arrayList.add("trailer=" + Internal.sanitize(this.trailer));
        arrayList.add("firm_side=" + this.firm_side);
        Decimal decimal7 = this.or_fee;
        if (decimal7 != null) {
            arrayList.add("or_fee=" + decimal7);
        }
        Decimal decimal8 = this.occ_fee;
        if (decimal8 != null) {
            arrayList.add("occ_fee=" + decimal8);
        }
        Decimal decimal9 = this.non_denominated_currency_traded;
        if (decimal9 != null) {
            arrayList.add("non_denominated_currency_traded=" + decimal9);
        }
        Decimal decimal10 = this.fx_fee_in_bps;
        if (decimal10 != null) {
            arrayList.add("fx_fee_in_bps=" + decimal10);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PinnacleExecutionDetails{", "}", 0, null, null, 56, null);
    }

    public final PinnacleExecutionDetails copy(String type2, Time timestamp, UUID execution_id, UUID order_id, String venue_execution_id, String contra_broker, UUID instrument_id, String symbol, Side side, Decimal price, Decimal quantity, Decimal rounded_notional, String trade_date, String settlement_date, Time broken_at, Decimal commission, String leg_id, PinnacleCorrectionDetails correction_details, Decimal sec_fee, Decimal taf_fee, Route route, PutCallCode put_call_code, TradeType trade_type, boolean executed_on_exchange, String offset_account, String trailer, Side firm_side, Decimal or_fee, Decimal occ_fee, Decimal non_denominated_currency_traded, Decimal fx_fee_in_bps, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(venue_execution_id, "venue_execution_id");
        Intrinsics.checkNotNullParameter(contra_broker, "contra_broker");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(trade_date, "trade_date");
        Intrinsics.checkNotNullParameter(settlement_date, "settlement_date");
        Intrinsics.checkNotNullParameter(leg_id, "leg_id");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(trade_type, "trade_type");
        Intrinsics.checkNotNullParameter(offset_account, "offset_account");
        Intrinsics.checkNotNullParameter(trailer, "trailer");
        Intrinsics.checkNotNullParameter(firm_side, "firm_side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PinnacleExecutionDetails(type2, timestamp, execution_id, order_id, venue_execution_id, contra_broker, instrument_id, symbol, side, price, quantity, rounded_notional, trade_date, settlement_date, broken_at, commission, leg_id, correction_details, sec_fee, taf_fee, route, put_call_code, trade_type, executed_on_exchange, offset_account, trailer, firm_side, or_fee, occ_fee, non_denominated_currency_traded, fx_fee_in_bps, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PinnacleExecutionDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PinnacleExecutionDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.PinnacleExecutionDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PinnacleExecutionDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getType());
                }
                if (value.getTimestamp() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (value.getExecution_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(3, value.getExecution_id());
                }
                if (value.getOrder_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(4, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getVenue_execution_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getVenue_execution_id());
                }
                if (!Intrinsics.areEqual(value.getContra_broker(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getContra_broker());
                }
                if (value.getInstrument_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(7, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getSymbol());
                }
                Side side = value.getSide();
                Side side2 = Side.SIDE_UNSPECIFIED;
                if (side != side2) {
                    size += Side.ADAPTER.encodedSizeWithTag(9, value.getSide());
                }
                if (value.getPrice() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(10, value.getPrice());
                }
                if (value.getQuantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(11, value.getQuantity());
                }
                if (value.getRounded_notional() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(12, value.getRounded_notional());
                }
                if (!Intrinsics.areEqual(value.getTrade_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getTrade_date());
                }
                if (!Intrinsics.areEqual(value.getSettlement_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getSettlement_date());
                }
                if (value.getBroken_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(15, value.getBroken_at());
                }
                if (value.getCommission() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(16, value.getCommission());
                }
                if (!Intrinsics.areEqual(value.getLeg_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(17, value.getLeg_id());
                }
                if (value.getCorrection_details() != null) {
                    size += PinnacleCorrectionDetails.ADAPTER.encodedSizeWithTag(18, value.getCorrection_details());
                }
                if (value.getSec_fee() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(19, value.getSec_fee());
                }
                if (value.getTaf_fee() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(20, value.getTaf_fee());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    size += Route.ADAPTER.encodedSizeWithTag(21, value.getRoute());
                }
                if (value.getPut_call_code() != PutCallCode.PUT_CALL_CODE_UNSPECIFIED) {
                    size += PutCallCode.ADAPTER.encodedSizeWithTag(22, value.getPut_call_code());
                }
                if (value.getTrade_type() != TradeType.TRADE_TYPE_UNSPECIFIED) {
                    size += TradeType.ADAPTER.encodedSizeWithTag(23, value.getTrade_type());
                }
                if (value.getExecuted_on_exchange()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(24, Boolean.valueOf(value.getExecuted_on_exchange()));
                }
                if (!Intrinsics.areEqual(value.getOffset_account(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(25, value.getOffset_account());
                }
                if (!Intrinsics.areEqual(value.getTrailer(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(26, value.getTrailer());
                }
                if (value.getFirm_side() != side2) {
                    size += Side.ADAPTER.encodedSizeWithTag(27, value.getFirm_side());
                }
                if (value.getOr_fee() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(28, value.getOr_fee());
                }
                if (value.getOcc_fee() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(29, value.getOcc_fee());
                }
                if (value.getNon_denominated_currency_traded() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(30, value.getNon_denominated_currency_traded());
                }
                return value.getFx_fee_in_bps() != null ? size + Decimal.ADAPTER.encodedSizeWithTag(31, value.getFx_fee_in_bps()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PinnacleExecutionDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (value.getTimestamp() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (value.getExecution_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 3, (int) value.getExecution_id());
                }
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getVenue_execution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getVenue_execution_id());
                }
                if (!Intrinsics.areEqual(value.getContra_broker(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getContra_broker());
                }
                if (value.getInstrument_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 7, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getSymbol());
                }
                Side side = value.getSide();
                Side side2 = Side.SIDE_UNSPECIFIED;
                if (side != side2) {
                    Side.ADAPTER.encodeWithTag(writer, 9, (int) value.getSide());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 10, (int) value.getPrice());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 11, (int) value.getQuantity());
                }
                if (value.getRounded_notional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 12, (int) value.getRounded_notional());
                }
                if (!Intrinsics.areEqual(value.getTrade_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getTrade_date());
                }
                if (!Intrinsics.areEqual(value.getSettlement_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getSettlement_date());
                }
                if (value.getBroken_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 15, (int) value.getBroken_at());
                }
                if (value.getCommission() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 16, (int) value.getCommission());
                }
                if (!Intrinsics.areEqual(value.getLeg_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getLeg_id());
                }
                if (value.getCorrection_details() != null) {
                    PinnacleCorrectionDetails.ADAPTER.encodeWithTag(writer, 18, (int) value.getCorrection_details());
                }
                if (value.getSec_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 19, (int) value.getSec_fee());
                }
                if (value.getTaf_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 20, (int) value.getTaf_fee());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 21, (int) value.getRoute());
                }
                if (value.getPut_call_code() != PutCallCode.PUT_CALL_CODE_UNSPECIFIED) {
                    PutCallCode.ADAPTER.encodeWithTag(writer, 22, (int) value.getPut_call_code());
                }
                if (value.getTrade_type() != TradeType.TRADE_TYPE_UNSPECIFIED) {
                    TradeType.ADAPTER.encodeWithTag(writer, 23, (int) value.getTrade_type());
                }
                if (value.getExecuted_on_exchange()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 24, (int) Boolean.valueOf(value.getExecuted_on_exchange()));
                }
                if (!Intrinsics.areEqual(value.getOffset_account(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 25, (int) value.getOffset_account());
                }
                if (!Intrinsics.areEqual(value.getTrailer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 26, (int) value.getTrailer());
                }
                if (value.getFirm_side() != side2) {
                    Side.ADAPTER.encodeWithTag(writer, 27, (int) value.getFirm_side());
                }
                if (value.getOr_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 28, (int) value.getOr_fee());
                }
                if (value.getOcc_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 29, (int) value.getOcc_fee());
                }
                if (value.getNon_denominated_currency_traded() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 30, (int) value.getNon_denominated_currency_traded());
                }
                if (value.getFx_fee_in_bps() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 31, (int) value.getFx_fee_in_bps());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PinnacleExecutionDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getFx_fee_in_bps() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 31, (int) value.getFx_fee_in_bps());
                }
                if (value.getNon_denominated_currency_traded() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 30, (int) value.getNon_denominated_currency_traded());
                }
                if (value.getOcc_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 29, (int) value.getOcc_fee());
                }
                if (value.getOr_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 28, (int) value.getOr_fee());
                }
                Side firm_side = value.getFirm_side();
                Side side = Side.SIDE_UNSPECIFIED;
                if (firm_side != side) {
                    Side.ADAPTER.encodeWithTag(writer, 27, (int) value.getFirm_side());
                }
                if (!Intrinsics.areEqual(value.getTrailer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 26, (int) value.getTrailer());
                }
                if (!Intrinsics.areEqual(value.getOffset_account(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 25, (int) value.getOffset_account());
                }
                if (value.getExecuted_on_exchange()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 24, (int) Boolean.valueOf(value.getExecuted_on_exchange()));
                }
                if (value.getTrade_type() != TradeType.TRADE_TYPE_UNSPECIFIED) {
                    TradeType.ADAPTER.encodeWithTag(writer, 23, (int) value.getTrade_type());
                }
                if (value.getPut_call_code() != PutCallCode.PUT_CALL_CODE_UNSPECIFIED) {
                    PutCallCode.ADAPTER.encodeWithTag(writer, 22, (int) value.getPut_call_code());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 21, (int) value.getRoute());
                }
                if (value.getTaf_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 20, (int) value.getTaf_fee());
                }
                if (value.getSec_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 19, (int) value.getSec_fee());
                }
                if (value.getCorrection_details() != null) {
                    PinnacleCorrectionDetails.ADAPTER.encodeWithTag(writer, 18, (int) value.getCorrection_details());
                }
                if (!Intrinsics.areEqual(value.getLeg_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getLeg_id());
                }
                if (value.getCommission() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 16, (int) value.getCommission());
                }
                if (value.getBroken_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 15, (int) value.getBroken_at());
                }
                if (!Intrinsics.areEqual(value.getSettlement_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getSettlement_date());
                }
                if (!Intrinsics.areEqual(value.getTrade_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getTrade_date());
                }
                if (value.getRounded_notional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 12, (int) value.getRounded_notional());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 11, (int) value.getQuantity());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 10, (int) value.getPrice());
                }
                if (value.getSide() != side) {
                    Side.ADAPTER.encodeWithTag(writer, 9, (int) value.getSide());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getSymbol());
                }
                if (value.getInstrument_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 7, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getContra_broker(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getContra_broker());
                }
                if (!Intrinsics.areEqual(value.getVenue_execution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getVenue_execution_id());
                }
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 4, (int) value.getOrder_id());
                }
                if (value.getExecution_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 3, (int) value.getExecution_id());
                }
                if (value.getTimestamp() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (Intrinsics.areEqual(value.getType(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getType());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PinnacleExecutionDetails decode(ProtoReader reader) throws IOException {
                Side side;
                PutCallCode putCallCode;
                TradeType tradeType;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Side side2 = Side.SIDE_UNSPECIFIED;
                Route route = Route.ROUTE_UNSPECIFIED;
                PutCallCode putCallCode2 = PutCallCode.PUT_CALL_CODE_UNSPECIFIED;
                TradeType tradeType2 = TradeType.TRADE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Side sideDecode = side2;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                Time timeDecode = null;
                UUID uuidDecode = null;
                UUID uuidDecode2 = null;
                UUID uuidDecode3 = null;
                Decimal decimalDecode = null;
                Decimal decimalDecode2 = null;
                Decimal decimalDecode3 = null;
                Time timeDecode2 = null;
                Decimal decimalDecode4 = null;
                PinnacleCorrectionDetails pinnacleCorrectionDetailsDecode = null;
                Decimal decimalDecode5 = null;
                Decimal decimalDecode6 = null;
                Decimal decimalDecode7 = null;
                Decimal decimalDecode8 = null;
                Decimal decimalDecode9 = null;
                Decimal decimalDecode10 = null;
                boolean zBooleanValue = false;
                PutCallCode putCallCodeDecode = putCallCode2;
                TradeType tradeTypeDecode = tradeType2;
                String strDecode9 = strDecode8;
                Side sideDecode2 = sideDecode;
                Route routeDecode = route;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                timeDecode = Time.ADAPTER.decode(reader);
                                break;
                            case 3:
                                uuidDecode = UUID.ADAPTER.decode(reader);
                                break;
                            case 4:
                                uuidDecode2 = UUID.ADAPTER.decode(reader);
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                uuidDecode3 = UUID.ADAPTER.decode(reader);
                                break;
                            case 8:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                side = sideDecode2;
                                putCallCode = putCallCodeDecode;
                                tradeType = tradeTypeDecode;
                                try {
                                    sideDecode = Side.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                sideDecode2 = side;
                                putCallCodeDecode = putCallCode;
                                tradeTypeDecode = tradeType;
                                break;
                            case 10:
                                decimalDecode = Decimal.ADAPTER.decode(reader);
                                break;
                            case 11:
                                decimalDecode2 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 12:
                                decimalDecode3 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 13:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 15:
                                timeDecode2 = Time.ADAPTER.decode(reader);
                                break;
                            case 16:
                                decimalDecode4 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 17:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 18:
                                pinnacleCorrectionDetailsDecode = PinnacleCorrectionDetails.ADAPTER.decode(reader);
                                break;
                            case 19:
                                decimalDecode5 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 20:
                                decimalDecode6 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 21:
                                side = sideDecode2;
                                putCallCode = putCallCodeDecode;
                                tradeType = tradeTypeDecode;
                                try {
                                    routeDecode = Route.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                                sideDecode2 = side;
                                putCallCodeDecode = putCallCode;
                                tradeTypeDecode = tradeType;
                                break;
                            case 22:
                                side = sideDecode2;
                                putCallCode = putCallCodeDecode;
                                tradeType = tradeTypeDecode;
                                try {
                                    putCallCodeDecode = PutCallCode.ADAPTER.decode(reader);
                                    sideDecode2 = side;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                tradeTypeDecode = tradeType;
                                break;
                            case 23:
                                side = sideDecode2;
                                putCallCode = putCallCodeDecode;
                                tradeType = tradeTypeDecode;
                                try {
                                    tradeTypeDecode = TradeType.ADAPTER.decode(reader);
                                    sideDecode2 = side;
                                    putCallCodeDecode = putCallCode;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 24:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 25:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 26:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 27:
                                try {
                                    sideDecode2 = Side.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    side = sideDecode2;
                                    putCallCode = putCallCodeDecode;
                                    tradeType = tradeTypeDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                            case 28:
                                decimalDecode7 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 29:
                                decimalDecode8 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 30:
                                decimalDecode9 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 31:
                                decimalDecode10 = Decimal.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                side = sideDecode2;
                                putCallCode = putCallCodeDecode;
                                tradeType = tradeTypeDecode;
                                sideDecode2 = side;
                                putCallCodeDecode = putCallCode;
                                tradeTypeDecode = tradeType;
                                break;
                        }
                    } else {
                        return new PinnacleExecutionDetails(strDecode9, timeDecode, uuidDecode, uuidDecode2, strDecode, strDecode2, uuidDecode3, strDecode3, sideDecode, decimalDecode, decimalDecode2, decimalDecode3, strDecode4, strDecode5, timeDecode2, decimalDecode4, strDecode6, pinnacleCorrectionDetailsDecode, decimalDecode5, decimalDecode6, routeDecode, putCallCodeDecode, tradeTypeDecode, zBooleanValue, strDecode7, strDecode8, sideDecode2, decimalDecode7, decimalDecode8, decimalDecode9, decimalDecode10, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PinnacleExecutionDetails redact(PinnacleExecutionDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Time timestamp = value.getTimestamp();
                Time timeRedact = timestamp != null ? Time.ADAPTER.redact(timestamp) : null;
                UUID execution_id = value.getExecution_id();
                UUID uuidRedact = execution_id != null ? UUID.ADAPTER.redact(execution_id) : null;
                UUID order_id = value.getOrder_id();
                UUID uuidRedact2 = order_id != null ? UUID.ADAPTER.redact(order_id) : null;
                UUID instrument_id = value.getInstrument_id();
                UUID uuidRedact3 = instrument_id != null ? UUID.ADAPTER.redact(instrument_id) : null;
                Decimal price = value.getPrice();
                Decimal decimalRedact = price != null ? Decimal.ADAPTER.redact(price) : null;
                Decimal quantity = value.getQuantity();
                Decimal decimalRedact2 = quantity != null ? Decimal.ADAPTER.redact(quantity) : null;
                Decimal rounded_notional = value.getRounded_notional();
                Decimal decimalRedact3 = rounded_notional != null ? Decimal.ADAPTER.redact(rounded_notional) : null;
                Time broken_at = value.getBroken_at();
                Time timeRedact2 = broken_at != null ? Time.ADAPTER.redact(broken_at) : null;
                Decimal commission = value.getCommission();
                Decimal decimalRedact4 = commission != null ? Decimal.ADAPTER.redact(commission) : null;
                PinnacleCorrectionDetails correction_details = value.getCorrection_details();
                PinnacleCorrectionDetails pinnacleCorrectionDetailsRedact = correction_details != null ? PinnacleCorrectionDetails.ADAPTER.redact(correction_details) : null;
                Decimal sec_fee = value.getSec_fee();
                Decimal decimalRedact5 = sec_fee != null ? Decimal.ADAPTER.redact(sec_fee) : null;
                Decimal taf_fee = value.getTaf_fee();
                Decimal decimalRedact6 = taf_fee != null ? Decimal.ADAPTER.redact(taf_fee) : null;
                Decimal or_fee = value.getOr_fee();
                Decimal decimalRedact7 = or_fee != null ? Decimal.ADAPTER.redact(or_fee) : null;
                Decimal occ_fee = value.getOcc_fee();
                Decimal decimalRedact8 = occ_fee != null ? Decimal.ADAPTER.redact(occ_fee) : null;
                Decimal non_denominated_currency_traded = value.getNon_denominated_currency_traded();
                Decimal decimalRedact9 = non_denominated_currency_traded != null ? Decimal.ADAPTER.redact(non_denominated_currency_traded) : null;
                Decimal fx_fee_in_bps = value.getFx_fee_in_bps();
                return value.copy((133247409 & 1) != 0 ? value.type : null, (133247409 & 2) != 0 ? value.timestamp : timeRedact, (133247409 & 4) != 0 ? value.execution_id : uuidRedact, (133247409 & 8) != 0 ? value.order_id : uuidRedact2, (133247409 & 16) != 0 ? value.venue_execution_id : null, (133247409 & 32) != 0 ? value.contra_broker : null, (133247409 & 64) != 0 ? value.instrument_id : uuidRedact3, (133247409 & 128) != 0 ? value.symbol : null, (133247409 & 256) != 0 ? value.side : null, (133247409 & 512) != 0 ? value.price : decimalRedact, (133247409 & 1024) != 0 ? value.quantity : decimalRedact2, (133247409 & 2048) != 0 ? value.rounded_notional : decimalRedact3, (133247409 & 4096) != 0 ? value.trade_date : null, (133247409 & 8192) != 0 ? value.settlement_date : null, (133247409 & 16384) != 0 ? value.broken_at : timeRedact2, (133247409 & 32768) != 0 ? value.commission : decimalRedact4, (133247409 & 65536) != 0 ? value.leg_id : null, (133247409 & 131072) != 0 ? value.correction_details : pinnacleCorrectionDetailsRedact, (133247409 & 262144) != 0 ? value.sec_fee : decimalRedact5, (133247409 & 524288) != 0 ? value.taf_fee : decimalRedact6, (133247409 & 1048576) != 0 ? value.route : null, (133247409 & 2097152) != 0 ? value.put_call_code : null, (133247409 & 4194304) != 0 ? value.trade_type : null, (133247409 & 8388608) != 0 ? value.executed_on_exchange : false, (133247409 & 16777216) != 0 ? value.offset_account : null, (133247409 & 33554432) != 0 ? value.trailer : null, (133247409 & 67108864) != 0 ? value.firm_side : null, (133247409 & 134217728) != 0 ? value.or_fee : decimalRedact7, (133247409 & 268435456) != 0 ? value.occ_fee : decimalRedact8, (133247409 & 536870912) != 0 ? value.non_denominated_currency_traded : decimalRedact9, (133247409 & 1073741824) != 0 ? value.fx_fee_in_bps : fx_fee_in_bps != null ? Decimal.ADAPTER.redact(fx_fee_in_bps) : null, (133247409 & Integer.MIN_VALUE) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

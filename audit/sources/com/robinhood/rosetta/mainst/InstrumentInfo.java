package com.robinhood.rosetta.mainst;

import com.google.android.libraries.places.api.model.PlaceTypes;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.InstrumentState;
import rosetta.mainst.InstrumentType;
import rosetta.mainst.PutCallCode;
import rosetta.mainst.SecurityType;
import rosetta.mainst.Tradability;

/* compiled from: InstrumentInfo.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 W2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001WB\u0089\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010&\u001a\u00020\u0016\u0012\b\b\u0002\u0010'\u001a\u00020(¢\u0006\u0004\b)\u0010*J\b\u0010O\u001a\u00020\u0002H\u0017J\u0013\u0010P\u001a\u00020!2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0096\u0002J\b\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u00020\u0006H\u0016J\u0088\u0002\u0010V\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020(R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00101R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00101R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010,R\u0016\u0010\u001d\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010.R\u0016\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010 \u001a\u00020!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0018\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0018\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0016\u0010&\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010<R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010N¨\u0006X"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfo;", "Lcom/squareup/wire/Message;", "", "id", "Lcom/robinhood/rosetta/mainst/UUID;", "symbol", "", "market", "ipo_date", "Lcom/robinhood/rosetta/mainst/Time;", "min_tick_size", "Lcom/robinhood/rosetta/mainst/Decimal;", "type", "Lrosetta/mainst/InstrumentType;", "maturity_date", "put_call_code", "Lrosetta/mainst/PutCallCode;", "strike_price", "trade_value_multiplier", "underlying_instrument_ids", "", "rhs_tradability", "Lrosetta/mainst/Tradability;", "cusip", "Lcom/robinhood/rosetta/mainst/NullableString;", "state", "Lrosetta/mainst/InstrumentState;", "updated_at", "chain_pk", PlaceTypes.COUNTRY, "security_type", "Lrosetta/mainst/SecurityType;", "mifid_2_dually_listed", "", "currency_details", "Lcom/robinhood/rosetta/mainst/NullableCurrencyDetails;", "currency_pair_details", "Lcom/robinhood/rosetta/mainst/NullableCurrencyPairDetails;", "tradability_for_late_closing_etfs", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/InstrumentType;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/mainst/PutCallCode;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Ljava/util/List;Lrosetta/mainst/Tradability;Lcom/robinhood/rosetta/mainst/NullableString;Lrosetta/mainst/InstrumentState;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/UUID;Ljava/lang/String;Lrosetta/mainst/SecurityType;ZLcom/robinhood/rosetta/mainst/NullableCurrencyDetails;Lcom/robinhood/rosetta/mainst/NullableCurrencyPairDetails;Lrosetta/mainst/Tradability;Lokio/ByteString;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUID;", "getSymbol", "()Ljava/lang/String;", "getMarket", "getIpo_date", "()Lcom/robinhood/rosetta/mainst/Time;", "getMin_tick_size", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getType", "()Lrosetta/mainst/InstrumentType;", "getMaturity_date", "getPut_call_code", "()Lrosetta/mainst/PutCallCode;", "getStrike_price", "getTrade_value_multiplier", "getRhs_tradability", "()Lrosetta/mainst/Tradability;", "getCusip", "()Lcom/robinhood/rosetta/mainst/NullableString;", "getState", "()Lrosetta/mainst/InstrumentState;", "getUpdated_at", "getChain_pk", "getCountry", "getSecurity_type", "()Lrosetta/mainst/SecurityType;", "getMifid_2_dually_listed", "()Z", "getCurrency_details", "()Lcom/robinhood/rosetta/mainst/NullableCurrencyDetails;", "getCurrency_pair_details", "()Lcom/robinhood/rosetta/mainst/NullableCurrencyPairDetails;", "getTradability_for_late_closing_etfs", "getUnderlying_instrument_ids", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class InstrumentInfo extends Message {

    @JvmField
    public static final ProtoAdapter<InstrumentInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "chainPk", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final UUID chain_pk;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final String country;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableCurrencyDetails#ADAPTER", jsonName = "currencyDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final NullableCurrencyDetails currency_details;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableCurrencyPairDetails#ADAPTER", jsonName = "currencyPairDetails", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final NullableCurrencyPairDetails currency_pair_details;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final NullableString cusip;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "ipoDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Time ipo_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String market;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "maturityDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Time maturity_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "mifid2DuallyListed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final boolean mifid_2_dually_listed;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "minTickSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Decimal min_tick_size;

    @WireField(adapter = "rosetta.mainst.PutCallCode#ADAPTER", jsonName = "putCallCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final PutCallCode put_call_code;

    @WireField(adapter = "rosetta.mainst.Tradability#ADAPTER", jsonName = "rhsTradability", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Tradability rhs_tradability;

    @WireField(adapter = "rosetta.mainst.SecurityType#ADAPTER", jsonName = "securityType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final SecurityType security_type;

    @WireField(adapter = "rosetta.mainst.InstrumentState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final InstrumentState state;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "strikePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Decimal strike_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String symbol;

    @WireField(adapter = "rosetta.mainst.Tradability#ADAPTER", jsonName = "tradabilityForLateClosingEtfs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final Tradability tradability_for_late_closing_etfs;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "tradeValueMultiplier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Decimal trade_value_multiplier;

    @WireField(adapter = "rosetta.mainst.InstrumentType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final InstrumentType type;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "underlyingInstrumentIds", label = WireField.Label.REPEATED, schemaIndex = 10, tag = 11)
    private final List<UUID> underlying_instrument_ids;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final Time updated_at;

    public InstrumentInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388607, null);
    }

    public /* synthetic */ InstrumentInfo(UUID uuid, String str, String str2, Time time, Decimal decimal, InstrumentType instrumentType, Time time2, PutCallCode putCallCode, Decimal decimal2, Decimal decimal3, List list, Tradability tradability, NullableString nullableString, InstrumentState instrumentState, Time time3, UUID uuid2, String str3, SecurityType securityType, boolean z, NullableCurrencyDetails nullableCurrencyDetails, NullableCurrencyPairDetails nullableCurrencyPairDetails, Tradability tradability2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : time, (i & 16) != 0 ? null : decimal, (i & 32) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i & 64) != 0 ? null : time2, (i & 128) != 0 ? PutCallCode.PUT_CALL_CODE_UNSPECIFIED : putCallCode, (i & 256) != 0 ? null : decimal2, (i & 512) != 0 ? null : decimal3, (i & 1024) != 0 ? CollectionsKt.emptyList() : list, (i & 2048) != 0 ? Tradability.TRADABILITY_UNSPECIFIED : tradability, (i & 4096) != 0 ? null : nullableString, (i & 8192) != 0 ? InstrumentState.INSTRUMENT_STATE_UNSPECIFIED : instrumentState, (i & 16384) != 0 ? null : time3, (i & 32768) != 0 ? null : uuid2, (i & 65536) == 0 ? str3 : "", (i & 131072) != 0 ? SecurityType.SECURITY_TYPE_UNSPECIFIED : securityType, (i & 262144) != 0 ? false : z, (i & 524288) != 0 ? null : nullableCurrencyDetails, (i & 1048576) != 0 ? null : nullableCurrencyPairDetails, (i & 2097152) != 0 ? Tradability.TRADABILITY_UNSPECIFIED : tradability2, (i & 4194304) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24666newBuilder();
    }

    public final UUID getId() {
        return this.id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getMarket() {
        return this.market;
    }

    public final Time getIpo_date() {
        return this.ipo_date;
    }

    public final Decimal getMin_tick_size() {
        return this.min_tick_size;
    }

    public final InstrumentType getType() {
        return this.type;
    }

    public final Time getMaturity_date() {
        return this.maturity_date;
    }

    public final PutCallCode getPut_call_code() {
        return this.put_call_code;
    }

    public final Decimal getStrike_price() {
        return this.strike_price;
    }

    public final Decimal getTrade_value_multiplier() {
        return this.trade_value_multiplier;
    }

    public final Tradability getRhs_tradability() {
        return this.rhs_tradability;
    }

    public final NullableString getCusip() {
        return this.cusip;
    }

    public final InstrumentState getState() {
        return this.state;
    }

    public final Time getUpdated_at() {
        return this.updated_at;
    }

    public final UUID getChain_pk() {
        return this.chain_pk;
    }

    public final String getCountry() {
        return this.country;
    }

    public final SecurityType getSecurity_type() {
        return this.security_type;
    }

    public final boolean getMifid_2_dually_listed() {
        return this.mifid_2_dually_listed;
    }

    public final NullableCurrencyDetails getCurrency_details() {
        return this.currency_details;
    }

    public final NullableCurrencyPairDetails getCurrency_pair_details() {
        return this.currency_pair_details;
    }

    public final Tradability getTradability_for_late_closing_etfs() {
        return this.tradability_for_late_closing_etfs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentInfo(UUID uuid, String symbol, String market, Time time, Decimal decimal, InstrumentType type2, Time time2, PutCallCode put_call_code, Decimal decimal2, Decimal decimal3, List<UUID> underlying_instrument_ids, Tradability rhs_tradability, NullableString nullableString, InstrumentState state, Time time3, UUID uuid2, String country, SecurityType security_type, boolean z, NullableCurrencyDetails nullableCurrencyDetails, NullableCurrencyPairDetails nullableCurrencyPairDetails, Tradability tradability_for_late_closing_etfs, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(underlying_instrument_ids, "underlying_instrument_ids");
        Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(security_type, "security_type");
        Intrinsics.checkNotNullParameter(tradability_for_late_closing_etfs, "tradability_for_late_closing_etfs");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = uuid;
        this.symbol = symbol;
        this.market = market;
        this.ipo_date = time;
        this.min_tick_size = decimal;
        this.type = type2;
        this.maturity_date = time2;
        this.put_call_code = put_call_code;
        this.strike_price = decimal2;
        this.trade_value_multiplier = decimal3;
        this.rhs_tradability = rhs_tradability;
        this.cusip = nullableString;
        this.state = state;
        this.updated_at = time3;
        this.chain_pk = uuid2;
        this.country = country;
        this.security_type = security_type;
        this.mifid_2_dually_listed = z;
        this.currency_details = nullableCurrencyDetails;
        this.currency_pair_details = nullableCurrencyPairDetails;
        this.tradability_for_late_closing_etfs = tradability_for_late_closing_etfs;
        this.underlying_instrument_ids = Internal.immutableCopyOf("underlying_instrument_ids", underlying_instrument_ids);
    }

    public final List<UUID> getUnderlying_instrument_ids() {
        return this.underlying_instrument_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24666newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InstrumentInfo)) {
            return false;
        }
        InstrumentInfo instrumentInfo = (InstrumentInfo) other;
        return Intrinsics.areEqual(unknownFields(), instrumentInfo.unknownFields()) && Intrinsics.areEqual(this.id, instrumentInfo.id) && Intrinsics.areEqual(this.symbol, instrumentInfo.symbol) && Intrinsics.areEqual(this.market, instrumentInfo.market) && Intrinsics.areEqual(this.ipo_date, instrumentInfo.ipo_date) && Intrinsics.areEqual(this.min_tick_size, instrumentInfo.min_tick_size) && this.type == instrumentInfo.type && Intrinsics.areEqual(this.maturity_date, instrumentInfo.maturity_date) && this.put_call_code == instrumentInfo.put_call_code && Intrinsics.areEqual(this.strike_price, instrumentInfo.strike_price) && Intrinsics.areEqual(this.trade_value_multiplier, instrumentInfo.trade_value_multiplier) && Intrinsics.areEqual(this.underlying_instrument_ids, instrumentInfo.underlying_instrument_ids) && this.rhs_tradability == instrumentInfo.rhs_tradability && Intrinsics.areEqual(this.cusip, instrumentInfo.cusip) && this.state == instrumentInfo.state && Intrinsics.areEqual(this.updated_at, instrumentInfo.updated_at) && Intrinsics.areEqual(this.chain_pk, instrumentInfo.chain_pk) && Intrinsics.areEqual(this.country, instrumentInfo.country) && this.security_type == instrumentInfo.security_type && this.mifid_2_dually_listed == instrumentInfo.mifid_2_dually_listed && Intrinsics.areEqual(this.currency_details, instrumentInfo.currency_details) && Intrinsics.areEqual(this.currency_pair_details, instrumentInfo.currency_pair_details) && this.tradability_for_late_closing_etfs == instrumentInfo.tradability_for_late_closing_etfs;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.id;
        int iHashCode2 = (((((iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37) + this.symbol.hashCode()) * 37) + this.market.hashCode()) * 37;
        Time time = this.ipo_date;
        int iHashCode3 = (iHashCode2 + (time != null ? time.hashCode() : 0)) * 37;
        Decimal decimal = this.min_tick_size;
        int iHashCode4 = (((iHashCode3 + (decimal != null ? decimal.hashCode() : 0)) * 37) + this.type.hashCode()) * 37;
        Time time2 = this.maturity_date;
        int iHashCode5 = (((iHashCode4 + (time2 != null ? time2.hashCode() : 0)) * 37) + this.put_call_code.hashCode()) * 37;
        Decimal decimal2 = this.strike_price;
        int iHashCode6 = (iHashCode5 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        Decimal decimal3 = this.trade_value_multiplier;
        int iHashCode7 = (((((iHashCode6 + (decimal3 != null ? decimal3.hashCode() : 0)) * 37) + this.underlying_instrument_ids.hashCode()) * 37) + this.rhs_tradability.hashCode()) * 37;
        NullableString nullableString = this.cusip;
        int iHashCode8 = (((iHashCode7 + (nullableString != null ? nullableString.hashCode() : 0)) * 37) + this.state.hashCode()) * 37;
        Time time3 = this.updated_at;
        int iHashCode9 = (iHashCode8 + (time3 != null ? time3.hashCode() : 0)) * 37;
        UUID uuid2 = this.chain_pk;
        int iHashCode10 = (((((((iHashCode9 + (uuid2 != null ? uuid2.hashCode() : 0)) * 37) + this.country.hashCode()) * 37) + this.security_type.hashCode()) * 37) + Boolean.hashCode(this.mifid_2_dually_listed)) * 37;
        NullableCurrencyDetails nullableCurrencyDetails = this.currency_details;
        int iHashCode11 = (iHashCode10 + (nullableCurrencyDetails != null ? nullableCurrencyDetails.hashCode() : 0)) * 37;
        NullableCurrencyPairDetails nullableCurrencyPairDetails = this.currency_pair_details;
        int iHashCode12 = ((iHashCode11 + (nullableCurrencyPairDetails != null ? nullableCurrencyPairDetails.hashCode() : 0)) * 37) + this.tradability_for_late_closing_etfs.hashCode();
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.id;
        if (uuid != null) {
            arrayList.add("id=" + uuid);
        }
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("market=" + Internal.sanitize(this.market));
        Time time = this.ipo_date;
        if (time != null) {
            arrayList.add("ipo_date=" + time);
        }
        Decimal decimal = this.min_tick_size;
        if (decimal != null) {
            arrayList.add("min_tick_size=" + decimal);
        }
        arrayList.add("type=" + this.type);
        Time time2 = this.maturity_date;
        if (time2 != null) {
            arrayList.add("maturity_date=" + time2);
        }
        arrayList.add("put_call_code=" + this.put_call_code);
        Decimal decimal2 = this.strike_price;
        if (decimal2 != null) {
            arrayList.add("strike_price=" + decimal2);
        }
        Decimal decimal3 = this.trade_value_multiplier;
        if (decimal3 != null) {
            arrayList.add("trade_value_multiplier=" + decimal3);
        }
        if (!this.underlying_instrument_ids.isEmpty()) {
            arrayList.add("underlying_instrument_ids=" + this.underlying_instrument_ids);
        }
        arrayList.add("rhs_tradability=" + this.rhs_tradability);
        NullableString nullableString = this.cusip;
        if (nullableString != null) {
            arrayList.add("cusip=" + nullableString);
        }
        arrayList.add("state=" + this.state);
        Time time3 = this.updated_at;
        if (time3 != null) {
            arrayList.add("updated_at=" + time3);
        }
        UUID uuid2 = this.chain_pk;
        if (uuid2 != null) {
            arrayList.add("chain_pk=" + uuid2);
        }
        arrayList.add("country=" + Internal.sanitize(this.country));
        arrayList.add("security_type=" + this.security_type);
        arrayList.add("mifid_2_dually_listed=" + this.mifid_2_dually_listed);
        NullableCurrencyDetails nullableCurrencyDetails = this.currency_details;
        if (nullableCurrencyDetails != null) {
            arrayList.add("currency_details=" + nullableCurrencyDetails);
        }
        NullableCurrencyPairDetails nullableCurrencyPairDetails = this.currency_pair_details;
        if (nullableCurrencyPairDetails != null) {
            arrayList.add("currency_pair_details=" + nullableCurrencyPairDetails);
        }
        arrayList.add("tradability_for_late_closing_etfs=" + this.tradability_for_late_closing_etfs);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentInfo{", "}", 0, null, null, 56, null);
    }

    public final InstrumentInfo copy(UUID id, String symbol, String market, Time ipo_date, Decimal min_tick_size, InstrumentType type2, Time maturity_date, PutCallCode put_call_code, Decimal strike_price, Decimal trade_value_multiplier, List<UUID> underlying_instrument_ids, Tradability rhs_tradability, NullableString cusip, InstrumentState state, Time updated_at, UUID chain_pk, String country, SecurityType security_type, boolean mifid_2_dually_listed, NullableCurrencyDetails currency_details, NullableCurrencyPairDetails currency_pair_details, Tradability tradability_for_late_closing_etfs, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(put_call_code, "put_call_code");
        Intrinsics.checkNotNullParameter(underlying_instrument_ids, "underlying_instrument_ids");
        Intrinsics.checkNotNullParameter(rhs_tradability, "rhs_tradability");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(security_type, "security_type");
        Intrinsics.checkNotNullParameter(tradability_for_late_closing_etfs, "tradability_for_late_closing_etfs");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InstrumentInfo(id, symbol, market, ipo_date, min_tick_size, type2, maturity_date, put_call_code, strike_price, trade_value_multiplier, underlying_instrument_ids, rhs_tradability, cusip, state, updated_at, chain_pk, country, security_type, mifid_2_dually_listed, currency_details, currency_pair_details, tradability_for_late_closing_etfs, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InstrumentInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InstrumentInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.InstrumentInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InstrumentInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getId() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getMarket(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getMarket());
                }
                if (value.getIpo_date() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(4, value.getIpo_date());
                }
                if (value.getMin_tick_size() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(5, value.getMin_tick_size());
                }
                if (value.getType() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    size += InstrumentType.ADAPTER.encodedSizeWithTag(6, value.getType());
                }
                if (value.getMaturity_date() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(7, value.getMaturity_date());
                }
                if (value.getPut_call_code() != PutCallCode.PUT_CALL_CODE_UNSPECIFIED) {
                    size += PutCallCode.ADAPTER.encodedSizeWithTag(8, value.getPut_call_code());
                }
                if (value.getStrike_price() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(9, value.getStrike_price());
                }
                if (value.getTrade_value_multiplier() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(10, value.getTrade_value_multiplier());
                }
                ProtoAdapter<UUID> protoAdapter = UUID.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(11, value.getUnderlying_instrument_ids());
                Tradability rhs_tradability = value.getRhs_tradability();
                Tradability tradability = Tradability.TRADABILITY_UNSPECIFIED;
                if (rhs_tradability != tradability) {
                    iEncodedSizeWithTag += Tradability.ADAPTER.encodedSizeWithTag(12, value.getRhs_tradability());
                }
                if (value.getCusip() != null) {
                    iEncodedSizeWithTag += NullableString.ADAPTER.encodedSizeWithTag(13, value.getCusip());
                }
                if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
                    iEncodedSizeWithTag += InstrumentState.ADAPTER.encodedSizeWithTag(14, value.getState());
                }
                if (value.getUpdated_at() != null) {
                    iEncodedSizeWithTag += Time.ADAPTER.encodedSizeWithTag(15, value.getUpdated_at());
                }
                if (value.getChain_pk() != null) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(16, value.getChain_pk());
                }
                if (!Intrinsics.areEqual(value.getCountry(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(17, value.getCountry());
                }
                if (value.getSecurity_type() != SecurityType.SECURITY_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += SecurityType.ADAPTER.encodedSizeWithTag(18, value.getSecurity_type());
                }
                if (value.getMifid_2_dually_listed()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(19, Boolean.valueOf(value.getMifid_2_dually_listed()));
                }
                if (value.getCurrency_details() != null) {
                    iEncodedSizeWithTag += NullableCurrencyDetails.ADAPTER.encodedSizeWithTag(20, value.getCurrency_details());
                }
                if (value.getCurrency_pair_details() != null) {
                    iEncodedSizeWithTag += NullableCurrencyPairDetails.ADAPTER.encodedSizeWithTag(21, value.getCurrency_pair_details());
                }
                return value.getTradability_for_late_closing_etfs() != tradability ? iEncodedSizeWithTag + Tradability.ADAPTER.encodedSizeWithTag(22, value.getTradability_for_late_closing_etfs()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InstrumentInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getMarket(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMarket());
                }
                if (value.getIpo_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getIpo_date());
                }
                if (value.getMin_tick_size() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 5, (int) value.getMin_tick_size());
                }
                if (value.getType() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 6, (int) value.getType());
                }
                if (value.getMaturity_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 7, (int) value.getMaturity_date());
                }
                if (value.getPut_call_code() != PutCallCode.PUT_CALL_CODE_UNSPECIFIED) {
                    PutCallCode.ADAPTER.encodeWithTag(writer, 8, (int) value.getPut_call_code());
                }
                if (value.getStrike_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 9, (int) value.getStrike_price());
                }
                if (value.getTrade_value_multiplier() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 10, (int) value.getTrade_value_multiplier());
                }
                ProtoAdapter<UUID> protoAdapter = UUID.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 11, (int) value.getUnderlying_instrument_ids());
                Tradability rhs_tradability = value.getRhs_tradability();
                Tradability tradability = Tradability.TRADABILITY_UNSPECIFIED;
                if (rhs_tradability != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 12, (int) value.getRhs_tradability());
                }
                if (value.getCusip() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 13, (int) value.getCusip());
                }
                if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
                    InstrumentState.ADAPTER.encodeWithTag(writer, 14, (int) value.getState());
                }
                if (value.getUpdated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 15, (int) value.getUpdated_at());
                }
                if (value.getChain_pk() != null) {
                    protoAdapter.encodeWithTag(writer, 16, (int) value.getChain_pk());
                }
                if (!Intrinsics.areEqual(value.getCountry(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getCountry());
                }
                if (value.getSecurity_type() != SecurityType.SECURITY_TYPE_UNSPECIFIED) {
                    SecurityType.ADAPTER.encodeWithTag(writer, 18, (int) value.getSecurity_type());
                }
                if (value.getMifid_2_dually_listed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 19, (int) Boolean.valueOf(value.getMifid_2_dually_listed()));
                }
                if (value.getCurrency_details() != null) {
                    NullableCurrencyDetails.ADAPTER.encodeWithTag(writer, 20, (int) value.getCurrency_details());
                }
                if (value.getCurrency_pair_details() != null) {
                    NullableCurrencyPairDetails.ADAPTER.encodeWithTag(writer, 21, (int) value.getCurrency_pair_details());
                }
                if (value.getTradability_for_late_closing_etfs() != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 22, (int) value.getTradability_for_late_closing_etfs());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InstrumentInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Tradability tradability_for_late_closing_etfs = value.getTradability_for_late_closing_etfs();
                Tradability tradability = Tradability.TRADABILITY_UNSPECIFIED;
                if (tradability_for_late_closing_etfs != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 22, (int) value.getTradability_for_late_closing_etfs());
                }
                if (value.getCurrency_pair_details() != null) {
                    NullableCurrencyPairDetails.ADAPTER.encodeWithTag(writer, 21, (int) value.getCurrency_pair_details());
                }
                if (value.getCurrency_details() != null) {
                    NullableCurrencyDetails.ADAPTER.encodeWithTag(writer, 20, (int) value.getCurrency_details());
                }
                if (value.getMifid_2_dually_listed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 19, (int) Boolean.valueOf(value.getMifid_2_dually_listed()));
                }
                if (value.getSecurity_type() != SecurityType.SECURITY_TYPE_UNSPECIFIED) {
                    SecurityType.ADAPTER.encodeWithTag(writer, 18, (int) value.getSecurity_type());
                }
                if (!Intrinsics.areEqual(value.getCountry(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getCountry());
                }
                if (value.getChain_pk() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 16, (int) value.getChain_pk());
                }
                if (value.getUpdated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 15, (int) value.getUpdated_at());
                }
                if (value.getState() != InstrumentState.INSTRUMENT_STATE_UNSPECIFIED) {
                    InstrumentState.ADAPTER.encodeWithTag(writer, 14, (int) value.getState());
                }
                if (value.getCusip() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 13, (int) value.getCusip());
                }
                if (value.getRhs_tradability() != tradability) {
                    Tradability.ADAPTER.encodeWithTag(writer, 12, (int) value.getRhs_tradability());
                }
                ProtoAdapter<UUID> protoAdapter = UUID.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 11, (int) value.getUnderlying_instrument_ids());
                if (value.getTrade_value_multiplier() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 10, (int) value.getTrade_value_multiplier());
                }
                if (value.getStrike_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 9, (int) value.getStrike_price());
                }
                if (value.getPut_call_code() != PutCallCode.PUT_CALL_CODE_UNSPECIFIED) {
                    PutCallCode.ADAPTER.encodeWithTag(writer, 8, (int) value.getPut_call_code());
                }
                if (value.getMaturity_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 7, (int) value.getMaturity_date());
                }
                if (value.getType() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 6, (int) value.getType());
                }
                if (value.getMin_tick_size() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 5, (int) value.getMin_tick_size());
                }
                if (value.getIpo_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 4, (int) value.getIpo_date());
                }
                if (!Intrinsics.areEqual(value.getMarket(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMarket());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSymbol());
                }
                if (value.getId() != null) {
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentInfo decode(ProtoReader reader) throws IOException {
                PutCallCode putCallCode;
                Tradability tradability;
                Tradability tradability2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                InstrumentType instrumentType = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                PutCallCode putCallCode2 = PutCallCode.PUT_CALL_CODE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                Tradability tradability3 = Tradability.TRADABILITY_UNSPECIFIED;
                InstrumentState instrumentState = InstrumentState.INSTRUMENT_STATE_UNSPECIFIED;
                SecurityType securityType = SecurityType.SECURITY_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                InstrumentType instrumentTypeDecode = instrumentType;
                Time timeDecode = null;
                Decimal decimalDecode = null;
                Time timeDecode2 = null;
                Decimal decimalDecode2 = null;
                Decimal decimalDecode3 = null;
                NullableString nullableStringDecode = null;
                Time timeDecode3 = null;
                UUID uuidDecode = null;
                NullableCurrencyDetails nullableCurrencyDetailsDecode = null;
                NullableCurrencyPairDetails nullableCurrencyPairDetailsDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                boolean zBooleanValue = false;
                InstrumentState instrumentStateDecode = instrumentState;
                SecurityType securityTypeDecode = securityType;
                UUID uuidDecode2 = null;
                Tradability tradabilityDecode = tradability3;
                Tradability tradabilityDecode2 = tradabilityDecode;
                PutCallCode putCallCodeDecode = putCallCode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InstrumentInfo(uuidDecode2, strDecode, strDecode2, timeDecode, decimalDecode, instrumentTypeDecode, timeDecode2, putCallCodeDecode, decimalDecode2, decimalDecode3, arrayList, tradabilityDecode, nullableStringDecode, instrumentStateDecode, timeDecode3, uuidDecode, strDecode3, securityTypeDecode, zBooleanValue, nullableCurrencyDetailsDecode, nullableCurrencyPairDetailsDecode, tradabilityDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            uuidDecode2 = UUID.ADAPTER.decode(reader);
                            break;
                        case 2:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            timeDecode = Time.ADAPTER.decode(reader);
                            break;
                        case 5:
                            decimalDecode = Decimal.ADAPTER.decode(reader);
                            break;
                        case 6:
                            putCallCode = putCallCodeDecode;
                            tradability = tradabilityDecode;
                            tradability2 = tradabilityDecode2;
                            try {
                                instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            putCallCodeDecode = putCallCode;
                            tradabilityDecode = tradability;
                            tradabilityDecode2 = tradability2;
                            break;
                        case 7:
                            timeDecode2 = Time.ADAPTER.decode(reader);
                            break;
                        case 8:
                            putCallCode = putCallCodeDecode;
                            tradability = tradabilityDecode;
                            tradability2 = tradabilityDecode2;
                            try {
                                putCallCodeDecode = PutCallCode.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            tradabilityDecode = tradability;
                            tradabilityDecode2 = tradability2;
                            break;
                        case 9:
                            decimalDecode2 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 10:
                            decimalDecode3 = Decimal.ADAPTER.decode(reader);
                            break;
                        case 11:
                            putCallCode = putCallCodeDecode;
                            tradability = tradabilityDecode;
                            tradability2 = tradabilityDecode2;
                            arrayList.add(UUID.ADAPTER.decode(reader));
                            putCallCodeDecode = putCallCode;
                            tradabilityDecode = tradability;
                            tradabilityDecode2 = tradability2;
                            break;
                        case 12:
                            putCallCode = putCallCodeDecode;
                            tradability = tradabilityDecode;
                            tradability2 = tradabilityDecode2;
                            try {
                                tradabilityDecode = Tradability.ADAPTER.decode(reader);
                                putCallCodeDecode = putCallCode;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                            tradabilityDecode2 = tradability2;
                            break;
                        case 13:
                            nullableStringDecode = NullableString.ADAPTER.decode(reader);
                            break;
                        case 14:
                            putCallCode = putCallCodeDecode;
                            tradability = tradabilityDecode;
                            tradability2 = tradabilityDecode2;
                            try {
                                instrumentStateDecode = InstrumentState.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                            }
                            putCallCodeDecode = putCallCode;
                            tradabilityDecode = tradability;
                            tradabilityDecode2 = tradability2;
                            break;
                        case 15:
                            timeDecode3 = Time.ADAPTER.decode(reader);
                            break;
                        case 16:
                            uuidDecode = UUID.ADAPTER.decode(reader);
                            break;
                        case 17:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 18:
                            putCallCode = putCallCodeDecode;
                            tradability = tradabilityDecode;
                            tradability2 = tradabilityDecode2;
                            try {
                                securityTypeDecode = SecurityType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                            }
                            putCallCodeDecode = putCallCode;
                            tradabilityDecode = tradability;
                            tradabilityDecode2 = tradability2;
                            break;
                        case 19:
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 20:
                            nullableCurrencyDetailsDecode = NullableCurrencyDetails.ADAPTER.decode(reader);
                            break;
                        case 21:
                            nullableCurrencyPairDetailsDecode = NullableCurrencyPairDetails.ADAPTER.decode(reader);
                            break;
                        case 22:
                            try {
                                tradabilityDecode2 = Tradability.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                putCallCode = putCallCodeDecode;
                                tradability = tradabilityDecode;
                                tradability2 = tradabilityDecode2;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                break;
                            }
                        default:
                            reader.readUnknownField(iNextTag);
                            putCallCode = putCallCodeDecode;
                            tradability = tradabilityDecode;
                            tradability2 = tradabilityDecode2;
                            putCallCodeDecode = putCallCode;
                            tradabilityDecode = tradability;
                            tradabilityDecode2 = tradability2;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentInfo redact(InstrumentInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID id = value.getId();
                UUID uuidRedact = id != null ? UUID.ADAPTER.redact(id) : null;
                Time ipo_date = value.getIpo_date();
                Time timeRedact = ipo_date != null ? Time.ADAPTER.redact(ipo_date) : null;
                Decimal min_tick_size = value.getMin_tick_size();
                Decimal decimalRedact = min_tick_size != null ? Decimal.ADAPTER.redact(min_tick_size) : null;
                Time maturity_date = value.getMaturity_date();
                Time timeRedact2 = maturity_date != null ? Time.ADAPTER.redact(maturity_date) : null;
                Decimal strike_price = value.getStrike_price();
                Decimal decimalRedact2 = strike_price != null ? Decimal.ADAPTER.redact(strike_price) : null;
                Decimal trade_value_multiplier = value.getTrade_value_multiplier();
                Decimal decimalRedact3 = trade_value_multiplier != null ? Decimal.ADAPTER.redact(trade_value_multiplier) : null;
                List<UUID> underlying_instrument_ids = value.getUnderlying_instrument_ids();
                ProtoAdapter<UUID> protoAdapter = UUID.ADAPTER;
                List listM26823redactElements = Internal.m26823redactElements(underlying_instrument_ids, protoAdapter);
                NullableString cusip = value.getCusip();
                NullableString nullableStringRedact = cusip != null ? NullableString.ADAPTER.redact(cusip) : null;
                Time updated_at = value.getUpdated_at();
                Time timeRedact3 = updated_at != null ? Time.ADAPTER.redact(updated_at) : null;
                UUID chain_pk = value.getChain_pk();
                UUID uuidRedact2 = chain_pk != null ? protoAdapter.redact(chain_pk) : null;
                NullableCurrencyDetails currency_details = value.getCurrency_details();
                NullableCurrencyDetails nullableCurrencyDetailsRedact = currency_details != null ? NullableCurrencyDetails.ADAPTER.redact(currency_details) : null;
                NullableCurrencyPairDetails currency_pair_details = value.getCurrency_pair_details();
                return value.copy((2566310 & 1) != 0 ? value.id : uuidRedact, (2566310 & 2) != 0 ? value.symbol : null, (2566310 & 4) != 0 ? value.market : null, (2566310 & 8) != 0 ? value.ipo_date : timeRedact, (2566310 & 16) != 0 ? value.min_tick_size : decimalRedact, (2566310 & 32) != 0 ? value.type : null, (2566310 & 64) != 0 ? value.maturity_date : timeRedact2, (2566310 & 128) != 0 ? value.put_call_code : null, (2566310 & 256) != 0 ? value.strike_price : decimalRedact2, (2566310 & 512) != 0 ? value.trade_value_multiplier : decimalRedact3, (2566310 & 1024) != 0 ? value.underlying_instrument_ids : listM26823redactElements, (2566310 & 2048) != 0 ? value.rhs_tradability : null, (2566310 & 4096) != 0 ? value.cusip : nullableStringRedact, (2566310 & 8192) != 0 ? value.state : null, (2566310 & 16384) != 0 ? value.updated_at : timeRedact3, (2566310 & 32768) != 0 ? value.chain_pk : uuidRedact2, (2566310 & 65536) != 0 ? value.country : null, (2566310 & 131072) != 0 ? value.security_type : null, (2566310 & 262144) != 0 ? value.mifid_2_dually_listed : false, (2566310 & 524288) != 0 ? value.currency_details : nullableCurrencyDetailsRedact, (2566310 & 1048576) != 0 ? value.currency_pair_details : currency_pair_details != null ? NullableCurrencyPairDetails.ADAPTER.redact(currency_pair_details) : null, (2566310 & 2097152) != 0 ? value.tradability_for_late_closing_etfs : null, (2566310 & 4194304) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

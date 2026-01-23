package com.robinhood.rosetta.mainst;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import rosetta.mainst.CurrencyPairType;
import rosetta.mainst.InstrumentState;
import rosetta.mainst.Tradability;

/* compiled from: CurrencyPairDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 T2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001TBá\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0018\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0018\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0018\u0012\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\u0018\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010%\u001a\u00020\u0004\u0012\b\b\u0002\u0010&\u001a\u00020'¢\u0006\u0004\b(\u0010)J\b\u0010L\u001a\u00020\u0002H\u0017J\u0013\u0010M\u001a\u00020\u00162\b\u0010N\u001a\u0004\u0018\u00010OH\u0096\u0002J\b\u0010P\u001a\u00020QH\u0016J\b\u0010R\u001a\u00020\u0004H\u0016Jà\u0002\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u00182\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\u00182\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020'R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00100R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00100R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00100R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00100R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?R\u0016\u0010\u001e\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010#\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00102R\u0018\u0010$\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00102R\u0016\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010+R\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010GR\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010GR\"\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010GR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010G¨\u0006U"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CurrencyPairDetails;", "Lcom/squareup/wire/Message;", "", "name", "", "symbol", "state", "Lrosetta/mainst/InstrumentState;", "min_tick_size", "Lcom/robinhood/rosetta/mainst/Decimal;", "asset_currency", "Lcom/robinhood/rosetta/mainst/UUID;", "quote_currency", "min_order_size", "max_order_size", "min_order_price_increment", "min_order_quantity_increment", "min_quote_price_increment", "min_quote_quantity_increment", "rhc_tradability", "Lrosetta/mainst/Tradability;", "fundamentals_enabled", "", "crypto_metadata", "", "venue_symbols", "created_at", "Lcom/robinhood/rosetta/mainst/Time;", "updated_at", "state_by_region", "currency_pair_type", "Lrosetta/mainst/CurrencyPairType;", "tradability_by_region", "third_party_router_coin_spec", "Lcom/robinhood/rosetta/mainst/ThirdPartyRouterCoinSpec;", "spot_currency_pair", "underlying_equity_instrument_id", "description", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/InstrumentState;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/Tradability;ZLjava/util/Map;Ljava/util/Map;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Ljava/util/Map;Lrosetta/mainst/CurrencyPairType;Ljava/util/Map;Ljava/util/Map;Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/UUID;Ljava/lang/String;Lokio/ByteString;)V", "getName", "()Ljava/lang/String;", "getSymbol", "getState", "()Lrosetta/mainst/InstrumentState;", "getMin_tick_size", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getAsset_currency", "()Lcom/robinhood/rosetta/mainst/UUID;", "getQuote_currency", "getMin_order_size", "getMax_order_size", "getMin_order_price_increment", "getMin_order_quantity_increment", "getMin_quote_price_increment", "getMin_quote_quantity_increment", "getRhc_tradability", "()Lrosetta/mainst/Tradability;", "getFundamentals_enabled", "()Z", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/Time;", "getUpdated_at", "getCurrency_pair_type", "()Lrosetta/mainst/CurrencyPairType;", "getSpot_currency_pair", "getUnderlying_equity_instrument_id", "getDescription", "getCrypto_metadata", "()Ljava/util/Map;", "getVenue_symbols", "getState_by_region", "getTradability_by_region", "getThird_party_router_coin_spec", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CurrencyPairDetails extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "assetCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 2)
    private final UUID asset_currency;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final Time created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cryptoMetadata", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 14, tag = 12)
    private final Map<String, String> crypto_metadata;

    @WireField(adapter = "rosetta.mainst.CurrencyPairType#ADAPTER", jsonName = "currencyPairType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 21)
    private final CurrencyPairType currency_pair_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 26)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "fundamentalsEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 11)
    private final boolean fundamentals_enabled;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "maxOrderSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 5)
    private final Decimal max_order_size;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "minOrderPriceIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 6)
    private final Decimal min_order_price_increment;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "minOrderQuantityIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 7)
    private final Decimal min_order_quantity_increment;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "minOrderSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 4)
    private final Decimal min_order_size;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "minQuotePriceIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 8)
    private final Decimal min_quote_price_increment;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "minQuoteQuantityIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 9)
    private final Decimal min_quote_quantity_increment;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "minTickSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 16)
    private final Decimal min_tick_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String name;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "quoteCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 3)
    private final UUID quote_currency;

    @WireField(adapter = "rosetta.mainst.Tradability#ADAPTER", jsonName = "rhcTradability", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 10)
    private final Tradability rhc_tradability;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "spotCurrencyPair", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 24)
    private final UUID spot_currency_pair;

    @WireField(adapter = "rosetta.mainst.InstrumentState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 15)
    private final InstrumentState state;

    @WireField(adapter = "rosetta.mainst.InstrumentState#ADAPTER", jsonName = "stateByRegion", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 18, tag = 20)
    private final Map<String, InstrumentState> state_by_region;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 14)
    private final String symbol;

    @WireField(adapter = "com.robinhood.rosetta.mainst.ThirdPartyRouterCoinSpec#ADAPTER", jsonName = "thirdPartyRouterCoinSpec", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 21, tag = 23)
    private final Map<String, ThirdPartyRouterCoinSpec> third_party_router_coin_spec;

    @WireField(adapter = "rosetta.mainst.Tradability#ADAPTER", jsonName = "tradabilityByRegion", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 20, tag = 22)
    private final Map<String, Tradability> tradability_by_region;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "underlyingEquityInstrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 25)
    private final UUID underlying_equity_instrument_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final Time updated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "venueSymbols", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 15, tag = 13)
    private final Map<String, String> venue_symbols;

    @JvmField
    public static final ProtoAdapter<CurrencyPairDetails> ADAPTER = new CurrencyPairDetails2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(CurrencyPairDetails.class), Syntax.PROTO_3);

    public CurrencyPairDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
    }

    public /* synthetic */ CurrencyPairDetails(String str, String str2, InstrumentState instrumentState, Decimal decimal, UUID uuid, UUID uuid2, Decimal decimal2, Decimal decimal3, Decimal decimal4, Decimal decimal5, Decimal decimal6, Decimal decimal7, Tradability tradability, boolean z, Map map, Map map2, Time time, Time time2, Map map3, CurrencyPairType currencyPairType, Map map4, Map map5, UUID uuid3, UUID uuid4, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? InstrumentState.INSTRUMENT_STATE_UNSPECIFIED : instrumentState, (i & 8) != 0 ? null : decimal, (i & 16) != 0 ? null : uuid, (i & 32) != 0 ? null : uuid2, (i & 64) != 0 ? null : decimal2, (i & 128) != 0 ? null : decimal3, (i & 256) != 0 ? null : decimal4, (i & 512) != 0 ? null : decimal5, (i & 1024) != 0 ? null : decimal6, (i & 2048) != 0 ? null : decimal7, (i & 4096) != 0 ? Tradability.TRADABILITY_UNSPECIFIED : tradability, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? MapsKt.emptyMap() : map, (i & 32768) != 0 ? MapsKt.emptyMap() : map2, (i & 65536) != 0 ? null : time, (i & 131072) != 0 ? null : time2, (i & 262144) != 0 ? MapsKt.emptyMap() : map3, (i & 524288) != 0 ? CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED : currencyPairType, (i & 1048576) != 0 ? MapsKt.emptyMap() : map4, (i & 2097152) != 0 ? MapsKt.emptyMap() : map5, (i & 4194304) != 0 ? null : uuid3, (i & 8388608) != 0 ? null : uuid4, (i & 16777216) == 0 ? str3 : "", (i & 33554432) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24647newBuilder();
    }

    public final String getName() {
        return this.name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final InstrumentState getState() {
        return this.state;
    }

    public final Decimal getMin_tick_size() {
        return this.min_tick_size;
    }

    public final UUID getAsset_currency() {
        return this.asset_currency;
    }

    public final UUID getQuote_currency() {
        return this.quote_currency;
    }

    public final Decimal getMin_order_size() {
        return this.min_order_size;
    }

    public final Decimal getMax_order_size() {
        return this.max_order_size;
    }

    public final Decimal getMin_order_price_increment() {
        return this.min_order_price_increment;
    }

    public final Decimal getMin_order_quantity_increment() {
        return this.min_order_quantity_increment;
    }

    public final Decimal getMin_quote_price_increment() {
        return this.min_quote_price_increment;
    }

    public final Decimal getMin_quote_quantity_increment() {
        return this.min_quote_quantity_increment;
    }

    public final Tradability getRhc_tradability() {
        return this.rhc_tradability;
    }

    public final boolean getFundamentals_enabled() {
        return this.fundamentals_enabled;
    }

    public final Time getCreated_at() {
        return this.created_at;
    }

    public final Time getUpdated_at() {
        return this.updated_at;
    }

    public final CurrencyPairType getCurrency_pair_type() {
        return this.currency_pair_type;
    }

    public final UUID getSpot_currency_pair() {
        return this.spot_currency_pair;
    }

    public final UUID getUnderlying_equity_instrument_id() {
        return this.underlying_equity_instrument_id;
    }

    public final String getDescription() {
        return this.description;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyPairDetails(String name, String symbol, InstrumentState state, Decimal decimal, UUID uuid, UUID uuid2, Decimal decimal2, Decimal decimal3, Decimal decimal4, Decimal decimal5, Decimal decimal6, Decimal decimal7, Tradability rhc_tradability, boolean z, Map<String, String> crypto_metadata, Map<String, String> venue_symbols, Time time, Time time2, Map<String, ? extends InstrumentState> state_by_region, CurrencyPairType currency_pair_type, Map<String, ? extends Tradability> tradability_by_region, Map<String, ThirdPartyRouterCoinSpec> third_party_router_coin_spec, UUID uuid3, UUID uuid4, String description, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rhc_tradability, "rhc_tradability");
        Intrinsics.checkNotNullParameter(crypto_metadata, "crypto_metadata");
        Intrinsics.checkNotNullParameter(venue_symbols, "venue_symbols");
        Intrinsics.checkNotNullParameter(state_by_region, "state_by_region");
        Intrinsics.checkNotNullParameter(currency_pair_type, "currency_pair_type");
        Intrinsics.checkNotNullParameter(tradability_by_region, "tradability_by_region");
        Intrinsics.checkNotNullParameter(third_party_router_coin_spec, "third_party_router_coin_spec");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.name = name;
        this.symbol = symbol;
        this.state = state;
        this.min_tick_size = decimal;
        this.asset_currency = uuid;
        this.quote_currency = uuid2;
        this.min_order_size = decimal2;
        this.max_order_size = decimal3;
        this.min_order_price_increment = decimal4;
        this.min_order_quantity_increment = decimal5;
        this.min_quote_price_increment = decimal6;
        this.min_quote_quantity_increment = decimal7;
        this.rhc_tradability = rhc_tradability;
        this.fundamentals_enabled = z;
        this.created_at = time;
        this.updated_at = time2;
        this.currency_pair_type = currency_pair_type;
        this.spot_currency_pair = uuid3;
        this.underlying_equity_instrument_id = uuid4;
        this.description = description;
        this.crypto_metadata = Internal.immutableCopyOf("crypto_metadata", crypto_metadata);
        this.venue_symbols = Internal.immutableCopyOf("venue_symbols", venue_symbols);
        this.state_by_region = Internal.immutableCopyOf("state_by_region", state_by_region);
        this.tradability_by_region = Internal.immutableCopyOf("tradability_by_region", tradability_by_region);
        this.third_party_router_coin_spec = Internal.immutableCopyOf("third_party_router_coin_spec", third_party_router_coin_spec);
    }

    public final Map<String, String> getCrypto_metadata() {
        return this.crypto_metadata;
    }

    public final Map<String, String> getVenue_symbols() {
        return this.venue_symbols;
    }

    public final Map<String, InstrumentState> getState_by_region() {
        return this.state_by_region;
    }

    public final Map<String, Tradability> getTradability_by_region() {
        return this.tradability_by_region;
    }

    public final Map<String, ThirdPartyRouterCoinSpec> getThird_party_router_coin_spec() {
        return this.third_party_router_coin_spec;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24647newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CurrencyPairDetails)) {
            return false;
        }
        CurrencyPairDetails currencyPairDetails = (CurrencyPairDetails) other;
        return Intrinsics.areEqual(unknownFields(), currencyPairDetails.unknownFields()) && Intrinsics.areEqual(this.name, currencyPairDetails.name) && Intrinsics.areEqual(this.symbol, currencyPairDetails.symbol) && this.state == currencyPairDetails.state && Intrinsics.areEqual(this.min_tick_size, currencyPairDetails.min_tick_size) && Intrinsics.areEqual(this.asset_currency, currencyPairDetails.asset_currency) && Intrinsics.areEqual(this.quote_currency, currencyPairDetails.quote_currency) && Intrinsics.areEqual(this.min_order_size, currencyPairDetails.min_order_size) && Intrinsics.areEqual(this.max_order_size, currencyPairDetails.max_order_size) && Intrinsics.areEqual(this.min_order_price_increment, currencyPairDetails.min_order_price_increment) && Intrinsics.areEqual(this.min_order_quantity_increment, currencyPairDetails.min_order_quantity_increment) && Intrinsics.areEqual(this.min_quote_price_increment, currencyPairDetails.min_quote_price_increment) && Intrinsics.areEqual(this.min_quote_quantity_increment, currencyPairDetails.min_quote_quantity_increment) && this.rhc_tradability == currencyPairDetails.rhc_tradability && this.fundamentals_enabled == currencyPairDetails.fundamentals_enabled && Intrinsics.areEqual(this.crypto_metadata, currencyPairDetails.crypto_metadata) && Intrinsics.areEqual(this.venue_symbols, currencyPairDetails.venue_symbols) && Intrinsics.areEqual(this.created_at, currencyPairDetails.created_at) && Intrinsics.areEqual(this.updated_at, currencyPairDetails.updated_at) && Intrinsics.areEqual(this.state_by_region, currencyPairDetails.state_by_region) && this.currency_pair_type == currencyPairDetails.currency_pair_type && Intrinsics.areEqual(this.tradability_by_region, currencyPairDetails.tradability_by_region) && Intrinsics.areEqual(this.third_party_router_coin_spec, currencyPairDetails.third_party_router_coin_spec) && Intrinsics.areEqual(this.spot_currency_pair, currencyPairDetails.spot_currency_pair) && Intrinsics.areEqual(this.underlying_equity_instrument_id, currencyPairDetails.underlying_equity_instrument_id) && Intrinsics.areEqual(this.description, currencyPairDetails.description);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.state.hashCode()) * 37;
        Decimal decimal = this.min_tick_size;
        int iHashCode2 = (iHashCode + (decimal != null ? decimal.hashCode() : 0)) * 37;
        UUID uuid = this.asset_currency;
        int iHashCode3 = (iHashCode2 + (uuid != null ? uuid.hashCode() : 0)) * 37;
        UUID uuid2 = this.quote_currency;
        int iHashCode4 = (iHashCode3 + (uuid2 != null ? uuid2.hashCode() : 0)) * 37;
        Decimal decimal2 = this.min_order_size;
        int iHashCode5 = (iHashCode4 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        Decimal decimal3 = this.max_order_size;
        int iHashCode6 = (iHashCode5 + (decimal3 != null ? decimal3.hashCode() : 0)) * 37;
        Decimal decimal4 = this.min_order_price_increment;
        int iHashCode7 = (iHashCode6 + (decimal4 != null ? decimal4.hashCode() : 0)) * 37;
        Decimal decimal5 = this.min_order_quantity_increment;
        int iHashCode8 = (iHashCode7 + (decimal5 != null ? decimal5.hashCode() : 0)) * 37;
        Decimal decimal6 = this.min_quote_price_increment;
        int iHashCode9 = (iHashCode8 + (decimal6 != null ? decimal6.hashCode() : 0)) * 37;
        Decimal decimal7 = this.min_quote_quantity_increment;
        int iHashCode10 = (((((((((iHashCode9 + (decimal7 != null ? decimal7.hashCode() : 0)) * 37) + this.rhc_tradability.hashCode()) * 37) + Boolean.hashCode(this.fundamentals_enabled)) * 37) + this.crypto_metadata.hashCode()) * 37) + this.venue_symbols.hashCode()) * 37;
        Time time = this.created_at;
        int iHashCode11 = (iHashCode10 + (time != null ? time.hashCode() : 0)) * 37;
        Time time2 = this.updated_at;
        int iHashCode12 = (((((((((iHashCode11 + (time2 != null ? time2.hashCode() : 0)) * 37) + this.state_by_region.hashCode()) * 37) + this.currency_pair_type.hashCode()) * 37) + this.tradability_by_region.hashCode()) * 37) + this.third_party_router_coin_spec.hashCode()) * 37;
        UUID uuid3 = this.spot_currency_pair;
        int iHashCode13 = (iHashCode12 + (uuid3 != null ? uuid3.hashCode() : 0)) * 37;
        UUID uuid4 = this.underlying_equity_instrument_id;
        int iHashCode14 = ((iHashCode13 + (uuid4 != null ? uuid4.hashCode() : 0)) * 37) + this.description.hashCode();
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("state=" + this.state);
        Decimal decimal = this.min_tick_size;
        if (decimal != null) {
            arrayList.add("min_tick_size=" + decimal);
        }
        UUID uuid = this.asset_currency;
        if (uuid != null) {
            arrayList.add("asset_currency=" + uuid);
        }
        UUID uuid2 = this.quote_currency;
        if (uuid2 != null) {
            arrayList.add("quote_currency=" + uuid2);
        }
        Decimal decimal2 = this.min_order_size;
        if (decimal2 != null) {
            arrayList.add("min_order_size=" + decimal2);
        }
        Decimal decimal3 = this.max_order_size;
        if (decimal3 != null) {
            arrayList.add("max_order_size=" + decimal3);
        }
        Decimal decimal4 = this.min_order_price_increment;
        if (decimal4 != null) {
            arrayList.add("min_order_price_increment=" + decimal4);
        }
        Decimal decimal5 = this.min_order_quantity_increment;
        if (decimal5 != null) {
            arrayList.add("min_order_quantity_increment=" + decimal5);
        }
        Decimal decimal6 = this.min_quote_price_increment;
        if (decimal6 != null) {
            arrayList.add("min_quote_price_increment=" + decimal6);
        }
        Decimal decimal7 = this.min_quote_quantity_increment;
        if (decimal7 != null) {
            arrayList.add("min_quote_quantity_increment=" + decimal7);
        }
        arrayList.add("rhc_tradability=" + this.rhc_tradability);
        arrayList.add("fundamentals_enabled=" + this.fundamentals_enabled);
        if (!this.crypto_metadata.isEmpty()) {
            arrayList.add("crypto_metadata=" + this.crypto_metadata);
        }
        if (!this.venue_symbols.isEmpty()) {
            arrayList.add("venue_symbols=" + this.venue_symbols);
        }
        Time time = this.created_at;
        if (time != null) {
            arrayList.add("created_at=" + time);
        }
        Time time2 = this.updated_at;
        if (time2 != null) {
            arrayList.add("updated_at=" + time2);
        }
        if (!this.state_by_region.isEmpty()) {
            arrayList.add("state_by_region=" + this.state_by_region);
        }
        arrayList.add("currency_pair_type=" + this.currency_pair_type);
        if (!this.tradability_by_region.isEmpty()) {
            arrayList.add("tradability_by_region=" + this.tradability_by_region);
        }
        if (!this.third_party_router_coin_spec.isEmpty()) {
            arrayList.add("third_party_router_coin_spec=" + this.third_party_router_coin_spec);
        }
        UUID uuid3 = this.spot_currency_pair;
        if (uuid3 != null) {
            arrayList.add("spot_currency_pair=" + uuid3);
        }
        UUID uuid4 = this.underlying_equity_instrument_id;
        if (uuid4 != null) {
            arrayList.add("underlying_equity_instrument_id=" + uuid4);
        }
        arrayList.add("description=" + Internal.sanitize(this.description));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CurrencyPairDetails{", "}", 0, null, null, 56, null);
    }

    public final CurrencyPairDetails copy(String name, String symbol, InstrumentState state, Decimal min_tick_size, UUID asset_currency, UUID quote_currency, Decimal min_order_size, Decimal max_order_size, Decimal min_order_price_increment, Decimal min_order_quantity_increment, Decimal min_quote_price_increment, Decimal min_quote_quantity_increment, Tradability rhc_tradability, boolean fundamentals_enabled, Map<String, String> crypto_metadata, Map<String, String> venue_symbols, Time created_at, Time updated_at, Map<String, ? extends InstrumentState> state_by_region, CurrencyPairType currency_pair_type, Map<String, ? extends Tradability> tradability_by_region, Map<String, ThirdPartyRouterCoinSpec> third_party_router_coin_spec, UUID spot_currency_pair, UUID underlying_equity_instrument_id, String description, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rhc_tradability, "rhc_tradability");
        Intrinsics.checkNotNullParameter(crypto_metadata, "crypto_metadata");
        Intrinsics.checkNotNullParameter(venue_symbols, "venue_symbols");
        Intrinsics.checkNotNullParameter(state_by_region, "state_by_region");
        Intrinsics.checkNotNullParameter(currency_pair_type, "currency_pair_type");
        Intrinsics.checkNotNullParameter(tradability_by_region, "tradability_by_region");
        Intrinsics.checkNotNullParameter(third_party_router_coin_spec, "third_party_router_coin_spec");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CurrencyPairDetails(name, symbol, state, min_tick_size, asset_currency, quote_currency, min_order_size, max_order_size, min_order_price_increment, min_order_quantity_increment, min_quote_price_increment, min_quote_quantity_increment, rhc_tradability, fundamentals_enabled, crypto_metadata, venue_symbols, created_at, updated_at, state_by_region, currency_pair_type, tradability_by_region, third_party_router_coin_spec, spot_currency_pair, underlying_equity_instrument_id, description, unknownFields);
    }
}

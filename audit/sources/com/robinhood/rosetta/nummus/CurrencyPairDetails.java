package com.robinhood.rosetta.nummus;

import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.nummus.CurrencyPairDetails;
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
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: CurrencyPairDetails.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006>?@ABCB±\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00106\u001a\u00020\u0002H\u0017J\u0013\u00107\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u000109H\u0096\u0002J\b\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020\bH\u0016J°\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0016\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0016\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u001a\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#¨\u0006D"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetails;", "Lcom/squareup/wire/Message;", "", "id", "Lokio/ByteString;", "tradability", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Tradability;", "asset_currency_code", "", "asset_currency_name", "asset_currency_id", "asset_currency_increment", "asset_currency_hidden", "", "min_order_quantity_increment", "min_order_price_increment", "min_order_size", "region", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Region;", "symbol", "type", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$CurrencyPairType;", "ncw_upsell_state", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$NcwUpsellState;", "tokenized_stock_subtype", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$TokenizedStockSubtype;", "market_cap", "unknownFields", "<init>", "(Lokio/ByteString;Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Tradability;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Region;Ljava/lang/String;Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$CurrencyPairType;Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$NcwUpsellState;Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$TokenizedStockSubtype;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Lokio/ByteString;", "getTradability", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Tradability;", "getAsset_currency_code", "()Ljava/lang/String;", "getAsset_currency_name", "getAsset_currency_id", "getAsset_currency_increment", "getAsset_currency_hidden", "()Z", "getMin_order_quantity_increment", "getMin_order_price_increment", "getMin_order_size", "getRegion", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Region;", "getSymbol", "getType", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$CurrencyPairType;", "getNcw_upsell_state", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$NcwUpsellState;", "getTokenized_stock_subtype", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$TokenizedStockSubtype;", "getMarket_cap", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "Tradability", "Region", "CurrencyPairType", "NcwUpsellState", "TokenizedStockSubtype", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CurrencyPairDetails extends Message {

    @JvmField
    public static final ProtoAdapter<CurrencyPairDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String asset_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "assetCurrencyHidden", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final boolean asset_currency_hidden;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "assetCurrencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final ByteString asset_currency_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetCurrencyIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String asset_currency_increment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetCurrencyName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String asset_currency_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "marketCap", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String market_cap;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minOrderPriceIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String min_order_price_increment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minOrderQuantityIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String min_order_quantity_increment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minOrderSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String min_order_size;

    @WireField(adapter = "com.robinhood.rosetta.nummus.CurrencyPairDetails$NcwUpsellState#ADAPTER", jsonName = "ncwUpsellState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final NcwUpsellState ncw_upsell_state;

    @WireField(adapter = "com.robinhood.rosetta.nummus.CurrencyPairDetails$Region#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Region region;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String symbol;

    @WireField(adapter = "com.robinhood.rosetta.nummus.CurrencyPairDetails$TokenizedStockSubtype#ADAPTER", jsonName = "tokenizedStockSubtype", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final TokenizedStockSubtype tokenized_stock_subtype;

    @WireField(adapter = "com.robinhood.rosetta.nummus.CurrencyPairDetails$Tradability#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Tradability tradability;

    @WireField(adapter = "com.robinhood.rosetta.nummus.CurrencyPairDetails$CurrencyPairType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final CurrencyPairType type;

    public CurrencyPairDetails() {
        this(null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24731newBuilder();
    }

    public final ByteString getId() {
        return this.id;
    }

    public /* synthetic */ CurrencyPairDetails(ByteString byteString, Tradability tradability, String str, String str2, ByteString byteString2, String str3, boolean z, String str4, String str5, String str6, Region region, String str7, CurrencyPairType currencyPairType, NcwUpsellState ncwUpsellState, TokenizedStockSubtype tokenizedStockSubtype, String str8, ByteString byteString3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? Tradability.BUY_ONLY : tradability, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? false : z, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? Region.f6188US : region, (i & 2048) != 0 ? "" : str7, (i & 4096) != 0 ? CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED : currencyPairType, (i & 8192) != 0 ? NcwUpsellState.UNSPECIFIED : ncwUpsellState, (i & 16384) != 0 ? TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED : tokenizedStockSubtype, (i & 32768) == 0 ? str8 : "", (i & 65536) != 0 ? ByteString.EMPTY : byteString3);
    }

    public final Tradability getTradability() {
        return this.tradability;
    }

    public final String getAsset_currency_code() {
        return this.asset_currency_code;
    }

    public final String getAsset_currency_name() {
        return this.asset_currency_name;
    }

    public final ByteString getAsset_currency_id() {
        return this.asset_currency_id;
    }

    public final String getAsset_currency_increment() {
        return this.asset_currency_increment;
    }

    public final boolean getAsset_currency_hidden() {
        return this.asset_currency_hidden;
    }

    public final String getMin_order_quantity_increment() {
        return this.min_order_quantity_increment;
    }

    public final String getMin_order_price_increment() {
        return this.min_order_price_increment;
    }

    public final String getMin_order_size() {
        return this.min_order_size;
    }

    public final Region getRegion() {
        return this.region;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final CurrencyPairType getType() {
        return this.type;
    }

    public final NcwUpsellState getNcw_upsell_state() {
        return this.ncw_upsell_state;
    }

    public final TokenizedStockSubtype getTokenized_stock_subtype() {
        return this.tokenized_stock_subtype;
    }

    public final String getMarket_cap() {
        return this.market_cap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyPairDetails(ByteString id, Tradability tradability, String asset_currency_code, String asset_currency_name, ByteString asset_currency_id, String asset_currency_increment, boolean z, String min_order_quantity_increment, String min_order_price_increment, String min_order_size, Region region, String symbol, CurrencyPairType type2, NcwUpsellState ncw_upsell_state, TokenizedStockSubtype tokenized_stock_subtype, String market_cap, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(asset_currency_name, "asset_currency_name");
        Intrinsics.checkNotNullParameter(asset_currency_id, "asset_currency_id");
        Intrinsics.checkNotNullParameter(asset_currency_increment, "asset_currency_increment");
        Intrinsics.checkNotNullParameter(min_order_quantity_increment, "min_order_quantity_increment");
        Intrinsics.checkNotNullParameter(min_order_price_increment, "min_order_price_increment");
        Intrinsics.checkNotNullParameter(min_order_size, "min_order_size");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(ncw_upsell_state, "ncw_upsell_state");
        Intrinsics.checkNotNullParameter(tokenized_stock_subtype, "tokenized_stock_subtype");
        Intrinsics.checkNotNullParameter(market_cap, "market_cap");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.tradability = tradability;
        this.asset_currency_code = asset_currency_code;
        this.asset_currency_name = asset_currency_name;
        this.asset_currency_id = asset_currency_id;
        this.asset_currency_increment = asset_currency_increment;
        this.asset_currency_hidden = z;
        this.min_order_quantity_increment = min_order_quantity_increment;
        this.min_order_price_increment = min_order_price_increment;
        this.min_order_size = min_order_size;
        this.region = region;
        this.symbol = symbol;
        this.type = type2;
        this.ncw_upsell_state = ncw_upsell_state;
        this.tokenized_stock_subtype = tokenized_stock_subtype;
        this.market_cap = market_cap;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24731newBuilder() {
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
        return Intrinsics.areEqual(unknownFields(), currencyPairDetails.unknownFields()) && Intrinsics.areEqual(this.id, currencyPairDetails.id) && this.tradability == currencyPairDetails.tradability && Intrinsics.areEqual(this.asset_currency_code, currencyPairDetails.asset_currency_code) && Intrinsics.areEqual(this.asset_currency_name, currencyPairDetails.asset_currency_name) && Intrinsics.areEqual(this.asset_currency_id, currencyPairDetails.asset_currency_id) && Intrinsics.areEqual(this.asset_currency_increment, currencyPairDetails.asset_currency_increment) && this.asset_currency_hidden == currencyPairDetails.asset_currency_hidden && Intrinsics.areEqual(this.min_order_quantity_increment, currencyPairDetails.min_order_quantity_increment) && Intrinsics.areEqual(this.min_order_price_increment, currencyPairDetails.min_order_price_increment) && Intrinsics.areEqual(this.min_order_size, currencyPairDetails.min_order_size) && this.region == currencyPairDetails.region && Intrinsics.areEqual(this.symbol, currencyPairDetails.symbol) && this.type == currencyPairDetails.type && this.ncw_upsell_state == currencyPairDetails.ncw_upsell_state && this.tokenized_stock_subtype == currencyPairDetails.tokenized_stock_subtype && Intrinsics.areEqual(this.market_cap, currencyPairDetails.market_cap);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.tradability.hashCode()) * 37) + this.asset_currency_code.hashCode()) * 37) + this.asset_currency_name.hashCode()) * 37) + this.asset_currency_id.hashCode()) * 37) + this.asset_currency_increment.hashCode()) * 37) + Boolean.hashCode(this.asset_currency_hidden)) * 37) + this.min_order_quantity_increment.hashCode()) * 37) + this.min_order_price_increment.hashCode()) * 37) + this.min_order_size.hashCode()) * 37) + this.region.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.type.hashCode()) * 37) + this.ncw_upsell_state.hashCode()) * 37) + this.tokenized_stock_subtype.hashCode()) * 37) + this.market_cap.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        arrayList.add("tradability=" + this.tradability);
        arrayList.add("asset_currency_code=" + Internal.sanitize(this.asset_currency_code));
        arrayList.add("asset_currency_name=" + Internal.sanitize(this.asset_currency_name));
        arrayList.add("asset_currency_id=" + this.asset_currency_id);
        arrayList.add("asset_currency_increment=" + Internal.sanitize(this.asset_currency_increment));
        arrayList.add("asset_currency_hidden=" + this.asset_currency_hidden);
        arrayList.add("min_order_quantity_increment=" + Internal.sanitize(this.min_order_quantity_increment));
        arrayList.add("min_order_price_increment=" + Internal.sanitize(this.min_order_price_increment));
        arrayList.add("min_order_size=" + Internal.sanitize(this.min_order_size));
        arrayList.add("region=" + this.region);
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("type=" + this.type);
        arrayList.add("ncw_upsell_state=" + this.ncw_upsell_state);
        arrayList.add("tokenized_stock_subtype=" + this.tokenized_stock_subtype);
        arrayList.add("market_cap=" + Internal.sanitize(this.market_cap));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CurrencyPairDetails{", "}", 0, null, null, 56, null);
    }

    public final CurrencyPairDetails copy(ByteString id, Tradability tradability, String asset_currency_code, String asset_currency_name, ByteString asset_currency_id, String asset_currency_increment, boolean asset_currency_hidden, String min_order_quantity_increment, String min_order_price_increment, String min_order_size, Region region, String symbol, CurrencyPairType type2, NcwUpsellState ncw_upsell_state, TokenizedStockSubtype tokenized_stock_subtype, String market_cap, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(asset_currency_name, "asset_currency_name");
        Intrinsics.checkNotNullParameter(asset_currency_id, "asset_currency_id");
        Intrinsics.checkNotNullParameter(asset_currency_increment, "asset_currency_increment");
        Intrinsics.checkNotNullParameter(min_order_quantity_increment, "min_order_quantity_increment");
        Intrinsics.checkNotNullParameter(min_order_price_increment, "min_order_price_increment");
        Intrinsics.checkNotNullParameter(min_order_size, "min_order_size");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(ncw_upsell_state, "ncw_upsell_state");
        Intrinsics.checkNotNullParameter(tokenized_stock_subtype, "tokenized_stock_subtype");
        Intrinsics.checkNotNullParameter(market_cap, "market_cap");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CurrencyPairDetails(id, tradability, asset_currency_code, asset_currency_name, asset_currency_id, asset_currency_increment, asset_currency_hidden, min_order_quantity_increment, min_order_price_increment, min_order_size, region, symbol, type2, ncw_upsell_state, tokenized_stock_subtype, market_cap, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CurrencyPairDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CurrencyPairDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.nummus.CurrencyPairDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CurrencyPairDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ByteString id = value.getId();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(id, byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getId());
                }
                if (value.getTradability() != CurrencyPairDetails.Tradability.BUY_ONLY) {
                    size += CurrencyPairDetails.Tradability.ADAPTER.encodedSizeWithTag(2, value.getTradability());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAsset_currency_code());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAsset_currency_name());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_id(), byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(5, value.getAsset_currency_id());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_increment(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getAsset_currency_increment());
                }
                if (value.getAsset_currency_hidden()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getAsset_currency_hidden()));
                }
                if (!Intrinsics.areEqual(value.getMin_order_quantity_increment(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getMin_order_quantity_increment());
                }
                if (!Intrinsics.areEqual(value.getMin_order_price_increment(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getMin_order_price_increment());
                }
                if (!Intrinsics.areEqual(value.getMin_order_size(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getMin_order_size());
                }
                if (value.getRegion() != CurrencyPairDetails.Region.f6188US) {
                    size += CurrencyPairDetails.Region.ADAPTER.encodedSizeWithTag(11, value.getRegion());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getSymbol());
                }
                if (value.getType() != CurrencyPairDetails.CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED) {
                    size += CurrencyPairDetails.CurrencyPairType.ADAPTER.encodedSizeWithTag(13, value.getType());
                }
                if (value.getNcw_upsell_state() != CurrencyPairDetails.NcwUpsellState.UNSPECIFIED) {
                    size += CurrencyPairDetails.NcwUpsellState.ADAPTER.encodedSizeWithTag(14, value.getNcw_upsell_state());
                }
                if (value.getTokenized_stock_subtype() != CurrencyPairDetails.TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED) {
                    size += CurrencyPairDetails.TokenizedStockSubtype.ADAPTER.encodedSizeWithTag(15, value.getTokenized_stock_subtype());
                }
                return !Intrinsics.areEqual(value.getMarket_cap(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(16, value.getMarket_cap()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CurrencyPairDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ByteString id = value.getId();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getTradability() != CurrencyPairDetails.Tradability.BUY_ONLY) {
                    CurrencyPairDetails.Tradability.ADAPTER.encodeWithTag(writer, 2, (int) value.getTradability());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAsset_currency_code());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAsset_currency_name());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 5, (int) value.getAsset_currency_id());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAsset_currency_increment());
                }
                if (value.getAsset_currency_hidden()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getAsset_currency_hidden()));
                }
                if (!Intrinsics.areEqual(value.getMin_order_quantity_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getMin_order_quantity_increment());
                }
                if (!Intrinsics.areEqual(value.getMin_order_price_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getMin_order_price_increment());
                }
                if (!Intrinsics.areEqual(value.getMin_order_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getMin_order_size());
                }
                if (value.getRegion() != CurrencyPairDetails.Region.f6188US) {
                    CurrencyPairDetails.Region.ADAPTER.encodeWithTag(writer, 11, (int) value.getRegion());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getSymbol());
                }
                if (value.getType() != CurrencyPairDetails.CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED) {
                    CurrencyPairDetails.CurrencyPairType.ADAPTER.encodeWithTag(writer, 13, (int) value.getType());
                }
                if (value.getNcw_upsell_state() != CurrencyPairDetails.NcwUpsellState.UNSPECIFIED) {
                    CurrencyPairDetails.NcwUpsellState.ADAPTER.encodeWithTag(writer, 14, (int) value.getNcw_upsell_state());
                }
                if (value.getTokenized_stock_subtype() != CurrencyPairDetails.TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED) {
                    CurrencyPairDetails.TokenizedStockSubtype.ADAPTER.encodeWithTag(writer, 15, (int) value.getTokenized_stock_subtype());
                }
                if (!Intrinsics.areEqual(value.getMarket_cap(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getMarket_cap());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CurrencyPairDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMarket_cap(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getMarket_cap());
                }
                if (value.getTokenized_stock_subtype() != CurrencyPairDetails.TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED) {
                    CurrencyPairDetails.TokenizedStockSubtype.ADAPTER.encodeWithTag(writer, 15, (int) value.getTokenized_stock_subtype());
                }
                if (value.getNcw_upsell_state() != CurrencyPairDetails.NcwUpsellState.UNSPECIFIED) {
                    CurrencyPairDetails.NcwUpsellState.ADAPTER.encodeWithTag(writer, 14, (int) value.getNcw_upsell_state());
                }
                if (value.getType() != CurrencyPairDetails.CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED) {
                    CurrencyPairDetails.CurrencyPairType.ADAPTER.encodeWithTag(writer, 13, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getSymbol());
                }
                if (value.getRegion() != CurrencyPairDetails.Region.f6188US) {
                    CurrencyPairDetails.Region.ADAPTER.encodeWithTag(writer, 11, (int) value.getRegion());
                }
                if (!Intrinsics.areEqual(value.getMin_order_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getMin_order_size());
                }
                if (!Intrinsics.areEqual(value.getMin_order_price_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getMin_order_price_increment());
                }
                if (!Intrinsics.areEqual(value.getMin_order_quantity_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getMin_order_quantity_increment());
                }
                if (value.getAsset_currency_hidden()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getAsset_currency_hidden()));
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAsset_currency_increment());
                }
                ByteString asset_currency_id = value.getAsset_currency_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(asset_currency_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 5, (int) value.getAsset_currency_id());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAsset_currency_name());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAsset_currency_code());
                }
                if (value.getTradability() != CurrencyPairDetails.Tradability.BUY_ONLY) {
                    CurrencyPairDetails.Tradability.ADAPTER.encodeWithTag(writer, 2, (int) value.getTradability());
                }
                if (Intrinsics.areEqual(value.getId(), byteString)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CurrencyPairDetails decode(ProtoReader reader) throws IOException {
                ByteString byteString;
                CurrencyPairDetails.Tradability tradability;
                CurrencyPairDetails.Region region;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteString2 = ByteString.EMPTY;
                CurrencyPairDetails.Tradability tradability2 = CurrencyPairDetails.Tradability.BUY_ONLY;
                CurrencyPairDetails.Region region2 = CurrencyPairDetails.Region.f6188US;
                CurrencyPairDetails.CurrencyPairType currencyPairType = CurrencyPairDetails.CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED;
                CurrencyPairDetails.NcwUpsellState ncwUpsellState = CurrencyPairDetails.NcwUpsellState.UNSPECIFIED;
                CurrencyPairDetails.TokenizedStockSubtype tokenizedStockSubtype = CurrencyPairDetails.TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ByteString byteStringDecode = byteString2;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                boolean zBooleanValue = false;
                CurrencyPairDetails.NcwUpsellState ncwUpsellStateDecode = ncwUpsellState;
                CurrencyPairDetails.TokenizedStockSubtype tokenizedStockSubtypeDecode = tokenizedStockSubtype;
                CurrencyPairDetails.Region regionDecode = region2;
                CurrencyPairDetails.CurrencyPairType currencyPairTypeDecode = currencyPairType;
                ByteString byteStringDecode2 = byteStringDecode;
                CurrencyPairDetails.Tradability tradabilityDecode = tradability2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 2:
                                byteString = byteStringDecode2;
                                tradability = tradabilityDecode;
                                region = regionDecode;
                                try {
                                    tradabilityDecode = CurrencyPairDetails.Tradability.ADAPTER.decode(reader);
                                    byteStringDecode2 = byteString;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                regionDecode = region;
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                byteString = byteStringDecode2;
                                tradability = tradabilityDecode;
                                region = regionDecode;
                                try {
                                    regionDecode = CurrencyPairDetails.Region.ADAPTER.decode(reader);
                                    byteStringDecode2 = byteString;
                                    tradabilityDecode = tradability;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 12:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                byteString = byteStringDecode2;
                                tradability = tradabilityDecode;
                                region = regionDecode;
                                try {
                                    currencyPairTypeDecode = CurrencyPairDetails.CurrencyPairType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                }
                                byteStringDecode2 = byteString;
                                tradabilityDecode = tradability;
                                regionDecode = region;
                                break;
                            case 14:
                                byteString = byteStringDecode2;
                                tradability = tradabilityDecode;
                                region = regionDecode;
                                try {
                                    ncwUpsellStateDecode = CurrencyPairDetails.NcwUpsellState.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                }
                                byteStringDecode2 = byteString;
                                tradabilityDecode = tradability;
                                regionDecode = region;
                                break;
                            case 15:
                                try {
                                    tokenizedStockSubtypeDecode = CurrencyPairDetails.TokenizedStockSubtype.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    byteString = byteStringDecode2;
                                    tradability = tradabilityDecode;
                                    region = regionDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                            case 16:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                byteString = byteStringDecode2;
                                tradability = tradabilityDecode;
                                region = regionDecode;
                                byteStringDecode2 = byteString;
                                tradabilityDecode = tradability;
                                regionDecode = region;
                                break;
                        }
                    } else {
                        return new CurrencyPairDetails(byteStringDecode, tradabilityDecode, strDecode, strDecode2, byteStringDecode2, strDecode3, zBooleanValue, strDecode4, strDecode5, strDecode6, regionDecode, strDecode7, currencyPairTypeDecode, ncwUpsellStateDecode, tokenizedStockSubtypeDecode, strDecode8, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CurrencyPairDetails redact(CurrencyPairDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1) != 0 ? value.id : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2) != 0 ? value.tradability : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4) != 0 ? value.asset_currency_code : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8) != 0 ? value.asset_currency_name : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16) != 0 ? value.asset_currency_id : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32) != 0 ? value.asset_currency_increment : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 64) != 0 ? value.asset_currency_hidden : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 128) != 0 ? value.min_order_quantity_increment : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 256) != 0 ? value.min_order_price_increment : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 512) != 0 ? value.min_order_size : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1024) != 0 ? value.region : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2048) != 0 ? value.symbol : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4096) != 0 ? value.type : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8192) != 0 ? value.ncw_upsell_state : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16384) != 0 ? value.tokenized_stock_subtype : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32768) != 0 ? value.market_cap : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 65536) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CurrencyPairDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Tradability;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BUY_ONLY", "SELL_ONLY", "TRADABLE", "UNTRADABLE", "LIMITED", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Tradability implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Tradability[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Tradability> ADAPTER;
        public static final Tradability BUY_ONLY;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Tradability LIMITED;
        public static final Tradability SELL_ONLY;
        public static final Tradability TRADABLE;
        public static final Tradability UNTRADABLE;
        private final int value;

        private static final /* synthetic */ Tradability[] $values() {
            return new Tradability[]{BUY_ONLY, SELL_ONLY, TRADABLE, UNTRADABLE, LIMITED};
        }

        @JvmStatic
        public static final Tradability fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Tradability> getEntries() {
            return $ENTRIES;
        }

        private Tradability(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Tradability tradability = new Tradability("BUY_ONLY", 0, 0);
            BUY_ONLY = tradability;
            SELL_ONLY = new Tradability("SELL_ONLY", 1, 1);
            TRADABLE = new Tradability("TRADABLE", 2, 2);
            UNTRADABLE = new Tradability("UNTRADABLE", 3, 3);
            LIMITED = new Tradability("LIMITED", 4, 4);
            Tradability[] tradabilityArr$values = $values();
            $VALUES = tradabilityArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tradabilityArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Tradability.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Tradability>(orCreateKotlinClass, syntax, tradability) { // from class: com.robinhood.rosetta.nummus.CurrencyPairDetails$Tradability$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CurrencyPairDetails.Tradability fromValue(int value) {
                    return CurrencyPairDetails.Tradability.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CurrencyPairDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Tradability$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Tradability;", "fromValue", "value", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Tradability fromValue(int value) {
                if (value == 0) {
                    return Tradability.BUY_ONLY;
                }
                if (value == 1) {
                    return Tradability.SELL_ONLY;
                }
                if (value == 2) {
                    return Tradability.TRADABLE;
                }
                if (value == 3) {
                    return Tradability.UNTRADABLE;
                }
                if (value != 4) {
                    return null;
                }
                return Tradability.LIMITED;
            }
        }

        public static Tradability valueOf(String str) {
            return (Tradability) Enum.valueOf(Tradability.class, str);
        }

        public static Tradability[] values() {
            return (Tradability[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CurrencyPairDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Region;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", CountryCode.COUNTRY_CODE_US, "EU", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Region implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Region[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Region> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        /* renamed from: EU */
        public static final Region f6187EU;

        /* renamed from: US */
        public static final Region f6188US;
        private final int value;

        private static final /* synthetic */ Region[] $values() {
            return new Region[]{f6188US, f6187EU};
        }

        @JvmStatic
        public static final Region fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Region> getEntries() {
            return $ENTRIES;
        }

        private Region(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Region region = new Region(CountryCode.COUNTRY_CODE_US, 0, 0);
            f6188US = region;
            f6187EU = new Region("EU", 1, 1);
            Region[] regionArr$values = $values();
            $VALUES = regionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(regionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Region.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Region>(orCreateKotlinClass, syntax, region) { // from class: com.robinhood.rosetta.nummus.CurrencyPairDetails$Region$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CurrencyPairDetails.Region fromValue(int value) {
                    return CurrencyPairDetails.Region.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CurrencyPairDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Region$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$Region;", "fromValue", "value", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Region fromValue(int value) {
                if (value == 0) {
                    return Region.f6188US;
                }
                if (value != 1) {
                    return null;
                }
                return Region.f6187EU;
            }
        }

        public static Region valueOf(String str) {
            return (Region) Enum.valueOf(Region.class, str);
        }

        public static Region[] values() {
            return (Region[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CurrencyPairDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$CurrencyPairType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CURRENCY_PAIR_TYPE_UNSPECIFIED", "CURRENCY_PAIR_TYPE_FIAT", "CURRENCY_PAIR_TYPE_CRYPTOCURRENCY", "CURRENCY_PAIR_TYPE_PERPETUAL", "CURRENCY_PAIR_TYPE_TOKENIZED_STOCK", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class CurrencyPairType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CurrencyPairType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CurrencyPairType> ADAPTER;
        public static final CurrencyPairType CURRENCY_PAIR_TYPE_CRYPTOCURRENCY;
        public static final CurrencyPairType CURRENCY_PAIR_TYPE_FIAT;
        public static final CurrencyPairType CURRENCY_PAIR_TYPE_PERPETUAL;
        public static final CurrencyPairType CURRENCY_PAIR_TYPE_TOKENIZED_STOCK;
        public static final CurrencyPairType CURRENCY_PAIR_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ CurrencyPairType[] $values() {
            return new CurrencyPairType[]{CURRENCY_PAIR_TYPE_UNSPECIFIED, CURRENCY_PAIR_TYPE_FIAT, CURRENCY_PAIR_TYPE_CRYPTOCURRENCY, CURRENCY_PAIR_TYPE_PERPETUAL, CURRENCY_PAIR_TYPE_TOKENIZED_STOCK};
        }

        @JvmStatic
        public static final CurrencyPairType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CurrencyPairType> getEntries() {
            return $ENTRIES;
        }

        private CurrencyPairType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CurrencyPairType currencyPairType = new CurrencyPairType("CURRENCY_PAIR_TYPE_UNSPECIFIED", 0, 0);
            CURRENCY_PAIR_TYPE_UNSPECIFIED = currencyPairType;
            CURRENCY_PAIR_TYPE_FIAT = new CurrencyPairType("CURRENCY_PAIR_TYPE_FIAT", 1, 1);
            CURRENCY_PAIR_TYPE_CRYPTOCURRENCY = new CurrencyPairType("CURRENCY_PAIR_TYPE_CRYPTOCURRENCY", 2, 2);
            CURRENCY_PAIR_TYPE_PERPETUAL = new CurrencyPairType("CURRENCY_PAIR_TYPE_PERPETUAL", 3, 3);
            CURRENCY_PAIR_TYPE_TOKENIZED_STOCK = new CurrencyPairType("CURRENCY_PAIR_TYPE_TOKENIZED_STOCK", 4, 4);
            CurrencyPairType[] currencyPairTypeArr$values = $values();
            $VALUES = currencyPairTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(currencyPairTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CurrencyPairType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CurrencyPairType>(orCreateKotlinClass, syntax, currencyPairType) { // from class: com.robinhood.rosetta.nummus.CurrencyPairDetails$CurrencyPairType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CurrencyPairDetails.CurrencyPairType fromValue(int value) {
                    return CurrencyPairDetails.CurrencyPairType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CurrencyPairDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$CurrencyPairType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$CurrencyPairType;", "fromValue", "value", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CurrencyPairType fromValue(int value) {
                if (value == 0) {
                    return CurrencyPairType.CURRENCY_PAIR_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return CurrencyPairType.CURRENCY_PAIR_TYPE_FIAT;
                }
                if (value == 2) {
                    return CurrencyPairType.CURRENCY_PAIR_TYPE_CRYPTOCURRENCY;
                }
                if (value == 3) {
                    return CurrencyPairType.CURRENCY_PAIR_TYPE_PERPETUAL;
                }
                if (value != 4) {
                    return null;
                }
                return CurrencyPairType.CURRENCY_PAIR_TYPE_TOKENIZED_STOCK;
            }
        }

        public static CurrencyPairType valueOf(String str) {
            return (CurrencyPairType) Enum.valueOf(CurrencyPairType.class, str);
        }

        public static CurrencyPairType[] values() {
            return (CurrencyPairType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CurrencyPairDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$NcwUpsellState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", EducationTourScreenNames.UNSPECIFIED_SCREEN, "ACTIVE", "INACTIVE", "REVIEW", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class NcwUpsellState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NcwUpsellState[] $VALUES;
        public static final NcwUpsellState ACTIVE;

        @JvmField
        public static final ProtoAdapter<NcwUpsellState> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final NcwUpsellState INACTIVE;
        public static final NcwUpsellState REVIEW;
        public static final NcwUpsellState UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ NcwUpsellState[] $values() {
            return new NcwUpsellState[]{UNSPECIFIED, ACTIVE, INACTIVE, REVIEW};
        }

        @JvmStatic
        public static final NcwUpsellState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<NcwUpsellState> getEntries() {
            return $ENTRIES;
        }

        private NcwUpsellState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final NcwUpsellState ncwUpsellState = new NcwUpsellState(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, 0);
            UNSPECIFIED = ncwUpsellState;
            ACTIVE = new NcwUpsellState("ACTIVE", 1, 1);
            INACTIVE = new NcwUpsellState("INACTIVE", 2, 2);
            REVIEW = new NcwUpsellState("REVIEW", 3, 3);
            NcwUpsellState[] ncwUpsellStateArr$values = $values();
            $VALUES = ncwUpsellStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(ncwUpsellStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NcwUpsellState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<NcwUpsellState>(orCreateKotlinClass, syntax, ncwUpsellState) { // from class: com.robinhood.rosetta.nummus.CurrencyPairDetails$NcwUpsellState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CurrencyPairDetails.NcwUpsellState fromValue(int value) {
                    return CurrencyPairDetails.NcwUpsellState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CurrencyPairDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$NcwUpsellState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$NcwUpsellState;", "fromValue", "value", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final NcwUpsellState fromValue(int value) {
                if (value == 0) {
                    return NcwUpsellState.UNSPECIFIED;
                }
                if (value == 1) {
                    return NcwUpsellState.ACTIVE;
                }
                if (value == 2) {
                    return NcwUpsellState.INACTIVE;
                }
                if (value != 3) {
                    return null;
                }
                return NcwUpsellState.REVIEW;
            }
        }

        public static NcwUpsellState valueOf(String str) {
            return (NcwUpsellState) Enum.valueOf(NcwUpsellState.class, str);
        }

        public static NcwUpsellState[] values() {
            return (NcwUpsellState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CurrencyPairDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$TokenizedStockSubtype;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED", "TOKENIZED_STOCK_SUBTYPE_STOCK", "TOKENIZED_STOCK_SUBTYPE_ETF", "TOKENIZED_STOCK_SUBTYPE_PRIVATE", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class TokenizedStockSubtype implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TokenizedStockSubtype[] $VALUES;

        @JvmField
        public static final ProtoAdapter<TokenizedStockSubtype> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TokenizedStockSubtype TOKENIZED_STOCK_SUBTYPE_ETF;
        public static final TokenizedStockSubtype TOKENIZED_STOCK_SUBTYPE_PRIVATE;
        public static final TokenizedStockSubtype TOKENIZED_STOCK_SUBTYPE_STOCK;
        public static final TokenizedStockSubtype TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ TokenizedStockSubtype[] $values() {
            return new TokenizedStockSubtype[]{TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED, TOKENIZED_STOCK_SUBTYPE_STOCK, TOKENIZED_STOCK_SUBTYPE_ETF, TOKENIZED_STOCK_SUBTYPE_PRIVATE};
        }

        @JvmStatic
        public static final TokenizedStockSubtype fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<TokenizedStockSubtype> getEntries() {
            return $ENTRIES;
        }

        private TokenizedStockSubtype(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final TokenizedStockSubtype tokenizedStockSubtype = new TokenizedStockSubtype("TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED", 0, 0);
            TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED = tokenizedStockSubtype;
            TOKENIZED_STOCK_SUBTYPE_STOCK = new TokenizedStockSubtype("TOKENIZED_STOCK_SUBTYPE_STOCK", 1, 1);
            TOKENIZED_STOCK_SUBTYPE_ETF = new TokenizedStockSubtype("TOKENIZED_STOCK_SUBTYPE_ETF", 2, 2);
            TOKENIZED_STOCK_SUBTYPE_PRIVATE = new TokenizedStockSubtype("TOKENIZED_STOCK_SUBTYPE_PRIVATE", 3, 3);
            TokenizedStockSubtype[] tokenizedStockSubtypeArr$values = $values();
            $VALUES = tokenizedStockSubtypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tokenizedStockSubtypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TokenizedStockSubtype.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<TokenizedStockSubtype>(orCreateKotlinClass, syntax, tokenizedStockSubtype) { // from class: com.robinhood.rosetta.nummus.CurrencyPairDetails$TokenizedStockSubtype$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CurrencyPairDetails.TokenizedStockSubtype fromValue(int value) {
                    return CurrencyPairDetails.TokenizedStockSubtype.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CurrencyPairDetails.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$TokenizedStockSubtype$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails$TokenizedStockSubtype;", "fromValue", "value", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final TokenizedStockSubtype fromValue(int value) {
                if (value == 0) {
                    return TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_STOCK;
                }
                if (value == 2) {
                    return TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_ETF;
                }
                if (value != 3) {
                    return null;
                }
                return TokenizedStockSubtype.TOKENIZED_STOCK_SUBTYPE_PRIVATE;
            }
        }

        public static TokenizedStockSubtype valueOf(String str) {
            return (TokenizedStockSubtype) Enum.valueOf(TokenizedStockSubtype.class, str);
        }

        public static TokenizedStockSubtype[] values() {
            return (TokenizedStockSubtype[]) $VALUES.clone();
        }
    }
}

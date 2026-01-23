package com.robinhood.arsenal.proto.p281v1.idl;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: Product.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 H2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001HBï\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\b\u0010@\u001a\u00020\u0002H\u0017J\u0013\u0010A\u001a\u00020\u00132\b\u0010B\u001a\u0004\u0018\u00010CH\u0096\u0002J\b\u0010D\u001a\u00020\u001cH\u0016J\b\u0010E\u001a\u00020\u0004H\u0016Jó\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010GR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00103\u001a\u0004\b\u0012\u00102R\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\b;\u0010<R\u0016\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?¨\u0006I"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/Product;", "Lcom/squareup/wire/Message;", "", "id", "", "combined_commodity_id", "symbol", "display_symbol", "description", PlaceTypes.COUNTRY, "exchange", "currency", "future_sub_type", "Lcom/robinhood/arsenal/proto/v1/idl/ProductFutureSubtype;", "underlying_asset", "Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAsset;", "delivery", "Lcom/robinhood/arsenal/proto/v1/idl/ProductDelivery;", "is_standardized", "", "price_increments", "active_futures_contract_id", "long_description", "simple_name", "trading_hours_info", "Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfo;", "settlement_start_time", "search_rank", "", "rhd_product_group", "Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroup;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/ProductFutureSubtype;Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAsset;Lcom/robinhood/arsenal/proto/v1/idl/ProductDelivery;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfo;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroup;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getCombined_commodity_id", "getSymbol", "getDisplay_symbol", "getDescription", "getCountry", "getExchange", "getCurrency", "getFuture_sub_type", "()Lcom/robinhood/arsenal/proto/v1/idl/ProductFutureSubtype;", "getUnderlying_asset", "()Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAsset;", "getDelivery", "()Lcom/robinhood/arsenal/proto/v1/idl/ProductDelivery;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPrice_increments", "getActive_futures_contract_id", "getLong_description", "getSimple_name", "getTrading_hours_info", "()Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfo;", "getSettlement_start_time", "getSearch_rank", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRhd_product_group", "()Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroup;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/ProductFutureSubtype;Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAsset;Lcom/robinhood/arsenal/proto/v1/idl/ProductDelivery;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/TradingHoursInfo;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroup;Lokio/ByteString;)Lcom/robinhood/arsenal/proto/v1/idl/Product;", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class Product extends Message {

    @JvmField
    public static final ProtoAdapter<Product> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "activeFuturesContractId", schemaIndex = 13, tag = 14)
    private final String active_futures_contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "combinedCommodityId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String combined_commodity_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String country;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String currency;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.ProductDelivery#ADAPTER", schemaIndex = 10, tag = 11)
    private final ProductDelivery delivery;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displaySymbol", schemaIndex = 3, tag = 4)
    private final String display_symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String exchange;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.ProductFutureSubtype#ADAPTER", jsonName = "futureSubType", schemaIndex = 8, tag = 9)
    private final ProductFutureSubtype future_sub_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isStandardized", schemaIndex = 11, tag = 12)
    private final Boolean is_standardized;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "longDescription", schemaIndex = 14, tag = 15)
    private final String long_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "priceIncrements", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String price_increments;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.RHDProductGroup#ADAPTER", jsonName = "rhdProductGroup", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final RHDProductGroup rhd_product_group;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "searchRank", schemaIndex = 18, tag = 19)
    private final Integer search_rank;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "settlementStartTime", schemaIndex = 17, tag = 18)
    private final String settlement_start_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "simpleName", schemaIndex = 15, tag = 16)
    private final String simple_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String symbol;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.TradingHoursInfo#ADAPTER", jsonName = "tradingHoursInfo", schemaIndex = 16, tag = 17)
    private final TradingHoursInfo trading_hours_info;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAsset#ADAPTER", jsonName = "underlyingAsset", schemaIndex = 9, tag = 10)
    private final ProductUnderlyingAsset underlying_asset;

    public Product() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public /* synthetic */ Product(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ProductFutureSubtype productFutureSubtype, ProductUnderlyingAsset productUnderlyingAsset, ProductDelivery productDelivery, Boolean bool, String str9, String str10, String str11, String str12, TradingHoursInfo tradingHoursInfo, String str13, Integer num, RHDProductGroup rHDProductGroup, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? null : productFutureSubtype, (i & 512) != 0 ? null : productUnderlyingAsset, (i & 1024) != 0 ? null : productDelivery, (i & 2048) != 0 ? null : bool, (i & 4096) == 0 ? str9 : "", (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : str12, (i & 65536) != 0 ? null : tradingHoursInfo, (i & 131072) != 0 ? null : str13, (i & 262144) != 0 ? null : num, (i & 524288) != 0 ? RHDProductGroup.RHD_PRODUCT_GROUP_UNSPECIFIED : rHDProductGroup, (i & 1048576) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20200newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getCombined_commodity_id() {
        return this.combined_commodity_id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getDisplay_symbol() {
        return this.display_symbol;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getExchange() {
        return this.exchange;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final ProductFutureSubtype getFuture_sub_type() {
        return this.future_sub_type;
    }

    public final ProductUnderlyingAsset getUnderlying_asset() {
        return this.underlying_asset;
    }

    public final ProductDelivery getDelivery() {
        return this.delivery;
    }

    /* renamed from: is_standardized, reason: from getter */
    public final Boolean getIs_standardized() {
        return this.is_standardized;
    }

    public final String getPrice_increments() {
        return this.price_increments;
    }

    public final String getActive_futures_contract_id() {
        return this.active_futures_contract_id;
    }

    public final String getLong_description() {
        return this.long_description;
    }

    public final String getSimple_name() {
        return this.simple_name;
    }

    public final TradingHoursInfo getTrading_hours_info() {
        return this.trading_hours_info;
    }

    public final String getSettlement_start_time() {
        return this.settlement_start_time;
    }

    public final Integer getSearch_rank() {
        return this.search_rank;
    }

    public final RHDProductGroup getRhd_product_group() {
        return this.rhd_product_group;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Product(String id, String combined_commodity_id, String symbol, String str, String description, String country, String exchange, String currency, ProductFutureSubtype productFutureSubtype, ProductUnderlyingAsset productUnderlyingAsset, ProductDelivery productDelivery, Boolean bool, String price_increments, String str2, String str3, String str4, TradingHoursInfo tradingHoursInfo, String str5, Integer num, RHDProductGroup rhd_product_group, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(combined_commodity_id, "combined_commodity_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(price_increments, "price_increments");
        Intrinsics.checkNotNullParameter(rhd_product_group, "rhd_product_group");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.combined_commodity_id = combined_commodity_id;
        this.symbol = symbol;
        this.display_symbol = str;
        this.description = description;
        this.country = country;
        this.exchange = exchange;
        this.currency = currency;
        this.future_sub_type = productFutureSubtype;
        this.underlying_asset = productUnderlyingAsset;
        this.delivery = productDelivery;
        this.is_standardized = bool;
        this.price_increments = price_increments;
        this.active_futures_contract_id = str2;
        this.long_description = str3;
        this.simple_name = str4;
        this.trading_hours_info = tradingHoursInfo;
        this.settlement_start_time = str5;
        this.search_rank = num;
        this.rhd_product_group = rhd_product_group;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20200newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product product = (Product) other;
        return Intrinsics.areEqual(unknownFields(), product.unknownFields()) && Intrinsics.areEqual(this.id, product.id) && Intrinsics.areEqual(this.combined_commodity_id, product.combined_commodity_id) && Intrinsics.areEqual(this.symbol, product.symbol) && Intrinsics.areEqual(this.display_symbol, product.display_symbol) && Intrinsics.areEqual(this.description, product.description) && Intrinsics.areEqual(this.country, product.country) && Intrinsics.areEqual(this.exchange, product.exchange) && Intrinsics.areEqual(this.currency, product.currency) && this.future_sub_type == product.future_sub_type && this.underlying_asset == product.underlying_asset && this.delivery == product.delivery && Intrinsics.areEqual(this.is_standardized, product.is_standardized) && Intrinsics.areEqual(this.price_increments, product.price_increments) && Intrinsics.areEqual(this.active_futures_contract_id, product.active_futures_contract_id) && Intrinsics.areEqual(this.long_description, product.long_description) && Intrinsics.areEqual(this.simple_name, product.simple_name) && Intrinsics.areEqual(this.trading_hours_info, product.trading_hours_info) && Intrinsics.areEqual(this.settlement_start_time, product.settlement_start_time) && Intrinsics.areEqual(this.search_rank, product.search_rank) && this.rhd_product_group == product.rhd_product_group;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.combined_commodity_id.hashCode()) * 37) + this.symbol.hashCode()) * 37;
        String str = this.display_symbol;
        int iHashCode2 = (((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.description.hashCode()) * 37) + this.country.hashCode()) * 37) + this.exchange.hashCode()) * 37) + this.currency.hashCode()) * 37;
        ProductFutureSubtype productFutureSubtype = this.future_sub_type;
        int iHashCode3 = (iHashCode2 + (productFutureSubtype != null ? productFutureSubtype.hashCode() : 0)) * 37;
        ProductUnderlyingAsset productUnderlyingAsset = this.underlying_asset;
        int iHashCode4 = (iHashCode3 + (productUnderlyingAsset != null ? productUnderlyingAsset.hashCode() : 0)) * 37;
        ProductDelivery productDelivery = this.delivery;
        int iHashCode5 = (iHashCode4 + (productDelivery != null ? productDelivery.hashCode() : 0)) * 37;
        Boolean bool = this.is_standardized;
        int iHashCode6 = (((iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 37) + this.price_increments.hashCode()) * 37;
        String str2 = this.active_futures_contract_id;
        int iHashCode7 = (iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.long_description;
        int iHashCode8 = (iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.simple_name;
        int iHashCode9 = (iHashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        TradingHoursInfo tradingHoursInfo = this.trading_hours_info;
        int iHashCode10 = (iHashCode9 + (tradingHoursInfo != null ? tradingHoursInfo.hashCode() : 0)) * 37;
        String str5 = this.settlement_start_time;
        int iHashCode11 = (iHashCode10 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Integer num = this.search_rank;
        int iHashCode12 = ((iHashCode11 + (num != null ? num.hashCode() : 0)) * 37) + this.rhd_product_group.hashCode();
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("combined_commodity_id=" + Internal.sanitize(this.combined_commodity_id));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        String str = this.display_symbol;
        if (str != null) {
            arrayList.add("display_symbol=" + Internal.sanitize(str));
        }
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("country=" + Internal.sanitize(this.country));
        arrayList.add("exchange=" + Internal.sanitize(this.exchange));
        arrayList.add("currency=" + Internal.sanitize(this.currency));
        ProductFutureSubtype productFutureSubtype = this.future_sub_type;
        if (productFutureSubtype != null) {
            arrayList.add("future_sub_type=" + productFutureSubtype);
        }
        ProductUnderlyingAsset productUnderlyingAsset = this.underlying_asset;
        if (productUnderlyingAsset != null) {
            arrayList.add("underlying_asset=" + productUnderlyingAsset);
        }
        ProductDelivery productDelivery = this.delivery;
        if (productDelivery != null) {
            arrayList.add("delivery=" + productDelivery);
        }
        Boolean bool = this.is_standardized;
        if (bool != null) {
            arrayList.add("is_standardized=" + bool);
        }
        arrayList.add("price_increments=" + Internal.sanitize(this.price_increments));
        String str2 = this.active_futures_contract_id;
        if (str2 != null) {
            arrayList.add("active_futures_contract_id=" + Internal.sanitize(str2));
        }
        String str3 = this.long_description;
        if (str3 != null) {
            arrayList.add("long_description=" + Internal.sanitize(str3));
        }
        String str4 = this.simple_name;
        if (str4 != null) {
            arrayList.add("simple_name=" + Internal.sanitize(str4));
        }
        TradingHoursInfo tradingHoursInfo = this.trading_hours_info;
        if (tradingHoursInfo != null) {
            arrayList.add("trading_hours_info=" + tradingHoursInfo);
        }
        String str5 = this.settlement_start_time;
        if (str5 != null) {
            arrayList.add("settlement_start_time=" + Internal.sanitize(str5));
        }
        Integer num = this.search_rank;
        if (num != null) {
            arrayList.add("search_rank=" + num);
        }
        arrayList.add("rhd_product_group=" + this.rhd_product_group);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Product{", "}", 0, null, null, 56, null);
    }

    public final Product copy(String id, String combined_commodity_id, String symbol, String display_symbol, String description, String country, String exchange, String currency, ProductFutureSubtype future_sub_type, ProductUnderlyingAsset underlying_asset, ProductDelivery delivery, Boolean is_standardized, String price_increments, String active_futures_contract_id, String long_description, String simple_name, TradingHoursInfo trading_hours_info, String settlement_start_time, Integer search_rank, RHDProductGroup rhd_product_group, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(combined_commodity_id, "combined_commodity_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(price_increments, "price_increments");
        Intrinsics.checkNotNullParameter(rhd_product_group, "rhd_product_group");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Product(id, combined_commodity_id, symbol, display_symbol, description, country, exchange, currency, future_sub_type, underlying_asset, delivery, is_standardized, price_increments, active_futures_contract_id, long_description, simple_name, trading_hours_info, settlement_start_time, search_rank, rhd_product_group, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Product.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Product>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.Product$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Product value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getCombined_commodity_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCombined_commodity_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSymbol());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(4, value.getDisplay_symbol());
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getCountry(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(6, value.getCountry());
                }
                if (!Intrinsics.areEqual(value.getExchange(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(7, value.getExchange());
                }
                if (!Intrinsics.areEqual(value.getCurrency(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getCurrency());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + ProductFutureSubtype.ADAPTER.encodedSizeWithTag(9, value.getFuture_sub_type()) + ProductUnderlyingAsset.ADAPTER.encodedSizeWithTag(10, value.getUnderlying_asset()) + ProductDelivery.ADAPTER.encodedSizeWithTag(11, value.getDelivery()) + ProtoAdapter.BOOL.encodedSizeWithTag(12, value.getIs_standardized());
                if (!Intrinsics.areEqual(value.getPrice_increments(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(13, value.getPrice_increments());
                }
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(14, value.getActive_futures_contract_id()) + protoAdapter.encodedSizeWithTag(15, value.getLong_description()) + protoAdapter.encodedSizeWithTag(16, value.getSimple_name()) + TradingHoursInfo.ADAPTER.encodedSizeWithTag(17, value.getTrading_hours_info()) + protoAdapter.encodedSizeWithTag(18, value.getSettlement_start_time()) + ProtoAdapter.INT32.encodedSizeWithTag(19, value.getSearch_rank());
                return value.getRhd_product_group() != RHDProductGroup.RHD_PRODUCT_GROUP_UNSPECIFIED ? iEncodedSizeWithTag3 + RHDProductGroup.ADAPTER.encodedSizeWithTag(20, value.getRhd_product_group()) : iEncodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Product value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getCombined_commodity_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCombined_commodity_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDisplay_symbol());
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getCountry(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getCountry());
                }
                if (!Intrinsics.areEqual(value.getExchange(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getExchange());
                }
                if (!Intrinsics.areEqual(value.getCurrency(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getCurrency());
                }
                ProductFutureSubtype.ADAPTER.encodeWithTag(writer, 9, (int) value.getFuture_sub_type());
                ProductUnderlyingAsset.ADAPTER.encodeWithTag(writer, 10, (int) value.getUnderlying_asset());
                ProductDelivery.ADAPTER.encodeWithTag(writer, 11, (int) value.getDelivery());
                ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) value.getIs_standardized());
                if (!Intrinsics.areEqual(value.getPrice_increments(), "")) {
                    protoAdapter.encodeWithTag(writer, 13, (int) value.getPrice_increments());
                }
                protoAdapter.encodeWithTag(writer, 14, (int) value.getActive_futures_contract_id());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getLong_description());
                protoAdapter.encodeWithTag(writer, 16, (int) value.getSimple_name());
                TradingHoursInfo.ADAPTER.encodeWithTag(writer, 17, (int) value.getTrading_hours_info());
                protoAdapter.encodeWithTag(writer, 18, (int) value.getSettlement_start_time());
                ProtoAdapter.INT32.encodeWithTag(writer, 19, (int) value.getSearch_rank());
                if (value.getRhd_product_group() != RHDProductGroup.RHD_PRODUCT_GROUP_UNSPECIFIED) {
                    RHDProductGroup.ADAPTER.encodeWithTag(writer, 20, (int) value.getRhd_product_group());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Product value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRhd_product_group() != RHDProductGroup.RHD_PRODUCT_GROUP_UNSPECIFIED) {
                    RHDProductGroup.ADAPTER.encodeWithTag(writer, 20, (int) value.getRhd_product_group());
                }
                ProtoAdapter.INT32.encodeWithTag(writer, 19, (int) value.getSearch_rank());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 18, (int) value.getSettlement_start_time());
                TradingHoursInfo.ADAPTER.encodeWithTag(writer, 17, (int) value.getTrading_hours_info());
                protoAdapter.encodeWithTag(writer, 16, (int) value.getSimple_name());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getLong_description());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getActive_futures_contract_id());
                if (!Intrinsics.areEqual(value.getPrice_increments(), "")) {
                    protoAdapter.encodeWithTag(writer, 13, (int) value.getPrice_increments());
                }
                ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) value.getIs_standardized());
                ProductDelivery.ADAPTER.encodeWithTag(writer, 11, (int) value.getDelivery());
                ProductUnderlyingAsset.ADAPTER.encodeWithTag(writer, 10, (int) value.getUnderlying_asset());
                ProductFutureSubtype.ADAPTER.encodeWithTag(writer, 9, (int) value.getFuture_sub_type());
                if (!Intrinsics.areEqual(value.getCurrency(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getCurrency());
                }
                if (!Intrinsics.areEqual(value.getExchange(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getExchange());
                }
                if (!Intrinsics.areEqual(value.getCountry(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getCountry());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getDescription());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getDisplay_symbol());
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getCombined_commodity_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getCombined_commodity_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Product decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(reader, "reader");
                RHDProductGroup rHDProductGroup = RHDProductGroup.RHD_PRODUCT_GROUP_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                RHDProductGroup rHDProductGroupDecode = rHDProductGroup;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = null;
                ProductFutureSubtype productFutureSubtypeDecode = null;
                ProductUnderlyingAsset productUnderlyingAssetDecode = null;
                ProductDelivery productDeliveryDecode = null;
                Boolean boolDecode = null;
                String strDecode9 = null;
                String strDecode10 = null;
                String strDecode11 = null;
                TradingHoursInfo tradingHoursInfoDecode = null;
                String strDecode12 = null;
                Integer numDecode = null;
                String strDecode13 = strDecode7;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                str = strDecode13;
                                str2 = strDecode;
                                str3 = strDecode2;
                                try {
                                    productFutureSubtypeDecode = ProductFutureSubtype.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 10:
                                str = strDecode13;
                                str2 = strDecode;
                                str3 = strDecode2;
                                try {
                                    productUnderlyingAssetDecode = ProductUnderlyingAsset.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 11:
                                str = strDecode13;
                                str2 = strDecode;
                                str3 = strDecode2;
                                try {
                                    productDeliveryDecode = ProductDelivery.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 12:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                continue;
                            case 13:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 14:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 15:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 16:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 17:
                                tradingHoursInfoDecode = TradingHoursInfo.ADAPTER.decode(reader);
                                continue;
                            case 18:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 19:
                                numDecode = ProtoAdapter.INT32.decode(reader);
                                continue;
                            case 20:
                                try {
                                    rHDProductGroupDecode = RHDProductGroup.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    str = strDecode13;
                                    str2 = strDecode;
                                    str3 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode13;
                                str2 = strDecode;
                                str3 = strDecode2;
                                break;
                        }
                        strDecode13 = str;
                        strDecode = str2;
                        strDecode2 = str3;
                    } else {
                        return new Product(strDecode13, strDecode, strDecode2, strDecode8, strDecode3, strDecode4, strDecode5, strDecode6, productFutureSubtypeDecode, productUnderlyingAssetDecode, productDeliveryDecode, boolDecode, strDecode7, strDecode9, strDecode10, strDecode11, tradingHoursInfoDecode, strDecode12, numDecode, rHDProductGroupDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Product redact(Product value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TradingHoursInfo trading_hours_info = value.getTrading_hours_info();
                return value.copy((983039 & 1) != 0 ? value.id : null, (983039 & 2) != 0 ? value.combined_commodity_id : null, (983039 & 4) != 0 ? value.symbol : null, (983039 & 8) != 0 ? value.display_symbol : null, (983039 & 16) != 0 ? value.description : null, (983039 & 32) != 0 ? value.country : null, (983039 & 64) != 0 ? value.exchange : null, (983039 & 128) != 0 ? value.currency : null, (983039 & 256) != 0 ? value.future_sub_type : null, (983039 & 512) != 0 ? value.underlying_asset : null, (983039 & 1024) != 0 ? value.delivery : null, (983039 & 2048) != 0 ? value.is_standardized : null, (983039 & 4096) != 0 ? value.price_increments : null, (983039 & 8192) != 0 ? value.active_futures_contract_id : null, (983039 & 16384) != 0 ? value.long_description : null, (983039 & 32768) != 0 ? value.simple_name : null, (983039 & 65536) != 0 ? value.trading_hours_info : trading_hours_info != null ? TradingHoursInfo.ADAPTER.redact(trading_hours_info) : null, (983039 & 131072) != 0 ? value.settlement_start_time : null, (983039 & 262144) != 0 ? value.search_rank : null, (983039 & 524288) != 0 ? value.rhd_product_group : null, (983039 & 1048576) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

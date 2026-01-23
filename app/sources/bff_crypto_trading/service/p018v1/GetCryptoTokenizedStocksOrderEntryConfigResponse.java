package bff_crypto_trading.service.p018v1;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetCryptoTokenizedStocksOrderEntryConfigResponse.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 A2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001ABë\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u0010:\u001a\u00020\u0002H\u0017J\u0013\u0010;\u001a\u00020\u001c2\b\u0010<\u001a\u0004\u0018\u00010=H\u0096\u0002J\b\u0010>\u001a\u00020\u0019H\u0016J\b\u0010?\u001a\u00020\u0004H\u0016Jê\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0016\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0016\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u00109¨\u0006B"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoTokenizedStocksOrderEntryConfigResponse;", "Lcom/squareup/wire/Message;", "", "max_buy_quantity", "", "max_sell_quantity", "primary_price", "Lbff_crypto_trading/service/v1/Price;", "secondary_price", "buy_price_collar_percentage", "sell_price_collar_percentage", "exchange_collar_percentage", "exchange_fees_percentage", "min_sell_exchange_rate", "max_buy_exchange_rate", "buying_power", "Lcom/robinhood/rosetta/common/Money;", "sell_exchange_rate", "buy_exchange_rate", "uncollared_buy_quantity", "selling_power", "limit_order_exchange_collar_percentage", "limit_order_min_sell_exchange_rate", "limit_order_max_buy_exchange_rate", "limit_order_expiration_days", "", "limit_order_min_quantity_increment", "is_equity_fractional", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbff_crypto_trading/service/v1/Price;Lbff_crypto_trading/service/v1/Price;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLokio/ByteString;)V", "getMax_buy_quantity", "()Ljava/lang/String;", "getMax_sell_quantity", "getPrimary_price", "()Lbff_crypto_trading/service/v1/Price;", "getSecondary_price", "getBuy_price_collar_percentage", "getSell_price_collar_percentage", "getExchange_collar_percentage", "getExchange_fees_percentage", "getMin_sell_exchange_rate", "getMax_buy_exchange_rate", "getBuying_power", "()Lcom/robinhood/rosetta/common/Money;", "getSell_exchange_rate", "getBuy_exchange_rate", "getUncollared_buy_quantity", "getSelling_power", "getLimit_order_exchange_collar_percentage", "getLimit_order_min_sell_exchange_rate", "getLimit_order_max_buy_exchange_rate", "getLimit_order_expiration_days", "()I", "getLimit_order_min_quantity_increment", "()Z", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetCryptoTokenizedStocksOrderEntryConfigResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCryptoTokenizedStocksOrderEntryConfigResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buyExchangeRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 14)
    private final String buy_exchange_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buyPriceCollarPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String buy_price_collar_percentage;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "buyingPower", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 12)
    private final Money buying_power;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exchangeCollarPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 8)
    private final String exchange_collar_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exchangeFeesPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 9)
    private final String exchange_fees_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEquityFractional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 22)
    private final boolean is_equity_fractional;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitOrderExchangeCollarPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 17)
    private final String limit_order_exchange_collar_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "limitOrderExpirationDays", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 20)
    private final int limit_order_expiration_days;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitOrderMaxBuyExchangeRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 19)
    private final String limit_order_max_buy_exchange_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitOrderMinQuantityIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 21)
    private final String limit_order_min_quantity_increment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitOrderMinSellExchangeRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 18)
    private final String limit_order_min_sell_exchange_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxBuyExchangeRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 11)
    private final String max_buy_exchange_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxBuyQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String max_buy_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxSellQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String max_sell_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minSellExchangeRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 10)
    private final String min_sell_exchange_rate;

    @WireField(adapter = "bff_crypto_trading.service.v1.Price#ADAPTER", jsonName = "primaryPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Price primary_price;

    @WireField(adapter = "bff_crypto_trading.service.v1.Price#ADAPTER", jsonName = "secondaryPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Price secondary_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sellExchangeRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 13)
    private final String sell_exchange_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sellPriceCollarPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String sell_price_collar_percentage;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "sellingPower", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 16)
    private final Money selling_power;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "uncollaredBuyQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 15)
    private final String uncollared_buy_quantity;

    public GetCryptoTokenizedStocksOrderEntryConfigResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, false, null, 4194303, null);
    }

    public /* synthetic */ GetCryptoTokenizedStocksOrderEntryConfigResponse(String str, String str2, Price price, Price price2, String str3, String str4, String str5, String str6, String str7, String str8, Money money, String str9, String str10, String str11, Money money2, String str12, String str13, String str14, int i, String str15, boolean z, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : price, (i2 & 8) != 0 ? null : price2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? null : money, (i2 & 2048) != 0 ? "" : str9, (i2 & 4096) != 0 ? "" : str10, (i2 & 8192) != 0 ? "" : str11, (i2 & 16384) != 0 ? null : money2, (i2 & 32768) != 0 ? "" : str12, (i2 & 65536) != 0 ? "" : str13, (i2 & 131072) != 0 ? "" : str14, (i2 & 262144) != 0 ? 0 : i, (i2 & 524288) == 0 ? str15 : "", (i2 & 1048576) == 0 ? z : false, (i2 & 2097152) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8384newBuilder();
    }

    public final String getMax_buy_quantity() {
        return this.max_buy_quantity;
    }

    public final String getMax_sell_quantity() {
        return this.max_sell_quantity;
    }

    public final Price getPrimary_price() {
        return this.primary_price;
    }

    public final Price getSecondary_price() {
        return this.secondary_price;
    }

    public final String getBuy_price_collar_percentage() {
        return this.buy_price_collar_percentage;
    }

    public final String getSell_price_collar_percentage() {
        return this.sell_price_collar_percentage;
    }

    public final String getExchange_collar_percentage() {
        return this.exchange_collar_percentage;
    }

    public final String getExchange_fees_percentage() {
        return this.exchange_fees_percentage;
    }

    public final String getMin_sell_exchange_rate() {
        return this.min_sell_exchange_rate;
    }

    public final String getMax_buy_exchange_rate() {
        return this.max_buy_exchange_rate;
    }

    public final Money getBuying_power() {
        return this.buying_power;
    }

    public final String getSell_exchange_rate() {
        return this.sell_exchange_rate;
    }

    public final String getBuy_exchange_rate() {
        return this.buy_exchange_rate;
    }

    public final String getUncollared_buy_quantity() {
        return this.uncollared_buy_quantity;
    }

    public final Money getSelling_power() {
        return this.selling_power;
    }

    public final String getLimit_order_exchange_collar_percentage() {
        return this.limit_order_exchange_collar_percentage;
    }

    public final String getLimit_order_min_sell_exchange_rate() {
        return this.limit_order_min_sell_exchange_rate;
    }

    public final String getLimit_order_max_buy_exchange_rate() {
        return this.limit_order_max_buy_exchange_rate;
    }

    public final int getLimit_order_expiration_days() {
        return this.limit_order_expiration_days;
    }

    public final String getLimit_order_min_quantity_increment() {
        return this.limit_order_min_quantity_increment;
    }

    /* renamed from: is_equity_fractional, reason: from getter */
    public final boolean getIs_equity_fractional() {
        return this.is_equity_fractional;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoTokenizedStocksOrderEntryConfigResponse(String max_buy_quantity, String max_sell_quantity, Price price, Price price2, String buy_price_collar_percentage, String sell_price_collar_percentage, String exchange_collar_percentage, String exchange_fees_percentage, String min_sell_exchange_rate, String max_buy_exchange_rate, Money money, String sell_exchange_rate, String buy_exchange_rate, String uncollared_buy_quantity, Money money2, String limit_order_exchange_collar_percentage, String limit_order_min_sell_exchange_rate, String limit_order_max_buy_exchange_rate, int i, String limit_order_min_quantity_increment, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(max_buy_quantity, "max_buy_quantity");
        Intrinsics.checkNotNullParameter(max_sell_quantity, "max_sell_quantity");
        Intrinsics.checkNotNullParameter(buy_price_collar_percentage, "buy_price_collar_percentage");
        Intrinsics.checkNotNullParameter(sell_price_collar_percentage, "sell_price_collar_percentage");
        Intrinsics.checkNotNullParameter(exchange_collar_percentage, "exchange_collar_percentage");
        Intrinsics.checkNotNullParameter(exchange_fees_percentage, "exchange_fees_percentage");
        Intrinsics.checkNotNullParameter(min_sell_exchange_rate, "min_sell_exchange_rate");
        Intrinsics.checkNotNullParameter(max_buy_exchange_rate, "max_buy_exchange_rate");
        Intrinsics.checkNotNullParameter(sell_exchange_rate, "sell_exchange_rate");
        Intrinsics.checkNotNullParameter(buy_exchange_rate, "buy_exchange_rate");
        Intrinsics.checkNotNullParameter(uncollared_buy_quantity, "uncollared_buy_quantity");
        Intrinsics.checkNotNullParameter(limit_order_exchange_collar_percentage, "limit_order_exchange_collar_percentage");
        Intrinsics.checkNotNullParameter(limit_order_min_sell_exchange_rate, "limit_order_min_sell_exchange_rate");
        Intrinsics.checkNotNullParameter(limit_order_max_buy_exchange_rate, "limit_order_max_buy_exchange_rate");
        Intrinsics.checkNotNullParameter(limit_order_min_quantity_increment, "limit_order_min_quantity_increment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.max_buy_quantity = max_buy_quantity;
        this.max_sell_quantity = max_sell_quantity;
        this.primary_price = price;
        this.secondary_price = price2;
        this.buy_price_collar_percentage = buy_price_collar_percentage;
        this.sell_price_collar_percentage = sell_price_collar_percentage;
        this.exchange_collar_percentage = exchange_collar_percentage;
        this.exchange_fees_percentage = exchange_fees_percentage;
        this.min_sell_exchange_rate = min_sell_exchange_rate;
        this.max_buy_exchange_rate = max_buy_exchange_rate;
        this.buying_power = money;
        this.sell_exchange_rate = sell_exchange_rate;
        this.buy_exchange_rate = buy_exchange_rate;
        this.uncollared_buy_quantity = uncollared_buy_quantity;
        this.selling_power = money2;
        this.limit_order_exchange_collar_percentage = limit_order_exchange_collar_percentage;
        this.limit_order_min_sell_exchange_rate = limit_order_min_sell_exchange_rate;
        this.limit_order_max_buy_exchange_rate = limit_order_max_buy_exchange_rate;
        this.limit_order_expiration_days = i;
        this.limit_order_min_quantity_increment = limit_order_min_quantity_increment;
        this.is_equity_fractional = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8384newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCryptoTokenizedStocksOrderEntryConfigResponse)) {
            return false;
        }
        GetCryptoTokenizedStocksOrderEntryConfigResponse getCryptoTokenizedStocksOrderEntryConfigResponse = (GetCryptoTokenizedStocksOrderEntryConfigResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCryptoTokenizedStocksOrderEntryConfigResponse.unknownFields()) && Intrinsics.areEqual(this.max_buy_quantity, getCryptoTokenizedStocksOrderEntryConfigResponse.max_buy_quantity) && Intrinsics.areEqual(this.max_sell_quantity, getCryptoTokenizedStocksOrderEntryConfigResponse.max_sell_quantity) && Intrinsics.areEqual(this.primary_price, getCryptoTokenizedStocksOrderEntryConfigResponse.primary_price) && Intrinsics.areEqual(this.secondary_price, getCryptoTokenizedStocksOrderEntryConfigResponse.secondary_price) && Intrinsics.areEqual(this.buy_price_collar_percentage, getCryptoTokenizedStocksOrderEntryConfigResponse.buy_price_collar_percentage) && Intrinsics.areEqual(this.sell_price_collar_percentage, getCryptoTokenizedStocksOrderEntryConfigResponse.sell_price_collar_percentage) && Intrinsics.areEqual(this.exchange_collar_percentage, getCryptoTokenizedStocksOrderEntryConfigResponse.exchange_collar_percentage) && Intrinsics.areEqual(this.exchange_fees_percentage, getCryptoTokenizedStocksOrderEntryConfigResponse.exchange_fees_percentage) && Intrinsics.areEqual(this.min_sell_exchange_rate, getCryptoTokenizedStocksOrderEntryConfigResponse.min_sell_exchange_rate) && Intrinsics.areEqual(this.max_buy_exchange_rate, getCryptoTokenizedStocksOrderEntryConfigResponse.max_buy_exchange_rate) && Intrinsics.areEqual(this.buying_power, getCryptoTokenizedStocksOrderEntryConfigResponse.buying_power) && Intrinsics.areEqual(this.sell_exchange_rate, getCryptoTokenizedStocksOrderEntryConfigResponse.sell_exchange_rate) && Intrinsics.areEqual(this.buy_exchange_rate, getCryptoTokenizedStocksOrderEntryConfigResponse.buy_exchange_rate) && Intrinsics.areEqual(this.uncollared_buy_quantity, getCryptoTokenizedStocksOrderEntryConfigResponse.uncollared_buy_quantity) && Intrinsics.areEqual(this.selling_power, getCryptoTokenizedStocksOrderEntryConfigResponse.selling_power) && Intrinsics.areEqual(this.limit_order_exchange_collar_percentage, getCryptoTokenizedStocksOrderEntryConfigResponse.limit_order_exchange_collar_percentage) && Intrinsics.areEqual(this.limit_order_min_sell_exchange_rate, getCryptoTokenizedStocksOrderEntryConfigResponse.limit_order_min_sell_exchange_rate) && Intrinsics.areEqual(this.limit_order_max_buy_exchange_rate, getCryptoTokenizedStocksOrderEntryConfigResponse.limit_order_max_buy_exchange_rate) && this.limit_order_expiration_days == getCryptoTokenizedStocksOrderEntryConfigResponse.limit_order_expiration_days && Intrinsics.areEqual(this.limit_order_min_quantity_increment, getCryptoTokenizedStocksOrderEntryConfigResponse.limit_order_min_quantity_increment) && this.is_equity_fractional == getCryptoTokenizedStocksOrderEntryConfigResponse.is_equity_fractional;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.max_buy_quantity.hashCode()) * 37) + this.max_sell_quantity.hashCode()) * 37;
        Price price = this.primary_price;
        int iHashCode2 = (iHashCode + (price != null ? price.hashCode() : 0)) * 37;
        Price price2 = this.secondary_price;
        int iHashCode3 = (((((((((((((iHashCode2 + (price2 != null ? price2.hashCode() : 0)) * 37) + this.buy_price_collar_percentage.hashCode()) * 37) + this.sell_price_collar_percentage.hashCode()) * 37) + this.exchange_collar_percentage.hashCode()) * 37) + this.exchange_fees_percentage.hashCode()) * 37) + this.min_sell_exchange_rate.hashCode()) * 37) + this.max_buy_exchange_rate.hashCode()) * 37;
        Money money = this.buying_power;
        int iHashCode4 = (((((((iHashCode3 + (money != null ? money.hashCode() : 0)) * 37) + this.sell_exchange_rate.hashCode()) * 37) + this.buy_exchange_rate.hashCode()) * 37) + this.uncollared_buy_quantity.hashCode()) * 37;
        Money money2 = this.selling_power;
        int iHashCode5 = ((((((((((((iHashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.limit_order_exchange_collar_percentage.hashCode()) * 37) + this.limit_order_min_sell_exchange_rate.hashCode()) * 37) + this.limit_order_max_buy_exchange_rate.hashCode()) * 37) + Integer.hashCode(this.limit_order_expiration_days)) * 37) + this.limit_order_min_quantity_increment.hashCode()) * 37) + Boolean.hashCode(this.is_equity_fractional);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("max_buy_quantity=" + Internal.sanitize(this.max_buy_quantity));
        arrayList.add("max_sell_quantity=" + Internal.sanitize(this.max_sell_quantity));
        Price price = this.primary_price;
        if (price != null) {
            arrayList.add("primary_price=" + price);
        }
        Price price2 = this.secondary_price;
        if (price2 != null) {
            arrayList.add("secondary_price=" + price2);
        }
        arrayList.add("buy_price_collar_percentage=" + Internal.sanitize(this.buy_price_collar_percentage));
        arrayList.add("sell_price_collar_percentage=" + Internal.sanitize(this.sell_price_collar_percentage));
        arrayList.add("exchange_collar_percentage=" + Internal.sanitize(this.exchange_collar_percentage));
        arrayList.add("exchange_fees_percentage=" + Internal.sanitize(this.exchange_fees_percentage));
        arrayList.add("min_sell_exchange_rate=" + Internal.sanitize(this.min_sell_exchange_rate));
        arrayList.add("max_buy_exchange_rate=" + Internal.sanitize(this.max_buy_exchange_rate));
        Money money = this.buying_power;
        if (money != null) {
            arrayList.add("buying_power=" + money);
        }
        arrayList.add("sell_exchange_rate=" + Internal.sanitize(this.sell_exchange_rate));
        arrayList.add("buy_exchange_rate=" + Internal.sanitize(this.buy_exchange_rate));
        arrayList.add("uncollared_buy_quantity=" + Internal.sanitize(this.uncollared_buy_quantity));
        Money money2 = this.selling_power;
        if (money2 != null) {
            arrayList.add("selling_power=" + money2);
        }
        arrayList.add("limit_order_exchange_collar_percentage=" + Internal.sanitize(this.limit_order_exchange_collar_percentage));
        arrayList.add("limit_order_min_sell_exchange_rate=" + Internal.sanitize(this.limit_order_min_sell_exchange_rate));
        arrayList.add("limit_order_max_buy_exchange_rate=" + Internal.sanitize(this.limit_order_max_buy_exchange_rate));
        arrayList.add("limit_order_expiration_days=" + this.limit_order_expiration_days);
        arrayList.add("limit_order_min_quantity_increment=" + Internal.sanitize(this.limit_order_min_quantity_increment));
        arrayList.add("is_equity_fractional=" + this.is_equity_fractional);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCryptoTokenizedStocksOrderEntryConfigResponse{", "}", 0, null, null, 56, null);
    }

    public final GetCryptoTokenizedStocksOrderEntryConfigResponse copy(String max_buy_quantity, String max_sell_quantity, Price primary_price, Price secondary_price, String buy_price_collar_percentage, String sell_price_collar_percentage, String exchange_collar_percentage, String exchange_fees_percentage, String min_sell_exchange_rate, String max_buy_exchange_rate, Money buying_power, String sell_exchange_rate, String buy_exchange_rate, String uncollared_buy_quantity, Money selling_power, String limit_order_exchange_collar_percentage, String limit_order_min_sell_exchange_rate, String limit_order_max_buy_exchange_rate, int limit_order_expiration_days, String limit_order_min_quantity_increment, boolean is_equity_fractional, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(max_buy_quantity, "max_buy_quantity");
        Intrinsics.checkNotNullParameter(max_sell_quantity, "max_sell_quantity");
        Intrinsics.checkNotNullParameter(buy_price_collar_percentage, "buy_price_collar_percentage");
        Intrinsics.checkNotNullParameter(sell_price_collar_percentage, "sell_price_collar_percentage");
        Intrinsics.checkNotNullParameter(exchange_collar_percentage, "exchange_collar_percentage");
        Intrinsics.checkNotNullParameter(exchange_fees_percentage, "exchange_fees_percentage");
        Intrinsics.checkNotNullParameter(min_sell_exchange_rate, "min_sell_exchange_rate");
        Intrinsics.checkNotNullParameter(max_buy_exchange_rate, "max_buy_exchange_rate");
        Intrinsics.checkNotNullParameter(sell_exchange_rate, "sell_exchange_rate");
        Intrinsics.checkNotNullParameter(buy_exchange_rate, "buy_exchange_rate");
        Intrinsics.checkNotNullParameter(uncollared_buy_quantity, "uncollared_buy_quantity");
        Intrinsics.checkNotNullParameter(limit_order_exchange_collar_percentage, "limit_order_exchange_collar_percentage");
        Intrinsics.checkNotNullParameter(limit_order_min_sell_exchange_rate, "limit_order_min_sell_exchange_rate");
        Intrinsics.checkNotNullParameter(limit_order_max_buy_exchange_rate, "limit_order_max_buy_exchange_rate");
        Intrinsics.checkNotNullParameter(limit_order_min_quantity_increment, "limit_order_min_quantity_increment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCryptoTokenizedStocksOrderEntryConfigResponse(max_buy_quantity, max_sell_quantity, primary_price, secondary_price, buy_price_collar_percentage, sell_price_collar_percentage, exchange_collar_percentage, exchange_fees_percentage, min_sell_exchange_rate, max_buy_exchange_rate, buying_power, sell_exchange_rate, buy_exchange_rate, uncollared_buy_quantity, selling_power, limit_order_exchange_collar_percentage, limit_order_min_sell_exchange_rate, limit_order_max_buy_exchange_rate, limit_order_expiration_days, limit_order_min_quantity_increment, is_equity_fractional, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCryptoTokenizedStocksOrderEntryConfigResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCryptoTokenizedStocksOrderEntryConfigResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_crypto_trading.service.v1.GetCryptoTokenizedStocksOrderEntryConfigResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCryptoTokenizedStocksOrderEntryConfigResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getMax_buy_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMax_buy_quantity());
                }
                if (!Intrinsics.areEqual(value.getMax_sell_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMax_sell_quantity());
                }
                if (value.getPrimary_price() != null) {
                    size += Price.ADAPTER.encodedSizeWithTag(3, value.getPrimary_price());
                }
                if (value.getSecondary_price() != null) {
                    size += Price.ADAPTER.encodedSizeWithTag(4, value.getSecondary_price());
                }
                if (!Intrinsics.areEqual(value.getBuy_price_collar_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getBuy_price_collar_percentage());
                }
                if (!Intrinsics.areEqual(value.getSell_price_collar_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getSell_price_collar_percentage());
                }
                if (!Intrinsics.areEqual(value.getExchange_collar_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getExchange_collar_percentage());
                }
                if (!Intrinsics.areEqual(value.getExchange_fees_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getExchange_fees_percentage());
                }
                if (!Intrinsics.areEqual(value.getMin_sell_exchange_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getMin_sell_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getMax_buy_exchange_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getMax_buy_exchange_rate());
                }
                if (value.getBuying_power() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(12, value.getBuying_power());
                }
                if (!Intrinsics.areEqual(value.getSell_exchange_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getSell_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getBuy_exchange_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getBuy_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getUncollared_buy_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getUncollared_buy_quantity());
                }
                if (value.getSelling_power() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(16, value.getSelling_power());
                }
                if (!Intrinsics.areEqual(value.getLimit_order_exchange_collar_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(17, value.getLimit_order_exchange_collar_percentage());
                }
                if (!Intrinsics.areEqual(value.getLimit_order_min_sell_exchange_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getLimit_order_min_sell_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getLimit_order_max_buy_exchange_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(19, value.getLimit_order_max_buy_exchange_rate());
                }
                if (value.getLimit_order_expiration_days() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(20, Integer.valueOf(value.getLimit_order_expiration_days()));
                }
                if (!Intrinsics.areEqual(value.getLimit_order_min_quantity_increment(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(21, value.getLimit_order_min_quantity_increment());
                }
                return value.getIs_equity_fractional() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(22, Boolean.valueOf(value.getIs_equity_fractional())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCryptoTokenizedStocksOrderEntryConfigResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getMax_buy_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMax_buy_quantity());
                }
                if (!Intrinsics.areEqual(value.getMax_sell_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMax_sell_quantity());
                }
                if (value.getPrimary_price() != null) {
                    Price.ADAPTER.encodeWithTag(writer, 3, (int) value.getPrimary_price());
                }
                if (value.getSecondary_price() != null) {
                    Price.ADAPTER.encodeWithTag(writer, 4, (int) value.getSecondary_price());
                }
                if (!Intrinsics.areEqual(value.getBuy_price_collar_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getBuy_price_collar_percentage());
                }
                if (!Intrinsics.areEqual(value.getSell_price_collar_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSell_price_collar_percentage());
                }
                if (!Intrinsics.areEqual(value.getExchange_collar_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getExchange_collar_percentage());
                }
                if (!Intrinsics.areEqual(value.getExchange_fees_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getExchange_fees_percentage());
                }
                if (!Intrinsics.areEqual(value.getMin_sell_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getMin_sell_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getMax_buy_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getMax_buy_exchange_rate());
                }
                if (value.getBuying_power() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 12, (int) value.getBuying_power());
                }
                if (!Intrinsics.areEqual(value.getSell_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getSell_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getBuy_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getBuy_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getUncollared_buy_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getUncollared_buy_quantity());
                }
                if (value.getSelling_power() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 16, (int) value.getSelling_power());
                }
                if (!Intrinsics.areEqual(value.getLimit_order_exchange_collar_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getLimit_order_exchange_collar_percentage());
                }
                if (!Intrinsics.areEqual(value.getLimit_order_min_sell_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getLimit_order_min_sell_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getLimit_order_max_buy_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getLimit_order_max_buy_exchange_rate());
                }
                if (value.getLimit_order_expiration_days() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 20, (int) Integer.valueOf(value.getLimit_order_expiration_days()));
                }
                if (!Intrinsics.areEqual(value.getLimit_order_min_quantity_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getLimit_order_min_quantity_increment());
                }
                if (value.getIs_equity_fractional()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 22, (int) Boolean.valueOf(value.getIs_equity_fractional()));
                }
                writer.writeBytes(value.unknownFields());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoTokenizedStocksOrderEntryConfigResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
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
                Price priceDecode = null;
                Price priceDecode2 = null;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                int iIntValue = 0;
                boolean zBooleanValue = false;
                String strDecode14 = strDecode13;
                String strDecode15 = strDecode14;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode14;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode14 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                priceDecode = Price.ADAPTER.decode(reader);
                                break;
                            case 4:
                                priceDecode2 = Price.ADAPTER.decode(reader);
                                break;
                            case 5:
                                strDecode15 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 8:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 13:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 15:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 17:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 18:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 19:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 20:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 21:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 22:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                        }
                        strDecode14 = str;
                    } else {
                        return new GetCryptoTokenizedStocksOrderEntryConfigResponse(strDecode13, str, priceDecode, priceDecode2, strDecode15, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, moneyDecode, strDecode6, strDecode7, strDecode8, moneyDecode2, strDecode9, strDecode10, strDecode11, iIntValue, strDecode12, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCryptoTokenizedStocksOrderEntryConfigResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_equity_fractional()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 22, (int) Boolean.valueOf(value.getIs_equity_fractional()));
                }
                if (!Intrinsics.areEqual(value.getLimit_order_min_quantity_increment(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getLimit_order_min_quantity_increment());
                }
                if (value.getLimit_order_expiration_days() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 20, (int) Integer.valueOf(value.getLimit_order_expiration_days()));
                }
                if (!Intrinsics.areEqual(value.getLimit_order_max_buy_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getLimit_order_max_buy_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getLimit_order_min_sell_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getLimit_order_min_sell_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getLimit_order_exchange_collar_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getLimit_order_exchange_collar_percentage());
                }
                if (value.getSelling_power() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 16, (int) value.getSelling_power());
                }
                if (!Intrinsics.areEqual(value.getUncollared_buy_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getUncollared_buy_quantity());
                }
                if (!Intrinsics.areEqual(value.getBuy_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getBuy_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getSell_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getSell_exchange_rate());
                }
                if (value.getBuying_power() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 12, (int) value.getBuying_power());
                }
                if (!Intrinsics.areEqual(value.getMax_buy_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getMax_buy_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getMin_sell_exchange_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getMin_sell_exchange_rate());
                }
                if (!Intrinsics.areEqual(value.getExchange_fees_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getExchange_fees_percentage());
                }
                if (!Intrinsics.areEqual(value.getExchange_collar_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getExchange_collar_percentage());
                }
                if (!Intrinsics.areEqual(value.getSell_price_collar_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSell_price_collar_percentage());
                }
                if (!Intrinsics.areEqual(value.getBuy_price_collar_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getBuy_price_collar_percentage());
                }
                if (value.getSecondary_price() != null) {
                    Price.ADAPTER.encodeWithTag(writer, 4, (int) value.getSecondary_price());
                }
                if (value.getPrimary_price() != null) {
                    Price.ADAPTER.encodeWithTag(writer, 3, (int) value.getPrimary_price());
                }
                if (!Intrinsics.areEqual(value.getMax_sell_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMax_sell_quantity());
                }
                if (Intrinsics.areEqual(value.getMax_buy_quantity(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMax_buy_quantity());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoTokenizedStocksOrderEntryConfigResponse redact(GetCryptoTokenizedStocksOrderEntryConfigResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Price primary_price = value.getPrimary_price();
                Price priceRedact = primary_price != null ? Price.ADAPTER.redact(primary_price) : null;
                Price secondary_price = value.getSecondary_price();
                Price priceRedact2 = secondary_price != null ? Price.ADAPTER.redact(secondary_price) : null;
                Money buying_power = value.getBuying_power();
                Money moneyRedact = buying_power != null ? Money.ADAPTER.redact(buying_power) : null;
                Money selling_power = value.getSelling_power();
                return value.copy((2079731 & 1) != 0 ? value.max_buy_quantity : null, (2079731 & 2) != 0 ? value.max_sell_quantity : null, (2079731 & 4) != 0 ? value.primary_price : priceRedact, (2079731 & 8) != 0 ? value.secondary_price : priceRedact2, (2079731 & 16) != 0 ? value.buy_price_collar_percentage : null, (2079731 & 32) != 0 ? value.sell_price_collar_percentage : null, (2079731 & 64) != 0 ? value.exchange_collar_percentage : null, (2079731 & 128) != 0 ? value.exchange_fees_percentage : null, (2079731 & 256) != 0 ? value.min_sell_exchange_rate : null, (2079731 & 512) != 0 ? value.max_buy_exchange_rate : null, (2079731 & 1024) != 0 ? value.buying_power : moneyRedact, (2079731 & 2048) != 0 ? value.sell_exchange_rate : null, (2079731 & 4096) != 0 ? value.buy_exchange_rate : null, (2079731 & 8192) != 0 ? value.uncollared_buy_quantity : null, (2079731 & 16384) != 0 ? value.selling_power : selling_power != null ? Money.ADAPTER.redact(selling_power) : null, (2079731 & 32768) != 0 ? value.limit_order_exchange_collar_percentage : null, (2079731 & 65536) != 0 ? value.limit_order_min_sell_exchange_rate : null, (2079731 & 131072) != 0 ? value.limit_order_max_buy_exchange_rate : null, (2079731 & 262144) != 0 ? value.limit_order_expiration_days : 0, (2079731 & 524288) != 0 ? value.limit_order_min_quantity_increment : null, (2079731 & 1048576) != 0 ? value.is_equity_fractional : false, (2079731 & 2097152) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
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
import rosetta.nummus.MonetizationModel;
import rosetta.order.Side;

/* compiled from: CryptoOrderContext.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 F2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004FGHIBÏ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u0010=\u001a\u00020\u0002H\u0017J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0096\u0002J\b\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020\bH\u0016JÎ\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u001eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0016\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0016\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0016\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0016\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0016\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0016\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0016\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0016\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\u001b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0016\u0010\u001c\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010+¨\u0006J"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "Lcom/squareup/wire/Message;", "", "order_type", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "order_side", "Lrosetta/order/Side;", "currency_pair_id", "", "ref_id", "buying_power", "", "entry_type", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$EntryType;", "asset_currency_code", "quote_currency_code", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "buying_selling_power", "amount_entered", "quantity", "total_native_amount", "spread", "new_coin_position", "order_state", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "monetization_model", "Lrosetta/nummus/MonetizationModel;", "fee_ratio", "limit_price", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;Lrosetta/order/Side;Ljava/lang/String;Ljava/lang/String;DLcom/robinhood/rosetta/eventlogging/CryptoOrderContext$EntryType;Ljava/lang/String;Ljava/lang/String;DDDDDDDLcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;Lrosetta/nummus/MonetizationModel;Ljava/lang/String;DLokio/ByteString;)V", "getOrder_type", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "getOrder_side", "()Lrosetta/order/Side;", "getCurrency_pair_id", "()Ljava/lang/String;", "getRef_id", "getBuying_power$annotations", "()V", "getBuying_power", "()D", "getEntry_type", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$EntryType;", "getAsset_currency_code", "getQuote_currency_code", "getPrice", "getBuying_selling_power", "getAmount_entered", "getQuantity", "getTotal_native_amount", "getSpread", "getNew_coin_position", "getOrder_state", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "getMonetization_model", "()Lrosetta/nummus/MonetizationModel;", "getFee_ratio", "getLimit_price", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "EntryType", "CryptoOrderType", "CryptoOrderState", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CryptoOrderContext extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoOrderContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "amountEntered", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final double amount_entered;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String asset_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "buyingPower", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final double buying_power;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "buyingSellingPower", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final double buying_selling_power;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String currency_pair_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoOrderContext$EntryType#ADAPTER", jsonName = "entryType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final EntryType entry_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final String fee_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "limitPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final double limit_price;

    @WireField(adapter = "rosetta.nummus.MonetizationModel#ADAPTER", jsonName = "monetizationModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final MonetizationModel monetization_model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "newCoinPosition", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final double new_coin_position;

    @WireField(adapter = "rosetta.order.Side#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Side order_side;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoOrderContext$CryptoOrderState#ADAPTER", jsonName = "orderState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final CryptoOrderState order_state;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoOrderContext$CryptoOrderType#ADAPTER", jsonName = "orderType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CryptoOrderType order_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final double price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final double quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String quote_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String ref_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final double spread;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "totalNativeAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final double total_native_amount;

    public CryptoOrderContext() {
        this(null, null, null, null, 0.0d, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 1048575, null);
    }

    @Deprecated
    public static /* synthetic */ void getBuying_power$annotations() {
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24153newBuilder();
    }

    public final CryptoOrderType getOrder_type() {
        return this.order_type;
    }

    public /* synthetic */ CryptoOrderContext(CryptoOrderType cryptoOrderType, Side side, String str, String str2, double d, EntryType entryType, String str3, String str4, double d2, double d3, double d4, double d5, double d6, double d7, double d8, CryptoOrderState cryptoOrderState, MonetizationModel monetizationModel, String str5, double d9, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CryptoOrderType.ORDER_TYPE_UNSPECIFIED : cryptoOrderType, (i & 2) != 0 ? Side.SIDE_UNSPECIFIED : side, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? 0.0d : d, (i & 32) != 0 ? EntryType.ENTRY_TYPE_UNSPECIFIED : entryType, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? 0.0d : d2, (i & 512) != 0 ? 0.0d : d3, (i & 1024) != 0 ? 0.0d : d4, (i & 2048) != 0 ? 0.0d : d5, (i & 4096) != 0 ? 0.0d : d6, (i & 8192) != 0 ? 0.0d : d7, (i & 16384) != 0 ? 0.0d : d8, (32768 & i) != 0 ? CryptoOrderState.ORDER_STATE_UNSPECIFIED : cryptoOrderState, (i & 65536) != 0 ? MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED : monetizationModel, (i & 131072) == 0 ? str5 : "", (i & 262144) != 0 ? 0.0d : d9, (i & 524288) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Side getOrder_side() {
        return this.order_side;
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final double getBuying_power() {
        return this.buying_power;
    }

    public final EntryType getEntry_type() {
        return this.entry_type;
    }

    public final String getAsset_currency_code() {
        return this.asset_currency_code;
    }

    public final String getQuote_currency_code() {
        return this.quote_currency_code;
    }

    public final double getPrice() {
        return this.price;
    }

    public final double getBuying_selling_power() {
        return this.buying_selling_power;
    }

    public final double getAmount_entered() {
        return this.amount_entered;
    }

    public final double getQuantity() {
        return this.quantity;
    }

    public final double getTotal_native_amount() {
        return this.total_native_amount;
    }

    public final double getSpread() {
        return this.spread;
    }

    public final double getNew_coin_position() {
        return this.new_coin_position;
    }

    public final CryptoOrderState getOrder_state() {
        return this.order_state;
    }

    public final MonetizationModel getMonetization_model() {
        return this.monetization_model;
    }

    public final String getFee_ratio() {
        return this.fee_ratio;
    }

    public final double getLimit_price() {
        return this.limit_price;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOrderContext(CryptoOrderType order_type, Side order_side, String currency_pair_id, String ref_id, double d, EntryType entry_type, String asset_currency_code, String quote_currency_code, double d2, double d3, double d4, double d5, double d6, double d7, double d8, CryptoOrderState order_state, MonetizationModel monetization_model, String fee_ratio, double d9, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(entry_type, "entry_type");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_type = order_type;
        this.order_side = order_side;
        this.currency_pair_id = currency_pair_id;
        this.ref_id = ref_id;
        this.buying_power = d;
        this.entry_type = entry_type;
        this.asset_currency_code = asset_currency_code;
        this.quote_currency_code = quote_currency_code;
        this.price = d2;
        this.buying_selling_power = d3;
        this.amount_entered = d4;
        this.quantity = d5;
        this.total_native_amount = d6;
        this.spread = d7;
        this.new_coin_position = d8;
        this.order_state = order_state;
        this.monetization_model = monetization_model;
        this.fee_ratio = fee_ratio;
        this.limit_price = d9;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24153newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoOrderContext)) {
            return false;
        }
        CryptoOrderContext cryptoOrderContext = (CryptoOrderContext) other;
        return Intrinsics.areEqual(unknownFields(), cryptoOrderContext.unknownFields()) && this.order_type == cryptoOrderContext.order_type && this.order_side == cryptoOrderContext.order_side && Intrinsics.areEqual(this.currency_pair_id, cryptoOrderContext.currency_pair_id) && Intrinsics.areEqual(this.ref_id, cryptoOrderContext.ref_id) && this.buying_power == cryptoOrderContext.buying_power && this.entry_type == cryptoOrderContext.entry_type && Intrinsics.areEqual(this.asset_currency_code, cryptoOrderContext.asset_currency_code) && Intrinsics.areEqual(this.quote_currency_code, cryptoOrderContext.quote_currency_code) && this.price == cryptoOrderContext.price && this.buying_selling_power == cryptoOrderContext.buying_selling_power && this.amount_entered == cryptoOrderContext.amount_entered && this.quantity == cryptoOrderContext.quantity && this.total_native_amount == cryptoOrderContext.total_native_amount && this.spread == cryptoOrderContext.spread && this.new_coin_position == cryptoOrderContext.new_coin_position && this.order_state == cryptoOrderContext.order_state && this.monetization_model == cryptoOrderContext.monetization_model && Intrinsics.areEqual(this.fee_ratio, cryptoOrderContext.fee_ratio) && this.limit_price == cryptoOrderContext.limit_price;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.order_type.hashCode()) * 37) + this.order_side.hashCode()) * 37) + this.currency_pair_id.hashCode()) * 37) + this.ref_id.hashCode()) * 37) + Double.hashCode(this.buying_power)) * 37) + this.entry_type.hashCode()) * 37) + this.asset_currency_code.hashCode()) * 37) + this.quote_currency_code.hashCode()) * 37) + Double.hashCode(this.price)) * 37) + Double.hashCode(this.buying_selling_power)) * 37) + Double.hashCode(this.amount_entered)) * 37) + Double.hashCode(this.quantity)) * 37) + Double.hashCode(this.total_native_amount)) * 37) + Double.hashCode(this.spread)) * 37) + Double.hashCode(this.new_coin_position)) * 37) + this.order_state.hashCode()) * 37) + this.monetization_model.hashCode()) * 37) + this.fee_ratio.hashCode()) * 37) + Double.hashCode(this.limit_price);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_type=" + this.order_type);
        arrayList.add("order_side=" + this.order_side);
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("buying_power=" + this.buying_power);
        arrayList.add("entry_type=" + this.entry_type);
        arrayList.add("asset_currency_code=" + Internal.sanitize(this.asset_currency_code));
        arrayList.add("quote_currency_code=" + Internal.sanitize(this.quote_currency_code));
        arrayList.add("price=" + this.price);
        arrayList.add("buying_selling_power=" + this.buying_selling_power);
        arrayList.add("amount_entered=" + this.amount_entered);
        arrayList.add("quantity=" + this.quantity);
        arrayList.add("total_native_amount=" + this.total_native_amount);
        arrayList.add("spread=" + this.spread);
        arrayList.add("new_coin_position=" + this.new_coin_position);
        arrayList.add("order_state=" + this.order_state);
        arrayList.add("monetization_model=" + this.monetization_model);
        arrayList.add("fee_ratio=" + Internal.sanitize(this.fee_ratio));
        arrayList.add("limit_price=" + this.limit_price);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoOrderContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoOrderContext copy$default(CryptoOrderContext cryptoOrderContext, CryptoOrderType cryptoOrderType, Side side, String str, String str2, double d, EntryType entryType, String str3, String str4, double d2, double d3, double d4, double d5, double d6, double d7, double d8, CryptoOrderState cryptoOrderState, MonetizationModel monetizationModel, String str5, double d9, ByteString byteString, int i, Object obj) {
        CryptoOrderType cryptoOrderType2 = (i & 1) != 0 ? cryptoOrderContext.order_type : cryptoOrderType;
        Side side2 = (i & 2) != 0 ? cryptoOrderContext.order_side : side;
        return cryptoOrderContext.copy(cryptoOrderType2, side2, (i & 4) != 0 ? cryptoOrderContext.currency_pair_id : str, (i & 8) != 0 ? cryptoOrderContext.ref_id : str2, (i & 16) != 0 ? cryptoOrderContext.buying_power : d, (i & 32) != 0 ? cryptoOrderContext.entry_type : entryType, (i & 64) != 0 ? cryptoOrderContext.asset_currency_code : str3, (i & 128) != 0 ? cryptoOrderContext.quote_currency_code : str4, (i & 256) != 0 ? cryptoOrderContext.price : d2, (i & 512) != 0 ? cryptoOrderContext.buying_selling_power : d3, (i & 1024) != 0 ? cryptoOrderContext.amount_entered : d4, (i & 2048) != 0 ? cryptoOrderContext.quantity : d5, (i & 4096) != 0 ? cryptoOrderContext.total_native_amount : d6, (i & 8192) != 0 ? cryptoOrderContext.spread : d7, (i & 16384) != 0 ? cryptoOrderContext.new_coin_position : d8, (i & 32768) != 0 ? cryptoOrderContext.order_state : cryptoOrderState, (i & 65536) != 0 ? cryptoOrderContext.monetization_model : monetizationModel, (i & 131072) != 0 ? cryptoOrderContext.fee_ratio : str5, (i & 262144) != 0 ? cryptoOrderContext.limit_price : d9, (i & 524288) != 0 ? cryptoOrderContext.unknownFields() : byteString);
    }

    public final CryptoOrderContext copy(CryptoOrderType order_type, Side order_side, String currency_pair_id, String ref_id, double buying_power, EntryType entry_type, String asset_currency_code, String quote_currency_code, double price, double buying_selling_power, double amount_entered, double quantity, double total_native_amount, double spread, double new_coin_position, CryptoOrderState order_state, MonetizationModel monetization_model, String fee_ratio, double limit_price, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(entry_type, "entry_type");
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(quote_currency_code, "quote_currency_code");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoOrderContext(order_type, order_side, currency_pair_id, ref_id, buying_power, entry_type, asset_currency_code, quote_currency_code, price, buying_selling_power, amount_entered, quantity, total_native_amount, spread, new_coin_position, order_state, monetization_model, fee_ratio, limit_price, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoOrderContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoOrderContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoOrderContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoOrderContext value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOrder_type() != CryptoOrderContext.CryptoOrderType.ORDER_TYPE_UNSPECIFIED) {
                    size += CryptoOrderContext.CryptoOrderType.ADAPTER.encodedSizeWithTag(1, value.getOrder_type());
                }
                if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(2, value.getOrder_side());
                }
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCurrency_pair_id());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRef_id());
                }
                if (!Double.valueOf(value.getBuying_power()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(5, Double.valueOf(value.getBuying_power()));
                }
                if (value.getEntry_type() != CryptoOrderContext.EntryType.ENTRY_TYPE_UNSPECIFIED) {
                    size += CryptoOrderContext.EntryType.ADAPTER.encodedSizeWithTag(6, value.getEntry_type());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getAsset_currency_code());
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getQuote_currency_code());
                }
                if (!Double.valueOf(value.getPrice()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(9, Double.valueOf(value.getPrice()));
                }
                if (!Double.valueOf(value.getBuying_selling_power()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(10, Double.valueOf(value.getBuying_selling_power()));
                }
                if (!Double.valueOf(value.getAmount_entered()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(11, Double.valueOf(value.getAmount_entered()));
                }
                if (!Double.valueOf(value.getQuantity()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(12, Double.valueOf(value.getQuantity()));
                }
                if (!Double.valueOf(value.getTotal_native_amount()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(13, Double.valueOf(value.getTotal_native_amount()));
                }
                if (!Double.valueOf(value.getSpread()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(14, Double.valueOf(value.getSpread()));
                }
                if (!Double.valueOf(value.getNew_coin_position()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(15, Double.valueOf(value.getNew_coin_position()));
                }
                if (value.getOrder_state() != CryptoOrderContext.CryptoOrderState.ORDER_STATE_UNSPECIFIED) {
                    size += CryptoOrderContext.CryptoOrderState.ADAPTER.encodedSizeWithTag(16, value.getOrder_state());
                }
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    size += MonetizationModel.ADAPTER.encodedSizeWithTag(17, value.getMonetization_model());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getFee_ratio());
                }
                return !Double.valueOf(value.getLimit_price()).equals(dValueOf) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(19, Double.valueOf(value.getLimit_price())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoOrderContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOrder_type() != CryptoOrderContext.CryptoOrderType.ORDER_TYPE_UNSPECIFIED) {
                    CryptoOrderContext.CryptoOrderType.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_type());
                }
                if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_side());
                }
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCurrency_pair_id());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRef_id());
                }
                if (!Double.valueOf(value.getBuying_power()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getBuying_power()));
                }
                if (value.getEntry_type() != CryptoOrderContext.EntryType.ENTRY_TYPE_UNSPECIFIED) {
                    CryptoOrderContext.EntryType.ADAPTER.encodeWithTag(writer, 6, (int) value.getEntry_type());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAsset_currency_code());
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getQuote_currency_code());
                }
                if (!Double.valueOf(value.getPrice()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getPrice()));
                }
                if (!Double.valueOf(value.getBuying_selling_power()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 10, (int) Double.valueOf(value.getBuying_selling_power()));
                }
                if (!Double.valueOf(value.getAmount_entered()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 11, (int) Double.valueOf(value.getAmount_entered()));
                }
                if (!Double.valueOf(value.getQuantity()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 12, (int) Double.valueOf(value.getQuantity()));
                }
                if (!Double.valueOf(value.getTotal_native_amount()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 13, (int) Double.valueOf(value.getTotal_native_amount()));
                }
                if (!Double.valueOf(value.getSpread()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 14, (int) Double.valueOf(value.getSpread()));
                }
                if (!Double.valueOf(value.getNew_coin_position()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 15, (int) Double.valueOf(value.getNew_coin_position()));
                }
                if (value.getOrder_state() != CryptoOrderContext.CryptoOrderState.ORDER_STATE_UNSPECIFIED) {
                    CryptoOrderContext.CryptoOrderState.ADAPTER.encodeWithTag(writer, 16, (int) value.getOrder_state());
                }
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    MonetizationModel.ADAPTER.encodeWithTag(writer, 17, (int) value.getMonetization_model());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getFee_ratio());
                }
                if (!Double.valueOf(value.getLimit_price()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 19, (int) Double.valueOf(value.getLimit_price()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoOrderContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Double dValueOf = Double.valueOf(value.getLimit_price());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 19, (int) Double.valueOf(value.getLimit_price()));
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getFee_ratio());
                }
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    MonetizationModel.ADAPTER.encodeWithTag(writer, 17, (int) value.getMonetization_model());
                }
                if (value.getOrder_state() != CryptoOrderContext.CryptoOrderState.ORDER_STATE_UNSPECIFIED) {
                    CryptoOrderContext.CryptoOrderState.ADAPTER.encodeWithTag(writer, 16, (int) value.getOrder_state());
                }
                if (!Double.valueOf(value.getNew_coin_position()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 15, (int) Double.valueOf(value.getNew_coin_position()));
                }
                if (!Double.valueOf(value.getSpread()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 14, (int) Double.valueOf(value.getSpread()));
                }
                if (!Double.valueOf(value.getTotal_native_amount()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 13, (int) Double.valueOf(value.getTotal_native_amount()));
                }
                if (!Double.valueOf(value.getQuantity()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 12, (int) Double.valueOf(value.getQuantity()));
                }
                if (!Double.valueOf(value.getAmount_entered()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 11, (int) Double.valueOf(value.getAmount_entered()));
                }
                if (!Double.valueOf(value.getBuying_selling_power()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 10, (int) Double.valueOf(value.getBuying_selling_power()));
                }
                if (!Double.valueOf(value.getPrice()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getPrice()));
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getQuote_currency_code());
                }
                if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAsset_currency_code());
                }
                if (value.getEntry_type() != CryptoOrderContext.EntryType.ENTRY_TYPE_UNSPECIFIED) {
                    CryptoOrderContext.EntryType.ADAPTER.encodeWithTag(writer, 6, (int) value.getEntry_type());
                }
                if (!Double.valueOf(value.getBuying_power()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getBuying_power()));
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCurrency_pair_id());
                }
                if (value.getOrder_side() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_side());
                }
                if (value.getOrder_type() != CryptoOrderContext.CryptoOrderType.ORDER_TYPE_UNSPECIFIED) {
                    CryptoOrderContext.CryptoOrderType.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoOrderContext decode(ProtoReader reader) throws IOException {
                CryptoOrderContext.CryptoOrderType cryptoOrderType;
                Side side;
                CryptoOrderContext.EntryType entryType;
                Intrinsics.checkNotNullParameter(reader, "reader");
                CryptoOrderContext.CryptoOrderType cryptoOrderType2 = CryptoOrderContext.CryptoOrderType.ORDER_TYPE_UNSPECIFIED;
                Side side2 = Side.SIDE_UNSPECIFIED;
                CryptoOrderContext.EntryType entryType2 = CryptoOrderContext.EntryType.ENTRY_TYPE_UNSPECIFIED;
                CryptoOrderContext.CryptoOrderState cryptoOrderState = CryptoOrderContext.CryptoOrderState.ORDER_STATE_UNSPECIFIED;
                MonetizationModel monetizationModel = MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                double dDoubleValue4 = 0.0d;
                double dDoubleValue5 = 0.0d;
                double dDoubleValue6 = 0.0d;
                double dDoubleValue7 = 0.0d;
                double dDoubleValue8 = 0.0d;
                double dDoubleValue9 = 0.0d;
                MonetizationModel monetizationModelDecode = monetizationModel;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                CryptoOrderContext.CryptoOrderState cryptoOrderStateDecode = cryptoOrderState;
                CryptoOrderContext.EntryType entryTypeDecode = entryType2;
                Side sideDecode = side2;
                CryptoOrderContext.CryptoOrderType cryptoOrderTypeDecode = cryptoOrderType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                cryptoOrderType = cryptoOrderTypeDecode;
                                side = sideDecode;
                                entryType = entryTypeDecode;
                                try {
                                    cryptoOrderTypeDecode = CryptoOrderContext.CryptoOrderType.ADAPTER.decode(reader);
                                    entryTypeDecode = entryType;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                sideDecode = side;
                                break;
                            case 2:
                                cryptoOrderType = cryptoOrderTypeDecode;
                                side = sideDecode;
                                entryType = entryTypeDecode;
                                try {
                                    sideDecode = Side.ADAPTER.decode(reader);
                                    entryTypeDecode = entryType;
                                    cryptoOrderTypeDecode = cryptoOrderType;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 3:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                cryptoOrderType = cryptoOrderTypeDecode;
                                side = sideDecode;
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                cryptoOrderTypeDecode = cryptoOrderType;
                                sideDecode = side;
                                break;
                            case 6:
                                cryptoOrderType = cryptoOrderTypeDecode;
                                side = sideDecode;
                                entryType = entryTypeDecode;
                                try {
                                    entryTypeDecode = CryptoOrderContext.EntryType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                cryptoOrderTypeDecode = cryptoOrderType;
                                sideDecode = side;
                                break;
                            case 7:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                cryptoOrderType = cryptoOrderTypeDecode;
                                side = sideDecode;
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                cryptoOrderTypeDecode = cryptoOrderType;
                                sideDecode = side;
                                break;
                            case 10:
                                cryptoOrderType = cryptoOrderTypeDecode;
                                side = sideDecode;
                                dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                cryptoOrderTypeDecode = cryptoOrderType;
                                sideDecode = side;
                                break;
                            case 11:
                                cryptoOrderType = cryptoOrderTypeDecode;
                                side = sideDecode;
                                dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                cryptoOrderTypeDecode = cryptoOrderType;
                                sideDecode = side;
                                break;
                            case 12:
                                cryptoOrderType = cryptoOrderTypeDecode;
                                side = sideDecode;
                                dDoubleValue5 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                cryptoOrderTypeDecode = cryptoOrderType;
                                sideDecode = side;
                                break;
                            case 13:
                                cryptoOrderType = cryptoOrderTypeDecode;
                                side = sideDecode;
                                dDoubleValue6 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                cryptoOrderTypeDecode = cryptoOrderType;
                                sideDecode = side;
                                break;
                            case 14:
                                cryptoOrderType = cryptoOrderTypeDecode;
                                side = sideDecode;
                                dDoubleValue7 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                cryptoOrderTypeDecode = cryptoOrderType;
                                sideDecode = side;
                                break;
                            case 15:
                                cryptoOrderType = cryptoOrderTypeDecode;
                                side = sideDecode;
                                dDoubleValue8 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                cryptoOrderTypeDecode = cryptoOrderType;
                                sideDecode = side;
                                break;
                            case 16:
                                cryptoOrderType = cryptoOrderTypeDecode;
                                side = sideDecode;
                                try {
                                    cryptoOrderStateDecode = CryptoOrderContext.CryptoOrderState.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    entryType = entryTypeDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                                cryptoOrderTypeDecode = cryptoOrderType;
                                sideDecode = side;
                                break;
                            case 17:
                                try {
                                    monetizationModelDecode = MonetizationModel.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    cryptoOrderType = cryptoOrderTypeDecode;
                                    side = sideDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                            case 18:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 19:
                                dDoubleValue9 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                cryptoOrderType = cryptoOrderTypeDecode;
                                side = sideDecode;
                                entryType = entryTypeDecode;
                                entryTypeDecode = entryType;
                                cryptoOrderTypeDecode = cryptoOrderType;
                                sideDecode = side;
                                break;
                        }
                    } else {
                        return new CryptoOrderContext(cryptoOrderTypeDecode, sideDecode, strDecode4, strDecode5, dDoubleValue, entryTypeDecode, strDecode, strDecode2, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue7, dDoubleValue8, cryptoOrderStateDecode, monetizationModelDecode, strDecode3, dDoubleValue9, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoOrderContext redact(CryptoOrderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CryptoOrderContext.copy$default(value, null, null, null, null, 0.0d, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, ByteString.EMPTY, 524287, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$EntryType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_TYPE_UNSPECIFIED", "ASSET", "QUOTE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryType> ADAPTER;
        public static final EntryType ASSET;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryType ENTRY_TYPE_UNSPECIFIED;
        public static final EntryType QUOTE;
        private final int value;

        private static final /* synthetic */ EntryType[] $values() {
            return new EntryType[]{ENTRY_TYPE_UNSPECIFIED, ASSET, QUOTE};
        }

        @JvmStatic
        public static final EntryType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EntryType> getEntries() {
            return $ENTRIES;
        }

        private EntryType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EntryType entryType = new EntryType("ENTRY_TYPE_UNSPECIFIED", 0, 0);
            ENTRY_TYPE_UNSPECIFIED = entryType;
            ASSET = new EntryType("ASSET", 1, 1);
            QUOTE = new EntryType("QUOTE", 2, 2);
            EntryType[] entryTypeArr$values = $values();
            $VALUES = entryTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryType>(orCreateKotlinClass, syntax, entryType) { // from class: com.robinhood.rosetta.eventlogging.CryptoOrderContext$EntryType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CryptoOrderContext.EntryType fromValue(int value) {
                    return CryptoOrderContext.EntryType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CryptoOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$EntryType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$EntryType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EntryType fromValue(int value) {
                if (value == 0) {
                    return EntryType.ENTRY_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return EntryType.ASSET;
                }
                if (value != 2) {
                    return null;
                }
                return EntryType.QUOTE;
            }
        }

        public static EntryType valueOf(String str) {
            return (EntryType) Enum.valueOf(EntryType.class, str);
        }

        public static EntryType[] values() {
            return (EntryType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_TYPE_UNSPECIFIED", "MARKET", "RECURRING", "LIMIT", "STOP_LOSS", "STOP_LIMIT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CryptoOrderType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CryptoOrderType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CryptoOrderType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CryptoOrderType LIMIT;
        public static final CryptoOrderType MARKET;
        public static final CryptoOrderType ORDER_TYPE_UNSPECIFIED;
        public static final CryptoOrderType RECURRING;
        public static final CryptoOrderType STOP_LIMIT;
        public static final CryptoOrderType STOP_LOSS;
        private final int value;

        private static final /* synthetic */ CryptoOrderType[] $values() {
            return new CryptoOrderType[]{ORDER_TYPE_UNSPECIFIED, MARKET, RECURRING, LIMIT, STOP_LOSS, STOP_LIMIT};
        }

        @JvmStatic
        public static final CryptoOrderType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CryptoOrderType> getEntries() {
            return $ENTRIES;
        }

        private CryptoOrderType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CryptoOrderType cryptoOrderType = new CryptoOrderType("ORDER_TYPE_UNSPECIFIED", 0, 0);
            ORDER_TYPE_UNSPECIFIED = cryptoOrderType;
            MARKET = new CryptoOrderType("MARKET", 1, 1);
            RECURRING = new CryptoOrderType("RECURRING", 2, 2);
            LIMIT = new CryptoOrderType("LIMIT", 3, 3);
            STOP_LOSS = new CryptoOrderType("STOP_LOSS", 4, 4);
            STOP_LIMIT = new CryptoOrderType("STOP_LIMIT", 5, 5);
            CryptoOrderType[] cryptoOrderTypeArr$values = $values();
            $VALUES = cryptoOrderTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cryptoOrderTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoOrderType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CryptoOrderType>(orCreateKotlinClass, syntax, cryptoOrderType) { // from class: com.robinhood.rosetta.eventlogging.CryptoOrderContext$CryptoOrderType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CryptoOrderContext.CryptoOrderType fromValue(int value) {
                    return CryptoOrderContext.CryptoOrderType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CryptoOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CryptoOrderType fromValue(int value) {
                if (value == 0) {
                    return CryptoOrderType.ORDER_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return CryptoOrderType.MARKET;
                }
                if (value == 2) {
                    return CryptoOrderType.RECURRING;
                }
                if (value == 3) {
                    return CryptoOrderType.LIMIT;
                }
                if (value == 4) {
                    return CryptoOrderType.STOP_LOSS;
                }
                if (value != 5) {
                    return null;
                }
                return CryptoOrderType.STOP_LIMIT;
            }
        }

        public static CryptoOrderType valueOf(String str) {
            return (CryptoOrderType) Enum.valueOf(CryptoOrderType.class, str);
        }

        public static CryptoOrderType[] values() {
            return (CryptoOrderType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoOrderContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_STATE_UNSPECIFIED", "CANCELED", "CONFIRMED", "FAILED", "FILLED", "NEW", "PARTIALLY_FILLED", "REJECTED", "UNCONFIRMED", "VOIDED", "QUEUED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CryptoOrderState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CryptoOrderState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CryptoOrderState> ADAPTER;
        public static final CryptoOrderState CANCELED;
        public static final CryptoOrderState CONFIRMED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CryptoOrderState FAILED;
        public static final CryptoOrderState FILLED;
        public static final CryptoOrderState NEW;
        public static final CryptoOrderState ORDER_STATE_UNSPECIFIED;
        public static final CryptoOrderState PARTIALLY_FILLED;
        public static final CryptoOrderState QUEUED;
        public static final CryptoOrderState REJECTED;
        public static final CryptoOrderState UNCONFIRMED;
        public static final CryptoOrderState VOIDED;
        private final int value;

        private static final /* synthetic */ CryptoOrderState[] $values() {
            return new CryptoOrderState[]{ORDER_STATE_UNSPECIFIED, CANCELED, CONFIRMED, FAILED, FILLED, NEW, PARTIALLY_FILLED, REJECTED, UNCONFIRMED, VOIDED, QUEUED};
        }

        @JvmStatic
        public static final CryptoOrderState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CryptoOrderState> getEntries() {
            return $ENTRIES;
        }

        private CryptoOrderState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CryptoOrderState cryptoOrderState = new CryptoOrderState("ORDER_STATE_UNSPECIFIED", 0, 0);
            ORDER_STATE_UNSPECIFIED = cryptoOrderState;
            CANCELED = new CryptoOrderState("CANCELED", 1, 1);
            CONFIRMED = new CryptoOrderState("CONFIRMED", 2, 2);
            FAILED = new CryptoOrderState("FAILED", 3, 3);
            FILLED = new CryptoOrderState("FILLED", 4, 4);
            NEW = new CryptoOrderState("NEW", 5, 5);
            PARTIALLY_FILLED = new CryptoOrderState("PARTIALLY_FILLED", 6, 6);
            REJECTED = new CryptoOrderState("REJECTED", 7, 7);
            UNCONFIRMED = new CryptoOrderState("UNCONFIRMED", 8, 8);
            VOIDED = new CryptoOrderState("VOIDED", 9, 9);
            QUEUED = new CryptoOrderState("QUEUED", 10, 10);
            CryptoOrderState[] cryptoOrderStateArr$values = $values();
            $VALUES = cryptoOrderStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cryptoOrderStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoOrderState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CryptoOrderState>(orCreateKotlinClass, syntax, cryptoOrderState) { // from class: com.robinhood.rosetta.eventlogging.CryptoOrderContext$CryptoOrderState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CryptoOrderContext.CryptoOrderState fromValue(int value) {
                    return CryptoOrderContext.CryptoOrderState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CryptoOrderContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$CryptoOrderState;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CryptoOrderState fromValue(int value) {
                switch (value) {
                    case 0:
                        return CryptoOrderState.ORDER_STATE_UNSPECIFIED;
                    case 1:
                        return CryptoOrderState.CANCELED;
                    case 2:
                        return CryptoOrderState.CONFIRMED;
                    case 3:
                        return CryptoOrderState.FAILED;
                    case 4:
                        return CryptoOrderState.FILLED;
                    case 5:
                        return CryptoOrderState.NEW;
                    case 6:
                        return CryptoOrderState.PARTIALLY_FILLED;
                    case 7:
                        return CryptoOrderState.REJECTED;
                    case 8:
                        return CryptoOrderState.UNCONFIRMED;
                    case 9:
                        return CryptoOrderState.VOIDED;
                    case 10:
                        return CryptoOrderState.QUEUED;
                    default:
                        return null;
                }
            }
        }

        public static CryptoOrderState valueOf(String str) {
            return (CryptoOrderState) Enum.valueOf(CryptoOrderState.class, str);
        }

        public static CryptoOrderState[] values() {
            return (CryptoOrderState[]) $VALUES.clone();
        }
    }
}

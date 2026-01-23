package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.compose.bidask.BidAskDetails3;
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

/* compiled from: Quote.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010%\u001a\u00020\u0002H\u0017J\u0013\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0004H\u0016J\u0092\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Quote;", "Lcom/squareup/wire/Message;", "", BidAskDetails3.ASK_PRICE, "", BidAskDetails3.ASK_SIZE, BidAskDetails3.BID_PRICE, BidAskDetails3.BID_SIZE, "last_trade_price", "last_extended_hours_trade_price", "previous_close", "adjusted_previous_close", "symbol", "trading_halted", "", "has_traded", "last_trade_price_source", "instrument_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAsk_price", "()Ljava/lang/String;", "getAsk_size", "getBid_price", "getBid_size", "getLast_trade_price", "getLast_extended_hours_trade_price", "getPrevious_close", "getAdjusted_previous_close", "getSymbol", "getTrading_halted", "()Z", "getHas_traded", "getLast_trade_price_source", "getInstrument_id", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Quote extends Message {

    @JvmField
    public static final ProtoAdapter<Quote> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "adjustedPreviousClose", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String adjusted_previous_close;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ask_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String ask_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String bid_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String bid_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasTraded", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final boolean has_traded;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastExtendedHoursTradePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String last_extended_hours_trade_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastTradePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String last_trade_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastTradePriceSource", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String last_trade_price_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previousClose", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String previous_close;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tradingHalted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final boolean trading_halted;

    public Quote() {
        this(null, null, null, null, null, null, null, null, null, false, false, null, null, null, 16383, null);
    }

    public /* synthetic */ Quote(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, String str10, String str11, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? false : z, (i & 1024) == 0 ? z2 : false, (i & 2048) != 0 ? "" : str10, (i & 4096) == 0 ? str11 : "", (i & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24519newBuilder();
    }

    public final String getAsk_price() {
        return this.ask_price;
    }

    public final String getAsk_size() {
        return this.ask_size;
    }

    public final String getBid_price() {
        return this.bid_price;
    }

    public final String getBid_size() {
        return this.bid_size;
    }

    public final String getLast_trade_price() {
        return this.last_trade_price;
    }

    public final String getLast_extended_hours_trade_price() {
        return this.last_extended_hours_trade_price;
    }

    public final String getPrevious_close() {
        return this.previous_close;
    }

    public final String getAdjusted_previous_close() {
        return this.adjusted_previous_close;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final boolean getTrading_halted() {
        return this.trading_halted;
    }

    public final boolean getHas_traded() {
        return this.has_traded;
    }

    public final String getLast_trade_price_source() {
        return this.last_trade_price_source;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Quote(String ask_price, String ask_size, String bid_price, String bid_size, String last_trade_price, String last_extended_hours_trade_price, String previous_close, String adjusted_previous_close, String symbol, boolean z, boolean z2, String last_trade_price_source, String instrument_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_size, "ask_size");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_size, "bid_size");
        Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
        Intrinsics.checkNotNullParameter(last_extended_hours_trade_price, "last_extended_hours_trade_price");
        Intrinsics.checkNotNullParameter(previous_close, "previous_close");
        Intrinsics.checkNotNullParameter(adjusted_previous_close, "adjusted_previous_close");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(last_trade_price_source, "last_trade_price_source");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ask_price = ask_price;
        this.ask_size = ask_size;
        this.bid_price = bid_price;
        this.bid_size = bid_size;
        this.last_trade_price = last_trade_price;
        this.last_extended_hours_trade_price = last_extended_hours_trade_price;
        this.previous_close = previous_close;
        this.adjusted_previous_close = adjusted_previous_close;
        this.symbol = symbol;
        this.trading_halted = z;
        this.has_traded = z2;
        this.last_trade_price_source = last_trade_price_source;
        this.instrument_id = instrument_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24519newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Quote)) {
            return false;
        }
        Quote quote = (Quote) other;
        return Intrinsics.areEqual(unknownFields(), quote.unknownFields()) && Intrinsics.areEqual(this.ask_price, quote.ask_price) && Intrinsics.areEqual(this.ask_size, quote.ask_size) && Intrinsics.areEqual(this.bid_price, quote.bid_price) && Intrinsics.areEqual(this.bid_size, quote.bid_size) && Intrinsics.areEqual(this.last_trade_price, quote.last_trade_price) && Intrinsics.areEqual(this.last_extended_hours_trade_price, quote.last_extended_hours_trade_price) && Intrinsics.areEqual(this.previous_close, quote.previous_close) && Intrinsics.areEqual(this.adjusted_previous_close, quote.adjusted_previous_close) && Intrinsics.areEqual(this.symbol, quote.symbol) && this.trading_halted == quote.trading_halted && this.has_traded == quote.has_traded && Intrinsics.areEqual(this.last_trade_price_source, quote.last_trade_price_source) && Intrinsics.areEqual(this.instrument_id, quote.instrument_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.ask_price.hashCode()) * 37) + this.ask_size.hashCode()) * 37) + this.bid_price.hashCode()) * 37) + this.bid_size.hashCode()) * 37) + this.last_trade_price.hashCode()) * 37) + this.last_extended_hours_trade_price.hashCode()) * 37) + this.previous_close.hashCode()) * 37) + this.adjusted_previous_close.hashCode()) * 37) + this.symbol.hashCode()) * 37) + java.lang.Boolean.hashCode(this.trading_halted)) * 37) + java.lang.Boolean.hashCode(this.has_traded)) * 37) + this.last_trade_price_source.hashCode()) * 37) + this.instrument_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ask_price=" + Internal.sanitize(this.ask_price));
        arrayList.add("ask_size=" + Internal.sanitize(this.ask_size));
        arrayList.add("bid_price=" + Internal.sanitize(this.bid_price));
        arrayList.add("bid_size=" + Internal.sanitize(this.bid_size));
        arrayList.add("last_trade_price=" + Internal.sanitize(this.last_trade_price));
        arrayList.add("last_extended_hours_trade_price=" + Internal.sanitize(this.last_extended_hours_trade_price));
        arrayList.add("previous_close=" + Internal.sanitize(this.previous_close));
        arrayList.add("adjusted_previous_close=" + Internal.sanitize(this.adjusted_previous_close));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("trading_halted=" + this.trading_halted);
        arrayList.add("has_traded=" + this.has_traded);
        arrayList.add("last_trade_price_source=" + Internal.sanitize(this.last_trade_price_source));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Quote{", "}", 0, null, null, 56, null);
    }

    public final Quote copy(String ask_price, String ask_size, String bid_price, String bid_size, String last_trade_price, String last_extended_hours_trade_price, String previous_close, String adjusted_previous_close, String symbol, boolean trading_halted, boolean has_traded, String last_trade_price_source, String instrument_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_size, "ask_size");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_size, "bid_size");
        Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
        Intrinsics.checkNotNullParameter(last_extended_hours_trade_price, "last_extended_hours_trade_price");
        Intrinsics.checkNotNullParameter(previous_close, "previous_close");
        Intrinsics.checkNotNullParameter(adjusted_previous_close, "adjusted_previous_close");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(last_trade_price_source, "last_trade_price_source");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Quote(ask_price, ask_size, bid_price, bid_size, last_trade_price, last_extended_hours_trade_price, previous_close, adjusted_previous_close, symbol, trading_halted, has_traded, last_trade_price_source, instrument_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Quote.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Quote>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.Quote$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Quote value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAsk_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_size(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAsk_size());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getBid_size(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getBid_size());
                }
                if (!Intrinsics.areEqual(value.getLast_trade_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLast_trade_price());
                }
                if (!Intrinsics.areEqual(value.getLast_extended_hours_trade_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getLast_extended_hours_trade_price());
                }
                if (!Intrinsics.areEqual(value.getPrevious_close(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getPrevious_close());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_previous_close(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getAdjusted_previous_close());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getSymbol());
                }
                if (value.getTrading_halted()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(10, java.lang.Boolean.valueOf(value.getTrading_halted()));
                }
                if (value.getHas_traded()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(11, java.lang.Boolean.valueOf(value.getHas_traded()));
                }
                if (!Intrinsics.areEqual(value.getLast_trade_price_source(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getLast_trade_price_source());
                }
                return !Intrinsics.areEqual(value.getInstrument_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(13, value.getInstrument_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Quote value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsk_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsk_size());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getBid_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBid_size());
                }
                if (!Intrinsics.areEqual(value.getLast_trade_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLast_trade_price());
                }
                if (!Intrinsics.areEqual(value.getLast_extended_hours_trade_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getLast_extended_hours_trade_price());
                }
                if (!Intrinsics.areEqual(value.getPrevious_close(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPrevious_close());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_previous_close(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getAdjusted_previous_close());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getSymbol());
                }
                if (value.getTrading_halted()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) java.lang.Boolean.valueOf(value.getTrading_halted()));
                }
                if (value.getHas_traded()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) java.lang.Boolean.valueOf(value.getHas_traded()));
                }
                if (!Intrinsics.areEqual(value.getLast_trade_price_source(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getLast_trade_price_source());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getInstrument_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Quote value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getLast_trade_price_source(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getLast_trade_price_source());
                }
                if (value.getHas_traded()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) java.lang.Boolean.valueOf(value.getHas_traded()));
                }
                if (value.getTrading_halted()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) java.lang.Boolean.valueOf(value.getTrading_halted()));
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_previous_close(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getAdjusted_previous_close());
                }
                if (!Intrinsics.areEqual(value.getPrevious_close(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPrevious_close());
                }
                if (!Intrinsics.areEqual(value.getLast_extended_hours_trade_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getLast_extended_hours_trade_price());
                }
                if (!Intrinsics.areEqual(value.getLast_trade_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLast_trade_price());
                }
                if (!Intrinsics.areEqual(value.getBid_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBid_size());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_size(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsk_size());
                }
                if (Intrinsics.areEqual(value.getAsk_price(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsk_price());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Quote redact(Quote value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((8191 & 1) != 0 ? value.ask_price : null, (8191 & 2) != 0 ? value.ask_size : null, (8191 & 4) != 0 ? value.bid_price : null, (8191 & 8) != 0 ? value.bid_size : null, (8191 & 16) != 0 ? value.last_trade_price : null, (8191 & 32) != 0 ? value.last_extended_hours_trade_price : null, (8191 & 64) != 0 ? value.previous_close : null, (8191 & 128) != 0 ? value.adjusted_previous_close : null, (8191 & 256) != 0 ? value.symbol : null, (8191 & 512) != 0 ? value.trading_halted : false, (8191 & 1024) != 0 ? value.has_traded : false, (8191 & 2048) != 0 ? value.last_trade_price_source : null, (8191 & 4096) != 0 ? value.instrument_id : null, (8191 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Quote decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                String strDecode11 = strDecode10;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 11:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 12:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new Quote(strDecode, strDecode11, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, zBooleanValue, zBooleanValue2, strDecode9, strDecode10, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}

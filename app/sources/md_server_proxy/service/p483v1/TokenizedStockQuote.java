package md_server_proxy.service.p483v1;

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

/* compiled from: TokenizedStockQuote.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B¡\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010'\u001a\u00020\u0002H\u0017J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0004H\u0016J \u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018¨\u00061"}, m3636d2 = {"Lmd_server_proxy/service/v1/TokenizedStockQuote;", "Lcom/squareup/wire/Message;", "", BidAskDetails3.ASK_PRICE, "", "ask_time", BidAskDetails3.BID_PRICE, "bid_time", "mark_price", "symbol", "id", "updated_at", "currency_code", "Lmd_server_proxy/service/v1/CurrencyCode;", "previous_close", "adjusted_previous_close", "last_trade_price", "last_non_reg_trade_price", "last_extended_hours_trade_price", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/CurrencyCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAsk_price", "()Ljava/lang/String;", "getAsk_time", "getBid_price", "getBid_time", "getMark_price", "getSymbol", "getId", "getUpdated_at", "getCurrency_code", "()Lmd_server_proxy/service/v1/CurrencyCode;", "getPrevious_close", "getAdjusted_previous_close", "getLast_trade_price", "getLast_non_reg_trade_price", "getLast_extended_hours_trade_price", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class TokenizedStockQuote extends Message {

    @JvmField
    public static final ProtoAdapter<TokenizedStockQuote> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "adjustedPreviousClose", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String adjusted_previous_close;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ask_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String ask_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String bid_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String bid_time;

    @WireField(adapter = "md_server_proxy.service.v1.CurrencyCode#ADAPTER", jsonName = "currencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final CurrencyCode currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastExtendedHoursTradePrice", schemaIndex = 13, tag = 14)
    private final String last_extended_hours_trade_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastNonRegTradePrice", schemaIndex = 12, tag = 13)
    private final String last_non_reg_trade_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastTradePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String last_trade_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "markPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String mark_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previousClose", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String previous_close;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String updated_at;

    public TokenizedStockQuote() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public /* synthetic */ TokenizedStockQuote(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CurrencyCode currencyCode, String str9, String str10, String str11, String str12, String str13, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? CurrencyCode.CURRENCY_CODE_UNSPECIFIED : currencyCode, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) == 0 ? str11 : "", (i & 4096) != 0 ? null : str12, (i & 8192) == 0 ? str13 : null, (i & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28927newBuilder();
    }

    public final String getAsk_price() {
        return this.ask_price;
    }

    public final String getAsk_time() {
        return this.ask_time;
    }

    public final String getBid_price() {
        return this.bid_price;
    }

    public final String getBid_time() {
        return this.bid_time;
    }

    public final String getMark_price() {
        return this.mark_price;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getId() {
        return this.id;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    public final CurrencyCode getCurrency_code() {
        return this.currency_code;
    }

    public final String getPrevious_close() {
        return this.previous_close;
    }

    public final String getAdjusted_previous_close() {
        return this.adjusted_previous_close;
    }

    public final String getLast_trade_price() {
        return this.last_trade_price;
    }

    public final String getLast_non_reg_trade_price() {
        return this.last_non_reg_trade_price;
    }

    public final String getLast_extended_hours_trade_price() {
        return this.last_extended_hours_trade_price;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenizedStockQuote(String ask_price, String ask_time, String bid_price, String bid_time, String mark_price, String symbol, String id, String updated_at, CurrencyCode currency_code, String previous_close, String adjusted_previous_close, String last_trade_price, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_time, "ask_time");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_time, "bid_time");
        Intrinsics.checkNotNullParameter(mark_price, "mark_price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(previous_close, "previous_close");
        Intrinsics.checkNotNullParameter(adjusted_previous_close, "adjusted_previous_close");
        Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ask_price = ask_price;
        this.ask_time = ask_time;
        this.bid_price = bid_price;
        this.bid_time = bid_time;
        this.mark_price = mark_price;
        this.symbol = symbol;
        this.id = id;
        this.updated_at = updated_at;
        this.currency_code = currency_code;
        this.previous_close = previous_close;
        this.adjusted_previous_close = adjusted_previous_close;
        this.last_trade_price = last_trade_price;
        this.last_non_reg_trade_price = str;
        this.last_extended_hours_trade_price = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28927newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TokenizedStockQuote)) {
            return false;
        }
        TokenizedStockQuote tokenizedStockQuote = (TokenizedStockQuote) other;
        return Intrinsics.areEqual(unknownFields(), tokenizedStockQuote.unknownFields()) && Intrinsics.areEqual(this.ask_price, tokenizedStockQuote.ask_price) && Intrinsics.areEqual(this.ask_time, tokenizedStockQuote.ask_time) && Intrinsics.areEqual(this.bid_price, tokenizedStockQuote.bid_price) && Intrinsics.areEqual(this.bid_time, tokenizedStockQuote.bid_time) && Intrinsics.areEqual(this.mark_price, tokenizedStockQuote.mark_price) && Intrinsics.areEqual(this.symbol, tokenizedStockQuote.symbol) && Intrinsics.areEqual(this.id, tokenizedStockQuote.id) && Intrinsics.areEqual(this.updated_at, tokenizedStockQuote.updated_at) && this.currency_code == tokenizedStockQuote.currency_code && Intrinsics.areEqual(this.previous_close, tokenizedStockQuote.previous_close) && Intrinsics.areEqual(this.adjusted_previous_close, tokenizedStockQuote.adjusted_previous_close) && Intrinsics.areEqual(this.last_trade_price, tokenizedStockQuote.last_trade_price) && Intrinsics.areEqual(this.last_non_reg_trade_price, tokenizedStockQuote.last_non_reg_trade_price) && Intrinsics.areEqual(this.last_extended_hours_trade_price, tokenizedStockQuote.last_extended_hours_trade_price);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.ask_price.hashCode()) * 37) + this.ask_time.hashCode()) * 37) + this.bid_price.hashCode()) * 37) + this.bid_time.hashCode()) * 37) + this.mark_price.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.id.hashCode()) * 37) + this.updated_at.hashCode()) * 37) + this.currency_code.hashCode()) * 37) + this.previous_close.hashCode()) * 37) + this.adjusted_previous_close.hashCode()) * 37) + this.last_trade_price.hashCode()) * 37;
        String str = this.last_non_reg_trade_price;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.last_extended_hours_trade_price;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ask_price=" + Internal.sanitize(this.ask_price));
        arrayList.add("ask_time=" + Internal.sanitize(this.ask_time));
        arrayList.add("bid_price=" + Internal.sanitize(this.bid_price));
        arrayList.add("bid_time=" + Internal.sanitize(this.bid_time));
        arrayList.add("mark_price=" + Internal.sanitize(this.mark_price));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        arrayList.add("currency_code=" + this.currency_code);
        arrayList.add("previous_close=" + Internal.sanitize(this.previous_close));
        arrayList.add("adjusted_previous_close=" + Internal.sanitize(this.adjusted_previous_close));
        arrayList.add("last_trade_price=" + Internal.sanitize(this.last_trade_price));
        String str = this.last_non_reg_trade_price;
        if (str != null) {
            arrayList.add("last_non_reg_trade_price=" + Internal.sanitize(str));
        }
        String str2 = this.last_extended_hours_trade_price;
        if (str2 != null) {
            arrayList.add("last_extended_hours_trade_price=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TokenizedStockQuote{", "}", 0, null, null, 56, null);
    }

    public final TokenizedStockQuote copy(String ask_price, String ask_time, String bid_price, String bid_time, String mark_price, String symbol, String id, String updated_at, CurrencyCode currency_code, String previous_close, String adjusted_previous_close, String last_trade_price, String last_non_reg_trade_price, String last_extended_hours_trade_price, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_time, "ask_time");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_time, "bid_time");
        Intrinsics.checkNotNullParameter(mark_price, "mark_price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(previous_close, "previous_close");
        Intrinsics.checkNotNullParameter(adjusted_previous_close, "adjusted_previous_close");
        Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TokenizedStockQuote(ask_price, ask_time, bid_price, bid_time, mark_price, symbol, id, updated_at, currency_code, previous_close, adjusted_previous_close, last_trade_price, last_non_reg_trade_price, last_extended_hours_trade_price, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TokenizedStockQuote.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TokenizedStockQuote>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: md_server_proxy.service.v1.TokenizedStockQuote$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TokenizedStockQuote value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAsk_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_time(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAsk_time());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getBid_time(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getBid_time());
                }
                if (!Intrinsics.areEqual(value.getMark_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getMark_price());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getId());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getUpdated_at());
                }
                if (value.getCurrency_code() != CurrencyCode.CURRENCY_CODE_UNSPECIFIED) {
                    size += CurrencyCode.ADAPTER.encodedSizeWithTag(9, value.getCurrency_code());
                }
                if (!Intrinsics.areEqual(value.getPrevious_close(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getPrevious_close());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_previous_close(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getAdjusted_previous_close());
                }
                if (!Intrinsics.areEqual(value.getLast_trade_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getLast_trade_price());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(13, value.getLast_non_reg_trade_price()) + protoAdapter.encodedSizeWithTag(14, value.getLast_extended_hours_trade_price());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TokenizedStockQuote value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsk_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsk_time());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getBid_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBid_time());
                }
                if (!Intrinsics.areEqual(value.getMark_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMark_price());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getUpdated_at());
                }
                if (value.getCurrency_code() != CurrencyCode.CURRENCY_CODE_UNSPECIFIED) {
                    CurrencyCode.ADAPTER.encodeWithTag(writer, 9, (int) value.getCurrency_code());
                }
                if (!Intrinsics.areEqual(value.getPrevious_close(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getPrevious_close());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_previous_close(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getAdjusted_previous_close());
                }
                if (!Intrinsics.areEqual(value.getLast_trade_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getLast_trade_price());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 13, (int) value.getLast_non_reg_trade_price());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getLast_extended_hours_trade_price());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TokenizedStockQuote value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 14, (int) value.getLast_extended_hours_trade_price());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getLast_non_reg_trade_price());
                if (!Intrinsics.areEqual(value.getLast_trade_price(), "")) {
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getLast_trade_price());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_previous_close(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getAdjusted_previous_close());
                }
                if (!Intrinsics.areEqual(value.getPrevious_close(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getPrevious_close());
                }
                if (value.getCurrency_code() != CurrencyCode.CURRENCY_CODE_UNSPECIFIED) {
                    CurrencyCode.ADAPTER.encodeWithTag(writer, 9, (int) value.getCurrency_code());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getMark_price(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getMark_price());
                }
                if (!Intrinsics.areEqual(value.getBid_time(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getBid_time());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_time(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getAsk_time());
                }
                if (Intrinsics.areEqual(value.getAsk_price(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAsk_price());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TokenizedStockQuote decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(reader, "reader");
                CurrencyCode currencyCode = CurrencyCode.CURRENCY_CODE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                CurrencyCode currencyCodeDecode = currencyCode;
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
                String strDecode11 = null;
                String strDecode12 = null;
                String strDecode13 = strDecode10;
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
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                try {
                                    currencyCodeDecode = CurrencyCode.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode13;
                                    str2 = strDecode;
                                    str3 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 10:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 12:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 14:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                continue;
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
                        return new TokenizedStockQuote(strDecode13, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, currencyCodeDecode, strDecode8, strDecode9, strDecode10, strDecode11, strDecode12, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TokenizedStockQuote redact(TokenizedStockQuote value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((16383 & 1) != 0 ? value.ask_price : null, (16383 & 2) != 0 ? value.ask_time : null, (16383 & 4) != 0 ? value.bid_price : null, (16383 & 8) != 0 ? value.bid_time : null, (16383 & 16) != 0 ? value.mark_price : null, (16383 & 32) != 0 ? value.symbol : null, (16383 & 64) != 0 ? value.id : null, (16383 & 128) != 0 ? value.updated_at : null, (16383 & 256) != 0 ? value.currency_code : null, (16383 & 512) != 0 ? value.previous_close : null, (16383 & 1024) != 0 ? value.adjusted_previous_close : null, (16383 & 2048) != 0 ? value.last_trade_price : null, (16383 & 4096) != 0 ? value.last_non_reg_trade_price : null, (16383 & 8192) != 0 ? value.last_extended_hours_trade_price : null, (16383 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}

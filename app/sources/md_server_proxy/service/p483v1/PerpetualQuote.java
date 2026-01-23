package md_server_proxy.service.p483v1;

import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
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

/* compiled from: PerpetualQuote.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016Jj\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m3636d2 = {"Lmd_server_proxy/service/v1/PerpetualQuote;", "Lcom/squareup/wire/Message;", "", BidAskDetails3.ASK_PRICE, "", BidAskDetails3.ASK_SIZE, BidAskDetails3.BID_PRICE, BidAskDetails3.BID_SIZE, "mid_price", "symbol", "id", "updated_at", "currency_code", "Lmd_server_proxy/service/v1/CurrencyCode;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/CurrencyCode;Lokio/ByteString;)V", "getAsk_price", "()Ljava/lang/String;", "getAsk_size", "getBid_price", "getBid_size", "getMid_price", "getSymbol", "getId", "getUpdated_at", "getCurrency_code", "()Lmd_server_proxy/service/v1/CurrencyCode;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class PerpetualQuote extends Message {

    @JvmField
    public static final ProtoAdapter<PerpetualQuote> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ask_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String ask_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String bid_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String bid_size;

    @WireField(adapter = "md_server_proxy.service.v1.CurrencyCode#ADAPTER", jsonName = "currencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final CurrencyCode currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "midPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String mid_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String updated_at;

    public PerpetualQuote() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ PerpetualQuote(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CurrencyCode currencyCode, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? CurrencyCode.CURRENCY_CODE_UNSPECIFIED : currencyCode, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28922newBuilder();
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

    public final String getMid_price() {
        return this.mid_price;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualQuote(String ask_price, String ask_size, String bid_price, String bid_size, String mid_price, String symbol, String id, String updated_at, CurrencyCode currency_code, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_size, "ask_size");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_size, "bid_size");
        Intrinsics.checkNotNullParameter(mid_price, "mid_price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ask_price = ask_price;
        this.ask_size = ask_size;
        this.bid_price = bid_price;
        this.bid_size = bid_size;
        this.mid_price = mid_price;
        this.symbol = symbol;
        this.id = id;
        this.updated_at = updated_at;
        this.currency_code = currency_code;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28922newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PerpetualQuote)) {
            return false;
        }
        PerpetualQuote perpetualQuote = (PerpetualQuote) other;
        return Intrinsics.areEqual(unknownFields(), perpetualQuote.unknownFields()) && Intrinsics.areEqual(this.ask_price, perpetualQuote.ask_price) && Intrinsics.areEqual(this.ask_size, perpetualQuote.ask_size) && Intrinsics.areEqual(this.bid_price, perpetualQuote.bid_price) && Intrinsics.areEqual(this.bid_size, perpetualQuote.bid_size) && Intrinsics.areEqual(this.mid_price, perpetualQuote.mid_price) && Intrinsics.areEqual(this.symbol, perpetualQuote.symbol) && Intrinsics.areEqual(this.id, perpetualQuote.id) && Intrinsics.areEqual(this.updated_at, perpetualQuote.updated_at) && this.currency_code == perpetualQuote.currency_code;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((unknownFields().hashCode() * 37) + this.ask_price.hashCode()) * 37) + this.ask_size.hashCode()) * 37) + this.bid_price.hashCode()) * 37) + this.bid_size.hashCode()) * 37) + this.mid_price.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.id.hashCode()) * 37) + this.updated_at.hashCode()) * 37) + this.currency_code.hashCode();
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
        arrayList.add("mid_price=" + Internal.sanitize(this.mid_price));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        arrayList.add("currency_code=" + this.currency_code);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerpetualQuote{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PerpetualQuote copy$default(PerpetualQuote perpetualQuote, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CurrencyCode currencyCode, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = perpetualQuote.ask_price;
        }
        if ((i & 2) != 0) {
            str2 = perpetualQuote.ask_size;
        }
        if ((i & 4) != 0) {
            str3 = perpetualQuote.bid_price;
        }
        if ((i & 8) != 0) {
            str4 = perpetualQuote.bid_size;
        }
        if ((i & 16) != 0) {
            str5 = perpetualQuote.mid_price;
        }
        if ((i & 32) != 0) {
            str6 = perpetualQuote.symbol;
        }
        if ((i & 64) != 0) {
            str7 = perpetualQuote.id;
        }
        if ((i & 128) != 0) {
            str8 = perpetualQuote.updated_at;
        }
        if ((i & 256) != 0) {
            currencyCode = perpetualQuote.currency_code;
        }
        if ((i & 512) != 0) {
            byteString = perpetualQuote.unknownFields();
        }
        CurrencyCode currencyCode2 = currencyCode;
        ByteString byteString2 = byteString;
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return perpetualQuote.copy(str, str2, str3, str4, str11, str12, str9, str10, currencyCode2, byteString2);
    }

    public final PerpetualQuote copy(String ask_price, String ask_size, String bid_price, String bid_size, String mid_price, String symbol, String id, String updated_at, CurrencyCode currency_code, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_size, "ask_size");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_size, "bid_size");
        Intrinsics.checkNotNullParameter(mid_price, "mid_price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PerpetualQuote(ask_price, ask_size, bid_price, bid_size, mid_price, symbol, id, updated_at, currency_code, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerpetualQuote.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PerpetualQuote>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: md_server_proxy.service.v1.PerpetualQuote$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PerpetualQuote value) {
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
                if (!Intrinsics.areEqual(value.getMid_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getMid_price());
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
                return value.getCurrency_code() != CurrencyCode.CURRENCY_CODE_UNSPECIFIED ? size + CurrencyCode.ADAPTER.encodedSizeWithTag(9, value.getCurrency_code()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PerpetualQuote value) throws IOException {
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
                if (!Intrinsics.areEqual(value.getMid_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMid_price());
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
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PerpetualQuote value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCurrency_code() != CurrencyCode.CURRENCY_CODE_UNSPECIFIED) {
                    CurrencyCode.ADAPTER.encodeWithTag(writer, 9, (int) value.getCurrency_code());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getMid_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMid_price());
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

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                */
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001f. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public md_server_proxy.service.p483v1.PerpetualQuote decode(com.squareup.wire.ProtoReader r25) {
                /*
                    Method dump skipped, instructions count: 226
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: md_server_proxy.service.p483v1.PerpetualQuote2.decode(com.squareup.wire.ProtoReader):md_server_proxy.service.v1.PerpetualQuote");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PerpetualQuote redact(PerpetualQuote value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PerpetualQuote.copy$default(value, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 511, null);
            }
        };
    }
}

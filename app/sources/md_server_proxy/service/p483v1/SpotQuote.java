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

/* compiled from: SpotQuote.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016Jt\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006)"}, m3636d2 = {"Lmd_server_proxy/service/v1/SpotQuote;", "Lcom/squareup/wire/Message;", "", BidAskDetails3.ASK_PRICE, "", "ask_time", BidAskDetails3.BID_PRICE, "bid_time", "mark_price", "symbol", "id", "updated_at", "currency_code", "Lmd_server_proxy/service/v1/CurrencyCode;", "routing_group", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/CurrencyCode;Ljava/lang/String;Lokio/ByteString;)V", "getAsk_price", "()Ljava/lang/String;", "getAsk_time", "getBid_price", "getBid_time", "getMark_price", "getSymbol", "getId", "getUpdated_at", "getCurrency_code", "()Lmd_server_proxy/service/v1/CurrencyCode;", "getRouting_group", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class SpotQuote extends Message {

    @JvmField
    public static final ProtoAdapter<SpotQuote> ADAPTER;

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

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "markPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String mark_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "routingGroup", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String routing_group;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String updated_at;

    public SpotQuote() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ SpotQuote(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CurrencyCode currencyCode, String str9, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? CurrencyCode.CURRENCY_CODE_UNSPECIFIED : currencyCode, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28925newBuilder();
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

    public final String getRouting_group() {
        return this.routing_group;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotQuote(String ask_price, String ask_time, String bid_price, String bid_time, String mark_price, String symbol, String id, String updated_at, CurrencyCode currency_code, String routing_group, ByteString unknownFields) {
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
        Intrinsics.checkNotNullParameter(routing_group, "routing_group");
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
        this.routing_group = routing_group;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28925newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SpotQuote)) {
            return false;
        }
        SpotQuote spotQuote = (SpotQuote) other;
        return Intrinsics.areEqual(unknownFields(), spotQuote.unknownFields()) && Intrinsics.areEqual(this.ask_price, spotQuote.ask_price) && Intrinsics.areEqual(this.ask_time, spotQuote.ask_time) && Intrinsics.areEqual(this.bid_price, spotQuote.bid_price) && Intrinsics.areEqual(this.bid_time, spotQuote.bid_time) && Intrinsics.areEqual(this.mark_price, spotQuote.mark_price) && Intrinsics.areEqual(this.symbol, spotQuote.symbol) && Intrinsics.areEqual(this.id, spotQuote.id) && Intrinsics.areEqual(this.updated_at, spotQuote.updated_at) && this.currency_code == spotQuote.currency_code && Intrinsics.areEqual(this.routing_group, spotQuote.routing_group);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((unknownFields().hashCode() * 37) + this.ask_price.hashCode()) * 37) + this.ask_time.hashCode()) * 37) + this.bid_price.hashCode()) * 37) + this.bid_time.hashCode()) * 37) + this.mark_price.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.id.hashCode()) * 37) + this.updated_at.hashCode()) * 37) + this.currency_code.hashCode()) * 37) + this.routing_group.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
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
        arrayList.add("routing_group=" + Internal.sanitize(this.routing_group));
        return CollectionsKt.joinToString$default(arrayList, ", ", "SpotQuote{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SpotQuote copy$default(SpotQuote spotQuote, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CurrencyCode currencyCode, String str9, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotQuote.ask_price;
        }
        if ((i & 2) != 0) {
            str2 = spotQuote.ask_time;
        }
        if ((i & 4) != 0) {
            str3 = spotQuote.bid_price;
        }
        if ((i & 8) != 0) {
            str4 = spotQuote.bid_time;
        }
        if ((i & 16) != 0) {
            str5 = spotQuote.mark_price;
        }
        if ((i & 32) != 0) {
            str6 = spotQuote.symbol;
        }
        if ((i & 64) != 0) {
            str7 = spotQuote.id;
        }
        if ((i & 128) != 0) {
            str8 = spotQuote.updated_at;
        }
        if ((i & 256) != 0) {
            currencyCode = spotQuote.currency_code;
        }
        if ((i & 512) != 0) {
            str9 = spotQuote.routing_group;
        }
        if ((i & 1024) != 0) {
            byteString = spotQuote.unknownFields();
        }
        String str10 = str9;
        ByteString byteString2 = byteString;
        String str11 = str8;
        CurrencyCode currencyCode2 = currencyCode;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return spotQuote.copy(str, str2, str15, str4, str14, str12, str13, str11, currencyCode2, str10, byteString2);
    }

    public final SpotQuote copy(String ask_price, String ask_time, String bid_price, String bid_time, String mark_price, String symbol, String id, String updated_at, CurrencyCode currency_code, String routing_group, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_time, "ask_time");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_time, "bid_time");
        Intrinsics.checkNotNullParameter(mark_price, "mark_price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(routing_group, "routing_group");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SpotQuote(ask_price, ask_time, bid_price, bid_time, mark_price, symbol, id, updated_at, currency_code, routing_group, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SpotQuote.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SpotQuote>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: md_server_proxy.service.v1.SpotQuote$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SpotQuote value) {
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
                return !Intrinsics.areEqual(value.getRouting_group(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(10, value.getRouting_group()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SpotQuote value) throws IOException {
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
                if (!Intrinsics.areEqual(value.getRouting_group(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getRouting_group());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SpotQuote value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRouting_group(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getRouting_group());
                }
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
                if (!Intrinsics.areEqual(value.getMark_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMark_price());
                }
                if (!Intrinsics.areEqual(value.getBid_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBid_time());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsk_time());
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
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0020. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public md_server_proxy.service.p483v1.SpotQuote decode(com.squareup.wire.ProtoReader r27) {
                /*
                    Method dump skipped, instructions count: 254
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: md_server_proxy.service.p483v1.SpotQuote2.decode(com.squareup.wire.ProtoReader):md_server_proxy.service.v1.SpotQuote");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SpotQuote redact(SpotQuote value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SpotQuote.copy$default(value, null, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 1023, null);
            }
        };
    }
}

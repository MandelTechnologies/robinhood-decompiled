package microgram.contracts.margin.margin_call.proto.p496v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: Trade.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JN\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/Trade;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", "ref_id", "symbol", "num_shares", "last_quote_price", "Lcom/robinhood/rosetta/common/Money;", "order_side", "Lmicrogram/contracts/margin/margin_call/proto/v1/OrderSide;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lmicrogram/contracts/margin/margin_call/proto/v1/OrderSide;Lokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "getRef_id", "getSymbol", "getNum_shares", "getLast_quote_price", "()Lcom/robinhood/rosetta/common/Money;", "getOrder_side", "()Lmicrogram/contracts/margin/margin_call/proto/v1/OrderSide;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class Trade extends Message {

    @JvmField
    public static final ProtoAdapter<Trade> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "lastQuotePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money last_quote_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "numShares", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String num_shares;

    @WireField(adapter = "microgram.contracts.margin.margin_call.proto.v1.OrderSide#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final OrderSide order_side;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String ref_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String symbol;

    public Trade() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ Trade(String str, String str2, String str3, String str4, Money money, OrderSide orderSide, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : money, (i & 32) != 0 ? OrderSide.ORDER_SIDE_UNSPECIFIED : orderSide, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29150newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getNum_shares() {
        return this.num_shares;
    }

    public final Money getLast_quote_price() {
        return this.last_quote_price;
    }

    public final OrderSide getOrder_side() {
        return this.order_side;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trade(String instrument_id, String ref_id, String symbol, String num_shares, Money money, OrderSide order_side, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(num_shares, "num_shares");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.ref_id = ref_id;
        this.symbol = symbol;
        this.num_shares = num_shares;
        this.last_quote_price = money;
        this.order_side = order_side;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29150newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Trade)) {
            return false;
        }
        Trade trade = (Trade) other;
        return Intrinsics.areEqual(unknownFields(), trade.unknownFields()) && Intrinsics.areEqual(this.instrument_id, trade.instrument_id) && Intrinsics.areEqual(this.ref_id, trade.ref_id) && Intrinsics.areEqual(this.symbol, trade.symbol) && Intrinsics.areEqual(this.num_shares, trade.num_shares) && Intrinsics.areEqual(this.last_quote_price, trade.last_quote_price) && this.order_side == trade.order_side;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + this.ref_id.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.num_shares.hashCode()) * 37;
        Money money = this.last_quote_price;
        int iHashCode2 = ((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.order_side.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("num_shares=" + Internal.sanitize(this.num_shares));
        Money money = this.last_quote_price;
        if (money != null) {
            arrayList.add("last_quote_price=" + money);
        }
        arrayList.add("order_side=" + this.order_side);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Trade{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Trade copy$default(Trade trade, String str, String str2, String str3, String str4, Money money, OrderSide orderSide, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trade.instrument_id;
        }
        if ((i & 2) != 0) {
            str2 = trade.ref_id;
        }
        if ((i & 4) != 0) {
            str3 = trade.symbol;
        }
        if ((i & 8) != 0) {
            str4 = trade.num_shares;
        }
        if ((i & 16) != 0) {
            money = trade.last_quote_price;
        }
        if ((i & 32) != 0) {
            orderSide = trade.order_side;
        }
        if ((i & 64) != 0) {
            byteString = trade.unknownFields();
        }
        OrderSide orderSide2 = orderSide;
        ByteString byteString2 = byteString;
        Money money2 = money;
        String str5 = str3;
        return trade.copy(str, str2, str5, str4, money2, orderSide2, byteString2);
    }

    public final Trade copy(String instrument_id, String ref_id, String symbol, String num_shares, Money last_quote_price, OrderSide order_side, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(num_shares, "num_shares");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Trade(instrument_id, ref_id, symbol, num_shares, last_quote_price, order_side, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Trade.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Trade>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.margin.margin_call.proto.v1.Trade$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Trade value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getNum_shares(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getNum_shares());
                }
                if (value.getLast_quote_price() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(5, value.getLast_quote_price());
                }
                return value.getOrder_side() != OrderSide.ORDER_SIDE_UNSPECIFIED ? size + OrderSide.ADAPTER.encodedSizeWithTag(6, value.getOrder_side()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Trade value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getNum_shares(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getNum_shares());
                }
                if (value.getLast_quote_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getLast_quote_price());
                }
                if (value.getOrder_side() != OrderSide.ORDER_SIDE_UNSPECIFIED) {
                    OrderSide.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrder_side());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Trade value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOrder_side() != OrderSide.ORDER_SIDE_UNSPECIFIED) {
                    OrderSide.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrder_side());
                }
                if (value.getLast_quote_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getLast_quote_price());
                }
                if (!Intrinsics.areEqual(value.getNum_shares(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getNum_shares());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRef_id());
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Trade decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                OrderSide orderSide = OrderSide.ORDER_SIDE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                Money moneyDecode = null;
                OrderSide orderSideDecode = orderSide;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 6:
                                try {
                                    orderSideDecode = OrderSide.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new Trade(strDecode4, strDecode, strDecode2, strDecode3, moneyDecode, orderSideDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Trade redact(Trade value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money last_quote_price = value.getLast_quote_price();
                return Trade.copy$default(value, null, null, null, null, last_quote_price != null ? Money.ADAPTER.redact(last_quote_price) : null, null, ByteString.EMPTY, 47, null);
            }
        };
    }
}

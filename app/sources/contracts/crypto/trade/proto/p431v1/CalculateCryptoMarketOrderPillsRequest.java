package contracts.crypto.trade.proto.p431v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import contracts.crypto.trade.proto.p431v1.CalculateCryptoMarketOrderPillsRequest;
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

/* compiled from: CalculateCryptoMarketOrderPillsRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J&\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest;", "Lcom/squareup/wire/Message;", "", "order_side", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide;", "currency_pair_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide;Ljava/lang/String;Lokio/ByteString;)V", "getOrder_side", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide;", "getCurrency_pair_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "OrderSide", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CalculateCryptoMarketOrderPillsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CalculateCryptoMarketOrderPillsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String currency_pair_id;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest$OrderSide#ADAPTER", jsonName = "orderSide", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final OrderSide order_side;

    public CalculateCryptoMarketOrderPillsRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27649newBuilder();
    }

    public final OrderSide getOrder_side() {
        return this.order_side;
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    public /* synthetic */ CalculateCryptoMarketOrderPillsRequest(OrderSide orderSide, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderSide, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculateCryptoMarketOrderPillsRequest(OrderSide orderSide, String currency_pair_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_side = orderSide;
        this.currency_pair_id = currency_pair_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27649newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CalculateCryptoMarketOrderPillsRequest)) {
            return false;
        }
        CalculateCryptoMarketOrderPillsRequest calculateCryptoMarketOrderPillsRequest = (CalculateCryptoMarketOrderPillsRequest) other;
        return Intrinsics.areEqual(unknownFields(), calculateCryptoMarketOrderPillsRequest.unknownFields()) && Intrinsics.areEqual(this.order_side, calculateCryptoMarketOrderPillsRequest.order_side) && Intrinsics.areEqual(this.currency_pair_id, calculateCryptoMarketOrderPillsRequest.currency_pair_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        OrderSide orderSide = this.order_side;
        int iHashCode2 = ((iHashCode + (orderSide != null ? orderSide.hashCode() : 0)) * 37) + this.currency_pair_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        OrderSide orderSide = this.order_side;
        if (orderSide != null) {
            arrayList.add("order_side=" + orderSide);
        }
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CalculateCryptoMarketOrderPillsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CalculateCryptoMarketOrderPillsRequest copy$default(CalculateCryptoMarketOrderPillsRequest calculateCryptoMarketOrderPillsRequest, OrderSide orderSide, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            orderSide = calculateCryptoMarketOrderPillsRequest.order_side;
        }
        if ((i & 2) != 0) {
            str = calculateCryptoMarketOrderPillsRequest.currency_pair_id;
        }
        if ((i & 4) != 0) {
            byteString = calculateCryptoMarketOrderPillsRequest.unknownFields();
        }
        return calculateCryptoMarketOrderPillsRequest.copy(orderSide, str, byteString);
    }

    public final CalculateCryptoMarketOrderPillsRequest copy(OrderSide order_side, String currency_pair_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CalculateCryptoMarketOrderPillsRequest(order_side, currency_pair_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CalculateCryptoMarketOrderPillsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CalculateCryptoMarketOrderPillsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CalculateCryptoMarketOrderPillsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOrder_side() != null) {
                    size += CalculateCryptoMarketOrderPillsRequest.OrderSide.ADAPTER.encodedSizeWithTag(1, value.getOrder_side());
                }
                return !Intrinsics.areEqual(value.getCurrency_pair_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCurrency_pair_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CalculateCryptoMarketOrderPillsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOrder_side() != null) {
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_side());
                }
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCurrency_pair_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CalculateCryptoMarketOrderPillsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCurrency_pair_id());
                }
                if (value.getOrder_side() != null) {
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_side());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CalculateCryptoMarketOrderPillsRequest redact(CalculateCryptoMarketOrderPillsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CalculateCryptoMarketOrderPillsRequest.OrderSide order_side = value.getOrder_side();
                return CalculateCryptoMarketOrderPillsRequest.copy$default(value, order_side != null ? CalculateCryptoMarketOrderPillsRequest.OrderSide.ADAPTER.redact(order_side) : null, null, ByteString.EMPTY, 2, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CalculateCryptoMarketOrderPillsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                CalculateCryptoMarketOrderPillsRequest.OrderSide orderSideDecode = null;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CalculateCryptoMarketOrderPillsRequest(orderSideDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        orderSideDecode = CalculateCryptoMarketOrderPillsRequest.OrderSide.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: CalculateCryptoMarketOrderPillsRequest.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005!\"#$%BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J@\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide;", "Lcom/squareup/wire/Message;", "", "buy", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$Buy;", "sell", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$Sell;", "tokenized_stock_buy", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockBuy;", "tokenized_stock_sell", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockSell;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$Buy;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$Sell;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockBuy;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockSell;Lokio/ByteString;)V", "getBuy", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$Buy;", "getSell", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$Sell;", "getTokenized_stock_buy", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockBuy;", "getTokenized_stock_sell", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockSell;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Buy", "Sell", "TokenizedStockBuy", "TokenizedStockSell", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderSide extends Message {

        @JvmField
        public static final ProtoAdapter<OrderSide> ADAPTER;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest$OrderSide$Buy#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
        private final Buy buy;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest$OrderSide$Sell#ADAPTER", oneofName = "type", schemaIndex = 1, tag = 2)
        private final Sell sell;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockBuy#ADAPTER", jsonName = "tokenizedStockBuy", oneofName = "type", schemaIndex = 2, tag = 3)
        private final TokenizedStockBuy tokenized_stock_buy;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockSell#ADAPTER", jsonName = "tokenizedStockSell", oneofName = "type", schemaIndex = 3, tag = 4)
        private final TokenizedStockSell tokenized_stock_sell;

        public OrderSide() {
            this(null, null, null, null, null, 31, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27650newBuilder();
        }

        public final Buy getBuy() {
            return this.buy;
        }

        public final Sell getSell() {
            return this.sell;
        }

        public final TokenizedStockBuy getTokenized_stock_buy() {
            return this.tokenized_stock_buy;
        }

        public final TokenizedStockSell getTokenized_stock_sell() {
            return this.tokenized_stock_sell;
        }

        public /* synthetic */ OrderSide(Buy buy, Sell sell, TokenizedStockBuy tokenizedStockBuy, TokenizedStockSell tokenizedStockSell, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : buy, (i & 2) != 0 ? null : sell, (i & 4) != 0 ? null : tokenizedStockBuy, (i & 8) != 0 ? null : tokenizedStockSell, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderSide(Buy buy, Sell sell, TokenizedStockBuy tokenizedStockBuy, TokenizedStockSell tokenizedStockSell, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.buy = buy;
            this.sell = sell;
            this.tokenized_stock_buy = tokenizedStockBuy;
            this.tokenized_stock_sell = tokenizedStockSell;
            if (Internal.countNonNull(buy, sell, tokenizedStockBuy, tokenizedStockSell, new Object[0]) > 1) {
                throw new IllegalArgumentException("At most one of buy, sell, tokenized_stock_buy, tokenized_stock_sell may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27650newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OrderSide)) {
                return false;
            }
            OrderSide orderSide = (OrderSide) other;
            return Intrinsics.areEqual(unknownFields(), orderSide.unknownFields()) && Intrinsics.areEqual(this.buy, orderSide.buy) && Intrinsics.areEqual(this.sell, orderSide.sell) && Intrinsics.areEqual(this.tokenized_stock_buy, orderSide.tokenized_stock_buy) && Intrinsics.areEqual(this.tokenized_stock_sell, orderSide.tokenized_stock_sell);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Buy buy = this.buy;
            int iHashCode2 = (iHashCode + (buy != null ? buy.hashCode() : 0)) * 37;
            Sell sell = this.sell;
            int iHashCode3 = (iHashCode2 + (sell != null ? sell.hashCode() : 0)) * 37;
            TokenizedStockBuy tokenizedStockBuy = this.tokenized_stock_buy;
            int iHashCode4 = (iHashCode3 + (tokenizedStockBuy != null ? tokenizedStockBuy.hashCode() : 0)) * 37;
            TokenizedStockSell tokenizedStockSell = this.tokenized_stock_sell;
            int iHashCode5 = iHashCode4 + (tokenizedStockSell != null ? tokenizedStockSell.hashCode() : 0);
            this.hashCode = iHashCode5;
            return iHashCode5;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Buy buy = this.buy;
            if (buy != null) {
                arrayList.add("buy=" + buy);
            }
            Sell sell = this.sell;
            if (sell != null) {
                arrayList.add("sell=" + sell);
            }
            TokenizedStockBuy tokenizedStockBuy = this.tokenized_stock_buy;
            if (tokenizedStockBuy != null) {
                arrayList.add("tokenized_stock_buy=" + tokenizedStockBuy);
            }
            TokenizedStockSell tokenizedStockSell = this.tokenized_stock_sell;
            if (tokenizedStockSell != null) {
                arrayList.add("tokenized_stock_sell=" + tokenizedStockSell);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderSide{", "}", 0, null, null, 56, null);
        }

        public final OrderSide copy(Buy buy, Sell sell, TokenizedStockBuy tokenized_stock_buy, TokenizedStockSell tokenized_stock_sell, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new OrderSide(buy, sell, tokenized_stock_buy, tokenized_stock_sell, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderSide.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<OrderSide>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest$OrderSide$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CalculateCryptoMarketOrderPillsRequest.OrderSide value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy.ADAPTER.encodedSizeWithTag(1, value.getBuy()) + CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell.ADAPTER.encodedSizeWithTag(2, value.getSell()) + CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy.ADAPTER.encodedSizeWithTag(3, value.getTokenized_stock_buy()) + CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell.ADAPTER.encodedSizeWithTag(4, value.getTokenized_stock_sell());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CalculateCryptoMarketOrderPillsRequest.OrderSide value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy.ADAPTER.encodeWithTag(writer, 1, (int) value.getBuy());
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell.ADAPTER.encodeWithTag(writer, 2, (int) value.getSell());
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy.ADAPTER.encodeWithTag(writer, 3, (int) value.getTokenized_stock_buy());
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell.ADAPTER.encodeWithTag(writer, 4, (int) value.getTokenized_stock_sell());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CalculateCryptoMarketOrderPillsRequest.OrderSide value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell.ADAPTER.encodeWithTag(writer, 4, (int) value.getTokenized_stock_sell());
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy.ADAPTER.encodeWithTag(writer, 3, (int) value.getTokenized_stock_buy());
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell.ADAPTER.encodeWithTag(writer, 2, (int) value.getSell());
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy.ADAPTER.encodeWithTag(writer, 1, (int) value.getBuy());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CalculateCryptoMarketOrderPillsRequest.OrderSide redact(CalculateCryptoMarketOrderPillsRequest.OrderSide value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy buy = value.getBuy();
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy buyRedact = buy != null ? CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy.ADAPTER.redact(buy) : null;
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell sell = value.getSell();
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell sellRedact = sell != null ? CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell.ADAPTER.redact(sell) : null;
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy tokenized_stock_buy = value.getTokenized_stock_buy();
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy tokenizedStockBuyRedact = tokenized_stock_buy != null ? CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy.ADAPTER.redact(tokenized_stock_buy) : null;
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell tokenized_stock_sell = value.getTokenized_stock_sell();
                    return value.copy(buyRedact, sellRedact, tokenizedStockBuyRedact, tokenized_stock_sell != null ? CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell.ADAPTER.redact(tokenized_stock_sell) : null, ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public CalculateCryptoMarketOrderPillsRequest.OrderSide decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy buyDecode = null;
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell sellDecode = null;
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy tokenizedStockBuyDecode = null;
                    CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell tokenizedStockSellDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CalculateCryptoMarketOrderPillsRequest.OrderSide(buyDecode, sellDecode, tokenizedStockBuyDecode, tokenizedStockSellDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            buyDecode = CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            sellDecode = CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            tokenizedStockBuyDecode = CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            tokenizedStockSellDecode = CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }

        /* compiled from: CalculateCryptoMarketOrderPillsRequest.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$Buy;", "Lcom/squareup/wire/Message;", "", "buying_power", "", "max_order_size", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getBuying_power", "()Ljava/lang/String;", "getMax_order_size", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Buy extends Message {

            @JvmField
            public static final ProtoAdapter<Buy> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buyingPower", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String buying_power;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxOrderSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final String max_order_size;

            public Buy() {
                this(null, null, null, 7, null);
            }

            public /* synthetic */ Buy(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27651newBuilder();
            }

            public final String getBuying_power() {
                return this.buying_power;
            }

            public final String getMax_order_size() {
                return this.max_order_size;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Buy(String buying_power, String max_order_size, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(buying_power, "buying_power");
                Intrinsics.checkNotNullParameter(max_order_size, "max_order_size");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.buying_power = buying_power;
                this.max_order_size = max_order_size;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27651newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Buy)) {
                    return false;
                }
                Buy buy = (Buy) other;
                return Intrinsics.areEqual(unknownFields(), buy.unknownFields()) && Intrinsics.areEqual(this.buying_power, buy.buying_power) && Intrinsics.areEqual(this.max_order_size, buy.max_order_size);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((unknownFields().hashCode() * 37) + this.buying_power.hashCode()) * 37) + this.max_order_size.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("buying_power=" + Internal.sanitize(this.buying_power));
                arrayList.add("max_order_size=" + Internal.sanitize(this.max_order_size));
                return CollectionsKt.joinToString$default(arrayList, ", ", "Buy{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Buy copy$default(Buy buy, String str, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = buy.buying_power;
                }
                if ((i & 2) != 0) {
                    str2 = buy.max_order_size;
                }
                if ((i & 4) != 0) {
                    byteString = buy.unknownFields();
                }
                return buy.copy(str, str2, byteString);
            }

            public final Buy copy(String buying_power, String max_order_size, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(buying_power, "buying_power");
                Intrinsics.checkNotNullParameter(max_order_size, "max_order_size");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Buy(buying_power, max_order_size, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Buy.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Buy>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest$OrderSide$Buy$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getBuying_power(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBuying_power());
                        }
                        return !Intrinsics.areEqual(value.getMax_order_size(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMax_order_size()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getBuying_power(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBuying_power());
                        }
                        if (!Intrinsics.areEqual(value.getMax_order_size(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMax_order_size());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (!Intrinsics.areEqual(value.getMax_order_size(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMax_order_size());
                        }
                        if (Intrinsics.areEqual(value.getBuying_power(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBuying_power());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy redact(CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        String strDecode2 = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                };
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsRequest.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$Sell;", "Lcom/squareup/wire/Message;", "", "quantity_available", "", BidAskDetails3.ASK_PRICE, BidAskDetails3.BID_PRICE, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getQuantity_available", "()Ljava/lang/String;", "getAsk_price", "getBid_price", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Sell extends Message {

            @JvmField
            public static final ProtoAdapter<Sell> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final String ask_price;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final String bid_price;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quantityAvailable", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String quantity_available;

            public Sell() {
                this(null, null, null, null, 15, null);
            }

            public /* synthetic */ Sell(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27652newBuilder();
            }

            public final String getQuantity_available() {
                return this.quantity_available;
            }

            public final String getAsk_price() {
                return this.ask_price;
            }

            public final String getBid_price() {
                return this.bid_price;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Sell(String quantity_available, String ask_price, String bid_price, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(quantity_available, "quantity_available");
                Intrinsics.checkNotNullParameter(ask_price, "ask_price");
                Intrinsics.checkNotNullParameter(bid_price, "bid_price");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.quantity_available = quantity_available;
                this.ask_price = ask_price;
                this.bid_price = bid_price;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27652newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Sell)) {
                    return false;
                }
                Sell sell = (Sell) other;
                return Intrinsics.areEqual(unknownFields(), sell.unknownFields()) && Intrinsics.areEqual(this.quantity_available, sell.quantity_available) && Intrinsics.areEqual(this.ask_price, sell.ask_price) && Intrinsics.areEqual(this.bid_price, sell.bid_price);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((((unknownFields().hashCode() * 37) + this.quantity_available.hashCode()) * 37) + this.ask_price.hashCode()) * 37) + this.bid_price.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("quantity_available=" + Internal.sanitize(this.quantity_available));
                arrayList.add("ask_price=" + Internal.sanitize(this.ask_price));
                arrayList.add("bid_price=" + Internal.sanitize(this.bid_price));
                return CollectionsKt.joinToString$default(arrayList, ", ", "Sell{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Sell copy$default(Sell sell, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sell.quantity_available;
                }
                if ((i & 2) != 0) {
                    str2 = sell.ask_price;
                }
                if ((i & 4) != 0) {
                    str3 = sell.bid_price;
                }
                if ((i & 8) != 0) {
                    byteString = sell.unknownFields();
                }
                return sell.copy(str, str2, str3, byteString);
            }

            public final Sell copy(String quantity_available, String ask_price, String bid_price, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(quantity_available, "quantity_available");
                Intrinsics.checkNotNullParameter(ask_price, "ask_price");
                Intrinsics.checkNotNullParameter(bid_price, "bid_price");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Sell(quantity_available, ask_price, bid_price, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Sell.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Sell>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest$OrderSide$Sell$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        String strDecode2 = "";
                        String strDecode3 = strDecode2;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getQuantity_available(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getQuantity_available());
                        }
                        if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAsk_price());
                        }
                        return !Intrinsics.areEqual(value.getBid_price(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBid_price()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getQuantity_available(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getQuantity_available());
                        }
                        if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsk_price());
                        }
                        if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBid_price());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBid_price());
                        }
                        if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsk_price());
                        }
                        if (Intrinsics.areEqual(value.getQuantity_available(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getQuantity_available());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell redact(CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                    }
                };
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsRequest.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J4\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockBuy;", "Lcom/squareup/wire/Message;", "", "buying_power", "", "max_order_size", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getBuying_power", "()Ljava/lang/String;", "getMax_order_size", "getPrice", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class TokenizedStockBuy extends Message {

            @JvmField
            public static final ProtoAdapter<TokenizedStockBuy> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buyingPower", schemaIndex = 0, tag = 1)
            private final String buying_power;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxOrderSize", schemaIndex = 1, tag = 2)
            private final String max_order_size;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            private final String price;

            public TokenizedStockBuy() {
                this(null, null, null, null, 15, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27653newBuilder();
            }

            public final String getBuying_power() {
                return this.buying_power;
            }

            public final String getMax_order_size() {
                return this.max_order_size;
            }

            public final String getPrice() {
                return this.price;
            }

            public /* synthetic */ TokenizedStockBuy(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokenizedStockBuy(String str, String str2, String str3, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.buying_power = str;
                this.max_order_size = str2;
                this.price = str3;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27653newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TokenizedStockBuy)) {
                    return false;
                }
                TokenizedStockBuy tokenizedStockBuy = (TokenizedStockBuy) other;
                return Intrinsics.areEqual(unknownFields(), tokenizedStockBuy.unknownFields()) && Intrinsics.areEqual(this.buying_power, tokenizedStockBuy.buying_power) && Intrinsics.areEqual(this.max_order_size, tokenizedStockBuy.max_order_size) && Intrinsics.areEqual(this.price, tokenizedStockBuy.price);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                String str = this.buying_power;
                int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.max_order_size;
                int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.price;
                int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
                this.hashCode = iHashCode4;
                return iHashCode4;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.buying_power;
                if (str != null) {
                    arrayList.add("buying_power=" + Internal.sanitize(str));
                }
                String str2 = this.max_order_size;
                if (str2 != null) {
                    arrayList.add("max_order_size=" + Internal.sanitize(str2));
                }
                String str3 = this.price;
                if (str3 != null) {
                    arrayList.add("price=" + Internal.sanitize(str3));
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TokenizedStockBuy{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ TokenizedStockBuy copy$default(TokenizedStockBuy tokenizedStockBuy, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tokenizedStockBuy.buying_power;
                }
                if ((i & 2) != 0) {
                    str2 = tokenizedStockBuy.max_order_size;
                }
                if ((i & 4) != 0) {
                    str3 = tokenizedStockBuy.price;
                }
                if ((i & 8) != 0) {
                    byteString = tokenizedStockBuy.unknownFields();
                }
                return tokenizedStockBuy.copy(str, str2, str3, byteString);
            }

            public final TokenizedStockBuy copy(String buying_power, String max_order_size, String price, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new TokenizedStockBuy(buying_power, max_order_size, price, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TokenizedStockBuy.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TokenizedStockBuy>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockBuy$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = null;
                        String strDecode2 = null;
                        String strDecode3 = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        return size + protoAdapter.encodedSizeWithTag(1, value.getBuying_power()) + protoAdapter.encodedSizeWithTag(2, value.getMax_order_size()) + protoAdapter.encodedSizeWithTag(3, value.getPrice());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        protoAdapter.encodeWithTag(writer, 1, (int) value.getBuying_power());
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getMax_order_size());
                        protoAdapter.encodeWithTag(writer, 3, (int) value.getPrice());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        protoAdapter.encodeWithTag(writer, 3, (int) value.getPrice());
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getMax_order_size());
                        protoAdapter.encodeWithTag(writer, 1, (int) value.getBuying_power());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy redact(CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                    }
                };
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsRequest.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockSell;", "Lcom/squareup/wire/Message;", "", "selling_power", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getSelling_power", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class TokenizedStockSell extends Message {

            @JvmField
            public static final ProtoAdapter<TokenizedStockSell> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sellingPower", schemaIndex = 0, tag = 1)
            private final String selling_power;

            /* JADX WARN: Multi-variable type inference failed */
            public TokenizedStockSell() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27654newBuilder();
            }

            public final String getSelling_power() {
                return this.selling_power;
            }

            public /* synthetic */ TokenizedStockSell(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokenizedStockSell(String str, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.selling_power = str;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27654newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TokenizedStockSell)) {
                    return false;
                }
                TokenizedStockSell tokenizedStockSell = (TokenizedStockSell) other;
                return Intrinsics.areEqual(unknownFields(), tokenizedStockSell.unknownFields()) && Intrinsics.areEqual(this.selling_power, tokenizedStockSell.selling_power);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                String str = this.selling_power;
                int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.selling_power;
                if (str != null) {
                    arrayList.add("selling_power=" + Internal.sanitize(str));
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TokenizedStockSell{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ TokenizedStockSell copy$default(TokenizedStockSell tokenizedStockSell, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tokenizedStockSell.selling_power;
                }
                if ((i & 2) != 0) {
                    byteString = tokenizedStockSell.unknownFields();
                }
                return tokenizedStockSell.copy(str, byteString);
            }

            public final TokenizedStockSell copy(String selling_power, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new TokenizedStockSell(selling_power, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TokenizedStockSell.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TokenizedStockSell>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockSell$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSelling_power());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSelling_power());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSelling_power());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell redact(CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }
    }
}

package contracts.crypto.trade.proto.p431v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import contracts.crypto.trade.proto.p431v1.CalculateCryptoMarketOrderPillsResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: CalculateCryptoMarketOrderPillsResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse;", "Lcom/squareup/wire/Message;", "", "trade_buttons", "", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getTrade_buttons", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "TradeButton", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CalculateCryptoMarketOrderPillsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<CalculateCryptoMarketOrderPillsResponse> ADAPTER;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponse$TradeButton#ADAPTER", jsonName = "tradeButtons", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<TradeButton> trade_buttons;

    /* JADX WARN: Multi-variable type inference failed */
    public CalculateCryptoMarketOrderPillsResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27657newBuilder();
    }

    public /* synthetic */ CalculateCryptoMarketOrderPillsResponse(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculateCryptoMarketOrderPillsResponse(List<TradeButton> trade_buttons, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(trade_buttons, "trade_buttons");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.trade_buttons = Internal.immutableCopyOf("trade_buttons", trade_buttons);
    }

    public final List<TradeButton> getTrade_buttons() {
        return this.trade_buttons;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27657newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CalculateCryptoMarketOrderPillsResponse)) {
            return false;
        }
        CalculateCryptoMarketOrderPillsResponse calculateCryptoMarketOrderPillsResponse = (CalculateCryptoMarketOrderPillsResponse) other;
        return Intrinsics.areEqual(unknownFields(), calculateCryptoMarketOrderPillsResponse.unknownFields()) && Intrinsics.areEqual(this.trade_buttons, calculateCryptoMarketOrderPillsResponse.trade_buttons);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.trade_buttons.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.trade_buttons.isEmpty()) {
            arrayList.add("trade_buttons=" + this.trade_buttons);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CalculateCryptoMarketOrderPillsResponse{", "}", 0, null, null, 56, null);
    }

    public final CalculateCryptoMarketOrderPillsResponse copy(List<TradeButton> trade_buttons, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(trade_buttons, "trade_buttons");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CalculateCryptoMarketOrderPillsResponse(trade_buttons, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CalculateCryptoMarketOrderPillsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CalculateCryptoMarketOrderPillsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CalculateCryptoMarketOrderPillsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + CalculateCryptoMarketOrderPillsResponse.TradeButton.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getTrade_buttons());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CalculateCryptoMarketOrderPillsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                CalculateCryptoMarketOrderPillsResponse.TradeButton.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getTrade_buttons());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CalculateCryptoMarketOrderPillsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                CalculateCryptoMarketOrderPillsResponse.TradeButton.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getTrade_buttons());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CalculateCryptoMarketOrderPillsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CalculateCryptoMarketOrderPillsResponse(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(CalculateCryptoMarketOrderPillsResponse.TradeButton.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CalculateCryptoMarketOrderPillsResponse redact(CalculateCryptoMarketOrderPillsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy(Internal.m26823redactElements(value.getTrade_buttons(), CalculateCryptoMarketOrderPillsResponse.TradeButton.ADAPTER), ByteString.EMPTY);
            }
        };
    }

    /* compiled from: CalculateCryptoMarketOrderPillsResponse.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001d\u001e\u001f B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton;", "Lcom/squareup/wire/Message;", "", "quote_amount", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$QuoteAmount;", "sell_all", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$SellAll;", "buy_all", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$BuyAll;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$QuoteAmount;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$SellAll;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$BuyAll;Lokio/ByteString;)V", "getQuote_amount", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$QuoteAmount;", "getSell_all", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$SellAll;", "getBuy_all", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$BuyAll;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "QuoteAmount", "SellAll", "BuyAll", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TradeButton extends Message {

        @JvmField
        public static final ProtoAdapter<TradeButton> ADAPTER;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponse$TradeButton$BuyAll#ADAPTER", jsonName = "buyAll", oneofName = "type", schemaIndex = 2, tag = 3)
        private final BuyAll buy_all;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponse$TradeButton$QuoteAmount#ADAPTER", jsonName = "quoteAmount", oneofName = "type", schemaIndex = 0, tag = 1)
        private final QuoteAmount quote_amount;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponse$TradeButton$SellAll#ADAPTER", jsonName = "sellAll", oneofName = "type", schemaIndex = 1, tag = 2)
        private final SellAll sell_all;

        public TradeButton() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27658newBuilder();
        }

        public final QuoteAmount getQuote_amount() {
            return this.quote_amount;
        }

        public final SellAll getSell_all() {
            return this.sell_all;
        }

        public final BuyAll getBuy_all() {
            return this.buy_all;
        }

        public /* synthetic */ TradeButton(QuoteAmount quoteAmount, SellAll sellAll, BuyAll buyAll, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : quoteAmount, (i & 2) != 0 ? null : sellAll, (i & 4) != 0 ? null : buyAll, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TradeButton(QuoteAmount quoteAmount, SellAll sellAll, BuyAll buyAll, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.quote_amount = quoteAmount;
            this.sell_all = sellAll;
            this.buy_all = buyAll;
            if (Internal.countNonNull(quoteAmount, sellAll, buyAll) > 1) {
                throw new IllegalArgumentException("At most one of quote_amount, sell_all, buy_all may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27658newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TradeButton)) {
                return false;
            }
            TradeButton tradeButton = (TradeButton) other;
            return Intrinsics.areEqual(unknownFields(), tradeButton.unknownFields()) && Intrinsics.areEqual(this.quote_amount, tradeButton.quote_amount) && Intrinsics.areEqual(this.sell_all, tradeButton.sell_all) && Intrinsics.areEqual(this.buy_all, tradeButton.buy_all);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            QuoteAmount quoteAmount = this.quote_amount;
            int iHashCode2 = (iHashCode + (quoteAmount != null ? quoteAmount.hashCode() : 0)) * 37;
            SellAll sellAll = this.sell_all;
            int iHashCode3 = (iHashCode2 + (sellAll != null ? sellAll.hashCode() : 0)) * 37;
            BuyAll buyAll = this.buy_all;
            int iHashCode4 = iHashCode3 + (buyAll != null ? buyAll.hashCode() : 0);
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            QuoteAmount quoteAmount = this.quote_amount;
            if (quoteAmount != null) {
                arrayList.add("quote_amount=" + quoteAmount);
            }
            SellAll sellAll = this.sell_all;
            if (sellAll != null) {
                arrayList.add("sell_all=" + sellAll);
            }
            BuyAll buyAll = this.buy_all;
            if (buyAll != null) {
                arrayList.add("buy_all=" + buyAll);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TradeButton{", "}", 0, null, null, 56, null);
        }

        public final TradeButton copy(QuoteAmount quote_amount, SellAll sell_all, BuyAll buy_all, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TradeButton(quote_amount, sell_all, buy_all, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TradeButton.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TradeButton>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponse$TradeButton$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CalculateCryptoMarketOrderPillsResponse.TradeButton value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount.ADAPTER.encodedSizeWithTag(1, value.getQuote_amount()) + CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll.ADAPTER.encodedSizeWithTag(2, value.getSell_all()) + CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll.ADAPTER.encodedSizeWithTag(3, value.getBuy_all());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CalculateCryptoMarketOrderPillsResponse.TradeButton value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount.ADAPTER.encodeWithTag(writer, 1, (int) value.getQuote_amount());
                    CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll.ADAPTER.encodeWithTag(writer, 2, (int) value.getSell_all());
                    CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll.ADAPTER.encodeWithTag(writer, 3, (int) value.getBuy_all());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CalculateCryptoMarketOrderPillsResponse.TradeButton value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll.ADAPTER.encodeWithTag(writer, 3, (int) value.getBuy_all());
                    CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll.ADAPTER.encodeWithTag(writer, 2, (int) value.getSell_all());
                    CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount.ADAPTER.encodeWithTag(writer, 1, (int) value.getQuote_amount());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CalculateCryptoMarketOrderPillsResponse.TradeButton redact(CalculateCryptoMarketOrderPillsResponse.TradeButton value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount quote_amount = value.getQuote_amount();
                    CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount quoteAmountRedact = quote_amount != null ? CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount.ADAPTER.redact(quote_amount) : null;
                    CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll sell_all = value.getSell_all();
                    CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll sellAllRedact = sell_all != null ? CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll.ADAPTER.redact(sell_all) : null;
                    CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll buy_all = value.getBuy_all();
                    return value.copy(quoteAmountRedact, sellAllRedact, buy_all != null ? CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll.ADAPTER.redact(buy_all) : null, ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public CalculateCryptoMarketOrderPillsResponse.TradeButton decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount quoteAmountDecode = null;
                    CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll sellAllDecode = null;
                    CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll buyAllDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CalculateCryptoMarketOrderPillsResponse.TradeButton(quoteAmountDecode, sellAllDecode, buyAllDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            quoteAmountDecode = CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            sellAllDecode = CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            buyAllDecode = CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }

        /* compiled from: CalculateCryptoMarketOrderPillsResponse.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$QuoteAmount;", "Lcom/squareup/wire/Message;", "", "amount", "", "formatted_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAmount", "()Ljava/lang/String;", "getFormatted_amount", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class QuoteAmount extends Message {

            @JvmField
            public static final ProtoAdapter<QuoteAmount> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String amount;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "formattedAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final String formatted_amount;

            public QuoteAmount() {
                this(null, null, null, 7, null);
            }

            public /* synthetic */ QuoteAmount(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27660newBuilder();
            }

            public final String getAmount() {
                return this.amount;
            }

            public final String getFormatted_amount() {
                return this.formatted_amount;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QuoteAmount(String amount, String formatted_amount, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(formatted_amount, "formatted_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.amount = amount;
                this.formatted_amount = formatted_amount;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27660newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof QuoteAmount)) {
                    return false;
                }
                QuoteAmount quoteAmount = (QuoteAmount) other;
                return Intrinsics.areEqual(unknownFields(), quoteAmount.unknownFields()) && Intrinsics.areEqual(this.amount, quoteAmount.amount) && Intrinsics.areEqual(this.formatted_amount, quoteAmount.formatted_amount);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((unknownFields().hashCode() * 37) + this.amount.hashCode()) * 37) + this.formatted_amount.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("amount=" + Internal.sanitize(this.amount));
                arrayList.add("formatted_amount=" + Internal.sanitize(this.formatted_amount));
                return CollectionsKt.joinToString$default(arrayList, ", ", "QuoteAmount{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ QuoteAmount copy$default(QuoteAmount quoteAmount, String str, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = quoteAmount.amount;
                }
                if ((i & 2) != 0) {
                    str2 = quoteAmount.formatted_amount;
                }
                if ((i & 4) != 0) {
                    byteString = quoteAmount.unknownFields();
                }
                return quoteAmount.copy(str, str2, byteString);
            }

            public final QuoteAmount copy(String amount, String formatted_amount, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(formatted_amount, "formatted_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new QuoteAmount(amount, formatted_amount, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(QuoteAmount.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<QuoteAmount>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponse$TradeButton$QuoteAmount$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getAmount(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAmount());
                        }
                        return !Intrinsics.areEqual(value.getFormatted_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFormatted_amount()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getAmount(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAmount());
                        }
                        if (!Intrinsics.areEqual(value.getFormatted_amount(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFormatted_amount());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (!Intrinsics.areEqual(value.getFormatted_amount(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFormatted_amount());
                        }
                        if (Intrinsics.areEqual(value.getAmount(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAmount());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount redact(CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        String strDecode2 = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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

        /* compiled from: CalculateCryptoMarketOrderPillsResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$SellAll;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class SellAll extends Message {

            @JvmField
            public static final ProtoAdapter<SellAll> ADAPTER;

            /* JADX WARN: Multi-variable type inference failed */
            public SellAll() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27661newBuilder();
            }

            public /* synthetic */ SellAll(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SellAll(ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27661newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof SellAll) && Intrinsics.areEqual(unknownFields(), ((SellAll) other).unknownFields());
            }

            public int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                return "SellAll{}";
            }

            public final SellAll copy(ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new SellAll(unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SellAll.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<SellAll>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponse$TradeButton$SellAll$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll value) {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll redact(CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.copy(ByteString.EMPTY);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag != -1) {
                                reader.readUnknownField(iNextTag);
                            } else {
                                return new CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll(reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                        }
                    }
                };
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$BuyAll;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class BuyAll extends Message {

            @JvmField
            public static final ProtoAdapter<BuyAll> ADAPTER;

            /* JADX WARN: Multi-variable type inference failed */
            public BuyAll() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27659newBuilder();
            }

            public /* synthetic */ BuyAll(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BuyAll(ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27659newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof BuyAll) && Intrinsics.areEqual(unknownFields(), ((BuyAll) other).unknownFields());
            }

            public int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                return "BuyAll{}";
            }

            public final BuyAll copy(ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new BuyAll(unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BuyAll.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<BuyAll>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponse$TradeButton$BuyAll$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag != -1) {
                                reader.readUnknownField(iNextTag);
                            } else {
                                return new CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll(reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.unknownFields().size();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll value) {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll redact(CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return value.copy(ByteString.EMPTY);
                    }
                };
            }
        }
    }
}

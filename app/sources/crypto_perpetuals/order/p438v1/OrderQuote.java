package crypto_perpetuals.order.p438v1;

import com.plaid.internal.EnumC7081g;
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
import crypto_perpetuals.common.p435v1.MarginRequired;
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

/* compiled from: OrderQuote.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016Jp\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006+"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderQuote;", "Lcom/squareup/wire/Message;", "", "quote_currency_id", "", BidAskDetails3.ASK_PRICE, BidAskDetails3.BID_PRICE, "estimated_order_price", "Lcrypto_perpetuals/order/v1/OrderPrice;", "estimated_contract_quantity", "estimated_notional_amount", "estimated_margin_required", "Lcrypto_perpetuals/common/v1/MarginRequired;", "estimated_liquidation_price", "estimated_fees", "Lcrypto_perpetuals/order/v1/OrderFees;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/order/v1/OrderPrice;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MarginRequired;Ljava/lang/String;Lcrypto_perpetuals/order/v1/OrderFees;Lokio/ByteString;)V", "getQuote_currency_id", "()Ljava/lang/String;", "getAsk_price", "getBid_price", "getEstimated_order_price", "()Lcrypto_perpetuals/order/v1/OrderPrice;", "getEstimated_contract_quantity", "getEstimated_notional_amount", "getEstimated_margin_required", "()Lcrypto_perpetuals/common/v1/MarginRequired;", "getEstimated_liquidation_price", "getEstimated_fees", "()Lcrypto_perpetuals/order/v1/OrderFees;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderQuote extends Message {

    @JvmField
    public static final ProtoAdapter<OrderQuote> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "askPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String ask_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String bid_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedContractQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 6)
    private final String estimated_contract_quantity;

    @WireField(adapter = "crypto_perpetuals.order.v1.OrderFees#ADAPTER", jsonName = "estimatedFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 10)
    private final OrderFees estimated_fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedLiquidationPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 9)
    private final String estimated_liquidation_price;

    @WireField(adapter = "crypto_perpetuals.common.v1.MarginRequired#ADAPTER", jsonName = "estimatedMarginRequired", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 8)
    private final MarginRequired estimated_margin_required;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedNotionalAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 7)
    private final String estimated_notional_amount;

    @WireField(adapter = "crypto_perpetuals.order.v1.OrderPrice#ADAPTER", jsonName = "estimatedOrderPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final OrderPrice estimated_order_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteCurrencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String quote_currency_id;

    public OrderQuote() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ OrderQuote(String str, String str2, String str3, OrderPrice orderPrice, String str4, String str5, MarginRequired marginRequired, String str6, OrderFees orderFees, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : orderPrice, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : marginRequired, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? null : orderFees, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27846newBuilder();
    }

    public final String getQuote_currency_id() {
        return this.quote_currency_id;
    }

    public final String getAsk_price() {
        return this.ask_price;
    }

    public final String getBid_price() {
        return this.bid_price;
    }

    public final OrderPrice getEstimated_order_price() {
        return this.estimated_order_price;
    }

    public final String getEstimated_contract_quantity() {
        return this.estimated_contract_quantity;
    }

    public final String getEstimated_notional_amount() {
        return this.estimated_notional_amount;
    }

    public final MarginRequired getEstimated_margin_required() {
        return this.estimated_margin_required;
    }

    public final String getEstimated_liquidation_price() {
        return this.estimated_liquidation_price;
    }

    public final OrderFees getEstimated_fees() {
        return this.estimated_fees;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderQuote(String quote_currency_id, String ask_price, String bid_price, OrderPrice orderPrice, String estimated_contract_quantity, String estimated_notional_amount, MarginRequired marginRequired, String estimated_liquidation_price, OrderFees orderFees, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(quote_currency_id, "quote_currency_id");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(estimated_contract_quantity, "estimated_contract_quantity");
        Intrinsics.checkNotNullParameter(estimated_notional_amount, "estimated_notional_amount");
        Intrinsics.checkNotNullParameter(estimated_liquidation_price, "estimated_liquidation_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.quote_currency_id = quote_currency_id;
        this.ask_price = ask_price;
        this.bid_price = bid_price;
        this.estimated_order_price = orderPrice;
        this.estimated_contract_quantity = estimated_contract_quantity;
        this.estimated_notional_amount = estimated_notional_amount;
        this.estimated_margin_required = marginRequired;
        this.estimated_liquidation_price = estimated_liquidation_price;
        this.estimated_fees = orderFees;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27846newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderQuote)) {
            return false;
        }
        OrderQuote orderQuote = (OrderQuote) other;
        return Intrinsics.areEqual(unknownFields(), orderQuote.unknownFields()) && Intrinsics.areEqual(this.quote_currency_id, orderQuote.quote_currency_id) && Intrinsics.areEqual(this.ask_price, orderQuote.ask_price) && Intrinsics.areEqual(this.bid_price, orderQuote.bid_price) && Intrinsics.areEqual(this.estimated_order_price, orderQuote.estimated_order_price) && Intrinsics.areEqual(this.estimated_contract_quantity, orderQuote.estimated_contract_quantity) && Intrinsics.areEqual(this.estimated_notional_amount, orderQuote.estimated_notional_amount) && Intrinsics.areEqual(this.estimated_margin_required, orderQuote.estimated_margin_required) && Intrinsics.areEqual(this.estimated_liquidation_price, orderQuote.estimated_liquidation_price) && Intrinsics.areEqual(this.estimated_fees, orderQuote.estimated_fees);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.quote_currency_id.hashCode()) * 37) + this.ask_price.hashCode()) * 37) + this.bid_price.hashCode()) * 37;
        OrderPrice orderPrice = this.estimated_order_price;
        int iHashCode2 = (((((iHashCode + (orderPrice != null ? orderPrice.hashCode() : 0)) * 37) + this.estimated_contract_quantity.hashCode()) * 37) + this.estimated_notional_amount.hashCode()) * 37;
        MarginRequired marginRequired = this.estimated_margin_required;
        int iHashCode3 = (((iHashCode2 + (marginRequired != null ? marginRequired.hashCode() : 0)) * 37) + this.estimated_liquidation_price.hashCode()) * 37;
        OrderFees orderFees = this.estimated_fees;
        int iHashCode4 = iHashCode3 + (orderFees != null ? orderFees.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("quote_currency_id=" + Internal.sanitize(this.quote_currency_id));
        arrayList.add("ask_price=" + Internal.sanitize(this.ask_price));
        arrayList.add("bid_price=" + Internal.sanitize(this.bid_price));
        OrderPrice orderPrice = this.estimated_order_price;
        if (orderPrice != null) {
            arrayList.add("estimated_order_price=" + orderPrice);
        }
        arrayList.add("estimated_contract_quantity=" + Internal.sanitize(this.estimated_contract_quantity));
        arrayList.add("estimated_notional_amount=" + Internal.sanitize(this.estimated_notional_amount));
        MarginRequired marginRequired = this.estimated_margin_required;
        if (marginRequired != null) {
            arrayList.add("estimated_margin_required=" + marginRequired);
        }
        arrayList.add("estimated_liquidation_price=" + Internal.sanitize(this.estimated_liquidation_price));
        OrderFees orderFees = this.estimated_fees;
        if (orderFees != null) {
            arrayList.add("estimated_fees=" + orderFees);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderQuote{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderQuote copy$default(OrderQuote orderQuote, String str, String str2, String str3, OrderPrice orderPrice, String str4, String str5, MarginRequired marginRequired, String str6, OrderFees orderFees, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderQuote.quote_currency_id;
        }
        if ((i & 2) != 0) {
            str2 = orderQuote.ask_price;
        }
        if ((i & 4) != 0) {
            str3 = orderQuote.bid_price;
        }
        if ((i & 8) != 0) {
            orderPrice = orderQuote.estimated_order_price;
        }
        if ((i & 16) != 0) {
            str4 = orderQuote.estimated_contract_quantity;
        }
        if ((i & 32) != 0) {
            str5 = orderQuote.estimated_notional_amount;
        }
        if ((i & 64) != 0) {
            marginRequired = orderQuote.estimated_margin_required;
        }
        if ((i & 128) != 0) {
            str6 = orderQuote.estimated_liquidation_price;
        }
        if ((i & 256) != 0) {
            orderFees = orderQuote.estimated_fees;
        }
        if ((i & 512) != 0) {
            byteString = orderQuote.unknownFields();
        }
        OrderFees orderFees2 = orderFees;
        ByteString byteString2 = byteString;
        MarginRequired marginRequired2 = marginRequired;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        return orderQuote.copy(str, str2, str3, orderPrice, str8, str9, marginRequired2, str7, orderFees2, byteString2);
    }

    public final OrderQuote copy(String quote_currency_id, String ask_price, String bid_price, OrderPrice estimated_order_price, String estimated_contract_quantity, String estimated_notional_amount, MarginRequired estimated_margin_required, String estimated_liquidation_price, OrderFees estimated_fees, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(quote_currency_id, "quote_currency_id");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(estimated_contract_quantity, "estimated_contract_quantity");
        Intrinsics.checkNotNullParameter(estimated_notional_amount, "estimated_notional_amount");
        Intrinsics.checkNotNullParameter(estimated_liquidation_price, "estimated_liquidation_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderQuote(quote_currency_id, ask_price, bid_price, estimated_order_price, estimated_contract_quantity, estimated_notional_amount, estimated_margin_required, estimated_liquidation_price, estimated_fees, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderQuote.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderQuote>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.order.v1.OrderQuote$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderQuote value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getQuote_currency_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getQuote_currency_id());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAsk_price());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBid_price());
                }
                if (value.getEstimated_order_price() != null) {
                    size += OrderPrice.ADAPTER.encodedSizeWithTag(4, value.getEstimated_order_price());
                }
                if (!Intrinsics.areEqual(value.getEstimated_contract_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getEstimated_contract_quantity());
                }
                if (!Intrinsics.areEqual(value.getEstimated_notional_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getEstimated_notional_amount());
                }
                if (value.getEstimated_margin_required() != null) {
                    size += MarginRequired.ADAPTER.encodedSizeWithTag(8, value.getEstimated_margin_required());
                }
                if (!Intrinsics.areEqual(value.getEstimated_liquidation_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getEstimated_liquidation_price());
                }
                return value.getEstimated_fees() != null ? size + OrderFees.ADAPTER.encodedSizeWithTag(10, value.getEstimated_fees()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderQuote value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getQuote_currency_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getQuote_currency_id());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsk_price());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBid_price());
                }
                if (value.getEstimated_order_price() != null) {
                    OrderPrice.ADAPTER.encodeWithTag(writer, 4, (int) value.getEstimated_order_price());
                }
                if (!Intrinsics.areEqual(value.getEstimated_contract_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getEstimated_contract_quantity());
                }
                if (!Intrinsics.areEqual(value.getEstimated_notional_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getEstimated_notional_amount());
                }
                if (value.getEstimated_margin_required() != null) {
                    MarginRequired.ADAPTER.encodeWithTag(writer, 8, (int) value.getEstimated_margin_required());
                }
                if (!Intrinsics.areEqual(value.getEstimated_liquidation_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getEstimated_liquidation_price());
                }
                if (value.getEstimated_fees() != null) {
                    OrderFees.ADAPTER.encodeWithTag(writer, 10, (int) value.getEstimated_fees());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderQuote value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEstimated_fees() != null) {
                    OrderFees.ADAPTER.encodeWithTag(writer, 10, (int) value.getEstimated_fees());
                }
                if (!Intrinsics.areEqual(value.getEstimated_liquidation_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getEstimated_liquidation_price());
                }
                if (value.getEstimated_margin_required() != null) {
                    MarginRequired.ADAPTER.encodeWithTag(writer, 8, (int) value.getEstimated_margin_required());
                }
                if (!Intrinsics.areEqual(value.getEstimated_notional_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getEstimated_notional_amount());
                }
                if (!Intrinsics.areEqual(value.getEstimated_contract_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getEstimated_contract_quantity());
                }
                if (value.getEstimated_order_price() != null) {
                    OrderPrice.ADAPTER.encodeWithTag(writer, 4, (int) value.getEstimated_order_price());
                }
                if (!Intrinsics.areEqual(value.getBid_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBid_price());
                }
                if (!Intrinsics.areEqual(value.getAsk_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsk_price());
                }
                if (Intrinsics.areEqual(value.getQuote_currency_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getQuote_currency_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderQuote redact(OrderQuote value) {
                Intrinsics.checkNotNullParameter(value, "value");
                OrderPrice estimated_order_price = value.getEstimated_order_price();
                OrderPrice orderPriceRedact = estimated_order_price != null ? OrderPrice.ADAPTER.redact(estimated_order_price) : null;
                MarginRequired estimated_margin_required = value.getEstimated_margin_required();
                MarginRequired marginRequiredRedact = estimated_margin_required != null ? MarginRequired.ADAPTER.redact(estimated_margin_required) : null;
                OrderFees estimated_fees = value.getEstimated_fees();
                return OrderQuote.copy$default(value, null, null, null, orderPriceRedact, null, null, marginRequiredRedact, null, estimated_fees != null ? OrderFees.ADAPTER.redact(estimated_fees) : null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderQuote decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                OrderPrice orderPriceDecode = null;
                MarginRequired marginRequiredDecode = null;
                OrderFees orderFeesDecode = null;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                orderPriceDecode = OrderPrice.ADAPTER.decode(reader);
                                break;
                            case 5:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                marginRequiredDecode = MarginRequired.ADAPTER.decode(reader);
                                break;
                            case 9:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                orderFeesDecode = OrderFees.ADAPTER.decode(reader);
                                break;
                        }
                    } else {
                        return new OrderQuote(strDecode, strDecode6, strDecode2, orderPriceDecode, strDecode3, strDecode4, marginRequiredDecode, strDecode5, orderFeesDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}

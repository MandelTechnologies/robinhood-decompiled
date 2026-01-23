package crypto_perpetuals.order.p438v1;

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
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: OrderDetails.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J@\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderDetails;", "Lcom/squareup/wire/Message;", "", "market_order_details", "Lcrypto_perpetuals/order/v1/MarketOrderDetails;", "limit_order_details", "Lcrypto_perpetuals/order/v1/LimitOrderDetails;", "stop_loss_order_details", "Lcrypto_perpetuals/order/v1/StopLossOrderDetails;", "take_profit_order_details", "Lcrypto_perpetuals/order/v1/TakeProfitOrderDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/order/v1/MarketOrderDetails;Lcrypto_perpetuals/order/v1/LimitOrderDetails;Lcrypto_perpetuals/order/v1/StopLossOrderDetails;Lcrypto_perpetuals/order/v1/TakeProfitOrderDetails;Lokio/ByteString;)V", "getMarket_order_details", "()Lcrypto_perpetuals/order/v1/MarketOrderDetails;", "getLimit_order_details", "()Lcrypto_perpetuals/order/v1/LimitOrderDetails;", "getStop_loss_order_details", "()Lcrypto_perpetuals/order/v1/StopLossOrderDetails;", "getTake_profit_order_details", "()Lcrypto_perpetuals/order/v1/TakeProfitOrderDetails;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderDetails extends Message {

    @JvmField
    public static final ProtoAdapter<OrderDetails> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.order.v1.LimitOrderDetails#ADAPTER", jsonName = "limitOrderDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 1, tag = 2)
    private final LimitOrderDetails limit_order_details;

    @WireField(adapter = "crypto_perpetuals.order.v1.MarketOrderDetails#ADAPTER", jsonName = "marketOrderDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 0, tag = 1)
    private final MarketOrderDetails market_order_details;

    @WireField(adapter = "crypto_perpetuals.order.v1.StopLossOrderDetails#ADAPTER", jsonName = "stopLossOrderDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 2, tag = 3)
    private final StopLossOrderDetails stop_loss_order_details;

    @WireField(adapter = "crypto_perpetuals.order.v1.TakeProfitOrderDetails#ADAPTER", jsonName = "takeProfitOrderDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 3, tag = 4)
    private final TakeProfitOrderDetails take_profit_order_details;

    public OrderDetails() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27842newBuilder();
    }

    public final MarketOrderDetails getMarket_order_details() {
        return this.market_order_details;
    }

    public final LimitOrderDetails getLimit_order_details() {
        return this.limit_order_details;
    }

    public final StopLossOrderDetails getStop_loss_order_details() {
        return this.stop_loss_order_details;
    }

    public final TakeProfitOrderDetails getTake_profit_order_details() {
        return this.take_profit_order_details;
    }

    public /* synthetic */ OrderDetails(MarketOrderDetails marketOrderDetails, LimitOrderDetails limitOrderDetails, StopLossOrderDetails stopLossOrderDetails, TakeProfitOrderDetails takeProfitOrderDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : marketOrderDetails, (i & 2) != 0 ? null : limitOrderDetails, (i & 4) != 0 ? null : stopLossOrderDetails, (i & 8) != 0 ? null : takeProfitOrderDetails, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetails(MarketOrderDetails marketOrderDetails, LimitOrderDetails limitOrderDetails, StopLossOrderDetails stopLossOrderDetails, TakeProfitOrderDetails takeProfitOrderDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.market_order_details = marketOrderDetails;
        this.limit_order_details = limitOrderDetails;
        this.stop_loss_order_details = stopLossOrderDetails;
        this.take_profit_order_details = takeProfitOrderDetails;
        if (Internal.countNonNull(marketOrderDetails, limitOrderDetails, stopLossOrderDetails, takeProfitOrderDetails, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of market_order_details, limit_order_details, stop_loss_order_details, take_profit_order_details may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27842newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderDetails)) {
            return false;
        }
        OrderDetails orderDetails = (OrderDetails) other;
        return Intrinsics.areEqual(unknownFields(), orderDetails.unknownFields()) && Intrinsics.areEqual(this.market_order_details, orderDetails.market_order_details) && Intrinsics.areEqual(this.limit_order_details, orderDetails.limit_order_details) && Intrinsics.areEqual(this.stop_loss_order_details, orderDetails.stop_loss_order_details) && Intrinsics.areEqual(this.take_profit_order_details, orderDetails.take_profit_order_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        MarketOrderDetails marketOrderDetails = this.market_order_details;
        int iHashCode2 = (iHashCode + (marketOrderDetails != null ? marketOrderDetails.hashCode() : 0)) * 37;
        LimitOrderDetails limitOrderDetails = this.limit_order_details;
        int iHashCode3 = (iHashCode2 + (limitOrderDetails != null ? limitOrderDetails.hashCode() : 0)) * 37;
        StopLossOrderDetails stopLossOrderDetails = this.stop_loss_order_details;
        int iHashCode4 = (iHashCode3 + (stopLossOrderDetails != null ? stopLossOrderDetails.hashCode() : 0)) * 37;
        TakeProfitOrderDetails takeProfitOrderDetails = this.take_profit_order_details;
        int iHashCode5 = iHashCode4 + (takeProfitOrderDetails != null ? takeProfitOrderDetails.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        MarketOrderDetails marketOrderDetails = this.market_order_details;
        if (marketOrderDetails != null) {
            arrayList.add("market_order_details=" + marketOrderDetails);
        }
        LimitOrderDetails limitOrderDetails = this.limit_order_details;
        if (limitOrderDetails != null) {
            arrayList.add("limit_order_details=" + limitOrderDetails);
        }
        StopLossOrderDetails stopLossOrderDetails = this.stop_loss_order_details;
        if (stopLossOrderDetails != null) {
            arrayList.add("stop_loss_order_details=" + stopLossOrderDetails);
        }
        TakeProfitOrderDetails takeProfitOrderDetails = this.take_profit_order_details;
        if (takeProfitOrderDetails != null) {
            arrayList.add("take_profit_order_details=" + takeProfitOrderDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderDetails{", "}", 0, null, null, 56, null);
    }

    public final OrderDetails copy(MarketOrderDetails market_order_details, LimitOrderDetails limit_order_details, StopLossOrderDetails stop_loss_order_details, TakeProfitOrderDetails take_profit_order_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderDetails(market_order_details, limit_order_details, stop_loss_order_details, take_profit_order_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.order.v1.OrderDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + MarketOrderDetails.ADAPTER.encodedSizeWithTag(1, value.getMarket_order_details()) + LimitOrderDetails.ADAPTER.encodedSizeWithTag(2, value.getLimit_order_details()) + StopLossOrderDetails.ADAPTER.encodedSizeWithTag(3, value.getStop_loss_order_details()) + TakeProfitOrderDetails.ADAPTER.encodedSizeWithTag(4, value.getTake_profit_order_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                MarketOrderDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getMarket_order_details());
                LimitOrderDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getLimit_order_details());
                StopLossOrderDetails.ADAPTER.encodeWithTag(writer, 3, (int) value.getStop_loss_order_details());
                TakeProfitOrderDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getTake_profit_order_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TakeProfitOrderDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getTake_profit_order_details());
                StopLossOrderDetails.ADAPTER.encodeWithTag(writer, 3, (int) value.getStop_loss_order_details());
                LimitOrderDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getLimit_order_details());
                MarketOrderDetails.ADAPTER.encodeWithTag(writer, 1, (int) value.getMarket_order_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderDetails redact(OrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                MarketOrderDetails market_order_details = value.getMarket_order_details();
                MarketOrderDetails marketOrderDetailsRedact = market_order_details != null ? MarketOrderDetails.ADAPTER.redact(market_order_details) : null;
                LimitOrderDetails limit_order_details = value.getLimit_order_details();
                LimitOrderDetails limitOrderDetailsRedact = limit_order_details != null ? LimitOrderDetails.ADAPTER.redact(limit_order_details) : null;
                StopLossOrderDetails stop_loss_order_details = value.getStop_loss_order_details();
                StopLossOrderDetails stopLossOrderDetailsRedact = stop_loss_order_details != null ? StopLossOrderDetails.ADAPTER.redact(stop_loss_order_details) : null;
                TakeProfitOrderDetails take_profit_order_details = value.getTake_profit_order_details();
                return value.copy(marketOrderDetailsRedact, limitOrderDetailsRedact, stopLossOrderDetailsRedact, take_profit_order_details != null ? TakeProfitOrderDetails.ADAPTER.redact(take_profit_order_details) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                MarketOrderDetails marketOrderDetailsDecode = null;
                LimitOrderDetails limitOrderDetailsDecode = null;
                StopLossOrderDetails stopLossOrderDetailsDecode = null;
                TakeProfitOrderDetails takeProfitOrderDetailsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OrderDetails(marketOrderDetailsDecode, limitOrderDetailsDecode, stopLossOrderDetailsDecode, takeProfitOrderDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        marketOrderDetailsDecode = MarketOrderDetails.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        limitOrderDetailsDecode = LimitOrderDetails.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        stopLossOrderDetailsDecode = StopLossOrderDetails.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        takeProfitOrderDetailsDecode = TakeProfitOrderDetails.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}

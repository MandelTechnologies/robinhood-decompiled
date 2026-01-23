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
import contracts.crypto.trade.proto.p431v1.OrderPrices;
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

/* compiled from: OrderPrices.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005!\"#$%BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J@\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/OrderPrices;", "Lcom/squareup/wire/Message;", "", "market", "Lcontracts/crypto/trade/proto/v1/OrderPrices$Market;", "limit", "Lcontracts/crypto/trade/proto/v1/OrderPrices$Limit;", "stop_loss", "Lcontracts/crypto/trade/proto/v1/OrderPrices$StopLoss;", "stop_limit", "Lcontracts/crypto/trade/proto/v1/OrderPrices$StopLimit;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/OrderPrices$Market;Lcontracts/crypto/trade/proto/v1/OrderPrices$Limit;Lcontracts/crypto/trade/proto/v1/OrderPrices$StopLoss;Lcontracts/crypto/trade/proto/v1/OrderPrices$StopLimit;Lokio/ByteString;)V", "getMarket", "()Lcontracts/crypto/trade/proto/v1/OrderPrices$Market;", "getLimit", "()Lcontracts/crypto/trade/proto/v1/OrderPrices$Limit;", "getStop_loss", "()Lcontracts/crypto/trade/proto/v1/OrderPrices$StopLoss;", "getStop_limit", "()Lcontracts/crypto/trade/proto/v1/OrderPrices$StopLimit;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Market", "Limit", "StopLoss", "StopLimit", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class OrderPrices extends Message {

    @JvmField
    public static final ProtoAdapter<OrderPrices> ADAPTER;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.OrderPrices$Limit#ADAPTER", oneofName = "prices", schemaIndex = 1, tag = 2)
    private final Limit limit;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.OrderPrices$Market#ADAPTER", oneofName = "prices", schemaIndex = 0, tag = 1)
    private final Market market;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.OrderPrices$StopLimit#ADAPTER", jsonName = "stopLimit", oneofName = "prices", schemaIndex = 3, tag = 4)
    private final StopLimit stop_limit;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.OrderPrices$StopLoss#ADAPTER", jsonName = "stopLoss", oneofName = "prices", schemaIndex = 2, tag = 3)
    private final StopLoss stop_loss;

    public OrderPrices() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27673newBuilder();
    }

    public final Market getMarket() {
        return this.market;
    }

    public final Limit getLimit() {
        return this.limit;
    }

    public final StopLoss getStop_loss() {
        return this.stop_loss;
    }

    public final StopLimit getStop_limit() {
        return this.stop_limit;
    }

    public /* synthetic */ OrderPrices(Market market, Limit limit, StopLoss stopLoss, StopLimit stopLimit, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : market, (i & 2) != 0 ? null : limit, (i & 4) != 0 ? null : stopLoss, (i & 8) != 0 ? null : stopLimit, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPrices(Market market, Limit limit, StopLoss stopLoss, StopLimit stopLimit, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.market = market;
        this.limit = limit;
        this.stop_loss = stopLoss;
        this.stop_limit = stopLimit;
        if (Internal.countNonNull(market, limit, stopLoss, stopLimit, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of market, limit, stop_loss, stop_limit may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27673newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderPrices)) {
            return false;
        }
        OrderPrices orderPrices = (OrderPrices) other;
        return Intrinsics.areEqual(unknownFields(), orderPrices.unknownFields()) && Intrinsics.areEqual(this.market, orderPrices.market) && Intrinsics.areEqual(this.limit, orderPrices.limit) && Intrinsics.areEqual(this.stop_loss, orderPrices.stop_loss) && Intrinsics.areEqual(this.stop_limit, orderPrices.stop_limit);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Market market = this.market;
        int iHashCode2 = (iHashCode + (market != null ? market.hashCode() : 0)) * 37;
        Limit limit = this.limit;
        int iHashCode3 = (iHashCode2 + (limit != null ? limit.hashCode() : 0)) * 37;
        StopLoss stopLoss = this.stop_loss;
        int iHashCode4 = (iHashCode3 + (stopLoss != null ? stopLoss.hashCode() : 0)) * 37;
        StopLimit stopLimit = this.stop_limit;
        int iHashCode5 = iHashCode4 + (stopLimit != null ? stopLimit.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Market market = this.market;
        if (market != null) {
            arrayList.add("market=" + market);
        }
        Limit limit = this.limit;
        if (limit != null) {
            arrayList.add("limit=" + limit);
        }
        StopLoss stopLoss = this.stop_loss;
        if (stopLoss != null) {
            arrayList.add("stop_loss=" + stopLoss);
        }
        StopLimit stopLimit = this.stop_limit;
        if (stopLimit != null) {
            arrayList.add("stop_limit=" + stopLimit);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderPrices{", "}", 0, null, null, 56, null);
    }

    public final OrderPrices copy(Market market, Limit limit, StopLoss stop_loss, StopLimit stop_limit, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderPrices(market, limit, stop_loss, stop_limit, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderPrices.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderPrices>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.OrderPrices$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderPrices value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + OrderPrices.Market.ADAPTER.encodedSizeWithTag(1, value.getMarket()) + OrderPrices.Limit.ADAPTER.encodedSizeWithTag(2, value.getLimit()) + OrderPrices.StopLoss.ADAPTER.encodedSizeWithTag(3, value.getStop_loss()) + OrderPrices.StopLimit.ADAPTER.encodedSizeWithTag(4, value.getStop_limit());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderPrices value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                OrderPrices.Market.ADAPTER.encodeWithTag(writer, 1, (int) value.getMarket());
                OrderPrices.Limit.ADAPTER.encodeWithTag(writer, 2, (int) value.getLimit());
                OrderPrices.StopLoss.ADAPTER.encodeWithTag(writer, 3, (int) value.getStop_loss());
                OrderPrices.StopLimit.ADAPTER.encodeWithTag(writer, 4, (int) value.getStop_limit());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderPrices value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                OrderPrices.StopLimit.ADAPTER.encodeWithTag(writer, 4, (int) value.getStop_limit());
                OrderPrices.StopLoss.ADAPTER.encodeWithTag(writer, 3, (int) value.getStop_loss());
                OrderPrices.Limit.ADAPTER.encodeWithTag(writer, 2, (int) value.getLimit());
                OrderPrices.Market.ADAPTER.encodeWithTag(writer, 1, (int) value.getMarket());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderPrices redact(OrderPrices value) {
                Intrinsics.checkNotNullParameter(value, "value");
                OrderPrices.Market market = value.getMarket();
                OrderPrices.Market marketRedact = market != null ? OrderPrices.Market.ADAPTER.redact(market) : null;
                OrderPrices.Limit limit = value.getLimit();
                OrderPrices.Limit limitRedact = limit != null ? OrderPrices.Limit.ADAPTER.redact(limit) : null;
                OrderPrices.StopLoss stop_loss = value.getStop_loss();
                OrderPrices.StopLoss stopLossRedact = stop_loss != null ? OrderPrices.StopLoss.ADAPTER.redact(stop_loss) : null;
                OrderPrices.StopLimit stop_limit = value.getStop_limit();
                return value.copy(marketRedact, limitRedact, stopLossRedact, stop_limit != null ? OrderPrices.StopLimit.ADAPTER.redact(stop_limit) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderPrices decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                OrderPrices.Market marketDecode = null;
                OrderPrices.Limit limitDecode = null;
                OrderPrices.StopLoss stopLossDecode = null;
                OrderPrices.StopLimit stopLimitDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OrderPrices(marketDecode, limitDecode, stopLossDecode, stopLimitDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        marketDecode = OrderPrices.Market.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        limitDecode = OrderPrices.Limit.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        stopLossDecode = OrderPrices.StopLoss.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        stopLimitDecode = OrderPrices.StopLimit.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: OrderPrices.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/OrderPrices$Market;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Market extends Message {

        @JvmField
        public static final ProtoAdapter<Market> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public Market() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27675newBuilder();
        }

        public /* synthetic */ Market(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Market(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27675newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof Market) && Intrinsics.areEqual(unknownFields(), ((Market) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "Market{}";
        }

        public final Market copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Market(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Market.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Market>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.OrderPrices$Market$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(OrderPrices.Market value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, OrderPrices.Market value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, OrderPrices.Market value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public OrderPrices.Market redact(OrderPrices.Market value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public OrderPrices.Market decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new OrderPrices.Market(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }

    /* compiled from: OrderPrices.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/OrderPrices$Limit;", "Lcom/squareup/wire/Message;", "", "limit_price", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getLimit_price", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Limit extends Message {

        @JvmField
        public static final ProtoAdapter<Limit> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitPrice", schemaIndex = 0, tag = 1)
        private final String limit_price;

        /* JADX WARN: Multi-variable type inference failed */
        public Limit() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27674newBuilder();
        }

        public final String getLimit_price() {
            return this.limit_price;
        }

        public /* synthetic */ Limit(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Limit(String str, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.limit_price = str;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27674newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Limit)) {
                return false;
            }
            Limit limit = (Limit) other;
            return Intrinsics.areEqual(unknownFields(), limit.unknownFields()) && Intrinsics.areEqual(this.limit_price, limit.limit_price);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            String str = this.limit_price;
            int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.limit_price;
            if (str != null) {
                arrayList.add("limit_price=" + Internal.sanitize(str));
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Limit{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Limit copy$default(Limit limit, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = limit.limit_price;
            }
            if ((i & 2) != 0) {
                byteString = limit.unknownFields();
            }
            return limit.copy(str, byteString);
        }

        public final Limit copy(String limit_price, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Limit(limit_price, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Limit.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Limit>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.OrderPrices$Limit$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(OrderPrices.Limit value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLimit_price());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, OrderPrices.Limit value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLimit_price());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, OrderPrices.Limit value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLimit_price());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public OrderPrices.Limit redact(OrderPrices.Limit value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return OrderPrices.Limit.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public OrderPrices.Limit decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new OrderPrices.Limit(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: OrderPrices.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/OrderPrices$StopLoss;", "Lcom/squareup/wire/Message;", "", "stop_price", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getStop_price", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StopLoss extends Message {

        @JvmField
        public static final ProtoAdapter<StopLoss> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stopPrice", schemaIndex = 0, tag = 1)
        private final String stop_price;

        /* JADX WARN: Multi-variable type inference failed */
        public StopLoss() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27677newBuilder();
        }

        public final String getStop_price() {
            return this.stop_price;
        }

        public /* synthetic */ StopLoss(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopLoss(String str, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.stop_price = str;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27677newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof StopLoss)) {
                return false;
            }
            StopLoss stopLoss = (StopLoss) other;
            return Intrinsics.areEqual(unknownFields(), stopLoss.unknownFields()) && Intrinsics.areEqual(this.stop_price, stopLoss.stop_price);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            String str = this.stop_price;
            int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.stop_price;
            if (str != null) {
                arrayList.add("stop_price=" + Internal.sanitize(str));
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "StopLoss{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ StopLoss copy$default(StopLoss stopLoss, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stopLoss.stop_price;
            }
            if ((i & 2) != 0) {
                byteString = stopLoss.unknownFields();
            }
            return stopLoss.copy(str, byteString);
        }

        public final StopLoss copy(String stop_price, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new StopLoss(stop_price, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StopLoss.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<StopLoss>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.OrderPrices$StopLoss$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(OrderPrices.StopLoss value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getStop_price());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, OrderPrices.StopLoss value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStop_price());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, OrderPrices.StopLoss value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStop_price());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public OrderPrices.StopLoss redact(OrderPrices.StopLoss value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return OrderPrices.StopLoss.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public OrderPrices.StopLoss decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new OrderPrices.StopLoss(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: OrderPrices.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J(\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/OrderPrices$StopLimit;", "Lcom/squareup/wire/Message;", "", "limit_price", "", "stop_price", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getLimit_price", "()Ljava/lang/String;", "getStop_price", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StopLimit extends Message {

        @JvmField
        public static final ProtoAdapter<StopLimit> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "limitPrice", schemaIndex = 0, tag = 1)
        private final String limit_price;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stopPrice", schemaIndex = 1, tag = 2)
        private final String stop_price;

        public StopLimit() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27676newBuilder();
        }

        public final String getLimit_price() {
            return this.limit_price;
        }

        public final String getStop_price() {
            return this.stop_price;
        }

        public /* synthetic */ StopLimit(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopLimit(String str, String str2, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.limit_price = str;
            this.stop_price = str2;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27676newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof StopLimit)) {
                return false;
            }
            StopLimit stopLimit = (StopLimit) other;
            return Intrinsics.areEqual(unknownFields(), stopLimit.unknownFields()) && Intrinsics.areEqual(this.limit_price, stopLimit.limit_price) && Intrinsics.areEqual(this.stop_price, stopLimit.stop_price);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            String str = this.limit_price;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.stop_price;
            int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.limit_price;
            if (str != null) {
                arrayList.add("limit_price=" + Internal.sanitize(str));
            }
            String str2 = this.stop_price;
            if (str2 != null) {
                arrayList.add("stop_price=" + Internal.sanitize(str2));
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "StopLimit{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ StopLimit copy$default(StopLimit stopLimit, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stopLimit.limit_price;
            }
            if ((i & 2) != 0) {
                str2 = stopLimit.stop_price;
            }
            if ((i & 4) != 0) {
                byteString = stopLimit.unknownFields();
            }
            return stopLimit.copy(str, str2, byteString);
        }

        public final StopLimit copy(String limit_price, String stop_price, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new StopLimit(limit_price, stop_price, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StopLimit.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<StopLimit>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.OrderPrices$StopLimit$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public OrderPrices.StopLimit decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = null;
                    String strDecode2 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new OrderPrices.StopLimit(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(OrderPrices.StopLimit value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    return size + protoAdapter.encodedSizeWithTag(1, value.getLimit_price()) + protoAdapter.encodedSizeWithTag(2, value.getStop_price());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, OrderPrices.StopLimit value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getLimit_price());
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getStop_price());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, OrderPrices.StopLimit value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getStop_price());
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getLimit_price());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public OrderPrices.StopLimit redact(OrderPrices.StopLimit value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return OrderPrices.StopLimit.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }
    }
}

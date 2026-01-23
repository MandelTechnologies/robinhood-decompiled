package black_widow.contracts.mobile_app_chart.proto.p024v1;

import com.robinhood.models.card.p311db.Card;
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

/* compiled from: OrderPayload.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J@\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderPayload;", "Lcom/squareup/wire/Message;", "", "equities_limit_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayload;", "equities_stop_market_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesStopMarketOrderPayload;", "equities_sell_all_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesSellAllOrderPayload;", "equities_buy_all_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesBuyAllOrderPayload;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayload;Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesStopMarketOrderPayload;Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesSellAllOrderPayload;Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesBuyAllOrderPayload;Lokio/ByteString;)V", "getEquities_limit_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayload;", "getEquities_stop_market_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesStopMarketOrderPayload;", "getEquities_sell_all_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesSellAllOrderPayload;", "getEquities_buy_all_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesBuyAllOrderPayload;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class OrderPayload extends Message {

    @JvmField
    public static final ProtoAdapter<OrderPayload> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.EquitiesBuyAllOrderPayload#ADAPTER", jsonName = "equitiesBuyAllOrder", oneofName = Card.Icon.ORDER, schemaIndex = 3, tag = 4)
    private final EquitiesBuyAllOrderPayload equities_buy_all_order;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.EquitiesLimitOrderPayload#ADAPTER", jsonName = "equitiesLimitOrder", oneofName = Card.Icon.ORDER, schemaIndex = 0, tag = 1)
    private final EquitiesLimitOrderPayload equities_limit_order;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.EquitiesSellAllOrderPayload#ADAPTER", jsonName = "equitiesSellAllOrder", oneofName = Card.Icon.ORDER, schemaIndex = 2, tag = 3)
    private final EquitiesSellAllOrderPayload equities_sell_all_order;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.EquitiesStopMarketOrderPayload#ADAPTER", jsonName = "equitiesStopMarketOrder", oneofName = Card.Icon.ORDER, schemaIndex = 1, tag = 2)
    private final EquitiesStopMarketOrderPayload equities_stop_market_order;

    public OrderPayload() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8633newBuilder();
    }

    public final EquitiesLimitOrderPayload getEquities_limit_order() {
        return this.equities_limit_order;
    }

    public final EquitiesStopMarketOrderPayload getEquities_stop_market_order() {
        return this.equities_stop_market_order;
    }

    public final EquitiesSellAllOrderPayload getEquities_sell_all_order() {
        return this.equities_sell_all_order;
    }

    public final EquitiesBuyAllOrderPayload getEquities_buy_all_order() {
        return this.equities_buy_all_order;
    }

    public /* synthetic */ OrderPayload(EquitiesLimitOrderPayload equitiesLimitOrderPayload, EquitiesStopMarketOrderPayload equitiesStopMarketOrderPayload, EquitiesSellAllOrderPayload equitiesSellAllOrderPayload, EquitiesBuyAllOrderPayload equitiesBuyAllOrderPayload, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : equitiesLimitOrderPayload, (i & 2) != 0 ? null : equitiesStopMarketOrderPayload, (i & 4) != 0 ? null : equitiesSellAllOrderPayload, (i & 8) != 0 ? null : equitiesBuyAllOrderPayload, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPayload(EquitiesLimitOrderPayload equitiesLimitOrderPayload, EquitiesStopMarketOrderPayload equitiesStopMarketOrderPayload, EquitiesSellAllOrderPayload equitiesSellAllOrderPayload, EquitiesBuyAllOrderPayload equitiesBuyAllOrderPayload, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.equities_limit_order = equitiesLimitOrderPayload;
        this.equities_stop_market_order = equitiesStopMarketOrderPayload;
        this.equities_sell_all_order = equitiesSellAllOrderPayload;
        this.equities_buy_all_order = equitiesBuyAllOrderPayload;
        if (Internal.countNonNull(equitiesLimitOrderPayload, equitiesStopMarketOrderPayload, equitiesSellAllOrderPayload, equitiesBuyAllOrderPayload, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of equities_limit_order, equities_stop_market_order, equities_sell_all_order, equities_buy_all_order may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8633newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderPayload)) {
            return false;
        }
        OrderPayload orderPayload = (OrderPayload) other;
        return Intrinsics.areEqual(unknownFields(), orderPayload.unknownFields()) && Intrinsics.areEqual(this.equities_limit_order, orderPayload.equities_limit_order) && Intrinsics.areEqual(this.equities_stop_market_order, orderPayload.equities_stop_market_order) && Intrinsics.areEqual(this.equities_sell_all_order, orderPayload.equities_sell_all_order) && Intrinsics.areEqual(this.equities_buy_all_order, orderPayload.equities_buy_all_order);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EquitiesLimitOrderPayload equitiesLimitOrderPayload = this.equities_limit_order;
        int iHashCode2 = (iHashCode + (equitiesLimitOrderPayload != null ? equitiesLimitOrderPayload.hashCode() : 0)) * 37;
        EquitiesStopMarketOrderPayload equitiesStopMarketOrderPayload = this.equities_stop_market_order;
        int iHashCode3 = (iHashCode2 + (equitiesStopMarketOrderPayload != null ? equitiesStopMarketOrderPayload.hashCode() : 0)) * 37;
        EquitiesSellAllOrderPayload equitiesSellAllOrderPayload = this.equities_sell_all_order;
        int iHashCode4 = (iHashCode3 + (equitiesSellAllOrderPayload != null ? equitiesSellAllOrderPayload.hashCode() : 0)) * 37;
        EquitiesBuyAllOrderPayload equitiesBuyAllOrderPayload = this.equities_buy_all_order;
        int iHashCode5 = iHashCode4 + (equitiesBuyAllOrderPayload != null ? equitiesBuyAllOrderPayload.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        EquitiesLimitOrderPayload equitiesLimitOrderPayload = this.equities_limit_order;
        if (equitiesLimitOrderPayload != null) {
            arrayList.add("equities_limit_order=" + equitiesLimitOrderPayload);
        }
        EquitiesStopMarketOrderPayload equitiesStopMarketOrderPayload = this.equities_stop_market_order;
        if (equitiesStopMarketOrderPayload != null) {
            arrayList.add("equities_stop_market_order=" + equitiesStopMarketOrderPayload);
        }
        EquitiesSellAllOrderPayload equitiesSellAllOrderPayload = this.equities_sell_all_order;
        if (equitiesSellAllOrderPayload != null) {
            arrayList.add("equities_sell_all_order=" + equitiesSellAllOrderPayload);
        }
        EquitiesBuyAllOrderPayload equitiesBuyAllOrderPayload = this.equities_buy_all_order;
        if (equitiesBuyAllOrderPayload != null) {
            arrayList.add("equities_buy_all_order=" + equitiesBuyAllOrderPayload);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderPayload{", "}", 0, null, null, 56, null);
    }

    public final OrderPayload copy(EquitiesLimitOrderPayload equities_limit_order, EquitiesStopMarketOrderPayload equities_stop_market_order, EquitiesSellAllOrderPayload equities_sell_all_order, EquitiesBuyAllOrderPayload equities_buy_all_order, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderPayload(equities_limit_order, equities_stop_market_order, equities_sell_all_order, equities_buy_all_order, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderPayload.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderPayload>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.OrderPayload$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderPayload value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + EquitiesLimitOrderPayload.ADAPTER.encodedSizeWithTag(1, value.getEquities_limit_order()) + EquitiesStopMarketOrderPayload.ADAPTER.encodedSizeWithTag(2, value.getEquities_stop_market_order()) + EquitiesSellAllOrderPayload.ADAPTER.encodedSizeWithTag(3, value.getEquities_sell_all_order()) + EquitiesBuyAllOrderPayload.ADAPTER.encodedSizeWithTag(4, value.getEquities_buy_all_order());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderPayload value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                EquitiesLimitOrderPayload.ADAPTER.encodeWithTag(writer, 1, (int) value.getEquities_limit_order());
                EquitiesStopMarketOrderPayload.ADAPTER.encodeWithTag(writer, 2, (int) value.getEquities_stop_market_order());
                EquitiesSellAllOrderPayload.ADAPTER.encodeWithTag(writer, 3, (int) value.getEquities_sell_all_order());
                EquitiesBuyAllOrderPayload.ADAPTER.encodeWithTag(writer, 4, (int) value.getEquities_buy_all_order());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderPayload value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                EquitiesBuyAllOrderPayload.ADAPTER.encodeWithTag(writer, 4, (int) value.getEquities_buy_all_order());
                EquitiesSellAllOrderPayload.ADAPTER.encodeWithTag(writer, 3, (int) value.getEquities_sell_all_order());
                EquitiesStopMarketOrderPayload.ADAPTER.encodeWithTag(writer, 2, (int) value.getEquities_stop_market_order());
                EquitiesLimitOrderPayload.ADAPTER.encodeWithTag(writer, 1, (int) value.getEquities_limit_order());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderPayload redact(OrderPayload value) {
                Intrinsics.checkNotNullParameter(value, "value");
                EquitiesLimitOrderPayload equities_limit_order = value.getEquities_limit_order();
                EquitiesLimitOrderPayload equitiesLimitOrderPayloadRedact = equities_limit_order != null ? EquitiesLimitOrderPayload.ADAPTER.redact(equities_limit_order) : null;
                EquitiesStopMarketOrderPayload equities_stop_market_order = value.getEquities_stop_market_order();
                EquitiesStopMarketOrderPayload equitiesStopMarketOrderPayloadRedact = equities_stop_market_order != null ? EquitiesStopMarketOrderPayload.ADAPTER.redact(equities_stop_market_order) : null;
                EquitiesSellAllOrderPayload equities_sell_all_order = value.getEquities_sell_all_order();
                EquitiesSellAllOrderPayload equitiesSellAllOrderPayloadRedact = equities_sell_all_order != null ? EquitiesSellAllOrderPayload.ADAPTER.redact(equities_sell_all_order) : null;
                EquitiesBuyAllOrderPayload equities_buy_all_order = value.getEquities_buy_all_order();
                return value.copy(equitiesLimitOrderPayloadRedact, equitiesStopMarketOrderPayloadRedact, equitiesSellAllOrderPayloadRedact, equities_buy_all_order != null ? EquitiesBuyAllOrderPayload.ADAPTER.redact(equities_buy_all_order) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderPayload decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                EquitiesLimitOrderPayload equitiesLimitOrderPayloadDecode = null;
                EquitiesStopMarketOrderPayload equitiesStopMarketOrderPayloadDecode = null;
                EquitiesSellAllOrderPayload equitiesSellAllOrderPayloadDecode = null;
                EquitiesBuyAllOrderPayload equitiesBuyAllOrderPayloadDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OrderPayload(equitiesLimitOrderPayloadDecode, equitiesStopMarketOrderPayloadDecode, equitiesSellAllOrderPayloadDecode, equitiesBuyAllOrderPayloadDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        equitiesLimitOrderPayloadDecode = EquitiesLimitOrderPayload.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        equitiesStopMarketOrderPayloadDecode = EquitiesStopMarketOrderPayload.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        equitiesSellAllOrderPayloadDecode = EquitiesSellAllOrderPayload.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        equitiesBuyAllOrderPayloadDecode = EquitiesBuyAllOrderPayload.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}

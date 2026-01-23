package crypto_perpetuals.order.p438v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.common.p435v1.QuoteType;
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

/* compiled from: OrderPrice.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcrypto_perpetuals/order/v1/OrderPrice;", "Lcom/squareup/wire/Message;", "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "", "collar_rate", "quote_type", "Lcrypto_perpetuals/common/v1/QuoteType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/QuoteType;Lokio/ByteString;)V", "getPrice", "()Ljava/lang/String;", "getCollar_rate", "getQuote_type", "()Lcrypto_perpetuals/common/v1/QuoteType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.order.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderPrice extends Message {

    @JvmField
    public static final ProtoAdapter<OrderPrice> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "collarRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String collar_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String price;

    @WireField(adapter = "crypto_perpetuals.common.v1.QuoteType#ADAPTER", jsonName = "quoteType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final QuoteType quote_type;

    public OrderPrice() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ OrderPrice(String str, String str2, QuoteType quoteType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? QuoteType.QUOTE_TYPE_UNSPECIFIED : quoteType, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27845newBuilder();
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getCollar_rate() {
        return this.collar_rate;
    }

    public final QuoteType getQuote_type() {
        return this.quote_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPrice(String price, String collar_rate, QuoteType quote_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(collar_rate, "collar_rate");
        Intrinsics.checkNotNullParameter(quote_type, "quote_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.price = price;
        this.collar_rate = collar_rate;
        this.quote_type = quote_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27845newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderPrice)) {
            return false;
        }
        OrderPrice orderPrice = (OrderPrice) other;
        return Intrinsics.areEqual(unknownFields(), orderPrice.unknownFields()) && Intrinsics.areEqual(this.price, orderPrice.price) && Intrinsics.areEqual(this.collar_rate, orderPrice.collar_rate) && this.quote_type == orderPrice.quote_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.price.hashCode()) * 37) + this.collar_rate.hashCode()) * 37) + this.quote_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("price=" + Internal.sanitize(this.price));
        arrayList.add("collar_rate=" + Internal.sanitize(this.collar_rate));
        arrayList.add("quote_type=" + this.quote_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderPrice{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderPrice copy$default(OrderPrice orderPrice, String str, String str2, QuoteType quoteType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderPrice.price;
        }
        if ((i & 2) != 0) {
            str2 = orderPrice.collar_rate;
        }
        if ((i & 4) != 0) {
            quoteType = orderPrice.quote_type;
        }
        if ((i & 8) != 0) {
            byteString = orderPrice.unknownFields();
        }
        return orderPrice.copy(str, str2, quoteType, byteString);
    }

    public final OrderPrice copy(String price, String collar_rate, QuoteType quote_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(collar_rate, "collar_rate");
        Intrinsics.checkNotNullParameter(quote_type, "quote_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderPrice(price, collar_rate, quote_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderPrice.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderPrice>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.order.v1.OrderPrice$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderPrice value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getCollar_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCollar_rate());
                }
                return value.getQuote_type() != QuoteType.QUOTE_TYPE_UNSPECIFIED ? size + QuoteType.ADAPTER.encodedSizeWithTag(3, value.getQuote_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderPrice value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getCollar_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCollar_rate());
                }
                if (value.getQuote_type() != QuoteType.QUOTE_TYPE_UNSPECIFIED) {
                    QuoteType.ADAPTER.encodeWithTag(writer, 3, (int) value.getQuote_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderPrice value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getQuote_type() != QuoteType.QUOTE_TYPE_UNSPECIFIED) {
                    QuoteType.ADAPTER.encodeWithTag(writer, 3, (int) value.getQuote_type());
                }
                if (!Intrinsics.areEqual(value.getCollar_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCollar_rate());
                }
                if (Intrinsics.areEqual(value.getPrice(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPrice());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderPrice decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                QuoteType quoteTypeDecode = QuoteType.QUOTE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OrderPrice(strDecode, strDecode2, quoteTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            quoteTypeDecode = QuoteType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderPrice redact(OrderPrice value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OrderPrice.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}

package crypto_perpetuals.service.p440v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.order.p438v1.OrderQuote;
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

/* compiled from: ReviewOrderResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ReviewOrderResponse;", "Lcom/squareup/wire/Message;", "", "ref_id", "", "order_quote", "Lcrypto_perpetuals/order/v1/OrderQuote;", "quote_token", ErrorBundle.SUMMARY_ENTRY, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcrypto_perpetuals/order/v1/OrderQuote;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getRef_id", "()Ljava/lang/String;", "getOrder_quote", "()Lcrypto_perpetuals/order/v1/OrderQuote;", "getQuote_token", "getSummary", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ReviewOrderResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ReviewOrderResponse> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.order.v1.OrderQuote#ADAPTER", jsonName = "orderQuote", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final OrderQuote order_quote;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteToken", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String quote_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ref_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 20)
    private final String summary;

    public ReviewOrderResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ ReviewOrderResponse(String str, OrderQuote orderQuote, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : orderQuote, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27888newBuilder();
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final OrderQuote getOrder_quote() {
        return this.order_quote;
    }

    public final String getQuote_token() {
        return this.quote_token;
    }

    public final String getSummary() {
        return this.summary;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewOrderResponse(String ref_id, OrderQuote orderQuote, String quote_token, String summary, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(quote_token, "quote_token");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ref_id = ref_id;
        this.order_quote = orderQuote;
        this.quote_token = quote_token;
        this.summary = summary;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27888newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ReviewOrderResponse)) {
            return false;
        }
        ReviewOrderResponse reviewOrderResponse = (ReviewOrderResponse) other;
        return Intrinsics.areEqual(unknownFields(), reviewOrderResponse.unknownFields()) && Intrinsics.areEqual(this.ref_id, reviewOrderResponse.ref_id) && Intrinsics.areEqual(this.order_quote, reviewOrderResponse.order_quote) && Intrinsics.areEqual(this.quote_token, reviewOrderResponse.quote_token) && Intrinsics.areEqual(this.summary, reviewOrderResponse.summary);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.ref_id.hashCode()) * 37;
        OrderQuote orderQuote = this.order_quote;
        int iHashCode2 = ((((iHashCode + (orderQuote != null ? orderQuote.hashCode() : 0)) * 37) + this.quote_token.hashCode()) * 37) + this.summary.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        OrderQuote orderQuote = this.order_quote;
        if (orderQuote != null) {
            arrayList.add("order_quote=" + orderQuote);
        }
        arrayList.add("quote_token=" + Internal.sanitize(this.quote_token));
        arrayList.add("summary=" + Internal.sanitize(this.summary));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReviewOrderResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ReviewOrderResponse copy$default(ReviewOrderResponse reviewOrderResponse, String str, OrderQuote orderQuote, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reviewOrderResponse.ref_id;
        }
        if ((i & 2) != 0) {
            orderQuote = reviewOrderResponse.order_quote;
        }
        if ((i & 4) != 0) {
            str2 = reviewOrderResponse.quote_token;
        }
        if ((i & 8) != 0) {
            str3 = reviewOrderResponse.summary;
        }
        if ((i & 16) != 0) {
            byteString = reviewOrderResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str2;
        return reviewOrderResponse.copy(str, orderQuote, str4, str3, byteString2);
    }

    public final ReviewOrderResponse copy(String ref_id, OrderQuote order_quote, String quote_token, String summary, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(quote_token, "quote_token");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ReviewOrderResponse(ref_id, order_quote, quote_token, summary, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ReviewOrderResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ReviewOrderResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.service.v1.ReviewOrderResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ReviewOrderResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRef_id());
                }
                if (value.getOrder_quote() != null) {
                    size += OrderQuote.ADAPTER.encodedSizeWithTag(2, value.getOrder_quote());
                }
                if (!Intrinsics.areEqual(value.getQuote_token(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getQuote_token());
                }
                return !Intrinsics.areEqual(value.getSummary(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(20, value.getSummary()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ReviewOrderResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRef_id());
                }
                if (value.getOrder_quote() != null) {
                    OrderQuote.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_quote());
                }
                if (!Intrinsics.areEqual(value.getQuote_token(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuote_token());
                }
                if (!Intrinsics.areEqual(value.getSummary(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getSummary());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ReviewOrderResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSummary(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getSummary());
                }
                if (!Intrinsics.areEqual(value.getQuote_token(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuote_token());
                }
                if (value.getOrder_quote() != null) {
                    OrderQuote.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_quote());
                }
                if (Intrinsics.areEqual(value.getRef_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRef_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ReviewOrderResponse redact(ReviewOrderResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                OrderQuote order_quote = value.getOrder_quote();
                return ReviewOrderResponse.copy$default(value, null, order_quote != null ? OrderQuote.ADAPTER.redact(order_quote) : null, null, null, ByteString.EMPTY, 13, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ReviewOrderResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                OrderQuote orderQuoteDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ReviewOrderResponse(strDecode, orderQuoteDecode, strDecode3, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        orderQuoteDecode = OrderQuote.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 20) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}

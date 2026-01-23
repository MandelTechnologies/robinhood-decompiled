package black_widow.contracts.mobile_app_chart.proto.p024v1;

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

/* compiled from: Quote.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/Quote;", "Lcom/squareup/wire/Message;", "", "last_trade_price", "", "previous_close_price", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getLast_trade_price", "()Ljava/lang/String;", "getPrevious_close_price", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class Quote extends Message {

    @JvmField
    public static final ProtoAdapter<Quote> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastTradePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String last_trade_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previousClosePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String previous_close_price;

    public Quote() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ Quote(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8638newBuilder();
    }

    public final String getLast_trade_price() {
        return this.last_trade_price;
    }

    public final String getPrevious_close_price() {
        return this.previous_close_price;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Quote(String last_trade_price, String previous_close_price, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
        Intrinsics.checkNotNullParameter(previous_close_price, "previous_close_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.last_trade_price = last_trade_price;
        this.previous_close_price = previous_close_price;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8638newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Quote)) {
            return false;
        }
        Quote quote = (Quote) other;
        return Intrinsics.areEqual(unknownFields(), quote.unknownFields()) && Intrinsics.areEqual(this.last_trade_price, quote.last_trade_price) && Intrinsics.areEqual(this.previous_close_price, quote.previous_close_price);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.last_trade_price.hashCode()) * 37) + this.previous_close_price.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("last_trade_price=" + Internal.sanitize(this.last_trade_price));
        arrayList.add("previous_close_price=" + Internal.sanitize(this.previous_close_price));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Quote{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Quote copy$default(Quote quote, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quote.last_trade_price;
        }
        if ((i & 2) != 0) {
            str2 = quote.previous_close_price;
        }
        if ((i & 4) != 0) {
            byteString = quote.unknownFields();
        }
        return quote.copy(str, str2, byteString);
    }

    public final Quote copy(String last_trade_price, String previous_close_price, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
        Intrinsics.checkNotNullParameter(previous_close_price, "previous_close_price");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Quote(last_trade_price, previous_close_price, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Quote.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Quote>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.Quote$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Quote value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLast_trade_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLast_trade_price());
                }
                return !Intrinsics.areEqual(value.getPrevious_close_price(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPrevious_close_price()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Quote value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLast_trade_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLast_trade_price());
                }
                if (!Intrinsics.areEqual(value.getPrevious_close_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrevious_close_price());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Quote value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPrevious_close_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrevious_close_price());
                }
                if (Intrinsics.areEqual(value.getLast_trade_price(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLast_trade_price());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Quote redact(Quote value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Quote.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Quote decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Quote(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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

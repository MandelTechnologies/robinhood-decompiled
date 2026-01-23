package equity_trading_tax_lots.proto.p460v1;

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

/* compiled from: OrderSummaryDetails.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/OrderSummaryDetails;", "Lcom/squareup/wire/Message;", "", "row_title", "", "row_trailing_title", "row_trailing_subtitle", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getRow_title", "()Ljava/lang/String;", "getRow_trailing_title", "getRow_trailing_subtitle", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderSummaryDetails extends Message {

    @JvmField
    public static final ProtoAdapter<OrderSummaryDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rowTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String row_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rowTrailingSubtitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String row_trailing_subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rowTrailingTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String row_trailing_title;

    public OrderSummaryDetails() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ OrderSummaryDetails(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28042newBuilder();
    }

    public final String getRow_title() {
        return this.row_title;
    }

    public final String getRow_trailing_title() {
        return this.row_trailing_title;
    }

    public final String getRow_trailing_subtitle() {
        return this.row_trailing_subtitle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderSummaryDetails(String row_title, String row_trailing_title, String row_trailing_subtitle, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(row_title, "row_title");
        Intrinsics.checkNotNullParameter(row_trailing_title, "row_trailing_title");
        Intrinsics.checkNotNullParameter(row_trailing_subtitle, "row_trailing_subtitle");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.row_title = row_title;
        this.row_trailing_title = row_trailing_title;
        this.row_trailing_subtitle = row_trailing_subtitle;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28042newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderSummaryDetails)) {
            return false;
        }
        OrderSummaryDetails orderSummaryDetails = (OrderSummaryDetails) other;
        return Intrinsics.areEqual(unknownFields(), orderSummaryDetails.unknownFields()) && Intrinsics.areEqual(this.row_title, orderSummaryDetails.row_title) && Intrinsics.areEqual(this.row_trailing_title, orderSummaryDetails.row_trailing_title) && Intrinsics.areEqual(this.row_trailing_subtitle, orderSummaryDetails.row_trailing_subtitle);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.row_title.hashCode()) * 37) + this.row_trailing_title.hashCode()) * 37) + this.row_trailing_subtitle.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("row_title=" + Internal.sanitize(this.row_title));
        arrayList.add("row_trailing_title=" + Internal.sanitize(this.row_trailing_title));
        arrayList.add("row_trailing_subtitle=" + Internal.sanitize(this.row_trailing_subtitle));
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderSummaryDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderSummaryDetails copy$default(OrderSummaryDetails orderSummaryDetails, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderSummaryDetails.row_title;
        }
        if ((i & 2) != 0) {
            str2 = orderSummaryDetails.row_trailing_title;
        }
        if ((i & 4) != 0) {
            str3 = orderSummaryDetails.row_trailing_subtitle;
        }
        if ((i & 8) != 0) {
            byteString = orderSummaryDetails.unknownFields();
        }
        return orderSummaryDetails.copy(str, str2, str3, byteString);
    }

    public final OrderSummaryDetails copy(String row_title, String row_trailing_title, String row_trailing_subtitle, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(row_title, "row_title");
        Intrinsics.checkNotNullParameter(row_trailing_title, "row_trailing_title");
        Intrinsics.checkNotNullParameter(row_trailing_subtitle, "row_trailing_subtitle");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderSummaryDetails(row_title, row_trailing_title, row_trailing_subtitle, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderSummaryDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderSummaryDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.OrderSummaryDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderSummaryDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRow_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRow_title());
                }
                if (!Intrinsics.areEqual(value.getRow_trailing_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRow_trailing_title());
                }
                return !Intrinsics.areEqual(value.getRow_trailing_subtitle(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRow_trailing_subtitle()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderSummaryDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRow_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRow_title());
                }
                if (!Intrinsics.areEqual(value.getRow_trailing_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRow_trailing_title());
                }
                if (!Intrinsics.areEqual(value.getRow_trailing_subtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRow_trailing_subtitle());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderSummaryDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRow_trailing_subtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRow_trailing_subtitle());
                }
                if (!Intrinsics.areEqual(value.getRow_trailing_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRow_trailing_title());
                }
                if (Intrinsics.areEqual(value.getRow_title(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRow_title());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderSummaryDetails redact(OrderSummaryDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OrderSummaryDetails.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderSummaryDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OrderSummaryDetails(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
        };
    }
}

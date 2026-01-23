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
import crypto_perpetuals.order.p438v1.OrderDetails;
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

/* compiled from: ListOrderResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B-\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J,\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ListOrderResponse;", "Lcom/squareup/wire/Message;", "", "orders", "", "Lcrypto_perpetuals/order/v1/OrderDetails;", "next_token", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getNext_token", "()Ljava/lang/String;", "getOrders", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ListOrderResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ListOrderResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nextToken", schemaIndex = 1, tag = 2)
    private final String next_token;

    @WireField(adapter = "crypto_perpetuals.order.v1.OrderDetails#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<OrderDetails> orders;

    public ListOrderResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27886newBuilder();
    }

    public /* synthetic */ ListOrderResponse(List list, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getNext_token() {
        return this.next_token;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListOrderResponse(List<OrderDetails> orders, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.next_token = str;
        this.orders = Internal.immutableCopyOf("orders", orders);
    }

    public final List<OrderDetails> getOrders() {
        return this.orders;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27886newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListOrderResponse)) {
            return false;
        }
        ListOrderResponse listOrderResponse = (ListOrderResponse) other;
        return Intrinsics.areEqual(unknownFields(), listOrderResponse.unknownFields()) && Intrinsics.areEqual(this.orders, listOrderResponse.orders) && Intrinsics.areEqual(this.next_token, listOrderResponse.next_token);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.orders.hashCode()) * 37;
        String str = this.next_token;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.orders.isEmpty()) {
            arrayList.add("orders=" + this.orders);
        }
        String str = this.next_token;
        if (str != null) {
            arrayList.add("next_token=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListOrderResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListOrderResponse copy$default(ListOrderResponse listOrderResponse, List list, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listOrderResponse.orders;
        }
        if ((i & 2) != 0) {
            str = listOrderResponse.next_token;
        }
        if ((i & 4) != 0) {
            byteString = listOrderResponse.unknownFields();
        }
        return listOrderResponse.copy(list, str, byteString);
    }

    public final ListOrderResponse copy(List<OrderDetails> orders, String next_token, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListOrderResponse(orders, next_token, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListOrderResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListOrderResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.service.v1.ListOrderResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListOrderResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + OrderDetails.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getOrders()) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNext_token());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListOrderResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                OrderDetails.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getOrders());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNext_token());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListOrderResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNext_token());
                OrderDetails.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getOrders());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ListOrderResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ListOrderResponse(arrayList, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(OrderDetails.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListOrderResponse redact(ListOrderResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ListOrderResponse.copy$default(value, Internal.m26823redactElements(value.getOrders(), OrderDetails.ADAPTER), null, ByteString.EMPTY, 2, null);
            }
        };
    }
}

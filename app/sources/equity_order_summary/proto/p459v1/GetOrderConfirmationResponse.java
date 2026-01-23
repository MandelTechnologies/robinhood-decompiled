package equity_order_summary.proto.p459v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import equity_order_summary.proto.p459v1.GetOrderConfirmationResponse;
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

/* compiled from: GetOrderConfirmationResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lequity_order_summary/proto/v1/GetOrderConfirmationResponse;", "Lcom/squareup/wire/Message;", "", "order_confirmation_result", "Lequity_order_summary/proto/v1/GetOrderConfirmationResponse$OrderConfirmationResult;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lequity_order_summary/proto/v1/GetOrderConfirmationResponse$OrderConfirmationResult;Lokio/ByteString;)V", "getOrder_confirmation_result", "()Lequity_order_summary/proto/v1/GetOrderConfirmationResponse$OrderConfirmationResult;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "OrderConfirmationResult", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GetOrderConfirmationResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetOrderConfirmationResponse> ADAPTER;

    @WireField(adapter = "equity_order_summary.proto.v1.GetOrderConfirmationResponse$OrderConfirmationResult#ADAPTER", jsonName = "orderConfirmationResult", schemaIndex = 0, tag = 1)
    private final OrderConfirmationResult order_confirmation_result;

    /* JADX WARN: Multi-variable type inference failed */
    public GetOrderConfirmationResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28016newBuilder();
    }

    public final OrderConfirmationResult getOrder_confirmation_result() {
        return this.order_confirmation_result;
    }

    public /* synthetic */ GetOrderConfirmationResponse(OrderConfirmationResult orderConfirmationResult, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderConfirmationResult, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrderConfirmationResponse(OrderConfirmationResult orderConfirmationResult, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_confirmation_result = orderConfirmationResult;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28016newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetOrderConfirmationResponse)) {
            return false;
        }
        GetOrderConfirmationResponse getOrderConfirmationResponse = (GetOrderConfirmationResponse) other;
        return Intrinsics.areEqual(unknownFields(), getOrderConfirmationResponse.unknownFields()) && Intrinsics.areEqual(this.order_confirmation_result, getOrderConfirmationResponse.order_confirmation_result);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        OrderConfirmationResult orderConfirmationResult = this.order_confirmation_result;
        int iHashCode2 = iHashCode + (orderConfirmationResult != null ? orderConfirmationResult.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        OrderConfirmationResult orderConfirmationResult = this.order_confirmation_result;
        if (orderConfirmationResult != null) {
            arrayList.add("order_confirmation_result=" + orderConfirmationResult);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetOrderConfirmationResponse{", "}", 0, null, null, 56, null);
    }

    public final GetOrderConfirmationResponse copy(OrderConfirmationResult order_confirmation_result, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetOrderConfirmationResponse(order_confirmation_result, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetOrderConfirmationResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetOrderConfirmationResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_order_summary.proto.v1.GetOrderConfirmationResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetOrderConfirmationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + GetOrderConfirmationResponse.OrderConfirmationResult.ADAPTER.encodedSizeWithTag(1, value.getOrder_confirmation_result());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetOrderConfirmationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                GetOrderConfirmationResponse.OrderConfirmationResult.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_confirmation_result());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetOrderConfirmationResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                GetOrderConfirmationResponse.OrderConfirmationResult.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_confirmation_result());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetOrderConfirmationResponse redact(GetOrderConfirmationResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GetOrderConfirmationResponse.OrderConfirmationResult order_confirmation_result = value.getOrder_confirmation_result();
                return value.copy(order_confirmation_result != null ? GetOrderConfirmationResponse.OrderConfirmationResult.ADAPTER.redact(order_confirmation_result) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetOrderConfirmationResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                GetOrderConfirmationResponse.OrderConfirmationResult orderConfirmationResultDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetOrderConfirmationResponse(orderConfirmationResultDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        orderConfirmationResultDecode = GetOrderConfirmationResponse.OrderConfirmationResult.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: GetOrderConfirmationResponse.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lequity_order_summary/proto/v1/GetOrderConfirmationResponse$OrderConfirmationResult;", "Lcom/squareup/wire/Message;", "", "confirmation_title_string", "", "confirmation_description_string", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getConfirmation_title_string", "()Ljava/lang/String;", "getConfirmation_description_string", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderConfirmationResult extends Message {

        @JvmField
        public static final ProtoAdapter<OrderConfirmationResult> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "confirmationDescriptionString", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String confirmation_description_string;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "confirmationTitleString", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String confirmation_title_string;

        public OrderConfirmationResult() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ OrderConfirmationResult(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28017newBuilder();
        }

        public final String getConfirmation_title_string() {
            return this.confirmation_title_string;
        }

        public final String getConfirmation_description_string() {
            return this.confirmation_description_string;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderConfirmationResult(String confirmation_title_string, String confirmation_description_string, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(confirmation_title_string, "confirmation_title_string");
            Intrinsics.checkNotNullParameter(confirmation_description_string, "confirmation_description_string");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.confirmation_title_string = confirmation_title_string;
            this.confirmation_description_string = confirmation_description_string;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28017newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OrderConfirmationResult)) {
                return false;
            }
            OrderConfirmationResult orderConfirmationResult = (OrderConfirmationResult) other;
            return Intrinsics.areEqual(unknownFields(), orderConfirmationResult.unknownFields()) && Intrinsics.areEqual(this.confirmation_title_string, orderConfirmationResult.confirmation_title_string) && Intrinsics.areEqual(this.confirmation_description_string, orderConfirmationResult.confirmation_description_string);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.confirmation_title_string.hashCode()) * 37) + this.confirmation_description_string.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("confirmation_title_string=" + Internal.sanitize(this.confirmation_title_string));
            arrayList.add("confirmation_description_string=" + Internal.sanitize(this.confirmation_description_string));
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderConfirmationResult{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ OrderConfirmationResult copy$default(OrderConfirmationResult orderConfirmationResult, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = orderConfirmationResult.confirmation_title_string;
            }
            if ((i & 2) != 0) {
                str2 = orderConfirmationResult.confirmation_description_string;
            }
            if ((i & 4) != 0) {
                byteString = orderConfirmationResult.unknownFields();
            }
            return orderConfirmationResult.copy(str, str2, byteString);
        }

        public final OrderConfirmationResult copy(String confirmation_title_string, String confirmation_description_string, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(confirmation_title_string, "confirmation_title_string");
            Intrinsics.checkNotNullParameter(confirmation_description_string, "confirmation_description_string");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new OrderConfirmationResult(confirmation_title_string, confirmation_description_string, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderConfirmationResult.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<OrderConfirmationResult>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_order_summary.proto.v1.GetOrderConfirmationResponse$OrderConfirmationResult$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetOrderConfirmationResponse.OrderConfirmationResult value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getConfirmation_title_string(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getConfirmation_title_string());
                    }
                    return !Intrinsics.areEqual(value.getConfirmation_description_string(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getConfirmation_description_string()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetOrderConfirmationResponse.OrderConfirmationResult value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getConfirmation_title_string(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getConfirmation_title_string());
                    }
                    if (!Intrinsics.areEqual(value.getConfirmation_description_string(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getConfirmation_description_string());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetOrderConfirmationResponse.OrderConfirmationResult value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getConfirmation_description_string(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getConfirmation_description_string());
                    }
                    if (Intrinsics.areEqual(value.getConfirmation_title_string(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getConfirmation_title_string());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetOrderConfirmationResponse.OrderConfirmationResult redact(GetOrderConfirmationResponse.OrderConfirmationResult value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return GetOrderConfirmationResponse.OrderConfirmationResult.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GetOrderConfirmationResponse.OrderConfirmationResult decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetOrderConfirmationResponse.OrderConfirmationResult(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
}

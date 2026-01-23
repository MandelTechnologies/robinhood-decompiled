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

/* compiled from: RequestNextPageInTaxLotsRequest.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u001cR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/RequestNextPageInTaxLotsRequest;", "Lcom/squareup/wire/Message;", "", "order_id", "", "instrument_id", "page_number", "", "rhs_account_number", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "getInstrument_id", "getPage_number", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRhs_account_number", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)Lequity_trading_tax_lots/proto/v1/RequestNextPageInTaxLotsRequest;", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RequestNextPageInTaxLotsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<RequestNextPageInTaxLotsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageNumber", schemaIndex = 2, tag = 3)
    private final Integer page_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String rhs_account_number;

    public RequestNextPageInTaxLotsRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ RequestNextPageInTaxLotsRequest(String str, String str2, Integer num, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28043newBuilder();
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final Integer getPage_number() {
        return this.page_number;
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestNextPageInTaxLotsRequest(String order_id, String instrument_id, Integer num, String rhs_account_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.instrument_id = instrument_id;
        this.page_number = num;
        this.rhs_account_number = rhs_account_number;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28043newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RequestNextPageInTaxLotsRequest)) {
            return false;
        }
        RequestNextPageInTaxLotsRequest requestNextPageInTaxLotsRequest = (RequestNextPageInTaxLotsRequest) other;
        return Intrinsics.areEqual(unknownFields(), requestNextPageInTaxLotsRequest.unknownFields()) && Intrinsics.areEqual(this.order_id, requestNextPageInTaxLotsRequest.order_id) && Intrinsics.areEqual(this.instrument_id, requestNextPageInTaxLotsRequest.instrument_id) && Intrinsics.areEqual(this.page_number, requestNextPageInTaxLotsRequest.page_number) && Intrinsics.areEqual(this.rhs_account_number, requestNextPageInTaxLotsRequest.rhs_account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.order_id.hashCode()) * 37) + this.instrument_id.hashCode()) * 37;
        Integer num = this.page_number;
        int iHashCode2 = ((iHashCode + (num != null ? num.hashCode() : 0)) * 37) + this.rhs_account_number.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        Integer num = this.page_number;
        if (num != null) {
            arrayList.add("page_number=" + num);
        }
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        return CollectionsKt.joinToString$default(arrayList, ", ", "RequestNextPageInTaxLotsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RequestNextPageInTaxLotsRequest copy$default(RequestNextPageInTaxLotsRequest requestNextPageInTaxLotsRequest, String str, String str2, Integer num, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestNextPageInTaxLotsRequest.order_id;
        }
        if ((i & 2) != 0) {
            str2 = requestNextPageInTaxLotsRequest.instrument_id;
        }
        if ((i & 4) != 0) {
            num = requestNextPageInTaxLotsRequest.page_number;
        }
        if ((i & 8) != 0) {
            str3 = requestNextPageInTaxLotsRequest.rhs_account_number;
        }
        if ((i & 16) != 0) {
            byteString = requestNextPageInTaxLotsRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        Integer num2 = num;
        return requestNextPageInTaxLotsRequest.copy(str, str2, num2, str3, byteString2);
    }

    public final RequestNextPageInTaxLotsRequest copy(String order_id, String instrument_id, Integer page_number, String rhs_account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RequestNextPageInTaxLotsRequest(order_id, instrument_id, page_number, rhs_account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RequestNextPageInTaxLotsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RequestNextPageInTaxLotsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_trading_tax_lots.proto.v1.RequestNextPageInTaxLotsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RequestNextPageInTaxLotsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getInstrument_id());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.INT32.encodedSizeWithTag(3, value.getPage_number());
                return !Intrinsics.areEqual(value.getRhs_account_number(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRhs_account_number()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RequestNextPageInTaxLotsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getPage_number());
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRhs_account_number());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RequestNextPageInTaxLotsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRhs_account_number());
                }
                ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getPage_number());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (Intrinsics.areEqual(value.getOrder_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RequestNextPageInTaxLotsRequest redact(RequestNextPageInTaxLotsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RequestNextPageInTaxLotsRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RequestNextPageInTaxLotsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                Integer numDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RequestNextPageInTaxLotsRequest(strDecode, strDecode3, numDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}

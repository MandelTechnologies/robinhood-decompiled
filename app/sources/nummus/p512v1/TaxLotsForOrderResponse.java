package nummus.p512v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: TaxLotsForOrderResponse.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016JX\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, m3636d2 = {"Lnummus/v1/TaxLotsForOrderResponse;", "Lcom/squareup/wire/Message;", "", "order_id", "", "is_confirmed", "", "total_gain_loss_amount", "order_tax_lot_details", "", "Lnummus/v1/OrderTaxLotDetail;", "next", "previous", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "()Z", "getTotal_gain_loss_amount", "getNext", "getPrevious", "getOrder_tax_lot_details", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TaxLotsForOrderResponse extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLotsForOrderResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isConfirmed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_confirmed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String next;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_id;

    @WireField(adapter = "nummus.v1.OrderTaxLotDetail#ADAPTER", jsonName = "orderTaxLotDetails", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<OrderTaxLotDetail> order_tax_lot_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final String previous;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalGainLossAmount", schemaIndex = 2, tag = 3)
    private final String total_gain_loss_amount;

    public TaxLotsForOrderResponse() {
        this(null, false, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29439newBuilder();
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public /* synthetic */ TaxLotsForOrderResponse(String str, boolean z, String str2, List list, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* renamed from: is_confirmed, reason: from getter */
    public final boolean getIs_confirmed() {
        return this.is_confirmed;
    }

    public final String getTotal_gain_loss_amount() {
        return this.total_gain_loss_amount;
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrevious() {
        return this.previous;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLotsForOrderResponse(String order_id, boolean z, String str, List<OrderTaxLotDetail> order_tax_lot_details, String str2, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_tax_lot_details, "order_tax_lot_details");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.is_confirmed = z;
        this.total_gain_loss_amount = str;
        this.next = str2;
        this.previous = str3;
        this.order_tax_lot_details = Internal.immutableCopyOf("order_tax_lot_details", order_tax_lot_details);
    }

    public final List<OrderTaxLotDetail> getOrder_tax_lot_details() {
        return this.order_tax_lot_details;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29439newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLotsForOrderResponse)) {
            return false;
        }
        TaxLotsForOrderResponse taxLotsForOrderResponse = (TaxLotsForOrderResponse) other;
        return Intrinsics.areEqual(unknownFields(), taxLotsForOrderResponse.unknownFields()) && Intrinsics.areEqual(this.order_id, taxLotsForOrderResponse.order_id) && this.is_confirmed == taxLotsForOrderResponse.is_confirmed && Intrinsics.areEqual(this.total_gain_loss_amount, taxLotsForOrderResponse.total_gain_loss_amount) && Intrinsics.areEqual(this.order_tax_lot_details, taxLotsForOrderResponse.order_tax_lot_details) && Intrinsics.areEqual(this.next, taxLotsForOrderResponse.next) && Intrinsics.areEqual(this.previous, taxLotsForOrderResponse.previous);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.order_id.hashCode()) * 37) + Boolean.hashCode(this.is_confirmed)) * 37;
        String str = this.total_gain_loss_amount;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.order_tax_lot_details.hashCode()) * 37;
        String str2 = this.next;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.previous;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("is_confirmed=" + this.is_confirmed);
        String str = this.total_gain_loss_amount;
        if (str != null) {
            arrayList.add("total_gain_loss_amount=" + Internal.sanitize(str));
        }
        if (!this.order_tax_lot_details.isEmpty()) {
            arrayList.add("order_tax_lot_details=" + this.order_tax_lot_details);
        }
        String str2 = this.next;
        if (str2 != null) {
            arrayList.add("next=" + Internal.sanitize(str2));
        }
        String str3 = this.previous;
        if (str3 != null) {
            arrayList.add("previous=" + Internal.sanitize(str3));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLotsForOrderResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLotsForOrderResponse copy$default(TaxLotsForOrderResponse taxLotsForOrderResponse, String str, boolean z, String str2, List list, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLotsForOrderResponse.order_id;
        }
        if ((i & 2) != 0) {
            z = taxLotsForOrderResponse.is_confirmed;
        }
        if ((i & 4) != 0) {
            str2 = taxLotsForOrderResponse.total_gain_loss_amount;
        }
        if ((i & 8) != 0) {
            list = taxLotsForOrderResponse.order_tax_lot_details;
        }
        if ((i & 16) != 0) {
            str3 = taxLotsForOrderResponse.next;
        }
        if ((i & 32) != 0) {
            str4 = taxLotsForOrderResponse.previous;
        }
        if ((i & 64) != 0) {
            byteString = taxLotsForOrderResponse.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        String str6 = str3;
        String str7 = str2;
        return taxLotsForOrderResponse.copy(str, z, str7, list, str6, str5, byteString2);
    }

    public final TaxLotsForOrderResponse copy(String order_id, boolean is_confirmed, String total_gain_loss_amount, List<OrderTaxLotDetail> order_tax_lot_details, String next, String previous, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_tax_lot_details, "order_tax_lot_details");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLotsForOrderResponse(order_id, is_confirmed, total_gain_loss_amount, order_tax_lot_details, next, previous, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotsForOrderResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLotsForOrderResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.TaxLotsForOrderResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLotsForOrderResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (value.getIs_confirmed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_confirmed()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(3, value.getTotal_gain_loss_amount()) + OrderTaxLotDetail.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getOrder_tax_lot_details()) + protoAdapter.encodedSizeWithTag(5, value.getNext()) + protoAdapter.encodedSizeWithTag(6, value.getPrevious());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLotsForOrderResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (value.getIs_confirmed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_confirmed()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getTotal_gain_loss_amount());
                OrderTaxLotDetail.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getOrder_tax_lot_details());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getNext());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getPrevious());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLotsForOrderResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getPrevious());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getNext());
                OrderTaxLotDetail.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getOrder_tax_lot_details());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getTotal_gain_loss_amount());
                if (value.getIs_confirmed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_confirmed()));
                }
                if (Intrinsics.areEqual(value.getOrder_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getOrder_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotsForOrderResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                arrayList.add(OrderTaxLotDetail.ADAPTER.decode(reader));
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new TaxLotsForOrderResponse(strDecode, zBooleanValue, strDecode2, arrayList, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotsForOrderResponse redact(TaxLotsForOrderResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TaxLotsForOrderResponse.copy$default(value, null, false, null, Internal.m26823redactElements(value.getOrder_tax_lot_details(), OrderTaxLotDetail.ADAPTER), null, null, ByteString.EMPTY, 55, null);
            }
        };
    }
}

package nummus.p512v1;

import cbc.service.p048v1.TermType;
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
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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

/* compiled from: OrderTaxLotDetail.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JP\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006!"}, m3636d2 = {"Lnummus/v1/OrderTaxLotDetail;", "Lcom/squareup/wire/Message;", "", InquiryField.DateField.TYPE, "", "term_type", "Lcbc/service/v1/TermType;", "cost_per_unit", "gain_loss", "quantity", "id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcbc/service/v1/TermType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getDate", "()Ljava/lang/String;", "getTerm_type", "()Lcbc/service/v1/TermType;", "getCost_per_unit", "getGain_loss", "getQuantity", "getId", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class OrderTaxLotDetail extends Message {

    @JvmField
    public static final ProtoAdapter<OrderTaxLotDetail> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "costPerUnit", schemaIndex = 2, tag = 3)
    private final String cost_per_unit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "gainLoss", schemaIndex = 3, tag = 4)
    private final String gain_loss;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String quantity;

    @WireField(adapter = "cbc.service.v1.TermType#ADAPTER", jsonName = "termType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TermType term_type;

    public OrderTaxLotDetail() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ OrderTaxLotDetail(String str, TermType termType, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TermType.TERM_TYPE_UNSPECIFIED : termType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29435newBuilder();
    }

    public final String getDate() {
        return this.date;
    }

    public final TermType getTerm_type() {
        return this.term_type;
    }

    public final String getCost_per_unit() {
        return this.cost_per_unit;
    }

    public final String getGain_loss() {
        return this.gain_loss;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTaxLotDetail(String date, TermType term_type, String str, String str2, String quantity, String id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(term_type, "term_type");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.date = date;
        this.term_type = term_type;
        this.cost_per_unit = str;
        this.gain_loss = str2;
        this.quantity = quantity;
        this.id = id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29435newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderTaxLotDetail)) {
            return false;
        }
        OrderTaxLotDetail orderTaxLotDetail = (OrderTaxLotDetail) other;
        return Intrinsics.areEqual(unknownFields(), orderTaxLotDetail.unknownFields()) && Intrinsics.areEqual(this.date, orderTaxLotDetail.date) && this.term_type == orderTaxLotDetail.term_type && Intrinsics.areEqual(this.cost_per_unit, orderTaxLotDetail.cost_per_unit) && Intrinsics.areEqual(this.gain_loss, orderTaxLotDetail.gain_loss) && Intrinsics.areEqual(this.quantity, orderTaxLotDetail.quantity) && Intrinsics.areEqual(this.id, orderTaxLotDetail.id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.date.hashCode()) * 37) + this.term_type.hashCode()) * 37;
        String str = this.cost_per_unit;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.gain_loss;
        int iHashCode3 = ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.quantity.hashCode()) * 37) + this.id.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("date=" + Internal.sanitize(this.date));
        arrayList.add("term_type=" + this.term_type);
        String str = this.cost_per_unit;
        if (str != null) {
            arrayList.add("cost_per_unit=" + Internal.sanitize(str));
        }
        String str2 = this.gain_loss;
        if (str2 != null) {
            arrayList.add("gain_loss=" + Internal.sanitize(str2));
        }
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("id=" + Internal.sanitize(this.id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderTaxLotDetail{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OrderTaxLotDetail copy$default(OrderTaxLotDetail orderTaxLotDetail, String str, TermType termType, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderTaxLotDetail.date;
        }
        if ((i & 2) != 0) {
            termType = orderTaxLotDetail.term_type;
        }
        if ((i & 4) != 0) {
            str2 = orderTaxLotDetail.cost_per_unit;
        }
        if ((i & 8) != 0) {
            str3 = orderTaxLotDetail.gain_loss;
        }
        if ((i & 16) != 0) {
            str4 = orderTaxLotDetail.quantity;
        }
        if ((i & 32) != 0) {
            str5 = orderTaxLotDetail.id;
        }
        if ((i & 64) != 0) {
            byteString = orderTaxLotDetail.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str4;
        String str8 = str2;
        return orderTaxLotDetail.copy(str, termType, str8, str3, str7, str6, byteString2);
    }

    public final OrderTaxLotDetail copy(String date, TermType term_type, String cost_per_unit, String gain_loss, String quantity, String id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(term_type, "term_type");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderTaxLotDetail(date, term_type, cost_per_unit, gain_loss, quantity, id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderTaxLotDetail.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderTaxLotDetail>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.OrderTaxLotDetail$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderTaxLotDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDate());
                }
                if (value.getTerm_type() != TermType.TERM_TYPE_UNSPECIFIED) {
                    size += TermType.ADAPTER.encodedSizeWithTag(2, value.getTerm_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getCost_per_unit()) + protoAdapter.encodedSizeWithTag(4, value.getGain_loss());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getQuantity());
                }
                return !Intrinsics.areEqual(value.getId(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(6, value.getId()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderTaxLotDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDate());
                }
                if (value.getTerm_type() != TermType.TERM_TYPE_UNSPECIFIED) {
                    TermType.ADAPTER.encodeWithTag(writer, 2, (int) value.getTerm_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getCost_per_unit());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getGain_loss());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getId());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderTaxLotDetail value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getQuantity());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getGain_loss());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getCost_per_unit());
                if (value.getTerm_type() != TermType.TERM_TYPE_UNSPECIFIED) {
                    TermType.ADAPTER.encodeWithTag(writer, 2, (int) value.getTerm_type());
                }
                if (Intrinsics.areEqual(value.getDate(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getDate());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderTaxLotDetail decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TermType termType = TermType.TERM_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = null;
                String strDecode4 = null;
                TermType termTypeDecode = termType;
                String strDecode5 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                try {
                                    termTypeDecode = TermType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new OrderTaxLotDetail(strDecode5, termTypeDecode, strDecode3, strDecode4, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderTaxLotDetail redact(OrderTaxLotDetail value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OrderTaxLotDetail.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}

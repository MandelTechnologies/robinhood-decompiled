package nummus.p512v1;

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
import p479j$.time.Instant;

/* compiled from: CreateCostBasisLotRequest.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,Be\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJk\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\u001dR\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b'\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b(\u0010\u001dR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, m3636d2 = {"Lnummus/v1/CreateCostBasisLotRequest;", "Lcom/squareup/wire/Message;", "", "", "account_id", "source_id", "source_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "acquisition_date", "quantity", "total_cost_basis_fiat", "", "validation_only", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)Lnummus/v1/CreateCostBasisLotRequest;", "Ljava/lang/String;", "getAccount_id", "getSource_id", "getSource_type", "Lj$/time/Instant;", "getAcquisition_date", "()Lj$/time/Instant;", "getQuantity", "getTotal_cost_basis_fiat", "Ljava/util/List;", "getValidation_only", "()Ljava/util/List;", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CreateCostBasisLotRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreateCostBasisLotRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "acquisitionDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant acquisition_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String source_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String source_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "totalCostBasisFiat", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String total_cost_basis_fiat;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "validationOnly", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<String> validation_only;

    public CreateCostBasisLotRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ CreateCostBasisLotRequest(String str, String str2, String str3, Instant instant, String str4, String str5, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29412newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getSource_id() {
        return this.source_id;
    }

    public final String getSource_type() {
        return this.source_type;
    }

    public final Instant getAcquisition_date() {
        return this.acquisition_date;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getTotal_cost_basis_fiat() {
        return this.total_cost_basis_fiat;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCostBasisLotRequest(String account_id, String source_id, String source_type, Instant instant, String quantity, String total_cost_basis_fiat, List<String> validation_only, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(total_cost_basis_fiat, "total_cost_basis_fiat");
        Intrinsics.checkNotNullParameter(validation_only, "validation_only");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.source_id = source_id;
        this.source_type = source_type;
        this.acquisition_date = instant;
        this.quantity = quantity;
        this.total_cost_basis_fiat = total_cost_basis_fiat;
        this.validation_only = Internal.immutableCopyOf("validation_only", validation_only);
    }

    public final List<String> getValidation_only() {
        return this.validation_only;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29412newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateCostBasisLotRequest)) {
            return false;
        }
        CreateCostBasisLotRequest createCostBasisLotRequest = (CreateCostBasisLotRequest) other;
        return Intrinsics.areEqual(unknownFields(), createCostBasisLotRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, createCostBasisLotRequest.account_id) && Intrinsics.areEqual(this.source_id, createCostBasisLotRequest.source_id) && Intrinsics.areEqual(this.source_type, createCostBasisLotRequest.source_type) && Intrinsics.areEqual(this.acquisition_date, createCostBasisLotRequest.acquisition_date) && Intrinsics.areEqual(this.quantity, createCostBasisLotRequest.quantity) && Intrinsics.areEqual(this.total_cost_basis_fiat, createCostBasisLotRequest.total_cost_basis_fiat) && Intrinsics.areEqual(this.validation_only, createCostBasisLotRequest.validation_only);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.source_id.hashCode()) * 37) + this.source_type.hashCode()) * 37;
        Instant instant = this.acquisition_date;
        int iHashCode2 = ((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.quantity.hashCode()) * 37) + this.total_cost_basis_fiat.hashCode()) * 37) + this.validation_only.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("source_id=" + Internal.sanitize(this.source_id));
        arrayList.add("source_type=" + Internal.sanitize(this.source_type));
        Instant instant = this.acquisition_date;
        if (instant != null) {
            arrayList.add("acquisition_date=" + instant);
        }
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("total_cost_basis_fiat=" + Internal.sanitize(this.total_cost_basis_fiat));
        if (!this.validation_only.isEmpty()) {
            arrayList.add("validation_only=" + Internal.sanitize(this.validation_only));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateCostBasisLotRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateCostBasisLotRequest copy$default(CreateCostBasisLotRequest createCostBasisLotRequest, String str, String str2, String str3, Instant instant, String str4, String str5, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createCostBasisLotRequest.account_id;
        }
        if ((i & 2) != 0) {
            str2 = createCostBasisLotRequest.source_id;
        }
        if ((i & 4) != 0) {
            str3 = createCostBasisLotRequest.source_type;
        }
        if ((i & 8) != 0) {
            instant = createCostBasisLotRequest.acquisition_date;
        }
        if ((i & 16) != 0) {
            str4 = createCostBasisLotRequest.quantity;
        }
        if ((i & 32) != 0) {
            str5 = createCostBasisLotRequest.total_cost_basis_fiat;
        }
        if ((i & 64) != 0) {
            list = createCostBasisLotRequest.validation_only;
        }
        if ((i & 128) != 0) {
            byteString = createCostBasisLotRequest.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        String str6 = str4;
        String str7 = str5;
        return createCostBasisLotRequest.copy(str, str2, str3, instant, str6, str7, list2, byteString2);
    }

    public final CreateCostBasisLotRequest copy(String account_id, String source_id, String source_type, Instant acquisition_date, String quantity, String total_cost_basis_fiat, List<String> validation_only, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(total_cost_basis_fiat, "total_cost_basis_fiat");
        Intrinsics.checkNotNullParameter(validation_only, "validation_only");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateCostBasisLotRequest(account_id, source_id, source_type, acquisition_date, quantity, total_cost_basis_fiat, validation_only, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateCostBasisLotRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateCostBasisLotRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.CreateCostBasisLotRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateCostBasisLotRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getSource_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSource_id());
                }
                if (!Intrinsics.areEqual(value.getSource_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSource_type());
                }
                if (value.getAcquisition_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getAcquisition_date());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getTotal_cost_basis_fiat(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getTotal_cost_basis_fiat());
                }
                return size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(7, value.getValidation_only());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateCostBasisLotRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getSource_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource_id());
                }
                if (!Intrinsics.areEqual(value.getSource_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSource_type());
                }
                if (value.getAcquisition_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getAcquisition_date());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getTotal_cost_basis_fiat(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTotal_cost_basis_fiat());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 7, (int) value.getValidation_only());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateCostBasisLotRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getValidation_only());
                if (!Intrinsics.areEqual(value.getTotal_cost_basis_fiat(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getTotal_cost_basis_fiat());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getQuantity());
                }
                if (value.getAcquisition_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getAcquisition_date());
                }
                if (!Intrinsics.areEqual(value.getSource_type(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getSource_type());
                }
                if (!Intrinsics.areEqual(value.getSource_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSource_id());
                }
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateCostBasisLotRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                Instant instantDecode = null;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CreateCostBasisLotRequest(strDecode, strDecode5, strDecode2, instantDecode, strDecode3, strDecode4, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateCostBasisLotRequest redact(CreateCostBasisLotRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant acquisition_date = value.getAcquisition_date();
                return CreateCostBasisLotRequest.copy$default(value, null, null, null, acquisition_date != null ? ProtoAdapter.INSTANT.redact(acquisition_date) : null, null, null, null, ByteString.EMPTY, 119, null);
            }
        };
    }
}

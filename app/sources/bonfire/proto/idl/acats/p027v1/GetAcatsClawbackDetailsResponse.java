package bonfire.proto.idl.acats.p027v1;

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

/* compiled from: GetAcatsClawbackDetailsResponse.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JS\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\"R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/GetAcatsClawbackDetailsResponse;", "Lcom/squareup/wire/Message;", "", "clawback_id", "", "account_number", "transfer_amount", "", "title", "rows", "", "Lbonfire/proto/idl/acats/v1/AcatsClawbackDetailsRow;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getClawback_id", "()Ljava/lang/String;", "getAccount_number", "getTransfer_amount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTitle", "getRows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)Lbonfire/proto/idl/acats/v1/GetAcatsClawbackDetailsResponse;", "Companion", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetAcatsClawbackDetailsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAcatsClawbackDetailsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clawbackId", schemaIndex = 0, tag = 1)
    private final String clawback_id;

    @WireField(adapter = "bonfire.proto.idl.acats.v1.AcatsClawbackDetailsRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<AcatsClawbackDetailsRow> rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "transferAmount", schemaIndex = 2, tag = 3)
    private final Double transfer_amount;

    public GetAcatsClawbackDetailsResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8701newBuilder();
    }

    public final String getClawback_id() {
        return this.clawback_id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final Double getTransfer_amount() {
        return this.transfer_amount;
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ GetAcatsClawbackDetailsResponse(String str, String str2, Double d, String str3, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAcatsClawbackDetailsResponse(String str, String str2, Double d, String title, List<AcatsClawbackDetailsRow> rows, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.clawback_id = str;
        this.account_number = str2;
        this.transfer_amount = d;
        this.title = title;
        this.rows = Internal.immutableCopyOf("rows", rows);
    }

    public final List<AcatsClawbackDetailsRow> getRows() {
        return this.rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8701newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAcatsClawbackDetailsResponse)) {
            return false;
        }
        GetAcatsClawbackDetailsResponse getAcatsClawbackDetailsResponse = (GetAcatsClawbackDetailsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAcatsClawbackDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.clawback_id, getAcatsClawbackDetailsResponse.clawback_id) && Intrinsics.areEqual(this.account_number, getAcatsClawbackDetailsResponse.account_number) && Intrinsics.areEqual(this.transfer_amount, getAcatsClawbackDetailsResponse.transfer_amount) && Intrinsics.areEqual(this.title, getAcatsClawbackDetailsResponse.title) && Intrinsics.areEqual(this.rows, getAcatsClawbackDetailsResponse.rows);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.clawback_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.account_number;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Double d = this.transfer_amount;
        int iHashCode4 = ((((iHashCode3 + (d != null ? d.hashCode() : 0)) * 37) + this.title.hashCode()) * 37) + this.rows.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.clawback_id;
        if (str != null) {
            arrayList.add("clawback_id=" + Internal.sanitize(str));
        }
        String str2 = this.account_number;
        if (str2 != null) {
            arrayList.add("account_number=" + Internal.sanitize(str2));
        }
        Double d = this.transfer_amount;
        if (d != null) {
            arrayList.add("transfer_amount=" + d);
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.rows.isEmpty()) {
            arrayList.add("rows=" + this.rows);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAcatsClawbackDetailsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAcatsClawbackDetailsResponse copy$default(GetAcatsClawbackDetailsResponse getAcatsClawbackDetailsResponse, String str, String str2, Double d, String str3, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAcatsClawbackDetailsResponse.clawback_id;
        }
        if ((i & 2) != 0) {
            str2 = getAcatsClawbackDetailsResponse.account_number;
        }
        if ((i & 4) != 0) {
            d = getAcatsClawbackDetailsResponse.transfer_amount;
        }
        if ((i & 8) != 0) {
            str3 = getAcatsClawbackDetailsResponse.title;
        }
        if ((i & 16) != 0) {
            list = getAcatsClawbackDetailsResponse.rows;
        }
        if ((i & 32) != 0) {
            byteString = getAcatsClawbackDetailsResponse.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        return getAcatsClawbackDetailsResponse.copy(str, str2, d, str3, list2, byteString2);
    }

    public final GetAcatsClawbackDetailsResponse copy(String clawback_id, String account_number, Double transfer_amount, String title, List<AcatsClawbackDetailsRow> rows, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAcatsClawbackDetailsResponse(clawback_id, account_number, transfer_amount, title, rows, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAcatsClawbackDetailsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAcatsClawbackDetailsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.acats.v1.GetAcatsClawbackDetailsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAcatsClawbackDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getClawback_id()) + protoAdapter.encodedSizeWithTag(2, value.getAccount_number()) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, value.getTransfer_amount());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getTitle());
                }
                return iEncodedSizeWithTag + AcatsClawbackDetailsRow.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getRows());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAcatsClawbackDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getClawback_id());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getAccount_number());
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) value.getTransfer_amount());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getTitle());
                }
                AcatsClawbackDetailsRow.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getRows());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAcatsClawbackDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AcatsClawbackDetailsRow.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getRows());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTitle());
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) value.getTransfer_amount());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getAccount_number());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getClawback_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAcatsClawbackDetailsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                Double dDecode = null;
                String strDecode2 = "";
                String strDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAcatsClawbackDetailsResponse(strDecode, strDecode3, dDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        dDecode = ProtoAdapter.DOUBLE.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        arrayList.add(AcatsClawbackDetailsRow.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAcatsClawbackDetailsResponse redact(GetAcatsClawbackDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAcatsClawbackDetailsResponse.copy$default(value, null, null, null, null, Internal.m26823redactElements(value.getRows(), AcatsClawbackDetailsRow.ADAPTER), ByteString.EMPTY, 15, null);
            }
        };
    }
}

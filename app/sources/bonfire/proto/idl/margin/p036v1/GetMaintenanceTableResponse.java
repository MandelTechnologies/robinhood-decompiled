package bonfire.proto.idl.margin.p036v1;

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
import rh_server_driven_ui.p531v1.UIComponent;

/* compiled from: GetMaintenanceTableResponse.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020\u0011H\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\u0093\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010+R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001e¨\u0006-"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponse;", "Lcom/squareup/wire/Message;", "", "account_number", "", "header", "", "Lrh_server_driven_ui/v1/UIComponent;", "rows", "Lbonfire/proto/idl/margin/v1/MarginTableRow;", "crypto_header", "crypto_rows", "columns", "Lbonfire/proto/idl/margin/v1/MarginTableColumn;", "sort_by", "sort_direction", "margin_health_state", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getSort_by", "getSort_direction", "getMargin_health_state", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeader", "()Ljava/util/List;", "getRows", "getCrypto_header", "getCrypto_rows", "getColumns", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lokio/ByteString;)Lbonfire/proto/idl/margin/v1/GetMaintenanceTableResponse;", "Companion", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetMaintenanceTableResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetMaintenanceTableResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "bonfire.proto.idl.margin.v1.MarginTableColumn#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<MarginTableColumn> columns;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", jsonName = "cryptoHeader", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<UIComponent> crypto_header;

    @WireField(adapter = "bonfire.proto.idl.margin.v1.MarginTableRow#ADAPTER", jsonName = "cryptoRows", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<MarginTableRow> crypto_rows;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<UIComponent> header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "marginHealthState", schemaIndex = 8, tag = 9)
    private final Integer margin_health_state;

    @WireField(adapter = "bonfire.proto.idl.margin.v1.MarginTableRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<MarginTableRow> rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sortBy", schemaIndex = 6, tag = 7)
    private final String sort_by;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sortDirection", schemaIndex = 7, tag = 8)
    private final String sort_direction;

    public GetMaintenanceTableResponse() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9003newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetMaintenanceTableResponse(String str, List list, List list2, List list3, List list4, List list5, String str2, String str3, Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? CollectionsKt.emptyList() : list4, (i & 32) != 0 ? CollectionsKt.emptyList() : list5, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : num, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getSort_by() {
        return this.sort_by;
    }

    public final String getSort_direction() {
        return this.sort_direction;
    }

    public final Integer getMargin_health_state() {
        return this.margin_health_state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMaintenanceTableResponse(String account_number, List<UIComponent> header, List<MarginTableRow> rows, List<UIComponent> crypto_header, List<MarginTableRow> crypto_rows, List<MarginTableColumn> columns, String str, String str2, Integer num, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(crypto_header, "crypto_header");
        Intrinsics.checkNotNullParameter(crypto_rows, "crypto_rows");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.sort_by = str;
        this.sort_direction = str2;
        this.margin_health_state = num;
        this.header = Internal.immutableCopyOf("header", header);
        this.rows = Internal.immutableCopyOf("rows", rows);
        this.crypto_header = Internal.immutableCopyOf("crypto_header", crypto_header);
        this.crypto_rows = Internal.immutableCopyOf("crypto_rows", crypto_rows);
        this.columns = Internal.immutableCopyOf("columns", columns);
    }

    public final List<UIComponent> getHeader() {
        return this.header;
    }

    public final List<MarginTableRow> getRows() {
        return this.rows;
    }

    public final List<UIComponent> getCrypto_header() {
        return this.crypto_header;
    }

    public final List<MarginTableRow> getCrypto_rows() {
        return this.crypto_rows;
    }

    public final List<MarginTableColumn> getColumns() {
        return this.columns;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9003newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetMaintenanceTableResponse)) {
            return false;
        }
        GetMaintenanceTableResponse getMaintenanceTableResponse = (GetMaintenanceTableResponse) other;
        return Intrinsics.areEqual(unknownFields(), getMaintenanceTableResponse.unknownFields()) && Intrinsics.areEqual(this.account_number, getMaintenanceTableResponse.account_number) && Intrinsics.areEqual(this.header, getMaintenanceTableResponse.header) && Intrinsics.areEqual(this.rows, getMaintenanceTableResponse.rows) && Intrinsics.areEqual(this.crypto_header, getMaintenanceTableResponse.crypto_header) && Intrinsics.areEqual(this.crypto_rows, getMaintenanceTableResponse.crypto_rows) && Intrinsics.areEqual(this.columns, getMaintenanceTableResponse.columns) && Intrinsics.areEqual(this.sort_by, getMaintenanceTableResponse.sort_by) && Intrinsics.areEqual(this.sort_direction, getMaintenanceTableResponse.sort_direction) && Intrinsics.areEqual(this.margin_health_state, getMaintenanceTableResponse.margin_health_state);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.header.hashCode()) * 37) + this.rows.hashCode()) * 37) + this.crypto_header.hashCode()) * 37) + this.crypto_rows.hashCode()) * 37) + this.columns.hashCode()) * 37;
        String str = this.sort_by;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.sort_direction;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.margin_health_state;
        int iHashCode4 = iHashCode3 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        if (!this.header.isEmpty()) {
            arrayList.add("header=" + this.header);
        }
        if (!this.rows.isEmpty()) {
            arrayList.add("rows=" + this.rows);
        }
        if (!this.crypto_header.isEmpty()) {
            arrayList.add("crypto_header=" + this.crypto_header);
        }
        if (!this.crypto_rows.isEmpty()) {
            arrayList.add("crypto_rows=" + this.crypto_rows);
        }
        if (!this.columns.isEmpty()) {
            arrayList.add("columns=" + this.columns);
        }
        String str = this.sort_by;
        if (str != null) {
            arrayList.add("sort_by=" + Internal.sanitize(str));
        }
        String str2 = this.sort_direction;
        if (str2 != null) {
            arrayList.add("sort_direction=" + Internal.sanitize(str2));
        }
        Integer num = this.margin_health_state;
        if (num != null) {
            arrayList.add("margin_health_state=" + num);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMaintenanceTableResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetMaintenanceTableResponse copy$default(GetMaintenanceTableResponse getMaintenanceTableResponse, String str, List list, List list2, List list3, List list4, List list5, String str2, String str3, Integer num, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getMaintenanceTableResponse.account_number;
        }
        if ((i & 2) != 0) {
            list = getMaintenanceTableResponse.header;
        }
        if ((i & 4) != 0) {
            list2 = getMaintenanceTableResponse.rows;
        }
        if ((i & 8) != 0) {
            list3 = getMaintenanceTableResponse.crypto_header;
        }
        if ((i & 16) != 0) {
            list4 = getMaintenanceTableResponse.crypto_rows;
        }
        if ((i & 32) != 0) {
            list5 = getMaintenanceTableResponse.columns;
        }
        if ((i & 64) != 0) {
            str2 = getMaintenanceTableResponse.sort_by;
        }
        if ((i & 128) != 0) {
            str3 = getMaintenanceTableResponse.sort_direction;
        }
        if ((i & 256) != 0) {
            num = getMaintenanceTableResponse.margin_health_state;
        }
        if ((i & 512) != 0) {
            byteString = getMaintenanceTableResponse.unknownFields();
        }
        Integer num2 = num;
        ByteString byteString2 = byteString;
        String str4 = str2;
        String str5 = str3;
        List list6 = list4;
        List list7 = list5;
        return getMaintenanceTableResponse.copy(str, list, list2, list3, list6, list7, str4, str5, num2, byteString2);
    }

    public final GetMaintenanceTableResponse copy(String account_number, List<UIComponent> header, List<MarginTableRow> rows, List<UIComponent> crypto_header, List<MarginTableRow> crypto_rows, List<MarginTableColumn> columns, String sort_by, String sort_direction, Integer margin_health_state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(crypto_header, "crypto_header");
        Intrinsics.checkNotNullParameter(crypto_rows, "crypto_rows");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetMaintenanceTableResponse(account_number, header, rows, crypto_header, crypto_rows, columns, sort_by, sort_direction, margin_health_state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetMaintenanceTableResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetMaintenanceTableResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.margin.v1.GetMaintenanceTableResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetMaintenanceTableResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getHeader());
                ProtoAdapter<MarginTableRow> protoAdapter2 = MarginTableRow.ADAPTER;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(3, value.getRows()) + protoAdapter.asRepeated().encodedSizeWithTag(4, value.getCrypto_header()) + protoAdapter2.asRepeated().encodedSizeWithTag(5, value.getCrypto_rows()) + MarginTableColumn.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getColumns());
                ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
                return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, value.getSort_by()) + protoAdapter3.encodedSizeWithTag(8, value.getSort_direction()) + ProtoAdapter.INT32.encodedSizeWithTag(9, value.getMargin_health_state());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetMaintenanceTableResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getHeader());
                ProtoAdapter<MarginTableRow> protoAdapter2 = MarginTableRow.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(writer, 3, (int) value.getRows());
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getCrypto_header());
                protoAdapter2.asRepeated().encodeWithTag(writer, 5, (int) value.getCrypto_rows());
                MarginTableColumn.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getColumns());
                ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 7, (int) value.getSort_by());
                protoAdapter3.encodeWithTag(writer, 8, (int) value.getSort_direction());
                ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) value.getMargin_health_state());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetMaintenanceTableResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) value.getMargin_health_state());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getSort_direction());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getSort_by());
                MarginTableColumn.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getColumns());
                ProtoAdapter<MarginTableRow> protoAdapter2 = MarginTableRow.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(writer, 5, (int) value.getCrypto_rows());
                ProtoAdapter<UIComponent> protoAdapter3 = UIComponent.ADAPTER;
                protoAdapter3.asRepeated().encodeWithTag(writer, 4, (int) value.getCrypto_header());
                protoAdapter2.asRepeated().encodeWithTag(writer, 3, (int) value.getRows());
                protoAdapter3.asRepeated().encodeWithTag(writer, 2, (int) value.getHeader());
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetMaintenanceTableResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = null;
                Integer numDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                arrayList.add(UIComponent.ADAPTER.decode(reader));
                                break;
                            case 3:
                                arrayList2.add(MarginTableRow.ADAPTER.decode(reader));
                                break;
                            case 4:
                                arrayList3.add(UIComponent.ADAPTER.decode(reader));
                                break;
                            case 5:
                                arrayList4.add(MarginTableRow.ADAPTER.decode(reader));
                                break;
                            case 6:
                                arrayList5.add(MarginTableColumn.ADAPTER.decode(reader));
                                break;
                            case 7:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                numDecode = ProtoAdapter.INT32.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetMaintenanceTableResponse(strDecode, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, strDecode2, strDecode3, numDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetMaintenanceTableResponse redact(GetMaintenanceTableResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<UIComponent> header = value.getHeader();
                ProtoAdapter<UIComponent> protoAdapter = UIComponent.ADAPTER;
                List listM26823redactElements = Internal.m26823redactElements(header, protoAdapter);
                List<MarginTableRow> rows = value.getRows();
                ProtoAdapter<MarginTableRow> protoAdapter2 = MarginTableRow.ADAPTER;
                return GetMaintenanceTableResponse.copy$default(value, null, listM26823redactElements, Internal.m26823redactElements(rows, protoAdapter2), Internal.m26823redactElements(value.getCrypto_header(), protoAdapter), Internal.m26823redactElements(value.getCrypto_rows(), protoAdapter2), Internal.m26823redactElements(value.getColumns(), MarginTableColumn.ADAPTER), null, null, null, ByteString.EMPTY, 449, null);
            }
        };
    }
}

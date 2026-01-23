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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: TaxLotsForOrderRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J2\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lnummus/v1/TaxLotsForOrderRequest;", "Lcom/squareup/wire/Message;", "", "order_id", "", "cursor", "account_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "getCursor", "getAccount_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TaxLotsForOrderRequest extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLotsForOrderRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", schemaIndex = 2, tag = 3)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_id;

    public TaxLotsForOrderRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29438newBuilder();
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public /* synthetic */ TaxLotsForOrderRequest(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLotsForOrderRequest(String order_id, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.cursor = str;
        this.account_id = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29438newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLotsForOrderRequest)) {
            return false;
        }
        TaxLotsForOrderRequest taxLotsForOrderRequest = (TaxLotsForOrderRequest) other;
        return Intrinsics.areEqual(unknownFields(), taxLotsForOrderRequest.unknownFields()) && Intrinsics.areEqual(this.order_id, taxLotsForOrderRequest.order_id) && Intrinsics.areEqual(this.cursor, taxLotsForOrderRequest.cursor) && Intrinsics.areEqual(this.account_id, taxLotsForOrderRequest.account_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.order_id.hashCode()) * 37;
        String str = this.cursor;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.account_id;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        String str = this.cursor;
        if (str != null) {
            arrayList.add("cursor=" + Internal.sanitize(str));
        }
        String str2 = this.account_id;
        if (str2 != null) {
            arrayList.add("account_id=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLotsForOrderRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLotsForOrderRequest copy$default(TaxLotsForOrderRequest taxLotsForOrderRequest, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLotsForOrderRequest.order_id;
        }
        if ((i & 2) != 0) {
            str2 = taxLotsForOrderRequest.cursor;
        }
        if ((i & 4) != 0) {
            str3 = taxLotsForOrderRequest.account_id;
        }
        if ((i & 8) != 0) {
            byteString = taxLotsForOrderRequest.unknownFields();
        }
        return taxLotsForOrderRequest.copy(str, str2, str3, byteString);
    }

    public final TaxLotsForOrderRequest copy(String order_id, String cursor, String account_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLotsForOrderRequest(order_id, cursor, account_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotsForOrderRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLotsForOrderRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.TaxLotsForOrderRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLotsForOrderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(2, value.getCursor()) + protoAdapter.encodedSizeWithTag(3, value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLotsForOrderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getCursor());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getAccount_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLotsForOrderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getAccount_id());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getCursor());
                if (Intrinsics.areEqual(value.getOrder_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getOrder_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotsForOrderRequest redact(TaxLotsForOrderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TaxLotsForOrderRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotsForOrderRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TaxLotsForOrderRequest(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
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

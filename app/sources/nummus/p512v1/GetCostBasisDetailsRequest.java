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

/* compiled from: GetCostBasisDetailsRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lnummus/v1/GetCostBasisDetailsRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "source_id", "source_type", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getSource_id", "getSource_type", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class GetCostBasisDetailsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetCostBasisDetailsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String source_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String source_type;

    public GetCostBasisDetailsRequest() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ GetCostBasisDetailsRequest(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29422newBuilder();
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCostBasisDetailsRequest(String account_id, String source_id, String source_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.source_id = source_id;
        this.source_type = source_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29422newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCostBasisDetailsRequest)) {
            return false;
        }
        GetCostBasisDetailsRequest getCostBasisDetailsRequest = (GetCostBasisDetailsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getCostBasisDetailsRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, getCostBasisDetailsRequest.account_id) && Intrinsics.areEqual(this.source_id, getCostBasisDetailsRequest.source_id) && Intrinsics.areEqual(this.source_type, getCostBasisDetailsRequest.source_type);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.source_id.hashCode()) * 37) + this.source_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("source_id=" + Internal.sanitize(this.source_id));
        arrayList.add("source_type=" + Internal.sanitize(this.source_type));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCostBasisDetailsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetCostBasisDetailsRequest copy$default(GetCostBasisDetailsRequest getCostBasisDetailsRequest, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCostBasisDetailsRequest.account_id;
        }
        if ((i & 2) != 0) {
            str2 = getCostBasisDetailsRequest.source_id;
        }
        if ((i & 4) != 0) {
            str3 = getCostBasisDetailsRequest.source_type;
        }
        if ((i & 8) != 0) {
            byteString = getCostBasisDetailsRequest.unknownFields();
        }
        return getCostBasisDetailsRequest.copy(str, str2, str3, byteString);
    }

    public final GetCostBasisDetailsRequest copy(String account_id, String source_id, String source_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCostBasisDetailsRequest(account_id, source_id, source_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCostBasisDetailsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCostBasisDetailsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.GetCostBasisDetailsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCostBasisDetailsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getSource_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSource_id());
                }
                return !Intrinsics.areEqual(value.getSource_type(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSource_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCostBasisDetailsRequest value) throws IOException {
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
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCostBasisDetailsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSource_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSource_type());
                }
                if (!Intrinsics.areEqual(value.getSource_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource_id());
                }
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCostBasisDetailsRequest redact(GetCostBasisDetailsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetCostBasisDetailsRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCostBasisDetailsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCostBasisDetailsRequest(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
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

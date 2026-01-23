package advisory.proto.p008v1;

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

/* compiled from: GetUnseenAdvisoryInsightsRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J7\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001aR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001c"}, m3636d2 = {"Ladvisory/proto/v1/GetUnseenAdvisoryInsightsRequest;", "Lcom/squareup/wire/Message;", "", "cursor", "", "page_size", "", "account_number", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)V", "getCursor", "()Ljava/lang/String;", "getPage_size", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAccount_number", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)Ladvisory/proto/v1/GetUnseenAdvisoryInsightsRequest;", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetUnseenAdvisoryInsightsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetUnseenAdvisoryInsightsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageSize", schemaIndex = 1, tag = 2)
    private final Integer page_size;

    public GetUnseenAdvisoryInsightsRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4501newBuilder();
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Integer getPage_size() {
        return this.page_size;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetUnseenAdvisoryInsightsRequest(String str, Integer num, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUnseenAdvisoryInsightsRequest(String str, Integer num, String account_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.cursor = str;
        this.page_size = num;
        this.account_number = account_number;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4501newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetUnseenAdvisoryInsightsRequest)) {
            return false;
        }
        GetUnseenAdvisoryInsightsRequest getUnseenAdvisoryInsightsRequest = (GetUnseenAdvisoryInsightsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getUnseenAdvisoryInsightsRequest.unknownFields()) && Intrinsics.areEqual(this.cursor, getUnseenAdvisoryInsightsRequest.cursor) && Intrinsics.areEqual(this.page_size, getUnseenAdvisoryInsightsRequest.page_size) && Intrinsics.areEqual(this.account_number, getUnseenAdvisoryInsightsRequest.account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.cursor;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.page_size;
        int iHashCode3 = ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 37) + this.account_number.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.cursor;
        if (str != null) {
            arrayList.add("cursor=" + Internal.sanitize(str));
        }
        Integer num = this.page_size;
        if (num != null) {
            arrayList.add("page_size=" + num);
        }
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetUnseenAdvisoryInsightsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetUnseenAdvisoryInsightsRequest copy$default(GetUnseenAdvisoryInsightsRequest getUnseenAdvisoryInsightsRequest, String str, Integer num, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getUnseenAdvisoryInsightsRequest.cursor;
        }
        if ((i & 2) != 0) {
            num = getUnseenAdvisoryInsightsRequest.page_size;
        }
        if ((i & 4) != 0) {
            str2 = getUnseenAdvisoryInsightsRequest.account_number;
        }
        if ((i & 8) != 0) {
            byteString = getUnseenAdvisoryInsightsRequest.unknownFields();
        }
        return getUnseenAdvisoryInsightsRequest.copy(str, num, str2, byteString);
    }

    public final GetUnseenAdvisoryInsightsRequest copy(String cursor, Integer page_size, String account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetUnseenAdvisoryInsightsRequest(cursor, page_size, account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetUnseenAdvisoryInsightsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetUnseenAdvisoryInsightsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetUnseenAdvisoryInsightsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetUnseenAdvisoryInsightsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getCursor()) + ProtoAdapter.INT32.encodedSizeWithTag(2, value.getPage_size());
                return !Intrinsics.areEqual(value.getAccount_number(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getAccount_number()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetUnseenAdvisoryInsightsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getCursor());
                ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) value.getPage_size());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetUnseenAdvisoryInsightsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) value.getPage_size());
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCursor());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetUnseenAdvisoryInsightsRequest redact(GetUnseenAdvisoryInsightsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetUnseenAdvisoryInsightsRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetUnseenAdvisoryInsightsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = "";
                Integer numDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetUnseenAdvisoryInsightsRequest(strDecode, numDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}

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

/* compiled from: GetUnseenAdvisoryInsightsResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J8\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Ladvisory/proto/v1/GetUnseenAdvisoryInsightsResponse;", "Lcom/squareup/wire/Message;", "", "next", "", "prev", "results", "", "Ladvisory/proto/v1/AdvisoryInsight;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getNext", "()Ljava/lang/String;", "getPrev", "getResults", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetUnseenAdvisoryInsightsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetUnseenAdvisoryInsightsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String next;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String prev;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsight#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<AdvisoryInsight> results;

    public GetUnseenAdvisoryInsightsResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4502newBuilder();
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrev() {
        return this.prev;
    }

    public /* synthetic */ GetUnseenAdvisoryInsightsResponse(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUnseenAdvisoryInsightsResponse(String str, String str2, List<AdvisoryInsight> results, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.next = str;
        this.prev = str2;
        this.results = Internal.immutableCopyOf("results", results);
    }

    public final List<AdvisoryInsight> getResults() {
        return this.results;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4502newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetUnseenAdvisoryInsightsResponse)) {
            return false;
        }
        GetUnseenAdvisoryInsightsResponse getUnseenAdvisoryInsightsResponse = (GetUnseenAdvisoryInsightsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getUnseenAdvisoryInsightsResponse.unknownFields()) && Intrinsics.areEqual(this.next, getUnseenAdvisoryInsightsResponse.next) && Intrinsics.areEqual(this.prev, getUnseenAdvisoryInsightsResponse.prev) && Intrinsics.areEqual(this.results, getUnseenAdvisoryInsightsResponse.results);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.next;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.prev;
        int iHashCode3 = ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.results.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.next;
        if (str != null) {
            arrayList.add("next=" + Internal.sanitize(str));
        }
        String str2 = this.prev;
        if (str2 != null) {
            arrayList.add("prev=" + Internal.sanitize(str2));
        }
        if (!this.results.isEmpty()) {
            arrayList.add("results=" + this.results);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetUnseenAdvisoryInsightsResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetUnseenAdvisoryInsightsResponse copy$default(GetUnseenAdvisoryInsightsResponse getUnseenAdvisoryInsightsResponse, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getUnseenAdvisoryInsightsResponse.next;
        }
        if ((i & 2) != 0) {
            str2 = getUnseenAdvisoryInsightsResponse.prev;
        }
        if ((i & 4) != 0) {
            list = getUnseenAdvisoryInsightsResponse.results;
        }
        if ((i & 8) != 0) {
            byteString = getUnseenAdvisoryInsightsResponse.unknownFields();
        }
        return getUnseenAdvisoryInsightsResponse.copy(str, str2, list, byteString);
    }

    public final GetUnseenAdvisoryInsightsResponse copy(String next, String prev, List<AdvisoryInsight> results, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetUnseenAdvisoryInsightsResponse(next, prev, results, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetUnseenAdvisoryInsightsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetUnseenAdvisoryInsightsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetUnseenAdvisoryInsightsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetUnseenAdvisoryInsightsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getNext()) + protoAdapter.encodedSizeWithTag(2, value.getPrev()) + AdvisoryInsight.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getResults());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetUnseenAdvisoryInsightsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getNext());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getPrev());
                AdvisoryInsight.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getResults());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetUnseenAdvisoryInsightsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AdvisoryInsight.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getResults());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getPrev());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getNext());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetUnseenAdvisoryInsightsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetUnseenAdvisoryInsightsResponse(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(AdvisoryInsight.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetUnseenAdvisoryInsightsResponse redact(GetUnseenAdvisoryInsightsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetUnseenAdvisoryInsightsResponse.copy$default(value, null, null, Internal.m26823redactElements(value.getResults(), AdvisoryInsight.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }
}

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

/* compiled from: GetCostBasisSummaryResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lnummus/v1/GetCostBasisSummaryResponse;", "Lcom/squareup/wire/Message;", "", "next", "", "previous", "results", "", "Lnummus/v1/GetCostBasisDetailsResponse;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getNext", "()Ljava/lang/String;", "getPrevious", "getResults", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class GetCostBasisSummaryResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCostBasisSummaryResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String next;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String previous;

    @WireField(adapter = "nummus.v1.GetCostBasisDetailsResponse#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<GetCostBasisDetailsResponse> results;

    public GetCostBasisSummaryResponse() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ GetCostBasisSummaryResponse(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29430newBuilder();
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrevious() {
        return this.previous;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCostBasisSummaryResponse(String next, String previous, List<GetCostBasisDetailsResponse> results, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.next = next;
        this.previous = previous;
        this.results = Internal.immutableCopyOf("results", results);
    }

    public final List<GetCostBasisDetailsResponse> getResults() {
        return this.results;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29430newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCostBasisSummaryResponse)) {
            return false;
        }
        GetCostBasisSummaryResponse getCostBasisSummaryResponse = (GetCostBasisSummaryResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCostBasisSummaryResponse.unknownFields()) && Intrinsics.areEqual(this.next, getCostBasisSummaryResponse.next) && Intrinsics.areEqual(this.previous, getCostBasisSummaryResponse.previous) && Intrinsics.areEqual(this.results, getCostBasisSummaryResponse.results);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.next.hashCode()) * 37) + this.previous.hashCode()) * 37) + this.results.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("next=" + Internal.sanitize(this.next));
        arrayList.add("previous=" + Internal.sanitize(this.previous));
        if (!this.results.isEmpty()) {
            arrayList.add("results=" + this.results);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCostBasisSummaryResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCostBasisSummaryResponse copy$default(GetCostBasisSummaryResponse getCostBasisSummaryResponse, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCostBasisSummaryResponse.next;
        }
        if ((i & 2) != 0) {
            str2 = getCostBasisSummaryResponse.previous;
        }
        if ((i & 4) != 0) {
            list = getCostBasisSummaryResponse.results;
        }
        if ((i & 8) != 0) {
            byteString = getCostBasisSummaryResponse.unknownFields();
        }
        return getCostBasisSummaryResponse.copy(str, str2, list, byteString);
    }

    public final GetCostBasisSummaryResponse copy(String next, String previous, List<GetCostBasisDetailsResponse> results, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCostBasisSummaryResponse(next, previous, results, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCostBasisSummaryResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCostBasisSummaryResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.GetCostBasisSummaryResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCostBasisSummaryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getNext(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getNext());
                }
                if (!Intrinsics.areEqual(value.getPrevious(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPrevious());
                }
                return size + GetCostBasisDetailsResponse.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getResults());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCostBasisSummaryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getNext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNext());
                }
                if (!Intrinsics.areEqual(value.getPrevious(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrevious());
                }
                GetCostBasisDetailsResponse.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getResults());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCostBasisSummaryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                GetCostBasisDetailsResponse.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getResults());
                if (!Intrinsics.areEqual(value.getPrevious(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrevious());
                }
                if (Intrinsics.areEqual(value.getNext(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getNext());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCostBasisSummaryResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCostBasisSummaryResponse(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(GetCostBasisDetailsResponse.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCostBasisSummaryResponse redact(GetCostBasisSummaryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetCostBasisSummaryResponse.copy$default(value, null, null, Internal.m26823redactElements(value.getResults(), GetCostBasisDetailsResponse.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }
}

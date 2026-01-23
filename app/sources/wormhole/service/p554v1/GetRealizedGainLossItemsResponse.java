package wormhole.service.p554v1;

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

/* compiled from: GetRealizedGainLossItemsResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B-\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J,\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossItemsResponse;", "Lcom/squareup/wire/Message;", "", "results", "", "Lwormhole/service/v1/RealizedGainLossItem;", "next_cursor", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getNext_cursor", "()Ljava/lang/String;", "getResults", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetRealizedGainLossItemsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetRealizedGainLossItemsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nextCursor", schemaIndex = 1, tag = 2)
    private final String next_cursor;

    @WireField(adapter = "wormhole.service.v1.RealizedGainLossItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<RealizedGainLossItem> results;

    public GetRealizedGainLossItemsResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30063newBuilder();
    }

    public /* synthetic */ GetRealizedGainLossItemsResponse(List list, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRealizedGainLossItemsResponse(List<RealizedGainLossItem> results, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.next_cursor = str;
        this.results = Internal.immutableCopyOf("results", results);
    }

    public final List<RealizedGainLossItem> getResults() {
        return this.results;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30063newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetRealizedGainLossItemsResponse)) {
            return false;
        }
        GetRealizedGainLossItemsResponse getRealizedGainLossItemsResponse = (GetRealizedGainLossItemsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getRealizedGainLossItemsResponse.unknownFields()) && Intrinsics.areEqual(this.results, getRealizedGainLossItemsResponse.results) && Intrinsics.areEqual(this.next_cursor, getRealizedGainLossItemsResponse.next_cursor);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.results.hashCode()) * 37;
        String str = this.next_cursor;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.results.isEmpty()) {
            arrayList.add("results=" + this.results);
        }
        String str = this.next_cursor;
        if (str != null) {
            arrayList.add("next_cursor=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRealizedGainLossItemsResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetRealizedGainLossItemsResponse copy$default(GetRealizedGainLossItemsResponse getRealizedGainLossItemsResponse, List list, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getRealizedGainLossItemsResponse.results;
        }
        if ((i & 2) != 0) {
            str = getRealizedGainLossItemsResponse.next_cursor;
        }
        if ((i & 4) != 0) {
            byteString = getRealizedGainLossItemsResponse.unknownFields();
        }
        return getRealizedGainLossItemsResponse.copy(list, str, byteString);
    }

    public final GetRealizedGainLossItemsResponse copy(List<RealizedGainLossItem> results, String next_cursor, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetRealizedGainLossItemsResponse(results, next_cursor, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetRealizedGainLossItemsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetRealizedGainLossItemsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: wormhole.service.v1.GetRealizedGainLossItemsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetRealizedGainLossItemsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + RealizedGainLossItem.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getResults()) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNext_cursor());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetRealizedGainLossItemsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                RealizedGainLossItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getResults());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNext_cursor());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetRealizedGainLossItemsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNext_cursor());
                RealizedGainLossItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getResults());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedGainLossItemsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetRealizedGainLossItemsResponse(arrayList, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(RealizedGainLossItem.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedGainLossItemsResponse redact(GetRealizedGainLossItemsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetRealizedGainLossItemsResponse.copy$default(value, Internal.m26823redactElements(value.getResults(), RealizedGainLossItem.ADAPTER), null, ByteString.EMPTY, 2, null);
            }
        };
    }
}

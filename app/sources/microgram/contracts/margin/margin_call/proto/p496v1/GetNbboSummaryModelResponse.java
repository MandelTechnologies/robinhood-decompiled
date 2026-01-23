package microgram.contracts.margin.margin_call.proto.p496v1;

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

/* compiled from: GetNbboSummaryModelResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J4\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetNbboSummaryModelResponse;", "Lcom/squareup/wire/Message;", "", "order_nbbo_summaries", "", "Lmicrogram/contracts/margin/margin_call/proto/v1/OrderNbboSummary;", "refresh_action", "", "last_refreshed_time", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getRefresh_action", "()Ljava/lang/String;", "getLast_refreshed_time", "getOrder_nbbo_summaries", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetNbboSummaryModelResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetNbboSummaryModelResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastRefreshedTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String last_refreshed_time;

    @WireField(adapter = "microgram.contracts.margin.margin_call.proto.v1.OrderNbboSummary#ADAPTER", jsonName = "orderNbboSummaries", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<OrderNbboSummary> order_nbbo_summaries;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refreshAction", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String refresh_action;

    public GetNbboSummaryModelResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29145newBuilder();
    }

    public /* synthetic */ GetNbboSummaryModelResponse(List list, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getRefresh_action() {
        return this.refresh_action;
    }

    public final String getLast_refreshed_time() {
        return this.last_refreshed_time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNbboSummaryModelResponse(List<OrderNbboSummary> order_nbbo_summaries, String refresh_action, String last_refreshed_time, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_nbbo_summaries, "order_nbbo_summaries");
        Intrinsics.checkNotNullParameter(refresh_action, "refresh_action");
        Intrinsics.checkNotNullParameter(last_refreshed_time, "last_refreshed_time");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.refresh_action = refresh_action;
        this.last_refreshed_time = last_refreshed_time;
        this.order_nbbo_summaries = Internal.immutableCopyOf("order_nbbo_summaries", order_nbbo_summaries);
    }

    public final List<OrderNbboSummary> getOrder_nbbo_summaries() {
        return this.order_nbbo_summaries;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29145newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetNbboSummaryModelResponse)) {
            return false;
        }
        GetNbboSummaryModelResponse getNbboSummaryModelResponse = (GetNbboSummaryModelResponse) other;
        return Intrinsics.areEqual(unknownFields(), getNbboSummaryModelResponse.unknownFields()) && Intrinsics.areEqual(this.order_nbbo_summaries, getNbboSummaryModelResponse.order_nbbo_summaries) && Intrinsics.areEqual(this.refresh_action, getNbboSummaryModelResponse.refresh_action) && Intrinsics.areEqual(this.last_refreshed_time, getNbboSummaryModelResponse.last_refreshed_time);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.order_nbbo_summaries.hashCode()) * 37) + this.refresh_action.hashCode()) * 37) + this.last_refreshed_time.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.order_nbbo_summaries.isEmpty()) {
            arrayList.add("order_nbbo_summaries=" + this.order_nbbo_summaries);
        }
        arrayList.add("refresh_action=" + Internal.sanitize(this.refresh_action));
        arrayList.add("last_refreshed_time=" + Internal.sanitize(this.last_refreshed_time));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetNbboSummaryModelResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetNbboSummaryModelResponse copy$default(GetNbboSummaryModelResponse getNbboSummaryModelResponse, List list, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getNbboSummaryModelResponse.order_nbbo_summaries;
        }
        if ((i & 2) != 0) {
            str = getNbboSummaryModelResponse.refresh_action;
        }
        if ((i & 4) != 0) {
            str2 = getNbboSummaryModelResponse.last_refreshed_time;
        }
        if ((i & 8) != 0) {
            byteString = getNbboSummaryModelResponse.unknownFields();
        }
        return getNbboSummaryModelResponse.copy(list, str, str2, byteString);
    }

    public final GetNbboSummaryModelResponse copy(List<OrderNbboSummary> order_nbbo_summaries, String refresh_action, String last_refreshed_time, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_nbbo_summaries, "order_nbbo_summaries");
        Intrinsics.checkNotNullParameter(refresh_action, "refresh_action");
        Intrinsics.checkNotNullParameter(last_refreshed_time, "last_refreshed_time");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetNbboSummaryModelResponse(order_nbbo_summaries, refresh_action, last_refreshed_time, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetNbboSummaryModelResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetNbboSummaryModelResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.margin.margin_call.proto.v1.GetNbboSummaryModelResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetNbboSummaryModelResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + OrderNbboSummary.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getOrder_nbbo_summaries());
                if (!Intrinsics.areEqual(value.getRefresh_action(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRefresh_action());
                }
                return !Intrinsics.areEqual(value.getLast_refreshed_time(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLast_refreshed_time()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetNbboSummaryModelResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                OrderNbboSummary.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getOrder_nbbo_summaries());
                if (!Intrinsics.areEqual(value.getRefresh_action(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRefresh_action());
                }
                if (!Intrinsics.areEqual(value.getLast_refreshed_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLast_refreshed_time());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetNbboSummaryModelResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLast_refreshed_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLast_refreshed_time());
                }
                if (!Intrinsics.areEqual(value.getRefresh_action(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRefresh_action());
                }
                OrderNbboSummary.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getOrder_nbbo_summaries());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetNbboSummaryModelResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetNbboSummaryModelResponse(arrayList, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(OrderNbboSummary.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetNbboSummaryModelResponse redact(GetNbboSummaryModelResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetNbboSummaryModelResponse.copy$default(value, Internal.m26823redactElements(value.getOrder_nbbo_summaries(), OrderNbboSummary.ADAPTER), null, null, ByteString.EMPTY, 6, null);
            }
        };
    }
}

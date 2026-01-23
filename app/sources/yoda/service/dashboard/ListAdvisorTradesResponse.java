package yoda.service.dashboard;

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

/* compiled from: ListAdvisorTradesResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J8\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lyoda/service/dashboard/ListAdvisorTradesResponse;", "Lcom/squareup/wire/Message;", "", "advisor_trades", "", "Lyoda/service/dashboard/AdvisorTrade;", "next", "", "previous", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getNext", "()Ljava/lang/String;", "getPrevious", "getAdvisor_trades", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ListAdvisorTradesResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ListAdvisorTradesResponse> ADAPTER;

    @WireField(adapter = "yoda.service.dashboard.AdvisorTrade#ADAPTER", jsonName = "advisorTrades", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<AdvisorTrade> advisor_trades;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String next;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String previous;

    public ListAdvisorTradesResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30097newBuilder();
    }

    public /* synthetic */ ListAdvisorTradesResponse(List list, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrevious() {
        return this.previous;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListAdvisorTradesResponse(List<AdvisorTrade> advisor_trades, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(advisor_trades, "advisor_trades");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.next = str;
        this.previous = str2;
        this.advisor_trades = Internal.immutableCopyOf("advisor_trades", advisor_trades);
    }

    public final List<AdvisorTrade> getAdvisor_trades() {
        return this.advisor_trades;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30097newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListAdvisorTradesResponse)) {
            return false;
        }
        ListAdvisorTradesResponse listAdvisorTradesResponse = (ListAdvisorTradesResponse) other;
        return Intrinsics.areEqual(unknownFields(), listAdvisorTradesResponse.unknownFields()) && Intrinsics.areEqual(this.advisor_trades, listAdvisorTradesResponse.advisor_trades) && Intrinsics.areEqual(this.next, listAdvisorTradesResponse.next) && Intrinsics.areEqual(this.previous, listAdvisorTradesResponse.previous);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.advisor_trades.hashCode()) * 37;
        String str = this.next;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.previous;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.advisor_trades.isEmpty()) {
            arrayList.add("advisor_trades=" + this.advisor_trades);
        }
        String str = this.next;
        if (str != null) {
            arrayList.add("next=" + Internal.sanitize(str));
        }
        String str2 = this.previous;
        if (str2 != null) {
            arrayList.add("previous=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListAdvisorTradesResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListAdvisorTradesResponse copy$default(ListAdvisorTradesResponse listAdvisorTradesResponse, List list, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listAdvisorTradesResponse.advisor_trades;
        }
        if ((i & 2) != 0) {
            str = listAdvisorTradesResponse.next;
        }
        if ((i & 4) != 0) {
            str2 = listAdvisorTradesResponse.previous;
        }
        if ((i & 8) != 0) {
            byteString = listAdvisorTradesResponse.unknownFields();
        }
        return listAdvisorTradesResponse.copy(list, str, str2, byteString);
    }

    public final ListAdvisorTradesResponse copy(List<AdvisorTrade> advisor_trades, String next, String previous, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(advisor_trades, "advisor_trades");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListAdvisorTradesResponse(advisor_trades, next, previous, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListAdvisorTradesResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListAdvisorTradesResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: yoda.service.dashboard.ListAdvisorTradesResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListAdvisorTradesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + AdvisorTrade.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getAdvisor_trades());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(2, value.getNext()) + protoAdapter.encodedSizeWithTag(3, value.getPrevious());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListAdvisorTradesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisorTrade.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getAdvisor_trades());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getNext());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getPrevious());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListAdvisorTradesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getPrevious());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getNext());
                AdvisorTrade.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getAdvisor_trades());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListAdvisorTradesResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ListAdvisorTradesResponse(arrayList, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(AdvisorTrade.ADAPTER.decode(reader));
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
            public ListAdvisorTradesResponse redact(ListAdvisorTradesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ListAdvisorTradesResponse.copy$default(value, Internal.m26823redactElements(value.getAdvisor_trades(), AdvisorTrade.ADAPTER), null, null, ByteString.EMPTY, 6, null);
            }
        };
    }
}

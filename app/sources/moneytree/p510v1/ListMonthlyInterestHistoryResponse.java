package moneytree.p510v1;

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

/* compiled from: ListMonthlyInterestHistoryResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J4\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lmoneytree/v1/ListMonthlyInterestHistoryResponse;", "Lcom/squareup/wire/Message;", "", "payments", "", "Lmoneytree/v1/InterestPayment;", "next_cursor", "", "previous_cursor", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getNext_cursor", "()Ljava/lang/String;", "getPrevious_cursor", "getPayments", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ListMonthlyInterestHistoryResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ListMonthlyInterestHistoryResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nextCursor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String next_cursor;

    @WireField(adapter = "moneytree.v1.InterestPayment#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<InterestPayment> payments;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previousCursor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String previous_cursor;

    public ListMonthlyInterestHistoryResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29336newBuilder();
    }

    public /* synthetic */ ListMonthlyInterestHistoryResponse(List list, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public final String getPrevious_cursor() {
        return this.previous_cursor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMonthlyInterestHistoryResponse(List<InterestPayment> payments, String next_cursor, String previous_cursor, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(next_cursor, "next_cursor");
        Intrinsics.checkNotNullParameter(previous_cursor, "previous_cursor");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.next_cursor = next_cursor;
        this.previous_cursor = previous_cursor;
        this.payments = Internal.immutableCopyOf("payments", payments);
    }

    public final List<InterestPayment> getPayments() {
        return this.payments;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29336newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListMonthlyInterestHistoryResponse)) {
            return false;
        }
        ListMonthlyInterestHistoryResponse listMonthlyInterestHistoryResponse = (ListMonthlyInterestHistoryResponse) other;
        return Intrinsics.areEqual(unknownFields(), listMonthlyInterestHistoryResponse.unknownFields()) && Intrinsics.areEqual(this.payments, listMonthlyInterestHistoryResponse.payments) && Intrinsics.areEqual(this.next_cursor, listMonthlyInterestHistoryResponse.next_cursor) && Intrinsics.areEqual(this.previous_cursor, listMonthlyInterestHistoryResponse.previous_cursor);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.payments.hashCode()) * 37) + this.next_cursor.hashCode()) * 37) + this.previous_cursor.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.payments.isEmpty()) {
            arrayList.add("payments=" + this.payments);
        }
        arrayList.add("next_cursor=" + Internal.sanitize(this.next_cursor));
        arrayList.add("previous_cursor=" + Internal.sanitize(this.previous_cursor));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListMonthlyInterestHistoryResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListMonthlyInterestHistoryResponse copy$default(ListMonthlyInterestHistoryResponse listMonthlyInterestHistoryResponse, List list, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listMonthlyInterestHistoryResponse.payments;
        }
        if ((i & 2) != 0) {
            str = listMonthlyInterestHistoryResponse.next_cursor;
        }
        if ((i & 4) != 0) {
            str2 = listMonthlyInterestHistoryResponse.previous_cursor;
        }
        if ((i & 8) != 0) {
            byteString = listMonthlyInterestHistoryResponse.unknownFields();
        }
        return listMonthlyInterestHistoryResponse.copy(list, str, str2, byteString);
    }

    public final ListMonthlyInterestHistoryResponse copy(List<InterestPayment> payments, String next_cursor, String previous_cursor, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(next_cursor, "next_cursor");
        Intrinsics.checkNotNullParameter(previous_cursor, "previous_cursor");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListMonthlyInterestHistoryResponse(payments, next_cursor, previous_cursor, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListMonthlyInterestHistoryResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListMonthlyInterestHistoryResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: moneytree.v1.ListMonthlyInterestHistoryResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListMonthlyInterestHistoryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + InterestPayment.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getPayments());
                if (!Intrinsics.areEqual(value.getNext_cursor(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNext_cursor());
                }
                return !Intrinsics.areEqual(value.getPrevious_cursor(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrevious_cursor()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListMonthlyInterestHistoryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                InterestPayment.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getPayments());
                if (!Intrinsics.areEqual(value.getNext_cursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNext_cursor());
                }
                if (!Intrinsics.areEqual(value.getPrevious_cursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrevious_cursor());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListMonthlyInterestHistoryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPrevious_cursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrevious_cursor());
                }
                if (!Intrinsics.areEqual(value.getNext_cursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNext_cursor());
                }
                InterestPayment.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getPayments());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListMonthlyInterestHistoryResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ListMonthlyInterestHistoryResponse(arrayList, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(InterestPayment.ADAPTER.decode(reader));
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
            public ListMonthlyInterestHistoryResponse redact(ListMonthlyInterestHistoryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ListMonthlyInterestHistoryResponse.copy$default(value, Internal.m26823redactElements(value.getPayments(), InterestPayment.ADAPTER), null, null, ByteString.EMPTY, 6, null);
            }
        };
    }
}

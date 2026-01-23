package com.robinhood.arsenal.proto.p281v1.idl;

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

/* compiled from: ListActiveFuturesContractSchedulesRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB5\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J4\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ListActiveFuturesContractSchedulesRequest;", "Lcom/squareup/wire/Message;", "", "product_ids", "", "", "start_date", "end_date", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getStart_date", "()Ljava/lang/String;", "getEnd_date", "getProduct_ids", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ListActiveFuturesContractSchedulesRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ListActiveFuturesContractSchedulesRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "endDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String end_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "productIds", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<String> product_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "startDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String start_date;

    public ListActiveFuturesContractSchedulesRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20170newBuilder();
    }

    public /* synthetic */ ListActiveFuturesContractSchedulesRequest(List list, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getStart_date() {
        return this.start_date;
    }

    public final String getEnd_date() {
        return this.end_date;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListActiveFuturesContractSchedulesRequest(List<String> product_ids, String start_date, String end_date, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(product_ids, "product_ids");
        Intrinsics.checkNotNullParameter(start_date, "start_date");
        Intrinsics.checkNotNullParameter(end_date, "end_date");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.start_date = start_date;
        this.end_date = end_date;
        this.product_ids = Internal.immutableCopyOf("product_ids", product_ids);
    }

    public final List<String> getProduct_ids() {
        return this.product_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20170newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListActiveFuturesContractSchedulesRequest)) {
            return false;
        }
        ListActiveFuturesContractSchedulesRequest listActiveFuturesContractSchedulesRequest = (ListActiveFuturesContractSchedulesRequest) other;
        return Intrinsics.areEqual(unknownFields(), listActiveFuturesContractSchedulesRequest.unknownFields()) && Intrinsics.areEqual(this.product_ids, listActiveFuturesContractSchedulesRequest.product_ids) && Intrinsics.areEqual(this.start_date, listActiveFuturesContractSchedulesRequest.start_date) && Intrinsics.areEqual(this.end_date, listActiveFuturesContractSchedulesRequest.end_date);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.product_ids.hashCode()) * 37) + this.start_date.hashCode()) * 37) + this.end_date.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.product_ids.isEmpty()) {
            arrayList.add("product_ids=" + Internal.sanitize(this.product_ids));
        }
        arrayList.add("start_date=" + Internal.sanitize(this.start_date));
        arrayList.add("end_date=" + Internal.sanitize(this.end_date));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListActiveFuturesContractSchedulesRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListActiveFuturesContractSchedulesRequest copy$default(ListActiveFuturesContractSchedulesRequest listActiveFuturesContractSchedulesRequest, List list, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listActiveFuturesContractSchedulesRequest.product_ids;
        }
        if ((i & 2) != 0) {
            str = listActiveFuturesContractSchedulesRequest.start_date;
        }
        if ((i & 4) != 0) {
            str2 = listActiveFuturesContractSchedulesRequest.end_date;
        }
        if ((i & 8) != 0) {
            byteString = listActiveFuturesContractSchedulesRequest.unknownFields();
        }
        return listActiveFuturesContractSchedulesRequest.copy(list, str, str2, byteString);
    }

    public final ListActiveFuturesContractSchedulesRequest copy(List<String> product_ids, String start_date, String end_date, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(product_ids, "product_ids");
        Intrinsics.checkNotNullParameter(start_date, "start_date");
        Intrinsics.checkNotNullParameter(end_date, "end_date");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListActiveFuturesContractSchedulesRequest(product_ids, start_date, end_date, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListActiveFuturesContractSchedulesRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListActiveFuturesContractSchedulesRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.ListActiveFuturesContractSchedulesRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListActiveFuturesContractSchedulesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getProduct_ids());
                if (!Intrinsics.areEqual(value.getStart_date(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(2, value.getStart_date());
                }
                return !Intrinsics.areEqual(value.getEnd_date(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getEnd_date()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListActiveFuturesContractSchedulesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getProduct_ids());
                if (!Intrinsics.areEqual(value.getStart_date(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getStart_date());
                }
                if (!Intrinsics.areEqual(value.getEnd_date(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getEnd_date());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListActiveFuturesContractSchedulesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getEnd_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEnd_date());
                }
                if (!Intrinsics.areEqual(value.getStart_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getStart_date());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getProduct_ids());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ListActiveFuturesContractSchedulesRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ListActiveFuturesContractSchedulesRequest(arrayList, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
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
            public ListActiveFuturesContractSchedulesRequest redact(ListActiveFuturesContractSchedulesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ListActiveFuturesContractSchedulesRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}

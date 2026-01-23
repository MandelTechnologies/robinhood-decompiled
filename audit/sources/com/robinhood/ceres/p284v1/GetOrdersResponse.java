package com.robinhood.ceres.p284v1;

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

/* compiled from: GetOrdersResponse.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016JD\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetOrdersResponse;", "Lcom/squareup/wire/Message;", "", "next", "", "previous", "results", "", "Lcom/robinhood/ceres/v1/FuturesOrder;", "csv_file_uri", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getNext", "()Ljava/lang/String;", "getPrevious", "getCsv_file_uri", "getResults", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetOrdersResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetOrdersResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "csvFileUri", schemaIndex = 3, tag = 4)
    private final String csv_file_uri;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String next;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String previous;

    @WireField(adapter = "com.robinhood.ceres.v1.FuturesOrder#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<FuturesOrder> results;

    public GetOrdersResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20374newBuilder();
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrevious() {
        return this.previous;
    }

    public /* synthetic */ GetOrdersResponse(String str, String str2, List list, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getCsv_file_uri() {
        return this.csv_file_uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrdersResponse(String str, String str2, List<FuturesOrder> results, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.next = str;
        this.previous = str2;
        this.csv_file_uri = str3;
        this.results = Internal.immutableCopyOf("results", results);
    }

    public final List<FuturesOrder> getResults() {
        return this.results;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20374newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetOrdersResponse)) {
            return false;
        }
        GetOrdersResponse getOrdersResponse = (GetOrdersResponse) other;
        return Intrinsics.areEqual(unknownFields(), getOrdersResponse.unknownFields()) && Intrinsics.areEqual(this.next, getOrdersResponse.next) && Intrinsics.areEqual(this.previous, getOrdersResponse.previous) && Intrinsics.areEqual(this.results, getOrdersResponse.results) && Intrinsics.areEqual(this.csv_file_uri, getOrdersResponse.csv_file_uri);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.next;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.previous;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.results.hashCode()) * 37;
        String str3 = this.csv_file_uri;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.next;
        if (str != null) {
            arrayList.add("next=" + Internal.sanitize(str));
        }
        String str2 = this.previous;
        if (str2 != null) {
            arrayList.add("previous=" + Internal.sanitize(str2));
        }
        if (!this.results.isEmpty()) {
            arrayList.add("results=" + this.results);
        }
        String str3 = this.csv_file_uri;
        if (str3 != null) {
            arrayList.add("csv_file_uri=" + Internal.sanitize(str3));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetOrdersResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetOrdersResponse copy$default(GetOrdersResponse getOrdersResponse, String str, String str2, List list, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getOrdersResponse.next;
        }
        if ((i & 2) != 0) {
            str2 = getOrdersResponse.previous;
        }
        if ((i & 4) != 0) {
            list = getOrdersResponse.results;
        }
        if ((i & 8) != 0) {
            str3 = getOrdersResponse.csv_file_uri;
        }
        if ((i & 16) != 0) {
            byteString = getOrdersResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return getOrdersResponse.copy(str, str2, list2, str3, byteString2);
    }

    public final GetOrdersResponse copy(String next, String previous, List<FuturesOrder> results, String csv_file_uri, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetOrdersResponse(next, previous, results, csv_file_uri, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetOrdersResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetOrdersResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetOrdersResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetOrdersResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getNext()) + protoAdapter.encodedSizeWithTag(2, value.getPrevious()) + FuturesOrder.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getResults()) + protoAdapter.encodedSizeWithTag(4, value.getCsv_file_uri());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetOrdersResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getNext());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getPrevious());
                FuturesOrder.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getResults());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getCsv_file_uri());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetOrdersResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getCsv_file_uri());
                FuturesOrder.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getResults());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getPrevious());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getNext());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetOrdersResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetOrdersResponse(strDecode, strDecode2, arrayList, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(FuturesOrder.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetOrdersResponse redact(GetOrdersResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetOrdersResponse.copy$default(value, null, null, Internal.m26823redactElements(value.getResults(), FuturesOrder.ADAPTER), null, ByteString.EMPTY, 11, null);
            }
        };
    }
}

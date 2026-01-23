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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ListFuturesContractsRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ListFuturesContractsRequest;", "Lcom/squareup/wire/Message;", "", "product_ids", "", "contract_ids", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getProduct_ids", "()Ljava/lang/String;", "getContract_ids", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ListFuturesContractsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ListFuturesContractsRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractIds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String contract_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "productIds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String product_ids;

    public ListFuturesContractsRequest() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ ListFuturesContractsRequest(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20182newBuilder();
    }

    public final String getProduct_ids() {
        return this.product_ids;
    }

    public final String getContract_ids() {
        return this.contract_ids;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListFuturesContractsRequest(String product_ids, String contract_ids, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(product_ids, "product_ids");
        Intrinsics.checkNotNullParameter(contract_ids, "contract_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.product_ids = product_ids;
        this.contract_ids = contract_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20182newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListFuturesContractsRequest)) {
            return false;
        }
        ListFuturesContractsRequest listFuturesContractsRequest = (ListFuturesContractsRequest) other;
        return Intrinsics.areEqual(unknownFields(), listFuturesContractsRequest.unknownFields()) && Intrinsics.areEqual(this.product_ids, listFuturesContractsRequest.product_ids) && Intrinsics.areEqual(this.contract_ids, listFuturesContractsRequest.contract_ids);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.product_ids.hashCode()) * 37) + this.contract_ids.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("product_ids=" + Internal.sanitize(this.product_ids));
        arrayList.add("contract_ids=" + Internal.sanitize(this.contract_ids));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListFuturesContractsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ListFuturesContractsRequest copy$default(ListFuturesContractsRequest listFuturesContractsRequest, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listFuturesContractsRequest.product_ids;
        }
        if ((i & 2) != 0) {
            str2 = listFuturesContractsRequest.contract_ids;
        }
        if ((i & 4) != 0) {
            byteString = listFuturesContractsRequest.unknownFields();
        }
        return listFuturesContractsRequest.copy(str, str2, byteString);
    }

    public final ListFuturesContractsRequest copy(String product_ids, String contract_ids, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(product_ids, "product_ids");
        Intrinsics.checkNotNullParameter(contract_ids, "contract_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListFuturesContractsRequest(product_ids, contract_ids, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListFuturesContractsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListFuturesContractsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.ListFuturesContractsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListFuturesContractsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getProduct_ids(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getProduct_ids());
                }
                return !Intrinsics.areEqual(value.getContract_ids(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getContract_ids()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListFuturesContractsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getProduct_ids(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getProduct_ids());
                }
                if (!Intrinsics.areEqual(value.getContract_ids(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContract_ids());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListFuturesContractsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getContract_ids(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getContract_ids());
                }
                if (Intrinsics.areEqual(value.getProduct_ids(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getProduct_ids());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListFuturesContractsRequest redact(ListFuturesContractsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ListFuturesContractsRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ListFuturesContractsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ListFuturesContractsRequest(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}

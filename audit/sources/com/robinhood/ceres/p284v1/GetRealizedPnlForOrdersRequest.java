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

/* compiled from: GetRealizedPnlForOrdersRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u001cR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "order_ids", "", "include_fees", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getInclude_fees", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOrder_ids", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lokio/ByteString;)Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersRequest;", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetRealizedPnlForOrdersRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetRealizedPnlForOrdersRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "includeFees", schemaIndex = 2, tag = 3)
    private final Boolean include_fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderIds", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> order_ids;

    public GetRealizedPnlForOrdersRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20379newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public /* synthetic */ GetRealizedPnlForOrdersRequest(String str, List list, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Boolean getInclude_fees() {
        return this.include_fees;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRealizedPnlForOrdersRequest(String account_id, List<String> order_ids, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(order_ids, "order_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.include_fees = bool;
        this.order_ids = Internal.immutableCopyOf("order_ids", order_ids);
    }

    public final List<String> getOrder_ids() {
        return this.order_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20379newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetRealizedPnlForOrdersRequest)) {
            return false;
        }
        GetRealizedPnlForOrdersRequest getRealizedPnlForOrdersRequest = (GetRealizedPnlForOrdersRequest) other;
        return Intrinsics.areEqual(unknownFields(), getRealizedPnlForOrdersRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, getRealizedPnlForOrdersRequest.account_id) && Intrinsics.areEqual(this.order_ids, getRealizedPnlForOrdersRequest.order_ids) && Intrinsics.areEqual(this.include_fees, getRealizedPnlForOrdersRequest.include_fees);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.order_ids.hashCode()) * 37;
        Boolean bool = this.include_fees;
        int iHashCode2 = iHashCode + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        if (!this.order_ids.isEmpty()) {
            arrayList.add("order_ids=" + Internal.sanitize(this.order_ids));
        }
        Boolean bool = this.include_fees;
        if (bool != null) {
            arrayList.add("include_fees=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRealizedPnlForOrdersRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetRealizedPnlForOrdersRequest copy$default(GetRealizedPnlForOrdersRequest getRealizedPnlForOrdersRequest, String str, List list, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getRealizedPnlForOrdersRequest.account_id;
        }
        if ((i & 2) != 0) {
            list = getRealizedPnlForOrdersRequest.order_ids;
        }
        if ((i & 4) != 0) {
            bool = getRealizedPnlForOrdersRequest.include_fees;
        }
        if ((i & 8) != 0) {
            byteString = getRealizedPnlForOrdersRequest.unknownFields();
        }
        return getRealizedPnlForOrdersRequest.copy(str, list, bool, byteString);
    }

    public final GetRealizedPnlForOrdersRequest copy(String account_id, List<String> order_ids, Boolean include_fees, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(order_ids, "order_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetRealizedPnlForOrdersRequest(account_id, order_ids, include_fees, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetRealizedPnlForOrdersRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetRealizedPnlForOrdersRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetRealizedPnlForOrdersRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetRealizedPnlForOrdersRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                return size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.getOrder_ids()) + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.getInclude_fees());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetRealizedPnlForOrdersRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, (int) value.getOrder_ids());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getInclude_fees());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetRealizedPnlForOrdersRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) value.getInclude_fees());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getOrder_ids());
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedPnlForOrdersRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Boolean boolDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetRealizedPnlForOrdersRequest(strDecode, arrayList, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 3) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedPnlForOrdersRequest redact(GetRealizedPnlForOrdersRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetRealizedPnlForOrdersRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}

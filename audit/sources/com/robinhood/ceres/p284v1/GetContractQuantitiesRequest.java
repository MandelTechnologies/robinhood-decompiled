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

/* compiled from: GetContractQuantitiesRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\tH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u001eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetContractQuantitiesRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "contract_ids", "", "cursor", "page_size", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getCursor", "getPage_size", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContract_ids", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lokio/ByteString;)Lcom/robinhood/ceres/v1/GetContractQuantitiesRequest;", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetContractQuantitiesRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetContractQuantitiesRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractIds", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> contract_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageSize", schemaIndex = 3, tag = 4)
    private final Integer page_size;

    public GetContractQuantitiesRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20345newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public /* synthetic */ GetContractQuantitiesRequest(String str, List list, String str2, Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Integer getPage_size() {
        return this.page_size;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetContractQuantitiesRequest(String account_id, List<String> contract_ids, String str, Integer num, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(contract_ids, "contract_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.cursor = str;
        this.page_size = num;
        this.contract_ids = Internal.immutableCopyOf("contract_ids", contract_ids);
    }

    public final List<String> getContract_ids() {
        return this.contract_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20345newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetContractQuantitiesRequest)) {
            return false;
        }
        GetContractQuantitiesRequest getContractQuantitiesRequest = (GetContractQuantitiesRequest) other;
        return Intrinsics.areEqual(unknownFields(), getContractQuantitiesRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, getContractQuantitiesRequest.account_id) && Intrinsics.areEqual(this.contract_ids, getContractQuantitiesRequest.contract_ids) && Intrinsics.areEqual(this.cursor, getContractQuantitiesRequest.cursor) && Intrinsics.areEqual(this.page_size, getContractQuantitiesRequest.page_size);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.contract_ids.hashCode()) * 37;
        String str = this.cursor;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.page_size;
        int iHashCode3 = iHashCode2 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        if (!this.contract_ids.isEmpty()) {
            arrayList.add("contract_ids=" + Internal.sanitize(this.contract_ids));
        }
        String str = this.cursor;
        if (str != null) {
            arrayList.add("cursor=" + Internal.sanitize(str));
        }
        Integer num = this.page_size;
        if (num != null) {
            arrayList.add("page_size=" + num);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetContractQuantitiesRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetContractQuantitiesRequest copy$default(GetContractQuantitiesRequest getContractQuantitiesRequest, String str, List list, String str2, Integer num, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getContractQuantitiesRequest.account_id;
        }
        if ((i & 2) != 0) {
            list = getContractQuantitiesRequest.contract_ids;
        }
        if ((i & 4) != 0) {
            str2 = getContractQuantitiesRequest.cursor;
        }
        if ((i & 8) != 0) {
            num = getContractQuantitiesRequest.page_size;
        }
        if ((i & 16) != 0) {
            byteString = getContractQuantitiesRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return getContractQuantitiesRequest.copy(str, list, str3, num, byteString2);
    }

    public final GetContractQuantitiesRequest copy(String account_id, List<String> contract_ids, String cursor, Integer page_size, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(contract_ids, "contract_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetContractQuantitiesRequest(account_id, contract_ids, cursor, page_size, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetContractQuantitiesRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetContractQuantitiesRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetContractQuantitiesRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetContractQuantitiesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getContract_ids()) + protoAdapter.encodedSizeWithTag(3, value.getCursor()) + ProtoAdapter.INT32.encodedSizeWithTag(4, value.getPage_size());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetContractQuantitiesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getContract_ids());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getCursor());
                ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) value.getPage_size());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetContractQuantitiesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) value.getPage_size());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getCursor());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getContract_ids());
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetContractQuantitiesRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                Integer numDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetContractQuantitiesRequest(strDecode, arrayList, strDecode2, numDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetContractQuantitiesRequest redact(GetContractQuantitiesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetContractQuantitiesRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}

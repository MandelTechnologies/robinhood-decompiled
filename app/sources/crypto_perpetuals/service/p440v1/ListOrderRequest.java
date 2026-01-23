package crypto_perpetuals.service.p440v1;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.order.p438v1.OrderStatus;
import crypto_perpetuals.order.p438v1.OrderType;
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
import p479j$.time.Instant;

/* compiled from: ListOrderRequest.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.Bk\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJq\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R\"\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010\u001eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010+R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b-\u0010+¨\u0006/"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ListOrderRequest;", "Lcom/squareup/wire/Message;", "", "", "Lcrypto_perpetuals/order/v1/OrderStatus;", "status_filter", "Lcrypto_perpetuals/order/v1/OrderType;", "type_filter", "", "contract_id_filter", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "updated_at_gte", "", "page_size", "token", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)Lcrypto_perpetuals/service/v1/ListOrderRequest;", "Lj$/time/Instant;", "getUpdated_at_gte", "()Lj$/time/Instant;", "Ljava/lang/Integer;", "getPage_size", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getToken", "Ljava/util/List;", "getStatus_filter", "()Ljava/util/List;", "getType_filter", "getContract_id_filter", "Companion", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ListOrderRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ListOrderRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractIdFilter", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<String> contract_id_filter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageSize", schemaIndex = 4, tag = 10)
    private final Integer page_size;

    @WireField(adapter = "crypto_perpetuals.order.v1.OrderStatus#ADAPTER", jsonName = "statusFilter", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<OrderStatus> status_filter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 11)
    private final String token;

    @WireField(adapter = "crypto_perpetuals.order.v1.OrderType#ADAPTER", jsonName = "typeFilter", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<OrderType> type_filter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAtGte", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant updated_at_gte;

    public ListOrderRequest() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27884newBuilder();
    }

    public /* synthetic */ ListOrderRequest(List list, List list2, List list3, Instant instant, Integer num, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getUpdated_at_gte() {
        return this.updated_at_gte;
    }

    public final Integer getPage_size() {
        return this.page_size;
    }

    public final String getToken() {
        return this.token;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListOrderRequest(List<? extends OrderStatus> status_filter, List<? extends OrderType> type_filter, List<String> contract_id_filter, Instant instant, Integer num, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(status_filter, "status_filter");
        Intrinsics.checkNotNullParameter(type_filter, "type_filter");
        Intrinsics.checkNotNullParameter(contract_id_filter, "contract_id_filter");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.updated_at_gte = instant;
        this.page_size = num;
        this.token = str;
        this.status_filter = Internal.immutableCopyOf("status_filter", status_filter);
        this.type_filter = Internal.immutableCopyOf("type_filter", type_filter);
        this.contract_id_filter = Internal.immutableCopyOf("contract_id_filter", contract_id_filter);
    }

    public final List<OrderStatus> getStatus_filter() {
        return this.status_filter;
    }

    public final List<OrderType> getType_filter() {
        return this.type_filter;
    }

    public final List<String> getContract_id_filter() {
        return this.contract_id_filter;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27884newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListOrderRequest)) {
            return false;
        }
        ListOrderRequest listOrderRequest = (ListOrderRequest) other;
        return Intrinsics.areEqual(unknownFields(), listOrderRequest.unknownFields()) && Intrinsics.areEqual(this.status_filter, listOrderRequest.status_filter) && Intrinsics.areEqual(this.type_filter, listOrderRequest.type_filter) && Intrinsics.areEqual(this.contract_id_filter, listOrderRequest.contract_id_filter) && Intrinsics.areEqual(this.updated_at_gte, listOrderRequest.updated_at_gte) && Intrinsics.areEqual(this.page_size, listOrderRequest.page_size) && Intrinsics.areEqual(this.token, listOrderRequest.token);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.status_filter.hashCode()) * 37) + this.type_filter.hashCode()) * 37) + this.contract_id_filter.hashCode()) * 37;
        Instant instant = this.updated_at_gte;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Integer num = this.page_size;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.token;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.status_filter.isEmpty()) {
            arrayList.add("status_filter=" + this.status_filter);
        }
        if (!this.type_filter.isEmpty()) {
            arrayList.add("type_filter=" + this.type_filter);
        }
        if (!this.contract_id_filter.isEmpty()) {
            arrayList.add("contract_id_filter=" + Internal.sanitize(this.contract_id_filter));
        }
        Instant instant = this.updated_at_gte;
        if (instant != null) {
            arrayList.add("updated_at_gte=" + instant);
        }
        Integer num = this.page_size;
        if (num != null) {
            arrayList.add("page_size=" + num);
        }
        String str = this.token;
        if (str != null) {
            arrayList.add("token=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListOrderRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ListOrderRequest copy$default(ListOrderRequest listOrderRequest, List list, List list2, List list3, Instant instant, Integer num, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listOrderRequest.status_filter;
        }
        if ((i & 2) != 0) {
            list2 = listOrderRequest.type_filter;
        }
        if ((i & 4) != 0) {
            list3 = listOrderRequest.contract_id_filter;
        }
        if ((i & 8) != 0) {
            instant = listOrderRequest.updated_at_gte;
        }
        if ((i & 16) != 0) {
            num = listOrderRequest.page_size;
        }
        if ((i & 32) != 0) {
            str = listOrderRequest.token;
        }
        if ((i & 64) != 0) {
            byteString = listOrderRequest.unknownFields();
        }
        String str2 = str;
        ByteString byteString2 = byteString;
        Integer num2 = num;
        List list4 = list3;
        return listOrderRequest.copy(list, list2, list4, instant, num2, str2, byteString2);
    }

    public final ListOrderRequest copy(List<? extends OrderStatus> status_filter, List<? extends OrderType> type_filter, List<String> contract_id_filter, Instant updated_at_gte, Integer page_size, String token, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(status_filter, "status_filter");
        Intrinsics.checkNotNullParameter(type_filter, "type_filter");
        Intrinsics.checkNotNullParameter(contract_id_filter, "contract_id_filter");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListOrderRequest(status_filter, type_filter, contract_id_filter, updated_at_gte, page_size, token, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListOrderRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListOrderRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.service.v1.ListOrderRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListOrderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + OrderStatus.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getStatus_filter()) + OrderType.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getType_filter());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getContract_id_filter());
                if (value.getUpdated_at_gte() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getUpdated_at_gte());
                }
                return iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(10, value.getPage_size()) + protoAdapter.encodedSizeWithTag(11, value.getToken());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListOrderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                OrderStatus.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getStatus_filter());
                OrderType.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getType_filter());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getContract_id_filter());
                if (value.getUpdated_at_gte() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getUpdated_at_gte());
                }
                ProtoAdapter.INT32.encodeWithTag(writer, 10, (int) value.getPage_size());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getToken());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListOrderRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 11, (int) value.getToken());
                ProtoAdapter.INT32.encodeWithTag(writer, 10, (int) value.getPage_size());
                if (value.getUpdated_at_gte() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getUpdated_at_gte());
                }
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getContract_id_filter());
                OrderType.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getType_filter());
                OrderStatus.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getStatus_filter());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ListOrderRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                Integer numDecode = null;
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ListOrderRequest(arrayList, arrayList2, arrayList3, instantDecode, numDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            OrderStatus.ADAPTER.tryDecode(reader, arrayList);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            OrderType.ADAPTER.tryDecode(reader, arrayList2);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        arrayList3.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 4) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 10) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else if (iNextTag == 11) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListOrderRequest redact(ListOrderRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant updated_at_gte = value.getUpdated_at_gte();
                return ListOrderRequest.copy$default(value, null, null, null, updated_at_gte != null ? ProtoAdapter.INSTANT.redact(updated_at_gte) : null, null, null, ByteString.EMPTY, 55, null);
            }
        };
    }
}

package crypto_perpetuals.service.p440v1;

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
import p479j$.time.Instant;

/* compiled from: ListMarginEditsRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BG\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JM\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b$\u0010\u0019¨\u0006&"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ListMarginEditsRequest;", "Lcom/squareup/wire/Message;", "", "", "contract_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "updated_at_gte", "", "page_size", "token", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)Lcrypto_perpetuals/service/v1/ListMarginEditsRequest;", "Ljava/lang/String;", "getContract_id", "Lj$/time/Instant;", "getUpdated_at_gte", "()Lj$/time/Instant;", "Ljava/lang/Integer;", "getPage_size", "()Ljava/lang/Integer;", "getToken", "Companion", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ListMarginEditsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ListMarginEditsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageSize", schemaIndex = 2, tag = 3)
    private final Integer page_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAtGte", schemaIndex = 1, tag = 2)
    private final Instant updated_at_gte;

    public ListMarginEditsRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27881newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
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

    public /* synthetic */ ListMarginEditsRequest(String str, Instant instant, Integer num, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMarginEditsRequest(String str, Instant instant, Integer num, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = str;
        this.updated_at_gte = instant;
        this.page_size = num;
        this.token = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27881newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListMarginEditsRequest)) {
            return false;
        }
        ListMarginEditsRequest listMarginEditsRequest = (ListMarginEditsRequest) other;
        return Intrinsics.areEqual(unknownFields(), listMarginEditsRequest.unknownFields()) && Intrinsics.areEqual(this.contract_id, listMarginEditsRequest.contract_id) && Intrinsics.areEqual(this.updated_at_gte, listMarginEditsRequest.updated_at_gte) && Intrinsics.areEqual(this.page_size, listMarginEditsRequest.page_size) && Intrinsics.areEqual(this.token, listMarginEditsRequest.token);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.contract_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Instant instant = this.updated_at_gte;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Integer num = this.page_size;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        String str2 = this.token;
        int iHashCode5 = iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.contract_id;
        if (str != null) {
            arrayList.add("contract_id=" + Internal.sanitize(str));
        }
        Instant instant = this.updated_at_gte;
        if (instant != null) {
            arrayList.add("updated_at_gte=" + instant);
        }
        Integer num = this.page_size;
        if (num != null) {
            arrayList.add("page_size=" + num);
        }
        String str2 = this.token;
        if (str2 != null) {
            arrayList.add("token=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListMarginEditsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ListMarginEditsRequest copy$default(ListMarginEditsRequest listMarginEditsRequest, String str, Instant instant, Integer num, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listMarginEditsRequest.contract_id;
        }
        if ((i & 2) != 0) {
            instant = listMarginEditsRequest.updated_at_gte;
        }
        if ((i & 4) != 0) {
            num = listMarginEditsRequest.page_size;
        }
        if ((i & 8) != 0) {
            str2 = listMarginEditsRequest.token;
        }
        if ((i & 16) != 0) {
            byteString = listMarginEditsRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        Integer num2 = num;
        return listMarginEditsRequest.copy(str, instant, num2, str2, byteString2);
    }

    public final ListMarginEditsRequest copy(String contract_id, Instant updated_at_gte, Integer page_size, String token, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListMarginEditsRequest(contract_id, updated_at_gte, page_size, token, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListMarginEditsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListMarginEditsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.service.v1.ListMarginEditsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListMarginEditsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getContract_id()) + ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getUpdated_at_gte()) + ProtoAdapter.INT32.encodedSizeWithTag(3, value.getPage_size()) + protoAdapter.encodedSizeWithTag(4, value.getToken());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListMarginEditsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getContract_id());
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getUpdated_at_gte());
                ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getPage_size());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getToken());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListMarginEditsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getToken());
                ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) value.getPage_size());
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getUpdated_at_gte());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListMarginEditsRequest redact(ListMarginEditsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant updated_at_gte = value.getUpdated_at_gte();
                return ListMarginEditsRequest.copy$default(value, null, updated_at_gte != null ? ProtoAdapter.INSTANT.redact(updated_at_gte) : null, null, null, ByteString.EMPTY, 13, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ListMarginEditsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                Instant instantDecode = null;
                Integer numDecode = null;
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ListMarginEditsRequest(strDecode, instantDecode, numDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 3) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}

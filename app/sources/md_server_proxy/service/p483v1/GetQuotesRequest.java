package md_server_proxy.service.p483v1;

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

/* compiled from: GetQuotesRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB=\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J<\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lmd_server_proxy/service/v1/GetQuotesRequest;", "Lcom/squareup/wire/Message;", "", "currency_pair_ids", "", "", "display_currency_codes", "Lmd_server_proxy/service/v1/CurrencyCode;", "routing_group", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getRouting_group", "()Ljava/lang/String;", "getCurrency_pair_ids", "()Ljava/util/List;", "getDisplay_currency_codes", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetQuotesRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetQuotesRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairIds", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<String> currency_pair_ids;

    @WireField(adapter = "md_server_proxy.service.v1.CurrencyCode#ADAPTER", jsonName = "displayCurrencyCodes", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<CurrencyCode> display_currency_codes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "routingGroup", schemaIndex = 2, tag = 3)
    private final String routing_group;

    public GetQuotesRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28917newBuilder();
    }

    public /* synthetic */ GetQuotesRequest(List list, List list2, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getRouting_group() {
        return this.routing_group;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetQuotesRequest(List<String> currency_pair_ids, List<? extends CurrencyCode> display_currency_codes, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_pair_ids, "currency_pair_ids");
        Intrinsics.checkNotNullParameter(display_currency_codes, "display_currency_codes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.routing_group = str;
        this.currency_pair_ids = Internal.immutableCopyOf("currency_pair_ids", currency_pair_ids);
        this.display_currency_codes = Internal.immutableCopyOf("display_currency_codes", display_currency_codes);
    }

    public final List<String> getCurrency_pair_ids() {
        return this.currency_pair_ids;
    }

    public final List<CurrencyCode> getDisplay_currency_codes() {
        return this.display_currency_codes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28917newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetQuotesRequest)) {
            return false;
        }
        GetQuotesRequest getQuotesRequest = (GetQuotesRequest) other;
        return Intrinsics.areEqual(unknownFields(), getQuotesRequest.unknownFields()) && Intrinsics.areEqual(this.currency_pair_ids, getQuotesRequest.currency_pair_ids) && Intrinsics.areEqual(this.display_currency_codes, getQuotesRequest.display_currency_codes) && Intrinsics.areEqual(this.routing_group, getQuotesRequest.routing_group);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.currency_pair_ids.hashCode()) * 37) + this.display_currency_codes.hashCode()) * 37;
        String str = this.routing_group;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.currency_pair_ids.isEmpty()) {
            arrayList.add("currency_pair_ids=" + Internal.sanitize(this.currency_pair_ids));
        }
        if (!this.display_currency_codes.isEmpty()) {
            arrayList.add("display_currency_codes=" + this.display_currency_codes);
        }
        String str = this.routing_group;
        if (str != null) {
            arrayList.add("routing_group=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetQuotesRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetQuotesRequest copy$default(GetQuotesRequest getQuotesRequest, List list, List list2, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getQuotesRequest.currency_pair_ids;
        }
        if ((i & 2) != 0) {
            list2 = getQuotesRequest.display_currency_codes;
        }
        if ((i & 4) != 0) {
            str = getQuotesRequest.routing_group;
        }
        if ((i & 8) != 0) {
            byteString = getQuotesRequest.unknownFields();
        }
        return getQuotesRequest.copy(list, list2, str, byteString);
    }

    public final GetQuotesRequest copy(List<String> currency_pair_ids, List<? extends CurrencyCode> display_currency_codes, String routing_group, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_pair_ids, "currency_pair_ids");
        Intrinsics.checkNotNullParameter(display_currency_codes, "display_currency_codes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetQuotesRequest(currency_pair_ids, display_currency_codes, routing_group, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetQuotesRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetQuotesRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: md_server_proxy.service.v1.GetQuotesRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetQuotesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getCurrency_pair_ids()) + CurrencyCode.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getDisplay_currency_codes()) + protoAdapter.encodedSizeWithTag(3, value.getRouting_group());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetQuotesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getCurrency_pair_ids());
                CurrencyCode.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getDisplay_currency_codes());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getRouting_group());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetQuotesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getRouting_group());
                CurrencyCode.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getDisplay_currency_codes());
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getCurrency_pair_ids());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetQuotesRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetQuotesRequest(arrayList, arrayList2, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 2) {
                        try {
                            CurrencyCode.ADAPTER.tryDecode(reader, arrayList2);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetQuotesRequest redact(GetQuotesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetQuotesRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}

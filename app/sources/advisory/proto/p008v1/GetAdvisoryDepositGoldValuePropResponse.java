package advisory.proto.p008v1;

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

/* compiled from: GetAdvisoryDepositGoldValuePropResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J&\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Ladvisory/proto/v1/GetAdvisoryDepositGoldValuePropResponse;", "Lcom/squareup/wire/Message;", "", "content", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContent;", "account_number", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContent;Ljava/lang/String;Lokio/ByteString;)V", "getContent", "()Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContent;", "getAccount_number", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetAdvisoryDepositGoldValuePropResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAdvisoryDepositGoldValuePropResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "advisory.proto.v1.AdvisoryDepositGoldValuePropContent#ADAPTER", schemaIndex = 0, tag = 1)
    private final AdvisoryDepositGoldValuePropContent content;

    public GetAdvisoryDepositGoldValuePropResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4423newBuilder();
    }

    public final AdvisoryDepositGoldValuePropContent getContent() {
        return this.content;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetAdvisoryDepositGoldValuePropResponse(AdvisoryDepositGoldValuePropContent advisoryDepositGoldValuePropContent, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advisoryDepositGoldValuePropContent, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAdvisoryDepositGoldValuePropResponse(AdvisoryDepositGoldValuePropContent advisoryDepositGoldValuePropContent, String account_number, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.content = advisoryDepositGoldValuePropContent;
        this.account_number = account_number;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4423newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAdvisoryDepositGoldValuePropResponse)) {
            return false;
        }
        GetAdvisoryDepositGoldValuePropResponse getAdvisoryDepositGoldValuePropResponse = (GetAdvisoryDepositGoldValuePropResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAdvisoryDepositGoldValuePropResponse.unknownFields()) && Intrinsics.areEqual(this.content, getAdvisoryDepositGoldValuePropResponse.content) && Intrinsics.areEqual(this.account_number, getAdvisoryDepositGoldValuePropResponse.account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        AdvisoryDepositGoldValuePropContent advisoryDepositGoldValuePropContent = this.content;
        int iHashCode2 = ((iHashCode + (advisoryDepositGoldValuePropContent != null ? advisoryDepositGoldValuePropContent.hashCode() : 0)) * 37) + this.account_number.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AdvisoryDepositGoldValuePropContent advisoryDepositGoldValuePropContent = this.content;
        if (advisoryDepositGoldValuePropContent != null) {
            arrayList.add("content=" + advisoryDepositGoldValuePropContent);
        }
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAdvisoryDepositGoldValuePropResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAdvisoryDepositGoldValuePropResponse copy$default(GetAdvisoryDepositGoldValuePropResponse getAdvisoryDepositGoldValuePropResponse, AdvisoryDepositGoldValuePropContent advisoryDepositGoldValuePropContent, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            advisoryDepositGoldValuePropContent = getAdvisoryDepositGoldValuePropResponse.content;
        }
        if ((i & 2) != 0) {
            str = getAdvisoryDepositGoldValuePropResponse.account_number;
        }
        if ((i & 4) != 0) {
            byteString = getAdvisoryDepositGoldValuePropResponse.unknownFields();
        }
        return getAdvisoryDepositGoldValuePropResponse.copy(advisoryDepositGoldValuePropContent, str, byteString);
    }

    public final GetAdvisoryDepositGoldValuePropResponse copy(AdvisoryDepositGoldValuePropContent content, String account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAdvisoryDepositGoldValuePropResponse(content, account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAdvisoryDepositGoldValuePropResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAdvisoryDepositGoldValuePropResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetAdvisoryDepositGoldValuePropResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAdvisoryDepositGoldValuePropResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + AdvisoryDepositGoldValuePropContent.ADAPTER.encodedSizeWithTag(1, value.getContent());
                return !Intrinsics.areEqual(value.getAccount_number(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAdvisoryDepositGoldValuePropResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisoryDepositGoldValuePropContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAdvisoryDepositGoldValuePropResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                AdvisoryDepositGoldValuePropContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAdvisoryDepositGoldValuePropResponse redact(GetAdvisoryDepositGoldValuePropResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisoryDepositGoldValuePropContent content = value.getContent();
                return GetAdvisoryDepositGoldValuePropResponse.copy$default(value, content != null ? AdvisoryDepositGoldValuePropContent.ADAPTER.redact(content) : null, null, ByteString.EMPTY, 2, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAdvisoryDepositGoldValuePropResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                AdvisoryDepositGoldValuePropContent advisoryDepositGoldValuePropContentDecode = null;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAdvisoryDepositGoldValuePropResponse(advisoryDepositGoldValuePropContentDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        advisoryDepositGoldValuePropContentDecode = AdvisoryDepositGoldValuePropContent.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}

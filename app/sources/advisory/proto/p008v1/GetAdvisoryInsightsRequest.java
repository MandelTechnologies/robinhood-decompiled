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
import yoda.service.insight.InsightType;

/* compiled from: GetAdvisoryInsightsRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JA\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u001eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Ladvisory/proto/v1/GetAdvisoryInsightsRequest;", "Lcom/squareup/wire/Message;", "", "cursor", "", "page_size", "", "account_number", "insight_type", "Lyoda/service/insight/InsightType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lyoda/service/insight/InsightType;Lokio/ByteString;)V", "getCursor", "()Ljava/lang/String;", "getPage_size", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAccount_number", "getInsight_type", "()Lyoda/service/insight/InsightType;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lyoda/service/insight/InsightType;Lokio/ByteString;)Ladvisory/proto/v1/GetAdvisoryInsightsRequest;", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetAdvisoryInsightsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetAdvisoryInsightsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String cursor;

    @WireField(adapter = "yoda.service.insight.InsightType#ADAPTER", jsonName = "insightType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final InsightType insight_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageSize", schemaIndex = 1, tag = 2)
    private final Integer page_size;

    public GetAdvisoryInsightsRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4429newBuilder();
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Integer getPage_size() {
        return this.page_size;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ GetAdvisoryInsightsRequest(String str, Integer num, String str2, InsightType insightType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? InsightType.INSIGHT_TYPE_UNSPECIFIED : insightType, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final InsightType getInsight_type() {
        return this.insight_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAdvisoryInsightsRequest(String str, Integer num, String account_number, InsightType insight_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(insight_type, "insight_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.cursor = str;
        this.page_size = num;
        this.account_number = account_number;
        this.insight_type = insight_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4429newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAdvisoryInsightsRequest)) {
            return false;
        }
        GetAdvisoryInsightsRequest getAdvisoryInsightsRequest = (GetAdvisoryInsightsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getAdvisoryInsightsRequest.unknownFields()) && Intrinsics.areEqual(this.cursor, getAdvisoryInsightsRequest.cursor) && Intrinsics.areEqual(this.page_size, getAdvisoryInsightsRequest.page_size) && Intrinsics.areEqual(this.account_number, getAdvisoryInsightsRequest.account_number) && this.insight_type == getAdvisoryInsightsRequest.insight_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.cursor;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.page_size;
        int iHashCode3 = ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 37) + this.account_number.hashCode()) * 37) + this.insight_type.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.cursor;
        if (str != null) {
            arrayList.add("cursor=" + Internal.sanitize(str));
        }
        Integer num = this.page_size;
        if (num != null) {
            arrayList.add("page_size=" + num);
        }
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("insight_type=" + this.insight_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAdvisoryInsightsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAdvisoryInsightsRequest copy$default(GetAdvisoryInsightsRequest getAdvisoryInsightsRequest, String str, Integer num, String str2, InsightType insightType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAdvisoryInsightsRequest.cursor;
        }
        if ((i & 2) != 0) {
            num = getAdvisoryInsightsRequest.page_size;
        }
        if ((i & 4) != 0) {
            str2 = getAdvisoryInsightsRequest.account_number;
        }
        if ((i & 8) != 0) {
            insightType = getAdvisoryInsightsRequest.insight_type;
        }
        if ((i & 16) != 0) {
            byteString = getAdvisoryInsightsRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return getAdvisoryInsightsRequest.copy(str, num, str3, insightType, byteString2);
    }

    public final GetAdvisoryInsightsRequest copy(String cursor, Integer page_size, String account_number, InsightType insight_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(insight_type, "insight_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAdvisoryInsightsRequest(cursor, page_size, account_number, insight_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAdvisoryInsightsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAdvisoryInsightsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetAdvisoryInsightsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAdvisoryInsightsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getCursor()) + ProtoAdapter.INT32.encodedSizeWithTag(2, value.getPage_size());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getAccount_number());
                }
                return value.getInsight_type() != InsightType.INSIGHT_TYPE_UNSPECIFIED ? iEncodedSizeWithTag + InsightType.ADAPTER.encodedSizeWithTag(4, value.getInsight_type()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAdvisoryInsightsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getCursor());
                ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) value.getPage_size());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                if (value.getInsight_type() != InsightType.INSIGHT_TYPE_UNSPECIFIED) {
                    InsightType.ADAPTER.encodeWithTag(writer, 4, (int) value.getInsight_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAdvisoryInsightsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getInsight_type() != InsightType.INSIGHT_TYPE_UNSPECIFIED) {
                    InsightType.ADAPTER.encodeWithTag(writer, 4, (int) value.getInsight_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) value.getPage_size());
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCursor());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAdvisoryInsightsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InsightType insightType = InsightType.INSIGHT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Integer numDecode = null;
                String strDecode = "";
                InsightType insightTypeDecode = insightType;
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAdvisoryInsightsRequest(strDecode2, numDecode, strDecode, insightTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        try {
                            insightTypeDecode = InsightType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAdvisoryInsightsRequest redact(GetAdvisoryInsightsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAdvisoryInsightsRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}

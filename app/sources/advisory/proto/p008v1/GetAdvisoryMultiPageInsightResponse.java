package advisory.proto.p008v1;

import com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDeeplinkTarget;
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

/* compiled from: GetAdvisoryMultiPageInsightResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Ladvisory/proto/v1/GetAdvisoryMultiPageInsightResponse;", "Lcom/squareup/wire/Message;", "", AdvisoryInsightDetailDeeplinkTarget.INSIGHT_ID_QUERY_PARAM, "", "account_number", "child_insights", "", "Ladvisory/proto/v1/AdvisoryInsight;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getInsight_id", "()Ljava/lang/String;", "getAccount_number", "getChild_insights", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetAdvisoryMultiPageInsightResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAdvisoryMultiPageInsightResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "advisory.proto.v1.AdvisoryInsight#ADAPTER", jsonName = "childInsights", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<AdvisoryInsight> child_insights;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "insightId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String insight_id;

    public GetAdvisoryMultiPageInsightResponse() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ GetAdvisoryMultiPageInsightResponse(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4434newBuilder();
    }

    public final String getInsight_id() {
        return this.insight_id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAdvisoryMultiPageInsightResponse(String insight_id, String account_number, List<AdvisoryInsight> child_insights, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(insight_id, "insight_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(child_insights, "child_insights");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.insight_id = insight_id;
        this.account_number = account_number;
        this.child_insights = Internal.immutableCopyOf("child_insights", child_insights);
    }

    public final List<AdvisoryInsight> getChild_insights() {
        return this.child_insights;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4434newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAdvisoryMultiPageInsightResponse)) {
            return false;
        }
        GetAdvisoryMultiPageInsightResponse getAdvisoryMultiPageInsightResponse = (GetAdvisoryMultiPageInsightResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAdvisoryMultiPageInsightResponse.unknownFields()) && Intrinsics.areEqual(this.insight_id, getAdvisoryMultiPageInsightResponse.insight_id) && Intrinsics.areEqual(this.account_number, getAdvisoryMultiPageInsightResponse.account_number) && Intrinsics.areEqual(this.child_insights, getAdvisoryMultiPageInsightResponse.child_insights);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.insight_id.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.child_insights.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("insight_id=" + Internal.sanitize(this.insight_id));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        if (!this.child_insights.isEmpty()) {
            arrayList.add("child_insights=" + this.child_insights);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAdvisoryMultiPageInsightResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetAdvisoryMultiPageInsightResponse copy$default(GetAdvisoryMultiPageInsightResponse getAdvisoryMultiPageInsightResponse, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAdvisoryMultiPageInsightResponse.insight_id;
        }
        if ((i & 2) != 0) {
            str2 = getAdvisoryMultiPageInsightResponse.account_number;
        }
        if ((i & 4) != 0) {
            list = getAdvisoryMultiPageInsightResponse.child_insights;
        }
        if ((i & 8) != 0) {
            byteString = getAdvisoryMultiPageInsightResponse.unknownFields();
        }
        return getAdvisoryMultiPageInsightResponse.copy(str, str2, list, byteString);
    }

    public final GetAdvisoryMultiPageInsightResponse copy(String insight_id, String account_number, List<AdvisoryInsight> child_insights, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(insight_id, "insight_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(child_insights, "child_insights");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAdvisoryMultiPageInsightResponse(insight_id, account_number, child_insights, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAdvisoryMultiPageInsightResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAdvisoryMultiPageInsightResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetAdvisoryMultiPageInsightResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAdvisoryMultiPageInsightResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInsight_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInsight_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                return size + AdvisoryInsight.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getChild_insights());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAdvisoryMultiPageInsightResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInsight_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInsight_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                AdvisoryInsight.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getChild_insights());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAdvisoryMultiPageInsightResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AdvisoryInsight.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getChild_insights());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (Intrinsics.areEqual(value.getInsight_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInsight_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAdvisoryMultiPageInsightResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAdvisoryMultiPageInsightResponse(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(AdvisoryInsight.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAdvisoryMultiPageInsightResponse redact(GetAdvisoryMultiPageInsightResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAdvisoryMultiPageInsightResponse.copy$default(value, null, null, Internal.m26823redactElements(value.getChild_insights(), AdvisoryInsight.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }
}

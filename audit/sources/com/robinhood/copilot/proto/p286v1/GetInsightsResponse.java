package com.robinhood.copilot.proto.p286v1;

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

/* compiled from: GetInsightsResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B+\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J*\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetInsightsResponse;", "Lcom/squareup/wire/Message;", "", "insights", "", "Lcom/robinhood/copilot/proto/v1/Insight;", "next_page_token", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getNext_page_token", "()Ljava/lang/String;", "getInsights", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetInsightsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetInsightsResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.Insight#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<Insight> insights;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nextPageToken", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String next_page_token;

    public GetInsightsResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22113newBuilder();
    }

    public /* synthetic */ GetInsightsResponse(List list, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getNext_page_token() {
        return this.next_page_token;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInsightsResponse(List<Insight> insights, String next_page_token, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(insights, "insights");
        Intrinsics.checkNotNullParameter(next_page_token, "next_page_token");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.next_page_token = next_page_token;
        this.insights = Internal.immutableCopyOf("insights", insights);
    }

    public final List<Insight> getInsights() {
        return this.insights;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22113newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetInsightsResponse)) {
            return false;
        }
        GetInsightsResponse getInsightsResponse = (GetInsightsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getInsightsResponse.unknownFields()) && Intrinsics.areEqual(this.insights, getInsightsResponse.insights) && Intrinsics.areEqual(this.next_page_token, getInsightsResponse.next_page_token);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.insights.hashCode()) * 37) + this.next_page_token.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.insights.isEmpty()) {
            arrayList.add("insights=" + this.insights);
        }
        arrayList.add("next_page_token=" + Internal.sanitize(this.next_page_token));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInsightsResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetInsightsResponse copy$default(GetInsightsResponse getInsightsResponse, List list, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getInsightsResponse.insights;
        }
        if ((i & 2) != 0) {
            str = getInsightsResponse.next_page_token;
        }
        if ((i & 4) != 0) {
            byteString = getInsightsResponse.unknownFields();
        }
        return getInsightsResponse.copy(list, str, byteString);
    }

    public final GetInsightsResponse copy(List<Insight> insights, String next_page_token, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(insights, "insights");
        Intrinsics.checkNotNullParameter(next_page_token, "next_page_token");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetInsightsResponse(insights, next_page_token, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetInsightsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetInsightsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.GetInsightsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetInsightsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + Insight.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getInsights());
                return !Intrinsics.areEqual(value.getNext_page_token(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNext_page_token()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetInsightsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Insight.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getInsights());
                if (!Intrinsics.areEqual(value.getNext_page_token(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNext_page_token());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetInsightsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getNext_page_token(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNext_page_token());
                }
                Insight.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getInsights());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetInsightsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetInsightsResponse(arrayList, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(Insight.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetInsightsResponse redact(GetInsightsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetInsightsResponse.copy$default(value, Internal.m26823redactElements(value.getInsights(), Insight.ADAPTER), null, ByteString.EMPTY, 2, null);
            }
        };
    }
}

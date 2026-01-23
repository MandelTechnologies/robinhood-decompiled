package com.robinhood.copilot.proto.p286v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: GetLatestInsightResponse.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B/\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponse;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/copilot/proto/v1/Insight;", "insight", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_updated_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/copilot/proto/v1/Insight;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/copilot/proto/v1/Insight;Lj$/time/Instant;Lokio/ByteString;)Lcom/robinhood/copilot/proto/v1/GetLatestInsightResponse;", "Lcom/robinhood/copilot/proto/v1/Insight;", "getInsight", "()Lcom/robinhood/copilot/proto/v1/Insight;", "Lj$/time/Instant;", "getLast_updated_at", "()Lj$/time/Instant;", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetLatestInsightResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetLatestInsightResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.Insight#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Insight insight;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant last_updated_at;

    public GetLatestInsightResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22128newBuilder();
    }

    public final Insight getInsight() {
        return this.insight;
    }

    public final Instant getLast_updated_at() {
        return this.last_updated_at;
    }

    public /* synthetic */ GetLatestInsightResponse(Insight insight, Instant instant, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : insight, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestInsightResponse(Insight insight, Instant instant, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.insight = insight;
        this.last_updated_at = instant;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22128newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetLatestInsightResponse)) {
            return false;
        }
        GetLatestInsightResponse getLatestInsightResponse = (GetLatestInsightResponse) other;
        return Intrinsics.areEqual(unknownFields(), getLatestInsightResponse.unknownFields()) && Intrinsics.areEqual(this.insight, getLatestInsightResponse.insight) && Intrinsics.areEqual(this.last_updated_at, getLatestInsightResponse.last_updated_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Insight insight = this.insight;
        int iHashCode2 = (iHashCode + (insight != null ? insight.hashCode() : 0)) * 37;
        Instant instant = this.last_updated_at;
        int iHashCode3 = iHashCode2 + (instant != null ? instant.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Insight insight = this.insight;
        if (insight != null) {
            arrayList.add("insight=" + insight);
        }
        Instant instant = this.last_updated_at;
        if (instant != null) {
            arrayList.add("last_updated_at=" + instant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLatestInsightResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetLatestInsightResponse copy$default(GetLatestInsightResponse getLatestInsightResponse, Insight insight, Instant instant, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            insight = getLatestInsightResponse.insight;
        }
        if ((i & 2) != 0) {
            instant = getLatestInsightResponse.last_updated_at;
        }
        if ((i & 4) != 0) {
            byteString = getLatestInsightResponse.unknownFields();
        }
        return getLatestInsightResponse.copy(insight, instant, byteString);
    }

    public final GetLatestInsightResponse copy(Insight insight, Instant last_updated_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetLatestInsightResponse(insight, last_updated_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetLatestInsightResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetLatestInsightResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.GetLatestInsightResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetLatestInsightResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getInsight() != null) {
                    size += Insight.ADAPTER.encodedSizeWithTag(1, value.getInsight());
                }
                return value.getLast_updated_at() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getLast_updated_at()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetLatestInsightResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getInsight() != null) {
                    Insight.ADAPTER.encodeWithTag(writer, 1, (int) value.getInsight());
                }
                if (value.getLast_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getLast_updated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetLatestInsightResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLast_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getLast_updated_at());
                }
                if (value.getInsight() != null) {
                    Insight.ADAPTER.encodeWithTag(writer, 1, (int) value.getInsight());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestInsightResponse redact(GetLatestInsightResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Insight insight = value.getInsight();
                Insight insightRedact = insight != null ? Insight.ADAPTER.redact(insight) : null;
                Instant last_updated_at = value.getLast_updated_at();
                return value.copy(insightRedact, last_updated_at != null ? ProtoAdapter.INSTANT.redact(last_updated_at) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestInsightResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Insight insightDecode = null;
                Instant instantDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetLatestInsightResponse(insightDecode, instantDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        insightDecode = Insight.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}

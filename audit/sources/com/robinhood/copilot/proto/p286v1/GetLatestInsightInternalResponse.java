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
import p479j$.time.Instant;

/* compiled from: GetLatestInsightInternalResponse.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B=\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJC\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponse;", "Lcom/squareup/wire/Message;", "", "", "Lcom/robinhood/copilot/proto/v1/InsightV2;", "insights", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_updated_at", "Lcom/robinhood/copilot/proto/v1/CopilotStatus;", "copilot_status", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/util/List;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatus;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/CopilotStatus;Lokio/ByteString;)Lcom/robinhood/copilot/proto/v1/GetLatestInsightInternalResponse;", "Lj$/time/Instant;", "getLast_updated_at", "()Lj$/time/Instant;", "Lcom/robinhood/copilot/proto/v1/CopilotStatus;", "getCopilot_status", "()Lcom/robinhood/copilot/proto/v1/CopilotStatus;", "Ljava/util/List;", "getInsights", "()Ljava/util/List;", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetLatestInsightInternalResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetLatestInsightInternalResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.CopilotStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 5)
    private final CopilotStatus copilot_status;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.InsightV2#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<InsightV2> insights;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant last_updated_at;

    public GetLatestInsightInternalResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22123newBuilder();
    }

    public /* synthetic */ GetLatestInsightInternalResponse(List list, Instant instant, CopilotStatus copilotStatus, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? CopilotStatus.COPILOT_STATUS_UNSPECIFIED : copilotStatus, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getLast_updated_at() {
        return this.last_updated_at;
    }

    public final CopilotStatus getCopilot_status() {
        return this.copilot_status;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestInsightInternalResponse(List<InsightV2> insights, Instant instant, CopilotStatus copilot_status, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(insights, "insights");
        Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.last_updated_at = instant;
        this.copilot_status = copilot_status;
        this.insights = Internal.immutableCopyOf("insights", insights);
    }

    public final List<InsightV2> getInsights() {
        return this.insights;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22123newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetLatestInsightInternalResponse)) {
            return false;
        }
        GetLatestInsightInternalResponse getLatestInsightInternalResponse = (GetLatestInsightInternalResponse) other;
        return Intrinsics.areEqual(unknownFields(), getLatestInsightInternalResponse.unknownFields()) && Intrinsics.areEqual(this.insights, getLatestInsightInternalResponse.insights) && Intrinsics.areEqual(this.last_updated_at, getLatestInsightInternalResponse.last_updated_at) && this.copilot_status == getLatestInsightInternalResponse.copilot_status;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.insights.hashCode()) * 37;
        Instant instant = this.last_updated_at;
        int iHashCode2 = ((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.copilot_status.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.insights.isEmpty()) {
            arrayList.add("insights=" + this.insights);
        }
        Instant instant = this.last_updated_at;
        if (instant != null) {
            arrayList.add("last_updated_at=" + instant);
        }
        arrayList.add("copilot_status=" + this.copilot_status);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLatestInsightInternalResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetLatestInsightInternalResponse copy$default(GetLatestInsightInternalResponse getLatestInsightInternalResponse, List list, Instant instant, CopilotStatus copilotStatus, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getLatestInsightInternalResponse.insights;
        }
        if ((i & 2) != 0) {
            instant = getLatestInsightInternalResponse.last_updated_at;
        }
        if ((i & 4) != 0) {
            copilotStatus = getLatestInsightInternalResponse.copilot_status;
        }
        if ((i & 8) != 0) {
            byteString = getLatestInsightInternalResponse.unknownFields();
        }
        return getLatestInsightInternalResponse.copy(list, instant, copilotStatus, byteString);
    }

    public final GetLatestInsightInternalResponse copy(List<InsightV2> insights, Instant last_updated_at, CopilotStatus copilot_status, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(insights, "insights");
        Intrinsics.checkNotNullParameter(copilot_status, "copilot_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetLatestInsightInternalResponse(insights, last_updated_at, copilot_status, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetLatestInsightInternalResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetLatestInsightInternalResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.GetLatestInsightInternalResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetLatestInsightInternalResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + InsightV2.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getInsights());
                if (value.getLast_updated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getLast_updated_at());
                }
                return value.getCopilot_status() != CopilotStatus.COPILOT_STATUS_UNSPECIFIED ? size + CopilotStatus.ADAPTER.encodedSizeWithTag(5, value.getCopilot_status()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetLatestInsightInternalResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                InsightV2.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getInsights());
                if (value.getLast_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getLast_updated_at());
                }
                if (value.getCopilot_status() != CopilotStatus.COPILOT_STATUS_UNSPECIFIED) {
                    CopilotStatus.ADAPTER.encodeWithTag(writer, 5, (int) value.getCopilot_status());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetLatestInsightInternalResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCopilot_status() != CopilotStatus.COPILOT_STATUS_UNSPECIFIED) {
                    CopilotStatus.ADAPTER.encodeWithTag(writer, 5, (int) value.getCopilot_status());
                }
                if (value.getLast_updated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getLast_updated_at());
                }
                InsightV2.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getInsights());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestInsightInternalResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                CopilotStatus copilotStatusDecode = CopilotStatus.COPILOT_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetLatestInsightInternalResponse(arrayList, instantDecode, copilotStatusDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(InsightV2.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 5) {
                        try {
                            copilotStatusDecode = CopilotStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetLatestInsightInternalResponse redact(GetLatestInsightInternalResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getInsights(), InsightV2.ADAPTER);
                Instant last_updated_at = value.getLast_updated_at();
                return GetLatestInsightInternalResponse.copy$default(value, listM26823redactElements, last_updated_at != null ? ProtoAdapter.INSTANT.redact(last_updated_at) : null, null, ByteString.EMPTY, 4, null);
            }
        };
    }
}

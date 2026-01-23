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

/* compiled from: CreateInsightsInternalResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/CreateInsightsInternalResponse;", "Lcom/squareup/wire/Message;", "", "success", "", "message", "", "created_insight_ids", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLjava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getSuccess", "()Z", "getMessage", "()Ljava/lang/String;", "getCreated_insight_ids", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CreateInsightsInternalResponse extends Message {

    @JvmField
    public static final ProtoAdapter<CreateInsightsInternalResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdInsightIds", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<String> created_insight_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean success;

    public CreateInsightsInternalResponse() {
        this(false, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22085newBuilder();
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getMessage() {
        return this.message;
    }

    public /* synthetic */ CreateInsightsInternalResponse(boolean z, String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateInsightsInternalResponse(boolean z, String message, List<String> created_insight_ids, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(created_insight_ids, "created_insight_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.success = z;
        this.message = message;
        this.created_insight_ids = Internal.immutableCopyOf("created_insight_ids", created_insight_ids);
    }

    public final List<String> getCreated_insight_ids() {
        return this.created_insight_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22085newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateInsightsInternalResponse)) {
            return false;
        }
        CreateInsightsInternalResponse createInsightsInternalResponse = (CreateInsightsInternalResponse) other;
        return Intrinsics.areEqual(unknownFields(), createInsightsInternalResponse.unknownFields()) && this.success == createInsightsInternalResponse.success && Intrinsics.areEqual(this.message, createInsightsInternalResponse.message) && Intrinsics.areEqual(this.created_insight_ids, createInsightsInternalResponse.created_insight_ids);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.success)) * 37) + this.message.hashCode()) * 37) + this.created_insight_ids.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("success=" + this.success);
        arrayList.add("message=" + Internal.sanitize(this.message));
        if (!this.created_insight_ids.isEmpty()) {
            arrayList.add("created_insight_ids=" + Internal.sanitize(this.created_insight_ids));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateInsightsInternalResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateInsightsInternalResponse copy$default(CreateInsightsInternalResponse createInsightsInternalResponse, boolean z, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = createInsightsInternalResponse.success;
        }
        if ((i & 2) != 0) {
            str = createInsightsInternalResponse.message;
        }
        if ((i & 4) != 0) {
            list = createInsightsInternalResponse.created_insight_ids;
        }
        if ((i & 8) != 0) {
            byteString = createInsightsInternalResponse.unknownFields();
        }
        return createInsightsInternalResponse.copy(z, str, list, byteString);
    }

    public final CreateInsightsInternalResponse copy(boolean success, String message, List<String> created_insight_ids, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(created_insight_ids, "created_insight_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateInsightsInternalResponse(success, message, created_insight_ids, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateInsightsInternalResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateInsightsInternalResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.CreateInsightsInternalResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateInsightsInternalResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSuccess()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getSuccess()));
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMessage());
                }
                return size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, value.getCreated_insight_ids());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateInsightsInternalResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSuccess()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getSuccess()));
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 3, (int) value.getCreated_insight_ids());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateInsightsInternalResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getCreated_insight_ids());
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getMessage());
                }
                if (value.getSuccess()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getSuccess()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateInsightsInternalResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CreateInsightsInternalResponse(zBooleanValue, strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateInsightsInternalResponse redact(CreateInsightsInternalResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CreateInsightsInternalResponse.copy$default(value, false, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}

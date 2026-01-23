package nimbus.service.p511v1;

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

/* compiled from: CreateAssetTransferResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lnimbus/service/v1/CreateAssetTransferResponse;", "Lcom/squareup/wire/Message;", "", "id", "", "verification_workflow", "Lnimbus/service/v1/VerificationWorkflow;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lnimbus/service/v1/VerificationWorkflow;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getVerification_workflow", "()Lnimbus/service/v1/VerificationWorkflow;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class CreateAssetTransferResponse extends Message {

    @JvmField
    public static final ProtoAdapter<CreateAssetTransferResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "nimbus.service.v1.VerificationWorkflow#ADAPTER", jsonName = "verificationWorkflow", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final VerificationWorkflow verification_workflow;

    public CreateAssetTransferResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29356newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ CreateAssetTransferResponse(String str, VerificationWorkflow verificationWorkflow, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : verificationWorkflow, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final VerificationWorkflow getVerification_workflow() {
        return this.verification_workflow;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateAssetTransferResponse(String id, VerificationWorkflow verificationWorkflow, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.verification_workflow = verificationWorkflow;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29356newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateAssetTransferResponse)) {
            return false;
        }
        CreateAssetTransferResponse createAssetTransferResponse = (CreateAssetTransferResponse) other;
        return Intrinsics.areEqual(unknownFields(), createAssetTransferResponse.unknownFields()) && Intrinsics.areEqual(this.id, createAssetTransferResponse.id) && Intrinsics.areEqual(this.verification_workflow, createAssetTransferResponse.verification_workflow);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37;
        VerificationWorkflow verificationWorkflow = this.verification_workflow;
        int iHashCode2 = iHashCode + (verificationWorkflow != null ? verificationWorkflow.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        VerificationWorkflow verificationWorkflow = this.verification_workflow;
        if (verificationWorkflow != null) {
            arrayList.add("verification_workflow=" + verificationWorkflow);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateAssetTransferResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateAssetTransferResponse copy$default(CreateAssetTransferResponse createAssetTransferResponse, String str, VerificationWorkflow verificationWorkflow, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createAssetTransferResponse.id;
        }
        if ((i & 2) != 0) {
            verificationWorkflow = createAssetTransferResponse.verification_workflow;
        }
        if ((i & 4) != 0) {
            byteString = createAssetTransferResponse.unknownFields();
        }
        return createAssetTransferResponse.copy(str, verificationWorkflow, byteString);
    }

    public final CreateAssetTransferResponse copy(String id, VerificationWorkflow verification_workflow, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateAssetTransferResponse(id, verification_workflow, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateAssetTransferResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateAssetTransferResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nimbus.service.v1.CreateAssetTransferResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateAssetTransferResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                return value.getVerification_workflow() != null ? size + VerificationWorkflow.ADAPTER.encodedSizeWithTag(2, value.getVerification_workflow()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateAssetTransferResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getVerification_workflow() != null) {
                    VerificationWorkflow.ADAPTER.encodeWithTag(writer, 2, (int) value.getVerification_workflow());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateAssetTransferResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getVerification_workflow() != null) {
                    VerificationWorkflow.ADAPTER.encodeWithTag(writer, 2, (int) value.getVerification_workflow());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateAssetTransferResponse redact(CreateAssetTransferResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                VerificationWorkflow verification_workflow = value.getVerification_workflow();
                return CreateAssetTransferResponse.copy$default(value, null, verification_workflow != null ? VerificationWorkflow.ADAPTER.redact(verification_workflow) : null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateAssetTransferResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                VerificationWorkflow verificationWorkflowDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CreateAssetTransferResponse(strDecode, verificationWorkflowDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        verificationWorkflowDecode = VerificationWorkflow.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}

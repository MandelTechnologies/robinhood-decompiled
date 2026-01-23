package identi.service.p471v1.models_workflow.p472v1;

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

/* compiled from: KycStatusCheck.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB!\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m3636d2 = {"identi/service/v1/models_workflow/v1/KycStatusCheck$ScreenParams", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ScreenParams;", "", "", "", "document_request_ids", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ScreenParams;", "Ljava/util/List;", "getDocument_request_ids", "()Ljava/util/List;", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class KycStatusCheck$ScreenParams extends Message {

    @JvmField
    public static final ProtoAdapter<KycStatusCheck$ScreenParams> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "documentRequestIds", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<String> document_request_ids;

    /* JADX WARN: Multi-variable type inference failed */
    public KycStatusCheck$ScreenParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28363newBuilder();
    }

    public /* synthetic */ KycStatusCheck$ScreenParams(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycStatusCheck$ScreenParams(List<String> document_request_ids, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(document_request_ids, "document_request_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.document_request_ids = Internal.immutableCopyOf("document_request_ids", document_request_ids);
    }

    public final List<String> getDocument_request_ids() {
        return this.document_request_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28363newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof KycStatusCheck$ScreenParams)) {
            return false;
        }
        KycStatusCheck$ScreenParams kycStatusCheck$ScreenParams = (KycStatusCheck$ScreenParams) other;
        return Intrinsics.areEqual(unknownFields(), kycStatusCheck$ScreenParams.unknownFields()) && Intrinsics.areEqual(this.document_request_ids, kycStatusCheck$ScreenParams.document_request_ids);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.document_request_ids.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.document_request_ids.isEmpty()) {
            arrayList.add("document_request_ids=" + Internal.sanitize(this.document_request_ids));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenParams{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycStatusCheck$ScreenParams copy$default(KycStatusCheck$ScreenParams kycStatusCheck$ScreenParams, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kycStatusCheck$ScreenParams.document_request_ids;
        }
        if ((i & 2) != 0) {
            byteString = kycStatusCheck$ScreenParams.unknownFields();
        }
        return kycStatusCheck$ScreenParams.copy(list, byteString);
    }

    public final KycStatusCheck$ScreenParams copy(List<String> document_request_ids, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(document_request_ids, "document_request_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new KycStatusCheck$ScreenParams(document_request_ids, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(KycStatusCheck$ScreenParams.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<KycStatusCheck$ScreenParams>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.KycStatusCheck$ScreenParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(KycStatusCheck$ScreenParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.getDocument_request_ids());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, KycStatusCheck$ScreenParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getDocument_request_ids());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, KycStatusCheck$ScreenParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getDocument_request_ids());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public KycStatusCheck$ScreenParams decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new KycStatusCheck$ScreenParams(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public KycStatusCheck$ScreenParams redact(KycStatusCheck$ScreenParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return KycStatusCheck$ScreenParams.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}

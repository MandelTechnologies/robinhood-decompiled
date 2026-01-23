package identi.service.p471v1.models_workflow.p472v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import identi.service.p471v1.models_workflow.p472v1.KycStatusCheck$ActionResponse;
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

/* compiled from: KycStatusCheck.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001c\u001dB\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m3636d2 = {"identi/service/v1/models_workflow/v1/KycStatusCheck$ActionResponse", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ActionResponse;", "", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ActionResponse$Uploaded;", "uploaded", "Lokio/ByteString;", "unknownFields", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ActionResponse$Uploaded;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ActionResponse$Uploaded;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ActionResponse;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ActionResponse$Uploaded;", "getUploaded", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ActionResponse$Uploaded;", "Companion", "Uploaded", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class KycStatusCheck$ActionResponse extends Message {

    @JvmField
    public static final ProtoAdapter<KycStatusCheck$ActionResponse> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.KycStatusCheck$ActionResponse$Uploaded#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
    private final Uploaded uploaded;

    /* JADX WARN: Multi-variable type inference failed */
    public KycStatusCheck$ActionResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28361newBuilder();
    }

    public final Uploaded getUploaded() {
        return this.uploaded;
    }

    public /* synthetic */ KycStatusCheck$ActionResponse(Uploaded uploaded, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uploaded, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycStatusCheck$ActionResponse(Uploaded uploaded, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.uploaded = uploaded;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28361newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof KycStatusCheck$ActionResponse)) {
            return false;
        }
        KycStatusCheck$ActionResponse kycStatusCheck$ActionResponse = (KycStatusCheck$ActionResponse) other;
        return Intrinsics.areEqual(unknownFields(), kycStatusCheck$ActionResponse.unknownFields()) && Intrinsics.areEqual(this.uploaded, kycStatusCheck$ActionResponse.uploaded);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Uploaded uploaded = this.uploaded;
        int iHashCode2 = iHashCode + (uploaded != null ? uploaded.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Uploaded uploaded = this.uploaded;
        if (uploaded != null) {
            arrayList.add("uploaded=" + uploaded);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActionResponse{", "}", 0, null, null, 56, null);
    }

    public final KycStatusCheck$ActionResponse copy(Uploaded uploaded, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new KycStatusCheck$ActionResponse(uploaded, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(KycStatusCheck$ActionResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<KycStatusCheck$ActionResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.KycStatusCheck$ActionResponse$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public KycStatusCheck$ActionResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                KycStatusCheck$ActionResponse.Uploaded uploadedDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new KycStatusCheck$ActionResponse(uploadedDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        uploadedDecode = KycStatusCheck$ActionResponse.Uploaded.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(KycStatusCheck$ActionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + KycStatusCheck$ActionResponse.Uploaded.ADAPTER.encodedSizeWithTag(1, value.getUploaded());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, KycStatusCheck$ActionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                KycStatusCheck$ActionResponse.Uploaded.ADAPTER.encodeWithTag(writer, 1, (int) value.getUploaded());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, KycStatusCheck$ActionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                KycStatusCheck$ActionResponse.Uploaded.ADAPTER.encodeWithTag(writer, 1, (int) value.getUploaded());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public KycStatusCheck$ActionResponse redact(KycStatusCheck$ActionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                KycStatusCheck$ActionResponse.Uploaded uploaded = value.getUploaded();
                return value.copy(uploaded != null ? KycStatusCheck$ActionResponse.Uploaded.ADAPTER.redact(uploaded) : null, ByteString.EMPTY);
            }
        };
    }

    /* compiled from: KycStatusCheck.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ActionResponse$Uploaded;", "Lcom/squareup/wire/Message;", "", "timeout_seconds", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ILokio/ByteString;)V", "getTimeout_seconds", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Uploaded extends Message {

        @JvmField
        public static final ProtoAdapter<Uploaded> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "timeoutSeconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final int timeout_seconds;

        /* JADX WARN: Multi-variable type inference failed */
        public Uploaded() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28362newBuilder();
        }

        public final int getTimeout_seconds() {
            return this.timeout_seconds;
        }

        public /* synthetic */ Uploaded(int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Uploaded(int i, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.timeout_seconds = i;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28362newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Uploaded)) {
                return false;
            }
            Uploaded uploaded = (Uploaded) other;
            return Intrinsics.areEqual(unknownFields(), uploaded.unknownFields()) && this.timeout_seconds == uploaded.timeout_seconds;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + Integer.hashCode(this.timeout_seconds);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("timeout_seconds=" + this.timeout_seconds);
            return CollectionsKt.joinToString$default(arrayList, ", ", "Uploaded{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Uploaded copy$default(Uploaded uploaded, int i, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = uploaded.timeout_seconds;
            }
            if ((i2 & 2) != 0) {
                byteString = uploaded.unknownFields();
            }
            return uploaded.copy(i, byteString);
        }

        public final Uploaded copy(int timeout_seconds, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Uploaded(timeout_seconds, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Uploaded.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Uploaded>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.KycStatusCheck$ActionResponse$Uploaded$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public KycStatusCheck$ActionResponse.Uploaded decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    int iIntValue = 0;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new KycStatusCheck$ActionResponse.Uploaded(iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(KycStatusCheck$ActionResponse.Uploaded value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getTimeout_seconds() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getTimeout_seconds())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, KycStatusCheck$ActionResponse.Uploaded value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getTimeout_seconds() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTimeout_seconds()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, KycStatusCheck$ActionResponse.Uploaded value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getTimeout_seconds() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTimeout_seconds()));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public KycStatusCheck$ActionResponse.Uploaded redact(KycStatusCheck$ActionResponse.Uploaded value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return KycStatusCheck$ActionResponse.Uploaded.copy$default(value, 0, ByteString.EMPTY, 1, null);
                }
            };
        }
    }
}

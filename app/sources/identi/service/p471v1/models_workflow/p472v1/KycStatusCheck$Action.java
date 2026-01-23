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
import identi.service.p471v1.models_workflow.p472v1.KycStatusCheck$Action;
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
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005+,-./BA\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJG\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*¨\u00060"}, m3636d2 = {"identi/service/v1/models_workflow/v1/KycStatusCheck$Action", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action;", "", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Proceed;", "proceed", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$CustomerAbandon;", "customer_abandon", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Uploaded;", "uploaded", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$UploadFailed;", "upload_failed", "Lokio/ByteString;", "unknownFields", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Proceed;Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$CustomerAbandon;Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Uploaded;Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$UploadFailed;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Proceed;Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$CustomerAbandon;Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Uploaded;Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$UploadFailed;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Proceed;", "getProceed", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Proceed;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$CustomerAbandon;", "getCustomer_abandon", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$CustomerAbandon;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Uploaded;", "getUploaded", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Uploaded;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$UploadFailed;", "getUpload_failed", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$UploadFailed;", "Companion", "Uploaded", "Proceed", "CustomerAbandon", "UploadFailed", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class KycStatusCheck$Action extends Message {

    @JvmField
    public static final ProtoAdapter<KycStatusCheck$Action> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.KycStatusCheck$Action$CustomerAbandon#ADAPTER", jsonName = "customerAbandon", oneofName = "type", schemaIndex = 1, tag = 2)
    private final CustomerAbandon customer_abandon;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.KycStatusCheck$Action$Proceed#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
    private final Proceed proceed;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.KycStatusCheck$Action$UploadFailed#ADAPTER", jsonName = "uploadFailed", oneofName = "type", schemaIndex = 3, tag = 4)
    private final UploadFailed upload_failed;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.KycStatusCheck$Action$Uploaded#ADAPTER", oneofName = "type", schemaIndex = 2, tag = 3)
    private final Uploaded uploaded;

    public KycStatusCheck$Action() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28356newBuilder();
    }

    public final Proceed getProceed() {
        return this.proceed;
    }

    public final CustomerAbandon getCustomer_abandon() {
        return this.customer_abandon;
    }

    public final Uploaded getUploaded() {
        return this.uploaded;
    }

    public final UploadFailed getUpload_failed() {
        return this.upload_failed;
    }

    public /* synthetic */ KycStatusCheck$Action(Proceed proceed, CustomerAbandon customerAbandon, Uploaded uploaded, UploadFailed uploadFailed, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : proceed, (i & 2) != 0 ? null : customerAbandon, (i & 4) != 0 ? null : uploaded, (i & 8) != 0 ? null : uploadFailed, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycStatusCheck$Action(Proceed proceed, CustomerAbandon customerAbandon, Uploaded uploaded, UploadFailed uploadFailed, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.proceed = proceed;
        this.customer_abandon = customerAbandon;
        this.uploaded = uploaded;
        this.upload_failed = uploadFailed;
        if (Internal.countNonNull(proceed, customerAbandon, uploaded, uploadFailed, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of proceed, customer_abandon, uploaded, upload_failed may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28356newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof KycStatusCheck$Action)) {
            return false;
        }
        KycStatusCheck$Action kycStatusCheck$Action = (KycStatusCheck$Action) other;
        return Intrinsics.areEqual(unknownFields(), kycStatusCheck$Action.unknownFields()) && Intrinsics.areEqual(this.proceed, kycStatusCheck$Action.proceed) && Intrinsics.areEqual(this.customer_abandon, kycStatusCheck$Action.customer_abandon) && Intrinsics.areEqual(this.uploaded, kycStatusCheck$Action.uploaded) && Intrinsics.areEqual(this.upload_failed, kycStatusCheck$Action.upload_failed);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Proceed proceed = this.proceed;
        int iHashCode2 = (iHashCode + (proceed != null ? proceed.hashCode() : 0)) * 37;
        CustomerAbandon customerAbandon = this.customer_abandon;
        int iHashCode3 = (iHashCode2 + (customerAbandon != null ? customerAbandon.hashCode() : 0)) * 37;
        Uploaded uploaded = this.uploaded;
        int iHashCode4 = (iHashCode3 + (uploaded != null ? uploaded.hashCode() : 0)) * 37;
        UploadFailed uploadFailed = this.upload_failed;
        int iHashCode5 = iHashCode4 + (uploadFailed != null ? uploadFailed.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Proceed proceed = this.proceed;
        if (proceed != null) {
            arrayList.add("proceed=" + proceed);
        }
        CustomerAbandon customerAbandon = this.customer_abandon;
        if (customerAbandon != null) {
            arrayList.add("customer_abandon=" + customerAbandon);
        }
        Uploaded uploaded = this.uploaded;
        if (uploaded != null) {
            arrayList.add("uploaded=" + uploaded);
        }
        UploadFailed uploadFailed = this.upload_failed;
        if (uploadFailed != null) {
            arrayList.add("upload_failed=" + uploadFailed);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56, null);
    }

    public final KycStatusCheck$Action copy(Proceed proceed, CustomerAbandon customer_abandon, Uploaded uploaded, UploadFailed upload_failed, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new KycStatusCheck$Action(proceed, customer_abandon, uploaded, upload_failed, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(KycStatusCheck$Action.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<KycStatusCheck$Action>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.KycStatusCheck$Action$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(KycStatusCheck$Action value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + KycStatusCheck$Action.Proceed.ADAPTER.encodedSizeWithTag(1, value.getProceed()) + KycStatusCheck$Action.CustomerAbandon.ADAPTER.encodedSizeWithTag(2, value.getCustomer_abandon()) + KycStatusCheck$Action.Uploaded.ADAPTER.encodedSizeWithTag(3, value.getUploaded()) + KycStatusCheck$Action.UploadFailed.ADAPTER.encodedSizeWithTag(4, value.getUpload_failed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, KycStatusCheck$Action value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                KycStatusCheck$Action.Proceed.ADAPTER.encodeWithTag(writer, 1, (int) value.getProceed());
                KycStatusCheck$Action.CustomerAbandon.ADAPTER.encodeWithTag(writer, 2, (int) value.getCustomer_abandon());
                KycStatusCheck$Action.Uploaded.ADAPTER.encodeWithTag(writer, 3, (int) value.getUploaded());
                KycStatusCheck$Action.UploadFailed.ADAPTER.encodeWithTag(writer, 4, (int) value.getUpload_failed());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, KycStatusCheck$Action value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                KycStatusCheck$Action.UploadFailed.ADAPTER.encodeWithTag(writer, 4, (int) value.getUpload_failed());
                KycStatusCheck$Action.Uploaded.ADAPTER.encodeWithTag(writer, 3, (int) value.getUploaded());
                KycStatusCheck$Action.CustomerAbandon.ADAPTER.encodeWithTag(writer, 2, (int) value.getCustomer_abandon());
                KycStatusCheck$Action.Proceed.ADAPTER.encodeWithTag(writer, 1, (int) value.getProceed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public KycStatusCheck$Action redact(KycStatusCheck$Action value) {
                Intrinsics.checkNotNullParameter(value, "value");
                KycStatusCheck$Action.Proceed proceed = value.getProceed();
                KycStatusCheck$Action.Proceed proceedRedact = proceed != null ? KycStatusCheck$Action.Proceed.ADAPTER.redact(proceed) : null;
                KycStatusCheck$Action.CustomerAbandon customer_abandon = value.getCustomer_abandon();
                KycStatusCheck$Action.CustomerAbandon customerAbandonRedact = customer_abandon != null ? KycStatusCheck$Action.CustomerAbandon.ADAPTER.redact(customer_abandon) : null;
                KycStatusCheck$Action.Uploaded uploaded = value.getUploaded();
                KycStatusCheck$Action.Uploaded uploadedRedact = uploaded != null ? KycStatusCheck$Action.Uploaded.ADAPTER.redact(uploaded) : null;
                KycStatusCheck$Action.UploadFailed upload_failed = value.getUpload_failed();
                return value.copy(proceedRedact, customerAbandonRedact, uploadedRedact, upload_failed != null ? KycStatusCheck$Action.UploadFailed.ADAPTER.redact(upload_failed) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public KycStatusCheck$Action decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                KycStatusCheck$Action.Proceed proceedDecode = null;
                KycStatusCheck$Action.CustomerAbandon customerAbandonDecode = null;
                KycStatusCheck$Action.Uploaded uploadedDecode = null;
                KycStatusCheck$Action.UploadFailed uploadFailedDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new KycStatusCheck$Action(proceedDecode, customerAbandonDecode, uploadedDecode, uploadFailedDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        proceedDecode = KycStatusCheck$Action.Proceed.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        customerAbandonDecode = KycStatusCheck$Action.CustomerAbandon.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        uploadedDecode = KycStatusCheck$Action.Uploaded.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        uploadFailedDecode = KycStatusCheck$Action.UploadFailed.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: KycStatusCheck.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Uploaded;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Uploaded extends Message {

        @JvmField
        public static final ProtoAdapter<Uploaded> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public Uploaded() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28360newBuilder();
        }

        public /* synthetic */ Uploaded(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Uploaded(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28360newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof Uploaded) && Intrinsics.areEqual(unknownFields(), ((Uploaded) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "Uploaded{}";
        }

        public final Uploaded copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Uploaded(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Uploaded.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Uploaded>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.KycStatusCheck$Action$Uploaded$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(KycStatusCheck$Action.Uploaded value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, KycStatusCheck$Action.Uploaded value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, KycStatusCheck$Action.Uploaded value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public KycStatusCheck$Action.Uploaded redact(KycStatusCheck$Action.Uploaded value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public KycStatusCheck$Action.Uploaded decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new KycStatusCheck$Action.Uploaded(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }

    /* compiled from: KycStatusCheck.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Proceed;", "Lcom/squareup/wire/Message;", "", "timed_out", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLokio/ByteString;)V", "getTimed_out", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Proceed extends Message {

        @JvmField
        public static final ProtoAdapter<Proceed> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "timedOut", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final boolean timed_out;

        /* JADX WARN: Multi-variable type inference failed */
        public Proceed() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28358newBuilder();
        }

        public final boolean getTimed_out() {
            return this.timed_out;
        }

        public /* synthetic */ Proceed(boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Proceed(boolean z, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.timed_out = z;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28358newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Proceed)) {
                return false;
            }
            Proceed proceed = (Proceed) other;
            return Intrinsics.areEqual(unknownFields(), proceed.unknownFields()) && this.timed_out == proceed.timed_out;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + Boolean.hashCode(this.timed_out);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("timed_out=" + this.timed_out);
            return CollectionsKt.joinToString$default(arrayList, ", ", "Proceed{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Proceed copy$default(Proceed proceed, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                z = proceed.timed_out;
            }
            if ((i & 2) != 0) {
                byteString = proceed.unknownFields();
            }
            return proceed.copy(z, byteString);
        }

        public final Proceed copy(boolean timed_out, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Proceed(timed_out, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Proceed.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Proceed>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.KycStatusCheck$Action$Proceed$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(KycStatusCheck$Action.Proceed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getTimed_out() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getTimed_out())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, KycStatusCheck$Action.Proceed value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getTimed_out()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getTimed_out()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, KycStatusCheck$Action.Proceed value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getTimed_out()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getTimed_out()));
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public KycStatusCheck$Action.Proceed decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    boolean zBooleanValue = false;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new KycStatusCheck$Action.Proceed(zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public KycStatusCheck$Action.Proceed redact(KycStatusCheck$Action.Proceed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return KycStatusCheck$Action.Proceed.copy$default(value, false, ByteString.EMPTY, 1, null);
                }
            };
        }
    }

    /* compiled from: KycStatusCheck.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$CustomerAbandon;", "Lcom/squareup/wire/Message;", "", "timed_out", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLokio/ByteString;)V", "getTimed_out", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CustomerAbandon extends Message {

        @JvmField
        public static final ProtoAdapter<CustomerAbandon> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "timedOut", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final boolean timed_out;

        /* JADX WARN: Multi-variable type inference failed */
        public CustomerAbandon() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28357newBuilder();
        }

        public final boolean getTimed_out() {
            return this.timed_out;
        }

        public /* synthetic */ CustomerAbandon(boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomerAbandon(boolean z, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.timed_out = z;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28357newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CustomerAbandon)) {
                return false;
            }
            CustomerAbandon customerAbandon = (CustomerAbandon) other;
            return Intrinsics.areEqual(unknownFields(), customerAbandon.unknownFields()) && this.timed_out == customerAbandon.timed_out;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + Boolean.hashCode(this.timed_out);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("timed_out=" + this.timed_out);
            return CollectionsKt.joinToString$default(arrayList, ", ", "CustomerAbandon{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ CustomerAbandon copy$default(CustomerAbandon customerAbandon, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                z = customerAbandon.timed_out;
            }
            if ((i & 2) != 0) {
                byteString = customerAbandon.unknownFields();
            }
            return customerAbandon.copy(z, byteString);
        }

        public final CustomerAbandon copy(boolean timed_out, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CustomerAbandon(timed_out, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CustomerAbandon.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CustomerAbandon>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.KycStatusCheck$Action$CustomerAbandon$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public KycStatusCheck$Action.CustomerAbandon decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    boolean zBooleanValue = false;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new KycStatusCheck$Action.CustomerAbandon(zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(KycStatusCheck$Action.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getTimed_out() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getTimed_out())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, KycStatusCheck$Action.CustomerAbandon value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getTimed_out()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getTimed_out()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, KycStatusCheck$Action.CustomerAbandon value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getTimed_out()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getTimed_out()));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public KycStatusCheck$Action.CustomerAbandon redact(KycStatusCheck$Action.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return KycStatusCheck$Action.CustomerAbandon.copy$default(value, false, ByteString.EMPTY, 1, null);
                }
            };
        }
    }

    /* compiled from: KycStatusCheck.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$UploadFailed;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class UploadFailed extends Message {

        @JvmField
        public static final ProtoAdapter<UploadFailed> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public UploadFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28359newBuilder();
        }

        public /* synthetic */ UploadFailed(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UploadFailed(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28359newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof UploadFailed) && Intrinsics.areEqual(unknownFields(), ((UploadFailed) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "UploadFailed{}";
        }

        public final UploadFailed copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new UploadFailed(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UploadFailed.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<UploadFailed>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.KycStatusCheck$Action$UploadFailed$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public KycStatusCheck$Action.UploadFailed decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new KycStatusCheck$Action.UploadFailed(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(KycStatusCheck$Action.UploadFailed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, KycStatusCheck$Action.UploadFailed value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, KycStatusCheck$Action.UploadFailed value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public KycStatusCheck$Action.UploadFailed redact(KycStatusCheck$Action.UploadFailed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }
}

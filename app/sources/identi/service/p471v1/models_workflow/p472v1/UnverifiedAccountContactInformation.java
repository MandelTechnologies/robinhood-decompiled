package identi.service.p471v1.models_workflow.p472v1;

import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import identi.service.p471v1.models_workflow.p472v1.UnverifiedAccountContactInformation;
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

/* compiled from: UnverifiedAccountContactInformation.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001c\u001d\u001eB\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m3636d2 = {"identi/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$Action", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$Action;", "", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$Action$PrimaryCta;", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "Lokio/ByteString;", "unknownFields", "<init>", "(Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$Action$PrimaryCta;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$Action$PrimaryCta;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$Action;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$Action$PrimaryCta;", "getPrimary_cta", "()Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$Action$PrimaryCta;", "Companion", "FieldInput", "PrimaryCta", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$Action, reason: use source file name */
/* loaded from: classes14.dex */
public final class UnverifiedAccountContactInformation extends Message {

    @JvmField
    public static final ProtoAdapter<UnverifiedAccountContactInformation> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$Action$PrimaryCta#ADAPTER", jsonName = "primaryCta", oneofName = "type", schemaIndex = 0, tag = 1)
    private final PrimaryCta primary_cta;

    /* JADX WARN: Multi-variable type inference failed */
    public UnverifiedAccountContactInformation() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28406newBuilder();
    }

    public final PrimaryCta getPrimary_cta() {
        return this.primary_cta;
    }

    public /* synthetic */ UnverifiedAccountContactInformation(PrimaryCta primaryCta, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : primaryCta, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnverifiedAccountContactInformation(PrimaryCta primaryCta, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.primary_cta = primaryCta;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28406newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UnverifiedAccountContactInformation)) {
            return false;
        }
        UnverifiedAccountContactInformation unverifiedAccountContactInformation = (UnverifiedAccountContactInformation) other;
        return Intrinsics.areEqual(unknownFields(), unverifiedAccountContactInformation.unknownFields()) && Intrinsics.areEqual(this.primary_cta, unverifiedAccountContactInformation.primary_cta);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        PrimaryCta primaryCta = this.primary_cta;
        int iHashCode2 = iHashCode + (primaryCta != null ? primaryCta.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        PrimaryCta primaryCta = this.primary_cta;
        if (primaryCta != null) {
            arrayList.add("primary_cta=" + primaryCta);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56, null);
    }

    public final UnverifiedAccountContactInformation copy(PrimaryCta primary_cta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UnverifiedAccountContactInformation(primary_cta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UnverifiedAccountContactInformation.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UnverifiedAccountContactInformation>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$Action$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UnverifiedAccountContactInformation decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                UnverifiedAccountContactInformation.PrimaryCta primaryCtaDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UnverifiedAccountContactInformation(primaryCtaDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        primaryCtaDecode = UnverifiedAccountContactInformation.PrimaryCta.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UnverifiedAccountContactInformation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + UnverifiedAccountContactInformation.PrimaryCta.ADAPTER.encodedSizeWithTag(1, value.getPrimary_cta());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UnverifiedAccountContactInformation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                UnverifiedAccountContactInformation.PrimaryCta.ADAPTER.encodeWithTag(writer, 1, (int) value.getPrimary_cta());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UnverifiedAccountContactInformation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                UnverifiedAccountContactInformation.PrimaryCta.ADAPTER.encodeWithTag(writer, 1, (int) value.getPrimary_cta());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UnverifiedAccountContactInformation redact(UnverifiedAccountContactInformation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UnverifiedAccountContactInformation.PrimaryCta primary_cta = value.getPrimary_cta();
                return value.copy(primary_cta != null ? UnverifiedAccountContactInformation.PrimaryCta.ADAPTER.redact(primary_cta) : null, ByteString.EMPTY);
            }
        };
    }

    /* compiled from: UnverifiedAccountContactInformation.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$Action$FieldInput;", "Lcom/squareup/wire/Message;", "", "id", "", "value", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getValue", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$Action$FieldInput */
    public static final class FieldInput extends Message {

        @JvmField
        public static final ProtoAdapter<FieldInput> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String value;

        public FieldInput() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ FieldInput(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28407newBuilder();
        }

        public final String getId() {
            return this.id;
        }

        public final String getValue() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FieldInput(String id, String value, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.id = id;
            this.value = value;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28407newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof FieldInput)) {
                return false;
            }
            FieldInput fieldInput = (FieldInput) other;
            return Intrinsics.areEqual(unknownFields(), fieldInput.unknownFields()) && Intrinsics.areEqual(this.id, fieldInput.id) && Intrinsics.areEqual(this.value, fieldInput.value);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.value.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("id=" + Internal.sanitize(this.id));
            arrayList.add("value=" + Internal.sanitize(this.value));
            return CollectionsKt.joinToString$default(arrayList, ", ", "FieldInput{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ FieldInput copy$default(FieldInput fieldInput, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fieldInput.id;
            }
            if ((i & 2) != 0) {
                str2 = fieldInput.value;
            }
            if ((i & 4) != 0) {
                byteString = fieldInput.unknownFields();
            }
            return fieldInput.copy(str, str2, byteString);
        }

        public final FieldInput copy(String id, String value, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new FieldInput(id, value, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FieldInput.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<FieldInput>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$Action$FieldInput$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public UnverifiedAccountContactInformation.FieldInput decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new UnverifiedAccountContactInformation.FieldInput(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(UnverifiedAccountContactInformation.FieldInput value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                    }
                    return !Intrinsics.areEqual(value.getValue(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getValue()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, UnverifiedAccountContactInformation.FieldInput value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                    }
                    if (!Intrinsics.areEqual(value.getValue(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getValue());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, UnverifiedAccountContactInformation.FieldInput value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getValue(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getValue());
                    }
                    if (Intrinsics.areEqual(value.getId(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public UnverifiedAccountContactInformation.FieldInput redact(UnverifiedAccountContactInformation.FieldInput value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return UnverifiedAccountContactInformation.FieldInput.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }
    }

    /* compiled from: UnverifiedAccountContactInformation.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$Action$PrimaryCta;", "Lcom/squareup/wire/Message;", "", "field_inputs", "", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$Action$FieldInput;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getField_inputs", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$Action$PrimaryCta */
    public static final class PrimaryCta extends Message {

        @JvmField
        public static final ProtoAdapter<PrimaryCta> ADAPTER;

        @WireField(adapter = "identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$Action$FieldInput#ADAPTER", jsonName = "fieldInputs", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        private final List<FieldInput> field_inputs;

        /* JADX WARN: Multi-variable type inference failed */
        public PrimaryCta() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28408newBuilder();
        }

        public /* synthetic */ PrimaryCta(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrimaryCta(List<FieldInput> field_inputs, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(field_inputs, "field_inputs");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.field_inputs = Internal.immutableCopyOf("field_inputs", field_inputs);
        }

        public final List<FieldInput> getField_inputs() {
            return this.field_inputs;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28408newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PrimaryCta)) {
                return false;
            }
            PrimaryCta primaryCta = (PrimaryCta) other;
            return Intrinsics.areEqual(unknownFields(), primaryCta.unknownFields()) && Intrinsics.areEqual(this.field_inputs, primaryCta.field_inputs);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.field_inputs.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.field_inputs.isEmpty()) {
                arrayList.add("field_inputs=" + this.field_inputs);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PrimaryCta{", "}", 0, null, null, 56, null);
        }

        public final PrimaryCta copy(List<FieldInput> field_inputs, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(field_inputs, "field_inputs");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new PrimaryCta(field_inputs, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PrimaryCta.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<PrimaryCta>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$Action$PrimaryCta$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(UnverifiedAccountContactInformation.PrimaryCta value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + UnverifiedAccountContactInformation.FieldInput.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getField_inputs());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, UnverifiedAccountContactInformation.PrimaryCta value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    UnverifiedAccountContactInformation.FieldInput.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getField_inputs());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, UnverifiedAccountContactInformation.PrimaryCta value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    UnverifiedAccountContactInformation.FieldInput.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getField_inputs());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public UnverifiedAccountContactInformation.PrimaryCta decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new UnverifiedAccountContactInformation.PrimaryCta(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            arrayList.add(UnverifiedAccountContactInformation.FieldInput.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public UnverifiedAccountContactInformation.PrimaryCta redact(UnverifiedAccountContactInformation.PrimaryCta value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(Internal.m26823redactElements(value.getField_inputs(), UnverifiedAccountContactInformation.FieldInput.ADAPTER), ByteString.EMPTY);
                }
            };
        }
    }
}

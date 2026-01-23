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
import identi.service.p471v1.models_workflow.p472v1.SupportIntakeCaseConfirmation;
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

/* compiled from: SupportIntakeCaseConfirmation.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\"#B7\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, m3636d2 = {"identi/service/v1/models_workflow/v1/SupportIntakeCaseConfirmation$ScreenParams", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmation$ScreenParams;", "", "", "heading", "subheading", "", "Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmation$ScreenParams$Field;", "fields", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmation$ScreenParams;", "Ljava/lang/String;", "getHeading", "getSubheading", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "Companion", "Field", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: identi.service.v1.models_workflow.v1.SupportIntakeCaseConfirmation$ScreenParams, reason: use source file name */
/* loaded from: classes14.dex */
public final class SupportIntakeCaseConfirmation extends Message {

    @JvmField
    public static final ProtoAdapter<SupportIntakeCaseConfirmation> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.SupportIntakeCaseConfirmation$ScreenParams$Field#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Field> fields;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String heading;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String subheading;

    public SupportIntakeCaseConfirmation() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28404newBuilder();
    }

    public final String getHeading() {
        return this.heading;
    }

    public /* synthetic */ SupportIntakeCaseConfirmation(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getSubheading() {
        return this.subheading;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportIntakeCaseConfirmation(String heading, String str, List<Field> fields, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.heading = heading;
        this.subheading = str;
        this.fields = Internal.immutableCopyOf("fields", fields);
    }

    public final List<Field> getFields() {
        return this.fields;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28404newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SupportIntakeCaseConfirmation)) {
            return false;
        }
        SupportIntakeCaseConfirmation supportIntakeCaseConfirmation = (SupportIntakeCaseConfirmation) other;
        return Intrinsics.areEqual(unknownFields(), supportIntakeCaseConfirmation.unknownFields()) && Intrinsics.areEqual(this.heading, supportIntakeCaseConfirmation.heading) && Intrinsics.areEqual(this.subheading, supportIntakeCaseConfirmation.subheading) && Intrinsics.areEqual(this.fields, supportIntakeCaseConfirmation.fields);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.heading.hashCode()) * 37;
        String str = this.subheading;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.fields.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("heading=" + Internal.sanitize(this.heading));
        String str = this.subheading;
        if (str != null) {
            arrayList.add("subheading=" + Internal.sanitize(str));
        }
        if (!this.fields.isEmpty()) {
            arrayList.add("fields=" + this.fields);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenParams{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportIntakeCaseConfirmation copy$default(SupportIntakeCaseConfirmation supportIntakeCaseConfirmation, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportIntakeCaseConfirmation.heading;
        }
        if ((i & 2) != 0) {
            str2 = supportIntakeCaseConfirmation.subheading;
        }
        if ((i & 4) != 0) {
            list = supportIntakeCaseConfirmation.fields;
        }
        if ((i & 8) != 0) {
            byteString = supportIntakeCaseConfirmation.unknownFields();
        }
        return supportIntakeCaseConfirmation.copy(str, str2, list, byteString);
    }

    public final SupportIntakeCaseConfirmation copy(String heading, String subheading, List<Field> fields, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SupportIntakeCaseConfirmation(heading, subheading, fields, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SupportIntakeCaseConfirmation.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SupportIntakeCaseConfirmation>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.SupportIntakeCaseConfirmation$ScreenParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SupportIntakeCaseConfirmation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHeading(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHeading());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubheading()) + SupportIntakeCaseConfirmation.Field.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SupportIntakeCaseConfirmation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHeading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeading());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubheading());
                SupportIntakeCaseConfirmation.Field.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getFields());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SupportIntakeCaseConfirmation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SupportIntakeCaseConfirmation.Field.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubheading());
                if (Intrinsics.areEqual(value.getHeading(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getHeading());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SupportIntakeCaseConfirmation decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SupportIntakeCaseConfirmation(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(SupportIntakeCaseConfirmation.Field.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SupportIntakeCaseConfirmation redact(SupportIntakeCaseConfirmation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SupportIntakeCaseConfirmation.copy$default(value, null, null, Internal.m26823redactElements(value.getFields(), SupportIntakeCaseConfirmation.Field.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }

    /* compiled from: SupportIntakeCaseConfirmation.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmation$ScreenParams$Field;", "Lcom/squareup/wire/Message;", "", "name", "", "value", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getName", "()Ljava/lang/String;", "getValue", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.SupportIntakeCaseConfirmation$ScreenParams$Field */
    public static final class Field extends Message {

        @JvmField
        public static final ProtoAdapter<Field> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String value;

        public Field() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ Field(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28405newBuilder();
        }

        public final String getName() {
            return this.name;
        }

        public final String getValue() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(String name, String value, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.name = name;
            this.value = value;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28405newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return Intrinsics.areEqual(unknownFields(), field.unknownFields()) && Intrinsics.areEqual(this.name, field.name) && Intrinsics.areEqual(this.value, field.value);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.value.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("name=" + Internal.sanitize(this.name));
            arrayList.add("value=" + Internal.sanitize(this.value));
            return CollectionsKt.joinToString$default(arrayList, ", ", "Field{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Field copy$default(Field field, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = field.name;
            }
            if ((i & 2) != 0) {
                str2 = field.value;
            }
            if ((i & 4) != 0) {
                byteString = field.unknownFields();
            }
            return field.copy(str, str2, byteString);
        }

        public final Field copy(String name, String value, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Field(name, value, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Field.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Field>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.SupportIntakeCaseConfirmation$ScreenParams$Field$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SupportIntakeCaseConfirmation.Field value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getName(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    return !Intrinsics.areEqual(value.getValue(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getValue()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SupportIntakeCaseConfirmation.Field value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                    }
                    if (!Intrinsics.areEqual(value.getValue(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getValue());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SupportIntakeCaseConfirmation.Field value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getValue(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getValue());
                    }
                    if (Intrinsics.areEqual(value.getName(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SupportIntakeCaseConfirmation.Field redact(SupportIntakeCaseConfirmation.Field value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return SupportIntakeCaseConfirmation.Field.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public SupportIntakeCaseConfirmation.Field decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new SupportIntakeCaseConfirmation.Field(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
            };
        }
    }
}

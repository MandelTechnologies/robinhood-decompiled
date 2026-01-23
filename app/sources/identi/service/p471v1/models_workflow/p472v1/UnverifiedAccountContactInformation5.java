package identi.service.p471v1.models_workflow.p472v1;

import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import identi.service.p471v1.models_workflow.p472v1.UnverifiedAccountContactInformation5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: UnverifiedAccountContactInformation.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002$%BA\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001aR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, m3636d2 = {"identi/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams;", "", "", "heading", "subheading", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field;", "fields", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams;", "Ljava/lang/String;", "getHeading", "getSubheading", "getPrimary_cta", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "Companion", "Field", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$ScreenParams, reason: use source file name */
/* loaded from: classes14.dex */
public final class UnverifiedAccountContactInformation5 extends Message {

    @JvmField
    public static final ProtoAdapter<UnverifiedAccountContactInformation5> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$ScreenParams$Field#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<Field> fields;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String heading;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String primary_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String subheading;

    public UnverifiedAccountContactInformation5() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ UnverifiedAccountContactInformation5(String str, String str2, String str3, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28409newBuilder();
    }

    public final String getHeading() {
        return this.heading;
    }

    public final String getSubheading() {
        return this.subheading;
    }

    public final String getPrimary_cta() {
        return this.primary_cta;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnverifiedAccountContactInformation5(String heading, String str, String primary_cta, List<Field> fields, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.heading = heading;
        this.subheading = str;
        this.primary_cta = primary_cta;
        this.fields = Internal.immutableCopyOf("fields", fields);
    }

    public final List<Field> getFields() {
        return this.fields;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28409newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UnverifiedAccountContactInformation5)) {
            return false;
        }
        UnverifiedAccountContactInformation5 unverifiedAccountContactInformation5 = (UnverifiedAccountContactInformation5) other;
        return Intrinsics.areEqual(unknownFields(), unverifiedAccountContactInformation5.unknownFields()) && Intrinsics.areEqual(this.heading, unverifiedAccountContactInformation5.heading) && Intrinsics.areEqual(this.subheading, unverifiedAccountContactInformation5.subheading) && Intrinsics.areEqual(this.primary_cta, unverifiedAccountContactInformation5.primary_cta) && Intrinsics.areEqual(this.fields, unverifiedAccountContactInformation5.fields);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.heading.hashCode()) * 37;
        String str = this.subheading;
        int iHashCode2 = ((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.primary_cta.hashCode()) * 37) + this.fields.hashCode();
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
        arrayList.add("primary_cta=" + Internal.sanitize(this.primary_cta));
        if (!this.fields.isEmpty()) {
            arrayList.add("fields=" + this.fields);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenParams{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UnverifiedAccountContactInformation5 copy$default(UnverifiedAccountContactInformation5 unverifiedAccountContactInformation5, String str, String str2, String str3, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unverifiedAccountContactInformation5.heading;
        }
        if ((i & 2) != 0) {
            str2 = unverifiedAccountContactInformation5.subheading;
        }
        if ((i & 4) != 0) {
            str3 = unverifiedAccountContactInformation5.primary_cta;
        }
        if ((i & 8) != 0) {
            list = unverifiedAccountContactInformation5.fields;
        }
        if ((i & 16) != 0) {
            byteString = unverifiedAccountContactInformation5.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return unverifiedAccountContactInformation5.copy(str, str2, str4, list, byteString2);
    }

    public final UnverifiedAccountContactInformation5 copy(String heading, String subheading, String primary_cta, List<Field> fields, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UnverifiedAccountContactInformation5(heading, subheading, primary_cta, fields, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UnverifiedAccountContactInformation5.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UnverifiedAccountContactInformation5>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$ScreenParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UnverifiedAccountContactInformation5 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHeading(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHeading());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getSubheading());
                if (!Intrinsics.areEqual(value.getPrimary_cta(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getPrimary_cta());
                }
                return iEncodedSizeWithTag + UnverifiedAccountContactInformation5.Field.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UnverifiedAccountContactInformation5 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHeading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeading());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubheading());
                if (!Intrinsics.areEqual(value.getPrimary_cta(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getPrimary_cta());
                }
                UnverifiedAccountContactInformation5.Field.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getFields());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UnverifiedAccountContactInformation5 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                UnverifiedAccountContactInformation5.Field.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getFields());
                if (!Intrinsics.areEqual(value.getPrimary_cta(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_cta());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubheading());
                if (Intrinsics.areEqual(value.getHeading(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getHeading());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UnverifiedAccountContactInformation5 decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UnverifiedAccountContactInformation5(strDecode, strDecode2, strDecode3, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        arrayList.add(UnverifiedAccountContactInformation5.Field.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UnverifiedAccountContactInformation5 redact(UnverifiedAccountContactInformation5 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UnverifiedAccountContactInformation5.copy$default(value, null, null, null, Internal.m26823redactElements(value.getFields(), UnverifiedAccountContactInformation5.Field.ADAPTER), ByteString.EMPTY, 7, null);
            }
        };
    }

    /* compiled from: UnverifiedAccountContactInformation.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015¨\u0006 "}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field;", "Lcom/squareup/wire/Message;", "", "type", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field$Type;", "name", "", "placeholder", "id", "is_optional", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getType", "()Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field$Type;", "getName", "()Ljava/lang/String;", "getPlaceholder", "getId", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "Type", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$ScreenParams$Field */
    public static final class Field extends Message {

        @JvmField
        public static final ProtoAdapter<Field> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isOptional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final boolean is_optional;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        private final String placeholder;

        @WireField(adapter = "identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$ScreenParams$Field$Type#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Type type;

        public Field() {
            this(null, null, null, null, false, null, 63, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28410newBuilder();
        }

        public final Type getType() {
            return this.type;
        }

        public /* synthetic */ Field(Type type2, String str, String str2, String str3, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Type.TYPE_UNSPECIFIED : type2, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getName() {
            return this.name;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getId() {
            return this.id;
        }

        /* renamed from: is_optional, reason: from getter */
        public final boolean getIs_optional() {
            return this.is_optional;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(Type type2, String name, String str, String id, boolean z, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.type = type2;
            this.name = name;
            this.placeholder = str;
            this.id = id;
            this.is_optional = z;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28410newBuilder() {
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
            return Intrinsics.areEqual(unknownFields(), field.unknownFields()) && this.type == field.type && Intrinsics.areEqual(this.name, field.name) && Intrinsics.areEqual(this.placeholder, field.placeholder) && Intrinsics.areEqual(this.id, field.id) && this.is_optional == field.is_optional;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.name.hashCode()) * 37;
            String str = this.placeholder;
            int iHashCode2 = ((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.id.hashCode()) * 37) + Boolean.hashCode(this.is_optional);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("type=" + this.type);
            arrayList.add("name=" + Internal.sanitize(this.name));
            String str = this.placeholder;
            if (str != null) {
                arrayList.add("placeholder=" + Internal.sanitize(str));
            }
            arrayList.add("id=" + Internal.sanitize(this.id));
            arrayList.add("is_optional=" + this.is_optional);
            return CollectionsKt.joinToString$default(arrayList, ", ", "Field{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Field copy$default(Field field, Type type2, String str, String str2, String str3, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = field.type;
            }
            if ((i & 2) != 0) {
                str = field.name;
            }
            if ((i & 4) != 0) {
                str2 = field.placeholder;
            }
            if ((i & 8) != 0) {
                str3 = field.id;
            }
            if ((i & 16) != 0) {
                z = field.is_optional;
            }
            if ((i & 32) != 0) {
                byteString = field.unknownFields();
            }
            boolean z2 = z;
            ByteString byteString2 = byteString;
            return field.copy(type2, str, str2, str3, z2, byteString2);
        }

        public final Field copy(Type type2, String name, String placeholder, String id, boolean is_optional, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Field(type2, name, placeholder, id, is_optional, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Field.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Field>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$ScreenParams$Field$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(UnverifiedAccountContactInformation5.Field value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getType() != UnverifiedAccountContactInformation5.Field.Type.TYPE_UNSPECIFIED) {
                        size += UnverifiedAccountContactInformation5.Field.Type.ADAPTER.encodedSizeWithTag(1, value.getType());
                    }
                    if (!Intrinsics.areEqual(value.getName(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getPlaceholder());
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getId());
                    }
                    return value.getIs_optional() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_optional())) : iEncodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, UnverifiedAccountContactInformation5.Field value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getType() != UnverifiedAccountContactInformation5.Field.Type.TYPE_UNSPECIFIED) {
                        UnverifiedAccountContactInformation5.Field.Type.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                    }
                    if (!Intrinsics.areEqual(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getPlaceholder());
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        protoAdapter.encodeWithTag(writer, 4, (int) value.getId());
                    }
                    if (value.getIs_optional()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_optional()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, UnverifiedAccountContactInformation5.Field value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getIs_optional()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_optional()));
                    }
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getId());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getPlaceholder());
                    if (!Intrinsics.areEqual(value.getName(), "")) {
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getName());
                    }
                    if (value.getType() != UnverifiedAccountContactInformation5.Field.Type.TYPE_UNSPECIFIED) {
                        UnverifiedAccountContactInformation5.Field.Type.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public UnverifiedAccountContactInformation5.Field decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    UnverifiedAccountContactInformation5.Field.Type typeDecode = UnverifiedAccountContactInformation5.Field.Type.TYPE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = null;
                    boolean zBooleanValue = false;
                    String strDecode2 = "";
                    String strDecode3 = strDecode2;
                    while (true) {
                        UnverifiedAccountContactInformation5.Field.Type type2 = typeDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new UnverifiedAccountContactInformation5.Field(type2, strDecode2, strDecode, strDecode3, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                try {
                                    typeDecode = UnverifiedAccountContactInformation5.Field.Type.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 4) {
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 5) {
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public UnverifiedAccountContactInformation5.Field redact(UnverifiedAccountContactInformation5.Field value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return UnverifiedAccountContactInformation5.Field.copy$default(value, null, null, null, null, false, ByteString.EMPTY, 31, null);
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UnverifiedAccountContactInformation.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "PLAIN_TEXT", "PHONE_NUMBER", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$ScreenParams$Field$Type */
        public static final class Type implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @JvmField
            public static final ProtoAdapter<Type> ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Type PHONE_NUMBER;
            public static final Type PLAIN_TEXT;
            public static final Type TYPE_UNSPECIFIED;
            private final int value;

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{TYPE_UNSPECIFIED, PLAIN_TEXT, PHONE_NUMBER};
            }

            @JvmStatic
            public static final Type fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<Type> getEntries() {
                return $ENTRIES;
            }

            private Type(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final Type type2 = new Type("TYPE_UNSPECIFIED", 0, 0);
                TYPE_UNSPECIFIED = type2;
                PLAIN_TEXT = new Type("PLAIN_TEXT", 1, 1);
                PHONE_NUMBER = new Type("PHONE_NUMBER", 2, 2);
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$ScreenParams$Field$Type$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public UnverifiedAccountContactInformation5.Field.Type fromValue(int value) {
                        return UnverifiedAccountContactInformation5.Field.Type.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: UnverifiedAccountContactInformation.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams$Field$Type;", "fromValue", "value", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$ScreenParams$Field$Type$Companion, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final Type fromValue(int value) {
                    if (value == 0) {
                        return Type.TYPE_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Type.PLAIN_TEXT;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return Type.PHONE_NUMBER;
                }
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }
    }
}

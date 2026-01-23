package identi.service.p471v1.models_workflow.p472v1;

import com.robinhood.android.car.result.CarResultComposable2;
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
import identi.service.p471v1.models_workflow.p472v1.FreezeAccount$ScreenParams;
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

/* compiled from: FreezeAccount.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002)*BM\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJS\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, m3636d2 = {"identi/service/v1/models_workflow/v1/FreezeAccount$ScreenParams", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/FreezeAccount$ScreenParams;", "", "", "title", CarResultComposable2.BODY, WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "Lidenti/service/v1/models_workflow/v1/FreezeAccount$Callback;", "primary_cta_callback", "", "Lidenti/service/v1/models_workflow/v1/FreezeAccount$ScreenParams$Field;", "fields", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/FreezeAccount$Callback;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/FreezeAccount$Callback;Ljava/util/List;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/FreezeAccount$ScreenParams;", "Ljava/lang/String;", "getTitle", "getBody", "getPrimary_cta", "Lidenti/service/v1/models_workflow/v1/FreezeAccount$Callback;", "getPrimary_cta_callback", "()Lidenti/service/v1/models_workflow/v1/FreezeAccount$Callback;", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "Companion", "Field", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class FreezeAccount$ScreenParams extends Message {

    @JvmField
    public static final ProtoAdapter<FreezeAccount$ScreenParams> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String body;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.FreezeAccount$ScreenParams$Field#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<Field> fields;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String primary_cta;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.FreezeAccount$Callback#ADAPTER", jsonName = "primaryCtaCallback", schemaIndex = 3, tag = 4)
    private final FreezeAccount$Callback primary_cta_callback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public FreezeAccount$ScreenParams() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ FreezeAccount$ScreenParams(String str, String str2, String str3, FreezeAccount$Callback freezeAccount$Callback, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : freezeAccount$Callback, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28321newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getPrimary_cta() {
        return this.primary_cta;
    }

    public final FreezeAccount$Callback getPrimary_cta_callback() {
        return this.primary_cta_callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreezeAccount$ScreenParams(String title, String str, String primary_cta, FreezeAccount$Callback freezeAccount$Callback, List<Field> fields, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.body = str;
        this.primary_cta = primary_cta;
        this.primary_cta_callback = freezeAccount$Callback;
        this.fields = Internal.immutableCopyOf("fields", fields);
    }

    public final List<Field> getFields() {
        return this.fields;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28321newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FreezeAccount$ScreenParams)) {
            return false;
        }
        FreezeAccount$ScreenParams freezeAccount$ScreenParams = (FreezeAccount$ScreenParams) other;
        return Intrinsics.areEqual(unknownFields(), freezeAccount$ScreenParams.unknownFields()) && Intrinsics.areEqual(this.title, freezeAccount$ScreenParams.title) && Intrinsics.areEqual(this.body, freezeAccount$ScreenParams.body) && Intrinsics.areEqual(this.primary_cta, freezeAccount$ScreenParams.primary_cta) && this.primary_cta_callback == freezeAccount$ScreenParams.primary_cta_callback && Intrinsics.areEqual(this.fields, freezeAccount$ScreenParams.fields);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        String str = this.body;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.primary_cta.hashCode()) * 37;
        FreezeAccount$Callback freezeAccount$Callback = this.primary_cta_callback;
        int iHashCode3 = ((iHashCode2 + (freezeAccount$Callback != null ? freezeAccount$Callback.hashCode() : 0)) * 37) + this.fields.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        String str = this.body;
        if (str != null) {
            arrayList.add("body=" + Internal.sanitize(str));
        }
        arrayList.add("primary_cta=" + Internal.sanitize(this.primary_cta));
        FreezeAccount$Callback freezeAccount$Callback = this.primary_cta_callback;
        if (freezeAccount$Callback != null) {
            arrayList.add("primary_cta_callback=" + freezeAccount$Callback);
        }
        if (!this.fields.isEmpty()) {
            arrayList.add("fields=" + this.fields);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenParams{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FreezeAccount$ScreenParams copy$default(FreezeAccount$ScreenParams freezeAccount$ScreenParams, String str, String str2, String str3, FreezeAccount$Callback freezeAccount$Callback, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = freezeAccount$ScreenParams.title;
        }
        if ((i & 2) != 0) {
            str2 = freezeAccount$ScreenParams.body;
        }
        if ((i & 4) != 0) {
            str3 = freezeAccount$ScreenParams.primary_cta;
        }
        if ((i & 8) != 0) {
            freezeAccount$Callback = freezeAccount$ScreenParams.primary_cta_callback;
        }
        if ((i & 16) != 0) {
            list = freezeAccount$ScreenParams.fields;
        }
        if ((i & 32) != 0) {
            byteString = freezeAccount$ScreenParams.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        return freezeAccount$ScreenParams.copy(str, str2, str3, freezeAccount$Callback, list2, byteString2);
    }

    public final FreezeAccount$ScreenParams copy(String title, String body, String primary_cta, FreezeAccount$Callback primary_cta_callback, List<Field> fields, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FreezeAccount$ScreenParams(title, body, primary_cta, primary_cta_callback, fields, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FreezeAccount$ScreenParams.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FreezeAccount$ScreenParams>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.FreezeAccount$ScreenParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FreezeAccount$ScreenParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getBody());
                if (!Intrinsics.areEqual(value.getPrimary_cta(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getPrimary_cta());
                }
                return iEncodedSizeWithTag + FreezeAccount$Callback.ADAPTER.encodedSizeWithTag(4, value.getPrimary_cta_callback()) + FreezeAccount$ScreenParams.Field.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FreezeAccount$ScreenParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getBody());
                if (!Intrinsics.areEqual(value.getPrimary_cta(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getPrimary_cta());
                }
                FreezeAccount$Callback.ADAPTER.encodeWithTag(writer, 4, (int) value.getPrimary_cta_callback());
                FreezeAccount$ScreenParams.Field.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getFields());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FreezeAccount$ScreenParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FreezeAccount$ScreenParams.Field.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getFields());
                FreezeAccount$Callback.ADAPTER.encodeWithTag(writer, 4, (int) value.getPrimary_cta_callback());
                if (!Intrinsics.areEqual(value.getPrimary_cta(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_cta());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getBody());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FreezeAccount$ScreenParams decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                FreezeAccount$Callback freezeAccount$CallbackDecode = null;
                String strDecode3 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FreezeAccount$ScreenParams(strDecode3, strDecode2, strDecode, freezeAccount$CallbackDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        try {
                            freezeAccount$CallbackDecode = FreezeAccount$Callback.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 5) {
                        arrayList.add(FreezeAccount$ScreenParams.Field.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FreezeAccount$ScreenParams redact(FreezeAccount$ScreenParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FreezeAccount$ScreenParams.copy$default(value, null, null, null, null, Internal.m26823redactElements(value.getFields(), FreezeAccount$ScreenParams.Field.ADAPTER), ByteString.EMPTY, 15, null);
            }
        };
    }

    /* compiled from: FreezeAccount.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/FreezeAccount$ScreenParams$Field;", "Lcom/squareup/wire/Message;", "", "name", "", "value", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getName", "()Ljava/lang/String;", "getValue", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            return (Message.Builder) m28322newBuilder();
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
        public /* synthetic */ Void m28322newBuilder() {
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
            ADAPTER = new ProtoAdapter<Field>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.FreezeAccount$ScreenParams$Field$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FreezeAccount$ScreenParams.Field value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getName(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                    }
                    return !Intrinsics.areEqual(value.getValue(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getValue()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FreezeAccount$ScreenParams.Field value) throws IOException {
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
                public void encode(ReverseProtoWriter writer, FreezeAccount$ScreenParams.Field value) throws IOException {
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
                public FreezeAccount$ScreenParams.Field redact(FreezeAccount$ScreenParams.Field value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return FreezeAccount$ScreenParams.Field.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public FreezeAccount$ScreenParams.Field decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new FreezeAccount$ScreenParams.Field(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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

package rh_server_driven_ui.p531v1;

import com.plaid.internal.EnumC7081g;
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
import java.io.IOException;
import java.util.ArrayList;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rh_server_driven_ui.p531v1.CircularProgress;

/* compiled from: CircularProgress.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&'BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010%R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019¨\u0006("}, m3636d2 = {"Lrh_server_driven_ui/v1/CircularProgress;", "Lcom/squareup/wire/Message;", "", AnnotatedPrivateKey.LABEL, "", "type", "Lrh_server_driven_ui/v1/CircularProgress$Type;", "progress", "", "background_color_override", "Lrh_server_driven_ui/v1/ThemedColor;", "progress_bar_color_override", "text_color_override", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/CircularProgress$Type;Ljava/lang/Float;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)V", "getLabel", "()Ljava/lang/String;", "getType", "()Lrh_server_driven_ui/v1/CircularProgress$Type;", "getProgress", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getBackground_color_override", "()Lrh_server_driven_ui/v1/ThemedColor;", "getProgress_bar_color_override", "getText_color_override", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Lrh_server_driven_ui/v1/CircularProgress$Type;Ljava/lang/Float;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)Lrh_server_driven_ui/v1/CircularProgress;", "Companion", "Type", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CircularProgress extends Message {

    @JvmField
    public static final ProtoAdapter<CircularProgress> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "backgroundColorOverride", schemaIndex = 3, tag = 4)
    private final ThemedColor background_color_override;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 2, tag = 3)
    private final Float progress;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "progressBarColorOverride", schemaIndex = 4, tag = 5)
    private final ThemedColor progress_bar_color_override;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "textColorOverride", schemaIndex = 5, tag = 6)
    private final ThemedColor text_color_override;

    @WireField(adapter = "rh_server_driven_ui.v1.CircularProgress$Type#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Type type;

    public CircularProgress() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29700newBuilder();
    }

    public final String getLabel() {
        return this.label;
    }

    public /* synthetic */ CircularProgress(String str, Type type2, Float f, ThemedColor themedColor, ThemedColor themedColor2, ThemedColor themedColor3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Type.TYPE_UNSPECIFIED : type2, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : themedColor, (i & 16) != 0 ? null : themedColor2, (i & 32) != 0 ? null : themedColor3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Type getType() {
        return this.type;
    }

    public final Float getProgress() {
        return this.progress;
    }

    public final ThemedColor getBackground_color_override() {
        return this.background_color_override;
    }

    public final ThemedColor getProgress_bar_color_override() {
        return this.progress_bar_color_override;
    }

    public final ThemedColor getText_color_override() {
        return this.text_color_override;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgress(String label, Type type2, Float f, ThemedColor themedColor, ThemedColor themedColor2, ThemedColor themedColor3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.label = label;
        this.type = type2;
        this.progress = f;
        this.background_color_override = themedColor;
        this.progress_bar_color_override = themedColor2;
        this.text_color_override = themedColor3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29700newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CircularProgress)) {
            return false;
        }
        CircularProgress circularProgress = (CircularProgress) other;
        return Intrinsics.areEqual(unknownFields(), circularProgress.unknownFields()) && Intrinsics.areEqual(this.label, circularProgress.label) && this.type == circularProgress.type && Intrinsics.areEqual(this.progress, circularProgress.progress) && Intrinsics.areEqual(this.background_color_override, circularProgress.background_color_override) && Intrinsics.areEqual(this.progress_bar_color_override, circularProgress.progress_bar_color_override) && Intrinsics.areEqual(this.text_color_override, circularProgress.text_color_override);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.label.hashCode()) * 37) + this.type.hashCode()) * 37;
        Float f = this.progress;
        int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 37;
        ThemedColor themedColor = this.background_color_override;
        int iHashCode3 = (iHashCode2 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ThemedColor themedColor2 = this.progress_bar_color_override;
        int iHashCode4 = (iHashCode3 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37;
        ThemedColor themedColor3 = this.text_color_override;
        int iHashCode5 = iHashCode4 + (themedColor3 != null ? themedColor3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("label=" + Internal.sanitize(this.label));
        arrayList.add("type=" + this.type);
        Float f = this.progress;
        if (f != null) {
            arrayList.add("progress=" + f);
        }
        ThemedColor themedColor = this.background_color_override;
        if (themedColor != null) {
            arrayList.add("background_color_override=" + themedColor);
        }
        ThemedColor themedColor2 = this.progress_bar_color_override;
        if (themedColor2 != null) {
            arrayList.add("progress_bar_color_override=" + themedColor2);
        }
        ThemedColor themedColor3 = this.text_color_override;
        if (themedColor3 != null) {
            arrayList.add("text_color_override=" + themedColor3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CircularProgress{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CircularProgress copy$default(CircularProgress circularProgress, String str, Type type2, Float f, ThemedColor themedColor, ThemedColor themedColor2, ThemedColor themedColor3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = circularProgress.label;
        }
        if ((i & 2) != 0) {
            type2 = circularProgress.type;
        }
        if ((i & 4) != 0) {
            f = circularProgress.progress;
        }
        if ((i & 8) != 0) {
            themedColor = circularProgress.background_color_override;
        }
        if ((i & 16) != 0) {
            themedColor2 = circularProgress.progress_bar_color_override;
        }
        if ((i & 32) != 0) {
            themedColor3 = circularProgress.text_color_override;
        }
        if ((i & 64) != 0) {
            byteString = circularProgress.unknownFields();
        }
        ThemedColor themedColor4 = themedColor3;
        ByteString byteString2 = byteString;
        ThemedColor themedColor5 = themedColor2;
        Float f2 = f;
        return circularProgress.copy(str, type2, f2, themedColor, themedColor5, themedColor4, byteString2);
    }

    public final CircularProgress copy(String label, Type type2, Float progress, ThemedColor background_color_override, ThemedColor progress_bar_color_override, ThemedColor text_color_override, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CircularProgress(label, type2, progress, background_color_override, progress_bar_color_override, text_color_override, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CircularProgress.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CircularProgress>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.CircularProgress$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CircularProgress value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLabel());
                }
                if (value.getType() != CircularProgress.Type.TYPE_UNSPECIFIED) {
                    size += CircularProgress.Type.ADAPTER.encodedSizeWithTag(2, value.getType());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.FLOAT.encodedSizeWithTag(3, value.getProgress());
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getBackground_color_override()) + protoAdapter.encodedSizeWithTag(5, value.getProgress_bar_color_override()) + protoAdapter.encodedSizeWithTag(6, value.getText_color_override());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CircularProgress value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
                }
                if (value.getType() != CircularProgress.Type.TYPE_UNSPECIFIED) {
                    CircularProgress.Type.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) value.getProgress());
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getBackground_color_override());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getProgress_bar_color_override());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getText_color_override());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CircularProgress value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getText_color_override());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getProgress_bar_color_override());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getBackground_color_override());
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) value.getProgress());
                if (value.getType() != CircularProgress.Type.TYPE_UNSPECIFIED) {
                    CircularProgress.Type.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (Intrinsics.areEqual(value.getLabel(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CircularProgress decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CircularProgress.Type typeDecode = CircularProgress.Type.TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Float fDecode = null;
                ThemedColor themedColorDecode = null;
                ThemedColor themedColorDecode2 = null;
                ThemedColor themedColorDecode3 = null;
                String strDecode = "";
                while (true) {
                    CircularProgress.Type type2 = typeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        typeDecode = CircularProgress.Type.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    fDecode = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                                case 4:
                                    themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    themedColorDecode3 = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new CircularProgress(strDecode, type2, fDecode, themedColorDecode, themedColorDecode2, themedColorDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CircularProgress redact(CircularProgress value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor background_color_override = value.getBackground_color_override();
                ThemedColor themedColorRedact = background_color_override != null ? ThemedColor.ADAPTER.redact(background_color_override) : null;
                ThemedColor progress_bar_color_override = value.getProgress_bar_color_override();
                ThemedColor themedColorRedact2 = progress_bar_color_override != null ? ThemedColor.ADAPTER.redact(progress_bar_color_override) : null;
                ThemedColor text_color_override = value.getText_color_override();
                return CircularProgress.copy$default(value, null, null, null, themedColorRedact, themedColorRedact2, text_color_override != null ? ThemedColor.ADAPTER.redact(text_color_override) : null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CircularProgress.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/CircularProgress$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "TYPE_INFORM", "TYPE_GOLD", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Type> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type TYPE_GOLD;
        public static final Type TYPE_INFORM;
        public static final Type TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{TYPE_UNSPECIFIED, TYPE_INFORM, TYPE_GOLD};
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
            TYPE_INFORM = new Type("TYPE_INFORM", 1, 1);
            TYPE_GOLD = new Type("TYPE_GOLD", 2, 2);
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: rh_server_driven_ui.v1.CircularProgress$Type$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CircularProgress.Type fromValue(int value) {
                    return CircularProgress.Type.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CircularProgress.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/CircularProgress$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/CircularProgress$Type;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                    return Type.TYPE_INFORM;
                }
                if (value != 2) {
                    return null;
                }
                return Type.TYPE_GOLD;
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

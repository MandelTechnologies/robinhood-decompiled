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
import rh_server_driven_ui.p531v1.TextPog;

/* compiled from: TextPog.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\"#BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JP\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0019¨\u0006$"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextPog;", "Lcom/squareup/wire/Message;", "", "text", "", "size", "Lrh_server_driven_ui/v1/TextPog$Size;", "foreground_color_override", "Lrh_server_driven_ui/v1/ThemedColor;", "background_color_override", "has_border", "", "is_disabled", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/TextPog$Size;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;ZZLokio/ByteString;)V", "getText", "()Ljava/lang/String;", "getSize", "()Lrh_server_driven_ui/v1/TextPog$Size;", "getForeground_color_override", "()Lrh_server_driven_ui/v1/ThemedColor;", "getBackground_color_override", "getHas_border", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "Size", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TextPog extends Message {

    @JvmField
    public static final ProtoAdapter<TextPog> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "backgroundColorOverride", schemaIndex = 3, tag = 4)
    private final ThemedColor background_color_override;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "foregroundColorOverride", schemaIndex = 2, tag = 3)
    private final ThemedColor foreground_color_override;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasBorder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean has_border;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDisabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean is_disabled;

    @WireField(adapter = "rh_server_driven_ui.v1.TextPog$Size#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Size size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String text;

    public TextPog() {
        this(null, null, null, null, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29840newBuilder();
    }

    public final String getText() {
        return this.text;
    }

    public /* synthetic */ TextPog(String str, Size size, ThemedColor themedColor, ThemedColor themedColor2, boolean z, boolean z2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Size.SIZE_UNSPECIFIED : size, (i & 4) != 0 ? null : themedColor, (i & 8) != 0 ? null : themedColor2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Size getSize() {
        return this.size;
    }

    public final ThemedColor getForeground_color_override() {
        return this.foreground_color_override;
    }

    public final ThemedColor getBackground_color_override() {
        return this.background_color_override;
    }

    public final boolean getHas_border() {
        return this.has_border;
    }

    /* renamed from: is_disabled, reason: from getter */
    public final boolean getIs_disabled() {
        return this.is_disabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextPog(String text, Size size, ThemedColor themedColor, ThemedColor themedColor2, boolean z, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.text = text;
        this.size = size;
        this.foreground_color_override = themedColor;
        this.background_color_override = themedColor2;
        this.has_border = z;
        this.is_disabled = z2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29840newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TextPog)) {
            return false;
        }
        TextPog textPog = (TextPog) other;
        return Intrinsics.areEqual(unknownFields(), textPog.unknownFields()) && Intrinsics.areEqual(this.text, textPog.text) && this.size == textPog.size && Intrinsics.areEqual(this.foreground_color_override, textPog.foreground_color_override) && Intrinsics.areEqual(this.background_color_override, textPog.background_color_override) && this.has_border == textPog.has_border && this.is_disabled == textPog.is_disabled;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.text.hashCode()) * 37) + this.size.hashCode()) * 37;
        ThemedColor themedColor = this.foreground_color_override;
        int iHashCode2 = (iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ThemedColor themedColor2 = this.background_color_override;
        int iHashCode3 = ((((iHashCode2 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37) + Boolean.hashCode(this.has_border)) * 37) + Boolean.hashCode(this.is_disabled);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("text=" + Internal.sanitize(this.text));
        arrayList.add("size=" + this.size);
        ThemedColor themedColor = this.foreground_color_override;
        if (themedColor != null) {
            arrayList.add("foreground_color_override=" + themedColor);
        }
        ThemedColor themedColor2 = this.background_color_override;
        if (themedColor2 != null) {
            arrayList.add("background_color_override=" + themedColor2);
        }
        arrayList.add("has_border=" + this.has_border);
        arrayList.add("is_disabled=" + this.is_disabled);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TextPog{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TextPog copy$default(TextPog textPog, String str, Size size, ThemedColor themedColor, ThemedColor themedColor2, boolean z, boolean z2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textPog.text;
        }
        if ((i & 2) != 0) {
            size = textPog.size;
        }
        if ((i & 4) != 0) {
            themedColor = textPog.foreground_color_override;
        }
        if ((i & 8) != 0) {
            themedColor2 = textPog.background_color_override;
        }
        if ((i & 16) != 0) {
            z = textPog.has_border;
        }
        if ((i & 32) != 0) {
            z2 = textPog.is_disabled;
        }
        if ((i & 64) != 0) {
            byteString = textPog.unknownFields();
        }
        boolean z3 = z2;
        ByteString byteString2 = byteString;
        boolean z4 = z;
        ThemedColor themedColor3 = themedColor;
        return textPog.copy(str, size, themedColor3, themedColor2, z4, z3, byteString2);
    }

    public final TextPog copy(String text, Size size, ThemedColor foreground_color_override, ThemedColor background_color_override, boolean has_border, boolean is_disabled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TextPog(text, size, foreground_color_override, background_color_override, has_border, is_disabled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TextPog.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TextPog>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.TextPog$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TextPog value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText());
                }
                if (value.getSize() != TextPog.Size.SIZE_UNSPECIFIED) {
                    size += TextPog.Size.ADAPTER.encodedSizeWithTag(2, value.getSize());
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getForeground_color_override()) + protoAdapter.encodedSizeWithTag(4, value.getBackground_color_override());
                if (value.getHas_border()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getHas_border()));
                }
                return value.getIs_disabled() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIs_disabled())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TextPog value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                }
                if (value.getSize() != TextPog.Size.SIZE_UNSPECIFIED) {
                    TextPog.Size.ADAPTER.encodeWithTag(writer, 2, (int) value.getSize());
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getForeground_color_override());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getBackground_color_override());
                if (value.getHas_border()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getHas_border()));
                }
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TextPog value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                if (value.getHas_border()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getHas_border()));
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getBackground_color_override());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getForeground_color_override());
                if (value.getSize() != TextPog.Size.SIZE_UNSPECIFIED) {
                    TextPog.Size.ADAPTER.encodeWithTag(writer, 2, (int) value.getSize());
                }
                if (Intrinsics.areEqual(value.getText(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TextPog decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TextPog.Size sizeDecode = TextPog.Size.SIZE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                String strDecode = "";
                ThemedColor themedColorDecode2 = null;
                while (true) {
                    TextPog.Size size = sizeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        sizeDecode = TextPog.Size.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 6:
                                    zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new TextPog(strDecode, size, themedColorDecode2, themedColorDecode, zBooleanValue, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TextPog redact(TextPog value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor foreground_color_override = value.getForeground_color_override();
                ThemedColor themedColorRedact = foreground_color_override != null ? ThemedColor.ADAPTER.redact(foreground_color_override) : null;
                ThemedColor background_color_override = value.getBackground_color_override();
                return TextPog.copy$default(value, null, null, themedColorRedact, background_color_override != null ? ThemedColor.ADAPTER.redact(background_color_override) : null, false, false, ByteString.EMPTY, 51, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextPog.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextPog$Size;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SIZE_UNSPECIFIED", "SIZE_EXTRA_SMALL", "SIZE_SMALL", "SIZE_LARGE", "SIZE_EXTRA_LARGE", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Size implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Size> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Size SIZE_EXTRA_LARGE;
        public static final Size SIZE_EXTRA_SMALL;
        public static final Size SIZE_LARGE;
        public static final Size SIZE_SMALL;
        public static final Size SIZE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{SIZE_UNSPECIFIED, SIZE_EXTRA_SMALL, SIZE_SMALL, SIZE_LARGE, SIZE_EXTRA_LARGE};
        }

        @JvmStatic
        public static final Size fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Size> getEntries() {
            return $ENTRIES;
        }

        private Size(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Size size = new Size("SIZE_UNSPECIFIED", 0, 0);
            SIZE_UNSPECIFIED = size;
            SIZE_EXTRA_SMALL = new Size("SIZE_EXTRA_SMALL", 1, 1);
            SIZE_SMALL = new Size("SIZE_SMALL", 2, 2);
            SIZE_LARGE = new Size("SIZE_LARGE", 3, 3);
            SIZE_EXTRA_LARGE = new Size("SIZE_EXTRA_LARGE", 4, 4);
            Size[] sizeArr$values = $values();
            $VALUES = sizeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sizeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Size.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Size>(orCreateKotlinClass, syntax, size) { // from class: rh_server_driven_ui.v1.TextPog$Size$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TextPog.Size fromValue(int value) {
                    return TextPog.Size.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TextPog.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextPog$Size$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/TextPog$Size;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Size fromValue(int value) {
                if (value == 0) {
                    return Size.SIZE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Size.SIZE_EXTRA_SMALL;
                }
                if (value == 2) {
                    return Size.SIZE_SMALL;
                }
                if (value == 3) {
                    return Size.SIZE_LARGE;
                }
                if (value != 4) {
                    return null;
                }
                return Size.SIZE_EXTRA_LARGE;
            }
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }
}

package rh_server_driven_ui.p531v1;

import com.robinhood.utils.extensions.ResourceTypes;
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
import rh_server_driven_ui.p531v1.TextButton;

/* compiled from: TextButton.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002()B_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0006H\u0016J^\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006*"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextButton;", "Lcom/squareup/wire/Message;", "", "action", "Lrh_server_driven_ui/v1/Action;", AnnotatedPrivateKey.LABEL, "", "icon", "Lrh_server_driven_ui/v1/Icon;", "is_disabled", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "logging_identifier", "size", "Lrh_server_driven_ui/v1/TextButton$Size;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Action;Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;ZLrh_server_driven_ui/v1/ThemedColor;Ljava/lang/String;Lrh_server_driven_ui/v1/TextButton$Size;Lokio/ByteString;)V", "getAction", "()Lrh_server_driven_ui/v1/Action;", "getLabel", "()Ljava/lang/String;", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "()Z", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "getLogging_identifier", "getSize", "()Lrh_server_driven_ui/v1/TextButton$Size;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "Size", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TextButton extends Message {

    @JvmField
    public static final ProtoAdapter<TextButton> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Action action;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", schemaIndex = 4, tag = 6)
    private final ThemedColor color;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", schemaIndex = 2, tag = 4)
    private final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDisabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final boolean is_disabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 5, tag = 7)
    private final String logging_identifier;

    @WireField(adapter = "rh_server_driven_ui.v1.TextButton$Size#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 8)
    private final Size size;

    public TextButton() {
        this(null, null, null, false, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29831newBuilder();
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public /* synthetic */ TextButton(Action action, String str, Icon icon, boolean z, ThemedColor themedColor, String str2, Size size, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : action, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : themedColor, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? Size.SIZE_UNSPECIFIED : size, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Icon getIcon() {
        return this.icon;
    }

    /* renamed from: is_disabled, reason: from getter */
    public final boolean getIs_disabled() {
        return this.is_disabled;
    }

    public final ThemedColor getColor() {
        return this.color;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final Size getSize() {
        return this.size;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextButton(Action action, String label, Icon icon, boolean z, ThemedColor themedColor, String str, Size size, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.action = action;
        this.label = label;
        this.icon = icon;
        this.is_disabled = z;
        this.color = themedColor;
        this.logging_identifier = str;
        this.size = size;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29831newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TextButton)) {
            return false;
        }
        TextButton textButton = (TextButton) other;
        return Intrinsics.areEqual(unknownFields(), textButton.unknownFields()) && Intrinsics.areEqual(this.action, textButton.action) && Intrinsics.areEqual(this.label, textButton.label) && this.icon == textButton.icon && this.is_disabled == textButton.is_disabled && Intrinsics.areEqual(this.color, textButton.color) && Intrinsics.areEqual(this.logging_identifier, textButton.logging_identifier) && this.size == textButton.size;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Action action = this.action;
        int iHashCode2 = (((iHashCode + (action != null ? action.hashCode() : 0)) * 37) + this.label.hashCode()) * 37;
        Icon icon = this.icon;
        int iHashCode3 = (((iHashCode2 + (icon != null ? icon.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_disabled)) * 37;
        ThemedColor themedColor = this.color;
        int iHashCode4 = (iHashCode3 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        String str = this.logging_identifier;
        int iHashCode5 = ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 37) + this.size.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        arrayList.add("label=" + Internal.sanitize(this.label));
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        arrayList.add("is_disabled=" + this.is_disabled);
        ThemedColor themedColor = this.color;
        if (themedColor != null) {
            arrayList.add("color=" + themedColor);
        }
        String str = this.logging_identifier;
        if (str != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str));
        }
        arrayList.add("size=" + this.size);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TextButton{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TextButton copy$default(TextButton textButton, Action action, String str, Icon icon, boolean z, ThemedColor themedColor, String str2, Size size, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            action = textButton.action;
        }
        if ((i & 2) != 0) {
            str = textButton.label;
        }
        if ((i & 4) != 0) {
            icon = textButton.icon;
        }
        if ((i & 8) != 0) {
            z = textButton.is_disabled;
        }
        if ((i & 16) != 0) {
            themedColor = textButton.color;
        }
        if ((i & 32) != 0) {
            str2 = textButton.logging_identifier;
        }
        if ((i & 64) != 0) {
            size = textButton.size;
        }
        if ((i & 128) != 0) {
            byteString = textButton.unknownFields();
        }
        Size size2 = size;
        ByteString byteString2 = byteString;
        ThemedColor themedColor2 = themedColor;
        String str3 = str2;
        return textButton.copy(action, str, icon, z, themedColor2, str3, size2, byteString2);
    }

    public final TextButton copy(Action action, String label, Icon icon, boolean is_disabled, ThemedColor color, String logging_identifier, Size size, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TextButton(action, label, icon, is_disabled, color, logging_identifier, size, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TextButton.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TextButton>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.TextButton$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TextButton value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAction() != null) {
                    size += Action.ADAPTER.encodedSizeWithTag(1, value.getAction());
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLabel());
                }
                int iEncodedSizeWithTag = size + Icon.ADAPTER.encodedSizeWithTag(4, value.getIcon());
                if (value.getIs_disabled()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_disabled()));
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + ThemedColor.ADAPTER.encodedSizeWithTag(6, value.getColor()) + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getLogging_identifier());
                return value.getSize() != TextButton.Size.SIZE_UNSPECIFIED ? iEncodedSizeWithTag2 + TextButton.Size.ADAPTER.encodedSizeWithTag(8, value.getSize()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TextButton value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAction() != null) {
                    Action.ADAPTER.encodeWithTag(writer, 1, (int) value.getAction());
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLabel());
                }
                Icon.ADAPTER.encodeWithTag(writer, 4, (int) value.getIcon());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 6, (int) value.getColor());
                ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                if (value.getSize() != TextButton.Size.SIZE_UNSPECIFIED) {
                    TextButton.Size.ADAPTER.encodeWithTag(writer, 8, (int) value.getSize());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TextButton value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSize() != TextButton.Size.SIZE_UNSPECIFIED) {
                    TextButton.Size.ADAPTER.encodeWithTag(writer, 8, (int) value.getSize());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getLogging_identifier());
                ThemedColor.ADAPTER.encodeWithTag(writer, 6, (int) value.getColor());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                Icon.ADAPTER.encodeWithTag(writer, 4, (int) value.getIcon());
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getLabel());
                }
                if (value.getAction() != null) {
                    Action.ADAPTER.encodeWithTag(writer, 1, (int) value.getAction());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TextButton decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TextButton.Size size = TextButton.Size.SIZE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                String strDecode = null;
                String strDecode2 = "";
                boolean zBooleanValue = false;
                TextButton.Size sizeDecode = size;
                Action actionDecode = null;
                Icon iconDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                actionDecode = Action.ADAPTER.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 4:
                                try {
                                    iconDecode = Icon.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 6:
                                themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                try {
                                    sizeDecode = TextButton.Size.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                        }
                    } else {
                        return new TextButton(actionDecode, strDecode2, iconDecode, zBooleanValue, themedColorDecode, strDecode, sizeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TextButton redact(TextButton value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Action action = value.getAction();
                Action actionRedact = action != null ? Action.ADAPTER.redact(action) : null;
                ThemedColor color = value.getColor();
                return TextButton.copy$default(value, actionRedact, null, null, false, color != null ? ThemedColor.ADAPTER.redact(color) : null, null, null, ByteString.EMPTY, 110, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextButton.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextButton$Size;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SIZE_UNSPECIFIED", "SIZE_SMALL", "SIZE_MEDIUM", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Size implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Size> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Size SIZE_MEDIUM;
        public static final Size SIZE_SMALL;
        public static final Size SIZE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{SIZE_UNSPECIFIED, SIZE_SMALL, SIZE_MEDIUM};
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
            SIZE_SMALL = new Size("SIZE_SMALL", 1, 1);
            SIZE_MEDIUM = new Size("SIZE_MEDIUM", 2, 2);
            Size[] sizeArr$values = $values();
            $VALUES = sizeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sizeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Size.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Size>(orCreateKotlinClass, syntax, size) { // from class: rh_server_driven_ui.v1.TextButton$Size$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TextButton.Size fromValue(int value) {
                    return TextButton.Size.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TextButton.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextButton$Size$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/TextButton$Size;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                    return Size.SIZE_SMALL;
                }
                if (value != 2) {
                    return null;
                }
                return Size.SIZE_MEDIUM;
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

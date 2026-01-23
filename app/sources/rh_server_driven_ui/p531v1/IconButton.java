package rh_server_driven_ui.p531v1;

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
import rh_server_driven_ui.p531v1.IconButton;

/* compiled from: IconButton.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002./Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010%\u001a\u00020\u0002H\u0017J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\fH\u0016Jh\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#¨\u00060"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconButton;", "Lcom/squareup/wire/Message;", "", "type", "Lrh_server_driven_ui/v1/ButtonType;", "size", "Lrh_server_driven_ui/v1/IconButton$Size;", "action", "Lrh_server_driven_ui/v1/Action;", "state", "Lrh_server_driven_ui/v1/ButtonState;", "logging_identifier", "", "icon", "Lrh_server_driven_ui/v1/Icon;", "background_color", "Lrh_server_driven_ui/v1/ThemedColor;", "foreground_color", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ButtonType;Lrh_server_driven_ui/v1/IconButton$Size;Lrh_server_driven_ui/v1/Action;Lrh_server_driven_ui/v1/ButtonState;Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)V", "getType", "()Lrh_server_driven_ui/v1/ButtonType;", "getSize", "()Lrh_server_driven_ui/v1/IconButton$Size;", "getAction", "()Lrh_server_driven_ui/v1/Action;", "getState", "()Lrh_server_driven_ui/v1/ButtonState;", "getLogging_identifier", "()Ljava/lang/String;", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getForeground_color", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Size", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class IconButton extends Message {

    @JvmField
    public static final ProtoAdapter<IconButton> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Action action;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "backgroundColor", schemaIndex = 6, tag = 7)
    private final ThemedColor background_color;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "foregroundColor", schemaIndex = 7, tag = 8)
    private final ThemedColor foreground_color;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 4, tag = 5)
    private final String logging_identifier;

    @WireField(adapter = "rh_server_driven_ui.v1.IconButton$Size#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Size size;

    @WireField(adapter = "rh_server_driven_ui.v1.ButtonState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ButtonState state;

    @WireField(adapter = "rh_server_driven_ui.v1.ButtonType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ButtonType type;

    public IconButton() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29747newBuilder();
    }

    public final ButtonType getType() {
        return this.type;
    }

    public /* synthetic */ IconButton(ButtonType buttonType, Size size, Action action, ButtonState buttonState, String str, Icon icon, ThemedColor themedColor, ThemedColor themedColor2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ButtonType.BUTTON_TYPE_UNSPECIFIED : buttonType, (i & 2) != 0 ? Size.SIZE_UNSPECIFIED : size, (i & 4) != 0 ? null : action, (i & 8) != 0 ? ButtonState.BUTTON_STATE_UNSPECIFIED : buttonState, (i & 16) != 0 ? null : str, (i & 32) != 0 ? Icon.ICON_UNSPECIFIED : icon, (i & 64) != 0 ? null : themedColor, (i & 128) != 0 ? null : themedColor2, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Size getSize() {
        return this.size;
    }

    public final Action getAction() {
        return this.action;
    }

    public final ButtonState getState() {
        return this.state;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final ThemedColor getBackground_color() {
        return this.background_color;
    }

    public final ThemedColor getForeground_color() {
        return this.foreground_color;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButton(ButtonType type2, Size size, Action action, ButtonState state, String str, Icon icon, ThemedColor themedColor, ThemedColor themedColor2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.size = size;
        this.action = action;
        this.state = state;
        this.logging_identifier = str;
        this.icon = icon;
        this.background_color = themedColor;
        this.foreground_color = themedColor2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29747newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IconButton)) {
            return false;
        }
        IconButton iconButton = (IconButton) other;
        return Intrinsics.areEqual(unknownFields(), iconButton.unknownFields()) && this.type == iconButton.type && this.size == iconButton.size && Intrinsics.areEqual(this.action, iconButton.action) && this.state == iconButton.state && Intrinsics.areEqual(this.logging_identifier, iconButton.logging_identifier) && this.icon == iconButton.icon && Intrinsics.areEqual(this.background_color, iconButton.background_color) && Intrinsics.areEqual(this.foreground_color, iconButton.foreground_color);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.size.hashCode()) * 37;
        Action action = this.action;
        int iHashCode2 = (((iHashCode + (action != null ? action.hashCode() : 0)) * 37) + this.state.hashCode()) * 37;
        String str = this.logging_identifier;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 37) + this.icon.hashCode()) * 37;
        ThemedColor themedColor = this.background_color;
        int iHashCode4 = (iHashCode3 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ThemedColor themedColor2 = this.foreground_color;
        int iHashCode5 = iHashCode4 + (themedColor2 != null ? themedColor2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        arrayList.add("size=" + this.size);
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        arrayList.add("state=" + this.state);
        String str = this.logging_identifier;
        if (str != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str));
        }
        arrayList.add("icon=" + this.icon);
        ThemedColor themedColor = this.background_color;
        if (themedColor != null) {
            arrayList.add("background_color=" + themedColor);
        }
        ThemedColor themedColor2 = this.foreground_color;
        if (themedColor2 != null) {
            arrayList.add("foreground_color=" + themedColor2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IconButton{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IconButton copy$default(IconButton iconButton, ButtonType buttonType, Size size, Action action, ButtonState buttonState, String str, Icon icon, ThemedColor themedColor, ThemedColor themedColor2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            buttonType = iconButton.type;
        }
        if ((i & 2) != 0) {
            size = iconButton.size;
        }
        if ((i & 4) != 0) {
            action = iconButton.action;
        }
        if ((i & 8) != 0) {
            buttonState = iconButton.state;
        }
        if ((i & 16) != 0) {
            str = iconButton.logging_identifier;
        }
        if ((i & 32) != 0) {
            icon = iconButton.icon;
        }
        if ((i & 64) != 0) {
            themedColor = iconButton.background_color;
        }
        if ((i & 128) != 0) {
            themedColor2 = iconButton.foreground_color;
        }
        if ((i & 256) != 0) {
            byteString = iconButton.unknownFields();
        }
        ThemedColor themedColor3 = themedColor2;
        ByteString byteString2 = byteString;
        Icon icon2 = icon;
        ThemedColor themedColor4 = themedColor;
        String str2 = str;
        Action action2 = action;
        return iconButton.copy(buttonType, size, action2, buttonState, str2, icon2, themedColor4, themedColor3, byteString2);
    }

    public final IconButton copy(ButtonType type2, Size size, Action action, ButtonState state, String logging_identifier, Icon icon, ThemedColor background_color, ThemedColor foreground_color, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IconButton(type2, size, action, state, logging_identifier, icon, background_color, foreground_color, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IconButton.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IconButton>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.IconButton$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IconButton value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != ButtonType.BUTTON_TYPE_UNSPECIFIED) {
                    size += ButtonType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                if (value.getSize() != IconButton.Size.SIZE_UNSPECIFIED) {
                    size += IconButton.Size.ADAPTER.encodedSizeWithTag(2, value.getSize());
                }
                if (value.getAction() != null) {
                    size += Action.ADAPTER.encodedSizeWithTag(3, value.getAction());
                }
                if (value.getState() != ButtonState.BUTTON_STATE_UNSPECIFIED) {
                    size += ButtonState.ADAPTER.encodedSizeWithTag(4, value.getState());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLogging_identifier());
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    iEncodedSizeWithTag += Icon.ADAPTER.encodedSizeWithTag(6, value.getIcon());
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(7, value.getBackground_color()) + protoAdapter.encodedSizeWithTag(8, value.getForeground_color());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IconButton value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != ButtonType.BUTTON_TYPE_UNSPECIFIED) {
                    ButtonType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (value.getSize() != IconButton.Size.SIZE_UNSPECIFIED) {
                    IconButton.Size.ADAPTER.encodeWithTag(writer, 2, (int) value.getSize());
                }
                if (value.getAction() != null) {
                    Action.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                }
                if (value.getState() != ButtonState.BUTTON_STATE_UNSPECIFIED) {
                    ButtonState.ADAPTER.encodeWithTag(writer, 4, (int) value.getState());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    Icon.ADAPTER.encodeWithTag(writer, 6, (int) value.getIcon());
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getBackground_color());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getForeground_color());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IconButton value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getForeground_color());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getBackground_color());
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    Icon.ADAPTER.encodeWithTag(writer, 6, (int) value.getIcon());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                if (value.getState() != ButtonState.BUTTON_STATE_UNSPECIFIED) {
                    ButtonState.ADAPTER.encodeWithTag(writer, 4, (int) value.getState());
                }
                if (value.getAction() != null) {
                    Action.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                }
                if (value.getSize() != IconButton.Size.SIZE_UNSPECIFIED) {
                    IconButton.Size.ADAPTER.encodeWithTag(writer, 2, (int) value.getSize());
                }
                if (value.getType() != ButtonType.BUTTON_TYPE_UNSPECIFIED) {
                    ButtonType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IconButton decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ButtonType buttonTypeDecode = ButtonType.BUTTON_TYPE_UNSPECIFIED;
                IconButton.Size size = IconButton.Size.SIZE_UNSPECIFIED;
                ButtonState buttonState = ButtonState.BUTTON_STATE_UNSPECIFIED;
                Icon icon = Icon.ICON_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Action actionDecode = null;
                String strDecode = null;
                ThemedColor themedColorDecode = null;
                ThemedColor themedColorDecode2 = null;
                Icon iconDecode = icon;
                ButtonState buttonStateDecode = buttonState;
                IconButton.Size sizeDecode = size;
                while (true) {
                    ButtonType buttonType = buttonTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        buttonTypeDecode = ButtonType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    try {
                                        sizeDecode = IconButton.Size.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 3:
                                    actionDecode = Action.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    try {
                                        buttonStateDecode = ButtonState.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 5:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    try {
                                        iconDecode = Icon.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                case 7:
                                    themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 8:
                                    themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new IconButton(buttonType, sizeDecode, actionDecode, buttonStateDecode, strDecode, iconDecode, themedColorDecode, themedColorDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IconButton redact(IconButton value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Action action = value.getAction();
                Action actionRedact = action != null ? Action.ADAPTER.redact(action) : null;
                ThemedColor background_color = value.getBackground_color();
                ThemedColor themedColorRedact = background_color != null ? ThemedColor.ADAPTER.redact(background_color) : null;
                ThemedColor foreground_color = value.getForeground_color();
                return IconButton.copy$default(value, null, null, actionRedact, null, null, null, themedColorRedact, foreground_color != null ? ThemedColor.ADAPTER.redact(foreground_color) : null, ByteString.EMPTY, 59, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IconButton.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconButton$Size;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SIZE_UNSPECIFIED", "SIZE_TINY", "SIZE_SMALL", "SIZE_MEDIUM", "SIZE_LARGE", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Size implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Size> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Size SIZE_LARGE;
        public static final Size SIZE_MEDIUM;
        public static final Size SIZE_SMALL;
        public static final Size SIZE_TINY;
        public static final Size SIZE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{SIZE_UNSPECIFIED, SIZE_TINY, SIZE_SMALL, SIZE_MEDIUM, SIZE_LARGE};
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
            SIZE_TINY = new Size("SIZE_TINY", 1, 1);
            SIZE_SMALL = new Size("SIZE_SMALL", 2, 2);
            SIZE_MEDIUM = new Size("SIZE_MEDIUM", 3, 3);
            SIZE_LARGE = new Size("SIZE_LARGE", 4, 4);
            Size[] sizeArr$values = $values();
            $VALUES = sizeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sizeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Size.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Size>(orCreateKotlinClass, syntax, size) { // from class: rh_server_driven_ui.v1.IconButton$Size$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public IconButton.Size fromValue(int value) {
                    return IconButton.Size.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: IconButton.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconButton$Size$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/IconButton$Size;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                    return Size.SIZE_TINY;
                }
                if (value == 2) {
                    return Size.SIZE_SMALL;
                }
                if (value == 3) {
                    return Size.SIZE_MEDIUM;
                }
                if (value != 4) {
                    return null;
                }
                return Size.SIZE_LARGE;
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

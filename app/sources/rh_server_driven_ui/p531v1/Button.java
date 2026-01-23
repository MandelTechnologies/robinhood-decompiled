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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rh_server_driven_ui.p531v1.Button;

/* compiled from: Button.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,-Bk\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0006H\u0016Jj\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006."}, m3636d2 = {"Lrh_server_driven_ui/v1/Button;", "Lcom/squareup/wire/Message;", "", "action", "Lrh_server_driven_ui/v1/Action;", AnnotatedPrivateKey.LABEL, "", "type", "Lrh_server_driven_ui/v1/ButtonType;", "icon", "Lrh_server_driven_ui/v1/Button$ButtonIcon;", "logging_identifier", "tint_color", "Lrh_server_driven_ui/v1/ThemedColor;", "text_color", "state", "Lrh_server_driven_ui/v1/ButtonState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Action;Ljava/lang/String;Lrh_server_driven_ui/v1/ButtonType;Lrh_server_driven_ui/v1/Button$ButtonIcon;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ButtonState;Lokio/ByteString;)V", "getAction", "()Lrh_server_driven_ui/v1/Action;", "getLabel", "()Ljava/lang/String;", "getType", "()Lrh_server_driven_ui/v1/ButtonType;", "getIcon", "()Lrh_server_driven_ui/v1/Button$ButtonIcon;", "getLogging_identifier", "getTint_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getText_color", "getState", "()Lrh_server_driven_ui/v1/ButtonState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ButtonIcon", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Button extends Message {

    @JvmField
    public static final ProtoAdapter<Button> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Action action;

    @WireField(adapter = "rh_server_driven_ui.v1.Button$ButtonIcon#ADAPTER", schemaIndex = 3, tag = 4)
    private final ButtonIcon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 4, tag = 5)
    private final String logging_identifier;

    @WireField(adapter = "rh_server_driven_ui.v1.ButtonState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final ButtonState state;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "textColor", schemaIndex = 6, tag = 7)
    private final ThemedColor text_color;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "tintColor", schemaIndex = 5, tag = 6)
    private final ThemedColor tint_color;

    @WireField(adapter = "rh_server_driven_ui.v1.ButtonType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ButtonType type;

    public Button() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29667newBuilder();
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public /* synthetic */ Button(Action action, String str, ButtonType buttonType, ButtonIcon buttonIcon, String str2, ThemedColor themedColor, ThemedColor themedColor2, ButtonState buttonState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : action, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ButtonType.BUTTON_TYPE_UNSPECIFIED : buttonType, (i & 8) != 0 ? null : buttonIcon, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : themedColor, (i & 64) != 0 ? null : themedColor2, (i & 128) != 0 ? ButtonState.BUTTON_STATE_UNSPECIFIED : buttonState, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ButtonType getType() {
        return this.type;
    }

    public final ButtonIcon getIcon() {
        return this.icon;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final ThemedColor getTint_color() {
        return this.tint_color;
    }

    public final ThemedColor getText_color() {
        return this.text_color;
    }

    public final ButtonState getState() {
        return this.state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Button(Action action, String label, ButtonType type2, ButtonIcon buttonIcon, String str, ThemedColor themedColor, ThemedColor themedColor2, ButtonState state, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.action = action;
        this.label = label;
        this.type = type2;
        this.icon = buttonIcon;
        this.logging_identifier = str;
        this.tint_color = themedColor;
        this.text_color = themedColor2;
        this.state = state;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29667newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Button)) {
            return false;
        }
        Button button = (Button) other;
        return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.action, button.action) && Intrinsics.areEqual(this.label, button.label) && this.type == button.type && Intrinsics.areEqual(this.icon, button.icon) && Intrinsics.areEqual(this.logging_identifier, button.logging_identifier) && Intrinsics.areEqual(this.tint_color, button.tint_color) && Intrinsics.areEqual(this.text_color, button.text_color) && this.state == button.state;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Action action = this.action;
        int iHashCode2 = (((((iHashCode + (action != null ? action.hashCode() : 0)) * 37) + this.label.hashCode()) * 37) + this.type.hashCode()) * 37;
        ButtonIcon buttonIcon = this.icon;
        int iHashCode3 = (iHashCode2 + (buttonIcon != null ? buttonIcon.hashCode() : 0)) * 37;
        String str = this.logging_identifier;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        ThemedColor themedColor = this.tint_color;
        int iHashCode5 = (iHashCode4 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ThemedColor themedColor2 = this.text_color;
        int iHashCode6 = ((iHashCode5 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37) + this.state.hashCode();
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        arrayList.add("label=" + Internal.sanitize(this.label));
        arrayList.add("type=" + this.type);
        ButtonIcon buttonIcon = this.icon;
        if (buttonIcon != null) {
            arrayList.add("icon=" + buttonIcon);
        }
        String str = this.logging_identifier;
        if (str != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str));
        }
        ThemedColor themedColor = this.tint_color;
        if (themedColor != null) {
            arrayList.add("tint_color=" + themedColor);
        }
        ThemedColor themedColor2 = this.text_color;
        if (themedColor2 != null) {
            arrayList.add("text_color=" + themedColor2);
        }
        arrayList.add("state=" + this.state);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Button copy$default(Button button, Action action, String str, ButtonType buttonType, ButtonIcon buttonIcon, String str2, ThemedColor themedColor, ThemedColor themedColor2, ButtonState buttonState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            action = button.action;
        }
        if ((i & 2) != 0) {
            str = button.label;
        }
        if ((i & 4) != 0) {
            buttonType = button.type;
        }
        if ((i & 8) != 0) {
            buttonIcon = button.icon;
        }
        if ((i & 16) != 0) {
            str2 = button.logging_identifier;
        }
        if ((i & 32) != 0) {
            themedColor = button.tint_color;
        }
        if ((i & 64) != 0) {
            themedColor2 = button.text_color;
        }
        if ((i & 128) != 0) {
            buttonState = button.state;
        }
        if ((i & 256) != 0) {
            byteString = button.unknownFields();
        }
        ButtonState buttonState2 = buttonState;
        ByteString byteString2 = byteString;
        ThemedColor themedColor3 = themedColor;
        ThemedColor themedColor4 = themedColor2;
        String str3 = str2;
        ButtonType buttonType2 = buttonType;
        return button.copy(action, str, buttonType2, buttonIcon, str3, themedColor3, themedColor4, buttonState2, byteString2);
    }

    public final Button copy(Action action, String label, ButtonType type2, ButtonIcon icon, String logging_identifier, ThemedColor tint_color, ThemedColor text_color, ButtonState state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Button(action, label, type2, icon, logging_identifier, tint_color, text_color, state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Button.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Button>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Button$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Button value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAction() != null) {
                    size += Action.ADAPTER.encodedSizeWithTag(1, value.getAction());
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLabel());
                }
                if (value.getType() != ButtonType.BUTTON_TYPE_UNSPECIFIED) {
                    size += ButtonType.ADAPTER.encodedSizeWithTag(3, value.getType());
                }
                int iEncodedSizeWithTag = size + Button.ButtonIcon.ADAPTER.encodedSizeWithTag(4, value.getIcon()) + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLogging_identifier());
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(6, value.getTint_color()) + protoAdapter.encodedSizeWithTag(7, value.getText_color());
                return value.getState() != ButtonState.BUTTON_STATE_UNSPECIFIED ? iEncodedSizeWithTag2 + ButtonState.ADAPTER.encodedSizeWithTag(8, value.getState()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Button value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAction() != null) {
                    Action.ADAPTER.encodeWithTag(writer, 1, (int) value.getAction());
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLabel());
                }
                if (value.getType() != ButtonType.BUTTON_TYPE_UNSPECIFIED) {
                    ButtonType.ADAPTER.encodeWithTag(writer, 3, (int) value.getType());
                }
                Button.ButtonIcon.ADAPTER.encodeWithTag(writer, 4, (int) value.getIcon());
                ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getTint_color());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getText_color());
                if (value.getState() != ButtonState.BUTTON_STATE_UNSPECIFIED) {
                    ButtonState.ADAPTER.encodeWithTag(writer, 8, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Button value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getState() != ButtonState.BUTTON_STATE_UNSPECIFIED) {
                    ButtonState.ADAPTER.encodeWithTag(writer, 8, (int) value.getState());
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getText_color());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getTint_color());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                Button.ButtonIcon.ADAPTER.encodeWithTag(writer, 4, (int) value.getIcon());
                if (value.getType() != ButtonType.BUTTON_TYPE_UNSPECIFIED) {
                    ButtonType.ADAPTER.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    protoAdapter2.encodeWithTag(writer, 2, (int) value.getLabel());
                }
                if (value.getAction() != null) {
                    Action.ADAPTER.encodeWithTag(writer, 1, (int) value.getAction());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Button decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ButtonType buttonTypeDecode = ButtonType.BUTTON_TYPE_UNSPECIFIED;
                ButtonState buttonState = ButtonState.BUTTON_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Button.ButtonIcon buttonIconDecode = null;
                String strDecode = null;
                ThemedColor themedColorDecode = null;
                ThemedColor themedColorDecode2 = null;
                String strDecode2 = "";
                ButtonState buttonStateDecode = buttonState;
                Action actionDecode = null;
                while (true) {
                    ButtonType buttonType = buttonTypeDecode;
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
                                    try {
                                        buttonTypeDecode = ButtonType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 4:
                                    buttonIconDecode = Button.ButtonIcon.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 7:
                                    themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 8:
                                    try {
                                        buttonStateDecode = ButtonState.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new Button(actionDecode, strDecode2, buttonType, buttonIconDecode, strDecode, themedColorDecode, themedColorDecode2, buttonStateDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Button redact(Button value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Action action = value.getAction();
                Action actionRedact = action != null ? Action.ADAPTER.redact(action) : null;
                Button.ButtonIcon icon = value.getIcon();
                Button.ButtonIcon buttonIconRedact = icon != null ? Button.ButtonIcon.ADAPTER.redact(icon) : null;
                ThemedColor tint_color = value.getTint_color();
                ThemedColor themedColorRedact = tint_color != null ? ThemedColor.ADAPTER.redact(tint_color) : null;
                ThemedColor text_color = value.getText_color();
                return Button.copy$default(value, actionRedact, null, null, buttonIconRedact, null, themedColorRedact, text_color != null ? ThemedColor.ADAPTER.redact(text_color) : null, null, ByteString.EMPTY, 150, null);
            }
        };
    }

    /* compiled from: Button.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lrh_server_driven_ui/v1/Button$ButtonIcon;", "Lcom/squareup/wire/Message;", "", "icon", "Lrh_server_driven_ui/v1/Icon;", "position", "Lrh_server_driven_ui/v1/Button$ButtonIcon$Position;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Icon;Lrh_server_driven_ui/v1/Button$ButtonIcon$Position;Lokio/ByteString;)V", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "getPosition", "()Lrh_server_driven_ui/v1/Button$ButtonIcon$Position;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Position", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ButtonIcon extends Message {

        @JvmField
        public static final ProtoAdapter<ButtonIcon> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Icon icon;

        @WireField(adapter = "rh_server_driven_ui.v1.Button$ButtonIcon$Position#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Position position;

        public ButtonIcon() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29668newBuilder();
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public /* synthetic */ ButtonIcon(Icon icon, Position position, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Icon.ICON_UNSPECIFIED : icon, (i & 2) != 0 ? Position.POSITION_UNSPECIFIED : position, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public final Position getPosition() {
            return this.position;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ButtonIcon(Icon icon, Position position, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.icon = icon;
            this.position = position;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29668newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ButtonIcon)) {
                return false;
            }
            ButtonIcon buttonIcon = (ButtonIcon) other;
            return Intrinsics.areEqual(unknownFields(), buttonIcon.unknownFields()) && this.icon == buttonIcon.icon && this.position == buttonIcon.position;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.icon.hashCode()) * 37) + this.position.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("icon=" + this.icon);
            arrayList.add("position=" + this.position);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonIcon{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ButtonIcon copy$default(ButtonIcon buttonIcon, Icon icon, Position position, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                icon = buttonIcon.icon;
            }
            if ((i & 2) != 0) {
                position = buttonIcon.position;
            }
            if ((i & 4) != 0) {
                byteString = buttonIcon.unknownFields();
            }
            return buttonIcon.copy(icon, position, byteString);
        }

        public final ButtonIcon copy(Icon icon, Position position, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ButtonIcon(icon, position, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ButtonIcon.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ButtonIcon>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Button$ButtonIcon$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Button.ButtonIcon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                        size += Icon.ADAPTER.encodedSizeWithTag(1, value.getIcon());
                    }
                    return value.getPosition() != Button.ButtonIcon.Position.POSITION_UNSPECIFIED ? size + Button.ButtonIcon.Position.ADAPTER.encodedSizeWithTag(2, value.getPosition()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Button.ButtonIcon value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                        Icon.ADAPTER.encodeWithTag(writer, 1, (int) value.getIcon());
                    }
                    if (value.getPosition() != Button.ButtonIcon.Position.POSITION_UNSPECIFIED) {
                        Button.ButtonIcon.Position.ADAPTER.encodeWithTag(writer, 2, (int) value.getPosition());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Button.ButtonIcon value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getPosition() != Button.ButtonIcon.Position.POSITION_UNSPECIFIED) {
                        Button.ButtonIcon.Position.ADAPTER.encodeWithTag(writer, 2, (int) value.getPosition());
                    }
                    if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                        Icon.ADAPTER.encodeWithTag(writer, 1, (int) value.getIcon());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Button.ButtonIcon decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    Icon iconDecode = Icon.ICON_UNSPECIFIED;
                    Button.ButtonIcon.Position positionDecode = Button.ButtonIcon.Position.POSITION_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new Button.ButtonIcon(iconDecode, positionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                iconDecode = Icon.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                positionDecode = Button.ButtonIcon.Position.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Button.ButtonIcon redact(Button.ButtonIcon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return Button.ButtonIcon.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Button.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/Button$ButtonIcon$Position;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "POSITION_UNSPECIFIED", "POSITION_LEFT", "POSITION_RIGHT", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Position implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Position[] $VALUES;

            @JvmField
            public static final ProtoAdapter<Position> ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Position POSITION_LEFT;
            public static final Position POSITION_RIGHT;
            public static final Position POSITION_UNSPECIFIED;
            private final int value;

            private static final /* synthetic */ Position[] $values() {
                return new Position[]{POSITION_UNSPECIFIED, POSITION_LEFT, POSITION_RIGHT};
            }

            @JvmStatic
            public static final Position fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<Position> getEntries() {
                return $ENTRIES;
            }

            private Position(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final Position position = new Position("POSITION_UNSPECIFIED", 0, 0);
                POSITION_UNSPECIFIED = position;
                POSITION_LEFT = new Position("POSITION_LEFT", 1, 1);
                POSITION_RIGHT = new Position("POSITION_RIGHT", 2, 2);
                Position[] positionArr$values = $values();
                $VALUES = positionArr$values;
                $ENTRIES = EnumEntries2.enumEntries(positionArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Position.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<Position>(orCreateKotlinClass, syntax, position) { // from class: rh_server_driven_ui.v1.Button$ButtonIcon$Position$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public Button.ButtonIcon.Position fromValue(int value) {
                        return Button.ButtonIcon.Position.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: Button.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/Button$ButtonIcon$Position$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/Button$ButtonIcon$Position;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final Position fromValue(int value) {
                    if (value == 0) {
                        return Position.POSITION_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Position.POSITION_LEFT;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return Position.POSITION_RIGHT;
                }
            }

            public static Position valueOf(String str) {
                return (Position) Enum.valueOf(Position.class, str);
            }

            public static Position[] values() {
                return (Position[]) $VALUES.clone();
            }
        }
    }
}

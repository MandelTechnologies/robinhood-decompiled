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
import rh_server_driven_ui.p531v1.InfoTag;

/* compiled from: InfoTag.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0004H\u0016Jj\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006-"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoTag;", "Lcom/squareup/wire/Message;", "", AnnotatedPrivateKey.LABEL, "", "type", "Lrh_server_driven_ui/v1/InfoTag$Type;", "logging_identifier", "icon", "Lrh_server_driven_ui/v1/Icon;", "background_color_override", "Lrh_server_driven_ui/v1/ThemedColor;", "text_color_override", "prefers_icon_on_right", "", "action", "Lrh_server_driven_ui/v1/Action;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/InfoTag$Type;Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;ZLrh_server_driven_ui/v1/Action;Lokio/ByteString;)V", "getLabel", "()Ljava/lang/String;", "getType", "()Lrh_server_driven_ui/v1/InfoTag$Type;", "getLogging_identifier", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "getBackground_color_override", "()Lrh_server_driven_ui/v1/ThemedColor;", "getText_color_override", "getPrefers_icon_on_right", "()Z", "getAction", "()Lrh_server_driven_ui/v1/Action;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "Type", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class InfoTag extends Message {

    @JvmField
    public static final ProtoAdapter<InfoTag> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", schemaIndex = 7, tag = 8)
    private final Action action;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "backgroundColorOverride", schemaIndex = 4, tag = 5)
    private final ThemedColor background_color_override;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", schemaIndex = 3, tag = 4)
    private final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 2, tag = 3)
    private final String logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "prefersIconOnRight", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final boolean prefers_icon_on_right;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "textColorOverride", schemaIndex = 5, tag = 6)
    private final ThemedColor text_color_override;

    @WireField(adapter = "rh_server_driven_ui.v1.InfoTag$Type#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Type type;

    public InfoTag() {
        this(null, null, null, null, null, null, false, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29767newBuilder();
    }

    public final String getLabel() {
        return this.label;
    }

    public /* synthetic */ InfoTag(String str, Type type2, String str2, Icon icon, ThemedColor themedColor, ThemedColor themedColor2, boolean z, Action action, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Type.TYPE_UNSPECIFIED : type2, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : icon, (i & 16) != 0 ? null : themedColor, (i & 32) != 0 ? null : themedColor2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : action, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Type getType() {
        return this.type;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final ThemedColor getBackground_color_override() {
        return this.background_color_override;
    }

    public final ThemedColor getText_color_override() {
        return this.text_color_override;
    }

    public final boolean getPrefers_icon_on_right() {
        return this.prefers_icon_on_right;
    }

    public final Action getAction() {
        return this.action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoTag(String label, Type type2, String str, Icon icon, ThemedColor themedColor, ThemedColor themedColor2, boolean z, Action action, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.label = label;
        this.type = type2;
        this.logging_identifier = str;
        this.icon = icon;
        this.background_color_override = themedColor;
        this.text_color_override = themedColor2;
        this.prefers_icon_on_right = z;
        this.action = action;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29767newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InfoTag)) {
            return false;
        }
        InfoTag infoTag = (InfoTag) other;
        return Intrinsics.areEqual(unknownFields(), infoTag.unknownFields()) && Intrinsics.areEqual(this.label, infoTag.label) && this.type == infoTag.type && Intrinsics.areEqual(this.logging_identifier, infoTag.logging_identifier) && this.icon == infoTag.icon && Intrinsics.areEqual(this.background_color_override, infoTag.background_color_override) && Intrinsics.areEqual(this.text_color_override, infoTag.text_color_override) && this.prefers_icon_on_right == infoTag.prefers_icon_on_right && Intrinsics.areEqual(this.action, infoTag.action);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.label.hashCode()) * 37) + this.type.hashCode()) * 37;
        String str = this.logging_identifier;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Icon icon = this.icon;
        int iHashCode3 = (iHashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
        ThemedColor themedColor = this.background_color_override;
        int iHashCode4 = (iHashCode3 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ThemedColor themedColor2 = this.text_color_override;
        int iHashCode5 = (((iHashCode4 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37) + Boolean.hashCode(this.prefers_icon_on_right)) * 37;
        Action action = this.action;
        int iHashCode6 = iHashCode5 + (action != null ? action.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("label=" + Internal.sanitize(this.label));
        arrayList.add("type=" + this.type);
        String str = this.logging_identifier;
        if (str != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str));
        }
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        ThemedColor themedColor = this.background_color_override;
        if (themedColor != null) {
            arrayList.add("background_color_override=" + themedColor);
        }
        ThemedColor themedColor2 = this.text_color_override;
        if (themedColor2 != null) {
            arrayList.add("text_color_override=" + themedColor2);
        }
        arrayList.add("prefers_icon_on_right=" + this.prefers_icon_on_right);
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InfoTag{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InfoTag copy$default(InfoTag infoTag, String str, Type type2, String str2, Icon icon, ThemedColor themedColor, ThemedColor themedColor2, boolean z, Action action, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = infoTag.label;
        }
        if ((i & 2) != 0) {
            type2 = infoTag.type;
        }
        if ((i & 4) != 0) {
            str2 = infoTag.logging_identifier;
        }
        if ((i & 8) != 0) {
            icon = infoTag.icon;
        }
        if ((i & 16) != 0) {
            themedColor = infoTag.background_color_override;
        }
        if ((i & 32) != 0) {
            themedColor2 = infoTag.text_color_override;
        }
        if ((i & 64) != 0) {
            z = infoTag.prefers_icon_on_right;
        }
        if ((i & 128) != 0) {
            action = infoTag.action;
        }
        if ((i & 256) != 0) {
            byteString = infoTag.unknownFields();
        }
        Action action2 = action;
        ByteString byteString2 = byteString;
        ThemedColor themedColor3 = themedColor2;
        boolean z2 = z;
        ThemedColor themedColor4 = themedColor;
        String str3 = str2;
        return infoTag.copy(str, type2, str3, icon, themedColor4, themedColor3, z2, action2, byteString2);
    }

    public final InfoTag copy(String label, Type type2, String logging_identifier, Icon icon, ThemedColor background_color_override, ThemedColor text_color_override, boolean prefers_icon_on_right, Action action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InfoTag(label, type2, logging_identifier, icon, background_color_override, text_color_override, prefers_icon_on_right, action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InfoTag.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InfoTag>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.InfoTag$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InfoTag value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLabel());
                }
                if (value.getType() != InfoTag.Type.TYPE_UNSPECIFIED) {
                    size += InfoTag.Type.ADAPTER.encodedSizeWithTag(2, value.getType());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLogging_identifier()) + Icon.ADAPTER.encodedSizeWithTag(4, value.getIcon());
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, value.getBackground_color_override()) + protoAdapter.encodedSizeWithTag(6, value.getText_color_override());
                if (value.getPrefers_icon_on_right()) {
                    iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getPrefers_icon_on_right()));
                }
                return iEncodedSizeWithTag2 + Action.ADAPTER.encodedSizeWithTag(8, value.getAction());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InfoTag value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
                }
                if (value.getType() != InfoTag.Type.TYPE_UNSPECIFIED) {
                    InfoTag.Type.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLogging_identifier());
                Icon.ADAPTER.encodeWithTag(writer, 4, (int) value.getIcon());
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getBackground_color_override());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getText_color_override());
                if (value.getPrefers_icon_on_right()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getPrefers_icon_on_right()));
                }
                Action.ADAPTER.encodeWithTag(writer, 8, (int) value.getAction());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InfoTag value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Action.ADAPTER.encodeWithTag(writer, 8, (int) value.getAction());
                if (value.getPrefers_icon_on_right()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getPrefers_icon_on_right()));
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getText_color_override());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getBackground_color_override());
                Icon.ADAPTER.encodeWithTag(writer, 4, (int) value.getIcon());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 3, (int) value.getLogging_identifier());
                if (value.getType() != InfoTag.Type.TYPE_UNSPECIFIED) {
                    InfoTag.Type.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (Intrinsics.areEqual(value.getLabel(), "")) {
                    return;
                }
                protoAdapter2.encodeWithTag(writer, 1, (int) value.getLabel());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InfoTag decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InfoTag.Type typeDecode = InfoTag.Type.TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Icon iconDecode = null;
                ThemedColor themedColorDecode = null;
                ThemedColor themedColorDecode2 = null;
                Action actionDecode = null;
                boolean zBooleanValue = false;
                String strDecode = "";
                String strDecode2 = null;
                while (true) {
                    InfoTag.Type type2 = typeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        typeDecode = InfoTag.Type.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    try {
                                        iconDecode = Icon.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 5:
                                    themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 7:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 8:
                                    actionDecode = Action.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new InfoTag(strDecode, type2, strDecode2, iconDecode, themedColorDecode, themedColorDecode2, zBooleanValue, actionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InfoTag redact(InfoTag value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor background_color_override = value.getBackground_color_override();
                ThemedColor themedColorRedact = background_color_override != null ? ThemedColor.ADAPTER.redact(background_color_override) : null;
                ThemedColor text_color_override = value.getText_color_override();
                ThemedColor themedColorRedact2 = text_color_override != null ? ThemedColor.ADAPTER.redact(text_color_override) : null;
                Action action = value.getAction();
                return InfoTag.copy$default(value, null, null, null, null, themedColorRedact, themedColorRedact2, false, action != null ? Action.ADAPTER.redact(action) : null, ByteString.EMPTY, 79, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InfoTag.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoTag$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "TYPE_ALERT", "TYPE_INFORM", "TYPE_INLINE", "TYPE_GOLD", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Type> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type TYPE_ALERT;
        public static final Type TYPE_GOLD;
        public static final Type TYPE_INFORM;
        public static final Type TYPE_INLINE;
        public static final Type TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{TYPE_UNSPECIFIED, TYPE_ALERT, TYPE_INFORM, TYPE_INLINE, TYPE_GOLD};
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
            TYPE_ALERT = new Type("TYPE_ALERT", 1, 1);
            TYPE_INFORM = new Type("TYPE_INFORM", 2, 2);
            TYPE_INLINE = new Type("TYPE_INLINE", 3, 3);
            TYPE_GOLD = new Type("TYPE_GOLD", 4, 4);
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: rh_server_driven_ui.v1.InfoTag$Type$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public InfoTag.Type fromValue(int value) {
                    return InfoTag.Type.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: InfoTag.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoTag$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/InfoTag$Type;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                    return Type.TYPE_ALERT;
                }
                if (value == 2) {
                    return Type.TYPE_INFORM;
                }
                if (value == 3) {
                    return Type.TYPE_INLINE;
                }
                if (value != 4) {
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

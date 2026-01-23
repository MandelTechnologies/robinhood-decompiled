package rh_server_driven_ui.p531v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: IconElement.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016J>\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconElement;", "Lcom/squareup/wire/Message;", "", "icon", "Lrh_server_driven_ui/v1/Icon;", "accessibilty_label", "", "tint", "Lrh_server_driven_ui/v1/ThemedColor;", "action", "Lrh_server_driven_ui/v1/Action;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Icon;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/Action;Lokio/ByteString;)V", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "getAccessibilty_label", "()Ljava/lang/String;", "getTint", "()Lrh_server_driven_ui/v1/ThemedColor;", "getAction", "()Lrh_server_driven_ui/v1/Action;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class IconElement extends Message {

    @JvmField
    public static final ProtoAdapter<IconElement> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accessibiltyLabel", schemaIndex = 1, tag = 2)
    private final String accessibilty_label;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", schemaIndex = 3, tag = 4)
    private final Action action;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Icon icon;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", schemaIndex = 2, tag = 3)
    private final ThemedColor tint;

    public IconElement() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29750newBuilder();
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public /* synthetic */ IconElement(Icon icon, String str, ThemedColor themedColor, Action action, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Icon.ICON_UNSPECIFIED : icon, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : themedColor, (i & 8) != 0 ? null : action, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getAccessibilty_label() {
        return this.accessibilty_label;
    }

    public final ThemedColor getTint() {
        return this.tint;
    }

    public final Action getAction() {
        return this.action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconElement(Icon icon, String str, ThemedColor themedColor, Action action, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.icon = icon;
        this.accessibilty_label = str;
        this.tint = themedColor;
        this.action = action;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29750newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IconElement)) {
            return false;
        }
        IconElement iconElement = (IconElement) other;
        return Intrinsics.areEqual(unknownFields(), iconElement.unknownFields()) && this.icon == iconElement.icon && Intrinsics.areEqual(this.accessibilty_label, iconElement.accessibilty_label) && Intrinsics.areEqual(this.tint, iconElement.tint) && Intrinsics.areEqual(this.action, iconElement.action);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.icon.hashCode()) * 37;
        String str = this.accessibilty_label;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        ThemedColor themedColor = this.tint;
        int iHashCode3 = (iHashCode2 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        Action action = this.action;
        int iHashCode4 = iHashCode3 + (action != null ? action.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("icon=" + this.icon);
        String str = this.accessibilty_label;
        if (str != null) {
            arrayList.add("accessibilty_label=" + Internal.sanitize(str));
        }
        ThemedColor themedColor = this.tint;
        if (themedColor != null) {
            arrayList.add("tint=" + themedColor);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IconElement{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IconElement copy$default(IconElement iconElement, Icon icon, String str, ThemedColor themedColor, Action action, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            icon = iconElement.icon;
        }
        if ((i & 2) != 0) {
            str = iconElement.accessibilty_label;
        }
        if ((i & 4) != 0) {
            themedColor = iconElement.tint;
        }
        if ((i & 8) != 0) {
            action = iconElement.action;
        }
        if ((i & 16) != 0) {
            byteString = iconElement.unknownFields();
        }
        ByteString byteString2 = byteString;
        ThemedColor themedColor2 = themedColor;
        return iconElement.copy(icon, str, themedColor2, action, byteString2);
    }

    public final IconElement copy(Icon icon, String accessibilty_label, ThemedColor tint, Action action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IconElement(icon, accessibilty_label, tint, action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IconElement.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IconElement>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.IconElement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IconElement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    size += Icon.ADAPTER.encodedSizeWithTag(1, value.getIcon());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccessibilty_label()) + ThemedColor.ADAPTER.encodedSizeWithTag(3, value.getTint()) + Action.ADAPTER.encodedSizeWithTag(4, value.getAction());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IconElement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    Icon.ADAPTER.encodeWithTag(writer, 1, (int) value.getIcon());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccessibilty_label());
                ThemedColor.ADAPTER.encodeWithTag(writer, 3, (int) value.getTint());
                Action.ADAPTER.encodeWithTag(writer, 4, (int) value.getAction());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IconElement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Action.ADAPTER.encodeWithTag(writer, 4, (int) value.getAction());
                ThemedColor.ADAPTER.encodeWithTag(writer, 3, (int) value.getTint());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccessibilty_label());
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    Icon.ADAPTER.encodeWithTag(writer, 1, (int) value.getIcon());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IconElement decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Icon iconDecode = Icon.ICON_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                ThemedColor themedColorDecode = null;
                Action actionDecode = null;
                while (true) {
                    Icon icon = iconDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new IconElement(icon, strDecode, themedColorDecode, actionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                iconDecode = Icon.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            actionDecode = Action.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IconElement redact(IconElement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor tint = value.getTint();
                ThemedColor themedColorRedact = tint != null ? ThemedColor.ADAPTER.redact(tint) : null;
                Action action = value.getAction();
                return IconElement.copy$default(value, null, null, themedColorRedact, action != null ? Action.ADAPTER.redact(action) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}

package rh_server_driven_ui.p531v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: IconWithAction.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconWithAction;", "Lcom/squareup/wire/Message;", "", "icon", "Lrh_server_driven_ui/v1/Icon;", "action", "Lrh_server_driven_ui/v1/Action;", "icon_color_override", "Lrh_server_driven_ui/v1/ThemedColor;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Icon;Lrh_server_driven_ui/v1/Action;Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)V", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "getAction", "()Lrh_server_driven_ui/v1/Action;", "getIcon_color_override", "()Lrh_server_driven_ui/v1/ThemedColor;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class IconWithAction extends Message {

    @JvmField
    public static final ProtoAdapter<IconWithAction> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", schemaIndex = 1, tag = 2)
    private final Action action;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Icon icon;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "iconColorOverride", schemaIndex = 2, tag = 3)
    private final ThemedColor icon_color_override;

    public IconWithAction() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29752newBuilder();
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public /* synthetic */ IconWithAction(Icon icon, Action action, ThemedColor themedColor, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Icon.ICON_UNSPECIFIED : icon, (i & 2) != 0 ? null : action, (i & 4) != 0 ? null : themedColor, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Action getAction() {
        return this.action;
    }

    public final ThemedColor getIcon_color_override() {
        return this.icon_color_override;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconWithAction(Icon icon, Action action, ThemedColor themedColor, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.icon = icon;
        this.action = action;
        this.icon_color_override = themedColor;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29752newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IconWithAction)) {
            return false;
        }
        IconWithAction iconWithAction = (IconWithAction) other;
        return Intrinsics.areEqual(unknownFields(), iconWithAction.unknownFields()) && this.icon == iconWithAction.icon && Intrinsics.areEqual(this.action, iconWithAction.action) && Intrinsics.areEqual(this.icon_color_override, iconWithAction.icon_color_override);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.icon.hashCode()) * 37;
        Action action = this.action;
        int iHashCode2 = (iHashCode + (action != null ? action.hashCode() : 0)) * 37;
        ThemedColor themedColor = this.icon_color_override;
        int iHashCode3 = iHashCode2 + (themedColor != null ? themedColor.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("icon=" + this.icon);
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        ThemedColor themedColor = this.icon_color_override;
        if (themedColor != null) {
            arrayList.add("icon_color_override=" + themedColor);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IconWithAction{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IconWithAction copy$default(IconWithAction iconWithAction, Icon icon, Action action, ThemedColor themedColor, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            icon = iconWithAction.icon;
        }
        if ((i & 2) != 0) {
            action = iconWithAction.action;
        }
        if ((i & 4) != 0) {
            themedColor = iconWithAction.icon_color_override;
        }
        if ((i & 8) != 0) {
            byteString = iconWithAction.unknownFields();
        }
        return iconWithAction.copy(icon, action, themedColor, byteString);
    }

    public final IconWithAction copy(Icon icon, Action action, ThemedColor icon_color_override, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IconWithAction(icon, action, icon_color_override, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IconWithAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IconWithAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.IconWithAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IconWithAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    size += Icon.ADAPTER.encodedSizeWithTag(1, value.getIcon());
                }
                return size + Action.ADAPTER.encodedSizeWithTag(2, value.getAction()) + ThemedColor.ADAPTER.encodedSizeWithTag(3, value.getIcon_color_override());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IconWithAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    Icon.ADAPTER.encodeWithTag(writer, 1, (int) value.getIcon());
                }
                Action.ADAPTER.encodeWithTag(writer, 2, (int) value.getAction());
                ThemedColor.ADAPTER.encodeWithTag(writer, 3, (int) value.getIcon_color_override());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IconWithAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ThemedColor.ADAPTER.encodeWithTag(writer, 3, (int) value.getIcon_color_override());
                Action.ADAPTER.encodeWithTag(writer, 2, (int) value.getAction());
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    Icon.ADAPTER.encodeWithTag(writer, 1, (int) value.getIcon());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IconWithAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Icon iconDecode = Icon.ICON_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Action actionDecode = null;
                ThemedColor themedColorDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IconWithAction(iconDecode, actionDecode, themedColorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            iconDecode = Icon.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        actionDecode = Action.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IconWithAction redact(IconWithAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Action action = value.getAction();
                Action actionRedact = action != null ? Action.ADAPTER.redact(action) : null;
                ThemedColor icon_color_override = value.getIcon_color_override();
                return IconWithAction.copy$default(value, null, actionRedact, icon_color_override != null ? ThemedColor.ADAPTER.redact(icon_color_override) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}

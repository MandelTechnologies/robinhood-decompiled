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

/* compiled from: RadioButton.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016JH\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lrh_server_driven_ui/v1/RadioButton;", "Lcom/squareup/wire/Message;", "", "is_selected", "", "selected_color", "Lrh_server_driven_ui/v1/ThemedColor;", "unselected_color", "is_disabled", "action", "Lrh_server_driven_ui/v1/Action;", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;ZLrh_server_driven_ui/v1/Action;Lokio/ByteString;)V", "()Z", "getSelected_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getUnselected_color", "getAction", "()Lrh_server_driven_ui/v1/Action;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class RadioButton extends Message {

    @JvmField
    public static final ProtoAdapter<RadioButton> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Action action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDisabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_disabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSelected", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_selected;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "selectedColor", schemaIndex = 1, tag = 2)
    private final ThemedColor selected_color;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "unselectedColor", schemaIndex = 2, tag = 3)
    private final ThemedColor unselected_color;

    public RadioButton() {
        this(false, null, null, false, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29799newBuilder();
    }

    /* renamed from: is_selected, reason: from getter */
    public final boolean getIs_selected() {
        return this.is_selected;
    }

    public final ThemedColor getSelected_color() {
        return this.selected_color;
    }

    public final ThemedColor getUnselected_color() {
        return this.unselected_color;
    }

    /* renamed from: is_disabled, reason: from getter */
    public final boolean getIs_disabled() {
        return this.is_disabled;
    }

    public final Action getAction() {
        return this.action;
    }

    public /* synthetic */ RadioButton(boolean z, ThemedColor themedColor, ThemedColor themedColor2, boolean z2, Action action, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : themedColor, (i & 4) != 0 ? null : themedColor2, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : action, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioButton(boolean z, ThemedColor themedColor, ThemedColor themedColor2, boolean z2, Action action, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_selected = z;
        this.selected_color = themedColor;
        this.unselected_color = themedColor2;
        this.is_disabled = z2;
        this.action = action;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29799newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RadioButton)) {
            return false;
        }
        RadioButton radioButton = (RadioButton) other;
        return Intrinsics.areEqual(unknownFields(), radioButton.unknownFields()) && this.is_selected == radioButton.is_selected && Intrinsics.areEqual(this.selected_color, radioButton.selected_color) && Intrinsics.areEqual(this.unselected_color, radioButton.unselected_color) && this.is_disabled == radioButton.is_disabled && Intrinsics.areEqual(this.action, radioButton.action);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_selected)) * 37;
        ThemedColor themedColor = this.selected_color;
        int iHashCode2 = (iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ThemedColor themedColor2 = this.unselected_color;
        int iHashCode3 = (((iHashCode2 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_disabled)) * 37;
        Action action = this.action;
        int iHashCode4 = iHashCode3 + (action != null ? action.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_selected=" + this.is_selected);
        ThemedColor themedColor = this.selected_color;
        if (themedColor != null) {
            arrayList.add("selected_color=" + themedColor);
        }
        ThemedColor themedColor2 = this.unselected_color;
        if (themedColor2 != null) {
            arrayList.add("unselected_color=" + themedColor2);
        }
        arrayList.add("is_disabled=" + this.is_disabled);
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RadioButton{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RadioButton copy$default(RadioButton radioButton, boolean z, ThemedColor themedColor, ThemedColor themedColor2, boolean z2, Action action, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = radioButton.is_selected;
        }
        if ((i & 2) != 0) {
            themedColor = radioButton.selected_color;
        }
        if ((i & 4) != 0) {
            themedColor2 = radioButton.unselected_color;
        }
        if ((i & 8) != 0) {
            z2 = radioButton.is_disabled;
        }
        if ((i & 16) != 0) {
            action = radioButton.action;
        }
        if ((i & 32) != 0) {
            byteString = radioButton.unknownFields();
        }
        Action action2 = action;
        ByteString byteString2 = byteString;
        return radioButton.copy(z, themedColor, themedColor2, z2, action2, byteString2);
    }

    public final RadioButton copy(boolean is_selected, ThemedColor selected_color, ThemedColor unselected_color, boolean is_disabled, Action action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RadioButton(is_selected, selected_color, unselected_color, is_disabled, action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RadioButton.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RadioButton>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.RadioButton$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RadioButton value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_selected()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_selected()));
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getSelected_color()) + protoAdapter.encodedSizeWithTag(3, value.getUnselected_color());
                if (value.getIs_disabled()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_disabled()));
                }
                return value.getAction() != null ? iEncodedSizeWithTag + Action.ADAPTER.encodedSizeWithTag(5, value.getAction()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RadioButton value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_selected()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_selected()));
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSelected_color());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getUnselected_color());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                if (value.getAction() != null) {
                    Action.ADAPTER.encodeWithTag(writer, 5, (int) value.getAction());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RadioButton value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAction() != null) {
                    Action.ADAPTER.encodeWithTag(writer, 5, (int) value.getAction());
                }
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getUnselected_color());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSelected_color());
                if (value.getIs_selected()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_selected()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RadioButton redact(RadioButton value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor selected_color = value.getSelected_color();
                ThemedColor themedColorRedact = selected_color != null ? ThemedColor.ADAPTER.redact(selected_color) : null;
                ThemedColor unselected_color = value.getUnselected_color();
                ThemedColor themedColorRedact2 = unselected_color != null ? ThemedColor.ADAPTER.redact(unselected_color) : null;
                Action action = value.getAction();
                return RadioButton.copy$default(value, false, themedColorRedact, themedColorRedact2, false, action != null ? Action.ADAPTER.redact(action) : null, ByteString.EMPTY, 9, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RadioButton decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                ThemedColor themedColorDecode2 = null;
                Action actionDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RadioButton(zBooleanValue, themedColorDecode, themedColorDecode2, zBooleanValue2, actionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 5) {
                        actionDecode = Action.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}

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

/* compiled from: ValuePropWithIcon.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J>\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropWithIcon;", "Lcom/squareup/wire/Message;", "", "content", "Lrh_server_driven_ui/v1/ValuePropContent;", "icon", "Lrh_server_driven_ui/v1/Icon;", "icon_color_override", "Lrh_server_driven_ui/v1/ThemedColor;", "alignment", "Lrh_server_driven_ui/v1/ValuePropWithIconAlignment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ValuePropContent;Lrh_server_driven_ui/v1/Icon;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ValuePropWithIconAlignment;Lokio/ByteString;)V", "getContent", "()Lrh_server_driven_ui/v1/ValuePropContent;", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "getIcon_color_override", "()Lrh_server_driven_ui/v1/ThemedColor;", "getAlignment", "()Lrh_server_driven_ui/v1/ValuePropWithIconAlignment;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ValuePropWithIcon extends Message {

    @JvmField
    public static final ProtoAdapter<ValuePropWithIcon> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ValuePropWithIconAlignment#ADAPTER", schemaIndex = 3, tag = 4)
    private final ValuePropWithIconAlignment alignment;

    @WireField(adapter = "rh_server_driven_ui.v1.ValuePropContent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ValuePropContent content;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Icon icon;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "iconColorOverride", schemaIndex = 2, tag = 3)
    private final ThemedColor icon_color_override;

    public ValuePropWithIcon() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29864newBuilder();
    }

    public final ValuePropContent getContent() {
        return this.content;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public /* synthetic */ ValuePropWithIcon(ValuePropContent valuePropContent, Icon icon, ThemedColor themedColor, ValuePropWithIconAlignment valuePropWithIconAlignment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : valuePropContent, (i & 2) != 0 ? Icon.ICON_UNSPECIFIED : icon, (i & 4) != 0 ? null : themedColor, (i & 8) != 0 ? null : valuePropWithIconAlignment, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ThemedColor getIcon_color_override() {
        return this.icon_color_override;
    }

    public final ValuePropWithIconAlignment getAlignment() {
        return this.alignment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValuePropWithIcon(ValuePropContent valuePropContent, Icon icon, ThemedColor themedColor, ValuePropWithIconAlignment valuePropWithIconAlignment, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.content = valuePropContent;
        this.icon = icon;
        this.icon_color_override = themedColor;
        this.alignment = valuePropWithIconAlignment;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29864newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValuePropWithIcon)) {
            return false;
        }
        ValuePropWithIcon valuePropWithIcon = (ValuePropWithIcon) other;
        return Intrinsics.areEqual(unknownFields(), valuePropWithIcon.unknownFields()) && Intrinsics.areEqual(this.content, valuePropWithIcon.content) && this.icon == valuePropWithIcon.icon && Intrinsics.areEqual(this.icon_color_override, valuePropWithIcon.icon_color_override) && this.alignment == valuePropWithIcon.alignment;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ValuePropContent valuePropContent = this.content;
        int iHashCode2 = (((iHashCode + (valuePropContent != null ? valuePropContent.hashCode() : 0)) * 37) + this.icon.hashCode()) * 37;
        ThemedColor themedColor = this.icon_color_override;
        int iHashCode3 = (iHashCode2 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ValuePropWithIconAlignment valuePropWithIconAlignment = this.alignment;
        int iHashCode4 = iHashCode3 + (valuePropWithIconAlignment != null ? valuePropWithIconAlignment.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ValuePropContent valuePropContent = this.content;
        if (valuePropContent != null) {
            arrayList.add("content=" + valuePropContent);
        }
        arrayList.add("icon=" + this.icon);
        ThemedColor themedColor = this.icon_color_override;
        if (themedColor != null) {
            arrayList.add("icon_color_override=" + themedColor);
        }
        ValuePropWithIconAlignment valuePropWithIconAlignment = this.alignment;
        if (valuePropWithIconAlignment != null) {
            arrayList.add("alignment=" + valuePropWithIconAlignment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValuePropWithIcon{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ValuePropWithIcon copy$default(ValuePropWithIcon valuePropWithIcon, ValuePropContent valuePropContent, Icon icon, ThemedColor themedColor, ValuePropWithIconAlignment valuePropWithIconAlignment, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            valuePropContent = valuePropWithIcon.content;
        }
        if ((i & 2) != 0) {
            icon = valuePropWithIcon.icon;
        }
        if ((i & 4) != 0) {
            themedColor = valuePropWithIcon.icon_color_override;
        }
        if ((i & 8) != 0) {
            valuePropWithIconAlignment = valuePropWithIcon.alignment;
        }
        if ((i & 16) != 0) {
            byteString = valuePropWithIcon.unknownFields();
        }
        ByteString byteString2 = byteString;
        ThemedColor themedColor2 = themedColor;
        return valuePropWithIcon.copy(valuePropContent, icon, themedColor2, valuePropWithIconAlignment, byteString2);
    }

    public final ValuePropWithIcon copy(ValuePropContent content, Icon icon, ThemedColor icon_color_override, ValuePropWithIconAlignment alignment, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValuePropWithIcon(content, icon, icon_color_override, alignment, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValuePropWithIcon.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValuePropWithIcon>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ValuePropWithIcon$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValuePropWithIcon value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getContent() != null) {
                    size += ValuePropContent.ADAPTER.encodedSizeWithTag(1, value.getContent());
                }
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    size += Icon.ADAPTER.encodedSizeWithTag(2, value.getIcon());
                }
                return size + ThemedColor.ADAPTER.encodedSizeWithTag(3, value.getIcon_color_override()) + ValuePropWithIconAlignment.ADAPTER.encodedSizeWithTag(4, value.getAlignment());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValuePropWithIcon value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getContent() != null) {
                    ValuePropContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent());
                }
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    Icon.ADAPTER.encodeWithTag(writer, 2, (int) value.getIcon());
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 3, (int) value.getIcon_color_override());
                ValuePropWithIconAlignment.ADAPTER.encodeWithTag(writer, 4, (int) value.getAlignment());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValuePropWithIcon value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ValuePropWithIconAlignment.ADAPTER.encodeWithTag(writer, 4, (int) value.getAlignment());
                ThemedColor.ADAPTER.encodeWithTag(writer, 3, (int) value.getIcon_color_override());
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    Icon.ADAPTER.encodeWithTag(writer, 2, (int) value.getIcon());
                }
                if (value.getContent() != null) {
                    ValuePropContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValuePropWithIcon decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Icon iconDecode = Icon.ICON_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ValuePropContent valuePropContentDecode = null;
                ThemedColor themedColorDecode = null;
                ValuePropWithIconAlignment valuePropWithIconAlignmentDecode = null;
                while (true) {
                    Icon icon = iconDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ValuePropWithIcon(valuePropContentDecode, icon, themedColorDecode, valuePropWithIconAlignmentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            valuePropContentDecode = ValuePropContent.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                iconDecode = Icon.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                valuePropWithIconAlignmentDecode = ValuePropWithIconAlignment.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValuePropWithIcon redact(ValuePropWithIcon value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ValuePropContent content = value.getContent();
                ValuePropContent valuePropContentRedact = content != null ? ValuePropContent.ADAPTER.redact(content) : null;
                ThemedColor icon_color_override = value.getIcon_color_override();
                return ValuePropWithIcon.copy$default(value, valuePropContentRedact, null, icon_color_override != null ? ThemedColor.ADAPTER.redact(icon_color_override) : null, null, ByteString.EMPTY, 10, null);
            }
        };
    }
}

package rh_server_driven_ui.p531v1;

import com.robinhood.utils.extensions.ResourceTypes;
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

/* compiled from: IconDisplayText.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J>\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconDisplayText;", "Lcom/squareup/wire/Message;", "", "value", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "icon", "Lrh_server_driven_ui/v1/Icon;", "gradient_color", "Lrh_server_driven_ui/v1/LinearGradientColor;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/Icon;Lrh_server_driven_ui/v1/LinearGradientColor;Lokio/ByteString;)V", "getValue", "()Ljava/lang/String;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "getGradient_color", "()Lrh_server_driven_ui/v1/LinearGradientColor;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class IconDisplayText extends Message {

    @JvmField
    public static final ProtoAdapter<IconDisplayText> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ThemedColor color;

    @WireField(adapter = "rh_server_driven_ui.v1.LinearGradientColor#ADAPTER", jsonName = "gradientColor", schemaIndex = 3, tag = 4)
    private final LinearGradientColor gradient_color;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", schemaIndex = 2, tag = 3)
    private final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String value;

    public IconDisplayText() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29749newBuilder();
    }

    public final String getValue() {
        return this.value;
    }

    public /* synthetic */ IconDisplayText(String str, ThemedColor themedColor, Icon icon, LinearGradientColor linearGradientColor, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : themedColor, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? null : linearGradientColor, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ThemedColor getColor() {
        return this.color;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final LinearGradientColor getGradient_color() {
        return this.gradient_color;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconDisplayText(String value, ThemedColor themedColor, Icon icon, LinearGradientColor linearGradientColor, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.value = value;
        this.color = themedColor;
        this.icon = icon;
        this.gradient_color = linearGradientColor;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29749newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IconDisplayText)) {
            return false;
        }
        IconDisplayText iconDisplayText = (IconDisplayText) other;
        return Intrinsics.areEqual(unknownFields(), iconDisplayText.unknownFields()) && Intrinsics.areEqual(this.value, iconDisplayText.value) && Intrinsics.areEqual(this.color, iconDisplayText.color) && this.icon == iconDisplayText.icon && Intrinsics.areEqual(this.gradient_color, iconDisplayText.gradient_color);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.value.hashCode()) * 37;
        ThemedColor themedColor = this.color;
        int iHashCode2 = (iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        Icon icon = this.icon;
        int iHashCode3 = (iHashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
        LinearGradientColor linearGradientColor = this.gradient_color;
        int iHashCode4 = iHashCode3 + (linearGradientColor != null ? linearGradientColor.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("value=" + Internal.sanitize(this.value));
        ThemedColor themedColor = this.color;
        if (themedColor != null) {
            arrayList.add("color=" + themedColor);
        }
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        LinearGradientColor linearGradientColor = this.gradient_color;
        if (linearGradientColor != null) {
            arrayList.add("gradient_color=" + linearGradientColor);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IconDisplayText{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IconDisplayText copy$default(IconDisplayText iconDisplayText, String str, ThemedColor themedColor, Icon icon, LinearGradientColor linearGradientColor, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iconDisplayText.value;
        }
        if ((i & 2) != 0) {
            themedColor = iconDisplayText.color;
        }
        if ((i & 4) != 0) {
            icon = iconDisplayText.icon;
        }
        if ((i & 8) != 0) {
            linearGradientColor = iconDisplayText.gradient_color;
        }
        if ((i & 16) != 0) {
            byteString = iconDisplayText.unknownFields();
        }
        ByteString byteString2 = byteString;
        Icon icon2 = icon;
        return iconDisplayText.copy(str, themedColor, icon2, linearGradientColor, byteString2);
    }

    public final IconDisplayText copy(String value, ThemedColor color, Icon icon, LinearGradientColor gradient_color, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IconDisplayText(value, color, icon, gradient_color, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IconDisplayText.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IconDisplayText>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.IconDisplayText$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IconDisplayText value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getValue());
                }
                if (value.getColor() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getColor());
                }
                return size + Icon.ADAPTER.encodedSizeWithTag(3, value.getIcon()) + LinearGradientColor.ADAPTER.encodedSizeWithTag(4, value.getGradient_color());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IconDisplayText value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getValue());
                }
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getColor());
                }
                Icon.ADAPTER.encodeWithTag(writer, 3, (int) value.getIcon());
                LinearGradientColor.ADAPTER.encodeWithTag(writer, 4, (int) value.getGradient_color());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IconDisplayText value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                LinearGradientColor.ADAPTER.encodeWithTag(writer, 4, (int) value.getGradient_color());
                Icon.ADAPTER.encodeWithTag(writer, 3, (int) value.getIcon());
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getColor());
                }
                if (Intrinsics.areEqual(value.getValue(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IconDisplayText redact(IconDisplayText value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor color = value.getColor();
                ThemedColor themedColorRedact = color != null ? ThemedColor.ADAPTER.redact(color) : null;
                LinearGradientColor gradient_color = value.getGradient_color();
                return IconDisplayText.copy$default(value, null, themedColorRedact, null, gradient_color != null ? LinearGradientColor.ADAPTER.redact(gradient_color) : null, ByteString.EMPTY, 5, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IconDisplayText decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ThemedColor themedColorDecode = null;
                Icon iconDecode = null;
                LinearGradientColor linearGradientColorDecode = null;
                while (true) {
                    String str = strDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new IconDisplayText(str, themedColorDecode, iconDecode, linearGradientColorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag != 1) {
                            if (iNextTag == 2) {
                                themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                            } else if (iNextTag == 3) {
                                try {
                                    iconDecode = Icon.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 4) {
                                linearGradientColorDecode = LinearGradientColor.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                    strDecode = ProtoAdapter.STRING.decode(reader);
                }
            }
        };
    }
}

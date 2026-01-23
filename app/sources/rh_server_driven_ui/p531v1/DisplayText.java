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

/* compiled from: DisplayText.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J2\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lrh_server_driven_ui/v1/DisplayText;", "Lcom/squareup/wire/Message;", "", "value", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "text_style", "Lrh_server_driven_ui/v1/TextStyle;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/TextStyle;Lokio/ByteString;)V", "getValue", "()Ljava/lang/String;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "getText_style", "()Lrh_server_driven_ui/v1/TextStyle;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class DisplayText extends Message {

    @JvmField
    public static final ProtoAdapter<DisplayText> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ThemedColor color;

    @WireField(adapter = "rh_server_driven_ui.v1.TextStyle#ADAPTER", jsonName = "textStyle", schemaIndex = 2, tag = 3)
    private final TextStyle text_style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String value;

    public DisplayText() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29733newBuilder();
    }

    public final String getValue() {
        return this.value;
    }

    public /* synthetic */ DisplayText(String str, ThemedColor themedColor, TextStyle textStyle, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : themedColor, (i & 4) != 0 ? null : textStyle, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ThemedColor getColor() {
        return this.color;
    }

    public final TextStyle getText_style() {
        return this.text_style;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayText(String value, ThemedColor themedColor, TextStyle textStyle, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.value = value;
        this.color = themedColor;
        this.text_style = textStyle;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29733newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DisplayText)) {
            return false;
        }
        DisplayText displayText = (DisplayText) other;
        return Intrinsics.areEqual(unknownFields(), displayText.unknownFields()) && Intrinsics.areEqual(this.value, displayText.value) && Intrinsics.areEqual(this.color, displayText.color) && this.text_style == displayText.text_style;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.value.hashCode()) * 37;
        ThemedColor themedColor = this.color;
        int iHashCode2 = (iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        TextStyle textStyle = this.text_style;
        int iHashCode3 = iHashCode2 + (textStyle != null ? textStyle.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("value=" + Internal.sanitize(this.value));
        ThemedColor themedColor = this.color;
        if (themedColor != null) {
            arrayList.add("color=" + themedColor);
        }
        TextStyle textStyle = this.text_style;
        if (textStyle != null) {
            arrayList.add("text_style=" + textStyle);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayText{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DisplayText copy$default(DisplayText displayText, String str, ThemedColor themedColor, TextStyle textStyle, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayText.value;
        }
        if ((i & 2) != 0) {
            themedColor = displayText.color;
        }
        if ((i & 4) != 0) {
            textStyle = displayText.text_style;
        }
        if ((i & 8) != 0) {
            byteString = displayText.unknownFields();
        }
        return displayText.copy(str, themedColor, textStyle, byteString);
    }

    public final DisplayText copy(String value, ThemedColor color, TextStyle text_style, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DisplayText(value, color, text_style, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DisplayText.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DisplayText>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.DisplayText$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DisplayText value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getValue());
                }
                if (value.getColor() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getColor());
                }
                return size + TextStyle.ADAPTER.encodedSizeWithTag(3, value.getText_style());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DisplayText value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getValue(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getValue());
                }
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getColor());
                }
                TextStyle.ADAPTER.encodeWithTag(writer, 3, (int) value.getText_style());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DisplayText value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TextStyle.ADAPTER.encodeWithTag(writer, 3, (int) value.getText_style());
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getColor());
                }
                if (Intrinsics.areEqual(value.getValue(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DisplayText redact(DisplayText value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor color = value.getColor();
                return DisplayText.copy$default(value, null, color != null ? ThemedColor.ADAPTER.redact(color) : null, null, ByteString.EMPTY, 5, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DisplayText decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ThemedColor themedColorDecode = null;
                TextStyle textStyleDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DisplayText(strDecode, themedColorDecode, textStyleDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            textStyleDecode = TextStyle.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}

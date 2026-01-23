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

/* compiled from: Text.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\"\u001a\u00020\u0002H\u0017J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020\u000fH\u0016J\b\u0010(\u001a\u00020)H\u0016Je\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010+R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 ¨\u0006-"}, m3636d2 = {"Lrh_server_driven_ui/v1/Text;", "Lcom/squareup/wire/Message;", "", "text", "Lrh_server_driven_ui/v1/RenderableText;", ResourceTypes.STYLE, "Lrh_server_driven_ui/v1/TextStyle;", "alignment", "Lrh_server_driven_ui/v1/TextAlignment;", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "link_color_override", "font", "Lrh_server_driven_ui/v1/Font;", "number_of_lines", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/RenderableText;Lrh_server_driven_ui/v1/TextStyle;Lrh_server_driven_ui/v1/TextAlignment;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/Font;Ljava/lang/Integer;Lokio/ByteString;)V", "getText", "()Lrh_server_driven_ui/v1/RenderableText;", "getStyle", "()Lrh_server_driven_ui/v1/TextStyle;", "getAlignment", "()Lrh_server_driven_ui/v1/TextAlignment;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "getLink_color_override", "getFont", "()Lrh_server_driven_ui/v1/Font;", "getNumber_of_lines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "(Lrh_server_driven_ui/v1/RenderableText;Lrh_server_driven_ui/v1/TextStyle;Lrh_server_driven_ui/v1/TextAlignment;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/Font;Ljava/lang/Integer;Lokio/ByteString;)Lrh_server_driven_ui/v1/Text;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Text extends Message {

    @JvmField
    public static final ProtoAdapter<Text> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.TextAlignment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TextAlignment alignment;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ThemedColor color;

    @WireField(adapter = "rh_server_driven_ui.v1.Font#ADAPTER", schemaIndex = 5, tag = 6)
    private final Font font;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "linkColorOverride", schemaIndex = 4, tag = 5)
    private final ThemedColor link_color_override;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numberOfLines", schemaIndex = 6, tag = 7)
    private final Integer number_of_lines;

    @WireField(adapter = "rh_server_driven_ui.v1.TextStyle#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TextStyle style;

    @WireField(adapter = "rh_server_driven_ui.v1.RenderableText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final RenderableText text;

    public Text() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29829newBuilder();
    }

    public final RenderableText getText() {
        return this.text;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public /* synthetic */ Text(RenderableText renderableText, TextStyle textStyle, TextAlignment textAlignment, ThemedColor themedColor, ThemedColor themedColor2, Font font, Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : renderableText, (i & 2) != 0 ? TextStyle.TEXT_STYLE_UNSPECIFIED : textStyle, (i & 4) != 0 ? TextAlignment.TEXT_ALIGNMENT_UNSPECIFIED : textAlignment, (i & 8) != 0 ? null : themedColor, (i & 16) != 0 ? null : themedColor2, (i & 32) != 0 ? null : font, (i & 64) != 0 ? null : num, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final TextAlignment getAlignment() {
        return this.alignment;
    }

    public final ThemedColor getColor() {
        return this.color;
    }

    public final ThemedColor getLink_color_override() {
        return this.link_color_override;
    }

    public final Font getFont() {
        return this.font;
    }

    public final Integer getNumber_of_lines() {
        return this.number_of_lines;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Text(RenderableText renderableText, TextStyle style, TextAlignment alignment, ThemedColor themedColor, ThemedColor themedColor2, Font font, Integer num, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.text = renderableText;
        this.style = style;
        this.alignment = alignment;
        this.color = themedColor;
        this.link_color_override = themedColor2;
        this.font = font;
        this.number_of_lines = num;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29829newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Text)) {
            return false;
        }
        Text text = (Text) other;
        return Intrinsics.areEqual(unknownFields(), text.unknownFields()) && Intrinsics.areEqual(this.text, text.text) && this.style == text.style && this.alignment == text.alignment && Intrinsics.areEqual(this.color, text.color) && Intrinsics.areEqual(this.link_color_override, text.link_color_override) && this.font == text.font && Intrinsics.areEqual(this.number_of_lines, text.number_of_lines);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        RenderableText renderableText = this.text;
        int iHashCode2 = (((((iHashCode + (renderableText != null ? renderableText.hashCode() : 0)) * 37) + this.style.hashCode()) * 37) + this.alignment.hashCode()) * 37;
        ThemedColor themedColor = this.color;
        int iHashCode3 = (iHashCode2 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ThemedColor themedColor2 = this.link_color_override;
        int iHashCode4 = (iHashCode3 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37;
        Font font = this.font;
        int iHashCode5 = (iHashCode4 + (font != null ? font.hashCode() : 0)) * 37;
        Integer num = this.number_of_lines;
        int iHashCode6 = iHashCode5 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        RenderableText renderableText = this.text;
        if (renderableText != null) {
            arrayList.add("text=" + renderableText);
        }
        arrayList.add("style=" + this.style);
        arrayList.add("alignment=" + this.alignment);
        ThemedColor themedColor = this.color;
        if (themedColor != null) {
            arrayList.add("color=" + themedColor);
        }
        ThemedColor themedColor2 = this.link_color_override;
        if (themedColor2 != null) {
            arrayList.add("link_color_override=" + themedColor2);
        }
        Font font = this.font;
        if (font != null) {
            arrayList.add("font=" + font);
        }
        Integer num = this.number_of_lines;
        if (num != null) {
            arrayList.add("number_of_lines=" + num);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Text{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Text copy$default(Text text, RenderableText renderableText, TextStyle textStyle, TextAlignment textAlignment, ThemedColor themedColor, ThemedColor themedColor2, Font font, Integer num, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            renderableText = text.text;
        }
        if ((i & 2) != 0) {
            textStyle = text.style;
        }
        if ((i & 4) != 0) {
            textAlignment = text.alignment;
        }
        if ((i & 8) != 0) {
            themedColor = text.color;
        }
        if ((i & 16) != 0) {
            themedColor2 = text.link_color_override;
        }
        if ((i & 32) != 0) {
            font = text.font;
        }
        if ((i & 64) != 0) {
            num = text.number_of_lines;
        }
        if ((i & 128) != 0) {
            byteString = text.unknownFields();
        }
        Integer num2 = num;
        ByteString byteString2 = byteString;
        ThemedColor themedColor3 = themedColor2;
        Font font2 = font;
        return text.copy(renderableText, textStyle, textAlignment, themedColor, themedColor3, font2, num2, byteString2);
    }

    public final Text copy(RenderableText text, TextStyle style, TextAlignment alignment, ThemedColor color, ThemedColor link_color_override, Font font, Integer number_of_lines, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Text(text, style, alignment, color, link_color_override, font, number_of_lines, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Text.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Text>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Text$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Text value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getText() != null) {
                    size += RenderableText.ADAPTER.encodedSizeWithTag(1, value.getText());
                }
                if (value.getStyle() != TextStyle.TEXT_STYLE_UNSPECIFIED) {
                    size += TextStyle.ADAPTER.encodedSizeWithTag(2, value.getStyle());
                }
                if (value.getAlignment() != TextAlignment.TEXT_ALIGNMENT_UNSPECIFIED) {
                    size += TextAlignment.ADAPTER.encodedSizeWithTag(3, value.getAlignment());
                }
                if (value.getColor() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(4, value.getColor());
                }
                return size + ThemedColor.ADAPTER.encodedSizeWithTag(5, value.getLink_color_override()) + Font.ADAPTER.encodedSizeWithTag(6, value.getFont()) + ProtoAdapter.INT32.encodedSizeWithTag(7, value.getNumber_of_lines());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Text value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getText() != null) {
                    RenderableText.ADAPTER.encodeWithTag(writer, 1, (int) value.getText());
                }
                if (value.getStyle() != TextStyle.TEXT_STYLE_UNSPECIFIED) {
                    TextStyle.ADAPTER.encodeWithTag(writer, 2, (int) value.getStyle());
                }
                if (value.getAlignment() != TextAlignment.TEXT_ALIGNMENT_UNSPECIFIED) {
                    TextAlignment.ADAPTER.encodeWithTag(writer, 3, (int) value.getAlignment());
                }
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 4, (int) value.getColor());
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 5, (int) value.getLink_color_override());
                Font.ADAPTER.encodeWithTag(writer, 6, (int) value.getFont());
                ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) value.getNumber_of_lines());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Text value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) value.getNumber_of_lines());
                Font.ADAPTER.encodeWithTag(writer, 6, (int) value.getFont());
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getLink_color_override());
                if (value.getColor() != null) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getColor());
                }
                if (value.getAlignment() != TextAlignment.TEXT_ALIGNMENT_UNSPECIFIED) {
                    TextAlignment.ADAPTER.encodeWithTag(writer, 3, (int) value.getAlignment());
                }
                if (value.getStyle() != TextStyle.TEXT_STYLE_UNSPECIFIED) {
                    TextStyle.ADAPTER.encodeWithTag(writer, 2, (int) value.getStyle());
                }
                if (value.getText() != null) {
                    RenderableText.ADAPTER.encodeWithTag(writer, 1, (int) value.getText());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Text decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TextStyle textStyleDecode = TextStyle.TEXT_STYLE_UNSPECIFIED;
                TextAlignment textAlignment = TextAlignment.TEXT_ALIGNMENT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                RenderableText renderableTextDecode = null;
                ThemedColor themedColorDecode = null;
                ThemedColor themedColorDecode2 = null;
                Font fontDecode = null;
                Integer numDecode = null;
                TextAlignment textAlignmentDecode = textAlignment;
                while (true) {
                    TextStyle textStyle = textStyleDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    renderableTextDecode = RenderableText.ADAPTER.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        textStyleDecode = TextStyle.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    try {
                                        textAlignmentDecode = TextAlignment.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    try {
                                        fontDecode = Font.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 7:
                                    numDecode = ProtoAdapter.INT32.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new Text(renderableTextDecode, textStyle, textAlignmentDecode, themedColorDecode, themedColorDecode2, fontDecode, numDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Text redact(Text value) {
                Intrinsics.checkNotNullParameter(value, "value");
                RenderableText text = value.getText();
                RenderableText renderableTextRedact = text != null ? RenderableText.ADAPTER.redact(text) : null;
                ThemedColor color = value.getColor();
                ThemedColor themedColorRedact = color != null ? ThemedColor.ADAPTER.redact(color) : null;
                ThemedColor link_color_override = value.getLink_color_override();
                return Text.copy$default(value, renderableTextRedact, null, null, themedColorRedact, link_color_override != null ? ThemedColor.ADAPTER.redact(link_color_override) : null, null, null, ByteString.EMPTY, 102, null);
            }
        };
    }
}

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

/* compiled from: Style.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J>\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lrh_server_driven_ui/v1/Style;", "Lcom/squareup/wire/Message;", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "opacity", "", "line_type", "Lrh_server_driven_ui/v1/LineType;", "gradient_color", "Lrh_server_driven_ui/v1/LinearGradientColor;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;FLrh_server_driven_ui/v1/LineType;Lrh_server_driven_ui/v1/LinearGradientColor;Lokio/ByteString;)V", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "getOpacity", "()F", "getLine_type", "()Lrh_server_driven_ui/v1/LineType;", "getGradient_color", "()Lrh_server_driven_ui/v1/LinearGradientColor;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Style extends Message {

    @JvmField
    public static final ProtoAdapter<Style> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ThemedColor color;

    @WireField(adapter = "rh_server_driven_ui.v1.LinearGradientColor#ADAPTER", jsonName = "gradientColor", schemaIndex = 3, tag = 4)
    private final LinearGradientColor gradient_color;

    @WireField(adapter = "rh_server_driven_ui.v1.LineType#ADAPTER", jsonName = "lineType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final LineType line_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final float opacity;

    public Style() {
        this(null, 0.0f, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29817newBuilder();
    }

    public final ThemedColor getColor() {
        return this.color;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final LineType getLine_type() {
        return this.line_type;
    }

    public final LinearGradientColor getGradient_color() {
        return this.gradient_color;
    }

    public /* synthetic */ Style(ThemedColor themedColor, float f, LineType lineType, LinearGradientColor linearGradientColor, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? null : lineType, (i & 8) != 0 ? null : linearGradientColor, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Style(ThemedColor themedColor, float f, LineType lineType, LinearGradientColor linearGradientColor, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.color = themedColor;
        this.opacity = f;
        this.line_type = lineType;
        this.gradient_color = linearGradientColor;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29817newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Style)) {
            return false;
        }
        Style style = (Style) other;
        return Intrinsics.areEqual(unknownFields(), style.unknownFields()) && Intrinsics.areEqual(this.color, style.color) && this.opacity == style.opacity && Intrinsics.areEqual(this.line_type, style.line_type) && Intrinsics.areEqual(this.gradient_color, style.gradient_color);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ThemedColor themedColor = this.color;
        int iHashCode2 = (((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + Float.hashCode(this.opacity)) * 37;
        LineType lineType = this.line_type;
        int iHashCode3 = (iHashCode2 + (lineType != null ? lineType.hashCode() : 0)) * 37;
        LinearGradientColor linearGradientColor = this.gradient_color;
        int iHashCode4 = iHashCode3 + (linearGradientColor != null ? linearGradientColor.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ThemedColor themedColor = this.color;
        if (themedColor != null) {
            arrayList.add("color=" + themedColor);
        }
        arrayList.add("opacity=" + this.opacity);
        LineType lineType = this.line_type;
        if (lineType != null) {
            arrayList.add("line_type=" + lineType);
        }
        LinearGradientColor linearGradientColor = this.gradient_color;
        if (linearGradientColor != null) {
            arrayList.add("gradient_color=" + linearGradientColor);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Style{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Style copy$default(Style style, ThemedColor themedColor, float f, LineType lineType, LinearGradientColor linearGradientColor, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            themedColor = style.color;
        }
        if ((i & 2) != 0) {
            f = style.opacity;
        }
        if ((i & 4) != 0) {
            lineType = style.line_type;
        }
        if ((i & 8) != 0) {
            linearGradientColor = style.gradient_color;
        }
        if ((i & 16) != 0) {
            byteString = style.unknownFields();
        }
        ByteString byteString2 = byteString;
        LineType lineType2 = lineType;
        return style.copy(themedColor, f, lineType2, linearGradientColor, byteString2);
    }

    public final Style copy(ThemedColor color, float opacity, LineType line_type, LinearGradientColor gradient_color, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Style(color, opacity, line_type, gradient_color, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Style.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Style>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Style$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Style value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getColor() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(1, value.getColor());
                }
                if (!Float.valueOf(value.getOpacity()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getOpacity()));
                }
                if (value.getLine_type() != null) {
                    size += LineType.ADAPTER.encodedSizeWithTag(3, value.getLine_type());
                }
                return size + LinearGradientColor.ADAPTER.encodedSizeWithTag(4, value.getGradient_color());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Style value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                }
                if (!Float.valueOf(value.getOpacity()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getOpacity()));
                }
                if (value.getLine_type() != null) {
                    LineType.ADAPTER.encodeWithTag(writer, 3, (int) value.getLine_type());
                }
                LinearGradientColor.ADAPTER.encodeWithTag(writer, 4, (int) value.getGradient_color());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Style value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                LinearGradientColor.ADAPTER.encodeWithTag(writer, 4, (int) value.getGradient_color());
                if (value.getLine_type() != null) {
                    LineType.ADAPTER.encodeWithTag(writer, 3, (int) value.getLine_type());
                }
                if (!Float.valueOf(value.getOpacity()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getOpacity()));
                }
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Style redact(Style value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor color = value.getColor();
                ThemedColor themedColorRedact = color != null ? ThemedColor.ADAPTER.redact(color) : null;
                LineType line_type = value.getLine_type();
                LineType lineTypeRedact = line_type != null ? LineType.ADAPTER.redact(line_type) : null;
                LinearGradientColor gradient_color = value.getGradient_color();
                return Style.copy$default(value, themedColorRedact, 0.0f, lineTypeRedact, gradient_color != null ? LinearGradientColor.ADAPTER.redact(gradient_color) : null, ByteString.EMPTY, 2, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Style decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                LinearGradientColor linearGradientColorDecode = null;
                float fFloatValue = 0.0f;
                LineType lineTypeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Style(themedColorDecode, fFloatValue, lineTypeDecode, linearGradientColorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iNextTag == 3) {
                        lineTypeDecode = LineType.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        linearGradientColorDecode = LinearGradientColor.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}

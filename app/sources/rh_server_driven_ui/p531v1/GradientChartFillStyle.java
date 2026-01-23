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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GradientChartFillStyle.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016Jb\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006+"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientChartFillStyle;", "Lcom/squareup/wire/Message;", "", "start_color", "Lrh_server_driven_ui/v1/ThemedColor;", "end_color", "start_color_opacity", "", "end_color_opacity", "gradient_style", "Lrh_server_driven_ui/v1/GradientStyle;", "color_stops", "", "Lrh_server_driven_ui/v1/ColorStop;", "themed_color_stops", "Lrh_server_driven_ui/v1/ThemedColorStops;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;FFLrh_server_driven_ui/v1/GradientStyle;Ljava/util/List;Lrh_server_driven_ui/v1/ThemedColorStops;Lokio/ByteString;)V", "getStart_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getEnd_color", "getStart_color_opacity", "()F", "getEnd_color_opacity", "getGradient_style", "()Lrh_server_driven_ui/v1/GradientStyle;", "getThemed_color_stops", "()Lrh_server_driven_ui/v1/ThemedColorStops;", "getColor_stops", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class GradientChartFillStyle extends Message {

    @JvmField
    public static final ProtoAdapter<GradientChartFillStyle> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ColorStop#ADAPTER", jsonName = "colorStops", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<ColorStop> color_stops;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "endColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ThemedColor end_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "endColorOpacity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final float end_color_opacity;

    @WireField(adapter = "rh_server_driven_ui.v1.GradientStyle#ADAPTER", jsonName = "gradientStyle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final GradientStyle gradient_style;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "startColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ThemedColor start_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "startColorOpacity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float start_color_opacity;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColorStops#ADAPTER", jsonName = "themedColorStops", schemaIndex = 6, tag = 7)
    private final ThemedColorStops themed_color_stops;

    public GradientChartFillStyle() {
        this(null, null, 0.0f, 0.0f, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29743newBuilder();
    }

    public final ThemedColor getStart_color() {
        return this.start_color;
    }

    public final ThemedColor getEnd_color() {
        return this.end_color;
    }

    public final float getStart_color_opacity() {
        return this.start_color_opacity;
    }

    public final float getEnd_color_opacity() {
        return this.end_color_opacity;
    }

    public final GradientStyle getGradient_style() {
        return this.gradient_style;
    }

    public /* synthetic */ GradientChartFillStyle(ThemedColor themedColor, ThemedColor themedColor2, float f, float f2, GradientStyle gradientStyle, List list, ThemedColorStops themedColorStops, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? null : themedColor2, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f2, (i & 16) != 0 ? GradientStyle.GRADIENT_STYLE_UNSPECIFIED : gradientStyle, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : themedColorStops, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ThemedColorStops getThemed_color_stops() {
        return this.themed_color_stops;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientChartFillStyle(ThemedColor themedColor, ThemedColor themedColor2, float f, float f2, GradientStyle gradient_style, List<ColorStop> color_stops, ThemedColorStops themedColorStops, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(gradient_style, "gradient_style");
        Intrinsics.checkNotNullParameter(color_stops, "color_stops");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.start_color = themedColor;
        this.end_color = themedColor2;
        this.start_color_opacity = f;
        this.end_color_opacity = f2;
        this.gradient_style = gradient_style;
        this.themed_color_stops = themedColorStops;
        this.color_stops = Internal.immutableCopyOf("color_stops", color_stops);
    }

    public final List<ColorStop> getColor_stops() {
        return this.color_stops;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29743newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GradientChartFillStyle)) {
            return false;
        }
        GradientChartFillStyle gradientChartFillStyle = (GradientChartFillStyle) other;
        return Intrinsics.areEqual(unknownFields(), gradientChartFillStyle.unknownFields()) && Intrinsics.areEqual(this.start_color, gradientChartFillStyle.start_color) && Intrinsics.areEqual(this.end_color, gradientChartFillStyle.end_color) && this.start_color_opacity == gradientChartFillStyle.start_color_opacity && this.end_color_opacity == gradientChartFillStyle.end_color_opacity && this.gradient_style == gradientChartFillStyle.gradient_style && Intrinsics.areEqual(this.color_stops, gradientChartFillStyle.color_stops) && Intrinsics.areEqual(this.themed_color_stops, gradientChartFillStyle.themed_color_stops);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ThemedColor themedColor = this.start_color;
        int iHashCode2 = (iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ThemedColor themedColor2 = this.end_color;
        int iHashCode3 = (((((((((iHashCode2 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37) + Float.hashCode(this.start_color_opacity)) * 37) + Float.hashCode(this.end_color_opacity)) * 37) + this.gradient_style.hashCode()) * 37) + this.color_stops.hashCode()) * 37;
        ThemedColorStops themedColorStops = this.themed_color_stops;
        int iHashCode4 = iHashCode3 + (themedColorStops != null ? themedColorStops.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ThemedColor themedColor = this.start_color;
        if (themedColor != null) {
            arrayList.add("start_color=" + themedColor);
        }
        ThemedColor themedColor2 = this.end_color;
        if (themedColor2 != null) {
            arrayList.add("end_color=" + themedColor2);
        }
        arrayList.add("start_color_opacity=" + this.start_color_opacity);
        arrayList.add("end_color_opacity=" + this.end_color_opacity);
        arrayList.add("gradient_style=" + this.gradient_style);
        if (!this.color_stops.isEmpty()) {
            arrayList.add("color_stops=" + this.color_stops);
        }
        ThemedColorStops themedColorStops = this.themed_color_stops;
        if (themedColorStops != null) {
            arrayList.add("themed_color_stops=" + themedColorStops);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GradientChartFillStyle{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GradientChartFillStyle copy$default(GradientChartFillStyle gradientChartFillStyle, ThemedColor themedColor, ThemedColor themedColor2, float f, float f2, GradientStyle gradientStyle, List list, ThemedColorStops themedColorStops, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            themedColor = gradientChartFillStyle.start_color;
        }
        if ((i & 2) != 0) {
            themedColor2 = gradientChartFillStyle.end_color;
        }
        if ((i & 4) != 0) {
            f = gradientChartFillStyle.start_color_opacity;
        }
        if ((i & 8) != 0) {
            f2 = gradientChartFillStyle.end_color_opacity;
        }
        if ((i & 16) != 0) {
            gradientStyle = gradientChartFillStyle.gradient_style;
        }
        if ((i & 32) != 0) {
            list = gradientChartFillStyle.color_stops;
        }
        if ((i & 64) != 0) {
            themedColorStops = gradientChartFillStyle.themed_color_stops;
        }
        if ((i & 128) != 0) {
            byteString = gradientChartFillStyle.unknownFields();
        }
        ThemedColorStops themedColorStops2 = themedColorStops;
        ByteString byteString2 = byteString;
        GradientStyle gradientStyle2 = gradientStyle;
        List list2 = list;
        return gradientChartFillStyle.copy(themedColor, themedColor2, f, f2, gradientStyle2, list2, themedColorStops2, byteString2);
    }

    public final GradientChartFillStyle copy(ThemedColor start_color, ThemedColor end_color, float start_color_opacity, float end_color_opacity, GradientStyle gradient_style, List<ColorStop> color_stops, ThemedColorStops themed_color_stops, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(gradient_style, "gradient_style");
        Intrinsics.checkNotNullParameter(color_stops, "color_stops");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GradientChartFillStyle(start_color, end_color, start_color_opacity, end_color_opacity, gradient_style, color_stops, themed_color_stops, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GradientChartFillStyle.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GradientChartFillStyle>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.GradientChartFillStyle$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GradientChartFillStyle value) {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getStart_color() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(1, value.getStart_color());
                }
                if (value.getEnd_color() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getEnd_color());
                }
                if (!Float.valueOf(value.getStart_color_opacity()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getStart_color_opacity()));
                }
                if (!Float.valueOf(value.getEnd_color_opacity()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getEnd_color_opacity()));
                }
                if (value.getGradient_style() != GradientStyle.GRADIENT_STYLE_UNSPECIFIED) {
                    size += GradientStyle.ADAPTER.encodedSizeWithTag(5, value.getGradient_style());
                }
                return size + ColorStop.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getColor_stops()) + ThemedColorStops.ADAPTER.encodedSizeWithTag(7, value.getThemed_color_stops());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GradientChartFillStyle value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStart_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getStart_color());
                }
                if (value.getEnd_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getEnd_color());
                }
                if (!Float.valueOf(value.getStart_color_opacity()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getStart_color_opacity()));
                }
                if (!Float.valueOf(value.getEnd_color_opacity()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getEnd_color_opacity()));
                }
                if (value.getGradient_style() != GradientStyle.GRADIENT_STYLE_UNSPECIFIED) {
                    GradientStyle.ADAPTER.encodeWithTag(writer, 5, (int) value.getGradient_style());
                }
                ColorStop.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getColor_stops());
                ThemedColorStops.ADAPTER.encodeWithTag(writer, 7, (int) value.getThemed_color_stops());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GradientChartFillStyle value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ThemedColorStops.ADAPTER.encodeWithTag(writer, 7, (int) value.getThemed_color_stops());
                ColorStop.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getColor_stops());
                if (value.getGradient_style() != GradientStyle.GRADIENT_STYLE_UNSPECIFIED) {
                    GradientStyle.ADAPTER.encodeWithTag(writer, 5, (int) value.getGradient_style());
                }
                if (!Float.valueOf(value.getEnd_color_opacity()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getEnd_color_opacity()));
                }
                if (!Float.valueOf(value.getStart_color_opacity()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getStart_color_opacity()));
                }
                if (value.getEnd_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getEnd_color());
                }
                if (value.getStart_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getStart_color());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GradientChartFillStyle decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                GradientStyle gradientStyle = GradientStyle.GRADIENT_STYLE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                ThemedColorStops themedColorStopsDecode = null;
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                GradientStyle gradientStyleDecode = gradientStyle;
                ThemedColor themedColorDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 2:
                                themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 3:
                                fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 4:
                                fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 5:
                                try {
                                    gradientStyleDecode = GradientStyle.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 6:
                                arrayList.add(ColorStop.ADAPTER.decode(reader));
                                break;
                            case 7:
                                themedColorStopsDecode = ThemedColorStops.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GradientChartFillStyle(themedColorDecode2, themedColorDecode, fFloatValue, fFloatValue2, gradientStyleDecode, arrayList, themedColorStopsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GradientChartFillStyle redact(GradientChartFillStyle value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor start_color = value.getStart_color();
                ThemedColor themedColorRedact = start_color != null ? ThemedColor.ADAPTER.redact(start_color) : null;
                ThemedColor end_color = value.getEnd_color();
                ThemedColor themedColorRedact2 = end_color != null ? ThemedColor.ADAPTER.redact(end_color) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getColor_stops(), ColorStop.ADAPTER);
                ThemedColorStops themed_color_stops = value.getThemed_color_stops();
                return GradientChartFillStyle.copy$default(value, themedColorRedact, themedColorRedact2, 0.0f, 0.0f, null, listM26823redactElements, themed_color_stops != null ? ThemedColorStops.ADAPTER.redact(themed_color_stops) : null, ByteString.EMPTY, 28, null);
            }
        };
    }
}

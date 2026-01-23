package rh_server_driven_ui.p531v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: ChartFillStyle.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016JX\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006*"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyle;", "Lcom/squareup/wire/Message;", "", "dotted", "Lrh_server_driven_ui/v1/DottedChartFillStyle;", "solid_color", "Lrh_server_driven_ui/v1/SolidChartFillStyle;", "gradient", "Lrh_server_driven_ui/v1/GradientChartFillStyle;", "gradient_animation", "Lrh_server_driven_ui/v1/GradientAnimationChartFillStyle;", "rounded_solid_color", "Lrh_server_driven_ui/v1/RoundedSolidChartFillStyle;", "dot", "Lrh_server_driven_ui/v1/DotChartFillStyle;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/DottedChartFillStyle;Lrh_server_driven_ui/v1/SolidChartFillStyle;Lrh_server_driven_ui/v1/GradientChartFillStyle;Lrh_server_driven_ui/v1/GradientAnimationChartFillStyle;Lrh_server_driven_ui/v1/RoundedSolidChartFillStyle;Lrh_server_driven_ui/v1/DotChartFillStyle;Lokio/ByteString;)V", "getDotted", "()Lrh_server_driven_ui/v1/DottedChartFillStyle;", "getSolid_color", "()Lrh_server_driven_ui/v1/SolidChartFillStyle;", "getGradient", "()Lrh_server_driven_ui/v1/GradientChartFillStyle;", "getGradient_animation", "()Lrh_server_driven_ui/v1/GradientAnimationChartFillStyle;", "getRounded_solid_color", "()Lrh_server_driven_ui/v1/RoundedSolidChartFillStyle;", "getDot", "()Lrh_server_driven_ui/v1/DotChartFillStyle;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ChartFillStyle extends Message {

    @JvmField
    public static final ProtoAdapter<ChartFillStyle> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.DotChartFillStyle#ADAPTER", oneofName = "style_details", schemaIndex = 5, tag = 6)
    private final DotChartFillStyle dot;

    @WireField(adapter = "rh_server_driven_ui.v1.DottedChartFillStyle#ADAPTER", oneofName = "style_details", schemaIndex = 0, tag = 1)
    private final DottedChartFillStyle dotted;

    @WireField(adapter = "rh_server_driven_ui.v1.GradientChartFillStyle#ADAPTER", oneofName = "style_details", schemaIndex = 2, tag = 3)
    private final GradientChartFillStyle gradient;

    @WireField(adapter = "rh_server_driven_ui.v1.GradientAnimationChartFillStyle#ADAPTER", jsonName = "gradientAnimation", oneofName = "style_details", schemaIndex = 3, tag = 4)
    private final GradientAnimationChartFillStyle gradient_animation;

    @WireField(adapter = "rh_server_driven_ui.v1.RoundedSolidChartFillStyle#ADAPTER", jsonName = "roundedSolidColor", oneofName = "style_details", schemaIndex = 4, tag = 5)
    private final RoundedSolidChartFillStyle rounded_solid_color;

    @WireField(adapter = "rh_server_driven_ui.v1.SolidChartFillStyle#ADAPTER", jsonName = "solidColor", oneofName = "style_details", schemaIndex = 1, tag = 2)
    private final SolidChartFillStyle solid_color;

    public ChartFillStyle() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29691newBuilder();
    }

    public final DottedChartFillStyle getDotted() {
        return this.dotted;
    }

    public final SolidChartFillStyle getSolid_color() {
        return this.solid_color;
    }

    public final GradientChartFillStyle getGradient() {
        return this.gradient;
    }

    public final GradientAnimationChartFillStyle getGradient_animation() {
        return this.gradient_animation;
    }

    public final RoundedSolidChartFillStyle getRounded_solid_color() {
        return this.rounded_solid_color;
    }

    public final DotChartFillStyle getDot() {
        return this.dot;
    }

    public /* synthetic */ ChartFillStyle(DottedChartFillStyle dottedChartFillStyle, SolidChartFillStyle solidChartFillStyle, GradientChartFillStyle gradientChartFillStyle, GradientAnimationChartFillStyle gradientAnimationChartFillStyle, RoundedSolidChartFillStyle roundedSolidChartFillStyle, DotChartFillStyle dotChartFillStyle, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dottedChartFillStyle, (i & 2) != 0 ? null : solidChartFillStyle, (i & 4) != 0 ? null : gradientChartFillStyle, (i & 8) != 0 ? null : gradientAnimationChartFillStyle, (i & 16) != 0 ? null : roundedSolidChartFillStyle, (i & 32) != 0 ? null : dotChartFillStyle, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartFillStyle(DottedChartFillStyle dottedChartFillStyle, SolidChartFillStyle solidChartFillStyle, GradientChartFillStyle gradientChartFillStyle, GradientAnimationChartFillStyle gradientAnimationChartFillStyle, RoundedSolidChartFillStyle roundedSolidChartFillStyle, DotChartFillStyle dotChartFillStyle, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.dotted = dottedChartFillStyle;
        this.solid_color = solidChartFillStyle;
        this.gradient = gradientChartFillStyle;
        this.gradient_animation = gradientAnimationChartFillStyle;
        this.rounded_solid_color = roundedSolidChartFillStyle;
        this.dot = dotChartFillStyle;
        if (Internal.countNonNull(dottedChartFillStyle, solidChartFillStyle, gradientChartFillStyle, gradientAnimationChartFillStyle, roundedSolidChartFillStyle, dotChartFillStyle) > 1) {
            throw new IllegalArgumentException("At most one of dotted, solid_color, gradient, gradient_animation, rounded_solid_color, dot may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29691newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartFillStyle)) {
            return false;
        }
        ChartFillStyle chartFillStyle = (ChartFillStyle) other;
        return Intrinsics.areEqual(unknownFields(), chartFillStyle.unknownFields()) && Intrinsics.areEqual(this.dotted, chartFillStyle.dotted) && Intrinsics.areEqual(this.solid_color, chartFillStyle.solid_color) && Intrinsics.areEqual(this.gradient, chartFillStyle.gradient) && Intrinsics.areEqual(this.gradient_animation, chartFillStyle.gradient_animation) && Intrinsics.areEqual(this.rounded_solid_color, chartFillStyle.rounded_solid_color) && Intrinsics.areEqual(this.dot, chartFillStyle.dot);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        DottedChartFillStyle dottedChartFillStyle = this.dotted;
        int iHashCode2 = (iHashCode + (dottedChartFillStyle != null ? dottedChartFillStyle.hashCode() : 0)) * 37;
        SolidChartFillStyle solidChartFillStyle = this.solid_color;
        int iHashCode3 = (iHashCode2 + (solidChartFillStyle != null ? solidChartFillStyle.hashCode() : 0)) * 37;
        GradientChartFillStyle gradientChartFillStyle = this.gradient;
        int iHashCode4 = (iHashCode3 + (gradientChartFillStyle != null ? gradientChartFillStyle.hashCode() : 0)) * 37;
        GradientAnimationChartFillStyle gradientAnimationChartFillStyle = this.gradient_animation;
        int iHashCode5 = (iHashCode4 + (gradientAnimationChartFillStyle != null ? gradientAnimationChartFillStyle.hashCode() : 0)) * 37;
        RoundedSolidChartFillStyle roundedSolidChartFillStyle = this.rounded_solid_color;
        int iHashCode6 = (iHashCode5 + (roundedSolidChartFillStyle != null ? roundedSolidChartFillStyle.hashCode() : 0)) * 37;
        DotChartFillStyle dotChartFillStyle = this.dot;
        int iHashCode7 = iHashCode6 + (dotChartFillStyle != null ? dotChartFillStyle.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        DottedChartFillStyle dottedChartFillStyle = this.dotted;
        if (dottedChartFillStyle != null) {
            arrayList.add("dotted=" + dottedChartFillStyle);
        }
        SolidChartFillStyle solidChartFillStyle = this.solid_color;
        if (solidChartFillStyle != null) {
            arrayList.add("solid_color=" + solidChartFillStyle);
        }
        GradientChartFillStyle gradientChartFillStyle = this.gradient;
        if (gradientChartFillStyle != null) {
            arrayList.add("gradient=" + gradientChartFillStyle);
        }
        GradientAnimationChartFillStyle gradientAnimationChartFillStyle = this.gradient_animation;
        if (gradientAnimationChartFillStyle != null) {
            arrayList.add("gradient_animation=" + gradientAnimationChartFillStyle);
        }
        RoundedSolidChartFillStyle roundedSolidChartFillStyle = this.rounded_solid_color;
        if (roundedSolidChartFillStyle != null) {
            arrayList.add("rounded_solid_color=" + roundedSolidChartFillStyle);
        }
        DotChartFillStyle dotChartFillStyle = this.dot;
        if (dotChartFillStyle != null) {
            arrayList.add("dot=" + dotChartFillStyle);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChartFillStyle{", "}", 0, null, null, 56, null);
    }

    public final ChartFillStyle copy(DottedChartFillStyle dotted, SolidChartFillStyle solid_color, GradientChartFillStyle gradient, GradientAnimationChartFillStyle gradient_animation, RoundedSolidChartFillStyle rounded_solid_color, DotChartFillStyle dot, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChartFillStyle(dotted, solid_color, gradient, gradient_animation, rounded_solid_color, dot, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartFillStyle.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChartFillStyle>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ChartFillStyle$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChartFillStyle value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + DottedChartFillStyle.ADAPTER.encodedSizeWithTag(1, value.getDotted()) + SolidChartFillStyle.ADAPTER.encodedSizeWithTag(2, value.getSolid_color()) + GradientChartFillStyle.ADAPTER.encodedSizeWithTag(3, value.getGradient()) + GradientAnimationChartFillStyle.ADAPTER.encodedSizeWithTag(4, value.getGradient_animation()) + RoundedSolidChartFillStyle.ADAPTER.encodedSizeWithTag(5, value.getRounded_solid_color()) + DotChartFillStyle.ADAPTER.encodedSizeWithTag(6, value.getDot());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChartFillStyle value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                DottedChartFillStyle.ADAPTER.encodeWithTag(writer, 1, (int) value.getDotted());
                SolidChartFillStyle.ADAPTER.encodeWithTag(writer, 2, (int) value.getSolid_color());
                GradientChartFillStyle.ADAPTER.encodeWithTag(writer, 3, (int) value.getGradient());
                GradientAnimationChartFillStyle.ADAPTER.encodeWithTag(writer, 4, (int) value.getGradient_animation());
                RoundedSolidChartFillStyle.ADAPTER.encodeWithTag(writer, 5, (int) value.getRounded_solid_color());
                DotChartFillStyle.ADAPTER.encodeWithTag(writer, 6, (int) value.getDot());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChartFillStyle value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                DotChartFillStyle.ADAPTER.encodeWithTag(writer, 6, (int) value.getDot());
                RoundedSolidChartFillStyle.ADAPTER.encodeWithTag(writer, 5, (int) value.getRounded_solid_color());
                GradientAnimationChartFillStyle.ADAPTER.encodeWithTag(writer, 4, (int) value.getGradient_animation());
                GradientChartFillStyle.ADAPTER.encodeWithTag(writer, 3, (int) value.getGradient());
                SolidChartFillStyle.ADAPTER.encodeWithTag(writer, 2, (int) value.getSolid_color());
                DottedChartFillStyle.ADAPTER.encodeWithTag(writer, 1, (int) value.getDotted());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartFillStyle redact(ChartFillStyle value) {
                Intrinsics.checkNotNullParameter(value, "value");
                DottedChartFillStyle dotted = value.getDotted();
                DottedChartFillStyle dottedChartFillStyleRedact = dotted != null ? DottedChartFillStyle.ADAPTER.redact(dotted) : null;
                SolidChartFillStyle solid_color = value.getSolid_color();
                SolidChartFillStyle solidChartFillStyleRedact = solid_color != null ? SolidChartFillStyle.ADAPTER.redact(solid_color) : null;
                GradientChartFillStyle gradient = value.getGradient();
                GradientChartFillStyle gradientChartFillStyleRedact = gradient != null ? GradientChartFillStyle.ADAPTER.redact(gradient) : null;
                GradientAnimationChartFillStyle gradient_animation = value.getGradient_animation();
                GradientAnimationChartFillStyle gradientAnimationChartFillStyleRedact = gradient_animation != null ? GradientAnimationChartFillStyle.ADAPTER.redact(gradient_animation) : null;
                RoundedSolidChartFillStyle rounded_solid_color = value.getRounded_solid_color();
                RoundedSolidChartFillStyle roundedSolidChartFillStyleRedact = rounded_solid_color != null ? RoundedSolidChartFillStyle.ADAPTER.redact(rounded_solid_color) : null;
                DotChartFillStyle dot = value.getDot();
                return value.copy(dottedChartFillStyleRedact, solidChartFillStyleRedact, gradientChartFillStyleRedact, gradientAnimationChartFillStyleRedact, roundedSolidChartFillStyleRedact, dot != null ? DotChartFillStyle.ADAPTER.redact(dot) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartFillStyle decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                DottedChartFillStyle dottedChartFillStyleDecode = null;
                SolidChartFillStyle solidChartFillStyleDecode = null;
                GradientChartFillStyle gradientChartFillStyleDecode = null;
                GradientAnimationChartFillStyle gradientAnimationChartFillStyleDecode = null;
                RoundedSolidChartFillStyle roundedSolidChartFillStyleDecode = null;
                DotChartFillStyle dotChartFillStyleDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                dottedChartFillStyleDecode = DottedChartFillStyle.ADAPTER.decode(reader);
                                break;
                            case 2:
                                solidChartFillStyleDecode = SolidChartFillStyle.ADAPTER.decode(reader);
                                break;
                            case 3:
                                gradientChartFillStyleDecode = GradientChartFillStyle.ADAPTER.decode(reader);
                                break;
                            case 4:
                                gradientAnimationChartFillStyleDecode = GradientAnimationChartFillStyle.ADAPTER.decode(reader);
                                break;
                            case 5:
                                roundedSolidChartFillStyleDecode = RoundedSolidChartFillStyle.ADAPTER.decode(reader);
                                break;
                            case 6:
                                dotChartFillStyleDecode = DotChartFillStyle.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ChartFillStyle(dottedChartFillStyleDecode, solidChartFillStyleDecode, gradientChartFillStyleDecode, gradientAnimationChartFillStyleDecode, roundedSolidChartFillStyleDecode, dotChartFillStyleDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}

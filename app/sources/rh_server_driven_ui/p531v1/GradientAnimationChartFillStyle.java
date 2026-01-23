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

/* compiled from: GradientAnimationChartFillStyle.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,Bk\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016Jj\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006-"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientAnimationChartFillStyle;", "Lcom/squareup/wire/Message;", "", "id", "", "base_color", "Lrh_server_driven_ui/v1/ThemedColor;", "base_color_opacity", "", "gradient_style", "Lrh_server_driven_ui/v1/GradientStyle;", "before_pivot_gradient", "Lrh_server_driven_ui/v1/GradientChartFillStyle;", "after_pivot_gradient", "speed", "corner_radius_info", "Lrh_server_driven_ui/v1/CornerRadiusInfo;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColor;FLrh_server_driven_ui/v1/GradientStyle;Lrh_server_driven_ui/v1/GradientChartFillStyle;Lrh_server_driven_ui/v1/GradientChartFillStyle;FLrh_server_driven_ui/v1/CornerRadiusInfo;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getBase_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getBase_color_opacity", "()F", "getGradient_style", "()Lrh_server_driven_ui/v1/GradientStyle;", "getBefore_pivot_gradient", "()Lrh_server_driven_ui/v1/GradientChartFillStyle;", "getAfter_pivot_gradient", "getSpeed", "getCorner_radius_info", "()Lrh_server_driven_ui/v1/CornerRadiusInfo;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class GradientAnimationChartFillStyle extends Message {

    @JvmField
    public static final ProtoAdapter<GradientAnimationChartFillStyle> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.GradientChartFillStyle#ADAPTER", jsonName = "afterPivotGradient", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final GradientChartFillStyle after_pivot_gradient;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "baseColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ThemedColor base_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "baseColorOpacity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float base_color_opacity;

    @WireField(adapter = "rh_server_driven_ui.v1.GradientChartFillStyle#ADAPTER", jsonName = "beforePivotGradient", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final GradientChartFillStyle before_pivot_gradient;

    @WireField(adapter = "rh_server_driven_ui.v1.CornerRadiusInfo#ADAPTER", jsonName = "cornerRadiusInfo", schemaIndex = 7, tag = 8)
    private final CornerRadiusInfo corner_radius_info;

    @WireField(adapter = "rh_server_driven_ui.v1.GradientStyle#ADAPTER", jsonName = "gradientStyle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final GradientStyle gradient_style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final float speed;

    public GradientAnimationChartFillStyle() {
        this(null, null, 0.0f, null, null, null, 0.0f, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29742newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final ThemedColor getBase_color() {
        return this.base_color;
    }

    public final float getBase_color_opacity() {
        return this.base_color_opacity;
    }

    public final GradientStyle getGradient_style() {
        return this.gradient_style;
    }

    public /* synthetic */ GradientAnimationChartFillStyle(String str, ThemedColor themedColor, float f, GradientStyle gradientStyle, GradientChartFillStyle gradientChartFillStyle, GradientChartFillStyle gradientChartFillStyle2, float f2, CornerRadiusInfo cornerRadiusInfo, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : themedColor, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? GradientStyle.GRADIENT_STYLE_UNSPECIFIED : gradientStyle, (i & 16) != 0 ? null : gradientChartFillStyle, (i & 32) != 0 ? null : gradientChartFillStyle2, (i & 64) != 0 ? 0.0f : f2, (i & 128) != 0 ? null : cornerRadiusInfo, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final GradientChartFillStyle getBefore_pivot_gradient() {
        return this.before_pivot_gradient;
    }

    public final GradientChartFillStyle getAfter_pivot_gradient() {
        return this.after_pivot_gradient;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final CornerRadiusInfo getCorner_radius_info() {
        return this.corner_radius_info;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientAnimationChartFillStyle(String str, ThemedColor themedColor, float f, GradientStyle gradient_style, GradientChartFillStyle gradientChartFillStyle, GradientChartFillStyle gradientChartFillStyle2, float f2, CornerRadiusInfo cornerRadiusInfo, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(gradient_style, "gradient_style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = str;
        this.base_color = themedColor;
        this.base_color_opacity = f;
        this.gradient_style = gradient_style;
        this.before_pivot_gradient = gradientChartFillStyle;
        this.after_pivot_gradient = gradientChartFillStyle2;
        this.speed = f2;
        this.corner_radius_info = cornerRadiusInfo;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29742newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GradientAnimationChartFillStyle)) {
            return false;
        }
        GradientAnimationChartFillStyle gradientAnimationChartFillStyle = (GradientAnimationChartFillStyle) other;
        return Intrinsics.areEqual(unknownFields(), gradientAnimationChartFillStyle.unknownFields()) && Intrinsics.areEqual(this.id, gradientAnimationChartFillStyle.id) && Intrinsics.areEqual(this.base_color, gradientAnimationChartFillStyle.base_color) && this.base_color_opacity == gradientAnimationChartFillStyle.base_color_opacity && this.gradient_style == gradientAnimationChartFillStyle.gradient_style && Intrinsics.areEqual(this.before_pivot_gradient, gradientAnimationChartFillStyle.before_pivot_gradient) && Intrinsics.areEqual(this.after_pivot_gradient, gradientAnimationChartFillStyle.after_pivot_gradient) && this.speed == gradientAnimationChartFillStyle.speed && Intrinsics.areEqual(this.corner_radius_info, gradientAnimationChartFillStyle.corner_radius_info);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        ThemedColor themedColor = this.base_color;
        int iHashCode3 = (((((iHashCode2 + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + Float.hashCode(this.base_color_opacity)) * 37) + this.gradient_style.hashCode()) * 37;
        GradientChartFillStyle gradientChartFillStyle = this.before_pivot_gradient;
        int iHashCode4 = (iHashCode3 + (gradientChartFillStyle != null ? gradientChartFillStyle.hashCode() : 0)) * 37;
        GradientChartFillStyle gradientChartFillStyle2 = this.after_pivot_gradient;
        int iHashCode5 = (((iHashCode4 + (gradientChartFillStyle2 != null ? gradientChartFillStyle2.hashCode() : 0)) * 37) + Float.hashCode(this.speed)) * 37;
        CornerRadiusInfo cornerRadiusInfo = this.corner_radius_info;
        int iHashCode6 = iHashCode5 + (cornerRadiusInfo != null ? cornerRadiusInfo.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            arrayList.add("id=" + Internal.sanitize(str));
        }
        ThemedColor themedColor = this.base_color;
        if (themedColor != null) {
            arrayList.add("base_color=" + themedColor);
        }
        arrayList.add("base_color_opacity=" + this.base_color_opacity);
        arrayList.add("gradient_style=" + this.gradient_style);
        GradientChartFillStyle gradientChartFillStyle = this.before_pivot_gradient;
        if (gradientChartFillStyle != null) {
            arrayList.add("before_pivot_gradient=" + gradientChartFillStyle);
        }
        GradientChartFillStyle gradientChartFillStyle2 = this.after_pivot_gradient;
        if (gradientChartFillStyle2 != null) {
            arrayList.add("after_pivot_gradient=" + gradientChartFillStyle2);
        }
        arrayList.add("speed=" + this.speed);
        CornerRadiusInfo cornerRadiusInfo = this.corner_radius_info;
        if (cornerRadiusInfo != null) {
            arrayList.add("corner_radius_info=" + cornerRadiusInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GradientAnimationChartFillStyle{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GradientAnimationChartFillStyle copy$default(GradientAnimationChartFillStyle gradientAnimationChartFillStyle, String str, ThemedColor themedColor, float f, GradientStyle gradientStyle, GradientChartFillStyle gradientChartFillStyle, GradientChartFillStyle gradientChartFillStyle2, float f2, CornerRadiusInfo cornerRadiusInfo, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gradientAnimationChartFillStyle.id;
        }
        if ((i & 2) != 0) {
            themedColor = gradientAnimationChartFillStyle.base_color;
        }
        if ((i & 4) != 0) {
            f = gradientAnimationChartFillStyle.base_color_opacity;
        }
        if ((i & 8) != 0) {
            gradientStyle = gradientAnimationChartFillStyle.gradient_style;
        }
        if ((i & 16) != 0) {
            gradientChartFillStyle = gradientAnimationChartFillStyle.before_pivot_gradient;
        }
        if ((i & 32) != 0) {
            gradientChartFillStyle2 = gradientAnimationChartFillStyle.after_pivot_gradient;
        }
        if ((i & 64) != 0) {
            f2 = gradientAnimationChartFillStyle.speed;
        }
        if ((i & 128) != 0) {
            cornerRadiusInfo = gradientAnimationChartFillStyle.corner_radius_info;
        }
        if ((i & 256) != 0) {
            byteString = gradientAnimationChartFillStyle.unknownFields();
        }
        CornerRadiusInfo cornerRadiusInfo2 = cornerRadiusInfo;
        ByteString byteString2 = byteString;
        GradientChartFillStyle gradientChartFillStyle3 = gradientChartFillStyle2;
        float f3 = f2;
        GradientChartFillStyle gradientChartFillStyle4 = gradientChartFillStyle;
        float f4 = f;
        return gradientAnimationChartFillStyle.copy(str, themedColor, f4, gradientStyle, gradientChartFillStyle4, gradientChartFillStyle3, f3, cornerRadiusInfo2, byteString2);
    }

    public final GradientAnimationChartFillStyle copy(String id, ThemedColor base_color, float base_color_opacity, GradientStyle gradient_style, GradientChartFillStyle before_pivot_gradient, GradientChartFillStyle after_pivot_gradient, float speed, CornerRadiusInfo corner_radius_info, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(gradient_style, "gradient_style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GradientAnimationChartFillStyle(id, base_color, base_color_opacity, gradient_style, before_pivot_gradient, after_pivot_gradient, speed, corner_radius_info, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GradientAnimationChartFillStyle.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GradientAnimationChartFillStyle>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.GradientAnimationChartFillStyle$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GradientAnimationChartFillStyle value) {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                if (value.getBase_color() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getBase_color());
                }
                if (!Float.valueOf(value.getBase_color_opacity()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getBase_color_opacity()));
                }
                if (value.getGradient_style() != GradientStyle.GRADIENT_STYLE_UNSPECIFIED) {
                    size += GradientStyle.ADAPTER.encodedSizeWithTag(4, value.getGradient_style());
                }
                if (value.getBefore_pivot_gradient() != null) {
                    size += GradientChartFillStyle.ADAPTER.encodedSizeWithTag(5, value.getBefore_pivot_gradient());
                }
                if (value.getAfter_pivot_gradient() != null) {
                    size += GradientChartFillStyle.ADAPTER.encodedSizeWithTag(6, value.getAfter_pivot_gradient());
                }
                if (!Float.valueOf(value.getSpeed()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(7, Float.valueOf(value.getSpeed()));
                }
                return size + CornerRadiusInfo.ADAPTER.encodedSizeWithTag(8, value.getCorner_radius_info());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GradientAnimationChartFillStyle value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                if (value.getBase_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getBase_color());
                }
                if (!Float.valueOf(value.getBase_color_opacity()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getBase_color_opacity()));
                }
                if (value.getGradient_style() != GradientStyle.GRADIENT_STYLE_UNSPECIFIED) {
                    GradientStyle.ADAPTER.encodeWithTag(writer, 4, (int) value.getGradient_style());
                }
                if (value.getBefore_pivot_gradient() != null) {
                    GradientChartFillStyle.ADAPTER.encodeWithTag(writer, 5, (int) value.getBefore_pivot_gradient());
                }
                if (value.getAfter_pivot_gradient() != null) {
                    GradientChartFillStyle.ADAPTER.encodeWithTag(writer, 6, (int) value.getAfter_pivot_gradient());
                }
                if (!Float.valueOf(value.getSpeed()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 7, (int) Float.valueOf(value.getSpeed()));
                }
                CornerRadiusInfo.ADAPTER.encodeWithTag(writer, 8, (int) value.getCorner_radius_info());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GradientAnimationChartFillStyle value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                CornerRadiusInfo.ADAPTER.encodeWithTag(writer, 8, (int) value.getCorner_radius_info());
                Float fValueOf = Float.valueOf(value.getSpeed());
                Float fValueOf2 = Float.valueOf(0.0f);
                if (!fValueOf.equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 7, (int) Float.valueOf(value.getSpeed()));
                }
                if (value.getAfter_pivot_gradient() != null) {
                    GradientChartFillStyle.ADAPTER.encodeWithTag(writer, 6, (int) value.getAfter_pivot_gradient());
                }
                if (value.getBefore_pivot_gradient() != null) {
                    GradientChartFillStyle.ADAPTER.encodeWithTag(writer, 5, (int) value.getBefore_pivot_gradient());
                }
                if (value.getGradient_style() != GradientStyle.GRADIENT_STYLE_UNSPECIFIED) {
                    GradientStyle.ADAPTER.encodeWithTag(writer, 4, (int) value.getGradient_style());
                }
                if (!Float.valueOf(value.getBase_color_opacity()).equals(fValueOf2)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getBase_color_opacity()));
                }
                if (value.getBase_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getBase_color());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GradientAnimationChartFillStyle decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                GradientStyle gradientStyle = GradientStyle.GRADIENT_STYLE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                GradientChartFillStyle gradientChartFillStyleDecode = null;
                GradientChartFillStyle gradientChartFillStyleDecode2 = null;
                CornerRadiusInfo cornerRadiusInfoDecode = null;
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                GradientStyle gradientStyleDecode = gradientStyle;
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 3:
                                fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 4:
                                try {
                                    gradientStyleDecode = GradientStyle.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                gradientChartFillStyleDecode = GradientChartFillStyle.ADAPTER.decode(reader);
                                break;
                            case 6:
                                gradientChartFillStyleDecode2 = GradientChartFillStyle.ADAPTER.decode(reader);
                                break;
                            case 7:
                                fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 8:
                                cornerRadiusInfoDecode = CornerRadiusInfo.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GradientAnimationChartFillStyle(strDecode, themedColorDecode, fFloatValue, gradientStyleDecode, gradientChartFillStyleDecode, gradientChartFillStyleDecode2, fFloatValue2, cornerRadiusInfoDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GradientAnimationChartFillStyle redact(GradientAnimationChartFillStyle value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor base_color = value.getBase_color();
                ThemedColor themedColorRedact = base_color != null ? ThemedColor.ADAPTER.redact(base_color) : null;
                GradientChartFillStyle before_pivot_gradient = value.getBefore_pivot_gradient();
                GradientChartFillStyle gradientChartFillStyleRedact = before_pivot_gradient != null ? GradientChartFillStyle.ADAPTER.redact(before_pivot_gradient) : null;
                GradientChartFillStyle after_pivot_gradient = value.getAfter_pivot_gradient();
                GradientChartFillStyle gradientChartFillStyleRedact2 = after_pivot_gradient != null ? GradientChartFillStyle.ADAPTER.redact(after_pivot_gradient) : null;
                CornerRadiusInfo corner_radius_info = value.getCorner_radius_info();
                return GradientAnimationChartFillStyle.copy$default(value, null, themedColorRedact, 0.0f, null, gradientChartFillStyleRedact, gradientChartFillStyleRedact2, 0.0f, corner_radius_info != null ? CornerRadiusInfo.ADAPTER.redact(corner_radius_info) : null, ByteString.EMPTY, 77, null);
            }
        };
    }
}

package microgram.p507ui.sdui;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B]\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b3\u0010)\u001a\u0004\b2\u0010'R \u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010*\u0012\u0004\b5\u0010)\u001a\u0004\b4\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108¨\u0006;"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiGradientChartFillStyle;", "Lmicrogram/ui/sdui/SduiChartFillStyle;", "", "seen1", "Lmicrogram/ui/sdui/SduiThemedColor;", "endColor", "", "endColorOpacity", "Lmicrogram/ui/sdui/SduiGradientStyle;", "gradientStyle", "startColor", "startColorOpacity", "Lmicrogram/ui/sdui/SduiChartFillType;", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiThemedColor;DLmicrogram/ui/sdui/SduiGradientStyle;Lmicrogram/ui/sdui/SduiThemedColor;DLmicrogram/ui/sdui/SduiChartFillType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiGradientChartFillStyle;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getEndColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getEndColor$annotations", "()V", "D", "getEndColorOpacity", "()D", "getEndColorOpacity$annotations", "Lmicrogram/ui/sdui/SduiGradientStyle;", "getGradientStyle", "()Lmicrogram/ui/sdui/SduiGradientStyle;", "getGradientStyle$annotations", "getStartColor", "getStartColor$annotations", "getStartColorOpacity", "getStartColorOpacity$annotations", "Lmicrogram/ui/sdui/SduiChartFillType;", "getType", "()Lmicrogram/ui/sdui/SduiChartFillType;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiGradientChartFillStyle extends SduiChartFillStyle {
    private final SduiThemedColor endColor;
    private final double endColorOpacity;
    private final SduiGradientStyle gradientStyle;
    private final SduiThemedColor startColor;
    private final double startColorOpacity;
    private final SduiChartFillType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, SduiGradientStyle.INSTANCE.serializer(), null, null, SduiChartFillType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiGradientChartFillStyle)) {
            return false;
        }
        SduiGradientChartFillStyle sduiGradientChartFillStyle = (SduiGradientChartFillStyle) other;
        return Intrinsics.areEqual(this.endColor, sduiGradientChartFillStyle.endColor) && Double.compare(this.endColorOpacity, sduiGradientChartFillStyle.endColorOpacity) == 0 && this.gradientStyle == sduiGradientChartFillStyle.gradientStyle && Intrinsics.areEqual(this.startColor, sduiGradientChartFillStyle.startColor) && Double.compare(this.startColorOpacity, sduiGradientChartFillStyle.startColorOpacity) == 0 && this.type == sduiGradientChartFillStyle.type;
    }

    public int hashCode() {
        return (((((((((this.endColor.hashCode() * 31) + Double.hashCode(this.endColorOpacity)) * 31) + this.gradientStyle.hashCode()) * 31) + this.startColor.hashCode()) * 31) + Double.hashCode(this.startColorOpacity)) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "SduiGradientChartFillStyle(endColor=" + this.endColor + ", endColorOpacity=" + this.endColorOpacity + ", gradientStyle=" + this.gradientStyle + ", startColor=" + this.startColor + ", startColorOpacity=" + this.startColorOpacity + ", type=" + this.type + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiGradientChartFillStyle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiGradientChartFillStyle;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiGradientChartFillStyle> serializer() {
            return SduiGradientChartFillStyle$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiGradientChartFillStyle(int i, @SerialName("end_color") SduiThemedColor sduiThemedColor, @SerialName("end_color_opacity") double d, @SerialName("gradient_style") SduiGradientStyle sduiGradientStyle, @SerialName("start_color") SduiThemedColor sduiThemedColor2, @SerialName("start_color_opacity") double d2, SduiChartFillType sduiChartFillType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (9 != (i & 9)) {
            PluginExceptions.throwMissingFieldException(i, 9, SduiGradientChartFillStyle$$serializer.INSTANCE.getDescriptor());
        }
        this.endColor = sduiThemedColor;
        if ((i & 2) == 0) {
            this.endColorOpacity = 1.0d;
        } else {
            this.endColorOpacity = d;
        }
        if ((i & 4) == 0) {
            this.gradientStyle = SduiGradientStyle.TOP_TO_BOTTOM;
        } else {
            this.gradientStyle = sduiGradientStyle;
        }
        this.startColor = sduiThemedColor2;
        if ((i & 16) == 0) {
            this.startColorOpacity = 1.0d;
        } else {
            this.startColorOpacity = d2;
        }
        if ((i & 32) == 0) {
            this.type = SduiChartFillType.GRADIENT;
        } else {
            this.type = sduiChartFillType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiGradientChartFillStyle self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, sduiThemedColor$$serializer, self.endColor);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Double.compare(self.endColorOpacity, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.endColorOpacity);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.gradientStyle != SduiGradientStyle.TOP_TO_BOTTOM) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.gradientStyle);
        }
        output.encodeSerializableElement(serialDesc, 3, sduiThemedColor$$serializer, self.startColor);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || Double.compare(self.startColorOpacity, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 4, self.startColorOpacity);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.type == SduiChartFillType.GRADIENT) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.type);
    }
}

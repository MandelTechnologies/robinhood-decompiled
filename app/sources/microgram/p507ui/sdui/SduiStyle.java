package microgram.p507ui.sdui;

import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Deprecated;
import kotlin.Metadata;
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
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221BE\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100¨\u00063"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiStyle;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiThemedColor;", ResourceTypes.COLOR, "Lmicrogram/ui/sdui/SduiLinearGradientColor;", "gradientColor", "Lmicrogram/ui/sdui/SduiLineType;", "lineType", "", "opacity", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiLinearGradientColor;Lmicrogram/ui/sdui/SduiLineType;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiStyle;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "Lmicrogram/ui/sdui/SduiLinearGradientColor;", "getGradientColor", "()Lmicrogram/ui/sdui/SduiLinearGradientColor;", "getGradientColor$annotations", "()V", "Lmicrogram/ui/sdui/SduiLineType;", "getLineType", "()Lmicrogram/ui/sdui/SduiLineType;", "getLineType$annotations", "D", "getOpacity", "()D", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiThemedColor color;
    private final SduiLinearGradientColor gradientColor;
    private final SduiLineType lineType;
    private final double opacity;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiStyle)) {
            return false;
        }
        SduiStyle sduiStyle = (SduiStyle) other;
        return Intrinsics.areEqual(this.color, sduiStyle.color) && Intrinsics.areEqual(this.gradientColor, sduiStyle.gradientColor) && Intrinsics.areEqual(this.lineType, sduiStyle.lineType) && Double.compare(this.opacity, sduiStyle.opacity) == 0;
    }

    public int hashCode() {
        int iHashCode = this.color.hashCode() * 31;
        SduiLinearGradientColor sduiLinearGradientColor = this.gradientColor;
        return ((((iHashCode + (sduiLinearGradientColor == null ? 0 : sduiLinearGradientColor.hashCode())) * 31) + this.lineType.hashCode()) * 31) + Double.hashCode(this.opacity);
    }

    public String toString() {
        return "SduiStyle(color=" + this.color + ", gradientColor=" + this.gradientColor + ", lineType=" + this.lineType + ", opacity=" + this.opacity + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiStyle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiStyle;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiStyle> serializer() {
            return SduiStyle$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiStyle(int i, SduiThemedColor sduiThemedColor, @SerialName("gradient_color") SduiLinearGradientColor sduiLinearGradientColor, @SerialName("line_type") SduiLineType sduiLineType, double d, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i & 13)) {
            PluginExceptions.throwMissingFieldException(i, 13, SduiStyle$$serializer.INSTANCE.getDescriptor());
        }
        this.color = sduiThemedColor;
        if ((i & 2) == 0) {
            this.gradientColor = null;
        } else {
            this.gradientColor = sduiLinearGradientColor;
        }
        this.lineType = sduiLineType;
        this.opacity = d;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiStyle self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.color);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.gradientColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiLinearGradientColor$$serializer.INSTANCE, self.gradientColor);
        }
        output.encodeSerializableElement(serialDesc, 2, SduiLineTypeSerializer.INSTANCE, self.lineType);
        output.encodeDoubleElement(serialDesc, 3, self.opacity);
    }
}

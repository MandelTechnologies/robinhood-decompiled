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
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232BM\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010(\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010*R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b.\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101¨\u00064"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiDottedChartFillStyle;", "Lmicrogram/ui/sdui/SduiChartFillStyle;", "", "seen1", "Lmicrogram/ui/sdui/SduiThemedColor;", "dotColor", "", "dotDistance", "dotSize", "opacity", "Lmicrogram/ui/sdui/SduiChartFillType;", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiThemedColor;DDDLmicrogram/ui/sdui/SduiChartFillType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiDottedChartFillStyle;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getDotColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getDotColor$annotations", "()V", "D", "getDotDistance", "()D", "getDotDistance$annotations", "getDotSize", "getDotSize$annotations", "getOpacity", "Lmicrogram/ui/sdui/SduiChartFillType;", "getType", "()Lmicrogram/ui/sdui/SduiChartFillType;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiDottedChartFillStyle extends SduiChartFillStyle {
    private final SduiThemedColor dotColor;
    private final double dotDistance;
    private final double dotSize;
    private final double opacity;
    private final SduiChartFillType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, SduiChartFillType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiDottedChartFillStyle)) {
            return false;
        }
        SduiDottedChartFillStyle sduiDottedChartFillStyle = (SduiDottedChartFillStyle) other;
        return Intrinsics.areEqual(this.dotColor, sduiDottedChartFillStyle.dotColor) && Double.compare(this.dotDistance, sduiDottedChartFillStyle.dotDistance) == 0 && Double.compare(this.dotSize, sduiDottedChartFillStyle.dotSize) == 0 && Double.compare(this.opacity, sduiDottedChartFillStyle.opacity) == 0 && this.type == sduiDottedChartFillStyle.type;
    }

    public int hashCode() {
        return (((((((this.dotColor.hashCode() * 31) + Double.hashCode(this.dotDistance)) * 31) + Double.hashCode(this.dotSize)) * 31) + Double.hashCode(this.opacity)) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "SduiDottedChartFillStyle(dotColor=" + this.dotColor + ", dotDistance=" + this.dotDistance + ", dotSize=" + this.dotSize + ", opacity=" + this.opacity + ", type=" + this.type + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiDottedChartFillStyle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiDottedChartFillStyle;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiDottedChartFillStyle> serializer() {
            return SduiDottedChartFillStyle$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiDottedChartFillStyle(int i, @SerialName("dot_color") SduiThemedColor sduiThemedColor, @SerialName("dot_distance") double d, @SerialName("dot_size") double d2, double d3, SduiChartFillType sduiChartFillType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, SduiDottedChartFillStyle$$serializer.INSTANCE.getDescriptor());
        }
        this.dotColor = sduiThemedColor;
        if ((i & 2) == 0) {
            this.dotDistance = 1.0d;
        } else {
            this.dotDistance = d;
        }
        if ((i & 4) == 0) {
            this.dotSize = 1.0d;
        } else {
            this.dotSize = d2;
        }
        if ((i & 8) == 0) {
            this.opacity = 1.0d;
        } else {
            this.opacity = d3;
        }
        if ((i & 16) == 0) {
            this.type = SduiChartFillType.DOTTED;
        } else {
            this.type = sduiChartFillType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiDottedChartFillStyle self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.dotColor);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Double.compare(self.dotDistance, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.dotDistance);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Double.compare(self.dotSize, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 2, self.dotSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || Double.compare(self.opacity, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 3, self.opacity);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.type == SduiChartFillType.DOTTED) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.type);
    }
}

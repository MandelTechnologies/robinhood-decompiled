package microgram.p507ui.sdui;

import com.robinhood.utils.extensions.ResourceTypes;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;Bc\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\f\u001a\u00020\b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001eR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b3\u0010/\u001a\u0004\b1\u00102R \u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010+\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010-R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\b9\u0010/\u001a\u0004\b7\u00108R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b:\u0010-¨\u0006="}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartPulsingDot;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiThemedColor;", ResourceTypes.COLOR, "", "id", "", "pulseDuration", "Lmicrogram/ui/sdui/SduiChartPulseFrequency;", "pulseFrequency", "pulseScale", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "size", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/String;DLmicrogram/ui/sdui/SduiChartPulseFrequency;DLmicrogram/ui/sdui/SduiComponentType;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiChartPulsingDot;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "Ljava/lang/String;", "getId", "D", "getPulseDuration", "()D", "getPulseDuration$annotations", "()V", "Lmicrogram/ui/sdui/SduiChartPulseFrequency;", "getPulseFrequency", "()Lmicrogram/ui/sdui/SduiChartPulseFrequency;", "getPulseFrequency$annotations", "getPulseScale", "getPulseScale$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "getSize", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiChartPulsingDot extends SduiComponent {
    private final SduiThemedColor color;
    private final String id;
    private final double pulseDuration;
    private final SduiChartPulseFrequency pulseFrequency;
    private final double pulseScale;
    private final SduiComponentType sduiComponentType;
    private final double size;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiChartPulseFrequency.INSTANCE.serializer(), null, SduiComponentType.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiChartPulsingDot)) {
            return false;
        }
        SduiChartPulsingDot sduiChartPulsingDot = (SduiChartPulsingDot) other;
        return Intrinsics.areEqual(this.color, sduiChartPulsingDot.color) && Intrinsics.areEqual(this.id, sduiChartPulsingDot.id) && Double.compare(this.pulseDuration, sduiChartPulsingDot.pulseDuration) == 0 && this.pulseFrequency == sduiChartPulsingDot.pulseFrequency && Double.compare(this.pulseScale, sduiChartPulsingDot.pulseScale) == 0 && this.sduiComponentType == sduiChartPulsingDot.sduiComponentType && Double.compare(this.size, sduiChartPulsingDot.size) == 0;
    }

    public int hashCode() {
        int iHashCode = this.color.hashCode() * 31;
        String str = this.id;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.pulseDuration)) * 31) + this.pulseFrequency.hashCode()) * 31) + Double.hashCode(this.pulseScale)) * 31) + this.sduiComponentType.hashCode()) * 31) + Double.hashCode(this.size);
    }

    public String toString() {
        return "SduiChartPulsingDot(color=" + this.color + ", id=" + this.id + ", pulseDuration=" + this.pulseDuration + ", pulseFrequency=" + this.pulseFrequency + ", pulseScale=" + this.pulseScale + ", sduiComponentType=" + this.sduiComponentType + ", size=" + this.size + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartPulsingDot$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiChartPulsingDot;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiChartPulsingDot> serializer() {
            return SduiChartPulsingDot$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiChartPulsingDot(int i, SduiThemedColor sduiThemedColor, String str, @SerialName("pulse_duration") double d, @SerialName("pulse_frequency") SduiChartPulseFrequency sduiChartPulseFrequency, @SerialName("pulse_scale") double d2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, double d3, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, SduiChartPulsingDot$$serializer.INSTANCE.getDescriptor());
        }
        this.color = sduiThemedColor;
        if ((i & 2) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 4) == 0) {
            this.pulseDuration = 1.0d;
        } else {
            this.pulseDuration = d;
        }
        if ((i & 8) == 0) {
            this.pulseFrequency = SduiChartPulseFrequency.AUTOMATIC;
        } else {
            this.pulseFrequency = sduiChartPulseFrequency;
        }
        if ((i & 16) == 0) {
            this.pulseScale = 5.0d;
        } else {
            this.pulseScale = d2;
        }
        if ((i & 32) == 0) {
            this.sduiComponentType = SduiComponentType.CHART_PULSING_DOT;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 64) == 0) {
            this.size = 6.0d;
        } else {
            this.size = d3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiChartPulsingDot self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.color);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Double.compare(self.pulseDuration, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 2, self.pulseDuration);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.pulseFrequency != SduiChartPulseFrequency.AUTOMATIC) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.pulseFrequency);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || Double.compare(self.pulseScale, 5.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 4, self.pulseScale);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.sduiComponentType != SduiComponentType.CHART_PULSING_DOT) {
            output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.sduiComponentType);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && Double.compare(self.size, 6.0d) == 0) {
            return;
        }
        output.encodeDoubleElement(serialDesc, 6, self.size);
    }
}

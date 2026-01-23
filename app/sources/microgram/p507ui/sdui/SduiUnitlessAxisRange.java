package microgram.p507ui.sdui;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-BC\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiUnitlessAxisRange;", "Lmicrogram/ui/sdui/SduiChartAxisRange;", "", "seen1", "", "maxValue", "minValue", "scrubbingIncrement", "Lmicrogram/ui/sdui/SduiChartAxisType;", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(IDDDLmicrogram/ui/sdui/SduiChartAxisType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiUnitlessAxisRange;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getMaxValue", "()D", "getMaxValue$annotations", "()V", "getMinValue", "getMinValue$annotations", "getScrubbingIncrement", "getScrubbingIncrement$annotations", "Lmicrogram/ui/sdui/SduiChartAxisType;", "getType", "()Lmicrogram/ui/sdui/SduiChartAxisType;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiUnitlessAxisRange extends SduiChartAxisRange {
    private final double maxValue;
    private final double minValue;
    private final double scrubbingIncrement;
    private final SduiChartAxisType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiChartAxisType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiUnitlessAxisRange)) {
            return false;
        }
        SduiUnitlessAxisRange sduiUnitlessAxisRange = (SduiUnitlessAxisRange) other;
        return Double.compare(this.maxValue, sduiUnitlessAxisRange.maxValue) == 0 && Double.compare(this.minValue, sduiUnitlessAxisRange.minValue) == 0 && Double.compare(this.scrubbingIncrement, sduiUnitlessAxisRange.scrubbingIncrement) == 0 && this.type == sduiUnitlessAxisRange.type;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.maxValue) * 31) + Double.hashCode(this.minValue)) * 31) + Double.hashCode(this.scrubbingIncrement)) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "SduiUnitlessAxisRange(maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", scrubbingIncrement=" + this.scrubbingIncrement + ", type=" + this.type + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiUnitlessAxisRange$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiUnitlessAxisRange;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiUnitlessAxisRange> serializer() {
            return SduiUnitlessAxisRange$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiUnitlessAxisRange(int i, @SerialName("max_value") double d, @SerialName("min_value") double d2, @SerialName("scrubbing_increment") double d3, SduiChartAxisType sduiChartAxisType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, SduiUnitlessAxisRange$$serializer.INSTANCE.getDescriptor());
        }
        this.maxValue = d;
        this.minValue = d2;
        if ((i & 4) == 0) {
            this.scrubbingIncrement = 0.01d;
        } else {
            this.scrubbingIncrement = d3;
        }
        if ((i & 8) == 0) {
            this.type = SduiChartAxisType.UNITLESS;
        } else {
            this.type = sduiChartAxisType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiUnitlessAxisRange self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeDoubleElement(serialDesc, 0, self.maxValue);
        output.encodeDoubleElement(serialDesc, 1, self.minValue);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Double.compare(self.scrubbingIncrement, 0.01d) != 0) {
            output.encodeDoubleElement(serialDesc, 2, self.scrubbingIncrement);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.type == SduiChartAxisType.UNITLESS) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.type);
    }
}

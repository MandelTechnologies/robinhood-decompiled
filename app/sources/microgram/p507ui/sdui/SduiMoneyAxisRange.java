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
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-BI\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMoneyAxisRange;", "Lmicrogram/ui/sdui/SduiChartAxisRange;", "", "seen1", "Lmicrogram/ui/sdui/SduiMoney;", "maxValue", "minValue", "scrubbingIncrement", "Lmicrogram/ui/sdui/SduiChartAxisType;", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiMoney;Lmicrogram/ui/sdui/SduiMoney;Lmicrogram/ui/sdui/SduiMoney;Lmicrogram/ui/sdui/SduiChartAxisType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiMoneyAxisRange;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiMoney;", "getMaxValue", "()Lmicrogram/ui/sdui/SduiMoney;", "getMaxValue$annotations", "()V", "getMinValue", "getMinValue$annotations", "getScrubbingIncrement", "getScrubbingIncrement$annotations", "Lmicrogram/ui/sdui/SduiChartAxisType;", "getType", "()Lmicrogram/ui/sdui/SduiChartAxisType;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiMoneyAxisRange extends SduiChartAxisRange {
    private final SduiMoney maxValue;
    private final SduiMoney minValue;
    private final SduiMoney scrubbingIncrement;
    private final SduiChartAxisType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiChartAxisType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiMoneyAxisRange)) {
            return false;
        }
        SduiMoneyAxisRange sduiMoneyAxisRange = (SduiMoneyAxisRange) other;
        return Intrinsics.areEqual(this.maxValue, sduiMoneyAxisRange.maxValue) && Intrinsics.areEqual(this.minValue, sduiMoneyAxisRange.minValue) && Intrinsics.areEqual(this.scrubbingIncrement, sduiMoneyAxisRange.scrubbingIncrement) && this.type == sduiMoneyAxisRange.type;
    }

    public int hashCode() {
        return (((((this.maxValue.hashCode() * 31) + this.minValue.hashCode()) * 31) + this.scrubbingIncrement.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "SduiMoneyAxisRange(maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", scrubbingIncrement=" + this.scrubbingIncrement + ", type=" + this.type + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMoneyAxisRange$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiMoneyAxisRange;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiMoneyAxisRange> serializer() {
            return SduiMoneyAxisRange$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiMoneyAxisRange(int i, @SerialName("max_value") SduiMoney sduiMoney, @SerialName("min_value") SduiMoney sduiMoney2, @SerialName("scrubbing_increment") SduiMoney sduiMoney3, SduiChartAxisType sduiChartAxisType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, SduiMoneyAxisRange$$serializer.INSTANCE.getDescriptor());
        }
        this.maxValue = sduiMoney;
        this.minValue = sduiMoney2;
        if ((i & 4) == 0) {
            this.scrubbingIncrement = new SduiMoney("0.01", "USD", "1072fc76-1862-41ab-82c2-485837590762");
        } else {
            this.scrubbingIncrement = sduiMoney3;
        }
        if ((i & 8) == 0) {
            this.type = SduiChartAxisType.MONEY;
        } else {
            this.type = sduiChartAxisType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiMoneyAxisRange self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        SduiMoney$$serializer sduiMoney$$serializer = SduiMoney$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, sduiMoney$$serializer, self.maxValue);
        output.encodeSerializableElement(serialDesc, 1, sduiMoney$$serializer, self.minValue);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.scrubbingIncrement, new SduiMoney("0.01", "USD", "1072fc76-1862-41ab-82c2-485837590762"))) {
            output.encodeSerializableElement(serialDesc, 2, sduiMoney$$serializer, self.scrubbingIncrement);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.type == SduiChartAxisType.MONEY) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.type);
    }
}

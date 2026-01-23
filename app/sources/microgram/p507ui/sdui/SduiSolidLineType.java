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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiSolidLineType;", "Lmicrogram/ui/sdui/SduiLineType;", "Lmicrogram/ui/sdui/SduiLineCapStyle;", "capStyle", "", "strokeWidth", "Lmicrogram/ui/sdui/SduiLineStyle;", "type", "<init>", "(Lmicrogram/ui/sdui/SduiLineCapStyle;DLmicrogram/ui/sdui/SduiLineStyle;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/sdui/SduiLineCapStyle;DLmicrogram/ui/sdui/SduiLineStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiSolidLineType;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiLineCapStyle;", "getCapStyle", "()Lmicrogram/ui/sdui/SduiLineCapStyle;", "getCapStyle$annotations", "()V", "D", "getStrokeWidth", "()D", "getStrokeWidth$annotations", "Lmicrogram/ui/sdui/SduiLineStyle;", "getType", "()Lmicrogram/ui/sdui/SduiLineStyle;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiSolidLineType extends SduiLineType {
    private final SduiLineCapStyle capStyle;
    private final double strokeWidth;
    private final SduiLineStyle type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {SduiLineCapStyle.INSTANCE.serializer(), null, SduiLineStyle.INSTANCE.serializer()};

    public SduiSolidLineType() {
        this((SduiLineCapStyle) null, 0.0d, (SduiLineStyle) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiSolidLineType)) {
            return false;
        }
        SduiSolidLineType sduiSolidLineType = (SduiSolidLineType) other;
        return this.capStyle == sduiSolidLineType.capStyle && Double.compare(this.strokeWidth, sduiSolidLineType.strokeWidth) == 0 && this.type == sduiSolidLineType.type;
    }

    public int hashCode() {
        return (((this.capStyle.hashCode() * 31) + Double.hashCode(this.strokeWidth)) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "SduiSolidLineType(capStyle=" + this.capStyle + ", strokeWidth=" + this.strokeWidth + ", type=" + this.type + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiSolidLineType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiSolidLineType;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiSolidLineType> serializer() {
            return SduiSolidLineType$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiSolidLineType(int i, @SerialName("cap_style") SduiLineCapStyle sduiLineCapStyle, @SerialName("stroke_width") double d, SduiLineStyle sduiLineStyle, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.capStyle = (i & 1) == 0 ? SduiLineCapStyle.ROUND : sduiLineCapStyle;
        if ((i & 2) == 0) {
            this.strokeWidth = 1.5d;
        } else {
            this.strokeWidth = d;
        }
        if ((i & 4) == 0) {
            this.type = SduiLineStyle.SOLID;
        } else {
            this.type = sduiLineStyle;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiSolidLineType self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.capStyle != SduiLineCapStyle.ROUND) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.capStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Double.compare(self.strokeWidth, 1.5d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.strokeWidth);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.type == SduiLineStyle.SOLID) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.type);
    }

    public /* synthetic */ SduiSolidLineType(SduiLineCapStyle sduiLineCapStyle, double d, SduiLineStyle sduiLineStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SduiLineCapStyle.ROUND : sduiLineCapStyle, (i & 2) != 0 ? 1.5d : d, (i & 4) != 0 ? SduiLineStyle.SOLID : sduiLineStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SduiSolidLineType(SduiLineCapStyle capStyle, double d, SduiLineStyle type2) {
        super(null);
        Intrinsics.checkNotNullParameter(capStyle, "capStyle");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.capStyle = capStyle;
        this.strokeWidth = d;
        this.type = type2;
    }
}

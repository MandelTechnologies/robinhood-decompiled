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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.BC\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u001aR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartAxisLabel;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiThemedColor;", ResourceTypes.COLOR, "", "text", "Lmicrogram/ui/sdui/SduiTextStyle;", "textStyle", "", "value", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/String;Lmicrogram/ui/sdui/SduiTextStyle;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiChartAxisLabel;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "Ljava/lang/String;", "getText", "Lmicrogram/ui/sdui/SduiTextStyle;", "getTextStyle", "()Lmicrogram/ui/sdui/SduiTextStyle;", "getTextStyle$annotations", "()V", "D", "getValue", "()D", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiChartAxisLabel {
    private final SduiThemedColor color;
    private final String text;
    private final SduiTextStyle textStyle;
    private final double value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, SduiTextStyle.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiChartAxisLabel)) {
            return false;
        }
        SduiChartAxisLabel sduiChartAxisLabel = (SduiChartAxisLabel) other;
        return Intrinsics.areEqual(this.color, sduiChartAxisLabel.color) && Intrinsics.areEqual(this.text, sduiChartAxisLabel.text) && this.textStyle == sduiChartAxisLabel.textStyle && Double.compare(this.value, sduiChartAxisLabel.value) == 0;
    }

    public int hashCode() {
        return (((((this.color.hashCode() * 31) + this.text.hashCode()) * 31) + this.textStyle.hashCode()) * 31) + Double.hashCode(this.value);
    }

    public String toString() {
        return "SduiChartAxisLabel(color=" + this.color + ", text=" + this.text + ", textStyle=" + this.textStyle + ", value=" + this.value + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartAxisLabel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiChartAxisLabel;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiChartAxisLabel> serializer() {
            return SduiChartAxisLabel$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiChartAxisLabel(int i, SduiThemedColor sduiThemedColor, String str, @SerialName("text_style") SduiTextStyle sduiTextStyle, double d, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptions.throwMissingFieldException(i, 15, SduiChartAxisLabel$$serializer.INSTANCE.getDescriptor());
        }
        this.color = sduiThemedColor;
        this.text = str;
        this.textStyle = sduiTextStyle;
        this.value = d;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiChartAxisLabel self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.color);
        output.encodeStringElement(serialDesc, 1, self.text);
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.textStyle);
        output.encodeDoubleElement(serialDesc, 3, self.value);
    }
}

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
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B[\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b'\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b(\u0010\u001bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\"\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010$R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.¨\u00062"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartLegendItem;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiThemedColor;", ResourceTypes.COLOR, "", "id", "title", "value", "valueColor", "Lmicrogram/ui/sdui/SduiDisplayText;", "valueSuffix", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiDisplayText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiChartLegendItem;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "Ljava/lang/String;", "getId", "getTitle", "getValue", "getValueColor", "getValueColor$annotations", "()V", "Lmicrogram/ui/sdui/SduiDisplayText;", "getValueSuffix", "()Lmicrogram/ui/sdui/SduiDisplayText;", "getValueSuffix$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiChartLegendItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiThemedColor color;
    private final String id;
    private final String title;
    private final String value;
    private final SduiThemedColor valueColor;
    private final SduiDisplayText valueSuffix;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiChartLegendItem)) {
            return false;
        }
        SduiChartLegendItem sduiChartLegendItem = (SduiChartLegendItem) other;
        return Intrinsics.areEqual(this.color, sduiChartLegendItem.color) && Intrinsics.areEqual(this.id, sduiChartLegendItem.id) && Intrinsics.areEqual(this.title, sduiChartLegendItem.title) && Intrinsics.areEqual(this.value, sduiChartLegendItem.value) && Intrinsics.areEqual(this.valueColor, sduiChartLegendItem.valueColor) && Intrinsics.areEqual(this.valueSuffix, sduiChartLegendItem.valueSuffix);
    }

    public int hashCode() {
        SduiThemedColor sduiThemedColor = this.color;
        int iHashCode = (((((((((sduiThemedColor == null ? 0 : sduiThemedColor.hashCode()) * 31) + this.id.hashCode()) * 31) + this.title.hashCode()) * 31) + this.value.hashCode()) * 31) + this.valueColor.hashCode()) * 31;
        SduiDisplayText sduiDisplayText = this.valueSuffix;
        return iHashCode + (sduiDisplayText != null ? sduiDisplayText.hashCode() : 0);
    }

    public String toString() {
        return "SduiChartLegendItem(color=" + this.color + ", id=" + this.id + ", title=" + this.title + ", value=" + this.value + ", valueColor=" + this.valueColor + ", valueSuffix=" + this.valueSuffix + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartLegendItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiChartLegendItem;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiChartLegendItem> serializer() {
            return SduiChartLegendItem$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiChartLegendItem(int i, SduiThemedColor sduiThemedColor, String str, String str2, String str3, @SerialName("value_color") SduiThemedColor sduiThemedColor2, @SerialName("value_suffix") SduiDisplayText sduiDisplayText, SerializationConstructorMarker serializationConstructorMarker) {
        if (30 != (i & 30)) {
            PluginExceptions.throwMissingFieldException(i, 30, SduiChartLegendItem$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.color = null;
        } else {
            this.color = sduiThemedColor;
        }
        this.id = str;
        this.title = str2;
        this.value = str3;
        this.valueColor = sduiThemedColor2;
        if ((i & 32) == 0) {
            this.valueSuffix = null;
        } else {
            this.valueSuffix = sduiDisplayText;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiChartLegendItem self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.color != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.color);
        }
        output.encodeStringElement(serialDesc, 1, self.id);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.value);
        output.encodeSerializableElement(serialDesc, 4, SduiThemedColor$$serializer.INSTANCE, self.valueColor);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.valueSuffix == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, SduiDisplayText$$serializer.INSTANCE, self.valueSuffix);
    }
}

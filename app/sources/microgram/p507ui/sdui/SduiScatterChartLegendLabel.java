package microgram.p507ui.sdui;

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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)BG\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b&\u0010\u0018R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010!\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010#¨\u0006+"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiScatterChartLegendLabel;", "", "", "seen1", "", "subtitle", "Lmicrogram/ui/sdui/SduiThemedColor;", "subtitleColorOverride", "title", "titleColorOverride", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiScatterChartLegendLabel;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSubtitle", "Lmicrogram/ui/sdui/SduiThemedColor;", "getSubtitleColorOverride", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getSubtitleColorOverride$annotations", "()V", "getTitle", "getTitleColorOverride", "getTitleColorOverride$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiScatterChartLegendLabel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String subtitle;
    private final SduiThemedColor subtitleColorOverride;
    private final String title;
    private final SduiThemedColor titleColorOverride;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiScatterChartLegendLabel)) {
            return false;
        }
        SduiScatterChartLegendLabel sduiScatterChartLegendLabel = (SduiScatterChartLegendLabel) other;
        return Intrinsics.areEqual(this.subtitle, sduiScatterChartLegendLabel.subtitle) && Intrinsics.areEqual(this.subtitleColorOverride, sduiScatterChartLegendLabel.subtitleColorOverride) && Intrinsics.areEqual(this.title, sduiScatterChartLegendLabel.title) && Intrinsics.areEqual(this.titleColorOverride, sduiScatterChartLegendLabel.titleColorOverride);
    }

    public int hashCode() {
        String str = this.subtitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SduiThemedColor sduiThemedColor = this.subtitleColorOverride;
        int iHashCode2 = (((iHashCode + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31) + this.title.hashCode()) * 31;
        SduiThemedColor sduiThemedColor2 = this.titleColorOverride;
        return iHashCode2 + (sduiThemedColor2 != null ? sduiThemedColor2.hashCode() : 0);
    }

    public String toString() {
        return "SduiScatterChartLegendLabel(subtitle=" + this.subtitle + ", subtitleColorOverride=" + this.subtitleColorOverride + ", title=" + this.title + ", titleColorOverride=" + this.titleColorOverride + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiScatterChartLegendLabel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiScatterChartLegendLabel;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiScatterChartLegendLabel> serializer() {
            return SduiScatterChartLegendLabel$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiScatterChartLegendLabel(int i, String str, @SerialName("subtitle_color_override") SduiThemedColor sduiThemedColor, String str2, @SerialName("title_color_override") SduiThemedColor sduiThemedColor2, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptions.throwMissingFieldException(i, 4, SduiScatterChartLegendLabel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str;
        }
        if ((i & 2) == 0) {
            this.subtitleColorOverride = null;
        } else {
            this.subtitleColorOverride = sduiThemedColor;
        }
        this.title = str2;
        if ((i & 8) == 0) {
            this.titleColorOverride = null;
        } else {
            this.titleColorOverride = sduiThemedColor2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiScatterChartLegendLabel self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subtitleColorOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.subtitleColorOverride);
        }
        output.encodeStringElement(serialDesc, 2, self.title);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.titleColorOverride == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, SduiThemedColor$$serializer.INSTANCE, self.titleColorOverride);
    }
}

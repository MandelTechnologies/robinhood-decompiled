package microgram.p507ui.sdui;

import java.util.List;
import java.util.Map;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210BY\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0001\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b+\u0010%R.\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.¨\u00062"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartAxis;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiChartAxisRange;", "effectiveRange", "", "Lmicrogram/ui/sdui/SduiChartAxisLabel;", "labels", "range", "", "", "Lmicrogram/ui/sdui/SduiDisplayText;", "scrubbingLabels", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiChartAxisRange;Ljava/util/List;Lmicrogram/ui/sdui/SduiChartAxisRange;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiChartAxis;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiChartAxisRange;", "getEffectiveRange", "()Lmicrogram/ui/sdui/SduiChartAxisRange;", "getEffectiveRange$annotations", "()V", "Ljava/util/List;", "getLabels", "()Ljava/util/List;", "getRange", "Ljava/util/Map;", "getScrubbingLabels", "()Ljava/util/Map;", "getScrubbingLabels$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiChartAxis {
    private final SduiChartAxisRange effectiveRange;
    private final List<SduiChartAxisLabel> labels;
    private final SduiChartAxisRange range;
    private final Map<String, SduiDisplayText> scrubbingLabels;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SduiChartAxisLabel$$serializer.INSTANCE), null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, SduiDisplayText$$serializer.INSTANCE)};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiChartAxis)) {
            return false;
        }
        SduiChartAxis sduiChartAxis = (SduiChartAxis) other;
        return Intrinsics.areEqual(this.effectiveRange, sduiChartAxis.effectiveRange) && Intrinsics.areEqual(this.labels, sduiChartAxis.labels) && Intrinsics.areEqual(this.range, sduiChartAxis.range) && Intrinsics.areEqual(this.scrubbingLabels, sduiChartAxis.scrubbingLabels);
    }

    public int hashCode() {
        SduiChartAxisRange sduiChartAxisRange = this.effectiveRange;
        int iHashCode = (((sduiChartAxisRange == null ? 0 : sduiChartAxisRange.hashCode()) * 31) + this.labels.hashCode()) * 31;
        SduiChartAxisRange sduiChartAxisRange2 = this.range;
        int iHashCode2 = (iHashCode + (sduiChartAxisRange2 == null ? 0 : sduiChartAxisRange2.hashCode())) * 31;
        Map<String, SduiDisplayText> map = this.scrubbingLabels;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "SduiChartAxis(effectiveRange=" + this.effectiveRange + ", labels=" + this.labels + ", range=" + this.range + ", scrubbingLabels=" + this.scrubbingLabels + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartAxis$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiChartAxis;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiChartAxis> serializer() {
            return SduiChartAxis$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiChartAxis(int i, @SerialName("effective_range") SduiChartAxisRange sduiChartAxisRange, List list, SduiChartAxisRange sduiChartAxisRange2, @SerialName("scrubbing_labels") Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptions.throwMissingFieldException(i, 2, SduiChartAxis$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.effectiveRange = null;
        } else {
            this.effectiveRange = sduiChartAxisRange;
        }
        this.labels = list;
        if ((i & 4) == 0) {
            this.range = null;
        } else {
            this.range = sduiChartAxisRange2;
        }
        if ((i & 8) == 0) {
            this.scrubbingLabels = null;
        } else {
            this.scrubbingLabels = map;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiChartAxis self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.effectiveRange != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiChartAxisRangeSerializer.INSTANCE, self.effectiveRange);
        }
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.labels);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.range != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiChartAxisRangeSerializer.INSTANCE, self.range);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.scrubbingLabels == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.scrubbingLabels);
    }
}

package microgram.p507ui.sdui;

import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BAB\u0095\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u001c\b\u0001\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÁ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010-R2\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b3\u0010-R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b4\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010;\u0012\u0004\b>\u00102\u001a\u0004\b<\u0010=R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010;\u0012\u0004\b@\u00102\u001a\u0004\b?\u0010=¨\u0006C"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChart;", "", "", "seen1", "", "Lmicrogram/ui/sdui/SduiChartFill;", "fills", "", "", "Lmicrogram/ui/sdui/SduiChartLegendItem;", "legendData", "Lmicrogram/ui/sdui/SduiLine;", "lines", "Lmicrogram/ui/sdui/SduiComponent;", "overlays", "Lmicrogram/ui/sdui/SduiRichText;", "title", "", "weight", "Lmicrogram/ui/sdui/SduiChartAxis;", "xAxis", "yAxis", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lmicrogram/ui/sdui/SduiRichText;Ljava/lang/Double;Lmicrogram/ui/sdui/SduiChartAxis;Lmicrogram/ui/sdui/SduiChartAxis;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiChart;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFills", "()Ljava/util/List;", "Ljava/util/Map;", "getLegendData", "()Ljava/util/Map;", "getLegendData$annotations", "()V", "getLines", "getOverlays", "Lmicrogram/ui/sdui/SduiRichText;", "getTitle", "()Lmicrogram/ui/sdui/SduiRichText;", "Ljava/lang/Double;", "getWeight", "()Ljava/lang/Double;", "Lmicrogram/ui/sdui/SduiChartAxis;", "getXAxis", "()Lmicrogram/ui/sdui/SduiChartAxis;", "getXAxis$annotations", "getYAxis", "getYAxis$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiChart {
    private final List<SduiChartFill> fills;
    private final Map<String, List<SduiChartLegendItem>> legendData;
    private final List<SduiLine> lines;
    private final List<SduiComponent> overlays;
    private final SduiRichText title;
    private final Double weight;
    private final SduiChartAxis xAxis;
    private final SduiChartAxis yAxis;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SduiChartFill$$serializer.INSTANCE), new LinkedHashMapSerializer(StringSerializer.INSTANCE, new ArrayListSerializer(SduiChartLegendItem$$serializer.INSTANCE)), new ArrayListSerializer(SduiLine$$serializer.INSTANCE), new ArrayListSerializer(SduiComponentSerializer.INSTANCE), null, null, null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiChart)) {
            return false;
        }
        SduiChart sduiChart = (SduiChart) other;
        return Intrinsics.areEqual(this.fills, sduiChart.fills) && Intrinsics.areEqual(this.legendData, sduiChart.legendData) && Intrinsics.areEqual(this.lines, sduiChart.lines) && Intrinsics.areEqual(this.overlays, sduiChart.overlays) && Intrinsics.areEqual(this.title, sduiChart.title) && Intrinsics.areEqual((Object) this.weight, (Object) sduiChart.weight) && Intrinsics.areEqual(this.xAxis, sduiChart.xAxis) && Intrinsics.areEqual(this.yAxis, sduiChart.yAxis);
    }

    public int hashCode() {
        int iHashCode = ((((this.fills.hashCode() * 31) + this.legendData.hashCode()) * 31) + this.lines.hashCode()) * 31;
        List<SduiComponent> list = this.overlays;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        SduiRichText sduiRichText = this.title;
        int iHashCode3 = (iHashCode2 + (sduiRichText == null ? 0 : sduiRichText.hashCode())) * 31;
        Double d = this.weight;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        SduiChartAxis sduiChartAxis = this.xAxis;
        int iHashCode5 = (iHashCode4 + (sduiChartAxis == null ? 0 : sduiChartAxis.hashCode())) * 31;
        SduiChartAxis sduiChartAxis2 = this.yAxis;
        return iHashCode5 + (sduiChartAxis2 != null ? sduiChartAxis2.hashCode() : 0);
    }

    public String toString() {
        return "SduiChart(fills=" + this.fills + ", legendData=" + this.legendData + ", lines=" + this.lines + ", overlays=" + this.overlays + ", title=" + this.title + ", weight=" + this.weight + ", xAxis=" + this.xAxis + ", yAxis=" + this.yAxis + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChart$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiChart;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiChart> serializer() {
            return SduiChart$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiChart(int i, List list, @SerialName("legend_data") Map map, List list2, List list3, SduiRichText sduiRichText, Double d, @SerialName("x_axis") SduiChartAxis sduiChartAxis, @SerialName("y_axis") SduiChartAxis sduiChartAxis2, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptions.throwMissingFieldException(i, 4, SduiChart$$serializer.INSTANCE.getDescriptor());
        }
        this.fills = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) == 0) {
            this.legendData = MapsKt.emptyMap();
        } else {
            this.legendData = map;
        }
        this.lines = list2;
        if ((i & 8) == 0) {
            this.overlays = null;
        } else {
            this.overlays = list3;
        }
        if ((i & 16) == 0) {
            this.title = null;
        } else {
            this.title = sduiRichText;
        }
        if ((i & 32) == 0) {
            this.weight = null;
        } else {
            this.weight = d;
        }
        if ((i & 64) == 0) {
            this.xAxis = null;
        } else {
            this.xAxis = sduiChartAxis;
        }
        if ((i & 128) == 0) {
            this.yAxis = null;
        } else {
            this.yAxis = sduiChartAxis2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiChart self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.fills, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.fills);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.legendData, MapsKt.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.legendData);
        }
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.lines);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.overlays != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.overlays);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SduiRichText$$serializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.weight != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, DoubleSerializer.INSTANCE, self.weight);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.xAxis != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, SduiChartAxis$$serializer.INSTANCE, self.xAxis);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.yAxis == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, SduiChartAxis$$serializer.INSTANCE, self.yAxis);
    }
}

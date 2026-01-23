package microgram.p507ui.sdui;

import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>By\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u001c\b\u0001\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÁ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R2\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00100\u0012\u0004\b3\u0010/\u001a\u0004\b1\u00102R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00104\u0012\u0004\b7\u0010/\u001a\u0004\b5\u00106R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00108\u0012\u0004\b;\u0010/\u001a\u0004\b9\u0010:R\"\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00108\u0012\u0004\b=\u0010/\u001a\u0004\b<\u0010:¨\u0006@"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartGroup;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "Lmicrogram/ui/sdui/SduiChart;", "charts", "Lmicrogram/ui/sdui/SduiDisplaySpan;", "displaySpan", "", "", "Lmicrogram/ui/sdui/SduiChartLegendItem;", "legendData", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiChartAxis;", "xAxis", "yAxis", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Lmicrogram/ui/sdui/SduiDisplaySpan;Ljava/util/Map;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiChartAxis;Lmicrogram/ui/sdui/SduiChartAxis;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiChartGroup;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCharts", "()Ljava/util/List;", "Lmicrogram/ui/sdui/SduiDisplaySpan;", "getDisplaySpan", "()Lmicrogram/ui/sdui/SduiDisplaySpan;", "getDisplaySpan$annotations", "()V", "Ljava/util/Map;", "getLegendData", "()Ljava/util/Map;", "getLegendData$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiChartAxis;", "getXAxis", "()Lmicrogram/ui/sdui/SduiChartAxis;", "getXAxis$annotations", "getYAxis", "getYAxis$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiChartGroup extends SduiComponent {
    private final List<SduiChart> charts;
    private final SduiDisplaySpan displaySpan;
    private final Map<String, List<SduiChartLegendItem>> legendData;
    private final SduiComponentType sduiComponentType;
    private final SduiChartAxis xAxis;
    private final SduiChartAxis yAxis;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SduiChart$$serializer.INSTANCE), SduiDisplaySpan.INSTANCE.serializer(), new LinkedHashMapSerializer(StringSerializer.INSTANCE, new ArrayListSerializer(SduiChartLegendItem$$serializer.INSTANCE)), SduiComponentType.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiChartGroup)) {
            return false;
        }
        SduiChartGroup sduiChartGroup = (SduiChartGroup) other;
        return Intrinsics.areEqual(this.charts, sduiChartGroup.charts) && this.displaySpan == sduiChartGroup.displaySpan && Intrinsics.areEqual(this.legendData, sduiChartGroup.legendData) && this.sduiComponentType == sduiChartGroup.sduiComponentType && Intrinsics.areEqual(this.xAxis, sduiChartGroup.xAxis) && Intrinsics.areEqual(this.yAxis, sduiChartGroup.yAxis);
    }

    public int hashCode() {
        int iHashCode = ((((((this.charts.hashCode() * 31) + this.displaySpan.hashCode()) * 31) + this.legendData.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiChartAxis sduiChartAxis = this.xAxis;
        int iHashCode2 = (iHashCode + (sduiChartAxis == null ? 0 : sduiChartAxis.hashCode())) * 31;
        SduiChartAxis sduiChartAxis2 = this.yAxis;
        return iHashCode2 + (sduiChartAxis2 != null ? sduiChartAxis2.hashCode() : 0);
    }

    public String toString() {
        return "SduiChartGroup(charts=" + this.charts + ", displaySpan=" + this.displaySpan + ", legendData=" + this.legendData + ", sduiComponentType=" + this.sduiComponentType + ", xAxis=" + this.xAxis + ", yAxis=" + this.yAxis + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartGroup$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiChartGroup;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiChartGroup> serializer() {
            return SduiChartGroup$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiChartGroup(int i, List list, @SerialName("display_span") SduiDisplaySpan sduiDisplaySpan, @SerialName("legend_data") Map map, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("x_axis") SduiChartAxis sduiChartAxis, @SerialName("y_axis") SduiChartAxis sduiChartAxis2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, SduiChartGroup$$serializer.INSTANCE.getDescriptor());
        }
        this.charts = list;
        this.displaySpan = sduiDisplaySpan;
        if ((i & 4) == 0) {
            this.legendData = MapsKt.emptyMap();
        } else {
            this.legendData = map;
        }
        if ((i & 8) == 0) {
            this.sduiComponentType = SduiComponentType.CHART_GROUP;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 16) == 0) {
            this.xAxis = null;
        } else {
            this.xAxis = sduiChartAxis;
        }
        if ((i & 32) == 0) {
            this.yAxis = null;
        } else {
            this.yAxis = sduiChartAxis2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiChartGroup self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.charts);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.displaySpan);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.legendData, MapsKt.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.legendData);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.sduiComponentType != SduiComponentType.CHART_GROUP) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.xAxis != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SduiChartAxis$$serializer.INSTANCE, self.xAxis);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.yAxis == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, SduiChartAxis$$serializer.INSTANCE, self.yAxis);
    }
}

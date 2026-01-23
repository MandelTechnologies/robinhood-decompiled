package microgram.p507ui.sdui;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B]\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\"\u0012\u0004\b.\u0010&\u001a\u0004\b-\u0010$¨\u00061"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiScatterChart;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "Lmicrogram/ui/sdui/SduiScatterDataSet;", "dataSets", "", "horizontalLabels", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "verticalLabels", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;Lmicrogram/ui/sdui/SduiComponentType;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiScatterChart;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDataSets", "()Ljava/util/List;", "getDataSets$annotations", "()V", "getHorizontalLabels", "getHorizontalLabels$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "getVerticalLabels", "getVerticalLabels$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiScatterChart extends SduiComponent {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<SduiScatterDataSet> dataSets;
    private final List<String> horizontalLabels;
    private final SduiComponentType sduiComponentType;
    private final List<String> verticalLabels;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiScatterChart)) {
            return false;
        }
        SduiScatterChart sduiScatterChart = (SduiScatterChart) other;
        return Intrinsics.areEqual(this.dataSets, sduiScatterChart.dataSets) && Intrinsics.areEqual(this.horizontalLabels, sduiScatterChart.horizontalLabels) && this.sduiComponentType == sduiScatterChart.sduiComponentType && Intrinsics.areEqual(this.verticalLabels, sduiScatterChart.verticalLabels);
    }

    public int hashCode() {
        return (((((this.dataSets.hashCode() * 31) + this.horizontalLabels.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.verticalLabels.hashCode();
    }

    public String toString() {
        return "SduiScatterChart(dataSets=" + this.dataSets + ", horizontalLabels=" + this.horizontalLabels + ", sduiComponentType=" + this.sduiComponentType + ", verticalLabels=" + this.verticalLabels + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiScatterChart$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiScatterChart;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiScatterChart> serializer() {
            return SduiScatterChart$$serializer.INSTANCE;
        }
    }

    static {
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(SduiScatterDataSet$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{arrayListSerializer, new ArrayListSerializer(stringSerializer), SduiComponentType.INSTANCE.serializer(), new ArrayListSerializer(stringSerializer)};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiScatterChart(int i, @SerialName("data_sets") List list, @SerialName("horizontal_labels") List list2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("vertical_labels") List list3, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, SduiScatterChart$$serializer.INSTANCE.getDescriptor());
        }
        this.dataSets = list;
        if ((i & 2) == 0) {
            this.horizontalLabels = CollectionsKt.emptyList();
        } else {
            this.horizontalLabels = list2;
        }
        if ((i & 4) == 0) {
            this.sduiComponentType = SduiComponentType.SCATTER_CHART;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 8) == 0) {
            this.verticalLabels = CollectionsKt.emptyList();
        } else {
            this.verticalLabels = list3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiScatterChart self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.dataSets);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.horizontalLabels, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.horizontalLabels);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.sduiComponentType != SduiComponentType.SCATTER_CHART) {
            output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.sduiComponentType);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && Intrinsics.areEqual(self.verticalLabels, CollectionsKt.emptyList())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.verticalLabels);
    }
}

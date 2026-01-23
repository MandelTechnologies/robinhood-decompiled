package microgram.p507ui.sdui;

import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221BI\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.¨\u00063"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiScatterDataSet;", "", "", "seen1", "", "alpha", "Lmicrogram/ui/sdui/SduiThemedColor;", ResourceTypes.COLOR, "", "Lmicrogram/ui/sdui/SduiScatterPoint;", WebsocketGatewayConstants.DATA_KEY, "Lmicrogram/ui/sdui/SduiScatterChartLegendLabel;", "legendLabel", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(IDLmicrogram/ui/sdui/SduiThemedColor;Ljava/util/List;Lmicrogram/ui/sdui/SduiScatterChartLegendLabel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiScatterDataSet;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getAlpha", "()D", "Lmicrogram/ui/sdui/SduiThemedColor;", "getColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "Ljava/util/List;", "getData", "()Ljava/util/List;", "Lmicrogram/ui/sdui/SduiScatterChartLegendLabel;", "getLegendLabel", "()Lmicrogram/ui/sdui/SduiScatterChartLegendLabel;", "getLegendLabel$annotations", "()V", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiScatterDataSet {
    private final double alpha;
    private final SduiThemedColor color;
    private final List<SduiScatterPoint> data;
    private final SduiScatterChartLegendLabel legendLabel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(SduiScatterPoint$$serializer.INSTANCE), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiScatterDataSet)) {
            return false;
        }
        SduiScatterDataSet sduiScatterDataSet = (SduiScatterDataSet) other;
        return Double.compare(this.alpha, sduiScatterDataSet.alpha) == 0 && Intrinsics.areEqual(this.color, sduiScatterDataSet.color) && Intrinsics.areEqual(this.data, sduiScatterDataSet.data) && Intrinsics.areEqual(this.legendLabel, sduiScatterDataSet.legendLabel);
    }

    public int hashCode() {
        int iHashCode = ((((Double.hashCode(this.alpha) * 31) + this.color.hashCode()) * 31) + this.data.hashCode()) * 31;
        SduiScatterChartLegendLabel sduiScatterChartLegendLabel = this.legendLabel;
        return iHashCode + (sduiScatterChartLegendLabel == null ? 0 : sduiScatterChartLegendLabel.hashCode());
    }

    public String toString() {
        return "SduiScatterDataSet(alpha=" + this.alpha + ", color=" + this.color + ", data=" + this.data + ", legendLabel=" + this.legendLabel + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiScatterDataSet$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiScatterDataSet;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiScatterDataSet> serializer() {
            return SduiScatterDataSet$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiScatterDataSet(int i, double d, SduiThemedColor sduiThemedColor, List list, @SerialName("legend_label") SduiScatterChartLegendLabel sduiScatterChartLegendLabel, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptions.throwMissingFieldException(i, 4, SduiScatterDataSet$$serializer.INSTANCE.getDescriptor());
        }
        this.alpha = (i & 1) == 0 ? 1.0d : d;
        if ((i & 2) == 0) {
            SduiColor sduiColor = SduiColor.ACCENT;
            this.color = new SduiThemedColor(sduiColor, sduiColor);
        } else {
            this.color = sduiThemedColor;
        }
        this.data = list;
        if ((i & 8) == 0) {
            this.legendLabel = null;
        } else {
            this.legendLabel = sduiScatterChartLegendLabel;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_ui(SduiScatterDataSet self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || Double.compare(self.alpha, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 0, self.alpha);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1)) {
            output.encodeSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.color);
        } else {
            SduiThemedColor sduiThemedColor = self.color;
            SduiColor sduiColor = SduiColor.ACCENT;
            if (!Intrinsics.areEqual(sduiThemedColor, new SduiThemedColor(sduiColor, sduiColor))) {
            }
        }
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.data);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.legendLabel == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, SduiScatterChartLegendLabel$$serializer.INSTANCE, self.legendLabel);
    }
}

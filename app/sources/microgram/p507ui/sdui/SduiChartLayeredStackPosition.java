package microgram.p507ui.sdui;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.BC\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b-\u0010,¨\u00060"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartLayeredStackPosition;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiChartLayeredStackHorizontalEdge;", "horizontalEdge", "Lmicrogram/ui/sdui/SduiChartLayeredStackVerticalEdge;", "verticalEdge", "", "x", "y", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiChartLayeredStackHorizontalEdge;Lmicrogram/ui/sdui/SduiChartLayeredStackVerticalEdge;DDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiChartLayeredStackPosition;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiChartLayeredStackHorizontalEdge;", "getHorizontalEdge", "()Lmicrogram/ui/sdui/SduiChartLayeredStackHorizontalEdge;", "getHorizontalEdge$annotations", "()V", "Lmicrogram/ui/sdui/SduiChartLayeredStackVerticalEdge;", "getVerticalEdge", "()Lmicrogram/ui/sdui/SduiChartLayeredStackVerticalEdge;", "getVerticalEdge$annotations", "D", "getX", "()D", "getY", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiChartLayeredStackPosition {
    private final SduiChartLayeredStackHorizontalEdge horizontalEdge;
    private final SduiChartLayeredStackVerticalEdge verticalEdge;
    private final double x;
    private final double y;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {SduiChartLayeredStackHorizontalEdge.INSTANCE.serializer(), SduiChartLayeredStackVerticalEdge.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiChartLayeredStackPosition)) {
            return false;
        }
        SduiChartLayeredStackPosition sduiChartLayeredStackPosition = (SduiChartLayeredStackPosition) other;
        return this.horizontalEdge == sduiChartLayeredStackPosition.horizontalEdge && this.verticalEdge == sduiChartLayeredStackPosition.verticalEdge && Double.compare(this.x, sduiChartLayeredStackPosition.x) == 0 && Double.compare(this.y, sduiChartLayeredStackPosition.y) == 0;
    }

    public int hashCode() {
        return (((((this.horizontalEdge.hashCode() * 31) + this.verticalEdge.hashCode()) * 31) + Double.hashCode(this.x)) * 31) + Double.hashCode(this.y);
    }

    public String toString() {
        return "SduiChartLayeredStackPosition(horizontalEdge=" + this.horizontalEdge + ", verticalEdge=" + this.verticalEdge + ", x=" + this.x + ", y=" + this.y + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartLayeredStackPosition$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiChartLayeredStackPosition;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiChartLayeredStackPosition> serializer() {
            return SduiChartLayeredStackPosition$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiChartLayeredStackPosition(int i, @SerialName("horizontal_edge") SduiChartLayeredStackHorizontalEdge sduiChartLayeredStackHorizontalEdge, @SerialName("vertical_edge") SduiChartLayeredStackVerticalEdge sduiChartLayeredStackVerticalEdge, double d, double d2, SerializationConstructorMarker serializationConstructorMarker) {
        if (12 != (i & 12)) {
            PluginExceptions.throwMissingFieldException(i, 12, SduiChartLayeredStackPosition$$serializer.INSTANCE.getDescriptor());
        }
        this.horizontalEdge = (i & 1) == 0 ? SduiChartLayeredStackHorizontalEdge.CENTER : sduiChartLayeredStackHorizontalEdge;
        if ((i & 2) == 0) {
            this.verticalEdge = SduiChartLayeredStackVerticalEdge.CENTER;
        } else {
            this.verticalEdge = sduiChartLayeredStackVerticalEdge;
        }
        this.x = d;
        this.y = d2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiChartLayeredStackPosition self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.horizontalEdge != SduiChartLayeredStackHorizontalEdge.CENTER) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.horizontalEdge);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.verticalEdge != SduiChartLayeredStackVerticalEdge.CENTER) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.verticalEdge);
        }
        output.encodeDoubleElement(serialDesc, 2, self.x);
        output.encodeDoubleElement(serialDesc, 3, self.y);
    }
}

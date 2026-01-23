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
import microgram.p507ui.sdui.SduiEdge;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.BE\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R \u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010$\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010&¨\u00060"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiLayerConstraint;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiLayoutAxis;", "axis", "Lmicrogram/ui/sdui/SduiEdge;", "layerEdge", "", "offset", "parentEdge", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiLayoutAxis;Lmicrogram/ui/sdui/SduiEdge;DLmicrogram/ui/sdui/SduiEdge;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiLayerConstraint;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiLayoutAxis;", "getAxis", "()Lmicrogram/ui/sdui/SduiLayoutAxis;", "Lmicrogram/ui/sdui/SduiEdge;", "getLayerEdge", "()Lmicrogram/ui/sdui/SduiEdge;", "getLayerEdge$annotations", "()V", "D", "getOffset", "()D", "getParentEdge", "getParentEdge$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiLayerConstraint {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiLayoutAxis axis;
    private final SduiEdge layerEdge;
    private final double offset;
    private final SduiEdge parentEdge;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiLayerConstraint)) {
            return false;
        }
        SduiLayerConstraint sduiLayerConstraint = (SduiLayerConstraint) other;
        return this.axis == sduiLayerConstraint.axis && this.layerEdge == sduiLayerConstraint.layerEdge && Double.compare(this.offset, sduiLayerConstraint.offset) == 0 && this.parentEdge == sduiLayerConstraint.parentEdge;
    }

    public int hashCode() {
        return (((((this.axis.hashCode() * 31) + this.layerEdge.hashCode()) * 31) + Double.hashCode(this.offset)) * 31) + this.parentEdge.hashCode();
    }

    public String toString() {
        return "SduiLayerConstraint(axis=" + this.axis + ", layerEdge=" + this.layerEdge + ", offset=" + this.offset + ", parentEdge=" + this.parentEdge + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiLayerConstraint$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiLayerConstraint;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiLayerConstraint> serializer() {
            return SduiLayerConstraint$$serializer.INSTANCE;
        }
    }

    static {
        KSerializer<SduiLayoutAxis> kSerializerSerializer = SduiLayoutAxis.INSTANCE.serializer();
        SduiEdge.Companion companion = SduiEdge.INSTANCE;
        $childSerializers = new KSerializer[]{kSerializerSerializer, companion.serializer(), null, companion.serializer()};
    }

    @Deprecated
    public /* synthetic */ SduiLayerConstraint(int i, SduiLayoutAxis sduiLayoutAxis, @SerialName("layer_edge") SduiEdge sduiEdge, double d, @SerialName("parent_edge") SduiEdge sduiEdge2, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            PluginExceptions.throwMissingFieldException(i, 11, SduiLayerConstraint$$serializer.INSTANCE.getDescriptor());
        }
        this.axis = sduiLayoutAxis;
        this.layerEdge = sduiEdge;
        if ((i & 4) == 0) {
            this.offset = 0.0d;
        } else {
            this.offset = d;
        }
        this.parentEdge = sduiEdge2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiLayerConstraint self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.axis);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.layerEdge);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Double.compare(self.offset, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 2, self.offset);
        }
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.parentEdge);
    }
}

package microgram.p507ui.sdui;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiLayerConstraint.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiLayerConstraint;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiLayerConstraint$$serializer implements PluginHelperInterfaces<SduiLayerConstraint> {
    public static final SduiLayerConstraint$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiLayerConstraint$$serializer sduiLayerConstraint$$serializer = new SduiLayerConstraint$$serializer();
        INSTANCE = sduiLayerConstraint$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiLayerConstraint", sduiLayerConstraint$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("axis", false);
        pluginGeneratedSerialDescriptor.addElement("layer_edge", false);
        pluginGeneratedSerialDescriptor.addElement("offset", true);
        pluginGeneratedSerialDescriptor.addElement("parent_edge", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiLayerConstraint$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiLayerConstraint.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], DoubleSerializer.INSTANCE, kSerializerArr[3]};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiLayerConstraint deserialize(Decoding2 decoder) {
        int i;
        SduiLayoutAxis sduiLayoutAxis;
        SduiEdge sduiEdge;
        SduiEdge sduiEdge2;
        double d;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiLayerConstraint.$childSerializers;
        SduiLayoutAxis sduiLayoutAxis2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiLayoutAxis sduiLayoutAxis3 = (SduiLayoutAxis) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            SduiEdge sduiEdge3 = (SduiEdge) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            double dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(descriptor2, 2);
            sduiEdge2 = (SduiEdge) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            sduiLayoutAxis = sduiLayoutAxis3;
            i = 15;
            sduiEdge = sduiEdge3;
            d = dDecodeDoubleElement;
        } else {
            boolean z = true;
            int i2 = 0;
            double dDecodeDoubleElement2 = 0.0d;
            SduiEdge sduiEdge4 = null;
            SduiEdge sduiEdge5 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiLayoutAxis2 = (SduiLayoutAxis) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], sduiLayoutAxis2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiEdge4 = (SduiEdge) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], sduiEdge4);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(descriptor2, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiEdge5 = (SduiEdge) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], sduiEdge5);
                    i2 |= 8;
                }
            }
            i = i2;
            sduiLayoutAxis = sduiLayoutAxis2;
            sduiEdge = sduiEdge4;
            sduiEdge2 = sduiEdge5;
            d = dDecodeDoubleElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiLayerConstraint(i, sduiLayoutAxis, sduiEdge, d, sduiEdge2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiLayerConstraint value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiLayerConstraint.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

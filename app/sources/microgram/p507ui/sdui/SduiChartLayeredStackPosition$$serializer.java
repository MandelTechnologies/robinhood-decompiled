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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiChartLayeredStackPosition.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiChartLayeredStackPosition;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiChartLayeredStackPosition$$serializer implements PluginHelperInterfaces<SduiChartLayeredStackPosition> {
    public static final SduiChartLayeredStackPosition$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiChartLayeredStackPosition$$serializer sduiChartLayeredStackPosition$$serializer = new SduiChartLayeredStackPosition$$serializer();
        INSTANCE = sduiChartLayeredStackPosition$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiChartLayeredStackPosition", sduiChartLayeredStackPosition$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("horizontal_edge", true);
        pluginGeneratedSerialDescriptor.addElement("vertical_edge", true);
        pluginGeneratedSerialDescriptor.addElement("x", false);
        pluginGeneratedSerialDescriptor.addElement("y", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiChartLayeredStackPosition$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiChartLayeredStackPosition.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[0];
        KSerializer<?> kSerializer2 = kSerializerArr[1];
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{kSerializer, kSerializer2, doubleSerializer, doubleSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiChartLayeredStackPosition deserialize(Decoding2 decoder) {
        int i;
        SduiChartLayeredStackHorizontalEdge sduiChartLayeredStackHorizontalEdge;
        double dDecodeDoubleElement;
        double dDecodeDoubleElement2;
        SduiChartLayeredStackVerticalEdge sduiChartLayeredStackVerticalEdge;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiChartLayeredStackPosition.$childSerializers;
        int i2 = 0;
        SduiChartLayeredStackHorizontalEdge sduiChartLayeredStackHorizontalEdge2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiChartLayeredStackHorizontalEdge sduiChartLayeredStackHorizontalEdge3 = (SduiChartLayeredStackHorizontalEdge) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            sduiChartLayeredStackVerticalEdge = (SduiChartLayeredStackVerticalEdge) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            sduiChartLayeredStackHorizontalEdge = sduiChartLayeredStackHorizontalEdge3;
            i = 15;
            dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(descriptor2, 2);
            dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(descriptor2, 3);
        } else {
            double dDecodeDoubleElement3 = 0.0d;
            int i3 = 1;
            int i4 = 0;
            SduiChartLayeredStackVerticalEdge sduiChartLayeredStackVerticalEdge2 = null;
            double dDecodeDoubleElement4 = 0.0d;
            while (i3 != 0) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                int i5 = i2;
                if (iDecodeElementIndex == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        sduiChartLayeredStackVerticalEdge2 = (SduiChartLayeredStackVerticalEdge) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], sduiChartLayeredStackVerticalEdge2);
                        i4 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        dDecodeDoubleElement3 = decodingBeginStructure.decodeDoubleElement(descriptor2, 2);
                        i4 |= 4;
                    } else {
                        if (iDecodeElementIndex != 3) {
                            throw new SerializationExceptions3(iDecodeElementIndex);
                        }
                        dDecodeDoubleElement4 = decodingBeginStructure.decodeDoubleElement(descriptor2, 3);
                        i4 |= 8;
                    }
                    i2 = i5;
                } else {
                    sduiChartLayeredStackHorizontalEdge2 = (SduiChartLayeredStackHorizontalEdge) decodingBeginStructure.decodeSerializableElement(descriptor2, i5, kSerializerArr[i5], sduiChartLayeredStackHorizontalEdge2);
                    i4 |= 1;
                    i2 = i5;
                }
            }
            i = i4;
            sduiChartLayeredStackHorizontalEdge = sduiChartLayeredStackHorizontalEdge2;
            dDecodeDoubleElement = dDecodeDoubleElement3;
            dDecodeDoubleElement2 = dDecodeDoubleElement4;
            sduiChartLayeredStackVerticalEdge = sduiChartLayeredStackVerticalEdge2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiChartLayeredStackPosition(i, sduiChartLayeredStackHorizontalEdge, sduiChartLayeredStackVerticalEdge, dDecodeDoubleElement, dDecodeDoubleElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiChartLayeredStackPosition value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiChartLayeredStackPosition.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

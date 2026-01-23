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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiRecurringInsightsVisualization.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiRecurringInsightsVisualization;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiRecurringInsightsVisualization$$serializer implements PluginHelperInterfaces<SduiRecurringInsightsVisualization> {
    public static final SduiRecurringInsightsVisualization$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiRecurringInsightsVisualization$$serializer sduiRecurringInsightsVisualization$$serializer = new SduiRecurringInsightsVisualization$$serializer();
        INSTANCE = sduiRecurringInsightsVisualization$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiRecurringInsightsVisualization", sduiRecurringInsightsVisualization$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("first_data", false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("second_data", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiRecurringInsightsVisualization$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = SduiRecurringInsightsVisualization.$childSerializers[1];
        SduiRecurringInsightsVisualizationData$$serializer sduiRecurringInsightsVisualizationData$$serializer = SduiRecurringInsightsVisualizationData$$serializer.INSTANCE;
        return new KSerializer[]{sduiRecurringInsightsVisualizationData$$serializer, kSerializer, sduiRecurringInsightsVisualizationData$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiRecurringInsightsVisualization deserialize(Decoding2 decoder) {
        int i;
        SduiRecurringInsightsVisualizationData sduiRecurringInsightsVisualizationData;
        SduiComponentType sduiComponentType;
        SduiRecurringInsightsVisualizationData sduiRecurringInsightsVisualizationData2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiRecurringInsightsVisualization.$childSerializers;
        SduiRecurringInsightsVisualizationData sduiRecurringInsightsVisualizationData3 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiRecurringInsightsVisualizationData$$serializer sduiRecurringInsightsVisualizationData$$serializer = SduiRecurringInsightsVisualizationData$$serializer.INSTANCE;
            SduiRecurringInsightsVisualizationData sduiRecurringInsightsVisualizationData4 = (SduiRecurringInsightsVisualizationData) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, sduiRecurringInsightsVisualizationData$$serializer, null);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            sduiRecurringInsightsVisualizationData2 = (SduiRecurringInsightsVisualizationData) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, sduiRecurringInsightsVisualizationData$$serializer, null);
            i = 7;
            sduiRecurringInsightsVisualizationData = sduiRecurringInsightsVisualizationData4;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiComponentType sduiComponentType2 = null;
            SduiRecurringInsightsVisualizationData sduiRecurringInsightsVisualizationData5 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiRecurringInsightsVisualizationData3 = (SduiRecurringInsightsVisualizationData) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiRecurringInsightsVisualizationData$$serializer.INSTANCE, sduiRecurringInsightsVisualizationData3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], sduiComponentType2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiRecurringInsightsVisualizationData5 = (SduiRecurringInsightsVisualizationData) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, SduiRecurringInsightsVisualizationData$$serializer.INSTANCE, sduiRecurringInsightsVisualizationData5);
                    i2 |= 4;
                }
            }
            i = i2;
            sduiRecurringInsightsVisualizationData = sduiRecurringInsightsVisualizationData3;
            sduiComponentType = sduiComponentType2;
            sduiRecurringInsightsVisualizationData2 = sduiRecurringInsightsVisualizationData5;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiRecurringInsightsVisualization(i, sduiRecurringInsightsVisualizationData, sduiComponentType, sduiRecurringInsightsVisualizationData2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiRecurringInsightsVisualization value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiRecurringInsightsVisualization.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

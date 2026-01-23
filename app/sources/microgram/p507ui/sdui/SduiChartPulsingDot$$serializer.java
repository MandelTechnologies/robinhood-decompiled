package microgram.p507ui.sdui;

import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiChartPulsingDot.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiChartPulsingDot;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiChartPulsingDot$$serializer implements PluginHelperInterfaces<SduiChartPulsingDot> {
    public static final SduiChartPulsingDot$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiChartPulsingDot$$serializer sduiChartPulsingDot$$serializer = new SduiChartPulsingDot$$serializer();
        INSTANCE = sduiChartPulsingDot$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiChartPulsingDot", sduiChartPulsingDot$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement(ResourceTypes.COLOR, false);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("pulse_duration", true);
        pluginGeneratedSerialDescriptor.addElement("pulse_frequency", true);
        pluginGeneratedSerialDescriptor.addElement("pulse_scale", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiChartPulsingDot$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiChartPulsingDot.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(StringSerializer.INSTANCE);
        KSerializer<?> kSerializer = kSerializerArr[3];
        KSerializer<?> kSerializer2 = kSerializerArr[5];
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{SduiThemedColor$$serializer.INSTANCE, nullable, doubleSerializer, kSerializer, doubleSerializer, kSerializer2, doubleSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiChartPulsingDot deserialize(Decoding2 decoder) {
        int i;
        SduiComponentType sduiComponentType;
        SduiThemedColor sduiThemedColor;
        double dDecodeDoubleElement;
        String str;
        SduiChartPulseFrequency sduiChartPulseFrequency;
        double d;
        double d2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiChartPulsingDot.$childSerializers;
        int i2 = 6;
        SduiThemedColor sduiThemedColor2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, null);
            String str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, null);
            double dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(descriptor2, 2);
            SduiChartPulseFrequency sduiChartPulseFrequency2 = (SduiChartPulseFrequency) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            double dDecodeDoubleElement3 = decodingBeginStructure.decodeDoubleElement(descriptor2, 4);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            sduiThemedColor = sduiThemedColor3;
            dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(descriptor2, 6);
            sduiChartPulseFrequency = sduiChartPulseFrequency2;
            i = 127;
            str = str2;
            d = dDecodeDoubleElement2;
            d2 = dDecodeDoubleElement3;
        } else {
            double dDecodeDoubleElement4 = 0.0d;
            boolean z = true;
            int i3 = 0;
            SduiComponentType sduiComponentType2 = null;
            String str3 = null;
            SduiChartPulseFrequency sduiChartPulseFrequency3 = null;
            double dDecodeDoubleElement5 = 0.0d;
            double dDecodeDoubleElement6 = 0.0d;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                    case 0:
                        sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor2);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, str3);
                        i3 |= 2;
                        i2 = 6;
                    case 2:
                        dDecodeDoubleElement5 = decodingBeginStructure.decodeDoubleElement(descriptor2, 2);
                        i3 |= 4;
                    case 3:
                        sduiChartPulseFrequency3 = (SduiChartPulseFrequency) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], sduiChartPulseFrequency3);
                        i3 |= 8;
                    case 4:
                        dDecodeDoubleElement6 = decodingBeginStructure.decodeDoubleElement(descriptor2, 4);
                        i3 |= 16;
                    case 5:
                        sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], sduiComponentType2);
                        i3 |= 32;
                    case 6:
                        dDecodeDoubleElement4 = decodingBeginStructure.decodeDoubleElement(descriptor2, i2);
                        i3 |= 64;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            sduiComponentType = sduiComponentType2;
            sduiThemedColor = sduiThemedColor2;
            dDecodeDoubleElement = dDecodeDoubleElement4;
            str = str3;
            sduiChartPulseFrequency = sduiChartPulseFrequency3;
            d = dDecodeDoubleElement5;
            d2 = dDecodeDoubleElement6;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiChartPulsingDot(i, sduiThemedColor, str, d, sduiChartPulseFrequency, d2, sduiComponentType, dDecodeDoubleElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiChartPulsingDot value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiChartPulsingDot.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

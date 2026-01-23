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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiDottedChartFillStyle.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiDottedChartFillStyle;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiDottedChartFillStyle$$serializer implements PluginHelperInterfaces<SduiDottedChartFillStyle> {
    public static final SduiDottedChartFillStyle$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiDottedChartFillStyle$$serializer sduiDottedChartFillStyle$$serializer = new SduiDottedChartFillStyle$$serializer();
        INSTANCE = sduiDottedChartFillStyle$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiDottedChartFillStyle", sduiDottedChartFillStyle$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("dot_color", false);
        pluginGeneratedSerialDescriptor.addElement("dot_distance", true);
        pluginGeneratedSerialDescriptor.addElement("dot_size", true);
        pluginGeneratedSerialDescriptor.addElement("opacity", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiDottedChartFillStyle$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = SduiDottedChartFillStyle.$childSerializers[4];
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{SduiThemedColor$$serializer.INSTANCE, doubleSerializer, doubleSerializer, doubleSerializer, kSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiDottedChartFillStyle deserialize(Decoding2 decoder) {
        int i;
        SduiThemedColor sduiThemedColor;
        double d;
        double d2;
        SduiChartFillType sduiChartFillType;
        double d3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiDottedChartFillStyle.$childSerializers;
        int i2 = 3;
        SduiThemedColor sduiThemedColor2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, null);
            double dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(descriptor2, 1);
            double dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(descriptor2, 2);
            double dDecodeDoubleElement3 = decodingBeginStructure.decodeDoubleElement(descriptor2, 3);
            sduiChartFillType = (SduiChartFillType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            sduiThemedColor = sduiThemedColor3;
            d = dDecodeDoubleElement3;
            i = 31;
            d2 = dDecodeDoubleElement;
            d3 = dDecodeDoubleElement2;
        } else {
            double dDecodeDoubleElement4 = 0.0d;
            boolean z = true;
            int i3 = 0;
            SduiChartFillType sduiChartFillType2 = null;
            double dDecodeDoubleElement5 = 0.0d;
            double dDecodeDoubleElement6 = 0.0d;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor2);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    dDecodeDoubleElement5 = decodingBeginStructure.decodeDoubleElement(descriptor2, 1);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    dDecodeDoubleElement6 = decodingBeginStructure.decodeDoubleElement(descriptor2, 2);
                    i3 |= 4;
                } else if (iDecodeElementIndex == i2) {
                    dDecodeDoubleElement4 = decodingBeginStructure.decodeDoubleElement(descriptor2, i2);
                    i3 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiChartFillType2 = (SduiChartFillType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], sduiChartFillType2);
                    i3 |= 16;
                }
                i2 = 3;
            }
            i = i3;
            sduiThemedColor = sduiThemedColor2;
            d = dDecodeDoubleElement4;
            d2 = dDecodeDoubleElement5;
            sduiChartFillType = sduiChartFillType2;
            d3 = dDecodeDoubleElement6;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiDottedChartFillStyle(i, sduiThemedColor, d2, d3, d, sduiChartFillType, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiDottedChartFillStyle value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiDottedChartFillStyle.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

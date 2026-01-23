package microgram.p507ui.sdui;

import java.util.List;
import java.util.Map;
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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiChart.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiChart;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiChart$$serializer implements PluginHelperInterfaces<SduiChart> {
    public static final SduiChart$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiChart$$serializer sduiChart$$serializer = new SduiChart$$serializer();
        INSTANCE = sduiChart$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiChart", sduiChart$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("fills", true);
        pluginGeneratedSerialDescriptor.addElement("legend_data", true);
        pluginGeneratedSerialDescriptor.addElement("lines", false);
        pluginGeneratedSerialDescriptor.addElement("overlays", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("weight", true);
        pluginGeneratedSerialDescriptor.addElement("x_axis", true);
        pluginGeneratedSerialDescriptor.addElement("y_axis", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiChart$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiChart.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[0];
        KSerializer<?> kSerializer2 = kSerializerArr[1];
        KSerializer<?> kSerializer3 = kSerializerArr[2];
        KSerializer<?> nullable = BuiltinSerializers.getNullable(kSerializerArr[3]);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(SduiRichText$$serializer.INSTANCE);
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(DoubleSerializer.INSTANCE);
        SduiChartAxis$$serializer sduiChartAxis$$serializer = SduiChartAxis$$serializer.INSTANCE;
        return new KSerializer[]{kSerializer, kSerializer2, kSerializer3, nullable, nullable2, nullable3, BuiltinSerializers.getNullable(sduiChartAxis$$serializer), BuiltinSerializers.getNullable(sduiChartAxis$$serializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiChart deserialize(Decoding2 decoder) {
        int i;
        SduiChartAxis sduiChartAxis;
        SduiChartAxis sduiChartAxis2;
        Double d;
        SduiRichText sduiRichText;
        List list;
        Map map;
        List list2;
        List list3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiChart.$childSerializers;
        int i2 = 7;
        List list4 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            List list5 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            Map map2 = (Map) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            List list6 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            List list7 = (List) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            SduiRichText sduiRichText2 = (SduiRichText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiRichText$$serializer.INSTANCE, null);
            Double d2 = (Double) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, DoubleSerializer.INSTANCE, null);
            SduiChartAxis$$serializer sduiChartAxis$$serializer = SduiChartAxis$$serializer.INSTANCE;
            SduiChartAxis sduiChartAxis3 = (SduiChartAxis) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, sduiChartAxis$$serializer, null);
            list3 = list7;
            list = list5;
            sduiChartAxis = (SduiChartAxis) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, sduiChartAxis$$serializer, null);
            sduiChartAxis2 = sduiChartAxis3;
            d = d2;
            sduiRichText = sduiRichText2;
            i = 255;
            list2 = list6;
            map = map2;
        } else {
            int i3 = 3;
            int i4 = 2;
            int i5 = 1;
            boolean z = true;
            int i6 = 0;
            SduiChartAxis sduiChartAxis4 = null;
            SduiChartAxis sduiChartAxis5 = null;
            Double d3 = null;
            SduiRichText sduiRichText3 = null;
            Map map3 = null;
            List list8 = null;
            List list9 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i5 = 1;
                        i4 = 2;
                        i3 = 3;
                    case 0:
                        list4 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], list4);
                        i6 |= 1;
                        i2 = 7;
                        i5 = 1;
                        i4 = 2;
                        i3 = 3;
                    case 1:
                        map3 = (Map) decodingBeginStructure.decodeSerializableElement(descriptor2, i5, kSerializerArr[i5], map3);
                        i6 |= 2;
                        i2 = 7;
                        i4 = 2;
                        i3 = 3;
                    case 2:
                        list8 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, i4, kSerializerArr[i4], list8);
                        i6 |= 4;
                        i2 = 7;
                        i3 = 3;
                    case 3:
                        list9 = (List) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, kSerializerArr[i3], list9);
                        i6 |= 8;
                        i2 = 7;
                    case 4:
                        sduiRichText3 = (SduiRichText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiRichText$$serializer.INSTANCE, sduiRichText3);
                        i6 |= 16;
                        i2 = 7;
                    case 5:
                        d3 = (Double) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, DoubleSerializer.INSTANCE, d3);
                        i6 |= 32;
                    case 6:
                        sduiChartAxis5 = (SduiChartAxis) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, SduiChartAxis$$serializer.INSTANCE, sduiChartAxis5);
                        i6 |= 64;
                    case 7:
                        sduiChartAxis4 = (SduiChartAxis) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, SduiChartAxis$$serializer.INSTANCE, sduiChartAxis4);
                        i6 |= 128;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i6;
            sduiChartAxis = sduiChartAxis4;
            sduiChartAxis2 = sduiChartAxis5;
            d = d3;
            sduiRichText = sduiRichText3;
            list = list4;
            map = map3;
            list2 = list8;
            list3 = list9;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiChart(i, list, map, list2, list3, sduiRichText, d, sduiChartAxis2, sduiChartAxis, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiChart value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiChart.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiChartGroup.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiChartGroup;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiChartGroup$$serializer implements PluginHelperInterfaces<SduiChartGroup> {
    public static final SduiChartGroup$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiChartGroup$$serializer sduiChartGroup$$serializer = new SduiChartGroup$$serializer();
        INSTANCE = sduiChartGroup$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiChartGroup", sduiChartGroup$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("charts", false);
        pluginGeneratedSerialDescriptor.addElement("display_span", false);
        pluginGeneratedSerialDescriptor.addElement("legend_data", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("x_axis", true);
        pluginGeneratedSerialDescriptor.addElement("y_axis", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiChartGroup$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiChartGroup.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[0];
        KSerializer<?> kSerializer2 = kSerializerArr[1];
        KSerializer<?> kSerializer3 = kSerializerArr[2];
        KSerializer<?> kSerializer4 = kSerializerArr[3];
        SduiChartAxis$$serializer sduiChartAxis$$serializer = SduiChartAxis$$serializer.INSTANCE;
        return new KSerializer[]{kSerializer, kSerializer2, kSerializer3, kSerializer4, BuiltinSerializers.getNullable(sduiChartAxis$$serializer), BuiltinSerializers.getNullable(sduiChartAxis$$serializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiChartGroup deserialize(Decoding2 decoder) {
        int i;
        List list;
        SduiDisplaySpan sduiDisplaySpan;
        Map map;
        SduiComponentType sduiComponentType;
        SduiChartAxis sduiChartAxis;
        SduiChartAxis sduiChartAxis2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiChartGroup.$childSerializers;
        int i2 = 5;
        int i3 = 0;
        List list2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            List list3 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            SduiDisplaySpan sduiDisplaySpan2 = (SduiDisplaySpan) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            Map map2 = (Map) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            SduiChartAxis$$serializer sduiChartAxis$$serializer = SduiChartAxis$$serializer.INSTANCE;
            SduiChartAxis sduiChartAxis3 = (SduiChartAxis) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, sduiChartAxis$$serializer, null);
            sduiComponentType = sduiComponentType2;
            list = list3;
            sduiChartAxis2 = (SduiChartAxis) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, sduiChartAxis$$serializer, null);
            sduiChartAxis = sduiChartAxis3;
            i = 63;
            map = map2;
            sduiDisplaySpan = sduiDisplaySpan2;
        } else {
            int i4 = 1;
            int i5 = 0;
            SduiDisplaySpan sduiDisplaySpan3 = null;
            Map map3 = null;
            SduiComponentType sduiComponentType3 = null;
            SduiChartAxis sduiChartAxis4 = null;
            SduiChartAxis sduiChartAxis5 = null;
            while (i4 != 0) {
                int i6 = i3;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        i3 = i6;
                        i4 = i3;
                        i2 = 5;
                    case 0:
                        list2 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, i6, kSerializerArr[i6], list2);
                        i5 |= 1;
                        i3 = i6;
                        i2 = 5;
                    case 1:
                        sduiDisplaySpan3 = (SduiDisplaySpan) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], sduiDisplaySpan3);
                        i5 |= 2;
                        i3 = i6;
                    case 2:
                        map3 = (Map) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], map3);
                        i5 |= 4;
                        i3 = i6;
                    case 3:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], sduiComponentType3);
                        i5 |= 8;
                        i3 = i6;
                    case 4:
                        sduiChartAxis4 = (SduiChartAxis) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiChartAxis$$serializer.INSTANCE, sduiChartAxis4);
                        i5 |= 16;
                        i3 = i6;
                    case 5:
                        sduiChartAxis5 = (SduiChartAxis) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, SduiChartAxis$$serializer.INSTANCE, sduiChartAxis5);
                        i5 |= 32;
                        i3 = i6;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            list = list2;
            sduiDisplaySpan = sduiDisplaySpan3;
            map = map3;
            sduiComponentType = sduiComponentType3;
            sduiChartAxis = sduiChartAxis4;
            sduiChartAxis2 = sduiChartAxis5;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiChartGroup(i, list, sduiDisplaySpan, map, sduiComponentType, sduiChartAxis, sduiChartAxis2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiChartGroup value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiChartGroup.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

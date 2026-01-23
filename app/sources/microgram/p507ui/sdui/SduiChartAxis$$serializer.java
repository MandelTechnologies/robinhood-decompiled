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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiChartAxis.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiChartAxis;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiChartAxis$$serializer implements PluginHelperInterfaces<SduiChartAxis> {
    public static final SduiChartAxis$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiChartAxis$$serializer sduiChartAxis$$serializer = new SduiChartAxis$$serializer();
        INSTANCE = sduiChartAxis$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiChartAxis", sduiChartAxis$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("effective_range", true);
        pluginGeneratedSerialDescriptor.addElement("labels", false);
        pluginGeneratedSerialDescriptor.addElement("range", true);
        pluginGeneratedSerialDescriptor.addElement("scrubbing_labels", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiChartAxis$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiChartAxis.$childSerializers;
        SduiChartAxisRangeSerializer sduiChartAxisRangeSerializer = SduiChartAxisRangeSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializers.getNullable(sduiChartAxisRangeSerializer), kSerializerArr[1], BuiltinSerializers.getNullable(sduiChartAxisRangeSerializer), BuiltinSerializers.getNullable(kSerializerArr[3])};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiChartAxis deserialize(Decoding2 decoder) {
        int i;
        SduiChartAxisRange sduiChartAxisRange;
        List list;
        SduiChartAxisRange sduiChartAxisRange2;
        Map map;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiChartAxis.$childSerializers;
        SduiChartAxisRange sduiChartAxisRange3 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiChartAxisRangeSerializer sduiChartAxisRangeSerializer = SduiChartAxisRangeSerializer.INSTANCE;
            SduiChartAxisRange sduiChartAxisRange4 = (SduiChartAxisRange) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, sduiChartAxisRangeSerializer, null);
            List list2 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            SduiChartAxisRange sduiChartAxisRange5 = (SduiChartAxisRange) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, sduiChartAxisRangeSerializer, null);
            map = (Map) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            sduiChartAxisRange2 = sduiChartAxisRange5;
            i = 15;
            list = list2;
            sduiChartAxisRange = sduiChartAxisRange4;
        } else {
            boolean z = true;
            int i2 = 0;
            List list3 = null;
            SduiChartAxisRange sduiChartAxisRange6 = null;
            Map map2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiChartAxisRange3 = (SduiChartAxisRange) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiChartAxisRangeSerializer.INSTANCE, sduiChartAxisRange3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list3 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], list3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    sduiChartAxisRange6 = (SduiChartAxisRange) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiChartAxisRangeSerializer.INSTANCE, sduiChartAxisRange6);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    map2 = (Map) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], map2);
                    i2 |= 8;
                }
            }
            i = i2;
            sduiChartAxisRange = sduiChartAxisRange3;
            list = list3;
            sduiChartAxisRange2 = sduiChartAxisRange6;
            map = map2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiChartAxis(i, sduiChartAxisRange, list, sduiChartAxisRange2, map, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiChartAxis value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiChartAxis.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

package microgram.p507ui.sdui;

import com.robinhood.utils.extensions.ResourceTypes;
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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiSolidChartFillStyle.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiSolidChartFillStyle;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiSolidChartFillStyle$$serializer implements PluginHelperInterfaces<SduiSolidChartFillStyle> {
    public static final SduiSolidChartFillStyle$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiSolidChartFillStyle$$serializer sduiSolidChartFillStyle$$serializer = new SduiSolidChartFillStyle$$serializer();
        INSTANCE = sduiSolidChartFillStyle$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiSolidChartFillStyle", sduiSolidChartFillStyle$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement(ResourceTypes.COLOR, false);
        pluginGeneratedSerialDescriptor.addElement("opacity", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiSolidChartFillStyle$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SduiThemedColor$$serializer.INSTANCE, DoubleSerializer.INSTANCE, SduiSolidChartFillStyle.$childSerializers[2]};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiSolidChartFillStyle deserialize(Decoding2 decoder) {
        int i;
        SduiThemedColor sduiThemedColor;
        double d;
        SduiChartFillType sduiChartFillType;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiSolidChartFillStyle.$childSerializers;
        SduiThemedColor sduiThemedColor2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, null);
            double dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(descriptor2, 1);
            sduiChartFillType = (SduiChartFillType) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            sduiThemedColor = sduiThemedColor3;
            i = 7;
            d = dDecodeDoubleElement;
        } else {
            double dDecodeDoubleElement2 = 0.0d;
            boolean z = true;
            int i2 = 0;
            SduiChartFillType sduiChartFillType2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(descriptor2, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiChartFillType2 = (SduiChartFillType) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], sduiChartFillType2);
                    i2 |= 4;
                }
            }
            i = i2;
            sduiThemedColor = sduiThemedColor2;
            d = dDecodeDoubleElement2;
            sduiChartFillType = sduiChartFillType2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiSolidChartFillStyle(i, sduiThemedColor, d, sduiChartFillType, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiSolidChartFillStyle value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiSolidChartFillStyle.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

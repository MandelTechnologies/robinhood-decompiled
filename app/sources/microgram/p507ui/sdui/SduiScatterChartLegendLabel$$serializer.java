package microgram.p507ui.sdui;

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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiScatterChartLegendLabel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiScatterChartLegendLabel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiScatterChartLegendLabel$$serializer implements PluginHelperInterfaces<SduiScatterChartLegendLabel> {
    public static final SduiScatterChartLegendLabel$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiScatterChartLegendLabel$$serializer sduiScatterChartLegendLabel$$serializer = new SduiScatterChartLegendLabel$$serializer();
        INSTANCE = sduiScatterChartLegendLabel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiScatterChartLegendLabel", sduiScatterChartLegendLabel$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle_color_override", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("title_color_override", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiScatterChartLegendLabel$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(stringSerializer);
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializers.getNullable(sduiThemedColor$$serializer), stringSerializer, BuiltinSerializers.getNullable(sduiThemedColor$$serializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiScatterChartLegendLabel deserialize(Decoding2 decoder) {
        int i;
        String str;
        SduiThemedColor sduiThemedColor;
        String str2;
        SduiThemedColor sduiThemedColor2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        String str3 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, null);
            SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, sduiThemedColor$$serializer, null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            str = str4;
            sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, sduiThemedColor$$serializer, null);
            str2 = strDecodeStringElement;
            sduiThemedColor = sduiThemedColor3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiThemedColor sduiThemedColor4 = null;
            String strDecodeStringElement2 = null;
            SduiThemedColor sduiThemedColor5 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, str3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiThemedColor4 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor4);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiThemedColor5 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor5);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str3;
            sduiThemedColor = sduiThemedColor4;
            str2 = strDecodeStringElement2;
            sduiThemedColor2 = sduiThemedColor5;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiScatterChartLegendLabel(i, str, sduiThemedColor, str2, sduiThemedColor2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiScatterChartLegendLabel value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiScatterChartLegendLabel.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

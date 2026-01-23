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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiRecurringInsightsVisualizationData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiRecurringInsightsVisualizationData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiRecurringInsightsVisualizationData$$serializer implements PluginHelperInterfaces<SduiRecurringInsightsVisualizationData> {
    public static final SduiRecurringInsightsVisualizationData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiRecurringInsightsVisualizationData$$serializer sduiRecurringInsightsVisualizationData$$serializer = new SduiRecurringInsightsVisualizationData$$serializer();
        INSTANCE = sduiRecurringInsightsVisualizationData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiRecurringInsightsVisualizationData", sduiRecurringInsightsVisualizationData$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("accurate_size", true);
        pluginGeneratedSerialDescriptor.addElement("bucket_size", true);
        pluginGeneratedSerialDescriptor.addElement(ResourceTypes.COLOR, true);
        pluginGeneratedSerialDescriptor.addElement("image_url", true);
        pluginGeneratedSerialDescriptor.addElement("stroke_color", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("title_icon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiRecurringInsightsVisualizationData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(doubleSerializer);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(doubleSerializer);
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(sduiThemedColor$$serializer);
        KSerializer<?> nullable4 = BuiltinSerializers.getNullable(StringSerializer.INSTANCE);
        KSerializer<?> nullable5 = BuiltinSerializers.getNullable(sduiThemedColor$$serializer);
        KSerializer<?> nullable6 = BuiltinSerializers.getNullable(SduiIconWithAction$$serializer.INSTANCE);
        SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, sduiMarkdownText$$serializer, sduiMarkdownText$$serializer, nullable6};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiRecurringInsightsVisualizationData deserialize(Decoding2 decoder) {
        int i;
        SduiIconWithAction sduiIconWithAction;
        SduiMarkdownText sduiMarkdownText;
        SduiMarkdownText sduiMarkdownText2;
        Double d;
        Double d2;
        SduiThemedColor sduiThemedColor;
        String str;
        SduiThemedColor sduiThemedColor2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        int i2 = 7;
        Double d3 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
            Double d4 = (Double) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, doubleSerializer, null);
            Double d5 = (Double) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, doubleSerializer, null);
            SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, sduiThemedColor$$serializer, null);
            String str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, null);
            SduiThemedColor sduiThemedColor4 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, sduiThemedColor$$serializer, null);
            SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
            SduiMarkdownText sduiMarkdownText3 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, sduiMarkdownText$$serializer, null);
            SduiMarkdownText sduiMarkdownText4 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, sduiMarkdownText$$serializer, null);
            d2 = d5;
            sduiIconWithAction = (SduiIconWithAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, SduiIconWithAction$$serializer.INSTANCE, null);
            sduiMarkdownText = sduiMarkdownText4;
            sduiMarkdownText2 = sduiMarkdownText3;
            str = str2;
            sduiThemedColor2 = sduiThemedColor4;
            sduiThemedColor = sduiThemedColor3;
            i = 255;
            d = d4;
        } else {
            boolean z = true;
            int i3 = 0;
            SduiIconWithAction sduiIconWithAction2 = null;
            SduiMarkdownText sduiMarkdownText5 = null;
            SduiMarkdownText sduiMarkdownText6 = null;
            Double d6 = null;
            SduiThemedColor sduiThemedColor5 = null;
            String str3 = null;
            SduiThemedColor sduiThemedColor6 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                    case 0:
                        d3 = (Double) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, DoubleSerializer.INSTANCE, d3);
                        i3 |= 1;
                        i2 = 7;
                    case 1:
                        d6 = (Double) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, DoubleSerializer.INSTANCE, d6);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        sduiThemedColor5 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor5);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str3);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        sduiThemedColor6 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor6);
                        i3 |= 16;
                    case 5:
                        sduiMarkdownText6 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText6);
                        i3 |= 32;
                    case 6:
                        sduiMarkdownText5 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText5);
                        i3 |= 64;
                    case 7:
                        sduiIconWithAction2 = (SduiIconWithAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, SduiIconWithAction$$serializer.INSTANCE, sduiIconWithAction2);
                        i3 |= 128;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            sduiIconWithAction = sduiIconWithAction2;
            sduiMarkdownText = sduiMarkdownText5;
            sduiMarkdownText2 = sduiMarkdownText6;
            d = d3;
            d2 = d6;
            sduiThemedColor = sduiThemedColor5;
            str = str3;
            sduiThemedColor2 = sduiThemedColor6;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiRecurringInsightsVisualizationData(i, d, d2, sduiThemedColor, str, sduiThemedColor2, sduiMarkdownText2, sduiMarkdownText, sduiIconWithAction, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiRecurringInsightsVisualizationData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiRecurringInsightsVisualizationData.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

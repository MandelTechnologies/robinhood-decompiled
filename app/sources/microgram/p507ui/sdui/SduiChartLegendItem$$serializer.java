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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiChartLegendItem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiChartLegendItem;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiChartLegendItem$$serializer implements PluginHelperInterfaces<SduiChartLegendItem> {
    public static final SduiChartLegendItem$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiChartLegendItem$$serializer sduiChartLegendItem$$serializer = new SduiChartLegendItem$$serializer();
        INSTANCE = sduiChartLegendItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiChartLegendItem", sduiChartLegendItem$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(ResourceTypes.COLOR, true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("value_color", false);
        pluginGeneratedSerialDescriptor.addElement("value_suffix", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiChartLegendItem$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(sduiThemedColor$$serializer);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(SduiDisplayText$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, stringSerializer, stringSerializer, stringSerializer, sduiThemedColor$$serializer, nullable2};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiChartLegendItem deserialize(Decoding2 decoder) {
        int i;
        SduiThemedColor sduiThemedColor;
        String str;
        String str2;
        String str3;
        SduiThemedColor sduiThemedColor2;
        SduiDisplayText sduiDisplayText;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        int i2 = 5;
        SduiThemedColor sduiThemedColor3 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
            SduiThemedColor sduiThemedColor4 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, sduiThemedColor$$serializer, null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, sduiThemedColor$$serializer, null);
            sduiDisplayText = (SduiDisplayText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, SduiDisplayText$$serializer.INSTANCE, null);
            str3 = strDecodeStringElement3;
            i = 63;
            str2 = strDecodeStringElement2;
            str = strDecodeStringElement;
            sduiThemedColor = sduiThemedColor4;
        } else {
            boolean z = true;
            int i3 = 0;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            SduiThemedColor sduiThemedColor5 = null;
            SduiDisplayText sduiDisplayText2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor3);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i3 |= 2;
                    case 2:
                        strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i3 |= 4;
                    case 3:
                        strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                        i3 |= 8;
                    case 4:
                        sduiThemedColor5 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor5);
                        i3 |= 16;
                    case 5:
                        sduiDisplayText2 = (SduiDisplayText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, SduiDisplayText$$serializer.INSTANCE, sduiDisplayText2);
                        i3 |= 32;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            sduiThemedColor = sduiThemedColor3;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            sduiThemedColor2 = sduiThemedColor5;
            sduiDisplayText = sduiDisplayText2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiChartLegendItem(i, sduiThemedColor, str, str2, str3, sduiThemedColor2, sduiDisplayText, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiChartLegendItem value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiChartLegendItem.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

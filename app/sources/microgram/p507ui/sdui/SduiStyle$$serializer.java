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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiStyle.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiStyle;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiStyle$$serializer implements PluginHelperInterfaces<SduiStyle> {
    public static final SduiStyle$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiStyle$$serializer sduiStyle$$serializer = new SduiStyle$$serializer();
        INSTANCE = sduiStyle$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiStyle", sduiStyle$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement(ResourceTypes.COLOR, false);
        pluginGeneratedSerialDescriptor.addElement("gradient_color", true);
        pluginGeneratedSerialDescriptor.addElement("line_type", false);
        pluginGeneratedSerialDescriptor.addElement("opacity", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiStyle$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SduiThemedColor$$serializer.INSTANCE, BuiltinSerializers.getNullable(SduiLinearGradientColor$$serializer.INSTANCE), SduiLineTypeSerializer.INSTANCE, DoubleSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiStyle deserialize(Decoding2 decoder) {
        int i;
        SduiThemedColor sduiThemedColor;
        double dDecodeDoubleElement;
        SduiLinearGradientColor sduiLinearGradientColor;
        SduiLineType sduiLineType;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        SduiThemedColor sduiThemedColor2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, null);
            SduiLinearGradientColor sduiLinearGradientColor2 = (SduiLinearGradientColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiLinearGradientColor$$serializer.INSTANCE, null);
            sduiThemedColor = sduiThemedColor3;
            i = 15;
            sduiLineType = (SduiLineType) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, SduiLineTypeSerializer.INSTANCE, null);
            sduiLinearGradientColor = sduiLinearGradientColor2;
            dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(descriptor2, 3);
        } else {
            double dDecodeDoubleElement2 = 0.0d;
            boolean z = true;
            int i2 = 0;
            SduiLinearGradientColor sduiLinearGradientColor3 = null;
            SduiLineType sduiLineType2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiLinearGradientColor3 = (SduiLinearGradientColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiLinearGradientColor$$serializer.INSTANCE, sduiLinearGradientColor3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    sduiLineType2 = (SduiLineType) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, SduiLineTypeSerializer.INSTANCE, sduiLineType2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(descriptor2, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            sduiThemedColor = sduiThemedColor2;
            dDecodeDoubleElement = dDecodeDoubleElement2;
            sduiLinearGradientColor = sduiLinearGradientColor3;
            sduiLineType = sduiLineType2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiStyle(i, sduiThemedColor, sduiLinearGradientColor, sduiLineType, dDecodeDoubleElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiStyle value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiStyle.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

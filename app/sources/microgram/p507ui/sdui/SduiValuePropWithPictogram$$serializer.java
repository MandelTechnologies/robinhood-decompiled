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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiValuePropWithPictogram.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiValuePropWithPictogram;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiValuePropWithPictogram$$serializer implements PluginHelperInterfaces<SduiValuePropWithPictogram> {
    public static final SduiValuePropWithPictogram$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiValuePropWithPictogram$$serializer sduiValuePropWithPictogram$$serializer = new SduiValuePropWithPictogram$$serializer();
        INSTANCE = sduiValuePropWithPictogram$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiValuePropWithPictogram", sduiValuePropWithPictogram$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("content_markdown", false);
        pluginGeneratedSerialDescriptor.addElement("pictogram", false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("supplemental_action", true);
        pluginGeneratedSerialDescriptor.addElement("text_style_override", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiValuePropWithPictogram$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiValuePropWithPictogram.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializerArr[1], kSerializerArr[2], BuiltinSerializers.getNullable(SduiTextWithAction$$serializer.INSTANCE), BuiltinSerializers.getNullable(kSerializerArr[4]), BuiltinSerializers.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiValuePropWithPictogram deserialize(Decoding2 decoder) {
        int i;
        String str;
        SduiPictogram sduiPictogram;
        SduiComponentType sduiComponentType;
        SduiTextWithAction sduiTextWithAction;
        SduiTextStyle sduiTextStyle;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiValuePropWithPictogram.$childSerializers;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            SduiPictogram sduiPictogram2 = (SduiPictogram) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            SduiTextWithAction sduiTextWithAction2 = (SduiTextWithAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiTextWithAction$$serializer.INSTANCE, null);
            sduiTextStyle = (SduiTextStyle) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            str = strDecodeStringElement2;
            str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, null);
            sduiTextWithAction = sduiTextWithAction2;
            i = 63;
            sduiComponentType = sduiComponentType2;
            sduiPictogram = sduiPictogram2;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiPictogram sduiPictogram3 = null;
            SduiComponentType sduiComponentType3 = null;
            SduiTextWithAction sduiTextWithAction3 = null;
            SduiTextStyle sduiTextStyle2 = null;
            String str3 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        sduiPictogram3 = (SduiPictogram) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], sduiPictogram3);
                        i2 |= 2;
                        break;
                    case 2:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], sduiComponentType3);
                        i2 |= 4;
                        break;
                    case 3:
                        sduiTextWithAction3 = (SduiTextWithAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiTextWithAction$$serializer.INSTANCE, sduiTextWithAction3);
                        i2 |= 8;
                        break;
                    case 4:
                        sduiTextStyle2 = (SduiTextStyle) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, kSerializerArr[4], sduiTextStyle2);
                        i2 |= 16;
                        break;
                    case 5:
                        str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, str3);
                        i2 |= 32;
                        break;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i2;
            str = strDecodeStringElement;
            sduiPictogram = sduiPictogram3;
            sduiComponentType = sduiComponentType3;
            sduiTextWithAction = sduiTextWithAction3;
            sduiTextStyle = sduiTextStyle2;
            str2 = str3;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiValuePropWithPictogram(i, str, sduiPictogram, sduiComponentType, sduiTextWithAction, sduiTextStyle, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiValuePropWithPictogram value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiValuePropWithPictogram.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiUpsellNavigationRowWithInfoTag.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiUpsellNavigationRowWithInfoTag;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiUpsellNavigationRowWithInfoTag$$serializer implements PluginHelperInterfaces<SduiUpsellNavigationRowWithInfoTag> {
    public static final SduiUpsellNavigationRowWithInfoTag$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiUpsellNavigationRowWithInfoTag$$serializer sduiUpsellNavigationRowWithInfoTag$$serializer = new SduiUpsellNavigationRowWithInfoTag$$serializer();
        INSTANCE = sduiUpsellNavigationRowWithInfoTag$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiUpsellNavigationRowWithInfoTag", sduiUpsellNavigationRowWithInfoTag$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("info_tag", true);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiUpsellNavigationRowWithInfoTag$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiUpsellNavigationRowWithInfoTag.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiAction2.INSTANCE);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(SduiInfoTag$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, stringSerializer, kSerializerArr[3], BuiltinSerializers.getNullable(stringSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiUpsellNavigationRowWithInfoTag deserialize(Decoding2 decoder) {
        int i;
        SduiAction sduiAction;
        SduiInfoTag sduiInfoTag;
        String str;
        SduiComponentType sduiComponentType;
        String str2;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiUpsellNavigationRowWithInfoTag.$childSerializers;
        int i2 = 5;
        SduiAction sduiAction2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction3 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            SduiInfoTag sduiInfoTag2 = (SduiInfoTag) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiInfoTag$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            String str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, null);
            sduiComponentType = sduiComponentType2;
            sduiAction = sduiAction3;
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 5);
            str2 = str3;
            str = strDecodeStringElement2;
            i = 63;
            sduiInfoTag = sduiInfoTag2;
        } else {
            boolean z = true;
            int i3 = 0;
            SduiInfoTag sduiInfoTag3 = null;
            String strDecodeStringElement3 = null;
            SduiComponentType sduiComponentType3 = null;
            String str4 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        sduiAction2 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction2);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        sduiInfoTag3 = (SduiInfoTag) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiInfoTag$$serializer.INSTANCE, sduiInfoTag3);
                        i3 |= 2;
                    case 2:
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i3 |= 4;
                    case 3:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], sduiComponentType3);
                        i3 |= 8;
                    case 4:
                        str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str4);
                        i3 |= 16;
                    case 5:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i3 |= 32;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            sduiAction = sduiAction2;
            sduiInfoTag = sduiInfoTag3;
            str = strDecodeStringElement3;
            sduiComponentType = sduiComponentType3;
            str2 = str4;
            strDecodeStringElement = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiUpsellNavigationRowWithInfoTag(i, sduiAction, sduiInfoTag, str, sduiComponentType, str2, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiUpsellNavigationRowWithInfoTag value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiUpsellNavigationRowWithInfoTag.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

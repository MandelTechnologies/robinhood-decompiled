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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiValuePropWithPictogramAndRichText.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiValuePropWithPictogramAndRichText;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiValuePropWithPictogramAndRichText$$serializer implements PluginHelperInterfaces<SduiValuePropWithPictogramAndRichText> {
    public static final SduiValuePropWithPictogramAndRichText$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiValuePropWithPictogramAndRichText$$serializer sduiValuePropWithPictogramAndRichText$$serializer = new SduiValuePropWithPictogramAndRichText$$serializer();
        INSTANCE = sduiValuePropWithPictogramAndRichText$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiValuePropWithPictogramAndRichText", sduiValuePropWithPictogramAndRichText$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("content_rich_text", false);
        pluginGeneratedSerialDescriptor.addElement("pictogram", false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("supplemental_action", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiValuePropWithPictogramAndRichText$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiValuePropWithPictogramAndRichText.$childSerializers;
        return new KSerializer[]{SduiRichText$$serializer.INSTANCE, kSerializerArr[1], kSerializerArr[2], BuiltinSerializers.getNullable(SduiTextWithAction$$serializer.INSTANCE), BuiltinSerializers.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiValuePropWithPictogramAndRichText deserialize(Decoding2 decoder) {
        int i;
        SduiRichText sduiRichText;
        SduiPictogram sduiPictogram;
        SduiComponentType sduiComponentType;
        SduiTextWithAction sduiTextWithAction;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiValuePropWithPictogramAndRichText.$childSerializers;
        SduiRichText sduiRichText2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiRichText sduiRichText3 = (SduiRichText) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiRichText$$serializer.INSTANCE, null);
            SduiPictogram sduiPictogram2 = (SduiPictogram) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            sduiRichText = sduiRichText3;
            sduiTextWithAction = (SduiTextWithAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiTextWithAction$$serializer.INSTANCE, null);
            str = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, null);
            i = 31;
            sduiPictogram = sduiPictogram2;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiPictogram sduiPictogram3 = null;
            SduiComponentType sduiComponentType2 = null;
            SduiTextWithAction sduiTextWithAction2 = null;
            String str2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiRichText2 = (SduiRichText) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiRichText$$serializer.INSTANCE, sduiRichText2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiPictogram3 = (SduiPictogram) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], sduiPictogram3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], sduiComponentType2);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    sduiTextWithAction2 = (SduiTextWithAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiTextWithAction$$serializer.INSTANCE, sduiTextWithAction2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str2);
                    i2 |= 16;
                }
            }
            i = i2;
            sduiRichText = sduiRichText2;
            sduiPictogram = sduiPictogram3;
            sduiComponentType = sduiComponentType2;
            sduiTextWithAction = sduiTextWithAction2;
            str = str2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiValuePropWithPictogramAndRichText(i, sduiRichText, sduiPictogram, sduiComponentType, sduiTextWithAction, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiValuePropWithPictogramAndRichText value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiValuePropWithPictogramAndRichText.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

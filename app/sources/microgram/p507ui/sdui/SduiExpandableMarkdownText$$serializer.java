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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiExpandableMarkdownText.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiExpandableMarkdownText;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiExpandableMarkdownText$$serializer implements PluginHelperInterfaces<SduiExpandableMarkdownText> {
    public static final SduiExpandableMarkdownText$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiExpandableMarkdownText$$serializer sduiExpandableMarkdownText$$serializer = new SduiExpandableMarkdownText$$serializer();
        INSTANCE = sduiExpandableMarkdownText$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiExpandableMarkdownText", sduiExpandableMarkdownText$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("button_color_override", true);
        pluginGeneratedSerialDescriptor.addElement("collapse_button_text", false);
        pluginGeneratedSerialDescriptor.addElement("expand_button_text", false);
        pluginGeneratedSerialDescriptor.addElement("full_text_markdown", false);
        pluginGeneratedSerialDescriptor.addElement("preview_text_markdown", false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiExpandableMarkdownText$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiExpandableMarkdownText.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiThemedColor$$serializer.INSTANCE);
        KSerializer<?> kSerializer = kSerializerArr[5];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
        return new KSerializer[]{nullable, stringSerializer, stringSerializer, sduiMarkdownText$$serializer, sduiMarkdownText$$serializer, kSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiExpandableMarkdownText deserialize(Decoding2 decoder) {
        int i;
        SduiThemedColor sduiThemedColor;
        String str;
        String str2;
        SduiMarkdownText sduiMarkdownText;
        SduiMarkdownText sduiMarkdownText2;
        SduiComponentType sduiComponentType;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiExpandableMarkdownText.$childSerializers;
        int i2 = 3;
        SduiThemedColor sduiThemedColor2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
            SduiMarkdownText sduiMarkdownText3 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, sduiMarkdownText$$serializer, null);
            SduiMarkdownText sduiMarkdownText4 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, sduiMarkdownText$$serializer, null);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            sduiThemedColor = sduiThemedColor3;
            sduiMarkdownText = sduiMarkdownText3;
            sduiMarkdownText2 = sduiMarkdownText4;
            str2 = strDecodeStringElement2;
            i = 63;
            str = strDecodeStringElement;
        } else {
            boolean z = true;
            int i3 = 0;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            SduiMarkdownText sduiMarkdownText5 = null;
            SduiMarkdownText sduiMarkdownText6 = null;
            SduiComponentType sduiComponentType2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 3;
                    case 0:
                        sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor2);
                        i3 |= 1;
                        i2 = 3;
                    case 1:
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i3 |= 2;
                    case 2:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i3 |= 4;
                    case 3:
                        sduiMarkdownText5 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText5);
                        i3 |= 8;
                    case 4:
                        sduiMarkdownText6 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText6);
                        i3 |= 16;
                    case 5:
                        sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], sduiComponentType2);
                        i3 |= 32;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            sduiThemedColor = sduiThemedColor2;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            sduiMarkdownText = sduiMarkdownText5;
            sduiMarkdownText2 = sduiMarkdownText6;
            sduiComponentType = sduiComponentType2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiExpandableMarkdownText(i, sduiThemedColor, str, str2, sduiMarkdownText, sduiMarkdownText2, sduiComponentType, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiExpandableMarkdownText value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiExpandableMarkdownText.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

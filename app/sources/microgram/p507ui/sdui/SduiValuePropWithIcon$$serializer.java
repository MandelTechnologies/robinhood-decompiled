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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiValuePropWithIcon.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiValuePropWithIcon;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiValuePropWithIcon$$serializer implements PluginHelperInterfaces<SduiValuePropWithIcon> {
    public static final SduiValuePropWithIcon$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiValuePropWithIcon$$serializer sduiValuePropWithIcon$$serializer = new SduiValuePropWithIcon$$serializer();
        INSTANCE = sduiValuePropWithIcon$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiValuePropWithIcon", sduiValuePropWithIcon$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("content_markdown", false);
        pluginGeneratedSerialDescriptor.addElement("content_text_color_override", true);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("icon_color_override", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("supplemental_action", true);
        pluginGeneratedSerialDescriptor.addElement("text_style_override", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("title_text_color_override", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiValuePropWithIcon$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiValuePropWithIcon.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializers.getNullable(sduiThemedColor$$serializer), kSerializerArr[2], BuiltinSerializers.getNullable(sduiThemedColor$$serializer), kSerializerArr[4], BuiltinSerializers.getNullable(SduiTextWithAction$$serializer.INSTANCE), BuiltinSerializers.getNullable(kSerializerArr[6]), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(sduiThemedColor$$serializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiValuePropWithIcon deserialize(Decoding2 decoder) {
        int i;
        SduiThemedColor sduiThemedColor;
        SduiTextStyle sduiTextStyle;
        String str;
        SduiTextWithAction sduiTextWithAction;
        SduiComponentType sduiComponentType;
        SduiThemedColor sduiThemedColor2;
        String str2;
        SduiThemedColor sduiThemedColor3;
        SduiIcon sduiIcon;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiValuePropWithIcon.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
            SduiThemedColor sduiThemedColor4 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, sduiThemedColor$$serializer, null);
            SduiIcon sduiIcon2 = (SduiIcon) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            SduiThemedColor sduiThemedColor5 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, sduiThemedColor$$serializer, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            SduiTextWithAction sduiTextWithAction2 = (SduiTextWithAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, SduiTextWithAction$$serializer.INSTANCE, null);
            sduiTextStyle = (SduiTextStyle) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            str2 = strDecodeStringElement2;
            str = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, null);
            sduiTextWithAction = sduiTextWithAction2;
            sduiThemedColor2 = sduiThemedColor5;
            sduiThemedColor = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, sduiThemedColor$$serializer, null);
            i = 511;
            sduiComponentType = sduiComponentType2;
            sduiIcon = sduiIcon2;
            sduiThemedColor3 = sduiThemedColor4;
        } else {
            int i4 = 4;
            int i5 = 2;
            boolean z = true;
            int i6 = 0;
            SduiThemedColor sduiThemedColor6 = null;
            SduiTextStyle sduiTextStyle2 = null;
            String str3 = null;
            SduiTextWithAction sduiTextWithAction3 = null;
            SduiComponentType sduiComponentType3 = null;
            SduiThemedColor sduiThemedColor7 = null;
            SduiThemedColor sduiThemedColor8 = null;
            SduiIcon sduiIcon3 = null;
            while (z) {
                int i7 = i3;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 6;
                        i5 = 2;
                        i4 = 4;
                    case 0:
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i6 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i5 = 2;
                        i4 = 4;
                    case 1:
                        sduiThemedColor8 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor8);
                        i6 |= 2;
                        i2 = 7;
                        i3 = 6;
                        i5 = 2;
                        i4 = 4;
                    case 2:
                        sduiIcon3 = (SduiIcon) decodingBeginStructure.decodeSerializableElement(descriptor2, i5, kSerializerArr[i5], sduiIcon3);
                        i6 |= 4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 4;
                    case 3:
                        sduiThemedColor7 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor7);
                        i6 |= 8;
                        i2 = 7;
                        i3 = 6;
                        i4 = 4;
                    case 4:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i4, kSerializerArr[i4], sduiComponentType3);
                        i6 |= 16;
                        i2 = 7;
                        i3 = 6;
                    case 5:
                        sduiTextWithAction3 = (SduiTextWithAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, SduiTextWithAction$$serializer.INSTANCE, sduiTextWithAction3);
                        i6 |= 32;
                        i2 = 7;
                        i3 = 6;
                    case 6:
                        sduiTextStyle2 = (SduiTextStyle) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i7, kSerializerArr[i7], sduiTextStyle2);
                        i6 |= 64;
                        i3 = i7;
                        i2 = 7;
                    case 7:
                        str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, StringSerializer.INSTANCE, str3);
                        i6 |= 128;
                        i3 = i7;
                    case 8:
                        sduiThemedColor6 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor6);
                        i6 |= 256;
                        i3 = i7;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i6;
            sduiThemedColor = sduiThemedColor6;
            sduiTextStyle = sduiTextStyle2;
            str = str3;
            sduiTextWithAction = sduiTextWithAction3;
            sduiComponentType = sduiComponentType3;
            sduiThemedColor2 = sduiThemedColor7;
            str2 = strDecodeStringElement;
            sduiThemedColor3 = sduiThemedColor8;
            sduiIcon = sduiIcon3;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiValuePropWithIcon(i, str2, sduiThemedColor3, sduiIcon, sduiThemedColor2, sduiComponentType, sduiTextWithAction, sduiTextStyle, str, sduiThemedColor, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiValuePropWithIcon value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiValuePropWithIcon.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

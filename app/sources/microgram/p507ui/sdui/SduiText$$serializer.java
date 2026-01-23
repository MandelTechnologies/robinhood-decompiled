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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiText.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiText;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiText$$serializer implements PluginHelperInterfaces<SduiText> {
    public static final SduiText$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiText$$serializer sduiText$$serializer = new SduiText$$serializer();
        INSTANCE = sduiText$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiText", sduiText$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("alignment", true);
        pluginGeneratedSerialDescriptor.addElement(ResourceTypes.COLOR, true);
        pluginGeneratedSerialDescriptor.addElement("link_color_override", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement(ResourceTypes.STYLE, true);
        pluginGeneratedSerialDescriptor.addElement("text", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiText$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiText.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[0];
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        return new KSerializer[]{kSerializer, sduiThemedColor$$serializer, BuiltinSerializers.getNullable(sduiThemedColor$$serializer), kSerializerArr[3], kSerializerArr[4], SduiRenderableTextSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiText deserialize(Decoding2 decoder) {
        int i;
        SduiTextAlignment sduiTextAlignment;
        SduiThemedColor sduiThemedColor;
        SduiThemedColor sduiThemedColor2;
        SduiComponentType sduiComponentType;
        SduiTextStyle sduiTextStyle;
        SduiRenderableText sduiRenderableText;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiText.$childSerializers;
        int i2 = 5;
        int i3 = 0;
        SduiTextAlignment sduiTextAlignment2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiTextAlignment sduiTextAlignment3 = (SduiTextAlignment) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, sduiThemedColor$$serializer, null);
            SduiThemedColor sduiThemedColor4 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, sduiThemedColor$$serializer, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            sduiTextStyle = (SduiTextStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            sduiTextAlignment = sduiTextAlignment3;
            sduiRenderableText = (SduiRenderableText) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, SduiRenderableTextSerializer.INSTANCE, null);
            sduiThemedColor2 = sduiThemedColor4;
            sduiComponentType = sduiComponentType2;
            i = 63;
            sduiThemedColor = sduiThemedColor3;
        } else {
            int i4 = 1;
            int i5 = 0;
            SduiThemedColor sduiThemedColor5 = null;
            SduiThemedColor sduiThemedColor6 = null;
            SduiComponentType sduiComponentType3 = null;
            SduiTextStyle sduiTextStyle2 = null;
            SduiRenderableText sduiRenderableText2 = null;
            while (i4 != 0) {
                int i6 = i3;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        i3 = i6;
                        i4 = i3;
                        i2 = 5;
                    case 0:
                        sduiTextAlignment2 = (SduiTextAlignment) decodingBeginStructure.decodeSerializableElement(descriptor2, i6, kSerializerArr[i6], sduiTextAlignment2);
                        i5 |= 1;
                        i3 = i6;
                        i2 = 5;
                    case 1:
                        sduiThemedColor5 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor5);
                        i5 |= 2;
                        i3 = i6;
                    case 2:
                        sduiThemedColor6 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor6);
                        i5 |= 4;
                        i3 = i6;
                    case 3:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], sduiComponentType3);
                        i5 |= 8;
                        i3 = i6;
                    case 4:
                        sduiTextStyle2 = (SduiTextStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], sduiTextStyle2);
                        i5 |= 16;
                        i3 = i6;
                    case 5:
                        sduiRenderableText2 = (SduiRenderableText) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, SduiRenderableTextSerializer.INSTANCE, sduiRenderableText2);
                        i5 |= 32;
                        i3 = i6;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            sduiTextAlignment = sduiTextAlignment2;
            sduiThemedColor = sduiThemedColor5;
            sduiThemedColor2 = sduiThemedColor6;
            sduiComponentType = sduiComponentType3;
            sduiTextStyle = sduiTextStyle2;
            sduiRenderableText = sduiRenderableText2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiText(i, sduiTextAlignment, sduiThemedColor, sduiThemedColor2, sduiComponentType, sduiTextStyle, sduiRenderableText, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiText value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiText.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

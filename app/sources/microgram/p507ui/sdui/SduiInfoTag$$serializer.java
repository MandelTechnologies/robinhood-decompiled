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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiInfoTag.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiInfoTag;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiInfoTag$$serializer implements PluginHelperInterfaces<SduiInfoTag> {
    public static final SduiInfoTag$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiInfoTag$$serializer sduiInfoTag$$serializer = new SduiInfoTag$$serializer();
        INSTANCE = sduiInfoTag$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiInfoTag", sduiInfoTag$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("background_color_override", true);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement(AnnotatedPrivateKey.LABEL, false);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", false);
        pluginGeneratedSerialDescriptor.addElement("prefers_icon_on_right", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("text_color_override", true);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiInfoTag$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiInfoTag.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiAction2.INSTANCE);
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(sduiThemedColor$$serializer);
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(kSerializerArr[2]);
        KSerializer<?> kSerializer = kSerializerArr[6];
        KSerializer<?> nullable4 = BuiltinSerializers.getNullable(sduiThemedColor$$serializer);
        KSerializer<?> kSerializer2 = kSerializerArr[8];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, kSerializer, nullable4, kSerializer2};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiInfoTag deserialize(Decoding2 decoder) {
        boolean z;
        SduiInfoTagType sduiInfoTagType;
        SduiThemedColor sduiThemedColor;
        SduiComponentType sduiComponentType;
        SduiIcon sduiIcon;
        int i;
        SduiAction sduiAction;
        SduiThemedColor sduiThemedColor2;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiInfoTag.$childSerializers;
        int i2 = 7;
        int i3 = 5;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, sduiThemedColor$$serializer, null);
            SduiIcon sduiIcon2 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 5);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            SduiThemedColor sduiThemedColor4 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, sduiThemedColor$$serializer, null);
            sduiInfoTagType = (SduiInfoTagType) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            sduiAction = sduiAction2;
            sduiThemedColor = sduiThemedColor4;
            z = zDecodeBooleanElement;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement2;
            sduiComponentType = sduiComponentType2;
            i = 511;
            sduiIcon = sduiIcon2;
            sduiThemedColor2 = sduiThemedColor3;
        } else {
            int i4 = 2;
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            SduiInfoTagType sduiInfoTagType2 = null;
            SduiThemedColor sduiThemedColor5 = null;
            SduiComponentType sduiComponentType3 = null;
            SduiAction sduiAction3 = null;
            SduiThemedColor sduiThemedColor6 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i5 = 0;
            SduiIcon sduiIcon3 = null;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 5;
                        i4 = 2;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 5;
                        i4 = 2;
                    case 1:
                        sduiThemedColor6 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor6);
                        i5 |= 2;
                        i2 = 7;
                        i3 = 5;
                        i4 = 2;
                    case 2:
                        sduiIcon3 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i4, kSerializerArr[i4], sduiIcon3);
                        i5 |= 4;
                        i2 = 7;
                        i3 = 5;
                    case 3:
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                        i5 |= 8;
                        i2 = 7;
                    case 4:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i5 |= 16;
                    case 5:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, i3);
                        i5 |= 32;
                    case 6:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], sduiComponentType3);
                        i5 |= 64;
                    case 7:
                        sduiThemedColor5 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor5);
                        i5 |= 128;
                    case 8:
                        sduiInfoTagType2 = (SduiInfoTagType) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], sduiInfoTagType2);
                        i5 |= 256;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            sduiInfoTagType = sduiInfoTagType2;
            sduiThemedColor = sduiThemedColor5;
            sduiComponentType = sduiComponentType3;
            sduiIcon = sduiIcon3;
            i = i5;
            sduiAction = sduiAction3;
            sduiThemedColor2 = sduiThemedColor6;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiInfoTag(i, sduiAction, sduiThemedColor2, sduiIcon, str, str2, z, sduiComponentType, sduiThemedColor, sduiInfoTagType, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiInfoTag value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiInfoTag.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

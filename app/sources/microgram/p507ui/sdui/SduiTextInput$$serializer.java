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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiTextInput.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiTextInput;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiTextInput$$serializer implements PluginHelperInterfaces<SduiTextInput> {
    public static final SduiTextInput$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiTextInput$$serializer sduiTextInput$$serializer = new SduiTextInput$$serializer();
        INSTANCE = sduiTextInput$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiTextInput", sduiTextInput$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("activate_keyboard_on_appear", true);
        pluginGeneratedSerialDescriptor.addElement("autocapitalization_type", true);
        pluginGeneratedSerialDescriptor.addElement("autocorrection_type", true);
        pluginGeneratedSerialDescriptor.addElement("hide_label", true);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("keyboard_type", true);
        pluginGeneratedSerialDescriptor.addElement(AnnotatedPrivateKey.LABEL, true);
        pluginGeneratedSerialDescriptor.addElement("placeholder_text", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("toolbar", true);
        pluginGeneratedSerialDescriptor.addElement("validators", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiTextInput$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiTextInput.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(kSerializerArr[1]);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(kSerializerArr[2]);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(kSerializerArr[6]);
        KSerializer<?> nullable4 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> kSerializer = kSerializerArr[9];
        KSerializer<?> kSerializer2 = kSerializerArr[10];
        KSerializer<?> kSerializer3 = kSerializerArr[12];
        KSerializer<?> nullable5 = BuiltinSerializers.getNullable(SduiTextInputValidators$$serializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, nullable, nullable2, booleanSerializer, stringSerializer, booleanSerializer, nullable3, stringSerializer, nullable4, kSerializer, kSerializer2, SduiTextInputState$$serializer.INSTANCE, kSerializer3, nullable5};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiTextInput deserialize(Decoding2 decoder) {
        boolean zDecodeBooleanElement;
        SduiTextInputAutoCorrectionType sduiTextInputAutoCorrectionType;
        int i;
        SduiTextInputAutoCapitalizationType sduiTextInputAutoCapitalizationType;
        SduiTextInputKeyboardType sduiTextInputKeyboardType;
        SduiTextInputValidators sduiTextInputValidators;
        SduiTextInputState sduiTextInputState;
        SduiComponentType sduiComponentType;
        SduiTextInputSize sduiTextInputSize;
        SduiTextInputToolbar sduiTextInputToolbar;
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiTextInput.$childSerializers;
        int i3 = 10;
        int i4 = 9;
        if (decodingBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 0);
            SduiTextInputAutoCapitalizationType sduiTextInputAutoCapitalizationType2 = (SduiTextInputAutoCapitalizationType) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            sduiTextInputAutoCorrectionType = (SduiTextInputAutoCorrectionType) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            boolean zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 3);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            boolean zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(descriptor2, 5);
            SduiTextInputKeyboardType sduiTextInputKeyboardType2 = (SduiTextInputKeyboardType) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 7);
            String str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, kSerializerArr[9], null);
            SduiTextInputSize sduiTextInputSize2 = (SduiTextInputSize) decodingBeginStructure.decodeSerializableElement(descriptor2, 10, kSerializerArr[10], null);
            SduiTextInputState sduiTextInputState2 = (SduiTextInputState) decodingBeginStructure.decodeSerializableElement(descriptor2, 11, SduiTextInputState$$serializer.INSTANCE, null);
            SduiTextInputToolbar sduiTextInputToolbar2 = (SduiTextInputToolbar) decodingBeginStructure.decodeSerializableElement(descriptor2, 12, kSerializerArr[12], null);
            i = 16383;
            sduiTextInputValidators = (SduiTextInputValidators) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 13, SduiTextInputValidators$$serializer.INSTANCE, null);
            sduiTextInputAutoCapitalizationType = sduiTextInputAutoCapitalizationType2;
            str3 = strDecodeStringElement2;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement2;
            str = str4;
            str2 = strDecodeStringElement;
            sduiTextInputSize = sduiTextInputSize2;
            sduiComponentType = sduiComponentType2;
            sduiTextInputKeyboardType = sduiTextInputKeyboardType2;
            sduiTextInputToolbar = sduiTextInputToolbar2;
            sduiTextInputState = sduiTextInputState2;
        } else {
            boolean z3 = true;
            SduiTextInputAutoCapitalizationType sduiTextInputAutoCapitalizationType3 = null;
            SduiTextInputKeyboardType sduiTextInputKeyboardType3 = null;
            SduiTextInputValidators sduiTextInputValidators2 = null;
            SduiTextInputState sduiTextInputState3 = null;
            SduiComponentType sduiComponentType3 = null;
            SduiTextInputSize sduiTextInputSize3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            int i5 = 6;
            int i6 = 2;
            sduiTextInputAutoCorrectionType = null;
            SduiTextInputToolbar sduiTextInputToolbar3 = null;
            String str5 = null;
            i = 0;
            while (z3) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i4 = 9;
                        i6 = 2;
                        i5 = 6;
                    case 0:
                        zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 0);
                        i |= 1;
                        i3 = 10;
                        i4 = 9;
                        i6 = 2;
                        i5 = 6;
                    case 1:
                        sduiTextInputAutoCapitalizationType3 = (SduiTextInputAutoCapitalizationType) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, kSerializerArr[1], sduiTextInputAutoCapitalizationType3);
                        i |= 2;
                        i3 = 10;
                        i4 = 9;
                        i6 = 2;
                        i5 = 6;
                    case 2:
                        sduiTextInputAutoCorrectionType = (SduiTextInputAutoCorrectionType) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i6, kSerializerArr[i6], sduiTextInputAutoCorrectionType);
                        i |= 4;
                        i3 = 10;
                        i4 = 9;
                        i5 = 6;
                    case 3:
                        zDecodeBooleanElement5 = decodingBeginStructure.decodeBooleanElement(descriptor2, 3);
                        i |= 8;
                        i3 = 10;
                        i4 = 9;
                    case 4:
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i |= 16;
                        i3 = 10;
                        i4 = 9;
                    case 5:
                        zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(descriptor2, 5);
                        i |= 32;
                        i3 = 10;
                        i4 = 9;
                    case 6:
                        sduiTextInputKeyboardType3 = (SduiTextInputKeyboardType) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i5, kSerializerArr[i5], sduiTextInputKeyboardType3);
                        i |= 64;
                        i3 = 10;
                        i4 = 9;
                    case 7:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 7);
                        i |= 128;
                        i4 = 9;
                    case 8:
                        str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, str5);
                        i |= 256;
                        i4 = 9;
                    case 9:
                        int i7 = i4;
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i7, kSerializerArr[i7], sduiComponentType3);
                        i |= 512;
                        i4 = i7;
                    case 10:
                        i2 = i4;
                        sduiTextInputSize3 = (SduiTextInputSize) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, kSerializerArr[i3], sduiTextInputSize3);
                        i |= 1024;
                        i4 = i2;
                    case 11:
                        i2 = i4;
                        sduiTextInputState3 = (SduiTextInputState) decodingBeginStructure.decodeSerializableElement(descriptor2, 11, SduiTextInputState$$serializer.INSTANCE, sduiTextInputState3);
                        i |= 2048;
                        i4 = i2;
                    case 12:
                        i2 = i4;
                        sduiTextInputToolbar3 = (SduiTextInputToolbar) decodingBeginStructure.decodeSerializableElement(descriptor2, 12, kSerializerArr[12], sduiTextInputToolbar3);
                        i |= 4096;
                        i4 = i2;
                    case 13:
                        i2 = i4;
                        sduiTextInputValidators2 = (SduiTextInputValidators) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 13, SduiTextInputValidators$$serializer.INSTANCE, sduiTextInputValidators2);
                        i |= 8192;
                        i4 = i2;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            sduiTextInputAutoCapitalizationType = sduiTextInputAutoCapitalizationType3;
            sduiTextInputKeyboardType = sduiTextInputKeyboardType3;
            sduiTextInputValidators = sduiTextInputValidators2;
            sduiTextInputState = sduiTextInputState3;
            sduiComponentType = sduiComponentType3;
            sduiTextInputSize = sduiTextInputSize3;
            sduiTextInputToolbar = sduiTextInputToolbar3;
            str = str5;
            str2 = strDecodeStringElement3;
            str3 = strDecodeStringElement4;
            z = zDecodeBooleanElement4;
            z2 = zDecodeBooleanElement5;
        }
        boolean z4 = zDecodeBooleanElement;
        int i8 = i;
        SduiTextInputAutoCorrectionType sduiTextInputAutoCorrectionType2 = sduiTextInputAutoCorrectionType;
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiTextInput(i8, z4, sduiTextInputAutoCapitalizationType, sduiTextInputAutoCorrectionType2, z2, str2, z, sduiTextInputKeyboardType, str3, str, sduiComponentType, sduiTextInputSize, sduiTextInputState, sduiTextInputToolbar, sduiTextInputValidators, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiTextInput value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiTextInput.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

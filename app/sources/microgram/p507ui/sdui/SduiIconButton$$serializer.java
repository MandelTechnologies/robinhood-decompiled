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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiIconButton.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiIconButton;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiIconButton$$serializer implements PluginHelperInterfaces<SduiIconButton> {
    public static final SduiIconButton$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiIconButton$$serializer sduiIconButton$$serializer = new SduiIconButton$$serializer();
        INSTANCE = sduiIconButton$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiIconButton", sduiIconButton$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("background_color", true);
        pluginGeneratedSerialDescriptor.addElement("foreground_color", true);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("icon_alt_text", true);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("is_loading", true);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiIconButton$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiIconButton.$childSerializers;
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(sduiThemedColor$$serializer);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(sduiThemedColor$$serializer);
        KSerializer<?> kSerializer = kSerializerArr[3];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> nullable4 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> kSerializer2 = kSerializerArr[8];
        KSerializer<?> kSerializer3 = kSerializerArr[9];
        KSerializer<?> kSerializer4 = kSerializerArr[10];
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{SduiAction2.INSTANCE, nullable, nullable2, kSerializer, nullable3, booleanSerializer, booleanSerializer, nullable4, kSerializer2, kSerializer3, kSerializer4};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiIconButton deserialize(Decoding2 decoder) {
        boolean z;
        SduiButtonType sduiButtonType;
        SduiIconButtonSize sduiIconButtonSize;
        SduiComponentType sduiComponentType;
        String str;
        SduiIcon sduiIcon;
        SduiThemedColor sduiThemedColor;
        String str2;
        SduiAction sduiAction;
        SduiThemedColor sduiThemedColor2;
        int i;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiIconButton.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        int i5 = 0;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, sduiThemedColor$$serializer, null);
            SduiThemedColor sduiThemedColor4 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, sduiThemedColor$$serializer, null);
            SduiIcon sduiIcon2 = (SduiIcon) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 5);
            boolean zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 6);
            String str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            SduiIconButtonSize sduiIconButtonSize2 = (SduiIconButtonSize) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, kSerializerArr[9], null);
            sduiButtonType = (SduiButtonType) decodingBeginStructure.decodeSerializableElement(descriptor2, 10, kSerializerArr[10], null);
            sduiAction = sduiAction2;
            str = str4;
            z = zDecodeBooleanElement2;
            z2 = zDecodeBooleanElement;
            str2 = str3;
            sduiThemedColor2 = sduiThemedColor4;
            i = 2047;
            sduiIconButtonSize = sduiIconButtonSize2;
            sduiIcon = sduiIcon2;
            sduiComponentType = sduiComponentType2;
            sduiThemedColor = sduiThemedColor3;
        } else {
            int i6 = 3;
            boolean z3 = true;
            boolean zDecodeBooleanElement3 = false;
            SduiButtonType sduiButtonType2 = null;
            SduiIconButtonSize sduiIconButtonSize3 = null;
            SduiComponentType sduiComponentType3 = null;
            String str5 = null;
            SduiIcon sduiIcon3 = null;
            String str6 = null;
            SduiThemedColor sduiThemedColor5 = null;
            SduiAction sduiAction3 = null;
            SduiThemedColor sduiThemedColor6 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z3) {
                int i7 = i4;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i3 = 9;
                        i4 = 8;
                        i6 = 3;
                        kSerializerArr = kSerializerArr;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i5 |= 1;
                        kSerializerArr = kSerializerArr;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i6 = 3;
                    case 1:
                        i5 |= 2;
                        sduiThemedColor6 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor6);
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i6 = 3;
                    case 2:
                        sduiThemedColor5 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor5);
                        i5 |= 4;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                        i6 = 3;
                    case 3:
                        sduiIcon3 = (SduiIcon) decodingBeginStructure.decodeSerializableElement(descriptor2, i6, kSerializerArr[i6], sduiIcon3);
                        i5 |= 8;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 4:
                        str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str6);
                        i5 |= 16;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 5:
                        i5 |= 32;
                        zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(descriptor2, 5);
                        i2 = 10;
                        i4 = 8;
                    case 6:
                        zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(descriptor2, 6);
                        i5 |= 64;
                        i2 = 10;
                        i4 = 8;
                    case 7:
                        str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, str5);
                        i5 |= 128;
                        i2 = 10;
                        i4 = 8;
                    case 8:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i7, kSerializerArr[i7], sduiComponentType3);
                        i5 |= 256;
                        i4 = i7;
                        i2 = 10;
                    case 9:
                        sduiIconButtonSize3 = (SduiIconButtonSize) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, kSerializerArr[i3], sduiIconButtonSize3);
                        i5 |= 512;
                        i4 = i7;
                    case 10:
                        sduiButtonType2 = (SduiButtonType) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, kSerializerArr[i2], sduiButtonType2);
                        i5 |= 1024;
                        i4 = i7;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement3;
            sduiButtonType = sduiButtonType2;
            sduiIconButtonSize = sduiIconButtonSize3;
            sduiComponentType = sduiComponentType3;
            str = str5;
            sduiIcon = sduiIcon3;
            sduiThemedColor = sduiThemedColor6;
            str2 = str6;
            sduiAction = sduiAction3;
            sduiThemedColor2 = sduiThemedColor5;
            i = i5;
            z2 = zDecodeBooleanElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiIconButton(i, sduiAction, sduiThemedColor, sduiThemedColor2, sduiIcon, str2, z2, z, str, sduiComponentType, sduiIconButtonSize, sduiButtonType, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiIconButton value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiIconButton.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

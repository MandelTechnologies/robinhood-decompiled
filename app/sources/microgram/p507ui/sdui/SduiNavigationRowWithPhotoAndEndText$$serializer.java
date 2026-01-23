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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiNavigationRowWithPhotoAndEndText.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiNavigationRowWithPhotoAndEndText;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiNavigationRowWithPhotoAndEndText$$serializer implements PluginHelperInterfaces<SduiNavigationRowWithPhotoAndEndText> {
    public static final SduiNavigationRowWithPhotoAndEndText$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiNavigationRowWithPhotoAndEndText$$serializer sduiNavigationRowWithPhotoAndEndText$$serializer = new SduiNavigationRowWithPhotoAndEndText$$serializer();
        INSTANCE = sduiNavigationRowWithPhotoAndEndText$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiNavigationRowWithPhotoAndEndText", sduiNavigationRowWithPhotoAndEndText$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("backup_photo_text", true);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("metadata_subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("metadata_title", false);
        pluginGeneratedSerialDescriptor.addElement("photo_url", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiNavigationRowWithPhotoAndEndText$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiNavigationRowWithPhotoAndEndText.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiAction2.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(stringSerializer);
        SduiRichText$$serializer sduiRichText$$serializer = SduiRichText$$serializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, BooleanSerializer.INSTANCE, nullable3, BuiltinSerializers.getNullable(sduiRichText$$serializer), sduiRichText$$serializer, BuiltinSerializers.getNullable(stringSerializer), kSerializerArr[7], BuiltinSerializers.getNullable(sduiRichText$$serializer), sduiRichText$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiNavigationRowWithPhotoAndEndText deserialize(Decoding2 decoder) {
        boolean z;
        SduiRichText sduiRichText;
        SduiComponentType sduiComponentType;
        SduiRichText sduiRichText2;
        String str;
        SduiRichText sduiRichText3;
        SduiRichText sduiRichText4;
        String str2;
        String str3;
        int i;
        SduiAction sduiAction;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiNavigationRowWithPhotoAndEndText.$childSerializers;
        int i2 = 9;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, stringSerializer, null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
            String str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            SduiRichText$$serializer sduiRichText$$serializer = SduiRichText$$serializer.INSTANCE;
            SduiRichText sduiRichText5 = (SduiRichText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, sduiRichText$$serializer, null);
            SduiRichText sduiRichText6 = (SduiRichText) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, sduiRichText$$serializer, null);
            String str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            SduiRichText sduiRichText7 = (SduiRichText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, sduiRichText$$serializer, null);
            sduiComponentType = sduiComponentType2;
            sduiAction = sduiAction2;
            sduiRichText4 = (SduiRichText) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, sduiRichText$$serializer, null);
            str = str6;
            sduiRichText2 = sduiRichText6;
            str2 = str5;
            sduiRichText = sduiRichText7;
            sduiRichText3 = sduiRichText5;
            z = zDecodeBooleanElement;
            i = 1023;
            str3 = str4;
        } else {
            int i3 = 7;
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            SduiRichText sduiRichText8 = null;
            SduiComponentType sduiComponentType3 = null;
            SduiRichText sduiRichText9 = null;
            String str7 = null;
            SduiRichText sduiRichText10 = null;
            SduiRichText sduiRichText11 = null;
            String str8 = null;
            SduiAction sduiAction3 = null;
            int i4 = 0;
            String str9 = null;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 7;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i4 |= 1;
                        i2 = 9;
                        i3 = 7;
                    case 1:
                        str9 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, StringSerializer.INSTANCE, str9);
                        i4 |= 2;
                        i2 = 9;
                        i3 = 7;
                    case 2:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
                        i4 |= 4;
                        i2 = 9;
                        i3 = 7;
                    case 3:
                        str8 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str8);
                        i4 |= 8;
                        i2 = 9;
                        i3 = 7;
                    case 4:
                        sduiRichText10 = (SduiRichText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiRichText$$serializer.INSTANCE, sduiRichText10);
                        i4 |= 16;
                        i2 = 9;
                        i3 = 7;
                    case 5:
                        sduiRichText9 = (SduiRichText) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, SduiRichText$$serializer.INSTANCE, sduiRichText9);
                        i4 |= 32;
                        i2 = 9;
                        i3 = 7;
                    case 6:
                        str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, str7);
                        i4 |= 64;
                        i2 = 9;
                        i3 = 7;
                    case 7:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, kSerializerArr[i3], sduiComponentType3);
                        i4 |= 128;
                        i2 = 9;
                    case 8:
                        sduiRichText8 = (SduiRichText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, SduiRichText$$serializer.INSTANCE, sduiRichText8);
                        i4 |= 256;
                        i2 = 9;
                    case 9:
                        sduiRichText11 = (SduiRichText) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, SduiRichText$$serializer.INSTANCE, sduiRichText11);
                        i4 |= 512;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            sduiRichText = sduiRichText8;
            sduiComponentType = sduiComponentType3;
            sduiRichText2 = sduiRichText9;
            str = str7;
            sduiRichText3 = sduiRichText10;
            sduiRichText4 = sduiRichText11;
            str2 = str8;
            str3 = str9;
            i = i4;
            sduiAction = sduiAction3;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiNavigationRowWithPhotoAndEndText(i, sduiAction, str3, z, str2, sduiRichText3, sduiRichText2, str, sduiComponentType, sduiRichText, sduiRichText4, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiNavigationRowWithPhotoAndEndText value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiNavigationRowWithPhotoAndEndText.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

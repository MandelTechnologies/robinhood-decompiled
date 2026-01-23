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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiNavigationRowWithIconAndEndText.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiNavigationRowWithIconAndEndText;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiNavigationRowWithIconAndEndText$$serializer implements PluginHelperInterfaces<SduiNavigationRowWithIconAndEndText> {
    public static final SduiNavigationRowWithIconAndEndText$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiNavigationRowWithIconAndEndText$$serializer sduiNavigationRowWithIconAndEndText$$serializer = new SduiNavigationRowWithIconAndEndText$$serializer();
        INSTANCE = sduiNavigationRowWithIconAndEndText$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiNavigationRowWithIconAndEndText", sduiNavigationRowWithIconAndEndText$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("metadata_text", false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiNavigationRowWithIconAndEndText$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiNavigationRowWithIconAndEndText.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiAction2.INSTANCE);
        KSerializer<?> kSerializer = kSerializerArr[1];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, kSerializer, BooleanSerializer.INSTANCE, BuiltinSerializers.getNullable(stringSerializer), stringSerializer, kSerializerArr[5], BuiltinSerializers.getNullable(stringSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiNavigationRowWithIconAndEndText deserialize(Decoding2 decoder) {
        boolean z;
        String str;
        SduiComponentType sduiComponentType;
        int i;
        SduiAction sduiAction;
        SduiIcon sduiIcon;
        String str2;
        String str3;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiNavigationRowWithIconAndEndText.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            SduiIcon sduiIcon2 = (SduiIcon) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            String str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            sduiComponentType = sduiComponentType2;
            sduiAction = sduiAction2;
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 7);
            str = str5;
            str2 = str4;
            str3 = strDecodeStringElement2;
            z = zDecodeBooleanElement;
            i = 255;
            sduiIcon = sduiIcon2;
        } else {
            int i4 = 1;
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            String str6 = null;
            SduiAction sduiAction3 = null;
            SduiIcon sduiIcon3 = null;
            String str7 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i5 = 0;
            SduiComponentType sduiComponentType3 = null;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 6;
                        i4 = 1;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 1;
                    case 1:
                        sduiIcon3 = (SduiIcon) decodingBeginStructure.decodeSerializableElement(descriptor2, i4, kSerializerArr[i4], sduiIcon3);
                        i5 |= 2;
                        i2 = 7;
                        i3 = 6;
                    case 2:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
                        i5 |= 4;
                    case 3:
                        str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str7);
                        i5 |= 8;
                    case 4:
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i5 |= 16;
                    case 5:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], sduiComponentType3);
                        i5 |= 32;
                    case 6:
                        str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, StringSerializer.INSTANCE, str6);
                        i5 |= 64;
                    case 7:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i5 |= 128;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            str = str6;
            sduiComponentType = sduiComponentType3;
            i = i5;
            sduiAction = sduiAction3;
            sduiIcon = sduiIcon3;
            str2 = str7;
            str3 = strDecodeStringElement3;
            strDecodeStringElement = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiNavigationRowWithIconAndEndText(i, sduiAction, sduiIcon, z, str2, str3, sduiComponentType, str, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiNavigationRowWithIconAndEndText value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiNavigationRowWithIconAndEndText.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

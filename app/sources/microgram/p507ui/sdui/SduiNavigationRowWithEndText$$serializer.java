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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiNavigationRowWithEndText.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiNavigationRowWithEndText;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiNavigationRowWithEndText$$serializer implements PluginHelperInterfaces<SduiNavigationRowWithEndText> {
    public static final SduiNavigationRowWithEndText$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiNavigationRowWithEndText$$serializer sduiNavigationRowWithEndText$$serializer = new SduiNavigationRowWithEndText$$serializer();
        INSTANCE = sduiNavigationRowWithEndText$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiNavigationRowWithEndText", sduiNavigationRowWithEndText$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("markdown_subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("metadata_text", false);
        pluginGeneratedSerialDescriptor.addElement("metadata_text_color", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiNavigationRowWithEndText$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiNavigationRowWithEndText.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiAction2.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, BooleanSerializer.INSTANCE, BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), stringSerializer, BuiltinSerializers.getNullable(SduiThemedColor$$serializer.INSTANCE), kSerializerArr[6], BuiltinSerializers.getNullable(stringSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiNavigationRowWithEndText deserialize(Decoding2 decoder) {
        int i;
        String str;
        SduiComponentType sduiComponentType;
        SduiThemedColor sduiThemedColor;
        String str2;
        boolean z;
        SduiAction sduiAction;
        String str3;
        String str4;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiNavigationRowWithEndText.$childSerializers;
        int i2 = 7;
        int i3 = 5;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            String str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            SduiThemedColor sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, SduiThemedColor$$serializer.INSTANCE, null);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            sduiAction = sduiAction2;
            str = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            sduiThemedColor = sduiThemedColor2;
            str2 = str6;
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 8);
            str4 = strDecodeStringElement2;
            str3 = str5;
            i = 511;
            z = zDecodeBooleanElement;
        } else {
            boolean z2 = true;
            int i4 = 0;
            String str7 = null;
            SduiComponentType sduiComponentType2 = null;
            SduiThemedColor sduiThemedColor3 = null;
            SduiAction sduiAction3 = null;
            String str8 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement2 = false;
            String str9 = null;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 5;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 5;
                    case 1:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 5;
                    case 2:
                        str8 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str8);
                        i4 |= 4;
                        i2 = 7;
                        i3 = 5;
                    case 3:
                        str9 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str9);
                        i4 |= 8;
                        i2 = 7;
                        i3 = 5;
                    case 4:
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i4 |= 16;
                    case 5:
                        sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor3);
                        i4 |= 32;
                    case 6:
                        sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], sduiComponentType2);
                        i4 |= 64;
                    case 7:
                        str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, StringSerializer.INSTANCE, str7);
                        i4 |= 128;
                    case 8:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 8);
                        i4 |= 256;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i4;
            str = str7;
            sduiComponentType = sduiComponentType2;
            sduiThemedColor = sduiThemedColor3;
            str2 = str9;
            z = zDecodeBooleanElement2;
            sduiAction = sduiAction3;
            str3 = str8;
            str4 = strDecodeStringElement3;
            strDecodeStringElement = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiNavigationRowWithEndText(i, sduiAction, z, str3, str2, str4, sduiThemedColor, sduiComponentType, str, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiNavigationRowWithEndText value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiNavigationRowWithEndText.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

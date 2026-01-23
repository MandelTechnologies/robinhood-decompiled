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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiTableInstrumentName.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiTableInstrumentName;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiTableInstrumentName$$serializer implements PluginHelperInterfaces<SduiTableInstrumentName> {
    public static final SduiTableInstrumentName$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiTableInstrumentName$$serializer sduiTableInstrumentName$$serializer = new SduiTableInstrumentName$$serializer();
        INSTANCE = sduiTableInstrumentName$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiTableInstrumentName", sduiTableInstrumentName$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("collapsed_symbol_text_override", true);
        pluginGeneratedSerialDescriptor.addElement("identifier", true);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("name_color", true);
        pluginGeneratedSerialDescriptor.addElement("name_text_style", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("symbol", false);
        pluginGeneratedSerialDescriptor.addElement("symbol_color", true);
        pluginGeneratedSerialDescriptor.addElement("symbol_text_style", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiTableInstrumentName$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiTableInstrumentName.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> kSerializer = kSerializerArr[4];
        KSerializer<?> kSerializer2 = kSerializerArr[5];
        KSerializer<?> kSerializer3 = kSerializerArr[9];
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        return new KSerializer[]{nullable, stringSerializer, stringSerializer, sduiThemedColor$$serializer, kSerializer, kSerializer2, SduiTableInstrumentNameState$$serializer.INSTANCE, stringSerializer, sduiThemedColor$$serializer, kSerializer3};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiTableInstrumentName deserialize(Decoding2 decoder) {
        int i;
        SduiTableInstrumentNameState sduiTableInstrumentNameState;
        SduiComponentType sduiComponentType;
        SduiTextStyle sduiTextStyle;
        SduiThemedColor sduiThemedColor;
        SduiTextStyle sduiTextStyle2;
        SduiThemedColor sduiThemedColor2;
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiTableInstrumentName.$childSerializers;
        int i2 = 7;
        String str5 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, sduiThemedColor$$serializer, null);
            SduiTextStyle sduiTextStyle3 = (SduiTextStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            SduiTableInstrumentNameState sduiTableInstrumentNameState2 = (SduiTableInstrumentNameState) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, SduiTableInstrumentNameState$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 7);
            SduiThemedColor sduiThemedColor4 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, sduiThemedColor$$serializer, null);
            sduiTextStyle = (SduiTextStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, kSerializerArr[9], null);
            str = str6;
            str4 = strDecodeStringElement3;
            sduiTableInstrumentNameState = sduiTableInstrumentNameState2;
            sduiThemedColor2 = sduiThemedColor3;
            sduiThemedColor = sduiThemedColor4;
            str3 = strDecodeStringElement2;
            i = 1023;
            sduiComponentType = sduiComponentType2;
            sduiTextStyle2 = sduiTextStyle3;
            str2 = strDecodeStringElement;
        } else {
            int i3 = 5;
            int i4 = 4;
            boolean z = true;
            int i5 = 0;
            SduiTableInstrumentNameState sduiTableInstrumentNameState3 = null;
            SduiComponentType sduiComponentType3 = null;
            SduiTextStyle sduiTextStyle4 = null;
            SduiThemedColor sduiThemedColor5 = null;
            SduiTextStyle sduiTextStyle5 = null;
            SduiThemedColor sduiThemedColor6 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 4;
                        i3 = 5;
                    case 0:
                        str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, StringSerializer.INSTANCE, str5);
                        i5 |= 1;
                        i2 = 7;
                        i4 = 4;
                        i3 = 5;
                    case 1:
                        i5 |= 2;
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i2 = 7;
                        i4 = 4;
                        i3 = 5;
                    case 2:
                        strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i5 |= 4;
                        i2 = 7;
                        i4 = 4;
                        i3 = 5;
                    case 3:
                        sduiThemedColor6 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor6);
                        i5 |= 8;
                        i2 = 7;
                        i4 = 4;
                        i3 = 5;
                    case 4:
                        sduiTextStyle5 = (SduiTextStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, i4, kSerializerArr[i4], sduiTextStyle5);
                        i5 |= 16;
                        i2 = 7;
                        i3 = 5;
                    case 5:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, kSerializerArr[i3], sduiComponentType3);
                        i5 |= 32;
                        i2 = 7;
                    case 6:
                        sduiTableInstrumentNameState3 = (SduiTableInstrumentNameState) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, SduiTableInstrumentNameState$$serializer.INSTANCE, sduiTableInstrumentNameState3);
                        i5 |= 64;
                        i2 = 7;
                    case 7:
                        strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i5 |= 128;
                    case 8:
                        sduiThemedColor5 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor5);
                        i5 |= 256;
                    case 9:
                        sduiTextStyle4 = (SduiTextStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, kSerializerArr[9], sduiTextStyle4);
                        i5 |= 512;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            sduiTableInstrumentNameState = sduiTableInstrumentNameState3;
            sduiComponentType = sduiComponentType3;
            sduiTextStyle = sduiTextStyle4;
            sduiThemedColor = sduiThemedColor5;
            sduiTextStyle2 = sduiTextStyle5;
            sduiThemedColor2 = sduiThemedColor6;
            str = str5;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiTableInstrumentName(i, str, str2, str3, sduiThemedColor2, sduiTextStyle2, sduiComponentType, sduiTableInstrumentNameState, str4, sduiThemedColor, sduiTextStyle, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiTableInstrumentName value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiTableInstrumentName.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

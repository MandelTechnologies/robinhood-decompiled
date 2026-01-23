package microgram.p507ui.sdui;

import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ActionButton;
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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiNavigationRowWithEndButton.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiNavigationRowWithEndButton;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiNavigationRowWithEndButton$$serializer implements PluginHelperInterfaces<SduiNavigationRowWithEndButton> {
    public static final SduiNavigationRowWithEndButton$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiNavigationRowWithEndButton$$serializer sduiNavigationRowWithEndButton$$serializer = new SduiNavigationRowWithEndButton$$serializer();
        INSTANCE = sduiNavigationRowWithEndButton$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiNavigationRowWithEndButton", sduiNavigationRowWithEndButton$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement(ActionButton.f10629type, false);
        pluginGeneratedSerialDescriptor.addElement("button_background_color", true);
        pluginGeneratedSerialDescriptor.addElement("button_foreground_color", true);
        pluginGeneratedSerialDescriptor.addElement("button_label", false);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("text_color", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiNavigationRowWithEndButton$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiNavigationRowWithEndButton.$childSerializers;
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(sduiThemedColor$$serializer);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(sduiThemedColor$$serializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> kSerializer = kSerializerArr[5];
        KSerializer<?> nullable4 = BuiltinSerializers.getNullable(sduiThemedColor$$serializer);
        SduiText$$serializer sduiText$$serializer = SduiText$$serializer.INSTANCE;
        return new KSerializer[]{SduiAction2.INSTANCE, nullable, nullable2, stringSerializer, nullable3, kSerializer, sduiText$$serializer, nullable4, sduiText$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiNavigationRowWithEndButton deserialize(Decoding2 decoder) {
        int i;
        SduiThemedColor sduiThemedColor;
        SduiText sduiText;
        SduiText sduiText2;
        SduiComponentType sduiComponentType;
        String str;
        SduiAction sduiAction;
        SduiThemedColor sduiThemedColor2;
        SduiThemedColor sduiThemedColor3;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiNavigationRowWithEndButton.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        SduiAction sduiAction2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction3 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
            SduiThemedColor sduiThemedColor4 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, sduiThemedColor$$serializer, null);
            SduiThemedColor sduiThemedColor5 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, sduiThemedColor$$serializer, null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            String str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            SduiText$$serializer sduiText$$serializer = SduiText$$serializer.INSTANCE;
            SduiText sduiText3 = (SduiText) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, sduiText$$serializer, null);
            sduiComponentType = sduiComponentType2;
            sduiAction = sduiAction3;
            sduiThemedColor = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, sduiThemedColor$$serializer, null);
            sduiText2 = sduiText3;
            str2 = strDecodeStringElement;
            sduiText = (SduiText) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, sduiText$$serializer, null);
            str = str3;
            sduiThemedColor3 = sduiThemedColor5;
            i = 511;
            sduiThemedColor2 = sduiThemedColor4;
        } else {
            boolean z = true;
            int i5 = 0;
            SduiThemedColor sduiThemedColor6 = null;
            SduiText sduiText4 = null;
            SduiText sduiText5 = null;
            SduiComponentType sduiComponentType3 = null;
            String str4 = null;
            SduiThemedColor sduiThemedColor7 = null;
            SduiThemedColor sduiThemedColor8 = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int i6 = i4;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 6;
                        i4 = 5;
                    case 0:
                        sduiAction2 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction2);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 1:
                        sduiThemedColor7 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor7);
                        i5 |= 2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 2:
                        sduiThemedColor8 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor8);
                        i5 |= 4;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 3:
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                        i5 |= 8;
                        i2 = 7;
                        i4 = 5;
                    case 4:
                        str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str4);
                        i5 |= 16;
                        i2 = 7;
                        i4 = 5;
                    case 5:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i6, kSerializerArr[i6], sduiComponentType3);
                        i5 |= 32;
                        i4 = i6;
                        i2 = 7;
                    case 6:
                        sduiText5 = (SduiText) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, SduiText$$serializer.INSTANCE, sduiText5);
                        i5 |= 64;
                        i4 = i6;
                    case 7:
                        sduiThemedColor6 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor6);
                        i5 |= 128;
                        i4 = i6;
                    case 8:
                        sduiText4 = (SduiText) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, SduiText$$serializer.INSTANCE, sduiText4);
                        i5 |= 256;
                        i4 = i6;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            sduiThemedColor = sduiThemedColor6;
            sduiText = sduiText4;
            sduiText2 = sduiText5;
            sduiComponentType = sduiComponentType3;
            str = str4;
            sduiAction = sduiAction2;
            sduiThemedColor2 = sduiThemedColor7;
            sduiThemedColor3 = sduiThemedColor8;
            str2 = strDecodeStringElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiNavigationRowWithEndButton(i, sduiAction, sduiThemedColor2, sduiThemedColor3, str2, str, sduiComponentType, sduiText2, sduiThemedColor, sduiText, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiNavigationRowWithEndButton value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiNavigationRowWithEndButton.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

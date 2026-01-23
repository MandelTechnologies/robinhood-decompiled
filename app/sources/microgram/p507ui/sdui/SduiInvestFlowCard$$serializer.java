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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiInvestFlowCard.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiInvestFlowCard;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiInvestFlowCard$$serializer implements PluginHelperInterfaces<SduiInvestFlowCard> {
    public static final SduiInvestFlowCard$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiInvestFlowCard$$serializer sduiInvestFlowCard$$serializer = new SduiInvestFlowCard$$serializer();
        INSTANCE = sduiInvestFlowCard$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiInvestFlowCard", sduiInvestFlowCard$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("asset_uuid", false);
        pluginGeneratedSerialDescriptor.addElement("background_color", true);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("is_selected", true);
        pluginGeneratedSerialDescriptor.addElement("metadata_1", true);
        pluginGeneratedSerialDescriptor.addElement("metadata_2", true);
        pluginGeneratedSerialDescriptor.addElement("poll_interval", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiInvestFlowCard$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiInvestFlowCard.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(kSerializerArr[3]);
        SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
        return new KSerializer[]{SduiAction2.INSTANCE, StringSerializer.INSTANCE, SduiThemedColor$$serializer.INSTANCE, nullable, BooleanSerializer.INSTANCE, BuiltinSerializers.getNullable(sduiMarkdownText$$serializer), BuiltinSerializers.getNullable(sduiMarkdownText$$serializer), DoubleSerializer.INSTANCE, kSerializerArr[8], sduiMarkdownText$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiInvestFlowCard deserialize(Decoding2 decoder) {
        int i;
        SduiMarkdownText sduiMarkdownText;
        SduiComponentType sduiComponentType;
        SduiMarkdownText sduiMarkdownText2;
        SduiMarkdownText sduiMarkdownText3;
        SduiIcon sduiIcon;
        SduiThemedColor sduiThemedColor;
        boolean z;
        SduiAction sduiAction;
        String str;
        double d;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiInvestFlowCard.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            SduiThemedColor sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, SduiThemedColor$$serializer.INSTANCE, null);
            SduiIcon sduiIcon2 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 4);
            SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
            SduiMarkdownText sduiMarkdownText4 = (SduiMarkdownText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, sduiMarkdownText$$serializer, null);
            SduiMarkdownText sduiMarkdownText5 = (SduiMarkdownText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, sduiMarkdownText$$serializer, null);
            double dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(descriptor2, 7);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            sduiAction = sduiAction2;
            sduiMarkdownText = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, sduiMarkdownText$$serializer, null);
            i = 1023;
            sduiMarkdownText3 = sduiMarkdownText5;
            sduiMarkdownText2 = sduiMarkdownText4;
            z = zDecodeBooleanElement;
            sduiThemedColor = sduiThemedColor2;
            sduiIcon = sduiIcon2;
            str = strDecodeStringElement;
            d = dDecodeDoubleElement;
        } else {
            int i4 = 3;
            boolean z2 = true;
            int i5 = 0;
            SduiMarkdownText sduiMarkdownText6 = null;
            SduiComponentType sduiComponentType2 = null;
            SduiMarkdownText sduiMarkdownText7 = null;
            SduiMarkdownText sduiMarkdownText8 = null;
            SduiIcon sduiIcon3 = null;
            double dDecodeDoubleElement2 = 0.0d;
            boolean zDecodeBooleanElement2 = false;
            SduiThemedColor sduiThemedColor3 = null;
            SduiAction sduiAction3 = null;
            String strDecodeStringElement2 = null;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 7;
                        i4 = 3;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i5 |= 1;
                        i2 = 9;
                        i3 = 7;
                        i4 = 3;
                    case 1:
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i5 |= 2;
                        i2 = 9;
                        i3 = 7;
                        i4 = 3;
                    case 2:
                        sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor3);
                        i5 |= 4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 3;
                    case 3:
                        sduiIcon3 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i4, kSerializerArr[i4], sduiIcon3);
                        i5 |= 8;
                        i2 = 9;
                        i3 = 7;
                    case 4:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 4);
                        i5 |= 16;
                        i2 = 9;
                    case 5:
                        sduiMarkdownText7 = (SduiMarkdownText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText7);
                        i5 |= 32;
                        i2 = 9;
                    case 6:
                        sduiMarkdownText8 = (SduiMarkdownText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText8);
                        i5 |= 64;
                        i2 = 9;
                    case 7:
                        dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(descriptor2, i3);
                        i5 |= 128;
                    case 8:
                        sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], sduiComponentType2);
                        i5 |= 256;
                    case 9:
                        sduiMarkdownText6 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText6);
                        i5 |= 512;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            sduiMarkdownText = sduiMarkdownText6;
            sduiComponentType = sduiComponentType2;
            sduiMarkdownText2 = sduiMarkdownText7;
            sduiMarkdownText3 = sduiMarkdownText8;
            sduiIcon = sduiIcon3;
            sduiThemedColor = sduiThemedColor3;
            z = zDecodeBooleanElement2;
            sduiAction = sduiAction3;
            str = strDecodeStringElement2;
            d = dDecodeDoubleElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiInvestFlowCard(i, sduiAction, str, sduiThemedColor, sduiIcon, z, sduiMarkdownText2, sduiMarkdownText3, d, sduiComponentType, sduiMarkdownText, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiInvestFlowCard value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiInvestFlowCard.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiNavigationRowWithPogGroupAndEndText.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiNavigationRowWithPogGroupAndEndText;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiNavigationRowWithPogGroupAndEndText$$serializer implements PluginHelperInterfaces<SduiNavigationRowWithPogGroupAndEndText> {
    public static final SduiNavigationRowWithPogGroupAndEndText$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiNavigationRowWithPogGroupAndEndText$$serializer sduiNavigationRowWithPogGroupAndEndText$$serializer = new SduiNavigationRowWithPogGroupAndEndText$$serializer();
        INSTANCE = sduiNavigationRowWithPogGroupAndEndText$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiNavigationRowWithPogGroupAndEndText", sduiNavigationRowWithPogGroupAndEndText$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("metadata_subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("metadata_title", true);
        pluginGeneratedSerialDescriptor.addElement("pog_group", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiNavigationRowWithPogGroupAndEndText$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiNavigationRowWithPogGroupAndEndText.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiAction2.INSTANCE);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(StringSerializer.INSTANCE);
        SduiRichText$$serializer sduiRichText$$serializer = SduiRichText$$serializer.INSTANCE;
        return new KSerializer[]{nullable, BooleanSerializer.INSTANCE, nullable2, BuiltinSerializers.getNullable(sduiRichText$$serializer), BuiltinSerializers.getNullable(sduiRichText$$serializer), BuiltinSerializers.getNullable(SduiPogGroup$$serializer.INSTANCE), kSerializerArr[6], BuiltinSerializers.getNullable(sduiRichText$$serializer), sduiRichText$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiNavigationRowWithPogGroupAndEndText deserialize(Decoding2 decoder) {
        int i;
        SduiRichText sduiRichText;
        SduiComponentType sduiComponentType;
        SduiRichText sduiRichText2;
        SduiPogGroup sduiPogGroup;
        SduiRichText sduiRichText3;
        SduiRichText sduiRichText4;
        boolean z;
        SduiAction sduiAction;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiNavigationRowWithPogGroupAndEndText.$childSerializers;
        int i2 = 7;
        int i3 = 8;
        int i4 = 6;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
            String str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, null);
            SduiRichText$$serializer sduiRichText$$serializer = SduiRichText$$serializer.INSTANCE;
            SduiRichText sduiRichText5 = (SduiRichText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, sduiRichText$$serializer, null);
            SduiRichText sduiRichText6 = (SduiRichText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, sduiRichText$$serializer, null);
            SduiPogGroup sduiPogGroup2 = (SduiPogGroup) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, SduiPogGroup$$serializer.INSTANCE, null);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            sduiAction = sduiAction2;
            sduiRichText2 = (SduiRichText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, sduiRichText$$serializer, null);
            sduiPogGroup = sduiPogGroup2;
            sduiRichText4 = sduiRichText5;
            sduiRichText = (SduiRichText) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, sduiRichText$$serializer, null);
            sduiRichText3 = sduiRichText6;
            str = str2;
            i = 511;
            z = zDecodeBooleanElement;
        } else {
            boolean z2 = true;
            int i5 = 0;
            SduiRichText sduiRichText7 = null;
            SduiComponentType sduiComponentType2 = null;
            SduiRichText sduiRichText8 = null;
            SduiPogGroup sduiPogGroup3 = null;
            SduiRichText sduiRichText9 = null;
            SduiAction sduiAction3 = null;
            String str3 = null;
            boolean zDecodeBooleanElement2 = false;
            SduiRichText sduiRichText10 = null;
            while (z2) {
                int i6 = i4;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 8;
                        i4 = 6;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 8;
                        i4 = 6;
                    case 1:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
                        i5 |= 2;
                        i2 = 7;
                        i4 = 6;
                    case 2:
                        str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str3);
                        i5 |= 4;
                        i2 = 7;
                        i4 = 6;
                    case 3:
                        sduiRichText10 = (SduiRichText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiRichText$$serializer.INSTANCE, sduiRichText10);
                        i5 |= 8;
                        i2 = 7;
                        i4 = 6;
                    case 4:
                        sduiRichText9 = (SduiRichText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiRichText$$serializer.INSTANCE, sduiRichText9);
                        i5 |= 16;
                        i2 = 7;
                        i4 = 6;
                    case 5:
                        sduiPogGroup3 = (SduiPogGroup) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, SduiPogGroup$$serializer.INSTANCE, sduiPogGroup3);
                        i5 |= 32;
                        i2 = 7;
                        i4 = 6;
                    case 6:
                        sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i6, kSerializerArr[i6], sduiComponentType2);
                        i5 |= 64;
                        i4 = i6;
                        i2 = 7;
                    case 7:
                        sduiRichText8 = (SduiRichText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, SduiRichText$$serializer.INSTANCE, sduiRichText8);
                        i5 |= 128;
                        i4 = i6;
                    case 8:
                        sduiRichText7 = (SduiRichText) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, SduiRichText$$serializer.INSTANCE, sduiRichText7);
                        i5 |= 256;
                        i4 = i6;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            sduiRichText = sduiRichText7;
            sduiComponentType = sduiComponentType2;
            sduiRichText2 = sduiRichText8;
            sduiPogGroup = sduiPogGroup3;
            sduiRichText3 = sduiRichText9;
            sduiRichText4 = sduiRichText10;
            z = zDecodeBooleanElement2;
            sduiAction = sduiAction3;
            str = str3;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiNavigationRowWithPogGroupAndEndText(i, sduiAction, z, str, sduiRichText4, sduiRichText3, sduiPogGroup, sduiComponentType, sduiRichText2, sduiRichText, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiNavigationRowWithPogGroupAndEndText value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiNavigationRowWithPogGroupAndEndText.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

package microgram.p507ui.sdui;

import com.robinhood.utils.extensions.ResourceTypes;
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
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElementSerializers6;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiInfoBanner.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiInfoBanner;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiInfoBanner$$serializer implements PluginHelperInterfaces<SduiInfoBanner> {
    public static final SduiInfoBanner$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiInfoBanner$$serializer sduiInfoBanner$$serializer = new SduiInfoBanner$$serializer();
        INSTANCE = sduiInfoBanner$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiInfoBanner", sduiInfoBanner$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("can_dismiss", true);
        pluginGeneratedSerialDescriptor.addElement("cta_action", true);
        pluginGeneratedSerialDescriptor.addElement("cta_text", true);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("logging_context", true);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("receipt_uuid", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement(ResourceTypes.STYLE, true);
        pluginGeneratedSerialDescriptor.addElement("text", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiInfoBanner$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiInfoBanner.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiAction2.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BooleanSerializer.INSTANCE, nullable, BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(kSerializerArr[3]), BuiltinSerializers.getNullable(JsonElementSerializers6.INSTANCE), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(stringSerializer), kSerializerArr[7], SduiInfoBannerStyle$$serializer.INSTANCE, SduiRichText$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiInfoBanner deserialize(Decoding2 decoder) {
        boolean zDecodeBooleanElement;
        SduiInfoBannerStyle sduiInfoBannerStyle;
        SduiComponentType sduiComponentType;
        String str;
        JsonElement6 jsonElement6;
        SduiRichText sduiRichText;
        String str2;
        SduiIcon sduiIcon;
        String str3;
        int i;
        SduiAction sduiAction;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiInfoBanner.$childSerializers;
        int i2 = 9;
        if (decodingBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 0);
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiAction2.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            SduiIcon sduiIcon2 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            JsonElement6 jsonElement62 = (JsonElement6) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, JsonElementSerializers6.INSTANCE, null);
            String str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            String str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            SduiInfoBannerStyle sduiInfoBannerStyle2 = (SduiInfoBannerStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, SduiInfoBannerStyle$$serializer.INSTANCE, null);
            sduiComponentType = sduiComponentType2;
            sduiRichText = (SduiRichText) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, SduiRichText$$serializer.INSTANCE, null);
            str = str6;
            str2 = str5;
            sduiInfoBannerStyle = sduiInfoBannerStyle2;
            jsonElement6 = jsonElement62;
            str3 = str4;
            i = 1023;
            sduiIcon = sduiIcon2;
            sduiAction = sduiAction2;
        } else {
            int i3 = 7;
            int i4 = 3;
            boolean z = true;
            zDecodeBooleanElement = false;
            SduiInfoBannerStyle sduiInfoBannerStyle3 = null;
            SduiComponentType sduiComponentType3 = null;
            String str7 = null;
            JsonElement6 jsonElement63 = null;
            SduiRichText sduiRichText2 = null;
            String str8 = null;
            SduiIcon sduiIcon3 = null;
            SduiAction sduiAction3 = null;
            int i5 = 0;
            String str9 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 3;
                        i3 = 7;
                    case 0:
                        zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 0);
                        i5 |= 1;
                        i2 = 9;
                        i4 = 3;
                        i3 = 7;
                    case 1:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiAction2.INSTANCE, sduiAction3);
                        i5 |= 2;
                        i2 = 9;
                        i4 = 3;
                        i3 = 7;
                    case 2:
                        str9 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str9);
                        i5 |= 4;
                        i2 = 9;
                        i4 = 3;
                        i3 = 7;
                    case 3:
                        sduiIcon3 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i4, kSerializerArr[i4], sduiIcon3);
                        i5 |= 8;
                        i2 = 9;
                        i3 = 7;
                    case 4:
                        jsonElement63 = (JsonElement6) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, JsonElementSerializers6.INSTANCE, jsonElement63);
                        i5 |= 16;
                        i2 = 9;
                        i3 = 7;
                    case 5:
                        str8 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, str8);
                        i5 |= 32;
                        i2 = 9;
                        i3 = 7;
                    case 6:
                        str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, str7);
                        i5 |= 64;
                        i2 = 9;
                        i3 = 7;
                    case 7:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, kSerializerArr[i3], sduiComponentType3);
                        i5 |= 128;
                        i2 = 9;
                    case 8:
                        sduiInfoBannerStyle3 = (SduiInfoBannerStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, SduiInfoBannerStyle$$serializer.INSTANCE, sduiInfoBannerStyle3);
                        i5 |= 256;
                        i2 = 9;
                    case 9:
                        sduiRichText2 = (SduiRichText) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, SduiRichText$$serializer.INSTANCE, sduiRichText2);
                        i5 |= 512;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            sduiInfoBannerStyle = sduiInfoBannerStyle3;
            sduiComponentType = sduiComponentType3;
            str = str7;
            jsonElement6 = jsonElement63;
            sduiRichText = sduiRichText2;
            str2 = str8;
            sduiIcon = sduiIcon3;
            str3 = str9;
            i = i5;
            sduiAction = sduiAction3;
        }
        boolean z2 = zDecodeBooleanElement;
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiInfoBanner(i, z2, sduiAction, str3, sduiIcon, jsonElement6, str2, str, sduiComponentType, sduiInfoBannerStyle, sduiRichText, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiInfoBanner value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiInfoBanner.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

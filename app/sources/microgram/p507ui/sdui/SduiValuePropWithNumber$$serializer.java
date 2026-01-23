package microgram.p507ui.sdui;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiValuePropWithNumber.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiValuePropWithNumber;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiValuePropWithNumber$$serializer implements PluginHelperInterfaces<SduiValuePropWithNumber> {
    public static final SduiValuePropWithNumber$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiValuePropWithNumber$$serializer sduiValuePropWithNumber$$serializer = new SduiValuePropWithNumber$$serializer();
        INSTANCE = sduiValuePropWithNumber$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiValuePropWithNumber", sduiValuePropWithNumber$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("content_markdown", false);
        pluginGeneratedSerialDescriptor.addElement("content_text_color_override", true);
        pluginGeneratedSerialDescriptor.addElement(InquiryField.FloatField.TYPE2, false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("supplemental_action", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("title_text_color_override", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiValuePropWithNumber$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiValuePropWithNumber.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializers.getNullable(sduiThemedColor$$serializer), LongSerializer.INSTANCE, kSerializerArr[3], BuiltinSerializers.getNullable(SduiTextWithAction$$serializer.INSTANCE), BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(sduiThemedColor$$serializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiValuePropWithNumber deserialize(Decoding2 decoder) {
        int i;
        SduiThemedColor sduiThemedColor;
        String str;
        SduiThemedColor sduiThemedColor2;
        SduiComponentType sduiComponentType;
        SduiTextWithAction sduiTextWithAction;
        String str2;
        long j;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiValuePropWithNumber.$childSerializers;
        int i2 = 6;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, sduiThemedColor$$serializer, null);
            long jDecodeLongElement = decodingBeginStructure.decodeLongElement(descriptor2, 2);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            SduiTextWithAction sduiTextWithAction2 = (SduiTextWithAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiTextWithAction$$serializer.INSTANCE, null);
            String str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, null);
            sduiComponentType = sduiComponentType2;
            str = strDecodeStringElement2;
            sduiThemedColor = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, sduiThemedColor$$serializer, null);
            str2 = str3;
            sduiTextWithAction = sduiTextWithAction2;
            i = 127;
            sduiThemedColor2 = sduiThemedColor3;
            j = jDecodeLongElement;
        } else {
            boolean z2 = true;
            int i3 = 0;
            SduiThemedColor sduiThemedColor4 = null;
            SduiTextWithAction sduiTextWithAction3 = null;
            String str4 = null;
            long jDecodeLongElement2 = 0;
            SduiThemedColor sduiThemedColor5 = null;
            SduiComponentType sduiComponentType3 = null;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                    case 0:
                        z = true;
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        z = true;
                        sduiThemedColor5 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor5);
                        i3 |= 2;
                        i2 = 6;
                    case 2:
                        jDecodeLongElement2 = decodingBeginStructure.decodeLongElement(descriptor2, 2);
                        i3 |= 4;
                    case 3:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], sduiComponentType3);
                        i3 |= 8;
                    case 4:
                        sduiTextWithAction3 = (SduiTextWithAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiTextWithAction$$serializer.INSTANCE, sduiTextWithAction3);
                        i3 |= 16;
                    case 5:
                        str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, str4);
                        i3 |= 32;
                    case 6:
                        sduiThemedColor4 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor4);
                        i3 |= 64;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            sduiThemedColor = sduiThemedColor4;
            str = strDecodeStringElement;
            sduiThemedColor2 = sduiThemedColor5;
            sduiComponentType = sduiComponentType3;
            sduiTextWithAction = sduiTextWithAction3;
            str2 = str4;
            j = jDecodeLongElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiValuePropWithNumber(i, str, sduiThemedColor2, j, sduiComponentType, sduiTextWithAction, str2, sduiThemedColor, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiValuePropWithNumber value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiValuePropWithNumber.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

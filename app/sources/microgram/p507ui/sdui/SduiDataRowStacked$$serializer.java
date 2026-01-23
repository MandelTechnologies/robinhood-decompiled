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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiDataRowStacked.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiDataRowStacked;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiDataRowStacked$$serializer implements PluginHelperInterfaces<SduiDataRowStacked> {
    public static final SduiDataRowStacked$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiDataRowStacked$$serializer sduiDataRowStacked$$serializer = new SduiDataRowStacked$$serializer();
        INSTANCE = sduiDataRowStacked$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiDataRowStacked", sduiDataRowStacked$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("icon_with_action", true);
        pluginGeneratedSerialDescriptor.addElement(AnnotatedPrivateKey.LABEL, false);
        pluginGeneratedSerialDescriptor.addElement("label_color_override", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("value_color_override", true);
        pluginGeneratedSerialDescriptor.addElement("value_description", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiDataRowStacked$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiDataRowStacked.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiIconWithAction$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        return new KSerializer[]{nullable, stringSerializer, BuiltinSerializers.getNullable(sduiThemedColor$$serializer), kSerializerArr[3], stringSerializer, BuiltinSerializers.getNullable(sduiThemedColor$$serializer), BuiltinSerializers.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiDataRowStacked deserialize(Decoding2 decoder) {
        int i;
        String str;
        SduiThemedColor sduiThemedColor;
        SduiIconWithAction sduiIconWithAction;
        String str2;
        SduiThemedColor sduiThemedColor2;
        SduiComponentType sduiComponentType;
        String str3;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiDataRowStacked.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        SduiIconWithAction sduiIconWithAction2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiIconWithAction sduiIconWithAction3 = (SduiIconWithAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiIconWithAction$$serializer.INSTANCE, null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, sduiThemedColor$$serializer, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            SduiThemedColor sduiThemedColor4 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, sduiThemedColor$$serializer, null);
            sduiComponentType = sduiComponentType2;
            sduiIconWithAction = sduiIconWithAction3;
            str = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            sduiThemedColor = sduiThemedColor4;
            str3 = strDecodeStringElement2;
            sduiThemedColor2 = sduiThemedColor3;
            i = 127;
            str2 = strDecodeStringElement;
        } else {
            boolean z = true;
            int i4 = 0;
            String str4 = null;
            SduiThemedColor sduiThemedColor5 = null;
            String strDecodeStringElement3 = null;
            SduiThemedColor sduiThemedColor6 = null;
            SduiComponentType sduiComponentType3 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 5;
                    case 0:
                        sduiIconWithAction2 = (SduiIconWithAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiIconWithAction$$serializer.INSTANCE, sduiIconWithAction2);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 5;
                    case 1:
                        c = 2;
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i4 |= 2;
                        i2 = 6;
                    case 2:
                        c = 2;
                        sduiThemedColor6 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor6);
                        i4 |= 4;
                        i2 = 6;
                    case 3:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], sduiComponentType3);
                        i4 |= 8;
                    case 4:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i4 |= 16;
                    case 5:
                        sduiThemedColor5 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor5);
                        i4 |= 32;
                    case 6:
                        str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, StringSerializer.INSTANCE, str4);
                        i4 |= 64;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i4;
            str = str4;
            sduiThemedColor = sduiThemedColor5;
            sduiIconWithAction = sduiIconWithAction2;
            str2 = strDecodeStringElement3;
            sduiThemedColor2 = sduiThemedColor6;
            sduiComponentType = sduiComponentType3;
            str3 = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiDataRowStacked(i, sduiIconWithAction, str2, sduiThemedColor2, sduiComponentType, str3, sduiThemedColor, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiDataRowStacked value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiDataRowStacked.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

package microgram.p507ui.sdui;

import java.util.Map;
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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiRemoteLottie.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiRemoteLottie;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiRemoteLottie$$serializer implements PluginHelperInterfaces<SduiRemoteLottie> {
    public static final SduiRemoteLottie$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiRemoteLottie$$serializer sduiRemoteLottie$$serializer = new SduiRemoteLottie$$serializer();
        INSTANCE = sduiRemoteLottie$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiRemoteLottie", sduiRemoteLottie$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("animation_text_mapping", true);
        pluginGeneratedSerialDescriptor.addElement("aspect_ratio", true);
        pluginGeneratedSerialDescriptor.addElement("dark_mode_content_link", false);
        pluginGeneratedSerialDescriptor.addElement("light_mode_content_link", false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("should_loop", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiRemoteLottie$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiRemoteLottie.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(kSerializerArr[0]);
        KSerializer<?> kSerializer = kSerializerArr[4];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, DoubleSerializer.INSTANCE, stringSerializer, stringSerializer, kSerializer, BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiRemoteLottie deserialize(Decoding2 decoder) {
        boolean zDecodeBooleanElement;
        SduiComponentType sduiComponentType;
        int i;
        double d;
        Map map;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiRemoteLottie.$childSerializers;
        int i2 = 5;
        int i3 = 3;
        if (decodingBeginStructure.decodeSequentially()) {
            Map map2 = (Map) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            double dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(descriptor2, 1);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            map = map2;
            zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 5);
            str2 = strDecodeStringElement2;
            str = strDecodeStringElement;
            i = 63;
            d = dDecodeDoubleElement;
        } else {
            double dDecodeDoubleElement2 = 0.0d;
            boolean z = true;
            boolean zDecodeBooleanElement2 = false;
            Map map3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i4 = 0;
            SduiComponentType sduiComponentType2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 3;
                    case 0:
                        map3 = (Map) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, kSerializerArr[0], map3);
                        i4 |= 1;
                        i2 = 5;
                        i3 = 3;
                    case 1:
                        dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(descriptor2, 1);
                        i4 |= 2;
                    case 2:
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i4 |= 4;
                    case 3:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, i3);
                        i4 |= 8;
                    case 4:
                        sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], sduiComponentType2);
                        i4 |= 16;
                    case 5:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, i2);
                        i4 |= 32;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            sduiComponentType = sduiComponentType2;
            i = i4;
            d = dDecodeDoubleElement2;
            map = map3;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiRemoteLottie(i, map, d, str, str2, sduiComponentType, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiRemoteLottie value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiRemoteLottie.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

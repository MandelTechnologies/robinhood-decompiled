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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiTextPog.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiTextPog;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiTextPog$$serializer implements PluginHelperInterfaces<SduiTextPog> {
    public static final SduiTextPog$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiTextPog$$serializer sduiTextPog$$serializer = new SduiTextPog$$serializer();
        INSTANCE = sduiTextPog$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiTextPog", sduiTextPog$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("background_color_override", true);
        pluginGeneratedSerialDescriptor.addElement("foreground_color_override", true);
        pluginGeneratedSerialDescriptor.addElement("has_border", true);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("size", false);
        pluginGeneratedSerialDescriptor.addElement("text", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiTextPog$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiTextPog.$childSerializers;
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(sduiThemedColor$$serializer);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(sduiThemedColor$$serializer);
        KSerializer<?> kSerializer = kSerializerArr[4];
        KSerializer<?> kSerializer2 = kSerializerArr[5];
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, booleanSerializer, booleanSerializer, kSerializer, kSerializer2, StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiTextPog deserialize(Decoding2 decoder) {
        boolean z;
        SduiTextPogSize sduiTextPogSize;
        boolean z2;
        int i;
        SduiThemedColor sduiThemedColor;
        SduiThemedColor sduiThemedColor2;
        SduiComponentType sduiComponentType;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiTextPog.$childSerializers;
        int i2 = 6;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, sduiThemedColor$$serializer, null);
            SduiThemedColor sduiThemedColor4 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, sduiThemedColor$$serializer, null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
            boolean zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 3);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            sduiTextPogSize = (SduiTextPogSize) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            sduiThemedColor2 = sduiThemedColor4;
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 6);
            z = zDecodeBooleanElement2;
            z2 = zDecodeBooleanElement;
            i = 127;
            sduiComponentType = sduiComponentType2;
            sduiThemedColor = sduiThemedColor3;
        } else {
            boolean z3 = true;
            boolean zDecodeBooleanElement3 = false;
            int i3 = 0;
            SduiThemedColor sduiThemedColor5 = null;
            SduiThemedColor sduiThemedColor6 = null;
            SduiComponentType sduiComponentType3 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement4 = false;
            SduiTextPogSize sduiTextPogSize2 = null;
            while (z3) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i2 = 6;
                    case 0:
                        sduiThemedColor5 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor5);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        sduiThemedColor6 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor6);
                        i3 |= 2;
                        i2 = 6;
                    case 2:
                        zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
                        i3 |= 4;
                    case 3:
                        zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(descriptor2, 3);
                        i3 |= 8;
                    case 4:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], sduiComponentType3);
                        i3 |= 16;
                    case 5:
                        sduiTextPogSize2 = (SduiTextPogSize) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], sduiTextPogSize2);
                        i3 |= 32;
                    case 6:
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i3 |= 64;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement3;
            sduiTextPogSize = sduiTextPogSize2;
            z2 = zDecodeBooleanElement4;
            i = i3;
            sduiThemedColor = sduiThemedColor5;
            sduiThemedColor2 = sduiThemedColor6;
            sduiComponentType = sduiComponentType3;
            strDecodeStringElement = strDecodeStringElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiTextPog(i, sduiThemedColor, sduiThemedColor2, z2, z, sduiComponentType, sduiTextPogSize, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiTextPog value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiTextPog.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

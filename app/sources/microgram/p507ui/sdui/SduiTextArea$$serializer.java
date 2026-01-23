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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiTextArea.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiTextArea;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiTextArea$$serializer implements PluginHelperInterfaces<SduiTextArea> {
    public static final SduiTextArea$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiTextArea$$serializer sduiTextArea$$serializer = new SduiTextArea$$serializer();
        INSTANCE = sduiTextArea$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiTextArea", sduiTextArea$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("hide_label", true);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("initial_num_lines", true);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement(AnnotatedPrivateKey.LABEL, true);
        pluginGeneratedSerialDescriptor.addElement("placeholder_text", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("validators", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiTextArea$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiTextArea.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(LongSerializer.INSTANCE);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> kSerializer = kSerializerArr[6];
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(SduiTextAreaValidators$$serializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, stringSerializer, nullable, booleanSerializer, stringSerializer, nullable2, kSerializer, SduiTextAreaState$$serializer.INSTANCE, nullable3};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiTextArea deserialize(Decoding2 decoder) {
        boolean zDecodeBooleanElement;
        SduiTextAreaState sduiTextAreaState;
        SduiTextAreaValidators sduiTextAreaValidators;
        SduiComponentType sduiComponentType;
        String str;
        Long l;
        boolean z;
        int i;
        String str2;
        String str3;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiTextArea.$childSerializers;
        int i2 = 7;
        if (decodingBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 0);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            Long l2 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, LongSerializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 3);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            String str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, null);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            sduiTextAreaState = (SduiTextAreaState) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, SduiTextAreaState$$serializer.INSTANCE, null);
            str = str4;
            z = zDecodeBooleanElement2;
            sduiTextAreaValidators = (SduiTextAreaValidators) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, SduiTextAreaValidators$$serializer.INSTANCE, null);
            str3 = strDecodeStringElement2;
            l = l2;
            i = 511;
            str2 = strDecodeStringElement;
        } else {
            boolean z2 = true;
            zDecodeBooleanElement = false;
            int i3 = 0;
            SduiTextAreaState sduiTextAreaState2 = null;
            SduiTextAreaValidators sduiTextAreaValidators2 = null;
            SduiComponentType sduiComponentType2 = null;
            String str5 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement3 = false;
            Long l3 = null;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 7;
                    case 0:
                        i3 |= 1;
                        zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 0);
                        i2 = 7;
                    case 1:
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        l3 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, LongSerializer.INSTANCE, l3);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        i3 |= 8;
                        zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(descriptor2, 3);
                        i2 = 7;
                    case 4:
                        c = 5;
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i3 |= 16;
                        i2 = 7;
                    case 5:
                        c = 5;
                        str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, str5);
                        i3 |= 32;
                        i2 = 7;
                    case 6:
                        sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], sduiComponentType2);
                        i3 |= 64;
                    case 7:
                        sduiTextAreaState2 = (SduiTextAreaState) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, SduiTextAreaState$$serializer.INSTANCE, sduiTextAreaState2);
                        i3 |= 128;
                    case 8:
                        sduiTextAreaValidators2 = (SduiTextAreaValidators) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, SduiTextAreaValidators$$serializer.INSTANCE, sduiTextAreaValidators2);
                        i3 |= 256;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            sduiTextAreaState = sduiTextAreaState2;
            sduiTextAreaValidators = sduiTextAreaValidators2;
            sduiComponentType = sduiComponentType2;
            str = str5;
            l = l3;
            z = zDecodeBooleanElement3;
            i = i3;
            str2 = strDecodeStringElement3;
            str3 = strDecodeStringElement4;
        }
        boolean z3 = zDecodeBooleanElement;
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiTextArea(i, z3, str2, l, z, str3, str, sduiComponentType, sduiTextAreaState, sduiTextAreaValidators, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiTextArea value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiTextArea.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

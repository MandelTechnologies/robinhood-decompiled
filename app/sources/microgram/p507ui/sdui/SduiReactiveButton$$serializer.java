package microgram.p507ui.sdui;

import java.util.List;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiReactiveButton.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiReactiveButton;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiReactiveButton$$serializer implements PluginHelperInterfaces<SduiReactiveButton> {
    public static final SduiReactiveButton$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiReactiveButton$$serializer sduiReactiveButton$$serializer = new SduiReactiveButton$$serializer();
        INSTANCE = sduiReactiveButton$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiReactiveButton", sduiReactiveButton$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement(AnnotatedPrivateKey.LABEL, false);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("states", true);
        pluginGeneratedSerialDescriptor.addElement("tint_color", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("web_width", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiReactiveButton$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiReactiveButton.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiButtonIcon$$serializer.INSTANCE);
        KSerializer<?> kSerializer = kSerializerArr[5];
        KSerializer<?> kSerializer2 = kSerializerArr[6];
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(SduiThemedColor$$serializer.INSTANCE);
        KSerializer<?> kSerializer3 = kSerializerArr[8];
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(kSerializerArr[9]);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{SduiAction2.INSTANCE, nullable, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, kSerializer, kSerializer2, nullable2, kSerializer3, nullable3};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiReactiveButton deserialize(Decoding2 decoder) {
        boolean z;
        SduiThemedColor sduiThemedColor;
        SduiButtonType sduiButtonType;
        List list;
        SduiWebButtonWidth sduiWebButtonWidth;
        SduiComponentType sduiComponentType;
        SduiButtonIcon sduiButtonIcon;
        int i;
        SduiAction sduiAction;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiReactiveButton.$childSerializers;
        int i2 = 7;
        int i3 = 9;
        int i4 = 6;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            SduiButtonIcon sduiButtonIcon2 = (SduiButtonIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiButtonIcon$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            List list2 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            SduiThemedColor sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, SduiThemedColor$$serializer.INSTANCE, null);
            SduiButtonType sduiButtonType2 = (SduiButtonType) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            sduiWebButtonWidth = (SduiWebButtonWidth) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 9, kSerializerArr[9], null);
            sduiAction = sduiAction2;
            sduiThemedColor = sduiThemedColor2;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement2;
            z = zDecodeBooleanElement;
            i = 1023;
            list = list2;
            sduiComponentType = sduiComponentType2;
            sduiButtonType = sduiButtonType2;
            sduiButtonIcon = sduiButtonIcon2;
        } else {
            int i5 = 5;
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            SduiThemedColor sduiThemedColor3 = null;
            SduiButtonType sduiButtonType3 = null;
            List list3 = null;
            SduiWebButtonWidth sduiWebButtonWidth2 = null;
            SduiComponentType sduiComponentType3 = null;
            SduiAction sduiAction3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i6 = 0;
            SduiButtonIcon sduiButtonIcon3 = null;
            while (z2) {
                int i7 = i4;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 9;
                        i4 = 6;
                        i5 = 5;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i6 |= 1;
                        i2 = 7;
                        i3 = 9;
                        i4 = 6;
                        i5 = 5;
                    case 1:
                        sduiButtonIcon3 = (SduiButtonIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiButtonIcon$$serializer.INSTANCE, sduiButtonIcon3);
                        i6 |= 2;
                        i2 = 7;
                        i3 = 9;
                        i4 = 6;
                        i5 = 5;
                    case 2:
                        i6 |= 4;
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
                        i2 = 7;
                        i4 = 6;
                        i5 = 5;
                    case 3:
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                        i6 |= 8;
                        i2 = 7;
                        i4 = 6;
                        i5 = 5;
                    case 4:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i6 |= 16;
                        i2 = 7;
                        i4 = 6;
                    case 5:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i5, kSerializerArr[i5], sduiComponentType3);
                        i6 |= 32;
                        i2 = 7;
                        i4 = 6;
                    case 6:
                        list3 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, i7, kSerializerArr[i7], list3);
                        i6 |= 64;
                        i4 = i7;
                        i2 = 7;
                    case 7:
                        sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor3);
                        i6 |= 128;
                        i4 = i7;
                    case 8:
                        sduiButtonType3 = (SduiButtonType) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], sduiButtonType3);
                        i6 |= 256;
                        i4 = i7;
                    case 9:
                        sduiWebButtonWidth2 = (SduiWebButtonWidth) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, kSerializerArr[i3], sduiWebButtonWidth2);
                        i6 |= 512;
                        i4 = i7;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            sduiThemedColor = sduiThemedColor3;
            sduiButtonType = sduiButtonType3;
            list = list3;
            sduiWebButtonWidth = sduiWebButtonWidth2;
            sduiComponentType = sduiComponentType3;
            sduiButtonIcon = sduiButtonIcon3;
            i = i6;
            sduiAction = sduiAction3;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiReactiveButton(i, sduiAction, sduiButtonIcon, z, str, str2, sduiComponentType, list, sduiThemedColor, sduiButtonType, sduiWebButtonWidth, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiReactiveButton value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiReactiveButton.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

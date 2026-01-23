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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiTextButton.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiTextButton;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiTextButton$$serializer implements PluginHelperInterfaces<SduiTextButton> {
    public static final SduiTextButton$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiTextButton$$serializer sduiTextButton$$serializer = new SduiTextButton$$serializer();
        INSTANCE = sduiTextButton$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiTextButton", sduiTextButton$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement(ResourceTypes.COLOR, true);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement(AnnotatedPrivateKey.LABEL, false);
        pluginGeneratedSerialDescriptor.addElement("logging_action_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiTextButton$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiTextButton.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiThemedColor$$serializer.INSTANCE);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(SduiButtonIcon$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{SduiAction2.INSTANCE, nullable, nullable2, BooleanSerializer.INSTANCE, stringSerializer, BuiltinSerializers.getNullable(LongSerializer.INSTANCE), BuiltinSerializers.getNullable(stringSerializer), kSerializerArr[7], kSerializerArr[8]};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiTextButton deserialize(Decoding2 decoder) {
        boolean z;
        SduiComponentType sduiComponentType;
        SduiTextButtonSize sduiTextButtonSize;
        String str;
        Long l;
        SduiButtonIcon sduiButtonIcon;
        int i;
        SduiAction sduiAction;
        SduiThemedColor sduiThemedColor;
        String str2;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiTextButton.$childSerializers;
        int i2 = 6;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            SduiThemedColor sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, null);
            SduiButtonIcon sduiButtonIcon2 = (SduiButtonIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiButtonIcon$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 3);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            Long l2 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, LongSerializer.INSTANCE, null);
            String str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            sduiTextButtonSize = (SduiTextButtonSize) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            sduiAction = sduiAction2;
            str = str3;
            l = l2;
            z = zDecodeBooleanElement;
            str2 = strDecodeStringElement;
            sduiButtonIcon = sduiButtonIcon2;
            sduiComponentType = sduiComponentType2;
            i = 511;
            sduiThemedColor = sduiThemedColor2;
        } else {
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            SduiComponentType sduiComponentType3 = null;
            SduiTextButtonSize sduiTextButtonSize2 = null;
            String str4 = null;
            Long l3 = null;
            SduiAction sduiAction3 = null;
            SduiThemedColor sduiThemedColor3 = null;
            String strDecodeStringElement2 = null;
            int i3 = 0;
            SduiButtonIcon sduiButtonIcon3 = null;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor3);
                        i3 |= 2;
                        i2 = 6;
                    case 2:
                        sduiButtonIcon3 = (SduiButtonIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiButtonIcon$$serializer.INSTANCE, sduiButtonIcon3);
                        i3 |= 4;
                        i2 = 6;
                    case 3:
                        i3 |= 8;
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 3);
                        i2 = 6;
                    case 4:
                        c = 5;
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i3 |= 16;
                        i2 = 6;
                    case 5:
                        c = 5;
                        l3 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, LongSerializer.INSTANCE, l3);
                        i3 |= 32;
                        i2 = 6;
                    case 6:
                        str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, StringSerializer.INSTANCE, str4);
                        i3 |= 64;
                    case 7:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], sduiComponentType3);
                        i3 |= 128;
                    case 8:
                        sduiTextButtonSize2 = (SduiTextButtonSize) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], sduiTextButtonSize2);
                        i3 |= 256;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            sduiComponentType = sduiComponentType3;
            sduiTextButtonSize = sduiTextButtonSize2;
            str = str4;
            l = l3;
            sduiButtonIcon = sduiButtonIcon3;
            i = i3;
            sduiAction = sduiAction3;
            sduiThemedColor = sduiThemedColor3;
            str2 = strDecodeStringElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiTextButton(i, sduiAction, sduiThemedColor, sduiButtonIcon, z, str2, l, str, sduiComponentType, sduiTextButtonSize, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiTextButton value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiTextButton.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

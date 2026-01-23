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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiSettingsRowCondensed.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiSettingsRowCondensed;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiSettingsRowCondensed$$serializer implements PluginHelperInterfaces<SduiSettingsRowCondensed> {
    public static final SduiSettingsRowCondensed$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiSettingsRowCondensed$$serializer sduiSettingsRowCondensed$$serializer = new SduiSettingsRowCondensed$$serializer();
        INSTANCE = sduiSettingsRowCondensed$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiSettingsRowCondensed", sduiSettingsRowCondensed$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement(AnnotatedPrivateKey.LABEL, false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiSettingsRowCondensed$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiSettingsRowCondensed.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(kSerializerArr[1]);
        KSerializer<?> kSerializer = kSerializerArr[4];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{SduiAction2.INSTANCE, nullable, BooleanSerializer.INSTANCE, stringSerializer, kSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiSettingsRowCondensed deserialize(Decoding2 decoder) {
        boolean z;
        int i;
        SduiAction sduiAction;
        SduiIcon sduiIcon;
        String str;
        SduiComponentType sduiComponentType;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiSettingsRowCondensed.$childSerializers;
        int i2 = 5;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            SduiIcon sduiIcon2 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            sduiAction = sduiAction2;
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 5);
            str = strDecodeStringElement2;
            z = zDecodeBooleanElement;
            i = 63;
            sduiIcon = sduiIcon2;
        } else {
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            SduiAction sduiAction3 = null;
            SduiIcon sduiIcon3 = null;
            String strDecodeStringElement3 = null;
            SduiComponentType sduiComponentType2 = null;
            String strDecodeStringElement4 = null;
            int i3 = 0;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 5;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        sduiIcon3 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, kSerializerArr[1], sduiIcon3);
                        i3 |= 2;
                    case 2:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
                        i3 |= 4;
                    case 3:
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                        i3 |= 8;
                    case 4:
                        sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], sduiComponentType2);
                        i3 |= 16;
                    case 5:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i3 |= 32;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            i = i3;
            sduiAction = sduiAction3;
            sduiIcon = sduiIcon3;
            str = strDecodeStringElement3;
            sduiComponentType = sduiComponentType2;
            strDecodeStringElement = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiSettingsRowCondensed(i, sduiAction, sduiIcon, z, str, sduiComponentType, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiSettingsRowCondensed value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiSettingsRowCondensed.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

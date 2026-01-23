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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiSettingsRowStacked.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiSettingsRowStacked;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiSettingsRowStacked$$serializer implements PluginHelperInterfaces<SduiSettingsRowStacked> {
    public static final SduiSettingsRowStacked$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiSettingsRowStacked$$serializer sduiSettingsRowStacked$$serializer = new SduiSettingsRowStacked$$serializer();
        INSTANCE = sduiSettingsRowStacked$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiSettingsRowStacked", sduiSettingsRowStacked$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement(AnnotatedPrivateKey.LABEL, false);
        pluginGeneratedSerialDescriptor.addElement("metadata", true);
        pluginGeneratedSerialDescriptor.addElement("metadata_color", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiSettingsRowStacked$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiSettingsRowStacked.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(kSerializerArr[1]);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{SduiAction2.INSTANCE, nullable, BooleanSerializer.INSTANCE, stringSerializer, BuiltinSerializers.getNullable(stringSerializer), SduiThemedColor$$serializer.INSTANCE, kSerializerArr[6], stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiSettingsRowStacked deserialize(Decoding2 decoder) {
        boolean z;
        SduiComponentType sduiComponentType;
        SduiThemedColor sduiThemedColor;
        String str;
        int i;
        SduiAction sduiAction;
        SduiIcon sduiIcon;
        String str2;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiSettingsRowStacked.$childSerializers;
        int i2 = 7;
        int i3 = 5;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            SduiIcon sduiIcon2 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            String str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, null);
            SduiThemedColor sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, SduiThemedColor$$serializer.INSTANCE, null);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            sduiAction = sduiAction2;
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 7);
            sduiThemedColor = sduiThemedColor2;
            str2 = strDecodeStringElement2;
            str = str3;
            z = zDecodeBooleanElement;
            i = 255;
            sduiIcon = sduiIcon2;
        } else {
            int i4 = 1;
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            SduiComponentType sduiComponentType2 = null;
            SduiThemedColor sduiThemedColor3 = null;
            SduiAction sduiAction3 = null;
            SduiIcon sduiIcon3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i5 = 0;
            String str4 = null;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 5;
                        i4 = 1;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 5;
                        i4 = 1;
                    case 1:
                        sduiIcon3 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i4, kSerializerArr[i4], sduiIcon3);
                        i5 |= 2;
                        i2 = 7;
                        i3 = 5;
                    case 2:
                        i5 |= 4;
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
                    case 3:
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                        i5 |= 8;
                    case 4:
                        str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str4);
                        i5 |= 16;
                    case 5:
                        sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor3);
                        i5 |= 32;
                    case 6:
                        sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], sduiComponentType2);
                        i5 |= 64;
                    case 7:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i5 |= 128;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            sduiComponentType = sduiComponentType2;
            sduiThemedColor = sduiThemedColor3;
            str = str4;
            i = i5;
            sduiAction = sduiAction3;
            sduiIcon = sduiIcon3;
            str2 = strDecodeStringElement3;
            strDecodeStringElement = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiSettingsRowStacked(i, sduiAction, sduiIcon, z, str2, str, sduiThemedColor, sduiComponentType, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiSettingsRowStacked value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiSettingsRowStacked.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

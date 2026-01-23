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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiNavigationRow.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiNavigationRow;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiNavigationRow$$serializer implements PluginHelperInterfaces<SduiNavigationRow> {
    public static final SduiNavigationRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiNavigationRow$$serializer sduiNavigationRow$$serializer = new SduiNavigationRow$$serializer();
        INSTANCE = sduiNavigationRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiNavigationRow", sduiNavigationRow$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiNavigationRow$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiNavigationRow.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiAction2.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, BooleanSerializer.INSTANCE, BuiltinSerializers.getNullable(stringSerializer), kSerializerArr[3], BuiltinSerializers.getNullable(stringSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiNavigationRow deserialize(Decoding2 decoder) {
        int i;
        boolean z;
        SduiAction sduiAction;
        String str;
        SduiComponentType sduiComponentType;
        String str2;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiNavigationRow.$childSerializers;
        int i2 = 5;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            String str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            sduiComponentType = sduiComponentType2;
            sduiAction = sduiAction2;
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 5);
            str2 = str4;
            str = str3;
            i = 63;
            z = zDecodeBooleanElement;
        } else {
            boolean z2 = true;
            int i3 = 0;
            SduiAction sduiAction3 = null;
            String str5 = null;
            SduiComponentType sduiComponentType3 = null;
            String str6 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement2 = false;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 5;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
                        i3 |= 2;
                    case 2:
                        str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str5);
                        i3 |= 4;
                    case 3:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], sduiComponentType3);
                        i3 |= 8;
                    case 4:
                        str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str6);
                        i3 |= 16;
                    case 5:
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i3 |= 32;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            z = zDecodeBooleanElement2;
            sduiAction = sduiAction3;
            str = str5;
            sduiComponentType = sduiComponentType3;
            str2 = str6;
            strDecodeStringElement = strDecodeStringElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiNavigationRow(i, sduiAction, z, str, sduiComponentType, str2, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiNavigationRow value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiNavigationRow.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

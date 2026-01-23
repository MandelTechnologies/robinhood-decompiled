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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiInstrumentListItem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiInstrumentListItem;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiInstrumentListItem$$serializer implements PluginHelperInterfaces<SduiInstrumentListItem> {
    public static final SduiInstrumentListItem$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiInstrumentListItem$$serializer sduiInstrumentListItem$$serializer = new SduiInstrumentListItem$$serializer();
        INSTANCE = sduiInstrumentListItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiInstrumentListItem", sduiInstrumentListItem$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("display_type", false);
        pluginGeneratedSerialDescriptor.addElement("instrument_id", false);
        pluginGeneratedSerialDescriptor.addElement("instrument_type", false);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("polling_rate", false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("tap_action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiInstrumentListItem$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiInstrumentListItem.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[0];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializer, stringSerializer, kSerializerArr[2], BuiltinSerializers.getNullable(stringSerializer), DoubleSerializer.INSTANCE, kSerializerArr[5], SduiAction2.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiInstrumentListItem deserialize(Decoding2 decoder) {
        int i;
        SduiAction sduiAction;
        SduiInstrumentDisplayType sduiInstrumentDisplayType;
        String str;
        SduiInstrumentType sduiInstrumentType;
        String str2;
        SduiComponentType sduiComponentType;
        double d;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiInstrumentListItem.$childSerializers;
        int i2 = 6;
        int i3 = 3;
        SduiInstrumentDisplayType sduiInstrumentDisplayType2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiInstrumentDisplayType sduiInstrumentDisplayType3 = (SduiInstrumentDisplayType) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            SduiInstrumentType sduiInstrumentType2 = (SduiInstrumentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            String str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, null);
            double dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(descriptor2, 4);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            sduiInstrumentDisplayType = sduiInstrumentDisplayType3;
            sduiAction = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, SduiAction2.INSTANCE, null);
            str2 = str3;
            i = 127;
            sduiInstrumentType = sduiInstrumentType2;
            str = strDecodeStringElement;
            d = dDecodeDoubleElement;
        } else {
            boolean z = true;
            int i4 = 0;
            SduiAction sduiAction2 = null;
            String str4 = null;
            SduiComponentType sduiComponentType2 = null;
            double dDecodeDoubleElement2 = 0.0d;
            String strDecodeStringElement2 = null;
            SduiInstrumentType sduiInstrumentType3 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 3;
                    case 0:
                        sduiInstrumentDisplayType2 = (SduiInstrumentDisplayType) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], sduiInstrumentDisplayType2);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 3;
                    case 1:
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i4 |= 2;
                    case 2:
                        sduiInstrumentType3 = (SduiInstrumentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], sduiInstrumentType3);
                        i4 |= 4;
                    case 3:
                        str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, StringSerializer.INSTANCE, str4);
                        i4 |= 8;
                    case 4:
                        dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(descriptor2, 4);
                        i4 |= 16;
                    case 5:
                        sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], sduiComponentType2);
                        i4 |= 32;
                    case 6:
                        sduiAction2 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, SduiAction2.INSTANCE, sduiAction2);
                        i4 |= 64;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i4;
            sduiAction = sduiAction2;
            sduiInstrumentDisplayType = sduiInstrumentDisplayType2;
            str = strDecodeStringElement2;
            sduiInstrumentType = sduiInstrumentType3;
            str2 = str4;
            sduiComponentType = sduiComponentType2;
            d = dDecodeDoubleElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiInstrumentListItem(i, sduiInstrumentDisplayType, str, sduiInstrumentType, str2, d, sduiComponentType, sduiAction, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiInstrumentListItem value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiInstrumentListItem.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

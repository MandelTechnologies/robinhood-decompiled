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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiMarginRequirementPollableCell.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiMarginRequirementPollableCell;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiMarginRequirementPollableCell$$serializer implements PluginHelperInterfaces<SduiMarginRequirementPollableCell> {
    public static final SduiMarginRequirementPollableCell$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiMarginRequirementPollableCell$$serializer sduiMarginRequirementPollableCell$$serializer = new SduiMarginRequirementPollableCell$$serializer();
        INSTANCE = sduiMarginRequirementPollableCell$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiMarginRequirementPollableCell", sduiMarginRequirementPollableCell$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("account_number", false);
        pluginGeneratedSerialDescriptor.addElement("column", false);
        pluginGeneratedSerialDescriptor.addElement("initial_value", true);
        pluginGeneratedSerialDescriptor.addElement("row_identifier", false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiMarginRequirementPollableCell$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiMarginRequirementPollableCell.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[1];
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiComponentSerializer.INSTANCE);
        KSerializer<?> kSerializer2 = kSerializerArr[4];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializer, nullable, stringSerializer, kSerializer2};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiMarginRequirementPollableCell deserialize(Decoding2 decoder) {
        int i;
        String str;
        SduiMarginRequirementPollableColumnIdentifier sduiMarginRequirementPollableColumnIdentifier;
        SduiComponent sduiComponent;
        String str2;
        SduiComponentType sduiComponentType;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiMarginRequirementPollableCell.$childSerializers;
        String strDecodeStringElement = null;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            SduiMarginRequirementPollableColumnIdentifier sduiMarginRequirementPollableColumnIdentifier2 = (SduiMarginRequirementPollableColumnIdentifier) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            SduiComponent sduiComponent2 = (SduiComponent) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiComponentSerializer.INSTANCE, null);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            str = strDecodeStringElement2;
            str2 = strDecodeStringElement3;
            sduiComponent = sduiComponent2;
            i = 31;
            sduiMarginRequirementPollableColumnIdentifier = sduiMarginRequirementPollableColumnIdentifier2;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiMarginRequirementPollableColumnIdentifier sduiMarginRequirementPollableColumnIdentifier3 = null;
            SduiComponent sduiComponent3 = null;
            String strDecodeStringElement4 = null;
            SduiComponentType sduiComponentType2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiMarginRequirementPollableColumnIdentifier3 = (SduiMarginRequirementPollableColumnIdentifier) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], sduiMarginRequirementPollableColumnIdentifier3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    sduiComponent3 = (SduiComponent) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiComponentSerializer.INSTANCE, sduiComponent3);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], sduiComponentType2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            sduiMarginRequirementPollableColumnIdentifier = sduiMarginRequirementPollableColumnIdentifier3;
            sduiComponent = sduiComponent3;
            str2 = strDecodeStringElement4;
            sduiComponentType = sduiComponentType2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiMarginRequirementPollableCell(i, str, sduiMarginRequirementPollableColumnIdentifier, sduiComponent, str2, sduiComponentType, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiMarginRequirementPollableCell value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiMarginRequirementPollableCell.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

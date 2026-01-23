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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiRecurringInsightsHeader.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiRecurringInsightsHeader;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiRecurringInsightsHeader$$serializer implements PluginHelperInterfaces<SduiRecurringInsightsHeader> {
    public static final SduiRecurringInsightsHeader$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiRecurringInsightsHeader$$serializer sduiRecurringInsightsHeader$$serializer = new SduiRecurringInsightsHeader$$serializer();
        INSTANCE = sduiRecurringInsightsHeader$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiRecurringInsightsHeader", sduiRecurringInsightsHeader$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("match_line", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiRecurringInsightsHeader$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiRecurringInsightsHeader.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiMatchLine$$serializer.INSTANCE);
        KSerializer<?> kSerializer = kSerializerArr[1];
        SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
        return new KSerializer[]{nullable, kSerializer, sduiMarkdownText$$serializer, sduiMarkdownText$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiRecurringInsightsHeader deserialize(Decoding2 decoder) {
        int i;
        SduiMatchLine sduiMatchLine;
        SduiComponentType sduiComponentType;
        SduiMarkdownText sduiMarkdownText;
        SduiMarkdownText sduiMarkdownText2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiRecurringInsightsHeader.$childSerializers;
        SduiMatchLine sduiMatchLine2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiMatchLine sduiMatchLine3 = (SduiMatchLine) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiMatchLine$$serializer.INSTANCE, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
            SduiMarkdownText sduiMarkdownText3 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, sduiMarkdownText$$serializer, null);
            sduiComponentType = sduiComponentType2;
            sduiMatchLine = sduiMatchLine3;
            sduiMarkdownText2 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, sduiMarkdownText$$serializer, null);
            sduiMarkdownText = sduiMarkdownText3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiComponentType sduiComponentType3 = null;
            SduiMarkdownText sduiMarkdownText4 = null;
            SduiMarkdownText sduiMarkdownText5 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiMatchLine2 = (SduiMatchLine) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiMatchLine$$serializer.INSTANCE, sduiMatchLine2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], sduiComponentType3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    sduiMarkdownText4 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText4);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiMarkdownText5 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText5);
                    i2 |= 8;
                }
            }
            i = i2;
            sduiMatchLine = sduiMatchLine2;
            sduiComponentType = sduiComponentType3;
            sduiMarkdownText = sduiMarkdownText4;
            sduiMarkdownText2 = sduiMarkdownText5;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiRecurringInsightsHeader(i, sduiMatchLine, sduiComponentType, sduiMarkdownText, sduiMarkdownText2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiRecurringInsightsHeader value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiRecurringInsightsHeader.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

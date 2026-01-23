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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiAccordionRow.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiAccordionRow;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiAccordionRow$$serializer implements PluginHelperInterfaces<SduiAccordionRow> {
    public static final SduiAccordionRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiAccordionRow$$serializer sduiAccordionRow$$serializer = new SduiAccordionRow$$serializer();
        INSTANCE = sduiAccordionRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiAccordionRow", sduiAccordionRow$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("content", false);
        pluginGeneratedSerialDescriptor.addElement("is_open", true);
        pluginGeneratedSerialDescriptor.addElement("metadata_subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("metadata_title", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiAccordionRow$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiAccordionRow.$childSerializers;
        SduiText$$serializer sduiText$$serializer = SduiText$$serializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(sduiText$$serializer);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(sduiText$$serializer);
        KSerializer<?> kSerializer = kSerializerArr[4];
        SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
        return new KSerializer[]{SduiComponentSerializer.INSTANCE, BooleanSerializer.INSTANCE, nullable, nullable2, kSerializer, BuiltinSerializers.getNullable(sduiMarkdownText$$serializer), sduiMarkdownText$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiAccordionRow deserialize(Decoding2 decoder) {
        int i;
        SduiMarkdownText sduiMarkdownText;
        SduiMarkdownText sduiMarkdownText2;
        boolean z;
        SduiComponent sduiComponent;
        SduiText sduiText;
        SduiText sduiText2;
        SduiComponentType sduiComponentType;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiAccordionRow.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiComponent sduiComponent2 = (SduiComponent) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiComponentSerializer.INSTANCE, null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
            SduiText$$serializer sduiText$$serializer = SduiText$$serializer.INSTANCE;
            SduiText sduiText3 = (SduiText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, sduiText$$serializer, null);
            SduiText sduiText4 = (SduiText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, sduiText$$serializer, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
            SduiMarkdownText sduiMarkdownText3 = (SduiMarkdownText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, sduiMarkdownText$$serializer, null);
            sduiComponentType = sduiComponentType2;
            sduiComponent = sduiComponent2;
            sduiMarkdownText = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, sduiMarkdownText$$serializer, null);
            sduiMarkdownText2 = sduiMarkdownText3;
            sduiText2 = sduiText4;
            sduiText = sduiText3;
            i = 127;
            z = zDecodeBooleanElement;
        } else {
            boolean z2 = true;
            int i4 = 0;
            SduiMarkdownText sduiMarkdownText4 = null;
            SduiComponent sduiComponent3 = null;
            SduiText sduiText5 = null;
            SduiText sduiText6 = null;
            SduiComponentType sduiComponentType3 = null;
            boolean zDecodeBooleanElement2 = false;
            SduiMarkdownText sduiMarkdownText5 = null;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 5;
                    case 0:
                        sduiComponent3 = (SduiComponent) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiComponentSerializer.INSTANCE, sduiComponent3);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 5;
                    case 1:
                        c = 2;
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
                        i4 |= 2;
                        i2 = 6;
                    case 2:
                        c = 2;
                        sduiText5 = (SduiText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiText$$serializer.INSTANCE, sduiText5);
                        i4 |= 4;
                        i2 = 6;
                    case 3:
                        sduiText6 = (SduiText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiText$$serializer.INSTANCE, sduiText6);
                        i4 |= 8;
                    case 4:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], sduiComponentType3);
                        i4 |= 16;
                    case 5:
                        sduiMarkdownText5 = (SduiMarkdownText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText5);
                        i4 |= 32;
                    case 6:
                        sduiMarkdownText4 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText4);
                        i4 |= 64;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i4;
            sduiMarkdownText = sduiMarkdownText4;
            sduiMarkdownText2 = sduiMarkdownText5;
            z = zDecodeBooleanElement2;
            sduiComponent = sduiComponent3;
            sduiText = sduiText5;
            sduiText2 = sduiText6;
            sduiComponentType = sduiComponentType3;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiAccordionRow(i, sduiComponent, z, sduiText, sduiText2, sduiComponentType, sduiMarkdownText2, sduiMarkdownText, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiAccordionRow value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiAccordionRow.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

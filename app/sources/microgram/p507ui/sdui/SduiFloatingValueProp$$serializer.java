package microgram.p507ui.sdui;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiFloatingValueProp.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiFloatingValueProp;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiFloatingValueProp$$serializer implements PluginHelperInterfaces<SduiFloatingValueProp> {
    public static final SduiFloatingValueProp$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiFloatingValueProp$$serializer sduiFloatingValueProp$$serializer = new SduiFloatingValueProp$$serializer();
        INSTANCE = sduiFloatingValueProp$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiFloatingValueProp", sduiFloatingValueProp$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("content", false);
        pluginGeneratedSerialDescriptor.addElement("image_height", false);
        pluginGeneratedSerialDescriptor.addElement("image_url", false);
        pluginGeneratedSerialDescriptor.addElement("image_width", false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiFloatingValueProp$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = SduiFloatingValueProp.$childSerializers[4];
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{SduiComponentSerializer.INSTANCE, longSerializer, StringSerializer.INSTANCE, longSerializer, kSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiFloatingValueProp deserialize(Decoding2 decoder) {
        int i;
        SduiComponent sduiComponent;
        long j;
        String str;
        SduiComponentType sduiComponentType;
        long j2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiFloatingValueProp.$childSerializers;
        int i2 = 3;
        SduiComponent sduiComponent2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiComponent sduiComponent3 = (SduiComponent) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiComponentSerializer.INSTANCE, null);
            long jDecodeLongElement = decodingBeginStructure.decodeLongElement(descriptor2, 1);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            long jDecodeLongElement2 = decodingBeginStructure.decodeLongElement(descriptor2, 3);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            sduiComponent = sduiComponent3;
            i = 31;
            str = strDecodeStringElement;
            j = jDecodeLongElement;
            j2 = jDecodeLongElement2;
        } else {
            long jDecodeLongElement3 = 0;
            boolean z = true;
            int i3 = 0;
            String strDecodeStringElement2 = null;
            SduiComponentType sduiComponentType2 = null;
            long jDecodeLongElement4 = 0;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiComponent2 = (SduiComponent) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiComponentSerializer.INSTANCE, sduiComponent2);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement3 = decodingBeginStructure.decodeLongElement(descriptor2, 1);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                    i3 |= 4;
                } else if (iDecodeElementIndex == i2) {
                    jDecodeLongElement4 = decodingBeginStructure.decodeLongElement(descriptor2, i2);
                    i3 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], sduiComponentType2);
                    i3 |= 16;
                }
                i2 = 3;
            }
            i = i3;
            sduiComponent = sduiComponent2;
            j = jDecodeLongElement3;
            str = strDecodeStringElement2;
            sduiComponentType = sduiComponentType2;
            j2 = jDecodeLongElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiFloatingValueProp(i, sduiComponent, j, str, j2, sduiComponentType, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiFloatingValueProp value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiFloatingValueProp.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

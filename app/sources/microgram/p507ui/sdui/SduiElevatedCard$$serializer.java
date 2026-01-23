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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiElevatedCard.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiElevatedCard;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiElevatedCard$$serializer implements PluginHelperInterfaces<SduiElevatedCard> {
    public static final SduiElevatedCard$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiElevatedCard$$serializer sduiElevatedCard$$serializer = new SduiElevatedCard$$serializer();
        INSTANCE = sduiElevatedCard$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiElevatedCard", sduiElevatedCard$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("background_color", true);
        pluginGeneratedSerialDescriptor.addElement("background_color_opacity", true);
        pluginGeneratedSerialDescriptor.addElement("content", false);
        pluginGeneratedSerialDescriptor.addElement("corner_radius", true);
        pluginGeneratedSerialDescriptor.addElement("outline", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiElevatedCard$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SduiThemedColor$$serializer.INSTANCE, DoubleSerializer.INSTANCE, SduiComponentSerializer.INSTANCE, LongSerializer.INSTANCE, BuiltinSerializers.getNullable(SduiOutline$$serializer.INSTANCE), SduiElevatedCard.$childSerializers[5]};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiElevatedCard deserialize(Decoding2 decoder) {
        int i;
        SduiThemedColor sduiThemedColor;
        double d;
        SduiComponent sduiComponent;
        SduiOutline sduiOutline;
        SduiComponentType sduiComponentType;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiElevatedCard.$childSerializers;
        int i2 = 3;
        SduiThemedColor sduiThemedColor2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiThemedColor sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, null);
            double dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(descriptor2, 1);
            SduiComponent sduiComponent2 = (SduiComponent) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, SduiComponentSerializer.INSTANCE, null);
            long jDecodeLongElement = decodingBeginStructure.decodeLongElement(descriptor2, 3);
            SduiOutline sduiOutline2 = (SduiOutline) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiOutline$$serializer.INSTANCE, null);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            sduiThemedColor = sduiThemedColor3;
            sduiOutline = sduiOutline2;
            i = 63;
            sduiComponent = sduiComponent2;
            d = dDecodeDoubleElement;
            j = jDecodeLongElement;
        } else {
            double dDecodeDoubleElement2 = 0.0d;
            boolean z = true;
            int i3 = 0;
            SduiComponentType sduiComponentType2 = null;
            long jDecodeLongElement2 = 0;
            SduiComponent sduiComponent3 = null;
            SduiOutline sduiOutline3 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 3;
                    case 0:
                        sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor2);
                        i3 |= 1;
                        i2 = 3;
                    case 1:
                        dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(descriptor2, 1);
                        i3 |= 2;
                    case 2:
                        sduiComponent3 = (SduiComponent) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, SduiComponentSerializer.INSTANCE, sduiComponent3);
                        i3 |= 4;
                    case 3:
                        jDecodeLongElement2 = decodingBeginStructure.decodeLongElement(descriptor2, i2);
                        i3 |= 8;
                    case 4:
                        sduiOutline3 = (SduiOutline) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiOutline$$serializer.INSTANCE, sduiOutline3);
                        i3 |= 16;
                    case 5:
                        sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], sduiComponentType2);
                        i3 |= 32;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            sduiThemedColor = sduiThemedColor2;
            d = dDecodeDoubleElement2;
            sduiComponent = sduiComponent3;
            sduiOutline = sduiOutline3;
            sduiComponentType = sduiComponentType2;
            j = jDecodeLongElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiElevatedCard(i, sduiThemedColor, d, sduiComponent, j, sduiOutline, sduiComponentType, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiElevatedCard value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiElevatedCard.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

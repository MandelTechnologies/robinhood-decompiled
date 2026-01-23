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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiChartLayeredStackComponent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiChartLayeredStackComponent;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiChartLayeredStackComponent$$serializer implements PluginHelperInterfaces<SduiChartLayeredStackComponent> {
    public static final SduiChartLayeredStackComponent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiChartLayeredStackComponent$$serializer sduiChartLayeredStackComponent$$serializer = new SduiChartLayeredStackComponent$$serializer();
        INSTANCE = sduiChartLayeredStackComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiChartLayeredStackComponent", sduiChartLayeredStackComponent$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("content", false);
        pluginGeneratedSerialDescriptor.addElement("position", false);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiChartLayeredStackComponent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SduiComponentSerializer.INSTANCE, SduiChartLayeredStackPosition$$serializer.INSTANCE, BuiltinSerializers.getNullable(SduiChartLayeredStackSize$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiChartLayeredStackComponent deserialize(Decoding2 decoder) {
        int i;
        SduiComponent sduiComponent;
        SduiChartLayeredStackPosition sduiChartLayeredStackPosition;
        SduiChartLayeredStackSize sduiChartLayeredStackSize;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        SduiComponent sduiComponent2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiComponent sduiComponent3 = (SduiComponent) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiComponentSerializer.INSTANCE, null);
            SduiChartLayeredStackPosition sduiChartLayeredStackPosition2 = (SduiChartLayeredStackPosition) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, SduiChartLayeredStackPosition$$serializer.INSTANCE, null);
            sduiComponent = sduiComponent3;
            sduiChartLayeredStackSize = (SduiChartLayeredStackSize) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiChartLayeredStackSize$$serializer.INSTANCE, null);
            sduiChartLayeredStackPosition = sduiChartLayeredStackPosition2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiChartLayeredStackPosition sduiChartLayeredStackPosition3 = null;
            SduiChartLayeredStackSize sduiChartLayeredStackSize2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiComponent2 = (SduiComponent) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiComponentSerializer.INSTANCE, sduiComponent2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiChartLayeredStackPosition3 = (SduiChartLayeredStackPosition) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, SduiChartLayeredStackPosition$$serializer.INSTANCE, sduiChartLayeredStackPosition3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiChartLayeredStackSize2 = (SduiChartLayeredStackSize) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiChartLayeredStackSize$$serializer.INSTANCE, sduiChartLayeredStackSize2);
                    i2 |= 4;
                }
            }
            i = i2;
            sduiComponent = sduiComponent2;
            sduiChartLayeredStackPosition = sduiChartLayeredStackPosition3;
            sduiChartLayeredStackSize = sduiChartLayeredStackSize2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiChartLayeredStackComponent(i, sduiComponent, sduiChartLayeredStackPosition, sduiChartLayeredStackSize, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiChartLayeredStackComponent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiChartLayeredStackComponent.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

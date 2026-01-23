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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiInsets.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiInsets;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiInsets$$serializer implements PluginHelperInterfaces<SduiInsets> {
    public static final SduiInsets$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiInsets$$serializer sduiInsets$$serializer = new SduiInsets$$serializer();
        INSTANCE = sduiInsets$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiInsets", sduiInsets$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("bottom", false);
        pluginGeneratedSerialDescriptor.addElement("left", false);
        pluginGeneratedSerialDescriptor.addElement("right", false);
        pluginGeneratedSerialDescriptor.addElement("top", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiInsets$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        SduiWindowWidthDependentNumber$$serializer sduiWindowWidthDependentNumber$$serializer = SduiWindowWidthDependentNumber$$serializer.INSTANCE;
        return new KSerializer[]{sduiWindowWidthDependentNumber$$serializer, sduiWindowWidthDependentNumber$$serializer, sduiWindowWidthDependentNumber$$serializer, sduiWindowWidthDependentNumber$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiInsets deserialize(Decoding2 decoder) {
        int i;
        SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber;
        SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber2;
        SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber3;
        SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber5 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiWindowWidthDependentNumber$$serializer sduiWindowWidthDependentNumber$$serializer = SduiWindowWidthDependentNumber$$serializer.INSTANCE;
            SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber6 = (SduiWindowWidthDependentNumber) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, sduiWindowWidthDependentNumber$$serializer, null);
            SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber7 = (SduiWindowWidthDependentNumber) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, sduiWindowWidthDependentNumber$$serializer, null);
            SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber8 = (SduiWindowWidthDependentNumber) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, sduiWindowWidthDependentNumber$$serializer, null);
            sduiWindowWidthDependentNumber4 = (SduiWindowWidthDependentNumber) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, sduiWindowWidthDependentNumber$$serializer, null);
            i = 15;
            sduiWindowWidthDependentNumber3 = sduiWindowWidthDependentNumber8;
            sduiWindowWidthDependentNumber2 = sduiWindowWidthDependentNumber7;
            sduiWindowWidthDependentNumber = sduiWindowWidthDependentNumber6;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber9 = null;
            SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber10 = null;
            SduiWindowWidthDependentNumber sduiWindowWidthDependentNumber11 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiWindowWidthDependentNumber5 = (SduiWindowWidthDependentNumber) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiWindowWidthDependentNumber$$serializer.INSTANCE, sduiWindowWidthDependentNumber5);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiWindowWidthDependentNumber9 = (SduiWindowWidthDependentNumber) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, SduiWindowWidthDependentNumber$$serializer.INSTANCE, sduiWindowWidthDependentNumber9);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    sduiWindowWidthDependentNumber10 = (SduiWindowWidthDependentNumber) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, SduiWindowWidthDependentNumber$$serializer.INSTANCE, sduiWindowWidthDependentNumber10);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiWindowWidthDependentNumber11 = (SduiWindowWidthDependentNumber) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, SduiWindowWidthDependentNumber$$serializer.INSTANCE, sduiWindowWidthDependentNumber11);
                    i2 |= 8;
                }
            }
            i = i2;
            sduiWindowWidthDependentNumber = sduiWindowWidthDependentNumber5;
            sduiWindowWidthDependentNumber2 = sduiWindowWidthDependentNumber9;
            sduiWindowWidthDependentNumber3 = sduiWindowWidthDependentNumber10;
            sduiWindowWidthDependentNumber4 = sduiWindowWidthDependentNumber11;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiInsets(i, sduiWindowWidthDependentNumber, sduiWindowWidthDependentNumber2, sduiWindowWidthDependentNumber3, sduiWindowWidthDependentNumber4, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiInsets value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiInsets.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

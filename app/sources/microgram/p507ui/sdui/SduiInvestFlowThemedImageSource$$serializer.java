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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiInvestFlowThemedImageSource.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiInvestFlowThemedImageSource;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiInvestFlowThemedImageSource$$serializer implements PluginHelperInterfaces<SduiInvestFlowThemedImageSource> {
    public static final SduiInvestFlowThemedImageSource$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiInvestFlowThemedImageSource$$serializer sduiInvestFlowThemedImageSource$$serializer = new SduiInvestFlowThemedImageSource$$serializer();
        INSTANCE = sduiInvestFlowThemedImageSource$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiInvestFlowThemedImageSource", sduiInvestFlowThemedImageSource$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("dark", false);
        pluginGeneratedSerialDescriptor.addElement("light", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiInvestFlowThemedImageSource$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        SduiInvestFlowImageSource$$serializer sduiInvestFlowImageSource$$serializer = SduiInvestFlowImageSource$$serializer.INSTANCE;
        return new KSerializer[]{sduiInvestFlowImageSource$$serializer, sduiInvestFlowImageSource$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiInvestFlowThemedImageSource deserialize(Decoding2 decoder) {
        SduiInvestFlowImageSource sduiInvestFlowImageSource;
        int i;
        SduiInvestFlowImageSource sduiInvestFlowImageSource2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        if (decodingBeginStructure.decodeSequentially()) {
            SduiInvestFlowImageSource$$serializer sduiInvestFlowImageSource$$serializer = SduiInvestFlowImageSource$$serializer.INSTANCE;
            sduiInvestFlowImageSource2 = (SduiInvestFlowImageSource) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, sduiInvestFlowImageSource$$serializer, null);
            sduiInvestFlowImageSource = (SduiInvestFlowImageSource) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, sduiInvestFlowImageSource$$serializer, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            sduiInvestFlowImageSource = null;
            SduiInvestFlowImageSource sduiInvestFlowImageSource3 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiInvestFlowImageSource3 = (SduiInvestFlowImageSource) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiInvestFlowImageSource$$serializer.INSTANCE, sduiInvestFlowImageSource3);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiInvestFlowImageSource = (SduiInvestFlowImageSource) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, SduiInvestFlowImageSource$$serializer.INSTANCE, sduiInvestFlowImageSource);
                    i2 |= 2;
                }
            }
            i = i2;
            sduiInvestFlowImageSource2 = sduiInvestFlowImageSource3;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiInvestFlowThemedImageSource(i, sduiInvestFlowImageSource2, sduiInvestFlowImageSource, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiInvestFlowThemedImageSource value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiInvestFlowThemedImageSource.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

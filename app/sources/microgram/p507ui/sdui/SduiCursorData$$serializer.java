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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiCursorData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiCursorData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiCursorData$$serializer implements PluginHelperInterfaces<SduiCursorData> {
    public static final SduiCursorData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiCursorData$$serializer sduiCursorData$$serializer = new SduiCursorData$$serializer();
        INSTANCE = sduiCursorData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiCursorData", sduiCursorData$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement(AnnotatedPrivateKey.LABEL, true);
        pluginGeneratedSerialDescriptor.addElement("price_chart_data", true);
        pluginGeneratedSerialDescriptor.addElement("primary_value", true);
        pluginGeneratedSerialDescriptor.addElement("secondary_label", true);
        pluginGeneratedSerialDescriptor.addElement("secondary_value", true);
        pluginGeneratedSerialDescriptor.addElement("tertiary_label", true);
        pluginGeneratedSerialDescriptor.addElement("tertiary_value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiCursorData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        SduiDisplayText$$serializer sduiDisplayText$$serializer = SduiDisplayText$$serializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(sduiDisplayText$$serializer);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(SduiPriceChartData$$serializer.INSTANCE);
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(sduiDisplayText$$serializer);
        KSerializer<?> nullable4 = BuiltinSerializers.getNullable(sduiDisplayText$$serializer);
        SduiSubDisplayText$$serializer sduiSubDisplayText$$serializer = SduiSubDisplayText$$serializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, BuiltinSerializers.getNullable(sduiSubDisplayText$$serializer), BuiltinSerializers.getNullable(sduiDisplayText$$serializer), BuiltinSerializers.getNullable(sduiSubDisplayText$$serializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiCursorData deserialize(Decoding2 decoder) {
        int i;
        SduiSubDisplayText sduiSubDisplayText;
        SduiDisplayText sduiDisplayText;
        SduiPriceChartData sduiPriceChartData;
        SduiDisplayText sduiDisplayText2;
        SduiDisplayText sduiDisplayText3;
        SduiSubDisplayText sduiSubDisplayText2;
        SduiDisplayText sduiDisplayText4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        int i2 = 6;
        SduiDisplayText sduiDisplayText5 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiDisplayText$$serializer sduiDisplayText$$serializer = SduiDisplayText$$serializer.INSTANCE;
            SduiDisplayText sduiDisplayText6 = (SduiDisplayText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, sduiDisplayText$$serializer, null);
            SduiPriceChartData sduiPriceChartData2 = (SduiPriceChartData) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiPriceChartData$$serializer.INSTANCE, null);
            SduiDisplayText sduiDisplayText7 = (SduiDisplayText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, sduiDisplayText$$serializer, null);
            SduiDisplayText sduiDisplayText8 = (SduiDisplayText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, sduiDisplayText$$serializer, null);
            SduiSubDisplayText$$serializer sduiSubDisplayText$$serializer = SduiSubDisplayText$$serializer.INSTANCE;
            SduiSubDisplayText sduiSubDisplayText3 = (SduiSubDisplayText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, sduiSubDisplayText$$serializer, null);
            sduiDisplayText4 = (SduiDisplayText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, sduiDisplayText$$serializer, null);
            sduiSubDisplayText = (SduiSubDisplayText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, sduiSubDisplayText$$serializer, null);
            i = 127;
            sduiDisplayText3 = sduiDisplayText8;
            sduiSubDisplayText2 = sduiSubDisplayText3;
            sduiDisplayText2 = sduiDisplayText7;
            sduiPriceChartData = sduiPriceChartData2;
            sduiDisplayText = sduiDisplayText6;
        } else {
            boolean z = true;
            int i3 = 0;
            SduiSubDisplayText sduiSubDisplayText4 = null;
            SduiPriceChartData sduiPriceChartData3 = null;
            SduiDisplayText sduiDisplayText9 = null;
            SduiDisplayText sduiDisplayText10 = null;
            SduiSubDisplayText sduiSubDisplayText5 = null;
            SduiDisplayText sduiDisplayText11 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                    case 0:
                        sduiDisplayText5 = (SduiDisplayText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiDisplayText$$serializer.INSTANCE, sduiDisplayText5);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        sduiPriceChartData3 = (SduiPriceChartData) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiPriceChartData$$serializer.INSTANCE, sduiPriceChartData3);
                        i3 |= 2;
                        i2 = 6;
                    case 2:
                        sduiDisplayText9 = (SduiDisplayText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiDisplayText$$serializer.INSTANCE, sduiDisplayText9);
                        i3 |= 4;
                    case 3:
                        sduiDisplayText10 = (SduiDisplayText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiDisplayText$$serializer.INSTANCE, sduiDisplayText10);
                        i3 |= 8;
                    case 4:
                        sduiSubDisplayText5 = (SduiSubDisplayText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiSubDisplayText$$serializer.INSTANCE, sduiSubDisplayText5);
                        i3 |= 16;
                    case 5:
                        sduiDisplayText11 = (SduiDisplayText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, SduiDisplayText$$serializer.INSTANCE, sduiDisplayText11);
                        i3 |= 32;
                    case 6:
                        sduiSubDisplayText4 = (SduiSubDisplayText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, SduiSubDisplayText$$serializer.INSTANCE, sduiSubDisplayText4);
                        i3 |= 64;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            sduiSubDisplayText = sduiSubDisplayText4;
            sduiDisplayText = sduiDisplayText5;
            sduiPriceChartData = sduiPriceChartData3;
            sduiDisplayText2 = sduiDisplayText9;
            sduiDisplayText3 = sduiDisplayText10;
            sduiSubDisplayText2 = sduiSubDisplayText5;
            sduiDisplayText4 = sduiDisplayText11;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiCursorData(i, sduiDisplayText, sduiPriceChartData, sduiDisplayText2, sduiDisplayText3, sduiSubDisplayText2, sduiDisplayText4, sduiSubDisplayText, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiCursorData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiCursorData.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

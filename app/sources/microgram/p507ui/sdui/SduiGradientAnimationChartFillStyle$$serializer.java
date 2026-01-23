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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiGradientAnimationChartFillStyle.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiGradientAnimationChartFillStyle;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiGradientAnimationChartFillStyle$$serializer implements PluginHelperInterfaces<SduiGradientAnimationChartFillStyle> {
    public static final SduiGradientAnimationChartFillStyle$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiGradientAnimationChartFillStyle$$serializer sduiGradientAnimationChartFillStyle$$serializer = new SduiGradientAnimationChartFillStyle$$serializer();
        INSTANCE = sduiGradientAnimationChartFillStyle$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiGradientAnimationChartFillStyle", sduiGradientAnimationChartFillStyle$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("after_pivot_gradient", false);
        pluginGeneratedSerialDescriptor.addElement("base_color", false);
        pluginGeneratedSerialDescriptor.addElement("base_color_opacity", true);
        pluginGeneratedSerialDescriptor.addElement("before_pivot_gradient", false);
        pluginGeneratedSerialDescriptor.addElement("corner_radius_info", true);
        pluginGeneratedSerialDescriptor.addElement("gradient_style", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("speed", false);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiGradientAnimationChartFillStyle$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiGradientAnimationChartFillStyle.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiCornerRadiusInfo$$serializer.INSTANCE);
        KSerializer<?> kSerializer = kSerializerArr[5];
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(StringSerializer.INSTANCE);
        KSerializer<?> kSerializer2 = kSerializerArr[8];
        SduiGradientChartFillStyle$$serializer sduiGradientChartFillStyle$$serializer = SduiGradientChartFillStyle$$serializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{sduiGradientChartFillStyle$$serializer, SduiThemedColor$$serializer.INSTANCE, doubleSerializer, sduiGradientChartFillStyle$$serializer, nullable, kSerializer, nullable2, doubleSerializer, kSerializer2};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiGradientAnimationChartFillStyle deserialize(Decoding2 decoder) {
        int i;
        SduiGradientChartFillStyle sduiGradientChartFillStyle;
        SduiGradientStyle sduiGradientStyle;
        String str;
        SduiCornerRadiusInfo sduiCornerRadiusInfo;
        SduiGradientChartFillStyle sduiGradientChartFillStyle2;
        SduiThemedColor sduiThemedColor;
        SduiChartFillType sduiChartFillType;
        double d;
        double d2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiGradientAnimationChartFillStyle.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        SduiChartFillType sduiChartFillType2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiGradientChartFillStyle$$serializer sduiGradientChartFillStyle$$serializer = SduiGradientChartFillStyle$$serializer.INSTANCE;
            SduiGradientChartFillStyle sduiGradientChartFillStyle3 = (SduiGradientChartFillStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, sduiGradientChartFillStyle$$serializer, null);
            SduiThemedColor sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, null);
            double dDecodeDoubleElement = decodingBeginStructure.decodeDoubleElement(descriptor2, 2);
            SduiGradientChartFillStyle sduiGradientChartFillStyle4 = (SduiGradientChartFillStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, sduiGradientChartFillStyle$$serializer, null);
            SduiCornerRadiusInfo sduiCornerRadiusInfo2 = (SduiCornerRadiusInfo) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiCornerRadiusInfo$$serializer.INSTANCE, null);
            SduiGradientStyle sduiGradientStyle2 = (SduiGradientStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            String str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, null);
            double dDecodeDoubleElement2 = decodingBeginStructure.decodeDoubleElement(descriptor2, 7);
            sduiChartFillType = (SduiChartFillType) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            sduiGradientChartFillStyle2 = sduiGradientChartFillStyle4;
            i = 511;
            str = str2;
            sduiCornerRadiusInfo = sduiCornerRadiusInfo2;
            sduiGradientStyle = sduiGradientStyle2;
            d = dDecodeDoubleElement2;
            sduiThemedColor = sduiThemedColor2;
            sduiGradientChartFillStyle = sduiGradientChartFillStyle3;
            d2 = dDecodeDoubleElement;
        } else {
            double dDecodeDoubleElement3 = 0.0d;
            boolean z = true;
            int i5 = 0;
            SduiGradientStyle sduiGradientStyle3 = null;
            String str3 = null;
            SduiCornerRadiusInfo sduiCornerRadiusInfo3 = null;
            SduiGradientChartFillStyle sduiGradientChartFillStyle5 = null;
            SduiThemedColor sduiThemedColor3 = null;
            SduiGradientChartFillStyle sduiGradientChartFillStyle6 = null;
            double dDecodeDoubleElement4 = 0.0d;
            while (z) {
                int i6 = i4;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 6;
                        i4 = 5;
                    case 0:
                        i5 |= 1;
                        sduiGradientChartFillStyle6 = (SduiGradientChartFillStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiGradientChartFillStyle$$serializer.INSTANCE, sduiGradientChartFillStyle6);
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 1:
                        sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor3);
                        i5 |= 2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 2:
                        dDecodeDoubleElement4 = decodingBeginStructure.decodeDoubleElement(descriptor2, 2);
                        i5 |= 4;
                        i2 = 7;
                        i4 = 5;
                    case 3:
                        sduiGradientChartFillStyle5 = (SduiGradientChartFillStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, SduiGradientChartFillStyle$$serializer.INSTANCE, sduiGradientChartFillStyle5);
                        i5 |= 8;
                        i2 = 7;
                        i4 = 5;
                    case 4:
                        sduiCornerRadiusInfo3 = (SduiCornerRadiusInfo) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiCornerRadiusInfo$$serializer.INSTANCE, sduiCornerRadiusInfo3);
                        i5 |= 16;
                        i2 = 7;
                        i4 = 5;
                    case 5:
                        sduiGradientStyle3 = (SduiGradientStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, i6, kSerializerArr[i6], sduiGradientStyle3);
                        i5 |= 32;
                        i4 = i6;
                        i2 = 7;
                    case 6:
                        str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, StringSerializer.INSTANCE, str3);
                        i5 |= 64;
                        i4 = i6;
                    case 7:
                        dDecodeDoubleElement3 = decodingBeginStructure.decodeDoubleElement(descriptor2, i2);
                        i5 |= 128;
                        i4 = i6;
                    case 8:
                        sduiChartFillType2 = (SduiChartFillType) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], sduiChartFillType2);
                        i5 |= 256;
                        i4 = i6;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            sduiGradientChartFillStyle = sduiGradientChartFillStyle6;
            sduiGradientStyle = sduiGradientStyle3;
            str = str3;
            sduiCornerRadiusInfo = sduiCornerRadiusInfo3;
            sduiGradientChartFillStyle2 = sduiGradientChartFillStyle5;
            sduiThemedColor = sduiThemedColor3;
            sduiChartFillType = sduiChartFillType2;
            d = dDecodeDoubleElement3;
            d2 = dDecodeDoubleElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiGradientAnimationChartFillStyle(i, sduiGradientChartFillStyle, sduiThemedColor, d2, sduiGradientChartFillStyle2, sduiCornerRadiusInfo, sduiGradientStyle, str, d, sduiChartFillType, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiGradientAnimationChartFillStyle value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiGradientAnimationChartFillStyle.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

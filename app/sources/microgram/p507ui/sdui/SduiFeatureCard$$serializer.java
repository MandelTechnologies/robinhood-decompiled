package microgram.p507ui.sdui;

import com.robinhood.utils.extensions.ResourceTypes;
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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiFeatureCard.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiFeatureCard;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiFeatureCard$$serializer implements PluginHelperInterfaces<SduiFeatureCard> {
    public static final SduiFeatureCard$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiFeatureCard$$serializer sduiFeatureCard$$serializer = new SduiFeatureCard$$serializer();
        INSTANCE = sduiFeatureCard$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiFeatureCard", sduiFeatureCard$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("background_color", true);
        pluginGeneratedSerialDescriptor.addElement("badge", true);
        pluginGeneratedSerialDescriptor.addElement("badge_type", true);
        pluginGeneratedSerialDescriptor.addElement("image", false);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement(ResourceTypes.STYLE, true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiFeatureCard$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiFeatureCard.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(kSerializerArr[3]);
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> kSerializer = kSerializerArr[6];
        KSerializer<?> nullable4 = BuiltinSerializers.getNullable(kSerializerArr[7]);
        SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
        return new KSerializer[]{SduiAction2.INSTANCE, SduiThemedColor$$serializer.INSTANCE, nullable, nullable2, SduiThemedImageSource$$serializer.INSTANCE, nullable3, kSerializer, nullable4, sduiMarkdownText$$serializer, sduiMarkdownText$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiFeatureCard deserialize(Decoding2 decoder) {
        int i;
        SduiFeatureDiscoveryContainerStyle sduiFeatureDiscoveryContainerStyle;
        SduiComponentType sduiComponentType;
        SduiThemedImageSource sduiThemedImageSource;
        SduiMarkdownText sduiMarkdownText;
        SduiMarkdownText sduiMarkdownText2;
        String str;
        SduiFeatureDiscoveryBadgeType sduiFeatureDiscoveryBadgeType;
        String str2;
        SduiAction sduiAction;
        SduiThemedColor sduiThemedColor;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiFeatureCard.$childSerializers;
        int i2 = 9;
        SduiAction sduiAction2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction3 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            SduiThemedColor sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            SduiFeatureDiscoveryBadgeType sduiFeatureDiscoveryBadgeType2 = (SduiFeatureDiscoveryBadgeType) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            SduiThemedImageSource sduiThemedImageSource2 = (SduiThemedImageSource) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, SduiThemedImageSource$$serializer.INSTANCE, null);
            String str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            SduiFeatureDiscoveryContainerStyle sduiFeatureDiscoveryContainerStyle2 = (SduiFeatureDiscoveryContainerStyle) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
            SduiMarkdownText sduiMarkdownText3 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, sduiMarkdownText$$serializer, null);
            sduiFeatureDiscoveryContainerStyle = sduiFeatureDiscoveryContainerStyle2;
            sduiAction = sduiAction3;
            sduiMarkdownText = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 9, sduiMarkdownText$$serializer, null);
            str = str4;
            sduiMarkdownText2 = sduiMarkdownText3;
            sduiThemedImageSource = sduiThemedImageSource2;
            str2 = str3;
            i = 1023;
            sduiComponentType = sduiComponentType2;
            sduiFeatureDiscoveryBadgeType = sduiFeatureDiscoveryBadgeType2;
            sduiThemedColor = sduiThemedColor2;
        } else {
            int i3 = 7;
            int i4 = 6;
            int i5 = 3;
            boolean z = true;
            int i6 = 0;
            SduiFeatureDiscoveryContainerStyle sduiFeatureDiscoveryContainerStyle3 = null;
            SduiComponentType sduiComponentType3 = null;
            SduiThemedImageSource sduiThemedImageSource3 = null;
            SduiMarkdownText sduiMarkdownText4 = null;
            SduiMarkdownText sduiMarkdownText5 = null;
            String str5 = null;
            SduiFeatureDiscoveryBadgeType sduiFeatureDiscoveryBadgeType3 = null;
            String str6 = null;
            SduiThemedColor sduiThemedColor3 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        i5 = 3;
                        i4 = 6;
                        i3 = 7;
                    case 0:
                        sduiAction2 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction2);
                        i6 |= 1;
                        i2 = 9;
                        i5 = 3;
                        i4 = 6;
                        i3 = 7;
                    case 1:
                        sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor3);
                        i6 |= 2;
                        i2 = 9;
                        i5 = 3;
                        i4 = 6;
                        i3 = 7;
                    case 2:
                        str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str6);
                        i6 |= 4;
                        i2 = 9;
                        i5 = 3;
                        i4 = 6;
                        i3 = 7;
                    case 3:
                        sduiFeatureDiscoveryBadgeType3 = (SduiFeatureDiscoveryBadgeType) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i5, kSerializerArr[i5], sduiFeatureDiscoveryBadgeType3);
                        i6 |= 8;
                        i2 = 9;
                        i4 = 6;
                        i3 = 7;
                    case 4:
                        sduiThemedImageSource3 = (SduiThemedImageSource) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, SduiThemedImageSource$$serializer.INSTANCE, sduiThemedImageSource3);
                        i6 |= 16;
                        i2 = 9;
                        i4 = 6;
                        i3 = 7;
                    case 5:
                        str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, str5);
                        i6 |= 32;
                        i2 = 9;
                        i4 = 6;
                        i3 = 7;
                    case 6:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i4, kSerializerArr[i4], sduiComponentType3);
                        i6 |= 64;
                        i2 = 9;
                        i3 = 7;
                    case 7:
                        sduiFeatureDiscoveryContainerStyle3 = (SduiFeatureDiscoveryContainerStyle) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, kSerializerArr[i3], sduiFeatureDiscoveryContainerStyle3);
                        i6 |= 128;
                        i2 = 9;
                    case 8:
                        sduiMarkdownText5 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText5);
                        i6 |= 256;
                        i2 = 9;
                    case 9:
                        sduiMarkdownText4 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText4);
                        i6 |= 512;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i6;
            sduiFeatureDiscoveryContainerStyle = sduiFeatureDiscoveryContainerStyle3;
            sduiComponentType = sduiComponentType3;
            sduiThemedImageSource = sduiThemedImageSource3;
            sduiMarkdownText = sduiMarkdownText4;
            sduiMarkdownText2 = sduiMarkdownText5;
            str = str5;
            sduiFeatureDiscoveryBadgeType = sduiFeatureDiscoveryBadgeType3;
            str2 = str6;
            sduiAction = sduiAction2;
            sduiThemedColor = sduiThemedColor3;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiFeatureCard(i, sduiAction, sduiThemedColor, str2, sduiFeatureDiscoveryBadgeType, sduiThemedImageSource, str, sduiComponentType, sduiFeatureDiscoveryContainerStyle, sduiMarkdownText2, sduiMarkdownText, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiFeatureCard value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiFeatureCard.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

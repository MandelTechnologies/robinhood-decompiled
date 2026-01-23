package microgram.p507ui.sdui;

import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiFeatureDiscovery.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiFeatureDiscovery;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiFeatureDiscovery$$serializer implements PluginHelperInterfaces<SduiFeatureDiscovery> {
    public static final SduiFeatureDiscovery$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiFeatureDiscovery$$serializer sduiFeatureDiscovery$$serializer = new SduiFeatureDiscovery$$serializer();
        INSTANCE = sduiFeatureDiscovery$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiFeatureDiscovery", sduiFeatureDiscovery$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("disclosure_action", true);
        pluginGeneratedSerialDescriptor.addElement("features", false);
        pluginGeneratedSerialDescriptor.addElement("height", true);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("show_more_cutoff", true);
        pluginGeneratedSerialDescriptor.addElement(ResourceTypes.STYLE, true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiFeatureDiscovery$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiFeatureDiscovery.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiAction2.INSTANCE);
        KSerializer<?> kSerializer = kSerializerArr[1];
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{nullable, kSerializer, BuiltinSerializers.getNullable(longSerializer), BuiltinSerializers.getNullable(StringSerializer.INSTANCE), kSerializerArr[4], BuiltinSerializers.getNullable(longSerializer), BuiltinSerializers.getNullable(kSerializerArr[6]), SduiMarkdownText$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiFeatureDiscovery deserialize(Decoding2 decoder) {
        int i;
        SduiMarkdownText sduiMarkdownText;
        SduiFeatureDiscoveryContainerStyle sduiFeatureDiscoveryContainerStyle;
        Long l;
        SduiComponentType sduiComponentType;
        SduiAction sduiAction;
        List list;
        Long l2;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiFeatureDiscovery.$childSerializers;
        int i2 = 7;
        int i3 = 4;
        SduiAction sduiAction2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction3 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            List list2 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l3 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, longSerializer, null);
            String str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            Long l4 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, longSerializer, null);
            sduiFeatureDiscoveryContainerStyle = (SduiFeatureDiscoveryContainerStyle) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            sduiAction = sduiAction3;
            sduiMarkdownText = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, SduiMarkdownText$$serializer.INSTANCE, null);
            l = l4;
            str = str2;
            l2 = l3;
            i = 255;
            sduiComponentType = sduiComponentType2;
            list = list2;
        } else {
            int i4 = 1;
            boolean z = true;
            int i5 = 0;
            SduiMarkdownText sduiMarkdownText2 = null;
            SduiFeatureDiscoveryContainerStyle sduiFeatureDiscoveryContainerStyle2 = null;
            Long l5 = null;
            SduiComponentType sduiComponentType3 = null;
            List list3 = null;
            Long l6 = null;
            String str3 = null;
            while (z) {
                int i6 = i3;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 4;
                        i4 = 1;
                    case 0:
                        sduiAction2 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction2);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 4;
                        i4 = 1;
                    case 1:
                        list3 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, i4, kSerializerArr[i4], list3);
                        i5 |= 2;
                        i2 = 7;
                        i3 = 4;
                    case 2:
                        l6 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, LongSerializer.INSTANCE, l6);
                        i5 |= 4;
                        i2 = 7;
                        i3 = 4;
                    case 3:
                        str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str3);
                        i5 |= 8;
                        i2 = 7;
                        i3 = 4;
                    case 4:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i6, kSerializerArr[i6], sduiComponentType3);
                        i5 |= 16;
                        i3 = i6;
                        i2 = 7;
                    case 5:
                        l5 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, LongSerializer.INSTANCE, l5);
                        i5 |= 32;
                        i3 = i6;
                    case 6:
                        sduiFeatureDiscoveryContainerStyle2 = (SduiFeatureDiscoveryContainerStyle) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, kSerializerArr[6], sduiFeatureDiscoveryContainerStyle2);
                        i5 |= 64;
                        i3 = i6;
                    case 7:
                        sduiMarkdownText2 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText2);
                        i5 |= 128;
                        i3 = i6;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            sduiMarkdownText = sduiMarkdownText2;
            sduiFeatureDiscoveryContainerStyle = sduiFeatureDiscoveryContainerStyle2;
            l = l5;
            sduiComponentType = sduiComponentType3;
            sduiAction = sduiAction2;
            list = list3;
            l2 = l6;
            str = str3;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiFeatureDiscovery(i, sduiAction, list, l2, str, sduiComponentType, l, sduiFeatureDiscoveryContainerStyle, sduiMarkdownText, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiFeatureDiscovery value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiFeatureDiscovery.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

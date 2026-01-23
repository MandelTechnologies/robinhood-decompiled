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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiStockListItem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiStockListItem;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiStockListItem$$serializer implements PluginHelperInterfaces<SduiStockListItem> {
    public static final SduiStockListItem$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiStockListItem$$serializer sduiStockListItem$$serializer = new SduiStockListItem$$serializer();
        INSTANCE = sduiStockListItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiStockListItem", sduiStockListItem$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("chart", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("subvalue", false);
        pluginGeneratedSerialDescriptor.addElement("tap_action", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiStockListItem$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = SduiStockListItem.$childSerializers[2];
        SduiStockListItemText$$serializer sduiStockListItemText$$serializer = SduiStockListItemText$$serializer.INSTANCE;
        return new KSerializer[]{SduiStockListItemChart$$serializer.INSTANCE, StringSerializer.INSTANCE, kSerializer, sduiStockListItemText$$serializer, sduiStockListItemText$$serializer, SduiAction2.INSTANCE, sduiStockListItemText$$serializer, SduiStockListItemValue$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiStockListItem deserialize(Decoding2 decoder) {
        int i;
        SduiStockListItemValue sduiStockListItemValue;
        SduiStockListItemText sduiStockListItemText;
        SduiAction sduiAction;
        SduiStockListItemText sduiStockListItemText2;
        SduiStockListItemChart sduiStockListItemChart;
        String str;
        SduiComponentType sduiComponentType;
        SduiStockListItemText sduiStockListItemText3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiStockListItem.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        SduiStockListItemChart sduiStockListItemChart2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiStockListItemChart sduiStockListItemChart3 = (SduiStockListItemChart) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiStockListItemChart$$serializer.INSTANCE, null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            SduiStockListItemText$$serializer sduiStockListItemText$$serializer = SduiStockListItemText$$serializer.INSTANCE;
            SduiStockListItemText sduiStockListItemText4 = (SduiStockListItemText) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, sduiStockListItemText$$serializer, null);
            SduiStockListItemText sduiStockListItemText5 = (SduiStockListItemText) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, sduiStockListItemText$$serializer, null);
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, SduiAction2.INSTANCE, null);
            SduiStockListItemText sduiStockListItemText6 = (SduiStockListItemText) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, sduiStockListItemText$$serializer, null);
            sduiComponentType = sduiComponentType2;
            sduiStockListItemChart = sduiStockListItemChart3;
            sduiStockListItemValue = (SduiStockListItemValue) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, SduiStockListItemValue$$serializer.INSTANCE, null);
            sduiStockListItemText = sduiStockListItemText6;
            sduiAction = sduiAction2;
            sduiStockListItemText3 = sduiStockListItemText4;
            sduiStockListItemText2 = sduiStockListItemText5;
            i = 255;
            str = strDecodeStringElement;
        } else {
            int i4 = 2;
            boolean z = true;
            int i5 = 0;
            SduiStockListItemValue sduiStockListItemValue2 = null;
            SduiStockListItemText sduiStockListItemText7 = null;
            SduiAction sduiAction3 = null;
            SduiStockListItemText sduiStockListItemText8 = null;
            String strDecodeStringElement2 = null;
            SduiComponentType sduiComponentType3 = null;
            SduiStockListItemText sduiStockListItemText9 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 6;
                        i4 = 2;
                    case 0:
                        sduiStockListItemChart2 = (SduiStockListItemChart) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiStockListItemChart$$serializer.INSTANCE, sduiStockListItemChart2);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 2;
                    case 1:
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i5 |= 2;
                        i2 = 7;
                    case 2:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i4, kSerializerArr[i4], sduiComponentType3);
                        i5 |= 4;
                        i2 = 7;
                    case 3:
                        sduiStockListItemText9 = (SduiStockListItemText) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, SduiStockListItemText$$serializer.INSTANCE, sduiStockListItemText9);
                        i5 |= 8;
                        i2 = 7;
                    case 4:
                        sduiStockListItemText8 = (SduiStockListItemText) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, SduiStockListItemText$$serializer.INSTANCE, sduiStockListItemText8);
                        i5 |= 16;
                        i2 = 7;
                    case 5:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, SduiAction2.INSTANCE, sduiAction3);
                        i5 |= 32;
                    case 6:
                        sduiStockListItemText7 = (SduiStockListItemText) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, SduiStockListItemText$$serializer.INSTANCE, sduiStockListItemText7);
                        i5 |= 64;
                    case 7:
                        sduiStockListItemValue2 = (SduiStockListItemValue) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, SduiStockListItemValue$$serializer.INSTANCE, sduiStockListItemValue2);
                        i5 |= 128;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            sduiStockListItemValue = sduiStockListItemValue2;
            sduiStockListItemText = sduiStockListItemText7;
            sduiAction = sduiAction3;
            sduiStockListItemText2 = sduiStockListItemText8;
            sduiStockListItemChart = sduiStockListItemChart2;
            str = strDecodeStringElement2;
            sduiComponentType = sduiComponentType3;
            sduiStockListItemText3 = sduiStockListItemText9;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiStockListItem(i, sduiStockListItemChart, str, sduiComponentType, sduiStockListItemText3, sduiStockListItemText2, sduiAction, sduiStockListItemText, sduiStockListItemValue, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiStockListItem value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiStockListItem.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

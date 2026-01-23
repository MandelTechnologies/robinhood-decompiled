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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiTableColumnHeader.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiTableColumnHeader;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiTableColumnHeader$$serializer implements PluginHelperInterfaces<SduiTableColumnHeader> {
    public static final SduiTableColumnHeader$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiTableColumnHeader$$serializer sduiTableColumnHeader$$serializer = new SduiTableColumnHeader$$serializer();
        INSTANCE = sduiTableColumnHeader$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiTableColumnHeader", sduiTableColumnHeader$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("active", true);
        pluginGeneratedSerialDescriptor.addElement("alignment", true);
        pluginGeneratedSerialDescriptor.addElement("icon", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("secondary_icon", true);
        pluginGeneratedSerialDescriptor.addElement("secondary_icon_action", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiTableColumnHeader$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiTableColumnHeader.$childSerializers;
        SduiAction2 sduiAction2 = SduiAction2.INSTANCE;
        return new KSerializer[]{BuiltinSerializers.getNullable(sduiAction2), BooleanSerializer.INSTANCE, kSerializerArr[2], BuiltinSerializers.getNullable(kSerializerArr[3]), kSerializerArr[4], BuiltinSerializers.getNullable(kSerializerArr[5]), BuiltinSerializers.getNullable(sduiAction2), StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiTableColumnHeader deserialize(Decoding2 decoder) {
        int i;
        SduiAction sduiAction;
        SduiIcon sduiIcon;
        SduiComponentType sduiComponentType;
        boolean z;
        SduiAction sduiAction2;
        SduiChartLayeredStackHorizontalEdge sduiChartLayeredStackHorizontalEdge;
        SduiIcon sduiIcon2;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiTableColumnHeader.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 3;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction2 sduiAction22 = SduiAction2.INSTANCE;
            SduiAction sduiAction3 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, sduiAction22, null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
            SduiChartLayeredStackHorizontalEdge sduiChartLayeredStackHorizontalEdge2 = (SduiChartLayeredStackHorizontalEdge) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            SduiIcon sduiIcon3 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            sduiIcon = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            sduiAction = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, sduiAction22, null);
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 7);
            i = 255;
            sduiIcon2 = sduiIcon3;
            sduiComponentType = sduiComponentType2;
            sduiChartLayeredStackHorizontalEdge = sduiChartLayeredStackHorizontalEdge2;
            z = zDecodeBooleanElement;
            sduiAction2 = sduiAction3;
        } else {
            int i5 = 2;
            boolean z2 = true;
            int i6 = 0;
            SduiAction sduiAction4 = null;
            SduiIcon sduiIcon4 = null;
            SduiAction sduiAction5 = null;
            SduiChartLayeredStackHorizontalEdge sduiChartLayeredStackHorizontalEdge3 = null;
            SduiIcon sduiIcon5 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement2 = false;
            SduiComponentType sduiComponentType3 = null;
            while (z2) {
                int i7 = i4;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 6;
                        i4 = 3;
                        i5 = 2;
                    case 0:
                        sduiAction5 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction5);
                        i6 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 3;
                        i5 = 2;
                    case 1:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
                        i6 |= 2;
                        i2 = 7;
                        i4 = 3;
                    case 2:
                        sduiChartLayeredStackHorizontalEdge3 = (SduiChartLayeredStackHorizontalEdge) decodingBeginStructure.decodeSerializableElement(descriptor2, i5, kSerializerArr[i5], sduiChartLayeredStackHorizontalEdge3);
                        i6 |= 4;
                        i2 = 7;
                        i4 = 3;
                    case 3:
                        sduiIcon5 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i7, kSerializerArr[i7], sduiIcon5);
                        i6 |= 8;
                        i4 = i7;
                        i2 = 7;
                    case 4:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], sduiComponentType3);
                        i6 |= 16;
                        i4 = i7;
                    case 5:
                        sduiIcon4 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, kSerializerArr[5], sduiIcon4);
                        i6 |= 32;
                        i4 = i7;
                    case 6:
                        sduiAction4 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, SduiAction2.INSTANCE, sduiAction4);
                        i6 |= 64;
                        i4 = i7;
                    case 7:
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i6 |= 128;
                        i4 = i7;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i6;
            sduiAction = sduiAction4;
            sduiIcon = sduiIcon4;
            sduiComponentType = sduiComponentType3;
            z = zDecodeBooleanElement2;
            sduiAction2 = sduiAction5;
            sduiChartLayeredStackHorizontalEdge = sduiChartLayeredStackHorizontalEdge3;
            sduiIcon2 = sduiIcon5;
            strDecodeStringElement = strDecodeStringElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiTableColumnHeader(i, sduiAction2, z, sduiChartLayeredStackHorizontalEdge, sduiIcon2, sduiComponentType, sduiIcon, sduiAction, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiTableColumnHeader value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiTableColumnHeader.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

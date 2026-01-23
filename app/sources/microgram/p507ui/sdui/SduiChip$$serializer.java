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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiChip.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiChip;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiChip$$serializer implements PluginHelperInterfaces<SduiChip> {
    public static final SduiChip$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiChip$$serializer sduiChip$$serializer = new SduiChip$$serializer();
        INSTANCE = sduiChip$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiChip", sduiChip$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("count", true);
        pluginGeneratedSerialDescriptor.addElement("has_dropdown", true);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("is_selected", true);
        pluginGeneratedSerialDescriptor.addElement("leading_icon", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("selected_background_style", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("trailing_icon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiChip$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiChip.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(LongSerializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{SduiAction2.INSTANCE, nullable, BuiltinSerializers.getNullable(booleanSerializer), booleanSerializer, booleanSerializer, BuiltinSerializers.getNullable(kSerializerArr[5]), kSerializerArr[6], kSerializerArr[7], StringSerializer.INSTANCE, BuiltinSerializers.getNullable(kSerializerArr[9])};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiChip deserialize(Decoding2 decoder) {
        boolean z;
        SduiComponentType sduiComponentType;
        SduiChipSelectedStyle sduiChipSelectedStyle;
        SduiIcon sduiIcon;
        SduiAction sduiAction;
        SduiIcon sduiIcon2;
        Boolean bool;
        Long l;
        boolean z2;
        int i;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiChip.$childSerializers;
        int i2 = 8;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            Long l2 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, LongSerializer.INSTANCE, null);
            Boolean bool2 = (Boolean) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, BooleanSerializer.INSTANCE, null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 3);
            boolean zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 4);
            SduiIcon sduiIcon3 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            SduiChipSelectedStyle sduiChipSelectedStyle2 = (SduiChipSelectedStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 8);
            sduiIcon2 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 9, kSerializerArr[9], null);
            sduiAction = sduiAction2;
            z = zDecodeBooleanElement;
            str = strDecodeStringElement;
            z2 = zDecodeBooleanElement2;
            bool = bool2;
            i = 1023;
            sduiChipSelectedStyle = sduiChipSelectedStyle2;
            sduiComponentType = sduiComponentType2;
            sduiIcon = sduiIcon3;
            l = l2;
        } else {
            int i6 = 5;
            boolean z3 = true;
            boolean zDecodeBooleanElement3 = false;
            int i7 = 0;
            SduiComponentType sduiComponentType3 = null;
            SduiChipSelectedStyle sduiChipSelectedStyle3 = null;
            SduiIcon sduiIcon4 = null;
            SduiIcon sduiIcon5 = null;
            Boolean bool3 = null;
            SduiAction sduiAction3 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement4 = false;
            Long l3 = null;
            while (z3) {
                int i8 = i5;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i7 |= 1;
                        i2 = 8;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                    case 1:
                        l3 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, LongSerializer.INSTANCE, l3);
                        i7 |= 2;
                        i2 = 8;
                        i3 = 9;
                        i5 = 6;
                        i6 = 5;
                    case 2:
                        bool3 = (Boolean) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, BooleanSerializer.INSTANCE, bool3);
                        i7 |= 4;
                        i2 = 8;
                        i3 = 9;
                        i5 = 6;
                        i6 = 5;
                    case 3:
                        i7 |= 8;
                        zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(descriptor2, 3);
                        i2 = 8;
                        i5 = 6;
                    case 4:
                        zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(descriptor2, 4);
                        i7 |= 16;
                        i2 = 8;
                        i5 = 6;
                    case 5:
                        sduiIcon4 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i6, kSerializerArr[i6], sduiIcon4);
                        i7 |= 32;
                        i2 = 8;
                        i5 = 6;
                    case 6:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i8, kSerializerArr[i8], sduiComponentType3);
                        i7 |= 64;
                        i5 = i8;
                        i2 = 8;
                    case 7:
                        sduiChipSelectedStyle3 = (SduiChipSelectedStyle) decodingBeginStructure.decodeSerializableElement(descriptor2, i4, kSerializerArr[i4], sduiChipSelectedStyle3);
                        i7 |= 128;
                        i5 = i8;
                    case 8:
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i7 |= 256;
                        i5 = i8;
                    case 9:
                        sduiIcon5 = (SduiIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i3, kSerializerArr[i3], sduiIcon5);
                        i7 |= 512;
                        i5 = i8;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement3;
            sduiComponentType = sduiComponentType3;
            sduiChipSelectedStyle = sduiChipSelectedStyle3;
            sduiIcon = sduiIcon4;
            sduiAction = sduiAction3;
            sduiIcon2 = sduiIcon5;
            bool = bool3;
            l = l3;
            z2 = zDecodeBooleanElement4;
            i = i7;
            str = strDecodeStringElement2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiChip(i, sduiAction, l, bool, z, z2, sduiIcon, sduiComponentType, sduiChipSelectedStyle, str, sduiIcon2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiChip value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiChip.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

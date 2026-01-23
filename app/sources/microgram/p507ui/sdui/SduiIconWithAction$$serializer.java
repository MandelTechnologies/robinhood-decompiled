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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiIconWithAction.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiIconWithAction;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiIconWithAction$$serializer implements PluginHelperInterfaces<SduiIconWithAction> {
    public static final SduiIconWithAction$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiIconWithAction$$serializer sduiIconWithAction$$serializer = new SduiIconWithAction$$serializer();
        INSTANCE = sduiIconWithAction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiIconWithAction", sduiIconWithAction$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("icon_alt_text", false);
        pluginGeneratedSerialDescriptor.addElement("icon_color_override", true);
        pluginGeneratedSerialDescriptor.addElement("web_popover", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiIconWithAction$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SduiAction2.INSTANCE, SduiIconWithAction.$childSerializers[1], StringSerializer.INSTANCE, BuiltinSerializers.getNullable(SduiThemedColor$$serializer.INSTANCE), BuiltinSerializers.getNullable(SduiWebPopover$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiIconWithAction deserialize(Decoding2 decoder) {
        int i;
        SduiAction sduiAction;
        SduiIcon sduiIcon;
        String str;
        SduiThemedColor sduiThemedColor;
        SduiWebPopover sduiWebPopover;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiIconWithAction.$childSerializers;
        SduiAction sduiAction2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction3 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            SduiIcon sduiIcon2 = (SduiIcon) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            sduiIcon = sduiIcon2;
            sduiAction = sduiAction3;
            sduiThemedColor = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiThemedColor$$serializer.INSTANCE, null);
            sduiWebPopover = (SduiWebPopover) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiWebPopover$$serializer.INSTANCE, null);
            str = strDecodeStringElement;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiIcon sduiIcon3 = null;
            String strDecodeStringElement2 = null;
            SduiThemedColor sduiThemedColor2 = null;
            SduiWebPopover sduiWebPopover2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiAction2 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiIcon3 = (SduiIcon) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], sduiIcon3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiWebPopover2 = (SduiWebPopover) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiWebPopover$$serializer.INSTANCE, sduiWebPopover2);
                    i2 |= 16;
                }
            }
            i = i2;
            sduiAction = sduiAction2;
            sduiIcon = sduiIcon3;
            str = strDecodeStringElement2;
            sduiThemedColor = sduiThemedColor2;
            sduiWebPopover = sduiWebPopover2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiIconWithAction(i, sduiAction, sduiIcon, str, sduiThemedColor, sduiWebPopover, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiIconWithAction value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiIconWithAction.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

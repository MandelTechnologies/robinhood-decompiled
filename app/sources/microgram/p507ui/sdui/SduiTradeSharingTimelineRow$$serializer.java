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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiTradeSharingTimelineRow.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiTradeSharingTimelineRow;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiTradeSharingTimelineRow$$serializer implements PluginHelperInterfaces<SduiTradeSharingTimelineRow> {
    public static final SduiTradeSharingTimelineRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiTradeSharingTimelineRow$$serializer sduiTradeSharingTimelineRow$$serializer = new SduiTradeSharingTimelineRow$$serializer();
        INSTANCE = sduiTradeSharingTimelineRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiTradeSharingTimelineRow", sduiTradeSharingTimelineRow$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("primary_information", false);
        pluginGeneratedSerialDescriptor.addElement("secondary_information", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiTradeSharingTimelineRow$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = SduiTradeSharingTimelineRow.$childSerializers[0];
        SduiText$$serializer sduiText$$serializer = SduiText$$serializer.INSTANCE;
        return new KSerializer[]{kSerializer, sduiText$$serializer, BuiltinSerializers.getNullable(sduiText$$serializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiTradeSharingTimelineRow deserialize(Decoding2 decoder) {
        int i;
        SduiIcon sduiIcon;
        SduiText sduiText;
        SduiText sduiText2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiTradeSharingTimelineRow.$childSerializers;
        SduiIcon sduiIcon2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiIcon sduiIcon3 = (SduiIcon) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            SduiText$$serializer sduiText$$serializer = SduiText$$serializer.INSTANCE;
            SduiText sduiText3 = (SduiText) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, sduiText$$serializer, null);
            sduiIcon = sduiIcon3;
            sduiText2 = (SduiText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, sduiText$$serializer, null);
            i = 7;
            sduiText = sduiText3;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiText sduiText4 = null;
            SduiText sduiText5 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiIcon2 = (SduiIcon) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], sduiIcon2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiText4 = (SduiText) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, SduiText$$serializer.INSTANCE, sduiText4);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiText5 = (SduiText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiText$$serializer.INSTANCE, sduiText5);
                    i2 |= 4;
                }
            }
            i = i2;
            sduiIcon = sduiIcon2;
            sduiText = sduiText4;
            sduiText2 = sduiText5;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiTradeSharingTimelineRow(i, sduiIcon, sduiText, sduiText2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiTradeSharingTimelineRow value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiTradeSharingTimelineRow.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

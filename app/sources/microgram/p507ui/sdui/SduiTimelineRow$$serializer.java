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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiTimelineRow.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiTimelineRow;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiTimelineRow$$serializer implements PluginHelperInterfaces<SduiTimelineRow> {
    public static final SduiTimelineRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiTimelineRow$$serializer sduiTimelineRow$$serializer = new SduiTimelineRow$$serializer();
        INSTANCE = sduiTimelineRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiTimelineRow", sduiTimelineRow$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("detail_action", true);
        pluginGeneratedSerialDescriptor.addElement("detail_text", true);
        pluginGeneratedSerialDescriptor.addElement("info_icon", true);
        pluginGeneratedSerialDescriptor.addElement("primary_information", false);
        pluginGeneratedSerialDescriptor.addElement("secondary_information", false);
        pluginGeneratedSerialDescriptor.addElement("state", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiTimelineRow$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiTimelineRow.$childSerializers;
        SduiAction2 sduiAction2 = SduiAction2.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(sduiAction2);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(sduiAction2);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, BuiltinSerializers.getNullable(stringSerializer), BuiltinSerializers.getNullable(kSerializerArr[3]), stringSerializer, stringSerializer, kSerializerArr[6]};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiTimelineRow deserialize(Decoding2 decoder) {
        int i;
        SduiTimelineRowState sduiTimelineRowState;
        SduiAction sduiAction;
        SduiAction sduiAction2;
        String str;
        SduiInfoIcon sduiInfoIcon;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiTimelineRow.$childSerializers;
        int i2 = 5;
        SduiAction sduiAction3 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction2 sduiAction22 = SduiAction2.INSTANCE;
            SduiAction sduiAction4 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, sduiAction22, null);
            SduiAction sduiAction5 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, sduiAction22, null);
            String str4 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, null);
            SduiInfoIcon sduiInfoIcon2 = (SduiInfoIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
            sduiTimelineRowState = (SduiTimelineRowState) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            sduiAction2 = sduiAction5;
            str3 = strDecodeStringElement2;
            str2 = strDecodeStringElement;
            str = str4;
            i = 127;
            sduiInfoIcon = sduiInfoIcon2;
            sduiAction = sduiAction4;
        } else {
            boolean z = true;
            int i3 = 0;
            SduiTimelineRowState sduiTimelineRowState2 = null;
            SduiAction sduiAction6 = null;
            String str5 = null;
            SduiInfoIcon sduiInfoIcon3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        sduiAction6 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiAction2.INSTANCE, sduiAction6);
                        i3 |= 2;
                        i2 = 5;
                    case 2:
                        str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str5);
                        i3 |= 4;
                    case 3:
                        sduiInfoIcon3 = (SduiInfoIcon) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], sduiInfoIcon3);
                        i3 |= 8;
                    case 4:
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i3 |= 16;
                    case 5:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i3 |= 32;
                    case 6:
                        sduiTimelineRowState2 = (SduiTimelineRowState) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], sduiTimelineRowState2);
                        i3 |= 64;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i3;
            sduiTimelineRowState = sduiTimelineRowState2;
            sduiAction = sduiAction3;
            sduiAction2 = sduiAction6;
            str = str5;
            sduiInfoIcon = sduiInfoIcon3;
            str2 = strDecodeStringElement3;
            str3 = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiTimelineRow(i, sduiAction, sduiAction2, str, sduiInfoIcon, str2, str3, sduiTimelineRowState, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiTimelineRow value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiTimelineRow.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

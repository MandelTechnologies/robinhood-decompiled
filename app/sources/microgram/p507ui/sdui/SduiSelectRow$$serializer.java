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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiSelectRow.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiSelectRow;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiSelectRow$$serializer implements PluginHelperInterfaces<SduiSelectRow> {
    public static final SduiSelectRow$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiSelectRow$$serializer sduiSelectRow$$serializer = new SduiSelectRow$$serializer();
        INSTANCE = sduiSelectRow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiSelectRow", sduiSelectRow$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("is_enabled", true);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("state", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiSelectRow$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiSelectRow.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BooleanSerializer.INSTANCE, BuiltinSerializers.getNullable(stringSerializer), kSerializerArr[3], SduiSelectRowState$$serializer.INSTANCE, BuiltinSerializers.getNullable(stringSerializer), stringSerializer, kSerializerArr[7]};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiSelectRow deserialize(Decoding2 decoder) {
        int i;
        SduiSelectRowType sduiSelectRowType;
        String str;
        SduiSelectRowState sduiSelectRowState;
        boolean z;
        String str2;
        String str3;
        SduiComponentType sduiComponentType;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiSelectRow.$childSerializers;
        int i2 = 6;
        int i3 = 3;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, stringSerializer, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            SduiSelectRowState sduiSelectRowState2 = (SduiSelectRowState) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, SduiSelectRowState$$serializer.INSTANCE, null);
            String str6 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 6);
            sduiSelectRowType = (SduiSelectRowType) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            str2 = strDecodeStringElement;
            str4 = strDecodeStringElement2;
            str = str6;
            sduiSelectRowState = sduiSelectRowState2;
            str3 = str5;
            i = 255;
            sduiComponentType = sduiComponentType2;
            z = zDecodeBooleanElement;
        } else {
            boolean z2 = true;
            int i4 = 0;
            SduiSelectRowType sduiSelectRowType2 = null;
            String str7 = null;
            String strDecodeStringElement3 = null;
            String str8 = null;
            SduiComponentType sduiComponentType3 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement2 = false;
            SduiSelectRowState sduiSelectRowState3 = null;
            while (z2) {
                int i5 = i3;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 3;
                    case 0:
                        i4 |= 1;
                        strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i2 = 6;
                        i3 = 3;
                    case 1:
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
                        i4 |= 2;
                        i2 = 6;
                        i3 = 3;
                    case 2:
                        str8 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, StringSerializer.INSTANCE, str8);
                        i4 |= 4;
                        i2 = 6;
                        i3 = 3;
                    case 3:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i5, kSerializerArr[i5], sduiComponentType3);
                        i4 |= 8;
                        i3 = i5;
                        i2 = 6;
                    case 4:
                        sduiSelectRowState3 = (SduiSelectRowState) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, SduiSelectRowState$$serializer.INSTANCE, sduiSelectRowState3);
                        i4 |= 16;
                        i3 = i5;
                    case 5:
                        str7 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, str7);
                        i4 |= 32;
                        i3 = i5;
                    case 6:
                        strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i4 |= 64;
                        i3 = i5;
                    case 7:
                        sduiSelectRowType2 = (SduiSelectRowType) decodingBeginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], sduiSelectRowType2);
                        i4 |= 128;
                        i3 = i5;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i4;
            sduiSelectRowType = sduiSelectRowType2;
            str = str7;
            sduiSelectRowState = sduiSelectRowState3;
            z = zDecodeBooleanElement2;
            str2 = strDecodeStringElement3;
            str3 = str8;
            sduiComponentType = sduiComponentType3;
            str4 = strDecodeStringElement4;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiSelectRow(i, str2, z, str3, sduiComponentType, sduiSelectRowState, str, str4, sduiSelectRowType, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiSelectRow value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiSelectRow.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

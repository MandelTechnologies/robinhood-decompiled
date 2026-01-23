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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiTimelineColorOverride.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiTimelineColorOverride;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiTimelineColorOverride$$serializer implements PluginHelperInterfaces<SduiTimelineColorOverride> {
    public static final SduiTimelineColorOverride$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiTimelineColorOverride$$serializer sduiTimelineColorOverride$$serializer = new SduiTimelineColorOverride$$serializer();
        INSTANCE = sduiTimelineColorOverride$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiTimelineColorOverride", sduiTimelineColorOverride$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("complete", true);
        pluginGeneratedSerialDescriptor.addElement("error", true);
        pluginGeneratedSerialDescriptor.addElement("incomplete", true);
        pluginGeneratedSerialDescriptor.addElement("ongoing", true);
        pluginGeneratedSerialDescriptor.addElement("warning", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiTimelineColorOverride$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializers.getNullable(sduiThemedColor$$serializer), BuiltinSerializers.getNullable(sduiThemedColor$$serializer), BuiltinSerializers.getNullable(sduiThemedColor$$serializer), BuiltinSerializers.getNullable(sduiThemedColor$$serializer), BuiltinSerializers.getNullable(sduiThemedColor$$serializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiTimelineColorOverride deserialize(Decoding2 decoder) {
        int i;
        SduiThemedColor sduiThemedColor;
        SduiThemedColor sduiThemedColor2;
        SduiThemedColor sduiThemedColor3;
        SduiThemedColor sduiThemedColor4;
        SduiThemedColor sduiThemedColor5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        SduiThemedColor sduiThemedColor6 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
            SduiThemedColor sduiThemedColor7 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, sduiThemedColor$$serializer, null);
            SduiThemedColor sduiThemedColor8 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, sduiThemedColor$$serializer, null);
            SduiThemedColor sduiThemedColor9 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, sduiThemedColor$$serializer, null);
            SduiThemedColor sduiThemedColor10 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, sduiThemedColor$$serializer, null);
            sduiThemedColor5 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, sduiThemedColor$$serializer, null);
            sduiThemedColor4 = sduiThemedColor10;
            i = 31;
            sduiThemedColor3 = sduiThemedColor9;
            sduiThemedColor2 = sduiThemedColor8;
            sduiThemedColor = sduiThemedColor7;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiThemedColor sduiThemedColor11 = null;
            SduiThemedColor sduiThemedColor12 = null;
            SduiThemedColor sduiThemedColor13 = null;
            SduiThemedColor sduiThemedColor14 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiThemedColor6 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor6);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiThemedColor11 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor11);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    sduiThemedColor12 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor12);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    sduiThemedColor13 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor13);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiThemedColor14 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor14);
                    i2 |= 16;
                }
            }
            i = i2;
            sduiThemedColor = sduiThemedColor6;
            sduiThemedColor2 = sduiThemedColor11;
            sduiThemedColor3 = sduiThemedColor12;
            sduiThemedColor4 = sduiThemedColor13;
            sduiThemedColor5 = sduiThemedColor14;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiTimelineColorOverride(i, sduiThemedColor, sduiThemedColor2, sduiThemedColor3, sduiThemedColor4, sduiThemedColor5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiTimelineColorOverride value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiTimelineColorOverride.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}

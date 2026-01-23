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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiDayTradeBubble.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiDayTradeBubble;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiDayTradeBubble$$serializer implements PluginHelperInterfaces<SduiDayTradeBubble> {
    public static final SduiDayTradeBubble$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiDayTradeBubble$$serializer sduiDayTradeBubble$$serializer = new SduiDayTradeBubble$$serializer();
        INSTANCE = sduiDayTradeBubble$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiDayTradeBubble", sduiDayTradeBubble$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("background_color", false);
        pluginGeneratedSerialDescriptor.addElement("border_color", false);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement("content_color", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiDayTradeBubble$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiAction2.INSTANCE);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(SduiBubbleContentTypeSerializer.INSTANCE);
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        return new KSerializer[]{nullable, sduiThemedColor$$serializer, sduiThemedColor$$serializer, nullable2, sduiThemedColor$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiDayTradeBubble deserialize(Decoding2 decoder) {
        int i;
        SduiAction sduiAction;
        SduiThemedColor sduiThemedColor;
        SduiThemedColor sduiThemedColor2;
        SduiBubbleContentType sduiBubbleContentType;
        SduiThemedColor sduiThemedColor3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        SduiAction sduiAction2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction3 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
            SduiThemedColor sduiThemedColor4 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, sduiThemedColor$$serializer, null);
            SduiThemedColor sduiThemedColor5 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, sduiThemedColor$$serializer, null);
            sduiAction = sduiAction3;
            sduiBubbleContentType = (SduiBubbleContentType) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiBubbleContentTypeSerializer.INSTANCE, null);
            sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, sduiThemedColor$$serializer, null);
            sduiThemedColor2 = sduiThemedColor5;
            sduiThemedColor = sduiThemedColor4;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            SduiThemedColor sduiThemedColor6 = null;
            SduiThemedColor sduiThemedColor7 = null;
            SduiBubbleContentType sduiBubbleContentType2 = null;
            SduiThemedColor sduiThemedColor8 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    sduiAction2 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    sduiThemedColor6 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor6);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    sduiThemedColor7 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor7);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    sduiBubbleContentType2 = (SduiBubbleContentType) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiBubbleContentTypeSerializer.INSTANCE, sduiBubbleContentType2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    sduiThemedColor8 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor8);
                    i2 |= 16;
                }
            }
            i = i2;
            sduiAction = sduiAction2;
            sduiThemedColor = sduiThemedColor6;
            sduiThemedColor2 = sduiThemedColor7;
            sduiBubbleContentType = sduiBubbleContentType2;
            sduiThemedColor3 = sduiThemedColor8;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiDayTradeBubble(i, sduiAction, sduiThemedColor, sduiThemedColor2, sduiBubbleContentType, sduiThemedColor3, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiDayTradeBubble value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiDayTradeBubble.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
